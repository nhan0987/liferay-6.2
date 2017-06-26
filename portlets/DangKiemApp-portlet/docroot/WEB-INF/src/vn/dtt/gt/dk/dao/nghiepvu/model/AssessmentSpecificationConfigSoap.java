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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentSpecificationConfigServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentSpecificationConfigServiceSoap
 * @generated
 */
public class AssessmentSpecificationConfigSoap implements Serializable {
	public static AssessmentSpecificationConfigSoap toSoapModel(
		AssessmentSpecificationConfig model) {
		AssessmentSpecificationConfigSoap soapModel = new AssessmentSpecificationConfigSoap();

		soapModel.setId(model.getId());
		soapModel.setAssessmenttype(model.getAssessmenttype());
		soapModel.setSpecificationcategory(model.getSpecificationcategory());
		soapModel.setSpecificationgroupcode(model.getSpecificationgroupcode());
		soapModel.setSpecificationsequence(model.getSpecificationsequence());
		soapModel.setSpecificationcode(model.getSpecificationcode());
		soapModel.setSpecificationname(model.getSpecificationname());
		soapModel.setSpecificationdescription(model.getSpecificationdescription());
		soapModel.setAssessmentcoefficient(model.getAssessmentcoefficient());
		soapModel.setAssessmentindexmin(model.getAssessmentindexmin());
		soapModel.setAssessmentmarkmin(model.getAssessmentmarkmin());
		soapModel.setAssessmentindexmax(model.getAssessmentindexmax());
		soapModel.setAssessmentmarkmax(model.getAssessmentmarkmax());
		soapModel.setAssessmentid(model.getAssessmentid());
		soapModel.setAssessmentyear(model.getAssessmentyear());
		soapModel.setEvaluationperiod(model.getEvaluationperiod());
		soapModel.setLatestassessment(model.getLatestassessment());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static AssessmentSpecificationConfigSoap[] toSoapModels(
		AssessmentSpecificationConfig[] models) {
		AssessmentSpecificationConfigSoap[] soapModels = new AssessmentSpecificationConfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssessmentSpecificationConfigSoap[][] toSoapModels(
		AssessmentSpecificationConfig[][] models) {
		AssessmentSpecificationConfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssessmentSpecificationConfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssessmentSpecificationConfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssessmentSpecificationConfigSoap[] toSoapModels(
		List<AssessmentSpecificationConfig> models) {
		List<AssessmentSpecificationConfigSoap> soapModels = new ArrayList<AssessmentSpecificationConfigSoap>(models.size());

		for (AssessmentSpecificationConfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssessmentSpecificationConfigSoap[soapModels.size()]);
	}

	public AssessmentSpecificationConfigSoap() {
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

	public double getAssessmentindexmin() {
		return _assessmentindexmin;
	}

	public void setAssessmentindexmin(double assessmentindexmin) {
		_assessmentindexmin = assessmentindexmin;
	}

	public double getAssessmentmarkmin() {
		return _assessmentmarkmin;
	}

	public void setAssessmentmarkmin(double assessmentmarkmin) {
		_assessmentmarkmin = assessmentmarkmin;
	}

	public double getAssessmentindexmax() {
		return _assessmentindexmax;
	}

	public void setAssessmentindexmax(double assessmentindexmax) {
		_assessmentindexmax = assessmentindexmax;
	}

	public double getAssessmentmarkmax() {
		return _assessmentmarkmax;
	}

	public void setAssessmentmarkmax(double assessmentmarkmax) {
		_assessmentmarkmax = assessmentmarkmax;
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
	private String _specificationcategory;
	private String _specificationgroupcode;
	private int _specificationsequence;
	private String _specificationcode;
	private String _specificationname;
	private String _specificationdescription;
	private double _assessmentcoefficient;
	private double _assessmentindexmin;
	private double _assessmentmarkmin;
	private double _assessmentindexmax;
	private double _assessmentmarkmax;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
}