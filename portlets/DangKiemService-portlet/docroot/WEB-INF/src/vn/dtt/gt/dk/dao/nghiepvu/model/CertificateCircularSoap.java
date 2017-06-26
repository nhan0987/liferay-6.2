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
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
public class CertificateCircularSoap implements Serializable {
	public static CertificateCircularSoap toSoapModel(CertificateCircular model) {
		CertificateCircularSoap soapModel = new CertificateCircularSoap();

		soapModel.setId(model.getId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setCircularNo(model.getCircularNo());
		soapModel.setCircularDate(model.getCircularDate());

		return soapModel;
	}

	public static CertificateCircularSoap[] toSoapModels(
		CertificateCircular[] models) {
		CertificateCircularSoap[] soapModels = new CertificateCircularSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CertificateCircularSoap[][] toSoapModels(
		CertificateCircular[][] models) {
		CertificateCircularSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CertificateCircularSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CertificateCircularSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CertificateCircularSoap[] toSoapModels(
		List<CertificateCircular> models) {
		List<CertificateCircularSoap> soapModels = new ArrayList<CertificateCircularSoap>(models.size());

		for (CertificateCircular model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CertificateCircularSoap[soapModels.size()]);
	}

	public CertificateCircularSoap() {
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

	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getCircularNo() {
		return _circularNo;
	}

	public void setCircularNo(String circularNo) {
		_circularNo = circularNo;
	}

	public Date getCircularDate() {
		return _circularDate;
	}

	public void setCircularDate(Date circularDate) {
		_circularDate = circularDate;
	}

	private long _id;
	private long _certificateRecordId;
	private long _sequenceNo;
	private String _circularNo;
	private Date _circularDate;
}