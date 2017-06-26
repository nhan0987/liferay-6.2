/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedSchedule;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedSchedule.ImportedVehicle;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedSchedule.AttachedFile;




/**
 * @author win_64
 *
 */
public class ConfirmOfRemovedScheduleValidation {

	public static boolean validation(ConfirmOfRemovedSchedule obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getRequestDate(), logMessageValidation, "104", "RequestDate", "02", maLoi3, 50, status);
		
		//Organization
		if(obj.getOrganization() != null && obj.getOrganization().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "104", "Organization", "03", maLoi4, 255, status);
		}
		
		//Division
		if(obj.getDivision() != null && obj.getDivision().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "104", "Division", "04", maLoi4, 255, status);
		}
		
		//Name
		if(obj.getName() != null && obj.getName().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getName(), logMessageValidation, "104", "Name", "05", maLoi4, 255, status);
		}
		
		//ReasonForRemoving
		status = ValidationUtils.checkValidation(obj.getReasonForRemoving(), logMessageValidation, "104", "ReasonForRemoving", "06", maLoi2, 500, status);
				
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "104", "ImportedVehicle", "07", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}
		
		//AttachedFile
		List<AttachedFile> liAttachedFiles = obj.getAttachedFile();
		
		//TODO AttachedFile
//		status = ValidationUtils.checkValidationListNull(liAttachedFiles, logMessageValidation, "104", "AttachedFile", "16", status);
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "104", "SequenceNo", "08", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "104", "CodeNumber", "09", maLoi1, 0, 9, 0, false, status);
						
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "104", "ChassisNumber", "10", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "104", "EngineNumber", "11", maLoi4, 50, status);
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getProductionYear()), logMessageValidation, "104", "ProductionYear", "12", maLoi1, 0, 9, 0, false, status);
				
		//VehicleEngineStatus   
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleEngineStatus()), logMessageValidation, "104", "VehicleEngineStatus", "13", maLoi1, 0, 1, 0, true, status);
				
		//VehicleColor
		if(importedVehicle.getVehicleColor() != null && importedVehicle.getVehicleColor().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleColor(), logMessageValidation, "104", "VehicleColor", "14", maLoi4, 50, status);
		}
		
		//MarkedAsDelete
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkedAsDelete()), logMessageValidation, "104", "MarkedAsDelete", "15", maLoi1, 0, 1, 0, true, status);
		
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
		status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "104", "AttachedTypeCode", "16", maLoi2, 20, status);
		
		//AttachedTypeName
		if(attachedFile.getAttachedTypeName() != null && attachedFile.getAttachedTypeName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "104", "AttachedTypeName", "17", maLoi4, 200, status);
		}
		
		//AttachedDocName
		status = ValidationUtils.checkValidation(attachedFile.getAttachedDocName(), logMessageValidation, "104", "AttachedDocName", "18", maLoi2, 200, status);
		
		//AttachedNote
//		status = ValidationUtils.checkValidation(attachedFile.getAttachedNote(), logMessageValidation, "104", "AttachedNote", "14", maLoi2, 104, status);
		
		//AttachedSequenceNo
		if(attachedFile.getAttachedSequenceNo() > 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(attachedFile.getAttachedSequenceNo()), logMessageValidation, "104", "AttachedSequenceNo", "20", maLoi5, 0, 3, 0, false, status);
		}
		
		//FullFileName
		if(attachedFile.getFullFileName() != null && attachedFile.getFullFileName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getFullFileName(), logMessageValidation, "104", "FullFileName", "21", maLoi4, 100, status);
		}
		
		//SHA1FileContent
		if(attachedFile.getSHA1FileContent() != null && attachedFile.getSHA1FileContent().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getSHA1FileContent(), logMessageValidation, "104", "SHA1FileContent", "22", maLoi4, 255, status);
		}
		
		return status;
	}
}

