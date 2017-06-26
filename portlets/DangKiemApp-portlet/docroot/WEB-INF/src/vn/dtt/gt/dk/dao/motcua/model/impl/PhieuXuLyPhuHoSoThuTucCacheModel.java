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

import vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PhieuXuLyPhuHoSoThuTuc in entity cache.
 *
 * @author win_64
 * @see PhieuXuLyPhuHoSoThuTuc
 * @generated
 */
public class PhieuXuLyPhuHoSoThuTucCacheModel implements CacheModel<PhieuXuLyPhuHoSoThuTuc>,
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
	public PhieuXuLyPhuHoSoThuTuc toEntityModel() {
		PhieuXuLyPhuHoSoThuTucImpl phieuXuLyPhuHoSoThuTucImpl = new PhieuXuLyPhuHoSoThuTucImpl();

		phieuXuLyPhuHoSoThuTucImpl.setId(id);
		phieuXuLyPhuHoSoThuTucImpl.setPhieuXuLyChinhId(phieuXuLyChinhId);

		if (trichYeuNoiDung == null) {
			phieuXuLyPhuHoSoThuTucImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setTrichYeuNoiDung(trichYeuNoiDung);
		}

		if (ghiChu == null) {
			phieuXuLyPhuHoSoThuTucImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setGhiChu(ghiChu);
		}

		phieuXuLyPhuHoSoThuTucImpl.setTrangThaiHienTaiId(trangThaiHienTaiId);
		phieuXuLyPhuHoSoThuTucImpl.setNoiDungHoSoId(noiDungHoSoId);
		phieuXuLyPhuHoSoThuTucImpl.setChiemQuyenXuLy(chiemQuyenXuLy);

		if (ngayTaoPhieu == Long.MIN_VALUE) {
			phieuXuLyPhuHoSoThuTucImpl.setNgayTaoPhieu(null);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setNgayTaoPhieu(new Date(ngayTaoPhieu));
		}

		phieuXuLyPhuHoSoThuTucImpl.setNguoiTaoPhieu(nguoiTaoPhieu);

		if (nhomPhieuXuLy == null) {
			phieuXuLyPhuHoSoThuTucImpl.setNhomPhieuXuLy(StringPool.BLANK);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		phieuXuLyPhuHoSoThuTucImpl.setPhanNhomHoSoId(phanNhomHoSoId);

		if (maSoHoSo == null) {
			phieuXuLyPhuHoSoThuTucImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setMaSoHoSo(maSoHoSo);
		}

		if (maBienNhan == null) {
			phieuXuLyPhuHoSoThuTucImpl.setMaBienNhan(StringPool.BLANK);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setMaBienNhan(maBienNhan);
		}

		phieuXuLyPhuHoSoThuTucImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (tenChuHoSo == null) {
			phieuXuLyPhuHoSoThuTucImpl.setTenChuHoSo(StringPool.BLANK);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setTenChuHoSo(tenChuHoSo);
		}

		if (ngayGuiHoSo == Long.MIN_VALUE) {
			phieuXuLyPhuHoSoThuTucImpl.setNgayGuiHoSo(null);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setNgayGuiHoSo(new Date(ngayGuiHoSo));
		}

		if (tenDonViTiepNhan == null) {
			phieuXuLyPhuHoSoThuTucImpl.setTenDonViTiepNhan(StringPool.BLANK);
		}
		else {
			phieuXuLyPhuHoSoThuTucImpl.setTenDonViTiepNhan(tenDonViTiepNhan);
		}

		phieuXuLyPhuHoSoThuTucImpl.resetOriginalValues();

		return phieuXuLyPhuHoSoThuTucImpl;
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