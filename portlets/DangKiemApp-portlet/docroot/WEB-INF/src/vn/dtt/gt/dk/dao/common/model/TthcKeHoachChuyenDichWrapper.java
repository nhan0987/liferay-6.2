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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcKeHoachChuyenDich}.
 * </p>
 *
 * @author win_64
 * @see TthcKeHoachChuyenDich
 * @generated
 */
public class TthcKeHoachChuyenDichWrapper implements TthcKeHoachChuyenDich,
	ModelWrapper<TthcKeHoachChuyenDich> {
	public TthcKeHoachChuyenDichWrapper(
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		_tthcKeHoachChuyenDich = tthcKeHoachChuyenDich;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcKeHoachChuyenDich.class;
	}

	@Override
	public String getModelClassName() {
		return TthcKeHoachChuyenDich.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("messageId", getMessageId());
		attributes.put("messageStatus", getMessageStatus());
		attributes.put("trangThaiNguonId", getTrangThaiNguonId());
		attributes.put("dieuKienChuyenDich", getDieuKienChuyenDich());
		attributes.put("trangThaiDichId", getTrangThaiDichId());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("nhomPhieuXuLy", getNhomPhieuXuLy());
		attributes.put("hoanTat", getHoanTat());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("debitnoteNumber", getDebitnoteNumber());
		attributes.put("messageFunction", getMessageFunction());
		attributes.put("messageType", getMessageType());
		attributes.put("thoiDiemCapNhat", getThoiDiemCapNhat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long phieuXuLyChinhId = (Long)attributes.get("phieuXuLyChinhId");

		if (phieuXuLyChinhId != null) {
			setPhieuXuLyChinhId(phieuXuLyChinhId);
		}

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		String messageId = (String)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		String messageStatus = (String)attributes.get("messageStatus");

		if (messageStatus != null) {
			setMessageStatus(messageStatus);
		}

		Long trangThaiNguonId = (Long)attributes.get("trangThaiNguonId");

		if (trangThaiNguonId != null) {
			setTrangThaiNguonId(trangThaiNguonId);
		}

		String dieuKienChuyenDich = (String)attributes.get("dieuKienChuyenDich");

		if (dieuKienChuyenDich != null) {
			setDieuKienChuyenDich(dieuKienChuyenDich);
		}

		Long trangThaiDichId = (Long)attributes.get("trangThaiDichId");

		if (trangThaiDichId != null) {
			setTrangThaiDichId(trangThaiDichId);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}

		String nhomPhieuXuLy = (String)attributes.get("nhomPhieuXuLy");

		if (nhomPhieuXuLy != null) {
			setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		String hoanTat = (String)attributes.get("hoanTat");

		if (hoanTat != null) {
			setHoanTat(hoanTat);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		String debitnoteNumber = (String)attributes.get("debitnoteNumber");

		if (debitnoteNumber != null) {
			setDebitnoteNumber(debitnoteNumber);
		}

		String messageFunction = (String)attributes.get("messageFunction");

		if (messageFunction != null) {
			setMessageFunction(messageFunction);
		}

		String messageType = (String)attributes.get("messageType");

		if (messageType != null) {
			setMessageType(messageType);
		}

		Date thoiDiemCapNhat = (Date)attributes.get("thoiDiemCapNhat");

		if (thoiDiemCapNhat != null) {
			setThoiDiemCapNhat(thoiDiemCapNhat);
		}
	}

	/**
	* Returns the primary key of this tthc ke hoach chuyen dich.
	*
	* @return the primary key of this tthc ke hoach chuyen dich
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcKeHoachChuyenDich.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc ke hoach chuyen dich.
	*
	* @param primaryKey the primary key of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcKeHoachChuyenDich.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc ke hoach chuyen dich.
	*
	* @return the ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public long getId() {
		return _tthcKeHoachChuyenDich.getId();
	}

	/**
	* Sets the ID of this tthc ke hoach chuyen dich.
	*
	* @param id the ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setId(long id) {
		_tthcKeHoachChuyenDich.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this tthc ke hoach chuyen dich.
	*
	* @return the phieu xu ly chinh ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _tthcKeHoachChuyenDich.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this tthc ke hoach chuyen dich.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_tthcKeHoachChuyenDich.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the phieu xu ly phu ID of this tthc ke hoach chuyen dich.
	*
	* @return the phieu xu ly phu ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _tthcKeHoachChuyenDich.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this tthc ke hoach chuyen dich.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_tthcKeHoachChuyenDich.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the message ID of this tthc ke hoach chuyen dich.
	*
	* @return the message ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getMessageId() {
		return _tthcKeHoachChuyenDich.getMessageId();
	}

	/**
	* Sets the message ID of this tthc ke hoach chuyen dich.
	*
	* @param messageId the message ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setMessageId(java.lang.String messageId) {
		_tthcKeHoachChuyenDich.setMessageId(messageId);
	}

	/**
	* Returns the message status of this tthc ke hoach chuyen dich.
	*
	* @return the message status of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getMessageStatus() {
		return _tthcKeHoachChuyenDich.getMessageStatus();
	}

	/**
	* Sets the message status of this tthc ke hoach chuyen dich.
	*
	* @param messageStatus the message status of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setMessageStatus(java.lang.String messageStatus) {
		_tthcKeHoachChuyenDich.setMessageStatus(messageStatus);
	}

	/**
	* Returns the trang thai nguon ID of this tthc ke hoach chuyen dich.
	*
	* @return the trang thai nguon ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public long getTrangThaiNguonId() {
		return _tthcKeHoachChuyenDich.getTrangThaiNguonId();
	}

	/**
	* Sets the trang thai nguon ID of this tthc ke hoach chuyen dich.
	*
	* @param trangThaiNguonId the trang thai nguon ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setTrangThaiNguonId(long trangThaiNguonId) {
		_tthcKeHoachChuyenDich.setTrangThaiNguonId(trangThaiNguonId);
	}

	/**
	* Returns the dieu kien chuyen dich of this tthc ke hoach chuyen dich.
	*
	* @return the dieu kien chuyen dich of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getDieuKienChuyenDich() {
		return _tthcKeHoachChuyenDich.getDieuKienChuyenDich();
	}

	/**
	* Sets the dieu kien chuyen dich of this tthc ke hoach chuyen dich.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setDieuKienChuyenDich(java.lang.String dieuKienChuyenDich) {
		_tthcKeHoachChuyenDich.setDieuKienChuyenDich(dieuKienChuyenDich);
	}

	/**
	* Returns the trang thai dich ID of this tthc ke hoach chuyen dich.
	*
	* @return the trang thai dich ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public long getTrangThaiDichId() {
		return _tthcKeHoachChuyenDich.getTrangThaiDichId();
	}

	/**
	* Sets the trang thai dich ID of this tthc ke hoach chuyen dich.
	*
	* @param trangThaiDichId the trang thai dich ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setTrangThaiDichId(long trangThaiDichId) {
		_tthcKeHoachChuyenDich.setTrangThaiDichId(trangThaiDichId);
	}

	/**
	* Returns the phan nhom ho so ID of this tthc ke hoach chuyen dich.
	*
	* @return the phan nhom ho so ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _tthcKeHoachChuyenDich.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this tthc ke hoach chuyen dich.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_tthcKeHoachChuyenDich.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the nhom phieu xu ly of this tthc ke hoach chuyen dich.
	*
	* @return the nhom phieu xu ly of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getNhomPhieuXuLy() {
		return _tthcKeHoachChuyenDich.getNhomPhieuXuLy();
	}

	/**
	* Sets the nhom phieu xu ly of this tthc ke hoach chuyen dich.
	*
	* @param nhomPhieuXuLy the nhom phieu xu ly of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setNhomPhieuXuLy(java.lang.String nhomPhieuXuLy) {
		_tthcKeHoachChuyenDich.setNhomPhieuXuLy(nhomPhieuXuLy);
	}

	/**
	* Returns the hoan tat of this tthc ke hoach chuyen dich.
	*
	* @return the hoan tat of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getHoanTat() {
		return _tthcKeHoachChuyenDich.getHoanTat();
	}

	/**
	* Sets the hoan tat of this tthc ke hoach chuyen dich.
	*
	* @param hoanTat the hoan tat of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setHoanTat(java.lang.String hoanTat) {
		_tthcKeHoachChuyenDich.setHoanTat(hoanTat);
	}

	/**
	* Returns the ghi chu of this tthc ke hoach chuyen dich.
	*
	* @return the ghi chu of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _tthcKeHoachChuyenDich.getGhiChu();
	}

	/**
	* Sets the ghi chu of this tthc ke hoach chuyen dich.
	*
	* @param ghiChu the ghi chu of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_tthcKeHoachChuyenDich.setGhiChu(ghiChu);
	}

	/**
	* Returns the debitnote number of this tthc ke hoach chuyen dich.
	*
	* @return the debitnote number of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getDebitnoteNumber() {
		return _tthcKeHoachChuyenDich.getDebitnoteNumber();
	}

	/**
	* Sets the debitnote number of this tthc ke hoach chuyen dich.
	*
	* @param debitnoteNumber the debitnote number of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setDebitnoteNumber(java.lang.String debitnoteNumber) {
		_tthcKeHoachChuyenDich.setDebitnoteNumber(debitnoteNumber);
	}

	/**
	* Returns the message function of this tthc ke hoach chuyen dich.
	*
	* @return the message function of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getMessageFunction() {
		return _tthcKeHoachChuyenDich.getMessageFunction();
	}

	/**
	* Sets the message function of this tthc ke hoach chuyen dich.
	*
	* @param messageFunction the message function of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setMessageFunction(java.lang.String messageFunction) {
		_tthcKeHoachChuyenDich.setMessageFunction(messageFunction);
	}

	/**
	* Returns the message type of this tthc ke hoach chuyen dich.
	*
	* @return the message type of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.lang.String getMessageType() {
		return _tthcKeHoachChuyenDich.getMessageType();
	}

	/**
	* Sets the message type of this tthc ke hoach chuyen dich.
	*
	* @param messageType the message type of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setMessageType(java.lang.String messageType) {
		_tthcKeHoachChuyenDich.setMessageType(messageType);
	}

	/**
	* Returns the thoi diem cap nhat of this tthc ke hoach chuyen dich.
	*
	* @return the thoi diem cap nhat of this tthc ke hoach chuyen dich
	*/
	@Override
	public java.util.Date getThoiDiemCapNhat() {
		return _tthcKeHoachChuyenDich.getThoiDiemCapNhat();
	}

	/**
	* Sets the thoi diem cap nhat of this tthc ke hoach chuyen dich.
	*
	* @param thoiDiemCapNhat the thoi diem cap nhat of this tthc ke hoach chuyen dich
	*/
	@Override
	public void setThoiDiemCapNhat(java.util.Date thoiDiemCapNhat) {
		_tthcKeHoachChuyenDich.setThoiDiemCapNhat(thoiDiemCapNhat);
	}

	@Override
	public boolean isNew() {
		return _tthcKeHoachChuyenDich.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcKeHoachChuyenDich.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcKeHoachChuyenDich.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcKeHoachChuyenDich.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcKeHoachChuyenDich.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcKeHoachChuyenDich.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcKeHoachChuyenDich.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcKeHoachChuyenDich.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcKeHoachChuyenDich.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcKeHoachChuyenDich.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcKeHoachChuyenDich.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcKeHoachChuyenDichWrapper((TthcKeHoachChuyenDich)_tthcKeHoachChuyenDich.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		return _tthcKeHoachChuyenDich.compareTo(tthcKeHoachChuyenDich);
	}

	@Override
	public int hashCode() {
		return _tthcKeHoachChuyenDich.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> toCacheModel() {
		return _tthcKeHoachChuyenDich.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich toEscapedModel() {
		return new TthcKeHoachChuyenDichWrapper(_tthcKeHoachChuyenDich.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich toUnescapedModel() {
		return new TthcKeHoachChuyenDichWrapper(_tthcKeHoachChuyenDich.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcKeHoachChuyenDich.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcKeHoachChuyenDich.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcKeHoachChuyenDich.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcKeHoachChuyenDichWrapper)) {
			return false;
		}

		TthcKeHoachChuyenDichWrapper tthcKeHoachChuyenDichWrapper = (TthcKeHoachChuyenDichWrapper)obj;

		if (Validator.equals(_tthcKeHoachChuyenDich,
					tthcKeHoachChuyenDichWrapper._tthcKeHoachChuyenDich)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcKeHoachChuyenDich getWrappedTthcKeHoachChuyenDich() {
		return _tthcKeHoachChuyenDich;
	}

	@Override
	public TthcKeHoachChuyenDich getWrappedModel() {
		return _tthcKeHoachChuyenDich;
	}

	@Override
	public void resetOriginalValues() {
		_tthcKeHoachChuyenDich.resetOriginalValues();
	}

	private TthcKeHoachChuyenDich _tthcKeHoachChuyenDich;
}