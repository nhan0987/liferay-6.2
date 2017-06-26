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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXECHUYENDUNGServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.THONGSOCHUNGCHIXECHUYENDUNGServiceSoap
 * @generated
 */
public class THONGSOCHUNGCHIXECHUYENDUNGSoap implements Serializable {
	public static THONGSOCHUNGCHIXECHUYENDUNGSoap toSoapModel(
		THONGSOCHUNGCHIXECHUYENDUNG model) {
		THONGSOCHUNGCHIXECHUYENDUNGSoap soapModel = new THONGSOCHUNGCHIXECHUYENDUNGSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSynchDate(model.getSynchDate());
		soapModel.setXCD0009(model.getXCD0009());
		soapModel.setXCD0010(model.getXCD0010());
		soapModel.setXCD0011(model.getXCD0011());
		soapModel.setXCD0012(model.getXCD0012());
		soapModel.setXCD0013(model.getXCD0013());
		soapModel.setXCD0014(model.getXCD0014());
		soapModel.setXCD0015(model.getXCD0015());
		soapModel.setXCD0016(model.getXCD0016());
		soapModel.setXCD0017(model.getXCD0017());
		soapModel.setXCD1017(model.getXCD1017());
		soapModel.setXCD0018(model.getXCD0018());
		soapModel.setXCD0019(model.getXCD0019());
		soapModel.setXCD0020(model.getXCD0020());
		soapModel.setXCD0021(model.getXCD0021());
		soapModel.setXCD0022(model.getXCD0022());
		soapModel.setXCD0023(model.getXCD0023());
		soapModel.setXCD1023(model.getXCD1023());
		soapModel.setXCD0024(model.getXCD0024());
		soapModel.setXCDCODE001(model.getXCDCODE001());
		soapModel.setXCDNAME001(model.getXCDNAME001());
		soapModel.setXCDVALU001(model.getXCDVALU001());
		soapModel.setXCDCODE002(model.getXCDCODE002());
		soapModel.setXCDNAME002(model.getXCDNAME002());
		soapModel.setXCDVALU002(model.getXCDVALU002());
		soapModel.setXCDCODE003(model.getXCDCODE003());
		soapModel.setXCDNAME003(model.getXCDNAME003());
		soapModel.setXCDVALU003(model.getXCDVALU003());
		soapModel.setXCDCODE004(model.getXCDCODE004());
		soapModel.setXCDNAME004(model.getXCDNAME004());
		soapModel.setXCDVALU004(model.getXCDVALU004());
		soapModel.setXCDCODE005(model.getXCDCODE005());
		soapModel.setXCDNAME005(model.getXCDNAME005());
		soapModel.setXCDVALU005(model.getXCDVALU005());
		soapModel.setXCDCODE006(model.getXCDCODE006());
		soapModel.setXCDNAME006(model.getXCDNAME006());
		soapModel.setXCDVALU006(model.getXCDVALU006());
		soapModel.setXCDCODE007(model.getXCDCODE007());
		soapModel.setXCDNAME007(model.getXCDNAME007());
		soapModel.setXCDVALU007(model.getXCDVALU007());
		soapModel.setXCDCODE008(model.getXCDCODE008());
		soapModel.setXCDNAME008(model.getXCDNAME008());
		soapModel.setXCDVALU008(model.getXCDVALU008());
		soapModel.setXCDCODE009(model.getXCDCODE009());
		soapModel.setXCDNAME009(model.getXCDNAME009());
		soapModel.setXCDVALU009(model.getXCDVALU009());
		soapModel.setXCDCODE010(model.getXCDCODE010());
		soapModel.setXCDNAME010(model.getXCDNAME010());
		soapModel.setXCDVALU010(model.getXCDVALU010());
		soapModel.setXCDCODE011(model.getXCDCODE011());
		soapModel.setXCDNAME011(model.getXCDNAME011());
		soapModel.setXCDVALU011(model.getXCDVALU011());
		soapModel.setXCDCODE012(model.getXCDCODE012());
		soapModel.setXCDNAME012(model.getXCDNAME012());
		soapModel.setXCDVALU012(model.getXCDVALU012());

		return soapModel;
	}

