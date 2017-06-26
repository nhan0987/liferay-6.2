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
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CorporationTeamClp extends BaseModelImpl<CorporationTeam>
	implements CorporationTeam {
	public CorporationTeamClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationTeam.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationTeam.class.getName();
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
		attributes.put("teamName", getTeamName());
		attributes.put("markUpDelete", getMarkUpDelete());

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

		String teamName = (String)attributes.get("teamName");

		if (teamName != null) {
			setTeamName(teamName);
		}

		Integer markUpDelete = (Integer)attributes.get("markUpDelete");

		if (markUpDelete != null) {
			setMarkUpDelete(markUpDelete);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_corporationTeamRemoteModel != null) {
			try {
				Class<?> clazz = _corporationTeamRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_corporationTeamRemoteModel, id);
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

		if (_corporationTeamRemoteModel != null) {
			try {
				Class<?> clazz = _corporationTeamRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_corporationTeamRemoteModel, corporationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTeamName() {
		return _teamName;
	}

	@Override
	public void setTeamName(String teamName) {
		_teamName = teamName;

		if (_corporationTeamRemoteModel != null) {
			try {
				Class<?> clazz = _corporationTeamRemoteModel.getClass();

				Method method = clazz.getMethod("setTeamName", String.class);

				method.invoke(_corporationTeamRemoteModel, teamName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkUpDelete() {
		return _markUpDelete;
	}

	@Override
	public void setMarkUpDelete(int markUpDelete) {
		_markUpDelete = markUpDelete;

		if (_corporationTeamRemoteModel != null) {
			try {
				Class<?> clazz = _corporationTeamRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkUpDelete", int.class);

				method.invoke(_corporationTeamRemoteModel, markUpDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCorporationTeamRemoteModel() {
		return _corporationTeamRemoteModel;
	}

	public void setCorporationTeamRemoteModel(
		BaseModel<?> corporationTeamRemoteModel) {
		_corporationTeamRemoteModel = corporationTeamRemoteModel;
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

		Class<?> remoteModelClass = _corporationTeamRemoteModel.getClass();

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

		Object returnValue = method.invoke(_corporationTeamRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CorporationTeamLocalServiceUtil.addCorporationTeam(this);
		}
		else {
			CorporationTeamLocalServiceUtil.updateCorporationTeam(this);
		}
	}

	@Override
	public CorporationTeam toEscapedModel() {
		return (CorporationTeam)ProxyUtil.newProxyInstance(CorporationTeam.class.getClassLoader(),
			new Class[] { CorporationTeam.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CorporationTeamClp clone = new CorporationTeamClp();

		clone.setId(getId());
		clone.setCorporationId(getCorporationId());
		clone.setTeamName(getTeamName());
		clone.setMarkUpDelete(getMarkUpDelete());

		return clone;
	}

	@Override
	public int compareTo(CorporationTeam corporationTeam) {
		int value = 0;

		if (getMarkUpDelete() < corporationTeam.getMarkUpDelete()) {
			value = -1;
		}
		else if (getMarkUpDelete() > corporationTeam.getMarkUpDelete()) {
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

		if (!(obj instanceof CorporationTeamClp)) {
			return false;
		}

		CorporationTeamClp corporationTeam = (CorporationTeamClp)obj;

		long primaryKey = corporationTeam.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", teamName=");
		sb.append(getTeamName());
		sb.append(", markUpDelete=");
		sb.append(getMarkUpDelete());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam");
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
			"<column><column-name>teamName</column-name><column-value><![CDATA[");
		sb.append(getTeamName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkUpDelete());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _corporationId;
	private String _teamName;
	private int _markUpDelete;
	private BaseModel<?> _corporationTeamRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}