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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfigModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfigSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AssessmentSpecificationConfig service. Represents a row in the &quot;vr_assessmentspecificationconfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssessmentSpecificationConfigImpl}.
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationConfigImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfigModel
 * @generated
 */
@JSON(strict = true)
public class AssessmentSpecificationConfigModelImpl extends BaseModelImpl<AssessmentSpecificationConfig>
	implements AssessmentSpecificationConfigModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a assessment specification config model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig} interface instead.
	 */
	public static final String TABLE_NAME = "vr_assessmentspecificationconfig";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "assessmenttype", Types.VARCHAR },
			{ "specificationcategory", Types.VARCHAR },
			{ "specificationgroupcode", Types.VARCHAR },
			{ "specificationsequence", Types.INTEGER },
			{ "specificationcode", Types.VARCHAR },
			{ "specificationname", Types.VARCHAR },
			{ "specificationdescription", Types.VARCHAR },
			{ "assessmentcoefficient", Types.DOUBLE },
			{ "assessmentindexmin", Types.DOUBLE },
			{ "assessmentmarkmin", Types.DOUBLE },
			{ "assessmentindexmax", Types.DOUBLE },
			{ "assessmentmarkmax", Types.DOUBLE },
			{ "assessmentid", Types.VARCHAR },
			{ "assessmentyear", Types.VARCHAR },
			{ "evaluationperiod", Types.VARCHAR },
			{ "latestassessment", Types.TIMESTAMP },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_assessmentspecificationconfig (id LONG not null primary key,assessmenttype VARCHAR(75) null,specificationcategory VARCHAR(75) null,specificationgroupcode VARCHAR(75) null,specificationsequence INTEGER,specificationcode VARCHAR(75) null,specificationname VARCHAR(75) null,specificationdescription VARCHAR(75) null,assessmentcoefficient DOUBLE,assessmentindexmin DOUBLE,assessmentmarkmin DOUBLE,assessmentindexmax DOUBLE,assessmentmarkmax DOUBLE,assessmentid VARCHAR(75) null,assessmentyear VARCHAR(75) null,evaluationperiod VARCHAR(75) null,latestassessment DATE null,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_assessmentspecificationconfig";
	public static final String ORDER_BY_JPQL = " ORDER BY assessmentSpecificationConfig.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_assessmentspecificationconfig.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig"),
			true);
	public static long ASSESSMENTID_COLUMN_BITMASK = 1L;
	public static long ASSESSMENTYEAR_COLUMN_BITMASK = 2L;
	public static long SPECIFICATIONCODE_COLUMN_BITMASK = 4L;
	public static long SPECIFICATIONGROUPCODE_COLUMN_BITMASK = 8L;
	public static long ID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AssessmentSpecificationConfig toModel(
		AssessmentSpecificationConfigSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AssessmentSpecificationConfig model = new AssessmentSpecificationConfigImpl();

		model.setId(soapModel.getId());
		model.setAssessmenttype(soapModel.getAssessmenttype());
		model.setSpecificationcategory(soapModel.getSpecificationcategory());
		model.setSpecificationgroupcode(soapModel.getSpecificationgroupcode());
		model.setSpecificationsequence(soapModel.getSpecificationsequence());
		model.setSpecificationcode(soapModel.getSpecificationcode());
		model.setSpecificationname(soapModel.getSpecificationname());
		model.setSpecificationdescription(soapModel.getSpecificationdescription());
		model.setAssessmentcoefficient(soapModel.getAssessmentcoefficient());
		model.setAssessmentindexmin(soapModel.getAssessmentindexmin());
		model.setAssessmentmarkmin(soapModel.getAssessmentmarkmin());
		model.setAssessmentindexmax(soapModel.getAssessmentindexmax());
		model.setAssessmentmarkmax(soapModel.getAssessmentmarkmax());
		model.setAssessmentid(soapModel.getAssessmentid());
		model.setAssessmentyear(soapModel.getAssessmentyear());
		model.setEvaluationperiod(soapModel.getEvaluationperiod());
		model.setLatestassessment(soapModel.getLatestassessment());
		model.setSynchdate(soapModel.getSynchdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AssessmentSpecificationConfig> toModels(
		AssessmentSpecificationConfigSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AssessmentSpecificationConfig> models = new ArrayList<AssessmentSpecificationConfig>(soapModels.length);

		for (AssessmentSpecificationConfigSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig"));

	public AssessmentSpecificationConfigModelImpl() {
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
		return AssessmentSpecificationConfig.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentSpecificationConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("assessmenttype", getAssessmenttype());
		attributes.put("specificationcategory", getSpecificationcategory());
		attributes.put("specificationgroupcode", getSpecificationgroupcode());
		attributes.put("specificationsequence", getSpecificationsequence());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("specificationdescription", getSpecificationdescription());
		attributes.put("assessmentcoefficient", getAssessmentcoefficient());
		attributes.put("assessmentindexmin", getAssessmentindexmin());
		attributes.put("assessmentmarkmin", getAssessmentmarkmin());
		attributes.put("assessmentindexmax", getAssessmentindexmax());
		attributes.put("assessmentmarkmax", getAssessmentmarkmax());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessmentyear", getAssessmentyear());
		attributes.put("evaluationperiod", getEvaluationperiod());
		attributes.put("latestassessment", getLatestassessment());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String assessmenttype = (String)attributes.get("assessmenttype");

		if (assessmenttype != null) {
			setAssessmenttype(assessmenttype);
		}

		String specificationcategory = (String)attributes.get(
				"specificationcategory");

		if (specificationcategory != null) {
			setSpecificationcategory(specificationcategory);
		}

		String specificationgroupcode = (String)attributes.get(
				"specificationgroupcode");

		if (specificationgroupcode != null) {
			setSpecificationgroupcode(specificationgroupcode);
		}

		Integer specificationsequence = (Integer)attributes.get(
				"specificationsequence");

		if (specificationsequence != null) {
			setSpecificationsequence(specificationsequence);
		}

		String specificationcode = (String)attributes.get("specificationcode");

		if (specificationcode != null) {
			setSpecificationcode(specificationcode);
		}

		String specificationname = (String)attributes.get("specificationname");

		if (specificationname != null) {
			setSpecificationname(specificationname);
		}

		String specificationdescription = (String)attributes.get(
				"specificationdescription");

		if (specificationdescription != null) {
			setSpecificationdescription(specificationdescription);
		}

		Double assessmentcoefficient = (Double)attributes.get(
				"assessmentcoefficient");

		if (assessmentcoefficient != null) {
			setAssessmentcoefficient(assessmentcoefficient);
		}

		Double assessmentindexmin = (Double)attributes.get("assessmentindexmin");

		if (assessmentindexmin != null) {
			setAssessmentindexmin(assessmentindexmin);
		}

		Double assessmentmarkmin = (Double)attributes.get("assessmentmarkmin");

		if (assessmentmarkmin != null) {
			setAssessmentmarkmin(assessmentmarkmin);
		}

		Double assessmentindexmax = (Double)attributes.get("assessmentindexmax");

		if (assessmentindexmax != null) {
			setAssessmentindexmax(assessmentindexmax);
		}

		Double assessmentmarkmax = (Double)attributes.get("assessmentmarkmax");

		if (assessmentmarkmax != null) {
			setAssessmentmarkmax(assessmentmarkmax);
		}

		String assessmentid = (String)attributes.get("assessmentid");

		if (assessmentid != null) {
			setAssessmentid(assessmentid);
		}

		String assessmentyear = (String)attributes.get("assessmentyear");

		if (assessmentyear != null) {
			setAssessmentyear(assessmentyear);
		}

		String evaluationperiod = (String)attributes.get("evaluationperiod");

		if (evaluationperiod != null) {
			setEvaluationperiod(evaluationperiod);
		}

		Date latestassessment = (Date)attributes.get("latestassessment");

		if (latestassessment != null) {
			setLatestassessment(latestassessment);
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
	public String getAssessmenttype() {
		if (_assessmenttype == null) {
			return StringPool.BLANK;
		}
		else {
			return _assessmenttype;
		}
	}

	@Override
	public void setAssessmenttype(String assessmenttype) {
		_assessmenttype = assessmenttype;
	}

	@JSON
	@Override
	public String getSpecificationcategory() {
		if (_specificationcategory == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationcategory;
		}
	}

	@Override
	public void setSpecificationcategory(String specificationcategory) {
		_specificationcategory = specificationcategory;
	}

	@JSON
	@Override
	public String getSpecificationgroupcode() {
		if (_specificationgroupcode == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationgroupcode;
		}
	}

	@Override
	public void setSpecificationgroupcode(String specificationgroupcode) {
		_columnBitmask |= SPECIFICATIONGROUPCODE_COLUMN_BITMASK;

		if (_originalSpecificationgroupcode == null) {
			_originalSpecificationgroupcode = _specificationgroupcode;
		}

		_specificationgroupcode = specificationgroupcode;
	}

	public String getOriginalSpecificationgroupcode() {
		return GetterUtil.getString(_originalSpecificationgroupcode);
	}

	@JSON
	@Override
	public int getSpecificationsequence() {
		return _specificationsequence;
	}

	@Override
	public void setSpecificationsequence(int specificationsequence) {
		_specificationsequence = specificationsequence;
	}

	@JSON
	@Override
	public String getSpecificationcode() {
		if (_specificationcode == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationcode;
		}
	}

	@Override
	public void setSpecificationcode(String specificationcode) {
		_columnBitmask |= SPECIFICATIONCODE_COLUMN_BITMASK;

		if (_originalSpecificationcode == null) {
			_originalSpecificationcode = _specificationcode;
		}

		_specificationcode = specificationcode;
	}

	public String getOriginalSpecificationcode() {
		return GetterUtil.getString(_originalSpecificationcode);
	}

	@JSON
	@Override
	public String getSpecificationname() {
		if (_specificationname == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationname;
		}
	}

	@Override
	public void setSpecificationname(String specificationname) {
		_specificationname = specificationname;
	}

	@JSON
	@Override
	public String getSpecificationdescription() {
		if (_specificationdescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationdescription;
		}
	}

	@Override
	public void setSpecificationdescription(String specificationdescription) {
		_specificationdescription = specificationdescription;
	}

	@JSON
	@Override
	public double getAssessmentcoefficient() {
		return _assessmentcoefficient;
	}

	@Override
	public void setAssessmentcoefficient(double assessmentcoefficient) {
		_assessmentcoefficient = assessmentcoefficient;
	}

	@JSON
	@Override
	public double getAssessmentindexmin() {
		return _assessmentindexmin;
	}

	@Override
	public void setAssessmentindexmin(double assessmentindexmin) {
		_assessmentindexmin = assessmentindexmin;
	}

	@JSON
	@Override
	public double getAssessmentmarkmin() {
		return _assessmentmarkmin;
	}

	@Override
	public void setAssessmentmarkmin(double assessmentmarkmin) {
		_assessmentmarkmin = assessmentmarkmin;
	}

	@JSON
	@Override
	public double getAssessmentindexmax() {
		return _assessmentindexmax;
	}

	@Override
	public void setAssessmentindexmax(double assessmentindexmax) {
		_assessmentindexmax = assessmentindexmax;
	}

	@JSON
	@Override
	public double getAssessmentmarkmax() {
		return _assessmentmarkmax;
	}

	@Override
	public void setAssessmentmarkmax(double assessmentmarkmax) {
		_assessmentmarkmax = assessmentmarkmax;
	}

	@JSON
	@Override
	public String getAssessmentid() {
		if (_assessmentid == null) {
			return StringPool.BLANK;
		}
		else {
			return _assessmentid;
		}
	}

	@Override
	public void setAssessmentid(String assessmentid) {
		_columnBitmask |= ASSESSMENTID_COLUMN_BITMASK;

		if (_originalAssessmentid == null) {
			_originalAssessmentid = _assessmentid;
		}

		_assessmentid = assessmentid;
	}

	public String getOriginalAssessmentid() {
		return GetterUtil.getString(_originalAssessmentid);
	}

	@JSON
	@Override
	public String getAssessmentyear() {
		if (_assessmentyear == null) {
			return StringPool.BLANK;
		}
		else {
			return _assessmentyear;
		}
	}

	@Override
	public void setAssessmentyear(String assessmentyear) {
		_columnBitmask |= ASSESSMENTYEAR_COLUMN_BITMASK;

		if (_originalAssessmentyear == null) {
			_originalAssessmentyear = _assessmentyear;
		}

		_assessmentyear = assessmentyear;
	}

	public String getOriginalAssessmentyear() {
		return GetterUtil.getString(_originalAssessmentyear);
	}

	@JSON
	@Override
	public String getEvaluationperiod() {
		if (_evaluationperiod == null) {
			return StringPool.BLANK;
		}
		else {
			return _evaluationperiod;
		}
	}

	@Override
	public void setEvaluationperiod(String evaluationperiod) {
		_evaluationperiod = evaluationperiod;
	}

	@JSON
	@Override
	public Date getLatestassessment() {
		return _latestassessment;
	}

	@Override
	public void setLatestassessment(Date latestassessment) {
		_latestassessment = latestassessment;
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
			AssessmentSpecificationConfig.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AssessmentSpecificationConfig toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AssessmentSpecificationConfig)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssessmentSpecificationConfigImpl assessmentSpecificationConfigImpl = new AssessmentSpecificationConfigImpl();

		assessmentSpecificationConfigImpl.setId(getId());
		assessmentSpecificationConfigImpl.setAssessmenttype(getAssessmenttype());
		assessmentSpecificationConfigImpl.setSpecificationcategory(getSpecificationcategory());
		assessmentSpecificationConfigImpl.setSpecificationgroupcode(getSpecificationgroupcode());
		assessmentSpecificationConfigImpl.setSpecificationsequence(getSpecificationsequence());
		assessmentSpecificationConfigImpl.setSpecificationcode(getSpecificationcode());
		assessmentSpecificationConfigImpl.setSpecificationname(getSpecificationname());
		assessmentSpecificationConfigImpl.setSpecificationdescription(getSpecificationdescription());
		assessmentSpecificationConfigImpl.setAssessmentcoefficient(getAssessmentcoefficient());
		assessmentSpecificationConfigImpl.setAssessmentindexmin(getAssessmentindexmin());
		assessmentSpecificationConfigImpl.setAssessmentmarkmin(getAssessmentmarkmin());
		assessmentSpecificationConfigImpl.setAssessmentindexmax(getAssessmentindexmax());
		assessmentSpecificationConfigImpl.setAssessmentmarkmax(getAssessmentmarkmax());
		assessmentSpecificationConfigImpl.setAssessmentid(getAssessmentid());
		assessmentSpecificationConfigImpl.setAssessmentyear(getAssessmentyear());
		assessmentSpecificationConfigImpl.setEvaluationperiod(getEvaluationperiod());
		assessmentSpecificationConfigImpl.setLatestassessment(getLatestassessment());
		assessmentSpecificationConfigImpl.setSynchdate(getSynchdate());

		assessmentSpecificationConfigImpl.resetOriginalValues();

		return assessmentSpecificationConfigImpl;
	}

	@Override
	public int compareTo(
		AssessmentSpecificationConfig assessmentSpecificationConfig) {
		int value = 0;

		if (getId() < assessmentSpecificationConfig.getId()) {
			value = -1;
		}
		else if (getId() > assessmentSpecificationConfig.getId()) {
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

		if (!(obj instanceof AssessmentSpecificationConfig)) {
			return false;
		}

		AssessmentSpecificationConfig assessmentSpecificationConfig = (AssessmentSpecificationConfig)obj;

		long primaryKey = assessmentSpecificationConfig.getPrimaryKey();

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
		AssessmentSpecificationConfigModelImpl assessmentSpecificationConfigModelImpl =
			this;

		assessmentSpecificationConfigModelImpl._originalSpecificationgroupcode = assessmentSpecificationConfigModelImpl._specificationgroupcode;

		assessmentSpecificationConfigModelImpl._originalSpecificationcode = assessmentSpecificationConfigModelImpl._specificationcode;

		assessmentSpecificationConfigModelImpl._originalAssessmentid = assessmentSpecificationConfigModelImpl._assessmentid;

		assessmentSpecificationConfigModelImpl._originalAssessmentyear = assessmentSpecificationConfigModelImpl._assessmentyear;

		assessmentSpecificationConfigModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AssessmentSpecificationConfig> toCacheModel() {
		AssessmentSpecificationConfigCacheModel assessmentSpecificationConfigCacheModel =
			new AssessmentSpecificationConfigCacheModel();

		assessmentSpecificationConfigCacheModel.id = getId();

		assessmentSpecificationConfigCacheModel.assessmenttype = getAssessmenttype();

		String assessmenttype = assessmentSpecificationConfigCacheModel.assessmenttype;

		if ((assessmenttype != null) && (assessmenttype.length() == 0)) {
			assessmentSpecificationConfigCacheModel.assessmenttype = null;
		}

		assessmentSpecificationConfigCacheModel.specificationcategory = getSpecificationcategory();

		String specificationcategory = assessmentSpecificationConfigCacheModel.specificationcategory;

		if ((specificationcategory != null) &&
				(specificationcategory.length() == 0)) {
			assessmentSpecificationConfigCacheModel.specificationcategory = null;
		}

		assessmentSpecificationConfigCacheModel.specificationgroupcode = getSpecificationgroupcode();

		String specificationgroupcode = assessmentSpecificationConfigCacheModel.specificationgroupcode;

		if ((specificationgroupcode != null) &&
				(specificationgroupcode.length() == 0)) {
			assessmentSpecificationConfigCacheModel.specificationgroupcode = null;
		}

		assessmentSpecificationConfigCacheModel.specificationsequence = getSpecificationsequence();

		assessmentSpecificationConfigCacheModel.specificationcode = getSpecificationcode();

		String specificationcode = assessmentSpecificationConfigCacheModel.specificationcode;

		if ((specificationcode != null) && (specificationcode.length() == 0)) {
			assessmentSpecificationConfigCacheModel.specificationcode = null;
		}

		assessmentSpecificationConfigCacheModel.specificationname = getSpecificationname();

		String specificationname = assessmentSpecificationConfigCacheModel.specificationname;

		if ((specificationname != null) && (specificationname.length() == 0)) {
			assessmentSpecificationConfigCacheModel.specificationname = null;
		}

		assessmentSpecificationConfigCacheModel.specificationdescription = getSpecificationdescription();

		String specificationdescription = assessmentSpecificationConfigCacheModel.specificationdescription;

		if ((specificationdescription != null) &&
				(specificationdescription.length() == 0)) {
			assessmentSpecificationConfigCacheModel.specificationdescription = null;
		}

		assessmentSpecificationConfigCacheModel.assessmentcoefficient = getAssessmentcoefficient();

		assessmentSpecificationConfigCacheModel.assessmentindexmin = getAssessmentindexmin();

		assessmentSpecificationConfigCacheModel.assessmentmarkmin = getAssessmentmarkmin();

		assessmentSpecificationConfigCacheModel.assessmentindexmax = getAssessmentindexmax();

		assessmentSpecificationConfigCacheModel.assessmentmarkmax = getAssessmentmarkmax();

		assessmentSpecificationConfigCacheModel.assessmentid = getAssessmentid();

		String assessmentid = assessmentSpecificationConfigCacheModel.assessmentid;

		if ((assessmentid != null) && (assessmentid.length() == 0)) {
			assessmentSpecificationConfigCacheModel.assessmentid = null;
		}

		assessmentSpecificationConfigCacheModel.assessmentyear = getAssessmentyear();

		String assessmentyear = assessmentSpecificationConfigCacheModel.assessmentyear;

		if ((assessmentyear != null) && (assessmentyear.length() == 0)) {
			assessmentSpecificationConfigCacheModel.assessmentyear = null;
		}

		assessmentSpecificationConfigCacheModel.evaluationperiod = getEvaluationperiod();

		String evaluationperiod = assessmentSpecificationConfigCacheModel.evaluationperiod;

		if ((evaluationperiod != null) && (evaluationperiod.length() == 0)) {
			assessmentSpecificationConfigCacheModel.evaluationperiod = null;
		}

		Date latestassessment = getLatestassessment();

		if (latestassessment != null) {
			assessmentSpecificationConfigCacheModel.latestassessment = latestassessment.getTime();
		}
		else {
			assessmentSpecificationConfigCacheModel.latestassessment = Long.MIN_VALUE;
		}

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			assessmentSpecificationConfigCacheModel.synchdate = synchdate.getTime();
		}
		else {
			assessmentSpecificationConfigCacheModel.synchdate = Long.MIN_VALUE;
		}

		return assessmentSpecificationConfigCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", assessmenttype=");
		sb.append(getAssessmenttype());
		sb.append(", specificationcategory=");
		sb.append(getSpecificationcategory());
		sb.append(", specificationgroupcode=");
		sb.append(getSpecificationgroupcode());
		sb.append(", specificationsequence=");
		sb.append(getSpecificationsequence());
		sb.append(", specificationcode=");
		sb.append(getSpecificationcode());
		sb.append(", specificationname=");
		sb.append(getSpecificationname());
		sb.append(", specificationdescription=");
		sb.append(getSpecificationdescription());
		sb.append(", assessmentcoefficient=");
		sb.append(getAssessmentcoefficient());
		sb.append(", assessmentindexmin=");
		sb.append(getAssessmentindexmin());
		sb.append(", assessmentmarkmin=");
		sb.append(getAssessmentmarkmin());
		sb.append(", assessmentindexmax=");
		sb.append(getAssessmentindexmax());
		sb.append(", assessmentmarkmax=");
		sb.append(getAssessmentmarkmax());
		sb.append(", assessmentid=");
		sb.append(getAssessmentid());
		sb.append(", assessmentyear=");
		sb.append(getAssessmentyear());
		sb.append(", evaluationperiod=");
		sb.append(getEvaluationperiod());
		sb.append(", latestassessment=");
		sb.append(getLatestassessment());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmenttype</column-name><column-value><![CDATA[");
		sb.append(getAssessmenttype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationcategory</column-name><column-value><![CDATA[");
		sb.append(getSpecificationcategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationgroupcode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationgroupcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationsequence</column-name><column-value><![CDATA[");
		sb.append(getSpecificationsequence());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationcode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationname</column-name><column-value><![CDATA[");
		sb.append(getSpecificationname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationdescription</column-name><column-value><![CDATA[");
		sb.append(getSpecificationdescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentcoefficient</column-name><column-value><![CDATA[");
		sb.append(getAssessmentcoefficient());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentindexmin</column-name><column-value><![CDATA[");
		sb.append(getAssessmentindexmin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentmarkmin</column-name><column-value><![CDATA[");
		sb.append(getAssessmentmarkmin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentindexmax</column-name><column-value><![CDATA[");
		sb.append(getAssessmentindexmax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentmarkmax</column-name><column-value><![CDATA[");
		sb.append(getAssessmentmarkmax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentid</column-name><column-value><![CDATA[");
		sb.append(getAssessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentyear</column-name><column-value><![CDATA[");
		sb.append(getAssessmentyear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluationperiod</column-name><column-value><![CDATA[");
		sb.append(getEvaluationperiod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestassessment</column-name><column-value><![CDATA[");
		sb.append(getLatestassessment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = AssessmentSpecificationConfig.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			AssessmentSpecificationConfig.class
		};
	private long _id;
	private String _assessmenttype;
	private String _specificationcategory;
	private String _specificationgroupcode;
	private String _originalSpecificationgroupcode;
	private int _specificationsequence;
	private String _specificationcode;
	private String _originalSpecificationcode;
	private String _specificationname;
	private String _specificationdescription;
	private double _assessmentcoefficient;
	private double _assessmentindexmin;
	private double _assessmentmarkmin;
	private double _assessmentindexmax;
	private double _assessmentmarkmax;
	private String _assessmentid;
	private String _originalAssessmentid;
	private String _assessmentyear;
	private String _originalAssessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
	private long _columnBitmask;
	private AssessmentSpecificationConfig _escapedModel;
}