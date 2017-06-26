/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.COPReport;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.CustomDeclaration;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.EmissionTestReport;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.SafetyTestReport;
import vn.dtt.gt.dk.utils.format.FormatData;



/**
 * @author win_64
 *
 */
public class NoticeOfNonConformityValidation {

	public static boolean validation(NoticeOfNonConformity obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//CertificateNumber
		status = ValidationUtils.checkValidation(obj.getCertificateNumber(), logMessageValidation, "213", "CertificateNumber", "02", maLoi2, 100, status);
						
		//VehicleEngineStatus
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getVehicleEngineStatus()), logMessageValidation, "213", "VehicleEngineStatus", "03", maLoi1, 0, 1, 0, false, status);
		
		//TODO Importer
				status = ValidationUtils.checkValidationNull(obj.getImporter(), logMessageValidation, "213", "Importer", "04", status);
				if(status){		
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getImporter().getImporterCode()), logMessageValidation, "213", "ImporterCode", "05", maLoi1, 0, 13, 0, false, status);
						
		//ImporterName
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterName(), logMessageValidation, "213", "ImporterName", "06", maLoi2, 255, status);
						
		//ImporterAddress
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterAddress(), logMessageValidation, "213", "ImporterAddress", "07", maLoi2, 500, status);
				}
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getCodeNumber()), logMessageValidation, "213", "CodeNumber", "08", maLoi1, 0, 9, 0, false, status);
						
		//TradeMark
		status = ValidationUtils.checkValidation(obj.getTradeMark(), logMessageValidation, "213", "TradeMark", "09", maLoi2, 20, status);
						
		//ModelType
//		status = ValidationUtils.checkValidation(obj.getModelType(), logMessageValidation, "213", "ModelType", "10", maLoi2, 20, status);
				
		//ModelCode
		if(obj.getModelCode() !=null && obj.getModelCode().trim().length()>0){
			status = ValidationUtils.checkValidation(obj.getModelCode(), logMessageValidation, "213", "ModelCode", "10a", maLoi4, 50, status);
		}
		//TODO ProductionCountry
				status = ValidationUtils.checkValidationNull(obj.getProductionCountry(), logMessageValidation, "213", "ProductionCountry", "11", status);
				
		//CountryCode
		if(obj.getProductionCountry() != null){
			if(obj.getProductionCountry().getCountryCode() != null && obj.getProductionCountry().getCountryCode().size() > 0){
				for(int i = 0; i < obj.getProductionCountry().getCountryCode().size(); i ++){
					status = ValidationUtils.checkValidation(obj.getProductionCountry().getCountryCode().get(i), logMessageValidation, "213", "CountryCode", "12", maLoi2, 2, status);
				}
			}
		}				
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getProductionYear()), logMessageValidation, "213", "ProductionYear", "13", maLoi1, 0, 9, 0, false, status);
						
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getMarkAsVehicle()), logMessageValidation, "213", "MarkAsVehicle", "14", maLoi1, 0, 1, 0, false, status);
						
		//VehicleType
		if(obj.getVehicleType() != null && obj.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getVehicleType(), logMessageValidation, "213", "VehicleType", "15", maLoi4, 20, status);
		}
						
		//EngineType
		if(obj.getEngineType() != null && obj.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineType(), logMessageValidation, "213", "EngineType", "16", maLoi4, 20, status);
		}
						
		//ChassisNumber
		status = ValidationUtils.checkValidation(obj.getChassisNumber(), logMessageValidation, "213", "ChassisNumber", "17", maLoi2, 50, status);
						
		//EngineNumber
		if(obj.getEngineNumber() != null && obj.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineNumber(), logMessageValidation, "213", "EngineNumber", "18", maLoi4, 50, status);
		}
						
		//CustomDeclaration
		List<CustomDeclaration> liCustomDeclaration = obj.getCustomDeclaration();
		status = ValidationUtils.checkValidationListNull(liCustomDeclaration, logMessageValidation, "213", "CustomDeclaration", "19", status);
			if(liCustomDeclaration != null && liCustomDeclaration.size()>0){
				for(CustomDeclaration customDeclaration : liCustomDeclaration){
					status=validationCustomDeclarationlist(customDeclaration, idMessageLog);
				}
			}
				
		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "213", "RegisteredNumber", "22", maLoi2, 100, status);
				
		//InspectionRecordNumber
		status = ValidationUtils.checkValidation(obj.getInspectionRecordNumber(), logMessageValidation, "213", "InspectionRecordNumber", "23", maLoi2, 100, status);
				
		//InspectionRecordDate
		status = ValidationUtils.checkValidation(obj.getInspectionRecordDate(), logMessageValidation, "213", "InspectionRecordDate", "24", maLoi3, 50, status);
				
		//InspectionSite
		status = ValidationUtils.checkValidation(obj.getInspectionSite(), logMessageValidation, "213", "InspectionSite", "25", maLoi2, 255, status);
				
		//SafetyTestReport
		List<SafetyTestReport> liSafetyTestReport = obj.getSafetyTestReport();
		//TODO
				status = ValidationUtils.checkValidationListNull(liSafetyTestReport, logMessageValidation, "213", "SafetyTestReport", "26", status);
		if(liSafetyTestReport!= null && liSafetyTestReport.size()>0){
			for(SafetyTestReport safetyTestReport : liSafetyTestReport){
				status=validationSafetyTestReportlist(safetyTestReport, idMessageLog);
			}
		}
		
		//EmissionTestReport
		List<EmissionTestReport> liEmissionTestReport = obj.getEmissionTestReport();
		//TODO
				status = ValidationUtils.checkValidationListNull(liEmissionTestReport, logMessageValidation, "213", "EmissionTestReport", "29", status);
		if(liEmissionTestReport != null && liEmissionTestReport.size()>0){
			for(EmissionTestReport emissionTestReport : liEmissionTestReport){
				status=validationEmissionTestReportlist(emissionTestReport, idMessageLog);
			}
		}
		
		//COPReport
		List<COPReport> liCOPReport = obj.getCOPReport();
		//TODO
				status = ValidationUtils.checkValidationListNull(liCOPReport, logMessageValidation, "213", "COPReport", "32", status);
			if(liCOPReport != null && liCOPReport.size()>0){
				for(COPReport cOPReport : liCOPReport){
					status=validationCOPReportlist(cOPReport, idMessageLog);
				}
			}
				
