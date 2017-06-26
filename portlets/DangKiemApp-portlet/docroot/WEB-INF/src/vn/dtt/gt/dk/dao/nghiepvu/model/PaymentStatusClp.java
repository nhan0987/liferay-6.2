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
import vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class PaymentStatusClp extends BaseModelImpl<PaymentStatus>
	implements PaymentStatus {
	public PaymentStatusClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentStatus.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentStatus.class.getName();
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
		attributes.put("vehicleRecordId", getVehicleRecordId());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("currency", getCurrency());
		attributes.put("basicCurrency", getBasicCurrency());
		attributes.put("exchangeRate", getExchangeRate());
		attributes.put("inspectionFee", getInspectionFee());
		attributes.put("otherCosts", getOtherCosts());
		attributes.put("totalCostsAndFee", getTotalCostsAndFee());
		attributes.put("tax", getTax());
		attributes.put("charges", getCharges());
		attributes.put("totalRealDebit", getTotalRealDebit());
		attributes.put("totalDebit", getTotalDebit());
		attributes.put("totalCredit", getTotalCredit());
		attributes.put("currentStatus", getCurrentStatus());
		attributes.put("debitNoteNumber", getDebitNoteNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vehicleRecordId = (Long)attributes.get("vehicleRecordId");

		if (vehicleRecordId != null) {
			setVehicleRecordId(vehicleRecordId);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		String basicCurrency = (String)attributes.get("basicCurrency");

		if (basicCurrency != null) {
			setBasicCurrency(basicCurrency);
		}

		Double exchangeRate = (Double)attributes.get("exchangeRate");

		if (exchangeRate != null) {
			setExchangeRate(exchangeRate);
		}

		Double inspectionFee = (Double)attributes.get("inspectionFee");

		if (inspectionFee != null) {
			setInspectionFee(inspectionFee);
		}

		Double otherCosts = (Double)attributes.get("otherCosts");

		if (otherCosts != null) {
			setOtherCosts(otherCosts);
		}

		Double totalCostsAndFee = (Double)attributes.get("totalCostsAndFee");

		if (totalCostsAndFee != null) {
			setTotalCostsAndFee(totalCostsAndFee);
		}

		Double tax = (Double)attributes.get("tax");

		if (tax != null) {
			setTax(tax);
		}

		Double charges = (Double)attributes.get("charges");

		if (charges != null) {
			setCharges(charges);
		}

		Double totalRealDebit = (Double)attributes.get("totalRealDebit");

		if (totalRealDebit != null) {
			setTotalRealDebit(totalRealDebit);
		}

		Double totalDebit = (Double)attributes.get("totalDebit");

		if (totalDebit != null) {
			setTotalDebit(totalDebit);
		}

		Double totalCredit = (Double)attributes.get("totalCredit");

		if (totalCredit != null) {
			setTotalCredit(totalCredit);
		}

		Long currentStatus = (Long)attributes.get("currentStatus");

		if (currentStatus != null) {
			setCurrentStatus(currentStatus);
		}

		String debitNoteNumber = (String)attributes.get("debitNoteNumber");

		if (debitNoteNumber != null) {
			setDebitNoteNumber(debitNoteNumber);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_paymentStatusRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleRecordId() {
		return _vehicleRecordId;
	}

	@Override
	public void setVehicleRecordId(long vehicleRecordId) {
		_vehicleRecordId = vehicleRecordId;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleRecordId", long.class);

				method.invoke(_paymentStatusRemoteModel, vehicleRecordId);
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

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_paymentStatusRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUnitPrice() {
		return _unitPrice;
	}

	@Override
	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", double.class);

				method.invoke(_paymentStatusRemoteModel, unitPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrency() {
		return _currency;
	}

	@Override
	public void setCurrency(String currency) {
		_currency = currency;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", String.class);

				method.invoke(_paymentStatusRemoteModel, currency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBasicCurrency() {
		return _basicCurrency;
	}

	@Override
	public void setBasicCurrency(String basicCurrency) {
		_basicCurrency = basicCurrency;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setBasicCurrency", String.class);

				method.invoke(_paymentStatusRemoteModel, basicCurrency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getExchangeRate() {
		return _exchangeRate;
	}

	@Override
	public void setExchangeRate(double exchangeRate) {
		_exchangeRate = exchangeRate;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setExchangeRate", double.class);

				method.invoke(_paymentStatusRemoteModel, exchangeRate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getInspectionFee() {
		return _inspectionFee;
	}

	@Override
	public void setInspectionFee(double inspectionFee) {
		_inspectionFee = inspectionFee;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionFee", double.class);

				method.invoke(_paymentStatusRemoteModel, inspectionFee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getOtherCosts() {
		return _otherCosts;
	}

	@Override
	public void setOtherCosts(double otherCosts) {
		_otherCosts = otherCosts;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setOtherCosts", double.class);

				method.invoke(_paymentStatusRemoteModel, otherCosts);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTotalCostsAndFee() {
		return _totalCostsAndFee;
	}

	@Override
	public void setTotalCostsAndFee(double totalCostsAndFee) {
		_totalCostsAndFee = totalCostsAndFee;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalCostsAndFee",
						double.class);

				method.invoke(_paymentStatusRemoteModel, totalCostsAndFee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTax() {
		return _tax;
	}

	@Override
	public void setTax(double tax) {
		_tax = tax;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setTax", double.class);

				method.invoke(_paymentStatusRemoteModel, tax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCharges() {
		return _charges;
	}

	@Override
	public void setCharges(double charges) {
		_charges = charges;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setCharges", double.class);

				method.invoke(_paymentStatusRemoteModel, charges);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTotalRealDebit() {
		return _totalRealDebit;
	}

	@Override
	public void setTotalRealDebit(double totalRealDebit) {
		_totalRealDebit = totalRealDebit;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalRealDebit",
						double.class);

				method.invoke(_paymentStatusRemoteModel, totalRealDebit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTotalDebit() {
		return _totalDebit;
	}

	@Override
	public void setTotalDebit(double totalDebit) {
		_totalDebit = totalDebit;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalDebit", double.class);

				method.invoke(_paymentStatusRemoteModel, totalDebit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTotalCredit() {
		return _totalCredit;
	}

	@Override
	public void setTotalCredit(double totalCredit) {
		_totalCredit = totalCredit;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalCredit", double.class);

				method.invoke(_paymentStatusRemoteModel, totalCredit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCurrentStatus() {
		return _currentStatus;
	}

	@Override
	public void setCurrentStatus(long currentStatus) {
		_currentStatus = currentStatus;

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentStatus", long.class);

				method.invoke(_paymentStatusRemoteModel, currentStatus);
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

		if (_paymentStatusRemoteModel != null) {
			try {
				Class<?> clazz = _paymentStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setDebitNoteNumber",
						String.class);

				method.invoke(_paymentStatusRemoteModel, debitNoteNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentStatusRemoteModel() {
		return _paymentStatusRemoteModel;
	}

	public void setPaymentStatusRemoteModel(
		BaseModel<?> paymentStatusRemoteModel) {
		_paymentStatusRemoteModel = paymentStatusRemoteModel;
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

		Class<?> remoteModelClass = _paymentStatusRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentStatusRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentStatusLocalServiceUtil.addPaymentStatus(this);
		}
		else {
			PaymentStatusLocalServiceUtil.updatePaymentStatus(this);
		}
	}

	@Override
	public PaymentStatus toEscapedModel() {
		return (PaymentStatus)ProxyUtil.newProxyInstance(PaymentStatus.class.getClassLoader(),
			new Class[] { PaymentStatus.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentStatusClp clone = new PaymentStatusClp();

		clone.setId(getId());
		clone.setVehicleRecordId(getVehicleRecordId());
		clone.setAttachedFile(getAttachedFile());
		clone.setUnitPrice(getUnitPrice());
		clone.setCurrency(getCurrency());
		clone.setBasicCurrency(getBasicCurrency());
		clone.setExchangeRate(getExchangeRate());
		clone.setInspectionFee(getInspectionFee());
		clone.setOtherCosts(getOtherCosts());
		clone.setTotalCostsAndFee(getTotalCostsAndFee());
		clone.setTax(getTax());
		clone.setCharges(getCharges());
		clone.setTotalRealDebit(getTotalRealDebit());
		clone.setTotalDebit(getTotalDebit());
		clone.setTotalCredit(getTotalCredit());
		clone.setCurrentStatus(getCurrentStatus());
		clone.setDebitNoteNumber(getDebitNoteNumber());

		return clone;
	}

	@Override
	public int compareTo(PaymentStatus paymentStatus) {
		int value = 0;

		if (getId() < paymentStatus.getId()) {
			value = -1;
		}
		else if (getId() > paymentStatus.getId()) {
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

		if (!(obj instanceof PaymentStatusClp)) {
			return false;
		}

		PaymentStatusClp paymentStatus = (PaymentStatusClp)obj;

		long primaryKey = paymentStatus.getPrimaryKey();

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
		sb.append(", vehicleRecordId=");
		sb.append(getVehicleRecordId());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", basicCurrency=");
		sb.append(getBasicCurrency());
		sb.append(", exchangeRate=");
		sb.append(getExchangeRate());
		sb.append(", inspectionFee=");
		sb.append(getInspectionFee());
		sb.append(", otherCosts=");
		sb.append(getOtherCosts());
		sb.append(", totalCostsAndFee=");
		sb.append(getTotalCostsAndFee());
		sb.append(", tax=");
		sb.append(getTax());
		sb.append(", charges=");
		sb.append(getCharges());
		sb.append(", totalRealDebit=");
		sb.append(getTotalRealDebit());
		sb.append(", totalDebit=");
		sb.append(getTotalDebit());
		sb.append(", totalCredit=");
		sb.append(getTotalCredit());
		sb.append(", currentStatus=");
		sb.append(getCurrentStatus());
		sb.append(", debitNoteNumber=");
		sb.append(getDebitNoteNumber());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleRecordId</column-name><column-value><![CDATA[");
		sb.append(getVehicleRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>basicCurrency</column-name><column-value><![CDATA[");
		sb.append(getBasicCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exchangeRate</column-name><column-value><![CDATA[");
		sb.append(getExchangeRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionFee</column-name><column-value><![CDATA[");
		sb.append(getInspectionFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherCosts</column-name><column-value><![CDATA[");
		sb.append(getOtherCosts());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalCostsAndFee</column-name><column-value><![CDATA[");
		sb.append(getTotalCostsAndFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tax</column-name><column-value><![CDATA[");
		sb.append(getTax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>charges</column-name><column-value><![CDATA[");
		sb.append(getCharges());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalRealDebit</column-name><column-value><![CDATA[");
		sb.append(getTotalRealDebit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalDebit</column-name><column-value><![CDATA[");
		sb.append(getTotalDebit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalCredit</column-name><column-value><![CDATA[");
		sb.append(getTotalCredit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentStatus</column-name><column-value><![CDATA[");
		sb.append(getCurrentStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>debitNoteNumber</column-name><column-value><![CDATA[");
		sb.append(getDebitNoteNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _vehicleRecordId;
	private long _attachedFile;
	private double _unitPrice;
	private String _currency;
	private String _basicCurrency;
	private double _exchangeRate;
	private double _inspectionFee;
	private double _otherCosts;
	private double _totalCostsAndFee;
	private double _tax;
	private double _charges;
	private double _totalRealDebit;
	private double _totalDebit;
	private double _totalCredit;
	private long _currentStatus;
	private String _debitNoteNumber;
	private BaseModel<?> _paymentStatusRemoteModel;
}