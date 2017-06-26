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
 * The base model interface for the TthcHoSoThuTuc service. Represents a row in the &quot;tthc_hosothutuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcHoSoThuTuc
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucModelImpl
 * @generated
 */
public interface TthcHoSoThuTucModel extends BaseModel<TthcHoSoThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc ho so thu tuc model instance should use the {@link TthcHoSoThuTuc} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc ho so thu tuc.
	 *
	 * @return the primary key of this tthc ho so thu tuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc ho so thu tuc.
	 *
	 * @param primaryKey the primary key of this tthc ho so thu tuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc ho so thu tuc.
	 *
	 * @return the ID of this tthc ho so thu tuc
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc ho so thu tuc.
	 *
	 * @param Id the ID of this tthc ho so thu tuc
	 */
	public void setId(long Id);

	/**
	 * Returns the ma so ho so of this tthc ho so thu tuc.
	 *
	 * @return the ma so ho so of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getMaSoHoSo();

	/**
	 * Sets the ma so ho so of this tthc ho so thu tuc.
	 *
	 * @param MaSoHoSo the ma so ho so of this tthc ho so thu tuc
	 */
	public void setMaSoHoSo(String MaSoHoSo);

	/**
	 * Returns the ma bien nhan of this tthc ho so thu tuc.
	 *
	 * @return the ma bien nhan of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getMaBienNhan();

	/**
	 * Sets the ma bien nhan of this tthc ho so thu tuc.
	 *
	 * @param MaBienNhan the ma bien nhan of this tthc ho so thu tuc
	 */
	public void setMaBienNhan(String MaBienNhan);

	/**
	 * Returns the thu tuc hanh chinh ID of this tthc ho so thu tuc.
	 *
	 * @return the thu tuc hanh chinh ID of this tthc ho so thu tuc
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this tthc ho so thu tuc.
	 *
	 * @param ThuTucHanhChinhId the thu tuc hanh chinh ID of this tthc ho so thu tuc
	 */
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId);

	/**
	 * Returns the loai chu ho so of this tthc ho so thu tuc.
	 *
	 * @return the loai chu ho so of this tthc ho so thu tuc
	 */
	public long getLoaiChuHoSo();

	/**
	 * Sets the loai chu ho so of this tthc ho so thu tuc.
	 *
	 * @param LoaiChuHoSo the loai chu ho so of this tthc ho so thu tuc
	 */
	public void setLoaiChuHoSo(long LoaiChuHoSo);

	/**
	 * Returns the ma so chu ho so of this tthc ho so thu tuc.
	 *
	 * @return the ma so chu ho so of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getMaSoChuHoSo();

	/**
	 * Sets the ma so chu ho so of this tthc ho so thu tuc.
	 *
	 * @param MaSoChuHoSo the ma so chu ho so of this tthc ho so thu tuc
	 */
	public void setMaSoChuHoSo(String MaSoChuHoSo);

	/**
	 * Returns the ten chu ho so of this tthc ho so thu tuc.
	 *
	 * @return the ten chu ho so of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getTenChuHoSo();

	/**
	 * Sets the ten chu ho so of this tthc ho so thu tuc.
	 *
	 * @param TenChuHoSo the ten chu ho so of this tthc ho so thu tuc
	 */
	public void setTenChuHoSo(String TenChuHoSo);

	/**
	 * Returns the dia chi chu ho so of this tthc ho so thu tuc.
	 *
	 * @return the dia chi chu ho so of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getDiaChiChuHoSo();

	/**
	 * Sets the dia chi chu ho so of this tthc ho so thu tuc.
	 *
	 * @param DiaChiChuHoSo the dia chi chu ho so of this tthc ho so thu tuc
	 */
	public void setDiaChiChuHoSo(String DiaChiChuHoSo);

	/**
	 * Returns the trich yeu noi dung of this tthc ho so thu tuc.
	 *
	 * @return the trich yeu noi dung of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getTrichYeuNoiDung();

	/**
	 * Sets the trich yeu noi dung of this tthc ho so thu tuc.
	 *
	 * @param TrichYeuNoiDung the trich yeu noi dung of this tthc ho so thu tuc
	 */
	public void setTrichYeuNoiDung(String TrichYeuNoiDung);

	/**
	 * Returns the ngay gui ho so of this tthc ho so thu tuc.
	 *
	 * @return the ngay gui ho so of this tthc ho so thu tuc
	 */
	public Date getNgayGuiHoSo();

	/**
	 * Sets the ngay gui ho so of this tthc ho so thu tuc.
	 *
	 * @param NgayGuiHoSo the ngay gui ho so of this tthc ho so thu tuc
	 */
	public void setNgayGuiHoSo(Date NgayGuiHoSo);

	/**
	 * Returns the ngay tiep nhan of this tthc ho so thu tuc.
	 *
	 * @return the ngay tiep nhan of this tthc ho so thu tuc
	 */
	public Date getNgayTiepNhan();

	/**
	 * Sets the ngay tiep nhan of this tthc ho so thu tuc.
	 *
	 * @param NgayTiepNhan the ngay tiep nhan of this tthc ho so thu tuc
	 */
	public void setNgayTiepNhan(Date NgayTiepNhan);

	/**
	 * Returns the ngay bo sung of this tthc ho so thu tuc.
	 *
	 * @return the ngay bo sung of this tthc ho so thu tuc
	 */
	public Date getNgayBoSung();

	/**
	 * Sets the ngay bo sung of this tthc ho so thu tuc.
	 *
	 * @param NgayBoSung the ngay bo sung of this tthc ho so thu tuc
	 */
	public void setNgayBoSung(Date NgayBoSung);

	/**
	 * Returns the ngay hen tra of this tthc ho so thu tuc.
	 *
	 * @return the ngay hen tra of this tthc ho so thu tuc
	 */
	public Date getNgayHenTra();

	/**
	 * Sets the ngay hen tra of this tthc ho so thu tuc.
	 *
	 * @param NgayHenTra the ngay hen tra of this tthc ho so thu tuc
	 */
	public void setNgayHenTra(Date NgayHenTra);

	/**
	 * Returns the ngay tra ket qua of this tthc ho so thu tuc.
	 *
	 * @return the ngay tra ket qua of this tthc ho so thu tuc
	 */
	public Date getNgayTraKetQua();

	/**
	 * Sets the ngay tra ket qua of this tthc ho so thu tuc.
	 *
	 * @param NgayTraKetQua the ngay tra ket qua of this tthc ho so thu tuc
	 */
	public void setNgayTraKetQua(Date NgayTraKetQua);

	/**
	 * Returns the ngay dong ho so of this tthc ho so thu tuc.
	 *
	 * @return the ngay dong ho so of this tthc ho so thu tuc
	 */
	public Date getNgayDongHoSo();

	/**
	 * Sets the ngay dong ho so of this tthc ho so thu tuc.
	 *
	 * @param NgayDongHoSo the ngay dong ho so of this tthc ho so thu tuc
	 */
	public void setNgayDongHoSo(Date NgayDongHoSo);

	/**
	 * Returns the trang thai ho so of this tthc ho so thu tuc.
	 *
	 * @return the trang thai ho so of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getTrangThaiHoSo();

	/**
	 * Sets the trang thai ho so of this tthc ho so thu tuc.
	 *
	 * @param TrangThaiHoSo the trang thai ho so of this tthc ho so thu tuc
	 */
	public void setTrangThaiHoSo(String TrangThaiHoSo);

	/**
	 * Returns the phan nhom ho so ID of this tthc ho so thu tuc.
	 *
	 * @return the phan nhom ho so ID of this tthc ho so thu tuc
	 */
	public long getPhanNhomHoSoId();

	/**
	 * Sets the phan nhom ho so ID of this tthc ho so thu tuc.
	 *
	 * @param PhanNhomHoSoId the phan nhom ho so ID of this tthc ho so thu tuc
	 */
	public void setPhanNhomHoSoId(long PhanNhomHoSoId);

	/**
	 * Returns the ma don vi tiep nhan of this tthc ho so thu tuc.
	 *
	 * @return the ma don vi tiep nhan of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getMaDonViTiepNhan();

	/**
	 * Sets the ma don vi tiep nhan of this tthc ho so thu tuc.
	 *
	 * @param MaDonViTiepNhan the ma don vi tiep nhan of this tthc ho so thu tuc
	 */
	public void setMaDonViTiepNhan(String MaDonViTiepNhan);

	/**
	 * Returns the ten don vi tiep nhan of this tthc ho so thu tuc.
	 *
	 * @return the ten don vi tiep nhan of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getTenDonViTiepNhan();

	/**
	 * Sets the ten don vi tiep nhan of this tthc ho so thu tuc.
	 *
	 * @param TenDonViTiepNhan the ten don vi tiep nhan of this tthc ho so thu tuc
	 */
	public void setTenDonViTiepNhan(String TenDonViTiepNhan);

	/**
	 * Returns the to chuc quan ly of this tthc ho so thu tuc.
	 *
	 * @return the to chuc quan ly of this tthc ho so thu tuc
	 */
	public long getToChucQuanLy();

	/**
	 * Sets the to chuc quan ly of this tthc ho so thu tuc.
	 *
	 * @param ToChucQuanLy the to chuc quan ly of this tthc ho so thu tuc
	 */
	public void setToChucQuanLy(long ToChucQuanLy);

	/**
	 * Returns the ngay tao of this tthc ho so thu tuc.
	 *
	 * @return the ngay tao of this tthc ho so thu tuc
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this tthc ho so thu tuc.
	 *
	 * @param NgayTao the ngay tao of this tthc ho so thu tuc
	 */
	public void setNgayTao(Date NgayTao);

	/**
	 * Returns the nguoi tao of this tthc ho so thu tuc.
	 *
	 * @return the nguoi tao of this tthc ho so thu tuc
	 */
	public long getNguoiTao();

	/**
	 * Sets the nguoi tao of this tthc ho so thu tuc.
	 *
	 * @param NguoiTao the nguoi tao of this tthc ho so thu tuc
	 */
	public void setNguoiTao(long NguoiTao);

	/**
	 * Returns the ghi chu of this tthc ho so thu tuc.
	 *
	 * @return the ghi chu of this tthc ho so thu tuc
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this tthc ho so thu tuc.
	 *
	 * @param ghiChu the ghi chu of this tthc ho so thu tuc
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the lan gui cuoi of this tthc ho so thu tuc.
	 *
	 * @return the lan gui cuoi of this tthc ho so thu tuc
	 */
	public long getLanGuiCuoi();

	/**
	 * Sets the lan gui cuoi of this tthc ho so thu tuc.
	 *
	 * @param lanGuiCuoi the lan gui cuoi of this tthc ho so thu tuc
	 */
	public void setLanGuiCuoi(long lanGuiCuoi);

	/**
	 * Returns the synch date of this tthc ho so thu tuc.
	 *
	 * @return the synch date of this tthc ho so thu tuc
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this tthc ho so thu tuc.
	 *
	 * @param SynchDate the synch date of this tthc ho so thu tuc
	 */
	public void setSynchDate(Date SynchDate);

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
	public int compareTo(TthcHoSoThuTuc tthcHoSoThuTuc);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcHoSoThuTuc> toCacheModel();

	@Override
	public TthcHoSoThuTuc toEscapedModel();

	@Override
	public TthcHoSoThuTuc toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}