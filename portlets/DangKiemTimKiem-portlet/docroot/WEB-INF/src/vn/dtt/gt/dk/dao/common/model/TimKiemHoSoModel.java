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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TimKiemHoSo service. Represents a row in the &quot;view_timkiemhoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see TimKiemHoSo
 * @see vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoModelImpl
 * @generated
 */
public interface TimKiemHoSoModel extends BaseModel<TimKiemHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tim kiem ho so model instance should use the {@link TimKiemHoSo} interface instead.
	 */

	/**
	 * Returns the primary key of this tim kiem ho so.
	 *
	 * @return the primary key of this tim kiem ho so
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tim kiem ho so.
	 *
	 * @param primaryKey the primary key of this tim kiem ho so
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tim kiem ho so.
	 *
	 * @return the ID of this tim kiem ho so
	 */
	public long getId();

	/**
	 * Sets the ID of this tim kiem ho so.
	 *
	 * @param id the ID of this tim kiem ho so
	 */
	public void setId(long id);

	/**
	 * Returns the ma so ho so of this tim kiem ho so.
	 *
	 * @return the ma so ho so of this tim kiem ho so
	 */
	@AutoEscape
	public String getMaSoHoSo();

	/**
	 * Sets the ma so ho so of this tim kiem ho so.
	 *
	 * @param maSoHoSo the ma so ho so of this tim kiem ho so
	 */
	public void setMaSoHoSo(String maSoHoSo);

	/**
	 * Returns the ma bien nhan of this tim kiem ho so.
	 *
	 * @return the ma bien nhan of this tim kiem ho so
	 */
	@AutoEscape
	public String getMaBienNhan();

	/**
	 * Sets the ma bien nhan of this tim kiem ho so.
	 *
	 * @param maBienNhan the ma bien nhan of this tim kiem ho so
	 */
	public void setMaBienNhan(String maBienNhan);

	/**
	 * Returns the thu tuc hanh chinh ID of this tim kiem ho so.
	 *
	 * @return the thu tuc hanh chinh ID of this tim kiem ho so
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this tim kiem ho so.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this tim kiem ho so
	 */
	public void setThuTucHanhChinhId(long thuTucHanhChinhId);

	/**
	 * Returns the loai chu ho so of this tim kiem ho so.
	 *
	 * @return the loai chu ho so of this tim kiem ho so
	 */
	public long getLoaiChuHoSo();

	/**
	 * Sets the loai chu ho so of this tim kiem ho so.
	 *
	 * @param loaiChuHoSo the loai chu ho so of this tim kiem ho so
	 */
	public void setLoaiChuHoSo(long loaiChuHoSo);

	/**
	 * Returns the ma so chu ho so of this tim kiem ho so.
	 *
	 * @return the ma so chu ho so of this tim kiem ho so
	 */
	@AutoEscape
	public String getMaSoChuHoSo();

	/**
	 * Sets the ma so chu ho so of this tim kiem ho so.
	 *
	 * @param maSoChuHoSo the ma so chu ho so of this tim kiem ho so
	 */
	public void setMaSoChuHoSo(String maSoChuHoSo);

	/**
	 * Returns the ten chu ho so of this tim kiem ho so.
	 *
	 * @return the ten chu ho so of this tim kiem ho so
	 */
	@AutoEscape
	public String getTenChuHoSo();

	/**
	 * Sets the ten chu ho so of this tim kiem ho so.
	 *
	 * @param tenChuHoSo the ten chu ho so of this tim kiem ho so
	 */
	public void setTenChuHoSo(String tenChuHoSo);

	/**
	 * Returns the dia chi chu ho so of this tim kiem ho so.
	 *
	 * @return the dia chi chu ho so of this tim kiem ho so
	 */
	@AutoEscape
	public String getDiaChiChuHoSo();

	/**
	 * Sets the dia chi chu ho so of this tim kiem ho so.
	 *
	 * @param diaChiChuHoSo the dia chi chu ho so of this tim kiem ho so
	 */
	public void setDiaChiChuHoSo(String diaChiChuHoSo);

	/**
	 * Returns the trich yeu noi dung of this tim kiem ho so.
	 *
	 * @return the trich yeu noi dung of this tim kiem ho so
	 */
	@AutoEscape
	public String getTrichYeuNoiDung();

	/**
	 * Sets the trich yeu noi dung of this tim kiem ho so.
	 *
	 * @param trichYeuNoiDung the trich yeu noi dung of this tim kiem ho so
	 */
	public void setTrichYeuNoiDung(String trichYeuNoiDung);

	/**
	 * Returns the ngay gui ho so of this tim kiem ho so.
	 *
	 * @return the ngay gui ho so of this tim kiem ho so
	 */
	public Date getNgayGuiHoSo();

	/**
	 * Sets the ngay gui ho so of this tim kiem ho so.
	 *
	 * @param ngayGuiHoSo the ngay gui ho so of this tim kiem ho so
	 */
	public void setNgayGuiHoSo(Date ngayGuiHoSo);

	/**
	 * Returns the ngay tiep nhan of this tim kiem ho so.
	 *
	 * @return the ngay tiep nhan of this tim kiem ho so
	 */
	public Date getNgayTiepNhan();

	/**
	 * Sets the ngay tiep nhan of this tim kiem ho so.
	 *
	 * @param ngayTiepNhan the ngay tiep nhan of this tim kiem ho so
	 */
	public void setNgayTiepNhan(Date ngayTiepNhan);

	/**
	 * Returns the ngay bo sung of this tim kiem ho so.
	 *
	 * @return the ngay bo sung of this tim kiem ho so
	 */
	public Date getNgayBoSung();

	/**
	 * Sets the ngay bo sung of this tim kiem ho so.
	 *
	 * @param ngayBoSung the ngay bo sung of this tim kiem ho so
	 */
	public void setNgayBoSung(Date ngayBoSung);

	/**
	 * Returns the ngay hen tra of this tim kiem ho so.
	 *
	 * @return the ngay hen tra of this tim kiem ho so
	 */
	public Date getNgayHenTra();

	/**
	 * Sets the ngay hen tra of this tim kiem ho so.
	 *
	 * @param ngayHenTra the ngay hen tra of this tim kiem ho so
	 */
	public void setNgayHenTra(Date ngayHenTra);

	/**
	 * Returns the ngay tra ket qua of this tim kiem ho so.
	 *
	 * @return the ngay tra ket qua of this tim kiem ho so
	 */
	public Date getNgayTraKetQua();

	/**
	 * Sets the ngay tra ket qua of this tim kiem ho so.
	 *
	 * @param ngayTraKetQua the ngay tra ket qua of this tim kiem ho so
	 */
	public void setNgayTraKetQua(Date ngayTraKetQua);

	/**
	 * Returns the ngay dong ho so of this tim kiem ho so.
	 *
	 * @return the ngay dong ho so of this tim kiem ho so
	 */
	public Date getNgayDongHoSo();

	/**
	 * Sets the ngay dong ho so of this tim kiem ho so.
	 *
	 * @param ngayDongHoSo the ngay dong ho so of this tim kiem ho so
	 */
	public void setNgayDongHoSo(Date ngayDongHoSo);

	/**
	 * Returns the trang thai ho so of this tim kiem ho so.
	 *
	 * @return the trang thai ho so of this tim kiem ho so
	 */
	@AutoEscape
	public String getTrangThaiHoSo();

	/**
	 * Sets the trang thai ho so of this tim kiem ho so.
	 *
	 * @param trangThaiHoSo the trang thai ho so of this tim kiem ho so
	 */
	public void setTrangThaiHoSo(String trangThaiHoSo);

	/**
	 * Returns the phan nhom ho so ID of this tim kiem ho so.
	 *
	 * @return the phan nhom ho so ID of this tim kiem ho so
	 */
	public long getPhanNhomHoSoId();

	/**
	 * Sets the phan nhom ho so ID of this tim kiem ho so.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID of this tim kiem ho so
	 */
	public void setPhanNhomHoSoId(long phanNhomHoSoId);

	/**
	 * Returns the ma don vi tiep nhan of this tim kiem ho so.
	 *
	 * @return the ma don vi tiep nhan of this tim kiem ho so
	 */
	@AutoEscape
	public String getMaDonViTiepNhan();

	/**
	 * Sets the ma don vi tiep nhan of this tim kiem ho so.
	 *
	 * @param maDonViTiepNhan the ma don vi tiep nhan of this tim kiem ho so
	 */
	public void setMaDonViTiepNhan(String maDonViTiepNhan);

	/**
	 * Returns the ten don vi tiep nhan of this tim kiem ho so.
	 *
	 * @return the ten don vi tiep nhan of this tim kiem ho so
	 */
	@AutoEscape
	public String getTenDonViTiepNhan();

	/**
	 * Sets the ten don vi tiep nhan of this tim kiem ho so.
	 *
	 * @param tenDonViTiepNhan the ten don vi tiep nhan of this tim kiem ho so
	 */
	public void setTenDonViTiepNhan(String tenDonViTiepNhan);

	/**
	 * Returns the to chuc quan ly of this tim kiem ho so.
	 *
	 * @return the to chuc quan ly of this tim kiem ho so
	 */
	public long getToChucQuanLy();

	/**
	 * Sets the to chuc quan ly of this tim kiem ho so.
	 *
	 * @param toChucQuanLy the to chuc quan ly of this tim kiem ho so
	 */
	public void setToChucQuanLy(long toChucQuanLy);

	/**
	 * Returns the ngay tao of this tim kiem ho so.
	 *
	 * @return the ngay tao of this tim kiem ho so
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this tim kiem ho so.
	 *
	 * @param ngayTao the ngay tao of this tim kiem ho so
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi tao of this tim kiem ho so.
	 *
	 * @return the nguoi tao of this tim kiem ho so
	 */
	public long getNguoiTao();

	/**
	 * Sets the nguoi tao of this tim kiem ho so.
	 *
	 * @param nguoiTao the nguoi tao of this tim kiem ho so
	 */
	public void setNguoiTao(long nguoiTao);

	/**
	 * Returns the ghi chu of this tim kiem ho so.
	 *
	 * @return the ghi chu of this tim kiem ho so
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this tim kiem ho so.
	 *
	 * @param ghiChu the ghi chu of this tim kiem ho so
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the lan gui cuoi of this tim kiem ho so.
	 *
	 * @return the lan gui cuoi of this tim kiem ho so
	 */
	public long getLanGuiCuoi();

	/**
	 * Sets the lan gui cuoi of this tim kiem ho so.
	 *
	 * @param lanGuiCuoi the lan gui cuoi of this tim kiem ho so
	 */
	public void setLanGuiCuoi(long lanGuiCuoi);

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
	public int compareTo(TimKiemHoSo timKiemHoSo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TimKiemHoSo> toCacheModel();

	@Override
	public TimKiemHoSo toEscapedModel();

	@Override
	public TimKiemHoSo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}