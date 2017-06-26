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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGSOCHUNGCHIXEMAY in entity cache.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEMAY
 * @generated
 */
public class THONGSOCHUNGCHIXEMAYCacheModel implements CacheModel<THONGSOCHUNGCHIXEMAY>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(279);

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
		sb.append(", XMY0009=");
		sb.append(XMY0009);
		sb.append(", XMY0010=");
		sb.append(XMY0010);
		sb.append(", XMY0011=");
		sb.append(XMY0011);
		sb.append(", XMY0012=");
		sb.append(XMY0012);
		sb.append(", XMY0013=");
		sb.append(XMY0013);
		sb.append(", XMY0014=");
		sb.append(XMY0014);
		sb.append(", XMY0015=");
		sb.append(XMY0015);
		sb.append(", XMY0016=");
		sb.append(XMY0016);
		sb.append(", XMY0017=");
		sb.append(XMY0017);
		sb.append(", XMY0018=");
		sb.append(XMY0018);
		sb.append(", XMY0019=");
		sb.append(XMY0019);
		sb.append(", XMY0020=");
		sb.append(XMY0020);
		sb.append(", XMY0021=");
		sb.append(XMY0021);
		sb.append(", XMY0022=");
		sb.append(XMY0022);
		sb.append(", XMY1022=");
		sb.append(XMY1022);
		sb.append(", XMY0023=");
		sb.append(XMY0023);
		sb.append(", XMY0024=");
		sb.append(XMY0024);
		sb.append(", XMY0025=");
		sb.append(XMY0025);
		sb.append(", XMY0026=");
		sb.append(XMY0026);
		sb.append(", XMY0027=");
		sb.append(XMY0027);
		sb.append(", XMY0028=");
		sb.append(XMY0028);
		sb.append(", XMY0029=");
		sb.append(XMY0029);
		sb.append(", XMY0030=");
		sb.append(XMY0030);
		sb.append(", XMY0031=");
		sb.append(XMY0031);
		sb.append(", XMY0032=");
		sb.append(XMY0032);
		sb.append(", XMY1032=");
		sb.append(XMY1032);
		sb.append(", XMY0033=");
		sb.append(XMY0033);
		sb.append(", XMY1033=");
		sb.append(XMY1033);
		sb.append(", XMY0034=");
		sb.append(XMY0034);
		sb.append(", XMY0035=");
		sb.append(XMY0035);
		sb.append(", XMY1035=");
		sb.append(XMY1035);
		sb.append(", XMY0036=");
		sb.append(XMY0036);
		sb.append(", XMY0037=");
		sb.append(XMY0037);
		sb.append(", XMY0038=");
		sb.append(XMY0038);
		sb.append(", XMY0039=");
		sb.append(XMY0039);
		sb.append(", XMY1039=");
		sb.append(XMY1039);
		sb.append(", XMY0040=");
		sb.append(XMY0040);
		sb.append(", XMY1040=");
		sb.append(XMY1040);
		sb.append(", XMY0041=");
		sb.append(XMY0041);
		sb.append(", XMY0042=");
		sb.append(XMY0042);
		sb.append(", XMY1042=");
		sb.append(XMY1042);
		sb.append(", XMY0043=");
		sb.append(XMY0043);
		sb.append(", XMY0044=");
		sb.append(XMY0044);
		sb.append(", XMY0045=");
		sb.append(XMY0045);
		sb.append(", XMY0046=");
		sb.append(XMY0046);
		sb.append(", XMY0047=");
		sb.append(XMY0047);
		sb.append(", XMY0048=");
		sb.append(XMY0048);
		sb.append(", XMY0049=");
		sb.append(XMY0049);
		sb.append(", XMY0050=");
		sb.append(XMY0050);
		sb.append(", XMY1050=");
		sb.append(XMY1050);
		sb.append(", XMY0051=");
		sb.append(XMY0051);
		sb.append(", XMY0052=");
		sb.append(XMY0052);
		sb.append(", XMY0053=");
		sb.append(XMY0053);
		sb.append(", XMY0054=");
		sb.append(XMY0054);
		sb.append(", XMY0055=");
		sb.append(XMY0055);
		sb.append(", XMY0056=");
		sb.append(XMY0056);
		sb.append(", XMY0057=");
		sb.append(XMY0057);
		sb.append(", XMY0058=");
		sb.append(XMY0058);
		sb.append(", XMY0059=");
		sb.append(XMY0059);
		sb.append(", XMY0060=");
		sb.append(XMY0060);
		sb.append(", XMY0061=");
		sb.append(XMY0061);
		sb.append(", XMY0062=");
		sb.append(XMY0062);
		sb.append(", XMY0063=");
		sb.append(XMY0063);
		sb.append(", XMY0064=");
		sb.append(XMY0064);
		sb.append(", XMY0065=");
		sb.append(XMY0065);
		sb.append(", XMY0066=");
		sb.append(XMY0066);
		sb.append(", XMY0067=");
		sb.append(XMY0067);
		sb.append(", XMY0068=");
		sb.append(XMY0068);
		sb.append(", XMY0069=");
		sb.append(XMY0069);
		sb.append(", XMY0082=");
		sb.append(XMY0082);
		sb.append(", XMY0083=");
		sb.append(XMY0083);
		sb.append(", XMY0084=");
		sb.append(XMY0084);
		sb.append(", XMY0085=");
		sb.append(XMY0085);
		sb.append(", XMY0086=");
		sb.append(XMY0086);
		sb.append(", XMY1086=");
		sb.append(XMY1086);
		sb.append(", XMY0087=");
		sb.append(XMY0087);
		sb.append(", XMY1087=");
		sb.append(XMY1087);
		sb.append(", XMY1187=");
		sb.append(XMY1187);
		sb.append(", XMY0088=");
		sb.append(XMY0088);
		sb.append(", XMY1088=");
		sb.append(XMY1088);
		sb.append(", XMY1188=");
		sb.append(XMY1188);
		sb.append(", XMY0089=");
		sb.append(XMY0089);
		sb.append(", XMY1089=");
		sb.append(XMY1089);
		sb.append(", XMY1189=");
		sb.append(XMY1189);
		sb.append(", XMY0090=");
		sb.append(XMY0090);
		sb.append(", XMY0091=");
		sb.append(XMY0091);
		sb.append(", XMY0092=");
		sb.append(XMY0092);
		sb.append(", XMY0093=");
		sb.append(XMY0093);
		sb.append(", XMY0094=");
		sb.append(XMY0094);
		sb.append(", XMY0095=");
		sb.append(XMY0095);
		sb.append(", XMY0096=");
		sb.append(XMY0096);
		sb.append(", XMY0097=");
		sb.append(XMY0097);
		sb.append(", XMY0098=");
		sb.append(XMY0098);
		sb.append(", XMY0099=");
		sb.append(XMY0099);
		sb.append(", XMY0100=");
		sb.append(XMY0100);
		sb.append(", XMY0101=");
		sb.append(XMY0101);
		sb.append(", XMY0102=");
		sb.append(XMY0102);
		sb.append(", XMY0103=");
		sb.append(XMY0103);
		sb.append(", XMY0104=");
		sb.append(XMY0104);
		sb.append(", XMY0105=");
		sb.append(XMY0105);
		sb.append(", XMY0106=");
		sb.append(XMY0106);
		sb.append(", XMY2106=");
		sb.append(XMY2106);
		sb.append(", XMY0107=");
		sb.append(XMY0107);
		sb.append(", XMY2107=");
		sb.append(XMY2107);
		sb.append(", XMY0108=");
		sb.append(XMY0108);
		sb.append(", XMY2108=");
		sb.append(XMY2108);
		sb.append(", XMY0109=");
		sb.append(XMY0109);
		sb.append(", XMY2109=");
		sb.append(XMY2109);
		sb.append(", XMY0110=");
		sb.append(XMY0110);
		sb.append(", XMY2110=");
		sb.append(XMY2110);
		sb.append(", XMY0111=");
		sb.append(XMY0111);
		sb.append(", XMY2111=");
		sb.append(XMY2111);
		sb.append(", XMY0112=");
		sb.append(XMY0112);
		sb.append(", XMY2112=");
		sb.append(XMY2112);
		sb.append(", XMY0113=");
		sb.append(XMY0113);
		sb.append(", XMY2113=");
		sb.append(XMY2113);
		sb.append(", XMY0114=");
		sb.append(XMY0114);
		sb.append(", XMY2114=");
		sb.append(XMY2114);
		sb.append(", XMY0115=");
		sb.append(XMY0115);
		sb.append(", XMY2115=");
		sb.append(XMY2115);
		sb.append(", XMY0116=");
		sb.append(XMY0116);
		sb.append(", XMY2116=");
		sb.append(XMY2116);
		sb.append(", XMY0117=");
		sb.append(XMY0117);
		sb.append(", XMY2117=");
		sb.append(XMY2117);
		sb.append(", XMY0118=");
		sb.append(XMY0118);
		sb.append(", XMY2118=");
		sb.append(XMY2118);
		sb.append(", XMY0119=");
		sb.append(XMY0119);
		sb.append(", XMY2119=");
		sb.append(XMY2119);
		sb.append(", XMY0120=");
		sb.append(XMY0120);
		sb.append(", XMY0121=");
		sb.append(XMY0121);
		sb.append(", XMY2121=");
		sb.append(XMY2121);
		sb.append(", XMY0122=");
		sb.append(XMY0122);
		sb.append(", XMY0198=");
		sb.append(XMY0198);
		sb.append(", XMY1098=");
		sb.append(XMY1098);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGSOCHUNGCHIXEMAY toEntityModel() {
		THONGSOCHUNGCHIXEMAYImpl thongsochungchixemayImpl = new THONGSOCHUNGCHIXEMAYImpl();

		thongsochungchixemayImpl.setId(id);
		thongsochungchixemayImpl.setHoSoThuTucId(hoSoThuTucId);
		thongsochungchixemayImpl.setCertificateRecordId(certificateRecordId);
		thongsochungchixemayImpl.setVehicleGroupId(vehicleGroupId);

		if (SynchDate == Long.MIN_VALUE) {
			thongsochungchixemayImpl.setSynchDate(null);
		}
		else {
			thongsochungchixemayImpl.setSynchDate(new Date(SynchDate));
		}

		if (XMY0009 == null) {
			thongsochungchixemayImpl.setXMY0009(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0009(XMY0009);
		}

		if (XMY0010 == null) {
			thongsochungchixemayImpl.setXMY0010(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0010(XMY0010);
		}

		if (XMY0011 == null) {
			thongsochungchixemayImpl.setXMY0011(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0011(XMY0011);
		}

		if (XMY0012 == null) {
			thongsochungchixemayImpl.setXMY0012(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0012(XMY0012);
		}

		if (XMY0013 == null) {
			thongsochungchixemayImpl.setXMY0013(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0013(XMY0013);
		}

		if (XMY0014 == null) {
			thongsochungchixemayImpl.setXMY0014(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0014(XMY0014);
		}

		if (XMY0015 == null) {
			thongsochungchixemayImpl.setXMY0015(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0015(XMY0015);
		}

		if (XMY0016 == null) {
			thongsochungchixemayImpl.setXMY0016(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0016(XMY0016);
		}

		if (XMY0017 == null) {
			thongsochungchixemayImpl.setXMY0017(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0017(XMY0017);
		}

		if (XMY0018 == null) {
			thongsochungchixemayImpl.setXMY0018(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0018(XMY0018);
		}

		if (XMY0019 == null) {
			thongsochungchixemayImpl.setXMY0019(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0019(XMY0019);
		}

		if (XMY0020 == null) {
			thongsochungchixemayImpl.setXMY0020(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0020(XMY0020);
		}

		if (XMY0021 == null) {
			thongsochungchixemayImpl.setXMY0021(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0021(XMY0021);
		}

		if (XMY0022 == null) {
			thongsochungchixemayImpl.setXMY0022(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0022(XMY0022);
		}

		if (XMY1022 == null) {
			thongsochungchixemayImpl.setXMY1022(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1022(XMY1022);
		}

		if (XMY0023 == null) {
			thongsochungchixemayImpl.setXMY0023(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0023(XMY0023);
		}

		if (XMY0024 == null) {
			thongsochungchixemayImpl.setXMY0024(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0024(XMY0024);
		}

		if (XMY0025 == null) {
			thongsochungchixemayImpl.setXMY0025(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0025(XMY0025);
		}

		if (XMY0026 == null) {
			thongsochungchixemayImpl.setXMY0026(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0026(XMY0026);
		}

		if (XMY0027 == null) {
			thongsochungchixemayImpl.setXMY0027(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0027(XMY0027);
		}

		if (XMY0028 == null) {
			thongsochungchixemayImpl.setXMY0028(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0028(XMY0028);
		}

		if (XMY0029 == null) {
			thongsochungchixemayImpl.setXMY0029(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0029(XMY0029);
		}

		if (XMY0030 == null) {
			thongsochungchixemayImpl.setXMY0030(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0030(XMY0030);
		}

		if (XMY0031 == null) {
			thongsochungchixemayImpl.setXMY0031(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0031(XMY0031);
		}

		if (XMY0032 == null) {
			thongsochungchixemayImpl.setXMY0032(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0032(XMY0032);
		}

		if (XMY1032 == null) {
			thongsochungchixemayImpl.setXMY1032(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1032(XMY1032);
		}

		if (XMY0033 == null) {
			thongsochungchixemayImpl.setXMY0033(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0033(XMY0033);
		}

		if (XMY1033 == null) {
			thongsochungchixemayImpl.setXMY1033(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1033(XMY1033);
		}

		if (XMY0034 == null) {
			thongsochungchixemayImpl.setXMY0034(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0034(XMY0034);
		}

		if (XMY0035 == null) {
			thongsochungchixemayImpl.setXMY0035(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0035(XMY0035);
		}

		if (XMY1035 == null) {
			thongsochungchixemayImpl.setXMY1035(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1035(XMY1035);
		}

		if (XMY0036 == null) {
			thongsochungchixemayImpl.setXMY0036(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0036(XMY0036);
		}

		if (XMY0037 == null) {
			thongsochungchixemayImpl.setXMY0037(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0037(XMY0037);
		}

		if (XMY0038 == null) {
			thongsochungchixemayImpl.setXMY0038(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0038(XMY0038);
		}

		if (XMY0039 == null) {
			thongsochungchixemayImpl.setXMY0039(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0039(XMY0039);
		}

		if (XMY1039 == null) {
			thongsochungchixemayImpl.setXMY1039(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1039(XMY1039);
		}

		if (XMY0040 == null) {
			thongsochungchixemayImpl.setXMY0040(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0040(XMY0040);
		}

		if (XMY1040 == null) {
			thongsochungchixemayImpl.setXMY1040(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1040(XMY1040);
		}

		if (XMY0041 == null) {
			thongsochungchixemayImpl.setXMY0041(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0041(XMY0041);
		}

		if (XMY0042 == null) {
			thongsochungchixemayImpl.setXMY0042(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0042(XMY0042);
		}

		if (XMY1042 == null) {
			thongsochungchixemayImpl.setXMY1042(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1042(XMY1042);
		}

		if (XMY0043 == null) {
			thongsochungchixemayImpl.setXMY0043(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0043(XMY0043);
		}

		if (XMY0044 == null) {
			thongsochungchixemayImpl.setXMY0044(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0044(XMY0044);
		}

		if (XMY0045 == null) {
			thongsochungchixemayImpl.setXMY0045(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0045(XMY0045);
		}

		if (XMY0046 == null) {
			thongsochungchixemayImpl.setXMY0046(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0046(XMY0046);
		}

		if (XMY0047 == null) {
			thongsochungchixemayImpl.setXMY0047(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0047(XMY0047);
		}

		if (XMY0048 == null) {
			thongsochungchixemayImpl.setXMY0048(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0048(XMY0048);
		}

		if (XMY0049 == null) {
			thongsochungchixemayImpl.setXMY0049(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0049(XMY0049);
		}

		if (XMY0050 == null) {
			thongsochungchixemayImpl.setXMY0050(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0050(XMY0050);
		}

		if (XMY1050 == null) {
			thongsochungchixemayImpl.setXMY1050(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1050(XMY1050);
		}

		if (XMY0051 == null) {
			thongsochungchixemayImpl.setXMY0051(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0051(XMY0051);
		}

		if (XMY0052 == null) {
			thongsochungchixemayImpl.setXMY0052(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0052(XMY0052);
		}

		if (XMY0053 == null) {
			thongsochungchixemayImpl.setXMY0053(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0053(XMY0053);
		}

		if (XMY0054 == null) {
			thongsochungchixemayImpl.setXMY0054(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0054(XMY0054);
		}

		if (XMY0055 == null) {
			thongsochungchixemayImpl.setXMY0055(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0055(XMY0055);
		}

		if (XMY0056 == null) {
			thongsochungchixemayImpl.setXMY0056(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0056(XMY0056);
		}

		if (XMY0057 == null) {
			thongsochungchixemayImpl.setXMY0057(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0057(XMY0057);
		}

		if (XMY0058 == null) {
			thongsochungchixemayImpl.setXMY0058(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0058(XMY0058);
		}

		if (XMY0059 == null) {
			thongsochungchixemayImpl.setXMY0059(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0059(XMY0059);
		}

		if (XMY0060 == null) {
			thongsochungchixemayImpl.setXMY0060(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0060(XMY0060);
		}

		if (XMY0061 == null) {
			thongsochungchixemayImpl.setXMY0061(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0061(XMY0061);
		}

		if (XMY0062 == null) {
			thongsochungchixemayImpl.setXMY0062(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0062(XMY0062);
		}

		if (XMY0063 == null) {
			thongsochungchixemayImpl.setXMY0063(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0063(XMY0063);
		}

		if (XMY0064 == null) {
			thongsochungchixemayImpl.setXMY0064(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0064(XMY0064);
		}

		if (XMY0065 == null) {
			thongsochungchixemayImpl.setXMY0065(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0065(XMY0065);
		}

		if (XMY0066 == null) {
			thongsochungchixemayImpl.setXMY0066(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0066(XMY0066);
		}

		if (XMY0067 == null) {
			thongsochungchixemayImpl.setXMY0067(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0067(XMY0067);
		}

		if (XMY0068 == null) {
			thongsochungchixemayImpl.setXMY0068(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0068(XMY0068);
		}

		if (XMY0069 == null) {
			thongsochungchixemayImpl.setXMY0069(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0069(XMY0069);
		}

		if (XMY0082 == null) {
			thongsochungchixemayImpl.setXMY0082(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0082(XMY0082);
		}

		if (XMY0083 == null) {
			thongsochungchixemayImpl.setXMY0083(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0083(XMY0083);
		}

		if (XMY0084 == null) {
			thongsochungchixemayImpl.setXMY0084(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0084(XMY0084);
		}

		if (XMY0085 == null) {
			thongsochungchixemayImpl.setXMY0085(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0085(XMY0085);
		}

		if (XMY0086 == null) {
			thongsochungchixemayImpl.setXMY0086(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0086(XMY0086);
		}

		if (XMY1086 == null) {
			thongsochungchixemayImpl.setXMY1086(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1086(XMY1086);
		}

		if (XMY0087 == null) {
			thongsochungchixemayImpl.setXMY0087(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0087(XMY0087);
		}

		if (XMY1087 == null) {
			thongsochungchixemayImpl.setXMY1087(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1087(XMY1087);
		}

		if (XMY1187 == null) {
			thongsochungchixemayImpl.setXMY1187(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1187(XMY1187);
		}

		if (XMY0088 == null) {
			thongsochungchixemayImpl.setXMY0088(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0088(XMY0088);
		}

		if (XMY1088 == null) {
			thongsochungchixemayImpl.setXMY1088(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1088(XMY1088);
		}

		if (XMY1188 == null) {
			thongsochungchixemayImpl.setXMY1188(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1188(XMY1188);
		}

		if (XMY0089 == null) {
			thongsochungchixemayImpl.setXMY0089(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0089(XMY0089);
		}

		if (XMY1089 == null) {
			thongsochungchixemayImpl.setXMY1089(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1089(XMY1089);
		}

		if (XMY1189 == null) {
			thongsochungchixemayImpl.setXMY1189(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1189(XMY1189);
		}

		if (XMY0090 == null) {
			thongsochungchixemayImpl.setXMY0090(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0090(XMY0090);
		}

		if (XMY0091 == null) {
			thongsochungchixemayImpl.setXMY0091(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0091(XMY0091);
		}

		if (XMY0092 == null) {
			thongsochungchixemayImpl.setXMY0092(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0092(XMY0092);
		}

		if (XMY0093 == null) {
			thongsochungchixemayImpl.setXMY0093(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0093(XMY0093);
		}

		if (XMY0094 == null) {
			thongsochungchixemayImpl.setXMY0094(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0094(XMY0094);
		}

		if (XMY0095 == null) {
			thongsochungchixemayImpl.setXMY0095(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0095(XMY0095);
		}

		if (XMY0096 == null) {
			thongsochungchixemayImpl.setXMY0096(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0096(XMY0096);
		}

		if (XMY0097 == null) {
			thongsochungchixemayImpl.setXMY0097(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0097(XMY0097);
		}

		if (XMY0098 == null) {
			thongsochungchixemayImpl.setXMY0098(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0098(XMY0098);
		}

		if (XMY0099 == null) {
			thongsochungchixemayImpl.setXMY0099(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0099(XMY0099);
		}

		if (XMY0100 == null) {
			thongsochungchixemayImpl.setXMY0100(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0100(XMY0100);
		}

		if (XMY0101 == null) {
			thongsochungchixemayImpl.setXMY0101(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0101(XMY0101);
		}

		if (XMY0102 == null) {
			thongsochungchixemayImpl.setXMY0102(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0102(XMY0102);
		}

		if (XMY0103 == null) {
			thongsochungchixemayImpl.setXMY0103(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0103(XMY0103);
		}

		if (XMY0104 == null) {
			thongsochungchixemayImpl.setXMY0104(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0104(XMY0104);
		}

		if (XMY0105 == null) {
			thongsochungchixemayImpl.setXMY0105(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0105(XMY0105);
		}

		if (XMY0106 == null) {
			thongsochungchixemayImpl.setXMY0106(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0106(XMY0106);
		}

		if (XMY2106 == null) {
			thongsochungchixemayImpl.setXMY2106(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2106(XMY2106);
		}

		if (XMY0107 == null) {
			thongsochungchixemayImpl.setXMY0107(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0107(XMY0107);
		}

		if (XMY2107 == null) {
			thongsochungchixemayImpl.setXMY2107(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2107(XMY2107);
		}

		if (XMY0108 == null) {
			thongsochungchixemayImpl.setXMY0108(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0108(XMY0108);
		}

		if (XMY2108 == null) {
			thongsochungchixemayImpl.setXMY2108(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2108(XMY2108);
		}

		if (XMY0109 == null) {
			thongsochungchixemayImpl.setXMY0109(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0109(XMY0109);
		}

		if (XMY2109 == null) {
			thongsochungchixemayImpl.setXMY2109(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2109(XMY2109);
		}

		if (XMY0110 == null) {
			thongsochungchixemayImpl.setXMY0110(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0110(XMY0110);
		}

		if (XMY2110 == null) {
			thongsochungchixemayImpl.setXMY2110(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2110(XMY2110);
		}

		if (XMY0111 == null) {
			thongsochungchixemayImpl.setXMY0111(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0111(XMY0111);
		}

		if (XMY2111 == null) {
			thongsochungchixemayImpl.setXMY2111(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2111(XMY2111);
		}

		if (XMY0112 == null) {
			thongsochungchixemayImpl.setXMY0112(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0112(XMY0112);
		}

		if (XMY2112 == null) {
			thongsochungchixemayImpl.setXMY2112(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2112(XMY2112);
		}

		if (XMY0113 == null) {
			thongsochungchixemayImpl.setXMY0113(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0113(XMY0113);
		}

		if (XMY2113 == null) {
			thongsochungchixemayImpl.setXMY2113(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2113(XMY2113);
		}

		if (XMY0114 == null) {
			thongsochungchixemayImpl.setXMY0114(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0114(XMY0114);
		}

		if (XMY2114 == null) {
			thongsochungchixemayImpl.setXMY2114(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2114(XMY2114);
		}

		if (XMY0115 == null) {
			thongsochungchixemayImpl.setXMY0115(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0115(XMY0115);
		}

		if (XMY2115 == null) {
			thongsochungchixemayImpl.setXMY2115(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2115(XMY2115);
		}

		if (XMY0116 == null) {
			thongsochungchixemayImpl.setXMY0116(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0116(XMY0116);
		}

		if (XMY2116 == null) {
			thongsochungchixemayImpl.setXMY2116(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2116(XMY2116);
		}

		if (XMY0117 == null) {
			thongsochungchixemayImpl.setXMY0117(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0117(XMY0117);
		}

		if (XMY2117 == null) {
			thongsochungchixemayImpl.setXMY2117(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2117(XMY2117);
		}

		if (XMY0118 == null) {
			thongsochungchixemayImpl.setXMY0118(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0118(XMY0118);
		}

		if (XMY2118 == null) {
			thongsochungchixemayImpl.setXMY2118(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2118(XMY2118);
		}

		if (XMY0119 == null) {
			thongsochungchixemayImpl.setXMY0119(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0119(XMY0119);
		}

		if (XMY2119 == null) {
			thongsochungchixemayImpl.setXMY2119(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2119(XMY2119);
		}

		if (XMY0120 == null) {
			thongsochungchixemayImpl.setXMY0120(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0120(XMY0120);
		}

		if (XMY0121 == null) {
			thongsochungchixemayImpl.setXMY0121(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0121(XMY0121);
		}

		if (XMY2121 == null) {
			thongsochungchixemayImpl.setXMY2121(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY2121(XMY2121);
		}

		if (XMY0122 == null) {
			thongsochungchixemayImpl.setXMY0122(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0122(XMY0122);
		}

		if (XMY0198 == null) {
			thongsochungchixemayImpl.setXMY0198(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY0198(XMY0198);
		}

		if (XMY1098 == null) {
			thongsochungchixemayImpl.setXMY1098(StringPool.BLANK);
		}
		else {
			thongsochungchixemayImpl.setXMY1098(XMY1098);
		}

		thongsochungchixemayImpl.resetOriginalValues();

		return thongsochungchixemayImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		SynchDate = objectInput.readLong();
		XMY0009 = objectInput.readUTF();
		XMY0010 = objectInput.readUTF();
		XMY0011 = objectInput.readUTF();
		XMY0012 = objectInput.readUTF();
		XMY0013 = objectInput.readUTF();
		XMY0014 = objectInput.readUTF();
		XMY0015 = objectInput.readUTF();
		XMY0016 = objectInput.readUTF();
		XMY0017 = objectInput.readUTF();
		XMY0018 = objectInput.readUTF();
		XMY0019 = objectInput.readUTF();
		XMY0020 = objectInput.readUTF();
		XMY0021 = objectInput.readUTF();
		XMY0022 = objectInput.readUTF();
		XMY1022 = objectInput.readUTF();
		XMY0023 = objectInput.readUTF();
		XMY0024 = objectInput.readUTF();
		XMY0025 = objectInput.readUTF();
		XMY0026 = objectInput.readUTF();
		XMY0027 = objectInput.readUTF();
		XMY0028 = objectInput.readUTF();
		XMY0029 = objectInput.readUTF();
		XMY0030 = objectInput.readUTF();
		XMY0031 = objectInput.readUTF();
		XMY0032 = objectInput.readUTF();
		XMY1032 = objectInput.readUTF();
		XMY0033 = objectInput.readUTF();
		XMY1033 = objectInput.readUTF();
		XMY0034 = objectInput.readUTF();
		XMY0035 = objectInput.readUTF();
		XMY1035 = objectInput.readUTF();
		XMY0036 = objectInput.readUTF();
		XMY0037 = objectInput.readUTF();
		XMY0038 = objectInput.readUTF();
		XMY0039 = objectInput.readUTF();
		XMY1039 = objectInput.readUTF();
		XMY0040 = objectInput.readUTF();
		XMY1040 = objectInput.readUTF();
		XMY0041 = objectInput.readUTF();
		XMY0042 = objectInput.readUTF();
		XMY1042 = objectInput.readUTF();
		XMY0043 = objectInput.readUTF();
		XMY0044 = objectInput.readUTF();
		XMY0045 = objectInput.readUTF();
		XMY0046 = objectInput.readUTF();
		XMY0047 = objectInput.readUTF();
		XMY0048 = objectInput.readUTF();
		XMY0049 = objectInput.readUTF();
		XMY0050 = objectInput.readUTF();
		XMY1050 = objectInput.readUTF();
		XMY0051 = objectInput.readUTF();
		XMY0052 = objectInput.readUTF();
		XMY0053 = objectInput.readUTF();
		XMY0054 = objectInput.readUTF();
		XMY0055 = objectInput.readUTF();
		XMY0056 = objectInput.readUTF();
		XMY0057 = objectInput.readUTF();
		XMY0058 = objectInput.readUTF();
		XMY0059 = objectInput.readUTF();
		XMY0060 = objectInput.readUTF();
		XMY0061 = objectInput.readUTF();
		XMY0062 = objectInput.readUTF();
		XMY0063 = objectInput.readUTF();
		XMY0064 = objectInput.readUTF();
		XMY0065 = objectInput.readUTF();
		XMY0066 = objectInput.readUTF();
		XMY0067 = objectInput.readUTF();
		XMY0068 = objectInput.readUTF();
		XMY0069 = objectInput.readUTF();
		XMY0082 = objectInput.readUTF();
		XMY0083 = objectInput.readUTF();
		XMY0084 = objectInput.readUTF();
		XMY0085 = objectInput.readUTF();
		XMY0086 = objectInput.readUTF();
		XMY1086 = objectInput.readUTF();
		XMY0087 = objectInput.readUTF();
		XMY1087 = objectInput.readUTF();
		XMY1187 = objectInput.readUTF();
		XMY0088 = objectInput.readUTF();
		XMY1088 = objectInput.readUTF();
		XMY1188 = objectInput.readUTF();
		XMY0089 = objectInput.readUTF();
		XMY1089 = objectInput.readUTF();
		XMY1189 = objectInput.readUTF();
		XMY0090 = objectInput.readUTF();
		XMY0091 = objectInput.readUTF();
		XMY0092 = objectInput.readUTF();
		XMY0093 = objectInput.readUTF();
		XMY0094 = objectInput.readUTF();
		XMY0095 = objectInput.readUTF();
		XMY0096 = objectInput.readUTF();
		XMY0097 = objectInput.readUTF();
		XMY0098 = objectInput.readUTF();
		XMY0099 = objectInput.readUTF();
		XMY0100 = objectInput.readUTF();
		XMY0101 = objectInput.readUTF();
		XMY0102 = objectInput.readUTF();
		XMY0103 = objectInput.readUTF();
		XMY0104 = objectInput.readUTF();
		XMY0105 = objectInput.readUTF();
		XMY0106 = objectInput.readUTF();
		XMY2106 = objectInput.readUTF();
		XMY0107 = objectInput.readUTF();
		XMY2107 = objectInput.readUTF();
		XMY0108 = objectInput.readUTF();
		XMY2108 = objectInput.readUTF();
		XMY0109 = objectInput.readUTF();
		XMY2109 = objectInput.readUTF();
		XMY0110 = objectInput.readUTF();
		XMY2110 = objectInput.readUTF();
		XMY0111 = objectInput.readUTF();
		XMY2111 = objectInput.readUTF();
		XMY0112 = objectInput.readUTF();
		XMY2112 = objectInput.readUTF();
		XMY0113 = objectInput.readUTF();
		XMY2113 = objectInput.readUTF();
		XMY0114 = objectInput.readUTF();
		XMY2114 = objectInput.readUTF();
		XMY0115 = objectInput.readUTF();
		XMY2115 = objectInput.readUTF();
		XMY0116 = objectInput.readUTF();
		XMY2116 = objectInput.readUTF();
		XMY0117 = objectInput.readUTF();
		XMY2117 = objectInput.readUTF();
		XMY0118 = objectInput.readUTF();
		XMY2118 = objectInput.readUTF();
		XMY0119 = objectInput.readUTF();
		XMY2119 = objectInput.readUTF();
		XMY0120 = objectInput.readUTF();
		XMY0121 = objectInput.readUTF();
		XMY2121 = objectInput.readUTF();
		XMY0122 = objectInput.readUTF();
		XMY0198 = objectInput.readUTF();
		XMY1098 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(SynchDate);

		if (XMY0009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0009);
		}

		if (XMY0010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0010);
		}

		if (XMY0011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0011);
		}

		if (XMY0012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0012);
		}

		if (XMY0013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0013);
		}

		if (XMY0014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0014);
		}

		if (XMY0015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0015);
		}

		if (XMY0016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0016);
		}

		if (XMY0017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0017);
		}

		if (XMY0018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0018);
		}

		if (XMY0019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0019);
		}

		if (XMY0020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0020);
		}

		if (XMY0021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0021);
		}

		if (XMY0022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0022);
		}

		if (XMY1022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1022);
		}

		if (XMY0023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0023);
		}

		if (XMY0024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0024);
		}

		if (XMY0025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0025);
		}

		if (XMY0026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0026);
		}

		if (XMY0027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0027);
		}

		if (XMY0028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0028);
		}

		if (XMY0029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0029);
		}

		if (XMY0030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0030);
		}

		if (XMY0031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0031);
		}

		if (XMY0032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0032);
		}

		if (XMY1032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1032);
		}

		if (XMY0033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0033);
		}

		if (XMY1033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1033);
		}

		if (XMY0034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0034);
		}

		if (XMY0035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0035);
		}

		if (XMY1035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1035);
		}

		if (XMY0036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0036);
		}

		if (XMY0037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0037);
		}

		if (XMY0038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0038);
		}

		if (XMY0039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0039);
		}

		if (XMY1039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1039);
		}

		if (XMY0040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0040);
		}

		if (XMY1040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1040);
		}

		if (XMY0041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0041);
		}

		if (XMY0042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0042);
		}

		if (XMY1042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1042);
		}

		if (XMY0043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0043);
		}

		if (XMY0044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0044);
		}

		if (XMY0045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0045);
		}

		if (XMY0046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0046);
		}

		if (XMY0047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0047);
		}

		if (XMY0048 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0048);
		}

		if (XMY0049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0049);
		}

		if (XMY0050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0050);
		}

		if (XMY1050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1050);
		}

		if (XMY0051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0051);
		}

		if (XMY0052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0052);
		}

		if (XMY0053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0053);
		}

		if (XMY0054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0054);
		}

		if (XMY0055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0055);
		}

		if (XMY0056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0056);
		}

		if (XMY0057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0057);
		}

		if (XMY0058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0058);
		}

		if (XMY0059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0059);
		}

		if (XMY0060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0060);
		}

		if (XMY0061 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0061);
		}

		if (XMY0062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0062);
		}

		if (XMY0063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0063);
		}

		if (XMY0064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0064);
		}

		if (XMY0065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0065);
		}

		if (XMY0066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0066);
		}

		if (XMY0067 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0067);
		}

		if (XMY0068 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0068);
		}

		if (XMY0069 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0069);
		}

		if (XMY0082 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0082);
		}

		if (XMY0083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0083);
		}

		if (XMY0084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0084);
		}

		if (XMY0085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0085);
		}

		if (XMY0086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0086);
		}

		if (XMY1086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1086);
		}

		if (XMY0087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0087);
		}

		if (XMY1087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1087);
		}

		if (XMY1187 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1187);
		}

		if (XMY0088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0088);
		}

		if (XMY1088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1088);
		}

		if (XMY1188 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1188);
		}

		if (XMY0089 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0089);
		}

		if (XMY1089 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1089);
		}

		if (XMY1189 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1189);
		}

		if (XMY0090 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0090);
		}

		if (XMY0091 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0091);
		}

		if (XMY0092 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0092);
		}

		if (XMY0093 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0093);
		}

		if (XMY0094 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0094);
		}

		if (XMY0095 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0095);
		}

		if (XMY0096 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0096);
		}

		if (XMY0097 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0097);
		}

		if (XMY0098 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0098);
		}

		if (XMY0099 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0099);
		}

		if (XMY0100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0100);
		}

		if (XMY0101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0101);
		}

		if (XMY0102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0102);
		}

		if (XMY0103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0103);
		}

		if (XMY0104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0104);
		}

		if (XMY0105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0105);
		}

		if (XMY0106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0106);
		}

		if (XMY2106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2106);
		}

		if (XMY0107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0107);
		}

		if (XMY2107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2107);
		}

		if (XMY0108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0108);
		}

		if (XMY2108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2108);
		}

		if (XMY0109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0109);
		}

		if (XMY2109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2109);
		}

		if (XMY0110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0110);
		}

		if (XMY2110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2110);
		}

		if (XMY0111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0111);
		}

		if (XMY2111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2111);
		}

		if (XMY0112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0112);
		}

		if (XMY2112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2112);
		}

		if (XMY0113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0113);
		}

		if (XMY2113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2113);
		}

		if (XMY0114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0114);
		}

		if (XMY2114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2114);
		}

		if (XMY0115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0115);
		}

		if (XMY2115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2115);
		}

		if (XMY0116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0116);
		}

		if (XMY2116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2116);
		}

		if (XMY0117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0117);
		}

		if (XMY2117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2117);
		}

		if (XMY0118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0118);
		}

		if (XMY2118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2118);
		}

		if (XMY0119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0119);
		}

		if (XMY2119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2119);
		}

		if (XMY0120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0120);
		}

		if (XMY0121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0121);
		}

		if (XMY2121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY2121);
		}

		if (XMY0122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0122);
		}

		if (XMY0198 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY0198);
		}

		if (XMY1098 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XMY1098);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long certificateRecordId;
	public long vehicleGroupId;
	public long SynchDate;
	public String XMY0009;
	public String XMY0010;
	public String XMY0011;
	public String XMY0012;
	public String XMY0013;
	public String XMY0014;
	public String XMY0015;
	public String XMY0016;
	public String XMY0017;
	public String XMY0018;
	public String XMY0019;
	public String XMY0020;
	public String XMY0021;
	public String XMY0022;
	public String XMY1022;
	public String XMY0023;
	public String XMY0024;
	public String XMY0025;
	public String XMY0026;
	public String XMY0027;
	public String XMY0028;
	public String XMY0029;
	public String XMY0030;
	public String XMY0031;
	public String XMY0032;
	public String XMY1032;
	public String XMY0033;
	public String XMY1033;
	public String XMY0034;
	public String XMY0035;
	public String XMY1035;
	public String XMY0036;
	public String XMY0037;
	public String XMY0038;
	public String XMY0039;
	public String XMY1039;
	public String XMY0040;
	public String XMY1040;
	public String XMY0041;
	public String XMY0042;
	public String XMY1042;
	public String XMY0043;
	public String XMY0044;
	public String XMY0045;
	public String XMY0046;
	public String XMY0047;
	public String XMY0048;
	public String XMY0049;
	public String XMY0050;
	public String XMY1050;
	public String XMY0051;
	public String XMY0052;
	public String XMY0053;
	public String XMY0054;
	public String XMY0055;
	public String XMY0056;
	public String XMY0057;
	public String XMY0058;
	public String XMY0059;
	public String XMY0060;
	public String XMY0061;
	public String XMY0062;
	public String XMY0063;
	public String XMY0064;
	public String XMY0065;
	public String XMY0066;
	public String XMY0067;
	public String XMY0068;
	public String XMY0069;
	public String XMY0082;
	public String XMY0083;
	public String XMY0084;
	public String XMY0085;
	public String XMY0086;
	public String XMY1086;
	public String XMY0087;
	public String XMY1087;
	public String XMY1187;
	public String XMY0088;
	public String XMY1088;
	public String XMY1188;
	public String XMY0089;
	public String XMY1089;
	public String XMY1189;
	public String XMY0090;
	public String XMY0091;
	public String XMY0092;
	public String XMY0093;
	public String XMY0094;
	public String XMY0095;
	public String XMY0096;
	public String XMY0097;
	public String XMY0098;
	public String XMY0099;
	public String XMY0100;
	public String XMY0101;
	public String XMY0102;
	public String XMY0103;
	public String XMY0104;
	public String XMY0105;
	public String XMY0106;
	public String XMY2106;
	public String XMY0107;
	public String XMY2107;
	public String XMY0108;
	public String XMY2108;
	public String XMY0109;
	public String XMY2109;
	public String XMY0110;
	public String XMY2110;
	public String XMY0111;
	public String XMY2111;
	public String XMY0112;
	public String XMY2112;
	public String XMY0113;
	public String XMY2113;
	public String XMY0114;
	public String XMY2114;
	public String XMY0115;
	public String XMY2115;
	public String XMY0116;
	public String XMY2116;
	public String XMY0117;
	public String XMY2117;
	public String XMY0118;
	public String XMY2118;
	public String XMY0119;
	public String XMY2119;
	public String XMY0120;
	public String XMY0121;
	public String XMY2121;
	public String XMY0122;
	public String XMY0198;
	public String XMY1098;
}