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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleGroupSpecServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleGroupSpecServiceSoap
 * @generated
 */
public class VehicleGroupSpecSoap implements Serializable {
	public static VehicleGroupSpecSoap toSoapModel(VehicleGroupSpec model) {
		VehicleGroupSpecSoap soapModel = new VehicleGroupSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationValue(model.getSpecificationValue());

		return soapModel;
	}

	public static VehicleGroupSpecSoap[] toSoapModels(VehicleGroupSpec[] models) {
		VehicleGroupSpecSoap[] soapModels = new VehicleGroupSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VehicleGroupSpecSoap[][] toSoapModels(
		VehicleGroupSpec[][] models) {
		VehicleGroupSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VehicleGroupSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VehicleGroupSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VehicleGroupSpecSoap[] toSoapModels(
		List<VehicleGroupSpec> models) {
		List<VehicleGroupSpecSoap> soapModels = new ArrayList<VehicleGroupSpecSoap>(models.size());

		for (VehicleGroupSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VehicleGroupSpecSoap[soapModels.size()]);
	}

	public VehicleGroupSpecSoap() {
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

	private long _id;
	private long _vehicleGroupId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
}