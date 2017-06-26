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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CertificateRecordSpecServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CertificateRecordSpecServiceSoap
 * @generated
 */
public class CertificateRecordSpecSoap implements Serializable {
	public static CertificateRecordSpecSoap toSoapModel(
		CertificateRecordSpec model) {
		CertificateRecordSpecSoap soapModel = new CertificateRecordSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationValue(model.getSpecificationValue());
		soapModel.setVersion(model.getVersion());

		return soapModel;
	}

	public static CertificateRecordSpecSoap[] toSoapModels(
		CertificateRecordSpec[] models) {
		CertificateRecordSpecSoap[] soapModels = new CertificateRecordSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CertificateRecordSpecSoap[][] toSoapModels(
		CertificateRecordSpec[][] models) {
		CertificateRecordSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CertificateRecordSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CertificateRecordSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CertificateRecordSpecSoap[] toSoapModels(
		List<CertificateRecordSpec> models) {
		List<CertificateRecordSpecSoap> soapModels = new ArrayList<CertificateRecordSpecSoap>(models.size());

		for (CertificateRecordSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CertificateRecordSpecSoap[soapModels.size()]);
	}

	public CertificateRecordSpecSoap() {
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

	public String getSpecificationCode() {
		return _specificationCode;
	}

	public void setSpecificationCode(String specificationCode) {
		_specificationCode = specificationCode;
	}

	public String getSpecificationName() {
		return _specificationName;
	}

	public void setSpecificationName(String specificationName) {
		_specificationName = specificationName;
	}

	public String getSpecificationValue() {
		return _specificationValue;
	}

	public void setSpecificationValue(String specificationValue) {
		_specificationValue = specificationValue;
	}

	public long getVersion() {
		return _version;
	}

	public void setVersion(long version) {
		_version = version;
	}

	private long _id;
	private long _certificateRecordId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _version;
}