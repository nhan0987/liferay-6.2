/**
 * 
 */
package vn.dtt.gt.dk.gate.threat;

import vn.dtt.gt.dk.gate.business.BusinessUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * @author win_64
 * 
 */
public class ProcessExecuteBanKhai implements Runnable {

	Log _log = LogFactoryUtil.getLog(ProcessExecuteBanKhai.class);
	private Thread t;
	private int timeSleep = 1000;
	private String threadName;
	private BusinessUtils businessUtils = new BusinessUtils();

	public ProcessExecuteBanKhai(String name, int timeSleep) {
		threadName = name;
		this.timeSleep = timeSleep;
	}

	@Override
	public void run() {
		while(true) {
			try {
				ObjectExcute objectExcute = ThreadPassingBanKhai.listData.poll();
				if (objectExcute != null) {
					
					_log.debug("===========Executing thread============." + t.getName() + ":::Reference====" + objectExcute.getHeader().getSubject().getReference());

					// Neu la cac cang vu tich hop.
					businessUtils.nhanBanKhai(objectExcute.getHeader(), objectExcute.getXmlData(), objectExcute.getLiObjects());
				}
				Thread.sleep(timeSleep);
			} catch (Exception e) {
				_log.error(e);
			}
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
