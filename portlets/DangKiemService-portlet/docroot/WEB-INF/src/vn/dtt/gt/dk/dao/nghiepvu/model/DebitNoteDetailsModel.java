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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DebitNoteDetails service. Represents a row in the &quot;vr_debitnotedetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsImpl}.
 * </p>
 *
 * @author huymq
 * @see DebitNoteDetails
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl
 * @generated
 */
public interface DebitNoteDetailsModel extends BaseModel<DebitNoteDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a debit note details model instance should use the {@link DebitNoteDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this debit note details.
	 *
	 * @return the primary key of this debit note details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this debit note details.
	 *
	 * @param primaryKey the primary key of this debit note details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this debit note details.
	 *
	 * @return the ID of this debit note details
	 */
	public long getId();

	/**
	 * Sets the ID of this debit note details.
	 *
	 * @param id the ID of this debit note details
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle record ID of this debit note details.
	 *
	 * @return the vehicle record ID of this debit note details
	 */
	public long getVehicleRecordId();

	/**
	 * Sets the vehicle record ID of this debit note details.
	 *
	 * @param vehicleRecordId the vehicle record ID of this debit note details
	 */
	public void setVehicleRecordId(long vehicleRecordId);

	/**
	 * Returns the debit note ID of this debit note details.
	 *
	 * @return the debit note ID of this debit note details
	 */
	public long getDebitNoteId();

	/**
	 * Sets the debit note ID of this debit note details.
	 *
	 * @param debitNoteId the debit note ID of this debit note details
	 */
	public void setDebitNoteId(long debitNoteId);

	/**
	 * Returns the inspection record ID of this debit note details.
	 *
	 * @return the inspection record ID of this debit note details
	 */
	public long getInspectionRecordId();

	/**
	 * Sets the inspection record ID of this debit note details.
	 *
	 * @param inspectionRecordId the inspection record ID of this debit note details
	 */
	public void setInspectionRecordId(long inspectionRecordId);

	/**
	 * Returns the unit price of this debit note details.
	 *
	 * @return the unit price of this debit note details
	 */
	public double getUnitPrice();

	/**
	 * Sets the unit price of this debit note details.
	 *
	 * @param unitPrice the unit price of this debit note details
	 */
	public void setUnitPrice(double unitPrice);

	/**
	 * Returns the currency of this debit note details.
	 *
	 * @return the currency of this debit note details
	 */
	@AutoEscape
	public String getCurrency();

	/**
	 * Sets the currency of this debit note details.
	 *
	 * @param currency the currency of this debit note details
	 */
	public void setCurrency(String currency);

	/**
	 * Returns the basic currency of this debit note details.
	 *
	 * @return the basic currency of this debit note details
	 */
	@AutoEscape
	public String getBasicCurrency();

	/**
	 * Sets the basic currency of this debit note details.
	 *
	 * @param basicCurrency the basic currency of this debit note details
	 */
	public void setBasicCurrency(String basicCurrency);

	/**
	 * Returns the exchange rate of this debit note details.
	 *
	 * @return the exchange rate of this debit note details
	 */
	public double getExchangeRate();

	/**
	 * Sets the exchange rate of this debit note details.
	 *
	 * @param exchangeRate the exchange rate of this debit note details
	 */
	public void setExchangeRate(double exchangeRate);

	/**
	 * Returns the inspection fee of this debit note details.
	 *
	 * @return the inspection fee of this debit note details
	 */
	public double getInspectionFee();

	/**
	 * Sets the inspection fee of this debit note details.
	 *
	 * @param inspectionFee the inspection fee of this debit note details
	 */
	public void setInspectionFee(double inspectionFee);

	/**
	 * Returns the other costs of this debit note details.
	 *
	 * @return the other costs of this debit note details
	 */
	public double getOtherCosts();

	/**
	 * Sets the other costs of this debit note details.
	 *
	 * @param otherCosts the other costs of this debit note details
	 */
	public void setOtherCosts(double otherCosts);

	/**
	 * Returns the total costs and fee of this debit note details.
	 *
	 * @return the total costs and fee of this debit note details
	 */
	public double getTotalCostsAndFee();

	/**
	 * Sets the total costs and fee of this debit note details.
	 *
	 * @param totalCostsAndFee the total costs and fee of this debit note details
	 */
	public void setTotalCostsAndFee(double totalCostsAndFee);

	/**
	 * Returns the tax of this debit note details.
	 *
	 * @return the tax of this debit note details
	 */
	public double getTax();

	/**
	 * Sets the tax of this debit note details.
	 *
	 * @param tax the tax of this debit note details
	 */
	public void setTax(double tax);

	/**
	 * Returns the charges of this debit note details.
	 *
	 * @return the charges of this debit note details
	 */
	public double getCharges();

	/**
	 * Sets the charges of this debit note details.
	 *
	 * @param charges the charges of this debit note details
	 */
	public void setCharges(double charges);

	/**
	 * Returns the total real debit of this debit note details.
	 *
	 * @return the total real debit of this debit note details
	 */
	public double getTotalRealDebit();

	/**
	 * Sets the total real debit of this debit note details.
	 *
	 * @param totalRealDebit the total real debit of this debit note details
	 */
	public void setTotalRealDebit(double totalRealDebit);

	/**
	 * Returns the total debit of this debit note details.
	 *
	 * @return the total debit of this debit note details
	 */
	public double getTotalDebit();

	/**
	 * Sets the total debit of this debit note details.
	 *
	 * @param totalDebit the total debit of this debit note details
	 */
	public void setTotalDebit(double totalDebit);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(DebitNoteDetails debitNoteDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DebitNoteDetails> toCacheModel();

	@Override
	public DebitNoteDetails toEscapedModel();

	@Override
	public DebitNoteDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}