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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaQuyTrinhThuTuc in entity cache.
 *
 * @author huymq
 * @see MotCuaQuyTrinhThuTuc
 * @generated
 */
public class MotCuaQuyTrinhThuTucCacheModel implements CacheModel<MotCuaQuyTrinhThuTuc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", maQuyTrinh=");
		sb.append(maQuyTrinh);
		sb.append(", toChucXuLy=");
		sb.append(toChucXuLy);
		sb.append(", soNgayXuLy=");
		sb.append(soNgayXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaQuyTrinhThuTuc toEntityModel() {
		MotCuaQuyTrinhThuTucImpl motCuaQuyTrinhThuTucImpl = new MotCuaQuyTrinhThuTucImpl();

		motCuaQuyTrinhThuTucImpl.setId(id);
		motCuaQuyTrinhThuTucImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (maQuyTrinh == null) {
			motCuaQuyTrinhThuTucImpl.setMaQuyTrinh(StringPool.BLANK);
		}
		else {
			motCuaQuyTrinhThuTucImpl.setMaQuyTrinh(maQuyTrinh);
		}

		motCuaQuyTrinhThuTucImpl.setToChucXuLy(toChucXuLy);
		motCuaQuyTrinhThuTucImpl.setSoNgayXuLy(soNgayXuLy);

		motCuaQuyTrinhThuTucImpl.resetOriginalValues();

		return motCuaQuyTrinhThuTucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		thuTucHanhChinhId = objectInput.readLong();
		maQuyTrinh = objectInput.readUTF();
		toChucXuLy = objectInput.readLong();
		soNgayXuLy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(thuTucHanhChinhId);

		if (maQuyTrinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maQuyTrinh);
		}

		objectOutput.writeLong(toChucXuLy);
		objectOutput.writeLong(soNgayXuLy);
	}

	public long id;
	public long thuTucHanhChinhId;
	public String maQuyTrinh;
	public long toChucXuLy;
	public long soNgayXuLy;
}