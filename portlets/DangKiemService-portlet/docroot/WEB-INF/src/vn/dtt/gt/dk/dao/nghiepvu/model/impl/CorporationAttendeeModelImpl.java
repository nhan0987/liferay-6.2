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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendeeModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendeeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CorporationAttendee service. Represents a row in the &quot;vr_corporation_attendee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CorporationAttendeeImpl}.
 * </p>
 *
 * @author huymq
 * @see CorporationAttendeeImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendeeModel
 * @generated
 */
@JSON(strict = true)
public class CorporationAttendeeModelImpl extends BaseModelImpl<CorporationAttendee>
	implements CorporationAttendeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a corporation attendee model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee} interface instead.
	 */
	public static final String TABLE_NAME = "vr_corporation_attendee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "ConfirmedInspectionId", Types.BIGINT },
			{ "sequence", Types.BIGINT },
			{ "inspectorId", Types.BIGINT },
			{ "inspectorName", Types.VARCHAR },
			{ "inspectorrole", Types.BIGINT },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_corporation_attendee (id LONG not null primary key,ConfirmedInspectionId LONG,sequence LONG,inspectorId LONG,inspectorName VARCHAR(75) null,inspectorrole LONG,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_corporation_attendee";
	public static final String ORDER_BY_JPQL = " ORDER BY corporationAttendee.id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_corporation_attendee.id DESC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"),
			true);
	public static long CONFIRMEDINSPECTIONID_COLUMN_BITMASK = 1L;
	public static long INSPECTORROLE_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CorporationAttendee toModel(CorporationAttendeeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CorporationAttendee model = new CorporationAttendeeImpl();

		model.setId(soapModel.getId());
		model.setConfirmedInspectionId(soapModel.getConfirmedInspectionId());
		model.setSequence(soapModel.getSequence());
		model.setInspectorid(soapModel.getInspectorid());
		model.setInspectorName(soapModel.getInspectorName());
		model.setInspectorRole(soapModel.getInspectorRole());
		model.setSynchdate(soapModel.getSynchdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CorporationAttendee> toModels(
		CorporationAttendeeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CorporationAttendee> models = new ArrayList<CorporationAttendee>(soapModels.length);

		for (CorporationAttendeeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"));

	public CorporationAttendeeModelImpl() {
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
		return CorporationAttendee.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationAttendee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("sequence", getSequence());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorRole", getInspectorRole());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long sequence = (Long)attributes.get("sequence");

		if (sequence != null) {
			setSequence(sequence);
		}

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		Long inspectorRole = (Long)attributes.get("inspectorRole");

		if (inspectorRole != null) {
			setInspectorRole(inspectorRole);
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
	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_columnBitmask |= CONFIRMEDINSPECTIONID_COLUMN_BITMASK;

		if (!_setOriginalConfirmedInspectionId) {
			_setOriginalConfirmedInspectionId = true;

			_originalConfirmedInspectionId = _confirmedInspectionId;
		}

		_confirmedInspectionId = confirmedInspectionId;
	}

	public long getOriginalConfirmedInspectionId() {
		return _originalConfirmedInspectionId;
	}

	@JSON
	@Override
	public long getSequence() {
		return _sequence;
	}

	@Override
	public void setSequence(long sequence) {
		_sequence = sequence;
	}

	@JSON
	@Override
	public long getInspectorid() {
		return _inspectorid;
	}

	@Override
	public void setInspectorid(long inspectorid) {
		_inspectorid = inspectorid;
	}

	@JSON
	@Override
	public String getInspectorName() {
		if (_inspectorName == null) {
			return StringPool.BLANK;
		}
		else {
			return _inspectorName;
		}
	}

	@Override
	public void setInspectorName(String inspectorName) {
		_inspectorName = inspectorName;
	}

	@JSON
	@Override
	public long getInspectorRole() {
		return _inspectorRole;
	}

	@Override
	public void setInspectorRole(long inspectorRole) {
		_columnBitmask |= INSPECTORROLE_COLUMN_BITMASK;

		if (!_setOriginalInspectorRole) {
			_setOriginalInspectorRole = true;

			_originalInspectorRole = _inspectorRole;
		}

		_inspectorRole = inspectorRole;
	}

	public long getOriginalInspectorRole() {
		return _originalInspectorRole;
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
			CorporationAttendee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CorporationAttendee toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CorporationAttendee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CorporationAttendeeImpl corporationAttendeeImpl = new CorporationAttendeeImpl();

		corporationAttendeeImpl.setId(getId());
		corporationAttendeeImpl.setConfirmedInspectionId(getConfirmedInspectionId());
		corporationAttendeeImpl.setSequence(getSequence());
		corporationAttendeeImpl.setInspectorid(getInspectorid());
		corporationAttendeeImpl.setInspectorName(getInspectorName());
		corporationAttendeeImpl.setInspectorRole(getInspectorRole());
		corporationAttendeeImpl.setSynchdate(getSynchdate());

		corporationAttendeeImpl.resetOriginalValues();

		return corporationAttendeeImpl;
	}

	@Override
	public int compareTo(CorporationAttendee corporationAttendee) {
		int value = 0;

		if (getId() < corporationAttendee.getId()) {
			value = -1;
		}
		else if (getId() > corporationAttendee.getId()) {
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

		if (!(obj instanceof CorporationAttendee)) {
			return false;
		}

		CorporationAttendee corporationAttendee = (CorporationAttendee)obj;

		long primaryKey = corporationAttendee.getPrimaryKey();

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
		CorporationAttendeeModelImpl corporationAttendeeModelImpl = this;

		corporationAttendeeModelImpl._originalConfirmedInspectionId = corporationAttendeeModelImpl._confirmedInspectionId;

		corporationAttendeeModelImpl._setOriginalConfirmedInspectionId = false;

		corporationAttendeeModelImpl._originalInspectorRole = corporationAttendeeModelImpl._inspectorRole;

		corporationAttendeeModelImpl._setOriginalInspectorRole = false;

		corporationAttendeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CorporationAttendee> toCacheModel() {
		CorporationAttendeeCacheModel corporationAttendeeCacheModel = new CorporationAttendeeCacheModel();

		corporationAttendeeCacheModel.id = getId();

		corporationAttendeeCacheModel.confirmedInspectionId = getConfirmedInspectionId();

		corporationAttendeeCacheModel.sequence = getSequence();

		corporationAttendeeCacheModel.inspectorid = getInspectorid();

		corporationAttendeeCacheModel.inspectorName = getInspectorName();

		String inspectorName = corporationAttendeeCacheModel.inspectorName;

		if ((inspectorName != null) && (inspectorName.length() == 0)) {
			corporationAttendeeCacheModel.inspectorName = null;
		}

		corporationAttendeeCacheModel.inspectorRole = getInspectorRole();

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			corporationAttendeeCacheModel.synchdate = synchdate.getTime();
		}
		else {
			corporationAttendeeCacheModel.synchdate = Long.MIN_VALUE;
		}

		return corporationAttendeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", sequence=");
		sb.append(getSequence());
		sb.append(", inspectorid=");
		sb.append(getInspectorid());
		sb.append(", inspectorName=");
		sb.append(getInspectorName());
		sb.append(", inspectorRole=");
		sb.append(getInspectorRole());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedInspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequence</column-name><column-value><![CDATA[");
		sb.append(getSequence());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorid</column-name><column-value><![CDATA[");
		sb.append(getInspectorid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorName</column-name><column-value><![CDATA[");
		sb.append(getInspectorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorRole</column-name><column-value><![CDATA[");
		sb.append(getInspectorRole());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CorporationAttendee.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CorporationAttendee.class
		};
	private long _id;
	private long _confirmedInspectionId;
	private long _originalConfirmedInspectionId;
	private boolean _setOriginalConfirmedInspectionId;
	private long _sequence;
	private long _inspectorid;
	private String _inspectorName;
	private long _inspectorRole;
	private long _originalInspectorRole;
	private boolean _setOriginalInspectorRole;
	private Date _synchdate;
	private long _columnBitmask;
	private CorporationAttendee _escapedModel;
}