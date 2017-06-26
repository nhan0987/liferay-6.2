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
 * This class is a wrapper for {@link SafetyTestReport}.
 * </p>
 *
 * @author win_64
 * @see SafetyTestReport
 * @generated
 */
public class SafetyTestReportWrapper implements SafetyTestReport,
	ModelWrapper<SafetyTestReport> {
	public SafetyTestReportWrapper(SafetyTestReport safetyTestReport) {
		_safetyTestReport = safetyTestReport;
	}

	@Override
	public Class<?> getModelClass() {
		return SafetyTestReport.class;
	}

	@Override
	public String getModelClassName() {
		return SafetyTestReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("inspectionrecordId", getInspectionrecordId());
		attributes.put("hosothutucId", getHosothutucId());
		attributes.put("safetestRequirementId", getSafetestRequirementId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("description", getDescription());
		attributes.put("confirmedResult", getConfirmedResult());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());
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

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		Long inspectionrecordId = (Long)attributes.get("inspectionrecordId");

		if (inspectionrecordId != null) {
			setInspectionrecordId(inspectionrecordId);
		}

		Long hosothutucId = (Long)attributes.get("hosothutucId");

		if (hosothutucId != null) {
			setHosothutucId(hosothutucId);
		}

		Long safetestRequirementId = (Long)attributes.get(
				"safetestRequirementId");

		if (safetestRequirementId != null) {
			setSafetestRequirementId(safetestRequirementId);
		}

		Long corporationId = (Long)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long confirmedResult = (Long)attributes.get("confirmedResult");

		if (confirmedResult != null) {
			setConfirmedResult(confirmedResult);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
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
	* Returns the primary key of this safety test report.
	*
	* @return the primary key of this safety test report
	*/
	@Override
	public long getPrimaryKey() {
		return _safetyTestReport.getPrimaryKey();
	}

	/**
	* Sets the primary key of this safety test report.
	*
	* @param primaryKey the primary key of this safety test report
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_safetyTestReport.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this safety test report.
	*
	* @return the ID of this safety test report
	*/
	@Override
	public long getId() {
		return _safetyTestReport.getId();
	}

	/**
	* Sets the ID of this safety test report.
	*
	* @param id the ID of this safety test report
	*/
	@Override
	public void setId(long id) {
		_safetyTestReport.setId(id);
	}

	/**
	* Returns the registered inspection ID of this safety test report.
	*
	* @return the registered inspection ID of this safety test report
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _safetyTestReport.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this safety test report.
	*
	* @param registeredInspectionId the registered inspection ID of this safety test report
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_safetyTestReport.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the inspectionrecord ID of this safety test report.
	*
	* @return the inspectionrecord ID of this safety test report
	*/
	@Override
	public long getInspectionrecordId() {
		return _safetyTestReport.getInspectionrecordId();
	}

	/**
	* Sets the inspectionrecord ID of this safety test report.
	*
	* @param inspectionrecordId the inspectionrecord ID of this safety test report
	*/
	@Override
	public void setInspectionrecordId(long inspectionrecordId) {
		_safetyTestReport.setInspectionrecordId(inspectionrecordId);
	}

	/**
	* Returns the hosothutuc ID of this safety test report.
	*
	* @return the hosothutuc ID of this safety test report
	*/
	@Override
	public long getHosothutucId() {
		return _safetyTestReport.getHosothutucId();
	}

	/**
	* Sets the hosothutuc ID of this safety test report.
	*
	* @param hosothutucId the hosothutuc ID of this safety test report
	*/
	@Override
	public void setHosothutucId(long hosothutucId) {
		_safetyTestReport.setHosothutucId(hosothutucId);
	}

	/**
	* Returns the safetest requirement ID of this safety test report.
	*
	* @return the safetest requirement ID of this safety test report
	*/
	@Override
	public long getSafetestRequirementId() {
		return _safetyTestReport.getSafetestRequirementId();
	}

	/**
	* Sets the safetest requirement ID of this safety test report.
	*
	* @param safetestRequirementId the safetest requirement ID of this safety test report
	*/
	@Override
	public void setSafetestRequirementId(long safetestRequirementId) {
		_safetyTestReport.setSafetestRequirementId(safetestRequirementId);
	}

	/**
	* Returns the corporation ID of this safety test report.
	*
	* @return the corporation ID of this safety test report
	*/
	@Override
	public long getCorporationId() {
		return _safetyTestReport.getCorporationId();
	}

	/**
	* Sets the corporation ID of this safety test report.
	*
	* @param corporationId the corporation ID of this safety test report
	*/
	@Override
	public void setCorporationId(long corporationId) {
		_safetyTestReport.setCorporationId(corporationId);
	}

	/**
	* Returns the requirement number of this safety test report.
	*
	* @return the requirement number of this safety test report
	*/
	@Override
	public java.lang.String getRequirementNumber() {
		return _safetyTestReport.getRequirementNumber();
	}

	/**
	* Sets the requirement number of this safety test report.
	*
	* @param requirementNumber the requirement number of this safety test report
	*/
	@Override
	public void setRequirementNumber(java.lang.String requirementNumber) {
		_safetyTestReport.setRequirementNumber(requirementNumber);
	}

	/**
	* Returns the report number of this safety test report.
	*
	* @return the report number of this safety test report
	*/
	@Override
	public java.lang.String getReportNumber() {
		return _safetyTestReport.getReportNumber();
	}

	/**
	* Sets the report number of this safety test report.
	*
	* @param reportNumber the report number of this safety test report
	*/
	@Override
	public void setReportNumber(java.lang.String reportNumber) {
		_safetyTestReport.setReportNumber(reportNumber);
	}

	/**
	* Returns the description of this safety test report.
	*
	* @return the description of this safety test report
	*/
	@Override
	public java.lang.String getDescription() {
		return _safetyTestReport.getDescription();
	}

	/**
	* Sets the description of this safety test report.
	*
	* @param description the description of this safety test report
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_safetyTestReport.setDescription(description);
	}

	/**
	* Returns the confirmed result of this safety test report.
	*
	* @return the confirmed result of this safety test report
	*/
	@Override
	public long getConfirmedResult() {
		return _safetyTestReport.getConfirmedResult();
	}

	/**
	* Sets the confirmed result of this safety test report.
	*
	* @param confirmedResult the confirmed result of this safety test report
	*/
	@Override
	public void setConfirmedResult(long confirmedResult) {
		_safetyTestReport.setConfirmedResult(confirmedResult);
	}

	/**
	* Returns the attached file of this safety test report.
	*
	* @return the attached file of this safety test report
	*/
	@Override
	public long getAttachedFile() {
		return _safetyTestReport.getAttachedFile();
	}

	/**
	* Sets the attached file of this safety test report.
	*
	* @param attachedFile the attached file of this safety test report
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_safetyTestReport.setAttachedFile(attachedFile);
	}

	/**
	* Returns the phieuxulyphu ID of this safety test report.
	*
	* @return the phieuxulyphu ID of this safety test report
	*/
	@Override
	public long getPhieuxulyphuId() {
		return _safetyTestReport.getPhieuxulyphuId();
	}

	/**
	* Sets the phieuxulyphu ID of this safety test report.
	*
	* @param phieuxulyphuId the phieuxulyphu ID of this safety test report
	*/
	@Override
	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_safetyTestReport.setPhieuxulyphuId(phieuxulyphuId);
	}

	/**
	* Returns the sign name of this safety test report.
	*
	* @return the sign name of this safety test report
	*/
	@Override
	public java.lang.String getSignName() {
		return _safetyTestReport.getSignName();
	}

	/**
	* Sets the sign name of this safety test report.
	*
	* @param signName the sign name of this safety test report
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_safetyTestReport.setSignName(signName);
	}

	/**
	* Returns the sign title of this safety test report.
	*
	* @return the sign title of this safety test report
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _safetyTestReport.getSignTitle();
	}

	/**
	* Sets the sign title of this safety test report.
	*
	* @param signTitle the sign title of this safety test report
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_safetyTestReport.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this safety test report.
	*
	* @return the sign place of this safety test report
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _safetyTestReport.getSignPlace();
	}

	/**
	* Sets the sign place of this safety test report.
	*
	* @param signPlace the sign place of this safety test report
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_safetyTestReport.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this safety test report.
	*
	* @return the sign date of this safety test report
	*/
	@Override
	public java.util.Date getSignDate() {
		return _safetyTestReport.getSignDate();
	}

	/**
	* Sets the sign date of this safety test report.
	*
	* @param signDate the sign date of this safety test report
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_safetyTestReport.setSignDate(signDate);
	}

	@Override
	public boolean isNew() {
		return _safetyTestReport.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_safetyTestReport.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _safetyTestReport.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_safetyTestReport.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _safetyTestReport.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _safetyTestReport.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_safetyTestReport.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _safetyTestReport.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_safetyTestReport.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_safetyTestReport.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_safetyTestReport.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SafetyTestReportWrapper((SafetyTestReport)_safetyTestReport.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport safetyTestReport) {
		return _safetyTestReport.compareTo(safetyTestReport);
	}

	@Override
	public int hashCode() {
		return _safetyTestReport.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport> toCacheModel() {
		return _safetyTestReport.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport toEscapedModel() {
		return new SafetyTestReportWrapper(_safetyTestReport.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport toUnescapedModel() {
		return new SafetyTestReportWrapper(_safetyTestReport.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _safetyTestReport.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _safetyTestReport.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_safetyTestReport.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SafetyTestReportWrapper)) {
			return false;
		}

		SafetyTestReportWrapper safetyTestReportWrapper = (SafetyTestReportWrapper)obj;

		if (Validator.equals(_safetyTestReport,
					safetyTestReportWrapper._safetyTestReport)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SafetyTestReport getWrappedSafetyTestReport() {
		return _safetyTestReport;
	}

	@Override
	public SafetyTestReport getWrappedModel() {
		return _safetyTestReport;
	}

	@Override
	public void resetOriginalValues() {
		_safetyTestReport.resetOriginalValues();
	}

	private SafetyTestReport _safetyTestReport;
}