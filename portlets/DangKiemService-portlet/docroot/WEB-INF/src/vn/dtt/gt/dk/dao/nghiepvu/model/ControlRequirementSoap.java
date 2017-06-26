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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.ControlRequirementServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.ControlRequirementServiceSoap
 * @generated
 */
public class ControlRequirementSoap implements Serializable {
	public static ControlRequirementSoap toSoapModel(ControlRequirement model) {
		ControlRequirementSoap soapModel = new ControlRequirementSoap();

		soapModel.setId(model.getId());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setRequirementNumber(model.getRequirementNumber());
		soapModel.setRequirementDate(model.getRequirementDate());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setControlContent(model.getControlContent());
		soapModel.setControlDeadline(model.getControlDeadline());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setRequirementContent(model.getRequirementContent());
		soapModel.setControlReportDeadline(model.getControlReportDeadline());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setInspectionrecordId(model.getInspectionrecordId());
		soapModel.setPhieuxulyphuId(model.getPhieuxulyphuId());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static ControlRequirementSoap[] toSoapModels(
		ControlRequirement[] models) {
		ControlRequirementSoap[] soapModels = new ControlRequirementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ControlRequirementSoap[][] toSoapModels(
		ControlRequirement[][] models) {
		ControlRequirementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ControlRequirementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ControlRequirementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ControlRequirementSoap[] toSoapModels(
		List<ControlRequirement> models) {
		List<ControlRequirementSoap> soapModels = new ArrayList<ControlRequirementSoap>(models.size());

		for (ControlRequirement model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ControlRequirementSoap[soapModels.size()]);
	}

	public ControlRequirementSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;
	}

	public String getRequirementNumber() {
		return _requirementNumber;
	}

	public void setRequirementNumber(String requirementNumber) {
		_requirementNumber = requirementNumber;
	}

	public Date getRequirementDate() {
		return _requirementDate;
	}

	public void setRequirementDate(Date requirementDate) {
		_requirementDate = requirementDate;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public String getControlContent() {
		return _controlContent;
	}

	public void setControlContent(String controlContent) {
		_controlContent = controlContent;
	}

	public Date getControlDeadline() {
		return _controlDeadline;
	}

	public void setControlDeadline(Date controlDeadline) {
		_controlDeadline = controlDeadline;
	}

	public int getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(int attachedFile) {
		_attachedFile = attachedFile;
	}

	public String getRequirementContent() {
		return _requirementContent;
	}

	public void setRequirementContent(String requirementContent) {
		_requirementContent = requirementContent;
	}

	public Date getControlReportDeadline() {
		return _controlReportDeadline;
	}

	public void setControlReportDeadline(Date controlReportDeadline) {
		_controlReportDeadline = controlReportDeadline;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getSignName() {
		return _signName;
	}

	public void setSignName(String signName) {
		_signName = signName;
	}

	public String getSignTitle() {
		return _signTitle;
	}

	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public long getInspectionrecordId() {
		return _inspectionrecordId;
	}

	public void setInspectionrecordId(long inspectionrecordId) {
		_inspectionrecordId = inspectionrecordId;
	}

	public long getPhieuxulyphuId() {
		return _phieuxulyphuId;
	}

	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_phieuxulyphuId = phieuxulyphuId;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private long _registeredInspectionId;
	private String _requirementNumber;
	private Date _requirementDate;
	private String _corporationId;
	private String _controlContent;
	private Date _controlDeadline;
	private int _attachedFile;
	private String _requirementContent;
	private Date _controlReportDeadline;
	private String _remarks;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _inspectionrecordId;
	private long _phieuxulyphuId;
	private Date _synchdate;
}