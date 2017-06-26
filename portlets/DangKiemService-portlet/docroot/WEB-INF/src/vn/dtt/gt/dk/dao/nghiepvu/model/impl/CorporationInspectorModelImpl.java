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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspectorModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspectorSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CorporationInspector service. Represents a row in the &quot;vr_corporation_inspector&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspectorModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CorporationInspectorImpl}.
 * </p>
 *
 * @author huymq
 * @see CorporationInspectorImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspectorModel
 * @generated
 */
@JSON(strict = true)
public class CorporationInspectorModelImpl extends BaseModelImpl<CorporationInspector>
	implements CorporationInspectorModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a corporation inspector model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector} interface instead.
	 */
	public static final String TABLE_NAME = "vr_corporation_inspector";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "corporationid", Types.VARCHAR },
			{ "inspectorid", Types.BIGINT },
			{ "inspectorname", Types.VARCHAR },
			{ "inspectorphone", Types.VARCHAR },
			{ "inspectoremail", Types.VARCHAR },
			{ "contactcode", Types.VARCHAR },
			{ "regulartthc", Types.BIGINT },
			{ "teamid", Types.BIGINT },
			{ "markupteamleader", Types.INTEGER },
			{ "markupboss", Types.INTEGER },
			{ "place", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "filechukyid", Types.BIGINT },
			{ "synchdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_corporation_inspector (id LONG not null primary key,corporationid VARCHAR(75) null,inspectorid LONG,inspectorname VARCHAR(75) null,inspectorphone VARCHAR(75) null,inspectoremail VARCHAR(75) null,contactcode VARCHAR(75) null,regulartthc LONG,teamid LONG,markupteamleader INTEGER,markupboss INTEGER,place VARCHAR(75) null,title VARCHAR(75) null,filechukyid LONG,synchdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_corporation_inspector";
	public static final String ORDER_BY_JPQL = " ORDER BY corporationInspector.inspectorName DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_corporation_inspector.inspectorname DESC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"),
			true);
	public static long CORPORATIONID_COLUMN_BITMASK = 1L;
	public static long INSPECTORID_COLUMN_BITMASK = 2L;
	public static long TEAMID_COLUMN_BITMASK = 4L;
	public static long INSPECTORNAME_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CorporationInspector toModel(
		CorporationInspectorSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CorporationInspector model = new CorporationInspectorImpl();

		model.setId(soapModel.getId());
		model.setCorporationId(soapModel.getCorporationId());
		model.setInspectorid(soapModel.getInspectorid());
		model.setInspectorName(soapModel.getInspectorName());
		model.setInspectorPhone(soapModel.getInspectorPhone());
		model.setInspectorEmail(soapModel.getInspectorEmail());
		model.setContactcode(soapModel.getContactcode());
		model.setRegularTthc(soapModel.getRegularTthc());
		model.setTeamId(soapModel.getTeamId());
		model.setMarkupTeamLeader(soapModel.getMarkupTeamLeader());
		model.setMarkUpBoss(soapModel.getMarkUpBoss());
		model.setPlace(soapModel.getPlace());
		model.setTitle(soapModel.getTitle());
		model.setFilechukyId(soapModel.getFilechukyId());
		model.setSynchdate(soapModel.getSynchdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CorporationInspector> toModels(
		CorporationInspectorSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CorporationInspector> models = new ArrayList<CorporationInspector>(soapModels.length);

		for (CorporationInspectorSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"));

	public CorporationInspectorModelImpl() {
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
		return CorporationInspector.class;
	}

	@Override
	public String getModelClassName() {
		return CorporationInspector.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorid", getInspectorid());
		attributes.put("inspectorName", getInspectorName());
		attributes.put("inspectorPhone", getInspectorPhone());
		attributes.put("inspectorEmail", getInspectorEmail());
		attributes.put("contactcode", getContactcode());
		attributes.put("regularTthc", getRegularTthc());
		attributes.put("teamId", getTeamId());
		attributes.put("markupTeamLeader", getMarkupTeamLeader());
		attributes.put("markUpBoss", getMarkUpBoss());
		attributes.put("place", getPlace());
		attributes.put("title", getTitle());
		attributes.put("filechukyId", getFilechukyId());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorid = (Long)attributes.get("inspectorid");

		if (inspectorid != null) {
			setInspectorid(inspectorid);
		}

		String inspectorName = (String)attributes.get("inspectorName");

		if (inspectorName != null) {
			setInspectorName(inspectorName);
		}

		String inspectorPhone = (String)attributes.get("inspectorPhone");

		if (inspectorPhone != null) {
			setInspectorPhone(inspectorPhone);
		}

		String inspectorEmail = (String)attributes.get("inspectorEmail");

		if (inspectorEmail != null) {
			setInspectorEmail(inspectorEmail);
		}

		String contactcode = (String)attributes.get("contactcode");

		if (contactcode != null) {
			setContactcode(contactcode);
		}

		Long regularTthc = (Long)attributes.get("regularTthc");

		if (regularTthc != null) {
			setRegularTthc(regularTthc);
		}

		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Integer markupTeamLeader = (Integer)attributes.get("markupTeamLeader");

		if (markupTeamLeader != null) {
			setMarkupTeamLeader(markupTeamLeader);
		}

		Integer markUpBoss = (Integer)attributes.get("markUpBoss");

		if (markUpBoss != null) {
			setMarkUpBoss(markUpBoss);
		}

		String place = (String)attributes.get("place");

		if (place != null) {
			setPlace(place);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long filechukyId = (Long)attributes.get("filechukyId");

		if (filechukyId != null) {
			setFilechukyId(filechukyId);
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
		_id = id;
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
		_columnBitmask |= CORPORATIONID_COLUMN_BITMASK;

		if (_originalCorporationId == null) {
			_originalCorporationId = _corporationId;
		}

		_corporationId = corporationId;
	}

	public String getOriginalCorporationId() {
		return GetterUtil.getString(_originalCorporationId);
	}

	@JSON
	@Override
	public long getInspectorid() {
		return _inspectorid;
	}

	@Override
	public void setInspectorid(long inspectorid) {
		_columnBitmask |= INSPECTORID_COLUMN_BITMASK;

		if (!_setOriginalInspectorid) {
			_setOriginalInspectorid = true;

			_originalInspectorid = _inspectorid;
		}

		_inspectorid = inspectorid;
	}

	public long getOriginalInspectorid() {
		return _originalInspectorid;
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
		_columnBitmask = -1L;

		_inspectorName = inspectorName;
	}

	@JSON
	@Override
	public String getInspectorPhone() {
		if (_inspectorPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _inspectorPhone;
		}
	}

	@Override
	public void setInspectorPhone(String inspectorPhone) {
		_inspectorPhone = inspectorPhone;
	}

	@JSON
	@Override
	public String getInspectorEmail() {
		if (_inspectorEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _inspectorEmail;
		}
	}

	@Override
	public void setInspectorEmail(String inspectorEmail) {
		_inspectorEmail = inspectorEmail;
	}

	@JSON
	@Override
	public String getContactcode() {
		if (_contactcode == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactcode;
		}
	}

	@Override
	public void setContactcode(String contactcode) {
		_contactcode = contactcode;
	}

	@JSON
	@Override
	public long getRegularTthc() {
		return _regularTthc;
	}

	@Override
	public void setRegularTthc(long regularTthc) {
		_regularTthc = regularTthc;
	}

	@JSON
	@Override
	public long getTeamId() {
		return _teamId;
	}

	@Override
	public void setTeamId(long teamId) {
		_columnBitmask |= TEAMID_COLUMN_BITMASK;

		if (!_setOriginalTeamId) {
			_setOriginalTeamId = true;

			_originalTeamId = _teamId;
		}

		_teamId = teamId;
	}

	public long getOriginalTeamId() {
		return _originalTeamId;
	}

	@JSON
	@Override
	public int getMarkupTeamLeader() {
		return _markupTeamLeader;
	}

	@Override
	public void setMarkupTeamLeader(int markupTeamLeader) {
		_markupTeamLeader = markupTeamLeader;
	}

	@JSON
	@Override
	public int getMarkUpBoss() {
		return _markUpBoss;
	}

	@Override
	public void setMarkUpBoss(int markUpBoss) {
		_markUpBoss = markUpBoss;
	}

	@JSON
	@Override
	public String getPlace() {
		if (_place == null) {
			return StringPool.BLANK;
		}
		else {
			return _place;
		}
	}

	@Override
	public void setPlace(String place) {
		_place = place;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public long getFilechukyId() {
		return _filechukyId;
	}

	@Override
	public void setFilechukyId(long filechukyId) {
		_filechukyId = filechukyId;
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
			CorporationInspector.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CorporationInspector toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CorporationInspector)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CorporationInspectorImpl corporationInspectorImpl = new CorporationInspectorImpl();

		corporationInspectorImpl.setId(getId());
		corporationInspectorImpl.setCorporationId(getCorporationId());
		corporationInspectorImpl.setInspectorid(getInspectorid());
		corporationInspectorImpl.setInspectorName(getInspectorName());
		corporationInspectorImpl.setInspectorPhone(getInspectorPhone());
		corporationInspectorImpl.setInspectorEmail(getInspectorEmail());
		corporationInspectorImpl.setContactcode(getContactcode());
		corporationInspectorImpl.setRegularTthc(getRegularTthc());
		corporationInspectorImpl.setTeamId(getTeamId());
		corporationInspectorImpl.setMarkupTeamLeader(getMarkupTeamLeader());
		corporationInspectorImpl.setMarkUpBoss(getMarkUpBoss());
		corporationInspectorImpl.setPlace(getPlace());
		corporationInspectorImpl.setTitle(getTitle());
		corporationInspectorImpl.setFilechukyId(getFilechukyId());
		corporationInspectorImpl.setSynchdate(getSynchdate());

		corporationInspectorImpl.resetOriginalValues();

		return corporationInspectorImpl;
	}

	@Override
	public int compareTo(CorporationInspector corporationInspector) {
		int value = 0;

		value = getInspectorName()
					.compareTo(corporationInspector.getInspectorName());

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

		if (!(obj instanceof CorporationInspector)) {
			return false;
		}

		CorporationInspector corporationInspector = (CorporationInspector)obj;

		long primaryKey = corporationInspector.getPrimaryKey();

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
		CorporationInspectorModelImpl corporationInspectorModelImpl = this;

		corporationInspectorModelImpl._originalCorporationId = corporationInspectorModelImpl._corporationId;

		corporationInspectorModelImpl._originalInspectorid = corporationInspectorModelImpl._inspectorid;

		corporationInspectorModelImpl._setOriginalInspectorid = false;

		corporationInspectorModelImpl._originalTeamId = corporationInspectorModelImpl._teamId;

		corporationInspectorModelImpl._setOriginalTeamId = false;

		corporationInspectorModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CorporationInspector> toCacheModel() {
		CorporationInspectorCacheModel corporationInspectorCacheModel = new CorporationInspectorCacheModel();

		corporationInspectorCacheModel.id = getId();

		corporationInspectorCacheModel.corporationId = getCorporationId();

		String corporationId = corporationInspectorCacheModel.corporationId;

		if ((corporationId != null) && (corporationId.length() == 0)) {
			corporationInspectorCacheModel.corporationId = null;
		}

		corporationInspectorCacheModel.inspectorid = getInspectorid();

		corporationInspectorCacheModel.inspectorName = getInspectorName();

		String inspectorName = corporationInspectorCacheModel.inspectorName;

		if ((inspectorName != null) && (inspectorName.length() == 0)) {
			corporationInspectorCacheModel.inspectorName = null;
		}

		corporationInspectorCacheModel.inspectorPhone = getInspectorPhone();

		String inspectorPhone = corporationInspectorCacheModel.inspectorPhone;

		if ((inspectorPhone != null) && (inspectorPhone.length() == 0)) {
			corporationInspectorCacheModel.inspectorPhone = null;
		}

		corporationInspectorCacheModel.inspectorEmail = getInspectorEmail();

		String inspectorEmail = corporationInspectorCacheModel.inspectorEmail;

		if ((inspectorEmail != null) && (inspectorEmail.length() == 0)) {
			corporationInspectorCacheModel.inspectorEmail = null;
		}

		corporationInspectorCacheModel.contactcode = getContactcode();

		String contactcode = corporationInspectorCacheModel.contactcode;

		if ((contactcode != null) && (contactcode.length() == 0)) {
			corporationInspectorCacheModel.contactcode = null;
		}

		corporationInspectorCacheModel.regularTthc = getRegularTthc();

		corporationInspectorCacheModel.teamId = getTeamId();

		corporationInspectorCacheModel.markupTeamLeader = getMarkupTeamLeader();

		corporationInspectorCacheModel.markUpBoss = getMarkUpBoss();

		corporationInspectorCacheModel.place = getPlace();

		String place = corporationInspectorCacheModel.place;

		if ((place != null) && (place.length() == 0)) {
			corporationInspectorCacheModel.place = null;
		}

		corporationInspectorCacheModel.title = getTitle();

		String title = corporationInspectorCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			corporationInspectorCacheModel.title = null;
		}

		corporationInspectorCacheModel.filechukyId = getFilechukyId();

		Date synchdate = getSynchdate();

		if (synchdate != null) {
			corporationInspectorCacheModel.synchdate = synchdate.getTime();
		}
		else {
			corporationInspectorCacheModel.synchdate = Long.MIN_VALUE;
		}

		return corporationInspectorCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", inspectorid=");
		sb.append(getInspectorid());
		sb.append(", inspectorName=");
		sb.append(getInspectorName());
		sb.append(", inspectorPhone=");
		sb.append(getInspectorPhone());
		sb.append(", inspectorEmail=");
		sb.append(getInspectorEmail());
		sb.append(", contactcode=");
		sb.append(getContactcode());
		sb.append(", regularTthc=");
		sb.append(getRegularTthc());
		sb.append(", teamId=");
		sb.append(getTeamId());
		sb.append(", markupTeamLeader=");
		sb.append(getMarkupTeamLeader());
		sb.append(", markUpBoss=");
		sb.append(getMarkUpBoss());
		sb.append(", place=");
		sb.append(getPlace());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", filechukyId=");
		sb.append(getFilechukyId());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
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
			"<column><column-name>inspectorPhone</column-name><column-value><![CDATA[");
		sb.append(getInspectorPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorEmail</column-name><column-value><![CDATA[");
		sb.append(getInspectorEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactcode</column-name><column-value><![CDATA[");
		sb.append(getContactcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regularTthc</column-name><column-value><![CDATA[");
		sb.append(getRegularTthc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>teamId</column-name><column-value><![CDATA[");
		sb.append(getTeamId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupTeamLeader</column-name><column-value><![CDATA[");
		sb.append(getMarkupTeamLeader());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpBoss</column-name><column-value><![CDATA[");
		sb.append(getMarkUpBoss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>place</column-name><column-value><![CDATA[");
		sb.append(getPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filechukyId</column-name><column-value><![CDATA[");
		sb.append(getFilechukyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CorporationInspector.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CorporationInspector.class
		};
	private long _id;
	private String _corporationId;
	private String _originalCorporationId;
	private long _inspectorid;
	private long _originalInspectorid;
	private boolean _setOriginalInspectorid;
	private String _inspectorName;
	private String _inspectorPhone;
	private String _inspectorEmail;
	private String _contactcode;
	private long _regularTthc;
	private long _teamId;
	private long _originalTeamId;
	private boolean _setOriginalTeamId;
	private int _markupTeamLeader;
	private int _markUpBoss;
	private String _place;
	private String _title;
	private long _filechukyId;
	private Date _synchdate;
	private long _columnBitmask;
	private CorporationInspector _escapedModel;
}