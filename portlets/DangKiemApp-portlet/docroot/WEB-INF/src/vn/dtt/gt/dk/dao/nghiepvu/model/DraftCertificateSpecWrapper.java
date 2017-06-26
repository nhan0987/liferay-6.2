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
 * This class is a wrapper for {@link DraftCertificateSpec}.
 * </p>
 *
 * @author win_64
 * @see DraftCertificateSpec
 * @generated
 */
public class DraftCertificateSpecWrapper implements DraftCertificateSpec,
	ModelWrapper<DraftCertificateSpec> {
	public DraftCertificateSpecWrapper(
		DraftCertificateSpec draftCertificateSpec) {
		_draftCertificateSpec = draftCertificateSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return DraftCertificateSpec.class;
	}

	@Override
	public String getModelClassName() {
		return DraftCertificateSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("draftCertificateId", getDraftCertificateId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long draftCertificateId = (Long)attributes.get("draftCertificateId");

		if (draftCertificateId != null) {
			setDraftCertificateId(draftCertificateId);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specificationValue = (String)attributes.get("specificationValue");

		if (specificationValue != null) {
			setSpecificationValue(specificationValue);
		}
	}

	/**
	* Returns the primary key of this draft certificate spec.
	*
	* @return the primary key of this draft certificate spec
	*/
	@Override
	public long getPrimaryKey() {
		return _draftCertificateSpec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this draft certificate spec.
	*
	* @param primaryKey the primary key of this draft certificate spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_draftCertificateSpec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this draft certificate spec.
	*
	* @return the ID of this draft certificate spec
	*/
	@Override
	public long getId() {
		return _draftCertificateSpec.getId();
	}

	/**
	* Sets the ID of this draft certificate spec.
	*
	* @param id the ID of this draft certificate spec
	*/
	@Override
	public void setId(long id) {
		_draftCertificateSpec.setId(id);
	}

	/**
	* Returns the draft certificate ID of this draft certificate spec.
	*
	* @return the draft certificate ID of this draft certificate spec
	*/
	@Override
	public long getDraftCertificateId() {
		return _draftCertificateSpec.getDraftCertificateId();
	}

	/**
	* Sets the draft certificate ID of this draft certificate spec.
	*
	* @param draftCertificateId the draft certificate ID of this draft certificate spec
	*/
	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_draftCertificateSpec.setDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns the specification code of this draft certificate spec.
	*
	* @return the specification code of this draft certificate spec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _draftCertificateSpec.getSpecificationCode();
	}

	/**
	* Sets the specification code of this draft certificate spec.
	*
	* @param specificationCode the specification code of this draft certificate spec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_draftCertificateSpec.setSpecificationCode(specificationCode);
	}

	/**
	* Returns the specification name of this draft certificate spec.
	*
	* @return the specification name of this draft certificate spec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _draftCertificateSpec.getSpecificationName();
	}

	/**
	* Sets the specification name of this draft certificate spec.
	*
	* @param specificationName the specification name of this draft certificate spec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_draftCertificateSpec.setSpecificationName(specificationName);
	}

	/**
	* Returns the specification value of this draft certificate spec.
	*
	* @return the specification value of this draft certificate spec
	*/
	@Override
	public java.lang.String getSpecificationValue() {
		return _draftCertificateSpec.getSpecificationValue();
	}

	/**
	* Sets the specification value of this draft certificate spec.
	*
	* @param specificationValue the specification value of this draft certificate spec
	*/
	@Override
	public void setSpecificationValue(java.lang.String specificationValue) {
		_draftCertificateSpec.setSpecificationValue(specificationValue);
	}

	@Override
	public boolean isNew() {
		return _draftCertificateSpec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_draftCertificateSpec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _draftCertificateSpec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_draftCertificateSpec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _draftCertificateSpec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _draftCertificateSpec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_draftCertificateSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _draftCertificateSpec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_draftCertificateSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_draftCertificateSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_draftCertificateSpec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DraftCertificateSpecWrapper((DraftCertificateSpec)_draftCertificateSpec.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec draftCertificateSpec) {
		return _draftCertificateSpec.compareTo(draftCertificateSpec);
	}

	@Override
	public int hashCode() {
		return _draftCertificateSpec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> toCacheModel() {
		return _draftCertificateSpec.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec toEscapedModel() {
		return new DraftCertificateSpecWrapper(_draftCertificateSpec.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec toUnescapedModel() {
		return new DraftCertificateSpecWrapper(_draftCertificateSpec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _draftCertificateSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _draftCertificateSpec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_draftCertificateSpec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DraftCertificateSpecWrapper)) {
			return false;
		}

		DraftCertificateSpecWrapper draftCertificateSpecWrapper = (DraftCertificateSpecWrapper)obj;

		if (Validator.equals(_draftCertificateSpec,
					draftCertificateSpecWrapper._draftCertificateSpec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DraftCertificateSpec getWrappedDraftCertificateSpec() {
		return _draftCertificateSpec;
	}

	@Override
	public DraftCertificateSpec getWrappedModel() {
		return _draftCertificateSpec;
	}

	@Override
	public void resetOriginalValues() {
		_draftCertificateSpec.resetOriginalValues();
	}

	private DraftCertificateSpec _draftCertificateSpec;
}