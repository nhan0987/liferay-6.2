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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.SatetyTestReportSpecServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.SatetyTestReportSpecServiceSoap
 * @generated
 */
public class SatetyTestReportSpecSoap implements Serializable {
	public static SatetyTestReportSpecSoap toSoapModel(
		SatetyTestReportSpec model) {
		SatetyTestReportSpecSoap soapModel = new SatetyTestReportSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setSaftyTestReportId(model.getSaftyTestReportId());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationValue(model.getSpecificationValue());
		soapModel.setEvaluationResult(model.getEvaluationResult());

		return soapModel;
	}

	public static SatetyTestReportSpecSoap[] toSoapModels(
		SatetyTestReportSpec[] models) {
		SatetyTestReportSpecSoap[] soapModels = new SatetyTestReportSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SatetyTestReportSpecSoap[][] toSoapModels(
		SatetyTestReportSpec[][] models) {
		SatetyTestReportSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SatetyTestReportSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SatetyTestReportSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SatetyTestReportSpecSoap[] toSoapModels(
		List<SatetyTestReportSpec> models) {
		List<SatetyTestReportSpecSoap> soapModels = new ArrayList<SatetyTestReportSpecSoap>(models.size());

		for (SatetyTestReportSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SatetyTestReportSpecSoap[soapModels.size()]);
	}

	public SatetyTestReportSpecSoap() {
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

	public long getSaftyTestReportId() {
		return _saftyTestReportId;
	}

	public void setSaftyTestReportId(long saftyTestReportId) {
		_saftyTestReportId = saftyTestReportId;
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

	public long getEvaluationResult() {
		return _evaluationResult;
	}

	public void setEvaluationResult(long evaluationResult) {
		_evaluationResult = evaluationResult;
	}

	private long _id;
	private long _saftyTestReportId;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _evaluationResult;
}