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
import vn.dtt.gt.dk.dao.motcua.service.ThamSoHeThongLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class ThamSoHeThongClp extends BaseModelImpl<ThamSoHeThong>
	implements ThamSoHeThong {
	public ThamSoHeThongClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ThamSoHeThong.class;
	}

	@Override
	public String getModelClassName() {
		return ThamSoHeThong.class.getName();
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
		attributes.put("valueData", getValueData());
		attributes.put("keyData", getKeyData());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String valueData = (String)attributes.get("valueData");

		if (valueData != null) {
			setValueData(valueData);
		}

		String keyData = (String)attributes.get("keyData");

		if (keyData != null) {
			setKeyData(keyData);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thamSoHeThongRemoteModel != null) {
			try {
				Class<?> clazz = _thamSoHeThongRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thamSoHeThongRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValueData() {
		return _valueData;
	}

	@Override
	public void setValueData(String valueData) {
		_valueData = valueData;

		if (_thamSoHeThongRemoteModel != null) {
			try {
				Class<?> clazz = _thamSoHeThongRemoteModel.getClass();

				Method method = clazz.getMethod("setValueData", String.class);

				method.invoke(_thamSoHeThongRemoteModel, valueData);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeyData() {
		return _keyData;
	}

	@Override
	public void setKeyData(String keyData) {
		_keyData = keyData;

		if (_thamSoHeThongRemoteModel != null) {
			try {
				Class<?> clazz = _thamSoHeThongRemoteModel.getClass();

				Method method = clazz.getMethod("setKeyData", String.class);

				method.invoke(_thamSoHeThongRemoteModel, keyData);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_thamSoHeThongRemoteModel != null) {
			try {
				Class<?> clazz = _thamSoHeThongRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_thamSoHeThongRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getThamSoHeThongRemoteModel() {
		return _thamSoHeThongRemoteModel;
	}

	public void setThamSoHeThongRemoteModel(
		BaseModel<?> thamSoHeThongRemoteModel) {
		_thamSoHeThongRemoteModel = thamSoHeThongRemoteModel;
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

		Class<?> remoteModelClass = _thamSoHeThongRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thamSoHeThongRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ThamSoHeThongLocalServiceUtil.addThamSoHeThong(this);
		}
		else {
			ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(this);
		}
	}

	@Override
	public ThamSoHeThong toEscapedModel() {
		return (ThamSoHeThong)ProxyUtil.newProxyInstance(ThamSoHeThong.class.getClassLoader(),
			new Class[] { ThamSoHeThong.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ThamSoHeThongClp clone = new ThamSoHeThongClp();

		clone.setId(getId());
		clone.setValueData(getValueData());
		clone.setKeyData(getKeyData());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(ThamSoHeThong thamSoHeThong) {
		int value = 0;

		if (getId() < thamSoHeThong.getId()) {
			value = -1;
		}
		else if (getId() > thamSoHeThong.getId()) {
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

		if (!(obj instanceof ThamSoHeThongClp)) {
			return false;
		}

		ThamSoHeThongClp thamSoHeThong = (ThamSoHeThongClp)obj;

		long primaryKey = thamSoHeThong.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", valueData=");
		sb.append(getValueData());
		sb.append(", keyData=");
		sb.append(getKeyData());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valueData</column-name><column-value><![CDATA[");
		sb.append(getValueData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keyData</column-name><column-value><![CDATA[");
		sb.append(getKeyData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _valueData;
	private String _keyData;
	private String _description;
	private BaseModel<?> _thamSoHeThongRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.class;
}