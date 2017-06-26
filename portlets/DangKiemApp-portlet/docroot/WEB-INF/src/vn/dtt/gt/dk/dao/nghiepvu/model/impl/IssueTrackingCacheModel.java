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

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing IssueTracking in entity cache.
 *
 * @author win_64
 * @see IssueTracking
 * @generated
 */
public class IssueTrackingCacheModel implements CacheModel<IssueTracking>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(107);

		sb.append("{id=");
		sb.append(id);
		sb.append(", importercode=");
		sb.append(importercode);
		sb.append(", importername=");
		sb.append(importername);
		sb.append(", registerednumber=");
		sb.append(registerednumber);
		sb.append(", inspectionrecordno=");
		sb.append(inspectionrecordno);
		sb.append(", inspectionRecordDate=");
		sb.append(inspectionRecordDate);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", productcode=");
		sb.append(productcode);
		sb.append(", productname=");
		sb.append(productname);
		sb.append(", totalvehicle=");
		sb.append(totalvehicle);
		sb.append(", codeNumber=");
		sb.append(codeNumber);
		sb.append(", chassisNumber=");
		sb.append(chassisNumber);
		sb.append(", engineNumber=");
		sb.append(engineNumber);
		sb.append(", importedorassembled=");
		sb.append(importedorassembled);
		sb.append(", issuetrackingfromcustomer=");
		sb.append(issuetrackingfromcustomer);
		sb.append(", issuetrackingbycorporation=");
		sb.append(issuetrackingbycorporation);
		sb.append(", issuetrackingbyimportedgroup=");
		sb.append(issuetrackingbyimportedgroup);
		sb.append(", issuediscovery=");
		sb.append(issuediscovery);
		sb.append(", issuedescription=");
		sb.append(issuedescription);
		sb.append(", issueVAQ1reason=");
		sb.append(issueVAQ1reason);
		sb.append(", issueVAQ2troubleshooting=");
		sb.append(issueVAQ2troubleshooting);
		sb.append(", issueVAQ3longtermsolution=");
		sb.append(issueVAQ3longtermsolution);
		sb.append(", issueVAQ4precaution=");
		sb.append(issueVAQ4precaution);
		sb.append(", creator=");
		sb.append(creator);
		sb.append(", createddate=");
		sb.append(createddate);
		sb.append(", markupissueVAQ4=");
		sb.append(markupissueVAQ4);
		sb.append(", makerVAQ4=");
		sb.append(makerVAQ4);
		sb.append(", checkerVAQ4=");
		sb.append(checkerVAQ4);
		sb.append(", approverVAQ4=");
		sb.append(approverVAQ4);
		sb.append(", makerVAQ4modified=");
		sb.append(makerVAQ4modified);
		sb.append(", checkerVAQ4modified=");
		sb.append(checkerVAQ4modified);
		sb.append(", approverVAQ4modified=");
		sb.append(approverVAQ4modified);
		sb.append(", markupissueVAQ1=");
		sb.append(markupissueVAQ1);
		sb.append(", makerVAQ1=");
		sb.append(makerVAQ1);
		sb.append(", checkerVAQ1=");
		sb.append(checkerVAQ1);
		sb.append(", makerVAQ1modified=");
		sb.append(makerVAQ1modified);
		sb.append(", checkerVAQ1modified=");
		sb.append(checkerVAQ1modified);
		sb.append(", markupissueVAQ2=");
		sb.append(markupissueVAQ2);
		sb.append(", makerVAQ2=");
		sb.append(makerVAQ2);
		sb.append(", checkerVAQ2=");
		sb.append(checkerVAQ2);
		sb.append(", makerVAQ2modified=");
		sb.append(makerVAQ2modified);
		sb.append(", checkerVAQ2modified=");
		sb.append(checkerVAQ2modified);
		sb.append(", markupissueVAQ3=");
		sb.append(markupissueVAQ3);
		sb.append(", makerVAQ3=");
		sb.append(makerVAQ3);
		sb.append(", checkerVAQ3=");
		sb.append(checkerVAQ3);
		sb.append(", approverVAQ3=");
		sb.append(approverVAQ3);
		sb.append(", makerVAQ3modified=");
		sb.append(makerVAQ3modified);
		sb.append(", checkerVAQ3modified=");
		sb.append(checkerVAQ3modified);
		sb.append(", approverVAQ3modified=");
		sb.append(approverVAQ3modified);
		sb.append(", defectStatus=");
		sb.append(defectStatus);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public IssueTracking toEntityModel() {
		IssueTrackingImpl issueTrackingImpl = new IssueTrackingImpl();

		issueTrackingImpl.setId(id);

		if (importercode == null) {
			issueTrackingImpl.setImportercode(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setImportercode(importercode);
		}

		if (importername == null) {
			issueTrackingImpl.setImportername(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setImportername(importername);
		}

		if (registerednumber == null) {
			issueTrackingImpl.setRegisterednumber(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setRegisterednumber(registerednumber);
		}

		if (inspectionrecordno == null) {
			issueTrackingImpl.setInspectionrecordno(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setInspectionrecordno(inspectionrecordno);
		}

		if (inspectionRecordDate == Long.MIN_VALUE) {
			issueTrackingImpl.setInspectionRecordDate(null);
		}
		else {
			issueTrackingImpl.setInspectionRecordDate(new Date(
					inspectionRecordDate));
		}

		if (corporationId == null) {
			issueTrackingImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setCorporationId(corporationId);
		}

		issueTrackingImpl.setInspectorId(inspectorId);

		if (vehicleClass == null) {
			issueTrackingImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setVehicleClass(vehicleClass);
		}

		if (productcode == null) {
			issueTrackingImpl.setProductcode(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setProductcode(productcode);
		}

		if (productname == null) {
			issueTrackingImpl.setProductname(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setProductname(productname);
		}

		issueTrackingImpl.setTotalvehicle(totalvehicle);
		issueTrackingImpl.setCodeNumber(codeNumber);

		if (chassisNumber == null) {
			issueTrackingImpl.setChassisNumber(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setChassisNumber(chassisNumber);
		}

		if (engineNumber == null) {
			issueTrackingImpl.setEngineNumber(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setEngineNumber(engineNumber);
		}

		if (importedorassembled == null) {
			issueTrackingImpl.setImportedorassembled(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setImportedorassembled(importedorassembled);
		}

		if (issuetrackingfromcustomer == null) {
			issueTrackingImpl.setIssuetrackingfromcustomer(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssuetrackingfromcustomer(issuetrackingfromcustomer);
		}

		if (issuetrackingbycorporation == null) {
			issueTrackingImpl.setIssuetrackingbycorporation(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssuetrackingbycorporation(issuetrackingbycorporation);
		}

		if (issuetrackingbyimportedgroup == null) {
			issueTrackingImpl.setIssuetrackingbyimportedgroup(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssuetrackingbyimportedgroup(issuetrackingbyimportedgroup);
		}

		issueTrackingImpl.setIssuediscovery(issuediscovery);

		if (issuedescription == null) {
			issueTrackingImpl.setIssuedescription(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssuedescription(issuedescription);
		}

		if (issueVAQ1reason == null) {
			issueTrackingImpl.setIssueVAQ1reason(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssueVAQ1reason(issueVAQ1reason);
		}

		if (issueVAQ2troubleshooting == null) {
			issueTrackingImpl.setIssueVAQ2troubleshooting(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssueVAQ2troubleshooting(issueVAQ2troubleshooting);
		}

		if (issueVAQ3longtermsolution == null) {
			issueTrackingImpl.setIssueVAQ3longtermsolution(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssueVAQ3longtermsolution(issueVAQ3longtermsolution);
		}

		if (issueVAQ4precaution == null) {
			issueTrackingImpl.setIssueVAQ4precaution(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setIssueVAQ4precaution(issueVAQ4precaution);
		}

		if (creator == null) {
			issueTrackingImpl.setCreator(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setCreator(creator);
		}

		if (createddate == Long.MIN_VALUE) {
			issueTrackingImpl.setCreateddate(null);
		}
		else {
			issueTrackingImpl.setCreateddate(new Date(createddate));
		}

		issueTrackingImpl.setMarkupissueVAQ4(markupissueVAQ4);

		if (makerVAQ4 == null) {
			issueTrackingImpl.setMakerVAQ4(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setMakerVAQ4(makerVAQ4);
		}

		if (checkerVAQ4 == null) {
			issueTrackingImpl.setCheckerVAQ4(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setCheckerVAQ4(checkerVAQ4);
		}

		if (approverVAQ4 == null) {
			issueTrackingImpl.setApproverVAQ4(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setApproverVAQ4(approverVAQ4);
		}

		if (makerVAQ4modified == Long.MIN_VALUE) {
			issueTrackingImpl.setMakerVAQ4modified(null);
		}
		else {
			issueTrackingImpl.setMakerVAQ4modified(new Date(makerVAQ4modified));
		}

		if (checkerVAQ4modified == Long.MIN_VALUE) {
			issueTrackingImpl.setCheckerVAQ4modified(null);
		}
		else {
			issueTrackingImpl.setCheckerVAQ4modified(new Date(
					checkerVAQ4modified));
		}

		if (approverVAQ4modified == Long.MIN_VALUE) {
			issueTrackingImpl.setApproverVAQ4modified(null);
		}
		else {
			issueTrackingImpl.setApproverVAQ4modified(new Date(
					approverVAQ4modified));
		}

		issueTrackingImpl.setMarkupissueVAQ1(markupissueVAQ1);

		if (makerVAQ1 == null) {
			issueTrackingImpl.setMakerVAQ1(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setMakerVAQ1(makerVAQ1);
		}

		if (checkerVAQ1 == null) {
			issueTrackingImpl.setCheckerVAQ1(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setCheckerVAQ1(checkerVAQ1);
		}

		if (makerVAQ1modified == Long.MIN_VALUE) {
			issueTrackingImpl.setMakerVAQ1modified(null);
		}
		else {
			issueTrackingImpl.setMakerVAQ1modified(new Date(makerVAQ1modified));
		}

		if (checkerVAQ1modified == Long.MIN_VALUE) {
			issueTrackingImpl.setCheckerVAQ1modified(null);
		}
		else {
			issueTrackingImpl.setCheckerVAQ1modified(new Date(
					checkerVAQ1modified));
		}

		issueTrackingImpl.setMarkupissueVAQ2(markupissueVAQ2);

		if (makerVAQ2 == null) {
			issueTrackingImpl.setMakerVAQ2(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setMakerVAQ2(makerVAQ2);
		}

		if (checkerVAQ2 == null) {
			issueTrackingImpl.setCheckerVAQ2(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setCheckerVAQ2(checkerVAQ2);
		}

		if (makerVAQ2modified == Long.MIN_VALUE) {
			issueTrackingImpl.setMakerVAQ2modified(null);
		}
		else {
			issueTrackingImpl.setMakerVAQ2modified(new Date(makerVAQ2modified));
		}

		if (checkerVAQ2modified == Long.MIN_VALUE) {
			issueTrackingImpl.setCheckerVAQ2modified(null);
		}
		else {
			issueTrackingImpl.setCheckerVAQ2modified(new Date(
					checkerVAQ2modified));
		}

		issueTrackingImpl.setMarkupissueVAQ3(markupissueVAQ3);

		if (makerVAQ3 == null) {
			issueTrackingImpl.setMakerVAQ3(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setMakerVAQ3(makerVAQ3);
		}

		if (checkerVAQ3 == null) {
			issueTrackingImpl.setCheckerVAQ3(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setCheckerVAQ3(checkerVAQ3);
		}

		if (approverVAQ3 == null) {
			issueTrackingImpl.setApproverVAQ3(StringPool.BLANK);
		}
		else {
			issueTrackingImpl.setApproverVAQ3(approverVAQ3);
		}

		if (makerVAQ3modified == Long.MIN_VALUE) {
			issueTrackingImpl.setMakerVAQ3modified(null);
		}
		else {
			issueTrackingImpl.setMakerVAQ3modified(new Date(makerVAQ3modified));
		}

		if (checkerVAQ3modified == Long.MIN_VALUE) {
			issueTrackingImpl.setCheckerVAQ3modified(null);
		}
		else {
			issueTrackingImpl.setCheckerVAQ3modified(new Date(
					checkerVAQ3modified));
		}

		if (approverVAQ3modified == Long.MIN_VALUE) {
			issueTrackingImpl.setApproverVAQ3modified(null);
		}
		else {
			issueTrackingImpl.setApproverVAQ3modified(new Date(
					approverVAQ3modified));
		}

		issueTrackingImpl.setDefectStatus(defectStatus);

		if (synchdate == Long.MIN_VALUE) {
			issueTrackingImpl.setSynchdate(null);
		}
		else {
			issueTrackingImpl.setSynchdate(new Date(synchdate));
		}

		issueTrackingImpl.resetOriginalValues();

		return issueTrackingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		importercode = objectInput.readUTF();
		importername = objectInput.readUTF();
		registerednumber = objectInput.readUTF();
		inspectionrecordno = objectInput.readUTF();
		inspectionRecordDate = objectInput.readLong();
		corporationId = objectInput.readUTF();
		inspectorId = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		productcode = objectInput.readUTF();
		productname = objectInput.readUTF();
		totalvehicle = objectInput.readLong();
		codeNumber = objectInput.readLong();
		chassisNumber = objectInput.readUTF();
		engineNumber = objectInput.readUTF();
		importedorassembled = objectInput.readUTF();
		issuetrackingfromcustomer = objectInput.readUTF();
		issuetrackingbycorporation = objectInput.readUTF();
		issuetrackingbyimportedgroup = objectInput.readUTF();
		issuediscovery = objectInput.readLong();
		issuedescription = objectInput.readUTF();
		issueVAQ1reason = objectInput.readUTF();
		issueVAQ2troubleshooting = objectInput.readUTF();
		issueVAQ3longtermsolution = objectInput.readUTF();
		issueVAQ4precaution = objectInput.readUTF();
		creator = objectInput.readUTF();
		createddate = objectInput.readLong();
		markupissueVAQ4 = objectInput.readInt();
		makerVAQ4 = objectInput.readUTF();
		checkerVAQ4 = objectInput.readUTF();
		approverVAQ4 = objectInput.readUTF();
		makerVAQ4modified = objectInput.readLong();
		checkerVAQ4modified = objectInput.readLong();
		approverVAQ4modified = objectInput.readLong();
		markupissueVAQ1 = objectInput.readInt();
		makerVAQ1 = objectInput.readUTF();
		checkerVAQ1 = objectInput.readUTF();
		makerVAQ1modified = objectInput.readLong();
		checkerVAQ1modified = objectInput.readLong();
		markupissueVAQ2 = objectInput.readInt();
		makerVAQ2 = objectInput.readUTF();
		checkerVAQ2 = objectInput.readUTF();
		makerVAQ2modified = objectInput.readLong();
		checkerVAQ2modified = objectInput.readLong();
		markupissueVAQ3 = objectInput.readInt();
		makerVAQ3 = objectInput.readUTF();
		checkerVAQ3 = objectInput.readUTF();
		approverVAQ3 = objectInput.readUTF();
		makerVAQ3modified = objectInput.readLong();
		checkerVAQ3modified = objectInput.readLong();
		approverVAQ3modified = objectInput.readLong();
		defectStatus = objectInput.readInt();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (importercode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importercode);
		}

		if (importername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importername);
		}

		if (registerednumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registerednumber);
		}

		if (inspectionrecordno == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionrecordno);
		}

		objectOutput.writeLong(inspectionRecordDate);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		objectOutput.writeLong(inspectorId);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		if (productcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productcode);
		}

		if (productname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productname);
		}

		objectOutput.writeLong(totalvehicle);
		objectOutput.writeLong(codeNumber);

		if (chassisNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chassisNumber);
		}

		if (engineNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(engineNumber);
		}

		if (importedorassembled == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importedorassembled);
		}

		if (issuetrackingfromcustomer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuetrackingfromcustomer);
		}

		if (issuetrackingbycorporation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuetrackingbycorporation);
		}

		if (issuetrackingbyimportedgroup == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuetrackingbyimportedgroup);
		}

		objectOutput.writeLong(issuediscovery);

		if (issuedescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuedescription);
		}

		if (issueVAQ1reason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueVAQ1reason);
		}

		if (issueVAQ2troubleshooting == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueVAQ2troubleshooting);
		}

		if (issueVAQ3longtermsolution == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueVAQ3longtermsolution);
		}

		if (issueVAQ4precaution == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issueVAQ4precaution);
		}

		if (creator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(creator);
		}

		objectOutput.writeLong(createddate);
		objectOutput.writeInt(markupissueVAQ4);

		if (makerVAQ4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(makerVAQ4);
		}

		if (checkerVAQ4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checkerVAQ4);
		}

		if (approverVAQ4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approverVAQ4);
		}

		objectOutput.writeLong(makerVAQ4modified);
		objectOutput.writeLong(checkerVAQ4modified);
		objectOutput.writeLong(approverVAQ4modified);
		objectOutput.writeInt(markupissueVAQ1);

		if (makerVAQ1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(makerVAQ1);
		}

		if (checkerVAQ1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checkerVAQ1);
		}

		objectOutput.writeLong(makerVAQ1modified);
		objectOutput.writeLong(checkerVAQ1modified);
		objectOutput.writeInt(markupissueVAQ2);

		if (makerVAQ2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(makerVAQ2);
		}

		if (checkerVAQ2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checkerVAQ2);
		}

		objectOutput.writeLong(makerVAQ2modified);
		objectOutput.writeLong(checkerVAQ2modified);
		objectOutput.writeInt(markupissueVAQ3);

		if (makerVAQ3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(makerVAQ3);
		}

		if (checkerVAQ3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checkerVAQ3);
		}

		if (approverVAQ3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approverVAQ3);
		}

		objectOutput.writeLong(makerVAQ3modified);
		objectOutput.writeLong(checkerVAQ3modified);
		objectOutput.writeLong(approverVAQ3modified);
		objectOutput.writeInt(defectStatus);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public String importercode;
	public String importername;
	public String registerednumber;
	public String inspectionrecordno;
	public long inspectionRecordDate;
	public String corporationId;
	public long inspectorId;
	public String vehicleClass;
	public String productcode;
	public String productname;
	public long totalvehicle;
	public long codeNumber;
	public String chassisNumber;
	public String engineNumber;
	public String importedorassembled;
	public String issuetrackingfromcustomer;
	public String issuetrackingbycorporation;
	public String issuetrackingbyimportedgroup;
	public long issuediscovery;
	public String issuedescription;
	public String issueVAQ1reason;
	public String issueVAQ2troubleshooting;
	public String issueVAQ3longtermsolution;
	public String issueVAQ4precaution;
	public String creator;
	public long createddate;
	public int markupissueVAQ4;
	public String makerVAQ4;
	public String checkerVAQ4;
	public String approverVAQ4;
	public long makerVAQ4modified;
	public long checkerVAQ4modified;
	public long approverVAQ4modified;
	public int markupissueVAQ1;
	public String makerVAQ1;
	public String checkerVAQ1;
	public long makerVAQ1modified;
	public long checkerVAQ1modified;
	public int markupissueVAQ2;
	public String makerVAQ2;
	public String checkerVAQ2;
	public long makerVAQ2modified;
	public long checkerVAQ2modified;
	public int markupissueVAQ3;
	public String makerVAQ3;
	public String checkerVAQ3;
	public String approverVAQ3;
	public long makerVAQ3modified;
	public long checkerVAQ3modified;
	public long approverVAQ3modified;
	public int defectStatus;
	public long synchdate;
}