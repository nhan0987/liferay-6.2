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
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class ControlReportClp extends BaseModelImpl<ControlReport>
	implements ControlReport {
	public ControlReportClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ControlReport.class;
	}

	@Override
	public String getModelClassName() {
		return ControlReport.class.getName();
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
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("inspectionrecordId", getInspectionrecordId());
		attributes.put("hosothutucId", getHosothutucId());
		attributes.put("controlRequirementId", getControlRequirementId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("reportDate", getReportDate());
		attributes.put("description", getDescription());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		Long inspectionrecordId = (Long)attributes.get("inspectionrecordId");

		if (inspectionrecordId != null) {
			setInspectionrecordId(inspectionrecordId);
		}

		Long hosothutucId = (Long)attributes.get("hosothutucId");

		if (hosothutucId != null) {
			setHosothutucId(hosothutucId);
		}

		Long controlRequirementId = (Long)attributes.get("controlRequirementId");

		if (controlRequirementId != null) {
			setControlRequirementId(controlRequirementId);
		}

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		Date reportDate = (Date)attributes.get("reportDate");

		if (reportDate != null) {
			setReportDate(reportDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_controlReportRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_controlReportRemoteModel, registeredInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionrecordId() {
		return _inspectionrecordId;
	}

	@Override
	public void setInspectionrecordId(long inspectionrecordId) {
		_inspectionrecordId = inspectionrecordId;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionrecordId",
						long.class);

				method.invoke(_controlReportRemoteModel, inspectionrecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHosothutucId() {
		return _hosothutucId;
	}

	@Override
	public void setHosothutucId(long hosothutucId) {
		_hosothutucId = hosothutucId;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setHosothutucId", long.class);

				method.invoke(_controlReportRemoteModel, hosothutucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getControlRequirementId() {
		return _controlRequirementId;
	}

	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_controlRequirementId = controlRequirementId;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setControlRequirementId",
						long.class);

				method.invoke(_controlReportRemoteModel, controlRequirementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequirementNumber() {
		return _requirementNumber;
	}

	@Override
	public void setRequirementNumber(String requirementNumber) {
		_requirementNumber = requirementNumber;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setRequirementNumber",
						String.class);

				method.invoke(_controlReportRemoteModel, requirementNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReportNumber() {
		return _reportNumber;
	}

	@Override
	public void setReportNumber(String reportNumber) {
		_reportNumber = reportNumber;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setReportNumber", String.class);

				method.invoke(_controlReportRemoteModel, reportNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReportDate() {
		return _reportDate;
	}

	@Override
	public void setReportDate(Date reportDate) {
		_reportDate = reportDate;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setReportDate", Date.class);

				method.invoke(_controlReportRemoteModel, reportDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_controlReportRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_controlReportRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuxulyphuId() {
		return _phieuxulyphuId;
	}

	@Override
	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_phieuxulyphuId = phieuxulyphuId;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuxulyphuId", long.class);

				method.invoke(_controlReportRemoteModel, phieuxulyphuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignName() {
		return _signName;
	}

	@Override
	public void setSignName(String signName) {
		_signName = signName;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_controlReportRemoteModel, signName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignTitle() {
		return _signTitle;
	}

	@Override
	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_controlReportRemoteModel, signTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignPlace() {
		return _signPlace;
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_controlReportRemoteModel, signPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;

		if (_controlReportRemoteModel != null) {
			try {
				Class<?> clazz = _controlReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_controlReportRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getControlReportRemoteModel() {
		return _controlReportRemoteModel;
	}

	public void setControlReportRemoteModel(
		BaseModel<?> controlReportRemoteModel) {
		_controlReportRemoteModel = controlReportRemoteModel;
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

		Class<?> remoteModelClass = _controlReportRemoteModel.getClass();

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

		Object returnValue = method.invoke(_controlReportRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ControlReportLocalServiceUtil.addControlReport(this);
		}
		else {
			ControlReportLocalServiceUtil.updateControlReport(this);
		}
	}

	@Override
	public ControlReport toEscapedModel() {
		return (ControlReport)ProxyUtil.newProxyInstance(ControlReport.class.getClassLoader(),
			new Class[] { ControlReport.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ControlReportClp clone = new ControlReportClp();

		clone.setId(getId());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setInspectionrecordId(getInspectionrecordId());
		clone.setHosothutucId(getHosothutucId());
		clone.setControlRequirementId(getControlRequirementId());
		clone.setRequirementNumber(getRequirementNumber());
		clone.setReportNumber(getReportNumber());
		clone.setReportDate(getReportDate());
		clone.setDescription(getDescription());
		clone.setAttachedFile(getAttachedFile());
		clone.setPhieuxulyphuId(getPhieuxulyphuId());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());

		return clone;
	}

	@Override
	public int compareTo(ControlReport controlReport) {
		int value = 0;

		if (getId() < controlReport.getId()) {
			value = -1;
		}
		else if (getId() > controlReport.getId()) {
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

		if (!(obj instanceof ControlReportClp)) {
			return false;
		}

		ControlReportClp controlReport = (ControlReportClp)obj;

		long primaryKey = controlReport.getPrimaryKey();

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
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", inspectionrecordId=");
		sb.append(getInspectionrecordId());
		sb.append(", hosothutucId=");
		sb.append(getHosothutucId());
		sb.append(", controlRequirementId=");
		sb.append(getControlRequirementId());
		sb.append(", requirementNumber=");
		sb.append(getRequirementNumber());
		sb.append(", reportNumber=");
		sb.append(getReportNumber());
		sb.append(", reportDate=");
		sb.append(getReportDate());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", phieuxulyphuId=");
		sb.append(getPhieuxulyphuId());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionrecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionrecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hosothutucId</column-name><column-value><![CDATA[");
		sb.append(getHosothutucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlRequirementId</column-name><column-value><![CDATA[");
		sb.append(getControlRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requirementNumber</column-name><column-value><![CDATA[");
		sb.append(getRequirementNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportNumber</column-name><column-value><![CDATA[");
		sb.append(getReportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportDate</column-name><column-value><![CDATA[");
		sb.append(getReportDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuxulyphuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuxulyphuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signName</column-name><column-value><![CDATA[");
		sb.append(getSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signTitle</column-name><column-value><![CDATA[");
		sb.append(getSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _registeredInspectionId;
	private long _inspectionrecordId;
	private long _hosothutucId;
	private long _controlRequirementId;
	private String _requirementNumber;
	private String _reportNumber;
	private Date _reportDate;
	private String _description;
	private long _attachedFile;
	private long _phieuxulyphuId;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private BaseModel<?> _controlReportRemoteModel;
}