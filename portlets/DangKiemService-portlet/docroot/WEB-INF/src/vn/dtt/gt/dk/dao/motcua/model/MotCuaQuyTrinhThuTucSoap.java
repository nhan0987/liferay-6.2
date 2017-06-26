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
public class MotCuaQuyTrinhThuTucSoap implements Serializable {
	public static MotCuaQuyTrinhThuTucSoap toSoapModel(
		MotCuaQuyTrinhThuTuc model) {
		MotCuaQuyTrinhThuTucSoap soapModel = new MotCuaQuyTrinhThuTucSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setMaQuyTrinh(model.getMaQuyTrinh());
		soapModel.setToChucXuLy(model.getToChucXuLy());
		soapModel.setSoNgayXuLy(model.getSoNgayXuLy());

		return soapModel;
	}

	public static MotCuaQuyTrinhThuTucSoap[] toSoapModels(
		MotCuaQuyTrinhThuTuc[] models) {
		MotCuaQuyTrinhThuTucSoap[] soapModels = new MotCuaQuyTrinhThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaQuyTrinhThuTucSoap[][] toSoapModels(
		MotCuaQuyTrinhThuTuc[][] models) {
		MotCuaQuyTrinhThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaQuyTrinhThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaQuyTrinhThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaQuyTrinhThuTucSoap[] toSoapModels(
		List<MotCuaQuyTrinhThuTuc> models) {
		List<MotCuaQuyTrinhThuTucSoap> soapModels = new ArrayList<MotCuaQuyTrinhThuTucSoap>(models.size());

		for (MotCuaQuyTrinhThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaQuyTrinhThuTucSoap[soapModels.size()]);
	}

	public MotCuaQuyTrinhThuTucSoap() {
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

	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public String getMaQuyTrinh() {
		return _maQuyTrinh;
	}

	public void setMaQuyTrinh(String maQuyTrinh) {
		_maQuyTrinh = maQuyTrinh;
	}

	public long getToChucXuLy() {
		return _toChucXuLy;
	}

	public void setToChucXuLy(long toChucXuLy) {
		_toChucXuLy = toChucXuLy;
	}

	public long getSoNgayXuLy() {
		return _soNgayXuLy;
	}

	public void setSoNgayXuLy(long soNgayXuLy) {
		_soNgayXuLy = soNgayXuLy;
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _maQuyTrinh;
	private long _toChucXuLy;
	private long _soNgayXuLy;
}