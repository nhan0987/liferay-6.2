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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleCertificateServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleCertificateServiceSoap
 * @generated
 */
public class VehicleCertificateSoap implements Serializable {
	public static VehicleCertificateSoap toSoapModel(VehicleCertificate model) {
		VehicleCertificateSoap soapModel = new VehicleCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setMtGateway(model.getMtGateway());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setVehicleRecordid(model.getVehicleRecordid());
		soapModel.setDraftCertificateid(model.getDraftCertificateid());
		soapModel.setCertificateRecordid(model.getCertificateRecordid());
		soapModel.setDebitNoteId(model.getDebitNoteId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setTechnicalSpecCode(model.getTechnicalSpecCode());
		soapModel.setReferenceCertificateNo(model.getReferenceCertificateNo());
		soapModel.setSafetytestreportNo(model.getSafetytestreportNo());
		soapModel.setEmissiontestreportNo(model.getEmissiontestreportNo());
		soapModel.setCopreportNo(model.getCopreportNo());
		soapModel.setControlreportNo(model.getControlreportNo());
		soapModel.setVehicletypeDescription(model.getVehicletypeDescription());
		soapModel.setVehicleType(model.getVehicleType());
		soapModel.setEnginetypeDescription(model.getEnginetypeDescription());
		soapModel.setEngineType(model.getEngineType());
		soapModel.setMarkAsVehicle(model.getMarkAsVehicle());
		soapModel.setTrademarkDescription(model.getTrademarkDescription());
		soapModel.setTradeMark(model.getTradeMark());
		soapModel.setCommercialName(model.getCommercialName());
		soapModel.setModelCode(model.getModelCode());
		soapModel.setProductionPlant(model.getProductionPlant());
		soapModel.setAddressOfProductionPlant(model.getAddressOfProductionPlant());
		soapModel.setEmissionStandard(model.getEmissionStandard());
		soapModel.setCodeNumber(model.getCodeNumber());
		soapModel.setChassisNumber(model.getChassisNumber());
		soapModel.setEngineNumber(model.getEngineNumber());
		soapModel.setProductionYear(model.getProductionYear());
		soapModel.setCountryCode(model.getCountryCode());
		soapModel.setCountryName(model.getCountryName());
		soapModel.setCurrentStatus(model.getCurrentStatus());
		soapModel.setVehicleEngineUsage(model.getVehicleEngineUsage());
		soapModel.setVehicleColor(model.getVehicleColor());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setMarkUpStatus(model.getMarkUpStatus());
		soapModel.setMarkAsSample(model.getMarkAsSample());
		soapModel.setVehicleengineStatus(model.getVehicleengineStatus());
		soapModel.setVehicleengineFolder(model.getVehicleengineFolder());
		soapModel.setVehicleGroupInitialId(model.getVehicleGroupInitialId());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setRegisteredNumber(model.getRegisteredNumber());
		soapModel.setImporterCode(model.getImporterCode());
		soapModel.setImporterName(model.getImporterName());
		soapModel.setImporterAddress(model.getImporterAddress());
		soapModel.setRepresentative(model.getRepresentative());
		soapModel.setPhone(model.getPhone());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());
		soapModel.setInspectionDate(model.getInspectionDate());
		soapModel.setInspectionSite(model.getInspectionSite());
		soapModel.setInspectionDistrictCode(model.getInspectionDistrictCode());
		soapModel.setInspectionProvinceCode(model.getInspectionProvinceCode());
		soapModel.setInspectionDistrict(model.getInspectionDistrict());
		soapModel.setInspectionProvince(model.getInspectionProvince());
		soapModel.setConfirmedInspectionId(model.getConfirmedInspectionId());
		soapModel.setInspectionRecordId(model.getInspectionRecordId());
		soapModel.setInspectionRecordNo(model.getInspectionRecordNo());
		soapModel.setInspectionDateFrom(model.getInspectionDateFrom());
		soapModel.setInspectionDateTo(model.getInspectionDateTo());
		soapModel.setInspectionMode(model.getInspectionMode());
		soapModel.setInspectionModeDescription(model.getInspectionModeDescription());
		soapModel.setConfirmedResult(model.getConfirmedResult());
		soapModel.setConfirmedResultDescription(model.getConfirmedResultDescription());
		soapModel.setImportCustomDeclareDate(model.getImportCustomDeclareDate());
		soapModel.setImportCustomDeclareNo(model.getImportCustomDeclareNo());
		soapModel.setCorporationCode(model.getCorporationCode());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setInspectorContactCode(model.getInspectorContactCode());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setCertificateType(model.getCertificateType());
		soapModel.setCertificateNumber(model.getCertificateNumber());
		soapModel.setOldcertificateNumber(model.getOldcertificateNumber());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setStampStatus(model.getStampStatus());
		soapModel.setCertificateStatus(model.getCertificateStatus());
		soapModel.setDigitalIssued(model.getDigitalIssued());
		soapModel.setMarkupSafeTest(model.getMarkupSafeTest());
		soapModel.setMarkupEmissionTest(model.getMarkupEmissionTest());
		soapModel.setMarkupControl(model.getMarkupControl());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setInspectorOrganization(model.getInspectorOrganization());
		soapModel.setInspectorDivision(model.getInspectorDivision());
		soapModel.setInspectorSignName(model.getInspectorSignName());
		soapModel.setInspectorSignTitle(model.getInspectorSignTitle());
		soapModel.setInspectorSignPlace(model.getInspectorSignPlace());
		soapModel.setInspectorSignDate(model.getInspectorSignDate());
		soapModel.setDossierDate(model.getDossierDate());
		soapModel.setFiledangkykiemtraId(model.getFiledangkykiemtraId());
		soapModel.setFilebienbankiemtraId(model.getFilebienbankiemtraId());
		soapModel.setFilechungchiId(model.getFilechungchiId());
		soapModel.setFilebaocaotnantoanId(model.getFilebaocaotnantoanId());
		soapModel.setFilebaocaotnkhithaiId(model.getFilebaocaotnkhithaiId());
		soapModel.setFileketluangiamdinhId(model.getFileketluangiamdinhId());
		soapModel.setSynchDate(model.getSynchDate());

		return soapModel;
	}

