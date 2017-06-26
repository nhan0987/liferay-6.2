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
 * The base model interface for the TthcLinhVucThuTuc service. Represents a row in the &quot;tthc_linhvucthutuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucImpl}.
 * </p>
 *
 * @author win_64
 * @see TthcLinhVucThuTuc
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucModelImpl
 * @generated
 */
public interface TthcLinhVucThuTucModel extends BaseModel<TthcLinhVucThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tthc linh vuc thu tuc model instance should use the {@link TthcLinhVucThuTuc} interface instead.
	 */

	/**
	 * Returns the primary key of this tthc linh vuc thu tuc.
	 *
	 * @return the primary key of this tthc linh vuc thu tuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tthc linh vuc thu tuc.
	 *
	 * @param primaryKey the primary key of this tthc linh vuc thu tuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tthc linh vuc thu tuc.
	 *
	 * @return the ID of this tthc linh vuc thu tuc
	 */
	public long getId();

	/**
	 * Sets the ID of this tthc linh vuc thu tuc.
	 *
	 * @param Id the ID of this tthc linh vuc thu tuc
	 */
	public void setId(long Id);

	/**
	 * Returns the ten linh vuc of this tthc linh vuc thu tuc.
	 *
	 * @return the ten linh vuc of this tthc linh vuc thu tuc
	 */
	@AutoEscape
	public String getTenLinhVuc();

	/**
	 * Sets the ten linh vuc of this tthc linh vuc thu tuc.
	 *
	 * @param TenLinhVuc the ten linh vuc of this tthc linh vuc thu tuc
	 */
	public void setTenLinhVuc(String TenLinhVuc);

	/**
	 * Returns the ten tieng anh of this tthc linh vuc thu tuc.
	 *
	 * @return the ten tieng anh of this tthc linh vuc thu tuc
	 */
	@AutoEscape
	public String getTenTiengAnh();

	/**
	 * Sets the ten tieng anh of this tthc linh vuc thu tuc.
	 *
	 * @param TenTiengAnh the ten tieng anh of this tthc linh vuc thu tuc
	 */
	public void setTenTiengAnh(String TenTiengAnh);

	/**
	 * Returns the id cha of this tthc linh vuc thu tuc.
	 *
	 * @return the id cha of this tthc linh vuc thu tuc
	 */
	public long getIdCha();

	/**
	 * Sets the id cha of this tthc linh vuc thu tuc.
	 *
	 * @param IdCha the id cha of this tthc linh vuc thu tuc
	 */
	public void setIdCha(long IdCha);

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
	public int compareTo(TthcLinhVucThuTuc tthcLinhVucThuTuc);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TthcLinhVucThuTuc> toCacheModel();

	@Override
	public TthcLinhVucThuTuc toEscapedModel();

	@Override
	public TthcLinhVucThuTuc toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}