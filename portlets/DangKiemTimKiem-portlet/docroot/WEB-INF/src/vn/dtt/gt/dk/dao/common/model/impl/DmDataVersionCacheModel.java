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

import vn.dtt.gt.dk.dao.common.model.DmDataVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmDataVersion in entity cache.
 *
 * @author win_64
 * @see DmDataVersion
 * @generated
 */
public class DmDataVersionCacheModel implements CacheModel<DmDataVersion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", DataGroupId=");
		sb.append(DataGroupId);
		sb.append(", Version=");
		sb.append(Version);
		sb.append(", IssuedTime=");
		sb.append(IssuedTime);
		sb.append(", ValidateDFrom=");
		sb.append(ValidateDFrom);
		sb.append(", ValidatedTo=");
		sb.append(ValidatedTo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmDataVersion toEntityModel() {
		DmDataVersionImpl dmDataVersionImpl = new DmDataVersionImpl();

		dmDataVersionImpl.setId(Id);
		dmDataVersionImpl.setDataGroupId(DataGroupId);

		if (Version == null) {
			dmDataVersionImpl.setVersion(StringPool.BLANK);
		}
		else {
			dmDataVersionImpl.setVersion(Version);
		}

		if (IssuedTime == Long.MIN_VALUE) {
			dmDataVersionImpl.setIssuedTime(null);
		}
		else {
			dmDataVersionImpl.setIssuedTime(new Date(IssuedTime));
		}

		if (ValidateDFrom == Long.MIN_VALUE) {
			dmDataVersionImpl.setValidateDFrom(null);
		}
		else {
			dmDataVersionImpl.setValidateDFrom(new Date(ValidateDFrom));
		}

		if (ValidatedTo == Long.MIN_VALUE) {
			dmDataVersionImpl.setValidatedTo(null);
		}
		else {
			dmDataVersionImpl.setValidatedTo(new Date(ValidatedTo));
		}

		dmDataVersionImpl.resetOriginalValues();

		return dmDataVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		DataGroupId = objectInput.readLong();
		Version = objectInput.readUTF();
		IssuedTime = objectInput.readLong();
		ValidateDFrom = objectInput.readLong();
		ValidatedTo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);
		objectOutput.writeLong(DataGroupId);

		if (Version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Version);
		}

		objectOutput.writeLong(IssuedTime);
		objectOutput.writeLong(ValidateDFrom);
		objectOutput.writeLong(ValidatedTo);
	}

	public long Id;
	public long DataGroupId;
	public String Version;
	public long IssuedTime;
	public long ValidateDFrom;
	public long ValidatedTo;
}