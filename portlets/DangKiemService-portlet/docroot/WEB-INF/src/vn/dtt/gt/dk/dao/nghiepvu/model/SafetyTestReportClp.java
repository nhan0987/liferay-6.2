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
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class SafetyTestReportClp extends BaseModelImpl<SafetyTestReport>
	implements SafetyTestReport {
	public SafetyTestReportClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SafetyTestReport.class;
	}

	@Override
	public String getModelClassName() {
		return SafetyTestReport.class.getName();
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
		attributes.put("safetestRequirementId", getSafetestRequirementId());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("description", getDescription());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("confirmedResult", getConfirmedResult());
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

		Long safetestRequirementId = (Long)attributes.get(
				"safetestRequirementId");

		if (safetestRequirementId != null) {
			setSafetestRequirementId(safetestRequirementId);
		}

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long confirmedResult = (Long)attributes.get("confirmedResult");

		if (confirmedResult != null) {
			setConfirmedResult(confirmedResult);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_safetyTestReportRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSafetestRequirementId() {
		return _safetestRequirementId;
	}

	@Override
	public void setSafetestRequirementId(long safetestRequirementId) {
		_safetestRequirementId = safetestRequirementId;

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSafetestRequirementId",
						long.class);

				method.invoke(_safetyTestReportRemoteModel,
					safetestRequirementId);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setReportNumber", String.class);

				method.invoke(_safetyTestReportRemoteModel, reportNumber);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_safetyTestReportRemoteModel, description);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_safetyTestReportRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedResult() {
		return _confirmedResult;
	}

	@Override
	public void setConfirmedResult(long confirmedResult) {
		_confirmedResult = confirmedResult;

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedResult", long.class);

				method.invoke(_safetyTestReportRemoteModel, confirmedResult);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_safetyTestReportRemoteModel, signName);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_safetyTestReportRemoteModel, signTitle);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_safetyTestReportRemoteModel, signPlace);
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

		if (_safetyTestReportRemoteModel != null) {
			try {
				Class<?> clazz = _safetyTestReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_safetyTestReportRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSafetyTestReportRemoteModel() {
		return _safetyTestReportRemoteModel;
	}

	public void setSafetyTestReportRemoteModel(
		BaseModel<?> safetyTestReportRemoteModel) {
		_safetyTestReportRemoteModel = safetyTestReportRemoteModel;
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

		Class<?> remoteModelClass = _safetyTestReportRemoteModel.getClass();

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

		Object returnValue = method.invoke(_safetyTestReportRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SafetyTestReportLocalServiceUtil.addSafetyTestReport(this);
		}
		else {
			SafetyTestReportLocalServiceUtil.updateSafetyTestReport(this);
		}
	}

	@Override
	public SafetyTestReport toEscapedModel() {
		return (SafetyTestReport)ProxyUtil.newProxyInstance(SafetyTestReport.class.getClassLoader(),
			new Class[] { SafetyTestReport.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SafetyTestReportClp clone = new SafetyTestReportClp();

		clone.setId(getId());
		clone.setSafetestRequirementId(getSafetestRequirementId());
		clone.setReportNumber(getReportNumber());
		clone.setDescription(getDescription());
		clone.setAttachedFile(getAttachedFile());
		clone.setConfirmedResult(getConfirmedResult());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());

		return clone;
	}

	@Override
	public int compareTo(SafetyTestReport safetyTestReport) {
		int value = 0;

		if (getId() < safetyTestReport.getId()) {
			value = -1;
		}
		else if (getId() > safetyTestReport.getId()) {
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

		if (!(obj instanceof SafetyTestReportClp)) {
			return false;
		}

		SafetyTestReportClp safetyTestReport = (SafetyTestReportClp)obj;

		long primaryKey = safetyTestReport.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", safetestRequirementId=");
		sb.append(getSafetestRequirementId());
		sb.append(", reportNumber=");
		sb.append(getReportNumber());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", confirmedResult=");
		sb.append(getConfirmedResult());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetestRequirementId</column-name><column-value><![CDATA[");
		sb.append(getSafetestRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportNumber</column-name><column-value><![CDATA[");
		sb.append(getReportNumber());
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
			"<column><column-name>confirmedResult</column-name><column-value><![CDATA[");
		sb.append(getConfirmedResult());
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
	private long _safetestRequirementId;
	private String _reportNumber;
	private String _description;
	private long _attachedFile;
	private long _confirmedResult;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private BaseModel<?> _safetyTestReportRemoteModel;
}