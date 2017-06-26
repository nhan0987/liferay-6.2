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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MotCuaChuyenDichTrangThai in entity cache.
 *
 * @author win_64
 * @see MotCuaChuyenDichTrangThai
 * @generated
 */
public class MotCuaChuyenDichTrangThaiCacheModel implements CacheModel<MotCuaChuyenDichTrangThai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", trangThaiNguonId=");
		sb.append(trangThaiNguonId);
		sb.append(", trangThaiDichId=");
		sb.append(trangThaiDichId);
		sb.append(", dieuKienChuyenDich=");
		sb.append(dieuKienChuyenDich);
		sb.append(", hanhDongXuLy=");
		sb.append(hanhDongXuLy);
		sb.append(", soNgayXuLy=");
		sb.append(soNgayXuLy);
		sb.append(", phanNhomHoSoId=");
		sb.append(phanNhomHoSoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaChuyenDichTrangThai toEntityModel() {
		MotCuaChuyenDichTrangThaiImpl motCuaChuyenDichTrangThaiImpl = new MotCuaChuyenDichTrangThaiImpl();

		motCuaChuyenDichTrangThaiImpl.setId(id);
		motCuaChuyenDichTrangThaiImpl.setTrangThaiNguonId(trangThaiNguonId);
		motCuaChuyenDichTrangThaiImpl.setTrangThaiDichId(trangThaiDichId);

		if (dieuKienChuyenDich == null) {
			motCuaChuyenDichTrangThaiImpl.setDieuKienChuyenDich(StringPool.BLANK);
		}
		else {
			motCuaChuyenDichTrangThaiImpl.setDieuKienChuyenDich(dieuKienChuyenDich);
		}

		if (hanhDongXuLy == null) {
			motCuaChuyenDichTrangThaiImpl.setHanhDongXuLy(StringPool.BLANK);
		}
		else {
			motCuaChuyenDichTrangThaiImpl.setHanhDongXuLy(hanhDongXuLy);
		}

		motCuaChuyenDichTrangThaiImpl.setSoNgayXuLy(soNgayXuLy);
		motCuaChuyenDichTrangThaiImpl.setPhanNhomHoSoId(phanNhomHoSoId);

		motCuaChuyenDichTrangThaiImpl.resetOriginalValues();

		return motCuaChuyenDichTrangThaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		trangThaiNguonId = objectInput.readLong();
		trangThaiDichId = objectInput.readLong();
		dieuKienChuyenDich = objectInput.readUTF();
		hanhDongXuLy = objectInput.readUTF();
		soNgayXuLy = objectInput.readInt();
		phanNhomHoSoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(trangThaiNguonId);
		objectOutput.writeLong(trangThaiDichId);

		if (dieuKienChuyenDich == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dieuKienChuyenDich);
		}

		if (hanhDongXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hanhDongXuLy);
		}

		objectOutput.writeInt(soNgayXuLy);
		objectOutput.writeLong(phanNhomHoSoId);
	}

	public long id;
	public long trangThaiNguonId;
	public long trangThaiDichId;
	public String dieuKienChuyenDich;
	public String hanhDongXuLy;
	public int soNgayXuLy;
	public long phanNhomHoSoId;
}