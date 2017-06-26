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
 * This class is a wrapper for {@link CustomsDeclaration}.
 * </p>
 *
 * @author win_64
 * @see CustomsDeclaration
 * @generated
 */
public class CustomsDeclarationWrapper implements CustomsDeclaration,
	ModelWrapper<CustomsDeclaration> {
	public CustomsDeclarationWrapper(CustomsDeclaration customsDeclaration) {
		_customsDeclaration = customsDeclaration;
	}

	@Override
	public Class<?> getModelClass() {
		return CustomsDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return CustomsDeclaration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("importCustomDeclareNo", getImportCustomDeclareNo());
		attributes.put("importCustomDeclareDate", getImportCustomDeclareDate());
		attributes.put("customsResult", getCustomsResult());
		attributes.put("productCheck", getProductCheck());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("hosothutucId", getHosothutucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String importCustomDeclareNo = (String)attributes.get(
				"importCustomDeclareNo");

		if (importCustomDeclareNo != null) {
			setImportCustomDeclareNo(importCustomDeclareNo);
		}

		Date importCustomDeclareDate = (Date)attributes.get(
				"importCustomDeclareDate");

		if (importCustomDeclareDate != null) {
			setImportCustomDeclareDate(importCustomDeclareDate);
		}

		String customsResult = (String)attributes.get("customsResult");

		if (customsResult != null) {
			setCustomsResult(customsResult);
		}

		String productCheck = (String)attributes.get("productCheck");

		if (productCheck != null) {
			setProductCheck(productCheck);
		}

		Date releaseDate = (Date)attributes.get("releaseDate");

		if (releaseDate != null) {
			setReleaseDate(releaseDate);
		}

		Long hosothutucId = (Long)attributes.get("hosothutucId");

		if (hosothutucId != null) {
			setHosothutucId(hosothutucId);
		}
	}

	/**
	* Returns the primary key of this customs declaration.
	*
	* @return the primary key of this customs declaration
	*/
	@Override
	public long getPrimaryKey() {
		return _customsDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customs declaration.
	*
	* @param primaryKey the primary key of this customs declaration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customsDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this customs declaration.
	*
	* @return the ID of this customs declaration
	*/
	@Override
	public long getId() {
		return _customsDeclaration.getId();
	}

	/**
	* Sets the ID of this customs declaration.
	*
	* @param id the ID of this customs declaration
	*/
	@Override
	public void setId(long id) {
		_customsDeclaration.setId(id);
	}

	/**
	* Returns the import custom declare no of this customs declaration.
	*
	* @return the import custom declare no of this customs declaration
	*/
	@Override
	public java.lang.String getImportCustomDeclareNo() {
		return _customsDeclaration.getImportCustomDeclareNo();
	}

	/**
	* Sets the import custom declare no of this customs declaration.
	*
	* @param importCustomDeclareNo the import custom declare no of this customs declaration
	*/
	@Override
	public void setImportCustomDeclareNo(java.lang.String importCustomDeclareNo) {
		_customsDeclaration.setImportCustomDeclareNo(importCustomDeclareNo);
	}

	/**
	* Returns the import custom declare date of this customs declaration.
	*
	* @return the import custom declare date of this customs declaration
	*/
	@Override
	public java.util.Date getImportCustomDeclareDate() {
		return _customsDeclaration.getImportCustomDeclareDate();
	}

	/**
	* Sets the import custom declare date of this customs declaration.
	*
	* @param importCustomDeclareDate the import custom declare date of this customs declaration
	*/
	@Override
	public void setImportCustomDeclareDate(
		java.util.Date importCustomDeclareDate) {
		_customsDeclaration.setImportCustomDeclareDate(importCustomDeclareDate);
	}

	/**
	* Returns the customs result of this customs declaration.
	*
	* @return the customs result of this customs declaration
	*/
	@Override
	public java.lang.String getCustomsResult() {
		return _customsDeclaration.getCustomsResult();
	}

	/**
	* Sets the customs result of this customs declaration.
	*
	* @param customsResult the customs result of this customs declaration
	*/
	@Override
	public void setCustomsResult(java.lang.String customsResult) {
		_customsDeclaration.setCustomsResult(customsResult);
	}

	/**
	* Returns the product check of this customs declaration.
	*
	* @return the product check of this customs declaration
	*/
	@Override
	public java.lang.String getProductCheck() {
		return _customsDeclaration.getProductCheck();
	}

	/**
	* Sets the product check of this customs declaration.
	*
	* @param productCheck the product check of this customs declaration
	*/
	@Override
	public void setProductCheck(java.lang.String productCheck) {
		_customsDeclaration.setProductCheck(productCheck);
	}

	/**
	* Returns the release date of this customs declaration.
	*
	* @return the release date of this customs declaration
	*/
	@Override
	public java.util.Date getReleaseDate() {
		return _customsDeclaration.getReleaseDate();
	}

	/**
	* Sets the release date of this customs declaration.
	*
	* @param releaseDate the release date of this customs declaration
	*/
	@Override
	public void setReleaseDate(java.util.Date releaseDate) {
		_customsDeclaration.setReleaseDate(releaseDate);
	}

	/**
	* Returns the hosothutuc ID of this customs declaration.
	*
	* @return the hosothutuc ID of this customs declaration
	*/
	@Override
	public long getHosothutucId() {
		return _customsDeclaration.getHosothutucId();
	}

	/**
	* Sets the hosothutuc ID of this customs declaration.
	*
	* @param hosothutucId the hosothutuc ID of this customs declaration
	*/
	@Override
	public void setHosothutucId(long hosothutucId) {
		_customsDeclaration.setHosothutucId(hosothutucId);
	}

	@Override
	public boolean isNew() {
		return _customsDeclaration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customsDeclaration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customsDeclaration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customsDeclaration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customsDeclaration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customsDeclaration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customsDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customsDeclaration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customsDeclaration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customsDeclaration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customsDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomsDeclarationWrapper((CustomsDeclaration)_customsDeclaration.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration customsDeclaration) {
		return _customsDeclaration.compareTo(customsDeclaration);
	}

	@Override
	public int hashCode() {
		return _customsDeclaration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> toCacheModel() {
		return _customsDeclaration.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration toEscapedModel() {
		return new CustomsDeclarationWrapper(_customsDeclaration.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration toUnescapedModel() {
		return new CustomsDeclarationWrapper(_customsDeclaration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customsDeclaration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customsDeclaration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customsDeclaration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomsDeclarationWrapper)) {
			return false;
		}

		CustomsDeclarationWrapper customsDeclarationWrapper = (CustomsDeclarationWrapper)obj;

		if (Validator.equals(_customsDeclaration,
					customsDeclarationWrapper._customsDeclaration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CustomsDeclaration getWrappedCustomsDeclaration() {
		return _customsDeclaration;
	}

	@Override
	public CustomsDeclaration getWrappedModel() {
		return _customsDeclaration;
	}

	@Override
	public void resetOriginalValues() {
		_customsDeclaration.resetOriginalValues();
	}

	private CustomsDeclaration _customsDeclaration;
}