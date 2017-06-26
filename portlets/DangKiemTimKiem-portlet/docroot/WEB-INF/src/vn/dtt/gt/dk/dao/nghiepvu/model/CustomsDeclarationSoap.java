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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.CustomsDeclarationServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.CustomsDeclarationServiceSoap
 * @generated
 */
public class CustomsDeclarationSoap implements Serializable {
	public static CustomsDeclarationSoap toSoapModel(CustomsDeclaration model) {
		CustomsDeclarationSoap soapModel = new CustomsDeclarationSoap();

		soapModel.setId(model.getId());
		soapModel.setImportCustomDeclareNo(model.getImportCustomDeclareNo());
		soapModel.setImportCustomDeclareDate(model.getImportCustomDeclareDate());
		soapModel.setCustomsResult(model.getCustomsResult());
		soapModel.setProductCheck(model.getProductCheck());
		soapModel.setReleaseDate(model.getReleaseDate());
		soapModel.setHosothutucId(model.getHosothutucId());

		return soapModel;
	}

	public static CustomsDeclarationSoap[] toSoapModels(
		CustomsDeclaration[] models) {
		CustomsDeclarationSoap[] soapModels = new CustomsDeclarationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomsDeclarationSoap[][] toSoapModels(
		CustomsDeclaration[][] models) {
		CustomsDeclarationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomsDeclarationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomsDeclarationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomsDeclarationSoap[] toSoapModels(
		List<CustomsDeclaration> models) {
		List<CustomsDeclarationSoap> soapModels = new ArrayList<CustomsDeclarationSoap>(models.size());

		for (CustomsDeclaration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomsDeclarationSoap[soapModels.size()]);
	}

	public CustomsDeclarationSoap() {
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

	public String getImportCustomDeclareNo() {
		return _importCustomDeclareNo;
	}

	public void setImportCustomDeclareNo(String importCustomDeclareNo) {
		_importCustomDeclareNo = importCustomDeclareNo;
	}

	public Date getImportCustomDeclareDate() {
		return _importCustomDeclareDate;
	}

	public void setImportCustomDeclareDate(Date importCustomDeclareDate) {
		_importCustomDeclareDate = importCustomDeclareDate;
	}

	public String getCustomsResult() {
		return _customsResult;
	}

	public void setCustomsResult(String customsResult) {
		_customsResult = customsResult;
	}

	public String getProductCheck() {
		return _productCheck;
	}

	public void setProductCheck(String productCheck) {
		_productCheck = productCheck;
	}

	public Date getReleaseDate() {
		return _releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		_releaseDate = releaseDate;
	}

	public long getHosothutucId() {
		return _hosothutucId;
	}

	public void setHosothutucId(long hosothutucId) {
		_hosothutucId = hosothutucId;
	}

	private long _id;
	private String _importCustomDeclareNo;
	private Date _importCustomDeclareDate;
	private String _customsResult;
	private String _productCheck;
	private Date _releaseDate;
	private long _hosothutucId;
}