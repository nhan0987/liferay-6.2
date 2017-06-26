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

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CfgLimitTechnicalSpec in entity cache.
 *
 * @author huymq
 * @see CfgLimitTechnicalSpec
 * @generated
 */
public class CfgLimitTechnicalSpecCacheModel implements CacheModel<CfgLimitTechnicalSpec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicletypecode=");
		sb.append(vehicletypecode);
		sb.append(", vehicletypename=");
		sb.append(vehicletypename);
		sb.append(", reference_code_3=");
		sb.append(reference_code_3);
		sb.append(", reference_name=");
		sb.append(reference_name);
		sb.append(", searching_drive_config=");
		sb.append(searching_drive_config);
		sb.append(", altername=");
		sb.append(altername);
		sb.append(", sequenceno=");
		sb.append(sequenceno);
		sb.append(", specificationcode=");
		sb.append(specificationcode);
		sb.append(", specificationname=");
		sb.append(specificationname);
		sb.append(", spec_description=");
		sb.append(spec_description);
		sb.append(", spec_category=");
		sb.append(spec_category);
		sb.append(", datagroupid=");
		sb.append(datagroupid);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CfgLimitTechnicalSpec toEntityModel() {
		CfgLimitTechnicalSpecImpl cfgLimitTechnicalSpecImpl = new CfgLimitTechnicalSpecImpl();

		cfgLimitTechnicalSpecImpl.setId(id);

		if (vehicletypecode == null) {
			cfgLimitTechnicalSpecImpl.setVehicletypecode(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setVehicletypecode(vehicletypecode);
		}

		if (vehicletypename == null) {
			cfgLimitTechnicalSpecImpl.setVehicletypename(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setVehicletypename(vehicletypename);
		}

		if (reference_code_3 == null) {
			cfgLimitTechnicalSpecImpl.setReference_code_3(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setReference_code_3(reference_code_3);
		}

		if (reference_name == null) {
			cfgLimitTechnicalSpecImpl.setReference_name(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setReference_name(reference_name);
		}

		cfgLimitTechnicalSpecImpl.setSearching_drive_config(searching_drive_config);

		if (altername == null) {
			cfgLimitTechnicalSpecImpl.setAltername(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setAltername(altername);
		}

		cfgLimitTechnicalSpecImpl.setSequenceno(sequenceno);

		if (specificationcode == null) {
			cfgLimitTechnicalSpecImpl.setSpecificationcode(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setSpecificationcode(specificationcode);
		}

		if (specificationname == null) {
			cfgLimitTechnicalSpecImpl.setSpecificationname(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setSpecificationname(specificationname);
		}

		if (spec_description == null) {
			cfgLimitTechnicalSpecImpl.setSpec_description(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setSpec_description(spec_description);
		}

		if (spec_category == null) {
			cfgLimitTechnicalSpecImpl.setSpec_category(StringPool.BLANK);
		}
		else {
			cfgLimitTechnicalSpecImpl.setSpec_category(spec_category);
		}

		cfgLimitTechnicalSpecImpl.setDatagroupid(datagroupid);

		if (synchdate == Long.MIN_VALUE) {
			cfgLimitTechnicalSpecImpl.setSynchdate(null);
		}
		else {
			cfgLimitTechnicalSpecImpl.setSynchdate(new Date(synchdate));
		}

		cfgLimitTechnicalSpecImpl.resetOriginalValues();

		return cfgLimitTechnicalSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicletypecode = objectInput.readUTF();
		vehicletypename = objectInput.readUTF();
		reference_code_3 = objectInput.readUTF();
		reference_name = objectInput.readUTF();
		searching_drive_config = objectInput.readInt();
		altername = objectInput.readUTF();
		sequenceno = objectInput.readInt();
		specificationcode = objectInput.readUTF();
		specificationname = objectInput.readUTF();
		spec_description = objectInput.readUTF();
		spec_category = objectInput.readUTF();
		datagroupid = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (vehicletypecode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicletypecode);
		}

		if (vehicletypename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicletypename);
		}

		if (reference_code_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reference_code_3);
		}

		if (reference_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reference_name);
		}

		objectOutput.writeInt(searching_drive_config);

		if (altername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(altername);
		}

		objectOutput.writeInt(sequenceno);

		if (specificationcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationcode);
		}

		if (specificationname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationname);
		}

		if (spec_description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(spec_description);
		}

		if (spec_category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(spec_category);
		}

		objectOutput.writeLong(datagroupid);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public String vehicletypecode;
	public String vehicletypename;
	public String reference_code_3;
	public String reference_name;
	public int searching_drive_config;
	public String altername;
	public int sequenceno;
	public String specificationcode;
	public String specificationname;
	public String spec_description;
	public String spec_category;
	public long datagroupid;
	public long synchdate;
}