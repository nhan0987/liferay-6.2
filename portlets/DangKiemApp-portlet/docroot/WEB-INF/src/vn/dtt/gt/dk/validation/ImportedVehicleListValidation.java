/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList.ImportedVehicle;




/**
 * @author win_64
 *
 */
public class ImportedVehicleListValidation {

	public static boolean validation(ImportedVehicleList obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "102", "ImportedVehicle", "02", status);
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "102", "SequenceNo", "03", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "102", "CodeNumber", "04", maLoi1, 0, 9, 0, false, status);
						
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "102", "MarkAsVehicle", "05", maLoi1, 0, 1, 0, false, status);
				
		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "102", "TradeMark", "06", maLoi2, 50, status);
				
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "102", "ModelType", "07", maLoi2, 20, status);
				
		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "102", "VehicleType", "08", maLoi4, 20, status);
		}
				
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "102", "VehicleType", "09", maLoi4, 20, status);
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getProductionYear()), logMessageValidation, "102", "ProductionYear", "10", maLoi1, 0, 9, 0, false, status);
		
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "102", "ChassisNumber", "11", maLoi4, 50, status);
		}
			
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "102", "EngineNumber", "12", maLoi4, 50, status);
		}
				
		//VehicleEngineStatus   
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleEngineStatus()), logMessageValidation, "102", "VehicleEngineStatus", "13", maLoi1, 0, 1, 0, false, status);
				
		//TechnicalSpecCode
		status = ValidationUtils.checkValidation(importedVehicle.getTechnicalSpecCode(), logMessageValidation, "102", "TechnicalSpecCode", "14", maLoi2, 200, status);
		
		//VehicleUnitPrice
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleUnitPrice()), logMessageValidation, "102", "DeclarationPrice", "15", maLoi1, 1, 20, 3, false, status);
		
		//Currency
		status = ValidationUtils.checkValidation(importedVehicle.getCurrency(), logMessageValidation, "102", "Currency", "16", maLoi2, 3, status);
		
		return status;
	}
}

