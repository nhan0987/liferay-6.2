package vn.dtt.gt.dk.threat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ThreatSentMessage222_30 {
	private static ThreatSentMessage222_30 threadPassingMessage = null;
	private static Log _log = LogFactoryUtil.getLog(ThreatSentMessage222_30.class);
	public static ConcurrentLinkedQueue<SelectedGroupForPayment> listData = new ConcurrentLinkedQueue<SelectedGroupForPayment>();
	private static List<ProcessExecuteMessage222_30> listThrea = new ArrayList<ProcessExecuteMessage222_30>();
	private int numberProcess = 1;
	private int timeSleep = 4000;
	
	public static ThreatSentMessage222_30 init() {
		try {
            if (threadPassingMessage == null) {
            	int numberProcess = DKConfigurationManager.getIntProp("vn.gt.number.process.207.30", 1);
            	int timeSleep = DKConfigurationManager.getIntProp("vn.gt.time.sleep.process.207.30", 4000);
            	threadPassingMessage = new ThreatSentMessage222_30(numberProcess, timeSleep);
            	threadPassingMessage.startProcess();
            }
            return threadPassingMessage;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private ThreatSentMessage222_30(int numberProcess, int timeSleep) {
		this.numberProcess = numberProcess;
		this.timeSleep = timeSleep;
		_log.debug("==========Initing ThreatSentMessage207_30 with numberProcess:" + this.numberProcess + "=======timeSleep===" + this.timeSleep);
	}
	
	private void startProcess() {
		ProcessExecuteMessage222_30 processExecuteMessage = null;
		
		if (listThrea != null && listThrea.size() == 0) {
		
			for (int i = 1; i <= this.numberProcess; i++) {
				processExecuteMessage = new ProcessExecuteMessage222_30("===ProcessExecuteMessage207_30== " + i, this.timeSleep);
				processExecuteMessage.start();
				listThrea.add(processExecuteMessage);
			}
		}
	}
}
