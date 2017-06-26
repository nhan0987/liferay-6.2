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
 * This class is used by SOAP remote services.
 *
 * @author huymq
 * @generated
 */
public class DraftCertificateSpecSoap implements Serializable {
	public static DraftCertificateSpecSoap toSoapModel(
		DraftCertificateSpec model) {
		DraftCertificateSpecSoap soapModel = new DraftCertificateSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setDraftCertificateId(model.getDraftCertificateId());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationValue(model.getSpecificationValue());

		return soapModel;
	}

	public static DraftCertificateSpecSoap[] toSoapModels(
		DraftCertificateSpec[] models) {
		DraftCertificateSpecSoap[] soapModels = new DraftCertificateSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DraftCertificateSpecSoap[][] toSoapModels(
		DraftCertificateSpec[][] models) {
		DraftCertificateSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DraftCertificateSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DraftCertificateSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DraftCertificateSpecSoap[] toSoapModels(
		List<DraftCertificateSpec> models) {
		List<DraftCertificateSpecSoap> soapModels = new ArrayList<DraftCertificateSpecSoap>(models.size());

		for (DraftCertificateSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DraftCertificateSpecSoap[soapModels.size()]);
	}

	public DraftCertificateSpecSoap() {
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

	public long getDraftCertificateId() {
		return _draftCertificateId;
	}

	public void setDraftCertificateId(long draftCertificateId) {
		_draftCertificateId = draftCertificateId;
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

	private long _id;
	private long _draftCertificateId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
}