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

import vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcLinhVucThuTuc in entity cache.
 *
 * @author win_64
 * @see TthcLinhVucThuTuc
 * @generated
 */
public class TthcLinhVucThuTucCacheModel implements CacheModel<TthcLinhVucThuTuc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", TenLinhVuc=");
		sb.append(TenLinhVuc);
		sb.append(", TenTiengAnh=");
		sb.append(TenTiengAnh);
		sb.append(", IdCha=");
		sb.append(IdCha);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcLinhVucThuTuc toEntityModel() {
		TthcLinhVucThuTucImpl tthcLinhVucThuTucImpl = new TthcLinhVucThuTucImpl();

		tthcLinhVucThuTucImpl.setId(Id);

		if (TenLinhVuc == null) {
			tthcLinhVucThuTucImpl.setTenLinhVuc(StringPool.BLANK);
		}
		else {
			tthcLinhVucThuTucImpl.setTenLinhVuc(TenLinhVuc);
		}

		if (TenTiengAnh == null) {
			tthcLinhVucThuTucImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcLinhVucThuTucImpl.setTenTiengAnh(TenTiengAnh);
		}

		tthcLinhVucThuTucImpl.setIdCha(IdCha);

		tthcLinhVucThuTucImpl.resetOriginalValues();

		return tthcLinhVucThuTucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		TenLinhVuc = objectInput.readUTF();
		TenTiengAnh = objectInput.readUTF();
		IdCha = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (TenLinhVuc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenLinhVuc);
		}

		if (TenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenTiengAnh);
		}

		objectOutput.writeLong(IdCha);
	}

	public long Id;
	public String TenLinhVuc;
	public String TenTiengAnh;
	public long IdCha;
}