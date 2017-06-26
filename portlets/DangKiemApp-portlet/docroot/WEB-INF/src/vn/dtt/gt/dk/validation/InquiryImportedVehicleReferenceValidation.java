/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference;
import vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference.CertificateDetails;
import vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference.CertificateDetails.CustomDeclaration;
import vn.dtt.gt.dk.utils.format.FormatData;



/**
 * @author win_64
 *
 */
public class InquiryImportedVehicleReferenceValidation {

	public static boolean validation(InquiryImportedVehicleReference obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };//bat buoc dang so
		int[] maLoi2 = { 1, 5, 6 };//bat buoc dang chu
		int[] maLoi3 = { 1, 7 }; // bat buoc ngay thang
		int[] maLoi4 = { 5, 6 };//dang chu	
		int[] maLoi5 = { 3, 4 };//dang so
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//RequestDate
		status = ValidationUtils.checkValidation(obj.getRequestDate(), logMessageValidation, "220", "RequestDate", "02", maLoi3, 50, status);
		
		//Organization
		if(obj.getOrganization() != null && obj.getOrganization().trim().length() > 0){
		status = ValidationUtils.checkValidation(obj.getOrganization(), logMessageValidation, "220", "Organization", "03", maLoi4, 255, status);
		}
		
		//Division
		if(obj.getDivision() != null && obj.getDivision().trim().length() > 0){
		status = ValidationUtils.checkValidation(obj.getDivision(), logMessageValidation, "220", "Division", "04", maLoi4, 255, status);
		}
		
		//Name
		if(obj.getName() != null && obj.getName().trim().length() > 0){
		status = ValidationUtils.checkValidation(obj.getName(), logMessageValidation, "220", "Name", "05", maLoi4, 255, status);
		}
		
		//ReasonOfInquiry
		status = ValidationUtils.checkValidation(obj.getReasonOfInquiry(), logMessageValidation, "220", "ReasonOfInquiry", "06", maLoi2, 500, status);
		
		//CertificateDetails
		List<CertificateDetails> liCertificateDetails = obj.getCertificateDetails();
		//TODO
		status = ValidationUtils.checkValidationListNull(liCertificateDetails, logMessageValidation, "220", "CertificateDetails", "08", status);
		if(liCertificateDetails != null && liCertificateDetails.size() > 0){
			for(CertificateDetails certificateDetails : liCertificateDetails){
				status = validationCertificateDetails(certificateDetails, idMessageLog);
			}
		}
		
		return status;
	}
	
	private static boolean validationCertificateDetails(CertificateDetails certificateDetails, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(certificateDetails.getCertificateNumber(), logMessageValidation, "220", "CertificateNumber", "09", maLoi2, 100, status);
		
		//VehicleEngineStatus
		if(certificateDetails.getVehicleEngineStatus() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(certificateDetails.getVehicleEngineStatus()), logMessageValidation, "220", "VehicleEngineStatus", "10", maLoi5, 0, 1, 0, false, status);
		}
		//TODO Importer
		status = ValidationUtils.checkValidationNull(certificateDetails.getImporter(), logMessageValidation, "220", "Importer", "11", status);
		if(status){
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(certificateDetails.getImporter().getImporterCode(), logMessageValidation, "220", "ImporterCode", "12", maLoi2, 0, 13, 0, false, status);
		
		//ImporterName
		status = ValidationUtils.checkValidation(certificateDetails.getImporter().getImporterName(), logMessageValidation, "220", "ImporterName", "13", maLoi2, 255, status);
		
		//ImporterAddress
		if(certificateDetails.getImporter().getImporterAddress() != null && certificateDetails.getImporter().getImporterAddress().trim().length() > 0){
			status = ValidationUtils.checkValidation(certificateDetails.getImporter().getImporterAddress(), logMessageValidation, "220", "ImporterAddress", "14", maLoi4, 500, status);	
		}
		}
		//TradeMark
		status = ValidationUtils.checkValidation(certificateDetails.getTradeMark(), logMessageValidation, "220", "TradeMark", "15", maLoi2, 50, status);

		//ModelType
