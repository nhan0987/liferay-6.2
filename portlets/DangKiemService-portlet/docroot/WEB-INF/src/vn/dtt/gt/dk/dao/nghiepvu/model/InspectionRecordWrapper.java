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
 * This class is a wrapper for {@link InspectionRecord}.
 * </p>
 *
 * @author huymq
 * @see InspectionRecord
 * @generated
 */
public class InspectionRecordWrapper implements InspectionRecord,
	ModelWrapper<InspectionRecord> {
	public InspectionRecordWrapper(InspectionRecord inspectionRecord) {
		_inspectionRecord = inspectionRecord;
	}

	@Override
	public Class<?> getModelClass() {
		return InspectionRecord.class;
	}

	@Override
	public String getModelClassName() {
		return InspectionRecord.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("inspectionRecordNo", getInspectionRecordNo());
		attributes.put("inspectionRecordDate", getInspectionRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("customsDeclarationid", getCustomsDeclarationid());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDateFrom", getInspectionDateFrom());
		attributes.put("inspectionDateTo", getInspectionDateTo());
		attributes.put("inspectionMode", getInspectionMode());
		attributes.put("description", getDescription());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("confirmedResult", getConfirmedResult());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());
		attributes.put("markupSafeTest", getMarkupSafeTest());
		attributes.put("markupEmissionTest", getMarkupEmissionTest());
		attributes.put("markupControl", getMarkupControl());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("remarks", getRemarks());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("otherCosts", getOtherCosts());
		attributes.put("markupPaid", getMarkupPaid());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String inspectionRecordNo = (String)attributes.get("inspectionRecordNo");

		if (inspectionRecordNo != null) {
			setInspectionRecordNo(inspectionRecordNo);
		}

		Date inspectionRecordDate = (Date)attributes.get("inspectionRecordDate");

		if (inspectionRecordDate != null) {
			setInspectionRecordDate(inspectionRecordDate);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long customsDeclarationid = (Long)attributes.get("customsDeclarationid");

		if (customsDeclarationid != null) {
			setCustomsDeclarationid(customsDeclarationid);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		Date inspectionDateFrom = (Date)attributes.get("inspectionDateFrom");

		if (inspectionDateFrom != null) {
			setInspectionDateFrom(inspectionDateFrom);
		}

		Date inspectionDateTo = (Date)attributes.get("inspectionDateTo");

		if (inspectionDateTo != null) {
			setInspectionDateTo(inspectionDateTo);
		}

		Long inspectionMode = (Long)attributes.get("inspectionMode");

		if (inspectionMode != null) {
			setInspectionMode(inspectionMode);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Long confirmedResult = (Long)attributes.get("confirmedResult");

		if (confirmedResult != null) {
			setConfirmedResult(confirmedResult);
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

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}

		Long markupSafeTest = (Long)attributes.get("markupSafeTest");

		if (markupSafeTest != null) {
			setMarkupSafeTest(markupSafeTest);
		}

		Long markupEmissionTest = (Long)attributes.get("markupEmissionTest");

		if (markupEmissionTest != null) {
			setMarkupEmissionTest(markupEmissionTest);
		}

		Long markupControl = (Long)attributes.get("markupControl");

		if (markupControl != null) {
			setMarkupControl(markupControl);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Double otherCosts = (Double)attributes.get("otherCosts");

		if (otherCosts != null) {
			setOtherCosts(otherCosts);
		}

		Long markupPaid = (Long)attributes.get("markupPaid");

		if (markupPaid != null) {
			setMarkupPaid(markupPaid);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this inspection record.
	*
	* @return the primary key of this inspection record
	*/
	@Override
	public long getPrimaryKey() {
		return _inspectionRecord.getPrimaryKey();
	}

	/**
	* Sets the primary key of this inspection record.
	*
	* @param primaryKey the primary key of this inspection record
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_inspectionRecord.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this inspection record.
	*
	* @return the ID of this inspection record
	*/
	@Override
	public long getId() {
		return _inspectionRecord.getId();
	}

	/**
	* Sets the ID of this inspection record.
	*
	* @param id the ID of this inspection record
	*/
	@Override
	public void setId(long id) {
		_inspectionRecord.setId(id);
	}

	/**
	* Returns the inspection record no of this inspection record.
	*
	* @return the inspection record no of this inspection record
	*/
	@Override
	public java.lang.String getInspectionRecordNo() {
		return _inspectionRecord.getInspectionRecordNo();
	}

	/**
	* Sets the inspection record no of this inspection record.
	*
	* @param inspectionRecordNo the inspection record no of this inspection record
	*/
	@Override
	public void setInspectionRecordNo(java.lang.String inspectionRecordNo) {
		_inspectionRecord.setInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns the inspection record date of this inspection record.
	*
	* @return the inspection record date of this inspection record
	*/
	@Override
	public java.util.Date getInspectionRecordDate() {
		return _inspectionRecord.getInspectionRecordDate();
	}

	/**
	* Sets the inspection record date of this inspection record.
	*
	* @param inspectionRecordDate the inspection record date of this inspection record
	*/
	@Override
	public void setInspectionRecordDate(java.util.Date inspectionRecordDate) {
		_inspectionRecord.setInspectionRecordDate(inspectionRecordDate);
	}

	/**
	* Returns the corporation ID of this inspection record.
	*
	* @return the corporation ID of this inspection record
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _inspectionRecord.getCorporationId();
	}

	/**
	* Sets the corporation ID of this inspection record.
	*
	* @param corporationId the corporation ID of this inspection record
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_inspectionRecord.setCorporationId(corporationId);
	}

	/**
	* Returns the inspector ID of this inspection record.
	*
	* @return the inspector ID of this inspection record
	*/
	@Override
	public long getInspectorId() {
		return _inspectionRecord.getInspectorId();
	}

	/**
	* Sets the inspector ID of this inspection record.
	*
	* @param inspectorId the inspector ID of this inspection record
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_inspectionRecord.setInspectorId(inspectorId);
	}

	/**
	* Returns the confirmed inspection ID of this inspection record.
	*
	* @return the confirmed inspection ID of this inspection record
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _inspectionRecord.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this inspection record.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this inspection record
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_inspectionRecord.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the customs declarationid of this inspection record.
	*
	* @return the customs declarationid of this inspection record
	*/
	@Override
	public long getCustomsDeclarationid() {
		return _inspectionRecord.getCustomsDeclarationid();
	}

	/**
	* Sets the customs declarationid of this inspection record.
	*
	* @param customsDeclarationid the customs declarationid of this inspection record
	*/
	@Override
	public void setCustomsDeclarationid(long customsDeclarationid) {
		_inspectionRecord.setCustomsDeclarationid(customsDeclarationid);
	}

	/**
	* Returns the inspection site of this inspection record.
	*
	* @return the inspection site of this inspection record
	*/
	@Override
	public java.lang.String getInspectionSite() {
		return _inspectionRecord.getInspectionSite();
	}

	/**
	* Sets the inspection site of this inspection record.
	*
	* @param inspectionSite the inspection site of this inspection record
	*/
	@Override
	public void setInspectionSite(java.lang.String inspectionSite) {
		_inspectionRecord.setInspectionSite(inspectionSite);
	}

	/**
	* Returns the inspection date from of this inspection record.
	*
	* @return the inspection date from of this inspection record
	*/
	@Override
	public java.util.Date getInspectionDateFrom() {
		return _inspectionRecord.getInspectionDateFrom();
	}

	/**
	* Sets the inspection date from of this inspection record.
	*
	* @param inspectionDateFrom the inspection date from of this inspection record
	*/
	@Override
	public void setInspectionDateFrom(java.util.Date inspectionDateFrom) {
		_inspectionRecord.setInspectionDateFrom(inspectionDateFrom);
	}

	/**
	* Returns the inspection date to of this inspection record.
	*
	* @return the inspection date to of this inspection record
	*/
	@Override
	public java.util.Date getInspectionDateTo() {
		return _inspectionRecord.getInspectionDateTo();
	}

	/**
	* Sets the inspection date to of this inspection record.
	*
	* @param inspectionDateTo the inspection date to of this inspection record
	*/
	@Override
	public void setInspectionDateTo(java.util.Date inspectionDateTo) {
		_inspectionRecord.setInspectionDateTo(inspectionDateTo);
	}

	/**
	* Returns the inspection mode of this inspection record.
	*
	* @return the inspection mode of this inspection record
	*/
	@Override
	public long getInspectionMode() {
		return _inspectionRecord.getInspectionMode();
	}

	/**
	* Sets the inspection mode of this inspection record.
	*
	* @param inspectionMode the inspection mode of this inspection record
	*/
	@Override
	public void setInspectionMode(long inspectionMode) {
		_inspectionRecord.setInspectionMode(inspectionMode);
	}

	/**
	* Returns the description of this inspection record.
	*
	* @return the description of this inspection record
	*/
	@Override
	public java.lang.String getDescription() {
		return _inspectionRecord.getDescription();
	}

	/**
	* Sets the description of this inspection record.
	*
	* @param description the description of this inspection record
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_inspectionRecord.setDescription(description);
	}

	/**
	* Returns the attached file of this inspection record.
	*
	* @return the attached file of this inspection record
	*/
	@Override
	public long getAttachedFile() {
		return _inspectionRecord.getAttachedFile();
	}

	/**
	* Sets the attached file of this inspection record.
	*
	* @param attachedFile the attached file of this inspection record
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_inspectionRecord.setAttachedFile(attachedFile);
	}

	/**
	* Returns the confirmed result of this inspection record.
	*
	* @return the confirmed result of this inspection record
	*/
	@Override
	public long getConfirmedResult() {
		return _inspectionRecord.getConfirmedResult();
	}

	/**
	* Sets the confirmed result of this inspection record.
	*
	* @param confirmedResult the confirmed result of this inspection record
	*/
	@Override
	public void setConfirmedResult(long confirmedResult) {
		_inspectionRecord.setConfirmedResult(confirmedResult);
	}

	/**
	* Returns the sign name of this inspection record.
	*
	* @return the sign name of this inspection record
	*/
	@Override
	public java.lang.String getSignName() {
		return _inspectionRecord.getSignName();
	}

	/**
	* Sets the sign name of this inspection record.
	*
	* @param signName the sign name of this inspection record
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_inspectionRecord.setSignName(signName);
	}

	/**
	* Returns the sign title of this inspection record.
	*
	* @return the sign title of this inspection record
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _inspectionRecord.getSignTitle();
	}

	/**
	* Sets the sign title of this inspection record.
	*
	* @param signTitle the sign title of this inspection record
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_inspectionRecord.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this inspection record.
	*
	* @return the sign place of this inspection record
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _inspectionRecord.getSignPlace();
	}

	/**
	* Sets the sign place of this inspection record.
	*
	* @param signPlace the sign place of this inspection record
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_inspectionRecord.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this inspection record.
	*
	* @return the sign date of this inspection record
	*/
	@Override
	public java.util.Date getSignDate() {
		return _inspectionRecord.getSignDate();
	}

	/**
	* Sets the sign date of this inspection record.
	*
	* @param signDate the sign date of this inspection record
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_inspectionRecord.setSignDate(signDate);
	}

	/**
	* Returns the phieu xu ly phu ID of this inspection record.
	*
	* @return the phieu xu ly phu ID of this inspection record
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _inspectionRecord.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this inspection record.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this inspection record
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the markup safe test of this inspection record.
	*
	* @return the markup safe test of this inspection record
	*/
	@Override
	public long getMarkupSafeTest() {
		return _inspectionRecord.getMarkupSafeTest();
	}

	/**
	* Sets the markup safe test of this inspection record.
	*
	* @param markupSafeTest the markup safe test of this inspection record
	*/
	@Override
	public void setMarkupSafeTest(long markupSafeTest) {
		_inspectionRecord.setMarkupSafeTest(markupSafeTest);
	}

	/**
	* Returns the markup emission test of this inspection record.
	*
	* @return the markup emission test of this inspection record
	*/
	@Override
	public long getMarkupEmissionTest() {
		return _inspectionRecord.getMarkupEmissionTest();
	}

	/**
	* Sets the markup emission test of this inspection record.
	*
	* @param markupEmissionTest the markup emission test of this inspection record
	*/
	@Override
	public void setMarkupEmissionTest(long markupEmissionTest) {
		_inspectionRecord.setMarkupEmissionTest(markupEmissionTest);
	}

	/**
	* Returns the markup control of this inspection record.
	*
	* @return the markup control of this inspection record
	*/
	@Override
	public long getMarkupControl() {
		return _inspectionRecord.getMarkupControl();
	}

	/**
	* Sets the markup control of this inspection record.
	*
	* @param markupControl the markup control of this inspection record
	*/
	@Override
	public void setMarkupControl(long markupControl) {
		_inspectionRecord.setMarkupControl(markupControl);
	}

	/**
	* Returns the registered inspection ID of this inspection record.
	*
	* @return the registered inspection ID of this inspection record
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _inspectionRecord.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this inspection record.
	*
	* @param registeredInspectionId the registered inspection ID of this inspection record
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_inspectionRecord.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the remarks of this inspection record.
	*
	* @return the remarks of this inspection record
	*/
	@Override
	public java.lang.String getRemarks() {
		return _inspectionRecord.getRemarks();
	}

	/**
	* Sets the remarks of this inspection record.
	*
	* @param remarks the remarks of this inspection record
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_inspectionRecord.setRemarks(remarks);
	}

	/**
	* Returns the ho so thu tuc ID of this inspection record.
	*
	* @return the ho so thu tuc ID of this inspection record
	*/
	@Override
	public long getHoSoThuTucId() {
		return _inspectionRecord.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this inspection record.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this inspection record
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_inspectionRecord.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the other costs of this inspection record.
	*
	* @return the other costs of this inspection record
	*/
	@Override
	public double getOtherCosts() {
		return _inspectionRecord.getOtherCosts();
	}

	/**
	* Sets the other costs of this inspection record.
	*
	* @param otherCosts the other costs of this inspection record
	*/
	@Override
	public void setOtherCosts(double otherCosts) {
		_inspectionRecord.setOtherCosts(otherCosts);
	}

	/**
	* Returns the markup paid of this inspection record.
	*
	* @return the markup paid of this inspection record
	*/
	@Override
	public long getMarkupPaid() {
		return _inspectionRecord.getMarkupPaid();
	}

	/**
	* Sets the markup paid of this inspection record.
	*
	* @param markupPaid the markup paid of this inspection record
	*/
	@Override
	public void setMarkupPaid(long markupPaid) {
		_inspectionRecord.setMarkupPaid(markupPaid);
	}

	/**
	* Returns the synchdate of this inspection record.
	*
	* @return the synchdate of this inspection record
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _inspectionRecord.getSynchdate();
	}

	/**
	* Sets the synchdate of this inspection record.
	*
	* @param synchdate the synchdate of this inspection record
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_inspectionRecord.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _inspectionRecord.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_inspectionRecord.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _inspectionRecord.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_inspectionRecord.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _inspectionRecord.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _inspectionRecord.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_inspectionRecord.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _inspectionRecord.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_inspectionRecord.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_inspectionRecord.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_inspectionRecord.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InspectionRecordWrapper((InspectionRecord)_inspectionRecord.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord inspectionRecord) {
		return _inspectionRecord.compareTo(inspectionRecord);
	}

	@Override
	public int hashCode() {
		return _inspectionRecord.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> toCacheModel() {
		return _inspectionRecord.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord toEscapedModel() {
		return new InspectionRecordWrapper(_inspectionRecord.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord toUnescapedModel() {
		return new InspectionRecordWrapper(_inspectionRecord.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _inspectionRecord.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _inspectionRecord.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_inspectionRecord.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InspectionRecordWrapper)) {
			return false;
		}

		InspectionRecordWrapper inspectionRecordWrapper = (InspectionRecordWrapper)obj;

		if (Validator.equals(_inspectionRecord,
					inspectionRecordWrapper._inspectionRecord)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InspectionRecord getWrappedInspectionRecord() {
		return _inspectionRecord;
	}

	@Override
	public InspectionRecord getWrappedModel() {
		return _inspectionRecord;
	}

	@Override
	public void resetOriginalValues() {
		_inspectionRecord.resetOriginalValues();
	}

	private InspectionRecord _inspectionRecord;
}