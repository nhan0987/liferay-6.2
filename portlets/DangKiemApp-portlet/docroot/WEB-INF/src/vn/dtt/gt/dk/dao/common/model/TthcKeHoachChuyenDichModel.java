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
 * The base model interface for the TthcKeHoachChuyenDich service. Represents a row in the &quot;tthc_kehoachchuyendich&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcKeHoachChuyenDich
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl
 * @generated
 */
public interface TthcKeHoachChuyenDichModel extends BaseModel<TthcKeHoachChuyenDich> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc ke hoach chuyen dich model instance should use the {@link TthcKeHoachChuyenDich} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc ke hoach chuyen dich.
	 *
	 * @return the primary key of this tthc ke hoach chuyen dich
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc ke hoach chuyen dich.
	 *
	 * @param primaryKey the primary key of this tthc ke hoach chuyen dich
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc ke hoach chuyen dich.
	 *
	 * @return the ID of this tthc ke hoach chuyen dich
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc ke hoach chuyen dich.
	 *
	 * @param id the ID of this tthc ke hoach chuyen dich
	 */
	public void setId(long id);

	/**
	 * Returns the phieu xu ly chinh ID of this tthc ke hoach chuyen dich.
	 *
	 * @return the phieu xu ly chinh ID of this tthc ke hoach chuyen dich
	 */
	public long getPhieuXuLyChinhId();

	/**
	 * Sets the phieu xu ly chinh ID of this tthc ke hoach chuyen dich.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID of this tthc ke hoach chuyen dich
	 */
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId);

	/**
	 * Returns the phieu xu ly phu ID of this tthc ke hoach chuyen dich.
	 *
	 * @return the phieu xu ly phu ID of this tthc ke hoach chuyen dich
	 */
	public long getPhieuXuLyPhuId();

	/**
	 * Sets the phieu xu ly phu ID of this tthc ke hoach chuyen dich.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID of this tthc ke hoach chuyen dich
	 */
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId);

	/**
	 * Returns the message ID of this tthc ke hoach chuyen dich.
	 *
	 * @return the message ID of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getMessageId();

	/**
	 * Sets the message ID of this tthc ke hoach chuyen dich.
	 *
	 * @param messageId the message ID of this tthc ke hoach chuyen dich
	 */
	public void setMessageId(String messageId);

	/**
	 * Returns the message status of this tthc ke hoach chuyen dich.
	 *
	 * @return the message status of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getMessageStatus();

	/**
	 * Sets the message status of this tthc ke hoach chuyen dich.
	 *
	 * @param messageStatus the message status of this tthc ke hoach chuyen dich
	 */
	public void setMessageStatus(String messageStatus);

	/**
	 * Returns the trang thai nguon ID of this tthc ke hoach chuyen dich.
	 *
	 * @return the trang thai nguon ID of this tthc ke hoach chuyen dich
	 */
	public long getTrangThaiNguonId();

	/**
	 * Sets the trang thai nguon ID of this tthc ke hoach chuyen dich.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID of this tthc ke hoach chuyen dich
	 */
	public void setTrangThaiNguonId(long trangThaiNguonId);

	/**
	 * Returns the dieu kien chuyen dich of this tthc ke hoach chuyen dich.
	 *
	 * @return the dieu kien chuyen dich of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getDieuKienChuyenDich();

	/**
	 * Sets the dieu kien chuyen dich of this tthc ke hoach chuyen dich.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich of this tthc ke hoach chuyen dich
	 */
	public void setDieuKienChuyenDich(String dieuKienChuyenDich);

	/**
	 * Returns the trang thai dich ID of this tthc ke hoach chuyen dich.
	 *
	 * @return the trang thai dich ID of this tthc ke hoach chuyen dich
	 */
	public long getTrangThaiDichId();

	/**
	 * Sets the trang thai dich ID of this tthc ke hoach chuyen dich.
	 *
	 * @param trangThaiDichId the trang thai dich ID of this tthc ke hoach chuyen dich
	 */
	public void setTrangThaiDichId(long trangThaiDichId);

	/**
	 * Returns the phan nhom ho so ID of this tthc ke hoach chuyen dich.
	 *
	 * @return the phan nhom ho so ID of this tthc ke hoach chuyen dich
	 */
	public long getPhanNhomHoSoId();

	/**
	 * Sets the phan nhom ho so ID of this tthc ke hoach chuyen dich.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID of this tthc ke hoach chuyen dich
	 */
	public void setPhanNhomHoSoId(long phanNhomHoSoId);

	/**
	 * Returns the nhom phieu xu ly of this tthc ke hoach chuyen dich.
	 *
	 * @return the nhom phieu xu ly of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getNhomPhieuXuLy();

	/**
	 * Sets the nhom phieu xu ly of this tthc ke hoach chuyen dich.
	 *
	 * @param nhomPhieuXuLy the nhom phieu xu ly of this tthc ke hoach chuyen dich
	 */
	public void setNhomPhieuXuLy(String nhomPhieuXuLy);

	/**
	 * Returns the hoan tat of this tthc ke hoach chuyen dich.
	 *
	 * @return the hoan tat of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getHoanTat();

	/**
	 * Sets the hoan tat of this tthc ke hoach chuyen dich.
	 *
	 * @param hoanTat the hoan tat of this tthc ke hoach chuyen dich
	 */
	public void setHoanTat(String hoanTat);

	/**
	 * Returns the ghi chu of this tthc ke hoach chuyen dich.
	 *
	 * @return the ghi chu of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this tthc ke hoach chuyen dich.
	 *
	 * @param ghiChu the ghi chu of this tthc ke hoach chuyen dich
	 */
	public void setGhiChu(String ghiChu);

	/**
	 * Returns the debitnote number of this tthc ke hoach chuyen dich.
	 *
	 * @return the debitnote number of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getDebitnoteNumber();

	/**
	 * Sets the debitnote number of this tthc ke hoach chuyen dich.
	 *
	 * @param debitnoteNumber the debitnote number of this tthc ke hoach chuyen dich
	 */
	public void setDebitnoteNumber(String debitnoteNumber);

	/**
	 * Returns the message function of this tthc ke hoach chuyen dich.
	 *
	 * @return the message function of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getMessageFunction();

	/**
	 * Sets the message function of this tthc ke hoach chuyen dich.
	 *
	 * @param messageFunction the message function of this tthc ke hoach chuyen dich
	 */
	public void setMessageFunction(String messageFunction);

	/**
	 * Returns the message type of this tthc ke hoach chuyen dich.
	 *
	 * @return the message type of this tthc ke hoach chuyen dich
	 */
	@AutoEscape
	public String getMessageType();

	/**
	 * Sets the message type of this tthc ke hoach chuyen dich.
	 *
	 * @param messageType the message type of this tthc ke hoach chuyen dich
	 */
	public void setMessageType(String messageType);

	/**
	 * Returns the thoi diem cap nhat of this tthc ke hoach chuyen dich.
	 *
	 * @return the thoi diem cap nhat of this tthc ke hoach chuyen dich
	 */
	public Date getThoiDiemCapNhat();

	/**
	 * Sets the thoi diem cap nhat of this tthc ke hoach chuyen dich.
	 *
	 * @param thoiDiemCapNhat the thoi diem cap nhat of this tthc ke hoach chuyen dich
	 */
	public void setThoiDiemCapNhat(Date thoiDiemCapNhat);

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
	public int compareTo(TthcKeHoachChuyenDich tthcKeHoachChuyenDich);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcKeHoachChuyenDich> toCacheModel();

	@Override
	public TthcKeHoachChuyenDich toEscapedModel();

	@Override
	public TthcKeHoachChuyenDich toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}