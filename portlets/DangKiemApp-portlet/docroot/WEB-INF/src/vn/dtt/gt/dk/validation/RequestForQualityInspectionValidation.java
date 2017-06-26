/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection.AttachedFile;



/**
 * @author win_64
 *
 */
public class RequestForQualityInspectionValidation {

	public static boolean  validation(RequestForQualityInspection obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//TODO Importer
		status = ValidationUtils.checkValidationNull(obj.getImporter(), logMessageValidation, "100", "Importer", "02", status);
		if(status){
			//ImporterCode
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getImporter().getImporterCode()), logMessageValidation, "100", "ImporterCode", "03", maLoi1, 0, 13, 0, false, status);
			 
			//ImporterName
			status = ValidationUtils.checkValidation(obj.getImporter().getImporterName(), logMessageValidation, "100", "ImporterName", "04", maLoi2, 255, status);
			
			//ImporterAddress
			status = ValidationUtils.checkValidation(obj.getImporter().getImporterAddress(), logMessageValidation, "100", "ImporterAddress", "05", maLoi2, 500, status);
			
			//Representative
			status = ValidationUtils.checkValidation(obj.getImporter().getRepresentative(), logMessageValidation, "100", "Representative", "06", maLoi2, 255, status);
			
			//Phone
			status = ValidationUtils.checkValidation(obj.getImporter().getPhone(), logMessageValidation, "100", "Phone", "07", maLoi2, 50, status);
			
			//Fax
			if(obj.getImporter().getFax() != null && obj.getImporter().getFax().trim().length() > 0){
				status = ValidationUtils.checkValidation(obj.getImporter().getFax(), logMessageValidation, "100", "Fax", "08", maLoi4, 50, status);
			}
			
			//Email
			if(obj.getImporter().getEmail() != null && obj.getImporter().getEmail().trim().length() > 0){
				status = ValidationUtils.checkValidation(obj.getImporter().getEmail(), logMessageValidation, "100", "Email", "09", maLoi4, 255, status);
			}
		}
		//AttachedFile
