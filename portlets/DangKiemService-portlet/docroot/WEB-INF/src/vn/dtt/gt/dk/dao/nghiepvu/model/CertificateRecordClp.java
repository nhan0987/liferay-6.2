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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class CertificateRecordClp extends BaseModelImpl<CertificateRecord>
	implements CertificateRecord {
	public CertificateRecordClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_certificateRecordRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateType() {
		return _certificateType;
	}

	@Override
	public void setCertificateType(long certificateType) {
		_certificateType = certificateType;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateType", long.class);

				method.invoke(_certificateRecordRemoteModel, certificateType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateNumber() {
		return _certificateNumber;
	}

	@Override
	public void setCertificateNumber(String certificateNumber) {
		_certificateNumber = certificateNumber;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNumber",
						String.class);

				method.invoke(_certificateRecordRemoteModel, certificateNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_certificateRecordRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_certificateRecordRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEditorName() {
		return _editorName;
	}

	@Override
	public void setEditorName(String editorName) {
		_editorName = editorName;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setEditorName", String.class);

				method.invoke(_certificateRecordRemoteModel, editorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionReportId() {
		return _inspectionReportId;
	}

	@Override
	public void setInspectionReportId(long inspectionReportId) {
		_inspectionReportId = inspectionReportId;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionReportId",
						long.class);

				method.invoke(_certificateRecordRemoteModel, inspectionReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_safetyTestReportId = safetyTestReportId;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSafetyTestReportId",
						long.class);

				method.invoke(_certificateRecordRemoteModel, safetyTestReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_emissionTestReportId = emissionTestReportId;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissionTestReportId",
						long.class);

				method.invoke(_certificateRecordRemoteModel,
					emissionTestReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCopReportId() {
		return _copReportId;
	}

	@Override
	public void setCopReportId(long copReportId) {
		_copReportId = copReportId;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setCopReportId", long.class);

				method.invoke(_certificateRecordRemoteModel, copReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_certificateRecordRemoteModel, dossierId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOldCertificateNumber() {
		return _oldCertificateNumber;
	}

	@Override
	public void setOldCertificateNumber(String oldCertificateNumber) {
		_oldCertificateNumber = oldCertificateNumber;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setOldCertificateNumber",
						String.class);

				method.invoke(_certificateRecordRemoteModel,
					oldCertificateNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReason() {
		return _reason;
	}

	@Override
	public void setReason(String reason) {
		_reason = reason;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setReason", String.class);

				method.invoke(_certificateRecordRemoteModel, reason);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_certificateRecordRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization() {
		return _organization;
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization", String.class);

				method.invoke(_certificateRecordRemoteModel, organization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDivision() {
		return _division;
	}

	@Override
	public void setDivision(String division) {
		_division = division;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setDivision", String.class);

				method.invoke(_certificateRecordRemoteModel, division);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignName() {
		return _signName;
	}

	@Override
	public void setSignName(String signName) {
		_signName = signName;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_certificateRecordRemoteModel, signName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignTitle() {
		return _signTitle;
	}

	@Override
	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_certificateRecordRemoteModel, signTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignPlace() {
		return _signPlace;
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_certificateRecordRemoteModel, signPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_certificateRecordRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDigitalIssued() {
		return _digitalIssued;
	}

	@Override
	public void setDigitalIssued(long digitalIssued) {
		_digitalIssued = digitalIssued;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setDigitalIssued", long.class);

				method.invoke(_certificateRecordRemoteModel, digitalIssued);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStampStatus() {
		return _stampStatus;
	}

	@Override
	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setStampStatus", long.class);

				method.invoke(_certificateRecordRemoteModel, stampStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCommentInWrongCase() {
		return _commentInWrongCase;
	}

	@Override
	public void setCommentInWrongCase(long commentInWrongCase) {
		_commentInWrongCase = commentInWrongCase;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentInWrongCase",
						long.class);

				method.invoke(_certificateRecordRemoteModel, commentInWrongCase);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_certificateRecordRemoteModel != null) {
			try {
				Class<?> clazz = _certificateRecordRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_certificateRecordRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCertificateRecordRemoteModel() {
		return _certificateRecordRemoteModel;
	}

	public void setCertificateRecordRemoteModel(
		BaseModel<?> certificateRecordRemoteModel) {
		_certificateRecordRemoteModel = certificateRecordRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _certificateRecordRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_certificateRecordRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CertificateRecordLocalServiceUtil.addCertificateRecord(this);
		}
		else {
			CertificateRecordLocalServiceUtil.updateCertificateRecord(this);
		}
	}

	@Override
	public CertificateRecord toEscapedModel() {
		return (CertificateRecord)ProxyUtil.newProxyInstance(CertificateRecord.class.getClassLoader(),
			new Class[] { CertificateRecord.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CertificateRecordClp clone = new CertificateRecordClp();

		clone.setId(getId());
		clone.setCertificateType(getCertificateType());
		clone.setCertificateNumber(getCertificateNumber());
		clone.setAttachedFile(getAttachedFile());
		clone.setCreatedDate(getCreatedDate());
		clone.setEditorName(getEditorName());
		clone.setInspectionReportId(getInspectionReportId());
		clone.setSafetyTestReportId(getSafetyTestReportId());
		clone.setEmissionTestReportId(getEmissionTestReportId());
		clone.setCopReportId(getCopReportId());
		clone.setDossierId(getDossierId());
		clone.setOldCertificateNumber(getOldCertificateNumber());
		clone.setReason(getReason());
		clone.setRemarks(getRemarks());
		clone.setOrganization(getOrganization());
		clone.setDivision(getDivision());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setDigitalIssued(getDigitalIssued());
		clone.setStampStatus(getStampStatus());
		clone.setCommentInWrongCase(getCommentInWrongCase());
		clone.setSynchdate(getSynchdate());

		return clone;
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

		if (!(obj instanceof CertificateRecordClp)) {
			return false;
		}

		CertificateRecordClp certificateRecord = (CertificateRecordClp)obj;

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
	private BaseModel<?> _certificateRecordRemoteModel;
}