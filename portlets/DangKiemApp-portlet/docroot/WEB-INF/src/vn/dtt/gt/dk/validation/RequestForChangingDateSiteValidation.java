package vn.dtt.gt.dk.validation;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite.CustomDeclaration;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite.CustomerDeclaration;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite.CustomerDeclaration.CommodityItem;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite.ImportedVehicle;




public class RequestForChangingDateSiteValidation {

	public static boolean validation(RequestForChangingDateSite obj, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//TODO Importer
		status = ValidationUtils.checkValidationNull(obj.getImporter(), logMessageValidation, "108", "Importer", "02", status);
		
		if(status){
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getImporter().getImporterCode()), logMessageValidation, "108", "ImporterCode", "03", maLoi1, 0, 13, 0, false, status);
		 
		//ImporterName
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterName(), logMessageValidation, "108", "ImporterName", "04", maLoi2, 255, status);
		
		//ImporterAddress
		status = ValidationUtils.checkValidation(obj.getImporter().getImporterAddress(), logMessageValidation, "108", "ImporterAddress", "05", maLoi2, 500, status);
		}
		//RegisteredNumber
		status = ValidationUtils.checkValidation(obj.getRegisteredNumber(), logMessageValidation, "108", "RegisteredNumber", "06", maLoi2, 100, status);

		//CustomDeclaration
		List<CustomDeclaration> liCustomDeclaration = obj.getCustomDeclaration();
		//TODO
		if(obj.getCustomsRegion() == 0){
		status = ValidationUtils.checkValidationListNull(liCustomDeclaration, logMessageValidation, "108", "CustomDeclaration", "07", status);
		}
		if(liCustomDeclaration != null && liCustomDeclaration.size()>0){
			for(CustomDeclaration customDeclaration : liCustomDeclaration){
				status=validationCustomDeclarationlist(customDeclaration, idMessageLog);
			}
		}

		//CustomsRegion
		if(obj.getCustomsRegion() >= 0){
			status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getCustomsRegion()), logMessageValidation, "108", "CustomsRegion", "10", maLoi5, 0, 1, 0, false, status);
		}

		//TODO Inspection
		status = ValidationUtils.checkValidationNull(obj.getInspection(), logMessageValidation,  "108", "Inspection", "11", status);
		if(status){
			//InpectionDate
			status = ValidationUtils.checkValidation(obj.getInspection().getInpectionDate(), logMessageValidation, "108", "InpectionDate", "12", maLoi2, 50, status);
			
			//InspectionSite
			status = ValidationUtils.checkValidation(obj.getInspection().getInspectionSite(), logMessageValidation, "108", "InspectionSite", "13", maLoi2, 255, status);
			
			//DistrictCode
			status = ValidationUtils.checkValidation(obj.getInspection().getDistrictCode(), logMessageValidation, "108", "DistrictCode", "14", maLoi2, 20, status);
			
			//DistrictName
			status = ValidationUtils.checkValidation(obj.getInspection().getDistrictName(), logMessageValidation, "108", "DistrictName", "15", maLoi2, 50, status);
			
			//ProvinceCode
			status = ValidationUtils.checkValidation(obj.getInspection().getProvinceCode(), logMessageValidation, "108", "ProvinceCode", "16", maLoi2, 20, status);
			
			//ProvinceName
			status = ValidationUtils.checkValidation(obj.getInspection().getProvinceName(), logMessageValidation, "108", "ProvinceName", "17", maLoi2, 50, status);
		}
		//TODO Contacter
		status = ValidationUtils.checkValidationNull(obj.getContacter(), logMessageValidation, "108", "Contacter", "18", status);
		if(status){
			//ContactName
			status = ValidationUtils.checkValidation(obj.getContacter().getContactName(), logMessageValidation, "108", "ContactName", "19", maLoi2, 255, status);
					
			//ContactPhone
			status = ValidationUtils.checkValidation(obj.getContacter().getContactPhone(), logMessageValidation, "108", "ContactPhone", "20", maLoi2, 100, status);
			
			//ContactEmail
			if(obj.getContacter().getContactEmail() != null && obj.getContacter().getContactEmail().trim().length() > 0){
				status = ValidationUtils.checkValidation(obj.getContacter().getContactEmail(), logMessageValidation, "108", "ContactEmail", "21", maLoi4, 100, status);
			}
		}
		//TotalNumberVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(obj.getTotalNumberVehicle()), logMessageValidation, "108", "TotalNumberVehicle", "22", maLoi1, 0, 9, 0, false, status);
		
		//ImportedVehicle
		List<ImportedVehicle> liImportedVehicle = obj.getImportedVehicle();
		//TODO
		status = ValidationUtils.checkValidationListNull(liImportedVehicle, logMessageValidation, "108", "ImportedVehicle", "23", status);
		
		if(liImportedVehicle != null && liImportedVehicle.size()>0){
			for(ImportedVehicle importedVehicle : liImportedVehicle){
				status=validationImportedVehiclelist(importedVehicle, idMessageLog);
			}
		}

		//Remarks
		if(obj.getRemarks() != null && obj.getRemarks().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getRemarks(), logMessageValidation, "108", "Remarks", "32", maLoi4, 255, status);
		}
		//TODO ImporterSign		
		
		status = ValidationUtils.checkValidationNull(obj.getImporterSign(), logMessageValidation,"108", "ImporterSign", "33", status);
		//SignName
		if(status){
		status = ValidationUtils.checkValidation(obj.getImporterSign().getSignName(), logMessageValidation, "108", "SignName", "34", maLoi2, 255, status);
		
		//SignTitle
		if(obj.getImporterSign().getSignTitle() != null && obj.getImporterSign().getSignTitle().trim().length() > 0){
			status = ValidationUtils.checkValidation(obj.getImporterSign().getSignTitle(), logMessageValidation, "108", "SignTitle", "35", maLoi4, 100, status);
		}
		
		//SignPlace
		status = ValidationUtils.checkValidation(obj.getImporterSign().getSignPlace(), logMessageValidation, "108", "SignPlace", "36", maLoi2, 50, status);
		
		//SignDate
		status = ValidationUtils.checkValidation(obj.getImporterSign().getSignDate(), logMessageValidation, "108", "SignDate", "37", maLoi3, 50, status);
		}
		//CustomerDeclaration
		List<CustomerDeclaration> liCustomerDeclaration = obj.getCustomerDeclaration();
		//TODO
		if(obj.getCustomsRegion() == 0){
		status = ValidationUtils.checkValidationListNull(liCustomerDeclaration, logMessageValidation,"108", "CustomerDeclaration", "33", status);
		}
		if(liCustomerDeclaration != null && liCustomerDeclaration.size()>0){
			for(CustomerDeclaration customerDeclaration : liCustomerDeclaration){
				status=validationCustomerDeclarationlist(customerDeclaration, idMessageLog);
			}
		}
		
		
		
		return status;
	}

	private static boolean validationCustomerDeclarationlist(
			CustomerDeclaration customerDeclaration, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//TODO Importer
		status = ValidationUtils.checkValidationNull(customerDeclaration.getImporter(), logMessageValidation,"108", "Importer", "39", status);
		if(status){
		//ImporterCode
		status = ValidationUtils.checkValidationNumber(String.valueOf(customerDeclaration.getImporter().getImporterCode()), logMessageValidation, "108", "ImporterCode", "40", maLoi1, 0, 13, 0, false, status);
		 
		//ImporterName
		status = ValidationUtils.checkValidation(customerDeclaration.getImporter().getImporterName(), logMessageValidation, "108", "ImporterName", "41", maLoi2, 255, status);
		
		//ImporterAddress
		status = ValidationUtils.checkValidation(customerDeclaration.getImporter().getImporterAddress(), logMessageValidation, "108", "ImporterAddress", "42", maLoi2, 500, status);
		}
		//TODO CustomsDeclaration
		status = ValidationUtils.checkValidationNull(customerDeclaration.getCustomsDeclaration(), logMessageValidation,"108", "CustomsDeclaration", "44", status);
		if(status){
		//ImportCustomsDeclareNo
		//status = ValidationUtils.checkValidationNumber(String.valueOf(customerDeclaration.getCustomsDeclaration().getImportCustomsDeclareNo()), logMessageValidation, "108", "ImportCustomsDeclareNo", "45", maLoi1, 0, 12, 0, false , status);
		
		//ImportCustomsDeclareDate
		status = ValidationUtils.checkValidation(customerDeclaration.getCustomsDeclaration().getImportCustomsDeclareDate(), logMessageValidation, "108", "ImportCustomsDeclareDate", "46", maLoi3, 50, status);
		
		//CustomsResult
		status = ValidationUtils.checkValidation(customerDeclaration.getCustomsDeclaration().getCustomsResult(), logMessageValidation, "108", "CustomsResult", "47", maLoi2, 255, status);
		
		//ProductCheck
		if(customerDeclaration.getCustomsDeclaration().getProductCheck() != null && customerDeclaration.getCustomsDeclaration().getProductCheck().trim().length() > 0){
			status = ValidationUtils.checkValidation(customerDeclaration.getCustomsDeclaration().getProductCheck(), logMessageValidation, "108", "ProductCheck", "48", maLoi4, 100, status);
		}
		
		//ReleaseDate
//		if (customerDeclaration.getCustomsDeclaration().getReleaseDate() != null && !FormatData.isThisDateValid(customerDeclaration.getCustomsDeclaration().getReleaseDate())) {
//			status = false;
//			logMessageValidation.setTagName("Message : 108" + "__" + "ReleaseDate");
//			logMessageValidation.setValidationCode("N108749");
//			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
//			ValidationUtils.addLogMessageValidation(logMessageValidation);
//		}
//		
		//Currency
		if(customerDeclaration.getCustomsDeclaration().getCurrency() != null && customerDeclaration.getCustomsDeclaration().getCurrency().trim().length() > 0){
			status = ValidationUtils.checkValidation(customerDeclaration.getCustomsDeclaration().getCurrency(), logMessageValidation, "108", "Currency", "48", maLoi4, 3, status);
		}
		}
		//CommodityItem
		List<CommodityItem> liCommodityItem = customerDeclaration.getCommodityItem();
		//TODO CommodityItem
		status = ValidationUtils.checkValidationListNull(liCommodityItem, logMessageValidation,"108", "CommodityItem", "50", status);
		
		if(liCommodityItem != null && liCommodityItem.size()>0){
			for(CommodityItem commodityItem : liCommodityItem){
				status=validationCommodityItemlist(commodityItem, idMessageLog);
			}
		}
		
		//Remarks
		if(customerDeclaration.getRemarks() != null && customerDeclaration.getRemarks().trim().length() > 0){
			status = ValidationUtils.checkValidation(customerDeclaration.getRemarks(), logMessageValidation, "108", "Remarks", "55", maLoi4, 255, status);
		}
		
		return status;
	}

	private static boolean validationCommodityItemlist(CommodityItem commodityItem, long idMessageLog) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		int[] maLoi1 = { 1, 3, 4 };
		int[] maLoi2 = { 1, 5, 6 };
		int[] maLoi3 = { 1, 7 };
		int[] maLoi4 = { 5, 6 };
		int[] maLoi5 = { 3, 4 };
		int[] maLoi6 = { 1, 2, 5, 6 };
		
		//VehicleName
		//status = ValidationUtils.checkValidation(commodityItem.getVehicleName(), logMessageValidation, "108", "VehicleName", "51", maLoi2, 255, status);
		
		//VehicleUnitPrice
		status = ValidationUtils.checkValidationNumber(String.valueOf(commodityItem.getVehicleUnitPrice()), logMessageValidation, "108", "VehicleUnitPrice", "52", maLoi1, 1, 20, 3, false, status);
		
		//NumberVehicle
		status = ValidationUtils.checkValidationNumber(String.valueOf(commodityItem.getNumberVehicle()), logMessageValidation, "108", "NumberVehicle", "54", maLoi1, 0, 13, 0, false, status);
		
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
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getSequenceNo()), logMessageValidation, "108", "SequenceNo", "24", maLoi1, 0, 9, 0, false, status);
				
		//CodeNumber
		status = ValidationUtils.checkValidationNumber(String.valueOf(importedVehicle.getCodeNumber()), logMessageValidation, "108", "CodeNumber", "25", maLoi1, 0, 9, 0, false, status);

		//TradeMark
		status = ValidationUtils.checkValidation(importedVehicle.getTradeMark(), logMessageValidation, "108", "TradeMark", "26", maLoi2, 50, status);
		
		//ModelType
