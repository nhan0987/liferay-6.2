/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.NoticeOfViolation;
import vn.dtt.gt.dk.nsw.model.NoticeOfViolation.CustomDeclaration;




/**
 * @author win_64
 *
 */
public class NoticeOfViolationValidation {

	public static boolean validation(NoticeOfViolation obj, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(obj.getCertificateNumber(), logMessageValidation, "214", "CertificateNumber", "02", maLoi2, 100, status);
								
		//VehicleEngineStatus
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getVehicleEngineStatus()), logMessageValidation, "214", "VehicleEngineStatus", "03", maLoi1, 0, 1, 0, false, status);
								
		//TODO Importer
		status = ValidationUtils.checkValidationNull(obj.getImporter(), logMessageValidation, "214", "Importer", "04", status);
		if(status){
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getImporter().getImporterCode()), logMessageValidation, "214", "ImporterCode", "05", maLoi1, 0, 13, 0, false, status);
								
		//ImporterName
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterName(), logMessageValidation, "214", "ImporterName", "06", maLoi2, 255, status);
								
		//ImporterAddress
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterAddress(), logMessageValidation, "214", "ImporterAddress", "07", maLoi2, 500, status);
		}
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getCodeNumber()), logMessageValidation, "214", "CodeNumber", "08", maLoi1, 0, 9, 0, false, status);
								
		//TradeMark
		status = ValidationUtils.checkValidation(obj.getTradeMark(), logMessageValidation, "214", "TradeMark", "09", maLoi2, 20, status);
								
		//ModelType
//		status = ValidationUtils.checkValidation(obj.getModelType(), logMessageValidation, "214", "ModelType", "10", maLoi2, 20, status);
			
		//ModelCode
		if(obj.getModelCode() !=null && obj.getModelCode().trim().length()>0){
			status = ValidationUtils.checkValidation(obj.getModelCode(), logMessageValidation, "214", "ModelCode", "10a", maLoi4, 50, status);
		}
		//TODO ProductionCountry
		status = ValidationUtils.checkValidationNull(obj.getProductionCountry(), logMessageValidation, "214", "ProductionCountry", "11", status);
		
		//CountryCode
		if(obj.getProductionCountry() != null){
			if(obj.getProductionCountry().getCountryCode() != null && obj.getProductionCountry().getCountryCode().size() > 0){
				for(int i = 0; i < obj.getProductionCountry().getCountryCode().size(); i ++){
					status = ValidationUtils.checkValidation(obj.getProductionCountry().getCountryCode().get(i), logMessageValidation, "214", "CountryCode", "12", maLoi2, 2, status);
				}
			}
		}						
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getProductionYear()), logMessageValidation, "214", "ProductionYear", "13", maLoi1, 0, 9, 0, false, status);
								
		//MarkAsVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getMarkAsVehicle()), logMessageValidation, "214", "MarkAsVehicle", "14", maLoi1, 0, 1, 0, false, status);
								
		//VehicleType
		if(obj.getVehicleType() != null && obj.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getVehicleType(), logMessageValidation, "214", "VehicleType", "15", maLoi4, 20, status);
		}
								
		//EngineType
		if(obj.getEngineType() != null && obj.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineType(), logMessageValidation, "214", "EngineType", "16", maLoi4, 20, status);
		}
							
		//ChassisNumber
		status = ValidationUtils.checkValidation(obj.getChassisNumber(), logMessageValidation, "214", "ChassisNumber", "17", maLoi2, 50, status);
								
		//EngineNumber
		if(obj.getEngineNumber() != null && obj.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getEngineNumber(), logMessageValidation, "214", "EngineNumber", "18", maLoi4, 50, status);
		}
						
		//CustomDeclaration
		List<CustomDeclaration> liCustomDeclaration = obj.getCustomDeclaration();
		status = ValidationUtils.checkValidationListNull(liCustomDeclaration, logMessageValidation, "214", "CustomDeclaration", "19", status);
			if(liCustomDeclaration != null && liCustomDeclaration.size()>0){
				for(CustomDeclaration customDeclaration : liCustomDeclaration){
					status=validationCustomDeclarationlist(customDeclaration, idMessageLog);
				}
			}
		
		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "214", "RegisteredNumber", "22", maLoi2, 100, status);
					
		//InspectionRecordNumber
		status = ValidationUtils.checkValidation(obj.getInspectionRecordNumber(), logMessageValidation, "214", "InspectionRecordNumber", "23", maLoi2, 100, status);
					
		//InspectionRecordDate
		status = ValidationUtils.checkValidation(obj.getInspectionRecordDate(), logMessageValidation, "214", "InspectionRecordDate", "24", maLoi3, 50, status);
					
		//InspectionSite
		status = ValidationUtils.checkValidation(obj.getInspectionSite(), logMessageValidation, "214", "InspectionSite", "25", maLoi2, 255, status);
		
		//TODO TestReport
				status = ValidationUtils.checkValidationNull(obj.getTestReport(), logMessageValidation, "214", "TestReport", "26", status);
				
		//TestReportNumber
//		if(obj.getTestReport().getTestReportNumber() != null && obj.getTestReport().getTestReportNumber().size() > 0){
//			for(int i = 0; i < obj.getTestReport().getTestReportNumber().size(); i ++){
//				status = ValidationUtils.checkValidation(obj.getTestReport().getTestReportNumber().get(i), logMessageValidation, "214", "TestReportNumber", "27", maLoi4, 100, status);
//			}
//		}	
		
		//ViolationDescription
		status = ValidationUtils.checkValidation(obj.getViolationDescription(), logMessageValidation, "214", "ViolationDescription", "28", maLoi2, 500, status);
		
		//DecreeNo
		status = ValidationUtils.checkValidation(obj.getDecreeNo(), logMessageValidation, "214", "DecreeNo", "29", maLoi2, 100, status);
		
		//DecreeDate
		status = ValidationUtils.checkValidation(obj.getDecreeDate(), logMessageValidation, "214", "DecreeDate", "30", maLoi3, 50, status);
		
		//Destination
		if(obj.getDestination() != null && obj.getDestination().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getDestination(), logMessageValidation, "214", "Destination", "31", maLoi4, 255, status);
		}
		//TODO InspectorSign
		status = ValidationUtils.checkValidationNull(obj.getInspectorSign(), logMessageValidation, "214", "InspectorSign", "32", status);
		if(status){
		//Organization
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getOrganization(), logMessageValidation, "214", "Organization", "33", maLoi2, 255, status);
								
		//Division
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getDivision(), logMessageValidation, "214", "Division", "34", maLoi2, 255, status);
								
		//SignName
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignName(), logMessageValidation, "214", "SignName", "35", maLoi2, 255, status);
								
		//SignTitle
		if(obj.getInspectorSign().getSignTitle() != null && obj.getInspectorSign().getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignTitle(), logMessageValidation, "214", "SignTitle", "36", maLoi4, 100, status);
		}
								
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignPlace(), logMessageValidation, "214", "SignPlace", "37", maLoi2, 50, status);
								
		//SignDate
		status = ValidationUtils.checkValidation(obj.getInspectorSign().getSignDate(), logMessageValidation, "214", "SignDate", "38", maLoi3, 50, status);
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
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareNo(), logMessageValidation, "214", "ImportCustomDeclareNo", "20", maLoi2, 20, status);
								
		//ImportCustomDeclareDate
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareDate(), logMessageValidation, "214", "ImportCustomDeclareDate", "21", maLoi3, 50, status);
			
		
		return status;
	}
}