//		status = ValidationUtils.checkValidation(certificateDetails.getModelType(), logMessageValidation, "220", "ModelType", "16", maLoi2, 20, status);
		
		//TODO ProductionCountry
		status = ValidationUtils.checkValidationNull(certificateDetails.getProductionCountry(), logMessageValidation, "220", "ProductionCountry", "17", status);
		
		//CountryCode
		if(certificateDetails.getProductionCountry() != null){
			if(certificateDetails.getProductionCountry().getCountryCode() != null && certificateDetails.getProductionCountry().getCountryCode().size() > 0){
				for(int i = 0; i < certificateDetails.getProductionCountry().getCountryCode().size(); i ++){
					status = ValidationUtils.checkValidation(certificateDetails.getProductionCountry().getCountryCode().get(i), logMessageValidation, "220", "CountryCode", "18", maLoi2, 2, status);
				}
			}
		}
		//ProductionYear
//		if(certificateDetails.getProductionYear() !=null&&certificateDetails.getProductionYear().length()>0){
//			status = ValidationUtils.checkValidationNumber(String.valueOf(certificateDetails.getProductionYear()), logMessageValidation, "220", "ProductionYear", "19", maLoi5, 0, 9, 0, false, status);
//		}
		
		//MarkAsVehicle
		if(certificateDetails.getMarkAsVehicle() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(certificateDetails.getMarkAsVehicle()), logMessageValidation, "220", "MarkAsVehicle", "20", maLoi5, 0, 1, 0, false, status);
		}
		//VehicleType
		if(certificateDetails.getVehicleType() != null && certificateDetails.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(certificateDetails.getVehicleType(), logMessageValidation, "220", "VehicleType", "21", maLoi4, 20, status);	
		}
		
		//EngineType
		if(certificateDetails.getEngineType() != null && certificateDetails.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(certificateDetails.getEngineType(), logMessageValidation, "220", "EngineType", "22", maLoi4, 20, status);	
		}
		
		//ChassisNumber
		if(certificateDetails.getChassisNumber() != null && certificateDetails.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(certificateDetails.getChassisNumber(), logMessageValidation, "220", "ChassisNumber", "23", maLoi4, 50, status);	
		}
		
		//EngineNumber
		if(certificateDetails.getEngineNumber() != null && certificateDetails.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(certificateDetails.getEngineNumber(), logMessageValidation, "220", "EngineNumber", "24", maLoi4, 50, status);	
		}
		
		//CustomDeclaration
		List<CustomDeclaration> liCustomDeclarations = certificateDetails.getCustomDeclaration();
		//TODO
		status = ValidationUtils.checkValidationListNull(liCustomDeclarations, logMessageValidation, "220", "CustomDeclaration", "25", status);
		
		if(liCustomDeclarations != null && liCustomDeclarations.size() > 0){
			for(CustomDeclaration customDeclaration : liCustomDeclarations){
				status = validationCustomDeclaration(customDeclaration, idMessageLog);
			}
		}
		
		//RegisteredNumber
		if(certificateDetails.getRegisteredNumber() != null && certificateDetails.getRegisteredNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(certificateDetails.getRegisteredNumber(), logMessageValidation, "220", "RegisteredNumber", "28", maLoi4, 100, status);	
		}
		
		return status;
	}
	
	private static boolean validationCustomDeclaration(CustomDeclaration customDeclaration, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };//bat buoc dang so
		int[] maLoi2 = { 1, 5, 6 };//bat buoc dang chu
		int[] maLoi3 = { 1, 7 }; // bat buoc ngay thang
		int[] maLoi4 = { 5, 6 };//dang chu	
		int[] maLoi5 = { 3, 4 };//dang so
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//ImportCustomDeclareNo
		if(customDeclaration.getImportCustomDeclareNo() != null && customDeclaration.getImportCustomDeclareNo().trim().length() > 0){
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareNo(), logMessageValidation, "214", "ImportCustomDeclareNo", "26", maLoi4, 20, status);
		}
		
		//ImportCustomDeclareDate
		if (customDeclaration.getImportCustomDeclareDate() != null && !FormatData.isThisDateValid(customDeclaration.getImportCustomDeclareDate())) {
			status = false;
			logMessageValidation.setTagName("Message : 220" + "__" + "ImportCustomDeclareDate");
			logMessageValidation.setValidationCode("N220727");
			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
			ValidationUtils.addLogMessageValidation(logMessageValidation);
		}
				
		return status;
	}
}