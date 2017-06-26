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
import vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcBieuMauHoSoClp extends BaseModelImpl<TthcBieuMauHoSo>
	implements TthcBieuMauHoSo {
	public TthcBieuMauHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcBieuMauHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcBieuMauHoSo.class.getName();
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
		attributes.put("MaBieuMau", getMaBieuMau());
		attributes.put("TenBieuMau", getTenBieuMau());
		attributes.put("TenTiengAnh", getTenTiengAnh());
		attributes.put("TaiLieuMau", getTaiLieuMau());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String MaBieuMau = (String)attributes.get("MaBieuMau");

		if (MaBieuMau != null) {
			setMaBieuMau(MaBieuMau);
		}

		String TenBieuMau = (String)attributes.get("TenBieuMau");

		if (TenBieuMau != null) {
			setTenBieuMau(TenBieuMau);
		}

		String TenTiengAnh = (String)attributes.get("TenTiengAnh");

		if (TenTiengAnh != null) {
			setTenTiengAnh(TenTiengAnh);
		}

		Long TaiLieuMau = (Long)attributes.get("TaiLieuMau");

		if (TaiLieuMau != null) {
			setTaiLieuMau(TaiLieuMau);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaBieuMau() {
		return _MaBieuMau;
	}

	@Override
	public void setMaBieuMau(String MaBieuMau) {
		_MaBieuMau = MaBieuMau;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaBieuMau", String.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, MaBieuMau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenBieuMau() {
		return _TenBieuMau;
	}

	@Override
	public void setTenBieuMau(String TenBieuMau) {
		_TenBieuMau = TenBieuMau;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenBieuMau", String.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, TenBieuMau);
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

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTiengAnh", String.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, TenTiengAnh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaiLieuMau() {
		return _TaiLieuMau;
	}

	@Override
	public void setTaiLieuMau(long TaiLieuMau) {
		_TaiLieuMau = TaiLieuMau;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiLieuMau", long.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, TaiLieuMau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_tthcBieuMauHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcBieuMauHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_tthcBieuMauHoSoRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcBieuMauHoSoRemoteModel() {
		return _tthcBieuMauHoSoRemoteModel;
	}

	public void setTthcBieuMauHoSoRemoteModel(
		BaseModel<?> tthcBieuMauHoSoRemoteModel) {
		_tthcBieuMauHoSoRemoteModel = tthcBieuMauHoSoRemoteModel;
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

		Class<?> remoteModelClass = _tthcBieuMauHoSoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tthcBieuMauHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcBieuMauHoSoLocalServiceUtil.addTthcBieuMauHoSo(this);
		}
		else {
			TthcBieuMauHoSoLocalServiceUtil.updateTthcBieuMauHoSo(this);
		}
	}

	@Override
	public TthcBieuMauHoSo toEscapedModel() {
		return (TthcBieuMauHoSo)ProxyUtil.newProxyInstance(TthcBieuMauHoSo.class.getClassLoader(),
			new Class[] { TthcBieuMauHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcBieuMauHoSoClp clone = new TthcBieuMauHoSoClp();

		clone.setId(getId());
		clone.setMaBieuMau(getMaBieuMau());
		clone.setTenBieuMau(getTenBieuMau());
		clone.setTenTiengAnh(getTenTiengAnh());
		clone.setTaiLieuMau(getTaiLieuMau());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(TthcBieuMauHoSo tthcBieuMauHoSo) {
		int value = 0;

		if (getId() < tthcBieuMauHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcBieuMauHoSo.getId()) {
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

		if (!(obj instanceof TthcBieuMauHoSoClp)) {
			return false;
		}

		TthcBieuMauHoSoClp tthcBieuMauHoSo = (TthcBieuMauHoSoClp)obj;

		long primaryKey = tthcBieuMauHoSo.getPrimaryKey();

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
		sb.append(", MaBieuMau=");
		sb.append(getMaBieuMau());
		sb.append(", TenBieuMau=");
		sb.append(getTenBieuMau());
		sb.append(", TenTiengAnh=");
		sb.append(getTenTiengAnh());
		sb.append(", TaiLieuMau=");
		sb.append(getTaiLieuMau());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaBieuMau</column-name><column-value><![CDATA[");
		sb.append(getMaBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenBieuMau</column-name><column-value><![CDATA[");
		sb.append(getTenBieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTiengAnh</column-name><column-value><![CDATA[");
		sb.append(getTenTiengAnh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TaiLieuMau</column-name><column-value><![CDATA[");
		sb.append(getTaiLieuMau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _MaBieuMau;
	private String _TenBieuMau;
	private String _TenTiengAnh;
	private long _TaiLieuMau;
	private Date _SynchDate;
	private BaseModel<?> _tthcBieuMauHoSoRemoteModel;
}