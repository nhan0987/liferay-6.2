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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TthcPhanNhomHoSo}.
 * </p>
 *
 * @author huymq
 * @see TthcPhanNhomHoSo
 * @generated
 */
public class TthcPhanNhomHoSoWrapper implements TthcPhanNhomHoSo,
	ModelWrapper<TthcPhanNhomHoSo> {
	public TthcPhanNhomHoSoWrapper(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		_tthcPhanNhomHoSo = tthcPhanNhomHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return TthcPhanNhomHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MaPhanNhom", getMaPhanNhom());
		attributes.put("TenPhanNhom", getTenPhanNhom());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("loaiPhieuXuLy", getLoaiPhieuXuLy());
		attributes.put("SoThuTu", getSoThuTu());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaPhanNhom = (String)attributes.get("MaPhanNhom");

		if (MaPhanNhom != null) {
			setMaPhanNhom(MaPhanNhom);
		}

		String TenPhanNhom = (String)attributes.get("TenPhanNhom");

		if (TenPhanNhom != null) {
			setTenPhanNhom(TenPhanNhom);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Integer loaiPhieuXuLy = (Integer)attributes.get("loaiPhieuXuLy");

		if (loaiPhieuXuLy != null) {
			setLoaiPhieuXuLy(loaiPhieuXuLy);
		}

		Integer SoThuTu = (Integer)attributes.get("SoThuTu");

		if (SoThuTu != null) {
			setSoThuTu(SoThuTu);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this tthc phan nhom ho so.
	*
	* @return the primary key of this tthc phan nhom ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _tthcPhanNhomHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tthc phan nhom ho so.
	*
	* @param primaryKey the primary key of this tthc phan nhom ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tthcPhanNhomHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tthc phan nhom ho so.
	*
	* @return the ID of this tthc phan nhom ho so
	*/
	@Override
	public long getId() {
		return _tthcPhanNhomHoSo.getId();
	}

	/**
	* Sets the ID of this tthc phan nhom ho so.
	*
	* @param Id the ID of this tthc phan nhom ho so
	*/
	@Override
	public void setId(long Id) {
		_tthcPhanNhomHoSo.setId(Id);
	}

	/**
	* Returns the ma phan nhom of this tthc phan nhom ho so.
	*
	* @return the ma phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public java.lang.String getMaPhanNhom() {
		return _tthcPhanNhomHoSo.getMaPhanNhom();
	}

	/**
	* Sets the ma phan nhom of this tthc phan nhom ho so.
	*
	* @param MaPhanNhom the ma phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public void setMaPhanNhom(java.lang.String MaPhanNhom) {
		_tthcPhanNhomHoSo.setMaPhanNhom(MaPhanNhom);
	}

	/**
	* Returns the ten phan nhom of this tthc phan nhom ho so.
	*
	* @return the ten phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public java.lang.String getTenPhanNhom() {
		return _tthcPhanNhomHoSo.getTenPhanNhom();
	}

	/**
	* Sets the ten phan nhom of this tthc phan nhom ho so.
	*
	* @param TenPhanNhom the ten phan nhom of this tthc phan nhom ho so
	*/
	@Override
	public void setTenPhanNhom(java.lang.String TenPhanNhom) {
		_tthcPhanNhomHoSo.setTenPhanNhom(TenPhanNhom);
	}

	/**
	* Returns the ten tieng anh of this tthc phan nhom ho so.
	*
	* @return the ten tieng anh of this tthc phan nhom ho so
	*/
	@Override
	public java.lang.String getTenTiengAnh() {
		return _tthcPhanNhomHoSo.getTenTiengAnh();
	}

	/**
	* Sets the ten tieng anh of this tthc phan nhom ho so.
	*
	* @param TenTiengAnh the ten tieng anh of this tthc phan nhom ho so
	*/
	@Override
	public void setTenTiengAnh(java.lang.String TenTiengAnh) {
		_tthcPhanNhomHoSo.setTenTiengAnh(TenTiengAnh);
	}

	/**
	* Returns the loai phieu xu ly of this tthc phan nhom ho so.
	*
	* @return the loai phieu xu ly of this tthc phan nhom ho so
	*/
	@Override
	public int getLoaiPhieuXuLy() {
		return _tthcPhanNhomHoSo.getLoaiPhieuXuLy();
	}

	/**
	* Sets the loai phieu xu ly of this tthc phan nhom ho so.
	*
	* @param loaiPhieuXuLy the loai phieu xu ly of this tthc phan nhom ho so
	*/
	@Override
	public void setLoaiPhieuXuLy(int loaiPhieuXuLy) {
		_tthcPhanNhomHoSo.setLoaiPhieuXuLy(loaiPhieuXuLy);
	}

	/**
	* Returns the so thu tu of this tthc phan nhom ho so.
	*
	* @return the so thu tu of this tthc phan nhom ho so
	*/
	@Override
	public int getSoThuTu() {
		return _tthcPhanNhomHoSo.getSoThuTu();
	}

	/**
	* Sets the so thu tu of this tthc phan nhom ho so.
	*
	* @param SoThuTu the so thu tu of this tthc phan nhom ho so
	*/
	@Override
	public void setSoThuTu(int SoThuTu) {
		_tthcPhanNhomHoSo.setSoThuTu(SoThuTu);
	}

	/**
	* Returns the synchdate of this tthc phan nhom ho so.
	*
	* @return the synchdate of this tthc phan nhom ho so
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _tthcPhanNhomHoSo.getSynchdate();
	}

	/**
	* Sets the synchdate of this tthc phan nhom ho so.
	*
	* @param synchdate the synchdate of this tthc phan nhom ho so
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_tthcPhanNhomHoSo.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _tthcPhanNhomHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tthcPhanNhomHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tthcPhanNhomHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tthcPhanNhomHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tthcPhanNhomHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tthcPhanNhomHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tthcPhanNhomHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tthcPhanNhomHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tthcPhanNhomHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tthcPhanNhomHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tthcPhanNhomHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TthcPhanNhomHoSoWrapper((TthcPhanNhomHoSo)_tthcPhanNhomHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		return _tthcPhanNhomHoSo.compareTo(tthcPhanNhomHoSo);
	}

	@Override
	public int hashCode() {
		return _tthcPhanNhomHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo> toCacheModel() {
		return _tthcPhanNhomHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo toEscapedModel() {
		return new TthcPhanNhomHoSoWrapper(_tthcPhanNhomHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo toUnescapedModel() {
		return new TthcPhanNhomHoSoWrapper(_tthcPhanNhomHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tthcPhanNhomHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tthcPhanNhomHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tthcPhanNhomHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcPhanNhomHoSoWrapper)) {
			return false;
		}

		TthcPhanNhomHoSoWrapper tthcPhanNhomHoSoWrapper = (TthcPhanNhomHoSoWrapper)obj;

		if (Validator.equals(_tthcPhanNhomHoSo,
					tthcPhanNhomHoSoWrapper._tthcPhanNhomHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TthcPhanNhomHoSo getWrappedTthcPhanNhomHoSo() {
		return _tthcPhanNhomHoSo;
	}

	@Override
	public TthcPhanNhomHoSo getWrappedModel() {
		return _tthcPhanNhomHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_tthcPhanNhomHoSo.resetOriginalValues();
	}

	private TthcPhanNhomHoSo _tthcPhanNhomHoSo;
}