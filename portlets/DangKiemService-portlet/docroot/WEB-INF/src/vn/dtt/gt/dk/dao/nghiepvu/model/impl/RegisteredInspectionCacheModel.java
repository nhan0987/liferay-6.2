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

import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RegisteredInspection in entity cache.
 *
 * @author huymq
 * @see RegisteredInspection
 * @generated
 */
public class RegisteredInspectionCacheModel implements CacheModel<RegisteredInspection>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registeredNumber=");
		sb.append(registeredNumber);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", importerCode=");
		sb.append(importerCode);
		sb.append(", importerName=");
		sb.append(importerName);
		sb.append(", importerAddress=");
		sb.append(importerAddress);
		sb.append(", representative=");
		sb.append(representative);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append(", inspectionDate=");
		sb.append(inspectionDate);
		sb.append(", inspectionSite=");
		sb.append(inspectionSite);
		sb.append(", inspectionDistrictCode=");
		sb.append(inspectionDistrictCode);
		sb.append(", inspectionProvinceCode=");
		sb.append(inspectionProvinceCode);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", contactPhone=");
		sb.append(contactPhone);
		sb.append(", contactEmail=");
		sb.append(contactEmail);
		sb.append(", importerSignName=");
		sb.append(importerSignName);
		sb.append(", importerSignTitle=");
		sb.append(importerSignTitle);
		sb.append(", importerSignPlace=");
		sb.append(importerSignPlace);
		sb.append(", importerSignDate=");
		sb.append(importerSignDate);
		sb.append(", inspectorOrganization=");
		sb.append(inspectorOrganization);
		sb.append(", inspectorDivision=");
		sb.append(inspectorDivision);
		sb.append(", inspectorSigNname=");
		sb.append(inspectorSigNname);
		sb.append(", inspectorSignTitle=");
		sb.append(inspectorSignTitle);
		sb.append(", inspectorSignPlace=");
		sb.append(inspectorSignPlace);
		sb.append(", inspectorSignDate=");
		sb.append(inspectorSignDate);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RegisteredInspection toEntityModel() {
		RegisteredInspectionImpl registeredInspectionImpl = new RegisteredInspectionImpl();

		registeredInspectionImpl.setId(id);

		if (registeredNumber == null) {
			registeredInspectionImpl.setRegisteredNumber(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setRegisteredNumber(registeredNumber);
		}

		registeredInspectionImpl.setDossierId(dossierId);
		registeredInspectionImpl.setAttachedFile(attachedFile);

		if (importerCode == null) {
			registeredInspectionImpl.setImporterCode(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setImporterCode(importerCode);
		}

		if (importerName == null) {
			registeredInspectionImpl.setImporterName(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setImporterName(importerName);
		}

		if (importerAddress == null) {
			registeredInspectionImpl.setImporterAddress(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setImporterAddress(importerAddress);
		}

		if (representative == null) {
			registeredInspectionImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setRepresentative(representative);
		}

		if (phone == null) {
			registeredInspectionImpl.setPhone(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setPhone(phone);
		}

		if (fax == null) {
			registeredInspectionImpl.setFax(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setFax(fax);
		}

		if (email == null) {
			registeredInspectionImpl.setEmail(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setEmail(email);
		}

		if (inspectionDate == Long.MIN_VALUE) {
			registeredInspectionImpl.setInspectionDate(null);
		}
		else {
			registeredInspectionImpl.setInspectionDate(new Date(inspectionDate));
		}

		if (inspectionSite == null) {
			registeredInspectionImpl.setInspectionSite(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectionSite(inspectionSite);
		}

		if (inspectionDistrictCode == null) {
			registeredInspectionImpl.setInspectionDistrictCode(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectionDistrictCode(inspectionDistrictCode);
		}

		if (inspectionProvinceCode == null) {
			registeredInspectionImpl.setInspectionProvinceCode(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectionProvinceCode(inspectionProvinceCode);
		}

		if (contactName == null) {
			registeredInspectionImpl.setContactName(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setContactName(contactName);
		}

		if (contactPhone == null) {
			registeredInspectionImpl.setContactPhone(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setContactPhone(contactPhone);
		}

		if (contactEmail == null) {
			registeredInspectionImpl.setContactEmail(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setContactEmail(contactEmail);
		}

		if (importerSignName == null) {
			registeredInspectionImpl.setImporterSignName(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setImporterSignName(importerSignName);
		}

		if (importerSignTitle == null) {
			registeredInspectionImpl.setImporterSignTitle(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setImporterSignTitle(importerSignTitle);
		}

		if (importerSignPlace == null) {
			registeredInspectionImpl.setImporterSignPlace(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setImporterSignPlace(importerSignPlace);
		}

		if (importerSignDate == Long.MIN_VALUE) {
			registeredInspectionImpl.setImporterSignDate(null);
		}
		else {
			registeredInspectionImpl.setImporterSignDate(new Date(
					importerSignDate));
		}

		if (inspectorOrganization == null) {
			registeredInspectionImpl.setInspectorOrganization(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectorOrganization(inspectorOrganization);
		}

		if (inspectorDivision == null) {
			registeredInspectionImpl.setInspectorDivision(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectorDivision(inspectorDivision);
		}

		if (inspectorSigNname == null) {
			registeredInspectionImpl.setInspectorSigNname(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectorSigNname(inspectorSigNname);
		}

		if (inspectorSignTitle == null) {
			registeredInspectionImpl.setInspectorSignTitle(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectorSignTitle(inspectorSignTitle);
		}

		if (inspectorSignPlace == null) {
			registeredInspectionImpl.setInspectorSignPlace(StringPool.BLANK);
		}
		else {
			registeredInspectionImpl.setInspectorSignPlace(inspectorSignPlace);
		}

		if (inspectorSignDate == Long.MIN_VALUE) {
			registeredInspectionImpl.setInspectorSignDate(null);
		}
		else {
			registeredInspectionImpl.setInspectorSignDate(new Date(
					inspectorSignDate));
		}

		if (synchdate == Long.MIN_VALUE) {
			registeredInspectionImpl.setSynchdate(null);
		}
		else {
			registeredInspectionImpl.setSynchdate(new Date(synchdate));
		}

		registeredInspectionImpl.resetOriginalValues();

		return registeredInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredNumber = objectInput.readUTF();
		dossierId = objectInput.readLong();
		attachedFile = objectInput.readLong();
		importerCode = objectInput.readUTF();
		importerName = objectInput.readUTF();
		importerAddress = objectInput.readUTF();
		representative = objectInput.readUTF();
		phone = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
		inspectionDate = objectInput.readLong();
		inspectionSite = objectInput.readUTF();
		inspectionDistrictCode = objectInput.readUTF();
		inspectionProvinceCode = objectInput.readUTF();
		contactName = objectInput.readUTF();
		contactPhone = objectInput.readUTF();
		contactEmail = objectInput.readUTF();
		importerSignName = objectInput.readUTF();
		importerSignTitle = objectInput.readUTF();
		importerSignPlace = objectInput.readUTF();
		importerSignDate = objectInput.readLong();
		inspectorOrganization = objectInput.readUTF();
		inspectorDivision = objectInput.readUTF();
		inspectorSigNname = objectInput.readUTF();
		inspectorSignTitle = objectInput.readUTF();
		inspectorSignPlace = objectInput.readUTF();
		inspectorSignDate = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (registeredNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registeredNumber);
		}

		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(attachedFile);

		if (importerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerCode);
		}

		if (importerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerName);
		}

		if (importerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerAddress);
		}

		if (representative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(representative);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(inspectionDate);

		if (inspectionSite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionSite);
		}

		if (inspectionDistrictCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionDistrictCode);
		}

		if (inspectionProvinceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionProvinceCode);
		}

		if (contactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactName);
		}

		if (contactPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactPhone);
		}

		if (contactEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactEmail);
		}

		if (importerSignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerSignName);
		}

		if (importerSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerSignTitle);
		}

		if (importerSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importerSignPlace);
		}

		objectOutput.writeLong(importerSignDate);

		if (inspectorOrganization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorOrganization);
		}

		if (inspectorDivision == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorDivision);
		}

		if (inspectorSigNname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSigNname);
		}

		if (inspectorSignTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignTitle);
		}

		if (inspectorSignPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorSignPlace);
		}

		objectOutput.writeLong(inspectorSignDate);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public String registeredNumber;
	public long dossierId;
	public long attachedFile;
	public String importerCode;
	public String importerName;
	public String importerAddress;
	public String representative;
	public String phone;
	public String fax;
	public String email;
	public long inspectionDate;
	public String inspectionSite;
	public String inspectionDistrictCode;
	public String inspectionProvinceCode;
	public String contactName;
	public String contactPhone;
	public String contactEmail;
	public String importerSignName;
	public String importerSignTitle;
	public String importerSignPlace;
	public long importerSignDate;
	public String inspectorOrganization;
	public String inspectorDivision;
	public String inspectorSigNname;
	public String inspectorSignTitle;
	public String inspectorSignPlace;
	public long inspectorSignDate;
	public long synchdate;
}