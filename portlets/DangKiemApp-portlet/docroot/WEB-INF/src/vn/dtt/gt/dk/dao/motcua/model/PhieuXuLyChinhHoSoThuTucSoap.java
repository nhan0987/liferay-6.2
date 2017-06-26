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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.motcua.service.http.PhieuXuLyChinhHoSoThuTucServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.http.PhieuXuLyChinhHoSoThuTucServiceSoap
 * @generated
 */
public class PhieuXuLyChinhHoSoThuTucSoap implements Serializable {
	public static PhieuXuLyChinhHoSoThuTucSoap toSoapModel(
		PhieuXuLyChinhHoSoThuTuc model) {
		PhieuXuLyChinhHoSoThuTucSoap soapModel = new PhieuXuLyChinhHoSoThuTucSoap();

		soapModel.setId(model.getId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setQuyTrinhThuTucId(model.getQuyTrinhThuTucId());
		soapModel.setTenNguoiNop(model.getTenNguoiNop());
		soapModel.setCmndNguoiNop(model.getCmndNguoiNop());
		soapModel.setDiaChiNguoiNop(model.getDiaChiNguoiNop());
		soapModel.setSoDtddNguoiNop(model.getSoDtddNguoiNop());
		soapModel.setEmailNguoiNop(model.getEmailNguoiNop());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setTrangThaiHienTaiId(model.getTrangThaiHienTaiId());
		soapModel.setHetHoSoCon(model.getHetHoSoCon());
		soapModel.setChiemQuyenXuLy(model.getChiemQuyenXuLy());
		soapModel.setNgayTaoPhieu(model.getNgayTaoPhieu());
		soapModel.setNguoiTaoPhieu(model.getNguoiTaoPhieu());
		soapModel.setSoDtcdNguoiNop(model.getSoDtcdNguoiNop());
		soapModel.setMaSoHoSo(model.getMaSoHoSo());
		soapModel.setMaBienNhan(model.getMaBienNhan());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setTenChuHoSo(model.getTenChuHoSo());
		soapModel.setNgayGuiHoSo(model.getNgayGuiHoSo());
		soapModel.setTenDonViTiepNhan(model.getTenDonViTiepNhan());

		return soapModel;
	}

	public static PhieuXuLyChinhHoSoThuTucSoap[] toSoapModels(
		PhieuXuLyChinhHoSoThuTuc[] models) {
		PhieuXuLyChinhHoSoThuTucSoap[] soapModels = new PhieuXuLyChinhHoSoThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhieuXuLyChinhHoSoThuTucSoap[][] toSoapModels(
		PhieuXuLyChinhHoSoThuTuc[][] models) {
		PhieuXuLyChinhHoSoThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhieuXuLyChinhHoSoThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhieuXuLyChinhHoSoThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhieuXuLyChinhHoSoThuTucSoap[] toSoapModels(
		List<PhieuXuLyChinhHoSoThuTuc> models) {
		List<PhieuXuLyChinhHoSoThuTucSoap> soapModels = new ArrayList<PhieuXuLyChinhHoSoThuTucSoap>(models.size());

		for (PhieuXuLyChinhHoSoThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhieuXuLyChinhHoSoThuTucSoap[soapModels.size()]);
	}

	public PhieuXuLyChinhHoSoThuTucSoap() {
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

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getQuyTrinhThuTucId() {
		return _quyTrinhThuTucId;
	}

	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_quyTrinhThuTucId = quyTrinhThuTucId;
	}

	public String getTenNguoiNop() {
		return _tenNguoiNop;
	}

	public void setTenNguoiNop(String tenNguoiNop) {
		_tenNguoiNop = tenNguoiNop;
	}

	public String getCmndNguoiNop() {
		return _cmndNguoiNop;
	}

	public void setCmndNguoiNop(String cmndNguoiNop) {
		_cmndNguoiNop = cmndNguoiNop;
	}

	public String getDiaChiNguoiNop() {
		return _diaChiNguoiNop;
	}

	public void setDiaChiNguoiNop(String diaChiNguoiNop) {
		_diaChiNguoiNop = diaChiNguoiNop;
	}

	public String getSoDtddNguoiNop() {
		return _soDtddNguoiNop;
	}

	public void setSoDtddNguoiNop(String soDtddNguoiNop) {
		_soDtddNguoiNop = soDtddNguoiNop;
	}

	public String getEmailNguoiNop() {
		return _emailNguoiNop;
	}

	public void setEmailNguoiNop(String emailNguoiNop) {
		_emailNguoiNop = emailNguoiNop;
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

	public long getHetHoSoCon() {
		return _hetHoSoCon;
	}

	public void setHetHoSoCon(long hetHoSoCon) {
		_hetHoSoCon = hetHoSoCon;
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

	public String getSoDtcdNguoiNop() {
		return _soDtcdNguoiNop;
	}

	public void setSoDtcdNguoiNop(String soDtcdNguoiNop) {
		_soDtcdNguoiNop = soDtcdNguoiNop;
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
	private long _hoSoThuTucId;
	private long _quyTrinhThuTucId;
	private String _tenNguoiNop;
	private String _cmndNguoiNop;
	private String _diaChiNguoiNop;
	private String _soDtddNguoiNop;
	private String _emailNguoiNop;
	private String _ghiChu;
	private long _trangThaiHienTaiId;
	private long _hetHoSoCon;
	private long _chiemQuyenXuLy;
	private Date _ngayTaoPhieu;
	private long _nguoiTaoPhieu;
	private String _soDtcdNguoiNop;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private String _tenChuHoSo;
	private Date _ngayGuiHoSo;
	private String _tenDonViTiepNhan;
}