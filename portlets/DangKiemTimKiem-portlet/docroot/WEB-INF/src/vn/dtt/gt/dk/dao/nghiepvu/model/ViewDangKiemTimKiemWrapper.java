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
 * This class is a wrapper for {@link ViewDangKiemTimKiem}.
 * </p>
 *
 * @author win_64
 * @see ViewDangKiemTimKiem
 * @generated
 */
public class ViewDangKiemTimKiemWrapper implements ViewDangKiemTimKiem,
	ModelWrapper<ViewDangKiemTimKiem> {
	public ViewDangKiemTimKiemWrapper(ViewDangKiemTimKiem viewDangKiemTimKiem) {
		_viewDangKiemTimKiem = viewDangKiemTimKiem;
	}

	@Override
	public Class<?> getModelClass() {
		return ViewDangKiemTimKiem.class;
	}

	@Override
	public String getModelClassName() {
		return ViewDangKiemTimKiem.class.getName();
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
		attributes.put("inspectionrecordno", getInspectionrecordno());
		attributes.put("inspectionRecordDate", getInspectionRecordDate());
		attributes.put("attachedFileBbkt", getAttachedFileBbkt());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("signDate", getSignDate());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("inspectorSignDate", getInspectorSignDate());
		attributes.put("vehicleClass", getVehicleClass());

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

		String inspectionrecordno = (String)attributes.get("inspectionrecordno");

		if (inspectionrecordno != null) {
			setInspectionrecordno(inspectionrecordno);
		}

		Date inspectionRecordDate = (Date)attributes.get("inspectionRecordDate");

		if (inspectionRecordDate != null) {
			setInspectionRecordDate(inspectionRecordDate);
		}

		Long attachedFileBbkt = (Long)attributes.get("attachedFileBbkt");

		if (attachedFileBbkt != null) {
			setAttachedFileBbkt(attachedFileBbkt);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		Date inspectorSignDate = (Date)attributes.get("inspectorSignDate");

		if (inspectorSignDate != null) {
			setInspectorSignDate(inspectorSignDate);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}
	}

	/**
	* Returns the primary key of this view dang kiem tim kiem.
	*
	* @return the primary key of this view dang kiem tim kiem
	*/
	@Override
	public long getPrimaryKey() {
		return _viewDangKiemTimKiem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this view dang kiem tim kiem.
	*
	* @param primaryKey the primary key of this view dang kiem tim kiem
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_viewDangKiemTimKiem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this view dang kiem tim kiem.
	*
	* @return the ID of this view dang kiem tim kiem
	*/
	@Override
	public long getId() {
		return _viewDangKiemTimKiem.getId();
	}

	/**
	* Sets the ID of this view dang kiem tim kiem.
	*
	* @param id the ID of this view dang kiem tim kiem
	*/
	@Override
	public void setId(long id) {
		_viewDangKiemTimKiem.setId(id);
	}

	/**
	* Returns the vehicle group ID of this view dang kiem tim kiem.
	*
	* @return the vehicle group ID of this view dang kiem tim kiem
	*/
	@Override
	public long getVehicleGroupId() {
		return _viewDangKiemTimKiem.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this view dang kiem tim kiem.
	*
	* @param vehicleGroupId the vehicle group ID of this view dang kiem tim kiem
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_viewDangKiemTimKiem.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the debit note ID of this view dang kiem tim kiem.
	*
	* @return the debit note ID of this view dang kiem tim kiem
	*/
	@Override
	public long getDebitNoteId() {
		return _viewDangKiemTimKiem.getDebitNoteId();
	}

	/**
	* Sets the debit note ID of this view dang kiem tim kiem.
	*
	* @param debitNoteId the debit note ID of this view dang kiem tim kiem
	*/
	@Override
	public void setDebitNoteId(long debitNoteId) {
		_viewDangKiemTimKiem.setDebitNoteId(debitNoteId);
	}

	/**
	* Returns the sequence no of this view dang kiem tim kiem.
	*
	* @return the sequence no of this view dang kiem tim kiem
	*/
	@Override
	public long getSequenceNo() {
		return _viewDangKiemTimKiem.getSequenceNo();
	}

	/**
	* Sets the sequence no of this view dang kiem tim kiem.
	*
	* @param sequenceNo the sequence no of this view dang kiem tim kiem
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_viewDangKiemTimKiem.setSequenceNo(sequenceNo);
	}

	/**
	* Returns the code number of this view dang kiem tim kiem.
	*
	* @return the code number of this view dang kiem tim kiem
	*/
	@Override
	public long getCodeNumber() {
		return _viewDangKiemTimKiem.getCodeNumber();
	}

	/**
	* Sets the code number of this view dang kiem tim kiem.
	*
	* @param codeNumber the code number of this view dang kiem tim kiem
	*/
	@Override
	public void setCodeNumber(long codeNumber) {
		_viewDangKiemTimKiem.setCodeNumber(codeNumber);
	}

	/**
	* Returns the chassis number of this view dang kiem tim kiem.
	*
	* @return the chassis number of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getChassisNumber() {
		return _viewDangKiemTimKiem.getChassisNumber();
	}

	/**
	* Sets the chassis number of this view dang kiem tim kiem.
	*
	* @param chassisNumber the chassis number of this view dang kiem tim kiem
	*/
	@Override
	public void setChassisNumber(java.lang.String chassisNumber) {
		_viewDangKiemTimKiem.setChassisNumber(chassisNumber);
	}

	/**
	* Returns the engine number of this view dang kiem tim kiem.
	*
	* @return the engine number of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getEngineNumber() {
		return _viewDangKiemTimKiem.getEngineNumber();
	}

	/**
	* Sets the engine number of this view dang kiem tim kiem.
	*
	* @param engineNumber the engine number of this view dang kiem tim kiem
	*/
	@Override
	public void setEngineNumber(java.lang.String engineNumber) {
		_viewDangKiemTimKiem.setEngineNumber(engineNumber);
	}

	/**
	* Returns the production year of this view dang kiem tim kiem.
	*
	* @return the production year of this view dang kiem tim kiem
	*/
	@Override
	public long getProductionYear() {
		return _viewDangKiemTimKiem.getProductionYear();
	}

	/**
	* Sets the production year of this view dang kiem tim kiem.
	*
	* @param productionYear the production year of this view dang kiem tim kiem
	*/
	@Override
	public void setProductionYear(long productionYear) {
		_viewDangKiemTimKiem.setProductionYear(productionYear);
	}

	/**
	* Returns the vehicle engine status of this view dang kiem tim kiem.
	*
	* @return the vehicle engine status of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getVehicleEngineStatus() {
		return _viewDangKiemTimKiem.getVehicleEngineStatus();
	}

	/**
	* Sets the vehicle engine status of this view dang kiem tim kiem.
	*
	* @param vehicleEngineStatus the vehicle engine status of this view dang kiem tim kiem
	*/
	@Override
	public void setVehicleEngineStatus(java.lang.String vehicleEngineStatus) {
		_viewDangKiemTimKiem.setVehicleEngineStatus(vehicleEngineStatus);
	}

	/**
	* Returns the vehicle color of this view dang kiem tim kiem.
	*
	* @return the vehicle color of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getVehicleColor() {
		return _viewDangKiemTimKiem.getVehicleColor();
	}

	/**
	* Sets the vehicle color of this view dang kiem tim kiem.
	*
	* @param vehicleColor the vehicle color of this view dang kiem tim kiem
	*/
	@Override
	public void setVehicleColor(java.lang.String vehicleColor) {
		_viewDangKiemTimKiem.setVehicleColor(vehicleColor);
	}

	/**
	* Returns the unit price of this view dang kiem tim kiem.
	*
	* @return the unit price of this view dang kiem tim kiem
	*/
	@Override
	public double getUnitPrice() {
		return _viewDangKiemTimKiem.getUnitPrice();
	}

	/**
	* Sets the unit price of this view dang kiem tim kiem.
	*
	* @param unitPrice the unit price of this view dang kiem tim kiem
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_viewDangKiemTimKiem.setUnitPrice(unitPrice);
	}

	/**
	* Returns the currency of this view dang kiem tim kiem.
	*
	* @return the currency of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getCurrency() {
		return _viewDangKiemTimKiem.getCurrency();
	}

	/**
	* Sets the currency of this view dang kiem tim kiem.
	*
	* @param currency the currency of this view dang kiem tim kiem
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_viewDangKiemTimKiem.setCurrency(currency);
	}

	/**
	* Returns the remarks of this view dang kiem tim kiem.
	*
	* @return the remarks of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getRemarks() {
		return _viewDangKiemTimKiem.getRemarks();
	}

	/**
	* Sets the remarks of this view dang kiem tim kiem.
	*
	* @param remarks the remarks of this view dang kiem tim kiem
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_viewDangKiemTimKiem.setRemarks(remarks);
	}

	/**
	* Returns the confirmed inspection ID of this view dang kiem tim kiem.
	*
	* @return the confirmed inspection ID of this view dang kiem tim kiem
	*/
	@Override
	public long getConfirmedInspectionId() {
		return _viewDangKiemTimKiem.getConfirmedInspectionId();
	}

	/**
	* Sets the confirmed inspection ID of this view dang kiem tim kiem.
	*
	* @param confirmedInspectionId the confirmed inspection ID of this view dang kiem tim kiem
	*/
	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_viewDangKiemTimKiem.setConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the inspection record ID of this view dang kiem tim kiem.
	*
	* @return the inspection record ID of this view dang kiem tim kiem
	*/
	@Override
	public long getInspectionRecordId() {
		return _viewDangKiemTimKiem.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this view dang kiem tim kiem.
	*
	* @param inspectionRecordId the inspection record ID of this view dang kiem tim kiem
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_viewDangKiemTimKiem.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the draft certificate ID of this view dang kiem tim kiem.
	*
	* @return the draft certificate ID of this view dang kiem tim kiem
	*/
	@Override
	public long getDraftCertificateId() {
		return _viewDangKiemTimKiem.getDraftCertificateId();
	}

	/**
	* Sets the draft certificate ID of this view dang kiem tim kiem.
	*
	* @param draftCertificateId the draft certificate ID of this view dang kiem tim kiem
	*/
	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_viewDangKiemTimKiem.setDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns the certificate record ID of this view dang kiem tim kiem.
	*
	* @return the certificate record ID of this view dang kiem tim kiem
	*/
	@Override
	public long getCertificateRecordId() {
		return _viewDangKiemTimKiem.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this view dang kiem tim kiem.
	*
	* @param certificateRecordId the certificate record ID of this view dang kiem tim kiem
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_viewDangKiemTimKiem.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the mark up status of this view dang kiem tim kiem.
	*
	* @return the mark up status of this view dang kiem tim kiem
	*/
	@Override
	public long getMarkUpStatus() {
		return _viewDangKiemTimKiem.getMarkUpStatus();
	}

	/**
	* Sets the mark up status of this view dang kiem tim kiem.
	*
	* @param markUpStatus the mark up status of this view dang kiem tim kiem
	*/
	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_viewDangKiemTimKiem.setMarkUpStatus(markUpStatus);
	}

	/**
	* Returns the safe test requirement ID of this view dang kiem tim kiem.
	*
	* @return the safe test requirement ID of this view dang kiem tim kiem
	*/
	@Override
	public long getSafeTestRequirementId() {
		return _viewDangKiemTimKiem.getSafeTestRequirementId();
	}

	/**
	* Sets the safe test requirement ID of this view dang kiem tim kiem.
	*
	* @param safeTestRequirementId the safe test requirement ID of this view dang kiem tim kiem
	*/
	@Override
	public void setSafeTestRequirementId(long safeTestRequirementId) {
		_viewDangKiemTimKiem.setSafeTestRequirementId(safeTestRequirementId);
	}

	/**
	* Returns the emission test requirement ID of this view dang kiem tim kiem.
	*
	* @return the emission test requirement ID of this view dang kiem tim kiem
	*/
	@Override
	public long getEmissionTestRequirementId() {
		return _viewDangKiemTimKiem.getEmissionTestRequirementId();
	}

	/**
	* Sets the emission test requirement ID of this view dang kiem tim kiem.
	*
	* @param emissionTestRequirementId the emission test requirement ID of this view dang kiem tim kiem
	*/
	@Override
	public void setEmissionTestRequirementId(long emissionTestRequirementId) {
		_viewDangKiemTimKiem.setEmissionTestRequirementId(emissionTestRequirementId);
	}

	/**
	* Returns the control requirement ID of this view dang kiem tim kiem.
	*
	* @return the control requirement ID of this view dang kiem tim kiem
	*/
	@Override
	public long getControlRequirementId() {
		return _viewDangKiemTimKiem.getControlRequirementId();
	}

	/**
	* Sets the control requirement ID of this view dang kiem tim kiem.
	*
	* @param controlRequirementId the control requirement ID of this view dang kiem tim kiem
	*/
	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_viewDangKiemTimKiem.setControlRequirementId(controlRequirementId);
	}

	/**
	* Returns the mark as sample of this view dang kiem tim kiem.
	*
	* @return the mark as sample of this view dang kiem tim kiem
	*/
	@Override
	public int getMarkAsSample() {
		return _viewDangKiemTimKiem.getMarkAsSample();
	}

	/**
	* Sets the mark as sample of this view dang kiem tim kiem.
	*
	* @param markAsSample the mark as sample of this view dang kiem tim kiem
	*/
	@Override
	public void setMarkAsSample(int markAsSample) {
		_viewDangKiemTimKiem.setMarkAsSample(markAsSample);
	}

	/**
	* Returns the inspectionrecordno of this view dang kiem tim kiem.
	*
	* @return the inspectionrecordno of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getInspectionrecordno() {
		return _viewDangKiemTimKiem.getInspectionrecordno();
	}

	/**
	* Sets the inspectionrecordno of this view dang kiem tim kiem.
	*
	* @param inspectionrecordno the inspectionrecordno of this view dang kiem tim kiem
	*/
	@Override
	public void setInspectionrecordno(java.lang.String inspectionrecordno) {
		_viewDangKiemTimKiem.setInspectionrecordno(inspectionrecordno);
	}

	/**
	* Returns the inspection record date of this view dang kiem tim kiem.
	*
	* @return the inspection record date of this view dang kiem tim kiem
	*/
	@Override
	public java.util.Date getInspectionRecordDate() {
		return _viewDangKiemTimKiem.getInspectionRecordDate();
	}

	/**
	* Sets the inspection record date of this view dang kiem tim kiem.
	*
	* @param inspectionRecordDate the inspection record date of this view dang kiem tim kiem
	*/
	@Override
	public void setInspectionRecordDate(java.util.Date inspectionRecordDate) {
		_viewDangKiemTimKiem.setInspectionRecordDate(inspectionRecordDate);
	}

	/**
	* Returns the attached file bbkt of this view dang kiem tim kiem.
	*
	* @return the attached file bbkt of this view dang kiem tim kiem
	*/
	@Override
	public long getAttachedFileBbkt() {
		return _viewDangKiemTimKiem.getAttachedFileBbkt();
	}

	/**
	* Sets the attached file bbkt of this view dang kiem tim kiem.
	*
	* @param attachedFileBbkt the attached file bbkt of this view dang kiem tim kiem
	*/
	@Override
	public void setAttachedFileBbkt(long attachedFileBbkt) {
		_viewDangKiemTimKiem.setAttachedFileBbkt(attachedFileBbkt);
	}

	/**
	* Returns the certificate number of this view dang kiem tim kiem.
	*
	* @return the certificate number of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getCertificateNumber() {
		return _viewDangKiemTimKiem.getCertificateNumber();
	}

	/**
	* Sets the certificate number of this view dang kiem tim kiem.
	*
	* @param certificateNumber the certificate number of this view dang kiem tim kiem
	*/
	@Override
	public void setCertificateNumber(java.lang.String certificateNumber) {
		_viewDangKiemTimKiem.setCertificateNumber(certificateNumber);
	}

	/**
	* Returns the sign date of this view dang kiem tim kiem.
	*
	* @return the sign date of this view dang kiem tim kiem
	*/
	@Override
	public java.util.Date getSignDate() {
		return _viewDangKiemTimKiem.getSignDate();
	}

	/**
	* Sets the sign date of this view dang kiem tim kiem.
	*
	* @param signDate the sign date of this view dang kiem tim kiem
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_viewDangKiemTimKiem.setSignDate(signDate);
	}

	/**
	* Returns the attached file of this view dang kiem tim kiem.
	*
	* @return the attached file of this view dang kiem tim kiem
	*/
	@Override
	public long getAttachedFile() {
		return _viewDangKiemTimKiem.getAttachedFile();
	}

	/**
	* Sets the attached file of this view dang kiem tim kiem.
	*
	* @param attachedFile the attached file of this view dang kiem tim kiem
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_viewDangKiemTimKiem.setAttachedFile(attachedFile);
	}

	/**
	* Returns the registered number of this view dang kiem tim kiem.
	*
	* @return the registered number of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getRegisteredNumber() {
		return _viewDangKiemTimKiem.getRegisteredNumber();
	}

	/**
	* Sets the registered number of this view dang kiem tim kiem.
	*
	* @param registeredNumber the registered number of this view dang kiem tim kiem
	*/
	@Override
	public void setRegisteredNumber(java.lang.String registeredNumber) {
		_viewDangKiemTimKiem.setRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the inspector sign date of this view dang kiem tim kiem.
	*
	* @return the inspector sign date of this view dang kiem tim kiem
	*/
	@Override
	public java.util.Date getInspectorSignDate() {
		return _viewDangKiemTimKiem.getInspectorSignDate();
	}

	/**
	* Sets the inspector sign date of this view dang kiem tim kiem.
	*
	* @param inspectorSignDate the inspector sign date of this view dang kiem tim kiem
	*/
	@Override
	public void setInspectorSignDate(java.util.Date inspectorSignDate) {
		_viewDangKiemTimKiem.setInspectorSignDate(inspectorSignDate);
	}

	/**
	* Returns the vehicle class of this view dang kiem tim kiem.
	*
	* @return the vehicle class of this view dang kiem tim kiem
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _viewDangKiemTimKiem.getVehicleClass();
	}

	/**
	* Sets the vehicle class of this view dang kiem tim kiem.
	*
	* @param vehicleClass the vehicle class of this view dang kiem tim kiem
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_viewDangKiemTimKiem.setVehicleClass(vehicleClass);
	}

	@Override
	public boolean isNew() {
		return _viewDangKiemTimKiem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_viewDangKiemTimKiem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _viewDangKiemTimKiem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_viewDangKiemTimKiem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _viewDangKiemTimKiem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _viewDangKiemTimKiem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_viewDangKiemTimKiem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _viewDangKiemTimKiem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_viewDangKiemTimKiem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_viewDangKiemTimKiem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_viewDangKiemTimKiem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ViewDangKiemTimKiemWrapper((ViewDangKiemTimKiem)_viewDangKiemTimKiem.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem viewDangKiemTimKiem) {
		return _viewDangKiemTimKiem.compareTo(viewDangKiemTimKiem);
	}

	@Override
	public int hashCode() {
		return _viewDangKiemTimKiem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem> toCacheModel() {
		return _viewDangKiemTimKiem.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem toEscapedModel() {
		return new ViewDangKiemTimKiemWrapper(_viewDangKiemTimKiem.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem toUnescapedModel() {
		return new ViewDangKiemTimKiemWrapper(_viewDangKiemTimKiem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _viewDangKiemTimKiem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _viewDangKiemTimKiem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_viewDangKiemTimKiem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ViewDangKiemTimKiemWrapper)) {
			return false;
		}

		ViewDangKiemTimKiemWrapper viewDangKiemTimKiemWrapper = (ViewDangKiemTimKiemWrapper)obj;

		if (Validator.equals(_viewDangKiemTimKiem,
					viewDangKiemTimKiemWrapper._viewDangKiemTimKiem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ViewDangKiemTimKiem getWrappedViewDangKiemTimKiem() {
		return _viewDangKiemTimKiem;
	}

	@Override
	public ViewDangKiemTimKiem getWrappedModel() {
		return _viewDangKiemTimKiem;
	}

	@Override
	public void resetOriginalValues() {
		_viewDangKiemTimKiem.resetOriginalValues();
	}

	private ViewDangKiemTimKiem _viewDangKiemTimKiem;
}