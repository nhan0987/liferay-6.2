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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.motcua.service.http.MotCuaTrangThaiHoSoServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.http.MotCuaTrangThaiHoSoServiceSoap
 * @generated
 */
public class MotCuaTrangThaiHoSoSoap implements Serializable {
	public static MotCuaTrangThaiHoSoSoap toSoapModel(MotCuaTrangThaiHoSo model) {
		MotCuaTrangThaiHoSoSoap soapModel = new MotCuaTrangThaiHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setQuyTrinhThuTucId(model.getQuyTrinhThuTucId());
		soapModel.setTenTrangThai(model.getTenTrangThai());
		soapModel.setKieuTrangThai(model.getKieuTrangThai());
		soapModel.setMoTaTrangThai(model.getMoTaTrangThai());
		soapModel.setVaiTroXuLy1(model.getVaiTroXuLy1());
		soapModel.setVaiTroXuLy2(model.getVaiTroXuLy2());
		soapModel.setVaiTroXuLy3(model.getVaiTroXuLy3());
		soapModel.setFormXuLy(model.getFormXuLy());

		return soapModel;
	}

	public static MotCuaTrangThaiHoSoSoap[] toSoapModels(
		MotCuaTrangThaiHoSo[] models) {
		MotCuaTrangThaiHoSoSoap[] soapModels = new MotCuaTrangThaiHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaTrangThaiHoSoSoap[][] toSoapModels(
		MotCuaTrangThaiHoSo[][] models) {
		MotCuaTrangThaiHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaTrangThaiHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaTrangThaiHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaTrangThaiHoSoSoap[] toSoapModels(
		List<MotCuaTrangThaiHoSo> models) {
		List<MotCuaTrangThaiHoSoSoap> soapModels = new ArrayList<MotCuaTrangThaiHoSoSoap>(models.size());

		for (MotCuaTrangThaiHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaTrangThaiHoSoSoap[soapModels.size()]);
	}

	public MotCuaTrangThaiHoSoSoap() {
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

	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;
	}

	public String getTenTrangThai() {
		return _tenTrangThai;
	}

	public void setTenTrangThai(String tenTrangThai) {
		_tenTrangThai = tenTrangThai;
	}

	public long getKieuTrangThai() {
		return _kieuTrangThai;
	}

	public void setKieuTrangThai(long kieuTrangThai) {
		_kieuTrangThai = kieuTrangThai;
	}

	public String getMoTaTrangThai() {
		return _moTaTrangThai;
	}

	public void setMoTaTrangThai(String moTaTrangThai) {
		_moTaTrangThai = moTaTrangThai;
	}

	public long getVaiTroXuLy1() {
		return _vaiTroXuLy1;
	}

	public void setVaiTroXuLy1(long vaiTroXuLy1) {
		_vaiTroXuLy1 = vaiTroXuLy1;
	}

	public long getVaiTroXuLy2() {
		return _vaiTroXuLy2;
	}

	public void setVaiTroXuLy2(long vaiTroXuLy2) {
		_vaiTroXuLy2 = vaiTroXuLy2;
	}

	public long getVaiTroXuLy3() {
		return _vaiTroXuLy3;
	}

	public void setVaiTroXuLy3(long vaiTroXuLy3) {
		_vaiTroXuLy3 = vaiTroXuLy3;
	}

	public String getFormXuLy() {
		return _formXuLy;
	}

	public void setFormXuLy(String formXuLy) {
		_formXuLy = formXuLy;
	}

	private long _id;
	private long _quyTrinhThuTucId;
	private String _tenTrangThai;
	private long _kieuTrangThai;
	private String _moTaTrangThai;
	private long _vaiTroXuLy1;
	private long _vaiTroXuLy2;
	private long _vaiTroXuLy3;
	private String _formXuLy;
}