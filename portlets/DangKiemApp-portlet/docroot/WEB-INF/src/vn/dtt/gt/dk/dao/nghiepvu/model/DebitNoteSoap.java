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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.DebitNoteServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.DebitNoteServiceSoap
 * @generated
 */
public class DebitNoteSoap implements Serializable {
	public static DebitNoteSoap toSoapModel(DebitNote model) {
		DebitNoteSoap soapModel = new DebitNoteSoap();

		soapModel.setId(model.getId());
		soapModel.setDebitNoteNumber(model.getDebitNoteNumber());
		soapModel.setTransactionId(model.getTransactionId());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setFinancialAccountant(model.getFinancialAccountant());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setDivision(model.getDivision());
		soapModel.setReportBy(model.getReportBy());
		soapModel.setReportDate(model.getReportDate());
		soapModel.setFromDate(model.getFromDate());
		soapModel.setToDate(model.getToDate());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setTotalPayment(model.getTotalPayment());
		soapModel.setPaymentType(model.getPaymentType());
		soapModel.setMarkAsDeleted(model.getMarkAsDeleted());

		return soapModel;
	}

	public static DebitNoteSoap[] toSoapModels(DebitNote[] models) {
		DebitNoteSoap[] soapModels = new DebitNoteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DebitNoteSoap[][] toSoapModels(DebitNote[][] models) {
		DebitNoteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DebitNoteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DebitNoteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DebitNoteSoap[] toSoapModels(List<DebitNote> models) {
		List<DebitNoteSoap> soapModels = new ArrayList<DebitNoteSoap>(models.size());

		for (DebitNote model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DebitNoteSoap[soapModels.size()]);
	}

	public DebitNoteSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getDebitNoteNumber() {
		return _debitNoteNumber;
	}

	public void setDebitNoteNumber(String debitNoteNumber) {
		_debitNoteNumber = debitNoteNumber;
	}

	public String getTransactionId() {
		return _transactionId;
	}

	public void setTransactionId(String transactionId) {
		_transactionId = transactionId;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public String getFinancialAccountant() {
		return _financialAccountant;
	}

	public void setFinancialAccountant(String financialAccountant) {
		_financialAccountant = financialAccountant;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public String getReportBy() {
		return _reportBy;
	}

	public void setReportBy(String reportBy) {
		_reportBy = reportBy;
	}

	public Date getReportDate() {
		return _reportDate;
	}

	public void setReportDate(Date reportDate) {
		_reportDate = reportDate;
	}

	public Date getFromDate() {
		return _fromDate;
	}

	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;
	}

	public Date getToDate() {
		return _toDate;
	}

	public void setToDate(Date toDate) {
		_toDate = toDate;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public double getTotalPayment() {
		return _totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		_totalPayment = totalPayment;
	}

	public long getPaymentType() {
		return _paymentType;
	}

	public void setPaymentType(long paymentType) {
		_paymentType = paymentType;
	}

	public int getMarkAsDeleted() {
		return _markAsDeleted;
	}

	public void setMarkAsDeleted(int markAsDeleted) {
		_markAsDeleted = markAsDeleted;
	}

	private long _id;
	private String _debitNoteNumber;
	private String _transactionId;
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
}