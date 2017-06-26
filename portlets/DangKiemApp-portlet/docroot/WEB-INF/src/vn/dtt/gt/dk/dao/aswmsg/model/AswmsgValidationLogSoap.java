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

package vn.dtt.gt.dk.dao.aswmsg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class AswmsgValidationLogSoap implements Serializable {
	public static AswmsgValidationLogSoap toSoapModel(AswmsgValidationLog model) {
		AswmsgValidationLogSoap soapModel = new AswmsgValidationLogSoap();

		soapModel.setId(model.getId());
		soapModel.setMessageLogId(model.getMessageLogId());
		soapModel.setTagName(model.getTagName());
		soapModel.setValidationCode(model.getValidationCode());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static AswmsgValidationLogSoap[] toSoapModels(
		AswmsgValidationLog[] models) {
		AswmsgValidationLogSoap[] soapModels = new AswmsgValidationLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AswmsgValidationLogSoap[][] toSoapModels(
		AswmsgValidationLog[][] models) {
		AswmsgValidationLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AswmsgValidationLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AswmsgValidationLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AswmsgValidationLogSoap[] toSoapModels(
		List<AswmsgValidationLog> models) {
		List<AswmsgValidationLogSoap> soapModels = new ArrayList<AswmsgValidationLogSoap>(models.size());

		for (AswmsgValidationLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AswmsgValidationLogSoap[soapModels.size()]);
	}

	public AswmsgValidationLogSoap() {
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

	public long getMessageLogId() {
		return _MessageLogId;
	}

	public void setMessageLogId(long MessageLogId) {
		_MessageLogId = MessageLogId;
	}

	public String getTagName() {
		return _TagName;
	}

	public void setTagName(String TagName) {
		_TagName = TagName;
	}

	public String getValidationCode() {
		return _ValidationCode;
	}

	public void setValidationCode(String ValidationCode) {
		_ValidationCode = ValidationCode;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	private long _Id;
	private long _MessageLogId;
	private String _TagName;
	private String _ValidationCode;
	private String _Description;
}