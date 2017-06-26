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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MotCuaChuyenDichTrangThai}.
 * </p>
 *
 * @author huymq
 * @see MotCuaChuyenDichTrangThai
 * @generated
 */
public class MotCuaChuyenDichTrangThaiWrapper
	implements MotCuaChuyenDichTrangThai,
		ModelWrapper<MotCuaChuyenDichTrangThai> {
	public MotCuaChuyenDichTrangThaiWrapper(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		_motCuaChuyenDichTrangThai = motCuaChuyenDichTrangThai;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaChuyenDichTrangThai.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaChuyenDichTrangThai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("trangThaiNguonId", getTrangThaiNguonId());
		attributes.put("trangThaiDichId", getTrangThaiDichId());
		attributes.put("dieuKienChuyenDich", getDieuKienChuyenDich());
		attributes.put("hanhDongXuLy", getHanhDongXuLy());
		attributes.put("soNgayXuLy", getSoNgayXuLy());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long trangThaiNguonId = (Long)attributes.get("trangThaiNguonId");

		if (trangThaiNguonId != null) {
			setTrangThaiNguonId(trangThaiNguonId);
		}

		Long trangThaiDichId = (Long)attributes.get("trangThaiDichId");

		if (trangThaiDichId != null) {
			setTrangThaiDichId(trangThaiDichId);
		}

		String dieuKienChuyenDich = (String)attributes.get("dieuKienChuyenDich");

		if (dieuKienChuyenDich != null) {
			setDieuKienChuyenDich(dieuKienChuyenDich);
		}

		String hanhDongXuLy = (String)attributes.get("hanhDongXuLy");

		if (hanhDongXuLy != null) {
			setHanhDongXuLy(hanhDongXuLy);
		}

		Integer soNgayXuLy = (Integer)attributes.get("soNgayXuLy");

		if (soNgayXuLy != null) {
			setSoNgayXuLy(soNgayXuLy);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}
	}

	/**
	* Returns the primary key of this mot cua chuyen dich trang thai.
	*
	* @return the primary key of this mot cua chuyen dich trang thai
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaChuyenDichTrangThai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua chuyen dich trang thai.
	*
	* @param primaryKey the primary key of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaChuyenDichTrangThai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua chuyen dich trang thai.
	*
	* @return the ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public long getId() {
		return _motCuaChuyenDichTrangThai.getId();
	}

	/**
	* Sets the ID of this mot cua chuyen dich trang thai.
	*
	* @param id the ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setId(long id) {
		_motCuaChuyenDichTrangThai.setId(id);
	}

	/**
	* Returns the trang thai nguon ID of this mot cua chuyen dich trang thai.
	*
	* @return the trang thai nguon ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public long getTrangThaiNguonId() {
		return _motCuaChuyenDichTrangThai.getTrangThaiNguonId();
	}

	/**
	* Sets the trang thai nguon ID of this mot cua chuyen dich trang thai.
	*
	* @param trangThaiNguonId the trang thai nguon ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setTrangThaiNguonId(long trangThaiNguonId) {
		_motCuaChuyenDichTrangThai.setTrangThaiNguonId(trangThaiNguonId);
	}

	/**
	* Returns the trang thai dich ID of this mot cua chuyen dich trang thai.
	*
	* @return the trang thai dich ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public long getTrangThaiDichId() {
		return _motCuaChuyenDichTrangThai.getTrangThaiDichId();
	}

	/**
	* Sets the trang thai dich ID of this mot cua chuyen dich trang thai.
	*
	* @param trangThaiDichId the trang thai dich ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setTrangThaiDichId(long trangThaiDichId) {
		_motCuaChuyenDichTrangThai.setTrangThaiDichId(trangThaiDichId);
	}

	/**
	* Returns the dieu kien chuyen dich of this mot cua chuyen dich trang thai.
	*
	* @return the dieu kien chuyen dich of this mot cua chuyen dich trang thai
	*/
	@Override
	public java.lang.String getDieuKienChuyenDich() {
		return _motCuaChuyenDichTrangThai.getDieuKienChuyenDich();
	}

	/**
	* Sets the dieu kien chuyen dich of this mot cua chuyen dich trang thai.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setDieuKienChuyenDich(java.lang.String dieuKienChuyenDich) {
		_motCuaChuyenDichTrangThai.setDieuKienChuyenDich(dieuKienChuyenDich);
	}

	/**
	* Returns the hanh dong xu ly of this mot cua chuyen dich trang thai.
	*
	* @return the hanh dong xu ly of this mot cua chuyen dich trang thai
	*/
	@Override
	public java.lang.String getHanhDongXuLy() {
		return _motCuaChuyenDichTrangThai.getHanhDongXuLy();
	}

	/**
	* Sets the hanh dong xu ly of this mot cua chuyen dich trang thai.
	*
	* @param hanhDongXuLy the hanh dong xu ly of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setHanhDongXuLy(java.lang.String hanhDongXuLy) {
		_motCuaChuyenDichTrangThai.setHanhDongXuLy(hanhDongXuLy);
	}

	/**
	* Returns the so ngay xu ly of this mot cua chuyen dich trang thai.
	*
	* @return the so ngay xu ly of this mot cua chuyen dich trang thai
	*/
	@Override
	public int getSoNgayXuLy() {
		return _motCuaChuyenDichTrangThai.getSoNgayXuLy();
	}

	/**
	* Sets the so ngay xu ly of this mot cua chuyen dich trang thai.
	*
	* @param soNgayXuLy the so ngay xu ly of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setSoNgayXuLy(int soNgayXuLy) {
		_motCuaChuyenDichTrangThai.setSoNgayXuLy(soNgayXuLy);
	}

	/**
	* Returns the phan nhom ho so ID of this mot cua chuyen dich trang thai.
	*
	* @return the phan nhom ho so ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _motCuaChuyenDichTrangThai.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this mot cua chuyen dich trang thai.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this mot cua chuyen dich trang thai
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_motCuaChuyenDichTrangThai.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	@Override
	public boolean isNew() {
		return _motCuaChuyenDichTrangThai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaChuyenDichTrangThai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaChuyenDichTrangThai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaChuyenDichTrangThai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaChuyenDichTrangThai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaChuyenDichTrangThai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaChuyenDichTrangThai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaChuyenDichTrangThai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaChuyenDichTrangThai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaChuyenDichTrangThai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaChuyenDichTrangThai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaChuyenDichTrangThaiWrapper((MotCuaChuyenDichTrangThai)_motCuaChuyenDichTrangThai.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		return _motCuaChuyenDichTrangThai.compareTo(motCuaChuyenDichTrangThai);
	}

	@Override
	public int hashCode() {
		return _motCuaChuyenDichTrangThai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> toCacheModel() {
		return _motCuaChuyenDichTrangThai.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai toEscapedModel() {
		return new MotCuaChuyenDichTrangThaiWrapper(_motCuaChuyenDichTrangThai.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai toUnescapedModel() {
		return new MotCuaChuyenDichTrangThaiWrapper(_motCuaChuyenDichTrangThai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaChuyenDichTrangThai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaChuyenDichTrangThai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaChuyenDichTrangThai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaChuyenDichTrangThaiWrapper)) {
			return false;
		}

		MotCuaChuyenDichTrangThaiWrapper motCuaChuyenDichTrangThaiWrapper = (MotCuaChuyenDichTrangThaiWrapper)obj;

		if (Validator.equals(_motCuaChuyenDichTrangThai,
					motCuaChuyenDichTrangThaiWrapper._motCuaChuyenDichTrangThai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaChuyenDichTrangThai getWrappedMotCuaChuyenDichTrangThai() {
		return _motCuaChuyenDichTrangThai;
	}

	@Override
	public MotCuaChuyenDichTrangThai getWrappedModel() {
		return _motCuaChuyenDichTrangThai;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaChuyenDichTrangThai.resetOriginalValues();
	}

	private MotCuaChuyenDichTrangThai _motCuaChuyenDichTrangThai;
}