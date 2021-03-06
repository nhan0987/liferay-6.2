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

import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmissionTestReport in entity cache.
 *
 * @author win_64
 * @see EmissionTestReport
 * @generated
 */
public class EmissionTestReportCacheModel implements CacheModel<EmissionTestReport>,
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
		sb.append(", emissiontestRequirementId=");
		sb.append(emissiontestRequirementId);
		sb.append(", requirementNumber=");
		sb.append(requirementNumber);
		sb.append(", reportNumber=");
		sb.append(reportNumber);
		sb.append(", description=");
		sb.append(description);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", phieuxulyphuId=");
		sb.append(phieuxulyphuId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmissionTestReport toEntityModel() {
		EmissionTestReportImpl emissionTestReportImpl = new EmissionTestReportImpl();

		emissionTestReportImpl.setId(id);
		emissionTestReportImpl.setRegisteredInspectionId(registeredInspectionId);
		emissionTestReportImpl.setInspectionrecordId(inspectionrecordId);
		emissionTestReportImpl.setHosothutucId(hosothutucId);
		emissionTestReportImpl.setEmissiontestRequirementId(emissiontestRequirementId);

		if (requirementNumber == null) {
			emissionTestReportImpl.setRequirementNumber(StringPool.BLANK);
		}
		else {
			emissionTestReportImpl.setRequirementNumber(requirementNumber);
		}

		if (reportNumber == null) {
			emissionTestReportImpl.setReportNumber(StringPool.BLANK);
		}
		else {
			emissionTestReportImpl.setReportNumber(reportNumber);
		}

		if (description == null) {
			emissionTestReportImpl.setDescription(StringPool.BLANK);
		}
		else {
			emissionTestReportImpl.setDescription(description);
		}

		emissionTestReportImpl.setAttachedFile(attachedFile);
		emissionTestReportImpl.setPhieuxulyphuId(phieuxulyphuId);
		emissionTestReportImpl.setConfirmedResult(confirmedResult);

		if (signName == null) {
			emissionTestReportImpl.setSignName(StringPool.BLANK);
		}
		else {
			emissionTestReportImpl.setSignName(signName);
		}

		if (signTitle == null) {
			emissionTestReportImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			emissionTestReportImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			emissionTestReportImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			emissionTestReportImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			emissionTestReportImpl.setSignDate(null);
		}
		else {
			emissionTestReportImpl.setSignDate(new Date(signDate));
		}

		emissionTestReportImpl.resetOriginalValues();

		return emissionTestReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		inspectionrecordId = objectInput.readLong();
		hosothutucId = objectInput.readLong();
		emissiontestRequirementId = objectInput.readLong();
		requirementNumber = objectInput.readUTF();
		reportNumber = objectInput.readUTF();
		description = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		phieuxulyphuId = objectInput.readLong();
		confirmedResult = objectInput.readLong();
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
		objectOutput.writeLong(emissiontestRequirementId);

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

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(attachedFile);
		objectOutput.writeLong(phieuxulyphuId);
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
	}

	public long id;
	public long registeredInspectionId;
	public long inspectionrecordId;
	public long hosothutucId;
	public long emissiontestRequirementId;
	public String requirementNumber;
	public String reportNumber;
	public String description;
	public long attachedFile;
	public long phieuxulyphuId;
	public long confirmedResult;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
}