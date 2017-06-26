package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting;
import vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting.ImportedVehicle;
import vn.dtt.gt.dk.utils.format.FormatData;



public class RequestOfEmissionTestingValidation {

	public static boolean validation(RequestOfEmissionTesting obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//RequestTestingNumber
		status = ValidationUtils.checkValidation(obj.getRequestTestingNumber(), logMessageValidation, "202", "RequestTestingNumber", "02", maLoi2, 255, status);
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "202", "RegisteredNumber", "03", maLoi2, 100, status);

		//InspectionRecordNumber
		status = ValidationUtils.checkValidation(obj.getInspectionRecordNumber(), logMessageValidation, "202", "InspectionRecordNumber", "04", maLoi2, 100, status);
		
		//InspectionRecordDate
		status = ValidationUtils.checkValidation(obj.getInspectionRecordDate(), logMessageValidation, "202", "InspectionRecordDate", "05", maLoi3, 50, status);
		
		//ReportTo
		status = ValidationUtils.checkValidation(obj.getReportTo(), logMessageValidation, "202", "ReportTo", "06", maLoi2, 155, status);
		
		//ContentOfRequest
		status = ValidationUtils.checkValidation(obj.getContentOfRequest(), logMessageValidation, "202", "ContentOfRequest", "07", maLoi2, 575, status);
		
		//TestingRegisteredPlace
		status = ValidationUtils.checkValidation(obj.getTestingRegisteredPlace(), logMessageValidation, "202", "TestingRegisteredPlace", "08", maLoi2, 575, status);
		
		//TestingRegistration
		status = ValidationUtils.checkValidation(obj.getTestingRegistration(), logMessageValidation, "202", "TestingRegistration", "09", maLoi2, 575, status);
		
		//TestingPayment
		status = ValidationUtils.checkValidation(obj.getTestingPayment(), logMessageValidation, "202", "TestingPayment", "10", maLoi2, 575, status);
		
		//Remarks
		status = ValidationUtils.checkValidation(obj.getRemarks(), logMessageValidation, "202", "Remarks", "11", maLoi2, 575, status);

		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "202", "ImportedVehicle", "12", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}

		//Organization
		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "202", "Organization", "22", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "202", "Division", "23", maLoi2, 255, status);
		
		//ReportBy
		if(obj.getSignTitle() != null && obj.getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getSignTitle(), logMessageValidation, "202", "ReportBy", "24", maLoi4, 100, status);
		}
		
		//ReportDate
		if (obj.getReportDate() != null && !FormatData.isThisDateValid(obj.getReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 202" + "__" + "ReportDate");
			logMessageValidation.setValidationCode("N202725");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		
		//SignName
		status = ValidationUtils.checkValidation(obj.getSignName(), logMessageValidation, "202", "SignName", "26", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getSignTitle() != null && obj.getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getSignTitle(), logMessageValidation, "202", "SignTitle", "27", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getSignPlace(), logMessageValidation, "202", "SignPlace", "28", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getSignDate(), logMessageValidation, "202", "SignDate", "29", maLoi3, 50, status);
		
		
		
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "202", "SequenceNo", "13", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "202", "CodeNumber", "14", maLoi1, 0, 9, 0, false, status);

		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "202", "MarkAsVehicle", "15", maLoi1, 0, 1, 0, false, status);
		
		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "202", "VehicleType", "16", maLoi4, 20, status);
		}
		
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "202", "EngineType", "17", maLoi4, 20, status);
		}

		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "202", "TradeMark", "18", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "202", "ModelType", "19", maLoi2, 20, status);

		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "206", "ChassisNumber", "20", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "202", "EngineNumber", "21", maLoi4, 50, status);
		}
		
		return status;
	}
}