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
 * The base model interface for the DmDataGroup service. Represents a row in the &quot;dm_datagroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupImpl}.
 * </p>
 *
 * @author win_64
 * @see DmDataGroup
 * @see vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupImpl
 * @see vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl
 * @generated
 */
public interface DmDataGroupModel extends BaseModel<DmDataGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm data group model instance should use the {@link DmDataGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this dm data group.
	 *
	 * @return the primary key of this dm data group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dm data group.
	 *
	 * @param primaryKey the primary key of this dm data group
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dm data group.
	 *
	 * @return the ID of this dm data group
	 */
	public long getId();

	/**
	 * Sets the ID of this dm data group.
	 *
	 * @param Id the ID of this dm data group
	 */
	public void setId(long Id);

	/**
	 * Returns the code of this dm data group.
	 *
	 * @return the code of this dm data group
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this dm data group.
	 *
	 * @param Code the code of this dm data group
	 */
	public void setCode(String Code);

	/**
	 * Returns the name of this dm data group.
	 *
	 * @return the name of this dm data group
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this dm data group.
	 *
	 * @param Name the name of this dm data group
	 */
	public void setName(String Name);

	/**
	 * Returns the description of this dm data group.
	 *
	 * @return the description of this dm data group
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this dm data group.
	 *
	 * @param Description the description of this dm data group
	 */
	public void setDescription(String Description);

	/**
	 * Returns the synch date of this dm data group.
	 *
	 * @return the synch date of this dm data group
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this dm data group.
	 *
	 * @param SynchDate the synch date of this dm data group
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
	public int compareTo(vn.dtt.gt.dk.dao.common.model.DmDataGroup dmDataGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.common.model.DmDataGroup> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}