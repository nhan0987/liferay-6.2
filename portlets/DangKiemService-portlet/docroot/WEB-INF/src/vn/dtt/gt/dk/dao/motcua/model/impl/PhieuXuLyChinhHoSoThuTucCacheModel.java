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

import vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PhieuXuLyChinhHoSoThuTuc in entity cache.
 *
 * @author huymq
 * @see PhieuXuLyChinhHoSoThuTuc
 * @generated
 */
public class PhieuXuLyChinhHoSoThuTucCacheModel implements CacheModel<PhieuXuLyChinhHoSoThuTuc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", quyTrinhThuTucId=");
		sb.append(quyTrinhThuTucId);
		sb.append(", tenNguoiNop=");
		sb.append(tenNguoiNop);
		sb.append(", cmndNguoiNop=");
		sb.append(cmndNguoiNop);
		sb.append(", diaChiNguoiNop=");
		sb.append(diaChiNguoiNop);
		sb.append(", soDtddNguoiNop=");
		sb.append(soDtddNguoiNop);
		sb.append(", emailNguoiNop=");
		sb.append(emailNguoiNop);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", trangThaiHienTaiId=");
		sb.append(trangThaiHienTaiId);
		sb.append(", hetHoSoCon=");
		sb.append(hetHoSoCon);
		sb.append(", chiemQuyenXuLy=");
		sb.append(chiemQuyenXuLy);
		sb.append(", ngayTaoPhieu=");
		sb.append(ngayTaoPhieu);
		sb.append(", nguoiTaoPhieu=");
		sb.append(nguoiTaoPhieu);
		sb.append(", soDtcdNguoiNop=");
		sb.append(soDtcdNguoiNop);
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
	public PhieuXuLyChinhHoSoThuTuc toEntityModel() {
		PhieuXuLyChinhHoSoThuTucImpl phieuXuLyChinhHoSoThuTucImpl = new PhieuXuLyChinhHoSoThuTucImpl();

		phieuXuLyChinhHoSoThuTucImpl.setId(id);
		phieuXuLyChinhHoSoThuTucImpl.setHoSoThuTucId(hoSoThuTucId);
		phieuXuLyChinhHoSoThuTucImpl.setQuyTrinhThuTucId(quyTrinhThuTucId);

		if (tenNguoiNop == null) {
			phieuXuLyChinhHoSoThuTucImpl.setTenNguoiNop(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setTenNguoiNop(tenNguoiNop);
		}

		if (cmndNguoiNop == null) {
			phieuXuLyChinhHoSoThuTucImpl.setCmndNguoiNop(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setCmndNguoiNop(cmndNguoiNop);
		}

		if (diaChiNguoiNop == null) {
			phieuXuLyChinhHoSoThuTucImpl.setDiaChiNguoiNop(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setDiaChiNguoiNop(diaChiNguoiNop);
		}

		if (soDtddNguoiNop == null) {
			phieuXuLyChinhHoSoThuTucImpl.setSoDtddNguoiNop(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setSoDtddNguoiNop(soDtddNguoiNop);
		}

		if (emailNguoiNop == null) {
			phieuXuLyChinhHoSoThuTucImpl.setEmailNguoiNop(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setEmailNguoiNop(emailNguoiNop);
		}

		if (ghiChu == null) {
			phieuXuLyChinhHoSoThuTucImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setGhiChu(ghiChu);
		}

		phieuXuLyChinhHoSoThuTucImpl.setTrangThaiHienTaiId(trangThaiHienTaiId);
		phieuXuLyChinhHoSoThuTucImpl.setHetHoSoCon(hetHoSoCon);
		phieuXuLyChinhHoSoThuTucImpl.setChiemQuyenXuLy(chiemQuyenXuLy);

		if (ngayTaoPhieu == Long.MIN_VALUE) {
			phieuXuLyChinhHoSoThuTucImpl.setNgayTaoPhieu(null);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setNgayTaoPhieu(new Date(ngayTaoPhieu));
		}

		phieuXuLyChinhHoSoThuTucImpl.setNguoiTaoPhieu(nguoiTaoPhieu);

		if (soDtcdNguoiNop == null) {
			phieuXuLyChinhHoSoThuTucImpl.setSoDtcdNguoiNop(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setSoDtcdNguoiNop(soDtcdNguoiNop);
		}

		if (maSoHoSo == null) {
			phieuXuLyChinhHoSoThuTucImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setMaSoHoSo(maSoHoSo);
		}

		if (maBienNhan == null) {
			phieuXuLyChinhHoSoThuTucImpl.setMaBienNhan(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setMaBienNhan(maBienNhan);
		}

		phieuXuLyChinhHoSoThuTucImpl.setThuTucHanhChinhId(thuTucHanhChinhId);

		if (tenChuHoSo == null) {
			phieuXuLyChinhHoSoThuTucImpl.setTenChuHoSo(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setTenChuHoSo(tenChuHoSo);
		}

		if (ngayGuiHoSo == Long.MIN_VALUE) {
			phieuXuLyChinhHoSoThuTucImpl.setNgayGuiHoSo(null);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setNgayGuiHoSo(new Date(ngayGuiHoSo));
		}

		if (tenDonViTiepNhan == null) {
			phieuXuLyChinhHoSoThuTucImpl.setTenDonViTiepNhan(StringPool.BLANK);
		}
		else {
			phieuXuLyChinhHoSoThuTucImpl.setTenDonViTiepNhan(tenDonViTiepNhan);
		}

		phieuXuLyChinhHoSoThuTucImpl.resetOriginalValues();

		return phieuXuLyChinhHoSoThuTucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		quyTrinhThuTucId = objectInput.readLong();
		tenNguoiNop = objectInput.readUTF();
		cmndNguoiNop = objectInput.readUTF();
		diaChiNguoiNop = objectInput.readUTF();
		soDtddNguoiNop = objectInput.readUTF();
		emailNguoiNop = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		trangThaiHienTaiId = objectInput.readLong();
		hetHoSoCon = objectInput.readLong();
		chiemQuyenXuLy = objectInput.readLong();
		ngayTaoPhieu = objectInput.readLong();
		nguoiTaoPhieu = objectInput.readLong();
		soDtcdNguoiNop = objectInput.readUTF();
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
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(quyTrinhThuTucId);

		if (tenNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenNguoiNop);
		}

		if (cmndNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cmndNguoiNop);
		}

		if (diaChiNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiNguoiNop);
		}

		if (soDtddNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDtddNguoiNop);
		}

		if (emailNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailNguoiNop);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(trangThaiHienTaiId);
		objectOutput.writeLong(hetHoSoCon);
		objectOutput.writeLong(chiemQuyenXuLy);
		objectOutput.writeLong(ngayTaoPhieu);
		objectOutput.writeLong(nguoiTaoPhieu);

		if (soDtcdNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soDtcdNguoiNop);
		}

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
	public long hoSoThuTucId;
	public long quyTrinhThuTucId;
	public String tenNguoiNop;
	public String cmndNguoiNop;
	public String diaChiNguoiNop;
	public String soDtddNguoiNop;
	public String emailNguoiNop;
	public String ghiChu;
	public long trangThaiHienTaiId;
	public long hetHoSoCon;
	public long chiemQuyenXuLy;
	public long ngayTaoPhieu;
	public long nguoiTaoPhieu;
	public String soDtcdNguoiNop;
	public String maSoHoSo;
	public String maBienNhan;
	public long thuTucHanhChinhId;
	public String tenChuHoSo;
	public long ngayGuiHoSo;
	public String tenDonViTiepNhan;
}