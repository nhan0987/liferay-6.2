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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentofInspectionMethodServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentofInspectionMethodServiceSoap
 * @generated
 */
public class AssessmentofInspectionMethodSoap implements Serializable {
	public static AssessmentofInspectionMethodSoap toSoapModel(
		AssessmentofInspectionMethod model) {
		AssessmentofInspectionMethodSoap soapModel = new AssessmentofInspectionMethodSoap();

		soapModel.setId(model.getId());
		soapModel.setMethodcode(model.getMethodcode());
		soapModel.setMethodname(model.getMethodname());
		soapModel.setMethodsequenceno(model.getMethodsequenceno());
		soapModel.setMethoddescription(model.getMethoddescription());
		soapModel.setMethodcodereference(model.getMethodcodereference());
		soapModel.setMethodnamereference(model.getMethodnamereference());
		soapModel.setImporterRiskDescription(model.getImporterRiskDescription());
		soapModel.setA1MarkFloor(model.getA1MarkFloor());
		soapModel.setA1MarkCeil(model.getA1MarkCeil());
		soapModel.setProductRiskDescription(model.getProductRiskDescription());
		soapModel.setA301MarkFloor(model.getA301MarkFloor());
		soapModel.setA301MarkCeil(model.getA301MarkCeil());
		soapModel.setPurposeRiskDescription(model.getPurposeRiskDescription());
		soapModel.setA302Mark(model.getA302Mark());
		soapModel.setCertifiedRiskDescription(model.getCertifiedRiskDescription());
		soapModel.setA304Mark(model.getA304Mark());
		soapModel.setUsageRiskDescription(model.getUsageRiskDescription());
		soapModel.setA303Mark(model.getA303Mark());
		soapModel.setTransportRiskDescription(model.getTransportRiskDescription());
		soapModel.setA305Mark(model.getA305Mark());
		soapModel.setMaker(model.getMaker());
		soapModel.setChecker(model.getChecker());
		soapModel.setApprover(model.getApprover());
		soapModel.setMakermodified(model.getMakermodified());
		soapModel.setCheckermodified(model.getCheckermodified());
		soapModel.setApprovermodified(model.getApprovermodified());
		soapModel.setAssessmentid(model.getAssessmentid());
		soapModel.setAssessmentyear(model.getAssessmentyear());
		soapModel.setEvaluationperiod(model.getEvaluationperiod());
		soapModel.setLatestassessment(model.getLatestassessment());
		soapModel.setSynchdate(model.getSynchdate());
		soapModel.setNextassessmentid(model.getNextassessmentid());
		soapModel.setNextassessmentyear(model.getNextassessmentyear());

		return soapModel;
	}

