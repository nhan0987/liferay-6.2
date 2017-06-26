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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGSOCHUNGCHIXEBONBANH in entity cache.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEBONBANH
 * @generated
 */
public class THONGSOCHUNGCHIXEBONBANHCacheModel implements CacheModel<THONGSOCHUNGCHIXEBONBANH>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(303);

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
		sb.append(", XBB0009=");
		sb.append(XBB0009);
		sb.append(", XBB0010=");
		sb.append(XBB0010);
		sb.append(", XBB0011=");
		sb.append(XBB0011);
		sb.append(", XBB0012=");
		sb.append(XBB0012);
		sb.append(", XBB0013=");
		sb.append(XBB0013);
		sb.append(", XBB0014=");
		sb.append(XBB0014);
		sb.append(", XBB1014=");
		sb.append(XBB1014);
		sb.append(", XBB1114=");
		sb.append(XBB1114);
		sb.append(", XBB0015=");
		sb.append(XBB0015);
		sb.append(", XBB1015=");
		sb.append(XBB1015);
		sb.append(", XBB1115=");
		sb.append(XBB1115);
		sb.append(", XBB0016=");
		sb.append(XBB0016);
		sb.append(", XBB1016=");
		sb.append(XBB1016);
		sb.append(", XBB1116=");
		sb.append(XBB1116);
		sb.append(", XBB0017=");
		sb.append(XBB0017);
		sb.append(", XBB1017=");
		sb.append(XBB1017);
		sb.append(", XBB1117=");
		sb.append(XBB1117);
		sb.append(", XBB0018=");
		sb.append(XBB0018);
		sb.append(", XBB0019=");
		sb.append(XBB0019);
		sb.append(", XBB0020=");
		sb.append(XBB0020);
		sb.append(", XBB0021=");
		sb.append(XBB0021);
		sb.append(", XBB0022=");
		sb.append(XBB0022);
		sb.append(", XBB1022=");
		sb.append(XBB1022);
		sb.append(", XBB0023=");
		sb.append(XBB0023);
		sb.append(", XBB0024=");
		sb.append(XBB0024);
		sb.append(", XBB0025=");
		sb.append(XBB0025);
		sb.append(", XBB0026=");
		sb.append(XBB0026);
		sb.append(", XBB1026=");
		sb.append(XBB1026);
		sb.append(", XBB0027=");
		sb.append(XBB0027);
		sb.append(", XBB1027=");
		sb.append(XBB1027);
		sb.append(", XBB0028=");
		sb.append(XBB0028);
		sb.append(", XBB0029=");
		sb.append(XBB0029);
		sb.append(", XBB1029=");
		sb.append(XBB1029);
		sb.append(", XBB0030=");
		sb.append(XBB0030);
		sb.append(", XBB0031=");
		sb.append(XBB0031);
		sb.append(", XBB0032=");
		sb.append(XBB0032);
		sb.append(", XBB0033=");
		sb.append(XBB0033);
		sb.append(", XBB1033=");
		sb.append(XBB1033);
		sb.append(", XBB0034=");
		sb.append(XBB0034);
		sb.append(", XBB1034=");
		sb.append(XBB1034);
		sb.append(", XBB0035=");
		sb.append(XBB0035);
		sb.append(", XBB0036=");
		sb.append(XBB0036);
		sb.append(", XBB1036=");
		sb.append(XBB1036);
		sb.append(", XBB0037=");
		sb.append(XBB0037);
		sb.append(", XBB0038=");
		sb.append(XBB0038);
		sb.append(", XBB0039=");
		sb.append(XBB0039);
		sb.append(", XBB0040=");
		sb.append(XBB0040);
		sb.append(", XBB0041=");
		sb.append(XBB0041);
		sb.append(", XBB0042=");
		sb.append(XBB0042);
		sb.append(", XBB0043=");
		sb.append(XBB0043);
		sb.append(", XBB0044=");
		sb.append(XBB0044);
		sb.append(", XBB1044=");
		sb.append(XBB1044);
		sb.append(", XBB0045=");
		sb.append(XBB0045);
		sb.append(", XBB0046=");
		sb.append(XBB0046);
		sb.append(", XBB0047=");
		sb.append(XBB0047);
		sb.append(", XBB0048=");
		sb.append(XBB0048);
		sb.append(", XBB0049=");
		sb.append(XBB0049);
		sb.append(", XBB0050=");
		sb.append(XBB0050);
		sb.append(", XBB0051=");
		sb.append(XBB0051);
		sb.append(", XBB0052=");
		sb.append(XBB0052);
		sb.append(", XBB0053=");
		sb.append(XBB0053);
		sb.append(", XBB0054=");
		sb.append(XBB0054);
		sb.append(", XBB0055=");
		sb.append(XBB0055);
		sb.append(", XBB0056=");
		sb.append(XBB0056);
		sb.append(", XBB0057=");
		sb.append(XBB0057);
		sb.append(", XBB0058=");
		sb.append(XBB0058);
		sb.append(", XBB0059=");
		sb.append(XBB0059);
		sb.append(", XBB0060=");
		sb.append(XBB0060);
		sb.append(", XBB0061=");
		sb.append(XBB0061);
		sb.append(", XBB0062=");
		sb.append(XBB0062);
		sb.append(", XBB0063=");
		sb.append(XBB0063);
		sb.append(", XBB0076=");
		sb.append(XBB0076);
		sb.append(", XBB0077=");
		sb.append(XBB0077);
		sb.append(", XBB0078=");
		sb.append(XBB0078);
		sb.append(", XBB0079=");
		sb.append(XBB0079);
		sb.append(", XBB0080=");
		sb.append(XBB0080);
		sb.append(", XBB1080=");
		sb.append(XBB1080);
		sb.append(", XBB0081=");
		sb.append(XBB0081);
		sb.append(", XBB1081=");
		sb.append(XBB1081);
		sb.append(", XBB1181=");
		sb.append(XBB1181);
		sb.append(", XBB0082=");
		sb.append(XBB0082);
		sb.append(", XBB1082=");
		sb.append(XBB1082);
		sb.append(", XBB1182=");
		sb.append(XBB1182);
		sb.append(", XBB0083=");
		sb.append(XBB0083);
		sb.append(", XBB1083=");
		sb.append(XBB1083);
		sb.append(", XBB1183=");
		sb.append(XBB1183);
		sb.append(", XBB0084=");
		sb.append(XBB0084);
		sb.append(", XBB0085=");
		sb.append(XBB0085);
		sb.append(", XBB0086=");
		sb.append(XBB0086);
		sb.append(", XBB0087=");
		sb.append(XBB0087);
		sb.append(", XBB0088=");
		sb.append(XBB0088);
		sb.append(", XBB0089=");
		sb.append(XBB0089);
		sb.append(", XBB0090=");
		sb.append(XBB0090);
		sb.append(", XBB0091=");
		sb.append(XBB0091);
		sb.append(", XBB0092=");
		sb.append(XBB0092);
		sb.append(", XBB0093=");
		sb.append(XBB0093);
		sb.append(", XBB0094=");
		sb.append(XBB0094);
		sb.append(", XBB0095=");
		sb.append(XBB0095);
		sb.append(", XBB0096=");
		sb.append(XBB0096);
		sb.append(", XBB0097=");
		sb.append(XBB0097);
		sb.append(", XBB0098=");
		sb.append(XBB0098);
		sb.append(", XBB0099=");
		sb.append(XBB0099);
		sb.append(", XBB0100=");
		sb.append(XBB0100);
		sb.append(", XBB0101=");
		sb.append(XBB0101);
		sb.append(", XBB0102=");
		sb.append(XBB0102);
		sb.append(", XBB0103=");
		sb.append(XBB0103);
		sb.append(", XBB0104=");
		sb.append(XBB0104);
		sb.append(", XBB2104=");
		sb.append(XBB2104);
		sb.append(", XBB0105=");
		sb.append(XBB0105);
		sb.append(", XBB2105=");
		sb.append(XBB2105);
		sb.append(", XBB0106=");
		sb.append(XBB0106);
		sb.append(", XBB2106=");
		sb.append(XBB2106);
		sb.append(", XBB0107=");
		sb.append(XBB0107);
		sb.append(", XBB2107=");
		sb.append(XBB2107);
		sb.append(", XBB0108=");
		sb.append(XBB0108);
		sb.append(", XBB2108=");
		sb.append(XBB2108);
		sb.append(", XBB0109=");
		sb.append(XBB0109);
		sb.append(", XBB2109=");
		sb.append(XBB2109);
		sb.append(", XBB0110=");
		sb.append(XBB0110);
		sb.append(", XBB2110=");
		sb.append(XBB2110);
		sb.append(", XBB0111=");
		sb.append(XBB0111);
		sb.append(", XBB2111=");
		sb.append(XBB2111);
		sb.append(", XBB0112=");
		sb.append(XBB0112);
		sb.append(", XBB2112=");
		sb.append(XBB2112);
		sb.append(", XBB0113=");
		sb.append(XBB0113);
		sb.append(", XBB2113=");
		sb.append(XBB2113);
		sb.append(", XBB0114=");
		sb.append(XBB0114);
		sb.append(", XBB2114=");
		sb.append(XBB2114);
		sb.append(", XBB0115=");
		sb.append(XBB0115);
		sb.append(", XBB2115=");
		sb.append(XBB2115);
		sb.append(", XBB0116=");
		sb.append(XBB0116);
		sb.append(", XBB2116=");
		sb.append(XBB2116);
		sb.append(", XBB0117=");
		sb.append(XBB0117);
		sb.append(", XBB2117=");
		sb.append(XBB2117);
		sb.append(", XBB0118=");
		sb.append(XBB0118);
		sb.append(", XBB0119=");
		sb.append(XBB0119);
		sb.append(", XBB2119=");
		sb.append(XBB2119);
		sb.append(", XBB0120=");
		sb.append(XBB0120);
		sb.append(", XBB0121=");
		sb.append(XBB0121);
		sb.append(", XBB0122=");
		sb.append(XBB0122);
		sb.append(", XBB0123=");
		sb.append(XBB0123);
		sb.append(", XBB0124=");
		sb.append(XBB0124);
		sb.append(", XBB0125=");
		sb.append(XBB0125);
		sb.append(", XBB0126=");
		sb.append(XBB0126);
		sb.append(", XBB1084=");
		sb.append(XBB1084);
		sb.append(", XBB1086=");
		sb.append(XBB1086);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGSOCHUNGCHIXEBONBANH toEntityModel() {
		THONGSOCHUNGCHIXEBONBANHImpl thongsochungchixebonbanhImpl = new THONGSOCHUNGCHIXEBONBANHImpl();

		thongsochungchixebonbanhImpl.setId(id);
		thongsochungchixebonbanhImpl.setHoSoThuTucId(hoSoThuTucId);
		thongsochungchixebonbanhImpl.setCertificateRecordId(certificateRecordId);
		thongsochungchixebonbanhImpl.setVehicleGroupId(vehicleGroupId);

		if (SynchDate == Long.MIN_VALUE) {
			thongsochungchixebonbanhImpl.setSynchDate(null);
		}
		else {
			thongsochungchixebonbanhImpl.setSynchDate(new Date(SynchDate));
		}

		if (XBB0009 == null) {
			thongsochungchixebonbanhImpl.setXBB0009(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0009(XBB0009);
		}

		if (XBB0010 == null) {
			thongsochungchixebonbanhImpl.setXBB0010(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0010(XBB0010);
		}

		if (XBB0011 == null) {
			thongsochungchixebonbanhImpl.setXBB0011(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0011(XBB0011);
		}

		if (XBB0012 == null) {
			thongsochungchixebonbanhImpl.setXBB0012(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0012(XBB0012);
		}

		if (XBB0013 == null) {
			thongsochungchixebonbanhImpl.setXBB0013(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0013(XBB0013);
		}

		if (XBB0014 == null) {
			thongsochungchixebonbanhImpl.setXBB0014(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0014(XBB0014);
		}

		if (XBB1014 == null) {
			thongsochungchixebonbanhImpl.setXBB1014(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1014(XBB1014);
		}

		if (XBB1114 == null) {
			thongsochungchixebonbanhImpl.setXBB1114(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1114(XBB1114);
		}

		if (XBB0015 == null) {
			thongsochungchixebonbanhImpl.setXBB0015(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0015(XBB0015);
		}

		if (XBB1015 == null) {
			thongsochungchixebonbanhImpl.setXBB1015(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1015(XBB1015);
		}

		if (XBB1115 == null) {
			thongsochungchixebonbanhImpl.setXBB1115(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1115(XBB1115);
		}

		if (XBB0016 == null) {
			thongsochungchixebonbanhImpl.setXBB0016(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0016(XBB0016);
		}

		if (XBB1016 == null) {
			thongsochungchixebonbanhImpl.setXBB1016(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1016(XBB1016);
		}

		if (XBB1116 == null) {
			thongsochungchixebonbanhImpl.setXBB1116(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1116(XBB1116);
		}

		if (XBB0017 == null) {
			thongsochungchixebonbanhImpl.setXBB0017(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0017(XBB0017);
		}

		if (XBB1017 == null) {
			thongsochungchixebonbanhImpl.setXBB1017(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1017(XBB1017);
		}

		if (XBB1117 == null) {
			thongsochungchixebonbanhImpl.setXBB1117(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1117(XBB1117);
		}

		if (XBB0018 == null) {
			thongsochungchixebonbanhImpl.setXBB0018(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0018(XBB0018);
		}

		if (XBB0019 == null) {
			thongsochungchixebonbanhImpl.setXBB0019(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0019(XBB0019);
		}

		if (XBB0020 == null) {
			thongsochungchixebonbanhImpl.setXBB0020(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0020(XBB0020);
		}

		if (XBB0021 == null) {
			thongsochungchixebonbanhImpl.setXBB0021(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0021(XBB0021);
		}

		if (XBB0022 == null) {
			thongsochungchixebonbanhImpl.setXBB0022(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0022(XBB0022);
		}

		if (XBB1022 == null) {
			thongsochungchixebonbanhImpl.setXBB1022(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1022(XBB1022);
		}

		if (XBB0023 == null) {
			thongsochungchixebonbanhImpl.setXBB0023(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0023(XBB0023);
		}

		if (XBB0024 == null) {
			thongsochungchixebonbanhImpl.setXBB0024(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0024(XBB0024);
		}

		if (XBB0025 == null) {
			thongsochungchixebonbanhImpl.setXBB0025(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0025(XBB0025);
		}

		if (XBB0026 == null) {
			thongsochungchixebonbanhImpl.setXBB0026(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0026(XBB0026);
		}

		if (XBB1026 == null) {
			thongsochungchixebonbanhImpl.setXBB1026(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1026(XBB1026);
		}

		if (XBB0027 == null) {
			thongsochungchixebonbanhImpl.setXBB0027(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0027(XBB0027);
		}

		if (XBB1027 == null) {
			thongsochungchixebonbanhImpl.setXBB1027(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1027(XBB1027);
		}

		if (XBB0028 == null) {
			thongsochungchixebonbanhImpl.setXBB0028(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0028(XBB0028);
		}

		if (XBB0029 == null) {
			thongsochungchixebonbanhImpl.setXBB0029(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0029(XBB0029);
		}

		if (XBB1029 == null) {
			thongsochungchixebonbanhImpl.setXBB1029(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1029(XBB1029);
		}

		if (XBB0030 == null) {
			thongsochungchixebonbanhImpl.setXBB0030(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0030(XBB0030);
		}

		if (XBB0031 == null) {
			thongsochungchixebonbanhImpl.setXBB0031(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0031(XBB0031);
		}

		if (XBB0032 == null) {
			thongsochungchixebonbanhImpl.setXBB0032(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0032(XBB0032);
		}

		if (XBB0033 == null) {
			thongsochungchixebonbanhImpl.setXBB0033(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0033(XBB0033);
		}

		if (XBB1033 == null) {
			thongsochungchixebonbanhImpl.setXBB1033(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1033(XBB1033);
		}

		if (XBB0034 == null) {
			thongsochungchixebonbanhImpl.setXBB0034(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0034(XBB0034);
		}

		if (XBB1034 == null) {
			thongsochungchixebonbanhImpl.setXBB1034(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1034(XBB1034);
		}

		if (XBB0035 == null) {
			thongsochungchixebonbanhImpl.setXBB0035(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0035(XBB0035);
		}

		if (XBB0036 == null) {
			thongsochungchixebonbanhImpl.setXBB0036(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0036(XBB0036);
		}

		if (XBB1036 == null) {
			thongsochungchixebonbanhImpl.setXBB1036(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1036(XBB1036);
		}

		if (XBB0037 == null) {
			thongsochungchixebonbanhImpl.setXBB0037(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0037(XBB0037);
		}

		if (XBB0038 == null) {
			thongsochungchixebonbanhImpl.setXBB0038(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0038(XBB0038);
		}

		if (XBB0039 == null) {
			thongsochungchixebonbanhImpl.setXBB0039(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0039(XBB0039);
		}

		if (XBB0040 == null) {
			thongsochungchixebonbanhImpl.setXBB0040(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0040(XBB0040);
		}

		if (XBB0041 == null) {
			thongsochungchixebonbanhImpl.setXBB0041(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0041(XBB0041);
		}

		if (XBB0042 == null) {
			thongsochungchixebonbanhImpl.setXBB0042(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0042(XBB0042);
		}

		if (XBB0043 == null) {
			thongsochungchixebonbanhImpl.setXBB0043(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0043(XBB0043);
		}

		if (XBB0044 == null) {
			thongsochungchixebonbanhImpl.setXBB0044(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0044(XBB0044);
		}

		if (XBB1044 == null) {
			thongsochungchixebonbanhImpl.setXBB1044(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1044(XBB1044);
		}

		if (XBB0045 == null) {
			thongsochungchixebonbanhImpl.setXBB0045(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0045(XBB0045);
		}

		if (XBB0046 == null) {
			thongsochungchixebonbanhImpl.setXBB0046(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0046(XBB0046);
		}

		if (XBB0047 == null) {
			thongsochungchixebonbanhImpl.setXBB0047(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0047(XBB0047);
		}

		if (XBB0048 == null) {
			thongsochungchixebonbanhImpl.setXBB0048(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0048(XBB0048);
		}

		if (XBB0049 == null) {
			thongsochungchixebonbanhImpl.setXBB0049(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0049(XBB0049);
		}

		if (XBB0050 == null) {
			thongsochungchixebonbanhImpl.setXBB0050(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0050(XBB0050);
		}

		if (XBB0051 == null) {
			thongsochungchixebonbanhImpl.setXBB0051(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0051(XBB0051);
		}

		if (XBB0052 == null) {
			thongsochungchixebonbanhImpl.setXBB0052(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0052(XBB0052);
		}

		if (XBB0053 == null) {
			thongsochungchixebonbanhImpl.setXBB0053(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0053(XBB0053);
		}

		if (XBB0054 == null) {
			thongsochungchixebonbanhImpl.setXBB0054(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0054(XBB0054);
		}

		if (XBB0055 == null) {
			thongsochungchixebonbanhImpl.setXBB0055(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0055(XBB0055);
		}

		if (XBB0056 == null) {
			thongsochungchixebonbanhImpl.setXBB0056(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0056(XBB0056);
		}

		if (XBB0057 == null) {
			thongsochungchixebonbanhImpl.setXBB0057(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0057(XBB0057);
		}

		if (XBB0058 == null) {
			thongsochungchixebonbanhImpl.setXBB0058(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0058(XBB0058);
		}

		if (XBB0059 == null) {
			thongsochungchixebonbanhImpl.setXBB0059(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0059(XBB0059);
		}

		if (XBB0060 == null) {
			thongsochungchixebonbanhImpl.setXBB0060(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0060(XBB0060);
		}

		if (XBB0061 == null) {
			thongsochungchixebonbanhImpl.setXBB0061(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0061(XBB0061);
		}

		if (XBB0062 == null) {
			thongsochungchixebonbanhImpl.setXBB0062(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0062(XBB0062);
		}

		if (XBB0063 == null) {
			thongsochungchixebonbanhImpl.setXBB0063(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0063(XBB0063);
		}

		if (XBB0076 == null) {
			thongsochungchixebonbanhImpl.setXBB0076(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0076(XBB0076);
		}

		if (XBB0077 == null) {
			thongsochungchixebonbanhImpl.setXBB0077(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0077(XBB0077);
		}

		if (XBB0078 == null) {
			thongsochungchixebonbanhImpl.setXBB0078(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0078(XBB0078);
		}

		if (XBB0079 == null) {
			thongsochungchixebonbanhImpl.setXBB0079(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0079(XBB0079);
		}

		if (XBB0080 == null) {
			thongsochungchixebonbanhImpl.setXBB0080(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0080(XBB0080);
		}

		if (XBB1080 == null) {
			thongsochungchixebonbanhImpl.setXBB1080(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1080(XBB1080);
		}

		if (XBB0081 == null) {
			thongsochungchixebonbanhImpl.setXBB0081(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0081(XBB0081);
		}

		if (XBB1081 == null) {
			thongsochungchixebonbanhImpl.setXBB1081(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1081(XBB1081);
		}

		if (XBB1181 == null) {
			thongsochungchixebonbanhImpl.setXBB1181(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1181(XBB1181);
		}

		if (XBB0082 == null) {
			thongsochungchixebonbanhImpl.setXBB0082(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0082(XBB0082);
		}

		if (XBB1082 == null) {
			thongsochungchixebonbanhImpl.setXBB1082(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1082(XBB1082);
		}

		if (XBB1182 == null) {
			thongsochungchixebonbanhImpl.setXBB1182(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1182(XBB1182);
		}

		if (XBB0083 == null) {
			thongsochungchixebonbanhImpl.setXBB0083(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0083(XBB0083);
		}

		if (XBB1083 == null) {
			thongsochungchixebonbanhImpl.setXBB1083(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1083(XBB1083);
		}

		if (XBB1183 == null) {
			thongsochungchixebonbanhImpl.setXBB1183(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1183(XBB1183);
		}

		if (XBB0084 == null) {
			thongsochungchixebonbanhImpl.setXBB0084(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0084(XBB0084);
		}

		if (XBB0085 == null) {
			thongsochungchixebonbanhImpl.setXBB0085(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0085(XBB0085);
		}

		if (XBB0086 == null) {
			thongsochungchixebonbanhImpl.setXBB0086(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0086(XBB0086);
		}

		if (XBB0087 == null) {
			thongsochungchixebonbanhImpl.setXBB0087(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0087(XBB0087);
		}

		if (XBB0088 == null) {
			thongsochungchixebonbanhImpl.setXBB0088(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0088(XBB0088);
		}

		if (XBB0089 == null) {
			thongsochungchixebonbanhImpl.setXBB0089(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0089(XBB0089);
		}

		if (XBB0090 == null) {
			thongsochungchixebonbanhImpl.setXBB0090(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0090(XBB0090);
		}

		if (XBB0091 == null) {
			thongsochungchixebonbanhImpl.setXBB0091(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0091(XBB0091);
		}

		if (XBB0092 == null) {
			thongsochungchixebonbanhImpl.setXBB0092(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0092(XBB0092);
		}

		if (XBB0093 == null) {
			thongsochungchixebonbanhImpl.setXBB0093(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0093(XBB0093);
		}

		if (XBB0094 == null) {
			thongsochungchixebonbanhImpl.setXBB0094(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0094(XBB0094);
		}

		if (XBB0095 == null) {
			thongsochungchixebonbanhImpl.setXBB0095(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0095(XBB0095);
		}

		if (XBB0096 == null) {
			thongsochungchixebonbanhImpl.setXBB0096(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0096(XBB0096);
		}

		if (XBB0097 == null) {
			thongsochungchixebonbanhImpl.setXBB0097(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0097(XBB0097);
		}

		if (XBB0098 == null) {
			thongsochungchixebonbanhImpl.setXBB0098(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0098(XBB0098);
		}

		if (XBB0099 == null) {
			thongsochungchixebonbanhImpl.setXBB0099(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0099(XBB0099);
		}

		if (XBB0100 == null) {
			thongsochungchixebonbanhImpl.setXBB0100(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0100(XBB0100);
		}

		if (XBB0101 == null) {
			thongsochungchixebonbanhImpl.setXBB0101(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0101(XBB0101);
		}

		if (XBB0102 == null) {
			thongsochungchixebonbanhImpl.setXBB0102(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0102(XBB0102);
		}

		if (XBB0103 == null) {
			thongsochungchixebonbanhImpl.setXBB0103(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0103(XBB0103);
		}

		if (XBB0104 == null) {
			thongsochungchixebonbanhImpl.setXBB0104(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0104(XBB0104);
		}

		if (XBB2104 == null) {
			thongsochungchixebonbanhImpl.setXBB2104(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2104(XBB2104);
		}

		if (XBB0105 == null) {
			thongsochungchixebonbanhImpl.setXBB0105(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0105(XBB0105);
		}

		if (XBB2105 == null) {
			thongsochungchixebonbanhImpl.setXBB2105(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2105(XBB2105);
		}

		if (XBB0106 == null) {
			thongsochungchixebonbanhImpl.setXBB0106(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0106(XBB0106);
		}

		if (XBB2106 == null) {
			thongsochungchixebonbanhImpl.setXBB2106(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2106(XBB2106);
		}

		if (XBB0107 == null) {
			thongsochungchixebonbanhImpl.setXBB0107(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0107(XBB0107);
		}

		if (XBB2107 == null) {
			thongsochungchixebonbanhImpl.setXBB2107(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2107(XBB2107);
		}

		if (XBB0108 == null) {
			thongsochungchixebonbanhImpl.setXBB0108(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0108(XBB0108);
		}

		if (XBB2108 == null) {
			thongsochungchixebonbanhImpl.setXBB2108(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2108(XBB2108);
		}

		if (XBB0109 == null) {
			thongsochungchixebonbanhImpl.setXBB0109(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0109(XBB0109);
		}

		if (XBB2109 == null) {
			thongsochungchixebonbanhImpl.setXBB2109(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2109(XBB2109);
		}

		if (XBB0110 == null) {
			thongsochungchixebonbanhImpl.setXBB0110(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0110(XBB0110);
		}

		if (XBB2110 == null) {
			thongsochungchixebonbanhImpl.setXBB2110(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2110(XBB2110);
		}

		if (XBB0111 == null) {
			thongsochungchixebonbanhImpl.setXBB0111(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0111(XBB0111);
		}

		if (XBB2111 == null) {
			thongsochungchixebonbanhImpl.setXBB2111(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2111(XBB2111);
		}

		if (XBB0112 == null) {
			thongsochungchixebonbanhImpl.setXBB0112(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0112(XBB0112);
		}

		if (XBB2112 == null) {
			thongsochungchixebonbanhImpl.setXBB2112(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2112(XBB2112);
		}

		if (XBB0113 == null) {
			thongsochungchixebonbanhImpl.setXBB0113(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0113(XBB0113);
		}

		if (XBB2113 == null) {
			thongsochungchixebonbanhImpl.setXBB2113(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2113(XBB2113);
		}

		if (XBB0114 == null) {
			thongsochungchixebonbanhImpl.setXBB0114(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0114(XBB0114);
		}

		if (XBB2114 == null) {
			thongsochungchixebonbanhImpl.setXBB2114(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2114(XBB2114);
		}

		if (XBB0115 == null) {
			thongsochungchixebonbanhImpl.setXBB0115(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0115(XBB0115);
		}

		if (XBB2115 == null) {
			thongsochungchixebonbanhImpl.setXBB2115(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2115(XBB2115);
		}

		if (XBB0116 == null) {
			thongsochungchixebonbanhImpl.setXBB0116(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0116(XBB0116);
		}

		if (XBB2116 == null) {
			thongsochungchixebonbanhImpl.setXBB2116(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2116(XBB2116);
		}

		if (XBB0117 == null) {
			thongsochungchixebonbanhImpl.setXBB0117(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0117(XBB0117);
		}

		if (XBB2117 == null) {
			thongsochungchixebonbanhImpl.setXBB2117(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2117(XBB2117);
		}

		if (XBB0118 == null) {
			thongsochungchixebonbanhImpl.setXBB0118(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0118(XBB0118);
		}

		if (XBB0119 == null) {
			thongsochungchixebonbanhImpl.setXBB0119(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0119(XBB0119);
		}

		if (XBB2119 == null) {
			thongsochungchixebonbanhImpl.setXBB2119(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB2119(XBB2119);
		}

		if (XBB0120 == null) {
			thongsochungchixebonbanhImpl.setXBB0120(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0120(XBB0120);
		}

		if (XBB0121 == null) {
			thongsochungchixebonbanhImpl.setXBB0121(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0121(XBB0121);
		}

		if (XBB0122 == null) {
			thongsochungchixebonbanhImpl.setXBB0122(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0122(XBB0122);
		}

		if (XBB0123 == null) {
			thongsochungchixebonbanhImpl.setXBB0123(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0123(XBB0123);
		}

		if (XBB0124 == null) {
			thongsochungchixebonbanhImpl.setXBB0124(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0124(XBB0124);
		}

		if (XBB0125 == null) {
			thongsochungchixebonbanhImpl.setXBB0125(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0125(XBB0125);
		}

		if (XBB0126 == null) {
			thongsochungchixebonbanhImpl.setXBB0126(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB0126(XBB0126);
		}

		if (XBB1084 == null) {
			thongsochungchixebonbanhImpl.setXBB1084(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1084(XBB1084);
		}

		if (XBB1086 == null) {
			thongsochungchixebonbanhImpl.setXBB1086(StringPool.BLANK);
		}
		else {
			thongsochungchixebonbanhImpl.setXBB1086(XBB1086);
		}

		thongsochungchixebonbanhImpl.resetOriginalValues();

		return thongsochungchixebonbanhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		SynchDate = objectInput.readLong();
		XBB0009 = objectInput.readUTF();
		XBB0010 = objectInput.readUTF();
		XBB0011 = objectInput.readUTF();
		XBB0012 = objectInput.readUTF();
		XBB0013 = objectInput.readUTF();
		XBB0014 = objectInput.readUTF();
		XBB1014 = objectInput.readUTF();
		XBB1114 = objectInput.readUTF();
		XBB0015 = objectInput.readUTF();
		XBB1015 = objectInput.readUTF();
		XBB1115 = objectInput.readUTF();
		XBB0016 = objectInput.readUTF();
		XBB1016 = objectInput.readUTF();
		XBB1116 = objectInput.readUTF();
		XBB0017 = objectInput.readUTF();
		XBB1017 = objectInput.readUTF();
		XBB1117 = objectInput.readUTF();
		XBB0018 = objectInput.readUTF();
		XBB0019 = objectInput.readUTF();
		XBB0020 = objectInput.readUTF();
		XBB0021 = objectInput.readUTF();
		XBB0022 = objectInput.readUTF();
		XBB1022 = objectInput.readUTF();
		XBB0023 = objectInput.readUTF();
		XBB0024 = objectInput.readUTF();
		XBB0025 = objectInput.readUTF();
		XBB0026 = objectInput.readUTF();
		XBB1026 = objectInput.readUTF();
		XBB0027 = objectInput.readUTF();
		XBB1027 = objectInput.readUTF();
		XBB0028 = objectInput.readUTF();
		XBB0029 = objectInput.readUTF();
		XBB1029 = objectInput.readUTF();
		XBB0030 = objectInput.readUTF();
		XBB0031 = objectInput.readUTF();
		XBB0032 = objectInput.readUTF();
		XBB0033 = objectInput.readUTF();
		XBB1033 = objectInput.readUTF();
		XBB0034 = objectInput.readUTF();
		XBB1034 = objectInput.readUTF();
		XBB0035 = objectInput.readUTF();
		XBB0036 = objectInput.readUTF();
		XBB1036 = objectInput.readUTF();
		XBB0037 = objectInput.readUTF();
		XBB0038 = objectInput.readUTF();
		XBB0039 = objectInput.readUTF();
		XBB0040 = objectInput.readUTF();
		XBB0041 = objectInput.readUTF();
		XBB0042 = objectInput.readUTF();
		XBB0043 = objectInput.readUTF();
		XBB0044 = objectInput.readUTF();
		XBB1044 = objectInput.readUTF();
		XBB0045 = objectInput.readUTF();
		XBB0046 = objectInput.readUTF();
		XBB0047 = objectInput.readUTF();
		XBB0048 = objectInput.readUTF();
		XBB0049 = objectInput.readUTF();
		XBB0050 = objectInput.readUTF();
		XBB0051 = objectInput.readUTF();
		XBB0052 = objectInput.readUTF();
		XBB0053 = objectInput.readUTF();
		XBB0054 = objectInput.readUTF();
		XBB0055 = objectInput.readUTF();
		XBB0056 = objectInput.readUTF();
		XBB0057 = objectInput.readUTF();
		XBB0058 = objectInput.readUTF();
		XBB0059 = objectInput.readUTF();
		XBB0060 = objectInput.readUTF();
		XBB0061 = objectInput.readUTF();
		XBB0062 = objectInput.readUTF();
		XBB0063 = objectInput.readUTF();
		XBB0076 = objectInput.readUTF();
		XBB0077 = objectInput.readUTF();
		XBB0078 = objectInput.readUTF();
		XBB0079 = objectInput.readUTF();
		XBB0080 = objectInput.readUTF();
		XBB1080 = objectInput.readUTF();
		XBB0081 = objectInput.readUTF();
		XBB1081 = objectInput.readUTF();
		XBB1181 = objectInput.readUTF();
		XBB0082 = objectInput.readUTF();
		XBB1082 = objectInput.readUTF();
		XBB1182 = objectInput.readUTF();
		XBB0083 = objectInput.readUTF();
		XBB1083 = objectInput.readUTF();
		XBB1183 = objectInput.readUTF();
		XBB0084 = objectInput.readUTF();
		XBB0085 = objectInput.readUTF();
		XBB0086 = objectInput.readUTF();
		XBB0087 = objectInput.readUTF();
		XBB0088 = objectInput.readUTF();
		XBB0089 = objectInput.readUTF();
		XBB0090 = objectInput.readUTF();
		XBB0091 = objectInput.readUTF();
		XBB0092 = objectInput.readUTF();
		XBB0093 = objectInput.readUTF();
		XBB0094 = objectInput.readUTF();
		XBB0095 = objectInput.readUTF();
		XBB0096 = objectInput.readUTF();
		XBB0097 = objectInput.readUTF();
		XBB0098 = objectInput.readUTF();
		XBB0099 = objectInput.readUTF();
		XBB0100 = objectInput.readUTF();
		XBB0101 = objectInput.readUTF();
		XBB0102 = objectInput.readUTF();
		XBB0103 = objectInput.readUTF();
		XBB0104 = objectInput.readUTF();
		XBB2104 = objectInput.readUTF();
		XBB0105 = objectInput.readUTF();
		XBB2105 = objectInput.readUTF();
		XBB0106 = objectInput.readUTF();
		XBB2106 = objectInput.readUTF();
		XBB0107 = objectInput.readUTF();
		XBB2107 = objectInput.readUTF();
		XBB0108 = objectInput.readUTF();
		XBB2108 = objectInput.readUTF();
		XBB0109 = objectInput.readUTF();
		XBB2109 = objectInput.readUTF();
		XBB0110 = objectInput.readUTF();
		XBB2110 = objectInput.readUTF();
		XBB0111 = objectInput.readUTF();
		XBB2111 = objectInput.readUTF();
		XBB0112 = objectInput.readUTF();
		XBB2112 = objectInput.readUTF();
		XBB0113 = objectInput.readUTF();
		XBB2113 = objectInput.readUTF();
		XBB0114 = objectInput.readUTF();
		XBB2114 = objectInput.readUTF();
		XBB0115 = objectInput.readUTF();
		XBB2115 = objectInput.readUTF();
		XBB0116 = objectInput.readUTF();
		XBB2116 = objectInput.readUTF();
		XBB0117 = objectInput.readUTF();
		XBB2117 = objectInput.readUTF();
		XBB0118 = objectInput.readUTF();
		XBB0119 = objectInput.readUTF();
		XBB2119 = objectInput.readUTF();
		XBB0120 = objectInput.readUTF();
		XBB0121 = objectInput.readUTF();
		XBB0122 = objectInput.readUTF();
		XBB0123 = objectInput.readUTF();
		XBB0124 = objectInput.readUTF();
		XBB0125 = objectInput.readUTF();
		XBB0126 = objectInput.readUTF();
		XBB1084 = objectInput.readUTF();
		XBB1086 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(SynchDate);

		if (XBB0009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0009);
		}

		if (XBB0010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0010);
		}

		if (XBB0011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0011);
		}

		if (XBB0012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0012);
		}

		if (XBB0013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0013);
		}

		if (XBB0014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0014);
		}

		if (XBB1014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1014);
		}

		if (XBB1114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1114);
		}

		if (XBB0015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0015);
		}

		if (XBB1015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1015);
		}

		if (XBB1115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1115);
		}

		if (XBB0016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0016);
		}

		if (XBB1016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1016);
		}

		if (XBB1116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1116);
		}

		if (XBB0017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0017);
		}

		if (XBB1017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1017);
		}

		if (XBB1117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1117);
		}

		if (XBB0018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0018);
		}

		if (XBB0019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0019);
		}

		if (XBB0020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0020);
		}

		if (XBB0021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0021);
		}

		if (XBB0022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0022);
		}

		if (XBB1022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1022);
		}

		if (XBB0023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0023);
		}

		if (XBB0024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0024);
		}

		if (XBB0025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0025);
		}

		if (XBB0026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0026);
		}

		if (XBB1026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1026);
		}

		if (XBB0027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0027);
		}

		if (XBB1027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1027);
		}

		if (XBB0028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0028);
		}

		if (XBB0029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0029);
		}

		if (XBB1029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1029);
		}

		if (XBB0030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0030);
		}

		if (XBB0031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0031);
		}

		if (XBB0032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0032);
		}

		if (XBB0033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0033);
		}

		if (XBB1033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1033);
		}

		if (XBB0034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0034);
		}

		if (XBB1034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1034);
		}

		if (XBB0035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0035);
		}

		if (XBB0036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0036);
		}

		if (XBB1036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1036);
		}

		if (XBB0037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0037);
		}

		if (XBB0038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0038);
		}

		if (XBB0039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0039);
		}

		if (XBB0040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0040);
		}

		if (XBB0041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0041);
		}

		if (XBB0042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0042);
		}

		if (XBB0043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0043);
		}

		if (XBB0044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0044);
		}

		if (XBB1044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1044);
		}

		if (XBB0045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0045);
		}

		if (XBB0046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0046);
		}

		if (XBB0047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0047);
		}

		if (XBB0048 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0048);
		}

		if (XBB0049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0049);
		}

		if (XBB0050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0050);
		}

		if (XBB0051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0051);
		}

		if (XBB0052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0052);
		}

		if (XBB0053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0053);
		}

		if (XBB0054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0054);
		}

		if (XBB0055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0055);
		}

		if (XBB0056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0056);
		}

		if (XBB0057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0057);
		}

		if (XBB0058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0058);
		}

		if (XBB0059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0059);
		}

		if (XBB0060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0060);
		}

		if (XBB0061 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0061);
		}

		if (XBB0062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0062);
		}

		if (XBB0063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0063);
		}

		if (XBB0076 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0076);
		}

		if (XBB0077 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0077);
		}

		if (XBB0078 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0078);
		}

		if (XBB0079 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0079);
		}

		if (XBB0080 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0080);
		}

		if (XBB1080 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1080);
		}

		if (XBB0081 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0081);
		}

		if (XBB1081 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1081);
		}

		if (XBB1181 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1181);
		}

		if (XBB0082 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0082);
		}

		if (XBB1082 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1082);
		}

		if (XBB1182 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1182);
		}

		if (XBB0083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0083);
		}

		if (XBB1083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1083);
		}

		if (XBB1183 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1183);
		}

		if (XBB0084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0084);
		}

		if (XBB0085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0085);
		}

		if (XBB0086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0086);
		}

		if (XBB0087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0087);
		}

		if (XBB0088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0088);
		}

		if (XBB0089 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0089);
		}

		if (XBB0090 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0090);
		}

		if (XBB0091 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0091);
		}

		if (XBB0092 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0092);
		}

		if (XBB0093 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0093);
		}

		if (XBB0094 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0094);
		}

		if (XBB0095 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0095);
		}

		if (XBB0096 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0096);
		}

		if (XBB0097 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0097);
		}

		if (XBB0098 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0098);
		}

		if (XBB0099 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0099);
		}

		if (XBB0100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0100);
		}

		if (XBB0101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0101);
		}

		if (XBB0102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0102);
		}

		if (XBB0103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0103);
		}

		if (XBB0104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0104);
		}

		if (XBB2104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2104);
		}

		if (XBB0105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0105);
		}

		if (XBB2105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2105);
		}

		if (XBB0106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0106);
		}

		if (XBB2106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2106);
		}

		if (XBB0107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0107);
		}

		if (XBB2107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2107);
		}

		if (XBB0108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0108);
		}

		if (XBB2108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2108);
		}

		if (XBB0109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0109);
		}

		if (XBB2109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2109);
		}

		if (XBB0110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0110);
		}

		if (XBB2110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2110);
		}

		if (XBB0111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0111);
		}

		if (XBB2111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2111);
		}

		if (XBB0112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0112);
		}

		if (XBB2112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2112);
		}

		if (XBB0113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0113);
		}

		if (XBB2113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2113);
		}

		if (XBB0114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0114);
		}

		if (XBB2114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2114);
		}

		if (XBB0115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0115);
		}

		if (XBB2115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2115);
		}

		if (XBB0116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0116);
		}

		if (XBB2116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2116);
		}

		if (XBB0117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0117);
		}

		if (XBB2117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2117);
		}

		if (XBB0118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0118);
		}

		if (XBB0119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0119);
		}

		if (XBB2119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB2119);
		}

		if (XBB0120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0120);
		}

		if (XBB0121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0121);
		}

		if (XBB0122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0122);
		}

		if (XBB0123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0123);
		}

		if (XBB0124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0124);
		}

		if (XBB0125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0125);
		}

		if (XBB0126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB0126);
		}

		if (XBB1084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1084);
		}

		if (XBB1086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XBB1086);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long certificateRecordId;
	public long vehicleGroupId;
	public long SynchDate;
	public String XBB0009;
	public String XBB0010;
	public String XBB0011;
	public String XBB0012;
	public String XBB0013;
	public String XBB0014;
	public String XBB1014;
	public String XBB1114;
	public String XBB0015;
	public String XBB1015;
	public String XBB1115;
	public String XBB0016;
	public String XBB1016;
	public String XBB1116;
	public String XBB0017;
	public String XBB1017;
	public String XBB1117;
	public String XBB0018;
	public String XBB0019;
	public String XBB0020;
	public String XBB0021;
	public String XBB0022;
	public String XBB1022;
	public String XBB0023;
	public String XBB0024;
	public String XBB0025;
	public String XBB0026;
	public String XBB1026;
	public String XBB0027;
	public String XBB1027;
	public String XBB0028;
	public String XBB0029;
	public String XBB1029;
	public String XBB0030;
	public String XBB0031;
	public String XBB0032;
	public String XBB0033;
	public String XBB1033;
	public String XBB0034;
	public String XBB1034;
	public String XBB0035;
	public String XBB0036;
	public String XBB1036;
	public String XBB0037;
	public String XBB0038;
	public String XBB0039;
	public String XBB0040;
	public String XBB0041;
	public String XBB0042;
	public String XBB0043;
	public String XBB0044;
	public String XBB1044;
	public String XBB0045;
	public String XBB0046;
	public String XBB0047;
	public String XBB0048;
	public String XBB0049;
	public String XBB0050;
	public String XBB0051;
	public String XBB0052;
	public String XBB0053;
	public String XBB0054;
	public String XBB0055;
	public String XBB0056;
	public String XBB0057;
	public String XBB0058;
	public String XBB0059;
	public String XBB0060;
	public String XBB0061;
	public String XBB0062;
	public String XBB0063;
	public String XBB0076;
	public String XBB0077;
	public String XBB0078;
	public String XBB0079;
	public String XBB0080;
	public String XBB1080;
	public String XBB0081;
	public String XBB1081;
	public String XBB1181;
	public String XBB0082;
	public String XBB1082;
	public String XBB1182;
	public String XBB0083;
	public String XBB1083;
	public String XBB1183;
	public String XBB0084;
	public String XBB0085;
	public String XBB0086;
	public String XBB0087;
	public String XBB0088;
	public String XBB0089;
	public String XBB0090;
	public String XBB0091;
	public String XBB0092;
	public String XBB0093;
	public String XBB0094;
	public String XBB0095;
	public String XBB0096;
	public String XBB0097;
	public String XBB0098;
	public String XBB0099;
	public String XBB0100;
	public String XBB0101;
	public String XBB0102;
	public String XBB0103;
	public String XBB0104;
	public String XBB2104;
	public String XBB0105;
	public String XBB2105;
	public String XBB0106;
	public String XBB2106;
	public String XBB0107;
	public String XBB2107;
	public String XBB0108;
	public String XBB2108;
	public String XBB0109;
	public String XBB2109;
	public String XBB0110;
	public String XBB2110;
	public String XBB0111;
	public String XBB2111;
	public String XBB0112;
	public String XBB2112;
	public String XBB0113;
	public String XBB2113;
	public String XBB0114;
	public String XBB2114;
	public String XBB0115;
	public String XBB2115;
	public String XBB0116;
	public String XBB2116;
	public String XBB0117;
	public String XBB2117;
	public String XBB0118;
	public String XBB0119;
	public String XBB2119;
	public String XBB0120;
	public String XBB0121;
	public String XBB0122;
	public String XBB0123;
	public String XBB0124;
	public String XBB0125;
	public String XBB0126;
	public String XBB1084;
	public String XBB1086;
}