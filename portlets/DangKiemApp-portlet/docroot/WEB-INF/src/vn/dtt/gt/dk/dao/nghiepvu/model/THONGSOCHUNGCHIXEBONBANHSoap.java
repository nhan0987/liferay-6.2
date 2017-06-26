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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXEBONBANHServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXEBONBANHServiceSoap
 * @generated
 */
public class THONGSOCHUNGCHIXEBONBANHSoap implements Serializable {
	public static THONGSOCHUNGCHIXEBONBANHSoap toSoapModel(
		THONGSOCHUNGCHIXEBONBANH model) {
		THONGSOCHUNGCHIXEBONBANHSoap soapModel = new THONGSOCHUNGCHIXEBONBANHSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSynchDate(model.getSynchDate());
		soapModel.setXBB0009(model.getXBB0009());
		soapModel.setXBB0010(model.getXBB0010());
		soapModel.setXBB0011(model.getXBB0011());
		soapModel.setXBB0012(model.getXBB0012());
		soapModel.setXBB0013(model.getXBB0013());
		soapModel.setXBB0014(model.getXBB0014());
		soapModel.setXBB1014(model.getXBB1014());
		soapModel.setXBB1114(model.getXBB1114());
		soapModel.setXBB0015(model.getXBB0015());
		soapModel.setXBB1015(model.getXBB1015());
		soapModel.setXBB1115(model.getXBB1115());
		soapModel.setXBB0016(model.getXBB0016());
		soapModel.setXBB1016(model.getXBB1016());
		soapModel.setXBB1116(model.getXBB1116());
		soapModel.setXBB0017(model.getXBB0017());
		soapModel.setXBB1017(model.getXBB1017());
		soapModel.setXBB1117(model.getXBB1117());
		soapModel.setXBB0018(model.getXBB0018());
		soapModel.setXBB0019(model.getXBB0019());
		soapModel.setXBB0020(model.getXBB0020());
		soapModel.setXBB0021(model.getXBB0021());
		soapModel.setXBB0022(model.getXBB0022());
		soapModel.setXBB1022(model.getXBB1022());
		soapModel.setXBB0023(model.getXBB0023());
		soapModel.setXBB0024(model.getXBB0024());
		soapModel.setXBB0025(model.getXBB0025());
		soapModel.setXBB0026(model.getXBB0026());
		soapModel.setXBB1026(model.getXBB1026());
		soapModel.setXBB0027(model.getXBB0027());
		soapModel.setXBB1027(model.getXBB1027());
		soapModel.setXBB0028(model.getXBB0028());
		soapModel.setXBB0029(model.getXBB0029());
		soapModel.setXBB1029(model.getXBB1029());
		soapModel.setXBB0030(model.getXBB0030());
		soapModel.setXBB0031(model.getXBB0031());
		soapModel.setXBB0032(model.getXBB0032());
		soapModel.setXBB0033(model.getXBB0033());
		soapModel.setXBB1033(model.getXBB1033());
		soapModel.setXBB0034(model.getXBB0034());
		soapModel.setXBB1034(model.getXBB1034());
		soapModel.setXBB0035(model.getXBB0035());
		soapModel.setXBB0036(model.getXBB0036());
		soapModel.setXBB1036(model.getXBB1036());
		soapModel.setXBB0037(model.getXBB0037());
		soapModel.setXBB0038(model.getXBB0038());
		soapModel.setXBB0039(model.getXBB0039());
		soapModel.setXBB0040(model.getXBB0040());
		soapModel.setXBB0041(model.getXBB0041());
		soapModel.setXBB0042(model.getXBB0042());
		soapModel.setXBB0043(model.getXBB0043());
		soapModel.setXBB0044(model.getXBB0044());
		soapModel.setXBB1044(model.getXBB1044());
		soapModel.setXBB0045(model.getXBB0045());
		soapModel.setXBB0046(model.getXBB0046());
		soapModel.setXBB0047(model.getXBB0047());
		soapModel.setXBB0048(model.getXBB0048());
		soapModel.setXBB0049(model.getXBB0049());
		soapModel.setXBB0050(model.getXBB0050());
		soapModel.setXBB0051(model.getXBB0051());
		soapModel.setXBB0052(model.getXBB0052());
		soapModel.setXBB0053(model.getXBB0053());
		soapModel.setXBB0054(model.getXBB0054());
		soapModel.setXBB0055(model.getXBB0055());
		soapModel.setXBB0056(model.getXBB0056());
		soapModel.setXBB0057(model.getXBB0057());
		soapModel.setXBB0058(model.getXBB0058());
		soapModel.setXBB0059(model.getXBB0059());
		soapModel.setXBB0060(model.getXBB0060());
		soapModel.setXBB0061(model.getXBB0061());
		soapModel.setXBB0062(model.getXBB0062());
		soapModel.setXBB0063(model.getXBB0063());
		soapModel.setXBB0076(model.getXBB0076());
		soapModel.setXBB0077(model.getXBB0077());
		soapModel.setXBB0078(model.getXBB0078());
		soapModel.setXBB0079(model.getXBB0079());
		soapModel.setXBB0080(model.getXBB0080());
		soapModel.setXBB1080(model.getXBB1080());
		soapModel.setXBB0081(model.getXBB0081());
		soapModel.setXBB1081(model.getXBB1081());
		soapModel.setXBB1181(model.getXBB1181());
		soapModel.setXBB0082(model.getXBB0082());
		soapModel.setXBB1082(model.getXBB1082());
		soapModel.setXBB1182(model.getXBB1182());
		soapModel.setXBB0083(model.getXBB0083());
		soapModel.setXBB1083(model.getXBB1083());
		soapModel.setXBB1183(model.getXBB1183());
		soapModel.setXBB0084(model.getXBB0084());
		soapModel.setXBB0085(model.getXBB0085());
		soapModel.setXBB0086(model.getXBB0086());
		soapModel.setXBB0087(model.getXBB0087());
		soapModel.setXBB0088(model.getXBB0088());
		soapModel.setXBB0089(model.getXBB0089());
		soapModel.setXBB0090(model.getXBB0090());
		soapModel.setXBB0091(model.getXBB0091());
		soapModel.setXBB0092(model.getXBB0092());
		soapModel.setXBB0093(model.getXBB0093());
		soapModel.setXBB0094(model.getXBB0094());
		soapModel.setXBB0095(model.getXBB0095());
		soapModel.setXBB0096(model.getXBB0096());
		soapModel.setXBB0097(model.getXBB0097());
		soapModel.setXBB0098(model.getXBB0098());
		soapModel.setXBB0099(model.getXBB0099());
		soapModel.setXBB0100(model.getXBB0100());
		soapModel.setXBB0101(model.getXBB0101());
		soapModel.setXBB0102(model.getXBB0102());
		soapModel.setXBB0103(model.getXBB0103());
		soapModel.setXBB0104(model.getXBB0104());
		soapModel.setXBB2104(model.getXBB2104());
		soapModel.setXBB0105(model.getXBB0105());
		soapModel.setXBB2105(model.getXBB2105());
		soapModel.setXBB0106(model.getXBB0106());
		soapModel.setXBB2106(model.getXBB2106());
		soapModel.setXBB0107(model.getXBB0107());
		soapModel.setXBB2107(model.getXBB2107());
		soapModel.setXBB0108(model.getXBB0108());
		soapModel.setXBB2108(model.getXBB2108());
		soapModel.setXBB0109(model.getXBB0109());
		soapModel.setXBB2109(model.getXBB2109());
		soapModel.setXBB0110(model.getXBB0110());
		soapModel.setXBB2110(model.getXBB2110());
		soapModel.setXBB0111(model.getXBB0111());
		soapModel.setXBB2111(model.getXBB2111());
		soapModel.setXBB0112(model.getXBB0112());
		soapModel.setXBB2112(model.getXBB2112());
		soapModel.setXBB0113(model.getXBB0113());
		soapModel.setXBB2113(model.getXBB2113());
		soapModel.setXBB0114(model.getXBB0114());
		soapModel.setXBB2114(model.getXBB2114());
		soapModel.setXBB0115(model.getXBB0115());
		soapModel.setXBB2115(model.getXBB2115());
		soapModel.setXBB0116(model.getXBB0116());
		soapModel.setXBB2116(model.getXBB2116());
		soapModel.setXBB0117(model.getXBB0117());
		soapModel.setXBB2117(model.getXBB2117());
		soapModel.setXBB0118(model.getXBB0118());
		soapModel.setXBB0119(model.getXBB0119());
		soapModel.setXBB2119(model.getXBB2119());
		soapModel.setXBB0120(model.getXBB0120());
		soapModel.setXBB0121(model.getXBB0121());
		soapModel.setXBB0122(model.getXBB0122());
		soapModel.setXBB0123(model.getXBB0123());
		soapModel.setXBB0124(model.getXBB0124());
		soapModel.setXBB0125(model.getXBB0125());
		soapModel.setXBB0126(model.getXBB0126());
		soapModel.setXBB1084(model.getXBB1084());
		soapModel.setXBB1086(model.getXBB1086());

		return soapModel;
	}

