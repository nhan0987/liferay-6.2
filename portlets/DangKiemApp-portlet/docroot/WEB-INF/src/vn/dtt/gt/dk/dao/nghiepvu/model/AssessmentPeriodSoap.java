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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentPeriodServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentPeriodServiceSoap
 * @generated
 */
public class AssessmentPeriodSoap implements Serializable {
	public static AssessmentPeriodSoap toSoapModel(AssessmentPeriod model) {
		AssessmentPeriodSoap soapModel = new AssessmentPeriodSoap();

		soapModel.setId(model.getId());
		soapModel.setAssessmentid(model.getAssessmentid());
		soapModel.setAssessmentyear(model.getAssessmentyear());
		soapModel.setEvaluationperiod(model.getEvaluationperiod());
		soapModel.setImporterchecked(model.getImporterchecked());
		soapModel.setInspectorchecked(model.getInspectorchecked());
		soapModel.setProductionchecked(model.getProductionchecked());
		soapModel.setSynchdate(model.getSynchdate());
		soapModel.setPreviousassessmentid(model.getPreviousassessmentid());
		soapModel.setPreviousassessmentyear(model.getPreviousassessmentyear());

		return soapModel;
	}

	public static AssessmentPeriodSoap[] toSoapModels(AssessmentPeriod[] models) {
		AssessmentPeriodSoap[] soapModels = new AssessmentPeriodSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssessmentPeriodSoap[][] toSoapModels(
		AssessmentPeriod[][] models) {
		AssessmentPeriodSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssessmentPeriodSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssessmentPeriodSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssessmentPeriodSoap[] toSoapModels(
		List<AssessmentPeriod> models) {
		List<AssessmentPeriodSoap> soapModels = new ArrayList<AssessmentPeriodSoap>(models.size());

		for (AssessmentPeriod model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssessmentPeriodSoap[soapModels.size()]);
	}

	public AssessmentPeriodSoap() {
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

	public int getImporterchecked() {
		return _importerchecked;
	}

	public void setImporterchecked(int importerchecked) {
		_importerchecked = importerchecked;
	}

	public int getInspectorchecked() {
		return _inspectorchecked;
	}

	public void setInspectorchecked(int inspectorchecked) {
		_inspectorchecked = inspectorchecked;
	}

	public int getProductionchecked() {
		return _productionchecked;
	}

	public void setProductionchecked(int productionchecked) {
		_productionchecked = productionchecked;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	public String getPreviousassessmentid() {
		return _previousassessmentid;
	}

	public void setPreviousassessmentid(String previousassessmentid) {
		_previousassessmentid = previousassessmentid;
	}

	public String getPreviousassessmentyear() {
		return _previousassessmentyear;
	}

	public void setPreviousassessmentyear(String previousassessmentyear) {
		_previousassessmentyear = previousassessmentyear;
	}

	private long _id;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private int _importerchecked;
	private int _inspectorchecked;
	private int _productionchecked;
	private Date _synchdate;
	private String _previousassessmentid;
	private String _previousassessmentyear;
}