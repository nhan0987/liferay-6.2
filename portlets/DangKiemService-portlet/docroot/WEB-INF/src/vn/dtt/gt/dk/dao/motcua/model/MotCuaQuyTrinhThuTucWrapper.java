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
 * This class is a wrapper for {@link MotCuaQuyTrinhThuTuc}.
 * </p>
 *
 * @author huymq
 * @see MotCuaQuyTrinhThuTuc
 * @generated
 */
public class MotCuaQuyTrinhThuTucWrapper implements MotCuaQuyTrinhThuTuc,
	ModelWrapper<MotCuaQuyTrinhThuTuc> {
	public MotCuaQuyTrinhThuTucWrapper(
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		_motCuaQuyTrinhThuTuc = motCuaQuyTrinhThuTuc;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaQuyTrinhThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaQuyTrinhThuTuc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("maQuyTrinh", getMaQuyTrinh());
		attributes.put("toChucXuLy", getToChucXuLy());
		attributes.put("soNgayXuLy", getSoNgayXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		String maQuyTrinh = (String)attributes.get("maQuyTrinh");

		if (maQuyTrinh != null) {
			setMaQuyTrinh(maQuyTrinh);
		}

		Long toChucXuLy = (Long)attributes.get("toChucXuLy");

		if (toChucXuLy != null) {
			setToChucXuLy(toChucXuLy);
		}

		Long soNgayXuLy = (Long)attributes.get("soNgayXuLy");

		if (soNgayXuLy != null) {
			setSoNgayXuLy(soNgayXuLy);
		}
	}

	/**
	* Returns the primary key of this mot cua quy trinh thu tuc.
	*
	* @return the primary key of this mot cua quy trinh thu tuc
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaQuyTrinhThuTuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua quy trinh thu tuc.
	*
	* @param primaryKey the primary key of this mot cua quy trinh thu tuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaQuyTrinhThuTuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua quy trinh thu tuc.
	*
	* @return the ID of this mot cua quy trinh thu tuc
	*/
	@Override
	public long getId() {
		return _motCuaQuyTrinhThuTuc.getId();
	}

	/**
	* Sets the ID of this mot cua quy trinh thu tuc.
	*
	* @param id the ID of this mot cua quy trinh thu tuc
	*/
	@Override
	public void setId(long id) {
		_motCuaQuyTrinhThuTuc.setId(id);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc.
	*
	* @return the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _motCuaQuyTrinhThuTuc.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_motCuaQuyTrinhThuTuc.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the ma quy trinh of this mot cua quy trinh thu tuc.
	*
	* @return the ma quy trinh of this mot cua quy trinh thu tuc
	*/
	@Override
	public java.lang.String getMaQuyTrinh() {
		return _motCuaQuyTrinhThuTuc.getMaQuyTrinh();
	}

	/**
	* Sets the ma quy trinh of this mot cua quy trinh thu tuc.
	*
	* @param maQuyTrinh the ma quy trinh of this mot cua quy trinh thu tuc
	*/
	@Override
	public void setMaQuyTrinh(java.lang.String maQuyTrinh) {
		_motCuaQuyTrinhThuTuc.setMaQuyTrinh(maQuyTrinh);
	}

	/**
	* Returns the to chuc xu ly of this mot cua quy trinh thu tuc.
	*
	* @return the to chuc xu ly of this mot cua quy trinh thu tuc
	*/
	@Override
	public long getToChucXuLy() {
		return _motCuaQuyTrinhThuTuc.getToChucXuLy();
	}

	/**
	* Sets the to chuc xu ly of this mot cua quy trinh thu tuc.
	*
	* @param toChucXuLy the to chuc xu ly of this mot cua quy trinh thu tuc
	*/
	@Override
	public void setToChucXuLy(long toChucXuLy) {
		_motCuaQuyTrinhThuTuc.setToChucXuLy(toChucXuLy);
	}

	/**
	* Returns the so ngay xu ly of this mot cua quy trinh thu tuc.
	*
	* @return the so ngay xu ly of this mot cua quy trinh thu tuc
	*/
	@Override
	public long getSoNgayXuLy() {
		return _motCuaQuyTrinhThuTuc.getSoNgayXuLy();
	}

	/**
	* Sets the so ngay xu ly of this mot cua quy trinh thu tuc.
	*
	* @param soNgayXuLy the so ngay xu ly of this mot cua quy trinh thu tuc
	*/
	@Override
	public void setSoNgayXuLy(long soNgayXuLy) {
		_motCuaQuyTrinhThuTuc.setSoNgayXuLy(soNgayXuLy);
	}

	@Override
	public boolean isNew() {
		return _motCuaQuyTrinhThuTuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaQuyTrinhThuTuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaQuyTrinhThuTuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaQuyTrinhThuTuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaQuyTrinhThuTuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaQuyTrinhThuTuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaQuyTrinhThuTuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaQuyTrinhThuTuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaQuyTrinhThuTuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaQuyTrinhThuTuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaQuyTrinhThuTuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaQuyTrinhThuTucWrapper((MotCuaQuyTrinhThuTuc)_motCuaQuyTrinhThuTuc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		return _motCuaQuyTrinhThuTuc.compareTo(motCuaQuyTrinhThuTuc);
	}

	@Override
	public int hashCode() {
		return _motCuaQuyTrinhThuTuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> toCacheModel() {
		return _motCuaQuyTrinhThuTuc.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc toEscapedModel() {
		return new MotCuaQuyTrinhThuTucWrapper(_motCuaQuyTrinhThuTuc.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc toUnescapedModel() {
		return new MotCuaQuyTrinhThuTucWrapper(_motCuaQuyTrinhThuTuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaQuyTrinhThuTuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaQuyTrinhThuTuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaQuyTrinhThuTuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaQuyTrinhThuTucWrapper)) {
			return false;
		}

		MotCuaQuyTrinhThuTucWrapper motCuaQuyTrinhThuTucWrapper = (MotCuaQuyTrinhThuTucWrapper)obj;

		if (Validator.equals(_motCuaQuyTrinhThuTuc,
					motCuaQuyTrinhThuTucWrapper._motCuaQuyTrinhThuTuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaQuyTrinhThuTuc getWrappedMotCuaQuyTrinhThuTuc() {
		return _motCuaQuyTrinhThuTuc;
	}

	@Override
	public MotCuaQuyTrinhThuTuc getWrappedModel() {
		return _motCuaQuyTrinhThuTuc;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaQuyTrinhThuTuc.resetOriginalValues();
	}

	private MotCuaQuyTrinhThuTuc _motCuaQuyTrinhThuTuc;
}