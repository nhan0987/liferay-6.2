package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList.ImportedVehicle;



public class CurrentStatusOfImportedVehicleListValidation {

	public static boolean validation(CurrentStatusOfImportedVehicleList obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "205", "RegisteredNumber", "02", maLoi2, 100, status);
		
		//TotalOfRegisteredVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfRegisteredVehicle()), logMessageValidation, "205", "TotalOfRegisteredVehicle", "03", maLoi1, 0, 9, 0, false, status);
		
		//TotalOfRequested
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfRequested()), logMessageValidation, "205", "TotalOfRequested", "04", maLoi1, 0, 9, 0, false, status);
		
		//TotalOfInspected
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfInspected()), logMessageValidation, "205", "TotalOfInspected", "05", maLoi1, 0, 9, 0, false, status);
		
		//TotalOfNotYetInspected
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfNotYetInspected()), logMessageValidation, "205", "TotalOfNotYetInspected", "06", maLoi1, 0, 9, 0, false, status);
		
		//TotalOfCancelled
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfCancelled()), logMessageValidation, "205", "TotalOfCancelled", "07", maLoi1, 0, 9, 0, false, status);

		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "205", "ImportedVehicle", "08", status);
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "205", "SequenceNo", "09", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "205", "CodeNumber", "10", maLoi1, 0, 9, 0, false, status);

		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "205", "MarkAsVehicle", "11", maLoi1, 0, 1, 0, false, status);

		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "205", "TradeMark", "12", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "205", "ModelType", "13", maLoi2, 20, status);

		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "205", "VehicleType", "14", maLoi4, 20, status);
		}
		
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "205", "EngineType", "15", maLoi4, 20, status);
		}

		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "205", "ChassisNumber", "16", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "205", "EngineNumber", "17", maLoi4, 50, status);
		}
		
		//VehicleEngineStatus
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleEngineStatus()), logMessageValidation, "205", "VehicleEngineStatus", "18", maLoi1, 0, 1, 0, false, status);
		
		//TechnicalSpecCode
		status = ValidationUtils.checkValidation(importedVehicle.getTechnicalSpecCode(), logMessageValidation, "205", "TechnicalSpecCode", "19", maLoi2, 200, status);
		
		
		return status;
	}
}