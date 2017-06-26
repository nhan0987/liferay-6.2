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

import vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ControlReport in entity cache.
 *
 * @author win_64
 * @see ControlReport
 * @generated
 */
public class ControlReportCacheModel implements CacheModel<ControlReport>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", inspectionrecordId=");
		sb.append(inspectionrecordId);
		sb.append(", hosothutucId=");
		sb.append(hosothutucId);
		sb.append(", controlRequirementId=");
		sb.append(controlRequirementId);
		sb.append(", requirementNumber=");
		sb.append(requirementNumber);
		sb.append(", reportNumber=");
		sb.append(reportNumber);
		sb.append(", reportDate=");
		sb.append(reportDate);
		sb.append(", description=");
		sb.append(description);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", phieuxulyphuId=");
		sb.append(phieuxulyphuId);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ControlReport toEntityModel() {
		ControlReportImpl controlReportImpl = new ControlReportImpl();

		controlReportImpl.setId(id);
		controlReportImpl.setRegisteredInspectionId(registeredInspectionId);
		controlReportImpl.setInspectionrecordId(inspectionrecordId);
		controlReportImpl.setHosothutucId(hosothutucId);
		controlReportImpl.setControlRequirementId(controlRequirementId);

		if (requirementNumber == null) {
			controlReportImpl.setRequirementNumber(StringPool.BLANK);
		}
		else {
			controlReportImpl.setRequirementNumber(requirementNumber);
		}

		if (reportNumber == null) {
			controlReportImpl.setReportNumber(StringPool.BLANK);
		}
		else {
			controlReportImpl.setReportNumber(reportNumber);
		}

		if (reportDate == Long.MIN_VALUE) {
			controlReportImpl.setReportDate(null);
		}
		else {
			controlReportImpl.setReportDate(new Date(reportDate));
		}

		if (description == null) {
			controlReportImpl.setDescription(StringPool.BLANK);
		}
		else {
			controlReportImpl.setDescription(description);
		}

		controlReportImpl.setAttachedFile(attachedFile);
		controlReportImpl.setPhieuxulyphuId(phieuxulyphuId);

		if (signName == null) {
			controlReportImpl.setSignName(StringPool.BLANK);
		}
		else {
			controlReportImpl.setSignName(signName);
		}

		if (signTitle == null) {
			controlReportImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			controlReportImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			controlReportImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			controlReportImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			controlReportImpl.setSignDate(null);
		}
		else {
			controlReportImpl.setSignDate(new Date(signDate));
		}

		controlReportImpl.resetOriginalValues();

		return controlReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		inspectionrecordId = objectInput.readLong();
		hosothutucId = objectInput.readLong();
		controlRequirementId = objectInput.readLong();
		requirementNumber = objectInput.readUTF();
		reportNumber = objectInput.readUTF();
		reportDate = objectInput.readLong();
		description = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		phieuxulyphuId = objectInput.readLong();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(registeredInspectionId);
		objectOutput.writeLong(inspectionrecordId);
		objectOutput.writeLong(hosothutucId);
		objectOutput.writeLong(controlRequirementId);

		if (requirementNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requirementNumber);
		}

		if (reportNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportNumber);
		}

		objectOutput.writeLong(reportDate);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(attachedFile);
		objectOutput.writeLong(phieuxulyphuId);

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
	}

	public long id;
	public long registeredInspectionId;
	public long inspectionrecordId;
	public long hosothutucId;
	public long controlRequirementId;
	public String requirementNumber;
	public String reportNumber;
	public long reportDate;
	public String description;
	public long attachedFile;
	public long phieuxulyphuId;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
}