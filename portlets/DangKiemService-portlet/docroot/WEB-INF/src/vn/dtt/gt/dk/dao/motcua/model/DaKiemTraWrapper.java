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
 * This class is a wrapper for {@link DaKiemTra}.
 * </p>
 *
 * @author huymq
 * @see DaKiemTra
 * @generated
 */
public class DaKiemTraWrapper implements DaKiemTra, ModelWrapper<DaKiemTra> {
	public DaKiemTraWrapper(DaKiemTra daKiemTra) {
		_daKiemTra = daKiemTra;
	}

	@Override
	public Class<?> getModelClass() {
		return DaKiemTra.class;
	}

	@Override
	public String getModelClassName() {
		return DaKiemTra.class.getName();
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
	* Returns the primary key of this da kiem tra.
	*
	* @return the primary key of this da kiem tra
	*/
	@Override
	public long getPrimaryKey() {
		return _daKiemTra.getPrimaryKey();
	}

	/**
	* Sets the primary key of this da kiem tra.
	*
	* @param primaryKey the primary key of this da kiem tra
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_daKiemTra.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this da kiem tra.
	*
	* @return the ID of this da kiem tra
	*/
	@Override
	public long getId() {
		return _daKiemTra.getId();
	}

	/**
	* Sets the ID of this da kiem tra.
	*
	* @param id the ID of this da kiem tra
	*/
	@Override
	public void setId(long id) {
		_daKiemTra.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this da kiem tra.
	*
	* @return the phieu xu ly chinh ID of this da kiem tra
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _daKiemTra.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this da kiem tra.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this da kiem tra
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_daKiemTra.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the trich yeu noi dung of this da kiem tra.
	*
	* @return the trich yeu noi dung of this da kiem tra
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _daKiemTra.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this da kiem tra.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this da kiem tra
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_daKiemTra.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ghi chu of this da kiem tra.
	*
	* @return the ghi chu of this da kiem tra
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _daKiemTra.getGhiChu();
	}

	/**
	* Sets the ghi chu of this da kiem tra.
	*
	* @param ghiChu the ghi chu of this da kiem tra
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_daKiemTra.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai hien tai ID of this da kiem tra.
	*
	* @return the trang thai hien tai ID of this da kiem tra
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _daKiemTra.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this da kiem tra.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this da kiem tra
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_daKiemTra.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the noi dung ho so ID of this da kiem tra.
	*
	* @return the noi dung ho so ID of this da kiem tra
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _daKiemTra.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this da kiem tra.
	*
	* @param noiDungHoSoId the noi dung ho so ID of this da kiem tra
	*/
	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_daKiemTra.setNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	* Returns the chiem quyen xu ly of this da kiem tra.
	*
	* @return the chiem quyen xu ly of this da kiem tra
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _daKiemTra.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this da kiem tra.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this da kiem tra
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_daKiemTra.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the ngay tao phieu of this da kiem tra.
	*
	* @return the ngay tao phieu of this da kiem tra
	*/
	@Override
	public java.util.Date getNgayTaoPhieu() {
		return _daKiemTra.getNgayTaoPhieu();
	}

	/**
	* Sets the ngay tao phieu of this da kiem tra.
	*
	* @param ngayTaoPhieu the ngay tao phieu of this da kiem tra
	*/
	@Override
	public void setNgayTaoPhieu(java.util.Date ngayTaoPhieu) {
		_daKiemTra.setNgayTaoPhieu(ngayTaoPhieu);
	}

	/**
	* Returns the nguoi tao phieu of this da kiem tra.
	*
	* @return the nguoi tao phieu of this da kiem tra
	*/
	@Override
	public long getNguoiTaoPhieu() {
		return _daKiemTra.getNguoiTaoPhieu();
	}

	/**
	* Sets the nguoi tao phieu of this da kiem tra.
	*
	* @param nguoiTaoPhieu the nguoi tao phieu of this da kiem tra
	*/
	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_daKiemTra.setNguoiTaoPhieu(nguoiTaoPhieu);
	}

	/**
	* Returns the nhom phieu xu ly of this da kiem tra.
	*
	* @return the nhom phieu xu ly of this da kiem tra
	*/
	@Override
	public java.lang.String getNhomPhieuXuLy() {
		return _daKiemTra.getNhomPhieuXuLy();
	}