	public static THONGSOCHUNGCHIXEBONBANHSoap[] toSoapModels(
		THONGSOCHUNGCHIXEBONBANH[] models) {
		THONGSOCHUNGCHIXEBONBANHSoap[] soapModels = new THONGSOCHUNGCHIXEBONBANHSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXEBONBANHSoap[][] toSoapModels(
		THONGSOCHUNGCHIXEBONBANH[][] models) {
		THONGSOCHUNGCHIXEBONBANHSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGSOCHUNGCHIXEBONBANHSoap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGSOCHUNGCHIXEBONBANHSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXEBONBANHSoap[] toSoapModels(
		List<THONGSOCHUNGCHIXEBONBANH> models) {
		List<THONGSOCHUNGCHIXEBONBANHSoap> soapModels = new ArrayList<THONGSOCHUNGCHIXEBONBANHSoap>(models.size());

		for (THONGSOCHUNGCHIXEBONBANH model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGSOCHUNGCHIXEBONBANHSoap[soapModels.size()]);
	}

	public THONGSOCHUNGCHIXEBONBANHSoap() {
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

	public String getXBB0009() {
		return _XBB0009;
	}

	public void setXBB0009(String XBB0009) {
		_XBB0009 = XBB0009;
	}

	public String getXBB0010() {
		return _XBB0010;
	}

	public void setXBB0010(String XBB0010) {
		_XBB0010 = XBB0010;
	}

	public String getXBB0011() {
		return _XBB0011;
	}

	public void setXBB0011(String XBB0011) {
		_XBB0011 = XBB0011;
	}

	public String getXBB0012() {
		return _XBB0012;
	}

	public void setXBB0012(String XBB0012) {
		_XBB0012 = XBB0012;
	}

	public String getXBB0013() {
		return _XBB0013;
	}

	public void setXBB0013(String XBB0013) {
		_XBB0013 = XBB0013;
	}

	public String getXBB0014() {
		return _XBB0014;
	}

	public void setXBB0014(String XBB0014) {
		_XBB0014 = XBB0014;
	}

	public String getXBB1014() {
		return _XBB1014;
	}

	public void setXBB1014(String XBB1014) {
		_XBB1014 = XBB1014;
	}

	public String getXBB1114() {
		return _XBB1114;
	}

	public void setXBB1114(String XBB1114) {
		_XBB1114 = XBB1114;
	}

	public String getXBB0015() {
		return _XBB0015;
	}

	public void setXBB0015(String XBB0015) {
		_XBB0015 = XBB0015;
	}

	public String getXBB1015() {
		return _XBB1015;
	}

	public void setXBB1015(String XBB1015) {
		_XBB1015 = XBB1015;
	}

	public String getXBB1115() {
		return _XBB1115;
	}

	public void setXBB1115(String XBB1115) {
		_XBB1115 = XBB1115;
	}

	public String getXBB0016() {
		return _XBB0016;
	}

	public void setXBB0016(String XBB0016) {
		_XBB0016 = XBB0016;
	}

	public String getXBB1016() {
		return _XBB1016;
	}

	public void setXBB1016(String XBB1016) {
		_XBB1016 = XBB1016;
	}

	public String getXBB1116() {
		return _XBB1116;
	}

	public void setXBB1116(String XBB1116) {
		_XBB1116 = XBB1116;
	}

	public String getXBB0017() {
		return _XBB0017;
	}

	public void setXBB0017(String XBB0017) {
		_XBB0017 = XBB0017;
	}

	public String getXBB1017() {
		return _XBB1017;
	}

	public void setXBB1017(String XBB1017) {
		_XBB1017 = XBB1017;
	}

	public String getXBB1117() {
		return _XBB1117;
	}

	public void setXBB1117(String XBB1117) {
		_XBB1117 = XBB1117;
	}

	public String getXBB0018() {
		return _XBB0018;
	}

	public void setXBB0018(String XBB0018) {
		_XBB0018 = XBB0018;
	}

	public String getXBB0019() {
		return _XBB0019;
	}

	public void setXBB0019(String XBB0019) {
		_XBB0019 = XBB0019;
	}

	public String getXBB0020() {
		return _XBB0020;
	}

	public void setXBB0020(String XBB0020) {
		_XBB0020 = XBB0020;
	}

	public String getXBB0021() {
		return _XBB0021;
	}

	public void setXBB0021(String XBB0021) {
		_XBB0021 = XBB0021;
	}

	public String getXBB0022() {
		return _XBB0022;
	}

	public void setXBB0022(String XBB0022) {
		_XBB0022 = XBB0022;
	}

	public String getXBB1022() {
		return _XBB1022;
	}

	public void setXBB1022(String XBB1022) {
		_XBB1022 = XBB1022;
	}

	public String getXBB0023() {
		return _XBB0023;
	}

	public void setXBB0023(String XBB0023) {
		_XBB0023 = XBB0023;
	}

	public String getXBB0024() {
		return _XBB0024;
	}

	public void setXBB0024(String XBB0024) {
		_XBB0024 = XBB0024;
	}

	public String getXBB0025() {
		return _XBB0025;
	}

	public void setXBB0025(String XBB0025) {
		_XBB0025 = XBB0025;
	}

	public String getXBB0026() {
		return _XBB0026;
	}

	public void setXBB0026(String XBB0026) {
		_XBB0026 = XBB0026;
	}

	public String getXBB1026() {
		return _XBB1026;
	}

	public void setXBB1026(String XBB1026) {
		_XBB1026 = XBB1026;
	}

	public String getXBB0027() {
		return _XBB0027;
	}

	public void setXBB0027(String XBB0027) {
		_XBB0027 = XBB0027;
	}

	public String getXBB1027() {
		return _XBB1027;
	}

	public void setXBB1027(String XBB1027) {
		_XBB1027 = XBB1027;
	}

	public String getXBB0028() {
		return _XBB0028;
	}

	public void setXBB0028(String XBB0028) {
		_XBB0028 = XBB0028;
	}

	public String getXBB0029() {
		return _XBB0029;
	}

	public void setXBB0029(String XBB0029) {
		_XBB0029 = XBB0029;
	}

	public String getXBB1029() {
		return _XBB1029;
	}

	public void setXBB1029(String XBB1029) {
		_XBB1029 = XBB1029;
	}

	public String getXBB0030() {
		return _XBB0030;
	}

	public void setXBB0030(String XBB0030) {
		_XBB0030 = XBB0030;
	}

	public String getXBB0031() {
		return _XBB0031;
	}

	public void setXBB0031(String XBB0031) {
		_XBB0031 = XBB0031;
	}

	public String getXBB0032() {
		return _XBB0032;
	}

	public void setXBB0032(String XBB0032) {
		_XBB0032 = XBB0032;
	}

	public String getXBB0033() {
		return _XBB0033;
	}

	public void setXBB0033(String XBB0033) {
		_XBB0033 = XBB0033;
	}

	public String getXBB1033() {
		return _XBB1033;
	}

	public void setXBB1033(String XBB1033) {
		_XBB1033 = XBB1033;
	}

	public String getXBB0034() {
		return _XBB0034;
	}

	public void setXBB0034(String XBB0034) {
		_XBB0034 = XBB0034;
	}

	public String getXBB1034() {
		return _XBB1034;
	}

	public void setXBB1034(String XBB1034) {
		_XBB1034 = XBB1034;
	}

	public String getXBB0035() {
		return _XBB0035;
	}

	public void setXBB0035(String XBB0035) {
		_XBB0035 = XBB0035;
	}

	public String getXBB0036() {
		return _XBB0036;
	}

	public void setXBB0036(String XBB0036) {
		_XBB0036 = XBB0036;
	}

	public String getXBB1036() {
		return _XBB1036;
	}

	public void setXBB1036(String XBB1036) {
		_XBB1036 = XBB1036;
	}

	public String getXBB0037() {
		return _XBB0037;
	}

	public void setXBB0037(String XBB0037) {
		_XBB0037 = XBB0037;
	}

	public String getXBB0038() {
		return _XBB0038;
	}

	public void setXBB0038(String XBB0038) {
		_XBB0038 = XBB0038;
	}

	public String getXBB0039() {
		return _XBB0039;
	}

	public void setXBB0039(String XBB0039) {
		_XBB0039 = XBB0039;
	}

	public String getXBB0040() {
		return _XBB0040;
	}

	public void setXBB0040(String XBB0040) {
		_XBB0040 = XBB0040;
	}

	public String getXBB0041() {
		return _XBB0041;
	}

	public void setXBB0041(String XBB0041) {
		_XBB0041 = XBB0041;
	}

	public String getXBB0042() {
		return _XBB0042;
	}

	public void setXBB0042(String XBB0042) {
		_XBB0042 = XBB0042;
	}

	public String getXBB0043() {
		return _XBB0043;
	}

	public void setXBB0043(String XBB0043) {
		_XBB0043 = XBB0043;
	}

	public String getXBB0044() {
		return _XBB0044;
	}

	public void setXBB0044(String XBB0044) {
		_XBB0044 = XBB0044;
	}

	public String getXBB1044() {
		return _XBB1044;
	}

	public void setXBB1044(String XBB1044) {
		_XBB1044 = XBB1044;
	}

	public String getXBB0045() {
		return _XBB0045;
	}

	public void setXBB0045(String XBB0045) {
		_XBB0045 = XBB0045;
	}

	public String getXBB0046() {
		return _XBB0046;
	}

	public void setXBB0046(String XBB0046) {
		_XBB0046 = XBB0046;
	}

	public String getXBB0047() {
		return _XBB0047;
	}

	public void setXBB0047(String XBB0047) {
		_XBB0047 = XBB0047;
	}

	public String getXBB0048() {
		return _XBB0048;
	}

	public void setXBB0048(String XBB0048) {
		_XBB0048 = XBB0048;
	}

	public String getXBB0049() {
		return _XBB0049;
	}

	public void setXBB0049(String XBB0049) {
		_XBB0049 = XBB0049;
	}

	public String getXBB0050() {
		return _XBB0050;
	}

	public void setXBB0050(String XBB0050) {
		_XBB0050 = XBB0050;
	}

	public String getXBB0051() {
		return _XBB0051;
	}

	public void setXBB0051(String XBB0051) {
		_XBB0051 = XBB0051;
	}

	public String getXBB0052() {
		return _XBB0052;
	}

	public void setXBB0052(String XBB0052) {
		_XBB0052 = XBB0052;
	}

	public String getXBB0053() {
		return _XBB0053;
	}

	public void setXBB0053(String XBB0053) {
		_XBB0053 = XBB0053;
	}

	public String getXBB0054() {
		return _XBB0054;
	}

	public void setXBB0054(String XBB0054) {
		_XBB0054 = XBB0054;
	}

	public String getXBB0055() {
		return _XBB0055;
	}

	public void setXBB0055(String XBB0055) {
		_XBB0055 = XBB0055;
	}

	public String getXBB0056() {
		return _XBB0056;
	}

	public void setXBB0056(String XBB0056) {
		_XBB0056 = XBB0056;
	}

	public String getXBB0057() {
		return _XBB0057;
	}

	public void setXBB0057(String XBB0057) {
		_XBB0057 = XBB0057;
	}

	public String getXBB0058() {
		return _XBB0058;
	}

	public void setXBB0058(String XBB0058) {
		_XBB0058 = XBB0058;
	}

	public String getXBB0059() {
		return _XBB0059;
	}

	public void setXBB0059(String XBB0059) {
		_XBB0059 = XBB0059;
	}

	public String getXBB0060() {
		return _XBB0060;
	}

	public void setXBB0060(String XBB0060) {
		_XBB0060 = XBB0060;
	}

	public String getXBB0061() {
		return _XBB0061;
	}

	public void setXBB0061(String XBB0061) {
		_XBB0061 = XBB0061;
	}

	public String getXBB0062() {
		return _XBB0062;
	}

	public void setXBB0062(String XBB0062) {
		_XBB0062 = XBB0062;
	}

	public String getXBB0063() {
		return _XBB0063;
	}

	public void setXBB0063(String XBB0063) {
		_XBB0063 = XBB0063;
	}

	public String getXBB0076() {
		return _XBB0076;
	}

	public void setXBB0076(String XBB0076) {
		_XBB0076 = XBB0076;
	}

	public String getXBB0077() {
		return _XBB0077;
	}

	public void setXBB0077(String XBB0077) {
		_XBB0077 = XBB0077;
	}

	public String getXBB0078() {
		return _XBB0078;
	}

	public void setXBB0078(String XBB0078) {
		_XBB0078 = XBB0078;
	}

	public String getXBB0079() {
		return _XBB0079;
	}

	public void setXBB0079(String XBB0079) {
		_XBB0079 = XBB0079;
	}

	public String getXBB0080() {
		return _XBB0080;
	}

	public void setXBB0080(String XBB0080) {
		_XBB0080 = XBB0080;
	}

	public String getXBB1080() {
		return _XBB1080;
	}

	public void setXBB1080(String XBB1080) {
		_XBB1080 = XBB1080;
	}

	public String getXBB0081() {
		return _XBB0081;
	}

	public void setXBB0081(String XBB0081) {
		_XBB0081 = XBB0081;
	}

	public String getXBB1081() {
		return _XBB1081;
	}

	public void setXBB1081(String XBB1081) {
		_XBB1081 = XBB1081;
	}

	public String getXBB1181() {
		return _XBB1181;
	}

	public void setXBB1181(String XBB1181) {
		_XBB1181 = XBB1181;
	}

	public String getXBB0082() {
		return _XBB0082;
	}

	public void setXBB0082(String XBB0082) {
		_XBB0082 = XBB0082;
	}

	public String getXBB1082() {
		return _XBB1082;
	}

	public void setXBB1082(String XBB1082) {
		_XBB1082 = XBB1082;
	}

	public String getXBB1182() {
		return _XBB1182;
	}

	public void setXBB1182(String XBB1182) {
		_XBB1182 = XBB1182;
	}

	public String getXBB0083() {
		return _XBB0083;
	}

	public void setXBB0083(String XBB0083) {
		_XBB0083 = XBB0083;
	}

	public String getXBB1083() {
		return _XBB1083;
	}

	public void setXBB1083(String XBB1083) {
		_XBB1083 = XBB1083;
	}

	public String getXBB1183() {
		return _XBB1183;
	}

	public void setXBB1183(String XBB1183) {
		_XBB1183 = XBB1183;
	}

	public String getXBB0084() {
		return _XBB0084;
	}

	public void setXBB0084(String XBB0084) {
		_XBB0084 = XBB0084;
	}

	public String getXBB0085() {
		return _XBB0085;
	}

	public void setXBB0085(String XBB0085) {
		_XBB0085 = XBB0085;
	}

	public String getXBB0086() {
		return _XBB0086;
	}

	public void setXBB0086(String XBB0086) {
		_XBB0086 = XBB0086;
	}

	public String getXBB0087() {
		return _XBB0087;
	}

	public void setXBB0087(String XBB0087) {
		_XBB0087 = XBB0087;
	}

	public String getXBB0088() {
		return _XBB0088;
	}

	public void setXBB0088(String XBB0088) {
		_XBB0088 = XBB0088;
	}

	public String getXBB0089() {
		return _XBB0089;
	}

	public void setXBB0089(String XBB0089) {
		_XBB0089 = XBB0089;
	}

	public String getXBB0090() {
		return _XBB0090;
	}

	public void setXBB0090(String XBB0090) {
		_XBB0090 = XBB0090;
	}

	public String getXBB0091() {
		return _XBB0091;
	}

	public void setXBB0091(String XBB0091) {
		_XBB0091 = XBB0091;
	}

	public String getXBB0092() {
		return _XBB0092;
	}

	public void setXBB0092(String XBB0092) {
		_XBB0092 = XBB0092;
	}

	public String getXBB0093() {
		return _XBB0093;
	}

	public void setXBB0093(String XBB0093) {
		_XBB0093 = XBB0093;
	}

	public String getXBB0094() {
		return _XBB0094;
	}

	public void setXBB0094(String XBB0094) {
		_XBB0094 = XBB0094;
	}

	public String getXBB0095() {
		return _XBB0095;
	}

	public void setXBB0095(String XBB0095) {
		_XBB0095 = XBB0095;
	}

	public String getXBB0096() {
		return _XBB0096;
	}

	public void setXBB0096(String XBB0096) {
		_XBB0096 = XBB0096;
	}

	public String getXBB0097() {
		return _XBB0097;
	}

	public void setXBB0097(String XBB0097) {
		_XBB0097 = XBB0097;
	}

	public String getXBB0098() {
		return _XBB0098;
	}

	public void setXBB0098(String XBB0098) {
		_XBB0098 = XBB0098;
	}

	public String getXBB0099() {
		return _XBB0099;
	}

	public void setXBB0099(String XBB0099) {
		_XBB0099 = XBB0099;
	}

	public String getXBB0100() {
		return _XBB0100;
	}

	public void setXBB0100(String XBB0100) {
		_XBB0100 = XBB0100;
	}

	public String getXBB0101() {
		return _XBB0101;
	}

	public void setXBB0101(String XBB0101) {
		_XBB0101 = XBB0101;
	}

	public String getXBB0102() {
		return _XBB0102;
	}

	public void setXBB0102(String XBB0102) {
		_XBB0102 = XBB0102;
	}

	public String getXBB0103() {
		return _XBB0103;
	}

	public void setXBB0103(String XBB0103) {
		_XBB0103 = XBB0103;
	}

	public String getXBB0104() {
		return _XBB0104;
	}

	public void setXBB0104(String XBB0104) {
		_XBB0104 = XBB0104;
	}

	public String getXBB2104() {
		return _XBB2104;
	}

	public void setXBB2104(String XBB2104) {
		_XBB2104 = XBB2104;
	}

	public String getXBB0105() {
		return _XBB0105;
	}

	public void setXBB0105(String XBB0105) {
		_XBB0105 = XBB0105;
	}

	public String getXBB2105() {
		return _XBB2105;
	}

	public void setXBB2105(String XBB2105) {
		_XBB2105 = XBB2105;
	}

	public String getXBB0106() {
		return _XBB0106;
	}

	public void setXBB0106(String XBB0106) {
		_XBB0106 = XBB0106;
	}

	public String getXBB2106() {
		return _XBB2106;
	}

	public void setXBB2106(String XBB2106) {
		_XBB2106 = XBB2106;
	}

	public String getXBB0107() {
		return _XBB0107;
	}

	public void setXBB0107(String XBB0107) {
		_XBB0107 = XBB0107;
	}

	public String getXBB2107() {
		return _XBB2107;
	}

	public void setXBB2107(String XBB2107) {
		_XBB2107 = XBB2107;
	}

	public String getXBB0108() {
		return _XBB0108;
	}

	public void setXBB0108(String XBB0108) {
		_XBB0108 = XBB0108;
	}

	public String getXBB2108() {
		return _XBB2108;
	}

	public void setXBB2108(String XBB2108) {
		_XBB2108 = XBB2108;
	}

	public String getXBB0109() {
		return _XBB0109;
	}

	public void setXBB0109(String XBB0109) {
		_XBB0109 = XBB0109;
	}

	public String getXBB2109() {
		return _XBB2109;
	}

	public void setXBB2109(String XBB2109) {
		_XBB2109 = XBB2109;
	}

	public String getXBB0110() {
		return _XBB0110;
	}

	public void setXBB0110(String XBB0110) {
		_XBB0110 = XBB0110;
	}

	public String getXBB2110() {
		return _XBB2110;
	}

	public void setXBB2110(String XBB2110) {
		_XBB2110 = XBB2110;
	}

	public String getXBB0111() {
		return _XBB0111;
	}

	public void setXBB0111(String XBB0111) {
		_XBB0111 = XBB0111;
	}

	public String getXBB2111() {
		return _XBB2111;
	}

	public void setXBB2111(String XBB2111) {
		_XBB2111 = XBB2111;
	}

	public String getXBB0112() {
		return _XBB0112;
	}

	public void setXBB0112(String XBB0112) {
		_XBB0112 = XBB0112;
	}

	public String getXBB2112() {
		return _XBB2112;
	}

	public void setXBB2112(String XBB2112) {
		_XBB2112 = XBB2112;
	}

	public String getXBB0113() {
		return _XBB0113;
	}

	public void setXBB0113(String XBB0113) {
		_XBB0113 = XBB0113;
	}

	public String getXBB2113() {
		return _XBB2113;
	}

	public void setXBB2113(String XBB2113) {
		_XBB2113 = XBB2113;
	}

	public String getXBB0114() {
		return _XBB0114;
	}

	public void setXBB0114(String XBB0114) {
		_XBB0114 = XBB0114;
	}

	public String getXBB2114() {
		return _XBB2114;
	}

	public void setXBB2114(String XBB2114) {
		_XBB2114 = XBB2114;
	}

	public String getXBB0115() {
		return _XBB0115;
	}

	public void setXBB0115(String XBB0115) {
		_XBB0115 = XBB0115;
	}

	public String getXBB2115() {
		return _XBB2115;
	}

	public void setXBB2115(String XBB2115) {
		_XBB2115 = XBB2115;
	}

	public String getXBB0116() {
		return _XBB0116;
	}

	public void setXBB0116(String XBB0116) {
		_XBB0116 = XBB0116;
	}

	public String getXBB2116() {
		return _XBB2116;
	}

	public void setXBB2116(String XBB2116) {
		_XBB2116 = XBB2116;
	}

	public String getXBB0117() {
		return _XBB0117;
	}

	public void setXBB0117(String XBB0117) {
		_XBB0117 = XBB0117;
	}

	public String getXBB2117() {
		return _XBB2117;
	}

	public void setXBB2117(String XBB2117) {
		_XBB2117 = XBB2117;
	}

	public String getXBB0118() {
		return _XBB0118;
	}

	public void setXBB0118(String XBB0118) {
		_XBB0118 = XBB0118;
	}

	public String getXBB0119() {
		return _XBB0119;
	}

	public void setXBB0119(String XBB0119) {
		_XBB0119 = XBB0119;
	}

	public String getXBB2119() {
		return _XBB2119;
	}

	public void setXBB2119(String XBB2119) {
		_XBB2119 = XBB2119;
	}

	public String getXBB0120() {
		return _XBB0120;
	}

	public void setXBB0120(String XBB0120) {
		_XBB0120 = XBB0120;
	}

	public String getXBB0121() {
		return _XBB0121;
	}

	public void setXBB0121(String XBB0121) {
		_XBB0121 = XBB0121;
	}

	public String getXBB0122() {
		return _XBB0122;
	}

	public void setXBB0122(String XBB0122) {
		_XBB0122 = XBB0122;
	}

	public String getXBB0123() {
		return _XBB0123;
	}

	public void setXBB0123(String XBB0123) {
		_XBB0123 = XBB0123;
	}

	public String getXBB0124() {
		return _XBB0124;
	}

	public void setXBB0124(String XBB0124) {
		_XBB0124 = XBB0124;
	}

	public String getXBB0125() {
		return _XBB0125;
	}

	public void setXBB0125(String XBB0125) {
		_XBB0125 = XBB0125;
	}

	public String getXBB0126() {
		return _XBB0126;
	}

	public void setXBB0126(String XBB0126) {
		_XBB0126 = XBB0126;
	}

	public String getXBB1084() {
		return _XBB1084;
	}

	public void setXBB1084(String XBB1084) {
		_XBB1084 = XBB1084;
	}

	public String getXBB1086() {
		return _XBB1086;
	}

	public void setXBB1086(String XBB1086) {
		_XBB1086 = XBB1086;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XBB0009;
	private String _XBB0010;
	private String _XBB0011;
	private String _XBB0012;
	private String _XBB0013;
	private String _XBB0014;
	private String _XBB1014;
	private String _XBB1114;
	private String _XBB0015;
	private String _XBB1015;
	private String _XBB1115;
	private String _XBB0016;
	private String _XBB1016;
	private String _XBB1116;
	private String _XBB0017;
	private String _XBB1017;
	private String _XBB1117;
	private String _XBB0018;
	private String _XBB0019;
	private String _XBB0020;
	private String _XBB0021;
	private String _XBB0022;
	private String _XBB1022;
	private String _XBB0023;
	private String _XBB0024;
	private String _XBB0025;
	private String _XBB0026;
	private String _XBB1026;
	private String _XBB0027;
	private String _XBB1027;
	private String _XBB0028;
	private String _XBB0029;
	private String _XBB1029;
	private String _XBB0030;
	private String _XBB0031;
	private String _XBB0032;
	private String _XBB0033;
	private String _XBB1033;
	private String _XBB0034;
	private String _XBB1034;
	private String _XBB0035;
	private String _XBB0036;
	private String _XBB1036;
	private String _XBB0037;
	private String _XBB0038;
	private String _XBB0039;
	private String _XBB0040;
	private String _XBB0041;
	private String _XBB0042;
	private String _XBB0043;
	private String _XBB0044;
	private String _XBB1044;
	private String _XBB0045;
	private String _XBB0046;
	private String _XBB0047;
	private String _XBB0048;
	private String _XBB0049;
	private String _XBB0050;
	private String _XBB0051;
	private String _XBB0052;
	private String _XBB0053;
	private String _XBB0054;
	private String _XBB0055;
	private String _XBB0056;
	private String _XBB0057;
	private String _XBB0058;
	private String _XBB0059;
	private String _XBB0060;
	private String _XBB0061;
	private String _XBB0062;
	private String _XBB0063;
	private String _XBB0076;
	private String _XBB0077;
	private String _XBB0078;
	private String _XBB0079;
	private String _XBB0080;
	private String _XBB1080;
	private String _XBB0081;
	private String _XBB1081;
	private String _XBB1181;
	private String _XBB0082;
	private String _XBB1082;
	private String _XBB1182;
	private String _XBB0083;
	private String _XBB1083;
	private String _XBB1183;
	private String _XBB0084;
	private String _XBB0085;
	private String _XBB0086;
	private String _XBB0087;
	private String _XBB0088;
	private String _XBB0089;
	private String _XBB0090;
	private String _XBB0091;
	private String _XBB0092;
	private String _XBB0093;
	private String _XBB0094;
	private String _XBB0095;
	private String _XBB0096;
	private String _XBB0097;
	private String _XBB0098;
	private String _XBB0099;
	private String _XBB0100;
	private String _XBB0101;
	private String _XBB0102;
	private String _XBB0103;
	private String _XBB0104;
	private String _XBB2104;
	private String _XBB0105;
	private String _XBB2105;
	private String _XBB0106;
	private String _XBB2106;
	private String _XBB0107;
	private String _XBB2107;
	private String _XBB0108;
	private String _XBB2108;
	private String _XBB0109;
	private String _XBB2109;
	private String _XBB0110;
	private String _XBB2110;
	private String _XBB0111;
	private String _XBB2111;
	private String _XBB0112;
	private String _XBB2112;
	private String _XBB0113;
	private String _XBB2113;
	private String _XBB0114;
	private String _XBB2114;
	private String _XBB0115;
	private String _XBB2115;
	private String _XBB0116;
	private String _XBB2116;
	private String _XBB0117;
	private String _XBB2117;
	private String _XBB0118;
	private String _XBB0119;
	private String _XBB2119;
	private String _XBB0120;
	private String _XBB0121;
	private String _XBB0122;
	private String _XBB0123;
	private String _XBB0124;
	private String _XBB0125;
	private String _XBB0126;
	private String _XBB1084;
	private String _XBB1086;
}