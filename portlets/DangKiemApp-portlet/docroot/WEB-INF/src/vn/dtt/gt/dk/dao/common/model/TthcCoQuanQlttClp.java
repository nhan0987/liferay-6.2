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
import vn.dtt.gt.dk.dao.common.service.TthcCoQuanQlttLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcCoQuanQlttClp extends BaseModelImpl<TthcCoQuanQltt>
	implements TthcCoQuanQltt {
	public TthcCoQuanQlttClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcCoQuanQltt.class;
	}

	@Override
	public String getModelClassName() {
		return TthcCoQuanQltt.class.getName();
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
		attributes.put("TenCoQuanQltt", getTenCoQuanQltt());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("IdCha", getIdCha());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String TenCoQuanQltt = (String)attributes.get("TenCoQuanQltt");

		if (TenCoQuanQltt != null) {
			setTenCoQuanQltt(TenCoQuanQltt);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long IdCha = (Long)attributes.get("IdCha");

		if (IdCha != null) {
			setIdCha(IdCha);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcCoQuanQlttRemoteModel != null) {
			try {
				Class<?> clazz = _tthcCoQuanQlttRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcCoQuanQlttRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenCoQuanQltt() {
		return _TenCoQuanQltt;
	}

	@Override
	public void setTenCoQuanQltt(String TenCoQuanQltt) {
		_TenCoQuanQltt = TenCoQuanQltt;

		if (_tthcCoQuanQlttRemoteModel != null) {
			try {
				Class<?> clazz = _tthcCoQuanQlttRemoteModel.getClass();

				Method method = clazz.getMethod("setTenCoQuanQltt", String.class);

				method.invoke(_tthcCoQuanQlttRemoteModel, TenCoQuanQltt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTiengAnh() {
		return _TenTiengAnh;
	}

	@Override
	public void setTenTiengAnh(String TenTiengAnh) {
		_TenTiengAnh = TenTiengAnh;

		if (_tthcCoQuanQlttRemoteModel != null) {
			try {
				Class<?> clazz = _tthcCoQuanQlttRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcCoQuanQlttRemoteModel, TenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdCha() {
		return _IdCha;
	}

	@Override
	public void setIdCha(long IdCha) {
		_IdCha = IdCha;

		if (_tthcCoQuanQlttRemoteModel != null) {
			try {
				Class<?> clazz = _tthcCoQuanQlttRemoteModel.getClass();

				Method method = clazz.getMethod("setIdCha", long.class);

				method.invoke(_tthcCoQuanQlttRemoteModel, IdCha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcCoQuanQlttRemoteModel() {
		return _tthcCoQuanQlttRemoteModel;
	}

	public void setTthcCoQuanQlttRemoteModel(
		BaseModel<?> tthcCoQuanQlttRemoteModel) {
		_tthcCoQuanQlttRemoteModel = tthcCoQuanQlttRemoteModel;
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

		Class<?> remoteModelClass = _tthcCoQuanQlttRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcCoQuanQlttRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcCoQuanQlttLocalServiceUtil.addTthcCoQuanQltt(this);
		}
		else {
			TthcCoQuanQlttLocalServiceUtil.updateTthcCoQuanQltt(this);
		}
	}

	@Override
	public TthcCoQuanQltt toEscapedModel() {
		return (TthcCoQuanQltt)ProxyUtil.newProxyInstance(TthcCoQuanQltt.class.getClassLoader(),
			new Class[] { TthcCoQuanQltt.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcCoQuanQlttClp clone = new TthcCoQuanQlttClp();

		clone.setId(getId());
		clone.setTenCoQuanQltt(getTenCoQuanQltt());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setIdCha(getIdCha());

		return clone;
	}

	@Override
	public int compareTo(TthcCoQuanQltt tthcCoQuanQltt) {
		int value = 0;

		if (getId() < tthcCoQuanQltt.getId()) {
			value = -1;
		}
		else if (getId() > tthcCoQuanQltt.getId()) {
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

		if (!(obj instanceof TthcCoQuanQlttClp)) {
			return false;
		}

		TthcCoQuanQlttClp tthcCoQuanQltt = (TthcCoQuanQlttClp)obj;

		long primaryKey = tthcCoQuanQltt.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", TenCoQuanQltt=");
		sb.append(getTenCoQuanQltt());
		sb.append(", TenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", IdCha=");
		sb.append(getIdCha());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenCoQuanQltt</column-name><column-value><![CDATA[");
		sb.append(getTenCoQuanQltt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IdCha</column-name><column-value><![CDATA[");
		sb.append(getIdCha());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _TenCoQuanQltt;
	private String _TenTiengAnh;
	private long _IdCha;
	private BaseModel<?> _tthcCoQuanQlttRemoteModel;
}