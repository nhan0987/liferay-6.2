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

import vn.dtt.gt.dk.dao.common.model.DmMetaData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DmMetaData in entity cache.
 *
 * @author win_64
 * @see DmMetaData
 * @generated
 */
public class DmMetaDataCacheModel implements CacheModel<DmMetaData>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Entity=");
		sb.append(Entity);
		sb.append(", FieldCode=");
		sb.append(FieldCode);
		sb.append(", FieldName=");
		sb.append(FieldName);
		sb.append(", FieldAlterName=");
		sb.append(FieldAlterName);
		sb.append(", FieldDescription=");
		sb.append(FieldDescription);
		sb.append(", FieldDataSet=");
		sb.append(FieldDataSet);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmMetaData toEntityModel() {
		DmMetaDataImpl dmMetaDataImpl = new DmMetaDataImpl();

		dmMetaDataImpl.setId(Id);

		if (Entity == null) {
			dmMetaDataImpl.setEntity(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setEntity(Entity);
		}

		if (FieldCode == null) {
			dmMetaDataImpl.setFieldCode(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldCode(FieldCode);
		}

		if (FieldName == null) {
			dmMetaDataImpl.setFieldName(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldName(FieldName);
		}

		if (FieldAlterName == null) {
			dmMetaDataImpl.setFieldAlterName(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldAlterName(FieldAlterName);
		}

		if (FieldDescription == null) {
			dmMetaDataImpl.setFieldDescription(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldDescription(FieldDescription);
		}

		if (FieldDataSet == null) {
			dmMetaDataImpl.setFieldDataSet(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldDataSet(FieldDataSet);
		}

		dmMetaDataImpl.resetOriginalValues();

		return dmMetaDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		Entity = objectInput.readUTF();
		FieldCode = objectInput.readUTF();
		FieldName = objectInput.readUTF();
		FieldAlterName = objectInput.readUTF();
		FieldDescription = objectInput.readUTF();
		FieldDataSet = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (Entity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Entity);
		}

		if (FieldCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FieldCode);
		}

		if (FieldName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FieldName);
		}

		if (FieldAlterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FieldAlterName);
		}

		if (FieldDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FieldDescription);
		}

		if (FieldDataSet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FieldDataSet);
		}
	}

	public long Id;
	public String Entity;
	public String FieldCode;
	public String FieldName;
	public String FieldAlterName;
	public String FieldDescription;
	public String FieldDataSet;
}