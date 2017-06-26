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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGSOCHUNGCHIXECOGIOI in entity cache.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOI
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOICacheModel implements CacheModel<THONGSOCHUNGCHIXECOGIOI>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(393);

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
		sb.append(", XCG0009=");
		sb.append(XCG0009);
		sb.append(", XCG0010=");
		sb.append(XCG0010);
		sb.append(", XCG0011=");
		sb.append(XCG0011);
		sb.append(", XCG0012=");
		sb.append(XCG0012);
		sb.append(", XCG0013=");
		sb.append(XCG0013);
		sb.append(", XCG0014=");
		sb.append(XCG0014);
		sb.append(", XCG0015=");
		sb.append(XCG0015);
		sb.append(", XCG0016=");
		sb.append(XCG0016);
		sb.append(", XCG0017=");
		sb.append(XCG0017);
		sb.append(", XCG0018=");
		sb.append(XCG0018);
		sb.append(", XCG0019=");
		sb.append(XCG0019);
		sb.append(", XCG0020=");
		sb.append(XCG0020);
		sb.append(", XCG0021=");
		sb.append(XCG0021);
		sb.append(", XCG1021=");
		sb.append(XCG1021);
		sb.append(", XCG1121=");
		sb.append(XCG1121);
		sb.append(", XCG0022=");
		sb.append(XCG0022);
		sb.append(", XCG1022=");
		sb.append(XCG1022);
		sb.append(", XCG1122=");
		sb.append(XCG1122);
		sb.append(", XCG0023=");
		sb.append(XCG0023);
		sb.append(", XCG1023=");
		sb.append(XCG1023);
		sb.append(", XCG1123=");
		sb.append(XCG1123);
		sb.append(", XCG0024=");
		sb.append(XCG0024);
		sb.append(", XCG1024=");
		sb.append(XCG1024);
		sb.append(", XCG1124=");
		sb.append(XCG1124);
		sb.append(", XCG0025=");
		sb.append(XCG0025);
		sb.append(", XCG1025=");
		sb.append(XCG1025);
		sb.append(", XCG1125=");
		sb.append(XCG1125);
		sb.append(", XCG0026=");
		sb.append(XCG0026);
		sb.append(", XCG1026=");
		sb.append(XCG1026);
		sb.append(", XCG1126=");
		sb.append(XCG1126);
		sb.append(", XCG0027=");
		sb.append(XCG0027);
		sb.append(", XCG1027=");
		sb.append(XCG1027);
		sb.append(", XCG1127=");
		sb.append(XCG1127);
		sb.append(", XCG0028=");
		sb.append(XCG0028);
		sb.append(", XCG1028=");
		sb.append(XCG1028);
		sb.append(", XCG1128=");
		sb.append(XCG1128);
		sb.append(", XCG0029=");
		sb.append(XCG0029);
		sb.append(", XCG1029=");
		sb.append(XCG1029);
		sb.append(", XCG1129=");
		sb.append(XCG1129);
		sb.append(", XCG0030=");
		sb.append(XCG0030);
		sb.append(", XCG1030=");
		sb.append(XCG1030);
		sb.append(", XCG1130=");
		sb.append(XCG1130);
		sb.append(", XCG0031=");
		sb.append(XCG0031);
		sb.append(", XCG1031=");
		sb.append(XCG1031);
		sb.append(", XCG1131=");
		sb.append(XCG1131);
		sb.append(", XCG0032=");
		sb.append(XCG0032);
		sb.append(", XCG1032=");
		sb.append(XCG1032);
		sb.append(", XCG1132=");
		sb.append(XCG1132);
		sb.append(", XCG0033=");
		sb.append(XCG0033);
		sb.append(", XCG1033=");
		sb.append(XCG1033);
		sb.append(", XCG1133=");
		sb.append(XCG1133);
		sb.append(", XCG0034=");
		sb.append(XCG0034);
		sb.append(", XCG1034=");
		sb.append(XCG1034);
		sb.append(", XCG1134=");
		sb.append(XCG1134);
		sb.append(", XCG0035=");
		sb.append(XCG0035);
		sb.append(", XCG1035=");
		sb.append(XCG1035);
		sb.append(", XCG1135=");
		sb.append(XCG1135);
		sb.append(", XCG0036=");
		sb.append(XCG0036);
		sb.append(", XCG1036=");
		sb.append(XCG1036);
		sb.append(", XCG1136=");
		sb.append(XCG1136);
		sb.append(", XCG0037=");
		sb.append(XCG0037);
		sb.append(", XCG1037=");
		sb.append(XCG1037);
		sb.append(", XCG1137=");
		sb.append(XCG1137);
		sb.append(", XCG0038=");
		sb.append(XCG0038);
		sb.append(", XCG1038=");
		sb.append(XCG1038);
		sb.append(", XCG1138=");
		sb.append(XCG1138);
		sb.append(", XCG0039=");
		sb.append(XCG0039);
		sb.append(", XCG1039=");
		sb.append(XCG1039);
		sb.append(", XCG1139=");
		sb.append(XCG1139);
		sb.append(", XCG0040=");
		sb.append(XCG0040);
		sb.append(", XCG1040=");
		sb.append(XCG1040);
		sb.append(", XCG1140=");
		sb.append(XCG1140);
		sb.append(", XCG0041=");
		sb.append(XCG0041);
		sb.append(", XCG1041=");
		sb.append(XCG1041);
		sb.append(", XCG1141=");
		sb.append(XCG1141);
		sb.append(", XCG0042=");
		sb.append(XCG0042);
		sb.append(", XCG1042=");
		sb.append(XCG1042);
		sb.append(", XCG1142=");
		sb.append(XCG1142);
		sb.append(", XCG0043=");
		sb.append(XCG0043);
		sb.append(", XCG1043=");
		sb.append(XCG1043);
		sb.append(", XCG1143=");
		sb.append(XCG1143);
		sb.append(", XCG0044=");
		sb.append(XCG0044);
		sb.append(", XCG1044=");
		sb.append(XCG1044);
		sb.append(", XCG1144=");
		sb.append(XCG1144);
		sb.append(", XCG0045=");
		sb.append(XCG0045);
		sb.append(", XCG0046=");
		sb.append(XCG0046);
		sb.append(", XCG1047=");
		sb.append(XCG1047);
		sb.append(", XCG0047=");
		sb.append(XCG0047);
		sb.append(", XCG0048=");
		sb.append(XCG0048);
		sb.append(", XCG0049=");
		sb.append(XCG0049);
		sb.append(", XCG0050=");
		sb.append(XCG0050);
		sb.append(", XCG0051=");
		sb.append(XCG0051);
		sb.append(", XCG0052=");
		sb.append(XCG0052);
		sb.append(", XCG0053=");
		sb.append(XCG0053);
		sb.append(", XCG0054=");
		sb.append(XCG0054);
		sb.append(", XCG1054=");
		sb.append(XCG1054);
		sb.append(", XCG1154=");
		sb.append(XCG1154);
		sb.append(", XCG1254=");
		sb.append(XCG1254);
		sb.append(", XCG1354=");
		sb.append(XCG1354);
		sb.append(", XCG1454=");
		sb.append(XCG1454);
		sb.append(", XCG1554=");
		sb.append(XCG1554);
		sb.append(", XCG1654=");
		sb.append(XCG1654);
		sb.append(", XCG1754=");
		sb.append(XCG1754);
		sb.append(", XCG0055=");
		sb.append(XCG0055);
		sb.append(", XCG0056=");
		sb.append(XCG0056);
		sb.append(", XCG0057=");
		sb.append(XCG0057);
		sb.append(", XCG0058=");
		sb.append(XCG0058);
		sb.append(", XCG0059=");
		sb.append(XCG0059);
		sb.append(", XCG1059=");
		sb.append(XCG1059);
		sb.append(", XCG0060=");
		sb.append(XCG0060);
		sb.append(", XCG0061=");
		sb.append(XCG0061);
		sb.append(", XCG0062=");
		sb.append(XCG0062);
		sb.append(", XCG0063=");
		sb.append(XCG0063);
		sb.append(", XCG0064=");
		sb.append(XCG0064);
		sb.append(", XCG0065=");
		sb.append(XCG0065);
		sb.append(", XCG0066=");
		sb.append(XCG0066);
		sb.append(", XCG1066=");
		sb.append(XCG1066);
		sb.append(", XCG0067=");
		sb.append(XCG0067);
		sb.append(", XCG0068=");
		sb.append(XCG0068);
		sb.append(", XCG0069=");
		sb.append(XCG0069);
		sb.append(", XCG0070=");
		sb.append(XCG0070);
		sb.append(", XCG0071=");
		sb.append(XCG0071);
		sb.append(", XCG0072=");
		sb.append(XCG0072);
		sb.append(", XCG1072=");
		sb.append(XCG1072);
		sb.append(", XCG0073=");
		sb.append(XCG0073);
		sb.append(", XCG0074=");
		sb.append(XCG0074);
		sb.append(", XCG0075=");
		sb.append(XCG0075);
		sb.append(", XCG0076=");
		sb.append(XCG0076);
		sb.append(", XCG0077=");
		sb.append(XCG0077);
		sb.append(", XCG1077=");
		sb.append(XCG1077);
		sb.append(", XCG0078=");
		sb.append(XCG0078);
		sb.append(", XCG1078=");
		sb.append(XCG1078);
		sb.append(", XCG0079=");
		sb.append(XCG0079);
		sb.append(", XCG0080=");
		sb.append(XCG0080);
		sb.append(", XCG1080=");
		sb.append(XCG1080);
		sb.append(", XCG0081=");
		sb.append(XCG0081);
		sb.append(", XCG0082=");
		sb.append(XCG0082);
		sb.append(", XCG0083=");
		sb.append(XCG0083);
		sb.append(", XCG0084=");
		sb.append(XCG0084);
		sb.append(", XCG0085=");
		sb.append(XCG0085);
		sb.append(", XCG1085=");
		sb.append(XCG1085);
		sb.append(", XCG0086=");
		sb.append(XCG0086);
		sb.append(", XCG1086=");
		sb.append(XCG1086);
		sb.append(", XCG0087=");
		sb.append(XCG0087);
		sb.append(", XCG0088=");
		sb.append(XCG0088);
		sb.append(", XCG1088=");
		sb.append(XCG1088);
		sb.append(", XCG0089=");
		sb.append(XCG0089);
		sb.append(", XCG0090=");
		sb.append(XCG0090);
		sb.append(", XCG0091=");
		sb.append(XCG0091);
		sb.append(", XCG0092=");
		sb.append(XCG0092);
		sb.append(", XCG0093=");
		sb.append(XCG0093);
		sb.append(", XCG0094=");
		sb.append(XCG0094);
		sb.append(", XCG0095=");
		sb.append(XCG0095);
		sb.append(", XCG0096=");
		sb.append(XCG0096);
		sb.append(", XCG0097=");
		sb.append(XCG0097);
		sb.append(", XCG1097=");
		sb.append(XCG1097);
		sb.append(", XCG0098=");
		sb.append(XCG0098);
		sb.append(", XCG0099=");
		sb.append(XCG0099);
		sb.append(", XCG0100=");
		sb.append(XCG0100);
		sb.append(", XCG0101=");
		sb.append(XCG0101);
		sb.append(", XCG0102=");
		sb.append(XCG0102);
		sb.append(", XCG0103=");
		sb.append(XCG0103);
		sb.append(", XCG0104=");
		sb.append(XCG0104);
		sb.append(", XCG0105=");
		sb.append(XCG0105);
		sb.append(", XCG0106=");
		sb.append(XCG0106);
		sb.append(", XCG0107=");
		sb.append(XCG0107);
		sb.append(", XCG0108=");
		sb.append(XCG0108);
		sb.append(", XCG0109=");
		sb.append(XCG0109);
		sb.append(", XCG0110=");
		sb.append(XCG0110);
		sb.append(", XCG0111=");
		sb.append(XCG0111);
		sb.append(", XCG0112=");
		sb.append(XCG0112);
		sb.append(", XCG0113=");
		sb.append(XCG0113);
		sb.append(", XCG0114=");
		sb.append(XCG0114);
		sb.append(", XCG0115=");
		sb.append(XCG0115);
		sb.append(", XCG0116=");
		sb.append(XCG0116);
		sb.append(", XCG0117=");
		sb.append(XCG0117);
		sb.append(", XCG0118=");
		sb.append(XCG0118);
		sb.append(", XCG0119=");
		sb.append(XCG0119);
		sb.append(", XCG0120=");
		sb.append(XCG0120);
		sb.append(", XCG0121=");
		sb.append(XCG0121);
		sb.append(", XCG0122=");
		sb.append(XCG0122);
		sb.append(", XCG0123=");
		sb.append(XCG0123);
		sb.append(", XCG0124=");
		sb.append(XCG0124);
		sb.append(", XCG0125=");
		sb.append(XCG0125);
		sb.append(", XCG0126=");
		sb.append(XCG0126);
		sb.append(", XCG0127=");
		sb.append(XCG0127);
		sb.append(", XCG0128=");
		sb.append(XCG0128);
		sb.append(", XCG0238=");
		sb.append(XCG0238);
		sb.append(", XCG0239=");
		sb.append(XCG0239);
		sb.append(", XCG0240=");
		sb.append(XCG0240);
		sb.append(", XCG0241=");
		sb.append(XCG0241);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOI toEntityModel() {
		THONGSOCHUNGCHIXECOGIOIImpl thongsochungchixecogioiImpl = new THONGSOCHUNGCHIXECOGIOIImpl();

		thongsochungchixecogioiImpl.setId(id);
		thongsochungchixecogioiImpl.setHoSoThuTucId(hoSoThuTucId);
		thongsochungchixecogioiImpl.setCertificateRecordId(certificateRecordId);
		thongsochungchixecogioiImpl.setVehicleGroupId(vehicleGroupId);

		if (SynchDate == Long.MIN_VALUE) {
			thongsochungchixecogioiImpl.setSynchDate(null);
		}
		else {
			thongsochungchixecogioiImpl.setSynchDate(new Date(SynchDate));
		}

		if (XCG0009 == null) {
			thongsochungchixecogioiImpl.setXCG0009(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0009(XCG0009);
		}

		if (XCG0010 == null) {
			thongsochungchixecogioiImpl.setXCG0010(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0010(XCG0010);
		}

		if (XCG0011 == null) {
			thongsochungchixecogioiImpl.setXCG0011(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0011(XCG0011);
		}

		if (XCG0012 == null) {
			thongsochungchixecogioiImpl.setXCG0012(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0012(XCG0012);
		}

		if (XCG0013 == null) {
			thongsochungchixecogioiImpl.setXCG0013(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0013(XCG0013);
		}

		if (XCG0014 == null) {
			thongsochungchixecogioiImpl.setXCG0014(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0014(XCG0014);
		}

		if (XCG0015 == null) {
			thongsochungchixecogioiImpl.setXCG0015(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0015(XCG0015);
		}

		if (XCG0016 == null) {
			thongsochungchixecogioiImpl.setXCG0016(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0016(XCG0016);
		}

		if (XCG0017 == null) {
			thongsochungchixecogioiImpl.setXCG0017(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0017(XCG0017);
		}

		if (XCG0018 == null) {
			thongsochungchixecogioiImpl.setXCG0018(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0018(XCG0018);
		}

		if (XCG0019 == null) {
			thongsochungchixecogioiImpl.setXCG0019(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0019(XCG0019);
		}

		if (XCG0020 == null) {
			thongsochungchixecogioiImpl.setXCG0020(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0020(XCG0020);
		}

		if (XCG0021 == null) {
			thongsochungchixecogioiImpl.setXCG0021(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0021(XCG0021);
		}

		if (XCG1021 == null) {
			thongsochungchixecogioiImpl.setXCG1021(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1021(XCG1021);
		}

		if (XCG1121 == null) {
			thongsochungchixecogioiImpl.setXCG1121(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1121(XCG1121);
		}

		if (XCG0022 == null) {
			thongsochungchixecogioiImpl.setXCG0022(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0022(XCG0022);
		}

		if (XCG1022 == null) {
			thongsochungchixecogioiImpl.setXCG1022(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1022(XCG1022);
		}

		if (XCG1122 == null) {
			thongsochungchixecogioiImpl.setXCG1122(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1122(XCG1122);
		}

		if (XCG0023 == null) {
			thongsochungchixecogioiImpl.setXCG0023(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0023(XCG0023);
		}

		if (XCG1023 == null) {
			thongsochungchixecogioiImpl.setXCG1023(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1023(XCG1023);
		}

		if (XCG1123 == null) {
			thongsochungchixecogioiImpl.setXCG1123(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1123(XCG1123);
		}

		if (XCG0024 == null) {
			thongsochungchixecogioiImpl.setXCG0024(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0024(XCG0024);
		}

		if (XCG1024 == null) {
			thongsochungchixecogioiImpl.setXCG1024(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1024(XCG1024);
		}

		if (XCG1124 == null) {
			thongsochungchixecogioiImpl.setXCG1124(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1124(XCG1124);
		}

		if (XCG0025 == null) {
			thongsochungchixecogioiImpl.setXCG0025(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0025(XCG0025);
		}

		if (XCG1025 == null) {
			thongsochungchixecogioiImpl.setXCG1025(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1025(XCG1025);
		}

		if (XCG1125 == null) {
			thongsochungchixecogioiImpl.setXCG1125(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1125(XCG1125);
		}

		if (XCG0026 == null) {
			thongsochungchixecogioiImpl.setXCG0026(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0026(XCG0026);
		}

		if (XCG1026 == null) {
			thongsochungchixecogioiImpl.setXCG1026(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1026(XCG1026);
		}

		if (XCG1126 == null) {
			thongsochungchixecogioiImpl.setXCG1126(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1126(XCG1126);
		}

		if (XCG0027 == null) {
			thongsochungchixecogioiImpl.setXCG0027(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0027(XCG0027);
		}

		if (XCG1027 == null) {
			thongsochungchixecogioiImpl.setXCG1027(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1027(XCG1027);
		}

		if (XCG1127 == null) {
			thongsochungchixecogioiImpl.setXCG1127(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1127(XCG1127);
		}

		if (XCG0028 == null) {
			thongsochungchixecogioiImpl.setXCG0028(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0028(XCG0028);
		}

		if (XCG1028 == null) {
			thongsochungchixecogioiImpl.setXCG1028(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1028(XCG1028);
		}

		if (XCG1128 == null) {
			thongsochungchixecogioiImpl.setXCG1128(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1128(XCG1128);
		}

		if (XCG0029 == null) {
			thongsochungchixecogioiImpl.setXCG0029(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0029(XCG0029);
		}

		if (XCG1029 == null) {
			thongsochungchixecogioiImpl.setXCG1029(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1029(XCG1029);
		}

		if (XCG1129 == null) {
			thongsochungchixecogioiImpl.setXCG1129(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1129(XCG1129);
		}

		if (XCG0030 == null) {
			thongsochungchixecogioiImpl.setXCG0030(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0030(XCG0030);
		}

		if (XCG1030 == null) {
			thongsochungchixecogioiImpl.setXCG1030(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1030(XCG1030);
		}

		if (XCG1130 == null) {
			thongsochungchixecogioiImpl.setXCG1130(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1130(XCG1130);
		}

		if (XCG0031 == null) {
			thongsochungchixecogioiImpl.setXCG0031(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0031(XCG0031);
		}

		if (XCG1031 == null) {
			thongsochungchixecogioiImpl.setXCG1031(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1031(XCG1031);
		}

		if (XCG1131 == null) {
			thongsochungchixecogioiImpl.setXCG1131(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1131(XCG1131);
		}

		if (XCG0032 == null) {
			thongsochungchixecogioiImpl.setXCG0032(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0032(XCG0032);
		}

		if (XCG1032 == null) {
			thongsochungchixecogioiImpl.setXCG1032(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1032(XCG1032);
		}

		if (XCG1132 == null) {
			thongsochungchixecogioiImpl.setXCG1132(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1132(XCG1132);
		}

		if (XCG0033 == null) {
			thongsochungchixecogioiImpl.setXCG0033(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0033(XCG0033);
		}

		if (XCG1033 == null) {
			thongsochungchixecogioiImpl.setXCG1033(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1033(XCG1033);
		}

		if (XCG1133 == null) {
			thongsochungchixecogioiImpl.setXCG1133(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1133(XCG1133);
		}

		if (XCG0034 == null) {
			thongsochungchixecogioiImpl.setXCG0034(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0034(XCG0034);
		}

		if (XCG1034 == null) {
			thongsochungchixecogioiImpl.setXCG1034(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1034(XCG1034);
		}

		if (XCG1134 == null) {
			thongsochungchixecogioiImpl.setXCG1134(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1134(XCG1134);
		}

		if (XCG0035 == null) {
			thongsochungchixecogioiImpl.setXCG0035(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0035(XCG0035);
		}

		if (XCG1035 == null) {
			thongsochungchixecogioiImpl.setXCG1035(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1035(XCG1035);
		}

		if (XCG1135 == null) {
			thongsochungchixecogioiImpl.setXCG1135(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1135(XCG1135);
		}

		if (XCG0036 == null) {
			thongsochungchixecogioiImpl.setXCG0036(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0036(XCG0036);
		}

		if (XCG1036 == null) {
			thongsochungchixecogioiImpl.setXCG1036(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1036(XCG1036);
		}

		if (XCG1136 == null) {
			thongsochungchixecogioiImpl.setXCG1136(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1136(XCG1136);
		}

		if (XCG0037 == null) {
			thongsochungchixecogioiImpl.setXCG0037(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0037(XCG0037);
		}

		if (XCG1037 == null) {
			thongsochungchixecogioiImpl.setXCG1037(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1037(XCG1037);
		}

		if (XCG1137 == null) {
			thongsochungchixecogioiImpl.setXCG1137(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1137(XCG1137);
		}

		if (XCG0038 == null) {
			thongsochungchixecogioiImpl.setXCG0038(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0038(XCG0038);
		}

		if (XCG1038 == null) {
			thongsochungchixecogioiImpl.setXCG1038(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1038(XCG1038);
		}

		if (XCG1138 == null) {
			thongsochungchixecogioiImpl.setXCG1138(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1138(XCG1138);
		}

		if (XCG0039 == null) {
			thongsochungchixecogioiImpl.setXCG0039(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0039(XCG0039);
		}

		if (XCG1039 == null) {
			thongsochungchixecogioiImpl.setXCG1039(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1039(XCG1039);
		}

		if (XCG1139 == null) {
			thongsochungchixecogioiImpl.setXCG1139(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1139(XCG1139);
		}

		if (XCG0040 == null) {
			thongsochungchixecogioiImpl.setXCG0040(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0040(XCG0040);
		}

		if (XCG1040 == null) {
			thongsochungchixecogioiImpl.setXCG1040(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1040(XCG1040);
		}

		if (XCG1140 == null) {
			thongsochungchixecogioiImpl.setXCG1140(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1140(XCG1140);
		}

		if (XCG0041 == null) {
			thongsochungchixecogioiImpl.setXCG0041(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0041(XCG0041);
		}

		if (XCG1041 == null) {
			thongsochungchixecogioiImpl.setXCG1041(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1041(XCG1041);
		}

		if (XCG1141 == null) {
			thongsochungchixecogioiImpl.setXCG1141(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1141(XCG1141);
		}

		if (XCG0042 == null) {
			thongsochungchixecogioiImpl.setXCG0042(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0042(XCG0042);
		}

		if (XCG1042 == null) {
			thongsochungchixecogioiImpl.setXCG1042(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1042(XCG1042);
		}

		if (XCG1142 == null) {
			thongsochungchixecogioiImpl.setXCG1142(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1142(XCG1142);
		}

		if (XCG0043 == null) {
			thongsochungchixecogioiImpl.setXCG0043(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0043(XCG0043);
		}

		if (XCG1043 == null) {
			thongsochungchixecogioiImpl.setXCG1043(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1043(XCG1043);
		}

		if (XCG1143 == null) {
			thongsochungchixecogioiImpl.setXCG1143(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1143(XCG1143);
		}

		if (XCG0044 == null) {
			thongsochungchixecogioiImpl.setXCG0044(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0044(XCG0044);
		}

		if (XCG1044 == null) {
			thongsochungchixecogioiImpl.setXCG1044(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1044(XCG1044);
		}

		if (XCG1144 == null) {
			thongsochungchixecogioiImpl.setXCG1144(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1144(XCG1144);
		}

		if (XCG0045 == null) {
			thongsochungchixecogioiImpl.setXCG0045(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0045(XCG0045);
		}

		if (XCG0046 == null) {
			thongsochungchixecogioiImpl.setXCG0046(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0046(XCG0046);
		}

		if (XCG1047 == null) {
			thongsochungchixecogioiImpl.setXCG1047(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1047(XCG1047);
		}

		if (XCG0047 == null) {
			thongsochungchixecogioiImpl.setXCG0047(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0047(XCG0047);
		}

		if (XCG0048 == null) {
			thongsochungchixecogioiImpl.setXCG0048(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0048(XCG0048);
		}

		if (XCG0049 == null) {
			thongsochungchixecogioiImpl.setXCG0049(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0049(XCG0049);
		}

		if (XCG0050 == null) {
			thongsochungchixecogioiImpl.setXCG0050(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0050(XCG0050);
		}

		if (XCG0051 == null) {
			thongsochungchixecogioiImpl.setXCG0051(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0051(XCG0051);
		}

		if (XCG0052 == null) {
			thongsochungchixecogioiImpl.setXCG0052(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0052(XCG0052);
		}

		if (XCG0053 == null) {
			thongsochungchixecogioiImpl.setXCG0053(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0053(XCG0053);
		}

		if (XCG0054 == null) {
			thongsochungchixecogioiImpl.setXCG0054(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0054(XCG0054);
		}

		if (XCG1054 == null) {
			thongsochungchixecogioiImpl.setXCG1054(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1054(XCG1054);
		}

		if (XCG1154 == null) {
			thongsochungchixecogioiImpl.setXCG1154(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1154(XCG1154);
		}

		if (XCG1254 == null) {
			thongsochungchixecogioiImpl.setXCG1254(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1254(XCG1254);
		}

		if (XCG1354 == null) {
			thongsochungchixecogioiImpl.setXCG1354(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1354(XCG1354);
		}

		if (XCG1454 == null) {
			thongsochungchixecogioiImpl.setXCG1454(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1454(XCG1454);
		}

		if (XCG1554 == null) {
			thongsochungchixecogioiImpl.setXCG1554(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1554(XCG1554);
		}

		if (XCG1654 == null) {
			thongsochungchixecogioiImpl.setXCG1654(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1654(XCG1654);
		}

		if (XCG1754 == null) {
			thongsochungchixecogioiImpl.setXCG1754(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1754(XCG1754);
		}

		if (XCG0055 == null) {
			thongsochungchixecogioiImpl.setXCG0055(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0055(XCG0055);
		}

		if (XCG0056 == null) {
			thongsochungchixecogioiImpl.setXCG0056(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0056(XCG0056);
		}

		if (XCG0057 == null) {
			thongsochungchixecogioiImpl.setXCG0057(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0057(XCG0057);
		}

		if (XCG0058 == null) {
			thongsochungchixecogioiImpl.setXCG0058(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0058(XCG0058);
		}

		if (XCG0059 == null) {
			thongsochungchixecogioiImpl.setXCG0059(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0059(XCG0059);
		}

		if (XCG1059 == null) {
			thongsochungchixecogioiImpl.setXCG1059(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1059(XCG1059);
		}

		if (XCG0060 == null) {
			thongsochungchixecogioiImpl.setXCG0060(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0060(XCG0060);
		}

		if (XCG0061 == null) {
			thongsochungchixecogioiImpl.setXCG0061(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0061(XCG0061);
		}

		if (XCG0062 == null) {
			thongsochungchixecogioiImpl.setXCG0062(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0062(XCG0062);
		}

		if (XCG0063 == null) {
			thongsochungchixecogioiImpl.setXCG0063(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0063(XCG0063);
		}

		if (XCG0064 == null) {
			thongsochungchixecogioiImpl.setXCG0064(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0064(XCG0064);
		}

		if (XCG0065 == null) {
			thongsochungchixecogioiImpl.setXCG0065(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0065(XCG0065);
		}

		if (XCG0066 == null) {
			thongsochungchixecogioiImpl.setXCG0066(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0066(XCG0066);
		}

		if (XCG1066 == null) {
			thongsochungchixecogioiImpl.setXCG1066(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1066(XCG1066);
		}

		if (XCG0067 == null) {
			thongsochungchixecogioiImpl.setXCG0067(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0067(XCG0067);
		}

		if (XCG0068 == null) {
			thongsochungchixecogioiImpl.setXCG0068(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0068(XCG0068);
		}

		if (XCG0069 == null) {
			thongsochungchixecogioiImpl.setXCG0069(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0069(XCG0069);
		}

		if (XCG0070 == null) {
			thongsochungchixecogioiImpl.setXCG0070(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0070(XCG0070);
		}

		if (XCG0071 == null) {
			thongsochungchixecogioiImpl.setXCG0071(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0071(XCG0071);
		}

		if (XCG0072 == null) {
			thongsochungchixecogioiImpl.setXCG0072(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0072(XCG0072);
		}

		if (XCG1072 == null) {
			thongsochungchixecogioiImpl.setXCG1072(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1072(XCG1072);
		}

		if (XCG0073 == null) {
			thongsochungchixecogioiImpl.setXCG0073(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0073(XCG0073);
		}

		if (XCG0074 == null) {
			thongsochungchixecogioiImpl.setXCG0074(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0074(XCG0074);
		}

		if (XCG0075 == null) {
			thongsochungchixecogioiImpl.setXCG0075(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0075(XCG0075);
		}

		if (XCG0076 == null) {
			thongsochungchixecogioiImpl.setXCG0076(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0076(XCG0076);
		}

		if (XCG0077 == null) {
			thongsochungchixecogioiImpl.setXCG0077(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0077(XCG0077);
		}

		if (XCG1077 == null) {
			thongsochungchixecogioiImpl.setXCG1077(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1077(XCG1077);
		}

		if (XCG0078 == null) {
			thongsochungchixecogioiImpl.setXCG0078(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0078(XCG0078);
		}

		if (XCG1078 == null) {
			thongsochungchixecogioiImpl.setXCG1078(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1078(XCG1078);
		}

		if (XCG0079 == null) {
			thongsochungchixecogioiImpl.setXCG0079(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0079(XCG0079);
		}

		if (XCG0080 == null) {
			thongsochungchixecogioiImpl.setXCG0080(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0080(XCG0080);
		}

		if (XCG1080 == null) {
			thongsochungchixecogioiImpl.setXCG1080(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1080(XCG1080);
		}

		if (XCG0081 == null) {
			thongsochungchixecogioiImpl.setXCG0081(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0081(XCG0081);
		}

		if (XCG0082 == null) {
			thongsochungchixecogioiImpl.setXCG0082(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0082(XCG0082);
		}

		if (XCG0083 == null) {
			thongsochungchixecogioiImpl.setXCG0083(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0083(XCG0083);
		}

		if (XCG0084 == null) {
			thongsochungchixecogioiImpl.setXCG0084(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0084(XCG0084);
		}

		if (XCG0085 == null) {
			thongsochungchixecogioiImpl.setXCG0085(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0085(XCG0085);
		}

		if (XCG1085 == null) {
			thongsochungchixecogioiImpl.setXCG1085(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1085(XCG1085);
		}

		if (XCG0086 == null) {
			thongsochungchixecogioiImpl.setXCG0086(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0086(XCG0086);
		}

		if (XCG1086 == null) {
			thongsochungchixecogioiImpl.setXCG1086(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1086(XCG1086);
		}

		if (XCG0087 == null) {
			thongsochungchixecogioiImpl.setXCG0087(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0087(XCG0087);
		}

		if (XCG0088 == null) {
			thongsochungchixecogioiImpl.setXCG0088(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0088(XCG0088);
		}

		if (XCG1088 == null) {
			thongsochungchixecogioiImpl.setXCG1088(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1088(XCG1088);
		}

		if (XCG0089 == null) {
			thongsochungchixecogioiImpl.setXCG0089(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0089(XCG0089);
		}

		if (XCG0090 == null) {
			thongsochungchixecogioiImpl.setXCG0090(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0090(XCG0090);
		}

		if (XCG0091 == null) {
			thongsochungchixecogioiImpl.setXCG0091(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0091(XCG0091);
		}

		if (XCG0092 == null) {
			thongsochungchixecogioiImpl.setXCG0092(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0092(XCG0092);
		}

		if (XCG0093 == null) {
			thongsochungchixecogioiImpl.setXCG0093(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0093(XCG0093);
		}

		if (XCG0094 == null) {
			thongsochungchixecogioiImpl.setXCG0094(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0094(XCG0094);
		}

		if (XCG0095 == null) {
			thongsochungchixecogioiImpl.setXCG0095(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0095(XCG0095);
		}

		if (XCG0096 == null) {
			thongsochungchixecogioiImpl.setXCG0096(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0096(XCG0096);
		}

		if (XCG0097 == null) {
			thongsochungchixecogioiImpl.setXCG0097(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0097(XCG0097);
		}

		if (XCG1097 == null) {
			thongsochungchixecogioiImpl.setXCG1097(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG1097(XCG1097);
		}

		if (XCG0098 == null) {
			thongsochungchixecogioiImpl.setXCG0098(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0098(XCG0098);
		}

		if (XCG0099 == null) {
			thongsochungchixecogioiImpl.setXCG0099(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0099(XCG0099);
		}

		if (XCG0100 == null) {
			thongsochungchixecogioiImpl.setXCG0100(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0100(XCG0100);
		}

		if (XCG0101 == null) {
			thongsochungchixecogioiImpl.setXCG0101(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0101(XCG0101);
		}

		if (XCG0102 == null) {
			thongsochungchixecogioiImpl.setXCG0102(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0102(XCG0102);
		}

		if (XCG0103 == null) {
			thongsochungchixecogioiImpl.setXCG0103(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0103(XCG0103);
		}

		if (XCG0104 == null) {
			thongsochungchixecogioiImpl.setXCG0104(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0104(XCG0104);
		}

		if (XCG0105 == null) {
			thongsochungchixecogioiImpl.setXCG0105(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0105(XCG0105);
		}

		if (XCG0106 == null) {
			thongsochungchixecogioiImpl.setXCG0106(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0106(XCG0106);
		}

		if (XCG0107 == null) {
			thongsochungchixecogioiImpl.setXCG0107(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0107(XCG0107);
		}

		if (XCG0108 == null) {
			thongsochungchixecogioiImpl.setXCG0108(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0108(XCG0108);
		}

		if (XCG0109 == null) {
			thongsochungchixecogioiImpl.setXCG0109(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0109(XCG0109);
		}

		if (XCG0110 == null) {
			thongsochungchixecogioiImpl.setXCG0110(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0110(XCG0110);
		}

		if (XCG0111 == null) {
			thongsochungchixecogioiImpl.setXCG0111(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0111(XCG0111);
		}

		if (XCG0112 == null) {
			thongsochungchixecogioiImpl.setXCG0112(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0112(XCG0112);
		}

		if (XCG0113 == null) {
			thongsochungchixecogioiImpl.setXCG0113(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0113(XCG0113);
		}

		if (XCG0114 == null) {
			thongsochungchixecogioiImpl.setXCG0114(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0114(XCG0114);
		}

		if (XCG0115 == null) {
			thongsochungchixecogioiImpl.setXCG0115(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0115(XCG0115);
		}

		if (XCG0116 == null) {
			thongsochungchixecogioiImpl.setXCG0116(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0116(XCG0116);
		}

		if (XCG0117 == null) {
			thongsochungchixecogioiImpl.setXCG0117(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0117(XCG0117);
		}

		if (XCG0118 == null) {
			thongsochungchixecogioiImpl.setXCG0118(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0118(XCG0118);
		}

		if (XCG0119 == null) {
			thongsochungchixecogioiImpl.setXCG0119(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0119(XCG0119);
		}

		if (XCG0120 == null) {
			thongsochungchixecogioiImpl.setXCG0120(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0120(XCG0120);
		}

		if (XCG0121 == null) {
			thongsochungchixecogioiImpl.setXCG0121(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0121(XCG0121);
		}

		if (XCG0122 == null) {
			thongsochungchixecogioiImpl.setXCG0122(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0122(XCG0122);
		}

		if (XCG0123 == null) {
			thongsochungchixecogioiImpl.setXCG0123(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0123(XCG0123);
		}

		if (XCG0124 == null) {
			thongsochungchixecogioiImpl.setXCG0124(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0124(XCG0124);
		}

		if (XCG0125 == null) {
			thongsochungchixecogioiImpl.setXCG0125(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0125(XCG0125);
		}

		if (XCG0126 == null) {
			thongsochungchixecogioiImpl.setXCG0126(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0126(XCG0126);
		}

		if (XCG0127 == null) {
			thongsochungchixecogioiImpl.setXCG0127(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0127(XCG0127);
		}

		if (XCG0128 == null) {
			thongsochungchixecogioiImpl.setXCG0128(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0128(XCG0128);
		}

		if (XCG0238 == null) {
			thongsochungchixecogioiImpl.setXCG0238(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0238(XCG0238);
		}

		if (XCG0239 == null) {
			thongsochungchixecogioiImpl.setXCG0239(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0239(XCG0239);
		}

		if (XCG0240 == null) {
			thongsochungchixecogioiImpl.setXCG0240(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0240(XCG0240);
		}

		if (XCG0241 == null) {
			thongsochungchixecogioiImpl.setXCG0241(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiImpl.setXCG0241(XCG0241);
		}

		thongsochungchixecogioiImpl.resetOriginalValues();

		return thongsochungchixecogioiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		SynchDate = objectInput.readLong();
		XCG0009 = objectInput.readUTF();
		XCG0010 = objectInput.readUTF();
		XCG0011 = objectInput.readUTF();
		XCG0012 = objectInput.readUTF();
		XCG0013 = objectInput.readUTF();
		XCG0014 = objectInput.readUTF();
		XCG0015 = objectInput.readUTF();
		XCG0016 = objectInput.readUTF();
		XCG0017 = objectInput.readUTF();
		XCG0018 = objectInput.readUTF();
		XCG0019 = objectInput.readUTF();
		XCG0020 = objectInput.readUTF();
		XCG0021 = objectInput.readUTF();
		XCG1021 = objectInput.readUTF();
		XCG1121 = objectInput.readUTF();
		XCG0022 = objectInput.readUTF();
		XCG1022 = objectInput.readUTF();
		XCG1122 = objectInput.readUTF();
		XCG0023 = objectInput.readUTF();
		XCG1023 = objectInput.readUTF();
		XCG1123 = objectInput.readUTF();
		XCG0024 = objectInput.readUTF();
		XCG1024 = objectInput.readUTF();
		XCG1124 = objectInput.readUTF();
		XCG0025 = objectInput.readUTF();
		XCG1025 = objectInput.readUTF();
		XCG1125 = objectInput.readUTF();
		XCG0026 = objectInput.readUTF();
		XCG1026 = objectInput.readUTF();
		XCG1126 = objectInput.readUTF();
		XCG0027 = objectInput.readUTF();
		XCG1027 = objectInput.readUTF();
		XCG1127 = objectInput.readUTF();
		XCG0028 = objectInput.readUTF();
		XCG1028 = objectInput.readUTF();
		XCG1128 = objectInput.readUTF();
		XCG0029 = objectInput.readUTF();
		XCG1029 = objectInput.readUTF();
		XCG1129 = objectInput.readUTF();
		XCG0030 = objectInput.readUTF();
		XCG1030 = objectInput.readUTF();
		XCG1130 = objectInput.readUTF();
		XCG0031 = objectInput.readUTF();
		XCG1031 = objectInput.readUTF();
		XCG1131 = objectInput.readUTF();
		XCG0032 = objectInput.readUTF();
		XCG1032 = objectInput.readUTF();
		XCG1132 = objectInput.readUTF();
		XCG0033 = objectInput.readUTF();
		XCG1033 = objectInput.readUTF();
		XCG1133 = objectInput.readUTF();
		XCG0034 = objectInput.readUTF();
		XCG1034 = objectInput.readUTF();
		XCG1134 = objectInput.readUTF();
		XCG0035 = objectInput.readUTF();
		XCG1035 = objectInput.readUTF();
		XCG1135 = objectInput.readUTF();
		XCG0036 = objectInput.readUTF();
		XCG1036 = objectInput.readUTF();
		XCG1136 = objectInput.readUTF();
		XCG0037 = objectInput.readUTF();
		XCG1037 = objectInput.readUTF();
		XCG1137 = objectInput.readUTF();
		XCG0038 = objectInput.readUTF();
		XCG1038 = objectInput.readUTF();
		XCG1138 = objectInput.readUTF();
		XCG0039 = objectInput.readUTF();
		XCG1039 = objectInput.readUTF();
		XCG1139 = objectInput.readUTF();
		XCG0040 = objectInput.readUTF();
		XCG1040 = objectInput.readUTF();
		XCG1140 = objectInput.readUTF();
		XCG0041 = objectInput.readUTF();
		XCG1041 = objectInput.readUTF();
		XCG1141 = objectInput.readUTF();
		XCG0042 = objectInput.readUTF();
		XCG1042 = objectInput.readUTF();
		XCG1142 = objectInput.readUTF();
		XCG0043 = objectInput.readUTF();
		XCG1043 = objectInput.readUTF();
		XCG1143 = objectInput.readUTF();
		XCG0044 = objectInput.readUTF();
		XCG1044 = objectInput.readUTF();
		XCG1144 = objectInput.readUTF();
		XCG0045 = objectInput.readUTF();
		XCG0046 = objectInput.readUTF();
		XCG1047 = objectInput.readUTF();
		XCG0047 = objectInput.readUTF();
		XCG0048 = objectInput.readUTF();
		XCG0049 = objectInput.readUTF();
		XCG0050 = objectInput.readUTF();
		XCG0051 = objectInput.readUTF();
		XCG0052 = objectInput.readUTF();
		XCG0053 = objectInput.readUTF();
		XCG0054 = objectInput.readUTF();
		XCG1054 = objectInput.readUTF();
		XCG1154 = objectInput.readUTF();
		XCG1254 = objectInput.readUTF();
		XCG1354 = objectInput.readUTF();
		XCG1454 = objectInput.readUTF();
		XCG1554 = objectInput.readUTF();
		XCG1654 = objectInput.readUTF();
		XCG1754 = objectInput.readUTF();
		XCG0055 = objectInput.readUTF();
		XCG0056 = objectInput.readUTF();
		XCG0057 = objectInput.readUTF();
		XCG0058 = objectInput.readUTF();
		XCG0059 = objectInput.readUTF();
		XCG1059 = objectInput.readUTF();
		XCG0060 = objectInput.readUTF();
		XCG0061 = objectInput.readUTF();
		XCG0062 = objectInput.readUTF();
		XCG0063 = objectInput.readUTF();
		XCG0064 = objectInput.readUTF();
		XCG0065 = objectInput.readUTF();
		XCG0066 = objectInput.readUTF();
		XCG1066 = objectInput.readUTF();
		XCG0067 = objectInput.readUTF();
		XCG0068 = objectInput.readUTF();
		XCG0069 = objectInput.readUTF();
		XCG0070 = objectInput.readUTF();
		XCG0071 = objectInput.readUTF();
		XCG0072 = objectInput.readUTF();
		XCG1072 = objectInput.readUTF();
		XCG0073 = objectInput.readUTF();
		XCG0074 = objectInput.readUTF();
		XCG0075 = objectInput.readUTF();
		XCG0076 = objectInput.readUTF();
		XCG0077 = objectInput.readUTF();
		XCG1077 = objectInput.readUTF();
		XCG0078 = objectInput.readUTF();
		XCG1078 = objectInput.readUTF();
		XCG0079 = objectInput.readUTF();
		XCG0080 = objectInput.readUTF();
		XCG1080 = objectInput.readUTF();
		XCG0081 = objectInput.readUTF();
		XCG0082 = objectInput.readUTF();
		XCG0083 = objectInput.readUTF();
		XCG0084 = objectInput.readUTF();
		XCG0085 = objectInput.readUTF();
		XCG1085 = objectInput.readUTF();
		XCG0086 = objectInput.readUTF();
		XCG1086 = objectInput.readUTF();
		XCG0087 = objectInput.readUTF();
		XCG0088 = objectInput.readUTF();
		XCG1088 = objectInput.readUTF();
		XCG0089 = objectInput.readUTF();
		XCG0090 = objectInput.readUTF();
		XCG0091 = objectInput.readUTF();
		XCG0092 = objectInput.readUTF();
		XCG0093 = objectInput.readUTF();
		XCG0094 = objectInput.readUTF();
		XCG0095 = objectInput.readUTF();
		XCG0096 = objectInput.readUTF();
		XCG0097 = objectInput.readUTF();
		XCG1097 = objectInput.readUTF();
		XCG0098 = objectInput.readUTF();
		XCG0099 = objectInput.readUTF();
		XCG0100 = objectInput.readUTF();
		XCG0101 = objectInput.readUTF();
		XCG0102 = objectInput.readUTF();
		XCG0103 = objectInput.readUTF();
		XCG0104 = objectInput.readUTF();
		XCG0105 = objectInput.readUTF();
		XCG0106 = objectInput.readUTF();
		XCG0107 = objectInput.readUTF();
		XCG0108 = objectInput.readUTF();
		XCG0109 = objectInput.readUTF();
		XCG0110 = objectInput.readUTF();
		XCG0111 = objectInput.readUTF();
		XCG0112 = objectInput.readUTF();
		XCG0113 = objectInput.readUTF();
		XCG0114 = objectInput.readUTF();
		XCG0115 = objectInput.readUTF();
		XCG0116 = objectInput.readUTF();
		XCG0117 = objectInput.readUTF();
		XCG0118 = objectInput.readUTF();
		XCG0119 = objectInput.readUTF();
		XCG0120 = objectInput.readUTF();
		XCG0121 = objectInput.readUTF();
		XCG0122 = objectInput.readUTF();
		XCG0123 = objectInput.readUTF();
		XCG0124 = objectInput.readUTF();
		XCG0125 = objectInput.readUTF();
		XCG0126 = objectInput.readUTF();
		XCG0127 = objectInput.readUTF();
		XCG0128 = objectInput.readUTF();
		XCG0238 = objectInput.readUTF();
		XCG0239 = objectInput.readUTF();
		XCG0240 = objectInput.readUTF();
		XCG0241 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(SynchDate);

		if (XCG0009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0009);
		}

		if (XCG0010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0010);
		}

		if (XCG0011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0011);
		}

		if (XCG0012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0012);
		}

		if (XCG0013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0013);
		}

		if (XCG0014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0014);
		}

		if (XCG0015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0015);
		}

		if (XCG0016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0016);
		}

		if (XCG0017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0017);
		}

		if (XCG0018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0018);
		}

		if (XCG0019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0019);
		}

		if (XCG0020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0020);
		}

		if (XCG0021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0021);
		}

		if (XCG1021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1021);
		}

		if (XCG1121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1121);
		}

		if (XCG0022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0022);
		}

		if (XCG1022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1022);
		}

		if (XCG1122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1122);
		}

		if (XCG0023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0023);
		}

		if (XCG1023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1023);
		}

		if (XCG1123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1123);
		}

		if (XCG0024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0024);
		}

		if (XCG1024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1024);
		}

		if (XCG1124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1124);
		}

		if (XCG0025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0025);
		}

		if (XCG1025 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1025);
		}

		if (XCG1125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1125);
		}

		if (XCG0026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0026);
		}

		if (XCG1026 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1026);
		}

		if (XCG1126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1126);
		}

		if (XCG0027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0027);
		}

		if (XCG1027 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1027);
		}

		if (XCG1127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1127);
		}

		if (XCG0028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0028);
		}

		if (XCG1028 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1028);
		}

		if (XCG1128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1128);
		}

		if (XCG0029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0029);
		}

		if (XCG1029 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1029);
		}

		if (XCG1129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1129);
		}

		if (XCG0030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0030);
		}

		if (XCG1030 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1030);
		}

		if (XCG1130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1130);
		}

		if (XCG0031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0031);
		}

		if (XCG1031 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1031);
		}

		if (XCG1131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1131);
		}

		if (XCG0032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0032);
		}

		if (XCG1032 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1032);
		}

		if (XCG1132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1132);
		}

		if (XCG0033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0033);
		}

		if (XCG1033 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1033);
		}

		if (XCG1133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1133);
		}

		if (XCG0034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0034);
		}

		if (XCG1034 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1034);
		}

		if (XCG1134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1134);
		}

		if (XCG0035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0035);
		}

		if (XCG1035 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1035);
		}

		if (XCG1135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1135);
		}

		if (XCG0036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0036);
		}

		if (XCG1036 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1036);
		}

		if (XCG1136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1136);
		}

		if (XCG0037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0037);
		}

		if (XCG1037 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1037);
		}

		if (XCG1137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1137);
		}

		if (XCG0038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0038);
		}

		if (XCG1038 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1038);
		}

		if (XCG1138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1138);
		}

		if (XCG0039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0039);
		}

		if (XCG1039 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1039);
		}

		if (XCG1139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1139);
		}

		if (XCG0040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0040);
		}

		if (XCG1040 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1040);
		}

		if (XCG1140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1140);
		}

		if (XCG0041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0041);
		}

		if (XCG1041 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1041);
		}

		if (XCG1141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1141);
		}

		if (XCG0042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0042);
		}

		if (XCG1042 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1042);
		}

		if (XCG1142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1142);
		}

		if (XCG0043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0043);
		}

		if (XCG1043 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1043);
		}

		if (XCG1143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1143);
		}

		if (XCG0044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0044);
		}

		if (XCG1044 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1044);
		}

		if (XCG1144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1144);
		}

		if (XCG0045 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0045);
		}

		if (XCG0046 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0046);
		}

		if (XCG1047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1047);
		}

		if (XCG0047 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0047);
		}

		if (XCG0048 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0048);
		}

		if (XCG0049 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0049);
		}

		if (XCG0050 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0050);
		}

		if (XCG0051 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0051);
		}

		if (XCG0052 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0052);
		}

		if (XCG0053 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0053);
		}

		if (XCG0054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0054);
		}

		if (XCG1054 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1054);
		}

		if (XCG1154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1154);
		}

		if (XCG1254 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1254);
		}

		if (XCG1354 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1354);
		}

		if (XCG1454 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1454);
		}

		if (XCG1554 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1554);
		}

		if (XCG1654 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1654);
		}

		if (XCG1754 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1754);
		}

		if (XCG0055 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0055);
		}

		if (XCG0056 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0056);
		}

		if (XCG0057 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0057);
		}

		if (XCG0058 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0058);
		}

		if (XCG0059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0059);
		}

		if (XCG1059 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1059);
		}

		if (XCG0060 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0060);
		}

		if (XCG0061 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0061);
		}

		if (XCG0062 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0062);
		}

		if (XCG0063 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0063);
		}

		if (XCG0064 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0064);
		}

		if (XCG0065 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0065);
		}

		if (XCG0066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0066);
		}

		if (XCG1066 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1066);
		}

		if (XCG0067 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0067);
		}

		if (XCG0068 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0068);
		}

		if (XCG0069 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0069);
		}

		if (XCG0070 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0070);
		}

		if (XCG0071 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0071);
		}

		if (XCG0072 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0072);
		}

		if (XCG1072 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1072);
		}

		if (XCG0073 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0073);
		}

		if (XCG0074 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0074);
		}

		if (XCG0075 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0075);
		}

		if (XCG0076 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0076);
		}

		if (XCG0077 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0077);
		}

		if (XCG1077 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1077);
		}

		if (XCG0078 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0078);
		}

		if (XCG1078 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1078);
		}

		if (XCG0079 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0079);
		}

		if (XCG0080 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0080);
		}

		if (XCG1080 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1080);
		}

		if (XCG0081 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0081);
		}

		if (XCG0082 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0082);
		}

		if (XCG0083 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0083);
		}

		if (XCG0084 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0084);
		}

		if (XCG0085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0085);
		}

		if (XCG1085 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1085);
		}

		if (XCG0086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0086);
		}

		if (XCG1086 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1086);
		}

		if (XCG0087 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0087);
		}

		if (XCG0088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0088);
		}

		if (XCG1088 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1088);
		}

		if (XCG0089 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0089);
		}

		if (XCG0090 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0090);
		}

		if (XCG0091 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0091);
		}

		if (XCG0092 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0092);
		}

		if (XCG0093 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0093);
		}

		if (XCG0094 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0094);
		}

		if (XCG0095 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0095);
		}

		if (XCG0096 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0096);
		}

		if (XCG0097 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0097);
		}

		if (XCG1097 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG1097);
		}

		if (XCG0098 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0098);
		}

		if (XCG0099 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0099);
		}

		if (XCG0100 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0100);
		}

		if (XCG0101 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0101);
		}

		if (XCG0102 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0102);
		}

		if (XCG0103 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0103);
		}

		if (XCG0104 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0104);
		}

		if (XCG0105 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0105);
		}

		if (XCG0106 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0106);
		}

		if (XCG0107 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0107);
		}

		if (XCG0108 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0108);
		}

		if (XCG0109 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0109);
		}

		if (XCG0110 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0110);
		}

		if (XCG0111 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0111);
		}

		if (XCG0112 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0112);
		}

		if (XCG0113 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0113);
		}

		if (XCG0114 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0114);
		}

		if (XCG0115 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0115);
		}

		if (XCG0116 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0116);
		}

		if (XCG0117 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0117);
		}

		if (XCG0118 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0118);
		}

		if (XCG0119 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0119);
		}

		if (XCG0120 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0120);
		}

		if (XCG0121 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0121);
		}

		if (XCG0122 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0122);
		}

		if (XCG0123 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0123);
		}

		if (XCG0124 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0124);
		}

		if (XCG0125 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0125);
		}

		if (XCG0126 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0126);
		}

		if (XCG0127 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0127);
		}

		if (XCG0128 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0128);
		}

		if (XCG0238 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0238);
		}

		if (XCG0239 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0239);
		}

		if (XCG0240 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0240);
		}

		if (XCG0241 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0241);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long certificateRecordId;
	public long vehicleGroupId;
	public long SynchDate;
	public String XCG0009;
	public String XCG0010;
	public String XCG0011;
	public String XCG0012;
	public String XCG0013;
	public String XCG0014;
	public String XCG0015;
	public String XCG0016;
	public String XCG0017;
	public String XCG0018;
	public String XCG0019;
	public String XCG0020;
	public String XCG0021;
	public String XCG1021;
	public String XCG1121;
	public String XCG0022;
	public String XCG1022;
	public String XCG1122;
	public String XCG0023;
	public String XCG1023;
	public String XCG1123;
	public String XCG0024;
	public String XCG1024;
	public String XCG1124;
	public String XCG0025;
	public String XCG1025;
	public String XCG1125;
	public String XCG0026;
	public String XCG1026;
	public String XCG1126;
	public String XCG0027;
	public String XCG1027;
	public String XCG1127;
	public String XCG0028;
	public String XCG1028;
	public String XCG1128;
	public String XCG0029;
	public String XCG1029;
	public String XCG1129;
	public String XCG0030;
	public String XCG1030;
	public String XCG1130;
	public String XCG0031;
	public String XCG1031;
	public String XCG1131;
	public String XCG0032;
	public String XCG1032;
	public String XCG1132;
	public String XCG0033;
	public String XCG1033;
	public String XCG1133;
	public String XCG0034;
	public String XCG1034;
	public String XCG1134;
	public String XCG0035;
	public String XCG1035;
	public String XCG1135;
	public String XCG0036;
	public String XCG1036;
	public String XCG1136;
	public String XCG0037;
	public String XCG1037;
	public String XCG1137;
	public String XCG0038;
	public String XCG1038;
	public String XCG1138;
	public String XCG0039;
	public String XCG1039;
	public String XCG1139;
	public String XCG0040;
	public String XCG1040;
	public String XCG1140;
	public String XCG0041;
	public String XCG1041;
	public String XCG1141;
	public String XCG0042;
	public String XCG1042;
	public String XCG1142;
	public String XCG0043;
	public String XCG1043;
	public String XCG1143;
	public String XCG0044;
	public String XCG1044;
	public String XCG1144;
	public String XCG0045;
	public String XCG0046;
	public String XCG1047;
	public String XCG0047;
	public String XCG0048;
	public String XCG0049;
	public String XCG0050;
	public String XCG0051;
	public String XCG0052;
	public String XCG0053;
	public String XCG0054;
	public String XCG1054;
	public String XCG1154;
	public String XCG1254;
	public String XCG1354;
	public String XCG1454;
	public String XCG1554;
	public String XCG1654;
	public String XCG1754;
	public String XCG0055;
	public String XCG0056;
	public String XCG0057;
	public String XCG0058;
	public String XCG0059;
	public String XCG1059;
	public String XCG0060;
	public String XCG0061;
	public String XCG0062;
	public String XCG0063;
	public String XCG0064;
	public String XCG0065;
	public String XCG0066;
	public String XCG1066;
	public String XCG0067;
	public String XCG0068;
	public String XCG0069;
	public String XCG0070;
	public String XCG0071;
	public String XCG0072;
	public String XCG1072;
	public String XCG0073;
	public String XCG0074;
	public String XCG0075;
	public String XCG0076;
	public String XCG0077;
	public String XCG1077;
	public String XCG0078;
	public String XCG1078;
	public String XCG0079;
	public String XCG0080;
	public String XCG1080;
	public String XCG0081;
	public String XCG0082;
	public String XCG0083;
	public String XCG0084;
	public String XCG0085;
	public String XCG1085;
	public String XCG0086;
	public String XCG1086;
	public String XCG0087;
	public String XCG0088;
	public String XCG1088;
	public String XCG0089;
	public String XCG0090;
	public String XCG0091;
	public String XCG0092;
	public String XCG0093;
	public String XCG0094;
	public String XCG0095;
	public String XCG0096;
	public String XCG0097;
	public String XCG1097;
	public String XCG0098;
	public String XCG0099;
	public String XCG0100;
	public String XCG0101;
	public String XCG0102;
	public String XCG0103;
	public String XCG0104;
	public String XCG0105;
	public String XCG0106;
	public String XCG0107;
	public String XCG0108;
	public String XCG0109;
	public String XCG0110;
	public String XCG0111;
	public String XCG0112;
	public String XCG0113;
	public String XCG0114;
	public String XCG0115;
	public String XCG0116;
	public String XCG0117;
	public String XCG0118;
	public String XCG0119;
	public String XCG0120;
	public String XCG0121;
	public String XCG0122;
	public String XCG0123;
	public String XCG0124;
	public String XCG0125;
	public String XCG0126;
	public String XCG0127;
	public String XCG0128;
	public String XCG0238;
	public String XCG0239;
	public String XCG0240;
	public String XCG0241;
}