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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXECOGIOIServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXECOGIOIServiceSoap
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOISoap implements Serializable {
	public static THONGSOCHUNGCHIXECOGIOISoap toSoapModel(
		THONGSOCHUNGCHIXECOGIOI model) {
		THONGSOCHUNGCHIXECOGIOISoap soapModel = new THONGSOCHUNGCHIXECOGIOISoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSynchDate(model.getSynchDate());
		soapModel.setXCG0009(model.getXCG0009());
		soapModel.setXCG0010(model.getXCG0010());
		soapModel.setXCG0011(model.getXCG0011());
		soapModel.setXCG0012(model.getXCG0012());
		soapModel.setXCG0013(model.getXCG0013());
		soapModel.setXCG0014(model.getXCG0014());
		soapModel.setXCG0015(model.getXCG0015());
		soapModel.setXCG0016(model.getXCG0016());
		soapModel.setXCG0017(model.getXCG0017());
		soapModel.setXCG0018(model.getXCG0018());
		soapModel.setXCG0019(model.getXCG0019());
		soapModel.setXCG0020(model.getXCG0020());
		soapModel.setXCG0021(model.getXCG0021());
		soapModel.setXCG1021(model.getXCG1021());
		soapModel.setXCG1121(model.getXCG1121());
		soapModel.setXCG0022(model.getXCG0022());
		soapModel.setXCG1022(model.getXCG1022());
		soapModel.setXCG1122(model.getXCG1122());
		soapModel.setXCG0023(model.getXCG0023());
		soapModel.setXCG1023(model.getXCG1023());
		soapModel.setXCG1123(model.getXCG1123());
		soapModel.setXCG0024(model.getXCG0024());
		soapModel.setXCG1024(model.getXCG1024());
		soapModel.setXCG1124(model.getXCG1124());
		soapModel.setXCG0025(model.getXCG0025());
		soapModel.setXCG1025(model.getXCG1025());
		soapModel.setXCG1125(model.getXCG1125());
		soapModel.setXCG0026(model.getXCG0026());
		soapModel.setXCG1026(model.getXCG1026());
		soapModel.setXCG1126(model.getXCG1126());
		soapModel.setXCG0027(model.getXCG0027());
		soapModel.setXCG1027(model.getXCG1027());
		soapModel.setXCG1127(model.getXCG1127());
		soapModel.setXCG0028(model.getXCG0028());
		soapModel.setXCG1028(model.getXCG1028());
		soapModel.setXCG1128(model.getXCG1128());
		soapModel.setXCG0029(model.getXCG0029());
		soapModel.setXCG1029(model.getXCG1029());
		soapModel.setXCG1129(model.getXCG1129());
		soapModel.setXCG0030(model.getXCG0030());
		soapModel.setXCG1030(model.getXCG1030());
		soapModel.setXCG1130(model.getXCG1130());
		soapModel.setXCG0031(model.getXCG0031());
		soapModel.setXCG1031(model.getXCG1031());
		soapModel.setXCG1131(model.getXCG1131());
		soapModel.setXCG0032(model.getXCG0032());
		soapModel.setXCG1032(model.getXCG1032());
		soapModel.setXCG1132(model.getXCG1132());
		soapModel.setXCG0033(model.getXCG0033());
		soapModel.setXCG1033(model.getXCG1033());
		soapModel.setXCG1133(model.getXCG1133());
		soapModel.setXCG0034(model.getXCG0034());
		soapModel.setXCG1034(model.getXCG1034());
		soapModel.setXCG1134(model.getXCG1134());
		soapModel.setXCG0035(model.getXCG0035());
		soapModel.setXCG1035(model.getXCG1035());
		soapModel.setXCG1135(model.getXCG1135());
		soapModel.setXCG0036(model.getXCG0036());
		soapModel.setXCG1036(model.getXCG1036());
		soapModel.setXCG1136(model.getXCG1136());
		soapModel.setXCG0037(model.getXCG0037());
		soapModel.setXCG1037(model.getXCG1037());
		soapModel.setXCG1137(model.getXCG1137());
		soapModel.setXCG0038(model.getXCG0038());
		soapModel.setXCG1038(model.getXCG1038());
		soapModel.setXCG1138(model.getXCG1138());
		soapModel.setXCG0039(model.getXCG0039());
		soapModel.setXCG1039(model.getXCG1039());
		soapModel.setXCG1139(model.getXCG1139());
		soapModel.setXCG0040(model.getXCG0040());
		soapModel.setXCG1040(model.getXCG1040());
		soapModel.setXCG1140(model.getXCG1140());
		soapModel.setXCG0041(model.getXCG0041());
		soapModel.setXCG1041(model.getXCG1041());
		soapModel.setXCG1141(model.getXCG1141());
		soapModel.setXCG0042(model.getXCG0042());
		soapModel.setXCG1042(model.getXCG1042());
		soapModel.setXCG1142(model.getXCG1142());
		soapModel.setXCG0043(model.getXCG0043());
		soapModel.setXCG1043(model.getXCG1043());
		soapModel.setXCG1143(model.getXCG1143());
		soapModel.setXCG0044(model.getXCG0044());
		soapModel.setXCG1044(model.getXCG1044());
		soapModel.setXCG1144(model.getXCG1144());
		soapModel.setXCG0045(model.getXCG0045());
		soapModel.setXCG0046(model.getXCG0046());
		soapModel.setXCG1047(model.getXCG1047());
		soapModel.setXCG0047(model.getXCG0047());
		soapModel.setXCG0048(model.getXCG0048());
		soapModel.setXCG0049(model.getXCG0049());
		soapModel.setXCG0050(model.getXCG0050());
		soapModel.setXCG0051(model.getXCG0051());
		soapModel.setXCG0052(model.getXCG0052());
		soapModel.setXCG0053(model.getXCG0053());
		soapModel.setXCG0054(model.getXCG0054());
		soapModel.setXCG1054(model.getXCG1054());
		soapModel.setXCG1154(model.getXCG1154());
		soapModel.setXCG1254(model.getXCG1254());
		soapModel.setXCG1354(model.getXCG1354());
		soapModel.setXCG1454(model.getXCG1454());
		soapModel.setXCG1554(model.getXCG1554());
		soapModel.setXCG1654(model.getXCG1654());
		soapModel.setXCG1754(model.getXCG1754());
		soapModel.setXCG0055(model.getXCG0055());
		soapModel.setXCG0056(model.getXCG0056());
		soapModel.setXCG0057(model.getXCG0057());
		soapModel.setXCG0058(model.getXCG0058());
		soapModel.setXCG0059(model.getXCG0059());
		soapModel.setXCG1059(model.getXCG1059());
		soapModel.setXCG0060(model.getXCG0060());
		soapModel.setXCG0061(model.getXCG0061());
		soapModel.setXCG0062(model.getXCG0062());
		soapModel.setXCG0063(model.getXCG0063());
		soapModel.setXCG0064(model.getXCG0064());
		soapModel.setXCG0065(model.getXCG0065());
		soapModel.setXCG0066(model.getXCG0066());
		soapModel.setXCG1066(model.getXCG1066());
		soapModel.setXCG0067(model.getXCG0067());
		soapModel.setXCG0068(model.getXCG0068());
		soapModel.setXCG0069(model.getXCG0069());
		soapModel.setXCG0070(model.getXCG0070());
		soapModel.setXCG0071(model.getXCG0071());
		soapModel.setXCG0072(model.getXCG0072());
		soapModel.setXCG1072(model.getXCG1072());
		soapModel.setXCG0073(model.getXCG0073());
		soapModel.setXCG0074(model.getXCG0074());
		soapModel.setXCG0075(model.getXCG0075());
		soapModel.setXCG0076(model.getXCG0076());
		soapModel.setXCG0077(model.getXCG0077());
		soapModel.setXCG1077(model.getXCG1077());
		soapModel.setXCG0078(model.getXCG0078());
		soapModel.setXCG1078(model.getXCG1078());
		soapModel.setXCG0079(model.getXCG0079());
		soapModel.setXCG0080(model.getXCG0080());
		soapModel.setXCG1080(model.getXCG1080());
		soapModel.setXCG0081(model.getXCG0081());
		soapModel.setXCG0082(model.getXCG0082());
		soapModel.setXCG0083(model.getXCG0083());
		soapModel.setXCG0084(model.getXCG0084());
		soapModel.setXCG0085(model.getXCG0085());
		soapModel.setXCG1085(model.getXCG1085());
		soapModel.setXCG0086(model.getXCG0086());
		soapModel.setXCG1086(model.getXCG1086());
		soapModel.setXCG0087(model.getXCG0087());
		soapModel.setXCG0088(model.getXCG0088());
		soapModel.setXCG1088(model.getXCG1088());
		soapModel.setXCG0089(model.getXCG0089());
		soapModel.setXCG0090(model.getXCG0090());
		soapModel.setXCG0091(model.getXCG0091());
		soapModel.setXCG0092(model.getXCG0092());
		soapModel.setXCG0093(model.getXCG0093());
		soapModel.setXCG0094(model.getXCG0094());
		soapModel.setXCG0095(model.getXCG0095());
		soapModel.setXCG0096(model.getXCG0096());
		soapModel.setXCG0097(model.getXCG0097());
		soapModel.setXCG1097(model.getXCG1097());
		soapModel.setXCG0098(model.getXCG0098());
		soapModel.setXCG0099(model.getXCG0099());
		soapModel.setXCG0100(model.getXCG0100());
		soapModel.setXCG0101(model.getXCG0101());
		soapModel.setXCG0102(model.getXCG0102());
		soapModel.setXCG0103(model.getXCG0103());
		soapModel.setXCG0104(model.getXCG0104());
		soapModel.setXCG0105(model.getXCG0105());
		soapModel.setXCG0106(model.getXCG0106());
		soapModel.setXCG0107(model.getXCG0107());
		soapModel.setXCG0108(model.getXCG0108());
		soapModel.setXCG0109(model.getXCG0109());
		soapModel.setXCG0110(model.getXCG0110());
		soapModel.setXCG0111(model.getXCG0111());
		soapModel.setXCG0112(model.getXCG0112());
		soapModel.setXCG0113(model.getXCG0113());
		soapModel.setXCG0114(model.getXCG0114());
		soapModel.setXCG0115(model.getXCG0115());
		soapModel.setXCG0116(model.getXCG0116());
		soapModel.setXCG0117(model.getXCG0117());
		soapModel.setXCG0118(model.getXCG0118());
		soapModel.setXCG0119(model.getXCG0119());
		soapModel.setXCG0120(model.getXCG0120());
		soapModel.setXCG0121(model.getXCG0121());
		soapModel.setXCG0122(model.getXCG0122());
		soapModel.setXCG0123(model.getXCG0123());
		soapModel.setXCG0124(model.getXCG0124());
		soapModel.setXCG0125(model.getXCG0125());
		soapModel.setXCG0126(model.getXCG0126());
		soapModel.setXCG0127(model.getXCG0127());
		soapModel.setXCG0128(model.getXCG0128());
		soapModel.setXCG0238(model.getXCG0238());
		soapModel.setXCG0239(model.getXCG0239());
		soapModel.setXCG0240(model.getXCG0240());
		soapModel.setXCG0241(model.getXCG0241());

		return soapModel;
	}

	public static THONGSOCHUNGCHIXECOGIOISoap[] toSoapModels(
		THONGSOCHUNGCHIXECOGIOI[] models) {
		THONGSOCHUNGCHIXECOGIOISoap[] soapModels = new THONGSOCHUNGCHIXECOGIOISoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXECOGIOISoap[][] toSoapModels(
		THONGSOCHUNGCHIXECOGIOI[][] models) {
		THONGSOCHUNGCHIXECOGIOISoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGSOCHUNGCHIXECOGIOISoap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGSOCHUNGCHIXECOGIOISoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXECOGIOISoap[] toSoapModels(
		List<THONGSOCHUNGCHIXECOGIOI> models) {
		List<THONGSOCHUNGCHIXECOGIOISoap> soapModels = new ArrayList<THONGSOCHUNGCHIXECOGIOISoap>(models.size());

		for (THONGSOCHUNGCHIXECOGIOI model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGSOCHUNGCHIXECOGIOISoap[soapModels.size()]);
	}

	public THONGSOCHUNGCHIXECOGIOISoap() {
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

	public String getXCG0009() {
		return _XCG0009;
	}

	public void setXCG0009(String XCG0009) {
		_XCG0009 = XCG0009;
	}

	public String getXCG0010() {
		return _XCG0010;
	}

	public void setXCG0010(String XCG0010) {
		_XCG0010 = XCG0010;
	}

	public String getXCG0011() {
		return _XCG0011;
	}

	public void setXCG0011(String XCG0011) {
		_XCG0011 = XCG0011;
	}

	public String getXCG0012() {
		return _XCG0012;
	}

	public void setXCG0012(String XCG0012) {
		_XCG0012 = XCG0012;
	}

	public String getXCG0013() {
		return _XCG0013;
	}

	public void setXCG0013(String XCG0013) {
		_XCG0013 = XCG0013;
	}

	public String getXCG0014() {
		return _XCG0014;
	}

	public void setXCG0014(String XCG0014) {
		_XCG0014 = XCG0014;
	}

	public String getXCG0015() {
		return _XCG0015;
	}

	public void setXCG0015(String XCG0015) {
		_XCG0015 = XCG0015;
	}

	public String getXCG0016() {
		return _XCG0016;
	}

	public void setXCG0016(String XCG0016) {
		_XCG0016 = XCG0016;
	}

	public String getXCG0017() {
		return _XCG0017;
	}

	public void setXCG0017(String XCG0017) {
		_XCG0017 = XCG0017;
	}

	public String getXCG0018() {
		return _XCG0018;
	}

	public void setXCG0018(String XCG0018) {
		_XCG0018 = XCG0018;
	}

	public String getXCG0019() {
		return _XCG0019;
	}

	public void setXCG0019(String XCG0019) {
		_XCG0019 = XCG0019;
	}

	public String getXCG0020() {
		return _XCG0020;
	}

	public void setXCG0020(String XCG0020) {
		_XCG0020 = XCG0020;
	}

	public String getXCG0021() {
		return _XCG0021;
	}

	public void setXCG0021(String XCG0021) {
		_XCG0021 = XCG0021;
	}

	public String getXCG1021() {
		return _XCG1021;
	}

	public void setXCG1021(String XCG1021) {
		_XCG1021 = XCG1021;
	}

	public String getXCG1121() {
		return _XCG1121;
	}

	public void setXCG1121(String XCG1121) {
		_XCG1121 = XCG1121;
	}

	public String getXCG0022() {
		return _XCG0022;
	}

	public void setXCG0022(String XCG0022) {
		_XCG0022 = XCG0022;
	}

	public String getXCG1022() {
		return _XCG1022;
	}

	public void setXCG1022(String XCG1022) {
		_XCG1022 = XCG1022;
	}

	public String getXCG1122() {
		return _XCG1122;
	}

	public void setXCG1122(String XCG1122) {
		_XCG1122 = XCG1122;
	}

	public String getXCG0023() {
		return _XCG0023;
	}

	public void setXCG0023(String XCG0023) {
		_XCG0023 = XCG0023;
	}

	public String getXCG1023() {
		return _XCG1023;
	}

	public void setXCG1023(String XCG1023) {
		_XCG1023 = XCG1023;
	}

	public String getXCG1123() {
		return _XCG1123;
	}

	public void setXCG1123(String XCG1123) {
		_XCG1123 = XCG1123;
	}

	public String getXCG0024() {
		return _XCG0024;
	}

	public void setXCG0024(String XCG0024) {
		_XCG0024 = XCG0024;
	}

	public String getXCG1024() {
		return _XCG1024;
	}

	public void setXCG1024(String XCG1024) {
		_XCG1024 = XCG1024;
	}

	public String getXCG1124() {
		return _XCG1124;
	}

	public void setXCG1124(String XCG1124) {
		_XCG1124 = XCG1124;
	}

	public String getXCG0025() {
		return _XCG0025;
	}

	public void setXCG0025(String XCG0025) {
		_XCG0025 = XCG0025;
	}

	public String getXCG1025() {
		return _XCG1025;
	}

	public void setXCG1025(String XCG1025) {
		_XCG1025 = XCG1025;
	}

	public String getXCG1125() {
		return _XCG1125;
	}

	public void setXCG1125(String XCG1125) {
		_XCG1125 = XCG1125;
	}

	public String getXCG0026() {
		return _XCG0026;
	}

	public void setXCG0026(String XCG0026) {
		_XCG0026 = XCG0026;
	}

	public String getXCG1026() {
		return _XCG1026;
	}

	public void setXCG1026(String XCG1026) {
		_XCG1026 = XCG1026;
	}

	public String getXCG1126() {
		return _XCG1126;
	}

	public void setXCG1126(String XCG1126) {
		_XCG1126 = XCG1126;
	}

	public String getXCG0027() {
		return _XCG0027;
	}

	public void setXCG0027(String XCG0027) {
		_XCG0027 = XCG0027;
	}

	public String getXCG1027() {
		return _XCG1027;
	}

	public void setXCG1027(String XCG1027) {
		_XCG1027 = XCG1027;
	}

	public String getXCG1127() {
		return _XCG1127;
	}

	public void setXCG1127(String XCG1127) {
		_XCG1127 = XCG1127;
	}

	public String getXCG0028() {
		return _XCG0028;
	}

	public void setXCG0028(String XCG0028) {
		_XCG0028 = XCG0028;
	}

	public String getXCG1028() {
		return _XCG1028;
	}

	public void setXCG1028(String XCG1028) {
		_XCG1028 = XCG1028;
	}

	public String getXCG1128() {
		return _XCG1128;
	}

	public void setXCG1128(String XCG1128) {
		_XCG1128 = XCG1128;
	}

	public String getXCG0029() {
		return _XCG0029;
	}

	public void setXCG0029(String XCG0029) {
		_XCG0029 = XCG0029;
	}

	public String getXCG1029() {
		return _XCG1029;
	}

	public void setXCG1029(String XCG1029) {
		_XCG1029 = XCG1029;
	}

	public String getXCG1129() {
		return _XCG1129;
	}

	public void setXCG1129(String XCG1129) {
		_XCG1129 = XCG1129;
	}

	public String getXCG0030() {
		return _XCG0030;
	}

	public void setXCG0030(String XCG0030) {
		_XCG0030 = XCG0030;
	}

	public String getXCG1030() {
		return _XCG1030;
	}

	public void setXCG1030(String XCG1030) {
		_XCG1030 = XCG1030;
	}

	public String getXCG1130() {
		return _XCG1130;
	}

	public void setXCG1130(String XCG1130) {
		_XCG1130 = XCG1130;
	}

	public String getXCG0031() {
		return _XCG0031;
	}

	public void setXCG0031(String XCG0031) {
		_XCG0031 = XCG0031;
	}

	public String getXCG1031() {
		return _XCG1031;
	}

	public void setXCG1031(String XCG1031) {
		_XCG1031 = XCG1031;
	}

	public String getXCG1131() {
		return _XCG1131;
	}

	public void setXCG1131(String XCG1131) {
		_XCG1131 = XCG1131;
	}

	public String getXCG0032() {
		return _XCG0032;
	}

	public void setXCG0032(String XCG0032) {
		_XCG0032 = XCG0032;
	}

	public String getXCG1032() {
		return _XCG1032;
	}

	public void setXCG1032(String XCG1032) {
		_XCG1032 = XCG1032;
	}

	public String getXCG1132() {
		return _XCG1132;
	}

	public void setXCG1132(String XCG1132) {
		_XCG1132 = XCG1132;
	}

	public String getXCG0033() {
		return _XCG0033;
	}

	public void setXCG0033(String XCG0033) {
		_XCG0033 = XCG0033;
	}

	public String getXCG1033() {
		return _XCG1033;
	}

	public void setXCG1033(String XCG1033) {
		_XCG1033 = XCG1033;
	}

	public String getXCG1133() {
		return _XCG1133;
	}

	public void setXCG1133(String XCG1133) {
		_XCG1133 = XCG1133;
	}

	public String getXCG0034() {
		return _XCG0034;
	}

	public void setXCG0034(String XCG0034) {
		_XCG0034 = XCG0034;
	}

	public String getXCG1034() {
		return _XCG1034;
	}

	public void setXCG1034(String XCG1034) {
		_XCG1034 = XCG1034;
	}

	public String getXCG1134() {
		return _XCG1134;
	}

	public void setXCG1134(String XCG1134) {
		_XCG1134 = XCG1134;
	}

	public String getXCG0035() {
		return _XCG0035;
	}

	public void setXCG0035(String XCG0035) {
		_XCG0035 = XCG0035;
	}

	public String getXCG1035() {
		return _XCG1035;
	}

	public void setXCG1035(String XCG1035) {
		_XCG1035 = XCG1035;
	}

	public String getXCG1135() {
		return _XCG1135;
	}

	public void setXCG1135(String XCG1135) {
		_XCG1135 = XCG1135;
	}

	public String getXCG0036() {
		return _XCG0036;
	}

	public void setXCG0036(String XCG0036) {
		_XCG0036 = XCG0036;
	}

	public String getXCG1036() {
		return _XCG1036;
	}

	public void setXCG1036(String XCG1036) {
		_XCG1036 = XCG1036;
	}

	public String getXCG1136() {
		return _XCG1136;
	}

	public void setXCG1136(String XCG1136) {
		_XCG1136 = XCG1136;
	}

	public String getXCG0037() {
		return _XCG0037;
	}

	public void setXCG0037(String XCG0037) {
		_XCG0037 = XCG0037;
	}

	public String getXCG1037() {
		return _XCG1037;
	}

	public void setXCG1037(String XCG1037) {
		_XCG1037 = XCG1037;
	}

	public String getXCG1137() {
		return _XCG1137;
	}

	public void setXCG1137(String XCG1137) {
		_XCG1137 = XCG1137;
	}

	public String getXCG0038() {
		return _XCG0038;
	}

	public void setXCG0038(String XCG0038) {
		_XCG0038 = XCG0038;
	}

	public String getXCG1038() {
		return _XCG1038;
	}

	public void setXCG1038(String XCG1038) {
		_XCG1038 = XCG1038;
	}

	public String getXCG1138() {
		return _XCG1138;
	}

	public void setXCG1138(String XCG1138) {
		_XCG1138 = XCG1138;
	}

	public String getXCG0039() {
		return _XCG0039;
	}

	public void setXCG0039(String XCG0039) {
		_XCG0039 = XCG0039;
	}

	public String getXCG1039() {
		return _XCG1039;
	}

	public void setXCG1039(String XCG1039) {
		_XCG1039 = XCG1039;
	}

	public String getXCG1139() {
		return _XCG1139;
	}

	public void setXCG1139(String XCG1139) {
		_XCG1139 = XCG1139;
	}

	public String getXCG0040() {
		return _XCG0040;
	}

	public void setXCG0040(String XCG0040) {
		_XCG0040 = XCG0040;
	}

	public String getXCG1040() {
		return _XCG1040;
	}

	public void setXCG1040(String XCG1040) {
		_XCG1040 = XCG1040;
	}

	public String getXCG1140() {
		return _XCG1140;
	}

	public void setXCG1140(String XCG1140) {
		_XCG1140 = XCG1140;
	}

	public String getXCG0041() {
		return _XCG0041;
	}

	public void setXCG0041(String XCG0041) {
		_XCG0041 = XCG0041;
	}

	public String getXCG1041() {
		return _XCG1041;
	}

	public void setXCG1041(String XCG1041) {
		_XCG1041 = XCG1041;
	}

	public String getXCG1141() {
		return _XCG1141;
	}

	public void setXCG1141(String XCG1141) {
		_XCG1141 = XCG1141;
	}

	public String getXCG0042() {
		return _XCG0042;
	}

	public void setXCG0042(String XCG0042) {
		_XCG0042 = XCG0042;
	}

	public String getXCG1042() {
		return _XCG1042;
	}

	public void setXCG1042(String XCG1042) {
		_XCG1042 = XCG1042;
	}

	public String getXCG1142() {
		return _XCG1142;
	}

	public void setXCG1142(String XCG1142) {
		_XCG1142 = XCG1142;
	}

	public String getXCG0043() {
		return _XCG0043;
	}

	public void setXCG0043(String XCG0043) {
		_XCG0043 = XCG0043;
	}

	public String getXCG1043() {
		return _XCG1043;
	}

	public void setXCG1043(String XCG1043) {
		_XCG1043 = XCG1043;
	}

	public String getXCG1143() {
		return _XCG1143;
	}

	public void setXCG1143(String XCG1143) {
		_XCG1143 = XCG1143;
	}

	public String getXCG0044() {
		return _XCG0044;
	}

	public void setXCG0044(String XCG0044) {
		_XCG0044 = XCG0044;
	}

	public String getXCG1044() {
		return _XCG1044;
	}

	public void setXCG1044(String XCG1044) {
		_XCG1044 = XCG1044;
	}

	public String getXCG1144() {
		return _XCG1144;
	}

	public void setXCG1144(String XCG1144) {
		_XCG1144 = XCG1144;
	}

	public String getXCG0045() {
		return _XCG0045;
	}

	public void setXCG0045(String XCG0045) {
		_XCG0045 = XCG0045;
	}

	public String getXCG0046() {
		return _XCG0046;
	}

	public void setXCG0046(String XCG0046) {
		_XCG0046 = XCG0046;
	}

	public String getXCG1047() {
		return _XCG1047;
	}

	public void setXCG1047(String XCG1047) {
		_XCG1047 = XCG1047;
	}

	public String getXCG0047() {
		return _XCG0047;
	}

	public void setXCG0047(String XCG0047) {
		_XCG0047 = XCG0047;
	}

	public String getXCG0048() {
		return _XCG0048;
	}

	public void setXCG0048(String XCG0048) {
		_XCG0048 = XCG0048;
	}

	public String getXCG0049() {
		return _XCG0049;
	}

	public void setXCG0049(String XCG0049) {
		_XCG0049 = XCG0049;
	}

	public String getXCG0050() {
		return _XCG0050;
	}

	public void setXCG0050(String XCG0050) {
		_XCG0050 = XCG0050;
	}

	public String getXCG0051() {
		return _XCG0051;
	}

	public void setXCG0051(String XCG0051) {
		_XCG0051 = XCG0051;
	}

	public String getXCG0052() {
		return _XCG0052;
	}

	public void setXCG0052(String XCG0052) {
		_XCG0052 = XCG0052;
	}

	public String getXCG0053() {
		return _XCG0053;
	}

	public void setXCG0053(String XCG0053) {
		_XCG0053 = XCG0053;
	}

	public String getXCG0054() {
		return _XCG0054;
	}

	public void setXCG0054(String XCG0054) {
		_XCG0054 = XCG0054;
	}

	public String getXCG1054() {
		return _XCG1054;
	}

	public void setXCG1054(String XCG1054) {
		_XCG1054 = XCG1054;
	}

	public String getXCG1154() {
		return _XCG1154;
	}

	public void setXCG1154(String XCG1154) {
		_XCG1154 = XCG1154;
	}

	public String getXCG1254() {
		return _XCG1254;
	}

	public void setXCG1254(String XCG1254) {
		_XCG1254 = XCG1254;
	}

	public String getXCG1354() {
		return _XCG1354;
	}

	public void setXCG1354(String XCG1354) {
		_XCG1354 = XCG1354;
	}

	public String getXCG1454() {
		return _XCG1454;
	}

	public void setXCG1454(String XCG1454) {
		_XCG1454 = XCG1454;
	}

	public String getXCG1554() {
		return _XCG1554;
	}

	public void setXCG1554(String XCG1554) {
		_XCG1554 = XCG1554;
	}

	public String getXCG1654() {
		return _XCG1654;
	}

	public void setXCG1654(String XCG1654) {
		_XCG1654 = XCG1654;
	}

	public String getXCG1754() {
		return _XCG1754;
	}

	public void setXCG1754(String XCG1754) {
		_XCG1754 = XCG1754;
	}

	public String getXCG0055() {
		return _XCG0055;
	}

	public void setXCG0055(String XCG0055) {
		_XCG0055 = XCG0055;
	}

	public String getXCG0056() {
		return _XCG0056;
	}

	public void setXCG0056(String XCG0056) {
		_XCG0056 = XCG0056;
	}

	public String getXCG0057() {
		return _XCG0057;
	}

	public void setXCG0057(String XCG0057) {
		_XCG0057 = XCG0057;
	}

	public String getXCG0058() {
		return _XCG0058;
	}

	public void setXCG0058(String XCG0058) {
		_XCG0058 = XCG0058;
	}

	public String getXCG0059() {
		return _XCG0059;
	}

	public void setXCG0059(String XCG0059) {
		_XCG0059 = XCG0059;
	}

	public String getXCG1059() {
		return _XCG1059;
	}

	public void setXCG1059(String XCG1059) {
		_XCG1059 = XCG1059;
	}

	public String getXCG0060() {
		return _XCG0060;
	}

	public void setXCG0060(String XCG0060) {
		_XCG0060 = XCG0060;
	}

	public String getXCG0061() {
		return _XCG0061;
	}

	public void setXCG0061(String XCG0061) {
		_XCG0061 = XCG0061;
	}

	public String getXCG0062() {
		return _XCG0062;
	}

	public void setXCG0062(String XCG0062) {
		_XCG0062 = XCG0062;
	}

	public String getXCG0063() {
		return _XCG0063;
	}

	public void setXCG0063(String XCG0063) {
		_XCG0063 = XCG0063;
	}

	public String getXCG0064() {
		return _XCG0064;
	}

	public void setXCG0064(String XCG0064) {
		_XCG0064 = XCG0064;
	}

	public String getXCG0065() {
		return _XCG0065;
	}

	public void setXCG0065(String XCG0065) {
		_XCG0065 = XCG0065;
	}

	public String getXCG0066() {
		return _XCG0066;
	}

	public void setXCG0066(String XCG0066) {
		_XCG0066 = XCG0066;
	}

	public String getXCG1066() {
		return _XCG1066;
	}

	public void setXCG1066(String XCG1066) {
		_XCG1066 = XCG1066;
	}

	public String getXCG0067() {
		return _XCG0067;
	}

	public void setXCG0067(String XCG0067) {
		_XCG0067 = XCG0067;
	}

	public String getXCG0068() {
		return _XCG0068;
	}

	public void setXCG0068(String XCG0068) {
		_XCG0068 = XCG0068;
	}

	public String getXCG0069() {
		return _XCG0069;
	}

	public void setXCG0069(String XCG0069) {
		_XCG0069 = XCG0069;
	}

	public String getXCG0070() {
		return _XCG0070;
	}

	public void setXCG0070(String XCG0070) {
		_XCG0070 = XCG0070;
	}

	public String getXCG0071() {
		return _XCG0071;
	}

	public void setXCG0071(String XCG0071) {
		_XCG0071 = XCG0071;
	}

	public String getXCG0072() {
		return _XCG0072;
	}

	public void setXCG0072(String XCG0072) {
		_XCG0072 = XCG0072;
	}

	public String getXCG1072() {
		return _XCG1072;
	}

	public void setXCG1072(String XCG1072) {
		_XCG1072 = XCG1072;
	}

	public String getXCG0073() {
		return _XCG0073;
	}

	public void setXCG0073(String XCG0073) {
		_XCG0073 = XCG0073;
	}

	public String getXCG0074() {
		return _XCG0074;
	}

	public void setXCG0074(String XCG0074) {
		_XCG0074 = XCG0074;
	}

	public String getXCG0075() {
		return _XCG0075;
	}

	public void setXCG0075(String XCG0075) {
		_XCG0075 = XCG0075;
	}

	public String getXCG0076() {
		return _XCG0076;
	}

	public void setXCG0076(String XCG0076) {
		_XCG0076 = XCG0076;
	}

	public String getXCG0077() {
		return _XCG0077;
	}

	public void setXCG0077(String XCG0077) {
		_XCG0077 = XCG0077;
	}

	public String getXCG1077() {
		return _XCG1077;
	}

	public void setXCG1077(String XCG1077) {
		_XCG1077 = XCG1077;
	}

	public String getXCG0078() {
		return _XCG0078;
	}

	public void setXCG0078(String XCG0078) {
		_XCG0078 = XCG0078;
	}

	public String getXCG1078() {
		return _XCG1078;
	}

	public void setXCG1078(String XCG1078) {
		_XCG1078 = XCG1078;
	}

	public String getXCG0079() {
		return _XCG0079;
	}

	public void setXCG0079(String XCG0079) {
		_XCG0079 = XCG0079;
	}

	public String getXCG0080() {
		return _XCG0080;
	}

	public void setXCG0080(String XCG0080) {
		_XCG0080 = XCG0080;
	}

	public String getXCG1080() {
		return _XCG1080;
	}

	public void setXCG1080(String XCG1080) {
		_XCG1080 = XCG1080;
	}

	public String getXCG0081() {
		return _XCG0081;
	}

	public void setXCG0081(String XCG0081) {
		_XCG0081 = XCG0081;
	}

	public String getXCG0082() {
		return _XCG0082;
	}

	public void setXCG0082(String XCG0082) {
		_XCG0082 = XCG0082;
	}

	public String getXCG0083() {
		return _XCG0083;
	}

	public void setXCG0083(String XCG0083) {
		_XCG0083 = XCG0083;
	}

	public String getXCG0084() {
		return _XCG0084;
	}

	public void setXCG0084(String XCG0084) {
		_XCG0084 = XCG0084;
	}

	public String getXCG0085() {
		return _XCG0085;
	}

	public void setXCG0085(String XCG0085) {
		_XCG0085 = XCG0085;
	}

	public String getXCG1085() {
		return _XCG1085;
	}

	public void setXCG1085(String XCG1085) {
		_XCG1085 = XCG1085;
	}

	public String getXCG0086() {
		return _XCG0086;
	}

	public void setXCG0086(String XCG0086) {
		_XCG0086 = XCG0086;
	}

	public String getXCG1086() {
		return _XCG1086;
	}

	public void setXCG1086(String XCG1086) {
		_XCG1086 = XCG1086;
	}

	public String getXCG0087() {
		return _XCG0087;
	}

	public void setXCG0087(String XCG0087) {
		_XCG0087 = XCG0087;
	}

	public String getXCG0088() {
		return _XCG0088;
	}

	public void setXCG0088(String XCG0088) {
		_XCG0088 = XCG0088;
	}

	public String getXCG1088() {
		return _XCG1088;
	}

	public void setXCG1088(String XCG1088) {
		_XCG1088 = XCG1088;
	}

	public String getXCG0089() {
		return _XCG0089;
	}

	public void setXCG0089(String XCG0089) {
		_XCG0089 = XCG0089;
	}

	public String getXCG0090() {
		return _XCG0090;
	}

	public void setXCG0090(String XCG0090) {
		_XCG0090 = XCG0090;
	}

	public String getXCG0091() {
		return _XCG0091;
	}

	public void setXCG0091(String XCG0091) {
		_XCG0091 = XCG0091;
	}

	public String getXCG0092() {
		return _XCG0092;
	}

	public void setXCG0092(String XCG0092) {
		_XCG0092 = XCG0092;
	}

	public String getXCG0093() {
		return _XCG0093;
	}

	public void setXCG0093(String XCG0093) {
		_XCG0093 = XCG0093;
	}

	public String getXCG0094() {
		return _XCG0094;
	}

	public void setXCG0094(String XCG0094) {
		_XCG0094 = XCG0094;
	}

	public String getXCG0095() {
		return _XCG0095;
	}

	public void setXCG0095(String XCG0095) {
		_XCG0095 = XCG0095;
	}

	public String getXCG0096() {
		return _XCG0096;
	}

	public void setXCG0096(String XCG0096) {
		_XCG0096 = XCG0096;
	}

	public String getXCG0097() {
		return _XCG0097;
	}

	public void setXCG0097(String XCG0097) {
		_XCG0097 = XCG0097;
	}

	public String getXCG1097() {
		return _XCG1097;
	}

	public void setXCG1097(String XCG1097) {
		_XCG1097 = XCG1097;
	}

	public String getXCG0098() {
		return _XCG0098;
	}

	public void setXCG0098(String XCG0098) {
		_XCG0098 = XCG0098;
	}

	public String getXCG0099() {
		return _XCG0099;
	}

	public void setXCG0099(String XCG0099) {
		_XCG0099 = XCG0099;
	}

	public String getXCG0100() {
		return _XCG0100;
	}

	public void setXCG0100(String XCG0100) {
		_XCG0100 = XCG0100;
	}

	public String getXCG0101() {
		return _XCG0101;
	}

	public void setXCG0101(String XCG0101) {
		_XCG0101 = XCG0101;
	}

	public String getXCG0102() {
		return _XCG0102;
	}

	public void setXCG0102(String XCG0102) {
		_XCG0102 = XCG0102;
	}

	public String getXCG0103() {
		return _XCG0103;
	}

	public void setXCG0103(String XCG0103) {
		_XCG0103 = XCG0103;
	}

	public String getXCG0104() {
		return _XCG0104;
	}

	public void setXCG0104(String XCG0104) {
		_XCG0104 = XCG0104;
	}

	public String getXCG0105() {
		return _XCG0105;
	}

	public void setXCG0105(String XCG0105) {
		_XCG0105 = XCG0105;
	}

	public String getXCG0106() {
		return _XCG0106;
	}

	public void setXCG0106(String XCG0106) {
		_XCG0106 = XCG0106;
	}

	public String getXCG0107() {
		return _XCG0107;
	}

	public void setXCG0107(String XCG0107) {
		_XCG0107 = XCG0107;
	}

	public String getXCG0108() {
		return _XCG0108;
	}

	public void setXCG0108(String XCG0108) {
		_XCG0108 = XCG0108;
	}

	public String getXCG0109() {
		return _XCG0109;
	}

	public void setXCG0109(String XCG0109) {
		_XCG0109 = XCG0109;
	}

	public String getXCG0110() {
		return _XCG0110;
	}

	public void setXCG0110(String XCG0110) {
		_XCG0110 = XCG0110;
	}

	public String getXCG0111() {
		return _XCG0111;
	}

	public void setXCG0111(String XCG0111) {
		_XCG0111 = XCG0111;
	}

	public String getXCG0112() {
		return _XCG0112;
	}

	public void setXCG0112(String XCG0112) {
		_XCG0112 = XCG0112;
	}

	public String getXCG0113() {
		return _XCG0113;
	}

	public void setXCG0113(String XCG0113) {
		_XCG0113 = XCG0113;
	}

	public String getXCG0114() {
		return _XCG0114;
	}

	public void setXCG0114(String XCG0114) {
		_XCG0114 = XCG0114;
	}

	public String getXCG0115() {
		return _XCG0115;
	}

	public void setXCG0115(String XCG0115) {
		_XCG0115 = XCG0115;
	}

	public String getXCG0116() {
		return _XCG0116;
	}

	public void setXCG0116(String XCG0116) {
		_XCG0116 = XCG0116;
	}

	public String getXCG0117() {
		return _XCG0117;
	}

	public void setXCG0117(String XCG0117) {
		_XCG0117 = XCG0117;
	}

	public String getXCG0118() {
		return _XCG0118;
	}

	public void setXCG0118(String XCG0118) {
		_XCG0118 = XCG0118;
	}

	public String getXCG0119() {
		return _XCG0119;
	}

	public void setXCG0119(String XCG0119) {
		_XCG0119 = XCG0119;
	}

	public String getXCG0120() {
		return _XCG0120;
	}

	public void setXCG0120(String XCG0120) {
		_XCG0120 = XCG0120;
	}

	public String getXCG0121() {
		return _XCG0121;
	}

	public void setXCG0121(String XCG0121) {
		_XCG0121 = XCG0121;
	}

	public String getXCG0122() {
		return _XCG0122;
	}

	public void setXCG0122(String XCG0122) {
		_XCG0122 = XCG0122;
	}

	public String getXCG0123() {
		return _XCG0123;
	}

	public void setXCG0123(String XCG0123) {
		_XCG0123 = XCG0123;
	}

	public String getXCG0124() {
		return _XCG0124;
	}

	public void setXCG0124(String XCG0124) {
		_XCG0124 = XCG0124;
	}

	public String getXCG0125() {
		return _XCG0125;
	}

	public void setXCG0125(String XCG0125) {
		_XCG0125 = XCG0125;
	}

	public String getXCG0126() {
		return _XCG0126;
	}

	public void setXCG0126(String XCG0126) {
		_XCG0126 = XCG0126;
	}

	public String getXCG0127() {
		return _XCG0127;
	}

	public void setXCG0127(String XCG0127) {
		_XCG0127 = XCG0127;
	}

	public String getXCG0128() {
		return _XCG0128;
	}

	public void setXCG0128(String XCG0128) {
		_XCG0128 = XCG0128;
	}

	public String getXCG0238() {
		return _XCG0238;
	}

	public void setXCG0238(String XCG0238) {
		_XCG0238 = XCG0238;
	}

	public String getXCG0239() {
		return _XCG0239;
	}

	public void setXCG0239(String XCG0239) {
		_XCG0239 = XCG0239;
	}

	public String getXCG0240() {
		return _XCG0240;
	}

	public void setXCG0240(String XCG0240) {
		_XCG0240 = XCG0240;
	}

	public String getXCG0241() {
		return _XCG0241;
	}

	public void setXCG0241(String XCG0241) {
		_XCG0241 = XCG0241;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XCG0009;
	private String _XCG0010;
	private String _XCG0011;
	private String _XCG0012;
	private String _XCG0013;
	private String _XCG0014;
	private String _XCG0015;
	private String _XCG0016;
	private String _XCG0017;
	private String _XCG0018;
	private String _XCG0019;
	private String _XCG0020;
	private String _XCG0021;
	private String _XCG1021;
	private String _XCG1121;
	private String _XCG0022;
	private String _XCG1022;
	private String _XCG1122;
	private String _XCG0023;
	private String _XCG1023;
	private String _XCG1123;
	private String _XCG0024;
	private String _XCG1024;
	private String _XCG1124;
	private String _XCG0025;
	private String _XCG1025;
	private String _XCG1125;
	private String _XCG0026;
	private String _XCG1026;
	private String _XCG1126;
	private String _XCG0027;
	private String _XCG1027;
	private String _XCG1127;
	private String _XCG0028;
	private String _XCG1028;
	private String _XCG1128;
	private String _XCG0029;
	private String _XCG1029;
	private String _XCG1129;
	private String _XCG0030;
	private String _XCG1030;
	private String _XCG1130;
	private String _XCG0031;
	private String _XCG1031;
	private String _XCG1131;
	private String _XCG0032;
	private String _XCG1032;
	private String _XCG1132;
	private String _XCG0033;
	private String _XCG1033;
	private String _XCG1133;
	private String _XCG0034;
	private String _XCG1034;
	private String _XCG1134;
	private String _XCG0035;
	private String _XCG1035;
	private String _XCG1135;
	private String _XCG0036;
	private String _XCG1036;
	private String _XCG1136;
	private String _XCG0037;
	private String _XCG1037;
	private String _XCG1137;
	private String _XCG0038;
	private String _XCG1038;
	private String _XCG1138;
	private String _XCG0039;
	private String _XCG1039;
	private String _XCG1139;
	private String _XCG0040;
	private String _XCG1040;
	private String _XCG1140;
	private String _XCG0041;
	private String _XCG1041;
	private String _XCG1141;
	private String _XCG0042;
	private String _XCG1042;
	private String _XCG1142;
	private String _XCG0043;
	private String _XCG1043;
	private String _XCG1143;
	private String _XCG0044;
	private String _XCG1044;
	private String _XCG1144;
	private String _XCG0045;
	private String _XCG0046;
	private String _XCG1047;
	private String _XCG0047;
	private String _XCG0048;
	private String _XCG0049;
	private String _XCG0050;
	private String _XCG0051;
	private String _XCG0052;
	private String _XCG0053;
	private String _XCG0054;
	private String _XCG1054;
	private String _XCG1154;
	private String _XCG1254;
	private String _XCG1354;
	private String _XCG1454;
	private String _XCG1554;
	private String _XCG1654;
	private String _XCG1754;
	private String _XCG0055;
	private String _XCG0056;
	private String _XCG0057;
	private String _XCG0058;
	private String _XCG0059;
	private String _XCG1059;
	private String _XCG0060;
	private String _XCG0061;
	private String _XCG0062;
	private String _XCG0063;
	private String _XCG0064;
	private String _XCG0065;
	private String _XCG0066;
	private String _XCG1066;
	private String _XCG0067;
	private String _XCG0068;
	private String _XCG0069;
	private String _XCG0070;
	private String _XCG0071;
	private String _XCG0072;
	private String _XCG1072;
	private String _XCG0073;
	private String _XCG0074;
	private String _XCG0075;
	private String _XCG0076;
	private String _XCG0077;
	private String _XCG1077;
	private String _XCG0078;
	private String _XCG1078;
	private String _XCG0079;
	private String _XCG0080;
	private String _XCG1080;
	private String _XCG0081;
	private String _XCG0082;
	private String _XCG0083;
	private String _XCG0084;
	private String _XCG0085;
	private String _XCG1085;
	private String _XCG0086;
	private String _XCG1086;
	private String _XCG0087;
	private String _XCG0088;
	private String _XCG1088;
	private String _XCG0089;
	private String _XCG0090;
	private String _XCG0091;
	private String _XCG0092;
	private String _XCG0093;
	private String _XCG0094;
	private String _XCG0095;
	private String _XCG0096;
	private String _XCG0097;
	private String _XCG1097;
	private String _XCG0098;
	private String _XCG0099;
	private String _XCG0100;
	private String _XCG0101;
	private String _XCG0102;
	private String _XCG0103;
	private String _XCG0104;
	private String _XCG0105;
	private String _XCG0106;
	private String _XCG0107;
	private String _XCG0108;
	private String _XCG0109;
	private String _XCG0110;
	private String _XCG0111;
	private String _XCG0112;
	private String _XCG0113;
	private String _XCG0114;
	private String _XCG0115;
	private String _XCG0116;
	private String _XCG0117;
	private String _XCG0118;
	private String _XCG0119;
	private String _XCG0120;
	private String _XCG0121;
	private String _XCG0122;
	private String _XCG0123;
	private String _XCG0124;
	private String _XCG0125;
	private String _XCG0126;
	private String _XCG0127;
	private String _XCG0128;
	private String _XCG0238;
	private String _XCG0239;
	private String _XCG0240;
	private String _XCG0241;
}