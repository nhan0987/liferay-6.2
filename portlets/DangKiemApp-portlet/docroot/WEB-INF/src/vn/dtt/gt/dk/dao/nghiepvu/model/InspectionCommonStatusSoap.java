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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionCommonStatusServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionCommonStatusServiceSoap
 * @generated
 */
public class InspectionCommonStatusSoap implements Serializable {
	public static InspectionCommonStatusSoap toSoapModel(
		InspectionCommonStatus model) {
		InspectionCommonStatusSoap soapModel = new InspectionCommonStatusSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setType(model.getType());
		soapModel.setGroupName(model.getGroupName());
		soapModel.setItemName(model.getItemName());
		soapModel.setCommonStatus(model.getCommonStatus());
		soapModel.setInspectionRecordId(model.getInspectionRecordId());
		soapModel.setCommonCode(model.getCommonCode());
		soapModel.setAllowEdit(model.getAllowEdit());

		return soapModel;
	}

	public static InspectionCommonStatusSoap[] toSoapModels(
		InspectionCommonStatus[] models) {
		InspectionCommonStatusSoap[] soapModels = new InspectionCommonStatusSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InspectionCommonStatusSoap[][] toSoapModels(
		InspectionCommonStatus[][] models) {
		InspectionCommonStatusSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InspectionCommonStatusSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InspectionCommonStatusSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InspectionCommonStatusSoap[] toSoapModels(
		List<InspectionCommonStatus> models) {
		List<InspectionCommonStatusSoap> soapModels = new ArrayList<InspectionCommonStatusSoap>(models.size());

		for (InspectionCommonStatus model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InspectionCommonStatusSoap[soapModels.size()]);
	}

	public InspectionCommonStatusSoap() {
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

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public long getType() {
		return _type;
	}

	public void setType(long type) {
		_type = type;
	}

	public String getGroupName() {
		return _groupName;
	}

	public void setGroupName(String groupName) {
		_groupName = groupName;
	}

	public String getItemName() {
		return _itemName;
	}

	public void setItemName(String itemName) {
		_itemName = itemName;
	}

	public long getCommonStatus() {
		return _commonStatus;
	}

	public void setCommonStatus(long commonStatus) {
		_commonStatus = commonStatus;
	}

	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	public String getCommonCode() {
		return _commonCode;
	}

	public void setCommonCode(String commonCode) {
		_commonCode = commonCode;
	}

	public int getAllowEdit() {
		return _allowEdit;
	}

	public void setAllowEdit(int allowEdit) {
		_allowEdit = allowEdit;
	}

	private long _id;
	private String _vehicleClass;
	private long _sequenceNo;
	private long _type;
	private String _groupName;
	private String _itemName;
	private long _commonStatus;
	private long _inspectionRecordId;
	private String _commonCode;
	private int _allowEdit;
}