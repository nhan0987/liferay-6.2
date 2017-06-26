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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXECOGIOIPHAN2ServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXECOGIOIPHAN2ServiceSoap
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2Soap implements Serializable {
	public static THONGSOCHUNGCHIXECOGIOIPHAN2Soap toSoapModel(
		THONGSOCHUNGCHIXECOGIOIPHAN2 model) {
		THONGSOCHUNGCHIXECOGIOIPHAN2Soap soapModel = new THONGSOCHUNGCHIXECOGIOIPHAN2Soap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSynchDate(model.getSynchDate());
		soapModel.setXCG0129(model.getXCG0129());
		soapModel.setXCG0130(model.getXCG0130());
		soapModel.setXCG0131(model.getXCG0131());
		soapModel.setXCG0132(model.getXCG0132());
		soapModel.setXCG0133(model.getXCG0133());
		soapModel.setXCG0134(model.getXCG0134());
		soapModel.setXCG0135(model.getXCG0135());
		soapModel.setXCG2135(model.getXCG2135());
		soapModel.setXCG0136(model.getXCG0136());
		soapModel.setXCG2136(model.getXCG2136());
		soapModel.setXCG0137(model.getXCG0137());
		soapModel.setXCG2137(model.getXCG2137());
		soapModel.setXCG0138(model.getXCG0138());
		soapModel.setXCG2138(model.getXCG2138());
		soapModel.setXCG0139(model.getXCG0139());
		soapModel.setXCG2139(model.getXCG2139());
		soapModel.setXCG0140(model.getXCG0140());
		soapModel.setXCG2140(model.getXCG2140());
		soapModel.setXCG0141(model.getXCG0141());
		soapModel.setXCG2141(model.getXCG2141());
		soapModel.setXCG0142(model.getXCG0142());
		soapModel.setXCG2142(model.getXCG2142());
		soapModel.setXCG0143(model.getXCG0143());
		soapModel.setXCG2143(model.getXCG2143());
		soapModel.setXCG0144(model.getXCG0144());
		soapModel.setXCG2144(model.getXCG2144());
		soapModel.setXCG0145(model.getXCG0145());
		soapModel.setXCG2145(model.getXCG2145());
		soapModel.setXCG2245(model.getXCG2245());
		soapModel.setXCG0146(model.getXCG0146());
		soapModel.setXCG2146(model.getXCG2146());
		soapModel.setXCG2246(model.getXCG2246());
		soapModel.setXCG0147(model.getXCG0147());
		soapModel.setXCG2147(model.getXCG2147());
		soapModel.setXCG2247(model.getXCG2247());
		soapModel.setXCG0148(model.getXCG0148());
		soapModel.setXCG2148(model.getXCG2148());
		soapModel.setXCG2248(model.getXCG2248());
		soapModel.setXCG0149(model.getXCG0149());
		soapModel.setXCG2149(model.getXCG2149());
		soapModel.setXCG2249(model.getXCG2249());
		soapModel.setXCG0150(model.getXCG0150());
		soapModel.setXCG2150(model.getXCG2150());
		soapModel.setXCG2250(model.getXCG2250());
		soapModel.setXCG0151(model.getXCG0151());
		soapModel.setXCG2151(model.getXCG2151());
		soapModel.setXCG2251(model.getXCG2251());
		soapModel.setXCG0152(model.getXCG0152());
		soapModel.setXCG2152(model.getXCG2152());
		soapModel.setXCG2252(model.getXCG2252());
		soapModel.setXCG0153(model.getXCG0153());
		soapModel.setXCG2153(model.getXCG2153());
		soapModel.setXCG2253(model.getXCG2253());
		soapModel.setXCG0154(model.getXCG0154());
		soapModel.setXCG2154(model.getXCG2154());
		soapModel.setXCG2254(model.getXCG2254());
		soapModel.setXCG0155(model.getXCG0155());
		soapModel.setXCG0156(model.getXCG0156());
		soapModel.setXCG0242(model.getXCG0242());
		soapModel.setXCG0157(model.getXCG0157());
		soapModel.setXCG0158(model.getXCG0158());
		soapModel.setXCG0159(model.getXCG0159());
		soapModel.setXCG0160(model.getXCG0160());
		soapModel.setXCG0243(model.getXCG0243());
		soapModel.setXCG0161(model.getXCG0161());
		soapModel.setXCG0162(model.getXCG0162());
		soapModel.setXCG0163(model.getXCG0163());
		soapModel.setXCG0164(model.getXCG0164());
		soapModel.setXCG0244(model.getXCG0244());
		soapModel.setXCG0165(model.getXCG0165());
		soapModel.setXCG0166(model.getXCG0166());
		soapModel.setXCG0167(model.getXCG0167());
		soapModel.setXCG0168(model.getXCG0168());
		soapModel.setXCG0245(model.getXCG0245());
		soapModel.setXCG0169(model.getXCG0169());
		soapModel.setXCG0170(model.getXCG0170());
		soapModel.setXCG0171(model.getXCG0171());
		soapModel.setXCG0172(model.getXCG0172());
		soapModel.setXCG0246(model.getXCG0246());
		soapModel.setXCG0173(model.getXCG0173());
		soapModel.setXCG0174(model.getXCG0174());
		soapModel.setXCG0175(model.getXCG0175());
		soapModel.setXCG0176(model.getXCG0176());
		soapModel.setXCG0247(model.getXCG0247());
		soapModel.setXCG0177(model.getXCG0177());
		soapModel.setXCG0178(model.getXCG0178());
		soapModel.setXCG0179(model.getXCG0179());
		soapModel.setXCG0180(model.getXCG0180());
		soapModel.setXCG0248(model.getXCG0248());
		soapModel.setXCG0181(model.getXCG0181());
		soapModel.setXCG0182(model.getXCG0182());
		soapModel.setXCG0183(model.getXCG0183());
		soapModel.setXCG0184(model.getXCG0184());
		soapModel.setXCG0249(model.getXCG0249());
		soapModel.setXCG0185(model.getXCG0185());
		soapModel.setXCG0186(model.getXCG0186());
		soapModel.setXCG0187(model.getXCG0187());
		soapModel.setXCG0188(model.getXCG0188());
		soapModel.setXCG0250(model.getXCG0250());
		soapModel.setXCG0189(model.getXCG0189());
		soapModel.setXCG0190(model.getXCG0190());
		soapModel.setXCG0191(model.getXCG0191());
		soapModel.setXCG0192(model.getXCG0192());
		soapModel.setXCG0251(model.getXCG0251());
		soapModel.setXCG0193(model.getXCG0193());
		soapModel.setXCG0194(model.getXCG0194());
		soapModel.setXCG0195(model.getXCG0195());
		soapModel.setXCG0196(model.getXCG0196());
		soapModel.setXCG0197(model.getXCG0197());
		soapModel.setXCG0198(model.getXCG0198());
		soapModel.setXCG0199(model.getXCG0199());
		soapModel.setXCG0200(model.getXCG0200());
		soapModel.setXCG0201(model.getXCG0201());
		soapModel.setXCG0202(model.getXCG0202());
		soapModel.setXCG0203(model.getXCG0203());
		soapModel.setXCG0204(model.getXCG0204());
		soapModel.setXCG0205(model.getXCG0205());
		soapModel.setXCG0206(model.getXCG0206());
		soapModel.setXCG0207(model.getXCG0207());
		soapModel.setXCG0208(model.getXCG0208());
		soapModel.setXCG0209(model.getXCG0209());
		soapModel.setXCG0210(model.getXCG0210());
		soapModel.setXCG0211(model.getXCG0211());
		soapModel.setXCG0212(model.getXCG0212());
		soapModel.setXCG0213(model.getXCG0213());
		soapModel.setXCG0214(model.getXCG0214());
		soapModel.setXCG0215(model.getXCG0215());
		soapModel.setXCG0216(model.getXCG0216());
		soapModel.setXCG0217(model.getXCG0217());
		soapModel.setXCG0218(model.getXCG0218());
		soapModel.setXCG0219(model.getXCG0219());
		soapModel.setXCG2218(model.getXCG2218());
		soapModel.setXCG2219(model.getXCG2219());
		soapModel.setXCG0220(model.getXCG0220());
		soapModel.setXCG2220(model.getXCG2220());
		soapModel.setXCG0221(model.getXCG0221());
		soapModel.setXCG2221(model.getXCG2221());
		soapModel.setXCG0222(model.getXCG0222());
		soapModel.setXCG2222(model.getXCG2222());
		soapModel.setXCG0223(model.getXCG0223());
		soapModel.setXCG2223(model.getXCG2223());
		soapModel.setXCG0224(model.getXCG0224());
		soapModel.setXCG2224(model.getXCG2224());
		soapModel.setXCG0225(model.getXCG0225());
		soapModel.setXCG2225(model.getXCG2225());
		soapModel.setXCG0226(model.getXCG0226());
		soapModel.setXCG2226(model.getXCG2226());
		soapModel.setXCG0227(model.getXCG0227());
		soapModel.setXCG2227(model.getXCG2227());
		soapModel.setXCG0228(model.getXCG0228());
		soapModel.setXCG2228(model.getXCG2228());
		soapModel.setXCG0229(model.getXCG0229());
		soapModel.setXCG2229(model.getXCG2229());
		soapModel.setXCG0230(model.getXCG0230());
		soapModel.setXCG2230(model.getXCG2230());
		soapModel.setXCG0231(model.getXCG0231());
		soapModel.setXCG2231(model.getXCG2231());
		soapModel.setXCG0232(model.getXCG0232());
		soapModel.setXCG2232(model.getXCG2232());
		soapModel.setXCG0233(model.getXCG0233());
		soapModel.setXCG2233(model.getXCG2233());
		soapModel.setXCG0234(model.getXCG0234());
		soapModel.setXCG0235(model.getXCG0235());
		soapModel.setXCG2235(model.getXCG2235());
		soapModel.setXCG0236(model.getXCG0236());
		soapModel.setXCG0237(model.getXCG0237());

		return soapModel;
	}

	public static THONGSOCHUNGCHIXECOGIOIPHAN2Soap[] toSoapModels(
		THONGSOCHUNGCHIXECOGIOIPHAN2[] models) {
		THONGSOCHUNGCHIXECOGIOIPHAN2Soap[] soapModels = new THONGSOCHUNGCHIXECOGIOIPHAN2Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXECOGIOIPHAN2Soap[][] toSoapModels(
		THONGSOCHUNGCHIXECOGIOIPHAN2[][] models) {
		THONGSOCHUNGCHIXECOGIOIPHAN2Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGSOCHUNGCHIXECOGIOIPHAN2Soap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGSOCHUNGCHIXECOGIOIPHAN2Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXECOGIOIPHAN2Soap[] toSoapModels(
		List<THONGSOCHUNGCHIXECOGIOIPHAN2> models) {
		List<THONGSOCHUNGCHIXECOGIOIPHAN2Soap> soapModels = new ArrayList<THONGSOCHUNGCHIXECOGIOIPHAN2Soap>(models.size());

		for (THONGSOCHUNGCHIXECOGIOIPHAN2 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGSOCHUNGCHIXECOGIOIPHAN2Soap[soapModels.size()]);
	}

	public THONGSOCHUNGCHIXECOGIOIPHAN2Soap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;
	}

	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;
	}

	public Date getSynchDate() {
		return _SynchDate;
	}

	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;
	}

	public String getXCG0129() {
		return _XCG0129;
	}

	public void setXCG0129(String XCG0129) {
		_XCG0129 = XCG0129;
	}

	public String getXCG0130() {
		return _XCG0130;
	}

	public void setXCG0130(String XCG0130) {
		_XCG0130 = XCG0130;
	}

	public String getXCG0131() {
		return _XCG0131;
	}

	public void setXCG0131(String XCG0131) {
		_XCG0131 = XCG0131;
	}

	public String getXCG0132() {
		return _XCG0132;
	}

	public void setXCG0132(String XCG0132) {
		_XCG0132 = XCG0132;
	}

	public String getXCG0133() {
		return _XCG0133;
	}

	public void setXCG0133(String XCG0133) {
		_XCG0133 = XCG0133;
	}

	public String getXCG0134() {
		return _XCG0134;
	}

	public void setXCG0134(String XCG0134) {
		_XCG0134 = XCG0134;
	}

	public String getXCG0135() {
		return _XCG0135;
	}

	public void setXCG0135(String XCG0135) {
		_XCG0135 = XCG0135;
	}

	public String getXCG2135() {
		return _XCG2135;
	}

	public void setXCG2135(String XCG2135) {
		_XCG2135 = XCG2135;
	}

	public String getXCG0136() {
		return _XCG0136;
	}

	public void setXCG0136(String XCG0136) {
		_XCG0136 = XCG0136;
	}

	public String getXCG2136() {
		return _XCG2136;
	}

	public void setXCG2136(String XCG2136) {
		_XCG2136 = XCG2136;
	}

	public String getXCG0137() {
		return _XCG0137;
	}

	public void setXCG0137(String XCG0137) {
		_XCG0137 = XCG0137;
	}

	public String getXCG2137() {
		return _XCG2137;
	}

	public void setXCG2137(String XCG2137) {
		_XCG2137 = XCG2137;
	}

	public String getXCG0138() {
		return _XCG0138;
	}

	public void setXCG0138(String XCG0138) {
		_XCG0138 = XCG0138;
	}

	public String getXCG2138() {
		return _XCG2138;
	}

	public void setXCG2138(String XCG2138) {
		_XCG2138 = XCG2138;
	}

	public String getXCG0139() {
		return _XCG0139;
	}

	public void setXCG0139(String XCG0139) {
		_XCG0139 = XCG0139;
	}

	public String getXCG2139() {
		return _XCG2139;
	}

	public void setXCG2139(String XCG2139) {
		_XCG2139 = XCG2139;
	}

	public String getXCG0140() {
		return _XCG0140;
	}

	public void setXCG0140(String XCG0140) {
		_XCG0140 = XCG0140;
	}

	public String getXCG2140() {
		return _XCG2140;
	}

	public void setXCG2140(String XCG2140) {
		_XCG2140 = XCG2140;
	}

	public String getXCG0141() {
		return _XCG0141;
	}

	public void setXCG0141(String XCG0141) {
		_XCG0141 = XCG0141;
	}

	public String getXCG2141() {
		return _XCG2141;
	}

	public void setXCG2141(String XCG2141) {
		_XCG2141 = XCG2141;
	}

	public String getXCG0142() {
		return _XCG0142;
	}

	public void setXCG0142(String XCG0142) {
		_XCG0142 = XCG0142;
	}

	public String getXCG2142() {
		return _XCG2142;
	}

	public void setXCG2142(String XCG2142) {
		_XCG2142 = XCG2142;
	}

	public String getXCG0143() {
		return _XCG0143;
	}

	public void setXCG0143(String XCG0143) {
		_XCG0143 = XCG0143;
	}

	public String getXCG2143() {
		return _XCG2143;
	}

	public void setXCG2143(String XCG2143) {
		_XCG2143 = XCG2143;
	}

	public String getXCG0144() {
		return _XCG0144;
	}

	public void setXCG0144(String XCG0144) {
		_XCG0144 = XCG0144;
	}

	public String getXCG2144() {
		return _XCG2144;
	}

	public void setXCG2144(String XCG2144) {
		_XCG2144 = XCG2144;
	}

	public String getXCG0145() {
		return _XCG0145;
	}

	public void setXCG0145(String XCG0145) {
		_XCG0145 = XCG0145;
	}

	public String getXCG2145() {
		return _XCG2145;
	}

	public void setXCG2145(String XCG2145) {
		_XCG2145 = XCG2145;
	}

	public String getXCG2245() {
		return _XCG2245;
	}

	public void setXCG2245(String XCG2245) {
		_XCG2245 = XCG2245;
	}

	public String getXCG0146() {
		return _XCG0146;
	}

	public void setXCG0146(String XCG0146) {
		_XCG0146 = XCG0146;
	}

	public String getXCG2146() {
		return _XCG2146;
	}

	public void setXCG2146(String XCG2146) {
		_XCG2146 = XCG2146;
	}

	public String getXCG2246() {
		return _XCG2246;
	}

	public void setXCG2246(String XCG2246) {
		_XCG2246 = XCG2246;
	}

	public String getXCG0147() {
		return _XCG0147;
	}

	public void setXCG0147(String XCG0147) {
		_XCG0147 = XCG0147;
	}

	public String getXCG2147() {
		return _XCG2147;
	}

	public void setXCG2147(String XCG2147) {
		_XCG2147 = XCG2147;
	}

	public String getXCG2247() {
		return _XCG2247;
	}

	public void setXCG2247(String XCG2247) {
		_XCG2247 = XCG2247;
	}

	public String getXCG0148() {
		return _XCG0148;
	}

	public void setXCG0148(String XCG0148) {
		_XCG0148 = XCG0148;
	}

	public String getXCG2148() {
		return _XCG2148;
	}

	public void setXCG2148(String XCG2148) {
		_XCG2148 = XCG2148;
	}

	public String getXCG2248() {
		return _XCG2248;
	}

	public void setXCG2248(String XCG2248) {
		_XCG2248 = XCG2248;
	}

	public String getXCG0149() {
		return _XCG0149;
	}

	public void setXCG0149(String XCG0149) {
		_XCG0149 = XCG0149;
	}

	public String getXCG2149() {
		return _XCG2149;
	}

	public void setXCG2149(String XCG2149) {
		_XCG2149 = XCG2149;
	}

	public String getXCG2249() {
		return _XCG2249;
	}

	public void setXCG2249(String XCG2249) {
		_XCG2249 = XCG2249;
	}

	public String getXCG0150() {
		return _XCG0150;
	}

	public void setXCG0150(String XCG0150) {
		_XCG0150 = XCG0150;
	}

	public String getXCG2150() {
		return _XCG2150;
	}

	public void setXCG2150(String XCG2150) {
		_XCG2150 = XCG2150;
	}

	public String getXCG2250() {
		return _XCG2250;
	}

	public void setXCG2250(String XCG2250) {
		_XCG2250 = XCG2250;
	}

	public String getXCG0151() {
		return _XCG0151;
	}

	public void setXCG0151(String XCG0151) {
		_XCG0151 = XCG0151;
	}

	public String getXCG2151() {
		return _XCG2151;
	}

	public void setXCG2151(String XCG2151) {
		_XCG2151 = XCG2151;
	}

	public String getXCG2251() {
		return _XCG2251;
	}

	public void setXCG2251(String XCG2251) {
		_XCG2251 = XCG2251;
	}

	public String getXCG0152() {
		return _XCG0152;
	}

	public void setXCG0152(String XCG0152) {
		_XCG0152 = XCG0152;
	}

	public String getXCG2152() {
		return _XCG2152;
	}

	public void setXCG2152(String XCG2152) {
		_XCG2152 = XCG2152;
	}

	public String getXCG2252() {
		return _XCG2252;
	}

	public void setXCG2252(String XCG2252) {
		_XCG2252 = XCG2252;
	}

	public String getXCG0153() {
		return _XCG0153;
	}

	public void setXCG0153(String XCG0153) {
		_XCG0153 = XCG0153;
	}

	public String getXCG2153() {
		return _XCG2153;
	}

	public void setXCG2153(String XCG2153) {
		_XCG2153 = XCG2153;
	}

	public String getXCG2253() {
		return _XCG2253;
	}

	public void setXCG2253(String XCG2253) {
		_XCG2253 = XCG2253;
	}

	public String getXCG0154() {
		return _XCG0154;
	}

	public void setXCG0154(String XCG0154) {
		_XCG0154 = XCG0154;
	}

	public String getXCG2154() {
		return _XCG2154;
	}

	public void setXCG2154(String XCG2154) {
		_XCG2154 = XCG2154;
	}

	public String getXCG2254() {
		return _XCG2254;
	}

	public void setXCG2254(String XCG2254) {
		_XCG2254 = XCG2254;
	}

	public String getXCG0155() {
		return _XCG0155;
	}

	public void setXCG0155(String XCG0155) {
		_XCG0155 = XCG0155;
	}

	public String getXCG0156() {
		return _XCG0156;
	}

	public void setXCG0156(String XCG0156) {
		_XCG0156 = XCG0156;
	}

	public String getXCG0242() {
		return _XCG0242;
	}

	public void setXCG0242(String XCG0242) {
		_XCG0242 = XCG0242;
	}

	public String getXCG0157() {
		return _XCG0157;
	}

	public void setXCG0157(String XCG0157) {
		_XCG0157 = XCG0157;
	}

	public String getXCG0158() {
		return _XCG0158;
	}

	public void setXCG0158(String XCG0158) {
		_XCG0158 = XCG0158;
	}

	public String getXCG0159() {
		return _XCG0159;
	}

	public void setXCG0159(String XCG0159) {
		_XCG0159 = XCG0159;
	}

	public String getXCG0160() {
		return _XCG0160;
	}

	public void setXCG0160(String XCG0160) {
		_XCG0160 = XCG0160;
	}

	public String getXCG0243() {
		return _XCG0243;
	}

	public void setXCG0243(String XCG0243) {
		_XCG0243 = XCG0243;
	}

	public String getXCG0161() {
		return _XCG0161;
	}

	public void setXCG0161(String XCG0161) {
		_XCG0161 = XCG0161;
	}

	public String getXCG0162() {
		return _XCG0162;
	}

	public void setXCG0162(String XCG0162) {
		_XCG0162 = XCG0162;
	}

	public String getXCG0163() {
		return _XCG0163;
	}

	public void setXCG0163(String XCG0163) {
		_XCG0163 = XCG0163;
	}

	public String getXCG0164() {
		return _XCG0164;
	}

	public void setXCG0164(String XCG0164) {
		_XCG0164 = XCG0164;
	}

	public String getXCG0244() {
		return _XCG0244;
	}

	public void setXCG0244(String XCG0244) {
		_XCG0244 = XCG0244;
	}

	public String getXCG0165() {
		return _XCG0165;
	}

	public void setXCG0165(String XCG0165) {
		_XCG0165 = XCG0165;
	}

	public String getXCG0166() {
		return _XCG0166;
	}

	public void setXCG0166(String XCG0166) {
		_XCG0166 = XCG0166;
	}

	public String getXCG0167() {
		return _XCG0167;
	}

	public void setXCG0167(String XCG0167) {
		_XCG0167 = XCG0167;
	}

	public String getXCG0168() {
		return _XCG0168;
	}

	public void setXCG0168(String XCG0168) {
		_XCG0168 = XCG0168;
	}

	public String getXCG0245() {
		return _XCG0245;
	}

	public void setXCG0245(String XCG0245) {
		_XCG0245 = XCG0245;
	}

	public String getXCG0169() {
		return _XCG0169;
	}

	public void setXCG0169(String XCG0169) {
		_XCG0169 = XCG0169;
	}

	public String getXCG0170() {
		return _XCG0170;
	}

	public void setXCG0170(String XCG0170) {
		_XCG0170 = XCG0170;
	}

	public String getXCG0171() {
		return _XCG0171;
	}

	public void setXCG0171(String XCG0171) {
		_XCG0171 = XCG0171;
	}

	public String getXCG0172() {
		return _XCG0172;
	}

	public void setXCG0172(String XCG0172) {
		_XCG0172 = XCG0172;
	}

	public String getXCG0246() {
		return _XCG0246;
	}

	public void setXCG0246(String XCG0246) {
		_XCG0246 = XCG0246;
	}

	public String getXCG0173() {
		return _XCG0173;
	}

	public void setXCG0173(String XCG0173) {
		_XCG0173 = XCG0173;
	}

	public String getXCG0174() {
		return _XCG0174;
	}

	public void setXCG0174(String XCG0174) {
		_XCG0174 = XCG0174;
	}

	public String getXCG0175() {
		return _XCG0175;
	}

	public void setXCG0175(String XCG0175) {
		_XCG0175 = XCG0175;
	}

	public String getXCG0176() {
		return _XCG0176;
	}

	public void setXCG0176(String XCG0176) {
		_XCG0176 = XCG0176;
	}

	public String getXCG0247() {
		return _XCG0247;
	}

	public void setXCG0247(String XCG0247) {
		_XCG0247 = XCG0247;
	}

	public String getXCG0177() {
		return _XCG0177;
	}

	public void setXCG0177(String XCG0177) {
		_XCG0177 = XCG0177;
	}

	public String getXCG0178() {
		return _XCG0178;
	}

	public void setXCG0178(String XCG0178) {
		_XCG0178 = XCG0178;
	}

	public String getXCG0179() {
		return _XCG0179;
	}

	public void setXCG0179(String XCG0179) {
		_XCG0179 = XCG0179;
	}

	public String getXCG0180() {
		return _XCG0180;
	}

	public void setXCG0180(String XCG0180) {
		_XCG0180 = XCG0180;
	}

	public String getXCG0248() {
		return _XCG0248;
	}

	public void setXCG0248(String XCG0248) {
		_XCG0248 = XCG0248;
	}

	public String getXCG0181() {
		return _XCG0181;
	}

	public void setXCG0181(String XCG0181) {
		_XCG0181 = XCG0181;
	}

	public String getXCG0182() {
		return _XCG0182;
	}

	public void setXCG0182(String XCG0182) {
		_XCG0182 = XCG0182;
	}

	public String getXCG0183() {
		return _XCG0183;
	}

	public void setXCG0183(String XCG0183) {
		_XCG0183 = XCG0183;
	}

	public String getXCG0184() {
		return _XCG0184;
	}

	public void setXCG0184(String XCG0184) {
		_XCG0184 = XCG0184;
	}

	public String getXCG0249() {
		return _XCG0249;
	}

	public void setXCG0249(String XCG0249) {
		_XCG0249 = XCG0249;
	}

	public String getXCG0185() {
		return _XCG0185;
	}

	public void setXCG0185(String XCG0185) {
		_XCG0185 = XCG0185;
	}

	public String getXCG0186() {
		return _XCG0186;
	}

	public void setXCG0186(String XCG0186) {
		_XCG0186 = XCG0186;
	}

	public String getXCG0187() {
		return _XCG0187;
	}

	public void setXCG0187(String XCG0187) {
		_XCG0187 = XCG0187;
	}

	public String getXCG0188() {
		return _XCG0188;
	}

	public void setXCG0188(String XCG0188) {
		_XCG0188 = XCG0188;
	}

	public String getXCG0250() {
		return _XCG0250;
	}

	public void setXCG0250(String XCG0250) {
		_XCG0250 = XCG0250;
	}

	public String getXCG0189() {
		return _XCG0189;
	}

	public void setXCG0189(String XCG0189) {
		_XCG0189 = XCG0189;
	}

	public String getXCG0190() {
		return _XCG0190;
	}

	public void setXCG0190(String XCG0190) {
		_XCG0190 = XCG0190;
	}

	public String getXCG0191() {
		return _XCG0191;
	}

	public void setXCG0191(String XCG0191) {
		_XCG0191 = XCG0191;
	}

	public String getXCG0192() {
		return _XCG0192;
	}

	public void setXCG0192(String XCG0192) {
		_XCG0192 = XCG0192;
	}

	public String getXCG0251() {
		return _XCG0251;
	}

	public void setXCG0251(String XCG0251) {
		_XCG0251 = XCG0251;
	}

	public String getXCG0193() {
		return _XCG0193;
	}

	public void setXCG0193(String XCG0193) {
		_XCG0193 = XCG0193;
	}

	public String getXCG0194() {
		return _XCG0194;
	}

	public void setXCG0194(String XCG0194) {
		_XCG0194 = XCG0194;
	}

	public String getXCG0195() {
		return _XCG0195;
	}

	public void setXCG0195(String XCG0195) {
		_XCG0195 = XCG0195;
	}

	public String getXCG0196() {
		return _XCG0196;
	}

	public void setXCG0196(String XCG0196) {
		_XCG0196 = XCG0196;
	}

	public String getXCG0197() {
		return _XCG0197;
	}

	public void setXCG0197(String XCG0197) {
		_XCG0197 = XCG0197;
	}

	public String getXCG0198() {
		return _XCG0198;
	}

	public void setXCG0198(String XCG0198) {
		_XCG0198 = XCG0198;
	}

	public String getXCG0199() {
		return _XCG0199;
	}

	public void setXCG0199(String XCG0199) {
		_XCG0199 = XCG0199;
	}

	public String getXCG0200() {
		return _XCG0200;
	}

	public void setXCG0200(String XCG0200) {
		_XCG0200 = XCG0200;
	}

	public String getXCG0201() {
		return _XCG0201;
	}

	public void setXCG0201(String XCG0201) {
		_XCG0201 = XCG0201;
	}

	public String getXCG0202() {
		return _XCG0202;
	}

	public void setXCG0202(String XCG0202) {
		_XCG0202 = XCG0202;
	}

	public String getXCG0203() {
		return _XCG0203;
	}

	public void setXCG0203(String XCG0203) {
		_XCG0203 = XCG0203;
	}

	public String getXCG0204() {
		return _XCG0204;
	}

	public void setXCG0204(String XCG0204) {
		_XCG0204 = XCG0204;
	}

	public String getXCG0205() {
		return _XCG0205;
	}

	public void setXCG0205(String XCG0205) {
		_XCG0205 = XCG0205;
	}

	public String getXCG0206() {
		return _XCG0206;
	}

	public void setXCG0206(String XCG0206) {
		_XCG0206 = XCG0206;
	}

	public String getXCG0207() {
		return _XCG0207;
	}

	public void setXCG0207(String XCG0207) {
		_XCG0207 = XCG0207;
	}

	public String getXCG0208() {
		return _XCG0208;
	}

	public void setXCG0208(String XCG0208) {
		_XCG0208 = XCG0208;
	}

	public String getXCG0209() {
		return _XCG0209;
	}

	public void setXCG0209(String XCG0209) {
		_XCG0209 = XCG0209;
	}

	public String getXCG0210() {
		return _XCG0210;
	}

	public void setXCG0210(String XCG0210) {
		_XCG0210 = XCG0210;
	}

	public String getXCG0211() {
		return _XCG0211;
	}

	public void setXCG0211(String XCG0211) {
		_XCG0211 = XCG0211;
	}

	public String getXCG0212() {
		return _XCG0212;
	}

	public void setXCG0212(String XCG0212) {
		_XCG0212 = XCG0212;
	}

	public String getXCG0213() {
		return _XCG0213;
	}

	public void setXCG0213(String XCG0213) {
		_XCG0213 = XCG0213;
	}

	public String getXCG0214() {
		return _XCG0214;
	}

	public void setXCG0214(String XCG0214) {
		_XCG0214 = XCG0214;
	}

	public String getXCG0215() {
		return _XCG0215;
	}

	public void setXCG0215(String XCG0215) {
		_XCG0215 = XCG0215;
	}

	public String getXCG0216() {
		return _XCG0216;
	}

	public void setXCG0216(String XCG0216) {
		_XCG0216 = XCG0216;
	}

	public String getXCG0217() {
		return _XCG0217;
	}

	public void setXCG0217(String XCG0217) {
		_XCG0217 = XCG0217;
	}

	public String getXCG0218() {
		return _XCG0218;
	}

	public void setXCG0218(String XCG0218) {
		_XCG0218 = XCG0218;
	}

	public String getXCG0219() {
		return _XCG0219;
	}

	public void setXCG0219(String XCG0219) {
		_XCG0219 = XCG0219;
	}

	public String getXCG2218() {
		return _XCG2218;
	}

	public void setXCG2218(String XCG2218) {
		_XCG2218 = XCG2218;
	}

	public String getXCG2219() {
		return _XCG2219;
	}

	public void setXCG2219(String XCG2219) {
		_XCG2219 = XCG2219;
	}

	public String getXCG0220() {
		return _XCG0220;
	}

	public void setXCG0220(String XCG0220) {
		_XCG0220 = XCG0220;
	}

	public String getXCG2220() {
		return _XCG2220;
	}

	public void setXCG2220(String XCG2220) {
		_XCG2220 = XCG2220;
	}

	public String getXCG0221() {
		return _XCG0221;
	}

	public void setXCG0221(String XCG0221) {
		_XCG0221 = XCG0221;
	}

	public String getXCG2221() {
		return _XCG2221;
	}

	public void setXCG2221(String XCG2221) {
		_XCG2221 = XCG2221;
	}

	public String getXCG0222() {
		return _XCG0222;
	}

	public void setXCG0222(String XCG0222) {
		_XCG0222 = XCG0222;
	}

	public String getXCG2222() {
		return _XCG2222;
	}

	public void setXCG2222(String XCG2222) {
		_XCG2222 = XCG2222;
	}

	public String getXCG0223() {
		return _XCG0223;
	}

	public void setXCG0223(String XCG0223) {
		_XCG0223 = XCG0223;
	}

	public String getXCG2223() {
		return _XCG2223;
	}

	public void setXCG2223(String XCG2223) {
		_XCG2223 = XCG2223;
	}

	public String getXCG0224() {
		return _XCG0224;
	}

	public void setXCG0224(String XCG0224) {
		_XCG0224 = XCG0224;
	}

	public String getXCG2224() {
		return _XCG2224;
	}

	public void setXCG2224(String XCG2224) {
		_XCG2224 = XCG2224;
	}

	public String getXCG0225() {
		return _XCG0225;
	}

	public void setXCG0225(String XCG0225) {
		_XCG0225 = XCG0225;
	}

	public String getXCG2225() {
		return _XCG2225;
	}

	public void setXCG2225(String XCG2225) {
		_XCG2225 = XCG2225;
	}

	public String getXCG0226() {
		return _XCG0226;
	}

	public void setXCG0226(String XCG0226) {
		_XCG0226 = XCG0226;
	}

	public String getXCG2226() {
		return _XCG2226;
	}

	public void setXCG2226(String XCG2226) {
		_XCG2226 = XCG2226;
	}

	public String getXCG0227() {
		return _XCG0227;
	}

	public void setXCG0227(String XCG0227) {
		_XCG0227 = XCG0227;
	}

	public String getXCG2227() {
		return _XCG2227;
	}

	public void setXCG2227(String XCG2227) {
		_XCG2227 = XCG2227;
	}

	public String getXCG0228() {
		return _XCG0228;
	}

	public void setXCG0228(String XCG0228) {
		_XCG0228 = XCG0228;
	}

	public String getXCG2228() {
		return _XCG2228;
	}

	public void setXCG2228(String XCG2228) {
		_XCG2228 = XCG2228;
	}

	public String getXCG0229() {
		return _XCG0229;
	}

	public void setXCG0229(String XCG0229) {
		_XCG0229 = XCG0229;
	}

	public String getXCG2229() {
		return _XCG2229;
	}

	public void setXCG2229(String XCG2229) {
		_XCG2229 = XCG2229;
	}

	public String getXCG0230() {
		return _XCG0230;
	}

	public void setXCG0230(String XCG0230) {
		_XCG0230 = XCG0230;
	}

	public String getXCG2230() {
		return _XCG2230;
	}

	public void setXCG2230(String XCG2230) {
		_XCG2230 = XCG2230;
	}

	public String getXCG0231() {
		return _XCG0231;
	}

	public void setXCG0231(String XCG0231) {
		_XCG0231 = XCG0231;
	}

	public String getXCG2231() {
		return _XCG2231;
	}

	public void setXCG2231(String XCG2231) {
		_XCG2231 = XCG2231;
	}

	public String getXCG0232() {
		return _XCG0232;
	}

	public void setXCG0232(String XCG0232) {
		_XCG0232 = XCG0232;
	}

	public String getXCG2232() {
		return _XCG2232;
	}

	public void setXCG2232(String XCG2232) {
		_XCG2232 = XCG2232;
	}

	public String getXCG0233() {
		return _XCG0233;
	}

	public void setXCG0233(String XCG0233) {
		_XCG0233 = XCG0233;
	}

	public String getXCG2233() {
		return _XCG2233;
	}

	public void setXCG2233(String XCG2233) {
		_XCG2233 = XCG2233;
	}

	public String getXCG0234() {
		return _XCG0234;
	}

	public void setXCG0234(String XCG0234) {
		_XCG0234 = XCG0234;
	}

	public String getXCG0235() {
		return _XCG0235;
	}

	public void setXCG0235(String XCG0235) {
		_XCG0235 = XCG0235;
	}

	public String getXCG2235() {
		return _XCG2235;
	}

	public void setXCG2235(String XCG2235) {
		_XCG2235 = XCG2235;
	}

	public String getXCG0236() {
		return _XCG0236;
	}

	public void setXCG0236(String XCG0236) {
		_XCG0236 = XCG0236;
	}

	public String getXCG0237() {
		return _XCG0237;
	}

	public void setXCG0237(String XCG0237) {
		_XCG0237 = XCG0237;
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
}