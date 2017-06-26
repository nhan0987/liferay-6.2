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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CfgTechnicalspecServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CfgTechnicalspecServiceSoap
 * @generated
 */
public class CfgTechnicalspecSoap implements Serializable {
	public static CfgTechnicalspecSoap toSoapModel(CfgTechnicalspec model) {
		CfgTechnicalspecSoap soapModel = new CfgTechnicalspecSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleTypeCode(model.getVehicleTypeCode());
		soapModel.setVehicleTypeName(model.getVehicleTypeName());
		soapModel.setSequenceno(model.getSequenceno());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecDescription(model.getSpecDescription());
		soapModel.setSpecCategory(model.getSpecCategory());
		soapModel.setSpecificationGroup(model.getSpecificationGroup());
		soapModel.setSearchingIncluded(model.getSearchingIncluded());
		soapModel.setReferenceIncluded(model.getReferenceIncluded());
		soapModel.setCertificateIncluded(model.getCertificateIncluded());
		soapModel.setDatagroupid(model.getDatagroupid());

		return soapModel;
	}

	public static CfgTechnicalspecSoap[] toSoapModels(CfgTechnicalspec[] models) {
		CfgTechnicalspecSoap[] soapModels = new CfgTechnicalspecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CfgTechnicalspecSoap[][] toSoapModels(
		CfgTechnicalspec[][] models) {
		CfgTechnicalspecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CfgTechnicalspecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CfgTechnicalspecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CfgTechnicalspecSoap[] toSoapModels(
		List<CfgTechnicalspec> models) {
		List<CfgTechnicalspecSoap> soapModels = new ArrayList<CfgTechnicalspecSoap>(models.size());

		for (CfgTechnicalspec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CfgTechnicalspecSoap[soapModels.size()]);
	}

	public CfgTechnicalspecSoap() {
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

	public String getVehicleTypeCode() {
		return _vehicleTypeCode;
	}

	public void setVehicleTypeCode(String vehicleTypeCode) {
		_vehicleTypeCode = vehicleTypeCode;
	}

	public String getVehicleTypeName() {
		return _vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		_vehicleTypeName = vehicleTypeName;
	}

	public long getSequenceno() {
		return _sequenceno;
	}

	public void setSequenceno(long sequenceno) {
		_sequenceno = sequenceno;
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

	public String getSpecDescription() {
		return _specDescription;
	}

	public void setSpecDescription(String specDescription) {
		_specDescription = specDescription;
	}

	public String getSpecCategory() {
		return _specCategory;
	}

	public void setSpecCategory(String specCategory) {
		_specCategory = specCategory;
	}

	public long getSpecificationGroup() {
		return _specificationGroup;
	}

	public void setSpecificationGroup(long specificationGroup) {
		_specificationGroup = specificationGroup;
	}

	public long getSearchingIncluded() {
		return _searchingIncluded;
	}

	public void setSearchingIncluded(long searchingIncluded) {
		_searchingIncluded = searchingIncluded;
	}

	public long getReferenceIncluded() {
		return _referenceIncluded;
	}

	public void setReferenceIncluded(long referenceIncluded) {
		_referenceIncluded = referenceIncluded;
	}

	public long getCertificateIncluded() {
		return _certificateIncluded;
	}

	public void setCertificateIncluded(long certificateIncluded) {
		_certificateIncluded = certificateIncluded;
	}

	public long getDatagroupid() {
		return _datagroupid;
	}

	public void setDatagroupid(long datagroupid) {
		_datagroupid = datagroupid;
	}

	private long _id;
	private String _vehicleTypeCode;
	private String _vehicleTypeName;
	private long _sequenceno;
	private String _specificationCode;
	private String _specificationName;
	private String _specDescription;
	private String _specCategory;
	private long _specificationGroup;
	private long _searchingIncluded;
	private long _referenceIncluded;
	private long _certificateIncluded;
	private long _datagroupid;
}