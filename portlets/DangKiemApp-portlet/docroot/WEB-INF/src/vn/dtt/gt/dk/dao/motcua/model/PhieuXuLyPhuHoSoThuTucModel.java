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
 * The base model interface for the PhieuXuLyPhuHoSoThuTuc service. Represents a row in the &quot;view_phieuxulyphu_hosothutuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucImpl}.
 * </p>
 *
 * @author win_64
 * @see PhieuXuLyPhuHoSoThuTuc
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl
 * @generated
 */
public interface PhieuXuLyPhuHoSoThuTucModel extends BaseModel<PhieuXuLyPhuHoSoThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a phieu xu ly phu ho so thu tuc model instance should use the {@link PhieuXuLyPhuHoSoThuTuc} interface instead.
	 */

	/**
	 * Returns the primary key of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the primary key of this phieu xu ly phu ho so thu tuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param primaryKey the primary key of this phieu xu ly phu ho so thu tuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ID of this phieu xu ly phu ho so thu tuc
	 */
	public long getId();

	/**
	 * Sets the ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param id the ID of this phieu xu ly phu ho so thu tuc
	 */
	public void setId(long id);

	/**
	 * Returns the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc
	 */
	public long getPhieuXuLyChinhId();

	/**
	 * Sets the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID of this phieu xu ly phu ho so thu tuc
	 */
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId);

	/**
	 * Returns the trich yeu noi dung of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the trich yeu noi dung of this phieu xu ly phu ho so thu tuc
	 */
	@AutoEscape
	public String getTrichYeuNoiDung();

	/**
	 * Sets the trich yeu noi dung of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param trichYeuNoiDung the trich yeu noi dung of this phieu xu ly phu ho so thu tuc
	 */
	public void setTrichYeuNoiDung(String trichYeuNoiDung);

	/**
	 * Returns the ghi chu of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ghi chu of this phieu xu ly phu ho so thu tuc
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param ghiChu the ghi chu of this phieu xu ly phu ho so thu tuc
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc
	 */
	public long getTrangThaiHienTaiId();

	/**
	 * Sets the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param trangThaiHienTaiId the trang thai hien tai ID of this phieu xu ly phu ho so thu tuc
	 */
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId);

	/**
	 * Returns the noi dung ho so ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the noi dung ho so ID of this phieu xu ly phu ho so thu tuc
	 */
	public long getNoiDungHoSoId();

	/**
	 * Sets the noi dung ho so ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID of this phieu xu ly phu ho so thu tuc
	 */
	public void setNoiDungHoSoId(long noiDungHoSoId);

	/**
	 * Returns the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc
	 */
	public long getChiemQuyenXuLy();

	/**
	 * Sets the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param chiemQuyenXuLy the chiem quyen xu ly of this phieu xu ly phu ho so thu tuc
	 */
	public void setChiemQuyenXuLy(long chiemQuyenXuLy);

	/**
	 * Returns the ngay tao phieu of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ngay tao phieu of this phieu xu ly phu ho so thu tuc
	 */
	public Date getNgayTaoPhieu();

	/**
	 * Sets the ngay tao phieu of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param ngayTaoPhieu the ngay tao phieu of this phieu xu ly phu ho so thu tuc
	 */
	public void setNgayTaoPhieu(Date ngayTaoPhieu);

	/**
	 * Returns the nguoi tao phieu of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the nguoi tao phieu of this phieu xu ly phu ho so thu tuc
	 */
	public long getNguoiTaoPhieu();

	/**
	 * Sets the nguoi tao phieu of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param nguoiTaoPhieu the nguoi tao phieu of this phieu xu ly phu ho so thu tuc
	 */
	public void setNguoiTaoPhieu(long nguoiTaoPhieu);

	/**
	 * Returns the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc
	 */
	@AutoEscape
	public String getNhomPhieuXuLy();

	/**
	 * Sets the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param nhomPhieuXuLy the nhom phieu xu ly of this phieu xu ly phu ho so thu tuc
	 */
	public void setNhomPhieuXuLy(String nhomPhieuXuLy);

	/**
	 * Returns the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc
	 */
	public long getPhanNhomHoSoId();

	/**
	 * Sets the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID of this phieu xu ly phu ho so thu tuc
	 */
	public void setPhanNhomHoSoId(long phanNhomHoSoId);

	/**
	 * Returns the ma so ho so of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ma so ho so of this phieu xu ly phu ho so thu tuc
	 */
	@AutoEscape
	public String getMaSoHoSo();

	/**
	 * Sets the ma so ho so of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param maSoHoSo the ma so ho so of this phieu xu ly phu ho so thu tuc
	 */
	public void setMaSoHoSo(String maSoHoSo);

	/**
	 * Returns the ma bien nhan of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ma bien nhan of this phieu xu ly phu ho so thu tuc
	 */
	@AutoEscape
	public String getMaBienNhan();

	/**
	 * Sets the ma bien nhan of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param maBienNhan the ma bien nhan of this phieu xu ly phu ho so thu tuc
	 */
	public void setMaBienNhan(String maBienNhan);

	/**
	 * Returns the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this phieu xu ly phu ho so thu tuc
	 */
	public void setThuTucHanhChinhId(long thuTucHanhChinhId);

	/**
	 * Returns the ten chu ho so of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ten chu ho so of this phieu xu ly phu ho so thu tuc
	 */
	@AutoEscape
	public String getTenChuHoSo();

	/**
	 * Sets the ten chu ho so of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param tenChuHoSo the ten chu ho so of this phieu xu ly phu ho so thu tuc
	 */
	public void setTenChuHoSo(String tenChuHoSo);

	/**
	 * Returns the ngay gui ho so of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ngay gui ho so of this phieu xu ly phu ho so thu tuc
	 */
	public Date getNgayGuiHoSo();

	/**
	 * Sets the ngay gui ho so of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param ngayGuiHoSo the ngay gui ho so of this phieu xu ly phu ho so thu tuc
	 */
	public void setNgayGuiHoSo(Date ngayGuiHoSo);

	/**
	 * Returns the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc.
	 *
	 * @return the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc
	 */
	@AutoEscape
	public String getTenDonViTiepNhan();

	/**
	 * Sets the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc.
	 *
	 * @param tenDonViTiepNhan the ten don vi tiep nhan of this phieu xu ly phu ho so thu tuc
	 */
	public void setTenDonViTiepNhan(String tenDonViTiepNhan);

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
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}