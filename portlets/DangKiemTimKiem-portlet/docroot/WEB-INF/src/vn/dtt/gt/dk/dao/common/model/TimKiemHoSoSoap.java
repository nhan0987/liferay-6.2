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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class TimKiemHoSoSoap implements Serializable {
	public static TimKiemHoSoSoap toSoapModel(TimKiemHoSo model) {
		TimKiemHoSoSoap soapModel = new TimKiemHoSoSoap();

		soapModel.setId(model.getId());
		soapModel.setMaSoHoSo(model.getMaSoHoSo());
		soapModel.setMaBienNhan(model.getMaBienNhan());
		soapModel.setThuTucHanhChinhId(model.getThuTucHanhChinhId());
		soapModel.setLoaiChuHoSo(model.getLoaiChuHoSo());
		soapModel.setMaSoChuHoSo(model.getMaSoChuHoSo());
		soapModel.setTenChuHoSo(model.getTenChuHoSo());
		soapModel.setDiaChiChuHoSo(model.getDiaChiChuHoSo());
		soapModel.setTrichYeuNoiDung(model.getTrichYeuNoiDung());
		soapModel.setNgayGuiHoSo(model.getNgayGuiHoSo());
		soapModel.setNgayTiepNhan(model.getNgayTiepNhan());
		soapModel.setNgayBoSung(model.getNgayBoSung());
		soapModel.setNgayHenTra(model.getNgayHenTra());
		soapModel.setNgayTraKetQua(model.getNgayTraKetQua());
		soapModel.setNgayDongHoSo(model.getNgayDongHoSo());
		soapModel.setTrangThaiHoSo(model.getTrangThaiHoSo());
		soapModel.setPhanNhomHoSoId(model.getPhanNhomHoSoId());
		soapModel.setMaDonViTiepNhan(model.getMaDonViTiepNhan());
		soapModel.setTenDonViTiepNhan(model.getTenDonViTiepNhan());
		soapModel.setToChucQuanLy(model.getToChucQuanLy());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setNguoiTao(model.getNguoiTao());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setLanGuiCuoi(model.getLanGuiCuoi());

		return soapModel;
	}

	public static TimKiemHoSoSoap[] toSoapModels(TimKiemHoSo[] models) {
		TimKiemHoSoSoap[] soapModels = new TimKiemHoSoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TimKiemHoSoSoap[][] toSoapModels(TimKiemHoSo[][] models) {
		TimKiemHoSoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TimKiemHoSoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TimKiemHoSoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TimKiemHoSoSoap[] toSoapModels(List<TimKiemHoSo> models) {
		List<TimKiemHoSoSoap> soapModels = new ArrayList<TimKiemHoSoSoap>(models.size());

		for (TimKiemHoSo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TimKiemHoSoSoap[soapModels.size()]);
	}

	public TimKiemHoSoSoap() {
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

	public long getLoaiChuHoSo() {
		return _loaiChuHoSo;
	}

	public void setLoaiChuHoSo(long loaiChuHoSo) {
		_loaiChuHoSo = loaiChuHoSo;
	}

	public String getMaSoChuHoSo() {
		return _maSoChuHoSo;
	}

	public void setMaSoChuHoSo(String maSoChuHoSo) {
		_maSoChuHoSo = maSoChuHoSo;
	}

	public String getTenChuHoSo() {
		return _tenChuHoSo;
	}

	public void setTenChuHoSo(String tenChuHoSo) {
		_tenChuHoSo = tenChuHoSo;
	}

	public String getDiaChiChuHoSo() {
		return _diaChiChuHoSo;
	}

	public void setDiaChiChuHoSo(String diaChiChuHoSo) {
		_diaChiChuHoSo = diaChiChuHoSo;
	}

	public String getTrichYeuNoiDung() {
		return _trichYeuNoiDung;
	}

	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		_trichYeuNoiDung = trichYeuNoiDung;
	}

	public Date getNgayGuiHoSo() {
		return _ngayGuiHoSo;
	}

	public void setNgayGuiHoSo(Date ngayGuiHoSo) {
		_ngayGuiHoSo = ngayGuiHoSo;
	}

	public Date getNgayTiepNhan() {
		return _ngayTiepNhan;
	}

	public void setNgayTiepNhan(Date ngayTiepNhan) {
		_ngayTiepNhan = ngayTiepNhan;
	}

	public Date getNgayBoSung() {
		return _ngayBoSung;
	}

	public void setNgayBoSung(Date ngayBoSung) {
		_ngayBoSung = ngayBoSung;
	}

	public Date getNgayHenTra() {
		return _ngayHenTra;
	}

	public void setNgayHenTra(Date ngayHenTra) {
		_ngayHenTra = ngayHenTra;
	}

	public Date getNgayTraKetQua() {
		return _ngayTraKetQua;
	}

	public void setNgayTraKetQua(Date ngayTraKetQua) {
		_ngayTraKetQua = ngayTraKetQua;
	}

	public Date getNgayDongHoSo() {
		return _ngayDongHoSo;
	}

	public void setNgayDongHoSo(Date ngayDongHoSo) {
		_ngayDongHoSo = ngayDongHoSo;
	}

	public String getTrangThaiHoSo() {
		return _trangThaiHoSo;
	}

	public void setTrangThaiHoSo(String trangThaiHoSo) {
		_trangThaiHoSo = trangThaiHoSo;
	}

	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	public String getMaDonViTiepNhan() {
		return _maDonViTiepNhan;
	}

	public void setMaDonViTiepNhan(String maDonViTiepNhan) {
		_maDonViTiepNhan = maDonViTiepNhan;
	}

	public String getTenDonViTiepNhan() {
		return _tenDonViTiepNhan;
	}

	public void setTenDonViTiepNhan(String tenDonViTiepNhan) {
		_tenDonViTiepNhan = tenDonViTiepNhan;
	}

	public long getToChucQuanLy() {
		return _toChucQuanLy;
	}

	public void setToChucQuanLy(long toChucQuanLy) {
		_toChucQuanLy = toChucQuanLy;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public long getNguoiTao() {
		return _nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public long getLanGuiCuoi() {
		return _lanGuiCuoi;
	}

	public void setLanGuiCuoi(long lanGuiCuoi) {
		_lanGuiCuoi = lanGuiCuoi;
	}

	private long _id;
	private String _maSoHoSo;
	private String _maBienNhan;
	private long _thuTucHanhChinhId;
	private long _loaiChuHoSo;
	private String _maSoChuHoSo;
	private String _tenChuHoSo;
	private String _diaChiChuHoSo;
	private String _trichYeuNoiDung;
	private Date _ngayGuiHoSo;
	private Date _ngayTiepNhan;
	private Date _ngayBoSung;
	private Date _ngayHenTra;
	private Date _ngayTraKetQua;
	private Date _ngayDongHoSo;
	private String _trangThaiHoSo;
	private long _phanNhomHoSoId;
	private String _maDonViTiepNhan;
	private String _tenDonViTiepNhan;
	private long _toChucQuanLy;
	private Date _ngayTao;
	private long _nguoiTao;
	private String _ghiChu;
	private long _lanGuiCuoi;
}