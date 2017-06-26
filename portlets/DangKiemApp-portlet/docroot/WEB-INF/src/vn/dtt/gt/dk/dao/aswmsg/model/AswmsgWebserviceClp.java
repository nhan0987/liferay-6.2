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

import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AswmsgWebserviceClp extends BaseModelImpl<AswmsgWebservice>
	implements AswmsgWebservice {
	public AswmsgWebserviceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AswmsgWebservice.class;
	}

	@Override
	public String getModelClassName() {
		return AswmsgWebservice.class.getName();
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
		attributes.put("ServiceCode", getServiceCode());
		attributes.put("ServiceName", getServiceName());
		attributes.put("ServiceURL", getServiceURL());
		attributes.put("UserName", getUserName());
		attributes.put("Password", getPassword());
		attributes.put("Domain", getDomain());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String ServiceCode = (String)attributes.get("ServiceCode");

		if (ServiceCode != null) {
			setServiceCode(ServiceCode);
		}

		String ServiceName = (String)attributes.get("ServiceName");

		if (ServiceName != null) {
			setServiceName(ServiceName);
		}

		String ServiceURL = (String)attributes.get("ServiceURL");

		if (ServiceURL != null) {
			setServiceURL(ServiceURL);
		}

		String UserName = (String)attributes.get("UserName");

		if (UserName != null) {
			setUserName(UserName);
		}

		String Password = (String)attributes.get("Password");

		if (Password != null) {
			setPassword(Password);
		}

		String Domain = (String)attributes.get("Domain");

		if (Domain != null) {
			setDomain(Domain);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_aswmsgWebserviceRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgWebserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_aswmsgWebserviceRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceCode() {
		return _ServiceCode;
	}

	@Override
	public void setServiceCode(String ServiceCode) {
		_ServiceCode = ServiceCode;

		if (_aswmsgWebserviceRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgWebserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceCode", String.class);

				method.invoke(_aswmsgWebserviceRemoteModel, ServiceCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceName() {
		return _ServiceName;
	}

	@Override
	public void setServiceName(String ServiceName) {
		_ServiceName = ServiceName;

		if (_aswmsgWebserviceRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgWebserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceName", String.class);

				method.invoke(_aswmsgWebserviceRemoteModel, ServiceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceURL() {
		return _ServiceURL;
	}

	@Override
	public void setServiceURL(String ServiceURL) {
		_ServiceURL = ServiceURL;

		if (_aswmsgWebserviceRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgWebserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceURL", String.class);

				method.invoke(_aswmsgWebserviceRemoteModel, ServiceURL);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserName() {
		return _UserName;
	}

	@Override
	public void setUserName(String UserName) {
		_UserName = UserName;

		if (_aswmsgWebserviceRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgWebserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_aswmsgWebserviceRemoteModel, UserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassword() {
		return _Password;
	}

	@Override
	public void setPassword(String Password) {
		_Password = Password;

		if (_aswmsgWebserviceRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgWebserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setPassword", String.class);

				method.invoke(_aswmsgWebserviceRemoteModel, Password);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDomain() {
		return _Domain;
	}

	@Override
	public void setDomain(String Domain) {
		_Domain = Domain;

		if (_aswmsgWebserviceRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgWebserviceRemoteModel.getClass();

				Method method = clazz.getMethod("setDomain", String.class);

				method.invoke(_aswmsgWebserviceRemoteModel, Domain);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAswmsgWebserviceRemoteModel() {
		return _aswmsgWebserviceRemoteModel;
	}

	public void setAswmsgWebserviceRemoteModel(
		BaseModel<?> aswmsgWebserviceRemoteModel) {
		_aswmsgWebserviceRemoteModel = aswmsgWebserviceRemoteModel;
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

		Class<?> remoteModelClass = _aswmsgWebserviceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_aswmsgWebserviceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AswmsgWebserviceLocalServiceUtil.addAswmsgWebservice(this);
		}
		else {
			AswmsgWebserviceLocalServiceUtil.updateAswmsgWebservice(this);
		}
	}

	@Override
	public AswmsgWebservice toEscapedModel() {
		return (AswmsgWebservice)ProxyUtil.newProxyInstance(AswmsgWebservice.class.getClassLoader(),
			new Class[] { AswmsgWebservice.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AswmsgWebserviceClp clone = new AswmsgWebserviceClp();

		clone.setId(getId());
		clone.setServiceCode(getServiceCode());
		clone.setServiceName(getServiceName());
		clone.setServiceURL(getServiceURL());
		clone.setUserName(getUserName());
		clone.setPassword(getPassword());
		clone.setDomain(getDomain());

		return clone;
	}

	@Override
	public int compareTo(AswmsgWebservice aswmsgWebservice) {
		int value = 0;

		if (getId() < aswmsgWebservice.getId()) {
			value = -1;
		}
		else if (getId() > aswmsgWebservice.getId()) {
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

		if (!(obj instanceof AswmsgWebserviceClp)) {
			return false;
		}

		AswmsgWebserviceClp aswmsgWebservice = (AswmsgWebserviceClp)obj;

		long primaryKey = aswmsgWebservice.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", ServiceCode=");
		sb.append(getServiceCode());
		sb.append(", ServiceName=");
		sb.append(getServiceName());
		sb.append(", ServiceURL=");
		sb.append(getServiceURL());
		sb.append(", UserName=");
		sb.append(getUserName());
		sb.append(", Password=");
		sb.append(getPassword());
		sb.append(", Domain=");
		sb.append(getDomain());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceCode</column-name><column-value><![CDATA[");
		sb.append(getServiceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ServiceURL</column-name><column-value><![CDATA[");
		sb.append(getServiceURL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UserName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Domain</column-name><column-value><![CDATA[");
		sb.append(getDomain());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _ServiceCode;
	private String _ServiceName;
	private String _ServiceURL;
	private String _UserName;
	private String _Password;
	private String _Domain;
	private BaseModel<?> _aswmsgWebserviceRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer.class;
}