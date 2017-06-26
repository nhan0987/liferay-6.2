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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXEDAPDIENServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXEDAPDIENServiceSoap
 * @generated
 */
public class THONGSOCHUNGCHIXEDAPDIENSoap implements Serializable {
	public static THONGSOCHUNGCHIXEDAPDIENSoap toSoapModel(
		THONGSOCHUNGCHIXEDAPDIEN model) {
		THONGSOCHUNGCHIXEDAPDIENSoap soapModel = new THONGSOCHUNGCHIXEDAPDIENSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSynchDate(model.getSynchDate());
		soapModel.setXDD0008(model.getXDD0008());
		soapModel.setXDD0009(model.getXDD0009());
		soapModel.setXDD0010(model.getXDD0010());
		soapModel.setXDD0011(model.getXDD0011());
		soapModel.setXDD0012(model.getXDD0012());
		soapModel.setXDD0013(model.getXDD0013());
		soapModel.setXDD0014(model.getXDD0014());
		soapModel.setXDD0015(model.getXDD0015());
		soapModel.setXDD0016(model.getXDD0016());
		soapModel.setXDD0017(model.getXDD0017());
		soapModel.setXDD0018(model.getXDD0018());
		soapModel.setXDD0019(model.getXDD0019());
		soapModel.setXDD0020(model.getXDD0020());
		soapModel.setXDD0021(model.getXDD0021());
		soapModel.setXDD0022(model.getXDD0022());
		soapModel.setXDD0023(model.getXDD0023());
		soapModel.setXDD0024(model.getXDD0024());
		soapModel.setXDD0025(model.getXDD0025());
		soapModel.setXDD0026(model.getXDD0026());
		soapModel.setXDD0027(model.getXDD0027());
		soapModel.setXDD1027(model.getXDD1027());
		soapModel.setXDD0028(model.getXDD0028());
		soapModel.setXDD1028(model.getXDD1028());
		soapModel.setXDD1128(model.getXDD1128());
		soapModel.setXDD0029(model.getXDD0029());
		soapModel.setXDD1029(model.getXDD1029());
		soapModel.setXDD1129(model.getXDD1129());
		soapModel.setXDD0030(model.getXDD0030());
		soapModel.setXDD0031(model.getXDD0031());
		soapModel.setXDD0032(model.getXDD0032());
		soapModel.setXDD0033(model.getXDD0033());
		soapModel.setXDD0034(model.getXDD0034());
		soapModel.setXDD1034(model.getXDD1034());
		soapModel.setXDD0035(model.getXDD0035());
		soapModel.setXDD1035(model.getXDD1035());
		soapModel.setXDD0036(model.getXDD0036());
		soapModel.setXDD0037(model.getXDD0037());
		soapModel.setXDD0038(model.getXDD0038());

		return soapModel;
	}

