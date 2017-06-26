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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.ControlReportServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.ControlReportServiceSoap
 * @generated
 */
public class ControlReportSoap implements Serializable {
	public static ControlReportSoap toSoapModel(ControlReport model) {
		ControlReportSoap soapModel = new ControlReportSoap();

		soapModel.setId(model.getId());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setInspectionrecordId(model.getInspectionrecordId());
		soapModel.setHosothutucId(model.getHosothutucId());
		soapModel.setControlRequirementId(model.getControlRequirementId());
		soapModel.setRequirementNumber(model.getRequirementNumber());
		soapModel.setReportNumber(model.getReportNumber());
		soapModel.setReportDate(model.getReportDate());
		soapModel.setDescription(model.getDescription());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setPhieuxulyphuId(model.getPhieuxulyphuId());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());

		return soapModel;
	}

	public static ControlReportSoap[] toSoapModels(ControlReport[] models) {
		ControlReportSoap[] soapModels = new ControlReportSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ControlReportSoap[][] toSoapModels(ControlReport[][] models) {
		ControlReportSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ControlReportSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ControlReportSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ControlReportSoap[] toSoapModels(List<ControlReport> models) {
		List<ControlReportSoap> soapModels = new ArrayList<ControlReportSoap>(models.size());

		for (ControlReport model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ControlReportSoap[soapModels.size()]);
	}

	public ControlReportSoap() {
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

	public long getInspectionrecordId() {
		return _inspectionrecordId;
	}

	public void setInspectionrecordId(long inspectionrecordId) {
		_inspectionrecordId = inspectionrecordId;
	}

	public long getHosothutucId() {
		return _hosothutucId;
	}

	public void setHosothutucId(long hosothutucId) {
		_hosothutucId = hosothutucId;
	}

	public long getControlRequirementId() {
		return _controlRequirementId;
	}

	public void setControlRequirementId(long controlRequirementId) {
		_controlRequirementId = controlRequirementId;
	}

	public String getRequirementNumber() {
		return _requirementNumber;
	}

	public void setRequirementNumber(String requirementNumber) {
		_requirementNumber = requirementNumber;
	}

	public String getReportNumber() {
		return _reportNumber;
	}

	public void setReportNumber(String reportNumber) {
		_reportNumber = reportNumber;
	}

	public Date getReportDate() {
		return _reportDate;
	}

	public void setReportDate(Date reportDate) {
		_reportDate = reportDate;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public long getPhieuxulyphuId() {
		return _phieuxulyphuId;
	}

	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_phieuxulyphuId = phieuxulyphuId;
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

	private long _id;
	private long _registeredInspectionId;
	private long _inspectionrecordId;
	private long _hosothutucId;
	private long _controlRequirementId;
	private String _requirementNumber;
	private String _reportNumber;
	private Date _reportDate;
	private String _description;
	private long _attachedFile;
	private long _phieuxulyphuId;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
}