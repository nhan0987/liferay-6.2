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
 * This class is a wrapper for {@link ProductionCountry}.
 * </p>
 *
 * @author huymq
 * @see ProductionCountry
 * @generated
 */
public class ProductionCountryWrapper implements ProductionCountry,
	ModelWrapper<ProductionCountry> {
	public ProductionCountryWrapper(ProductionCountry productionCountry) {
		_productionCountry = productionCountry;
	}

	@Override
	public Class<?> getModelClass() {
		return ProductionCountry.class;
	}

	@Override
	public String getModelClassName() {
		return ProductionCountry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("countryCode", getCountryCode());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		String countryCode = (String)attributes.get("countryCode");

		if (countryCode != null) {
			setCountryCode(countryCode);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this production country.
	*
	* @return the primary key of this production country
	*/
	@Override
	public long getPrimaryKey() {
		return _productionCountry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this production country.
	*
	* @param primaryKey the primary key of this production country
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_productionCountry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this production country.
	*
	* @return the ID of this production country
	*/
	@Override
	public long getId() {
		return _productionCountry.getId();
	}

	/**
	* Sets the ID of this production country.
	*
	* @param id the ID of this production country
	*/
	@Override
	public void setId(long id) {
		_productionCountry.setId(id);
	}

	/**
	* Returns the vehicle group ID of this production country.
	*
	* @return the vehicle group ID of this production country
	*/
	@Override
	public long getVehicleGroupId() {
		return _productionCountry.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this production country.
	*
	* @param vehicleGroupId the vehicle group ID of this production country
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_productionCountry.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the country code of this production country.
	*
	* @return the country code of this production country
	*/
	@Override
	public java.lang.String getCountryCode() {
		return _productionCountry.getCountryCode();
	}

	/**
	* Sets the country code of this production country.
	*
	* @param countryCode the country code of this production country
	*/
	@Override
	public void setCountryCode(java.lang.String countryCode) {
		_productionCountry.setCountryCode(countryCode);
	}

	/**
	* Returns the synchdate of this production country.
	*
	* @return the synchdate of this production country
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _productionCountry.getSynchdate();
	}

	/**
	* Sets the synchdate of this production country.
	*
	* @param synchdate the synchdate of this production country
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_productionCountry.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _productionCountry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_productionCountry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _productionCountry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_productionCountry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _productionCountry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _productionCountry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_productionCountry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _productionCountry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_productionCountry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_productionCountry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_productionCountry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProductionCountryWrapper((ProductionCountry)_productionCountry.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry productionCountry) {
		return _productionCountry.compareTo(productionCountry);
	}

	@Override
	public int hashCode() {
		return _productionCountry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> toCacheModel() {
		return _productionCountry.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry toEscapedModel() {
		return new ProductionCountryWrapper(_productionCountry.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry toUnescapedModel() {
		return new ProductionCountryWrapper(_productionCountry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _productionCountry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _productionCountry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_productionCountry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductionCountryWrapper)) {
			return false;
		}

		ProductionCountryWrapper productionCountryWrapper = (ProductionCountryWrapper)obj;

		if (Validator.equals(_productionCountry,
					productionCountryWrapper._productionCountry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProductionCountry getWrappedProductionCountry() {
		return _productionCountry;
	}

	@Override
	public ProductionCountry getWrappedModel() {
		return _productionCountry;
	}

	@Override
	public void resetOriginalValues() {
		_productionCountry.resetOriginalValues();
	}

	private ProductionCountry _productionCountry;
}