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

package vn.dtt.gt.dk.dao.report.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.report.service.ClpSerializer;
import vn.dtt.gt.dk.dao.report.service.DocumentStatisticsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DocumentStatisticsClp extends BaseModelImpl<DocumentStatistics>
	implements DocumentStatistics {
	public DocumentStatisticsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DocumentStatistics.class;
	}

	@Override
	public String getModelClassName() {
		return DocumentStatistics.class.getName();
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
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("documentTypeCode", getDocumentTypeCode());
		attributes.put("remainingNumber", getRemainingNumber());
		attributes.put("receivedNumber", getReceivedNumber());
		attributes.put("ontimeNumber", getOntimeNumber());
		attributes.put("overtimeNumber", getOvertimeNumber());
		attributes.put("processingNumber", getProcessingNumber());
		attributes.put("delayingNumber", getDelayingNumber());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String documentTypeCode = (String)attributes.get("documentTypeCode");

		if (documentTypeCode != null) {
			setDocumentTypeCode(documentTypeCode);
		}

		Long remainingNumber = (Long)attributes.get("remainingNumber");

		if (remainingNumber != null) {
			setRemainingNumber(remainingNumber);
		}

		Long receivedNumber = (Long)attributes.get("receivedNumber");

		if (receivedNumber != null) {
			setReceivedNumber(receivedNumber);
		}

		Long ontimeNumber = (Long)attributes.get("ontimeNumber");

		if (ontimeNumber != null) {
			setOntimeNumber(ontimeNumber);
		}

		Long overtimeNumber = (Long)attributes.get("overtimeNumber");

		if (overtimeNumber != null) {
			setOvertimeNumber(overtimeNumber);
		}

		Long processingNumber = (Long)attributes.get("processingNumber");

		if (processingNumber != null) {
			setProcessingNumber(processingNumber);
		}

		Long delayingNumber = (Long)attributes.get("delayingNumber");

		if (delayingNumber != null) {
			setDelayingNumber(delayingNumber);
		}

		Integer month = (Integer)attributes.get("month");

		if (month != null) {
			setMonth(month);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_documentStatisticsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_documentStatisticsRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_documentStatisticsRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentTypeCode() {
		return _documentTypeCode;
	}

	@Override
	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentTypeCode",
						String.class);

				method.invoke(_documentStatisticsRemoteModel, documentTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRemainingNumber() {
		return _remainingNumber;
	}

	@Override
	public void setRemainingNumber(long remainingNumber) {
		_remainingNumber = remainingNumber;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setRemainingNumber", long.class);

				method.invoke(_documentStatisticsRemoteModel, remainingNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReceivedNumber() {
		return _receivedNumber;
	}

	@Override
	public void setReceivedNumber(long receivedNumber) {
		_receivedNumber = receivedNumber;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setReceivedNumber", long.class);

				method.invoke(_documentStatisticsRemoteModel, receivedNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOntimeNumber() {
		return _ontimeNumber;
	}

	@Override
	public void setOntimeNumber(long ontimeNumber) {
		_ontimeNumber = ontimeNumber;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setOntimeNumber", long.class);

				method.invoke(_documentStatisticsRemoteModel, ontimeNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOvertimeNumber() {
		return _overtimeNumber;
	}

	@Override
	public void setOvertimeNumber(long overtimeNumber) {
		_overtimeNumber = overtimeNumber;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setOvertimeNumber", long.class);

				method.invoke(_documentStatisticsRemoteModel, overtimeNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProcessingNumber() {
		return _processingNumber;
	}

	@Override
	public void setProcessingNumber(long processingNumber) {
		_processingNumber = processingNumber;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessingNumber",
						long.class);

				method.invoke(_documentStatisticsRemoteModel, processingNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDelayingNumber() {
		return _delayingNumber;
	}

	@Override
	public void setDelayingNumber(long delayingNumber) {
		_delayingNumber = delayingNumber;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setDelayingNumber", long.class);

				method.invoke(_documentStatisticsRemoteModel, delayingNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMonth() {
		return _month;
	}

	@Override
	public void setMonth(int month) {
		_month = month;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setMonth", int.class);

				method.invoke(_documentStatisticsRemoteModel, month);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_documentStatisticsRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_documentStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _documentStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_documentStatisticsRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDocumentStatisticsRemoteModel() {
		return _documentStatisticsRemoteModel;
	}

	public void setDocumentStatisticsRemoteModel(
		BaseModel<?> documentStatisticsRemoteModel) {
		_documentStatisticsRemoteModel = documentStatisticsRemoteModel;
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

		Class<?> remoteModelClass = _documentStatisticsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_documentStatisticsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentStatisticsLocalServiceUtil.addDocumentStatistics(this);
		}
		else {
			DocumentStatisticsLocalServiceUtil.updateDocumentStatistics(this);
		}
	}

	@Override
	public DocumentStatistics toEscapedModel() {
		return (DocumentStatistics)ProxyUtil.newProxyInstance(DocumentStatistics.class.getClassLoader(),
			new Class[] { DocumentStatistics.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocumentStatisticsClp clone = new DocumentStatisticsClp();

		clone.setId(getId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDocumentTypeCode(getDocumentTypeCode());
		clone.setRemainingNumber(getRemainingNumber());
		clone.setReceivedNumber(getReceivedNumber());
		clone.setOntimeNumber(getOntimeNumber());
		clone.setOvertimeNumber(getOvertimeNumber());
		clone.setProcessingNumber(getProcessingNumber());
		clone.setDelayingNumber(getDelayingNumber());
		clone.setMonth(getMonth());
		clone.setYear(getYear());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(DocumentStatistics documentStatistics) {
		int value = 0;

		if (getId() < documentStatistics.getId()) {
			value = -1;
		}
		else if (getId() > documentStatistics.getId()) {
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

		if (!(obj instanceof DocumentStatisticsClp)) {
			return false;
		}

		DocumentStatisticsClp documentStatistics = (DocumentStatisticsClp)obj;

		long primaryKey = documentStatistics.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", documentTypeCode=");
		sb.append(getDocumentTypeCode());
		sb.append(", remainingNumber=");
		sb.append(getRemainingNumber());
		sb.append(", receivedNumber=");
		sb.append(getReceivedNumber());
		sb.append(", ontimeNumber=");
		sb.append(getOntimeNumber());
		sb.append(", overtimeNumber=");
		sb.append(getOvertimeNumber());
		sb.append(", processingNumber=");
		sb.append(getProcessingNumber());
		sb.append(", delayingNumber=");
		sb.append(getDelayingNumber());
		sb.append(", month=");
		sb.append(getMonth());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.report.model.DocumentStatistics");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remainingNumber</column-name><column-value><![CDATA[");
		sb.append(getRemainingNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receivedNumber</column-name><column-value><![CDATA[");
		sb.append(getReceivedNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ontimeNumber</column-name><column-value><![CDATA[");
		sb.append(getOntimeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtimeNumber</column-name><column-value><![CDATA[");
		sb.append(getOvertimeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processingNumber</column-name><column-value><![CDATA[");
		sb.append(getProcessingNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>delayingNumber</column-name><column-value><![CDATA[");
		sb.append(getDelayingNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>month</column-name><column-value><![CDATA[");
		sb.append(getMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private Date _createDate;
	private Date _modifiedDate;
	private String _documentTypeCode;
	private long _remainingNumber;
	private long _receivedNumber;
	private long _ontimeNumber;
	private long _overtimeNumber;
	private long _processingNumber;
	private long _delayingNumber;
	private int _month;
	private int _year;
	private int _status;
	private BaseModel<?> _documentStatisticsRemoteModel;
}