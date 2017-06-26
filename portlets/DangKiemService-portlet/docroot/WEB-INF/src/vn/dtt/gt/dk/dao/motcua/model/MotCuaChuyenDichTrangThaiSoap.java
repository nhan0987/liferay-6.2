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
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
public class MotCuaChuyenDichTrangThaiSoap implements Serializable {
	public static MotCuaChuyenDichTrangThaiSoap toSoapModel(
		MotCuaChuyenDichTrangThai model) {
		MotCuaChuyenDichTrangThaiSoap soapModel = new MotCuaChuyenDichTrangThaiSoap();

		soapModel.setId(model.getId());
		soapModel.setTrangThaiNguonId(model.getTrangThaiNguonId());
		soapModel.setTrangThaiDichId(model.getTrangThaiDichId());
		soapModel.setDieuKienChuyenDich(model.getDieuKienChuyenDich());
		soapModel.setHanhDongXuLy(model.getHanhDongXuLy());
		soapModel.setSoNgayXuLy(model.getSoNgayXuLy());
		soapModel.setPhanNhomHoSoId(model.getPhanNhomHoSoId());

		return soapModel;
	}

	public static MotCuaChuyenDichTrangThaiSoap[] toSoapModels(
		MotCuaChuyenDichTrangThai[] models) {
		MotCuaChuyenDichTrangThaiSoap[] soapModels = new MotCuaChuyenDichTrangThaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaChuyenDichTrangThaiSoap[][] toSoapModels(
		MotCuaChuyenDichTrangThai[][] models) {
		MotCuaChuyenDichTrangThaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaChuyenDichTrangThaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaChuyenDichTrangThaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaChuyenDichTrangThaiSoap[] toSoapModels(
		List<MotCuaChuyenDichTrangThai> models) {
		List<MotCuaChuyenDichTrangThaiSoap> soapModels = new ArrayList<MotCuaChuyenDichTrangThaiSoap>(models.size());

		for (MotCuaChuyenDichTrangThai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaChuyenDichTrangThaiSoap[soapModels.size()]);
	}

	public MotCuaChuyenDichTrangThaiSoap() {
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

	public long getTrangThaiNguonId() {
		return _trangThaiNguonId;
	}

	public void setTrangThaiNguonId(long trangThaiNguonId) {
		_trangThaiNguonId = trangThaiNguonId;
	}

	public long getTrangThaiDichId() {
		return _trangThaiDichId;
	}

	public void setTrangThaiDichId(long trangThaiDichId) {
		_trangThaiDichId = trangThaiDichId;
	}

	public String getDieuKienChuyenDich() {
		return _dieuKienChuyenDich;
	}

	public void setDieuKienChuyenDich(String dieuKienChuyenDich) {
		_dieuKienChuyenDich = dieuKienChuyenDich;
	}

	public String getHanhDongXuLy() {
		return _hanhDongXuLy;
	}

	public void setHanhDongXuLy(String hanhDongXuLy) {
		_hanhDongXuLy = hanhDongXuLy;
	}

	public int getSoNgayXuLy() {
		return _soNgayXuLy;
	}

	public void setSoNgayXuLy(int soNgayXuLy) {
		_soNgayXuLy = soNgayXuLy;
	}

	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	private long _id;
	private long _trangThaiNguonId;
	private long _trangThaiDichId;
	private String _dieuKienChuyenDich;
	private String _hanhDongXuLy;
	private int _soNgayXuLy;
	private long _phanNhomHoSoId;
}