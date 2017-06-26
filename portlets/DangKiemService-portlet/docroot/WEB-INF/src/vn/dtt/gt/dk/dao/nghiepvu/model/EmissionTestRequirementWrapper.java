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
 * This class is a wrapper for {@link EmissionTestRequirement}.
 * </p>
 *
 * @author huymq
 * @see EmissionTestRequirement
 * @generated
 */
public class EmissionTestRequirementWrapper implements EmissionTestRequirement,
	ModelWrapper<EmissionTestRequirement> {
	public EmissionTestRequirementWrapper(
		EmissionTestRequirement emissionTestRequirement) {
		_emissionTestRequirement = emissionTestRequirement;
	}

	@Override
	public Class<?> getModelClass() {
		return EmissionTestRequirement.class;
	}

	@Override
	public String getModelClassName() {
		return EmissionTestRequirement.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("contentOfRequest", getContentOfRequest());
		attributes.put("testingRegisteredPlace", getTestingRegisteredPlace());
		attributes.put("testingRegistration", getTestingRegistration());
		attributes.put("testingPaymentCondition", getTestingPaymentCondition());
		attributes.put("remarks", getRemarks());
		attributes.put("corporationId", getCorporationId());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("attachedFile", getAttachedFile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		String contentOfRequest = (String)attributes.get("contentOfRequest");

		if (contentOfRequest != null) {
			setContentOfRequest(contentOfRequest);
		}

		String testingRegisteredPlace = (String)attributes.get(
				"testingRegisteredPlace");

		if (testingRegisteredPlace != null) {
			setTestingRegisteredPlace(testingRegisteredPlace);
		}

		String testingRegistration = (String)attributes.get(
				"testingRegistration");

		if (testingRegistration != null) {
			setTestingRegistration(testingRegistration);
		}

		String testingPaymentCondition = (String)attributes.get(
				"testingPaymentCondition");

		if (testingPaymentCondition != null) {
			setTestingPaymentCondition(testingPaymentCondition);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
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

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	/**
	* Returns the primary key of this emission test requirement.
	*
	* @return the primary key of this emission test requirement
	*/
	@Override
	public long getPrimaryKey() {
		return _emissionTestRequirement.getPrimaryKey();
	}

	/**
	* Sets the primary key of this emission test requirement.
	*
	* @param primaryKey the primary key of this emission test requirement
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_emissionTestRequirement.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this emission test requirement.
	*
	* @return the ID of this emission test requirement
	*/
	@Override
	public long getId() {
		return _emissionTestRequirement.getId();
	}

	/**
	* Sets the ID of this emission test requirement.
	*
	* @param id the ID of this emission test requirement
	*/
	@Override
	public void setId(long id) {
		_emissionTestRequirement.setId(id);
	}

	/**
	* Returns the registered inspection ID of this emission test requirement.
	*
	* @return the registered inspection ID of this emission test requirement
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _emissionTestRequirement.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this emission test requirement.
	*
	* @param registeredInspectionId the registered inspection ID of this emission test requirement
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_emissionTestRequirement.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the inspection record ID of this emission test requirement.
	*
	* @return the inspection record ID of this emission test requirement
	*/
	@Override
	public long getInspectionRecordId() {
		return _emissionTestRequirement.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this emission test requirement.
	*
	* @param inspectionRecordId the inspection record ID of this emission test requirement
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_emissionTestRequirement.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the requirement number of this emission test requirement.
	*
	* @return the requirement number of this emission test requirement
	*/
	@Override
	public java.lang.String getRequirementNumber() {
		return _emissionTestRequirement.getRequirementNumber();
	}

	/**
	* Sets the requirement number of this emission test requirement.
	*
	* @param requirementNumber the requirement number of this emission test requirement
	*/
	@Override
	public void setRequirementNumber(java.lang.String requirementNumber) {
		_emissionTestRequirement.setRequirementNumber(requirementNumber);
	}

	/**
	* Returns the content of request of this emission test requirement.
	*
	* @return the content of request of this emission test requirement
	*/
	@Override
	public java.lang.String getContentOfRequest() {
		return _emissionTestRequirement.getContentOfRequest();
	}

	/**
	* Sets the content of request of this emission test requirement.
	*
	* @param contentOfRequest the content of request of this emission test requirement
	*/
	@Override
	public void setContentOfRequest(java.lang.String contentOfRequest) {
		_emissionTestRequirement.setContentOfRequest(contentOfRequest);
	}

	/**
	* Returns the testing registered place of this emission test requirement.
	*
	* @return the testing registered place of this emission test requirement
	*/
	@Override
	public java.lang.String getTestingRegisteredPlace() {
		return _emissionTestRequirement.getTestingRegisteredPlace();
	}

	/**
	* Sets the testing registered place of this emission test requirement.
	*
	* @param testingRegisteredPlace the testing registered place of this emission test requirement
	*/
	@Override
	public void setTestingRegisteredPlace(
		java.lang.String testingRegisteredPlace) {
		_emissionTestRequirement.setTestingRegisteredPlace(testingRegisteredPlace);
	}

	/**
	* Returns the testing registration of this emission test requirement.
	*
	* @return the testing registration of this emission test requirement
	*/
	@Override
	public java.lang.String getTestingRegistration() {
		return _emissionTestRequirement.getTestingRegistration();
	}

	/**
	* Sets the testing registration of this emission test requirement.
	*
	* @param testingRegistration the testing registration of this emission test requirement
	*/
	@Override
	public void setTestingRegistration(java.lang.String testingRegistration) {
		_emissionTestRequirement.setTestingRegistration(testingRegistration);
	}

	/**
	* Returns the testing payment condition of this emission test requirement.
	*
	* @return the testing payment condition of this emission test requirement
	*/
	@Override
	public java.lang.String getTestingPaymentCondition() {
		return _emissionTestRequirement.getTestingPaymentCondition();
	}

	/**
	* Sets the testing payment condition of this emission test requirement.
	*
	* @param testingPaymentCondition the testing payment condition of this emission test requirement
	*/
	@Override
	public void setTestingPaymentCondition(
		java.lang.String testingPaymentCondition) {
		_emissionTestRequirement.setTestingPaymentCondition(testingPaymentCondition);
	}

	/**
	* Returns the remarks of this emission test requirement.
	*
	* @return the remarks of this emission test requirement
	*/
	@Override
	public java.lang.String getRemarks() {
		return _emissionTestRequirement.getRemarks();
	}

	/**
	* Sets the remarks of this emission test requirement.
	*
	* @param remarks the remarks of this emission test requirement
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_emissionTestRequirement.setRemarks(remarks);
	}

	/**
	* Returns the corporation ID of this emission test requirement.
	*
	* @return the corporation ID of this emission test requirement
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _emissionTestRequirement.getCorporationId();
	}

	/**
	* Sets the corporation ID of this emission test requirement.
	*
	* @param corporationId the corporation ID of this emission test requirement
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_emissionTestRequirement.setCorporationId(corporationId);
	}

	/**
	* Returns the sign name of this emission test requirement.
	*
	* @return the sign name of this emission test requirement
	*/
	@Override
	public java.lang.String getSignName() {
		return _emissionTestRequirement.getSignName();
	}

	/**
	* Sets the sign name of this emission test requirement.
	*
	* @param signName the sign name of this emission test requirement
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_emissionTestRequirement.setSignName(signName);
	}

	/**
	* Returns the sign title of this emission test requirement.
	*
	* @return the sign title of this emission test requirement
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _emissionTestRequirement.getSignTitle();
	}

	/**
	* Sets the sign title of this emission test requirement.
	*
	* @param signTitle the sign title of this emission test requirement
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_emissionTestRequirement.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this emission test requirement.
	*
	* @return the sign place of this emission test requirement
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _emissionTestRequirement.getSignPlace();
	}

	/**
	* Sets the sign place of this emission test requirement.
	*
	* @param signPlace the sign place of this emission test requirement
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_emissionTestRequirement.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this emission test requirement.
	*
	* @return the sign date of this emission test requirement
	*/
	@Override
	public java.util.Date getSignDate() {
		return _emissionTestRequirement.getSignDate();
	}

	/**
	* Sets the sign date of this emission test requirement.
	*
	* @param signDate the sign date of this emission test requirement
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_emissionTestRequirement.setSignDate(signDate);
	}

	/**
	* Returns the phieu xu ly phu ID of this emission test requirement.
	*
	* @return the phieu xu ly phu ID of this emission test requirement
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _emissionTestRequirement.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this emission test requirement.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this emission test requirement
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_emissionTestRequirement.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the attached file of this emission test requirement.
	*
	* @return the attached file of this emission test requirement
	*/
	@Override
	public long getAttachedFile() {
		return _emissionTestRequirement.getAttachedFile();
	}

	/**
	* Sets the attached file of this emission test requirement.
	*
	* @param attachedFile the attached file of this emission test requirement
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_emissionTestRequirement.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _emissionTestRequirement.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_emissionTestRequirement.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _emissionTestRequirement.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_emissionTestRequirement.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _emissionTestRequirement.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _emissionTestRequirement.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_emissionTestRequirement.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _emissionTestRequirement.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_emissionTestRequirement.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_emissionTestRequirement.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_emissionTestRequirement.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmissionTestRequirementWrapper((EmissionTestRequirement)_emissionTestRequirement.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement emissionTestRequirement) {
		return _emissionTestRequirement.compareTo(emissionTestRequirement);
	}

	@Override
	public int hashCode() {
		return _emissionTestRequirement.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> toCacheModel() {
		return _emissionTestRequirement.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement toEscapedModel() {
		return new EmissionTestRequirementWrapper(_emissionTestRequirement.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement toUnescapedModel() {
		return new EmissionTestRequirementWrapper(_emissionTestRequirement.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _emissionTestRequirement.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _emissionTestRequirement.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_emissionTestRequirement.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmissionTestRequirementWrapper)) {
			return false;
		}

		EmissionTestRequirementWrapper emissionTestRequirementWrapper = (EmissionTestRequirementWrapper)obj;

		if (Validator.equals(_emissionTestRequirement,
					emissionTestRequirementWrapper._emissionTestRequirement)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmissionTestRequirement getWrappedEmissionTestRequirement() {
		return _emissionTestRequirement;
	}

	@Override
	public EmissionTestRequirement getWrappedModel() {
		return _emissionTestRequirement;
	}

	@Override
	public void resetOriginalValues() {
		_emissionTestRequirement.resetOriginalValues();
	}

	private EmissionTestRequirement _emissionTestRequirement;
}