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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGSOCHUNGCHIDONGCO in entity cache.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIDONGCO
 * @generated
 */
public class THONGSOCHUNGCHIDONGCOCacheModel implements CacheModel<THONGSOCHUNGCHIDONGCO>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", certificateRecordId=");
		sb.append(certificateRecordId);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", SynchDate=");
		sb.append(SynchDate);
		sb.append(", DCX0007=");
		sb.append(DCX0007);
		sb.append(", DCX0008=");
		sb.append(DCX0008);
		sb.append(", DCX0010=");
		sb.append(DCX0010);
		sb.append(", DCX0011=");
		sb.append(DCX0011);
		sb.append(", DCX0012=");
		sb.append(DCX0012);
		sb.append(", DCX1012=");
		sb.append(DCX1012);
		sb.append(", DCX0013=");
		sb.append(DCX0013);
		sb.append(", DCX1013=");
		sb.append(DCX1013);
		sb.append(", DCX0014=");
		sb.append(DCX0014);
		sb.append(", DCX0015=");
		sb.append(DCX0015);
		sb.append(", DCX0016=");
		sb.append(DCX0016);
		sb.append(", DCX0017=");
		sb.append(DCX0017);
		sb.append(", DCX0018=");
		sb.append(DCX0018);
		sb.append(", DCX0019=");
		sb.append(DCX0019);
		sb.append(", DCX0021=");
		sb.append(DCX0021);
		sb.append(", DCX0022=");
		sb.append(DCX0022);
		sb.append(", DCX0023=");
		sb.append(DCX0023);
		sb.append(", DCX0024=");
		sb.append(DCX0024);
		sb.append(", DCX0006=");
		sb.append(DCX0006);
		sb.append(", DCX0025=");
		sb.append(DCX0025);
		sb.append(", DCX0026=");
		sb.append(DCX0026);
		sb.append(", DCX0027=");
		sb.append(DCX0027);
		sb.append(", DCX0028=");
		sb.append(DCX0028);
		sb.append(", DCX0029=");
		sb.append(DCX0029);
		sb.append(", DCX0030=");
		sb.append(DCX0030);
		sb.append(", DCX0031=");
		sb.append(DCX0031);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGSOCHUNGCHIDONGCO toEntityModel() {
		THONGSOCHUNGCHIDONGCOImpl thongsochungchidongcoImpl = new THONGSOCHUNGCHIDONGCOImpl();

		thongsochungchidongcoImpl.setId(id);
		thongsochungchidongcoImpl.setHoSoThuTucId(hoSoThuTucId);
		thongsochungchidongcoImpl.setCertificateRecordId(certificateRecordId);
		thongsochungchidongcoImpl.setVehicleGroupId(vehicleGroupId);

		if (SynchDate == Long.MIN_VALUE) {
			thongsochungchidongcoImpl.setSynchDate(null);
		}
		else {
			thongsochungchidongcoImpl.setSynchDate(new Date(SynchDate));
		}

		if (DCX0007 == null) {
			thongsochungchidongcoImpl.setDCX0007(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0007(DCX0007);
		}

		if (DCX0008 == null) {
			thongsochungchidongcoImpl.setDCX0008(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0008(DCX0008);
		}

		if (DCX0010 == null) {
			thongsochungchidongcoImpl.setDCX0010(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0010(DCX0010);
		}

		if (DCX0011 == null) {
			thongsochungchidongcoImpl.setDCX0011(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0011(DCX0011);
		}

		if (DCX0012 == null) {
			thongsochungchidongcoImpl.setDCX0012(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0012(DCX0012);
		}

		if (DCX1012 == null) {
			thongsochungchidongcoImpl.setDCX1012(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX1012(DCX1012);
		}

		if (DCX0013 == null) {
			thongsochungchidongcoImpl.setDCX0013(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0013(DCX0013);
		}

		if (DCX1013 == null) {
			thongsochungchidongcoImpl.setDCX1013(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX1013(DCX1013);
		}

		if (DCX0014 == null) {
			thongsochungchidongcoImpl.setDCX0014(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0014(DCX0014);
		}

		if (DCX0015 == null) {
			thongsochungchidongcoImpl.setDCX0015(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0015(DCX0015);
		}

		if (DCX0016 == null) {
			thongsochungchidongcoImpl.setDCX0016(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0016(DCX0016);
		}

		if (DCX0017 == null) {
			thongsochungchidongcoImpl.setDCX0017(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0017(DCX0017);
		}

		if (DCX0018 == null) {
			thongsochungchidongcoImpl.setDCX0018(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0018(DCX0018);
		}

		if (DCX0019 == null) {
			thongsochungchidongcoImpl.setDCX0019(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0019(DCX0019);
		}

		if (DCX0021 == null) {
			thongsochungchidongcoImpl.setDCX0021(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0021(DCX0021);
		}

		if (DCX0022 == null) {
			thongsochungchidongcoImpl.setDCX0022(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0022(DCX0022);
		}

		if (DCX0023 == null) {
			thongsochungchidongcoImpl.setDCX0023(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0023(DCX0023);
		}

		if (DCX0024 == null) {
			thongsochungchidongcoImpl.setDCX0024(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0024(DCX0024);
		}

		if (DCX0006 == null) {
			thongsochungchidongcoImpl.setDCX0006(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0006(DCX0006);
		}

		if (DCX0025 == null) {
			thongsochungchidongcoImpl.setDCX0025(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0025(DCX0025);
		}

		if (DCX0026 == null) {
			thongsochungchidongcoImpl.setDCX0026(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0026(DCX0026);
		}

		if (DCX0027 == null) {
			thongsochungchidongcoImpl.setDCX0027(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0027(DCX0027);
		}

		if (DCX0028 == null) {
			thongsochungchidongcoImpl.setDCX0028(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0028(DCX0028);
		}

		if (DCX0029 == null) {
			thongsochungchidongcoImpl.setDCX0029(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0029(DCX0029);
		}

		if (DCX0030 == null) {
			thongsochungchidongcoImpl.setDCX0030(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0030(DCX0030);
		}

		if (DCX0031 == null) {
			thongsochungchidongcoImpl.setDCX0031(StringPool.BLANK);
		}
		else {
			thongsochungchidongcoImpl.setDCX0031(DCX0031);
		}

		thongsochungchidongcoImpl.resetOriginalValues();

		return thongsochungchidongcoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		SynchDate = objectInput.readLong();
		DCX0007 = objectInput.readUTF();
		DCX0008 = objectInput.readUTF();
		DCX0010 = objectInput.readUTF();
		DCX0011 = objectInput.readUTF();
		DCX0012 = objectInput.readUTF();
		DCX1012 = objectInput.readUTF();
		DCX0013 = objectInput.readUTF();
		DCX1013 = objectInput.readUTF();
		DCX0014 = objectInput.readUTF();
		DCX0015 = objectInput.readUTF();
		DCX0016 = objectInput.readUTF();
		DCX0017 = objectInput.readUTF();
		DCX0018 = objectInput.readUTF();
		DCX0019 = objectInput.readUTF();
		DCX0021 = objectInput.readUTF();
		DCX0022 = objectInput.readUTF();
		DCX0023 = objectInput.readUTF();
		DCX0024 = objectInput.readUTF();
		DCX0006 = objectInput.readUTF();
		DCX0025 = objectInput.readUTF();
		DCX0026 = objectInput.readUTF();
		DCX0027 = objectInput.readUTF();
		DCX0028 = objectInput.readUTF();
		DCX0029 = objectInput.readUTF();
		DCX0030 = objectInput.readUTF();
		DCX0031 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(SynchDate);

		if (DCX0007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0007);
		}

		if (DCX0008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0008);
		}

		if (DCX0010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0010);
		}

		if (DCX0011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0011);
		}

		if (DCX0012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0012);
		}

		if (DCX1012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX1012);
		}

		if (DCX0013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0013);
		}

		if (DCX1013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX1013);
		}

		if (DCX0014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0014);
		}

		if (DCX0015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0015);
		}

		if (DCX0016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0016);
		}

		if (DCX0017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0017);
		}

		if (DCX0018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0018);
		}

		if (DCX0019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0019);
		}

		if (DCX0021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0021);
		}

		if (DCX0022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0022);
		}

		if (DCX0023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0023);
		}

		if (DCX0024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0024);
		}

		if (DCX0006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0006);
		}

		if (DCX0025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0025);
		}

		if (DCX0026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0026);
		}

		if (DCX0027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0027);
		}

		if (DCX0028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0028);
		}

		if (DCX0029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0029);
		}

		if (DCX0030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0030);
		}

		if (DCX0031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DCX0031);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long certificateRecordId;
	public long vehicleGroupId;
	public long SynchDate;
	public String DCX0007;
	public String DCX0008;
	public String DCX0010;
	public String DCX0011;
	public String DCX0012;
	public String DCX1012;
	public String DCX0013;
	public String DCX1013;
	public String DCX0014;
	public String DCX0015;
	public String DCX0016;
	public String DCX0017;
	public String DCX0018;
	public String DCX0019;
	public String DCX0021;
	public String DCX0022;
	public String DCX0023;
	public String DCX0024;
	public String DCX0006;
	public String DCX0025;
	public String DCX0026;
	public String DCX0027;
	public String DCX0028;
	public String DCX0029;
	public String DCX0030;
	public String DCX0031;
}