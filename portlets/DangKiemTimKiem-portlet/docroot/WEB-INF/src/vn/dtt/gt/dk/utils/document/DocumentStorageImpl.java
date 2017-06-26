/**
 *
 */

package vn.dtt.gt.dk.utils.document;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.RoleConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;

/**
 * @author win_64
 *
 */
public class DocumentStorageImpl implements IDocumentStorage {
	
	private Log log = LogFactoryUtil.getLog(DocumentStorageImpl.class);
	public static final String UPLOAD_MYFOLDER_NOT_CREATED = "MYFOLDER_NOT_CREATED";
	public final static String FOLDER_DEFAULT_UPLOAD_NOP_HOSO = "NOPHOSO";
	private String CMON_DOCUMENT_FOLDER_ID = "CMON_DOCUMENT_FOLDER_ID";
	public static final String UPLOAD_SYSTEM = "SYSTEM";
	public static final String UPLOAD_FILE_TYPE = "FILE_TYPE";
	public static final String UPLOAD_LIMITSIZE = "LIMITSIZE";
	public static final String UPLOAD_FOLDER_NOT_FOUND = "FOLDER_NOT_FOUND";
	public static final String UPLOAD_OK = "OK";
	
	private String[] getFolderNopHoSo(Long userId) {
//		String[] folders = new String[2];
//		folders[0] = FOLDER_DEFAULT_UPLOAD_NOP_HOSO;
//		folders[1] = userId.toString();
		
//		String[] folders = new String[5];
		String[] folders = new String[4];
		Calendar calendar = Calendar.getInstance();
		folders[0] = FOLDER_DEFAULT_UPLOAD_NOP_HOSO;		
		folders[1] = ""+calendar.get(Calendar.YEAR); 
		folders[2] = ""+(calendar.get(Calendar.MONTH)+1);	
		//folders[3] = ""+(calendar.get(Calendar.WEEK_OF_MONTH));	
		folders[3]= ""+userId.toString();
		
		return folders;
		
//		return folders;
	}
	
	private ResultUpload upload(Long userId, byte[] b, String _fileName) {
		long limit = 999999999;
		Long folderId = DKConfigurationManager.getLongProp(CMON_DOCUMENT_FOLDER_ID, 10716);
		//		folderId =11605L; //local-VinhNguyen
		String fileName = _fileName;
		if (_fileName.split(".").length > 2) {
			fileName = _fileName.substring(0, _fileName.lastIndexOf("."));
		}
		log.debug(fileName + "========folderIdfolderId========" + folderId);
		
		DLFolder folder = null;
		ResultUpload result = new ResultUpload();
		try {
			folder = DLFolderLocalServiceUtil.getDLFolder(folderId);
			if (folder == null) {
				result.setCode(UPLOAD_FOLDER_NOT_FOUND);
				return result;
			}
			Long repositoryId = folder.getRepositoryId();
			User admin = getAdministrator();
			ServiceContext serviceContext = getServiceContext(admin);
			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);
//			ResourceLocalServiceUtil.addModelResources(AuditedModel auditedModel, ServiceContext serviceContext)			
//			serviceContext.setAddGuestPermissions(true);
//			serviceContext.setAddGroupPermissions(true);
//			
			Folder myFolder = addFolders(userId, serviceContext, repositoryId, folderId, getFolderNopHoSo(userId));
			if (myFolder == null) {
				result.setCode(UPLOAD_MYFOLDER_NOT_CREATED);
				return result;
			}
			log.debug("====b.add file in folder:" + myFolder.getName());
			return addFile(userId, serviceContext, repositoryId, b, myFolder.getFolderId(), fileName, limit);
			
		} catch (Exception e) {
			log.error(e);
			result.setCode(UPLOAD_SYSTEM);
		}
		
