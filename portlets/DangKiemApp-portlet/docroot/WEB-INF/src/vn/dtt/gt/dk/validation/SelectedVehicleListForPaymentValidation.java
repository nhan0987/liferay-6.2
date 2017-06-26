/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment;
import vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment.ImportedVehicle;



/**
 * @author win_64
 *
 */
public class SelectedVehicleListForPaymentValidation {

	public static boolean validation(SelectedVehicleListForPayment obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//TransactionID
		status = ValidationUtils.checkValidation(obj.getTransactionID(), logMessageValidation, "207", "TransactionID", "02a", maLoi2, 100, status);
				
		//PaymentRequestDate
		status = ValidationUtils.checkValidation(obj.getPaymentRequestDate(), logMessageValidation, "207", "PaymentRequestDate", "02", maLoi3, 50, status);
		
		//TotalOfSelectedVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfSelectedVehicle()), logMessageValidation, "207", "TotalOfSelectedVehicle", "03", maLoi1, 0, 9, 0, false, status);
		
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "207", "ImportedVehicle", "04", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}
		
		
		return status;
	}

	private static boolean validationImportedVehiclelist(ImportedVehicle importedVehicle, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		
		//SequenceNo
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "207", "SequenceNo", "05", maLoi1, 0, 9, 0, false, status);
		
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "207", "CodeNumber", "06", maLoi1, 0, 9, 0, false, status);

		//RegisteredNumber
		status = ValidationUtils.checkValidation(importedVehicle.getRegisteredNumber(), logMessageValidation, "207", "RegisteredNumber", "07", maLoi2, 100, status);
		
		//InspectionRecordNumber
		status = ValidationUtils.checkValidation(importedVehicle.getInspectionRecordNumber(), logMessageValidation, "207", "InspectionRecordNumber", "07a", maLoi2, 100, status);
				
		//InspectionRecordDate
		status = ValidationUtils.checkValidation(importedVehicle.getInspectionRecordDate(), logMessageValidation, "207", "InspectionRecordDate", "02", maLoi3, 50, status);
				
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "207", "MarkAsVehicle", "08", maLoi1, 0, 1, 0, false, status);
		
		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "207", "TradeMark", "09", maLoi2, 20, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "207", "ModelType", "10", maLoi2, 20, status);
		
		//VehicleType
		if(importedVehicle.getMarkAsVehicle() == 1 && importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "207", "VehicleType", "11", maLoi4, 20, status);
		}
		
		//ChassisNumber
		if(importedVehicle.getMarkAsVehicle() == 1 && importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "207", "ChassisNumber", "12", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getMarkAsVehicle() == 0 && importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "207", "EngineNumber", "13", maLoi4, 50, status);
		}
		
		return status;
	}
}

