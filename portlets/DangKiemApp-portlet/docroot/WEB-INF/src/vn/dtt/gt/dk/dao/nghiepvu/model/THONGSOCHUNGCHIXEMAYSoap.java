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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXEMAYServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXEMAYServiceSoap
 * @generated
 */
public class THONGSOCHUNGCHIXEMAYSoap implements Serializable {
	public static THONGSOCHUNGCHIXEMAYSoap toSoapModel(
		THONGSOCHUNGCHIXEMAY model) {
		THONGSOCHUNGCHIXEMAYSoap soapModel = new THONGSOCHUNGCHIXEMAYSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSynchDate(model.getSynchDate());
		soapModel.setXMY0009(model.getXMY0009());
		soapModel.setXMY0010(model.getXMY0010());
		soapModel.setXMY0011(model.getXMY0011());
		soapModel.setXMY0012(model.getXMY0012());
		soapModel.setXMY0013(model.getXMY0013());
		soapModel.setXMY0014(model.getXMY0014());
		soapModel.setXMY0015(model.getXMY0015());
		soapModel.setXMY0016(model.getXMY0016());
		soapModel.setXMY0017(model.getXMY0017());
		soapModel.setXMY0018(model.getXMY0018());
		soapModel.setXMY0019(model.getXMY0019());
		soapModel.setXMY0020(model.getXMY0020());
		soapModel.setXMY0021(model.getXMY0021());
		soapModel.setXMY0022(model.getXMY0022());
		soapModel.setXMY1022(model.getXMY1022());
		soapModel.setXMY0023(model.getXMY0023());
		soapModel.setXMY0024(model.getXMY0024());
		soapModel.setXMY0025(model.getXMY0025());
		soapModel.setXMY0026(model.getXMY0026());
		soapModel.setXMY0027(model.getXMY0027());
		soapModel.setXMY0028(model.getXMY0028());
		soapModel.setXMY0029(model.getXMY0029());
		soapModel.setXMY0030(model.getXMY0030());
		soapModel.setXMY0031(model.getXMY0031());
		soapModel.setXMY0032(model.getXMY0032());
		soapModel.setXMY1032(model.getXMY1032());
		soapModel.setXMY0033(model.getXMY0033());
		soapModel.setXMY1033(model.getXMY1033());
		soapModel.setXMY0034(model.getXMY0034());
		soapModel.setXMY0035(model.getXMY0035());
		soapModel.setXMY1035(model.getXMY1035());
		soapModel.setXMY0036(model.getXMY0036());
		soapModel.setXMY0037(model.getXMY0037());
		soapModel.setXMY0038(model.getXMY0038());
		soapModel.setXMY0039(model.getXMY0039());
		soapModel.setXMY1039(model.getXMY1039());
		soapModel.setXMY0040(model.getXMY0040());
		soapModel.setXMY1040(model.getXMY1040());
		soapModel.setXMY0041(model.getXMY0041());
		soapModel.setXMY0042(model.getXMY0042());
		soapModel.setXMY1042(model.getXMY1042());
		soapModel.setXMY0043(model.getXMY0043());
		soapModel.setXMY0044(model.getXMY0044());
		soapModel.setXMY0045(model.getXMY0045());
		soapModel.setXMY0046(model.getXMY0046());
		soapModel.setXMY0047(model.getXMY0047());
		soapModel.setXMY0048(model.getXMY0048());
		soapModel.setXMY0049(model.getXMY0049());
		soapModel.setXMY0050(model.getXMY0050());
		soapModel.setXMY1050(model.getXMY1050());
		soapModel.setXMY0051(model.getXMY0051());
		soapModel.setXMY0052(model.getXMY0052());
		soapModel.setXMY0053(model.getXMY0053());
		soapModel.setXMY0054(model.getXMY0054());
		soapModel.setXMY0055(model.getXMY0055());
		soapModel.setXMY0056(model.getXMY0056());
		soapModel.setXMY0057(model.getXMY0057());
		soapModel.setXMY0058(model.getXMY0058());
		soapModel.setXMY0059(model.getXMY0059());
		soapModel.setXMY0060(model.getXMY0060());
		soapModel.setXMY0061(model.getXMY0061());
		soapModel.setXMY0062(model.getXMY0062());
		soapModel.setXMY0063(model.getXMY0063());
		soapModel.setXMY0064(model.getXMY0064());
		soapModel.setXMY0065(model.getXMY0065());
		soapModel.setXMY0066(model.getXMY0066());
		soapModel.setXMY0067(model.getXMY0067());
		soapModel.setXMY0068(model.getXMY0068());
		soapModel.setXMY0069(model.getXMY0069());
		soapModel.setXMY0082(model.getXMY0082());
		soapModel.setXMY0083(model.getXMY0083());
		soapModel.setXMY0084(model.getXMY0084());
		soapModel.setXMY0085(model.getXMY0085());
		soapModel.setXMY0086(model.getXMY0086());
		soapModel.setXMY1086(model.getXMY1086());
		soapModel.setXMY0087(model.getXMY0087());
		soapModel.setXMY1087(model.getXMY1087());
		soapModel.setXMY1187(model.getXMY1187());
		soapModel.setXMY0088(model.getXMY0088());
		soapModel.setXMY1088(model.getXMY1088());
		soapModel.setXMY1188(model.getXMY1188());
		soapModel.setXMY0089(model.getXMY0089());
		soapModel.setXMY1089(model.getXMY1089());
		soapModel.setXMY1189(model.getXMY1189());
		soapModel.setXMY0090(model.getXMY0090());
		soapModel.setXMY0091(model.getXMY0091());
		soapModel.setXMY0092(model.getXMY0092());
		soapModel.setXMY0093(model.getXMY0093());
		soapModel.setXMY0094(model.getXMY0094());
		soapModel.setXMY0095(model.getXMY0095());
		soapModel.setXMY0096(model.getXMY0096());
		soapModel.setXMY0097(model.getXMY0097());
		soapModel.setXMY0098(model.getXMY0098());
		soapModel.setXMY0099(model.getXMY0099());
		soapModel.setXMY0100(model.getXMY0100());
		soapModel.setXMY0101(model.getXMY0101());
		soapModel.setXMY0102(model.getXMY0102());
		soapModel.setXMY0103(model.getXMY0103());
		soapModel.setXMY0104(model.getXMY0104());
		soapModel.setXMY0105(model.getXMY0105());
		soapModel.setXMY0106(model.getXMY0106());
		soapModel.setXMY2106(model.getXMY2106());
		soapModel.setXMY0107(model.getXMY0107());
		soapModel.setXMY2107(model.getXMY2107());
		soapModel.setXMY0108(model.getXMY0108());
		soapModel.setXMY2108(model.getXMY2108());
		soapModel.setXMY0109(model.getXMY0109());
		soapModel.setXMY2109(model.getXMY2109());
		soapModel.setXMY0110(model.getXMY0110());
		soapModel.setXMY2110(model.getXMY2110());
		soapModel.setXMY0111(model.getXMY0111());
		soapModel.setXMY2111(model.getXMY2111());
		soapModel.setXMY0112(model.getXMY0112());
		soapModel.setXMY2112(model.getXMY2112());
		soapModel.setXMY0113(model.getXMY0113());
		soapModel.setXMY2113(model.getXMY2113());
		soapModel.setXMY0114(model.getXMY0114());
		soapModel.setXMY2114(model.getXMY2114());
		soapModel.setXMY0115(model.getXMY0115());
		soapModel.setXMY2115(model.getXMY2115());
		soapModel.setXMY0116(model.getXMY0116());
		soapModel.setXMY2116(model.getXMY2116());
		soapModel.setXMY0117(model.getXMY0117());
		soapModel.setXMY2117(model.getXMY2117());
		soapModel.setXMY0118(model.getXMY0118());
		soapModel.setXMY2118(model.getXMY2118());
		soapModel.setXMY0119(model.getXMY0119());
		soapModel.setXMY2119(model.getXMY2119());
		soapModel.setXMY0120(model.getXMY0120());
		soapModel.setXMY0121(model.getXMY0121());
		soapModel.setXMY2121(model.getXMY2121());
		soapModel.setXMY0122(model.getXMY0122());
		soapModel.setXMY0198(model.getXMY0198());
		soapModel.setXMY1098(model.getXMY1098());

		return soapModel;
	}

