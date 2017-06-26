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

package vn.dtt.gt.dk.dao.motcua.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
public class MotCuaNotificationSoap implements Serializable {
	public static MotCuaNotificationSoap toSoapModel(MotCuaNotification model) {
		MotCuaNotificationSoap soapModel = new MotCuaNotificationSoap();

		soapModel.setId(model.getId());
		soapModel.setDossierid(model.getDossierid());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setDivision(model.getDivision());
		soapModel.setOfficerName(model.getOfficerName());
		soapModel.setMessageID(model.getMessageID());
		soapModel.setMessageType(model.getMessageType());
		soapModel.setPhieuxulyphuId(model.getPhieuxulyphuId());
		soapModel.setResponse(model.getResponse());
		soapModel.setResponseTime(model.getResponseTime());
		soapModel.setRequestContent(model.getRequestContent());
		soapModel.setRequestTime(model.getRequestTime());
		soapModel.setRequestSender(model.getRequestSender());
		soapModel.setIsReply(model.getIsReply());

		return soapModel;
	}

	public static MotCuaNotificationSoap[] toSoapModels(
		MotCuaNotification[] models) {
		MotCuaNotificationSoap[] soapModels = new MotCuaNotificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaNotificationSoap[][] toSoapModels(
		MotCuaNotification[][] models) {
		MotCuaNotificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaNotificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaNotificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaNotificationSoap[] toSoapModels(
		List<MotCuaNotification> models) {
		List<MotCuaNotificationSoap> soapModels = new ArrayList<MotCuaNotificationSoap>(models.size());

		for (MotCuaNotification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaNotificationSoap[soapModels.size()]);
	}

	public MotCuaNotificationSoap() {
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

	public long getDossierid() {
		return _dossierid;
	}

	public void setDossierid(long dossierid) {
		_dossierid = dossierid;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public String getOfficerName() {
		return _officerName;
	}

	public void setOfficerName(String officerName) {
		_officerName = officerName;
	}

	public String getMessageID() {
		return _messageID;
	}

	public void setMessageID(String messageID) {
		_messageID = messageID;
	}

	public long getMessageType() {
		return _messageType;
	}

	public void setMessageType(long messageType) {
		_messageType = messageType;
	}

	public long getPhieuxulyphuId() {
		return _phieuxulyphuId;
	}

	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_phieuxulyphuId = phieuxulyphuId;
	}

	public String getResponse() {
		return _response;
	}

	public void setResponse(String response) {
		_response = response;
	}

	public Date getResponseTime() {
		return _responseTime;
	}

	public void setResponseTime(Date responseTime) {
		_responseTime = responseTime;
	}

	public String getRequestContent() {
		return _requestContent;
	}

	public void setRequestContent(String requestContent) {
		_requestContent = requestContent;
	}

	public Date getRequestTime() {
		return _requestTime;
	}

	public void setRequestTime(Date requestTime) {
		_requestTime = requestTime;
	}

	public String getRequestSender() {
		return _requestSender;
	}

	public void setRequestSender(String requestSender) {
		_requestSender = requestSender;
	}

	public long getIsReply() {
		return _isReply;
	}

	public void setIsReply(long isReply) {
		_isReply = isReply;
	}

	private long _id;
	private long _dossierid;
	private String _organization;
	private String _division;
	private String _officerName;
	private String _messageID;
	private long _messageType;
	private long _phieuxulyphuId;
	private String _response;
	private Date _responseTime;
	private String _requestContent;
	private Date _requestTime;
	private String _requestSender;
	private long _isReply;
}