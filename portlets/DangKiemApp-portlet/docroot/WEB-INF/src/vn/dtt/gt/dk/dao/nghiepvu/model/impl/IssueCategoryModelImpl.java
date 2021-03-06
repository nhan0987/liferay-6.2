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

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategoryModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategorySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the IssueCategory service. Represents a row in the &quot;vr_assessmentissuecategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link IssueCategoryImpl}.
 * </p>
 *
 * @author win_64
 * @see IssueCategoryImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategoryModel
 * @generated
 */
@JSON(strict = true)
public class IssueCategoryModelImpl extends BaseModelImpl<IssueCategory>
	implements IssueCategoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a issue category model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory} interface instead.
	 */
	public static final String TABLE_NAME = "vr_assessmentissuecategory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "issuetrackingid", Types.INTEGER },
			{ "defectcategorycode", Types.VARCHAR },
			{ "defectcategoryshortname", Types.VARCHAR },
			{ "defectcategoryfullname", Types.VARCHAR },
			{ "defectdetection", Types.INTEGER },
			{ "defectdatagroupid", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_assessmentissuecategory (id LONG not null primary key,issuetrackingid INTEGER,defectcategorycode VARCHAR(75) null,defectcategoryshortname VARCHAR(75) null,defectcategoryfullname VARCHAR(75) null,defectdetection INTEGER,defectdatagroupid INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table vr_assessmentissuecategory";
	public static final String ORDER_BY_JPQL = " ORDER BY issueCategory.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_assessmentissuecategory.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory"),
			true);
	public static long DEFECTCATEGORYCODE_COLUMN_BITMASK = 1L;
	public static long DEFECTCATEGORYSHORTNAME_COLUMN_BITMASK = 2L;
	public static long DEFECTDATAGROUPID_COLUMN_BITMASK = 4L;
	public static long DEFECTDETECTION_COLUMN_BITMASK = 8L;
	public static long ISSUETRACKINGID_COLUMN_BITMASK = 16L;
	public static long ID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static IssueCategory toModel(IssueCategorySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		IssueCategory model = new IssueCategoryImpl();

		model.setId(soapModel.getId());
		model.setIssuetrackingid(soapModel.getIssuetrackingid());
		model.setDefectcategorycode(soapModel.getDefectcategorycode());
		model.setDefectcategoryshortname(soapModel.getDefectcategoryshortname());
		model.setDefectcategoryfullname(soapModel.getDefectcategoryfullname());
		model.setDefectdetection(soapModel.getDefectdetection());
		model.setDefectdatagroupid(soapModel.getDefectdatagroupid());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<IssueCategory> toModels(IssueCategorySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<IssueCategory> models = new ArrayList<IssueCategory>(soapModels.length);

		for (IssueCategorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory"));

	public IssueCategoryModelImpl() {
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
		return IssueCategory.class;
	}

	@Override
	public String getModelClassName() {
		return IssueCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("issuetrackingid", getIssuetrackingid());
		attributes.put("defectcategorycode", getDefectcategorycode());
		attributes.put("defectcategoryshortname", getDefectcategoryshortname());
		attributes.put("defectcategoryfullname", getDefectcategoryfullname());
		attributes.put("defectdetection", getDefectdetection());
		attributes.put("defectdatagroupid", getDefectdatagroupid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer issuetrackingid = (Integer)attributes.get("issuetrackingid");

		if (issuetrackingid != null) {
			setIssuetrackingid(issuetrackingid);
		}

		String defectcategorycode = (String)attributes.get("defectcategorycode");

		if (defectcategorycode != null) {
			setDefectcategorycode(defectcategorycode);
		}

		String defectcategoryshortname = (String)attributes.get(
				"defectcategoryshortname");

		if (defectcategoryshortname != null) {
			setDefectcategoryshortname(defectcategoryshortname);
		}

		String defectcategoryfullname = (String)attributes.get(
				"defectcategoryfullname");

		if (defectcategoryfullname != null) {
			setDefectcategoryfullname(defectcategoryfullname);
		}

		Integer defectdetection = (Integer)attributes.get("defectdetection");

		if (defectdetection != null) {
			setDefectdetection(defectdetection);
		}

		Integer defectdatagroupid = (Integer)attributes.get("defectdatagroupid");

		if (defectdatagroupid != null) {
			setDefectdatagroupid(defectdatagroupid);
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
	public int getIssuetrackingid() {
		return _issuetrackingid;
	}

	@Override
	public void setIssuetrackingid(int issuetrackingid) {
		_columnBitmask |= ISSUETRACKINGID_COLUMN_BITMASK;

		if (!_setOriginalIssuetrackingid) {
			_setOriginalIssuetrackingid = true;

			_originalIssuetrackingid = _issuetrackingid;
		}

		_issuetrackingid = issuetrackingid;
	}

	public int getOriginalIssuetrackingid() {
		return _originalIssuetrackingid;
	}

	@JSON
	@Override
	public String getDefectcategorycode() {
		if (_defectcategorycode == null) {
			return StringPool.BLANK;
		}
		else {
			return _defectcategorycode;
		}
	}

	@Override
	public void setDefectcategorycode(String defectcategorycode) {
		_columnBitmask |= DEFECTCATEGORYCODE_COLUMN_BITMASK;

		if (_originalDefectcategorycode == null) {
			_originalDefectcategorycode = _defectcategorycode;
		}

		_defectcategorycode = defectcategorycode;
	}

	public String getOriginalDefectcategorycode() {
		return GetterUtil.getString(_originalDefectcategorycode);
	}

	@JSON
	@Override
	public String getDefectcategoryshortname() {
		if (_defectcategoryshortname == null) {
			return StringPool.BLANK;
		}
		else {
			return _defectcategoryshortname;
		}
	}

	@Override
	public void setDefectcategoryshortname(String defectcategoryshortname) {
		_columnBitmask |= DEFECTCATEGORYSHORTNAME_COLUMN_BITMASK;

		if (_originalDefectcategoryshortname == null) {
			_originalDefectcategoryshortname = _defectcategoryshortname;
		}

		_defectcategoryshortname = defectcategoryshortname;
	}

	public String getOriginalDefectcategoryshortname() {
		return GetterUtil.getString(_originalDefectcategoryshortname);
	}

	@JSON
	@Override
	public String getDefectcategoryfullname() {
		if (_defectcategoryfullname == null) {
			return StringPool.BLANK;
		}
		else {
			return _defectcategoryfullname;
		}
	}

	@Override
	public void setDefectcategoryfullname(String defectcategoryfullname) {
		_defectcategoryfullname = defectcategoryfullname;
	}

	@JSON
	@Override
	public int getDefectdetection() {
		return _defectdetection;
	}

	@Override
	public void setDefectdetection(int defectdetection) {
		_columnBitmask |= DEFECTDETECTION_COLUMN_BITMASK;

		if (!_setOriginalDefectdetection) {
			_setOriginalDefectdetection = true;

			_originalDefectdetection = _defectdetection;
		}

		_defectdetection = defectdetection;
	}

	public int getOriginalDefectdetection() {
		return _originalDefectdetection;
	}

	@JSON
	@Override
	public int getDefectdatagroupid() {
		return _defectdatagroupid;
	}

	@Override
	public void setDefectdatagroupid(int defectdatagroupid) {
		_columnBitmask |= DEFECTDATAGROUPID_COLUMN_BITMASK;

		if (!_setOriginalDefectdatagroupid) {
			_setOriginalDefectdatagroupid = true;

			_originalDefectdatagroupid = _defectdatagroupid;
		}

		_defectdatagroupid = defectdatagroupid;
	}

	public int getOriginalDefectdatagroupid() {
		return _originalDefectdatagroupid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			IssueCategory.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public IssueCategory toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (IssueCategory)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		IssueCategoryImpl issueCategoryImpl = new IssueCategoryImpl();

		issueCategoryImpl.setId(getId());
		issueCategoryImpl.setIssuetrackingid(getIssuetrackingid());
		issueCategoryImpl.setDefectcategorycode(getDefectcategorycode());
		issueCategoryImpl.setDefectcategoryshortname(getDefectcategoryshortname());
		issueCategoryImpl.setDefectcategoryfullname(getDefectcategoryfullname());
		issueCategoryImpl.setDefectdetection(getDefectdetection());
		issueCategoryImpl.setDefectdatagroupid(getDefectdatagroupid());

		issueCategoryImpl.resetOriginalValues();

		return issueCategoryImpl;
	}

	@Override
	public int compareTo(IssueCategory issueCategory) {
		int value = 0;

		if (getId() < issueCategory.getId()) {
			value = -1;
		}
		else if (getId() > issueCategory.getId()) {
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

		if (!(obj instanceof IssueCategory)) {
			return false;
		}

		IssueCategory issueCategory = (IssueCategory)obj;

		long primaryKey = issueCategory.getPrimaryKey();

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
		IssueCategoryModelImpl issueCategoryModelImpl = this;

		issueCategoryModelImpl._originalIssuetrackingid = issueCategoryModelImpl._issuetrackingid;

		issueCategoryModelImpl._setOriginalIssuetrackingid = false;

		issueCategoryModelImpl._originalDefectcategorycode = issueCategoryModelImpl._defectcategorycode;

		issueCategoryModelImpl._originalDefectcategoryshortname = issueCategoryModelImpl._defectcategoryshortname;

		issueCategoryModelImpl._originalDefectdetection = issueCategoryModelImpl._defectdetection;

		issueCategoryModelImpl._setOriginalDefectdetection = false;

		issueCategoryModelImpl._originalDefectdatagroupid = issueCategoryModelImpl._defectdatagroupid;

		issueCategoryModelImpl._setOriginalDefectdatagroupid = false;

		issueCategoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<IssueCategory> toCacheModel() {
		IssueCategoryCacheModel issueCategoryCacheModel = new IssueCategoryCacheModel();

		issueCategoryCacheModel.id = getId();

		issueCategoryCacheModel.issuetrackingid = getIssuetrackingid();

		issueCategoryCacheModel.defectcategorycode = getDefectcategorycode();

		String defectcategorycode = issueCategoryCacheModel.defectcategorycode;

		if ((defectcategorycode != null) && (defectcategorycode.length() == 0)) {
			issueCategoryCacheModel.defectcategorycode = null;
		}

		issueCategoryCacheModel.defectcategoryshortname = getDefectcategoryshortname();

		String defectcategoryshortname = issueCategoryCacheModel.defectcategoryshortname;

		if ((defectcategoryshortname != null) &&
				(defectcategoryshortname.length() == 0)) {
			issueCategoryCacheModel.defectcategoryshortname = null;
		}

		issueCategoryCacheModel.defectcategoryfullname = getDefectcategoryfullname();

		String defectcategoryfullname = issueCategoryCacheModel.defectcategoryfullname;

		if ((defectcategoryfullname != null) &&
				(defectcategoryfullname.length() == 0)) {
			issueCategoryCacheModel.defectcategoryfullname = null;
		}

		issueCategoryCacheModel.defectdetection = getDefectdetection();

		issueCategoryCacheModel.defectdatagroupid = getDefectdatagroupid();

		return issueCategoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", issuetrackingid=");
		sb.append(getIssuetrackingid());
		sb.append(", defectcategorycode=");
		sb.append(getDefectcategorycode());
		sb.append(", defectcategoryshortname=");
		sb.append(getDefectcategoryshortname());
		sb.append(", defectcategoryfullname=");
		sb.append(getDefectcategoryfullname());
		sb.append(", defectdetection=");
		sb.append(getDefectdetection());
		sb.append(", defectdatagroupid=");
		sb.append(getDefectdatagroupid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuetrackingid</column-name><column-value><![CDATA[");
		sb.append(getIssuetrackingid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectcategorycode</column-name><column-value><![CDATA[");
		sb.append(getDefectcategorycode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectcategoryshortname</column-name><column-value><![CDATA[");
		sb.append(getDefectcategoryshortname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectcategoryfullname</column-name><column-value><![CDATA[");
		sb.append(getDefectcategoryfullname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectdetection</column-name><column-value><![CDATA[");
		sb.append(getDefectdetection());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectdatagroupid</column-name><column-value><![CDATA[");
		sb.append(getDefectdatagroupid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = IssueCategory.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			IssueCategory.class
		};
	private long _id;
	private int _issuetrackingid;
	private int _originalIssuetrackingid;
	private boolean _setOriginalIssuetrackingid;
	private String _defectcategorycode;
	private String _originalDefectcategorycode;
	private String _defectcategoryshortname;
	private String _originalDefectcategoryshortname;
	private String _defectcategoryfullname;
	private int _defectdetection;
	private int _originalDefectdetection;
	private boolean _setOriginalDefectdetection;
	private int _defectdatagroupid;
	private int _originalDefectdatagroupid;
	private boolean _setOriginalDefectdatagroupid;
	private long _columnBitmask;
	private IssueCategory _escapedModel;
}