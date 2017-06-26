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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AssessmentofInspectionMethodClp extends BaseModelImpl<AssessmentofInspectionMethod>
	implements AssessmentofInspectionMethod {
	public AssessmentofInspectionMethodClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMethodcode() {
		return _methodcode;
	}

	@Override
	public void setMethodcode(String methodcode) {
		_methodcode = methodcode;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMethodcode", String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					methodcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMethodname() {
		return _methodname;
	}

	@Override
	public void setMethodname(String methodname) {
		_methodname = methodname;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMethodname", String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					methodname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMethodsequenceno() {
		return _methodsequenceno;
	}

	@Override
	public void setMethodsequenceno(int methodsequenceno) {
		_methodsequenceno = methodsequenceno;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMethodsequenceno", int.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					methodsequenceno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMethoddescription() {
		return _methoddescription;
	}

	@Override
	public void setMethoddescription(String methoddescription) {
		_methoddescription = methoddescription;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMethoddescription",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					methoddescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMethodcodereference() {
		return _methodcodereference;
	}

	@Override
	public void setMethodcodereference(String methodcodereference) {
		_methodcodereference = methodcodereference;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMethodcodereference",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					methodcodereference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMethodnamereference() {
		return _methodnamereference;
	}

	@Override
	public void setMethodnamereference(String methodnamereference) {
		_methodnamereference = methodnamereference;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMethodnamereference",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					methodnamereference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterRiskDescription() {
		return _ImporterRiskDescription;
	}

	@Override
	public void setImporterRiskDescription(String ImporterRiskDescription) {
		_ImporterRiskDescription = ImporterRiskDescription;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterRiskDescription",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					ImporterRiskDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA1MarkFloor() {
		return _A1MarkFloor;
	}

	@Override
	public void setA1MarkFloor(double A1MarkFloor) {
		_A1MarkFloor = A1MarkFloor;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA1MarkFloor", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					A1MarkFloor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA1MarkCeil() {
		return _A1MarkCeil;
	}

	@Override
	public void setA1MarkCeil(double A1MarkCeil) {
		_A1MarkCeil = A1MarkCeil;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA1MarkCeil", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					A1MarkCeil);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductRiskDescription() {
		return _ProductRiskDescription;
	}

	@Override
	public void setProductRiskDescription(String ProductRiskDescription) {
		_ProductRiskDescription = ProductRiskDescription;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setProductRiskDescription",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					ProductRiskDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA301MarkFloor() {
		return _A301MarkFloor;
	}

	@Override
	public void setA301MarkFloor(double A301MarkFloor) {
		_A301MarkFloor = A301MarkFloor;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA301MarkFloor", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					A301MarkFloor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA301MarkCeil() {
		return _A301MarkCeil;
	}

	@Override
	public void setA301MarkCeil(double A301MarkCeil) {
		_A301MarkCeil = A301MarkCeil;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA301MarkCeil", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					A301MarkCeil);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPurposeRiskDescription() {
		return _PurposeRiskDescription;
	}

	@Override
	public void setPurposeRiskDescription(String PurposeRiskDescription) {
		_PurposeRiskDescription = PurposeRiskDescription;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeRiskDescription",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					PurposeRiskDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA302Mark() {
		return _A302Mark;
	}

	@Override
	public void setA302Mark(double A302Mark) {
		_A302Mark = A302Mark;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA302Mark", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, A302Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertifiedRiskDescription() {
		return _CertifiedRiskDescription;
	}

	@Override
	public void setCertifiedRiskDescription(String CertifiedRiskDescription) {
		_CertifiedRiskDescription = CertifiedRiskDescription;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setCertifiedRiskDescription",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					CertifiedRiskDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA304Mark() {
		return _A304Mark;
	}

	@Override
	public void setA304Mark(double A304Mark) {
		_A304Mark = A304Mark;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA304Mark", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, A304Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUsageRiskDescription() {
		return _UsageRiskDescription;
	}

	@Override
	public void setUsageRiskDescription(String UsageRiskDescription) {
		_UsageRiskDescription = UsageRiskDescription;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setUsageRiskDescription",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					UsageRiskDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA303Mark() {
		return _A303Mark;
	}

	@Override
	public void setA303Mark(double A303Mark) {
		_A303Mark = A303Mark;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA303Mark", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, A303Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransportRiskDescription() {
		return _TransportRiskDescription;
	}

	@Override
	public void setTransportRiskDescription(String TransportRiskDescription) {
		_TransportRiskDescription = TransportRiskDescription;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setTransportRiskDescription",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					TransportRiskDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getA305Mark() {
		return _A305Mark;
	}

	@Override
	public void setA305Mark(double A305Mark) {
		_A305Mark = A305Mark;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setA305Mark", double.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, A305Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaker() {
		return _maker;
	}

	@Override
	public void setMaker(String maker) {
		_maker = maker;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMaker", String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, maker);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChecker() {
		return _checker;
	}

	@Override
	public void setChecker(String checker) {
		_checker = checker;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setChecker", String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, checker);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprover() {
		return _approver;
	}

	@Override
	public void setApprover(String approver) {
		_approver = approver;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setApprover", String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel, approver);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMakermodified() {
		return _makermodified;
	}

	@Override
	public void setMakermodified(Date makermodified) {
		_makermodified = makermodified;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setMakermodified", Date.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					makermodified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckermodified() {
		return _checkermodified;
	}

	@Override
	public void setCheckermodified(Date checkermodified) {
		_checkermodified = checkermodified;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckermodified", Date.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					checkermodified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovermodified() {
		return _approvermodified;
	}

	@Override
	public void setApprovermodified(Date approvermodified) {
		_approvermodified = approvermodified;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovermodified",
						Date.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					approvermodified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssessmentid() {
		return _assessmentid;
	}

	@Override
	public void setAssessmentid(String assessmentid) {
		_assessmentid = assessmentid;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentid", String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					assessmentid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssessmentyear() {
		return _assessmentyear;
	}

	@Override
	public void setAssessmentyear(String assessmentyear) {
		_assessmentyear = assessmentyear;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentyear",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					assessmentyear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEvaluationperiod() {
		return _evaluationperiod;
	}

	@Override
	public void setEvaluationperiod(String evaluationperiod) {
		_evaluationperiod = evaluationperiod;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluationperiod",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					evaluationperiod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLatestassessment() {
		return _latestassessment;
	}

	@Override
	public void setLatestassessment(Date latestassessment) {
		_latestassessment = latestassessment;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setLatestassessment",
						Date.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					latestassessment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNextassessmentid() {
		return _nextassessmentid;
	}

	@Override
	public void setNextassessmentid(String nextassessmentid) {
		_nextassessmentid = nextassessmentid;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setNextassessmentid",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					nextassessmentid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNextassessmentyear() {
		return _nextassessmentyear;
	}

	@Override
	public void setNextassessmentyear(String nextassessmentyear) {
		_nextassessmentyear = nextassessmentyear;

		if (_assessmentofInspectionMethodRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofInspectionMethodRemoteModel.getClass();

				Method method = clazz.getMethod("setNextassessmentyear",
						String.class);

				method.invoke(_assessmentofInspectionMethodRemoteModel,
					nextassessmentyear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssessmentofInspectionMethodRemoteModel() {
		return _assessmentofInspectionMethodRemoteModel;
	}

	public void setAssessmentofInspectionMethodRemoteModel(
		BaseModel<?> assessmentofInspectionMethodRemoteModel) {
		_assessmentofInspectionMethodRemoteModel = assessmentofInspectionMethodRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _assessmentofInspectionMethodRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_assessmentofInspectionMethodRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssessmentofInspectionMethodLocalServiceUtil.addAssessmentofInspectionMethod(this);
		}
		else {
			AssessmentofInspectionMethodLocalServiceUtil.updateAssessmentofInspectionMethod(this);
		}
	}

	@Override
	public AssessmentofInspectionMethod toEscapedModel() {
		return (AssessmentofInspectionMethod)ProxyUtil.newProxyInstance(AssessmentofInspectionMethod.class.getClassLoader(),
			new Class[] { AssessmentofInspectionMethod.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssessmentofInspectionMethodClp clone = new AssessmentofInspectionMethodClp();

		clone.setId(getId());
		clone.setMethodcode(getMethodcode());
		clone.setMethodname(getMethodname());
		clone.setMethodsequenceno(getMethodsequenceno());
		clone.setMethoddescription(getMethoddescription());
		clone.setMethodcodereference(getMethodcodereference());
		clone.setMethodnamereference(getMethodnamereference());
		clone.setImporterRiskDescription(getImporterRiskDescription());
		clone.setA1MarkFloor(getA1MarkFloor());
		clone.setA1MarkCeil(getA1MarkCeil());
		clone.setProductRiskDescription(getProductRiskDescription());
		clone.setA301MarkFloor(getA301MarkFloor());
		clone.setA301MarkCeil(getA301MarkCeil());
		clone.setPurposeRiskDescription(getPurposeRiskDescription());
		clone.setA302Mark(getA302Mark());
		clone.setCertifiedRiskDescription(getCertifiedRiskDescription());
		clone.setA304Mark(getA304Mark());
		clone.setUsageRiskDescription(getUsageRiskDescription());
		clone.setA303Mark(getA303Mark());
		clone.setTransportRiskDescription(getTransportRiskDescription());
		clone.setA305Mark(getA305Mark());
		clone.setMaker(getMaker());
		clone.setChecker(getChecker());
		clone.setApprover(getApprover());
		clone.setMakermodified(getMakermodified());
		clone.setCheckermodified(getCheckermodified());
		clone.setApprovermodified(getApprovermodified());
		clone.setAssessmentid(getAssessmentid());
		clone.setAssessmentyear(getAssessmentyear());
		clone.setEvaluationperiod(getEvaluationperiod());
		clone.setLatestassessment(getLatestassessment());
		clone.setSynchdate(getSynchdate());
		clone.setNextassessmentid(getNextassessmentid());
		clone.setNextassessmentyear(getNextassessmentyear());

		return clone;
	}

	@Override
	public int compareTo(
		AssessmentofInspectionMethod assessmentofInspectionMethod) {
		int value = 0;

		if (getId() < assessmentofInspectionMethod.getId()) {
			value = -1;
		}
		else if (getId() > assessmentofInspectionMethod.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentofInspectionMethodClp)) {
			return false;
		}

		AssessmentofInspectionMethodClp assessmentofInspectionMethod = (AssessmentofInspectionMethodClp)obj;

		long primaryKey = assessmentofInspectionMethod.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", methodcode=");
		sb.append(getMethodcode());
		sb.append(", methodname=");
		sb.append(getMethodname());
		sb.append(", methodsequenceno=");
		sb.append(getMethodsequenceno());
		sb.append(", methoddescription=");
		sb.append(getMethoddescription());
		sb.append(", methodcodereference=");
		sb.append(getMethodcodereference());
		sb.append(", methodnamereference=");
		sb.append(getMethodnamereference());
		sb.append(", ImporterRiskDescription=");
		sb.append(getImporterRiskDescription());
		sb.append(", A1MarkFloor=");
		sb.append(getA1MarkFloor());
		sb.append(", A1MarkCeil=");
		sb.append(getA1MarkCeil());
		sb.append(", ProductRiskDescription=");
		sb.append(getProductRiskDescription());
		sb.append(", A301MarkFloor=");
		sb.append(getA301MarkFloor());
		sb.append(", A301MarkCeil=");
		sb.append(getA301MarkCeil());
		sb.append(", PurposeRiskDescription=");
		sb.append(getPurposeRiskDescription());
		sb.append(", A302Mark=");
		sb.append(getA302Mark());
		sb.append(", CertifiedRiskDescription=");
		sb.append(getCertifiedRiskDescription());
		sb.append(", A304Mark=");
		sb.append(getA304Mark());
		sb.append(", UsageRiskDescription=");
		sb.append(getUsageRiskDescription());
		sb.append(", A303Mark=");
		sb.append(getA303Mark());
		sb.append(", TransportRiskDescription=");
		sb.append(getTransportRiskDescription());
		sb.append(", A305Mark=");
		sb.append(getA305Mark());
		sb.append(", maker=");
		sb.append(getMaker());
		sb.append(", checker=");
		sb.append(getChecker());
		sb.append(", approver=");
		sb.append(getApprover());
		sb.append(", makermodified=");
		sb.append(getMakermodified());
		sb.append(", checkermodified=");
		sb.append(getCheckermodified());
		sb.append(", approvermodified=");
		sb.append(getApprovermodified());
		sb.append(", assessmentid=");
		sb.append(getAssessmentid());
		sb.append(", assessmentyear=");
		sb.append(getAssessmentyear());
		sb.append(", evaluationperiod=");
		sb.append(getEvaluationperiod());
		sb.append(", latestassessment=");
		sb.append(getLatestassessment());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append(", nextassessmentid=");
		sb.append(getNextassessmentid());
		sb.append(", nextassessmentyear=");
		sb.append(getNextassessmentyear());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(106);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methodcode</column-name><column-value><![CDATA[");
		sb.append(getMethodcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methodname</column-name><column-value><![CDATA[");
		sb.append(getMethodname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methodsequenceno</column-name><column-value><![CDATA[");
		sb.append(getMethodsequenceno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methoddescription</column-name><column-value><![CDATA[");
		sb.append(getMethoddescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methodcodereference</column-name><column-value><![CDATA[");
		sb.append(getMethodcodereference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>methodnamereference</column-name><column-value><![CDATA[");
		sb.append(getMethodnamereference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ImporterRiskDescription</column-name><column-value><![CDATA[");
		sb.append(getImporterRiskDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A1MarkFloor</column-name><column-value><![CDATA[");
		sb.append(getA1MarkFloor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A1MarkCeil</column-name><column-value><![CDATA[");
		sb.append(getA1MarkCeil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ProductRiskDescription</column-name><column-value><![CDATA[");
		sb.append(getProductRiskDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A301MarkFloor</column-name><column-value><![CDATA[");
		sb.append(getA301MarkFloor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A301MarkCeil</column-name><column-value><![CDATA[");
		sb.append(getA301MarkCeil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PurposeRiskDescription</column-name><column-value><![CDATA[");
		sb.append(getPurposeRiskDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A302Mark</column-name><column-value><![CDATA[");
		sb.append(getA302Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CertifiedRiskDescription</column-name><column-value><![CDATA[");
		sb.append(getCertifiedRiskDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A304Mark</column-name><column-value><![CDATA[");
		sb.append(getA304Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UsageRiskDescription</column-name><column-value><![CDATA[");
		sb.append(getUsageRiskDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A303Mark</column-name><column-value><![CDATA[");
		sb.append(getA303Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TransportRiskDescription</column-name><column-value><![CDATA[");
		sb.append(getTransportRiskDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>A305Mark</column-name><column-value><![CDATA[");
		sb.append(getA305Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maker</column-name><column-value><![CDATA[");
		sb.append(getMaker());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checker</column-name><column-value><![CDATA[");
		sb.append(getChecker());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approver</column-name><column-value><![CDATA[");
		sb.append(getApprover());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makermodified</column-name><column-value><![CDATA[");
		sb.append(getMakermodified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkermodified</column-name><column-value><![CDATA[");
		sb.append(getCheckermodified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvermodified</column-name><column-value><![CDATA[");
		sb.append(getApprovermodified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentid</column-name><column-value><![CDATA[");
		sb.append(getAssessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentyear</column-name><column-value><![CDATA[");
		sb.append(getAssessmentyear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluationperiod</column-name><column-value><![CDATA[");
		sb.append(getEvaluationperiod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestassessment</column-name><column-value><![CDATA[");
		sb.append(getLatestassessment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextassessmentid</column-name><column-value><![CDATA[");
		sb.append(getNextassessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextassessmentyear</column-name><column-value><![CDATA[");
		sb.append(getNextassessmentyear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _assessmentofInspectionMethodRemoteModel;
}