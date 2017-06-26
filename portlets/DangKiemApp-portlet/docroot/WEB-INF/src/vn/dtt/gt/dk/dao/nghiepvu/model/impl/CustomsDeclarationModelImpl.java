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

import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclarationModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclarationSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CustomsDeclaration service. Represents a row in the &quot;vr_customsdeclaration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclarationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CustomsDeclarationImpl}.
 * </p>
 *
 * @author win_64
 * @see CustomsDeclarationImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclarationModel
 * @generated
 */
@JSON(strict = true)
public class CustomsDeclarationModelImpl extends BaseModelImpl<CustomsDeclaration>
	implements CustomsDeclarationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a customs declaration model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration} interface instead.
	 */
	public static final String TABLE_NAME = "vr_customsdeclaration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "importcustomdeclareno", Types.VARCHAR },
			{ "importcustomdeclaredate", Types.TIMESTAMP },
			{ "customsresult", Types.VARCHAR },
			{ "productcheck", Types.VARCHAR },
			{ "releasedate", Types.TIMESTAMP },
			{ "hosothutucid", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_customsdeclaration (id LONG not null primary key,importcustomdeclareno VARCHAR(75) null,importcustomdeclaredate DATE null,customsresult VARCHAR(75) null,productcheck VARCHAR(75) null,releasedate DATE null,hosothutucid LONG)";
	public static final String TABLE_SQL_DROP = "drop table vr_customsdeclaration";
	public static final String ORDER_BY_JPQL = " ORDER BY customsDeclaration.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_customsdeclaration.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration"),
			true);
	public static long HOSOTHUTUCID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CustomsDeclaration toModel(CustomsDeclarationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CustomsDeclaration model = new CustomsDeclarationImpl();

		model.setId(soapModel.getId());
		model.setImportCustomDeclareNo(soapModel.getImportCustomDeclareNo());
		model.setImportCustomDeclareDate(soapModel.getImportCustomDeclareDate());
		model.setCustomsResult(soapModel.getCustomsResult());
		model.setProductCheck(soapModel.getProductCheck());
		model.setReleaseDate(soapModel.getReleaseDate());
		model.setHosothutucId(soapModel.getHosothutucId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CustomsDeclaration> toModels(
		CustomsDeclarationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CustomsDeclaration> models = new ArrayList<CustomsDeclaration>(soapModels.length);

		for (CustomsDeclarationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration"));

	public CustomsDeclarationModelImpl() {
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
		return CustomsDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return CustomsDeclaration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("importCustomDeclareNo", getImportCustomDeclareNo());
		attributes.put("importCustomDeclareDate", getImportCustomDeclareDate());
		attributes.put("customsResult", getCustomsResult());
		attributes.put("productCheck", getProductCheck());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("hosothutucId", getHosothutucId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String importCustomDeclareNo = (String)attributes.get(
				"importCustomDeclareNo");

		if (importCustomDeclareNo != null) {
			setImportCustomDeclareNo(importCustomDeclareNo);
		}

		Date importCustomDeclareDate = (Date)attributes.get(
				"importCustomDeclareDate");

		if (importCustomDeclareDate != null) {
			setImportCustomDeclareDate(importCustomDeclareDate);
		}

		String customsResult = (String)attributes.get("customsResult");

		if (customsResult != null) {
			setCustomsResult(customsResult);
		}

		String productCheck = (String)attributes.get("productCheck");

		if (productCheck != null) {
			setProductCheck(productCheck);
		}

		Date releaseDate = (Date)attributes.get("releaseDate");

		if (releaseDate != null) {
			setReleaseDate(releaseDate);
		}

		Long hosothutucId = (Long)attributes.get("hosothutucId");

		if (hosothutucId != null) {
			setHosothutucId(hosothutucId);
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
	public String getImportCustomDeclareNo() {
		if (_importCustomDeclareNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _importCustomDeclareNo;
		}
	}

	@Override
	public void setImportCustomDeclareNo(String importCustomDeclareNo) {
		_importCustomDeclareNo = importCustomDeclareNo;
	}

	@JSON
	@Override
	public Date getImportCustomDeclareDate() {
		return _importCustomDeclareDate;
	}

	@Override
	public void setImportCustomDeclareDate(Date importCustomDeclareDate) {
		_importCustomDeclareDate = importCustomDeclareDate;
	}

	@JSON
	@Override
	public String getCustomsResult() {
		if (_customsResult == null) {
			return StringPool.BLANK;
		}
		else {
			return _customsResult;
		}
	}

	@Override
	public void setCustomsResult(String customsResult) {
		_customsResult = customsResult;
	}

	@JSON
	@Override
	public String getProductCheck() {
		if (_productCheck == null) {
			return StringPool.BLANK;
		}
		else {
			return _productCheck;
		}
	}

	@Override
	public void setProductCheck(String productCheck) {
		_productCheck = productCheck;
	}

	@JSON
	@Override
	public Date getReleaseDate() {
		return _releaseDate;
	}

	@Override
	public void setReleaseDate(Date releaseDate) {
		_releaseDate = releaseDate;
	}

	@JSON
	@Override
	public long getHosothutucId() {
		return _hosothutucId;
	}

	@Override
	public void setHosothutucId(long hosothutucId) {
		_columnBitmask |= HOSOTHUTUCID_COLUMN_BITMASK;

		if (!_setOriginalHosothutucId) {
			_setOriginalHosothutucId = true;

			_originalHosothutucId = _hosothutucId;
		}

		_hosothutucId = hosothutucId;
	}

	public long getOriginalHosothutucId() {
		return _originalHosothutucId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CustomsDeclaration.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CustomsDeclaration toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CustomsDeclaration)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CustomsDeclarationImpl customsDeclarationImpl = new CustomsDeclarationImpl();

		customsDeclarationImpl.setId(getId());
		customsDeclarationImpl.setImportCustomDeclareNo(getImportCustomDeclareNo());
		customsDeclarationImpl.setImportCustomDeclareDate(getImportCustomDeclareDate());
		customsDeclarationImpl.setCustomsResult(getCustomsResult());
		customsDeclarationImpl.setProductCheck(getProductCheck());
		customsDeclarationImpl.setReleaseDate(getReleaseDate());
		customsDeclarationImpl.setHosothutucId(getHosothutucId());

		customsDeclarationImpl.resetOriginalValues();

		return customsDeclarationImpl;
	}

	@Override
	public int compareTo(CustomsDeclaration customsDeclaration) {
		int value = 0;

		if (getId() < customsDeclaration.getId()) {
			value = -1;
		}
		else if (getId() > customsDeclaration.getId()) {
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

		if (!(obj instanceof CustomsDeclaration)) {
			return false;
		}

		CustomsDeclaration customsDeclaration = (CustomsDeclaration)obj;

		long primaryKey = customsDeclaration.getPrimaryKey();

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
		CustomsDeclarationModelImpl customsDeclarationModelImpl = this;

		customsDeclarationModelImpl._originalHosothutucId = customsDeclarationModelImpl._hosothutucId;

		customsDeclarationModelImpl._setOriginalHosothutucId = false;

		customsDeclarationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CustomsDeclaration> toCacheModel() {
		CustomsDeclarationCacheModel customsDeclarationCacheModel = new CustomsDeclarationCacheModel();

		customsDeclarationCacheModel.id = getId();

		customsDeclarationCacheModel.importCustomDeclareNo = getImportCustomDeclareNo();

		String importCustomDeclareNo = customsDeclarationCacheModel.importCustomDeclareNo;

		if ((importCustomDeclareNo != null) &&
				(importCustomDeclareNo.length() == 0)) {
			customsDeclarationCacheModel.importCustomDeclareNo = null;
		}

		Date importCustomDeclareDate = getImportCustomDeclareDate();

		if (importCustomDeclareDate != null) {
			customsDeclarationCacheModel.importCustomDeclareDate = importCustomDeclareDate.getTime();
		}
		else {
			customsDeclarationCacheModel.importCustomDeclareDate = Long.MIN_VALUE;
		}

		customsDeclarationCacheModel.customsResult = getCustomsResult();

		String customsResult = customsDeclarationCacheModel.customsResult;

		if ((customsResult != null) && (customsResult.length() == 0)) {
			customsDeclarationCacheModel.customsResult = null;
		}

		customsDeclarationCacheModel.productCheck = getProductCheck();

		String productCheck = customsDeclarationCacheModel.productCheck;

		if ((productCheck != null) && (productCheck.length() == 0)) {
			customsDeclarationCacheModel.productCheck = null;
		}

		Date releaseDate = getReleaseDate();

		if (releaseDate != null) {
			customsDeclarationCacheModel.releaseDate = releaseDate.getTime();
		}
		else {
			customsDeclarationCacheModel.releaseDate = Long.MIN_VALUE;
		}

		customsDeclarationCacheModel.hosothutucId = getHosothutucId();

		return customsDeclarationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", importCustomDeclareNo=");
		sb.append(getImportCustomDeclareNo());
		sb.append(", importCustomDeclareDate=");
		sb.append(getImportCustomDeclareDate());
		sb.append(", customsResult=");
		sb.append(getCustomsResult());
		sb.append(", productCheck=");
		sb.append(getProductCheck());
		sb.append(", releaseDate=");
		sb.append(getReleaseDate());
		sb.append(", hosothutucId=");
		sb.append(getHosothutucId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importCustomDeclareNo</column-name><column-value><![CDATA[");
		sb.append(getImportCustomDeclareNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importCustomDeclareDate</column-name><column-value><![CDATA[");
		sb.append(getImportCustomDeclareDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customsResult</column-name><column-value><![CDATA[");
		sb.append(getCustomsResult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productCheck</column-name><column-value><![CDATA[");
		sb.append(getProductCheck());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>releaseDate</column-name><column-value><![CDATA[");
		sb.append(getReleaseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hosothutucId</column-name><column-value><![CDATA[");
		sb.append(getHosothutucId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CustomsDeclaration.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CustomsDeclaration.class
		};
	private long _id;
	private String _importCustomDeclareNo;
	private Date _importCustomDeclareDate;
	private String _customsResult;
	private String _productCheck;
	private Date _releaseDate;
	private long _hosothutucId;
	private long _originalHosothutucId;
	private boolean _setOriginalHosothutucId;
	private long _columnBitmask;
	private CustomsDeclaration _escapedModel;
}