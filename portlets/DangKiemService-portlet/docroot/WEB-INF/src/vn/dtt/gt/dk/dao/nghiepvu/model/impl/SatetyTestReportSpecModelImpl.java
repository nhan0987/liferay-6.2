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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpecModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SatetyTestReportSpec service. Represents a row in the &quot;vr_satetytestreportspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpecModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SatetyTestReportSpecImpl}.
 * </p>
 *
 * @author huymq
 * @see SatetyTestReportSpecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpecModel
 * @generated
 */
public class SatetyTestReportSpecModelImpl extends BaseModelImpl<SatetyTestReportSpec>
	implements SatetyTestReportSpecModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a satety test report spec model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec} interface instead.
	 */
	public static final String TABLE_NAME = "vr_satetytestreportspec";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "saftytestreportid", Types.BIGINT },
			{ "specificationcode", Types.VARCHAR },
			{ "specificationname", Types.VARCHAR },
			{ "specificationvalue", Types.VARCHAR },
			{ "evaluationresult", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_satetytestreportspec (id LONG not null primary key,saftytestreportid LONG,specificationcode VARCHAR(75) null,specificationname VARCHAR(75) null,specificationvalue VARCHAR(75) null,evaluationresult LONG)";
	public static final String TABLE_SQL_DROP = "drop table vr_satetytestreportspec";
	public static final String ORDER_BY_JPQL = " ORDER BY satetyTestReportSpec.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_satetytestreportspec.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec"),
			true);
	public static long SAFTYTESTREPORTID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec"));

	public SatetyTestReportSpecModelImpl() {
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
		return SatetyTestReportSpec.class;
	}

	@Override
	public String getModelClassName() {
		return SatetyTestReportSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("saftyTestReportId", getSaftyTestReportId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("evaluationResult", getEvaluationResult());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long saftyTestReportId = (Long)attributes.get("saftyTestReportId");

		if (saftyTestReportId != null) {
			setSaftyTestReportId(saftyTestReportId);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specificationValue = (String)attributes.get("specificationValue");

		if (specificationValue != null) {
			setSpecificationValue(specificationValue);
		}

		Long evaluationResult = (Long)attributes.get("evaluationResult");

		if (evaluationResult != null) {
			setEvaluationResult(evaluationResult);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@Override
	public long getSaftyTestReportId() {
		return _saftyTestReportId;
	}

	@Override
	public void setSaftyTestReportId(long saftyTestReportId) {
		_columnBitmask |= SAFTYTESTREPORTID_COLUMN_BITMASK;

		if (!_setOriginalSaftyTestReportId) {
			_setOriginalSaftyTestReportId = true;

			_originalSaftyTestReportId = _saftyTestReportId;
		}

		_saftyTestReportId = saftyTestReportId;
	}

	public long getOriginalSaftyTestReportId() {
		return _originalSaftyTestReportId;
	}

	@Override
	public String getSpecificationCode() {
		if (_specificationCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationCode;
		}
	}

	@Override
	public void setSpecificationCode(String specificationCode) {
		_specificationCode = specificationCode;
	}

	@Override
	public String getSpecificationName() {
		if (_specificationName == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationName;
		}
	}

	@Override
	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;
	}

	@Override
	public String getSpecificationValue() {
		if (_specificationValue == null) {
			return StringPool.BLANK;
		}
		else {
			return _specificationValue;
		}
	}

	@Override
	public void setSpecificationValue(String specificationValue) {
		_specificationValue = specificationValue;
	}

	@Override
	public long getEvaluationResult() {
		return _evaluationResult;
	}

	@Override
	public void setEvaluationResult(long evaluationResult) {
		_evaluationResult = evaluationResult;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SatetyTestReportSpec.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SatetyTestReportSpec toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SatetyTestReportSpec)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SatetyTestReportSpecImpl satetyTestReportSpecImpl = new SatetyTestReportSpecImpl();

		satetyTestReportSpecImpl.setId(getId());
		satetyTestReportSpecImpl.setSaftyTestReportId(getSaftyTestReportId());
		satetyTestReportSpecImpl.setSpecificationCode(getSpecificationCode());
		satetyTestReportSpecImpl.setSpecificationName(getSpecificationName());
		satetyTestReportSpecImpl.setSpecificationValue(getSpecificationValue());
		satetyTestReportSpecImpl.setEvaluationResult(getEvaluationResult());

		satetyTestReportSpecImpl.resetOriginalValues();

		return satetyTestReportSpecImpl;
	}

	@Override
	public int compareTo(SatetyTestReportSpec satetyTestReportSpec) {
		int value = 0;

		if (getId() < satetyTestReportSpec.getId()) {
			value = -1;
		}
		else if (getId() > satetyTestReportSpec.getId()) {
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

		if (!(obj instanceof SatetyTestReportSpec)) {
			return false;
		}

		SatetyTestReportSpec satetyTestReportSpec = (SatetyTestReportSpec)obj;

		long primaryKey = satetyTestReportSpec.getPrimaryKey();

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
		SatetyTestReportSpecModelImpl satetyTestReportSpecModelImpl = this;

		satetyTestReportSpecModelImpl._originalSaftyTestReportId = satetyTestReportSpecModelImpl._saftyTestReportId;

		satetyTestReportSpecModelImpl._setOriginalSaftyTestReportId = false;

		satetyTestReportSpecModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SatetyTestReportSpec> toCacheModel() {
		SatetyTestReportSpecCacheModel satetyTestReportSpecCacheModel = new SatetyTestReportSpecCacheModel();

		satetyTestReportSpecCacheModel.id = getId();

		satetyTestReportSpecCacheModel.saftyTestReportId = getSaftyTestReportId();

		satetyTestReportSpecCacheModel.specificationCode = getSpecificationCode();

		String specificationCode = satetyTestReportSpecCacheModel.specificationCode;

		if ((specificationCode != null) && (specificationCode.length() == 0)) {
			satetyTestReportSpecCacheModel.specificationCode = null;
		}

		satetyTestReportSpecCacheModel.specificationName = getSpecificationName();

		String specificationName = satetyTestReportSpecCacheModel.specificationName;

		if ((specificationName != null) && (specificationName.length() == 0)) {
			satetyTestReportSpecCacheModel.specificationName = null;
		}

		satetyTestReportSpecCacheModel.specificationValue = getSpecificationValue();

		String specificationValue = satetyTestReportSpecCacheModel.specificationValue;

		if ((specificationValue != null) && (specificationValue.length() == 0)) {
			satetyTestReportSpecCacheModel.specificationValue = null;
		}

		satetyTestReportSpecCacheModel.evaluationResult = getEvaluationResult();

		return satetyTestReportSpecCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", saftyTestReportId=");
		sb.append(getSaftyTestReportId());
		sb.append(", specificationCode=");
		sb.append(getSpecificationCode());
		sb.append(", specificationName=");
		sb.append(getSpecificationName());
		sb.append(", specificationValue=");
		sb.append(getSpecificationValue());
		sb.append(", evaluationResult=");
		sb.append(getEvaluationResult());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>saftyTestReportId</column-name><column-value><![CDATA[");
		sb.append(getSaftyTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationCode</column-name><column-value><![CDATA[");
		sb.append(getSpecificationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationName</column-name><column-value><![CDATA[");
		sb.append(getSpecificationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationValue</column-name><column-value><![CDATA[");
		sb.append(getSpecificationValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluationResult</column-name><column-value><![CDATA[");
		sb.append(getEvaluationResult());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SatetyTestReportSpec.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SatetyTestReportSpec.class
		};
	private long _id;
	private long _saftyTestReportId;
	private long _originalSaftyTestReportId;
	private boolean _setOriginalSaftyTestReportId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _evaluationResult;
	private long _columnBitmask;
	private SatetyTestReportSpec _escapedModel;
}