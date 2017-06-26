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
 * This class is a wrapper for {@link CopReport}.
 * </p>
 *
 * @author win_64
 * @see CopReport
 * @generated
 */
public class CopReportWrapper implements CopReport, ModelWrapper<CopReport> {
	public CopReportWrapper(CopReport copReport) {
		_copReport = copReport;
	}

	@Override
	public Class<?> getModelClass() {
		return CopReport.class;
	}

	@Override
	public String getModelClassName() {
		return CopReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("reportNumber", getReportNumber());
		attributes.put("corporationId", getCorporationId());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		String reportNumber = (String)attributes.get("reportNumber");

		if (reportNumber != null) {
			setReportNumber(reportNumber);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}
	}

	/**
	* Returns the primary key of this cop report.
	*
	* @return the primary key of this cop report
	*/
	@Override
	public long getPrimaryKey() {
		return _copReport.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cop report.
	*
	* @param primaryKey the primary key of this cop report
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_copReport.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this cop report.
	*
	* @return the ID of this cop report
	*/
	@Override
	public long getId() {
		return _copReport.getId();
	}

	/**
	* Sets the ID of this cop report.
	*
	* @param id the ID of this cop report
	*/
	@Override
	public void setId(long id) {
		_copReport.setId(id);
	}

	/**
	* Returns the registered inspection ID of this cop report.
	*
	* @return the registered inspection ID of this cop report
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _copReport.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this cop report.
	*
	* @param registeredInspectionId the registered inspection ID of this cop report
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_copReport.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the report number of this cop report.
	*
	* @return the report number of this cop report
	*/
	@Override
	public java.lang.String getReportNumber() {
		return _copReport.getReportNumber();
	}

	/**
	* Sets the report number of this cop report.
	*
	* @param reportNumber the report number of this cop report
	*/
	@Override
	public void setReportNumber(java.lang.String reportNumber) {
		_copReport.setReportNumber(reportNumber);
	}

	/**
	* Returns the corporation ID of this cop report.
	*
	* @return the corporation ID of this cop report
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _copReport.getCorporationId();
	}

	/**
	* Sets the corporation ID of this cop report.
	*
	* @param corporationId the corporation ID of this cop report
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_copReport.setCorporationId(corporationId);
	}

	/**
	* Returns the sign name of this cop report.
	*
	* @return the sign name of this cop report
	*/
	@Override
	public java.lang.String getSignName() {
		return _copReport.getSignName();
	}

	/**
	* Sets the sign name of this cop report.
	*
	* @param signName the sign name of this cop report
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_copReport.setSignName(signName);
	}

	/**
	* Returns the sign title of this cop report.
	*
	* @return the sign title of this cop report
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _copReport.getSignTitle();
	}

	/**
	* Sets the sign title of this cop report.
	*
	* @param signTitle the sign title of this cop report
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_copReport.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this cop report.
	*
	* @return the sign place of this cop report
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _copReport.getSignPlace();
	}

	/**
	* Sets the sign place of this cop report.
	*
	* @param signPlace the sign place of this cop report
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_copReport.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this cop report.
	*
	* @return the sign date of this cop report
	*/
	@Override
	public java.util.Date getSignDate() {
		return _copReport.getSignDate();
	}

	/**
	* Sets the sign date of this cop report.
	*
	* @param signDate the sign date of this cop report
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_copReport.setSignDate(signDate);
	}

	@Override
	public boolean isNew() {
		return _copReport.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_copReport.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _copReport.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_copReport.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _copReport.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _copReport.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_copReport.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _copReport.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_copReport.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_copReport.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_copReport.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CopReportWrapper((CopReport)_copReport.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.nghiepvu.model.CopReport copReport) {
		return _copReport.compareTo(copReport);
	}

	@Override
	public int hashCode() {
		return _copReport.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CopReport> toCacheModel() {
		return _copReport.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CopReport toEscapedModel() {
		return new CopReportWrapper(_copReport.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CopReport toUnescapedModel() {
		return new CopReportWrapper(_copReport.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _copReport.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _copReport.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_copReport.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CopReportWrapper)) {
			return false;
		}

		CopReportWrapper copReportWrapper = (CopReportWrapper)obj;

		if (Validator.equals(_copReport, copReportWrapper._copReport)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CopReport getWrappedCopReport() {
		return _copReport;
	}

	@Override
	public CopReport getWrappedModel() {
		return _copReport;
	}

	@Override
	public void resetOriginalValues() {
		_copReport.resetOriginalValues();
	}

	private CopReport _copReport;
}