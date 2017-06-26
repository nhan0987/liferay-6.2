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
import vn.dtt.gt.dk.dao.common.service.TthcLinhVucThuTucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcLinhVucThuTucClp extends BaseModelImpl<TthcLinhVucThuTuc>
	implements TthcLinhVucThuTuc {
	public TthcLinhVucThuTucClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcLinhVucThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return TthcLinhVucThuTuc.class.getName();
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
		attributes.put("TenLinhVuc", getTenLinhVuc());
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

		String TenLinhVuc = (String)attributes.get("TenLinhVuc");

		if (TenLinhVuc != null) {
			setTenLinhVuc(TenLinhVuc);
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

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenLinhVuc() {
		return _TenLinhVuc;
	}

	@Override
	public void setTenLinhVuc(String TenLinhVuc) {
		_TenLinhVuc = TenLinhVuc;

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenLinhVuc", String.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, TenLinhVuc);
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

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, TenTiengAnh);
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

		if (_tthcLinhVucThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _tthcLinhVucThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setIdCha", long.class);

				method.invoke(_tthcLinhVucThuTucRemoteModel, IdCha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcLinhVucThuTucRemoteModel() {
		return _tthcLinhVucThuTucRemoteModel;
	}

	public void setTthcLinhVucThuTucRemoteModel(
		BaseModel<?> tthcLinhVucThuTucRemoteModel) {
		_tthcLinhVucThuTucRemoteModel = tthcLinhVucThuTucRemoteModel;
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

		Class<?> remoteModelClass = _tthcLinhVucThuTucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcLinhVucThuTucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcLinhVucThuTucLocalServiceUtil.addTthcLinhVucThuTuc(this);
		}
		else {
			TthcLinhVucThuTucLocalServiceUtil.updateTthcLinhVucThuTuc(this);
		}
	}

	@Override
	public TthcLinhVucThuTuc toEscapedModel() {
		return (TthcLinhVucThuTuc)ProxyUtil.newProxyInstance(TthcLinhVucThuTuc.class.getClassLoader(),
			new Class[] { TthcLinhVucThuTuc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcLinhVucThuTucClp clone = new TthcLinhVucThuTucClp();

		clone.setId(getId());
		clone.setTenLinhVuc(getTenLinhVuc());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setIdCha(getIdCha());

		return clone;
	}

	@Override
	public int compareTo(TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		int value = 0;

		if (getId() < tthcLinhVucThuTuc.getId()) {
			value = -1;
		}
		else if (getId() > tthcLinhVucThuTuc.getId()) {
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

		if (!(obj instanceof TthcLinhVucThuTucClp)) {
			return false;
		}

		TthcLinhVucThuTucClp tthcLinhVucThuTuc = (TthcLinhVucThuTucClp)obj;

		long primaryKey = tthcLinhVucThuTuc.getPrimaryKey();

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

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", TenLinhVuc=");
		sb.append(getTenLinhVuc());
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
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenLinhVuc</column-name><column-value><![CDATA[");
		sb.append(getTenLinhVuc());
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
	private String _TenLinhVuc;
	private String _TenTiengAnh;
	private long _IdCha;
	private BaseModel<?> _tthcLinhVucThuTucRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.common.service.ClpSerializer.class;
}