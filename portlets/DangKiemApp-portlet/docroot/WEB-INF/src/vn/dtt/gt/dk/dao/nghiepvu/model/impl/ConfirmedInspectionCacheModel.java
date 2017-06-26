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

import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConfirmedInspection in entity cache.
 *
 * @author win_64
 * @see ConfirmedInspection
 * @generated
 */
public class ConfirmedInspectionCacheModel implements CacheModel<ConfirmedInspection>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", customsDeclarationId=");
		sb.append(customsDeclarationId);
		sb.append(", confirmationCode=");
		sb.append(confirmationCode);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", inspectionDate=");
		sb.append(inspectionDate);
		sb.append(", inspectionSite=");
		sb.append(inspectionSite);
		sb.append(", inspectionDistrictCode=");
		sb.append(inspectionDistrictCode);
		sb.append(", inspectionProvincecode=");
		sb.append(inspectionProvincecode);
		sb.append(", customsRegion=");
		sb.append(customsRegion);
		sb.append(", markasChangedSite=");
		sb.append(markasChangedSite);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", contactPhone=");
		sb.append(contactPhone);
		sb.append(", contactEmail=");
		sb.append(contactEmail);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", phieuXuLyPhuId=");
		sb.append(phieuXuLyPhuId);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", dateFrom=");
		sb.append(dateFrom);
		sb.append(", dateTo=");
		sb.append(dateTo);
		sb.append(", leader=");
		sb.append(leader);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConfirmedInspection toEntityModel() {
		ConfirmedInspectionImpl confirmedInspectionImpl = new ConfirmedInspectionImpl();

		confirmedInspectionImpl.setId(id);
		confirmedInspectionImpl.setRegisteredInspectionId(registeredInspectionId);
		confirmedInspectionImpl.setCustomsDeclarationId(customsDeclarationId);
		confirmedInspectionImpl.setConfirmationCode(confirmationCode);
		confirmedInspectionImpl.setAttachedFile(attachedFile);

		if (inspectionDate == Long.MIN_VALUE) {
			confirmedInspectionImpl.setInspectionDate(null);
		}
		else {
			confirmedInspectionImpl.setInspectionDate(new Date(inspectionDate));
		}

		if (inspectionSite == null) {
			confirmedInspectionImpl.setInspectionSite(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setInspectionSite(inspectionSite);
		}

		if (inspectionDistrictCode == null) {
			confirmedInspectionImpl.setInspectionDistrictCode(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setInspectionDistrictCode(inspectionDistrictCode);
		}

		if (inspectionProvincecode == null) {
			confirmedInspectionImpl.setInspectionProvincecode(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setInspectionProvincecode(inspectionProvincecode);
		}

		confirmedInspectionImpl.setCustomsRegion(customsRegion);
		confirmedInspectionImpl.setMarkasChangedSite(markasChangedSite);

		if (contactName == null) {
			confirmedInspectionImpl.setContactName(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setContactName(contactName);
		}

		if (contactPhone == null) {
			confirmedInspectionImpl.setContactPhone(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setContactPhone(contactPhone);
		}

		if (contactEmail == null) {
			confirmedInspectionImpl.setContactEmail(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setContactEmail(contactEmail);
		}

		if (signName == null) {
			confirmedInspectionImpl.setSignName(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setSignName(signName);
		}

		if (signTitle == null) {
			confirmedInspectionImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			confirmedInspectionImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			confirmedInspectionImpl.setSignDate(null);
		}
		else {
			confirmedInspectionImpl.setSignDate(new Date(signDate));
		}

		if (remarks == null) {
			confirmedInspectionImpl.setRemarks(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setRemarks(remarks);
		}

		if (corporationId == null) {
			confirmedInspectionImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			confirmedInspectionImpl.setCorporationId(corporationId);
		}

		confirmedInspectionImpl.setInspectorId(inspectorId);
		confirmedInspectionImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);
		confirmedInspectionImpl.setHoSoThuTucId(hoSoThuTucId);

		if (dateFrom == Long.MIN_VALUE) {
			confirmedInspectionImpl.setDateFrom(null);
		}
		else {
			confirmedInspectionImpl.setDateFrom(new Date(dateFrom));
		}

		if (dateTo == Long.MIN_VALUE) {
			confirmedInspectionImpl.setDateTo(null);
		}
		else {
			confirmedInspectionImpl.setDateTo(new Date(dateTo));
		}

		confirmedInspectionImpl.setLeader(leader);

		confirmedInspectionImpl.resetOriginalValues();

		return confirmedInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		customsDeclarationId = objectInput.readLong();
		confirmationCode = objectInput.readLong();
		attachedFile = objectInput.readLong();
		inspectionDate = objectInput.readLong();
		inspectionSite = objectInput.readUTF();
		inspectionDistrictCode = objectInput.readUTF();
		inspectionProvincecode = objectInput.readUTF();
		customsRegion = objectInput.readLong();
		markasChangedSite = objectInput.readLong();
		contactName = objectInput.readUTF();
		contactPhone = objectInput.readUTF();
		contactEmail = objectInput.readUTF();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		remarks = objectInput.readUTF();
		corporationId = objectInput.readUTF();
		inspectorId = objectInput.readLong();
		phieuXuLyPhuId = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		dateFrom = objectInput.readLong();
		dateTo = objectInput.readLong();
		leader = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(registeredInspectionId);
		objectOutput.writeLong(customsDeclarationId);
		objectOutput.writeLong(confirmationCode);
		objectOutput.writeLong(attachedFile);
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

		if (inspectionProvincecode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionProvincecode);
		}

		objectOutput.writeLong(customsRegion);
		objectOutput.writeLong(markasChangedSite);

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

		if (contactEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactEmail);
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

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		objectOutput.writeLong(inspectorId);
		objectOutput.writeLong(phieuXuLyPhuId);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(dateFrom);
		objectOutput.writeLong(dateTo);
		objectOutput.writeInt(leader);
	}

	public long id;
	public long registeredInspectionId;
	public long customsDeclarationId;
	public long confirmationCode;
	public long attachedFile;
	public long inspectionDate;
	public String inspectionSite;
	public String inspectionDistrictCode;
	public String inspectionProvincecode;
	public long customsRegion;
	public long markasChangedSite;
	public String contactName;
	public String contactPhone;
	public String contactEmail;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public String remarks;
	public String corporationId;
	public long inspectorId;
	public long phieuXuLyPhuId;
	public long hoSoThuTucId;
	public long dateFrom;
	public long dateTo;
	public int leader;
}