package vn.dtt.gt.dk.utils.document;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.portlet.ActionRequest;
import javax.portlet.PortletSession;

import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;

public class DocumentUtils {

	static Log log = LogFactoryUtil.getLog(DocumentUtils.class);

	public static String getLinkDownloadFromNoiLuuTruTaiLieuId(long NoiLuuTruTaiLieuId) {
		
	   long userId = DKConfigurationManager.getLongProp("id_admin", 10198);
	   User user=null;
		try {
			user = UserLocalServiceUtil.getUserById(userId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   try {
			PermissionThreadLocal.setPermissionChecker(PermissionCheckerFactoryUtil.create(user, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IDocumentStorage iDocumentStorage = new DocumentStorageImpl();
		return iDocumentStorage.getURLById(NoiLuuTruTaiLieuId);
	}
	
	public static String getFileNameURLFile(String fileURL) throws IOException {
        URL url = new URL(fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();
        String fileName = "";
        // always check HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String disposition = httpConn.getHeaderField("Content-Disposition");
 
            if (disposition != null) {
                // extracts file name from header field
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10,
                            disposition.length() - 1);
                }
            } else {
                // extracts file name from URL
                fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1,
                        fileURL.length());
            }
        } else {
            System.out.println("No file to download. Server replied HTTP code: " + responseCode);
        }
        httpConn.disconnect();
		return fileName;
    }
	
	public static boolean existDLFileAbsPath(long fileEntryId) 
			throws SystemException {
		
		boolean exist = false;
		
		if(fileEntryId > 0) {
			try {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);
				
				exist = existDLFileAbsPath(fileEntry);
			} catch(PortalException e) {
				log.error(e);
			}
		}
		
		return exist;
	}
	
	public static boolean existDLFileAbsPath(FileEntry fileEntry) {
		
		boolean exist = false;
		
		if(fileEntry != null) {
			String dlFileAbsPath = PropsUtil.get("dl.store.file.system.root.dir") + "/"
				+ fileEntry.getCompanyId() + "/" + fileEntry.getFolderId()
				+ "/" + ((DLFileEntry) fileEntry.getModel()).getName() + "/"
				+ fileEntry.getVersion();
			
			File file = new File(dlFileAbsPath);
			
			exist = file.exists();
		}
		
		return exist;
	}
}
