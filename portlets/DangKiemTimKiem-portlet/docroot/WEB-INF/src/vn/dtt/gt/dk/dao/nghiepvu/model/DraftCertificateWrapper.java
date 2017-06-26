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
 * This class is a wrapper for {@link DraftCertificate}.
 * </p>
 *
 * @author win_64
 * @see DraftCertificate
 * @generated
 */
public class DraftCertificateWrapper implements DraftCertificate,
	ModelWrapper<DraftCertificate> {
	public DraftCertificateWrapper(DraftCertificate draftCertificate) {
		_draftCertificate = draftCertificate;
	}

	@Override
	public Class<?> getModelClass() {
		return DraftCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return DraftCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("certificateType", getCertificateType());
		attributes.put("inspectionReportId", getInspectionReportId());
		attributes.put("safetytestReportId", getSafetytestReportId());
		attributes.put("emissionTestReportId", getEmissionTestReportId());
		attributes.put("copReportId", getCopReportId());
		attributes.put("reason", getReason());
		attributes.put("remarks", getRemarks());
		attributes.put("createdDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long certificateType = (Long)attributes.get("certificateType");

		if (certificateType != null) {
			setCertificateType(certificateType);
		}

		Long inspectionReportId = (Long)attributes.get("inspectionReportId");

		if (inspectionReportId != null) {
			setInspectionReportId(inspectionReportId);
		}

		Long safetytestReportId = (Long)attributes.get("safetytestReportId");

		if (safetytestReportId != null) {
			setSafetytestReportId(safetytestReportId);
		}

		Long emissionTestReportId = (Long)attributes.get("emissionTestReportId");

		if (emissionTestReportId != null) {
			setEmissionTestReportId(emissionTestReportId);
		}

		Long copReportId = (Long)attributes.get("copReportId");

		if (copReportId != null) {
			setCopReportId(copReportId);
		}

		String reason = (String)attributes.get("reason");

		if (reason != null) {
			setReason(reason);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}
	}

	/**
	* Returns the primary key of this draft certificate.
	*
	* @return the primary key of this draft certificate
	*/
	@Override
	public long getPrimaryKey() {
		return _draftCertificate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this draft certificate.
	*
	* @param primaryKey the primary key of this draft certificate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_draftCertificate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this draft certificate.
	*
	* @return the ID of this draft certificate
	*/
	@Override
	public long getId() {
		return _draftCertificate.getId();
	}

	/**
	* Sets the ID of this draft certificate.
	*
	* @param id the ID of this draft certificate
	*/
	@Override
	public void setId(long id) {
		_draftCertificate.setId(id);
	}

	/**
	* Returns the attached file of this draft certificate.
	*
	* @return the attached file of this draft certificate
	*/
	@Override
	public long getAttachedFile() {
		return _draftCertificate.getAttachedFile();
	}

	/**
	* Sets the attached file of this draft certificate.
	*
	* @param attachedFile the attached file of this draft certificate
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_draftCertificate.setAttachedFile(attachedFile);
	}

	/**
	* Returns the certificate type of this draft certificate.
	*
	* @return the certificate type of this draft certificate
	*/
	@Override
	public long getCertificateType() {
		return _draftCertificate.getCertificateType();
	}

	/**
	* Sets the certificate type of this draft certificate.
	*
	* @param certificateType the certificate type of this draft certificate
	*/
	@Override
	public void setCertificateType(long certificateType) {
		_draftCertificate.setCertificateType(certificateType);
	}

	/**
	* Returns the inspection report ID of this draft certificate.
	*
	* @return the inspection report ID of this draft certificate
	*/
	@Override
	public long getInspectionReportId() {
		return _draftCertificate.getInspectionReportId();
	}

	/**
	* Sets the inspection report ID of this draft certificate.
	*
	* @param inspectionReportId the inspection report ID of this draft certificate
	*/
	@Override
	public void setInspectionReportId(long inspectionReportId) {
		_draftCertificate.setInspectionReportId(inspectionReportId);
	}

	/**
	* Returns the safetytest report ID of this draft certificate.
	*
	* @return the safetytest report ID of this draft certificate
	*/
	@Override
	public long getSafetytestReportId() {
		return _draftCertificate.getSafetytestReportId();
	}

	/**
	* Sets the safetytest report ID of this draft certificate.
	*
	* @param safetytestReportId the safetytest report ID of this draft certificate
	*/
	@Override
	public void setSafetytestReportId(long safetytestReportId) {
		_draftCertificate.setSafetytestReportId(safetytestReportId);
	}

	/**
	* Returns the emission test report ID of this draft certificate.
	*
	* @return the emission test report ID of this draft certificate
	*/
	@Override
	public long getEmissionTestReportId() {
		return _draftCertificate.getEmissionTestReportId();
	}

	/**
	* Sets the emission test report ID of this draft certificate.
	*
	* @param emissionTestReportId the emission test report ID of this draft certificate
	*/
	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_draftCertificate.setEmissionTestReportId(emissionTestReportId);
	}

	/**
	* Returns the cop report ID of this draft certificate.
	*
	* @return the cop report ID of this draft certificate
	*/
	@Override
	public long getCopReportId() {
		return _draftCertificate.getCopReportId();
	}

	/**
	* Sets the cop report ID of this draft certificate.
	*
	* @param copReportId the cop report ID of this draft certificate
	*/
	@Override
	public void setCopReportId(long copReportId) {
		_draftCertificate.setCopReportId(copReportId);
	}

	/**
	* Returns the reason of this draft certificate.
	*
	* @return the reason of this draft certificate
	*/
	@Override
	public java.lang.String getReason() {
		return _draftCertificate.getReason();
	}

	/**
	* Sets the reason of this draft certificate.
	*
	* @param reason the reason of this draft certificate
	*/
	@Override
	public void setReason(java.lang.String reason) {
		_draftCertificate.setReason(reason);
	}

	/**
	* Returns the remarks of this draft certificate.
	*
	* @return the remarks of this draft certificate
	*/
	@Override
	public java.lang.String getRemarks() {
		return _draftCertificate.getRemarks();
	}

	/**
	* Sets the remarks of this draft certificate.
	*
	* @param remarks the remarks of this draft certificate
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_draftCertificate.setRemarks(remarks);
	}

	/**
	* Returns the created date of this draft certificate.
	*
	* @return the created date of this draft certificate
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _draftCertificate.getCreatedDate();
	}

	/**
	* Sets the created date of this draft certificate.
	*
	* @param createdDate the created date of this draft certificate
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_draftCertificate.setCreatedDate(createdDate);
	}

	@Override
	public boolean isNew() {
		return _draftCertificate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_draftCertificate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _draftCertificate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_draftCertificate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _draftCertificate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _draftCertificate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_draftCertificate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _draftCertificate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_draftCertificate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_draftCertificate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_draftCertificate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DraftCertificateWrapper((DraftCertificate)_draftCertificate.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate) {
		return _draftCertificate.compareTo(draftCertificate);
	}

	@Override
	public int hashCode() {
		return _draftCertificate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> toCacheModel() {
		return _draftCertificate.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate toEscapedModel() {
		return new DraftCertificateWrapper(_draftCertificate.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate toUnescapedModel() {
		return new DraftCertificateWrapper(_draftCertificate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _draftCertificate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _draftCertificate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_draftCertificate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DraftCertificateWrapper)) {
			return false;
		}

		DraftCertificateWrapper draftCertificateWrapper = (DraftCertificateWrapper)obj;

		if (Validator.equals(_draftCertificate,
					draftCertificateWrapper._draftCertificate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DraftCertificate getWrappedDraftCertificate() {
		return _draftCertificate;
	}

	@Override
	public DraftCertificate getWrappedModel() {
		return _draftCertificate;
	}

	@Override
	public void resetOriginalValues() {
		_draftCertificate.resetOriginalValues();
	}

	private DraftCertificate _draftCertificate;
}