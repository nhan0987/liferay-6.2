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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionRecordAttachServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionRecordAttachServiceSoap
 * @generated
 */
public class InspectionRecordAttachSoap implements Serializable {
	public static InspectionRecordAttachSoap toSoapModel(
		InspectionRecordAttach model) {
		InspectionRecordAttachSoap soapModel = new InspectionRecordAttachSoap();

		soapModel.setId(model.getId());
		soapModel.setInspectionRecordId(model.getInspectionRecordId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setEnTryId(model.getEnTryId());
		soapModel.setEnTryName(model.getEnTryName());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setUploadTime(model.getUploadTime());
		soapModel.setMarkUpDelte(model.getMarkUpDelte());

		return soapModel;
	}

	public static InspectionRecordAttachSoap[] toSoapModels(
		InspectionRecordAttach[] models) {
		InspectionRecordAttachSoap[] soapModels = new InspectionRecordAttachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InspectionRecordAttachSoap[][] toSoapModels(
		InspectionRecordAttach[][] models) {
		InspectionRecordAttachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InspectionRecordAttachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InspectionRecordAttachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InspectionRecordAttachSoap[] toSoapModels(
		List<InspectionRecordAttach> models) {
		List<InspectionRecordAttachSoap> soapModels = new ArrayList<InspectionRecordAttachSoap>(models.size());

		for (InspectionRecordAttach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InspectionRecordAttachSoap[soapModels.size()]);
	}

	public InspectionRecordAttachSoap() {
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

	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getEnTryId() {
		return _enTryId;
	}

	public void setEnTryId(long enTryId) {
		_enTryId = enTryId;
	}

	public String getEnTryName() {
		return _enTryName;
	}

	public void setEnTryName(String enTryName) {
		_enTryName = enTryName;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public Date getUploadTime() {
		return _uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		_uploadTime = uploadTime;
	}

	public int getMarkUpDelte() {
		return _markUpDelte;
	}

	public void setMarkUpDelte(int markUpDelte) {
		_markUpDelte = markUpDelte;
	}

	private long _id;
	private long _inspectionRecordId;
	private long _hoSoThuTucId;
	private long _enTryId;
	private String _enTryName;
	private long _inspectorId;
	private Date _uploadTime;
	private int _markUpDelte;
}