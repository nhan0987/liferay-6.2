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
 * This class is a wrapper for {@link TthcLinhVucThuTuc}.
 * </p>
 *
 * @author win_64
 * @see TthcLinhVucThuTuc
 * @generated
 */
public class TthcLinhVucThuTucWrapper implements TthcLinhVucThuTuc,
	ModelWrapper<TthcLinhVucThuTuc> {
	public TthcLinhVucThuTucWrapper(TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		_tthcLinhVucThuTuc = tthcLinhVucThuTuc;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcLinhVucThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcLinhVucThuTuc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("TenLinhVuc", getTenLinhVuc());
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

		String TenLinhVuc = (String)attributes.get("TenLinhVuc");

		if (TenLinhVuc != null) {
			setTenLinhVuc(TenLinhVuc);
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
	* Returns the primary key of this tthc linh vuc thu tuc.
	*
	* @return the primary key of this tthc linh vuc thu tuc
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcLinhVucThuTuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc linh vuc thu tuc.
	*
	* @param primaryKey the primary key of this tthc linh vuc thu tuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcLinhVucThuTuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc linh vuc thu tuc.
	*
	* @return the ID of this tthc linh vuc thu tuc
	*/
	@Override
	public long getId() {
		return _tthcLinhVucThuTuc.getId();
	}

	/**
	* Sets the ID of this tthc linh vuc thu tuc.
	*
	* @param Id the ID of this tthc linh vuc thu tuc
	*/
	@Override
	public void setId(long Id) {
		_tthcLinhVucThuTuc.setId(Id);
	}

	/**
	* Returns the ten linh vuc of this tthc linh vuc thu tuc.
	*
	* @return the ten linh vuc of this tthc linh vuc thu tuc
	*/
	@Override
	public java.lang.String getTenLinhVuc() {
		return _tthcLinhVucThuTuc.getTenLinhVuc();
	}

	/**
	* Sets the ten linh vuc of this tthc linh vuc thu tuc.
	*
	* @param TenLinhVuc the ten linh vuc of this tthc linh vuc thu tuc
	*/
	@Override
	public void setTenLinhVuc(java.lang.String TenLinhVuc) {
		_tthcLinhVucThuTuc.setTenLinhVuc(TenLinhVuc);
	}

	/**
	* Returns the ten tieng anh of this tthc linh vuc thu tuc.
	*
	* @return the ten tieng anh of this tthc linh vuc thu tuc
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _tthcLinhVucThuTuc.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this tthc linh vuc thu tuc.
	*
	* @param TenTiengAnh the ten tieng anh of this tthc linh vuc thu tuc
	*/
	@Override
	public void setTenTiengAnh(java.lang.String TenTiengAnh) {
		_tthcLinhVucThuTuc.setTenTiengAnh(TenTiengAnh);
	}

	/**
	* Returns the id cha of this tthc linh vuc thu tuc.
	*
	* @return the id cha of this tthc linh vuc thu tuc
	*/
	@Override
	public long getIdCha() {
		return _tthcLinhVucThuTuc.getIdCha();
	}

	/**
	* Sets the id cha of this tthc linh vuc thu tuc.
	*
	* @param IdCha the id cha of this tthc linh vuc thu tuc
	*/
	@Override
	public void setIdCha(long IdCha) {
		_tthcLinhVucThuTuc.setIdCha(IdCha);
	}

	@Override
	public boolean isNew() {
		return _tthcLinhVucThuTuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcLinhVucThuTuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcLinhVucThuTuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcLinhVucThuTuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcLinhVucThuTuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcLinhVucThuTuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcLinhVucThuTuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcLinhVucThuTuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcLinhVucThuTuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcLinhVucThuTuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcLinhVucThuTuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcLinhVucThuTucWrapper((TthcLinhVucThuTuc)_tthcLinhVucThuTuc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		return _tthcLinhVucThuTuc.compareTo(tthcLinhVucThuTuc);
	}

	@Override
	public int hashCode() {
		return _tthcLinhVucThuTuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc> toCacheModel() {
		return _tthcLinhVucThuTuc.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc toEscapedModel() {
		return new TthcLinhVucThuTucWrapper(_tthcLinhVucThuTuc.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc toUnescapedModel() {
		return new TthcLinhVucThuTucWrapper(_tthcLinhVucThuTuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcLinhVucThuTuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcLinhVucThuTuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcLinhVucThuTuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcLinhVucThuTucWrapper)) {
			return false;
		}

		TthcLinhVucThuTucWrapper tthcLinhVucThuTucWrapper = (TthcLinhVucThuTucWrapper)obj;

		if (Validator.equals(_tthcLinhVucThuTuc,
					tthcLinhVucThuTucWrapper._tthcLinhVucThuTuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcLinhVucThuTuc getWrappedTthcLinhVucThuTuc() {
		return _tthcLinhVucThuTuc;
	}

	@Override
	public TthcLinhVucThuTuc getWrappedModel() {
		return _tthcLinhVucThuTuc;
	}

	@Override
	public void resetOriginalValues() {
		_tthcLinhVucThuTuc.resetOriginalValues();
	}

	private TthcLinhVucThuTuc _tthcLinhVucThuTuc;
}