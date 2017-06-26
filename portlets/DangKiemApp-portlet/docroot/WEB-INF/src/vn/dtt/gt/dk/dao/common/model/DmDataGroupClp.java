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
import vn.dtt.gt.dk.dao.common.service.DmDataGroupLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DmDataGroupClp extends BaseModelImpl<DmDataGroup>
	implements DmDataGroup {
	public DmDataGroupClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataGroup.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataGroup.class.getName();
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
		attributes.put("Code", getCode());
		attributes.put("Name", getName());
		attributes.put("Description", getDescription());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Code = (String)attributes.get("Code");

		if (Code != null) {
			setCode(Code);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_dmDataGroupRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmDataGroupRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _Code;
	}

	@Override
	public void setCode(String Code) {
		_Code = Code;

		if (_dmDataGroupRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_dmDataGroupRemoteModel, Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _Name;
	}

	@Override
	public void setName(String Name) {
		_Name = Name;

		if (_dmDataGroupRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_dmDataGroupRemoteModel, Name);
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

		if (_dmDataGroupRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dmDataGroupRemoteModel, Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_dmDataGroupRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_dmDataGroupRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmDataGroupRemoteModel() {
		return _dmDataGroupRemoteModel;
	}

	public void setDmDataGroupRemoteModel(BaseModel<?> dmDataGroupRemoteModel) {
		_dmDataGroupRemoteModel = dmDataGroupRemoteModel;
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

		Class<?> remoteModelClass = _dmDataGroupRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmDataGroupRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmDataGroupLocalServiceUtil.addDmDataGroup(this);
		}
		else {
			DmDataGroupLocalServiceUtil.updateDmDataGroup(this);
		}
	}

	@Override
	public DmDataGroup toEscapedModel() {
		return (DmDataGroup)ProxyUtil.newProxyInstance(DmDataGroup.class.getClassLoader(),
			new Class[] { DmDataGroup.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmDataGroupClp clone = new DmDataGroupClp();

		clone.setId(getId());
		clone.setCode(getCode());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(DmDataGroup dmDataGroup) {
		int value = 0;

		if (getId() < dmDataGroup.getId()) {
			value = -1;
		}
		else if (getId() > dmDataGroup.getId()) {
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

		if (!(obj instanceof DmDataGroupClp)) {
			return false;
		}

		DmDataGroupClp dmDataGroup = (DmDataGroupClp)obj;

		long primaryKey = dmDataGroup.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Code=");
		sb.append(getCode());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.DmDataGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _Code;
	private String _Name;
	private String _Description;
	private Date _SynchDate;
	private BaseModel<?> _dmDataGroupRemoteModel;
}