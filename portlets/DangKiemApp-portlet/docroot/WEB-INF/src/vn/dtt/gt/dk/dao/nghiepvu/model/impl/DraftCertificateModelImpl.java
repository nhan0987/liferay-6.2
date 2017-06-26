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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DraftCertificate service. Represents a row in the &quot;vr_draftcertificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DraftCertificateImpl}.
 * </p>
 *
 * @author win_64
 * @see DraftCertificateImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateModel
 * @generated
 */
@JSON(strict = true)
public class DraftCertificateModelImpl extends BaseModelImpl<DraftCertificate>
	implements DraftCertificateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a draft certificate model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate} interface instead.
	 */
	public static final String TABLE_NAME = "vr_draftcertificate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "attachedfile", Types.BIGINT },
			{ "certificatetype", Types.BIGINT },
			{ "inspectionreportid", Types.BIGINT },
			{ "safetytestreportid", Types.BIGINT },
			{ "emissiontestreportid", Types.BIGINT },
			{ "copreportid", Types.BIGINT },
			{ "reason", Types.VARCHAR },
			{ "remarks", Types.VARCHAR },
			{ "createddate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_draftcertificate (id LONG not null primary key,attachedfile LONG,certificatetype LONG,inspectionreportid LONG,safetytestreportid LONG,emissiontestreportid LONG,copreportid LONG,reason VARCHAR(75) null,remarks VARCHAR(75) null,createddate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_draftcertificate";
	public static final String ORDER_BY_JPQL = " ORDER BY draftCertificate.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_draftcertificate.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate"),
			true);
	public static long INSPECTIONREPORTID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DraftCertificate toModel(DraftCertificateSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DraftCertificate model = new DraftCertificateImpl();

		model.setId(soapModel.getId());
		model.setAttachedFile(soapModel.getAttachedFile());
		model.setCertificateType(soapModel.getCertificateType());
		model.setInspectionReportId(soapModel.getInspectionReportId());
		model.setSafetytestReportId(soapModel.getSafetytestReportId());
		model.setEmissionTestReportId(soapModel.getEmissionTestReportId());
		model.setCopReportId(soapModel.getCopReportId());
		model.setReason(soapModel.getReason());
		model.setRemarks(soapModel.getRemarks());
		model.setCreatedDate(soapModel.getCreatedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DraftCertificate> toModels(
		DraftCertificateSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DraftCertificate> models = new ArrayList<DraftCertificate>(soapModels.length);

		for (DraftCertificateSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate"));

	public DraftCertificateModelImpl() {
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
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
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
	public long getSafetytestReportId() {
		return _safetytestReportId;
	}

	@Override
	public void setSafetytestReportId(long safetytestReportId) {
		_safetytestReportId = safetytestReportId;
	}

	@JSON
	@Override
	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_emissionTestReportId = emissionTestReportId;
	}

	@JSON
	@Override
	public long getCopReportId() {
		return _copReportId;
	}

	@Override
	public void setCopReportId(long copReportId) {
		_copReportId = copReportId;
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
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DraftCertificate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DraftCertificate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DraftCertificate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DraftCertificateImpl draftCertificateImpl = new DraftCertificateImpl();

		draftCertificateImpl.setId(getId());
		draftCertificateImpl.setAttachedFile(getAttachedFile());
		draftCertificateImpl.setCertificateType(getCertificateType());
		draftCertificateImpl.setInspectionReportId(getInspectionReportId());
		draftCertificateImpl.setSafetytestReportId(getSafetytestReportId());
		draftCertificateImpl.setEmissionTestReportId(getEmissionTestReportId());
		draftCertificateImpl.setCopReportId(getCopReportId());
		draftCertificateImpl.setReason(getReason());
		draftCertificateImpl.setRemarks(getRemarks());
		draftCertificateImpl.setCreatedDate(getCreatedDate());

		draftCertificateImpl.resetOriginalValues();

		return draftCertificateImpl;
	}

	@Override
	public int compareTo(DraftCertificate draftCertificate) {
		int value = 0;

		if (getId() < draftCertificate.getId()) {
			value = -1;
		}
		else if (getId() > draftCertificate.getId()) {
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

		if (!(obj instanceof DraftCertificate)) {
			return false;
		}

		DraftCertificate draftCertificate = (DraftCertificate)obj;

		long primaryKey = draftCertificate.getPrimaryKey();

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
		DraftCertificateModelImpl draftCertificateModelImpl = this;

		draftCertificateModelImpl._originalInspectionReportId = draftCertificateModelImpl._inspectionReportId;

		draftCertificateModelImpl._setOriginalInspectionReportId = false;

		draftCertificateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DraftCertificate> toCacheModel() {
		DraftCertificateCacheModel draftCertificateCacheModel = new DraftCertificateCacheModel();

		draftCertificateCacheModel.id = getId();

		draftCertificateCacheModel.attachedFile = getAttachedFile();

		draftCertificateCacheModel.certificateType = getCertificateType();

		draftCertificateCacheModel.inspectionReportId = getInspectionReportId();

		draftCertificateCacheModel.safetytestReportId = getSafetytestReportId();

		draftCertificateCacheModel.emissionTestReportId = getEmissionTestReportId();

		draftCertificateCacheModel.copReportId = getCopReportId();

		draftCertificateCacheModel.reason = getReason();

		String reason = draftCertificateCacheModel.reason;

		if ((reason != null) && (reason.length() == 0)) {
			draftCertificateCacheModel.reason = null;
		}

		draftCertificateCacheModel.remarks = getRemarks();

		String remarks = draftCertificateCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			draftCertificateCacheModel.remarks = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			draftCertificateCacheModel.createdDate = createdDate.getTime();
		}
		else {
			draftCertificateCacheModel.createdDate = Long.MIN_VALUE;
		}

		return draftCertificateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", certificateType=");
		sb.append(getCertificateType());
		sb.append(", inspectionReportId=");
		sb.append(getInspectionReportId());
		sb.append(", safetytestReportId=");
		sb.append(getSafetytestReportId());
		sb.append(", emissionTestReportId=");
		sb.append(getEmissionTestReportId());
		sb.append(", copReportId=");
		sb.append(getCopReportId());
		sb.append(", reason=");
		sb.append(getReason());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateType</column-name><column-value><![CDATA[");
		sb.append(getCertificateType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionReportId</column-name><column-value><![CDATA[");
		sb.append(getInspectionReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetytestReportId</column-name><column-value><![CDATA[");
		sb.append(getSafetytestReportId());
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
			"<column><column-name>reason</column-name><column-value><![CDATA[");
		sb.append(getReason());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DraftCertificate.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DraftCertificate.class
		};
	private long _id;
	private long _attachedFile;
	private long _certificateType;
	private long _inspectionReportId;
	private long _originalInspectionReportId;
	private boolean _setOriginalInspectionReportId;
	private long _safetytestReportId;
	private long _emissionTestReportId;
	private long _copReportId;
	private String _reason;
	private String _remarks;
	private Date _createdDate;
	private long _columnBitmask;
	private DraftCertificate _escapedModel;
}