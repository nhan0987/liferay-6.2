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

import java.util.Date;

/**
 * The base model interface for the CertificateRecord service. Represents a row in the &quot;vr_certificaterecord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl}.
 * </p>
 *
 * @author win_64
 * @see CertificateRecord
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl
 * @generated
 */
public interface CertificateRecordModel extends BaseModel<CertificateRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a certificate record model instance should use the {@link CertificateRecord} interface instead.
	 */

	/**
	 * Returns the primary key of this certificate record.
	 *
	 * @return the primary key of this certificate record
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this certificate record.
	 *
	 * @param primaryKey the primary key of this certificate record
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this certificate record.
	 *
	 * @return the ID of this certificate record
	 */
	public long getId();

	/**
	 * Sets the ID of this certificate record.
	 *
	 * @param id the ID of this certificate record
	 */
	public void setId(long id);

	/**
	 * Returns the certificate type of this certificate record.
	 *
	 * @return the certificate type of this certificate record
	 */
	public long getCertificateType();

	/**
	 * Sets the certificate type of this certificate record.
	 *
	 * @param certificateType the certificate type of this certificate record
	 */
	public void setCertificateType(long certificateType);

	/**
	 * Returns the certificate number of this certificate record.
	 *
	 * @return the certificate number of this certificate record
	 */
	@AutoEscape
	public String getCertificateNumber();

	/**
	 * Sets the certificate number of this certificate record.
	 *
	 * @param certificateNumber the certificate number of this certificate record
	 */
	public void setCertificateNumber(String certificateNumber);

	/**
	 * Returns the attached file of this certificate record.
	 *
	 * @return the attached file of this certificate record
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this certificate record.
	 *
	 * @param attachedFile the attached file of this certificate record
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the created date of this certificate record.
	 *
	 * @return the created date of this certificate record
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this certificate record.
	 *
	 * @param createdDate the created date of this certificate record
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the editor name of this certificate record.
	 *
	 * @return the editor name of this certificate record
	 */
	@AutoEscape
	public String getEditorName();

	/**
	 * Sets the editor name of this certificate record.
	 *
	 * @param editorName the editor name of this certificate record
	 */
	public void setEditorName(String editorName);

	/**
	 * Returns the inspection report ID of this certificate record.
	 *
	 * @return the inspection report ID of this certificate record
	 */
	public long getInspectionReportId();

	/**
	 * Sets the inspection report ID of this certificate record.
	 *
	 * @param inspectionReportId the inspection report ID of this certificate record
	 */
	public void setInspectionReportId(long inspectionReportId);

	/**
	 * Returns the safety test report ID of this certificate record.
	 *
	 * @return the safety test report ID of this certificate record
	 */
	public long getSafetyTestReportId();

	/**
	 * Sets the safety test report ID of this certificate record.
	 *
	 * @param safetyTestReportId the safety test report ID of this certificate record
	 */
	public void setSafetyTestReportId(long safetyTestReportId);

	/**
	 * Returns the emission test report ID of this certificate record.
	 *
	 * @return the emission test report ID of this certificate record
	 */
	public long getEmissionTestReportId();

	/**
	 * Sets the emission test report ID of this certificate record.
	 *
	 * @param emissionTestReportId the emission test report ID of this certificate record
	 */
	public void setEmissionTestReportId(long emissionTestReportId);

	/**
	 * Returns the cop report ID of this certificate record.
	 *
	 * @return the cop report ID of this certificate record
	 */
	public long getCopReportId();

	/**
	 * Sets the cop report ID of this certificate record.
	 *
	 * @param copReportId the cop report ID of this certificate record
	 */
	public void setCopReportId(long copReportId);

	/**
	 * Returns the dossier ID of this certificate record.
	 *
	 * @return the dossier ID of this certificate record
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this certificate record.
	 *
	 * @param dossierId the dossier ID of this certificate record
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the reason of this certificate record.
	 *
	 * @return the reason of this certificate record
	 */
	@AutoEscape
	public String getReason();

	/**
	 * Sets the reason of this certificate record.
	 *
	 * @param reason the reason of this certificate record
	 */
	public void setReason(String reason);

	/**
	 * Returns the remarks of this certificate record.
	 *
	 * @return the remarks of this certificate record
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this certificate record.
	 *
	 * @param remarks the remarks of this certificate record
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the organization of this certificate record.
	 *
	 * @return the organization of this certificate record
	 */
	@AutoEscape
	public String getOrganization();

	/**
	 * Sets the organization of this certificate record.
	 *
	 * @param organization the organization of this certificate record
	 */
	public void setOrganization(String organization);

	/**
	 * Returns the division of this certificate record.
	 *
	 * @return the division of this certificate record
	 */
	@AutoEscape
	public String getDivision();

	/**
	 * Sets the division of this certificate record.
	 *
	 * @param division the division of this certificate record
	 */
	public void setDivision(String division);

	/**
	 * Returns the sign name of this certificate record.
	 *
	 * @return the sign name of this certificate record
	 */
	@AutoEscape
	public String getSignName();

	/**
	 * Sets the sign name of this certificate record.
	 *
	 * @param signName the sign name of this certificate record
	 */
	public void setSignName(String signName);

	/**
	 * Returns the sign title of this certificate record.
	 *
	 * @return the sign title of this certificate record
	 */
	@AutoEscape
	public String getSignTitle();

	/**
	 * Sets the sign title of this certificate record.
	 *
	 * @param signTitle the sign title of this certificate record
	 */
	public void setSignTitle(String signTitle);

	/**
	 * Returns the sign place of this certificate record.
	 *
	 * @return the sign place of this certificate record
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this certificate record.
	 *
	 * @param signPlace the sign place of this certificate record
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this certificate record.
	 *
	 * @return the sign date of this certificate record
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this certificate record.
	 *
	 * @param signDate the sign date of this certificate record
	 */
	public void setSignDate(Date signDate);

	/**
	 * Returns the digital issued of this certificate record.
	 *
	 * @return the digital issued of this certificate record
	 */
	public long getDigitalIssued();

	/**
	 * Sets the digital issued of this certificate record.
	 *
	 * @param digitalIssued the digital issued of this certificate record
	 */
	public void setDigitalIssued(long digitalIssued);

	/**
	 * Returns the stamp status of this certificate record.
	 *
	 * @return the stamp status of this certificate record
	 */
	public long getStampStatus();

	/**
	 * Sets the stamp status of this certificate record.
	 *
	 * @param stampStatus the stamp status of this certificate record
	 */
	public void setStampStatus(long stampStatus);

	/**
	 * Returns the comment in wrong case of this certificate record.
	 *
	 * @return the comment in wrong case of this certificate record
	 */
	public long getCommentInWrongCase();

	/**
	 * Sets the comment in wrong case of this certificate record.
	 *
	 * @param commentInWrongCase the comment in wrong case of this certificate record
	 */
	public void setCommentInWrongCase(long commentInWrongCase);

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
	public int compareTo(CertificateRecord certificateRecord);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CertificateRecord> toCacheModel();

	@Override
	public CertificateRecord toEscapedModel();

	@Override
	public CertificateRecord toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}