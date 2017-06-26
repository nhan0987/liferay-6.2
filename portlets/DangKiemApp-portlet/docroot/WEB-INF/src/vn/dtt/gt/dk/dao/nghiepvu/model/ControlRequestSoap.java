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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.ControlRequestServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.ControlRequestServiceSoap
 * @generated
 */
public class ControlRequestSoap implements Serializable {
	public static ControlRequestSoap toSoapModel(ControlRequest model) {
		ControlRequestSoap soapModel = new ControlRequestSoap();

		soapModel.setId(model.getId());
		soapModel.setConfirmedInspectionId(model.getConfirmedInspectionId());
		soapModel.setRequestNumber(model.getRequestNumber());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setControlContent(model.getControlContent());
		soapModel.setControlDeadLine(model.getControlDeadLine());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());

		return soapModel;
	}

	public static ControlRequestSoap[] toSoapModels(ControlRequest[] models) {
		ControlRequestSoap[] soapModels = new ControlRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ControlRequestSoap[][] toSoapModels(ControlRequest[][] models) {
		ControlRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ControlRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ControlRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ControlRequestSoap[] toSoapModels(List<ControlRequest> models) {
		List<ControlRequestSoap> soapModels = new ArrayList<ControlRequestSoap>(models.size());

		for (ControlRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ControlRequestSoap[soapModels.size()]);
	}

	public ControlRequestSoap() {
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

	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;
	}

	public String getRequestNumber() {
		return _requestNumber;
	}

	public void setRequestNumber(String requestNumber) {
		_requestNumber = requestNumber;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public String getControlContent() {
		return _controlContent;
	}

	public void setControlContent(String controlContent) {
		_controlContent = controlContent;
	}

	public Date getControlDeadLine() {
		return _controlDeadLine;
	}

	public void setControlDeadLine(Date controlDeadLine) {
		_controlDeadLine = controlDeadLine;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
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
	private long _confirmedInspectionId;
	private String _requestNumber;
	private String _corporationName;
	private String _controlContent;
	private Date _controlDeadLine;
	private String _remarks;
	private long _attachedFile;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
}