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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.motcua.service.ClpSerializer;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaNotificationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaNotificationClp extends BaseModelImpl<MotCuaNotification>
	implements MotCuaNotification {
	public MotCuaNotificationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaNotification.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaNotification.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dossierid", getDossierid());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("officerName", getOfficerName());
		attributes.put("messageID", getMessageID());
		attributes.put("messageType", getMessageType());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());
		attributes.put("response", getResponse());
		attributes.put("responseTime", getResponseTime());
		attributes.put("requestContent", getRequestContent());
		attributes.put("requestTime", getRequestTime());
		attributes.put("requestSender", getRequestSender());
		attributes.put("isReply", getIsReply());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dossierid = (Long)attributes.get("dossierid");

		if (dossierid != null) {
			setDossierid(dossierid);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String officerName = (String)attributes.get("officerName");

		if (officerName != null) {
			setOfficerName(officerName);
		}

		String messageID = (String)attributes.get("messageID");

		if (messageID != null) {
			setMessageID(messageID);
		}

		Long messageType = (Long)attributes.get("messageType");

		if (messageType != null) {
			setMessageType(messageType);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}

		Date responseTime = (Date)attributes.get("responseTime");

		if (responseTime != null) {
			setResponseTime(responseTime);
		}

		String requestContent = (String)attributes.get("requestContent");

		if (requestContent != null) {
			setRequestContent(requestContent);
		}

		Date requestTime = (Date)attributes.get("requestTime");

		if (requestTime != null) {
			setRequestTime(requestTime);
		}

		String requestSender = (String)attributes.get("requestSender");

		if (requestSender != null) {
			setRequestSender(requestSender);
		}

		Long isReply = (Long)attributes.get("isReply");

		if (isReply != null) {
			setIsReply(isReply);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaNotificationRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierid() {
		return _dossierid;
	}

	@Override
	public void setDossierid(long dossierid) {
		_dossierid = dossierid;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierid", long.class);

				method.invoke(_motCuaNotificationRemoteModel, dossierid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization() {
		return _organization;
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization", String.class);

				method.invoke(_motCuaNotificationRemoteModel, organization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDivision() {
		return _division;
	}

	@Override
	public void setDivision(String division) {
		_division = division;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setDivision", String.class);

				method.invoke(_motCuaNotificationRemoteModel, division);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOfficerName() {
		return _officerName;
	}

	@Override
	public void setOfficerName(String officerName) {
		_officerName = officerName;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setOfficerName", String.class);

				method.invoke(_motCuaNotificationRemoteModel, officerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageID() {
		return _messageID;
	}

	@Override
	public void setMessageID(String messageID) {
		_messageID = messageID;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageID", String.class);

				method.invoke(_motCuaNotificationRemoteModel, messageID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMessageType() {
		return _messageType;
	}

	@Override
	public void setMessageType(long messageType) {
		_messageType = messageType;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageType", long.class);

				method.invoke(_motCuaNotificationRemoteModel, messageType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuxulyphuId() {
		return _phieuxulyphuId;
	}

	@Override
	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_phieuxulyphuId = phieuxulyphuId;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuxulyphuId", long.class);

				method.invoke(_motCuaNotificationRemoteModel, phieuxulyphuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponse() {
		return _response;
	}

	@Override
	public void setResponse(String response) {
		_response = response;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setResponse", String.class);

				method.invoke(_motCuaNotificationRemoteModel, response);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getResponseTime() {
		return _responseTime;
	}

	@Override
	public void setResponseTime(Date responseTime) {
		_responseTime = responseTime;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setResponseTime", Date.class);

				method.invoke(_motCuaNotificationRemoteModel, responseTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestContent() {
		return _requestContent;
	}

	@Override
	public void setRequestContent(String requestContent) {
		_requestContent = requestContent;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestContent",
						String.class);

				method.invoke(_motCuaNotificationRemoteModel, requestContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestTime() {
		return _requestTime;
	}

	@Override
	public void setRequestTime(Date requestTime) {
		_requestTime = requestTime;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestTime", Date.class);

				method.invoke(_motCuaNotificationRemoteModel, requestTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestSender() {
		return _requestSender;
	}

	@Override
	public void setRequestSender(String requestSender) {
		_requestSender = requestSender;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestSender", String.class);

				method.invoke(_motCuaNotificationRemoteModel, requestSender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIsReply() {
		return _isReply;
	}

	@Override
	public void setIsReply(long isReply) {
		_isReply = isReply;

		if (_motCuaNotificationRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaNotificationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsReply", long.class);

				method.invoke(_motCuaNotificationRemoteModel, isReply);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaNotificationRemoteModel() {
		return _motCuaNotificationRemoteModel;
	}

	public void setMotCuaNotificationRemoteModel(
		BaseModel<?> motCuaNotificationRemoteModel) {
		_motCuaNotificationRemoteModel = motCuaNotificationRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _motCuaNotificationRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_motCuaNotificationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaNotificationLocalServiceUtil.addMotCuaNotification(this);
		}
		else {
			MotCuaNotificationLocalServiceUtil.updateMotCuaNotification(this);
		}
	}

	@Override
	public MotCuaNotification toEscapedModel() {
		return (MotCuaNotification)ProxyUtil.newProxyInstance(MotCuaNotification.class.getClassLoader(),
			new Class[] { MotCuaNotification.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaNotificationClp clone = new MotCuaNotificationClp();

		clone.setId(getId());
		clone.setDossierid(getDossierid());
		clone.setOrganization(getOrganization());
		clone.setDivision(getDivision());
		clone.setOfficerName(getOfficerName());
		clone.setMessageID(getMessageID());
		clone.setMessageType(getMessageType());
		clone.setPhieuxulyphuId(getPhieuxulyphuId());
		clone.setResponse(getResponse());
		clone.setResponseTime(getResponseTime());
		clone.setRequestContent(getRequestContent());
		clone.setRequestTime(getRequestTime());
		clone.setRequestSender(getRequestSender());
		clone.setIsReply(getIsReply());

		return clone;
	}

	@Override
	public int compareTo(MotCuaNotification motCuaNotification) {
		int value = 0;

		if (getId() < motCuaNotification.getId()) {
			value = -1;
		}
		else if (getId() > motCuaNotification.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MotCuaNotificationClp)) {
			return false;
		}

		MotCuaNotificationClp motCuaNotification = (MotCuaNotificationClp)obj;

		long primaryKey = motCuaNotification.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dossierid=");
		sb.append(getDossierid());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", officerName=");
		sb.append(getOfficerName());
		sb.append(", messageID=");
		sb.append(getMessageID());
		sb.append(", messageType=");
		sb.append(getMessageType());
		sb.append(", phieuxulyphuId=");
		sb.append(getPhieuxulyphuId());
		sb.append(", response=");
		sb.append(getResponse());
		sb.append(", responseTime=");
		sb.append(getResponseTime());
		sb.append(", requestContent=");
		sb.append(getRequestContent());
		sb.append(", requestTime=");
		sb.append(getRequestTime());
		sb.append(", requestSender=");
		sb.append(getRequestSender());
		sb.append(", isReply=");
		sb.append(getIsReply());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierid</column-name><column-value><![CDATA[");
		sb.append(getDossierid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>officerName</column-name><column-value><![CDATA[");
		sb.append(getOfficerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageID</column-name><column-value><![CDATA[");
		sb.append(getMessageID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageType</column-name><column-value><![CDATA[");
		sb.append(getMessageType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuxulyphuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuxulyphuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>response</column-name><column-value><![CDATA[");
		sb.append(getResponse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTime</column-name><column-value><![CDATA[");
		sb.append(getResponseTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestContent</column-name><column-value><![CDATA[");
		sb.append(getRequestContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestTime</column-name><column-value><![CDATA[");
		sb.append(getRequestTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestSender</column-name><column-value><![CDATA[");
		sb.append(getRequestSender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isReply</column-name><column-value><![CDATA[");
		sb.append(getIsReply());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _motCuaNotificationRemoteModel;
}