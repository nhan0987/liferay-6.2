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
 * This class is a wrapper for {@link MotCuaKetQuaDienBien}.
 * </p>
 *
 * @author win_64
 * @see MotCuaKetQuaDienBien
 * @generated
 */
public class MotCuaKetQuaDienBienWrapper implements MotCuaKetQuaDienBien,
	ModelWrapper<MotCuaKetQuaDienBien> {
	public MotCuaKetQuaDienBienWrapper(
		MotCuaKetQuaDienBien motCuaKetQuaDienBien) {
		_motCuaKetQuaDienBien = motCuaKetQuaDienBien;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaKetQuaDienBien.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaKetQuaDienBien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dienBienHoSoId", getDienBienHoSoId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dienBienHoSoId = (Long)attributes.get("dienBienHoSoId");

		if (dienBienHoSoId != null) {
			setDienBienHoSoId(dienBienHoSoId);
		}

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
		}
	}

	/**
	* Returns the primary key of this mot cua ket qua dien bien.
	*
	* @return the primary key of this mot cua ket qua dien bien
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaKetQuaDienBien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua ket qua dien bien.
	*
	* @param primaryKey the primary key of this mot cua ket qua dien bien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaKetQuaDienBien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua ket qua dien bien.
	*
	* @return the ID of this mot cua ket qua dien bien
	*/
	@Override
	public long getId() {
		return _motCuaKetQuaDienBien.getId();
	}

	/**
	* Sets the ID of this mot cua ket qua dien bien.
	*
	* @param id the ID of this mot cua ket qua dien bien
	*/
	@Override
	public void setId(long id) {
		_motCuaKetQuaDienBien.setId(id);
	}

	/**
	* Returns the dien bien ho so ID of this mot cua ket qua dien bien.
	*
	* @return the dien bien ho so ID of this mot cua ket qua dien bien
	*/
	@Override
	public long getDienBienHoSoId() {
		return _motCuaKetQuaDienBien.getDienBienHoSoId();
	}

	/**
	* Sets the dien bien ho so ID of this mot cua ket qua dien bien.
	*
	* @param dienBienHoSoId the dien bien ho so ID of this mot cua ket qua dien bien
	*/
	@Override
	public void setDienBienHoSoId(long dienBienHoSoId) {
		_motCuaKetQuaDienBien.setDienBienHoSoId(dienBienHoSoId);
	}

	/**
	* Returns the noi dung ho so ID of this mot cua ket qua dien bien.
	*
	* @return the noi dung ho so ID of this mot cua ket qua dien bien
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _motCuaKetQuaDienBien.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this mot cua ket qua dien bien.
	*
	* @param noiDungHoSoId the noi dung ho so ID of this mot cua ket qua dien bien
	*/
	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_motCuaKetQuaDienBien.setNoiDungHoSoId(noiDungHoSoId);
	}

	@Override
	public boolean isNew() {
		return _motCuaKetQuaDienBien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaKetQuaDienBien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaKetQuaDienBien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaKetQuaDienBien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaKetQuaDienBien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaKetQuaDienBien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaKetQuaDienBien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaKetQuaDienBien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaKetQuaDienBien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaKetQuaDienBien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaKetQuaDienBien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaKetQuaDienBienWrapper((MotCuaKetQuaDienBien)_motCuaKetQuaDienBien.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien motCuaKetQuaDienBien) {
		return _motCuaKetQuaDienBien.compareTo(motCuaKetQuaDienBien);
	}

	@Override
	public int hashCode() {
		return _motCuaKetQuaDienBien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> toCacheModel() {
		return _motCuaKetQuaDienBien.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien toEscapedModel() {
		return new MotCuaKetQuaDienBienWrapper(_motCuaKetQuaDienBien.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien toUnescapedModel() {
		return new MotCuaKetQuaDienBienWrapper(_motCuaKetQuaDienBien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaKetQuaDienBien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaKetQuaDienBien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaKetQuaDienBien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaKetQuaDienBienWrapper)) {
			return false;
		}

		MotCuaKetQuaDienBienWrapper motCuaKetQuaDienBienWrapper = (MotCuaKetQuaDienBienWrapper)obj;

		if (Validator.equals(_motCuaKetQuaDienBien,
					motCuaKetQuaDienBienWrapper._motCuaKetQuaDienBien)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaKetQuaDienBien getWrappedMotCuaKetQuaDienBien() {
		return _motCuaKetQuaDienBien;
	}

	@Override
	public MotCuaKetQuaDienBien getWrappedModel() {
		return _motCuaKetQuaDienBien;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaKetQuaDienBien.resetOriginalValues();
	}

	private MotCuaKetQuaDienBien _motCuaKetQuaDienBien;
}