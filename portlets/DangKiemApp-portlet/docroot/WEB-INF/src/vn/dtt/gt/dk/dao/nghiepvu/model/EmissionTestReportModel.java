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
 * The base model interface for the EmissionTestReport service. Represents a row in the &quot;vr_emissiontestreport&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportImpl}.
 * </p>
 *
 * @author win_64
 * @see EmissionTestReport
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl
 * @generated
 */
public interface EmissionTestReportModel extends BaseModel<EmissionTestReport> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emission test report model instance should use the {@link EmissionTestReport} interface instead.
	 */

	/**
	 * Returns the primary key of this emission test report.
	 *
	 * @return the primary key of this emission test report
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emission test report.
	 *
	 * @param primaryKey the primary key of this emission test report
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this emission test report.
	 *
	 * @return the ID of this emission test report
	 */
	public long getId();

	/**
	 * Sets the ID of this emission test report.
	 *
	 * @param id the ID of this emission test report
	 */
	public void setId(long id);

	/**
	 * Returns the registered inspection ID of this emission test report.
	 *
	 * @return the registered inspection ID of this emission test report
	 */
	public long getRegisteredInspectionId();

	/**
	 * Sets the registered inspection ID of this emission test report.
	 *
	 * @param registeredInspectionId the registered inspection ID of this emission test report
	 */
	public void setRegisteredInspectionId(long registeredInspectionId);

	/**
	 * Returns the inspectionrecord ID of this emission test report.
	 *
	 * @return the inspectionrecord ID of this emission test report
	 */
	public long getInspectionrecordId();

	/**
	 * Sets the inspectionrecord ID of this emission test report.
	 *
	 * @param inspectionrecordId the inspectionrecord ID of this emission test report
	 */
	public void setInspectionrecordId(long inspectionrecordId);

	/**
	 * Returns the hosothutuc ID of this emission test report.
	 *
	 * @return the hosothutuc ID of this emission test report
	 */
	public long getHosothutucId();

	/**
	 * Sets the hosothutuc ID of this emission test report.
	 *
	 * @param hosothutucId the hosothutuc ID of this emission test report
	 */
	public void setHosothutucId(long hosothutucId);

	/**
	 * Returns the emissiontest requirement ID of this emission test report.
	 *
	 * @return the emissiontest requirement ID of this emission test report
	 */
	public long getEmissiontestRequirementId();

	/**
	 * Sets the emissiontest requirement ID of this emission test report.
	 *
	 * @param emissiontestRequirementId the emissiontest requirement ID of this emission test report
	 */
	public void setEmissiontestRequirementId(long emissiontestRequirementId);

	/**
	 * Returns the requirement number of this emission test report.
	 *
	 * @return the requirement number of this emission test report
	 */
	@AutoEscape
	public String getRequirementNumber();

	/**
	 * Sets the requirement number of this emission test report.
	 *
	 * @param requirementNumber the requirement number of this emission test report
	 */
	public void setRequirementNumber(String requirementNumber);

	/**
	 * Returns the report number of this emission test report.
	 *
	 * @return the report number of this emission test report
	 */
	@AutoEscape
	public String getReportNumber();

	/**
	 * Sets the report number of this emission test report.
	 *
	 * @param reportNumber the report number of this emission test report
	 */
	public void setReportNumber(String reportNumber);

	/**
	 * Returns the description of this emission test report.
	 *
	 * @return the description of this emission test report
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this emission test report.
	 *
	 * @param description the description of this emission test report
	 */
	public void setDescription(String description);

	/**
	 * Returns the attached file of this emission test report.
	 *
	 * @return the attached file of this emission test report
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this emission test report.
	 *
	 * @param attachedFile the attached file of this emission test report
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the phieuxulyphu ID of this emission test report.
	 *
	 * @return the phieuxulyphu ID of this emission test report
	 */
	public long getPhieuxulyphuId();

	/**
	 * Sets the phieuxulyphu ID of this emission test report.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID of this emission test report
	 */
	public void setPhieuxulyphuId(long phieuxulyphuId);

	/**
	 * Returns the confirmed result of this emission test report.
	 *
	 * @return the confirmed result of this emission test report
	 */
	public long getConfirmedResult();

	/**
	 * Sets the confirmed result of this emission test report.
	 *
	 * @param confirmedResult the confirmed result of this emission test report
	 */
	public void setConfirmedResult(long confirmedResult);

	/**
	 * Returns the sign name of this emission test report.
	 *
	 * @return the sign name of this emission test report
	 */
	@AutoEscape
	public String getSignName();

	/**
	 * Sets the sign name of this emission test report.
	 *
	 * @param signName the sign name of this emission test report
	 */
	public void setSignName(String signName);

	/**
	 * Returns the sign title of this emission test report.
	 *
	 * @return the sign title of this emission test report
	 */
	@AutoEscape
	public String getSignTitle();

	/**
	 * Sets the sign title of this emission test report.
	 *
	 * @param signTitle the sign title of this emission test report
	 */
	public void setSignTitle(String signTitle);

	/**
	 * Returns the sign place of this emission test report.
	 *
	 * @return the sign place of this emission test report
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this emission test report.
	 *
	 * @param signPlace the sign place of this emission test report
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this emission test report.
	 *
	 * @return the sign date of this emission test report
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this emission test report.
	 *
	 * @param signDate the sign date of this emission test report
	 */
	public void setSignDate(Date signDate);

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
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}