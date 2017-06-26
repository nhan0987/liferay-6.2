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

import vn.dtt.gt.dk.dao.common.model.TimKiemHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TimKiemHoSo in entity cache.
 *
 * @author win_64
 * @see TimKiemHoSo
 * @generated
 */
public class TimKiemHoSoCacheModel implements CacheModel<TimKiemHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maSoHoSo=");
		sb.append(maSoHoSo);
		sb.append(", maBienNhan=");
		sb.append(maBienNhan);
		sb.append(", thuTucHanhChinhId=");
		sb.append(thuTucHanhChinhId);
		sb.append(", loaiChuHoSo=");
		sb.append(loaiChuHoSo);
		sb.append(", maSoChuHoSo=");
		sb.append(maSoChuHoSo);
		sb.append(", tenChuHoSo=");
		sb.append(tenChuHoSo);
		sb.append(", diaChiChuHoSo=");
		sb.append(diaChiChuHoSo);
		sb.append(", trichYeuNoiDung=");
		sb.append(trichYeuNoiDung);
		sb.append(", ngayGuiHoSo=");
		sb.append(ngayGuiHoSo);
		sb.append(", ngayTiepNhan=");
		sb.append(ngayTiepNhan);
		sb.append(", ngayBoSung=");
		sb.append(ngayBoSung);
		sb.append(", ngayHenTra=");
		sb.append(ngayHenTra);
		sb.append(", ngayTraKetQua=");
		sb.append(ngayTraKetQua);
		sb.append(", ngayDongHoSo=");
		sb.append(ngayDongHoSo);
		sb.append(", trangThaiHoSo=");
		sb.append(trangThaiHoSo);
		sb.append(", phanNhomHoSoId=");
		sb.append(phanNhomHoSoId);
		sb.append(", maDonViTiepNhan=");
		sb.append(maDonViTiepNhan);
		sb.append(", tenDonViTiepNhan=");
		sb.append(tenDonViTiepNhan);
		sb.append(", toChucQuanLy=");
		sb.append(toChucQuanLy);
		sb.append(", ngayTao=");
		sb.append(ngayTao);
		sb.append(", nguoiTao=");
		sb.append(nguoiTao);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", lanGuiCuoi=");
		sb.append(lanGuiCuoi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TimKiemHoSo toEntityModel() {
		TimKiemHoSoImpl timKiemHoSoImpl = new TimKiemHoSoImpl();

		timKiemHoSoImpl.setId(id);

		if (maSoHoSo == null) {
			timKiemHoSoImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setMaSoHoSo(maSoHoSo);
		}

		if (maBienNhan == null) {
			timKiemHoSoImpl.setMaBienNhan(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setMaBienNhan(maBienNhan);
		}

		timKiemHoSoImpl.setThuTucHanhChinhId(thuTucHanhChinhId);
		timKiemHoSoImpl.setLoaiChuHoSo(loaiChuHoSo);

		if (maSoChuHoSo == null) {
			timKiemHoSoImpl.setMaSoChuHoSo(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setMaSoChuHoSo(maSoChuHoSo);
		}

		if (tenChuHoSo == null) {
			timKiemHoSoImpl.setTenChuHoSo(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setTenChuHoSo(tenChuHoSo);
		}

		if (diaChiChuHoSo == null) {
			timKiemHoSoImpl.setDiaChiChuHoSo(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setDiaChiChuHoSo(diaChiChuHoSo);
		}

		if (trichYeuNoiDung == null) {
			timKiemHoSoImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setTrichYeuNoiDung(trichYeuNoiDung);
		}

		if (ngayGuiHoSo == Long.MIN_VALUE) {
			timKiemHoSoImpl.setNgayGuiHoSo(null);
		}
		else {
			timKiemHoSoImpl.setNgayGuiHoSo(new Date(ngayGuiHoSo));
		}

		if (ngayTiepNhan == Long.MIN_VALUE) {
			timKiemHoSoImpl.setNgayTiepNhan(null);
		}
		else {
			timKiemHoSoImpl.setNgayTiepNhan(new Date(ngayTiepNhan));
		}

		if (ngayBoSung == Long.MIN_VALUE) {
			timKiemHoSoImpl.setNgayBoSung(null);
		}
		else {
			timKiemHoSoImpl.setNgayBoSung(new Date(ngayBoSung));
		}

		if (ngayHenTra == Long.MIN_VALUE) {
			timKiemHoSoImpl.setNgayHenTra(null);
		}
		else {
			timKiemHoSoImpl.setNgayHenTra(new Date(ngayHenTra));
		}

		if (ngayTraKetQua == Long.MIN_VALUE) {
			timKiemHoSoImpl.setNgayTraKetQua(null);
		}
		else {
			timKiemHoSoImpl.setNgayTraKetQua(new Date(ngayTraKetQua));
		}

		if (ngayDongHoSo == Long.MIN_VALUE) {
			timKiemHoSoImpl.setNgayDongHoSo(null);
		}
		else {
			timKiemHoSoImpl.setNgayDongHoSo(new Date(ngayDongHoSo));
		}

		if (trangThaiHoSo == null) {
			timKiemHoSoImpl.setTrangThaiHoSo(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setTrangThaiHoSo(trangThaiHoSo);
		}

		timKiemHoSoImpl.setPhanNhomHoSoId(phanNhomHoSoId);

		if (maDonViTiepNhan == null) {
			timKiemHoSoImpl.setMaDonViTiepNhan(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setMaDonViTiepNhan(maDonViTiepNhan);
		}

		if (tenDonViTiepNhan == null) {
			timKiemHoSoImpl.setTenDonViTiepNhan(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setTenDonViTiepNhan(tenDonViTiepNhan);
		}

		timKiemHoSoImpl.setToChucQuanLy(toChucQuanLy);

		if (ngayTao == Long.MIN_VALUE) {
			timKiemHoSoImpl.setNgayTao(null);
		}
		else {
			timKiemHoSoImpl.setNgayTao(new Date(ngayTao));
		}

		timKiemHoSoImpl.setNguoiTao(nguoiTao);

		if (ghiChu == null) {
			timKiemHoSoImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			timKiemHoSoImpl.setGhiChu(ghiChu);
		}

		timKiemHoSoImpl.setLanGuiCuoi(lanGuiCuoi);

		timKiemHoSoImpl.resetOriginalValues();

		return timKiemHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maSoHoSo = objectInput.readUTF();
		maBienNhan = objectInput.readUTF();
		thuTucHanhChinhId = objectInput.readLong();
		loaiChuHoSo = objectInput.readLong();
		maSoChuHoSo = objectInput.readUTF();
		tenChuHoSo = objectInput.readUTF();
		diaChiChuHoSo = objectInput.readUTF();
		trichYeuNoiDung = objectInput.readUTF();
		ngayGuiHoSo = objectInput.readLong();
		ngayTiepNhan = objectInput.readLong();
		ngayBoSung = objectInput.readLong();
		ngayHenTra = objectInput.readLong();
		ngayTraKetQua = objectInput.readLong();
		ngayDongHoSo = objectInput.readLong();
		trangThaiHoSo = objectInput.readUTF();
		phanNhomHoSoId = objectInput.readLong();
		maDonViTiepNhan = objectInput.readUTF();
		tenDonViTiepNhan = objectInput.readUTF();
		toChucQuanLy = objectInput.readLong();
		ngayTao = objectInput.readLong();
		nguoiTao = objectInput.readLong();
		ghiChu = objectInput.readUTF();
		lanGuiCuoi = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

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
		objectOutput.writeLong(loaiChuHoSo);

		if (maSoChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoChuHoSo);
		}

		if (tenChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenChuHoSo);
		}

		if (diaChiChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChiChuHoSo);
		}

		if (trichYeuNoiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trichYeuNoiDung);
		}

		objectOutput.writeLong(ngayGuiHoSo);
		objectOutput.writeLong(ngayTiepNhan);
		objectOutput.writeLong(ngayBoSung);
		objectOutput.writeLong(ngayHenTra);
		objectOutput.writeLong(ngayTraKetQua);
		objectOutput.writeLong(ngayDongHoSo);

		if (trangThaiHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThaiHoSo);
		}

		objectOutput.writeLong(phanNhomHoSoId);

		if (maDonViTiepNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maDonViTiepNhan);
		}

		if (tenDonViTiepNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDonViTiepNhan);
		}

		objectOutput.writeLong(toChucQuanLy);
		objectOutput.writeLong(ngayTao);
		objectOutput.writeLong(nguoiTao);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(lanGuiCuoi);
	}

	public long id;
	public String maSoHoSo;
	public String maBienNhan;
	public long thuTucHanhChinhId;
	public long loaiChuHoSo;
	public String maSoChuHoSo;
	public String tenChuHoSo;
	public String diaChiChuHoSo;
	public String trichYeuNoiDung;
	public long ngayGuiHoSo;
	public long ngayTiepNhan;
	public long ngayBoSung;
	public long ngayHenTra;
	public long ngayTraKetQua;
	public long ngayDongHoSo;
	public String trangThaiHoSo;
	public long phanNhomHoSoId;
	public String maDonViTiepNhan;
	public String tenDonViTiepNhan;
	public long toChucQuanLy;
	public long ngayTao;
	public long nguoiTao;
	public String ghiChu;
	public long lanGuiCuoi;
}