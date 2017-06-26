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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SafetyTestRequest}.
 * </p>
 *
 * @author win_64
 * @see SafetyTestRequest
 * @generated
 */
public class SafetyTestRequestWrapper implements SafetyTestRequest,
	ModelWrapper<SafetyTestRequest> {
	public SafetyTestRequestWrapper(SafetyTestRequest safetyTestRequest) {
		_safetyTestRequest = safetyTestRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return SafetyTestRequest.class;
	}

	@Override
	public String getModelClassName() {
		return SafetyTestRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("requestNumber", getRequestNumber());
		attributes.put("testContent", getTestContent());
		attributes.put("testTimeAndPlace", getTestTimeAndPlace());
		attributes.put("testPayment", getTestPayment());
		attributes.put("remarks", getRemarks());
		attributes.put("corporationName", getCorporationName());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		String requestNumber = (String)attributes.get("requestNumber");

		if (requestNumber != null) {
			setRequestNumber(requestNumber);
		}

		String testContent = (String)attributes.get("testContent");

		if (testContent != null) {
			setTestContent(testContent);
		}

		String testTimeAndPlace = (String)attributes.get("testTimeAndPlace");

		if (testTimeAndPlace != null) {
			setTestTimeAndPlace(testTimeAndPlace);
		}

		String testPayment = (String)attributes.get("testPayment");

		if (testPayment != null) {
			setTestPayment(testPayment);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}
	}

	/**
	* Returns the primary key of this safety test request.
	*
	* @return the primary key of this safety test request
	*/
	@Override
	public long getPrimaryKey() {
		return _safetyTestRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this safety test request.
	*
	* @param primaryKey the primary key of this safety test request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_safetyTestRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this safety test request.
	*
	* @return the ID of this safety test request
	*/
	@Override
	public long getId() {
		return _safetyTestRequest.getId();
	}

	/**
	* Sets the ID of this safety test request.
	*
	* @param id the ID of this safety test request
	*/
	@Override
	public void setId(long id) {
		_safetyTestRequest.setId(id);
	}

	/**
	* Returns the confirmed inspection ID of this safety test request.
	*
	* @return the confirmed inspection ID of this safety test request
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _safetyTestRequest.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this safety test request.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this safety test request
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_safetyTestRequest.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the request number of this safety test request.
	*
	* @return the request number of this safety test request
	*/
	@Override
	public java.lang.String getRequestNumber() {
		return _safetyTestRequest.getRequestNumber();
	}

	/**
	* Sets the request number of this safety test request.
	*
	* @param requestNumber the request number of this safety test request
	*/
	@Override
	public void setRequestNumber(java.lang.String requestNumber) {
		_safetyTestRequest.setRequestNumber(requestNumber);
	}

	/**
	* Returns the test content of this safety test request.
	*
	* @return the test content of this safety test request
	*/
	@Override
	public java.lang.String getTestContent() {
		return _safetyTestRequest.getTestContent();
	}

	/**
	* Sets the test content of this safety test request.
	*
	* @param testContent the test content of this safety test request
	*/
	@Override
	public void setTestContent(java.lang.String testContent) {
		_safetyTestRequest.setTestContent(testContent);
	}

	/**
	* Returns the test time and place of this safety test request.
	*
	* @return the test time and place of this safety test request
	*/
	@Override
	public java.lang.String getTestTimeAndPlace() {
		return _safetyTestRequest.getTestTimeAndPlace();
	}

	/**
	* Sets the test time and place of this safety test request.
	*
	* @param testTimeAndPlace the test time and place of this safety test request
	*/
	@Override
	public void setTestTimeAndPlace(java.lang.String testTimeAndPlace) {
		_safetyTestRequest.setTestTimeAndPlace(testTimeAndPlace);
	}

	/**
	* Returns the test payment of this safety test request.
	*
	* @return the test payment of this safety test request
	*/
	@Override
	public java.lang.String getTestPayment() {
		return _safetyTestRequest.getTestPayment();
	}

	/**
	* Sets the test payment of this safety test request.
	*
	* @param testPayment the test payment of this safety test request
	*/
	@Override
	public void setTestPayment(java.lang.String testPayment) {
		_safetyTestRequest.setTestPayment(testPayment);
	}

	/**
	* Returns the remarks of this safety test request.
	*
	* @return the remarks of this safety test request
	*/
	@Override
	public java.lang.String getRemarks() {
		return _safetyTestRequest.getRemarks();
	}

	/**
	* Sets the remarks of this safety test request.
	*
	* @param remarks the remarks of this safety test request
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_safetyTestRequest.setRemarks(remarks);
	}

	/**
	* Returns the corporation name of this safety test request.
	*
	* @return the corporation name of this safety test request
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _safetyTestRequest.getCorporationName();
	}

	/**
	* Sets the corporation name of this safety test request.
	*
	* @param corporationName the corporation name of this safety test request
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_safetyTestRequest.setCorporationName(corporationName);
	}

	/**
	* Returns the attached file of this safety test request.
	*
	* @return the attached file of this safety test request
	*/
	@Override
	public long getAttachedFile() {
		return _safetyTestRequest.getAttachedFile();
	}

	/**
	* Sets the attached file of this safety test request.
	*
	* @param attachedFile the attached file of this safety test request
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_safetyTestRequest.setAttachedFile(attachedFile);
	}

	/**
	* Returns the sign name of this safety test request.
	*
	* @return the sign name of this safety test request
	*/
	@Override
	public java.lang.String getSignName() {
		return _safetyTestRequest.getSignName();
	}

	/**
	* Sets the sign name of this safety test request.
	*
	* @param signName the sign name of this safety test request
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_safetyTestRequest.setSignName(signName);
	}

	/**
	* Returns the sign title of this safety test request.
	*
	* @return the sign title of this safety test request
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _safetyTestRequest.getSignTitle();
	}

	/**
	* Sets the sign title of this safety test request.
	*
	* @param signTitle the sign title of this safety test request
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_safetyTestRequest.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this safety test request.
	*
	* @return the sign place of this safety test request
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _safetyTestRequest.getSignPlace();
	}

	/**
	* Sets the sign place of this safety test request.
	*
	* @param signPlace the sign place of this safety test request
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_safetyTestRequest.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this safety test request.
	*
	* @return the sign date of this safety test request
	*/
	@Override
	public java.util.Date getSignDate() {
		return _safetyTestRequest.getSignDate();
	}

	/**
	* Sets the sign date of this safety test request.
	*
	* @param signDate the sign date of this safety test request
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_safetyTestRequest.setSignDate(signDate);
	}

	@Override
	public boolean isNew() {
		return _safetyTestRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_safetyTestRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _safetyTestRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_safetyTestRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _safetyTestRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _safetyTestRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_safetyTestRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _safetyTestRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_safetyTestRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_safetyTestRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_safetyTestRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SafetyTestRequestWrapper((SafetyTestRequest)_safetyTestRequest.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest safetyTestRequest) {
		return _safetyTestRequest.compareTo(safetyTestRequest);
	}

	@Override
	public int hashCode() {
		return _safetyTestRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest> toCacheModel() {
		return _safetyTestRequest.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest toEscapedModel() {
		return new SafetyTestRequestWrapper(_safetyTestRequest.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest toUnescapedModel() {
		return new SafetyTestRequestWrapper(_safetyTestRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _safetyTestRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _safetyTestRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_safetyTestRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SafetyTestRequestWrapper)) {
			return false;
		}

		SafetyTestRequestWrapper safetyTestRequestWrapper = (SafetyTestRequestWrapper)obj;

		if (Validator.equals(_safetyTestRequest,
					safetyTestRequestWrapper._safetyTestRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SafetyTestRequest getWrappedSafetyTestRequest() {
		return _safetyTestRequest;
	}

	@Override
	public SafetyTestRequest getWrappedModel() {
		return _safetyTestRequest;
	}

	@Override
	public void resetOriginalValues() {
		_safetyTestRequest.resetOriginalValues();
	}

	private SafetyTestRequest _safetyTestRequest;
}