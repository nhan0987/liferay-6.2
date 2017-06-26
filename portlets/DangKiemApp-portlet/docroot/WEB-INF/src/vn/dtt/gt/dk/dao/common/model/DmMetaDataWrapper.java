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
 * This class is a wrapper for {@link DmMetaData}.
 * </p>
 *
 * @author win_64
 * @see DmMetaData
 * @generated
 */
public class DmMetaDataWrapper implements DmMetaData, ModelWrapper<DmMetaData> {
	public DmMetaDataWrapper(DmMetaData dmMetaData) {
		_dmMetaData = dmMetaData;
	}

	@Override
	public Class<?> getModelClass() {
		return DmMetaData.class;
	}

	@Override
	public String getModelClassName() {
		return DmMetaData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Entity", getEntity());
		attributes.put("FieldCode", getFieldCode());
		attributes.put("FieldName", getFieldName());
		attributes.put("FieldAlterName", getFieldAlterName());
		attributes.put("FieldDescription", getFieldDescription());
		attributes.put("FieldDataSet", getFieldDataSet());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Entity = (String)attributes.get("Entity");

		if (Entity != null) {
			setEntity(Entity);
		}

		String FieldCode = (String)attributes.get("FieldCode");

		if (FieldCode != null) {
			setFieldCode(FieldCode);
		}

		String FieldName = (String)attributes.get("FieldName");

		if (FieldName != null) {
			setFieldName(FieldName);
		}

		String FieldAlterName = (String)attributes.get("FieldAlterName");

		if (FieldAlterName != null) {
			setFieldAlterName(FieldAlterName);
		}

		String FieldDescription = (String)attributes.get("FieldDescription");

		if (FieldDescription != null) {
			setFieldDescription(FieldDescription);
		}

		String FieldDataSet = (String)attributes.get("FieldDataSet");

		if (FieldDataSet != null) {
			setFieldDataSet(FieldDataSet);
		}
	}

	/**
	* Returns the primary key of this dm meta data.
	*
	* @return the primary key of this dm meta data
	*/
	@Override
	public long getPrimaryKey() {
		return _dmMetaData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm meta data.
	*
	* @param primaryKey the primary key of this dm meta data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmMetaData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm meta data.
	*
	* @return the ID of this dm meta data
	*/
	@Override
	public long getId() {
		return _dmMetaData.getId();
	}

	/**
	* Sets the ID of this dm meta data.
	*
	* @param Id the ID of this dm meta data
	*/
	@Override
	public void setId(long Id) {
		_dmMetaData.setId(Id);
	}

	/**
	* Returns the entity of this dm meta data.
	*
	* @return the entity of this dm meta data
	*/
	@Override
	public java.lang.String getEntity() {
		return _dmMetaData.getEntity();
	}

	/**
	* Sets the entity of this dm meta data.
	*
	* @param Entity the entity of this dm meta data
	*/
	@Override
	public void setEntity(java.lang.String Entity) {
		_dmMetaData.setEntity(Entity);
	}

	/**
	* Returns the field code of this dm meta data.
	*
	* @return the field code of this dm meta data
	*/
	@Override
	public java.lang.String getFieldCode() {
		return _dmMetaData.getFieldCode();
	}

	/**
	* Sets the field code of this dm meta data.
	*
	* @param FieldCode the field code of this dm meta data
	*/
	@Override
	public void setFieldCode(java.lang.String FieldCode) {
		_dmMetaData.setFieldCode(FieldCode);
	}

	/**
	* Returns the field name of this dm meta data.
	*
	* @return the field name of this dm meta data
	*/
	@Override
	public java.lang.String getFieldName() {
		return _dmMetaData.getFieldName();
	}

	/**
	* Sets the field name of this dm meta data.
	*
	* @param FieldName the field name of this dm meta data
	*/
	@Override
	public void setFieldName(java.lang.String FieldName) {
		_dmMetaData.setFieldName(FieldName);
	}

	/**
	* Returns the field alter name of this dm meta data.
	*
	* @return the field alter name of this dm meta data
	*/
	@Override
	public java.lang.String getFieldAlterName() {
		return _dmMetaData.getFieldAlterName();
	}

	/**
	* Sets the field alter name of this dm meta data.
	*
	* @param FieldAlterName the field alter name of this dm meta data
	*/
	@Override
	public void setFieldAlterName(java.lang.String FieldAlterName) {
		_dmMetaData.setFieldAlterName(FieldAlterName);
	}

	/**
	* Returns the field description of this dm meta data.
	*
	* @return the field description of this dm meta data
	*/
	@Override
	public java.lang.String getFieldDescription() {
		return _dmMetaData.getFieldDescription();
	}

	/**
	* Sets the field description of this dm meta data.
	*
	* @param FieldDescription the field description of this dm meta data
	*/
	@Override
	public void setFieldDescription(java.lang.String FieldDescription) {
		_dmMetaData.setFieldDescription(FieldDescription);
	}

	/**
	* Returns the field data set of this dm meta data.
	*
	* @return the field data set of this dm meta data
	*/
	@Override
	public java.lang.String getFieldDataSet() {
		return _dmMetaData.getFieldDataSet();
	}

	/**
	* Sets the field data set of this dm meta data.
	*
	* @param FieldDataSet the field data set of this dm meta data
	*/
	@Override
	public void setFieldDataSet(java.lang.String FieldDataSet) {
		_dmMetaData.setFieldDataSet(FieldDataSet);
	}

	@Override
	public boolean isNew() {
		return _dmMetaData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmMetaData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmMetaData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmMetaData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmMetaData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmMetaData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmMetaData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmMetaData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmMetaData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmMetaData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmMetaData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmMetaDataWrapper((DmMetaData)_dmMetaData.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.common.model.DmMetaData dmMetaData) {
		return _dmMetaData.compareTo(dmMetaData);
	}

	@Override
	public int hashCode() {
		return _dmMetaData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.common.model.DmMetaData> toCacheModel() {
		return _dmMetaData.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmMetaData toEscapedModel() {
		return new DmMetaDataWrapper(_dmMetaData.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmMetaData toUnescapedModel() {
		return new DmMetaDataWrapper(_dmMetaData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmMetaData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmMetaData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmMetaData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmMetaDataWrapper)) {
			return false;
		}

		DmMetaDataWrapper dmMetaDataWrapper = (DmMetaDataWrapper)obj;

		if (Validator.equals(_dmMetaData, dmMetaDataWrapper._dmMetaData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmMetaData getWrappedDmMetaData() {
		return _dmMetaData;
	}

	@Override
	public DmMetaData getWrappedModel() {
		return _dmMetaData;
	}

	@Override
	public void resetOriginalValues() {
		_dmMetaData.resetOriginalValues();
	}

	private DmMetaData _dmMetaData;
}