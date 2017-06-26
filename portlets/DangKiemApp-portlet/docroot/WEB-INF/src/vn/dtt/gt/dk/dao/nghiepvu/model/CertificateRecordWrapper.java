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
 * This class is a wrapper for {@link CertificateRecord}.
 * </p>
 *
 * @author win_64
 * @see CertificateRecord
 * @generated
 */
public class CertificateRecordWrapper implements CertificateRecord,
	ModelWrapper<CertificateRecord> {
	public CertificateRecordWrapper(CertificateRecord certificateRecord) {
		_certificateRecord = certificateRecord;
	}

	@Override
	public Class<?> getModelClass() {
		return CertificateRecord.class;
	}

	@Override
	public String getModelClassName() {
		return CertificateRecord.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("certificateType", getCertificateType());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("editorName", getEditorName());
		attributes.put("inspectionReportId", getInspectionReportId());
		attributes.put("safetyTestReportId", getSafetyTestReportId());
		attributes.put("emissionTestReportId", getEmissionTestReportId());
		attributes.put("copReportId", getCopReportId());
		attributes.put("dossierId", getDossierId());
		attributes.put("oldCertificateNumber", getOldCertificateNumber());
		attributes.put("reason", getReason());
		attributes.put("remarks", getRemarks());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("digitalIssued", getDigitalIssued());
		attributes.put("stampStatus", getStampStatus());
		attributes.put("commentInWrongCase", getCommentInWrongCase());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long certificateType = (Long)attributes.get("certificateType");

		if (certificateType != null) {
			setCertificateType(certificateType);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String editorName = (String)attributes.get("editorName");

		if (editorName != null) {
			setEditorName(editorName);
		}

		Long inspectionReportId = (Long)attributes.get("inspectionReportId");

		if (inspectionReportId != null) {
			setInspectionReportId(inspectionReportId);
		}

		Long safetyTestReportId = (Long)attributes.get("safetyTestReportId");

		if (safetyTestReportId != null) {
			setSafetyTestReportId(safetyTestReportId);
		}

		Long emissionTestReportId = (Long)attributes.get("emissionTestReportId");

		if (emissionTestReportId != null) {
			setEmissionTestReportId(emissionTestReportId);
		}

		Long copReportId = (Long)attributes.get("copReportId");

		if (copReportId != null) {
			setCopReportId(copReportId);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String oldCertificateNumber = (String)attributes.get(
				"oldCertificateNumber");

		if (oldCertificateNumber != null) {
			setOldCertificateNumber(oldCertificateNumber);
		}

		String reason = (String)attributes.get("reason");

		if (reason != null) {
			setReason(reason);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long digitalIssued = (Long)attributes.get("digitalIssued");

		if (digitalIssued != null) {
			setDigitalIssued(digitalIssued);
		}

		Long stampStatus = (Long)attributes.get("stampStatus");

		if (stampStatus != null) {
			setStampStatus(stampStatus);
		}

		Long commentInWrongCase = (Long)attributes.get("commentInWrongCase");

		if (commentInWrongCase != null) {
			setCommentInWrongCase(commentInWrongCase);
		}
	}

	/**
	* Returns the primary key of this certificate record.
	*
	* @return the primary key of this certificate record
	*/
	@Override
	public long getPrimaryKey() {
		return _certificateRecord.getPrimaryKey();
	}

	/**
	* Sets the primary key of this certificate record.
	*
	* @param primaryKey the primary key of this certificate record
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_certificateRecord.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this certificate record.
	*
	* @return the ID of this certificate record
	*/
	@Override
	public long getId() {
		return _certificateRecord.getId();
	}

	/**
	* Sets the ID of this certificate record.
	*
	* @param id the ID of this certificate record
	*/
	@Override
	public void setId(long id) {
		_certificateRecord.setId(id);
	}

	/**
	* Returns the certificate type of this certificate record.
	*
	* @return the certificate type of this certificate record
	*/
	@Override
	public long getCertificateType() {
		return _certificateRecord.getCertificateType();
	}

	/**
	* Sets the certificate type of this certificate record.
	*
	* @param certificateType the certificate type of this certificate record
	*/
	@Override
	public void setCertificateType(long certificateType) {
		_certificateRecord.setCertificateType(certificateType);
	}

	/**
	* Returns the certificate number of this certificate record.
	*
	* @return the certificate number of this certificate record
	*/
	@Override
	public java.lang.String getCertificateNumber() {
		return _certificateRecord.getCertificateNumber();
	}

	/**
	* Sets the certificate number of this certificate record.
	*
	* @param certificateNumber the certificate number of this certificate record
	*/
	@Override
	public void setCertificateNumber(java.lang.String certificateNumber) {
		_certificateRecord.setCertificateNumber(certificateNumber);
	}

	/**
	* Returns the attached file of this certificate record.
	*
	* @return the attached file of this certificate record
	*/
	@Override
	public long getAttachedFile() {
		return _certificateRecord.getAttachedFile();
	}

	/**
	* Sets the attached file of this certificate record.
	*
	* @param attachedFile the attached file of this certificate record
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_certificateRecord.setAttachedFile(attachedFile);
	}

	/**
	* Returns the created date of this certificate record.
	*
	* @return the created date of this certificate record
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _certificateRecord.getCreatedDate();
	}

	/**
	* Sets the created date of this certificate record.
	*
	* @param createdDate the created date of this certificate record
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_certificateRecord.setCreatedDate(createdDate);
	}

	/**
	* Returns the editor name of this certificate record.
	*
	* @return the editor name of this certificate record
	*/
	@Override
	public java.lang.String getEditorName() {
		return _certificateRecord.getEditorName();
	}

	/**
	* Sets the editor name of this certificate record.
	*
	* @param editorName the editor name of this certificate record
	*/
	@Override
	public void setEditorName(java.lang.String editorName) {
		_certificateRecord.setEditorName(editorName);
	}

	/**
	* Returns the inspection report ID of this certificate record.
	*
	* @return the inspection report ID of this certificate record
	*/
	@Override
	public long getInspectionReportId() {
		return _certificateRecord.getInspectionReportId();
	}

	/**
	* Sets the inspection report ID of this certificate record.
	*
	* @param inspectionReportId the inspection report ID of this certificate record
	*/
	@Override
	public void setInspectionReportId(long inspectionReportId) {
		_certificateRecord.setInspectionReportId(inspectionReportId);
	}

	/**
	* Returns the safety test report ID of this certificate record.
	*
	* @return the safety test report ID of this certificate record
	*/
	@Override
	public long getSafetyTestReportId() {
		return _certificateRecord.getSafetyTestReportId();
	}

	/**
	* Sets the safety test report ID of this certificate record.
	*
	* @param safetyTestReportId the safety test report ID of this certificate record
	*/
	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_certificateRecord.setSafetyTestReportId(safetyTestReportId);
	}

	/**
	* Returns the emission test report ID of this certificate record.
	*
	* @return the emission test report ID of this certificate record
	*/
	@Override
	public long getEmissionTestReportId() {
		return _certificateRecord.getEmissionTestReportId();
	}

	/**
	* Sets the emission test report ID of this certificate record.
	*
	* @param emissionTestReportId the emission test report ID of this certificate record
	*/
	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_certificateRecord.setEmissionTestReportId(emissionTestReportId);
	}

	/**
	* Returns the cop report ID of this certificate record.
	*
	* @return the cop report ID of this certificate record
	*/
	@Override
	public long getCopReportId() {
		return _certificateRecord.getCopReportId();
	}

	/**
	* Sets the cop report ID of this certificate record.
	*
	* @param copReportId the cop report ID of this certificate record
	*/
	@Override
	public void setCopReportId(long copReportId) {
		_certificateRecord.setCopReportId(copReportId);
	}

	/**
	* Returns the dossier ID of this certificate record.
	*
	* @return the dossier ID of this certificate record
	*/
	@Override
	public long getDossierId() {
		return _certificateRecord.getDossierId();
	}

	/**
	* Sets the dossier ID of this certificate record.
	*
	* @param dossierId the dossier ID of this certificate record
	*/
	@Override
	public void setDossierId(long dossierId) {
		_certificateRecord.setDossierId(dossierId);
	}

	/**
	* Returns the old certificate number of this certificate record.
	*
	* @return the old certificate number of this certificate record
	*/
	@Override
	public java.lang.String getOldCertificateNumber() {
		return _certificateRecord.getOldCertificateNumber();
	}

	/**
	* Sets the old certificate number of this certificate record.
	*
	* @param oldCertificateNumber the old certificate number of this certificate record
	*/
	@Override
	public void setOldCertificateNumber(java.lang.String oldCertificateNumber) {
		_certificateRecord.setOldCertificateNumber(oldCertificateNumber);
	}

	/**
	* Returns the reason of this certificate record.
	*
	* @return the reason of this certificate record
	*/
	@Override
	public java.lang.String getReason() {
		return _certificateRecord.getReason();
	}

	/**
	* Sets the reason of this certificate record.
	*
	* @param reason the reason of this certificate record
	*/
	@Override
	public void setReason(java.lang.String reason) {
		_certificateRecord.setReason(reason);
	}

	/**
	* Returns the remarks of this certificate record.
	*
	* @return the remarks of this certificate record
	*/
	@Override
	public java.lang.String getRemarks() {
		return _certificateRecord.getRemarks();
	}

	/**
	* Sets the remarks of this certificate record.
	*
	* @param remarks the remarks of this certificate record
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_certificateRecord.setRemarks(remarks);
	}

	/**
	* Returns the organization of this certificate record.
	*
	* @return the organization of this certificate record
	*/
	@Override
	public java.lang.String getOrganization() {
		return _certificateRecord.getOrganization();
	}

	/**
	* Sets the organization of this certificate record.
	*
	* @param organization the organization of this certificate record
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_certificateRecord.setOrganization(organization);
	}

	/**
	* Returns the division of this certificate record.
	*
	* @return the division of this certificate record
	*/
	@Override
	public java.lang.String getDivision() {
		return _certificateRecord.getDivision();
	}

	/**
	* Sets the division of this certificate record.
	*
	* @param division the division of this certificate record
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_certificateRecord.setDivision(division);
	}

	/**
	* Returns the sign name of this certificate record.
	*
	* @return the sign name of this certificate record
	*/
	@Override
	public java.lang.String getSignName() {
		return _certificateRecord.getSignName();
	}

	/**
	* Sets the sign name of this certificate record.
	*
	* @param signName the sign name of this certificate record
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_certificateRecord.setSignName(signName);
	}

	/**
	* Returns the sign title of this certificate record.
	*
	* @return the sign title of this certificate record
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _certificateRecord.getSignTitle();
	}

	/**
	* Sets the sign title of this certificate record.
	*
	* @param signTitle the sign title of this certificate record
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_certificateRecord.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this certificate record.
	*
	* @return the sign place of this certificate record
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _certificateRecord.getSignPlace();
	}

	/**
	* Sets the sign place of this certificate record.
	*
	* @param signPlace the sign place of this certificate record
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_certificateRecord.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this certificate record.
	*
	* @return the sign date of this certificate record
	*/
	@Override
	public java.util.Date getSignDate() {
		return _certificateRecord.getSignDate();
	}

	/**
	* Sets the sign date of this certificate record.
	*
	* @param signDate the sign date of this certificate record
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_certificateRecord.setSignDate(signDate);
	}

	/**
	* Returns the digital issued of this certificate record.
	*
	* @return the digital issued of this certificate record
	*/
	@Override
	public long getDigitalIssued() {
		return _certificateRecord.getDigitalIssued();
	}

	/**
	* Sets the digital issued of this certificate record.
	*
	* @param digitalIssued the digital issued of this certificate record
	*/
	@Override
	public void setDigitalIssued(long digitalIssued) {
		_certificateRecord.setDigitalIssued(digitalIssued);
	}

	/**
	* Returns the stamp status of this certificate record.
	*
	* @return the stamp status of this certificate record
	*/
	@Override
	public long getStampStatus() {
		return _certificateRecord.getStampStatus();
	}

	/**
	* Sets the stamp status of this certificate record.
	*
	* @param stampStatus the stamp status of this certificate record
	*/
	@Override
	public void setStampStatus(long stampStatus) {
		_certificateRecord.setStampStatus(stampStatus);
	}

	/**
	* Returns the comment in wrong case of this certificate record.
	*
	* @return the comment in wrong case of this certificate record
	*/
	@Override
	public long getCommentInWrongCase() {
		return _certificateRecord.getCommentInWrongCase();
	}

	/**
	* Sets the comment in wrong case of this certificate record.
	*
	* @param commentInWrongCase the comment in wrong case of this certificate record
	*/
	@Override
	public void setCommentInWrongCase(long commentInWrongCase) {
		_certificateRecord.setCommentInWrongCase(commentInWrongCase);
	}

	@Override
	public boolean isNew() {
		return _certificateRecord.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_certificateRecord.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _certificateRecord.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_certificateRecord.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _certificateRecord.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _certificateRecord.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_certificateRecord.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _certificateRecord.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_certificateRecord.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_certificateRecord.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_certificateRecord.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CertificateRecordWrapper((CertificateRecord)_certificateRecord.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord) {
		return _certificateRecord.compareTo(certificateRecord);
	}

	@Override
	public int hashCode() {
		return _certificateRecord.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> toCacheModel() {
		return _certificateRecord.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord toEscapedModel() {
		return new CertificateRecordWrapper(_certificateRecord.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord toUnescapedModel() {
		return new CertificateRecordWrapper(_certificateRecord.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _certificateRecord.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _certificateRecord.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_certificateRecord.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CertificateRecordWrapper)) {
			return false;
		}

		CertificateRecordWrapper certificateRecordWrapper = (CertificateRecordWrapper)obj;

		if (Validator.equals(_certificateRecord,
					certificateRecordWrapper._certificateRecord)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CertificateRecord getWrappedCertificateRecord() {
		return _certificateRecord;
	}

	@Override
	public CertificateRecord getWrappedModel() {
		return _certificateRecord;
	}

	@Override
	public void resetOriginalValues() {
		_certificateRecord.resetOriginalValues();
	}

	private CertificateRecord _certificateRecord;
}