	public static AssessmentofInspectionMethodSoap[] toSoapModels(
		AssessmentofInspectionMethod[] models) {
		AssessmentofInspectionMethodSoap[] soapModels = new AssessmentofInspectionMethodSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssessmentofInspectionMethodSoap[][] toSoapModels(
		AssessmentofInspectionMethod[][] models) {
		AssessmentofInspectionMethodSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssessmentofInspectionMethodSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssessmentofInspectionMethodSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssessmentofInspectionMethodSoap[] toSoapModels(
		List<AssessmentofInspectionMethod> models) {
		List<AssessmentofInspectionMethodSoap> soapModels = new ArrayList<AssessmentofInspectionMethodSoap>(models.size());

		for (AssessmentofInspectionMethod model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssessmentofInspectionMethodSoap[soapModels.size()]);
	}

	public AssessmentofInspectionMethodSoap() {
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

	public String getMethodcode() {
		return _methodcode;
	}

	public void setMethodcode(String methodcode) {
		_methodcode = methodcode;
	}

	public String getMethodname() {
		return _methodname;
	}

	public void setMethodname(String methodname) {
		_methodname = methodname;
	}

	public int getMethodsequenceno() {
		return _methodsequenceno;
	}

	public void setMethodsequenceno(int methodsequenceno) {
		_methodsequenceno = methodsequenceno;
	}

	public String getMethoddescription() {
		return _methoddescription;
	}

	public void setMethoddescription(String methoddescription) {
		_methoddescription = methoddescription;
	}

	public String getMethodcodereference() {
		return _methodcodereference;
	}

	public void setMethodcodereference(String methodcodereference) {
		_methodcodereference = methodcodereference;
	}

	public String getMethodnamereference() {
		return _methodnamereference;
	}

	public void setMethodnamereference(String methodnamereference) {
		_methodnamereference = methodnamereference;
	}

	public String getImporterRiskDescription() {
		return _ImporterRiskDescription;
	}

	public void setImporterRiskDescription(String ImporterRiskDescription) {
		_ImporterRiskDescription = ImporterRiskDescription;
	}

	public double getA1MarkFloor() {
		return _A1MarkFloor;
	}

	public void setA1MarkFloor(double A1MarkFloor) {
		_A1MarkFloor = A1MarkFloor;
	}

	public double getA1MarkCeil() {
		return _A1MarkCeil;
	}

	public void setA1MarkCeil(double A1MarkCeil) {
		_A1MarkCeil = A1MarkCeil;
	}

	public String getProductRiskDescription() {
		return _ProductRiskDescription;
	}

	public void setProductRiskDescription(String ProductRiskDescription) {
		_ProductRiskDescription = ProductRiskDescription;
	}

	public double getA301MarkFloor() {
		return _A301MarkFloor;
	}

	public void setA301MarkFloor(double A301MarkFloor) {
		_A301MarkFloor = A301MarkFloor;
	}

	public double getA301MarkCeil() {
		return _A301MarkCeil;
	}

	public void setA301MarkCeil(double A301MarkCeil) {
		_A301MarkCeil = A301MarkCeil;
	}

	public String getPurposeRiskDescription() {
		return _PurposeRiskDescription;
	}

	public void setPurposeRiskDescription(String PurposeRiskDescription) {
		_PurposeRiskDescription = PurposeRiskDescription;
	}

	public double getA302Mark() {
		return _A302Mark;
	}

	public void setA302Mark(double A302Mark) {
		_A302Mark = A302Mark;
	}

	public String getCertifiedRiskDescription() {
		return _CertifiedRiskDescription;
	}

	public void setCertifiedRiskDescription(String CertifiedRiskDescription) {
		_CertifiedRiskDescription = CertifiedRiskDescription;
	}

	public double getA304Mark() {
		return _A304Mark;
	}

	public void setA304Mark(double A304Mark) {
		_A304Mark = A304Mark;
	}

	public String getUsageRiskDescription() {
		return _UsageRiskDescription;
	}

	public void setUsageRiskDescription(String UsageRiskDescription) {
		_UsageRiskDescription = UsageRiskDescription;
	}

	public double getA303Mark() {
		return _A303Mark;
	}

	public void setA303Mark(double A303Mark) {
		_A303Mark = A303Mark;
	}

	public String getTransportRiskDescription() {
		return _TransportRiskDescription;
	}

	public void setTransportRiskDescription(String TransportRiskDescription) {
		_TransportRiskDescription = TransportRiskDescription;
	}

	public double getA305Mark() {
		return _A305Mark;
	}

	public void setA305Mark(double A305Mark) {
		_A305Mark = A305Mark;
	}

	public String getMaker() {
		return _maker;
	}

	public void setMaker(String maker) {
		_maker = maker;
	}

	public String getChecker() {
		return _checker;
	}

	public void setChecker(String checker) {
		_checker = checker;
	}

	public String getApprover() {
		return _approver;
	}

	public void setApprover(String approver) {
		_approver = approver;
	}

	public Date getMakermodified() {
		return _makermodified;
	}

	public void setMakermodified(Date makermodified) {
		_makermodified = makermodified;
	}

	public Date getCheckermodified() {
		return _checkermodified;
	}

	public void setCheckermodified(Date checkermodified) {
		_checkermodified = checkermodified;
	}

	public Date getApprovermodified() {
		return _approvermodified;
	}

	public void setApprovermodified(Date approvermodified) {
		_approvermodified = approvermodified;
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

	public String getNextassessmentid() {
		return _nextassessmentid;
	}

	public void setNextassessmentid(String nextassessmentid) {
		_nextassessmentid = nextassessmentid;
	}

	public String getNextassessmentyear() {
		return _nextassessmentyear;
	}

	public void setNextassessmentyear(String nextassessmentyear) {
		_nextassessmentyear = nextassessmentyear;
	}

	private long _id;
	private String _methodcode;
	private String _methodname;
	private int _methodsequenceno;
	private String _methoddescription;
	private String _methodcodereference;
	private String _methodnamereference;
	private String _ImporterRiskDescription;
	private double _A1MarkFloor;
	private double _A1MarkCeil;
	private String _ProductRiskDescription;
	private double _A301MarkFloor;
	private double _A301MarkCeil;
	private String _PurposeRiskDescription;
	private double _A302Mark;
	private String _CertifiedRiskDescription;
	private double _A304Mark;
	private String _UsageRiskDescription;
	private double _A303Mark;
	private String _TransportRiskDescription;
	private double _A305Mark;
	private String _maker;
	private String _checker;
	private String _approver;
	private Date _makermodified;
	private Date _checkermodified;
	private Date _approvermodified;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
	private String _nextassessmentid;
	private String _nextassessmentyear;
}