	public static THONGSOCHUNGCHIXEMAYSoap[] toSoapModels(
		THONGSOCHUNGCHIXEMAY[] models) {
		THONGSOCHUNGCHIXEMAYSoap[] soapModels = new THONGSOCHUNGCHIXEMAYSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXEMAYSoap[][] toSoapModels(
		THONGSOCHUNGCHIXEMAY[][] models) {
		THONGSOCHUNGCHIXEMAYSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGSOCHUNGCHIXEMAYSoap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGSOCHUNGCHIXEMAYSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXEMAYSoap[] toSoapModels(
		List<THONGSOCHUNGCHIXEMAY> models) {
		List<THONGSOCHUNGCHIXEMAYSoap> soapModels = new ArrayList<THONGSOCHUNGCHIXEMAYSoap>(models.size());

		for (THONGSOCHUNGCHIXEMAY model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGSOCHUNGCHIXEMAYSoap[soapModels.size()]);
	}

	public THONGSOCHUNGCHIXEMAYSoap() {
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

	public String getXMY0009() {
		return _XMY0009;
	}

	public void setXMY0009(String XMY0009) {
		_XMY0009 = XMY0009;
	}

	public String getXMY0010() {
		return _XMY0010;
	}

	public void setXMY0010(String XMY0010) {
		_XMY0010 = XMY0010;
	}

	public String getXMY0011() {
		return _XMY0011;
	}

	public void setXMY0011(String XMY0011) {
		_XMY0011 = XMY0011;
	}

	public String getXMY0012() {
		return _XMY0012;
	}

	public void setXMY0012(String XMY0012) {
		_XMY0012 = XMY0012;
	}

	public String getXMY0013() {
		return _XMY0013;
	}

	public void setXMY0013(String XMY0013) {
		_XMY0013 = XMY0013;
	}

	public String getXMY0014() {
		return _XMY0014;
	}

	public void setXMY0014(String XMY0014) {
		_XMY0014 = XMY0014;
	}

	public String getXMY0015() {
		return _XMY0015;
	}

	public void setXMY0015(String XMY0015) {
		_XMY0015 = XMY0015;
	}

	public String getXMY0016() {
		return _XMY0016;
	}

	public void setXMY0016(String XMY0016) {
		_XMY0016 = XMY0016;
	}

	public String getXMY0017() {
		return _XMY0017;
	}

	public void setXMY0017(String XMY0017) {
		_XMY0017 = XMY0017;
	}

	public String getXMY0018() {
		return _XMY0018;
	}

	public void setXMY0018(String XMY0018) {
		_XMY0018 = XMY0018;
	}

	public String getXMY0019() {
		return _XMY0019;
	}

	public void setXMY0019(String XMY0019) {
		_XMY0019 = XMY0019;
	}

	public String getXMY0020() {
		return _XMY0020;
	}

	public void setXMY0020(String XMY0020) {
		_XMY0020 = XMY0020;
	}

	public String getXMY0021() {
		return _XMY0021;
	}

	public void setXMY0021(String XMY0021) {
		_XMY0021 = XMY0021;
	}

	public String getXMY0022() {
		return _XMY0022;
	}

	public void setXMY0022(String XMY0022) {
		_XMY0022 = XMY0022;
	}

	public String getXMY1022() {
		return _XMY1022;
	}

	public void setXMY1022(String XMY1022) {
		_XMY1022 = XMY1022;
	}

	public String getXMY0023() {
		return _XMY0023;
	}

	public void setXMY0023(String XMY0023) {
		_XMY0023 = XMY0023;
	}

	public String getXMY0024() {
		return _XMY0024;
	}

	public void setXMY0024(String XMY0024) {
		_XMY0024 = XMY0024;
	}

	public String getXMY0025() {
		return _XMY0025;
	}

	public void setXMY0025(String XMY0025) {
		_XMY0025 = XMY0025;
	}

	public String getXMY0026() {
		return _XMY0026;
	}

	public void setXMY0026(String XMY0026) {
		_XMY0026 = XMY0026;
	}

	public String getXMY0027() {
		return _XMY0027;
	}

	public void setXMY0027(String XMY0027) {
		_XMY0027 = XMY0027;
	}

	public String getXMY0028() {
		return _XMY0028;
	}

	public void setXMY0028(String XMY0028) {
		_XMY0028 = XMY0028;
	}

	public String getXMY0029() {
		return _XMY0029;
	}

	public void setXMY0029(String XMY0029) {
		_XMY0029 = XMY0029;
	}

	public String getXMY0030() {
		return _XMY0030;
	}

	public void setXMY0030(String XMY0030) {
		_XMY0030 = XMY0030;
	}

	public String getXMY0031() {
		return _XMY0031;
	}

	public void setXMY0031(String XMY0031) {
		_XMY0031 = XMY0031;
	}

	public String getXMY0032() {
		return _XMY0032;
	}

	public void setXMY0032(String XMY0032) {
		_XMY0032 = XMY0032;
	}

	public String getXMY1032() {
		return _XMY1032;
	}

	public void setXMY1032(String XMY1032) {
		_XMY1032 = XMY1032;
	}

	public String getXMY0033() {
		return _XMY0033;
	}

	public void setXMY0033(String XMY0033) {
		_XMY0033 = XMY0033;
	}

	public String getXMY1033() {
		return _XMY1033;
	}

	public void setXMY1033(String XMY1033) {
		_XMY1033 = XMY1033;
	}

	public String getXMY0034() {
		return _XMY0034;
	}

	public void setXMY0034(String XMY0034) {
		_XMY0034 = XMY0034;
	}

	public String getXMY0035() {
		return _XMY0035;
	}

	public void setXMY0035(String XMY0035) {
		_XMY0035 = XMY0035;
	}

	public String getXMY1035() {
		return _XMY1035;
	}

	public void setXMY1035(String XMY1035) {
		_XMY1035 = XMY1035;
	}

	public String getXMY0036() {
		return _XMY0036;
	}

	public void setXMY0036(String XMY0036) {
		_XMY0036 = XMY0036;
	}

	public String getXMY0037() {
		return _XMY0037;
	}

	public void setXMY0037(String XMY0037) {
		_XMY0037 = XMY0037;
	}

	public String getXMY0038() {
		return _XMY0038;
	}

	public void setXMY0038(String XMY0038) {
		_XMY0038 = XMY0038;
	}

	public String getXMY0039() {
		return _XMY0039;
	}

	public void setXMY0039(String XMY0039) {
		_XMY0039 = XMY0039;
	}

	public String getXMY1039() {
		return _XMY1039;
	}

	public void setXMY1039(String XMY1039) {
		_XMY1039 = XMY1039;
	}

	public String getXMY0040() {
		return _XMY0040;
	}

	public void setXMY0040(String XMY0040) {
		_XMY0040 = XMY0040;
	}

	public String getXMY1040() {
		return _XMY1040;
	}

	public void setXMY1040(String XMY1040) {
		_XMY1040 = XMY1040;
	}

	public String getXMY0041() {
		return _XMY0041;
	}

	public void setXMY0041(String XMY0041) {
		_XMY0041 = XMY0041;
	}

	public String getXMY0042() {
		return _XMY0042;
	}

	public void setXMY0042(String XMY0042) {
		_XMY0042 = XMY0042;
	}

	public String getXMY1042() {
		return _XMY1042;
	}

	public void setXMY1042(String XMY1042) {
		_XMY1042 = XMY1042;
	}

	public String getXMY0043() {
		return _XMY0043;
	}

	public void setXMY0043(String XMY0043) {
		_XMY0043 = XMY0043;
	}

	public String getXMY0044() {
		return _XMY0044;
	}

	public void setXMY0044(String XMY0044) {
		_XMY0044 = XMY0044;
	}

	public String getXMY0045() {
		return _XMY0045;
	}

	public void setXMY0045(String XMY0045) {
		_XMY0045 = XMY0045;
	}

	public String getXMY0046() {
		return _XMY0046;
	}

	public void setXMY0046(String XMY0046) {
		_XMY0046 = XMY0046;
	}

	public String getXMY0047() {
		return _XMY0047;
	}

	public void setXMY0047(String XMY0047) {
		_XMY0047 = XMY0047;
	}

	public String getXMY0048() {
		return _XMY0048;
	}

	public void setXMY0048(String XMY0048) {
		_XMY0048 = XMY0048;
	}

	public String getXMY0049() {
		return _XMY0049;
	}

	public void setXMY0049(String XMY0049) {
		_XMY0049 = XMY0049;
	}

	public String getXMY0050() {
		return _XMY0050;
	}

	public void setXMY0050(String XMY0050) {
		_XMY0050 = XMY0050;
	}

	public String getXMY1050() {
		return _XMY1050;
	}

	public void setXMY1050(String XMY1050) {
		_XMY1050 = XMY1050;
	}

	public String getXMY0051() {
		return _XMY0051;
	}

	public void setXMY0051(String XMY0051) {
		_XMY0051 = XMY0051;
	}

	public String getXMY0052() {
		return _XMY0052;
	}

	public void setXMY0052(String XMY0052) {
		_XMY0052 = XMY0052;
	}

	public String getXMY0053() {
		return _XMY0053;
	}

	public void setXMY0053(String XMY0053) {
		_XMY0053 = XMY0053;
	}

	public String getXMY0054() {
		return _XMY0054;
	}

	public void setXMY0054(String XMY0054) {
		_XMY0054 = XMY0054;
	}

	public String getXMY0055() {
		return _XMY0055;
	}

	public void setXMY0055(String XMY0055) {
		_XMY0055 = XMY0055;
	}

	public String getXMY0056() {
		return _XMY0056;
	}

	public void setXMY0056(String XMY0056) {
		_XMY0056 = XMY0056;
	}

	public String getXMY0057() {
		return _XMY0057;
	}

	public void setXMY0057(String XMY0057) {
		_XMY0057 = XMY0057;
	}

	public String getXMY0058() {
		return _XMY0058;
	}

	public void setXMY0058(String XMY0058) {
		_XMY0058 = XMY0058;
	}

	public String getXMY0059() {
		return _XMY0059;
	}

	public void setXMY0059(String XMY0059) {
		_XMY0059 = XMY0059;
	}

	public String getXMY0060() {
		return _XMY0060;
	}

	public void setXMY0060(String XMY0060) {
		_XMY0060 = XMY0060;
	}

	public String getXMY0061() {
		return _XMY0061;
	}

	public void setXMY0061(String XMY0061) {
		_XMY0061 = XMY0061;
	}

	public String getXMY0062() {
		return _XMY0062;
	}

	public void setXMY0062(String XMY0062) {
		_XMY0062 = XMY0062;
	}

	public String getXMY0063() {
		return _XMY0063;
	}

	public void setXMY0063(String XMY0063) {
		_XMY0063 = XMY0063;
	}

	public String getXMY0064() {
		return _XMY0064;
	}

	public void setXMY0064(String XMY0064) {
		_XMY0064 = XMY0064;
	}

	public String getXMY0065() {
		return _XMY0065;
	}

	public void setXMY0065(String XMY0065) {
		_XMY0065 = XMY0065;
	}

	public String getXMY0066() {
		return _XMY0066;
	}

	public void setXMY0066(String XMY0066) {
		_XMY0066 = XMY0066;
	}

	public String getXMY0067() {
		return _XMY0067;
	}

	public void setXMY0067(String XMY0067) {
		_XMY0067 = XMY0067;
	}

	public String getXMY0068() {
		return _XMY0068;
	}

	public void setXMY0068(String XMY0068) {
		_XMY0068 = XMY0068;
	}

	public String getXMY0069() {
		return _XMY0069;
	}

	public void setXMY0069(String XMY0069) {
		_XMY0069 = XMY0069;
	}

	public String getXMY0082() {
		return _XMY0082;
	}

	public void setXMY0082(String XMY0082) {
		_XMY0082 = XMY0082;
	}

	public String getXMY0083() {
		return _XMY0083;
	}

	public void setXMY0083(String XMY0083) {
		_XMY0083 = XMY0083;
	}

	public String getXMY0084() {
		return _XMY0084;
	}

	public void setXMY0084(String XMY0084) {
		_XMY0084 = XMY0084;
	}

	public String getXMY0085() {
		return _XMY0085;
	}

	public void setXMY0085(String XMY0085) {
		_XMY0085 = XMY0085;
	}

	public String getXMY0086() {
		return _XMY0086;
	}

	public void setXMY0086(String XMY0086) {
		_XMY0086 = XMY0086;
	}

	public String getXMY1086() {
		return _XMY1086;
	}

	public void setXMY1086(String XMY1086) {
		_XMY1086 = XMY1086;
	}

	public String getXMY0087() {
		return _XMY0087;
	}

	public void setXMY0087(String XMY0087) {
		_XMY0087 = XMY0087;
	}

	public String getXMY1087() {
		return _XMY1087;
	}

	public void setXMY1087(String XMY1087) {
		_XMY1087 = XMY1087;
	}

	public String getXMY1187() {
		return _XMY1187;
	}

	public void setXMY1187(String XMY1187) {
		_XMY1187 = XMY1187;
	}

	public String getXMY0088() {
		return _XMY0088;
	}

	public void setXMY0088(String XMY0088) {
		_XMY0088 = XMY0088;
	}

	public String getXMY1088() {
		return _XMY1088;
	}

	public void setXMY1088(String XMY1088) {
		_XMY1088 = XMY1088;
	}

	public String getXMY1188() {
		return _XMY1188;
	}

	public void setXMY1188(String XMY1188) {
		_XMY1188 = XMY1188;
	}

	public String getXMY0089() {
		return _XMY0089;
	}

	public void setXMY0089(String XMY0089) {
		_XMY0089 = XMY0089;
	}

	public String getXMY1089() {
		return _XMY1089;
	}

	public void setXMY1089(String XMY1089) {
		_XMY1089 = XMY1089;
	}

	public String getXMY1189() {
		return _XMY1189;
	}

	public void setXMY1189(String XMY1189) {
		_XMY1189 = XMY1189;
	}

	public String getXMY0090() {
		return _XMY0090;
	}

	public void setXMY0090(String XMY0090) {
		_XMY0090 = XMY0090;
	}

	public String getXMY0091() {
		return _XMY0091;
	}

	public void setXMY0091(String XMY0091) {
		_XMY0091 = XMY0091;
	}

	public String getXMY0092() {
		return _XMY0092;
	}

	public void setXMY0092(String XMY0092) {
		_XMY0092 = XMY0092;
	}

	public String getXMY0093() {
		return _XMY0093;
	}

	public void setXMY0093(String XMY0093) {
		_XMY0093 = XMY0093;
	}

	public String getXMY0094() {
		return _XMY0094;
	}

	public void setXMY0094(String XMY0094) {
		_XMY0094 = XMY0094;
	}

	public String getXMY0095() {
		return _XMY0095;
	}

	public void setXMY0095(String XMY0095) {
		_XMY0095 = XMY0095;
	}

	public String getXMY0096() {
		return _XMY0096;
	}

	public void setXMY0096(String XMY0096) {
		_XMY0096 = XMY0096;
	}

	public String getXMY0097() {
		return _XMY0097;
	}

	public void setXMY0097(String XMY0097) {
		_XMY0097 = XMY0097;
	}

	public String getXMY0098() {
		return _XMY0098;
	}

	public void setXMY0098(String XMY0098) {
		_XMY0098 = XMY0098;
	}

	public String getXMY0099() {
		return _XMY0099;
	}

	public void setXMY0099(String XMY0099) {
		_XMY0099 = XMY0099;
	}

	public String getXMY0100() {
		return _XMY0100;
	}

	public void setXMY0100(String XMY0100) {
		_XMY0100 = XMY0100;
	}

	public String getXMY0101() {
		return _XMY0101;
	}

	public void setXMY0101(String XMY0101) {
		_XMY0101 = XMY0101;
	}

	public String getXMY0102() {
		return _XMY0102;
	}

	public void setXMY0102(String XMY0102) {
		_XMY0102 = XMY0102;
	}

	public String getXMY0103() {
		return _XMY0103;
	}

	public void setXMY0103(String XMY0103) {
		_XMY0103 = XMY0103;
	}

	public String getXMY0104() {
		return _XMY0104;
	}

	public void setXMY0104(String XMY0104) {
		_XMY0104 = XMY0104;
	}

	public String getXMY0105() {
		return _XMY0105;
	}

	public void setXMY0105(String XMY0105) {
		_XMY0105 = XMY0105;
	}

	public String getXMY0106() {
		return _XMY0106;
	}

	public void setXMY0106(String XMY0106) {
		_XMY0106 = XMY0106;
	}

	public String getXMY2106() {
		return _XMY2106;
	}

	public void setXMY2106(String XMY2106) {
		_XMY2106 = XMY2106;
	}

	public String getXMY0107() {
		return _XMY0107;
	}

	public void setXMY0107(String XMY0107) {
		_XMY0107 = XMY0107;
	}

	public String getXMY2107() {
		return _XMY2107;
	}

	public void setXMY2107(String XMY2107) {
		_XMY2107 = XMY2107;
	}

	public String getXMY0108() {
		return _XMY0108;
	}

	public void setXMY0108(String XMY0108) {
		_XMY0108 = XMY0108;
	}

	public String getXMY2108() {
		return _XMY2108;
	}

	public void setXMY2108(String XMY2108) {
		_XMY2108 = XMY2108;
	}

	public String getXMY0109() {
		return _XMY0109;
	}

	public void setXMY0109(String XMY0109) {
		_XMY0109 = XMY0109;
	}

	public String getXMY2109() {
		return _XMY2109;
	}

	public void setXMY2109(String XMY2109) {
		_XMY2109 = XMY2109;
	}

	public String getXMY0110() {
		return _XMY0110;
	}

	public void setXMY0110(String XMY0110) {
		_XMY0110 = XMY0110;
	}

	public String getXMY2110() {
		return _XMY2110;
	}

	public void setXMY2110(String XMY2110) {
		_XMY2110 = XMY2110;
	}

	public String getXMY0111() {
		return _XMY0111;
	}

	public void setXMY0111(String XMY0111) {
		_XMY0111 = XMY0111;
	}

	public String getXMY2111() {
		return _XMY2111;
	}

	public void setXMY2111(String XMY2111) {
		_XMY2111 = XMY2111;
	}

	public String getXMY0112() {
		return _XMY0112;
	}

	public void setXMY0112(String XMY0112) {
		_XMY0112 = XMY0112;
	}

	public String getXMY2112() {
		return _XMY2112;
	}

	public void setXMY2112(String XMY2112) {
		_XMY2112 = XMY2112;
	}

	public String getXMY0113() {
		return _XMY0113;
	}

	public void setXMY0113(String XMY0113) {
		_XMY0113 = XMY0113;
	}

	public String getXMY2113() {
		return _XMY2113;
	}

	public void setXMY2113(String XMY2113) {
		_XMY2113 = XMY2113;
	}

	public String getXMY0114() {
		return _XMY0114;
	}

	public void setXMY0114(String XMY0114) {
		_XMY0114 = XMY0114;
	}

	public String getXMY2114() {
		return _XMY2114;
	}

	public void setXMY2114(String XMY2114) {
		_XMY2114 = XMY2114;
	}

	public String getXMY0115() {
		return _XMY0115;
	}

	public void setXMY0115(String XMY0115) {
		_XMY0115 = XMY0115;
	}

	public String getXMY2115() {
		return _XMY2115;
	}

	public void setXMY2115(String XMY2115) {
		_XMY2115 = XMY2115;
	}

	public String getXMY0116() {
		return _XMY0116;
	}

	public void setXMY0116(String XMY0116) {
		_XMY0116 = XMY0116;
	}

	public String getXMY2116() {
		return _XMY2116;
	}

	public void setXMY2116(String XMY2116) {
		_XMY2116 = XMY2116;
	}

	public String getXMY0117() {
		return _XMY0117;
	}

	public void setXMY0117(String XMY0117) {
		_XMY0117 = XMY0117;
	}

	public String getXMY2117() {
		return _XMY2117;
	}

	public void setXMY2117(String XMY2117) {
		_XMY2117 = XMY2117;
	}

	public String getXMY0118() {
		return _XMY0118;
	}

	public void setXMY0118(String XMY0118) {
		_XMY0118 = XMY0118;
	}

	public String getXMY2118() {
		return _XMY2118;
	}

	public void setXMY2118(String XMY2118) {
		_XMY2118 = XMY2118;
	}

	public String getXMY0119() {
		return _XMY0119;
	}

	public void setXMY0119(String XMY0119) {
		_XMY0119 = XMY0119;
	}

	public String getXMY2119() {
		return _XMY2119;
	}

	public void setXMY2119(String XMY2119) {
		_XMY2119 = XMY2119;
	}

	public String getXMY0120() {
		return _XMY0120;
	}

	public void setXMY0120(String XMY0120) {
		_XMY0120 = XMY0120;
	}

	public String getXMY0121() {
		return _XMY0121;
	}

	public void setXMY0121(String XMY0121) {
		_XMY0121 = XMY0121;
	}

	public String getXMY2121() {
		return _XMY2121;
	}

	public void setXMY2121(String XMY2121) {
		_XMY2121 = XMY2121;
	}

	public String getXMY0122() {
		return _XMY0122;
	}

	public void setXMY0122(String XMY0122) {
		_XMY0122 = XMY0122;
	}

	public String getXMY0198() {
		return _XMY0198;
	}

	public void setXMY0198(String XMY0198) {
		_XMY0198 = XMY0198;
	}

	public String getXMY1098() {
		return _XMY1098;
	}

	public void setXMY1098(String XMY1098) {
		_XMY1098 = XMY1098;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XMY0009;
	private String _XMY0010;
	private String _XMY0011;
	private String _XMY0012;
	private String _XMY0013;
	private String _XMY0014;
	private String _XMY0015;
	private String _XMY0016;
	private String _XMY0017;
	private String _XMY0018;
	private String _XMY0019;
	private String _XMY0020;
	private String _XMY0021;
	private String _XMY0022;
	private String _XMY1022;
	private String _XMY0023;
	private String _XMY0024;
	private String _XMY0025;
	private String _XMY0026;
	private String _XMY0027;
	private String _XMY0028;
	private String _XMY0029;
	private String _XMY0030;
	private String _XMY0031;
	private String _XMY0032;
	private String _XMY1032;
	private String _XMY0033;
	private String _XMY1033;
	private String _XMY0034;
	private String _XMY0035;
	private String _XMY1035;
	private String _XMY0036;
	private String _XMY0037;
	private String _XMY0038;
	private String _XMY0039;
	private String _XMY1039;
	private String _XMY0040;
	private String _XMY1040;
	private String _XMY0041;
	private String _XMY0042;
	private String _XMY1042;
	private String _XMY0043;
	private String _XMY0044;
	private String _XMY0045;
	private String _XMY0046;
	private String _XMY0047;
	private String _XMY0048;
	private String _XMY0049;
	private String _XMY0050;
	private String _XMY1050;
	private String _XMY0051;
	private String _XMY0052;
	private String _XMY0053;
	private String _XMY0054;
	private String _XMY0055;
	private String _XMY0056;
	private String _XMY0057;
	private String _XMY0058;
	private String _XMY0059;
	private String _XMY0060;
	private String _XMY0061;
	private String _XMY0062;
	private String _XMY0063;
	private String _XMY0064;
	private String _XMY0065;
	private String _XMY0066;
	private String _XMY0067;
	private String _XMY0068;
	private String _XMY0069;
	private String _XMY0082;
	private String _XMY0083;
	private String _XMY0084;
	private String _XMY0085;
	private String _XMY0086;
	private String _XMY1086;
	private String _XMY0087;
	private String _XMY1087;
	private String _XMY1187;
	private String _XMY0088;
	private String _XMY1088;
	private String _XMY1188;
	private String _XMY0089;
	private String _XMY1089;
	private String _XMY1189;
	private String _XMY0090;
	private String _XMY0091;
	private String _XMY0092;
	private String _XMY0093;
	private String _XMY0094;
	private String _XMY0095;
	private String _XMY0096;
	private String _XMY0097;
	private String _XMY0098;
	private String _XMY0099;
	private String _XMY0100;
	private String _XMY0101;
	private String _XMY0102;
	private String _XMY0103;
	private String _XMY0104;
	private String _XMY0105;
	private String _XMY0106;
	private String _XMY2106;
	private String _XMY0107;
	private String _XMY2107;
	private String _XMY0108;
	private String _XMY2108;
	private String _XMY0109;
	private String _XMY2109;
	private String _XMY0110;
	private String _XMY2110;
	private String _XMY0111;
	private String _XMY2111;
	private String _XMY0112;
	private String _XMY2112;
	private String _XMY0113;
	private String _XMY2113;
	private String _XMY0114;
	private String _XMY2114;
	private String _XMY0115;
	private String _XMY2115;
	private String _XMY0116;
	private String _XMY2116;
	private String _XMY0117;
	private String _XMY2117;
	private String _XMY0118;
	private String _XMY2118;
	private String _XMY0119;
	private String _XMY2119;
	private String _XMY0120;
	private String _XMY0121;
	private String _XMY2121;
	private String _XMY0122;
	private String _XMY0198;
	private String _XMY1098;
}