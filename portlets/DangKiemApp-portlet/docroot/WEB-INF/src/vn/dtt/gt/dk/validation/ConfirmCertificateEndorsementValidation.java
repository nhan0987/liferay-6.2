package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.COPReport;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.Circular;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.CustomDeclaration;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.EmissionTestReport;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SafetyTestReport;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem;
import vn.dtt.gt.dk.utils.format.FormatData;

public class ConfirmCertificateEndorsementValidation {

	public static boolean validation(ConfirmCertificateEndorsement obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };//bat buoc dang so
		int[] maLoi2 = { 1, 5, 6 };//bat buoc dang chu
		int[] maLoi3 = { 1, 7 }; // bat buoc ngay thang
		int[] maLoi4 = { 5, 6 };//dang chu	
		int[] maLoi5 = { 3, 4 };//dang so
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//TODO Confirmation
		status = ValidationUtils.checkValidationNull(obj.getConfirmation(), logMessageValidation, "217", "Confirmation", "02", status);
		if(status){
		//CertificateNumber
		status = ValidationUtils.checkValidation(obj.getConfirmation().getCertificateNumber(), logMessageValidation, "217", "CertificateNumber", "03", maLoi2, 100, status);
		
		//CertificateStatus
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getConfirmation().getCertificateStatus()), logMessageValidation, "217", "CertificateStatus", "04", maLoi1, 0, 1, 0, false, status);
		
		//ExpiryDate
		if (obj.getConfirmation().getExpiryDate() != null && !FormatData.isThisDateValid(obj.getConfirmation().getExpiryDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 217" + "__" + "ExpiryDate");
			logMessageValidation.setValidationCode("N217705");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		}
		//NewCertificateNumber
		status = ValidationUtils.checkValidation(obj.getNewCertificateNumber(), logMessageValidation, "217", "NewCertificateNumber", "06", maLoi2, 100, status);
		
		//VehicleEngineStatus
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getVehicleEngineStatus()), logMessageValidation, "217", "VehicleEngineStatus", "07", maLoi1, 0, 1, 0, false, status);
		
		//TODO Importer
		status = ValidationUtils.checkValidationNull(obj.getImporter(), logMessageValidation, "217", "Importer", "08", status);
		if(status){
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getImporter().getImporterCode()), logMessageValidation, "217", "ImporterCode", "09", maLoi1, 0, 13, 0, false, status);
		
		//ImporterName
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterName(), logMessageValidation, "217", "ImporterName", "10", maLoi2, 255, status);
		
		//ImporterAddress
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterAddress(), logMessageValidation, "217", "ImporterAddress", "11", maLoi2, 500, status);
		}
		//TradeMark
		status = ValidationUtils.checkValidation(obj.getTradeMark(), logMessageValidation, "217", "TradeMark", "12", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(obj.getModelType(), logMessageValidation, "217", "ModelType", "13", maLoi2, 20, status);
		
		//ModelCode
		if(obj.getModelCode() !=null && obj.getModelCode().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getModelCode(), logMessageValidation, "217", "ModelCode", "13a", maLoi4, 50, status);
		}
		//TODO ProductionCountry
		status = ValidationUtils.checkValidationNull(obj.getProductionCountry(), logMessageValidation, "217", "ProductionCountry", "14", status);
		
		//CountryCode
		if(obj.getProductionCountry() != null){
			if(obj.getProductionCountry().getCountryCode() != null && obj.getProductionCountry().getCountryCode().size() > 0){
				for(int i = 0; i < obj.getProductionCountry().getCountryCode().size(); i ++){
					status = ValidationUtils.checkValidation(obj.getProductionCountry().getCountryCode().get(i), logMessageValidation, "217", "CountryCode", "15", maLoi2, 2, status);
				}
			}
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getProductionYear()), logMessageValidation, "217", "ProductionYear", "16", maLoi1, 0, 9, 0, false, status);
		
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getMarkAsVehicle()), logMessageValidation, "217", "MarkAsVehicle", "17", maLoi1, 0, 1, 0, false, status);
		
		//VehicleType
		if(obj.getVehicleType() != null && obj.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getVehicleType(), logMessageValidation, "217", "VehicleType", "18", maLoi4, 20, status);
		}
		
		//EngineType
		if(obj.getEngineType() != null && obj.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineType(), logMessageValidation, "217", "EngineType", "19", maLoi4, 20, status);
		}
		
		//ChassisNumber
		status = ValidationUtils.checkValidation(obj.getChassisNumber(), logMessageValidation, "217", "ChassisNumber", "20", maLoi2, 50, status);
		
		//EngineNumber
		if(obj.getEngineNumber() != null && obj.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineNumber(), logMessageValidation, "217", "EngineNumber", "21", maLoi4, 50, status);
		}
		
		//CustomDeclaration
		List<CustomDeclaration> liCustomDeclaration = obj.getCustomDeclaration();
		//TODO
