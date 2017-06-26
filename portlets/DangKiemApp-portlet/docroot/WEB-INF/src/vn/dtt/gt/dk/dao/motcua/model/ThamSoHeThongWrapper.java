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
 * This class is a wrapper for {@link ThamSoHeThong}.
 * </p>
 *
 * @author win_64
 * @see ThamSoHeThong
 * @generated
 */
public class ThamSoHeThongWrapper implements ThamSoHeThong,
	ModelWrapper<ThamSoHeThong> {
	public ThamSoHeThongWrapper(ThamSoHeThong thamSoHeThong) {
		_thamSoHeThong = thamSoHeThong;
	}

	@Override
	public Class<?> getModelClass() {
		return ThamSoHeThong.class;
	}

	@Override
	public String getModelClassName() {
		return ThamSoHeThong.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("valueData", getValueData());
		attributes.put("keyData", getKeyData());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String valueData = (String)attributes.get("valueData");

		if (valueData != null) {
			setValueData(valueData);
		}

		String keyData = (String)attributes.get("keyData");

		if (keyData != null) {
			setKeyData(keyData);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this tham so he thong.
	*
	* @return the primary key of this tham so he thong
	*/
	@Override
	public long getPrimaryKey() {
		return _thamSoHeThong.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tham so he thong.
	*
	* @param primaryKey the primary key of this tham so he thong
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thamSoHeThong.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tham so he thong.
	*
	* @return the ID of this tham so he thong
	*/
	@Override
	public long getId() {
		return _thamSoHeThong.getId();
	}

	/**
	* Sets the ID of this tham so he thong.
	*
	* @param id the ID of this tham so he thong
	*/
	@Override
	public void setId(long id) {
		_thamSoHeThong.setId(id);
	}

	/**
	* Returns the value data of this tham so he thong.
	*
	* @return the value data of this tham so he thong
	*/
	@Override
	public java.lang.String getValueData() {
		return _thamSoHeThong.getValueData();
	}

	/**
	* Sets the value data of this tham so he thong.
	*
	* @param valueData the value data of this tham so he thong
	*/
	@Override
	public void setValueData(java.lang.String valueData) {
		_thamSoHeThong.setValueData(valueData);
	}

	/**
	* Returns the key data of this tham so he thong.
	*
	* @return the key data of this tham so he thong
	*/
	@Override
	public java.lang.String getKeyData() {
		return _thamSoHeThong.getKeyData();
	}

	/**
	* Sets the key data of this tham so he thong.
	*
	* @param keyData the key data of this tham so he thong
	*/
	@Override
	public void setKeyData(java.lang.String keyData) {
		_thamSoHeThong.setKeyData(keyData);
	}

	/**
	* Returns the description of this tham so he thong.
	*
	* @return the description of this tham so he thong
	*/
	@Override
	public java.lang.String getDescription() {
		return _thamSoHeThong.getDescription();
	}

	/**
	* Sets the description of this tham so he thong.
	*
	* @param description the description of this tham so he thong
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_thamSoHeThong.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _thamSoHeThong.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thamSoHeThong.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thamSoHeThong.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thamSoHeThong.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thamSoHeThong.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thamSoHeThong.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thamSoHeThong.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thamSoHeThong.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thamSoHeThong.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thamSoHeThong.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thamSoHeThong.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ThamSoHeThongWrapper((ThamSoHeThong)_thamSoHeThong.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong thamSoHeThong) {
		return _thamSoHeThong.compareTo(thamSoHeThong);
	}

	@Override
	public int hashCode() {
		return _thamSoHeThong.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong> toCacheModel() {
		return _thamSoHeThong.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong toEscapedModel() {
		return new ThamSoHeThongWrapper(_thamSoHeThong.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong toUnescapedModel() {
		return new ThamSoHeThongWrapper(_thamSoHeThong.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thamSoHeThong.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thamSoHeThong.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thamSoHeThong.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ThamSoHeThongWrapper)) {
			return false;
		}

		ThamSoHeThongWrapper thamSoHeThongWrapper = (ThamSoHeThongWrapper)obj;

		if (Validator.equals(_thamSoHeThong, thamSoHeThongWrapper._thamSoHeThong)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ThamSoHeThong getWrappedThamSoHeThong() {
		return _thamSoHeThong;
	}

	@Override
	public ThamSoHeThong getWrappedModel() {
		return _thamSoHeThong;
	}

	@Override
	public void resetOriginalValues() {
		_thamSoHeThong.resetOriginalValues();
	}

	private ThamSoHeThong _thamSoHeThong;
}