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
public class AswmsgWebserviceSoap implements Serializable {
	public static AswmsgWebserviceSoap toSoapModel(AswmsgWebservice model) {
		AswmsgWebserviceSoap soapModel = new AswmsgWebserviceSoap();

		soapModel.setId(model.getId());
		soapModel.setServiceCode(model.getServiceCode());
		soapModel.setServiceName(model.getServiceName());
		soapModel.setServiceURL(model.getServiceURL());
		soapModel.setUserName(model.getUserName());
		soapModel.setPassword(model.getPassword());
		soapModel.setDomain(model.getDomain());

		return soapModel;
	}

	public static AswmsgWebserviceSoap[] toSoapModels(AswmsgWebservice[] models) {
		AswmsgWebserviceSoap[] soapModels = new AswmsgWebserviceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AswmsgWebserviceSoap[][] toSoapModels(
		AswmsgWebservice[][] models) {
		AswmsgWebserviceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AswmsgWebserviceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AswmsgWebserviceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AswmsgWebserviceSoap[] toSoapModels(
		List<AswmsgWebservice> models) {
		List<AswmsgWebserviceSoap> soapModels = new ArrayList<AswmsgWebserviceSoap>(models.size());

		for (AswmsgWebservice model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AswmsgWebserviceSoap[soapModels.size()]);
	}

	public AswmsgWebserviceSoap() {
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

	public String getServiceCode() {
		return _ServiceCode;
	}

	public void setServiceCode(String ServiceCode) {
		_ServiceCode = ServiceCode;
	}

	public String getServiceName() {
		return _ServiceName;
	}

	public void setServiceName(String ServiceName) {
		_ServiceName = ServiceName;
	}

	public String getServiceURL() {
		return _ServiceURL;
	}

	public void setServiceURL(String ServiceURL) {
		_ServiceURL = ServiceURL;
	}

	public String getUserName() {
		return _UserName;
	}

	public void setUserName(String UserName) {
		_UserName = UserName;
	}

	public String getPassword() {
		return _Password;
	}

	public void setPassword(String Password) {
		_Password = Password;
	}

	public String getDomain() {
		return _Domain;
	}

	public void setDomain(String Domain) {
		_Domain = Domain;
	}

	private long _Id;
	private String _ServiceCode;
	private String _ServiceName;
	private String _ServiceURL;
	private String _UserName;
	private String _Password;
	private String _Domain;
}