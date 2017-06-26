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

package vn.dtt.gt.dk.dao.motcua.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ThamSoHeThong in entity cache.
 *
 * @author win_64
 * @see ThamSoHeThong
 * @generated
 */
public class ThamSoHeThongCacheModel implements CacheModel<ThamSoHeThong>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", valueData=");
		sb.append(valueData);
		sb.append(", keyData=");
		sb.append(keyData);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ThamSoHeThong toEntityModel() {
		ThamSoHeThongImpl thamSoHeThongImpl = new ThamSoHeThongImpl();

		thamSoHeThongImpl.setId(id);

		if (valueData == null) {
			thamSoHeThongImpl.setValueData(StringPool.BLANK);
		}
		else {
			thamSoHeThongImpl.setValueData(valueData);
		}

		if (keyData == null) {
			thamSoHeThongImpl.setKeyData(StringPool.BLANK);
		}
		else {
			thamSoHeThongImpl.setKeyData(keyData);
		}

		if (description == null) {
			thamSoHeThongImpl.setDescription(StringPool.BLANK);
		}
		else {
			thamSoHeThongImpl.setDescription(description);
		}

		thamSoHeThongImpl.resetOriginalValues();

		return thamSoHeThongImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		valueData = objectInput.readUTF();
		keyData = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (valueData == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(valueData);
		}

		if (keyData == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(keyData);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long id;
	public String valueData;
	public String keyData;
	public String description;
}