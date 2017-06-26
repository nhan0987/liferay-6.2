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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MotCuaPhieuXuLyChinh in entity cache.
 *
 * @author huymq
 * @see MotCuaPhieuXuLyChinh
 * @generated
 */
public class MotCuaPhieuXuLyChinhCacheModel implements CacheModel<MotCuaPhieuXuLyChinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaPhieuXuLyChinh toEntityModel() {
		MotCuaPhieuXuLyChinhImpl motCuaPhieuXuLyChinhImpl = new MotCuaPhieuXuLyChinhImpl();

		motCuaPhieuXuLyChinhImpl.setId(id);
		motCuaPhieuXuLyChinhImpl.setHoSoThuTucId(hoSoThuTucId);
		motCuaPhieuXuLyChinhImpl.setQuyTrinhThuTucId(quyTrinhThuTucId);

		if (tenNguoiNop == null) {
			motCuaPhieuXuLyChinhImpl.setTenNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setTenNguoiNop(tenNguoiNop);
		}

		if (cmndNguoiNop == null) {
			motCuaPhieuXuLyChinhImpl.setCmndNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setCmndNguoiNop(cmndNguoiNop);
		}

		if (diaChiNguoiNop == null) {
			motCuaPhieuXuLyChinhImpl.setDiaChiNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setDiaChiNguoiNop(diaChiNguoiNop);
		}

		if (soDtddNguoiNop == null) {
			motCuaPhieuXuLyChinhImpl.setSoDtddNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setSoDtddNguoiNop(soDtddNguoiNop);
		}

		if (emailNguoiNop == null) {
			motCuaPhieuXuLyChinhImpl.setEmailNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setEmailNguoiNop(emailNguoiNop);
		}

		if (ghiChu == null) {
			motCuaPhieuXuLyChinhImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setGhiChu(ghiChu);
		}

		motCuaPhieuXuLyChinhImpl.setTrangThaiHienTaiId(trangThaiHienTaiId);
		motCuaPhieuXuLyChinhImpl.setHetHoSoCon(hetHoSoCon);
		motCuaPhieuXuLyChinhImpl.setChiemQuyenXuLy(chiemQuyenXuLy);

		if (ngayTaoPhieu == Long.MIN_VALUE) {
			motCuaPhieuXuLyChinhImpl.setNgayTaoPhieu(null);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setNgayTaoPhieu(new Date(ngayTaoPhieu));
		}

		motCuaPhieuXuLyChinhImpl.setNguoiTaoPhieu(nguoiTaoPhieu);

		if (soDtcdNguoiNop == null) {
			motCuaPhieuXuLyChinhImpl.setSoDtcdNguoiNop(StringPool.BLANK);
		}
		else {
			motCuaPhieuXuLyChinhImpl.setSoDtcdNguoiNop(soDtcdNguoiNop);
		}

		motCuaPhieuXuLyChinhImpl.resetOriginalValues();

		return motCuaPhieuXuLyChinhImpl;
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
}