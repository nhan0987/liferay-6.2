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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircularModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CertificateCircular service. Represents a row in the &quot;vr_certificatecircular&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircularModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CertificateCircularImpl}.
 * </p>
 *
 * @author huymq
 * @see CertificateCircularImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircularModel
 * @generated
 */
public class CertificateCircularModelImpl extends BaseModelImpl<CertificateCircular>
	implements CertificateCircularModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a certificate circular model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular} interface instead.
	 */
	public static final String TABLE_NAME = "vr_certificatecircular";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "certificaterecordid", Types.BIGINT },
			{ "sequenceno", Types.BIGINT },
			{ "circularno", Types.VARCHAR },
			{ "circulardate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_certificatecircular (id LONG not null primary key,certificaterecordid LONG,sequenceno LONG,circularno VARCHAR(75) null,circulardate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_certificatecircular";
	public static final String ORDER_BY_JPQL = " ORDER BY certificateCircular.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_certificatecircular.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular"),
			true);
	public static long CERTIFICATERECORDID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular"));

	public CertificateCircularModelImpl() {
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
		return CertificateCircular.class;
	}

	@Override
	public String getModelClassName() {
		return CertificateCircular.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("circularNo", getCircularNo());
		attributes.put("circularDate", getCircularDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String circularNo = (String)attributes.get("circularNo");

		if (circularNo != null) {
			setCircularNo(circularNo);
		}

		Date circularDate = (Date)attributes.get("circularDate");

		if (circularDate != null) {
			setCircularDate(circularDate);
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
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_columnBitmask |= CERTIFICATERECORDID_COLUMN_BITMASK;

		if (!_setOriginalCertificateRecordId) {
			_setOriginalCertificateRecordId = true;

			_originalCertificateRecordId = _certificateRecordId;
		}

		_certificateRecordId = certificateRecordId;
	}

	public long getOriginalCertificateRecordId() {
		return _originalCertificateRecordId;
	}

	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	@Override
	public String getCircularNo() {
		if (_circularNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _circularNo;
		}
	}

	@Override
	public void setCircularNo(String circularNo) {
		_circularNo = circularNo;
	}

	@Override
	public Date getCircularDate() {
		return _circularDate;
	}

	@Override
	public void setCircularDate(Date circularDate) {
		_circularDate = circularDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CertificateCircular.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CertificateCircular toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CertificateCircular)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CertificateCircularImpl certificateCircularImpl = new CertificateCircularImpl();

		certificateCircularImpl.setId(getId());
		certificateCircularImpl.setCertificateRecordId(getCertificateRecordId());
		certificateCircularImpl.setSequenceNo(getSequenceNo());
		certificateCircularImpl.setCircularNo(getCircularNo());
		certificateCircularImpl.setCircularDate(getCircularDate());

		certificateCircularImpl.resetOriginalValues();

		return certificateCircularImpl;
	}

	@Override
	public int compareTo(CertificateCircular certificateCircular) {
		int value = 0;

		if (getId() < certificateCircular.getId()) {
			value = -1;
		}
		else if (getId() > certificateCircular.getId()) {
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

		if (!(obj instanceof CertificateCircular)) {
			return false;
		}

		CertificateCircular certificateCircular = (CertificateCircular)obj;

		long primaryKey = certificateCircular.getPrimaryKey();

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
		CertificateCircularModelImpl certificateCircularModelImpl = this;

		certificateCircularModelImpl._originalCertificateRecordId = certificateCircularModelImpl._certificateRecordId;

		certificateCircularModelImpl._setOriginalCertificateRecordId = false;

		certificateCircularModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CertificateCircular> toCacheModel() {
		CertificateCircularCacheModel certificateCircularCacheModel = new CertificateCircularCacheModel();

		certificateCircularCacheModel.id = getId();

		certificateCircularCacheModel.certificateRecordId = getCertificateRecordId();

		certificateCircularCacheModel.sequenceNo = getSequenceNo();

		certificateCircularCacheModel.circularNo = getCircularNo();

		String circularNo = certificateCircularCacheModel.circularNo;

		if ((circularNo != null) && (circularNo.length() == 0)) {
			certificateCircularCacheModel.circularNo = null;
		}

		Date circularDate = getCircularDate();

		if (circularDate != null) {
			certificateCircularCacheModel.circularDate = circularDate.getTime();
		}
		else {
			certificateCircularCacheModel.circularDate = Long.MIN_VALUE;
		}

		return certificateCircularCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", circularNo=");
		sb.append(getCircularNo());
		sb.append(", circularDate=");
		sb.append(getCircularDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>circularNo</column-name><column-value><![CDATA[");
		sb.append(getCircularNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>circularDate</column-name><column-value><![CDATA[");
		sb.append(getCircularDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CertificateCircular.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CertificateCircular.class
		};
	private long _id;
	private long _certificateRecordId;
	private long _originalCertificateRecordId;
	private boolean _setOriginalCertificateRecordId;
	private long _sequenceNo;
	private String _circularNo;
	private Date _circularDate;
	private long _columnBitmask;
	private CertificateCircular _escapedModel;
}