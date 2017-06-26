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
import vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class CopReportClp extends BaseModelImpl<CopReport> implements CopReport {
	public CopReportClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CopReport.class;
	}

	@Override
	public String getModelClassName() {
		return CopReport.class.getName();
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
		attributes.put("reportNumber", getReportNumber());
		attributes.put("corporationId", getCorporationId());
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

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_copReportRemoteModel, id);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_copReportRemoteModel, registeredInspectionId);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setReportNumber", String.class);

				method.invoke(_copReportRemoteModel, reportNumber);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_copReportRemoteModel, corporationId);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_copReportRemoteModel, signName);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_copReportRemoteModel, signTitle);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_copReportRemoteModel, signPlace);
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

		if (_copReportRemoteModel != null) {
			try {
				Class<?> clazz = _copReportRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_copReportRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCopReportRemoteModel() {
		return _copReportRemoteModel;
	}

	public void setCopReportRemoteModel(BaseModel<?> copReportRemoteModel) {
		_copReportRemoteModel = copReportRemoteModel;
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

		Class<?> remoteModelClass = _copReportRemoteModel.getClass();

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

		Object returnValue = method.invoke(_copReportRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CopReportLocalServiceUtil.addCopReport(this);
		}
		else {
			CopReportLocalServiceUtil.updateCopReport(this);
		}
	}

	@Override
	public CopReport toEscapedModel() {
		return (CopReport)ProxyUtil.newProxyInstance(CopReport.class.getClassLoader(),
			new Class[] { CopReport.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CopReportClp clone = new CopReportClp();

		clone.setId(getId());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setReportNumber(getReportNumber());
		clone.setCorporationId(getCorporationId());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());

		return clone;
	}

	@Override
	public int compareTo(CopReport copReport) {
		int value = 0;

		if (getId() < copReport.getId()) {
			value = -1;
		}
		else if (getId() > copReport.getId()) {
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

		if (!(obj instanceof CopReportClp)) {
			return false;
		}

		CopReportClp copReport = (CopReportClp)obj;

		long primaryKey = copReport.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", reportNumber=");
		sb.append(getReportNumber());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CopReport");
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
			"<column><column-name>reportNumber</column-name><column-value><![CDATA[");
		sb.append(getReportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
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
	private String _reportNumber;
	private String _corporationId;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private BaseModel<?> _copReportRemoteModel;
}