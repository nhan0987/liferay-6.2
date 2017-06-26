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
 * This class is a wrapper for {@link MotCuaTrangThaiHoSo}.
 * </p>
 *
 * @author win_64
 * @see MotCuaTrangThaiHoSo
 * @generated
 */
public class MotCuaTrangThaiHoSoWrapper implements MotCuaTrangThaiHoSo,
	ModelWrapper<MotCuaTrangThaiHoSo> {
	public MotCuaTrangThaiHoSoWrapper(MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		_motCuaTrangThaiHoSo = motCuaTrangThaiHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaTrangThaiHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaTrangThaiHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("quyTrinhThuTucId", getQuyTrinhThuTucId());
		attributes.put("tenTrangThai", getTenTrangThai());
		attributes.put("kieuTrangThai", getKieuTrangThai());
		attributes.put("moTaTrangThai", getMoTaTrangThai());
		attributes.put("vaiTroXuLy1", getVaiTroXuLy1());
		attributes.put("vaiTroXuLy2", getVaiTroXuLy2());
		attributes.put("vaiTroXuLy3", getVaiTroXuLy3());
		attributes.put("formXuLy", getFormXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long quyTrinhThuTucId = (Long)attributes.get("quyTrinhThuTucId");

		if (quyTrinhThuTucId != null) {
			setQuyTrinhThuTucId(quyTrinhThuTucId);
		}

		String tenTrangThai = (String)attributes.get("tenTrangThai");

		if (tenTrangThai != null) {
			setTenTrangThai(tenTrangThai);
		}

		Long kieuTrangThai = (Long)attributes.get("kieuTrangThai");

		if (kieuTrangThai != null) {
			setKieuTrangThai(kieuTrangThai);
		}

		String moTaTrangThai = (String)attributes.get("moTaTrangThai");

		if (moTaTrangThai != null) {
			setMoTaTrangThai(moTaTrangThai);
		}

		Long vaiTroXuLy1 = (Long)attributes.get("vaiTroXuLy1");

		if (vaiTroXuLy1 != null) {
			setVaiTroXuLy1(vaiTroXuLy1);
		}

		Long vaiTroXuLy2 = (Long)attributes.get("vaiTroXuLy2");

		if (vaiTroXuLy2 != null) {
			setVaiTroXuLy2(vaiTroXuLy2);
		}

		Long vaiTroXuLy3 = (Long)attributes.get("vaiTroXuLy3");

		if (vaiTroXuLy3 != null) {
			setVaiTroXuLy3(vaiTroXuLy3);
		}

		String formXuLy = (String)attributes.get("formXuLy");

		if (formXuLy != null) {
			setFormXuLy(formXuLy);
		}
	}

	/**
	* Returns the primary key of this mot cua trang thai ho so.
	*
	* @return the primary key of this mot cua trang thai ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaTrangThaiHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua trang thai ho so.
	*
	* @param primaryKey the primary key of this mot cua trang thai ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaTrangThaiHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua trang thai ho so.
	*
	* @return the ID of this mot cua trang thai ho so
	*/
	@Override
	public long getId() {
		return _motCuaTrangThaiHoSo.getId();
	}

	/**
	* Sets the ID of this mot cua trang thai ho so.
	*
	* @param id the ID of this mot cua trang thai ho so
	*/
	@Override
	public void setId(long id) {
		_motCuaTrangThaiHoSo.setId(id);
	}

	/**
	* Returns the quy trinh thu tuc ID of this mot cua trang thai ho so.
	*
	* @return the quy trinh thu tuc ID of this mot cua trang thai ho so
	*/
	@Override
	public long getQuyTrinhThuTucId() {
		return _motCuaTrangThaiHoSo.getQuyTrinhThuTucId();
	}

	/**
	* Sets the quy trinh thu tuc ID of this mot cua trang thai ho so.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID of this mot cua trang thai ho so
	*/
	@Override
	public void setQuyTrinhThuTucId(long quyTrinhThuTucId) {
		_motCuaTrangThaiHoSo.setQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the ten trang thai of this mot cua trang thai ho so.
	*
	* @return the ten trang thai of this mot cua trang thai ho so
	*/
	@Override
	public java.lang.String getTenTrangThai() {
		return _motCuaTrangThaiHoSo.getTenTrangThai();
	}

	/**
	* Sets the ten trang thai of this mot cua trang thai ho so.
	*
	* @param tenTrangThai the ten trang thai of this mot cua trang thai ho so
	*/
	@Override
	public void setTenTrangThai(java.lang.String tenTrangThai) {
		_motCuaTrangThaiHoSo.setTenTrangThai(tenTrangThai);
	}

	/**
	* Returns the kieu trang thai of this mot cua trang thai ho so.
	*
	* @return the kieu trang thai of this mot cua trang thai ho so
	*/
	@Override
	public long getKieuTrangThai() {
		return _motCuaTrangThaiHoSo.getKieuTrangThai();
	}

	/**
	* Sets the kieu trang thai of this mot cua trang thai ho so.
	*
	* @param kieuTrangThai the kieu trang thai of this mot cua trang thai ho so
	*/
	@Override
	public void setKieuTrangThai(long kieuTrangThai) {
		_motCuaTrangThaiHoSo.setKieuTrangThai(kieuTrangThai);
	}

	/**
	* Returns the mo ta trang thai of this mot cua trang thai ho so.
	*
	* @return the mo ta trang thai of this mot cua trang thai ho so
	*/
	@Override
	public java.lang.String getMoTaTrangThai() {
		return _motCuaTrangThaiHoSo.getMoTaTrangThai();
	}

	/**
	* Sets the mo ta trang thai of this mot cua trang thai ho so.
	*
	* @param moTaTrangThai the mo ta trang thai of this mot cua trang thai ho so
	*/
	@Override
	public void setMoTaTrangThai(java.lang.String moTaTrangThai) {
		_motCuaTrangThaiHoSo.setMoTaTrangThai(moTaTrangThai);
	}

	/**
	* Returns the vai tro xu ly1 of this mot cua trang thai ho so.
	*
	* @return the vai tro xu ly1 of this mot cua trang thai ho so
	*/
	@Override
	public long getVaiTroXuLy1() {
		return _motCuaTrangThaiHoSo.getVaiTroXuLy1();
	}

	/**
	* Sets the vai tro xu ly1 of this mot cua trang thai ho so.
	*
	* @param vaiTroXuLy1 the vai tro xu ly1 of this mot cua trang thai ho so
	*/
	@Override
	public void setVaiTroXuLy1(long vaiTroXuLy1) {
		_motCuaTrangThaiHoSo.setVaiTroXuLy1(vaiTroXuLy1);
	}

	/**
	* Returns the vai tro xu ly2 of this mot cua trang thai ho so.
	*
	* @return the vai tro xu ly2 of this mot cua trang thai ho so
	*/
	@Override
	public long getVaiTroXuLy2() {
		return _motCuaTrangThaiHoSo.getVaiTroXuLy2();
	}

	/**
	* Sets the vai tro xu ly2 of this mot cua trang thai ho so.
	*
	* @param vaiTroXuLy2 the vai tro xu ly2 of this mot cua trang thai ho so
	*/
	@Override
	public void setVaiTroXuLy2(long vaiTroXuLy2) {
		_motCuaTrangThaiHoSo.setVaiTroXuLy2(vaiTroXuLy2);
	}

	/**
	* Returns the vai tro xu ly3 of this mot cua trang thai ho so.
	*
	* @return the vai tro xu ly3 of this mot cua trang thai ho so
	*/
	@Override
	public long getVaiTroXuLy3() {
		return _motCuaTrangThaiHoSo.getVaiTroXuLy3();
	}

	/**
	* Sets the vai tro xu ly3 of this mot cua trang thai ho so.
	*
	* @param vaiTroXuLy3 the vai tro xu ly3 of this mot cua trang thai ho so
	*/
	@Override
	public void setVaiTroXuLy3(long vaiTroXuLy3) {
		_motCuaTrangThaiHoSo.setVaiTroXuLy3(vaiTroXuLy3);
	}

	/**
	* Returns the form xu ly of this mot cua trang thai ho so.
	*
	* @return the form xu ly of this mot cua trang thai ho so
	*/
	@Override
	public java.lang.String getFormXuLy() {
		return _motCuaTrangThaiHoSo.getFormXuLy();
	}

	/**
	* Sets the form xu ly of this mot cua trang thai ho so.
	*
	* @param formXuLy the form xu ly of this mot cua trang thai ho so
	*/
	@Override
	public void setFormXuLy(java.lang.String formXuLy) {
		_motCuaTrangThaiHoSo.setFormXuLy(formXuLy);
	}

	@Override
	public boolean isNew() {
		return _motCuaTrangThaiHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaTrangThaiHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaTrangThaiHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaTrangThaiHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaTrangThaiHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaTrangThaiHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaTrangThaiHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaTrangThaiHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaTrangThaiHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaTrangThaiHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaTrangThaiHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaTrangThaiHoSoWrapper((MotCuaTrangThaiHoSo)_motCuaTrangThaiHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		return _motCuaTrangThaiHoSo.compareTo(motCuaTrangThaiHoSo);
	}

	@Override
	public int hashCode() {
		return _motCuaTrangThaiHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> toCacheModel() {
		return _motCuaTrangThaiHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo toEscapedModel() {
		return new MotCuaTrangThaiHoSoWrapper(_motCuaTrangThaiHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo toUnescapedModel() {
		return new MotCuaTrangThaiHoSoWrapper(_motCuaTrangThaiHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaTrangThaiHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaTrangThaiHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaTrangThaiHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaTrangThaiHoSoWrapper)) {
			return false;
		}

		MotCuaTrangThaiHoSoWrapper motCuaTrangThaiHoSoWrapper = (MotCuaTrangThaiHoSoWrapper)obj;

		if (Validator.equals(_motCuaTrangThaiHoSo,
					motCuaTrangThaiHoSoWrapper._motCuaTrangThaiHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaTrangThaiHoSo getWrappedMotCuaTrangThaiHoSo() {
		return _motCuaTrangThaiHoSo;
	}

	@Override
	public MotCuaTrangThaiHoSo getWrappedModel() {
		return _motCuaTrangThaiHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaTrangThaiHoSo.resetOriginalValues();
	}

	private MotCuaTrangThaiHoSo _motCuaTrangThaiHoSo;
}