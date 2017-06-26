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
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcPhanNhomHoSoVaiTroClp extends BaseModelImpl<TthcPhanNhomHoSoVaiTro>
	implements TthcPhanNhomHoSoVaiTro {
	public TthcPhanNhomHoSoVaiTroClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcPhanNhomHoSoVaiTro.class;
	}

	@Override
	public String getModelClassName() {
		return TthcPhanNhomHoSoVaiTro.class.getName();
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
		attributes.put("PhanNhomHoSoId", getPhanNhomHoSoId());
		attributes.put("VaiTroXuLy", getVaiTroXuLy());
		attributes.put("nhomPhieuXuLy", getNhomPhieuXuLy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long PhanNhomHoSoId = (Long)attributes.get("PhanNhomHoSoId");

		if (PhanNhomHoSoId != null) {
			setPhanNhomHoSoId(PhanNhomHoSoId);
		}

		Long VaiTroXuLy = (Long)attributes.get("VaiTroXuLy");

		if (VaiTroXuLy != null) {
			setVaiTroXuLy(VaiTroXuLy);
		}

		String nhomPhieuXuLy = (String)attributes.get("nhomPhieuXuLy");

		if (nhomPhieuXuLy != null) {
			setNhomPhieuXuLy(nhomPhieuXuLy);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcPhanNhomHoSoVaiTroRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoVaiTroRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcPhanNhomHoSoVaiTroRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhanNhomHoSoId() {
		return _PhanNhomHoSoId;
	}

	@Override
	public void setPhanNhomHoSoId(long PhanNhomHoSoId) {
		_PhanNhomHoSoId = PhanNhomHoSoId;

		if (_tthcPhanNhomHoSoVaiTroRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoVaiTroRemoteModel.getClass();

				Method method = clazz.getMethod("setPhanNhomHoSoId", long.class);

				method.invoke(_tthcPhanNhomHoSoVaiTroRemoteModel, PhanNhomHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVaiTroXuLy() {
		return _VaiTroXuLy;
	}

	@Override
	public void setVaiTroXuLy(long VaiTroXuLy) {
		_VaiTroXuLy = VaiTroXuLy;

		if (_tthcPhanNhomHoSoVaiTroRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoVaiTroRemoteModel.getClass();

				Method method = clazz.getMethod("setVaiTroXuLy", long.class);

				method.invoke(_tthcPhanNhomHoSoVaiTroRemoteModel, VaiTroXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhomPhieuXuLy() {
		return _nhomPhieuXuLy;
	}

	@Override
	public void setNhomPhieuXuLy(String nhomPhieuXuLy) {
		_nhomPhieuXuLy = nhomPhieuXuLy;

		if (_tthcPhanNhomHoSoVaiTroRemoteModel != null) {
			try {
				Class<?> clazz = _tthcPhanNhomHoSoVaiTroRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomPhieuXuLy", String.class);

				method.invoke(_tthcPhanNhomHoSoVaiTroRemoteModel, nhomPhieuXuLy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcPhanNhomHoSoVaiTroRemoteModel() {
		return _tthcPhanNhomHoSoVaiTroRemoteModel;
	}

	public void setTthcPhanNhomHoSoVaiTroRemoteModel(
		BaseModel<?> tthcPhanNhomHoSoVaiTroRemoteModel) {
		_tthcPhanNhomHoSoVaiTroRemoteModel = tthcPhanNhomHoSoVaiTroRemoteModel;
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

		Class<?> remoteModelClass = _tthcPhanNhomHoSoVaiTroRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcPhanNhomHoSoVaiTroRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcPhanNhomHoSoVaiTroLocalServiceUtil.addTthcPhanNhomHoSoVaiTro(this);
		}
		else {
			TthcPhanNhomHoSoVaiTroLocalServiceUtil.updateTthcPhanNhomHoSoVaiTro(this);
		}
	}

	@Override
	public TthcPhanNhomHoSoVaiTro toEscapedModel() {
		return (TthcPhanNhomHoSoVaiTro)ProxyUtil.newProxyInstance(TthcPhanNhomHoSoVaiTro.class.getClassLoader(),
			new Class[] { TthcPhanNhomHoSoVaiTro.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcPhanNhomHoSoVaiTroClp clone = new TthcPhanNhomHoSoVaiTroClp();

		clone.setId(getId());
		clone.setPhanNhomHoSoId(getPhanNhomHoSoId());
		clone.setVaiTroXuLy(getVaiTroXuLy());
		clone.setNhomPhieuXuLy(getNhomPhieuXuLy());

		return clone;
	}

	@Override
	public int compareTo(TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		int value = 0;

		if (getId() < tthcPhanNhomHoSoVaiTro.getId()) {
			value = -1;
		}
		else if (getId() > tthcPhanNhomHoSoVaiTro.getId()) {
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

		if (!(obj instanceof TthcPhanNhomHoSoVaiTroClp)) {
			return false;
		}

		TthcPhanNhomHoSoVaiTroClp tthcPhanNhomHoSoVaiTro = (TthcPhanNhomHoSoVaiTroClp)obj;

		long primaryKey = tthcPhanNhomHoSoVaiTro.getPrimaryKey();

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
		sb.append(", PhanNhomHoSoId=");
		sb.append(getPhanNhomHoSoId());
		sb.append(", VaiTroXuLy=");
		sb.append(getVaiTroXuLy());
		sb.append(", nhomPhieuXuLy=");
		sb.append(getNhomPhieuXuLy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PhanNhomHoSoId</column-name><column-value><![CDATA[");
		sb.append(getPhanNhomHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>VaiTroXuLy</column-name><column-value><![CDATA[");
		sb.append(getVaiTroXuLy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomPhieuXuLy</column-name><column-value><![CDATA[");
		sb.append(getNhomPhieuXuLy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private long _PhanNhomHoSoId;
	private long _VaiTroXuLy;
	private String _nhomPhieuXuLy;
	private BaseModel<?> _tthcPhanNhomHoSoVaiTroRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.common.service.ClpSerializer.class;
}