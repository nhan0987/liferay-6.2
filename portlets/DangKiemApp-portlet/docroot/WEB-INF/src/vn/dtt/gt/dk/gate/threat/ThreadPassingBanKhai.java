/**
 * 
 */
package vn.dtt.gt.dk.gate.threat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * @author win_64
 *
 */
public class ThreadPassingBanKhai {

	private static ThreadPassingBanKhai threadPassingMessage = null;
	private static Log _log = LogFactoryUtil.getLog(ThreadPassingBanKhai.class);
	public static ConcurrentLinkedQueue<ObjectExcute> listData = new ConcurrentLinkedQueue<ObjectExcute>();
	private int numberProcess = 5;
	private int timeSleep = 1000;
	private static List<ProcessExecuteBanKhai> listThrea = new ArrayList<ProcessExecuteBanKhai>();
	
	public static ThreadPassingBanKhai init() {
		try {
            if (threadPassingMessage == null) {
            	int numberProcess = DKConfigurationManager.getIntProp("vn.gt.number.process.ban.khai", 5);
            	int timeSleep = DKConfigurationManager.getIntProp("vn.gt.time.sleep.process.ban.khai", 4000);
            	threadPassingMessage = new ThreadPassingBanKhai(numberProcess, timeSleep);
            	threadPassingMessage.startProcess();
            }
            return threadPassingMessage;
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public void add(ObjectExcute excute) {
		listData.add(excute);
	}

	private ThreadPassingBanKhai(int numberProcess, int timeSleep) {
		this.numberProcess = numberProcess;
		this.timeSleep = timeSleep;
		_log.debug("==========Initing ThreadPassingBanKhai with numberProcess:" + this.numberProcess + "=======timeSleep===" + this.timeSleep);
	}

	private void startProcess() {
		ProcessExecuteBanKhai processExecuteMessage = null;

		if (listThrea != null && listThrea.size() == 0) {

			for (int i = 1; i <= this.numberProcess; i++) {
				processExecuteMessage = new ProcessExecuteBanKhai("=ThreadPassingBanKhai===Process " + i, this.timeSleep);
				processExecuteMessage.start();
				listThrea.add(processExecuteMessage);
			}
		}
	}
}
