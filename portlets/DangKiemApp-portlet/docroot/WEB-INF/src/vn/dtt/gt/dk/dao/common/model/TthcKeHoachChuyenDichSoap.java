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
public class TthcKeHoachChuyenDichSoap implements Serializable {
	public static TthcKeHoachChuyenDichSoap toSoapModel(
		TthcKeHoachChuyenDich model) {
		TthcKeHoachChuyenDichSoap soapModel = new TthcKeHoachChuyenDichSoap();

		soapModel.setId(model.getId());
		soapModel.setPhieuXuLyChinhId(model.getPhieuXuLyChinhId());
		soapModel.setPhieuXuLyPhuId(model.getPhieuXuLyPhuId());
		soapModel.setMessageId(model.getMessageId());
		soapModel.setMessageStatus(model.getMessageStatus());
		soapModel.setTrangThaiNguonId(model.getTrangThaiNguonId());
		soapModel.setDieuKienChuyenDich(model.getDieuKienChuyenDich());
		soapModel.setTrangThaiDichId(model.getTrangThaiDichId());
		soapModel.setPhanNhomHoSoId(model.getPhanNhomHoSoId());
		soapModel.setNhomPhieuXuLy(model.getNhomPhieuXuLy());
		soapModel.setHoanTat(model.getHoanTat());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setDebitnoteNumber(model.getDebitnoteNumber());
		soapModel.setMessageFunction(model.getMessageFunction());
		soapModel.setMessageType(model.getMessageType());
		soapModel.setThoiDiemCapNhat(model.getThoiDiemCapNhat());

		return soapModel;
	}

	public static TthcKeHoachChuyenDichSoap[] toSoapModels(
		TthcKeHoachChuyenDich[] models) {
		TthcKeHoachChuyenDichSoap[] soapModels = new TthcKeHoachChuyenDichSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TthcKeHoachChuyenDichSoap[][] toSoapModels(
		TthcKeHoachChuyenDich[][] models) {
		TthcKeHoachChuyenDichSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TthcKeHoachChuyenDichSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TthcKeHoachChuyenDichSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TthcKeHoachChuyenDichSoap[] toSoapModels(
		List<TthcKeHoachChuyenDich> models) {
		List<TthcKeHoachChuyenDichSoap> soapModels = new ArrayList<TthcKeHoachChuyenDichSoap>(models.size());

		for (TthcKeHoachChuyenDich model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TthcKeHoachChuyenDichSoap[soapModels.size()]);
	}

	public TthcKeHoachChuyenDichSoap() {
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

	public String getMessageId() {
		return _messageId;
	}

	public void setMessageId(String messageId) {
		_messageId = messageId;
	}

	public String getMessageStatus() {
		return _messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		_messageStatus = messageStatus;
	}

	public long getTrangThaiNguonId() {
		return _trangThaiNguonId;
	}

	public void setTrangThaiNguonId(long trangThaiNguonId) {
		_trangThaiNguonId = trangThaiNguonId;
	}

	public String getDieuKienChuyenDich() {
		return _dieuKienChuyenDich;
	}

	public void setDieuKienChuyenDich(String dieuKienChuyenDich) {
		_dieuKienChuyenDich = dieuKienChuyenDich;
	}

	public long getTrangThaiDichId() {
		return _trangThaiDichId;
	}

	public void setTrangThaiDichId(long trangThaiDichId) {
		_trangThaiDichId = trangThaiDichId;
	}

	public long getPhanNhomHoSoId() {
		return _phanNhomHoSoId;
	}

	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanNhomHoSoId = phanNhomHoSoId;
	}

	public String getNhomPhieuXuLy() {
		return _nhomPhieuXuLy;
	}

	public void setNhomPhieuXuLy(String nhomPhieuXuLy) {
		_nhomPhieuXuLy = nhomPhieuXuLy;
	}

	public String getHoanTat() {
		return _hoanTat;
	}

	public void setHoanTat(String hoanTat) {
		_hoanTat = hoanTat;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public String getDebitnoteNumber() {
		return _debitnoteNumber;
	}

	public void setDebitnoteNumber(String debitnoteNumber) {
		_debitnoteNumber = debitnoteNumber;
	}

	public String getMessageFunction() {
		return _messageFunction;
	}

	public void setMessageFunction(String messageFunction) {
		_messageFunction = messageFunction;
	}

	public String getMessageType() {
		return _messageType;
	}

	public void setMessageType(String messageType) {
		_messageType = messageType;
	}

	public Date getThoiDiemCapNhat() {
		return _thoiDiemCapNhat;
	}

	public void setThoiDiemCapNhat(Date thoiDiemCapNhat) {
		_thoiDiemCapNhat = thoiDiemCapNhat;
	}

	private long _id;
	private long _phieuXuLyChinhId;
	private long _phieuXuLyPhuId;
	private String _messageId;
	private String _messageStatus;
	private long _trangThaiNguonId;
	private String _dieuKienChuyenDich;
	private long _trangThaiDichId;
	private long _phanNhomHoSoId;
	private String _nhomPhieuXuLy;
	private String _hoanTat;
	private String _ghiChu;
	private String _debitnoteNumber;
	private String _messageFunction;
	private String _messageType;
	private Date _thoiDiemCapNhat;
}