	/**
	* Sets the nhom phieu xu ly of this da kiem tra.
	*
	* @param nhomPhieuXuLy the nhom phieu xu ly of this da kiem tra
	*/
	@Override
	public void setNhomPhieuXuLy(java.lang.String nhomPhieuXuLy) {
		_daKiemTra.setNhomPhieuXuLy(nhomPhieuXuLy);
	}

	/**
	* Returns the phan nhom ho so ID of this da kiem tra.
	*
	* @return the phan nhom ho so ID of this da kiem tra
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _daKiemTra.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this da kiem tra.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this da kiem tra
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_daKiemTra.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the ma so ho so of this da kiem tra.
	*
	* @return the ma so ho so of this da kiem tra
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _daKiemTra.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this da kiem tra.
	*
	* @param maSoHoSo the ma so ho so of this da kiem tra
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_daKiemTra.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this da kiem tra.
	*
	* @return the ma bien nhan of this da kiem tra
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _daKiemTra.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this da kiem tra.
	*
	* @param maBienNhan the ma bien nhan of this da kiem tra
	*/
	@Override
	public void setMaBienNhan(java.lang.String maBienNhan) {
		_daKiemTra.setMaBienNhan(maBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this da kiem tra.
	*
	* @return the thu tuc hanh chinh ID of this da kiem tra
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _daKiemTra.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this da kiem tra.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this da kiem tra
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_daKiemTra.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the ten chu ho so of this da kiem tra.
	*
	* @return the ten chu ho so of this da kiem tra
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _daKiemTra.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this da kiem tra.
	*
	* @param tenChuHoSo the ten chu ho so of this da kiem tra
	*/
	@Override
	public void setTenChuHoSo(java.lang.String tenChuHoSo) {
		_daKiemTra.setTenChuHoSo(tenChuHoSo);
	}

	/**
	* Returns the ngay gui ho so of this da kiem tra.
	*
	* @return the ngay gui ho so of this da kiem tra
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _daKiemTra.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this da kiem tra.
	*
	* @param ngayGuiHoSo the ngay gui ho so of this da kiem tra
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date ngayGuiHoSo) {
		_daKiemTra.setNgayGuiHoSo(ngayGuiHoSo);
	}

	/**
	* Returns the ten don vi tiep nhan of this da kiem tra.
	*
	* @return the ten don vi tiep nhan of this da kiem tra
	*/
	@Override
	public java.lang.String getTenDonViTiepNhan() {
		return _daKiemTra.getTenDonViTiepNhan();
	}

	/**
	* Sets the ten don vi tiep nhan of this da kiem tra.
	*
	* @param tenDonViTiepNhan the ten don vi tiep nhan of this da kiem tra
	*/
	@Override
	public void setTenDonViTiepNhan(java.lang.String tenDonViTiepNhan) {
		_daKiemTra.setTenDonViTiepNhan(tenDonViTiepNhan);
	}

	@Override
	public boolean isNew() {
		return _daKiemTra.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_daKiemTra.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _daKiemTra.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_daKiemTra.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _daKiemTra.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _daKiemTra.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_daKiemTra.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _daKiemTra.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_daKiemTra.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_daKiemTra.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_daKiemTra.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DaKiemTraWrapper((DaKiemTra)_daKiemTra.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.motcua.model.DaKiemTra daKiemTra) {
		return _daKiemTra.compareTo(daKiemTra);
	}

	@Override
	public int hashCode() {
		return _daKiemTra.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> toCacheModel() {
		return _daKiemTra.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra toEscapedModel() {
		return new DaKiemTraWrapper(_daKiemTra.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra toUnescapedModel() {
		return new DaKiemTraWrapper(_daKiemTra.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _daKiemTra.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _daKiemTra.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_daKiemTra.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DaKiemTraWrapper)) {
			return false;
		}

		DaKiemTraWrapper daKiemTraWrapper = (DaKiemTraWrapper)obj;

		if (Validator.equals(_daKiemTra, daKiemTraWrapper._daKiemTra)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DaKiemTra getWrappedDaKiemTra() {
		return _daKiemTra;
	}

	@Override
	public DaKiemTra getWrappedModel() {
		return _daKiemTra;
	}

	@Override
	public void resetOriginalValues() {
		_daKiemTra.resetOriginalValues();
	}

	private DaKiemTra _daKiemTra;
}