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

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CfgTechnicalspec in entity cache.
 *
 * @author huymq
 * @see CfgTechnicalspec
 * @generated
 */
public class CfgTechnicalspecCacheModel implements CacheModel<CfgTechnicalspec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleTypeCode=");
		sb.append(vehicleTypeCode);
		sb.append(", vehicleTypeName=");
		sb.append(vehicleTypeName);
		sb.append(", sequenceno=");
		sb.append(sequenceno);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specDescription=");
		sb.append(specDescription);
		sb.append(", specCategory=");
		sb.append(specCategory);
		sb.append(", specificationGroup=");
		sb.append(specificationGroup);
		sb.append(", searchingIncluded=");
		sb.append(searchingIncluded);
		sb.append(", referenceIncluded=");
		sb.append(referenceIncluded);
		sb.append(", certificateIncluded=");
		sb.append(certificateIncluded);
		sb.append(", datagroupid=");
		sb.append(datagroupid);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CfgTechnicalspec toEntityModel() {
		CfgTechnicalspecImpl cfgTechnicalspecImpl = new CfgTechnicalspecImpl();

		cfgTechnicalspecImpl.setId(id);

		if (vehicleTypeCode == null) {
			cfgTechnicalspecImpl.setVehicleTypeCode(StringPool.BLANK);
		}
		else {
			cfgTechnicalspecImpl.setVehicleTypeCode(vehicleTypeCode);
		}

		if (vehicleTypeName == null) {
			cfgTechnicalspecImpl.setVehicleTypeName(StringPool.BLANK);
		}
		else {
			cfgTechnicalspecImpl.setVehicleTypeName(vehicleTypeName);
		}

		cfgTechnicalspecImpl.setSequenceno(sequenceno);

		if (specificationCode == null) {
			cfgTechnicalspecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			cfgTechnicalspecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			cfgTechnicalspecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			cfgTechnicalspecImpl.setSpecificationName(specificationName);
		}

		if (specDescription == null) {
			cfgTechnicalspecImpl.setSpecDescription(StringPool.BLANK);
		}
		else {
			cfgTechnicalspecImpl.setSpecDescription(specDescription);
		}

		if (specCategory == null) {
			cfgTechnicalspecImpl.setSpecCategory(StringPool.BLANK);
		}
		else {
			cfgTechnicalspecImpl.setSpecCategory(specCategory);
		}

		cfgTechnicalspecImpl.setSpecificationGroup(specificationGroup);
		cfgTechnicalspecImpl.setSearchingIncluded(searchingIncluded);
		cfgTechnicalspecImpl.setReferenceIncluded(referenceIncluded);
		cfgTechnicalspecImpl.setCertificateIncluded(certificateIncluded);
		cfgTechnicalspecImpl.setDatagroupid(datagroupid);

		if (synchdate == Long.MIN_VALUE) {
			cfgTechnicalspecImpl.setSynchdate(null);
		}
		else {
			cfgTechnicalspecImpl.setSynchdate(new Date(synchdate));
		}

		cfgTechnicalspecImpl.resetOriginalValues();

		return cfgTechnicalspecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleTypeCode = objectInput.readUTF();
		vehicleTypeName = objectInput.readUTF();
		sequenceno = objectInput.readLong();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specDescription = objectInput.readUTF();
		specCategory = objectInput.readUTF();
		specificationGroup = objectInput.readLong();
		searchingIncluded = objectInput.readLong();
		referenceIncluded = objectInput.readLong();
		certificateIncluded = objectInput.readLong();
		datagroupid = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (vehicleTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleTypeCode);
		}

		if (vehicleTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleTypeName);
		}

		objectOutput.writeLong(sequenceno);

		if (specificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationCode);
		}

		if (specificationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationName);
		}

		if (specDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specDescription);
		}

		if (specCategory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specCategory);
		}

		objectOutput.writeLong(specificationGroup);
		objectOutput.writeLong(searchingIncluded);
		objectOutput.writeLong(referenceIncluded);
		objectOutput.writeLong(certificateIncluded);
		objectOutput.writeLong(datagroupid);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public String vehicleTypeCode;
	public String vehicleTypeName;
	public long sequenceno;
	public String specificationCode;
	public String specificationName;
	public String specDescription;
	public String specCategory;
	public long specificationGroup;
	public long searchingIncluded;
	public long referenceIncluded;
	public long certificateIncluded;
	public long datagroupid;
	public long synchdate;
}