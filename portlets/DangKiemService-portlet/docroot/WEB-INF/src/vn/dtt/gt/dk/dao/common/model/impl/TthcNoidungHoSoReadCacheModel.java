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

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcNoidungHoSoRead in entity cache.
 *
 * @author huymq
 * @see TthcNoidungHoSoRead
 * @generated
 */
public class TthcNoidungHoSoReadCacheModel implements CacheModel<TthcNoidungHoSoRead>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", MaTuSinh=");
		sb.append(MaTuSinh);
		sb.append(", HoSoThuTucId=");
		sb.append(HoSoThuTucId);
		sb.append(", TenTaiLieu=");
		sb.append(TenTaiLieu);
		sb.append(", TaiLieuDinhKem=");
		sb.append(TaiLieuDinhKem);
		sb.append(", noiDungFile=");
		sb.append(noiDungFile);
		sb.append(", BieuMauHoSoId=");
		sb.append(BieuMauHoSoId);
		sb.append(", NgayGuiNhan=");
		sb.append(NgayGuiNhan);
		sb.append(", LoaiTaiLieu=");
		sb.append(LoaiTaiLieu);
		sb.append(", NgayTao=");
		sb.append(NgayTao);
		sb.append(", NguoiTao=");
		sb.append(NguoiTao);
		sb.append(", daCapNhat=");
		sb.append(daCapNhat);
		sb.append(", lanGuiCuoi=");
		sb.append(lanGuiCuoi);
		sb.append(", vehicleRecordId=");
		sb.append(vehicleRecordId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcNoidungHoSoRead toEntityModel() {
		TthcNoidungHoSoReadImpl tthcNoidungHoSoReadImpl = new TthcNoidungHoSoReadImpl();

		tthcNoidungHoSoReadImpl.setId(Id);

		if (MaTuSinh == null) {
			tthcNoidungHoSoReadImpl.setMaTuSinh(StringPool.BLANK);
		}
		else {
			tthcNoidungHoSoReadImpl.setMaTuSinh(MaTuSinh);
		}

		tthcNoidungHoSoReadImpl.setHoSoThuTucId(HoSoThuTucId);

		if (TenTaiLieu == null) {
			tthcNoidungHoSoReadImpl.setTenTaiLieu(StringPool.BLANK);
		}
		else {
			tthcNoidungHoSoReadImpl.setTenTaiLieu(TenTaiLieu);
		}

		tthcNoidungHoSoReadImpl.setTaiLieuDinhKem(TaiLieuDinhKem);

		if (noiDungFile == null) {
			tthcNoidungHoSoReadImpl.setNoiDungFile(StringPool.BLANK);
		}
		else {
			tthcNoidungHoSoReadImpl.setNoiDungFile(noiDungFile);
		}

		tthcNoidungHoSoReadImpl.setBieuMauHoSoId(BieuMauHoSoId);

		if (NgayGuiNhan == Long.MIN_VALUE) {
			tthcNoidungHoSoReadImpl.setNgayGuiNhan(null);
		}
		else {
			tthcNoidungHoSoReadImpl.setNgayGuiNhan(new Date(NgayGuiNhan));
		}

		tthcNoidungHoSoReadImpl.setLoaiTaiLieu(LoaiTaiLieu);

		if (NgayTao == Long.MIN_VALUE) {
			tthcNoidungHoSoReadImpl.setNgayTao(null);
		}
		else {
			tthcNoidungHoSoReadImpl.setNgayTao(new Date(NgayTao));
		}

		tthcNoidungHoSoReadImpl.setNguoiTao(NguoiTao);
		tthcNoidungHoSoReadImpl.setDaCapNhat(daCapNhat);
		tthcNoidungHoSoReadImpl.setLanGuiCuoi(lanGuiCuoi);
		tthcNoidungHoSoReadImpl.setVehicleRecordId(vehicleRecordId);

		tthcNoidungHoSoReadImpl.resetOriginalValues();

		return tthcNoidungHoSoReadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		MaTuSinh = objectInput.readUTF();
		HoSoThuTucId = objectInput.readLong();
		TenTaiLieu = objectInput.readUTF();
		TaiLieuDinhKem = objectInput.readLong();
		noiDungFile = objectInput.readUTF();
		BieuMauHoSoId = objectInput.readLong();
		NgayGuiNhan = objectInput.readLong();
		LoaiTaiLieu = objectInput.readLong();
		NgayTao = objectInput.readLong();
		NguoiTao = objectInput.readLong();
		daCapNhat = objectInput.readLong();
		lanGuiCuoi = objectInput.readLong();
		vehicleRecordId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (MaTuSinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaTuSinh);
		}

		objectOutput.writeLong(HoSoThuTucId);

		if (TenTaiLieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenTaiLieu);
		}

		objectOutput.writeLong(TaiLieuDinhKem);

		if (noiDungFile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noiDungFile);
		}

		objectOutput.writeLong(BieuMauHoSoId);
		objectOutput.writeLong(NgayGuiNhan);
		objectOutput.writeLong(LoaiTaiLieu);
		objectOutput.writeLong(NgayTao);
		objectOutput.writeLong(NguoiTao);
		objectOutput.writeLong(daCapNhat);
		objectOutput.writeLong(lanGuiCuoi);
		objectOutput.writeLong(vehicleRecordId);
	}

	public long Id;
	public String MaTuSinh;
	public long HoSoThuTucId;
	public String TenTaiLieu;
	public long TaiLieuDinhKem;
	public String noiDungFile;
	public long BieuMauHoSoId;
	public long NgayGuiNhan;
	public long LoaiTaiLieu;
	public long NgayTao;
	public long NguoiTao;
	public long daCapNhat;
	public long lanGuiCuoi;
	public long vehicleRecordId;
}