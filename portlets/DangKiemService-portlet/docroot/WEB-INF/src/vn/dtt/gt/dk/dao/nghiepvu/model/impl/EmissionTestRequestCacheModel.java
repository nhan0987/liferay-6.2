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

import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmissionTestRequest in entity cache.
 *
 * @author huymq
 * @see EmissionTestRequest
 * @generated
 */
public class EmissionTestRequestCacheModel implements CacheModel<EmissionTestRequest>,
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
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmissionTestRequest toEntityModel() {
		EmissionTestRequestImpl emissionTestRequestImpl = new EmissionTestRequestImpl();

		emissionTestRequestImpl.setId(id);
		emissionTestRequestImpl.setConfirmedInspectionId(confirmedInspectionId);

		if (requestNumber == null) {
			emissionTestRequestImpl.setRequestNumber(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setRequestNumber(requestNumber);
		}

		if (testTimeAndPlace == null) {
			emissionTestRequestImpl.setTestTimeAndPlace(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setTestTimeAndPlace(testTimeAndPlace);
		}

		if (testPayment == null) {
			emissionTestRequestImpl.setTestPayment(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setTestPayment(testPayment);
		}

		if (remarks == null) {
			emissionTestRequestImpl.setRemarks(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setRemarks(remarks);
		}

		if (corporationName == null) {
			emissionTestRequestImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setCorporationName(corporationName);
		}

		emissionTestRequestImpl.setAttachedFile(attachedFile);

		if (signName == null) {
			emissionTestRequestImpl.setSignName(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setSignName(signName);
		}

		if (signTitle == null) {
			emissionTestRequestImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			emissionTestRequestImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			emissionTestRequestImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			emissionTestRequestImpl.setSignDate(null);
		}
		else {
			emissionTestRequestImpl.setSignDate(new Date(signDate));
		}

		if (synchdate == Long.MIN_VALUE) {
			emissionTestRequestImpl.setSynchdate(null);
		}
		else {
			emissionTestRequestImpl.setSynchdate(new Date(synchdate));
		}

		emissionTestRequestImpl.resetOriginalValues();

		return emissionTestRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		confirmedInspectionId = objectInput.readLong();
		requestNumber = objectInput.readUTF();
		testTimeAndPlace = objectInput.readUTF();
		testPayment = objectInput.readUTF();
		remarks = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		synchdate = objectInput.readLong();
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
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long confirmedInspectionId;
	public String requestNumber;
	public String testTimeAndPlace;
	public String testPayment;
	public String remarks;
	public String corporationName;
	public long attachedFile;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public long synchdate;
}