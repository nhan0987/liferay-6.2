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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MotCuaDongBoMTgateway in entity cache.
 *
 * @author win_64
 * @see MotCuaDongBoMTgateway
 * @generated
 */
public class MotCuaDongBoMTgatewayCacheModel implements CacheModel<MotCuaDongBoMTgateway>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dienBienHoSoId=");
		sb.append(dienBienHoSoId);
		sb.append(", phieuXuLyChinhId=");
		sb.append(phieuXuLyChinhId);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaDongBoMTgateway toEntityModel() {
		MotCuaDongBoMTgatewayImpl motCuaDongBoMTgatewayImpl = new MotCuaDongBoMTgatewayImpl();

		motCuaDongBoMTgatewayImpl.setId(id);
		motCuaDongBoMTgatewayImpl.setDienBienHoSoId(dienBienHoSoId);
		motCuaDongBoMTgatewayImpl.setPhieuXuLyChinhId(phieuXuLyChinhId);

		if (modifyDate == Long.MIN_VALUE) {
			motCuaDongBoMTgatewayImpl.setModifyDate(null);
		}
		else {
			motCuaDongBoMTgatewayImpl.setModifyDate(new Date(modifyDate));
		}

		if (trangThai == null) {
			motCuaDongBoMTgatewayImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			motCuaDongBoMTgatewayImpl.setTrangThai(trangThai);
		}

		motCuaDongBoMTgatewayImpl.resetOriginalValues();

		return motCuaDongBoMTgatewayImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		dienBienHoSoId = objectInput.readLong();
		phieuXuLyChinhId = objectInput.readLong();
		modifyDate = objectInput.readLong();
		trangThai = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(dienBienHoSoId);
		objectOutput.writeLong(phieuXuLyChinhId);
		objectOutput.writeLong(modifyDate);

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}
	}

	public long id;
	public long dienBienHoSoId;
	public long phieuXuLyChinhId;
	public long modifyDate;
	public String trangThai;
}