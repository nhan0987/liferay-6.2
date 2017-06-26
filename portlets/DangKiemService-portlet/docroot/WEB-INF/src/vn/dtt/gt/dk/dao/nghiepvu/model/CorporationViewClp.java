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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class CorporationViewClp extends BaseModelImpl<CorporationView>
	implements CorporationView {
	public CorporationViewClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationView.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationView.class.getName();
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
		attributes.put("corporationId", getCorporationId());
		attributes.put("corporationName", getCorporationName());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("isLeader", getIsLeader());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Integer isLeader = (Integer)attributes.get("isLeader");

		if (isLeader != null) {
			setIsLeader(isLeader);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_corporationViewRemoteModel != null) {
			try {
				Class<?> clazz = _corporationViewRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_corporationViewRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCorporationId() {
		return _corporationId;
	}

	@Override
	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;

		if (_corporationViewRemoteModel != null) {
			try {
				Class<?> clazz = _corporationViewRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_corporationViewRemoteModel, corporationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCorporationName() {
		return _corporationName;
	}

	@Override
	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;

		if (_corporationViewRemoteModel != null) {
			try {
				Class<?> clazz = _corporationViewRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationName",
						String.class);

				method.invoke(_corporationViewRemoteModel, corporationName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectorId() {
		return _inspectorId;
	}

	@Override
	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;

		if (_corporationViewRemoteModel != null) {
			try {
				Class<?> clazz = _corporationViewRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorId", long.class);

				method.invoke(_corporationViewRemoteModel, inspectorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsLeader() {
		return _isLeader;
	}

	@Override
	public void setIsLeader(int isLeader) {
		_isLeader = isLeader;

		if (_corporationViewRemoteModel != null) {
			try {
				Class<?> clazz = _corporationViewRemoteModel.getClass();

				Method method = clazz.getMethod("setIsLeader", int.class);

				method.invoke(_corporationViewRemoteModel, isLeader);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_corporationViewRemoteModel != null) {
			try {
				Class<?> clazz = _corporationViewRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_corporationViewRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCorporationViewRemoteModel() {
		return _corporationViewRemoteModel;
	}

	public void setCorporationViewRemoteModel(
		BaseModel<?> corporationViewRemoteModel) {
		_corporationViewRemoteModel = corporationViewRemoteModel;
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

		Class<?> remoteModelClass = _corporationViewRemoteModel.getClass();

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

		Object returnValue = method.invoke(_corporationViewRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CorporationViewLocalServiceUtil.addCorporationView(this);
		}
		else {
			CorporationViewLocalServiceUtil.updateCorporationView(this);
		}
	}

	@Override
	public CorporationView toEscapedModel() {
		return (CorporationView)ProxyUtil.newProxyInstance(CorporationView.class.getClassLoader(),
			new Class[] { CorporationView.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CorporationViewClp clone = new CorporationViewClp();

		clone.setId(getId());
		clone.setCorporationId(getCorporationId());
		clone.setCorporationName(getCorporationName());
		clone.setInspectorId(getInspectorId());
		clone.setIsLeader(getIsLeader());
		clone.setSynchdate(getSynchdate());

		return clone;
	}

	@Override
	public int compareTo(CorporationView corporationView) {
		int value = 0;

		if (getId() < corporationView.getId()) {
			value = -1;
		}
		else if (getId() > corporationView.getId()) {
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

		if (!(obj instanceof CorporationViewClp)) {
			return false;
		}

		CorporationViewClp corporationView = (CorporationViewClp)obj;

		long primaryKey = corporationView.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", corporationName=");
		sb.append(getCorporationName());
		sb.append(", inspectorId=");
		sb.append(getInspectorId());
		sb.append(", isLeader=");
		sb.append(getIsLeader());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationName</column-name><column-value><![CDATA[");
		sb.append(getCorporationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorId</column-name><column-value><![CDATA[");
		sb.append(getInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isLeader</column-name><column-value><![CDATA[");
		sb.append(getIsLeader());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _corporationId;
	private String _corporationName;
	private long _inspectorId;
	private int _isLeader;
	private Date _synchdate;
	private BaseModel<?> _corporationViewRemoteModel;
}