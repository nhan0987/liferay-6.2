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
 * This class is a wrapper for {@link ControlRequirement}.
 * </p>
 *
 * @author huymq
 * @see ControlRequirement
 * @generated
 */
public class ControlRequirementWrapper implements ControlRequirement,
	ModelWrapper<ControlRequirement> {
	public ControlRequirementWrapper(ControlRequirement controlRequirement) {
		_controlRequirement = controlRequirement;
	}

	@Override
	public Class<?> getModelClass() {
		return ControlRequirement.class;
	}

	@Override
	public String getModelClassName() {
		return ControlRequirement.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("requirementDate", getRequirementDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("controlContent", getControlContent());
		attributes.put("controlDeadline", getControlDeadline());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("requirementContent", getRequirementContent());
		attributes.put("controlReportDeadline", getControlReportDeadline());
		attributes.put("remarks", getRemarks());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("inspectionrecordId", getInspectionrecordId());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());
		attributes.put("synchdate", getSynchdate());

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

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		Date requirementDate = (Date)attributes.get("requirementDate");

		if (requirementDate != null) {
			setRequirementDate(requirementDate);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String controlContent = (String)attributes.get("controlContent");

		if (controlContent != null) {
			setControlContent(controlContent);
		}

		Date controlDeadline = (Date)attributes.get("controlDeadline");

		if (controlDeadline != null) {
			setControlDeadline(controlDeadline);
		}

		Integer attachedFile = (Integer)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String requirementContent = (String)attributes.get("requirementContent");

		if (requirementContent != null) {
			setRequirementContent(requirementContent);
		}

		Date controlReportDeadline = (Date)attributes.get(
				"controlReportDeadline");

		if (controlReportDeadline != null) {
			setControlReportDeadline(controlReportDeadline);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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

		Long inspectionrecordId = (Long)attributes.get("inspectionrecordId");

		if (inspectionrecordId != null) {
			setInspectionrecordId(inspectionrecordId);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this control requirement.
	*
	* @return the primary key of this control requirement
	*/
	@Override
	public long getPrimaryKey() {
		return _controlRequirement.getPrimaryKey();
	}

	/**
	* Sets the primary key of this control requirement.
	*
	* @param primaryKey the primary key of this control requirement
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_controlRequirement.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this control requirement.
	*
	* @return the ID of this control requirement
	*/
	@Override
	public long getId() {
		return _controlRequirement.getId();
	}

	/**
	* Sets the ID of this control requirement.
	*
	* @param id the ID of this control requirement
	*/
	@Override
	public void setId(long id) {
		_controlRequirement.setId(id);
	}

	/**
	* Returns the registered inspection ID of this control requirement.
	*
	* @return the registered inspection ID of this control requirement
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _controlRequirement.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this control requirement.
	*
	* @param registeredInspectionId the registered inspection ID of this control requirement
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_controlRequirement.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the requirement number of this control requirement.
	*
	* @return the requirement number of this control requirement
	*/
	@Override
	public java.lang.String getRequirementNumber() {
		return _controlRequirement.getRequirementNumber();
	}

	/**
	* Sets the requirement number of this control requirement.
	*
	* @param requirementNumber the requirement number of this control requirement
	*/
	@Override
	public void setRequirementNumber(java.lang.String requirementNumber) {
		_controlRequirement.setRequirementNumber(requirementNumber);
	}

	/**
	* Returns the requirement date of this control requirement.
	*
	* @return the requirement date of this control requirement
	*/
	@Override
	public java.util.Date getRequirementDate() {
		return _controlRequirement.getRequirementDate();
	}

	/**
	* Sets the requirement date of this control requirement.
	*
	* @param requirementDate the requirement date of this control requirement
	*/
	@Override
	public void setRequirementDate(java.util.Date requirementDate) {
		_controlRequirement.setRequirementDate(requirementDate);
	}

	/**
	* Returns the corporation ID of this control requirement.
	*
	* @return the corporation ID of this control requirement
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _controlRequirement.getCorporationId();
	}

	/**
	* Sets the corporation ID of this control requirement.
	*
	* @param corporationId the corporation ID of this control requirement
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_controlRequirement.setCorporationId(corporationId);
	}

	/**
	* Returns the control content of this control requirement.
	*
	* @return the control content of this control requirement
	*/
	@Override
	public java.lang.String getControlContent() {
		return _controlRequirement.getControlContent();
	}

	/**
	* Sets the control content of this control requirement.
	*
	* @param controlContent the control content of this control requirement
	*/
	@Override
	public void setControlContent(java.lang.String controlContent) {
		_controlRequirement.setControlContent(controlContent);
	}

	/**
	* Returns the control deadline of this control requirement.
	*
	* @return the control deadline of this control requirement
	*/
	@Override
	public java.util.Date getControlDeadline() {
		return _controlRequirement.getControlDeadline();
	}

	/**
	* Sets the control deadline of this control requirement.
	*
	* @param controlDeadline the control deadline of this control requirement
	*/
	@Override
	public void setControlDeadline(java.util.Date controlDeadline) {
		_controlRequirement.setControlDeadline(controlDeadline);
	}

	/**
	* Returns the attached file of this control requirement.
	*
	* @return the attached file of this control requirement
	*/
	@Override
	public int getAttachedFile() {
		return _controlRequirement.getAttachedFile();
	}

	/**
	* Sets the attached file of this control requirement.
	*
	* @param attachedFile the attached file of this control requirement
	*/
	@Override
	public void setAttachedFile(int attachedFile) {
		_controlRequirement.setAttachedFile(attachedFile);
	}

	/**
	* Returns the requirement content of this control requirement.
	*
	* @return the requirement content of this control requirement
	*/
	@Override
	public java.lang.String getRequirementContent() {
		return _controlRequirement.getRequirementContent();
	}

	/**
	* Sets the requirement content of this control requirement.
	*
	* @param requirementContent the requirement content of this control requirement
	*/
	@Override
	public void setRequirementContent(java.lang.String requirementContent) {
		_controlRequirement.setRequirementContent(requirementContent);
	}

	/**
	* Returns the control report deadline of this control requirement.
	*
	* @return the control report deadline of this control requirement
	*/
	@Override
	public java.util.Date getControlReportDeadline() {
		return _controlRequirement.getControlReportDeadline();
	}

	/**
	* Sets the control report deadline of this control requirement.
	*
	* @param controlReportDeadline the control report deadline of this control requirement
	*/
	@Override
	public void setControlReportDeadline(java.util.Date controlReportDeadline) {
		_controlRequirement.setControlReportDeadline(controlReportDeadline);
	}

	/**
	* Returns the remarks of this control requirement.
	*
	* @return the remarks of this control requirement
	*/
	@Override
	public java.lang.String getRemarks() {
		return _controlRequirement.getRemarks();
	}

	/**
	* Sets the remarks of this control requirement.
	*
	* @param remarks the remarks of this control requirement
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_controlRequirement.setRemarks(remarks);
	}

	/**
	* Returns the sign name of this control requirement.
	*
	* @return the sign name of this control requirement
	*/
	@Override
	public java.lang.String getSignName() {
		return _controlRequirement.getSignName();
	}

	/**
	* Sets the sign name of this control requirement.
	*
	* @param signName the sign name of this control requirement
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_controlRequirement.setSignName(signName);
	}

	/**
	* Returns the sign title of this control requirement.
	*
	* @return the sign title of this control requirement
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _controlRequirement.getSignTitle();
	}

	/**
	* Sets the sign title of this control requirement.
	*
	* @param signTitle the sign title of this control requirement
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_controlRequirement.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this control requirement.
	*
	* @return the sign place of this control requirement
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _controlRequirement.getSignPlace();
	}

	/**
	* Sets the sign place of this control requirement.
	*
	* @param signPlace the sign place of this control requirement
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_controlRequirement.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this control requirement.
	*
	* @return the sign date of this control requirement
	*/
	@Override
	public java.util.Date getSignDate() {
		return _controlRequirement.getSignDate();
	}

	/**
	* Sets the sign date of this control requirement.
	*
	* @param signDate the sign date of this control requirement
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_controlRequirement.setSignDate(signDate);
	}

	/**
	* Returns the inspectionrecord ID of this control requirement.
	*
	* @return the inspectionrecord ID of this control requirement
	*/
	@Override
	public long getInspectionrecordId() {
		return _controlRequirement.getInspectionrecordId();
	}

	/**
	* Sets the inspectionrecord ID of this control requirement.
	*
	* @param inspectionrecordId the inspectionrecord ID of this control requirement
	*/
	@Override
	public void setInspectionrecordId(long inspectionrecordId) {
		_controlRequirement.setInspectionrecordId(inspectionrecordId);
	}

	/**
	* Returns the phieuxulyphu ID of this control requirement.
	*
	* @return the phieuxulyphu ID of this control requirement
	*/
	@Override
	public long getPhieuxulyphuId() {
		return _controlRequirement.getPhieuxulyphuId();
	}

	/**
	* Sets the phieuxulyphu ID of this control requirement.
	*
	* @param phieuxulyphuId the phieuxulyphu ID of this control requirement
	*/
	@Override
	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_controlRequirement.setPhieuxulyphuId(phieuxulyphuId);
	}

	/**
	* Returns the synchdate of this control requirement.
	*
	* @return the synchdate of this control requirement
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _controlRequirement.getSynchdate();
	}

	/**
	* Sets the synchdate of this control requirement.
	*
	* @param synchdate the synchdate of this control requirement
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_controlRequirement.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _controlRequirement.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_controlRequirement.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _controlRequirement.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_controlRequirement.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _controlRequirement.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _controlRequirement.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_controlRequirement.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _controlRequirement.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_controlRequirement.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_controlRequirement.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_controlRequirement.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ControlRequirementWrapper((ControlRequirement)_controlRequirement.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement) {
		return _controlRequirement.compareTo(controlRequirement);
	}

	@Override
	public int hashCode() {
		return _controlRequirement.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> toCacheModel() {
		return _controlRequirement.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement toEscapedModel() {
		return new ControlRequirementWrapper(_controlRequirement.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement toUnescapedModel() {
		return new ControlRequirementWrapper(_controlRequirement.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _controlRequirement.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _controlRequirement.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_controlRequirement.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ControlRequirementWrapper)) {
			return false;
		}

		ControlRequirementWrapper controlRequirementWrapper = (ControlRequirementWrapper)obj;

		if (Validator.equals(_controlRequirement,
					controlRequirementWrapper._controlRequirement)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ControlRequirement getWrappedControlRequirement() {
		return _controlRequirement;
	}

	@Override
	public ControlRequirement getWrappedModel() {
		return _controlRequirement;
	}

	@Override
	public void resetOriginalValues() {
		_controlRequirement.resetOriginalValues();
	}

	private ControlRequirement _controlRequirement;
}