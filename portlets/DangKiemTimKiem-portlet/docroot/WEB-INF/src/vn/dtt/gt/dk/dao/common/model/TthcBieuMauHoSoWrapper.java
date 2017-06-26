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
 * This class is a wrapper for {@link TthcBieuMauHoSo}.
 * </p>
 *
 * @author win_64
 * @see TthcBieuMauHoSo
 * @generated
 */
public class TthcBieuMauHoSoWrapper implements TthcBieuMauHoSo,
	ModelWrapper<TthcBieuMauHoSo> {
	public TthcBieuMauHoSoWrapper(TthcBieuMauHoSo tthcBieuMauHoSo) {
		_tthcBieuMauHoSo = tthcBieuMauHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcBieuMauHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcBieuMauHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MaBieuMau", getMaBieuMau());
		attributes.put("TenBieuMau", getTenBieuMau());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("TaiLieuMau", getTaiLieuMau());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaBieuMau = (String)attributes.get("MaBieuMau");

		if (MaBieuMau != null) {
			setMaBieuMau(MaBieuMau);
		}

		String TenBieuMau = (String)attributes.get("TenBieuMau");

		if (TenBieuMau != null) {
			setTenBieuMau(TenBieuMau);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long TaiLieuMau = (Long)attributes.get("TaiLieuMau");

		if (TaiLieuMau != null) {
			setTaiLieuMau(TaiLieuMau);
		}
	}

	/**
	* Returns the primary key of this tthc bieu mau ho so.
	*
	* @return the primary key of this tthc bieu mau ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcBieuMauHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc bieu mau ho so.
	*
	* @param primaryKey the primary key of this tthc bieu mau ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcBieuMauHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc bieu mau ho so.
	*
	* @return the ID of this tthc bieu mau ho so
	*/
	@Override
	public long getId() {
		return _tthcBieuMauHoSo.getId();
	}

	/**
	* Sets the ID of this tthc bieu mau ho so.
	*
	* @param Id the ID of this tthc bieu mau ho so
	*/
	@Override
	public void setId(long Id) {
		_tthcBieuMauHoSo.setId(Id);
	}

	/**
	* Returns the ma bieu mau of this tthc bieu mau ho so.
	*
	* @return the ma bieu mau of this tthc bieu mau ho so
	*/
	@Override
	public java.lang.String getMaBieuMau() {
		return _tthcBieuMauHoSo.getMaBieuMau();
	}

	/**
	* Sets the ma bieu mau of this tthc bieu mau ho so.
	*
	* @param MaBieuMau the ma bieu mau of this tthc bieu mau ho so
	*/
	@Override
	public void setMaBieuMau(java.lang.String MaBieuMau) {
		_tthcBieuMauHoSo.setMaBieuMau(MaBieuMau);
	}

	/**
	* Returns the ten bieu mau of this tthc bieu mau ho so.
	*
	* @return the ten bieu mau of this tthc bieu mau ho so
	*/
	@Override
	public java.lang.String getTenBieuMau() {
		return _tthcBieuMauHoSo.getTenBieuMau();
	}

	/**
	* Sets the ten bieu mau of this tthc bieu mau ho so.
	*
	* @param TenBieuMau the ten bieu mau of this tthc bieu mau ho so
	*/
	@Override
	public void setTenBieuMau(java.lang.String TenBieuMau) {
		_tthcBieuMauHoSo.setTenBieuMau(TenBieuMau);
	}

	/**
	* Returns the ten tieng anh of this tthc bieu mau ho so.
	*
	* @return the ten tieng anh of this tthc bieu mau ho so
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _tthcBieuMauHoSo.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this tthc bieu mau ho so.
	*
	* @param TenTiengAnh the ten tieng anh of this tthc bieu mau ho so
	*/
	@Override
	public void setTenTiengAnh(java.lang.String TenTiengAnh) {
		_tthcBieuMauHoSo.setTenTiengAnh(TenTiengAnh);
	}

	/**
	* Returns the tai lieu mau of this tthc bieu mau ho so.
	*
	* @return the tai lieu mau of this tthc bieu mau ho so
	*/
	@Override
	public long getTaiLieuMau() {
		return _tthcBieuMauHoSo.getTaiLieuMau();
	}

	/**
	* Sets the tai lieu mau of this tthc bieu mau ho so.
	*
	* @param TaiLieuMau the tai lieu mau of this tthc bieu mau ho so
	*/
	@Override
	public void setTaiLieuMau(long TaiLieuMau) {
		_tthcBieuMauHoSo.setTaiLieuMau(TaiLieuMau);
	}

	@Override
	public boolean isNew() {
		return _tthcBieuMauHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcBieuMauHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcBieuMauHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcBieuMauHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcBieuMauHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcBieuMauHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcBieuMauHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcBieuMauHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcBieuMauHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcBieuMauHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcBieuMauHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcBieuMauHoSoWrapper((TthcBieuMauHoSo)_tthcBieuMauHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo tthcBieuMauHoSo) {
		return _tthcBieuMauHoSo.compareTo(tthcBieuMauHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcBieuMauHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo> toCacheModel() {
		return _tthcBieuMauHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo toEscapedModel() {
		return new TthcBieuMauHoSoWrapper(_tthcBieuMauHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo toUnescapedModel() {
		return new TthcBieuMauHoSoWrapper(_tthcBieuMauHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcBieuMauHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcBieuMauHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcBieuMauHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcBieuMauHoSoWrapper)) {
			return false;
		}

		TthcBieuMauHoSoWrapper tthcBieuMauHoSoWrapper = (TthcBieuMauHoSoWrapper)obj;

		if (Validator.equals(_tthcBieuMauHoSo,
					tthcBieuMauHoSoWrapper._tthcBieuMauHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcBieuMauHoSo getWrappedTthcBieuMauHoSo() {
		return _tthcBieuMauHoSo;
	}

	@Override
	public TthcBieuMauHoSo getWrappedModel() {
		return _tthcBieuMauHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcBieuMauHoSo.resetOriginalValues();
	}

	private TthcBieuMauHoSo _tthcBieuMauHoSo;
}