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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmDataItem}.
 * </p>
 *
 * @author win_64
 * @see DmDataItem
 * @generated
 */
public class DmDataItemWrapper implements DmDataItem, ModelWrapper<DmDataItem> {
	public DmDataItemWrapper(DmDataItem dmDataItem) {
		_dmDataItem = dmDataItem;
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("DataGroupId", getDataGroupId());
		attributes.put("Code0", getCode0());
		attributes.put("Code1", getCode1());
		attributes.put("Code2", getCode2());
		attributes.put("Code3", getCode3());
		attributes.put("Level", getLevel());
		attributes.put("Name", getName());
		attributes.put("AlterName", getAlterName());
		attributes.put("Description", getDescription());
		attributes.put("ValidatedFrom", getValidatedFrom());
		attributes.put("ValidatedTo", getValidatedTo());
		attributes.put("Status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long DataGroupId = (Long)attributes.get("DataGroupId");

		if (DataGroupId != null) {
			setDataGroupId(DataGroupId);
		}

		String Code0 = (String)attributes.get("Code0");

		if (Code0 != null) {
			setCode0(Code0);
		}

		String Code1 = (String)attributes.get("Code1");

		if (Code1 != null) {
			setCode1(Code1);
		}

		String Code2 = (String)attributes.get("Code2");

		if (Code2 != null) {
			setCode2(Code2);
		}

		String Code3 = (String)attributes.get("Code3");

		if (Code3 != null) {
			setCode3(Code3);
		}

		Integer Level = (Integer)attributes.get("Level");

		if (Level != null) {
			setLevel(Level);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String AlterName = (String)attributes.get("AlterName");

		if (AlterName != null) {
			setAlterName(AlterName);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String ValidatedFrom = (String)attributes.get("ValidatedFrom");

		if (ValidatedFrom != null) {
			setValidatedFrom(ValidatedFrom);
		}

		String ValidatedTo = (String)attributes.get("ValidatedTo");

		if (ValidatedTo != null) {
			setValidatedTo(ValidatedTo);
		}

		Integer Status = (Integer)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}
	}

	/**
	* Returns the primary key of this dm data item.
	*
	* @return the primary key of this dm data item
	*/
	@Override
	public long getPrimaryKey() {
		return _dmDataItem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm data item.
	*
	* @param primaryKey the primary key of this dm data item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmDataItem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm data item.
	*
	* @return the ID of this dm data item
	*/
	@Override
	public long getId() {
		return _dmDataItem.getId();
	}

	/**
	* Sets the ID of this dm data item.
	*
	* @param Id the ID of this dm data item
	*/
	@Override
	public void setId(long Id) {
		_dmDataItem.setId(Id);
	}

	/**
	* Returns the data group ID of this dm data item.
	*
	* @return the data group ID of this dm data item
	*/
	@Override
	public long getDataGroupId() {
		return _dmDataItem.getDataGroupId();
	}

	/**
	* Sets the data group ID of this dm data item.
	*
	* @param DataGroupId the data group ID of this dm data item
	*/
	@Override
	public void setDataGroupId(long DataGroupId) {
		_dmDataItem.setDataGroupId(DataGroupId);
	}

	/**
	* Returns the code0 of this dm data item.
	*
	* @return the code0 of this dm data item
	*/
	@Override
	public java.lang.String getCode0() {
		return _dmDataItem.getCode0();
	}

	/**
	* Sets the code0 of this dm data item.
	*
	* @param Code0 the code0 of this dm data item
	*/
	@Override
	public void setCode0(java.lang.String Code0) {
		_dmDataItem.setCode0(Code0);
	}

	/**
	* Returns the code1 of this dm data item.
	*
	* @return the code1 of this dm data item
	*/
	@Override
	public java.lang.String getCode1() {
		return _dmDataItem.getCode1();
	}

	/**
	* Sets the code1 of this dm data item.
	*
	* @param Code1 the code1 of this dm data item
	*/
	@Override
	public void setCode1(java.lang.String Code1) {
		_dmDataItem.setCode1(Code1);
	}

	/**
	* Returns the code2 of this dm data item.
	*
	* @return the code2 of this dm data item
	*/
	@Override
	public java.lang.String getCode2() {
		return _dmDataItem.getCode2();
	}

	/**
	* Sets the code2 of this dm data item.
	*
	* @param Code2 the code2 of this dm data item
	*/
	@Override
	public void setCode2(java.lang.String Code2) {
		_dmDataItem.setCode2(Code2);
	}

	/**
	* Returns the code3 of this dm data item.
	*
	* @return the code3 of this dm data item
	*/
	@Override
	public java.lang.String getCode3() {
		return _dmDataItem.getCode3();
	}

	/**
	* Sets the code3 of this dm data item.
	*
	* @param Code3 the code3 of this dm data item
	*/
	@Override
	public void setCode3(java.lang.String Code3) {
		_dmDataItem.setCode3(Code3);
	}

	/**
	* Returns the level of this dm data item.
	*
	* @return the level of this dm data item
	*/
	@Override
	public int getLevel() {
		return _dmDataItem.getLevel();
	}

	/**
	* Sets the level of this dm data item.
	*
	* @param Level the level of this dm data item
	*/
	@Override
	public void setLevel(int Level) {
		_dmDataItem.setLevel(Level);
	}

	/**
	* Returns the name of this dm data item.
	*
	* @return the name of this dm data item
	*/
	@Override
	public java.lang.String getName() {
		return _dmDataItem.getName();
	}

	/**
	* Sets the name of this dm data item.
	*
	* @param Name the name of this dm data item
	*/
	@Override
	public void setName(java.lang.String Name) {
		_dmDataItem.setName(Name);
	}

	/**
	* Returns the alter name of this dm data item.
	*
	* @return the alter name of this dm data item
	*/
	@Override
	public java.lang.String getAlterName() {
		return _dmDataItem.getAlterName();
	}

	/**
	* Sets the alter name of this dm data item.
	*
	* @param AlterName the alter name of this dm data item
	*/
	@Override
	public void setAlterName(java.lang.String AlterName) {
		_dmDataItem.setAlterName(AlterName);
	}

	/**
	* Returns the description of this dm data item.
	*
	* @return the description of this dm data item
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmDataItem.getDescription();
	}

	/**
	* Sets the description of this dm data item.
	*
	* @param Description the description of this dm data item
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_dmDataItem.setDescription(Description);
	}

	/**
	* Returns the validated from of this dm data item.
	*
	* @return the validated from of this dm data item
	*/
	@Override
	public java.lang.String getValidatedFrom() {
		return _dmDataItem.getValidatedFrom();
	}

	/**
	* Sets the validated from of this dm data item.
	*
	* @param ValidatedFrom the validated from of this dm data item
	*/
	@Override
	public void setValidatedFrom(java.lang.String ValidatedFrom) {
		_dmDataItem.setValidatedFrom(ValidatedFrom);
	}

	/**
	* Returns the validated to of this dm data item.
	*
	* @return the validated to of this dm data item
	*/
	@Override
	public java.lang.String getValidatedTo() {
		return _dmDataItem.getValidatedTo();
	}

	/**
	* Sets the validated to of this dm data item.
	*
	* @param ValidatedTo the validated to of this dm data item
	*/
	@Override
	public void setValidatedTo(java.lang.String ValidatedTo) {
		_dmDataItem.setValidatedTo(ValidatedTo);
	}

	/**
	* Returns the status of this dm data item.
	*
	* @return the status of this dm data item
	*/
	@Override
	public int getStatus() {
		return _dmDataItem.getStatus();
	}

	/**
	* Sets the status of this dm data item.
	*
	* @param Status the status of this dm data item
	*/
	@Override
	public void setStatus(int Status) {
		_dmDataItem.setStatus(Status);
	}

	@Override
	public boolean isNew() {
		return _dmDataItem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmDataItem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmDataItem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmDataItem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmDataItem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmDataItem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmDataItem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmDataItem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmDataItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmDataItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmDataItem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmDataItemWrapper((DmDataItem)_dmDataItem.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem) {
		return _dmDataItem.compareTo(dmDataItem);
	}

	@Override
	public int hashCode() {
		return _dmDataItem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.DmDataItem> toCacheModel() {
		return _dmDataItem.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem toEscapedModel() {
		return new DmDataItemWrapper(_dmDataItem.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem toUnescapedModel() {
		return new DmDataItemWrapper(_dmDataItem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmDataItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmDataItem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmDataItem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmDataItemWrapper)) {
			return false;
		}

		DmDataItemWrapper dmDataItemWrapper = (DmDataItemWrapper)obj;

		if (Validator.equals(_dmDataItem, dmDataItemWrapper._dmDataItem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmDataItem getWrappedDmDataItem() {
		return _dmDataItem;
	}

	@Override
	public DmDataItem getWrappedModel() {
		return _dmDataItem;
	}

	@Override
	public void resetOriginalValues() {
		_dmDataItem.resetOriginalValues();
	}

	private DmDataItem _dmDataItem;
}