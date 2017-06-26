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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CertificateRecord service. Represents a row in the &quot;vr_certificaterecord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CertificateRecordImpl}.
 * </p>
 *
 * @author huymq
 * @see CertificateRecordImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordModel
 * @generated
 */
@JSON(strict = true)
public class CertificateRecordModelImpl extends BaseModelImpl<CertificateRecord>
	implements CertificateRecordModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a certificate record model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord} interface instead.
	 */
	public static final String TABLE_NAME = "vr_certificaterecord";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "certificatetype", Types.BIGINT },
			{ "certificatenumber", Types.VARCHAR },
			{ "attachedfile", Types.BIGINT },
			{ "createddate", Types.TIMESTAMP },
			{ "editorname", Types.VARCHAR },
			{ "inspectionreportid", Types.BIGINT },
			{ "safetytestreportid", Types.BIGINT },
			{ "emissiontestreportid", Types.BIGINT },
			{ "copreportid", Types.BIGINT },
			{ "dossierid", Types.BIGINT },
			{ "oldcertificatenumber", Types.VARCHAR },
			{ "reason", Types.VARCHAR },
			{ "remarks", Types.VARCHAR },
			{ "organization", Types.VARCHAR },
			{ "division", Types.VARCHAR },
			{ "signname", Types.VARCHAR },
			{ "signtitle", Types.VARCHAR },
			{ "signplace", Types.VARCHAR },
			{ "signdate", Types.TIMESTAMP },
			{ "digitalissued", Types.BIGINT },
			{ "stampstatus", Types.BIGINT },
			{ "commentinwrongcase", Types.BIGINT },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_certificaterecord (id LONG not null primary key,certificatetype LONG,certificatenumber VARCHAR(75) null,attachedfile LONG,createddate DATE null,editorname VARCHAR(75) null,inspectionreportid LONG,safetytestreportid LONG,emissiontestreportid LONG,copreportid LONG,dossierid LONG,oldcertificatenumber VARCHAR(75) null,reason VARCHAR(75) null,remarks VARCHAR(75) null,organization VARCHAR(75) null,division VARCHAR(75) null,signname VARCHAR(75) null,signtitle VARCHAR(75) null,signplace VARCHAR(75) null,signdate DATE null,digitalissued LONG,stampstatus LONG,commentinwrongcase LONG,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_certificaterecord";
	public static final String ORDER_BY_JPQL = " ORDER BY certificateRecord.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_certificaterecord.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"),
			true);
	public static long ATTACHEDFILE_COLUMN_BITMASK = 1L;
	public static long CERTIFICATENUMBER_COLUMN_BITMASK = 2L;
	public static long COPREPORTID_COLUMN_BITMASK = 4L;
	public static long DOSSIERID_COLUMN_BITMASK = 8L;
	public static long EMISSIONTESTREPORTID_COLUMN_BITMASK = 16L;
	public static long INSPECTIONREPORTID_COLUMN_BITMASK = 32L;
	public static long SAFETYTESTREPORTID_COLUMN_BITMASK = 64L;
	public static long ID_COLUMN_BITMASK = 128L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CertificateRecord toModel(CertificateRecordSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CertificateRecord model = new CertificateRecordImpl();

		model.setId(soapModel.getId());
		model.setCertificateType(soapModel.getCertificateType());
		model.setCertificateNumber(soapModel.getCertificateNumber());
		model.setAttachedFile(soapModel.getAttachedFile());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setEditorName(soapModel.getEditorName());
		model.setInspectionReportId(soapModel.getInspectionReportId());
		model.setSafetyTestReportId(soapModel.getSafetyTestReportId());
		model.setEmissionTestReportId(soapModel.getEmissionTestReportId());
		model.setCopReportId(soapModel.getCopReportId());
		model.setDossierId(soapModel.getDossierId());
		model.setOldCertificateNumber(soapModel.getOldCertificateNumber());
		model.setReason(soapModel.getReason());
		model.setRemarks(soapModel.getRemarks());
		model.setOrganization(soapModel.getOrganization());
		model.setDivision(soapModel.getDivision());
		model.setSignName(soapModel.getSignName());
		model.setSignTitle(soapModel.getSignTitle());
		model.setSignPlace(soapModel.getSignPlace());
		model.setSignDate(soapModel.getSignDate());
		model.setDigitalIssued(soapModel.getDigitalIssued());
		model.setStampStatus(soapModel.getStampStatus());
		model.setCommentInWrongCase(soapModel.getCommentInWrongCase());
		model.setSynchdate(soapModel.getSynchdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CertificateRecord> toModels(
		CertificateRecordSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CertificateRecord> models = new ArrayList<CertificateRecord>(soapModels.length);

		for (CertificateRecordSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"));

	public CertificateRecordModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("synchdate", getSynchdate());

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

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public long getCertificateType() {
		return _certificateType;
	}

	@Override
	public void setCertificateType(long certificateType) {
		_certificateType = certificateType;
	}

	@JSON
	@Override
	public String getCertificateNumber() {
		if (_certificateNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _certificateNumber;
		}
	}

	@Override
	public void setCertificateNumber(String certificateNumber) {
		_columnBitmask |= CERTIFICATENUMBER_COLUMN_BITMASK;

		if (_originalCertificateNumber == null) {
			_originalCertificateNumber = _certificateNumber;
		}

		_certificateNumber = certificateNumber;
	}

	public String getOriginalCertificateNumber() {
		return GetterUtil.getString(_originalCertificateNumber);
	}

	@JSON
	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_columnBitmask |= ATTACHEDFILE_COLUMN_BITMASK;

		if (!_setOriginalAttachedFile) {
			_setOriginalAttachedFile = true;

			_originalAttachedFile = _attachedFile;
		}

		_attachedFile = attachedFile;
	}

	public long getOriginalAttachedFile() {
		return _originalAttachedFile;
	}

	@JSON
	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@JSON
	@Override
	public String getEditorName() {
		if (_editorName == null) {
			return StringPool.BLANK;
		}
		else {
			return _editorName;
		}
	}

	@Override
	public void setEditorName(String editorName) {
		_editorName = editorName;
	}

	@JSON
	@Override
	public long getInspectionReportId() {
		return _inspectionReportId;
	}

	@Override
	public void setInspectionReportId(long inspectionReportId) {
		_columnBitmask |= INSPECTIONREPORTID_COLUMN_BITMASK;

		if (!_setOriginalInspectionReportId) {
			_setOriginalInspectionReportId = true;

			_originalInspectionReportId = _inspectionReportId;
		}

		_inspectionReportId = inspectionReportId;
	}

	public long getOriginalInspectionReportId() {
		return _originalInspectionReportId;
	}

	@JSON
	@Override
	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_columnBitmask |= SAFETYTESTREPORTID_COLUMN_BITMASK;

		if (!_setOriginalSafetyTestReportId) {
			_setOriginalSafetyTestReportId = true;

			_originalSafetyTestReportId = _safetyTestReportId;
		}

		_safetyTestReportId = safetyTestReportId;
	}

	public long getOriginalSafetyTestReportId() {
		return _originalSafetyTestReportId;
	}

	@JSON
	@Override
	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_columnBitmask |= EMISSIONTESTREPORTID_COLUMN_BITMASK;

		if (!_setOriginalEmissionTestReportId) {
			_setOriginalEmissionTestReportId = true;

			_originalEmissionTestReportId = _emissionTestReportId;
		}

		_emissionTestReportId = emissionTestReportId;
	}

	public long getOriginalEmissionTestReportId() {
		return _originalEmissionTestReportId;
	}

	@JSON
	@Override
	public long getCopReportId() {
		return _copReportId;
	}

	@Override
	public void setCopReportId(long copReportId) {
		_columnBitmask |= COPREPORTID_COLUMN_BITMASK;

		if (!_setOriginalCopReportId) {
			_setOriginalCopReportId = true;

			_originalCopReportId = _copReportId;
		}

		_copReportId = copReportId;
	}

	public long getOriginalCopReportId() {
		return _originalCopReportId;
	}

	@JSON
	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_columnBitmask |= DOSSIERID_COLUMN_BITMASK;

		if (!_setOriginalDossierId) {
			_setOriginalDossierId = true;

			_originalDossierId = _dossierId;
		}

		_dossierId = dossierId;
	}

	public long getOriginalDossierId() {
		return _originalDossierId;
	}

	@JSON
	@Override
	public String getOldCertificateNumber() {
		if (_oldCertificateNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _oldCertificateNumber;
		}
	}

	@Override
	public void setOldCertificateNumber(String oldCertificateNumber) {
		_oldCertificateNumber = oldCertificateNumber;
	}

	@JSON
	@Override
	public String getReason() {
		if (_reason == null) {
			return StringPool.BLANK;
		}
		else {
			return _reason;
		}
	}

	@Override
	public void setReason(String reason) {
		_reason = reason;
	}

	@JSON
	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	@JSON
	@Override
	public String getOrganization() {
		if (_organization == null) {
			return StringPool.BLANK;
		}
		else {
			return _organization;
		}
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;
	}

	@JSON
	@Override
	public String getDivision() {
		if (_division == null) {
			return StringPool.BLANK;
		}
		else {
			return _division;
		}
	}

	@Override
	public void setDivision(String division) {
		_division = division;
	}

	@JSON
	@Override
	public String getSignName() {
		if (_signName == null) {
			return StringPool.BLANK;
		}
		else {
			return _signName;
		}
	}

	@Override
	public void setSignName(String signName) {
		_signName = signName;
	}

	@JSON
	@Override
	public String getSignTitle() {
		if (_signTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _signTitle;
		}
	}

	@Override
	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	@JSON
	@Override
	public String getSignPlace() {
		if (_signPlace == null) {
			return StringPool.BLANK;
		}
		else {
			return _signPlace;
		}
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	@JSON
	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	@JSON
	@Override
	public long getDigitalIssued() {
		return _digitalIssued;
	}

	@Override
	public void setDigitalIssued(long digitalIssued) {
		_digitalIssued = digitalIssued;
	}

	@JSON
	@Override
	public long getStampStatus() {
		return _stampStatus;
	}

	@Override
	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;
	}

	@JSON
	@Override
	public long getCommentInWrongCase() {
		return _commentInWrongCase;
	}

	@Override
	public void setCommentInWrongCase(long commentInWrongCase) {
		_commentInWrongCase = commentInWrongCase;
	}

	@JSON
	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CertificateRecord.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CertificateRecord toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CertificateRecord)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CertificateRecordImpl certificateRecordImpl = new CertificateRecordImpl();

		certificateRecordImpl.setId(getId());
		certificateRecordImpl.setCertificateType(getCertificateType());
		certificateRecordImpl.setCertificateNumber(getCertificateNumber());
		certificateRecordImpl.setAttachedFile(getAttachedFile());
		certificateRecordImpl.setCreatedDate(getCreatedDate());
		certificateRecordImpl.setEditorName(getEditorName());
		certificateRecordImpl.setInspectionReportId(getInspectionReportId());
		certificateRecordImpl.setSafetyTestReportId(getSafetyTestReportId());
		certificateRecordImpl.setEmissionTestReportId(getEmissionTestReportId());
		certificateRecordImpl.setCopReportId(getCopReportId());
		certificateRecordImpl.setDossierId(getDossierId());
		certificateRecordImpl.setOldCertificateNumber(getOldCertificateNumber());
		certificateRecordImpl.setReason(getReason());
		certificateRecordImpl.setRemarks(getRemarks());
		certificateRecordImpl.setOrganization(getOrganization());
		certificateRecordImpl.setDivision(getDivision());
		certificateRecordImpl.setSignName(getSignName());
		certificateRecordImpl.setSignTitle(getSignTitle());
		certificateRecordImpl.setSignPlace(getSignPlace());
		certificateRecordImpl.setSignDate(getSignDate());
		certificateRecordImpl.setDigitalIssued(getDigitalIssued());
		certificateRecordImpl.setStampStatus(getStampStatus());
		certificateRecordImpl.setCommentInWrongCase(getCommentInWrongCase());
		certificateRecordImpl.setSynchdate(getSynchdate());

		certificateRecordImpl.resetOriginalValues();

		return certificateRecordImpl;
	}

	@Override
	public int compareTo(CertificateRecord certificateRecord) {
		int value = 0;

		if (getId() < certificateRecord.getId()) {
			value = -1;
		}
		else if (getId() > certificateRecord.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CertificateRecord)) {
			return false;
		}

		CertificateRecord certificateRecord = (CertificateRecord)obj;

		long primaryKey = certificateRecord.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		CertificateRecordModelImpl certificateRecordModelImpl = this;

		certificateRecordModelImpl._originalCertificateNumber = certificateRecordModelImpl._certificateNumber;

		certificateRecordModelImpl._originalAttachedFile = certificateRecordModelImpl._attachedFile;

		certificateRecordModelImpl._setOriginalAttachedFile = false;

		certificateRecordModelImpl._originalInspectionReportId = certificateRecordModelImpl._inspectionReportId;

		certificateRecordModelImpl._setOriginalInspectionReportId = false;

		certificateRecordModelImpl._originalSafetyTestReportId = certificateRecordModelImpl._safetyTestReportId;

		certificateRecordModelImpl._setOriginalSafetyTestReportId = false;

		certificateRecordModelImpl._originalEmissionTestReportId = certificateRecordModelImpl._emissionTestReportId;

		certificateRecordModelImpl._setOriginalEmissionTestReportId = false;

		certificateRecordModelImpl._originalCopReportId = certificateRecordModelImpl._copReportId;

		certificateRecordModelImpl._setOriginalCopReportId = false;

		certificateRecordModelImpl._originalDossierId = certificateRecordModelImpl._dossierId;

		certificateRecordModelImpl._setOriginalDossierId = false;

		certificateRecordModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CertificateRecord> toCacheModel() {
		CertificateRecordCacheModel certificateRecordCacheModel = new CertificateRecordCacheModel();

		certificateRecordCacheModel.id = getId();

		certificateRecordCacheModel.certificateType = getCertificateType();

		certificateRecordCacheModel.certificateNumber = getCertificateNumber();

		String certificateNumber = certificateRecordCacheModel.certificateNumber;

		if ((certificateNumber != null) && (certificateNumber.length() == 0)) {
			certificateRecordCacheModel.certificateNumber = null;
		}

		certificateRecordCacheModel.attachedFile = getAttachedFile();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			certificateRecordCacheModel.createdDate = createdDate.getTime();
		}
		else {
			certificateRecordCacheModel.createdDate = Long.MIN_VALUE;
		}

		certificateRecordCacheModel.editorName = getEditorName();

		String editorName = certificateRecordCacheModel.editorName;

		if ((editorName != null) && (editorName.length() == 0)) {
			certificateRecordCacheModel.editorName = null;
		}

		certificateRecordCacheModel.inspectionReportId = getInspectionReportId();

		certificateRecordCacheModel.safetyTestReportId = getSafetyTestReportId();

		certificateRecordCacheModel.emissionTestReportId = getEmissionTestReportId();

		certificateRecordCacheModel.copReportId = getCopReportId();

		certificateRecordCacheModel.dossierId = getDossierId();

		certificateRecordCacheModel.oldCertificateNumber = getOldCertificateNumber();

		String oldCertificateNumber = certificateRecordCacheModel.oldCertificateNumber;

		if ((oldCertificateNumber != null) &&
				(oldCertificateNumber.length() == 0)) {
			certificateRecordCacheModel.oldCertificateNumber = null;
		}

		certificateRecordCacheModel.reason = getReason();

		String reason = certificateRecordCacheModel.reason;

		if ((reason != null) && (reason.length() == 0)) {
			certificateRecordCacheModel.reason = null;
		}

		certificateRecordCacheModel.remarks = getRemarks();

		String remarks = certificateRecordCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			certificateRecordCacheModel.remarks = null;
		}

		certificateRecordCacheModel.organization = getOrganization();

		String organization = certificateRecordCacheModel.organization;

		if ((organization != null) && (organization.length() == 0)) {
			certificateRecordCacheModel.organization = null;
		}

		certificateRecordCacheModel.division = getDivision();

		String division = certificateRecordCacheModel.division;

		if ((division != null) && (division.length() == 0)) {
			certificateRecordCacheModel.division = null;
		}

		certificateRecordCacheModel.signName = getSignName();

		String signName = certificateRecordCacheModel.signName;

		if ((signName != null) && (signName.length() == 0)) {
			certificateRecordCacheModel.signName = null;
		}

		certificateRecordCacheModel.signTitle = getSignTitle();

		String signTitle = certificateRecordCacheModel.signTitle;

		if ((signTitle != null) && (signTitle.length() == 0)) {
			certificateRecordCacheModel.signTitle = null;
		}

		certificateRecordCacheModel.signPlace = getSignPlace();

		String signPlace = certificateRecordCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			certificateRecordCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			certificateRecordCacheModel.signDate = signDate.getTime();
		}
		else {
			certificateRecordCacheModel.signDate = Long.MIN_VALUE;
		}

		certificateRecordCacheModel.digitalIssued = getDigitalIssued();

		certificateRecordCacheModel.stampStatus = getStampStatus();

		certificateRecordCacheModel.commentInWrongCase = getCommentInWrongCase();

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			certificateRecordCacheModel.synchdate = synchdate.getTime();
		}
		else {
			certificateRecordCacheModel.synchdate = Long.MIN_VALUE;
		}

		return certificateRecordCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", certificateType=");
		sb.append(getCertificateType());
		sb.append(", certificateNumber=");
		sb.append(getCertificateNumber());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", editorName=");
		sb.append(getEditorName());
		sb.append(", inspectionReportId=");
		sb.append(getInspectionReportId());
		sb.append(", safetyTestReportId=");
		sb.append(getSafetyTestReportId());
		sb.append(", emissionTestReportId=");
		sb.append(getEmissionTestReportId());
		sb.append(", copReportId=");
		sb.append(getCopReportId());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", oldCertificateNumber=");
		sb.append(getOldCertificateNumber());
		sb.append(", reason=");
		sb.append(getReason());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", digitalIssued=");
		sb.append(getDigitalIssued());
		sb.append(", stampStatus=");
		sb.append(getStampStatus());
		sb.append(", commentInWrongCase=");
		sb.append(getCommentInWrongCase());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateType</column-name><column-value><![CDATA[");
		sb.append(getCertificateType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNumber</column-name><column-value><![CDATA[");
		sb.append(getCertificateNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>editorName</column-name><column-value><![CDATA[");
		sb.append(getEditorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionReportId</column-name><column-value><![CDATA[");
		sb.append(getInspectionReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetyTestReportId</column-name><column-value><![CDATA[");
		sb.append(getSafetyTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionTestReportId</column-name><column-value><![CDATA[");
		sb.append(getEmissionTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copReportId</column-name><column-value><![CDATA[");
		sb.append(getCopReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldCertificateNumber</column-name><column-value><![CDATA[");
		sb.append(getOldCertificateNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reason</column-name><column-value><![CDATA[");
		sb.append(getReason());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signName</column-name><column-value><![CDATA[");
		sb.append(getSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signTitle</column-name><column-value><![CDATA[");
		sb.append(getSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>digitalIssued</column-name><column-value><![CDATA[");
		sb.append(getDigitalIssued());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stampStatus</column-name><column-value><![CDATA[");
		sb.append(getStampStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentInWrongCase</column-name><column-value><![CDATA[");
		sb.append(getCommentInWrongCase());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CertificateRecord.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CertificateRecord.class
		};
	private long _id;
	private long _certificateType;
	private String _certificateNumber;
	private String _originalCertificateNumber;
	private long _attachedFile;
	private long _originalAttachedFile;
	private boolean _setOriginalAttachedFile;
	private Date _createdDate;
	private String _editorName;
	private long _inspectionReportId;
	private long _originalInspectionReportId;
	private boolean _setOriginalInspectionReportId;
	private long _safetyTestReportId;
	private long _originalSafetyTestReportId;
	private boolean _setOriginalSafetyTestReportId;
	private long _emissionTestReportId;
	private long _originalEmissionTestReportId;
	private boolean _setOriginalEmissionTestReportId;
	private long _copReportId;
	private long _originalCopReportId;
	private boolean _setOriginalCopReportId;
	private long _dossierId;
	private long _originalDossierId;
	private boolean _setOriginalDossierId;
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
	private long _columnBitmask;
	private CertificateRecord _escapedModel;
}