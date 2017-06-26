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
 * This class is a wrapper for {@link VehicleRecord}.
 * </p>
 *
 * @author huymq
 * @see VehicleRecord
 * @generated
 */
public class VehicleRecordWrapper implements VehicleRecord,
	ModelWrapper<VehicleRecord> {
	public VehicleRecordWrapper(VehicleRecord vehicleRecord) {
		_vehicleRecord = vehicleRecord;
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleRecord.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleRecord.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("debitNoteId", getDebitNoteId());
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
		attributes.put("markAsSample", getMarkAsSample());
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

		Long debitNoteId = (Long)attributes.get("debitNoteId");

		if (debitNoteId != null) {
			setDebitNoteId(debitNoteId);
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

		Integer markAsSample = (Integer)attributes.get("markAsSample");

		if (markAsSample != null) {
			setMarkAsSample(markAsSample);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this vehicle record.
	*
	* @return the primary key of this vehicle record
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicleRecord.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle record.
	*
	* @param primaryKey the primary key of this vehicle record
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicleRecord.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehicle record.
	*
	* @return the ID of this vehicle record
	*/
	@Override
	public long getId() {
		return _vehicleRecord.getId();
	}

	/**
	* Sets the ID of this vehicle record.
	*
	* @param id the ID of this vehicle record
	*/
	@Override
	public void setId(long id) {
		_vehicleRecord.setId(id);
	}

	/**
	* Returns the vehicle group ID of this vehicle record.
	*
	* @return the vehicle group ID of this vehicle record
	*/
	@Override
	public long getVehicleGroupId() {
		return _vehicleRecord.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this vehicle record.
	*
	* @param vehicleGroupId the vehicle group ID of this vehicle record
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleRecord.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the debit note ID of this vehicle record.
	*
	* @return the debit note ID of this vehicle record
	*/
	@Override
	public long getDebitNoteId() {
		return _vehicleRecord.getDebitNoteId();
	}

	/**
	* Sets the debit note ID of this vehicle record.
	*
	* @param debitNoteId the debit note ID of this vehicle record
	*/
	@Override
	public void setDebitNoteId(long debitNoteId) {
		_vehicleRecord.setDebitNoteId(debitNoteId);
	}

	/**
	* Returns the sequence no of this vehicle record.
	*
	* @return the sequence no of this vehicle record
	*/
	@Override
	public long getSequenceNo() {
		return _vehicleRecord.getSequenceNo();
	}

	/**
	* Sets the sequence no of this vehicle record.
	*
	* @param sequenceNo the sequence no of this vehicle record
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vehicleRecord.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the code number of this vehicle record.
	*
	* @return the code number of this vehicle record
	*/
	@Override
	public long getCodeNumber() {
		return _vehicleRecord.getCodeNumber();
	}

	/**
	* Sets the code number of this vehicle record.
	*
	* @param codeNumber the code number of this vehicle record
	*/
	@Override
	public void setCodeNumber(long codeNumber) {
		_vehicleRecord.setCodeNumber(codeNumber);
	}

	/**
	* Returns the chassis number of this vehicle record.
	*
	* @return the chassis number of this vehicle record
	*/
	@Override
	public java.lang.String getChassisNumber() {
		return _vehicleRecord.getChassisNumber();
	}

	/**
	* Sets the chassis number of this vehicle record.
	*
	* @param chassisNumber the chassis number of this vehicle record
	*/
	@Override
	public void setChassisNumber(java.lang.String chassisNumber) {
		_vehicleRecord.setChassisNumber(chassisNumber);
	}

	/**
	* Returns the engine number of this vehicle record.
	*
	* @return the engine number of this vehicle record
	*/
	@Override
	public java.lang.String getEngineNumber() {
		return _vehicleRecord.getEngineNumber();
	}

	/**
	* Sets the engine number of this vehicle record.
	*
	* @param engineNumber the engine number of this vehicle record
	*/
	@Override
	public void setEngineNumber(java.lang.String engineNumber) {
		_vehicleRecord.setEngineNumber(engineNumber);
	}

	/**
	* Returns the production year of this vehicle record.
	*
	* @return the production year of this vehicle record
	*/
	@Override
	public java.lang.String getProductionYear() {
		return _vehicleRecord.getProductionYear();
	}

	/**
	* Sets the production year of this vehicle record.
	*
	* @param productionYear the production year of this vehicle record
	*/
	@Override
	public void setProductionYear(java.lang.String productionYear) {
		_vehicleRecord.setProductionYear(productionYear);
	}

	/**
	* Returns the vehicle engine status of this vehicle record.
	*
	* @return the vehicle engine status of this vehicle record
	*/
	@Override
	public java.lang.String getVehicleEngineStatus() {
		return _vehicleRecord.getVehicleEngineStatus();
	}

	/**
	* Sets the vehicle engine status of this vehicle record.
	*
	* @param vehicleEngineStatus the vehicle engine status of this vehicle record
	*/
	@Override
	public void setVehicleEngineStatus(java.lang.String vehicleEngineStatus) {
		_vehicleRecord.setVehicleEngineStatus(vehicleEngineStatus);
	}

	/**
	* Returns the vehicle color of this vehicle record.
	*
	* @return the vehicle color of this vehicle record
	*/
	@Override
	public java.lang.String getVehicleColor() {
		return _vehicleRecord.getVehicleColor();
	}

	/**
	* Sets the vehicle color of this vehicle record.
	*
	* @param vehicleColor the vehicle color of this vehicle record
	*/
	@Override
	public void setVehicleColor(java.lang.String vehicleColor) {
		_vehicleRecord.setVehicleColor(vehicleColor);
	}

	/**
	* Returns the unit price of this vehicle record.
	*
	* @return the unit price of this vehicle record
	*/
	@Override
	public double getUnitPrice() {
		return _vehicleRecord.getUnitPrice();
	}

	/**
	* Sets the unit price of this vehicle record.
	*
	* @param unitPrice the unit price of this vehicle record
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_vehicleRecord.setUnitPrice(unitPrice);
	}

	/**
	* Returns the currency of this vehicle record.
	*
	* @return the currency of this vehicle record
	*/
	@Override
	public java.lang.String getCurrency() {
		return _vehicleRecord.getCurrency();
	}

	/**
	* Sets the currency of this vehicle record.
	*
	* @param currency the currency of this vehicle record
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_vehicleRecord.setCurrency(currency);
	}

	/**
	* Returns the remarks of this vehicle record.
	*
	* @return the remarks of this vehicle record
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vehicleRecord.getRemarks();
	}

	/**
	* Sets the remarks of this vehicle record.
	*
	* @param remarks the remarks of this vehicle record
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vehicleRecord.setRemarks(remarks);
	}

	/**
	* Returns the confirmed inspection ID of this vehicle record.
	*
	* @return the confirmed inspection ID of this vehicle record
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _vehicleRecord.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this vehicle record.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this vehicle record
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_vehicleRecord.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the inspection record ID of this vehicle record.
	*
	* @return the inspection record ID of this vehicle record
	*/
	@Override
	public long getInspectionRecordId() {
		return _vehicleRecord.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this vehicle record.
	*
	* @param inspectionRecordId the inspection record ID of this vehicle record
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_vehicleRecord.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the draft certificate ID of this vehicle record.
	*
	* @return the draft certificate ID of this vehicle record
	*/
	@Override
	public long getDraftCertificateId() {
		return _vehicleRecord.getDraftCertificateId();
	}

	/**
	* Sets the draft certificate ID of this vehicle record.
	*
	* @param draftCertificateId the draft certificate ID of this vehicle record
	*/
	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_vehicleRecord.setDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns the certificate record ID of this vehicle record.
	*
	* @return the certificate record ID of this vehicle record
	*/
	@Override
	public long getCertificateRecordId() {
		return _vehicleRecord.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this vehicle record.
	*
	* @param certificateRecordId the certificate record ID of this vehicle record
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_vehicleRecord.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the mark up status of this vehicle record.
	*
	* @return the mark up status of this vehicle record
	*/
	@Override
	public long getMarkUpStatus() {
		return _vehicleRecord.getMarkUpStatus();
	}

	/**
	* Sets the mark up status of this vehicle record.
	*
	* @param markUpStatus the mark up status of this vehicle record
	*/
	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_vehicleRecord.setMarkUpStatus(markUpStatus);
	}

	/**
	* Returns the safe test requirement ID of this vehicle record.
	*
	* @return the safe test requirement ID of this vehicle record
	*/
	@Override
	public long getSafeTestRequirementId() {
		return _vehicleRecord.getSafeTestRequirementId();
	}

	/**
	* Sets the safe test requirement ID of this vehicle record.
	*
	* @param safeTestRequirementId the safe test requirement ID of this vehicle record
	*/
	@Override
	public void setSafeTestRequirementId(long safeTestRequirementId) {
		_vehicleRecord.setSafeTestRequirementId(safeTestRequirementId);
	}

	/**
	* Returns the emission test requirement ID of this vehicle record.
	*
	* @return the emission test requirement ID of this vehicle record
	*/
	@Override
	public long getEmissionTestRequirementId() {
		return _vehicleRecord.getEmissionTestRequirementId();
	}

	/**
	* Sets the emission test requirement ID of this vehicle record.
	*
	* @param emissionTestRequirementId the emission test requirement ID of this vehicle record
	*/
	@Override
	public void setEmissionTestRequirementId(long emissionTestRequirementId) {
		_vehicleRecord.setEmissionTestRequirementId(emissionTestRequirementId);
	}

	/**
	* Returns the control requirement ID of this vehicle record.
	*
	* @return the control requirement ID of this vehicle record
	*/
	@Override
	public long getControlRequirementId() {
		return _vehicleRecord.getControlRequirementId();
	}

	/**
	* Sets the control requirement ID of this vehicle record.
	*
	* @param controlRequirementId the control requirement ID of this vehicle record
	*/
	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_vehicleRecord.setControlRequirementId(controlRequirementId);
	}

	/**
	* Returns the mark as sample of this vehicle record.
	*
	* @return the mark as sample of this vehicle record
	*/
	@Override
	public int getMarkAsSample() {
		return _vehicleRecord.getMarkAsSample();
	}

	/**
	* Sets the mark as sample of this vehicle record.
	*
	* @param markAsSample the mark as sample of this vehicle record
	*/
	@Override
	public void setMarkAsSample(int markAsSample) {
		_vehicleRecord.setMarkAsSample(markAsSample);
	}

	/**
	* Returns the synchdate of this vehicle record.
	*
	* @return the synchdate of this vehicle record
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _vehicleRecord.getSynchdate();
	}

	/**
	* Sets the synchdate of this vehicle record.
	*
	* @param synchdate the synchdate of this vehicle record
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_vehicleRecord.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _vehicleRecord.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicleRecord.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicleRecord.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicleRecord.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicleRecord.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicleRecord.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicleRecord.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicleRecord.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicleRecord.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicleRecord.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicleRecord.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleRecordWrapper((VehicleRecord)_vehicleRecord.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord) {
		return _vehicleRecord.compareTo(vehicleRecord);
	}

	@Override
	public int hashCode() {
		return _vehicleRecord.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> toCacheModel() {
		return _vehicleRecord.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord toEscapedModel() {
		return new VehicleRecordWrapper(_vehicleRecord.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord toUnescapedModel() {
		return new VehicleRecordWrapper(_vehicleRecord.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicleRecord.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicleRecord.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicleRecord.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleRecordWrapper)) {
			return false;
		}

		VehicleRecordWrapper vehicleRecordWrapper = (VehicleRecordWrapper)obj;

		if (Validator.equals(_vehicleRecord, vehicleRecordWrapper._vehicleRecord)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehicleRecord getWrappedVehicleRecord() {
		return _vehicleRecord;
	}

	@Override
	public VehicleRecord getWrappedModel() {
		return _vehicleRecord;
	}

	@Override
	public void resetOriginalValues() {
		_vehicleRecord.resetOriginalValues();
	}

	private VehicleRecord _vehicleRecord;
}