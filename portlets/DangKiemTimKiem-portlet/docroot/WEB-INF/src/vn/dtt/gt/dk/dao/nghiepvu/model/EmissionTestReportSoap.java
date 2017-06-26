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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.EmissionTestReportServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.EmissionTestReportServiceSoap
 * @generated
 */
public class EmissionTestReportSoap implements Serializable {
	public static EmissionTestReportSoap toSoapModel(EmissionTestReport model) {
		EmissionTestReportSoap soapModel = new EmissionTestReportSoap();

		soapModel.setId(model.getId());
		soapModel.setEmissiontestRequirementId(model.getEmissiontestRequirementId());
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

	public static EmissionTestReportSoap[] toSoapModels(
		EmissionTestReport[] models) {
		EmissionTestReportSoap[] soapModels = new EmissionTestReportSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmissionTestReportSoap[][] toSoapModels(
		EmissionTestReport[][] models) {
		EmissionTestReportSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmissionTestReportSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmissionTestReportSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmissionTestReportSoap[] toSoapModels(
		List<EmissionTestReport> models) {
		List<EmissionTestReportSoap> soapModels = new ArrayList<EmissionTestReportSoap>(models.size());

		for (EmissionTestReport model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmissionTestReportSoap[soapModels.size()]);
	}

	public EmissionTestReportSoap() {
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

	public long getEmissiontestRequirementId() {
		return _emissiontestRequirementId;
	}

	public void setEmissiontestRequirementId(long emissiontestRequirementId) {
		_emissiontestRequirementId = emissiontestRequirementId;
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
	private long _emissiontestRequirementId;
	private String _reportNumber;
	private String _description;
	private long _attachedFile;
	private long _confirmedResult;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
}