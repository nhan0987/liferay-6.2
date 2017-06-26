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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.common.service.http.TthcPhanNhomHoSoServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.http.TthcPhanNhomHoSoServiceSoap
 * @generated
 */
public class TthcPhanNhomHoSoSoap implements Serializable {
	public static TthcPhanNhomHoSoSoap toSoapModel(TthcPhanNhomHoSo model) {
		TthcPhanNhomHoSoSoap soapModel = new TthcPhanNhomHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setMaPhanNhom(model.getMaPhanNhom());
		soapModel.setTenPhanNhom(model.getTenPhanNhom());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setLoaiPhieuXuLy(model.getLoaiPhieuXuLy());
		soapModel.setSoThuTu(model.getSoThuTu());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static TthcPhanNhomHoSoSoap[] toSoapModels(TthcPhanNhomHoSo[] models) {
		TthcPhanNhomHoSoSoap[] soapModels = new TthcPhanNhomHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcPhanNhomHoSoSoap[][] toSoapModels(
		TthcPhanNhomHoSo[][] models) {
		TthcPhanNhomHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcPhanNhomHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcPhanNhomHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcPhanNhomHoSoSoap[] toSoapModels(
		List<TthcPhanNhomHoSo> models) {
		List<TthcPhanNhomHoSoSoap> soapModels = new ArrayList<TthcPhanNhomHoSoSoap>(models.size());

		for (TthcPhanNhomHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcPhanNhomHoSoSoap[soapModels.size()]);
	}

	public TthcPhanNhomHoSoSoap() {
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

	public String getMaPhanNhom() {
		return _MaPhanNhom;
	}

	public void setMaPhanNhom(String MaPhanNhom) {
		_MaPhanNhom = MaPhanNhom;
	}

	public String getTenPhanNhom() {
		return _TenPhanNhom;
	}

	public void setTenPhanNhom(String TenPhanNhom) {
		_TenPhanNhom = TenPhanNhom;
	}

	public String getTenTiengAnh() {
		return _TenTiengAnh;
	}

	public void setTenTiengAnh(String TenTiengAnh) {
		_TenTiengAnh = TenTiengAnh;
	}

	public int getLoaiPhieuXuLy() {
		return _loaiPhieuXuLy;
	}

	public void setLoaiPhieuXuLy(int loaiPhieuXuLy) {
		_loaiPhieuXuLy = loaiPhieuXuLy;
	}

	public int getSoThuTu() {
		return _SoThuTu;
	}

	public void setSoThuTu(int SoThuTu) {
		_SoThuTu = SoThuTu;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _Id;
	private String _MaPhanNhom;
	private String _TenPhanNhom;
	private String _TenTiengAnh;
	private int _loaiPhieuXuLy;
	private int _SoThuTu;
	private Date _synchdate;
}