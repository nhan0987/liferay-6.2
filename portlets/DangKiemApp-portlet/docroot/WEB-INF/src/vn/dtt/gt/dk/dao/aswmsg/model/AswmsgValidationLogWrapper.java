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

package vn.dtt.gt.dk.dao.aswmsg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AswmsgValidationLog}.
 * </p>
 *
 * @author win_64
 * @see AswmsgValidationLog
 * @generated
 */
public class AswmsgValidationLogWrapper implements AswmsgValidationLog,
	ModelWrapper<AswmsgValidationLog> {
	public AswmsgValidationLogWrapper(AswmsgValidationLog aswmsgValidationLog) {
		_aswmsgValidationLog = aswmsgValidationLog;
	}

	@Override
	public Class<?> getModelClass() {
		return AswmsgValidationLog.class;
	}

	@Override
	public String getModelClassName() {
		return AswmsgValidationLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MessageLogId", getMessageLogId());
		attributes.put("TagName", getTagName());
		attributes.put("ValidationCode", getValidationCode());
		attributes.put("Description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long MessageLogId = (Long)attributes.get("MessageLogId");

		if (MessageLogId != null) {
			setMessageLogId(MessageLogId);
		}

		String TagName = (String)attributes.get("TagName");

		if (TagName != null) {
			setTagName(TagName);
		}

		String ValidationCode = (String)attributes.get("ValidationCode");

		if (ValidationCode != null) {
			setValidationCode(ValidationCode);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}
	}

	/**
	* Returns the primary key of this aswmsg validation log.
	*
	* @return the primary key of this aswmsg validation log
	*/
	@Override
	public long getPrimaryKey() {
		return _aswmsgValidationLog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this aswmsg validation log.
	*
	* @param primaryKey the primary key of this aswmsg validation log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_aswmsgValidationLog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this aswmsg validation log.
	*
	* @return the ID of this aswmsg validation log
	*/
	@Override
	public long getId() {
		return _aswmsgValidationLog.getId();
	}

	/**
	* Sets the ID of this aswmsg validation log.
	*
	* @param Id the ID of this aswmsg validation log
	*/
	@Override
	public void setId(long Id) {
		_aswmsgValidationLog.setId(Id);
	}

	/**
	* Returns the message log ID of this aswmsg validation log.
	*
	* @return the message log ID of this aswmsg validation log
	*/
	@Override
	public long getMessageLogId() {
		return _aswmsgValidationLog.getMessageLogId();
	}

	/**
	* Sets the message log ID of this aswmsg validation log.
	*
	* @param MessageLogId the message log ID of this aswmsg validation log
	*/
	@Override
	public void setMessageLogId(long MessageLogId) {
		_aswmsgValidationLog.setMessageLogId(MessageLogId);
	}

	/**
	* Returns the tag name of this aswmsg validation log.
	*
	* @return the tag name of this aswmsg validation log
	*/
	@Override
	public java.lang.String getTagName() {
		return _aswmsgValidationLog.getTagName();
	}

	/**
	* Sets the tag name of this aswmsg validation log.
	*
	* @param TagName the tag name of this aswmsg validation log
	*/
	@Override
	public void setTagName(java.lang.String TagName) {
		_aswmsgValidationLog.setTagName(TagName);
	}

	/**
	* Returns the validation code of this aswmsg validation log.
	*
	* @return the validation code of this aswmsg validation log
	*/
	@Override
	public java.lang.String getValidationCode() {
		return _aswmsgValidationLog.getValidationCode();
	}

	/**
	* Sets the validation code of this aswmsg validation log.
	*
	* @param ValidationCode the validation code of this aswmsg validation log
	*/
	@Override
	public void setValidationCode(java.lang.String ValidationCode) {
		_aswmsgValidationLog.setValidationCode(ValidationCode);
	}

	/**
	* Returns the description of this aswmsg validation log.
	*
	* @return the description of this aswmsg validation log
	*/
	@Override
	public java.lang.String getDescription() {
		return _aswmsgValidationLog.getDescription();
	}

	/**
	* Sets the description of this aswmsg validation log.
	*
	* @param Description the description of this aswmsg validation log
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_aswmsgValidationLog.setDescription(Description);
	}

	@Override
	public boolean isNew() {
		return _aswmsgValidationLog.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_aswmsgValidationLog.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _aswmsgValidationLog.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_aswmsgValidationLog.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _aswmsgValidationLog.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _aswmsgValidationLog.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_aswmsgValidationLog.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _aswmsgValidationLog.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_aswmsgValidationLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_aswmsgValidationLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_aswmsgValidationLog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AswmsgValidationLogWrapper((AswmsgValidationLog)_aswmsgValidationLog.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog aswmsgValidationLog) {
		return _aswmsgValidationLog.compareTo(aswmsgValidationLog);
	}

	@Override
	public int hashCode() {
		return _aswmsgValidationLog.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> toCacheModel() {
		return _aswmsgValidationLog.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog toEscapedModel() {
		return new AswmsgValidationLogWrapper(_aswmsgValidationLog.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog toUnescapedModel() {
		return new AswmsgValidationLogWrapper(_aswmsgValidationLog.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _aswmsgValidationLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _aswmsgValidationLog.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_aswmsgValidationLog.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AswmsgValidationLogWrapper)) {
			return false;
		}

		AswmsgValidationLogWrapper aswmsgValidationLogWrapper = (AswmsgValidationLogWrapper)obj;

		if (Validator.equals(_aswmsgValidationLog,
					aswmsgValidationLogWrapper._aswmsgValidationLog)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AswmsgValidationLog getWrappedAswmsgValidationLog() {
		return _aswmsgValidationLog;
	}

	@Override
	public AswmsgValidationLog getWrappedModel() {
		return _aswmsgValidationLog;
	}

	@Override
	public void resetOriginalValues() {
		_aswmsgValidationLog.resetOriginalValues();
	}

	private AswmsgValidationLog _aswmsgValidationLog;
}