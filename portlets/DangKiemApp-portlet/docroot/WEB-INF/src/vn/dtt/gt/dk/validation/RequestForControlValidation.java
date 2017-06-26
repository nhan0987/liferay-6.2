package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.RequestForControl;
import vn.dtt.gt.dk.nsw.model.RequestForControl.ImportedVehicle;
import vn.dtt.gt.dk.utils.format.FormatData;


public class RequestForControlValidation {

	public static boolean validation(RequestForControl obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getRequestTestingNumber(), logMessageValidation, "204", "RequestTestingNumber", "02", maLoi2, 255, status);
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "204", "RegisteredNumber", "03", maLoi2, 100, status);

		//InspectionRecordNumber
		status = ValidationUtils.checkValidation(obj.getInspectionRecordNumber(), logMessageValidation, "204", "InspectionRecordNumber", "04", maLoi2, 100, status);
		
		//InspectionRecordDate
		status = ValidationUtils.checkValidation(obj.getInspectionRecordDate(), logMessageValidation, "204", "InspectionRecordDate", "05", maLoi3, 50, status);
		
		//ReportTo
		status = ValidationUtils.checkValidation(obj.getReportTo(), logMessageValidation, "204", "ReportTo", "06", maLoi2, 155, status);
		
		//ContentOfRequest
		status = ValidationUtils.checkValidation(obj.getContentOfRequest(), logMessageValidation, "204", "ContentOfRequest", "07", maLoi2, 575, status);
		
		//ControlReportDeadline
		if (obj.getControlReportDeadline() != null && !FormatData.isThisDateValid(obj.getControlReportDeadline())) {
			status = false;
			logMessageValidation.setTagName("Message : 204" + "__" + "ControlReportDeadline");
			logMessageValidation.setValidationCode("N204708");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}

		//Remarks
		status = ValidationUtils.checkValidation(obj.getRemarks(), logMessageValidation, "204", "Remarks", "09", maLoi2, 575, status);

		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "204", "ImportedVehicle", "10", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}

		//Organization
		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "204", "Organization", "20", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "204", "Division", "21", maLoi2, 255, status);
		
		//ReportBy
		if(obj.getSignTitle() != null && obj.getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getSignTitle(), logMessageValidation, "204", "ReportBy", "22", maLoi4, 100, status);
		}
		
		//ReportDate
		if (obj.getReportDate() != null && !FormatData.isThisDateValid(obj.getReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 204" + "__" + "ReportDate");
			logMessageValidation.setValidationCode("N204723");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		
		//SignName
		status = ValidationUtils.checkValidation(obj.getSignName(), logMessageValidation, "204", "SignName", "24", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getSignTitle() != null && obj.getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getSignTitle(), logMessageValidation, "204", "SignTitle", "25", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getSignPlace(), logMessageValidation, "204", "SignPlace", "26", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getSignDate(), logMessageValidation, "204", "SignDate", "27", maLoi3, 50, status);
		
		
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "204", "SequenceNo", "11", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "204", "CodeNumber", "12", maLoi1, 0, 9, 0, false, status);

		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getMarkAsVehicle()), logMessageValidation, "204", "MarkAsVehicle", "13", maLoi1, 0, 1, 0, false, status);
		
		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "204", "VehicleType", "14", maLoi4, 20, status);
		}
		
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "204", "EngineType", "15", maLoi4, 20, status);
		}

		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "204", "TradeMark", "16", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "204", "ModelType", "17", maLoi2, 20, status);

		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "204", "ChassisNumber", "18", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "204", "EngineNumber", "19", maLoi4, 50, status);
		}
		
		return status;
	}
}
