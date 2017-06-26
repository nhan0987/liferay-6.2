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

package vn.dtt.gt.dk.dao.report.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class DocumentStatisticsSoap implements Serializable {
	public static DocumentStatisticsSoap toSoapModel(DocumentStatistics model) {
		DocumentStatisticsSoap soapModel = new DocumentStatisticsSoap();

		soapModel.setId(model.getId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDocumentTypeCode(model.getDocumentTypeCode());
		soapModel.setRemainingNumber(model.getRemainingNumber());
		soapModel.setReceivedNumber(model.getReceivedNumber());
		soapModel.setOntimeNumber(model.getOntimeNumber());
		soapModel.setOvertimeNumber(model.getOvertimeNumber());
		soapModel.setProcessingNumber(model.getProcessingNumber());
		soapModel.setDelayingNumber(model.getDelayingNumber());
		soapModel.setMonth(model.getMonth());
		soapModel.setYear(model.getYear());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static DocumentStatisticsSoap[] toSoapModels(
		DocumentStatistics[] models) {
		DocumentStatisticsSoap[] soapModels = new DocumentStatisticsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentStatisticsSoap[][] toSoapModels(
		DocumentStatistics[][] models) {
		DocumentStatisticsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocumentStatisticsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentStatisticsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentStatisticsSoap[] toSoapModels(
		List<DocumentStatistics> models) {
		List<DocumentStatisticsSoap> soapModels = new ArrayList<DocumentStatisticsSoap>(models.size());

		for (DocumentStatistics model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocumentStatisticsSoap[soapModels.size()]);
	}

	public DocumentStatisticsSoap() {
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

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDocumentTypeCode() {
		return _documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;
	}

	public long getRemainingNumber() {
		return _remainingNumber;
	}

	public void setRemainingNumber(long remainingNumber) {
		_remainingNumber = remainingNumber;
	}

	public long getReceivedNumber() {
		return _receivedNumber;
	}

	public void setReceivedNumber(long receivedNumber) {
		_receivedNumber = receivedNumber;
	}

	public long getOntimeNumber() {
		return _ontimeNumber;
	}

	public void setOntimeNumber(long ontimeNumber) {
		_ontimeNumber = ontimeNumber;
	}

	public long getOvertimeNumber() {
		return _overtimeNumber;
	}

	public void setOvertimeNumber(long overtimeNumber) {
		_overtimeNumber = overtimeNumber;
	}

	public long getProcessingNumber() {
		return _processingNumber;
	}

	public void setProcessingNumber(long processingNumber) {
		_processingNumber = processingNumber;
	}

	public long getDelayingNumber() {
		return _delayingNumber;
	}

	public void setDelayingNumber(long delayingNumber) {
		_delayingNumber = delayingNumber;
	}

	public int getMonth() {
		return _month;
	}

	public void setMonth(int month) {
		_month = month;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _id;
	private Date _createDate;
	private Date _modifiedDate;
	private String _documentTypeCode;
	private long _remainingNumber;
	private long _receivedNumber;
	private long _ontimeNumber;
	private long _overtimeNumber;
	private long _processingNumber;
	private long _delayingNumber;
	private int _month;
	private int _year;
	private int _status;
}