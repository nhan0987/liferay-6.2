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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationAttendeeServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationAttendeeServiceSoap
 * @generated
 */
public class CorporationAttendeeSoap implements Serializable {
	public static CorporationAttendeeSoap toSoapModel(CorporationAttendee model) {
		CorporationAttendeeSoap soapModel = new CorporationAttendeeSoap();

		soapModel.setId(model.getId());
		soapModel.setConfirmedInspectionId(model.getConfirmedInspectionId());
		soapModel.setSequence(model.getSequence());
		soapModel.setInspectorid(model.getInspectorid());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setInspectorRole(model.getInspectorRole());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static CorporationAttendeeSoap[] toSoapModels(
		CorporationAttendee[] models) {
		CorporationAttendeeSoap[] soapModels = new CorporationAttendeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CorporationAttendeeSoap[][] toSoapModels(
		CorporationAttendee[][] models) {
		CorporationAttendeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CorporationAttendeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CorporationAttendeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CorporationAttendeeSoap[] toSoapModels(
		List<CorporationAttendee> models) {
		List<CorporationAttendeeSoap> soapModels = new ArrayList<CorporationAttendeeSoap>(models.size());

		for (CorporationAttendee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CorporationAttendeeSoap[soapModels.size()]);
	}

	public CorporationAttendeeSoap() {
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

	public long getSequence() {
		return _sequence;
	}

	public void setSequence(long sequence) {
		_sequence = sequence;
	}

	public long getInspectorid() {
		return _inspectorid;
	}

	public void setInspectorid(long inspectorid) {
		_inspectorid = inspectorid;
	}

	public String getInspectorName() {
		return _inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	public long getInspectorRole() {
		return _inspectorRole;
	}

	public void setInspectorRole(long inspectorRole) {
		_inspectorRole = inspectorRole;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private long _confirmedInspectionId;
	private long _sequence;
	private long _inspectorid;
	private String _inspectorName;
	private long _inspectorRole;
	private Date _synchdate;
}