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
 * This class is a wrapper for {@link AssessmentPeriod}.
 * </p>
 *
 * @author win_64
 * @see AssessmentPeriod
 * @generated
 */
public class AssessmentPeriodWrapper implements AssessmentPeriod,
	ModelWrapper<AssessmentPeriod> {
	public AssessmentPeriodWrapper(AssessmentPeriod assessmentPeriod) {
		_assessmentPeriod = assessmentPeriod;
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentPeriod.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentPeriod.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessmentyear", getAssessmentyear());
		attributes.put("evaluationperiod", getEvaluationperiod());
		attributes.put("importerchecked", getImporterchecked());
		attributes.put("inspectorchecked", getInspectorchecked());
		attributes.put("productionchecked", getProductionchecked());
		attributes.put("synchdate", getSynchdate());
		attributes.put("previousassessmentid", getPreviousassessmentid());
		attributes.put("previousassessmentyear", getPreviousassessmentyear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Integer importerchecked = (Integer)attributes.get("importerchecked");

		if (importerchecked != null) {
			setImporterchecked(importerchecked);
		}

		Integer inspectorchecked = (Integer)attributes.get("inspectorchecked");

		if (inspectorchecked != null) {
			setInspectorchecked(inspectorchecked);
		}

		Integer productionchecked = (Integer)attributes.get("productionchecked");

		if (productionchecked != null) {
			setProductionchecked(productionchecked);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}

		String previousassessmentid = (String)attributes.get(
				"previousassessmentid");

		if (previousassessmentid != null) {
			setPreviousassessmentid(previousassessmentid);
		}

		String previousassessmentyear = (String)attributes.get(
				"previousassessmentyear");

		if (previousassessmentyear != null) {
			setPreviousassessmentyear(previousassessmentyear);
		}
	}

	/**
	* Returns the primary key of this assessment period.
	*
	* @return the primary key of this assessment period
	*/
	@Override
	public long getPrimaryKey() {
		return _assessmentPeriod.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment period.
	*
	* @param primaryKey the primary key of this assessment period
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assessmentPeriod.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this assessment period.
	*
	* @return the ID of this assessment period
	*/
	@Override
	public long getId() {
		return _assessmentPeriod.getId();
	}

	/**
	* Sets the ID of this assessment period.
	*
	* @param id the ID of this assessment period
	*/
	@Override
	public void setId(long id) {
		_assessmentPeriod.setId(id);
	}

	/**
	* Returns the assessmentid of this assessment period.
	*
	* @return the assessmentid of this assessment period
	*/
	@Override
	public java.lang.String getAssessmentid() {
		return _assessmentPeriod.getAssessmentid();
	}

	/**
	* Sets the assessmentid of this assessment period.
	*
	* @param assessmentid the assessmentid of this assessment period
	*/
	@Override
	public void setAssessmentid(java.lang.String assessmentid) {
		_assessmentPeriod.setAssessmentid(assessmentid);
	}

	/**
	* Returns the assessmentyear of this assessment period.
	*
	* @return the assessmentyear of this assessment period
	*/
	@Override
	public java.lang.String getAssessmentyear() {
		return _assessmentPeriod.getAssessmentyear();
	}

	/**
	* Sets the assessmentyear of this assessment period.
	*
	* @param assessmentyear the assessmentyear of this assessment period
	*/
	@Override
	public void setAssessmentyear(java.lang.String assessmentyear) {
		_assessmentPeriod.setAssessmentyear(assessmentyear);
	}

	/**
	* Returns the evaluationperiod of this assessment period.
	*
	* @return the evaluationperiod of this assessment period
	*/
	@Override
	public java.lang.String getEvaluationperiod() {
		return _assessmentPeriod.getEvaluationperiod();
	}

	/**
	* Sets the evaluationperiod of this assessment period.
	*
	* @param evaluationperiod the evaluationperiod of this assessment period
	*/
	@Override
	public void setEvaluationperiod(java.lang.String evaluationperiod) {
		_assessmentPeriod.setEvaluationperiod(evaluationperiod);
	}

	/**
	* Returns the importerchecked of this assessment period.
	*
	* @return the importerchecked of this assessment period
	*/
	@Override
	public int getImporterchecked() {
		return _assessmentPeriod.getImporterchecked();
	}

	/**
	* Sets the importerchecked of this assessment period.
	*
	* @param importerchecked the importerchecked of this assessment period
	*/
	@Override
	public void setImporterchecked(int importerchecked) {
		_assessmentPeriod.setImporterchecked(importerchecked);
	}

	/**
	* Returns the inspectorchecked of this assessment period.
	*
	* @return the inspectorchecked of this assessment period
	*/
	@Override
	public int getInspectorchecked() {
		return _assessmentPeriod.getInspectorchecked();
	}

	/**
	* Sets the inspectorchecked of this assessment period.
	*
	* @param inspectorchecked the inspectorchecked of this assessment period
	*/
	@Override
	public void setInspectorchecked(int inspectorchecked) {
		_assessmentPeriod.setInspectorchecked(inspectorchecked);
	}

	/**
	* Returns the productionchecked of this assessment period.
	*
	* @return the productionchecked of this assessment period
	*/
	@Override
	public int getProductionchecked() {
		return _assessmentPeriod.getProductionchecked();
	}

	/**
	* Sets the productionchecked of this assessment period.
	*
	* @param productionchecked the productionchecked of this assessment period
	*/
	@Override
	public void setProductionchecked(int productionchecked) {
		_assessmentPeriod.setProductionchecked(productionchecked);
	}

	/**
	* Returns the synchdate of this assessment period.
	*
	* @return the synchdate of this assessment period
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _assessmentPeriod.getSynchdate();
	}

	/**
	* Sets the synchdate of this assessment period.
	*
	* @param synchdate the synchdate of this assessment period
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_assessmentPeriod.setSynchdate(synchdate);
	}

	/**
	* Returns the previousassessmentid of this assessment period.
	*
	* @return the previousassessmentid of this assessment period
	*/
	@Override
	public java.lang.String getPreviousassessmentid() {
		return _assessmentPeriod.getPreviousassessmentid();
	}

	/**
	* Sets the previousassessmentid of this assessment period.
	*
	* @param previousassessmentid the previousassessmentid of this assessment period
	*/
	@Override
	public void setPreviousassessmentid(java.lang.String previousassessmentid) {
		_assessmentPeriod.setPreviousassessmentid(previousassessmentid);
	}

	/**
	* Returns the previousassessmentyear of this assessment period.
	*
	* @return the previousassessmentyear of this assessment period
	*/
	@Override
	public java.lang.String getPreviousassessmentyear() {
		return _assessmentPeriod.getPreviousassessmentyear();
	}

	/**
	* Sets the previousassessmentyear of this assessment period.
	*
	* @param previousassessmentyear the previousassessmentyear of this assessment period
	*/
	@Override
	public void setPreviousassessmentyear(
		java.lang.String previousassessmentyear) {
		_assessmentPeriod.setPreviousassessmentyear(previousassessmentyear);
	}

	@Override
	public boolean isNew() {
		return _assessmentPeriod.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assessmentPeriod.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assessmentPeriod.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assessmentPeriod.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assessmentPeriod.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assessmentPeriod.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessmentPeriod.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessmentPeriod.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assessmentPeriod.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assessmentPeriod.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessmentPeriod.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessmentPeriodWrapper((AssessmentPeriod)_assessmentPeriod.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod) {
		return _assessmentPeriod.compareTo(assessmentPeriod);
	}

	@Override
	public int hashCode() {
		return _assessmentPeriod.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> toCacheModel() {
		return _assessmentPeriod.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod toEscapedModel() {
		return new AssessmentPeriodWrapper(_assessmentPeriod.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod toUnescapedModel() {
		return new AssessmentPeriodWrapper(_assessmentPeriod.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessmentPeriod.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assessmentPeriod.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessmentPeriod.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentPeriodWrapper)) {
			return false;
		}

		AssessmentPeriodWrapper assessmentPeriodWrapper = (AssessmentPeriodWrapper)obj;

		if (Validator.equals(_assessmentPeriod,
					assessmentPeriodWrapper._assessmentPeriod)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssessmentPeriod getWrappedAssessmentPeriod() {
		return _assessmentPeriod;
	}

	@Override
	public AssessmentPeriod getWrappedModel() {
		return _assessmentPeriod;
	}

	@Override
	public void resetOriginalValues() {
		_assessmentPeriod.resetOriginalValues();
	}

	private AssessmentPeriod _assessmentPeriod;
}