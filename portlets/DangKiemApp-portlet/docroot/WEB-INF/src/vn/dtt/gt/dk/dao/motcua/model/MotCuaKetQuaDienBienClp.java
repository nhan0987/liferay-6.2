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
import vn.dtt.gt.dk.dao.motcua.service.MotCuaKetQuaDienBienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaKetQuaDienBienClp extends BaseModelImpl<MotCuaKetQuaDienBien>
	implements MotCuaKetQuaDienBien {
	public MotCuaKetQuaDienBienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaKetQuaDienBien.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaKetQuaDienBien.class.getName();
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
		attributes.put("dienBienHoSoId", getDienBienHoSoId());
		attributes.put("noiDungHoSoId", getNoiDungHoSoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dienBienHoSoId = (Long)attributes.get("dienBienHoSoId");

		if (dienBienHoSoId != null) {
			setDienBienHoSoId(dienBienHoSoId);
		}

		Long noiDungHoSoId = (Long)attributes.get("noiDungHoSoId");

		if (noiDungHoSoId != null) {
			setNoiDungHoSoId(noiDungHoSoId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaKetQuaDienBienRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaKetQuaDienBienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaKetQuaDienBienRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDienBienHoSoId() {
		return _dienBienHoSoId;
	}

	@Override
	public void setDienBienHoSoId(long dienBienHoSoId) {
		_dienBienHoSoId = dienBienHoSoId;

		if (_motCuaKetQuaDienBienRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaKetQuaDienBienRemoteModel.getClass();

				Method method = clazz.getMethod("setDienBienHoSoId", long.class);

				method.invoke(_motCuaKetQuaDienBienRemoteModel, dienBienHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	@Override
	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;

		if (_motCuaKetQuaDienBienRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaKetQuaDienBienRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHoSoId", long.class);

				method.invoke(_motCuaKetQuaDienBienRemoteModel, noiDungHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaKetQuaDienBienRemoteModel() {
		return _motCuaKetQuaDienBienRemoteModel;
	}

	public void setMotCuaKetQuaDienBienRemoteModel(
		BaseModel<?> motCuaKetQuaDienBienRemoteModel) {
		_motCuaKetQuaDienBienRemoteModel = motCuaKetQuaDienBienRemoteModel;
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

		Class<?> remoteModelClass = _motCuaKetQuaDienBienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaKetQuaDienBienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaKetQuaDienBienLocalServiceUtil.addMotCuaKetQuaDienBien(this);
		}
		else {
			MotCuaKetQuaDienBienLocalServiceUtil.updateMotCuaKetQuaDienBien(this);
		}
	}

	@Override
	public MotCuaKetQuaDienBien toEscapedModel() {
		return (MotCuaKetQuaDienBien)ProxyUtil.newProxyInstance(MotCuaKetQuaDienBien.class.getClassLoader(),
			new Class[] { MotCuaKetQuaDienBien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaKetQuaDienBienClp clone = new MotCuaKetQuaDienBienClp();

		clone.setId(getId());
		clone.setDienBienHoSoId(getDienBienHoSoId());
		clone.setNoiDungHoSoId(getNoiDungHoSoId());

		return clone;
	}

	@Override
	public int compareTo(MotCuaKetQuaDienBien motCuaKetQuaDienBien) {
		int value = 0;

		if (getId() < motCuaKetQuaDienBien.getId()) {
			value = -1;
		}
		else if (getId() > motCuaKetQuaDienBien.getId()) {
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

		if (!(obj instanceof MotCuaKetQuaDienBienClp)) {
			return false;
		}

		MotCuaKetQuaDienBienClp motCuaKetQuaDienBien = (MotCuaKetQuaDienBienClp)obj;

		long primaryKey = motCuaKetQuaDienBien.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dienBienHoSoId=");
		sb.append(getDienBienHoSoId());
		sb.append(", noiDungHoSoId=");
		sb.append(getNoiDungHoSoId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienBienHoSoId</column-name><column-value><![CDATA[");
		sb.append(getDienBienHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDungHoSoId</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHoSoId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _dienBienHoSoId;
	private long _noiDungHoSoId;
	private BaseModel<?> _motCuaKetQuaDienBienRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.class;
}