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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.common.service.http.DmDataItemServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.http.DmDataItemServiceSoap
 * @generated
 */
public class DmDataItemSoap implements Serializable {
	public static DmDataItemSoap toSoapModel(DmDataItem model) {
		DmDataItemSoap soapModel = new DmDataItemSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupId(model.getDataGroupId());
		soapModel.setCode0(model.getCode0());
		soapModel.setCode1(model.getCode1());
		soapModel.setCode2(model.getCode2());
		soapModel.setCode3(model.getCode3());
		soapModel.setLevel(model.getLevel());
		soapModel.setName(model.getName());
		soapModel.setAlterName(model.getAlterName());
		soapModel.setDescription(model.getDescription());
		soapModel.setValidatedFrom(model.getValidatedFrom());
		soapModel.setValidatedTo(model.getValidatedTo());
		soapModel.setStatus(model.getStatus());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static DmDataItemSoap[] toSoapModels(DmDataItem[] models) {
		DmDataItemSoap[] soapModels = new DmDataItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmDataItemSoap[][] toSoapModels(DmDataItem[][] models) {
		DmDataItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmDataItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmDataItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmDataItemSoap[] toSoapModels(List<DmDataItem> models) {
		List<DmDataItemSoap> soapModels = new ArrayList<DmDataItemSoap>(models.size());

		for (DmDataItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmDataItemSoap[soapModels.size()]);
	}

	public DmDataItemSoap() {
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

	public String getCode0() {
		return _Code0;
	}

	public void setCode0(String Code0) {
		_Code0 = Code0;
	}

	public String getCode1() {
		return _Code1;
	}

	public void setCode1(String Code1) {
		_Code1 = Code1;
	}

	public String getCode2() {
		return _Code2;
	}

	public void setCode2(String Code2) {
		_Code2 = Code2;
	}

	public String getCode3() {
		return _Code3;
	}

	public void setCode3(String Code3) {
		_Code3 = Code3;
	}

	public int getLevel() {
		return _Level;
	}

	public void setLevel(int Level) {
		_Level = Level;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getAlterName() {
		return _AlterName;
	}

	public void setAlterName(String AlterName) {
		_AlterName = AlterName;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public Date getValidatedFrom() {
		return _ValidatedFrom;
	}

	public void setValidatedFrom(Date ValidatedFrom) {
		_ValidatedFrom = ValidatedFrom;
	}

	public Date getValidatedTo() {
		return _ValidatedTo;
	}

	public void setValidatedTo(Date ValidatedTo) {
		_ValidatedTo = ValidatedTo;
	}

	public int getStatus() {
		return _Status;
	}

	public void setStatus(int Status) {
		_Status = Status;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _Id;
	private long _DataGroupId;
	private String _Code0;
	private String _Code1;
	private String _Code2;
	private String _Code3;
	private int _Level;
	private String _Name;
	private String _AlterName;
	private String _Description;
	private Date _ValidatedFrom;
	private Date _ValidatedTo;
	private int _Status;
	private Date _synchdate;
}