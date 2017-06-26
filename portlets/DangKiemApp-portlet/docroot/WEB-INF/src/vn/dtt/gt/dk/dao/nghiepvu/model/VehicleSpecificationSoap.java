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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleSpecificationServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleSpecificationServiceSoap
 * @generated
 */
public class VehicleSpecificationSoap implements Serializable {
	public static VehicleSpecificationSoap toSoapModel(
		VehicleSpecification model) {
		VehicleSpecificationSoap soapModel = new VehicleSpecificationSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSpecificationVersion(model.getSpecificationVersion());
		soapModel.setSpecificationSourceCode(model.getSpecificationSourceCode());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationValue(model.getSpecificationValue());
		soapModel.setSafetyTestReportId(model.getSafetyTestReportId());
		soapModel.setInspectionRecordId(model.getInspectionRecordId());
		soapModel.setSpecificResult(model.getSpecificResult());

		return soapModel;
	}

	public static VehicleSpecificationSoap[] toSoapModels(
		VehicleSpecification[] models) {
		VehicleSpecificationSoap[] soapModels = new VehicleSpecificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VehicleSpecificationSoap[][] toSoapModels(
		VehicleSpecification[][] models) {
		VehicleSpecificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VehicleSpecificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VehicleSpecificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VehicleSpecificationSoap[] toSoapModels(
		List<VehicleSpecification> models) {
		List<VehicleSpecificationSoap> soapModels = new ArrayList<VehicleSpecificationSoap>(models.size());

		for (VehicleSpecification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VehicleSpecificationSoap[soapModels.size()]);
	}

	public VehicleSpecificationSoap() {
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

	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;
	}

	public long getSpecificationVersion() {
		return _specificationVersion;
	}

	public void setSpecificationVersion(long specificationVersion) {
		_specificationVersion = specificationVersion;
	}

	public String getSpecificationSourceCode() {
		return _specificationSourceCode;
	}

	public void setSpecificationSourceCode(String specificationSourceCode) {
		_specificationSourceCode = specificationSourceCode;
	}

	public String getSpecificationCode() {
		return _specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		_specificationCode = specificationCode;
	}

	public String getSpecificationName() {
		return _specificationName;
	}

	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;
	}

	public String getSpecificationValue() {
		return _specificationValue;
	}

	public void setSpecificationValue(String specificationValue) {
		_specificationValue = specificationValue;
	}

	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	public void setSafetyTestReportId(long safetyTestReportId) {
		_safetyTestReportId = safetyTestReportId;
	}

	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	public long getSpecificResult() {
		return _specificResult;
	}

	public void setSpecificResult(long specificResult) {
		_specificResult = specificResult;
	}

	private long _id;
	private long _vehicleGroupId;
	private long _specificationVersion;
	private String _specificationSourceCode;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _safetyTestReportId;
	private long _inspectionRecordId;
	private long _specificResult;
}