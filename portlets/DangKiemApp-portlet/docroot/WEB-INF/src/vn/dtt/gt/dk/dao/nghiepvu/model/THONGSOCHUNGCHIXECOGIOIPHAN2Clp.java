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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2Clp extends BaseModelImpl<THONGSOCHUNGCHIXECOGIOIPHAN2>
	implements THONGSOCHUNGCHIXECOGIOIPHAN2 {
	public THONGSOCHUNGCHIXECOGIOIPHAN2Clp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel,
					hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel,
					certificateRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel,
					vehicleGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel,
					SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0129() {
		return _XCG0129;
	}

	@Override
	public void setXCG0129(String XCG0129) {
		_XCG0129 = XCG0129;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0129", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0129);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0130() {
		return _XCG0130;
	}

	@Override
	public void setXCG0130(String XCG0130) {
		_XCG0130 = XCG0130;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0130", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0130);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0131() {
		return _XCG0131;
	}

	@Override
	public void setXCG0131(String XCG0131) {
		_XCG0131 = XCG0131;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0131", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0131);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0132() {
		return _XCG0132;
	}

	@Override
	public void setXCG0132(String XCG0132) {
		_XCG0132 = XCG0132;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0132", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0132);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0133() {
		return _XCG0133;
	}

	@Override
	public void setXCG0133(String XCG0133) {
		_XCG0133 = XCG0133;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0133", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0133);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0134() {
		return _XCG0134;
	}

	@Override
	public void setXCG0134(String XCG0134) {
		_XCG0134 = XCG0134;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0134", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0134);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0135() {
		return _XCG0135;
	}

	@Override
	public void setXCG0135(String XCG0135) {
		_XCG0135 = XCG0135;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0135", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0135);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2135() {
		return _XCG2135;
	}

	@Override
	public void setXCG2135(String XCG2135) {
		_XCG2135 = XCG2135;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2135", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2135);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0136() {
		return _XCG0136;
	}

	@Override
	public void setXCG0136(String XCG0136) {
		_XCG0136 = XCG0136;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0136", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0136);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2136() {
		return _XCG2136;
	}

	@Override
	public void setXCG2136(String XCG2136) {
		_XCG2136 = XCG2136;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2136", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2136);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0137() {
		return _XCG0137;
	}

	@Override
	public void setXCG0137(String XCG0137) {
		_XCG0137 = XCG0137;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0137", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0137);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2137() {
		return _XCG2137;
	}

	@Override
	public void setXCG2137(String XCG2137) {
		_XCG2137 = XCG2137;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2137", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2137);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0138() {
		return _XCG0138;
	}

	@Override
	public void setXCG0138(String XCG0138) {
		_XCG0138 = XCG0138;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0138", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0138);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2138() {
		return _XCG2138;
	}

	@Override
	public void setXCG2138(String XCG2138) {
		_XCG2138 = XCG2138;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2138", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2138);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0139() {
		return _XCG0139;
	}

	@Override
	public void setXCG0139(String XCG0139) {
		_XCG0139 = XCG0139;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0139", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0139);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2139() {
		return _XCG2139;
	}

	@Override
	public void setXCG2139(String XCG2139) {
		_XCG2139 = XCG2139;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2139", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2139);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0140() {
		return _XCG0140;
	}

	@Override
	public void setXCG0140(String XCG0140) {
		_XCG0140 = XCG0140;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0140", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0140);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2140() {
		return _XCG2140;
	}

	@Override
	public void setXCG2140(String XCG2140) {
		_XCG2140 = XCG2140;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2140", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2140);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0141() {
		return _XCG0141;
	}

	@Override
	public void setXCG0141(String XCG0141) {
		_XCG0141 = XCG0141;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0141", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0141);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2141() {
		return _XCG2141;
	}

	@Override
	public void setXCG2141(String XCG2141) {
		_XCG2141 = XCG2141;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2141", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2141);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0142() {
		return _XCG0142;
	}

	@Override
	public void setXCG0142(String XCG0142) {
		_XCG0142 = XCG0142;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0142", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0142);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2142() {
		return _XCG2142;
	}

	@Override
	public void setXCG2142(String XCG2142) {
		_XCG2142 = XCG2142;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2142", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2142);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0143() {
		return _XCG0143;
	}

	@Override
	public void setXCG0143(String XCG0143) {
		_XCG0143 = XCG0143;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0143", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0143);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2143() {
		return _XCG2143;
	}

	@Override
	public void setXCG2143(String XCG2143) {
		_XCG2143 = XCG2143;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2143", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2143);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0144() {
		return _XCG0144;
	}

	@Override
	public void setXCG0144(String XCG0144) {
		_XCG0144 = XCG0144;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0144", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0144);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2144() {
		return _XCG2144;
	}

	@Override
	public void setXCG2144(String XCG2144) {
		_XCG2144 = XCG2144;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2144", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2144);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0145() {
		return _XCG0145;
	}

	@Override
	public void setXCG0145(String XCG0145) {
		_XCG0145 = XCG0145;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0145", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0145);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2145() {
		return _XCG2145;
	}

	@Override
	public void setXCG2145(String XCG2145) {
		_XCG2145 = XCG2145;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2145", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2145);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2245() {
		return _XCG2245;
	}

	@Override
	public void setXCG2245(String XCG2245) {
		_XCG2245 = XCG2245;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2245", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2245);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0146() {
		return _XCG0146;
	}

	@Override
	public void setXCG0146(String XCG0146) {
		_XCG0146 = XCG0146;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0146", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0146);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2146() {
		return _XCG2146;
	}

	@Override
	public void setXCG2146(String XCG2146) {
		_XCG2146 = XCG2146;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2146", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2146);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2246() {
		return _XCG2246;
	}

	@Override
	public void setXCG2246(String XCG2246) {
		_XCG2246 = XCG2246;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2246", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2246);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0147() {
		return _XCG0147;
	}

	@Override
	public void setXCG0147(String XCG0147) {
		_XCG0147 = XCG0147;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0147", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0147);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2147() {
		return _XCG2147;
	}

	@Override
	public void setXCG2147(String XCG2147) {
		_XCG2147 = XCG2147;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2147", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2147);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2247() {
		return _XCG2247;
	}

	@Override
	public void setXCG2247(String XCG2247) {
		_XCG2247 = XCG2247;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2247", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2247);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0148() {
		return _XCG0148;
	}

	@Override
	public void setXCG0148(String XCG0148) {
		_XCG0148 = XCG0148;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0148", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0148);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2148() {
		return _XCG2148;
	}

	@Override
	public void setXCG2148(String XCG2148) {
		_XCG2148 = XCG2148;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2148", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2148);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2248() {
		return _XCG2248;
	}

	@Override
	public void setXCG2248(String XCG2248) {
		_XCG2248 = XCG2248;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2248", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2248);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0149() {
		return _XCG0149;
	}

	@Override
	public void setXCG0149(String XCG0149) {
		_XCG0149 = XCG0149;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0149", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0149);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2149() {
		return _XCG2149;
	}

	@Override
	public void setXCG2149(String XCG2149) {
		_XCG2149 = XCG2149;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2149", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2149);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2249() {
		return _XCG2249;
	}

	@Override
	public void setXCG2249(String XCG2249) {
		_XCG2249 = XCG2249;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2249", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2249);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0150() {
		return _XCG0150;
	}

	@Override
	public void setXCG0150(String XCG0150) {
		_XCG0150 = XCG0150;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0150", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0150);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2150() {
		return _XCG2150;
	}

	@Override
	public void setXCG2150(String XCG2150) {
		_XCG2150 = XCG2150;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2150", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2150);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2250() {
		return _XCG2250;
	}

	@Override
	public void setXCG2250(String XCG2250) {
		_XCG2250 = XCG2250;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2250", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2250);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0151() {
		return _XCG0151;
	}

	@Override
	public void setXCG0151(String XCG0151) {
		_XCG0151 = XCG0151;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0151", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0151);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2151() {
		return _XCG2151;
	}

	@Override
	public void setXCG2151(String XCG2151) {
		_XCG2151 = XCG2151;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2151", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2151);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2251() {
		return _XCG2251;
	}

	@Override
	public void setXCG2251(String XCG2251) {
		_XCG2251 = XCG2251;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2251", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2251);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0152() {
		return _XCG0152;
	}

	@Override
	public void setXCG0152(String XCG0152) {
		_XCG0152 = XCG0152;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0152", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0152);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2152() {
		return _XCG2152;
	}

	@Override
	public void setXCG2152(String XCG2152) {
		_XCG2152 = XCG2152;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2152", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2152);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2252() {
		return _XCG2252;
	}

	@Override
	public void setXCG2252(String XCG2252) {
		_XCG2252 = XCG2252;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2252", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2252);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0153() {
		return _XCG0153;
	}

	@Override
	public void setXCG0153(String XCG0153) {
		_XCG0153 = XCG0153;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0153", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0153);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2153() {
		return _XCG2153;
	}

	@Override
	public void setXCG2153(String XCG2153) {
		_XCG2153 = XCG2153;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2153", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2153);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2253() {
		return _XCG2253;
	}

	@Override
	public void setXCG2253(String XCG2253) {
		_XCG2253 = XCG2253;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2253", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2253);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0154() {
		return _XCG0154;
	}

	@Override
	public void setXCG0154(String XCG0154) {
		_XCG0154 = XCG0154;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0154", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0154);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2154() {
		return _XCG2154;
	}

	@Override
	public void setXCG2154(String XCG2154) {
		_XCG2154 = XCG2154;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2154", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2154);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2254() {
		return _XCG2254;
	}

	@Override
	public void setXCG2254(String XCG2254) {
		_XCG2254 = XCG2254;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2254", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2254);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0155() {
		return _XCG0155;
	}

	@Override
	public void setXCG0155(String XCG0155) {
		_XCG0155 = XCG0155;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0155", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0155);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0156() {
		return _XCG0156;
	}

	@Override
	public void setXCG0156(String XCG0156) {
		_XCG0156 = XCG0156;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0156", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0156);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0242() {
		return _XCG0242;
	}

	@Override
	public void setXCG0242(String XCG0242) {
		_XCG0242 = XCG0242;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0242", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0242);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0157() {
		return _XCG0157;
	}

	@Override
	public void setXCG0157(String XCG0157) {
		_XCG0157 = XCG0157;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0157", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0157);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0158() {
		return _XCG0158;
	}

	@Override
	public void setXCG0158(String XCG0158) {
		_XCG0158 = XCG0158;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0158", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0158);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0159() {
		return _XCG0159;
	}

	@Override
	public void setXCG0159(String XCG0159) {
		_XCG0159 = XCG0159;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0159", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0159);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0160() {
		return _XCG0160;
	}

	@Override
	public void setXCG0160(String XCG0160) {
		_XCG0160 = XCG0160;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0160", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0160);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0243() {
		return _XCG0243;
	}

	@Override
	public void setXCG0243(String XCG0243) {
		_XCG0243 = XCG0243;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0243", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0243);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0161() {
		return _XCG0161;
	}

	@Override
	public void setXCG0161(String XCG0161) {
		_XCG0161 = XCG0161;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0161", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0161);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0162() {
		return _XCG0162;
	}

	@Override
	public void setXCG0162(String XCG0162) {
		_XCG0162 = XCG0162;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0162", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0162);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0163() {
		return _XCG0163;
	}

	@Override
	public void setXCG0163(String XCG0163) {
		_XCG0163 = XCG0163;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0163", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0163);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0164() {
		return _XCG0164;
	}

	@Override
	public void setXCG0164(String XCG0164) {
		_XCG0164 = XCG0164;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0164", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0164);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0244() {
		return _XCG0244;
	}

	@Override
	public void setXCG0244(String XCG0244) {
		_XCG0244 = XCG0244;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0244", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0244);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0165() {
		return _XCG0165;
	}

	@Override
	public void setXCG0165(String XCG0165) {
		_XCG0165 = XCG0165;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0165", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0165);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0166() {
		return _XCG0166;
	}

	@Override
	public void setXCG0166(String XCG0166) {
		_XCG0166 = XCG0166;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0166", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0166);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0167() {
		return _XCG0167;
	}

	@Override
	public void setXCG0167(String XCG0167) {
		_XCG0167 = XCG0167;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0167", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0167);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0168() {
		return _XCG0168;
	}

	@Override
	public void setXCG0168(String XCG0168) {
		_XCG0168 = XCG0168;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0168", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0168);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0245() {
		return _XCG0245;
	}

	@Override
	public void setXCG0245(String XCG0245) {
		_XCG0245 = XCG0245;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0245", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0245);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0169() {
		return _XCG0169;
	}

	@Override
	public void setXCG0169(String XCG0169) {
		_XCG0169 = XCG0169;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0169", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0169);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0170() {
		return _XCG0170;
	}

	@Override
	public void setXCG0170(String XCG0170) {
		_XCG0170 = XCG0170;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0170", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0170);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0171() {
		return _XCG0171;
	}

	@Override
	public void setXCG0171(String XCG0171) {
		_XCG0171 = XCG0171;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0171", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0171);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0172() {
		return _XCG0172;
	}

	@Override
	public void setXCG0172(String XCG0172) {
		_XCG0172 = XCG0172;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0172", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0172);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0246() {
		return _XCG0246;
	}

	@Override
	public void setXCG0246(String XCG0246) {
		_XCG0246 = XCG0246;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0246", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0246);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0173() {
		return _XCG0173;
	}

	@Override
	public void setXCG0173(String XCG0173) {
		_XCG0173 = XCG0173;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0173", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0173);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0174() {
		return _XCG0174;
	}

	@Override
	public void setXCG0174(String XCG0174) {
		_XCG0174 = XCG0174;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0174", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0174);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0175() {
		return _XCG0175;
	}

	@Override
	public void setXCG0175(String XCG0175) {
		_XCG0175 = XCG0175;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0175", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0175);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0176() {
		return _XCG0176;
	}

	@Override
	public void setXCG0176(String XCG0176) {
		_XCG0176 = XCG0176;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0176", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0176);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0247() {
		return _XCG0247;
	}

	@Override
	public void setXCG0247(String XCG0247) {
		_XCG0247 = XCG0247;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0247", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0247);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0177() {
		return _XCG0177;
	}

	@Override
	public void setXCG0177(String XCG0177) {
		_XCG0177 = XCG0177;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0177", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0177);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0178() {
		return _XCG0178;
	}

	@Override
	public void setXCG0178(String XCG0178) {
		_XCG0178 = XCG0178;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0178", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0178);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0179() {
		return _XCG0179;
	}

	@Override
	public void setXCG0179(String XCG0179) {
		_XCG0179 = XCG0179;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0179", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0179);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0180() {
		return _XCG0180;
	}

	@Override
	public void setXCG0180(String XCG0180) {
		_XCG0180 = XCG0180;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0180", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0180);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0248() {
		return _XCG0248;
	}

	@Override
	public void setXCG0248(String XCG0248) {
		_XCG0248 = XCG0248;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0248", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0248);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0181() {
		return _XCG0181;
	}

	@Override
	public void setXCG0181(String XCG0181) {
		_XCG0181 = XCG0181;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0181", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0181);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0182() {
		return _XCG0182;
	}

	@Override
	public void setXCG0182(String XCG0182) {
		_XCG0182 = XCG0182;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0182", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0182);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0183() {
		return _XCG0183;
	}

	@Override
	public void setXCG0183(String XCG0183) {
		_XCG0183 = XCG0183;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0183", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0183);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0184() {
		return _XCG0184;
	}

	@Override
	public void setXCG0184(String XCG0184) {
		_XCG0184 = XCG0184;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0184", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0184);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0249() {
		return _XCG0249;
	}

	@Override
	public void setXCG0249(String XCG0249) {
		_XCG0249 = XCG0249;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0249", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0249);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0185() {
		return _XCG0185;
	}

	@Override
	public void setXCG0185(String XCG0185) {
		_XCG0185 = XCG0185;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0185", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0185);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0186() {
		return _XCG0186;
	}

	@Override
	public void setXCG0186(String XCG0186) {
		_XCG0186 = XCG0186;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0186", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0186);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0187() {
		return _XCG0187;
	}

	@Override
	public void setXCG0187(String XCG0187) {
		_XCG0187 = XCG0187;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0187", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0187);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0188() {
		return _XCG0188;
	}

	@Override
	public void setXCG0188(String XCG0188) {
		_XCG0188 = XCG0188;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0188", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0188);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0250() {
		return _XCG0250;
	}

	@Override
	public void setXCG0250(String XCG0250) {
		_XCG0250 = XCG0250;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0250", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0250);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0189() {
		return _XCG0189;
	}

	@Override
	public void setXCG0189(String XCG0189) {
		_XCG0189 = XCG0189;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0189", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0189);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0190() {
		return _XCG0190;
	}

	@Override
	public void setXCG0190(String XCG0190) {
		_XCG0190 = XCG0190;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0190", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0190);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0191() {
		return _XCG0191;
	}

	@Override
	public void setXCG0191(String XCG0191) {
		_XCG0191 = XCG0191;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0191", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0191);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0192() {
		return _XCG0192;
	}

	@Override
	public void setXCG0192(String XCG0192) {
		_XCG0192 = XCG0192;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0192", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0192);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0251() {
		return _XCG0251;
	}

	@Override
	public void setXCG0251(String XCG0251) {
		_XCG0251 = XCG0251;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0251", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0251);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0193() {
		return _XCG0193;
	}

	@Override
	public void setXCG0193(String XCG0193) {
		_XCG0193 = XCG0193;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0193", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0193);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0194() {
		return _XCG0194;
	}

	@Override
	public void setXCG0194(String XCG0194) {
		_XCG0194 = XCG0194;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0194", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0194);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0195() {
		return _XCG0195;
	}

	@Override
	public void setXCG0195(String XCG0195) {
		_XCG0195 = XCG0195;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0195", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0195);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0196() {
		return _XCG0196;
	}

	@Override
	public void setXCG0196(String XCG0196) {
		_XCG0196 = XCG0196;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0196", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0196);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0197() {
		return _XCG0197;
	}

	@Override
	public void setXCG0197(String XCG0197) {
		_XCG0197 = XCG0197;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0197", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0197);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0198() {
		return _XCG0198;
	}

	@Override
	public void setXCG0198(String XCG0198) {
		_XCG0198 = XCG0198;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0198", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0198);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0199() {
		return _XCG0199;
	}

	@Override
	public void setXCG0199(String XCG0199) {
		_XCG0199 = XCG0199;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0199", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0199);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0200() {
		return _XCG0200;
	}

	@Override
	public void setXCG0200(String XCG0200) {
		_XCG0200 = XCG0200;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0200", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0200);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0201() {
		return _XCG0201;
	}

	@Override
	public void setXCG0201(String XCG0201) {
		_XCG0201 = XCG0201;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0201", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0201);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0202() {
		return _XCG0202;
	}

	@Override
	public void setXCG0202(String XCG0202) {
		_XCG0202 = XCG0202;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0202", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0202);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0203() {
		return _XCG0203;
	}

	@Override
	public void setXCG0203(String XCG0203) {
		_XCG0203 = XCG0203;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0203", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0203);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0204() {
		return _XCG0204;
	}

	@Override
	public void setXCG0204(String XCG0204) {
		_XCG0204 = XCG0204;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0204", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0204);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0205() {
		return _XCG0205;
	}

	@Override
	public void setXCG0205(String XCG0205) {
		_XCG0205 = XCG0205;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0205", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0205);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0206() {
		return _XCG0206;
	}

	@Override
	public void setXCG0206(String XCG0206) {
		_XCG0206 = XCG0206;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0206", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0206);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0207() {
		return _XCG0207;
	}

	@Override
	public void setXCG0207(String XCG0207) {
		_XCG0207 = XCG0207;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0207", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0207);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0208() {
		return _XCG0208;
	}

	@Override
	public void setXCG0208(String XCG0208) {
		_XCG0208 = XCG0208;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0208", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0208);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0209() {
		return _XCG0209;
	}

	@Override
	public void setXCG0209(String XCG0209) {
		_XCG0209 = XCG0209;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0209", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0209);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0210() {
		return _XCG0210;
	}

	@Override
	public void setXCG0210(String XCG0210) {
		_XCG0210 = XCG0210;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0210", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0210);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0211() {
		return _XCG0211;
	}

	@Override
	public void setXCG0211(String XCG0211) {
		_XCG0211 = XCG0211;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0211", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0211);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0212() {
		return _XCG0212;
	}

	@Override
	public void setXCG0212(String XCG0212) {
		_XCG0212 = XCG0212;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0212", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0212);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0213() {
		return _XCG0213;
	}

	@Override
	public void setXCG0213(String XCG0213) {
		_XCG0213 = XCG0213;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0213", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0213);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0214() {
		return _XCG0214;
	}

	@Override
	public void setXCG0214(String XCG0214) {
		_XCG0214 = XCG0214;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0214", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0214);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0215() {
		return _XCG0215;
	}

	@Override
	public void setXCG0215(String XCG0215) {
		_XCG0215 = XCG0215;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0215", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0215);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0216() {
		return _XCG0216;
	}

	@Override
	public void setXCG0216(String XCG0216) {
		_XCG0216 = XCG0216;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0216", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0216);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0217() {
		return _XCG0217;
	}

	@Override
	public void setXCG0217(String XCG0217) {
		_XCG0217 = XCG0217;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0217", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0217);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0218() {
		return _XCG0218;
	}

	@Override
	public void setXCG0218(String XCG0218) {
		_XCG0218 = XCG0218;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0218", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0218);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0219() {
		return _XCG0219;
	}

	@Override
	public void setXCG0219(String XCG0219) {
		_XCG0219 = XCG0219;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0219", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0219);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2218() {
		return _XCG2218;
	}

	@Override
	public void setXCG2218(String XCG2218) {
		_XCG2218 = XCG2218;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2218", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2218);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2219() {
		return _XCG2219;
	}

	@Override
	public void setXCG2219(String XCG2219) {
		_XCG2219 = XCG2219;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2219", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2219);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0220() {
		return _XCG0220;
	}

	@Override
	public void setXCG0220(String XCG0220) {
		_XCG0220 = XCG0220;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0220", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0220);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2220() {
		return _XCG2220;
	}

	@Override
	public void setXCG2220(String XCG2220) {
		_XCG2220 = XCG2220;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2220", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2220);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0221() {
		return _XCG0221;
	}

	@Override
	public void setXCG0221(String XCG0221) {
		_XCG0221 = XCG0221;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0221", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0221);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2221() {
		return _XCG2221;
	}

	@Override
	public void setXCG2221(String XCG2221) {
		_XCG2221 = XCG2221;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2221", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2221);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0222() {
		return _XCG0222;
	}

	@Override
	public void setXCG0222(String XCG0222) {
		_XCG0222 = XCG0222;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0222", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0222);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2222() {
		return _XCG2222;
	}

	@Override
	public void setXCG2222(String XCG2222) {
		_XCG2222 = XCG2222;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2222", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2222);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0223() {
		return _XCG0223;
	}

	@Override
	public void setXCG0223(String XCG0223) {
		_XCG0223 = XCG0223;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0223", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0223);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2223() {
		return _XCG2223;
	}

	@Override
	public void setXCG2223(String XCG2223) {
		_XCG2223 = XCG2223;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2223", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2223);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0224() {
		return _XCG0224;
	}

	@Override
	public void setXCG0224(String XCG0224) {
		_XCG0224 = XCG0224;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0224", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0224);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2224() {
		return _XCG2224;
	}

	@Override
	public void setXCG2224(String XCG2224) {
		_XCG2224 = XCG2224;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2224", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2224);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0225() {
		return _XCG0225;
	}

	@Override
	public void setXCG0225(String XCG0225) {
		_XCG0225 = XCG0225;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0225", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0225);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2225() {
		return _XCG2225;
	}

	@Override
	public void setXCG2225(String XCG2225) {
		_XCG2225 = XCG2225;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2225", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2225);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0226() {
		return _XCG0226;
	}

	@Override
	public void setXCG0226(String XCG0226) {
		_XCG0226 = XCG0226;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0226", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0226);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2226() {
		return _XCG2226;
	}

	@Override
	public void setXCG2226(String XCG2226) {
		_XCG2226 = XCG2226;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2226", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2226);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0227() {
		return _XCG0227;
	}

	@Override
	public void setXCG0227(String XCG0227) {
		_XCG0227 = XCG0227;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0227", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0227);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2227() {
		return _XCG2227;
	}

	@Override
	public void setXCG2227(String XCG2227) {
		_XCG2227 = XCG2227;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2227", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2227);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0228() {
		return _XCG0228;
	}

	@Override
	public void setXCG0228(String XCG0228) {
		_XCG0228 = XCG0228;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0228", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0228);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2228() {
		return _XCG2228;
	}

	@Override
	public void setXCG2228(String XCG2228) {
		_XCG2228 = XCG2228;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2228", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2228);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0229() {
		return _XCG0229;
	}

	@Override
	public void setXCG0229(String XCG0229) {
		_XCG0229 = XCG0229;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0229", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0229);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2229() {
		return _XCG2229;
	}

	@Override
	public void setXCG2229(String XCG2229) {
		_XCG2229 = XCG2229;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2229", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2229);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0230() {
		return _XCG0230;
	}

	@Override
	public void setXCG0230(String XCG0230) {
		_XCG0230 = XCG0230;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0230", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0230);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2230() {
		return _XCG2230;
	}

	@Override
	public void setXCG2230(String XCG2230) {
		_XCG2230 = XCG2230;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2230", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2230);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0231() {
		return _XCG0231;
	}

	@Override
	public void setXCG0231(String XCG0231) {
		_XCG0231 = XCG0231;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0231", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0231);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2231() {
		return _XCG2231;
	}

	@Override
	public void setXCG2231(String XCG2231) {
		_XCG2231 = XCG2231;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2231", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2231);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0232() {
		return _XCG0232;
	}

	@Override
	public void setXCG0232(String XCG0232) {
		_XCG0232 = XCG0232;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0232", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0232);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2232() {
		return _XCG2232;
	}

	@Override
	public void setXCG2232(String XCG2232) {
		_XCG2232 = XCG2232;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2232", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2232);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0233() {
		return _XCG0233;
	}

	@Override
	public void setXCG0233(String XCG0233) {
		_XCG0233 = XCG0233;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0233", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0233);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2233() {
		return _XCG2233;
	}

	@Override
	public void setXCG2233(String XCG2233) {
		_XCG2233 = XCG2233;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2233", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2233);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0234() {
		return _XCG0234;
	}

	@Override
	public void setXCG0234(String XCG0234) {
		_XCG0234 = XCG0234;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0234", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0234);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0235() {
		return _XCG0235;
	}

	@Override
	public void setXCG0235(String XCG0235) {
		_XCG0235 = XCG0235;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0235", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0235);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG2235() {
		return _XCG2235;
	}

	@Override
	public void setXCG2235(String XCG2235) {
		_XCG2235 = XCG2235;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG2235", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG2235);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0236() {
		return _XCG0236;
	}

	@Override
	public void setXCG0236(String XCG0236) {
		_XCG0236 = XCG0236;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0236", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0236);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0237() {
		return _XCG0237;
	}

	@Override
	public void setXCG0237(String XCG0237) {
		_XCG0237 = XCG0237;

		if (_thongsochungchixecogioiphan2RemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiphan2RemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0237", String.class);

				method.invoke(_thongsochungchixecogioiphan2RemoteModel, XCG0237);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGSOCHUNGCHIXECOGIOIPHAN2RemoteModel() {
		return _thongsochungchixecogioiphan2RemoteModel;
	}

	public void setTHONGSOCHUNGCHIXECOGIOIPHAN2RemoteModel(
		BaseModel<?> thongsochungchixecogioiphan2RemoteModel) {
		_thongsochungchixecogioiphan2RemoteModel = thongsochungchixecogioiphan2RemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _thongsochungchixecogioiphan2RemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_thongsochungchixecogioiphan2RemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.addTHONGSOCHUNGCHIXECOGIOIPHAN2(this);
		}
		else {
			THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.updateTHONGSOCHUNGCHIXECOGIOIPHAN2(this);
		}
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 toEscapedModel() {
		return (THONGSOCHUNGCHIXECOGIOIPHAN2)ProxyUtil.newProxyInstance(THONGSOCHUNGCHIXECOGIOIPHAN2.class.getClassLoader(),
			new Class[] { THONGSOCHUNGCHIXECOGIOIPHAN2.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGSOCHUNGCHIXECOGIOIPHAN2Clp clone = new THONGSOCHUNGCHIXECOGIOIPHAN2Clp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSynchDate(getSynchDate());
		clone.setXCG0129(getXCG0129());
		clone.setXCG0130(getXCG0130());
		clone.setXCG0131(getXCG0131());
		clone.setXCG0132(getXCG0132());
		clone.setXCG0133(getXCG0133());
		clone.setXCG0134(getXCG0134());
		clone.setXCG0135(getXCG0135());
		clone.setXCG2135(getXCG2135());
		clone.setXCG0136(getXCG0136());
		clone.setXCG2136(getXCG2136());
		clone.setXCG0137(getXCG0137());
		clone.setXCG2137(getXCG2137());
		clone.setXCG0138(getXCG0138());
		clone.setXCG2138(getXCG2138());
		clone.setXCG0139(getXCG0139());
		clone.setXCG2139(getXCG2139());
		clone.setXCG0140(getXCG0140());
		clone.setXCG2140(getXCG2140());
		clone.setXCG0141(getXCG0141());
		clone.setXCG2141(getXCG2141());
		clone.setXCG0142(getXCG0142());
		clone.setXCG2142(getXCG2142());
		clone.setXCG0143(getXCG0143());
		clone.setXCG2143(getXCG2143());
		clone.setXCG0144(getXCG0144());
		clone.setXCG2144(getXCG2144());
		clone.setXCG0145(getXCG0145());
		clone.setXCG2145(getXCG2145());
		clone.setXCG2245(getXCG2245());
		clone.setXCG0146(getXCG0146());
		clone.setXCG2146(getXCG2146());
		clone.setXCG2246(getXCG2246());
		clone.setXCG0147(getXCG0147());
		clone.setXCG2147(getXCG2147());
		clone.setXCG2247(getXCG2247());
		clone.setXCG0148(getXCG0148());
		clone.setXCG2148(getXCG2148());
		clone.setXCG2248(getXCG2248());
		clone.setXCG0149(getXCG0149());
		clone.setXCG2149(getXCG2149());
		clone.setXCG2249(getXCG2249());
		clone.setXCG0150(getXCG0150());
		clone.setXCG2150(getXCG2150());
		clone.setXCG2250(getXCG2250());
		clone.setXCG0151(getXCG0151());
		clone.setXCG2151(getXCG2151());
		clone.setXCG2251(getXCG2251());
		clone.setXCG0152(getXCG0152());
		clone.setXCG2152(getXCG2152());
		clone.setXCG2252(getXCG2252());
		clone.setXCG0153(getXCG0153());
		clone.setXCG2153(getXCG2153());
		clone.setXCG2253(getXCG2253());
		clone.setXCG0154(getXCG0154());
		clone.setXCG2154(getXCG2154());
		clone.setXCG2254(getXCG2254());
		clone.setXCG0155(getXCG0155());
		clone.setXCG0156(getXCG0156());
		clone.setXCG0242(getXCG0242());
		clone.setXCG0157(getXCG0157());
		clone.setXCG0158(getXCG0158());
		clone.setXCG0159(getXCG0159());
		clone.setXCG0160(getXCG0160());
		clone.setXCG0243(getXCG0243());
		clone.setXCG0161(getXCG0161());
		clone.setXCG0162(getXCG0162());
		clone.setXCG0163(getXCG0163());
		clone.setXCG0164(getXCG0164());
		clone.setXCG0244(getXCG0244());
		clone.setXCG0165(getXCG0165());
		clone.setXCG0166(getXCG0166());
		clone.setXCG0167(getXCG0167());
		clone.setXCG0168(getXCG0168());
		clone.setXCG0245(getXCG0245());
		clone.setXCG0169(getXCG0169());
		clone.setXCG0170(getXCG0170());
		clone.setXCG0171(getXCG0171());
		clone.setXCG0172(getXCG0172());
		clone.setXCG0246(getXCG0246());
		clone.setXCG0173(getXCG0173());
		clone.setXCG0174(getXCG0174());
		clone.setXCG0175(getXCG0175());
		clone.setXCG0176(getXCG0176());
		clone.setXCG0247(getXCG0247());
		clone.setXCG0177(getXCG0177());
		clone.setXCG0178(getXCG0178());
		clone.setXCG0179(getXCG0179());
		clone.setXCG0180(getXCG0180());
		clone.setXCG0248(getXCG0248());
		clone.setXCG0181(getXCG0181());
		clone.setXCG0182(getXCG0182());
		clone.setXCG0183(getXCG0183());
		clone.setXCG0184(getXCG0184());
		clone.setXCG0249(getXCG0249());
		clone.setXCG0185(getXCG0185());
		clone.setXCG0186(getXCG0186());
		clone.setXCG0187(getXCG0187());
		clone.setXCG0188(getXCG0188());
		clone.setXCG0250(getXCG0250());
		clone.setXCG0189(getXCG0189());
		clone.setXCG0190(getXCG0190());
		clone.setXCG0191(getXCG0191());
		clone.setXCG0192(getXCG0192());
		clone.setXCG0251(getXCG0251());
		clone.setXCG0193(getXCG0193());
		clone.setXCG0194(getXCG0194());
		clone.setXCG0195(getXCG0195());
		clone.setXCG0196(getXCG0196());
		clone.setXCG0197(getXCG0197());
		clone.setXCG0198(getXCG0198());
		clone.setXCG0199(getXCG0199());
		clone.setXCG0200(getXCG0200());
		clone.setXCG0201(getXCG0201());
		clone.setXCG0202(getXCG0202());
		clone.setXCG0203(getXCG0203());
		clone.setXCG0204(getXCG0204());
		clone.setXCG0205(getXCG0205());
		clone.setXCG0206(getXCG0206());
		clone.setXCG0207(getXCG0207());
		clone.setXCG0208(getXCG0208());
		clone.setXCG0209(getXCG0209());
		clone.setXCG0210(getXCG0210());
		clone.setXCG0211(getXCG0211());
		clone.setXCG0212(getXCG0212());
		clone.setXCG0213(getXCG0213());
		clone.setXCG0214(getXCG0214());
		clone.setXCG0215(getXCG0215());
		clone.setXCG0216(getXCG0216());
		clone.setXCG0217(getXCG0217());
		clone.setXCG0218(getXCG0218());
		clone.setXCG0219(getXCG0219());
		clone.setXCG2218(getXCG2218());
		clone.setXCG2219(getXCG2219());
		clone.setXCG0220(getXCG0220());
		clone.setXCG2220(getXCG2220());
		clone.setXCG0221(getXCG0221());
		clone.setXCG2221(getXCG2221());
		clone.setXCG0222(getXCG0222());
		clone.setXCG2222(getXCG2222());
		clone.setXCG0223(getXCG0223());
		clone.setXCG2223(getXCG2223());
		clone.setXCG0224(getXCG0224());
		clone.setXCG2224(getXCG2224());
		clone.setXCG0225(getXCG0225());
		clone.setXCG2225(getXCG2225());
		clone.setXCG0226(getXCG0226());
		clone.setXCG2226(getXCG2226());
		clone.setXCG0227(getXCG0227());
		clone.setXCG2227(getXCG2227());
		clone.setXCG0228(getXCG0228());
		clone.setXCG2228(getXCG2228());
		clone.setXCG0229(getXCG0229());
		clone.setXCG2229(getXCG2229());
		clone.setXCG0230(getXCG0230());
		clone.setXCG2230(getXCG2230());
		clone.setXCG0231(getXCG0231());
		clone.setXCG2231(getXCG2231());
		clone.setXCG0232(getXCG0232());
		clone.setXCG2232(getXCG2232());
		clone.setXCG0233(getXCG0233());
		clone.setXCG2233(getXCG2233());
		clone.setXCG0234(getXCG0234());
		clone.setXCG0235(getXCG0235());
		clone.setXCG2235(getXCG2235());
		clone.setXCG0236(getXCG0236());
		clone.setXCG0237(getXCG0237());

		return clone;
	}

	@Override
	public int compareTo(
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2) {
		int value = 0;

		if (getId() < thongsochungchixecogioiphan2.getId()) {
			value = -1;
		}
		else if (getId() > thongsochungchixecogioiphan2.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXECOGIOIPHAN2Clp)) {
			return false;
		}

		THONGSOCHUNGCHIXECOGIOIPHAN2Clp thongsochungchixecogioiphan2 = (THONGSOCHUNGCHIXECOGIOIPHAN2Clp)obj;

		long primaryKey = thongsochungchixecogioiphan2.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(343);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append(", XCG0129=");
		sb.append(getXCG0129());
		sb.append(", XCG0130=");
		sb.append(getXCG0130());
		sb.append(", XCG0131=");
		sb.append(getXCG0131());
		sb.append(", XCG0132=");
		sb.append(getXCG0132());
		sb.append(", XCG0133=");
		sb.append(getXCG0133());
		sb.append(", XCG0134=");
		sb.append(getXCG0134());
		sb.append(", XCG0135=");
		sb.append(getXCG0135());
		sb.append(", XCG2135=");
		sb.append(getXCG2135());
		sb.append(", XCG0136=");
		sb.append(getXCG0136());
		sb.append(", XCG2136=");
		sb.append(getXCG2136());
		sb.append(", XCG0137=");
		sb.append(getXCG0137());
		sb.append(", XCG2137=");
		sb.append(getXCG2137());
		sb.append(", XCG0138=");
		sb.append(getXCG0138());
		sb.append(", XCG2138=");
		sb.append(getXCG2138());
		sb.append(", XCG0139=");
		sb.append(getXCG0139());
		sb.append(", XCG2139=");
		sb.append(getXCG2139());
		sb.append(", XCG0140=");
		sb.append(getXCG0140());
		sb.append(", XCG2140=");
		sb.append(getXCG2140());
		sb.append(", XCG0141=");
		sb.append(getXCG0141());
		sb.append(", XCG2141=");
		sb.append(getXCG2141());
		sb.append(", XCG0142=");
		sb.append(getXCG0142());
		sb.append(", XCG2142=");
		sb.append(getXCG2142());
		sb.append(", XCG0143=");
		sb.append(getXCG0143());
		sb.append(", XCG2143=");
		sb.append(getXCG2143());
		sb.append(", XCG0144=");
		sb.append(getXCG0144());
		sb.append(", XCG2144=");
		sb.append(getXCG2144());
		sb.append(", XCG0145=");
		sb.append(getXCG0145());
		sb.append(", XCG2145=");
		sb.append(getXCG2145());
		sb.append(", XCG2245=");
		sb.append(getXCG2245());
		sb.append(", XCG0146=");
		sb.append(getXCG0146());
		sb.append(", XCG2146=");
		sb.append(getXCG2146());
		sb.append(", XCG2246=");
		sb.append(getXCG2246());
		sb.append(", XCG0147=");
		sb.append(getXCG0147());
		sb.append(", XCG2147=");
		sb.append(getXCG2147());
		sb.append(", XCG2247=");
		sb.append(getXCG2247());
		sb.append(", XCG0148=");
		sb.append(getXCG0148());
		sb.append(", XCG2148=");
		sb.append(getXCG2148());
		sb.append(", XCG2248=");
		sb.append(getXCG2248());
		sb.append(", XCG0149=");
		sb.append(getXCG0149());
		sb.append(", XCG2149=");
		sb.append(getXCG2149());
		sb.append(", XCG2249=");
		sb.append(getXCG2249());
		sb.append(", XCG0150=");
		sb.append(getXCG0150());
		sb.append(", XCG2150=");
		sb.append(getXCG2150());
		sb.append(", XCG2250=");
		sb.append(getXCG2250());
		sb.append(", XCG0151=");
		sb.append(getXCG0151());
		sb.append(", XCG2151=");
		sb.append(getXCG2151());
		sb.append(", XCG2251=");
		sb.append(getXCG2251());
		sb.append(", XCG0152=");
		sb.append(getXCG0152());
		sb.append(", XCG2152=");
		sb.append(getXCG2152());
		sb.append(", XCG2252=");
		sb.append(getXCG2252());
		sb.append(", XCG0153=");
		sb.append(getXCG0153());
		sb.append(", XCG2153=");
		sb.append(getXCG2153());
		sb.append(", XCG2253=");
		sb.append(getXCG2253());
		sb.append(", XCG0154=");
		sb.append(getXCG0154());
		sb.append(", XCG2154=");
		sb.append(getXCG2154());
		sb.append(", XCG2254=");
		sb.append(getXCG2254());
		sb.append(", XCG0155=");
		sb.append(getXCG0155());
		sb.append(", XCG0156=");
		sb.append(getXCG0156());
		sb.append(", XCG0242=");
		sb.append(getXCG0242());
		sb.append(", XCG0157=");
		sb.append(getXCG0157());
		sb.append(", XCG0158=");
		sb.append(getXCG0158());
		sb.append(", XCG0159=");
		sb.append(getXCG0159());
		sb.append(", XCG0160=");
		sb.append(getXCG0160());
		sb.append(", XCG0243=");
		sb.append(getXCG0243());
		sb.append(", XCG0161=");
		sb.append(getXCG0161());
		sb.append(", XCG0162=");
		sb.append(getXCG0162());
		sb.append(", XCG0163=");
		sb.append(getXCG0163());
		sb.append(", XCG0164=");
		sb.append(getXCG0164());
		sb.append(", XCG0244=");
		sb.append(getXCG0244());
		sb.append(", XCG0165=");
		sb.append(getXCG0165());
		sb.append(", XCG0166=");
		sb.append(getXCG0166());
		sb.append(", XCG0167=");
		sb.append(getXCG0167());
		sb.append(", XCG0168=");
		sb.append(getXCG0168());
		sb.append(", XCG0245=");
		sb.append(getXCG0245());
		sb.append(", XCG0169=");
		sb.append(getXCG0169());
		sb.append(", XCG0170=");
		sb.append(getXCG0170());
		sb.append(", XCG0171=");
		sb.append(getXCG0171());
		sb.append(", XCG0172=");
		sb.append(getXCG0172());
		sb.append(", XCG0246=");
		sb.append(getXCG0246());
		sb.append(", XCG0173=");
		sb.append(getXCG0173());
		sb.append(", XCG0174=");
		sb.append(getXCG0174());
		sb.append(", XCG0175=");
		sb.append(getXCG0175());
		sb.append(", XCG0176=");
		sb.append(getXCG0176());
		sb.append(", XCG0247=");
		sb.append(getXCG0247());
		sb.append(", XCG0177=");
		sb.append(getXCG0177());
		sb.append(", XCG0178=");
		sb.append(getXCG0178());
		sb.append(", XCG0179=");
		sb.append(getXCG0179());
		sb.append(", XCG0180=");
		sb.append(getXCG0180());
		sb.append(", XCG0248=");
		sb.append(getXCG0248());
		sb.append(", XCG0181=");
		sb.append(getXCG0181());
		sb.append(", XCG0182=");
		sb.append(getXCG0182());
		sb.append(", XCG0183=");
		sb.append(getXCG0183());
		sb.append(", XCG0184=");
		sb.append(getXCG0184());
		sb.append(", XCG0249=");
		sb.append(getXCG0249());
		sb.append(", XCG0185=");
		sb.append(getXCG0185());
		sb.append(", XCG0186=");
		sb.append(getXCG0186());
		sb.append(", XCG0187=");
		sb.append(getXCG0187());
		sb.append(", XCG0188=");
		sb.append(getXCG0188());
		sb.append(", XCG0250=");
		sb.append(getXCG0250());
		sb.append(", XCG0189=");
		sb.append(getXCG0189());
		sb.append(", XCG0190=");
		sb.append(getXCG0190());
		sb.append(", XCG0191=");
		sb.append(getXCG0191());
		sb.append(", XCG0192=");
		sb.append(getXCG0192());
		sb.append(", XCG0251=");
		sb.append(getXCG0251());
		sb.append(", XCG0193=");
		sb.append(getXCG0193());
		sb.append(", XCG0194=");
		sb.append(getXCG0194());
		sb.append(", XCG0195=");
		sb.append(getXCG0195());
		sb.append(", XCG0196=");
		sb.append(getXCG0196());
		sb.append(", XCG0197=");
		sb.append(getXCG0197());
		sb.append(", XCG0198=");
		sb.append(getXCG0198());
		sb.append(", XCG0199=");
		sb.append(getXCG0199());
		sb.append(", XCG0200=");
		sb.append(getXCG0200());
		sb.append(", XCG0201=");
		sb.append(getXCG0201());
		sb.append(", XCG0202=");
		sb.append(getXCG0202());
		sb.append(", XCG0203=");
		sb.append(getXCG0203());
		sb.append(", XCG0204=");
		sb.append(getXCG0204());
		sb.append(", XCG0205=");
		sb.append(getXCG0205());
		sb.append(", XCG0206=");
		sb.append(getXCG0206());
		sb.append(", XCG0207=");
		sb.append(getXCG0207());
		sb.append(", XCG0208=");
		sb.append(getXCG0208());
		sb.append(", XCG0209=");
		sb.append(getXCG0209());
		sb.append(", XCG0210=");
		sb.append(getXCG0210());
		sb.append(", XCG0211=");
		sb.append(getXCG0211());
		sb.append(", XCG0212=");
		sb.append(getXCG0212());
		sb.append(", XCG0213=");
		sb.append(getXCG0213());
		sb.append(", XCG0214=");
		sb.append(getXCG0214());
		sb.append(", XCG0215=");
		sb.append(getXCG0215());
		sb.append(", XCG0216=");
		sb.append(getXCG0216());
		sb.append(", XCG0217=");
		sb.append(getXCG0217());
		sb.append(", XCG0218=");
		sb.append(getXCG0218());
		sb.append(", XCG0219=");
		sb.append(getXCG0219());
		sb.append(", XCG2218=");
		sb.append(getXCG2218());
		sb.append(", XCG2219=");
		sb.append(getXCG2219());
		sb.append(", XCG0220=");
		sb.append(getXCG0220());
		sb.append(", XCG2220=");
		sb.append(getXCG2220());
		sb.append(", XCG0221=");
		sb.append(getXCG0221());
		sb.append(", XCG2221=");
		sb.append(getXCG2221());
		sb.append(", XCG0222=");
		sb.append(getXCG0222());
		sb.append(", XCG2222=");
		sb.append(getXCG2222());
		sb.append(", XCG0223=");
		sb.append(getXCG0223());
		sb.append(", XCG2223=");
		sb.append(getXCG2223());
		sb.append(", XCG0224=");
		sb.append(getXCG0224());
		sb.append(", XCG2224=");
		sb.append(getXCG2224());
		sb.append(", XCG0225=");
		sb.append(getXCG0225());
		sb.append(", XCG2225=");
		sb.append(getXCG2225());
		sb.append(", XCG0226=");
		sb.append(getXCG0226());
		sb.append(", XCG2226=");
		sb.append(getXCG2226());
		sb.append(", XCG0227=");
		sb.append(getXCG0227());
		sb.append(", XCG2227=");
		sb.append(getXCG2227());
		sb.append(", XCG0228=");
		sb.append(getXCG0228());
		sb.append(", XCG2228=");
		sb.append(getXCG2228());
		sb.append(", XCG0229=");
		sb.append(getXCG0229());
		sb.append(", XCG2229=");
		sb.append(getXCG2229());
		sb.append(", XCG0230=");
		sb.append(getXCG0230());
		sb.append(", XCG2230=");
		sb.append(getXCG2230());
		sb.append(", XCG0231=");
		sb.append(getXCG0231());
		sb.append(", XCG2231=");
		sb.append(getXCG2231());
		sb.append(", XCG0232=");
		sb.append(getXCG0232());
		sb.append(", XCG2232=");
		sb.append(getXCG2232());
		sb.append(", XCG0233=");
		sb.append(getXCG0233());
		sb.append(", XCG2233=");
		sb.append(getXCG2233());
		sb.append(", XCG0234=");
		sb.append(getXCG0234());
		sb.append(", XCG0235=");
		sb.append(getXCG0235());
		sb.append(", XCG2235=");
		sb.append(getXCG2235());
		sb.append(", XCG0236=");
		sb.append(getXCG0236());
		sb.append(", XCG0237=");
		sb.append(getXCG0237());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(517);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0129</column-name><column-value><![CDATA[");
		sb.append(getXCG0129());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0130</column-name><column-value><![CDATA[");
		sb.append(getXCG0130());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0131</column-name><column-value><![CDATA[");
		sb.append(getXCG0131());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0132</column-name><column-value><![CDATA[");
		sb.append(getXCG0132());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0133</column-name><column-value><![CDATA[");
		sb.append(getXCG0133());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0134</column-name><column-value><![CDATA[");
		sb.append(getXCG0134());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0135</column-name><column-value><![CDATA[");
		sb.append(getXCG0135());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2135</column-name><column-value><![CDATA[");
		sb.append(getXCG2135());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0136</column-name><column-value><![CDATA[");
		sb.append(getXCG0136());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2136</column-name><column-value><![CDATA[");
		sb.append(getXCG2136());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0137</column-name><column-value><![CDATA[");
		sb.append(getXCG0137());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2137</column-name><column-value><![CDATA[");
		sb.append(getXCG2137());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0138</column-name><column-value><![CDATA[");
		sb.append(getXCG0138());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2138</column-name><column-value><![CDATA[");
		sb.append(getXCG2138());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0139</column-name><column-value><![CDATA[");
		sb.append(getXCG0139());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2139</column-name><column-value><![CDATA[");
		sb.append(getXCG2139());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0140</column-name><column-value><![CDATA[");
		sb.append(getXCG0140());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2140</column-name><column-value><![CDATA[");
		sb.append(getXCG2140());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0141</column-name><column-value><![CDATA[");
		sb.append(getXCG0141());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2141</column-name><column-value><![CDATA[");
		sb.append(getXCG2141());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0142</column-name><column-value><![CDATA[");
		sb.append(getXCG0142());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2142</column-name><column-value><![CDATA[");
		sb.append(getXCG2142());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0143</column-name><column-value><![CDATA[");
		sb.append(getXCG0143());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2143</column-name><column-value><![CDATA[");
		sb.append(getXCG2143());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0144</column-name><column-value><![CDATA[");
		sb.append(getXCG0144());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2144</column-name><column-value><![CDATA[");
		sb.append(getXCG2144());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0145</column-name><column-value><![CDATA[");
		sb.append(getXCG0145());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2145</column-name><column-value><![CDATA[");
		sb.append(getXCG2145());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2245</column-name><column-value><![CDATA[");
		sb.append(getXCG2245());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0146</column-name><column-value><![CDATA[");
		sb.append(getXCG0146());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2146</column-name><column-value><![CDATA[");
		sb.append(getXCG2146());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2246</column-name><column-value><![CDATA[");
		sb.append(getXCG2246());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0147</column-name><column-value><![CDATA[");
		sb.append(getXCG0147());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2147</column-name><column-value><![CDATA[");
		sb.append(getXCG2147());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2247</column-name><column-value><![CDATA[");
		sb.append(getXCG2247());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0148</column-name><column-value><![CDATA[");
		sb.append(getXCG0148());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2148</column-name><column-value><![CDATA[");
		sb.append(getXCG2148());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2248</column-name><column-value><![CDATA[");
		sb.append(getXCG2248());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0149</column-name><column-value><![CDATA[");
		sb.append(getXCG0149());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2149</column-name><column-value><![CDATA[");
		sb.append(getXCG2149());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2249</column-name><column-value><![CDATA[");
		sb.append(getXCG2249());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0150</column-name><column-value><![CDATA[");
		sb.append(getXCG0150());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2150</column-name><column-value><![CDATA[");
		sb.append(getXCG2150());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2250</column-name><column-value><![CDATA[");
		sb.append(getXCG2250());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0151</column-name><column-value><![CDATA[");
		sb.append(getXCG0151());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2151</column-name><column-value><![CDATA[");
		sb.append(getXCG2151());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2251</column-name><column-value><![CDATA[");
		sb.append(getXCG2251());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0152</column-name><column-value><![CDATA[");
		sb.append(getXCG0152());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2152</column-name><column-value><![CDATA[");
		sb.append(getXCG2152());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2252</column-name><column-value><![CDATA[");
		sb.append(getXCG2252());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0153</column-name><column-value><![CDATA[");
		sb.append(getXCG0153());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2153</column-name><column-value><![CDATA[");
		sb.append(getXCG2153());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2253</column-name><column-value><![CDATA[");
		sb.append(getXCG2253());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0154</column-name><column-value><![CDATA[");
		sb.append(getXCG0154());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2154</column-name><column-value><![CDATA[");
		sb.append(getXCG2154());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2254</column-name><column-value><![CDATA[");
		sb.append(getXCG2254());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0155</column-name><column-value><![CDATA[");
		sb.append(getXCG0155());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0156</column-name><column-value><![CDATA[");
		sb.append(getXCG0156());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0242</column-name><column-value><![CDATA[");
		sb.append(getXCG0242());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0157</column-name><column-value><![CDATA[");
		sb.append(getXCG0157());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0158</column-name><column-value><![CDATA[");
		sb.append(getXCG0158());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0159</column-name><column-value><![CDATA[");
		sb.append(getXCG0159());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0160</column-name><column-value><![CDATA[");
		sb.append(getXCG0160());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0243</column-name><column-value><![CDATA[");
		sb.append(getXCG0243());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0161</column-name><column-value><![CDATA[");
		sb.append(getXCG0161());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0162</column-name><column-value><![CDATA[");
		sb.append(getXCG0162());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0163</column-name><column-value><![CDATA[");
		sb.append(getXCG0163());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0164</column-name><column-value><![CDATA[");
		sb.append(getXCG0164());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0244</column-name><column-value><![CDATA[");
		sb.append(getXCG0244());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0165</column-name><column-value><![CDATA[");
		sb.append(getXCG0165());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0166</column-name><column-value><![CDATA[");
		sb.append(getXCG0166());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0167</column-name><column-value><![CDATA[");
		sb.append(getXCG0167());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0168</column-name><column-value><![CDATA[");
		sb.append(getXCG0168());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0245</column-name><column-value><![CDATA[");
		sb.append(getXCG0245());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0169</column-name><column-value><![CDATA[");
		sb.append(getXCG0169());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0170</column-name><column-value><![CDATA[");
		sb.append(getXCG0170());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0171</column-name><column-value><![CDATA[");
		sb.append(getXCG0171());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0172</column-name><column-value><![CDATA[");
		sb.append(getXCG0172());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0246</column-name><column-value><![CDATA[");
		sb.append(getXCG0246());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0173</column-name><column-value><![CDATA[");
		sb.append(getXCG0173());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0174</column-name><column-value><![CDATA[");
		sb.append(getXCG0174());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0175</column-name><column-value><![CDATA[");
		sb.append(getXCG0175());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0176</column-name><column-value><![CDATA[");
		sb.append(getXCG0176());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0247</column-name><column-value><![CDATA[");
		sb.append(getXCG0247());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0177</column-name><column-value><![CDATA[");
		sb.append(getXCG0177());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0178</column-name><column-value><![CDATA[");
		sb.append(getXCG0178());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0179</column-name><column-value><![CDATA[");
		sb.append(getXCG0179());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0180</column-name><column-value><![CDATA[");
		sb.append(getXCG0180());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0248</column-name><column-value><![CDATA[");
		sb.append(getXCG0248());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0181</column-name><column-value><![CDATA[");
		sb.append(getXCG0181());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0182</column-name><column-value><![CDATA[");
		sb.append(getXCG0182());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0183</column-name><column-value><![CDATA[");
		sb.append(getXCG0183());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0184</column-name><column-value><![CDATA[");
		sb.append(getXCG0184());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0249</column-name><column-value><![CDATA[");
		sb.append(getXCG0249());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0185</column-name><column-value><![CDATA[");
		sb.append(getXCG0185());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0186</column-name><column-value><![CDATA[");
		sb.append(getXCG0186());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0187</column-name><column-value><![CDATA[");
		sb.append(getXCG0187());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0188</column-name><column-value><![CDATA[");
		sb.append(getXCG0188());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0250</column-name><column-value><![CDATA[");
		sb.append(getXCG0250());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0189</column-name><column-value><![CDATA[");
		sb.append(getXCG0189());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0190</column-name><column-value><![CDATA[");
		sb.append(getXCG0190());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0191</column-name><column-value><![CDATA[");
		sb.append(getXCG0191());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0192</column-name><column-value><![CDATA[");
		sb.append(getXCG0192());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0251</column-name><column-value><![CDATA[");
		sb.append(getXCG0251());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0193</column-name><column-value><![CDATA[");
		sb.append(getXCG0193());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0194</column-name><column-value><![CDATA[");
		sb.append(getXCG0194());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0195</column-name><column-value><![CDATA[");
		sb.append(getXCG0195());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0196</column-name><column-value><![CDATA[");
		sb.append(getXCG0196());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0197</column-name><column-value><![CDATA[");
		sb.append(getXCG0197());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0198</column-name><column-value><![CDATA[");
		sb.append(getXCG0198());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0199</column-name><column-value><![CDATA[");
		sb.append(getXCG0199());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0200</column-name><column-value><![CDATA[");
		sb.append(getXCG0200());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0201</column-name><column-value><![CDATA[");
		sb.append(getXCG0201());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0202</column-name><column-value><![CDATA[");
		sb.append(getXCG0202());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0203</column-name><column-value><![CDATA[");
		sb.append(getXCG0203());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0204</column-name><column-value><![CDATA[");
		sb.append(getXCG0204());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0205</column-name><column-value><![CDATA[");
		sb.append(getXCG0205());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0206</column-name><column-value><![CDATA[");
		sb.append(getXCG0206());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0207</column-name><column-value><![CDATA[");
		sb.append(getXCG0207());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0208</column-name><column-value><![CDATA[");
		sb.append(getXCG0208());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0209</column-name><column-value><![CDATA[");
		sb.append(getXCG0209());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0210</column-name><column-value><![CDATA[");
		sb.append(getXCG0210());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0211</column-name><column-value><![CDATA[");
		sb.append(getXCG0211());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0212</column-name><column-value><![CDATA[");
		sb.append(getXCG0212());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0213</column-name><column-value><![CDATA[");
		sb.append(getXCG0213());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0214</column-name><column-value><![CDATA[");
		sb.append(getXCG0214());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0215</column-name><column-value><![CDATA[");
		sb.append(getXCG0215());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0216</column-name><column-value><![CDATA[");
		sb.append(getXCG0216());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0217</column-name><column-value><![CDATA[");
		sb.append(getXCG0217());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0218</column-name><column-value><![CDATA[");
		sb.append(getXCG0218());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0219</column-name><column-value><![CDATA[");
		sb.append(getXCG0219());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2218</column-name><column-value><![CDATA[");
		sb.append(getXCG2218());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2219</column-name><column-value><![CDATA[");
		sb.append(getXCG2219());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0220</column-name><column-value><![CDATA[");
		sb.append(getXCG0220());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2220</column-name><column-value><![CDATA[");
		sb.append(getXCG2220());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0221</column-name><column-value><![CDATA[");
		sb.append(getXCG0221());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2221</column-name><column-value><![CDATA[");
		sb.append(getXCG2221());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0222</column-name><column-value><![CDATA[");
		sb.append(getXCG0222());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2222</column-name><column-value><![CDATA[");
		sb.append(getXCG2222());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0223</column-name><column-value><![CDATA[");
		sb.append(getXCG0223());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2223</column-name><column-value><![CDATA[");
		sb.append(getXCG2223());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0224</column-name><column-value><![CDATA[");
		sb.append(getXCG0224());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2224</column-name><column-value><![CDATA[");
		sb.append(getXCG2224());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0225</column-name><column-value><![CDATA[");
		sb.append(getXCG0225());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2225</column-name><column-value><![CDATA[");
		sb.append(getXCG2225());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0226</column-name><column-value><![CDATA[");
		sb.append(getXCG0226());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2226</column-name><column-value><![CDATA[");
		sb.append(getXCG2226());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0227</column-name><column-value><![CDATA[");
		sb.append(getXCG0227());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2227</column-name><column-value><![CDATA[");
		sb.append(getXCG2227());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0228</column-name><column-value><![CDATA[");
		sb.append(getXCG0228());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2228</column-name><column-value><![CDATA[");
		sb.append(getXCG2228());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0229</column-name><column-value><![CDATA[");
		sb.append(getXCG0229());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2229</column-name><column-value><![CDATA[");
		sb.append(getXCG2229());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0230</column-name><column-value><![CDATA[");
		sb.append(getXCG0230());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2230</column-name><column-value><![CDATA[");
		sb.append(getXCG2230());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0231</column-name><column-value><![CDATA[");
		sb.append(getXCG0231());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2231</column-name><column-value><![CDATA[");
		sb.append(getXCG2231());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0232</column-name><column-value><![CDATA[");
		sb.append(getXCG0232());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2232</column-name><column-value><![CDATA[");
		sb.append(getXCG2232());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0233</column-name><column-value><![CDATA[");
		sb.append(getXCG0233());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2233</column-name><column-value><![CDATA[");
		sb.append(getXCG2233());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0234</column-name><column-value><![CDATA[");
		sb.append(getXCG0234());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0235</column-name><column-value><![CDATA[");
		sb.append(getXCG0235());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG2235</column-name><column-value><![CDATA[");
		sb.append(getXCG2235());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0236</column-name><column-value><![CDATA[");
		sb.append(getXCG0236());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0237</column-name><column-value><![CDATA[");
		sb.append(getXCG0237());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XCG0129;
	private String _XCG0130;
	private String _XCG0131;
	private String _XCG0132;
	private String _XCG0133;
	private String _XCG0134;
	private String _XCG0135;
	private String _XCG2135;
	private String _XCG0136;
	private String _XCG2136;
	private String _XCG0137;
	private String _XCG2137;
	private String _XCG0138;
	private String _XCG2138;
	private String _XCG0139;
	private String _XCG2139;
	private String _XCG0140;
	private String _XCG2140;
	private String _XCG0141;
	private String _XCG2141;
	private String _XCG0142;
	private String _XCG2142;
	private String _XCG0143;
	private String _XCG2143;
	private String _XCG0144;
	private String _XCG2144;
	private String _XCG0145;
	private String _XCG2145;
	private String _XCG2245;
	private String _XCG0146;
	private String _XCG2146;
	private String _XCG2246;
	private String _XCG0147;
	private String _XCG2147;
	private String _XCG2247;
	private String _XCG0148;
	private String _XCG2148;
	private String _XCG2248;
	private String _XCG0149;
	private String _XCG2149;
	private String _XCG2249;
	private String _XCG0150;
	private String _XCG2150;
	private String _XCG2250;
	private String _XCG0151;
	private String _XCG2151;
	private String _XCG2251;
	private String _XCG0152;
	private String _XCG2152;
	private String _XCG2252;
	private String _XCG0153;
	private String _XCG2153;
	private String _XCG2253;
	private String _XCG0154;
	private String _XCG2154;
	private String _XCG2254;
	private String _XCG0155;
	private String _XCG0156;
	private String _XCG0242;
	private String _XCG0157;
	private String _XCG0158;
	private String _XCG0159;
	private String _XCG0160;
	private String _XCG0243;
	private String _XCG0161;
	private String _XCG0162;
	private String _XCG0163;
	private String _XCG0164;
	private String _XCG0244;
	private String _XCG0165;
	private String _XCG0166;
	private String _XCG0167;
	private String _XCG0168;
	private String _XCG0245;
	private String _XCG0169;
	private String _XCG0170;
	private String _XCG0171;
	private String _XCG0172;
	private String _XCG0246;
	private String _XCG0173;
	private String _XCG0174;
	private String _XCG0175;
	private String _XCG0176;
	private String _XCG0247;
	private String _XCG0177;
	private String _XCG0178;
	private String _XCG0179;
	private String _XCG0180;
	private String _XCG0248;
	private String _XCG0181;
	private String _XCG0182;
	private String _XCG0183;
	private String _XCG0184;
	private String _XCG0249;
	private String _XCG0185;
	private String _XCG0186;
	private String _XCG0187;
	private String _XCG0188;
	private String _XCG0250;
	private String _XCG0189;
	private String _XCG0190;
	private String _XCG0191;
	private String _XCG0192;
	private String _XCG0251;
	private String _XCG0193;
	private String _XCG0194;
	private String _XCG0195;
	private String _XCG0196;
	private String _XCG0197;
	private String _XCG0198;
	private String _XCG0199;
	private String _XCG0200;
	private String _XCG0201;
	private String _XCG0202;
	private String _XCG0203;
	private String _XCG0204;
	private String _XCG0205;
	private String _XCG0206;
	private String _XCG0207;
	private String _XCG0208;
	private String _XCG0209;
	private String _XCG0210;
	private String _XCG0211;
	private String _XCG0212;
	private String _XCG0213;
	private String _XCG0214;
	private String _XCG0215;
	private String _XCG0216;
	private String _XCG0217;
	private String _XCG0218;
	private String _XCG0219;
	private String _XCG2218;
	private String _XCG2219;
	private String _XCG0220;
	private String _XCG2220;
	private String _XCG0221;
	private String _XCG2221;
	private String _XCG0222;
	private String _XCG2222;
	private String _XCG0223;
	private String _XCG2223;
	private String _XCG0224;
	private String _XCG2224;
	private String _XCG0225;
	private String _XCG2225;
	private String _XCG0226;
	private String _XCG2226;
	private String _XCG0227;
	private String _XCG2227;
	private String _XCG0228;
	private String _XCG2228;
	private String _XCG0229;
	private String _XCG2229;
	private String _XCG0230;
	private String _XCG2230;
	private String _XCG0231;
	private String _XCG2231;
	private String _XCG0232;
	private String _XCG2232;
	private String _XCG0233;
	private String _XCG2233;
	private String _XCG0234;
	private String _XCG0235;
	private String _XCG2235;
	private String _XCG0236;
	private String _XCG0237;
	private BaseModel<?> _thongsochungchixecogioiphan2RemoteModel;
}