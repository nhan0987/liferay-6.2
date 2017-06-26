/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VehicleCertificate}.
 * </p>
 *
 * @author win_64
 * @see VehicleCertificate
 * @generated
 */
public class VehicleCertificateWrapper implements VehicleCertificate,
	ModelWrapper<VehicleCertificate> {
	public VehicleCertificateWrapper(VehicleCertificate vehicleCertificate) {
		_vehicleCertificate = vehicleCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtGateway", getMtGateway());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("vehicleRecordid", getVehicleRecordid());
		attributes.put("draftCertificateid", getDraftCertificateid());
		attributes.put("certificateRecordid", getCertificateRecordid());
		attributes.put("debitNoteId", getDebitNoteId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("technicalSpecCode", getTechnicalSpecCode());
		attributes.put("referenceCertificateNo", getReferenceCertificateNo());
		attributes.put("safetytestreportNo", getSafetytestreportNo());
		attributes.put("emissiontestreportNo", getEmissiontestreportNo());
		attributes.put("copreportNo", getCopreportNo());
		attributes.put("controlreportNo", getControlreportNo());
		attributes.put("vehicletypeDescription", getVehicletypeDescription());
		attributes.put("vehicleType", getVehicleType());
		attributes.put("enginetypeDescription", getEnginetypeDescription());
		attributes.put("engineType", getEngineType());
		attributes.put("markAsVehicle", getMarkAsVehicle());
		attributes.put("trademarkDescription", getTrademarkDescription());
		attributes.put("tradeMark", getTradeMark());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("productionPlant", getProductionPlant());
		attributes.put("addressOfProductionPlant", getAddressOfProductionPlant());
		attributes.put("emissionStandard", getEmissionStandard());
		attributes.put("codeNumber", getCodeNumber());
		attributes.put("chassisNumber", getChassisNumber());
		attributes.put("engineNumber", getEngineNumber());
		attributes.put("productionYear", getProductionYear());
		attributes.put("countryCode", getCountryCode());
		attributes.put("countryName", getCountryName());
		attributes.put("currentStatus", getCurrentStatus());
		attributes.put("vehicleEngineUsage", getVehicleEngineUsage());
		attributes.put("vehicleColor", getVehicleColor());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("currency", getCurrency());
		attributes.put("remarks", getRemarks());
		attributes.put("markUpStatus", getMarkUpStatus());
		attributes.put("markAsSample", getMarkAsSample());
		attributes.put("vehicleengineStatus", getVehicleengineStatus());
		attributes.put("vehicleengineFolder", getVehicleengineFolder());
		attributes.put("vehicleGroupInitialId", getVehicleGroupInitialId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("importerCode", getImporterCode());
		attributes.put("importerName", getImporterName());
		attributes.put("importerAddress", getImporterAddress());
		attributes.put("representative", getRepresentative());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDistrictCode", getInspectionDistrictCode());
		attributes.put("inspectionProvinceCode", getInspectionProvinceCode());
		attributes.put("inspectionDistrict", getInspectionDistrict());
		attributes.put("inspectionProvince", getInspectionProvince());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("inspectionRecordNo", getInspectionRecordNo());
		attributes.put("inspectionDateFrom", getInspectionDateFrom());
		attributes.put("inspectionDateTo", getInspectionDateTo());
		attributes.put("inspectionMode", getInspectionMode());
		attributes.put("inspectionModeDescription",
			getInspectionModeDescription());
		attributes.put("confirmedResult", getConfirmedResult());
		attributes.put("confirmedResultDescription",
			getConfirmedResultDescription());
		attributes.put("importCustomDeclareDate", getImportCustomDeclareDate());
		attributes.put("importCustomDeclareNo", getImportCustomDeclareNo());
		attributes.put("corporationCode", getCorporationCode());
		attributes.put("corporationName", getCorporationName());
		attributes.put("inspectorContactCode", getInspectorContactCode());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("certificateType", getCertificateType());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("oldcertificateNumber", getOldcertificateNumber());
		attributes.put("signDate", getSignDate());
		attributes.put("stampStatus", getStampStatus());
		attributes.put("certificateStatus", getCertificateStatus());
		attributes.put("digitalIssued", getDigitalIssued());
		attributes.put("markupSafeTest", getMarkupSafeTest());
		attributes.put("markupEmissionTest", getMarkupEmissionTest());
		attributes.put("markupControl", getMarkupControl());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("inspectorOrganization", getInspectorOrganization());
		attributes.put("inspectorDivision", getInspectorDivision());
		attributes.put("inspectorSignName", getInspectorSignName());
		attributes.put("inspectorSignTitle", getInspectorSignTitle());
		attributes.put("inspectorSignPlace", getInspectorSignPlace());
		attributes.put("inspectorSignDate", getInspectorSignDate());
		attributes.put("dossierDate", getDossierDate());
		attributes.put("filedangkykiemtraId", getFiledangkykiemtraId());
		attributes.put("filebienbankiemtraId", getFilebienbankiemtraId());
		attributes.put("filechungchiId", getFilechungchiId());
		attributes.put("filebaocaotnantoanId", getFilebaocaotnantoanId());
		attributes.put("filebaocaotnkhithaiId", getFilebaocaotnkhithaiId());
		attributes.put("fileketluangiamdinhId", getFileketluangiamdinhId());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtGateway = (Long)attributes.get("mtGateway");

		if (mtGateway != null) {
			setMtGateway(mtGateway);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Long vehicleRecordid = (Long)attributes.get("vehicleRecordid");

		if (vehicleRecordid != null) {
			setVehicleRecordid(vehicleRecordid);
		}

		Long draftCertificateid = (Long)attributes.get("draftCertificateid");

		if (draftCertificateid != null) {
			setDraftCertificateid(draftCertificateid);
		}

		Long certificateRecordid = (Long)attributes.get("certificateRecordid");

		if (certificateRecordid != null) {
			setCertificateRecordid(certificateRecordid);
		}

		Long debitNoteId = (Long)attributes.get("debitNoteId");

		if (debitNoteId != null) {
			setDebitNoteId(debitNoteId);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String technicalSpecCode = (String)attributes.get("technicalSpecCode");

		if (technicalSpecCode != null) {
			setTechnicalSpecCode(technicalSpecCode);
		}

		String referenceCertificateNo = (String)attributes.get(
				"referenceCertificateNo");

		if (referenceCertificateNo != null) {
			setReferenceCertificateNo(referenceCertificateNo);
		}

		String safetytestreportNo = (String)attributes.get("safetytestreportNo");

		if (safetytestreportNo != null) {
			setSafetytestreportNo(safetytestreportNo);
		}

		String emissiontestreportNo = (String)attributes.get(
				"emissiontestreportNo");

		if (emissiontestreportNo != null) {
			setEmissiontestreportNo(emissiontestreportNo);
		}

		String copreportNo = (String)attributes.get("copreportNo");

		if (copreportNo != null) {
			setCopreportNo(copreportNo);
		}

		String controlreportNo = (String)attributes.get("controlreportNo");

		if (controlreportNo != null) {
			setControlreportNo(controlreportNo);
		}

		String vehicletypeDescription = (String)attributes.get(
				"vehicletypeDescription");

		if (vehicletypeDescription != null) {
			setVehicletypeDescription(vehicletypeDescription);
		}

		String vehicleType = (String)attributes.get("vehicleType");

		if (vehicleType != null) {
			setVehicleType(vehicleType);
		}

		String enginetypeDescription = (String)attributes.get(
				"enginetypeDescription");

		if (enginetypeDescription != null) {
			setEnginetypeDescription(enginetypeDescription);
		}

		String engineType = (String)attributes.get("engineType");

		if (engineType != null) {
			setEngineType(engineType);
		}

		Integer markAsVehicle = (Integer)attributes.get("markAsVehicle");

		if (markAsVehicle != null) {
			setMarkAsVehicle(markAsVehicle);
		}

		String trademarkDescription = (String)attributes.get(
				"trademarkDescription");

		if (trademarkDescription != null) {
			setTrademarkDescription(trademarkDescription);
		}

		String tradeMark = (String)attributes.get("tradeMark");

		if (tradeMark != null) {
			setTradeMark(tradeMark);
		}

		String commercialName = (String)attributes.get("commercialName");

		if (commercialName != null) {
			setCommercialName(commercialName);
		}

		String modelCode = (String)attributes.get("modelCode");

		if (modelCode != null) {
			setModelCode(modelCode);
		}

		String productionPlant = (String)attributes.get("productionPlant");

		if (productionPlant != null) {
			setProductionPlant(productionPlant);
		}

		String addressOfProductionPlant = (String)attributes.get(
				"addressOfProductionPlant");

		if (addressOfProductionPlant != null) {
			setAddressOfProductionPlant(addressOfProductionPlant);
		}

		String emissionStandard = (String)attributes.get("emissionStandard");

		if (emissionStandard != null) {
			setEmissionStandard(emissionStandard);
		}

		Long codeNumber = (Long)attributes.get("codeNumber");

		if (codeNumber != null) {
			setCodeNumber(codeNumber);
		}

		String chassisNumber = (String)attributes.get("chassisNumber");

		if (chassisNumber != null) {
			setChassisNumber(chassisNumber);
		}

		String engineNumber = (String)attributes.get("engineNumber");

		if (engineNumber != null) {
			setEngineNumber(engineNumber);
		}

		String productionYear = (String)attributes.get("productionYear");

		if (productionYear != null) {
			setProductionYear(productionYear);
		}

		String countryCode = (String)attributes.get("countryCode");

		if (countryCode != null) {
			setCountryCode(countryCode);
		}

		String countryName = (String)attributes.get("countryName");

		if (countryName != null) {
			setCountryName(countryName);
		}

		String currentStatus = (String)attributes.get("currentStatus");

		if (currentStatus != null) {
			setCurrentStatus(currentStatus);
		}

		String vehicleEngineUsage = (String)attributes.get("vehicleEngineUsage");

		if (vehicleEngineUsage != null) {
			setVehicleEngineUsage(vehicleEngineUsage);
		}

		String vehicleColor = (String)attributes.get("vehicleColor");

		if (vehicleColor != null) {
			setVehicleColor(vehicleColor);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long markUpStatus = (Long)attributes.get("markUpStatus");

		if (markUpStatus != null) {
			setMarkUpStatus(markUpStatus);
		}

		Integer markAsSample = (Integer)attributes.get("markAsSample");

		if (markAsSample != null) {
			setMarkAsSample(markAsSample);
		}

		Long vehicleengineStatus = (Long)attributes.get("vehicleengineStatus");

		if (vehicleengineStatus != null) {
			setVehicleengineStatus(vehicleengineStatus);
		}

		Long vehicleengineFolder = (Long)attributes.get("vehicleengineFolder");

		if (vehicleengineFolder != null) {
			setVehicleengineFolder(vehicleengineFolder);
		}

		Long vehicleGroupInitialId = (Long)attributes.get(
				"vehicleGroupInitialId");

		if (vehicleGroupInitialId != null) {
			setVehicleGroupInitialId(vehicleGroupInitialId);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		String importerCode = (String)attributes.get("importerCode");

		if (importerCode != null) {
			setImporterCode(importerCode);
		}

		String importerName = (String)attributes.get("importerName");

		if (importerName != null) {
			setImporterName(importerName);
		}

		String importerAddress = (String)attributes.get("importerAddress");

		if (importerAddress != null) {
			setImporterAddress(importerAddress);
		}

		String representative = (String)attributes.get("representative");

		if (representative != null) {
			setRepresentative(representative);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		String inspectionDistrictCode = (String)attributes.get(
				"inspectionDistrictCode");

		if (inspectionDistrictCode != null) {
			setInspectionDistrictCode(inspectionDistrictCode);
		}

		String inspectionProvinceCode = (String)attributes.get(
				"inspectionProvinceCode");

		if (inspectionProvinceCode != null) {
			setInspectionProvinceCode(inspectionProvinceCode);
		}

		String inspectionDistrict = (String)attributes.get("inspectionDistrict");

		if (inspectionDistrict != null) {
			setInspectionDistrict(inspectionDistrict);
		}

		String inspectionProvince = (String)attributes.get("inspectionProvince");

		if (inspectionProvince != null) {
			setInspectionProvince(inspectionProvince);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		String inspectionRecordNo = (String)attributes.get("inspectionRecordNo");

		if (inspectionRecordNo != null) {
			setInspectionRecordNo(inspectionRecordNo);
		}

		Date inspectionDateFrom = (Date)attributes.get("inspectionDateFrom");

		if (inspectionDateFrom != null) {
			setInspectionDateFrom(inspectionDateFrom);
		}

		Date inspectionDateTo = (Date)attributes.get("inspectionDateTo");

		if (inspectionDateTo != null) {
			setInspectionDateTo(inspectionDateTo);
		}

		Long inspectionMode = (Long)attributes.get("inspectionMode");

		if (inspectionMode != null) {
			setInspectionMode(inspectionMode);
		}

		String inspectionModeDescription = (String)attributes.get(
				"inspectionModeDescription");

		if (inspectionModeDescription != null) {
			setInspectionModeDescription(inspectionModeDescription);
		}

		Long confirmedResult = (Long)attributes.get("confirmedResult");

		if (confirmedResult != null) {
			setConfirmedResult(confirmedResult);
		}

		String confirmedResultDescription = (String)attributes.get(
				"confirmedResultDescription");

		if (confirmedResultDescription != null) {
			setConfirmedResultDescription(confirmedResultDescription);
		}

		Date importCustomDeclareDate = (Date)attributes.get(
				"importCustomDeclareDate");

		if (importCustomDeclareDate != null) {
			setImportCustomDeclareDate(importCustomDeclareDate);
		}

		String importCustomDeclareNo = (String)attributes.get(
				"importCustomDeclareNo");

		if (importCustomDeclareNo != null) {
			setImportCustomDeclareNo(importCustomDeclareNo);
		}

		String corporationCode = (String)attributes.get("corporationCode");

		if (corporationCode != null) {
			setCorporationCode(corporationCode);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		String inspectorContactCode = (String)attributes.get(
				"inspectorContactCode");

		if (inspectorContactCode != null) {
			setInspectorContactCode(inspectorContactCode);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		Long certificateType = (Long)attributes.get("certificateType");

		if (certificateType != null) {
			setCertificateType(certificateType);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		String oldcertificateNumber = (String)attributes.get(
				"oldcertificateNumber");

		if (oldcertificateNumber != null) {
			setOldcertificateNumber(oldcertificateNumber);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long stampStatus = (Long)attributes.get("stampStatus");

		if (stampStatus != null) {
			setStampStatus(stampStatus);
		}

		String certificateStatus = (String)attributes.get("certificateStatus");

		if (certificateStatus != null) {
			setCertificateStatus(certificateStatus);
		}

		Long digitalIssued = (Long)attributes.get("digitalIssued");

		if (digitalIssued != null) {
			setDigitalIssued(digitalIssued);
		}

		Long markupSafeTest = (Long)attributes.get("markupSafeTest");

		if (markupSafeTest != null) {
			setMarkupSafeTest(markupSafeTest);
		}

		Long markupEmissionTest = (Long)attributes.get("markupEmissionTest");

		if (markupEmissionTest != null) {
			setMarkupEmissionTest(markupEmissionTest);
		}

		Long markupControl = (Long)attributes.get("markupControl");

		if (markupControl != null) {
			setMarkupControl(markupControl);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String inspectorOrganization = (String)attributes.get(
				"inspectorOrganization");

		if (inspectorOrganization != null) {
			setInspectorOrganization(inspectorOrganization);
		}

		String inspectorDivision = (String)attributes.get("inspectorDivision");

		if (inspectorDivision != null) {
			setInspectorDivision(inspectorDivision);
		}

		String inspectorSignName = (String)attributes.get("inspectorSignName");

		if (inspectorSignName != null) {
			setInspectorSignName(inspectorSignName);
		}

		String inspectorSignTitle = (String)attributes.get("inspectorSignTitle");

		if (inspectorSignTitle != null) {
			setInspectorSignTitle(inspectorSignTitle);
		}

		String inspectorSignPlace = (String)attributes.get("inspectorSignPlace");

		if (inspectorSignPlace != null) {
			setInspectorSignPlace(inspectorSignPlace);
		}

		Date inspectorSignDate = (Date)attributes.get("inspectorSignDate");

		if (inspectorSignDate != null) {
			setInspectorSignDate(inspectorSignDate);
		}

		Date dossierDate = (Date)attributes.get("dossierDate");

		if (dossierDate != null) {
			setDossierDate(dossierDate);
		}

		Long filedangkykiemtraId = (Long)attributes.get("filedangkykiemtraId");

		if (filedangkykiemtraId != null) {
			setFiledangkykiemtraId(filedangkykiemtraId);
		}

		Long filebienbankiemtraId = (Long)attributes.get("filebienbankiemtraId");

		if (filebienbankiemtraId != null) {
			setFilebienbankiemtraId(filebienbankiemtraId);
		}

		Long filechungchiId = (Long)attributes.get("filechungchiId");

		if (filechungchiId != null) {
			setFilechungchiId(filechungchiId);
		}

		Long filebaocaotnantoanId = (Long)attributes.get("filebaocaotnantoanId");

		if (filebaocaotnantoanId != null) {
			setFilebaocaotnantoanId(filebaocaotnantoanId);
		}

		Long filebaocaotnkhithaiId = (Long)attributes.get(
				"filebaocaotnkhithaiId");

		if (filebaocaotnkhithaiId != null) {
			setFilebaocaotnkhithaiId(filebaocaotnkhithaiId);
		}

		Long fileketluangiamdinhId = (Long)attributes.get(
				"fileketluangiamdinhId");

		if (fileketluangiamdinhId != null) {
			setFileketluangiamdinhId(fileketluangiamdinhId);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	/**
	* Returns the primary key of this vehicle certificate.
	*
	* @return the primary key of this vehicle certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicleCertificate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle certificate.
	*
	* @param primaryKey the primary key of this vehicle certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicleCertificate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehicle certificate.
	*
	* @return the ID of this vehicle certificate
	*/
	@Override
	public long getId() {
		return _vehicleCertificate.getId();
	}

	/**
	* Sets the ID of this vehicle certificate.
	*
	* @param id the ID of this vehicle certificate
	*/
	@Override
	public void setId(long id) {
		_vehicleCertificate.setId(id);
	}

	/**
	* Returns the mt gateway of this vehicle certificate.
	*
	* @return the mt gateway of this vehicle certificate
	*/
	@Override
	public long getMtGateway() {
		return _vehicleCertificate.getMtGateway();
	}

	/**
	* Sets the mt gateway of this vehicle certificate.
	*
	* @param mtGateway the mt gateway of this vehicle certificate
	*/
	@Override
	public void setMtGateway(long mtGateway) {
		_vehicleCertificate.setMtGateway(mtGateway);
	}

	/**
	* Returns the ho so thu tuc ID of this vehicle certificate.
	*
	* @return the ho so thu tuc ID of this vehicle certificate
	*/
	@Override
	public long getHoSoThuTucId() {
		return _vehicleCertificate.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this vehicle certificate.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this vehicle certificate
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_vehicleCertificate.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the sequence no of this vehicle certificate.
	*
	* @return the sequence no of this vehicle certificate
	*/
	@Override
	public long getSequenceNo() {
		return _vehicleCertificate.getSequenceNo();
	}

	/**
	* Sets the sequence no of this vehicle certificate.
	*
	* @param sequenceNo the sequence no of this vehicle certificate
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vehicleCertificate.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the vehicle recordid of this vehicle certificate.
	*
	* @return the vehicle recordid of this vehicle certificate
	*/
	@Override
	public long getVehicleRecordid() {
		return _vehicleCertificate.getVehicleRecordid();
	}

	/**
	* Sets the vehicle recordid of this vehicle certificate.
	*
	* @param vehicleRecordid the vehicle recordid of this vehicle certificate
	*/
	@Override
	public void setVehicleRecordid(long vehicleRecordid) {
		_vehicleCertificate.setVehicleRecordid(vehicleRecordid);
	}

	/**
	* Returns the draft certificateid of this vehicle certificate.
	*
	* @return the draft certificateid of this vehicle certificate
	*/
	@Override
	public long getDraftCertificateid() {
		return _vehicleCertificate.getDraftCertificateid();
	}

	/**
	* Sets the draft certificateid of this vehicle certificate.
	*
	* @param draftCertificateid the draft certificateid of this vehicle certificate
	*/
	@Override
	public void setDraftCertificateid(long draftCertificateid) {
		_vehicleCertificate.setDraftCertificateid(draftCertificateid);
	}

	/**
	* Returns the certificate recordid of this vehicle certificate.
	*
	* @return the certificate recordid of this vehicle certificate
	*/
	@Override
	public long getCertificateRecordid() {
		return _vehicleCertificate.getCertificateRecordid();
	}

	/**
	* Sets the certificate recordid of this vehicle certificate.
	*
	* @param certificateRecordid the certificate recordid of this vehicle certificate
	*/
	@Override
	public void setCertificateRecordid(long certificateRecordid) {
		_vehicleCertificate.setCertificateRecordid(certificateRecordid);
	}

	/**
	* Returns the debit note ID of this vehicle certificate.
	*
	* @return the debit note ID of this vehicle certificate
	*/
	@Override
	public long getDebitNoteId() {
		return _vehicleCertificate.getDebitNoteId();
	}

	/**
	* Sets the debit note ID of this vehicle certificate.
	*
	* @param debitNoteId the debit note ID of this vehicle certificate
	*/
	@Override
	public void setDebitNoteId(long debitNoteId) {
		_vehicleCertificate.setDebitNoteId(debitNoteId);
	}

	/**
	* Returns the vehicle group ID of this vehicle certificate.
	*
	* @return the vehicle group ID of this vehicle certificate
	*/
	@Override
	public long getVehicleGroupId() {
		return _vehicleCertificate.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this vehicle certificate.
	*
	* @param vehicleGroupId the vehicle group ID of this vehicle certificate
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleCertificate.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the vehicle class of this vehicle certificate.
	*
	* @return the vehicle class of this vehicle certificate
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _vehicleCertificate.getVehicleClass();
	}

	/**
	* Sets the vehicle class of this vehicle certificate.
	*
	* @param vehicleClass the vehicle class of this vehicle certificate
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_vehicleCertificate.setVehicleClass(vehicleClass);
	}

	/**
	* Returns the technical spec code of this vehicle certificate.
	*
	* @return the technical spec code of this vehicle certificate
	*/
	@Override
	public java.lang.String getTechnicalSpecCode() {
		return _vehicleCertificate.getTechnicalSpecCode();
	}

	/**
	* Sets the technical spec code of this vehicle certificate.
	*
	* @param technicalSpecCode the technical spec code of this vehicle certificate
	*/
	@Override
	public void setTechnicalSpecCode(java.lang.String technicalSpecCode) {
		_vehicleCertificate.setTechnicalSpecCode(technicalSpecCode);
	}

	/**
	* Returns the reference certificate no of this vehicle certificate.
	*
	* @return the reference certificate no of this vehicle certificate
	*/
	@Override
	public java.lang.String getReferenceCertificateNo() {
		return _vehicleCertificate.getReferenceCertificateNo();
	}

	/**
	* Sets the reference certificate no of this vehicle certificate.
	*
	* @param referenceCertificateNo the reference certificate no of this vehicle certificate
	*/
	@Override
	public void setReferenceCertificateNo(
		java.lang.String referenceCertificateNo) {
		_vehicleCertificate.setReferenceCertificateNo(referenceCertificateNo);
	}

	/**
	* Returns the safetytestreport no of this vehicle certificate.
	*
	* @return the safetytestreport no of this vehicle certificate
	*/
	@Override
	public java.lang.String getSafetytestreportNo() {
		return _vehicleCertificate.getSafetytestreportNo();
	}

	/**
	* Sets the safetytestreport no of this vehicle certificate.
	*
	* @param safetytestreportNo the safetytestreport no of this vehicle certificate
	*/
	@Override
	public void setSafetytestreportNo(java.lang.String safetytestreportNo) {
		_vehicleCertificate.setSafetytestreportNo(safetytestreportNo);
	}

	/**
	* Returns the emissiontestreport no of this vehicle certificate.
	*
	* @return the emissiontestreport no of this vehicle certificate
	*/
	@Override
	public java.lang.String getEmissiontestreportNo() {
		return _vehicleCertificate.getEmissiontestreportNo();
	}

	/**
	* Sets the emissiontestreport no of this vehicle certificate.
	*
	* @param emissiontestreportNo the emissiontestreport no of this vehicle certificate
	*/
	@Override
	public void setEmissiontestreportNo(java.lang.String emissiontestreportNo) {
		_vehicleCertificate.setEmissiontestreportNo(emissiontestreportNo);
	}

	/**
	* Returns the copreport no of this vehicle certificate.
	*
	* @return the copreport no of this vehicle certificate
	*/
	@Override
	public java.lang.String getCopreportNo() {
		return _vehicleCertificate.getCopreportNo();
	}

	/**
	* Sets the copreport no of this vehicle certificate.
	*
	* @param copreportNo the copreport no of this vehicle certificate
	*/
	@Override
	public void setCopreportNo(java.lang.String copreportNo) {
		_vehicleCertificate.setCopreportNo(copreportNo);
	}

	/**
	* Returns the controlreport no of this vehicle certificate.
	*
	* @return the controlreport no of this vehicle certificate
	*/
	@Override
	public java.lang.String getControlreportNo() {
		return _vehicleCertificate.getControlreportNo();
	}

	/**
	* Sets the controlreport no of this vehicle certificate.
	*
	* @param controlreportNo the controlreport no of this vehicle certificate
	*/
	@Override
	public void setControlreportNo(java.lang.String controlreportNo) {
		_vehicleCertificate.setControlreportNo(controlreportNo);
	}

	/**
	* Returns the vehicletype description of this vehicle certificate.
	*
	* @return the vehicletype description of this vehicle certificate
	*/
	@Override
	public java.lang.String getVehicletypeDescription() {
		return _vehicleCertificate.getVehicletypeDescription();
	}

	/**
	* Sets the vehicletype description of this vehicle certificate.
	*
	* @param vehicletypeDescription the vehicletype description of this vehicle certificate
	*/
	@Override
	public void setVehicletypeDescription(
		java.lang.String vehicletypeDescription) {
		_vehicleCertificate.setVehicletypeDescription(vehicletypeDescription);
	}

	/**
	* Returns the vehicle type of this vehicle certificate.
	*
	* @return the vehicle type of this vehicle certificate
	*/
	@Override
	public java.lang.String getVehicleType() {
		return _vehicleCertificate.getVehicleType();
	}

	/**
	* Sets the vehicle type of this vehicle certificate.
	*
	* @param vehicleType the vehicle type of this vehicle certificate
	*/
	@Override
	public void setVehicleType(java.lang.String vehicleType) {
		_vehicleCertificate.setVehicleType(vehicleType);
	}

	/**
	* Returns the enginetype description of this vehicle certificate.
	*
	* @return the enginetype description of this vehicle certificate
	*/
	@Override
	public java.lang.String getEnginetypeDescription() {
		return _vehicleCertificate.getEnginetypeDescription();
	}

	/**
	* Sets the enginetype description of this vehicle certificate.
	*
	* @param enginetypeDescription the enginetype description of this vehicle certificate
	*/
	@Override
	public void setEnginetypeDescription(java.lang.String enginetypeDescription) {
		_vehicleCertificate.setEnginetypeDescription(enginetypeDescription);
	}

	/**
	* Returns the engine type of this vehicle certificate.
	*
	* @return the engine type of this vehicle certificate
	*/
	@Override
	public java.lang.String getEngineType() {
		return _vehicleCertificate.getEngineType();
	}

	/**
	* Sets the engine type of this vehicle certificate.
	*
	* @param engineType the engine type of this vehicle certificate
	*/
	@Override
	public void setEngineType(java.lang.String engineType) {
		_vehicleCertificate.setEngineType(engineType);
	}

	/**
	* Returns the mark as vehicle of this vehicle certificate.
	*
	* @return the mark as vehicle of this vehicle certificate
	*/
	@Override
	public int getMarkAsVehicle() {
		return _vehicleCertificate.getMarkAsVehicle();
	}

	/**
	* Sets the mark as vehicle of this vehicle certificate.
	*
	* @param markAsVehicle the mark as vehicle of this vehicle certificate
	*/
	@Override
	public void setMarkAsVehicle(int markAsVehicle) {
		_vehicleCertificate.setMarkAsVehicle(markAsVehicle);
	}

	/**
	* Returns the trademark description of this vehicle certificate.
	*
	* @return the trademark description of this vehicle certificate
	*/
	@Override
	public java.lang.String getTrademarkDescription() {
		return _vehicleCertificate.getTrademarkDescription();
	}

	/**
	* Sets the trademark description of this vehicle certificate.
	*
	* @param trademarkDescription the trademark description of this vehicle certificate
	*/
	@Override
	public void setTrademarkDescription(java.lang.String trademarkDescription) {
		_vehicleCertificate.setTrademarkDescription(trademarkDescription);
	}

	/**
	* Returns the trade mark of this vehicle certificate.
	*
	* @return the trade mark of this vehicle certificate
	*/
	@Override
	public java.lang.String getTradeMark() {
		return _vehicleCertificate.getTradeMark();
	}

	/**
	* Sets the trade mark of this vehicle certificate.
	*
	* @param tradeMark the trade mark of this vehicle certificate
	*/
	@Override
	public void setTradeMark(java.lang.String tradeMark) {
		_vehicleCertificate.setTradeMark(tradeMark);
	}

	/**
	* Returns the commercial name of this vehicle certificate.
	*
	* @return the commercial name of this vehicle certificate
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vehicleCertificate.getCommercialName();
	}

	/**
	* Sets the commercial name of this vehicle certificate.
	*
	* @param commercialName the commercial name of this vehicle certificate
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vehicleCertificate.setCommercialName(commercialName);
	}

	/**
	* Returns the model code of this vehicle certificate.
	*
	* @return the model code of this vehicle certificate
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vehicleCertificate.getModelCode();
	}

	/**
	* Sets the model code of this vehicle certificate.
	*
	* @param modelCode the model code of this vehicle certificate
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vehicleCertificate.setModelCode(modelCode);
	}

	/**
	* Returns the production plant of this vehicle certificate.
	*
	* @return the production plant of this vehicle certificate
	*/
	@Override
	public java.lang.String getProductionPlant() {
		return _vehicleCertificate.getProductionPlant();
	}

	/**
	* Sets the production plant of this vehicle certificate.
	*
	* @param productionPlant the production plant of this vehicle certificate
	*/
	@Override
	public void setProductionPlant(java.lang.String productionPlant) {
		_vehicleCertificate.setProductionPlant(productionPlant);
	}

	/**
	* Returns the address of production plant of this vehicle certificate.
	*
	* @return the address of production plant of this vehicle certificate
	*/
	@Override
	public java.lang.String getAddressOfProductionPlant() {
		return _vehicleCertificate.getAddressOfProductionPlant();
	}

	/**
	* Sets the address of production plant of this vehicle certificate.
	*
	* @param addressOfProductionPlant the address of production plant of this vehicle certificate
	*/
	@Override
	public void setAddressOfProductionPlant(
		java.lang.String addressOfProductionPlant) {
		_vehicleCertificate.setAddressOfProductionPlant(addressOfProductionPlant);
	}

	/**
	* Returns the emission standard of this vehicle certificate.
	*
	* @return the emission standard of this vehicle certificate
	*/
	@Override
	public java.lang.String getEmissionStandard() {
		return _vehicleCertificate.getEmissionStandard();
	}

	/**
	* Sets the emission standard of this vehicle certificate.
	*
	* @param emissionStandard the emission standard of this vehicle certificate
	*/
	@Override
	public void setEmissionStandard(java.lang.String emissionStandard) {
		_vehicleCertificate.setEmissionStandard(emissionStandard);
	}

	/**
	* Returns the code number of this vehicle certificate.
	*
	* @return the code number of this vehicle certificate
	*/
	@Override
	public long getCodeNumber() {
		return _vehicleCertificate.getCodeNumber();
	}

	/**
	* Sets the code number of this vehicle certificate.
	*
	* @param codeNumber the code number of this vehicle certificate
	*/
	@Override
	public void setCodeNumber(long codeNumber) {
		_vehicleCertificate.setCodeNumber(codeNumber);
	}

	/**
	* Returns the chassis number of this vehicle certificate.
	*
	* @return the chassis number of this vehicle certificate
	*/
	@Override
	public java.lang.String getChassisNumber() {
		return _vehicleCertificate.getChassisNumber();
	}

	/**
	* Sets the chassis number of this vehicle certificate.
	*
	* @param chassisNumber the chassis number of this vehicle certificate
	*/
	@Override
	public void setChassisNumber(java.lang.String chassisNumber) {
		_vehicleCertificate.setChassisNumber(chassisNumber);
	}

	/**
	* Returns the engine number of this vehicle certificate.
	*
	* @return the engine number of this vehicle certificate
	*/
	@Override
	public java.lang.String getEngineNumber() {
		return _vehicleCertificate.getEngineNumber();
	}

	/**
	* Sets the engine number of this vehicle certificate.
	*
	* @param engineNumber the engine number of this vehicle certificate
	*/
	@Override
	public void setEngineNumber(java.lang.String engineNumber) {
		_vehicleCertificate.setEngineNumber(engineNumber);
	}

	/**
	* Returns the production year of this vehicle certificate.
	*
	* @return the production year of this vehicle certificate
	*/
	@Override
	public java.lang.String getProductionYear() {
		return _vehicleCertificate.getProductionYear();
	}

	/**
	* Sets the production year of this vehicle certificate.
	*
	* @param productionYear the production year of this vehicle certificate
	*/
	@Override
	public void setProductionYear(java.lang.String productionYear) {
		_vehicleCertificate.setProductionYear(productionYear);
	}

	/**
	* Returns the country code of this vehicle certificate.
	*
	* @return the country code of this vehicle certificate
	*/
	@Override
	public java.lang.String getCountryCode() {
		return _vehicleCertificate.getCountryCode();
	}

	/**
	* Sets the country code of this vehicle certificate.
	*
	* @param countryCode the country code of this vehicle certificate
	*/
	@Override
	public void setCountryCode(java.lang.String countryCode) {
		_vehicleCertificate.setCountryCode(countryCode);
	}

	/**
	* Returns the country name of this vehicle certificate.
	*
	* @return the country name of this vehicle certificate
	*/
	@Override
	public java.lang.String getCountryName() {
		return _vehicleCertificate.getCountryName();
	}

	/**
	* Sets the country name of this vehicle certificate.
	*
	* @param countryName the country name of this vehicle certificate
	*/
	@Override
	public void setCountryName(java.lang.String countryName) {
		_vehicleCertificate.setCountryName(countryName);
	}

	/**
	* Returns the current status of this vehicle certificate.
	*
	* @return the current status of this vehicle certificate
	*/
	@Override
	public java.lang.String getCurrentStatus() {
		return _vehicleCertificate.getCurrentStatus();
	}

	/**
	* Sets the current status of this vehicle certificate.
	*
	* @param currentStatus the current status of this vehicle certificate
	*/
	@Override
	public void setCurrentStatus(java.lang.String currentStatus) {
		_vehicleCertificate.setCurrentStatus(currentStatus);
	}

	/**
	* Returns the vehicle engine usage of this vehicle certificate.
	*
	* @return the vehicle engine usage of this vehicle certificate
	*/
	@Override
	public java.lang.String getVehicleEngineUsage() {
		return _vehicleCertificate.getVehicleEngineUsage();
	}

	/**
	* Sets the vehicle engine usage of this vehicle certificate.
	*
	* @param vehicleEngineUsage the vehicle engine usage of this vehicle certificate
	*/
	@Override
	public void setVehicleEngineUsage(java.lang.String vehicleEngineUsage) {
		_vehicleCertificate.setVehicleEngineUsage(vehicleEngineUsage);
	}

	/**
	* Returns the vehicle color of this vehicle certificate.
	*
	* @return the vehicle color of this vehicle certificate
	*/
	@Override
	public java.lang.String getVehicleColor() {
		return _vehicleCertificate.getVehicleColor();
	}

	/**
	* Sets the vehicle color of this vehicle certificate.
	*
	* @param vehicleColor the vehicle color of this vehicle certificate
	*/
	@Override
	public void setVehicleColor(java.lang.String vehicleColor) {
		_vehicleCertificate.setVehicleColor(vehicleColor);
	}

	/**
	* Returns the unit price of this vehicle certificate.
	*
	* @return the unit price of this vehicle certificate
	*/
	@Override
	public double getUnitPrice() {
		return _vehicleCertificate.getUnitPrice();
	}

	/**
	* Sets the unit price of this vehicle certificate.
	*
	* @param unitPrice the unit price of this vehicle certificate
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_vehicleCertificate.setUnitPrice(unitPrice);
	}

	/**
	* Returns the currency of this vehicle certificate.
	*
	* @return the currency of this vehicle certificate
	*/
	@Override
	public java.lang.String getCurrency() {
		return _vehicleCertificate.getCurrency();
	}

	/**
	* Sets the currency of this vehicle certificate.
	*
	* @param currency the currency of this vehicle certificate
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_vehicleCertificate.setCurrency(currency);
	}

	/**
	* Returns the remarks of this vehicle certificate.
	*
	* @return the remarks of this vehicle certificate
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vehicleCertificate.getRemarks();
	}

	/**
	* Sets the remarks of this vehicle certificate.
	*
	* @param remarks the remarks of this vehicle certificate
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vehicleCertificate.setRemarks(remarks);
	}

	/**
	* Returns the mark up status of this vehicle certificate.
	*
	* @return the mark up status of this vehicle certificate
	*/
	@Override
	public long getMarkUpStatus() {
		return _vehicleCertificate.getMarkUpStatus();
	}

	/**
	* Sets the mark up status of this vehicle certificate.
	*
	* @param markUpStatus the mark up status of this vehicle certificate
	*/
	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_vehicleCertificate.setMarkUpStatus(markUpStatus);
	}

	/**
	* Returns the mark as sample of this vehicle certificate.
	*
	* @return the mark as sample of this vehicle certificate
	*/
	@Override
	public int getMarkAsSample() {
		return _vehicleCertificate.getMarkAsSample();
	}

	/**
	* Sets the mark as sample of this vehicle certificate.
	*
	* @param markAsSample the mark as sample of this vehicle certificate
	*/
	@Override
	public void setMarkAsSample(int markAsSample) {
		_vehicleCertificate.setMarkAsSample(markAsSample);
	}

	/**
	* Returns the vehicleengine status of this vehicle certificate.
	*
	* @return the vehicleengine status of this vehicle certificate
	*/
	@Override
	public long getVehicleengineStatus() {
		return _vehicleCertificate.getVehicleengineStatus();
	}

	/**
	* Sets the vehicleengine status of this vehicle certificate.
	*
	* @param vehicleengineStatus the vehicleengine status of this vehicle certificate
	*/
	@Override
	public void setVehicleengineStatus(long vehicleengineStatus) {
		_vehicleCertificate.setVehicleengineStatus(vehicleengineStatus);
	}

	/**
	* Returns the vehicleengine folder of this vehicle certificate.
	*
	* @return the vehicleengine folder of this vehicle certificate
	*/
	@Override
	public long getVehicleengineFolder() {
		return _vehicleCertificate.getVehicleengineFolder();
	}

	/**
	* Sets the vehicleengine folder of this vehicle certificate.
	*
	* @param vehicleengineFolder the vehicleengine folder of this vehicle certificate
	*/
	@Override
	public void setVehicleengineFolder(long vehicleengineFolder) {
		_vehicleCertificate.setVehicleengineFolder(vehicleengineFolder);
	}

	/**
	* Returns the vehicle group initial ID of this vehicle certificate.
	*
	* @return the vehicle group initial ID of this vehicle certificate
	*/
	@Override
	public long getVehicleGroupInitialId() {
		return _vehicleCertificate.getVehicleGroupInitialId();
	}

	/**
	* Sets the vehicle group initial ID of this vehicle certificate.
	*
	* @param vehicleGroupInitialId the vehicle group initial ID of this vehicle certificate
	*/
	@Override
	public void setVehicleGroupInitialId(long vehicleGroupInitialId) {
		_vehicleCertificate.setVehicleGroupInitialId(vehicleGroupInitialId);
	}

	/**
	* Returns the registered inspection ID of this vehicle certificate.
	*
	* @return the registered inspection ID of this vehicle certificate
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _vehicleCertificate.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this vehicle certificate.
	*
	* @param registeredInspectionId the registered inspection ID of this vehicle certificate
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_vehicleCertificate.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the registered number of this vehicle certificate.
	*
	* @return the registered number of this vehicle certificate
	*/
	@Override
	public java.lang.String getRegisteredNumber() {
		return _vehicleCertificate.getRegisteredNumber();
	}

	/**
	* Sets the registered number of this vehicle certificate.
	*
	* @param registeredNumber the registered number of this vehicle certificate
	*/
	@Override
	public void setRegisteredNumber(java.lang.String registeredNumber) {
		_vehicleCertificate.setRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the importer code of this vehicle certificate.
	*
	* @return the importer code of this vehicle certificate
	*/
	@Override
	public java.lang.String getImporterCode() {
		return _vehicleCertificate.getImporterCode();
	}

	/**
	* Sets the importer code of this vehicle certificate.
	*
	* @param importerCode the importer code of this vehicle certificate
	*/
	@Override
	public void setImporterCode(java.lang.String importerCode) {
		_vehicleCertificate.setImporterCode(importerCode);
	}

	/**
	* Returns the importer name of this vehicle certificate.
	*
	* @return the importer name of this vehicle certificate
	*/
	@Override
	public java.lang.String getImporterName() {
		return _vehicleCertificate.getImporterName();
	}

	/**
	* Sets the importer name of this vehicle certificate.
	*
	* @param importerName the importer name of this vehicle certificate
	*/
	@Override
	public void setImporterName(java.lang.String importerName) {
		_vehicleCertificate.setImporterName(importerName);
	}

	/**
	* Returns the importer address of this vehicle certificate.
	*
	* @return the importer address of this vehicle certificate
	*/
	@Override
	public java.lang.String getImporterAddress() {
		return _vehicleCertificate.getImporterAddress();
	}

	/**
	* Sets the importer address of this vehicle certificate.
	*
	* @param importerAddress the importer address of this vehicle certificate
	*/
	@Override
	public void setImporterAddress(java.lang.String importerAddress) {
		_vehicleCertificate.setImporterAddress(importerAddress);
	}

	/**
	* Returns the representative of this vehicle certificate.
	*
	* @return the representative of this vehicle certificate
	*/
	@Override
	public java.lang.String getRepresentative() {
		return _vehicleCertificate.getRepresentative();
	}

	/**
	* Sets the representative of this vehicle certificate.
	*
	* @param representative the representative of this vehicle certificate
	*/
	@Override
	public void setRepresentative(java.lang.String representative) {
		_vehicleCertificate.setRepresentative(representative);
	}

	/**
	* Returns the phone of this vehicle certificate.
	*
	* @return the phone of this vehicle certificate
	*/
	@Override
	public java.lang.String getPhone() {
		return _vehicleCertificate.getPhone();
	}

	/**
	* Sets the phone of this vehicle certificate.
	*
	* @param phone the phone of this vehicle certificate
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_vehicleCertificate.setPhone(phone);
	}

	/**
	* Returns the fax of this vehicle certificate.
	*
	* @return the fax of this vehicle certificate
	*/
	@Override
	public java.lang.String getFax() {
		return _vehicleCertificate.getFax();
	}

	/**
	* Sets the fax of this vehicle certificate.
	*
	* @param fax the fax of this vehicle certificate
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_vehicleCertificate.setFax(fax);
	}

	/**
	* Returns the email of this vehicle certificate.
	*
	* @return the email of this vehicle certificate
	*/
	@Override
	public java.lang.String getEmail() {
		return _vehicleCertificate.getEmail();
	}

	/**
	* Sets the email of this vehicle certificate.
	*
	* @param email the email of this vehicle certificate
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_vehicleCertificate.setEmail(email);
	}

	/**
	* Returns the inspection date of this vehicle certificate.
	*
	* @return the inspection date of this vehicle certificate
	*/
	@Override
	public java.util.Date getInspectionDate() {
		return _vehicleCertificate.getInspectionDate();
	}

	/**
	* Sets the inspection date of this vehicle certificate.
	*
	* @param inspectionDate the inspection date of this vehicle certificate
	*/
	@Override
	public void setInspectionDate(java.util.Date inspectionDate) {
		_vehicleCertificate.setInspectionDate(inspectionDate);
	}

	/**
	* Returns the inspection site of this vehicle certificate.
	*
	* @return the inspection site of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectionSite() {
		return _vehicleCertificate.getInspectionSite();
	}

	/**
	* Sets the inspection site of this vehicle certificate.
	*
	* @param inspectionSite the inspection site of this vehicle certificate
	*/
	@Override
	public void setInspectionSite(java.lang.String inspectionSite) {
		_vehicleCertificate.setInspectionSite(inspectionSite);
	}

	/**
	* Returns the inspection district code of this vehicle certificate.
	*
	* @return the inspection district code of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectionDistrictCode() {
		return _vehicleCertificate.getInspectionDistrictCode();
	}

	/**
	* Sets the inspection district code of this vehicle certificate.
	*
	* @param inspectionDistrictCode the inspection district code of this vehicle certificate
	*/
	@Override
	public void setInspectionDistrictCode(
		java.lang.String inspectionDistrictCode) {
		_vehicleCertificate.setInspectionDistrictCode(inspectionDistrictCode);
	}

	/**
	* Returns the inspection province code of this vehicle certificate.
	*
	* @return the inspection province code of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectionProvinceCode() {
		return _vehicleCertificate.getInspectionProvinceCode();
	}

	/**
	* Sets the inspection province code of this vehicle certificate.
	*
	* @param inspectionProvinceCode the inspection province code of this vehicle certificate
	*/
	@Override
	public void setInspectionProvinceCode(
		java.lang.String inspectionProvinceCode) {
		_vehicleCertificate.setInspectionProvinceCode(inspectionProvinceCode);
	}

	/**
	* Returns the inspection district of this vehicle certificate.
	*
	* @return the inspection district of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectionDistrict() {
		return _vehicleCertificate.getInspectionDistrict();
	}

	/**
	* Sets the inspection district of this vehicle certificate.
	*
	* @param inspectionDistrict the inspection district of this vehicle certificate
	*/
	@Override
	public void setInspectionDistrict(java.lang.String inspectionDistrict) {
		_vehicleCertificate.setInspectionDistrict(inspectionDistrict);
	}

	/**
	* Returns the inspection province of this vehicle certificate.
	*
	* @return the inspection province of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectionProvince() {
		return _vehicleCertificate.getInspectionProvince();
	}

	/**
	* Sets the inspection province of this vehicle certificate.
	*
	* @param inspectionProvince the inspection province of this vehicle certificate
	*/
	@Override
	public void setInspectionProvince(java.lang.String inspectionProvince) {
		_vehicleCertificate.setInspectionProvince(inspectionProvince);
	}

	/**
	* Returns the confirmed inspection ID of this vehicle certificate.
	*
	* @return the confirmed inspection ID of this vehicle certificate
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _vehicleCertificate.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this vehicle certificate.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this vehicle certificate
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_vehicleCertificate.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the inspection record ID of this vehicle certificate.
	*
	* @return the inspection record ID of this vehicle certificate
	*/
	@Override
	public long getInspectionRecordId() {
		return _vehicleCertificate.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this vehicle certificate.
	*
	* @param inspectionRecordId the inspection record ID of this vehicle certificate
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_vehicleCertificate.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the inspection record no of this vehicle certificate.
	*
	* @return the inspection record no of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectionRecordNo() {
		return _vehicleCertificate.getInspectionRecordNo();
	}

	/**
	* Sets the inspection record no of this vehicle certificate.
	*
	* @param inspectionRecordNo the inspection record no of this vehicle certificate
	*/
	@Override
	public void setInspectionRecordNo(java.lang.String inspectionRecordNo) {
		_vehicleCertificate.setInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns the inspection date from of this vehicle certificate.
	*
	* @return the inspection date from of this vehicle certificate
	*/
	@Override
	public java.util.Date getInspectionDateFrom() {
		return _vehicleCertificate.getInspectionDateFrom();
	}

	/**
	* Sets the inspection date from of this vehicle certificate.
	*
	* @param inspectionDateFrom the inspection date from of this vehicle certificate
	*/
	@Override
	public void setInspectionDateFrom(java.util.Date inspectionDateFrom) {
		_vehicleCertificate.setInspectionDateFrom(inspectionDateFrom);
	}

	/**
	* Returns the inspection date to of this vehicle certificate.
	*
	* @return the inspection date to of this vehicle certificate
	*/
	@Override
	public java.util.Date getInspectionDateTo() {
		return _vehicleCertificate.getInspectionDateTo();
	}

	/**
	* Sets the inspection date to of this vehicle certificate.
	*
	* @param inspectionDateTo the inspection date to of this vehicle certificate
	*/
	@Override
	public void setInspectionDateTo(java.util.Date inspectionDateTo) {
		_vehicleCertificate.setInspectionDateTo(inspectionDateTo);
	}

	/**
	* Returns the inspection mode of this vehicle certificate.
	*
	* @return the inspection mode of this vehicle certificate
	*/
	@Override
	public long getInspectionMode() {
		return _vehicleCertificate.getInspectionMode();
	}

	/**
	* Sets the inspection mode of this vehicle certificate.
	*
	* @param inspectionMode the inspection mode of this vehicle certificate
	*/
	@Override
	public void setInspectionMode(long inspectionMode) {
		_vehicleCertificate.setInspectionMode(inspectionMode);
	}

	/**
	* Returns the inspection mode description of this vehicle certificate.
	*
	* @return the inspection mode description of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectionModeDescription() {
		return _vehicleCertificate.getInspectionModeDescription();
	}

	/**
	* Sets the inspection mode description of this vehicle certificate.
	*
	* @param inspectionModeDescription the inspection mode description of this vehicle certificate
	*/
	@Override
	public void setInspectionModeDescription(
		java.lang.String inspectionModeDescription) {
		_vehicleCertificate.setInspectionModeDescription(inspectionModeDescription);
	}

	/**
	* Returns the confirmed result of this vehicle certificate.
	*
	* @return the confirmed result of this vehicle certificate
	*/
	@Override
	public long getConfirmedResult() {
		return _vehicleCertificate.getConfirmedResult();
	}

	/**
	* Sets the confirmed result of this vehicle certificate.
	*
	* @param confirmedResult the confirmed result of this vehicle certificate
	*/
	@Override
	public void setConfirmedResult(long confirmedResult) {
		_vehicleCertificate.setConfirmedResult(confirmedResult);
	}

	/**
	* Returns the confirmed result description of this vehicle certificate.
	*
	* @return the confirmed result description of this vehicle certificate
	*/
	@Override
	public java.lang.String getConfirmedResultDescription() {
		return _vehicleCertificate.getConfirmedResultDescription();
	}

	/**
	* Sets the confirmed result description of this vehicle certificate.
	*
	* @param confirmedResultDescription the confirmed result description of this vehicle certificate
	*/
	@Override
	public void setConfirmedResultDescription(
		java.lang.String confirmedResultDescription) {
		_vehicleCertificate.setConfirmedResultDescription(confirmedResultDescription);
	}

	/**
	* Returns the import custom declare date of this vehicle certificate.
	*
	* @return the import custom declare date of this vehicle certificate
	*/
	@Override
	public java.util.Date getImportCustomDeclareDate() {
		return _vehicleCertificate.getImportCustomDeclareDate();
	}

	/**
	* Sets the import custom declare date of this vehicle certificate.
	*
	* @param importCustomDeclareDate the import custom declare date of this vehicle certificate
	*/
	@Override
	public void setImportCustomDeclareDate(
		java.util.Date importCustomDeclareDate) {
		_vehicleCertificate.setImportCustomDeclareDate(importCustomDeclareDate);
	}

	/**
	* Returns the import custom declare no of this vehicle certificate.
	*
	* @return the import custom declare no of this vehicle certificate
	*/
	@Override
	public java.lang.String getImportCustomDeclareNo() {
		return _vehicleCertificate.getImportCustomDeclareNo();
	}

	/**
	* Sets the import custom declare no of this vehicle certificate.
	*
	* @param importCustomDeclareNo the import custom declare no of this vehicle certificate
	*/
	@Override
	public void setImportCustomDeclareNo(java.lang.String importCustomDeclareNo) {
		_vehicleCertificate.setImportCustomDeclareNo(importCustomDeclareNo);
	}

	/**
	* Returns the corporation code of this vehicle certificate.
	*
	* @return the corporation code of this vehicle certificate
	*/
	@Override
	public java.lang.String getCorporationCode() {
		return _vehicleCertificate.getCorporationCode();
	}

	/**
	* Sets the corporation code of this vehicle certificate.
	*
	* @param corporationCode the corporation code of this vehicle certificate
	*/
	@Override
	public void setCorporationCode(java.lang.String corporationCode) {
		_vehicleCertificate.setCorporationCode(corporationCode);
	}

	/**
	* Returns the corporation name of this vehicle certificate.
	*
	* @return the corporation name of this vehicle certificate
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _vehicleCertificate.getCorporationName();
	}

	/**
	* Sets the corporation name of this vehicle certificate.
	*
	* @param corporationName the corporation name of this vehicle certificate
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_vehicleCertificate.setCorporationName(corporationName);
	}

	/**
	* Returns the inspector contact code of this vehicle certificate.
	*
	* @return the inspector contact code of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectorContactCode() {
		return _vehicleCertificate.getInspectorContactCode();
	}

	/**
	* Sets the inspector contact code of this vehicle certificate.
	*
	* @param inspectorContactCode the inspector contact code of this vehicle certificate
	*/
	@Override
	public void setInspectorContactCode(java.lang.String inspectorContactCode) {
		_vehicleCertificate.setInspectorContactCode(inspectorContactCode);
	}

	/**
	* Returns the inspector name of this vehicle certificate.
	*
	* @return the inspector name of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectorName() {
		return _vehicleCertificate.getInspectorName();
	}

	/**
	* Sets the inspector name of this vehicle certificate.
	*
	* @param inspectorName the inspector name of this vehicle certificate
	*/
	@Override
	public void setInspectorName(java.lang.String inspectorName) {
		_vehicleCertificate.setInspectorName(inspectorName);
	}

	/**
	* Returns the certificate type of this vehicle certificate.
	*
	* @return the certificate type of this vehicle certificate
	*/
	@Override
	public long getCertificateType() {
		return _vehicleCertificate.getCertificateType();
	}

	/**
	* Sets the certificate type of this vehicle certificate.
	*
	* @param certificateType the certificate type of this vehicle certificate
	*/
	@Override
	public void setCertificateType(long certificateType) {
		_vehicleCertificate.setCertificateType(certificateType);
	}

	/**
	* Returns the certificate number of this vehicle certificate.
	*
	* @return the certificate number of this vehicle certificate
	*/
	@Override
	public java.lang.String getCertificateNumber() {
		return _vehicleCertificate.getCertificateNumber();
	}

	/**
	* Sets the certificate number of this vehicle certificate.
	*
	* @param certificateNumber the certificate number of this vehicle certificate
	*/
	@Override
	public void setCertificateNumber(java.lang.String certificateNumber) {
		_vehicleCertificate.setCertificateNumber(certificateNumber);
	}

	/**
	* Returns the oldcertificate number of this vehicle certificate.
	*
	* @return the oldcertificate number of this vehicle certificate
	*/
	@Override
	public java.lang.String getOldcertificateNumber() {
		return _vehicleCertificate.getOldcertificateNumber();
	}

	/**
	* Sets the oldcertificate number of this vehicle certificate.
	*
	* @param oldcertificateNumber the oldcertificate number of this vehicle certificate
	*/
	@Override
	public void setOldcertificateNumber(java.lang.String oldcertificateNumber) {
		_vehicleCertificate.setOldcertificateNumber(oldcertificateNumber);
	}

	/**
	* Returns the sign date of this vehicle certificate.
	*
	* @return the sign date of this vehicle certificate
	*/
	@Override
	public java.util.Date getSignDate() {
		return _vehicleCertificate.getSignDate();
	}

	/**
	* Sets the sign date of this vehicle certificate.
	*
	* @param signDate the sign date of this vehicle certificate
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_vehicleCertificate.setSignDate(signDate);
	}

	/**
	* Returns the stamp status of this vehicle certificate.
	*
	* @return the stamp status of this vehicle certificate
	*/
	@Override
	public long getStampStatus() {
		return _vehicleCertificate.getStampStatus();
	}

	/**
	* Sets the stamp status of this vehicle certificate.
	*
	* @param stampStatus the stamp status of this vehicle certificate
	*/
	@Override
	public void setStampStatus(long stampStatus) {
		_vehicleCertificate.setStampStatus(stampStatus);
	}

	/**
	* Returns the certificate status of this vehicle certificate.
	*
	* @return the certificate status of this vehicle certificate
	*/
	@Override
	public java.lang.String getCertificateStatus() {
		return _vehicleCertificate.getCertificateStatus();
	}

	/**
	* Sets the certificate status of this vehicle certificate.
	*
	* @param certificateStatus the certificate status of this vehicle certificate
	*/
	@Override
	public void setCertificateStatus(java.lang.String certificateStatus) {
		_vehicleCertificate.setCertificateStatus(certificateStatus);
	}

	/**
	* Returns the digital issued of this vehicle certificate.
	*
	* @return the digital issued of this vehicle certificate
	*/
	@Override
	public long getDigitalIssued() {
		return _vehicleCertificate.getDigitalIssued();
	}

	/**
	* Sets the digital issued of this vehicle certificate.
	*
	* @param digitalIssued the digital issued of this vehicle certificate
	*/
	@Override
	public void setDigitalIssued(long digitalIssued) {
		_vehicleCertificate.setDigitalIssued(digitalIssued);
	}

	/**
	* Returns the markup safe test of this vehicle certificate.
	*
	* @return the markup safe test of this vehicle certificate
	*/
	@Override
	public long getMarkupSafeTest() {
		return _vehicleCertificate.getMarkupSafeTest();
	}

	/**
	* Sets the markup safe test of this vehicle certificate.
	*
	* @param markupSafeTest the markup safe test of this vehicle certificate
	*/
	@Override
	public void setMarkupSafeTest(long markupSafeTest) {
		_vehicleCertificate.setMarkupSafeTest(markupSafeTest);
	}

	/**
	* Returns the markup emission test of this vehicle certificate.
	*
	* @return the markup emission test of this vehicle certificate
	*/
	@Override
	public long getMarkupEmissionTest() {
		return _vehicleCertificate.getMarkupEmissionTest();
	}

	/**
	* Sets the markup emission test of this vehicle certificate.
	*
	* @param markupEmissionTest the markup emission test of this vehicle certificate
	*/
	@Override
	public void setMarkupEmissionTest(long markupEmissionTest) {
		_vehicleCertificate.setMarkupEmissionTest(markupEmissionTest);
	}

	/**
	* Returns the markup control of this vehicle certificate.
	*
	* @return the markup control of this vehicle certificate
	*/
	@Override
	public long getMarkupControl() {
		return _vehicleCertificate.getMarkupControl();
	}

	/**
	* Sets the markup control of this vehicle certificate.
	*
	* @param markupControl the markup control of this vehicle certificate
	*/
	@Override
	public void setMarkupControl(long markupControl) {
		_vehicleCertificate.setMarkupControl(markupControl);
	}

	/**
	* Returns the attached file of this vehicle certificate.
	*
	* @return the attached file of this vehicle certificate
	*/
	@Override
	public long getAttachedFile() {
		return _vehicleCertificate.getAttachedFile();
	}

	/**
	* Sets the attached file of this vehicle certificate.
	*
	* @param attachedFile the attached file of this vehicle certificate
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_vehicleCertificate.setAttachedFile(attachedFile);
	}

	/**
	* Returns the inspector organization of this vehicle certificate.
	*
	* @return the inspector organization of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectorOrganization() {
		return _vehicleCertificate.getInspectorOrganization();
	}

	/**
	* Sets the inspector organization of this vehicle certificate.
	*
	* @param inspectorOrganization the inspector organization of this vehicle certificate
	*/
	@Override
	public void setInspectorOrganization(java.lang.String inspectorOrganization) {
		_vehicleCertificate.setInspectorOrganization(inspectorOrganization);
	}

	/**
	* Returns the inspector division of this vehicle certificate.
	*
	* @return the inspector division of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectorDivision() {
		return _vehicleCertificate.getInspectorDivision();
	}

	/**
	* Sets the inspector division of this vehicle certificate.
	*
	* @param inspectorDivision the inspector division of this vehicle certificate
	*/
	@Override
	public void setInspectorDivision(java.lang.String inspectorDivision) {
		_vehicleCertificate.setInspectorDivision(inspectorDivision);
	}

	/**
	* Returns the inspector sign name of this vehicle certificate.
	*
	* @return the inspector sign name of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectorSignName() {
		return _vehicleCertificate.getInspectorSignName();
	}

	/**
	* Sets the inspector sign name of this vehicle certificate.
	*
	* @param inspectorSignName the inspector sign name of this vehicle certificate
	*/
	@Override
	public void setInspectorSignName(java.lang.String inspectorSignName) {
		_vehicleCertificate.setInspectorSignName(inspectorSignName);
	}

	/**
	* Returns the inspector sign title of this vehicle certificate.
	*
	* @return the inspector sign title of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectorSignTitle() {
		return _vehicleCertificate.getInspectorSignTitle();
	}

	/**
	* Sets the inspector sign title of this vehicle certificate.
	*
	* @param inspectorSignTitle the inspector sign title of this vehicle certificate
	*/
	@Override
	public void setInspectorSignTitle(java.lang.String inspectorSignTitle) {
		_vehicleCertificate.setInspectorSignTitle(inspectorSignTitle);
	}

	/**
	* Returns the inspector sign place of this vehicle certificate.
	*
	* @return the inspector sign place of this vehicle certificate
	*/
	@Override
	public java.lang.String getInspectorSignPlace() {
		return _vehicleCertificate.getInspectorSignPlace();
	}

	/**
	* Sets the inspector sign place of this vehicle certificate.
	*
	* @param inspectorSignPlace the inspector sign place of this vehicle certificate
	*/
	@Override
	public void setInspectorSignPlace(java.lang.String inspectorSignPlace) {
		_vehicleCertificate.setInspectorSignPlace(inspectorSignPlace);
	}

	/**
	* Returns the inspector sign date of this vehicle certificate.
	*
	* @return the inspector sign date of this vehicle certificate
	*/
	@Override
	public java.util.Date getInspectorSignDate() {
		return _vehicleCertificate.getInspectorSignDate();
	}

	/**
	* Sets the inspector sign date of this vehicle certificate.
	*
	* @param inspectorSignDate the inspector sign date of this vehicle certificate
	*/
	@Override
	public void setInspectorSignDate(java.util.Date inspectorSignDate) {
		_vehicleCertificate.setInspectorSignDate(inspectorSignDate);
	}

	/**
	* Returns the dossier date of this vehicle certificate.
	*
	* @return the dossier date of this vehicle certificate
	*/
	@Override
	public java.util.Date getDossierDate() {
		return _vehicleCertificate.getDossierDate();
	}

	/**
	* Sets the dossier date of this vehicle certificate.
	*
	* @param dossierDate the dossier date of this vehicle certificate
	*/
	@Override
	public void setDossierDate(java.util.Date dossierDate) {
		_vehicleCertificate.setDossierDate(dossierDate);
	}

	/**
	* Returns the filedangkykiemtra ID of this vehicle certificate.
	*
	* @return the filedangkykiemtra ID of this vehicle certificate
	*/
	@Override
	public long getFiledangkykiemtraId() {
		return _vehicleCertificate.getFiledangkykiemtraId();
	}

	/**
	* Sets the filedangkykiemtra ID of this vehicle certificate.
	*
	* @param filedangkykiemtraId the filedangkykiemtra ID of this vehicle certificate
	*/
	@Override
	public void setFiledangkykiemtraId(long filedangkykiemtraId) {
		_vehicleCertificate.setFiledangkykiemtraId(filedangkykiemtraId);
	}

	/**
	* Returns the filebienbankiemtra ID of this vehicle certificate.
	*
	* @return the filebienbankiemtra ID of this vehicle certificate
	*/
	@Override
	public long getFilebienbankiemtraId() {
		return _vehicleCertificate.getFilebienbankiemtraId();
	}

	/**
	* Sets the filebienbankiemtra ID of this vehicle certificate.
	*
	* @param filebienbankiemtraId the filebienbankiemtra ID of this vehicle certificate
	*/
	@Override
	public void setFilebienbankiemtraId(long filebienbankiemtraId) {
		_vehicleCertificate.setFilebienbankiemtraId(filebienbankiemtraId);
	}

	/**
	* Returns the filechungchi ID of this vehicle certificate.
	*
	* @return the filechungchi ID of this vehicle certificate
	*/
	@Override
	public long getFilechungchiId() {
		return _vehicleCertificate.getFilechungchiId();
	}

	/**
	* Sets the filechungchi ID of this vehicle certificate.
	*
	* @param filechungchiId the filechungchi ID of this vehicle certificate
	*/
	@Override
	public void setFilechungchiId(long filechungchiId) {
		_vehicleCertificate.setFilechungchiId(filechungchiId);
	}

	/**
	* Returns the filebaocaotnantoan ID of this vehicle certificate.
	*
	* @return the filebaocaotnantoan ID of this vehicle certificate
	*/
	@Override
	public long getFilebaocaotnantoanId() {
		return _vehicleCertificate.getFilebaocaotnantoanId();
	}

	/**
	* Sets the filebaocaotnantoan ID of this vehicle certificate.
	*
	* @param filebaocaotnantoanId the filebaocaotnantoan ID of this vehicle certificate
	*/
	@Override
	public void setFilebaocaotnantoanId(long filebaocaotnantoanId) {
		_vehicleCertificate.setFilebaocaotnantoanId(filebaocaotnantoanId);
	}

	/**
	* Returns the filebaocaotnkhithai ID of this vehicle certificate.
	*
	* @return the filebaocaotnkhithai ID of this vehicle certificate
	*/
	@Override
	public long getFilebaocaotnkhithaiId() {
		return _vehicleCertificate.getFilebaocaotnkhithaiId();
	}

	/**
	* Sets the filebaocaotnkhithai ID of this vehicle certificate.
	*
	* @param filebaocaotnkhithaiId the filebaocaotnkhithai ID of this vehicle certificate
	*/
	@Override
	public void setFilebaocaotnkhithaiId(long filebaocaotnkhithaiId) {
		_vehicleCertificate.setFilebaocaotnkhithaiId(filebaocaotnkhithaiId);
	}

	/**
	* Returns the fileketluangiamdinh ID of this vehicle certificate.
	*
	* @return the fileketluangiamdinh ID of this vehicle certificate
	*/
	@Override
	public long getFileketluangiamdinhId() {
		return _vehicleCertificate.getFileketluangiamdinhId();
	}

	/**
	* Sets the fileketluangiamdinh ID of this vehicle certificate.
	*
	* @param fileketluangiamdinhId the fileketluangiamdinh ID of this vehicle certificate
	*/
	@Override
	public void setFileketluangiamdinhId(long fileketluangiamdinhId) {
		_vehicleCertificate.setFileketluangiamdinhId(fileketluangiamdinhId);
	}

	/**
	* Returns the synch date of this vehicle certificate.
	*
	* @return the synch date of this vehicle certificate
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _vehicleCertificate.getSynchDate();
	}

	/**
	* Sets the synch date of this vehicle certificate.
	*
	* @param SynchDate the synch date of this vehicle certificate
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_vehicleCertificate.setSynchDate(SynchDate);
	}

	@Override
	public boolean isNew() {
		return _vehicleCertificate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicleCertificate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicleCertificate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicleCertificate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicleCertificate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicleCertificate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicleCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicleCertificate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicleCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicleCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicleCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleCertificateWrapper((VehicleCertificate)_vehicleCertificate.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate) {
		return _vehicleCertificate.compareTo(vehicleCertificate);
	}

	@Override
	public int hashCode() {
		return _vehicleCertificate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> toCacheModel() {
		return _vehicleCertificate.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate toEscapedModel() {
		return new VehicleCertificateWrapper(_vehicleCertificate.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate toUnescapedModel() {
		return new VehicleCertificateWrapper(_vehicleCertificate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicleCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicleCertificate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicleCertificate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleCertificateWrapper)) {
			return false;
		}

		VehicleCertificateWrapper vehicleCertificateWrapper = (VehicleCertificateWrapper)obj;

		if (Validator.equals(_vehicleCertificate,
					vehicleCertificateWrapper._vehicleCertificate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehicleCertificate getWrappedVehicleCertificate() {
		return _vehicleCertificate;
	}

	@Override
	public VehicleCertificate getWrappedModel() {
		return _vehicleCertificate;
	}

	@Override
	public void resetOriginalValues() {
		_vehicleCertificate.resetOriginalValues();
	}

	private VehicleCertificate _vehicleCertificate;
}