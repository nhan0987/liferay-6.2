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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentStatus}.
 * </p>
 *
 * @author huymq
 * @see PaymentStatus
 * @generated
 */
public class PaymentStatusWrapper implements PaymentStatus,
	ModelWrapper<PaymentStatus> {
	public PaymentStatusWrapper(PaymentStatus paymentStatus) {
		_paymentStatus = paymentStatus;
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

	/**
	* Returns the primary key of this payment status.
	*
	* @return the primary key of this payment status
	*/
	@Override
	public long getPrimaryKey() {
		return _paymentStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this payment status.
	*
	* @param primaryKey the primary key of this payment status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paymentStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this payment status.
	*
	* @return the ID of this payment status
	*/
	@Override
	public long getId() {
		return _paymentStatus.getId();
	}

	/**
	* Sets the ID of this payment status.
	*
	* @param id the ID of this payment status
	*/
	@Override
	public void setId(long id) {
		_paymentStatus.setId(id);
	}

	/**
	* Returns the vehicle record ID of this payment status.
	*
	* @return the vehicle record ID of this payment status
	*/
	@Override
	public long getVehicleRecordId() {
		return _paymentStatus.getVehicleRecordId();
	}

	/**
	* Sets the vehicle record ID of this payment status.
	*
	* @param vehicleRecordId the vehicle record ID of this payment status
	*/
	@Override
	public void setVehicleRecordId(long vehicleRecordId) {
		_paymentStatus.setVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the attached file of this payment status.
	*
	* @return the attached file of this payment status
	*/
	@Override
	public long getAttachedFile() {
		return _paymentStatus.getAttachedFile();
	}

	/**
	* Sets the attached file of this payment status.
	*
	* @param attachedFile the attached file of this payment status
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_paymentStatus.setAttachedFile(attachedFile);
	}

	/**
	* Returns the unit price of this payment status.
	*
	* @return the unit price of this payment status
	*/
	@Override
	public double getUnitPrice() {
		return _paymentStatus.getUnitPrice();
	}

	/**
	* Sets the unit price of this payment status.
	*
	* @param unitPrice the unit price of this payment status
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_paymentStatus.setUnitPrice(unitPrice);
	}

	/**
	* Returns the currency of this payment status.
	*
	* @return the currency of this payment status
	*/
	@Override
	public java.lang.String getCurrency() {
		return _paymentStatus.getCurrency();
	}

	/**
	* Sets the currency of this payment status.
	*
	* @param currency the currency of this payment status
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_paymentStatus.setCurrency(currency);
	}

	/**
	* Returns the basic currency of this payment status.
	*
	* @return the basic currency of this payment status
	*/
	@Override
	public java.lang.String getBasicCurrency() {
		return _paymentStatus.getBasicCurrency();
	}

	/**
	* Sets the basic currency of this payment status.
	*
	* @param basicCurrency the basic currency of this payment status
	*/
	@Override
	public void setBasicCurrency(java.lang.String basicCurrency) {
		_paymentStatus.setBasicCurrency(basicCurrency);
	}

	/**
	* Returns the exchange rate of this payment status.
	*
	* @return the exchange rate of this payment status
	*/
	@Override
	public double getExchangeRate() {
		return _paymentStatus.getExchangeRate();
	}

	/**
	* Sets the exchange rate of this payment status.
	*
	* @param exchangeRate the exchange rate of this payment status
	*/
	@Override
	public void setExchangeRate(double exchangeRate) {
		_paymentStatus.setExchangeRate(exchangeRate);
	}

	/**
	* Returns the inspection fee of this payment status.
	*
	* @return the inspection fee of this payment status
	*/
	@Override
	public double getInspectionFee() {
		return _paymentStatus.getInspectionFee();
	}

	/**
	* Sets the inspection fee of this payment status.
	*
	* @param inspectionFee the inspection fee of this payment status
	*/
	@Override
	public void setInspectionFee(double inspectionFee) {
		_paymentStatus.setInspectionFee(inspectionFee);
	}

	/**
	* Returns the other costs of this payment status.
	*
	* @return the other costs of this payment status
	*/
	@Override
	public double getOtherCosts() {
		return _paymentStatus.getOtherCosts();
	}

	/**
	* Sets the other costs of this payment status.
	*
	* @param otherCosts the other costs of this payment status
	*/
	@Override
	public void setOtherCosts(double otherCosts) {
		_paymentStatus.setOtherCosts(otherCosts);
	}

	/**
	* Returns the total costs and fee of this payment status.
	*
	* @return the total costs and fee of this payment status
	*/
	@Override
	public double getTotalCostsAndFee() {
		return _paymentStatus.getTotalCostsAndFee();
	}

	/**
	* Sets the total costs and fee of this payment status.
	*
	* @param totalCostsAndFee the total costs and fee of this payment status
	*/
	@Override
	public void setTotalCostsAndFee(double totalCostsAndFee) {
		_paymentStatus.setTotalCostsAndFee(totalCostsAndFee);
	}

	/**
	* Returns the tax of this payment status.
	*
	* @return the tax of this payment status
	*/
	@Override
	public double getTax() {
		return _paymentStatus.getTax();
	}

	/**
	* Sets the tax of this payment status.
	*
	* @param tax the tax of this payment status
	*/
	@Override
	public void setTax(double tax) {
		_paymentStatus.setTax(tax);
	}

	/**
	* Returns the charges of this payment status.
	*
	* @return the charges of this payment status
	*/
	@Override
	public double getCharges() {
		return _paymentStatus.getCharges();
	}

	/**
	* Sets the charges of this payment status.
	*
	* @param charges the charges of this payment status
	*/
	@Override
	public void setCharges(double charges) {
		_paymentStatus.setCharges(charges);
	}

	/**
	* Returns the total real debit of this payment status.
	*
	* @return the total real debit of this payment status
	*/
	@Override
	public double getTotalRealDebit() {
		return _paymentStatus.getTotalRealDebit();
	}

	/**
	* Sets the total real debit of this payment status.
	*
	* @param totalRealDebit the total real debit of this payment status
	*/
	@Override
	public void setTotalRealDebit(double totalRealDebit) {
		_paymentStatus.setTotalRealDebit(totalRealDebit);
	}

	/**
	* Returns the total debit of this payment status.
	*
	* @return the total debit of this payment status
	*/
	@Override
	public double getTotalDebit() {
		return _paymentStatus.getTotalDebit();
	}

	/**
	* Sets the total debit of this payment status.
	*
	* @param totalDebit the total debit of this payment status
	*/
	@Override
	public void setTotalDebit(double totalDebit) {
		_paymentStatus.setTotalDebit(totalDebit);
	}

	/**
	* Returns the total credit of this payment status.
	*
	* @return the total credit of this payment status
	*/
	@Override
	public double getTotalCredit() {
		return _paymentStatus.getTotalCredit();
	}

	/**
	* Sets the total credit of this payment status.
	*
	* @param totalCredit the total credit of this payment status
	*/
	@Override
	public void setTotalCredit(double totalCredit) {
		_paymentStatus.setTotalCredit(totalCredit);
	}

	/**
	* Returns the current status of this payment status.
	*
	* @return the current status of this payment status
	*/
	@Override
	public long getCurrentStatus() {
		return _paymentStatus.getCurrentStatus();
	}

	/**
	* Sets the current status of this payment status.
	*
	* @param currentStatus the current status of this payment status
	*/
	@Override
	public void setCurrentStatus(long currentStatus) {
		_paymentStatus.setCurrentStatus(currentStatus);
	}

	/**
	* Returns the debit note number of this payment status.
	*
	* @return the debit note number of this payment status
	*/
	@Override
	public java.lang.String getDebitNoteNumber() {
		return _paymentStatus.getDebitNoteNumber();
	}

	/**
	* Sets the debit note number of this payment status.
	*
	* @param debitNoteNumber the debit note number of this payment status
	*/
	@Override
	public void setDebitNoteNumber(java.lang.String debitNoteNumber) {
		_paymentStatus.setDebitNoteNumber(debitNoteNumber);
	}

	@Override
	public boolean isNew() {
		return _paymentStatus.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentStatus.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentStatus.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentStatus.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentStatus.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentStatus.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentStatus.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentStatusWrapper((PaymentStatus)_paymentStatus.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus) {
		return _paymentStatus.compareTo(paymentStatus);
	}

	@Override
	public int hashCode() {
		return _paymentStatus.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> toCacheModel() {
		return _paymentStatus.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus toEscapedModel() {
		return new PaymentStatusWrapper(_paymentStatus.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus toUnescapedModel() {
		return new PaymentStatusWrapper(_paymentStatus.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentStatus.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentStatus.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentStatusWrapper)) {
			return false;
		}

		PaymentStatusWrapper paymentStatusWrapper = (PaymentStatusWrapper)obj;

		if (Validator.equals(_paymentStatus, paymentStatusWrapper._paymentStatus)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentStatus getWrappedPaymentStatus() {
		return _paymentStatus;
	}

	@Override
	public PaymentStatus getWrappedModel() {
		return _paymentStatus;
	}

	@Override
	public void resetOriginalValues() {
		_paymentStatus.resetOriginalValues();
	}

	private PaymentStatus _paymentStatus;
}