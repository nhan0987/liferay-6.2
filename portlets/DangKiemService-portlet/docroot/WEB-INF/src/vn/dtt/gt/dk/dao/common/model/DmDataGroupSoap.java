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

package vn.dtt.gt.dk.dao.common.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.common.service.http.DmDataGroupServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.http.DmDataGroupServiceSoap
 * @generated
 */
public class DmDataGroupSoap implements Serializable {
	public static DmDataGroupSoap toSoapModel(DmDataGroup model) {
		DmDataGroupSoap soapModel = new DmDataGroupSoap();

		soapModel.setId(model.getId());
		soapModel.setCode(model.getCode());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static DmDataGroupSoap[] toSoapModels(DmDataGroup[] models) {
		DmDataGroupSoap[] soapModels = new DmDataGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmDataGroupSoap[][] toSoapModels(DmDataGroup[][] models) {
		DmDataGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmDataGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmDataGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmDataGroupSoap[] toSoapModels(List<DmDataGroup> models) {
		List<DmDataGroupSoap> soapModels = new ArrayList<DmDataGroupSoap>(models.size());

		for (DmDataGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmDataGroupSoap[soapModels.size()]);
	}

	public DmDataGroupSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getCode() {
		return _Code;
	}

	public void setCode(String Code) {
		_Code = Code;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _Id;
	private String _Code;
	private String _Name;
	private String _Description;
	private Date _synchdate;
}