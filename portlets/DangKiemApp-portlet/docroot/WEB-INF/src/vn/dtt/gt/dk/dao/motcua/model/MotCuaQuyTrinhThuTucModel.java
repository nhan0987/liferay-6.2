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

/**
 * The base model interface for the MotCuaQuyTrinhThuTuc service. Represents a row in the &quot;motcua_quytrinhthutuc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTuc
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucImpl
 * @see vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl
 * @generated
 */
public interface MotCuaQuyTrinhThuTucModel extends BaseModel<MotCuaQuyTrinhThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mot cua quy trinh thu tuc model instance should use the {@link MotCuaQuyTrinhThuTuc} interface instead.
	 */

	/**
	 * Returns the primary key of this mot cua quy trinh thu tuc.
	 *
	 * @return the primary key of this mot cua quy trinh thu tuc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mot cua quy trinh thu tuc.
	 *
	 * @param primaryKey the primary key of this mot cua quy trinh thu tuc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this mot cua quy trinh thu tuc.
	 *
	 * @return the ID of this mot cua quy trinh thu tuc
	 */
	public long getId();

	/**
	 * Sets the ID of this mot cua quy trinh thu tuc.
	 *
	 * @param id the ID of this mot cua quy trinh thu tuc
	 */
	public void setId(long id);

	/**
	 * Returns the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc.
	 *
	 * @return the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc
	 */
	public long getThuTucHanhChinhId();

	/**
	 * Sets the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID of this mot cua quy trinh thu tuc
	 */
	public void setThuTucHanhChinhId(long thuTucHanhChinhId);

	/**
	 * Returns the ma quy trinh of this mot cua quy trinh thu tuc.
	 *
	 * @return the ma quy trinh of this mot cua quy trinh thu tuc
	 */
	@AutoEscape
	public String getMaQuyTrinh();

	/**
	 * Sets the ma quy trinh of this mot cua quy trinh thu tuc.
	 *
	 * @param maQuyTrinh the ma quy trinh of this mot cua quy trinh thu tuc
	 */
	public void setMaQuyTrinh(String maQuyTrinh);

	/**
	 * Returns the to chuc xu ly of this mot cua quy trinh thu tuc.
	 *
	 * @return the to chuc xu ly of this mot cua quy trinh thu tuc
	 */
	public long getToChucXuLy();

	/**
	 * Sets the to chuc xu ly of this mot cua quy trinh thu tuc.
	 *
	 * @param toChucXuLy the to chuc xu ly of this mot cua quy trinh thu tuc
	 */
	public void setToChucXuLy(long toChucXuLy);

	/**
	 * Returns the so ngay xu ly of this mot cua quy trinh thu tuc.
	 *
	 * @return the so ngay xu ly of this mot cua quy trinh thu tuc
	 */
	public long getSoNgayXuLy();

	/**
	 * Sets the so ngay xu ly of this mot cua quy trinh thu tuc.
	 *
	 * @param soNgayXuLy the so ngay xu ly of this mot cua quy trinh thu tuc
	 */
	public void setSoNgayXuLy(long soNgayXuLy);

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
		vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}