	public static THONGSOCHUNGCHIXEDAPDIENSoap[] toSoapModels(
		THONGSOCHUNGCHIXEDAPDIEN[] models) {
		THONGSOCHUNGCHIXEDAPDIENSoap[] soapModels = new THONGSOCHUNGCHIXEDAPDIENSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXEDAPDIENSoap[][] toSoapModels(
		THONGSOCHUNGCHIXEDAPDIEN[][] models) {
		THONGSOCHUNGCHIXEDAPDIENSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGSOCHUNGCHIXEDAPDIENSoap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGSOCHUNGCHIXEDAPDIENSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXEDAPDIENSoap[] toSoapModels(
		List<THONGSOCHUNGCHIXEDAPDIEN> models) {
		List<THONGSOCHUNGCHIXEDAPDIENSoap> soapModels = new ArrayList<THONGSOCHUNGCHIXEDAPDIENSoap>(models.size());

		for (THONGSOCHUNGCHIXEDAPDIEN model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGSOCHUNGCHIXEDAPDIENSoap[soapModels.size()]);
	}

	public THONGSOCHUNGCHIXEDAPDIENSoap() {
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

	public String getXDD0008() {
		return _XDD0008;
	}

	public void setXDD0008(String XDD0008) {
		_XDD0008 = XDD0008;
	}

	public String getXDD0009() {
		return _XDD0009;
	}

	public void setXDD0009(String XDD0009) {
		_XDD0009 = XDD0009;
	}

	public String getXDD0010() {
		return _XDD0010;
	}

	public void setXDD0010(String XDD0010) {
		_XDD0010 = XDD0010;
	}

	public String getXDD0011() {
		return _XDD0011;
	}

	public void setXDD0011(String XDD0011) {
		_XDD0011 = XDD0011;
	}

	public String getXDD0012() {
		return _XDD0012;
	}

	public void setXDD0012(String XDD0012) {
		_XDD0012 = XDD0012;
	}

	public String getXDD0013() {
		return _XDD0013;
	}

	public void setXDD0013(String XDD0013) {
		_XDD0013 = XDD0013;
	}

	public String getXDD0014() {
		return _XDD0014;
	}

	public void setXDD0014(String XDD0014) {
		_XDD0014 = XDD0014;
	}

	public String getXDD0015() {
		return _XDD0015;
	}

	public void setXDD0015(String XDD0015) {
		_XDD0015 = XDD0015;
	}

	public String getXDD0016() {
		return _XDD0016;
	}

	public void setXDD0016(String XDD0016) {
		_XDD0016 = XDD0016;
	}

	public String getXDD0017() {
		return _XDD0017;
	}

	public void setXDD0017(String XDD0017) {
		_XDD0017 = XDD0017;
	}

	public String getXDD0018() {
		return _XDD0018;
	}

	public void setXDD0018(String XDD0018) {
		_XDD0018 = XDD0018;
	}

	public String getXDD0019() {
		return _XDD0019;
	}

	public void setXDD0019(String XDD0019) {
		_XDD0019 = XDD0019;
	}

	public String getXDD0020() {
		return _XDD0020;
	}

	public void setXDD0020(String XDD0020) {
		_XDD0020 = XDD0020;
	}

	public String getXDD0021() {
		return _XDD0021;
	}

	public void setXDD0021(String XDD0021) {
		_XDD0021 = XDD0021;
	}

	public String getXDD0022() {
		return _XDD0022;
	}

	public void setXDD0022(String XDD0022) {
		_XDD0022 = XDD0022;
	}

	public String getXDD0023() {
		return _XDD0023;
	}

	public void setXDD0023(String XDD0023) {
		_XDD0023 = XDD0023;
	}

	public String getXDD0024() {
		return _XDD0024;
	}

	public void setXDD0024(String XDD0024) {
		_XDD0024 = XDD0024;
	}

	public String getXDD0025() {
		return _XDD0025;
	}

	public void setXDD0025(String XDD0025) {
		_XDD0025 = XDD0025;
	}

	public String getXDD0026() {
		return _XDD0026;
	}

	public void setXDD0026(String XDD0026) {
		_XDD0026 = XDD0026;
	}

	public String getXDD0027() {
		return _XDD0027;
	}

	public void setXDD0027(String XDD0027) {
		_XDD0027 = XDD0027;
	}

	public String getXDD1027() {
		return _XDD1027;
	}

	public void setXDD1027(String XDD1027) {
		_XDD1027 = XDD1027;
	}

	public String getXDD0028() {
		return _XDD0028;
	}

	public void setXDD0028(String XDD0028) {
		_XDD0028 = XDD0028;
	}

	public String getXDD1028() {
		return _XDD1028;
	}

	public void setXDD1028(String XDD1028) {
		_XDD1028 = XDD1028;
	}

	public String getXDD1128() {
		return _XDD1128;
	}

	public void setXDD1128(String XDD1128) {
		_XDD1128 = XDD1128;
	}

	public String getXDD0029() {
		return _XDD0029;
	}

	public void setXDD0029(String XDD0029) {
		_XDD0029 = XDD0029;
	}

	public String getXDD1029() {
		return _XDD1029;
	}

	public void setXDD1029(String XDD1029) {
		_XDD1029 = XDD1029;
	}

	public String getXDD1129() {
		return _XDD1129;
	}

	public void setXDD1129(String XDD1129) {
		_XDD1129 = XDD1129;
	}

	public String getXDD0030() {
		return _XDD0030;
	}

	public void setXDD0030(String XDD0030) {
		_XDD0030 = XDD0030;
	}

	public String getXDD0031() {
		return _XDD0031;
	}

	public void setXDD0031(String XDD0031) {
		_XDD0031 = XDD0031;
	}

	public String getXDD0032() {
		return _XDD0032;
	}

	public void setXDD0032(String XDD0032) {
		_XDD0032 = XDD0032;
	}

	public String getXDD0033() {
		return _XDD0033;
	}

	public void setXDD0033(String XDD0033) {
		_XDD0033 = XDD0033;
	}

	public String getXDD0034() {
		return _XDD0034;
	}

	public void setXDD0034(String XDD0034) {
		_XDD0034 = XDD0034;
	}

	public String getXDD1034() {
		return _XDD1034;
	}

	public void setXDD1034(String XDD1034) {
		_XDD1034 = XDD1034;
	}

	public String getXDD0035() {
		return _XDD0035;
	}

	public void setXDD0035(String XDD0035) {
		_XDD0035 = XDD0035;
	}

	public String getXDD1035() {
		return _XDD1035;
	}

	public void setXDD1035(String XDD1035) {
		_XDD1035 = XDD1035;
	}

	public String getXDD0036() {
		return _XDD0036;
	}

	public void setXDD0036(String XDD0036) {
		_XDD0036 = XDD0036;
	}

	public String getXDD0037() {
		return _XDD0037;
	}

	public void setXDD0037(String XDD0037) {
		_XDD0037 = XDD0037;
	}

	public String getXDD0038() {
		return _XDD0038;
	}

	public void setXDD0038(String XDD0038) {
		_XDD0038 = XDD0038;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XDD0008;
	private String _XDD0009;
	private String _XDD0010;
	private String _XDD0011;
	private String _XDD0012;
	private String _XDD0013;
	private String _XDD0014;
	private String _XDD0015;
	private String _XDD0016;
	private String _XDD0017;
	private String _XDD0018;
	private String _XDD0019;
	private String _XDD0020;
	private String _XDD0021;
	private String _XDD0022;
	private String _XDD0023;
	private String _XDD0024;
	private String _XDD0025;
	private String _XDD0026;
	private String _XDD0027;
	private String _XDD1027;
	private String _XDD0028;
	private String _XDD1028;
	private String _XDD1128;
	private String _XDD0029;
	private String _XDD1029;
	private String _XDD1129;
	private String _XDD0030;
	private String _XDD0031;
	private String _XDD0032;
	private String _XDD0033;
	private String _XDD0034;
	private String _XDD1034;
	private String _XDD0035;
	private String _XDD1035;
	private String _XDD0036;
	private String _XDD0037;
	private String _XDD0038;
}