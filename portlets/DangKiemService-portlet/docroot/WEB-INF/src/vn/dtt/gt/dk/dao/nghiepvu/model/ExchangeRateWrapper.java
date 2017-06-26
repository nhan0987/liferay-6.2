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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ExchangeRate}.
 * </p>
 *
 * @author huymq
 * @see ExchangeRate
 * @generated
 */
public class ExchangeRateWrapper implements ExchangeRate,
	ModelWrapper<ExchangeRate> {
	public ExchangeRateWrapper(ExchangeRate exchangeRate) {
		_exchangeRate = exchangeRate;
	}

	@Override
	public Class<?> getModelClass() {
		return ExchangeRate.class;
	}

	@Override
	public String getModelClassName() {
		return ExchangeRate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("originalCurrency", getOriginalCurrency());
		attributes.put("basicCurrency", getBasicCurrency());
		attributes.put("exchangeRate", getExchangeRate());
		attributes.put("publishDate", getPublishDate());
		attributes.put("validFrom", getValidFrom());
		attributes.put("validUntil", getValidUntil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String originalCurrency = (String)attributes.get("originalCurrency");

		if (originalCurrency != null) {
			setOriginalCurrency(originalCurrency);
		}

		String basicCurrency = (String)attributes.get("basicCurrency");

		if (basicCurrency != null) {
			setBasicCurrency(basicCurrency);
		}

		Double exchangeRate = (Double)attributes.get("exchangeRate");

		if (exchangeRate != null) {
			setExchangeRate(exchangeRate);
		}

		Date publishDate = (Date)attributes.get("publishDate");

		if (publishDate != null) {
			setPublishDate(publishDate);
		}

		Date validFrom = (Date)attributes.get("validFrom");

		if (validFrom != null) {
			setValidFrom(validFrom);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
		}
	}

	/**
	* Returns the primary key of this exchange rate.
	*
	* @return the primary key of this exchange rate
	*/
	@Override
	public long getPrimaryKey() {
		return _exchangeRate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this exchange rate.
	*
	* @param primaryKey the primary key of this exchange rate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_exchangeRate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this exchange rate.
	*
	* @return the ID of this exchange rate
	*/
	@Override
	public long getId() {
		return _exchangeRate.getId();
	}

	/**
	* Sets the ID of this exchange rate.
	*
	* @param id the ID of this exchange rate
	*/
	@Override
	public void setId(long id) {
		_exchangeRate.setId(id);
	}

	/**
	* Returns the original currency of this exchange rate.
	*
	* @return the original currency of this exchange rate
	*/
	@Override
	public java.lang.String getOriginalCurrency() {
		return _exchangeRate.getOriginalCurrency();
	}

	/**
	* Sets the original currency of this exchange rate.
	*
	* @param originalCurrency the original currency of this exchange rate
	*/
	@Override
	public void setOriginalCurrency(java.lang.String originalCurrency) {
		_exchangeRate.setOriginalCurrency(originalCurrency);
	}

	/**
	* Returns the basic currency of this exchange rate.
	*
	* @return the basic currency of this exchange rate
	*/
	@Override
	public java.lang.String getBasicCurrency() {
		return _exchangeRate.getBasicCurrency();
	}

	/**
	* Sets the basic currency of this exchange rate.
	*
	* @param basicCurrency the basic currency of this exchange rate
	*/
	@Override
	public void setBasicCurrency(java.lang.String basicCurrency) {
		_exchangeRate.setBasicCurrency(basicCurrency);
	}

	/**
	* Returns the exchange rate of this exchange rate.
	*
	* @return the exchange rate of this exchange rate
	*/
	@Override
	public double getExchangeRate() {
		return _exchangeRate.getExchangeRate();
	}

	/**
	* Sets the exchange rate of this exchange rate.
	*
	* @param exchangeRate the exchange rate of this exchange rate
	*/
	@Override
	public void setExchangeRate(double exchangeRate) {
		_exchangeRate.setExchangeRate(exchangeRate);
	}

	/**
	* Returns the publish date of this exchange rate.
	*
	* @return the publish date of this exchange rate
	*/
	@Override
	public java.util.Date getPublishDate() {
		return _exchangeRate.getPublishDate();
	}

	/**
	* Sets the publish date of this exchange rate.
	*
	* @param publishDate the publish date of this exchange rate
	*/
	@Override
	public void setPublishDate(java.util.Date publishDate) {
		_exchangeRate.setPublishDate(publishDate);
	}

	/**
	* Returns the valid from of this exchange rate.
	*
	* @return the valid from of this exchange rate
	*/
	@Override
	public java.util.Date getValidFrom() {
		return _exchangeRate.getValidFrom();
	}

	/**
	* Sets the valid from of this exchange rate.
	*
	* @param validFrom the valid from of this exchange rate
	*/
	@Override
	public void setValidFrom(java.util.Date validFrom) {
		_exchangeRate.setValidFrom(validFrom);
	}

	/**
	* Returns the valid until of this exchange rate.
	*
	* @return the valid until of this exchange rate
	*/
	@Override
	public java.util.Date getValidUntil() {
		return _exchangeRate.getValidUntil();
	}

	/**
	* Sets the valid until of this exchange rate.
	*
	* @param validUntil the valid until of this exchange rate
	*/
	@Override
	public void setValidUntil(java.util.Date validUntil) {
		_exchangeRate.setValidUntil(validUntil);
	}

	@Override
	public boolean isNew() {
		return _exchangeRate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_exchangeRate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _exchangeRate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_exchangeRate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _exchangeRate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _exchangeRate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_exchangeRate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _exchangeRate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_exchangeRate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_exchangeRate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_exchangeRate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ExchangeRateWrapper((ExchangeRate)_exchangeRate.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate exchangeRate) {
		return _exchangeRate.compareTo(exchangeRate);
	}

	@Override
	public int hashCode() {
		return _exchangeRate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> toCacheModel() {
		return _exchangeRate.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate toEscapedModel() {
		return new ExchangeRateWrapper(_exchangeRate.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate toUnescapedModel() {
		return new ExchangeRateWrapper(_exchangeRate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _exchangeRate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _exchangeRate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_exchangeRate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExchangeRateWrapper)) {
			return false;
		}

		ExchangeRateWrapper exchangeRateWrapper = (ExchangeRateWrapper)obj;

		if (Validator.equals(_exchangeRate, exchangeRateWrapper._exchangeRate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ExchangeRate getWrappedExchangeRate() {
		return _exchangeRate;
	}

	@Override
	public ExchangeRate getWrappedModel() {
		return _exchangeRate;
	}

	@Override
	public void resetOriginalValues() {
		_exchangeRate.resetOriginalValues();
	}

	private ExchangeRate _exchangeRate;
}