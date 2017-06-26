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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationInspectorServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CorporationInspectorServiceSoap
 * @generated
 */
public class CorporationInspectorSoap implements Serializable {
	public static CorporationInspectorSoap toSoapModel(
		CorporationInspector model) {
		CorporationInspectorSoap soapModel = new CorporationInspectorSoap();

		soapModel.setId(model.getId());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorid(model.getInspectorid());
		soapModel.setInspectorName(model.getInspectorName());
		soapModel.setInspectorPhone(model.getInspectorPhone());
		soapModel.setInspectorEmail(model.getInspectorEmail());
		soapModel.setContactcode(model.getContactcode());
		soapModel.setTeamId(model.getTeamId());
		soapModel.setMarkupTeamLeader(model.getMarkupTeamLeader());
		soapModel.setMarkUpBoss(model.getMarkUpBoss());
		soapModel.setPlace(model.getPlace());
		soapModel.setTitle(model.getTitle());
		soapModel.setFilechukyId(model.getFilechukyId());

		return soapModel;
	}

	public static CorporationInspectorSoap[] toSoapModels(
		CorporationInspector[] models) {
		CorporationInspectorSoap[] soapModels = new CorporationInspectorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CorporationInspectorSoap[][] toSoapModels(
		CorporationInspector[][] models) {
		CorporationInspectorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CorporationInspectorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CorporationInspectorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CorporationInspectorSoap[] toSoapModels(
		List<CorporationInspector> models) {
		List<CorporationInspectorSoap> soapModels = new ArrayList<CorporationInspectorSoap>(models.size());

		for (CorporationInspector model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CorporationInspectorSoap[soapModels.size()]);
	}

	public CorporationInspectorSoap() {
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

	public String getInspectorPhone() {
		return _inspectorPhone;
	}

	public void setInspectorPhone(String inspectorPhone) {
		_inspectorPhone = inspectorPhone;
	}

	public String getInspectorEmail() {
		return _inspectorEmail;
	}

	public void setInspectorEmail(String inspectorEmail) {
		_inspectorEmail = inspectorEmail;
	}

	public String getContactcode() {
		return _contactcode;
	}

	public void setContactcode(String contactcode) {
		_contactcode = contactcode;
	}

	public long getTeamId() {
		return _teamId;
	}

	public void setTeamId(long teamId) {
		_teamId = teamId;
	}

	public int getMarkupTeamLeader() {
		return _markupTeamLeader;
	}

	public void setMarkupTeamLeader(int markupTeamLeader) {
		_markupTeamLeader = markupTeamLeader;
	}

	public int getMarkUpBoss() {
		return _markUpBoss;
	}

	public void setMarkUpBoss(int markUpBoss) {
		_markUpBoss = markUpBoss;
	}

	public String getPlace() {
		return _place;
	}

	public void setPlace(String place) {
		_place = place;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public long getFilechukyId() {
		return _filechukyId;
	}

	public void setFilechukyId(long filechukyId) {
		_filechukyId = filechukyId;
	}

	private long _id;
	private String _corporationId;
	private long _inspectorid;
	private String _inspectorName;
	private String _inspectorPhone;
	private String _inspectorEmail;
	private String _contactcode;
	private long _teamId;
	private int _markupTeamLeader;
	private int _markUpBoss;
	private String _place;
	private String _title;
	private long _filechukyId;
}