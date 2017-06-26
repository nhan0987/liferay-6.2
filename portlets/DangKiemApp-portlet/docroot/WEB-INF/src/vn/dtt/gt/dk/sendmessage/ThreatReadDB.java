package vn.dtt.gt.dk.sendmessage;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ThreatReadDB {

	private static ThreatReadDB threatReadDB = null;
	private static Log _log = LogFactoryUtil.getLog(ThreatSentMessage.class);	
	private static List<ProcessReadDB> listThrea = new ArrayList<ProcessReadDB>();
	private int numberProcess = 1;
	private int timeSleep = 9000;
	
	public static ThreatReadDB init() {
		try {
            if (threatReadDB == null) {
            	int numberProcess = DKConfigurationManager.getIntProp("vn.gt.count.processreaddb", 1);
            	int timeSleep = DKConfigurationManager.getIntProp("vn.gt.time.sleep.process.readerdb", 9000);
            	threatReadDB = new ThreatReadDB(numberProcess, timeSleep);
            	threatReadDB.startProcess();
            }
            return threatReadDB;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private ThreatReadDB(int numberProcess, int timeSleep) {
		this.numberProcess = numberProcess;
		this.timeSleep = timeSleep;
		_log.debug("==========Initing ThreatSentMessage with numberProcess:" + this.numberProcess + "=======timeSleep===" + this.timeSleep);
	}
	
	private void startProcess() {
		ProcessReadDB processReadDb = null;
		
		if (listThrea != null && listThrea.size() == 0) {
		
			for (int i = 1; i <= this.numberProcess; i++) {
				processReadDb = new ProcessReadDB("===ProcessReadDB== " + i, this.timeSleep);
				processReadDb.start();
				listThrea.add(processReadDb);
			}
		}
	}
}
