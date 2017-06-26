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
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class DmDataVersionSoap implements Serializable {
	public static DmDataVersionSoap toSoapModel(DmDataVersion model) {
		DmDataVersionSoap soapModel = new DmDataVersionSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupId(model.getDataGroupId());
		soapModel.setVersion(model.getVersion());
		soapModel.setIssuedTime(model.getIssuedTime());
		soapModel.setValidateDFrom(model.getValidateDFrom());
		soapModel.setValidatedTo(model.getValidatedTo());

		return soapModel;
	}

	public static DmDataVersionSoap[] toSoapModels(DmDataVersion[] models) {
		DmDataVersionSoap[] soapModels = new DmDataVersionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmDataVersionSoap[][] toSoapModels(DmDataVersion[][] models) {
		DmDataVersionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmDataVersionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmDataVersionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmDataVersionSoap[] toSoapModels(List<DmDataVersion> models) {
		List<DmDataVersionSoap> soapModels = new ArrayList<DmDataVersionSoap>(models.size());

		for (DmDataVersion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmDataVersionSoap[soapModels.size()]);
	}

	public DmDataVersionSoap() {
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

	public long getDataGroupId() {
		return _DataGroupId;
	}

	public void setDataGroupId(long DataGroupId) {
		_DataGroupId = DataGroupId;
	}

	public String getVersion() {
		return _Version;
	}

	public void setVersion(String Version) {
		_Version = Version;
	}

	public Date getIssuedTime() {
		return _IssuedTime;
	}

	public void setIssuedTime(Date IssuedTime) {
		_IssuedTime = IssuedTime;
	}

	public Date getValidateDFrom() {
		return _ValidateDFrom;
	}

	public void setValidateDFrom(Date ValidateDFrom) {
		_ValidateDFrom = ValidateDFrom;
	}

	public Date getValidatedTo() {
		return _ValidatedTo;
	}

	public void setValidatedTo(Date ValidatedTo) {
		_ValidatedTo = ValidatedTo;
	}

	private long _Id;
	private long _DataGroupId;
	private String _Version;
	private Date _IssuedTime;
	private Date _ValidateDFrom;
	private Date _ValidatedTo;
}