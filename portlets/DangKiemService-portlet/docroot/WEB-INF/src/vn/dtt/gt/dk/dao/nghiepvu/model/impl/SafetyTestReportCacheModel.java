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

import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SafetyTestReport in entity cache.
 *
 * @author huymq
 * @see SafetyTestReport
 * @generated
 */
public class SafetyTestReportCacheModel implements CacheModel<SafetyTestReport>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", safetestRequirementId=");
		sb.append(safetestRequirementId);
		sb.append(", reportNumber=");
		sb.append(reportNumber);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SafetyTestReport toEntityModel() {
		SafetyTestReportImpl safetyTestReportImpl = new SafetyTestReportImpl();

		safetyTestReportImpl.setId(id);
		safetyTestReportImpl.setSafetestRequirementId(safetestRequirementId);

		if (reportNumber == null) {
			safetyTestReportImpl.setReportNumber(StringPool.BLANK);
		}
		else {
			safetyTestReportImpl.setReportNumber(reportNumber);
		}

		if (description == null) {
			safetyTestReportImpl.setDescription(StringPool.BLANK);
		}
		else {
			safetyTestReportImpl.setDescription(description);
		}

		safetyTestReportImpl.setAttachedFile(attachedFile);
		safetyTestReportImpl.setConfirmedResult(confirmedResult);

		if (signName == null) {
			safetyTestReportImpl.setSignName(StringPool.BLANK);
		}
		else {
			safetyTestReportImpl.setSignName(signName);
		}

		if (signTitle == null) {
			safetyTestReportImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			safetyTestReportImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			safetyTestReportImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			safetyTestReportImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			safetyTestReportImpl.setSignDate(null);
		}
		else {
			safetyTestReportImpl.setSignDate(new Date(signDate));
		}

		safetyTestReportImpl.resetOriginalValues();

		return safetyTestReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		safetestRequirementId = objectInput.readLong();
		reportNumber = objectInput.readUTF();
		description = objectInput.readUTF();
		attachedFile = objectInput.readLong();
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
		objectOutput.writeLong(safetestRequirementId);

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
	public long safetestRequirementId;
	public String reportNumber;
	public String description;
	public long attachedFile;
	public long confirmedResult;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
}