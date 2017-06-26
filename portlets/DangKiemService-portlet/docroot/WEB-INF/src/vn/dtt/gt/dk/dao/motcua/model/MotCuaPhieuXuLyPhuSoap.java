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
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
public class MotCuaPhieuXuLyPhuSoap implements Serializable {
	public static MotCuaPhieuXuLyPhuSoap toSoapModel(MotCuaPhieuXuLyPhu model) {
		MotCuaPhieuXuLyPhuSoap soapModel = new MotCuaPhieuXuLyPhuSoap();

		soapModel.setId(model.getId());
		soapModel.setPhieuXuLyChinhId(model.getPhieuXuLyChinhId());
		soapModel.setTrichYeuNoiDung(model.getTrichYeuNoiDung());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setTrangThaiHienTaiId(model.getTrangThaiHienTaiId());
		soapModel.setNoiDungHoSoId(model.getNoiDungHoSoId());
		soapModel.setChiemQuyenXuLy(model.getChiemQuyenXuLy());
		soapModel.setNgayTaoPhieu(model.getNgayTaoPhieu());
		soapModel.setNguoiTaoPhieu(model.getNguoiTaoPhieu());
		soapModel.setNhomPhieuXuLy(model.getNhomPhieuXuLy());
		soapModel.setPhanNhomHoSoId(model.getPhanNhomHoSoId());

		return soapModel;
	}

	public static MotCuaPhieuXuLyPhuSoap[] toSoapModels(
		MotCuaPhieuXuLyPhu[] models) {
		MotCuaPhieuXuLyPhuSoap[] soapModels = new MotCuaPhieuXuLyPhuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaPhieuXuLyPhuSoap[][] toSoapModels(
		MotCuaPhieuXuLyPhu[][] models) {
		MotCuaPhieuXuLyPhuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaPhieuXuLyPhuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaPhieuXuLyPhuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaPhieuXuLyPhuSoap[] toSoapModels(
		List<MotCuaPhieuXuLyPhu> models) {
		List<MotCuaPhieuXuLyPhuSoap> soapModels = new ArrayList<MotCuaPhieuXuLyPhuSoap>(models.size());

		for (MotCuaPhieuXuLyPhu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaPhieuXuLyPhuSoap[soapModels.size()]);
	}

	public MotCuaPhieuXuLyPhuSoap() {
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

	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public long getTrangThaiHienTaiId() {
		return _trangThaiHienTaiId;
	}

	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_trangThaiHienTaiId = trangThaiHienTaiId;
	}

	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;
	}

	public long getChiemQuyenXuLy() {
		return _chiemQuyenXuLy;
	}

	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_chiemQuyenXuLy = chiemQuyenXuLy;
	}

	public Date getNgayTaoPhieu() {
		return _ngayTaoPhieu;
	}

	public void setNgayTaoPhieu(Date ngayTaoPhieu) {
		_ngayTaoPhieu = ngayTaoPhieu;
	}

	public long getNguoiTaoPhieu() {
		return _nguoiTaoPhieu;
	}

	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_nguoiTaoPhieu = nguoiTaoPhieu;
	}

	public String getNhomPhieuXuLy() {
		return _nhomPhieuXuLy;
	}

	public void setNhomPhieuXuLy(String nhomPhieuXuLy) {
		_nhomPhieuXuLy = nhomPhieuXuLy;
	}

	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	private long _id;
	private long _phieuXuLyChinhId;
	private String _trichYeuNoiDung;
	private String _ghiChu;
	private long _trangThaiHienTaiId;
	private long _noiDungHoSoId;
	private long _chiemQuyenXuLy;
	private Date _ngayTaoPhieu;
	private long _nguoiTaoPhieu;
	private String _nhomPhieuXuLy;
	private long _phanNhomHoSoId;
}