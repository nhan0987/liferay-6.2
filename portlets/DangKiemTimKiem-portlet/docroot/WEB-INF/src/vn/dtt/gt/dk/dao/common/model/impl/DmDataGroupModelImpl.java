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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.DmDataGroup;
import vn.dtt.gt.dk.dao.common.model.DmDataGroupModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DmDataGroup service. Represents a row in the &quot;dm_datagroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.common.model.DmDataGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmDataGroupImpl}.
 * </p>
 *
 * @author win_64
 * @see DmDataGroupImpl
 * @see vn.dtt.gt.dk.dao.common.model.DmDataGroup
 * @see vn.dtt.gt.dk.dao.common.model.DmDataGroupModel
 * @generated
 */
public class DmDataGroupModelImpl extends BaseModelImpl<DmDataGroup>
	implements DmDataGroupModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm data group model instance should use the {@link vn.dtt.gt.dk.dao.common.model.DmDataGroup} interface instead.
	 */
	public static final String TABLE_NAME = "dm_datagroup";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "code", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table dm_datagroup (id LONG not null primary key,code VARCHAR(75) null,name VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table dm_datagroup";
	public static final String ORDER_BY_JPQL = " ORDER BY dmDataGroup.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dm_datagroup.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.common.model.DmDataGroup"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.common.model.DmDataGroup"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.common.model.DmDataGroup"),
			true);
	public static long CODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.common.model.DmDataGroup"));

	public DmDataGroupModelImpl() {
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
		return DmDataGroup.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Code", getCode());
		attributes.put("Name", getName());
		attributes.put("Description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Code = (String)attributes.get("Code");

		if (Code != null) {
			setCode(Code);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_columnBitmask = -1L;

		_Id = Id;
	}

	@Override
	public String getCode() {
		if (_Code == null) {
			return StringPool.BLANK;
		}
		else {
			return _Code;
		}
	}

	@Override
	public void setCode(String Code) {
		_columnBitmask |= CODE_COLUMN_BITMASK;

		if (_originalCode == null) {
			_originalCode = _Code;
		}

		_Code = Code;
	}

	public String getOriginalCode() {
		return GetterUtil.getString(_originalCode);
	}

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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DmDataGroup.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DmDataGroup toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DmDataGroup)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DmDataGroupImpl dmDataGroupImpl = new DmDataGroupImpl();

		dmDataGroupImpl.setId(getId());
		dmDataGroupImpl.setCode(getCode());
		dmDataGroupImpl.setName(getName());
		dmDataGroupImpl.setDescription(getDescription());

		dmDataGroupImpl.resetOriginalValues();

		return dmDataGroupImpl;
	}

	@Override
	public int compareTo(DmDataGroup dmDataGroup) {
		int value = 0;

		if (getId() < dmDataGroup.getId()) {
			value = -1;
		}
		else if (getId() > dmDataGroup.getId()) {
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

		if (!(obj instanceof DmDataGroup)) {
			return false;
		}

		DmDataGroup dmDataGroup = (DmDataGroup)obj;

		long primaryKey = dmDataGroup.getPrimaryKey();

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
		DmDataGroupModelImpl dmDataGroupModelImpl = this;

		dmDataGroupModelImpl._originalCode = dmDataGroupModelImpl._Code;

		dmDataGroupModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmDataGroup> toCacheModel() {
		DmDataGroupCacheModel dmDataGroupCacheModel = new DmDataGroupCacheModel();

		dmDataGroupCacheModel.Id = getId();

		dmDataGroupCacheModel.Code = getCode();

		String Code = dmDataGroupCacheModel.Code;

		if ((Code != null) && (Code.length() == 0)) {
			dmDataGroupCacheModel.Code = null;
		}

		dmDataGroupCacheModel.Name = getName();

		String Name = dmDataGroupCacheModel.Name;

		if ((Name != null) && (Name.length() == 0)) {
			dmDataGroupCacheModel.Name = null;
		}

		dmDataGroupCacheModel.Description = getDescription();

		String Description = dmDataGroupCacheModel.Description;

		if ((Description != null) && (Description.length() == 0)) {
			dmDataGroupCacheModel.Description = null;
		}

		return dmDataGroupCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Code=");
		sb.append(getCode());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.common.model.DmDataGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmDataGroup.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DmDataGroup.class
		};
	private long _Id;
	private String _Code;
	private String _originalCode;
	private String _Name;
	private String _Description;
	private long _columnBitmask;
	private DmDataGroup _escapedModel;
}