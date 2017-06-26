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
public class TthcThanhPhanHoSoSoap implements Serializable {
	public static TthcThanhPhanHoSoSoap toSoapModel(TthcThanhPhanHoSo model) {
		TthcThanhPhanHoSoSoap soapModel = new TthcThanhPhanHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setBieuMauHoSoId(model.getBieuMauHoSoId());
		soapModel.setThuTuHienThi(model.getThuTuHienThi());
		soapModel.setLoaiThanhPhan(model.getLoaiThanhPhan());
		soapModel.setMauTrucTuyen(model.getMauTrucTuyen());
		soapModel.setSoTaiLieuDinhKem(model.getSoTaiLieuDinhKem());

		return soapModel;
	}

	public static TthcThanhPhanHoSoSoap[] toSoapModels(
		TthcThanhPhanHoSo[] models) {
		TthcThanhPhanHoSoSoap[] soapModels = new TthcThanhPhanHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcThanhPhanHoSoSoap[][] toSoapModels(
		TthcThanhPhanHoSo[][] models) {
		TthcThanhPhanHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcThanhPhanHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcThanhPhanHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcThanhPhanHoSoSoap[] toSoapModels(
		List<TthcThanhPhanHoSo> models) {
		List<TthcThanhPhanHoSoSoap> soapModels = new ArrayList<TthcThanhPhanHoSoSoap>(models.size());

		for (TthcThanhPhanHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcThanhPhanHoSoSoap[soapModels.size()]);
	}

	public TthcThanhPhanHoSoSoap() {
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

	public long getBieuMauHoSoId() {
		return _BieuMauHoSoId;
	}

	public void setBieuMauHoSoId(long BieuMauHoSoId) {
		_BieuMauHoSoId = BieuMauHoSoId;
	}

	public long getThuTuHienThi() {
		return _ThuTuHienThi;
	}

	public void setThuTuHienThi(long ThuTuHienThi) {
		_ThuTuHienThi = ThuTuHienThi;
	}

	public long getLoaiThanhPhan() {
		return _LoaiThanhPhan;
	}

	public void setLoaiThanhPhan(long LoaiThanhPhan) {
		_LoaiThanhPhan = LoaiThanhPhan;
	}

	public String getMauTrucTuyen() {
		return _MauTrucTuyen;
	}

	public void setMauTrucTuyen(String MauTrucTuyen) {
		_MauTrucTuyen = MauTrucTuyen;
	}

	public long getSoTaiLieuDinhKem() {
		return _SoTaiLieuDinhKem;
	}

	public void setSoTaiLieuDinhKem(long SoTaiLieuDinhKem) {
		_SoTaiLieuDinhKem = SoTaiLieuDinhKem;
	}

	private long _Id;
	private long _ThuTucHanhChinhId;
	private long _BieuMauHoSoId;
	private long _ThuTuHienThi;
	private long _LoaiThanhPhan;
	private String _MauTrucTuyen;
	private long _SoTaiLieuDinhKem;
}