package vn.dtt.gt.dk.utils;

import vn.dtt.gt.dk.nsw.model.UserInformation;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class CheckUserLogin {
	
	private static Log _log = LogFactoryUtil.getLog(CheckUserLogin.class);

	public UserInformation check(String email, String passs) {
		UserInformation userInformation = null;
		try {
			
			long companyId = DKConfigurationManager.getLongProp(
					"companyid", 10154);
			long check = UserLocalServiceUtil.authenticateForBasic(companyId,
					"emailAddress", email, passs);
			if (check > 0){
				User user = UserLocalServiceUtil.fetchUserByEmailAddress(companyId, email);
				userInformation = new UserInformation();
				userInformation.setEmail(email);
				userInformation.setPassword(passs);
				userInformation.setUserId(user.getUserId()+"");
				userInformation.setUserName(user.getFullName());
				return userInformation;
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return userInformation;

	}
}
