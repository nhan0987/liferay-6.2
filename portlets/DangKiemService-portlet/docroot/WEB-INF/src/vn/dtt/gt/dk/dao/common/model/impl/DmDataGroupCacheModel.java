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

import vn.dtt.gt.dk.dao.common.model.DmDataGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmDataGroup in entity cache.
 *
 * @author huymq
 * @see DmDataGroup
 * @generated
 */
public class DmDataGroupCacheModel implements CacheModel<DmDataGroup>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Code=");
		sb.append(Code);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmDataGroup toEntityModel() {
		DmDataGroupImpl dmDataGroupImpl = new DmDataGroupImpl();

		dmDataGroupImpl.setId(Id);

		if (Code == null) {
			dmDataGroupImpl.setCode(StringPool.BLANK);
		}
		else {
			dmDataGroupImpl.setCode(Code);
		}

		if (Name == null) {
			dmDataGroupImpl.setName(StringPool.BLANK);
		}
		else {
			dmDataGroupImpl.setName(Name);
		}

		if (Description == null) {
			dmDataGroupImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmDataGroupImpl.setDescription(Description);
		}

		if (synchdate == Long.MIN_VALUE) {
			dmDataGroupImpl.setSynchdate(null);
		}
		else {
			dmDataGroupImpl.setSynchdate(new Date(synchdate));
		}

		dmDataGroupImpl.resetOriginalValues();

		return dmDataGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		Code = objectInput.readUTF();
		Name = objectInput.readUTF();
		Description = objectInput.readUTF();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Code);
		}

		if (Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Name);
		}

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
		}

		objectOutput.writeLong(synchdate);
	}

	public long Id;
	public String Code;
	public String Name;
	public String Description;
	public long synchdate;
}