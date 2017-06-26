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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class VehicleCertificateClp extends BaseModelImpl<VehicleCertificate>
	implements VehicleCertificate {
	public VehicleCertificateClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_vehicleCertificateRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMtGateway() {
		return _mtGateway;
	}

	@Override
	public void setMtGateway(long mtGateway) {
		_mtGateway = mtGateway;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMtGateway", long.class);

				method.invoke(_vehicleCertificateRemoteModel, mtGateway);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_vehicleCertificateRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", long.class);

				method.invoke(_vehicleCertificateRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleRecordid() {
		return _vehicleRecordid;
	}

	@Override
	public void setVehicleRecordid(long vehicleRecordid) {
		_vehicleRecordid = vehicleRecordid;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleRecordid", long.class);

				method.invoke(_vehicleCertificateRemoteModel, vehicleRecordid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDraftCertificateid() {
		return _draftCertificateid;
	}

	@Override
	public void setDraftCertificateid(long draftCertificateid) {
		_draftCertificateid = draftCertificateid;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setDraftCertificateid",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel, draftCertificateid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateRecordid() {
		return _certificateRecordid;
	}

	@Override
	public void setCertificateRecordid(long certificateRecordid) {
		_certificateRecordid = certificateRecordid;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordid",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					certificateRecordid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDebitNoteId() {
		return _debitNoteId;
	}

	@Override
	public void setDebitNoteId(long debitNoteId) {
		_debitNoteId = debitNoteId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setDebitNoteId", long.class);

				method.invoke(_vehicleCertificateRemoteModel, debitNoteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_vehicleCertificateRemoteModel, vehicleGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleClass() {
		return _vehicleClass;
	}

	@Override
	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleClass", String.class);

				method.invoke(_vehicleCertificateRemoteModel, vehicleClass);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTechnicalSpecCode() {
		return _technicalSpecCode;
	}

	@Override
	public void setTechnicalSpecCode(String technicalSpecCode) {
		_technicalSpecCode = technicalSpecCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setTechnicalSpecCode",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, technicalSpecCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReferenceCertificateNo() {
		return _referenceCertificateNo;
	}

	@Override
	public void setReferenceCertificateNo(String referenceCertificateNo) {
		_referenceCertificateNo = referenceCertificateNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setReferenceCertificateNo",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					referenceCertificateNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSafetytestreportNo() {
		return _safetytestreportNo;
	}

	@Override
	public void setSafetytestreportNo(String safetytestreportNo) {
		_safetytestreportNo = safetytestreportNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setSafetytestreportNo",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, safetytestreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmissiontestreportNo() {
		return _emissiontestreportNo;
	}

	@Override
	public void setEmissiontestreportNo(String emissiontestreportNo) {
		_emissiontestreportNo = emissiontestreportNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissiontestreportNo",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					emissiontestreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCopreportNo() {
		return _copreportNo;
	}

	@Override
	public void setCopreportNo(String copreportNo) {
		_copreportNo = copreportNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCopreportNo", String.class);

				method.invoke(_vehicleCertificateRemoteModel, copreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getControlreportNo() {
		return _controlreportNo;
	}

	@Override
	public void setControlreportNo(String controlreportNo) {
		_controlreportNo = controlreportNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setControlreportNo",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, controlreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicletypeDescription() {
		return _vehicletypeDescription;
	}

	@Override
	public void setVehicletypeDescription(String vehicletypeDescription) {
		_vehicletypeDescription = vehicletypeDescription;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicletypeDescription",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					vehicletypeDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleType() {
		return _vehicleType;
	}

	@Override
	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleType", String.class);

				method.invoke(_vehicleCertificateRemoteModel, vehicleType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEnginetypeDescription() {
		return _enginetypeDescription;
	}

	@Override
	public void setEnginetypeDescription(String enginetypeDescription) {
		_enginetypeDescription = enginetypeDescription;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEnginetypeDescription",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					enginetypeDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEngineType() {
		return _engineType;
	}

	@Override
	public void setEngineType(String engineType) {
		_engineType = engineType;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEngineType", String.class);

				method.invoke(_vehicleCertificateRemoteModel, engineType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkAsVehicle() {
		return _markAsVehicle;
	}

	@Override
	public void setMarkAsVehicle(int markAsVehicle) {
		_markAsVehicle = markAsVehicle;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkAsVehicle", int.class);

				method.invoke(_vehicleCertificateRemoteModel, markAsVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrademarkDescription() {
		return _trademarkDescription;
	}

	@Override
	public void setTrademarkDescription(String trademarkDescription) {
		_trademarkDescription = trademarkDescription;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setTrademarkDescription",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					trademarkDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTradeMark() {
		return _tradeMark;
	}

	@Override
	public void setTradeMark(String tradeMark) {
		_tradeMark = tradeMark;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setTradeMark", String.class);

				method.invoke(_vehicleCertificateRemoteModel, tradeMark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommercialName() {
		return _commercialName;
	}

	@Override
	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCommercialName",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, commercialName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModelCode() {
		return _modelCode;
	}

	@Override
	public void setModelCode(String modelCode) {
		_modelCode = modelCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setModelCode", String.class);

				method.invoke(_vehicleCertificateRemoteModel, modelCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductionPlant() {
		return _productionPlant;
	}

	@Override
	public void setProductionPlant(String productionPlant) {
		_productionPlant = productionPlant;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setProductionPlant",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, productionPlant);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressOfProductionPlant() {
		return _addressOfProductionPlant;
	}

	@Override
	public void setAddressOfProductionPlant(String addressOfProductionPlant) {
		_addressOfProductionPlant = addressOfProductionPlant;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressOfProductionPlant",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					addressOfProductionPlant);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmissionStandard() {
		return _emissionStandard;
	}

	@Override
	public void setEmissionStandard(String emissionStandard) {
		_emissionStandard = emissionStandard;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissionStandard",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, emissionStandard);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCodeNumber() {
		return _codeNumber;
	}

	@Override
	public void setCodeNumber(long codeNumber) {
		_codeNumber = codeNumber;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCodeNumber", long.class);

				method.invoke(_vehicleCertificateRemoteModel, codeNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChassisNumber() {
		return _chassisNumber;
	}

	@Override
	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setChassisNumber", String.class);

				method.invoke(_vehicleCertificateRemoteModel, chassisNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEngineNumber() {
		return _engineNumber;
	}

	@Override
	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEngineNumber", String.class);

				method.invoke(_vehicleCertificateRemoteModel, engineNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductionYear() {
		return _productionYear;
	}

	@Override
	public void setProductionYear(String productionYear) {
		_productionYear = productionYear;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setProductionYear",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, productionYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCountryCode() {
		return _countryCode;
	}

	@Override
	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryCode", String.class);

				method.invoke(_vehicleCertificateRemoteModel, countryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCountryName() {
		return _countryName;
	}

	@Override
	public void setCountryName(String countryName) {
		_countryName = countryName;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryName", String.class);

				method.invoke(_vehicleCertificateRemoteModel, countryName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrentStatus() {
		return _currentStatus;
	}

	@Override
	public void setCurrentStatus(String currentStatus) {
		_currentStatus = currentStatus;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentStatus", String.class);

				method.invoke(_vehicleCertificateRemoteModel, currentStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleEngineUsage() {
		return _vehicleEngineUsage;
	}

	@Override
	public void setVehicleEngineUsage(String vehicleEngineUsage) {
		_vehicleEngineUsage = vehicleEngineUsage;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleEngineUsage",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, vehicleEngineUsage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleColor() {
		return _vehicleColor;
	}

	@Override
	public void setVehicleColor(String vehicleColor) {
		_vehicleColor = vehicleColor;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleColor", String.class);

				method.invoke(_vehicleCertificateRemoteModel, vehicleColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUnitPrice() {
		return _unitPrice;
	}

	@Override
	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", double.class);

				method.invoke(_vehicleCertificateRemoteModel, unitPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrency() {
		return _currency;
	}

	@Override
	public void setCurrency(String currency) {
		_currency = currency;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", String.class);

				method.invoke(_vehicleCertificateRemoteModel, currency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_vehicleCertificateRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkUpStatus() {
		return _markUpStatus;
	}

	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_markUpStatus = markUpStatus;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkUpStatus", long.class);

				method.invoke(_vehicleCertificateRemoteModel, markUpStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkAsSample() {
		return _markAsSample;
	}

	@Override
	public void setMarkAsSample(int markAsSample) {
		_markAsSample = markAsSample;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkAsSample", int.class);

				method.invoke(_vehicleCertificateRemoteModel, markAsSample);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleengineStatus() {
		return _vehicleengineStatus;
	}

	@Override
	public void setVehicleengineStatus(long vehicleengineStatus) {
		_vehicleengineStatus = vehicleengineStatus;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleengineStatus",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					vehicleengineStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleengineFolder() {
		return _vehicleengineFolder;
	}

	@Override
	public void setVehicleengineFolder(long vehicleengineFolder) {
		_vehicleengineFolder = vehicleengineFolder;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleengineFolder",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					vehicleengineFolder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleGroupInitialId() {
		return _vehicleGroupInitialId;
	}

	@Override
	public void setVehicleGroupInitialId(long vehicleGroupInitialId) {
		_vehicleGroupInitialId = vehicleGroupInitialId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupInitialId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					vehicleGroupInitialId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					registeredInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	@Override
	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredNumber",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, registeredNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterCode() {
		return _importerCode;
	}

	@Override
	public void setImporterCode(String importerCode) {
		_importerCode = importerCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterCode", String.class);

				method.invoke(_vehicleCertificateRemoteModel, importerCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterName() {
		return _importerName;
	}

	@Override
	public void setImporterName(String importerName) {
		_importerName = importerName;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterName", String.class);

				method.invoke(_vehicleCertificateRemoteModel, importerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterAddress() {
		return _importerAddress;
	}

	@Override
	public void setImporterAddress(String importerAddress) {
		_importerAddress = importerAddress;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterAddress",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, importerAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepresentative() {
		return _representative;
	}

	@Override
	public void setRepresentative(String representative) {
		_representative = representative;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentative",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, representative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", String.class);

				method.invoke(_vehicleCertificateRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFax() {
		return _fax;
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", String.class);

				method.invoke(_vehicleCertificateRemoteModel, fax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_vehicleCertificateRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDate() {
		return _inspectionDate;
	}

	@Override
	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDate", Date.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionSite() {
		return _inspectionSite;
	}

	@Override
	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionSite",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionSite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionDistrictCode() {
		return _inspectionDistrictCode;
	}

	@Override
	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		_inspectionDistrictCode = inspectionDistrictCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDistrictCode",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					inspectionDistrictCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionProvinceCode() {
		return _inspectionProvinceCode;
	}

	@Override
	public void setInspectionProvinceCode(String inspectionProvinceCode) {
		_inspectionProvinceCode = inspectionProvinceCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionProvinceCode",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					inspectionProvinceCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionDistrict() {
		return _inspectionDistrict;
	}

	@Override
	public void setInspectionDistrict(String inspectionDistrict) {
		_inspectionDistrict = inspectionDistrict;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDistrict",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionDistrict);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionProvince() {
		return _inspectionProvince;
	}

	@Override
	public void setInspectionProvince(String inspectionProvince) {
		_inspectionProvince = inspectionProvince;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionProvince",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionProvince);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedInspectionId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					confirmedInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionRecordNo() {
		return _inspectionRecordNo;
	}

	@Override
	public void setInspectionRecordNo(String inspectionRecordNo) {
		_inspectionRecordNo = inspectionRecordNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordNo",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionRecordNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDateFrom() {
		return _inspectionDateFrom;
	}

	@Override
	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_inspectionDateFrom = inspectionDateFrom;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDateFrom",
						Date.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionDateFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDateTo() {
		return _inspectionDateTo;
	}

	@Override
	public void setInspectionDateTo(Date inspectionDateTo) {
		_inspectionDateTo = inspectionDateTo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDateTo",
						Date.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionDateTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionMode() {
		return _inspectionMode;
	}

	@Override
	public void setInspectionMode(long inspectionMode) {
		_inspectionMode = inspectionMode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionMode", long.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectionMode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionModeDescription() {
		return _inspectionModeDescription;
	}

	@Override
	public void setInspectionModeDescription(String inspectionModeDescription) {
		_inspectionModeDescription = inspectionModeDescription;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionModeDescription",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					inspectionModeDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedResult() {
		return _confirmedResult;
	}

	@Override
	public void setConfirmedResult(long confirmedResult) {
		_confirmedResult = confirmedResult;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedResult", long.class);

				method.invoke(_vehicleCertificateRemoteModel, confirmedResult);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getConfirmedResultDescription() {
		return _confirmedResultDescription;
	}

	@Override
	public void setConfirmedResultDescription(String confirmedResultDescription) {
		_confirmedResultDescription = confirmedResultDescription;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedResultDescription",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					confirmedResultDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getImportCustomDeclareDate() {
		return _importCustomDeclareDate;
	}

	@Override
	public void setImportCustomDeclareDate(Date importCustomDeclareDate) {
		_importCustomDeclareDate = importCustomDeclareDate;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setImportCustomDeclareDate",
						Date.class);

				method.invoke(_vehicleCertificateRemoteModel,
					importCustomDeclareDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportCustomDeclareNo() {
		return _importCustomDeclareNo;
	}

	@Override
	public void setImportCustomDeclareNo(String importCustomDeclareNo) {
		_importCustomDeclareNo = importCustomDeclareNo;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setImportCustomDeclareNo",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					importCustomDeclareNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCorporationCode() {
		return _corporationCode;
	}

	@Override
	public void setCorporationCode(String corporationCode) {
		_corporationCode = corporationCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationCode",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, corporationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCorporationName() {
		return _corporationName;
	}

	@Override
	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationName",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, corporationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorContactCode() {
		return _inspectorContactCode;
	}

	@Override
	public void setInspectorContactCode(String inspectorContactCode) {
		_inspectorContactCode = inspectorContactCode;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorContactCode",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					inspectorContactCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorName() {
		return _inspectorName;
	}

	@Override
	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorName", String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateType() {
		return _certificateType;
	}

	@Override
	public void setCertificateType(long certificateType) {
		_certificateType = certificateType;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateType", long.class);

				method.invoke(_vehicleCertificateRemoteModel, certificateType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateNumber() {
		return _certificateNumber;
	}

	@Override
	public void setCertificateNumber(String certificateNumber) {
		_certificateNumber = certificateNumber;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNumber",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, certificateNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOldcertificateNumber() {
		return _oldcertificateNumber;
	}

	@Override
	public void setOldcertificateNumber(String oldcertificateNumber) {
		_oldcertificateNumber = oldcertificateNumber;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setOldcertificateNumber",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					oldcertificateNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_vehicleCertificateRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStampStatus() {
		return _stampStatus;
	}

	@Override
	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setStampStatus", long.class);

				method.invoke(_vehicleCertificateRemoteModel, stampStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateStatus() {
		return _certificateStatus;
	}

	@Override
	public void setCertificateStatus(String certificateStatus) {
		_certificateStatus = certificateStatus;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateStatus",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, certificateStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDigitalIssued() {
		return _digitalIssued;
	}

	@Override
	public void setDigitalIssued(long digitalIssued) {
		_digitalIssued = digitalIssued;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setDigitalIssued", long.class);

				method.invoke(_vehicleCertificateRemoteModel, digitalIssued);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkupSafeTest() {
		return _markupSafeTest;
	}

	@Override
	public void setMarkupSafeTest(long markupSafeTest) {
		_markupSafeTest = markupSafeTest;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupSafeTest", long.class);

				method.invoke(_vehicleCertificateRemoteModel, markupSafeTest);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkupEmissionTest() {
		return _markupEmissionTest;
	}

	@Override
	public void setMarkupEmissionTest(long markupEmissionTest) {
		_markupEmissionTest = markupEmissionTest;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupEmissionTest",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel, markupEmissionTest);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkupControl() {
		return _markupControl;
	}

	@Override
	public void setMarkupControl(long markupControl) {
		_markupControl = markupControl;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupControl", long.class);

				method.invoke(_vehicleCertificateRemoteModel, markupControl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_vehicleCertificateRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorOrganization() {
		return _inspectorOrganization;
	}

	@Override
	public void setInspectorOrganization(String inspectorOrganization) {
		_inspectorOrganization = inspectorOrganization;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorOrganization",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel,
					inspectorOrganization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorDivision() {
		return _inspectorDivision;
	}

	@Override
	public void setInspectorDivision(String inspectorDivision) {
		_inspectorDivision = inspectorDivision;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorDivision",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectorDivision);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorSignName() {
		return _inspectorSignName;
	}

	@Override
	public void setInspectorSignName(String inspectorSignName) {
		_inspectorSignName = inspectorSignName;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSignName",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectorSignName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorSignTitle() {
		return _inspectorSignTitle;
	}

	@Override
	public void setInspectorSignTitle(String inspectorSignTitle) {
		_inspectorSignTitle = inspectorSignTitle;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSignTitle",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectorSignTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorSignPlace() {
		return _inspectorSignPlace;
	}

	@Override
	public void setInspectorSignPlace(String inspectorSignPlace) {
		_inspectorSignPlace = inspectorSignPlace;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSignPlace",
						String.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectorSignPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectorSignDate() {
		return _inspectorSignDate;
	}

	@Override
	public void setInspectorSignDate(Date inspectorSignDate) {
		_inspectorSignDate = inspectorSignDate;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSignDate",
						Date.class);

				method.invoke(_vehicleCertificateRemoteModel, inspectorSignDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDossierDate() {
		return _dossierDate;
	}

	@Override
	public void setDossierDate(Date dossierDate) {
		_dossierDate = dossierDate;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierDate", Date.class);

				method.invoke(_vehicleCertificateRemoteModel, dossierDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFiledangkykiemtraId() {
		return _filedangkykiemtraId;
	}

	@Override
	public void setFiledangkykiemtraId(long filedangkykiemtraId) {
		_filedangkykiemtraId = filedangkykiemtraId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFiledangkykiemtraId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					filedangkykiemtraId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFilebienbankiemtraId() {
		return _filebienbankiemtraId;
	}

	@Override
	public void setFilebienbankiemtraId(long filebienbankiemtraId) {
		_filebienbankiemtraId = filebienbankiemtraId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFilebienbankiemtraId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					filebienbankiemtraId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFilechungchiId() {
		return _filechungchiId;
	}

	@Override
	public void setFilechungchiId(long filechungchiId) {
		_filechungchiId = filechungchiId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFilechungchiId", long.class);

				method.invoke(_vehicleCertificateRemoteModel, filechungchiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFilebaocaotnantoanId() {
		return _filebaocaotnantoanId;
	}

	@Override
	public void setFilebaocaotnantoanId(long filebaocaotnantoanId) {
		_filebaocaotnantoanId = filebaocaotnantoanId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFilebaocaotnantoanId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					filebaocaotnantoanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFilebaocaotnkhithaiId() {
		return _filebaocaotnkhithaiId;
	}

	@Override
	public void setFilebaocaotnkhithaiId(long filebaocaotnkhithaiId) {
		_filebaocaotnkhithaiId = filebaocaotnkhithaiId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFilebaocaotnkhithaiId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					filebaocaotnkhithaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileketluangiamdinhId() {
		return _fileketluangiamdinhId;
	}

	@Override
	public void setFileketluangiamdinhId(long fileketluangiamdinhId) {
		_fileketluangiamdinhId = fileketluangiamdinhId;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setFileketluangiamdinhId",
						long.class);

				method.invoke(_vehicleCertificateRemoteModel,
					fileketluangiamdinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_vehicleCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_vehicleCertificateRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVehicleCertificateRemoteModel() {
		return _vehicleCertificateRemoteModel;
	}

	public void setVehicleCertificateRemoteModel(
		BaseModel<?> vehicleCertificateRemoteModel) {
		_vehicleCertificateRemoteModel = vehicleCertificateRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _vehicleCertificateRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_vehicleCertificateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VehicleCertificateLocalServiceUtil.addVehicleCertificate(this);
		}
		else {
			VehicleCertificateLocalServiceUtil.updateVehicleCertificate(this);
		}
	}

	@Override
	public VehicleCertificate toEscapedModel() {
		return (VehicleCertificate)ProxyUtil.newProxyInstance(VehicleCertificate.class.getClassLoader(),
			new Class[] { VehicleCertificate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VehicleCertificateClp clone = new VehicleCertificateClp();

		clone.setId(getId());
		clone.setMtGateway(getMtGateway());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setSequenceNo(getSequenceNo());
		clone.setVehicleRecordid(getVehicleRecordid());
		clone.setDraftCertificateid(getDraftCertificateid());
		clone.setCertificateRecordid(getCertificateRecordid());
		clone.setDebitNoteId(getDebitNoteId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setVehicleClass(getVehicleClass());
		clone.setTechnicalSpecCode(getTechnicalSpecCode());
		clone.setReferenceCertificateNo(getReferenceCertificateNo());
		clone.setSafetytestreportNo(getSafetytestreportNo());
		clone.setEmissiontestreportNo(getEmissiontestreportNo());
		clone.setCopreportNo(getCopreportNo());
		clone.setControlreportNo(getControlreportNo());
		clone.setVehicletypeDescription(getVehicletypeDescription());
		clone.setVehicleType(getVehicleType());
		clone.setEnginetypeDescription(getEnginetypeDescription());
		clone.setEngineType(getEngineType());
		clone.setMarkAsVehicle(getMarkAsVehicle());
		clone.setTrademarkDescription(getTrademarkDescription());
		clone.setTradeMark(getTradeMark());
		clone.setCommercialName(getCommercialName());
		clone.setModelCode(getModelCode());
		clone.setProductionPlant(getProductionPlant());
		clone.setAddressOfProductionPlant(getAddressOfProductionPlant());
		clone.setEmissionStandard(getEmissionStandard());
		clone.setCodeNumber(getCodeNumber());
		clone.setChassisNumber(getChassisNumber());
		clone.setEngineNumber(getEngineNumber());
		clone.setProductionYear(getProductionYear());
		clone.setCountryCode(getCountryCode());
		clone.setCountryName(getCountryName());
		clone.setCurrentStatus(getCurrentStatus());
		clone.setVehicleEngineUsage(getVehicleEngineUsage());
		clone.setVehicleColor(getVehicleColor());
		clone.setUnitPrice(getUnitPrice());
		clone.setCurrency(getCurrency());
		clone.setRemarks(getRemarks());
		clone.setMarkUpStatus(getMarkUpStatus());
		clone.setMarkAsSample(getMarkAsSample());
		clone.setVehicleengineStatus(getVehicleengineStatus());
		clone.setVehicleengineFolder(getVehicleengineFolder());
		clone.setVehicleGroupInitialId(getVehicleGroupInitialId());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setRegisteredNumber(getRegisteredNumber());
		clone.setImporterCode(getImporterCode());
		clone.setImporterName(getImporterName());
		clone.setImporterAddress(getImporterAddress());
		clone.setRepresentative(getRepresentative());
		clone.setPhone(getPhone());
		clone.setFax(getFax());
		clone.setEmail(getEmail());
		clone.setInspectionDate(getInspectionDate());
		clone.setInspectionSite(getInspectionSite());
		clone.setInspectionDistrictCode(getInspectionDistrictCode());
		clone.setInspectionProvinceCode(getInspectionProvinceCode());
		clone.setInspectionDistrict(getInspectionDistrict());
		clone.setInspectionProvince(getInspectionProvince());
		clone.setConfirmedInspectionId(getConfirmedInspectionId());
		clone.setInspectionRecordId(getInspectionRecordId());
		clone.setInspectionRecordNo(getInspectionRecordNo());
		clone.setInspectionDateFrom(getInspectionDateFrom());
		clone.setInspectionDateTo(getInspectionDateTo());
		clone.setInspectionMode(getInspectionMode());
		clone.setInspectionModeDescription(getInspectionModeDescription());
		clone.setConfirmedResult(getConfirmedResult());
		clone.setConfirmedResultDescription(getConfirmedResultDescription());
		clone.setImportCustomDeclareDate(getImportCustomDeclareDate());
		clone.setImportCustomDeclareNo(getImportCustomDeclareNo());
		clone.setCorporationCode(getCorporationCode());
		clone.setCorporationName(getCorporationName());
		clone.setInspectorContactCode(getInspectorContactCode());
		clone.setInspectorName(getInspectorName());
		clone.setCertificateType(getCertificateType());
		clone.setCertificateNumber(getCertificateNumber());
		clone.setOldcertificateNumber(getOldcertificateNumber());
		clone.setSignDate(getSignDate());
		clone.setStampStatus(getStampStatus());
		clone.setCertificateStatus(getCertificateStatus());
		clone.setDigitalIssued(getDigitalIssued());
		clone.setMarkupSafeTest(getMarkupSafeTest());
		clone.setMarkupEmissionTest(getMarkupEmissionTest());
		clone.setMarkupControl(getMarkupControl());
		clone.setAttachedFile(getAttachedFile());
		clone.setInspectorOrganization(getInspectorOrganization());
		clone.setInspectorDivision(getInspectorDivision());
		clone.setInspectorSignName(getInspectorSignName());
		clone.setInspectorSignTitle(getInspectorSignTitle());
		clone.setInspectorSignPlace(getInspectorSignPlace());
		clone.setInspectorSignDate(getInspectorSignDate());
		clone.setDossierDate(getDossierDate());
		clone.setFiledangkykiemtraId(getFiledangkykiemtraId());
		clone.setFilebienbankiemtraId(getFilebienbankiemtraId());
		clone.setFilechungchiId(getFilechungchiId());
		clone.setFilebaocaotnantoanId(getFilebaocaotnantoanId());
		clone.setFilebaocaotnkhithaiId(getFilebaocaotnkhithaiId());
		clone.setFileketluangiamdinhId(getFileketluangiamdinhId());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(VehicleCertificate vehicleCertificate) {
		int value = 0;

		if (getId() < vehicleCertificate.getId()) {
			value = -1;
		}
		else if (getId() > vehicleCertificate.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleCertificateClp)) {
			return false;
		}

		VehicleCertificateClp vehicleCertificate = (VehicleCertificateClp)obj;

		long primaryKey = vehicleCertificate.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(201);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", mtGateway=");
		sb.append(getMtGateway());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", vehicleRecordid=");
		sb.append(getVehicleRecordid());
		sb.append(", draftCertificateid=");
		sb.append(getDraftCertificateid());
		sb.append(", certificateRecordid=");
		sb.append(getCertificateRecordid());
		sb.append(", debitNoteId=");
		sb.append(getDebitNoteId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", vehicleClass=");
		sb.append(getVehicleClass());
		sb.append(", technicalSpecCode=");
		sb.append(getTechnicalSpecCode());
		sb.append(", referenceCertificateNo=");
		sb.append(getReferenceCertificateNo());
		sb.append(", safetytestreportNo=");
		sb.append(getSafetytestreportNo());
		sb.append(", emissiontestreportNo=");
		sb.append(getEmissiontestreportNo());
		sb.append(", copreportNo=");
		sb.append(getCopreportNo());
		sb.append(", controlreportNo=");
		sb.append(getControlreportNo());
		sb.append(", vehicletypeDescription=");
		sb.append(getVehicletypeDescription());
		sb.append(", vehicleType=");
		sb.append(getVehicleType());
		sb.append(", enginetypeDescription=");
		sb.append(getEnginetypeDescription());
		sb.append(", engineType=");
		sb.append(getEngineType());
		sb.append(", markAsVehicle=");
		sb.append(getMarkAsVehicle());
		sb.append(", trademarkDescription=");
		sb.append(getTrademarkDescription());
		sb.append(", tradeMark=");
		sb.append(getTradeMark());
		sb.append(", commercialName=");
		sb.append(getCommercialName());
		sb.append(", modelCode=");
		sb.append(getModelCode());
		sb.append(", productionPlant=");
		sb.append(getProductionPlant());
		sb.append(", addressOfProductionPlant=");
		sb.append(getAddressOfProductionPlant());
		sb.append(", emissionStandard=");
		sb.append(getEmissionStandard());
		sb.append(", codeNumber=");
		sb.append(getCodeNumber());
		sb.append(", chassisNumber=");
		sb.append(getChassisNumber());
		sb.append(", engineNumber=");
		sb.append(getEngineNumber());
		sb.append(", productionYear=");
		sb.append(getProductionYear());
		sb.append(", countryCode=");
		sb.append(getCountryCode());
		sb.append(", countryName=");
		sb.append(getCountryName());
		sb.append(", currentStatus=");
		sb.append(getCurrentStatus());
		sb.append(", vehicleEngineUsage=");
		sb.append(getVehicleEngineUsage());
		sb.append(", vehicleColor=");
		sb.append(getVehicleColor());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", markUpStatus=");
		sb.append(getMarkUpStatus());
		sb.append(", markAsSample=");
		sb.append(getMarkAsSample());
		sb.append(", vehicleengineStatus=");
		sb.append(getVehicleengineStatus());
		sb.append(", vehicleengineFolder=");
		sb.append(getVehicleengineFolder());
		sb.append(", vehicleGroupInitialId=");
		sb.append(getVehicleGroupInitialId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", registeredNumber=");
		sb.append(getRegisteredNumber());
		sb.append(", importerCode=");
		sb.append(getImporterCode());
		sb.append(", importerName=");
		sb.append(getImporterName());
		sb.append(", importerAddress=");
		sb.append(getImporterAddress());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", inspectionDate=");
		sb.append(getInspectionDate());
		sb.append(", inspectionSite=");
		sb.append(getInspectionSite());
		sb.append(", inspectionDistrictCode=");
		sb.append(getInspectionDistrictCode());
		sb.append(", inspectionProvinceCode=");
		sb.append(getInspectionProvinceCode());
		sb.append(", inspectionDistrict=");
		sb.append(getInspectionDistrict());
		sb.append(", inspectionProvince=");
		sb.append(getInspectionProvince());
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", inspectionRecordNo=");
		sb.append(getInspectionRecordNo());
		sb.append(", inspectionDateFrom=");
		sb.append(getInspectionDateFrom());
		sb.append(", inspectionDateTo=");
		sb.append(getInspectionDateTo());
		sb.append(", inspectionMode=");
		sb.append(getInspectionMode());
		sb.append(", inspectionModeDescription=");
		sb.append(getInspectionModeDescription());
		sb.append(", confirmedResult=");
		sb.append(getConfirmedResult());
		sb.append(", confirmedResultDescription=");
		sb.append(getConfirmedResultDescription());
		sb.append(", importCustomDeclareDate=");
		sb.append(getImportCustomDeclareDate());
		sb.append(", importCustomDeclareNo=");
		sb.append(getImportCustomDeclareNo());
		sb.append(", corporationCode=");
		sb.append(getCorporationCode());
		sb.append(", corporationName=");
		sb.append(getCorporationName());
		sb.append(", inspectorContactCode=");
		sb.append(getInspectorContactCode());
		sb.append(", inspectorName=");
		sb.append(getInspectorName());
		sb.append(", certificateType=");
		sb.append(getCertificateType());
		sb.append(", certificateNumber=");
		sb.append(getCertificateNumber());
		sb.append(", oldcertificateNumber=");
		sb.append(getOldcertificateNumber());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", stampStatus=");
		sb.append(getStampStatus());
		sb.append(", certificateStatus=");
		sb.append(getCertificateStatus());
		sb.append(", digitalIssued=");
		sb.append(getDigitalIssued());
		sb.append(", markupSafeTest=");
		sb.append(getMarkupSafeTest());
		sb.append(", markupEmissionTest=");
		sb.append(getMarkupEmissionTest());
		sb.append(", markupControl=");
		sb.append(getMarkupControl());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", inspectorOrganization=");
		sb.append(getInspectorOrganization());
		sb.append(", inspectorDivision=");
		sb.append(getInspectorDivision());
		sb.append(", inspectorSignName=");
		sb.append(getInspectorSignName());
		sb.append(", inspectorSignTitle=");
		sb.append(getInspectorSignTitle());
		sb.append(", inspectorSignPlace=");
		sb.append(getInspectorSignPlace());
		sb.append(", inspectorSignDate=");
		sb.append(getInspectorSignDate());
		sb.append(", dossierDate=");
		sb.append(getDossierDate());
		sb.append(", filedangkykiemtraId=");
		sb.append(getFiledangkykiemtraId());
		sb.append(", filebienbankiemtraId=");
		sb.append(getFilebienbankiemtraId());
		sb.append(", filechungchiId=");
		sb.append(getFilechungchiId());
		sb.append(", filebaocaotnantoanId=");
		sb.append(getFilebaocaotnantoanId());
		sb.append(", filebaocaotnkhithaiId=");
		sb.append(getFilebaocaotnkhithaiId());
		sb.append(", fileketluangiamdinhId=");
		sb.append(getFileketluangiamdinhId());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(304);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mtGateway</column-name><column-value><![CDATA[");
		sb.append(getMtGateway());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleRecordid</column-name><column-value><![CDATA[");
		sb.append(getVehicleRecordid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>draftCertificateid</column-name><column-value><![CDATA[");
		sb.append(getDraftCertificateid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordid</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>debitNoteId</column-name><column-value><![CDATA[");
		sb.append(getDebitNoteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleClass</column-name><column-value><![CDATA[");
		sb.append(getVehicleClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>technicalSpecCode</column-name><column-value><![CDATA[");
		sb.append(getTechnicalSpecCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>referenceCertificateNo</column-name><column-value><![CDATA[");
		sb.append(getReferenceCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetytestreportNo</column-name><column-value><![CDATA[");
		sb.append(getSafetytestreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissiontestreportNo</column-name><column-value><![CDATA[");
		sb.append(getEmissiontestreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copreportNo</column-name><column-value><![CDATA[");
		sb.append(getCopreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlreportNo</column-name><column-value><![CDATA[");
		sb.append(getControlreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicletypeDescription</column-name><column-value><![CDATA[");
		sb.append(getVehicletypeDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleType</column-name><column-value><![CDATA[");
		sb.append(getVehicleType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enginetypeDescription</column-name><column-value><![CDATA[");
		sb.append(getEnginetypeDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineType</column-name><column-value><![CDATA[");
		sb.append(getEngineType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAsVehicle</column-name><column-value><![CDATA[");
		sb.append(getMarkAsVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trademarkDescription</column-name><column-value><![CDATA[");
		sb.append(getTrademarkDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tradeMark</column-name><column-value><![CDATA[");
		sb.append(getTradeMark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commercialName</column-name><column-value><![CDATA[");
		sb.append(getCommercialName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modelCode</column-name><column-value><![CDATA[");
		sb.append(getModelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlant</column-name><column-value><![CDATA[");
		sb.append(getProductionPlant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressOfProductionPlant</column-name><column-value><![CDATA[");
		sb.append(getAddressOfProductionPlant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionStandard</column-name><column-value><![CDATA[");
		sb.append(getEmissionStandard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codeNumber</column-name><column-value><![CDATA[");
		sb.append(getCodeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chassisNumber</column-name><column-value><![CDATA[");
		sb.append(getChassisNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineNumber</column-name><column-value><![CDATA[");
		sb.append(getEngineNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionYear</column-name><column-value><![CDATA[");
		sb.append(getProductionYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryCode</column-name><column-value><![CDATA[");
		sb.append(getCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryName</column-name><column-value><![CDATA[");
		sb.append(getCountryName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentStatus</column-name><column-value><![CDATA[");
		sb.append(getCurrentStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleEngineUsage</column-name><column-value><![CDATA[");
		sb.append(getVehicleEngineUsage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleColor</column-name><column-value><![CDATA[");
		sb.append(getVehicleColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpStatus</column-name><column-value><![CDATA[");
		sb.append(getMarkUpStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAsSample</column-name><column-value><![CDATA[");
		sb.append(getMarkAsSample());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleengineStatus</column-name><column-value><![CDATA[");
		sb.append(getVehicleengineStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleengineFolder</column-name><column-value><![CDATA[");
		sb.append(getVehicleengineFolder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupInitialId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupInitialId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredNumber</column-name><column-value><![CDATA[");
		sb.append(getRegisteredNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerCode</column-name><column-value><![CDATA[");
		sb.append(getImporterCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerName</column-name><column-value><![CDATA[");
		sb.append(getImporterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerAddress</column-name><column-value><![CDATA[");
		sb.append(getImporterAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDate</column-name><column-value><![CDATA[");
		sb.append(getInspectionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionSite</column-name><column-value><![CDATA[");
		sb.append(getInspectionSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDistrictCode</column-name><column-value><![CDATA[");
		sb.append(getInspectionDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionProvinceCode</column-name><column-value><![CDATA[");
		sb.append(getInspectionProvinceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDistrict</column-name><column-value><![CDATA[");
		sb.append(getInspectionDistrict());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionProvince</column-name><column-value><![CDATA[");
		sb.append(getInspectionProvince());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedInspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordNo</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDateFrom</column-name><column-value><![CDATA[");
		sb.append(getInspectionDateFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDateTo</column-name><column-value><![CDATA[");
		sb.append(getInspectionDateTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionMode</column-name><column-value><![CDATA[");
		sb.append(getInspectionMode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionModeDescription</column-name><column-value><![CDATA[");
		sb.append(getInspectionModeDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedResult</column-name><column-value><![CDATA[");
		sb.append(getConfirmedResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedResultDescription</column-name><column-value><![CDATA[");
		sb.append(getConfirmedResultDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importCustomDeclareDate</column-name><column-value><![CDATA[");
		sb.append(getImportCustomDeclareDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importCustomDeclareNo</column-name><column-value><![CDATA[");
		sb.append(getImportCustomDeclareNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationCode</column-name><column-value><![CDATA[");
		sb.append(getCorporationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationName</column-name><column-value><![CDATA[");
		sb.append(getCorporationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorContactCode</column-name><column-value><![CDATA[");
		sb.append(getInspectorContactCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorName</column-name><column-value><![CDATA[");
		sb.append(getInspectorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateType</column-name><column-value><![CDATA[");
		sb.append(getCertificateType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNumber</column-name><column-value><![CDATA[");
		sb.append(getCertificateNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldcertificateNumber</column-name><column-value><![CDATA[");
		sb.append(getOldcertificateNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stampStatus</column-name><column-value><![CDATA[");
		sb.append(getStampStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateStatus</column-name><column-value><![CDATA[");
		sb.append(getCertificateStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>digitalIssued</column-name><column-value><![CDATA[");
		sb.append(getDigitalIssued());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupSafeTest</column-name><column-value><![CDATA[");
		sb.append(getMarkupSafeTest());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupEmissionTest</column-name><column-value><![CDATA[");
		sb.append(getMarkupEmissionTest());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupControl</column-name><column-value><![CDATA[");
		sb.append(getMarkupControl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorOrganization</column-name><column-value><![CDATA[");
		sb.append(getInspectorOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorDivision</column-name><column-value><![CDATA[");
		sb.append(getInspectorDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSignName</column-name><column-value><![CDATA[");
		sb.append(getInspectorSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSignTitle</column-name><column-value><![CDATA[");
		sb.append(getInspectorSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSignPlace</column-name><column-value><![CDATA[");
		sb.append(getInspectorSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSignDate</column-name><column-value><![CDATA[");
		sb.append(getInspectorSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierDate</column-name><column-value><![CDATA[");
		sb.append(getDossierDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filedangkykiemtraId</column-name><column-value><![CDATA[");
		sb.append(getFiledangkykiemtraId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filebienbankiemtraId</column-name><column-value><![CDATA[");
		sb.append(getFilebienbankiemtraId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filechungchiId</column-name><column-value><![CDATA[");
		sb.append(getFilechungchiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filebaocaotnantoanId</column-name><column-value><![CDATA[");
		sb.append(getFilebaocaotnantoanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filebaocaotnkhithaiId</column-name><column-value><![CDATA[");
		sb.append(getFilebaocaotnkhithaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileketluangiamdinhId</column-name><column-value><![CDATA[");
		sb.append(getFileketluangiamdinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _vehicleCertificateRemoteModel;
}