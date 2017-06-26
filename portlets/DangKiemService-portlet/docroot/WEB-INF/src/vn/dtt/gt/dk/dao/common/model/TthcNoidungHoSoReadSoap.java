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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.common.service.http.TthcNoidungHoSoReadServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.http.TthcNoidungHoSoReadServiceSoap
 * @generated
 */
public class TthcNoidungHoSoReadSoap implements Serializable {
	public static TthcNoidungHoSoReadSoap toSoapModel(TthcNoidungHoSoRead model) {
		TthcNoidungHoSoReadSoap soapModel = new TthcNoidungHoSoReadSoap();

		soapModel.setId(model.getId());
		soapModel.setMaTuSinh(model.getMaTuSinh());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setTenTaiLieu(model.getTenTaiLieu());
		soapModel.setTaiLieuDinhKem(model.getTaiLieuDinhKem());
		soapModel.setNoiDungFile(model.getNoiDungFile());
		soapModel.setBieuMauHoSoId(model.getBieuMauHoSoId());
		soapModel.setNgayGuiNhan(model.getNgayGuiNhan());
		soapModel.setLoaiTaiLieu(model.getLoaiTaiLieu());
		soapModel.setNgayTao(model.getNgayTao());
		soapModel.setNguoiTao(model.getNguoiTao());
		soapModel.setDaCapNhat(model.getDaCapNhat());
		soapModel.setLanGuiCuoi(model.getLanGuiCuoi());
		soapModel.setVehicleRecordId(model.getVehicleRecordId());

		return soapModel;
	}

	public static TthcNoidungHoSoReadSoap[] toSoapModels(
		TthcNoidungHoSoRead[] models) {
		TthcNoidungHoSoReadSoap[] soapModels = new TthcNoidungHoSoReadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcNoidungHoSoReadSoap[][] toSoapModels(
		TthcNoidungHoSoRead[][] models) {
		TthcNoidungHoSoReadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcNoidungHoSoReadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcNoidungHoSoReadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcNoidungHoSoReadSoap[] toSoapModels(
		List<TthcNoidungHoSoRead> models) {
		List<TthcNoidungHoSoReadSoap> soapModels = new ArrayList<TthcNoidungHoSoReadSoap>(models.size());

		for (TthcNoidungHoSoRead model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcNoidungHoSoReadSoap[soapModels.size()]);
	}

	public TthcNoidungHoSoReadSoap() {
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

	public String getMaTuSinh() {
		return _MaTuSinh;
	}

	public void setMaTuSinh(String MaTuSinh) {
		_MaTuSinh = MaTuSinh;
	}

	public long getHoSoThuTucId() {
		return _HoSoThuTucId;
	}

	public void setHoSoThuTucId(long HoSoThuTucId) {
		_HoSoThuTucId = HoSoThuTucId;
	}

	public String getTenTaiLieu() {
		return _TenTaiLieu;
	}

	public void setTenTaiLieu(String TenTaiLieu) {
		_TenTaiLieu = TenTaiLieu;
	}

	public long getTaiLieuDinhKem() {
		return _TaiLieuDinhKem;
	}

	public void setTaiLieuDinhKem(long TaiLieuDinhKem) {
		_TaiLieuDinhKem = TaiLieuDinhKem;
	}

	public String getNoiDungFile() {
		return _noiDungFile;
	}

	public void setNoiDungFile(String noiDungFile) {
		_noiDungFile = noiDungFile;
	}

	public long getBieuMauHoSoId() {
		return _BieuMauHoSoId;
	}

	public void setBieuMauHoSoId(long BieuMauHoSoId) {
		_BieuMauHoSoId = BieuMauHoSoId;
	}

	public Date getNgayGuiNhan() {
		return _NgayGuiNhan;
	}

	public void setNgayGuiNhan(Date NgayGuiNhan) {
		_NgayGuiNhan = NgayGuiNhan;
	}

	public long getLoaiTaiLieu() {
		return _LoaiTaiLieu;
	}

	public void setLoaiTaiLieu(long LoaiTaiLieu) {
		_LoaiTaiLieu = LoaiTaiLieu;
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

	public long getDaCapNhat() {
		return _daCapNhat;
	}

	public void setDaCapNhat(long daCapNhat) {
		_daCapNhat = daCapNhat;
	}

	public long getLanGuiCuoi() {
		return _lanGuiCuoi;
	}

	public void setLanGuiCuoi(long lanGuiCuoi) {
		_lanGuiCuoi = lanGuiCuoi;
	}

	public long getVehicleRecordId() {
		return _vehicleRecordId;
	}

	public void setVehicleRecordId(long vehicleRecordId) {
		_vehicleRecordId = vehicleRecordId;
	}

	private long _Id;
	private String _MaTuSinh;
	private long _HoSoThuTucId;
	private String _TenTaiLieu;
	private long _TaiLieuDinhKem;
	private String _noiDungFile;
	private long _BieuMauHoSoId;
	private Date _NgayGuiNhan;
	private long _LoaiTaiLieu;
	private Date _NgayTao;
	private long _NguoiTao;
	private long _daCapNhat;
	private long _lanGuiCuoi;
	private long _vehicleRecordId;
}