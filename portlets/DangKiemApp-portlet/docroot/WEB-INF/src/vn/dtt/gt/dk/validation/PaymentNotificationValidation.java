package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.nsw.model.PaymentNotification;
import vn.dtt.gt.dk.nsw.model.PaymentNotification.ImportedVehicle;
import vn.dtt.gt.dk.utils.format.FormatData;


public class PaymentNotificationValidation {

	public static boolean validation(PaymentNotification obj, long idMessageLog) throws Exception {
		
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
		String transactionId=obj.getTransactionID();
		status = ValidationUtils.checkValidation(transactionId, logMessageValidation, "208", "TransactionID", "02", maLoi2, 100, status);
		//
		//DebitNoteNumber
		String debitNoteNumber =obj.getDebitNoteNumber();
		status = ValidationUtils.checkValidation(debitNoteNumber, logMessageValidation, "208", "DebitNoteNumber", "03", maLoi2, 255, status);
		DebitNote debitNote =DebitNoteLocalServiceUtil.findByDebitNoteNumber(debitNoteNumber);
//		_log.info("  debitNoteNumber "+debitNoteNumber);
		if(debitNote==null){
//			_log.info("  debitNote==null");
			status =false;
			logMessageValidation.setTagName("Message : 208" + "__" + "DebitNoteNumber is null");
			logMessageValidation.setValidationCode("N208706");
			logMessageValidation.setDescription("DebitNoteNumber is null");
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}else{
			if(debitNote.getTransactionId()!=null&&debitNote.getTransactionId().length()>0&&debitNote.getTransactionId().equals(transactionId)){
				if(debitNote.getMarkAsDeleted()>0){
//					_log.info("  debitNote.getMarkAsDeleted()>0 ");
					status =false;
					logMessageValidation.setTagName("Message : 208" + "__" + "getMarkAsDeleted");
					logMessageValidation.setValidationCode("N208706");
					logMessageValidation.setDescription("getMarkAsDeleted >0");
					ValidationUtils.addLogMessageValidation(logMessageValidation);
				}else if(debitNote.getTotalPayment()!=obj.getPaymentSummary().getTotalOfPayment()){
//					_log.info("  debitNote.getTotalPayment()!=obj.getPaymentSummary().getTotalOfPayment() ");
					status =false;
					logMessageValidation.setTagName("Message : 208" + "__" + "TotalOfPayment");
					logMessageValidation.setValidationCode("N208706");
					logMessageValidation.setDescription("TotalOfPayment Khong dung");
					ValidationUtils.addLogMessageValidation(logMessageValidation);
					if(!status){
						return status;
					}
				}else{
					int count =DebitNoteDetailsLocalServiceUtil.countByDebitNoteId(debitNote.getId());
					if(count!=obj.getImportedVehicle().size()){
//						_log.info("  count!=obj.getImportedVehicle().size() ");
						
						status =false;
						logMessageValidation.setTagName("Message : 208" + "__" + "count xe");
						logMessageValidation.setValidationCode("N208706");
						logMessageValidation.setDescription("So luong xe khong trung nhau");
						ValidationUtils.addLogMessageValidation(logMessageValidation);
						if(!status){
							return status;
						}
					}
				}
			}else{
				status =false;
				logMessageValidation.setTagName("Message : 208" + "__" + "transactionId khong trung nhau");
				logMessageValidation.setValidationCode("N208706");
				logMessageValidation.setDescription("transactionId khong trung nhau");
				ValidationUtils.addLogMessageValidation(logMessageValidation);
				if(!status){
					return status;
				}
			}
		}
		if(!status){
			return status;
		}
		//ReportDate
		status = ValidationUtils.checkValidation(obj.getReportDate(), logMessageValidation, "208", "ReportDate", "04", maLoi3, 50, status);
		if(!status){
			return status;
		}
		//TODO PaymentSummary
		status = ValidationUtils.checkValidationNull(obj.getPaymentSummary(), logMessageValidation, "208", "PaymentSummary", "05", status);
		if(status){
		//PaymentDate
		if (obj.getPaymentSummary().getPaymentDate() != null && !FormatData.isThisDateValid(obj.getPaymentSummary().getPaymentDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 208" + "__" + "PaymentDates");
			logMessageValidation.setValidationCode("N208706");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		if(!status){
			return status;
		}
		//TotalOfPayment
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getPaymentSummary().getTotalOfPayment()), logMessageValidation, "208", "TotalOfPayment", "07", maLoi1, 0, 20, 0, false, status);
		if(!status){
			return status;
		}
		//TotalOfVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getPaymentSummary().getTotalOfVehicle()), logMessageValidation, "208", "TotalOfVehicle", "08", maLoi1, 0, 9, 0, false, status);
		}
		if(!status){
			return status;
		}
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "208", "ImportedVehicle", "09", status);
		
			if(liImportedVehicle != null  && liImportedVehicle.size()>0){
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
		int[] maLoi4 = { 5, 6 };
		
		//SequenceNo
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "208", "SequenceNo", "10", maLoi1, 0, 9, 0, false, status);
		
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "208", "CodeNumber", "11", maLoi1, 0, 9, 0, false, status);
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(importedVehicle.getRegisteredNumber(), logMessageValidation, "208", "RegisteredNumber", "12", maLoi2, 100, status);
		
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "208", "MarkAsVehicle", "13", maLoi1, 0, 1, 0, false, status);
		
		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "208", "TradeMark", "14", maLoi2, 20, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "208", "ModelType", "15", maLoi2, 20, status);
		
		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "208", "VehicleType", "16", maLoi4, 20, status);
		}
		
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "208", "VehicleType", "17", maLoi4, 20, status);
		}
		
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "208", "ChassisNumber", "18", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "208", "EngineNumber", "19", maLoi4, 50, status);
		}
		
		//VehicleEngineStatus   
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleType()), logMessageValidation, "208", "VehicleEngineStatus", "20", maLoi1, 0, 1, 0, false, status);
		
		//MarkasPayment
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "208", "MarkasPayment", "21", maLoi1, 0, 1, 0, false, status);
		
		return status;
		
	}
}
