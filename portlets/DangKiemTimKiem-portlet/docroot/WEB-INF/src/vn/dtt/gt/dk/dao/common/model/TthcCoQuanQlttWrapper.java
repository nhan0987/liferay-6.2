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
 * This class is a wrapper for {@link TthcCoQuanQltt}.
 * </p>
 *
 * @author win_64
 * @see TthcCoQuanQltt
 * @generated
 */
public class TthcCoQuanQlttWrapper implements TthcCoQuanQltt,
	ModelWrapper<TthcCoQuanQltt> {
	public TthcCoQuanQlttWrapper(TthcCoQuanQltt tthcCoQuanQltt) {
		_tthcCoQuanQltt = tthcCoQuanQltt;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcCoQuanQltt.class;
	}

	@Override
	public String getModelClassName() {
		return TthcCoQuanQltt.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("TenCoQuanQltt", getTenCoQuanQltt());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("IdCha", getIdCha());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String TenCoQuanQltt = (String)attributes.get("TenCoQuanQltt");

		if (TenCoQuanQltt != null) {
			setTenCoQuanQltt(TenCoQuanQltt);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long IdCha = (Long)attributes.get("IdCha");

		if (IdCha != null) {
			setIdCha(IdCha);
		}
	}

	/**
	* Returns the primary key of this tthc co quan qltt.
	*
	* @return the primary key of this tthc co quan qltt
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcCoQuanQltt.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc co quan qltt.
	*
	* @param primaryKey the primary key of this tthc co quan qltt
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcCoQuanQltt.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc co quan qltt.
	*
	* @return the ID of this tthc co quan qltt
	*/
	@Override
	public long getId() {
		return _tthcCoQuanQltt.getId();
	}

	/**
	* Sets the ID of this tthc co quan qltt.
	*
	* @param Id the ID of this tthc co quan qltt
	*/
	@Override
	public void setId(long Id) {
		_tthcCoQuanQltt.setId(Id);
	}

	/**
	* Returns the ten co quan qltt of this tthc co quan qltt.
	*
	* @return the ten co quan qltt of this tthc co quan qltt
	*/
	@Override
	public java.lang.String getTenCoQuanQltt() {
		return _tthcCoQuanQltt.getTenCoQuanQltt();
	}

	/**
	* Sets the ten co quan qltt of this tthc co quan qltt.
	*
	* @param TenCoQuanQltt the ten co quan qltt of this tthc co quan qltt
	*/
	@Override
	public void setTenCoQuanQltt(java.lang.String TenCoQuanQltt) {
		_tthcCoQuanQltt.setTenCoQuanQltt(TenCoQuanQltt);
	}

	/**
	* Returns the ten tieng anh of this tthc co quan qltt.
	*
	* @return the ten tieng anh of this tthc co quan qltt
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _tthcCoQuanQltt.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this tthc co quan qltt.
	*
	* @param TenTiengAnh the ten tieng anh of this tthc co quan qltt
	*/
	@Override
	public void setTenTiengAnh(java.lang.String TenTiengAnh) {
		_tthcCoQuanQltt.setTenTiengAnh(TenTiengAnh);
	}

	/**
	* Returns the id cha of this tthc co quan qltt.
	*
	* @return the id cha of this tthc co quan qltt
	*/
	@Override
	public long getIdCha() {
		return _tthcCoQuanQltt.getIdCha();
	}

	/**
	* Sets the id cha of this tthc co quan qltt.
	*
	* @param IdCha the id cha of this tthc co quan qltt
	*/
	@Override
	public void setIdCha(long IdCha) {
		_tthcCoQuanQltt.setIdCha(IdCha);
	}

	@Override
	public boolean isNew() {
		return _tthcCoQuanQltt.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcCoQuanQltt.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcCoQuanQltt.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcCoQuanQltt.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcCoQuanQltt.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcCoQuanQltt.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcCoQuanQltt.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcCoQuanQltt.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcCoQuanQltt.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcCoQuanQltt.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcCoQuanQltt.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcCoQuanQlttWrapper((TthcCoQuanQltt)_tthcCoQuanQltt.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt tthcCoQuanQltt) {
		return _tthcCoQuanQltt.compareTo(tthcCoQuanQltt);
	}

	@Override
	public int hashCode() {
		return _tthcCoQuanQltt.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt> toCacheModel() {
		return _tthcCoQuanQltt.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt toEscapedModel() {
		return new TthcCoQuanQlttWrapper(_tthcCoQuanQltt.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt toUnescapedModel() {
		return new TthcCoQuanQlttWrapper(_tthcCoQuanQltt.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcCoQuanQltt.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcCoQuanQltt.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcCoQuanQltt.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcCoQuanQlttWrapper)) {
			return false;
		}

		TthcCoQuanQlttWrapper tthcCoQuanQlttWrapper = (TthcCoQuanQlttWrapper)obj;

		if (Validator.equals(_tthcCoQuanQltt,
					tthcCoQuanQlttWrapper._tthcCoQuanQltt)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcCoQuanQltt getWrappedTthcCoQuanQltt() {
		return _tthcCoQuanQltt;
	}

	@Override
	public TthcCoQuanQltt getWrappedModel() {
		return _tthcCoQuanQltt;
	}

	@Override
	public void resetOriginalValues() {
		_tthcCoQuanQltt.resetOriginalValues();
	}

	private TthcCoQuanQltt _tthcCoQuanQltt;
}