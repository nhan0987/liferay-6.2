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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcDonViThucHien}.
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHien
 * @generated
 */
public class TthcDonViThucHienWrapper implements TthcDonViThucHien,
	ModelWrapper<TthcDonViThucHien> {
	public TthcDonViThucHienWrapper(TthcDonViThucHien tthcDonViThucHien) {
		_tthcDonViThucHien = tthcDonViThucHien;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcDonViThucHien.class;
	}

	@Override
	public String getModelClassName() {
		return TthcDonViThucHien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("ThuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("MaDvth", getMaDvth());
		attributes.put("TenDvth", getTenDvth());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("ToChuc", getToChuc());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long ThuTucHanhChinhId = (Long)attributes.get("ThuTucHanhChinhId");

		if (ThuTucHanhChinhId != null) {
			setThuTucHanhChinhId(ThuTucHanhChinhId);
		}

		String MaDvth = (String)attributes.get("MaDvth");

		if (MaDvth != null) {
			setMaDvth(MaDvth);
		}

		String TenDvth = (String)attributes.get("TenDvth");

		if (TenDvth != null) {
			setTenDvth(TenDvth);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long ToChuc = (Long)attributes.get("ToChuc");

		if (ToChuc != null) {
			setToChuc(ToChuc);
		}
	}

	/**
	* Returns the primary key of this tthc don vi thuc hien.
	*
	* @return the primary key of this tthc don vi thuc hien
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcDonViThucHien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc don vi thuc hien.
	*
	* @param primaryKey the primary key of this tthc don vi thuc hien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcDonViThucHien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc don vi thuc hien.
	*
	* @return the ID of this tthc don vi thuc hien
	*/
	@Override
	public long getId() {
		return _tthcDonViThucHien.getId();
	}

	/**
	* Sets the ID of this tthc don vi thuc hien.
	*
	* @param Id the ID of this tthc don vi thuc hien
	*/
	@Override
	public void setId(long Id) {
		_tthcDonViThucHien.setId(Id);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this tthc don vi thuc hien.
	*
	* @return the thu tuc hanh chinh ID of this tthc don vi thuc hien
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _tthcDonViThucHien.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this tthc don vi thuc hien.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID of this tthc don vi thuc hien
	*/
	@Override
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_tthcDonViThucHien.setThuTucHanhChinhId(ThuTucHanhChinhId);
	}

	/**
	* Returns the ma dvth of this tthc don vi thuc hien.
	*
	* @return the ma dvth of this tthc don vi thuc hien
	*/
	@Override
	public java.lang.String getMaDvth() {
		return _tthcDonViThucHien.getMaDvth();
	}

	/**
	* Sets the ma dvth of this tthc don vi thuc hien.
	*
	* @param MaDvth the ma dvth of this tthc don vi thuc hien
	*/
	@Override
	public void setMaDvth(java.lang.String MaDvth) {
		_tthcDonViThucHien.setMaDvth(MaDvth);
	}

	/**
	* Returns the ten dvth of this tthc don vi thuc hien.
	*
	* @return the ten dvth of this tthc don vi thuc hien
	*/
	@Override
	public java.lang.String getTenDvth() {
		return _tthcDonViThucHien.getTenDvth();
	}

	/**
	* Sets the ten dvth of this tthc don vi thuc hien.
	*
	* @param TenDvth the ten dvth of this tthc don vi thuc hien
	*/
	@Override
	public void setTenDvth(java.lang.String TenDvth) {
		_tthcDonViThucHien.setTenDvth(TenDvth);
	}

	/**
	* Returns the ten tieng anh of this tthc don vi thuc hien.
	*
	* @return the ten tieng anh of this tthc don vi thuc hien
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _tthcDonViThucHien.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this tthc don vi thuc hien.
	*
	* @param TenTiengAnh the ten tieng anh of this tthc don vi thuc hien
	*/
	@Override
	public void setTenTiengAnh(java.lang.String TenTiengAnh) {
		_tthcDonViThucHien.setTenTiengAnh(TenTiengAnh);
	}

	/**
	* Returns the to chuc of this tthc don vi thuc hien.
	*
	* @return the to chuc of this tthc don vi thuc hien
	*/
	@Override
	public long getToChuc() {
		return _tthcDonViThucHien.getToChuc();
	}

	/**
	* Sets the to chuc of this tthc don vi thuc hien.
	*
	* @param ToChuc the to chuc of this tthc don vi thuc hien
	*/
	@Override
	public void setToChuc(long ToChuc) {
		_tthcDonViThucHien.setToChuc(ToChuc);
	}

	@Override
	public boolean isNew() {
		return _tthcDonViThucHien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcDonViThucHien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcDonViThucHien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcDonViThucHien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcDonViThucHien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcDonViThucHien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcDonViThucHien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcDonViThucHien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcDonViThucHien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcDonViThucHien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcDonViThucHien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcDonViThucHienWrapper((TthcDonViThucHien)_tthcDonViThucHien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien tthcDonViThucHien) {
		return _tthcDonViThucHien.compareTo(tthcDonViThucHien);
	}

	@Override
	public int hashCode() {
		return _tthcDonViThucHien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien> toCacheModel() {
		return _tthcDonViThucHien.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien toEscapedModel() {
		return new TthcDonViThucHienWrapper(_tthcDonViThucHien.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien toUnescapedModel() {
		return new TthcDonViThucHienWrapper(_tthcDonViThucHien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcDonViThucHien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcDonViThucHien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcDonViThucHien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcDonViThucHienWrapper)) {
			return false;
		}

		TthcDonViThucHienWrapper tthcDonViThucHienWrapper = (TthcDonViThucHienWrapper)obj;

		if (Validator.equals(_tthcDonViThucHien,
					tthcDonViThucHienWrapper._tthcDonViThucHien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcDonViThucHien getWrappedTthcDonViThucHien() {
		return _tthcDonViThucHien;
	}

	@Override
	public TthcDonViThucHien getWrappedModel() {
		return _tthcDonViThucHien;
	}

	@Override
	public void resetOriginalValues() {
		_tthcDonViThucHien.resetOriginalValues();
	}

	private TthcDonViThucHien _tthcDonViThucHien;
}