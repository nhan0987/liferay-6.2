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

import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmissionTestRequirement in entity cache.
 *
 * @author win_64
 * @see EmissionTestRequirement
 * @generated
 */
public class EmissionTestRequirementCacheModel implements CacheModel<EmissionTestRequirement>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

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
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmissionTestRequirement toEntityModel() {
		EmissionTestRequirementImpl emissionTestRequirementImpl = new EmissionTestRequirementImpl();

		emissionTestRequirementImpl.setId(id);
		emissionTestRequirementImpl.setRegisteredInspectionId(registeredInspectionId);
		emissionTestRequirementImpl.setInspectionRecordId(inspectionRecordId);

		if (requirementNumber == null) {
			emissionTestRequirementImpl.setRequirementNumber(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setRequirementNumber(requirementNumber);
		}

		if (contentOfRequest == null) {
			emissionTestRequirementImpl.setContentOfRequest(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setContentOfRequest(contentOfRequest);
		}

		if (testingRegisteredPlace == null) {
			emissionTestRequirementImpl.setTestingRegisteredPlace(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setTestingRegisteredPlace(testingRegisteredPlace);
		}

		if (testingRegistration == null) {
			emissionTestRequirementImpl.setTestingRegistration(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setTestingRegistration(testingRegistration);
		}

		if (testingPaymentCondition == null) {
			emissionTestRequirementImpl.setTestingPaymentCondition(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setTestingPaymentCondition(testingPaymentCondition);
		}

		if (remarks == null) {
			emissionTestRequirementImpl.setRemarks(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setRemarks(remarks);
		}

		if (corporationId == null) {
			emissionTestRequirementImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setCorporationId(corporationId);
		}

		if (signName == null) {
			emissionTestRequirementImpl.setSignName(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setSignName(signName);
		}

		if (signTitle == null) {
			emissionTestRequirementImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			emissionTestRequirementImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			emissionTestRequirementImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			emissionTestRequirementImpl.setSignDate(null);
		}
		else {
			emissionTestRequirementImpl.setSignDate(new Date(signDate));
		}

		emissionTestRequirementImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);
		emissionTestRequirementImpl.setAttachedFile(attachedFile);

		emissionTestRequirementImpl.resetOriginalValues();

		return emissionTestRequirementImpl;
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
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		phieuXuLyPhuId = objectInput.readLong();
		attachedFile = objectInput.readLong();
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
		objectOutput.writeLong(attachedFile);
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
	public String signName;
	public String signTitle;
	public String signPlace;
	public long signDate;
	public long phieuXuLyPhuId;
	public long attachedFile;
}