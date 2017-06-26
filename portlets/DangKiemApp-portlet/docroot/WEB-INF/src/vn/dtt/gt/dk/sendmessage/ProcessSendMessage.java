package vn.dtt.gt.dk.sendmessage;

import java.util.List;

import org.tempuri.IMTService;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.message.FunctionType;
import vn.dtt.gt.dk.message.MessageKey;
import vn.dtt.gt.dk.message.MessageType;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.message.dao.AswmsgMessageLogDao;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.portlet.business.FunctionNghiepVu;
import vn.dtt.gt.dk.utils.TrangThaiHoSo;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.webservice.client.CallWs2HaiQuan;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;

public class ProcessSendMessage implements Runnable {

	private static Log _log = LogFactoryUtil.getLog(ProcessSendMessage.class);
	private Thread t;
	private int timeSleep = 900;
	private String threadName;
	FunctionNghiepVu functionNghiepVu = new FunctionNghiepVu();	

	public ProcessSendMessage(String name, int timeSleep) {
		this.threadName = name;
		this.timeSleep = timeSleep;
	}

	@Override
	public void run() {
		
		int check = GetterUtil.getInteger(PropsUtil.get("vn.gt.gateway"));//DKConfigurationManager.getIntProp("vn.gt.coguihaykhong", 1);
		_log.info("===vn.gt.gateway==="+GetterUtil.getInteger(PropsUtil.get("vn.gt.gateway")));
		if (check > 0) {
			while (true) {
				try {
					try {
						Thread.sleep(timeSleep);
					} catch (Exception e1) {
					}
					Header headerRequest = null;
					String xml = "";
					AswmsgMessageQueue messageQueue = ThreatSentMessage.sendMessageQueue.poll();
					sendMessage(headerRequest, xml, messageQueue);
				} catch (Exception e) {
					_log.error(e);
				}
			}
		}
	}

	private void sendMessage(Header headerRequest, String xml,
			AswmsgMessageQueue messageQueue) {
		if (messageQueue != null) {
			int soLanGui = messageQueue.getSoLanGui();
			long id = messageQueue.getId();
			try {
//				messageQueue.setPriority(messageQueue.getPriority()-MessgaePriorityLevels.COUNT);
//				AswmsgMessageQueueLocalServiceUtil.updateAswmsgMessageQueue(messageQueue);
//					//xml = messageQueue.getAllContent();

					//_log.info("  xml   " + xml);
					IMTService imtService = CallWs2HaiQuan.getIMTSercice();
//					System.out
//							.println("=====Du lieu gui di HQMC====SelectedVehicleListForPayment====="
//									+ messageQueue.getAllContent());
					String data = vn.dtt.gt.dk.message.MessageUtils.replaceXML(messageQueue.getAllContent());
					headerRequest = MessageUtils
							.readXmlMessageHeader(data);
					AswmsgMessageLogDao.insertMessageLog(
							headerRequest, messageQueue.getAllContent(),
							MessageKey.HTTH_BGT_TO_NSW,
							TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,
							headerRequest.getReference().getMessageId());
					
//					_log.info("messageQueue.getAllContent()  "+messageQueue.getAllContent());
					String dulieuXml =null;
					int soLanGoi = messageQueue.getSoLanGui();
					if(getMod(soLanGoi)==1){
//					if(soLanGoi>1){
						dulieuXml = imtService.receive(messageQueue.getAllContent());
					}else{
						dulieuXml = imtService.receive2(messageQueue.getAllContent());
					}
					
					if(dulieuXml!=null&&dulieuXml.length()>0){
						Header headerResponse = MessageUtils
								.readXmlMessageHeader(dulieuXml);
						long phieuXuLyPhuId = messageQueue.getPhieuXuLyPhuId();
						String messageId = headerResponse.getReference().getMessageId();
						String transactionId = messageQueue.getDocumentType();
						AswmsgMessageLogDao.insertMessageLog(
								headerResponse, dulieuXml,
								MessageKey.NSW_TO_HTTT_BGT,
								TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,
								headerResponse.getReference().getMessageId());
						if((FunctionType.FUNCTION_XAC_NHAN_TU_CHOI_HO_SO.compareToIgnoreCase(headerResponse.getSubject().getFunction()) == 0)
							&& 	(headerResponse.getSubject().getType() == MessageType.TB_NOP_PHI_LE_PHI_DANG_KIEM 
								|| headerResponse.getSubject().getType() == MessageType.TB_NOP_PHI_LE_PHI_DC_XDD) ){
							// Do nothing. Khong xoa message trong queue
						} else {
							AswmsgMessageQueueLocalServiceUtil
							.deleteAswmsgMessageQueue(messageQueue
								.getId());
							if(FunctionType.FUNCTION_XAC_NHAN_TU_CHOI_HO_SO.compareToIgnoreCase(headerResponse.getSubject().getFunction()) == 0) {
		
								functionNghiepVu.roleBack(headerRequest,FunctionType.FUNCTION_XAC_NHAN_TU_CHOI_HO_SO);
							}						
							cacMessageDacBiet(headerRequest, phieuXuLyPhuId,messageId,transactionId);
						}							
						
					}else{
						updateWithException(headerRequest, xml, id,soLanGui, "Khong co du lieu nhan ve");		
					}
				
			} catch (Exception e) {
				_log.error(e);
				// mr.The Anh Fix bug (nothing)
				updateWithException(headerRequest, xml, id,soLanGui, e.toString());
			}
		}
	}

