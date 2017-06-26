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

package vn.dtt.gt.dk.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmDataItem in entity cache.
 *
 * @author win_64
 * @see DmDataItem
 * @generated
 */
public class DmDataItemCacheModel implements CacheModel<DmDataItem>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", DataGroupId=");
		sb.append(DataGroupId);
		sb.append(", Code0=");
		sb.append(Code0);
		sb.append(", Code1=");
		sb.append(Code1);
		sb.append(", Code2=");
		sb.append(Code2);
		sb.append(", Code3=");
		sb.append(Code3);
		sb.append(", Level=");
		sb.append(Level);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", AlterName=");
		sb.append(AlterName);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", ValidatedFrom=");
		sb.append(ValidatedFrom);
		sb.append(", ValidatedTo=");
		sb.append(ValidatedTo);
		sb.append(", Status=");
		sb.append(Status);
		sb.append(", SynchDate=");
		sb.append(SynchDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmDataItem toEntityModel() {
		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setId(Id);
		dmDataItemImpl.setDataGroupId(DataGroupId);

		if (Code0 == null) {
			dmDataItemImpl.setCode0(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode0(Code0);
		}

		if (Code1 == null) {
			dmDataItemImpl.setCode1(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode1(Code1);
		}

		if (Code2 == null) {
			dmDataItemImpl.setCode2(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode2(Code2);
		}

		if (Code3 == null) {
			dmDataItemImpl.setCode3(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode3(Code3);
		}

		dmDataItemImpl.setLevel(Level);

		if (Name == null) {
			dmDataItemImpl.setName(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setName(Name);
		}

		if (AlterName == null) {
			dmDataItemImpl.setAlterName(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setAlterName(AlterName);
		}

		if (Description == null) {
			dmDataItemImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setDescription(Description);
		}

		if (ValidatedFrom == Long.MIN_VALUE) {
			dmDataItemImpl.setValidatedFrom(null);
		}
		else {
			dmDataItemImpl.setValidatedFrom(new Date(ValidatedFrom));
		}

		if (ValidatedTo == Long.MIN_VALUE) {
			dmDataItemImpl.setValidatedTo(null);
		}
		else {
			dmDataItemImpl.setValidatedTo(new Date(ValidatedTo));
		}

		dmDataItemImpl.setStatus(Status);

		if (SynchDate == Long.MIN_VALUE) {
			dmDataItemImpl.setSynchDate(null);
		}
		else {
			dmDataItemImpl.setSynchDate(new Date(SynchDate));
		}

		dmDataItemImpl.resetOriginalValues();

		return dmDataItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		DataGroupId = objectInput.readLong();
		Code0 = objectInput.readUTF();
		Code1 = objectInput.readUTF();
		Code2 = objectInput.readUTF();
		Code3 = objectInput.readUTF();
		Level = objectInput.readInt();
		Name = objectInput.readUTF();
		AlterName = objectInput.readUTF();
		Description = objectInput.readUTF();
		ValidatedFrom = objectInput.readLong();
		ValidatedTo = objectInput.readLong();
		Status = objectInput.readInt();
		SynchDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);
		objectOutput.writeLong(DataGroupId);

		if (Code0 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Code0);
		}

		if (Code1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Code1);
		}

		if (Code2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Code2);
		}

		if (Code3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Code3);
		}

		objectOutput.writeInt(Level);

		if (Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Name);
		}

		if (AlterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AlterName);
		}

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
		}

		objectOutput.writeLong(ValidatedFrom);
		objectOutput.writeLong(ValidatedTo);
		objectOutput.writeInt(Status);
		objectOutput.writeLong(SynchDate);
	}

	public long Id;
	public long DataGroupId;
	public String Code0;
	public String Code1;
	public String Code2;
	public String Code3;
	public int Level;
	public String Name;
	public String AlterName;
	public String Description;
	public long ValidatedFrom;
	public long ValidatedTo;
	public int Status;
	public long SynchDate;
}