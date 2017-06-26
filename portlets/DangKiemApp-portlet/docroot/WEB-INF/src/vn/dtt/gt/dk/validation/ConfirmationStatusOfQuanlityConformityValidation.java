package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.COPReport;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.CustomDeclaration;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.EmissionTestReport;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SafetyTestReport;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem;
import vn.dtt.gt.dk.utils.format.FormatData;



public class ConfirmationStatusOfQuanlityConformityValidation {

	public static boolean validation(ConfirmationStatusOfQuanlityConformity obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };//bat buoc dang so
		int[] maLoi2 = { 1, 5, 6 };//bat buoc dang chu
		int[] maLoi3 = { 1, 7 }; // bat buoc ngay thang
		int[] maLoi4 = { 5, 6 };//dang chu	
		int[] maLoi5 = { 3, 4 };//dang so
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//CertificateNumber
		status = ValidationUtils.checkValidation(obj.getCertificateNumber(), logMessageValidation, "216", "CertificateNumber", "02", maLoi2, 100, status);
		
		//VehicleEngineStatus
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getVehicleEngineStatus()), logMessageValidation, "216", "VehicleEngineStatus", "03", maLoi1, 0, 1, 0, false, status);
		
		//TODO Importer
		status = ValidationUtils.checkValidationNull(obj.getImporter(), logMessageValidation, "216", "Importer", "04", status);
		if(status){
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getImporter().getImporterCode()), logMessageValidation, "216", "ImporterCode", "05", maLoi1, 0, 13, 0, false, status);
		
		//ImporterName
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterName(), logMessageValidation, "216", "ImporterName", "06", maLoi2, 255, status);
		
		//ImporterAddress
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterAddress(), logMessageValidation, "216", "ImporterAddress", "07", maLoi2, 500, status);
		}
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getCodeNumber()), logMessageValidation, "216", "CodeNumber", "08", maLoi1, 0, 9, 0, false, status);
		
		//TradeMark
		status = ValidationUtils.checkValidation(obj.getTradeMark(), logMessageValidation, "216", "TradeMark", "09", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(obj.getModelType(), logMessageValidation, "216", "ModelType", "10", maLoi2, 20, status);
		
		//ModelCode
		if(obj.getModelCode() !=null && obj.getModelCode().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getModelCode(), logMessageValidation, "216", "ModelCode", "10a", maLoi4, 50, status);
		}
		
		//TODO ProductionCountry
		status = ValidationUtils.checkValidationNull(obj.getProductionCountry(), logMessageValidation, "216", "ProductionCountry", "11", status);
		
		//CountryCode
		if(obj.getProductionCountry() != null){
			if(obj.getProductionCountry().getCountryCode() != null && obj.getProductionCountry().getCountryCode().size() > 0){
				for(int i = 0; i < obj.getProductionCountry().getCountryCode().size(); i ++){
					status = ValidationUtils.checkValidation(obj.getProductionCountry().getCountryCode().get(i), logMessageValidation, "216", "CountryCode", "12", maLoi2, 2, status);
				}
			}
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getProductionYear()), logMessageValidation, "216", "ProductionYear", "13", maLoi1, 0, 9, 0, false, status);
		
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getMarkAsVehicle()), logMessageValidation, "216", "MarkAsVehicle", "14", maLoi1, 0, 1, 0, false, status);
		
		//VehicleType
		if(obj.getVehicleType() != null && obj.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getVehicleType(), logMessageValidation, "216", "VehicleType", "15", maLoi4, 20, status);
		}
		
		//EngineType
		if(obj.getEngineType() != null && obj.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineType(), logMessageValidation, "216", "EngineType", "16", maLoi4, 20, status);
		}
		
		//ChassisNumber
		status = ValidationUtils.checkValidation(obj.getChassisNumber(), logMessageValidation, "216", "ChassisNumber", "17", maLoi2, 50, status);
		
		//EngineNumber
		if(obj.getEngineNumber() != null && obj.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineNumber(), logMessageValidation, "216", "EngineNumber", "18", maLoi4, 50, status);
		}
		
		//CustomDeclaration
		List<CustomDeclaration> liCustomDeclaration = obj.getCustomDeclaration();
		//TODO
		status = ValidationUtils.checkValidationListNull(liCustomDeclaration, logMessageValidation, "216", "CustomDeclaration", "19", status);
		if(liCustomDeclaration!= null && liCustomDeclaration.size()>0){
			for(CustomDeclaration customDeclaration : liCustomDeclaration){
				status=validationCustomDeclarationlist(customDeclaration, idMessageLog);
			}
		}
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "216", "RegisteredNumber", "22", maLoi2, 100, status);
		
		//InspectionRecordNumber
		status = ValidationUtils.checkValidation(obj.getInspectionRecordNumber(), logMessageValidation, "216", "InspectionRecordNumber", "23", maLoi2, 100, status);
		
		//InspectionRecordDate
		status = ValidationUtils.checkValidation(obj.getInspectionRecordDate(), logMessageValidation, "216", "InspectionRecordDate", "24", maLoi3, 50, status);
		
		//InspectionSite
		status = ValidationUtils.checkValidation(obj.getInspectionSite(), logMessageValidation, "216", "InspectionSite", "25", maLoi2, 255, status);
		
		//SafetyTestReport
		List<SafetyTestReport> liSafetyTestReport = obj.getSafetyTestReport();
		//TODO
		status = ValidationUtils.checkValidationListNull(liSafetyTestReport, logMessageValidation, "216", "SafetyTestReport", "26", status);
		if(liSafetyTestReport != null && liSafetyTestReport.size()>0){
			for(SafetyTestReport safetyTestReport : liSafetyTestReport){
				status=validationSafetyTestReportlist(safetyTestReport, idMessageLog);
			}
		}
		
		//EmissionTestReport
		List<EmissionTestReport> liEmissionTestReport = obj.getEmissionTestReport();
		//TODO
		status = ValidationUtils.checkValidationListNull(liEmissionTestReport, logMessageValidation, "216", "EmissionTestReport", "29", status);
		if(liEmissionTestReport != null && liEmissionTestReport.size()>0){
			for(EmissionTestReport emissionTestReport : liEmissionTestReport){
				status=validationEmissionTestReportlist(emissionTestReport, idMessageLog);
			}
		}
		
		//COPReport
		List<COPReport> liCOPReport = obj.getCOPReport();
		//TODO
		status = ValidationUtils.checkValidationListNull(liCOPReport, logMessageValidation, "216", "COPReport", "32", status);
		if(liCOPReport != null && liCOPReport.size()>0){
			for(COPReport cOPReport : liCOPReport){
				status=validationCOPReportlist(cOPReport, idMessageLog);
			}
		}
		//TODO SpecificationList
				status = ValidationUtils.checkValidationNull(obj.getSpecificationList(), logMessageValidation, "216", "SpecificationList", "35", status);
