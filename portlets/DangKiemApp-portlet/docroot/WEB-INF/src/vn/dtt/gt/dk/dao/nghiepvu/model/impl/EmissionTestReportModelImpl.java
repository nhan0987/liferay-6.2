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

import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReportModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReportSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EmissionTestReport service. Represents a row in the &quot;vr_emissiontestreport&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReportModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmissionTestReportImpl}.
 * </p>
 *
 * @author win_64
 * @see EmissionTestReportImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReportModel
 * @generated
 */
@JSON(strict = true)
public class EmissionTestReportModelImpl extends BaseModelImpl<EmissionTestReport>
	implements EmissionTestReportModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a emission test report model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport} interface instead.
	 */
	public static final String TABLE_NAME = "vr_emissiontestreport";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "registeredinspectionid", Types.BIGINT },
			{ "inspectionrecordid", Types.BIGINT },
			{ "hosothutucid", Types.BIGINT },
			{ "emissiontestrequirementid", Types.BIGINT },
			{ "requirementnumber", Types.VARCHAR },
			{ "reportnumber", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "attachedfile", Types.BIGINT },
			{ "phieuxulyphuid", Types.BIGINT },
			{ "confirmedresult", Types.BIGINT },
			{ "signname", Types.VARCHAR },
			{ "signtitle", Types.VARCHAR },
			{ "signplace", Types.VARCHAR },
			{ "signdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_emissiontestreport (id LONG not null primary key,registeredinspectionid LONG,inspectionrecordid LONG,hosothutucid LONG,emissiontestrequirementid LONG,requirementnumber VARCHAR(75) null,reportnumber VARCHAR(75) null,description VARCHAR(75) null,attachedfile LONG,phieuxulyphuid LONG,confirmedresult LONG,signname VARCHAR(75) null,signtitle VARCHAR(75) null,signplace VARCHAR(75) null,signdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_emissiontestreport";
	public static final String ORDER_BY_JPQL = " ORDER BY emissionTestReport.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_emissiontestreport.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport"),
			true);
	public static long EMISSIONTESTREQUIREMENTID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmissionTestReport toModel(EmissionTestReportSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmissionTestReport model = new EmissionTestReportImpl();

		model.setId(soapModel.getId());
		model.setRegisteredInspectionId(soapModel.getRegisteredInspectionId());
		model.setInspectionrecordId(soapModel.getInspectionrecordId());
		model.setHosothutucId(soapModel.getHosothutucId());
		model.setEmissiontestRequirementId(soapModel.getEmissiontestRequirementId());
		model.setRequirementNumber(soapModel.getRequirementNumber());
		model.setReportNumber(soapModel.getReportNumber());
		model.setDescription(soapModel.getDescription());
		model.setAttachedFile(soapModel.getAttachedFile());
		model.setPhieuxulyphuId(soapModel.getPhieuxulyphuId());
		model.setConfirmedResult(soapModel.getConfirmedResult());
		model.setSignName(soapModel.getSignName());
		model.setSignTitle(soapModel.getSignTitle());
		model.setSignPlace(soapModel.getSignPlace());
		model.setSignDate(soapModel.getSignDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EmissionTestReport> toModels(
		EmissionTestReportSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmissionTestReport> models = new ArrayList<EmissionTestReport>(soapModels.length);

		for (EmissionTestReportSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport"));

	public EmissionTestReportModelImpl() {
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
		return EmissionTestReport.class;
	}

	@Override
	public String getModelClassName() {
		return EmissionTestReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("inspectionrecordId", getInspectionrecordId());
		attributes.put("hosothutucId", getHosothutucId());
		attributes.put("emissiontestRequirementId",
			getEmissiontestRequirementId());
		attributes.put("requirementNumber", getRequirementNumber());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("description", getDescription());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("phieuxulyphuId", getPhieuxulyphuId());
		attributes.put("confirmedResult", getConfirmedResult());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		Long inspectionrecordId = (Long)attributes.get("inspectionrecordId");

		if (inspectionrecordId != null) {
			setInspectionrecordId(inspectionrecordId);
		}

		Long hosothutucId = (Long)attributes.get("hosothutucId");

		if (hosothutucId != null) {
			setHosothutucId(hosothutucId);
		}

		Long emissiontestRequirementId = (Long)attributes.get(
				"emissiontestRequirementId");

		if (emissiontestRequirementId != null) {
			setEmissiontestRequirementId(emissiontestRequirementId);
		}

		String requirementNumber = (String)attributes.get("requirementNumber");

		if (requirementNumber != null) {
			setRequirementNumber(requirementNumber);
		}

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long phieuxulyphuId = (Long)attributes.get("phieuxulyphuId");

		if (phieuxulyphuId != null) {
			setPhieuxulyphuId(phieuxulyphuId);
		}

		Long confirmedResult = (Long)attributes.get("confirmedResult");

		if (confirmedResult != null) {
			setConfirmedResult(confirmedResult);
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
	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;
	}

	@JSON
	@Override
	public long getInspectionrecordId() {
		return _inspectionrecordId;
	}

	@Override
	public void setInspectionrecordId(long inspectionrecordId) {
		_inspectionrecordId = inspectionrecordId;
	}

	@JSON
	@Override
	public long getHosothutucId() {
		return _hosothutucId;
	}

	@Override
	public void setHosothutucId(long hosothutucId) {
		_hosothutucId = hosothutucId;
	}

	@JSON
	@Override
	public long getEmissiontestRequirementId() {
		return _emissiontestRequirementId;
	}

	@Override
	public void setEmissiontestRequirementId(long emissiontestRequirementId) {
		_columnBitmask |= EMISSIONTESTREQUIREMENTID_COLUMN_BITMASK;

		if (!_setOriginalEmissiontestRequirementId) {
			_setOriginalEmissiontestRequirementId = true;

			_originalEmissiontestRequirementId = _emissiontestRequirementId;
		}

		_emissiontestRequirementId = emissiontestRequirementId;
	}

	public long getOriginalEmissiontestRequirementId() {
		return _originalEmissiontestRequirementId;
	}

	@JSON
	@Override
	public String getRequirementNumber() {
		if (_requirementNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _requirementNumber;
		}
	}

	@Override
	public void setRequirementNumber(String requirementNumber) {
		_requirementNumber = requirementNumber;
	}

	@JSON
	@Override
	public String getReportNumber() {
		if (_reportNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _reportNumber;
		}
	}

	@Override
	public void setReportNumber(String reportNumber) {
		_reportNumber = reportNumber;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
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
	public long getPhieuxulyphuId() {
		return _phieuxulyphuId;
	}

	@Override
	public void setPhieuxulyphuId(long phieuxulyphuId) {
		_phieuxulyphuId = phieuxulyphuId;
	}

	@JSON
	@Override
	public long getConfirmedResult() {
		return _confirmedResult;
	}

	@Override
	public void setConfirmedResult(long confirmedResult) {
		_confirmedResult = confirmedResult;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			EmissionTestReport.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmissionTestReport toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmissionTestReport)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmissionTestReportImpl emissionTestReportImpl = new EmissionTestReportImpl();

		emissionTestReportImpl.setId(getId());
		emissionTestReportImpl.setRegisteredInspectionId(getRegisteredInspectionId());
		emissionTestReportImpl.setInspectionrecordId(getInspectionrecordId());
		emissionTestReportImpl.setHosothutucId(getHosothutucId());
		emissionTestReportImpl.setEmissiontestRequirementId(getEmissiontestRequirementId());
		emissionTestReportImpl.setRequirementNumber(getRequirementNumber());
		emissionTestReportImpl.setReportNumber(getReportNumber());
		emissionTestReportImpl.setDescription(getDescription());
		emissionTestReportImpl.setAttachedFile(getAttachedFile());
		emissionTestReportImpl.setPhieuxulyphuId(getPhieuxulyphuId());
		emissionTestReportImpl.setConfirmedResult(getConfirmedResult());
		emissionTestReportImpl.setSignName(getSignName());
		emissionTestReportImpl.setSignTitle(getSignTitle());
		emissionTestReportImpl.setSignPlace(getSignPlace());
		emissionTestReportImpl.setSignDate(getSignDate());

		emissionTestReportImpl.resetOriginalValues();

		return emissionTestReportImpl;
	}

	@Override
	public int compareTo(EmissionTestReport emissionTestReport) {
		int value = 0;

		if (getId() < emissionTestReport.getId()) {
			value = -1;
		}
		else if (getId() > emissionTestReport.getId()) {
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

		if (!(obj instanceof EmissionTestReport)) {
			return false;
		}

		EmissionTestReport emissionTestReport = (EmissionTestReport)obj;

		long primaryKey = emissionTestReport.getPrimaryKey();

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
		EmissionTestReportModelImpl emissionTestReportModelImpl = this;

		emissionTestReportModelImpl._originalEmissiontestRequirementId = emissionTestReportModelImpl._emissiontestRequirementId;

		emissionTestReportModelImpl._setOriginalEmissiontestRequirementId = false;

		emissionTestReportModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmissionTestReport> toCacheModel() {
		EmissionTestReportCacheModel emissionTestReportCacheModel = new EmissionTestReportCacheModel();

		emissionTestReportCacheModel.id = getId();

		emissionTestReportCacheModel.registeredInspectionId = getRegisteredInspectionId();

		emissionTestReportCacheModel.inspectionrecordId = getInspectionrecordId();

		emissionTestReportCacheModel.hosothutucId = getHosothutucId();

		emissionTestReportCacheModel.emissiontestRequirementId = getEmissiontestRequirementId();

		emissionTestReportCacheModel.requirementNumber = getRequirementNumber();

		String requirementNumber = emissionTestReportCacheModel.requirementNumber;

		if ((requirementNumber != null) && (requirementNumber.length() == 0)) {
			emissionTestReportCacheModel.requirementNumber = null;
		}

		emissionTestReportCacheModel.reportNumber = getReportNumber();

		String reportNumber = emissionTestReportCacheModel.reportNumber;

		if ((reportNumber != null) && (reportNumber.length() == 0)) {
			emissionTestReportCacheModel.reportNumber = null;
		}

		emissionTestReportCacheModel.description = getDescription();

		String description = emissionTestReportCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			emissionTestReportCacheModel.description = null;
		}

		emissionTestReportCacheModel.attachedFile = getAttachedFile();

		emissionTestReportCacheModel.phieuxulyphuId = getPhieuxulyphuId();

		emissionTestReportCacheModel.confirmedResult = getConfirmedResult();

		emissionTestReportCacheModel.signName = getSignName();

		String signName = emissionTestReportCacheModel.signName;

		if ((signName != null) && (signName.length() == 0)) {
			emissionTestReportCacheModel.signName = null;
		}

		emissionTestReportCacheModel.signTitle = getSignTitle();

		String signTitle = emissionTestReportCacheModel.signTitle;

		if ((signTitle != null) && (signTitle.length() == 0)) {
			emissionTestReportCacheModel.signTitle = null;
		}

		emissionTestReportCacheModel.signPlace = getSignPlace();

		String signPlace = emissionTestReportCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			emissionTestReportCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			emissionTestReportCacheModel.signDate = signDate.getTime();
		}
		else {
			emissionTestReportCacheModel.signDate = Long.MIN_VALUE;
		}

		return emissionTestReportCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", inspectionrecordId=");
		sb.append(getInspectionrecordId());
		sb.append(", hosothutucId=");
		sb.append(getHosothutucId());
		sb.append(", emissiontestRequirementId=");
		sb.append(getEmissiontestRequirementId());
		sb.append(", requirementNumber=");
		sb.append(getRequirementNumber());
		sb.append(", reportNumber=");
		sb.append(getReportNumber());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", phieuxulyphuId=");
		sb.append(getPhieuxulyphuId());
		sb.append(", confirmedResult=");
		sb.append(getConfirmedResult());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionrecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionrecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hosothutucId</column-name><column-value><![CDATA[");
		sb.append(getHosothutucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissiontestRequirementId</column-name><column-value><![CDATA[");
		sb.append(getEmissiontestRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requirementNumber</column-name><column-value><![CDATA[");
		sb.append(getRequirementNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportNumber</column-name><column-value><![CDATA[");
		sb.append(getReportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuxulyphuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuxulyphuId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedResult</column-name><column-value><![CDATA[");
		sb.append(getConfirmedResult());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EmissionTestReport.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmissionTestReport.class
		};
	private long _id;
	private long _registeredInspectionId;
	private long _inspectionrecordId;
	private long _hosothutucId;
	private long _emissiontestRequirementId;
	private long _originalEmissiontestRequirementId;
	private boolean _setOriginalEmissiontestRequirementId;
	private String _requirementNumber;
	private String _reportNumber;
	private String _description;
	private long _attachedFile;
	private long _phieuxulyphuId;
	private long _confirmedResult;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _columnBitmask;
	private EmissionTestReport _escapedModel;
}