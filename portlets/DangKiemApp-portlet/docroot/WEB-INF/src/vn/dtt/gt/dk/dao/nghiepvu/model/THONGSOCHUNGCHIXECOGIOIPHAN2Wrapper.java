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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link THONGSOCHUNGCHIXECOGIOIPHAN2}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOIPHAN2
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper
	implements THONGSOCHUNGCHIXECOGIOIPHAN2,
		ModelWrapper<THONGSOCHUNGCHIXECOGIOIPHAN2> {
	public THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper(
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2) {
		_thongsochungchixecogioiphan2 = thongsochungchixecogioiphan2;
	}

	@Override
	public Class<?> getModelClass() {
		return THONGSOCHUNGCHIXECOGIOIPHAN2.class;
	}

	@Override
	public String getModelClassName() {
		return THONGSOCHUNGCHIXECOGIOIPHAN2.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("SynchDate", getSynchDate());
		attributes.put("XCG0129", getXCG0129());
		attributes.put("XCG0130", getXCG0130());
		attributes.put("XCG0131", getXCG0131());
		attributes.put("XCG0132", getXCG0132());
		attributes.put("XCG0133", getXCG0133());
		attributes.put("XCG0134", getXCG0134());
		attributes.put("XCG0135", getXCG0135());
		attributes.put("XCG2135", getXCG2135());
		attributes.put("XCG0136", getXCG0136());
		attributes.put("XCG2136", getXCG2136());
		attributes.put("XCG0137", getXCG0137());
		attributes.put("XCG2137", getXCG2137());
		attributes.put("XCG0138", getXCG0138());
		attributes.put("XCG2138", getXCG2138());
		attributes.put("XCG0139", getXCG0139());
		attributes.put("XCG2139", getXCG2139());
		attributes.put("XCG0140", getXCG0140());
		attributes.put("XCG2140", getXCG2140());
		attributes.put("XCG0141", getXCG0141());
		attributes.put("XCG2141", getXCG2141());
		attributes.put("XCG0142", getXCG0142());
		attributes.put("XCG2142", getXCG2142());
		attributes.put("XCG0143", getXCG0143());
		attributes.put("XCG2143", getXCG2143());
		attributes.put("XCG0144", getXCG0144());
		attributes.put("XCG2144", getXCG2144());
		attributes.put("XCG0145", getXCG0145());
		attributes.put("XCG2145", getXCG2145());
		attributes.put("XCG2245", getXCG2245());
		attributes.put("XCG0146", getXCG0146());
		attributes.put("XCG2146", getXCG2146());
		attributes.put("XCG2246", getXCG2246());
		attributes.put("XCG0147", getXCG0147());
		attributes.put("XCG2147", getXCG2147());
		attributes.put("XCG2247", getXCG2247());
		attributes.put("XCG0148", getXCG0148());
		attributes.put("XCG2148", getXCG2148());
		attributes.put("XCG2248", getXCG2248());
		attributes.put("XCG0149", getXCG0149());
		attributes.put("XCG2149", getXCG2149());
		attributes.put("XCG2249", getXCG2249());
		attributes.put("XCG0150", getXCG0150());
		attributes.put("XCG2150", getXCG2150());
		attributes.put("XCG2250", getXCG2250());
		attributes.put("XCG0151", getXCG0151());
		attributes.put("XCG2151", getXCG2151());
		attributes.put("XCG2251", getXCG2251());
		attributes.put("XCG0152", getXCG0152());
		attributes.put("XCG2152", getXCG2152());
		attributes.put("XCG2252", getXCG2252());
		attributes.put("XCG0153", getXCG0153());
		attributes.put("XCG2153", getXCG2153());
		attributes.put("XCG2253", getXCG2253());
		attributes.put("XCG0154", getXCG0154());
		attributes.put("XCG2154", getXCG2154());
		attributes.put("XCG2254", getXCG2254());
		attributes.put("XCG0155", getXCG0155());
		attributes.put("XCG0156", getXCG0156());
		attributes.put("XCG0242", getXCG0242());
		attributes.put("XCG0157", getXCG0157());
		attributes.put("XCG0158", getXCG0158());
		attributes.put("XCG0159", getXCG0159());
		attributes.put("XCG0160", getXCG0160());
		attributes.put("XCG0243", getXCG0243());
		attributes.put("XCG0161", getXCG0161());
		attributes.put("XCG0162", getXCG0162());
		attributes.put("XCG0163", getXCG0163());
		attributes.put("XCG0164", getXCG0164());
		attributes.put("XCG0244", getXCG0244());
		attributes.put("XCG0165", getXCG0165());
		attributes.put("XCG0166", getXCG0166());
		attributes.put("XCG0167", getXCG0167());
		attributes.put("XCG0168", getXCG0168());
		attributes.put("XCG0245", getXCG0245());
		attributes.put("XCG0169", getXCG0169());
		attributes.put("XCG0170", getXCG0170());
		attributes.put("XCG0171", getXCG0171());
		attributes.put("XCG0172", getXCG0172());
		attributes.put("XCG0246", getXCG0246());
		attributes.put("XCG0173", getXCG0173());
		attributes.put("XCG0174", getXCG0174());
		attributes.put("XCG0175", getXCG0175());
		attributes.put("XCG0176", getXCG0176());
		attributes.put("XCG0247", getXCG0247());
		attributes.put("XCG0177", getXCG0177());
		attributes.put("XCG0178", getXCG0178());
		attributes.put("XCG0179", getXCG0179());
		attributes.put("XCG0180", getXCG0180());
		attributes.put("XCG0248", getXCG0248());
		attributes.put("XCG0181", getXCG0181());
		attributes.put("XCG0182", getXCG0182());
		attributes.put("XCG0183", getXCG0183());
		attributes.put("XCG0184", getXCG0184());
		attributes.put("XCG0249", getXCG0249());
		attributes.put("XCG0185", getXCG0185());
		attributes.put("XCG0186", getXCG0186());
		attributes.put("XCG0187", getXCG0187());
		attributes.put("XCG0188", getXCG0188());
		attributes.put("XCG0250", getXCG0250());
		attributes.put("XCG0189", getXCG0189());
		attributes.put("XCG0190", getXCG0190());
		attributes.put("XCG0191", getXCG0191());
		attributes.put("XCG0192", getXCG0192());
		attributes.put("XCG0251", getXCG0251());
		attributes.put("XCG0193", getXCG0193());
		attributes.put("XCG0194", getXCG0194());
		attributes.put("XCG0195", getXCG0195());
		attributes.put("XCG0196", getXCG0196());
		attributes.put("XCG0197", getXCG0197());
		attributes.put("XCG0198", getXCG0198());
		attributes.put("XCG0199", getXCG0199());
		attributes.put("XCG0200", getXCG0200());
		attributes.put("XCG0201", getXCG0201());
		attributes.put("XCG0202", getXCG0202());
		attributes.put("XCG0203", getXCG0203());
		attributes.put("XCG0204", getXCG0204());
		attributes.put("XCG0205", getXCG0205());
		attributes.put("XCG0206", getXCG0206());
		attributes.put("XCG0207", getXCG0207());
		attributes.put("XCG0208", getXCG0208());
		attributes.put("XCG0209", getXCG0209());
		attributes.put("XCG0210", getXCG0210());
		attributes.put("XCG0211", getXCG0211());
		attributes.put("XCG0212", getXCG0212());
		attributes.put("XCG0213", getXCG0213());
		attributes.put("XCG0214", getXCG0214());
		attributes.put("XCG0215", getXCG0215());
		attributes.put("XCG0216", getXCG0216());
		attributes.put("XCG0217", getXCG0217());
		attributes.put("XCG0218", getXCG0218());
		attributes.put("XCG0219", getXCG0219());
		attributes.put("XCG2218", getXCG2218());
		attributes.put("XCG2219", getXCG2219());
		attributes.put("XCG0220", getXCG0220());
		attributes.put("XCG2220", getXCG2220());
		attributes.put("XCG0221", getXCG0221());
		attributes.put("XCG2221", getXCG2221());
		attributes.put("XCG0222", getXCG0222());
		attributes.put("XCG2222", getXCG2222());
		attributes.put("XCG0223", getXCG0223());
		attributes.put("XCG2223", getXCG2223());
		attributes.put("XCG0224", getXCG0224());
		attributes.put("XCG2224", getXCG2224());
		attributes.put("XCG0225", getXCG0225());
		attributes.put("XCG2225", getXCG2225());
		attributes.put("XCG0226", getXCG0226());
		attributes.put("XCG2226", getXCG2226());
		attributes.put("XCG0227", getXCG0227());
		attributes.put("XCG2227", getXCG2227());
		attributes.put("XCG0228", getXCG0228());
		attributes.put("XCG2228", getXCG2228());
		attributes.put("XCG0229", getXCG0229());
		attributes.put("XCG2229", getXCG2229());
		attributes.put("XCG0230", getXCG0230());
		attributes.put("XCG2230", getXCG2230());
		attributes.put("XCG0231", getXCG0231());
		attributes.put("XCG2231", getXCG2231());
		attributes.put("XCG0232", getXCG0232());
		attributes.put("XCG2232", getXCG2232());
		attributes.put("XCG0233", getXCG0233());
		attributes.put("XCG2233", getXCG2233());
		attributes.put("XCG0234", getXCG0234());
		attributes.put("XCG0235", getXCG0235());
		attributes.put("XCG2235", getXCG2235());
		attributes.put("XCG0236", getXCG0236());
		attributes.put("XCG0237", getXCG0237());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}

		String XCG0129 = (String)attributes.get("XCG0129");

		if (XCG0129 != null) {
			setXCG0129(XCG0129);
		}

		String XCG0130 = (String)attributes.get("XCG0130");

		if (XCG0130 != null) {
			setXCG0130(XCG0130);
		}

		String XCG0131 = (String)attributes.get("XCG0131");

		if (XCG0131 != null) {
			setXCG0131(XCG0131);
		}

		String XCG0132 = (String)attributes.get("XCG0132");

		if (XCG0132 != null) {
			setXCG0132(XCG0132);
		}

		String XCG0133 = (String)attributes.get("XCG0133");

		if (XCG0133 != null) {
			setXCG0133(XCG0133);
		}

		String XCG0134 = (String)attributes.get("XCG0134");

		if (XCG0134 != null) {
			setXCG0134(XCG0134);
		}

		String XCG0135 = (String)attributes.get("XCG0135");

		if (XCG0135 != null) {
			setXCG0135(XCG0135);
		}

		String XCG2135 = (String)attributes.get("XCG2135");

		if (XCG2135 != null) {
			setXCG2135(XCG2135);
		}

		String XCG0136 = (String)attributes.get("XCG0136");

		if (XCG0136 != null) {
			setXCG0136(XCG0136);
		}

		String XCG2136 = (String)attributes.get("XCG2136");

		if (XCG2136 != null) {
			setXCG2136(XCG2136);
		}

		String XCG0137 = (String)attributes.get("XCG0137");

		if (XCG0137 != null) {
			setXCG0137(XCG0137);
		}

		String XCG2137 = (String)attributes.get("XCG2137");

		if (XCG2137 != null) {
			setXCG2137(XCG2137);
		}

		String XCG0138 = (String)attributes.get("XCG0138");

		if (XCG0138 != null) {
			setXCG0138(XCG0138);
		}

		String XCG2138 = (String)attributes.get("XCG2138");

		if (XCG2138 != null) {
			setXCG2138(XCG2138);
		}

		String XCG0139 = (String)attributes.get("XCG0139");

		if (XCG0139 != null) {
			setXCG0139(XCG0139);
		}

		String XCG2139 = (String)attributes.get("XCG2139");

		if (XCG2139 != null) {
			setXCG2139(XCG2139);
		}

		String XCG0140 = (String)attributes.get("XCG0140");

		if (XCG0140 != null) {
			setXCG0140(XCG0140);
		}

		String XCG2140 = (String)attributes.get("XCG2140");

		if (XCG2140 != null) {
			setXCG2140(XCG2140);
		}

		String XCG0141 = (String)attributes.get("XCG0141");

		if (XCG0141 != null) {
			setXCG0141(XCG0141);
		}

		String XCG2141 = (String)attributes.get("XCG2141");

		if (XCG2141 != null) {
			setXCG2141(XCG2141);
		}

		String XCG0142 = (String)attributes.get("XCG0142");

		if (XCG0142 != null) {
			setXCG0142(XCG0142);
		}

		String XCG2142 = (String)attributes.get("XCG2142");

		if (XCG2142 != null) {
			setXCG2142(XCG2142);
		}

		String XCG0143 = (String)attributes.get("XCG0143");

		if (XCG0143 != null) {
			setXCG0143(XCG0143);
		}

		String XCG2143 = (String)attributes.get("XCG2143");

		if (XCG2143 != null) {
			setXCG2143(XCG2143);
		}

		String XCG0144 = (String)attributes.get("XCG0144");

		if (XCG0144 != null) {
			setXCG0144(XCG0144);
		}

		String XCG2144 = (String)attributes.get("XCG2144");

		if (XCG2144 != null) {
			setXCG2144(XCG2144);
		}

		String XCG0145 = (String)attributes.get("XCG0145");

		if (XCG0145 != null) {
			setXCG0145(XCG0145);
		}

		String XCG2145 = (String)attributes.get("XCG2145");

		if (XCG2145 != null) {
			setXCG2145(XCG2145);
		}

		String XCG2245 = (String)attributes.get("XCG2245");

		if (XCG2245 != null) {
			setXCG2245(XCG2245);
		}

		String XCG0146 = (String)attributes.get("XCG0146");

		if (XCG0146 != null) {
			setXCG0146(XCG0146);
		}

		String XCG2146 = (String)attributes.get("XCG2146");

		if (XCG2146 != null) {
			setXCG2146(XCG2146);
		}

		String XCG2246 = (String)attributes.get("XCG2246");

		if (XCG2246 != null) {
			setXCG2246(XCG2246);
		}

		String XCG0147 = (String)attributes.get("XCG0147");

		if (XCG0147 != null) {
			setXCG0147(XCG0147);
		}

		String XCG2147 = (String)attributes.get("XCG2147");

		if (XCG2147 != null) {
			setXCG2147(XCG2147);
		}

		String XCG2247 = (String)attributes.get("XCG2247");

		if (XCG2247 != null) {
			setXCG2247(XCG2247);
		}

		String XCG0148 = (String)attributes.get("XCG0148");

		if (XCG0148 != null) {
			setXCG0148(XCG0148);
		}

		String XCG2148 = (String)attributes.get("XCG2148");

		if (XCG2148 != null) {
			setXCG2148(XCG2148);
		}

		String XCG2248 = (String)attributes.get("XCG2248");

		if (XCG2248 != null) {
			setXCG2248(XCG2248);
		}

		String XCG0149 = (String)attributes.get("XCG0149");

		if (XCG0149 != null) {
			setXCG0149(XCG0149);
		}

		String XCG2149 = (String)attributes.get("XCG2149");

		if (XCG2149 != null) {
			setXCG2149(XCG2149);
		}

		String XCG2249 = (String)attributes.get("XCG2249");

		if (XCG2249 != null) {
			setXCG2249(XCG2249);
		}

		String XCG0150 = (String)attributes.get("XCG0150");

		if (XCG0150 != null) {
			setXCG0150(XCG0150);
		}

		String XCG2150 = (String)attributes.get("XCG2150");

		if (XCG2150 != null) {
			setXCG2150(XCG2150);
		}

		String XCG2250 = (String)attributes.get("XCG2250");

		if (XCG2250 != null) {
			setXCG2250(XCG2250);
		}

		String XCG0151 = (String)attributes.get("XCG0151");

		if (XCG0151 != null) {
			setXCG0151(XCG0151);
		}

		String XCG2151 = (String)attributes.get("XCG2151");

		if (XCG2151 != null) {
			setXCG2151(XCG2151);
		}

		String XCG2251 = (String)attributes.get("XCG2251");

		if (XCG2251 != null) {
			setXCG2251(XCG2251);
		}

		String XCG0152 = (String)attributes.get("XCG0152");

		if (XCG0152 != null) {
			setXCG0152(XCG0152);
		}

		String XCG2152 = (String)attributes.get("XCG2152");

		if (XCG2152 != null) {
			setXCG2152(XCG2152);
		}

		String XCG2252 = (String)attributes.get("XCG2252");

		if (XCG2252 != null) {
			setXCG2252(XCG2252);
		}

		String XCG0153 = (String)attributes.get("XCG0153");

		if (XCG0153 != null) {
			setXCG0153(XCG0153);
		}

		String XCG2153 = (String)attributes.get("XCG2153");

		if (XCG2153 != null) {
			setXCG2153(XCG2153);
		}

		String XCG2253 = (String)attributes.get("XCG2253");

		if (XCG2253 != null) {
			setXCG2253(XCG2253);
		}

		String XCG0154 = (String)attributes.get("XCG0154");

		if (XCG0154 != null) {
			setXCG0154(XCG0154);
		}

		String XCG2154 = (String)attributes.get("XCG2154");

		if (XCG2154 != null) {
			setXCG2154(XCG2154);
		}

		String XCG2254 = (String)attributes.get("XCG2254");

		if (XCG2254 != null) {
			setXCG2254(XCG2254);
		}

		String XCG0155 = (String)attributes.get("XCG0155");

		if (XCG0155 != null) {
			setXCG0155(XCG0155);
		}

		String XCG0156 = (String)attributes.get("XCG0156");

		if (XCG0156 != null) {
			setXCG0156(XCG0156);
		}

		String XCG0242 = (String)attributes.get("XCG0242");

		if (XCG0242 != null) {
			setXCG0242(XCG0242);
		}

		String XCG0157 = (String)attributes.get("XCG0157");

		if (XCG0157 != null) {
			setXCG0157(XCG0157);
		}

		String XCG0158 = (String)attributes.get("XCG0158");

		if (XCG0158 != null) {
			setXCG0158(XCG0158);
		}

		String XCG0159 = (String)attributes.get("XCG0159");

		if (XCG0159 != null) {
			setXCG0159(XCG0159);
		}

		String XCG0160 = (String)attributes.get("XCG0160");

		if (XCG0160 != null) {
			setXCG0160(XCG0160);
		}

		String XCG0243 = (String)attributes.get("XCG0243");

		if (XCG0243 != null) {
			setXCG0243(XCG0243);
		}

		String XCG0161 = (String)attributes.get("XCG0161");

		if (XCG0161 != null) {
			setXCG0161(XCG0161);
		}

		String XCG0162 = (String)attributes.get("XCG0162");

		if (XCG0162 != null) {
			setXCG0162(XCG0162);
		}

		String XCG0163 = (String)attributes.get("XCG0163");

		if (XCG0163 != null) {
			setXCG0163(XCG0163);
		}

		String XCG0164 = (String)attributes.get("XCG0164");

		if (XCG0164 != null) {
			setXCG0164(XCG0164);
		}

		String XCG0244 = (String)attributes.get("XCG0244");

		if (XCG0244 != null) {
			setXCG0244(XCG0244);
		}

		String XCG0165 = (String)attributes.get("XCG0165");

		if (XCG0165 != null) {
			setXCG0165(XCG0165);
		}

		String XCG0166 = (String)attributes.get("XCG0166");

		if (XCG0166 != null) {
			setXCG0166(XCG0166);
		}

		String XCG0167 = (String)attributes.get("XCG0167");

		if (XCG0167 != null) {
			setXCG0167(XCG0167);
		}

		String XCG0168 = (String)attributes.get("XCG0168");

		if (XCG0168 != null) {
			setXCG0168(XCG0168);
		}

		String XCG0245 = (String)attributes.get("XCG0245");

		if (XCG0245 != null) {
			setXCG0245(XCG0245);
		}

		String XCG0169 = (String)attributes.get("XCG0169");

		if (XCG0169 != null) {
			setXCG0169(XCG0169);
		}

		String XCG0170 = (String)attributes.get("XCG0170");

		if (XCG0170 != null) {
			setXCG0170(XCG0170);
		}

		String XCG0171 = (String)attributes.get("XCG0171");

		if (XCG0171 != null) {
			setXCG0171(XCG0171);
		}

		String XCG0172 = (String)attributes.get("XCG0172");

		if (XCG0172 != null) {
			setXCG0172(XCG0172);
		}

		String XCG0246 = (String)attributes.get("XCG0246");

		if (XCG0246 != null) {
			setXCG0246(XCG0246);
		}

		String XCG0173 = (String)attributes.get("XCG0173");

		if (XCG0173 != null) {
			setXCG0173(XCG0173);
		}

		String XCG0174 = (String)attributes.get("XCG0174");

		if (XCG0174 != null) {
			setXCG0174(XCG0174);
		}

		String XCG0175 = (String)attributes.get("XCG0175");

		if (XCG0175 != null) {
			setXCG0175(XCG0175);
		}

		String XCG0176 = (String)attributes.get("XCG0176");

		if (XCG0176 != null) {
			setXCG0176(XCG0176);
		}

		String XCG0247 = (String)attributes.get("XCG0247");

		if (XCG0247 != null) {
			setXCG0247(XCG0247);
		}

		String XCG0177 = (String)attributes.get("XCG0177");

		if (XCG0177 != null) {
			setXCG0177(XCG0177);
		}

		String XCG0178 = (String)attributes.get("XCG0178");

		if (XCG0178 != null) {
			setXCG0178(XCG0178);
		}

		String XCG0179 = (String)attributes.get("XCG0179");

		if (XCG0179 != null) {
			setXCG0179(XCG0179);
		}

		String XCG0180 = (String)attributes.get("XCG0180");

		if (XCG0180 != null) {
			setXCG0180(XCG0180);
		}

		String XCG0248 = (String)attributes.get("XCG0248");

		if (XCG0248 != null) {
			setXCG0248(XCG0248);
		}

		String XCG0181 = (String)attributes.get("XCG0181");

		if (XCG0181 != null) {
			setXCG0181(XCG0181);
		}

		String XCG0182 = (String)attributes.get("XCG0182");

		if (XCG0182 != null) {
			setXCG0182(XCG0182);
		}

		String XCG0183 = (String)attributes.get("XCG0183");

		if (XCG0183 != null) {
			setXCG0183(XCG0183);
		}

		String XCG0184 = (String)attributes.get("XCG0184");

		if (XCG0184 != null) {
			setXCG0184(XCG0184);
		}

		String XCG0249 = (String)attributes.get("XCG0249");

		if (XCG0249 != null) {
			setXCG0249(XCG0249);
		}

		String XCG0185 = (String)attributes.get("XCG0185");

		if (XCG0185 != null) {
			setXCG0185(XCG0185);
		}

		String XCG0186 = (String)attributes.get("XCG0186");

		if (XCG0186 != null) {
			setXCG0186(XCG0186);
		}

		String XCG0187 = (String)attributes.get("XCG0187");

		if (XCG0187 != null) {
			setXCG0187(XCG0187);
		}

		String XCG0188 = (String)attributes.get("XCG0188");

		if (XCG0188 != null) {
			setXCG0188(XCG0188);
		}

		String XCG0250 = (String)attributes.get("XCG0250");

		if (XCG0250 != null) {
			setXCG0250(XCG0250);
		}

		String XCG0189 = (String)attributes.get("XCG0189");

		if (XCG0189 != null) {
			setXCG0189(XCG0189);
		}

		String XCG0190 = (String)attributes.get("XCG0190");

		if (XCG0190 != null) {
			setXCG0190(XCG0190);
		}

		String XCG0191 = (String)attributes.get("XCG0191");

		if (XCG0191 != null) {
			setXCG0191(XCG0191);
		}

		String XCG0192 = (String)attributes.get("XCG0192");

		if (XCG0192 != null) {
			setXCG0192(XCG0192);
		}

		String XCG0251 = (String)attributes.get("XCG0251");

		if (XCG0251 != null) {
			setXCG0251(XCG0251);
		}

		String XCG0193 = (String)attributes.get("XCG0193");

		if (XCG0193 != null) {
			setXCG0193(XCG0193);
		}

		String XCG0194 = (String)attributes.get("XCG0194");

		if (XCG0194 != null) {
			setXCG0194(XCG0194);
		}

		String XCG0195 = (String)attributes.get("XCG0195");

		if (XCG0195 != null) {
			setXCG0195(XCG0195);
		}

		String XCG0196 = (String)attributes.get("XCG0196");

		if (XCG0196 != null) {
			setXCG0196(XCG0196);
		}

		String XCG0197 = (String)attributes.get("XCG0197");

		if (XCG0197 != null) {
			setXCG0197(XCG0197);
		}

		String XCG0198 = (String)attributes.get("XCG0198");

		if (XCG0198 != null) {
			setXCG0198(XCG0198);
		}

		String XCG0199 = (String)attributes.get("XCG0199");

		if (XCG0199 != null) {
			setXCG0199(XCG0199);
		}

		String XCG0200 = (String)attributes.get("XCG0200");

		if (XCG0200 != null) {
			setXCG0200(XCG0200);
		}

		String XCG0201 = (String)attributes.get("XCG0201");

		if (XCG0201 != null) {
			setXCG0201(XCG0201);
		}

		String XCG0202 = (String)attributes.get("XCG0202");

		if (XCG0202 != null) {
			setXCG0202(XCG0202);
		}

		String XCG0203 = (String)attributes.get("XCG0203");

		if (XCG0203 != null) {
			setXCG0203(XCG0203);
		}

		String XCG0204 = (String)attributes.get("XCG0204");

		if (XCG0204 != null) {
			setXCG0204(XCG0204);
		}

		String XCG0205 = (String)attributes.get("XCG0205");

		if (XCG0205 != null) {
			setXCG0205(XCG0205);
		}

		String XCG0206 = (String)attributes.get("XCG0206");

		if (XCG0206 != null) {
			setXCG0206(XCG0206);
		}

		String XCG0207 = (String)attributes.get("XCG0207");

		if (XCG0207 != null) {
			setXCG0207(XCG0207);
		}

		String XCG0208 = (String)attributes.get("XCG0208");

		if (XCG0208 != null) {
			setXCG0208(XCG0208);
		}

		String XCG0209 = (String)attributes.get("XCG0209");

		if (XCG0209 != null) {
			setXCG0209(XCG0209);
		}

		String XCG0210 = (String)attributes.get("XCG0210");

		if (XCG0210 != null) {
			setXCG0210(XCG0210);
		}

		String XCG0211 = (String)attributes.get("XCG0211");

		if (XCG0211 != null) {
			setXCG0211(XCG0211);
		}

		String XCG0212 = (String)attributes.get("XCG0212");

		if (XCG0212 != null) {
			setXCG0212(XCG0212);
		}

		String XCG0213 = (String)attributes.get("XCG0213");

		if (XCG0213 != null) {
			setXCG0213(XCG0213);
		}

		String XCG0214 = (String)attributes.get("XCG0214");

		if (XCG0214 != null) {
			setXCG0214(XCG0214);
		}

		String XCG0215 = (String)attributes.get("XCG0215");

		if (XCG0215 != null) {
			setXCG0215(XCG0215);
		}

		String XCG0216 = (String)attributes.get("XCG0216");

		if (XCG0216 != null) {
			setXCG0216(XCG0216);
		}

		String XCG0217 = (String)attributes.get("XCG0217");

		if (XCG0217 != null) {
			setXCG0217(XCG0217);
		}

		String XCG0218 = (String)attributes.get("XCG0218");

		if (XCG0218 != null) {
			setXCG0218(XCG0218);
		}

		String XCG0219 = (String)attributes.get("XCG0219");

		if (XCG0219 != null) {
			setXCG0219(XCG0219);
		}

		String XCG2218 = (String)attributes.get("XCG2218");

		if (XCG2218 != null) {
			setXCG2218(XCG2218);
		}

		String XCG2219 = (String)attributes.get("XCG2219");

		if (XCG2219 != null) {
			setXCG2219(XCG2219);
		}

		String XCG0220 = (String)attributes.get("XCG0220");

		if (XCG0220 != null) {
			setXCG0220(XCG0220);
		}

		String XCG2220 = (String)attributes.get("XCG2220");

		if (XCG2220 != null) {
			setXCG2220(XCG2220);
		}

		String XCG0221 = (String)attributes.get("XCG0221");

		if (XCG0221 != null) {
			setXCG0221(XCG0221);
		}

		String XCG2221 = (String)attributes.get("XCG2221");

		if (XCG2221 != null) {
			setXCG2221(XCG2221);
		}

		String XCG0222 = (String)attributes.get("XCG0222");

		if (XCG0222 != null) {
			setXCG0222(XCG0222);
		}

		String XCG2222 = (String)attributes.get("XCG2222");

		if (XCG2222 != null) {
			setXCG2222(XCG2222);
		}

		String XCG0223 = (String)attributes.get("XCG0223");

		if (XCG0223 != null) {
			setXCG0223(XCG0223);
		}

		String XCG2223 = (String)attributes.get("XCG2223");

		if (XCG2223 != null) {
			setXCG2223(XCG2223);
		}

		String XCG0224 = (String)attributes.get("XCG0224");

		if (XCG0224 != null) {
			setXCG0224(XCG0224);
		}

		String XCG2224 = (String)attributes.get("XCG2224");

		if (XCG2224 != null) {
			setXCG2224(XCG2224);
		}

		String XCG0225 = (String)attributes.get("XCG0225");

		if (XCG0225 != null) {
			setXCG0225(XCG0225);
		}

		String XCG2225 = (String)attributes.get("XCG2225");

		if (XCG2225 != null) {
			setXCG2225(XCG2225);
		}

		String XCG0226 = (String)attributes.get("XCG0226");

		if (XCG0226 != null) {
			setXCG0226(XCG0226);
		}

		String XCG2226 = (String)attributes.get("XCG2226");

		if (XCG2226 != null) {
			setXCG2226(XCG2226);
		}

		String XCG0227 = (String)attributes.get("XCG0227");

		if (XCG0227 != null) {
			setXCG0227(XCG0227);
		}

		String XCG2227 = (String)attributes.get("XCG2227");

		if (XCG2227 != null) {
			setXCG2227(XCG2227);
		}

		String XCG0228 = (String)attributes.get("XCG0228");

		if (XCG0228 != null) {
			setXCG0228(XCG0228);
		}

		String XCG2228 = (String)attributes.get("XCG2228");

		if (XCG2228 != null) {
			setXCG2228(XCG2228);
		}

		String XCG0229 = (String)attributes.get("XCG0229");

		if (XCG0229 != null) {
			setXCG0229(XCG0229);
		}

		String XCG2229 = (String)attributes.get("XCG2229");

		if (XCG2229 != null) {
			setXCG2229(XCG2229);
		}

		String XCG0230 = (String)attributes.get("XCG0230");

		if (XCG0230 != null) {
			setXCG0230(XCG0230);
		}

		String XCG2230 = (String)attributes.get("XCG2230");

		if (XCG2230 != null) {
			setXCG2230(XCG2230);
		}

		String XCG0231 = (String)attributes.get("XCG0231");

		if (XCG0231 != null) {
			setXCG0231(XCG0231);
		}

		String XCG2231 = (String)attributes.get("XCG2231");

		if (XCG2231 != null) {
			setXCG2231(XCG2231);
		}

		String XCG0232 = (String)attributes.get("XCG0232");

		if (XCG0232 != null) {
			setXCG0232(XCG0232);
		}

		String XCG2232 = (String)attributes.get("XCG2232");

		if (XCG2232 != null) {
			setXCG2232(XCG2232);
		}

		String XCG0233 = (String)attributes.get("XCG0233");

		if (XCG0233 != null) {
			setXCG0233(XCG0233);
		}

		String XCG2233 = (String)attributes.get("XCG2233");

		if (XCG2233 != null) {
			setXCG2233(XCG2233);
		}

		String XCG0234 = (String)attributes.get("XCG0234");

		if (XCG0234 != null) {
			setXCG0234(XCG0234);
		}

		String XCG0235 = (String)attributes.get("XCG0235");

		if (XCG0235 != null) {
			setXCG0235(XCG0235);
		}

		String XCG2235 = (String)attributes.get("XCG2235");

		if (XCG2235 != null) {
			setXCG2235(XCG2235);
		}

		String XCG0236 = (String)attributes.get("XCG0236");

		if (XCG0236 != null) {
			setXCG0236(XCG0236);
		}

		String XCG0237 = (String)attributes.get("XCG0237");

		if (XCG0237 != null) {
			setXCG0237(XCG0237);
		}
	}

	/**
	* Returns the primary key of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the primary key of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public long getPrimaryKey() {
		return _thongsochungchixecogioiphan2.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongsochungchixecogioiphan2.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public long getId() {
		return _thongsochungchixecogioiphan2.getId();
	}

	/**
	* Sets the ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param id the ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setId(long id) {
		_thongsochungchixecogioiphan2.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public long getHoSoThuTucId() {
		return _thongsochungchixecogioiphan2.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_thongsochungchixecogioiphan2.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public long getCertificateRecordId() {
		return _thongsochungchixecogioiphan2.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_thongsochungchixecogioiphan2.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public long getVehicleGroupId() {
		return _thongsochungchixecogioiphan2.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_thongsochungchixecogioiphan2.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the synch date of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the synch date of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _thongsochungchixecogioiphan2.getSynchDate();
	}

	/**
	* Sets the synch date of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_thongsochungchixecogioiphan2.setSynchDate(SynchDate);
	}

	/**
	* Returns the x c g0129 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0129 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0129() {
		return _thongsochungchixecogioiphan2.getXCG0129();
	}

	/**
	* Sets the x c g0129 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0129 the x c g0129 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0129(java.lang.String XCG0129) {
		_thongsochungchixecogioiphan2.setXCG0129(XCG0129);
	}

	/**
	* Returns the x c g0130 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0130 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0130() {
		return _thongsochungchixecogioiphan2.getXCG0130();
	}

	/**
	* Sets the x c g0130 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0130 the x c g0130 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0130(java.lang.String XCG0130) {
		_thongsochungchixecogioiphan2.setXCG0130(XCG0130);
	}

	/**
	* Returns the x c g0131 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0131 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0131() {
		return _thongsochungchixecogioiphan2.getXCG0131();
	}

	/**
	* Sets the x c g0131 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0131 the x c g0131 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0131(java.lang.String XCG0131) {
		_thongsochungchixecogioiphan2.setXCG0131(XCG0131);
	}

	/**
	* Returns the x c g0132 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0132 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0132() {
		return _thongsochungchixecogioiphan2.getXCG0132();
	}

	/**
	* Sets the x c g0132 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0132 the x c g0132 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0132(java.lang.String XCG0132) {
		_thongsochungchixecogioiphan2.setXCG0132(XCG0132);
	}

	/**
	* Returns the x c g0133 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0133 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0133() {
		return _thongsochungchixecogioiphan2.getXCG0133();
	}

	/**
	* Sets the x c g0133 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0133 the x c g0133 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0133(java.lang.String XCG0133) {
		_thongsochungchixecogioiphan2.setXCG0133(XCG0133);
	}

	/**
	* Returns the x c g0134 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0134 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0134() {
		return _thongsochungchixecogioiphan2.getXCG0134();
	}

	/**
	* Sets the x c g0134 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0134 the x c g0134 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0134(java.lang.String XCG0134) {
		_thongsochungchixecogioiphan2.setXCG0134(XCG0134);
	}

	/**
	* Returns the x c g0135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0135() {
		return _thongsochungchixecogioiphan2.getXCG0135();
	}

	/**
	* Sets the x c g0135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0135 the x c g0135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0135(java.lang.String XCG0135) {
		_thongsochungchixecogioiphan2.setXCG0135(XCG0135);
	}

	/**
	* Returns the x c g2135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2135() {
		return _thongsochungchixecogioiphan2.getXCG2135();
	}

	/**
	* Sets the x c g2135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2135 the x c g2135 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2135(java.lang.String XCG2135) {
		_thongsochungchixecogioiphan2.setXCG2135(XCG2135);
	}

	/**
	* Returns the x c g0136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0136() {
		return _thongsochungchixecogioiphan2.getXCG0136();
	}

	/**
	* Sets the x c g0136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0136 the x c g0136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0136(java.lang.String XCG0136) {
		_thongsochungchixecogioiphan2.setXCG0136(XCG0136);
	}

	/**
	* Returns the x c g2136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2136() {
		return _thongsochungchixecogioiphan2.getXCG2136();
	}

	/**
	* Sets the x c g2136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2136 the x c g2136 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2136(java.lang.String XCG2136) {
		_thongsochungchixecogioiphan2.setXCG2136(XCG2136);
	}

	/**
	* Returns the x c g0137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0137() {
		return _thongsochungchixecogioiphan2.getXCG0137();
	}

	/**
	* Sets the x c g0137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0137 the x c g0137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0137(java.lang.String XCG0137) {
		_thongsochungchixecogioiphan2.setXCG0137(XCG0137);
	}

	/**
	* Returns the x c g2137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2137() {
		return _thongsochungchixecogioiphan2.getXCG2137();
	}

	/**
	* Sets the x c g2137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2137 the x c g2137 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2137(java.lang.String XCG2137) {
		_thongsochungchixecogioiphan2.setXCG2137(XCG2137);
	}

	/**
	* Returns the x c g0138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0138() {
		return _thongsochungchixecogioiphan2.getXCG0138();
	}

	/**
	* Sets the x c g0138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0138 the x c g0138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0138(java.lang.String XCG0138) {
		_thongsochungchixecogioiphan2.setXCG0138(XCG0138);
	}

	/**
	* Returns the x c g2138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2138() {
		return _thongsochungchixecogioiphan2.getXCG2138();
	}

	/**
	* Sets the x c g2138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2138 the x c g2138 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2138(java.lang.String XCG2138) {
		_thongsochungchixecogioiphan2.setXCG2138(XCG2138);
	}

	/**
	* Returns the x c g0139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0139() {
		return _thongsochungchixecogioiphan2.getXCG0139();
	}

	/**
	* Sets the x c g0139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0139 the x c g0139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0139(java.lang.String XCG0139) {
		_thongsochungchixecogioiphan2.setXCG0139(XCG0139);
	}

	/**
	* Returns the x c g2139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2139() {
		return _thongsochungchixecogioiphan2.getXCG2139();
	}

	/**
	* Sets the x c g2139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2139 the x c g2139 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2139(java.lang.String XCG2139) {
		_thongsochungchixecogioiphan2.setXCG2139(XCG2139);
	}

	/**
	* Returns the x c g0140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0140() {
		return _thongsochungchixecogioiphan2.getXCG0140();
	}

	/**
	* Sets the x c g0140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0140 the x c g0140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0140(java.lang.String XCG0140) {
		_thongsochungchixecogioiphan2.setXCG0140(XCG0140);
	}

	/**
	* Returns the x c g2140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2140() {
		return _thongsochungchixecogioiphan2.getXCG2140();
	}

	/**
	* Sets the x c g2140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2140 the x c g2140 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2140(java.lang.String XCG2140) {
		_thongsochungchixecogioiphan2.setXCG2140(XCG2140);
	}

	/**
	* Returns the x c g0141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0141() {
		return _thongsochungchixecogioiphan2.getXCG0141();
	}

	/**
	* Sets the x c g0141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0141 the x c g0141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0141(java.lang.String XCG0141) {
		_thongsochungchixecogioiphan2.setXCG0141(XCG0141);
	}

	/**
	* Returns the x c g2141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2141() {
		return _thongsochungchixecogioiphan2.getXCG2141();
	}

	/**
	* Sets the x c g2141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2141 the x c g2141 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2141(java.lang.String XCG2141) {
		_thongsochungchixecogioiphan2.setXCG2141(XCG2141);
	}

	/**
	* Returns the x c g0142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0142() {
		return _thongsochungchixecogioiphan2.getXCG0142();
	}

	/**
	* Sets the x c g0142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0142 the x c g0142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0142(java.lang.String XCG0142) {
		_thongsochungchixecogioiphan2.setXCG0142(XCG0142);
	}

	/**
	* Returns the x c g2142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2142() {
		return _thongsochungchixecogioiphan2.getXCG2142();
	}

	/**
	* Sets the x c g2142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2142 the x c g2142 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2142(java.lang.String XCG2142) {
		_thongsochungchixecogioiphan2.setXCG2142(XCG2142);
	}

	/**
	* Returns the x c g0143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0143() {
		return _thongsochungchixecogioiphan2.getXCG0143();
	}

	/**
	* Sets the x c g0143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0143 the x c g0143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0143(java.lang.String XCG0143) {
		_thongsochungchixecogioiphan2.setXCG0143(XCG0143);
	}

	/**
	* Returns the x c g2143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2143() {
		return _thongsochungchixecogioiphan2.getXCG2143();
	}

	/**
	* Sets the x c g2143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2143 the x c g2143 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2143(java.lang.String XCG2143) {
		_thongsochungchixecogioiphan2.setXCG2143(XCG2143);
	}

	/**
	* Returns the x c g0144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0144() {
		return _thongsochungchixecogioiphan2.getXCG0144();
	}

	/**
	* Sets the x c g0144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0144 the x c g0144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0144(java.lang.String XCG0144) {
		_thongsochungchixecogioiphan2.setXCG0144(XCG0144);
	}

	/**
	* Returns the x c g2144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2144() {
		return _thongsochungchixecogioiphan2.getXCG2144();
	}

	/**
	* Sets the x c g2144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2144 the x c g2144 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2144(java.lang.String XCG2144) {
		_thongsochungchixecogioiphan2.setXCG2144(XCG2144);
	}

	/**
	* Returns the x c g0145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0145() {
		return _thongsochungchixecogioiphan2.getXCG0145();
	}

	/**
	* Sets the x c g0145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0145 the x c g0145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0145(java.lang.String XCG0145) {
		_thongsochungchixecogioiphan2.setXCG0145(XCG0145);
	}

	/**
	* Returns the x c g2145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2145() {
		return _thongsochungchixecogioiphan2.getXCG2145();
	}

	/**
	* Sets the x c g2145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2145 the x c g2145 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2145(java.lang.String XCG2145) {
		_thongsochungchixecogioiphan2.setXCG2145(XCG2145);
	}

	/**
	* Returns the x c g2245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2245() {
		return _thongsochungchixecogioiphan2.getXCG2245();
	}

	/**
	* Sets the x c g2245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2245 the x c g2245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2245(java.lang.String XCG2245) {
		_thongsochungchixecogioiphan2.setXCG2245(XCG2245);
	}

	/**
	* Returns the x c g0146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0146() {
		return _thongsochungchixecogioiphan2.getXCG0146();
	}

	/**
	* Sets the x c g0146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0146 the x c g0146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0146(java.lang.String XCG0146) {
		_thongsochungchixecogioiphan2.setXCG0146(XCG0146);
	}

	/**
	* Returns the x c g2146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2146() {
		return _thongsochungchixecogioiphan2.getXCG2146();
	}

	/**
	* Sets the x c g2146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2146 the x c g2146 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2146(java.lang.String XCG2146) {
		_thongsochungchixecogioiphan2.setXCG2146(XCG2146);
	}

	/**
	* Returns the x c g2246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2246() {
		return _thongsochungchixecogioiphan2.getXCG2246();
	}

	/**
	* Sets the x c g2246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2246 the x c g2246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2246(java.lang.String XCG2246) {
		_thongsochungchixecogioiphan2.setXCG2246(XCG2246);
	}

	/**
	* Returns the x c g0147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0147() {
		return _thongsochungchixecogioiphan2.getXCG0147();
	}

	/**
	* Sets the x c g0147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0147 the x c g0147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0147(java.lang.String XCG0147) {
		_thongsochungchixecogioiphan2.setXCG0147(XCG0147);
	}

	/**
	* Returns the x c g2147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2147() {
		return _thongsochungchixecogioiphan2.getXCG2147();
	}

	/**
	* Sets the x c g2147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2147 the x c g2147 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2147(java.lang.String XCG2147) {
		_thongsochungchixecogioiphan2.setXCG2147(XCG2147);
	}

	/**
	* Returns the x c g2247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2247() {
		return _thongsochungchixecogioiphan2.getXCG2247();
	}

	/**
	* Sets the x c g2247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2247 the x c g2247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2247(java.lang.String XCG2247) {
		_thongsochungchixecogioiphan2.setXCG2247(XCG2247);
	}

	/**
	* Returns the x c g0148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0148() {
		return _thongsochungchixecogioiphan2.getXCG0148();
	}

	/**
	* Sets the x c g0148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0148 the x c g0148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0148(java.lang.String XCG0148) {
		_thongsochungchixecogioiphan2.setXCG0148(XCG0148);
	}

	/**
	* Returns the x c g2148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2148() {
		return _thongsochungchixecogioiphan2.getXCG2148();
	}

	/**
	* Sets the x c g2148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2148 the x c g2148 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2148(java.lang.String XCG2148) {
		_thongsochungchixecogioiphan2.setXCG2148(XCG2148);
	}

	/**
	* Returns the x c g2248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2248() {
		return _thongsochungchixecogioiphan2.getXCG2248();
	}

	/**
	* Sets the x c g2248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2248 the x c g2248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2248(java.lang.String XCG2248) {
		_thongsochungchixecogioiphan2.setXCG2248(XCG2248);
	}

	/**
	* Returns the x c g0149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0149() {
		return _thongsochungchixecogioiphan2.getXCG0149();
	}

	/**
	* Sets the x c g0149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0149 the x c g0149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0149(java.lang.String XCG0149) {
		_thongsochungchixecogioiphan2.setXCG0149(XCG0149);
	}

	/**
	* Returns the x c g2149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2149() {
		return _thongsochungchixecogioiphan2.getXCG2149();
	}

	/**
	* Sets the x c g2149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2149 the x c g2149 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2149(java.lang.String XCG2149) {
		_thongsochungchixecogioiphan2.setXCG2149(XCG2149);
	}

	/**
	* Returns the x c g2249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2249() {
		return _thongsochungchixecogioiphan2.getXCG2249();
	}

	/**
	* Sets the x c g2249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2249 the x c g2249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2249(java.lang.String XCG2249) {
		_thongsochungchixecogioiphan2.setXCG2249(XCG2249);
	}

	/**
	* Returns the x c g0150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0150() {
		return _thongsochungchixecogioiphan2.getXCG0150();
	}

	/**
	* Sets the x c g0150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0150 the x c g0150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0150(java.lang.String XCG0150) {
		_thongsochungchixecogioiphan2.setXCG0150(XCG0150);
	}

	/**
	* Returns the x c g2150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2150() {
		return _thongsochungchixecogioiphan2.getXCG2150();
	}

	/**
	* Sets the x c g2150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2150 the x c g2150 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2150(java.lang.String XCG2150) {
		_thongsochungchixecogioiphan2.setXCG2150(XCG2150);
	}

	/**
	* Returns the x c g2250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2250() {
		return _thongsochungchixecogioiphan2.getXCG2250();
	}

	/**
	* Sets the x c g2250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2250 the x c g2250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2250(java.lang.String XCG2250) {
		_thongsochungchixecogioiphan2.setXCG2250(XCG2250);
	}

	/**
	* Returns the x c g0151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0151() {
		return _thongsochungchixecogioiphan2.getXCG0151();
	}

	/**
	* Sets the x c g0151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0151 the x c g0151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0151(java.lang.String XCG0151) {
		_thongsochungchixecogioiphan2.setXCG0151(XCG0151);
	}

	/**
	* Returns the x c g2151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2151() {
		return _thongsochungchixecogioiphan2.getXCG2151();
	}

	/**
	* Sets the x c g2151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2151 the x c g2151 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2151(java.lang.String XCG2151) {
		_thongsochungchixecogioiphan2.setXCG2151(XCG2151);
	}

	/**
	* Returns the x c g2251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2251() {
		return _thongsochungchixecogioiphan2.getXCG2251();
	}

	/**
	* Sets the x c g2251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2251 the x c g2251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2251(java.lang.String XCG2251) {
		_thongsochungchixecogioiphan2.setXCG2251(XCG2251);
	}

	/**
	* Returns the x c g0152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0152() {
		return _thongsochungchixecogioiphan2.getXCG0152();
	}

	/**
	* Sets the x c g0152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0152 the x c g0152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0152(java.lang.String XCG0152) {
		_thongsochungchixecogioiphan2.setXCG0152(XCG0152);
	}

	/**
	* Returns the x c g2152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2152() {
		return _thongsochungchixecogioiphan2.getXCG2152();
	}

	/**
	* Sets the x c g2152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2152 the x c g2152 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2152(java.lang.String XCG2152) {
		_thongsochungchixecogioiphan2.setXCG2152(XCG2152);
	}

	/**
	* Returns the x c g2252 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2252 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2252() {
		return _thongsochungchixecogioiphan2.getXCG2252();
	}

	/**
	* Sets the x c g2252 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2252 the x c g2252 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2252(java.lang.String XCG2252) {
		_thongsochungchixecogioiphan2.setXCG2252(XCG2252);
	}

	/**
	* Returns the x c g0153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0153() {
		return _thongsochungchixecogioiphan2.getXCG0153();
	}

	/**
	* Sets the x c g0153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0153 the x c g0153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0153(java.lang.String XCG0153) {
		_thongsochungchixecogioiphan2.setXCG0153(XCG0153);
	}

	/**
	* Returns the x c g2153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2153() {
		return _thongsochungchixecogioiphan2.getXCG2153();
	}

	/**
	* Sets the x c g2153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2153 the x c g2153 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2153(java.lang.String XCG2153) {
		_thongsochungchixecogioiphan2.setXCG2153(XCG2153);
	}

	/**
	* Returns the x c g2253 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2253 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2253() {
		return _thongsochungchixecogioiphan2.getXCG2253();
	}

	/**
	* Sets the x c g2253 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2253 the x c g2253 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2253(java.lang.String XCG2253) {
		_thongsochungchixecogioiphan2.setXCG2253(XCG2253);
	}

	/**
	* Returns the x c g0154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0154() {
		return _thongsochungchixecogioiphan2.getXCG0154();
	}

	/**
	* Sets the x c g0154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0154 the x c g0154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0154(java.lang.String XCG0154) {
		_thongsochungchixecogioiphan2.setXCG0154(XCG0154);
	}

	/**
	* Returns the x c g2154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2154() {
		return _thongsochungchixecogioiphan2.getXCG2154();
	}

	/**
	* Sets the x c g2154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2154 the x c g2154 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2154(java.lang.String XCG2154) {
		_thongsochungchixecogioiphan2.setXCG2154(XCG2154);
	}

	/**
	* Returns the x c g2254 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2254 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2254() {
		return _thongsochungchixecogioiphan2.getXCG2254();
	}

	/**
	* Sets the x c g2254 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2254 the x c g2254 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2254(java.lang.String XCG2254) {
		_thongsochungchixecogioiphan2.setXCG2254(XCG2254);
	}

	/**
	* Returns the x c g0155 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0155 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0155() {
		return _thongsochungchixecogioiphan2.getXCG0155();
	}

	/**
	* Sets the x c g0155 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0155 the x c g0155 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0155(java.lang.String XCG0155) {
		_thongsochungchixecogioiphan2.setXCG0155(XCG0155);
	}

	/**
	* Returns the x c g0156 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0156 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0156() {
		return _thongsochungchixecogioiphan2.getXCG0156();
	}

	/**
	* Sets the x c g0156 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0156 the x c g0156 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0156(java.lang.String XCG0156) {
		_thongsochungchixecogioiphan2.setXCG0156(XCG0156);
	}

	/**
	* Returns the x c g0242 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0242 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0242() {
		return _thongsochungchixecogioiphan2.getXCG0242();
	}

	/**
	* Sets the x c g0242 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0242 the x c g0242 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0242(java.lang.String XCG0242) {
		_thongsochungchixecogioiphan2.setXCG0242(XCG0242);
	}

	/**
	* Returns the x c g0157 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0157 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0157() {
		return _thongsochungchixecogioiphan2.getXCG0157();
	}

	/**
	* Sets the x c g0157 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0157 the x c g0157 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0157(java.lang.String XCG0157) {
		_thongsochungchixecogioiphan2.setXCG0157(XCG0157);
	}

	/**
	* Returns the x c g0158 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0158 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0158() {
		return _thongsochungchixecogioiphan2.getXCG0158();
	}

	/**
	* Sets the x c g0158 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0158 the x c g0158 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0158(java.lang.String XCG0158) {
		_thongsochungchixecogioiphan2.setXCG0158(XCG0158);
	}

	/**
	* Returns the x c g0159 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0159 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0159() {
		return _thongsochungchixecogioiphan2.getXCG0159();
	}

	/**
	* Sets the x c g0159 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0159 the x c g0159 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0159(java.lang.String XCG0159) {
		_thongsochungchixecogioiphan2.setXCG0159(XCG0159);
	}

	/**
	* Returns the x c g0160 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0160 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0160() {
		return _thongsochungchixecogioiphan2.getXCG0160();
	}

	/**
	* Sets the x c g0160 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0160 the x c g0160 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0160(java.lang.String XCG0160) {
		_thongsochungchixecogioiphan2.setXCG0160(XCG0160);
	}

	/**
	* Returns the x c g0243 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0243 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0243() {
		return _thongsochungchixecogioiphan2.getXCG0243();
	}

	/**
	* Sets the x c g0243 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0243 the x c g0243 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0243(java.lang.String XCG0243) {
		_thongsochungchixecogioiphan2.setXCG0243(XCG0243);
	}

	/**
	* Returns the x c g0161 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0161 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0161() {
		return _thongsochungchixecogioiphan2.getXCG0161();
	}

	/**
	* Sets the x c g0161 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0161 the x c g0161 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0161(java.lang.String XCG0161) {
		_thongsochungchixecogioiphan2.setXCG0161(XCG0161);
	}

	/**
	* Returns the x c g0162 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0162 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0162() {
		return _thongsochungchixecogioiphan2.getXCG0162();
	}

	/**
	* Sets the x c g0162 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0162 the x c g0162 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0162(java.lang.String XCG0162) {
		_thongsochungchixecogioiphan2.setXCG0162(XCG0162);
	}

	/**
	* Returns the x c g0163 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0163 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0163() {
		return _thongsochungchixecogioiphan2.getXCG0163();
	}

	/**
	* Sets the x c g0163 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0163 the x c g0163 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0163(java.lang.String XCG0163) {
		_thongsochungchixecogioiphan2.setXCG0163(XCG0163);
	}

	/**
	* Returns the x c g0164 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0164 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0164() {
		return _thongsochungchixecogioiphan2.getXCG0164();
	}

	/**
	* Sets the x c g0164 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0164 the x c g0164 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0164(java.lang.String XCG0164) {
		_thongsochungchixecogioiphan2.setXCG0164(XCG0164);
	}

	/**
	* Returns the x c g0244 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0244 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0244() {
		return _thongsochungchixecogioiphan2.getXCG0244();
	}

	/**
	* Sets the x c g0244 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0244 the x c g0244 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0244(java.lang.String XCG0244) {
		_thongsochungchixecogioiphan2.setXCG0244(XCG0244);
	}

	/**
	* Returns the x c g0165 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0165 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0165() {
		return _thongsochungchixecogioiphan2.getXCG0165();
	}

	/**
	* Sets the x c g0165 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0165 the x c g0165 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0165(java.lang.String XCG0165) {
		_thongsochungchixecogioiphan2.setXCG0165(XCG0165);
	}

	/**
	* Returns the x c g0166 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0166 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0166() {
		return _thongsochungchixecogioiphan2.getXCG0166();
	}

	/**
	* Sets the x c g0166 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0166 the x c g0166 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0166(java.lang.String XCG0166) {
		_thongsochungchixecogioiphan2.setXCG0166(XCG0166);
	}

	/**
	* Returns the x c g0167 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0167 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0167() {
		return _thongsochungchixecogioiphan2.getXCG0167();
	}

	/**
	* Sets the x c g0167 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0167 the x c g0167 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0167(java.lang.String XCG0167) {
		_thongsochungchixecogioiphan2.setXCG0167(XCG0167);
	}

	/**
	* Returns the x c g0168 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0168 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0168() {
		return _thongsochungchixecogioiphan2.getXCG0168();
	}

	/**
	* Sets the x c g0168 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0168 the x c g0168 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0168(java.lang.String XCG0168) {
		_thongsochungchixecogioiphan2.setXCG0168(XCG0168);
	}

	/**
	* Returns the x c g0245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0245() {
		return _thongsochungchixecogioiphan2.getXCG0245();
	}

	/**
	* Sets the x c g0245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0245 the x c g0245 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0245(java.lang.String XCG0245) {
		_thongsochungchixecogioiphan2.setXCG0245(XCG0245);
	}

	/**
	* Returns the x c g0169 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0169 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0169() {
		return _thongsochungchixecogioiphan2.getXCG0169();
	}

	/**
	* Sets the x c g0169 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0169 the x c g0169 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0169(java.lang.String XCG0169) {
		_thongsochungchixecogioiphan2.setXCG0169(XCG0169);
	}

	/**
	* Returns the x c g0170 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0170 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0170() {
		return _thongsochungchixecogioiphan2.getXCG0170();
	}

	/**
	* Sets the x c g0170 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0170 the x c g0170 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0170(java.lang.String XCG0170) {
		_thongsochungchixecogioiphan2.setXCG0170(XCG0170);
	}

	/**
	* Returns the x c g0171 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0171 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0171() {
		return _thongsochungchixecogioiphan2.getXCG0171();
	}

	/**
	* Sets the x c g0171 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0171 the x c g0171 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0171(java.lang.String XCG0171) {
		_thongsochungchixecogioiphan2.setXCG0171(XCG0171);
	}

	/**
	* Returns the x c g0172 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0172 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0172() {
		return _thongsochungchixecogioiphan2.getXCG0172();
	}

	/**
	* Sets the x c g0172 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0172 the x c g0172 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0172(java.lang.String XCG0172) {
		_thongsochungchixecogioiphan2.setXCG0172(XCG0172);
	}

	/**
	* Returns the x c g0246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0246() {
		return _thongsochungchixecogioiphan2.getXCG0246();
	}

	/**
	* Sets the x c g0246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0246 the x c g0246 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0246(java.lang.String XCG0246) {
		_thongsochungchixecogioiphan2.setXCG0246(XCG0246);
	}

	/**
	* Returns the x c g0173 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0173 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0173() {
		return _thongsochungchixecogioiphan2.getXCG0173();
	}

	/**
	* Sets the x c g0173 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0173 the x c g0173 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0173(java.lang.String XCG0173) {
		_thongsochungchixecogioiphan2.setXCG0173(XCG0173);
	}

	/**
	* Returns the x c g0174 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0174 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0174() {
		return _thongsochungchixecogioiphan2.getXCG0174();
	}

	/**
	* Sets the x c g0174 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0174 the x c g0174 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0174(java.lang.String XCG0174) {
		_thongsochungchixecogioiphan2.setXCG0174(XCG0174);
	}

	/**
	* Returns the x c g0175 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0175 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0175() {
		return _thongsochungchixecogioiphan2.getXCG0175();
	}

	/**
	* Sets the x c g0175 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0175 the x c g0175 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0175(java.lang.String XCG0175) {
		_thongsochungchixecogioiphan2.setXCG0175(XCG0175);
	}

	/**
	* Returns the x c g0176 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0176 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0176() {
		return _thongsochungchixecogioiphan2.getXCG0176();
	}

	/**
	* Sets the x c g0176 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0176 the x c g0176 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0176(java.lang.String XCG0176) {
		_thongsochungchixecogioiphan2.setXCG0176(XCG0176);
	}

	/**
	* Returns the x c g0247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0247() {
		return _thongsochungchixecogioiphan2.getXCG0247();
	}

	/**
	* Sets the x c g0247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0247 the x c g0247 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0247(java.lang.String XCG0247) {
		_thongsochungchixecogioiphan2.setXCG0247(XCG0247);
	}

	/**
	* Returns the x c g0177 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0177 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0177() {
		return _thongsochungchixecogioiphan2.getXCG0177();
	}

	/**
	* Sets the x c g0177 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0177 the x c g0177 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0177(java.lang.String XCG0177) {
		_thongsochungchixecogioiphan2.setXCG0177(XCG0177);
	}

	/**
	* Returns the x c g0178 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0178 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0178() {
		return _thongsochungchixecogioiphan2.getXCG0178();
	}

	/**
	* Sets the x c g0178 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0178 the x c g0178 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0178(java.lang.String XCG0178) {
		_thongsochungchixecogioiphan2.setXCG0178(XCG0178);
	}

	/**
	* Returns the x c g0179 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0179 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0179() {
		return _thongsochungchixecogioiphan2.getXCG0179();
	}

	/**
	* Sets the x c g0179 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0179 the x c g0179 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0179(java.lang.String XCG0179) {
		_thongsochungchixecogioiphan2.setXCG0179(XCG0179);
	}

	/**
	* Returns the x c g0180 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0180 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0180() {
		return _thongsochungchixecogioiphan2.getXCG0180();
	}

	/**
	* Sets the x c g0180 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0180 the x c g0180 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0180(java.lang.String XCG0180) {
		_thongsochungchixecogioiphan2.setXCG0180(XCG0180);
	}

	/**
	* Returns the x c g0248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0248() {
		return _thongsochungchixecogioiphan2.getXCG0248();
	}

	/**
	* Sets the x c g0248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0248 the x c g0248 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0248(java.lang.String XCG0248) {
		_thongsochungchixecogioiphan2.setXCG0248(XCG0248);
	}

	/**
	* Returns the x c g0181 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0181 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0181() {
		return _thongsochungchixecogioiphan2.getXCG0181();
	}

	/**
	* Sets the x c g0181 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0181 the x c g0181 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0181(java.lang.String XCG0181) {
		_thongsochungchixecogioiphan2.setXCG0181(XCG0181);
	}

	/**
	* Returns the x c g0182 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0182 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0182() {
		return _thongsochungchixecogioiphan2.getXCG0182();
	}

	/**
	* Sets the x c g0182 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0182 the x c g0182 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0182(java.lang.String XCG0182) {
		_thongsochungchixecogioiphan2.setXCG0182(XCG0182);
	}

	/**
	* Returns the x c g0183 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0183 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0183() {
		return _thongsochungchixecogioiphan2.getXCG0183();
	}

	/**
	* Sets the x c g0183 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0183 the x c g0183 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0183(java.lang.String XCG0183) {
		_thongsochungchixecogioiphan2.setXCG0183(XCG0183);
	}

	/**
	* Returns the x c g0184 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0184 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0184() {
		return _thongsochungchixecogioiphan2.getXCG0184();
	}

	/**
	* Sets the x c g0184 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0184 the x c g0184 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0184(java.lang.String XCG0184) {
		_thongsochungchixecogioiphan2.setXCG0184(XCG0184);
	}

	/**
	* Returns the x c g0249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0249() {
		return _thongsochungchixecogioiphan2.getXCG0249();
	}

	/**
	* Sets the x c g0249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0249 the x c g0249 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0249(java.lang.String XCG0249) {
		_thongsochungchixecogioiphan2.setXCG0249(XCG0249);
	}

	/**
	* Returns the x c g0185 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0185 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0185() {
		return _thongsochungchixecogioiphan2.getXCG0185();
	}

	/**
	* Sets the x c g0185 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0185 the x c g0185 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0185(java.lang.String XCG0185) {
		_thongsochungchixecogioiphan2.setXCG0185(XCG0185);
	}

	/**
	* Returns the x c g0186 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0186 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0186() {
		return _thongsochungchixecogioiphan2.getXCG0186();
	}

	/**
	* Sets the x c g0186 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0186 the x c g0186 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0186(java.lang.String XCG0186) {
		_thongsochungchixecogioiphan2.setXCG0186(XCG0186);
	}

	/**
	* Returns the x c g0187 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0187 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0187() {
		return _thongsochungchixecogioiphan2.getXCG0187();
	}

	/**
	* Sets the x c g0187 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0187 the x c g0187 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0187(java.lang.String XCG0187) {
		_thongsochungchixecogioiphan2.setXCG0187(XCG0187);
	}

	/**
	* Returns the x c g0188 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0188 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0188() {
		return _thongsochungchixecogioiphan2.getXCG0188();
	}

	/**
	* Sets the x c g0188 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0188 the x c g0188 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0188(java.lang.String XCG0188) {
		_thongsochungchixecogioiphan2.setXCG0188(XCG0188);
	}

	/**
	* Returns the x c g0250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0250() {
		return _thongsochungchixecogioiphan2.getXCG0250();
	}

	/**
	* Sets the x c g0250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0250 the x c g0250 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0250(java.lang.String XCG0250) {
		_thongsochungchixecogioiphan2.setXCG0250(XCG0250);
	}

	/**
	* Returns the x c g0189 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0189 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0189() {
		return _thongsochungchixecogioiphan2.getXCG0189();
	}

	/**
	* Sets the x c g0189 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0189 the x c g0189 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0189(java.lang.String XCG0189) {
		_thongsochungchixecogioiphan2.setXCG0189(XCG0189);
	}

	/**
	* Returns the x c g0190 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0190 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0190() {
		return _thongsochungchixecogioiphan2.getXCG0190();
	}

	/**
	* Sets the x c g0190 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0190 the x c g0190 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0190(java.lang.String XCG0190) {
		_thongsochungchixecogioiphan2.setXCG0190(XCG0190);
	}

	/**
	* Returns the x c g0191 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0191 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0191() {
		return _thongsochungchixecogioiphan2.getXCG0191();
	}

	/**
	* Sets the x c g0191 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0191 the x c g0191 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0191(java.lang.String XCG0191) {
		_thongsochungchixecogioiphan2.setXCG0191(XCG0191);
	}

	/**
	* Returns the x c g0192 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0192 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0192() {
		return _thongsochungchixecogioiphan2.getXCG0192();
	}

	/**
	* Sets the x c g0192 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0192 the x c g0192 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0192(java.lang.String XCG0192) {
		_thongsochungchixecogioiphan2.setXCG0192(XCG0192);
	}

	/**
	* Returns the x c g0251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0251() {
		return _thongsochungchixecogioiphan2.getXCG0251();
	}

	/**
	* Sets the x c g0251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0251 the x c g0251 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0251(java.lang.String XCG0251) {
		_thongsochungchixecogioiphan2.setXCG0251(XCG0251);
	}

	/**
	* Returns the x c g0193 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0193 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0193() {
		return _thongsochungchixecogioiphan2.getXCG0193();
	}

	/**
	* Sets the x c g0193 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0193 the x c g0193 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0193(java.lang.String XCG0193) {
		_thongsochungchixecogioiphan2.setXCG0193(XCG0193);
	}

	/**
	* Returns the x c g0194 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0194 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0194() {
		return _thongsochungchixecogioiphan2.getXCG0194();
	}

	/**
	* Sets the x c g0194 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0194 the x c g0194 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0194(java.lang.String XCG0194) {
		_thongsochungchixecogioiphan2.setXCG0194(XCG0194);
	}

	/**
	* Returns the x c g0195 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0195 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0195() {
		return _thongsochungchixecogioiphan2.getXCG0195();
	}

	/**
	* Sets the x c g0195 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0195 the x c g0195 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0195(java.lang.String XCG0195) {
		_thongsochungchixecogioiphan2.setXCG0195(XCG0195);
	}

	/**
	* Returns the x c g0196 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0196 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0196() {
		return _thongsochungchixecogioiphan2.getXCG0196();
	}

	/**
	* Sets the x c g0196 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0196 the x c g0196 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0196(java.lang.String XCG0196) {
		_thongsochungchixecogioiphan2.setXCG0196(XCG0196);
	}

	/**
	* Returns the x c g0197 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0197 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0197() {
		return _thongsochungchixecogioiphan2.getXCG0197();
	}

	/**
	* Sets the x c g0197 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0197 the x c g0197 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0197(java.lang.String XCG0197) {
		_thongsochungchixecogioiphan2.setXCG0197(XCG0197);
	}

	/**
	* Returns the x c g0198 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0198 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0198() {
		return _thongsochungchixecogioiphan2.getXCG0198();
	}

	/**
	* Sets the x c g0198 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0198 the x c g0198 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0198(java.lang.String XCG0198) {
		_thongsochungchixecogioiphan2.setXCG0198(XCG0198);
	}

	/**
	* Returns the x c g0199 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0199 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0199() {
		return _thongsochungchixecogioiphan2.getXCG0199();
	}

	/**
	* Sets the x c g0199 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0199 the x c g0199 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0199(java.lang.String XCG0199) {
		_thongsochungchixecogioiphan2.setXCG0199(XCG0199);
	}

	/**
	* Returns the x c g0200 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0200 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0200() {
		return _thongsochungchixecogioiphan2.getXCG0200();
	}

	/**
	* Sets the x c g0200 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0200 the x c g0200 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0200(java.lang.String XCG0200) {
		_thongsochungchixecogioiphan2.setXCG0200(XCG0200);
	}

	/**
	* Returns the x c g0201 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0201 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0201() {
		return _thongsochungchixecogioiphan2.getXCG0201();
	}

	/**
	* Sets the x c g0201 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0201 the x c g0201 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0201(java.lang.String XCG0201) {
		_thongsochungchixecogioiphan2.setXCG0201(XCG0201);
	}

	/**
	* Returns the x c g0202 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0202 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0202() {
		return _thongsochungchixecogioiphan2.getXCG0202();
	}

	/**
	* Sets the x c g0202 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0202 the x c g0202 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0202(java.lang.String XCG0202) {
		_thongsochungchixecogioiphan2.setXCG0202(XCG0202);
	}

	/**
	* Returns the x c g0203 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0203 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0203() {
		return _thongsochungchixecogioiphan2.getXCG0203();
	}

	/**
	* Sets the x c g0203 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0203 the x c g0203 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0203(java.lang.String XCG0203) {
		_thongsochungchixecogioiphan2.setXCG0203(XCG0203);
	}

	/**
	* Returns the x c g0204 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0204 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0204() {
		return _thongsochungchixecogioiphan2.getXCG0204();
	}

	/**
	* Sets the x c g0204 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0204 the x c g0204 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0204(java.lang.String XCG0204) {
		_thongsochungchixecogioiphan2.setXCG0204(XCG0204);
	}

	/**
	* Returns the x c g0205 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0205 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0205() {
		return _thongsochungchixecogioiphan2.getXCG0205();
	}

	/**
	* Sets the x c g0205 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0205 the x c g0205 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0205(java.lang.String XCG0205) {
		_thongsochungchixecogioiphan2.setXCG0205(XCG0205);
	}

	/**
	* Returns the x c g0206 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0206 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0206() {
		return _thongsochungchixecogioiphan2.getXCG0206();
	}

	/**
	* Sets the x c g0206 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0206 the x c g0206 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0206(java.lang.String XCG0206) {
		_thongsochungchixecogioiphan2.setXCG0206(XCG0206);
	}

	/**
	* Returns the x c g0207 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0207 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0207() {
		return _thongsochungchixecogioiphan2.getXCG0207();
	}

	/**
	* Sets the x c g0207 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0207 the x c g0207 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0207(java.lang.String XCG0207) {
		_thongsochungchixecogioiphan2.setXCG0207(XCG0207);
	}

	/**
	* Returns the x c g0208 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0208 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0208() {
		return _thongsochungchixecogioiphan2.getXCG0208();
	}

	/**
	* Sets the x c g0208 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0208 the x c g0208 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0208(java.lang.String XCG0208) {
		_thongsochungchixecogioiphan2.setXCG0208(XCG0208);
	}

	/**
	* Returns the x c g0209 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0209 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0209() {
		return _thongsochungchixecogioiphan2.getXCG0209();
	}

	/**
	* Sets the x c g0209 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0209 the x c g0209 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0209(java.lang.String XCG0209) {
		_thongsochungchixecogioiphan2.setXCG0209(XCG0209);
	}

	/**
	* Returns the x c g0210 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0210 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0210() {
		return _thongsochungchixecogioiphan2.getXCG0210();
	}

	/**
	* Sets the x c g0210 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0210 the x c g0210 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0210(java.lang.String XCG0210) {
		_thongsochungchixecogioiphan2.setXCG0210(XCG0210);
	}

	/**
	* Returns the x c g0211 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0211 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0211() {
		return _thongsochungchixecogioiphan2.getXCG0211();
	}

	/**
	* Sets the x c g0211 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0211 the x c g0211 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0211(java.lang.String XCG0211) {
		_thongsochungchixecogioiphan2.setXCG0211(XCG0211);
	}

	/**
	* Returns the x c g0212 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0212 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0212() {
		return _thongsochungchixecogioiphan2.getXCG0212();
	}

	/**
	* Sets the x c g0212 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0212 the x c g0212 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0212(java.lang.String XCG0212) {
		_thongsochungchixecogioiphan2.setXCG0212(XCG0212);
	}

	/**
	* Returns the x c g0213 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0213 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0213() {
		return _thongsochungchixecogioiphan2.getXCG0213();
	}

	/**
	* Sets the x c g0213 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0213 the x c g0213 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0213(java.lang.String XCG0213) {
		_thongsochungchixecogioiphan2.setXCG0213(XCG0213);
	}

	/**
	* Returns the x c g0214 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0214 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0214() {
		return _thongsochungchixecogioiphan2.getXCG0214();
	}

	/**
	* Sets the x c g0214 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0214 the x c g0214 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0214(java.lang.String XCG0214) {
		_thongsochungchixecogioiphan2.setXCG0214(XCG0214);
	}

	/**
	* Returns the x c g0215 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0215 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0215() {
		return _thongsochungchixecogioiphan2.getXCG0215();
	}

	/**
	* Sets the x c g0215 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0215 the x c g0215 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0215(java.lang.String XCG0215) {
		_thongsochungchixecogioiphan2.setXCG0215(XCG0215);
	}

	/**
	* Returns the x c g0216 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0216 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0216() {
		return _thongsochungchixecogioiphan2.getXCG0216();
	}

	/**
	* Sets the x c g0216 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0216 the x c g0216 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0216(java.lang.String XCG0216) {
		_thongsochungchixecogioiphan2.setXCG0216(XCG0216);
	}

	/**
	* Returns the x c g0217 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0217 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0217() {
		return _thongsochungchixecogioiphan2.getXCG0217();
	}

	/**
	* Sets the x c g0217 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0217 the x c g0217 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0217(java.lang.String XCG0217) {
		_thongsochungchixecogioiphan2.setXCG0217(XCG0217);
	}

	/**
	* Returns the x c g0218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0218() {
		return _thongsochungchixecogioiphan2.getXCG0218();
	}

	/**
	* Sets the x c g0218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0218 the x c g0218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0218(java.lang.String XCG0218) {
		_thongsochungchixecogioiphan2.setXCG0218(XCG0218);
	}

	/**
	* Returns the x c g0219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0219() {
		return _thongsochungchixecogioiphan2.getXCG0219();
	}

	/**
	* Sets the x c g0219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0219 the x c g0219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0219(java.lang.String XCG0219) {
		_thongsochungchixecogioiphan2.setXCG0219(XCG0219);
	}

	/**
	* Returns the x c g2218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2218() {
		return _thongsochungchixecogioiphan2.getXCG2218();
	}

	/**
	* Sets the x c g2218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2218 the x c g2218 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2218(java.lang.String XCG2218) {
		_thongsochungchixecogioiphan2.setXCG2218(XCG2218);
	}

	/**
	* Returns the x c g2219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2219() {
		return _thongsochungchixecogioiphan2.getXCG2219();
	}

	/**
	* Sets the x c g2219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2219 the x c g2219 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2219(java.lang.String XCG2219) {
		_thongsochungchixecogioiphan2.setXCG2219(XCG2219);
	}

	/**
	* Returns the x c g0220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0220() {
		return _thongsochungchixecogioiphan2.getXCG0220();
	}

	/**
	* Sets the x c g0220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0220 the x c g0220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0220(java.lang.String XCG0220) {
		_thongsochungchixecogioiphan2.setXCG0220(XCG0220);
	}

	/**
	* Returns the x c g2220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2220() {
		return _thongsochungchixecogioiphan2.getXCG2220();
	}

	/**
	* Sets the x c g2220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2220 the x c g2220 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2220(java.lang.String XCG2220) {
		_thongsochungchixecogioiphan2.setXCG2220(XCG2220);
	}

	/**
	* Returns the x c g0221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0221() {
		return _thongsochungchixecogioiphan2.getXCG0221();
	}

	/**
	* Sets the x c g0221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0221 the x c g0221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0221(java.lang.String XCG0221) {
		_thongsochungchixecogioiphan2.setXCG0221(XCG0221);
	}

	/**
	* Returns the x c g2221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2221() {
		return _thongsochungchixecogioiphan2.getXCG2221();
	}

	/**
	* Sets the x c g2221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2221 the x c g2221 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2221(java.lang.String XCG2221) {
		_thongsochungchixecogioiphan2.setXCG2221(XCG2221);
	}

	/**
	* Returns the x c g0222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0222() {
		return _thongsochungchixecogioiphan2.getXCG0222();
	}

	/**
	* Sets the x c g0222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0222 the x c g0222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0222(java.lang.String XCG0222) {
		_thongsochungchixecogioiphan2.setXCG0222(XCG0222);
	}

	/**
	* Returns the x c g2222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2222() {
		return _thongsochungchixecogioiphan2.getXCG2222();
	}

	/**
	* Sets the x c g2222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2222 the x c g2222 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2222(java.lang.String XCG2222) {
		_thongsochungchixecogioiphan2.setXCG2222(XCG2222);
	}

	/**
	* Returns the x c g0223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0223() {
		return _thongsochungchixecogioiphan2.getXCG0223();
	}

	/**
	* Sets the x c g0223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0223 the x c g0223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0223(java.lang.String XCG0223) {
		_thongsochungchixecogioiphan2.setXCG0223(XCG0223);
	}

	/**
	* Returns the x c g2223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2223() {
		return _thongsochungchixecogioiphan2.getXCG2223();
	}

	/**
	* Sets the x c g2223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2223 the x c g2223 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2223(java.lang.String XCG2223) {
		_thongsochungchixecogioiphan2.setXCG2223(XCG2223);
	}

	/**
	* Returns the x c g0224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0224() {
		return _thongsochungchixecogioiphan2.getXCG0224();
	}

	/**
	* Sets the x c g0224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0224 the x c g0224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0224(java.lang.String XCG0224) {
		_thongsochungchixecogioiphan2.setXCG0224(XCG0224);
	}

	/**
	* Returns the x c g2224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2224() {
		return _thongsochungchixecogioiphan2.getXCG2224();
	}

	/**
	* Sets the x c g2224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2224 the x c g2224 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2224(java.lang.String XCG2224) {
		_thongsochungchixecogioiphan2.setXCG2224(XCG2224);
	}

	/**
	* Returns the x c g0225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0225() {
		return _thongsochungchixecogioiphan2.getXCG0225();
	}

	/**
	* Sets the x c g0225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0225 the x c g0225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0225(java.lang.String XCG0225) {
		_thongsochungchixecogioiphan2.setXCG0225(XCG0225);
	}

	/**
	* Returns the x c g2225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2225() {
		return _thongsochungchixecogioiphan2.getXCG2225();
	}

	/**
	* Sets the x c g2225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2225 the x c g2225 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2225(java.lang.String XCG2225) {
		_thongsochungchixecogioiphan2.setXCG2225(XCG2225);
	}

	/**
	* Returns the x c g0226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0226() {
		return _thongsochungchixecogioiphan2.getXCG0226();
	}

	/**
	* Sets the x c g0226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0226 the x c g0226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0226(java.lang.String XCG0226) {
		_thongsochungchixecogioiphan2.setXCG0226(XCG0226);
	}

	/**
	* Returns the x c g2226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2226() {
		return _thongsochungchixecogioiphan2.getXCG2226();
	}

	/**
	* Sets the x c g2226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2226 the x c g2226 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2226(java.lang.String XCG2226) {
		_thongsochungchixecogioiphan2.setXCG2226(XCG2226);
	}

	/**
	* Returns the x c g0227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0227() {
		return _thongsochungchixecogioiphan2.getXCG0227();
	}

	/**
	* Sets the x c g0227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0227 the x c g0227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0227(java.lang.String XCG0227) {
		_thongsochungchixecogioiphan2.setXCG0227(XCG0227);
	}

	/**
	* Returns the x c g2227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2227() {
		return _thongsochungchixecogioiphan2.getXCG2227();
	}

	/**
	* Sets the x c g2227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2227 the x c g2227 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2227(java.lang.String XCG2227) {
		_thongsochungchixecogioiphan2.setXCG2227(XCG2227);
	}

	/**
	* Returns the x c g0228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0228() {
		return _thongsochungchixecogioiphan2.getXCG0228();
	}

	/**
	* Sets the x c g0228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0228 the x c g0228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0228(java.lang.String XCG0228) {
		_thongsochungchixecogioiphan2.setXCG0228(XCG0228);
	}

	/**
	* Returns the x c g2228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2228() {
		return _thongsochungchixecogioiphan2.getXCG2228();
	}

	/**
	* Sets the x c g2228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2228 the x c g2228 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2228(java.lang.String XCG2228) {
		_thongsochungchixecogioiphan2.setXCG2228(XCG2228);
	}

	/**
	* Returns the x c g0229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0229() {
		return _thongsochungchixecogioiphan2.getXCG0229();
	}

	/**
	* Sets the x c g0229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0229 the x c g0229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0229(java.lang.String XCG0229) {
		_thongsochungchixecogioiphan2.setXCG0229(XCG0229);
	}

	/**
	* Returns the x c g2229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2229() {
		return _thongsochungchixecogioiphan2.getXCG2229();
	}

	/**
	* Sets the x c g2229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2229 the x c g2229 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2229(java.lang.String XCG2229) {
		_thongsochungchixecogioiphan2.setXCG2229(XCG2229);
	}

	/**
	* Returns the x c g0230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0230() {
		return _thongsochungchixecogioiphan2.getXCG0230();
	}

	/**
	* Sets the x c g0230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0230 the x c g0230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0230(java.lang.String XCG0230) {
		_thongsochungchixecogioiphan2.setXCG0230(XCG0230);
	}

	/**
	* Returns the x c g2230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2230() {
		return _thongsochungchixecogioiphan2.getXCG2230();
	}

	/**
	* Sets the x c g2230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2230 the x c g2230 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2230(java.lang.String XCG2230) {
		_thongsochungchixecogioiphan2.setXCG2230(XCG2230);
	}

	/**
	* Returns the x c g0231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0231() {
		return _thongsochungchixecogioiphan2.getXCG0231();
	}

	/**
	* Sets the x c g0231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0231 the x c g0231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0231(java.lang.String XCG0231) {
		_thongsochungchixecogioiphan2.setXCG0231(XCG0231);
	}

	/**
	* Returns the x c g2231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2231() {
		return _thongsochungchixecogioiphan2.getXCG2231();
	}

	/**
	* Sets the x c g2231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2231 the x c g2231 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2231(java.lang.String XCG2231) {
		_thongsochungchixecogioiphan2.setXCG2231(XCG2231);
	}

	/**
	* Returns the x c g0232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0232() {
		return _thongsochungchixecogioiphan2.getXCG0232();
	}

	/**
	* Sets the x c g0232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0232 the x c g0232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0232(java.lang.String XCG0232) {
		_thongsochungchixecogioiphan2.setXCG0232(XCG0232);
	}

	/**
	* Returns the x c g2232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2232() {
		return _thongsochungchixecogioiphan2.getXCG2232();
	}

	/**
	* Sets the x c g2232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2232 the x c g2232 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2232(java.lang.String XCG2232) {
		_thongsochungchixecogioiphan2.setXCG2232(XCG2232);
	}

	/**
	* Returns the x c g0233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0233() {
		return _thongsochungchixecogioiphan2.getXCG0233();
	}

	/**
	* Sets the x c g0233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0233 the x c g0233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0233(java.lang.String XCG0233) {
		_thongsochungchixecogioiphan2.setXCG0233(XCG0233);
	}

	/**
	* Returns the x c g2233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2233() {
		return _thongsochungchixecogioiphan2.getXCG2233();
	}

	/**
	* Sets the x c g2233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2233 the x c g2233 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2233(java.lang.String XCG2233) {
		_thongsochungchixecogioiphan2.setXCG2233(XCG2233);
	}

	/**
	* Returns the x c g0234 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0234 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0234() {
		return _thongsochungchixecogioiphan2.getXCG0234();
	}

	/**
	* Sets the x c g0234 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0234 the x c g0234 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0234(java.lang.String XCG0234) {
		_thongsochungchixecogioiphan2.setXCG0234(XCG0234);
	}

	/**
	* Returns the x c g0235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0235() {
		return _thongsochungchixecogioiphan2.getXCG0235();
	}

	/**
	* Sets the x c g0235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0235 the x c g0235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0235(java.lang.String XCG0235) {
		_thongsochungchixecogioiphan2.setXCG0235(XCG0235);
	}

	/**
	* Returns the x c g2235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g2235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG2235() {
		return _thongsochungchixecogioiphan2.getXCG2235();
	}

	/**
	* Sets the x c g2235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG2235 the x c g2235 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG2235(java.lang.String XCG2235) {
		_thongsochungchixecogioiphan2.setXCG2235(XCG2235);
	}

	/**
	* Returns the x c g0236 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0236 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0236() {
		return _thongsochungchixecogioiphan2.getXCG0236();
	}

	/**
	* Sets the x c g0236 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0236 the x c g0236 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0236(java.lang.String XCG0236) {
		_thongsochungchixecogioiphan2.setXCG0236(XCG0236);
	}

	/**
	* Returns the x c g0237 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @return the x c g0237 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public java.lang.String getXCG0237() {
		return _thongsochungchixecogioiphan2.getXCG0237();
	}

	/**
	* Sets the x c g0237 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	*
	* @param XCG0237 the x c g0237 of this t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	@Override
	public void setXCG0237(java.lang.String XCG0237) {
		_thongsochungchixecogioiphan2.setXCG0237(XCG0237);
	}

	@Override
	public boolean isNew() {
		return _thongsochungchixecogioiphan2.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongsochungchixecogioiphan2.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongsochungchixecogioiphan2.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongsochungchixecogioiphan2.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongsochungchixecogioiphan2.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongsochungchixecogioiphan2.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongsochungchixecogioiphan2.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongsochungchixecogioiphan2.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongsochungchixecogioiphan2.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongsochungchixecogioiphan2.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongsochungchixecogioiphan2.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper((THONGSOCHUNGCHIXECOGIOIPHAN2)_thongsochungchixecogioiphan2.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2) {
		return _thongsochungchixecogioiphan2.compareTo(thongsochungchixecogioiphan2);
	}

	@Override
	public int hashCode() {
		return _thongsochungchixecogioiphan2.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> toCacheModel() {
		return _thongsochungchixecogioiphan2.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 toEscapedModel() {
		return new THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper(_thongsochungchixecogioiphan2.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 toUnescapedModel() {
		return new THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper(_thongsochungchixecogioiphan2.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongsochungchixecogioiphan2.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongsochungchixecogioiphan2.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongsochungchixecogioiphan2.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper)) {
			return false;
		}

		THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper thongsochungchixecogioiphan2Wrapper = (THONGSOCHUNGCHIXECOGIOIPHAN2Wrapper)obj;

		if (Validator.equals(_thongsochungchixecogioiphan2,
					thongsochungchixecogioiphan2Wrapper._thongsochungchixecogioiphan2)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGSOCHUNGCHIXECOGIOIPHAN2 getWrappedTHONGSOCHUNGCHIXECOGIOIPHAN2() {
		return _thongsochungchixecogioiphan2;
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 getWrappedModel() {
		return _thongsochungchixecogioiphan2;
	}

	@Override
	public void resetOriginalValues() {
		_thongsochungchixecogioiphan2.resetOriginalValues();
	}

	private THONGSOCHUNGCHIXECOGIOIPHAN2 _thongsochungchixecogioiphan2;
}