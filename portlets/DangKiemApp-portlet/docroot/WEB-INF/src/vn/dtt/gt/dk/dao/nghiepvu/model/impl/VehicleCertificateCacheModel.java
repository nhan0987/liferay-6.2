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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VehicleCertificate in entity cache.
 *
 * @author win_64
 * @see VehicleCertificate
 * @generated
 */
public class VehicleCertificateCacheModel implements CacheModel<VehicleCertificate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(201);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtGateway=");
		sb.append(mtGateway);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", vehicleRecordid=");
		sb.append(vehicleRecordid);
		sb.append(", draftCertificateid=");
		sb.append(draftCertificateid);
		sb.append(", certificateRecordid=");
		sb.append(certificateRecordid);
		sb.append(", debitNoteId=");
		sb.append(debitNoteId);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", technicalSpecCode=");
		sb.append(technicalSpecCode);
		sb.append(", referenceCertificateNo=");
		sb.append(referenceCertificateNo);
		sb.append(", safetytestreportNo=");
		sb.append(safetytestreportNo);
		sb.append(", emissiontestreportNo=");
		sb.append(emissiontestreportNo);
		sb.append(", copreportNo=");
		sb.append(copreportNo);
		sb.append(", controlreportNo=");
		sb.append(controlreportNo);
		sb.append(", vehicletypeDescription=");
		sb.append(vehicletypeDescription);
		sb.append(", vehicleType=");
		sb.append(vehicleType);
		sb.append(", enginetypeDescription=");
		sb.append(enginetypeDescription);
		sb.append(", engineType=");
		sb.append(engineType);
		sb.append(", markAsVehicle=");
		sb.append(markAsVehicle);
		sb.append(", trademarkDescription=");
		sb.append(trademarkDescription);
		sb.append(", tradeMark=");
		sb.append(tradeMark);
		sb.append(", commercialName=");
		sb.append(commercialName);
		sb.append(", modelCode=");
		sb.append(modelCode);
		sb.append(", productionPlant=");
		sb.append(productionPlant);
		sb.append(", addressOfProductionPlant=");
		sb.append(addressOfProductionPlant);
		sb.append(", emissionStandard=");
		sb.append(emissionStandard);
		sb.append(", codeNumber=");
		sb.append(codeNumber);
		sb.append(", chassisNumber=");
		sb.append(chassisNumber);
		sb.append(", engineNumber=");
		sb.append(engineNumber);
		sb.append(", productionYear=");
		sb.append(productionYear);
		sb.append(", countryCode=");
		sb.append(countryCode);
		sb.append(", countryName=");
		sb.append(countryName);
		sb.append(", currentStatus=");
		sb.append(currentStatus);
		sb.append(", vehicleEngineUsage=");
		sb.append(vehicleEngineUsage);
		sb.append(", vehicleColor=");
		sb.append(vehicleColor);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", markUpStatus=");
		sb.append(markUpStatus);
		sb.append(", markAsSample=");
		sb.append(markAsSample);
		sb.append(", vehicleengineStatus=");
		sb.append(vehicleengineStatus);
		sb.append(", vehicleengineFolder=");
		sb.append(vehicleengineFolder);
		sb.append(", vehicleGroupInitialId=");
		sb.append(vehicleGroupInitialId);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", registeredNumber=");
		sb.append(registeredNumber);
		sb.append(", importerCode=");
		sb.append(importerCode);
		sb.append(", importerName=");
		sb.append(importerName);
		sb.append(", importerAddress=");
		sb.append(importerAddress);
		sb.append(", representative=");
		sb.append(representative);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append(", inspectionDate=");
		sb.append(inspectionDate);
		sb.append(", inspectionSite=");
		sb.append(inspectionSite);
		sb.append(", inspectionDistrictCode=");
		sb.append(inspectionDistrictCode);
		sb.append(", inspectionProvinceCode=");
		sb.append(inspectionProvinceCode);
		sb.append(", inspectionDistrict=");
		sb.append(inspectionDistrict);
		sb.append(", inspectionProvince=");
		sb.append(inspectionProvince);
		sb.append(", confirmedInspectionId=");
		sb.append(confirmedInspectionId);
		sb.append(", inspectionRecordId=");
		sb.append(inspectionRecordId);
		sb.append(", inspectionRecordNo=");
		sb.append(inspectionRecordNo);
		sb.append(", inspectionDateFrom=");
		sb.append(inspectionDateFrom);
		sb.append(", inspectionDateTo=");
		sb.append(inspectionDateTo);
		sb.append(", inspectionMode=");
		sb.append(inspectionMode);
		sb.append(", inspectionModeDescription=");
		sb.append(inspectionModeDescription);
		sb.append(", confirmedResult=");
		sb.append(confirmedResult);
		sb.append(", confirmedResultDescription=");
		sb.append(confirmedResultDescription);
		sb.append(", importCustomDeclareDate=");
		sb.append(importCustomDeclareDate);
		sb.append(", importCustomDeclareNo=");
		sb.append(importCustomDeclareNo);
		sb.append(", corporationCode=");
		sb.append(corporationCode);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", inspectorContactCode=");
		sb.append(inspectorContactCode);
		sb.append(", inspectorName=");
		sb.append(inspectorName);
		sb.append(", certificateType=");
		sb.append(certificateType);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", oldcertificateNumber=");
		sb.append(oldcertificateNumber);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", stampStatus=");
		sb.append(stampStatus);
		sb.append(", certificateStatus=");
		sb.append(certificateStatus);
		sb.append(", digitalIssued=");
		sb.append(digitalIssued);
		sb.append(", markupSafeTest=");
		sb.append(markupSafeTest);
		sb.append(", markupEmissionTest=");
		sb.append(markupEmissionTest);
		sb.append(", markupControl=");
		sb.append(markupControl);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", inspectorOrganization=");
		sb.append(inspectorOrganization);
		sb.append(", inspectorDivision=");
		sb.append(inspectorDivision);
		sb.append(", inspectorSignName=");
		sb.append(inspectorSignName);
		sb.append(", inspectorSignTitle=");
		sb.append(inspectorSignTitle);
		sb.append(", inspectorSignPlace=");
		sb.append(inspectorSignPlace);
		sb.append(", inspectorSignDate=");
		sb.append(inspectorSignDate);
		sb.append(", dossierDate=");
		sb.append(dossierDate);
		sb.append(", filedangkykiemtraId=");
		sb.append(filedangkykiemtraId);
		sb.append(", filebienbankiemtraId=");
		sb.append(filebienbankiemtraId);
		sb.append(", filechungchiId=");
		sb.append(filechungchiId);
		sb.append(", filebaocaotnantoanId=");
		sb.append(filebaocaotnantoanId);
		sb.append(", filebaocaotnkhithaiId=");
		sb.append(filebaocaotnkhithaiId);
		sb.append(", fileketluangiamdinhId=");
		sb.append(fileketluangiamdinhId);
		sb.append(", SynchDate=");
		sb.append(SynchDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehicleCertificate toEntityModel() {
		VehicleCertificateImpl vehicleCertificateImpl = new VehicleCertificateImpl();

		vehicleCertificateImpl.setId(id);
		vehicleCertificateImpl.setMtGateway(mtGateway);
		vehicleCertificateImpl.setHoSoThuTucId(hoSoThuTucId);
		vehicleCertificateImpl.setSequenceNo(sequenceNo);
		vehicleCertificateImpl.setVehicleRecordid(vehicleRecordid);
		vehicleCertificateImpl.setDraftCertificateid(draftCertificateid);
		vehicleCertificateImpl.setCertificateRecordid(certificateRecordid);
		vehicleCertificateImpl.setDebitNoteId(debitNoteId);
		vehicleCertificateImpl.setVehicleGroupId(vehicleGroupId);

		if (vehicleClass == null) {
			vehicleCertificateImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setVehicleClass(vehicleClass);
		}

		if (technicalSpecCode == null) {
			vehicleCertificateImpl.setTechnicalSpecCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setTechnicalSpecCode(technicalSpecCode);
		}

		if (referenceCertificateNo == null) {
			vehicleCertificateImpl.setReferenceCertificateNo(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setReferenceCertificateNo(referenceCertificateNo);
		}

		if (safetytestreportNo == null) {
			vehicleCertificateImpl.setSafetytestreportNo(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setSafetytestreportNo(safetytestreportNo);
		}

		if (emissiontestreportNo == null) {
			vehicleCertificateImpl.setEmissiontestreportNo(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setEmissiontestreportNo(emissiontestreportNo);
		}

		if (copreportNo == null) {
			vehicleCertificateImpl.setCopreportNo(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCopreportNo(copreportNo);
		}

		if (controlreportNo == null) {
			vehicleCertificateImpl.setControlreportNo(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setControlreportNo(controlreportNo);
		}

		if (vehicletypeDescription == null) {
			vehicleCertificateImpl.setVehicletypeDescription(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setVehicletypeDescription(vehicletypeDescription);
		}

		if (vehicleType == null) {
			vehicleCertificateImpl.setVehicleType(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setVehicleType(vehicleType);
		}

		if (enginetypeDescription == null) {
			vehicleCertificateImpl.setEnginetypeDescription(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setEnginetypeDescription(enginetypeDescription);
		}

		if (engineType == null) {
			vehicleCertificateImpl.setEngineType(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setEngineType(engineType);
		}

		vehicleCertificateImpl.setMarkAsVehicle(markAsVehicle);

		if (trademarkDescription == null) {
			vehicleCertificateImpl.setTrademarkDescription(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setTrademarkDescription(trademarkDescription);
		}

		if (tradeMark == null) {
			vehicleCertificateImpl.setTradeMark(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setTradeMark(tradeMark);
		}

		if (commercialName == null) {
			vehicleCertificateImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vehicleCertificateImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setModelCode(modelCode);
		}

		if (productionPlant == null) {
			vehicleCertificateImpl.setProductionPlant(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setProductionPlant(productionPlant);
		}

		if (addressOfProductionPlant == null) {
			vehicleCertificateImpl.setAddressOfProductionPlant(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setAddressOfProductionPlant(addressOfProductionPlant);
		}

		if (emissionStandard == null) {
			vehicleCertificateImpl.setEmissionStandard(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setEmissionStandard(emissionStandard);
		}

		vehicleCertificateImpl.setCodeNumber(codeNumber);

		if (chassisNumber == null) {
			vehicleCertificateImpl.setChassisNumber(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setChassisNumber(chassisNumber);
		}

		if (engineNumber == null) {
			vehicleCertificateImpl.setEngineNumber(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setEngineNumber(engineNumber);
		}

		if (productionYear == null) {
			vehicleCertificateImpl.setProductionYear(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setProductionYear(productionYear);
		}

		if (countryCode == null) {
			vehicleCertificateImpl.setCountryCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCountryCode(countryCode);
		}

		if (countryName == null) {
			vehicleCertificateImpl.setCountryName(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCountryName(countryName);
		}

		if (currentStatus == null) {
			vehicleCertificateImpl.setCurrentStatus(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCurrentStatus(currentStatus);
		}

		if (vehicleEngineUsage == null) {
			vehicleCertificateImpl.setVehicleEngineUsage(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setVehicleEngineUsage(vehicleEngineUsage);
		}

		if (vehicleColor == null) {
			vehicleCertificateImpl.setVehicleColor(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setVehicleColor(vehicleColor);
		}

		vehicleCertificateImpl.setUnitPrice(unitPrice);

		if (currency == null) {
			vehicleCertificateImpl.setCurrency(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCurrency(currency);
		}

		if (remarks == null) {
			vehicleCertificateImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setRemarks(remarks);
		}

		vehicleCertificateImpl.setMarkUpStatus(markUpStatus);
		vehicleCertificateImpl.setMarkAsSample(markAsSample);
		vehicleCertificateImpl.setVehicleengineStatus(vehicleengineStatus);
		vehicleCertificateImpl.setVehicleengineFolder(vehicleengineFolder);
		vehicleCertificateImpl.setVehicleGroupInitialId(vehicleGroupInitialId);
		vehicleCertificateImpl.setRegisteredInspectionId(registeredInspectionId);

		if (registeredNumber == null) {
			vehicleCertificateImpl.setRegisteredNumber(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setRegisteredNumber(registeredNumber);
		}

		if (importerCode == null) {
			vehicleCertificateImpl.setImporterCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setImporterCode(importerCode);
		}

		if (importerName == null) {
			vehicleCertificateImpl.setImporterName(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setImporterName(importerName);
		}

		if (importerAddress == null) {
			vehicleCertificateImpl.setImporterAddress(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setImporterAddress(importerAddress);
		}

		if (representative == null) {
			vehicleCertificateImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setRepresentative(representative);
		}

		if (phone == null) {
			vehicleCertificateImpl.setPhone(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setPhone(phone);
		}

		if (fax == null) {
			vehicleCertificateImpl.setFax(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setFax(fax);
		}

		if (email == null) {
			vehicleCertificateImpl.setEmail(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setEmail(email);
		}

		if (inspectionDate == Long.MIN_VALUE) {
			vehicleCertificateImpl.setInspectionDate(null);
		}
		else {
			vehicleCertificateImpl.setInspectionDate(new Date(inspectionDate));
		}

		if (inspectionSite == null) {
			vehicleCertificateImpl.setInspectionSite(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectionSite(inspectionSite);
		}

		if (inspectionDistrictCode == null) {
			vehicleCertificateImpl.setInspectionDistrictCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectionDistrictCode(inspectionDistrictCode);
		}

		if (inspectionProvinceCode == null) {
			vehicleCertificateImpl.setInspectionProvinceCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectionProvinceCode(inspectionProvinceCode);
		}

		if (inspectionDistrict == null) {
			vehicleCertificateImpl.setInspectionDistrict(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectionDistrict(inspectionDistrict);
		}

		if (inspectionProvince == null) {
			vehicleCertificateImpl.setInspectionProvince(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectionProvince(inspectionProvince);
		}

		vehicleCertificateImpl.setConfirmedInspectionId(confirmedInspectionId);
		vehicleCertificateImpl.setInspectionRecordId(inspectionRecordId);

		if (inspectionRecordNo == null) {
			vehicleCertificateImpl.setInspectionRecordNo(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectionRecordNo(inspectionRecordNo);
		}

		if (inspectionDateFrom == Long.MIN_VALUE) {
			vehicleCertificateImpl.setInspectionDateFrom(null);
		}
		else {
			vehicleCertificateImpl.setInspectionDateFrom(new Date(
					inspectionDateFrom));
		}

		if (inspectionDateTo == Long.MIN_VALUE) {
			vehicleCertificateImpl.setInspectionDateTo(null);
		}
		else {
			vehicleCertificateImpl.setInspectionDateTo(new Date(
					inspectionDateTo));
		}

		vehicleCertificateImpl.setInspectionMode(inspectionMode);

		if (inspectionModeDescription == null) {
			vehicleCertificateImpl.setInspectionModeDescription(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectionModeDescription(inspectionModeDescription);
		}

		vehicleCertificateImpl.setConfirmedResult(confirmedResult);

		if (confirmedResultDescription == null) {
			vehicleCertificateImpl.setConfirmedResultDescription(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setConfirmedResultDescription(confirmedResultDescription);
		}

		if (importCustomDeclareDate == Long.MIN_VALUE) {
			vehicleCertificateImpl.setImportCustomDeclareDate(null);
		}
		else {
			vehicleCertificateImpl.setImportCustomDeclareDate(new Date(
					importCustomDeclareDate));
		}

		if (importCustomDeclareNo == null) {
			vehicleCertificateImpl.setImportCustomDeclareNo(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setImportCustomDeclareNo(importCustomDeclareNo);
		}

		if (corporationCode == null) {
			vehicleCertificateImpl.setCorporationCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCorporationCode(corporationCode);
		}

		if (corporationName == null) {
			vehicleCertificateImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCorporationName(corporationName);
		}

		if (inspectorContactCode == null) {
			vehicleCertificateImpl.setInspectorContactCode(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectorContactCode(inspectorContactCode);
		}

		if (inspectorName == null) {
			vehicleCertificateImpl.setInspectorName(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectorName(inspectorName);
		}

		vehicleCertificateImpl.setCertificateType(certificateType);

		if (certificateNumber == null) {
			vehicleCertificateImpl.setCertificateNumber(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCertificateNumber(certificateNumber);
		}

		if (oldcertificateNumber == null) {
			vehicleCertificateImpl.setOldcertificateNumber(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setOldcertificateNumber(oldcertificateNumber);
		}

		if (signDate == Long.MIN_VALUE) {
			vehicleCertificateImpl.setSignDate(null);
		}
		else {
			vehicleCertificateImpl.setSignDate(new Date(signDate));
		}

		vehicleCertificateImpl.setStampStatus(stampStatus);

		if (certificateStatus == null) {
			vehicleCertificateImpl.setCertificateStatus(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setCertificateStatus(certificateStatus);
		}

		vehicleCertificateImpl.setDigitalIssued(digitalIssued);
		vehicleCertificateImpl.setMarkupSafeTest(markupSafeTest);
		vehicleCertificateImpl.setMarkupEmissionTest(markupEmissionTest);
		vehicleCertificateImpl.setMarkupControl(markupControl);
		vehicleCertificateImpl.setAttachedFile(attachedFile);

		if (inspectorOrganization == null) {
			vehicleCertificateImpl.setInspectorOrganization(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectorOrganization(inspectorOrganization);
		}

		if (inspectorDivision == null) {
			vehicleCertificateImpl.setInspectorDivision(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectorDivision(inspectorDivision);
		}

		if (inspectorSignName == null) {
			vehicleCertificateImpl.setInspectorSignName(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectorSignName(inspectorSignName);
		}

		if (inspectorSignTitle == null) {
			vehicleCertificateImpl.setInspectorSignTitle(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectorSignTitle(inspectorSignTitle);
		}

		if (inspectorSignPlace == null) {
			vehicleCertificateImpl.setInspectorSignPlace(StringPool.BLANK);
		}
		else {
			vehicleCertificateImpl.setInspectorSignPlace(inspectorSignPlace);
		}

		if (inspectorSignDate == Long.MIN_VALUE) {
			vehicleCertificateImpl.setInspectorSignDate(null);
		}
		else {
			vehicleCertificateImpl.setInspectorSignDate(new Date(
					inspectorSignDate));
		}

		if (dossierDate == Long.MIN_VALUE) {
			vehicleCertificateImpl.setDossierDate(null);
		}
		else {
			vehicleCertificateImpl.setDossierDate(new Date(dossierDate));
		}

		vehicleCertificateImpl.setFiledangkykiemtraId(filedangkykiemtraId);
		vehicleCertificateImpl.setFilebienbankiemtraId(filebienbankiemtraId);
		vehicleCertificateImpl.setFilechungchiId(filechungchiId);
		vehicleCertificateImpl.setFilebaocaotnantoanId(filebaocaotnantoanId);
		vehicleCertificateImpl.setFilebaocaotnkhithaiId(filebaocaotnkhithaiId);
		vehicleCertificateImpl.setFileketluangiamdinhId(fileketluangiamdinhId);

		if (SynchDate == Long.MIN_VALUE) {
			vehicleCertificateImpl.setSynchDate(null);
		}
		else {
			vehicleCertificateImpl.setSynchDate(new Date(SynchDate));
		}

		vehicleCertificateImpl.resetOriginalValues();

		return vehicleCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		mtGateway = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		sequenceNo = objectInput.readLong();
		vehicleRecordid = objectInput.readLong();
		draftCertificateid = objectInput.readLong();
		certificateRecordid = objectInput.readLong();
		debitNoteId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		technicalSpecCode = objectInput.readUTF();
		referenceCertificateNo = objectInput.readUTF();
		safetytestreportNo = objectInput.readUTF();
		emissiontestreportNo = objectInput.readUTF();
		copreportNo = objectInput.readUTF();
		controlreportNo = objectInput.readUTF();
		vehicletypeDescription = objectInput.readUTF();
		vehicleType = objectInput.readUTF();
		enginetypeDescription = objectInput.readUTF();
		engineType = objectInput.readUTF();
		markAsVehicle = objectInput.readInt();
		trademarkDescription = objectInput.readUTF();
		tradeMark = objectInput.readUTF();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		productionPlant = objectInput.readUTF();
		addressOfProductionPlant = objectInput.readUTF();
		emissionStandard = objectInput.readUTF();
		codeNumber = objectInput.readLong();
		chassisNumber = objectInput.readUTF();
		engineNumber = objectInput.readUTF();
		productionYear = objectInput.readUTF();
		countryCode = objectInput.readUTF();
		countryName = objectInput.readUTF();
		currentStatus = objectInput.readUTF();
		vehicleEngineUsage = objectInput.readUTF();
		vehicleColor = objectInput.readUTF();
		unitPrice = objectInput.readDouble();
		currency = objectInput.readUTF();
		remarks = objectInput.readUTF();
		markUpStatus = objectInput.readLong();
		markAsSample = objectInput.readInt();
		vehicleengineStatus = objectInput.readLong();
		vehicleengineFolder = objectInput.readLong();
		vehicleGroupInitialId = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		registeredNumber = objectInput.readUTF();
		importerCode = objectInput.readUTF();
		importerName = objectInput.readUTF();
		importerAddress = objectInput.readUTF();
		representative = objectInput.readUTF();
		phone = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
		inspectionDate = objectInput.readLong();
		inspectionSite = objectInput.readUTF();
		inspectionDistrictCode = objectInput.readUTF();
		inspectionProvinceCode = objectInput.readUTF();
		inspectionDistrict = objectInput.readUTF();
		inspectionProvince = objectInput.readUTF();
		confirmedInspectionId = objectInput.readLong();
		inspectionRecordId = objectInput.readLong();
		inspectionRecordNo = objectInput.readUTF();
		inspectionDateFrom = objectInput.readLong();
		inspectionDateTo = objectInput.readLong();
		inspectionMode = objectInput.readLong();
		inspectionModeDescription = objectInput.readUTF();
		confirmedResult = objectInput.readLong();
		confirmedResultDescription = objectInput.readUTF();
		importCustomDeclareDate = objectInput.readLong();
		importCustomDeclareNo = objectInput.readUTF();
		corporationCode = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		inspectorContactCode = objectInput.readUTF();
		inspectorName = objectInput.readUTF();
		certificateType = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		oldcertificateNumber = objectInput.readUTF();
		signDate = objectInput.readLong();
		stampStatus = objectInput.readLong();
		certificateStatus = objectInput.readUTF();
		digitalIssued = objectInput.readLong();
		markupSafeTest = objectInput.readLong();
		markupEmissionTest = objectInput.readLong();
		markupControl = objectInput.readLong();
		attachedFile = objectInput.readLong();
		inspectorOrganization = objectInput.readUTF();
		inspectorDivision = objectInput.readUTF();
		inspectorSignName = objectInput.readUTF();
		inspectorSignTitle = objectInput.readUTF();
		inspectorSignPlace = objectInput.readUTF();
		inspectorSignDate = objectInput.readLong();
		dossierDate = objectInput.readLong();
		filedangkykiemtraId = objectInput.readLong();
		filebienbankiemtraId = objectInput.readLong();
		filechungchiId = objectInput.readLong();
		filebaocaotnantoanId = objectInput.readLong();
		filebaocaotnkhithaiId = objectInput.readLong();
		fileketluangiamdinhId = objectInput.readLong();
		SynchDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(mtGateway);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(sequenceNo);
		objectOutput.writeLong(vehicleRecordid);
		objectOutput.writeLong(draftCertificateid);
		objectOutput.writeLong(certificateRecordid);
		objectOutput.writeLong(debitNoteId);
		objectOutput.writeLong(vehicleGroupId);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (technicalSpecCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(technicalSpecCode);
		}

		if (referenceCertificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceCertificateNo);
		}

		if (safetytestreportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(safetytestreportNo);
		}

		if (emissiontestreportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emissiontestreportNo);
		}

		if (copreportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(copreportNo);
		}

		if (controlreportNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(controlreportNo);
		}

		if (vehicletypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicletypeDescription);
		}

		if (vehicleType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleType);
		}

		if (enginetypeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enginetypeDescription);
		}

		if (engineType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(engineType);
		}

		objectOutput.writeInt(markAsVehicle);

		if (trademarkDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trademarkDescription);
		}

		if (tradeMark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tradeMark);
		}

		if (commercialName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commercialName);
		}

		if (modelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modelCode);
		}

		if (productionPlant == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionPlant);
		}

		if (addressOfProductionPlant == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(addressOfProductionPlant);
		}

		if (emissionStandard == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emissionStandard);
		}

		objectOutput.writeLong(codeNumber);

		if (chassisNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chassisNumber);
		}

		if (engineNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(engineNumber);
		}

		if (productionYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productionYear);
		}

		if (countryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(countryCode);
		}

		if (countryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(countryName);
		}

		if (currentStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currentStatus);
		}

		if (vehicleEngineUsage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleEngineUsage);
		}

		if (vehicleColor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleColor);
		}

		objectOutput.writeDouble(unitPrice);

		if (currency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currency);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(markUpStatus);
		objectOutput.writeInt(markAsSample);
		objectOutput.writeLong(vehicleengineStatus);
		objectOutput.writeLong(vehicleengineFolder);
		objectOutput.writeLong(vehicleGroupInitialId);
		objectOutput.writeLong(registeredInspectionId);

		if (registeredNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registeredNumber);
		}

		if (importerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerCode);
		}

		if (importerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerName);
		}

		if (importerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerAddress);
		}

		if (representative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(representative);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(inspectionDate);

		if (inspectionSite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionSite);
		}

		if (inspectionDistrictCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionDistrictCode);
		}

		if (inspectionProvinceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionProvinceCode);
		}

		if (inspectionDistrict == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionDistrict);
		}

		if (inspectionProvince == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionProvince);
		}

		objectOutput.writeLong(confirmedInspectionId);
		objectOutput.writeLong(inspectionRecordId);

		if (inspectionRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionRecordNo);
		}

		objectOutput.writeLong(inspectionDateFrom);
		objectOutput.writeLong(inspectionDateTo);
		objectOutput.writeLong(inspectionMode);

		if (inspectionModeDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionModeDescription);
		}

		objectOutput.writeLong(confirmedResult);

		if (confirmedResultDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(confirmedResultDescription);
		}

		objectOutput.writeLong(importCustomDeclareDate);

		if (importCustomDeclareNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importCustomDeclareNo);
		}

		if (corporationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationCode);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		if (inspectorContactCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorContactCode);
		}

		if (inspectorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorName);
		}

		objectOutput.writeLong(certificateType);

		if (certificateNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		if (oldcertificateNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oldcertificateNumber);
		}

		objectOutput.writeLong(signDate);
		objectOutput.writeLong(stampStatus);

		if (certificateStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateStatus);
		}

		objectOutput.writeLong(digitalIssued);
		objectOutput.writeLong(markupSafeTest);
		objectOutput.writeLong(markupEmissionTest);
		objectOutput.writeLong(markupControl);
		objectOutput.writeLong(attachedFile);

		if (inspectorOrganization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorOrganization);
		}

		if (inspectorDivision == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorDivision);
		}

		if (inspectorSignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignName);
		}

		if (inspectorSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignTitle);
		}

		if (inspectorSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignPlace);
		}

		objectOutput.writeLong(inspectorSignDate);
		objectOutput.writeLong(dossierDate);
		objectOutput.writeLong(filedangkykiemtraId);
		objectOutput.writeLong(filebienbankiemtraId);
		objectOutput.writeLong(filechungchiId);
		objectOutput.writeLong(filebaocaotnantoanId);
		objectOutput.writeLong(filebaocaotnkhithaiId);
		objectOutput.writeLong(fileketluangiamdinhId);
		objectOutput.writeLong(SynchDate);
	}

	public long id;
	public long mtGateway;
	public long hoSoThuTucId;
	public long sequenceNo;
	public long vehicleRecordid;
	public long draftCertificateid;
	public long certificateRecordid;
	public long debitNoteId;
	public long vehicleGroupId;
	public String vehicleClass;
	public String technicalSpecCode;
	public String referenceCertificateNo;
	public String safetytestreportNo;
	public String emissiontestreportNo;
	public String copreportNo;
	public String controlreportNo;
	public String vehicletypeDescription;
	public String vehicleType;
	public String enginetypeDescription;
	public String engineType;
	public int markAsVehicle;
	public String trademarkDescription;
	public String tradeMark;
	public String commercialName;
	public String modelCode;
	public String productionPlant;
	public String addressOfProductionPlant;
	public String emissionStandard;
	public long codeNumber;
	public String chassisNumber;
	public String engineNumber;
	public String productionYear;
	public String countryCode;
	public String countryName;
	public String currentStatus;
	public String vehicleEngineUsage;
	public String vehicleColor;
	public double unitPrice;
	public String currency;
	public String remarks;
	public long markUpStatus;
	public int markAsSample;
	public long vehicleengineStatus;
	public long vehicleengineFolder;
	public long vehicleGroupInitialId;
	public long registeredInspectionId;
	public String registeredNumber;
	public String importerCode;
	public String importerName;
	public String importerAddress;
	public String representative;
	public String phone;
	public String fax;
	public String email;
	public long inspectionDate;
	public String inspectionSite;
	public String inspectionDistrictCode;
	public String inspectionProvinceCode;
	public String inspectionDistrict;
	public String inspectionProvince;
	public long confirmedInspectionId;
	public long inspectionRecordId;
	public String inspectionRecordNo;
	public long inspectionDateFrom;
	public long inspectionDateTo;
	public long inspectionMode;
	public String inspectionModeDescription;
	public long confirmedResult;
	public String confirmedResultDescription;
	public long importCustomDeclareDate;
	public String importCustomDeclareNo;
	public String corporationCode;
	public String corporationName;
	public String inspectorContactCode;
	public String inspectorName;
	public long certificateType;
	public String certificateNumber;
	public String oldcertificateNumber;
	public long signDate;
	public long stampStatus;
	public String certificateStatus;
	public long digitalIssued;
	public long markupSafeTest;
	public long markupEmissionTest;
	public long markupControl;
	public long attachedFile;
	public String inspectorOrganization;
	public String inspectorDivision;
	public String inspectorSignName;
	public String inspectorSignTitle;
	public String inspectorSignPlace;
	public long inspectorSignDate;
	public long dossierDate;
	public long filedangkykiemtraId;
	public long filebienbankiemtraId;
	public long filechungchiId;
	public long filebaocaotnantoanId;
	public long filebaocaotnkhithaiId;
	public long fileketluangiamdinhId;
	public long SynchDate;
}