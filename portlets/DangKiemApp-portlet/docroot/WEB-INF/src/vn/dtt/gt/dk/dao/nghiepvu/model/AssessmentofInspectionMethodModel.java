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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssessmentofInspectionMethod service. Represents a row in the &quot;vr_assessmentofinspectionmethod&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodImpl}.
 * </p>
 *
 * @author win_64
 * @see AssessmentofInspectionMethod
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl
 * @generated
 */
public interface AssessmentofInspectionMethodModel extends BaseModel<AssessmentofInspectionMethod> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assessmentof inspection method model instance should use the {@link AssessmentofInspectionMethod} interface instead.
	 */

	/**
	 * Returns the primary key of this assessmentof inspection method.
	 *
	 * @return the primary key of this assessmentof inspection method
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assessmentof inspection method.
	 *
	 * @param primaryKey the primary key of this assessmentof inspection method
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this assessmentof inspection method.
	 *
	 * @return the ID of this assessmentof inspection method
	 */
	public long getId();

	/**
	 * Sets the ID of this assessmentof inspection method.
	 *
	 * @param id the ID of this assessmentof inspection method
	 */
	public void setId(long id);

	/**
	 * Returns the methodcode of this assessmentof inspection method.
	 *
	 * @return the methodcode of this assessmentof inspection method
	 */
	@AutoEscape
	public String getMethodcode();

	/**
	 * Sets the methodcode of this assessmentof inspection method.
	 *
	 * @param methodcode the methodcode of this assessmentof inspection method
	 */
	public void setMethodcode(String methodcode);

	/**
	 * Returns the methodname of this assessmentof inspection method.
	 *
	 * @return the methodname of this assessmentof inspection method
	 */
	@AutoEscape
	public String getMethodname();

	/**
	 * Sets the methodname of this assessmentof inspection method.
	 *
	 * @param methodname the methodname of this assessmentof inspection method
	 */
	public void setMethodname(String methodname);

	/**
	 * Returns the methodsequenceno of this assessmentof inspection method.
	 *
	 * @return the methodsequenceno of this assessmentof inspection method
	 */
	public int getMethodsequenceno();

	/**
	 * Sets the methodsequenceno of this assessmentof inspection method.
	 *
	 * @param methodsequenceno the methodsequenceno of this assessmentof inspection method
	 */
	public void setMethodsequenceno(int methodsequenceno);

	/**
	 * Returns the methoddescription of this assessmentof inspection method.
	 *
	 * @return the methoddescription of this assessmentof inspection method
	 */
	@AutoEscape
	public String getMethoddescription();

	/**
	 * Sets the methoddescription of this assessmentof inspection method.
	 *
	 * @param methoddescription the methoddescription of this assessmentof inspection method
	 */
	public void setMethoddescription(String methoddescription);

	/**
	 * Returns the methodcodereference of this assessmentof inspection method.
	 *
	 * @return the methodcodereference of this assessmentof inspection method
	 */
	@AutoEscape
	public String getMethodcodereference();

	/**
	 * Sets the methodcodereference of this assessmentof inspection method.
	 *
	 * @param methodcodereference the methodcodereference of this assessmentof inspection method
	 */
	public void setMethodcodereference(String methodcodereference);

	/**
	 * Returns the methodnamereference of this assessmentof inspection method.
	 *
	 * @return the methodnamereference of this assessmentof inspection method
	 */
	@AutoEscape
	public String getMethodnamereference();

	/**
	 * Sets the methodnamereference of this assessmentof inspection method.
	 *
	 * @param methodnamereference the methodnamereference of this assessmentof inspection method
	 */
	public void setMethodnamereference(String methodnamereference);

	/**
	 * Returns the importer risk description of this assessmentof inspection method.
	 *
	 * @return the importer risk description of this assessmentof inspection method
	 */
	@AutoEscape
	public String getImporterRiskDescription();

	/**
	 * Sets the importer risk description of this assessmentof inspection method.
	 *
	 * @param ImporterRiskDescription the importer risk description of this assessmentof inspection method
	 */
	public void setImporterRiskDescription(String ImporterRiskDescription);

	/**
	 * Returns the a1 mark floor of this assessmentof inspection method.
	 *
	 * @return the a1 mark floor of this assessmentof inspection method
	 */
	public double getA1MarkFloor();

	/**
	 * Sets the a1 mark floor of this assessmentof inspection method.
	 *
	 * @param A1MarkFloor the a1 mark floor of this assessmentof inspection method
	 */
	public void setA1MarkFloor(double A1MarkFloor);

	/**
	 * Returns the a1 mark ceil of this assessmentof inspection method.
	 *
	 * @return the a1 mark ceil of this assessmentof inspection method
	 */
	public double getA1MarkCeil();

	/**
	 * Sets the a1 mark ceil of this assessmentof inspection method.
	 *
	 * @param A1MarkCeil the a1 mark ceil of this assessmentof inspection method
	 */
	public void setA1MarkCeil(double A1MarkCeil);

	/**
	 * Returns the product risk description of this assessmentof inspection method.
	 *
	 * @return the product risk description of this assessmentof inspection method
	 */
	@AutoEscape
	public String getProductRiskDescription();

	/**
	 * Sets the product risk description of this assessmentof inspection method.
	 *
	 * @param ProductRiskDescription the product risk description of this assessmentof inspection method
	 */
	public void setProductRiskDescription(String ProductRiskDescription);

	/**
	 * Returns the a301 mark floor of this assessmentof inspection method.
	 *
	 * @return the a301 mark floor of this assessmentof inspection method
	 */
	public double getA301MarkFloor();

	/**
	 * Sets the a301 mark floor of this assessmentof inspection method.
	 *
	 * @param A301MarkFloor the a301 mark floor of this assessmentof inspection method
	 */
	public void setA301MarkFloor(double A301MarkFloor);

	/**
	 * Returns the a301 mark ceil of this assessmentof inspection method.
	 *
	 * @return the a301 mark ceil of this assessmentof inspection method
	 */
	public double getA301MarkCeil();

	/**
	 * Sets the a301 mark ceil of this assessmentof inspection method.
	 *
	 * @param A301MarkCeil the a301 mark ceil of this assessmentof inspection method
	 */
	public void setA301MarkCeil(double A301MarkCeil);

	/**
	 * Returns the purpose risk description of this assessmentof inspection method.
	 *
	 * @return the purpose risk description of this assessmentof inspection method
	 */
	@AutoEscape
	public String getPurposeRiskDescription();

	/**
	 * Sets the purpose risk description of this assessmentof inspection method.
	 *
	 * @param PurposeRiskDescription the purpose risk description of this assessmentof inspection method
	 */
	public void setPurposeRiskDescription(String PurposeRiskDescription);

	/**
	 * Returns the a302 mark of this assessmentof inspection method.
	 *
	 * @return the a302 mark of this assessmentof inspection method
	 */
	public double getA302Mark();

	/**
	 * Sets the a302 mark of this assessmentof inspection method.
	 *
	 * @param A302Mark the a302 mark of this assessmentof inspection method
	 */
	public void setA302Mark(double A302Mark);

	/**
	 * Returns the certified risk description of this assessmentof inspection method.
	 *
	 * @return the certified risk description of this assessmentof inspection method
	 */
	@AutoEscape
	public String getCertifiedRiskDescription();

	/**
	 * Sets the certified risk description of this assessmentof inspection method.
	 *
	 * @param CertifiedRiskDescription the certified risk description of this assessmentof inspection method
	 */
	public void setCertifiedRiskDescription(String CertifiedRiskDescription);

	/**
	 * Returns the a304 mark of this assessmentof inspection method.
	 *
	 * @return the a304 mark of this assessmentof inspection method
	 */
	public double getA304Mark();

	/**
	 * Sets the a304 mark of this assessmentof inspection method.
	 *
	 * @param A304Mark the a304 mark of this assessmentof inspection method
	 */
	public void setA304Mark(double A304Mark);

	/**
	 * Returns the usage risk description of this assessmentof inspection method.
	 *
	 * @return the usage risk description of this assessmentof inspection method
	 */
	@AutoEscape
	public String getUsageRiskDescription();

	/**
	 * Sets the usage risk description of this assessmentof inspection method.
	 *
	 * @param UsageRiskDescription the usage risk description of this assessmentof inspection method
	 */
	public void setUsageRiskDescription(String UsageRiskDescription);

	/**
	 * Returns the a303 mark of this assessmentof inspection method.
	 *
	 * @return the a303 mark of this assessmentof inspection method
	 */
	public double getA303Mark();

	/**
	 * Sets the a303 mark of this assessmentof inspection method.
	 *
	 * @param A303Mark the a303 mark of this assessmentof inspection method
	 */
	public void setA303Mark(double A303Mark);

	/**
	 * Returns the transport risk description of this assessmentof inspection method.
	 *
	 * @return the transport risk description of this assessmentof inspection method
	 */
	@AutoEscape
	public String getTransportRiskDescription();

	/**
	 * Sets the transport risk description of this assessmentof inspection method.
	 *
	 * @param TransportRiskDescription the transport risk description of this assessmentof inspection method
	 */
	public void setTransportRiskDescription(String TransportRiskDescription);

	/**
	 * Returns the a305 mark of this assessmentof inspection method.
	 *
	 * @return the a305 mark of this assessmentof inspection method
	 */
	public double getA305Mark();

	/**
	 * Sets the a305 mark of this assessmentof inspection method.
	 *
	 * @param A305Mark the a305 mark of this assessmentof inspection method
	 */
	public void setA305Mark(double A305Mark);

	/**
	 * Returns the maker of this assessmentof inspection method.
	 *
	 * @return the maker of this assessmentof inspection method
	 */
	@AutoEscape
	public String getMaker();

	/**
	 * Sets the maker of this assessmentof inspection method.
	 *
	 * @param maker the maker of this assessmentof inspection method
	 */
	public void setMaker(String maker);

	/**
	 * Returns the checker of this assessmentof inspection method.
	 *
	 * @return the checker of this assessmentof inspection method
	 */
	@AutoEscape
	public String getChecker();

	/**
	 * Sets the checker of this assessmentof inspection method.
	 *
	 * @param checker the checker of this assessmentof inspection method
	 */
	public void setChecker(String checker);

	/**
	 * Returns the approver of this assessmentof inspection method.
	 *
	 * @return the approver of this assessmentof inspection method
	 */
	@AutoEscape
	public String getApprover();

	/**
	 * Sets the approver of this assessmentof inspection method.
	 *
	 * @param approver the approver of this assessmentof inspection method
	 */
	public void setApprover(String approver);

	/**
	 * Returns the makermodified of this assessmentof inspection method.
	 *
	 * @return the makermodified of this assessmentof inspection method
	 */
	public Date getMakermodified();

	/**
	 * Sets the makermodified of this assessmentof inspection method.
	 *
	 * @param makermodified the makermodified of this assessmentof inspection method
	 */
	public void setMakermodified(Date makermodified);

	/**
	 * Returns the checkermodified of this assessmentof inspection method.
	 *
	 * @return the checkermodified of this assessmentof inspection method
	 */
	public Date getCheckermodified();

	/**
	 * Sets the checkermodified of this assessmentof inspection method.
	 *
	 * @param checkermodified the checkermodified of this assessmentof inspection method
	 */
	public void setCheckermodified(Date checkermodified);

	/**
	 * Returns the approvermodified of this assessmentof inspection method.
	 *
	 * @return the approvermodified of this assessmentof inspection method
	 */
	public Date getApprovermodified();

	/**
	 * Sets the approvermodified of this assessmentof inspection method.
	 *
	 * @param approvermodified the approvermodified of this assessmentof inspection method
	 */
	public void setApprovermodified(Date approvermodified);

	/**
	 * Returns the assessmentid of this assessmentof inspection method.
	 *
	 * @return the assessmentid of this assessmentof inspection method
	 */
	@AutoEscape
	public String getAssessmentid();

	/**
	 * Sets the assessmentid of this assessmentof inspection method.
	 *
	 * @param assessmentid the assessmentid of this assessmentof inspection method
	 */
	public void setAssessmentid(String assessmentid);

	/**
	 * Returns the assessmentyear of this assessmentof inspection method.
	 *
	 * @return the assessmentyear of this assessmentof inspection method
	 */
	@AutoEscape
	public String getAssessmentyear();

	/**
	 * Sets the assessmentyear of this assessmentof inspection method.
	 *
	 * @param assessmentyear the assessmentyear of this assessmentof inspection method
	 */
	public void setAssessmentyear(String assessmentyear);

	/**
	 * Returns the evaluationperiod of this assessmentof inspection method.
	 *
	 * @return the evaluationperiod of this assessmentof inspection method
	 */
	@AutoEscape
	public String getEvaluationperiod();

	/**
	 * Sets the evaluationperiod of this assessmentof inspection method.
	 *
	 * @param evaluationperiod the evaluationperiod of this assessmentof inspection method
	 */
	public void setEvaluationperiod(String evaluationperiod);

	/**
	 * Returns the latestassessment of this assessmentof inspection method.
	 *
	 * @return the latestassessment of this assessmentof inspection method
	 */
	public Date getLatestassessment();

	/**
	 * Sets the latestassessment of this assessmentof inspection method.
	 *
	 * @param latestassessment the latestassessment of this assessmentof inspection method
	 */
	public void setLatestassessment(Date latestassessment);

	/**
	 * Returns the synchdate of this assessmentof inspection method.
	 *
	 * @return the synchdate of this assessmentof inspection method
	 */
	public Date getSynchdate();

	/**
	 * Sets the synchdate of this assessmentof inspection method.
	 *
	 * @param synchdate the synchdate of this assessmentof inspection method
	 */
	public void setSynchdate(Date synchdate);

	/**
	 * Returns the nextassessmentid of this assessmentof inspection method.
	 *
	 * @return the nextassessmentid of this assessmentof inspection method
	 */
	@AutoEscape
	public String getNextassessmentid();

	/**
	 * Sets the nextassessmentid of this assessmentof inspection method.
	 *
	 * @param nextassessmentid the nextassessmentid of this assessmentof inspection method
	 */
	public void setNextassessmentid(String nextassessmentid);

	/**
	 * Returns the nextassessmentyear of this assessmentof inspection method.
	 *
	 * @return the nextassessmentyear of this assessmentof inspection method
	 */
	@AutoEscape
	public String getNextassessmentyear();

	/**
	 * Sets the nextassessmentyear of this assessmentof inspection method.
	 *
	 * @param nextassessmentyear the nextassessmentyear of this assessmentof inspection method
	 */
	public void setNextassessmentyear(String nextassessmentyear);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		AssessmentofInspectionMethod assessmentofInspectionMethod);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AssessmentofInspectionMethod> toCacheModel();

	@Override
	public AssessmentofInspectionMethod toEscapedModel();

	@Override
	public AssessmentofInspectionMethod toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}