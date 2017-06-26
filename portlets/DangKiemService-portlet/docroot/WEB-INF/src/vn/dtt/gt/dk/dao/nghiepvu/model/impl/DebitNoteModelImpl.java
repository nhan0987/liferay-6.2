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

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DebitNote service. Represents a row in the &quot;vr_debitnote&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DebitNoteImpl}.
 * </p>
 *
 * @author huymq
 * @see DebitNoteImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteModel
 * @generated
 */
public class DebitNoteModelImpl extends BaseModelImpl<DebitNote>
	implements DebitNoteModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a debit note model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote} interface instead.
	 */
	public static final String TABLE_NAME = "vr_debitnote";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "debitnotenumber", Types.VARCHAR },
			{ "transactionid", Types.VARCHAR },
			{ "corporationid", Types.VARCHAR },
			{ "financialaccountant", Types.VARCHAR },
			{ "organization", Types.VARCHAR },
			{ "division", Types.VARCHAR },
			{ "reportby", Types.VARCHAR },
			{ "reportdate", Types.TIMESTAMP },
			{ "fromdate", Types.TIMESTAMP },
			{ "todate", Types.TIMESTAMP },
			{ "attachedfile", Types.BIGINT },
			{ "totalpayment", Types.DOUBLE },
			{ "paymenttype", Types.BIGINT },
			{ "markasdeleted", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_debitnote (id LONG not null primary key,debitnotenumber VARCHAR(75) null,transactionid VARCHAR(75) null,corporationid VARCHAR(75) null,financialaccountant VARCHAR(75) null,organization VARCHAR(75) null,division VARCHAR(75) null,reportby VARCHAR(75) null,reportdate DATE null,fromdate DATE null,todate DATE null,attachedfile LONG,totalpayment DOUBLE,paymenttype LONG,markasdeleted INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table vr_debitnote";
	public static final String ORDER_BY_JPQL = " ORDER BY debitNote.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_debitnote.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"),
			true);
	public static long DEBITNOTENUMBER_COLUMN_BITMASK = 1L;
	public static long MARKASDELETED_COLUMN_BITMASK = 2L;
	public static long TRANSACTIONID_COLUMN_BITMASK = 4L;
	public static long ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"));

	public DebitNoteModelImpl() {
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
		return DebitNote.class;
	}

	@Override
	public String getModelClassName() {
		return DebitNote.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("debitNoteNumber", getDebitNoteNumber());
		attributes.put("transactionId", getTransactionId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("financialAccountant", getFinancialAccountant());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("reportBy", getReportBy());
		attributes.put("reportDate", getReportDate());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("totalPayment", getTotalPayment());
		attributes.put("paymentType", getPaymentType());
		attributes.put("markAsDeleted", getMarkAsDeleted());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String debitNoteNumber = (String)attributes.get("debitNoteNumber");

		if (debitNoteNumber != null) {
			setDebitNoteNumber(debitNoteNumber);
		}

		String transactionId = (String)attributes.get("transactionId");

		if (transactionId != null) {
			setTransactionId(transactionId);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String financialAccountant = (String)attributes.get(
				"financialAccountant");

		if (financialAccountant != null) {
			setFinancialAccountant(financialAccountant);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String reportBy = (String)attributes.get("reportBy");

		if (reportBy != null) {
			setReportBy(reportBy);
		}

		Date reportDate = (Date)attributes.get("reportDate");

		if (reportDate != null) {
			setReportDate(reportDate);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Double totalPayment = (Double)attributes.get("totalPayment");

		if (totalPayment != null) {
			setTotalPayment(totalPayment);
		}

		Long paymentType = (Long)attributes.get("paymentType");

		if (paymentType != null) {
			setPaymentType(paymentType);
		}

		Integer markAsDeleted = (Integer)attributes.get("markAsDeleted");

		if (markAsDeleted != null) {
			setMarkAsDeleted(markAsDeleted);
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
	public String getDebitNoteNumber() {
		if (_debitNoteNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _debitNoteNumber;
		}
	}

	@Override
	public void setDebitNoteNumber(String debitNoteNumber) {
		_columnBitmask |= DEBITNOTENUMBER_COLUMN_BITMASK;

		if (_originalDebitNoteNumber == null) {
			_originalDebitNoteNumber = _debitNoteNumber;
		}

		_debitNoteNumber = debitNoteNumber;
	}

	public String getOriginalDebitNoteNumber() {
		return GetterUtil.getString(_originalDebitNoteNumber);
	}

	@Override
	public String getTransactionId() {
		if (_transactionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _transactionId;
		}
	}

	@Override
	public void setTransactionId(String transactionId) {
		_columnBitmask |= TRANSACTIONID_COLUMN_BITMASK;

		if (_originalTransactionId == null) {
			_originalTransactionId = _transactionId;
		}

		_transactionId = transactionId;
	}

	public String getOriginalTransactionId() {
		return GetterUtil.getString(_originalTransactionId);
	}

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
		_corporationId = corporationId;
	}

	@Override
	public String getFinancialAccountant() {
		if (_financialAccountant == null) {
			return StringPool.BLANK;
		}
		else {
			return _financialAccountant;
		}
	}

	@Override
	public void setFinancialAccountant(String financialAccountant) {
		_financialAccountant = financialAccountant;
	}

	@Override
	public String getOrganization() {
		if (_organization == null) {
			return StringPool.BLANK;
		}
		else {
			return _organization;
		}
	}

	@Override
	public void setOrganization(String organization) {
		_organization = organization;
	}

	@Override
	public String getDivision() {
		if (_division == null) {
			return StringPool.BLANK;
		}
		else {
			return _division;
		}
	}

	@Override
	public void setDivision(String division) {
		_division = division;
	}

	@Override
	public String getReportBy() {
		if (_reportBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _reportBy;
		}
	}

	@Override
	public void setReportBy(String reportBy) {
		_reportBy = reportBy;
	}

	@Override
	public Date getReportDate() {
		return _reportDate;
	}

	@Override
	public void setReportDate(Date reportDate) {
		_reportDate = reportDate;
	}

	@Override
	public Date getFromDate() {
		return _fromDate;
	}

	@Override
	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;
	}

	@Override
	public Date getToDate() {
		return _toDate;
	}

	@Override
	public void setToDate(Date toDate) {
		_toDate = toDate;
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	@Override
	public double getTotalPayment() {
		return _totalPayment;
	}

	@Override
	public void setTotalPayment(double totalPayment) {
		_totalPayment = totalPayment;
	}

	@Override
	public long getPaymentType() {
		return _paymentType;
	}

	@Override
	public void setPaymentType(long paymentType) {
		_paymentType = paymentType;
	}

	@Override
	public int getMarkAsDeleted() {
		return _markAsDeleted;
	}

	@Override
	public void setMarkAsDeleted(int markAsDeleted) {
		_columnBitmask |= MARKASDELETED_COLUMN_BITMASK;

		if (!_setOriginalMarkAsDeleted) {
			_setOriginalMarkAsDeleted = true;

			_originalMarkAsDeleted = _markAsDeleted;
		}

		_markAsDeleted = markAsDeleted;
	}

	public int getOriginalMarkAsDeleted() {
		return _originalMarkAsDeleted;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DebitNote.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DebitNote toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DebitNote)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DebitNoteImpl debitNoteImpl = new DebitNoteImpl();

		debitNoteImpl.setId(getId());
		debitNoteImpl.setDebitNoteNumber(getDebitNoteNumber());
		debitNoteImpl.setTransactionId(getTransactionId());
		debitNoteImpl.setCorporationId(getCorporationId());
		debitNoteImpl.setFinancialAccountant(getFinancialAccountant());
		debitNoteImpl.setOrganization(getOrganization());
		debitNoteImpl.setDivision(getDivision());
		debitNoteImpl.setReportBy(getReportBy());
		debitNoteImpl.setReportDate(getReportDate());
		debitNoteImpl.setFromDate(getFromDate());
		debitNoteImpl.setToDate(getToDate());
		debitNoteImpl.setAttachedFile(getAttachedFile());
		debitNoteImpl.setTotalPayment(getTotalPayment());
		debitNoteImpl.setPaymentType(getPaymentType());
		debitNoteImpl.setMarkAsDeleted(getMarkAsDeleted());

		debitNoteImpl.resetOriginalValues();

		return debitNoteImpl;
	}

	@Override
	public int compareTo(DebitNote debitNote) {
		int value = 0;

		if (getId() < debitNote.getId()) {
			value = -1;
		}
		else if (getId() > debitNote.getId()) {
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

		if (!(obj instanceof DebitNote)) {
			return false;
		}

		DebitNote debitNote = (DebitNote)obj;

		long primaryKey = debitNote.getPrimaryKey();

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
		DebitNoteModelImpl debitNoteModelImpl = this;

		debitNoteModelImpl._originalDebitNoteNumber = debitNoteModelImpl._debitNoteNumber;

		debitNoteModelImpl._originalTransactionId = debitNoteModelImpl._transactionId;

		debitNoteModelImpl._originalMarkAsDeleted = debitNoteModelImpl._markAsDeleted;

		debitNoteModelImpl._setOriginalMarkAsDeleted = false;

		debitNoteModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DebitNote> toCacheModel() {
		DebitNoteCacheModel debitNoteCacheModel = new DebitNoteCacheModel();

		debitNoteCacheModel.id = getId();

		debitNoteCacheModel.debitNoteNumber = getDebitNoteNumber();

		String debitNoteNumber = debitNoteCacheModel.debitNoteNumber;

		if ((debitNoteNumber != null) && (debitNoteNumber.length() == 0)) {
			debitNoteCacheModel.debitNoteNumber = null;
		}

		debitNoteCacheModel.transactionId = getTransactionId();

		String transactionId = debitNoteCacheModel.transactionId;

		if ((transactionId != null) && (transactionId.length() == 0)) {
			debitNoteCacheModel.transactionId = null;
		}

		debitNoteCacheModel.corporationId = getCorporationId();

		String corporationId = debitNoteCacheModel.corporationId;

		if ((corporationId != null) && (corporationId.length() == 0)) {
			debitNoteCacheModel.corporationId = null;
		}

		debitNoteCacheModel.financialAccountant = getFinancialAccountant();

		String financialAccountant = debitNoteCacheModel.financialAccountant;

		if ((financialAccountant != null) &&
				(financialAccountant.length() == 0)) {
			debitNoteCacheModel.financialAccountant = null;
		}

		debitNoteCacheModel.organization = getOrganization();

		String organization = debitNoteCacheModel.organization;

		if ((organization != null) && (organization.length() == 0)) {
			debitNoteCacheModel.organization = null;
		}

		debitNoteCacheModel.division = getDivision();

		String division = debitNoteCacheModel.division;

		if ((division != null) && (division.length() == 0)) {
			debitNoteCacheModel.division = null;
		}

		debitNoteCacheModel.reportBy = getReportBy();

		String reportBy = debitNoteCacheModel.reportBy;

		if ((reportBy != null) && (reportBy.length() == 0)) {
			debitNoteCacheModel.reportBy = null;
		}

		Date reportDate = getReportDate();

		if (reportDate != null) {
			debitNoteCacheModel.reportDate = reportDate.getTime();
		}
		else {
			debitNoteCacheModel.reportDate = Long.MIN_VALUE;
		}

		Date fromDate = getFromDate();

		if (fromDate != null) {
			debitNoteCacheModel.fromDate = fromDate.getTime();
		}
		else {
			debitNoteCacheModel.fromDate = Long.MIN_VALUE;
		}

		Date toDate = getToDate();

		if (toDate != null) {
			debitNoteCacheModel.toDate = toDate.getTime();
		}
		else {
			debitNoteCacheModel.toDate = Long.MIN_VALUE;
		}

		debitNoteCacheModel.attachedFile = getAttachedFile();

		debitNoteCacheModel.totalPayment = getTotalPayment();

		debitNoteCacheModel.paymentType = getPaymentType();

		debitNoteCacheModel.markAsDeleted = getMarkAsDeleted();

		return debitNoteCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", debitNoteNumber=");
		sb.append(getDebitNoteNumber());
		sb.append(", transactionId=");
		sb.append(getTransactionId());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", financialAccountant=");
		sb.append(getFinancialAccountant());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", reportBy=");
		sb.append(getReportBy());
		sb.append(", reportDate=");
		sb.append(getReportDate());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", totalPayment=");
		sb.append(getTotalPayment());
		sb.append(", paymentType=");
		sb.append(getPaymentType());
		sb.append(", markAsDeleted=");
		sb.append(getMarkAsDeleted());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>debitNoteNumber</column-name><column-value><![CDATA[");
		sb.append(getDebitNoteNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transactionId</column-name><column-value><![CDATA[");
		sb.append(getTransactionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>financialAccountant</column-name><column-value><![CDATA[");
		sb.append(getFinancialAccountant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportBy</column-name><column-value><![CDATA[");
		sb.append(getReportBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportDate</column-name><column-value><![CDATA[");
		sb.append(getReportDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalPayment</column-name><column-value><![CDATA[");
		sb.append(getTotalPayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentType</column-name><column-value><![CDATA[");
		sb.append(getPaymentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAsDeleted</column-name><column-value><![CDATA[");
		sb.append(getMarkAsDeleted());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DebitNote.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DebitNote.class
		};
	private long _id;
	private String _debitNoteNumber;
	private String _originalDebitNoteNumber;
	private String _transactionId;
	private String _originalTransactionId;
	private String _corporationId;
	private String _financialAccountant;
	private String _organization;
	private String _division;
	private String _reportBy;
	private Date _reportDate;
	private Date _fromDate;
	private Date _toDate;
	private long _attachedFile;
	private double _totalPayment;
	private long _paymentType;
	private int _markAsDeleted;
	private int _originalMarkAsDeleted;
	private boolean _setOriginalMarkAsDeleted;
	private long _columnBitmask;
	private DebitNote _escapedModel;
}