	private void cacMessageDacBiet(Header headerRequest, long phieuXuLyPhuId,String messageId,String transactionId) throws SystemException {
		if(headerRequest!=null&&headerRequest.getSubject().getFunction()!=null&&headerRequest.getSubject().getFunction().length()>0){
			if (phieuXuLyPhuId>0&&headerRequest.getSubject().getType() == MessageType.TB_CHON_PHUONG_TIEN_DE_NOP_PHI_LE_PHI
					&& FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(headerRequest.getSubject()
							.getFunction()) == 0) {
				
//				List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayPhieuXuLyPhuId(phieuXuLyPhuId);
				List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayMessageId(messageId);
				if(monitorMessageQueues!=null&&monitorMessageQueues.size()>0){
					for (int i = 0; i < monitorMessageQueues.size(); i++) {
						MonitorMessageQueue monitorMessageQueue = monitorMessageQueues.get(i);
						monitorMessageQueue.setPriority(15);
						MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(monitorMessageQueue);
					}
					
				}
			} else if (phieuXuLyPhuId>0&&headerRequest.getSubject().getType() == MessageType.CHON_NHOM_DC_XD_NOP_PHI
					&& FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(headerRequest.getSubject()
							.getFunction()) == 0) {								
//				List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayPhieuXuLyPhuId(phieuXuLyPhuId);
				List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayMessageId(messageId);
				if(monitorMessageQueues!=null&&monitorMessageQueues.size()>0){
					for (int i = 0; i < monitorMessageQueues.size(); i++) {
						MonitorMessageQueue monitorMessageQueue = monitorMessageQueues.get(i);
						monitorMessageQueue.setPriority(15);
						MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(monitorMessageQueue);
					}
				}
			}else if (headerRequest.getSubject().getType() == MessageType.THONG_BAO_HOAN_KIEM_TRA
					&& FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(headerRequest.getSubject()
							.getFunction()) == 0) {								
				List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayMessageId(messageId);
				if(monitorMessageQueues!=null&&monitorMessageQueues.size()>0){
					MonitorMessageQueue monitorMessageQueue = monitorMessageQueues.get(0);
					monitorMessageQueue.setPriority(15);
					MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(monitorMessageQueue);
				}
			}else if (headerRequest.getSubject().getType() == MessageType.HO_SO
					&& FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(headerRequest.getSubject()
							.getFunction()) == 0) {								
				List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayMessageId(messageId);
				if(monitorMessageQueues!=null&&monitorMessageQueues.size()>0){
					MonitorMessageQueue monitorMessageQueue = monitorMessageQueues.get(0);
					monitorMessageQueue.setPriority(15);
					MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(monitorMessageQueue);
				}
			}else if (headerRequest.getSubject().getType() == MessageType.TB_TINH_TRANG_NOP_PHI_LE_PHI
					&& FunctionType.FUNCTION_XAC_NHAN_HOAN_THANH.compareToIgnoreCase(headerRequest.getSubject()
							.getFunction()) == 0&&transactionId!=null&&transactionId.length()>0) {						
				
				List<MonitorMessageQueue> monitorMessageQueues =  MonitorMessageQueueLocalServiceUtil.findByLayMessageId(transactionId);
				if(monitorMessageQueues!=null&&monitorMessageQueues.size()>0){
					for(int i=0;i<monitorMessageQueues.size();i++){
						MonitorMessageQueue monitorMessageQueue = monitorMessageQueues.get(i);
						monitorMessageQueue.setPriority(15);
						MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(monitorMessageQueue);
					}
				}
			}
			 
		}
	}

	private void updateWithException(Header headerRequest, String xml, long id,
			int soLanGui, String exceptionString) {
		int check = DKConfigurationManager.getIntProp("solangui_message", 5);
		int soLanGuiSau = soLanGui +1;
		if(soLanGui<check){
			try {
				MonitorMessageQueue monitorMessageQueue =  MonitorMessageQueueLocalServiceUtil.fetchMonitorMessageQueue(id);
				if(monitorMessageQueue!=null){
					monitorMessageQueue.setPriority(15);
					monitorMessageQueue.setSoLanGui(soLanGuiSau);
					MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(monitorMessageQueue);
				}

			} catch (SystemException e) {
				_log.error(e);
			}
		}
		if(headerRequest!=null){
			AswmsgMessageLogDao
				.insertMessageLogWhenException(
						headerRequest,
						xml,
						MessageKey.HTTH_BGT_TO_NSW_ERROR,
						TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,
						headerRequest.getReference().getMessageId(),
						exceptionString,soLanGui);
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
			_log.debug("===Starting-------------- " + t.getName());
		}
	}
	
	private int getMod(int soLanGui){
		return soLanGui%2;
	}
}
