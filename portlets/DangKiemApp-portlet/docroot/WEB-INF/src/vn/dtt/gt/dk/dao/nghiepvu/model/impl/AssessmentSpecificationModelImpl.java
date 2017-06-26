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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AssessmentSpecification service. Represents a row in the &quot;vr_assessmentspecification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssessmentSpecificationImpl}.
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationModel
 * @generated
 */
@JSON(strict = true)
public class AssessmentSpecificationModelImpl extends BaseModelImpl<AssessmentSpecification>
	implements AssessmentSpecificationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a assessment specification model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification} interface instead.
	 */
	public static final String TABLE_NAME = "vr_assessmentspecification";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "assessmenttype", Types.VARCHAR },
			{ "importercode", Types.VARCHAR },
			{ "inspectorcontactcode", Types.VARCHAR },
			{ "productioncode", Types.VARCHAR },
			{ "specificationcategory", Types.VARCHAR },
			{ "specificationgroupcode", Types.VARCHAR },
			{ "specificationsequence", Types.INTEGER },
			{ "specificationcode", Types.VARCHAR },
			{ "specificationname", Types.VARCHAR },
			{ "specificationvalue", Types.VARCHAR },
			{ "specificationdescription", Types.VARCHAR },
			{ "assessmentcoefficient", Types.DOUBLE },
			{ "assessmentindex", Types.DOUBLE },
			{ "assessmentmark", Types.DOUBLE },
			{ "assessmentid", Types.VARCHAR },
			{ "assessmentyear", Types.VARCHAR },
			{ "evaluationperiod", Types.VARCHAR },
			{ "latestassessment", Types.TIMESTAMP },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_assessmentspecification (id LONG not null primary key,assessmenttype VARCHAR(75) null,importercode VARCHAR(75) null,inspectorcontactcode VARCHAR(75) null,productioncode VARCHAR(75) null,specificationcategory VARCHAR(75) null,specificationgroupcode VARCHAR(75) null,specificationsequence INTEGER,specificationcode VARCHAR(75) null,specificationname VARCHAR(75) null,specificationvalue VARCHAR(75) null,specificationdescription VARCHAR(75) null,assessmentcoefficient DOUBLE,assessmentindex DOUBLE,assessmentmark DOUBLE,assessmentid VARCHAR(75) null,assessmentyear VARCHAR(75) null,evaluationperiod VARCHAR(75) null,latestassessment DATE null,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_assessmentspecification";
	public static final String ORDER_BY_JPQL = " ORDER BY assessmentSpecification.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_assessmentspecification.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification"),
			true);
	public static long ASSESSMENTID_COLUMN_BITMASK = 1L;
	public static long ASSESSMENTYEAR_COLUMN_BITMASK = 2L;
	public static long IMPORTERCODE_COLUMN_BITMASK = 4L;
	public static long INSPECTORCONTACTCODE_COLUMN_BITMASK = 8L;
	public static long PRODUCTIONCODE_COLUMN_BITMASK = 16L;
	public static long SPECIFICATIONCODE_COLUMN_BITMASK = 32L;
	public static long SPECIFICATIONGROUPCODE_COLUMN_BITMASK = 64L;
	public static long ID_COLUMN_BITMASK = 128L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AssessmentSpecification toModel(
		AssessmentSpecificationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AssessmentSpecification model = new AssessmentSpecificationImpl();

		model.setId(soapModel.getId());
		model.setAssessmenttype(soapModel.getAssessmenttype());
		model.setImportercode(soapModel.getImportercode());
		model.setInspectorcontactcode(soapModel.getInspectorcontactcode());
		model.setProductioncode(soapModel.getProductioncode());
		model.setSpecificationcategory(soapModel.getSpecificationcategory());
		model.setSpecificationgroupcode(soapModel.getSpecificationgroupcode());
		model.setSpecificationsequence(soapModel.getSpecificationsequence());
		model.setSpecificationcode(soapModel.getSpecificationcode());
		model.setSpecificationname(soapModel.getSpecificationname());
		model.setSpecificationvalue(soapModel.getSpecificationvalue());
		model.setSpecificationdescription(soapModel.getSpecificationdescription());
		model.setAssessmentcoefficient(soapModel.getAssessmentcoefficient());
		model.setAssessmentindex(soapModel.getAssessmentindex());
		model.setAssessmentmark(soapModel.getAssessmentmark());
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
	public static List<AssessmentSpecification> toModels(
		AssessmentSpecificationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AssessmentSpecification> models = new ArrayList<AssessmentSpecification>(soapModels.length);

		for (AssessmentSpecificationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification"));

	public AssessmentSpecificationModelImpl() {
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
		return AssessmentSpecification.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentSpecification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("assessmenttype", getAssessmenttype());
		attributes.put("importercode", getImportercode());
		attributes.put("inspectorcontactcode", getInspectorcontactcode());
		attributes.put("productioncode", getProductioncode());
		attributes.put("specificationcategory", getSpecificationcategory());
		attributes.put("specificationgroupcode", getSpecificationgroupcode());
		attributes.put("specificationsequence", getSpecificationsequence());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("specificationvalue", getSpecificationvalue());
		attributes.put("specificationdescription", getSpecificationdescription());
		attributes.put("assessmentcoefficient", getAssessmentcoefficient());
		attributes.put("assessmentindex", getAssessmentindex());
		attributes.put("assessmentmark", getAssessmentmark());
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

		String importercode = (String)attributes.get("importercode");

		if (importercode != null) {
			setImportercode(importercode);
		}

		String inspectorcontactcode = (String)attributes.get(
				"inspectorcontactcode");

		if (inspectorcontactcode != null) {
			setInspectorcontactcode(inspectorcontactcode);
		}

		String productioncode = (String)attributes.get("productioncode");

		if (productioncode != null) {
			setProductioncode(productioncode);
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

		String specificationvalue = (String)attributes.get("specificationvalue");

		if (specificationvalue != null) {
			setSpecificationvalue(specificationvalue);
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

		Double assessmentindex = (Double)attributes.get("assessmentindex");

		if (assessmentindex != null) {
			setAssessmentindex(assessmentindex);
		}

		Double assessmentmark = (Double)attributes.get("assessmentmark");

		if (assessmentmark != null) {
			setAssessmentmark(assessmentmark);
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
	public String getImportercode() {
		if (_importercode == null) {
			return StringPool.BLANK;
		}
		else {
			return _importercode;
		}
	}

	@Override
	public void setImportercode(String importercode) {
		_columnBitmask |= IMPORTERCODE_COLUMN_BITMASK;

		if (_originalImportercode == null) {
			_originalImportercode = _importercode;
		}

		_importercode = importercode;
	}

	public String getOriginalImportercode() {
		return GetterUtil.getString(_originalImportercode);
	}

	@JSON
	@Override
	public String getInspectorcontactcode() {
		if (_inspectorcontactcode == null) {
			return StringPool.BLANK;
		}
		else {
			return _inspectorcontactcode;
		}
	}

	@Override
	public void setInspectorcontactcode(String inspectorcontactcode) {
		_columnBitmask |= INSPECTORCONTACTCODE_COLUMN_BITMASK;

		if (_originalInspectorcontactcode == null) {
			_originalInspectorcontactcode = _inspectorcontactcode;
		}

		_inspectorcontactcode = inspectorcontactcode;
	}

	public String getOriginalInspectorcontactcode() {
		return GetterUtil.getString(_originalInspectorcontactcode);
	}

	@JSON
	@Override
	public String getProductioncode() {
		if (_productioncode == null) {
			return StringPool.BLANK;
		}
		else {
			return _productioncode;
		}
	}

	@Override
	public void setProductioncode(String productioncode) {
		_columnBitmask |= PRODUCTIONCODE_COLUMN_BITMASK;

		if (_originalProductioncode == null) {
			_originalProductioncode = _productioncode;
		}

		_productioncode = productioncode;
	}

	public String getOriginalProductioncode() {
		return GetterUtil.getString(_originalProductioncode);
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
	public String getSpecificationvalue() {
		if (_specificationvalue == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationvalue;
		}
	}

	@Override
	public void setSpecificationvalue(String specificationvalue) {
		_specificationvalue = specificationvalue;
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
	public double getAssessmentindex() {
		return _assessmentindex;
	}

	@Override
	public void setAssessmentindex(double assessmentindex) {
		_assessmentindex = assessmentindex;
	}

	@JSON
	@Override
	public double getAssessmentmark() {
		return _assessmentmark;
	}

	@Override
	public void setAssessmentmark(double assessmentmark) {
		_assessmentmark = assessmentmark;
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
			AssessmentSpecification.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AssessmentSpecification toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AssessmentSpecification)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssessmentSpecificationImpl assessmentSpecificationImpl = new AssessmentSpecificationImpl();

		assessmentSpecificationImpl.setId(getId());
		assessmentSpecificationImpl.setAssessmenttype(getAssessmenttype());
		assessmentSpecificationImpl.setImportercode(getImportercode());
		assessmentSpecificationImpl.setInspectorcontactcode(getInspectorcontactcode());
		assessmentSpecificationImpl.setProductioncode(getProductioncode());
		assessmentSpecificationImpl.setSpecificationcategory(getSpecificationcategory());
		assessmentSpecificationImpl.setSpecificationgroupcode(getSpecificationgroupcode());
		assessmentSpecificationImpl.setSpecificationsequence(getSpecificationsequence());
		assessmentSpecificationImpl.setSpecificationcode(getSpecificationcode());
		assessmentSpecificationImpl.setSpecificationname(getSpecificationname());
		assessmentSpecificationImpl.setSpecificationvalue(getSpecificationvalue());
		assessmentSpecificationImpl.setSpecificationdescription(getSpecificationdescription());
		assessmentSpecificationImpl.setAssessmentcoefficient(getAssessmentcoefficient());
		assessmentSpecificationImpl.setAssessmentindex(getAssessmentindex());
		assessmentSpecificationImpl.setAssessmentmark(getAssessmentmark());
		assessmentSpecificationImpl.setAssessmentid(getAssessmentid());
		assessmentSpecificationImpl.setAssessmentyear(getAssessmentyear());
		assessmentSpecificationImpl.setEvaluationperiod(getEvaluationperiod());
		assessmentSpecificationImpl.setLatestassessment(getLatestassessment());
		assessmentSpecificationImpl.setSynchdate(getSynchdate());

		assessmentSpecificationImpl.resetOriginalValues();

		return assessmentSpecificationImpl;
	}

	@Override
	public int compareTo(AssessmentSpecification assessmentSpecification) {
		int value = 0;

		if (getId() < assessmentSpecification.getId()) {
			value = -1;
		}
		else if (getId() > assessmentSpecification.getId()) {
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

		if (!(obj instanceof AssessmentSpecification)) {
			return false;
		}

		AssessmentSpecification assessmentSpecification = (AssessmentSpecification)obj;

		long primaryKey = assessmentSpecification.getPrimaryKey();

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
		AssessmentSpecificationModelImpl assessmentSpecificationModelImpl = this;

		assessmentSpecificationModelImpl._originalImportercode = assessmentSpecificationModelImpl._importercode;

		assessmentSpecificationModelImpl._originalInspectorcontactcode = assessmentSpecificationModelImpl._inspectorcontactcode;

		assessmentSpecificationModelImpl._originalProductioncode = assessmentSpecificationModelImpl._productioncode;

		assessmentSpecificationModelImpl._originalSpecificationgroupcode = assessmentSpecificationModelImpl._specificationgroupcode;

		assessmentSpecificationModelImpl._originalSpecificationcode = assessmentSpecificationModelImpl._specificationcode;

		assessmentSpecificationModelImpl._originalAssessmentid = assessmentSpecificationModelImpl._assessmentid;

		assessmentSpecificationModelImpl._originalAssessmentyear = assessmentSpecificationModelImpl._assessmentyear;

		assessmentSpecificationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AssessmentSpecification> toCacheModel() {
		AssessmentSpecificationCacheModel assessmentSpecificationCacheModel = new AssessmentSpecificationCacheModel();

		assessmentSpecificationCacheModel.id = getId();

		assessmentSpecificationCacheModel.assessmenttype = getAssessmenttype();

		String assessmenttype = assessmentSpecificationCacheModel.assessmenttype;

		if ((assessmenttype != null) && (assessmenttype.length() == 0)) {
			assessmentSpecificationCacheModel.assessmenttype = null;
		}

		assessmentSpecificationCacheModel.importercode = getImportercode();

		String importercode = assessmentSpecificationCacheModel.importercode;

		if ((importercode != null) && (importercode.length() == 0)) {
			assessmentSpecificationCacheModel.importercode = null;
		}

		assessmentSpecificationCacheModel.inspectorcontactcode = getInspectorcontactcode();

		String inspectorcontactcode = assessmentSpecificationCacheModel.inspectorcontactcode;

		if ((inspectorcontactcode != null) &&
				(inspectorcontactcode.length() == 0)) {
			assessmentSpecificationCacheModel.inspectorcontactcode = null;
		}

		assessmentSpecificationCacheModel.productioncode = getProductioncode();

		String productioncode = assessmentSpecificationCacheModel.productioncode;

		if ((productioncode != null) && (productioncode.length() == 0)) {
			assessmentSpecificationCacheModel.productioncode = null;
		}

		assessmentSpecificationCacheModel.specificationcategory = getSpecificationcategory();

		String specificationcategory = assessmentSpecificationCacheModel.specificationcategory;

		if ((specificationcategory != null) &&
				(specificationcategory.length() == 0)) {
			assessmentSpecificationCacheModel.specificationcategory = null;
		}

		assessmentSpecificationCacheModel.specificationgroupcode = getSpecificationgroupcode();

		String specificationgroupcode = assessmentSpecificationCacheModel.specificationgroupcode;

		if ((specificationgroupcode != null) &&
				(specificationgroupcode.length() == 0)) {
			assessmentSpecificationCacheModel.specificationgroupcode = null;
		}

		assessmentSpecificationCacheModel.specificationsequence = getSpecificationsequence();

		assessmentSpecificationCacheModel.specificationcode = getSpecificationcode();

		String specificationcode = assessmentSpecificationCacheModel.specificationcode;

		if ((specificationcode != null) && (specificationcode.length() == 0)) {
			assessmentSpecificationCacheModel.specificationcode = null;
		}

		assessmentSpecificationCacheModel.specificationname = getSpecificationname();

		String specificationname = assessmentSpecificationCacheModel.specificationname;

		if ((specificationname != null) && (specificationname.length() == 0)) {
			assessmentSpecificationCacheModel.specificationname = null;
		}

		assessmentSpecificationCacheModel.specificationvalue = getSpecificationvalue();

		String specificationvalue = assessmentSpecificationCacheModel.specificationvalue;

		if ((specificationvalue != null) && (specificationvalue.length() == 0)) {
			assessmentSpecificationCacheModel.specificationvalue = null;
		}

		assessmentSpecificationCacheModel.specificationdescription = getSpecificationdescription();

		String specificationdescription = assessmentSpecificationCacheModel.specificationdescription;

		if ((specificationdescription != null) &&
				(specificationdescription.length() == 0)) {
			assessmentSpecificationCacheModel.specificationdescription = null;
		}

		assessmentSpecificationCacheModel.assessmentcoefficient = getAssessmentcoefficient();

		assessmentSpecificationCacheModel.assessmentindex = getAssessmentindex();

		assessmentSpecificationCacheModel.assessmentmark = getAssessmentmark();

		assessmentSpecificationCacheModel.assessmentid = getAssessmentid();

		String assessmentid = assessmentSpecificationCacheModel.assessmentid;

		if ((assessmentid != null) && (assessmentid.length() == 0)) {
			assessmentSpecificationCacheModel.assessmentid = null;
		}

		assessmentSpecificationCacheModel.assessmentyear = getAssessmentyear();

		String assessmentyear = assessmentSpecificationCacheModel.assessmentyear;

		if ((assessmentyear != null) && (assessmentyear.length() == 0)) {
			assessmentSpecificationCacheModel.assessmentyear = null;
		}

		assessmentSpecificationCacheModel.evaluationperiod = getEvaluationperiod();

		String evaluationperiod = assessmentSpecificationCacheModel.evaluationperiod;

		if ((evaluationperiod != null) && (evaluationperiod.length() == 0)) {
			assessmentSpecificationCacheModel.evaluationperiod = null;
		}

		Date latestassessment = getLatestassessment();

		if (latestassessment != null) {
			assessmentSpecificationCacheModel.latestassessment = latestassessment.getTime();
		}
		else {
			assessmentSpecificationCacheModel.latestassessment = Long.MIN_VALUE;
		}

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			assessmentSpecificationCacheModel.synchdate = synchdate.getTime();
		}
		else {
			assessmentSpecificationCacheModel.synchdate = Long.MIN_VALUE;
		}

		return assessmentSpecificationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", assessmenttype=");
		sb.append(getAssessmenttype());
		sb.append(", importercode=");
		sb.append(getImportercode());
		sb.append(", inspectorcontactcode=");
		sb.append(getInspectorcontactcode());
		sb.append(", productioncode=");
		sb.append(getProductioncode());
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
		sb.append(", specificationvalue=");
		sb.append(getSpecificationvalue());
		sb.append(", specificationdescription=");
		sb.append(getSpecificationdescription());
		sb.append(", assessmentcoefficient=");
		sb.append(getAssessmentcoefficient());
		sb.append(", assessmentindex=");
		sb.append(getAssessmentindex());
		sb.append(", assessmentmark=");
		sb.append(getAssessmentmark());
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
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification");
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
			"<column><column-name>importercode</column-name><column-value><![CDATA[");
		sb.append(getImportercode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorcontactcode</column-name><column-value><![CDATA[");
		sb.append(getInspectorcontactcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productioncode</column-name><column-value><![CDATA[");
		sb.append(getProductioncode());
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
			"<column><column-name>specificationvalue</column-name><column-value><![CDATA[");
		sb.append(getSpecificationvalue());
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
			"<column><column-name>assessmentindex</column-name><column-value><![CDATA[");
		sb.append(getAssessmentindex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentmark</column-name><column-value><![CDATA[");
		sb.append(getAssessmentmark());
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

	private static ClassLoader _classLoader = AssessmentSpecification.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			AssessmentSpecification.class
		};
	private long _id;
	private String _assessmenttype;
	private String _importercode;
	private String _originalImportercode;
	private String _inspectorcontactcode;
	private String _originalInspectorcontactcode;
	private String _productioncode;
	private String _originalProductioncode;
	private String _specificationcategory;
	private String _specificationgroupcode;
	private String _originalSpecificationgroupcode;
	private int _specificationsequence;
	private String _specificationcode;
	private String _originalSpecificationcode;
	private String _specificationname;
	private String _specificationvalue;
	private String _specificationdescription;
	private double _assessmentcoefficient;
	private double _assessmentindex;
	private double _assessmentmark;
	private String _assessmentid;
	private String _originalAssessmentid;
	private String _assessmentyear;
	private String _originalAssessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
	private long _columnBitmask;
	private AssessmentSpecification _escapedModel;
}