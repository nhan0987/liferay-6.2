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
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CorporationInspectorClp extends BaseModelImpl<CorporationInspector>
	implements CorporationInspector {
	public CorporationInspectorClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CorporationInspector.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationInspector.class.getName();
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
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorPhone", getInspectorPhone());
		attributes.put("inspectorEmail", getInspectorEmail());
		attributes.put("contactcode", getContactcode());
		attributes.put("regularTthc", getRegularTthc());
		attributes.put("searchVehicle", getSearchVehicle());
		attributes.put("teamId", getTeamId());
		attributes.put("markupTeamLeader", getMarkupTeamLeader());
		attributes.put("markUpBoss", getMarkUpBoss());
		attributes.put("place", getPlace());
		attributes.put("title", getTitle());
		attributes.put("filechukyId", getFilechukyId());

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

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		String inspectorPhone = (String)attributes.get("inspectorPhone");

		if (inspectorPhone != null) {
			setInspectorPhone(inspectorPhone);
		}

		String inspectorEmail = (String)attributes.get("inspectorEmail");

		if (inspectorEmail != null) {
			setInspectorEmail(inspectorEmail);
		}

		String contactcode = (String)attributes.get("contactcode");

		if (contactcode != null) {
			setContactcode(contactcode);
		}

		Long regularTthc = (Long)attributes.get("regularTthc");

		if (regularTthc != null) {
			setRegularTthc(regularTthc);
		}

		Integer searchVehicle = (Integer)attributes.get("searchVehicle");

		if (searchVehicle != null) {
			setSearchVehicle(searchVehicle);
		}

		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Integer markupTeamLeader = (Integer)attributes.get("markupTeamLeader");

		if (markupTeamLeader != null) {
			setMarkupTeamLeader(markupTeamLeader);
		}

		Integer markUpBoss = (Integer)attributes.get("markUpBoss");

		if (markUpBoss != null) {
			setMarkUpBoss(markUpBoss);
		}

		String place = (String)attributes.get("place");

		if (place != null) {
			setPlace(place);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long filechukyId = (Long)attributes.get("filechukyId");

		if (filechukyId != null) {
			setFilechukyId(filechukyId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_corporationInspectorRemoteModel, id);
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

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_corporationInspectorRemoteModel, corporationId);
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

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorid", long.class);

				method.invoke(_corporationInspectorRemoteModel, inspectorid);
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

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorName", String.class);

				method.invoke(_corporationInspectorRemoteModel, inspectorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorPhone() {
		return _inspectorPhone;
	}

	@Override
	public void setInspectorPhone(String inspectorPhone) {
		_inspectorPhone = inspectorPhone;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorPhone",
						String.class);

				method.invoke(_corporationInspectorRemoteModel, inspectorPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorEmail() {
		return _inspectorEmail;
	}

	@Override
	public void setInspectorEmail(String inspectorEmail) {
		_inspectorEmail = inspectorEmail;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorEmail",
						String.class);

				method.invoke(_corporationInspectorRemoteModel, inspectorEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactcode() {
		return _contactcode;
	}

	@Override
	public void setContactcode(String contactcode) {
		_contactcode = contactcode;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setContactcode", String.class);

				method.invoke(_corporationInspectorRemoteModel, contactcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegularTthc() {
		return _regularTthc;
	}

	@Override
	public void setRegularTthc(long regularTthc) {
		_regularTthc = regularTthc;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setRegularTthc", long.class);

				method.invoke(_corporationInspectorRemoteModel, regularTthc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSearchVehicle() {
		return _searchVehicle;
	}

	@Override
	public void setSearchVehicle(int searchVehicle) {
		_searchVehicle = searchVehicle;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setSearchVehicle", int.class);

				method.invoke(_corporationInspectorRemoteModel, searchVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTeamId() {
		return _teamId;
	}

	@Override
	public void setTeamId(long teamId) {
		_teamId = teamId;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setTeamId", long.class);

				method.invoke(_corporationInspectorRemoteModel, teamId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkupTeamLeader() {
		return _markupTeamLeader;
	}

	@Override
	public void setMarkupTeamLeader(int markupTeamLeader) {
		_markupTeamLeader = markupTeamLeader;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupTeamLeader", int.class);

				method.invoke(_corporationInspectorRemoteModel, markupTeamLeader);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkUpBoss() {
		return _markUpBoss;
	}

	@Override
	public void setMarkUpBoss(int markUpBoss) {
		_markUpBoss = markUpBoss;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkUpBoss", int.class);

				method.invoke(_corporationInspectorRemoteModel, markUpBoss);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlace() {
		return _place;
	}

	@Override
	public void setPlace(String place) {
		_place = place;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setPlace", String.class);

				method.invoke(_corporationInspectorRemoteModel, place);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_corporationInspectorRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFilechukyId() {
		return _filechukyId;
	}

	@Override
	public void setFilechukyId(long filechukyId) {
		_filechukyId = filechukyId;

		if (_corporationInspectorRemoteModel != null) {
			try {
				Class<?> clazz = _corporationInspectorRemoteModel.getClass();

				Method method = clazz.getMethod("setFilechukyId", long.class);

				method.invoke(_corporationInspectorRemoteModel, filechukyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCorporationInspectorRemoteModel() {
		return _corporationInspectorRemoteModel;
	}

	public void setCorporationInspectorRemoteModel(
		BaseModel<?> corporationInspectorRemoteModel) {
		_corporationInspectorRemoteModel = corporationInspectorRemoteModel;
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

		Class<?> remoteModelClass = _corporationInspectorRemoteModel.getClass();

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

		Object returnValue = method.invoke(_corporationInspectorRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CorporationInspectorLocalServiceUtil.addCorporationInspector(this);
		}
		else {
			CorporationInspectorLocalServiceUtil.updateCorporationInspector(this);
		}
	}

	@Override
	public CorporationInspector toEscapedModel() {
		return (CorporationInspector)ProxyUtil.newProxyInstance(CorporationInspector.class.getClassLoader(),
			new Class[] { CorporationInspector.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CorporationInspectorClp clone = new CorporationInspectorClp();

		clone.setId(getId());
		clone.setCorporationId(getCorporationId());
		clone.setInspectorid(getInspectorid());
		clone.setInspectorName(getInspectorName());
		clone.setInspectorPhone(getInspectorPhone());
		clone.setInspectorEmail(getInspectorEmail());
		clone.setContactcode(getContactcode());
		clone.setRegularTthc(getRegularTthc());
		clone.setSearchVehicle(getSearchVehicle());
		clone.setTeamId(getTeamId());
		clone.setMarkupTeamLeader(getMarkupTeamLeader());
		clone.setMarkUpBoss(getMarkUpBoss());
		clone.setPlace(getPlace());
		clone.setTitle(getTitle());
		clone.setFilechukyId(getFilechukyId());

		return clone;
	}

	@Override
	public int compareTo(CorporationInspector corporationInspector) {
		int value = 0;

		value = getInspectorName()
					.compareTo(corporationInspector.getInspectorName());

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

		if (!(obj instanceof CorporationInspectorClp)) {
			return false;
		}

		CorporationInspectorClp corporationInspector = (CorporationInspectorClp)obj;

		long primaryKey = corporationInspector.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", inspectorid=");
		sb.append(getInspectorid());
		sb.append(", inspectorName=");
		sb.append(getInspectorName());
		sb.append(", inspectorPhone=");
		sb.append(getInspectorPhone());
		sb.append(", inspectorEmail=");
		sb.append(getInspectorEmail());
		sb.append(", contactcode=");
		sb.append(getContactcode());
		sb.append(", regularTthc=");
		sb.append(getRegularTthc());
		sb.append(", searchVehicle=");
		sb.append(getSearchVehicle());
		sb.append(", teamId=");
		sb.append(getTeamId());
		sb.append(", markupTeamLeader=");
		sb.append(getMarkupTeamLeader());
		sb.append(", markUpBoss=");
		sb.append(getMarkUpBoss());
		sb.append(", place=");
		sb.append(getPlace());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", filechukyId=");
		sb.append(getFilechukyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector");
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
			"<column><column-name>inspectorid</column-name><column-value><![CDATA[");
		sb.append(getInspectorid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorName</column-name><column-value><![CDATA[");
		sb.append(getInspectorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorPhone</column-name><column-value><![CDATA[");
		sb.append(getInspectorPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorEmail</column-name><column-value><![CDATA[");
		sb.append(getInspectorEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactcode</column-name><column-value><![CDATA[");
		sb.append(getContactcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regularTthc</column-name><column-value><![CDATA[");
		sb.append(getRegularTthc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>searchVehicle</column-name><column-value><![CDATA[");
		sb.append(getSearchVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>teamId</column-name><column-value><![CDATA[");
		sb.append(getTeamId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupTeamLeader</column-name><column-value><![CDATA[");
		sb.append(getMarkupTeamLeader());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpBoss</column-name><column-value><![CDATA[");
		sb.append(getMarkUpBoss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>place</column-name><column-value><![CDATA[");
		sb.append(getPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filechukyId</column-name><column-value><![CDATA[");
		sb.append(getFilechukyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _corporationId;
	private long _inspectorid;
	private String _inspectorName;
	private String _inspectorPhone;
	private String _inspectorEmail;
	private String _contactcode;
	private long _regularTthc;
	private int _searchVehicle;
	private long _teamId;
	private int _markupTeamLeader;
	private int _markUpBoss;
	private String _place;
	private String _title;
	private long _filechukyId;
	private BaseModel<?> _corporationInspectorRemoteModel;
}