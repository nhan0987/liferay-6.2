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
 * The base model interface for the TthcThuTucHanhChinh service. Represents a row in the &quot;tthc_thutuchanhchinh&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcThuTucHanhChinh
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl
 * @generated
 */
public interface TthcThuTucHanhChinhModel extends BaseModel<TthcThuTucHanhChinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc thu tuc hanh chinh model instance should use the {@link TthcThuTucHanhChinh} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc thu tuc hanh chinh.
	 *
	 * @return the primary key of this tthc thu tuc hanh chinh
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc thu tuc hanh chinh.
	 *
	 * @param primaryKey the primary key of this tthc thu tuc hanh chinh
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc thu tuc hanh chinh.
	 *
	 * @return the ID of this tthc thu tuc hanh chinh
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc thu tuc hanh chinh.
	 *
	 * @param Id the ID of this tthc thu tuc hanh chinh
	 */
	public void setId(long Id);

	/**
	 * Returns the ma thu tuc of this tthc thu tuc hanh chinh.
	 *
	 * @return the ma thu tuc of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getMaThuTuc();

	/**
	 * Sets the ma thu tuc of this tthc thu tuc hanh chinh.
	 *
	 * @param maThuTuc the ma thu tuc of this tthc thu tuc hanh chinh
	 */
	public void setMaThuTuc(String maThuTuc);

	/**
	 * Returns the ten thu tuc of this tthc thu tuc hanh chinh.
	 *
	 * @return the ten thu tuc of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getTenThuTuc();

	/**
	 * Sets the ten thu tuc of this tthc thu tuc hanh chinh.
	 *
	 * @param tenThuTuc the ten thu tuc of this tthc thu tuc hanh chinh
	 */
	public void setTenThuTuc(String tenThuTuc);

	/**
	 * Returns the trinh tu thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @return the trinh tu thuc hien of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getTrinhTuThucHien();

	/**
	 * Sets the trinh tu thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @param trinhTuThucHien the trinh tu thuc hien of this tthc thu tuc hanh chinh
	 */
	public void setTrinhTuThucHien(String trinhTuThucHien);

	/**
	 * Returns the cach thuc thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @return the cach thuc thuc hien of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getCachThucThucHien();

	/**
	 * Sets the cach thuc thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @param cachThucThucHien the cach thuc thuc hien of this tthc thu tuc hanh chinh
	 */
	public void setCachThucThucHien(String cachThucThucHien);

	/**
	 * Returns the thanh phan ho so of this tthc thu tuc hanh chinh.
	 *
	 * @return the thanh phan ho so of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getThanhPhanHoSo();

	/**
	 * Sets the thanh phan ho so of this tthc thu tuc hanh chinh.
	 *
	 * @param thanhPhanHoSo the thanh phan ho so of this tthc thu tuc hanh chinh
	 */
	public void setThanhPhanHoSo(String thanhPhanHoSo);

	/**
	 * Returns the dieu kien thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @return the dieu kien thuc hien of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getDieuKienThucHien();

	/**
	 * Sets the dieu kien thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @param dieuKienThucHien the dieu kien thuc hien of this tthc thu tuc hanh chinh
	 */
	public void setDieuKienThucHien(String dieuKienThucHien);

	/**
	 * Returns the thoi han giai quyet of this tthc thu tuc hanh chinh.
	 *
	 * @return the thoi han giai quyet of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getThoiHanGiaiQuyet();

	/**
	 * Sets the thoi han giai quyet of this tthc thu tuc hanh chinh.
	 *
	 * @param thoiHanGiaiQuyet the thoi han giai quyet of this tthc thu tuc hanh chinh
	 */
	public void setThoiHanGiaiQuyet(String thoiHanGiaiQuyet);

	/**
	 * Returns the doi tuong thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @return the doi tuong thuc hien of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getDoiTuongThucHien();

	/**
	 * Sets the doi tuong thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @param doiTuongThucHien the doi tuong thuc hien of this tthc thu tuc hanh chinh
	 */
	public void setDoiTuongThucHien(String doiTuongThucHien);

	/**
	 * Returns the ket qua xu ly of this tthc thu tuc hanh chinh.
	 *
	 * @return the ket qua xu ly of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getKetQuaXuLy();

	/**
	 * Sets the ket qua xu ly of this tthc thu tuc hanh chinh.
	 *
	 * @param ketQuaXuLy the ket qua xu ly of this tthc thu tuc hanh chinh
	 */
	public void setKetQuaXuLy(String ketQuaXuLy);

	/**
	 * Returns the can cu phap ly of this tthc thu tuc hanh chinh.
	 *
	 * @return the can cu phap ly of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getCanCuPhapLy();

	/**
	 * Sets the can cu phap ly of this tthc thu tuc hanh chinh.
	 *
	 * @param canCuPhapLy the can cu phap ly of this tthc thu tuc hanh chinh
	 */
	public void setCanCuPhapLy(String canCuPhapLy);

	/**
	 * Returns the le phi of this tthc thu tuc hanh chinh.
	 *
	 * @return the le phi of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getLePhi();

	/**
	 * Sets the le phi of this tthc thu tuc hanh chinh.
	 *
	 * @param lePhi the le phi of this tthc thu tuc hanh chinh
	 */
	public void setLePhi(String lePhi);

	/**
	 * Returns the co quan qltt ID of this tthc thu tuc hanh chinh.
	 *
	 * @return the co quan qltt ID of this tthc thu tuc hanh chinh
	 */
	public long getCoQuanQlttId();

	/**
	 * Sets the co quan qltt ID of this tthc thu tuc hanh chinh.
	 *
	 * @param coQuanQlttId the co quan qltt ID of this tthc thu tuc hanh chinh
	 */
	public void setCoQuanQlttId(long coQuanQlttId);

	/**
	 * Returns the linh vuc thu tuc ID of this tthc thu tuc hanh chinh.
	 *
	 * @return the linh vuc thu tuc ID of this tthc thu tuc hanh chinh
	 */
	public long getLinhVucThuTucId();

	/**
	 * Sets the linh vuc thu tuc ID of this tthc thu tuc hanh chinh.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID of this tthc thu tuc hanh chinh
	 */
	public void setLinhVucThuTucId(long linhVucThuTucId);

	/**
	 * Returns the ngay co hieu luc of this tthc thu tuc hanh chinh.
	 *
	 * @return the ngay co hieu luc of this tthc thu tuc hanh chinh
	 */
	public Date getNgayCoHieuLuc();

	/**
	 * Sets the ngay co hieu luc of this tthc thu tuc hanh chinh.
	 *
	 * @param ngayCoHieuLuc the ngay co hieu luc of this tthc thu tuc hanh chinh
	 */
	public void setNgayCoHieuLuc(Date ngayCoHieuLuc);

	/**
	 * Returns the ngay het hieu luc of this tthc thu tuc hanh chinh.
	 *
	 * @return the ngay het hieu luc of this tthc thu tuc hanh chinh
	 */
	public Date getNgayHetHieuLuc();

	/**
	 * Sets the ngay het hieu luc of this tthc thu tuc hanh chinh.
	 *
	 * @param ngayHetHieuLuc the ngay het hieu luc of this tthc thu tuc hanh chinh
	 */
	public void setNgayHetHieuLuc(Date ngayHetHieuLuc);

	/**
	 * Returns the huong dan thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @return the huong dan thuc hien of this tthc thu tuc hanh chinh
	 */
	@AutoEscape
	public String getHuongDanThucHien();

	/**
	 * Sets the huong dan thuc hien of this tthc thu tuc hanh chinh.
	 *
	 * @param huongDanThucHien the huong dan thuc hien of this tthc thu tuc hanh chinh
	 */
	public void setHuongDanThucHien(String huongDanThucHien);

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
		vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh tthcThuTucHanhChinh);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}