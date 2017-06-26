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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LichKiemTraHienTruong service. Represents a row in the &quot;view_lichkiemtrahientruong&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongImpl}.
 * </p>
 *
 * @author win_64
 * @see LichKiemTraHienTruong
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl
 * @generated
 */
public interface LichKiemTraHienTruongModel extends BaseModel<LichKiemTraHienTruong> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lich kiem tra hien truong model instance should use the {@link LichKiemTraHienTruong} interface instead.
	 */

	/**
	 * Returns the primary key of this lich kiem tra hien truong.
	 *
	 * @return the primary key of this lich kiem tra hien truong
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lich kiem tra hien truong.
	 *
	 * @param primaryKey the primary key of this lich kiem tra hien truong
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this lich kiem tra hien truong.
	 *
	 * @return the ID of this lich kiem tra hien truong
	 */
	public long getId();

	/**
	 * Sets the ID of this lich kiem tra hien truong.
	 *
	 * @param id the ID of this lich kiem tra hien truong
	 */
	public void setId(long id);

	/**
	 * Returns the phieu xu ly chinh ID of this lich kiem tra hien truong.
	 *
	 * @return the phieu xu ly chinh ID of this lich kiem tra hien truong
	 */
	public long getPhieuXuLyChinhId();

	/**
	 * Sets the phieu xu ly chinh ID of this lich kiem tra hien truong.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID of this lich kiem tra hien truong
	 */
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId);

	/**
	 * Returns the trich yeu noi dung of this lich kiem tra hien truong.
	 *
	 * @return the trich yeu noi dung of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getTrichYeuNoiDung();

	/**
	 * Sets the trich yeu noi dung of this lich kiem tra hien truong.
	 *
	 * @param trichYeuNoiDung the trich yeu noi dung of this lich kiem tra hien truong
	 */
	public void setTrichYeuNoiDung(String trichYeuNoiDung);

	/**
	 * Returns the ghi chu of this lich kiem tra hien truong.
	 *
	 * @return the ghi chu of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this lich kiem tra hien truong.
	 *
	 * @param ghiChu the ghi chu of this lich kiem tra hien truong
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the trang thai hien tai ID of this lich kiem tra hien truong.
	 *
	 * @return the trang thai hien tai ID of this lich kiem tra hien truong
	 */
	public long getTrangThaiHienTaiId();

	/**
	 * Sets the trang thai hien tai ID of this lich kiem tra hien truong.
	 *
	 * @param trangThaiHienTaiId the trang thai hien tai ID of this lich kiem tra hien truong
	 */
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId);

	/**
	 * Returns the noi dung ho so ID of this lich kiem tra hien truong.
	 *
	 * @return the noi dung ho so ID of this lich kiem tra hien truong
	 */
	public long getNoiDungHoSoId();

	/**
	 * Sets the noi dung ho so ID of this lich kiem tra hien truong.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID of this lich kiem tra hien truong
	 */
	public void setNoiDungHoSoId(long noiDungHoSoId);

	/**
	 * Returns the chiem quyen xu ly of this lich kiem tra hien truong.
	 *
	 * @return the chiem quyen xu ly of this lich kiem tra hien truong
	 */
	public long getChiemQuyenXuLy();

	/**
	 * Sets the chiem quyen xu ly of this lich kiem tra hien truong.
	 *
	 * @param chiemQuyenXuLy the chiem quyen xu ly of this lich kiem tra hien truong
	 */
	public void setChiemQuyenXuLy(long chiemQuyenXuLy);

	/**
	 * Returns the ngay tao phieu of this lich kiem tra hien truong.
	 *
	 * @return the ngay tao phieu of this lich kiem tra hien truong
	 */
	public Date getNgayTaoPhieu();

	/**
	 * Sets the ngay tao phieu of this lich kiem tra hien truong.
	 *
	 * @param ngayTaoPhieu the ngay tao phieu of this lich kiem tra hien truong
	 */
	public void setNgayTaoPhieu(Date ngayTaoPhieu);

	/**
	 * Returns the nguoi tao phieu of this lich kiem tra hien truong.
	 *
	 * @return the nguoi tao phieu of this lich kiem tra hien truong
	 */
	public long getNguoiTaoPhieu();

	/**
	 * Sets the nguoi tao phieu of this lich kiem tra hien truong.
	 *
	 * @param nguoiTaoPhieu the nguoi tao phieu of this lich kiem tra hien truong
	 */
	public void setNguoiTaoPhieu(long nguoiTaoPhieu);

	/**
	 * Returns the nhom phieu xu ly of this lich kiem tra hien truong.
	 *
	 * @return the nhom phieu xu ly of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getNhomPhieuXuLy();

	/**
	 * Sets the nhom phieu xu ly of this lich kiem tra hien truong.
	 *
	 * @param nhomPhieuXuLy the nhom phieu xu ly of this lich kiem tra hien truong
	 */
	public void setNhomPhieuXuLy(String nhomPhieuXuLy);

	/**
	 * Returns the phan nhom ho so ID of this lich kiem tra hien truong.
	 *
	 * @return the phan nhom ho so ID of this lich kiem tra hien truong
	 */
	public long getPhanNhomHoSoId();

	/**
	 * Sets the phan nhom ho so ID of this lich kiem tra hien truong.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID of this lich kiem tra hien truong
	 */
	public void setPhanNhomHoSoId(long phanNhomHoSoId);

	/**
	 * Returns the confirmedinspection ID of this lich kiem tra hien truong.
	 *
	 * @return the confirmedinspection ID of this lich kiem tra hien truong
	 */
	public long getConfirmedinspectionId();

	/**
	 * Sets the confirmedinspection ID of this lich kiem tra hien truong.
	 *
	 * @param confirmedinspectionId the confirmedinspection ID of this lich kiem tra hien truong
	 */
	public void setConfirmedinspectionId(long confirmedinspectionId);

	/**
	 * Returns the ma so ho so of this lich kiem tra hien truong.
	 *
	 * @return the ma so ho so of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getMaSoHoSo();

	/**
	 * Sets the ma so ho so of this lich kiem tra hien truong.
	 *
	 * @param maSoHoSo the ma so ho so of this lich kiem tra hien truong
	 */
	public void setMaSoHoSo(String maSoHoSo);

	/**
	 * Returns the ma bien nhan of this lich kiem tra hien truong.
	 *
	 * @return the ma bien nhan of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getMaBienNhan();

	/**
	 * Sets the ma bien nhan of this lich kiem tra hien truong.
	 *
	 * @param maBienNhan the ma bien nhan of this lich kiem tra hien truong
	 */
	public void setMaBienNhan(String maBienNhan);

	/**
	 * Returns the thu tuc hanh chinh ID of this lich kiem tra hien truong.
	 *
	 * @return the thu tuc hanh chinh ID of this lich kiem tra hien truong
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this lich kiem tra hien truong.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this lich kiem tra hien truong
	 */
	public void setThuTucHanhChinhId(long thuTucHanhChinhId);

	/**
	 * Returns the ten chu ho so of this lich kiem tra hien truong.
	 *
	 * @return the ten chu ho so of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getTenChuHoSo();

	/**
	 * Sets the ten chu ho so of this lich kiem tra hien truong.
	 *
	 * @param tenChuHoSo the ten chu ho so of this lich kiem tra hien truong
	 */
	public void setTenChuHoSo(String tenChuHoSo);

	/**
	 * Returns the ngay gui ho so of this lich kiem tra hien truong.
	 *
	 * @return the ngay gui ho so of this lich kiem tra hien truong
	 */
	public Date getNgayGuiHoSo();

	/**
	 * Sets the ngay gui ho so of this lich kiem tra hien truong.
	 *
	 * @param ngayGuiHoSo the ngay gui ho so of this lich kiem tra hien truong
	 */
	public void setNgayGuiHoSo(Date ngayGuiHoSo);

	/**
	 * Returns the ten don vi tiep nhan of this lich kiem tra hien truong.
	 *
	 * @return the ten don vi tiep nhan of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getTenDonViTiepNhan();

	/**
	 * Sets the ten don vi tiep nhan of this lich kiem tra hien truong.
	 *
	 * @param tenDonViTiepNhan the ten don vi tiep nhan of this lich kiem tra hien truong
	 */
	public void setTenDonViTiepNhan(String tenDonViTiepNhan);

	/**
	 * Returns the attached file of this lich kiem tra hien truong.
	 *
	 * @return the attached file of this lich kiem tra hien truong
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this lich kiem tra hien truong.
	 *
	 * @param attachedFile the attached file of this lich kiem tra hien truong
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the inspection district code of this lich kiem tra hien truong.
	 *
	 * @return the inspection district code of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getInspectionDistrictCode();

	/**
	 * Sets the inspection district code of this lich kiem tra hien truong.
	 *
	 * @param inspectionDistrictCode the inspection district code of this lich kiem tra hien truong
	 */
	public void setInspectionDistrictCode(String inspectionDistrictCode);

	/**
	 * Returns the inspection provincecode of this lich kiem tra hien truong.
	 *
	 * @return the inspection provincecode of this lich kiem tra hien truong
	 */
	@AutoEscape
	public String getInspectionProvincecode();

	/**
	 * Sets the inspection provincecode of this lich kiem tra hien truong.
	 *
	 * @param inspectionProvincecode the inspection provincecode of this lich kiem tra hien truong
	 */
	public void setInspectionProvincecode(String inspectionProvincecode);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}