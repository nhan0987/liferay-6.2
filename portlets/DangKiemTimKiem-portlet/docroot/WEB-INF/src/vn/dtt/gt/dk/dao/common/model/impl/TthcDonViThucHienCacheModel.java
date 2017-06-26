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

import vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcDonViThucHien in entity cache.
 *
 * @author win_64
 * @see TthcDonViThucHien
 * @generated
 */
public class TthcDonViThucHienCacheModel implements CacheModel<TthcDonViThucHien>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", ThuTucHanhChinhId=");
		sb.append(ThuTucHanhChinhId);
		sb.append(", MaDvth=");
		sb.append(MaDvth);
		sb.append(", TenDvth=");
		sb.append(TenDvth);
		sb.append(", TenTiengAnh=");
		sb.append(TenTiengAnh);
		sb.append(", ToChuc=");
		sb.append(ToChuc);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcDonViThucHien toEntityModel() {
		TthcDonViThucHienImpl tthcDonViThucHienImpl = new TthcDonViThucHienImpl();

		tthcDonViThucHienImpl.setId(Id);
		tthcDonViThucHienImpl.setThuTucHanhChinhId(ThuTucHanhChinhId);

		if (MaDvth == null) {
			tthcDonViThucHienImpl.setMaDvth(StringPool.BLANK);
		}
		else {
			tthcDonViThucHienImpl.setMaDvth(MaDvth);
		}

		if (TenDvth == null) {
			tthcDonViThucHienImpl.setTenDvth(StringPool.BLANK);
		}
		else {
			tthcDonViThucHienImpl.setTenDvth(TenDvth);
		}

		if (TenTiengAnh == null) {
			tthcDonViThucHienImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcDonViThucHienImpl.setTenTiengAnh(TenTiengAnh);
		}

		tthcDonViThucHienImpl.setToChuc(ToChuc);

		tthcDonViThucHienImpl.resetOriginalValues();

		return tthcDonViThucHienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		ThuTucHanhChinhId = objectInput.readLong();
		MaDvth = objectInput.readUTF();
		TenDvth = objectInput.readUTF();
		TenTiengAnh = objectInput.readUTF();
		ToChuc = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);
		objectOutput.writeLong(ThuTucHanhChinhId);

		if (MaDvth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaDvth);
		}

		if (TenDvth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenDvth);
		}

		if (TenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenTiengAnh);
		}

		objectOutput.writeLong(ToChuc);
	}

	public long Id;
	public long ThuTucHanhChinhId;
	public String MaDvth;
	public String TenDvth;
	public String TenTiengAnh;
	public long ToChuc;
}