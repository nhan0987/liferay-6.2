package vn.dtt.gt.dk.portlet.timkiem;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class TimKiemAction
 */
public class TimKiemAction extends MVCPortlet {
	public void timKiemDangKiem(ActionRequest request, ActionResponse response) {
		
		String soChungChi = ParamUtil.getString(request, "soChungChi");
		String soKhung = ParamUtil.getString(request, "soKhung");
		String soDongCo = ParamUtil.getString(request, "soDongCo");
		
		response.setRenderParameter("soChungChi", soChungChi);
		response.setRenderParameter("soKhung", soKhung);
		response.setRenderParameter("soDongCo", soDongCo);
		
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
