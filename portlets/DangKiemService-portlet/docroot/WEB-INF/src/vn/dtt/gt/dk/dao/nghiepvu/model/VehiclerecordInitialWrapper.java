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
 * This class is a wrapper for {@link VehiclerecordInitial}.
 * </p>
 *
 * @author huymq
 * @see VehiclerecordInitial
 * @generated
 */
public class VehiclerecordInitialWrapper implements VehiclerecordInitial,
	ModelWrapper<VehiclerecordInitial> {
	public VehiclerecordInitialWrapper(
		VehiclerecordInitial vehiclerecordInitial) {
		_vehiclerecordInitial = vehiclerecordInitial;
	}

	@Override
	public Class<?> getModelClass() {
		return VehiclerecordInitial.class;
	}

	@Override
	public String getModelClassName() {
		return VehiclerecordInitial.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("codeNumber", getCodeNumber());
		attributes.put("chassisNumber", getChassisNumber());
		attributes.put("engineNumber", getEngineNumber());
		attributes.put("productionYear", getProductionYear());
		attributes.put("vehicleEngineStatus", getVehicleEngineStatus());
		attributes.put("vehicleColor", getVehicleColor());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("currency", getCurrency());
		attributes.put("remarks", getRemarks());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("draftCertificateId", getDraftCertificateId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("markUpStatus", getMarkUpStatus());
		attributes.put("safeTestRequirementId", getSafeTestRequirementId());
		attributes.put("emissionTestRequirementId",
			getEmissionTestRequirementId());
		attributes.put("controlRequirementId", getControlRequirementId());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		Long codeNumber = (Long)attributes.get("codeNumber");

		if (codeNumber != null) {
			setCodeNumber(codeNumber);
		}

		String chassisNumber = (String)attributes.get("chassisNumber");

		if (chassisNumber != null) {
			setChassisNumber(chassisNumber);
		}

		String engineNumber = (String)attributes.get("engineNumber");

		if (engineNumber != null) {
			setEngineNumber(engineNumber);
		}

		String productionYear = (String)attributes.get("productionYear");

		if (productionYear != null) {
			setProductionYear(productionYear);
		}

		String vehicleEngineStatus = (String)attributes.get(
				"vehicleEngineStatus");

		if (vehicleEngineStatus != null) {
			setVehicleEngineStatus(vehicleEngineStatus);
		}

		String vehicleColor = (String)attributes.get("vehicleColor");

		if (vehicleColor != null) {
			setVehicleColor(vehicleColor);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		Long draftCertificateId = (Long)attributes.get("draftCertificateId");

		if (draftCertificateId != null) {
			setDraftCertificateId(draftCertificateId);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Long markUpStatus = (Long)attributes.get("markUpStatus");

		if (markUpStatus != null) {
			setMarkUpStatus(markUpStatus);
		}

		Long safeTestRequirementId = (Long)attributes.get(
				"safeTestRequirementId");

		if (safeTestRequirementId != null) {
			setSafeTestRequirementId(safeTestRequirementId);
		}

		Long emissionTestRequirementId = (Long)attributes.get(
				"emissionTestRequirementId");

		if (emissionTestRequirementId != null) {
			setEmissionTestRequirementId(emissionTestRequirementId);
		}

		Long controlRequirementId = (Long)attributes.get("controlRequirementId");

		if (controlRequirementId != null) {
			setControlRequirementId(controlRequirementId);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this vehiclerecord initial.
	*
	* @return the primary key of this vehiclerecord initial
	*/
	@Override
	public long getPrimaryKey() {
		return _vehiclerecordInitial.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehiclerecord initial.
	*
	* @param primaryKey the primary key of this vehiclerecord initial
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehiclerecordInitial.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehiclerecord initial.
	*
	* @return the ID of this vehiclerecord initial
	*/
	@Override
	public long getId() {
		return _vehiclerecordInitial.getId();
	}

	/**
	* Sets the ID of this vehiclerecord initial.
	*
	* @param id the ID of this vehiclerecord initial
	*/
	@Override
	public void setId(long id) {
		_vehiclerecordInitial.setId(id);
	}

	/**
	* Returns the vehicle group ID of this vehiclerecord initial.
	*
	* @return the vehicle group ID of this vehiclerecord initial
	*/
	@Override
	public long getVehicleGroupId() {
		return _vehiclerecordInitial.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this vehiclerecord initial.
	*
	* @param vehicleGroupId the vehicle group ID of this vehiclerecord initial
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehiclerecordInitial.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the sequence no of this vehiclerecord initial.
	*
	* @return the sequence no of this vehiclerecord initial
	*/
	@Override
	public long getSequenceNo() {
		return _vehiclerecordInitial.getSequenceNo();
	}

	/**
	* Sets the sequence no of this vehiclerecord initial.
	*
	* @param sequenceNo the sequence no of this vehiclerecord initial
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vehiclerecordInitial.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the code number of this vehiclerecord initial.
	*
	* @return the code number of this vehiclerecord initial
	*/
	@Override
	public long getCodeNumber() {
		return _vehiclerecordInitial.getCodeNumber();
	}

	/**
	* Sets the code number of this vehiclerecord initial.
	*
	* @param codeNumber the code number of this vehiclerecord initial
	*/
	@Override
	public void setCodeNumber(long codeNumber) {
		_vehiclerecordInitial.setCodeNumber(codeNumber);
	}

	/**
	* Returns the chassis number of this vehiclerecord initial.
	*
	* @return the chassis number of this vehiclerecord initial
	*/
	@Override
	public java.lang.String getChassisNumber() {
		return _vehiclerecordInitial.getChassisNumber();
	}

	/**
	* Sets the chassis number of this vehiclerecord initial.
	*
	* @param chassisNumber the chassis number of this vehiclerecord initial
	*/
	@Override
	public void setChassisNumber(java.lang.String chassisNumber) {
		_vehiclerecordInitial.setChassisNumber(chassisNumber);
	}

	/**
	* Returns the engine number of this vehiclerecord initial.
	*
	* @return the engine number of this vehiclerecord initial
	*/
	@Override
	public java.lang.String getEngineNumber() {
		return _vehiclerecordInitial.getEngineNumber();
	}

	/**
	* Sets the engine number of this vehiclerecord initial.
	*
	* @param engineNumber the engine number of this vehiclerecord initial
	*/
	@Override
	public void setEngineNumber(java.lang.String engineNumber) {
		_vehiclerecordInitial.setEngineNumber(engineNumber);
	}

	/**
	* Returns the production year of this vehiclerecord initial.
	*
	* @return the production year of this vehiclerecord initial
	*/
	@Override
	public java.lang.String getProductionYear() {
		return _vehiclerecordInitial.getProductionYear();
	}

	/**
	* Sets the production year of this vehiclerecord initial.
	*
	* @param productionYear the production year of this vehiclerecord initial
	*/
	@Override
	public void setProductionYear(java.lang.String productionYear) {
		_vehiclerecordInitial.setProductionYear(productionYear);
	}

	/**
	* Returns the vehicle engine status of this vehiclerecord initial.
	*
	* @return the vehicle engine status of this vehiclerecord initial
	*/
	@Override
	public java.lang.String getVehicleEngineStatus() {
		return _vehiclerecordInitial.getVehicleEngineStatus();
	}

	/**
	* Sets the vehicle engine status of this vehiclerecord initial.
	*
	* @param vehicleEngineStatus the vehicle engine status of this vehiclerecord initial
	*/
	@Override
	public void setVehicleEngineStatus(java.lang.String vehicleEngineStatus) {
		_vehiclerecordInitial.setVehicleEngineStatus(vehicleEngineStatus);
	}

	/**
	* Returns the vehicle color of this vehiclerecord initial.
	*
	* @return the vehicle color of this vehiclerecord initial
	*/
	@Override
	public java.lang.String getVehicleColor() {
		return _vehiclerecordInitial.getVehicleColor();
	}

	/**
	* Sets the vehicle color of this vehiclerecord initial.
	*
	* @param vehicleColor the vehicle color of this vehiclerecord initial
	*/
	@Override
	public void setVehicleColor(java.lang.String vehicleColor) {
		_vehiclerecordInitial.setVehicleColor(vehicleColor);
	}

	/**
	* Returns the unit price of this vehiclerecord initial.
	*
	* @return the unit price of this vehiclerecord initial
	*/
	@Override
	public double getUnitPrice() {
		return _vehiclerecordInitial.getUnitPrice();
	}

	/**
	* Sets the unit price of this vehiclerecord initial.
	*
	* @param unitPrice the unit price of this vehiclerecord initial
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_vehiclerecordInitial.setUnitPrice(unitPrice);
	}

	/**
	* Returns the currency of this vehiclerecord initial.
	*
	* @return the currency of this vehiclerecord initial
	*/
	@Override
	public java.lang.String getCurrency() {
		return _vehiclerecordInitial.getCurrency();
	}

	/**
	* Sets the currency of this vehiclerecord initial.
	*
	* @param currency the currency of this vehiclerecord initial
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_vehiclerecordInitial.setCurrency(currency);
	}

	/**
	* Returns the remarks of this vehiclerecord initial.
	*
	* @return the remarks of this vehiclerecord initial
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vehiclerecordInitial.getRemarks();
	}

	/**
	* Sets the remarks of this vehiclerecord initial.
	*
	* @param remarks the remarks of this vehiclerecord initial
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vehiclerecordInitial.setRemarks(remarks);
	}

	/**
	* Returns the confirmed inspection ID of this vehiclerecord initial.
	*
	* @return the confirmed inspection ID of this vehiclerecord initial
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _vehiclerecordInitial.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this vehiclerecord initial.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this vehiclerecord initial
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_vehiclerecordInitial.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the inspection record ID of this vehiclerecord initial.
	*
	* @return the inspection record ID of this vehiclerecord initial
	*/
	@Override
	public long getInspectionRecordId() {
		return _vehiclerecordInitial.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this vehiclerecord initial.
	*
	* @param inspectionRecordId the inspection record ID of this vehiclerecord initial
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_vehiclerecordInitial.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the draft certificate ID of this vehiclerecord initial.
	*
	* @return the draft certificate ID of this vehiclerecord initial
	*/
	@Override
	public long getDraftCertificateId() {
		return _vehiclerecordInitial.getDraftCertificateId();
	}

	/**
	* Sets the draft certificate ID of this vehiclerecord initial.
	*
	* @param draftCertificateId the draft certificate ID of this vehiclerecord initial
	*/
	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_vehiclerecordInitial.setDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns the certificate record ID of this vehiclerecord initial.
	*
	* @return the certificate record ID of this vehiclerecord initial
	*/
	@Override
	public long getCertificateRecordId() {
		return _vehiclerecordInitial.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this vehiclerecord initial.
	*
	* @param certificateRecordId the certificate record ID of this vehiclerecord initial
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_vehiclerecordInitial.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the mark up status of this vehiclerecord initial.
	*
	* @return the mark up status of this vehiclerecord initial
	*/
	@Override
	public long getMarkUpStatus() {
		return _vehiclerecordInitial.getMarkUpStatus();
	}

	/**
	* Sets the mark up status of this vehiclerecord initial.
	*
	* @param markUpStatus the mark up status of this vehiclerecord initial
	*/
	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_vehiclerecordInitial.setMarkUpStatus(markUpStatus);
	}

	/**
	* Returns the safe test requirement ID of this vehiclerecord initial.
	*
	* @return the safe test requirement ID of this vehiclerecord initial
	*/
	@Override
	public long getSafeTestRequirementId() {
		return _vehiclerecordInitial.getSafeTestRequirementId();
	}

	/**
	* Sets the safe test requirement ID of this vehiclerecord initial.
	*
	* @param safeTestRequirementId the safe test requirement ID of this vehiclerecord initial
	*/
	@Override
	public void setSafeTestRequirementId(long safeTestRequirementId) {
		_vehiclerecordInitial.setSafeTestRequirementId(safeTestRequirementId);
	}

	/**
	* Returns the emission test requirement ID of this vehiclerecord initial.
	*
	* @return the emission test requirement ID of this vehiclerecord initial
	*/
	@Override
	public long getEmissionTestRequirementId() {
		return _vehiclerecordInitial.getEmissionTestRequirementId();
	}

	/**
	* Sets the emission test requirement ID of this vehiclerecord initial.
	*
	* @param emissionTestRequirementId the emission test requirement ID of this vehiclerecord initial
	*/
	@Override
	public void setEmissionTestRequirementId(long emissionTestRequirementId) {
		_vehiclerecordInitial.setEmissionTestRequirementId(emissionTestRequirementId);
	}

	/**
	* Returns the control requirement ID of this vehiclerecord initial.
	*
	* @return the control requirement ID of this vehiclerecord initial
	*/
	@Override
	public long getControlRequirementId() {
		return _vehiclerecordInitial.getControlRequirementId();
	}

	/**
	* Sets the control requirement ID of this vehiclerecord initial.
	*
	* @param controlRequirementId the control requirement ID of this vehiclerecord initial
	*/
	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_vehiclerecordInitial.setControlRequirementId(controlRequirementId);
	}

	/**
	* Returns the synchdate of this vehiclerecord initial.
	*
	* @return the synchdate of this vehiclerecord initial
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _vehiclerecordInitial.getSynchdate();
	}

	/**
	* Sets the synchdate of this vehiclerecord initial.
	*
	* @param synchdate the synchdate of this vehiclerecord initial
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_vehiclerecordInitial.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _vehiclerecordInitial.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehiclerecordInitial.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehiclerecordInitial.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehiclerecordInitial.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehiclerecordInitial.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehiclerecordInitial.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehiclerecordInitial.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehiclerecordInitial.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehiclerecordInitial.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehiclerecordInitial.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehiclerecordInitial.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehiclerecordInitialWrapper((VehiclerecordInitial)_vehiclerecordInitial.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial) {
		return _vehiclerecordInitial.compareTo(vehiclerecordInitial);
	}

	@Override
	public int hashCode() {
		return _vehiclerecordInitial.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> toCacheModel() {
		return _vehiclerecordInitial.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial toEscapedModel() {
		return new VehiclerecordInitialWrapper(_vehiclerecordInitial.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial toUnescapedModel() {
		return new VehiclerecordInitialWrapper(_vehiclerecordInitial.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehiclerecordInitial.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehiclerecordInitial.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehiclerecordInitial.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehiclerecordInitialWrapper)) {
			return false;
		}

		VehiclerecordInitialWrapper vehiclerecordInitialWrapper = (VehiclerecordInitialWrapper)obj;

		if (Validator.equals(_vehiclerecordInitial,
					vehiclerecordInitialWrapper._vehiclerecordInitial)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehiclerecordInitial getWrappedVehiclerecordInitial() {
		return _vehiclerecordInitial;
	}

	@Override
	public VehiclerecordInitial getWrappedModel() {
		return _vehiclerecordInitial;
	}

	@Override
	public void resetOriginalValues() {
		_vehiclerecordInitial.resetOriginalValues();
	}

	private VehiclerecordInitial _vehiclerecordInitial;
}