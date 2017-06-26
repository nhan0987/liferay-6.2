/**
 * 
 */

package vn.dtt.gt.dk.portlet.hoso;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

/**
 * @author win_64
 *
 */
public class QuanLyHoSoConfiguration implements ConfigurationAction {
	
	public static String LOAD_DATABASE_MOTCUA_TRUE = "TRUE";
	public static String LOAD_DATABASE_MOTCUA_FALSE = "FALSE";
	Log _log = LogFactoryUtil.getLog(QuanLyHoSoConfiguration.class);
	
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {
		
		PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest);
		String valueJsp = ParamUtil.getString(actionRequest, Constants.LOAD_DATABASE_MOTCUA, "");
		_log.info("=====valueJsp=====" + valueJsp);
		
		prefs.setValue(Constants.LOAD_DATABASE_MOTCUA, valueJsp);
		prefs.store();
	}
	
	public String render(PortletConfig arg0, RenderRequest arg1, RenderResponse arg2)
		throws Exception {
		// TODO Auto-generated method stub
		return "/portlet/quanlyhs/config.jsp";
	}
}
