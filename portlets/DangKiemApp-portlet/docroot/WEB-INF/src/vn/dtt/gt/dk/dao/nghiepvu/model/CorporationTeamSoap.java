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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationTeamServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationTeamServiceSoap
 * @generated
 */
public class CorporationTeamSoap implements Serializable {
	public static CorporationTeamSoap toSoapModel(CorporationTeam model) {
		CorporationTeamSoap soapModel = new CorporationTeamSoap();

		soapModel.setId(model.getId());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setTeamName(model.getTeamName());
		soapModel.setMarkUpDelete(model.getMarkUpDelete());

		return soapModel;
	}

	public static CorporationTeamSoap[] toSoapModels(CorporationTeam[] models) {
		CorporationTeamSoap[] soapModels = new CorporationTeamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CorporationTeamSoap[][] toSoapModels(
		CorporationTeam[][] models) {
		CorporationTeamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CorporationTeamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CorporationTeamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CorporationTeamSoap[] toSoapModels(
		List<CorporationTeam> models) {
		List<CorporationTeamSoap> soapModels = new ArrayList<CorporationTeamSoap>(models.size());

		for (CorporationTeam model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CorporationTeamSoap[soapModels.size()]);
	}

	public CorporationTeamSoap() {
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

	public String getTeamName() {
		return _teamName;
	}

	public void setTeamName(String teamName) {
		_teamName = teamName;
	}

	public int getMarkUpDelete() {
		return _markUpDelete;
	}

	public void setMarkUpDelete(int markUpDelete) {
		_markUpDelete = markUpDelete;
	}

	private long _id;
	private String _corporationId;
	private String _teamName;
	private int _markUpDelete;
}