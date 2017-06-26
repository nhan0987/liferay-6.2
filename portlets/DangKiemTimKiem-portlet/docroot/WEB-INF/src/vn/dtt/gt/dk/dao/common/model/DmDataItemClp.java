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
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DmDataItemClp extends BaseModelImpl<DmDataItem>
	implements DmDataItem {
	public DmDataItemClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataItem.class.getName();
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
		attributes.put("Code0", getCode0());
		attributes.put("Code1", getCode1());
		attributes.put("Code2", getCode2());
		attributes.put("Code3", getCode3());
		attributes.put("Level", getLevel());
		attributes.put("Name", getName());
		attributes.put("AlterName", getAlterName());
		attributes.put("Description", getDescription());
		attributes.put("ValidatedFrom", getValidatedFrom());
		attributes.put("ValidatedTo", getValidatedTo());
		attributes.put("Status", getStatus());

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

		String Code0 = (String)attributes.get("Code0");

		if (Code0 != null) {
			setCode0(Code0);
		}

		String Code1 = (String)attributes.get("Code1");

		if (Code1 != null) {
			setCode1(Code1);
		}

		String Code2 = (String)attributes.get("Code2");

		if (Code2 != null) {
			setCode2(Code2);
		}

		String Code3 = (String)attributes.get("Code3");

		if (Code3 != null) {
			setCode3(Code3);
		}

		Integer Level = (Integer)attributes.get("Level");

		if (Level != null) {
			setLevel(Level);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String AlterName = (String)attributes.get("AlterName");

		if (AlterName != null) {
			setAlterName(AlterName);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String ValidatedFrom = (String)attributes.get("ValidatedFrom");

		if (ValidatedFrom != null) {
			setValidatedFrom(ValidatedFrom);
		}

		String ValidatedTo = (String)attributes.get("ValidatedTo");

		if (ValidatedTo != null) {
			setValidatedTo(ValidatedTo);
		}

		Integer Status = (Integer)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmDataItemRemoteModel, Id);
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

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setDataGroupId", long.class);

				method.invoke(_dmDataItemRemoteModel, DataGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode0() {
		return _Code0;
	}

	@Override
	public void setCode0(String Code0) {
		_Code0 = Code0;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCode0", String.class);

				method.invoke(_dmDataItemRemoteModel, Code0);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode1() {
		return _Code1;
	}

	@Override
	public void setCode1(String Code1) {
		_Code1 = Code1;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCode1", String.class);

				method.invoke(_dmDataItemRemoteModel, Code1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode2() {
		return _Code2;
	}

	@Override
	public void setCode2(String Code2) {
		_Code2 = Code2;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCode2", String.class);

				method.invoke(_dmDataItemRemoteModel, Code2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode3() {
		return _Code3;
	}

	@Override
	public void setCode3(String Code3) {
		_Code3 = Code3;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCode3", String.class);

				method.invoke(_dmDataItemRemoteModel, Code3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLevel() {
		return _Level;
	}

	@Override
	public void setLevel(int Level) {
		_Level = Level;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setLevel", int.class);

				method.invoke(_dmDataItemRemoteModel, Level);
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

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_dmDataItemRemoteModel, Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAlterName() {
		return _AlterName;
	}

	@Override
	public void setAlterName(String AlterName) {
		_AlterName = AlterName;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setAlterName", String.class);

				method.invoke(_dmDataItemRemoteModel, AlterName);
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

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dmDataItemRemoteModel, Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValidatedFrom() {
		return _ValidatedFrom;
	}

	@Override
	public void setValidatedFrom(String ValidatedFrom) {
		_ValidatedFrom = ValidatedFrom;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedFrom", String.class);

				method.invoke(_dmDataItemRemoteModel, ValidatedFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValidatedTo() {
		return _ValidatedTo;
	}

	@Override
	public void setValidatedTo(String ValidatedTo) {
		_ValidatedTo = ValidatedTo;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setValidatedTo", String.class);

				method.invoke(_dmDataItemRemoteModel, ValidatedTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _Status;
	}

	@Override
	public void setStatus(int Status) {
		_Status = Status;

		if (_dmDataItemRemoteModel != null) {
			try {
				Class<?> clazz = _dmDataItemRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_dmDataItemRemoteModel, Status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmDataItemRemoteModel() {
		return _dmDataItemRemoteModel;
	}

	public void setDmDataItemRemoteModel(BaseModel<?> dmDataItemRemoteModel) {
		_dmDataItemRemoteModel = dmDataItemRemoteModel;
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

		Class<?> remoteModelClass = _dmDataItemRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmDataItemRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmDataItemLocalServiceUtil.addDmDataItem(this);
		}
		else {
			DmDataItemLocalServiceUtil.updateDmDataItem(this);
		}
	}

	@Override
	public DmDataItem toEscapedModel() {
		return (DmDataItem)ProxyUtil.newProxyInstance(DmDataItem.class.getClassLoader(),
			new Class[] { DmDataItem.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmDataItemClp clone = new DmDataItemClp();

		clone.setId(getId());
		clone.setDataGroupId(getDataGroupId());
		clone.setCode0(getCode0());
		clone.setCode1(getCode1());
		clone.setCode2(getCode2());
		clone.setCode3(getCode3());
		clone.setLevel(getLevel());
		clone.setName(getName());
		clone.setAlterName(getAlterName());
		clone.setDescription(getDescription());
		clone.setValidatedFrom(getValidatedFrom());
		clone.setValidatedTo(getValidatedTo());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(DmDataItem dmDataItem) {
		int value = 0;

		if (getId() < dmDataItem.getId()) {
			value = -1;
		}
		else if (getId() > dmDataItem.getId()) {
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

		if (!(obj instanceof DmDataItemClp)) {
			return false;
		}

		DmDataItemClp dmDataItem = (DmDataItemClp)obj;

		long primaryKey = dmDataItem.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", DataGroupId=");
		sb.append(getDataGroupId());
		sb.append(", Code0=");
		sb.append(getCode0());
		sb.append(", Code1=");
		sb.append(getCode1());
		sb.append(", Code2=");
		sb.append(getCode2());
		sb.append(", Code3=");
		sb.append(getCode3());
		sb.append(", Level=");
		sb.append(getLevel());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", AlterName=");
		sb.append(getAlterName());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", ValidatedFrom=");
		sb.append(getValidatedFrom());
		sb.append(", ValidatedTo=");
		sb.append(getValidatedTo());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.DmDataItem");
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
			"<column><column-name>Code0</column-name><column-value><![CDATA[");
		sb.append(getCode0());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code1</column-name><column-value><![CDATA[");
		sb.append(getCode1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code2</column-name><column-value><![CDATA[");
		sb.append(getCode2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code3</column-name><column-value><![CDATA[");
		sb.append(getCode3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AlterName</column-name><column-value><![CDATA[");
		sb.append(getAlterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidatedFrom</column-name><column-value><![CDATA[");
		sb.append(getValidatedFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private long _DataGroupId;
	private String _Code0;
	private String _Code1;
	private String _Code2;
	private String _Code3;
	private int _Level;
	private String _Name;
	private String _AlterName;
	private String _Description;
	private String _ValidatedFrom;
	private String _ValidatedTo;
	private int _Status;
	private BaseModel<?> _dmDataItemRemoteModel;
}