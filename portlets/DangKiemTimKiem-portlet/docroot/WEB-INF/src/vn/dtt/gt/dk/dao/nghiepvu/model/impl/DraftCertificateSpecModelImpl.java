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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpecModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpecSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DraftCertificateSpec service. Represents a row in the &quot;vr_draftcertificatespec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpecModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DraftCertificateSpecImpl}.
 * </p>
 *
 * @author win_64
 * @see DraftCertificateSpecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpecModel
 * @generated
 */
@JSON(strict = true)
public class DraftCertificateSpecModelImpl extends BaseModelImpl<DraftCertificateSpec>
	implements DraftCertificateSpecModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a draft certificate spec model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec} interface instead.
	 */
	public static final String TABLE_NAME = "vr_draftcertificatespec";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "draftcertificateid", Types.BIGINT },
			{ "specificationcode", Types.VARCHAR },
			{ "specificationname", Types.VARCHAR },
			{ "specificationvalue", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_draftcertificatespec (id LONG not null primary key,draftcertificateid LONG,specificationcode VARCHAR(75) null,specificationname VARCHAR(75) null,specificationvalue VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table vr_draftcertificatespec";
	public static final String ORDER_BY_JPQL = " ORDER BY draftCertificateSpec.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_draftcertificatespec.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec"),
			true);
	public static long DRAFTCERTIFICATEID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DraftCertificateSpec toModel(
		DraftCertificateSpecSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DraftCertificateSpec model = new DraftCertificateSpecImpl();

		model.setId(soapModel.getId());
		model.setDraftCertificateId(soapModel.getDraftCertificateId());
		model.setSpecificationCode(soapModel.getSpecificationCode());
		model.setSpecificationName(soapModel.getSpecificationName());
		model.setSpecificationValue(soapModel.getSpecificationValue());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DraftCertificateSpec> toModels(
		DraftCertificateSpecSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DraftCertificateSpec> models = new ArrayList<DraftCertificateSpec>(soapModels.length);

		for (DraftCertificateSpecSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec"));

	public DraftCertificateSpecModelImpl() {
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
		return DraftCertificateSpec.class;
	}

	@Override
	public String getModelClassName() {
		return DraftCertificateSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("draftCertificateId", getDraftCertificateId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long draftCertificateId = (Long)attributes.get("draftCertificateId");

		if (draftCertificateId != null) {
			setDraftCertificateId(draftCertificateId);
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
	public long getDraftCertificateId() {
		return _draftCertificateId;
	}

	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_columnBitmask |= DRAFTCERTIFICATEID_COLUMN_BITMASK;

		if (!_setOriginalDraftCertificateId) {
			_setOriginalDraftCertificateId = true;

			_originalDraftCertificateId = _draftCertificateId;
		}

		_draftCertificateId = draftCertificateId;
	}

	public long getOriginalDraftCertificateId() {
		return _originalDraftCertificateId;
	}

	@JSON
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

	@JSON
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

	@JSON
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DraftCertificateSpec.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DraftCertificateSpec toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DraftCertificateSpec)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DraftCertificateSpecImpl draftCertificateSpecImpl = new DraftCertificateSpecImpl();

		draftCertificateSpecImpl.setId(getId());
		draftCertificateSpecImpl.setDraftCertificateId(getDraftCertificateId());
		draftCertificateSpecImpl.setSpecificationCode(getSpecificationCode());
		draftCertificateSpecImpl.setSpecificationName(getSpecificationName());
		draftCertificateSpecImpl.setSpecificationValue(getSpecificationValue());

		draftCertificateSpecImpl.resetOriginalValues();

		return draftCertificateSpecImpl;
	}

	@Override
	public int compareTo(DraftCertificateSpec draftCertificateSpec) {
		int value = 0;

		if (getId() < draftCertificateSpec.getId()) {
			value = -1;
		}
		else if (getId() > draftCertificateSpec.getId()) {
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

		if (!(obj instanceof DraftCertificateSpec)) {
			return false;
		}

		DraftCertificateSpec draftCertificateSpec = (DraftCertificateSpec)obj;

		long primaryKey = draftCertificateSpec.getPrimaryKey();

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
		DraftCertificateSpecModelImpl draftCertificateSpecModelImpl = this;

		draftCertificateSpecModelImpl._originalDraftCertificateId = draftCertificateSpecModelImpl._draftCertificateId;

		draftCertificateSpecModelImpl._setOriginalDraftCertificateId = false;

		draftCertificateSpecModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DraftCertificateSpec> toCacheModel() {
		DraftCertificateSpecCacheModel draftCertificateSpecCacheModel = new DraftCertificateSpecCacheModel();

		draftCertificateSpecCacheModel.id = getId();

		draftCertificateSpecCacheModel.draftCertificateId = getDraftCertificateId();

		draftCertificateSpecCacheModel.specificationCode = getSpecificationCode();

		String specificationCode = draftCertificateSpecCacheModel.specificationCode;

		if ((specificationCode != null) && (specificationCode.length() == 0)) {
			draftCertificateSpecCacheModel.specificationCode = null;
		}

		draftCertificateSpecCacheModel.specificationName = getSpecificationName();

		String specificationName = draftCertificateSpecCacheModel.specificationName;

		if ((specificationName != null) && (specificationName.length() == 0)) {
			draftCertificateSpecCacheModel.specificationName = null;
		}

		draftCertificateSpecCacheModel.specificationValue = getSpecificationValue();

		String specificationValue = draftCertificateSpecCacheModel.specificationValue;

		if ((specificationValue != null) && (specificationValue.length() == 0)) {
			draftCertificateSpecCacheModel.specificationValue = null;
		}

		return draftCertificateSpecCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", draftCertificateId=");
		sb.append(getDraftCertificateId());
		sb.append(", specificationCode=");
		sb.append(getSpecificationCode());
		sb.append(", specificationName=");
		sb.append(getSpecificationName());
		sb.append(", specificationValue=");
		sb.append(getSpecificationValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>draftCertificateId</column-name><column-value><![CDATA[");
		sb.append(getDraftCertificateId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DraftCertificateSpec.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DraftCertificateSpec.class
		};
	private long _id;
	private long _draftCertificateId;
	private long _originalDraftCertificateId;
	private boolean _setOriginalDraftCertificateId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _columnBitmask;
	private DraftCertificateSpec _escapedModel;
}