//		status = ValidationUtils.checkValidation(importedVehicle.getModelType(), logMessageValidation, "108", "ModelType", "27", maLoi2, 20, status);

		//VehicleType
		if(importedVehicle.getVehicleType() != null && importedVehicle.getVehicleType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getVehicleType(), logMessageValidation, "108", "VehicleType", "28", maLoi4, 20, status);
		}
		
		//EngineType
		if(importedVehicle.getEngineType() != null && importedVehicle.getEngineType().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineType(), logMessageValidation, "108", "EngineType", "29", maLoi4, 20, status);
		}

		//ChassisNumber
		if(importedVehicle.getChassisNumber() != null && importedVehicle.getChassisNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getChassisNumber(), logMessageValidation, "108", "ChassisNumber", "30", maLoi4, 50, status);
		}
		
		//EngineNumber
		if(importedVehicle.getEngineNumber() != null && importedVehicle.getEngineNumber().trim().length() > 0){
			status = ValidationUtils.checkValidation(importedVehicle.getEngineNumber(), logMessageValidation, "108", "EngineNumber", "31", maLoi4, 50, status);
		}
		
		
		
		
		return status;
	}

	private static boolean validationCustomDeclarationlist(
			CustomDeclaration customDeclaration, long idMessageLog) throws Exception {
		
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
		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareNo(), logMessageValidation, "108", "ImportCustomDeclareNo", "08", maLoi2, 20, status);
		
		//ImportCustomDeclareDate
