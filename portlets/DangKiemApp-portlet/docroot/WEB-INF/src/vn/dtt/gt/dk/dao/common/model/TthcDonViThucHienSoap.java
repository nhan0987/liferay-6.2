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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class TthcDonViThucHienSoap implements Serializable {
	public static TthcDonViThucHienSoap toSoapModel(TthcDonViThucHien model) {
		TthcDonViThucHienSoap soapModel = new TthcDonViThucHienSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setMaDvth(model.getMaDvth());
		soapModel.setTenDvth(model.getTenDvth());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setToChuc(model.getToChuc());

		return soapModel;
	}

	public static TthcDonViThucHienSoap[] toSoapModels(
		TthcDonViThucHien[] models) {
		TthcDonViThucHienSoap[] soapModels = new TthcDonViThucHienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcDonViThucHienSoap[][] toSoapModels(
		TthcDonViThucHien[][] models) {
		TthcDonViThucHienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcDonViThucHienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcDonViThucHienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcDonViThucHienSoap[] toSoapModels(
		List<TthcDonViThucHien> models) {
		List<TthcDonViThucHienSoap> soapModels = new ArrayList<TthcDonViThucHienSoap>(models.size());

		for (TthcDonViThucHien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcDonViThucHienSoap[soapModels.size()]);
	}

	public TthcDonViThucHienSoap() {
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

	public long getThuTucHanhChinhId() {
		return _ThuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_ThuTucHanhChinhId = ThuTucHanhChinhId;
	}

	public String getMaDvth() {
		return _MaDvth;
	}

	public void setMaDvth(String MaDvth) {
		_MaDvth = MaDvth;
	}

	public String getTenDvth() {
		return _TenDvth;
	}

	public void setTenDvth(String TenDvth) {
		_TenDvth = TenDvth;
	}

	public String getTenTiengAnh() {
		return _TenTiengAnh;
	}

	public void setTenTiengAnh(String TenTiengAnh) {
		_TenTiengAnh = TenTiengAnh;
	}

	public long getToChuc() {
		return _ToChuc;
	}

	public void setToChuc(long ToChuc) {
		_ToChuc = ToChuc;
	}

	private long _Id;
	private long _ThuTucHanhChinhId;
	private String _MaDvth;
	private String _TenDvth;
	private String _TenTiengAnh;
	private long _ToChuc;
}