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
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class EmissionTestRequestClp extends BaseModelImpl<EmissionTestRequest>
	implements EmissionTestRequest {
	public EmissionTestRequestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmissionTestRequest.class;
	}

	@Override
	public String getModelClassName() {
		return EmissionTestRequest.class.getName();
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
		attributes.put("requestNumber", getRequestNumber());
		attributes.put("testTimeAndPlace", getTestTimeAndPlace());
		attributes.put("testPayment", getTestPayment());
		attributes.put("remarks", getRemarks());
		attributes.put("corporationName", getCorporationName());
		attributes.put("attachedFile", getAttachedFile());
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

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		String requestNumber = (String)attributes.get("requestNumber");

		if (requestNumber != null) {
			setRequestNumber(requestNumber);
		}

		String testTimeAndPlace = (String)attributes.get("testTimeAndPlace");

		if (testTimeAndPlace != null) {
			setTestTimeAndPlace(testTimeAndPlace);
		}

		String testPayment = (String)attributes.get("testPayment");

		if (testPayment != null) {
			setTestPayment(testPayment);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_emissionTestRequestRemoteModel, id);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedInspectionId",
						long.class);

				method.invoke(_emissionTestRequestRemoteModel,
					confirmedInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestNumber() {
		return _requestNumber;
	}

	@Override
	public void setRequestNumber(String requestNumber) {
		_requestNumber = requestNumber;

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestNumber", String.class);

				method.invoke(_emissionTestRequestRemoteModel, requestNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTestTimeAndPlace() {
		return _testTimeAndPlace;
	}

	@Override
	public void setTestTimeAndPlace(String testTimeAndPlace) {
		_testTimeAndPlace = testTimeAndPlace;

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setTestTimeAndPlace",
						String.class);

				method.invoke(_emissionTestRequestRemoteModel, testTimeAndPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTestPayment() {
		return _testPayment;
	}

	@Override
	public void setTestPayment(String testPayment) {
		_testPayment = testPayment;

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setTestPayment", String.class);

				method.invoke(_emissionTestRequestRemoteModel, testPayment);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_emissionTestRequestRemoteModel, remarks);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationName",
						String.class);

				method.invoke(_emissionTestRequestRemoteModel, corporationName);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_emissionTestRequestRemoteModel, attachedFile);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_emissionTestRequestRemoteModel, signName);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_emissionTestRequestRemoteModel, signTitle);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_emissionTestRequestRemoteModel, signPlace);
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

		if (_emissionTestRequestRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequestRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_emissionTestRequestRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmissionTestRequestRemoteModel() {
		return _emissionTestRequestRemoteModel;
	}

	public void setEmissionTestRequestRemoteModel(
		BaseModel<?> emissionTestRequestRemoteModel) {
		_emissionTestRequestRemoteModel = emissionTestRequestRemoteModel;
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

		Class<?> remoteModelClass = _emissionTestRequestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_emissionTestRequestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmissionTestRequestLocalServiceUtil.addEmissionTestRequest(this);
		}
		else {
			EmissionTestRequestLocalServiceUtil.updateEmissionTestRequest(this);
		}
	}

	@Override
	public EmissionTestRequest toEscapedModel() {
		return (EmissionTestRequest)ProxyUtil.newProxyInstance(EmissionTestRequest.class.getClassLoader(),
			new Class[] { EmissionTestRequest.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmissionTestRequestClp clone = new EmissionTestRequestClp();

		clone.setId(getId());
		clone.setConfirmedInspectionId(getConfirmedInspectionId());
		clone.setRequestNumber(getRequestNumber());
		clone.setTestTimeAndPlace(getTestTimeAndPlace());
		clone.setTestPayment(getTestPayment());
		clone.setRemarks(getRemarks());
		clone.setCorporationName(getCorporationName());
		clone.setAttachedFile(getAttachedFile());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());

		return clone;
	}

	@Override
	public int compareTo(EmissionTestRequest emissionTestRequest) {
		int value = 0;

		if (getId() < emissionTestRequest.getId()) {
			value = -1;
		}
		else if (getId() > emissionTestRequest.getId()) {
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

		if (!(obj instanceof EmissionTestRequestClp)) {
			return false;
		}

		EmissionTestRequestClp emissionTestRequest = (EmissionTestRequestClp)obj;

		long primaryKey = emissionTestRequest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", requestNumber=");
		sb.append(getRequestNumber());
		sb.append(", testTimeAndPlace=");
		sb.append(getTestTimeAndPlace());
		sb.append(", testPayment=");
		sb.append(getTestPayment());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", corporationName=");
		sb.append(getCorporationName());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest");
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
			"<column><column-name>requestNumber</column-name><column-value><![CDATA[");
		sb.append(getRequestNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testTimeAndPlace</column-name><column-value><![CDATA[");
		sb.append(getTestTimeAndPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testPayment</column-name><column-value><![CDATA[");
		sb.append(getTestPayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationName</column-name><column-value><![CDATA[");
		sb.append(getCorporationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
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
	private long _confirmedInspectionId;
	private String _requestNumber;
	private String _testTimeAndPlace;
	private String _testPayment;
	private String _remarks;
	private String _corporationName;
	private long _attachedFile;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private BaseModel<?> _emissionTestRequestRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}