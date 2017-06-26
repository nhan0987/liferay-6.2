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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VehiclerecordInitial in entity cache.
 *
 * @author huymq
 * @see VehiclerecordInitial
 * @generated
 */
public class VehiclerecordInitialCacheModel implements CacheModel<VehiclerecordInitial>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", codeNumber=");
		sb.append(codeNumber);
		sb.append(", chassisNumber=");
		sb.append(chassisNumber);
		sb.append(", engineNumber=");
		sb.append(engineNumber);
		sb.append(", productionYear=");
		sb.append(productionYear);
		sb.append(", vehicleEngineStatus=");
		sb.append(vehicleEngineStatus);
		sb.append(", vehicleColor=");
		sb.append(vehicleColor);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", confirmedInspectionId=");
		sb.append(confirmedInspectionId);
		sb.append(", inspectionRecordId=");
		sb.append(inspectionRecordId);
		sb.append(", draftCertificateId=");
		sb.append(draftCertificateId);
		sb.append(", certificateRecordId=");
		sb.append(certificateRecordId);
		sb.append(", markUpStatus=");
		sb.append(markUpStatus);
		sb.append(", safeTestRequirementId=");
		sb.append(safeTestRequirementId);
		sb.append(", emissionTestRequirementId=");
		sb.append(emissionTestRequirementId);
		sb.append(", controlRequirementId=");
		sb.append(controlRequirementId);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehiclerecordInitial toEntityModel() {
		VehiclerecordInitialImpl vehiclerecordInitialImpl = new VehiclerecordInitialImpl();

		vehiclerecordInitialImpl.setId(id);
		vehiclerecordInitialImpl.setVehicleGroupId(vehicleGroupId);
		vehiclerecordInitialImpl.setSequenceNo(sequenceNo);
		vehiclerecordInitialImpl.setCodeNumber(codeNumber);

		if (chassisNumber == null) {
			vehiclerecordInitialImpl.setChassisNumber(StringPool.BLANK);
		}
		else {
			vehiclerecordInitialImpl.setChassisNumber(chassisNumber);
		}

		if (engineNumber == null) {
			vehiclerecordInitialImpl.setEngineNumber(StringPool.BLANK);
		}
		else {
			vehiclerecordInitialImpl.setEngineNumber(engineNumber);
		}

		if (productionYear == null) {
			vehiclerecordInitialImpl.setProductionYear(StringPool.BLANK);
		}
		else {
			vehiclerecordInitialImpl.setProductionYear(productionYear);
		}

		if (vehicleEngineStatus == null) {
			vehiclerecordInitialImpl.setVehicleEngineStatus(StringPool.BLANK);
		}
		else {
			vehiclerecordInitialImpl.setVehicleEngineStatus(vehicleEngineStatus);
		}

		if (vehicleColor == null) {
			vehiclerecordInitialImpl.setVehicleColor(StringPool.BLANK);
		}
		else {
			vehiclerecordInitialImpl.setVehicleColor(vehicleColor);
		}

		vehiclerecordInitialImpl.setUnitPrice(unitPrice);

		if (currency == null) {
			vehiclerecordInitialImpl.setCurrency(StringPool.BLANK);
		}
		else {
			vehiclerecordInitialImpl.setCurrency(currency);
		}

		if (remarks == null) {
			vehiclerecordInitialImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vehiclerecordInitialImpl.setRemarks(remarks);
		}

		vehiclerecordInitialImpl.setConfirmedInspectionId(confirmedInspectionId);
		vehiclerecordInitialImpl.setInspectionRecordId(inspectionRecordId);
		vehiclerecordInitialImpl.setDraftCertificateId(draftCertificateId);
		vehiclerecordInitialImpl.setCertificateRecordId(certificateRecordId);
		vehiclerecordInitialImpl.setMarkUpStatus(markUpStatus);
		vehiclerecordInitialImpl.setSafeTestRequirementId(safeTestRequirementId);
		vehiclerecordInitialImpl.setEmissionTestRequirementId(emissionTestRequirementId);
		vehiclerecordInitialImpl.setControlRequirementId(controlRequirementId);

		if (synchdate == Long.MIN_VALUE) {
			vehiclerecordInitialImpl.setSynchdate(null);
		}
		else {
			vehiclerecordInitialImpl.setSynchdate(new Date(synchdate));
		}

		vehiclerecordInitialImpl.resetOriginalValues();

		return vehiclerecordInitialImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		sequenceNo = objectInput.readLong();
		codeNumber = objectInput.readLong();
		chassisNumber = objectInput.readUTF();
		engineNumber = objectInput.readUTF();
		productionYear = objectInput.readUTF();
		vehicleEngineStatus = objectInput.readUTF();
		vehicleColor = objectInput.readUTF();
		unitPrice = objectInput.readDouble();
		currency = objectInput.readUTF();
		remarks = objectInput.readUTF();
		confirmedInspectionId = objectInput.readLong();
		inspectionRecordId = objectInput.readLong();
		draftCertificateId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		markUpStatus = objectInput.readLong();
		safeTestRequirementId = objectInput.readLong();
		emissionTestRequirementId = objectInput.readLong();
		controlRequirementId = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(sequenceNo);
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

		if (vehicleEngineStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleEngineStatus);
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

		objectOutput.writeLong(confirmedInspectionId);
		objectOutput.writeLong(inspectionRecordId);
		objectOutput.writeLong(draftCertificateId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(markUpStatus);
		objectOutput.writeLong(safeTestRequirementId);
		objectOutput.writeLong(emissionTestRequirementId);
		objectOutput.writeLong(controlRequirementId);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long vehicleGroupId;
	public long sequenceNo;
	public long codeNumber;
	public String chassisNumber;
	public String engineNumber;
	public String productionYear;
	public String vehicleEngineStatus;
	public String vehicleColor;
	public double unitPrice;
	public String currency;
	public String remarks;
	public long confirmedInspectionId;
	public long inspectionRecordId;
	public long draftCertificateId;
	public long certificateRecordId;
	public long markUpStatus;
	public long safeTestRequirementId;
	public long emissionTestRequirementId;
	public long controlRequirementId;
	public long synchdate;
}