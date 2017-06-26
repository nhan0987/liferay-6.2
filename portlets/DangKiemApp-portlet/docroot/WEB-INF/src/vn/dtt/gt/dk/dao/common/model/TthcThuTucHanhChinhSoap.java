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
public class TthcThuTucHanhChinhSoap implements Serializable {
	public static TthcThuTucHanhChinhSoap toSoapModel(TthcThuTucHanhChinh model) {
		TthcThuTucHanhChinhSoap soapModel = new TthcThuTucHanhChinhSoap();

		soapModel.setId(model.getId());
		soapModel.setMaThuTuc(model.getMaThuTuc());
		soapModel.setTenThuTuc(model.getTenThuTuc());
		soapModel.setTrinhTuThucHien(model.getTrinhTuThucHien());
		soapModel.setCachThucThucHien(model.getCachThucThucHien());
		soapModel.setThanhPhanHoSo(model.getThanhPhanHoSo());
		soapModel.setDieuKienThucHien(model.getDieuKienThucHien());
		soapModel.setThoiHanGiaiQuyet(model.getThoiHanGiaiQuyet());
		soapModel.setDoiTuongThucHien(model.getDoiTuongThucHien());
		soapModel.setKetQuaXuLy(model.getKetQuaXuLy());
		soapModel.setCanCuPhapLy(model.getCanCuPhapLy());
		soapModel.setLePhi(model.getLePhi());
		soapModel.setCoQuanQlttId(model.getCoQuanQlttId());
		soapModel.setLinhVucThuTucId(model.getLinhVucThuTucId());
		soapModel.setNgayCoHieuLuc(model.getNgayCoHieuLuc());
		soapModel.setNgayHetHieuLuc(model.getNgayHetHieuLuc());
		soapModel.setHuongDanThucHien(model.getHuongDanThucHien());

		return soapModel;
	}

	public static TthcThuTucHanhChinhSoap[] toSoapModels(
		TthcThuTucHanhChinh[] models) {
		TthcThuTucHanhChinhSoap[] soapModels = new TthcThuTucHanhChinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcThuTucHanhChinhSoap[][] toSoapModels(
		TthcThuTucHanhChinh[][] models) {
		TthcThuTucHanhChinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcThuTucHanhChinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcThuTucHanhChinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcThuTucHanhChinhSoap[] toSoapModels(
		List<TthcThuTucHanhChinh> models) {
		List<TthcThuTucHanhChinhSoap> soapModels = new ArrayList<TthcThuTucHanhChinhSoap>(models.size());

		for (TthcThuTucHanhChinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcThuTucHanhChinhSoap[soapModels.size()]);
	}

	public TthcThuTucHanhChinhSoap() {
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

	public String getMaThuTuc() {
		return _maThuTuc;
	}

	public void setMaThuTuc(String maThuTuc) {
		_maThuTuc = maThuTuc;
	}

	public String getTenThuTuc() {
		return _tenThuTuc;
	}

	public void setTenThuTuc(String tenThuTuc) {
		_tenThuTuc = tenThuTuc;
	}

	public String getTrinhTuThucHien() {
		return _trinhTuThucHien;
	}

	public void setTrinhTuThucHien(String trinhTuThucHien) {
		_trinhTuThucHien = trinhTuThucHien;
	}

	public String getCachThucThucHien() {
		return _cachThucThucHien;
	}

	public void setCachThucThucHien(String cachThucThucHien) {
		_cachThucThucHien = cachThucThucHien;
	}

	public String getThanhPhanHoSo() {
		return _thanhPhanHoSo;
	}

	public void setThanhPhanHoSo(String thanhPhanHoSo) {
		_thanhPhanHoSo = thanhPhanHoSo;
	}

	public String getDieuKienThucHien() {
		return _dieuKienThucHien;
	}

	public void setDieuKienThucHien(String dieuKienThucHien) {
		_dieuKienThucHien = dieuKienThucHien;
	}

	public String getThoiHanGiaiQuyet() {
		return _thoiHanGiaiQuyet;
	}

	public void setThoiHanGiaiQuyet(String thoiHanGiaiQuyet) {
		_thoiHanGiaiQuyet = thoiHanGiaiQuyet;
	}

	public String getDoiTuongThucHien() {
		return _doiTuongThucHien;
	}

	public void setDoiTuongThucHien(String doiTuongThucHien) {
		_doiTuongThucHien = doiTuongThucHien;
	}

	public String getKetQuaXuLy() {
		return _ketQuaXuLy;
	}

	public void setKetQuaXuLy(String ketQuaXuLy) {
		_ketQuaXuLy = ketQuaXuLy;
	}

	public String getCanCuPhapLy() {
		return _canCuPhapLy;
	}

	public void setCanCuPhapLy(String canCuPhapLy) {
		_canCuPhapLy = canCuPhapLy;
	}

	public String getLePhi() {
		return _lePhi;
	}

	public void setLePhi(String lePhi) {
		_lePhi = lePhi;
	}

	public long getCoQuanQlttId() {
		return _coQuanQlttId;
	}

	public void setCoQuanQlttId(long coQuanQlttId) {
		_coQuanQlttId = coQuanQlttId;
	}

	public long getLinhVucThuTucId() {
		return _linhVucThuTucId;
	}

	public void setLinhVucThuTucId(long linhVucThuTucId) {
		_linhVucThuTucId = linhVucThuTucId;
	}

	public Date getNgayCoHieuLuc() {
		return _ngayCoHieuLuc;
	}

	public void setNgayCoHieuLuc(Date ngayCoHieuLuc) {
		_ngayCoHieuLuc = ngayCoHieuLuc;
	}

	public Date getNgayHetHieuLuc() {
		return _ngayHetHieuLuc;
	}

	public void setNgayHetHieuLuc(Date ngayHetHieuLuc) {
		_ngayHetHieuLuc = ngayHetHieuLuc;
	}

	public String getHuongDanThucHien() {
		return _huongDanThucHien;
	}

	public void setHuongDanThucHien(String huongDanThucHien) {
		_huongDanThucHien = huongDanThucHien;
	}

	private long _Id;
	private String _maThuTuc;
	private String _tenThuTuc;
	private String _trinhTuThucHien;
	private String _cachThucThucHien;
	private String _thanhPhanHoSo;
	private String _dieuKienThucHien;
	private String _thoiHanGiaiQuyet;
	private String _doiTuongThucHien;
	private String _ketQuaXuLy;
	private String _canCuPhapLy;
	private String _lePhi;
	private long _coQuanQlttId;
	private long _linhVucThuTucId;
	private Date _ngayCoHieuLuc;
	private Date _ngayHetHieuLuc;
	private String _huongDanThucHien;
}