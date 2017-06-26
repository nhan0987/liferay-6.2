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

import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRateModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ExchangeRate service. Represents a row in the &quot;vr_exchangerate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExchangeRateImpl}.
 * </p>
 *
 * @author huymq
 * @see ExchangeRateImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRateModel
 * @generated
 */
public class ExchangeRateModelImpl extends BaseModelImpl<ExchangeRate>
	implements ExchangeRateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a exchange rate model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate} interface instead.
	 */
	public static final String TABLE_NAME = "vr_exchangerate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "originalcurrency", Types.VARCHAR },
			{ "basiccurrency", Types.VARCHAR },
			{ "exchangerate", Types.DOUBLE },
			{ "publishdate", Types.TIMESTAMP },
			{ "validfrom", Types.TIMESTAMP },
			{ "validuntil", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_exchangerate (id LONG not null primary key,originalcurrency VARCHAR(75) null,basiccurrency VARCHAR(75) null,exchangerate DOUBLE,publishdate DATE null,validfrom DATE null,validuntil DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_exchangerate";
	public static final String ORDER_BY_JPQL = " ORDER BY exchangeRate.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_exchangerate.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate"),
			true);
	public static long BASICCURRENCY_COLUMN_BITMASK = 1L;
	public static long ORIGINALCURRENCY_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate"));

	public ExchangeRateModelImpl() {
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
		return ExchangeRate.class;
	}

	@Override
	public String getModelClassName() {
		return ExchangeRate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("originalCurrency", getOriginalCurrency());
		attributes.put("basicCurrency", getBasicCurrency());
		attributes.put("exchangeRate", getExchangeRate());
		attributes.put("publishDate", getPublishDate());
		attributes.put("validFrom", getValidFrom());
		attributes.put("validUntil", getValidUntil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String originalCurrency = (String)attributes.get("originalCurrency");

		if (originalCurrency != null) {
			setOriginalCurrency(originalCurrency);
		}

		String basicCurrency = (String)attributes.get("basicCurrency");

		if (basicCurrency != null) {
			setBasicCurrency(basicCurrency);
		}

		Double exchangeRate = (Double)attributes.get("exchangeRate");

		if (exchangeRate != null) {
			setExchangeRate(exchangeRate);
		}

		Date publishDate = (Date)attributes.get("publishDate");

		if (publishDate != null) {
			setPublishDate(publishDate);
		}

		Date validFrom = (Date)attributes.get("validFrom");

		if (validFrom != null) {
			setValidFrom(validFrom);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
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
	public String getOriginalCurrency() {
		if (_originalCurrency == null) {
			return StringPool.BLANK;
		}
		else {
			return _originalCurrency;
		}
	}

	@Override
	public void setOriginalCurrency(String originalCurrency) {
		_columnBitmask |= ORIGINALCURRENCY_COLUMN_BITMASK;

		if (_originalOriginalCurrency == null) {
			_originalOriginalCurrency = _originalCurrency;
		}

		_originalCurrency = originalCurrency;
	}

	public String getOriginalOriginalCurrency() {
		return GetterUtil.getString(_originalOriginalCurrency);
	}

	@Override
	public String getBasicCurrency() {
		if (_basicCurrency == null) {
			return StringPool.BLANK;
		}
		else {
			return _basicCurrency;
		}
	}

	@Override
	public void setBasicCurrency(String basicCurrency) {
		_columnBitmask |= BASICCURRENCY_COLUMN_BITMASK;

		if (_originalBasicCurrency == null) {
			_originalBasicCurrency = _basicCurrency;
		}

		_basicCurrency = basicCurrency;
	}

	public String getOriginalBasicCurrency() {
		return GetterUtil.getString(_originalBasicCurrency);
	}

	@Override
	public double getExchangeRate() {
		return _exchangeRate;
	}

	@Override
	public void setExchangeRate(double exchangeRate) {
		_exchangeRate = exchangeRate;
	}

	@Override
	public Date getPublishDate() {
		return _publishDate;
	}

	@Override
	public void setPublishDate(Date publishDate) {
		_publishDate = publishDate;
	}

	@Override
	public Date getValidFrom() {
		return _validFrom;
	}

	@Override
	public void setValidFrom(Date validFrom) {
		_validFrom = validFrom;
	}

	@Override
	public Date getValidUntil() {
		return _validUntil;
	}

	@Override
	public void setValidUntil(Date validUntil) {
		_validUntil = validUntil;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ExchangeRate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ExchangeRate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ExchangeRate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ExchangeRateImpl exchangeRateImpl = new ExchangeRateImpl();

		exchangeRateImpl.setId(getId());
		exchangeRateImpl.setOriginalCurrency(getOriginalCurrency());
		exchangeRateImpl.setBasicCurrency(getBasicCurrency());
		exchangeRateImpl.setExchangeRate(getExchangeRate());
		exchangeRateImpl.setPublishDate(getPublishDate());
		exchangeRateImpl.setValidFrom(getValidFrom());
		exchangeRateImpl.setValidUntil(getValidUntil());

		exchangeRateImpl.resetOriginalValues();

		return exchangeRateImpl;
	}

	@Override
	public int compareTo(ExchangeRate exchangeRate) {
		int value = 0;

		if (getId() < exchangeRate.getId()) {
			value = -1;
		}
		else if (getId() > exchangeRate.getId()) {
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

		if (!(obj instanceof ExchangeRate)) {
			return false;
		}

		ExchangeRate exchangeRate = (ExchangeRate)obj;

		long primaryKey = exchangeRate.getPrimaryKey();

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
		ExchangeRateModelImpl exchangeRateModelImpl = this;

		exchangeRateModelImpl._originalOriginalCurrency = exchangeRateModelImpl._originalCurrency;

		exchangeRateModelImpl._originalBasicCurrency = exchangeRateModelImpl._basicCurrency;

		exchangeRateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ExchangeRate> toCacheModel() {
		ExchangeRateCacheModel exchangeRateCacheModel = new ExchangeRateCacheModel();

		exchangeRateCacheModel.id = getId();

		exchangeRateCacheModel.originalCurrency = getOriginalCurrency();

		String originalCurrency = exchangeRateCacheModel.originalCurrency;

		if ((originalCurrency != null) && (originalCurrency.length() == 0)) {
			exchangeRateCacheModel.originalCurrency = null;
		}

		exchangeRateCacheModel.basicCurrency = getBasicCurrency();

		String basicCurrency = exchangeRateCacheModel.basicCurrency;

		if ((basicCurrency != null) && (basicCurrency.length() == 0)) {
			exchangeRateCacheModel.basicCurrency = null;
		}

		exchangeRateCacheModel.exchangeRate = getExchangeRate();

		Date publishDate = getPublishDate();

		if (publishDate != null) {
			exchangeRateCacheModel.publishDate = publishDate.getTime();
		}
		else {
			exchangeRateCacheModel.publishDate = Long.MIN_VALUE;
		}

		Date validFrom = getValidFrom();

		if (validFrom != null) {
			exchangeRateCacheModel.validFrom = validFrom.getTime();
		}
		else {
			exchangeRateCacheModel.validFrom = Long.MIN_VALUE;
		}

		Date validUntil = getValidUntil();

		if (validUntil != null) {
			exchangeRateCacheModel.validUntil = validUntil.getTime();
		}
		else {
			exchangeRateCacheModel.validUntil = Long.MIN_VALUE;
		}

		return exchangeRateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", originalCurrency=");
		sb.append(getOriginalCurrency());
		sb.append(", basicCurrency=");
		sb.append(getBasicCurrency());
		sb.append(", exchangeRate=");
		sb.append(getExchangeRate());
		sb.append(", publishDate=");
		sb.append(getPublishDate());
		sb.append(", validFrom=");
		sb.append(getValidFrom());
		sb.append(", validUntil=");
		sb.append(getValidUntil());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>originalCurrency</column-name><column-value><![CDATA[");
		sb.append(getOriginalCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>basicCurrency</column-name><column-value><![CDATA[");
		sb.append(getBasicCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exchangeRate</column-name><column-value><![CDATA[");
		sb.append(getExchangeRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishDate</column-name><column-value><![CDATA[");
		sb.append(getPublishDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validFrom</column-name><column-value><![CDATA[");
		sb.append(getValidFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validUntil</column-name><column-value><![CDATA[");
		sb.append(getValidUntil());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ExchangeRate.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ExchangeRate.class
		};
	private long _id;
	private String _originalCurrency;
	private String _originalOriginalCurrency;
	private String _basicCurrency;
	private String _originalBasicCurrency;
	private double _exchangeRate;
	private Date _publishDate;
	private Date _validFrom;
	private Date _validUntil;
	private long _columnBitmask;
	private ExchangeRate _escapedModel;
}