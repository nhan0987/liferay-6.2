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
 * This class is a wrapper for {@link MotCuaPhanCongXuLy}.
 * </p>
 *
 * @author huymq
 * @see MotCuaPhanCongXuLy
 * @generated
 */
public class MotCuaPhanCongXuLyWrapper implements MotCuaPhanCongXuLy,
	ModelWrapper<MotCuaPhanCongXuLy> {
	public MotCuaPhanCongXuLyWrapper(MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		_motCuaPhanCongXuLy = motCuaPhanCongXuLy;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhanCongXuLy.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhanCongXuLy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("trangThaiHoSoId", getTrangThaiHoSoId());
		attributes.put("nguoiXuLy", getNguoiXuLy());
		attributes.put("nhomXuLy", getNhomXuLy());
		attributes.put("ngayPhanCong", getNgayPhanCong());
		attributes.put("nguoiPhanCong", getNguoiPhanCong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long phieuXuLyChinhId = (Long)attributes.get("phieuXuLyChinhId");

		if (phieuXuLyChinhId != null) {
			setPhieuXuLyChinhId(phieuXuLyChinhId);
		}

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		Long trangThaiHoSoId = (Long)attributes.get("trangThaiHoSoId");

		if (trangThaiHoSoId != null) {
			setTrangThaiHoSoId(trangThaiHoSoId);
		}

		Long nguoiXuLy = (Long)attributes.get("nguoiXuLy");

		if (nguoiXuLy != null) {
			setNguoiXuLy(nguoiXuLy);
		}

		Long nhomXuLy = (Long)attributes.get("nhomXuLy");

		if (nhomXuLy != null) {
			setNhomXuLy(nhomXuLy);
		}

		Date ngayPhanCong = (Date)attributes.get("ngayPhanCong");

		if (ngayPhanCong != null) {
			setNgayPhanCong(ngayPhanCong);
		}

		Long nguoiPhanCong = (Long)attributes.get("nguoiPhanCong");

		if (nguoiPhanCong != null) {
			setNguoiPhanCong(nguoiPhanCong);
		}
	}

	/**
	* Returns the primary key of this mot cua phan cong xu ly.
	*
	* @return the primary key of this mot cua phan cong xu ly
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaPhanCongXuLy.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua phan cong xu ly.
	*
	* @param primaryKey the primary key of this mot cua phan cong xu ly
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaPhanCongXuLy.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua phan cong xu ly.
	*
	* @return the ID of this mot cua phan cong xu ly
	*/
	@Override
	public long getId() {
		return _motCuaPhanCongXuLy.getId();
	}

	/**
	* Sets the ID of this mot cua phan cong xu ly.
	*
	* @param id the ID of this mot cua phan cong xu ly
	*/
	@Override
	public void setId(long id) {
		_motCuaPhanCongXuLy.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this mot cua phan cong xu ly.
	*
	* @return the phieu xu ly chinh ID of this mot cua phan cong xu ly
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _motCuaPhanCongXuLy.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this mot cua phan cong xu ly.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this mot cua phan cong xu ly
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_motCuaPhanCongXuLy.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the phieu xu ly phu ID of this mot cua phan cong xu ly.
	*
	* @return the phieu xu ly phu ID of this mot cua phan cong xu ly
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _motCuaPhanCongXuLy.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this mot cua phan cong xu ly.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this mot cua phan cong xu ly
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_motCuaPhanCongXuLy.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the trang thai ho so ID of this mot cua phan cong xu ly.
	*
	* @return the trang thai ho so ID of this mot cua phan cong xu ly
	*/
	@Override
	public long getTrangThaiHoSoId() {
		return _motCuaPhanCongXuLy.getTrangThaiHoSoId();
	}

	/**
	* Sets the trang thai ho so ID of this mot cua phan cong xu ly.
	*
	* @param trangThaiHoSoId the trang thai ho so ID of this mot cua phan cong xu ly
	*/
	@Override
	public void setTrangThaiHoSoId(long trangThaiHoSoId) {
		_motCuaPhanCongXuLy.setTrangThaiHoSoId(trangThaiHoSoId);
	}

	/**
	* Returns the nguoi xu ly of this mot cua phan cong xu ly.
	*
	* @return the nguoi xu ly of this mot cua phan cong xu ly
	*/
	@Override
	public long getNguoiXuLy() {
		return _motCuaPhanCongXuLy.getNguoiXuLy();
	}

	/**
	* Sets the nguoi xu ly of this mot cua phan cong xu ly.
	*
	* @param nguoiXuLy the nguoi xu ly of this mot cua phan cong xu ly
	*/
	@Override
	public void setNguoiXuLy(long nguoiXuLy) {
		_motCuaPhanCongXuLy.setNguoiXuLy(nguoiXuLy);
	}

	/**
	* Returns the nhom xu ly of this mot cua phan cong xu ly.
	*
	* @return the nhom xu ly of this mot cua phan cong xu ly
	*/
	@Override
	public long getNhomXuLy() {
		return _motCuaPhanCongXuLy.getNhomXuLy();
	}

	/**
	* Sets the nhom xu ly of this mot cua phan cong xu ly.
	*
	* @param nhomXuLy the nhom xu ly of this mot cua phan cong xu ly
	*/
	@Override
	public void setNhomXuLy(long nhomXuLy) {
		_motCuaPhanCongXuLy.setNhomXuLy(nhomXuLy);
	}

	/**
	* Returns the ngay phan cong of this mot cua phan cong xu ly.
	*
	* @return the ngay phan cong of this mot cua phan cong xu ly
	*/
	@Override
	public java.util.Date getNgayPhanCong() {
		return _motCuaPhanCongXuLy.getNgayPhanCong();
	}

	/**
	* Sets the ngay phan cong of this mot cua phan cong xu ly.
	*
	* @param ngayPhanCong the ngay phan cong of this mot cua phan cong xu ly
	*/
	@Override
	public void setNgayPhanCong(java.util.Date ngayPhanCong) {
		_motCuaPhanCongXuLy.setNgayPhanCong(ngayPhanCong);
	}

	/**
	* Returns the nguoi phan cong of this mot cua phan cong xu ly.
	*
	* @return the nguoi phan cong of this mot cua phan cong xu ly
	*/
	@Override
	public long getNguoiPhanCong() {
		return _motCuaPhanCongXuLy.getNguoiPhanCong();
	}

	/**
	* Sets the nguoi phan cong of this mot cua phan cong xu ly.
	*
	* @param nguoiPhanCong the nguoi phan cong of this mot cua phan cong xu ly
	*/
	@Override
	public void setNguoiPhanCong(long nguoiPhanCong) {
		_motCuaPhanCongXuLy.setNguoiPhanCong(nguoiPhanCong);
	}

	@Override
	public boolean isNew() {
		return _motCuaPhanCongXuLy.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaPhanCongXuLy.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaPhanCongXuLy.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaPhanCongXuLy.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaPhanCongXuLy.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaPhanCongXuLy.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaPhanCongXuLy.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaPhanCongXuLy.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaPhanCongXuLy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaPhanCongXuLy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaPhanCongXuLy.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaPhanCongXuLyWrapper((MotCuaPhanCongXuLy)_motCuaPhanCongXuLy.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		return _motCuaPhanCongXuLy.compareTo(motCuaPhanCongXuLy);
	}

	@Override
	public int hashCode() {
		return _motCuaPhanCongXuLy.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> toCacheModel() {
		return _motCuaPhanCongXuLy.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy toEscapedModel() {
		return new MotCuaPhanCongXuLyWrapper(_motCuaPhanCongXuLy.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy toUnescapedModel() {
		return new MotCuaPhanCongXuLyWrapper(_motCuaPhanCongXuLy.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaPhanCongXuLy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaPhanCongXuLy.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaPhanCongXuLy.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaPhanCongXuLyWrapper)) {
			return false;
		}

		MotCuaPhanCongXuLyWrapper motCuaPhanCongXuLyWrapper = (MotCuaPhanCongXuLyWrapper)obj;

		if (Validator.equals(_motCuaPhanCongXuLy,
					motCuaPhanCongXuLyWrapper._motCuaPhanCongXuLy)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaPhanCongXuLy getWrappedMotCuaPhanCongXuLy() {
		return _motCuaPhanCongXuLy;
	}

	@Override
	public MotCuaPhanCongXuLy getWrappedModel() {
		return _motCuaPhanCongXuLy;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaPhanCongXuLy.resetOriginalValues();
	}

	private MotCuaPhanCongXuLy _motCuaPhanCongXuLy;
}