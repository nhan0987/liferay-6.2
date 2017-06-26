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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmDataGroup}.
 * </p>
 *
 * @author win_64
 * @see DmDataGroup
 * @generated
 */
public class DmDataGroupWrapper implements DmDataGroup,
	ModelWrapper<DmDataGroup> {
	public DmDataGroupWrapper(DmDataGroup dmDataGroup) {
		_dmDataGroup = dmDataGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataGroup.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Code", getCode());
		attributes.put("Name", getName());
		attributes.put("Description", getDescription());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Code = (String)attributes.get("Code");

		if (Code != null) {
			setCode(Code);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	/**
	* Returns the primary key of this dm data group.
	*
	* @return the primary key of this dm data group
	*/
	@Override
	public long getPrimaryKey() {
		return _dmDataGroup.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm data group.
	*
	* @param primaryKey the primary key of this dm data group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmDataGroup.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm data group.
	*
	* @return the ID of this dm data group
	*/
	@Override
	public long getId() {
		return _dmDataGroup.getId();
	}

	/**
	* Sets the ID of this dm data group.
	*
	* @param Id the ID of this dm data group
	*/
	@Override
	public void setId(long Id) {
		_dmDataGroup.setId(Id);
	}

	/**
	* Returns the code of this dm data group.
	*
	* @return the code of this dm data group
	*/
	@Override
	public java.lang.String getCode() {
		return _dmDataGroup.getCode();
	}

	/**
	* Sets the code of this dm data group.
	*
	* @param Code the code of this dm data group
	*/
	@Override
	public void setCode(java.lang.String Code) {
		_dmDataGroup.setCode(Code);
	}

	/**
	* Returns the name of this dm data group.
	*
	* @return the name of this dm data group
	*/
	@Override
	public java.lang.String getName() {
		return _dmDataGroup.getName();
	}

	/**
	* Sets the name of this dm data group.
	*
	* @param Name the name of this dm data group
	*/
	@Override
	public void setName(java.lang.String Name) {
		_dmDataGroup.setName(Name);
	}

	/**
	* Returns the description of this dm data group.
	*
	* @return the description of this dm data group
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmDataGroup.getDescription();
	}

	/**
	* Sets the description of this dm data group.
	*
	* @param Description the description of this dm data group
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_dmDataGroup.setDescription(Description);
	}

	/**
	* Returns the synch date of this dm data group.
	*
	* @return the synch date of this dm data group
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _dmDataGroup.getSynchDate();
	}

	/**
	* Sets the synch date of this dm data group.
	*
	* @param SynchDate the synch date of this dm data group
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_dmDataGroup.setSynchDate(SynchDate);
	}

	@Override
	public boolean isNew() {
		return _dmDataGroup.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmDataGroup.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmDataGroup.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmDataGroup.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmDataGroup.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmDataGroup.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmDataGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmDataGroup.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmDataGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmDataGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmDataGroup.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmDataGroupWrapper((DmDataGroup)_dmDataGroup.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.common.model.DmDataGroup dmDataGroup) {
		return _dmDataGroup.compareTo(dmDataGroup);
	}

	@Override
	public int hashCode() {
		return _dmDataGroup.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.DmDataGroup> toCacheModel() {
		return _dmDataGroup.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup toEscapedModel() {
		return new DmDataGroupWrapper(_dmDataGroup.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup toUnescapedModel() {
		return new DmDataGroupWrapper(_dmDataGroup.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmDataGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmDataGroup.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmDataGroup.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmDataGroupWrapper)) {
			return false;
		}

		DmDataGroupWrapper dmDataGroupWrapper = (DmDataGroupWrapper)obj;

		if (Validator.equals(_dmDataGroup, dmDataGroupWrapper._dmDataGroup)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmDataGroup getWrappedDmDataGroup() {
		return _dmDataGroup;
	}

	@Override
	public DmDataGroup getWrappedModel() {
		return _dmDataGroup;
	}

	@Override
	public void resetOriginalValues() {
		_dmDataGroup.resetOriginalValues();
	}

	private DmDataGroup _dmDataGroup;
}