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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.VehiclerecordInitialServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.VehiclerecordInitialServiceSoap
 * @generated
 */
public class VehiclerecordInitialSoap implements Serializable {
	public static VehiclerecordInitialSoap toSoapModel(
		VehiclerecordInitial model) {
		VehiclerecordInitialSoap soapModel = new VehiclerecordInitialSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleGroupId(model.getVehicleGroupId());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setCodeNumber(model.getCodeNumber());
		soapModel.setChassisNumber(model.getChassisNumber());
		soapModel.setEngineNumber(model.getEngineNumber());
		soapModel.setProductionYear(model.getProductionYear());
		soapModel.setVehicleEngineStatus(model.getVehicleEngineStatus());
		soapModel.setVehicleColor(model.getVehicleColor());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setConfirmedInspectionId(model.getConfirmedInspectionId());
		soapModel.setInspectionRecordId(model.getInspectionRecordId());
		soapModel.setDraftCertificateId(model.getDraftCertificateId());
		soapModel.setCertificateRecordId(model.getCertificateRecordId());
		soapModel.setMarkUpStatus(model.getMarkUpStatus());
		soapModel.setSafeTestRequirementId(model.getSafeTestRequirementId());
		soapModel.setEmissionTestRequirementId(model.getEmissionTestRequirementId());
		soapModel.setControlRequirementId(model.getControlRequirementId());

		return soapModel;
	}

	public static VehiclerecordInitialSoap[] toSoapModels(
		VehiclerecordInitial[] models) {
		VehiclerecordInitialSoap[] soapModels = new VehiclerecordInitialSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VehiclerecordInitialSoap[][] toSoapModels(
		VehiclerecordInitial[][] models) {
		VehiclerecordInitialSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VehiclerecordInitialSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VehiclerecordInitialSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VehiclerecordInitialSoap[] toSoapModels(
		List<VehiclerecordInitial> models) {
		List<VehiclerecordInitialSoap> soapModels = new ArrayList<VehiclerecordInitialSoap>(models.size());

		for (VehiclerecordInitial model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VehiclerecordInitialSoap[soapModels.size()]);
	}

	public VehiclerecordInitialSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public long getCodeNumber() {
		return _codeNumber;
	}

	public void setCodeNumber(long codeNumber) {
		_codeNumber = codeNumber;
	}

	public String getChassisNumber() {
		return _chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return _engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;
	}

	public long getProductionYear() {
		return _productionYear;
	}

	public void setProductionYear(long productionYear) {
		_productionYear = productionYear;
	}

	public String getVehicleEngineStatus() {
		return _vehicleEngineStatus;
	}

	public void setVehicleEngineStatus(String vehicleEngineStatus) {
		_vehicleEngineStatus = vehicleEngineStatus;
	}

	public String getVehicleColor() {
		return _vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		_vehicleColor = vehicleColor;
	}

	public double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;
	}

	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	public long getDraftCertificateId() {
		return _draftCertificateId;
	}

	public void setDraftCertificateId(long draftCertificateId) {
		_draftCertificateId = draftCertificateId;
	}

	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;
	}

	public long getMarkUpStatus() {
		return _markUpStatus;
	}

	public void setMarkUpStatus(long markUpStatus) {
		_markUpStatus = markUpStatus;
	}

	public long getSafeTestRequirementId() {
		return _safeTestRequirementId;
	}

	public void setSafeTestRequirementId(long safeTestRequirementId) {
		_safeTestRequirementId = safeTestRequirementId;
	}

	public long getEmissionTestRequirementId() {
		return _emissionTestRequirementId;
	}

	public void setEmissionTestRequirementId(long emissionTestRequirementId) {
		_emissionTestRequirementId = emissionTestRequirementId;
	}

	public long getControlRequirementId() {
		return _controlRequirementId;
	}

	public void setControlRequirementId(long controlRequirementId) {
		_controlRequirementId = controlRequirementId;
	}

	private long _id;
	private long _vehicleGroupId;
	private long _sequenceNo;
	private long _codeNumber;
	private String _chassisNumber;
	private String _engineNumber;
	private long _productionYear;
	private String _vehicleEngineStatus;
	private String _vehicleColor;
	private double _unitPrice;
	private String _currency;
	private String _remarks;
	private long _confirmedInspectionId;
	private long _inspectionRecordId;
	private long _draftCertificateId;
	private long _certificateRecordId;
	private long _markUpStatus;
	private long _safeTestRequirementId;
	private long _emissionTestRequirementId;
	private long _controlRequirementId;
}