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
 * The base model interface for the AssessmentSpecificationConfig service. Represents a row in the &quot;vr_assessmentspecificationconfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigImpl}.
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationConfig
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl
 * @generated
 */
public interface AssessmentSpecificationConfigModel extends BaseModel<AssessmentSpecificationConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assessment specification config model instance should use the {@link AssessmentSpecificationConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this assessment specification config.
	 *
	 * @return the primary key of this assessment specification config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assessment specification config.
	 *
	 * @param primaryKey the primary key of this assessment specification config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this assessment specification config.
	 *
	 * @return the ID of this assessment specification config
	 */
	public long getId();

	/**
	 * Sets the ID of this assessment specification config.
	 *
	 * @param id the ID of this assessment specification config
	 */
	public void setId(long id);

	/**
	 * Returns the assessmenttype of this assessment specification config.
	 *
	 * @return the assessmenttype of this assessment specification config
	 */
	@AutoEscape
	public String getAssessmenttype();

	/**
	 * Sets the assessmenttype of this assessment specification config.
	 *
	 * @param assessmenttype the assessmenttype of this assessment specification config
	 */
	public void setAssessmenttype(String assessmenttype);

	/**
	 * Returns the specificationcategory of this assessment specification config.
	 *
	 * @return the specificationcategory of this assessment specification config
	 */
	@AutoEscape
	public String getSpecificationcategory();

	/**
	 * Sets the specificationcategory of this assessment specification config.
	 *
	 * @param specificationcategory the specificationcategory of this assessment specification config
	 */
	public void setSpecificationcategory(String specificationcategory);

	/**
	 * Returns the specificationgroupcode of this assessment specification config.
	 *
	 * @return the specificationgroupcode of this assessment specification config
	 */
	@AutoEscape
	public String getSpecificationgroupcode();

	/**
	 * Sets the specificationgroupcode of this assessment specification config.
	 *
	 * @param specificationgroupcode the specificationgroupcode of this assessment specification config
	 */
	public void setSpecificationgroupcode(String specificationgroupcode);

	/**
	 * Returns the specificationsequence of this assessment specification config.
	 *
	 * @return the specificationsequence of this assessment specification config
	 */
	public int getSpecificationsequence();

	/**
	 * Sets the specificationsequence of this assessment specification config.
	 *
	 * @param specificationsequence the specificationsequence of this assessment specification config
	 */
	public void setSpecificationsequence(int specificationsequence);

	/**
	 * Returns the specificationcode of this assessment specification config.
	 *
	 * @return the specificationcode of this assessment specification config
	 */
	@AutoEscape
	public String getSpecificationcode();

	/**
	 * Sets the specificationcode of this assessment specification config.
	 *
	 * @param specificationcode the specificationcode of this assessment specification config
	 */
	public void setSpecificationcode(String specificationcode);

	/**
	 * Returns the specificationname of this assessment specification config.
	 *
	 * @return the specificationname of this assessment specification config
	 */
	@AutoEscape
	public String getSpecificationname();

	/**
	 * Sets the specificationname of this assessment specification config.
	 *
	 * @param specificationname the specificationname of this assessment specification config
	 */
	public void setSpecificationname(String specificationname);

	/**
	 * Returns the specificationdescription of this assessment specification config.
	 *
	 * @return the specificationdescription of this assessment specification config
	 */
	@AutoEscape
	public String getSpecificationdescription();

	/**
	 * Sets the specificationdescription of this assessment specification config.
	 *
	 * @param specificationdescription the specificationdescription of this assessment specification config
	 */
	public void setSpecificationdescription(String specificationdescription);

	/**
	 * Returns the assessmentcoefficient of this assessment specification config.
	 *
	 * @return the assessmentcoefficient of this assessment specification config
	 */
	public double getAssessmentcoefficient();

	/**
	 * Sets the assessmentcoefficient of this assessment specification config.
	 *
	 * @param assessmentcoefficient the assessmentcoefficient of this assessment specification config
	 */
	public void setAssessmentcoefficient(double assessmentcoefficient);

	/**
	 * Returns the assessmentindexmin of this assessment specification config.
	 *
	 * @return the assessmentindexmin of this assessment specification config
	 */
	public double getAssessmentindexmin();

	/**
	 * Sets the assessmentindexmin of this assessment specification config.
	 *
	 * @param assessmentindexmin the assessmentindexmin of this assessment specification config
	 */
	public void setAssessmentindexmin(double assessmentindexmin);

	/**
	 * Returns the assessmentmarkmin of this assessment specification config.
	 *
	 * @return the assessmentmarkmin of this assessment specification config
	 */
	public double getAssessmentmarkmin();

	/**
	 * Sets the assessmentmarkmin of this assessment specification config.
	 *
	 * @param assessmentmarkmin the assessmentmarkmin of this assessment specification config
	 */
	public void setAssessmentmarkmin(double assessmentmarkmin);

	/**
	 * Returns the assessmentindexmax of this assessment specification config.
	 *
	 * @return the assessmentindexmax of this assessment specification config
	 */
	public double getAssessmentindexmax();

	/**
	 * Sets the assessmentindexmax of this assessment specification config.
	 *
	 * @param assessmentindexmax the assessmentindexmax of this assessment specification config
	 */
	public void setAssessmentindexmax(double assessmentindexmax);

	/**
	 * Returns the assessmentmarkmax of this assessment specification config.
	 *
	 * @return the assessmentmarkmax of this assessment specification config
	 */
	public double getAssessmentmarkmax();

	/**
	 * Sets the assessmentmarkmax of this assessment specification config.
	 *
	 * @param assessmentmarkmax the assessmentmarkmax of this assessment specification config
	 */
	public void setAssessmentmarkmax(double assessmentmarkmax);

	/**
	 * Returns the assessmentid of this assessment specification config.
	 *
	 * @return the assessmentid of this assessment specification config
	 */
	@AutoEscape
	public String getAssessmentid();

	/**
	 * Sets the assessmentid of this assessment specification config.
	 *
	 * @param assessmentid the assessmentid of this assessment specification config
	 */
	public void setAssessmentid(String assessmentid);

	/**
	 * Returns the assessmentyear of this assessment specification config.
	 *
	 * @return the assessmentyear of this assessment specification config
	 */
	@AutoEscape
	public String getAssessmentyear();

	/**
	 * Sets the assessmentyear of this assessment specification config.
	 *
	 * @param assessmentyear the assessmentyear of this assessment specification config
	 */
	public void setAssessmentyear(String assessmentyear);

	/**
	 * Returns the evaluationperiod of this assessment specification config.
	 *
	 * @return the evaluationperiod of this assessment specification config
	 */
	@AutoEscape
	public String getEvaluationperiod();

	/**
	 * Sets the evaluationperiod of this assessment specification config.
	 *
	 * @param evaluationperiod the evaluationperiod of this assessment specification config
	 */
	public void setEvaluationperiod(String evaluationperiod);

	/**
	 * Returns the latestassessment of this assessment specification config.
	 *
	 * @return the latestassessment of this assessment specification config
	 */
	public Date getLatestassessment();

	/**
	 * Sets the latestassessment of this assessment specification config.
	 *
	 * @param latestassessment the latestassessment of this assessment specification config
	 */
	public void setLatestassessment(Date latestassessment);

	/**
	 * Returns the synchdate of this assessment specification config.
	 *
	 * @return the synchdate of this assessment specification config
	 */
	public Date getSynchdate();

	/**
	 * Sets the synchdate of this assessment specification config.
	 *
	 * @param synchdate the synchdate of this assessment specification config
	 */
	public void setSynchdate(Date synchdate);

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
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}