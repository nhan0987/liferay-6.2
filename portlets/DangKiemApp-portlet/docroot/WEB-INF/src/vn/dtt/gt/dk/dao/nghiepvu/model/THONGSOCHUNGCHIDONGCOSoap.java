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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIDONGCOServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIDONGCOServiceSoap
 * @generated
 */
public class THONGSOCHUNGCHIDONGCOSoap implements Serializable {
	public static THONGSOCHUNGCHIDONGCOSoap toSoapModel(
		THONGSOCHUNGCHIDONGCO model) {
		THONGSOCHUNGCHIDONGCOSoap soapModel = new THONGSOCHUNGCHIDONGCOSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSynchDate(model.getSynchDate());
		soapModel.setDCX0007(model.getDCX0007());
		soapModel.setDCX0008(model.getDCX0008());
		soapModel.setDCX0010(model.getDCX0010());
		soapModel.setDCX0011(model.getDCX0011());
		soapModel.setDCX0012(model.getDCX0012());
		soapModel.setDCX1012(model.getDCX1012());
		soapModel.setDCX0013(model.getDCX0013());
		soapModel.setDCX1013(model.getDCX1013());
		soapModel.setDCX0014(model.getDCX0014());
		soapModel.setDCX0015(model.getDCX0015());
		soapModel.setDCX0016(model.getDCX0016());
		soapModel.setDCX0017(model.getDCX0017());
		soapModel.setDCX0018(model.getDCX0018());
		soapModel.setDCX0019(model.getDCX0019());
		soapModel.setDCX0021(model.getDCX0021());
		soapModel.setDCX0022(model.getDCX0022());
		soapModel.setDCX0023(model.getDCX0023());
		soapModel.setDCX0024(model.getDCX0024());
		soapModel.setDCX0006(model.getDCX0006());
		soapModel.setDCX0025(model.getDCX0025());
		soapModel.setDCX0026(model.getDCX0026());
		soapModel.setDCX0027(model.getDCX0027());
		soapModel.setDCX0028(model.getDCX0028());
		soapModel.setDCX0029(model.getDCX0029());
		soapModel.setDCX0030(model.getDCX0030());
		soapModel.setDCX0031(model.getDCX0031());

		return soapModel;
	}