//		//TestReportNumber
//		if(obj.getTestReport().getTestReportNumber() != null && obj.getTestReport().getTestReportNumber().size() > 0){
//			for(int i = 0; i < obj.getTestReport().getTestReportNumber().size(); i ++){
//				status = ValidationUtils.checkValidation(obj.getTestReport().getTestReportNumber().get(i), logMessageValidation, "213", "TestReportNumber", "28", maLoi2, 100, status);
//			}
//		}	
			
		//ReasonForNonConformity
		status = ValidationUtils.checkValidation(obj.getReasonForNonConformity(), logMessageValidation, "213", "ReasonForNonConformity", "35", maLoi2, 500, status);
		
		//Circular
		List<Circular> liCircular = obj.getCircular();
		//TODO
				status = ValidationUtils.checkValidationListNull(liCircular, logMessageValidation, "213", "Circular", "36", status);
		if(liCircular != null && liCircular.size()>0){
			for(Circular circular : liCircular){
				status=validationCircularlist(circular, idMessageLog);
			}
		}	
		
		
		//Destination
		if(obj.getDestination() != null && obj.getDestination().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getDestination(), logMessageValidation, "213", "Destination", "40", maLoi4, 255, status);
		}
		//TODO InspectorSign
				status = ValidationUtils.checkValidationNull(obj.getInspectorSign(), logMessageValidation, "213", "InspectorSign", "41", status);
				if(status){
		//Organization
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getOrganization(), logMessageValidation, "213", "Organization", "42", maLoi2, 255, status);
						
		//Division
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getDivision(), logMessageValidation, "213", "Division", "43", maLoi2, 255, status);
						
		//SignName
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignName(), logMessageValidation, "213", "SignName", "44", maLoi2, 255, status);
						
		//SignTitle
		if(obj.getInspectorSign().getSignTitle() != null && obj.getInspectorSign().getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignTitle(), logMessageValidation, "213", "SignTitle", "45", maLoi4, 100, status);
		}
						
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignPlace(), logMessageValidation, "213", "SignPlace", "46", maLoi2, 50, status);
						
		//SignDate
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignDate(), logMessageValidation, "213", "SignDate", "47", maLoi3, 50, status);
				}	
						
		return status;
	}

	private static boolean validationCircularlist(Circular circular,  long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(circular.getSequenceNo()), logMessageValidation, "213", "SequenceNo", "36", maLoi1, 0, 1, 0, false, status);
					
		//CircularNo
		status = ValidationUtils.checkValidation(circular.getCircularNo(), logMessageValidation, "213", "CircularNo", "37", maLoi2, 100, status);
					
		//CircularDate
		status = ValidationUtils.checkValidation(circular.getCircularDate(), logMessageValidation, "213", "CircularDate", "38", maLoi3, 50, status);
				
		return status;
	}
	
	private static boolean validationCOPReportlist(COPReport cOPReport,  long idMessageLog) throws Exception {
		
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
			status = ValidationUtils.checkValidation(cOPReport.getCOPReportNumber(), logMessageValidation, "213", "COPReportNumber", "33", maLoi4, 100, status);
		}
		
		//COPTestReportDate
		if (cOPReport.getCOPTestReportDate() != null && !FormatData.isThisDateValid(cOPReport.getCOPTestReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 213" + "__" + "COPTestReportDate");
			logMessageValidation.setValidationCode("N213734");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		
		return status;
	}
	
	private static boolean validationEmissionTestReportlist(
			EmissionTestReport emissionTestReport, long idMessageLog) throws Exception {
		
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
			status = ValidationUtils.checkValidation(emissionTestReport.getEmissionTestReportNumber(), logMessageValidation, "213", "EmissionTestReportNumber", "30", maLoi4, 100, status);
		}
		
		//EmissionTestReportDate
		if (emissionTestReport.getEmissionTestReportDate() != null && !FormatData.isThisDateValid(emissionTestReport.getEmissionTestReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 213" + "__" + "EmissionTestReportDate");
			logMessageValidation.setValidationCode("N213731");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
		
		return status;
	}

	private static boolean validationSafetyTestReportlist(
			SafetyTestReport safetyTestReport, long idMessageLog) throws Exception {
		
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
			status = ValidationUtils.checkValidation(safetyTestReport.getSafetyTestReportNumber(), logMessageValidation, "213", "SafetyTestReportNumber", "27", maLoi4, 100, status);
		}
		
		//SafetyTestReportDate
		if (safetyTestReport.getSafetyTestReportDate() != null && !FormatData.isThisDateValid(safetyTestReport.getSafetyTestReportDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 213" + "__" + "SafetyTestReportDate");
			logMessageValidation.setValidationCode("N213728");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
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
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareNo(), logMessageValidation, "213", "ImportCustomDeclareNo", "20", maLoi2, 20, status);
						
		//ImportCustomDeclareDate
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareDate(), logMessageValidation, "213", "ImportCustomDeclareDate", "21", maLoi3, 50, status);
	
		return status;
	}
}