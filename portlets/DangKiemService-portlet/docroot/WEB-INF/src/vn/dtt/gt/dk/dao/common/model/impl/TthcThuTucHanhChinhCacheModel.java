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

import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcThuTucHanhChinh in entity cache.
 *
 * @author huymq
 * @see TthcThuTucHanhChinh
 * @generated
 */
public class TthcThuTucHanhChinhCacheModel implements CacheModel<TthcThuTucHanhChinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", maThuTuc=");
		sb.append(maThuTuc);
		sb.append(", tenThuTuc=");
		sb.append(tenThuTuc);
		sb.append(", trinhTuThucHien=");
		sb.append(trinhTuThucHien);
		sb.append(", cachThucThucHien=");
		sb.append(cachThucThucHien);
		sb.append(", thanhPhanHoSo=");
		sb.append(thanhPhanHoSo);
		sb.append(", dieuKienThucHien=");
		sb.append(dieuKienThucHien);
		sb.append(", thoiHanGiaiQuyet=");
		sb.append(thoiHanGiaiQuyet);
		sb.append(", doiTuongThucHien=");
		sb.append(doiTuongThucHien);
		sb.append(", ketQuaXuLy=");
		sb.append(ketQuaXuLy);
		sb.append(", canCuPhapLy=");
		sb.append(canCuPhapLy);
		sb.append(", lePhi=");
		sb.append(lePhi);
		sb.append(", coQuanQlttId=");
		sb.append(coQuanQlttId);
		sb.append(", linhVucThuTucId=");
		sb.append(linhVucThuTucId);
		sb.append(", ngayCoHieuLuc=");
		sb.append(ngayCoHieuLuc);
		sb.append(", ngayHetHieuLuc=");
		sb.append(ngayHetHieuLuc);
		sb.append(", huongDanThucHien=");
		sb.append(huongDanThucHien);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcThuTucHanhChinh toEntityModel() {
		TthcThuTucHanhChinhImpl tthcThuTucHanhChinhImpl = new TthcThuTucHanhChinhImpl();

		tthcThuTucHanhChinhImpl.setId(Id);

		if (maThuTuc == null) {
			tthcThuTucHanhChinhImpl.setMaThuTuc(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setMaThuTuc(maThuTuc);
		}

		if (tenThuTuc == null) {
			tthcThuTucHanhChinhImpl.setTenThuTuc(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setTenThuTuc(tenThuTuc);
		}

		if (trinhTuThucHien == null) {
			tthcThuTucHanhChinhImpl.setTrinhTuThucHien(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setTrinhTuThucHien(trinhTuThucHien);
		}

		if (cachThucThucHien == null) {
			tthcThuTucHanhChinhImpl.setCachThucThucHien(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setCachThucThucHien(cachThucThucHien);
		}

		if (thanhPhanHoSo == null) {
			tthcThuTucHanhChinhImpl.setThanhPhanHoSo(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setThanhPhanHoSo(thanhPhanHoSo);
		}

		if (dieuKienThucHien == null) {
			tthcThuTucHanhChinhImpl.setDieuKienThucHien(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setDieuKienThucHien(dieuKienThucHien);
		}

		if (thoiHanGiaiQuyet == null) {
			tthcThuTucHanhChinhImpl.setThoiHanGiaiQuyet(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setThoiHanGiaiQuyet(thoiHanGiaiQuyet);
		}

		if (doiTuongThucHien == null) {
			tthcThuTucHanhChinhImpl.setDoiTuongThucHien(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setDoiTuongThucHien(doiTuongThucHien);
		}

		if (ketQuaXuLy == null) {
			tthcThuTucHanhChinhImpl.setKetQuaXuLy(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setKetQuaXuLy(ketQuaXuLy);
		}

		if (canCuPhapLy == null) {
			tthcThuTucHanhChinhImpl.setCanCuPhapLy(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setCanCuPhapLy(canCuPhapLy);
		}

		if (lePhi == null) {
			tthcThuTucHanhChinhImpl.setLePhi(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setLePhi(lePhi);
		}

		tthcThuTucHanhChinhImpl.setCoQuanQlttId(coQuanQlttId);
		tthcThuTucHanhChinhImpl.setLinhVucThuTucId(linhVucThuTucId);

		if (ngayCoHieuLuc == Long.MIN_VALUE) {
			tthcThuTucHanhChinhImpl.setNgayCoHieuLuc(null);
		}
		else {
			tthcThuTucHanhChinhImpl.setNgayCoHieuLuc(new Date(ngayCoHieuLuc));
		}

		if (ngayHetHieuLuc == Long.MIN_VALUE) {
			tthcThuTucHanhChinhImpl.setNgayHetHieuLuc(null);
		}
		else {
			tthcThuTucHanhChinhImpl.setNgayHetHieuLuc(new Date(ngayHetHieuLuc));
		}

		if (huongDanThucHien == null) {
			tthcThuTucHanhChinhImpl.setHuongDanThucHien(StringPool.BLANK);
		}
		else {
			tthcThuTucHanhChinhImpl.setHuongDanThucHien(huongDanThucHien);
		}

		tthcThuTucHanhChinhImpl.resetOriginalValues();

		return tthcThuTucHanhChinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		maThuTuc = objectInput.readUTF();
		tenThuTuc = objectInput.readUTF();
		trinhTuThucHien = objectInput.readUTF();
		cachThucThucHien = objectInput.readUTF();
		thanhPhanHoSo = objectInput.readUTF();
		dieuKienThucHien = objectInput.readUTF();
		thoiHanGiaiQuyet = objectInput.readUTF();
		doiTuongThucHien = objectInput.readUTF();
		ketQuaXuLy = objectInput.readUTF();
		canCuPhapLy = objectInput.readUTF();
		lePhi = objectInput.readUTF();
		coQuanQlttId = objectInput.readLong();
		linhVucThuTucId = objectInput.readLong();
		ngayCoHieuLuc = objectInput.readLong();
		ngayHetHieuLuc = objectInput.readLong();
		huongDanThucHien = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (maThuTuc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maThuTuc);
		}

		if (tenThuTuc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenThuTuc);
		}

		if (trinhTuThucHien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trinhTuThucHien);
		}

		if (cachThucThucHien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cachThucThucHien);
		}

		if (thanhPhanHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thanhPhanHoSo);
		}

		if (dieuKienThucHien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dieuKienThucHien);
		}

		if (thoiHanGiaiQuyet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thoiHanGiaiQuyet);
		}

		if (doiTuongThucHien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doiTuongThucHien);
		}

		if (ketQuaXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ketQuaXuLy);
		}

		if (canCuPhapLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(canCuPhapLy);
		}

		if (lePhi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lePhi);
		}

		objectOutput.writeLong(coQuanQlttId);
		objectOutput.writeLong(linhVucThuTucId);
		objectOutput.writeLong(ngayCoHieuLuc);
		objectOutput.writeLong(ngayHetHieuLuc);

		if (huongDanThucHien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(huongDanThucHien);
		}
	}

	public long Id;
	public String maThuTuc;
	public String tenThuTuc;
	public String trinhTuThucHien;
	public String cachThucThucHien;
	public String thanhPhanHoSo;
	public String dieuKienThucHien;
	public String thoiHanGiaiQuyet;
	public String doiTuongThucHien;
	public String ketQuaXuLy;
	public String canCuPhapLy;
	public String lePhi;
	public long coQuanQlttId;
	public long linhVucThuTucId;
	public long ngayCoHieuLuc;
	public long ngayHetHieuLuc;
	public String huongDanThucHien;
}