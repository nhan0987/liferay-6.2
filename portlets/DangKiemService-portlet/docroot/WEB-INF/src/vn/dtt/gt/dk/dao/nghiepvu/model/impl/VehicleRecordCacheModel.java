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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VehicleRecord in entity cache.
 *
 * @author huymq
 * @see VehicleRecord
 * @generated
 */
public class VehicleRecordCacheModel implements CacheModel<VehicleRecord>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", debitNoteId=");
		sb.append(debitNoteId);
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
		sb.append(", markAsSample=");
		sb.append(markAsSample);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehicleRecord toEntityModel() {
		VehicleRecordImpl vehicleRecordImpl = new VehicleRecordImpl();

		vehicleRecordImpl.setId(id);
		vehicleRecordImpl.setVehicleGroupId(vehicleGroupId);
		vehicleRecordImpl.setDebitNoteId(debitNoteId);
		vehicleRecordImpl.setSequenceNo(sequenceNo);
		vehicleRecordImpl.setCodeNumber(codeNumber);

		if (chassisNumber == null) {
			vehicleRecordImpl.setChassisNumber(StringPool.BLANK);
		}
		else {
			vehicleRecordImpl.setChassisNumber(chassisNumber);
		}

		if (engineNumber == null) {
			vehicleRecordImpl.setEngineNumber(StringPool.BLANK);
		}
		else {
			vehicleRecordImpl.setEngineNumber(engineNumber);
		}

		if (productionYear == null) {
			vehicleRecordImpl.setProductionYear(StringPool.BLANK);
		}
		else {
			vehicleRecordImpl.setProductionYear(productionYear);
		}

		if (vehicleEngineStatus == null) {
			vehicleRecordImpl.setVehicleEngineStatus(StringPool.BLANK);
		}
		else {
			vehicleRecordImpl.setVehicleEngineStatus(vehicleEngineStatus);
		}

		if (vehicleColor == null) {
			vehicleRecordImpl.setVehicleColor(StringPool.BLANK);
		}
		else {
			vehicleRecordImpl.setVehicleColor(vehicleColor);
		}

		vehicleRecordImpl.setUnitPrice(unitPrice);

		if (currency == null) {
			vehicleRecordImpl.setCurrency(StringPool.BLANK);
		}
		else {
			vehicleRecordImpl.setCurrency(currency);
		}

		if (remarks == null) {
			vehicleRecordImpl.setRemarks(StringPool.BLANK);
		}
		else {
			vehicleRecordImpl.setRemarks(remarks);
		}

		vehicleRecordImpl.setConfirmedInspectionId(confirmedInspectionId);
		vehicleRecordImpl.setInspectionRecordId(inspectionRecordId);
		vehicleRecordImpl.setDraftCertificateId(draftCertificateId);
		vehicleRecordImpl.setCertificateRecordId(certificateRecordId);
		vehicleRecordImpl.setMarkUpStatus(markUpStatus);
		vehicleRecordImpl.setSafeTestRequirementId(safeTestRequirementId);
		vehicleRecordImpl.setEmissionTestRequirementId(emissionTestRequirementId);
		vehicleRecordImpl.setControlRequirementId(controlRequirementId);
		vehicleRecordImpl.setMarkAsSample(markAsSample);

		if (synchdate == Long.MIN_VALUE) {
			vehicleRecordImpl.setSynchdate(null);
		}
		else {
			vehicleRecordImpl.setSynchdate(new Date(synchdate));
		}

		vehicleRecordImpl.resetOriginalValues();

		return vehicleRecordImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		debitNoteId = objectInput.readLong();
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
		markAsSample = objectInput.readInt();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(debitNoteId);
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
		objectOutput.writeInt(markAsSample);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long vehicleGroupId;
	public long debitNoteId;
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
	public int markAsSample;
	public long synchdate;
}