//		status = ValidationUtils.checkValidationListNull(liCustomDeclaration, logMessageValidation, "217", "CustomDeclaration", "22", status);
		if(liCustomDeclaration != null && liCustomDeclaration.size()>0){
			for(CustomDeclaration customDeclaration : liCustomDeclaration){
				status=validationCustomDeclarationlist(customDeclaration, idMessageLog);
			}
		}
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "217", "RegisteredNumber", "25", maLoi2, 100, status);
		
		//InspectionRecordNumber
		status = ValidationUtils.checkValidation(obj.getInspectionRecordNumber(), logMessageValidation, "217", "InspectionRecordNumber", "26", maLoi2, 100, status);
		
		//InspectionRecordDate
		status = ValidationUtils.checkValidation(obj.getInspectionRecordDate(), logMessageValidation, "217", "InspectionRecordDate", "27", maLoi3, 50, status);
		
		//InspectionSite
		status = ValidationUtils.checkValidation(obj.getInspectionSite(), logMessageValidation, "217", "InspectionSite", "28", maLoi2, 255, status);
		
		//SafetyTestReport
		List<SafetyTestReport> liSafetyTestReport = obj.getSafetyTestReport();
		//TODO
		status = ValidationUtils.checkValidationListNull(liSafetyTestReport, logMessageValidation, "217", "SafetyTestReport", "29", status);
		if(liSafetyTestReport != null && liSafetyTestReport.size()>0){
			for(SafetyTestReport safetyTestReport : liSafetyTestReport){
				status=validationSafetyTestReportlist(safetyTestReport, idMessageLog);
			}
		}
		
		//EmissionTestReport
		List<EmissionTestReport> liEmissionTestReport = obj.getEmissionTestReport();
		//TODO
		status = ValidationUtils.checkValidationListNull(liEmissionTestReport, logMessageValidation, "217", "EmissionTestReport", "32", status);
		
		if(liEmissionTestReport != null && liEmissionTestReport.size()>0){
			for(EmissionTestReport emissionTestReport : liEmissionTestReport){
				status=validationEmissionTestReportlist(emissionTestReport, idMessageLog);
			}
		}
		
		//COPReport
		List<COPReport> liCOPReport = obj.getCOPReport();
		//TODO
		status = ValidationUtils.checkValidationListNull(liCOPReport, logMessageValidation, "217", "COPReport", "35", status);
		
		if(liCOPReport != null && liCOPReport.size()>0){
			for(COPReport cOPReport : liCOPReport){
				status=validationCOPReportlist(cOPReport, idMessageLog);
			}
		}
		//TODO SpecificationList
		status = ValidationUtils.checkValidationNull(obj.getSpecificationList(), logMessageValidation, "217", "SpecificationList", "38", status);
