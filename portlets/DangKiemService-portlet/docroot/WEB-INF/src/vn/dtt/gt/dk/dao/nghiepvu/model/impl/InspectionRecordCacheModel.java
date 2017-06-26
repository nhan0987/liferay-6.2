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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InspectionRecord in entity cache.
 *
 * @author huymq
 * @see InspectionRecord
 * @generated
 */
public class InspectionRecordCacheModel implements CacheModel<InspectionRecord>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(id);
		sb.append(", inspectionRecordNo=");
		sb.append(inspectionRecordNo);
		sb.append(", inspectionRecordDate=");
		sb.append(inspectionRecordDate);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", confirmedInspectionId=");
		sb.append(confirmedInspectionId);
		sb.append(", customsDeclarationid=");
		sb.append(customsDeclarationid);
		sb.append(", inspectionSite=");
		sb.append(inspectionSite);
		sb.append(", inspectionDateFrom=");
		sb.append(inspectionDateFrom);
		sb.append(", inspectionDateTo=");
		sb.append(inspectionDateTo);
		sb.append(", inspectionMode=");
		sb.append(inspectionMode);
		sb.append(", description=");
		sb.append(description);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", confirmedResult=");
		sb.append(confirmedResult);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", phieuXuLyPhuId=");
		sb.append(phieuXuLyPhuId);
		sb.append(", markupSafeTest=");
		sb.append(markupSafeTest);
		sb.append(", markupEmissionTest=");
		sb.append(markupEmissionTest);
		sb.append(", markupControl=");
		sb.append(markupControl);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", otherCosts=");
		sb.append(otherCosts);
		sb.append(", markupPaid=");
		sb.append(markupPaid);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InspectionRecord toEntityModel() {
		InspectionRecordImpl inspectionRecordImpl = new InspectionRecordImpl();

		inspectionRecordImpl.setId(id);

		if (inspectionRecordNo == null) {
			inspectionRecordImpl.setInspectionRecordNo(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setInspectionRecordNo(inspectionRecordNo);
		}

		if (inspectionRecordDate == Long.MIN_VALUE) {
			inspectionRecordImpl.setInspectionRecordDate(null);
		}
		else {
			inspectionRecordImpl.setInspectionRecordDate(new Date(
					inspectionRecordDate));
		}

		if (corporationId == null) {
			inspectionRecordImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setCorporationId(corporationId);
		}

		inspectionRecordImpl.setInspectorId(inspectorId);
		inspectionRecordImpl.setConfirmedInspectionId(confirmedInspectionId);
		inspectionRecordImpl.setCustomsDeclarationid(customsDeclarationid);

		if (inspectionSite == null) {
			inspectionRecordImpl.setInspectionSite(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setInspectionSite(inspectionSite);
		}

		if (inspectionDateFrom == Long.MIN_VALUE) {
			inspectionRecordImpl.setInspectionDateFrom(null);
		}
		else {
			inspectionRecordImpl.setInspectionDateFrom(new Date(
					inspectionDateFrom));
		}

		if (inspectionDateTo == Long.MIN_VALUE) {
			inspectionRecordImpl.setInspectionDateTo(null);
		}
		else {
			inspectionRecordImpl.setInspectionDateTo(new Date(inspectionDateTo));
		}

		inspectionRecordImpl.setInspectionMode(inspectionMode);

		if (description == null) {
			inspectionRecordImpl.setDescription(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setDescription(description);
		}

		inspectionRecordImpl.setAttachedFile(attachedFile);
		inspectionRecordImpl.setConfirmedResult(confirmedResult);

		if (signName == null) {
			inspectionRecordImpl.setSignName(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setSignName(signName);
		}

		if (signTitle == null) {
			inspectionRecordImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			inspectionRecordImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			inspectionRecordImpl.setSignDate(null);
		}
		else {
			inspectionRecordImpl.setSignDate(new Date(signDate));
		}

		inspectionRecordImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);
		inspectionRecordImpl.setMarkupSafeTest(markupSafeTest);
		inspectionRecordImpl.setMarkupEmissionTest(markupEmissionTest);
		inspectionRecordImpl.setMarkupControl(markupControl);
		inspectionRecordImpl.setRegisteredInspectionId(registeredInspectionId);

		if (remarks == null) {
			inspectionRecordImpl.setRemarks(StringPool.BLANK);
		}
		else {
			inspectionRecordImpl.setRemarks(remarks);
		}

		inspectionRecordImpl.setHoSoThuTucId(hoSoThuTucId);
		inspectionRecordImpl.setOtherCosts(otherCosts);
		inspectionRecordImpl.setMarkupPaid(markupPaid);

		if (synchdate == Long.MIN_VALUE) {
			inspectionRecordImpl.setSynchdate(null);
		}
		else {
			inspectionRecordImpl.setSynchdate(new Date(synchdate));
		}

		inspectionRecordImpl.resetOriginalValues();

		return inspectionRecordImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		inspectionRecordNo = objectInput.readUTF();
		inspectionRecordDate = objectInput.readLong();
		corporationId = objectInput.readUTF();
		inspectorId = objectInput.readLong();
		confirmedInspectionId = objectInput.readLong();
		customsDeclarationid = objectInput.readLong();
		inspectionSite = objectInput.readUTF();
		inspectionDateFrom = objectInput.readLong();
		inspectionDateTo = objectInput.readLong();
		inspectionMode = objectInput.readLong();
		description = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		confirmedResult = objectInput.readLong();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		phieuXuLyPhuId = objectInput.readLong();
		markupSafeTest = objectInput.readLong();
		markupEmissionTest = objectInput.readLong();
		markupControl = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		remarks = objectInput.readUTF();
		hoSoThuTucId = objectInput.readLong();
		otherCosts = objectInput.readDouble();
		markupPaid = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (inspectionRecordNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionRecordNo);
		}

		objectOutput.writeLong(inspectionRecordDate);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		objectOutput.writeLong(inspectorId);
		objectOutput.writeLong(confirmedInspectionId);
		objectOutput.writeLong(customsDeclarationid);

		if (inspectionSite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionSite);
		}

		objectOutput.writeLong(inspectionDateFrom);
		objectOutput.writeLong(inspectionDateTo);
		objectOutput.writeLong(inspectionMode);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(attachedFile);
		objectOutput.writeLong(confirmedResult);

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
		objectOutput.writeLong(phieuXuLyPhuId);
		objectOutput.writeLong(markupSafeTest);
		objectOutput.writeLong(markupEmissionTest);
		objectOutput.writeLong(markupControl);
		objectOutput.writeLong(registeredInspectionId);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeDouble(otherCosts);
		objectOutput.writeLong(markupPaid);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public String inspectionRecordNo;
	public long inspectionRecordDate;
	public String corporationId;
	public long inspectorId;
	public long confirmedInspectionId;
	public long customsDeclarationid;
	public String inspectionSite;
	public long inspectionDateFrom;
	public long inspectionDateTo;
	public long inspectionMode;
	public String description;
	public long attachedFile;
	public long confirmedResult;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public long phieuXuLyPhuId;
	public long markupSafeTest;
	public long markupEmissionTest;
	public long markupControl;
	public long registeredInspectionId;
	public String remarks;
	public long hoSoThuTucId;
	public double otherCosts;
	public long markupPaid;
	public long synchdate;
}