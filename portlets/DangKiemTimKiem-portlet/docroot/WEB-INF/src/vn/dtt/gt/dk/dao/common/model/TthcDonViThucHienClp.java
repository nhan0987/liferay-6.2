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
import vn.dtt.gt.dk.dao.common.service.TthcDonViThucHienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcDonViThucHienClp extends BaseModelImpl<TthcDonViThucHien>
	implements TthcDonViThucHien {
	public TthcDonViThucHienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcDonViThucHien.class;
	}

	@Override
	public String getModelClassName() {
		return TthcDonViThucHien.class.getName();
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
		attributes.put("ThuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("MaDvth", getMaDvth());
		attributes.put("TenDvth", getTenDvth());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("ToChuc", getToChuc());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long ThuTucHanhChinhId = (Long)attributes.get("ThuTucHanhChinhId");

		if (ThuTucHanhChinhId != null) {
			setThuTucHanhChinhId(ThuTucHanhChinhId);
		}

		String MaDvth = (String)attributes.get("MaDvth");

		if (MaDvth != null) {
			setMaDvth(MaDvth);
		}

		String TenDvth = (String)attributes.get("TenDvth");

		if (TenDvth != null) {
			setTenDvth(TenDvth);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long ToChuc = (Long)attributes.get("ToChuc");

		if (ToChuc != null) {
			setToChuc(ToChuc);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcDonViThucHienRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _ThuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long ThuTucHanhChinhId) {
		_ThuTucHanhChinhId = ThuTucHanhChinhId;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_tthcDonViThucHienRemoteModel, ThuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaDvth() {
		return _MaDvth;
	}

	@Override
	public void setMaDvth(String MaDvth) {
		_MaDvth = MaDvth;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setMaDvth", String.class);

				method.invoke(_tthcDonViThucHienRemoteModel, MaDvth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDvth() {
		return _TenDvth;
	}

	@Override
	public void setTenDvth(String TenDvth) {
		_TenDvth = TenDvth;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDvth", String.class);

				method.invoke(_tthcDonViThucHienRemoteModel, TenDvth);
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

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcDonViThucHienRemoteModel, TenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChuc() {
		return _ToChuc;
	}

	@Override
	public void setToChuc(long ToChuc) {
		_ToChuc = ToChuc;

		if (_tthcDonViThucHienRemoteModel != null) {
			try {
				Class<?> clazz = _tthcDonViThucHienRemoteModel.getClass();

				Method method = clazz.getMethod("setToChuc", long.class);

				method.invoke(_tthcDonViThucHienRemoteModel, ToChuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcDonViThucHienRemoteModel() {
		return _tthcDonViThucHienRemoteModel;
	}

	public void setTthcDonViThucHienRemoteModel(
		BaseModel<?> tthcDonViThucHienRemoteModel) {
		_tthcDonViThucHienRemoteModel = tthcDonViThucHienRemoteModel;
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

		Class<?> remoteModelClass = _tthcDonViThucHienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcDonViThucHienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcDonViThucHienLocalServiceUtil.addTthcDonViThucHien(this);
		}
		else {
			TthcDonViThucHienLocalServiceUtil.updateTthcDonViThucHien(this);
		}
	}

	@Override
	public TthcDonViThucHien toEscapedModel() {
		return (TthcDonViThucHien)ProxyUtil.newProxyInstance(TthcDonViThucHien.class.getClassLoader(),
			new Class[] { TthcDonViThucHien.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcDonViThucHienClp clone = new TthcDonViThucHienClp();

		clone.setId(getId());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setMaDvth(getMaDvth());
		clone.setTenDvth(getTenDvth());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setToChuc(getToChuc());

		return clone;
	}

	@Override
	public int compareTo(TthcDonViThucHien tthcDonViThucHien) {
		int value = 0;

		if (getId() < tthcDonViThucHien.getId()) {
			value = -1;
		}
		else if (getId() > tthcDonViThucHien.getId()) {
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

		if (!(obj instanceof TthcDonViThucHienClp)) {
			return false;
		}

		TthcDonViThucHienClp tthcDonViThucHien = (TthcDonViThucHienClp)obj;

		long primaryKey = tthcDonViThucHien.getPrimaryKey();

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
		sb.append(", ThuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", MaDvth=");
		sb.append(getMaDvth());
		sb.append(", TenDvth=");
		sb.append(getTenDvth());
		sb.append(", TenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", ToChuc=");
		sb.append(getToChuc());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaDvth</column-name><column-value><![CDATA[");
		sb.append(getMaDvth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDvth</column-name><column-value><![CDATA[");
		sb.append(getTenDvth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ToChuc</column-name><column-value><![CDATA[");
		sb.append(getToChuc());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private long _ThuTucHanhChinhId;
	private String _MaDvth;
	private String _TenDvth;
	private String _TenTiengAnh;
	private long _ToChuc;
	private BaseModel<?> _tthcDonViThucHienRemoteModel;
}