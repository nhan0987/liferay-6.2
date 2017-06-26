/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.PaymentConfirmation;
import vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle;
import vn.dtt.gt.dk.utils.format.FormatData;



/**
 * @author win_64
 *
 */
public class PaymentConfirmationValidation {

	public static boolean validation(PaymentConfirmation obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getTransactionID(), logMessageValidation, "210", "TransactionID", "02", maLoi2, 100, status);
		
		//DebitNoteNumber
		status = ValidationUtils.checkValidation(obj.getDebitNoteNumber(), logMessageValidation, "210", "DebitNoteNumber", "03", maLoi2, 255, status);
		
		//ReportDate
		status = ValidationUtils.checkValidation(obj.getReportDate(), logMessageValidation, "210", "ReportDate", "04", maLoi3, 50, status);
		
		//TODO PaymentSummary
		status = ValidationUtils.checkValidationNull(obj.getPaymentSummary(), logMessageValidation, "210", "PaymentSummary", "05", status);
		if(status){
		//PaymentDate
		if (obj.getPaymentSummary().getPaymentDate() != null && !FormatData.isThisDateValid(obj.getPaymentSummary().getPaymentDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 210" + "__" + "PaymentDates");
			logMessageValidation.setValidationCode("N210706");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		//TotalOfPayment
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getPaymentSummary().getTotalOfPayment()), logMessageValidation, "210", "TotalOfPayment", "07", maLoi1, 0, 20, 0, false, status);
		
		//TotalOfVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getPaymentSummary().getTotalOfVehicle()), logMessageValidation, "210", "TotalOfVehicle", "08", maLoi1, 0, 9, 0, false, status);
		}
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "210", "ImportedVehicle", "09", status);
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
		int[] maLoi4 = { 5, 6 };
		
		//SequenceNo
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "210", "SequenceNo", "10", maLoi1, 0, 9, 0, false, status);
		
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "210", "CodeNumber", "11", maLoi1, 0, 9, 0, false, status);
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(importedVehicle.getRegisteredNumber(), logMessageValidation, "210", "RegisteredNumber", "12", maLoi2, 100, status);
		
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "210", "MarkAsVehicle", "13", maLoi1, 0, 1, 0, false, status);
		
		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "210", "TradeMark", "14", maLoi2, 20, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "210", "ModelType", "15", maLoi2, 20, status);
		
		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "210", "VehicleType", "16", maLoi4, 20, status);
		}
		
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "210", "VehicleType", "17", maLoi4, 20, status);
		}
		
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "210", "ChassisNumber", "18", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "210", "EngineNumber", "19", maLoi4, 50, status);
		}
		
		//VehicleEngineStatus   
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleType()), logMessageValidation, "210", "VehicleEngineStatus", "20", maLoi1, 0, 1, 0, false, status);
		
		//MarkasPayment
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "210", "MarkasPayment", "21", maLoi1, 0, 1, 0, false, status);
		
		return status;
	}
}		

