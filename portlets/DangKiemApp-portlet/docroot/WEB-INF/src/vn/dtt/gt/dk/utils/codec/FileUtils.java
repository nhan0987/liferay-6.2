/**
 * 
 */
package vn.dtt.gt.dk.utils.codec;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

import vn.dtt.gt.dk.utils.document.DocumentUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;


/**
 * @author binhnt
 *
 */
public class FileUtils {
	private static Log _log = LogFactoryUtil.getLog(FileUtils.class);
	
	public static String encodeBase64(byte[] data) {
		byte[] encoded = Base64.encodeBase64(data);
		String encodedString = new String(encoded);
		
		return encodedString;
		
	}
	
	public static byte[] decodeBase64(String data) {
		byte[] encoded = Base64.encodeBase64(data.getBytes());
		return encoded;
	}
	
	public static byte[] decodeBase64(byte[] data) {
		byte[] encoded = Base64.encodeBase64(data);
		return encoded;
	}
	
	public static String getBase64FileContent(String urlFile){
		InputStream inputStream = null;
		
		try {
			inputStream = new URL(urlFile).openConnection().getInputStream();
		} catch (IOException e) {
			_log.error(e);
		}
		
		byte[] data1 = DocumentUtils.getByteFromInputStream(inputStream);
		byte[] encoded = Base64.encodeBase64(data1);
		String encodedString = new String(encoded);
		
		return encodedString;
	}
	public static String getBase64FileContent1(long fileEnTryId){
		String encodedString = "";
		InputStream inputStream = getInputStreamByFileEntryId(fileEnTryId);
		
		if (inputStream != null) {
			byte[] data1 = DocumentUtils.getByteFromInputStream(inputStream);
			if (data1 != null && data1.length > 0) {
				byte[] encoded = Base64.encodeBase64(data1);
				encodedString = new String(encoded);
			}
		}
		
		return encodedString;
	}

	public static InputStream getInputStreamByFileEntryId(long fileEnTryId) {
		InputStream inputStream = null;

		try {
			/*long userId = DKConfigurationManager.getLongProp("id_admin", 10198);
			User user = UserLocalServiceUtil.getUserById(userId);

			PermissionThreadLocal
					.setPermissionChecker(PermissionCheckerFactoryUtil.create(
							user, true));*/
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEnTryId);

			inputStream = fileEntry.getContentStream();
		} catch (Exception e) {
			_log.error(e);
		}

		return inputStream;
	}
	
	public static String getNameByFileEntryId(long fileEnTryId) {
		String name = "";

		try {
			/*long userId = DKConfigurationManager.getLongProp("id_admin", 10198);
			User user = UserLocalServiceUtil.getUserById(userId);

			PermissionThreadLocal
					.setPermissionChecker(PermissionCheckerFactoryUtil.create(
							user, true));*/
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEnTryId);
			if (fileEntry != null) {
				name = fileEntry.getTitle();
			}
		} catch (Exception e) {
			_log.error(e);
		}

		return name;
	}
	
	public static String getFullFileURL(long fileEnTryId) {
		String fullFileURL = "";

		try {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEnTryId);
			
			if (fileEntry != null) {
				String domainFile = GetterUtil.getString(PropsUtil.get("vn.gt.domain.file"));
				
				if(Validator.isNull(domainFile)) {
					ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
					
					if(serviceContext != null) {
						domainFile = serviceContext.getPortalURL();
					}
				}
				
				fullFileURL = domainFile + DLUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), null, "");
			}
		} catch (Exception e) {
			_log.error(e);
		}

		return fullFileURL;
	}
}
