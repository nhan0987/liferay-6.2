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
 * The base model interface for the PaymentStatus service. Represents a row in the &quot;vr_paymentstatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusImpl}.
 * </p>
 *
 * @author win_64
 * @see PaymentStatus
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl
 * @generated
 */
public interface PaymentStatusModel extends BaseModel<PaymentStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a payment status model instance should use the {@link PaymentStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this payment status.
	 *
	 * @return the primary key of this payment status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this payment status.
	 *
	 * @param primaryKey the primary key of this payment status
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this payment status.
	 *
	 * @return the ID of this payment status
	 */
	public long getId();

	/**
	 * Sets the ID of this payment status.
	 *
	 * @param id the ID of this payment status
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle record ID of this payment status.
	 *
	 * @return the vehicle record ID of this payment status
	 */
	public long getVehicleRecordId();

	/**
	 * Sets the vehicle record ID of this payment status.
	 *
	 * @param vehicleRecordId the vehicle record ID of this payment status
	 */
	public void setVehicleRecordId(long vehicleRecordId);

	/**
	 * Returns the attached file of this payment status.
	 *
	 * @return the attached file of this payment status
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this payment status.
	 *
	 * @param attachedFile the attached file of this payment status
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the unit price of this payment status.
	 *
	 * @return the unit price of this payment status
	 */
	public double getUnitPrice();

	/**
	 * Sets the unit price of this payment status.
	 *
	 * @param unitPrice the unit price of this payment status
	 */
	public void setUnitPrice(double unitPrice);

	/**
	 * Returns the currency of this payment status.
	 *
	 * @return the currency of this payment status
	 */
	@AutoEscape
	public String getCurrency();

	/**
	 * Sets the currency of this payment status.
	 *
	 * @param currency the currency of this payment status
	 */
	public void setCurrency(String currency);

	/**
	 * Returns the basic currency of this payment status.
	 *
	 * @return the basic currency of this payment status
	 */
	@AutoEscape
	public String getBasicCurrency();

	/**
	 * Sets the basic currency of this payment status.
	 *
	 * @param basicCurrency the basic currency of this payment status
	 */
	public void setBasicCurrency(String basicCurrency);

	/**
	 * Returns the exchange rate of this payment status.
	 *
	 * @return the exchange rate of this payment status
	 */
	public double getExchangeRate();

	/**
	 * Sets the exchange rate of this payment status.
	 *
	 * @param exchangeRate the exchange rate of this payment status
	 */
	public void setExchangeRate(double exchangeRate);

	/**
	 * Returns the inspection fee of this payment status.
	 *
	 * @return the inspection fee of this payment status
	 */
	public double getInspectionFee();

	/**
	 * Sets the inspection fee of this payment status.
	 *
	 * @param inspectionFee the inspection fee of this payment status
	 */
	public void setInspectionFee(double inspectionFee);

	/**
	 * Returns the other costs of this payment status.
	 *
	 * @return the other costs of this payment status
	 */
	public double getOtherCosts();

	/**
	 * Sets the other costs of this payment status.
	 *
	 * @param otherCosts the other costs of this payment status
	 */
	public void setOtherCosts(double otherCosts);

	/**
	 * Returns the total costs and fee of this payment status.
	 *
	 * @return the total costs and fee of this payment status
	 */
	public double getTotalCostsAndFee();

	/**
	 * Sets the total costs and fee of this payment status.
	 *
	 * @param totalCostsAndFee the total costs and fee of this payment status
	 */
	public void setTotalCostsAndFee(double totalCostsAndFee);

	/**
	 * Returns the tax of this payment status.
	 *
	 * @return the tax of this payment status
	 */
	public double getTax();

	/**
	 * Sets the tax of this payment status.
	 *
	 * @param tax the tax of this payment status
	 */
	public void setTax(double tax);

	/**
	 * Returns the charges of this payment status.
	 *
	 * @return the charges of this payment status
	 */
	public double getCharges();

	/**
	 * Sets the charges of this payment status.
	 *
	 * @param charges the charges of this payment status
	 */
	public void setCharges(double charges);

	/**
	 * Returns the total real debit of this payment status.
	 *
	 * @return the total real debit of this payment status
	 */
	public double getTotalRealDebit();

	/**
	 * Sets the total real debit of this payment status.
	 *
	 * @param totalRealDebit the total real debit of this payment status
	 */
	public void setTotalRealDebit(double totalRealDebit);

	/**
	 * Returns the total debit of this payment status.
	 *
	 * @return the total debit of this payment status
	 */
	public double getTotalDebit();

	/**
	 * Sets the total debit of this payment status.
	 *
	 * @param totalDebit the total debit of this payment status
	 */
	public void setTotalDebit(double totalDebit);

	/**
	 * Returns the total credit of this payment status.
	 *
	 * @return the total credit of this payment status
	 */
	public double getTotalCredit();

	/**
	 * Sets the total credit of this payment status.
	 *
	 * @param totalCredit the total credit of this payment status
	 */
	public void setTotalCredit(double totalCredit);

	/**
	 * Returns the current status of this payment status.
	 *
	 * @return the current status of this payment status
	 */
	public long getCurrentStatus();

	/**
	 * Sets the current status of this payment status.
	 *
	 * @param currentStatus the current status of this payment status
	 */
	public void setCurrentStatus(long currentStatus);

	/**
	 * Returns the debit note number of this payment status.
	 *
	 * @return the debit note number of this payment status
	 */
	@AutoEscape
	public String getDebitNoteNumber();

	/**
	 * Sets the debit note number of this payment status.
	 *
	 * @param debitNoteNumber the debit note number of this payment status
	 */
	public void setDebitNoteNumber(String debitNoteNumber);

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
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}