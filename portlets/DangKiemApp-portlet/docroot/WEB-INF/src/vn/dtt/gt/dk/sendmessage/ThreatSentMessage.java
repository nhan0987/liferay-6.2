package vn.dtt.gt.dk.sendmessage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ThreatSentMessage {

	private static ThreatSentMessage threadPassingMessage = null;
	private static Log _log = LogFactoryUtil.getLog(ThreatSentMessage.class);
	public static ConcurrentLinkedQueue<AswmsgMessageQueue> sendMessageQueue = new ConcurrentLinkedQueue<AswmsgMessageQueue>();
	private static List<ProcessSendMessage> listThrea = new ArrayList<ProcessSendMessage>();
	private int numberProcess = 2;
	private int timeSleep = 900;
	
	public static ThreatSentMessage init() {
		try {
            if (threadPassingMessage == null) {
            	int numberProcess = DKConfigurationManager.getIntProp("vn.gt.number.process.sendmessage", 1);
            	int timeSleep = DKConfigurationManager.getIntProp("vn.gt.time.sleep.process.sendmessage", 900);
            	threadPassingMessage = new ThreatSentMessage(numberProcess, timeSleep);
            	threadPassingMessage.startProcess();
            }
            return threadPassingMessage;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private ThreatSentMessage(int numberProcess, int timeSleep) {
		this.numberProcess = numberProcess;
		this.timeSleep = timeSleep;
		_log.debug("==========Initing ThreatSentMessage with numberProcess:" + this.numberProcess + "=======timeSleep===" + this.timeSleep);
	}
	
	private void startProcess() {
		ProcessSendMessage processExecuteMessage = null;
		
		if (listThrea != null && listThrea.size() == 0) {
		
			for (int i = 1; i <= this.numberProcess; i++) {
				processExecuteMessage = new ProcessSendMessage("===ProcessSendMessage== " + i, this.timeSleep);
				processExecuteMessage.start();
				listThrea.add(processExecuteMessage);
			}
		}
	}
}
