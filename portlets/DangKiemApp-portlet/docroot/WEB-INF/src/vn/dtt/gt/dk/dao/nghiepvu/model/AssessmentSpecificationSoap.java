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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentSpecificationServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentSpecificationServiceSoap
 * @generated
 */
public class AssessmentSpecificationSoap implements Serializable {
	public static AssessmentSpecificationSoap toSoapModel(
		AssessmentSpecification model) {
		AssessmentSpecificationSoap soapModel = new AssessmentSpecificationSoap();

		soapModel.setId(model.getId());
		soapModel.setAssessmenttype(model.getAssessmenttype());
		soapModel.setImportercode(model.getImportercode());
		soapModel.setInspectorcontactcode(model.getInspectorcontactcode());
		soapModel.setProductioncode(model.getProductioncode());
		soapModel.setSpecificationcategory(model.getSpecificationcategory());
		soapModel.setSpecificationgroupcode(model.getSpecificationgroupcode());
		soapModel.setSpecificationsequence(model.getSpecificationsequence());
		soapModel.setSpecificationcode(model.getSpecificationcode());
		soapModel.setSpecificationname(model.getSpecificationname());
		soapModel.setSpecificationvalue(model.getSpecificationvalue());
		soapModel.setSpecificationdescription(model.getSpecificationdescription());
		soapModel.setAssessmentcoefficient(model.getAssessmentcoefficient());
		soapModel.setAssessmentindex(model.getAssessmentindex());
		soapModel.setAssessmentmark(model.getAssessmentmark());
		soapModel.setAssessmentid(model.getAssessmentid());
		soapModel.setAssessmentyear(model.getAssessmentyear());
		soapModel.setEvaluationperiod(model.getEvaluationperiod());
		soapModel.setLatestassessment(model.getLatestassessment());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static AssessmentSpecificationSoap[] toSoapModels(
		AssessmentSpecification[] models) {
		AssessmentSpecificationSoap[] soapModels = new AssessmentSpecificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssessmentSpecificationSoap[][] toSoapModels(
		AssessmentSpecification[][] models) {
		AssessmentSpecificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssessmentSpecificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssessmentSpecificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssessmentSpecificationSoap[] toSoapModels(
		List<AssessmentSpecification> models) {
		List<AssessmentSpecificationSoap> soapModels = new ArrayList<AssessmentSpecificationSoap>(models.size());

		for (AssessmentSpecification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssessmentSpecificationSoap[soapModels.size()]);
	}

	public AssessmentSpecificationSoap() {
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

	public String getAssessmenttype() {
		return _assessmenttype;
	}

	public void setAssessmenttype(String assessmenttype) {
		_assessmenttype = assessmenttype;
	}

	public String getImportercode() {
		return _importercode;
	}

	public void setImportercode(String importercode) {
		_importercode = importercode;
	}

	public String getInspectorcontactcode() {
		return _inspectorcontactcode;
	}

	public void setInspectorcontactcode(String inspectorcontactcode) {
		_inspectorcontactcode = inspectorcontactcode;
	}

	public String getProductioncode() {
		return _productioncode;
	}

	public void setProductioncode(String productioncode) {
		_productioncode = productioncode;
	}

	public String getSpecificationcategory() {
		return _specificationcategory;
	}

	public void setSpecificationcategory(String specificationcategory) {
		_specificationcategory = specificationcategory;
	}

	public String getSpecificationgroupcode() {
		return _specificationgroupcode;
	}

	public void setSpecificationgroupcode(String specificationgroupcode) {
		_specificationgroupcode = specificationgroupcode;
	}

	public int getSpecificationsequence() {
		return _specificationsequence;
	}

	public void setSpecificationsequence(int specificationsequence) {
		_specificationsequence = specificationsequence;
	}

	public String getSpecificationcode() {
		return _specificationcode;
	}

	public void setSpecificationcode(String specificationcode) {
		_specificationcode = specificationcode;
	}

	public String getSpecificationname() {
		return _specificationname;
	}

	public void setSpecificationname(String specificationname) {
		_specificationname = specificationname;
	}

	public String getSpecificationvalue() {
		return _specificationvalue;
	}

	public void setSpecificationvalue(String specificationvalue) {
		_specificationvalue = specificationvalue;
	}

	public String getSpecificationdescription() {
		return _specificationdescription;
	}

	public void setSpecificationdescription(String specificationdescription) {
		_specificationdescription = specificationdescription;
	}

	public double getAssessmentcoefficient() {
		return _assessmentcoefficient;
	}

	public void setAssessmentcoefficient(double assessmentcoefficient) {
		_assessmentcoefficient = assessmentcoefficient;
	}

	public double getAssessmentindex() {
		return _assessmentindex;
	}

	public void setAssessmentindex(double assessmentindex) {
		_assessmentindex = assessmentindex;
	}

	public double getAssessmentmark() {
		return _assessmentmark;
	}

	public void setAssessmentmark(double assessmentmark) {
		_assessmentmark = assessmentmark;
	}

	public String getAssessmentid() {
		return _assessmentid;
	}

	public void setAssessmentid(String assessmentid) {
		_assessmentid = assessmentid;
	}

	public String getAssessmentyear() {
		return _assessmentyear;
	}

	public void setAssessmentyear(String assessmentyear) {
		_assessmentyear = assessmentyear;
	}

	public String getEvaluationperiod() {
		return _evaluationperiod;
	}

	public void setEvaluationperiod(String evaluationperiod) {
		_evaluationperiod = evaluationperiod;
	}

	public Date getLatestassessment() {
		return _latestassessment;
	}

	public void setLatestassessment(Date latestassessment) {
		_latestassessment = latestassessment;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private String _assessmenttype;
	private String _importercode;
	private String _inspectorcontactcode;
	private String _productioncode;
	private String _specificationcategory;
	private String _specificationgroupcode;
	private int _specificationsequence;
	private String _specificationcode;
	private String _specificationname;
	private String _specificationvalue;
	private String _specificationdescription;
	private double _assessmentcoefficient;
	private double _assessmentindex;
	private double _assessmentmark;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
}