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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MotCuaNotification}.
 * </p>
 *
 * @author huymq
 * @see MotCuaNotification
 * @generated
 */
public class MotCuaNotificationWrapper implements MotCuaNotification,
	ModelWrapper<MotCuaNotification> {
	public MotCuaNotificationWrapper(MotCuaNotification motCuaNotification) {
		_motCuaNotification = motCuaNotification;
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaNotification.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaNotification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dossierid", getDossierid());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("officerName", getOfficerName());
		attributes.put("messageID", getMessageID());
		attributes.put("messageType", getMessageType());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());
		attributes.put("response", getResponse());
		attributes.put("responseTime", getResponseTime());
		attributes.put("requestContent", getRequestContent());
		attributes.put("requestTime", getRequestTime());
		attributes.put("requestSender", getRequestSender());
		attributes.put("isReply", getIsReply());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dossierid = (Long)attributes.get("dossierid");

		if (dossierid != null) {
			setDossierid(dossierid);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String officerName = (String)attributes.get("officerName");

		if (officerName != null) {
			setOfficerName(officerName);
		}

		String messageID = (String)attributes.get("messageID");

		if (messageID != null) {
			setMessageID(messageID);
		}

		Long messageType = (Long)attributes.get("messageType");

		if (messageType != null) {
			setMessageType(messageType);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}

		Date responseTime = (Date)attributes.get("responseTime");

		if (responseTime != null) {
			setResponseTime(responseTime);
		}

		String requestContent = (String)attributes.get("requestContent");

		if (requestContent != null) {
			setRequestContent(requestContent);
		}

		Date requestTime = (Date)attributes.get("requestTime");

		if (requestTime != null) {
			setRequestTime(requestTime);
		}

		String requestSender = (String)attributes.get("requestSender");

		if (requestSender != null) {
			setRequestSender(requestSender);
		}

		Long isReply = (Long)attributes.get("isReply");

		if (isReply != null) {
			setIsReply(isReply);
		}
	}

	/**
	* Returns the primary key of this mot cua notification.
	*
	* @return the primary key of this mot cua notification
	*/
	@Override
	public long getPrimaryKey() {
		return _motCuaNotification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mot cua notification.
	*
	* @param primaryKey the primary key of this mot cua notification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_motCuaNotification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this mot cua notification.
	*
	* @return the ID of this mot cua notification
	*/
	@Override
	public long getId() {
		return _motCuaNotification.getId();
	}

	/**
	* Sets the ID of this mot cua notification.
	*
	* @param id the ID of this mot cua notification
	*/
	@Override
	public void setId(long id) {
		_motCuaNotification.setId(id);
	}

	/**
	* Returns the dossierid of this mot cua notification.
	*
	* @return the dossierid of this mot cua notification
	*/
	@Override
	public long getDossierid() {
		return _motCuaNotification.getDossierid();
	}

	/**
	* Sets the dossierid of this mot cua notification.
	*
	* @param dossierid the dossierid of this mot cua notification
	*/
	@Override
	public void setDossierid(long dossierid) {
		_motCuaNotification.setDossierid(dossierid);
	}

	/**
	* Returns the organization of this mot cua notification.
	*
	* @return the organization of this mot cua notification
	*/
	@Override
	public java.lang.String getOrganization() {
		return _motCuaNotification.getOrganization();
	}

	/**
	* Sets the organization of this mot cua notification.
	*
	* @param organization the organization of this mot cua notification
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_motCuaNotification.setOrganization(organization);
	}

	/**
	* Returns the division of this mot cua notification.
	*
	* @return the division of this mot cua notification
	*/
	@Override
	public java.lang.String getDivision() {
		return _motCuaNotification.getDivision();
	}

	/**
	* Sets the division of this mot cua notification.
	*
	* @param division the division of this mot cua notification
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_motCuaNotification.setDivision(division);
	}

	/**
	* Returns the officer name of this mot cua notification.
	*
	* @return the officer name of this mot cua notification
	*/
	@Override
	public java.lang.String getOfficerName() {
		return _motCuaNotification.getOfficerName();
	}

	/**
	* Sets the officer name of this mot cua notification.
	*
	* @param officerName the officer name of this mot cua notification
	*/
	@Override
	public void setOfficerName(java.lang.String officerName) {
		_motCuaNotification.setOfficerName(officerName);
	}

	/**
	* Returns the message i d of this mot cua notification.
	*
	* @return the message i d of this mot cua notification
	*/
	@Override
	public java.lang.String getMessageID() {
		return _motCuaNotification.getMessageID();
	}

	/**
	* Sets the message i d of this mot cua notification.
	*
	* @param messageID the message i d of this mot cua notification
	*/
	@Override
	public void setMessageID(java.lang.String messageID) {
		_motCuaNotification.setMessageID(messageID);
	}

	/**
	* Returns the message type of this mot cua notification.
	*
	* @return the message type of this mot cua notification
	*/
	@Override
	public long getMessageType() {
		return _motCuaNotification.getMessageType();
	}

	/**
	* Sets the message type of this mot cua notification.
	*
	* @param messageType the message type of this mot cua notification
	*/
	@Override
	public void setMessageType(long messageType) {
		_motCuaNotification.setMessageType(messageType);
	}

	/**
	* Returns the phieuxulyphu ID of this mot cua notification.
	*
	* @return the phieuxulyphu ID of this mot cua notification
	*/
	@Override
	public long getPhieuxulyphuId() {
		return _motCuaNotification.getPhieuxulyphuId();
	}

	/**
	* Sets the phieuxulyphu ID of this mot cua notification.
	*
	* @param phieuxulyphuId the phieuxulyphu ID of this mot cua notification
	*/
	@Override
	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_motCuaNotification.setPhieuxulyphuId(phieuxulyphuId);
	}

	/**
	* Returns the response of this mot cua notification.
	*
	* @return the response of this mot cua notification
	*/
	@Override
	public java.lang.String getResponse() {
		return _motCuaNotification.getResponse();
	}

	/**
	* Sets the response of this mot cua notification.
	*
	* @param response the response of this mot cua notification
	*/
	@Override
	public void setResponse(java.lang.String response) {
		_motCuaNotification.setResponse(response);
	}

	/**
	* Returns the response time of this mot cua notification.
	*
	* @return the response time of this mot cua notification
	*/
	@Override
	public java.util.Date getResponseTime() {
		return _motCuaNotification.getResponseTime();
	}

	/**
	* Sets the response time of this mot cua notification.
	*
	* @param responseTime the response time of this mot cua notification
	*/
	@Override
	public void setResponseTime(java.util.Date responseTime) {
		_motCuaNotification.setResponseTime(responseTime);
	}

	/**
	* Returns the request content of this mot cua notification.
	*
	* @return the request content of this mot cua notification
	*/
	@Override
	public java.lang.String getRequestContent() {
		return _motCuaNotification.getRequestContent();
	}

	/**
	* Sets the request content of this mot cua notification.
	*
	* @param requestContent the request content of this mot cua notification
	*/
	@Override
	public void setRequestContent(java.lang.String requestContent) {
		_motCuaNotification.setRequestContent(requestContent);
	}

	/**
	* Returns the request time of this mot cua notification.
	*
	* @return the request time of this mot cua notification
	*/
	@Override
	public java.util.Date getRequestTime() {
		return _motCuaNotification.getRequestTime();
	}

	/**
	* Sets the request time of this mot cua notification.
	*
	* @param requestTime the request time of this mot cua notification
	*/
	@Override
	public void setRequestTime(java.util.Date requestTime) {
		_motCuaNotification.setRequestTime(requestTime);
	}

	/**
	* Returns the request sender of this mot cua notification.
	*
	* @return the request sender of this mot cua notification
	*/
	@Override
	public java.lang.String getRequestSender() {
		return _motCuaNotification.getRequestSender();
	}

	/**
	* Sets the request sender of this mot cua notification.
	*
	* @param requestSender the request sender of this mot cua notification
	*/
	@Override
	public void setRequestSender(java.lang.String requestSender) {
		_motCuaNotification.setRequestSender(requestSender);
	}

	/**
	* Returns the is reply of this mot cua notification.
	*
	* @return the is reply of this mot cua notification
	*/
	@Override
	public long getIsReply() {
		return _motCuaNotification.getIsReply();
	}

	/**
	* Sets the is reply of this mot cua notification.
	*
	* @param isReply the is reply of this mot cua notification
	*/
	@Override
	public void setIsReply(long isReply) {
		_motCuaNotification.setIsReply(isReply);
	}

	@Override
	public boolean isNew() {
		return _motCuaNotification.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_motCuaNotification.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _motCuaNotification.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_motCuaNotification.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _motCuaNotification.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _motCuaNotification.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_motCuaNotification.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _motCuaNotification.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_motCuaNotification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_motCuaNotification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_motCuaNotification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MotCuaNotificationWrapper((MotCuaNotification)_motCuaNotification.clone());
	}

	@Override
	public int compareTo(MotCuaNotification motCuaNotification) {
		return _motCuaNotification.compareTo(motCuaNotification);
	}

	@Override
	public int hashCode() {
		return _motCuaNotification.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<MotCuaNotification> toCacheModel() {
		return _motCuaNotification.toCacheModel();
	}

	@Override
	public MotCuaNotification toEscapedModel() {
		return new MotCuaNotificationWrapper(_motCuaNotification.toEscapedModel());
	}

	@Override
	public MotCuaNotification toUnescapedModel() {
		return new MotCuaNotificationWrapper(_motCuaNotification.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _motCuaNotification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _motCuaNotification.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_motCuaNotification.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaNotificationWrapper)) {
			return false;
		}

		MotCuaNotificationWrapper motCuaNotificationWrapper = (MotCuaNotificationWrapper)obj;

		if (Validator.equals(_motCuaNotification,
					motCuaNotificationWrapper._motCuaNotification)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MotCuaNotification getWrappedMotCuaNotification() {
		return _motCuaNotification;
	}

	@Override
	public MotCuaNotification getWrappedModel() {
		return _motCuaNotification;
	}

	@Override
	public void resetOriginalValues() {
		_motCuaNotification.resetOriginalValues();
	}

	private MotCuaNotification _motCuaNotification;
}