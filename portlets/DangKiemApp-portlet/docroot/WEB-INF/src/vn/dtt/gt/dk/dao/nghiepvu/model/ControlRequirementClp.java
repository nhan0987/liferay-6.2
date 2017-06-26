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
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class ControlRequirementClp extends BaseModelImpl<ControlRequirement>
	implements ControlRequirement {
	public ControlRequirementClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ControlRequirement.class;
	}

	@Override
	public String getModelClassName() {
		return ControlRequirement.class.getName();
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
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("requirementDate", getRequirementDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("controlContent", getControlContent());
		attributes.put("controlDeadline", getControlDeadline());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("requirementContent", getRequirementContent());
		attributes.put("controlReportDeadline", getControlReportDeadline());
		attributes.put("remarks", getRemarks());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("inspectionrecordId", getInspectionrecordId());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());

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

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		Date requirementDate = (Date)attributes.get("requirementDate");

		if (requirementDate != null) {
			setRequirementDate(requirementDate);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String controlContent = (String)attributes.get("controlContent");

		if (controlContent != null) {
			setControlContent(controlContent);
		}

		Date controlDeadline = (Date)attributes.get("controlDeadline");

		if (controlDeadline != null) {
			setControlDeadline(controlDeadline);
		}

		Integer attachedFile = (Integer)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String requirementContent = (String)attributes.get("requirementContent");

		if (requirementContent != null) {
			setRequirementContent(requirementContent);
		}

		Date controlReportDeadline = (Date)attributes.get(
				"controlReportDeadline");

		if (controlReportDeadline != null) {
			setControlReportDeadline(controlReportDeadline);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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

		Long inspectionrecordId = (Long)attributes.get("inspectionrecordId");

		if (inspectionrecordId != null) {
			setInspectionrecordId(inspectionrecordId);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_controlRequirementRemoteModel, id);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_controlRequirementRemoteModel,
					registeredInspectionId);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRequirementNumber",
						String.class);

				method.invoke(_controlRequirementRemoteModel, requirementNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequirementDate() {
		return _requirementDate;
	}

	@Override
	public void setRequirementDate(Date requirementDate) {
		_requirementDate = requirementDate;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRequirementDate", Date.class);

				method.invoke(_controlRequirementRemoteModel, requirementDate);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_controlRequirementRemoteModel, corporationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getControlContent() {
		return _controlContent;
	}

	@Override
	public void setControlContent(String controlContent) {
		_controlContent = controlContent;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setControlContent",
						String.class);

				method.invoke(_controlRequirementRemoteModel, controlContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getControlDeadline() {
		return _controlDeadline;
	}

	@Override
	public void setControlDeadline(Date controlDeadline) {
		_controlDeadline = controlDeadline;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setControlDeadline", Date.class);

				method.invoke(_controlRequirementRemoteModel, controlDeadline);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(int attachedFile) {
		_attachedFile = attachedFile;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", int.class);

				method.invoke(_controlRequirementRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequirementContent() {
		return _requirementContent;
	}

	@Override
	public void setRequirementContent(String requirementContent) {
		_requirementContent = requirementContent;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRequirementContent",
						String.class);

				method.invoke(_controlRequirementRemoteModel, requirementContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getControlReportDeadline() {
		return _controlReportDeadline;
	}

	@Override
	public void setControlReportDeadline(Date controlReportDeadline) {
		_controlReportDeadline = controlReportDeadline;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setControlReportDeadline",
						Date.class);

				method.invoke(_controlRequirementRemoteModel,
					controlReportDeadline);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_controlRequirementRemoteModel, remarks);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_controlRequirementRemoteModel, signName);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_controlRequirementRemoteModel, signTitle);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_controlRequirementRemoteModel, signPlace);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_controlRequirementRemoteModel, signDate);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionrecordId",
						long.class);

				method.invoke(_controlRequirementRemoteModel, inspectionrecordId);
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

		if (_controlRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _controlRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuxulyphuId", long.class);

				method.invoke(_controlRequirementRemoteModel, phieuxulyphuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getControlRequirementRemoteModel() {
		return _controlRequirementRemoteModel;
	}

	public void setControlRequirementRemoteModel(
		BaseModel<?> controlRequirementRemoteModel) {
		_controlRequirementRemoteModel = controlRequirementRemoteModel;
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

		Class<?> remoteModelClass = _controlRequirementRemoteModel.getClass();

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

		Object returnValue = method.invoke(_controlRequirementRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ControlRequirementLocalServiceUtil.addControlRequirement(this);
		}
		else {
			ControlRequirementLocalServiceUtil.updateControlRequirement(this);
		}
	}

	@Override
	public ControlRequirement toEscapedModel() {
		return (ControlRequirement)ProxyUtil.newProxyInstance(ControlRequirement.class.getClassLoader(),
			new Class[] { ControlRequirement.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ControlRequirementClp clone = new ControlRequirementClp();

		clone.setId(getId());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setRequirementNumber(getRequirementNumber());
		clone.setRequirementDate(getRequirementDate());
		clone.setCorporationId(getCorporationId());
		clone.setControlContent(getControlContent());
		clone.setControlDeadline(getControlDeadline());
		clone.setAttachedFile(getAttachedFile());
		clone.setRequirementContent(getRequirementContent());
		clone.setControlReportDeadline(getControlReportDeadline());
		clone.setRemarks(getRemarks());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setInspectionrecordId(getInspectionrecordId());
		clone.setPhieuxulyphuId(getPhieuxulyphuId());

		return clone;
	}

	@Override
	public int compareTo(ControlRequirement controlRequirement) {
		int value = 0;

		if (getId() < controlRequirement.getId()) {
			value = -1;
		}
		else if (getId() > controlRequirement.getId()) {
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

		if (!(obj instanceof ControlRequirementClp)) {
			return false;
		}

		ControlRequirementClp controlRequirement = (ControlRequirementClp)obj;

		long primaryKey = controlRequirement.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", requirementNumber=");
		sb.append(getRequirementNumber());
		sb.append(", requirementDate=");
		sb.append(getRequirementDate());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", controlContent=");
		sb.append(getControlContent());
		sb.append(", controlDeadline=");
		sb.append(getControlDeadline());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", requirementContent=");
		sb.append(getRequirementContent());
		sb.append(", controlReportDeadline=");
		sb.append(getControlReportDeadline());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", inspectionrecordId=");
		sb.append(getInspectionrecordId());
		sb.append(", phieuxulyphuId=");
		sb.append(getPhieuxulyphuId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement");
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
			"<column><column-name>requirementNumber</column-name><column-value><![CDATA[");
		sb.append(getRequirementNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requirementDate</column-name><column-value><![CDATA[");
		sb.append(getRequirementDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlContent</column-name><column-value><![CDATA[");
		sb.append(getControlContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlDeadline</column-name><column-value><![CDATA[");
		sb.append(getControlDeadline());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requirementContent</column-name><column-value><![CDATA[");
		sb.append(getRequirementContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlReportDeadline</column-name><column-value><![CDATA[");
		sb.append(getControlReportDeadline());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
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
		sb.append(
			"<column><column-name>inspectionrecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionrecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuxulyphuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuxulyphuId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _registeredInspectionId;
	private String _requirementNumber;
	private Date _requirementDate;
	private String _corporationId;
	private String _controlContent;
	private Date _controlDeadline;
	private int _attachedFile;
	private String _requirementContent;
	private Date _controlReportDeadline;
	private String _remarks;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _inspectionrecordId;
	private long _phieuxulyphuId;
	private BaseModel<?> _controlRequirementRemoteModel;
}