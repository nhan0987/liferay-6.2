/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.RemovedSchedule;
import vn.dtt.gt.dk.nsw.model.RemovedSchedule.ImportedVehicle;;




/**
 * @author win_64
 *
 */
public class RemovedScheduleValidation {

	public static boolean validation(RemovedSchedule obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getRequestDate(), logMessageValidation, "103", "RequestDate", "02", maLoi3, 50, status);
		
		//Organization
		if(obj.getOrganization() != null && obj.getOrganization().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "103", "Organization", "03", maLoi4, 255, status);
		}
		
		//Division
		if(obj.getDivision() != null && obj.getDivision().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "103", "Division", "04", maLoi4, 255, status);
		}
		
		//Name
		if(obj.getName() != null && obj.getName().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getName(), logMessageValidation, "103", "Name", "05", maLoi4, 255, status);
		}
		
		//ReasonForRemoving
		status = ValidationUtils.checkValidation(obj.getReasonForRemoving(), logMessageValidation, "103", "ReasonForRemoving", "06", maLoi2, 500, status);
				
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "103", "ImportedVehicle", "07", status);
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "103", "SequenceNo", "08", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "103", "CodeNumber", "09", maLoi1, 0, 9, 0, false, status);
						
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "103", "ChassisNumber", "10", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "103", "EngineNumber", "11", maLoi4, 50, status);
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getProductionYear()), logMessageValidation, "103", "ProductionYear", "12", maLoi1, 0, 9, 0, false, status);
				
		//VehicleEngineStatus   
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleEngineStatus()), logMessageValidation, "103", "VehicleEngineStatus", "13", maLoi1, 0, 1, 0, true, status);
				
		//VehicleColor
		if(importedVehicle.getVehicleColor() != null && importedVehicle.getVehicleColor().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleColor(), logMessageValidation, "103", "VehicleColor", "14", maLoi4, 50, status);
		}
		
		return status;
	}
}

