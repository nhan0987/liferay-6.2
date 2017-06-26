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

import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SafetyTestRequest in entity cache.
 *
 * @author win_64
 * @see SafetyTestRequest
 * @generated
 */
public class SafetyTestRequestCacheModel implements CacheModel<SafetyTestRequest>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", confirmedInspectionId=");
		sb.append(confirmedInspectionId);
		sb.append(", requestNumber=");
		sb.append(requestNumber);
		sb.append(", testContent=");
		sb.append(testContent);
		sb.append(", testTimeAndPlace=");
		sb.append(testTimeAndPlace);
		sb.append(", testPayment=");
		sb.append(testPayment);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", corporationName=");
		sb.append(corporationName);
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
	public SafetyTestRequest toEntityModel() {
		SafetyTestRequestImpl safetyTestRequestImpl = new SafetyTestRequestImpl();

		safetyTestRequestImpl.setId(id);
		safetyTestRequestImpl.setConfirmedInspectionId(confirmedInspectionId);

		if (requestNumber == null) {
			safetyTestRequestImpl.setRequestNumber(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setRequestNumber(requestNumber);
		}

		if (testContent == null) {
			safetyTestRequestImpl.setTestContent(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setTestContent(testContent);
		}

		if (testTimeAndPlace == null) {
			safetyTestRequestImpl.setTestTimeAndPlace(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setTestTimeAndPlace(testTimeAndPlace);
		}

		if (testPayment == null) {
			safetyTestRequestImpl.setTestPayment(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setTestPayment(testPayment);
		}

		if (remarks == null) {
			safetyTestRequestImpl.setRemarks(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setRemarks(remarks);
		}

		if (corporationName == null) {
			safetyTestRequestImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setCorporationName(corporationName);
		}

		safetyTestRequestImpl.setAttachedFile(attachedFile);

		if (signName == null) {
			safetyTestRequestImpl.setSignName(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setSignName(signName);
		}

		if (signTitle == null) {
			safetyTestRequestImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			safetyTestRequestImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			safetyTestRequestImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			safetyTestRequestImpl.setSignDate(null);
		}
		else {
			safetyTestRequestImpl.setSignDate(new Date(signDate));
		}

		safetyTestRequestImpl.resetOriginalValues();

		return safetyTestRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		confirmedInspectionId = objectInput.readLong();
		requestNumber = objectInput.readUTF();
		testContent = objectInput.readUTF();
		testTimeAndPlace = objectInput.readUTF();
		testPayment = objectInput.readUTF();
		remarks = objectInput.readUTF();
		corporationName = objectInput.readUTF();
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

		if (testContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testContent);
		}

		if (testTimeAndPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testTimeAndPlace);
		}

		if (testPayment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testPayment);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
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
	public String testContent;
	public String testTimeAndPlace;
	public String testPayment;
	public String remarks;
	public String corporationName;
	public long attachedFile;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
}