//		List<AttachedFile> liAttachedFiles = obj.getAttachedFile();
//		
//		//TODO AttachedFile
//		status = ValidationUtils.checkValidationListNull(liAttachedFiles, logMessageValidation, "100", "AttachedFile", "10", status);
//				
//		if(liAttachedFiles!= null && liAttachedFiles.size() > 0){
//			for(AttachedFile attachedFile : liAttachedFiles){
//				status = validationAttachedFileList(attachedFile, idMessageLog);
//			}
//		}
		
		//TotalNumberVehicle
		if(obj.getTotalNumberVehicle() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalNumberVehicle()), logMessageValidation, "100", "TotalNumberVehicle", "18", maLoi5, 0, 9, 0, false, status);
		}
		
		//TotalTechnicalSpec
		if(obj.getTotalTechnicalSpec() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalTechnicalSpec()), logMessageValidation, "100", "TotalTechnicalSpec", "19", maLoi5, 0, 9, 0, false, status);
		}
		
			//TODO Inspection
			status = ValidationUtils.checkValidationNull(obj.getInspection(), logMessageValidation, "100", "Inspection", "20", status);
			if(status){
			//InpectionDate
			
			status = ValidationUtils.checkValidation(obj.getInspection().getInpectionDate(), logMessageValidation, "100", "InpectionDate", "21", maLoi3, 50, status);
			
			//InspectionSite
			status = ValidationUtils.checkValidation(obj.getInspection().getInspectionSite(), logMessageValidation, "100", "InspectionSite", "22", maLoi2, 255, status);
			
			//DistrictCode
			status = ValidationUtils.checkValidation(obj.getInspection().getDistrictCode(), logMessageValidation, "100", "DistrictCode", "23", maLoi2, 20, status);
			
			//DistrictName
			status = ValidationUtils.checkValidation(obj.getInspection().getDistrictName(), logMessageValidation, "100", "DistrictName", "24", maLoi2, 50, status);
			
			//ProvinceCode
			status = ValidationUtils.checkValidation(obj.getInspection().getProvinceCode(), logMessageValidation, "100", "ProvinceCode", "25", maLoi2, 20, status);
			
			//ProvinceName
			status = ValidationUtils.checkValidation(obj.getInspection().getProvinceName(), logMessageValidation, "100", "ProvinceName", "26", maLoi2, 50, status);
		}
		//TODO Contacter
		status = ValidationUtils.checkValidationNull(obj.getContacter(), logMessageValidation,  "100", "Contacter", "27", status);
		
		if(status){
			//ContactName
			status = ValidationUtils.checkValidation(obj.getContacter().getContactName(), logMessageValidation, "100", "ContactName", "28", maLoi2, 255, status);
					
			//ContactPhone
			status = ValidationUtils.checkValidation(obj.getContacter().getContactPhone(), logMessageValidation, "100", "ContactPhone", "29", maLoi2, 100, status);
			
			//ContactEmail
			if(obj.getContacter().getContactEmail() != null && obj.getContacter().getContactEmail().trim().length() > 0){
				status = ValidationUtils.checkValidation(obj.getContacter().getContactEmail(), logMessageValidation, "100", "ContactEmail", "30", maLoi4, 100, status);
			}
		}
		//TODO ImporterSign
		status = ValidationUtils.checkValidationNull(obj.getImporterSign(), logMessageValidation,  "100", "ImporterSign", "31", status);
		if(status){
			//SignName
			status = ValidationUtils.checkValidation(obj.getImporterSign().getSignName(), logMessageValidation, "100", "SignName", "32", maLoi2, 255, status);
			
			//SignTitle
			if(obj.getImporterSign().getSignTitle() != null && obj.getImporterSign().getSignTitle().trim().length() > 0){
				status = ValidationUtils.checkValidation(obj.getImporterSign().getSignTitle(), logMessageValidation, "100", "SignTitle", "33", maLoi4, 100, status);
			}
			
			//SignPlace
			status = ValidationUtils.checkValidation(obj.getImporterSign().getSignPlace(), logMessageValidation, "100", "SignPlace", "34", maLoi2, 50, status);
			
			//SignDate
			status = ValidationUtils.checkValidation(obj.getImporterSign().getSignDate(), logMessageValidation, "100", "SignDate", "35", maLoi3, 50, status);
		}
		
		return status;
	}
	private static boolean validationAttachedFileList(AttachedFile attachedFile, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int [] maLoi2={1,5,6};
		int [] maLoi4={5,6};
		int [] maLoi5={ 3, 4 };
		
		//AttachedTypeCode
		status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "100", "AttachedTypeCode", "11", maLoi2, 20, status);
		
		//AttachedTypeName
		if(attachedFile.getAttachedTypeName() != null && attachedFile.getAttachedTypeName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "100", "AttachedTypeName", "12", maLoi4, 200, status);
		}
		
		//AttachedDocName
		status = ValidationUtils.checkValidation(attachedFile.getAttachedDocName(), logMessageValidation, "100", "AttachedDocName", "13", maLoi2, 200, status);
		
		//AttachedNote
//		status = ValidationUtils.checkValidation(attachedFile.getAttachedNote(), logMessageValidation, "100", "AttachedNote", "14", maLoi2, 100, status);
		
		//AttachedSequenceNo
		if(attachedFile.getAttachedSequenceNo() > 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(attachedFile.getAttachedSequenceNo()), logMessageValidation, "100", "AttachedSequenceNo", "15", maLoi5, 0, 3, 0, false, status);
		}
		
		//FullFileName
		if(attachedFile.getFullFileName() != null && attachedFile.getFullFileName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getFullFileName(), logMessageValidation, "100", "FullFileName", "16", maLoi4, 100, status);
		}
		
		//SHA1FileContent
		if(attachedFile.getSHA1FileContent() != null && attachedFile.getSHA1FileContent().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getSHA1FileContent(), logMessageValidation, "100", "SHA1FileContent", "17", maLoi4, 255, status);
		}
		
		return status;
	}
}

