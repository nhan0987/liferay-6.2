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
 * This class is a wrapper for {@link ViewTrungSoKhungDongCo}.
 * </p>
 *
 * @author win_64
 * @see ViewTrungSoKhungDongCo
 * @generated
 */
public class ViewTrungSoKhungDongCoWrapper implements ViewTrungSoKhungDongCo,
	ModelWrapper<ViewTrungSoKhungDongCo> {
	public ViewTrungSoKhungDongCoWrapper(
		ViewTrungSoKhungDongCo viewTrungSoKhungDongCo) {
		_viewTrungSoKhungDongCo = viewTrungSoKhungDongCo;
	}

	@Override
	public Class<?> getModelClass() {
		return ViewTrungSoKhungDongCo.class;
	}

	@Override
	public String getModelClassName() {
		return ViewTrungSoKhungDongCo.class.getName();
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
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("contactName", getContactName());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("importerName", getImporterName());

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

		Long productionYear = (Long)attributes.get("productionYear");

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

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String importerName = (String)attributes.get("importerName");

		if (importerName != null) {
			setImporterName(importerName);
		}
	}

	/**
	* Returns the primary key of this view trung so khung dong co.
	*
	* @return the primary key of this view trung so khung dong co
	*/
	@Override
	public long getPrimaryKey() {
		return _viewTrungSoKhungDongCo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this view trung so khung dong co.
	*
	* @param primaryKey the primary key of this view trung so khung dong co
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_viewTrungSoKhungDongCo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this view trung so khung dong co.
	*
	* @return the ID of this view trung so khung dong co
	*/
	@Override
	public long getId() {
		return _viewTrungSoKhungDongCo.getId();
	}

	/**
	* Sets the ID of this view trung so khung dong co.
	*
	* @param id the ID of this view trung so khung dong co
	*/
	@Override
	public void setId(long id) {
		_viewTrungSoKhungDongCo.setId(id);
	}

	/**
	* Returns the vehicle group ID of this view trung so khung dong co.
	*
	* @return the vehicle group ID of this view trung so khung dong co
	*/
	@Override
	public long getVehicleGroupId() {
		return _viewTrungSoKhungDongCo.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this view trung so khung dong co.
	*
	* @param vehicleGroupId the vehicle group ID of this view trung so khung dong co
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_viewTrungSoKhungDongCo.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the debit note ID of this view trung so khung dong co.
	*
	* @return the debit note ID of this view trung so khung dong co
	*/
	@Override
	public long getDebitNoteId() {
		return _viewTrungSoKhungDongCo.getDebitNoteId();
	}

	/**
	* Sets the debit note ID of this view trung so khung dong co.
	*
	* @param debitNoteId the debit note ID of this view trung so khung dong co
	*/
	@Override
	public void setDebitNoteId(long debitNoteId) {
		_viewTrungSoKhungDongCo.setDebitNoteId(debitNoteId);
	}

	/**
	* Returns the sequence no of this view trung so khung dong co.
	*
	* @return the sequence no of this view trung so khung dong co
	*/
	@Override
	public long getSequenceNo() {
		return _viewTrungSoKhungDongCo.getSequenceNo();
	}

	/**
	* Sets the sequence no of this view trung so khung dong co.
	*
	* @param sequenceNo the sequence no of this view trung so khung dong co
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_viewTrungSoKhungDongCo.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the code number of this view trung so khung dong co.
	*
	* @return the code number of this view trung so khung dong co
	*/
	@Override
	public long getCodeNumber() {
		return _viewTrungSoKhungDongCo.getCodeNumber();
	}

	/**
	* Sets the code number of this view trung so khung dong co.
	*
	* @param codeNumber the code number of this view trung so khung dong co
	*/
	@Override
	public void setCodeNumber(long codeNumber) {
		_viewTrungSoKhungDongCo.setCodeNumber(codeNumber);
	}

	/**
	* Returns the chassis number of this view trung so khung dong co.
	*
	* @return the chassis number of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getChassisNumber() {
		return _viewTrungSoKhungDongCo.getChassisNumber();
	}

	/**
	* Sets the chassis number of this view trung so khung dong co.
	*
	* @param chassisNumber the chassis number of this view trung so khung dong co
	*/
	@Override
	public void setChassisNumber(java.lang.String chassisNumber) {
		_viewTrungSoKhungDongCo.setChassisNumber(chassisNumber);
	}

	/**
	* Returns the engine number of this view trung so khung dong co.
	*
	* @return the engine number of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getEngineNumber() {
		return _viewTrungSoKhungDongCo.getEngineNumber();
	}

	/**
	* Sets the engine number of this view trung so khung dong co.
	*
	* @param engineNumber the engine number of this view trung so khung dong co
	*/
	@Override
	public void setEngineNumber(java.lang.String engineNumber) {
		_viewTrungSoKhungDongCo.setEngineNumber(engineNumber);
	}

	/**
	* Returns the production year of this view trung so khung dong co.
	*
	* @return the production year of this view trung so khung dong co
	*/
	@Override
	public long getProductionYear() {
		return _viewTrungSoKhungDongCo.getProductionYear();
	}

	/**
	* Sets the production year of this view trung so khung dong co.
	*
	* @param productionYear the production year of this view trung so khung dong co
	*/
	@Override
	public void setProductionYear(long productionYear) {
		_viewTrungSoKhungDongCo.setProductionYear(productionYear);
	}

	/**
	* Returns the vehicle engine status of this view trung so khung dong co.
	*
	* @return the vehicle engine status of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getVehicleEngineStatus() {
		return _viewTrungSoKhungDongCo.getVehicleEngineStatus();
	}

	/**
	* Sets the vehicle engine status of this view trung so khung dong co.
	*
	* @param vehicleEngineStatus the vehicle engine status of this view trung so khung dong co
	*/
	@Override
	public void setVehicleEngineStatus(java.lang.String vehicleEngineStatus) {
		_viewTrungSoKhungDongCo.setVehicleEngineStatus(vehicleEngineStatus);
	}

	/**
	* Returns the vehicle color of this view trung so khung dong co.
	*
	* @return the vehicle color of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getVehicleColor() {
		return _viewTrungSoKhungDongCo.getVehicleColor();
	}

	/**
	* Sets the vehicle color of this view trung so khung dong co.
	*
	* @param vehicleColor the vehicle color of this view trung so khung dong co
	*/
	@Override
	public void setVehicleColor(java.lang.String vehicleColor) {
		_viewTrungSoKhungDongCo.setVehicleColor(vehicleColor);
	}

	/**
	* Returns the unit price of this view trung so khung dong co.
	*
	* @return the unit price of this view trung so khung dong co
	*/
	@Override
	public double getUnitPrice() {
		return _viewTrungSoKhungDongCo.getUnitPrice();
	}

	/**
	* Sets the unit price of this view trung so khung dong co.
	*
	* @param unitPrice the unit price of this view trung so khung dong co
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_viewTrungSoKhungDongCo.setUnitPrice(unitPrice);
	}

	/**
	* Returns the currency of this view trung so khung dong co.
	*
	* @return the currency of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getCurrency() {
		return _viewTrungSoKhungDongCo.getCurrency();
	}

	/**
	* Sets the currency of this view trung so khung dong co.
	*
	* @param currency the currency of this view trung so khung dong co
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_viewTrungSoKhungDongCo.setCurrency(currency);
	}

	/**
	* Returns the remarks of this view trung so khung dong co.
	*
	* @return the remarks of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getRemarks() {
		return _viewTrungSoKhungDongCo.getRemarks();
	}

	/**
	* Sets the remarks of this view trung so khung dong co.
	*
	* @param remarks the remarks of this view trung so khung dong co
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_viewTrungSoKhungDongCo.setRemarks(remarks);
	}

	/**
	* Returns the confirmed inspection ID of this view trung so khung dong co.
	*
	* @return the confirmed inspection ID of this view trung so khung dong co
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _viewTrungSoKhungDongCo.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this view trung so khung dong co.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this view trung so khung dong co
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_viewTrungSoKhungDongCo.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the inspection record ID of this view trung so khung dong co.
	*
	* @return the inspection record ID of this view trung so khung dong co
	*/
	@Override
	public long getInspectionRecordId() {
		return _viewTrungSoKhungDongCo.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this view trung so khung dong co.
	*
	* @param inspectionRecordId the inspection record ID of this view trung so khung dong co
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_viewTrungSoKhungDongCo.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the draft certificate ID of this view trung so khung dong co.
	*
	* @return the draft certificate ID of this view trung so khung dong co
	*/
	@Override
	public long getDraftCertificateId() {
		return _viewTrungSoKhungDongCo.getDraftCertificateId();
	}

	/**
	* Sets the draft certificate ID of this view trung so khung dong co.
	*
	* @param draftCertificateId the draft certificate ID of this view trung so khung dong co
	*/
	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_viewTrungSoKhungDongCo.setDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns the certificate record ID of this view trung so khung dong co.
	*
	* @return the certificate record ID of this view trung so khung dong co
	*/
	@Override
	public long getCertificateRecordId() {
		return _viewTrungSoKhungDongCo.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this view trung so khung dong co.
	*
	* @param certificateRecordId the certificate record ID of this view trung so khung dong co
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_viewTrungSoKhungDongCo.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the mark up status of this view trung so khung dong co.
	*
	* @return the mark up status of this view trung so khung dong co
	*/
	@Override
	public long getMarkUpStatus() {
		return _viewTrungSoKhungDongCo.getMarkUpStatus();
	}

	/**
	* Sets the mark up status of this view trung so khung dong co.
	*
	* @param markUpStatus the mark up status of this view trung so khung dong co
	*/
	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_viewTrungSoKhungDongCo.setMarkUpStatus(markUpStatus);
	}

	/**
	* Returns the safe test requirement ID of this view trung so khung dong co.
	*
	* @return the safe test requirement ID of this view trung so khung dong co
	*/
	@Override
	public long getSafeTestRequirementId() {
		return _viewTrungSoKhungDongCo.getSafeTestRequirementId();
	}

	/**
	* Sets the safe test requirement ID of this view trung so khung dong co.
	*
	* @param safeTestRequirementId the safe test requirement ID of this view trung so khung dong co
	*/
	@Override
	public void setSafeTestRequirementId(long safeTestRequirementId) {
		_viewTrungSoKhungDongCo.setSafeTestRequirementId(safeTestRequirementId);
	}

	/**
	* Returns the emission test requirement ID of this view trung so khung dong co.
	*
	* @return the emission test requirement ID of this view trung so khung dong co
	*/
	@Override
	public long getEmissionTestRequirementId() {
		return _viewTrungSoKhungDongCo.getEmissionTestRequirementId();
	}

	/**
	* Sets the emission test requirement ID of this view trung so khung dong co.
	*
	* @param emissionTestRequirementId the emission test requirement ID of this view trung so khung dong co
	*/
	@Override
	public void setEmissionTestRequirementId(long emissionTestRequirementId) {
		_viewTrungSoKhungDongCo.setEmissionTestRequirementId(emissionTestRequirementId);
	}

	/**
	* Returns the control requirement ID of this view trung so khung dong co.
	*
	* @return the control requirement ID of this view trung so khung dong co
	*/
	@Override
	public long getControlRequirementId() {
		return _viewTrungSoKhungDongCo.getControlRequirementId();
	}

	/**
	* Sets the control requirement ID of this view trung so khung dong co.
	*
	* @param controlRequirementId the control requirement ID of this view trung so khung dong co
	*/
	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_viewTrungSoKhungDongCo.setControlRequirementId(controlRequirementId);
	}

	/**
	* Returns the mark as sample of this view trung so khung dong co.
	*
	* @return the mark as sample of this view trung so khung dong co
	*/
	@Override
	public int getMarkAsSample() {
		return _viewTrungSoKhungDongCo.getMarkAsSample();
	}

	/**
	* Sets the mark as sample of this view trung so khung dong co.
	*
	* @param markAsSample the mark as sample of this view trung so khung dong co
	*/
	@Override
	public void setMarkAsSample(int markAsSample) {
		_viewTrungSoKhungDongCo.setMarkAsSample(markAsSample);
	}

	/**
	* Returns the registered number of this view trung so khung dong co.
	*
	* @return the registered number of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getRegisteredNumber() {
		return _viewTrungSoKhungDongCo.getRegisteredNumber();
	}

	/**
	* Sets the registered number of this view trung so khung dong co.
	*
	* @param registeredNumber the registered number of this view trung so khung dong co
	*/
	@Override
	public void setRegisteredNumber(java.lang.String registeredNumber) {
		_viewTrungSoKhungDongCo.setRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the contact name of this view trung so khung dong co.
	*
	* @return the contact name of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getContactName() {
		return _viewTrungSoKhungDongCo.getContactName();
	}

	/**
	* Sets the contact name of this view trung so khung dong co.
	*
	* @param contactName the contact name of this view trung so khung dong co
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_viewTrungSoKhungDongCo.setContactName(contactName);
	}

	/**
	* Returns the contact phone of this view trung so khung dong co.
	*
	* @return the contact phone of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getContactPhone() {
		return _viewTrungSoKhungDongCo.getContactPhone();
	}

	/**
	* Sets the contact phone of this view trung so khung dong co.
	*
	* @param contactPhone the contact phone of this view trung so khung dong co
	*/
	@Override
	public void setContactPhone(java.lang.String contactPhone) {
		_viewTrungSoKhungDongCo.setContactPhone(contactPhone);
	}

	/**
	* Returns the inspection date of this view trung so khung dong co.
	*
	* @return the inspection date of this view trung so khung dong co
	*/
	@Override
	public java.util.Date getInspectionDate() {
		return _viewTrungSoKhungDongCo.getInspectionDate();
	}

	/**
	* Sets the inspection date of this view trung so khung dong co.
	*
	* @param inspectionDate the inspection date of this view trung so khung dong co
	*/
	@Override
	public void setInspectionDate(java.util.Date inspectionDate) {
		_viewTrungSoKhungDongCo.setInspectionDate(inspectionDate);
	}

	/**
	* Returns the importer name of this view trung so khung dong co.
	*
	* @return the importer name of this view trung so khung dong co
	*/
	@Override
	public java.lang.String getImporterName() {
		return _viewTrungSoKhungDongCo.getImporterName();
	}

	/**
	* Sets the importer name of this view trung so khung dong co.
	*
	* @param importerName the importer name of this view trung so khung dong co
	*/
	@Override
	public void setImporterName(java.lang.String importerName) {
		_viewTrungSoKhungDongCo.setImporterName(importerName);
	}

	@Override
	public boolean isNew() {
		return _viewTrungSoKhungDongCo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_viewTrungSoKhungDongCo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _viewTrungSoKhungDongCo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_viewTrungSoKhungDongCo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _viewTrungSoKhungDongCo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _viewTrungSoKhungDongCo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_viewTrungSoKhungDongCo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _viewTrungSoKhungDongCo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_viewTrungSoKhungDongCo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_viewTrungSoKhungDongCo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_viewTrungSoKhungDongCo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ViewTrungSoKhungDongCoWrapper((ViewTrungSoKhungDongCo)_viewTrungSoKhungDongCo.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo viewTrungSoKhungDongCo) {
		return _viewTrungSoKhungDongCo.compareTo(viewTrungSoKhungDongCo);
	}

	@Override
	public int hashCode() {
		return _viewTrungSoKhungDongCo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo> toCacheModel() {
		return _viewTrungSoKhungDongCo.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo toEscapedModel() {
		return new ViewTrungSoKhungDongCoWrapper(_viewTrungSoKhungDongCo.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo toUnescapedModel() {
		return new ViewTrungSoKhungDongCoWrapper(_viewTrungSoKhungDongCo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _viewTrungSoKhungDongCo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _viewTrungSoKhungDongCo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_viewTrungSoKhungDongCo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ViewTrungSoKhungDongCoWrapper)) {
			return false;
		}

		ViewTrungSoKhungDongCoWrapper viewTrungSoKhungDongCoWrapper = (ViewTrungSoKhungDongCoWrapper)obj;

		if (Validator.equals(_viewTrungSoKhungDongCo,
					viewTrungSoKhungDongCoWrapper._viewTrungSoKhungDongCo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ViewTrungSoKhungDongCo getWrappedViewTrungSoKhungDongCo() {
		return _viewTrungSoKhungDongCo;
	}

	@Override
	public ViewTrungSoKhungDongCo getWrappedModel() {
		return _viewTrungSoKhungDongCo;
	}

	@Override
	public void resetOriginalValues() {
		_viewTrungSoKhungDongCo.resetOriginalValues();
	}

	private ViewTrungSoKhungDongCo _viewTrungSoKhungDongCo;
}