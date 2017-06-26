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
 * This class is a wrapper for {@link MotCuaDienBienHoSo}.
 * </p>
 *
 * @author huymq
 * @see MotCuaDienBienHoSo
 * @generated
 */
public class MotCuaDienBienHoSoWrapper implements MotCuaDienBienHoSo,
	ModelWrapper<MotCuaDienBienHoSo> {
	public MotCuaDienBienHoSoWrapper(MotCuaDienBienHoSo motCuaDienBienHoSo) {
		_motCuaDienBienHoSo = motCuaDienBienHoSo;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaDienBienHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaDienBienHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("soNgayQuaHan", getSoNgayQuaHan());
		attributes.put("trangThaiTruocId", getTrangThaiTruocId());
		attributes.put("trangThaiSauId", getTrangThaiSauId());
		attributes.put("ngayXuLy", getNgayXuLy());
		attributes.put("nguoiXuLy", getNguoiXuLy());
		attributes.put("hanhDongXuLy", getHanhDongXuLy());
		attributes.put("synchdate", getSynchdate());

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

		Integer soNgayQuaHan = (Integer)attributes.get("soNgayQuaHan");

		if (soNgayQuaHan != null) {
			setSoNgayQuaHan(soNgayQuaHan);
		}

		Long trangThaiTruocId = (Long)attributes.get("trangThaiTruocId");

		if (trangThaiTruocId != null) {
			setTrangThaiTruocId(trangThaiTruocId);
		}

		Long trangThaiSauId = (Long)attributes.get("trangThaiSauId");

		if (trangThaiSauId != null) {
			setTrangThaiSauId(trangThaiSauId);
		}

		Date ngayXuLy = (Date)attributes.get("ngayXuLy");

		if (ngayXuLy != null) {
			setNgayXuLy(ngayXuLy);
		}

		Long nguoiXuLy = (Long)attributes.get("nguoiXuLy");

		if (nguoiXuLy != null) {
			setNguoiXuLy(nguoiXuLy);
		}

		String hanhDongXuLy = (String)attributes.get("hanhDongXuLy");

		if (hanhDongXuLy != null) {
			setHanhDongXuLy(hanhDongXuLy);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this mot cua dien bien ho so.
	*
	* @return the primary key of this mot cua dien bien ho so
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaDienBienHoSo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua dien bien ho so.
	*
	* @param primaryKey the primary key of this mot cua dien bien ho so
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaDienBienHoSo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua dien bien ho so.
	*
	* @return the ID of this mot cua dien bien ho so
	*/
	@Override
	public long getId() {
		return _motCuaDienBienHoSo.getId();
	}

	/**
	* Sets the ID of this mot cua dien bien ho so.
	*
	* @param id the ID of this mot cua dien bien ho so
	*/
	@Override
	public void setId(long id) {
		_motCuaDienBienHoSo.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this mot cua dien bien ho so.
	*
	* @return the phieu xu ly chinh ID of this mot cua dien bien ho so
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _motCuaDienBienHoSo.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this mot cua dien bien ho so.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this mot cua dien bien ho so
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_motCuaDienBienHoSo.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the phieu xu ly phu ID of this mot cua dien bien ho so.
	*
	* @return the phieu xu ly phu ID of this mot cua dien bien ho so
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _motCuaDienBienHoSo.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this mot cua dien bien ho so.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this mot cua dien bien ho so
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_motCuaDienBienHoSo.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the so ngay qua han of this mot cua dien bien ho so.
	*
	* @return the so ngay qua han of this mot cua dien bien ho so
	*/
	@Override
	public int getSoNgayQuaHan() {
		return _motCuaDienBienHoSo.getSoNgayQuaHan();
	}

	/**
	* Sets the so ngay qua han of this mot cua dien bien ho so.
	*
	* @param soNgayQuaHan the so ngay qua han of this mot cua dien bien ho so
	*/
	@Override
	public void setSoNgayQuaHan(int soNgayQuaHan) {
		_motCuaDienBienHoSo.setSoNgayQuaHan(soNgayQuaHan);
	}

	/**
	* Returns the trang thai truoc ID of this mot cua dien bien ho so.
	*
	* @return the trang thai truoc ID of this mot cua dien bien ho so
	*/
	@Override
	public long getTrangThaiTruocId() {
		return _motCuaDienBienHoSo.getTrangThaiTruocId();
	}

	/**
	* Sets the trang thai truoc ID of this mot cua dien bien ho so.
	*
	* @param trangThaiTruocId the trang thai truoc ID of this mot cua dien bien ho so
	*/
	@Override
	public void setTrangThaiTruocId(long trangThaiTruocId) {
		_motCuaDienBienHoSo.setTrangThaiTruocId(trangThaiTruocId);
	}

	/**
	* Returns the trang thai sau ID of this mot cua dien bien ho so.
	*
	* @return the trang thai sau ID of this mot cua dien bien ho so
	*/
	@Override
	public long getTrangThaiSauId() {
		return _motCuaDienBienHoSo.getTrangThaiSauId();
	}

	/**
	* Sets the trang thai sau ID of this mot cua dien bien ho so.
	*
	* @param trangThaiSauId the trang thai sau ID of this mot cua dien bien ho so
	*/
	@Override
	public void setTrangThaiSauId(long trangThaiSauId) {
		_motCuaDienBienHoSo.setTrangThaiSauId(trangThaiSauId);
	}

	/**
	* Returns the ngay xu ly of this mot cua dien bien ho so.
	*
	* @return the ngay xu ly of this mot cua dien bien ho so
	*/
	@Override
	public java.util.Date getNgayXuLy() {
		return _motCuaDienBienHoSo.getNgayXuLy();
	}

	/**
	* Sets the ngay xu ly of this mot cua dien bien ho so.
	*
	* @param ngayXuLy the ngay xu ly of this mot cua dien bien ho so
	*/
	@Override
	public void setNgayXuLy(java.util.Date ngayXuLy) {
		_motCuaDienBienHoSo.setNgayXuLy(ngayXuLy);
	}

	/**
	* Returns the nguoi xu ly of this mot cua dien bien ho so.
	*
	* @return the nguoi xu ly of this mot cua dien bien ho so
	*/
	@Override
	public long getNguoiXuLy() {
		return _motCuaDienBienHoSo.getNguoiXuLy();
	}

	/**
	* Sets the nguoi xu ly of this mot cua dien bien ho so.
	*
	* @param nguoiXuLy the nguoi xu ly of this mot cua dien bien ho so
	*/
	@Override
	public void setNguoiXuLy(long nguoiXuLy) {
		_motCuaDienBienHoSo.setNguoiXuLy(nguoiXuLy);
	}

	/**
	* Returns the hanh dong xu ly of this mot cua dien bien ho so.
	*
	* @return the hanh dong xu ly of this mot cua dien bien ho so
	*/
	@Override
	public java.lang.String getHanhDongXuLy() {
		return _motCuaDienBienHoSo.getHanhDongXuLy();
	}

	/**
	* Sets the hanh dong xu ly of this mot cua dien bien ho so.
	*
	* @param hanhDongXuLy the hanh dong xu ly of this mot cua dien bien ho so
	*/
	@Override
	public void setHanhDongXuLy(java.lang.String hanhDongXuLy) {
		_motCuaDienBienHoSo.setHanhDongXuLy(hanhDongXuLy);
	}

	/**
	* Returns the synchdate of this mot cua dien bien ho so.
	*
	* @return the synchdate of this mot cua dien bien ho so
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _motCuaDienBienHoSo.getSynchdate();
	}

	/**
	* Sets the synchdate of this mot cua dien bien ho so.
	*
	* @param synchdate the synchdate of this mot cua dien bien ho so
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_motCuaDienBienHoSo.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _motCuaDienBienHoSo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaDienBienHoSo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaDienBienHoSo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaDienBienHoSo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaDienBienHoSo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaDienBienHoSo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaDienBienHoSo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaDienBienHoSo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaDienBienHoSo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaDienBienHoSo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaDienBienHoSo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaDienBienHoSoWrapper((MotCuaDienBienHoSo)_motCuaDienBienHoSo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo) {
		return _motCuaDienBienHoSo.compareTo(motCuaDienBienHoSo);
	}

	@Override
	public int hashCode() {
		return _motCuaDienBienHoSo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> toCacheModel() {
		return _motCuaDienBienHoSo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo toEscapedModel() {
		return new MotCuaDienBienHoSoWrapper(_motCuaDienBienHoSo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo toUnescapedModel() {
		return new MotCuaDienBienHoSoWrapper(_motCuaDienBienHoSo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaDienBienHoSo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaDienBienHoSo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaDienBienHoSo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaDienBienHoSoWrapper)) {
			return false;
		}

		MotCuaDienBienHoSoWrapper motCuaDienBienHoSoWrapper = (MotCuaDienBienHoSoWrapper)obj;

		if (Validator.equals(_motCuaDienBienHoSo,
					motCuaDienBienHoSoWrapper._motCuaDienBienHoSo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaDienBienHoSo getWrappedMotCuaDienBienHoSo() {
		return _motCuaDienBienHoSo;
	}

	@Override
	public MotCuaDienBienHoSo getWrappedModel() {
		return _motCuaDienBienHoSo;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaDienBienHoSo.resetOriginalValues();
	}

	private MotCuaDienBienHoSo _motCuaDienBienHoSo;
}