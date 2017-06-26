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
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
public class DraftCertificateSoap implements Serializable {
	public static DraftCertificateSoap toSoapModel(DraftCertificate model) {
		DraftCertificateSoap soapModel = new DraftCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setCertificateType(model.getCertificateType());
		soapModel.setInspectionReportId(model.getInspectionReportId());
		soapModel.setSafetytestReportId(model.getSafetytestReportId());
		soapModel.setEmissionTestReportId(model.getEmissionTestReportId());
		soapModel.setCopReportId(model.getCopReportId());
		soapModel.setReason(model.getReason());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCreatedDate(model.getCreatedDate());

		return soapModel;
	}

	public static DraftCertificateSoap[] toSoapModels(DraftCertificate[] models) {
		DraftCertificateSoap[] soapModels = new DraftCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DraftCertificateSoap[][] toSoapModels(
		DraftCertificate[][] models) {
		DraftCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DraftCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DraftCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DraftCertificateSoap[] toSoapModels(
		List<DraftCertificate> models) {
		List<DraftCertificateSoap> soapModels = new ArrayList<DraftCertificateSoap>(models.size());

		for (DraftCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DraftCertificateSoap[soapModels.size()]);
	}

	public DraftCertificateSoap() {
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

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public long getCertificateType() {
		return _certificateType;
	}

	public void setCertificateType(long certificateType) {
		_certificateType = certificateType;
	}

	public long getInspectionReportId() {
		return _inspectionReportId;
	}

	public void setInspectionReportId(long inspectionReportId) {
		_inspectionReportId = inspectionReportId;
	}

	public long getSafetytestReportId() {
		return _safetytestReportId;
	}

	public void setSafetytestReportId(long safetytestReportId) {
		_safetytestReportId = safetytestReportId;
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

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	private long _id;
	private long _attachedFile;
	private long _certificateType;
	private long _inspectionReportId;
	private long _safetytestReportId;
	private long _emissionTestReportId;
	private long _copReportId;
	private String _reason;
	private String _remarks;
	private Date _createdDate;
}