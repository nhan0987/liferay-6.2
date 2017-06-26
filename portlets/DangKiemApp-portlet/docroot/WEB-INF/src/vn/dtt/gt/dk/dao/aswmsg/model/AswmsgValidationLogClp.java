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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AswmsgValidationLogClp extends BaseModelImpl<AswmsgValidationLog>
	implements AswmsgValidationLog {
	public AswmsgValidationLogClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AswmsgValidationLog.class;
	}

	@Override
	public String getModelClassName() {
		return AswmsgValidationLog.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("MessageLogId", getMessageLogId());
		attributes.put("TagName", getTagName());
		attributes.put("ValidationCode", getValidationCode());
		attributes.put("Description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long MessageLogId = (Long)attributes.get("MessageLogId");

		if (MessageLogId != null) {
			setMessageLogId(MessageLogId);
		}

		String TagName = (String)attributes.get("TagName");

		if (TagName != null) {
			setTagName(TagName);
		}

		String ValidationCode = (String)attributes.get("ValidationCode");

		if (ValidationCode != null) {
			setValidationCode(ValidationCode);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_aswmsgValidationLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgValidationLogRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_aswmsgValidationLogRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMessageLogId() {
		return _MessageLogId;
	}

	@Override
	public void setMessageLogId(long MessageLogId) {
		_MessageLogId = MessageLogId;

		if (_aswmsgValidationLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgValidationLogRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageLogId", long.class);

				method.invoke(_aswmsgValidationLogRemoteModel, MessageLogId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTagName() {
		return _TagName;
	}

	@Override
	public void setTagName(String TagName) {
		_TagName = TagName;

		if (_aswmsgValidationLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgValidationLogRemoteModel.getClass();

				Method method = clazz.getMethod("setTagName", String.class);

				method.invoke(_aswmsgValidationLogRemoteModel, TagName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValidationCode() {
		return _ValidationCode;
	}

	@Override
	public void setValidationCode(String ValidationCode) {
		_ValidationCode = ValidationCode;

		if (_aswmsgValidationLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgValidationLogRemoteModel.getClass();

				Method method = clazz.getMethod("setValidationCode",
						String.class);

				method.invoke(_aswmsgValidationLogRemoteModel, ValidationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _Description;
	}

	@Override
	public void setDescription(String Description) {
		_Description = Description;

		if (_aswmsgValidationLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgValidationLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_aswmsgValidationLogRemoteModel, Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAswmsgValidationLogRemoteModel() {
		return _aswmsgValidationLogRemoteModel;
	}

	public void setAswmsgValidationLogRemoteModel(
		BaseModel<?> aswmsgValidationLogRemoteModel) {
		_aswmsgValidationLogRemoteModel = aswmsgValidationLogRemoteModel;
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

		Class<?> remoteModelClass = _aswmsgValidationLogRemoteModel.getClass();

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

		Object returnValue = method.invoke(_aswmsgValidationLogRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AswmsgValidationLogLocalServiceUtil.addAswmsgValidationLog(this);
		}
		else {
			AswmsgValidationLogLocalServiceUtil.updateAswmsgValidationLog(this);
		}
	}

	@Override
	public AswmsgValidationLog toEscapedModel() {
		return (AswmsgValidationLog)ProxyUtil.newProxyInstance(AswmsgValidationLog.class.getClassLoader(),
			new Class[] { AswmsgValidationLog.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AswmsgValidationLogClp clone = new AswmsgValidationLogClp();

		clone.setId(getId());
		clone.setMessageLogId(getMessageLogId());
		clone.setTagName(getTagName());
		clone.setValidationCode(getValidationCode());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(AswmsgValidationLog aswmsgValidationLog) {
		int value = 0;

		if (getId() < aswmsgValidationLog.getId()) {
			value = -1;
		}
		else if (getId() > aswmsgValidationLog.getId()) {
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

		if (!(obj instanceof AswmsgValidationLogClp)) {
			return false;
		}

		AswmsgValidationLogClp aswmsgValidationLog = (AswmsgValidationLogClp)obj;

		long primaryKey = aswmsgValidationLog.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", MessageLogId=");
		sb.append(getMessageLogId());
		sb.append(", TagName=");
		sb.append(getTagName());
		sb.append(", ValidationCode=");
		sb.append(getValidationCode());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MessageLogId</column-name><column-value><![CDATA[");
		sb.append(getMessageLogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TagName</column-name><column-value><![CDATA[");
		sb.append(getTagName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidationCode</column-name><column-value><![CDATA[");
		sb.append(getValidationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private long _MessageLogId;
	private String _TagName;
	private String _ValidationCode;
	private String _Description;
	private BaseModel<?> _aswmsgValidationLogRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer.class;
}