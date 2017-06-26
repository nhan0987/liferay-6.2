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

import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcBieuMauHoSo in entity cache.
 *
 * @author win_64
 * @see TthcBieuMauHoSo
 * @generated
 */
public class TthcBieuMauHoSoCacheModel implements CacheModel<TthcBieuMauHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", MaBieuMau=");
		sb.append(MaBieuMau);
		sb.append(", TenBieuMau=");
		sb.append(TenBieuMau);
		sb.append(", TenTiengAnh=");
		sb.append(TenTiengAnh);
		sb.append(", TaiLieuMau=");
		sb.append(TaiLieuMau);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcBieuMauHoSo toEntityModel() {
		TthcBieuMauHoSoImpl tthcBieuMauHoSoImpl = new TthcBieuMauHoSoImpl();

		tthcBieuMauHoSoImpl.setId(Id);

		if (MaBieuMau == null) {
			tthcBieuMauHoSoImpl.setMaBieuMau(StringPool.BLANK);
		}
		else {
			tthcBieuMauHoSoImpl.setMaBieuMau(MaBieuMau);
		}

		if (TenBieuMau == null) {
			tthcBieuMauHoSoImpl.setTenBieuMau(StringPool.BLANK);
		}
		else {
			tthcBieuMauHoSoImpl.setTenBieuMau(TenBieuMau);
		}

		if (TenTiengAnh == null) {
			tthcBieuMauHoSoImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcBieuMauHoSoImpl.setTenTiengAnh(TenTiengAnh);
		}

		tthcBieuMauHoSoImpl.setTaiLieuMau(TaiLieuMau);

		tthcBieuMauHoSoImpl.resetOriginalValues();

		return tthcBieuMauHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		MaBieuMau = objectInput.readUTF();
		TenBieuMau = objectInput.readUTF();
		TenTiengAnh = objectInput.readUTF();
		TaiLieuMau = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (MaBieuMau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaBieuMau);
		}

		if (TenBieuMau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenBieuMau);
		}

		if (TenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenTiengAnh);
		}

		objectOutput.writeLong(TaiLieuMau);
	}

	public long Id;
	public String MaBieuMau;
	public String TenBieuMau;
	public String TenTiengAnh;
	public long TaiLieuMau;
}