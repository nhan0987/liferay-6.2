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
 * This class is a wrapper for {@link AssessmentSpecificationConfig}.
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationConfig
 * @generated
 */
public class AssessmentSpecificationConfigWrapper
	implements AssessmentSpecificationConfig,
		ModelWrapper<AssessmentSpecificationConfig> {
	public AssessmentSpecificationConfigWrapper(
		AssessmentSpecificationConfig assessmentSpecificationConfig) {
		_assessmentSpecificationConfig = assessmentSpecificationConfig;
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentSpecificationConfig.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentSpecificationConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("assessmenttype", getAssessmenttype());
		attributes.put("specificationcategory", getSpecificationcategory());
		attributes.put("specificationgroupcode", getSpecificationgroupcode());
		attributes.put("specificationsequence", getSpecificationsequence());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("specificationdescription", getSpecificationdescription());
		attributes.put("assessmentcoefficient", getAssessmentcoefficient());
		attributes.put("assessmentindexmin", getAssessmentindexmin());
		attributes.put("assessmentmarkmin", getAssessmentmarkmin());
		attributes.put("assessmentindexmax", getAssessmentindexmax());
		attributes.put("assessmentmarkmax", getAssessmentmarkmax());
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

		Double assessmentindexmin = (Double)attributes.get("assessmentindexmin");

		if (assessmentindexmin != null) {
			setAssessmentindexmin(assessmentindexmin);
		}

		Double assessmentmarkmin = (Double)attributes.get("assessmentmarkmin");

		if (assessmentmarkmin != null) {
			setAssessmentmarkmin(assessmentmarkmin);
		}

		Double assessmentindexmax = (Double)attributes.get("assessmentindexmax");

		if (assessmentindexmax != null) {
			setAssessmentindexmax(assessmentindexmax);
		}

		Double assessmentmarkmax = (Double)attributes.get("assessmentmarkmax");

		if (assessmentmarkmax != null) {
			setAssessmentmarkmax(assessmentmarkmax);
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
	* Returns the primary key of this assessment specification config.
	*
	* @return the primary key of this assessment specification config
	*/
	@Override
	public long getPrimaryKey() {
		return _assessmentSpecificationConfig.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment specification config.
	*
	* @param primaryKey the primary key of this assessment specification config
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assessmentSpecificationConfig.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this assessment specification config.
	*
	* @return the ID of this assessment specification config
	*/
	@Override
	public long getId() {
		return _assessmentSpecificationConfig.getId();
	}

	/**
	* Sets the ID of this assessment specification config.
	*
	* @param id the ID of this assessment specification config
	*/
	@Override
	public void setId(long id) {
		_assessmentSpecificationConfig.setId(id);
	}

	/**
	* Returns the assessmenttype of this assessment specification config.
	*
	* @return the assessmenttype of this assessment specification config
	*/
	@Override
	public java.lang.String getAssessmenttype() {
		return _assessmentSpecificationConfig.getAssessmenttype();
	}

	/**
	* Sets the assessmenttype of this assessment specification config.
	*
	* @param assessmenttype the assessmenttype of this assessment specification config
	*/
	@Override
	public void setAssessmenttype(java.lang.String assessmenttype) {
		_assessmentSpecificationConfig.setAssessmenttype(assessmenttype);
	}

	/**
	* Returns the specificationcategory of this assessment specification config.
	*
	* @return the specificationcategory of this assessment specification config
	*/
	@Override
	public java.lang.String getSpecificationcategory() {
		return _assessmentSpecificationConfig.getSpecificationcategory();
	}

	/**
	* Sets the specificationcategory of this assessment specification config.
	*
	* @param specificationcategory the specificationcategory of this assessment specification config
	*/
	@Override
	public void setSpecificationcategory(java.lang.String specificationcategory) {
		_assessmentSpecificationConfig.setSpecificationcategory(specificationcategory);
	}

	/**
	* Returns the specificationgroupcode of this assessment specification config.
	*
	* @return the specificationgroupcode of this assessment specification config
	*/
	@Override
	public java.lang.String getSpecificationgroupcode() {
		return _assessmentSpecificationConfig.getSpecificationgroupcode();
	}

	/**
	* Sets the specificationgroupcode of this assessment specification config.
	*
	* @param specificationgroupcode the specificationgroupcode of this assessment specification config
	*/
	@Override
	public void setSpecificationgroupcode(
		java.lang.String specificationgroupcode) {
		_assessmentSpecificationConfig.setSpecificationgroupcode(specificationgroupcode);
	}

	/**
	* Returns the specificationsequence of this assessment specification config.
	*
	* @return the specificationsequence of this assessment specification config
	*/
	@Override
	public int getSpecificationsequence() {
		return _assessmentSpecificationConfig.getSpecificationsequence();
	}

	/**
	* Sets the specificationsequence of this assessment specification config.
	*
	* @param specificationsequence the specificationsequence of this assessment specification config
	*/
	@Override
	public void setSpecificationsequence(int specificationsequence) {
		_assessmentSpecificationConfig.setSpecificationsequence(specificationsequence);
	}

	/**
	* Returns the specificationcode of this assessment specification config.
	*
	* @return the specificationcode of this assessment specification config
	*/
	@Override
	public java.lang.String getSpecificationcode() {
		return _assessmentSpecificationConfig.getSpecificationcode();
	}

	/**
	* Sets the specificationcode of this assessment specification config.
	*
	* @param specificationcode the specificationcode of this assessment specification config
	*/
	@Override
	public void setSpecificationcode(java.lang.String specificationcode) {
		_assessmentSpecificationConfig.setSpecificationcode(specificationcode);
	}

	/**
	* Returns the specificationname of this assessment specification config.
	*
	* @return the specificationname of this assessment specification config
	*/
	@Override
	public java.lang.String getSpecificationname() {
		return _assessmentSpecificationConfig.getSpecificationname();
	}

	/**
	* Sets the specificationname of this assessment specification config.
	*
	* @param specificationname the specificationname of this assessment specification config
	*/
	@Override
	public void setSpecificationname(java.lang.String specificationname) {
		_assessmentSpecificationConfig.setSpecificationname(specificationname);
	}

	/**
	* Returns the specificationdescription of this assessment specification config.
	*
	* @return the specificationdescription of this assessment specification config
	*/
	@Override
	public java.lang.String getSpecificationdescription() {
		return _assessmentSpecificationConfig.getSpecificationdescription();
	}

	/**
	* Sets the specificationdescription of this assessment specification config.
	*
	* @param specificationdescription the specificationdescription of this assessment specification config
	*/
	@Override
	public void setSpecificationdescription(
		java.lang.String specificationdescription) {
		_assessmentSpecificationConfig.setSpecificationdescription(specificationdescription);
	}

	/**
	* Returns the assessmentcoefficient of this assessment specification config.
	*
	* @return the assessmentcoefficient of this assessment specification config
	*/
	@Override
	public double getAssessmentcoefficient() {
		return _assessmentSpecificationConfig.getAssessmentcoefficient();
	}

	/**
	* Sets the assessmentcoefficient of this assessment specification config.
	*
	* @param assessmentcoefficient the assessmentcoefficient of this assessment specification config
	*/
	@Override
	public void setAssessmentcoefficient(double assessmentcoefficient) {
		_assessmentSpecificationConfig.setAssessmentcoefficient(assessmentcoefficient);
	}

	/**
	* Returns the assessmentindexmin of this assessment specification config.
	*
	* @return the assessmentindexmin of this assessment specification config
	*/
	@Override
	public double getAssessmentindexmin() {
		return _assessmentSpecificationConfig.getAssessmentindexmin();
	}

	/**
	* Sets the assessmentindexmin of this assessment specification config.
	*
	* @param assessmentindexmin the assessmentindexmin of this assessment specification config
	*/
	@Override
	public void setAssessmentindexmin(double assessmentindexmin) {
		_assessmentSpecificationConfig.setAssessmentindexmin(assessmentindexmin);
	}

	/**
	* Returns the assessmentmarkmin of this assessment specification config.
	*
	* @return the assessmentmarkmin of this assessment specification config
	*/
	@Override
	public double getAssessmentmarkmin() {
		return _assessmentSpecificationConfig.getAssessmentmarkmin();
	}

	/**
	* Sets the assessmentmarkmin of this assessment specification config.
	*
	* @param assessmentmarkmin the assessmentmarkmin of this assessment specification config
	*/
	@Override
	public void setAssessmentmarkmin(double assessmentmarkmin) {
		_assessmentSpecificationConfig.setAssessmentmarkmin(assessmentmarkmin);
	}

	/**
	* Returns the assessmentindexmax of this assessment specification config.
	*
	* @return the assessmentindexmax of this assessment specification config
	*/
	@Override
	public double getAssessmentindexmax() {
		return _assessmentSpecificationConfig.getAssessmentindexmax();
	}

	/**
	* Sets the assessmentindexmax of this assessment specification config.
	*
	* @param assessmentindexmax the assessmentindexmax of this assessment specification config
	*/
	@Override
	public void setAssessmentindexmax(double assessmentindexmax) {
		_assessmentSpecificationConfig.setAssessmentindexmax(assessmentindexmax);
	}

	/**
	* Returns the assessmentmarkmax of this assessment specification config.
	*
	* @return the assessmentmarkmax of this assessment specification config
	*/
	@Override
	public double getAssessmentmarkmax() {
		return _assessmentSpecificationConfig.getAssessmentmarkmax();
	}

	/**
	* Sets the assessmentmarkmax of this assessment specification config.
	*
	* @param assessmentmarkmax the assessmentmarkmax of this assessment specification config
	*/
	@Override
	public void setAssessmentmarkmax(double assessmentmarkmax) {
		_assessmentSpecificationConfig.setAssessmentmarkmax(assessmentmarkmax);
	}

	/**
	* Returns the assessmentid of this assessment specification config.
	*
	* @return the assessmentid of this assessment specification config
	*/
	@Override
	public java.lang.String getAssessmentid() {
		return _assessmentSpecificationConfig.getAssessmentid();
	}

	/**
	* Sets the assessmentid of this assessment specification config.
	*
	* @param assessmentid the assessmentid of this assessment specification config
	*/
	@Override
	public void setAssessmentid(java.lang.String assessmentid) {
		_assessmentSpecificationConfig.setAssessmentid(assessmentid);
	}

	/**
	* Returns the assessmentyear of this assessment specification config.
	*
	* @return the assessmentyear of this assessment specification config
	*/
	@Override
	public java.lang.String getAssessmentyear() {
		return _assessmentSpecificationConfig.getAssessmentyear();
	}

	/**
	* Sets the assessmentyear of this assessment specification config.
	*
	* @param assessmentyear the assessmentyear of this assessment specification config
	*/
	@Override
	public void setAssessmentyear(java.lang.String assessmentyear) {
		_assessmentSpecificationConfig.setAssessmentyear(assessmentyear);
	}

	/**
	* Returns the evaluationperiod of this assessment specification config.
	*
	* @return the evaluationperiod of this assessment specification config
	*/
	@Override
	public java.lang.String getEvaluationperiod() {
		return _assessmentSpecificationConfig.getEvaluationperiod();
	}

	/**
	* Sets the evaluationperiod of this assessment specification config.
	*
	* @param evaluationperiod the evaluationperiod of this assessment specification config
	*/
	@Override
	public void setEvaluationperiod(java.lang.String evaluationperiod) {
		_assessmentSpecificationConfig.setEvaluationperiod(evaluationperiod);
	}

	/**
	* Returns the latestassessment of this assessment specification config.
	*
	* @return the latestassessment of this assessment specification config
	*/
	@Override
	public java.util.Date getLatestassessment() {
		return _assessmentSpecificationConfig.getLatestassessment();
	}

	/**
	* Sets the latestassessment of this assessment specification config.
	*
	* @param latestassessment the latestassessment of this assessment specification config
	*/
	@Override
	public void setLatestassessment(java.util.Date latestassessment) {
		_assessmentSpecificationConfig.setLatestassessment(latestassessment);
	}

	/**
	* Returns the synchdate of this assessment specification config.
	*
	* @return the synchdate of this assessment specification config
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _assessmentSpecificationConfig.getSynchdate();
	}

	/**
	* Sets the synchdate of this assessment specification config.
	*
	* @param synchdate the synchdate of this assessment specification config
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_assessmentSpecificationConfig.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _assessmentSpecificationConfig.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assessmentSpecificationConfig.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assessmentSpecificationConfig.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assessmentSpecificationConfig.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assessmentSpecificationConfig.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assessmentSpecificationConfig.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessmentSpecificationConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessmentSpecificationConfig.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assessmentSpecificationConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assessmentSpecificationConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessmentSpecificationConfig.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessmentSpecificationConfigWrapper((AssessmentSpecificationConfig)_assessmentSpecificationConfig.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig) {
		return _assessmentSpecificationConfig.compareTo(assessmentSpecificationConfig);
	}

	@Override
	public int hashCode() {
		return _assessmentSpecificationConfig.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> toCacheModel() {
		return _assessmentSpecificationConfig.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig toEscapedModel() {
		return new AssessmentSpecificationConfigWrapper(_assessmentSpecificationConfig.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig toUnescapedModel() {
		return new AssessmentSpecificationConfigWrapper(_assessmentSpecificationConfig.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessmentSpecificationConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assessmentSpecificationConfig.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessmentSpecificationConfig.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentSpecificationConfigWrapper)) {
			return false;
		}

		AssessmentSpecificationConfigWrapper assessmentSpecificationConfigWrapper =
			(AssessmentSpecificationConfigWrapper)obj;

		if (Validator.equals(_assessmentSpecificationConfig,
					assessmentSpecificationConfigWrapper._assessmentSpecificationConfig)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssessmentSpecificationConfig getWrappedAssessmentSpecificationConfig() {
		return _assessmentSpecificationConfig;
	}

	@Override
	public AssessmentSpecificationConfig getWrappedModel() {
		return _assessmentSpecificationConfig;
	}

	@Override
	public void resetOriginalValues() {
		_assessmentSpecificationConfig.resetOriginalValues();
	}

	private AssessmentSpecificationConfig _assessmentSpecificationConfig;
}