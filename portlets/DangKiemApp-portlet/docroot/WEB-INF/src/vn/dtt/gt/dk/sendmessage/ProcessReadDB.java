package vn.dtt.gt.dk.sendmessage;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.message.MessageKey;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.message.dao.AswmsgMessageLogDao;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.utils.TrangThaiHoSo;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.webservice.client.SOAPClientSAAJ;
import vn.dtt.gt.dk.portlet.business.NghiepVuBoSungBusiness;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.util.portlet.PortletProps;

public class ProcessReadDB  implements Runnable {

	private static Log _log = LogFactoryUtil.getLog(ProcessReadDB.class);
	private Thread t;
	private int timeSleep = 900;
	private String threadName;
	NghiepVuBoSungBusiness NghiepVu  = new NghiepVuBoSungBusiness();

	public ProcessReadDB(String name, int timeSleep) {
		this.threadName = name;
		this.timeSleep = timeSleep;
	}

	@Override
	public void run() {
		Header headerRequest = null;
//		String xml = "";
		int count = DKConfigurationManager.getIntProp(
				"vn.gt.count.sendmessage", 20);
		int check = GetterUtil.getInteger(PropsUtil.get("vn.gt.gateway"));//DKConfigurationManager.getIntProp("vn.gt.coguihaykhong", 1);
		_log.info("===vn.gt.gateway==="+GetterUtil.getInteger(PropsUtil.get("vn.gt.gateway")));
		if(check>0){
			while (true) {
				int size = ThreatSentMessage.sendMessageQueue.size();
				if (size==0) {
				try {
//						_log.info("True");
						List<AswmsgMessageQueue> aswmsgMessageQueues = AswmsgMessageQueueLocalServiceUtil
								.getListMessage2Queue(count);
						//SONVH bosung 30/10/2016
						if(aswmsgMessageQueues==null || aswmsgMessageQueues.size() == 0)
						{
							_log.info("---------Thuc hien dong bo du lieu tra cuu---------NghiepVuBoSungBusiness.DongboMT()---------");
							NghiepVu.DongboMT();							
						}
						
						if(aswmsgMessageQueues!=null&&aswmsgMessageQueues.size()>0)
						{
							int sizeAswmsgMessageQueue = aswmsgMessageQueues.size();
							_log.info("sizeAswmsgMessageQueue  "+sizeAswmsgMessageQueue);
//							Header headerRequest = null;
							for (int i = 0; i < sizeAswmsgMessageQueue; i++) {
								AswmsgMessageQueue messageQueue = aswmsgMessageQueues.get(i);
								int priority=messageQueue.getPriority()-MessgaePriorityLevels.COUNT;
//								String data = vn.dtt.gt.dk.message.MessageUtils.replaceXML(messageQueue.getAllContent());
//								headerRequest = MessageUtils.readXmlMessageHeader(data);
								long id = messageQueue.getId();
//								_log.info("sizeAswmsgMessageQueue  "+id);
//								int soLanGui = messageQueue.getSoLanGui();
								AswmsgMessageQueueLocalServiceUtil.updatePriorityAswmsgMessageQueue(priority, id);
								
//								sendMessage(headerRequest, data,	id,soLanGui);
								
							}
						}
						ThreatSentMessage.sendMessageQueue.addAll(aswmsgMessageQueues);
						Thread.sleep(timeSleep);				
						
					} catch (Exception e) {
						_log.error(e);
					}
				}
			}
		}
	}

	private void sendMessage(Header headerRequest, String xml,long id,int soLanGui) {
		_log.info("sendMessage1");
		if (xml != null && xml.length() >0 && id > 0) {
			
			try {
//				messageQueue.setPriority(messageQueue.getPriority()-MessgaePriorityLevels.COUNT);
//				AswmsgMessageQueueLocalServiceUtil.updateAswmsgMessageQueue(messageQueue);
//					//xml = messageQueue.getAllContent();

					//_log.info("  xml   " + xml);
//					IMTService imtService = CallWs2HaiQuan
//							.getIMTSercice();
//					System.out
//							.println("=====Du lieu gui di HQMC====SelectedVehicleListForPayment====="
//									+ xml);
					String data = vn.dtt.gt.dk.message.MessageUtils.replaceXML(xml);
//					headerRequest = MessageUtils
//							.readXmlMessageHeader(data);
					AswmsgMessageLogDao.insertMessageLog(
							headerRequest, xml,
							MessageKey.HTTH_BGT_TO_NSW,
							TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,
							headerRequest.getReference().getMessageId());
					String dulieuXml = SOAPClientSAAJ.callWebservice(data);
					_log.info("sendMessage2 "+dulieuXml);
//					String dulieuXml = imtService.receive(xml);
//					String dulieuXml = imtService.receive(data);
					//_log.info("sendMessage3");
//					System.out
//							.println("=======Du lieu NHAN==HQMC==day =====SelectedVehicleListForPayment====="
//									+ dulieuXml);
					if(dulieuXml!=null&&dulieuXml.length()>0){
						Header headerResponse = MessageUtils
								.readXmlMessageHeader(dulieuXml);
//						if(headerResponse!=null&&headerResponse.getSubject().getFunction()!=null&&headerResponse.getSubject().getFunction().equals( MessageType.HO_SO)){
						if(headerResponse!=null&&headerResponse.getSubject().getFunction()!=null&&headerResponse.getSubject().getFunction().length()>0){
							AswmsgMessageLogDao.insertMessageLog(
									headerResponse, dulieuXml,
									MessageKey.NSW_TO_HTTT_BGT,
									TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,
									headerResponse.getReference().getMessageId());
							
							AswmsgMessageQueueLocalServiceUtil
									.deleteAswmsgMessageQueue(id);
						}else{
							updateWithException(headerRequest, xml, id, soLanGui, " gia tri tra ve tu Hai Quan null");
						}
					}
				
			} catch (Exception e) {
				_log.error(e);
				// mr.The Anh Fix bug (nothing)
				updateWithException(headerRequest, xml, id, soLanGui, e.toString());
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
}
