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

import vn.dtt.gt.dk.dao.nghiepvu.model.CopReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CopReport in entity cache.
 *
 * @author win_64
 * @see CopReport
 * @generated
 */
public class CopReportCacheModel implements CacheModel<CopReport>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", reportNumber=");
		sb.append(reportNumber);
		sb.append(", corporationId=");
		sb.append(corporationId);
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
	public CopReport toEntityModel() {
		CopReportImpl copReportImpl = new CopReportImpl();

		copReportImpl.setId(id);
		copReportImpl.setRegisteredInspectionId(registeredInspectionId);

		if (reportNumber == null) {
			copReportImpl.setReportNumber(StringPool.BLANK);
		}
		else {
			copReportImpl.setReportNumber(reportNumber);
		}

		if (corporationId == null) {
			copReportImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			copReportImpl.setCorporationId(corporationId);
		}

		if (signName == null) {
			copReportImpl.setSignName(StringPool.BLANK);
		}
		else {
			copReportImpl.setSignName(signName);
		}

		if (signTitle == null) {
			copReportImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			copReportImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			copReportImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			copReportImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			copReportImpl.setSignDate(null);
		}
		else {
			copReportImpl.setSignDate(new Date(signDate));
		}

		copReportImpl.resetOriginalValues();

		return copReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		reportNumber = objectInput.readUTF();
		corporationId = objectInput.readUTF();
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

		if (reportNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportNumber);
		}

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
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
	}

	public long id;
	public long registeredInspectionId;
	public String reportNumber;
	public String corporationId;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
}