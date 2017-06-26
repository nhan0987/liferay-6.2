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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.SafetyTestRequestServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.SafetyTestRequestServiceSoap
 * @generated
 */
public class SafetyTestRequestSoap implements Serializable {
	public static SafetyTestRequestSoap toSoapModel(SafetyTestRequest model) {
		SafetyTestRequestSoap soapModel = new SafetyTestRequestSoap();

		soapModel.setId(model.getId());
		soapModel.setConfirmedInspectionId(model.getConfirmedInspectionId());
		soapModel.setRequestNumber(model.getRequestNumber());
		soapModel.setTestContent(model.getTestContent());
		soapModel.setTestTimeAndPlace(model.getTestTimeAndPlace());
		soapModel.setTestPayment(model.getTestPayment());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());

		return soapModel;
	}

	public static SafetyTestRequestSoap[] toSoapModels(
		SafetyTestRequest[] models) {
		SafetyTestRequestSoap[] soapModels = new SafetyTestRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SafetyTestRequestSoap[][] toSoapModels(
		SafetyTestRequest[][] models) {
		SafetyTestRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SafetyTestRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SafetyTestRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SafetyTestRequestSoap[] toSoapModels(
		List<SafetyTestRequest> models) {
		List<SafetyTestRequestSoap> soapModels = new ArrayList<SafetyTestRequestSoap>(models.size());

		for (SafetyTestRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SafetyTestRequestSoap[soapModels.size()]);
	}

	public SafetyTestRequestSoap() {
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

	public String getTestContent() {
		return _testContent;
	}

	public void setTestContent(String testContent) {
		_testContent = testContent;
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

	private long _id;
	private long _confirmedInspectionId;
	private String _requestNumber;
	private String _testContent;
	private String _testTimeAndPlace;
	private String _testPayment;
	private String _remarks;
	private String _corporationName;
	private long _attachedFile;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
}