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

package vn.dtt.gt.dk.dao.motcua.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.motcua.service.http.MotCuaDongBoMTgatewayServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.http.MotCuaDongBoMTgatewayServiceSoap
 * @generated
 */
public class MotCuaDongBoMTgatewaySoap implements Serializable {
	public static MotCuaDongBoMTgatewaySoap toSoapModel(
		MotCuaDongBoMTgateway model) {
		MotCuaDongBoMTgatewaySoap soapModel = new MotCuaDongBoMTgatewaySoap();

		soapModel.setId(model.getId());
		soapModel.setDienBienHoSoId(model.getDienBienHoSoId());
		soapModel.setPhieuXuLyChinhId(model.getPhieuXuLyChinhId());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static MotCuaDongBoMTgatewaySoap[] toSoapModels(
		MotCuaDongBoMTgateway[] models) {
		MotCuaDongBoMTgatewaySoap[] soapModels = new MotCuaDongBoMTgatewaySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaDongBoMTgatewaySoap[][] toSoapModels(
		MotCuaDongBoMTgateway[][] models) {
		MotCuaDongBoMTgatewaySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaDongBoMTgatewaySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaDongBoMTgatewaySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaDongBoMTgatewaySoap[] toSoapModels(
		List<MotCuaDongBoMTgateway> models) {
		List<MotCuaDongBoMTgatewaySoap> soapModels = new ArrayList<MotCuaDongBoMTgatewaySoap>(models.size());

		for (MotCuaDongBoMTgateway model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaDongBoMTgatewaySoap[soapModels.size()]);
	}

	public MotCuaDongBoMTgatewaySoap() {
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

	public long getDienBienHoSoId() {
		return _dienBienHoSoId;
	}

	public void setDienBienHoSoId(long dienBienHoSoId) {
		_dienBienHoSoId = dienBienHoSoId;
	}

	public long getPhieuXuLyChinhId() {
		return _phieuXuLyChinhId;
	}

	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phieuXuLyChinhId = phieuXuLyChinhId;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public String getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	private long _id;
	private long _dienBienHoSoId;
	private long _phieuXuLyChinhId;
	private Date _modifyDate;
	private String _trangThai;
}