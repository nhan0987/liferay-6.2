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

import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class CertificateCircularClp extends BaseModelImpl<CertificateCircular>
	implements CertificateCircular {
	public CertificateCircularClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CertificateCircular.class;
	}

	@Override
	public String getModelClassName() {
		return CertificateCircular.class.getName();
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
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("circularNo", getCircularNo());
		attributes.put("circularDate", getCircularDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String circularNo = (String)attributes.get("circularNo");

		if (circularNo != null) {
			setCircularNo(circularNo);
		}

		Date circularDate = (Date)attributes.get("circularDate");

		if (circularDate != null) {
			setCircularDate(circularDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_certificateCircularRemoteModel != null) {
			try {
				Class<?> clazz = _certificateCircularRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_certificateCircularRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;

		if (_certificateCircularRemoteModel != null) {
			try {
				Class<?> clazz = _certificateCircularRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_certificateCircularRemoteModel,
					certificateRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_certificateCircularRemoteModel != null) {
			try {
				Class<?> clazz = _certificateCircularRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", long.class);

				method.invoke(_certificateCircularRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCircularNo() {
		return _circularNo;
	}

	@Override
	public void setCircularNo(String circularNo) {
		_circularNo = circularNo;

		if (_certificateCircularRemoteModel != null) {
			try {
				Class<?> clazz = _certificateCircularRemoteModel.getClass();

				Method method = clazz.getMethod("setCircularNo", String.class);

				method.invoke(_certificateCircularRemoteModel, circularNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCircularDate() {
		return _circularDate;
	}

	@Override
	public void setCircularDate(Date circularDate) {
		_circularDate = circularDate;

		if (_certificateCircularRemoteModel != null) {
			try {
				Class<?> clazz = _certificateCircularRemoteModel.getClass();

				Method method = clazz.getMethod("setCircularDate", Date.class);

				method.invoke(_certificateCircularRemoteModel, circularDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCertificateCircularRemoteModel() {
		return _certificateCircularRemoteModel;
	}

	public void setCertificateCircularRemoteModel(
		BaseModel<?> certificateCircularRemoteModel) {
		_certificateCircularRemoteModel = certificateCircularRemoteModel;
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

		Class<?> remoteModelClass = _certificateCircularRemoteModel.getClass();

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

		Object returnValue = method.invoke(_certificateCircularRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CertificateCircularLocalServiceUtil.addCertificateCircular(this);
		}
		else {
			CertificateCircularLocalServiceUtil.updateCertificateCircular(this);
		}
	}

	@Override
	public CertificateCircular toEscapedModel() {
		return (CertificateCircular)ProxyUtil.newProxyInstance(CertificateCircular.class.getClassLoader(),
			new Class[] { CertificateCircular.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CertificateCircularClp clone = new CertificateCircularClp();

		clone.setId(getId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setSequenceNo(getSequenceNo());
		clone.setCircularNo(getCircularNo());
		clone.setCircularDate(getCircularDate());

		return clone;
	}

	@Override
	public int compareTo(CertificateCircular certificateCircular) {
		int value = 0;

		if (getId() < certificateCircular.getId()) {
			value = -1;
		}
		else if (getId() > certificateCircular.getId()) {
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

		if (!(obj instanceof CertificateCircularClp)) {
			return false;
		}

		CertificateCircularClp certificateCircular = (CertificateCircularClp)obj;

		long primaryKey = certificateCircular.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", circularNo=");
		sb.append(getCircularNo());
		sb.append(", circularDate=");
		sb.append(getCircularDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>circularNo</column-name><column-value><![CDATA[");
		sb.append(getCircularNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>circularDate</column-name><column-value><![CDATA[");
		sb.append(getCircularDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _certificateRecordId;
	private long _sequenceNo;
	private String _circularNo;
	private Date _circularDate;
	private BaseModel<?> _certificateCircularRemoteModel;
}