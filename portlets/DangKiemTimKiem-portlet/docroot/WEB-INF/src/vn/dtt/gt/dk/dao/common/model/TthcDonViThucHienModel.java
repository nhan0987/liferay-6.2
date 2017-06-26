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

/**
 * The base model interface for the TthcDonViThucHien service. Represents a row in the &quot;tthc_donvithuchien&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHien
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl
 * @generated
 */
public interface TthcDonViThucHienModel extends BaseModel<TthcDonViThucHien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc don vi thuc hien model instance should use the {@link TthcDonViThucHien} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc don vi thuc hien.
	 *
	 * @return the primary key of this tthc don vi thuc hien
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc don vi thuc hien.
	 *
	 * @param primaryKey the primary key of this tthc don vi thuc hien
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc don vi thuc hien.
	 *
	 * @return the ID of this tthc don vi thuc hien
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc don vi thuc hien.
	 *
	 * @param Id the ID of this tthc don vi thuc hien
	 */
	public void setId(long Id);

	/**
	 * Returns the thu tuc hanh chinh ID of this tthc don vi thuc hien.
	 *
	 * @return the thu tuc hanh chinh ID of this tthc don vi thuc hien
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this tthc don vi thuc hien.
	 *
	 * @param ThuTucHanhChinhId the thu tuc hanh chinh ID of this tthc don vi thuc hien
	 */
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId);

	/**
	 * Returns the ma dvth of this tthc don vi thuc hien.
	 *
	 * @return the ma dvth of this tthc don vi thuc hien
	 */
	@AutoEscape
	public String getMaDvth();

	/**
	 * Sets the ma dvth of this tthc don vi thuc hien.
	 *
	 * @param MaDvth the ma dvth of this tthc don vi thuc hien
	 */
	public void setMaDvth(String MaDvth);

	/**
	 * Returns the ten dvth of this tthc don vi thuc hien.
	 *
	 * @return the ten dvth of this tthc don vi thuc hien
	 */
	@AutoEscape
	public String getTenDvth();

	/**
	 * Sets the ten dvth of this tthc don vi thuc hien.
	 *
	 * @param TenDvth the ten dvth of this tthc don vi thuc hien
	 */
	public void setTenDvth(String TenDvth);

	/**
	 * Returns the ten tieng anh of this tthc don vi thuc hien.
	 *
	 * @return the ten tieng anh of this tthc don vi thuc hien
	 */
	@AutoEscape
	public String getTenTiengAnh();

	/**
	 * Sets the ten tieng anh of this tthc don vi thuc hien.
	 *
	 * @param TenTiengAnh the ten tieng anh of this tthc don vi thuc hien
	 */
	public void setTenTiengAnh(String TenTiengAnh);

	/**
	 * Returns the to chuc of this tthc don vi thuc hien.
	 *
	 * @return the to chuc of this tthc don vi thuc hien
	 */
	public long getToChuc();

	/**
	 * Sets the to chuc of this tthc don vi thuc hien.
	 *
	 * @param ToChuc the to chuc of this tthc don vi thuc hien
	 */
	public void setToChuc(long ToChuc);

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
	public int compareTo(TthcDonViThucHien tthcDonViThucHien);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcDonViThucHien> toCacheModel();

	@Override
	public TthcDonViThucHien toEscapedModel();

	@Override
	public TthcDonViThucHien toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}