//				if(status){		
//		//SpecItem
//		List<SpecItem> liSpecItem = obj.getSpecificationList().getSpecItem();
//		//TODO
//				status = ValidationUtils.checkValidationNull(liSpecItem, logMessageValidation, "216", "SpecItem", "36", status);
//		if(liSpecItem != null && liSpecItem.size()>0){
//			for(SpecItem specItem : liSpecItem){
//				status=validationSpecItemlist(specItem, idMessageLog);
//			}
//		}
//				}
		//Circular
		List<Circular> liCircular = obj.getCircular();
		//TODO
		status = ValidationUtils.checkValidationListNull(liCircular, logMessageValidation, "216", "Circular", "45", status);
		if(liCircular != null && liCircular.size()>0){
			for(Circular circular : liCircular){
				status=validationCircularlist(circular, idMessageLog);
			}
		}
		
		
		
		//Remarks
		if(obj.getRemarks() != null && obj.getRemarks().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getRemarks(), logMessageValidation, "216", "Remarks", "49", maLoi4, 255, status);
		}
		
		//TODO InspectorSign
		status = ValidationUtils.checkValidationNull(obj.getInspectorSign(), logMessageValidation, "216", "InspectorSign", "50", status);
		if(status){
		//Organization
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getOrganization(), logMessageValidation, "216", "Organization", "51", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getDivision(), logMessageValidation, "216", "Division", "52", maLoi2, 255, status);
		
		//SignName
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignName(), logMessageValidation, "216", "SignName", "53", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getInspectorSign().getSignTitle() != null && obj.getInspectorSign().getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignTitle(), logMessageValidation, "216", "SignTitle", "54", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignPlace(), logMessageValidation, "216", "SignPlace", "55", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignDate(), logMessageValidation, "216", "SignDate", "56", maLoi3, 50, status);
		}
		
		return status;
	}

	private static boolean validationCustomDeclarationlist(CustomDeclaration customDeclaration, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//ImportCustomDeclareNo
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareNo(), logMessageValidation, "216", "ImportCustomDeclareNo", "20", maLoi2, 20, status);
		
		//ImportCustomDeclareDate
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareDate(), logMessageValidation, "216", "ImportCustomDeclareDate", "21", maLoi3, 50, status);
		
		return status;
	}


	private static boolean validationSafetyTestReportlist(SafetyTestReport safetyTestReport, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//SafetyTestReportNumber
		if(safetyTestReport.getSafetyTestReportNumber() != null && safetyTestReport.getSafetyTestReportNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(safetyTestReport.getSafetyTestReportNumber(), logMessageValidation, "216", "SafetyTestReportNumber", "27", maLoi4, 100, status);
		}
		
		//SafetyTestReportDate
		if (safetyTestReport.getSafetyTestReportDate() != null && !FormatData.isThisDateValid(safetyTestReport.getSafetyTestReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 216" + "__" + "SafetyTestReportDate");
			logMessageValidation.setValidationCode("N216728");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		return status;
	}


	private static boolean validationEmissionTestReportlist(EmissionTestReport emissionTestReport, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//EmissionTestReportNumber
		if(emissionTestReport.getEmissionTestReportNumber() != null && emissionTestReport.getEmissionTestReportNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(emissionTestReport.getEmissionTestReportNumber(), logMessageValidation, "216", "EmissionTestReportNumber", "30", maLoi4, 100, status);
		}
		
		//EmissionTestReportDate
		if (emissionTestReport.getEmissionTestReportDate() != null && !FormatData.isThisDateValid(emissionTestReport.getEmissionTestReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 216" + "__" + "EmissionTestReportDate");
			logMessageValidation.setValidationCode("N216731");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		
		return status;
	}


	private static boolean validationCOPReportlist(COPReport cOPReport, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//COPReportNumber
		if(cOPReport.getCOPReportNumber() != null && cOPReport.getCOPReportNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(cOPReport.getCOPReportNumber(), logMessageValidation, "216", "COPReportNumber", "33", maLoi4, 100, status);
		}
		
		//COPTestReportDate
		if (cOPReport.getCOPReportNumber() != null && !FormatData.isThisDateValid(cOPReport.getCOPReportNumber())) {
			status = false;
			logMessageValidation.setTagName("Message : 216" + "__" + "COPTestReportDate");
			logMessageValidation.setValidationCode("N216734");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		return status;
	}

	private static boolean validationSpecItemlist(SpecItem specItem, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//SpecificationCode
		status = ValidationUtils.checkValidation(specItem.getSpecificationCode(), logMessageValidation, "216", "SpecificationCode", "37", maLoi2, 9, status);
		
		//SpecificationName
		status = ValidationUtils.checkValidation(specItem.getSpecificationName(), logMessageValidation, "216", "SpecificationName", "38", maLoi2, 255, status);
		
		//DeclarationValue1
		status = ValidationUtils.checkValidation(specItem.getDeclarationValue1(), logMessageValidation, "216", "DeclarationValue1", "39", maLoi2, 255, status);
		
		//DeclarationValue2
		if(specItem.getDeclarationValue2() != null && specItem.getDeclarationValue2().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue2(), logMessageValidation, "216", "DeclarationValue2", "40", maLoi4, 255, status);
		}
		
		//DeclarationValue3
		if(specItem.getDeclarationValue3() != null && specItem.getDeclarationValue3().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue3(), logMessageValidation, "216", "DeclarationValue3", "41", maLoi4, 255, status);
		}
		
		//DeclarationValue4
		if(specItem.getDeclarationValue4() != null && specItem.getDeclarationValue4().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue4(), logMessageValidation, "216", "DeclarationValue4", "42", maLoi4, 255, status);
		}
		
		//DeclarationValue5
		if(specItem.getDeclarationValue5() != null && specItem.getDeclarationValue5().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue5(), logMessageValidation, "216", "DeclarationValue5", "43", maLoi4, 255, status);
		}
				
		//DeclarationValue6
		if(specItem.getDeclarationValue6() != null && specItem.getDeclarationValue6().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue6(), logMessageValidation, "216", "DeclarationValue6", "44", maLoi4, 255, status);
		}
		
		return status;
	}

	private static boolean validationCircularlist(Circular circular, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(circular.getSequenceNo()), logMessageValidation, "216", "SequenceNo", "46", maLoi1, 0, 1, 0, false, status);
		
		//CircularNo
		status = ValidationUtils.checkValidation(circular.getCircularNo(), logMessageValidation, "216", "CircularNo", "47", maLoi2, 100, status);
				
		//CircularDate
		status = ValidationUtils.checkValidation(circular.getCircularDate(), logMessageValidation, "216", "CircularDate", "48", maLoi3, 50, status);
				
		return false;
	}



}