		return result;
	}
	
		
	private  ServiceContext getServiceContext(User admin) throws Exception{		
		PrincipalThreadLocal.setName(admin.getUserId());		
		PermissionChecker permissionChecker =
				PermissionCheckerFactoryUtil.create(admin, false);
		PermissionThreadLocal.setPermissionChecker(permissionChecker);			
			
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setAddGroupPermissions(true);
		serviceContext.setAddGuestPermissions(true);	
//		new String[] {ActionKeys.UPDATE, ActionKeys.VIEW}
//		String[] danhSachAccess={ActionKeys.ACCESS,ActionKeys.VIEW,ActionKeys.UPDATE};
		String [] danhSachAccess = new String[] {
				ActionKeys.ACCESS,
				ActionKeys.VIEW
			};
		serviceContext.setGuestPermissions(danhSachAccess);
		return serviceContext;
	}

	
//	private ServiceContext getServiceContext(User admin)
//		throws Exception {
//		ServiceContext serviceContext = new ServiceContext();
//		serviceContext.setAddGroupPermissions(true);
//		serviceContext.setAddGuestPermissions(true);
//		return serviceContext;
//	}
	
	private ResultUpload addFile(long userId, ServiceContext serviceContext, Long repositoryId, byte[] b, Long folderId, String fileName, long limit)
		throws IOException, PortalException, SystemException {
		ResultUpload result = new ResultUpload();
		java.io.File tempFile = FileUtil.createTempFile(fileName);
//		log.debug("=======addFile======fileName=====" + fileName + "===bbbbb==" + b);
		FileOutputStream fos = new FileOutputStream(tempFile);
		fos.write(b);
		fos.flush();
		fos.close();
		fos = null;
		
		FileInputStream fis = new FileInputStream(tempFile);
		
		String contentType = MimeTypesUtil.getContentType(fis, tempFile.getName());
		fis.close();
		fis = null;
		
		fis = new FileInputStream(tempFile);
		long size = tempFile.length();
		if (limit > 0) {
			long limitsize = (long) ((size / (1024 * 1024)));
			if (limitsize > limit) {
				result.setCode(UPLOAD_LIMITSIZE);
				tempFile.delete();
				return result;
			} else if (limitsize == limit) {
				long yes = limitsize * 1024 * 1024;
				if (yes < size) {
					result.setCode(UPLOAD_LIMITSIZE);
					tempFile.delete();
					return result;
				}
			}
		}
		
		FileEntry fileEntry = addFile(userId, serviceContext, repositoryId, folderId, contentType, b, size, fileName);
		
		fis.close();
		fis = null;
		tempFile.delete();
		if(fileEntry != null){  
			
			String url = getURL(fileEntry);
			result.setResult(true);
			result.setCode(UPLOAD_OK);
			result.setFileId(fileEntry.getFileEntryId());
			result.setUrl(url);
		}else{					
			result.setResult(false);
			result.setCode(UPLOAD_SYSTEM);			
			
		}
		return result;
	}
	
	public void deleteFile(Long documentId) {
		try {
			DLAppLocalServiceUtil.deleteFileEntry(documentId);
		} catch (Exception e) {
			log.error(e.toString());
		}
	}
	
	private Folder addFolders(long userId, ServiceContext context, long repositoryId, long parentFolderId, String[] folders) {
		
		if (folders != null && folders.length > 0) {
			Folder folder = null;
			for (String folderName : folders) {
				if (folder != null) {
					parentFolderId = folder.getFolderId();
				}
				folder = addFolder(userId, context, repositoryId, parentFolderId, folderName);
			}
			return folder;
		}
		return null;
	}
	
	private Folder addFolder(long userId, ServiceContext context, long repositoryId, long parentFolderId, String name) {
		
		Folder folder = null;
		try {
			folder = DLAppLocalServiceUtil.getFolder(repositoryId, parentFolderId, name);
		} catch (Exception e) {
			log.error(e);
		}
		
		if (folder == null) {
			try {
				folder = DLAppServiceUtil.addFolder(repositoryId, parentFolderId, name, name, context);
				//folder = DLAppServiceUtil.addFolder(repositoryId, parentFolderId, name, description, serviceContext);		
			} catch (Exception e) {
				log.error(e);
			}
		}
		
		if(folder != null) {
			try{
				String [] actionKeys = new String[] {
					ActionKeys.ACCESS,
					ActionKeys.VIEW
				};
					
				long companyId = PortalUtil.getDefaultCompanyId();
				Role roleUser = RoleLocalServiceUtil.getRole(folder.getCompanyId(), RoleConstants.GUEST); 
				ResourcePermissionLocalServiceUtil.setResourcePermissions(companyId, Folder.class.getName(), ResourceConstants.SCOPE_COMPANY, ""+companyId, roleUser.getRoleId(),actionKeys);
			}catch (Exception e){}
		}
		
		return folder;
	}
	
	private FileEntry addFile(
		long userId, ServiceContext context, Long repositoryId, Long folderId, String c, byte[] bytes, long size, String fileName)
		{
		
		FileEntry fileEntry = null;
		try {
			
//			fileEntry = DLFileEntryLocalServiceUtil.addFileEntry(userId, repositoryId, repositoryId, folderId, fileName, fileName, fileName, fileName, fileName, 0, null, file, is, size, serviceContext);
			fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, repositoryId, folderId, fileName, fileName, fileName, fileName, fileName, bytes, context);
//			fileEntry.set
		} catch (Exception e) {
			try{
				//delete file if it exist on the folder
				DLAppServiceUtil.deleteFileEntryByTitle(repositoryId, folderId, fileName);
				
				fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, repositoryId, folderId, fileName, fileName, fileName, fileName, fileName, bytes, context);
			
			}catch (Exception e2) {
				fileName = System.currentTimeMillis() +"_"+fileName;
				try{
					fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, repositoryId, folderId, fileName, fileName, fileName, fileName, fileName, bytes, context);
				}catch(Exception e3){
					fileEntry = null;
				}
			}
		}
		
		if(fileEntry != null) {
			try{
				long companyId = PortalUtil.getDefaultCompanyId();
				Role role = RoleLocalServiceUtil.getRole(companyId, RoleConstants.GUEST);
				String [] actionKeys = new String[] {
						ActionKeys.ACCESS,
						ActionKeys.VIEW
					};
				
				ResourcePermissionLocalServiceUtil.setResourcePermissions(companyId,FileEntry.class.getName(), ResourceConstants.SCOPE_COMPANY, String.valueOf(fileEntry.getPrimaryKey()),role.getRoleId(), actionKeys);
			}catch(Exception e){
				
			}
		}
		
		return fileEntry;
	}
	
	private String getURL(FileEntry fileEntry) {
		try {
			String url =
				"/documents/" + fileEntry.getGroupId() + StringPool.SLASH + fileEntry.getFolderId() + StringPool.SLASH + fileEntry.getTitle() +
					"?version=" + fileEntry.getVersion();
			return url;
		} catch (Exception e) {
			log.error(e);
		}
		
		return "";
	}
	
	public String getURLById(Long fileId) {
		if(fileId ==null || fileId.intValue()<=0) return "";
		try {
			return getURL(DLAppLocalServiceUtil.getFileEntry(fileId));
		} catch (Exception e) {
			log.error(e);
		}
		return "";
	}
	
	public String getFileName(String fileName, String newName) {
		String typeFile = getFileType(fileName);
		fileName = newName + "." + typeFile;
		
		return fileName;
		
	}
	
	private String getFileType(String fileName) {
		try {
			String type = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
			return type;
		} catch (Exception es) {
			log.error(es);
		}
		return "";
	}
	
	private User getAdministrator() {
		Long userId = DKConfigurationManager.getLongProp("id_admin", 10198L);
		User admin = null;
		try {
			admin = UserLocalServiceUtil.fetchUser(userId);
			return admin;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}
	
	public boolean existFile(Long fileId) {
		try {
			FileEntry file = DLAppLocalServiceUtil.getFileEntry(fileId);
			if (file == null || file.getFileEntryId() <= 0) { return false; }
		} catch (Exception e) {
			log.error(e);
		}
		return true;
	}
}
