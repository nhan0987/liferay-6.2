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

import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ControlRequirement in entity cache.
 *
 * @author huymq
 * @see ControlRequirement
 * @generated
 */
public class ControlRequirementCacheModel implements CacheModel<ControlRequirement>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", requirementNumber=");
		sb.append(requirementNumber);
		sb.append(", requirementDate=");
		sb.append(requirementDate);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", controlContent=");
		sb.append(controlContent);
		sb.append(", controlDeadline=");
		sb.append(controlDeadline);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", requirementContent=");
		sb.append(requirementContent);
		sb.append(", controlReportDeadline=");
		sb.append(controlReportDeadline);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", inspectionrecordId=");
		sb.append(inspectionrecordId);
		sb.append(", phieuxulyphuId=");
		sb.append(phieuxulyphuId);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ControlRequirement toEntityModel() {
		ControlRequirementImpl controlRequirementImpl = new ControlRequirementImpl();

		controlRequirementImpl.setId(id);
		controlRequirementImpl.setRegisteredInspectionId(registeredInspectionId);

		if (requirementNumber == null) {
			controlRequirementImpl.setRequirementNumber(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setRequirementNumber(requirementNumber);
		}

		if (requirementDate == Long.MIN_VALUE) {
			controlRequirementImpl.setRequirementDate(null);
		}
		else {
			controlRequirementImpl.setRequirementDate(new Date(requirementDate));
		}

		if (corporationId == null) {
			controlRequirementImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setCorporationId(corporationId);
		}

		if (controlContent == null) {
			controlRequirementImpl.setControlContent(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setControlContent(controlContent);
		}

		if (controlDeadline == Long.MIN_VALUE) {
			controlRequirementImpl.setControlDeadline(null);
		}
		else {
			controlRequirementImpl.setControlDeadline(new Date(controlDeadline));
		}

		controlRequirementImpl.setAttachedFile(attachedFile);

		if (requirementContent == null) {
			controlRequirementImpl.setRequirementContent(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setRequirementContent(requirementContent);
		}

		if (controlReportDeadline == Long.MIN_VALUE) {
			controlRequirementImpl.setControlReportDeadline(null);
		}
		else {
			controlRequirementImpl.setControlReportDeadline(new Date(
					controlReportDeadline));
		}

		if (remarks == null) {
			controlRequirementImpl.setRemarks(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setRemarks(remarks);
		}

		if (signName == null) {
			controlRequirementImpl.setSignName(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setSignName(signName);
		}

		if (signTitle == null) {
			controlRequirementImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			controlRequirementImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			controlRequirementImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			controlRequirementImpl.setSignDate(null);
		}
		else {
			controlRequirementImpl.setSignDate(new Date(signDate));
		}

		controlRequirementImpl.setInspectionrecordId(inspectionrecordId);
		controlRequirementImpl.setPhieuxulyphuId(phieuxulyphuId);

		if (synchdate == Long.MIN_VALUE) {
			controlRequirementImpl.setSynchdate(null);
		}
		else {
			controlRequirementImpl.setSynchdate(new Date(synchdate));
		}

		controlRequirementImpl.resetOriginalValues();

		return controlRequirementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		requirementNumber = objectInput.readUTF();
		requirementDate = objectInput.readLong();
		corporationId = objectInput.readUTF();
		controlContent = objectInput.readUTF();
		controlDeadline = objectInput.readLong();
		attachedFile = objectInput.readInt();
		requirementContent = objectInput.readUTF();
		controlReportDeadline = objectInput.readLong();
		remarks = objectInput.readUTF();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		inspectionrecordId = objectInput.readLong();
		phieuxulyphuId = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(registeredInspectionId);

		if (requirementNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requirementNumber);
		}

		objectOutput.writeLong(requirementDate);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		if (controlContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(controlContent);
		}

		objectOutput.writeLong(controlDeadline);
		objectOutput.writeInt(attachedFile);

		if (requirementContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requirementContent);
		}

		objectOutput.writeLong(controlReportDeadline);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
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
		objectOutput.writeLong(inspectionrecordId);
		objectOutput.writeLong(phieuxulyphuId);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long registeredInspectionId;
	public String requirementNumber;
	public long requirementDate;
	public String corporationId;
	public String controlContent;
	public long controlDeadline;
	public int attachedFile;
	public String requirementContent;
	public long controlReportDeadline;
	public String remarks;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public long inspectionrecordId;
	public long phieuxulyphuId;
	public long synchdate;
}