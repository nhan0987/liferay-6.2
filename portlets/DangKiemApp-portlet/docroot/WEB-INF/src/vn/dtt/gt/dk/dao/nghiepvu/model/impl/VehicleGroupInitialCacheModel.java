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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VehicleGroupInitial in entity cache.
 *
 * @author win_64
 * @see VehicleGroupInitial
 * @generated
 */
public class VehicleGroupInitialCacheModel implements CacheModel<VehicleGroupInitial>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
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
		sb.append(", vehicleType=");
		sb.append(vehicleType);
		sb.append(", engineType=");
		sb.append(engineType);
		sb.append(", tradeMark=");
		sb.append(tradeMark);
		sb.append(", markAsVehicle=");
		sb.append(markAsVehicle);
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
		sb.append(", safetyTestReportId=");
		sb.append(safetyTestReportId);
		sb.append(", emissionTestReportId=");
		sb.append(emissionTestReportId);
		sb.append(", copReportId=");
		sb.append(copReportId);
		sb.append(", controlreportId=");
		sb.append(controlreportId);
		sb.append(", specificationVersion=");
		sb.append(specificationVersion);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", SynchDate=");
		sb.append(SynchDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehicleGroupInitial toEntityModel() {
		VehicleGroupInitialImpl vehicleGroupInitialImpl = new VehicleGroupInitialImpl();

		vehicleGroupInitialImpl.setId(id);

		if (vehicleClass == null) {
			vehicleGroupInitialImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setVehicleClass(vehicleClass);
		}

		vehicleGroupInitialImpl.setRegisteredInspectionId(registeredInspectionId);

		if (technicalSpecCode == null) {
			vehicleGroupInitialImpl.setTechnicalSpecCode(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setTechnicalSpecCode(technicalSpecCode);
		}

		if (referenceCertificateNo == null) {
			vehicleGroupInitialImpl.setReferenceCertificateNo(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setReferenceCertificateNo(referenceCertificateNo);
		}

		if (safetytestreportNo == null) {
			vehicleGroupInitialImpl.setSafetytestreportNo(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setSafetytestreportNo(safetytestreportNo);
		}

		if (emissiontestreportNo == null) {
			vehicleGroupInitialImpl.setEmissiontestreportNo(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setEmissiontestreportNo(emissiontestreportNo);
		}

		if (copreportNo == null) {
			vehicleGroupInitialImpl.setCopreportNo(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setCopreportNo(copreportNo);
		}

		if (controlreportNo == null) {
			vehicleGroupInitialImpl.setControlreportNo(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setControlreportNo(controlreportNo);
		}

		if (vehicleType == null) {
			vehicleGroupInitialImpl.setVehicleType(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setVehicleType(vehicleType);
		}

		if (engineType == null) {
			vehicleGroupInitialImpl.setEngineType(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setEngineType(engineType);
		}

		if (tradeMark == null) {
			vehicleGroupInitialImpl.setTradeMark(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setTradeMark(tradeMark);
		}

		vehicleGroupInitialImpl.setMarkAsVehicle(markAsVehicle);

		if (commercialName == null) {
			vehicleGroupInitialImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vehicleGroupInitialImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setModelCode(modelCode);
		}

		if (productionPlant == null) {
			vehicleGroupInitialImpl.setProductionPlant(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setProductionPlant(productionPlant);
		}

		if (addressOfProductionPlant == null) {
			vehicleGroupInitialImpl.setAddressOfProductionPlant(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setAddressOfProductionPlant(addressOfProductionPlant);
		}

		if (emissionStandard == null) {
			vehicleGroupInitialImpl.setEmissionStandard(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setEmissionStandard(emissionStandard);
		}

		vehicleGroupInitialImpl.setSafetyTestReportId(safetyTestReportId);
		vehicleGroupInitialImpl.setEmissionTestReportId(emissionTestReportId);
		vehicleGroupInitialImpl.setCopReportId(copReportId);
		vehicleGroupInitialImpl.setControlreportId(controlreportId);
		vehicleGroupInitialImpl.setSpecificationVersion(specificationVersion);

		if (remarks == null) {
			vehicleGroupInitialImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vehicleGroupInitialImpl.setRemarks(remarks);
		}

		vehicleGroupInitialImpl.setAttachedFile(attachedFile);

		if (SynchDate == Long.MIN_VALUE) {
			vehicleGroupInitialImpl.setSynchDate(null);
		}
		else {
			vehicleGroupInitialImpl.setSynchDate(new Date(SynchDate));
		}

		vehicleGroupInitialImpl.resetOriginalValues();

		return vehicleGroupInitialImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		registeredInspectionId = objectInput.readLong();
		technicalSpecCode = objectInput.readUTF();
		referenceCertificateNo = objectInput.readUTF();
		safetytestreportNo = objectInput.readUTF();
		emissiontestreportNo = objectInput.readUTF();
		copreportNo = objectInput.readUTF();
		controlreportNo = objectInput.readUTF();
		vehicleType = objectInput.readUTF();
		engineType = objectInput.readUTF();
		tradeMark = objectInput.readUTF();
		markAsVehicle = objectInput.readInt();
		commercialName = objectInput.readUTF();
		modelCode = objectInput.readUTF();
		productionPlant = objectInput.readUTF();
		addressOfProductionPlant = objectInput.readUTF();
		emissionStandard = objectInput.readUTF();
		safetyTestReportId = objectInput.readLong();
		emissionTestReportId = objectInput.readLong();
		copReportId = objectInput.readLong();
		controlreportId = objectInput.readLong();
		specificationVersion = objectInput.readLong();
		remarks = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		SynchDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		objectOutput.writeLong(registeredInspectionId);

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

		if (vehicleType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleType);
		}

		if (engineType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(engineType);
		}

		if (tradeMark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tradeMark);
		}

		objectOutput.writeInt(markAsVehicle);

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

		objectOutput.writeLong(safetyTestReportId);
		objectOutput.writeLong(emissionTestReportId);
		objectOutput.writeLong(copReportId);
		objectOutput.writeLong(controlreportId);
		objectOutput.writeLong(specificationVersion);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(attachedFile);
		objectOutput.writeLong(SynchDate);
	}

	public long id;
	public String vehicleClass;
	public long registeredInspectionId;
	public String technicalSpecCode;
	public String referenceCertificateNo;
	public String safetytestreportNo;
	public String emissiontestreportNo;
	public String copreportNo;
	public String controlreportNo;
	public String vehicleType;
	public String engineType;
	public String tradeMark;
	public int markAsVehicle;
	public String commercialName;
	public String modelCode;
	public String productionPlant;
	public String addressOfProductionPlant;
	public String emissionStandard;
	public long safetyTestReportId;
	public long emissionTestReportId;
	public long copReportId;
	public long controlreportId;
	public long specificationVersion;
	public String remarks;
	public long attachedFile;
	public long SynchDate;
}