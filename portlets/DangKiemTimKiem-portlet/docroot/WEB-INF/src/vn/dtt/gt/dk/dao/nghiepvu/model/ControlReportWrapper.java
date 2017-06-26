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
 * This class is a wrapper for {@link ControlReport}.
 * </p>
 *
 * @author win_64
 * @see ControlReport
 * @generated
 */
public class ControlReportWrapper implements ControlReport,
	ModelWrapper<ControlReport> {
	public ControlReportWrapper(ControlReport controlReport) {
		_controlReport = controlReport;
	}

	@Override
	public Class<?> getModelClass() {
		return ControlReport.class;
	}

	@Override
	public String getModelClassName() {
		return ControlReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("inspectionrecordId", getInspectionrecordId());
		attributes.put("hosothutucId", getHosothutucId());
		attributes.put("controlRequirementId", getControlRequirementId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("reportDate", getReportDate());
		attributes.put("description", getDescription());
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

		Long controlRequirementId = (Long)attributes.get("controlRequirementId");

		if (controlRequirementId != null) {
			setControlRequirementId(controlRequirementId);
		}

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		Date reportDate = (Date)attributes.get("reportDate");

		if (reportDate != null) {
			setReportDate(reportDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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
	* Returns the primary key of this control report.
	*
	* @return the primary key of this control report
	*/
	@Override
	public long getPrimaryKey() {
		return _controlReport.getPrimaryKey();
	}

	/**
	* Sets the primary key of this control report.
	*
	* @param primaryKey the primary key of this control report
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_controlReport.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this control report.
	*
	* @return the ID of this control report
	*/
	@Override
	public long getId() {
		return _controlReport.getId();
	}

	/**
	* Sets the ID of this control report.
	*
	* @param id the ID of this control report
	*/
	@Override
	public void setId(long id) {
		_controlReport.setId(id);
	}

	/**
	* Returns the registered inspection ID of this control report.
	*
	* @return the registered inspection ID of this control report
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _controlReport.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this control report.
	*
	* @param registeredInspectionId the registered inspection ID of this control report
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_controlReport.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the inspectionrecord ID of this control report.
	*
	* @return the inspectionrecord ID of this control report
	*/
	@Override
	public long getInspectionrecordId() {
		return _controlReport.getInspectionrecordId();
	}

	/**
	* Sets the inspectionrecord ID of this control report.
	*
	* @param inspectionrecordId the inspectionrecord ID of this control report
	*/
	@Override
	public void setInspectionrecordId(long inspectionrecordId) {
		_controlReport.setInspectionrecordId(inspectionrecordId);
	}

	/**
	* Returns the hosothutuc ID of this control report.
	*
	* @return the hosothutuc ID of this control report
	*/
	@Override
	public long getHosothutucId() {
		return _controlReport.getHosothutucId();
	}

	/**
	* Sets the hosothutuc ID of this control report.
	*
	* @param hosothutucId the hosothutuc ID of this control report
	*/
	@Override
	public void setHosothutucId(long hosothutucId) {
		_controlReport.setHosothutucId(hosothutucId);
	}

	/**
	* Returns the control requirement ID of this control report.
	*
	* @return the control requirement ID of this control report
	*/
	@Override
	public long getControlRequirementId() {
		return _controlReport.getControlRequirementId();
	}

	/**
	* Sets the control requirement ID of this control report.
	*
	* @param controlRequirementId the control requirement ID of this control report
	*/
	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_controlReport.setControlRequirementId(controlRequirementId);
	}

	/**
	* Returns the requirement number of this control report.
	*
	* @return the requirement number of this control report
	*/
	@Override
	public java.lang.String getRequirementNumber() {
		return _controlReport.getRequirementNumber();
	}

	/**
	* Sets the requirement number of this control report.
	*
	* @param requirementNumber the requirement number of this control report
	*/
	@Override
	public void setRequirementNumber(java.lang.String requirementNumber) {
		_controlReport.setRequirementNumber(requirementNumber);
	}

	/**
	* Returns the report number of this control report.
	*
	* @return the report number of this control report
	*/
	@Override
	public java.lang.String getReportNumber() {
		return _controlReport.getReportNumber();
	}

	/**
	* Sets the report number of this control report.
	*
	* @param reportNumber the report number of this control report
	*/
	@Override
	public void setReportNumber(java.lang.String reportNumber) {
		_controlReport.setReportNumber(reportNumber);
	}

	/**
	* Returns the report date of this control report.
	*
	* @return the report date of this control report
	*/
	@Override
	public java.util.Date getReportDate() {
		return _controlReport.getReportDate();
	}

	/**
	* Sets the report date of this control report.
	*
	* @param reportDate the report date of this control report
	*/
	@Override
	public void setReportDate(java.util.Date reportDate) {
		_controlReport.setReportDate(reportDate);
	}

	/**
	* Returns the description of this control report.
	*
	* @return the description of this control report
	*/
	@Override
	public java.lang.String getDescription() {
		return _controlReport.getDescription();
	}

	/**
	* Sets the description of this control report.
	*
	* @param description the description of this control report
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_controlReport.setDescription(description);
	}

	/**
	* Returns the attached file of this control report.
	*
	* @return the attached file of this control report
	*/
	@Override
	public long getAttachedFile() {
		return _controlReport.getAttachedFile();
	}

	/**
	* Sets the attached file of this control report.
	*
	* @param attachedFile the attached file of this control report
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_controlReport.setAttachedFile(attachedFile);
	}

	/**
	* Returns the sign name of this control report.
	*
	* @return the sign name of this control report
	*/
	@Override
	public java.lang.String getSignName() {
		return _controlReport.getSignName();
	}

	/**
	* Sets the sign name of this control report.
	*
	* @param signName the sign name of this control report
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_controlReport.setSignName(signName);
	}

	/**
	* Returns the sign title of this control report.
	*
	* @return the sign title of this control report
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _controlReport.getSignTitle();
	}

	/**
	* Sets the sign title of this control report.
	*
	* @param signTitle the sign title of this control report
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_controlReport.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this control report.
	*
	* @return the sign place of this control report
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _controlReport.getSignPlace();
	}

	/**
	* Sets the sign place of this control report.
	*
	* @param signPlace the sign place of this control report
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_controlReport.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this control report.
	*
	* @return the sign date of this control report
	*/
	@Override
	public java.util.Date getSignDate() {
		return _controlReport.getSignDate();
	}

	/**
	* Sets the sign date of this control report.
	*
	* @param signDate the sign date of this control report
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_controlReport.setSignDate(signDate);
	}

	@Override
	public boolean isNew() {
		return _controlReport.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_controlReport.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _controlReport.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_controlReport.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _controlReport.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _controlReport.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_controlReport.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _controlReport.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_controlReport.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_controlReport.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_controlReport.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ControlReportWrapper((ControlReport)_controlReport.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport controlReport) {
		return _controlReport.compareTo(controlReport);
	}

	@Override
	public int hashCode() {
		return _controlReport.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> toCacheModel() {
		return _controlReport.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport toEscapedModel() {
		return new ControlReportWrapper(_controlReport.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport toUnescapedModel() {
		return new ControlReportWrapper(_controlReport.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _controlReport.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _controlReport.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_controlReport.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ControlReportWrapper)) {
			return false;
		}

		ControlReportWrapper controlReportWrapper = (ControlReportWrapper)obj;

		if (Validator.equals(_controlReport, controlReportWrapper._controlReport)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ControlReport getWrappedControlReport() {
		return _controlReport;
	}

	@Override
	public ControlReport getWrappedModel() {
		return _controlReport;
	}

	@Override
	public void resetOriginalValues() {
		_controlReport.resetOriginalValues();
	}

	private ControlReport _controlReport;
}