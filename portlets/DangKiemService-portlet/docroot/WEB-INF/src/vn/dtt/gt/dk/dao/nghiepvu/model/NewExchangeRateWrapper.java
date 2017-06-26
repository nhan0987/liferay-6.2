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
 * This class is a wrapper for {@link NewExchangeRate}.
 * </p>
 *
 * @author huymq
 * @see NewExchangeRate
 * @generated
 */
public class NewExchangeRateWrapper implements NewExchangeRate,
	ModelWrapper<NewExchangeRate> {
	public NewExchangeRateWrapper(NewExchangeRate newExchangeRate) {
		_newExchangeRate = newExchangeRate;
	}

	@Override
	public Class<?> getModelClass() {
		return NewExchangeRate.class;
	}

	@Override
	public String getModelClassName() {
		return NewExchangeRate.class.getName();
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
		attributes.put("synchdate", getSynchdate());

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

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this new exchange rate.
	*
	* @return the primary key of this new exchange rate
	*/
	@Override
	public long getPrimaryKey() {
		return _newExchangeRate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this new exchange rate.
	*
	* @param primaryKey the primary key of this new exchange rate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_newExchangeRate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this new exchange rate.
	*
	* @return the ID of this new exchange rate
	*/
	@Override
	public long getId() {
		return _newExchangeRate.getId();
	}

	/**
	* Sets the ID of this new exchange rate.
	*
	* @param id the ID of this new exchange rate
	*/
	@Override
	public void setId(long id) {
		_newExchangeRate.setId(id);
	}

	/**
	* Returns the original currency of this new exchange rate.
	*
	* @return the original currency of this new exchange rate
	*/
	@Override
	public java.lang.String getOriginalCurrency() {
		return _newExchangeRate.getOriginalCurrency();
	}

	/**
	* Sets the original currency of this new exchange rate.
	*
	* @param originalCurrency the original currency of this new exchange rate
	*/
	@Override
	public void setOriginalCurrency(java.lang.String originalCurrency) {
		_newExchangeRate.setOriginalCurrency(originalCurrency);
	}

	/**
	* Returns the basic currency of this new exchange rate.
	*
	* @return the basic currency of this new exchange rate
	*/
	@Override
	public java.lang.String getBasicCurrency() {
		return _newExchangeRate.getBasicCurrency();
	}

	/**
	* Sets the basic currency of this new exchange rate.
	*
	* @param basicCurrency the basic currency of this new exchange rate
	*/
	@Override
	public void setBasicCurrency(java.lang.String basicCurrency) {
		_newExchangeRate.setBasicCurrency(basicCurrency);
	}

	/**
	* Returns the exchange rate of this new exchange rate.
	*
	* @return the exchange rate of this new exchange rate
	*/
	@Override
	public double getExchangeRate() {
		return _newExchangeRate.getExchangeRate();
	}

	/**
	* Sets the exchange rate of this new exchange rate.
	*
	* @param exchangeRate the exchange rate of this new exchange rate
	*/
	@Override
	public void setExchangeRate(double exchangeRate) {
		_newExchangeRate.setExchangeRate(exchangeRate);
	}

	/**
	* Returns the publish date of this new exchange rate.
	*
	* @return the publish date of this new exchange rate
	*/
	@Override
	public java.util.Date getPublishDate() {
		return _newExchangeRate.getPublishDate();
	}

	/**
	* Sets the publish date of this new exchange rate.
	*
	* @param publishDate the publish date of this new exchange rate
	*/
	@Override
	public void setPublishDate(java.util.Date publishDate) {
		_newExchangeRate.setPublishDate(publishDate);
	}

	/**
	* Returns the valid from of this new exchange rate.
	*
	* @return the valid from of this new exchange rate
	*/
	@Override
	public java.util.Date getValidFrom() {
		return _newExchangeRate.getValidFrom();
	}

	/**
	* Sets the valid from of this new exchange rate.
	*
	* @param validFrom the valid from of this new exchange rate
	*/
	@Override
	public void setValidFrom(java.util.Date validFrom) {
		_newExchangeRate.setValidFrom(validFrom);
	}

	/**
	* Returns the valid until of this new exchange rate.
	*
	* @return the valid until of this new exchange rate
	*/
	@Override
	public java.util.Date getValidUntil() {
		return _newExchangeRate.getValidUntil();
	}

	/**
	* Sets the valid until of this new exchange rate.
	*
	* @param validUntil the valid until of this new exchange rate
	*/
	@Override
	public void setValidUntil(java.util.Date validUntil) {
		_newExchangeRate.setValidUntil(validUntil);
	}

	/**
	* Returns the synchdate of this new exchange rate.
	*
	* @return the synchdate of this new exchange rate
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _newExchangeRate.getSynchdate();
	}

	/**
	* Sets the synchdate of this new exchange rate.
	*
	* @param synchdate the synchdate of this new exchange rate
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_newExchangeRate.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _newExchangeRate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_newExchangeRate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _newExchangeRate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_newExchangeRate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _newExchangeRate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _newExchangeRate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_newExchangeRate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _newExchangeRate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_newExchangeRate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_newExchangeRate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_newExchangeRate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NewExchangeRateWrapper((NewExchangeRate)_newExchangeRate.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate newExchangeRate) {
		return _newExchangeRate.compareTo(newExchangeRate);
	}

	@Override
	public int hashCode() {
		return _newExchangeRate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> toCacheModel() {
		return _newExchangeRate.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate toEscapedModel() {
		return new NewExchangeRateWrapper(_newExchangeRate.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate toUnescapedModel() {
		return new NewExchangeRateWrapper(_newExchangeRate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _newExchangeRate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _newExchangeRate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_newExchangeRate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewExchangeRateWrapper)) {
			return false;
		}

		NewExchangeRateWrapper newExchangeRateWrapper = (NewExchangeRateWrapper)obj;

		if (Validator.equals(_newExchangeRate,
					newExchangeRateWrapper._newExchangeRate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NewExchangeRate getWrappedNewExchangeRate() {
		return _newExchangeRate;
	}

	@Override
	public NewExchangeRate getWrappedModel() {
		return _newExchangeRate;
	}

	@Override
	public void resetOriginalValues() {
		_newExchangeRate.resetOriginalValues();
	}

	private NewExchangeRate _newExchangeRate;
}