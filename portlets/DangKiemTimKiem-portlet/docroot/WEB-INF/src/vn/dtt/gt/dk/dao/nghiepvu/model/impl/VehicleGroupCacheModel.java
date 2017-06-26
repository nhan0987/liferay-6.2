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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VehicleGroup in entity cache.
 *
 * @author win_64
 * @see VehicleGroup
 * @generated
 */
public class VehicleGroupCacheModel implements CacheModel<VehicleGroup>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

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
		sb.append(", specificationVersion=");
		sb.append(specificationVersion);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehicleGroup toEntityModel() {
		VehicleGroupImpl vehicleGroupImpl = new VehicleGroupImpl();

		vehicleGroupImpl.setId(id);

		if (vehicleClass == null) {
			vehicleGroupImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setVehicleClass(vehicleClass);
		}

		vehicleGroupImpl.setRegisteredInspectionId(registeredInspectionId);

		if (technicalSpecCode == null) {
			vehicleGroupImpl.setTechnicalSpecCode(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setTechnicalSpecCode(technicalSpecCode);
		}

		if (referenceCertificateNo == null) {
			vehicleGroupImpl.setReferenceCertificateNo(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setReferenceCertificateNo(referenceCertificateNo);
		}

		if (safetytestreportNo == null) {
			vehicleGroupImpl.setSafetytestreportNo(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setSafetytestreportNo(safetytestreportNo);
		}

		if (emissiontestreportNo == null) {
			vehicleGroupImpl.setEmissiontestreportNo(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setEmissiontestreportNo(emissiontestreportNo);
		}

		if (copreportNo == null) {
			vehicleGroupImpl.setCopreportNo(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setCopreportNo(copreportNo);
		}

		if (vehicleType == null) {
			vehicleGroupImpl.setVehicleType(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setVehicleType(vehicleType);
		}

		if (engineType == null) {
			vehicleGroupImpl.setEngineType(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setEngineType(engineType);
		}

		if (tradeMark == null) {
			vehicleGroupImpl.setTradeMark(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setTradeMark(tradeMark);
		}

		vehicleGroupImpl.setMarkAsVehicle(markAsVehicle);

		if (commercialName == null) {
			vehicleGroupImpl.setCommercialName(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setCommercialName(commercialName);
		}

		if (modelCode == null) {
			vehicleGroupImpl.setModelCode(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setModelCode(modelCode);
		}

		if (productionPlant == null) {
			vehicleGroupImpl.setProductionPlant(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setProductionPlant(productionPlant);
		}

		if (addressOfProductionPlant == null) {
			vehicleGroupImpl.setAddressOfProductionPlant(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setAddressOfProductionPlant(addressOfProductionPlant);
		}

		if (emissionStandard == null) {
			vehicleGroupImpl.setEmissionStandard(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setEmissionStandard(emissionStandard);
		}

		vehicleGroupImpl.setSafetyTestReportId(safetyTestReportId);
		vehicleGroupImpl.setEmissionTestReportId(emissionTestReportId);
		vehicleGroupImpl.setCopReportId(copReportId);
		vehicleGroupImpl.setSpecificationVersion(specificationVersion);
		vehicleGroupImpl.setHoSoThuTucId(hoSoThuTucId);

		if (remarks == null) {
			vehicleGroupImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vehicleGroupImpl.setRemarks(remarks);
		}

		vehicleGroupImpl.setAttachedFile(attachedFile);

		vehicleGroupImpl.resetOriginalValues();

		return vehicleGroupImpl;
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
		specificationVersion = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		remarks = objectInput.readUTF();
		attachedFile = objectInput.readLong();
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
		objectOutput.writeLong(specificationVersion);
		objectOutput.writeLong(hoSoThuTucId);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(attachedFile);
	}

	public long id;
	public String vehicleClass;
	public long registeredInspectionId;
	public String technicalSpecCode;
	public String referenceCertificateNo;
	public String safetytestreportNo;
	public String emissiontestreportNo;
	public String copreportNo;
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
	public long specificationVersion;
	public long hoSoThuTucId;
	public String remarks;
	public long attachedFile;
}