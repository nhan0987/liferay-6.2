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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.motcua.service.http.PhieuXuLyPhuHoSoThuTucServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.http.PhieuXuLyPhuHoSoThuTucServiceSoap
 * @generated
 */
public class PhieuXuLyPhuHoSoThuTucSoap implements Serializable {
	public static PhieuXuLyPhuHoSoThuTucSoap toSoapModel(
		PhieuXuLyPhuHoSoThuTuc model) {
		PhieuXuLyPhuHoSoThuTucSoap soapModel = new PhieuXuLyPhuHoSoThuTucSoap();

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
		soapModel.setMaSoHoSo(model.getMaSoHoSo());
		soapModel.setMaBienNhan(model.getMaBienNhan());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setTenChuHoSo(model.getTenChuHoSo());
		soapModel.setNgayGuiHoSo(model.getNgayGuiHoSo());
		soapModel.setTenDonViTiepNhan(model.getTenDonViTiepNhan());

		return soapModel;
	}

	public static PhieuXuLyPhuHoSoThuTucSoap[] toSoapModels(
		PhieuXuLyPhuHoSoThuTuc[] models) {
		PhieuXuLyPhuHoSoThuTucSoap[] soapModels = new PhieuXuLyPhuHoSoThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhieuXuLyPhuHoSoThuTucSoap[][] toSoapModels(
		PhieuXuLyPhuHoSoThuTuc[][] models) {
		PhieuXuLyPhuHoSoThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhieuXuLyPhuHoSoThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhieuXuLyPhuHoSoThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhieuXuLyPhuHoSoThuTucSoap[] toSoapModels(
		List<PhieuXuLyPhuHoSoThuTuc> models) {
		List<PhieuXuLyPhuHoSoThuTucSoap> soapModels = new ArrayList<PhieuXuLyPhuHoSoThuTucSoap>(models.size());

		for (PhieuXuLyPhuHoSoThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhieuXuLyPhuHoSoThuTucSoap[soapModels.size()]);
	}

	public PhieuXuLyPhuHoSoThuTucSoap() {
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

	public String getMaSoHoSo() {
		return _maSoHoSo;
	}

	public void setMaSoHoSo(String maSoHoSo) {
		_maSoHoSo = maSoHoSo;
	}

	public String getMaBienNhan() {
		return _maBienNhan;
	}

	public void setMaBienNhan(String maBienNhan) {
		_maBienNhan = maBienNhan;
	}

	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;
	}

	public String getTenChuHoSo() {
		return _tenChuHoSo;
	}

	public void setTenChuHoSo(String tenChuHoSo) {
		_tenChuHoSo = tenChuHoSo;
	}

	public Date getNgayGuiHoSo() {
		return _ngayGuiHoSo;
	}

	public void setNgayGuiHoSo(Date ngayGuiHoSo) {
		_ngayGuiHoSo = ngayGuiHoSo;
	}

	public String getTenDonViTiepNhan() {
		return _tenDonViTiepNhan;
	}

	public void setTenDonViTiepNhan(String tenDonViTiepNhan) {
		_tenDonViTiepNhan = tenDonViTiepNhan;
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
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private String _tenChuHoSo;
	private Date _ngayGuiHoSo;
	private String _tenDonViTiepNhan;
}