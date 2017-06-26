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

import vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SafetestRequirement in entity cache.
 *
 * @author huymq
 * @see SafetestRequirement
 * @generated
 */
public class SafetestRequirementCacheModel implements CacheModel<SafetestRequirement>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", inspectionRecordId=");
		sb.append(inspectionRecordId);
		sb.append(", requirementNumber=");
		sb.append(requirementNumber);
		sb.append(", contentOfRequest=");
		sb.append(contentOfRequest);
		sb.append(", testingRegisteredPlace=");
		sb.append(testingRegisteredPlace);
		sb.append(", testingRegistration=");
		sb.append(testingRegistration);
		sb.append(", testingPaymentCondition=");
		sb.append(testingPaymentCondition);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", corporationId=");
		sb.append(corporationId);
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
		sb.append(", phieuXuLyPhuId=");
		sb.append(phieuXuLyPhuId);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SafetestRequirement toEntityModel() {
		SafetestRequirementImpl safetestRequirementImpl = new SafetestRequirementImpl();

		safetestRequirementImpl.setId(id);
		safetestRequirementImpl.setRegisteredInspectionId(registeredInspectionId);
		safetestRequirementImpl.setInspectionRecordId(inspectionRecordId);

		if (requirementNumber == null) {
			safetestRequirementImpl.setRequirementNumber(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setRequirementNumber(requirementNumber);
		}

		if (contentOfRequest == null) {
			safetestRequirementImpl.setContentOfRequest(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setContentOfRequest(contentOfRequest);
		}

		if (testingRegisteredPlace == null) {
			safetestRequirementImpl.setTestingRegisteredPlace(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setTestingRegisteredPlace(testingRegisteredPlace);
		}

		if (testingRegistration == null) {
			safetestRequirementImpl.setTestingRegistration(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setTestingRegistration(testingRegistration);
		}

		if (testingPaymentCondition == null) {
			safetestRequirementImpl.setTestingPaymentCondition(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setTestingPaymentCondition(testingPaymentCondition);
		}

		if (remarks == null) {
			safetestRequirementImpl.setRemarks(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setRemarks(remarks);
		}

		if (corporationId == null) {
			safetestRequirementImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setCorporationId(corporationId);
		}

		safetestRequirementImpl.setAttachedFile(attachedFile);

		if (signName == null) {
			safetestRequirementImpl.setSignName(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setSignName(signName);
		}

		if (signTitle == null) {
			safetestRequirementImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			safetestRequirementImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			safetestRequirementImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			safetestRequirementImpl.setSignDate(null);
		}
		else {
			safetestRequirementImpl.setSignDate(new Date(signDate));
		}

		safetestRequirementImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);

		if (synchdate == Long.MIN_VALUE) {
			safetestRequirementImpl.setSynchdate(null);
		}
		else {
			safetestRequirementImpl.setSynchdate(new Date(synchdate));
		}

		safetestRequirementImpl.resetOriginalValues();

		return safetestRequirementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		inspectionRecordId = objectInput.readLong();
		requirementNumber = objectInput.readUTF();
		contentOfRequest = objectInput.readUTF();
		testingRegisteredPlace = objectInput.readUTF();
		testingRegistration = objectInput.readUTF();
		testingPaymentCondition = objectInput.readUTF();
		remarks = objectInput.readUTF();
		corporationId = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		phieuXuLyPhuId = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(registeredInspectionId);
		objectOutput.writeLong(inspectionRecordId);

		if (requirementNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requirementNumber);
		}

		if (contentOfRequest == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contentOfRequest);
		}

		if (testingRegisteredPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingRegisteredPlace);
		}

		if (testingRegistration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingRegistration);
		}

		if (testingPaymentCondition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(testingPaymentCondition);
		}

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
		objectOutput.writeLong(phieuXuLyPhuId);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long registeredInspectionId;
	public long inspectionRecordId;
	public String requirementNumber;
	public String contentOfRequest;
	public String testingRegisteredPlace;
	public String testingRegistration;
	public String testingPaymentCondition;
	public String remarks;
	public String corporationId;
	public long attachedFile;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public long phieuXuLyPhuId;
	public long synchdate;
}