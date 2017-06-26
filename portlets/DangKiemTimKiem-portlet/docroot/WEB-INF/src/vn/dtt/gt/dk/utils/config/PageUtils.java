package vn.dtt.gt.dk.utils.config;

import javax.servlet.http.HttpServletRequest;

import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.portal.util.PortalUtil;

public class PageUtils {
	public static Long getNguoiSuDungId(HttpServletRequest request){
		String url= PortalUtil.getCurrentURL(request);
		if(url !=null){
			String p[] = url.split("/");
			if(p != null && p.length>=3){
				try{
					return ConvertUtil.convertToLong(p[2].replaceAll(DKConfigurationManager.getStrProp("vn.dtt.ipms.page", ""),""));
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		return 0L;
	}
}
