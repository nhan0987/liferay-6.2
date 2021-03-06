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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttachModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttachSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the InspectionRecordAttach service. Represents a row in the &quot;vr_inspectionrecord_attach&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttachModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InspectionRecordAttachImpl}.
 * </p>
 *
 * @author huymq
 * @see InspectionRecordAttachImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttachModel
 * @generated
 */
@JSON(strict = true)
public class InspectionRecordAttachModelImpl extends BaseModelImpl<InspectionRecordAttach>
	implements InspectionRecordAttachModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a inspection record attach model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach} interface instead.
	 */
	public static final String TABLE_NAME = "vr_inspectionrecord_attach";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "inspectionrecordid", Types.BIGINT },
			{ "hosothutucid", Types.BIGINT },
			{ "entryid", Types.VARCHAR },
			{ "entryname", Types.VARCHAR },
			{ "inspectorid", Types.BIGINT },
			{ "uploadtime", Types.TIMESTAMP },
			{ "markupdelte", Types.INTEGER },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_inspectionrecord_attach (id LONG not null primary key,inspectionrecordid LONG,hosothutucid LONG,entryid VARCHAR(75) null,entryname VARCHAR(75) null,inspectorid LONG,uploadtime DATE null,markupdelte INTEGER,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_inspectionrecord_attach";
	public static final String ORDER_BY_JPQL = " ORDER BY inspectionRecordAttach.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_inspectionrecord_attach.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach"),
			true);
	public static long INSPECTIONRECORDID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static InspectionRecordAttach toModel(
		InspectionRecordAttachSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		InspectionRecordAttach model = new InspectionRecordAttachImpl();

		model.setId(soapModel.getId());
		model.setInspectionRecordId(soapModel.getInspectionRecordId());
		model.setHoSoThuTucId(soapModel.getHoSoThuTucId());
		model.setEnTryId(soapModel.getEnTryId());
		model.setEnTryName(soapModel.getEnTryName());
		model.setInspectorId(soapModel.getInspectorId());
		model.setUploadTime(soapModel.getUploadTime());
		model.setMarkUpDelte(soapModel.getMarkUpDelte());
		model.setSynchdate(soapModel.getSynchdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<InspectionRecordAttach> toModels(
		InspectionRecordAttachSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<InspectionRecordAttach> models = new ArrayList<InspectionRecordAttach>(soapModels.length);

		for (InspectionRecordAttachSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach"));

	public InspectionRecordAttachModelImpl() {
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
		return InspectionRecordAttach.class;
	}

	@Override
	public String getModelClassName() {
		return InspectionRecordAttach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("enTryId", getEnTryId());
		attributes.put("enTryName", getEnTryName());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("uploadTime", getUploadTime());
		attributes.put("markUpDelte", getMarkUpDelte());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		String enTryId = (String)attributes.get("enTryId");

		if (enTryId != null) {
			setEnTryId(enTryId);
		}

		String enTryName = (String)attributes.get("enTryName");

		if (enTryName != null) {
			setEnTryName(enTryName);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Date uploadTime = (Date)attributes.get("uploadTime");

		if (uploadTime != null) {
			setUploadTime(uploadTime);
		}

		Integer markUpDelte = (Integer)attributes.get("markUpDelte");

		if (markUpDelte != null) {
			setMarkUpDelte(markUpDelte);
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
	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_columnBitmask |= INSPECTIONRECORDID_COLUMN_BITMASK;

		if (!_setOriginalInspectionRecordId) {
			_setOriginalInspectionRecordId = true;

			_originalInspectionRecordId = _inspectionRecordId;
		}

		_inspectionRecordId = inspectionRecordId;
	}

	public long getOriginalInspectionRecordId() {
		return _originalInspectionRecordId;
	}

	@JSON
	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	@JSON
	@Override
	public String getEnTryId() {
		if (_enTryId == null) {
			return StringPool.BLANK;
		}
		else {
			return _enTryId;
		}
	}

	@Override
	public void setEnTryId(String enTryId) {
		_enTryId = enTryId;
	}

	@JSON
	@Override
	public String getEnTryName() {
		if (_enTryName == null) {
			return StringPool.BLANK;
		}
		else {
			return _enTryName;
		}
	}

	@Override
	public void setEnTryName(String enTryName) {
		_enTryName = enTryName;
	}

	@JSON
	@Override
	public long getInspectorId() {
		return _inspectorId;
	}

	@Override
	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	@JSON
	@Override
	public Date getUploadTime() {
		return _uploadTime;
	}

	@Override
	public void setUploadTime(Date uploadTime) {
		_uploadTime = uploadTime;
	}

	@JSON
	@Override
	public int getMarkUpDelte() {
		return _markUpDelte;
	}

	@Override
	public void setMarkUpDelte(int markUpDelte) {
		_markUpDelte = markUpDelte;
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
			InspectionRecordAttach.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public InspectionRecordAttach toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (InspectionRecordAttach)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InspectionRecordAttachImpl inspectionRecordAttachImpl = new InspectionRecordAttachImpl();

		inspectionRecordAttachImpl.setId(getId());
		inspectionRecordAttachImpl.setInspectionRecordId(getInspectionRecordId());
		inspectionRecordAttachImpl.setHoSoThuTucId(getHoSoThuTucId());
		inspectionRecordAttachImpl.setEnTryId(getEnTryId());
		inspectionRecordAttachImpl.setEnTryName(getEnTryName());
		inspectionRecordAttachImpl.setInspectorId(getInspectorId());
		inspectionRecordAttachImpl.setUploadTime(getUploadTime());
		inspectionRecordAttachImpl.setMarkUpDelte(getMarkUpDelte());
		inspectionRecordAttachImpl.setSynchdate(getSynchdate());

		inspectionRecordAttachImpl.resetOriginalValues();

		return inspectionRecordAttachImpl;
	}

	@Override
	public int compareTo(InspectionRecordAttach inspectionRecordAttach) {
		int value = 0;

		if (getId() < inspectionRecordAttach.getId()) {
			value = -1;
		}
		else if (getId() > inspectionRecordAttach.getId()) {
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

		if (!(obj instanceof InspectionRecordAttach)) {
			return false;
		}

		InspectionRecordAttach inspectionRecordAttach = (InspectionRecordAttach)obj;

		long primaryKey = inspectionRecordAttach.getPrimaryKey();

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
		InspectionRecordAttachModelImpl inspectionRecordAttachModelImpl = this;

		inspectionRecordAttachModelImpl._originalInspectionRecordId = inspectionRecordAttachModelImpl._inspectionRecordId;

		inspectionRecordAttachModelImpl._setOriginalInspectionRecordId = false;

		inspectionRecordAttachModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<InspectionRecordAttach> toCacheModel() {
		InspectionRecordAttachCacheModel inspectionRecordAttachCacheModel = new InspectionRecordAttachCacheModel();

		inspectionRecordAttachCacheModel.id = getId();

		inspectionRecordAttachCacheModel.inspectionRecordId = getInspectionRecordId();

		inspectionRecordAttachCacheModel.hoSoThuTucId = getHoSoThuTucId();

		inspectionRecordAttachCacheModel.enTryId = getEnTryId();

		String enTryId = inspectionRecordAttachCacheModel.enTryId;

		if ((enTryId != null) && (enTryId.length() == 0)) {
			inspectionRecordAttachCacheModel.enTryId = null;
		}

		inspectionRecordAttachCacheModel.enTryName = getEnTryName();

		String enTryName = inspectionRecordAttachCacheModel.enTryName;

		if ((enTryName != null) && (enTryName.length() == 0)) {
			inspectionRecordAttachCacheModel.enTryName = null;
		}

		inspectionRecordAttachCacheModel.inspectorId = getInspectorId();

		Date uploadTime = getUploadTime();

		if (uploadTime != null) {
			inspectionRecordAttachCacheModel.uploadTime = uploadTime.getTime();
		}
		else {
			inspectionRecordAttachCacheModel.uploadTime = Long.MIN_VALUE;
		}

		inspectionRecordAttachCacheModel.markUpDelte = getMarkUpDelte();

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			inspectionRecordAttachCacheModel.synchdate = synchdate.getTime();
		}
		else {
			inspectionRecordAttachCacheModel.synchdate = Long.MIN_VALUE;
		}

		return inspectionRecordAttachCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", enTryId=");
		sb.append(getEnTryId());
		sb.append(", enTryName=");
		sb.append(getEnTryName());
		sb.append(", inspectorId=");
		sb.append(getInspectorId());
		sb.append(", uploadTime=");
		sb.append(getUploadTime());
		sb.append(", markUpDelte=");
		sb.append(getMarkUpDelte());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enTryId</column-name><column-value><![CDATA[");
		sb.append(getEnTryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enTryName</column-name><column-value><![CDATA[");
		sb.append(getEnTryName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorId</column-name><column-value><![CDATA[");
		sb.append(getInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uploadTime</column-name><column-value><![CDATA[");
		sb.append(getUploadTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpDelte</column-name><column-value><![CDATA[");
		sb.append(getMarkUpDelte());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = InspectionRecordAttach.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			InspectionRecordAttach.class
		};
	private long _id;
	private long _inspectionRecordId;
	private long _originalInspectionRecordId;
	private boolean _setOriginalInspectionRecordId;
	private long _hoSoThuTucId;
	private String _enTryId;
	private String _enTryName;
	private long _inspectorId;
	private Date _uploadTime;
	private int _markUpDelte;
	private Date _synchdate;
	private long _columnBitmask;
	private InspectionRecordAttach _escapedModel;
}