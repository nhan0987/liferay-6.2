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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MotCuaDienBienHoSo in entity cache.
 *
 * @author huymq
 * @see MotCuaDienBienHoSo
 * @generated
 */
public class MotCuaDienBienHoSoCacheModel implements CacheModel<MotCuaDienBienHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", phieuXuLyChinhId=");
		sb.append(phieuXuLyChinhId);
		sb.append(", phieuXuLyPhuId=");
		sb.append(phieuXuLyPhuId);
		sb.append(", soNgayQuaHan=");
		sb.append(soNgayQuaHan);
		sb.append(", trangThaiTruocId=");
		sb.append(trangThaiTruocId);
		sb.append(", trangThaiSauId=");
		sb.append(trangThaiSauId);
		sb.append(", ngayXuLy=");
		sb.append(ngayXuLy);
		sb.append(", nguoiXuLy=");
		sb.append(nguoiXuLy);
		sb.append(", hanhDongXuLy=");
		sb.append(hanhDongXuLy);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaDienBienHoSo toEntityModel() {
		MotCuaDienBienHoSoImpl motCuaDienBienHoSoImpl = new MotCuaDienBienHoSoImpl();

		motCuaDienBienHoSoImpl.setId(id);
		motCuaDienBienHoSoImpl.setPhieuXuLyChinhId(phieuXuLyChinhId);
		motCuaDienBienHoSoImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);
		motCuaDienBienHoSoImpl.setSoNgayQuaHan(soNgayQuaHan);
		motCuaDienBienHoSoImpl.setTrangThaiTruocId(trangThaiTruocId);
		motCuaDienBienHoSoImpl.setTrangThaiSauId(trangThaiSauId);

		if (ngayXuLy == Long.MIN_VALUE) {
			motCuaDienBienHoSoImpl.setNgayXuLy(null);
		}
		else {
			motCuaDienBienHoSoImpl.setNgayXuLy(new Date(ngayXuLy));
		}

		motCuaDienBienHoSoImpl.setNguoiXuLy(nguoiXuLy);

		if (hanhDongXuLy == null) {
			motCuaDienBienHoSoImpl.setHanhDongXuLy(StringPool.BLANK);
		}
		else {
			motCuaDienBienHoSoImpl.setHanhDongXuLy(hanhDongXuLy);
		}

		if (synchdate == Long.MIN_VALUE) {
			motCuaDienBienHoSoImpl.setSynchdate(null);
		}
		else {
			motCuaDienBienHoSoImpl.setSynchdate(new Date(synchdate));
		}

		motCuaDienBienHoSoImpl.resetOriginalValues();

		return motCuaDienBienHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		phieuXuLyChinhId = objectInput.readLong();
		phieuXuLyPhuId = objectInput.readLong();
		soNgayQuaHan = objectInput.readInt();
		trangThaiTruocId = objectInput.readLong();
		trangThaiSauId = objectInput.readLong();
		ngayXuLy = objectInput.readLong();
		nguoiXuLy = objectInput.readLong();
		hanhDongXuLy = objectInput.readUTF();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(phieuXuLyChinhId);
		objectOutput.writeLong(phieuXuLyPhuId);
		objectOutput.writeInt(soNgayQuaHan);
		objectOutput.writeLong(trangThaiTruocId);
		objectOutput.writeLong(trangThaiSauId);
		objectOutput.writeLong(ngayXuLy);
		objectOutput.writeLong(nguoiXuLy);

		if (hanhDongXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hanhDongXuLy);
		}

		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long phieuXuLyChinhId;
	public long phieuXuLyPhuId;
	public int soNgayQuaHan;
	public long trangThaiTruocId;
	public long trangThaiSauId;
	public long ngayXuLy;
	public long nguoiXuLy;
	public String hanhDongXuLy;
	public long synchdate;
}