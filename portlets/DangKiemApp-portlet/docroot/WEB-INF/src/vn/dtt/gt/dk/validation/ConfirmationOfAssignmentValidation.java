package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment;
import vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment.ImportedVehicle;
import vn.dtt.gt.dk.utils.format.FormatData;


public class ConfirmationOfAssignmentValidation {

	public static boolean validation(ConfirmationOfAssignment obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };

		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "206", "RegisteredNumber", "02", maLoi2, 100, status);
		
		//RegisteredYear
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getRegisteredYear()), logMessageValidation, "206", "RegisteredYear", "03", maLoi1, 0, 9, 0, false, status);

		//TotalOfRegisteredVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfRegisteredVehicle()), logMessageValidation, "206", "TotalOfRegisteredVehicle", "04", maLoi1, 0, 9, 0, false, status);
		
		//TotalOfRequested
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfRequested()), logMessageValidation, "206", "TotalOfRequested", "05", maLoi1, 0, 9, 0, false, status);
		
		//TotalOfAssigned
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfAssigned()), logMessageValidation, "206", "TotalOfAssigned", "06", maLoi1, 0, 9, 0, false, status);
		
		//DateAssigned
		if (obj.getDateAssigned() != null && !FormatData.isThisDateValid(obj.getDateAssigned())) {
			status = false;
			logMessageValidation.setTagName("Message : 206" + "__" + "DateAssigned");
			logMessageValidation.setValidationCode("N206707");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}

		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "206", "ImportedVehicle", "08", status);
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "206", "SequenceNo", "09", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "206", "CodeNumber", "10", maLoi1, 0, 9, 0, false, status);

		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "206", "TradeMark", "11", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "206", "ModelType", "12", maLoi2, 20, status);

		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "206", "ChassisNumber", "13", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "206", "EngineNumber", "14", maLoi4, 50, status);
		}

		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "206", "MarkAsVehicle", "15", maLoi1, 0, 1, 0, false, status);

		return status;
	}
}