package vn.dtt.gt.dk.utils.document;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.portlet.ActionRequest;
import javax.portlet.PortletSession;

import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.Validator;

public class DocumentUtils {

	private static Log _log = LogFactoryUtil.getLog(DocumentUtils.class);

	public static long uploadFileText(String data, String rootFolder, String fileName) {
		byte[] byteData = data.getBytes(Charset.forName("UTF-8"));
		long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system");
		
		if(Validator.isNull(fileName)) {
			fileName = "dang_kiem" + System.nanoTime() + ".txt";
		}
		
		return uploadFile(byteData, userSystem, fileName, rootFolder, null);
	}
	
	public static long uploadTaiLieu(byte[] b, long userIdUpload, String formatFile) {
		String fileName = "dang_kiem" + System.nanoTime() + getExtensionFile(formatFile);
		
		return uploadFile(b, userIdUpload, fileName, DocumentStorageImpl.FOLDER_DEFAULT_UPLOAD_NOP_HOSO, 
				String.valueOf(userIdUpload));
	}
	
	private static long uploadFile(byte[] b, long userIdUpload, String fileName, String rootFolder, 
			String folderName) {
		
		IDocumentStorage iDocumentStorage = new DocumentStorageImpl();
		ResultUpload upload = iDocumentStorage.upload(userIdUpload, b, fileName, rootFolder, folderName);
		
		if (upload != null && upload.getCode().compareTo(DocumentStorageImpl.UPLOAD_OK) == 0) {
			return upload.getFileId();
		}
		
		return 0;
	}
	
	public static byte[] getByteFromInputStream(InputStream is)
	{
		if (is != null)
		{
			try {
				int len;
				int size = 1024;
				byte[] buf;

				if (is instanceof ByteArrayInputStream) {
					size = is.available();
					buf = new byte[size];
					len = is.read(buf, 0, size);
				} else {
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					buf = new byte[size];
					while ((len = is.read(buf, 0, size)) != -1)
						bos.write(buf, 0, len);
					buf = bos.toByteArray();
				}
				
				return buf;
			}
			catch (Exception e) {
				_log.error(e);
			} finally {
				StreamUtil.cleanUp(is);
			}
		}

		return null;
	}
	
	public static String getExtensionFile(String formatFile) {
		try {
			if (Validator.isNotNull(formatFile)) {
				String extendFile = formatFile.substring(formatFile.trim().lastIndexOf("."), formatFile.trim().length());
				
				if (extendFile.compareToIgnoreCase(".") == 0) {
					extendFile = ".pdf";
				}
				
				return extendFile;
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		_log.debug(formatFile + "=old===========formatFile========" + formatFile);

		return formatFile;
	}
	public static String getLinkDownloadFromNoiLuuTruTaiLieuId(long noiLuuTruTaiLieuId) {
		
		IDocumentStorage iDocumentStorage = new DocumentStorageImpl();
		return iDocumentStorage.getURLById(noiLuuTruTaiLieuId);
	}
	
	public static boolean checkFromDate(ActionRequest actionRequest, String fromDate) {
		String FROM_DATE = "FROM_DATE";
		if (fromDate != null && fromDate.trim().length() > 0) {
			PortletSession portletSession = actionRequest.getPortletSession();
			Object oldFromDate = portletSession.getAttribute("FROM_DATE") ;
			if (oldFromDate != null) {
				if (fromDate.trim().compareToIgnoreCase(oldFromDate.toString().trim()) == 0) {
					return true;
				}
			}
			portletSession.setAttribute(FROM_DATE, fromDate.trim());
		}

		return false;
	}
}
