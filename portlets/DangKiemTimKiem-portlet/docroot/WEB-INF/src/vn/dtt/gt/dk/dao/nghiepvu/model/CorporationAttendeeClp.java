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
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CorporationAttendeeClp extends BaseModelImpl<CorporationAttendee>
	implements CorporationAttendee {
	public CorporationAttendeeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationAttendee.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationAttendee.class.getName();
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
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("sequence", getSequence());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorRole", getInspectorRole());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long sequence = (Long)attributes.get("sequence");

		if (sequence != null) {
			setSequence(sequence);
		}

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		Long inspectorRole = (Long)attributes.get("inspectorRole");

		if (inspectorRole != null) {
			setInspectorRole(inspectorRole);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_corporationAttendeeRemoteModel != null) {
			try {
				Class<?> clazz = _corporationAttendeeRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_corporationAttendeeRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;

		if (_corporationAttendeeRemoteModel != null) {
			try {
				Class<?> clazz = _corporationAttendeeRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedInspectionId",
						long.class);

				method.invoke(_corporationAttendeeRemoteModel,
					confirmedInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSequence() {
		return _sequence;
	}

	@Override
	public void setSequence(long sequence) {
		_sequence = sequence;

		if (_corporationAttendeeRemoteModel != null) {
			try {
				Class<?> clazz = _corporationAttendeeRemoteModel.getClass();

				Method method = clazz.getMethod("setSequence", long.class);

				method.invoke(_corporationAttendeeRemoteModel, sequence);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectorid() {
		return _inspectorid;
	}

	@Override
	public void setInspectorid(long inspectorid) {
		_inspectorid = inspectorid;

		if (_corporationAttendeeRemoteModel != null) {
			try {
				Class<?> clazz = _corporationAttendeeRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorid", long.class);

				method.invoke(_corporationAttendeeRemoteModel, inspectorid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorName() {
		return _inspectorName;
	}

	@Override
	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;

		if (_corporationAttendeeRemoteModel != null) {
			try {
				Class<?> clazz = _corporationAttendeeRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorName", String.class);

				method.invoke(_corporationAttendeeRemoteModel, inspectorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectorRole() {
		return _inspectorRole;
	}

	@Override
	public void setInspectorRole(long inspectorRole) {
		_inspectorRole = inspectorRole;

		if (_corporationAttendeeRemoteModel != null) {
			try {
				Class<?> clazz = _corporationAttendeeRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorRole", long.class);

				method.invoke(_corporationAttendeeRemoteModel, inspectorRole);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCorporationAttendeeRemoteModel() {
		return _corporationAttendeeRemoteModel;
	}

	public void setCorporationAttendeeRemoteModel(
		BaseModel<?> corporationAttendeeRemoteModel) {
		_corporationAttendeeRemoteModel = corporationAttendeeRemoteModel;
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

		Class<?> remoteModelClass = _corporationAttendeeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_corporationAttendeeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CorporationAttendeeLocalServiceUtil.addCorporationAttendee(this);
		}
		else {
			CorporationAttendeeLocalServiceUtil.updateCorporationAttendee(this);
		}
	}

	@Override
	public CorporationAttendee toEscapedModel() {
		return (CorporationAttendee)ProxyUtil.newProxyInstance(CorporationAttendee.class.getClassLoader(),
			new Class[] { CorporationAttendee.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CorporationAttendeeClp clone = new CorporationAttendeeClp();

		clone.setId(getId());
		clone.setConfirmedInspectionId(getConfirmedInspectionId());
		clone.setSequence(getSequence());
		clone.setInspectorid(getInspectorid());
		clone.setInspectorName(getInspectorName());
		clone.setInspectorRole(getInspectorRole());

		return clone;
	}

	@Override
	public int compareTo(CorporationAttendee corporationAttendee) {
		int value = 0;

		if (getId() < corporationAttendee.getId()) {
			value = -1;
		}
		else if (getId() > corporationAttendee.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof CorporationAttendeeClp)) {
			return false;
		}

		CorporationAttendeeClp corporationAttendee = (CorporationAttendeeClp)obj;

		long primaryKey = corporationAttendee.getPrimaryKey();

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
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", sequence=");
		sb.append(getSequence());
		sb.append(", inspectorid=");
		sb.append(getInspectorid());
		sb.append(", inspectorName=");
		sb.append(getInspectorName());
		sb.append(", inspectorRole=");
		sb.append(getInspectorRole());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedInspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequence</column-name><column-value><![CDATA[");
		sb.append(getSequence());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorid</column-name><column-value><![CDATA[");
		sb.append(getInspectorid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorName</column-name><column-value><![CDATA[");
		sb.append(getInspectorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorRole</column-name><column-value><![CDATA[");
		sb.append(getInspectorRole());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _confirmedInspectionId;
	private long _sequence;
	private long _inspectorid;
	private String _inspectorName;
	private long _inspectorRole;
	private BaseModel<?> _corporationAttendeeRemoteModel;
}