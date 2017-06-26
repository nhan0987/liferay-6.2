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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.motcua.service.http.MotCuaDienBienHoSoServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.http.MotCuaDienBienHoSoServiceSoap
 * @generated
 */
public class MotCuaDienBienHoSoSoap implements Serializable {
	public static MotCuaDienBienHoSoSoap toSoapModel(MotCuaDienBienHoSo model) {
		MotCuaDienBienHoSoSoap soapModel = new MotCuaDienBienHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setPhieuXuLyChinhId(model.getPhieuXuLyChinhId());
		soapModel.setPhieuXuLyPhuId(model.getPhieuXuLyPhuId());
		soapModel.setSoNgayQuaHan(model.getSoNgayQuaHan());
		soapModel.setTrangThaiTruocId(model.getTrangThaiTruocId());
		soapModel.setTrangThaiSauId(model.getTrangThaiSauId());
		soapModel.setNgayXuLy(model.getNgayXuLy());
		soapModel.setNguoiXuLy(model.getNguoiXuLy());
		soapModel.setHanhDongXuLy(model.getHanhDongXuLy());
		soapModel.setSynchDate(model.getSynchDate());

		return soapModel;
	}

	public static MotCuaDienBienHoSoSoap[] toSoapModels(
		MotCuaDienBienHoSo[] models) {
		MotCuaDienBienHoSoSoap[] soapModels = new MotCuaDienBienHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaDienBienHoSoSoap[][] toSoapModels(
		MotCuaDienBienHoSo[][] models) {
		MotCuaDienBienHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaDienBienHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaDienBienHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaDienBienHoSoSoap[] toSoapModels(
		List<MotCuaDienBienHoSo> models) {
		List<MotCuaDienBienHoSoSoap> soapModels = new ArrayList<MotCuaDienBienHoSoSoap>(models.size());

		for (MotCuaDienBienHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaDienBienHoSoSoap[soapModels.size()]);
	}

	public MotCuaDienBienHoSoSoap() {
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

	public long getPhieuXuLyChinhId() {
		return _phieuXuLyChinhId;
	}

	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phieuXuLyChinhId = phieuXuLyChinhId;
	}

	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;
	}

	public int getSoNgayQuaHan() {
		return _soNgayQuaHan;
	}

	public void setSoNgayQuaHan(int soNgayQuaHan) {
		_soNgayQuaHan = soNgayQuaHan;
	}

	public long getTrangThaiTruocId() {
		return _trangThaiTruocId;
	}

	public void setTrangThaiTruocId(long trangThaiTruocId) {
		_trangThaiTruocId = trangThaiTruocId;
	}

	public long getTrangThaiSauId() {
		return _trangThaiSauId;
	}

	public void setTrangThaiSauId(long trangThaiSauId) {
		_trangThaiSauId = trangThaiSauId;
	}

	public Date getNgayXuLy() {
		return _ngayXuLy;
	}

	public void setNgayXuLy(Date ngayXuLy) {
		_ngayXuLy = ngayXuLy;
	}

	public long getNguoiXuLy() {
		return _nguoiXuLy;
	}

	public void setNguoiXuLy(long nguoiXuLy) {
		_nguoiXuLy = nguoiXuLy;
	}

	public String getHanhDongXuLy() {
		return _hanhDongXuLy;
	}

	public void setHanhDongXuLy(String hanhDongXuLy) {
		_hanhDongXuLy = hanhDongXuLy;
	}

	public Date getSynchDate() {
		return _SynchDate;
	}

	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;
	}

	private long _id;
	private long _phieuXuLyChinhId;
	private long _phieuXuLyPhuId;
	private int _soNgayQuaHan;
	private long _trangThaiTruocId;
	private long _trangThaiSauId;
	private Date _ngayXuLy;
	private long _nguoiXuLy;
	private String _hanhDongXuLy;
	private Date _SynchDate;
}