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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGSOCHUNGCHIXEDAPDIEN in entity cache.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEDAPDIEN
 * @generated
 */
public class THONGSOCHUNGCHIXEDAPDIENCacheModel implements CacheModel<THONGSOCHUNGCHIXEDAPDIEN>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

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
		sb.append(", XDD0008=");
		sb.append(XDD0008);
		sb.append(", XDD0009=");
		sb.append(XDD0009);
		sb.append(", XDD0010=");
		sb.append(XDD0010);
		sb.append(", XDD0011=");
		sb.append(XDD0011);
		sb.append(", XDD0012=");
		sb.append(XDD0012);
		sb.append(", XDD0013=");
		sb.append(XDD0013);
		sb.append(", XDD0014=");
		sb.append(XDD0014);
		sb.append(", XDD0015=");
		sb.append(XDD0015);
		sb.append(", XDD0016=");
		sb.append(XDD0016);
		sb.append(", XDD0017=");
		sb.append(XDD0017);
		sb.append(", XDD0018=");
		sb.append(XDD0018);
		sb.append(", XDD0019=");
		sb.append(XDD0019);
		sb.append(", XDD0020=");
		sb.append(XDD0020);
		sb.append(", XDD0021=");
		sb.append(XDD0021);
		sb.append(", XDD0022=");
		sb.append(XDD0022);
		sb.append(", XDD0023=");
		sb.append(XDD0023);
		sb.append(", XDD0024=");
		sb.append(XDD0024);
		sb.append(", XDD0025=");
		sb.append(XDD0025);
		sb.append(", XDD0026=");
		sb.append(XDD0026);
		sb.append(", XDD0027=");
		sb.append(XDD0027);
		sb.append(", XDD1027=");
		sb.append(XDD1027);
		sb.append(", XDD0028=");
		sb.append(XDD0028);
		sb.append(", XDD1028=");
		sb.append(XDD1028);
		sb.append(", XDD1128=");
		sb.append(XDD1128);
		sb.append(", XDD0029=");
		sb.append(XDD0029);
		sb.append(", XDD1029=");
		sb.append(XDD1029);
		sb.append(", XDD1129=");
		sb.append(XDD1129);
		sb.append(", XDD0030=");
		sb.append(XDD0030);
		sb.append(", XDD0031=");
		sb.append(XDD0031);
		sb.append(", XDD0032=");
		sb.append(XDD0032);
		sb.append(", XDD0033=");
		sb.append(XDD0033);
		sb.append(", XDD0034=");
		sb.append(XDD0034);
		sb.append(", XDD1034=");
		sb.append(XDD1034);
		sb.append(", XDD0035=");
		sb.append(XDD0035);
		sb.append(", XDD1035=");
		sb.append(XDD1035);
		sb.append(", XDD0036=");
		sb.append(XDD0036);
		sb.append(", XDD0037=");
		sb.append(XDD0037);
		sb.append(", XDD0038=");
		sb.append(XDD0038);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGSOCHUNGCHIXEDAPDIEN toEntityModel() {
		THONGSOCHUNGCHIXEDAPDIENImpl thongsochungchixedapdienImpl = new THONGSOCHUNGCHIXEDAPDIENImpl();

		thongsochungchixedapdienImpl.setId(id);
		thongsochungchixedapdienImpl.setHoSoThuTucId(hoSoThuTucId);
		thongsochungchixedapdienImpl.setCertificateRecordId(certificateRecordId);
		thongsochungchixedapdienImpl.setVehicleGroupId(vehicleGroupId);

		if (SynchDate == Long.MIN_VALUE) {
			thongsochungchixedapdienImpl.setSynchDate(null);
		}
		else {
			thongsochungchixedapdienImpl.setSynchDate(new Date(SynchDate));
		}

		if (XDD0008 == null) {
			thongsochungchixedapdienImpl.setXDD0008(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0008(XDD0008);
		}

		if (XDD0009 == null) {
			thongsochungchixedapdienImpl.setXDD0009(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0009(XDD0009);
		}

		if (XDD0010 == null) {
			thongsochungchixedapdienImpl.setXDD0010(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0010(XDD0010);
		}

		if (XDD0011 == null) {
			thongsochungchixedapdienImpl.setXDD0011(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0011(XDD0011);
		}

		if (XDD0012 == null) {
			thongsochungchixedapdienImpl.setXDD0012(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0012(XDD0012);
		}

		if (XDD0013 == null) {
			thongsochungchixedapdienImpl.setXDD0013(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0013(XDD0013);
		}

		if (XDD0014 == null) {
			thongsochungchixedapdienImpl.setXDD0014(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0014(XDD0014);
		}

		if (XDD0015 == null) {
			thongsochungchixedapdienImpl.setXDD0015(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0015(XDD0015);
		}

		if (XDD0016 == null) {
			thongsochungchixedapdienImpl.setXDD0016(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0016(XDD0016);
		}

		if (XDD0017 == null) {
			thongsochungchixedapdienImpl.setXDD0017(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0017(XDD0017);
		}

		if (XDD0018 == null) {
			thongsochungchixedapdienImpl.setXDD0018(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0018(XDD0018);
		}

		if (XDD0019 == null) {
			thongsochungchixedapdienImpl.setXDD0019(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0019(XDD0019);
		}

		if (XDD0020 == null) {
			thongsochungchixedapdienImpl.setXDD0020(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0020(XDD0020);
		}

		if (XDD0021 == null) {
			thongsochungchixedapdienImpl.setXDD0021(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0021(XDD0021);
		}

		if (XDD0022 == null) {
			thongsochungchixedapdienImpl.setXDD0022(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0022(XDD0022);
		}

		if (XDD0023 == null) {
			thongsochungchixedapdienImpl.setXDD0023(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0023(XDD0023);
		}

		if (XDD0024 == null) {
			thongsochungchixedapdienImpl.setXDD0024(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0024(XDD0024);
		}

		if (XDD0025 == null) {
			thongsochungchixedapdienImpl.setXDD0025(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0025(XDD0025);
		}

		if (XDD0026 == null) {
			thongsochungchixedapdienImpl.setXDD0026(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0026(XDD0026);
		}

		if (XDD0027 == null) {
			thongsochungchixedapdienImpl.setXDD0027(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0027(XDD0027);
		}

		if (XDD1027 == null) {
			thongsochungchixedapdienImpl.setXDD1027(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD1027(XDD1027);
		}

		if (XDD0028 == null) {
			thongsochungchixedapdienImpl.setXDD0028(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0028(XDD0028);
		}

		if (XDD1028 == null) {
			thongsochungchixedapdienImpl.setXDD1028(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD1028(XDD1028);
		}

		if (XDD1128 == null) {
			thongsochungchixedapdienImpl.setXDD1128(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD1128(XDD1128);
		}

		if (XDD0029 == null) {
			thongsochungchixedapdienImpl.setXDD0029(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0029(XDD0029);
		}

		if (XDD1029 == null) {
			thongsochungchixedapdienImpl.setXDD1029(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD1029(XDD1029);
		}

		if (XDD1129 == null) {
			thongsochungchixedapdienImpl.setXDD1129(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD1129(XDD1129);
		}

		if (XDD0030 == null) {
			thongsochungchixedapdienImpl.setXDD0030(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0030(XDD0030);
		}

		if (XDD0031 == null) {
			thongsochungchixedapdienImpl.setXDD0031(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0031(XDD0031);
		}

		if (XDD0032 == null) {
			thongsochungchixedapdienImpl.setXDD0032(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0032(XDD0032);
		}

		if (XDD0033 == null) {
			thongsochungchixedapdienImpl.setXDD0033(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0033(XDD0033);
		}

		if (XDD0034 == null) {
			thongsochungchixedapdienImpl.setXDD0034(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0034(XDD0034);
		}

		if (XDD1034 == null) {
			thongsochungchixedapdienImpl.setXDD1034(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD1034(XDD1034);
		}

		if (XDD0035 == null) {
			thongsochungchixedapdienImpl.setXDD0035(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0035(XDD0035);
		}

		if (XDD1035 == null) {
			thongsochungchixedapdienImpl.setXDD1035(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD1035(XDD1035);
		}

		if (XDD0036 == null) {
			thongsochungchixedapdienImpl.setXDD0036(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0036(XDD0036);
		}

		if (XDD0037 == null) {
			thongsochungchixedapdienImpl.setXDD0037(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0037(XDD0037);
		}

		if (XDD0038 == null) {
			thongsochungchixedapdienImpl.setXDD0038(StringPool.BLANK);
		}
		else {
			thongsochungchixedapdienImpl.setXDD0038(XDD0038);
		}

		thongsochungchixedapdienImpl.resetOriginalValues();

		return thongsochungchixedapdienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		SynchDate = objectInput.readLong();
		XDD0008 = objectInput.readUTF();
		XDD0009 = objectInput.readUTF();
		XDD0010 = objectInput.readUTF();
		XDD0011 = objectInput.readUTF();
		XDD0012 = objectInput.readUTF();
		XDD0013 = objectInput.readUTF();
		XDD0014 = objectInput.readUTF();
		XDD0015 = objectInput.readUTF();
		XDD0016 = objectInput.readUTF();
		XDD0017 = objectInput.readUTF();
		XDD0018 = objectInput.readUTF();
		XDD0019 = objectInput.readUTF();
		XDD0020 = objectInput.readUTF();
		XDD0021 = objectInput.readUTF();
		XDD0022 = objectInput.readUTF();
		XDD0023 = objectInput.readUTF();
		XDD0024 = objectInput.readUTF();
		XDD0025 = objectInput.readUTF();
		XDD0026 = objectInput.readUTF();
		XDD0027 = objectInput.readUTF();
		XDD1027 = objectInput.readUTF();
		XDD0028 = objectInput.readUTF();
		XDD1028 = objectInput.readUTF();
		XDD1128 = objectInput.readUTF();
		XDD0029 = objectInput.readUTF();
		XDD1029 = objectInput.readUTF();
		XDD1129 = objectInput.readUTF();
		XDD0030 = objectInput.readUTF();
		XDD0031 = objectInput.readUTF();
		XDD0032 = objectInput.readUTF();
		XDD0033 = objectInput.readUTF();
		XDD0034 = objectInput.readUTF();
		XDD1034 = objectInput.readUTF();
		XDD0035 = objectInput.readUTF();
		XDD1035 = objectInput.readUTF();
		XDD0036 = objectInput.readUTF();
		XDD0037 = objectInput.readUTF();
		XDD0038 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(SynchDate);

		if (XDD0008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0008);
		}

		if (XDD0009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0009);
		}

		if (XDD0010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0010);
		}

		if (XDD0011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0011);
		}

		if (XDD0012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0012);
		}

		if (XDD0013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0013);
		}

		if (XDD0014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0014);
		}

		if (XDD0015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0015);
		}

		if (XDD0016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0016);
		}

		if (XDD0017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0017);
		}

		if (XDD0018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0018);
		}

		if (XDD0019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0019);
		}

		if (XDD0020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0020);
		}

		if (XDD0021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0021);
		}

		if (XDD0022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0022);
		}

		if (XDD0023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0023);
		}

		if (XDD0024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0024);
		}

		if (XDD0025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0025);
		}

		if (XDD0026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0026);
		}

		if (XDD0027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0027);
		}

		if (XDD1027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD1027);
		}

		if (XDD0028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0028);
		}

		if (XDD1028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD1028);
		}

		if (XDD1128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD1128);
		}

		if (XDD0029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0029);
		}

		if (XDD1029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD1029);
		}

		if (XDD1129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD1129);
		}

		if (XDD0030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0030);
		}

		if (XDD0031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0031);
		}

		if (XDD0032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0032);
		}

		if (XDD0033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0033);
		}

		if (XDD0034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0034);
		}

		if (XDD1034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD1034);
		}

		if (XDD0035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0035);
		}

		if (XDD1035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD1035);
		}

		if (XDD0036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0036);
		}

		if (XDD0037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0037);
		}

		if (XDD0038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XDD0038);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long certificateRecordId;
	public long vehicleGroupId;
	public long SynchDate;
	public String XDD0008;
	public String XDD0009;
	public String XDD0010;
	public String XDD0011;
	public String XDD0012;
	public String XDD0013;
	public String XDD0014;
	public String XDD0015;
	public String XDD0016;
	public String XDD0017;
	public String XDD0018;
	public String XDD0019;
	public String XDD0020;
	public String XDD0021;
	public String XDD0022;
	public String XDD0023;
	public String XDD0024;
	public String XDD0025;
	public String XDD0026;
	public String XDD0027;
	public String XDD1027;
	public String XDD0028;
	public String XDD1028;
	public String XDD1128;
	public String XDD0029;
	public String XDD1029;
	public String XDD1129;
	public String XDD0030;
	public String XDD0031;
	public String XDD0032;
	public String XDD0033;
	public String XDD0034;
	public String XDD1034;
	public String XDD0035;
	public String XDD1035;
	public String XDD0036;
	public String XDD0037;
	public String XDD0038;
}