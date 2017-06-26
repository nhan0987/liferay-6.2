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

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcHoSoThuTuc in entity cache.
 *
 * @author win_64
 * @see TthcHoSoThuTuc
 * @generated
 */
public class TthcHoSoThuTucCacheModel implements CacheModel<TthcHoSoThuTuc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", MaSoHoSo=");
		sb.append(MaSoHoSo);
		sb.append(", MaBienNhan=");
		sb.append(MaBienNhan);
		sb.append(", ThuTucHanhChinhId=");
		sb.append(ThuTucHanhChinhId);
		sb.append(", LoaiChuHoSo=");
		sb.append(LoaiChuHoSo);
		sb.append(", MaSoChuHoSo=");
		sb.append(MaSoChuHoSo);
		sb.append(", TenChuHoSo=");
		sb.append(TenChuHoSo);
		sb.append(", DiaChiChuHoSo=");
		sb.append(DiaChiChuHoSo);
		sb.append(", TrichYeuNoiDung=");
		sb.append(TrichYeuNoiDung);
		sb.append(", NgayGuiHoSo=");
		sb.append(NgayGuiHoSo);
		sb.append(", NgayTiepNhan=");
		sb.append(NgayTiepNhan);
		sb.append(", NgayBoSung=");
		sb.append(NgayBoSung);
		sb.append(", NgayHenTra=");
		sb.append(NgayHenTra);
		sb.append(", NgayTraKetQua=");
		sb.append(NgayTraKetQua);
		sb.append(", NgayDongHoSo=");
		sb.append(NgayDongHoSo);
		sb.append(", TrangThaiHoSo=");
		sb.append(TrangThaiHoSo);
		sb.append(", PhanNhomHoSoId=");
		sb.append(PhanNhomHoSoId);
		sb.append(", MaDonViTiepNhan=");
		sb.append(MaDonViTiepNhan);
		sb.append(", TenDonViTiepNhan=");
		sb.append(TenDonViTiepNhan);
		sb.append(", ToChucQuanLy=");
		sb.append(ToChucQuanLy);
		sb.append(", NgayTao=");
		sb.append(NgayTao);
		sb.append(", NguoiTao=");
		sb.append(NguoiTao);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", lanGuiCuoi=");
		sb.append(lanGuiCuoi);
		sb.append(", SynchDate=");
		sb.append(SynchDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcHoSoThuTuc toEntityModel() {
		TthcHoSoThuTucImpl tthcHoSoThuTucImpl = new TthcHoSoThuTucImpl();

		tthcHoSoThuTucImpl.setId(Id);

		if (MaSoHoSo == null) {
			tthcHoSoThuTucImpl.setMaSoHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaSoHoSo(MaSoHoSo);
		}

		if (MaBienNhan == null) {
			tthcHoSoThuTucImpl.setMaBienNhan(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaBienNhan(MaBienNhan);
		}

		tthcHoSoThuTucImpl.setThuTucHanhChinhId(ThuTucHanhChinhId);
		tthcHoSoThuTucImpl.setLoaiChuHoSo(LoaiChuHoSo);

		if (MaSoChuHoSo == null) {
			tthcHoSoThuTucImpl.setMaSoChuHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaSoChuHoSo(MaSoChuHoSo);
		}

		if (TenChuHoSo == null) {
			tthcHoSoThuTucImpl.setTenChuHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setTenChuHoSo(TenChuHoSo);
		}

		if (DiaChiChuHoSo == null) {
			tthcHoSoThuTucImpl.setDiaChiChuHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setDiaChiChuHoSo(DiaChiChuHoSo);
		}

		if (TrichYeuNoiDung == null) {
			tthcHoSoThuTucImpl.setTrichYeuNoiDung(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setTrichYeuNoiDung(TrichYeuNoiDung);
		}

		if (NgayGuiHoSo == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayGuiHoSo(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayGuiHoSo(new Date(NgayGuiHoSo));
		}

		if (NgayTiepNhan == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayTiepNhan(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayTiepNhan(new Date(NgayTiepNhan));
		}

		if (NgayBoSung == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayBoSung(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayBoSung(new Date(NgayBoSung));
		}

		if (NgayHenTra == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayHenTra(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayHenTra(new Date(NgayHenTra));
		}

		if (NgayTraKetQua == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayTraKetQua(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayTraKetQua(new Date(NgayTraKetQua));
		}

		if (NgayDongHoSo == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayDongHoSo(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayDongHoSo(new Date(NgayDongHoSo));
		}

		if (TrangThaiHoSo == null) {
			tthcHoSoThuTucImpl.setTrangThaiHoSo(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setTrangThaiHoSo(TrangThaiHoSo);
		}

		tthcHoSoThuTucImpl.setPhanNhomHoSoId(PhanNhomHoSoId);

		if (MaDonViTiepNhan == null) {
			tthcHoSoThuTucImpl.setMaDonViTiepNhan(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setMaDonViTiepNhan(MaDonViTiepNhan);
		}

		if (TenDonViTiepNhan == null) {
			tthcHoSoThuTucImpl.setTenDonViTiepNhan(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setTenDonViTiepNhan(TenDonViTiepNhan);
		}

		tthcHoSoThuTucImpl.setToChucQuanLy(ToChucQuanLy);

		if (NgayTao == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setNgayTao(null);
		}
		else {
			tthcHoSoThuTucImpl.setNgayTao(new Date(NgayTao));
		}

		tthcHoSoThuTucImpl.setNguoiTao(NguoiTao);

		if (ghiChu == null) {
			tthcHoSoThuTucImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			tthcHoSoThuTucImpl.setGhiChu(ghiChu);
		}

		tthcHoSoThuTucImpl.setLanGuiCuoi(lanGuiCuoi);

		if (SynchDate == Long.MIN_VALUE) {
			tthcHoSoThuTucImpl.setSynchDate(null);
		}
		else {
			tthcHoSoThuTucImpl.setSynchDate(new Date(SynchDate));
		}

		tthcHoSoThuTucImpl.resetOriginalValues();

		return tthcHoSoThuTucImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		MaSoHoSo = objectInput.readUTF();
		MaBienNhan = objectInput.readUTF();
		ThuTucHanhChinhId = objectInput.readLong();
		LoaiChuHoSo = objectInput.readLong();
		MaSoChuHoSo = objectInput.readUTF();
		TenChuHoSo = objectInput.readUTF();
		DiaChiChuHoSo = objectInput.readUTF();
		TrichYeuNoiDung = objectInput.readUTF();
		NgayGuiHoSo = objectInput.readLong();
		NgayTiepNhan = objectInput.readLong();
		NgayBoSung = objectInput.readLong();
		NgayHenTra = objectInput.readLong();
		NgayTraKetQua = objectInput.readLong();
		NgayDongHoSo = objectInput.readLong();
		TrangThaiHoSo = objectInput.readUTF();
		PhanNhomHoSoId = objectInput.readLong();
		MaDonViTiepNhan = objectInput.readUTF();
		TenDonViTiepNhan = objectInput.readUTF();
		ToChucQuanLy = objectInput.readLong();
		NgayTao = objectInput.readLong();
		NguoiTao = objectInput.readLong();
		ghiChu = objectInput.readUTF();
		lanGuiCuoi = objectInput.readLong();
		SynchDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (MaSoHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaSoHoSo);
		}

		if (MaBienNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaBienNhan);
		}

		objectOutput.writeLong(ThuTucHanhChinhId);
		objectOutput.writeLong(LoaiChuHoSo);

		if (MaSoChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaSoChuHoSo);
		}

		if (TenChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenChuHoSo);
		}

		if (DiaChiChuHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DiaChiChuHoSo);
		}

		if (TrichYeuNoiDung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TrichYeuNoiDung);
		}

		objectOutput.writeLong(NgayGuiHoSo);
		objectOutput.writeLong(NgayTiepNhan);
		objectOutput.writeLong(NgayBoSung);
		objectOutput.writeLong(NgayHenTra);
		objectOutput.writeLong(NgayTraKetQua);
		objectOutput.writeLong(NgayDongHoSo);

		if (TrangThaiHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TrangThaiHoSo);
		}

		objectOutput.writeLong(PhanNhomHoSoId);

		if (MaDonViTiepNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaDonViTiepNhan);
		}

		if (TenDonViTiepNhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenDonViTiepNhan);
		}

		objectOutput.writeLong(ToChucQuanLy);
		objectOutput.writeLong(NgayTao);
		objectOutput.writeLong(NguoiTao);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeLong(lanGuiCuoi);
		objectOutput.writeLong(SynchDate);
	}

	public long Id;
	public String MaSoHoSo;
	public String MaBienNhan;
	public long ThuTucHanhChinhId;
	public long LoaiChuHoSo;
	public String MaSoChuHoSo;
	public String TenChuHoSo;
	public String DiaChiChuHoSo;
	public String TrichYeuNoiDung;
	public long NgayGuiHoSo;
	public long NgayTiepNhan;
	public long NgayBoSung;
	public long NgayHenTra;
	public long NgayTraKetQua;
	public long NgayDongHoSo;
	public String TrangThaiHoSo;
	public long PhanNhomHoSoId;
	public String MaDonViTiepNhan;
	public String TenDonViTiepNhan;
	public long ToChucQuanLy;
	public long NgayTao;
	public long NguoiTao;
	public String ghiChu;
	public long lanGuiCuoi;
	public long SynchDate;
}