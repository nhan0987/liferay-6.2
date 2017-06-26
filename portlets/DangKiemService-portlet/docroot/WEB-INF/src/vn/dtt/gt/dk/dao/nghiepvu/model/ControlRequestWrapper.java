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
 * This class is a wrapper for {@link ControlRequest}.
 * </p>
 *
 * @author huymq
 * @see ControlRequest
 * @generated
 */
public class ControlRequestWrapper implements ControlRequest,
	ModelWrapper<ControlRequest> {
	public ControlRequestWrapper(ControlRequest controlRequest) {
		_controlRequest = controlRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return ControlRequest.class;
	}

	@Override
	public String getModelClassName() {
		return ControlRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("requestNumber", getRequestNumber());
		attributes.put("corporationName", getCorporationName());
		attributes.put("controlContent", getControlContent());
		attributes.put("controlDeadLine", getControlDeadLine());
		attributes.put("remarks", getRemarks());
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

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		String controlContent = (String)attributes.get("controlContent");

		if (controlContent != null) {
			setControlContent(controlContent);
		}

		Date controlDeadLine = (Date)attributes.get("controlDeadLine");

		if (controlDeadLine != null) {
			setControlDeadLine(controlDeadLine);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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
	* Returns the primary key of this control request.
	*
	* @return the primary key of this control request
	*/
	@Override
	public long getPrimaryKey() {
		return _controlRequest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this control request.
	*
	* @param primaryKey the primary key of this control request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_controlRequest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this control request.
	*
	* @return the ID of this control request
	*/
	@Override
	public long getId() {
		return _controlRequest.getId();
	}

	/**
	* Sets the ID of this control request.
	*
	* @param id the ID of this control request
	*/
	@Override
	public void setId(long id) {
		_controlRequest.setId(id);
	}

	/**
	* Returns the confirmed inspection ID of this control request.
	*
	* @return the confirmed inspection ID of this control request
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _controlRequest.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this control request.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this control request
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_controlRequest.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the request number of this control request.
	*
	* @return the request number of this control request
	*/
	@Override
	public java.lang.String getRequestNumber() {
		return _controlRequest.getRequestNumber();
	}

	/**
	* Sets the request number of this control request.
	*
	* @param requestNumber the request number of this control request
	*/
	@Override
	public void setRequestNumber(java.lang.String requestNumber) {
		_controlRequest.setRequestNumber(requestNumber);
	}

	/**
	* Returns the corporation name of this control request.
	*
	* @return the corporation name of this control request
	*/
	@Override
	public java.lang.String getCorporationName() {
		return _controlRequest.getCorporationName();
	}

	/**
	* Sets the corporation name of this control request.
	*
	* @param corporationName the corporation name of this control request
	*/
	@Override
	public void setCorporationName(java.lang.String corporationName) {
		_controlRequest.setCorporationName(corporationName);
	}

	/**
	* Returns the control content of this control request.
	*
	* @return the control content of this control request
	*/
	@Override
	public java.lang.String getControlContent() {
		return _controlRequest.getControlContent();
	}

	/**
	* Sets the control content of this control request.
	*
	* @param controlContent the control content of this control request
	*/
	@Override
	public void setControlContent(java.lang.String controlContent) {
		_controlRequest.setControlContent(controlContent);
	}

	/**
	* Returns the control dead line of this control request.
	*
	* @return the control dead line of this control request
	*/
	@Override
	public java.util.Date getControlDeadLine() {
		return _controlRequest.getControlDeadLine();
	}

	/**
	* Sets the control dead line of this control request.
	*
	* @param controlDeadLine the control dead line of this control request
	*/
	@Override
	public void setControlDeadLine(java.util.Date controlDeadLine) {
		_controlRequest.setControlDeadLine(controlDeadLine);
	}

	/**
	* Returns the remarks of this control request.
	*
	* @return the remarks of this control request
	*/
	@Override
	public java.lang.String getRemarks() {
		return _controlRequest.getRemarks();
	}

	/**
	* Sets the remarks of this control request.
	*
	* @param remarks the remarks of this control request
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_controlRequest.setRemarks(remarks);
	}

	/**
	* Returns the attached file of this control request.
	*
	* @return the attached file of this control request
	*/
	@Override
	public long getAttachedFile() {
		return _controlRequest.getAttachedFile();
	}

	/**
	* Sets the attached file of this control request.
	*
	* @param attachedFile the attached file of this control request
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_controlRequest.setAttachedFile(attachedFile);
	}

	/**
	* Returns the sign name of this control request.
	*
	* @return the sign name of this control request
	*/
	@Override
	public java.lang.String getSignName() {
		return _controlRequest.getSignName();
	}

	/**
	* Sets the sign name of this control request.
	*
	* @param signName the sign name of this control request
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_controlRequest.setSignName(signName);
	}

	/**
	* Returns the sign title of this control request.
	*
	* @return the sign title of this control request
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _controlRequest.getSignTitle();
	}

	/**
	* Sets the sign title of this control request.
	*
	* @param signTitle the sign title of this control request
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_controlRequest.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this control request.
	*
	* @return the sign place of this control request
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _controlRequest.getSignPlace();
	}

	/**
	* Sets the sign place of this control request.
	*
	* @param signPlace the sign place of this control request
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_controlRequest.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this control request.
	*
	* @return the sign date of this control request
	*/
	@Override
	public java.util.Date getSignDate() {
		return _controlRequest.getSignDate();
	}

	/**
	* Sets the sign date of this control request.
	*
	* @param signDate the sign date of this control request
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_controlRequest.setSignDate(signDate);
	}

	@Override
	public boolean isNew() {
		return _controlRequest.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_controlRequest.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _controlRequest.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_controlRequest.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _controlRequest.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _controlRequest.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_controlRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _controlRequest.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_controlRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_controlRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_controlRequest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ControlRequestWrapper((ControlRequest)_controlRequest.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest controlRequest) {
		return _controlRequest.compareTo(controlRequest);
	}

	@Override
	public int hashCode() {
		return _controlRequest.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest> toCacheModel() {
		return _controlRequest.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest toEscapedModel() {
		return new ControlRequestWrapper(_controlRequest.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest toUnescapedModel() {
		return new ControlRequestWrapper(_controlRequest.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _controlRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _controlRequest.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_controlRequest.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ControlRequestWrapper)) {
			return false;
		}

		ControlRequestWrapper controlRequestWrapper = (ControlRequestWrapper)obj;

		if (Validator.equals(_controlRequest,
					controlRequestWrapper._controlRequest)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ControlRequest getWrappedControlRequest() {
		return _controlRequest;
	}

	@Override
	public ControlRequest getWrappedModel() {
		return _controlRequest;
	}

	@Override
	public void resetOriginalValues() {
		_controlRequest.resetOriginalValues();
	}

	private ControlRequest _controlRequest;
}