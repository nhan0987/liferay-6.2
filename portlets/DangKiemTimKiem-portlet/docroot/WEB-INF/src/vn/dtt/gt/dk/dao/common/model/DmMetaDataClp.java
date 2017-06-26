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
import vn.dtt.gt.dk.dao.common.service.DmMetaDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DmMetaDataClp extends BaseModelImpl<DmMetaData>
	implements DmMetaData {
	public DmMetaDataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmMetaData.class;
	}

	@Override
	public String getModelClassName() {
		return DmMetaData.class.getName();
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
		attributes.put("Entity", getEntity());
		attributes.put("FieldCode", getFieldCode());
		attributes.put("FieldName", getFieldName());
		attributes.put("FieldAlterName", getFieldAlterName());
		attributes.put("FieldDescription", getFieldDescription());
		attributes.put("FieldDataSet", getFieldDataSet());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Entity = (String)attributes.get("Entity");

		if (Entity != null) {
			setEntity(Entity);
		}

		String FieldCode = (String)attributes.get("FieldCode");

		if (FieldCode != null) {
			setFieldCode(FieldCode);
		}

		String FieldName = (String)attributes.get("FieldName");

		if (FieldName != null) {
			setFieldName(FieldName);
		}

		String FieldAlterName = (String)attributes.get("FieldAlterName");

		if (FieldAlterName != null) {
			setFieldAlterName(FieldAlterName);
		}

		String FieldDescription = (String)attributes.get("FieldDescription");

		if (FieldDescription != null) {
			setFieldDescription(FieldDescription);
		}

		String FieldDataSet = (String)attributes.get("FieldDataSet");

		if (FieldDataSet != null) {
			setFieldDataSet(FieldDataSet);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dmMetaDataRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEntity() {
		return _Entity;
	}

	@Override
	public void setEntity(String Entity) {
		_Entity = Entity;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setEntity", String.class);

				method.invoke(_dmMetaDataRemoteModel, Entity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldCode() {
		return _FieldCode;
	}

	@Override
	public void setFieldCode(String FieldCode) {
		_FieldCode = FieldCode;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldCode", String.class);

				method.invoke(_dmMetaDataRemoteModel, FieldCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldName() {
		return _FieldName;
	}

	@Override
	public void setFieldName(String FieldName) {
		_FieldName = FieldName;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldName", String.class);

				method.invoke(_dmMetaDataRemoteModel, FieldName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldAlterName() {
		return _FieldAlterName;
	}

	@Override
	public void setFieldAlterName(String FieldAlterName) {
		_FieldAlterName = FieldAlterName;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldAlterName",
						String.class);

				method.invoke(_dmMetaDataRemoteModel, FieldAlterName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldDescription() {
		return _FieldDescription;
	}

	@Override
	public void setFieldDescription(String FieldDescription) {
		_FieldDescription = FieldDescription;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldDescription",
						String.class);

				method.invoke(_dmMetaDataRemoteModel, FieldDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFieldDataSet() {
		return _FieldDataSet;
	}

	@Override
	public void setFieldDataSet(String FieldDataSet) {
		_FieldDataSet = FieldDataSet;

		if (_dmMetaDataRemoteModel != null) {
			try {
				Class<?> clazz = _dmMetaDataRemoteModel.getClass();

				Method method = clazz.getMethod("setFieldDataSet", String.class);

				method.invoke(_dmMetaDataRemoteModel, FieldDataSet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmMetaDataRemoteModel() {
		return _dmMetaDataRemoteModel;
	}

	public void setDmMetaDataRemoteModel(BaseModel<?> dmMetaDataRemoteModel) {
		_dmMetaDataRemoteModel = dmMetaDataRemoteModel;
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

		Class<?> remoteModelClass = _dmMetaDataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmMetaDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmMetaDataLocalServiceUtil.addDmMetaData(this);
		}
		else {
			DmMetaDataLocalServiceUtil.updateDmMetaData(this);
		}
	}

	@Override
	public DmMetaData toEscapedModel() {
		return (DmMetaData)ProxyUtil.newProxyInstance(DmMetaData.class.getClassLoader(),
			new Class[] { DmMetaData.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmMetaDataClp clone = new DmMetaDataClp();

		clone.setId(getId());
		clone.setEntity(getEntity());
		clone.setFieldCode(getFieldCode());
		clone.setFieldName(getFieldName());
		clone.setFieldAlterName(getFieldAlterName());
		clone.setFieldDescription(getFieldDescription());
		clone.setFieldDataSet(getFieldDataSet());

		return clone;
	}

	@Override
	public int compareTo(DmMetaData dmMetaData) {
		int value = 0;

		if (getId() < dmMetaData.getId()) {
			value = -1;
		}
		else if (getId() > dmMetaData.getId()) {
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

		if (!(obj instanceof DmMetaDataClp)) {
			return false;
		}

		DmMetaDataClp dmMetaData = (DmMetaDataClp)obj;

		long primaryKey = dmMetaData.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Entity=");
		sb.append(getEntity());
		sb.append(", FieldCode=");
		sb.append(getFieldCode());
		sb.append(", FieldName=");
		sb.append(getFieldName());
		sb.append(", FieldAlterName=");
		sb.append(getFieldAlterName());
		sb.append(", FieldDescription=");
		sb.append(getFieldDescription());
		sb.append(", FieldDataSet=");
		sb.append(getFieldDataSet());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.DmMetaData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Entity</column-name><column-value><![CDATA[");
		sb.append(getEntity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FieldCode</column-name><column-value><![CDATA[");
		sb.append(getFieldCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FieldName</column-name><column-value><![CDATA[");
		sb.append(getFieldName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FieldAlterName</column-name><column-value><![CDATA[");
		sb.append(getFieldAlterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FieldDescription</column-name><column-value><![CDATA[");
		sb.append(getFieldDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FieldDataSet</column-name><column-value><![CDATA[");
		sb.append(getFieldDataSet());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _Entity;
	private String _FieldCode;
	private String _FieldName;
	private String _FieldAlterName;
	private String _FieldDescription;
	private String _FieldDataSet;
	private BaseModel<?> _dmMetaDataRemoteModel;
}