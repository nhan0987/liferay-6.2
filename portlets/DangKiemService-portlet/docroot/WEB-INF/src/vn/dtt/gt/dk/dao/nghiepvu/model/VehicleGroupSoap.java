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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleGroupServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleGroupServiceSoap
 * @generated
 */
public class VehicleGroupSoap implements Serializable {
	public static VehicleGroupSoap toSoapModel(VehicleGroup model) {
		VehicleGroupSoap soapModel = new VehicleGroupSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setTechnicalSpecCode(model.getTechnicalSpecCode());
		soapModel.setReferenceCertificateNo(model.getReferenceCertificateNo());
		soapModel.setSafetytestreportNo(model.getSafetytestreportNo());
		soapModel.setEmissiontestreportNo(model.getEmissiontestreportNo());
		soapModel.setCopreportNo(model.getCopreportNo());
		soapModel.setVehicleType(model.getVehicleType());
		soapModel.setEngineType(model.getEngineType());
		soapModel.setTradeMark(model.getTradeMark());
		soapModel.setMarkAsVehicle(model.getMarkAsVehicle());
		soapModel.setCommercialName(model.getCommercialName());
		soapModel.setModelCode(model.getModelCode());
		soapModel.setProductionPlant(model.getProductionPlant());
		soapModel.setAddressOfProductionPlant(model.getAddressOfProductionPlant());
		soapModel.setEmissionStandard(model.getEmissionStandard());
		soapModel.setSafetyTestReportId(model.getSafetyTestReportId());
		soapModel.setEmissionTestReportId(model.getEmissionTestReportId());
		soapModel.setCopReportId(model.getCopReportId());
		soapModel.setSpecificationVersion(model.getSpecificationVersion());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static VehicleGroupSoap[] toSoapModels(VehicleGroup[] models) {
		VehicleGroupSoap[] soapModels = new VehicleGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VehicleGroupSoap[][] toSoapModels(VehicleGroup[][] models) {
		VehicleGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VehicleGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VehicleGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VehicleGroupSoap[] toSoapModels(List<VehicleGroup> models) {
		List<VehicleGroupSoap> soapModels = new ArrayList<VehicleGroupSoap>(models.size());

		for (VehicleGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VehicleGroupSoap[soapModels.size()]);
	}

	public VehicleGroupSoap() {
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

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;
	}

	public String getTechnicalSpecCode() {
		return _technicalSpecCode;
	}

	public void setTechnicalSpecCode(String technicalSpecCode) {
		_technicalSpecCode = technicalSpecCode;
	}

	public String getReferenceCertificateNo() {
		return _referenceCertificateNo;
	}

	public void setReferenceCertificateNo(String referenceCertificateNo) {
		_referenceCertificateNo = referenceCertificateNo;
	}

	public String getSafetytestreportNo() {
		return _safetytestreportNo;
	}

	public void setSafetytestreportNo(String safetytestreportNo) {
		_safetytestreportNo = safetytestreportNo;
	}

	public String getEmissiontestreportNo() {
		return _emissiontestreportNo;
	}

	public void setEmissiontestreportNo(String emissiontestreportNo) {
		_emissiontestreportNo = emissiontestreportNo;
	}

	public String getCopreportNo() {
		return _copreportNo;
	}

	public void setCopreportNo(String copreportNo) {
		_copreportNo = copreportNo;
	}

	public String getVehicleType() {
		return _vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;
	}

	public String getEngineType() {
		return _engineType;
	}

	public void setEngineType(String engineType) {
		_engineType = engineType;
	}

	public String getTradeMark() {
		return _tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		_tradeMark = tradeMark;
	}

	public int getMarkAsVehicle() {
		return _markAsVehicle;
	}

	public void setMarkAsVehicle(int markAsVehicle) {
		_markAsVehicle = markAsVehicle;
	}

	public String getCommercialName() {
		return _commercialName;
	}

	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	public String getModelCode() {
		return _modelCode;
	}

	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
	}

	public String getProductionPlant() {
		return _productionPlant;
	}

	public void setProductionPlant(String productionPlant) {
		_productionPlant = productionPlant;
	}

	public String getAddressOfProductionPlant() {
		return _addressOfProductionPlant;
	}

	public void setAddressOfProductionPlant(String addressOfProductionPlant) {
		_addressOfProductionPlant = addressOfProductionPlant;
	}

	public String getEmissionStandard() {
		return _emissionStandard;
	}

	public void setEmissionStandard(String emissionStandard) {
		_emissionStandard = emissionStandard;
	}

	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	public void setSafetyTestReportId(long safetyTestReportId) {
		_safetyTestReportId = safetyTestReportId;
	}

	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	public void setEmissionTestReportId(long emissionTestReportId) {
		_emissionTestReportId = emissionTestReportId;
	}

	public long getCopReportId() {
		return _copReportId;
	}

	public void setCopReportId(long copReportId) {
		_copReportId = copReportId;
	}

	public long getSpecificationVersion() {
		return _specificationVersion;
	}

	public void setSpecificationVersion(long specificationVersion) {
		_specificationVersion = specificationVersion;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private String _vehicleClass;
	private long _registeredInspectionId;
	private String _technicalSpecCode;
	private String _referenceCertificateNo;
	private String _safetytestreportNo;
	private String _emissiontestreportNo;
	private String _copreportNo;
	private String _vehicleType;
	private String _engineType;
	private String _tradeMark;
	private int _markAsVehicle;
	private String _commercialName;
	private String _modelCode;
	private String _productionPlant;
	private String _addressOfProductionPlant;
	private String _emissionStandard;
	private long _safetyTestReportId;
	private long _emissionTestReportId;
	private long _copReportId;
	private long _specificationVersion;
	private long _hoSoThuTucId;
	private String _remarks;
	private long _attachedFile;
	private Date _synchdate;
}