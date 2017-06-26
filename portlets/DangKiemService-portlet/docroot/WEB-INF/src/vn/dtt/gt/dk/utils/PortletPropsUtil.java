package vn.dtt.gt.dk.utils;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.util.portlet.PortletProps;

public class PortletPropsUtil {
	public static String getString(String key) {
		String value = PropsUtil.get(key);
		
		if(value == null) {
			value = PortletProps.get(key);
		}
		
		return GetterUtil.getString(value);
	}
	
	public static int getInteger(String key) {
		String value = PropsUtil.get(key);
		
		if(value == null) {
			value = PortletProps.get(key);
		}
		
		return GetterUtil.getInteger(value);
	}
	
	public static boolean getBoolean(String key) {
		String value = PropsUtil.get(key);
		
		if(value == null) {
			value = PortletProps.get(key);
		}
		
		return GetterUtil.getBoolean(value);
	}
}
