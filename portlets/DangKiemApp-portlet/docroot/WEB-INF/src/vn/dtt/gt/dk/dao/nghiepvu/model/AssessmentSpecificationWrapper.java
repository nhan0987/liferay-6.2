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
 * This class is a wrapper for {@link AssessmentSpecification}.
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecification
 * @generated
 */
public class AssessmentSpecificationWrapper implements AssessmentSpecification,
	ModelWrapper<AssessmentSpecification> {
	public AssessmentSpecificationWrapper(
		AssessmentSpecification assessmentSpecification) {
		_assessmentSpecification = assessmentSpecification;
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentSpecification.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentSpecification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("assessmenttype", getAssessmenttype());
		attributes.put("importercode", getImportercode());
		attributes.put("inspectorcontactcode", getInspectorcontactcode());
		attributes.put("productioncode", getProductioncode());
		attributes.put("specificationcategory", getSpecificationcategory());
		attributes.put("specificationgroupcode", getSpecificationgroupcode());
		attributes.put("specificationsequence", getSpecificationsequence());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("specificationvalue", getSpecificationvalue());
		attributes.put("specificationdescription", getSpecificationdescription());
		attributes.put("assessmentcoefficient", getAssessmentcoefficient());
		attributes.put("assessmentindex", getAssessmentindex());
		attributes.put("assessmentmark", getAssessmentmark());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessmentyear", getAssessmentyear());
		attributes.put("evaluationperiod", getEvaluationperiod());
		attributes.put("latestassessment", getLatestassessment());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String assessmenttype = (String)attributes.get("assessmenttype");

		if (assessmenttype != null) {
			setAssessmenttype(assessmenttype);
		}

		String importercode = (String)attributes.get("importercode");

		if (importercode != null) {
			setImportercode(importercode);
		}

		String inspectorcontactcode = (String)attributes.get(
				"inspectorcontactcode");

		if (inspectorcontactcode != null) {
			setInspectorcontactcode(inspectorcontactcode);
		}

		String productioncode = (String)attributes.get("productioncode");

		if (productioncode != null) {
			setProductioncode(productioncode);
		}

		String specificationcategory = (String)attributes.get(
				"specificationcategory");

		if (specificationcategory != null) {
			setSpecificationcategory(specificationcategory);
		}

		String specificationgroupcode = (String)attributes.get(
				"specificationgroupcode");

		if (specificationgroupcode != null) {
			setSpecificationgroupcode(specificationgroupcode);
		}

		Integer specificationsequence = (Integer)attributes.get(
				"specificationsequence");

		if (specificationsequence != null) {
			setSpecificationsequence(specificationsequence);
		}

		String specificationcode = (String)attributes.get("specificationcode");

		if (specificationcode != null) {
			setSpecificationcode(specificationcode);
		}

		String specificationname = (String)attributes.get("specificationname");

		if (specificationname != null) {
			setSpecificationname(specificationname);
		}

		String specificationvalue = (String)attributes.get("specificationvalue");

		if (specificationvalue != null) {
			setSpecificationvalue(specificationvalue);
		}

		String specificationdescription = (String)attributes.get(
				"specificationdescription");

		if (specificationdescription != null) {
			setSpecificationdescription(specificationdescription);
		}

		Double assessmentcoefficient = (Double)attributes.get(
				"assessmentcoefficient");

		if (assessmentcoefficient != null) {
			setAssessmentcoefficient(assessmentcoefficient);
		}

		Double assessmentindex = (Double)attributes.get("assessmentindex");

		if (assessmentindex != null) {
			setAssessmentindex(assessmentindex);
		}

		Double assessmentmark = (Double)attributes.get("assessmentmark");

		if (assessmentmark != null) {
			setAssessmentmark(assessmentmark);
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
	}

	/**
	* Returns the primary key of this assessment specification.
	*
	* @return the primary key of this assessment specification
	*/
	@Override
	public long getPrimaryKey() {
		return _assessmentSpecification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment specification.
	*
	* @param primaryKey the primary key of this assessment specification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assessmentSpecification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this assessment specification.
	*
	* @return the ID of this assessment specification
	*/
	@Override
	public long getId() {
		return _assessmentSpecification.getId();
	}

	/**
	* Sets the ID of this assessment specification.
	*
	* @param id the ID of this assessment specification
	*/
	@Override
	public void setId(long id) {
		_assessmentSpecification.setId(id);
	}

	/**
	* Returns the assessmenttype of this assessment specification.
	*
	* @return the assessmenttype of this assessment specification
	*/
	@Override
	public java.lang.String getAssessmenttype() {
		return _assessmentSpecification.getAssessmenttype();
	}

	/**
	* Sets the assessmenttype of this assessment specification.
	*
	* @param assessmenttype the assessmenttype of this assessment specification
	*/
	@Override
	public void setAssessmenttype(java.lang.String assessmenttype) {
		_assessmentSpecification.setAssessmenttype(assessmenttype);
	}

	/**
	* Returns the importercode of this assessment specification.
	*
	* @return the importercode of this assessment specification
	*/
	@Override
	public java.lang.String getImportercode() {
		return _assessmentSpecification.getImportercode();
	}

	/**
	* Sets the importercode of this assessment specification.
	*
	* @param importercode the importercode of this assessment specification
	*/
	@Override
	public void setImportercode(java.lang.String importercode) {
		_assessmentSpecification.setImportercode(importercode);
	}

	/**
	* Returns the inspectorcontactcode of this assessment specification.
	*
	* @return the inspectorcontactcode of this assessment specification
	*/
	@Override
	public java.lang.String getInspectorcontactcode() {
		return _assessmentSpecification.getInspectorcontactcode();
	}

	/**
	* Sets the inspectorcontactcode of this assessment specification.
	*
	* @param inspectorcontactcode the inspectorcontactcode of this assessment specification
	*/
	@Override
	public void setInspectorcontactcode(java.lang.String inspectorcontactcode) {
		_assessmentSpecification.setInspectorcontactcode(inspectorcontactcode);
	}

	/**
	* Returns the productioncode of this assessment specification.
	*
	* @return the productioncode of this assessment specification
	*/
	@Override
	public java.lang.String getProductioncode() {
		return _assessmentSpecification.getProductioncode();
	}

	/**
	* Sets the productioncode of this assessment specification.
	*
	* @param productioncode the productioncode of this assessment specification
	*/
	@Override
	public void setProductioncode(java.lang.String productioncode) {
		_assessmentSpecification.setProductioncode(productioncode);
	}

	/**
	* Returns the specificationcategory of this assessment specification.
	*
	* @return the specificationcategory of this assessment specification
	*/
	@Override
	public java.lang.String getSpecificationcategory() {
		return _assessmentSpecification.getSpecificationcategory();
	}

	/**
	* Sets the specificationcategory of this assessment specification.
	*
	* @param specificationcategory the specificationcategory of this assessment specification
	*/
	@Override
	public void setSpecificationcategory(java.lang.String specificationcategory) {
		_assessmentSpecification.setSpecificationcategory(specificationcategory);
	}

	/**
	* Returns the specificationgroupcode of this assessment specification.
	*
	* @return the specificationgroupcode of this assessment specification
	*/
	@Override
	public java.lang.String getSpecificationgroupcode() {
		return _assessmentSpecification.getSpecificationgroupcode();
	}

	/**
	* Sets the specificationgroupcode of this assessment specification.
	*
	* @param specificationgroupcode the specificationgroupcode of this assessment specification
	*/
	@Override
	public void setSpecificationgroupcode(
		java.lang.String specificationgroupcode) {
		_assessmentSpecification.setSpecificationgroupcode(specificationgroupcode);
	}

	/**
	* Returns the specificationsequence of this assessment specification.
	*
	* @return the specificationsequence of this assessment specification
	*/
	@Override
	public int getSpecificationsequence() {
		return _assessmentSpecification.getSpecificationsequence();
	}

	/**
	* Sets the specificationsequence of this assessment specification.
	*
	* @param specificationsequence the specificationsequence of this assessment specification
	*/
	@Override
	public void setSpecificationsequence(int specificationsequence) {
		_assessmentSpecification.setSpecificationsequence(specificationsequence);
	}

	/**
	* Returns the specificationcode of this assessment specification.
	*
	* @return the specificationcode of this assessment specification
	*/
	@Override
	public java.lang.String getSpecificationcode() {
		return _assessmentSpecification.getSpecificationcode();
	}

	/**
	* Sets the specificationcode of this assessment specification.
	*
	* @param specificationcode the specificationcode of this assessment specification
	*/
	@Override
	public void setSpecificationcode(java.lang.String specificationcode) {
		_assessmentSpecification.setSpecificationcode(specificationcode);
	}

	/**
	* Returns the specificationname of this assessment specification.
	*
	* @return the specificationname of this assessment specification
	*/
	@Override
	public java.lang.String getSpecificationname() {
		return _assessmentSpecification.getSpecificationname();
	}

	/**
	* Sets the specificationname of this assessment specification.
	*
	* @param specificationname the specificationname of this assessment specification
	*/
	@Override
	public void setSpecificationname(java.lang.String specificationname) {
		_assessmentSpecification.setSpecificationname(specificationname);
	}

	/**
	* Returns the specificationvalue of this assessment specification.
	*
	* @return the specificationvalue of this assessment specification
	*/
	@Override
	public java.lang.String getSpecificationvalue() {
		return _assessmentSpecification.getSpecificationvalue();
	}

	/**
	* Sets the specificationvalue of this assessment specification.
	*
	* @param specificationvalue the specificationvalue of this assessment specification
	*/
	@Override
	public void setSpecificationvalue(java.lang.String specificationvalue) {
		_assessmentSpecification.setSpecificationvalue(specificationvalue);
	}

	/**
	* Returns the specificationdescription of this assessment specification.
	*
	* @return the specificationdescription of this assessment specification
	*/
	@Override
	public java.lang.String getSpecificationdescription() {
		return _assessmentSpecification.getSpecificationdescription();
	}

	/**
	* Sets the specificationdescription of this assessment specification.
	*
	* @param specificationdescription the specificationdescription of this assessment specification
	*/
	@Override
	public void setSpecificationdescription(
		java.lang.String specificationdescription) {
		_assessmentSpecification.setSpecificationdescription(specificationdescription);
	}

	/**
	* Returns the assessmentcoefficient of this assessment specification.
	*
	* @return the assessmentcoefficient of this assessment specification
	*/
	@Override
	public double getAssessmentcoefficient() {
		return _assessmentSpecification.getAssessmentcoefficient();
	}

	/**
	* Sets the assessmentcoefficient of this assessment specification.
	*
	* @param assessmentcoefficient the assessmentcoefficient of this assessment specification
	*/
	@Override
	public void setAssessmentcoefficient(double assessmentcoefficient) {
		_assessmentSpecification.setAssessmentcoefficient(assessmentcoefficient);
	}

	/**
	* Returns the assessmentindex of this assessment specification.
	*
	* @return the assessmentindex of this assessment specification
	*/
	@Override
	public double getAssessmentindex() {
		return _assessmentSpecification.getAssessmentindex();
	}

	/**
	* Sets the assessmentindex of this assessment specification.
	*
	* @param assessmentindex the assessmentindex of this assessment specification
	*/
	@Override
	public void setAssessmentindex(double assessmentindex) {
		_assessmentSpecification.setAssessmentindex(assessmentindex);
	}

	/**
	* Returns the assessmentmark of this assessment specification.
	*
	* @return the assessmentmark of this assessment specification
	*/
	@Override
	public double getAssessmentmark() {
		return _assessmentSpecification.getAssessmentmark();
	}

	/**
	* Sets the assessmentmark of this assessment specification.
	*
	* @param assessmentmark the assessmentmark of this assessment specification
	*/
	@Override
	public void setAssessmentmark(double assessmentmark) {
		_assessmentSpecification.setAssessmentmark(assessmentmark);
	}

	/**
	* Returns the assessmentid of this assessment specification.
	*
	* @return the assessmentid of this assessment specification
	*/
	@Override
	public java.lang.String getAssessmentid() {
		return _assessmentSpecification.getAssessmentid();
	}

	/**
	* Sets the assessmentid of this assessment specification.
	*
	* @param assessmentid the assessmentid of this assessment specification
	*/
	@Override
	public void setAssessmentid(java.lang.String assessmentid) {
		_assessmentSpecification.setAssessmentid(assessmentid);
	}

	/**
	* Returns the assessmentyear of this assessment specification.
	*
	* @return the assessmentyear of this assessment specification
	*/
	@Override
	public java.lang.String getAssessmentyear() {
		return _assessmentSpecification.getAssessmentyear();
	}

	/**
	* Sets the assessmentyear of this assessment specification.
	*
	* @param assessmentyear the assessmentyear of this assessment specification
	*/
	@Override
	public void setAssessmentyear(java.lang.String assessmentyear) {
		_assessmentSpecification.setAssessmentyear(assessmentyear);
	}

	/**
	* Returns the evaluationperiod of this assessment specification.
	*
	* @return the evaluationperiod of this assessment specification
	*/
	@Override
	public java.lang.String getEvaluationperiod() {
		return _assessmentSpecification.getEvaluationperiod();
	}

	/**
	* Sets the evaluationperiod of this assessment specification.
	*
	* @param evaluationperiod the evaluationperiod of this assessment specification
	*/
	@Override
	public void setEvaluationperiod(java.lang.String evaluationperiod) {
		_assessmentSpecification.setEvaluationperiod(evaluationperiod);
	}

	/**
	* Returns the latestassessment of this assessment specification.
	*
	* @return the latestassessment of this assessment specification
	*/
	@Override
	public java.util.Date getLatestassessment() {
		return _assessmentSpecification.getLatestassessment();
	}

	/**
	* Sets the latestassessment of this assessment specification.
	*
	* @param latestassessment the latestassessment of this assessment specification
	*/
	@Override
	public void setLatestassessment(java.util.Date latestassessment) {
		_assessmentSpecification.setLatestassessment(latestassessment);
	}

	/**
	* Returns the synchdate of this assessment specification.
	*
	* @return the synchdate of this assessment specification
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _assessmentSpecification.getSynchdate();
	}

	/**
	* Sets the synchdate of this assessment specification.
	*
	* @param synchdate the synchdate of this assessment specification
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_assessmentSpecification.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _assessmentSpecification.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assessmentSpecification.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assessmentSpecification.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assessmentSpecification.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assessmentSpecification.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assessmentSpecification.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessmentSpecification.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessmentSpecification.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assessmentSpecification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assessmentSpecification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessmentSpecification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessmentSpecificationWrapper((AssessmentSpecification)_assessmentSpecification.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification) {
		return _assessmentSpecification.compareTo(assessmentSpecification);
	}

	@Override
	public int hashCode() {
		return _assessmentSpecification.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> toCacheModel() {
		return _assessmentSpecification.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification toEscapedModel() {
		return new AssessmentSpecificationWrapper(_assessmentSpecification.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification toUnescapedModel() {
		return new AssessmentSpecificationWrapper(_assessmentSpecification.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessmentSpecification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assessmentSpecification.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessmentSpecification.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentSpecificationWrapper)) {
			return false;
		}

		AssessmentSpecificationWrapper assessmentSpecificationWrapper = (AssessmentSpecificationWrapper)obj;

		if (Validator.equals(_assessmentSpecification,
					assessmentSpecificationWrapper._assessmentSpecification)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssessmentSpecification getWrappedAssessmentSpecification() {
		return _assessmentSpecification;
	}

	@Override
	public AssessmentSpecification getWrappedModel() {
		return _assessmentSpecification;
	}

	@Override
	public void resetOriginalValues() {
		_assessmentSpecification.resetOriginalValues();
	}

	private AssessmentSpecification _assessmentSpecification;
}