	public static THONGSOCHUNGCHIXECHUYENDUNGSoap[] toSoapModels(
		THONGSOCHUNGCHIXECHUYENDUNG[] models) {
		THONGSOCHUNGCHIXECHUYENDUNGSoap[] soapModels = new THONGSOCHUNGCHIXECHUYENDUNGSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXECHUYENDUNGSoap[][] toSoapModels(
		THONGSOCHUNGCHIXECHUYENDUNG[][] models) {
		THONGSOCHUNGCHIXECHUYENDUNGSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new THONGSOCHUNGCHIXECHUYENDUNGSoap[models.length][models[0].length];
		}
		else {
			soapModels = new THONGSOCHUNGCHIXECHUYENDUNGSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static THONGSOCHUNGCHIXECHUYENDUNGSoap[] toSoapModels(
		List<THONGSOCHUNGCHIXECHUYENDUNG> models) {
		List<THONGSOCHUNGCHIXECHUYENDUNGSoap> soapModels = new ArrayList<THONGSOCHUNGCHIXECHUYENDUNGSoap>(models.size());

		for (THONGSOCHUNGCHIXECHUYENDUNG model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new THONGSOCHUNGCHIXECHUYENDUNGSoap[soapModels.size()]);
	}

	public THONGSOCHUNGCHIXECHUYENDUNGSoap() {
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

	public String getXCD0009() {
		return _XCD0009;
	}

	public void setXCD0009(String XCD0009) {
		_XCD0009 = XCD0009;
	}

	public String getXCD0010() {
		return _XCD0010;
	}

	public void setXCD0010(String XCD0010) {
		_XCD0010 = XCD0010;
	}

	public String getXCD0011() {
		return _XCD0011;
	}

	public void setXCD0011(String XCD0011) {
		_XCD0011 = XCD0011;
	}

	public String getXCD0012() {
		return _XCD0012;
	}

	public void setXCD0012(String XCD0012) {
		_XCD0012 = XCD0012;
	}

	public String getXCD0013() {
		return _XCD0013;
	}

	public void setXCD0013(String XCD0013) {
		_XCD0013 = XCD0013;
	}

	public String getXCD0014() {
		return _XCD0014;
	}

	public void setXCD0014(String XCD0014) {
		_XCD0014 = XCD0014;
	}

	public String getXCD0015() {
		return _XCD0015;
	}

	public void setXCD0015(String XCD0015) {
		_XCD0015 = XCD0015;
	}

	public String getXCD0016() {
		return _XCD0016;
	}

	public void setXCD0016(String XCD0016) {
		_XCD0016 = XCD0016;
	}

	public String getXCD0017() {
		return _XCD0017;
	}

	public void setXCD0017(String XCD0017) {
		_XCD0017 = XCD0017;
	}

	public String getXCD1017() {
		return _XCD1017;
	}

	public void setXCD1017(String XCD1017) {
		_XCD1017 = XCD1017;
	}

	public String getXCD0018() {
		return _XCD0018;
	}

	public void setXCD0018(String XCD0018) {
		_XCD0018 = XCD0018;
	}

	public String getXCD0019() {
		return _XCD0019;
	}

	public void setXCD0019(String XCD0019) {
		_XCD0019 = XCD0019;
	}

	public String getXCD0020() {
		return _XCD0020;
	}

	public void setXCD0020(String XCD0020) {
		_XCD0020 = XCD0020;
	}

	public String getXCD0021() {
		return _XCD0021;
	}

	public void setXCD0021(String XCD0021) {
		_XCD0021 = XCD0021;
	}

	public String getXCD0022() {
		return _XCD0022;
	}

	public void setXCD0022(String XCD0022) {
		_XCD0022 = XCD0022;
	}

	public String getXCD0023() {
		return _XCD0023;
	}

	public void setXCD0023(String XCD0023) {
		_XCD0023 = XCD0023;
	}

	public String getXCD1023() {
		return _XCD1023;
	}

	public void setXCD1023(String XCD1023) {
		_XCD1023 = XCD1023;
	}

	public String getXCD0024() {
		return _XCD0024;
	}

	public void setXCD0024(String XCD0024) {
		_XCD0024 = XCD0024;
	}

	public String getXCDCODE001() {
		return _XCDCODE001;
	}

	public void setXCDCODE001(String XCDCODE001) {
		_XCDCODE001 = XCDCODE001;
	}

	public String getXCDNAME001() {
		return _XCDNAME001;
	}

	public void setXCDNAME001(String XCDNAME001) {
		_XCDNAME001 = XCDNAME001;
	}

	public String getXCDVALU001() {
		return _XCDVALU001;
	}

	public void setXCDVALU001(String XCDVALU001) {
		_XCDVALU001 = XCDVALU001;
	}

	public String getXCDCODE002() {
		return _XCDCODE002;
	}

	public void setXCDCODE002(String XCDCODE002) {
		_XCDCODE002 = XCDCODE002;
	}

	public String getXCDNAME002() {
		return _XCDNAME002;
	}

	public void setXCDNAME002(String XCDNAME002) {
		_XCDNAME002 = XCDNAME002;
	}

	public String getXCDVALU002() {
		return _XCDVALU002;
	}

	public void setXCDVALU002(String XCDVALU002) {
		_XCDVALU002 = XCDVALU002;
	}

	public String getXCDCODE003() {
		return _XCDCODE003;
	}

	public void setXCDCODE003(String XCDCODE003) {
		_XCDCODE003 = XCDCODE003;
	}

	public String getXCDNAME003() {
		return _XCDNAME003;
	}

	public void setXCDNAME003(String XCDNAME003) {
		_XCDNAME003 = XCDNAME003;
	}

	public String getXCDVALU003() {
		return _XCDVALU003;
	}

	public void setXCDVALU003(String XCDVALU003) {
		_XCDVALU003 = XCDVALU003;
	}

	public String getXCDCODE004() {
		return _XCDCODE004;
	}

	public void setXCDCODE004(String XCDCODE004) {
		_XCDCODE004 = XCDCODE004;
	}

	public String getXCDNAME004() {
		return _XCDNAME004;
	}

	public void setXCDNAME004(String XCDNAME004) {
		_XCDNAME004 = XCDNAME004;
	}

	public String getXCDVALU004() {
		return _XCDVALU004;
	}

	public void setXCDVALU004(String XCDVALU004) {
		_XCDVALU004 = XCDVALU004;
	}

	public String getXCDCODE005() {
		return _XCDCODE005;
	}

	public void setXCDCODE005(String XCDCODE005) {
		_XCDCODE005 = XCDCODE005;
	}

	public String getXCDNAME005() {
		return _XCDNAME005;
	}

	public void setXCDNAME005(String XCDNAME005) {
		_XCDNAME005 = XCDNAME005;
	}

	public String getXCDVALU005() {
		return _XCDVALU005;
	}

	public void setXCDVALU005(String XCDVALU005) {
		_XCDVALU005 = XCDVALU005;
	}

	public String getXCDCODE006() {
		return _XCDCODE006;
	}

	public void setXCDCODE006(String XCDCODE006) {
		_XCDCODE006 = XCDCODE006;
	}

	public String getXCDNAME006() {
		return _XCDNAME006;
	}

	public void setXCDNAME006(String XCDNAME006) {
		_XCDNAME006 = XCDNAME006;
	}

	public String getXCDVALU006() {
		return _XCDVALU006;
	}

	public void setXCDVALU006(String XCDVALU006) {
		_XCDVALU006 = XCDVALU006;
	}

	public String getXCDCODE007() {
		return _XCDCODE007;
	}

	public void setXCDCODE007(String XCDCODE007) {
		_XCDCODE007 = XCDCODE007;
	}

	public String getXCDNAME007() {
		return _XCDNAME007;
	}

	public void setXCDNAME007(String XCDNAME007) {
		_XCDNAME007 = XCDNAME007;
	}

	public String getXCDVALU007() {
		return _XCDVALU007;
	}

	public void setXCDVALU007(String XCDVALU007) {
		_XCDVALU007 = XCDVALU007;
	}

	public String getXCDCODE008() {
		return _XCDCODE008;
	}

	public void setXCDCODE008(String XCDCODE008) {
		_XCDCODE008 = XCDCODE008;
	}

	public String getXCDNAME008() {
		return _XCDNAME008;
	}

	public void setXCDNAME008(String XCDNAME008) {
		_XCDNAME008 = XCDNAME008;
	}

	public String getXCDVALU008() {
		return _XCDVALU008;
	}

	public void setXCDVALU008(String XCDVALU008) {
		_XCDVALU008 = XCDVALU008;
	}

	public String getXCDCODE009() {
		return _XCDCODE009;
	}

	public void setXCDCODE009(String XCDCODE009) {
		_XCDCODE009 = XCDCODE009;
	}

	public String getXCDNAME009() {
		return _XCDNAME009;
	}

	public void setXCDNAME009(String XCDNAME009) {
		_XCDNAME009 = XCDNAME009;
	}

	public String getXCDVALU009() {
		return _XCDVALU009;
	}

	public void setXCDVALU009(String XCDVALU009) {
		_XCDVALU009 = XCDVALU009;
	}

	public String getXCDCODE010() {
		return _XCDCODE010;
	}

	public void setXCDCODE010(String XCDCODE010) {
		_XCDCODE010 = XCDCODE010;
	}

	public String getXCDNAME010() {
		return _XCDNAME010;
	}

	public void setXCDNAME010(String XCDNAME010) {
		_XCDNAME010 = XCDNAME010;
	}

	public String getXCDVALU010() {
		return _XCDVALU010;
	}

	public void setXCDVALU010(String XCDVALU010) {
		_XCDVALU010 = XCDVALU010;
	}

	public String getXCDCODE011() {
		return _XCDCODE011;
	}

	public void setXCDCODE011(String XCDCODE011) {
		_XCDCODE011 = XCDCODE011;
	}

	public String getXCDNAME011() {
		return _XCDNAME011;
	}

	public void setXCDNAME011(String XCDNAME011) {
		_XCDNAME011 = XCDNAME011;
	}

	public String getXCDVALU011() {
		return _XCDVALU011;
	}

	public void setXCDVALU011(String XCDVALU011) {
		_XCDVALU011 = XCDVALU011;
	}

	public String getXCDCODE012() {
		return _XCDCODE012;
	}

	public void setXCDCODE012(String XCDCODE012) {
		_XCDCODE012 = XCDCODE012;
	}

	public String getXCDNAME012() {
		return _XCDNAME012;
	}

	public void setXCDNAME012(String XCDNAME012) {
		_XCDNAME012 = XCDNAME012;
	}

	public String getXCDVALU012() {
		return _XCDVALU012;
	}

	public void setXCDVALU012(String XCDVALU012) {
		_XCDVALU012 = XCDVALU012;
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XCD0009;
	private String _XCD0010;
	private String _XCD0011;
	private String _XCD0012;
	private String _XCD0013;
	private String _XCD0014;
	private String _XCD0015;
	private String _XCD0016;
	private String _XCD0017;
	private String _XCD1017;
	private String _XCD0018;
	private String _XCD0019;
	private String _XCD0020;
	private String _XCD0021;
	private String _XCD0022;
	private String _XCD0023;
	private String _XCD1023;
	private String _XCD0024;
	private String _XCDCODE001;
	private String _XCDNAME001;
	private String _XCDVALU001;
	private String _XCDCODE002;
	private String _XCDNAME002;
	private String _XCDVALU002;
	private String _XCDCODE003;
	private String _XCDNAME003;
	private String _XCDVALU003;
	private String _XCDCODE004;
	private String _XCDNAME004;
	private String _XCDVALU004;
	private String _XCDCODE005;
	private String _XCDNAME005;
	private String _XCDVALU005;
	private String _XCDCODE006;
	private String _XCDNAME006;
	private String _XCDVALU006;
	private String _XCDCODE007;
	private String _XCDNAME007;
	private String _XCDVALU007;
	private String _XCDCODE008;
	private String _XCDNAME008;
	private String _XCDVALU008;
	private String _XCDCODE009;
	private String _XCDNAME009;
	private String _XCDVALU009;
	private String _XCDCODE010;
	private String _XCDNAME010;
	private String _XCDVALU010;
	private String _XCDCODE011;
	private String _XCDNAME011;
	private String _XCDVALU011;
	private String _XCDCODE012;
	private String _XCDNAME012;
	private String _XCDVALU012;
}