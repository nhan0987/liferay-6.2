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

import vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class ActionLogClp extends BaseModelImpl<ActionLog> implements ActionLog {
	public ActionLogClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActionLog.class;
	}

	@Override
	public String getModelClassName() {
		return ActionLog.class.getName();
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
		attributes.put("hosothutucid", getHosothutucid());
		attributes.put("masohoso", getMasohoso());
		attributes.put("mabiennhan", getMabiennhan());
		attributes.put("ngayxemhoso", getNgayxemhoso());
		attributes.put("noidungmanhinh", getNoidungmanhinh());
		attributes.put("importername", getImportername());
		attributes.put("corporationid", getCorporationid());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorname", getInspectorname());
		attributes.put("inspectorphone", getInspectorphone());
		attributes.put("inspectoremail", getInspectoremail());
		attributes.put("title", getTitle());
		attributes.put("contactcode", getContactcode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hosothutucid = (Long)attributes.get("hosothutucid");

		if (hosothutucid != null) {
			setHosothutucid(hosothutucid);
		}

		String masohoso = (String)attributes.get("masohoso");

		if (masohoso != null) {
			setMasohoso(masohoso);
		}

		String mabiennhan = (String)attributes.get("mabiennhan");

		if (mabiennhan != null) {
			setMabiennhan(mabiennhan);
		}

		Date ngayxemhoso = (Date)attributes.get("ngayxemhoso");

		if (ngayxemhoso != null) {
			setNgayxemhoso(ngayxemhoso);
		}

		String noidungmanhinh = (String)attributes.get("noidungmanhinh");

		if (noidungmanhinh != null) {
			setNoidungmanhinh(noidungmanhinh);
		}

		String importername = (String)attributes.get("importername");

		if (importername != null) {
			setImportername(importername);
		}

		String corporationid = (String)attributes.get("corporationid");

		if (corporationid != null) {
			setCorporationid(corporationid);
		}

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorname = (String)attributes.get("inspectorname");

		if (inspectorname != null) {
			setInspectorname(inspectorname);
		}

		String inspectorphone = (String)attributes.get("inspectorphone");

		if (inspectorphone != null) {
			setInspectorphone(inspectorphone);
		}

		String inspectoremail = (String)attributes.get("inspectoremail");

		if (inspectoremail != null) {
			setInspectoremail(inspectoremail);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String contactcode = (String)attributes.get("contactcode");

		if (contactcode != null) {
			setContactcode(contactcode);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_actionLogRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHosothutucid() {
		return _hosothutucid;
	}

	@Override
	public void setHosothutucid(long hosothutucid) {
		_hosothutucid = hosothutucid;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setHosothutucid", long.class);

				method.invoke(_actionLogRemoteModel, hosothutucid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMasohoso() {
		return _masohoso;
	}

	@Override
	public void setMasohoso(String masohoso) {
		_masohoso = masohoso;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setMasohoso", String.class);

				method.invoke(_actionLogRemoteModel, masohoso);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMabiennhan() {
		return _mabiennhan;
	}

	@Override
	public void setMabiennhan(String mabiennhan) {
		_mabiennhan = mabiennhan;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setMabiennhan", String.class);

				method.invoke(_actionLogRemoteModel, mabiennhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayxemhoso() {
		return _ngayxemhoso;
	}

	@Override
	public void setNgayxemhoso(Date ngayxemhoso) {
		_ngayxemhoso = ngayxemhoso;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayxemhoso", Date.class);

				method.invoke(_actionLogRemoteModel, ngayxemhoso);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoidungmanhinh() {
		return _noidungmanhinh;
	}

	@Override
	public void setNoidungmanhinh(String noidungmanhinh) {
		_noidungmanhinh = noidungmanhinh;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setNoidungmanhinh",
						String.class);

				method.invoke(_actionLogRemoteModel, noidungmanhinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportername() {
		return _importername;
	}

	@Override
	public void setImportername(String importername) {
		_importername = importername;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setImportername", String.class);

				method.invoke(_actionLogRemoteModel, importername);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCorporationid() {
		return _corporationid;
	}

	@Override
	public void setCorporationid(String corporationid) {
		_corporationid = corporationid;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationid", String.class);

				method.invoke(_actionLogRemoteModel, corporationid);
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

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorid", long.class);

				method.invoke(_actionLogRemoteModel, inspectorid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorname() {
		return _inspectorname;
	}

	@Override
	public void setInspectorname(String inspectorname) {
		_inspectorname = inspectorname;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorname", String.class);

				method.invoke(_actionLogRemoteModel, inspectorname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorphone() {
		return _inspectorphone;
	}

	@Override
	public void setInspectorphone(String inspectorphone) {
		_inspectorphone = inspectorphone;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorphone",
						String.class);

				method.invoke(_actionLogRemoteModel, inspectorphone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectoremail() {
		return _inspectoremail;
	}

	@Override
	public void setInspectoremail(String inspectoremail) {
		_inspectoremail = inspectoremail;

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectoremail",
						String.class);

				method.invoke(_actionLogRemoteModel, inspectoremail);
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

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_actionLogRemoteModel, title);
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

		if (_actionLogRemoteModel != null) {
			try {
				Class<?> clazz = _actionLogRemoteModel.getClass();

				Method method = clazz.getMethod("setContactcode", String.class);

				method.invoke(_actionLogRemoteModel, contactcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActionLogRemoteModel() {
		return _actionLogRemoteModel;
	}

	public void setActionLogRemoteModel(BaseModel<?> actionLogRemoteModel) {
		_actionLogRemoteModel = actionLogRemoteModel;
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

		Class<?> remoteModelClass = _actionLogRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actionLogRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActionLogLocalServiceUtil.addActionLog(this);
		}
		else {
			ActionLogLocalServiceUtil.updateActionLog(this);
		}
	}

	@Override
	public ActionLog toEscapedModel() {
		return (ActionLog)ProxyUtil.newProxyInstance(ActionLog.class.getClassLoader(),
			new Class[] { ActionLog.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActionLogClp clone = new ActionLogClp();

		clone.setId(getId());
		clone.setHosothutucid(getHosothutucid());
		clone.setMasohoso(getMasohoso());
		clone.setMabiennhan(getMabiennhan());
		clone.setNgayxemhoso(getNgayxemhoso());
		clone.setNoidungmanhinh(getNoidungmanhinh());
		clone.setImportername(getImportername());
		clone.setCorporationid(getCorporationid());
		clone.setInspectorid(getInspectorid());
		clone.setInspectorname(getInspectorname());
		clone.setInspectorphone(getInspectorphone());
		clone.setInspectoremail(getInspectoremail());
		clone.setTitle(getTitle());
		clone.setContactcode(getContactcode());

		return clone;
	}

	@Override
	public int compareTo(ActionLog actionLog) {
		int value = 0;

		if (getId() < actionLog.getId()) {
			value = -1;
		}
		else if (getId() > actionLog.getId()) {
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

		if (!(obj instanceof ActionLogClp)) {
			return false;
		}

		ActionLogClp actionLog = (ActionLogClp)obj;

		long primaryKey = actionLog.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hosothutucid=");
		sb.append(getHosothutucid());
		sb.append(", masohoso=");
		sb.append(getMasohoso());
		sb.append(", mabiennhan=");
		sb.append(getMabiennhan());
		sb.append(", ngayxemhoso=");
		sb.append(getNgayxemhoso());
		sb.append(", noidungmanhinh=");
		sb.append(getNoidungmanhinh());
		sb.append(", importername=");
		sb.append(getImportername());
		sb.append(", corporationid=");
		sb.append(getCorporationid());
		sb.append(", inspectorid=");
		sb.append(getInspectorid());
		sb.append(", inspectorname=");
		sb.append(getInspectorname());
		sb.append(", inspectorphone=");
		sb.append(getInspectorphone());
		sb.append(", inspectoremail=");
		sb.append(getInspectoremail());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", contactcode=");
		sb.append(getContactcode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hosothutucid</column-name><column-value><![CDATA[");
		sb.append(getHosothutucid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masohoso</column-name><column-value><![CDATA[");
		sb.append(getMasohoso());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mabiennhan</column-name><column-value><![CDATA[");
		sb.append(getMabiennhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayxemhoso</column-name><column-value><![CDATA[");
		sb.append(getNgayxemhoso());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noidungmanhinh</column-name><column-value><![CDATA[");
		sb.append(getNoidungmanhinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importername</column-name><column-value><![CDATA[");
		sb.append(getImportername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationid</column-name><column-value><![CDATA[");
		sb.append(getCorporationid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorid</column-name><column-value><![CDATA[");
		sb.append(getInspectorid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorname</column-name><column-value><![CDATA[");
		sb.append(getInspectorname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorphone</column-name><column-value><![CDATA[");
		sb.append(getInspectorphone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectoremail</column-name><column-value><![CDATA[");
		sb.append(getInspectoremail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactcode</column-name><column-value><![CDATA[");
		sb.append(getContactcode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hosothutucid;
	private String _masohoso;
	private String _mabiennhan;
	private Date _ngayxemhoso;
	private String _noidungmanhinh;
	private String _importername;
	private String _corporationid;
	private long _inspectorid;
	private String _inspectorname;
	private String _inspectorphone;
	private String _inspectoremail;
	private String _title;
	private String _contactcode;
	private BaseModel<?> _actionLogRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}