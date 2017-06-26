package vn.dtt.gt.dk.threat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ThreatSentMessage207_30 {
	private static ThreatSentMessage207_30 threadPassingMessage = null;
	private static Log _log = LogFactoryUtil.getLog(ThreatSentMessage207_30.class);
	public static ConcurrentLinkedQueue<SelectedVehicleListForPayment> listData = new ConcurrentLinkedQueue<SelectedVehicleListForPayment>();
	private static List<ProcessExecuteMessage207_30> listThrea = new ArrayList<ProcessExecuteMessage207_30>();
	private int numberProcess = 1;
	private int timeSleep = 2000;
	
	public static ThreatSentMessage207_30 init() {
		try {
            if (threadPassingMessage == null) {
            	int numberProcess = DKConfigurationManager.getIntProp("vn.gt.number.process.207.30", 1);
            	int timeSleep = DKConfigurationManager.getIntProp("vn.gt.time.sleep.process.207.30", 65000);
            	threadPassingMessage = new ThreatSentMessage207_30(numberProcess, timeSleep);
            	threadPassingMessage.startProcess();
            }
            return threadPassingMessage;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private ThreatSentMessage207_30(int numberProcess, int timeSleep) {
		this.numberProcess = numberProcess;
		this.timeSleep = timeSleep;
		_log.debug("==========Initing ThreatSentMessage207_30 with numberProcess:" + this.numberProcess + "=======timeSleep===" + this.timeSleep);
	}
	
	private void startProcess() {
		ProcessExecuteMessage207_30 processExecuteMessage = null;
		
		if (listThrea != null && listThrea.size() == 0) {
		
			for (int i = 1; i <= this.numberProcess; i++) {
				processExecuteMessage = new ProcessExecuteMessage207_30("===ProcessExecuteMessage207_30== " + i, this.timeSleep);
				processExecuteMessage.start();
				listThrea.add(processExecuteMessage);
			}
		}
	}
}
