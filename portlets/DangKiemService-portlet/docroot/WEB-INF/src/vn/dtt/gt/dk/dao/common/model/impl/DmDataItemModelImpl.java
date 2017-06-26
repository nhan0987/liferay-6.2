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

package vn.dtt.gt.dk.dao.common.model.impl;

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

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.DmDataItemModel;
import vn.dtt.gt.dk.dao.common.model.DmDataItemSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DmDataItem service. Represents a row in the &quot;dm_dataitem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.DmDataItemModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmDataItemImpl}.
 * </p>
 *
 * @author huymq
 * @see DmDataItemImpl
 * @see vn.dtt.gt.dk.dao.common.model.DmDataItem
 * @see vn.dtt.gt.dk.dao.common.model.DmDataItemModel
 * @generated
 */
@JSON(strict = true)
public class DmDataItemModelImpl extends BaseModelImpl<DmDataItem>
	implements DmDataItemModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm data item model instance should use the {@link vn.dtt.gt.dk.dao.common.model.DmDataItem} interface instead.
	 */
	public static final String TABLE_NAME = "dm_dataitem";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "datagroupid", Types.BIGINT },
			{ "code_0", Types.VARCHAR },
			{ "code_1", Types.VARCHAR },
			{ "code_2", Types.VARCHAR },
			{ "code_3", Types.VARCHAR },
			{ "level", Types.INTEGER },
			{ "name", Types.VARCHAR },
			{ "altername", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "validatedfrom", Types.TIMESTAMP },
			{ "validatedto", Types.TIMESTAMP },
			{ "status", Types.INTEGER },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table dm_dataitem (id LONG not null primary key,datagroupid LONG,code_0 VARCHAR(75) null,code_1 VARCHAR(75) null,code_2 VARCHAR(75) null,code_3 VARCHAR(75) null,level INTEGER,name VARCHAR(75) null,altername VARCHAR(75) null,description VARCHAR(75) null,validatedfrom DATE null,validatedto DATE null,status INTEGER,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table dm_dataitem";
	public static final String ORDER_BY_JPQL = " ORDER BY dmDataItem.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dm_dataitem.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.DmDataItem"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.DmDataItem"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.common.model.DmDataItem"),
			true);
	public static long ALTERNAME_COLUMN_BITMASK = 1L;
	public static long CODE0_COLUMN_BITMASK = 2L;
	public static long DATAGROUPID_COLUMN_BITMASK = 4L;
	public static long LEVEL_COLUMN_BITMASK = 8L;
	public static long ID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DmDataItem toModel(DmDataItemSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DmDataItem model = new DmDataItemImpl();

		model.setId(soapModel.getId());
		model.setDataGroupId(soapModel.getDataGroupId());
		model.setCode0(soapModel.getCode0());
		model.setCode1(soapModel.getCode1());
		model.setCode2(soapModel.getCode2());
		model.setCode3(soapModel.getCode3());
		model.setLevel(soapModel.getLevel());
		model.setName(soapModel.getName());
		model.setAlterName(soapModel.getAlterName());
		model.setDescription(soapModel.getDescription());
		model.setValidatedFrom(soapModel.getValidatedFrom());
		model.setValidatedTo(soapModel.getValidatedTo());
		model.setStatus(soapModel.getStatus());
		model.setSynchdate(soapModel.getSynchdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DmDataItem> toModels(DmDataItemSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DmDataItem> models = new ArrayList<DmDataItem>(soapModels.length);

		for (DmDataItemSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.DmDataItem"));

	public DmDataItemModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("DataGroupId", getDataGroupId());
		attributes.put("Code0", getCode0());
		attributes.put("Code1", getCode1());
		attributes.put("Code2", getCode2());
		attributes.put("Code3", getCode3());
		attributes.put("Level", getLevel());
		attributes.put("Name", getName());
		attributes.put("AlterName", getAlterName());
		attributes.put("Description", getDescription());
		attributes.put("ValidatedFrom", getValidatedFrom());
		attributes.put("ValidatedTo", getValidatedTo());
		attributes.put("Status", getStatus());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Long DataGroupId = (Long)attributes.get("DataGroupId");

		if (DataGroupId != null) {
			setDataGroupId(DataGroupId);
		}

		String Code0 = (String)attributes.get("Code0");

		if (Code0 != null) {
			setCode0(Code0);
		}

		String Code1 = (String)attributes.get("Code1");

		if (Code1 != null) {
			setCode1(Code1);
		}

		String Code2 = (String)attributes.get("Code2");

		if (Code2 != null) {
			setCode2(Code2);
		}

		String Code3 = (String)attributes.get("Code3");

		if (Code3 != null) {
			setCode3(Code3);
		}

		Integer Level = (Integer)attributes.get("Level");

		if (Level != null) {
			setLevel(Level);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String AlterName = (String)attributes.get("AlterName");

		if (AlterName != null) {
			setAlterName(AlterName);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		Date ValidatedFrom = (Date)attributes.get("ValidatedFrom");

		if (ValidatedFrom != null) {
			setValidatedFrom(ValidatedFrom);
		}

		Date ValidatedTo = (Date)attributes.get("ValidatedTo");

		if (ValidatedTo != null) {
			setValidatedTo(ValidatedTo);
		}

		Integer Status = (Integer)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_columnBitmask = -1L;

		_Id = Id;
	}

	@JSON
	@Override
	public long getDataGroupId() {
		return _DataGroupId;
	}

	@Override
	public void setDataGroupId(long DataGroupId) {
		_columnBitmask |= DATAGROUPID_COLUMN_BITMASK;

		if (!_setOriginalDataGroupId) {
			_setOriginalDataGroupId = true;

			_originalDataGroupId = _DataGroupId;
		}

		_DataGroupId = DataGroupId;
	}

	public long getOriginalDataGroupId() {
		return _originalDataGroupId;
	}

	@JSON
	@Override
	public String getCode0() {
		if (_Code0 == null) {
			return StringPool.BLANK;
		}
		else {
			return _Code0;
		}
	}

	@Override
	public void setCode0(String Code0) {
		_columnBitmask |= CODE0_COLUMN_BITMASK;

		if (_originalCode0 == null) {
			_originalCode0 = _Code0;
		}

		_Code0 = Code0;
	}

	public String getOriginalCode0() {
		return GetterUtil.getString(_originalCode0);
	}

	@JSON
	@Override
	public String getCode1() {
		if (_Code1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _Code1;
		}
	}

	@Override
	public void setCode1(String Code1) {
		_Code1 = Code1;
	}

	@JSON
	@Override
	public String getCode2() {
		if (_Code2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _Code2;
		}
	}

	@Override
	public void setCode2(String Code2) {
		_Code2 = Code2;
	}

	@JSON
	@Override
	public String getCode3() {
		if (_Code3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _Code3;
		}
	}

	@Override
	public void setCode3(String Code3) {
		_Code3 = Code3;
	}

	@JSON
	@Override
	public int getLevel() {
		return _Level;
	}

	@Override
	public void setLevel(int Level) {
		_columnBitmask |= LEVEL_COLUMN_BITMASK;

		if (!_setOriginalLevel) {
			_setOriginalLevel = true;

			_originalLevel = _Level;
		}

		_Level = Level;
	}

	public int getOriginalLevel() {
		return _originalLevel;
	}

	@JSON
	@Override
	public String getName() {
		if (_Name == null) {
			return StringPool.BLANK;
		}
		else {
			return _Name;
		}
	}

	@Override
	public void setName(String Name) {
		_Name = Name;
	}

	@JSON
	@Override
	public String getAlterName() {
		if (_AlterName == null) {
			return StringPool.BLANK;
		}
		else {
			return _AlterName;
		}
	}

	@Override
	public void setAlterName(String AlterName) {
		_columnBitmask |= ALTERNAME_COLUMN_BITMASK;

		if (_originalAlterName == null) {
			_originalAlterName = _AlterName;
		}

		_AlterName = AlterName;
	}

	public String getOriginalAlterName() {
		return GetterUtil.getString(_originalAlterName);
	}

	@JSON
	@Override
	public String getDescription() {
		if (_Description == null) {
			return StringPool.BLANK;
		}
		else {
			return _Description;
		}
	}

	@Override
	public void setDescription(String Description) {
		_Description = Description;
	}

	@JSON
	@Override
	public Date getValidatedFrom() {
		return _ValidatedFrom;
	}

	@Override
	public void setValidatedFrom(Date ValidatedFrom) {
		_ValidatedFrom = ValidatedFrom;
	}

	@JSON
	@Override
	public Date getValidatedTo() {
		return _ValidatedTo;
	}

	@Override
	public void setValidatedTo(Date ValidatedTo) {
		_ValidatedTo = ValidatedTo;
	}

	@JSON
	@Override
	public int getStatus() {
		return _Status;
	}

	@Override
	public void setStatus(int Status) {
		_Status = Status;
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
			DmDataItem.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DmDataItem toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmDataItem)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setId(getId());
		dmDataItemImpl.setDataGroupId(getDataGroupId());
		dmDataItemImpl.setCode0(getCode0());
		dmDataItemImpl.setCode1(getCode1());
		dmDataItemImpl.setCode2(getCode2());
		dmDataItemImpl.setCode3(getCode3());
		dmDataItemImpl.setLevel(getLevel());
		dmDataItemImpl.setName(getName());
		dmDataItemImpl.setAlterName(getAlterName());
		dmDataItemImpl.setDescription(getDescription());
		dmDataItemImpl.setValidatedFrom(getValidatedFrom());
		dmDataItemImpl.setValidatedTo(getValidatedTo());
		dmDataItemImpl.setStatus(getStatus());
		dmDataItemImpl.setSynchdate(getSynchdate());

		dmDataItemImpl.resetOriginalValues();

		return dmDataItemImpl;
	}

	@Override
	public int compareTo(DmDataItem dmDataItem) {
		int value = 0;

		if (getId() < dmDataItem.getId()) {
			value = -1;
		}
		else if (getId() > dmDataItem.getId()) {
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

		if (!(obj instanceof DmDataItem)) {
			return false;
		}

		DmDataItem dmDataItem = (DmDataItem)obj;

		long primaryKey = dmDataItem.getPrimaryKey();

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
		DmDataItemModelImpl dmDataItemModelImpl = this;

		dmDataItemModelImpl._originalDataGroupId = dmDataItemModelImpl._DataGroupId;

		dmDataItemModelImpl._setOriginalDataGroupId = false;

		dmDataItemModelImpl._originalCode0 = dmDataItemModelImpl._Code0;

		dmDataItemModelImpl._originalLevel = dmDataItemModelImpl._Level;

		dmDataItemModelImpl._setOriginalLevel = false;

		dmDataItemModelImpl._originalAlterName = dmDataItemModelImpl._AlterName;

		dmDataItemModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmDataItem> toCacheModel() {
		DmDataItemCacheModel dmDataItemCacheModel = new DmDataItemCacheModel();

		dmDataItemCacheModel.Id = getId();

		dmDataItemCacheModel.DataGroupId = getDataGroupId();

		dmDataItemCacheModel.Code0 = getCode0();

		String Code0 = dmDataItemCacheModel.Code0;

		if ((Code0 != null) && (Code0.length() == 0)) {
			dmDataItemCacheModel.Code0 = null;
		}

		dmDataItemCacheModel.Code1 = getCode1();

		String Code1 = dmDataItemCacheModel.Code1;

		if ((Code1 != null) && (Code1.length() == 0)) {
			dmDataItemCacheModel.Code1 = null;
		}

		dmDataItemCacheModel.Code2 = getCode2();

		String Code2 = dmDataItemCacheModel.Code2;

		if ((Code2 != null) && (Code2.length() == 0)) {
			dmDataItemCacheModel.Code2 = null;
		}

		dmDataItemCacheModel.Code3 = getCode3();

		String Code3 = dmDataItemCacheModel.Code3;

		if ((Code3 != null) && (Code3.length() == 0)) {
			dmDataItemCacheModel.Code3 = null;
		}

		dmDataItemCacheModel.Level = getLevel();

		dmDataItemCacheModel.Name = getName();

		String Name = dmDataItemCacheModel.Name;

		if ((Name != null) && (Name.length() == 0)) {
			dmDataItemCacheModel.Name = null;
		}

		dmDataItemCacheModel.AlterName = getAlterName();

		String AlterName = dmDataItemCacheModel.AlterName;

		if ((AlterName != null) && (AlterName.length() == 0)) {
			dmDataItemCacheModel.AlterName = null;
		}

		dmDataItemCacheModel.Description = getDescription();

		String Description = dmDataItemCacheModel.Description;

		if ((Description != null) && (Description.length() == 0)) {
			dmDataItemCacheModel.Description = null;
		}

		Date ValidatedFrom = getValidatedFrom();

		if (ValidatedFrom != null) {
			dmDataItemCacheModel.ValidatedFrom = ValidatedFrom.getTime();
		}
		else {
			dmDataItemCacheModel.ValidatedFrom = Long.MIN_VALUE;
		}

		Date ValidatedTo = getValidatedTo();

		if (ValidatedTo != null) {
			dmDataItemCacheModel.ValidatedTo = ValidatedTo.getTime();
		}
		else {
			dmDataItemCacheModel.ValidatedTo = Long.MIN_VALUE;
		}

		dmDataItemCacheModel.Status = getStatus();

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			dmDataItemCacheModel.synchdate = synchdate.getTime();
		}
		else {
			dmDataItemCacheModel.synchdate = Long.MIN_VALUE;
		}

		return dmDataItemCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", DataGroupId=");
		sb.append(getDataGroupId());
		sb.append(", Code0=");
		sb.append(getCode0());
		sb.append(", Code1=");
		sb.append(getCode1());
		sb.append(", Code2=");
		sb.append(getCode2());
		sb.append(", Code3=");
		sb.append(getCode3());
		sb.append(", Level=");
		sb.append(getLevel());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", AlterName=");
		sb.append(getAlterName());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", ValidatedFrom=");
		sb.append(getValidatedFrom());
		sb.append(", ValidatedTo=");
		sb.append(getValidatedTo());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.DmDataItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DataGroupId</column-name><column-value><![CDATA[");
		sb.append(getDataGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code0</column-name><column-value><![CDATA[");
		sb.append(getCode0());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code1</column-name><column-value><![CDATA[");
		sb.append(getCode1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code2</column-name><column-value><![CDATA[");
		sb.append(getCode2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code3</column-name><column-value><![CDATA[");
		sb.append(getCode3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AlterName</column-name><column-value><![CDATA[");
		sb.append(getAlterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidatedFrom</column-name><column-value><![CDATA[");
		sb.append(getValidatedFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmDataItem.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmDataItem.class
		};
	private long _Id;
	private long _DataGroupId;
	private long _originalDataGroupId;
	private boolean _setOriginalDataGroupId;
	private String _Code0;
	private String _originalCode0;
	private String _Code1;
	private String _Code2;
	private String _Code3;
	private int _Level;
	private int _originalLevel;
	private boolean _setOriginalLevel;
	private String _Name;
	private String _AlterName;
	private String _originalAlterName;
	private String _Description;
	private Date _ValidatedFrom;
	private Date _ValidatedTo;
	private int _Status;
	private Date _synchdate;
	private long _columnBitmask;
	private DmDataItem _escapedModel;
}