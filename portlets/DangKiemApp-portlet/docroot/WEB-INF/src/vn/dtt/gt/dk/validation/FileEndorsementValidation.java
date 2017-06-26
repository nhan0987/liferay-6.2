/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.FileEndorsement;
import vn.dtt.gt.dk.nsw.model.FileEndorsement.ImportedVehicle;
import vn.dtt.gt.dk.nsw.model.FileEndorsement.AttachedFile;




/**
 * @author win_64
 *
 */
public class FileEndorsementValidation {

	public static boolean validation(FileEndorsement obj, long idMessageLog) throws Exception {
		
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
		
		//ReasonForEndorsement
		status = ValidationUtils.checkValidation(obj.getReasonForEndorsement(), logMessageValidation, "106", "ReasonForEndorsement", "06", maLoi2, 500, status);
			
		//AttachedFile
//		List<AttachedFile> liAttachedFiles = obj.getAttachedFile();
//		
//		//TODO AttachedFile
//		status = ValidationUtils.checkValidationListNull(liAttachedFiles, logMessageValidation, "106", "AttachedFile", "07", status);
//				
//		if(liAttachedFiles!= null && liAttachedFiles.size() > 0){
//			for(AttachedFile attachedFile : liAttachedFiles){
//				status = validationAttachedFileList(attachedFile, idMessageLog);
//			}
//		}
		
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "106", "ImportedVehicle", "07", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "106", "SequenceNo", "18", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "106", "CodeNumber", "19", maLoi1, 0, 9, 0, false, status);
						
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "106", "ChassisNumber", "20", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "106", "EngineNumber", "21", maLoi4, 50, status);
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getProductionYear()), logMessageValidation, "106", "ProductionYear", "22", maLoi1, 0, 9, 0, false, status);
				
		//VehicleEngineStatus   
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleEngineStatus()), logMessageValidation, "106", "VehicleEngineStatus", "23", maLoi1, 0, 1, 0, true, status);
		
		//VehicleUnitPrice
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleUnitPrice()), logMessageValidation, "106", "VehicleUnitPrice", "24", maLoi1, 1, 20, 3, false, status);
			
		//Currency
		status = ValidationUtils.checkValidation(importedVehicle.getCurrency(), logMessageValidation, "106", "Currency", "25", maLoi2, 3, status);
		
		//VehicleColor
		if(importedVehicle.getVehicleColor() != null && importedVehicle.getVehicleColor().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleColor(), logMessageValidation, "106", "VehicleColor", "26", maLoi4, 50, status);
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
		status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "106", "AttachedTypeCode", "08", maLoi2, 20, status);
		
		//AttachedTypeName
		if(attachedFile.getAttachedTypeName() != null && attachedFile.getAttachedTypeName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "106", "AttachedTypeName", "09", maLoi4, 200, status);
		}
		
		//AttachedDocName
		status = ValidationUtils.checkValidation(attachedFile.getAttachedDocName(), logMessageValidation, "106", "AttachedDocName", "10", maLoi2, 200, status);
		
		//AttachedNote
//		status = ValidationUtils.checkValidation(attachedFile.getAttachedNote(), logMessageValidation, "106", "AttachedNote", "14", maLoi2, 106, status);
		
		//AttachedSequenceNo
		if(attachedFile.getAttachedSequenceNo() > 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(attachedFile.getAttachedSequenceNo()), logMessageValidation, "106", "AttachedSequenceNo", "12", maLoi5, 0, 3, 0, false, status);
		}
		
		//FullFileName
		if(attachedFile.getFullFileName() != null && attachedFile.getFullFileName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getFullFileName(), logMessageValidation, "106", "FullFileName", "13", maLoi4, 100, status);
		}
		
		//SHA1FileContent
		if(attachedFile.getSHA1FileContent() != null && attachedFile.getSHA1FileContent().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getSHA1FileContent(), logMessageValidation, "106", "SHA1FileContent", "14", maLoi4, 255, status);
		}
		
		//TechnicalSpecCode
		status = ValidationUtils.checkValidation(attachedFile.getTechnicalSpecCode(), logMessageValidation, "106", "TechnicalSpecCode", "16", maLoi2, 200, status);
		
		return status;
	}
}