//		if(status){
//		//SpecItem
//		List<SpecItem> liSpecItem = obj.getSpecificationList().getSpecItem();
//		//TODO
//		status = ValidationUtils.checkValidationNull(liSpecItem, logMessageValidation, "217", "SpecItem", "39", status);
//		if(liSpecItem != null && liSpecItem.size()>0){
//			for(SpecItem specItem : liSpecItem){
//				status=validationSpecItemlist(specItem, idMessageLog);
//			}
//		}
//		}
		//Circular
		List<Circular> liCircular = obj.getCircular();
		//TODO
		status = ValidationUtils.checkValidationListNull(liCircular, logMessageValidation, "217", "Circular", "45", status);
		
		if(liCircular != null && liCircular.size()>0){
			for(Circular circular : liCircular){
				status=validationCircularlist(circular, idMessageLog);
			}
		}
		
		
		
		//Remarks
		if(obj.getRemarks() != null && obj.getRemarks().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getRemarks(), logMessageValidation, "217", "Remarks", "50", maLoi4, 255, status);
		}
		
		//TODO InspectorSign
		status = ValidationUtils.checkValidationNull(obj.getInspectorSign(), logMessageValidation, "217", "InspectorSign", "51", status);
		if(status){
		//Organization
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getOrganization(), logMessageValidation, "217", "Organization", "52", maLoi2, 255, status);
		
		//Division
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getDivision(), logMessageValidation, "217", "Division", "53", maLoi2, 255, status);
		
		//SignName
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignName(), logMessageValidation, "217", "SignName", "54", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getInspectorSign().getSignTitle() != null && obj.getInspectorSign().getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignTitle(), logMessageValidation, "217", "SignTitle", "55", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignPlace(), logMessageValidation, "217", "SignPlace", "56", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignDate(), logMessageValidation, "217", "SignDate", "57", maLoi3, 50, status);
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
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareNo(), logMessageValidation, "217", "ImportCustomDeclareNo", "23", maLoi2, 20, status);
		
		//ImportCustomDeclareDate
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareDate(), logMessageValidation, "217", "ImportCustomDeclareDate", "24", maLoi3, 50, status);
		
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
			status = ValidationUtils.checkValidation(safetyTestReport.getSafetyTestReportNumber(), logMessageValidation, "217", "SafetyTestReportNumber", "30", maLoi4, 100, status);
		}
		
		//SafetyTestReportDate
		if (safetyTestReport.getSafetyTestReportDate() != null && !FormatData.isThisDateValid(safetyTestReport.getSafetyTestReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 217" + "__" + "SafetyTestReportDate");
			logMessageValidation.setValidationCode("N217731");
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
			status = ValidationUtils.checkValidation(emissionTestReport.getEmissionTestReportNumber(), logMessageValidation, "217", "EmissionTestReportNumber", "33", maLoi4, 100, status);
		}
		
		//EmissionTestReportDate
		if (emissionTestReport.getEmissionTestReportDate() != null && !FormatData.isThisDateValid(emissionTestReport.getEmissionTestReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 217" + "__" + "EmissionTestReportDate");
			logMessageValidation.setValidationCode("N217734");
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
			status = ValidationUtils.checkValidation(cOPReport.getCOPReportNumber(), logMessageValidation, "217", "COPReportNumber", "36", maLoi4, 100, status);
		}
		
		//COPTestReportDate
		if (cOPReport.getCOPReportNumber() != null && !FormatData.isThisDateValid(cOPReport.getCOPReportNumber())) {
			status = false;
			logMessageValidation.setTagName("Message : 217" + "__" + "COPTestReportDate");
			logMessageValidation.setValidationCode("N217736");
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
		status = ValidationUtils.checkValidation(specItem.getSpecificationCode(), logMessageValidation, "217", "SpecificationCode", "37", maLoi2, 9, status);
		
		//SpecificationName
		status = ValidationUtils.checkValidation(specItem.getSpecificationName(), logMessageValidation, "217", "SpecificationName", "38", maLoi2, 255, status);
		
		//DeclarationValue1
		status = ValidationUtils.checkValidation(specItem.getDeclarationValue1(), logMessageValidation, "217", "DeclarationValue1", "39", maLoi2, 255, status);
		
		//DeclarationValue2
		if(specItem.getDeclarationValue2() != null && specItem.getDeclarationValue2().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue2(), logMessageValidation, "217", "DeclarationValue2", "40", maLoi4, 255, status);
		}
		
		//DeclarationValue3
		if(specItem.getDeclarationValue3() != null && specItem.getDeclarationValue3().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue3(), logMessageValidation, "217", "DeclarationValue3", "41", maLoi4, 255, status);
		}
		
		//DeclarationValue4
		if(specItem.getDeclarationValue4() != null && specItem.getDeclarationValue4().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue4(), logMessageValidation, "217", "DeclarationValue4", "42", maLoi4, 255, status);
		}
		
		//DeclarationValue5
		if(specItem.getDeclarationValue5() != null && specItem.getDeclarationValue5().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue5(), logMessageValidation, "217", "DeclarationValue5", "43", maLoi4, 255, status);
		}
				
		//DeclarationValue6
		if(specItem.getDeclarationValue6() != null && specItem.getDeclarationValue6().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue6(), logMessageValidation, "217", "DeclarationValue6", "44", maLoi4, 255, status);
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(circular.getSequenceNo()), logMessageValidation, "217", "SequenceNo", "46", maLoi1, 0, 1, 0, false, status);
		
		//CircularNo
		status = ValidationUtils.checkValidation(circular.getCircularNo(), logMessageValidation, "217", "CircularNo", "47", maLoi2, 100, status);
				
		//CircularDate
		status = ValidationUtils.checkValidation(circular.getCircularDate(), logMessageValidation, "217", "CircularDate", "48", maLoi3, 50, status);
				
		return false;
	}



}
