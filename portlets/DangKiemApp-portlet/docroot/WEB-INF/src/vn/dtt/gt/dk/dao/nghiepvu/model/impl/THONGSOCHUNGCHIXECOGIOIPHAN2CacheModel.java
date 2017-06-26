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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGSOCHUNGCHIXECOGIOIPHAN2 in entity cache.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOIPHAN2
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2CacheModel implements CacheModel<THONGSOCHUNGCHIXECOGIOIPHAN2>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(343);

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
		sb.append(", XCG0129=");
		sb.append(XCG0129);
		sb.append(", XCG0130=");
		sb.append(XCG0130);
		sb.append(", XCG0131=");
		sb.append(XCG0131);
		sb.append(", XCG0132=");
		sb.append(XCG0132);
		sb.append(", XCG0133=");
		sb.append(XCG0133);
		sb.append(", XCG0134=");
		sb.append(XCG0134);
		sb.append(", XCG0135=");
		sb.append(XCG0135);
		sb.append(", XCG2135=");
		sb.append(XCG2135);
		sb.append(", XCG0136=");
		sb.append(XCG0136);
		sb.append(", XCG2136=");
		sb.append(XCG2136);
		sb.append(", XCG0137=");
		sb.append(XCG0137);
		sb.append(", XCG2137=");
		sb.append(XCG2137);
		sb.append(", XCG0138=");
		sb.append(XCG0138);
		sb.append(", XCG2138=");
		sb.append(XCG2138);
		sb.append(", XCG0139=");
		sb.append(XCG0139);
		sb.append(", XCG2139=");
		sb.append(XCG2139);
		sb.append(", XCG0140=");
		sb.append(XCG0140);
		sb.append(", XCG2140=");
		sb.append(XCG2140);
		sb.append(", XCG0141=");
		sb.append(XCG0141);
		sb.append(", XCG2141=");
		sb.append(XCG2141);
		sb.append(", XCG0142=");
		sb.append(XCG0142);
		sb.append(", XCG2142=");
		sb.append(XCG2142);
		sb.append(", XCG0143=");
		sb.append(XCG0143);
		sb.append(", XCG2143=");
		sb.append(XCG2143);
		sb.append(", XCG0144=");
		sb.append(XCG0144);
		sb.append(", XCG2144=");
		sb.append(XCG2144);
		sb.append(", XCG0145=");
		sb.append(XCG0145);
		sb.append(", XCG2145=");
		sb.append(XCG2145);
		sb.append(", XCG2245=");
		sb.append(XCG2245);
		sb.append(", XCG0146=");
		sb.append(XCG0146);
		sb.append(", XCG2146=");
		sb.append(XCG2146);
		sb.append(", XCG2246=");
		sb.append(XCG2246);
		sb.append(", XCG0147=");
		sb.append(XCG0147);
		sb.append(", XCG2147=");
		sb.append(XCG2147);
		sb.append(", XCG2247=");
		sb.append(XCG2247);
		sb.append(", XCG0148=");
		sb.append(XCG0148);
		sb.append(", XCG2148=");
		sb.append(XCG2148);
		sb.append(", XCG2248=");
		sb.append(XCG2248);
		sb.append(", XCG0149=");
		sb.append(XCG0149);
		sb.append(", XCG2149=");
		sb.append(XCG2149);
		sb.append(", XCG2249=");
		sb.append(XCG2249);
		sb.append(", XCG0150=");
		sb.append(XCG0150);
		sb.append(", XCG2150=");
		sb.append(XCG2150);
		sb.append(", XCG2250=");
		sb.append(XCG2250);
		sb.append(", XCG0151=");
		sb.append(XCG0151);
		sb.append(", XCG2151=");
		sb.append(XCG2151);
		sb.append(", XCG2251=");
		sb.append(XCG2251);
		sb.append(", XCG0152=");
		sb.append(XCG0152);
		sb.append(", XCG2152=");
		sb.append(XCG2152);
		sb.append(", XCG2252=");
		sb.append(XCG2252);
		sb.append(", XCG0153=");
		sb.append(XCG0153);
		sb.append(", XCG2153=");
		sb.append(XCG2153);
		sb.append(", XCG2253=");
		sb.append(XCG2253);
		sb.append(", XCG0154=");
		sb.append(XCG0154);
		sb.append(", XCG2154=");
		sb.append(XCG2154);
		sb.append(", XCG2254=");
		sb.append(XCG2254);
		sb.append(", XCG0155=");
		sb.append(XCG0155);
		sb.append(", XCG0156=");
		sb.append(XCG0156);
		sb.append(", XCG0242=");
		sb.append(XCG0242);
		sb.append(", XCG0157=");
		sb.append(XCG0157);
		sb.append(", XCG0158=");
		sb.append(XCG0158);
		sb.append(", XCG0159=");
		sb.append(XCG0159);
		sb.append(", XCG0160=");
		sb.append(XCG0160);
		sb.append(", XCG0243=");
		sb.append(XCG0243);
		sb.append(", XCG0161=");
		sb.append(XCG0161);
		sb.append(", XCG0162=");
		sb.append(XCG0162);
		sb.append(", XCG0163=");
		sb.append(XCG0163);
		sb.append(", XCG0164=");
		sb.append(XCG0164);
		sb.append(", XCG0244=");
		sb.append(XCG0244);
		sb.append(", XCG0165=");
		sb.append(XCG0165);
		sb.append(", XCG0166=");
		sb.append(XCG0166);
		sb.append(", XCG0167=");
		sb.append(XCG0167);
		sb.append(", XCG0168=");
		sb.append(XCG0168);
		sb.append(", XCG0245=");
		sb.append(XCG0245);
		sb.append(", XCG0169=");
		sb.append(XCG0169);
		sb.append(", XCG0170=");
		sb.append(XCG0170);
		sb.append(", XCG0171=");
		sb.append(XCG0171);
		sb.append(", XCG0172=");
		sb.append(XCG0172);
		sb.append(", XCG0246=");
		sb.append(XCG0246);
		sb.append(", XCG0173=");
		sb.append(XCG0173);
		sb.append(", XCG0174=");
		sb.append(XCG0174);
		sb.append(", XCG0175=");
		sb.append(XCG0175);
		sb.append(", XCG0176=");
		sb.append(XCG0176);
		sb.append(", XCG0247=");
		sb.append(XCG0247);
		sb.append(", XCG0177=");
		sb.append(XCG0177);
		sb.append(", XCG0178=");
		sb.append(XCG0178);
		sb.append(", XCG0179=");
		sb.append(XCG0179);
		sb.append(", XCG0180=");
		sb.append(XCG0180);
		sb.append(", XCG0248=");
		sb.append(XCG0248);
		sb.append(", XCG0181=");
		sb.append(XCG0181);
		sb.append(", XCG0182=");
		sb.append(XCG0182);
		sb.append(", XCG0183=");
		sb.append(XCG0183);
		sb.append(", XCG0184=");
		sb.append(XCG0184);
		sb.append(", XCG0249=");
		sb.append(XCG0249);
		sb.append(", XCG0185=");
		sb.append(XCG0185);
		sb.append(", XCG0186=");
		sb.append(XCG0186);
		sb.append(", XCG0187=");
		sb.append(XCG0187);
		sb.append(", XCG0188=");
		sb.append(XCG0188);
		sb.append(", XCG0250=");
		sb.append(XCG0250);
		sb.append(", XCG0189=");
		sb.append(XCG0189);
		sb.append(", XCG0190=");
		sb.append(XCG0190);
		sb.append(", XCG0191=");
		sb.append(XCG0191);
		sb.append(", XCG0192=");
		sb.append(XCG0192);
		sb.append(", XCG0251=");
		sb.append(XCG0251);
		sb.append(", XCG0193=");
		sb.append(XCG0193);
		sb.append(", XCG0194=");
		sb.append(XCG0194);
		sb.append(", XCG0195=");
		sb.append(XCG0195);
		sb.append(", XCG0196=");
		sb.append(XCG0196);
		sb.append(", XCG0197=");
		sb.append(XCG0197);
		sb.append(", XCG0198=");
		sb.append(XCG0198);
		sb.append(", XCG0199=");
		sb.append(XCG0199);
		sb.append(", XCG0200=");
		sb.append(XCG0200);
		sb.append(", XCG0201=");
		sb.append(XCG0201);
		sb.append(", XCG0202=");
		sb.append(XCG0202);
		sb.append(", XCG0203=");
		sb.append(XCG0203);
		sb.append(", XCG0204=");
		sb.append(XCG0204);
		sb.append(", XCG0205=");
		sb.append(XCG0205);
		sb.append(", XCG0206=");
		sb.append(XCG0206);
		sb.append(", XCG0207=");
		sb.append(XCG0207);
		sb.append(", XCG0208=");
		sb.append(XCG0208);
		sb.append(", XCG0209=");
		sb.append(XCG0209);
		sb.append(", XCG0210=");
		sb.append(XCG0210);
		sb.append(", XCG0211=");
		sb.append(XCG0211);
		sb.append(", XCG0212=");
		sb.append(XCG0212);
		sb.append(", XCG0213=");
		sb.append(XCG0213);
		sb.append(", XCG0214=");
		sb.append(XCG0214);
		sb.append(", XCG0215=");
		sb.append(XCG0215);
		sb.append(", XCG0216=");
		sb.append(XCG0216);
		sb.append(", XCG0217=");
		sb.append(XCG0217);
		sb.append(", XCG0218=");
		sb.append(XCG0218);
		sb.append(", XCG0219=");
		sb.append(XCG0219);
		sb.append(", XCG2218=");
		sb.append(XCG2218);
		sb.append(", XCG2219=");
		sb.append(XCG2219);
		sb.append(", XCG0220=");
		sb.append(XCG0220);
		sb.append(", XCG2220=");
		sb.append(XCG2220);
		sb.append(", XCG0221=");
		sb.append(XCG0221);
		sb.append(", XCG2221=");
		sb.append(XCG2221);
		sb.append(", XCG0222=");
		sb.append(XCG0222);
		sb.append(", XCG2222=");
		sb.append(XCG2222);
		sb.append(", XCG0223=");
		sb.append(XCG0223);
		sb.append(", XCG2223=");
		sb.append(XCG2223);
		sb.append(", XCG0224=");
		sb.append(XCG0224);
		sb.append(", XCG2224=");
		sb.append(XCG2224);
		sb.append(", XCG0225=");
		sb.append(XCG0225);
		sb.append(", XCG2225=");
		sb.append(XCG2225);
		sb.append(", XCG0226=");
		sb.append(XCG0226);
		sb.append(", XCG2226=");
		sb.append(XCG2226);
		sb.append(", XCG0227=");
		sb.append(XCG0227);
		sb.append(", XCG2227=");
		sb.append(XCG2227);
		sb.append(", XCG0228=");
		sb.append(XCG0228);
		sb.append(", XCG2228=");
		sb.append(XCG2228);
		sb.append(", XCG0229=");
		sb.append(XCG0229);
		sb.append(", XCG2229=");
		sb.append(XCG2229);
		sb.append(", XCG0230=");
		sb.append(XCG0230);
		sb.append(", XCG2230=");
		sb.append(XCG2230);
		sb.append(", XCG0231=");
		sb.append(XCG0231);
		sb.append(", XCG2231=");
		sb.append(XCG2231);
		sb.append(", XCG0232=");
		sb.append(XCG0232);
		sb.append(", XCG2232=");
		sb.append(XCG2232);
		sb.append(", XCG0233=");
		sb.append(XCG0233);
		sb.append(", XCG2233=");
		sb.append(XCG2233);
		sb.append(", XCG0234=");
		sb.append(XCG0234);
		sb.append(", XCG0235=");
		sb.append(XCG0235);
		sb.append(", XCG2235=");
		sb.append(XCG2235);
		sb.append(", XCG0236=");
		sb.append(XCG0236);
		sb.append(", XCG0237=");
		sb.append(XCG0237);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 toEntityModel() {
		THONGSOCHUNGCHIXECOGIOIPHAN2Impl thongsochungchixecogioiphan2Impl = new THONGSOCHUNGCHIXECOGIOIPHAN2Impl();

		thongsochungchixecogioiphan2Impl.setId(id);
		thongsochungchixecogioiphan2Impl.setHoSoThuTucId(hoSoThuTucId);
		thongsochungchixecogioiphan2Impl.setCertificateRecordId(certificateRecordId);
		thongsochungchixecogioiphan2Impl.setVehicleGroupId(vehicleGroupId);

		if (SynchDate == Long.MIN_VALUE) {
			thongsochungchixecogioiphan2Impl.setSynchDate(null);
		}
		else {
			thongsochungchixecogioiphan2Impl.setSynchDate(new Date(SynchDate));
		}

		if (XCG0129 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0129(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0129(XCG0129);
		}

		if (XCG0130 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0130(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0130(XCG0130);
		}

		if (XCG0131 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0131(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0131(XCG0131);
		}

		if (XCG0132 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0132(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0132(XCG0132);
		}

		if (XCG0133 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0133(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0133(XCG0133);
		}

		if (XCG0134 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0134(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0134(XCG0134);
		}

		if (XCG0135 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0135(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0135(XCG0135);
		}

		if (XCG2135 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2135(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2135(XCG2135);
		}

		if (XCG0136 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0136(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0136(XCG0136);
		}

		if (XCG2136 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2136(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2136(XCG2136);
		}

		if (XCG0137 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0137(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0137(XCG0137);
		}

		if (XCG2137 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2137(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2137(XCG2137);
		}

		if (XCG0138 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0138(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0138(XCG0138);
		}

		if (XCG2138 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2138(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2138(XCG2138);
		}

		if (XCG0139 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0139(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0139(XCG0139);
		}

		if (XCG2139 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2139(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2139(XCG2139);
		}

		if (XCG0140 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0140(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0140(XCG0140);
		}

		if (XCG2140 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2140(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2140(XCG2140);
		}

		if (XCG0141 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0141(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0141(XCG0141);
		}

		if (XCG2141 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2141(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2141(XCG2141);
		}

		if (XCG0142 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0142(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0142(XCG0142);
		}

		if (XCG2142 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2142(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2142(XCG2142);
		}

		if (XCG0143 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0143(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0143(XCG0143);
		}

		if (XCG2143 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2143(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2143(XCG2143);
		}

		if (XCG0144 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0144(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0144(XCG0144);
		}

		if (XCG2144 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2144(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2144(XCG2144);
		}

		if (XCG0145 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0145(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0145(XCG0145);
		}

		if (XCG2145 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2145(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2145(XCG2145);
		}

		if (XCG2245 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2245(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2245(XCG2245);
		}

		if (XCG0146 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0146(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0146(XCG0146);
		}

		if (XCG2146 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2146(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2146(XCG2146);
		}

		if (XCG2246 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2246(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2246(XCG2246);
		}

		if (XCG0147 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0147(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0147(XCG0147);
		}

		if (XCG2147 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2147(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2147(XCG2147);
		}

		if (XCG2247 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2247(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2247(XCG2247);
		}

		if (XCG0148 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0148(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0148(XCG0148);
		}

		if (XCG2148 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2148(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2148(XCG2148);
		}

		if (XCG2248 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2248(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2248(XCG2248);
		}

		if (XCG0149 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0149(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0149(XCG0149);
		}

		if (XCG2149 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2149(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2149(XCG2149);
		}

		if (XCG2249 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2249(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2249(XCG2249);
		}

		if (XCG0150 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0150(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0150(XCG0150);
		}

		if (XCG2150 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2150(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2150(XCG2150);
		}

		if (XCG2250 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2250(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2250(XCG2250);
		}

		if (XCG0151 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0151(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0151(XCG0151);
		}

		if (XCG2151 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2151(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2151(XCG2151);
		}

		if (XCG2251 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2251(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2251(XCG2251);
		}

		if (XCG0152 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0152(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0152(XCG0152);
		}

		if (XCG2152 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2152(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2152(XCG2152);
		}

		if (XCG2252 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2252(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2252(XCG2252);
		}

		if (XCG0153 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0153(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0153(XCG0153);
		}

		if (XCG2153 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2153(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2153(XCG2153);
		}

		if (XCG2253 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2253(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2253(XCG2253);
		}

		if (XCG0154 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0154(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0154(XCG0154);
		}

		if (XCG2154 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2154(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2154(XCG2154);
		}

		if (XCG2254 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2254(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2254(XCG2254);
		}

		if (XCG0155 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0155(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0155(XCG0155);
		}

		if (XCG0156 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0156(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0156(XCG0156);
		}

		if (XCG0242 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0242(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0242(XCG0242);
		}

		if (XCG0157 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0157(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0157(XCG0157);
		}

		if (XCG0158 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0158(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0158(XCG0158);
		}

		if (XCG0159 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0159(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0159(XCG0159);
		}

		if (XCG0160 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0160(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0160(XCG0160);
		}

		if (XCG0243 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0243(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0243(XCG0243);
		}

		if (XCG0161 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0161(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0161(XCG0161);
		}

		if (XCG0162 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0162(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0162(XCG0162);
		}

		if (XCG0163 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0163(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0163(XCG0163);
		}

		if (XCG0164 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0164(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0164(XCG0164);
		}

		if (XCG0244 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0244(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0244(XCG0244);
		}

		if (XCG0165 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0165(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0165(XCG0165);
		}

		if (XCG0166 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0166(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0166(XCG0166);
		}

		if (XCG0167 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0167(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0167(XCG0167);
		}

		if (XCG0168 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0168(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0168(XCG0168);
		}

		if (XCG0245 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0245(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0245(XCG0245);
		}

		if (XCG0169 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0169(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0169(XCG0169);
		}

		if (XCG0170 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0170(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0170(XCG0170);
		}

		if (XCG0171 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0171(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0171(XCG0171);
		}

		if (XCG0172 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0172(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0172(XCG0172);
		}

		if (XCG0246 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0246(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0246(XCG0246);
		}

		if (XCG0173 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0173(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0173(XCG0173);
		}

		if (XCG0174 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0174(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0174(XCG0174);
		}

		if (XCG0175 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0175(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0175(XCG0175);
		}

		if (XCG0176 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0176(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0176(XCG0176);
		}

		if (XCG0247 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0247(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0247(XCG0247);
		}

		if (XCG0177 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0177(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0177(XCG0177);
		}

		if (XCG0178 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0178(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0178(XCG0178);
		}

		if (XCG0179 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0179(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0179(XCG0179);
		}

		if (XCG0180 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0180(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0180(XCG0180);
		}

		if (XCG0248 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0248(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0248(XCG0248);
		}

		if (XCG0181 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0181(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0181(XCG0181);
		}

		if (XCG0182 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0182(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0182(XCG0182);
		}

		if (XCG0183 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0183(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0183(XCG0183);
		}

		if (XCG0184 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0184(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0184(XCG0184);
		}

		if (XCG0249 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0249(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0249(XCG0249);
		}

		if (XCG0185 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0185(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0185(XCG0185);
		}

		if (XCG0186 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0186(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0186(XCG0186);
		}

		if (XCG0187 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0187(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0187(XCG0187);
		}

		if (XCG0188 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0188(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0188(XCG0188);
		}

		if (XCG0250 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0250(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0250(XCG0250);
		}

		if (XCG0189 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0189(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0189(XCG0189);
		}

		if (XCG0190 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0190(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0190(XCG0190);
		}

		if (XCG0191 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0191(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0191(XCG0191);
		}

		if (XCG0192 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0192(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0192(XCG0192);
		}

		if (XCG0251 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0251(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0251(XCG0251);
		}

		if (XCG0193 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0193(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0193(XCG0193);
		}

		if (XCG0194 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0194(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0194(XCG0194);
		}

		if (XCG0195 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0195(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0195(XCG0195);
		}

		if (XCG0196 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0196(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0196(XCG0196);
		}

		if (XCG0197 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0197(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0197(XCG0197);
		}

		if (XCG0198 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0198(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0198(XCG0198);
		}

		if (XCG0199 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0199(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0199(XCG0199);
		}

		if (XCG0200 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0200(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0200(XCG0200);
		}

		if (XCG0201 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0201(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0201(XCG0201);
		}

		if (XCG0202 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0202(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0202(XCG0202);
		}

		if (XCG0203 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0203(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0203(XCG0203);
		}

		if (XCG0204 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0204(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0204(XCG0204);
		}

		if (XCG0205 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0205(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0205(XCG0205);
		}

		if (XCG0206 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0206(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0206(XCG0206);
		}

		if (XCG0207 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0207(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0207(XCG0207);
		}

		if (XCG0208 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0208(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0208(XCG0208);
		}

		if (XCG0209 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0209(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0209(XCG0209);
		}

		if (XCG0210 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0210(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0210(XCG0210);
		}

		if (XCG0211 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0211(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0211(XCG0211);
		}

		if (XCG0212 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0212(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0212(XCG0212);
		}

		if (XCG0213 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0213(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0213(XCG0213);
		}

		if (XCG0214 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0214(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0214(XCG0214);
		}

		if (XCG0215 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0215(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0215(XCG0215);
		}

		if (XCG0216 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0216(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0216(XCG0216);
		}

		if (XCG0217 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0217(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0217(XCG0217);
		}

		if (XCG0218 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0218(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0218(XCG0218);
		}

		if (XCG0219 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0219(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0219(XCG0219);
		}

		if (XCG2218 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2218(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2218(XCG2218);
		}

		if (XCG2219 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2219(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2219(XCG2219);
		}

		if (XCG0220 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0220(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0220(XCG0220);
		}

		if (XCG2220 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2220(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2220(XCG2220);
		}

		if (XCG0221 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0221(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0221(XCG0221);
		}

		if (XCG2221 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2221(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2221(XCG2221);
		}

		if (XCG0222 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0222(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0222(XCG0222);
		}

		if (XCG2222 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2222(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2222(XCG2222);
		}

		if (XCG0223 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0223(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0223(XCG0223);
		}

		if (XCG2223 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2223(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2223(XCG2223);
		}

		if (XCG0224 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0224(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0224(XCG0224);
		}

		if (XCG2224 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2224(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2224(XCG2224);
		}

		if (XCG0225 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0225(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0225(XCG0225);
		}

		if (XCG2225 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2225(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2225(XCG2225);
		}

		if (XCG0226 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0226(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0226(XCG0226);
		}

		if (XCG2226 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2226(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2226(XCG2226);
		}

		if (XCG0227 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0227(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0227(XCG0227);
		}

		if (XCG2227 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2227(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2227(XCG2227);
		}

		if (XCG0228 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0228(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0228(XCG0228);
		}

		if (XCG2228 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2228(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2228(XCG2228);
		}

		if (XCG0229 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0229(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0229(XCG0229);
		}

		if (XCG2229 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2229(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2229(XCG2229);
		}

		if (XCG0230 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0230(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0230(XCG0230);
		}

		if (XCG2230 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2230(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2230(XCG2230);
		}

		if (XCG0231 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0231(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0231(XCG0231);
		}

		if (XCG2231 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2231(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2231(XCG2231);
		}

		if (XCG0232 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0232(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0232(XCG0232);
		}

		if (XCG2232 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2232(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2232(XCG2232);
		}

		if (XCG0233 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0233(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0233(XCG0233);
		}

		if (XCG2233 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2233(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2233(XCG2233);
		}

		if (XCG0234 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0234(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0234(XCG0234);
		}

		if (XCG0235 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0235(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0235(XCG0235);
		}

		if (XCG2235 == null) {
			thongsochungchixecogioiphan2Impl.setXCG2235(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG2235(XCG2235);
		}

		if (XCG0236 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0236(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0236(XCG0236);
		}

		if (XCG0237 == null) {
			thongsochungchixecogioiphan2Impl.setXCG0237(StringPool.BLANK);
		}
		else {
			thongsochungchixecogioiphan2Impl.setXCG0237(XCG0237);
		}

		thongsochungchixecogioiphan2Impl.resetOriginalValues();

		return thongsochungchixecogioiphan2Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		SynchDate = objectInput.readLong();
		XCG0129 = objectInput.readUTF();
		XCG0130 = objectInput.readUTF();
		XCG0131 = objectInput.readUTF();
		XCG0132 = objectInput.readUTF();
		XCG0133 = objectInput.readUTF();
		XCG0134 = objectInput.readUTF();
		XCG0135 = objectInput.readUTF();
		XCG2135 = objectInput.readUTF();
		XCG0136 = objectInput.readUTF();
		XCG2136 = objectInput.readUTF();
		XCG0137 = objectInput.readUTF();
		XCG2137 = objectInput.readUTF();
		XCG0138 = objectInput.readUTF();
		XCG2138 = objectInput.readUTF();
		XCG0139 = objectInput.readUTF();
		XCG2139 = objectInput.readUTF();
		XCG0140 = objectInput.readUTF();
		XCG2140 = objectInput.readUTF();
		XCG0141 = objectInput.readUTF();
		XCG2141 = objectInput.readUTF();
		XCG0142 = objectInput.readUTF();
		XCG2142 = objectInput.readUTF();
		XCG0143 = objectInput.readUTF();
		XCG2143 = objectInput.readUTF();
		XCG0144 = objectInput.readUTF();
		XCG2144 = objectInput.readUTF();
		XCG0145 = objectInput.readUTF();
		XCG2145 = objectInput.readUTF();
		XCG2245 = objectInput.readUTF();
		XCG0146 = objectInput.readUTF();
		XCG2146 = objectInput.readUTF();
		XCG2246 = objectInput.readUTF();
		XCG0147 = objectInput.readUTF();
		XCG2147 = objectInput.readUTF();
		XCG2247 = objectInput.readUTF();
		XCG0148 = objectInput.readUTF();
		XCG2148 = objectInput.readUTF();
		XCG2248 = objectInput.readUTF();
		XCG0149 = objectInput.readUTF();
		XCG2149 = objectInput.readUTF();
		XCG2249 = objectInput.readUTF();
		XCG0150 = objectInput.readUTF();
		XCG2150 = objectInput.readUTF();
		XCG2250 = objectInput.readUTF();
		XCG0151 = objectInput.readUTF();
		XCG2151 = objectInput.readUTF();
		XCG2251 = objectInput.readUTF();
		XCG0152 = objectInput.readUTF();
		XCG2152 = objectInput.readUTF();
		XCG2252 = objectInput.readUTF();
		XCG0153 = objectInput.readUTF();
		XCG2153 = objectInput.readUTF();
		XCG2253 = objectInput.readUTF();
		XCG0154 = objectInput.readUTF();
		XCG2154 = objectInput.readUTF();
		XCG2254 = objectInput.readUTF();
		XCG0155 = objectInput.readUTF();
		XCG0156 = objectInput.readUTF();
		XCG0242 = objectInput.readUTF();
		XCG0157 = objectInput.readUTF();
		XCG0158 = objectInput.readUTF();
		XCG0159 = objectInput.readUTF();
		XCG0160 = objectInput.readUTF();
		XCG0243 = objectInput.readUTF();
		XCG0161 = objectInput.readUTF();
		XCG0162 = objectInput.readUTF();
		XCG0163 = objectInput.readUTF();
		XCG0164 = objectInput.readUTF();
		XCG0244 = objectInput.readUTF();
		XCG0165 = objectInput.readUTF();
		XCG0166 = objectInput.readUTF();
		XCG0167 = objectInput.readUTF();
		XCG0168 = objectInput.readUTF();
		XCG0245 = objectInput.readUTF();
		XCG0169 = objectInput.readUTF();
		XCG0170 = objectInput.readUTF();
		XCG0171 = objectInput.readUTF();
		XCG0172 = objectInput.readUTF();
		XCG0246 = objectInput.readUTF();
		XCG0173 = objectInput.readUTF();
		XCG0174 = objectInput.readUTF();
		XCG0175 = objectInput.readUTF();
		XCG0176 = objectInput.readUTF();
		XCG0247 = objectInput.readUTF();
		XCG0177 = objectInput.readUTF();
		XCG0178 = objectInput.readUTF();
		XCG0179 = objectInput.readUTF();
		XCG0180 = objectInput.readUTF();
		XCG0248 = objectInput.readUTF();
		XCG0181 = objectInput.readUTF();
		XCG0182 = objectInput.readUTF();
		XCG0183 = objectInput.readUTF();
		XCG0184 = objectInput.readUTF();
		XCG0249 = objectInput.readUTF();
		XCG0185 = objectInput.readUTF();
		XCG0186 = objectInput.readUTF();
		XCG0187 = objectInput.readUTF();
		XCG0188 = objectInput.readUTF();
		XCG0250 = objectInput.readUTF();
		XCG0189 = objectInput.readUTF();
		XCG0190 = objectInput.readUTF();
		XCG0191 = objectInput.readUTF();
		XCG0192 = objectInput.readUTF();
		XCG0251 = objectInput.readUTF();
		XCG0193 = objectInput.readUTF();
		XCG0194 = objectInput.readUTF();
		XCG0195 = objectInput.readUTF();
		XCG0196 = objectInput.readUTF();
		XCG0197 = objectInput.readUTF();
		XCG0198 = objectInput.readUTF();
		XCG0199 = objectInput.readUTF();
		XCG0200 = objectInput.readUTF();
		XCG0201 = objectInput.readUTF();
		XCG0202 = objectInput.readUTF();
		XCG0203 = objectInput.readUTF();
		XCG0204 = objectInput.readUTF();
		XCG0205 = objectInput.readUTF();
		XCG0206 = objectInput.readUTF();
		XCG0207 = objectInput.readUTF();
		XCG0208 = objectInput.readUTF();
		XCG0209 = objectInput.readUTF();
		XCG0210 = objectInput.readUTF();
		XCG0211 = objectInput.readUTF();
		XCG0212 = objectInput.readUTF();
		XCG0213 = objectInput.readUTF();
		XCG0214 = objectInput.readUTF();
		XCG0215 = objectInput.readUTF();
		XCG0216 = objectInput.readUTF();
		XCG0217 = objectInput.readUTF();
		XCG0218 = objectInput.readUTF();
		XCG0219 = objectInput.readUTF();
		XCG2218 = objectInput.readUTF();
		XCG2219 = objectInput.readUTF();
		XCG0220 = objectInput.readUTF();
		XCG2220 = objectInput.readUTF();
		XCG0221 = objectInput.readUTF();
		XCG2221 = objectInput.readUTF();
		XCG0222 = objectInput.readUTF();
		XCG2222 = objectInput.readUTF();
		XCG0223 = objectInput.readUTF();
		XCG2223 = objectInput.readUTF();
		XCG0224 = objectInput.readUTF();
		XCG2224 = objectInput.readUTF();
		XCG0225 = objectInput.readUTF();
		XCG2225 = objectInput.readUTF();
		XCG0226 = objectInput.readUTF();
		XCG2226 = objectInput.readUTF();
		XCG0227 = objectInput.readUTF();
		XCG2227 = objectInput.readUTF();
		XCG0228 = objectInput.readUTF();
		XCG2228 = objectInput.readUTF();
		XCG0229 = objectInput.readUTF();
		XCG2229 = objectInput.readUTF();
		XCG0230 = objectInput.readUTF();
		XCG2230 = objectInput.readUTF();
		XCG0231 = objectInput.readUTF();
		XCG2231 = objectInput.readUTF();
		XCG0232 = objectInput.readUTF();
		XCG2232 = objectInput.readUTF();
		XCG0233 = objectInput.readUTF();
		XCG2233 = objectInput.readUTF();
		XCG0234 = objectInput.readUTF();
		XCG0235 = objectInput.readUTF();
		XCG2235 = objectInput.readUTF();
		XCG0236 = objectInput.readUTF();
		XCG0237 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(SynchDate);

		if (XCG0129 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0129);
		}

		if (XCG0130 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0130);
		}

		if (XCG0131 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0131);
		}

		if (XCG0132 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0132);
		}

		if (XCG0133 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0133);
		}

		if (XCG0134 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0134);
		}

		if (XCG0135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0135);
		}

		if (XCG2135 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2135);
		}

		if (XCG0136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0136);
		}

		if (XCG2136 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2136);
		}

		if (XCG0137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0137);
		}

		if (XCG2137 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2137);
		}

		if (XCG0138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0138);
		}

		if (XCG2138 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2138);
		}

		if (XCG0139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0139);
		}

		if (XCG2139 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2139);
		}

		if (XCG0140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0140);
		}

		if (XCG2140 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2140);
		}

		if (XCG0141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0141);
		}

		if (XCG2141 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2141);
		}

		if (XCG0142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0142);
		}

		if (XCG2142 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2142);
		}

		if (XCG0143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0143);
		}

		if (XCG2143 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2143);
		}

		if (XCG0144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0144);
		}

		if (XCG2144 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2144);
		}

		if (XCG0145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0145);
		}

		if (XCG2145 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2145);
		}

		if (XCG2245 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2245);
		}

		if (XCG0146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0146);
		}

		if (XCG2146 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2146);
		}

		if (XCG2246 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2246);
		}

		if (XCG0147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0147);
		}

		if (XCG2147 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2147);
		}

		if (XCG2247 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2247);
		}

		if (XCG0148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0148);
		}

		if (XCG2148 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2148);
		}

		if (XCG2248 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2248);
		}

		if (XCG0149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0149);
		}

		if (XCG2149 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2149);
		}

		if (XCG2249 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2249);
		}

		if (XCG0150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0150);
		}

		if (XCG2150 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2150);
		}

		if (XCG2250 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2250);
		}

		if (XCG0151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0151);
		}

		if (XCG2151 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2151);
		}

		if (XCG2251 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2251);
		}

		if (XCG0152 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0152);
		}

		if (XCG2152 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2152);
		}

		if (XCG2252 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2252);
		}

		if (XCG0153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0153);
		}

		if (XCG2153 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2153);
		}

		if (XCG2253 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2253);
		}

		if (XCG0154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0154);
		}

		if (XCG2154 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2154);
		}

		if (XCG2254 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2254);
		}

		if (XCG0155 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0155);
		}

		if (XCG0156 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0156);
		}

		if (XCG0242 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0242);
		}

		if (XCG0157 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0157);
		}

		if (XCG0158 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0158);
		}

		if (XCG0159 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0159);
		}

		if (XCG0160 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0160);
		}

		if (XCG0243 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0243);
		}

		if (XCG0161 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0161);
		}

		if (XCG0162 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0162);
		}

		if (XCG0163 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0163);
		}

		if (XCG0164 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0164);
		}

		if (XCG0244 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0244);
		}

		if (XCG0165 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0165);
		}

		if (XCG0166 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0166);
		}

		if (XCG0167 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0167);
		}

		if (XCG0168 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0168);
		}

		if (XCG0245 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0245);
		}

		if (XCG0169 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0169);
		}

		if (XCG0170 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0170);
		}

		if (XCG0171 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0171);
		}

		if (XCG0172 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0172);
		}

		if (XCG0246 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0246);
		}

		if (XCG0173 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0173);
		}

		if (XCG0174 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0174);
		}

		if (XCG0175 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0175);
		}

		if (XCG0176 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0176);
		}

		if (XCG0247 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0247);
		}

		if (XCG0177 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0177);
		}

		if (XCG0178 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0178);
		}

		if (XCG0179 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0179);
		}

		if (XCG0180 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0180);
		}

		if (XCG0248 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0248);
		}

		if (XCG0181 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0181);
		}

		if (XCG0182 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0182);
		}

		if (XCG0183 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0183);
		}

		if (XCG0184 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0184);
		}

		if (XCG0249 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0249);
		}

		if (XCG0185 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0185);
		}

		if (XCG0186 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0186);
		}

		if (XCG0187 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0187);
		}

		if (XCG0188 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0188);
		}

		if (XCG0250 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0250);
		}

		if (XCG0189 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0189);
		}

		if (XCG0190 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0190);
		}

		if (XCG0191 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0191);
		}

		if (XCG0192 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0192);
		}

		if (XCG0251 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0251);
		}

		if (XCG0193 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0193);
		}

		if (XCG0194 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0194);
		}

		if (XCG0195 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0195);
		}

		if (XCG0196 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0196);
		}

		if (XCG0197 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0197);
		}

		if (XCG0198 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0198);
		}

		if (XCG0199 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0199);
		}

		if (XCG0200 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0200);
		}

		if (XCG0201 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0201);
		}

		if (XCG0202 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0202);
		}

		if (XCG0203 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0203);
		}

		if (XCG0204 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0204);
		}

		if (XCG0205 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0205);
		}

		if (XCG0206 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0206);
		}

		if (XCG0207 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0207);
		}

		if (XCG0208 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0208);
		}

		if (XCG0209 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0209);
		}

		if (XCG0210 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0210);
		}

		if (XCG0211 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0211);
		}

		if (XCG0212 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0212);
		}

		if (XCG0213 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0213);
		}

		if (XCG0214 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0214);
		}

		if (XCG0215 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0215);
		}

		if (XCG0216 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0216);
		}

		if (XCG0217 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0217);
		}

		if (XCG0218 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0218);
		}

		if (XCG0219 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0219);
		}

		if (XCG2218 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2218);
		}

		if (XCG2219 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2219);
		}

		if (XCG0220 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0220);
		}

		if (XCG2220 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2220);
		}

		if (XCG0221 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0221);
		}

		if (XCG2221 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2221);
		}

		if (XCG0222 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0222);
		}

		if (XCG2222 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2222);
		}

		if (XCG0223 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0223);
		}

		if (XCG2223 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2223);
		}

		if (XCG0224 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0224);
		}

		if (XCG2224 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2224);
		}

		if (XCG0225 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0225);
		}

		if (XCG2225 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2225);
		}

		if (XCG0226 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0226);
		}

		if (XCG2226 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2226);
		}

		if (XCG0227 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0227);
		}

		if (XCG2227 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2227);
		}

		if (XCG0228 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0228);
		}

		if (XCG2228 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2228);
		}

		if (XCG0229 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0229);
		}

		if (XCG2229 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2229);
		}

		if (XCG0230 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0230);
		}

		if (XCG2230 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2230);
		}

		if (XCG0231 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0231);
		}

		if (XCG2231 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2231);
		}

		if (XCG0232 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0232);
		}

		if (XCG2232 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2232);
		}

		if (XCG0233 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0233);
		}

		if (XCG2233 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2233);
		}

		if (XCG0234 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0234);
		}

		if (XCG0235 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0235);
		}

		if (XCG2235 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG2235);
		}

		if (XCG0236 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0236);
		}

		if (XCG0237 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCG0237);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long certificateRecordId;
	public long vehicleGroupId;
	public long SynchDate;
	public String XCG0129;
	public String XCG0130;
	public String XCG0131;
	public String XCG0132;
	public String XCG0133;
	public String XCG0134;
	public String XCG0135;
	public String XCG2135;
	public String XCG0136;
	public String XCG2136;
	public String XCG0137;
	public String XCG2137;
	public String XCG0138;
	public String XCG2138;
	public String XCG0139;
	public String XCG2139;
	public String XCG0140;
	public String XCG2140;
	public String XCG0141;
	public String XCG2141;
	public String XCG0142;
	public String XCG2142;
	public String XCG0143;
	public String XCG2143;
	public String XCG0144;
	public String XCG2144;
	public String XCG0145;
	public String XCG2145;
	public String XCG2245;
	public String XCG0146;
	public String XCG2146;
	public String XCG2246;
	public String XCG0147;
	public String XCG2147;
	public String XCG2247;
	public String XCG0148;
	public String XCG2148;
	public String XCG2248;
	public String XCG0149;
	public String XCG2149;
	public String XCG2249;
	public String XCG0150;
	public String XCG2150;
	public String XCG2250;
	public String XCG0151;
	public String XCG2151;
	public String XCG2251;
	public String XCG0152;
	public String XCG2152;
	public String XCG2252;
	public String XCG0153;
	public String XCG2153;
	public String XCG2253;
	public String XCG0154;
	public String XCG2154;
	public String XCG2254;
	public String XCG0155;
	public String XCG0156;
	public String XCG0242;
	public String XCG0157;
	public String XCG0158;
	public String XCG0159;
	public String XCG0160;
	public String XCG0243;
	public String XCG0161;
	public String XCG0162;
	public String XCG0163;
	public String XCG0164;
	public String XCG0244;
	public String XCG0165;
	public String XCG0166;
	public String XCG0167;
	public String XCG0168;
	public String XCG0245;
	public String XCG0169;
	public String XCG0170;
	public String XCG0171;
	public String XCG0172;
	public String XCG0246;
	public String XCG0173;
	public String XCG0174;
	public String XCG0175;
	public String XCG0176;
	public String XCG0247;
	public String XCG0177;
	public String XCG0178;
	public String XCG0179;
	public String XCG0180;
	public String XCG0248;
	public String XCG0181;
	public String XCG0182;
	public String XCG0183;
	public String XCG0184;
	public String XCG0249;
	public String XCG0185;
	public String XCG0186;
	public String XCG0187;
	public String XCG0188;
	public String XCG0250;
	public String XCG0189;
	public String XCG0190;
	public String XCG0191;
	public String XCG0192;
	public String XCG0251;
	public String XCG0193;
	public String XCG0194;
	public String XCG0195;
	public String XCG0196;
	public String XCG0197;
	public String XCG0198;
	public String XCG0199;
	public String XCG0200;
	public String XCG0201;
	public String XCG0202;
	public String XCG0203;
	public String XCG0204;
	public String XCG0205;
	public String XCG0206;
	public String XCG0207;
	public String XCG0208;
	public String XCG0209;
	public String XCG0210;
	public String XCG0211;
	public String XCG0212;
	public String XCG0213;
	public String XCG0214;
	public String XCG0215;
	public String XCG0216;
	public String XCG0217;
	public String XCG0218;
	public String XCG0219;
	public String XCG2218;
	public String XCG2219;
	public String XCG0220;
	public String XCG2220;
	public String XCG0221;
	public String XCG2221;
	public String XCG0222;
	public String XCG2222;
	public String XCG0223;
	public String XCG2223;
	public String XCG0224;
	public String XCG2224;
	public String XCG0225;
	public String XCG2225;
	public String XCG0226;
	public String XCG2226;
	public String XCG0227;
	public String XCG2227;
	public String XCG0228;
	public String XCG2228;
	public String XCG0229;
	public String XCG2229;
	public String XCG0230;
	public String XCG2230;
	public String XCG0231;
	public String XCG2231;
	public String XCG0232;
	public String XCG2232;
	public String XCG0233;
	public String XCG2233;
	public String XCG0234;
	public String XCG0235;
	public String XCG2235;
	public String XCG0236;
	public String XCG0237;
}