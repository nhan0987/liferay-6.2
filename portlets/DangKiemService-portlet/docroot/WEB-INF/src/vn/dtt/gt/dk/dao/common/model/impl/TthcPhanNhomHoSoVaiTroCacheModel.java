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

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcPhanNhomHoSoVaiTro in entity cache.
 *
 * @author huymq
 * @see TthcPhanNhomHoSoVaiTro
 * @generated
 */
public class TthcPhanNhomHoSoVaiTroCacheModel implements CacheModel<TthcPhanNhomHoSoVaiTro>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", PhanNhomHoSoId=");
		sb.append(PhanNhomHoSoId);
		sb.append(", VaiTroXuLy=");
		sb.append(VaiTroXuLy);
		sb.append(", nhomPhieuXuLy=");
		sb.append(nhomPhieuXuLy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcPhanNhomHoSoVaiTro toEntityModel() {
		TthcPhanNhomHoSoVaiTroImpl tthcPhanNhomHoSoVaiTroImpl = new TthcPhanNhomHoSoVaiTroImpl();

		tthcPhanNhomHoSoVaiTroImpl.setId(Id);
		tthcPhanNhomHoSoVaiTroImpl.setPhanNhomHoSoId(PhanNhomHoSoId);
		tthcPhanNhomHoSoVaiTroImpl.setVaiTroXuLy(VaiTroXuLy);

		if (nhomPhieuXuLy == null) {
			tthcPhanNhomHoSoVaiTroImpl.setNhomPhieuXuLy(StringPool.BLANK);
		}
		else {
			tthcPhanNhomHoSoVaiTroImpl.setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		tthcPhanNhomHoSoVaiTroImpl.resetOriginalValues();

		return tthcPhanNhomHoSoVaiTroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		PhanNhomHoSoId = objectInput.readLong();
		VaiTroXuLy = objectInput.readLong();
		nhomPhieuXuLy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);
		objectOutput.writeLong(PhanNhomHoSoId);
		objectOutput.writeLong(VaiTroXuLy);

		if (nhomPhieuXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhomPhieuXuLy);
		}
	}

	public long Id;
	public long PhanNhomHoSoId;
	public long VaiTroXuLy;
	public String nhomPhieuXuLy;
}