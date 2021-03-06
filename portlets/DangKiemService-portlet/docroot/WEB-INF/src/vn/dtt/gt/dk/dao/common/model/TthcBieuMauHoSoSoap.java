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

package vn.dtt.gt.dk.dao.common.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.common.service.http.TthcBieuMauHoSoServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.http.TthcBieuMauHoSoServiceSoap
 * @generated
 */
public class TthcBieuMauHoSoSoap implements Serializable {
	public static TthcBieuMauHoSoSoap toSoapModel(TthcBieuMauHoSo model) {
		TthcBieuMauHoSoSoap soapModel = new TthcBieuMauHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setMaBieuMau(model.getMaBieuMau());
		soapModel.setTenBieuMau(model.getTenBieuMau());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setTaiLieuMau(model.getTaiLieuMau());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static TthcBieuMauHoSoSoap[] toSoapModels(TthcBieuMauHoSo[] models) {
		TthcBieuMauHoSoSoap[] soapModels = new TthcBieuMauHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcBieuMauHoSoSoap[][] toSoapModels(
		TthcBieuMauHoSo[][] models) {
		TthcBieuMauHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcBieuMauHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcBieuMauHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcBieuMauHoSoSoap[] toSoapModels(
		List<TthcBieuMauHoSo> models) {
		List<TthcBieuMauHoSoSoap> soapModels = new ArrayList<TthcBieuMauHoSoSoap>(models.size());

		for (TthcBieuMauHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcBieuMauHoSoSoap[soapModels.size()]);
	}

	public TthcBieuMauHoSoSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getMaBieuMau() {
		return _MaBieuMau;
	}

	public void setMaBieuMau(String MaBieuMau) {
		_MaBieuMau = MaBieuMau;
	}

	public String getTenBieuMau() {
		return _TenBieuMau;
	}

	public void setTenBieuMau(String TenBieuMau) {
		_TenBieuMau = TenBieuMau;
	}

	public String getTenTiengAnh() {
		return _TenTiengAnh;
	}

	public void setTenTiengAnh(String TenTiengAnh) {
		_TenTiengAnh = TenTiengAnh;
	}

	public long getTaiLieuMau() {
		return _TaiLieuMau;
	}

	public void setTaiLieuMau(long TaiLieuMau) {
		_TaiLieuMau = TaiLieuMau;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _Id;
	private String _MaBieuMau;
	private String _TenBieuMau;
	private String _TenTiengAnh;
	private long _TaiLieuMau;
	private Date _synchdate;
}