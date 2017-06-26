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
 * The base model interface for the DmDataItem service. Represents a row in the &quot;dm_dataitem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl}.
 * </p>
 *
 * @author win_64
 * @see DmDataItem
 * @see vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl
 * @generated
 */
public interface DmDataItemModel extends BaseModel<DmDataItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm data item model instance should use the {@link DmDataItem} interface instead.
	 */

	/**
	 * Returns the primary key of this dm data item.
	 *
	 * @return the primary key of this dm data item
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dm data item.
	 *
	 * @param primaryKey the primary key of this dm data item
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dm data item.
	 *
	 * @return the ID of this dm data item
	 */
	public long getId();

	/**
	 * Sets the ID of this dm data item.
	 *
	 * @param Id the ID of this dm data item
	 */
	public void setId(long Id);

	/**
	 * Returns the data group ID of this dm data item.
	 *
	 * @return the data group ID of this dm data item
	 */
	public long getDataGroupId();

	/**
	 * Sets the data group ID of this dm data item.
	 *
	 * @param DataGroupId the data group ID of this dm data item
	 */
	public void setDataGroupId(long DataGroupId);

	/**
	 * Returns the code0 of this dm data item.
	 *
	 * @return the code0 of this dm data item
	 */
	@AutoEscape
	public String getCode0();

	/**
	 * Sets the code0 of this dm data item.
	 *
	 * @param Code0 the code0 of this dm data item
	 */
	public void setCode0(String Code0);

	/**
	 * Returns the code1 of this dm data item.
	 *
	 * @return the code1 of this dm data item
	 */
	@AutoEscape
	public String getCode1();

	/**
	 * Sets the code1 of this dm data item.
	 *
	 * @param Code1 the code1 of this dm data item
	 */
	public void setCode1(String Code1);

	/**
	 * Returns the code2 of this dm data item.
	 *
	 * @return the code2 of this dm data item
	 */
	@AutoEscape
	public String getCode2();

	/**
	 * Sets the code2 of this dm data item.
	 *
	 * @param Code2 the code2 of this dm data item
	 */
	public void setCode2(String Code2);

	/**
	 * Returns the code3 of this dm data item.
	 *
	 * @return the code3 of this dm data item
	 */
	@AutoEscape
	public String getCode3();

	/**
	 * Sets the code3 of this dm data item.
	 *
	 * @param Code3 the code3 of this dm data item
	 */
	public void setCode3(String Code3);

	/**
	 * Returns the level of this dm data item.
	 *
	 * @return the level of this dm data item
	 */
	public int getLevel();

	/**
	 * Sets the level of this dm data item.
	 *
	 * @param Level the level of this dm data item
	 */
	public void setLevel(int Level);

	/**
	 * Returns the name of this dm data item.
	 *
	 * @return the name of this dm data item
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this dm data item.
	 *
	 * @param Name the name of this dm data item
	 */
	public void setName(String Name);

	/**
	 * Returns the alter name of this dm data item.
	 *
	 * @return the alter name of this dm data item
	 */
	@AutoEscape
	public String getAlterName();

	/**
	 * Sets the alter name of this dm data item.
	 *
	 * @param AlterName the alter name of this dm data item
	 */
	public void setAlterName(String AlterName);

	/**
	 * Returns the description of this dm data item.
	 *
	 * @return the description of this dm data item
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this dm data item.
	 *
	 * @param Description the description of this dm data item
	 */
	public void setDescription(String Description);

	/**
	 * Returns the validated from of this dm data item.
	 *
	 * @return the validated from of this dm data item
	 */
	@AutoEscape
	public String getValidatedFrom();

	/**
	 * Sets the validated from of this dm data item.
	 *
	 * @param ValidatedFrom the validated from of this dm data item
	 */
	public void setValidatedFrom(String ValidatedFrom);

	/**
	 * Returns the validated to of this dm data item.
	 *
	 * @return the validated to of this dm data item
	 */
	@AutoEscape
	public String getValidatedTo();

	/**
	 * Sets the validated to of this dm data item.
	 *
	 * @param ValidatedTo the validated to of this dm data item
	 */
	public void setValidatedTo(String ValidatedTo);

	/**
	 * Returns the status of this dm data item.
	 *
	 * @return the status of this dm data item
	 */
	public int getStatus();

	/**
	 * Sets the status of this dm data item.
	 *
	 * @param Status the status of this dm data item
	 */
	public void setStatus(int Status);

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
	public int compareTo(vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.common.model.DmDataItem> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}