	public static THONGSOCHUNGCHIDONGCOSoap[] toSoapModels(
		THONGSOCHUNGCHIDONGCO[] models) {
		THONGSOCHUNGCHIDONGCOSoap[] soapModels = new THONGSOCHUNGCHIDONGCOSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIDONGCOSoap[][] toSoapModels(
		THONGSOCHUNGCHIDONGCO[][] models) {
		THONGSOCHUNGCHIDONGCOSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGSOCHUNGCHIDONGCOSoap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGSOCHUNGCHIDONGCOSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIDONGCOSoap[] toSoapModels(
		List<THONGSOCHUNGCHIDONGCO> models) {
		List<THONGSOCHUNGCHIDONGCOSoap> soapModels = new ArrayList<THONGSOCHUNGCHIDONGCOSoap>(models.size());

		for (THONGSOCHUNGCHIDONGCO model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGSOCHUNGCHIDONGCOSoap[soapModels.size()]);
	}

	public THONGSOCHUNGCHIDONGCOSoap() {
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

	public String getDCX0007() {
		return _DCX0007;
	}

	public void setDCX0007(String DCX0007) {
		_DCX0007 = DCX0007;
	}

	public String getDCX0008() {
		return _DCX0008;
	}

	public void setDCX0008(String DCX0008) {
		_DCX0008 = DCX0008;
	}

	public String getDCX0010() {
		return _DCX0010;
	}

	public void setDCX0010(String DCX0010) {
		_DCX0010 = DCX0010;
	}

	public String getDCX0011() {
		return _DCX0011;
	}

	public void setDCX0011(String DCX0011) {
		_DCX0011 = DCX0011;
	}

	public String getDCX0012() {
		return _DCX0012;
	}

	public void setDCX0012(String DCX0012) {
		_DCX0012 = DCX0012;
	}

	public String getDCX1012() {
		return _DCX1012;
	}

	public void setDCX1012(String DCX1012) {
		_DCX1012 = DCX1012;
	}

	public String getDCX0013() {
		return _DCX0013;
	}

	public void setDCX0013(String DCX0013) {
		_DCX0013 = DCX0013;
	}

	public String getDCX1013() {
		return _DCX1013;
	}

	public void setDCX1013(String DCX1013) {
		_DCX1013 = DCX1013;
	}

	public String getDCX0014() {
		return _DCX0014;
	}

	public void setDCX0014(String DCX0014) {
		_DCX0014 = DCX0014;
	}

	public String getDCX0015() {
		return _DCX0015;
	}

	public void setDCX0015(String DCX0015) {
		_DCX0015 = DCX0015;
	}

	public String getDCX0016() {
		return _DCX0016;
	}

	public void setDCX0016(String DCX0016) {
		_DCX0016 = DCX0016;
	}

	public String getDCX0017() {
		return _DCX0017;
	}

	public void setDCX0017(String DCX0017) {
		_DCX0017 = DCX0017;
	}

	public String getDCX0018() {
		return _DCX0018;
	}

	public void setDCX0018(String DCX0018) {
		_DCX0018 = DCX0018;
	}

	public String getDCX0019() {
		return _DCX0019;
	}

	public void setDCX0019(String DCX0019) {
		_DCX0019 = DCX0019;
	}

	public String getDCX0021() {
		return _DCX0021;
	}

	public void setDCX0021(String DCX0021) {
		_DCX0021 = DCX0021;
	}

	public String getDCX0022() {
		return _DCX0022;
	}

	public void setDCX0022(String DCX0022) {
		_DCX0022 = DCX0022;
	}

	public String getDCX0023() {
		return _DCX0023;
	}

	public void setDCX0023(String DCX0023) {
		_DCX0023 = DCX0023;
	}

	public String getDCX0024() {
		return _DCX0024;
	}

	public void setDCX0024(String DCX0024) {
		_DCX0024 = DCX0024;
	}

	public String getDCX0006() {
		return _DCX0006;
	}

	public void setDCX0006(String DCX0006) {
		_DCX0006 = DCX0006;
	}

	public String getDCX0025() {
		return _DCX0025;
	}

	public void setDCX0025(String DCX0025) {
		_DCX0025 = DCX0025;
	}

	public String getDCX0026() {
		return _DCX0026;
	}

	public void setDCX0026(String DCX0026) {
		_DCX0026 = DCX0026;
	}

	public String getDCX0027() {
		return _DCX0027;
	}

	public void setDCX0027(String DCX0027) {
		_DCX0027 = DCX0027;
	}

	public String getDCX0028() {
		return _DCX0028;
	}

	public void setDCX0028(String DCX0028) {
		_DCX0028 = DCX0028;
	}

	public String getDCX0029() {
		return _DCX0029;
	}

	public void setDCX0029(String DCX0029) {
		_DCX0029 = DCX0029;
	}

	public String getDCX0030() {
		return _DCX0030;
	}

	public void setDCX0030(String DCX0030) {
		_DCX0030 = DCX0030;
	}

	public String getDCX0031() {
		return _DCX0031;
	}

	public void setDCX0031(String DCX0031) {
		_DCX0031 = DCX0031;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _DCX0007;
	private String _DCX0008;
	private String _DCX0010;
	private String _DCX0011;
	private String _DCX0012;
	private String _DCX1012;
	private String _DCX0013;
	private String _DCX1013;
	private String _DCX0014;
	private String _DCX0015;
	private String _DCX0016;
	private String _DCX0017;
	private String _DCX0018;
	private String _DCX0019;
	private String _DCX0021;
	private String _DCX0022;
	private String _DCX0023;
	private String _DCX0024;
	private String _DCX0006;
	private String _DCX0025;
	private String _DCX0026;
	private String _DCX0027;
	private String _DCX0028;
	private String _DCX0029;
	private String _DCX0030;
	private String _DCX0031;
}