
package vn.dtt.gt.dk.utils;

import java.util.List;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.User;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

public class OrganizationUtils {
	
	private static Log _log = LogFactoryUtil.getLog(OrganizationUtils.class);
	
	/**
	 * Lay to chuc cua user dang nhap
	 * 
	 * @param userName
	 * @return
	 */
	public static Organization getOrgOfUser(long userId) {
		Organization org = null;
		try {
			List<Organization> organizations = OrganizationLocalServiceUtil.getUserOrganizations(userId);
			if (organizations.size() != 0) {
				org = organizations.get(0);
			}
		} catch (Exception e) {
		}
		return org;
	}
	
	public static String getUserNameLogIn(ActionRequest request) {
		try {
			long userId = PortalUtil.getUserId(request);
			User user = UserLocalServiceUtil.getUser(userId);
			return user.getFullName();
		} catch (Exception e) {
			_log.error(e);
		}
		return "";
		
	}
}
