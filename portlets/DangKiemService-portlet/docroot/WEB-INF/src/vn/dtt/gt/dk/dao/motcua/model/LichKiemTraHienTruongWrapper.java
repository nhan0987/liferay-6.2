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
 * This class is a wrapper for {@link LichKiemTraHienTruong}.
 * </p>
 *
 * @author huymq
 * @see LichKiemTraHienTruong
 * @generated
 */
public class LichKiemTraHienTruongWrapper implements LichKiemTraHienTruong,
	ModelWrapper<LichKiemTraHienTruong> {
	public LichKiemTraHienTruongWrapper(
		LichKiemTraHienTruong lichKiemTraHienTruong) {
		_lichKiemTraHienTruong = lichKiemTraHienTruong;
	}

	@Override
	public Class<?> getModelClass() {
		return LichKiemTraHienTruong.class;
	}

	@Override
	public String getModelClassName() {
		return LichKiemTraHienTruong.class.getName();
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
	* Returns the primary key of this lich kiem tra hien truong.
	*
	* @return the primary key of this lich kiem tra hien truong
	*/
	@Override
	public long getPrimaryKey() {
		return _lichKiemTraHienTruong.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lich kiem tra hien truong.
	*
	* @param primaryKey the primary key of this lich kiem tra hien truong
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lichKiemTraHienTruong.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this lich kiem tra hien truong.
	*
	* @return the ID of this lich kiem tra hien truong
	*/
	@Override
	public long getId() {
		return _lichKiemTraHienTruong.getId();
	}

	/**
	* Sets the ID of this lich kiem tra hien truong.
	*
	* @param id the ID of this lich kiem tra hien truong
	*/
	@Override
	public void setId(long id) {
		_lichKiemTraHienTruong.setId(id);
	}

	/**
	* Returns the phieu xu ly chinh ID of this lich kiem tra hien truong.
	*
	* @return the phieu xu ly chinh ID of this lich kiem tra hien truong
	*/
	@Override
	public long getPhieuXuLyChinhId() {
		return _lichKiemTraHienTruong.getPhieuXuLyChinhId();
	}

	/**
	* Sets the phieu xu ly chinh ID of this lich kiem tra hien truong.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID of this lich kiem tra hien truong
	*/
	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_lichKiemTraHienTruong.setPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the trich yeu noi dung of this lich kiem tra hien truong.
	*
	* @return the trich yeu noi dung of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getTrichYeuNoiDung() {
		return _lichKiemTraHienTruong.getTrichYeuNoiDung();
	}

	/**
	* Sets the trich yeu noi dung of this lich kiem tra hien truong.
	*
	* @param trichYeuNoiDung the trich yeu noi dung of this lich kiem tra hien truong
	*/
	@Override
	public void setTrichYeuNoiDung(java.lang.String trichYeuNoiDung) {
		_lichKiemTraHienTruong.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	/**
	* Returns the ghi chu of this lich kiem tra hien truong.
	*
	* @return the ghi chu of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _lichKiemTraHienTruong.getGhiChu();
	}

	/**
	* Sets the ghi chu of this lich kiem tra hien truong.
	*
	* @param ghiChu the ghi chu of this lich kiem tra hien truong
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_lichKiemTraHienTruong.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai hien tai ID of this lich kiem tra hien truong.
	*
	* @return the trang thai hien tai ID of this lich kiem tra hien truong
	*/
	@Override
	public long getTrangThaiHienTaiId() {
		return _lichKiemTraHienTruong.getTrangThaiHienTaiId();
	}

	/**
	* Sets the trang thai hien tai ID of this lich kiem tra hien truong.
	*
	* @param trangThaiHienTaiId the trang thai hien tai ID of this lich kiem tra hien truong
	*/
	@Override
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId) {
		_lichKiemTraHienTruong.setTrangThaiHienTaiId(trangThaiHienTaiId);
	}

	/**
	* Returns the noi dung ho so ID of this lich kiem tra hien truong.
	*
	* @return the noi dung ho so ID of this lich kiem tra hien truong
	*/
	@Override
	public long getNoiDungHoSoId() {
		return _lichKiemTraHienTruong.getNoiDungHoSoId();
	}

	/**
	* Sets the noi dung ho so ID of this lich kiem tra hien truong.
	*
	* @param noiDungHoSoId the noi dung ho so ID of this lich kiem tra hien truong
	*/
	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_lichKiemTraHienTruong.setNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	* Returns the chiem quyen xu ly of this lich kiem tra hien truong.
	*
	* @return the chiem quyen xu ly of this lich kiem tra hien truong
	*/
	@Override
	public long getChiemQuyenXuLy() {
		return _lichKiemTraHienTruong.getChiemQuyenXuLy();
	}

	/**
	* Sets the chiem quyen xu ly of this lich kiem tra hien truong.
	*
	* @param chiemQuyenXuLy the chiem quyen xu ly of this lich kiem tra hien truong
	*/
	@Override
	public void setChiemQuyenXuLy(long chiemQuyenXuLy) {
		_lichKiemTraHienTruong.setChiemQuyenXuLy(chiemQuyenXuLy);
	}

	/**
	* Returns the ngay tao phieu of this lich kiem tra hien truong.
	*
	* @return the ngay tao phieu of this lich kiem tra hien truong
	*/
	@Override
	public java.util.Date getNgayTaoPhieu() {
		return _lichKiemTraHienTruong.getNgayTaoPhieu();
	}

	/**
	* Sets the ngay tao phieu of this lich kiem tra hien truong.
	*
	* @param ngayTaoPhieu the ngay tao phieu of this lich kiem tra hien truong
	*/
	@Override
	public void setNgayTaoPhieu(java.util.Date ngayTaoPhieu) {
		_lichKiemTraHienTruong.setNgayTaoPhieu(ngayTaoPhieu);
	}

	/**
	* Returns the nguoi tao phieu of this lich kiem tra hien truong.
	*
	* @return the nguoi tao phieu of this lich kiem tra hien truong
	*/
	@Override
	public long getNguoiTaoPhieu() {
		return _lichKiemTraHienTruong.getNguoiTaoPhieu();
	}

	/**
	* Sets the nguoi tao phieu of this lich kiem tra hien truong.
	*
	* @param nguoiTaoPhieu the nguoi tao phieu of this lich kiem tra hien truong
	*/
	@Override
	public void setNguoiTaoPhieu(long nguoiTaoPhieu) {
		_lichKiemTraHienTruong.setNguoiTaoPhieu(nguoiTaoPhieu);
	}

	/**
	* Returns the nhom phieu xu ly of this lich kiem tra hien truong.
	*
	* @return the nhom phieu xu ly of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getNhomPhieuXuLy() {
		return _lichKiemTraHienTruong.getNhomPhieuXuLy();
	}

	/**
	* Sets the nhom phieu xu ly of this lich kiem tra hien truong.
	*
	* @param nhomPhieuXuLy the nhom phieu xu ly of this lich kiem tra hien truong
	*/
	@Override
	public void setNhomPhieuXuLy(java.lang.String nhomPhieuXuLy) {
		_lichKiemTraHienTruong.setNhomPhieuXuLy(nhomPhieuXuLy);
	}

	/**
	* Returns the phan nhom ho so ID of this lich kiem tra hien truong.
	*
	* @return the phan nhom ho so ID of this lich kiem tra hien truong
	*/
	@Override
	public long getPhanNhomHoSoId() {
		return _lichKiemTraHienTruong.getPhanNhomHoSoId();
	}

	/**
	* Sets the phan nhom ho so ID of this lich kiem tra hien truong.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID of this lich kiem tra hien truong
	*/
	@Override
	public void setPhanNhomHoSoId(long phanNhomHoSoId) {
		_lichKiemTraHienTruong.setPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the confirmedinspection ID of this lich kiem tra hien truong.
	*
	* @return the confirmedinspection ID of this lich kiem tra hien truong
	*/
	@Override
	public long getConfirmedinspectionId() {
		return _lichKiemTraHienTruong.getConfirmedinspectionId();
	}

	/**
	* Sets the confirmedinspection ID of this lich kiem tra hien truong.
	*
	* @param confirmedinspectionId the confirmedinspection ID of this lich kiem tra hien truong
	*/
	@Override
	public void setConfirmedinspectionId(long confirmedinspectionId) {
		_lichKiemTraHienTruong.setConfirmedinspectionId(confirmedinspectionId);
	}

	/**
	* Returns the ma so ho so of this lich kiem tra hien truong.
	*
	* @return the ma so ho so of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getMaSoHoSo() {
		return _lichKiemTraHienTruong.getMaSoHoSo();
	}

	/**
	* Sets the ma so ho so of this lich kiem tra hien truong.
	*
	* @param maSoHoSo the ma so ho so of this lich kiem tra hien truong
	*/
	@Override
	public void setMaSoHoSo(java.lang.String maSoHoSo) {
		_lichKiemTraHienTruong.setMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the ma bien nhan of this lich kiem tra hien truong.
	*
	* @return the ma bien nhan of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getMaBienNhan() {
		return _lichKiemTraHienTruong.getMaBienNhan();
	}

	/**
	* Sets the ma bien nhan of this lich kiem tra hien truong.
	*
	* @param maBienNhan the ma bien nhan of this lich kiem tra hien truong
	*/
	@Override
	public void setMaBienNhan(java.lang.String maBienNhan) {
		_lichKiemTraHienTruong.setMaBienNhan(maBienNhan);
	}

	/**
	* Returns the thu tuc hanh chinh ID of this lich kiem tra hien truong.
	*
	* @return the thu tuc hanh chinh ID of this lich kiem tra hien truong
	*/
	@Override
	public long getThuTucHanhChinhId() {
		return _lichKiemTraHienTruong.getThuTucHanhChinhId();
	}

	/**
	* Sets the thu tuc hanh chinh ID of this lich kiem tra hien truong.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID of this lich kiem tra hien truong
	*/
	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_lichKiemTraHienTruong.setThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the ten chu ho so of this lich kiem tra hien truong.
	*
	* @return the ten chu ho so of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getTenChuHoSo() {
		return _lichKiemTraHienTruong.getTenChuHoSo();
	}

	/**
	* Sets the ten chu ho so of this lich kiem tra hien truong.
	*
	* @param tenChuHoSo the ten chu ho so of this lich kiem tra hien truong
	*/
	@Override
	public void setTenChuHoSo(java.lang.String tenChuHoSo) {
		_lichKiemTraHienTruong.setTenChuHoSo(tenChuHoSo);
	}

	/**
	* Returns the ngay gui ho so of this lich kiem tra hien truong.
	*
	* @return the ngay gui ho so of this lich kiem tra hien truong
	*/
	@Override
	public java.util.Date getNgayGuiHoSo() {
		return _lichKiemTraHienTruong.getNgayGuiHoSo();
	}

	/**
	* Sets the ngay gui ho so of this lich kiem tra hien truong.
	*
	* @param ngayGuiHoSo the ngay gui ho so of this lich kiem tra hien truong
	*/
	@Override
	public void setNgayGuiHoSo(java.util.Date ngayGuiHoSo) {
		_lichKiemTraHienTruong.setNgayGuiHoSo(ngayGuiHoSo);
	}

	/**
	* Returns the ten don vi tiep nhan of this lich kiem tra hien truong.
	*
	* @return the ten don vi tiep nhan of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getTenDonViTiepNhan() {
		return _lichKiemTraHienTruong.getTenDonViTiepNhan();
	}

	/**
	* Sets the ten don vi tiep nhan of this lich kiem tra hien truong.
	*
	* @param tenDonViTiepNhan the ten don vi tiep nhan of this lich kiem tra hien truong
	*/
	@Override
	public void setTenDonViTiepNhan(java.lang.String tenDonViTiepNhan) {
		_lichKiemTraHienTruong.setTenDonViTiepNhan(tenDonViTiepNhan);
	}

	/**
	* Returns the attached file of this lich kiem tra hien truong.
	*
	* @return the attached file of this lich kiem tra hien truong
	*/
	@Override
	public long getAttachedFile() {
		return _lichKiemTraHienTruong.getAttachedFile();
	}

	/**
	* Sets the attached file of this lich kiem tra hien truong.
	*
	* @param attachedFile the attached file of this lich kiem tra hien truong
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_lichKiemTraHienTruong.setAttachedFile(attachedFile);
	}

	/**
	* Returns the inspection district code of this lich kiem tra hien truong.
	*
	* @return the inspection district code of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getInspectionDistrictCode() {
		return _lichKiemTraHienTruong.getInspectionDistrictCode();
	}

	/**
	* Sets the inspection district code of this lich kiem tra hien truong.
	*
	* @param inspectionDistrictCode the inspection district code of this lich kiem tra hien truong
	*/
	@Override
	public void setInspectionDistrictCode(
		java.lang.String inspectionDistrictCode) {
		_lichKiemTraHienTruong.setInspectionDistrictCode(inspectionDistrictCode);
	}

	/**
	* Returns the inspection provincecode of this lich kiem tra hien truong.
	*
	* @return the inspection provincecode of this lich kiem tra hien truong
	*/
	@Override
	public java.lang.String getInspectionProvincecode() {
		return _lichKiemTraHienTruong.getInspectionProvincecode();
	}

	/**
	* Sets the inspection provincecode of this lich kiem tra hien truong.
	*
	* @param inspectionProvincecode the inspection provincecode of this lich kiem tra hien truong
	*/
	@Override
	public void setInspectionProvincecode(
		java.lang.String inspectionProvincecode) {
		_lichKiemTraHienTruong.setInspectionProvincecode(inspectionProvincecode);
	}

	@Override
	public boolean isNew() {
		return _lichKiemTraHienTruong.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lichKiemTraHienTruong.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lichKiemTraHienTruong.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lichKiemTraHienTruong.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lichKiemTraHienTruong.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lichKiemTraHienTruong.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lichKiemTraHienTruong.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lichKiemTraHienTruong.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lichKiemTraHienTruong.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lichKiemTraHienTruong.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lichKiemTraHienTruong.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LichKiemTraHienTruongWrapper((LichKiemTraHienTruong)_lichKiemTraHienTruong.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong) {
		return _lichKiemTraHienTruong.compareTo(lichKiemTraHienTruong);
	}

	@Override
	public int hashCode() {
		return _lichKiemTraHienTruong.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> toCacheModel() {
		return _lichKiemTraHienTruong.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong toEscapedModel() {
		return new LichKiemTraHienTruongWrapper(_lichKiemTraHienTruong.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong toUnescapedModel() {
		return new LichKiemTraHienTruongWrapper(_lichKiemTraHienTruong.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lichKiemTraHienTruong.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lichKiemTraHienTruong.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lichKiemTraHienTruong.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LichKiemTraHienTruongWrapper)) {
			return false;
		}

		LichKiemTraHienTruongWrapper lichKiemTraHienTruongWrapper = (LichKiemTraHienTruongWrapper)obj;

		if (Validator.equals(_lichKiemTraHienTruong,
					lichKiemTraHienTruongWrapper._lichKiemTraHienTruong)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LichKiemTraHienTruong getWrappedLichKiemTraHienTruong() {
		return _lichKiemTraHienTruong;
	}

	@Override
	public LichKiemTraHienTruong getWrappedModel() {
		return _lichKiemTraHienTruong;
	}

	@Override
	public void resetOriginalValues() {
		_lichKiemTraHienTruong.resetOriginalValues();
	}

	private LichKiemTraHienTruong _lichKiemTraHienTruong;
}