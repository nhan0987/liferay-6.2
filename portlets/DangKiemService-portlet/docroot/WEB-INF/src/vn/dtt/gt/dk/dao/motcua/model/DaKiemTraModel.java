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
 * The base model interface for the DaKiemTra service. Represents a row in the &quot;view_dakiemtra&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraImpl}.
 * </p>
 *
 * @author huymq
 * @see DaKiemTra
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl
 * @generated
 */
public interface DaKiemTraModel extends BaseModel<DaKiemTra> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a da kiem tra model instance should use the {@link DaKiemTra} interface instead.
	 */

	/**
	 * Returns the primary key of this da kiem tra.
	 *
	 * @return the primary key of this da kiem tra
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this da kiem tra.
	 *
	 * @param primaryKey the primary key of this da kiem tra
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this da kiem tra.
	 *
	 * @return the ID of this da kiem tra
	 */
	public long getId();

	/**
	 * Sets the ID of this da kiem tra.
	 *
	 * @param id the ID of this da kiem tra
	 */
	public void setId(long id);

	/**
	 * Returns the phieu xu ly chinh ID of this da kiem tra.
	 *
	 * @return the phieu xu ly chinh ID of this da kiem tra
	 */
	public long getPhieuXuLyChinhId();

	/**
	 * Sets the phieu xu ly chinh ID of this da kiem tra.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID of this da kiem tra
	 */
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId);

	/**
	 * Returns the trich yeu noi dung of this da kiem tra.
	 *
	 * @return the trich yeu noi dung of this da kiem tra
	 */
	@AutoEscape
	public String getTrichYeuNoiDung();

	/**
	 * Sets the trich yeu noi dung of this da kiem tra.
	 *
	 * @param trichYeuNoiDung the trich yeu noi dung of this da kiem tra
	 */
	public void setTrichYeuNoiDung(String trichYeuNoiDung);

	/**
	 * Returns the ghi chu of this da kiem tra.
	 *
	 * @return the ghi chu of this da kiem tra
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this da kiem tra.
	 *
	 * @param ghiChu the ghi chu of this da kiem tra
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the trang thai hien tai ID of this da kiem tra.
	 *
	 * @return the trang thai hien tai ID of this da kiem tra
	 */
	public long getTrangThaiHienTaiId();

	/**
	 * Sets the trang thai hien tai ID of this da kiem tra.
	 *
	 * @param trangThaiHienTaiId the trang thai hien tai ID of this da kiem tra
	 */
	public void setTrangThaiHienTaiId(long trangThaiHienTaiId);

	/**
	 * Returns the noi dung ho so ID of this da kiem tra.
	 *
	 * @return the noi dung ho so ID of this da kiem tra
	 */
	public long getNoiDungHoSoId();

	/**
	 * Sets the noi dung ho so ID of this da kiem tra.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID of this da kiem tra
	 */
	public void setNoiDungHoSoId(long noiDungHoSoId);

	/**
	 * Returns the chiem quyen xu ly of this da kiem tra.
	 *
	 * @return the chiem quyen xu ly of this da kiem tra
	 */
	public long getChiemQuyenXuLy();

	/**
	 * Sets the chiem quyen xu ly of this da kiem tra.
	 *
	 * @param chiemQuyenXuLy the chiem quyen xu ly of this da kiem tra
	 */
	public void setChiemQuyenXuLy(long chiemQuyenXuLy);

	/**
	 * Returns the ngay tao phieu of this da kiem tra.
	 *
	 * @return the ngay tao phieu of this da kiem tra
	 */
	public Date getNgayTaoPhieu();

	/**
	 * Sets the ngay tao phieu of this da kiem tra.
	 *
	 * @param ngayTaoPhieu the ngay tao phieu of this da kiem tra
	 */
	public void setNgayTaoPhieu(Date ngayTaoPhieu);

	/**
	 * Returns the nguoi tao phieu of this da kiem tra.
	 *
	 * @return the nguoi tao phieu of this da kiem tra
	 */
	public long getNguoiTaoPhieu();

	/**
	 * Sets the nguoi tao phieu of this da kiem tra.
	 *
	 * @param nguoiTaoPhieu the nguoi tao phieu of this da kiem tra
	 */
	public void setNguoiTaoPhieu(long nguoiTaoPhieu);

	/**
	 * Returns the nhom phieu xu ly of this da kiem tra.
	 *
	 * @return the nhom phieu xu ly of this da kiem tra
	 */
	@AutoEscape
	public String getNhomPhieuXuLy();

	/**
	 * Sets the nhom phieu xu ly of this da kiem tra.
	 *
	 * @param nhomPhieuXuLy the nhom phieu xu ly of this da kiem tra
	 */
	public void setNhomPhieuXuLy(String nhomPhieuXuLy);

	/**
	 * Returns the phan nhom ho so ID of this da kiem tra.
	 *
	 * @return the phan nhom ho so ID of this da kiem tra
	 */
	public long getPhanNhomHoSoId();

	/**
	 * Sets the phan nhom ho so ID of this da kiem tra.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID of this da kiem tra
	 */
	public void setPhanNhomHoSoId(long phanNhomHoSoId);

	/**
	 * Returns the ma so ho so of this da kiem tra.
	 *
	 * @return the ma so ho so of this da kiem tra
	 */
	@AutoEscape
	public String getMaSoHoSo();

	/**
	 * Sets the ma so ho so of this da kiem tra.
	 *
	 * @param maSoHoSo the ma so ho so of this da kiem tra
	 */
	public void setMaSoHoSo(String maSoHoSo);

	/**
	 * Returns the ma bien nhan of this da kiem tra.
	 *
	 * @return the ma bien nhan of this da kiem tra
	 */
	@AutoEscape
	public String getMaBienNhan();

	/**
	 * Sets the ma bien nhan of this da kiem tra.
	 *
	 * @param maBienNhan the ma bien nhan of this da kiem tra
	 */
	public void setMaBienNhan(String maBienNhan);

	/**
	 * Returns the thu tuc hanh chinh ID of this da kiem tra.
	 *
	 * @return the thu tuc hanh chinh ID of this da kiem tra
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this da kiem tra.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this da kiem tra
	 */
	public void setThuTucHanhChinhId(long thuTucHanhChinhId);

	/**
	 * Returns the ten chu ho so of this da kiem tra.
	 *
	 * @return the ten chu ho so of this da kiem tra
	 */
	@AutoEscape
	public String getTenChuHoSo();

	/**
	 * Sets the ten chu ho so of this da kiem tra.
	 *
	 * @param tenChuHoSo the ten chu ho so of this da kiem tra
	 */
	public void setTenChuHoSo(String tenChuHoSo);

	/**
	 * Returns the ngay gui ho so of this da kiem tra.
	 *
	 * @return the ngay gui ho so of this da kiem tra
	 */
	public Date getNgayGuiHoSo();

	/**
	 * Sets the ngay gui ho so of this da kiem tra.
	 *
	 * @param ngayGuiHoSo the ngay gui ho so of this da kiem tra
	 */
	public void setNgayGuiHoSo(Date ngayGuiHoSo);

	/**
	 * Returns the ten don vi tiep nhan of this da kiem tra.
	 *
	 * @return the ten don vi tiep nhan of this da kiem tra
	 */
	@AutoEscape
	public String getTenDonViTiepNhan();

	/**
	 * Sets the ten don vi tiep nhan of this da kiem tra.
	 *
	 * @param tenDonViTiepNhan the ten don vi tiep nhan of this da kiem tra
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
	public int compareTo(DaKiemTra daKiemTra);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DaKiemTra> toCacheModel();

	@Override
	public DaKiemTra toEscapedModel();

	@Override
	public DaKiemTra toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}