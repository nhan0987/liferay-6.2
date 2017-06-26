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
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class DebitNoteClp extends BaseModelImpl<DebitNote> implements DebitNote {
	public DebitNoteClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DebitNote.class;
	}

	@Override
	public String getModelClassName() {
		return DebitNote.class.getName();
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
		attributes.put("debitNoteNumber", getDebitNoteNumber());
		attributes.put("transactionId", getTransactionId());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("reportBy", getReportBy());
		attributes.put("reportDate", getReportDate());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("totalPayment", getTotalPayment());
		attributes.put("paymentType", getPaymentType());
		attributes.put("markAsDeleted", getMarkAsDeleted());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String debitNoteNumber = (String)attributes.get("debitNoteNumber");

		if (debitNoteNumber != null) {
			setDebitNoteNumber(debitNoteNumber);
		}

		String transactionId = (String)attributes.get("transactionId");

		if (transactionId != null) {
			setTransactionId(transactionId);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String reportBy = (String)attributes.get("reportBy");

		if (reportBy != null) {
			setReportBy(reportBy);
		}

		Date reportDate = (Date)attributes.get("reportDate");

		if (reportDate != null) {
			setReportDate(reportDate);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long totalPayment = (Long)attributes.get("totalPayment");

		if (totalPayment != null) {
			setTotalPayment(totalPayment);
		}

		Long paymentType = (Long)attributes.get("paymentType");

		if (paymentType != null) {
			setPaymentType(paymentType);
		}

		Integer markAsDeleted = (Integer)attributes.get("markAsDeleted");

		if (markAsDeleted != null) {
			setMarkAsDeleted(markAsDeleted);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_debitNoteRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDebitNoteNumber() {
		return _debitNoteNumber;
	}

	@Override
	public void setDebitNoteNumber(String debitNoteNumber) {
		_debitNoteNumber = debitNoteNumber;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setDebitNoteNumber",
						String.class);

				method.invoke(_debitNoteRemoteModel, debitNoteNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransactionId() {
		return _transactionId;
	}

	@Override
	public void setTransactionId(String transactionId) {
		_transactionId = transactionId;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setTransactionId", String.class);

				method.invoke(_debitNoteRemoteModel, transactionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization() {
		return _organization;
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization", String.class);

				method.invoke(_debitNoteRemoteModel, organization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDivision() {
		return _division;
	}

	@Override
	public void setDivision(String division) {
		_division = division;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setDivision", String.class);

				method.invoke(_debitNoteRemoteModel, division);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReportBy() {
		return _reportBy;
	}

	@Override
	public void setReportBy(String reportBy) {
		_reportBy = reportBy;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setReportBy", String.class);

				method.invoke(_debitNoteRemoteModel, reportBy);
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

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setReportDate", Date.class);

				method.invoke(_debitNoteRemoteModel, reportDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFromDate() {
		return _fromDate;
	}

	@Override
	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setFromDate", Date.class);

				method.invoke(_debitNoteRemoteModel, fromDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getToDate() {
		return _toDate;
	}

	@Override
	public void setToDate(Date toDate) {
		_toDate = toDate;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setToDate", Date.class);

				method.invoke(_debitNoteRemoteModel, toDate);
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

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_debitNoteRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalPayment() {
		return _totalPayment;
	}

	@Override
	public void setTotalPayment(long totalPayment) {
		_totalPayment = totalPayment;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalPayment", long.class);

				method.invoke(_debitNoteRemoteModel, totalPayment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPaymentType() {
		return _paymentType;
	}

	@Override
	public void setPaymentType(long paymentType) {
		_paymentType = paymentType;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentType", long.class);

				method.invoke(_debitNoteRemoteModel, paymentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkAsDeleted() {
		return _markAsDeleted;
	}

	@Override
	public void setMarkAsDeleted(int markAsDeleted) {
		_markAsDeleted = markAsDeleted;

		if (_debitNoteRemoteModel != null) {
			try {
				Class<?> clazz = _debitNoteRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkAsDeleted", int.class);

				method.invoke(_debitNoteRemoteModel, markAsDeleted);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDebitNoteRemoteModel() {
		return _debitNoteRemoteModel;
	}

	public void setDebitNoteRemoteModel(BaseModel<?> debitNoteRemoteModel) {
		_debitNoteRemoteModel = debitNoteRemoteModel;
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

		Class<?> remoteModelClass = _debitNoteRemoteModel.getClass();

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

		Object returnValue = method.invoke(_debitNoteRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DebitNoteLocalServiceUtil.addDebitNote(this);
		}
		else {
			DebitNoteLocalServiceUtil.updateDebitNote(this);
		}
	}

	@Override
	public DebitNote toEscapedModel() {
		return (DebitNote)ProxyUtil.newProxyInstance(DebitNote.class.getClassLoader(),
			new Class[] { DebitNote.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DebitNoteClp clone = new DebitNoteClp();

		clone.setId(getId());
		clone.setDebitNoteNumber(getDebitNoteNumber());
		clone.setTransactionId(getTransactionId());
		clone.setOrganization(getOrganization());
		clone.setDivision(getDivision());
		clone.setReportBy(getReportBy());
		clone.setReportDate(getReportDate());
		clone.setFromDate(getFromDate());
		clone.setToDate(getToDate());
		clone.setAttachedFile(getAttachedFile());
		clone.setTotalPayment(getTotalPayment());
		clone.setPaymentType(getPaymentType());
		clone.setMarkAsDeleted(getMarkAsDeleted());

		return clone;
	}

	@Override
	public int compareTo(DebitNote debitNote) {
		int value = 0;

		if (getId() < debitNote.getId()) {
			value = -1;
		}
		else if (getId() > debitNote.getId()) {
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

		if (!(obj instanceof DebitNoteClp)) {
			return false;
		}

		DebitNoteClp debitNote = (DebitNoteClp)obj;

		long primaryKey = debitNote.getPrimaryKey();

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
		sb.append(", debitNoteNumber=");
		sb.append(getDebitNoteNumber());
		sb.append(", transactionId=");
		sb.append(getTransactionId());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", reportBy=");
		sb.append(getReportBy());
		sb.append(", reportDate=");
		sb.append(getReportDate());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", totalPayment=");
		sb.append(getTotalPayment());
		sb.append(", paymentType=");
		sb.append(getPaymentType());
		sb.append(", markAsDeleted=");
		sb.append(getMarkAsDeleted());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>debitNoteNumber</column-name><column-value><![CDATA[");
		sb.append(getDebitNoteNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transactionId</column-name><column-value><![CDATA[");
		sb.append(getTransactionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportBy</column-name><column-value><![CDATA[");
		sb.append(getReportBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportDate</column-name><column-value><![CDATA[");
		sb.append(getReportDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalPayment</column-name><column-value><![CDATA[");
		sb.append(getTotalPayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentType</column-name><column-value><![CDATA[");
		sb.append(getPaymentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAsDeleted</column-name><column-value><![CDATA[");
		sb.append(getMarkAsDeleted());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _debitNoteNumber;
	private String _transactionId;
	private String _organization;
	private String _division;
	private String _reportBy;
	private Date _reportDate;
	private Date _fromDate;
	private Date _toDate;
	private long _attachedFile;
	private long _totalPayment;
	private long _paymentType;
	private int _markAsDeleted;
	private BaseModel<?> _debitNoteRemoteModel;
}