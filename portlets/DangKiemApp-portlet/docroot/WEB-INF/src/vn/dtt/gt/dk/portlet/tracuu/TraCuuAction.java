
package vn.dtt.gt.dk.portlet.tracuu;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;

import vn.dtt.gt.dk.portlet.DangKiemAction;

/**
 * Portlet implementation class TraCuuAction
 */
public class TraCuuAction extends DangKiemAction {
	
	public TraCuuAction() {
	}
	
	public void searchTraCuu(ActionRequest resourceRequest, ActionResponse httpReq) {
		String maSoHoSo = ParamUtil.getString(resourceRequest, "maSoHoSo").trim();
		
		httpReq.setRenderParameter("maSoHoSo", maSoHoSo);
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
