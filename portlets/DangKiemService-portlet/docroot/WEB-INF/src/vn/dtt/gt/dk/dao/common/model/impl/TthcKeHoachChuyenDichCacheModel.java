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

import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TthcKeHoachChuyenDich in entity cache.
 *
 * @author huymq
 * @see TthcKeHoachChuyenDich
 * @generated
 */
public class TthcKeHoachChuyenDichCacheModel implements CacheModel<TthcKeHoachChuyenDich>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", phieuXuLyChinhId=");
		sb.append(phieuXuLyChinhId);
		sb.append(", phieuXuLyPhuId=");
		sb.append(phieuXuLyPhuId);
		sb.append(", messageId=");
		sb.append(messageId);
		sb.append(", messageStatus=");
		sb.append(messageStatus);
		sb.append(", trangThaiNguonId=");
		sb.append(trangThaiNguonId);
		sb.append(", dieuKienChuyenDich=");
		sb.append(dieuKienChuyenDich);
		sb.append(", trangThaiDichId=");
		sb.append(trangThaiDichId);
		sb.append(", phanNhomHoSoId=");
		sb.append(phanNhomHoSoId);
		sb.append(", nhomPhieuXuLy=");
		sb.append(nhomPhieuXuLy);
		sb.append(", hoanTat=");
		sb.append(hoanTat);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", debitnoteNumber=");
		sb.append(debitnoteNumber);
		sb.append(", messageFunction=");
		sb.append(messageFunction);
		sb.append(", messageType=");
		sb.append(messageType);
		sb.append(", thoiDiemCapNhat=");
		sb.append(thoiDiemCapNhat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcKeHoachChuyenDich toEntityModel() {
		TthcKeHoachChuyenDichImpl tthcKeHoachChuyenDichImpl = new TthcKeHoachChuyenDichImpl();

		tthcKeHoachChuyenDichImpl.setId(id);
		tthcKeHoachChuyenDichImpl.setPhieuXuLyChinhId(phieuXuLyChinhId);
		tthcKeHoachChuyenDichImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);

		if (messageId == null) {
			tthcKeHoachChuyenDichImpl.setMessageId(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setMessageId(messageId);
		}

		if (messageStatus == null) {
			tthcKeHoachChuyenDichImpl.setMessageStatus(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setMessageStatus(messageStatus);
		}

		tthcKeHoachChuyenDichImpl.setTrangThaiNguonId(trangThaiNguonId);

		if (dieuKienChuyenDich == null) {
			tthcKeHoachChuyenDichImpl.setDieuKienChuyenDich(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setDieuKienChuyenDich(dieuKienChuyenDich);
		}

		tthcKeHoachChuyenDichImpl.setTrangThaiDichId(trangThaiDichId);
		tthcKeHoachChuyenDichImpl.setPhanNhomHoSoId(phanNhomHoSoId);

		if (nhomPhieuXuLy == null) {
			tthcKeHoachChuyenDichImpl.setNhomPhieuXuLy(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		if (hoanTat == null) {
			tthcKeHoachChuyenDichImpl.setHoanTat(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setHoanTat(hoanTat);
		}

		if (ghiChu == null) {
			tthcKeHoachChuyenDichImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setGhiChu(ghiChu);
		}

		if (debitnoteNumber == null) {
			tthcKeHoachChuyenDichImpl.setDebitnoteNumber(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setDebitnoteNumber(debitnoteNumber);
		}

		if (messageFunction == null) {
			tthcKeHoachChuyenDichImpl.setMessageFunction(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setMessageFunction(messageFunction);
		}

		if (messageType == null) {
			tthcKeHoachChuyenDichImpl.setMessageType(StringPool.BLANK);
		}
		else {
			tthcKeHoachChuyenDichImpl.setMessageType(messageType);
		}

		if (thoiDiemCapNhat == Long.MIN_VALUE) {
			tthcKeHoachChuyenDichImpl.setThoiDiemCapNhat(null);
		}
		else {
			tthcKeHoachChuyenDichImpl.setThoiDiemCapNhat(new Date(
					thoiDiemCapNhat));
		}

		tthcKeHoachChuyenDichImpl.resetOriginalValues();

		return tthcKeHoachChuyenDichImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		phieuXuLyChinhId = objectInput.readLong();
		phieuXuLyPhuId = objectInput.readLong();
		messageId = objectInput.readUTF();
		messageStatus = objectInput.readUTF();
		trangThaiNguonId = objectInput.readLong();
		dieuKienChuyenDich = objectInput.readUTF();
		trangThaiDichId = objectInput.readLong();
		phanNhomHoSoId = objectInput.readLong();
		nhomPhieuXuLy = objectInput.readUTF();
		hoanTat = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		debitnoteNumber = objectInput.readUTF();
		messageFunction = objectInput.readUTF();
		messageType = objectInput.readUTF();
		thoiDiemCapNhat = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(phieuXuLyChinhId);
		objectOutput.writeLong(phieuXuLyPhuId);

		if (messageId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageId);
		}

		if (messageStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageStatus);
		}

		objectOutput.writeLong(trangThaiNguonId);

		if (dieuKienChuyenDich == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dieuKienChuyenDich);
		}

		objectOutput.writeLong(trangThaiDichId);
		objectOutput.writeLong(phanNhomHoSoId);

		if (nhomPhieuXuLy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nhomPhieuXuLy);
		}

		if (hoanTat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hoanTat);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		if (debitnoteNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(debitnoteNumber);
		}

		if (messageFunction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageFunction);
		}

		if (messageType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageType);
		}

		objectOutput.writeLong(thoiDiemCapNhat);
	}

	public long id;
	public long phieuXuLyChinhId;
	public long phieuXuLyPhuId;
	public String messageId;
	public String messageStatus;
	public long trangThaiNguonId;
	public String dieuKienChuyenDich;
	public long trangThaiDichId;
	public long phanNhomHoSoId;
	public String nhomPhieuXuLy;
	public String hoanTat;
	public String ghiChu;
	public String debitnoteNumber;
	public String messageFunction;
	public String messageType;
	public long thoiDiemCapNhat;
}