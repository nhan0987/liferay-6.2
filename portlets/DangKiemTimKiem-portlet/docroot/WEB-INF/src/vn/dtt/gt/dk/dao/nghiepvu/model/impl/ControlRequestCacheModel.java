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

import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ControlRequest in entity cache.
 *
 * @author win_64
 * @see ControlRequest
 * @generated
 */
public class ControlRequestCacheModel implements CacheModel<ControlRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", confirmedInspectionId=");
		sb.append(confirmedInspectionId);
		sb.append(", requestNumber=");
		sb.append(requestNumber);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", controlContent=");
		sb.append(controlContent);
		sb.append(", controlDeadLine=");
		sb.append(controlDeadLine);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
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
	public ControlRequest toEntityModel() {
		ControlRequestImpl controlRequestImpl = new ControlRequestImpl();

		controlRequestImpl.setId(id);
		controlRequestImpl.setConfirmedInspectionId(confirmedInspectionId);

		if (requestNumber == null) {
			controlRequestImpl.setRequestNumber(StringPool.BLANK);
		}
		else {
			controlRequestImpl.setRequestNumber(requestNumber);
		}

		if (corporationName == null) {
			controlRequestImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			controlRequestImpl.setCorporationName(corporationName);
		}

		if (controlContent == null) {
			controlRequestImpl.setControlContent(StringPool.BLANK);
		}
		else {
			controlRequestImpl.setControlContent(controlContent);
		}

		if (controlDeadLine == Long.MIN_VALUE) {
			controlRequestImpl.setControlDeadLine(null);
		}
		else {
			controlRequestImpl.setControlDeadLine(new Date(controlDeadLine));
		}

		if (remarks == null) {
			controlRequestImpl.setRemarks(StringPool.BLANK);
		}
		else {
			controlRequestImpl.setRemarks(remarks);
		}

		controlRequestImpl.setAttachedFile(attachedFile);

		if (signName == null) {
			controlRequestImpl.setSignName(StringPool.BLANK);
		}
		else {
			controlRequestImpl.setSignName(signName);
		}

		if (signTitle == null) {
			controlRequestImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			controlRequestImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			controlRequestImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			controlRequestImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			controlRequestImpl.setSignDate(null);
		}
		else {
			controlRequestImpl.setSignDate(new Date(signDate));
		}

		controlRequestImpl.resetOriginalValues();

		return controlRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		confirmedInspectionId = objectInput.readLong();
		requestNumber = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		controlContent = objectInput.readUTF();
		controlDeadLine = objectInput.readLong();
		remarks = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(confirmedInspectionId);

		if (requestNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestNumber);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		if (controlContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(controlContent);
		}

		objectOutput.writeLong(controlDeadLine);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(attachedFile);

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
	public long confirmedInspectionId;
	public String requestNumber;
	public String corporationName;
	public String controlContent;
	public long controlDeadLine;
	public String remarks;
	public long attachedFile;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
}