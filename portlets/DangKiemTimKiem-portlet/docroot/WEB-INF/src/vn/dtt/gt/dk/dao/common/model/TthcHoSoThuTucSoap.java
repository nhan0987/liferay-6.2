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
public class TthcHoSoThuTucSoap implements Serializable {
	public static TthcHoSoThuTucSoap toSoapModel(TthcHoSoThuTuc model) {
		TthcHoSoThuTucSoap soapModel = new TthcHoSoThuTucSoap();

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

	public static TthcHoSoThuTucSoap[] toSoapModels(TthcHoSoThuTuc[] models) {
		TthcHoSoThuTucSoap[] soapModels = new TthcHoSoThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcHoSoThuTucSoap[][] toSoapModels(TthcHoSoThuTuc[][] models) {
		TthcHoSoThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcHoSoThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcHoSoThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcHoSoThuTucSoap[] toSoapModels(List<TthcHoSoThuTuc> models) {
		List<TthcHoSoThuTucSoap> soapModels = new ArrayList<TthcHoSoThuTucSoap>(models.size());

		for (TthcHoSoThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcHoSoThuTucSoap[soapModels.size()]);
	}

	public TthcHoSoThuTucSoap() {
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

	public String getMaSoHoSo() {
		return _MaSoHoSo;
	}

	public void setMaSoHoSo(String MaSoHoSo) {
		_MaSoHoSo = MaSoHoSo;
	}

	public String getMaBienNhan() {
		return _MaBienNhan;
	}

	public void setMaBienNhan(String MaBienNhan) {
		_MaBienNhan = MaBienNhan;
	}

	public long getThuTucHanhChinhId() {
		return _ThuTucHanhChinhId;
	}

	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_ThuTucHanhChinhId = ThuTucHanhChinhId;
	}

	public long getLoaiChuHoSo() {
		return _LoaiChuHoSo;
	}

	public void setLoaiChuHoSo(long LoaiChuHoSo) {
		_LoaiChuHoSo = LoaiChuHoSo;
	}

	public String getMaSoChuHoSo() {
		return _MaSoChuHoSo;
	}

	public void setMaSoChuHoSo(String MaSoChuHoSo) {
		_MaSoChuHoSo = MaSoChuHoSo;
	}

	public String getTenChuHoSo() {
		return _TenChuHoSo;
	}

	public void setTenChuHoSo(String TenChuHoSo) {
		_TenChuHoSo = TenChuHoSo;
	}

	public String getDiaChiChuHoSo() {
		return _DiaChiChuHoSo;
	}

	public void setDiaChiChuHoSo(String DiaChiChuHoSo) {
		_DiaChiChuHoSo = DiaChiChuHoSo;
	}

	public String getTrichYeuNoiDung() {
		return _TrichYeuNoiDung;
	}

	public void setTrichYeuNoiDung(String TrichYeuNoiDung) {
		_TrichYeuNoiDung = TrichYeuNoiDung;
	}

	public Date getNgayGuiHoSo() {
		return _NgayGuiHoSo;
	}

	public void setNgayGuiHoSo(Date NgayGuiHoSo) {
		_NgayGuiHoSo = NgayGuiHoSo;
	}

	public Date getNgayTiepNhan() {
		return _NgayTiepNhan;
	}

	public void setNgayTiepNhan(Date NgayTiepNhan) {
		_NgayTiepNhan = NgayTiepNhan;
	}

	public Date getNgayBoSung() {
		return _NgayBoSung;
	}

	public void setNgayBoSung(Date NgayBoSung) {
		_NgayBoSung = NgayBoSung;
	}

	public Date getNgayHenTra() {
		return _NgayHenTra;
	}

	public void setNgayHenTra(Date NgayHenTra) {
		_NgayHenTra = NgayHenTra;
	}

	public Date getNgayTraKetQua() {
		return _NgayTraKetQua;
	}

	public void setNgayTraKetQua(Date NgayTraKetQua) {
		_NgayTraKetQua = NgayTraKetQua;
	}

	public Date getNgayDongHoSo() {
		return _NgayDongHoSo;
	}

	public void setNgayDongHoSo(Date NgayDongHoSo) {
		_NgayDongHoSo = NgayDongHoSo;
	}

	public String getTrangThaiHoSo() {
		return _TrangThaiHoSo;
	}

	public void setTrangThaiHoSo(String TrangThaiHoSo) {
		_TrangThaiHoSo = TrangThaiHoSo;
	}

	public long getPhanNhomHoSoId() {
		return _PhanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long PhanNhomHoSoId) {
		_PhanNhomHoSoId = PhanNhomHoSoId;
	}

	public String getMaDonViTiepNhan() {
		return _MaDonViTiepNhan;
	}

	public void setMaDonViTiepNhan(String MaDonViTiepNhan) {
		_MaDonViTiepNhan = MaDonViTiepNhan;
	}

	public String getTenDonViTiepNhan() {
		return _TenDonViTiepNhan;
	}

	public void setTenDonViTiepNhan(String TenDonViTiepNhan) {
		_TenDonViTiepNhan = TenDonViTiepNhan;
	}

	public long getToChucQuanLy() {
		return _ToChucQuanLy;
	}

	public void setToChucQuanLy(long ToChucQuanLy) {
		_ToChucQuanLy = ToChucQuanLy;
	}

	public Date getNgayTao() {
		return _NgayTao;
	}

	public void setNgayTao(Date NgayTao) {
		_NgayTao = NgayTao;
	}

	public long getNguoiTao() {
		return _NguoiTao;
	}

	public void setNguoiTao(long NguoiTao) {
		_NguoiTao = NguoiTao;
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

	private long _Id;
	private String _MaSoHoSo;
	private String _MaBienNhan;
	private long _ThuTucHanhChinhId;
	private long _LoaiChuHoSo;
	private String _MaSoChuHoSo;
	private String _TenChuHoSo;
	private String _DiaChiChuHoSo;
	private String _TrichYeuNoiDung;
	private Date _NgayGuiHoSo;
	private Date _NgayTiepNhan;
	private Date _NgayBoSung;
	private Date _NgayHenTra;
	private Date _NgayTraKetQua;
	private Date _NgayDongHoSo;
	private String _TrangThaiHoSo;
	private long _PhanNhomHoSoId;
	private String _MaDonViTiepNhan;
	private String _TenDonViTiepNhan;
	private long _ToChucQuanLy;
	private Date _NgayTao;
	private long _NguoiTao;
	private String _ghiChu;
	private long _lanGuiCuoi;
}