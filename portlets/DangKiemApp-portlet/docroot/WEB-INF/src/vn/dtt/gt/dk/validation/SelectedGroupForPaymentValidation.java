package vn.dtt.gt.dk.validation;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment;
import vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment.ImportedVehicle;

public class SelectedGroupForPaymentValidation {
public static boolean validation(SelectedGroupForPayment obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//TransactionID, an..100
		status = ValidationUtils.checkValidation(obj.getTransactionID(), logMessageValidation, "222", "TransactionID", "02", maLoi2, 100, status);
		//PaymentRequestDate, date
		status = ValidationUtils.checkValidation(obj.getPaymentRequestDate(), logMessageValidation, "222", "PaymentRequestDate", "03", maLoi3, 50, status);

		//TotalOfSelectedVehicle, n..9
		if (obj.getTotalOfSelectedVehicle() >= 0) {
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfSelectedVehicle()), logMessageValidation, "222", "TotalOfSelectedVehicle", "04", maLoi5, 0, 9, 0, false, status);
		}

		//ImportedVehicle
		List<ImportedVehicle> lstImportedVehicle = obj.getImportedVehicle();
		//TODO 
		status = ValidationUtils.checkValidationListNull(lstImportedVehicle, logMessageValidation, "222", "ImportedVehicle", "05", status);
		
		if (lstImportedVehicle != null && lstImportedVehicle.size() > 0) {
			for (ImportedVehicle importedVehicle : lstImportedVehicle) {
				status = validationImportedVehicleList(importedVehicle, idMessageLog);
			}
		}
		
		return status;
	}

	private static boolean validationImportedVehicleList(ImportedVehicle obj, long idMessageLog) throws SystemException {
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
			
		//SequenceNo, n..9
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getSequenceNo()), logMessageValidation, "222", "SequenceNo", "05", maLoi1, 0, 9, 0, false, status);
			
		//RegisteredNumber, an..100
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "222", "RegisteredNumber", "06", maLoi2, 100, status);
		
		//InspectionRecordNumber, an..100
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "222", "InspectionRecordNumber", "07", maLoi2, 100, status);
		
		//InspectionRecordDate, date
		status = ValidationUtils.checkValidation(obj.getInspectionRecordDate(), logMessageValidation, "222", "InspectionRecordDate", "08", maLoi3, 50, status);
		
		//MarkAsVehicle, n..1
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getMarkAsVehicle()), logMessageValidation, "222", "MarkAsVehicle", "09", maLoi1, 0, 1, 0, false, status);
			
		//TradeMark
			status = ValidationUtils.checkValidation(obj.getTradeMark(), logMessageValidation, "222", "TradeMark", "10", maLoi2, 50, status);
			
		//ModelType
//			status = ValidationUtils.checkValidation(obj.getTradeMark(), logMessageValidation, "222", "ModelType", "11", maLoi2, 20, status);
			
		//TotalOfInspected
			if(obj.getTotalOfInspected() != null && obj.getTotalOfInspected().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getTradeMark(), logMessageValidation, "222", "TotalOfInspected", "12", maLoi4, 20, status);
			}
		
		return status;
	}

}
