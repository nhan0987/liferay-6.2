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

import vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ViewDangKiemTimKiem in entity cache.
 *
 * @author win_64
 * @see ViewDangKiemTimKiem
 * @generated
 */
public class ViewDangKiemTimKiemCacheModel implements CacheModel<ViewDangKiemTimKiem>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

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
		sb.append(", inspectionrecordno=");
		sb.append(inspectionrecordno);
		sb.append(", inspectionRecordDate=");
		sb.append(inspectionRecordDate);
		sb.append(", attachedFileBbkt=");
		sb.append(attachedFileBbkt);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", registeredNumber=");
		sb.append(registeredNumber);
		sb.append(", inspectorSignDate=");
		sb.append(inspectorSignDate);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ViewDangKiemTimKiem toEntityModel() {
		ViewDangKiemTimKiemImpl viewDangKiemTimKiemImpl = new ViewDangKiemTimKiemImpl();

		viewDangKiemTimKiemImpl.setId(id);
		viewDangKiemTimKiemImpl.setVehicleGroupId(vehicleGroupId);
		viewDangKiemTimKiemImpl.setDebitNoteId(debitNoteId);
		viewDangKiemTimKiemImpl.setSequenceNo(sequenceNo);
		viewDangKiemTimKiemImpl.setCodeNumber(codeNumber);

		if (chassisNumber == null) {
			viewDangKiemTimKiemImpl.setChassisNumber(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setChassisNumber(chassisNumber);
		}

		if (engineNumber == null) {
			viewDangKiemTimKiemImpl.setEngineNumber(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setEngineNumber(engineNumber);
		}

		viewDangKiemTimKiemImpl.setProductionYear(productionYear);

		if (vehicleEngineStatus == null) {
			viewDangKiemTimKiemImpl.setVehicleEngineStatus(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setVehicleEngineStatus(vehicleEngineStatus);
		}

		if (vehicleColor == null) {
			viewDangKiemTimKiemImpl.setVehicleColor(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setVehicleColor(vehicleColor);
		}

		viewDangKiemTimKiemImpl.setUnitPrice(unitPrice);

		if (currency == null) {
			viewDangKiemTimKiemImpl.setCurrency(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setCurrency(currency);
		}

		if (remarks == null) {
			viewDangKiemTimKiemImpl.setRemarks(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setRemarks(remarks);
		}

		viewDangKiemTimKiemImpl.setConfirmedInspectionId(confirmedInspectionId);
		viewDangKiemTimKiemImpl.setInspectionRecordId(inspectionRecordId);
		viewDangKiemTimKiemImpl.setDraftCertificateId(draftCertificateId);
		viewDangKiemTimKiemImpl.setCertificateRecordId(certificateRecordId);
		viewDangKiemTimKiemImpl.setMarkUpStatus(markUpStatus);
		viewDangKiemTimKiemImpl.setSafeTestRequirementId(safeTestRequirementId);
		viewDangKiemTimKiemImpl.setEmissionTestRequirementId(emissionTestRequirementId);
		viewDangKiemTimKiemImpl.setControlRequirementId(controlRequirementId);
		viewDangKiemTimKiemImpl.setMarkAsSample(markAsSample);

		if (inspectionrecordno == null) {
			viewDangKiemTimKiemImpl.setInspectionrecordno(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setInspectionrecordno(inspectionrecordno);
		}

		if (inspectionRecordDate == Long.MIN_VALUE) {
			viewDangKiemTimKiemImpl.setInspectionRecordDate(null);
		}
		else {
			viewDangKiemTimKiemImpl.setInspectionRecordDate(new Date(
					inspectionRecordDate));
		}

		viewDangKiemTimKiemImpl.setAttachedFileBbkt(attachedFileBbkt);

		if (certificateNumber == null) {
			viewDangKiemTimKiemImpl.setCertificateNumber(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setCertificateNumber(certificateNumber);
		}

		if (signDate == Long.MIN_VALUE) {
			viewDangKiemTimKiemImpl.setSignDate(null);
		}
		else {
			viewDangKiemTimKiemImpl.setSignDate(new Date(signDate));
		}

		viewDangKiemTimKiemImpl.setAttachedFile(attachedFile);

		if (registeredNumber == null) {
			viewDangKiemTimKiemImpl.setRegisteredNumber(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setRegisteredNumber(registeredNumber);
		}

		if (inspectorSignDate == Long.MIN_VALUE) {
			viewDangKiemTimKiemImpl.setInspectorSignDate(null);
		}
		else {
			viewDangKiemTimKiemImpl.setInspectorSignDate(new Date(
					inspectorSignDate));
		}

		if (vehicleClass == null) {
			viewDangKiemTimKiemImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			viewDangKiemTimKiemImpl.setVehicleClass(vehicleClass);
		}

		viewDangKiemTimKiemImpl.resetOriginalValues();

		return viewDangKiemTimKiemImpl;
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
		inspectionrecordno = objectInput.readUTF();
		inspectionRecordDate = objectInput.readLong();
		attachedFileBbkt = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		signDate = objectInput.readLong();
		attachedFile = objectInput.readLong();
		registeredNumber = objectInput.readUTF();
		inspectorSignDate = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
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

		if (inspectionrecordno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionrecordno);
		}

		objectOutput.writeLong(inspectionRecordDate);
		objectOutput.writeLong(attachedFileBbkt);

		if (certificateNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		objectOutput.writeLong(signDate);
		objectOutput.writeLong(attachedFile);

		if (registeredNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registeredNumber);
		}

		objectOutput.writeLong(inspectorSignDate);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
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
	public String inspectionrecordno;
	public long inspectionRecordDate;
	public long attachedFileBbkt;
	public String certificateNumber;
	public long signDate;
	public long attachedFile;
	public String registeredNumber;
	public long inspectorSignDate;
	public String vehicleClass;
}