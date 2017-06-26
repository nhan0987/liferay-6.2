package vn.dtt.gt.dk.utils.codec;

public class CheckFileKySoUrl {
	
	/*public static String getLocalPath(String urlFile, PortletRequest portletRequest){
		String url = urlFile;
		
		if(urlFile.startsWith("http") && urlFile.indexOf("DangKiemApp-portlet") > 0) {
			String portalURL = urlFile.substring(0, urlFile.indexOf("DangKiemApp-portlet"));
			url = StringUtil.replace(urlFile, portalURL + "DangKiemApp-portlet/", getURLFile(portletRequest));
		}
		
		return url;
		
		stry {
			_log.info("===PortalPort(false)===" + PortalUtil.getPortalURL(portletRequest));
			_log.info("===PortalURL===" + PortalUtil.getPortalURL(portletRequest));
			
			if (PortalUtil.getPortalPort(false) == 80){
				if (PortalUtil.getPortalURL(portletRequest).contains("kiemthudangkiem.mt.gov.vn:8002") ||
						PortalUtil.getPortalURL(portletRequest).contains("kiemthudangkiem.mt.gov.vn:8001") ||
						PortalUtil.getPortalURL(portletRequest).contains("kysodangkiem.mt.gov.vn")){
					return PortalUtil.getPortalURL(portletRequest)+"/DangKiemApp-portlet";
				}
				
				return PortalUtil.getPortalURL(portletRequest) + ":"+ PortalUtil.getPortalPort(false) + "/DangKiemApp-portlet";
			} else {
				return PortalUtil.getPortalURL(portletRequest) + "/DangKiemApp-portlet";
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return "http://dangkiem.mt.gov.vn:80/DangKiemApp-portlet";
	}
	
	public static String getURLPortalByMinh(PortletRequest portletRequest){
		try {
			_log.info("===PortalPort(false)===" + PortalUtil.getPortalURL(portletRequest));
			_log.info("===PortalURL===" + PortalUtil.getPortalURL(portletRequest));
			
			if (PortalUtil.getPortalPort(false) == 80){
				if (PortalUtil.getPortalURL(portletRequest).contains("kiemthudangkiem.mt.gov.vn:8002") ||
						PortalUtil.getPortalURL(portletRequest).contains("kiemthudangkiem.mt.gov.vn:8001") ||						
						PortalUtil.getPortalURL(portletRequest).contains("kysodangkiem.mt.gov.vn")){
					return PortalUtil.getPortalURL(portletRequest);
				}
				
				return PortalUtil.getPortalURL(portletRequest) + ":" + PortalUtil.getPortalPort(false);
			} else {
				return PortalUtil.getPortalURL(portletRequest);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return "http://dangkiem.mt.gov.vn:80";
	}
	
	public static String getURLFile(PortletRequest portletRequest){
		try {
			return portletRequest.getPortletSession().getPortletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");	
		} catch (Exception e) {
			_log.error(e);
		}
		
		return "";
	}

	private static Log _log = LogFactoryUtil.getLog(CheckFileKySoUrl.class);*/
}
