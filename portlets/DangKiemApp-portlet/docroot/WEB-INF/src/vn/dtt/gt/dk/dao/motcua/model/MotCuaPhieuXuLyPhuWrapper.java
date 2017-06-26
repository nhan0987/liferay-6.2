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
 * This class is a wrapper for {@link MotCuaPhieuXuLyPhu}.
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPhu
 * @generated
 */
public class MotCuaPhieuXuLyPhuWrapper implements MotCuaPhieuXuLyPhu,
	ModelWrapper<MotCuaPhieuXuLyPhu> {
	public MotCuaPhieuXuLyPhuWrapper(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		_motCuaPhieuXuLyPhu = motCuaPhieuXuLyPhu;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaPhieuXuLyPhu.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaPhieuXuLyPhu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("trichYeuNoiDung", getTrichYeuNoiDung());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThaiHienTaiId", getTrangThaiHienTaiId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());
		attributes.put("chiemQuyenXuLy", getChiemQuyenXuLy());
		attributes.put("ngayTaoPhieu", getNgayTaoPhieu());
		attributes.put("nguoiTaoPhieu", getNguoiTaoPhieu());
		attributes.put("nhomPhieuXuLy", getNhomPhieuXuLy());
		attributes.put("phanNhomHoSoId", getPhanNhomHoSoId());

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

		String trichYeuNoiDung = (String)attributes.get("trichYeuNoiDung");

		if (trichYeuNoiDung != null) {
			setTrichYeuNoiDung(trichYeuNoiDung);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Long trangThaiHienTaiId = (Long)attributes.get("trangThaiHienTaiId");

		if (trangThaiHienTaiId != null) {
			setTrangThaiHienTaiId(trangThaiHienTaiId);
		}

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
		}

		Long chiemQuyenXuLy = (Long)attributes.get("chiemQuyenXuLy");

		if (chiemQuyenXuLy != null) {
			setChiemQuyenXuLy(chiemQuyenXuLy);
		}

		Date ngayTaoPhieu = (Date)attributes.get("ngayTaoPhieu");

		if (ngayTaoPhieu != null) {
			setNgayTaoPhieu(ngayTaoPhieu);
		}

		Long nguoiTaoPhieu = (Long)attributes.get("nguoiTaoPhieu");

		if (nguoiTaoPhieu != null) {
			setNguoiTaoPhieu(nguoiTaoPhieu);
		}

		String nhomPhieuXuLy = (String)attributes.get("nhomPhieuXuLy");

		if (nhomPhieuXuLy != null) {
			setNhomPhieuXuLy(nhomPhieuXuLy);
		}

		Long phanNhomHoSoId = (Long)attributes.get("phanNhomHoSoId");

		if (phanNhomHoSoId != null) {
			setPhanNhomHoSoId(phanNhomHoSoId);
		}
	}

	/**
	* Returns the primary key of this mot cua phieu xu ly phu.
	*
	* @return the primary key of this mot cua phieu xu ly phu
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaPhieuXuLyPhu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua phieu xu ly phu.
	*
	* @param primaryKey the primary key of this mot cua phieu xu ly phu
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaPhieuXuLyPhu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua phieu xu ly phu.
	*
	* @return the ID of this mot cua phieu xu ly phu
	*/
	@Override
	public long getId() {
		return _motCuaPhieuXuLyPhu.getId();
	}

	/**
	* Sets the ID of this mot cua phieu xu ly phu.
	*
	* @param id the ID of this mot cua phieu xu ly phu
	*/
	@Override
	public void setId(long id) {
		_motCuaPhieuXuLyPhu.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this mot cua phieu xu ly phu.
	*
	* @return the phieu xu ly chinh ID of this mot cua phieu xu ly phu
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _motCuaPhieuXuLyPhu.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this mot cua phieu xu ly phu.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this mot cua phieu xu ly phu
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_motCuaPhieuXuLyPhu.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the trich yeu noi dung of this mot cua phieu xu ly phu.
	*
	* @return the trich yeu noi dung of this mot cua phieu xu ly phu
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _motCuaPhieuXuLyPhu.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this mot cua phieu xu ly phu.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this mot cua phieu xu ly phu
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_motCuaPhieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ghi chu of this mot cua phieu xu ly phu.
	*
	* @return the ghi chu of this mot cua phieu xu ly phu
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _motCuaPhieuXuLyPhu.getGhiChu();
	}

	/**
	* Sets the ghi chu of this mot cua phieu xu ly phu.
	*
	* @param ghiChu the ghi chu of this mot cua phieu xu ly phu
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai hien tai ID of this mot cua phieu xu ly phu.
	*
	* @return the trang thai hien tai ID of this mot cua phieu xu ly phu
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _motCuaPhieuXuLyPhu.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this mot cua phieu xu ly phu.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this mot cua phieu xu ly phu
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the noi dung ho so ID of this mot cua phieu xu ly phu.
	*
	* @return the noi dung ho so ID of this mot cua phieu xu ly phu
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _motCuaPhieuXuLyPhu.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this mot cua phieu xu ly phu.
	*
	* @param noiDungHoSoId the noi dung ho so ID of this mot cua phieu xu ly phu
	*/
	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_motCuaPhieuXuLyPhu.setNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	* Returns the chiem quyen xu ly of this mot cua phieu xu ly phu.
	*
	* @return the chiem quyen xu ly of this mot cua phieu xu ly phu
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _motCuaPhieuXuLyPhu.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this mot cua phieu xu ly phu.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this mot cua phieu xu ly phu
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_motCuaPhieuXuLyPhu.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the ngay tao phieu of this mot cua phieu xu ly phu.
	*
	* @return the ngay tao phieu of this mot cua phieu xu ly phu
	*/
	@Override
	public java.util.Date getNgayTaoPhieu() {
		return _motCuaPhieuXuLyPhu.getNgayTaoPhieu();
	}

	/**
	* Sets the ngay tao phieu of this mot cua phieu xu ly phu.
	*
	* @param ngayTaoPhieu the ngay tao phieu of this mot cua phieu xu ly phu
	*/
	@Override
	public void setNgayTaoPhieu(java.util.Date ngayTaoPhieu) {
		_motCuaPhieuXuLyPhu.setNgayTaoPhieu(ngayTaoPhieu);
	}

	/**
	* Returns the nguoi tao phieu of this mot cua phieu xu ly phu.
	*
	* @return the nguoi tao phieu of this mot cua phieu xu ly phu
	*/
	@Override
	public long getNguoiTaoPhieu() {
		return _motCuaPhieuXuLyPhu.getNguoiTaoPhieu();
	}

	/**
	* Sets the nguoi tao phieu of this mot cua phieu xu ly phu.
	*
	* @param nguoiTaoPhieu the nguoi tao phieu of this mot cua phieu xu ly phu
	*/
	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_motCuaPhieuXuLyPhu.setNguoiTaoPhieu(nguoiTaoPhieu);
	}

	/**
	* Returns the nhom phieu xu ly of this mot cua phieu xu ly phu.
	*
	* @return the nhom phieu xu ly of this mot cua phieu xu ly phu
	*/
	@Override
	public java.lang.String getNhomPhieuXuLy() {
		return _motCuaPhieuXuLyPhu.getNhomPhieuXuLy();
	}

	/**
	* Sets the nhom phieu xu ly of this mot cua phieu xu ly phu.
	*
	* @param nhomPhieuXuLy the nhom phieu xu ly of this mot cua phieu xu ly phu
	*/
	@Override
	public void setNhomPhieuXuLy(java.lang.String nhomPhieuXuLy) {
		_motCuaPhieuXuLyPhu.setNhomPhieuXuLy(nhomPhieuXuLy);
	}

	/**
	* Returns the phan nhom ho so ID of this mot cua phieu xu ly phu.
	*
	* @return the phan nhom ho so ID of this mot cua phieu xu ly phu
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _motCuaPhieuXuLyPhu.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this mot cua phieu xu ly phu.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this mot cua phieu xu ly phu
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_motCuaPhieuXuLyPhu.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	@Override
	public boolean isNew() {
		return _motCuaPhieuXuLyPhu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaPhieuXuLyPhu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaPhieuXuLyPhu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaPhieuXuLyPhu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaPhieuXuLyPhu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaPhieuXuLyPhu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaPhieuXuLyPhu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaPhieuXuLyPhu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaPhieuXuLyPhu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaPhieuXuLyPhu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaPhieuXuLyPhu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaPhieuXuLyPhuWrapper((MotCuaPhieuXuLyPhu)_motCuaPhieuXuLyPhu.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		return _motCuaPhieuXuLyPhu.compareTo(motCuaPhieuXuLyPhu);
	}

	@Override
	public int hashCode() {
		return _motCuaPhieuXuLyPhu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> toCacheModel() {
		return _motCuaPhieuXuLyPhu.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu toEscapedModel() {
		return new MotCuaPhieuXuLyPhuWrapper(_motCuaPhieuXuLyPhu.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu toUnescapedModel() {
		return new MotCuaPhieuXuLyPhuWrapper(_motCuaPhieuXuLyPhu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaPhieuXuLyPhu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaPhieuXuLyPhu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaPhieuXuLyPhu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaPhieuXuLyPhuWrapper)) {
			return false;
		}

		MotCuaPhieuXuLyPhuWrapper motCuaPhieuXuLyPhuWrapper = (MotCuaPhieuXuLyPhuWrapper)obj;

		if (Validator.equals(_motCuaPhieuXuLyPhu,
					motCuaPhieuXuLyPhuWrapper._motCuaPhieuXuLyPhu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaPhieuXuLyPhu getWrappedMotCuaPhieuXuLyPhu() {
		return _motCuaPhieuXuLyPhu;
	}

	@Override
	public MotCuaPhieuXuLyPhu getWrappedModel() {
		return _motCuaPhieuXuLyPhu;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaPhieuXuLyPhu.resetOriginalValues();
	}

	private MotCuaPhieuXuLyPhu _motCuaPhieuXuLyPhu;
}