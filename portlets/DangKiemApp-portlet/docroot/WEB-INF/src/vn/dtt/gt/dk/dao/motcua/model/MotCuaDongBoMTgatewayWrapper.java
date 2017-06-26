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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MotCuaDongBoMTgateway}.
 * </p>
 *
 * @author win_64
 * @see MotCuaDongBoMTgateway
 * @generated
 */
public class MotCuaDongBoMTgatewayWrapper implements MotCuaDongBoMTgateway,
	ModelWrapper<MotCuaDongBoMTgateway> {
	public MotCuaDongBoMTgatewayWrapper(
		MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		_motCuaDongBoMTgateway = motCuaDongBoMTgateway;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaDongBoMTgateway.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaDongBoMTgateway.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dienBienHoSoId", getDienBienHoSoId());
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("trangThai", getTrangThai());

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

		Long phieuXuLyChinhId = (Long)attributes.get("phieuXuLyChinhId");

		if (phieuXuLyChinhId != null) {
			setPhieuXuLyChinhId(phieuXuLyChinhId);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	/**
	* Returns the primary key of this mot cua dong bo m tgateway.
	*
	* @return the primary key of this mot cua dong bo m tgateway
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaDongBoMTgateway.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua dong bo m tgateway.
	*
	* @param primaryKey the primary key of this mot cua dong bo m tgateway
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaDongBoMTgateway.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua dong bo m tgateway.
	*
	* @return the ID of this mot cua dong bo m tgateway
	*/
	@Override
	public long getId() {
		return _motCuaDongBoMTgateway.getId();
	}

	/**
	* Sets the ID of this mot cua dong bo m tgateway.
	*
	* @param id the ID of this mot cua dong bo m tgateway
	*/
	@Override
	public void setId(long id) {
		_motCuaDongBoMTgateway.setId(id);
	}

	/**
	* Returns the dien bien ho so ID of this mot cua dong bo m tgateway.
	*
	* @return the dien bien ho so ID of this mot cua dong bo m tgateway
	*/
	@Override
	public long getDienBienHoSoId() {
		return _motCuaDongBoMTgateway.getDienBienHoSoId();
	}

	/**
	* Sets the dien bien ho so ID of this mot cua dong bo m tgateway.
	*
	* @param dienBienHoSoId the dien bien ho so ID of this mot cua dong bo m tgateway
	*/
	@Override
	public void setDienBienHoSoId(long dienBienHoSoId) {
		_motCuaDongBoMTgateway.setDienBienHoSoId(dienBienHoSoId);
	}

	/**
	* Returns the phieu xu ly chinh ID of this mot cua dong bo m tgateway.
	*
	* @return the phieu xu ly chinh ID of this mot cua dong bo m tgateway
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _motCuaDongBoMTgateway.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this mot cua dong bo m tgateway.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this mot cua dong bo m tgateway
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_motCuaDongBoMTgateway.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the modify date of this mot cua dong bo m tgateway.
	*
	* @return the modify date of this mot cua dong bo m tgateway
	*/
	@Override
	public java.util.Date getModifyDate() {
		return _motCuaDongBoMTgateway.getModifyDate();
	}

	/**
	* Sets the modify date of this mot cua dong bo m tgateway.
	*
	* @param modifyDate the modify date of this mot cua dong bo m tgateway
	*/
	@Override
	public void setModifyDate(java.util.Date modifyDate) {
		_motCuaDongBoMTgateway.setModifyDate(modifyDate);
	}

	/**
	* Returns the trang thai of this mot cua dong bo m tgateway.
	*
	* @return the trang thai of this mot cua dong bo m tgateway
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _motCuaDongBoMTgateway.getTrangThai();
	}

	/**
	* Sets the trang thai of this mot cua dong bo m tgateway.
	*
	* @param trangThai the trang thai of this mot cua dong bo m tgateway
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_motCuaDongBoMTgateway.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _motCuaDongBoMTgateway.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaDongBoMTgateway.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaDongBoMTgateway.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaDongBoMTgateway.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaDongBoMTgateway.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaDongBoMTgateway.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaDongBoMTgateway.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaDongBoMTgateway.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaDongBoMTgateway.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaDongBoMTgateway.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaDongBoMTgateway.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaDongBoMTgatewayWrapper((MotCuaDongBoMTgateway)_motCuaDongBoMTgateway.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		return _motCuaDongBoMTgateway.compareTo(motCuaDongBoMTgateway);
	}

	@Override
	public int hashCode() {
		return _motCuaDongBoMTgateway.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> toCacheModel() {
		return _motCuaDongBoMTgateway.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway toEscapedModel() {
		return new MotCuaDongBoMTgatewayWrapper(_motCuaDongBoMTgateway.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway toUnescapedModel() {
		return new MotCuaDongBoMTgatewayWrapper(_motCuaDongBoMTgateway.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaDongBoMTgateway.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaDongBoMTgateway.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaDongBoMTgateway.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaDongBoMTgatewayWrapper)) {
			return false;
		}

		MotCuaDongBoMTgatewayWrapper motCuaDongBoMTgatewayWrapper = (MotCuaDongBoMTgatewayWrapper)obj;

		if (Validator.equals(_motCuaDongBoMTgateway,
					motCuaDongBoMTgatewayWrapper._motCuaDongBoMTgateway)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaDongBoMTgateway getWrappedMotCuaDongBoMTgateway() {
		return _motCuaDongBoMTgateway;
	}

	@Override
	public MotCuaDongBoMTgateway getWrappedModel() {
		return _motCuaDongBoMTgateway;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaDongBoMTgateway.resetOriginalValues();
	}

	private MotCuaDongBoMTgateway _motCuaDongBoMTgateway;
}