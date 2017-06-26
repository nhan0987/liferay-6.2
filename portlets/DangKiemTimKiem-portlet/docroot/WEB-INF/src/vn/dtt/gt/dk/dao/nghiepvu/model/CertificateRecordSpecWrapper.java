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
 * This class is a wrapper for {@link CertificateRecordSpec}.
 * </p>
 *
 * @author win_64
 * @see CertificateRecordSpec
 * @generated
 */
public class CertificateRecordSpecWrapper implements CertificateRecordSpec,
	ModelWrapper<CertificateRecordSpec> {
	public CertificateRecordSpecWrapper(
		CertificateRecordSpec certificateRecordSpec) {
		_certificateRecordSpec = certificateRecordSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return CertificateRecordSpec.class;
	}

	@Override
	public String getModelClassName() {
		return CertificateRecordSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("version", getVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
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

		Long version = (Long)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}
	}

	/**
	* Returns the primary key of this certificate record spec.
	*
	* @return the primary key of this certificate record spec
	*/
	@Override
	public long getPrimaryKey() {
		return _certificateRecordSpec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this certificate record spec.
	*
	* @param primaryKey the primary key of this certificate record spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_certificateRecordSpec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this certificate record spec.
	*
	* @return the ID of this certificate record spec
	*/
	@Override
	public long getId() {
		return _certificateRecordSpec.getId();
	}

	/**
	* Sets the ID of this certificate record spec.
	*
	* @param id the ID of this certificate record spec
	*/
	@Override
	public void setId(long id) {
		_certificateRecordSpec.setId(id);
	}

	/**
	* Returns the certificate record ID of this certificate record spec.
	*
	* @return the certificate record ID of this certificate record spec
	*/
	@Override
	public long getCertificateRecordId() {
		return _certificateRecordSpec.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this certificate record spec.
	*
	* @param certificateRecordId the certificate record ID of this certificate record spec
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordSpec.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the specification code of this certificate record spec.
	*
	* @return the specification code of this certificate record spec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _certificateRecordSpec.getSpecificationCode();
	}

	/**
	* Sets the specification code of this certificate record spec.
	*
	* @param specificationCode the specification code of this certificate record spec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_certificateRecordSpec.setSpecificationCode(specificationCode);
	}

	/**
	* Returns the specification name of this certificate record spec.
	*
	* @return the specification name of this certificate record spec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _certificateRecordSpec.getSpecificationName();
	}

	/**
	* Sets the specification name of this certificate record spec.
	*
	* @param specificationName the specification name of this certificate record spec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_certificateRecordSpec.setSpecificationName(specificationName);
	}

	/**
	* Returns the specification value of this certificate record spec.
	*
	* @return the specification value of this certificate record spec
	*/
	@Override
	public java.lang.String getSpecificationValue() {
		return _certificateRecordSpec.getSpecificationValue();
	}

	/**
	* Sets the specification value of this certificate record spec.
	*
	* @param specificationValue the specification value of this certificate record spec
	*/
	@Override
	public void setSpecificationValue(java.lang.String specificationValue) {
		_certificateRecordSpec.setSpecificationValue(specificationValue);
	}

	/**
	* Returns the version of this certificate record spec.
	*
	* @return the version of this certificate record spec
	*/
	@Override
	public long getVersion() {
		return _certificateRecordSpec.getVersion();
	}

	/**
	* Sets the version of this certificate record spec.
	*
	* @param version the version of this certificate record spec
	*/
	@Override
	public void setVersion(long version) {
		_certificateRecordSpec.setVersion(version);
	}

	@Override
	public boolean isNew() {
		return _certificateRecordSpec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_certificateRecordSpec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _certificateRecordSpec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_certificateRecordSpec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _certificateRecordSpec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _certificateRecordSpec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_certificateRecordSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _certificateRecordSpec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_certificateRecordSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_certificateRecordSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_certificateRecordSpec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CertificateRecordSpecWrapper((CertificateRecordSpec)_certificateRecordSpec.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec certificateRecordSpec) {
		return _certificateRecordSpec.compareTo(certificateRecordSpec);
	}

	@Override
	public int hashCode() {
		return _certificateRecordSpec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> toCacheModel() {
		return _certificateRecordSpec.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec toEscapedModel() {
		return new CertificateRecordSpecWrapper(_certificateRecordSpec.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec toUnescapedModel() {
		return new CertificateRecordSpecWrapper(_certificateRecordSpec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _certificateRecordSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _certificateRecordSpec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_certificateRecordSpec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CertificateRecordSpecWrapper)) {
			return false;
		}

		CertificateRecordSpecWrapper certificateRecordSpecWrapper = (CertificateRecordSpecWrapper)obj;

		if (Validator.equals(_certificateRecordSpec,
					certificateRecordSpecWrapper._certificateRecordSpec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CertificateRecordSpec getWrappedCertificateRecordSpec() {
		return _certificateRecordSpec;
	}

	@Override
	public CertificateRecordSpec getWrappedModel() {
		return _certificateRecordSpec;
	}

	@Override
	public void resetOriginalValues() {
		_certificateRecordSpec.resetOriginalValues();
	}

	private CertificateRecordSpec _certificateRecordSpec;
}