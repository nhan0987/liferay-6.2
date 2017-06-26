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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.ProductionCountryServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.ProductionCountryServiceSoap
 * @generated
 */
public class ProductionCountrySoap implements Serializable {
	public static ProductionCountrySoap toSoapModel(ProductionCountry model) {
		ProductionCountrySoap soapModel = new ProductionCountrySoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setCountryCode(model.getCountryCode());
		soapModel.setSynchDate(model.getSynchDate());

		return soapModel;
	}

	public static ProductionCountrySoap[] toSoapModels(
		ProductionCountry[] models) {
		ProductionCountrySoap[] soapModels = new ProductionCountrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProductionCountrySoap[][] toSoapModels(
		ProductionCountry[][] models) {
		ProductionCountrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProductionCountrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProductionCountrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProductionCountrySoap[] toSoapModels(
		List<ProductionCountry> models) {
		List<ProductionCountrySoap> soapModels = new ArrayList<ProductionCountrySoap>(models.size());

		for (ProductionCountry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProductionCountrySoap[soapModels.size()]);
	}

	public ProductionCountrySoap() {
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

	public String getCountryCode() {
		return _countryCode;
	}

	public void setCountryCode(String countryCode) {
		_countryCode = countryCode;
	}

	public Date getSynchDate() {
		return _SynchDate;
	}

	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;
	}

	private long _id;
	private long _vehicleGroupId;
	private String _countryCode;
	private Date _SynchDate;
}