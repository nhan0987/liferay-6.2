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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CfgLimitTechnicalSpecServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CfgLimitTechnicalSpecServiceSoap
 * @generated
 */
public class CfgLimitTechnicalSpecSoap implements Serializable {
	public static CfgLimitTechnicalSpecSoap toSoapModel(
		CfgLimitTechnicalSpec model) {
		CfgLimitTechnicalSpecSoap soapModel = new CfgLimitTechnicalSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicletypecode(model.getVehicletypecode());
		soapModel.setVehicletypename(model.getVehicletypename());
		soapModel.setReference_code_3(model.getReference_code_3());
		soapModel.setReference_name(model.getReference_name());
		soapModel.setSearching_drive_config(model.getSearching_drive_config());
		soapModel.setAltername(model.getAltername());
		soapModel.setSequenceno(model.getSequenceno());
		soapModel.setSpecificationcode(model.getSpecificationcode());
		soapModel.setSpecificationname(model.getSpecificationname());
		soapModel.setSpec_description(model.getSpec_description());
		soapModel.setSpec_category(model.getSpec_category());
		soapModel.setDatagroupid(model.getDatagroupid());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static CfgLimitTechnicalSpecSoap[] toSoapModels(
		CfgLimitTechnicalSpec[] models) {
		CfgLimitTechnicalSpecSoap[] soapModels = new CfgLimitTechnicalSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CfgLimitTechnicalSpecSoap[][] toSoapModels(
		CfgLimitTechnicalSpec[][] models) {
		CfgLimitTechnicalSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CfgLimitTechnicalSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CfgLimitTechnicalSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CfgLimitTechnicalSpecSoap[] toSoapModels(
		List<CfgLimitTechnicalSpec> models) {
		List<CfgLimitTechnicalSpecSoap> soapModels = new ArrayList<CfgLimitTechnicalSpecSoap>(models.size());

		for (CfgLimitTechnicalSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CfgLimitTechnicalSpecSoap[soapModels.size()]);
	}

	public CfgLimitTechnicalSpecSoap() {
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

	public String getVehicletypecode() {
		return _vehicletypecode;
	}

	public void setVehicletypecode(String vehicletypecode) {
		_vehicletypecode = vehicletypecode;
	}

	public String getVehicletypename() {
		return _vehicletypename;
	}

	public void setVehicletypename(String vehicletypename) {
		_vehicletypename = vehicletypename;
	}

	public String getReference_code_3() {
		return _reference_code_3;
	}

	public void setReference_code_3(String reference_code_3) {
		_reference_code_3 = reference_code_3;
	}

	public String getReference_name() {
		return _reference_name;
	}

	public void setReference_name(String reference_name) {
		_reference_name = reference_name;
	}

	public int getSearching_drive_config() {
		return _searching_drive_config;
	}

	public void setSearching_drive_config(int searching_drive_config) {
		_searching_drive_config = searching_drive_config;
	}

	public String getAltername() {
		return _altername;
	}

	public void setAltername(String altername) {
		_altername = altername;
	}

	public int getSequenceno() {
		return _sequenceno;
	}

	public void setSequenceno(int sequenceno) {
		_sequenceno = sequenceno;
	}

	public String getSpecificationcode() {
		return _specificationcode;
	}

	public void setSpecificationcode(String specificationcode) {
		_specificationcode = specificationcode;
	}

	public String getSpecificationname() {
		return _specificationname;
	}

	public void setSpecificationname(String specificationname) {
		_specificationname = specificationname;
	}

	public String getSpec_description() {
		return _spec_description;
	}

	public void setSpec_description(String spec_description) {
		_spec_description = spec_description;
	}

	public String getSpec_category() {
		return _spec_category;
	}

	public void setSpec_category(String spec_category) {
		_spec_category = spec_category;
	}

	public long getDatagroupid() {
		return _datagroupid;
	}

	public void setDatagroupid(long datagroupid) {
		_datagroupid = datagroupid;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private String _vehicletypecode;
	private String _vehicletypename;
	private String _reference_code_3;
	private String _reference_name;
	private int _searching_drive_config;
	private String _altername;
	private int _sequenceno;
	private String _specificationcode;
	private String _specificationname;
	private String _spec_description;
	private String _spec_category;
	private long _datagroupid;
	private Date _synchdate;
}