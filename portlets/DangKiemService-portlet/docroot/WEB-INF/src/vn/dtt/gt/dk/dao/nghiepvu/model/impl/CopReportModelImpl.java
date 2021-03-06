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

import vn.dtt.gt.dk.dao.nghiepvu.model.CopReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.CopReportModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.CopReportSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CopReport service. Represents a row in the &quot;vr_copreport&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.CopReportModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CopReportImpl}.
 * </p>
 *
 * @author huymq
 * @see CopReportImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CopReport
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CopReportModel
 * @generated
 */
@JSON(strict = true)
public class CopReportModelImpl extends BaseModelImpl<CopReport>
	implements CopReportModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cop report model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.CopReport} interface instead.
	 */
	public static final String TABLE_NAME = "vr_copreport";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "registeredinspectionid", Types.BIGINT },
			{ "reportnumber", Types.VARCHAR },
			{ "corporationid", Types.VARCHAR },
			{ "signname", Types.VARCHAR },
			{ "signtitle", Types.VARCHAR },
			{ "signplace", Types.VARCHAR },
			{ "signdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_copreport (id LONG not null primary key,registeredinspectionid LONG,reportnumber VARCHAR(75) null,corporationid VARCHAR(75) null,signname VARCHAR(75) null,signtitle VARCHAR(75) null,signplace VARCHAR(75) null,signdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_copreport";
	public static final String ORDER_BY_JPQL = " ORDER BY copReport.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_copreport.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CopReport"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CopReport"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CopReport toModel(CopReportSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CopReport model = new CopReportImpl();

		model.setId(soapModel.getId());
		model.setRegisteredInspectionId(soapModel.getRegisteredInspectionId());
		model.setReportNumber(soapModel.getReportNumber());
		model.setCorporationId(soapModel.getCorporationId());
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
	public static List<CopReport> toModels(CopReportSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CopReport> models = new ArrayList<CopReport>(soapModels.length);

		for (CopReportSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.CopReport"));

	public CopReportModelImpl() {
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
		return CopReport.class;
	}

	@Override
	public String getModelClassName() {
		return CopReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("corporationId", getCorporationId());
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

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
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
	public String getCorporationId() {
		if (_corporationId == null) {
			return StringPool.BLANK;
		}
		else {
			return _corporationId;
		}
	}

	@Override
	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CopReport.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CopReport toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CopReport)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CopReportImpl copReportImpl = new CopReportImpl();

		copReportImpl.setId(getId());
		copReportImpl.setRegisteredInspectionId(getRegisteredInspectionId());
		copReportImpl.setReportNumber(getReportNumber());
		copReportImpl.setCorporationId(getCorporationId());
		copReportImpl.setSignName(getSignName());
		copReportImpl.setSignTitle(getSignTitle());
		copReportImpl.setSignPlace(getSignPlace());
		copReportImpl.setSignDate(getSignDate());

		copReportImpl.resetOriginalValues();

		return copReportImpl;
	}

	@Override
	public int compareTo(CopReport copReport) {
		int value = 0;

		if (getId() < copReport.getId()) {
			value = -1;
		}
		else if (getId() > copReport.getId()) {
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

		if (!(obj instanceof CopReport)) {
			return false;
		}

		CopReport copReport = (CopReport)obj;

		long primaryKey = copReport.getPrimaryKey();

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
	}

	@Override
	public CacheModel<CopReport> toCacheModel() {
		CopReportCacheModel copReportCacheModel = new CopReportCacheModel();

		copReportCacheModel.id = getId();

		copReportCacheModel.registeredInspectionId = getRegisteredInspectionId();

		copReportCacheModel.reportNumber = getReportNumber();

		String reportNumber = copReportCacheModel.reportNumber;

		if ((reportNumber != null) && (reportNumber.length() == 0)) {
			copReportCacheModel.reportNumber = null;
		}

		copReportCacheModel.corporationId = getCorporationId();

		String corporationId = copReportCacheModel.corporationId;

		if ((corporationId != null) && (corporationId.length() == 0)) {
			copReportCacheModel.corporationId = null;
		}

		copReportCacheModel.signName = getSignName();

		String signName = copReportCacheModel.signName;

		if ((signName != null) && (signName.length() == 0)) {
			copReportCacheModel.signName = null;
		}

		copReportCacheModel.signTitle = getSignTitle();

		String signTitle = copReportCacheModel.signTitle;

		if ((signTitle != null) && (signTitle.length() == 0)) {
			copReportCacheModel.signTitle = null;
		}

		copReportCacheModel.signPlace = getSignPlace();

		String signPlace = copReportCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			copReportCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			copReportCacheModel.signDate = signDate.getTime();
		}
		else {
			copReportCacheModel.signDate = Long.MIN_VALUE;
		}

		return copReportCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", reportNumber=");
		sb.append(getReportNumber());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
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
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CopReport");
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
			"<column><column-name>reportNumber</column-name><column-value><![CDATA[");
		sb.append(getReportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
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

	private static ClassLoader _classLoader = CopReport.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CopReport.class
		};
	private long _id;
	private long _registeredInspectionId;
	private String _reportNumber;
	private String _corporationId;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private CopReport _escapedModel;
}