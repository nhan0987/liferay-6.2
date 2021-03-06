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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MotCuaPhanCongXuLy service. Represents a row in the &quot;motcua_phancongxuly&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaPhanCongXuLy
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl
 * @generated
 */
public interface MotCuaPhanCongXuLyModel extends BaseModel<MotCuaPhanCongXuLy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mot cua phan cong xu ly model instance should use the {@link MotCuaPhanCongXuLy} interface instead.
	 */

	/**
	 * Returns the primary key of this mot cua phan cong xu ly.
	 *
	 * @return the primary key of this mot cua phan cong xu ly
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mot cua phan cong xu ly.
	 *
	 * @param primaryKey the primary key of this mot cua phan cong xu ly
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this mot cua phan cong xu ly.
	 *
	 * @return the ID of this mot cua phan cong xu ly
	 */
	public long getId();

	/**
	 * Sets the ID of this mot cua phan cong xu ly.
	 *
	 * @param id the ID of this mot cua phan cong xu ly
	 */
	public void setId(long id);

	/**
	 * Returns the phieu xu ly chinh ID of this mot cua phan cong xu ly.
	 *
	 * @return the phieu xu ly chinh ID of this mot cua phan cong xu ly
	 */
	public long getPhieuXuLyChinhId();

	/**
	 * Sets the phieu xu ly chinh ID of this mot cua phan cong xu ly.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID of this mot cua phan cong xu ly
	 */
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId);

	/**
	 * Returns the phieu xu ly phu ID of this mot cua phan cong xu ly.
	 *
	 * @return the phieu xu ly phu ID of this mot cua phan cong xu ly
	 */
	public long getPhieuXuLyPhuId();

	/**
	 * Sets the phieu xu ly phu ID of this mot cua phan cong xu ly.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID of this mot cua phan cong xu ly
	 */
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId);

	/**
	 * Returns the trang thai ho so ID of this mot cua phan cong xu ly.
	 *
	 * @return the trang thai ho so ID of this mot cua phan cong xu ly
	 */
	public long getTrangThaiHoSoId();

	/**
	 * Sets the trang thai ho so ID of this mot cua phan cong xu ly.
	 *
	 * @param trangThaiHoSoId the trang thai ho so ID of this mot cua phan cong xu ly
	 */
	public void setTrangThaiHoSoId(long trangThaiHoSoId);

	/**
	 * Returns the nguoi xu ly of this mot cua phan cong xu ly.
	 *
	 * @return the nguoi xu ly of this mot cua phan cong xu ly
	 */
	public long getNguoiXuLy();

	/**
	 * Sets the nguoi xu ly of this mot cua phan cong xu ly.
	 *
	 * @param nguoiXuLy the nguoi xu ly of this mot cua phan cong xu ly
	 */
	public void setNguoiXuLy(long nguoiXuLy);

	/**
	 * Returns the nhom xu ly of this mot cua phan cong xu ly.
	 *
	 * @return the nhom xu ly of this mot cua phan cong xu ly
	 */
	public long getNhomXuLy();

	/**
	 * Sets the nhom xu ly of this mot cua phan cong xu ly.
	 *
	 * @param nhomXuLy the nhom xu ly of this mot cua phan cong xu ly
	 */
	public void setNhomXuLy(long nhomXuLy);

	/**
	 * Returns the ngay phan cong of this mot cua phan cong xu ly.
	 *
	 * @return the ngay phan cong of this mot cua phan cong xu ly
	 */
	public Date getNgayPhanCong();

	/**
	 * Sets the ngay phan cong of this mot cua phan cong xu ly.
	 *
	 * @param ngayPhanCong the ngay phan cong of this mot cua phan cong xu ly
	 */
	public void setNgayPhanCong(Date ngayPhanCong);

	/**
	 * Returns the nguoi phan cong of this mot cua phan cong xu ly.
	 *
	 * @return the nguoi phan cong of this mot cua phan cong xu ly
	 */
	public long getNguoiPhanCong();

	/**
	 * Sets the nguoi phan cong of this mot cua phan cong xu ly.
	 *
	 * @param nguoiPhanCong the nguoi phan cong of this mot cua phan cong xu ly
	 */
	public void setNguoiPhanCong(long nguoiPhanCong);

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
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy motCuaPhanCongXuLy);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}