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

import vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LichKiemTraHienTruong in entity cache.
 *
 * @author huymq
 * @see LichKiemTraHienTruong
 * @generated
 */
public class LichKiemTraHienTruongCacheModel implements CacheModel<LichKiemTraHienTruong>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

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
		sb.append(", confirmedinspectionId=");
		sb.append(confirmedinspectionId);
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
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", inspectionDistrictCode=");
		sb.append(inspectionDistrictCode);
		sb.append(", inspectionProvincecode=");
		sb.append(inspectionProvincecode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LichKiemTraHienTruong toEntityModel() {
		LichKiemTraHienTruongImpl lichKiemTraHienTruongImpl = new LichKiemTraHienTruongImpl();

		lichKiemTraHienTruongImpl.setId(id);
		lichKiemTraHienTruongImpl.setPhieuXuLyChinhId(phieuXuLyChinhId);

		if (trichYeuNoiDung == null) {
			lichKiemTraHienTruongImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setTrichYeuNoiDung(trichYeuNoiDung);
		}

		if (ghiChu == null) {
			lichKiemTraHienTruongImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setGhiChu(ghiChu);
		}

		lichKiemTraHienTruongImpl.setTrangThaiHienTaiId(trangThaiHienTaiId);
		lichKiemTraHienTruongImpl.setNoiDungHoSoId(noiDungHoSoId);
		lichKiemTraHienTruongImpl.setChiemQuyenXuLy(chiemQuyenXuLy);

		if (ngayTaoPhieu == Long.MIN_VALUE) {
			lichKiemTraHienTruongImpl.setNgayTaoPhieu(null);
		}
		else {
			lichKiemTraHienTruongImpl.setNgayTaoPhieu(new Date(ngayTaoPhieu));
		}

		lichKiemTraHienTruongImpl.setNguoiTaoPhieu(nguoiTaoPhieu);

		if (nhomPhieuXuLy == null) {
			lichKiemTraHienTruongImpl.setNhomPhieuXuLy(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		lichKiemTraHienTruongImpl.setPhanNhomHoSoId(phanNhomHoSoId);
		lichKiemTraHienTruongImpl.setConfirmedinspectionId(confirmedinspectionId);

		if (maSoHoSo == null) {
			lichKiemTraHienTruongImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setMaSoHoSo(maSoHoSo);
		}

		if (maBienNhan == null) {
			lichKiemTraHienTruongImpl.setMaBienNhan(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setMaBienNhan(maBienNhan);
		}

		lichKiemTraHienTruongImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (tenChuHoSo == null) {
			lichKiemTraHienTruongImpl.setTenChuHoSo(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setTenChuHoSo(tenChuHoSo);
		}

		if (ngayGuiHoSo == Long.MIN_VALUE) {
			lichKiemTraHienTruongImpl.setNgayGuiHoSo(null);
		}
		else {
			lichKiemTraHienTruongImpl.setNgayGuiHoSo(new Date(ngayGuiHoSo));
		}

		if (tenDonViTiepNhan == null) {
			lichKiemTraHienTruongImpl.setTenDonViTiepNhan(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setTenDonViTiepNhan(tenDonViTiepNhan);
		}

		lichKiemTraHienTruongImpl.setAttachedFile(attachedFile);

		if (inspectionDistrictCode == null) {
			lichKiemTraHienTruongImpl.setInspectionDistrictCode(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setInspectionDistrictCode(inspectionDistrictCode);
		}

		if (inspectionProvincecode == null) {
			lichKiemTraHienTruongImpl.setInspectionProvincecode(StringPool.BLANK);
		}
		else {
			lichKiemTraHienTruongImpl.setInspectionProvincecode(inspectionProvincecode);
		}

		lichKiemTraHienTruongImpl.resetOriginalValues();

		return lichKiemTraHienTruongImpl;
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
		confirmedinspectionId = objectInput.readLong();
		maSoHoSo = objectInput.readUTF();
		maBienNhan = objectInput.readUTF();
		thuTucHanhChinhId = objectInput.readLong();
		tenChuHoSo = objectInput.readUTF();
		ngayGuiHoSo = objectInput.readLong();
		tenDonViTiepNhan = objectInput.readUTF();
		attachedFile = objectInput.readLong();
		inspectionDistrictCode = objectInput.readUTF();
		inspectionProvincecode = objectInput.readUTF();
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
		objectOutput.writeLong(confirmedinspectionId);

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

		objectOutput.writeLong(attachedFile);

		if (inspectionDistrictCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionDistrictCode);
		}

		if (inspectionProvincecode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectionProvincecode);
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
	public long confirmedinspectionId;
	public String maSoHoSo;
	public String maBienNhan;
	public long thuTucHanhChinhId;
	public String tenChuHoSo;
	public long ngayGuiHoSo;
	public String tenDonViTiepNhan;
	public long attachedFile;
	public String inspectionDistrictCode;
	public String inspectionProvincecode;
}