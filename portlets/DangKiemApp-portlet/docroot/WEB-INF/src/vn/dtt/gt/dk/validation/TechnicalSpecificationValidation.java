package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification.AttachedFile;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification.ImportedVehicle;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem;



public class TechnicalSpecificationValidation {

	public static boolean validation(TechnicalSpecification obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//TechnicalSpecCode
		status = ValidationUtils.checkValidation(obj.getTechnicalSpecCode(), logMessageValidation, "101", "TechnicalSpecCode", "02", maLoi2, 200, status);
		
		//CertificateRefNo
		if(obj.getCertificateRefNo() != null && obj.getCertificateRefNo().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getCertificateRefNo(), logMessageValidation, "101", "CertificateRefNo", "03", maLoi4, 50, status);
		}
		
		//TODO GeneralInfo
		status = ValidationUtils.checkValidationNull(obj.getGeneralInfo(), logMessageValidation,  "101", "GeneralInfo", "04", status);
		if(obj.getGeneralInfo() != null){
		//TODO Importer
		status = ValidationUtils.checkValidationNull(obj.getGeneralInfo().getImporter(), logMessageValidation,  "101", "Importer", "05", status);
		if(obj.getGeneralInfo().getImporter() != null){
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getGeneralInfo().getImporter().getImporterCode()), logMessageValidation, "101", "ImporterCode", "06", maLoi1, 0, 13, 0, false, status);
								
		//ImporterName
		status = ValidationUtils.checkValidation(obj.getGeneralInfo().getImporter().getImporterName(), logMessageValidation, "101", "ImporterName", "07", maLoi2, 255, status);
										
		//ImporterAddress
		status = ValidationUtils.checkValidation(obj.getGeneralInfo().getImporter().getImporterAddress(), logMessageValidation, "101", "ImporterAddress", "08", maLoi2, 500, status);
				
		//Representative
		status = ValidationUtils.checkValidation(obj.getGeneralInfo().getImporter().getRepresentative(), logMessageValidation, "101", "Representative", "09", maLoi2, 255, status);
		
		//Phone
		status = ValidationUtils.checkValidation(obj.getGeneralInfo().getImporter().getPhone(), logMessageValidation, "101", "Phone", "10", maLoi2, 50, status);
		
		//Fax
		status = ValidationUtils.checkValidationNull(obj.getGeneralInfo().getImporter(), logMessageValidation, "101", "Importer", "06", status);
		if(obj.getGeneralInfo().getImporter().getFax() != null && obj.getGeneralInfo().getImporter().getFax().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getImporter().getFax(), logMessageValidation, "101", "Fax", "11", maLoi4, 50, status);
		}
		
		
		//Email
		if(obj.getGeneralInfo().getImporter().getEmail() != null && obj.getGeneralInfo().getImporter().getEmail().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getImporter().getEmail(), logMessageValidation, "101", "Email", "12", maLoi4, 255, status);
		}
		}
		//TradeMark
		status = ValidationUtils.checkValidation(obj.getGeneralInfo().getTradeMark(), logMessageValidation, "101", "TradeMark", "13", maLoi2, 50, status);
										
		//ModelType