	public static VehicleCertificateSoap[] toSoapModels(
		VehicleCertificate[] models) {
		VehicleCertificateSoap[] soapModels = new VehicleCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VehicleCertificateSoap[][] toSoapModels(
		VehicleCertificate[][] models) {
		VehicleCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VehicleCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VehicleCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VehicleCertificateSoap[] toSoapModels(
		List<VehicleCertificate> models) {
		List<VehicleCertificateSoap> soapModels = new ArrayList<VehicleCertificateSoap>(models.size());

		for (VehicleCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VehicleCertificateSoap[soapModels.size()]);
	}

	public VehicleCertificateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtGateway() {
		return _mtGateway;
	}

	public void setMtGateway(long mtGateway) {
		_mtGateway = mtGateway;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public long getVehicleRecordid() {
		return _vehicleRecordid;
	}

	public void setVehicleRecordid(long vehicleRecordid) {
		_vehicleRecordid = vehicleRecordid;
	}

	public long getDraftCertificateid() {
		return _draftCertificateid;
	}

	public void setDraftCertificateid(long draftCertificateid) {
		_draftCertificateid = draftCertificateid;
	}

	public long getCertificateRecordid() {
		return _certificateRecordid;
	}

	public void setCertificateRecordid(long certificateRecordid) {
		_certificateRecordid = certificateRecordid;
	}

	public long getDebitNoteId() {
		return _debitNoteId;
	}

	public void setDebitNoteId(long debitNoteId) {
		_debitNoteId = debitNoteId;
	}

	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;
	}

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getTechnicalSpecCode() {
		return _technicalSpecCode;
	}

	public void setTechnicalSpecCode(String technicalSpecCode) {
		_technicalSpecCode = technicalSpecCode;
	}

	public String getReferenceCertificateNo() {
		return _referenceCertificateNo;
	}

	public void setReferenceCertificateNo(String referenceCertificateNo) {
		_referenceCertificateNo = referenceCertificateNo;
	}

	public String getSafetytestreportNo() {
		return _safetytestreportNo;
	}

	public void setSafetytestreportNo(String safetytestreportNo) {
		_safetytestreportNo = safetytestreportNo;
	}

	public String getEmissiontestreportNo() {
		return _emissiontestreportNo;
	}

	public void setEmissiontestreportNo(String emissiontestreportNo) {
		_emissiontestreportNo = emissiontestreportNo;
	}

	public String getCopreportNo() {
		return _copreportNo;
	}

	public void setCopreportNo(String copreportNo) {
		_copreportNo = copreportNo;
	}

	public String getControlreportNo() {
		return _controlreportNo;
	}

	public void setControlreportNo(String controlreportNo) {
		_controlreportNo = controlreportNo;
	}

	public String getVehicletypeDescription() {
		return _vehicletypeDescription;
	}

	public void setVehicletypeDescription(String vehicletypeDescription) {
		_vehicletypeDescription = vehicletypeDescription;
	}

	public String getVehicleType() {
		return _vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;
	}

	public String getEnginetypeDescription() {
		return _enginetypeDescription;
	}

	public void setEnginetypeDescription(String enginetypeDescription) {
		_enginetypeDescription = enginetypeDescription;
	}

	public String getEngineType() {
		return _engineType;
	}

	public void setEngineType(String engineType) {
		_engineType = engineType;
	}

	public int getMarkAsVehicle() {
		return _markAsVehicle;
	}

	public void setMarkAsVehicle(int markAsVehicle) {
		_markAsVehicle = markAsVehicle;
	}

	public String getTrademarkDescription() {
		return _trademarkDescription;
	}

	public void setTrademarkDescription(String trademarkDescription) {
		_trademarkDescription = trademarkDescription;
	}

	public String getTradeMark() {
		return _tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		_tradeMark = tradeMark;
	}

	public String getCommercialName() {
		return _commercialName;
	}

	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	public String getModelCode() {
		return _modelCode;
	}

	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
	}

	public String getProductionPlant() {
		return _productionPlant;
	}

	public void setProductionPlant(String productionPlant) {
		_productionPlant = productionPlant;
	}

	public String getAddressOfProductionPlant() {
		return _addressOfProductionPlant;
	}

	public void setAddressOfProductionPlant(String addressOfProductionPlant) {
		_addressOfProductionPlant = addressOfProductionPlant;
	}

	public String getEmissionStandard() {
		return _emissionStandard;
	}

	public void setEmissionStandard(String emissionStandard) {
		_emissionStandard = emissionStandard;
	}

	public long getCodeNumber() {
		return _codeNumber;
	}

	public void setCodeNumber(long codeNumber) {
		_codeNumber = codeNumber;
	}

	public String getChassisNumber() {
		return _chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return _engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;
	}

	public String getProductionYear() {
		return _productionYear;
	}

	public void setProductionYear(String productionYear) {
		_productionYear = productionYear;
	}

	public String getCountryCode() {
		return _countryCode;
	}

	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;
	}

