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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AssessmentofInspectionMethod}.
 * </p>
 *
 * @author win_64
 * @see AssessmentofInspectionMethod
 * @generated
 */
public class AssessmentofInspectionMethodWrapper
	implements AssessmentofInspectionMethod,
		ModelWrapper<AssessmentofInspectionMethod> {
	public AssessmentofInspectionMethodWrapper(
		AssessmentofInspectionMethod assessmentofInspectionMethod) {
		_assessmentofInspectionMethod = assessmentofInspectionMethod;
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentofInspectionMethod.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentofInspectionMethod.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("methodcode", getMethodcode());
		attributes.put("methodname", getMethodname());
		attributes.put("methodsequenceno", getMethodsequenceno());
		attributes.put("methoddescription", getMethoddescription());
		attributes.put("methodcodereference", getMethodcodereference());
		attributes.put("methodnamereference", getMethodnamereference());
		attributes.put("ImporterRiskDescription", getImporterRiskDescription());
		attributes.put("A1MarkFloor", getA1MarkFloor());
		attributes.put("A1MarkCeil", getA1MarkCeil());
		attributes.put("ProductRiskDescription", getProductRiskDescription());
		attributes.put("A301MarkFloor", getA301MarkFloor());
		attributes.put("A301MarkCeil", getA301MarkCeil());
		attributes.put("PurposeRiskDescription", getPurposeRiskDescription());
		attributes.put("A302Mark", getA302Mark());
		attributes.put("CertifiedRiskDescription", getCertifiedRiskDescription());
		attributes.put("A304Mark", getA304Mark());
		attributes.put("UsageRiskDescription", getUsageRiskDescription());
		attributes.put("A303Mark", getA303Mark());
		attributes.put("TransportRiskDescription", getTransportRiskDescription());
		attributes.put("A305Mark", getA305Mark());
		attributes.put("maker", getMaker());
		attributes.put("checker", getChecker());
		attributes.put("approver", getApprover());
		attributes.put("makermodified", getMakermodified());
		attributes.put("checkermodified", getCheckermodified());
		attributes.put("approvermodified", getApprovermodified());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessmentyear", getAssessmentyear());
		attributes.put("evaluationperiod", getEvaluationperiod());
		attributes.put("latestassessment", getLatestassessment());
		attributes.put("synchdate", getSynchdate());
		attributes.put("nextassessmentid", getNextassessmentid());
		attributes.put("nextassessmentyear", getNextassessmentyear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String methodcode = (String)attributes.get("methodcode");

		if (methodcode != null) {
			setMethodcode(methodcode);
		}

		String methodname = (String)attributes.get("methodname");

		if (methodname != null) {
			setMethodname(methodname);
		}

		Integer methodsequenceno = (Integer)attributes.get("methodsequenceno");

		if (methodsequenceno != null) {
			setMethodsequenceno(methodsequenceno);
		}

		String methoddescription = (String)attributes.get("methoddescription");

		if (methoddescription != null) {
			setMethoddescription(methoddescription);
		}

		String methodcodereference = (String)attributes.get(
				"methodcodereference");

		if (methodcodereference != null) {
			setMethodcodereference(methodcodereference);
		}

		String methodnamereference = (String)attributes.get(
				"methodnamereference");

		if (methodnamereference != null) {
			setMethodnamereference(methodnamereference);
		}

		String ImporterRiskDescription = (String)attributes.get(
				"ImporterRiskDescription");

		if (ImporterRiskDescription != null) {
			setImporterRiskDescription(ImporterRiskDescription);
		}

		Double A1MarkFloor = (Double)attributes.get("A1MarkFloor");

		if (A1MarkFloor != null) {
			setA1MarkFloor(A1MarkFloor);
		}

		Double A1MarkCeil = (Double)attributes.get("A1MarkCeil");

		if (A1MarkCeil != null) {
			setA1MarkCeil(A1MarkCeil);
		}

		String ProductRiskDescription = (String)attributes.get(
				"ProductRiskDescription");

		if (ProductRiskDescription != null) {
			setProductRiskDescription(ProductRiskDescription);
		}

		Double A301MarkFloor = (Double)attributes.get("A301MarkFloor");

		if (A301MarkFloor != null) {
			setA301MarkFloor(A301MarkFloor);
		}

		Double A301MarkCeil = (Double)attributes.get("A301MarkCeil");

		if (A301MarkCeil != null) {
			setA301MarkCeil(A301MarkCeil);
		}

		String PurposeRiskDescription = (String)attributes.get(
				"PurposeRiskDescription");

		if (PurposeRiskDescription != null) {
			setPurposeRiskDescription(PurposeRiskDescription);
		}

		Double A302Mark = (Double)attributes.get("A302Mark");

		if (A302Mark != null) {
			setA302Mark(A302Mark);
		}

		String CertifiedRiskDescription = (String)attributes.get(
				"CertifiedRiskDescription");

		if (CertifiedRiskDescription != null) {
			setCertifiedRiskDescription(CertifiedRiskDescription);
		}

		Double A304Mark = (Double)attributes.get("A304Mark");

		if (A304Mark != null) {
			setA304Mark(A304Mark);
		}

		String UsageRiskDescription = (String)attributes.get(
				"UsageRiskDescription");

		if (UsageRiskDescription != null) {
			setUsageRiskDescription(UsageRiskDescription);
		}

		Double A303Mark = (Double)attributes.get("A303Mark");

		if (A303Mark != null) {
			setA303Mark(A303Mark);
		}

		String TransportRiskDescription = (String)attributes.get(
				"TransportRiskDescription");

		if (TransportRiskDescription != null) {
			setTransportRiskDescription(TransportRiskDescription);
		}

		Double A305Mark = (Double)attributes.get("A305Mark");

		if (A305Mark != null) {
			setA305Mark(A305Mark);
		}

		String maker = (String)attributes.get("maker");

		if (maker != null) {
			setMaker(maker);
		}

		String checker = (String)attributes.get("checker");

		if (checker != null) {
			setChecker(checker);
		}

		String approver = (String)attributes.get("approver");

		if (approver != null) {
			setApprover(approver);
		}

		Date makermodified = (Date)attributes.get("makermodified");

		if (makermodified != null) {
			setMakermodified(makermodified);
		}

		Date checkermodified = (Date)attributes.get("checkermodified");

		if (checkermodified != null) {
			setCheckermodified(checkermodified);
		}

		Date approvermodified = (Date)attributes.get("approvermodified");

		if (approvermodified != null) {
			setApprovermodified(approvermodified);
		}

		String assessmentid = (String)attributes.get("assessmentid");

		if (assessmentid != null) {
			setAssessmentid(assessmentid);
		}

		String assessmentyear = (String)attributes.get("assessmentyear");

		if (assessmentyear != null) {
			setAssessmentyear(assessmentyear);
		}

		String evaluationperiod = (String)attributes.get("evaluationperiod");

		if (evaluationperiod != null) {
			setEvaluationperiod(evaluationperiod);
		}

		Date latestassessment = (Date)attributes.get("latestassessment");

		if (latestassessment != null) {
			setLatestassessment(latestassessment);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}

		String nextassessmentid = (String)attributes.get("nextassessmentid");

		if (nextassessmentid != null) {
			setNextassessmentid(nextassessmentid);
		}

		String nextassessmentyear = (String)attributes.get("nextassessmentyear");

		if (nextassessmentyear != null) {
			setNextassessmentyear(nextassessmentyear);
		}
	}

	/**
	* Returns the primary key of this assessmentof inspection method.
	*
	* @return the primary key of this assessmentof inspection method
	*/
	@Override
	public long getPrimaryKey() {
		return _assessmentofInspectionMethod.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessmentof inspection method.
	*
	* @param primaryKey the primary key of this assessmentof inspection method
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assessmentofInspectionMethod.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this assessmentof inspection method.
	*
	* @return the ID of this assessmentof inspection method
	*/
	@Override
	public long getId() {
		return _assessmentofInspectionMethod.getId();
	}

	/**
	* Sets the ID of this assessmentof inspection method.
	*
	* @param id the ID of this assessmentof inspection method
	*/
	@Override
	public void setId(long id) {
		_assessmentofInspectionMethod.setId(id);
	}

	/**
	* Returns the methodcode of this assessmentof inspection method.
	*
	* @return the methodcode of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getMethodcode() {
		return _assessmentofInspectionMethod.getMethodcode();
	}

	/**
	* Sets the methodcode of this assessmentof inspection method.
	*
	* @param methodcode the methodcode of this assessmentof inspection method
	*/
	@Override
	public void setMethodcode(java.lang.String methodcode) {
		_assessmentofInspectionMethod.setMethodcode(methodcode);
	}

	/**
	* Returns the methodname of this assessmentof inspection method.
	*
	* @return the methodname of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getMethodname() {
		return _assessmentofInspectionMethod.getMethodname();
	}

	/**
	* Sets the methodname of this assessmentof inspection method.
	*
	* @param methodname the methodname of this assessmentof inspection method
	*/
	@Override
	public void setMethodname(java.lang.String methodname) {
		_assessmentofInspectionMethod.setMethodname(methodname);
	}

	/**
	* Returns the methodsequenceno of this assessmentof inspection method.
	*
	* @return the methodsequenceno of this assessmentof inspection method
	*/
	@Override
	public int getMethodsequenceno() {
		return _assessmentofInspectionMethod.getMethodsequenceno();
	}

	/**
	* Sets the methodsequenceno of this assessmentof inspection method.
	*
	* @param methodsequenceno the methodsequenceno of this assessmentof inspection method
	*/
	@Override
	public void setMethodsequenceno(int methodsequenceno) {
		_assessmentofInspectionMethod.setMethodsequenceno(methodsequenceno);
	}

	/**
	* Returns the methoddescription of this assessmentof inspection method.
	*
	* @return the methoddescription of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getMethoddescription() {
		return _assessmentofInspectionMethod.getMethoddescription();
	}

	/**
	* Sets the methoddescription of this assessmentof inspection method.
	*
	* @param methoddescription the methoddescription of this assessmentof inspection method
	*/
	@Override
	public void setMethoddescription(java.lang.String methoddescription) {
		_assessmentofInspectionMethod.setMethoddescription(methoddescription);
	}

	/**
	* Returns the methodcodereference of this assessmentof inspection method.
	*
	* @return the methodcodereference of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getMethodcodereference() {
		return _assessmentofInspectionMethod.getMethodcodereference();
	}

	/**
	* Sets the methodcodereference of this assessmentof inspection method.
	*
	* @param methodcodereference the methodcodereference of this assessmentof inspection method
	*/
	@Override
	public void setMethodcodereference(java.lang.String methodcodereference) {
		_assessmentofInspectionMethod.setMethodcodereference(methodcodereference);
	}

	/**
	* Returns the methodnamereference of this assessmentof inspection method.
	*
	* @return the methodnamereference of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getMethodnamereference() {
		return _assessmentofInspectionMethod.getMethodnamereference();
	}

	/**
	* Sets the methodnamereference of this assessmentof inspection method.
	*
	* @param methodnamereference the methodnamereference of this assessmentof inspection method
	*/
	@Override
	public void setMethodnamereference(java.lang.String methodnamereference) {
		_assessmentofInspectionMethod.setMethodnamereference(methodnamereference);
	}

	/**
	* Returns the importer risk description of this assessmentof inspection method.
	*
	* @return the importer risk description of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getImporterRiskDescription() {
		return _assessmentofInspectionMethod.getImporterRiskDescription();
	}

	/**
	* Sets the importer risk description of this assessmentof inspection method.
	*
	* @param ImporterRiskDescription the importer risk description of this assessmentof inspection method
	*/
	@Override
	public void setImporterRiskDescription(
		java.lang.String ImporterRiskDescription) {
		_assessmentofInspectionMethod.setImporterRiskDescription(ImporterRiskDescription);
	}

	/**
	* Returns the a1 mark floor of this assessmentof inspection method.
	*
	* @return the a1 mark floor of this assessmentof inspection method
	*/
	@Override
	public double getA1MarkFloor() {
		return _assessmentofInspectionMethod.getA1MarkFloor();
	}

	/**
	* Sets the a1 mark floor of this assessmentof inspection method.
	*
	* @param A1MarkFloor the a1 mark floor of this assessmentof inspection method
	*/
	@Override
	public void setA1MarkFloor(double A1MarkFloor) {
		_assessmentofInspectionMethod.setA1MarkFloor(A1MarkFloor);
	}

	/**
	* Returns the a1 mark ceil of this assessmentof inspection method.
	*
	* @return the a1 mark ceil of this assessmentof inspection method
	*/
	@Override
	public double getA1MarkCeil() {
		return _assessmentofInspectionMethod.getA1MarkCeil();
	}

	/**
	* Sets the a1 mark ceil of this assessmentof inspection method.
	*
	* @param A1MarkCeil the a1 mark ceil of this assessmentof inspection method
	*/
	@Override
	public void setA1MarkCeil(double A1MarkCeil) {
		_assessmentofInspectionMethod.setA1MarkCeil(A1MarkCeil);
	}

	/**
	* Returns the product risk description of this assessmentof inspection method.
	*
	* @return the product risk description of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getProductRiskDescription() {
		return _assessmentofInspectionMethod.getProductRiskDescription();
	}

	/**
	* Sets the product risk description of this assessmentof inspection method.
	*
	* @param ProductRiskDescription the product risk description of this assessmentof inspection method
	*/
	@Override
	public void setProductRiskDescription(
		java.lang.String ProductRiskDescription) {
		_assessmentofInspectionMethod.setProductRiskDescription(ProductRiskDescription);
	}

	/**
	* Returns the a301 mark floor of this assessmentof inspection method.
	*
	* @return the a301 mark floor of this assessmentof inspection method
	*/
	@Override
	public double getA301MarkFloor() {
		return _assessmentofInspectionMethod.getA301MarkFloor();
	}

	/**
	* Sets the a301 mark floor of this assessmentof inspection method.
	*
	* @param A301MarkFloor the a301 mark floor of this assessmentof inspection method
	*/
	@Override
	public void setA301MarkFloor(double A301MarkFloor) {
		_assessmentofInspectionMethod.setA301MarkFloor(A301MarkFloor);
	}

	/**
	* Returns the a301 mark ceil of this assessmentof inspection method.
	*
	* @return the a301 mark ceil of this assessmentof inspection method
	*/
	@Override
	public double getA301MarkCeil() {
		return _assessmentofInspectionMethod.getA301MarkCeil();
	}

	/**
	* Sets the a301 mark ceil of this assessmentof inspection method.
	*
	* @param A301MarkCeil the a301 mark ceil of this assessmentof inspection method
	*/
	@Override
	public void setA301MarkCeil(double A301MarkCeil) {
		_assessmentofInspectionMethod.setA301MarkCeil(A301MarkCeil);
	}

	/**
	* Returns the purpose risk description of this assessmentof inspection method.
	*
	* @return the purpose risk description of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getPurposeRiskDescription() {
		return _assessmentofInspectionMethod.getPurposeRiskDescription();
	}

	/**
	* Sets the purpose risk description of this assessmentof inspection method.
	*
	* @param PurposeRiskDescription the purpose risk description of this assessmentof inspection method
	*/
	@Override
	public void setPurposeRiskDescription(
		java.lang.String PurposeRiskDescription) {
		_assessmentofInspectionMethod.setPurposeRiskDescription(PurposeRiskDescription);
	}

	/**
	* Returns the a302 mark of this assessmentof inspection method.
	*
	* @return the a302 mark of this assessmentof inspection method
	*/
	@Override
	public double getA302Mark() {
		return _assessmentofInspectionMethod.getA302Mark();
	}

	/**
	* Sets the a302 mark of this assessmentof inspection method.
	*
	* @param A302Mark the a302 mark of this assessmentof inspection method
	*/
	@Override
	public void setA302Mark(double A302Mark) {
		_assessmentofInspectionMethod.setA302Mark(A302Mark);
	}

	/**
	* Returns the certified risk description of this assessmentof inspection method.
	*
	* @return the certified risk description of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getCertifiedRiskDescription() {
		return _assessmentofInspectionMethod.getCertifiedRiskDescription();
	}

	/**
	* Sets the certified risk description of this assessmentof inspection method.
	*
	* @param CertifiedRiskDescription the certified risk description of this assessmentof inspection method
	*/
	@Override
	public void setCertifiedRiskDescription(
		java.lang.String CertifiedRiskDescription) {
		_assessmentofInspectionMethod.setCertifiedRiskDescription(CertifiedRiskDescription);
	}

	/**
	* Returns the a304 mark of this assessmentof inspection method.
	*
	* @return the a304 mark of this assessmentof inspection method
	*/
	@Override
	public double getA304Mark() {
		return _assessmentofInspectionMethod.getA304Mark();
	}

	/**
	* Sets the a304 mark of this assessmentof inspection method.
	*
	* @param A304Mark the a304 mark of this assessmentof inspection method
	*/
	@Override
	public void setA304Mark(double A304Mark) {
		_assessmentofInspectionMethod.setA304Mark(A304Mark);
	}

	/**
	* Returns the usage risk description of this assessmentof inspection method.
	*
	* @return the usage risk description of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getUsageRiskDescription() {
		return _assessmentofInspectionMethod.getUsageRiskDescription();
	}

	/**
	* Sets the usage risk description of this assessmentof inspection method.
	*
	* @param UsageRiskDescription the usage risk description of this assessmentof inspection method
	*/
	@Override
	public void setUsageRiskDescription(java.lang.String UsageRiskDescription) {
		_assessmentofInspectionMethod.setUsageRiskDescription(UsageRiskDescription);
	}

	/**
	* Returns the a303 mark of this assessmentof inspection method.
	*
	* @return the a303 mark of this assessmentof inspection method
	*/
	@Override
	public double getA303Mark() {
		return _assessmentofInspectionMethod.getA303Mark();
	}

	/**
	* Sets the a303 mark of this assessmentof inspection method.
	*
	* @param A303Mark the a303 mark of this assessmentof inspection method
	*/
	@Override
	public void setA303Mark(double A303Mark) {
		_assessmentofInspectionMethod.setA303Mark(A303Mark);
	}

	/**
	* Returns the transport risk description of this assessmentof inspection method.
	*
	* @return the transport risk description of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getTransportRiskDescription() {
		return _assessmentofInspectionMethod.getTransportRiskDescription();
	}

	/**
	* Sets the transport risk description of this assessmentof inspection method.
	*
	* @param TransportRiskDescription the transport risk description of this assessmentof inspection method
	*/
	@Override
	public void setTransportRiskDescription(
		java.lang.String TransportRiskDescription) {
		_assessmentofInspectionMethod.setTransportRiskDescription(TransportRiskDescription);
	}

	/**
	* Returns the a305 mark of this assessmentof inspection method.
	*
	* @return the a305 mark of this assessmentof inspection method
	*/
	@Override
	public double getA305Mark() {
		return _assessmentofInspectionMethod.getA305Mark();
	}

	/**
	* Sets the a305 mark of this assessmentof inspection method.
	*
	* @param A305Mark the a305 mark of this assessmentof inspection method
	*/
	@Override
	public void setA305Mark(double A305Mark) {
		_assessmentofInspectionMethod.setA305Mark(A305Mark);
	}

	/**
	* Returns the maker of this assessmentof inspection method.
	*
	* @return the maker of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getMaker() {
		return _assessmentofInspectionMethod.getMaker();
	}

	/**
	* Sets the maker of this assessmentof inspection method.
	*
	* @param maker the maker of this assessmentof inspection method
	*/
	@Override
	public void setMaker(java.lang.String maker) {
		_assessmentofInspectionMethod.setMaker(maker);
	}

	/**
	* Returns the checker of this assessmentof inspection method.
	*
	* @return the checker of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getChecker() {
		return _assessmentofInspectionMethod.getChecker();
	}

	/**
	* Sets the checker of this assessmentof inspection method.
	*
	* @param checker the checker of this assessmentof inspection method
	*/
	@Override
	public void setChecker(java.lang.String checker) {
		_assessmentofInspectionMethod.setChecker(checker);
	}

	/**
	* Returns the approver of this assessmentof inspection method.
	*
	* @return the approver of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getApprover() {
		return _assessmentofInspectionMethod.getApprover();
	}

	/**
	* Sets the approver of this assessmentof inspection method.
	*
	* @param approver the approver of this assessmentof inspection method
	*/
	@Override
	public void setApprover(java.lang.String approver) {
		_assessmentofInspectionMethod.setApprover(approver);
	}

	/**
	* Returns the makermodified of this assessmentof inspection method.
	*
	* @return the makermodified of this assessmentof inspection method
	*/
	@Override
	public java.util.Date getMakermodified() {
		return _assessmentofInspectionMethod.getMakermodified();
	}

	/**
	* Sets the makermodified of this assessmentof inspection method.
	*
	* @param makermodified the makermodified of this assessmentof inspection method
	*/
	@Override
	public void setMakermodified(java.util.Date makermodified) {
		_assessmentofInspectionMethod.setMakermodified(makermodified);
	}

	/**
	* Returns the checkermodified of this assessmentof inspection method.
	*
	* @return the checkermodified of this assessmentof inspection method
	*/
	@Override
	public java.util.Date getCheckermodified() {
		return _assessmentofInspectionMethod.getCheckermodified();
	}

	/**
	* Sets the checkermodified of this assessmentof inspection method.
	*
	* @param checkermodified the checkermodified of this assessmentof inspection method
	*/
	@Override
	public void setCheckermodified(java.util.Date checkermodified) {
		_assessmentofInspectionMethod.setCheckermodified(checkermodified);
	}

	/**
	* Returns the approvermodified of this assessmentof inspection method.
	*
	* @return the approvermodified of this assessmentof inspection method
	*/
	@Override
	public java.util.Date getApprovermodified() {
		return _assessmentofInspectionMethod.getApprovermodified();
	}

	/**
	* Sets the approvermodified of this assessmentof inspection method.
	*
	* @param approvermodified the approvermodified of this assessmentof inspection method
	*/
	@Override
	public void setApprovermodified(java.util.Date approvermodified) {
		_assessmentofInspectionMethod.setApprovermodified(approvermodified);
	}

	/**
	* Returns the assessmentid of this assessmentof inspection method.
	*
	* @return the assessmentid of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getAssessmentid() {
		return _assessmentofInspectionMethod.getAssessmentid();
	}

	/**
	* Sets the assessmentid of this assessmentof inspection method.
	*
	* @param assessmentid the assessmentid of this assessmentof inspection method
	*/
	@Override
	public void setAssessmentid(java.lang.String assessmentid) {
		_assessmentofInspectionMethod.setAssessmentid(assessmentid);
	}

	/**
	* Returns the assessmentyear of this assessmentof inspection method.
	*
	* @return the assessmentyear of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getAssessmentyear() {
		return _assessmentofInspectionMethod.getAssessmentyear();
	}

	/**
	* Sets the assessmentyear of this assessmentof inspection method.
	*
	* @param assessmentyear the assessmentyear of this assessmentof inspection method
	*/
	@Override
	public void setAssessmentyear(java.lang.String assessmentyear) {
		_assessmentofInspectionMethod.setAssessmentyear(assessmentyear);
	}

	/**
	* Returns the evaluationperiod of this assessmentof inspection method.
	*
	* @return the evaluationperiod of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getEvaluationperiod() {
		return _assessmentofInspectionMethod.getEvaluationperiod();
	}

	/**
	* Sets the evaluationperiod of this assessmentof inspection method.
	*
	* @param evaluationperiod the evaluationperiod of this assessmentof inspection method
	*/
	@Override
	public void setEvaluationperiod(java.lang.String evaluationperiod) {
		_assessmentofInspectionMethod.setEvaluationperiod(evaluationperiod);
	}

	/**
	* Returns the latestassessment of this assessmentof inspection method.
	*
	* @return the latestassessment of this assessmentof inspection method
	*/
	@Override
	public java.util.Date getLatestassessment() {
		return _assessmentofInspectionMethod.getLatestassessment();
	}

	/**
	* Sets the latestassessment of this assessmentof inspection method.
	*
	* @param latestassessment the latestassessment of this assessmentof inspection method
	*/
	@Override
	public void setLatestassessment(java.util.Date latestassessment) {
		_assessmentofInspectionMethod.setLatestassessment(latestassessment);
	}

	/**
	* Returns the synchdate of this assessmentof inspection method.
	*
	* @return the synchdate of this assessmentof inspection method
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _assessmentofInspectionMethod.getSynchdate();
	}

	/**
	* Sets the synchdate of this assessmentof inspection method.
	*
	* @param synchdate the synchdate of this assessmentof inspection method
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_assessmentofInspectionMethod.setSynchdate(synchdate);
	}

	/**
	* Returns the nextassessmentid of this assessmentof inspection method.
	*
	* @return the nextassessmentid of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getNextassessmentid() {
		return _assessmentofInspectionMethod.getNextassessmentid();
	}

	/**
	* Sets the nextassessmentid of this assessmentof inspection method.
	*
	* @param nextassessmentid the nextassessmentid of this assessmentof inspection method
	*/
	@Override
	public void setNextassessmentid(java.lang.String nextassessmentid) {
		_assessmentofInspectionMethod.setNextassessmentid(nextassessmentid);
	}

	/**
	* Returns the nextassessmentyear of this assessmentof inspection method.
	*
	* @return the nextassessmentyear of this assessmentof inspection method
	*/
	@Override
	public java.lang.String getNextassessmentyear() {
		return _assessmentofInspectionMethod.getNextassessmentyear();
	}

	/**
	* Sets the nextassessmentyear of this assessmentof inspection method.
	*
	* @param nextassessmentyear the nextassessmentyear of this assessmentof inspection method
	*/
	@Override
	public void setNextassessmentyear(java.lang.String nextassessmentyear) {
		_assessmentofInspectionMethod.setNextassessmentyear(nextassessmentyear);
	}

	@Override
	public boolean isNew() {
		return _assessmentofInspectionMethod.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assessmentofInspectionMethod.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assessmentofInspectionMethod.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assessmentofInspectionMethod.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assessmentofInspectionMethod.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assessmentofInspectionMethod.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessmentofInspectionMethod.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessmentofInspectionMethod.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assessmentofInspectionMethod.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assessmentofInspectionMethod.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessmentofInspectionMethod.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessmentofInspectionMethodWrapper((AssessmentofInspectionMethod)_assessmentofInspectionMethod.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod assessmentofInspectionMethod) {
		return _assessmentofInspectionMethod.compareTo(assessmentofInspectionMethod);
	}

	@Override
	public int hashCode() {
		return _assessmentofInspectionMethod.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> toCacheModel() {
		return _assessmentofInspectionMethod.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod toEscapedModel() {
		return new AssessmentofInspectionMethodWrapper(_assessmentofInspectionMethod.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod toUnescapedModel() {
		return new AssessmentofInspectionMethodWrapper(_assessmentofInspectionMethod.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessmentofInspectionMethod.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assessmentofInspectionMethod.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessmentofInspectionMethod.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentofInspectionMethodWrapper)) {
			return false;
		}

		AssessmentofInspectionMethodWrapper assessmentofInspectionMethodWrapper = (AssessmentofInspectionMethodWrapper)obj;

		if (Validator.equals(_assessmentofInspectionMethod,
					assessmentofInspectionMethodWrapper._assessmentofInspectionMethod)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssessmentofInspectionMethod getWrappedAssessmentofInspectionMethod() {
		return _assessmentofInspectionMethod;
	}

	@Override
	public AssessmentofInspectionMethod getWrappedModel() {
		return _assessmentofInspectionMethod;
	}

	@Override
	public void resetOriginalValues() {
		_assessmentofInspectionMethod.resetOriginalValues();
	}

	private AssessmentofInspectionMethod _assessmentofInspectionMethod;
}