//		status = ValidationUtils.checkValidation(obj.getGeneralInfo().getModelType(), logMessageValidation, "101", "ModelType", "14", maLoi2, 20, status);
					
		//ModelCode
		if(obj.getGeneralInfo().getModelCode() !=null && obj.getGeneralInfo().getModelCode().trim().length()>0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getModelCode(), logMessageValidation, "101", "ModelCode", "15", maLoi4, 50, status);
		}
		
		//VehicleType
		if(obj.getGeneralInfo().getVehicleType() != null && obj.getGeneralInfo().getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getVehicleType(), logMessageValidation, "101", "VehicleType", "16", maLoi4, 20, status);
		}
										
		//EngineType
		if(obj.getGeneralInfo().getEngineType() != null && obj.getGeneralInfo().getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getEngineType(), logMessageValidation, "101", "EngineType", "17", maLoi4, 20, status);
		}
		
		//Manufacturer
		if(obj.getGeneralInfo().getManufacturer() != null && obj.getGeneralInfo().getManufacturer().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getManufacturer(), logMessageValidation, "101", "Manufacturer", "18", maLoi4, 255, status);
		}
		
		//AddressProductionPlant
		if(obj.getGeneralInfo().getAddressProductionPlant() != null && obj.getGeneralInfo().getAddressProductionPlant().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getAddressProductionPlant(), logMessageValidation, "101", "AddressProductionPlant", "19", maLoi4, 500, status);
		}
		//TODO ProductionCountry
				status = ValidationUtils.checkValidationNull(obj.getGeneralInfo().getProductionCountry(), logMessageValidation,  "101", "ProductionCountry", "20", status);
				
		//CountryCode
		if(obj.getGeneralInfo() != null){
			if(obj.getGeneralInfo().getProductionCountry() != null){
				if(obj.getGeneralInfo().getProductionCountry().getCountryCode() != null && obj.getGeneralInfo().getProductionCountry().getCountryCode().size() > 0){
					for(int i = 0; i < obj.getGeneralInfo().getProductionCountry().getCountryCode().size(); i ++){
						status = ValidationUtils.checkValidation(obj.getGeneralInfo().getProductionCountry().getCountryCode().get(i), logMessageValidation, "101", "CountryCode", "21", maLoi2, 2, status);
					}
				}
			}
		}
		//MarkAsVehicle
		if(obj.getGeneralInfo().getMarkAsVehicle() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getGeneralInfo().getMarkAsVehicle()), logMessageValidation, "101", "MarkAsVehicle", "22", maLoi5, 0, 1, 0, false, status);
		}
		
		//EmissionStandard
		if(obj.getGeneralInfo().getEmissionStandard() != null && obj.getGeneralInfo().getEmissionStandard().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getGeneralInfo().getEmissionStandard(), logMessageValidation, "101", "EmissionStandard", "23", maLoi4, 50, status);
		}
		}
		//TODO SpecificationList
		status = ValidationUtils.checkValidationNull(obj.getSpecificationList(), logMessageValidation,  "101", "SpecificationList", "23", status);
//		if(status){
//		//SpecItem
//				List<SpecItem> liSpecItem = obj.getSpecificationList().getSpecItem();
//				//TODO SpecItem
//				status = ValidationUtils.checkValidationNull(liSpecItem, logMessageValidation,  "101", "SpecItem", "24", status);
//				
//				if(liSpecItem != null && liSpecItem.size()>0){
//					for(SpecItem specItem : liSpecItem){
//						status=validationSpecItemlist(specItem, idMessageLog);
//					}
//				}
//		}
		//Remarks
		if(obj.getRemarks() != null && obj.getRemarks().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getRemarks(), logMessageValidation, "101", "Remarks", "33", maLoi4, 500, status);
		}		
		
		//AttachedFile
//		List<AttachedFile> liAttachedFiles = obj.getAttachedFile();
		//TODO AttachedFile
//		status = ValidationUtils.checkValidationListNull(liAttachedFiles, logMessageValidation,  "101", "AttachedFile", "34", status);
		
//		if(liAttachedFiles != null && liAttachedFiles.size() > 0){
//			for(AttachedFile attachedFile : liAttachedFiles){
//				status = validationAttachedFileList(attachedFile, idMessageLog);
//			}
//		}
		
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		
		//TODO ImportedVehicle
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation,  "101", "ImportedVehicle", "42", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
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
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//SequenceNo
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "101", "SequenceNo", "43", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "101", "CodeNumber", "44", maLoi1, 0, 9, 0, false, status);
		
		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "101", "ChassisNumber", "45", maLoi4, 50, status);
		}
					
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "101", "EngineNumber", "46", maLoi4, 50, status);
		}
		
		//ProductionYear
