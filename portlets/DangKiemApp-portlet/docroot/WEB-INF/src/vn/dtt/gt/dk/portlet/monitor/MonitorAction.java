
package vn.dtt.gt.dk.portlet.monitor;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpSession;

import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.portlet.DangKiemAction;
import vn.dtt.gt.dk.portlet.business.CallWebserviceNSWBusiness;
import vn.dtt.gt.dk.portlet.menu.MenuConfiguration;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

/**
 * Portlet implementation class MonitorAction
 */
public class MonitorAction extends DangKiemAction {
	
	private Log log = LogFactoryUtil.getLog(MonitorAction.class);
	private CallWebserviceNSWBusiness callWebservice = new CallWebserviceNSWBusiness();
	
	public void refeshMonitor(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long monitorMessageId = ParamUtil.getLong(actionRequest, "monitorMessageId");
		
		log.info("refeshMonitor---monitorMessageId---" + monitorMessageId);
		
		if (monitorMessageId > 0) {
			try {
				MonitorMessageQueue monitorMessageQueue = MonitorMessageQueueLocalServiceUtil.fetchMonitorMessageQueue(monitorMessageId);
				if (monitorMessageQueue != null) {
					monitorMessageQueue.setPriority(15);
					monitorMessageQueue.setSoLanGui(0);
					MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(monitorMessageQueue);
				}
			} catch (Exception e) {
				log.error(e);
			}
			
			//MonitorMessageQueueLocalServiceUtil.updatePriorityMessageQueue(monitorMessageId);
		}
		
		HttpSession httpSession = null;
		try {
			httpSession = PortalUtil.getHttpServletRequest(actionRequest).getSession();
		} catch (Exception es) {
		}
		
		if (httpSession != null) {
			try {
				httpSession.setAttribute(Constants.MAPHANNHOMHOSO,
					PortletPreferencesFactoryUtil.getPortletSetup(actionRequest).getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR, ""));
			} catch (Exception e) {
			}
		}
		
		actionResponse.setRenderParameter("jspPage", "/portlet/monitor/quanlyMonitor.jsp");
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void refeshKeHoachDichChuyen(ActionRequest actionRequest, ActionResponse actionResponse) {
		long keHoachChuyenDichId = ParamUtil.getLong(actionRequest, "keHoachChuyenDichId");
		
		log.info("refeshKeHoachDichChuyen---keHoachChuyenDichId---" + keHoachChuyenDichId);
		
		if (keHoachChuyenDichId > 0) {
			callWebservice.message224and26(keHoachChuyenDichId, PortalUtil.getUserId(actionRequest));
		}

		HttpSession httpSession = null;
		try {
			httpSession = PortalUtil.getHttpServletRequest(actionRequest).getSession();
		} catch (Exception es) {
		}
		
		if (httpSession != null) {
			try {
				httpSession.setAttribute(Constants.MAPHANNHOMHOSO,
					PortletPreferencesFactoryUtil.getPortletSetup(actionRequest).getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN, ""));
			} catch (Exception e) {
			}
		}
		actionResponse.setRenderParameter("jspPage", "/portlet/monitor/theo_doi_phan_hoi_results.jsp");
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
}
