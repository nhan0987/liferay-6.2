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

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CfgTechnicalspec service. Represents a row in the &quot;vr_cfg_technicalspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CfgTechnicalspecImpl}.
 * </p>
 *
 * @author win_64
 * @see CfgTechnicalspecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecModel
 * @generated
 */
@JSON(strict = true)
public class CfgTechnicalspecModelImpl extends BaseModelImpl<CfgTechnicalspec>
	implements CfgTechnicalspecModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cfg technicalspec model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec} interface instead.
	 */
	public static final String TABLE_NAME = "vr_cfg_technicalspec";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "vehicletypecode", Types.VARCHAR },
			{ "vehicletypename", Types.VARCHAR },
			{ "sequenceno", Types.BIGINT },
			{ "specificationcode", Types.VARCHAR },
			{ "specificationname", Types.VARCHAR },
			{ "spec_description", Types.VARCHAR },
			{ "spec_category", Types.VARCHAR },
			{ "specificationgroup", Types.BIGINT },
			{ "searching_included", Types.BIGINT },
			{ "reference_included", Types.BIGINT },
			{ "certificate_included", Types.BIGINT },
			{ "datagroupid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_cfg_technicalspec (id LONG not null primary key,vehicletypecode VARCHAR(75) null,vehicletypename VARCHAR(75) null,sequenceno LONG,specificationcode VARCHAR(75) null,specificationname VARCHAR(75) null,spec_description VARCHAR(75) null,spec_category VARCHAR(75) null,specificationgroup LONG,searching_included LONG,reference_included LONG,certificate_included LONG,datagroupid LONG)";
	public static final String TABLE_SQL_DROP = "drop table vr_cfg_technicalspec";
	public static final String ORDER_BY_JPQL = " ORDER BY cfgTechnicalspec.id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_cfg_technicalspec.id DESC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec"),
			true);
	public static long SPECIFICATIONCODE_COLUMN_BITMASK = 1L;
	public static long VEHICLETYPECODE_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CfgTechnicalspec toModel(CfgTechnicalspecSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CfgTechnicalspec model = new CfgTechnicalspecImpl();

		model.setId(soapModel.getId());
		model.setVehicleTypeCode(soapModel.getVehicleTypeCode());
		model.setVehicleTypeName(soapModel.getVehicleTypeName());
		model.setSequenceno(soapModel.getSequenceno());
		model.setSpecificationCode(soapModel.getSpecificationCode());
		model.setSpecificationName(soapModel.getSpecificationName());
		model.setSpecDescription(soapModel.getSpecDescription());
		model.setSpecCategory(soapModel.getSpecCategory());
		model.setSpecificationGroup(soapModel.getSpecificationGroup());
		model.setSearchingIncluded(soapModel.getSearchingIncluded());
		model.setReferenceIncluded(soapModel.getReferenceIncluded());
		model.setCertificateIncluded(soapModel.getCertificateIncluded());
		model.setDatagroupid(soapModel.getDatagroupid());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CfgTechnicalspec> toModels(
		CfgTechnicalspecSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CfgTechnicalspec> models = new ArrayList<CfgTechnicalspec>(soapModels.length);

		for (CfgTechnicalspecSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec"));

	public CfgTechnicalspecModelImpl() {
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
		return CfgTechnicalspec.class;
	}

	@Override
	public String getModelClassName() {
		return CfgTechnicalspec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleTypeCode", getVehicleTypeCode());
		attributes.put("vehicleTypeName", getVehicleTypeName());
		attributes.put("sequenceno", getSequenceno());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specDescription", getSpecDescription());
		attributes.put("specCategory", getSpecCategory());
		attributes.put("specificationGroup", getSpecificationGroup());
		attributes.put("searchingIncluded", getSearchingIncluded());
		attributes.put("referenceIncluded", getReferenceIncluded());
		attributes.put("certificateIncluded", getCertificateIncluded());
		attributes.put("datagroupid", getDatagroupid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicleTypeCode = (String)attributes.get("vehicleTypeCode");

		if (vehicleTypeCode != null) {
			setVehicleTypeCode(vehicleTypeCode);
		}

		String vehicleTypeName = (String)attributes.get("vehicleTypeName");

		if (vehicleTypeName != null) {
			setVehicleTypeName(vehicleTypeName);
		}

		Long sequenceno = (Long)attributes.get("sequenceno");

		if (sequenceno != null) {
			setSequenceno(sequenceno);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specDescription = (String)attributes.get("specDescription");

		if (specDescription != null) {
			setSpecDescription(specDescription);
		}

		String specCategory = (String)attributes.get("specCategory");

		if (specCategory != null) {
			setSpecCategory(specCategory);
		}

		Long specificationGroup = (Long)attributes.get("specificationGroup");

		if (specificationGroup != null) {
			setSpecificationGroup(specificationGroup);
		}

		Long searchingIncluded = (Long)attributes.get("searchingIncluded");

		if (searchingIncluded != null) {
			setSearchingIncluded(searchingIncluded);
		}

		Long referenceIncluded = (Long)attributes.get("referenceIncluded");

		if (referenceIncluded != null) {
			setReferenceIncluded(referenceIncluded);
		}

		Long certificateIncluded = (Long)attributes.get("certificateIncluded");

		if (certificateIncluded != null) {
			setCertificateIncluded(certificateIncluded);
		}

		Long datagroupid = (Long)attributes.get("datagroupid");

		if (datagroupid != null) {
			setDatagroupid(datagroupid);
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
	public String getVehicleTypeCode() {
		if (_vehicleTypeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleTypeCode;
		}
	}

	@Override
	public void setVehicleTypeCode(String vehicleTypeCode) {
		_columnBitmask |= VEHICLETYPECODE_COLUMN_BITMASK;

		if (_originalVehicleTypeCode == null) {
			_originalVehicleTypeCode = _vehicleTypeCode;
		}

		_vehicleTypeCode = vehicleTypeCode;
	}

	public String getOriginalVehicleTypeCode() {
		return GetterUtil.getString(_originalVehicleTypeCode);
	}

	@JSON
	@Override
	public String getVehicleTypeName() {
		if (_vehicleTypeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleTypeName;
		}
	}

	@Override
	public void setVehicleTypeName(String vehicleTypeName) {
		_vehicleTypeName = vehicleTypeName;
	}

	@JSON
	@Override
	public long getSequenceno() {
		return _sequenceno;
	}

	@Override
	public void setSequenceno(long sequenceno) {
		_sequenceno = sequenceno;
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
		_columnBitmask |= SPECIFICATIONCODE_COLUMN_BITMASK;

		if (_originalSpecificationCode == null) {
			_originalSpecificationCode = _specificationCode;
		}

		_specificationCode = specificationCode;
	}

	public String getOriginalSpecificationCode() {
		return GetterUtil.getString(_originalSpecificationCode);
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
	public String getSpecDescription() {
		if (_specDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _specDescription;
		}
	}

	@Override
	public void setSpecDescription(String specDescription) {
		_specDescription = specDescription;
	}

	@JSON
	@Override
	public String getSpecCategory() {
		if (_specCategory == null) {
			return StringPool.BLANK;
		}
		else {
			return _specCategory;
		}
	}

	@Override
	public void setSpecCategory(String specCategory) {
		_specCategory = specCategory;
	}

	@JSON
	@Override
	public long getSpecificationGroup() {
		return _specificationGroup;
	}

	@Override
	public void setSpecificationGroup(long specificationGroup) {
		_specificationGroup = specificationGroup;
	}

	@JSON
	@Override
	public long getSearchingIncluded() {
		return _searchingIncluded;
	}

	@Override
	public void setSearchingIncluded(long searchingIncluded) {
		_searchingIncluded = searchingIncluded;
	}

	@JSON
	@Override
	public long getReferenceIncluded() {
		return _referenceIncluded;
	}

	@Override
	public void setReferenceIncluded(long referenceIncluded) {
		_referenceIncluded = referenceIncluded;
	}

	@JSON
	@Override
	public long getCertificateIncluded() {
		return _certificateIncluded;
	}

	@Override
	public void setCertificateIncluded(long certificateIncluded) {
		_certificateIncluded = certificateIncluded;
	}

	@JSON
	@Override
	public long getDatagroupid() {
		return _datagroupid;
	}

	@Override
	public void setDatagroupid(long datagroupid) {
		_datagroupid = datagroupid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CfgTechnicalspec.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CfgTechnicalspec toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CfgTechnicalspec)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CfgTechnicalspecImpl cfgTechnicalspecImpl = new CfgTechnicalspecImpl();

		cfgTechnicalspecImpl.setId(getId());
		cfgTechnicalspecImpl.setVehicleTypeCode(getVehicleTypeCode());
		cfgTechnicalspecImpl.setVehicleTypeName(getVehicleTypeName());
		cfgTechnicalspecImpl.setSequenceno(getSequenceno());
		cfgTechnicalspecImpl.setSpecificationCode(getSpecificationCode());
		cfgTechnicalspecImpl.setSpecificationName(getSpecificationName());
		cfgTechnicalspecImpl.setSpecDescription(getSpecDescription());
		cfgTechnicalspecImpl.setSpecCategory(getSpecCategory());
		cfgTechnicalspecImpl.setSpecificationGroup(getSpecificationGroup());
		cfgTechnicalspecImpl.setSearchingIncluded(getSearchingIncluded());
		cfgTechnicalspecImpl.setReferenceIncluded(getReferenceIncluded());
		cfgTechnicalspecImpl.setCertificateIncluded(getCertificateIncluded());
		cfgTechnicalspecImpl.setDatagroupid(getDatagroupid());

		cfgTechnicalspecImpl.resetOriginalValues();

		return cfgTechnicalspecImpl;
	}

	@Override
	public int compareTo(CfgTechnicalspec cfgTechnicalspec) {
		int value = 0;

		if (getId() < cfgTechnicalspec.getId()) {
			value = -1;
		}
		else if (getId() > cfgTechnicalspec.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof CfgTechnicalspec)) {
			return false;
		}

		CfgTechnicalspec cfgTechnicalspec = (CfgTechnicalspec)obj;

		long primaryKey = cfgTechnicalspec.getPrimaryKey();

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
		CfgTechnicalspecModelImpl cfgTechnicalspecModelImpl = this;

		cfgTechnicalspecModelImpl._originalVehicleTypeCode = cfgTechnicalspecModelImpl._vehicleTypeCode;

		cfgTechnicalspecModelImpl._originalSpecificationCode = cfgTechnicalspecModelImpl._specificationCode;

		cfgTechnicalspecModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CfgTechnicalspec> toCacheModel() {
		CfgTechnicalspecCacheModel cfgTechnicalspecCacheModel = new CfgTechnicalspecCacheModel();

		cfgTechnicalspecCacheModel.id = getId();

		cfgTechnicalspecCacheModel.vehicleTypeCode = getVehicleTypeCode();

		String vehicleTypeCode = cfgTechnicalspecCacheModel.vehicleTypeCode;

		if ((vehicleTypeCode != null) && (vehicleTypeCode.length() == 0)) {
			cfgTechnicalspecCacheModel.vehicleTypeCode = null;
		}

		cfgTechnicalspecCacheModel.vehicleTypeName = getVehicleTypeName();

		String vehicleTypeName = cfgTechnicalspecCacheModel.vehicleTypeName;

		if ((vehicleTypeName != null) && (vehicleTypeName.length() == 0)) {
			cfgTechnicalspecCacheModel.vehicleTypeName = null;
		}

		cfgTechnicalspecCacheModel.sequenceno = getSequenceno();

		cfgTechnicalspecCacheModel.specificationCode = getSpecificationCode();

		String specificationCode = cfgTechnicalspecCacheModel.specificationCode;

		if ((specificationCode != null) && (specificationCode.length() == 0)) {
			cfgTechnicalspecCacheModel.specificationCode = null;
		}

		cfgTechnicalspecCacheModel.specificationName = getSpecificationName();

		String specificationName = cfgTechnicalspecCacheModel.specificationName;

		if ((specificationName != null) && (specificationName.length() == 0)) {
			cfgTechnicalspecCacheModel.specificationName = null;
		}

		cfgTechnicalspecCacheModel.specDescription = getSpecDescription();

		String specDescription = cfgTechnicalspecCacheModel.specDescription;

		if ((specDescription != null) && (specDescription.length() == 0)) {
			cfgTechnicalspecCacheModel.specDescription = null;
		}

		cfgTechnicalspecCacheModel.specCategory = getSpecCategory();

		String specCategory = cfgTechnicalspecCacheModel.specCategory;

		if ((specCategory != null) && (specCategory.length() == 0)) {
			cfgTechnicalspecCacheModel.specCategory = null;
		}

		cfgTechnicalspecCacheModel.specificationGroup = getSpecificationGroup();

		cfgTechnicalspecCacheModel.searchingIncluded = getSearchingIncluded();

		cfgTechnicalspecCacheModel.referenceIncluded = getReferenceIncluded();

		cfgTechnicalspecCacheModel.certificateIncluded = getCertificateIncluded();

		cfgTechnicalspecCacheModel.datagroupid = getDatagroupid();

		return cfgTechnicalspecCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleTypeCode=");
		sb.append(getVehicleTypeCode());
		sb.append(", vehicleTypeName=");
		sb.append(getVehicleTypeName());
		sb.append(", sequenceno=");
		sb.append(getSequenceno());
		sb.append(", specificationCode=");
		sb.append(getSpecificationCode());
		sb.append(", specificationName=");
		sb.append(getSpecificationName());
		sb.append(", specDescription=");
		sb.append(getSpecDescription());
		sb.append(", specCategory=");
		sb.append(getSpecCategory());
		sb.append(", specificationGroup=");
		sb.append(getSpecificationGroup());
		sb.append(", searchingIncluded=");
		sb.append(getSearchingIncluded());
		sb.append(", referenceIncluded=");
		sb.append(getReferenceIncluded());
		sb.append(", certificateIncluded=");
		sb.append(getCertificateIncluded());
		sb.append(", datagroupid=");
		sb.append(getDatagroupid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleTypeCode</column-name><column-value><![CDATA[");
		sb.append(getVehicleTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleTypeName</column-name><column-value><![CDATA[");
		sb.append(getVehicleTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceno</column-name><column-value><![CDATA[");
		sb.append(getSequenceno());
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
			"<column><column-name>specDescription</column-name><column-value><![CDATA[");
		sb.append(getSpecDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specCategory</column-name><column-value><![CDATA[");
		sb.append(getSpecCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationGroup</column-name><column-value><![CDATA[");
		sb.append(getSpecificationGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>searchingIncluded</column-name><column-value><![CDATA[");
		sb.append(getSearchingIncluded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>referenceIncluded</column-name><column-value><![CDATA[");
		sb.append(getReferenceIncluded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateIncluded</column-name><column-value><![CDATA[");
		sb.append(getCertificateIncluded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datagroupid</column-name><column-value><![CDATA[");
		sb.append(getDatagroupid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CfgTechnicalspec.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CfgTechnicalspec.class
		};
	private long _id;
	private String _vehicleTypeCode;
	private String _originalVehicleTypeCode;
	private String _vehicleTypeName;
	private long _sequenceno;
	private String _specificationCode;
	private String _originalSpecificationCode;
	private String _specificationName;
	private String _specDescription;
	private String _specCategory;
	private long _specificationGroup;
	private long _searchingIncluded;
	private long _referenceIncluded;
	private long _certificateIncluded;
	private long _datagroupid;
	private long _columnBitmask;
	private CfgTechnicalspec _escapedModel;
}