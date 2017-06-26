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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.SafetyTestReportServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.SafetyTestReportServiceSoap
 * @generated
 */
public class SafetyTestReportSoap implements Serializable {
	public static SafetyTestReportSoap toSoapModel(SafetyTestReport model) {
		SafetyTestReportSoap soapModel = new SafetyTestReportSoap();

		soapModel.setId(model.getId());
		soapModel.setSafetestRequirementId(model.getSafetestRequirementId());
		soapModel.setReportNumber(model.getReportNumber());
		soapModel.setDescription(model.getDescription());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setConfirmedResult(model.getConfirmedResult());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());

		return soapModel;
	}

	public static SafetyTestReportSoap[] toSoapModels(SafetyTestReport[] models) {
		SafetyTestReportSoap[] soapModels = new SafetyTestReportSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SafetyTestReportSoap[][] toSoapModels(
		SafetyTestReport[][] models) {
		SafetyTestReportSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SafetyTestReportSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SafetyTestReportSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SafetyTestReportSoap[] toSoapModels(
		List<SafetyTestReport> models) {
		List<SafetyTestReportSoap> soapModels = new ArrayList<SafetyTestReportSoap>(models.size());

		for (SafetyTestReport model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SafetyTestReportSoap[soapModels.size()]);
	}

	public SafetyTestReportSoap() {
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

	public long getSafetestRequirementId() {
		return _safetestRequirementId;
	}

	public void setSafetestRequirementId(long safetestRequirementId) {
		_safetestRequirementId = safetestRequirementId;
	}

	public String getReportNumber() {
		return _reportNumber;
	}

	public void setReportNumber(String reportNumber) {
		_reportNumber = reportNumber;
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

	public long getConfirmedResult() {
		return _confirmedResult;
	}

	public void setConfirmedResult(long confirmedResult) {
		_confirmedResult = confirmedResult;
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
	private long _safetestRequirementId;
	private String _reportNumber;
	private String _description;
	private long _attachedFile;
	private long _confirmedResult;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
}