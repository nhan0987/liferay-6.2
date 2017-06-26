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
 * This class is a wrapper for {@link EmissionTestReport}.
 * </p>
 *
 * @author win_64
 * @see EmissionTestReport
 * @generated
 */
public class EmissionTestReportWrapper implements EmissionTestReport,
	ModelWrapper<EmissionTestReport> {
	public EmissionTestReportWrapper(EmissionTestReport emissionTestReport) {
		_emissionTestReport = emissionTestReport;
	}

	@Override
	public Class<?> getModelClass() {
		return EmissionTestReport.class;
	}

	@Override
	public String getModelClassName() {
		return EmissionTestReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("inspectionrecordId", getInspectionrecordId());
		attributes.put("hosothutucId", getHosothutucId());
		attributes.put("emissiontestRequirementId",
			getEmissiontestRequirementId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("description", getDescription());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());
		attributes.put("confirmedResult", getConfirmedResult());
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

		Long emissiontestRequirementId = (Long)attributes.get(
				"emissiontestRequirementId");

		if (emissiontestRequirementId != null) {
			setEmissiontestRequirementId(emissiontestRequirementId);
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

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
		}

		Long confirmedResult = (Long)attributes.get("confirmedResult");

		if (confirmedResult != null) {
			setConfirmedResult(confirmedResult);
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
	* Returns the primary key of this emission test report.
	*
	* @return the primary key of this emission test report
	*/
	@Override
	public long getPrimaryKey() {
		return _emissionTestReport.getPrimaryKey();
	}

	/**
	* Sets the primary key of this emission test report.
	*
	* @param primaryKey the primary key of this emission test report
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_emissionTestReport.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this emission test report.
	*
	* @return the ID of this emission test report
	*/
	@Override
	public long getId() {
		return _emissionTestReport.getId();
	}

	/**
	* Sets the ID of this emission test report.
	*
	* @param id the ID of this emission test report
	*/
	@Override
	public void setId(long id) {
		_emissionTestReport.setId(id);
	}

	/**
	* Returns the registered inspection ID of this emission test report.
	*
	* @return the registered inspection ID of this emission test report
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _emissionTestReport.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this emission test report.
	*
	* @param registeredInspectionId the registered inspection ID of this emission test report
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_emissionTestReport.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the inspectionrecord ID of this emission test report.
	*
	* @return the inspectionrecord ID of this emission test report
	*/
	@Override
	public long getInspectionrecordId() {
		return _emissionTestReport.getInspectionrecordId();
	}

	/**
	* Sets the inspectionrecord ID of this emission test report.
	*
	* @param inspectionrecordId the inspectionrecord ID of this emission test report
	*/
	@Override
	public void setInspectionrecordId(long inspectionrecordId) {
		_emissionTestReport.setInspectionrecordId(inspectionrecordId);
	}

	/**
	* Returns the hosothutuc ID of this emission test report.
	*
	* @return the hosothutuc ID of this emission test report
	*/
	@Override
	public long getHosothutucId() {
		return _emissionTestReport.getHosothutucId();
	}

	/**
	* Sets the hosothutuc ID of this emission test report.
	*
	* @param hosothutucId the hosothutuc ID of this emission test report
	*/
	@Override
	public void setHosothutucId(long hosothutucId) {
		_emissionTestReport.setHosothutucId(hosothutucId);
	}

	/**
	* Returns the emissiontest requirement ID of this emission test report.
	*
	* @return the emissiontest requirement ID of this emission test report
	*/
	@Override
	public long getEmissiontestRequirementId() {
		return _emissionTestReport.getEmissiontestRequirementId();
	}

	/**
	* Sets the emissiontest requirement ID of this emission test report.
	*
	* @param emissiontestRequirementId the emissiontest requirement ID of this emission test report
	*/
	@Override
	public void setEmissiontestRequirementId(long emissiontestRequirementId) {
		_emissionTestReport.setEmissiontestRequirementId(emissiontestRequirementId);
	}

	/**
	* Returns the requirement number of this emission test report.
	*
	* @return the requirement number of this emission test report
	*/
	@Override
	public java.lang.String getRequirementNumber() {
		return _emissionTestReport.getRequirementNumber();
	}

	/**
	* Sets the requirement number of this emission test report.
	*
	* @param requirementNumber the requirement number of this emission test report
	*/
	@Override
	public void setRequirementNumber(java.lang.String requirementNumber) {
		_emissionTestReport.setRequirementNumber(requirementNumber);
	}

	/**
	* Returns the report number of this emission test report.
	*
	* @return the report number of this emission test report
	*/
	@Override
	public java.lang.String getReportNumber() {
		return _emissionTestReport.getReportNumber();
	}

	/**
	* Sets the report number of this emission test report.
	*
	* @param reportNumber the report number of this emission test report
	*/
	@Override
	public void setReportNumber(java.lang.String reportNumber) {
		_emissionTestReport.setReportNumber(reportNumber);
	}

	/**
	* Returns the description of this emission test report.
	*
	* @return the description of this emission test report
	*/
	@Override
	public java.lang.String getDescription() {
		return _emissionTestReport.getDescription();
	}

	/**
	* Sets the description of this emission test report.
	*
	* @param description the description of this emission test report
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_emissionTestReport.setDescription(description);
	}

	/**
	* Returns the attached file of this emission test report.
	*
	* @return the attached file of this emission test report
	*/
	@Override
	public long getAttachedFile() {
		return _emissionTestReport.getAttachedFile();
	}

	/**
	* Sets the attached file of this emission test report.
	*
	* @param attachedFile the attached file of this emission test report
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_emissionTestReport.setAttachedFile(attachedFile);
	}

	/**
	* Returns the phieuxulyphu ID of this emission test report.
	*
	* @return the phieuxulyphu ID of this emission test report
	*/
	@Override
	public long getPhieuxulyphuId() {
		return _emissionTestReport.getPhieuxulyphuId();
	}

	/**
	* Sets the phieuxulyphu ID of this emission test report.
	*
	* @param phieuxulyphuId the phieuxulyphu ID of this emission test report
	*/
	@Override
	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_emissionTestReport.setPhieuxulyphuId(phieuxulyphuId);
	}

	/**
	* Returns the confirmed result of this emission test report.
	*
	* @return the confirmed result of this emission test report
	*/
	@Override
	public long getConfirmedResult() {
		return _emissionTestReport.getConfirmedResult();
	}

	/**
	* Sets the confirmed result of this emission test report.
	*
	* @param confirmedResult the confirmed result of this emission test report
	*/
	@Override
	public void setConfirmedResult(long confirmedResult) {
		_emissionTestReport.setConfirmedResult(confirmedResult);
	}

	/**
	* Returns the sign name of this emission test report.
	*
	* @return the sign name of this emission test report
	*/
	@Override
	public java.lang.String getSignName() {
		return _emissionTestReport.getSignName();
	}

	/**
	* Sets the sign name of this emission test report.
	*
	* @param signName the sign name of this emission test report
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_emissionTestReport.setSignName(signName);
	}

	/**
	* Returns the sign title of this emission test report.
	*
	* @return the sign title of this emission test report
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _emissionTestReport.getSignTitle();
	}

	/**
	* Sets the sign title of this emission test report.
	*
	* @param signTitle the sign title of this emission test report
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_emissionTestReport.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this emission test report.
	*
	* @return the sign place of this emission test report
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _emissionTestReport.getSignPlace();
	}

	/**
	* Sets the sign place of this emission test report.
	*
	* @param signPlace the sign place of this emission test report
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_emissionTestReport.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this emission test report.
	*
	* @return the sign date of this emission test report
	*/
	@Override
	public java.util.Date getSignDate() {
		return _emissionTestReport.getSignDate();
	}

	/**
	* Sets the sign date of this emission test report.
	*
	* @param signDate the sign date of this emission test report
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_emissionTestReport.setSignDate(signDate);
	}

	@Override
	public boolean isNew() {
		return _emissionTestReport.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_emissionTestReport.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _emissionTestReport.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_emissionTestReport.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _emissionTestReport.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _emissionTestReport.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_emissionTestReport.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _emissionTestReport.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_emissionTestReport.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_emissionTestReport.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_emissionTestReport.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmissionTestReportWrapper((EmissionTestReport)_emissionTestReport.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport) {
		return _emissionTestReport.compareTo(emissionTestReport);
	}

	@Override
	public int hashCode() {
		return _emissionTestReport.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport> toCacheModel() {
		return _emissionTestReport.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport toEscapedModel() {
		return new EmissionTestReportWrapper(_emissionTestReport.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport toUnescapedModel() {
		return new EmissionTestReportWrapper(_emissionTestReport.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _emissionTestReport.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _emissionTestReport.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_emissionTestReport.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmissionTestReportWrapper)) {
			return false;
		}

		EmissionTestReportWrapper emissionTestReportWrapper = (EmissionTestReportWrapper)obj;

		if (Validator.equals(_emissionTestReport,
					emissionTestReportWrapper._emissionTestReport)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EmissionTestReport getWrappedEmissionTestReport() {
		return _emissionTestReport;
	}

	@Override
	public EmissionTestReport getWrappedModel() {
		return _emissionTestReport;
	}

	@Override
	public void resetOriginalValues() {
		_emissionTestReport.resetOriginalValues();
	}

	private EmissionTestReport _emissionTestReport;
}