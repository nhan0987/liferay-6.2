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
 * This class is a wrapper for {@link PhanCongDonViKiemTra}.
 * </p>
 *
 * @author huymq
 * @see PhanCongDonViKiemTra
 * @generated
 */
public class PhanCongDonViKiemTraWrapper implements PhanCongDonViKiemTra,
	ModelWrapper<PhanCongDonViKiemTra> {
	public PhanCongDonViKiemTraWrapper(
		PhanCongDonViKiemTra phanCongDonViKiemTra) {
		_phanCongDonViKiemTra = phanCongDonViKiemTra;
	}

	@Override
	public Class<?> getModelClass() {
		return PhanCongDonViKiemTra.class;
	}

	@Override
	public String getModelClassName() {
		return PhanCongDonViKiemTra.class.getName();
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
		attributes.put("confirmedinspectionId", getConfirmedinspectionId());
		attributes.put("maSoHoSo", getMaSoHoSo());
		attributes.put("maBienNhan", getMaBienNhan());
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("tenChuHoSo", getTenChuHoSo());
		attributes.put("ngayGuiHoSo", getNgayGuiHoSo());
		attributes.put("tenDonViTiepNhan", getTenDonViTiepNhan());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("inspectionDistrictCode", getInspectionDistrictCode());
		attributes.put("inspectionProvincecode", getInspectionProvincecode());

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

		Long confirmedinspectionId = (Long)attributes.get(
				"confirmedinspectionId");

		if (confirmedinspectionId != null) {
			setConfirmedinspectionId(confirmedinspectionId);
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

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String inspectionDistrictCode = (String)attributes.get(
				"inspectionDistrictCode");

		if (inspectionDistrictCode != null) {
			setInspectionDistrictCode(inspectionDistrictCode);
		}

		String inspectionProvincecode = (String)attributes.get(
				"inspectionProvincecode");

		if (inspectionProvincecode != null) {
			setInspectionProvincecode(inspectionProvincecode);
		}
	}

	/**
	* Returns the primary key of this phan cong don vi kiem tra.
	*
	* @return the primary key of this phan cong don vi kiem tra
	*/
	@Override
	public long getPrimaryKey() {
		return _phanCongDonViKiemTra.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phan cong don vi kiem tra.
	*
	* @param primaryKey the primary key of this phan cong don vi kiem tra
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phanCongDonViKiemTra.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phan cong don vi kiem tra.
	*
	* @return the ID of this phan cong don vi kiem tra
	*/
	@Override
	public long getId() {
		return _phanCongDonViKiemTra.getId();
	}

	/**
	* Sets the ID of this phan cong don vi kiem tra.
	*
	* @param id the ID of this phan cong don vi kiem tra
	*/
	@Override
	public void setId(long id) {
		_phanCongDonViKiemTra.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this phan cong don vi kiem tra.
	*
	* @return the phieu xu ly chinh ID of this phan cong don vi kiem tra
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _phanCongDonViKiemTra.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this phan cong don vi kiem tra.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this phan cong don vi kiem tra
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phanCongDonViKiemTra.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the trich yeu noi dung of this phan cong don vi kiem tra.
	*
	* @return the trich yeu noi dung of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _phanCongDonViKiemTra.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this phan cong don vi kiem tra.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this phan cong don vi kiem tra
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_phanCongDonViKiemTra.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ghi chu of this phan cong don vi kiem tra.
	*
	* @return the ghi chu of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _phanCongDonViKiemTra.getGhiChu();
	}

	/**
	* Sets the ghi chu of this phan cong don vi kiem tra.
	*
	* @param ghiChu the ghi chu of this phan cong don vi kiem tra
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_phanCongDonViKiemTra.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai hien tai ID of this phan cong don vi kiem tra.
	*
	* @return the trang thai hien tai ID of this phan cong don vi kiem tra
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _phanCongDonViKiemTra.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this phan cong don vi kiem tra.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this phan cong don vi kiem tra
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_phanCongDonViKiemTra.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the noi dung ho so ID of this phan cong don vi kiem tra.
	*
	* @return the noi dung ho so ID of this phan cong don vi kiem tra
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _phanCongDonViKiemTra.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this phan cong don vi kiem tra.
	*
	* @param noiDungHoSoId the noi dung ho so ID of this phan cong don vi kiem tra
	*/
	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_phanCongDonViKiemTra.setNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	* Returns the chiem quyen xu ly of this phan cong don vi kiem tra.
	*
	* @return the chiem quyen xu ly of this phan cong don vi kiem tra
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _phanCongDonViKiemTra.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this phan cong don vi kiem tra.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this phan cong don vi kiem tra
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_phanCongDonViKiemTra.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the ngay tao phieu of this phan cong don vi kiem tra.
	*
	* @return the ngay tao phieu of this phan cong don vi kiem tra
	*/
	@Override
	public java.util.Date getNgayTaoPhieu() {
		return _phanCongDonViKiemTra.getNgayTaoPhieu();
	}

	/**
	* Sets the ngay tao phieu of this phan cong don vi kiem tra.
	*
	* @param ngayTaoPhieu the ngay tao phieu of this phan cong don vi kiem tra
	*/
	@Override
	public void setNgayTaoPhieu(java.util.Date ngayTaoPhieu) {
		_phanCongDonViKiemTra.setNgayTaoPhieu(ngayTaoPhieu);
	}

	/**
	* Returns the nguoi tao phieu of this phan cong don vi kiem tra.
	*
	* @return the nguoi tao phieu of this phan cong don vi kiem tra
	*/
	@Override
	public long getNguoiTaoPhieu() {
		return _phanCongDonViKiemTra.getNguoiTaoPhieu();
	}

	/**
	* Sets the nguoi tao phieu of this phan cong don vi kiem tra.
	*
	* @param nguoiTaoPhieu the nguoi tao phieu of this phan cong don vi kiem tra
	*/
	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_phanCongDonViKiemTra.setNguoiTaoPhieu(nguoiTaoPhieu);
	}

	/**
	* Returns the nhom phieu xu ly of this phan cong don vi kiem tra.
	*
	* @return the nhom phieu xu ly of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getNhomPhieuXuLy() {
		return _phanCongDonViKiemTra.getNhomPhieuXuLy();
	}

	/**
	* Sets the nhom phieu xu ly of this phan cong don vi kiem tra.
	*
	* @param nhomPhieuXuLy the nhom phieu xu ly of this phan cong don vi kiem tra
	*/
	@Override
	public void setNhomPhieuXuLy(java.lang.String nhomPhieuXuLy) {
		_phanCongDonViKiemTra.setNhomPhieuXuLy(nhomPhieuXuLy);
	}

	/**
	* Returns the phan nhom ho so ID of this phan cong don vi kiem tra.
	*
	* @return the phan nhom ho so ID of this phan cong don vi kiem tra
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _phanCongDonViKiemTra.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this phan cong don vi kiem tra.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this phan cong don vi kiem tra
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_phanCongDonViKiemTra.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the confirmedinspection ID of this phan cong don vi kiem tra.
	*
	* @return the confirmedinspection ID of this phan cong don vi kiem tra
	*/
	@Override
	public long getConfirmedinspectionId() {
		return _phanCongDonViKiemTra.getConfirmedinspectionId();
	}

	/**
	* Sets the confirmedinspection ID of this phan cong don vi kiem tra.
	*
	* @param confirmedinspectionId the confirmedinspection ID of this phan cong don vi kiem tra
	*/
	@Override
	public void setConfirmedinspectionId(long confirmedinspectionId) {
		_phanCongDonViKiemTra.setConfirmedinspectionId(confirmedinspectionId);
	}

	/**
	* Returns the ma so ho so of this phan cong don vi kiem tra.
	*
	* @return the ma so ho so of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _phanCongDonViKiemTra.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this phan cong don vi kiem tra.
	*
	* @param maSoHoSo the ma so ho so of this phan cong don vi kiem tra
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_phanCongDonViKiemTra.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this phan cong don vi kiem tra.
	*
	* @return the ma bien nhan of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _phanCongDonViKiemTra.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this phan cong don vi kiem tra.
	*
	* @param maBienNhan the ma bien nhan of this phan cong don vi kiem tra
	*/
	@Override
	public void setMaBienNhan(java.lang.String maBienNhan) {
		_phanCongDonViKiemTra.setMaBienNhan(maBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this phan cong don vi kiem tra.
	*
	* @return the thu tuc hanh chinh ID of this phan cong don vi kiem tra
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _phanCongDonViKiemTra.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this phan cong don vi kiem tra.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this phan cong don vi kiem tra
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_phanCongDonViKiemTra.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the ten chu ho so of this phan cong don vi kiem tra.
	*
	* @return the ten chu ho so of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _phanCongDonViKiemTra.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this phan cong don vi kiem tra.
	*
	* @param tenChuHoSo the ten chu ho so of this phan cong don vi kiem tra
	*/
	@Override
	public void setTenChuHoSo(java.lang.String tenChuHoSo) {
		_phanCongDonViKiemTra.setTenChuHoSo(tenChuHoSo);
	}

	/**
	* Returns the ngay gui ho so of this phan cong don vi kiem tra.
	*
	* @return the ngay gui ho so of this phan cong don vi kiem tra
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _phanCongDonViKiemTra.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this phan cong don vi kiem tra.
	*
	* @param ngayGuiHoSo the ngay gui ho so of this phan cong don vi kiem tra
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date ngayGuiHoSo) {
		_phanCongDonViKiemTra.setNgayGuiHoSo(ngayGuiHoSo);
	}

	/**
	* Returns the ten don vi tiep nhan of this phan cong don vi kiem tra.
	*
	* @return the ten don vi tiep nhan of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getTenDonViTiepNhan() {
		return _phanCongDonViKiemTra.getTenDonViTiepNhan();
	}

	/**
	* Sets the ten don vi tiep nhan of this phan cong don vi kiem tra.
	*
	* @param tenDonViTiepNhan the ten don vi tiep nhan of this phan cong don vi kiem tra
	*/
	@Override
	public void setTenDonViTiepNhan(java.lang.String tenDonViTiepNhan) {
		_phanCongDonViKiemTra.setTenDonViTiepNhan(tenDonViTiepNhan);
	}

	/**
	* Returns the attached file of this phan cong don vi kiem tra.
	*
	* @return the attached file of this phan cong don vi kiem tra
	*/
	@Override
	public long getAttachedFile() {
		return _phanCongDonViKiemTra.getAttachedFile();
	}

	/**
	* Sets the attached file of this phan cong don vi kiem tra.
	*
	* @param attachedFile the attached file of this phan cong don vi kiem tra
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_phanCongDonViKiemTra.setAttachedFile(attachedFile);
	}

	/**
	* Returns the inspection district code of this phan cong don vi kiem tra.
	*
	* @return the inspection district code of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getInspectionDistrictCode() {
		return _phanCongDonViKiemTra.getInspectionDistrictCode();
	}

	/**
	* Sets the inspection district code of this phan cong don vi kiem tra.
	*
	* @param inspectionDistrictCode the inspection district code of this phan cong don vi kiem tra
	*/
	@Override
	public void setInspectionDistrictCode(
		java.lang.String inspectionDistrictCode) {
		_phanCongDonViKiemTra.setInspectionDistrictCode(inspectionDistrictCode);
	}

	/**
	* Returns the inspection provincecode of this phan cong don vi kiem tra.
	*
	* @return the inspection provincecode of this phan cong don vi kiem tra
	*/
	@Override
	public java.lang.String getInspectionProvincecode() {
		return _phanCongDonViKiemTra.getInspectionProvincecode();
	}

	/**
	* Sets the inspection provincecode of this phan cong don vi kiem tra.
	*
	* @param inspectionProvincecode the inspection provincecode of this phan cong don vi kiem tra
	*/
	@Override
	public void setInspectionProvincecode(
		java.lang.String inspectionProvincecode) {
		_phanCongDonViKiemTra.setInspectionProvincecode(inspectionProvincecode);
	}

	@Override
	public boolean isNew() {
		return _phanCongDonViKiemTra.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phanCongDonViKiemTra.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phanCongDonViKiemTra.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phanCongDonViKiemTra.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phanCongDonViKiemTra.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phanCongDonViKiemTra.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phanCongDonViKiemTra.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phanCongDonViKiemTra.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phanCongDonViKiemTra.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phanCongDonViKiemTra.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phanCongDonViKiemTra.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhanCongDonViKiemTraWrapper((PhanCongDonViKiemTra)_phanCongDonViKiemTra.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra) {
		return _phanCongDonViKiemTra.compareTo(phanCongDonViKiemTra);
	}

	@Override
	public int hashCode() {
		return _phanCongDonViKiemTra.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> toCacheModel() {
		return _phanCongDonViKiemTra.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra toEscapedModel() {
		return new PhanCongDonViKiemTraWrapper(_phanCongDonViKiemTra.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra toUnescapedModel() {
		return new PhanCongDonViKiemTraWrapper(_phanCongDonViKiemTra.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phanCongDonViKiemTra.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phanCongDonViKiemTra.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phanCongDonViKiemTra.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhanCongDonViKiemTraWrapper)) {
			return false;
		}

		PhanCongDonViKiemTraWrapper phanCongDonViKiemTraWrapper = (PhanCongDonViKiemTraWrapper)obj;

		if (Validator.equals(_phanCongDonViKiemTra,
					phanCongDonViKiemTraWrapper._phanCongDonViKiemTra)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PhanCongDonViKiemTra getWrappedPhanCongDonViKiemTra() {
		return _phanCongDonViKiemTra;
	}

	@Override
	public PhanCongDonViKiemTra getWrappedModel() {
		return _phanCongDonViKiemTra;
	}

	@Override
	public void resetOriginalValues() {
		_phanCongDonViKiemTra.resetOriginalValues();
	}

	private PhanCongDonViKiemTra _phanCongDonViKiemTra;
}