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

package vn.dtt.gt.dk.dao.api.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.api.service.http.ApiServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.api.service.http.ApiServiceSoap
 * @generated
 */
public class ApiSoap implements Serializable {
	public static ApiSoap toSoapModel(Api model) {
		ApiSoap soapModel = new ApiSoap();

		soapModel.setId(model.getId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserAgent(model.getUserAgent());
		soapModel.setIp(model.getIp());
		soapModel.setCode(model.getCode());
		soapModel.setRegisteredNumber(model.getRegisteredNumber());
		soapModel.setRequest(model.getRequest());
		soapModel.setResponse(model.getResponse());

		return soapModel;
	}

	public static ApiSoap[] toSoapModels(Api[] models) {
		ApiSoap[] soapModels = new ApiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApiSoap[][] toSoapModels(Api[][] models) {
		ApiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApiSoap[] toSoapModels(List<Api> models) {
		List<ApiSoap> soapModels = new ArrayList<ApiSoap>(models.size());

		for (Api model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApiSoap[soapModels.size()]);
	}

	public ApiSoap() {
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

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getUserAgent() {
		return _userAgent;
	}

	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;
	}

	public String getIp() {
		return _ip;
	}

	public void setIp(String ip) {
		_ip = ip;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;
	}

	public String getRequest() {
		return _request;
	}

	public void setRequest(String request) {
		_request = request;
	}

	public String getResponse() {
		return _response;
	}

	public void setResponse(String response) {
		_response = response;
	}

	private long _id;
	private Date _createDate;
	private Date _modifiedDate;
	private String _userAgent;
	private String _ip;
	private String _code;
	private String _registeredNumber;
	private String _request;
	private String _response;
}