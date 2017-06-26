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
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDongBoMTgatewayLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class MotCuaDongBoMTgatewayClp extends BaseModelImpl<MotCuaDongBoMTgateway>
	implements MotCuaDongBoMTgateway {
	public MotCuaDongBoMTgatewayClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MotCuaDongBoMTgateway.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaDongBoMTgateway.class.getName();
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
		attributes.put("phieuXuLyChinhId", getPhieuXuLyChinhId());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("trangThai", getTrangThai());

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

		Long phieuXuLyChinhId = (Long)attributes.get("phieuXuLyChinhId");

		if (phieuXuLyChinhId != null) {
			setPhieuXuLyChinhId(phieuXuLyChinhId);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_motCuaDongBoMTgatewayRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDongBoMTgatewayRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_motCuaDongBoMTgatewayRemoteModel, id);
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

		if (_motCuaDongBoMTgatewayRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDongBoMTgatewayRemoteModel.getClass();

				Method method = clazz.getMethod("setDienBienHoSoId", long.class);

				method.invoke(_motCuaDongBoMTgatewayRemoteModel, dienBienHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyChinhId() {
		return _phieuXuLyChinhId;
	}

	@Override
	public void setPhieuXuLyChinhId(long phieuXuLyChinhId) {
		_phieuXuLyChinhId = phieuXuLyChinhId;

		if (_motCuaDongBoMTgatewayRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDongBoMTgatewayRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyChinhId",
						long.class);

				method.invoke(_motCuaDongBoMTgatewayRemoteModel,
					phieuXuLyChinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;

		if (_motCuaDongBoMTgatewayRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDongBoMTgatewayRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDate", Date.class);

				method.invoke(_motCuaDongBoMTgatewayRemoteModel, modifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;

		if (_motCuaDongBoMTgatewayRemoteModel != null) {
			try {
				Class<?> clazz = _motCuaDongBoMTgatewayRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_motCuaDongBoMTgatewayRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMotCuaDongBoMTgatewayRemoteModel() {
		return _motCuaDongBoMTgatewayRemoteModel;
	}

	public void setMotCuaDongBoMTgatewayRemoteModel(
		BaseModel<?> motCuaDongBoMTgatewayRemoteModel) {
		_motCuaDongBoMTgatewayRemoteModel = motCuaDongBoMTgatewayRemoteModel;
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

		Class<?> remoteModelClass = _motCuaDongBoMTgatewayRemoteModel.getClass();

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

		Object returnValue = method.invoke(_motCuaDongBoMTgatewayRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaDongBoMTgatewayLocalServiceUtil.addMotCuaDongBoMTgateway(this);
		}
		else {
			MotCuaDongBoMTgatewayLocalServiceUtil.updateMotCuaDongBoMTgateway(this);
		}
	}

	@Override
	public MotCuaDongBoMTgateway toEscapedModel() {
		return (MotCuaDongBoMTgateway)ProxyUtil.newProxyInstance(MotCuaDongBoMTgateway.class.getClassLoader(),
			new Class[] { MotCuaDongBoMTgateway.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MotCuaDongBoMTgatewayClp clone = new MotCuaDongBoMTgatewayClp();

		clone.setId(getId());
		clone.setDienBienHoSoId(getDienBienHoSoId());
		clone.setPhieuXuLyChinhId(getPhieuXuLyChinhId());
		clone.setModifyDate(getModifyDate());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		int value = 0;

		if (getId() < motCuaDongBoMTgateway.getId()) {
			value = -1;
		}
		else if (getId() > motCuaDongBoMTgateway.getId()) {
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

		if (!(obj instanceof MotCuaDongBoMTgatewayClp)) {
			return false;
		}

		MotCuaDongBoMTgatewayClp motCuaDongBoMTgateway = (MotCuaDongBoMTgatewayClp)obj;

		long primaryKey = motCuaDongBoMTgateway.getPrimaryKey();

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
		sb.append(", dienBienHoSoId=");
		sb.append(getDienBienHoSoId());
		sb.append(", phieuXuLyChinhId=");
		sb.append(getPhieuXuLyChinhId());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway");
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
			"<column><column-name>phieuXuLyChinhId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyChinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _dienBienHoSoId;
	private long _phieuXuLyChinhId;
	private Date _modifyDate;
	private String _trangThai;
	private BaseModel<?> _motCuaDongBoMTgatewayRemoteModel;
}