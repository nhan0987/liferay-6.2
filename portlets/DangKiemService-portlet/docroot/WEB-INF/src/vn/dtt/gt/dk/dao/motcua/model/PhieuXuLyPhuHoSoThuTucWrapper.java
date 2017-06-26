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
 * This class is a wrapper for {@link PhieuXuLyPhuHoSoThuTuc}.
 * </p>
 *
 * @author huymq
 * @see PhieuXuLyPhuHoSoThuTuc
 * @generated
 */
public class PhieuXuLyPhuHoSoThuTucWrapper implements PhieuXuLyPhuHoSoThuTuc,
	ModelWrapper<PhieuXuLyPhuHoSoThuTuc> {
	public PhieuXuLyPhuHoSoThuTucWrapper(
		PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc) {
		_phieuXuLyPhuHoSoThuTuc = phieuXuLyPhuHoSoThuTuc;
	}

	@Override
	public Class<?> getModelClass() {
		return PhieuXuLyPhuHoSoThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return PhieuXuLyPhuHoSoThuTuc.class.getName();
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
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("maBienNhan", getMaBienNhan());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("tenChuHoSo", getTenChuHoSo());
		attributes.put("ngayGuiHoSo", getNgayGuiHoSo());
		attributes.put("tenDonViTiepNhan", getTenDonViTiepNhan());

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

		String maSoHoSo = (String)attributes.get("maSoHoSo");

		if (maSoHoSo != null) {
			setMaSoHoSo(maSoHoSo);
		}

		String maBienNhan = (String)attributes.get("maBienNhan");

		if (maBienNhan != null) {
			setMaBienNhan(maBienNhan);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		String tenChuHoSo = (String)attributes.get("tenChuHoSo");

		if (tenChuHoSo != null) {
			setTenChuHoSo(tenChuHoSo);
		}

		Date ngayGuiHoSo = (Date)attributes.get("ngayGuiHoSo");

		if (ngayGuiHoSo != null) {
			setNgayGuiHoSo(ngayGuiHoSo);
		}

		String tenDonViTiepNhan = (String)attributes.get("tenDonViTiepNhan");

		if (tenDonViTiepNhan != null) {
			setTenDonViTiepNhan(tenDonViTiepNhan);
		}
	}

	/**
	* Returns the primary key of this phieu xu ly phu ho so thu tuc.
	*
	* @return the primary key of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getPrimaryKey() {
		return _phieuXuLyPhuHoSoThuTuc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phieu xu ly phu ho so thu tuc.
	*
	* @param primaryKey the primary key of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phieuXuLyPhuHoSoThuTuc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getId() {
		return _phieuXuLyPhuHoSoThuTuc.getId();
	}

	/**
	* Sets the ID of this phieu xu ly phu ho so thu tuc.
	*
	* @param id the ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setId(long id) {
		_phieuXuLyPhuHoSoThuTuc.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc.
	*
	* @return the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _phieuXuLyPhuHoSoThuTuc.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phieuXuLyPhuHoSoThuTuc.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the trich yeu noi dung of this phieu xu ly phu ho so thu tuc.
	*
	* @return the trich yeu noi dung of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _phieuXuLyPhuHoSoThuTuc.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this phieu xu ly phu ho so thu tuc.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_phieuXuLyPhuHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ghi chu of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ghi chu of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _phieuXuLyPhuHoSoThuTuc.getGhiChu();
	}

	/**
	* Sets the ghi chu of this phieu xu ly phu ho so thu tuc.
	*
	* @param ghiChu the ghi chu of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_phieuXuLyPhuHoSoThuTuc.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc.
	*
	* @return the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _phieuXuLyPhuHoSoThuTuc.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_phieuXuLyPhuHoSoThuTuc.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the noi dung ho so ID of this phieu xu ly phu ho so thu tuc.
	*
	* @return the noi dung ho so ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _phieuXuLyPhuHoSoThuTuc.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this phieu xu ly phu ho so thu tuc.
	*
	* @param noiDungHoSoId the noi dung ho so ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_phieuXuLyPhuHoSoThuTuc.setNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	* Returns the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc.
	*
	* @return the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _phieuXuLyPhuHoSoThuTuc.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_phieuXuLyPhuHoSoThuTuc.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the ngay tao phieu of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ngay tao phieu of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayTaoPhieu() {
		return _phieuXuLyPhuHoSoThuTuc.getNgayTaoPhieu();
	}

	/**
	* Sets the ngay tao phieu of this phieu xu ly phu ho so thu tuc.
	*
	* @param ngayTaoPhieu the ngay tao phieu of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setNgayTaoPhieu(java.util.Date ngayTaoPhieu) {
		_phieuXuLyPhuHoSoThuTuc.setNgayTaoPhieu(ngayTaoPhieu);
	}

	/**
	* Returns the nguoi tao phieu of this phieu xu ly phu ho so thu tuc.
	*
	* @return the nguoi tao phieu of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getNguoiTaoPhieu() {
		return _phieuXuLyPhuHoSoThuTuc.getNguoiTaoPhieu();
	}

	/**
	* Sets the nguoi tao phieu of this phieu xu ly phu ho so thu tuc.
	*
	* @param nguoiTaoPhieu the nguoi tao phieu of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_phieuXuLyPhuHoSoThuTuc.setNguoiTaoPhieu(nguoiTaoPhieu);
	}

	/**
	* Returns the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc.
	*
	* @return the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.lang.String getNhomPhieuXuLy() {
		return _phieuXuLyPhuHoSoThuTuc.getNhomPhieuXuLy();
	}

	/**
	* Sets the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc.
	*
	* @param nhomPhieuXuLy the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setNhomPhieuXuLy(java.lang.String nhomPhieuXuLy) {
		_phieuXuLyPhuHoSoThuTuc.setNhomPhieuXuLy(nhomPhieuXuLy);
	}

	/**
	* Returns the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc.
	*
	* @return the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _phieuXuLyPhuHoSoThuTuc.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phieuXuLyPhuHoSoThuTuc.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the ma so ho so of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ma so ho so of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _phieuXuLyPhuHoSoThuTuc.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this phieu xu ly phu ho so thu tuc.
	*
	* @param maSoHoSo the ma so ho so of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_phieuXuLyPhuHoSoThuTuc.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ma bien nhan of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _phieuXuLyPhuHoSoThuTuc.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this phieu xu ly phu ho so thu tuc.
	*
	* @param maBienNhan the ma bien nhan of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setMaBienNhan(java.lang.String maBienNhan) {
		_phieuXuLyPhuHoSoThuTuc.setMaBienNhan(maBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc.
	*
	* @return the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _phieuXuLyPhuHoSoThuTuc.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_phieuXuLyPhuHoSoThuTuc.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the ten chu ho so of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ten chu ho so of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _phieuXuLyPhuHoSoThuTuc.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this phieu xu ly phu ho so thu tuc.
	*
	* @param tenChuHoSo the ten chu ho so of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setTenChuHoSo(java.lang.String tenChuHoSo) {
		_phieuXuLyPhuHoSoThuTuc.setTenChuHoSo(tenChuHoSo);
	}

	/**
	* Returns the ngay gui ho so of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ngay gui ho so of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _phieuXuLyPhuHoSoThuTuc.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this phieu xu ly phu ho so thu tuc.
	*
	* @param ngayGuiHoSo the ngay gui ho so of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date ngayGuiHoSo) {
		_phieuXuLyPhuHoSoThuTuc.setNgayGuiHoSo(ngayGuiHoSo);
	}

	/**
	* Returns the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc.
	*
	* @return the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public java.lang.String getTenDonViTiepNhan() {
		return _phieuXuLyPhuHoSoThuTuc.getTenDonViTiepNhan();
	}

	/**
	* Sets the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc.
	*
	* @param tenDonViTiepNhan the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc
	*/
	@Override
	public void setTenDonViTiepNhan(java.lang.String tenDonViTiepNhan) {
		_phieuXuLyPhuHoSoThuTuc.setTenDonViTiepNhan(tenDonViTiepNhan);
	}

	@Override
	public boolean isNew() {
		return _phieuXuLyPhuHoSoThuTuc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phieuXuLyPhuHoSoThuTuc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phieuXuLyPhuHoSoThuTuc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phieuXuLyPhuHoSoThuTuc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phieuXuLyPhuHoSoThuTuc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phieuXuLyPhuHoSoThuTuc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phieuXuLyPhuHoSoThuTuc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phieuXuLyPhuHoSoThuTuc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phieuXuLyPhuHoSoThuTuc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phieuXuLyPhuHoSoThuTuc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phieuXuLyPhuHoSoThuTuc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhieuXuLyPhuHoSoThuTucWrapper((PhieuXuLyPhuHoSoThuTuc)_phieuXuLyPhuHoSoThuTuc.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc) {
		return _phieuXuLyPhuHoSoThuTuc.compareTo(phieuXuLyPhuHoSoThuTuc);
	}

	@Override
	public int hashCode() {
		return _phieuXuLyPhuHoSoThuTuc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc> toCacheModel() {
		return _phieuXuLyPhuHoSoThuTuc.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc toEscapedModel() {
		return new PhieuXuLyPhuHoSoThuTucWrapper(_phieuXuLyPhuHoSoThuTuc.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc toUnescapedModel() {
		return new PhieuXuLyPhuHoSoThuTucWrapper(_phieuXuLyPhuHoSoThuTuc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phieuXuLyPhuHoSoThuTuc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phieuXuLyPhuHoSoThuTuc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phieuXuLyPhuHoSoThuTuc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhieuXuLyPhuHoSoThuTucWrapper)) {
			return false;
		}

		PhieuXuLyPhuHoSoThuTucWrapper phieuXuLyPhuHoSoThuTucWrapper = (PhieuXuLyPhuHoSoThuTucWrapper)obj;

		if (Validator.equals(_phieuXuLyPhuHoSoThuTuc,
					phieuXuLyPhuHoSoThuTucWrapper._phieuXuLyPhuHoSoThuTuc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PhieuXuLyPhuHoSoThuTuc getWrappedPhieuXuLyPhuHoSoThuTuc() {
		return _phieuXuLyPhuHoSoThuTuc;
	}

	@Override
	public PhieuXuLyPhuHoSoThuTuc getWrappedModel() {
		return _phieuXuLyPhuHoSoThuTuc;
	}

	@Override
	public void resetOriginalValues() {
		_phieuXuLyPhuHoSoThuTuc.resetOriginalValues();
	}

	private PhieuXuLyPhuHoSoThuTuc _phieuXuLyPhuHoSoThuTuc;
}