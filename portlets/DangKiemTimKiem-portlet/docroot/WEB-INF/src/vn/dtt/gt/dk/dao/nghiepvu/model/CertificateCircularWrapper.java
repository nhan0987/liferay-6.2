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
 * This class is a wrapper for {@link CertificateCircular}.
 * </p>
 *
 * @author win_64
 * @see CertificateCircular
 * @generated
 */
public class CertificateCircularWrapper implements CertificateCircular,
	ModelWrapper<CertificateCircular> {
	public CertificateCircularWrapper(CertificateCircular certificateCircular) {
		_certificateCircular = certificateCircular;
	}

	@Override
	public Class<?> getModelClass() {
		return CertificateCircular.class;
	}

	@Override
	public String getModelClassName() {
		return CertificateCircular.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("circularNo", getCircularNo());
		attributes.put("circularDate", getCircularDate());

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

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String circularNo = (String)attributes.get("circularNo");

		if (circularNo != null) {
			setCircularNo(circularNo);
		}

		Date circularDate = (Date)attributes.get("circularDate");

		if (circularDate != null) {
			setCircularDate(circularDate);
		}
	}

	/**
	* Returns the primary key of this certificate circular.
	*
	* @return the primary key of this certificate circular
	*/
	@Override
	public long getPrimaryKey() {
		return _certificateCircular.getPrimaryKey();
	}

	/**
	* Sets the primary key of this certificate circular.
	*
	* @param primaryKey the primary key of this certificate circular
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_certificateCircular.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this certificate circular.
	*
	* @return the ID of this certificate circular
	*/
	@Override
	public long getId() {
		return _certificateCircular.getId();
	}

	/**
	* Sets the ID of this certificate circular.
	*
	* @param id the ID of this certificate circular
	*/
	@Override
	public void setId(long id) {
		_certificateCircular.setId(id);
	}

	/**
	* Returns the certificate record ID of this certificate circular.
	*
	* @return the certificate record ID of this certificate circular
	*/
	@Override
	public long getCertificateRecordId() {
		return _certificateCircular.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this certificate circular.
	*
	* @param certificateRecordId the certificate record ID of this certificate circular
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateCircular.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the sequence no of this certificate circular.
	*
	* @return the sequence no of this certificate circular
	*/
	@Override
	public long getSequenceNo() {
		return _certificateCircular.getSequenceNo();
	}

	/**
	* Sets the sequence no of this certificate circular.
	*
	* @param sequenceNo the sequence no of this certificate circular
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_certificateCircular.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the circular no of this certificate circular.
	*
	* @return the circular no of this certificate circular
	*/
	@Override
	public java.lang.String getCircularNo() {
		return _certificateCircular.getCircularNo();
	}

	/**
	* Sets the circular no of this certificate circular.
	*
	* @param circularNo the circular no of this certificate circular
	*/
	@Override
	public void setCircularNo(java.lang.String circularNo) {
		_certificateCircular.setCircularNo(circularNo);
	}

	/**
	* Returns the circular date of this certificate circular.
	*
	* @return the circular date of this certificate circular
	*/
	@Override
	public java.util.Date getCircularDate() {
		return _certificateCircular.getCircularDate();
	}

	/**
	* Sets the circular date of this certificate circular.
	*
	* @param circularDate the circular date of this certificate circular
	*/
	@Override
	public void setCircularDate(java.util.Date circularDate) {
		_certificateCircular.setCircularDate(circularDate);
	}

	@Override
	public boolean isNew() {
		return _certificateCircular.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_certificateCircular.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _certificateCircular.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_certificateCircular.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _certificateCircular.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _certificateCircular.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_certificateCircular.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _certificateCircular.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_certificateCircular.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_certificateCircular.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_certificateCircular.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CertificateCircularWrapper((CertificateCircular)_certificateCircular.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular certificateCircular) {
		return _certificateCircular.compareTo(certificateCircular);
	}

	@Override
	public int hashCode() {
		return _certificateCircular.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular> toCacheModel() {
		return _certificateCircular.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular toEscapedModel() {
		return new CertificateCircularWrapper(_certificateCircular.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular toUnescapedModel() {
		return new CertificateCircularWrapper(_certificateCircular.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _certificateCircular.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _certificateCircular.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_certificateCircular.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CertificateCircularWrapper)) {
			return false;
		}

		CertificateCircularWrapper certificateCircularWrapper = (CertificateCircularWrapper)obj;

		if (Validator.equals(_certificateCircular,
					certificateCircularWrapper._certificateCircular)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CertificateCircular getWrappedCertificateCircular() {
		return _certificateCircular;
	}

	@Override
	public CertificateCircular getWrappedModel() {
		return _certificateCircular;
	}

	@Override
	public void resetOriginalValues() {
		_certificateCircular.resetOriginalValues();
	}

	private CertificateCircular _certificateCircular;
}