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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.api.service.ApiLocalServiceUtil;
import vn.dtt.gt.dk.dao.api.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class ApiClp extends BaseModelImpl<Api> implements Api {
	public ApiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Api.class;
	}

	@Override
	public String getModelClassName() {
		return Api.class.getName();
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
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userAgent", getUserAgent());
		attributes.put("ip", getIp());
		attributes.put("code", getCode());
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("request", getRequest());
		attributes.put("response", getResponse());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
		}

		String ip = (String)attributes.get("ip");

		if (ip != null) {
			setIp(ip);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		String request = (String)attributes.get("request");

		if (request != null) {
			setRequest(request);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_apiRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_apiRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_apiRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserAgent() {
		return _userAgent;
	}

	@Override
	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserAgent", String.class);

				method.invoke(_apiRemoteModel, userAgent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIp() {
		return _ip;
	}

	@Override
	public void setIp(String ip) {
		_ip = ip;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setIp", String.class);

				method.invoke(_apiRemoteModel, ip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_apiRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	@Override
	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredNumber",
						String.class);

				method.invoke(_apiRemoteModel, registeredNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequest() {
		return _request;
	}

	@Override
	public void setRequest(String request) {
		_request = request;

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setRequest", String.class);

				method.invoke(_apiRemoteModel, request);
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

		if (_apiRemoteModel != null) {
			try {
				Class<?> clazz = _apiRemoteModel.getClass();

				Method method = clazz.getMethod("setResponse", String.class);

				method.invoke(_apiRemoteModel, response);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getApiRemoteModel() {
		return _apiRemoteModel;
	}

	public void setApiRemoteModel(BaseModel<?> apiRemoteModel) {
		_apiRemoteModel = apiRemoteModel;
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

		Class<?> remoteModelClass = _apiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_apiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApiLocalServiceUtil.addApi(this);
		}
		else {
			ApiLocalServiceUtil.updateApi(this);
		}
	}

	@Override
	public Api toEscapedModel() {
		return (Api)ProxyUtil.newProxyInstance(Api.class.getClassLoader(),
			new Class[] { Api.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ApiClp clone = new ApiClp();

		clone.setId(getId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setUserAgent(getUserAgent());
		clone.setIp(getIp());
		clone.setCode(getCode());
		clone.setRegisteredNumber(getRegisteredNumber());
		clone.setRequest(getRequest());
		clone.setResponse(getResponse());

		return clone;
	}

	@Override
	public int compareTo(Api api) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), api.getCreateDate());

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

		if (!(obj instanceof ApiClp)) {
			return false;
		}

		ApiClp api = (ApiClp)obj;

		long primaryKey = api.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userAgent=");
		sb.append(getUserAgent());
		sb.append(", ip=");
		sb.append(getIp());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", registeredNumber=");
		sb.append(getRegisteredNumber());
		sb.append(", request=");
		sb.append(getRequest());
		sb.append(", response=");
		sb.append(getResponse());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.api.model.Api");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAgent</column-name><column-value><![CDATA[");
		sb.append(getUserAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ip</column-name><column-value><![CDATA[");
		sb.append(getIp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredNumber</column-name><column-value><![CDATA[");
		sb.append(getRegisteredNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>request</column-name><column-value><![CDATA[");
		sb.append(getRequest());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>response</column-name><column-value><![CDATA[");
		sb.append(getResponse());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _apiRemoteModel;
}