	public String getCountryName() {
		return _countryName;
	}

	public void setCountryName(String countryName) {
		_countryName = countryName;
	}

	public String getCurrentStatus() {
		return _currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		_currentStatus = currentStatus;
	}

	public String getVehicleEngineUsage() {
		return _vehicleEngineUsage;
	}

	public void setVehicleEngineUsage(String vehicleEngineUsage) {
		_vehicleEngineUsage = vehicleEngineUsage;
	}

	public String getVehicleColor() {
		return _vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		_vehicleColor = vehicleColor;
	}

	public double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public long getMarkUpStatus() {
		return _markUpStatus;
	}

	public void setMarkUpStatus(long markUpStatus) {
		_markUpStatus = markUpStatus;
	}

	public int getMarkAsSample() {
		return _markAsSample;
	}

	public void setMarkAsSample(int markAsSample) {
		_markAsSample = markAsSample;
	}

	public long getVehicleengineStatus() {
		return _vehicleengineStatus;
	}

	public void setVehicleengineStatus(long vehicleengineStatus) {
		_vehicleengineStatus = vehicleengineStatus;
	}

	public long getVehicleengineFolder() {
		return _vehicleengineFolder;
	}

	public void setVehicleengineFolder(long vehicleengineFolder) {
		_vehicleengineFolder = vehicleengineFolder;
	}

