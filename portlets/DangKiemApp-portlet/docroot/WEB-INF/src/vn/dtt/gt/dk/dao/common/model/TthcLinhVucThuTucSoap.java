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
public class TthcLinhVucThuTucSoap implements Serializable {
	public static TthcLinhVucThuTucSoap toSoapModel(TthcLinhVucThuTuc model) {
		TthcLinhVucThuTucSoap soapModel = new TthcLinhVucThuTucSoap();

		soapModel.setId(model.getId());
		soapModel.setTenLinhVuc(model.getTenLinhVuc());
		soapModel.setTenTiengAnh(model.getTenTiengAnh());
		soapModel.setIdCha(model.getIdCha());

		return soapModel;
	}

	public static TthcLinhVucThuTucSoap[] toSoapModels(
		TthcLinhVucThuTuc[] models) {
		TthcLinhVucThuTucSoap[] soapModels = new TthcLinhVucThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcLinhVucThuTucSoap[][] toSoapModels(
		TthcLinhVucThuTuc[][] models) {
		TthcLinhVucThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcLinhVucThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcLinhVucThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcLinhVucThuTucSoap[] toSoapModels(
		List<TthcLinhVucThuTuc> models) {
		List<TthcLinhVucThuTucSoap> soapModels = new ArrayList<TthcLinhVucThuTucSoap>(models.size());

		for (TthcLinhVucThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcLinhVucThuTucSoap[soapModels.size()]);
	}

	public TthcLinhVucThuTucSoap() {
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

	public String getTenLinhVuc() {
		return _TenLinhVuc;
	}

	public void setTenLinhVuc(String TenLinhVuc) {
		_TenLinhVuc = TenLinhVuc;
	}

	public String getTenTiengAnh() {
		return _TenTiengAnh;
	}

	public void setTenTiengAnh(String TenTiengAnh) {
		_TenTiengAnh = TenTiengAnh;
	}

	public long getIdCha() {
		return _IdCha;
	}

	public void setIdCha(long IdCha) {
		_IdCha = IdCha;
	}

	private long _Id;
	private String _TenLinhVuc;
	private String _TenTiengAnh;
	private long _IdCha;
}