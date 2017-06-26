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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationViewServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationViewServiceSoap
 * @generated
 */
public class CorporationViewSoap implements Serializable {
	public static CorporationViewSoap toSoapModel(CorporationView model) {
		CorporationViewSoap soapModel = new CorporationViewSoap();

		soapModel.setId(model.getId());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setCorporationName(model.getCorporationName());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setIsLeader(model.getIsLeader());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static CorporationViewSoap[] toSoapModels(CorporationView[] models) {
		CorporationViewSoap[] soapModels = new CorporationViewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CorporationViewSoap[][] toSoapModels(
		CorporationView[][] models) {
		CorporationViewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CorporationViewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CorporationViewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CorporationViewSoap[] toSoapModels(
		List<CorporationView> models) {
		List<CorporationViewSoap> soapModels = new ArrayList<CorporationViewSoap>(models.size());

		for (CorporationView model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CorporationViewSoap[soapModels.size()]);
	}

	public CorporationViewSoap() {
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

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public String getCorporationName() {
		return _corporationName;
	}

	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public int getIsLeader() {
		return _isLeader;
	}

	public void setIsLeader(int isLeader) {
		_isLeader = isLeader;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private String _corporationId;
	private String _corporationName;
	private long _inspectorId;
	private int _isLeader;
	private Date _synchdate;
}