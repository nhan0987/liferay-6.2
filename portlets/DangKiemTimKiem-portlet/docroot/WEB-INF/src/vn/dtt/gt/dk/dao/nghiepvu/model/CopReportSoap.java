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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CopReportServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CopReportServiceSoap
 * @generated
 */
public class CopReportSoap implements Serializable {
	public static CopReportSoap toSoapModel(CopReport model) {
		CopReportSoap soapModel = new CopReportSoap();

		soapModel.setId(model.getId());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setReportNumber(model.getReportNumber());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());

		return soapModel;
	}

	public static CopReportSoap[] toSoapModels(CopReport[] models) {
		CopReportSoap[] soapModels = new CopReportSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CopReportSoap[][] toSoapModels(CopReport[][] models) {
		CopReportSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CopReportSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CopReportSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CopReportSoap[] toSoapModels(List<CopReport> models) {
		List<CopReportSoap> soapModels = new ArrayList<CopReportSoap>(models.size());

		for (CopReport model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CopReportSoap[soapModels.size()]);
	}

	public CopReportSoap() {
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

	public String getReportNumber() {
		return _reportNumber;
	}

	public void setReportNumber(String reportNumber) {
		_reportNumber = reportNumber;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
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
	private String _reportNumber;
	private String _corporationId;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
}