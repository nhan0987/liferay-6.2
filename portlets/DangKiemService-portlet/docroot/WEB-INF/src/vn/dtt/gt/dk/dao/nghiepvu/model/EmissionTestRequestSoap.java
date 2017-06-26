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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.EmissionTestRequestServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.EmissionTestRequestServiceSoap
 * @generated
 */
public class EmissionTestRequestSoap implements Serializable {
	public static EmissionTestRequestSoap toSoapModel(EmissionTestRequest model) {
		EmissionTestRequestSoap soapModel = new EmissionTestRequestSoap();

		soapModel.setId(model.getId());
		soapModel.setConfirmedInspectionId(model.getConfirmedInspectionId());
		soapModel.setRequestNumber(model.getRequestNumber());
		soapModel.setTestTimeAndPlace(model.getTestTimeAndPlace());
		soapModel.setTestPayment(model.getTestPayment());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static EmissionTestRequestSoap[] toSoapModels(
		EmissionTestRequest[] models) {
		EmissionTestRequestSoap[] soapModels = new EmissionTestRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmissionTestRequestSoap[][] toSoapModels(
		EmissionTestRequest[][] models) {
		EmissionTestRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmissionTestRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmissionTestRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmissionTestRequestSoap[] toSoapModels(
		List<EmissionTestRequest> models) {
		List<EmissionTestRequestSoap> soapModels = new ArrayList<EmissionTestRequestSoap>(models.size());

		for (EmissionTestRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmissionTestRequestSoap[soapModels.size()]);
	}

	public EmissionTestRequestSoap() {
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

	public String getTestTimeAndPlace() {
		return _testTimeAndPlace;
	}

	public void setTestTimeAndPlace(String testTimeAndPlace) {
		_testTimeAndPlace = testTimeAndPlace;
	}

	public String getTestPayment() {
		return _testPayment;
	}

	public void setTestPayment(String testPayment) {
		_testPayment = testPayment;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
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

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private long _confirmedInspectionId;
	private String _requestNumber;
	private String _testTimeAndPlace;
	private String _testPayment;
	private String _remarks;
	private String _corporationName;
	private long _attachedFile;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private Date _synchdate;
}