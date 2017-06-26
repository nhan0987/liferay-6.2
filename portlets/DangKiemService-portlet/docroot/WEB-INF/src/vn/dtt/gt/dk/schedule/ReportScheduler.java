package vn.dtt.gt.dk.schedule;

import vn.dtt.gt.dk.schedule.util.BusinessUtil;
import vn.dtt.gt.dk.utils.PortletPropsUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class ReportScheduler implements MessageListener {

	public void receive(Message arg0) throws MessageListenerException {
		boolean apiDVC =  PortletPropsUtil.getBoolean("api.dvc.statistics");
		
		if(apiDVC) {
			_log.info("======ReportScheduler=====1.doStatistics=====");
			
			BusinessUtil.doStatistics();
			
			_log.info("======ReportScheduler=====1.pushAPI=====");
			
			BusinessUtil.doPushAPI();
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(ReportScheduler.class);
}