//		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getProductionYear()), logMessageValidation, "101", "ProductionYear", "47", maLoi1, 0, 9, 0, false, status);
				
		//VehicleEngineStatus   
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleEngineStatus()), logMessageValidation, "101", "VehicleEngineStatus", "48", maLoi1, 0, 1, 0, false, status);
				
		//VehicleUnitPrice
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getVehicleUnitPrice()), logMessageValidation, "101", "DeclarationPrice", "49", maLoi1, 1, 20, 3, false, status);
				
		//Currency
		status = ValidationUtils.checkValidation(importedVehicle.getCurrency(), logMessageValidation, "101", "Currency", "50", maLoi2, 3, status);
				
		return status;
	}

	private static boolean validationAttachedFileList(AttachedFile attachedFile, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int [] maLoi2={1,5,6};
		int [] maLoi4={5,6};
		int [] maLoi5={ 3, 4 };
		
		//AttachedTypeCode
		status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "101", "AttachedTypeCode", "35", maLoi2, 20, status);
		
		//AttachedTypeName
		if(attachedFile.getAttachedTypeName() != null && attachedFile.getAttachedTypeName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getAttachedTypeCode(), logMessageValidation, "101", "AttachedTypeName", "36", maLoi4, 200, status);
		}
		
		//AttachedDocName
		status = ValidationUtils.checkValidation(attachedFile.getAttachedDocName(), logMessageValidation, "101", "AttachedDocName", "37", maLoi2, 200, status);
		
		//AttachedNote
//		status = ValidationUtils.checkValidation(attachedFile.getAttachedNote(), logMessageValidation, "101", "AttachedNote", "38", maLoi2, 100, status);
		
		//AttachedSequenceNo
		if(attachedFile.getAttachedSequenceNo() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(attachedFile.getAttachedSequenceNo()), logMessageValidation, "101", "AttachedSequenceNo", "39", maLoi5, 0, 3, 0, false, status);
		}
		
		//FullFileName
		if(attachedFile.getFullFileName() != null && attachedFile.getFullFileName().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getFullFileName(), logMessageValidation, "101", "FullFileName", "40", maLoi4, 100, status);
		}
		
		//SHA1FileContent
		if(attachedFile.getSHA1FileContent() != null && attachedFile.getSHA1FileContent().trim().length() > 0){
			status = ValidationUtils.checkValidation(attachedFile.getSHA1FileContent(), logMessageValidation, "101", "SHA1FileContent", "41", maLoi4, 255, status);
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
		status = ValidationUtils.checkValidation(specItem.getSpecificationCode(), logMessageValidation, "101", "SpecificationCode", "25", maLoi2, 9, status);
				
		//SpecificationName
		status = ValidationUtils.checkValidation(specItem.getSpecificationName(), logMessageValidation, "101", "SpecificationName", "26", maLoi2, 255, status);
				
		//DeclarationValue1
		status = ValidationUtils.checkValidation(specItem.getDeclarationValue1(), logMessageValidation, "101", "DeclarationValue1", "27", maLoi2, 255, status);
				
		//DeclarationValue2
		if(specItem.getDeclarationValue2() != null && specItem.getDeclarationValue2().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue2(), logMessageValidation, "101", "DeclarationValue2", "28", maLoi4, 255, status);
		}
				
		//DeclarationValue3
		if(specItem.getDeclarationValue3() != null && specItem.getDeclarationValue3().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue3(), logMessageValidation, "101", "DeclarationValue3", "29", maLoi4, 255, status);
		}
				
		//DeclarationValue4
		if(specItem.getDeclarationValue4() != null && specItem.getDeclarationValue4().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue4(), logMessageValidation, "101", "DeclarationValue4", "30", maLoi4, 255, status);
		}
				
		//DeclarationValue5
		if(specItem.getDeclarationValue5() != null && specItem.getDeclarationValue5().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue5(), logMessageValidation, "101", "DeclarationValue5", "31", maLoi4, 255, status);
		}
						
		//DeclarationValue6
		if(specItem.getDeclarationValue6() != null && specItem.getDeclarationValue6().trim().length() > 0){
			status = ValidationUtils.checkValidation(specItem.getDeclarationValue6(), logMessageValidation, "101", "DeclarationValue6", "32", maLoi4, 255, status);
		}
		
		return status;
	}
}