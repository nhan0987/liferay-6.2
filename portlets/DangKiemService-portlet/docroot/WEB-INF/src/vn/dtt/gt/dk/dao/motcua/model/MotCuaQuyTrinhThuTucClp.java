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
import vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class MotCuaQuyTrinhThuTucClp extends BaseModelImpl<MotCuaQuyTrinhThuTuc>
	implements MotCuaQuyTrinhThuTuc {
	public MotCuaQuyTrinhThuTucClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaQuyTrinhThuTuc.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaQuyTrinhThuTuc.class.getName();
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
		attributes.put("thuTucHanhChinhId", getThuTucHanhChinhId());
		attributes.put("maQuyTrinh", getMaQuyTrinh());
		attributes.put("toChucXuLy", getToChucXuLy());
		attributes.put("soNgayXuLy", getSoNgayXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long thuTucHanhChinhId = (Long)attributes.get("thuTucHanhChinhId");

		if (thuTucHanhChinhId != null) {
			setThuTucHanhChinhId(thuTucHanhChinhId);
		}

		String maQuyTrinh = (String)attributes.get("maQuyTrinh");

		if (maQuyTrinh != null) {
			setMaQuyTrinh(maQuyTrinh);
		}

		Long toChucXuLy = (Long)attributes.get("toChucXuLy");

		if (toChucXuLy != null) {
			setToChucXuLy(toChucXuLy);
		}

		Long soNgayXuLy = (Long)attributes.get("soNgayXuLy");

		if (soNgayXuLy != null) {
			setSoNgayXuLy(soNgayXuLy);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaQuyTrinhThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaQuyTrinhThuTucRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThuTucHanhChinhId() {
		return _thuTucHanhChinhId;
	}

	@Override
	public void setThuTucHanhChinhId(long thuTucHanhChinhId) {
		_thuTucHanhChinhId = thuTucHanhChinhId;

		if (_motCuaQuyTrinhThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setThuTucHanhChinhId",
						long.class);

				method.invoke(_motCuaQuyTrinhThuTucRemoteModel,
					thuTucHanhChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaQuyTrinh() {
		return _maQuyTrinh;
	}

	@Override
	public void setMaQuyTrinh(String maQuyTrinh) {
		_maQuyTrinh = maQuyTrinh;

		if (_motCuaQuyTrinhThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setMaQuyTrinh", String.class);

				method.invoke(_motCuaQuyTrinhThuTucRemoteModel, maQuyTrinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToChucXuLy() {
		return _toChucXuLy;
	}

	@Override
	public void setToChucXuLy(long toChucXuLy) {
		_toChucXuLy = toChucXuLy;

		if (_motCuaQuyTrinhThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setToChucXuLy", long.class);

				method.invoke(_motCuaQuyTrinhThuTucRemoteModel, toChucXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoNgayXuLy() {
		return _soNgayXuLy;
	}

	@Override
	public void setSoNgayXuLy(long soNgayXuLy) {
		_soNgayXuLy = soNgayXuLy;

		if (_motCuaQuyTrinhThuTucRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaQuyTrinhThuTucRemoteModel.getClass();

				Method method = clazz.getMethod("setSoNgayXuLy", long.class);

				method.invoke(_motCuaQuyTrinhThuTucRemoteModel, soNgayXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaQuyTrinhThuTucRemoteModel() {
		return _motCuaQuyTrinhThuTucRemoteModel;
	}

	public void setMotCuaQuyTrinhThuTucRemoteModel(
		BaseModel<?> motCuaQuyTrinhThuTucRemoteModel) {
		_motCuaQuyTrinhThuTucRemoteModel = motCuaQuyTrinhThuTucRemoteModel;
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

		Class<?> remoteModelClass = _motCuaQuyTrinhThuTucRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaQuyTrinhThuTucRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaQuyTrinhThuTucLocalServiceUtil.addMotCuaQuyTrinhThuTuc(this);
		}
		else {
			MotCuaQuyTrinhThuTucLocalServiceUtil.updateMotCuaQuyTrinhThuTuc(this);
		}
	}

	@Override
	public MotCuaQuyTrinhThuTuc toEscapedModel() {
		return (MotCuaQuyTrinhThuTuc)ProxyUtil.newProxyInstance(MotCuaQuyTrinhThuTuc.class.getClassLoader(),
			new Class[] { MotCuaQuyTrinhThuTuc.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaQuyTrinhThuTucClp clone = new MotCuaQuyTrinhThuTucClp();

		clone.setId(getId());
		clone.setThuTucHanhChinhId(getThuTucHanhChinhId());
		clone.setMaQuyTrinh(getMaQuyTrinh());
		clone.setToChucXuLy(getToChucXuLy());
		clone.setSoNgayXuLy(getSoNgayXuLy());

		return clone;
	}

	@Override
	public int compareTo(MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		int value = 0;

		if (getId() < motCuaQuyTrinhThuTuc.getId()) {
			value = -1;
		}
		else if (getId() > motCuaQuyTrinhThuTuc.getId()) {
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

		if (!(obj instanceof MotCuaQuyTrinhThuTucClp)) {
			return false;
		}

		MotCuaQuyTrinhThuTucClp motCuaQuyTrinhThuTuc = (MotCuaQuyTrinhThuTucClp)obj;

		long primaryKey = motCuaQuyTrinhThuTuc.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", thuTucHanhChinhId=");
		sb.append(getThuTucHanhChinhId());
		sb.append(", maQuyTrinh=");
		sb.append(getMaQuyTrinh());
		sb.append(", toChucXuLy=");
		sb.append(getToChucXuLy());
		sb.append(", soNgayXuLy=");
		sb.append(getSoNgayXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuTucHanhChinhId</column-name><column-value><![CDATA[");
		sb.append(getThuTucHanhChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maQuyTrinh</column-name><column-value><![CDATA[");
		sb.append(getMaQuyTrinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toChucXuLy</column-name><column-value><![CDATA[");
		sb.append(getToChucXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soNgayXuLy</column-name><column-value><![CDATA[");
		sb.append(getSoNgayXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _thuTucHanhChinhId;
	private String _maQuyTrinh;
	private long _toChucXuLy;
	private long _soNgayXuLy;
	private BaseModel<?> _motCuaQuyTrinhThuTucRemoteModel;
}