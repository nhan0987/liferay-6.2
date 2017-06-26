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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CertificateRecordServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CertificateRecordServiceSoap
 * @generated
 */
public class CertificateRecordSoap implements Serializable {
	public static CertificateRecordSoap toSoapModel(CertificateRecord model) {
		CertificateRecordSoap soapModel = new CertificateRecordSoap();

		soapModel.setId(model.getId());
		soapModel.setCertificateType(model.getCertificateType());
		soapModel.setCertificateNumber(model.getCertificateNumber());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setEditorName(model.getEditorName());
		soapModel.setInspectionReportId(model.getInspectionReportId());
		soapModel.setSafetyTestReportId(model.getSafetyTestReportId());
		soapModel.setEmissionTestReportId(model.getEmissionTestReportId());
		soapModel.setCopReportId(model.getCopReportId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setOldCertificateNumber(model.getOldCertificateNumber());
		soapModel.setReason(model.getReason());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setDivision(model.getDivision());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setDigitalIssued(model.getDigitalIssued());
		soapModel.setStampStatus(model.getStampStatus());
		soapModel.setCommentInWrongCase(model.getCommentInWrongCase());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static CertificateRecordSoap[] toSoapModels(
		CertificateRecord[] models) {
		CertificateRecordSoap[] soapModels = new CertificateRecordSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CertificateRecordSoap[][] toSoapModels(
		CertificateRecord[][] models) {
		CertificateRecordSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CertificateRecordSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CertificateRecordSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CertificateRecordSoap[] toSoapModels(
		List<CertificateRecord> models) {
		List<CertificateRecordSoap> soapModels = new ArrayList<CertificateRecordSoap>(models.size());

		for (CertificateRecord model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CertificateRecordSoap[soapModels.size()]);
	}

	public CertificateRecordSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCertificateType() {
		return _certificateType;
	}

	public void setCertificateType(long certificateType) {
		_certificateType = certificateType;
	}

	public String getCertificateNumber() {
		return _certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		_certificateNumber = certificateNumber;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getEditorName() {
		return _editorName;
	}

	public void setEditorName(String editorName) {
		_editorName = editorName;
	}

	public long getInspectionReportId() {
		return _inspectionReportId;
	}

	public void setInspectionReportId(long inspectionReportId) {
		_inspectionReportId = inspectionReportId;
	}

	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	public void setSafetyTestReportId(long safetyTestReportId) {
		_safetyTestReportId = safetyTestReportId;
	}

	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	public void setEmissionTestReportId(long emissionTestReportId) {
		_emissionTestReportId = emissionTestReportId;
	}

	public long getCopReportId() {
		return _copReportId;
	}

	public void setCopReportId(long copReportId) {
		_copReportId = copReportId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getOldCertificateNumber() {
		return _oldCertificateNumber;
	}

	public void setOldCertificateNumber(String oldCertificateNumber) {
		_oldCertificateNumber = oldCertificateNumber;
	}

	public String getReason() {
		return _reason;
	}

	public void setReason(String reason) {
		_reason = reason;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public String getSignName() {
		return _signName;
	}

	public void setSignName(String signName) {
		_signName = signName;
	}

	public String getSignTitle() {
		return _signTitle;
	}

	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public long getDigitalIssued() {
		return _digitalIssued;
	}

	public void setDigitalIssued(long digitalIssued) {
		_digitalIssued = digitalIssued;
	}

	public long getStampStatus() {
		return _stampStatus;
	}

	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;
	}

	public long getCommentInWrongCase() {
		return _commentInWrongCase;
	}

	public void setCommentInWrongCase(long commentInWrongCase) {
		_commentInWrongCase = commentInWrongCase;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private long _certificateType;
	private String _certificateNumber;
	private long _attachedFile;
	private Date _createdDate;
	private String _editorName;
	private long _inspectionReportId;
	private long _safetyTestReportId;
	private long _emissionTestReportId;
	private long _copReportId;
	private long _dossierId;
	private String _oldCertificateNumber;
	private String _reason;
	private String _remarks;
	private String _organization;
	private String _division;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _digitalIssued;
	private long _stampStatus;
	private long _commentInWrongCase;
	private Date _synchdate;
}