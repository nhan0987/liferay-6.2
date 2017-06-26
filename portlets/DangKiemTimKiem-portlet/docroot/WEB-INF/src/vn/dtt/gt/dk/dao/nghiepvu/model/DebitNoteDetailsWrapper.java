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
 * This class is a wrapper for {@link DebitNoteDetails}.
 * </p>
 *
 * @author win_64
 * @see DebitNoteDetails
 * @generated
 */
public class DebitNoteDetailsWrapper implements DebitNoteDetails,
	ModelWrapper<DebitNoteDetails> {
	public DebitNoteDetailsWrapper(DebitNoteDetails debitNoteDetails) {
		_debitNoteDetails = debitNoteDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return DebitNoteDetails.class;
	}

	@Override
	public String getModelClassName() {
		return DebitNoteDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleRecordId", getVehicleRecordId());
		attributes.put("debitNoteId", getDebitNoteId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
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

		Long debitNoteId = (Long)attributes.get("debitNoteId");

		if (debitNoteId != null) {
			setDebitNoteId(debitNoteId);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
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
	}

	/**
	* Returns the primary key of this debit note details.
	*
	* @return the primary key of this debit note details
	*/
	@Override
	public long getPrimaryKey() {
		return _debitNoteDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this debit note details.
	*
	* @param primaryKey the primary key of this debit note details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_debitNoteDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this debit note details.
	*
	* @return the ID of this debit note details
	*/
	@Override
	public long getId() {
		return _debitNoteDetails.getId();
	}

	/**
	* Sets the ID of this debit note details.
	*
	* @param id the ID of this debit note details
	*/
	@Override
	public void setId(long id) {
		_debitNoteDetails.setId(id);
	}

	/**
	* Returns the vehicle record ID of this debit note details.
	*
	* @return the vehicle record ID of this debit note details
	*/
	@Override
	public long getVehicleRecordId() {
		return _debitNoteDetails.getVehicleRecordId();
	}

	/**
	* Sets the vehicle record ID of this debit note details.
	*
	* @param vehicleRecordId the vehicle record ID of this debit note details
	*/
	@Override
	public void setVehicleRecordId(long vehicleRecordId) {
		_debitNoteDetails.setVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the debit note ID of this debit note details.
	*
	* @return the debit note ID of this debit note details
	*/
	@Override
	public long getDebitNoteId() {
		return _debitNoteDetails.getDebitNoteId();
	}

	/**
	* Sets the debit note ID of this debit note details.
	*
	* @param debitNoteId the debit note ID of this debit note details
	*/
	@Override
	public void setDebitNoteId(long debitNoteId) {
		_debitNoteDetails.setDebitNoteId(debitNoteId);
	}

	/**
	* Returns the inspection record ID of this debit note details.
	*
	* @return the inspection record ID of this debit note details
	*/
	@Override
	public long getInspectionRecordId() {
		return _debitNoteDetails.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this debit note details.
	*
	* @param inspectionRecordId the inspection record ID of this debit note details
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_debitNoteDetails.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the unit price of this debit note details.
	*
	* @return the unit price of this debit note details
	*/
	@Override
	public double getUnitPrice() {
		return _debitNoteDetails.getUnitPrice();
	}

	/**
	* Sets the unit price of this debit note details.
	*
	* @param unitPrice the unit price of this debit note details
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_debitNoteDetails.setUnitPrice(unitPrice);
	}

	/**
	* Returns the currency of this debit note details.
	*
	* @return the currency of this debit note details
	*/
	@Override
	public java.lang.String getCurrency() {
		return _debitNoteDetails.getCurrency();
	}

	/**
	* Sets the currency of this debit note details.
	*
	* @param currency the currency of this debit note details
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_debitNoteDetails.setCurrency(currency);
	}

	/**
	* Returns the basic currency of this debit note details.
	*
	* @return the basic currency of this debit note details
	*/
	@Override
	public java.lang.String getBasicCurrency() {
		return _debitNoteDetails.getBasicCurrency();
	}

	/**
	* Sets the basic currency of this debit note details.
	*
	* @param basicCurrency the basic currency of this debit note details
	*/
	@Override
	public void setBasicCurrency(java.lang.String basicCurrency) {
		_debitNoteDetails.setBasicCurrency(basicCurrency);
	}

	/**
	* Returns the exchange rate of this debit note details.
	*
	* @return the exchange rate of this debit note details
	*/
	@Override
	public double getExchangeRate() {
		return _debitNoteDetails.getExchangeRate();
	}

	/**
	* Sets the exchange rate of this debit note details.
	*
	* @param exchangeRate the exchange rate of this debit note details
	*/
	@Override
	public void setExchangeRate(double exchangeRate) {
		_debitNoteDetails.setExchangeRate(exchangeRate);
	}

	/**
	* Returns the inspection fee of this debit note details.
	*
	* @return the inspection fee of this debit note details
	*/
	@Override
	public double getInspectionFee() {
		return _debitNoteDetails.getInspectionFee();
	}

	/**
	* Sets the inspection fee of this debit note details.
	*
	* @param inspectionFee the inspection fee of this debit note details
	*/
	@Override
	public void setInspectionFee(double inspectionFee) {
		_debitNoteDetails.setInspectionFee(inspectionFee);
	}

	/**
	* Returns the other costs of this debit note details.
	*
	* @return the other costs of this debit note details
	*/
	@Override
	public double getOtherCosts() {
		return _debitNoteDetails.getOtherCosts();
	}

	/**
	* Sets the other costs of this debit note details.
	*
	* @param otherCosts the other costs of this debit note details
	*/
	@Override
	public void setOtherCosts(double otherCosts) {
		_debitNoteDetails.setOtherCosts(otherCosts);
	}

	/**
	* Returns the total costs and fee of this debit note details.
	*
	* @return the total costs and fee of this debit note details
	*/
	@Override
	public double getTotalCostsAndFee() {
		return _debitNoteDetails.getTotalCostsAndFee();
	}

	/**
	* Sets the total costs and fee of this debit note details.
	*
	* @param totalCostsAndFee the total costs and fee of this debit note details
	*/
	@Override
	public void setTotalCostsAndFee(double totalCostsAndFee) {
		_debitNoteDetails.setTotalCostsAndFee(totalCostsAndFee);
	}

	/**
	* Returns the tax of this debit note details.
	*
	* @return the tax of this debit note details
	*/
	@Override
	public double getTax() {
		return _debitNoteDetails.getTax();
	}

	/**
	* Sets the tax of this debit note details.
	*
	* @param tax the tax of this debit note details
	*/
	@Override
	public void setTax(double tax) {
		_debitNoteDetails.setTax(tax);
	}

	/**
	* Returns the charges of this debit note details.
	*
	* @return the charges of this debit note details
	*/
	@Override
	public double getCharges() {
		return _debitNoteDetails.getCharges();
	}

	/**
	* Sets the charges of this debit note details.
	*
	* @param charges the charges of this debit note details
	*/
	@Override
	public void setCharges(double charges) {
		_debitNoteDetails.setCharges(charges);
	}

	/**
	* Returns the total real debit of this debit note details.
	*
	* @return the total real debit of this debit note details
	*/
	@Override
	public double getTotalRealDebit() {
		return _debitNoteDetails.getTotalRealDebit();
	}

	/**
	* Sets the total real debit of this debit note details.
	*
	* @param totalRealDebit the total real debit of this debit note details
	*/
	@Override
	public void setTotalRealDebit(double totalRealDebit) {
		_debitNoteDetails.setTotalRealDebit(totalRealDebit);
	}

	/**
	* Returns the total debit of this debit note details.
	*
	* @return the total debit of this debit note details
	*/
	@Override
	public double getTotalDebit() {
		return _debitNoteDetails.getTotalDebit();
	}

	/**
	* Sets the total debit of this debit note details.
	*
	* @param totalDebit the total debit of this debit note details
	*/
	@Override
	public void setTotalDebit(double totalDebit) {
		_debitNoteDetails.setTotalDebit(totalDebit);
	}

	@Override
	public boolean isNew() {
		return _debitNoteDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_debitNoteDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _debitNoteDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_debitNoteDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _debitNoteDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _debitNoteDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_debitNoteDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _debitNoteDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_debitNoteDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_debitNoteDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_debitNoteDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DebitNoteDetailsWrapper((DebitNoteDetails)_debitNoteDetails.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails debitNoteDetails) {
		return _debitNoteDetails.compareTo(debitNoteDetails);
	}

	@Override
	public int hashCode() {
		return _debitNoteDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> toCacheModel() {
		return _debitNoteDetails.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails toEscapedModel() {
		return new DebitNoteDetailsWrapper(_debitNoteDetails.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails toUnescapedModel() {
		return new DebitNoteDetailsWrapper(_debitNoteDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _debitNoteDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _debitNoteDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_debitNoteDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DebitNoteDetailsWrapper)) {
			return false;
		}

		DebitNoteDetailsWrapper debitNoteDetailsWrapper = (DebitNoteDetailsWrapper)obj;

		if (Validator.equals(_debitNoteDetails,
					debitNoteDetailsWrapper._debitNoteDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DebitNoteDetails getWrappedDebitNoteDetails() {
		return _debitNoteDetails;
	}

	@Override
	public DebitNoteDetails getWrappedModel() {
		return _debitNoteDetails;
	}

	@Override
	public void resetOriginalValues() {
		_debitNoteDetails.resetOriginalValues();
	}

	private DebitNoteDetails _debitNoteDetails;
}