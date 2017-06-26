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
 * This class is a wrapper for {@link EmissionTestRequest}.
 * </p>
 *
 * @author huymq
 * @see EmissionTestRequest
 * @generated
 */
public class EmissionTestRequestWrapper implements EmissionTestRequest,
	ModelWrapper<EmissionTestRequest> {
	public EmissionTestRequestWrapper(EmissionTestRequest emissionTestRequest) {
		_emissionTestRequest = emissionTestRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return EmissionTestRequest.class;
	}

	@Override
	public String getModelClassName() {
		return EmissionTestRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("requestNumber", getRequestNumber());
		attributes.put("testTimeAndPlace", getTestTimeAndPlace());
		attributes.put("testPayment", getTestPayment());
		attributes.put("remarks", getRemarks());
		attributes.put("corporationName", getCorporationName());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("synchdate", getSynchdate());

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

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this emission test request.
	*
	* @return the primary key of this emission test request
	*/
	@Override
	public long getPrimaryKey() {
		return _emissionTestRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this emission test request.
	*
	* @param primaryKey the primary key of this emission test request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_emissionTestRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this emission test request.
	*
	* @return the ID of this emission test request
	*/
	@Override
	public long getId() {
		return _emissionTestRequest.getId();
	}

	/**
	* Sets the ID of this emission test request.
	*
	* @param id the ID of this emission test request
	*/
	@Override
	public void setId(long id) {
		_emissionTestRequest.setId(id);
	}

	/**
	* Returns the confirmed inspection ID of this emission test request.
	*
	* @return the confirmed inspection ID of this emission test request
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _emissionTestRequest.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this emission test request.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this emission test request
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_emissionTestRequest.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the request number of this emission test request.
	*
	* @return the request number of this emission test request
	*/
	@Override
	public java.lang.String getRequestNumber() {
		return _emissionTestRequest.getRequestNumber();
	}

	/**
	* Sets the request number of this emission test request.
	*
	* @param requestNumber the request number of this emission test request
	*/
	@Override
	public void setRequestNumber(java.lang.String requestNumber) {
		_emissionTestRequest.setRequestNumber(requestNumber);
	}

	/**
	* Returns the test time and place of this emission test request.
	*
	* @return the test time and place of this emission test request
	*/
	@Override
	public java.lang.String getTestTimeAndPlace() {
		return _emissionTestRequest.getTestTimeAndPlace();
	}

	/**
	* Sets the test time and place of this emission test request.
	*
	* @param testTimeAndPlace the test time and place of this emission test request
	*/
	@Override
	public void setTestTimeAndPlace(java.lang.String testTimeAndPlace) {
		_emissionTestRequest.setTestTimeAndPlace(testTimeAndPlace);
	}

	/**
	* Returns the test payment of this emission test request.
	*
	* @return the test payment of this emission test request
	*/
	@Override
	public java.lang.String getTestPayment() {
		return _emissionTestRequest.getTestPayment();
	}

	/**
	* Sets the test payment of this emission test request.
	*
	* @param testPayment the test payment of this emission test request
	*/
	@Override
	public void setTestPayment(java.lang.String testPayment) {
		_emissionTestRequest.setTestPayment(testPayment);
	}

	/**
	* Returns the remarks of this emission test request.
	*
	* @return the remarks of this emission test request
	*/
	@Override
	public java.lang.String getRemarks() {
		return _emissionTestRequest.getRemarks();
	}

	/**
	* Sets the remarks of this emission test request.
	*
	* @param remarks the remarks of this emission test request
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_emissionTestRequest.setRemarks(remarks);
	}

	/**
	* Returns the corporation name of this emission test request.
	*
	* @return the corporation name of this emission test request
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _emissionTestRequest.getCorporationName();
	}

	/**
	* Sets the corporation name of this emission test request.
	*
	* @param corporationName the corporation name of this emission test request
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_emissionTestRequest.setCorporationName(corporationName);
	}

	/**
	* Returns the attached file of this emission test request.
	*
	* @return the attached file of this emission test request
	*/
	@Override
	public long getAttachedFile() {
		return _emissionTestRequest.getAttachedFile();
	}

	/**
	* Sets the attached file of this emission test request.
	*
	* @param attachedFile the attached file of this emission test request
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_emissionTestRequest.setAttachedFile(attachedFile);
	}

	/**
	* Returns the sign name of this emission test request.
	*
	* @return the sign name of this emission test request
	*/
	@Override
	public java.lang.String getSignName() {
		return _emissionTestRequest.getSignName();
	}

	/**
	* Sets the sign name of this emission test request.
	*
	* @param signName the sign name of this emission test request
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_emissionTestRequest.setSignName(signName);
	}

	/**
	* Returns the sign title of this emission test request.
	*
	* @return the sign title of this emission test request
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _emissionTestRequest.getSignTitle();
	}

	/**
	* Sets the sign title of this emission test request.
	*
	* @param signTitle the sign title of this emission test request
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_emissionTestRequest.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this emission test request.
	*
	* @return the sign place of this emission test request
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _emissionTestRequest.getSignPlace();
	}

	/**
	* Sets the sign place of this emission test request.
	*
	* @param signPlace the sign place of this emission test request
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_emissionTestRequest.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this emission test request.
	*
	* @return the sign date of this emission test request
	*/
	@Override
	public java.util.Date getSignDate() {
		return _emissionTestRequest.getSignDate();
	}

	/**
	* Sets the sign date of this emission test request.
	*
	* @param signDate the sign date of this emission test request
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_emissionTestRequest.setSignDate(signDate);
	}

	/**
	* Returns the synchdate of this emission test request.
	*
	* @return the synchdate of this emission test request
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _emissionTestRequest.getSynchdate();
	}

	/**
	* Sets the synchdate of this emission test request.
	*
	* @param synchdate the synchdate of this emission test request
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_emissionTestRequest.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _emissionTestRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_emissionTestRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _emissionTestRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_emissionTestRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _emissionTestRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _emissionTestRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_emissionTestRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _emissionTestRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_emissionTestRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_emissionTestRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_emissionTestRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmissionTestRequestWrapper((EmissionTestRequest)_emissionTestRequest.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest emissionTestRequest) {
		return _emissionTestRequest.compareTo(emissionTestRequest);
	}

	@Override
	public int hashCode() {
		return _emissionTestRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest> toCacheModel() {
		return _emissionTestRequest.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest toEscapedModel() {
		return new EmissionTestRequestWrapper(_emissionTestRequest.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest toUnescapedModel() {
		return new EmissionTestRequestWrapper(_emissionTestRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _emissionTestRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _emissionTestRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_emissionTestRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmissionTestRequestWrapper)) {
			return false;
		}

		EmissionTestRequestWrapper emissionTestRequestWrapper = (EmissionTestRequestWrapper)obj;

		if (Validator.equals(_emissionTestRequest,
					emissionTestRequestWrapper._emissionTestRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmissionTestRequest getWrappedEmissionTestRequest() {
		return _emissionTestRequest;
	}

	@Override
	public EmissionTestRequest getWrappedModel() {
		return _emissionTestRequest;
	}

	@Override
	public void resetOriginalValues() {
		_emissionTestRequest.resetOriginalValues();
	}

	private EmissionTestRequest _emissionTestRequest;
}