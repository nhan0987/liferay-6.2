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

import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcThanhPhanHoSo in entity cache.
 *
 * @author win_64
 * @see TthcThanhPhanHoSo
 * @generated
 */
public class TthcThanhPhanHoSoCacheModel implements CacheModel<TthcThanhPhanHoSo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", ThuTucHanhChinhId=");
		sb.append(ThuTucHanhChinhId);
		sb.append(", BieuMauHoSoId=");
		sb.append(BieuMauHoSoId);
		sb.append(", ThuTuHienThi=");
		sb.append(ThuTuHienThi);
		sb.append(", LoaiThanhPhan=");
		sb.append(LoaiThanhPhan);
		sb.append(", MauTrucTuyen=");
		sb.append(MauTrucTuyen);
		sb.append(", SoTaiLieuDinhKem=");
		sb.append(SoTaiLieuDinhKem);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcThanhPhanHoSo toEntityModel() {
		TthcThanhPhanHoSoImpl tthcThanhPhanHoSoImpl = new TthcThanhPhanHoSoImpl();

		tthcThanhPhanHoSoImpl.setId(Id);
		tthcThanhPhanHoSoImpl.setThuTucHanhChinhId(ThuTucHanhChinhId);
		tthcThanhPhanHoSoImpl.setBieuMauHoSoId(BieuMauHoSoId);
		tthcThanhPhanHoSoImpl.setThuTuHienThi(ThuTuHienThi);
		tthcThanhPhanHoSoImpl.setLoaiThanhPhan(LoaiThanhPhan);

		if (MauTrucTuyen == null) {
			tthcThanhPhanHoSoImpl.setMauTrucTuyen(StringPool.BLANK);
		}
		else {
			tthcThanhPhanHoSoImpl.setMauTrucTuyen(MauTrucTuyen);
		}

		tthcThanhPhanHoSoImpl.setSoTaiLieuDinhKem(SoTaiLieuDinhKem);

		tthcThanhPhanHoSoImpl.resetOriginalValues();

		return tthcThanhPhanHoSoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		ThuTucHanhChinhId = objectInput.readLong();
		BieuMauHoSoId = objectInput.readLong();
		ThuTuHienThi = objectInput.readLong();
		LoaiThanhPhan = objectInput.readLong();
		MauTrucTuyen = objectInput.readUTF();
		SoTaiLieuDinhKem = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);
		objectOutput.writeLong(ThuTucHanhChinhId);
		objectOutput.writeLong(BieuMauHoSoId);
		objectOutput.writeLong(ThuTuHienThi);
		objectOutput.writeLong(LoaiThanhPhan);

		if (MauTrucTuyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MauTrucTuyen);
		}

		objectOutput.writeLong(SoTaiLieuDinhKem);
	}

	public long Id;
	public long ThuTucHanhChinhId;
	public long BieuMauHoSoId;
	public long ThuTuHienThi;
	public long LoaiThanhPhan;
	public String MauTrucTuyen;
	public long SoTaiLieuDinhKem;
}