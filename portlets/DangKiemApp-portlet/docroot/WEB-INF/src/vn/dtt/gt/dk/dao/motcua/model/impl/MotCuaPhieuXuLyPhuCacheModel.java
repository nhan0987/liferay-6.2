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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MotCuaPhieuXuLyPhu in entity cache.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPhu
 * @generated
 */
public class MotCuaPhieuXuLyPhuCacheModel implements CacheModel<MotCuaPhieuXuLyPhu>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", phieuXuLyChinhId=");
		sb.append(phieuXuLyChinhId);
		sb.append(", trichYeuNoiDung=");
		sb.append(trichYeuNoiDung);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", trangThaiHienTaiId=");
		sb.append(trangThaiHienTaiId);
		sb.append(", noiDungHoSoId=");
		sb.append(noiDungHoSoId);
		sb.append(", chiemQuyenXuLy=");
		sb.append(chiemQuyenXuLy);
		sb.append(", ngayTaoPhieu=");
		sb.append(ngayTaoPhieu);
		sb.append(", nguoiTaoPhieu=");
		sb.append(nguoiTaoPhieu);
		sb.append(", nhomPhieuXuLy=");
		sb.append(nhomPhieuXuLy);
		sb.append(", phanNhomHoSoId=");
		sb.append(phanNhomHoSoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaPhieuXuLyPhu toEntityModel() {
		MotCuaPhieuXuLyPhuImpl motCuaPhieuXuLyPhuImpl = new MotCuaPhieuXuLyPhuImpl();

		motCuaPhieuXuLyPhuImpl.setId(id);
		motCuaPhieuXuLyPhuImpl.setPhieuXuLyChinhId(phieuXuLyChinhId);

		if (trichYeuNoiDung == null) {
			motCuaPhieuXuLyPhuImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyPhuImpl.setTrichYeuNoiDung(trichYeuNoiDung);
		}

		if (ghiChu == null) {
			motCuaPhieuXuLyPhuImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyPhuImpl.setGhiChu(ghiChu);
		}

		motCuaPhieuXuLyPhuImpl.setTrangThaiHienTaiId(trangThaiHienTaiId);
		motCuaPhieuXuLyPhuImpl.setNoiDungHoSoId(noiDungHoSoId);
		motCuaPhieuXuLyPhuImpl.setChiemQuyenXuLy(chiemQuyenXuLy);

		if (ngayTaoPhieu == Long.MIN_VALUE) {
			motCuaPhieuXuLyPhuImpl.setNgayTaoPhieu(null);
		}
		else {
			motCuaPhieuXuLyPhuImpl.setNgayTaoPhieu(new Date(ngayTaoPhieu));
		}

		motCuaPhieuXuLyPhuImpl.setNguoiTaoPhieu(nguoiTaoPhieu);

		if (nhomPhieuXuLy == null) {
			motCuaPhieuXuLyPhuImpl.setNhomPhieuXuLy(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyPhuImpl.setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		motCuaPhieuXuLyPhuImpl.setPhanNhomHoSoId(phanNhomHoSoId);

		motCuaPhieuXuLyPhuImpl.resetOriginalValues();

		return motCuaPhieuXuLyPhuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		phieuXuLyChinhId = objectInput.readLong();
		trichYeuNoiDung = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		trangThaiHienTaiId = objectInput.readLong();
		noiDungHoSoId = objectInput.readLong();
		chiemQuyenXuLy = objectInput.readLong();
		ngayTaoPhieu = objectInput.readLong();
		nguoiTaoPhieu = objectInput.readLong();
		nhomPhieuXuLy = objectInput.readUTF();
		phanNhomHoSoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(phieuXuLyChinhId);

		if (trichYeuNoiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trichYeuNoiDung);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(trangThaiHienTaiId);
		objectOutput.writeLong(noiDungHoSoId);
		objectOutput.writeLong(chiemQuyenXuLy);
		objectOutput.writeLong(ngayTaoPhieu);
		objectOutput.writeLong(nguoiTaoPhieu);

		if (nhomPhieuXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhomPhieuXuLy);
		}

		objectOutput.writeLong(phanNhomHoSoId);
	}

	public long id;
	public long phieuXuLyChinhId;
	public String trichYeuNoiDung;
	public String ghiChu;
	public long trangThaiHienTaiId;
	public long noiDungHoSoId;
	public long chiemQuyenXuLy;
	public long ngayTaoPhieu;
	public long nguoiTaoPhieu;
	public String nhomPhieuXuLy;
	public long phanNhomHoSoId;
}