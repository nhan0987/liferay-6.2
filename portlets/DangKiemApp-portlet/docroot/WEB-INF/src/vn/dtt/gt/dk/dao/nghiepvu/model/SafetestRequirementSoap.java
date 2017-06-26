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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.SafetestRequirementServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.SafetestRequirementServiceSoap
 * @generated
 */
public class SafetestRequirementSoap implements Serializable {
	public static SafetestRequirementSoap toSoapModel(SafetestRequirement model) {
		SafetestRequirementSoap soapModel = new SafetestRequirementSoap();

		soapModel.setId(model.getId());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setInspectionRecordId(model.getInspectionRecordId());
		soapModel.setRequirementNumber(model.getRequirementNumber());
		soapModel.setContentOfRequest(model.getContentOfRequest());
		soapModel.setTestingRegisteredPlace(model.getTestingRegisteredPlace());
		soapModel.setTestingRegistration(model.getTestingRegistration());
		soapModel.setTestingPaymentCondition(model.getTestingPaymentCondition());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setPhieuXuLyPhuId(model.getPhieuXuLyPhuId());

		return soapModel;
	}

	public static SafetestRequirementSoap[] toSoapModels(
		SafetestRequirement[] models) {
		SafetestRequirementSoap[] soapModels = new SafetestRequirementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SafetestRequirementSoap[][] toSoapModels(
		SafetestRequirement[][] models) {
		SafetestRequirementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SafetestRequirementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SafetestRequirementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SafetestRequirementSoap[] toSoapModels(
		List<SafetestRequirement> models) {
		List<SafetestRequirementSoap> soapModels = new ArrayList<SafetestRequirementSoap>(models.size());

		for (SafetestRequirement model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SafetestRequirementSoap[soapModels.size()]);
	}

	public SafetestRequirementSoap() {
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

	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	public String getRequirementNumber() {
		return _requirementNumber;
	}

	public void setRequirementNumber(String requirementNumber) {
		_requirementNumber = requirementNumber;
	}

	public String getContentOfRequest() {
		return _contentOfRequest;
	}

	public void setContentOfRequest(String contentOfRequest) {
		_contentOfRequest = contentOfRequest;
	}

	public String getTestingRegisteredPlace() {
		return _testingRegisteredPlace;
	}

	public void setTestingRegisteredPlace(String testingRegisteredPlace) {
		_testingRegisteredPlace = testingRegisteredPlace;
	}

	public String getTestingRegistration() {
		return _testingRegistration;
	}

	public void setTestingRegistration(String testingRegistration) {
		_testingRegistration = testingRegistration;
	}

	public String getTestingPaymentCondition() {
		return _testingPaymentCondition;
	}

	public void setTestingPaymentCondition(String testingPaymentCondition) {
		_testingPaymentCondition = testingPaymentCondition;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
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

	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;
	}

	private long _id;
	private long _registeredInspectionId;
	private long _inspectionRecordId;
	private String _requirementNumber;
	private String _contentOfRequest;
	private String _testingRegisteredPlace;
	private String _testingRegistration;
	private String _testingPaymentCondition;
	private String _remarks;
	private String _corporationId;
	private long _attachedFile;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _phieuXuLyPhuId;
}