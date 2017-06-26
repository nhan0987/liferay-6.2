package vn.dtt.gt.dk.threat;

import org.tempuri.IMTService;

import vn.dtt.gt.dk.message.MessageKey;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.message.dao.AswmsgMessageLogDao;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment;
import vn.dtt.gt.dk.portlet.business.NghiepVuBusiness;
import vn.dtt.gt.dk.utils.TrangThaiHoSo;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.webservice.client.CallWs2HaiQuan;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ProcessExecuteMessage222_30  implements Runnable {

	private static Log _log = LogFactoryUtil.getLog(ProcessExecuteMessage222_30.class);
	private Thread t;
	private int timeSleep = 2000;
	private String threadName;
	NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();

	public ProcessExecuteMessage222_30(String name, int timeSleep) {
		this.threadName = name;
		this.timeSleep = timeSleep;
	}

	@Override
	public void run() {
		while(true) {
			try {
				SelectedGroupForPayment selectedGroupForPayment = ThreatSentMessage222_30.listData.poll();
				try {
					Thread.sleep(timeSleep);
				} catch (Exception e1) {
				}

				if (selectedGroupForPayment != null) {
					_log.debug("===========Executing thread========================." + t.getName() + ":::Data====" + selectedGroupForPayment);
					createMessage223(selectedGroupForPayment);
				}
				Thread.sleep(timeSleep);
				
				
				
			} catch (Exception e) {
				_log.error(e);
			}
		}
	}

	private void createMessage223(
			SelectedGroupForPayment selectedGroupForPayment) {
		Header headerRequest =null;
		String xml=null;
		try {
			 xml = nghiepVuBusiness.thongBaoNopPhiChoDCXD(selectedGroupForPayment, 0, Constants.KHAI_BAO_TRUC_TUYEN_THONG_BAO_NOP_PHI_LE_PHI);

			//_log.info("  xml   "+xml);
			IMTService imtService = CallWs2HaiQuan.getIMTSercice();				
			_log.debug("=====Du lieu gui di HQMC====SelectedVehicleListForPayment=====" + xml);
			_log.info("=====Du lieu gui di HQMC====SelectedVehicleListForPayment=====" + xml);
			headerRequest = MessageUtils.readXmlMessageHeader(xml);
			AswmsgMessageLogDao.insertMessageLog(headerRequest, xml, MessageKey.HTTH_BGT_TO_NSW,
					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, headerRequest.getReference().getMessageId());
			String dulieuXml = imtService.receive(xml);
//						_log.debug("=======Du lieu NHAN==HQMC==day =====SelectedVehicleListForPayment=====" + dulieuXml);
//						_log.info("=======Du lieu NHAN==HQMC==day =====SelectedVehicleListForPayment=====" + dulieuXml);

			Header headerResponse = MessageUtils.readXmlMessageHeader(dulieuXml);
			AswmsgMessageLogDao.insertMessageLog(headerResponse, dulieuXml, MessageKey.NSW_TO_HTTT_BGT,
					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, headerResponse.getReference().getMessageId());
		} catch (Exception e) {
			AswmsgMessageLogDao.insertMessageLogWhenException(headerRequest, xml, MessageKey.HTTH_BGT_TO_NSW_ERROR,
					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP,  headerRequest.getReference().getMessageId(), e.toString(),1);
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
