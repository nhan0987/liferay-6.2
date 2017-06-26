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
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class EmissionTestRequirementClp extends BaseModelImpl<EmissionTestRequirement>
	implements EmissionTestRequirement {
	public EmissionTestRequirementClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmissionTestRequirement.class;
	}

	@Override
	public String getModelClassName() {
		return EmissionTestRequirement.class.getName();
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
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("contentOfRequest", getContentOfRequest());
		attributes.put("testingRegisteredPlace", getTestingRegisteredPlace());
		attributes.put("testingRegistration", getTestingRegistration());
		attributes.put("testingPaymentCondition", getTestingPaymentCondition());
		attributes.put("remarks", getRemarks());
		attributes.put("corporationId", getCorporationId());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("attachedFile", getAttachedFile());

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

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		String contentOfRequest = (String)attributes.get("contentOfRequest");

		if (contentOfRequest != null) {
			setContentOfRequest(contentOfRequest);
		}

		String testingRegisteredPlace = (String)attributes.get(
				"testingRegisteredPlace");

		if (testingRegisteredPlace != null) {
			setTestingRegisteredPlace(testingRegisteredPlace);
		}

		String testingRegistration = (String)attributes.get(
				"testingRegistration");

		if (testingRegistration != null) {
			setTestingRegistration(testingRegistration);
		}

		String testingPaymentCondition = (String)attributes.get(
				"testingPaymentCondition");

		if (testingPaymentCondition != null) {
			setTestingPaymentCondition(testingPaymentCondition);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_emissionTestRequirementRemoteModel, id);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					registeredInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordId",
						long.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					inspectionRecordId);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRequirementNumber",
						String.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					requirementNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContentOfRequest() {
		return _contentOfRequest;
	}

	@Override
	public void setContentOfRequest(String contentOfRequest) {
		_contentOfRequest = contentOfRequest;

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setContentOfRequest",
						String.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					contentOfRequest);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTestingRegisteredPlace() {
		return _testingRegisteredPlace;
	}

	@Override
	public void setTestingRegisteredPlace(String testingRegisteredPlace) {
		_testingRegisteredPlace = testingRegisteredPlace;

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setTestingRegisteredPlace",
						String.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					testingRegisteredPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTestingRegistration() {
		return _testingRegistration;
	}

	@Override
	public void setTestingRegistration(String testingRegistration) {
		_testingRegistration = testingRegistration;

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setTestingRegistration",
						String.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					testingRegistration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTestingPaymentCondition() {
		return _testingPaymentCondition;
	}

	@Override
	public void setTestingPaymentCondition(String testingPaymentCondition) {
		_testingPaymentCondition = testingPaymentCondition;

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setTestingPaymentCondition",
						String.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					testingPaymentCondition);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_emissionTestRequirementRemoteModel, remarks);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_emissionTestRequirementRemoteModel, corporationId);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_emissionTestRequirementRemoteModel, signName);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_emissionTestRequirementRemoteModel, signTitle);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_emissionTestRequirementRemoteModel, signPlace);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_emissionTestRequirementRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyPhuId", long.class);

				method.invoke(_emissionTestRequirementRemoteModel,
					phieuXuLyPhuId);
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

		if (_emissionTestRequirementRemoteModel != null) {
			try {
				Class<?> clazz = _emissionTestRequirementRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_emissionTestRequirementRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmissionTestRequirementRemoteModel() {
		return _emissionTestRequirementRemoteModel;
	}

	public void setEmissionTestRequirementRemoteModel(
		BaseModel<?> emissionTestRequirementRemoteModel) {
		_emissionTestRequirementRemoteModel = emissionTestRequirementRemoteModel;
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

		Class<?> remoteModelClass = _emissionTestRequirementRemoteModel.getClass();

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

		Object returnValue = method.invoke(_emissionTestRequirementRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmissionTestRequirementLocalServiceUtil.addEmissionTestRequirement(this);
		}
		else {
			EmissionTestRequirementLocalServiceUtil.updateEmissionTestRequirement(this);
		}
	}

	@Override
	public EmissionTestRequirement toEscapedModel() {
		return (EmissionTestRequirement)ProxyUtil.newProxyInstance(EmissionTestRequirement.class.getClassLoader(),
			new Class[] { EmissionTestRequirement.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmissionTestRequirementClp clone = new EmissionTestRequirementClp();

		clone.setId(getId());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setInspectionRecordId(getInspectionRecordId());
		clone.setRequirementNumber(getRequirementNumber());
		clone.setContentOfRequest(getContentOfRequest());
		clone.setTestingRegisteredPlace(getTestingRegisteredPlace());
		clone.setTestingRegistration(getTestingRegistration());
		clone.setTestingPaymentCondition(getTestingPaymentCondition());
		clone.setRemarks(getRemarks());
		clone.setCorporationId(getCorporationId());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setPhieuXuLyPhuId(getPhieuXuLyPhuId());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(EmissionTestRequirement emissionTestRequirement) {
		int value = 0;

		if (getId() < emissionTestRequirement.getId()) {
			value = -1;
		}
		else if (getId() > emissionTestRequirement.getId()) {
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

		if (!(obj instanceof EmissionTestRequirementClp)) {
			return false;
		}

		EmissionTestRequirementClp emissionTestRequirement = (EmissionTestRequirementClp)obj;

		long primaryKey = emissionTestRequirement.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", requirementNumber=");
		sb.append(getRequirementNumber());
		sb.append(", contentOfRequest=");
		sb.append(getContentOfRequest());
		sb.append(", testingRegisteredPlace=");
		sb.append(getTestingRegisteredPlace());
		sb.append(", testingRegistration=");
		sb.append(getTestingRegistration());
		sb.append(", testingPaymentCondition=");
		sb.append(getTestingPaymentCondition());
		sb.append(", remarks=");
		sb.append(getRemarks());
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
		sb.append(", phieuXuLyPhuId=");
		sb.append(getPhieuXuLyPhuId());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement");
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
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requirementNumber</column-name><column-value><![CDATA[");
		sb.append(getRequirementNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contentOfRequest</column-name><column-value><![CDATA[");
		sb.append(getContentOfRequest());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testingRegisteredPlace</column-name><column-value><![CDATA[");
		sb.append(getTestingRegisteredPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testingRegistration</column-name><column-value><![CDATA[");
		sb.append(getTestingRegistration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testingPaymentCondition</column-name><column-value><![CDATA[");
		sb.append(getTestingPaymentCondition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
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
		sb.append(
			"<column><column-name>phieuXuLyPhuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyPhuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _registeredInspectionId;
	private long _inspectionRecordId;
	private String _requirementNumber;
	private String _contentOfRequest;
	private String _testingRegisteredPlace;
	private String _testingRegistration;
	private String _testingPaymentCondition;
	private String _remarks;
	private String _corporationId;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _phieuXuLyPhuId;
	private long _attachedFile;
	private BaseModel<?> _emissionTestRequirementRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}