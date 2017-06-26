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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.common.service.ClpSerializer;
import vn.dtt.gt.dk.dao.common.service.DmDataVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DmDataVersionClp extends BaseModelImpl<DmDataVersion>
	implements DmDataVersion {
	public DmDataVersionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataVersion.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataVersion.class.getName();
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
		attributes.put("DataGroupId", getDataGroupId());
		attributes.put("Version", getVersion());
		attributes.put("IssuedTime", getIssuedTime());
		attributes.put("ValidateDFrom", getValidateDFrom());
		attributes.put("ValidatedTo", getValidatedTo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long DataGroupId = (Long)attributes.get("DataGroupId");

		if (DataGroupId != null) {
			setDataGroupId(DataGroupId);
		}

		String Version = (String)attributes.get("Version");

		if (Version != null) {
			setVersion(Version);
		}

		Date IssuedTime = (Date)attributes.get("IssuedTime");

		if (IssuedTime != null) {
			setIssuedTime(IssuedTime);
		}

		Date ValidateDFrom = (Date)attributes.get("ValidateDFrom");

		if (ValidateDFrom != null) {
			setValidateDFrom(ValidateDFrom);
		}

		Date ValidatedTo = (Date)attributes.get("ValidatedTo");

		if (ValidatedTo != null) {
			setValidatedTo(ValidatedTo);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmDataVersionRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDataGroupId() {
		return _DataGroupId;
	}

	@Override
	public void setDataGroupId(long DataGroupId) {
		_DataGroupId = DataGroupId;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setDataGroupId", long.class);

				method.invoke(_dmDataVersionRemoteModel, DataGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersion() {
		return _Version;
	}

	@Override
	public void setVersion(String Version) {
		_Version = Version;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", String.class);

				method.invoke(_dmDataVersionRemoteModel, Version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssuedTime() {
		return _IssuedTime;
	}

	@Override
	public void setIssuedTime(Date IssuedTime) {
		_IssuedTime = IssuedTime;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuedTime", Date.class);

				method.invoke(_dmDataVersionRemoteModel, IssuedTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidateDFrom() {
		return _ValidateDFrom;
	}

	@Override
	public void setValidateDFrom(Date ValidateDFrom) {
		_ValidateDFrom = ValidateDFrom;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setValidateDFrom", Date.class);

				method.invoke(_dmDataVersionRemoteModel, ValidateDFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getValidatedTo() {
		return _ValidatedTo;
	}

	@Override
	public void setValidatedTo(Date ValidatedTo) {
		_ValidatedTo = ValidatedTo;

		if (_dmDataVersionRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataVersionRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedTo", Date.class);

				method.invoke(_dmDataVersionRemoteModel, ValidatedTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmDataVersionRemoteModel() {
		return _dmDataVersionRemoteModel;
	}

	public void setDmDataVersionRemoteModel(
		BaseModel<?> dmDataVersionRemoteModel) {
		_dmDataVersionRemoteModel = dmDataVersionRemoteModel;
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

		Class<?> remoteModelClass = _dmDataVersionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmDataVersionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmDataVersionLocalServiceUtil.addDmDataVersion(this);
		}
		else {
			DmDataVersionLocalServiceUtil.updateDmDataVersion(this);
		}
	}

	@Override
	public DmDataVersion toEscapedModel() {
		return (DmDataVersion)ProxyUtil.newProxyInstance(DmDataVersion.class.getClassLoader(),
			new Class[] { DmDataVersion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmDataVersionClp clone = new DmDataVersionClp();

		clone.setId(getId());
		clone.setDataGroupId(getDataGroupId());
		clone.setVersion(getVersion());
		clone.setIssuedTime(getIssuedTime());
		clone.setValidateDFrom(getValidateDFrom());
		clone.setValidatedTo(getValidatedTo());

		return clone;
	}

	@Override
	public int compareTo(DmDataVersion dmDataVersion) {
		int value = 0;

		if (getId() < dmDataVersion.getId()) {
			value = -1;
		}
		else if (getId() > dmDataVersion.getId()) {
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

		if (!(obj instanceof DmDataVersionClp)) {
			return false;
		}

		DmDataVersionClp dmDataVersion = (DmDataVersionClp)obj;

		long primaryKey = dmDataVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", DataGroupId=");
		sb.append(getDataGroupId());
		sb.append(", Version=");
		sb.append(getVersion());
		sb.append(", IssuedTime=");
		sb.append(getIssuedTime());
		sb.append(", ValidateDFrom=");
		sb.append(getValidateDFrom());
		sb.append(", ValidatedTo=");
		sb.append(getValidatedTo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.DmDataVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DataGroupId</column-name><column-value><![CDATA[");
		sb.append(getDataGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IssuedTime</column-name><column-value><![CDATA[");
		sb.append(getIssuedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidateDFrom</column-name><column-value><![CDATA[");
		sb.append(getValidateDFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private long _DataGroupId;
	private String _Version;
	private Date _IssuedTime;
	private Date _ValidateDFrom;
	private Date _ValidatedTo;
	private BaseModel<?> _dmDataVersionRemoteModel;
}