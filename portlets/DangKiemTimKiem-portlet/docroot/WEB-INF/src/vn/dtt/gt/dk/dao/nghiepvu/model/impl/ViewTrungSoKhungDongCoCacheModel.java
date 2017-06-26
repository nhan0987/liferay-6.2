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

import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ViewTrungSoKhungDongCo in entity cache.
 *
 * @author win_64
 * @see ViewTrungSoKhungDongCo
 * @generated
 */
public class ViewTrungSoKhungDongCoCacheModel implements CacheModel<ViewTrungSoKhungDongCo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

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
		sb.append(", registeredNumber=");
		sb.append(registeredNumber);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", contactPhone=");
		sb.append(contactPhone);
		sb.append(", inspectionDate=");
		sb.append(inspectionDate);
		sb.append(", importerName=");
		sb.append(importerName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ViewTrungSoKhungDongCo toEntityModel() {
		ViewTrungSoKhungDongCoImpl viewTrungSoKhungDongCoImpl = new ViewTrungSoKhungDongCoImpl();

		viewTrungSoKhungDongCoImpl.setId(id);
		viewTrungSoKhungDongCoImpl.setVehicleGroupId(vehicleGroupId);
		viewTrungSoKhungDongCoImpl.setDebitNoteId(debitNoteId);
		viewTrungSoKhungDongCoImpl.setSequenceNo(sequenceNo);
		viewTrungSoKhungDongCoImpl.setCodeNumber(codeNumber);

		if (chassisNumber == null) {
			viewTrungSoKhungDongCoImpl.setChassisNumber(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setChassisNumber(chassisNumber);
		}

		if (engineNumber == null) {
			viewTrungSoKhungDongCoImpl.setEngineNumber(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setEngineNumber(engineNumber);
		}

		viewTrungSoKhungDongCoImpl.setProductionYear(productionYear);

		if (vehicleEngineStatus == null) {
			viewTrungSoKhungDongCoImpl.setVehicleEngineStatus(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setVehicleEngineStatus(vehicleEngineStatus);
		}

		if (vehicleColor == null) {
			viewTrungSoKhungDongCoImpl.setVehicleColor(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setVehicleColor(vehicleColor);
		}

		viewTrungSoKhungDongCoImpl.setUnitPrice(unitPrice);

		if (currency == null) {
			viewTrungSoKhungDongCoImpl.setCurrency(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setCurrency(currency);
		}

		if (remarks == null) {
			viewTrungSoKhungDongCoImpl.setRemarks(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setRemarks(remarks);
		}

		viewTrungSoKhungDongCoImpl.setConfirmedInspectionId(confirmedInspectionId);
		viewTrungSoKhungDongCoImpl.setInspectionRecordId(inspectionRecordId);
		viewTrungSoKhungDongCoImpl.setDraftCertificateId(draftCertificateId);
		viewTrungSoKhungDongCoImpl.setCertificateRecordId(certificateRecordId);
		viewTrungSoKhungDongCoImpl.setMarkUpStatus(markUpStatus);
		viewTrungSoKhungDongCoImpl.setSafeTestRequirementId(safeTestRequirementId);
		viewTrungSoKhungDongCoImpl.setEmissionTestRequirementId(emissionTestRequirementId);
		viewTrungSoKhungDongCoImpl.setControlRequirementId(controlRequirementId);
		viewTrungSoKhungDongCoImpl.setMarkAsSample(markAsSample);

		if (registeredNumber == null) {
			viewTrungSoKhungDongCoImpl.setRegisteredNumber(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setRegisteredNumber(registeredNumber);
		}

		if (contactName == null) {
			viewTrungSoKhungDongCoImpl.setContactName(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setContactName(contactName);
		}

		if (contactPhone == null) {
			viewTrungSoKhungDongCoImpl.setContactPhone(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setContactPhone(contactPhone);
		}

		if (inspectionDate == Long.MIN_VALUE) {
			viewTrungSoKhungDongCoImpl.setInspectionDate(null);
		}
		else {
			viewTrungSoKhungDongCoImpl.setInspectionDate(new Date(
					inspectionDate));
		}

		if (importerName == null) {
			viewTrungSoKhungDongCoImpl.setImporterName(StringPool.BLANK);
		}
		else {
			viewTrungSoKhungDongCoImpl.setImporterName(importerName);
		}

		viewTrungSoKhungDongCoImpl.resetOriginalValues();

		return viewTrungSoKhungDongCoImpl;
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
		productionYear = objectInput.readLong();
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
		registeredNumber = objectInput.readUTF();
		contactName = objectInput.readUTF();
		contactPhone = objectInput.readUTF();
		inspectionDate = objectInput.readLong();
		importerName = objectInput.readUTF();
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

		objectOutput.writeLong(productionYear);

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

		if (registeredNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registeredNumber);
		}

		if (contactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactName);
		}

		if (contactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPhone);
		}

		objectOutput.writeLong(inspectionDate);

		if (importerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerName);
		}
	}

	public long id;
	public long vehicleGroupId;
	public long debitNoteId;
	public long sequenceNo;
	public long codeNumber;
	public String chassisNumber;
	public String engineNumber;
	public long productionYear;
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
	public String registeredNumber;
	public String contactName;
	public String contactPhone;
	public long inspectionDate;
	public String importerName;
}