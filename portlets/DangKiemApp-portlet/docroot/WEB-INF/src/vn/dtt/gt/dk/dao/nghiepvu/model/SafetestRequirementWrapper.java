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
 * This class is a wrapper for {@link SafetestRequirement}.
 * </p>
 *
 * @author win_64
 * @see SafetestRequirement
 * @generated
 */
public class SafetestRequirementWrapper implements SafetestRequirement,
	ModelWrapper<SafetestRequirement> {
	public SafetestRequirementWrapper(SafetestRequirement safetestRequirement) {
		_safetestRequirement = safetestRequirement;
	}

	@Override
	public Class<?> getModelClass() {
		return SafetestRequirement.class;
	}

	@Override
	public String getModelClassName() {
		return SafetestRequirement.class.getName();
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
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());

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

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}
	}

	/**
	* Returns the primary key of this safetest requirement.
	*
	* @return the primary key of this safetest requirement
	*/
	@Override
	public long getPrimaryKey() {
		return _safetestRequirement.getPrimaryKey();
	}

	/**
	* Sets the primary key of this safetest requirement.
	*
	* @param primaryKey the primary key of this safetest requirement
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_safetestRequirement.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this safetest requirement.
	*
	* @return the ID of this safetest requirement
	*/
	@Override
	public long getId() {
		return _safetestRequirement.getId();
	}

	/**
	* Sets the ID of this safetest requirement.
	*
	* @param id the ID of this safetest requirement
	*/
	@Override
	public void setId(long id) {
		_safetestRequirement.setId(id);
	}

	/**
	* Returns the registered inspection ID of this safetest requirement.
	*
	* @return the registered inspection ID of this safetest requirement
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _safetestRequirement.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this safetest requirement.
	*
	* @param registeredInspectionId the registered inspection ID of this safetest requirement
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_safetestRequirement.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the inspection record ID of this safetest requirement.
	*
	* @return the inspection record ID of this safetest requirement
	*/
	@Override
	public long getInspectionRecordId() {
		return _safetestRequirement.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this safetest requirement.
	*
	* @param inspectionRecordId the inspection record ID of this safetest requirement
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_safetestRequirement.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the requirement number of this safetest requirement.
	*
	* @return the requirement number of this safetest requirement
	*/
	@Override
	public java.lang.String getRequirementNumber() {
		return _safetestRequirement.getRequirementNumber();
	}

	/**
	* Sets the requirement number of this safetest requirement.
	*
	* @param requirementNumber the requirement number of this safetest requirement
	*/
	@Override
	public void setRequirementNumber(java.lang.String requirementNumber) {
		_safetestRequirement.setRequirementNumber(requirementNumber);
	}

	/**
	* Returns the content of request of this safetest requirement.
	*
	* @return the content of request of this safetest requirement
	*/
	@Override
	public java.lang.String getContentOfRequest() {
		return _safetestRequirement.getContentOfRequest();
	}

	/**
	* Sets the content of request of this safetest requirement.
	*
	* @param contentOfRequest the content of request of this safetest requirement
	*/
	@Override
	public void setContentOfRequest(java.lang.String contentOfRequest) {
		_safetestRequirement.setContentOfRequest(contentOfRequest);
	}

	/**
	* Returns the testing registered place of this safetest requirement.
	*
	* @return the testing registered place of this safetest requirement
	*/
	@Override
	public java.lang.String getTestingRegisteredPlace() {
		return _safetestRequirement.getTestingRegisteredPlace();
	}

	/**
	* Sets the testing registered place of this safetest requirement.
	*
	* @param testingRegisteredPlace the testing registered place of this safetest requirement
	*/
	@Override
	public void setTestingRegisteredPlace(
		java.lang.String testingRegisteredPlace) {
		_safetestRequirement.setTestingRegisteredPlace(testingRegisteredPlace);
	}

	/**
	* Returns the testing registration of this safetest requirement.
	*
	* @return the testing registration of this safetest requirement
	*/
	@Override
	public java.lang.String getTestingRegistration() {
		return _safetestRequirement.getTestingRegistration();
	}

	/**
	* Sets the testing registration of this safetest requirement.
	*
	* @param testingRegistration the testing registration of this safetest requirement
	*/
	@Override
	public void setTestingRegistration(java.lang.String testingRegistration) {
		_safetestRequirement.setTestingRegistration(testingRegistration);
	}

	/**
	* Returns the testing payment condition of this safetest requirement.
	*
	* @return the testing payment condition of this safetest requirement
	*/
	@Override
	public java.lang.String getTestingPaymentCondition() {
		return _safetestRequirement.getTestingPaymentCondition();
	}

	/**
	* Sets the testing payment condition of this safetest requirement.
	*
	* @param testingPaymentCondition the testing payment condition of this safetest requirement
	*/
	@Override
	public void setTestingPaymentCondition(
		java.lang.String testingPaymentCondition) {
		_safetestRequirement.setTestingPaymentCondition(testingPaymentCondition);
	}

	/**
	* Returns the remarks of this safetest requirement.
	*
	* @return the remarks of this safetest requirement
	*/
	@Override
	public java.lang.String getRemarks() {
		return _safetestRequirement.getRemarks();
	}

	/**
	* Sets the remarks of this safetest requirement.
	*
	* @param remarks the remarks of this safetest requirement
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_safetestRequirement.setRemarks(remarks);
	}

	/**
	* Returns the corporation ID of this safetest requirement.
	*
	* @return the corporation ID of this safetest requirement
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _safetestRequirement.getCorporationId();
	}

	/**
	* Sets the corporation ID of this safetest requirement.
	*
	* @param corporationId the corporation ID of this safetest requirement
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_safetestRequirement.setCorporationId(corporationId);
	}

	/**
	* Returns the attached file of this safetest requirement.
	*
	* @return the attached file of this safetest requirement
	*/
	@Override
	public long getAttachedFile() {
		return _safetestRequirement.getAttachedFile();
	}

	/**
	* Sets the attached file of this safetest requirement.
	*
	* @param attachedFile the attached file of this safetest requirement
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_safetestRequirement.setAttachedFile(attachedFile);
	}

	/**
	* Returns the sign name of this safetest requirement.
	*
	* @return the sign name of this safetest requirement
	*/
	@Override
	public java.lang.String getSignName() {
		return _safetestRequirement.getSignName();
	}

	/**
	* Sets the sign name of this safetest requirement.
	*
	* @param signName the sign name of this safetest requirement
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_safetestRequirement.setSignName(signName);
	}

	/**
	* Returns the sign title of this safetest requirement.
	*
	* @return the sign title of this safetest requirement
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _safetestRequirement.getSignTitle();
	}

	/**
	* Sets the sign title of this safetest requirement.
	*
	* @param signTitle the sign title of this safetest requirement
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_safetestRequirement.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this safetest requirement.
	*
	* @return the sign place of this safetest requirement
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _safetestRequirement.getSignPlace();
	}

	/**
	* Sets the sign place of this safetest requirement.
	*
	* @param signPlace the sign place of this safetest requirement
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_safetestRequirement.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this safetest requirement.
	*
	* @return the sign date of this safetest requirement
	*/
	@Override
	public java.util.Date getSignDate() {
		return _safetestRequirement.getSignDate();
	}

	/**
	* Sets the sign date of this safetest requirement.
	*
	* @param signDate the sign date of this safetest requirement
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_safetestRequirement.setSignDate(signDate);
	}

	/**
	* Returns the phieu xu ly phu ID of this safetest requirement.
	*
	* @return the phieu xu ly phu ID of this safetest requirement
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _safetestRequirement.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this safetest requirement.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this safetest requirement
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_safetestRequirement.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	@Override
	public boolean isNew() {
		return _safetestRequirement.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_safetestRequirement.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _safetestRequirement.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_safetestRequirement.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _safetestRequirement.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _safetestRequirement.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_safetestRequirement.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _safetestRequirement.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_safetestRequirement.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_safetestRequirement.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_safetestRequirement.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SafetestRequirementWrapper((SafetestRequirement)_safetestRequirement.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement safetestRequirement) {
		return _safetestRequirement.compareTo(safetestRequirement);
	}

	@Override
	public int hashCode() {
		return _safetestRequirement.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement> toCacheModel() {
		return _safetestRequirement.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement toEscapedModel() {
		return new SafetestRequirementWrapper(_safetestRequirement.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement toUnescapedModel() {
		return new SafetestRequirementWrapper(_safetestRequirement.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _safetestRequirement.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _safetestRequirement.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_safetestRequirement.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SafetestRequirementWrapper)) {
			return false;
		}

		SafetestRequirementWrapper safetestRequirementWrapper = (SafetestRequirementWrapper)obj;

		if (Validator.equals(_safetestRequirement,
					safetestRequirementWrapper._safetestRequirement)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SafetestRequirement getWrappedSafetestRequirement() {
		return _safetestRequirement;
	}

	@Override
	public SafetestRequirement getWrappedModel() {
		return _safetestRequirement;
	}

	@Override
	public void resetOriginalValues() {
		_safetestRequirement.resetOriginalValues();
	}

	private SafetestRequirement _safetestRequirement;
}