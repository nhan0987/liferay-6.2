package vn.dtt.gt.dk.message.dao;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection;

public class RegisteredInspectionDao {
	
	/**
	 * @isNew true nghia la install 1 new record moi, false thuc thi update
	 * */
	public void insertDao(final RequestForQualityInspection model, Header header, boolean isNew) {
		try {
			RegisteredInspection dao = new RegisteredInspectionImpl();
			
			List<Object> lst = new ArrayList<Object>(){
				{
					add(model.getImporter());
					add(model.getInspection());
					add(model.getContacter());
					add(model.getImporterSign());
				}
			};
			
			dao = BeanUtils.copyBean(model, lst, dao);
			//dao.setRegisteredNumber(registeredNumber);
			//dao.setDossierId(dossierId);
			
			
			/*List<AttachedFile> lstFile = null;
			if (model.getAttachedFile() != null) {
				lstFile = model.getAttachedFile();
			}
			if (lstFile != null) {
				HsAttachedFile file = null;
				for (AttachedFile temp : lstFile) {
					file = new HsAttachedFileImpl();
					
					file = BeanUtils.copyBean(temp, null, file);
					file.setRequestCode(header.getReference().getMessageId());
					file.setDocumentName(StringUtil.valueOf(header.getSubject().getReference()));
					file.setDocumentYear(header.getSubject().getDocumentYear());
					
					HsAttachedFileLocalServiceUtil.addHsAttachedFile(file);
				}
			}*/
			
			RegisteredInspectionLocalServiceUtil.addRegisteredInspection(dao);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(RegisteredInspectionDao.class);
}
