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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionRecordSpecServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionRecordSpecServiceSoap
 * @generated
 */
public class InspectionRecordSpecSoap implements Serializable {
	public static InspectionRecordSpecSoap toSoapModel(
		InspectionRecordSpec model) {
		InspectionRecordSpecSoap soapModel = new InspectionRecordSpecSoap();

		soapModel.setId(model.getId());
		soapModel.setInspectionRecordid(model.getInspectionRecordid());
		soapModel.setSpecificationCode(model.getSpecificationCode());
		soapModel.setSpecificationName(model.getSpecificationName());
		soapModel.setSpecificationValue(model.getSpecificationValue());
		soapModel.setEvaluationResult(model.getEvaluationResult());

		return soapModel;
	}

	public static InspectionRecordSpecSoap[] toSoapModels(
		InspectionRecordSpec[] models) {
		InspectionRecordSpecSoap[] soapModels = new InspectionRecordSpecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InspectionRecordSpecSoap[][] toSoapModels(
		InspectionRecordSpec[][] models) {
		InspectionRecordSpecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InspectionRecordSpecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InspectionRecordSpecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InspectionRecordSpecSoap[] toSoapModels(
		List<InspectionRecordSpec> models) {
		List<InspectionRecordSpecSoap> soapModels = new ArrayList<InspectionRecordSpecSoap>(models.size());

		for (InspectionRecordSpec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InspectionRecordSpecSoap[soapModels.size()]);
	}

	public InspectionRecordSpecSoap() {
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

	public long getInspectionRecordid() {
		return _inspectionRecordid;
	}

	public void setInspectionRecordid(long inspectionRecordid) {
		_inspectionRecordid = inspectionRecordid;
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
	private long _inspectionRecordid;
	private String _specificationCode;
	private String _specificationName;
	private String _specificationValue;
	private long _evaluationResult;
}