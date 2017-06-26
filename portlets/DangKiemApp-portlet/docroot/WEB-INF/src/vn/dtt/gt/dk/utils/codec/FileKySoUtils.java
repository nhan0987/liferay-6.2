package vn.dtt.gt.dk.utils.codec;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.portlet.PortletRequest;

import vn.dtt.gt.dk.utils.document.DocumentUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class FileKySoUtils {
	private static Log _log = LogFactoryUtil.getLog(FileKySoUtils.class);
	
	private static final String APP_NAME = "DangKiemApp-portlet";
	
	public static long uploadUrlFile(String urlFile, long userId, PortletRequest portletRequest){
		
		_log.info("===uploadUrlFile===" + urlFile);
		
		String urlFileLocal = urlFile;
		if(portletRequest != null) {
			urlFileLocal = getLocalPath(urlFile, portletRequest);
		}
		
		_log.info("===urlFileLocal===" + urlFileLocal);
		
		long noiLuuTruTaiLieuId = 0;
		
		if (Validator.isNotNull(urlFileLocal)){
			
			InputStream is = null;
			File file = null;
			
			try {
				file = new File(urlFileLocal);
				
				if(!file.exists()) {
					file = new File(StringUtil.replace(urlFileLocal, ".signed.", ".temp."));
				}
				
				is = new FileInputStream(file);
			} catch (Exception e) {
				_log.error(e);
			} finally {
				if(file != null) {
					file.delete();
				}
			}
			
			if(is != null) {
				byte[] fileContext = DocumentUtils.getByteFromInputStream(is);
				noiLuuTruTaiLieuId = DocumentUtils.uploadTaiLieu(fileContext, userId, urlFile);
			} else {
				_log.error("===uploadUrlFile===null");
			}
		}
		
		return noiLuuTruTaiLieuId;
	}
	
	/**
	 * change url file from:</br>
	 * <li>http://dangkiem.mt.gov.vn/DangKiemApp-portlet/export/BBKT2015BM02_1200206.pdf</li>
	 * <li>/DangKiemApp-portlet/export/BBKT2015BM02_1200206.pdf</li>
	 * => /opt/liferay/jboss-7.1.3/standalone/deployments/DangKiemApp-portlet.war/export/BBKT2015BM02_1200206.pdf</li>
	 * 
	 * @param urlFile
	 * @param portletRequest
	 * @return
	 */
	private static String getLocalPath(String urlFile, PortletRequest portletRequest){
		String url = urlFile;
		
		if(Validator.isNotNull(urlFile) 
				&& urlFile.startsWith("http") 
				&& urlFile.indexOf(APP_NAME) > 0) {
			// case: http://dangkiem.mt.gov.vn/DangKiemApp-portlet/export/BBKT2015BM02_1200206.pdf
			
			String portalURL = urlFile.substring(0, urlFile.indexOf(APP_NAME));
			
			url = StringUtil.replace(urlFile, portalURL + APP_NAME + StringPool.FORWARD_SLASH, 
					getURLFile(portletRequest));
		} else if(Validator.isNotNull(urlFile) 
				&& urlFile.startsWith(StringPool.FORWARD_SLASH + APP_NAME + StringPool.FORWARD_SLASH)) {
			// case: /DangKiemApp-portlet/export/BBKT2015BM02_1200206.pdf
			
			url = StringUtil.replace(urlFile, StringPool.FORWARD_SLASH + APP_NAME + StringPool.FORWARD_SLASH, 
					getURLFile(portletRequest));
		}
		
		return url;
	}
	
	private static String getURLFile(PortletRequest portletRequest){
		return portletRequest.getPortletSession().getPortletContext().getRealPath("/").replace("/", File.separator).replace(File.separator + ".", "");	
	}
	
	/*public static long uploadUrlFileByMinh(String urlFile, long userId, ActionRequest request){
		_log.info("===uploadUrlFileByMinh===" + urlFile);
		
		long noiLuuTruTaiLieuId = 0;
		
		String urlFile_ = CheckFileKySoUrl.getURLFile(request) + StringUtil.replace(urlFile, "/DangKiemApp-portlet/export", "export");
		
		urlFile_ = StringUtil.replace(urlFile_, HTTP_NO_PORT, URL_FILE_);
		
		if (Validator.isNotNull(urlFile_)){
			
			InputStream is = null;
			
			File file = null;
			
			try {
				file = new File(urlFile_);
				
				is = new FileInputStream(file);
			} catch (Exception e) {
				_log.error(e);
			} finally {
				if(file != null) {
					file.delete();
				}
			}
			
			if (is == null){
				try {
					urlFile_ = CheckFileKySoUrl.getURLPortalByMinh(request) + urlFile;
					
					is = new URL(urlFile_).openStream();
				} catch (MalformedURLException e) {
					_log.error(e);
				} catch (IOException e) {
					_log.error(e);
				}
			}
			
			byte[] fileContext = DocumentUtils.getByteFromInputStream(is);
			noiLuuTruTaiLieuId = DocumentUtils.uploadTaiLieu(fileContext, userId, urlFile_);
		}
		
		return noiLuuTruTaiLieuId;
	}*/
	
	/*public static String urlFileChuKy(HttpServletRequest request){
		String urlFileChuKy = "";
		
		try{
			long userIdLogin = PortalUtil.getUserId(request);
			
			if (userIdLogin > 0) {
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(userIdLogin);
				
				if (corporationInspector != null
						&& corporationInspector.getFilechukyId() > 0) {
					
					urlFileChuKy = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(
						corporationInspector.getFilechukyId());
					
					urlFileChuKy = urlFileChuKy.replace("?version=1.0", "").replace("?version=1.1", "");
					
					_log.info("===urlFileChuKy===" + urlFileChuKy);
					
					return urlFileChuKy;
				}
			}
		}catch (Exception e) {
			_log.error(e);
		}
		
		return urlFileChuKy;
	}*/
}