	public long getVehicleGroupInitialId() {
		return _vehicleGroupInitialId;
	}

	public void setVehicleGroupInitialId(long vehicleGroupInitialId) {
		_vehicleGroupInitialId = vehicleGroupInitialId;
	}

	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;
	}

	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;
	}

	public String getImporterCode() {
		return _importerCode;
	}

	public void setImporterCode(String importerCode) {
		_importerCode = importerCode;
	}

	public String getImporterName() {
		return _importerName;
	}

	public void setImporterName(String importerName) {
		_importerName = importerName;
	}

	public String getImporterAddress() {
		return _importerAddress;
	}

	public void setImporterAddress(String importerAddress) {
		_importerAddress = importerAddress;
	}

	public String getRepresentative() {
		return _representative;
	}

	public void setRepresentative(String representative) {
		_representative = representative;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getInspectionDate() {
		return _inspectionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;
	}

	public String getInspectionSite() {
		return _inspectionSite;
	}

	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;
	}

	public String getInspectionDistrictCode() {
		return _inspectionDistrictCode;
	}

	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		_inspectionDistrictCode = inspectionDistrictCode;
	}

	public String getInspectionProvinceCode() {
		return _inspectionProvinceCode;
	}

	public void setInspectionProvinceCode(String inspectionProvinceCode) {
		_inspectionProvinceCode = inspectionProvinceCode;
	}

	public String getInspectionDistrict() {
		return _inspectionDistrict;
	}

	public void setInspectionDistrict(String inspectionDistrict) {
		_inspectionDistrict = inspectionDistrict;
	}

	public String getInspectionProvince() {
		return _inspectionProvince;
	}

	public void setInspectionProvince(String inspectionProvince) {
		_inspectionProvince = inspectionProvince;
	}

	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;
	}

	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	public String getInspectionRecordNo() {
		return _inspectionRecordNo;
	}

	public void setInspectionRecordNo(String inspectionRecordNo) {
		_inspectionRecordNo = inspectionRecordNo;
	}

	public Date getInspectionDateFrom() {
		return _inspectionDateFrom;
	}

	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_inspectionDateFrom = inspectionDateFrom;
	}

	public Date getInspectionDateTo() {
		return _inspectionDateTo;
	}

	public void setInspectionDateTo(Date inspectionDateTo) {
		_inspectionDateTo = inspectionDateTo;
	}

	public long getInspectionMode() {
		return _inspectionMode;
	}

	public void setInspectionMode(long inspectionMode) {
		_inspectionMode = inspectionMode;
	}

	public String getInspectionModeDescription() {
		return _inspectionModeDescription;
	}

	public void setInspectionModeDescription(String inspectionModeDescription) {
		_inspectionModeDescription = inspectionModeDescription;
	}

	public long getConfirmedResult() {
		return _confirmedResult;
	}

	public void setConfirmedResult(long confirmedResult) {
		_confirmedResult = confirmedResult;
	}

	public String getConfirmedResultDescription() {
		return _confirmedResultDescription;
	}

	public void setConfirmedResultDescription(String confirmedResultDescription) {
		_confirmedResultDescription = confirmedResultDescription;
	}

	public Date getImportCustomDeclareDate() {
		return _importCustomDeclareDate;
	}

	public void setImportCustomDeclareDate(Date importCustomDeclareDate) {
		_importCustomDeclareDate = importCustomDeclareDate;
	}

	public String getImportCustomDeclareNo() {
		return _importCustomDeclareNo;
	}

	public void setImportCustomDeclareNo(String importCustomDeclareNo) {
		_importCustomDeclareNo = importCustomDeclareNo;
	}

	public String getCorporationCode() {
		return _corporationCode;
	}

	public void setCorporationCode(String corporationCode) {
		_corporationCode = corporationCode;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public String getInspectorContactCode() {
		return _inspectorContactCode;
	}

	public void setInspectorContactCode(String inspectorContactCode) {
		_inspectorContactCode = inspectorContactCode;
	}

	public String getInspectorName() {
		return _inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	public long getCertificateType() {
		return _certificateType;
	}

	public void setCertificateType(long certificateType) {
		_certificateType = certificateType;
	}

	public String getCertificateNumber() {
		return _certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		_certificateNumber = certificateNumber;
	}

	public String getOldcertificateNumber() {
		return _oldcertificateNumber;
	}

	public void setOldcertificateNumber(String oldcertificateNumber) {
		_oldcertificateNumber = oldcertificateNumber;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public long getStampStatus() {
		return _stampStatus;
	}

	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;
	}

	public String getCertificateStatus() {
		return _certificateStatus;
	}

	public void setCertificateStatus(String certificateStatus) {
		_certificateStatus = certificateStatus;
	}

	public long getDigitalIssued() {
		return _digitalIssued;
	}

	public void setDigitalIssued(long digitalIssued) {
		_digitalIssued = digitalIssued;
	}

	public long getMarkupSafeTest() {
		return _markupSafeTest;
	}

	public void setMarkupSafeTest(long markupSafeTest) {
		_markupSafeTest = markupSafeTest;
	}

	public long getMarkupEmissionTest() {
		return _markupEmissionTest;
	}

	public void setMarkupEmissionTest(long markupEmissionTest) {
		_markupEmissionTest = markupEmissionTest;
	}

	public long getMarkupControl() {
		return _markupControl;
	}

	public void setMarkupControl(long markupControl) {
		_markupControl = markupControl;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public String getInspectorOrganization() {
		return _inspectorOrganization;
	}

	public void setInspectorOrganization(String inspectorOrganization) {
		_inspectorOrganization = inspectorOrganization;
	}

	public String getInspectorDivision() {
		return _inspectorDivision;
	}

	public void setInspectorDivision(String inspectorDivision) {
		_inspectorDivision = inspectorDivision;
	}

	public String getInspectorSignName() {
		return _inspectorSignName;
	}

	public void setInspectorSignName(String inspectorSignName) {
		_inspectorSignName = inspectorSignName;
	}

	public String getInspectorSignTitle() {
		return _inspectorSignTitle;
	}

	public void setInspectorSignTitle(String inspectorSignTitle) {
		_inspectorSignTitle = inspectorSignTitle;
	}

	public String getInspectorSignPlace() {
		return _inspectorSignPlace;
	}

	public void setInspectorSignPlace(String inspectorSignPlace) {
		_inspectorSignPlace = inspectorSignPlace;
	}

	public Date getInspectorSignDate() {
		return _inspectorSignDate;
	}

	public void setInspectorSignDate(Date inspectorSignDate) {
		_inspectorSignDate = inspectorSignDate;
	}

	public Date getDossierDate() {
		return _dossierDate;
	}

	public void setDossierDate(Date dossierDate) {
		_dossierDate = dossierDate;
	}

	public long getFiledangkykiemtraId() {
		return _filedangkykiemtraId;
	}

	public void setFiledangkykiemtraId(long filedangkykiemtraId) {
		_filedangkykiemtraId = filedangkykiemtraId;
	}

	public long getFilebienbankiemtraId() {
		return _filebienbankiemtraId;
	}

	public void setFilebienbankiemtraId(long filebienbankiemtraId) {
		_filebienbankiemtraId = filebienbankiemtraId;
	}

	public long getFilechungchiId() {
		return _filechungchiId;
	}

	public void setFilechungchiId(long filechungchiId) {
		_filechungchiId = filechungchiId;
	}

	public long getFilebaocaotnantoanId() {
		return _filebaocaotnantoanId;
	}

	public void setFilebaocaotnantoanId(long filebaocaotnantoanId) {
		_filebaocaotnantoanId = filebaocaotnantoanId;
	}

	public long getFilebaocaotnkhithaiId() {
		return _filebaocaotnkhithaiId;
	}

	public void setFilebaocaotnkhithaiId(long filebaocaotnkhithaiId) {
		_filebaocaotnkhithaiId = filebaocaotnkhithaiId;
	}

	public long getFileketluangiamdinhId() {
		return _fileketluangiamdinhId;
	}

	public void setFileketluangiamdinhId(long fileketluangiamdinhId) {
		_fileketluangiamdinhId = fileketluangiamdinhId;
	}

	public Date getSynchDate() {
		return _SynchDate;
	}

	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;
	}

	private long _id;
	private long _mtGateway;
	private long _hoSoThuTucId;
	private long _sequenceNo;
	private long _vehicleRecordid;
	private long _draftCertificateid;
	private long _certificateRecordid;
	private long _debitNoteId;
	private long _vehicleGroupId;
	private String _vehicleClass;
	private String _technicalSpecCode;
	private String _referenceCertificateNo;
	private String _safetytestreportNo;
	private String _emissiontestreportNo;
	private String _copreportNo;
	private String _controlreportNo;
	private String _vehicletypeDescription;
	private String _vehicleType;
	private String _enginetypeDescription;
	private String _engineType;
	private int _markAsVehicle;
	private String _trademarkDescription;
	private String _tradeMark;
	private String _commercialName;
	private String _modelCode;
	private String _productionPlant;
	private String _addressOfProductionPlant;
	private String _emissionStandard;
	private long _codeNumber;
	private String _chassisNumber;
	private String _engineNumber;
	private String _productionYear;
	private String _countryCode;
	private String _countryName;
	private String _currentStatus;
	private String _vehicleEngineUsage;
	private String _vehicleColor;
	private double _unitPrice;
	private String _currency;
	private String _remarks;
	private long _markUpStatus;
	private int _markAsSample;
	private long _vehicleengineStatus;
	private long _vehicleengineFolder;
	private long _vehicleGroupInitialId;
	private long _registeredInspectionId;
	private String _registeredNumber;
	private String _importerCode;
	private String _importerName;
	private String _importerAddress;
	private String _representative;
	private String _phone;
	private String _fax;
	private String _email;
	private Date _inspectionDate;
	private String _inspectionSite;
	private String _inspectionDistrictCode;
	private String _inspectionProvinceCode;
	private String _inspectionDistrict;
	private String _inspectionProvince;
	private long _confirmedInspectionId;
	private long _inspectionRecordId;
	private String _inspectionRecordNo;
	private Date _inspectionDateFrom;
	private Date _inspectionDateTo;
	private long _inspectionMode;
	private String _inspectionModeDescription;
	private long _confirmedResult;
	private String _confirmedResultDescription;
	private Date _importCustomDeclareDate;
	private String _importCustomDeclareNo;
	private String _corporationCode;
	private String _corporationName;
	private String _inspectorContactCode;
	private String _inspectorName;
	private long _certificateType;
	private String _certificateNumber;
	private String _oldcertificateNumber;
	private Date _signDate;
	private long _stampStatus;
	private String _certificateStatus;
	private long _digitalIssued;
	private long _markupSafeTest;
	private long _markupEmissionTest;
	private long _markupControl;
	private long _attachedFile;
	private String _inspectorOrganization;
	private String _inspectorDivision;
	private String _inspectorSignName;
	private String _inspectorSignTitle;
	private String _inspectorSignPlace;
	private Date _inspectorSignDate;
	private Date _dossierDate;
	private long _filedangkykiemtraId;
	private long _filebienbankiemtraId;
	private long _filechungchiId;
	private long _filebaocaotnantoanId;
	private long _filebaocaotnkhithaiId;
	private long _fileketluangiamdinhId;
	private Date _SynchDate;
}