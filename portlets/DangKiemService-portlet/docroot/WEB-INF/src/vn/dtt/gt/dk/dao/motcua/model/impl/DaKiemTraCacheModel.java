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

import vn.dtt.gt.dk.dao.motcua.model.DaKiemTra;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DaKiemTra in entity cache.
 *
 * @author huymq
 * @see DaKiemTra
 * @generated
 */
public class DaKiemTraCacheModel implements CacheModel<DaKiemTra>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

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
		sb.append(", maSoHoSo=");
		sb.append(maSoHoSo);
		sb.append(", maBienNhan=");
		sb.append(maBienNhan);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", tenChuHoSo=");
		sb.append(tenChuHoSo);
		sb.append(", ngayGuiHoSo=");
		sb.append(ngayGuiHoSo);
		sb.append(", tenDonViTiepNhan=");
		sb.append(tenDonViTiepNhan);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DaKiemTra toEntityModel() {
		DaKiemTraImpl daKiemTraImpl = new DaKiemTraImpl();

		daKiemTraImpl.setId(id);
		daKiemTraImpl.setPhieuXuLyChinhId(phieuXuLyChinhId);

		if (trichYeuNoiDung == null) {
			daKiemTraImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			daKiemTraImpl.setTrichYeuNoiDung(trichYeuNoiDung);
		}

		if (ghiChu == null) {
			daKiemTraImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			daKiemTraImpl.setGhiChu(ghiChu);
		}

		daKiemTraImpl.setTrangThaiHienTaiId(trangThaiHienTaiId);
		daKiemTraImpl.setNoiDungHoSoId(noiDungHoSoId);
		daKiemTraImpl.setChiemQuyenXuLy(chiemQuyenXuLy);

		if (ngayTaoPhieu == Long.MIN_VALUE) {
			daKiemTraImpl.setNgayTaoPhieu(null);
		}
		else {
			daKiemTraImpl.setNgayTaoPhieu(new Date(ngayTaoPhieu));
		}

		daKiemTraImpl.setNguoiTaoPhieu(nguoiTaoPhieu);

		if (nhomPhieuXuLy == null) {
			daKiemTraImpl.setNhomPhieuXuLy(StringPool.BLANK);
		}
		else {
			daKiemTraImpl.setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		daKiemTraImpl.setPhanNhomHoSoId(phanNhomHoSoId);

		if (maSoHoSo == null) {
			daKiemTraImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			daKiemTraImpl.setMaSoHoSo(maSoHoSo);
		}

		if (maBienNhan == null) {
			daKiemTraImpl.setMaBienNhan(StringPool.BLANK);
		}
		else {
			daKiemTraImpl.setMaBienNhan(maBienNhan);
		}

		daKiemTraImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (tenChuHoSo == null) {
			daKiemTraImpl.setTenChuHoSo(StringPool.BLANK);
		}
		else {
			daKiemTraImpl.setTenChuHoSo(tenChuHoSo);
		}

		if (ngayGuiHoSo == Long.MIN_VALUE) {
			daKiemTraImpl.setNgayGuiHoSo(null);
		}
		else {
			daKiemTraImpl.setNgayGuiHoSo(new Date(ngayGuiHoSo));
		}

		if (tenDonViTiepNhan == null) {
			daKiemTraImpl.setTenDonViTiepNhan(StringPool.BLANK);
		}
		else {
			daKiemTraImpl.setTenDonViTiepNhan(tenDonViTiepNhan);
		}

		daKiemTraImpl.resetOriginalValues();

		return daKiemTraImpl;
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
		maSoHoSo = objectInput.readUTF();
		maBienNhan = objectInput.readUTF();
		thuTucHanhChinhId = objectInput.readLong();
		tenChuHoSo = objectInput.readUTF();
		ngayGuiHoSo = objectInput.readLong();
		tenDonViTiepNhan = objectInput.readUTF();
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

		if (maSoHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoHoSo);
		}

		if (maBienNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maBienNhan);
		}

		objectOutput.writeLong(thuTucHanhChinhId);

		if (tenChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenChuHoSo);
		}

		objectOutput.writeLong(ngayGuiHoSo);

		if (tenDonViTiepNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDonViTiepNhan);
		}
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
	public String maSoHoSo;
	public String maBienNhan;
	public long thuTucHanhChinhId;
	public String tenChuHoSo;
	public long ngayGuiHoSo;
	public String tenDonViTiepNhan;
}