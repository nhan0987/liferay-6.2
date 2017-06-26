/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedVehicle;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedVehicle.ImportedVehicle;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedVehicle.AttachedFile;




/**
 * @author win_64
 *
 */
public class ConfirmOfRemovedVehicleValidation {

	public static boolean validation(ConfirmOfRemovedVehicle obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//RequestDate
		status = ValidationUtils.checkValidation(obj.getRequestDate(), logMessageValidation, "106", "RequestDate", "02", maLoi3, 50, status);
		
		//Organization
		if(obj.getOrganization() != null && obj.getOrganization().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "106", "Organization", "03", maLoi4, 255, status);
		}
		
		//Division
		if(obj.getDivision() != null && obj.getDivision().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "106", "Division", "04", maLoi4, 255, status);
		}
		
		//Name
		if(obj.getName() != null && obj.getName().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getName(), logMessageValidation, "106", "Name", "05", maLoi4, 255, status);
		}
		
		//ReasonForRemoving
		status = ValidationUtils.checkValidation(obj.getReasonForRemoving(), logMessageValidation, "106", "ReasonForRemoving", "06", maLoi2, 500, status);
				
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "106", "ImportedVehicle", "07", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}
		
		//AttachedFile
//		List<AttachedFile> liAttachedFiles = obj.getAttachedFile();
//		
//		//TODO AttachedFile
//		status = ValidationUtils.checkValidationListNull(liAttachedFiles, logMessageValidation, "106", "AttachedFile", "16", status);
//				
//		if(liAttachedFiles!= null && liAttachedFiles.size() > 0){
//			for(AttachedFile attachedFile : liAttachedFiles){
//				status = validationAttachedFileList(attachedFile, idMessageLog);
//			}
//		}
		 
		return status;
	}

	private static boolean validationImportedVehiclelist(
			ImportedVehicle importedVehicle, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//SequenceNo
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "106", "SequenceNo", "08", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "106", "CodeNumber", "09", maLoi1, 0, 9, 0, false, status);
						
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "106", "ChassisNumber", "10", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "106", "EngineNumber", "11", maLoi4, 50, status);
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getProductionYear()), logMessageValidation, "106", "ProductionYear", "12", maLoi1, 0, 9, 0, false, status);
				
		//VehicleEngineStatus   
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleEngineStatus()), logMessageValidation, "106", "VehicleEngineStatus", "13", maLoi1, 0, 1, 0, true, status);
				
		//VehicleColor
		if(importedVehicle.getVehicleColor() != null && importedVehicle.getVehicleColor().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleColor(), logMessageValidation, "106", "VehicleColor", "14", maLoi4, 50, status);
		}
		
		//MarkedAsDelete
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkedAsDelete()), logMessageValidation, "106", "MarkedAsDelete", "15", maLoi1, 0, 1, 0, true, status);
		
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
		status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "106", "AttachedTypeCode", "16", maLoi2, 20, status);
		
		//AttachedTypeName
		if(attachedFile.getAttachedTypeName() != null && attachedFile.getAttachedTypeName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "106", "AttachedTypeName", "17", maLoi4, 200, status);
		}
		
		//AttachedDocName
		status = ValidationUtils.checkValidation(attachedFile.getAttachedDocName(), logMessageValidation, "106", "AttachedDocName", "18", maLoi2, 200, status);
		
		//AttachedNote
//		status = ValidationUtils.checkValidation(attachedFile.getAttachedNote(), logMessageValidation, "106", "AttachedNote", "14", maLoi2, 106, status);
		
		//AttachedSequenceNo
		if(attachedFile.getAttachedSequenceNo() > 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(attachedFile.getAttachedSequenceNo()), logMessageValidation, "106", "AttachedSequenceNo", "20", maLoi5, 0, 3, 0, false, status);
		}
		
		//FullFileName
		if(attachedFile.getFullFileName() != null && attachedFile.getFullFileName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getFullFileName(), logMessageValidation, "106", "FullFileName", "21", maLoi4, 100, status);
		}
		
		//SHA1FileContent
		if(attachedFile.getSHA1FileContent() != null && attachedFile.getSHA1FileContent().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getSHA1FileContent(), logMessageValidation, "106", "SHA1FileContent", "22", maLoi4, 255, status);
		}
		
		return status;
	}
}

