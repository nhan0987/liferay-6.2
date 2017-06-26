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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CertificateRecord in entity cache.
 *
 * @author huymq
 * @see CertificateRecord
 * @generated
 */
public class CertificateRecordCacheModel implements CacheModel<CertificateRecord>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(id);
		sb.append(", certificateType=");
		sb.append(certificateType);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", editorName=");
		sb.append(editorName);
		sb.append(", inspectionReportId=");
		sb.append(inspectionReportId);
		sb.append(", safetyTestReportId=");
		sb.append(safetyTestReportId);
		sb.append(", emissionTestReportId=");
		sb.append(emissionTestReportId);
		sb.append(", copReportId=");
		sb.append(copReportId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", oldCertificateNumber=");
		sb.append(oldCertificateNumber);
		sb.append(", reason=");
		sb.append(reason);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", division=");
		sb.append(division);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", digitalIssued=");
		sb.append(digitalIssued);
		sb.append(", stampStatus=");
		sb.append(stampStatus);
		sb.append(", commentInWrongCase=");
		sb.append(commentInWrongCase);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CertificateRecord toEntityModel() {
		CertificateRecordImpl certificateRecordImpl = new CertificateRecordImpl();

		certificateRecordImpl.setId(id);
		certificateRecordImpl.setCertificateType(certificateType);

		if (certificateNumber == null) {
			certificateRecordImpl.setCertificateNumber(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setCertificateNumber(certificateNumber);
		}

		certificateRecordImpl.setAttachedFile(attachedFile);

		if (createdDate == Long.MIN_VALUE) {
			certificateRecordImpl.setCreatedDate(null);
		}
		else {
			certificateRecordImpl.setCreatedDate(new Date(createdDate));
		}

		if (editorName == null) {
			certificateRecordImpl.setEditorName(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setEditorName(editorName);
		}

		certificateRecordImpl.setInspectionReportId(inspectionReportId);
		certificateRecordImpl.setSafetyTestReportId(safetyTestReportId);
		certificateRecordImpl.setEmissionTestReportId(emissionTestReportId);
		certificateRecordImpl.setCopReportId(copReportId);
		certificateRecordImpl.setDossierId(dossierId);

		if (oldCertificateNumber == null) {
			certificateRecordImpl.setOldCertificateNumber(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setOldCertificateNumber(oldCertificateNumber);
		}

		if (reason == null) {
			certificateRecordImpl.setReason(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setReason(reason);
		}

		if (remarks == null) {
			certificateRecordImpl.setRemarks(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setRemarks(remarks);
		}

		if (organization == null) {
			certificateRecordImpl.setOrganization(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setOrganization(organization);
		}

		if (division == null) {
			certificateRecordImpl.setDivision(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setDivision(division);
		}

		if (signName == null) {
			certificateRecordImpl.setSignName(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setSignName(signName);
		}

		if (signTitle == null) {
			certificateRecordImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			certificateRecordImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			certificateRecordImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			certificateRecordImpl.setSignDate(null);
		}
		else {
			certificateRecordImpl.setSignDate(new Date(signDate));
		}

		certificateRecordImpl.setDigitalIssued(digitalIssued);
		certificateRecordImpl.setStampStatus(stampStatus);
		certificateRecordImpl.setCommentInWrongCase(commentInWrongCase);

		if (synchdate == Long.MIN_VALUE) {
			certificateRecordImpl.setSynchdate(null);
		}
		else {
			certificateRecordImpl.setSynchdate(new Date(synchdate));
		}

		certificateRecordImpl.resetOriginalValues();

		return certificateRecordImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		certificateType = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		createdDate = objectInput.readLong();
		editorName = objectInput.readUTF();
		inspectionReportId = objectInput.readLong();
		safetyTestReportId = objectInput.readLong();
		emissionTestReportId = objectInput.readLong();
		copReportId = objectInput.readLong();
		dossierId = objectInput.readLong();
		oldCertificateNumber = objectInput.readUTF();
		reason = objectInput.readUTF();
		remarks = objectInput.readUTF();
		organization = objectInput.readUTF();
		division = objectInput.readUTF();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		digitalIssued = objectInput.readLong();
		stampStatus = objectInput.readLong();
		commentInWrongCase = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(certificateType);

		if (certificateNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		objectOutput.writeLong(attachedFile);
		objectOutput.writeLong(createdDate);

		if (editorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(editorName);
		}

		objectOutput.writeLong(inspectionReportId);
		objectOutput.writeLong(safetyTestReportId);
		objectOutput.writeLong(emissionTestReportId);
		objectOutput.writeLong(copReportId);
		objectOutput.writeLong(dossierId);

		if (oldCertificateNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oldCertificateNumber);
		}

		if (reason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reason);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (organization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organization);
		}

		if (division == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(division);
		}

		if (signName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signName);
		}

		if (signTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signTitle);
		}

		if (signPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signPlace);
		}

		objectOutput.writeLong(signDate);
		objectOutput.writeLong(digitalIssued);
		objectOutput.writeLong(stampStatus);
		objectOutput.writeLong(commentInWrongCase);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long certificateType;
	public String certificateNumber;
	public long attachedFile;
	public long createdDate;
	public String editorName;
	public long inspectionReportId;
	public long safetyTestReportId;
	public long emissionTestReportId;
	public long copReportId;
	public long dossierId;
	public String oldCertificateNumber;
	public String reason;
	public String remarks;
	public String organization;
	public String division;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public long digitalIssued;
	public long stampStatus;
	public long commentInWrongCase;
	public long synchdate;
}