package vn.dtt.gt.dk.facade;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.gate.business.BusinessUtils;


public class MessageAndResponseImpl implements IMessageAndResponse {
	
	private static Log _log = LogFactoryUtil.getLog(MessageAndResponseImpl.class);
	
	public MessageAndResponseImpl() {
	}
	
	@Override
	public String sendAndGetMessage(String requestMessage) {
		try {
//			_log.info("==MessageAndResponseImpl===Thong tin nhan tu HQMC===" + requestMessage);
			BusinessUtils businessUtils = new BusinessUtils();
			
			String xmlReturn = businessUtils.receiveMessage(requestMessage);
//			_log.info("==MessageAndResponseImpl===Du lieu phan hoi di HQMC=====");
//			_log.debug(xmlReturn);
//			
			return xmlReturn;
		} catch (Exception e) {
			_log.error(e);
		}
//		_log.debug("=====Truyen sai xml ne=====" + requestMessage);
		return "Can not parse xml";
	}
	
	public String CheckAvailable() {
		
		try {
			_log.info("==MessageAndResponseImpl===Call Echo Service===" + "CONNECTED" );
			String echoValue = "ok";
			return echoValue;
		} catch (Exception e) {
			_log.error(e);
		}
		return "ERROR:DISCONNECTED";
	}
	
}
