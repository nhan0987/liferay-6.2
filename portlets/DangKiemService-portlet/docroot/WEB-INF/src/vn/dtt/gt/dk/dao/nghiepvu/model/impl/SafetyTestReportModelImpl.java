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

import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReportModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReportSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SafetyTestReport service. Represents a row in the &quot;vr_safetytestreport&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReportModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SafetyTestReportImpl}.
 * </p>
 *
 * @author huymq
 * @see SafetyTestReportImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReportModel
 * @generated
 */
@JSON(strict = true)
public class SafetyTestReportModelImpl extends BaseModelImpl<SafetyTestReport>
	implements SafetyTestReportModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a safety test report model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport} interface instead.
	 */
	public static final String TABLE_NAME = "vr_safetytestreport";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "safetestrequirementid", Types.BIGINT },
			{ "reportnumber", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "attachedfile", Types.BIGINT },
			{ "confirmedresult", Types.BIGINT },
			{ "signname", Types.VARCHAR },
			{ "signtitle", Types.VARCHAR },
			{ "signplace", Types.VARCHAR },
			{ "signdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_safetytestreport (id LONG not null primary key,safetestrequirementid LONG,reportnumber VARCHAR(75) null,description VARCHAR(75) null,attachedfile LONG,confirmedresult LONG,signname VARCHAR(75) null,signtitle VARCHAR(75) null,signplace VARCHAR(75) null,signdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_safetytestreport";
	public static final String ORDER_BY_JPQL = " ORDER BY safetyTestReport.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_safetytestreport.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport"),
			true);
	public static long SAFETESTREQUIREMENTID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SafetyTestReport toModel(SafetyTestReportSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SafetyTestReport model = new SafetyTestReportImpl();

		model.setId(soapModel.getId());
		model.setSafetestRequirementId(soapModel.getSafetestRequirementId());
		model.setReportNumber(soapModel.getReportNumber());
		model.setDescription(soapModel.getDescription());
		model.setAttachedFile(soapModel.getAttachedFile());
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
	public static List<SafetyTestReport> toModels(
		SafetyTestReportSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SafetyTestReport> models = new ArrayList<SafetyTestReport>(soapModels.length);

		for (SafetyTestReportSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport"));

	public SafetyTestReportModelImpl() {
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
		return SafetyTestReport.class;
	}

	@Override
	public String getModelClassName() {
		return SafetyTestReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("safetestRequirementId", getSafetestRequirementId());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("description", getDescription());
		attributes.put("attachedFile", getAttachedFile());
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

		Long safetestRequirementId = (Long)attributes.get(
				"safetestRequirementId");

		if (safetestRequirementId != null) {
			setSafetestRequirementId(safetestRequirementId);
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
	public long getSafetestRequirementId() {
		return _safetestRequirementId;
	}

	@Override
	public void setSafetestRequirementId(long safetestRequirementId) {
		_columnBitmask |= SAFETESTREQUIREMENTID_COLUMN_BITMASK;

		if (!_setOriginalSafetestRequirementId) {
			_setOriginalSafetestRequirementId = true;

			_originalSafetestRequirementId = _safetestRequirementId;
		}

		_safetestRequirementId = safetestRequirementId;
	}

	public long getOriginalSafetestRequirementId() {
		return _originalSafetestRequirementId;
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
			SafetyTestReport.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SafetyTestReport toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SafetyTestReport)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SafetyTestReportImpl safetyTestReportImpl = new SafetyTestReportImpl();

		safetyTestReportImpl.setId(getId());
		safetyTestReportImpl.setSafetestRequirementId(getSafetestRequirementId());
		safetyTestReportImpl.setReportNumber(getReportNumber());
		safetyTestReportImpl.setDescription(getDescription());
		safetyTestReportImpl.setAttachedFile(getAttachedFile());
		safetyTestReportImpl.setConfirmedResult(getConfirmedResult());
		safetyTestReportImpl.setSignName(getSignName());
		safetyTestReportImpl.setSignTitle(getSignTitle());
		safetyTestReportImpl.setSignPlace(getSignPlace());
		safetyTestReportImpl.setSignDate(getSignDate());

		safetyTestReportImpl.resetOriginalValues();

		return safetyTestReportImpl;
	}

	@Override
	public int compareTo(SafetyTestReport safetyTestReport) {
		int value = 0;

		if (getId() < safetyTestReport.getId()) {
			value = -1;
		}
		else if (getId() > safetyTestReport.getId()) {
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

		if (!(obj instanceof SafetyTestReport)) {
			return false;
		}

		SafetyTestReport safetyTestReport = (SafetyTestReport)obj;

		long primaryKey = safetyTestReport.getPrimaryKey();

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
		SafetyTestReportModelImpl safetyTestReportModelImpl = this;

		safetyTestReportModelImpl._originalSafetestRequirementId = safetyTestReportModelImpl._safetestRequirementId;

		safetyTestReportModelImpl._setOriginalSafetestRequirementId = false;

		safetyTestReportModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SafetyTestReport> toCacheModel() {
		SafetyTestReportCacheModel safetyTestReportCacheModel = new SafetyTestReportCacheModel();

		safetyTestReportCacheModel.id = getId();

		safetyTestReportCacheModel.safetestRequirementId = getSafetestRequirementId();

		safetyTestReportCacheModel.reportNumber = getReportNumber();

		String reportNumber = safetyTestReportCacheModel.reportNumber;

		if ((reportNumber != null) && (reportNumber.length() == 0)) {
			safetyTestReportCacheModel.reportNumber = null;
		}

		safetyTestReportCacheModel.description = getDescription();

		String description = safetyTestReportCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			safetyTestReportCacheModel.description = null;
		}

		safetyTestReportCacheModel.attachedFile = getAttachedFile();

		safetyTestReportCacheModel.confirmedResult = getConfirmedResult();

		safetyTestReportCacheModel.signName = getSignName();

		String signName = safetyTestReportCacheModel.signName;

		if ((signName != null) && (signName.length() == 0)) {
			safetyTestReportCacheModel.signName = null;
		}

		safetyTestReportCacheModel.signTitle = getSignTitle();

		String signTitle = safetyTestReportCacheModel.signTitle;

		if ((signTitle != null) && (signTitle.length() == 0)) {
			safetyTestReportCacheModel.signTitle = null;
		}

		safetyTestReportCacheModel.signPlace = getSignPlace();

		String signPlace = safetyTestReportCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			safetyTestReportCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			safetyTestReportCacheModel.signDate = signDate.getTime();
		}
		else {
			safetyTestReportCacheModel.signDate = Long.MIN_VALUE;
		}

		return safetyTestReportCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", safetestRequirementId=");
		sb.append(getSafetestRequirementId());
		sb.append(", reportNumber=");
		sb.append(getReportNumber());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetestRequirementId</column-name><column-value><![CDATA[");
		sb.append(getSafetestRequirementId());
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

	private static ClassLoader _classLoader = SafetyTestReport.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SafetyTestReport.class
		};
	private long _id;
	private long _safetestRequirementId;
	private long _originalSafetestRequirementId;
	private boolean _setOriginalSafetestRequirementId;
	private String _reportNumber;
	private String _description;
	private long _attachedFile;
	private long _confirmedResult;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _columnBitmask;
	private SafetyTestReport _escapedModel;
}