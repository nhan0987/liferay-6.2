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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.ActionLogServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.ActionLogServiceSoap
 * @generated
 */
public class ActionLogSoap implements Serializable {
	public static ActionLogSoap toSoapModel(ActionLog model) {
		ActionLogSoap soapModel = new ActionLogSoap();

		soapModel.setId(model.getId());
		soapModel.setHosothutucid(model.getHosothutucid());
		soapModel.setMasohoso(model.getMasohoso());
		soapModel.setMabiennhan(model.getMabiennhan());
		soapModel.setNgayxemhoso(model.getNgayxemhoso());
		soapModel.setNoidungmanhinh(model.getNoidungmanhinh());
		soapModel.setImportername(model.getImportername());
		soapModel.setCorporationid(model.getCorporationid());
		soapModel.setInspectorid(model.getInspectorid());
		soapModel.setInspectorname(model.getInspectorname());
		soapModel.setInspectorphone(model.getInspectorphone());
		soapModel.setInspectoremail(model.getInspectoremail());
		soapModel.setTitle(model.getTitle());
		soapModel.setContactcode(model.getContactcode());

		return soapModel;
	}

	public static ActionLogSoap[] toSoapModels(ActionLog[] models) {
		ActionLogSoap[] soapModels = new ActionLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActionLogSoap[][] toSoapModels(ActionLog[][] models) {
		ActionLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActionLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActionLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActionLogSoap[] toSoapModels(List<ActionLog> models) {
		List<ActionLogSoap> soapModels = new ArrayList<ActionLogSoap>(models.size());

		for (ActionLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActionLogSoap[soapModels.size()]);
	}

	public ActionLogSoap() {
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

	public long getHosothutucid() {
		return _hosothutucid;
	}

	public void setHosothutucid(long hosothutucid) {
		_hosothutucid = hosothutucid;
	}

	public String getMasohoso() {
		return _masohoso;
	}

	public void setMasohoso(String masohoso) {
		_masohoso = masohoso;
	}

	public String getMabiennhan() {
		return _mabiennhan;
	}

	public void setMabiennhan(String mabiennhan) {
		_mabiennhan = mabiennhan;
	}

	public Date getNgayxemhoso() {
		return _ngayxemhoso;
	}

	public void setNgayxemhoso(Date ngayxemhoso) {
		_ngayxemhoso = ngayxemhoso;
	}

	public String getNoidungmanhinh() {
		return _noidungmanhinh;
	}

	public void setNoidungmanhinh(String noidungmanhinh) {
		_noidungmanhinh = noidungmanhinh;
	}

	public String getImportername() {
		return _importername;
	}

	public void setImportername(String importername) {
		_importername = importername;
	}

	public String getCorporationid() {
		return _corporationid;
	}

	public void setCorporationid(String corporationid) {
		_corporationid = corporationid;
	}

	public long getInspectorid() {
		return _inspectorid;
	}

	public void setInspectorid(long inspectorid) {
		_inspectorid = inspectorid;
	}

	public String getInspectorname() {
		return _inspectorname;
	}

	public void setInspectorname(String inspectorname) {
		_inspectorname = inspectorname;
	}

	public String getInspectorphone() {
		return _inspectorphone;
	}

	public void setInspectorphone(String inspectorphone) {
		_inspectorphone = inspectorphone;
	}

	public String getInspectoremail() {
		return _inspectoremail;
	}

	public void setInspectoremail(String inspectoremail) {
		_inspectoremail = inspectoremail;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getContactcode() {
		return _contactcode;
	}

	public void setContactcode(String contactcode) {
		_contactcode = contactcode;
	}

	private long _id;
	private long _hosothutucid;
	private String _masohoso;
	private String _mabiennhan;
	private Date _ngayxemhoso;
	private String _noidungmanhinh;
	private String _importername;
	private String _corporationid;
	private long _inspectorid;
	private String _inspectorname;
	private String _inspectorphone;
	private String _inspectoremail;
	private String _title;
	private String _contactcode;
}