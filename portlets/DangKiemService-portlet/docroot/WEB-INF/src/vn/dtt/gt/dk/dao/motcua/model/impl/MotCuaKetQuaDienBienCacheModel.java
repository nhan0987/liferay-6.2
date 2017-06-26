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
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaKetQuaDienBien in entity cache.
 *
 * @author huymq
 * @see MotCuaKetQuaDienBien
 * @generated
 */
public class MotCuaKetQuaDienBienCacheModel implements CacheModel<MotCuaKetQuaDienBien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dienBienHoSoId=");
		sb.append(dienBienHoSoId);
		sb.append(", noiDungHoSoId=");
		sb.append(noiDungHoSoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaKetQuaDienBien toEntityModel() {
		MotCuaKetQuaDienBienImpl motCuaKetQuaDienBienImpl = new MotCuaKetQuaDienBienImpl();

		motCuaKetQuaDienBienImpl.setId(id);
		motCuaKetQuaDienBienImpl.setDienBienHoSoId(dienBienHoSoId);
		motCuaKetQuaDienBienImpl.setNoiDungHoSoId(noiDungHoSoId);

		motCuaKetQuaDienBienImpl.resetOriginalValues();

		return motCuaKetQuaDienBienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		dienBienHoSoId = objectInput.readLong();
		noiDungHoSoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(dienBienHoSoId);
		objectOutput.writeLong(noiDungHoSoId);
	}

	public long id;
	public long dienBienHoSoId;
	public long noiDungHoSoId;
}