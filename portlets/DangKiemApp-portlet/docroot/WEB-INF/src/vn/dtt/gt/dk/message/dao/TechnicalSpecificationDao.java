package vn.dtt.gt.dk.message.dao;

import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;


/**101 - Ban cung cap Thong tin xe nhap khau*/
public class TechnicalSpecificationDao {
	
	/**
	 * @isNew true nghia la install 1 new record moi, false thuc thi update
	 * */
	public void insertDao(TechnicalSpecification model, Header header, boolean isNew) {
		try {
			
			VehicleGroup group = new VehicleGroupImpl();
			ProductionCountry proCountry = new ProductionCountryImpl();
			VehicleRecord vehicleRecord = new VehicleRecordImpl();
			VehicleSpecification vehicleSpec = new VehicleSpecificationImpl();
			
			//group.setVehicleClass(vehicleClass);
			//group.setRegisteredInspectionId(registeredInspectionId);
			/*group.setTechnicalSpecCode(model.getTechnicalSpecCode());
			group.setReferenceCertificateNo(model.getCertificateRefNo());
			group.setSafetyTestReportNo(safetyTestReportNo);
			group.setEmissionTestReportNo(emissionTestReportNo);
			group.setCopReportNo(copReportNo);
			group.setVehicleType(vehicleType);
			group.setEngineType(engineType);
			group.setMarkAsVehicle(markAsVehicle);
			group.setTradeMark(tradeMark);
			group.setCommercialName(commercialName);
			group.setModelCode(modelCode);
			group.setProductionPlant(productionPlant);
			group.setAddressOfProductionPlant(addressOfProductionPlant);
			group.setEmissionStandard(emissionStandard);
			
			group.setSafetyTestReportId(safetyTestReportId);
			group.setEmissionTestReportId(emissionTestReportId);
			group.setCopReportId(copReportId);
			group.setSpecificationVersion(specificationVersion);
			
			group.setRemarks(remarks);*/
			
			
			
			
			
			/*HsTechnicalSpecification dao = new HsTechnicalSpecificationImpl();
			
			dao.setRequestCode(header.getReference().getMessageId());
			dao.setDocumentName(StringUtil.valueOf(header.getSubject().getReference()));
			dao.setDocumentYear(header.getSubject().getDocumentYear());
			
			dao.setTechnicalSpecCode(model.getTechnicalSpecCode());
			dao.setCertificateRefNo(model.getCertificateRefNo());
			
			//GeneralInfo
			//Importer
			Importer importerModel = (model.getGeneralInfo() != null) ? model.getGeneralInfo().getImporter() : null;
			if (importerModel != null) {
				
				dao.setImporterCode(importerModel.getImporterCode());
				dao.setImporterName(importerModel.getImporterName());
				dao.setImporterAddress(importerModel.getImporterAddress());
				dao.setRepresentative(importerModel.getRepresentative());
				dao.setPhone(importerModel.getPhone());
				dao.setFax(importerModel.getFax());
				dao.setEmail(importerModel.getEmail());
			}
			
			GeneralInfo generalInfo = model.getGeneralInfo();
			if (generalInfo != null) {
				dao.setTradeMark(generalInfo.getTradeMark());
				dao.setModelType(generalInfo.getModelType());
				dao.setModelCode(generalInfo.getModelCode());
				dao.setVehicleType(generalInfo.getVehicleType());
				dao.setEngineType(generalInfo.getEngineType());
				dao.setManufacturer(generalInfo.getManufacturer());
				dao.setAddressProductionPlant(generalInfo.getAddressProductionPlant());
				
				//ProductionCountry
				List<String> lstCountryCode = (generalInfo.getProductionCountry() != null) ? generalInfo.getProductionCountry().getCountryCode() : new ArrayList<String>();
				dao.setProductionCountry((lstCountryCode.size() > 0) ? CollectionUtils.listToString(lstCountryCode) : "");
				dao.setMarkAsVehicle(generalInfo.getMarkAsVehicle());
			}
			
			//SpecificationList
			//SpecItem
			
			List<SpecItem> lstItem = (model.getSpecificationList() != null) ? model.getSpecificationList().getSpecItem() : new ArrayList<SpecItem>();
			if (lstItem.size() > 0) {
				for (SpecItem item : lstItem) {
					
					HsSpecItem daoItem = new HsSpecItemImpl();
					daoItem.setTechnicalSpecCode(model.getTechnicalSpecCode());
					daoItem.setSpecificationCode(item.getSpecificationCode());
					daoItem.setSpecificationName(item.getSpecificationName());
					daoItem.setDeclarationValue1(item.getDeclarationValue1());
					daoItem.setDeclarationValue2(item.getDeclarationValue2());
					daoItem.setDeclarationValue3(item.getDeclarationValue3());
					daoItem.setDeclarationValue4(item.getDeclarationValue4());
					daoItem.setDeclarationValue5(item.getDeclarationValue5());
					daoItem.setDeclarationValue6(item.getDeclarationValue6());
					
					HsSpecItemLocalServiceUtil.addHsSpecItem(daoItem);
				}
			}
			
			dao.setRemarks(model.getRemarks());
			//AttachedFile
			List<AttachedFile> lstAfile = (model.getAttachedFile() != null) ? model.getAttachedFile() : new ArrayList<AttachedFile>();
			if (lstAfile.size() > 0) {
				HsAttachedFile dFile = null;
				for (AttachedFile file : lstAfile) {
					dFile = new HsAttachedFileImpl();
					dFile = BeanUtils.copyBean(file, null, dFile);
					//request Code HsRequestQualityInspection
					dFile.setRequestCode(header.getReference().getMessageId());
					dFile.setRequestCode(header.getReference().getMessageId());
					dFile.setDocumentName(StringUtil.valueOf(header.getSubject().getReference()));
					dFile.setDocumentYear(header.getSubject().getDocumentYear());
					HsAttachedFileLocalServiceUtil.addHsAttachedFile(dFile);
				}
			}
			
			List<ImportedVehicle> lstVehicle = (model.getImportedVehicle() != null) ? model.getImportedVehicle() : new ArrayList<ImportedVehicle>();
			if (lstVehicle.size() > 0) {
				HsImportedVehicle dVehicle = null;
				for (ImportedVehicle vehicle : lstVehicle) {
					dVehicle = new HsImportedVehicleImpl();
					
					dVehicle = BeanUtils.copyBean(vehicle, null, dVehicle);
					dVehicle.setRequestCode(header.getReference().getMessageId());
					dVehicle.setRequestCode(header.getReference().getMessageId());
					dVehicle.setDocumentName(StringUtil.valueOf(header.getSubject().getReference()));
					dVehicle.setDocumentYear(header.getSubject().getDocumentYear());
					
					HsImportedVehicleLocalServiceUtil.addHsImportedVehicle(dVehicle);
				}
			}
			
			HsTechnicalSpecificationLocalServiceUtil.addHsTechnicalSpecification(dao);*/
		} catch (Exception e) {
		}
	}
}
