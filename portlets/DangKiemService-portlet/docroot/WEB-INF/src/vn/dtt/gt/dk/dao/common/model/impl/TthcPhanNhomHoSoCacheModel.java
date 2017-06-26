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

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcPhanNhomHoSo in entity cache.
 *
 * @author huymq
 * @see TthcPhanNhomHoSo
 * @generated
 */
public class TthcPhanNhomHoSoCacheModel implements CacheModel<TthcPhanNhomHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", MaPhanNhom=");
		sb.append(MaPhanNhom);
		sb.append(", TenPhanNhom=");
		sb.append(TenPhanNhom);
		sb.append(", TenTiengAnh=");
		sb.append(TenTiengAnh);
		sb.append(", loaiPhieuXuLy=");
		sb.append(loaiPhieuXuLy);
		sb.append(", SoThuTu=");
		sb.append(SoThuTu);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcPhanNhomHoSo toEntityModel() {
		TthcPhanNhomHoSoImpl tthcPhanNhomHoSoImpl = new TthcPhanNhomHoSoImpl();

		tthcPhanNhomHoSoImpl.setId(Id);

		if (MaPhanNhom == null) {
			tthcPhanNhomHoSoImpl.setMaPhanNhom(StringPool.BLANK);
		}
		else {
			tthcPhanNhomHoSoImpl.setMaPhanNhom(MaPhanNhom);
		}

		if (TenPhanNhom == null) {
			tthcPhanNhomHoSoImpl.setTenPhanNhom(StringPool.BLANK);
		}
		else {
			tthcPhanNhomHoSoImpl.setTenPhanNhom(TenPhanNhom);
		}

		if (TenTiengAnh == null) {
			tthcPhanNhomHoSoImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcPhanNhomHoSoImpl.setTenTiengAnh(TenTiengAnh);
		}

		tthcPhanNhomHoSoImpl.setLoaiPhieuXuLy(loaiPhieuXuLy);
		tthcPhanNhomHoSoImpl.setSoThuTu(SoThuTu);

		if (synchdate == Long.MIN_VALUE) {
			tthcPhanNhomHoSoImpl.setSynchdate(null);
		}
		else {
			tthcPhanNhomHoSoImpl.setSynchdate(new Date(synchdate));
		}

		tthcPhanNhomHoSoImpl.resetOriginalValues();

		return tthcPhanNhomHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		MaPhanNhom = objectInput.readUTF();
		TenPhanNhom = objectInput.readUTF();
		TenTiengAnh = objectInput.readUTF();
		loaiPhieuXuLy = objectInput.readInt();
		SoThuTu = objectInput.readInt();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (MaPhanNhom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaPhanNhom);
		}

		if (TenPhanNhom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenPhanNhom);
		}

		if (TenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenTiengAnh);
		}

		objectOutput.writeInt(loaiPhieuXuLy);
		objectOutput.writeInt(SoThuTu);
		objectOutput.writeLong(synchdate);
	}

	public long Id;
	public String MaPhanNhom;
	public String TenPhanNhom;
	public String TenTiengAnh;
	public int loaiPhieuXuLy;
	public int SoThuTu;
	public long synchdate;
}