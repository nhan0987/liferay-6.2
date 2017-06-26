package vn.dtt.gt.dk.api.util;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import vn.dtt.gt.dk.utils.PortletPropsKeys;
import vn.dtt.gt.dk.utils.PortletPropsUtil;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;

public class ApiUtils {
	public static ServiceContext getServiceContext(User user) {
		
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		
		try {
			if(serviceContext == null) {
				serviceContext = new ServiceContext();
				
				if(user != null) {
					serviceContext.setUserId(user.getUserId());
					serviceContext.setCompanyId(user.getCompanyId());
				}
			}
		} catch(Exception e) {
			_log.error(e);
		}
		
		serviceContext.setAddGroupPermissions(true);
		serviceContext.setAddGuestPermissions(true);
		
		return serviceContext;
	}

	public static String getFileFullURL(long companyId, long fileEntryId, ServiceContext serviceContext) {
		
		String fileFullURL = StringPool.BLANK;
		
		if(fileEntryId > 0) {
			try {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);
		
				String portalURL = PortletPropsUtil.getString(PortletPropsKeys.API_DOMAIN_FILE);
				
				if(Validator.isNull(portalURL) && serviceContext != null) {
					portalURL = serviceContext.getPortalURL();
					
					if(Validator.isNull(portalURL) && companyId > 0) {
						Company company = CompanyLocalServiceUtil.getCompany(companyId);
						
						portalURL = PortalUtil.getPortalURL(
							company.getVirtualHostname(), PortalUtil.getPortalPort(false), false);
					}
				}
				
				fileFullURL = portalURL + DLUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), null, "");
			} catch(Exception e) {
				//_log.error(e);
			}
		}
		
		return fileFullURL;
	}
	
	public static String quoteJSON(String string) {
		if (string == null || string.length() == 0) {
			return "\"\"";
		}

		char c = 0;
		int i;
		int len = string.length();
		StringBuilder sb = new StringBuilder(len + 4);
		String t;

		//sb.append('"');
		for (i = 0; i < len; i += 1) {
			c = string.charAt(i);
			switch (c) {
			case '\\':
			//case '"':
				sb.append('\\');
				sb.append(c);
				break;
			case '/':
				sb.append('\\');
				sb.append(c);
				break;
			case '\b':
				sb.append("\\b");
				break;
			case '\t':
				sb.append("\\t");
				break;
			case '\n':
				sb.append("\\n");
				break;
			case '\f':
				sb.append("\\f");
				break;
			case '\r':
				sb.append("\\r");
				break;
			default:
				if (c < ' ') {
					t = "000" + Integer.toHexString(c);
					sb.append("\\u" + t.substring(t.length() - 4));
				} else {
					sb.append(c);
				}
			}
		}
		//sb.append('"');
		return sb.toString();
	}
	
	public static String getRamdomMessage() {
		return (new Date()).getTime() + "";
	}
	
	public static String apiDateToMsgDate(String strDate) {
		
		Date apiDate = new Date();
		
		if(Validator.isNotNull(strDate)) {
			apiDate.setTime(GetterUtil.getLong(strDate));
		}
		
		String msgDate = FormatData.parseDateToTring(apiDate);
		
		return msgDate;
	}
	
	public static Date apiDateToDate(String strDate) {
		
		Date apiDate = new Date();
		
		if(Validator.isNotNull(strDate)) {
			apiDate.setTime(GetterUtil.getLong(strDate));
		}
		
		return apiDate;
	}
	
	public static <T> String convertObjectToXml(T t) throws Exception {
		
		String toXml = "";
		
		if (t != null) {
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			JAXBContext jc = JAXBContext.newInstance(t.getClass());
			
			// create an Marshaller
			Marshaller marshaller = jc.createMarshaller();
			//Loai bo formatted theo dinh dang indent
			//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(t, output);
			toXml = new String(output.toByteArray(), "UTF-8");
		}
		
		return toXml;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(ApiUtils.class);
}
