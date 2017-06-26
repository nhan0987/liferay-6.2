package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ScheduleReport;
import vn.dtt.gt.dk.nsw.model.ScheduleReport.ImportedVehicle;
import vn.dtt.gt.dk.nsw.model.ScheduleReport.InspectionAttendee;



public class ScheduleReportValidation {

	public static boolean validation(ScheduleReport obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "201", "RegisteredNumber", "02", maLoi2, 100, status);

		//TODO Inspection
		status = ValidationUtils.checkValidationNull(obj.getInspection(), logMessageValidation, "201", "Inspection", "03", status);
		if(status){
		//InpectionDate
		status = ValidationUtils.checkValidation(obj.getInspection().getInpectionDate(), logMessageValidation, "201", "InpectionDate", "04", maLoi3, 50, status);
		
		//InspectionSite
		status = ValidationUtils.checkValidation(obj.getInspection().getInspectionSite(), logMessageValidation, "201", "InspectionSite", "05", maLoi2, 255, status);
		
		//DistrictCode
		status = ValidationUtils.checkValidation(obj.getInspection().getDistrictCode(), logMessageValidation, "201", "DistrictCode", "06", maLoi2, 20, status);
		
		//DistrictName
		status = ValidationUtils.checkValidation(obj.getInspection().getDistrictName(), logMessageValidation, "201", "DistrictName", "07", maLoi2, 50, status);
		
		//ProvinceCode
		status = ValidationUtils.checkValidation(obj.getInspection().getProvinceCode(), logMessageValidation, "201", "ProvinceCode", "08", maLoi2, 20, status);
		
		//ProvinceName
		status = ValidationUtils.checkValidation(obj.getInspection().getProvinceName(), logMessageValidation, "201", "ProvinceName", "09", maLoi2, 50, status);
		}
		//TODO Contacter
		status = ValidationUtils.checkValidationNull(obj.getContacter(), logMessageValidation, "201", "Contacter", "10", status);
		if(status){
		//ContactName
		status = ValidationUtils.checkValidation(obj.getContacter().getContactName(), logMessageValidation, "201", "ContactName", "11", maLoi2, 255, status);
				
		//ContactPhone
		status = ValidationUtils.checkValidation(obj.getContacter().getContactPhone(), logMessageValidation, "201", "ContactPhone", "12", maLoi2, 100, status);
		
		//ContactEmail
		if(obj.getContacter().getContactEmail() != null && obj.getContacter().getContactEmail().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getContacter().getContactEmail(), logMessageValidation, "201", "ContactEmail", "13", maLoi4, 100, status);
		}
		}
		//TotalOfRequested
		if (obj.getTotalOfRequested() >= 0) {
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalOfRequested()), logMessageValidation, "201", "TotalOfRequested", "14", maLoi5, 0, 9, 0, false, status);
		}

		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "201", "ImportedVehicle", "15", status);
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}

		//Remarks
		if(obj.getRemarks() != null && obj.getRemarks().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getRemarks(), logMessageValidation, "201", "Remarks", "24", maLoi4, 255, status);
		}
		
		//InspectionAttendee
		List<InspectionAttendee> liInspectionAttendee = obj.getInspectionAttendee();
		//TODO
		status = ValidationUtils.checkValidationListNull(liInspectionAttendee, logMessageValidation, "201", "InspectionAttendee", "25", status);
		if(liInspectionAttendee != null && liInspectionAttendee.size()>0){
			for(InspectionAttendee inspectionAttendee : liInspectionAttendee){
				status=validationInspectionAttendeelist(inspectionAttendee, idMessageLog);
			}
		}
		//TODO InspectorSign
		status = ValidationUtils.checkValidationNull(obj.getInspectorSign(), logMessageValidation, "201", "InspectorSign", "29", status);
		if(status){
		//Organization
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getOrganization(), logMessageValidation, "211", "Organization", "30", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getDivision(), logMessageValidation, "211", "Division", "31", maLoi2, 255, status);
		
		//SignName
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignName(), logMessageValidation, "211", "SignName", "32", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getInspectorSign().getSignTitle() != null && obj.getInspectorSign().getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignTitle(), logMessageValidation, "211", "SignTitle", "33", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignPlace(), logMessageValidation, "211", "SignPlace", "34", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignDate(), logMessageValidation, "211", "SignDate", "35", maLoi3, 50, status);
		}
		return status;
		
	}

	private static boolean validationInspectionAttendeelist(
			InspectionAttendee inspectionAttendee, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//AttendeeID
		status = ValidationUtils.checkValidation(inspectionAttendee.getAttendeeID(), logMessageValidation, "201", "AttendeeID", "26", maLoi2, 50, status);
		
		//AttendeeName
		if(inspectionAttendee.getAttendeeName() != null && inspectionAttendee.getAttendeeName().trim().length() > 0){
			status = ValidationUtils.checkValidation(inspectionAttendee.getAttendeeName(), logMessageValidation, "201", "AttendeeName", "27", maLoi4, 255, status);
		}
		
		//AttendeeRole
		if(inspectionAttendee.getAttendeeRole() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(inspectionAttendee.getAttendeeRole()), logMessageValidation, "201", "AttendeeRole", "28", maLoi5, 0, 9, 0, false , status);
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "201", "SequenceNo", "16", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "201", "CodeNumber", "17", maLoi1, 0, 9, 0, false, status);

		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "201", "VehicleType", "18", maLoi4, 20, status);
		}
		
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "201", "EngineType", "19", maLoi4, 20, status);
		}

		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "201", "TradeMark", "20", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "201", "ModelType", "21", maLoi2, 20, status);

		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "206", "ChassisNumber", "22", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "211", "EngineNumber", "23", maLoi4, 50, status);
		}
		
		
		return status;
	}
}
