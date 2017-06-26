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
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class DraftCertificateClp extends BaseModelImpl<DraftCertificate>
	implements DraftCertificate {
	public DraftCertificateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DraftCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return DraftCertificate.class.getName();
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
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("certificateType", getCertificateType());
		attributes.put("inspectionReportId", getInspectionReportId());
		attributes.put("safetytestReportId", getSafetytestReportId());
		attributes.put("emissionTestReportId", getEmissionTestReportId());
		attributes.put("copReportId", getCopReportId());
		attributes.put("reason", getReason());
		attributes.put("remarks", getRemarks());
		attributes.put("createdDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long certificateType = (Long)attributes.get("certificateType");

		if (certificateType != null) {
			setCertificateType(certificateType);
		}

		Long inspectionReportId = (Long)attributes.get("inspectionReportId");

		if (inspectionReportId != null) {
			setInspectionReportId(inspectionReportId);
		}

		Long safetytestReportId = (Long)attributes.get("safetytestReportId");

		if (safetytestReportId != null) {
			setSafetytestReportId(safetytestReportId);
		}

		Long emissionTestReportId = (Long)attributes.get("emissionTestReportId");

		if (emissionTestReportId != null) {
			setEmissionTestReportId(emissionTestReportId);
		}

		Long copReportId = (Long)attributes.get("copReportId");

		if (copReportId != null) {
			setCopReportId(copReportId);
		}

		String reason = (String)attributes.get("reason");

		if (reason != null) {
			setReason(reason);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_draftCertificateRemoteModel, id);
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

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_draftCertificateRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateType() {
		return _certificateType;
	}

	@Override
	public void setCertificateType(long certificateType) {
		_certificateType = certificateType;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateType", long.class);

				method.invoke(_draftCertificateRemoteModel, certificateType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionReportId() {
		return _inspectionReportId;
	}

	@Override
	public void setInspectionReportId(long inspectionReportId) {
		_inspectionReportId = inspectionReportId;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionReportId",
						long.class);

				method.invoke(_draftCertificateRemoteModel, inspectionReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSafetytestReportId() {
		return _safetytestReportId;
	}

	@Override
	public void setSafetytestReportId(long safetytestReportId) {
		_safetytestReportId = safetytestReportId;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setSafetytestReportId",
						long.class);

				method.invoke(_draftCertificateRemoteModel, safetytestReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_emissionTestReportId = emissionTestReportId;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissionTestReportId",
						long.class);

				method.invoke(_draftCertificateRemoteModel, emissionTestReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCopReportId() {
		return _copReportId;
	}

	@Override
	public void setCopReportId(long copReportId) {
		_copReportId = copReportId;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCopReportId", long.class);

				method.invoke(_draftCertificateRemoteModel, copReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReason() {
		return _reason;
	}

	@Override
	public void setReason(String reason) {
		_reason = reason;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setReason", String.class);

				method.invoke(_draftCertificateRemoteModel, reason);
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

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_draftCertificateRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_draftCertificateRemoteModel != null) {
			try {
				Class<?> clazz = _draftCertificateRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_draftCertificateRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDraftCertificateRemoteModel() {
		return _draftCertificateRemoteModel;
	}

	public void setDraftCertificateRemoteModel(
		BaseModel<?> draftCertificateRemoteModel) {
		_draftCertificateRemoteModel = draftCertificateRemoteModel;
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

		Class<?> remoteModelClass = _draftCertificateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_draftCertificateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DraftCertificateLocalServiceUtil.addDraftCertificate(this);
		}
		else {
			DraftCertificateLocalServiceUtil.updateDraftCertificate(this);
		}
	}

	@Override
	public DraftCertificate toEscapedModel() {
		return (DraftCertificate)ProxyUtil.newProxyInstance(DraftCertificate.class.getClassLoader(),
			new Class[] { DraftCertificate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DraftCertificateClp clone = new DraftCertificateClp();

		clone.setId(getId());
		clone.setAttachedFile(getAttachedFile());
		clone.setCertificateType(getCertificateType());
		clone.setInspectionReportId(getInspectionReportId());
		clone.setSafetytestReportId(getSafetytestReportId());
		clone.setEmissionTestReportId(getEmissionTestReportId());
		clone.setCopReportId(getCopReportId());
		clone.setReason(getReason());
		clone.setRemarks(getRemarks());
		clone.setCreatedDate(getCreatedDate());

		return clone;
	}

	@Override
	public int compareTo(DraftCertificate draftCertificate) {
		int value = 0;

		if (getId() < draftCertificate.getId()) {
			value = -1;
		}
		else if (getId() > draftCertificate.getId()) {
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

		if (!(obj instanceof DraftCertificateClp)) {
			return false;
		}

		DraftCertificateClp draftCertificate = (DraftCertificateClp)obj;

		long primaryKey = draftCertificate.getPrimaryKey();

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
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", certificateType=");
		sb.append(getCertificateType());
		sb.append(", inspectionReportId=");
		sb.append(getInspectionReportId());
		sb.append(", safetytestReportId=");
		sb.append(getSafetytestReportId());
		sb.append(", emissionTestReportId=");
		sb.append(getEmissionTestReportId());
		sb.append(", copReportId=");
		sb.append(getCopReportId());
		sb.append(", reason=");
		sb.append(getReason());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateType</column-name><column-value><![CDATA[");
		sb.append(getCertificateType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionReportId</column-name><column-value><![CDATA[");
		sb.append(getInspectionReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetytestReportId</column-name><column-value><![CDATA[");
		sb.append(getSafetytestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionTestReportId</column-name><column-value><![CDATA[");
		sb.append(getEmissionTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copReportId</column-name><column-value><![CDATA[");
		sb.append(getCopReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reason</column-name><column-value><![CDATA[");
		sb.append(getReason());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _attachedFile;
	private long _certificateType;
	private long _inspectionReportId;
	private long _safetytestReportId;
	private long _emissionTestReportId;
	private long _copReportId;
	private String _reason;
	private String _remarks;
	private Date _createdDate;
	private BaseModel<?> _draftCertificateRemoteModel;
}