//		status = ValidationUtils.checkValidation(customDeclaration.getImportCustomDeclareDate(), logMessageValidation, "108", "ImportCustomDeclareDate", "09", maLoi2, 50, status);
//		if (customDeclaration.getImportCustomDeclareDate() != null && !FormatData.isThisDateValid(customDeclaration.getImportCustomDeclareDate())) {
//			status = false;
//			logMessageValidation.setTagName("Message : 108" + "__" + "ReleaseDate");
//			logMessageValidation.setValidationCode("N108709");
//			logMessageValidation.setDescription(ValidationUtils.MALOI_07);
//			ValidationUtils.addLogMessageValidation(logMessageValidation);
//		}
//		
		if(customDeclaration.getImportCustomDeclareNo() != null && customDeclaration.getImportCustomDeclareNo().trim().length() > 0){
			//ImportCustomsOfficeCode
			status = ValidationUtils.checkValidation(customDeclaration.getImportCustomsOfficeCode(), logMessageValidation, "108", "ImportCustomsOfficeCode", "9a", maLoi2, 6, status);
			
			//ImportCustomsYear
			status = ValidationUtils.checkValidationNumber(String.valueOf(customDeclaration.getImportCustomsYear()), logMessageValidation, "108", "ImportCustomsYear", "9b", maLoi1, 0, 4, 0, true, status);
		}
		return status;
	}
}