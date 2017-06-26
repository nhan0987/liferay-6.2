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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huymq
 */
public class ViewTrungSoKhungDongCoClp extends BaseModelImpl<ViewTrungSoKhungDongCo>
	implements ViewTrungSoKhungDongCo {
	public ViewTrungSoKhungDongCoClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, vehicleGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDebitNoteId() {
		return _debitNoteId;
	}

	@Override
	public void setDebitNoteId(long debitNoteId) {
		_debitNoteId = debitNoteId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setDebitNoteId", long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, debitNoteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, sequenceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCodeNumber() {
		return _codeNumber;
	}

	@Override
	public void setCodeNumber(long codeNumber) {
		_codeNumber = codeNumber;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setCodeNumber", long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, codeNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChassisNumber() {
		return _chassisNumber;
	}

	@Override
	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setChassisNumber", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, chassisNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEngineNumber() {
		return _engineNumber;
	}

	@Override
	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setEngineNumber", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, engineNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProductionYear() {
		return _productionYear;
	}

	@Override
	public void setProductionYear(long productionYear) {
		_productionYear = productionYear;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setProductionYear", long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, productionYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleEngineStatus() {
		return _vehicleEngineStatus;
	}

	@Override
	public void setVehicleEngineStatus(String vehicleEngineStatus) {
		_vehicleEngineStatus = vehicleEngineStatus;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleEngineStatus",
						String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					vehicleEngineStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleColor() {
		return _vehicleColor;
	}

	@Override
	public void setVehicleColor(String vehicleColor) {
		_vehicleColor = vehicleColor;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleColor", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, vehicleColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUnitPrice() {
		return _unitPrice;
	}

	@Override
	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", double.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, unitPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrency() {
		return _currency;
	}

	@Override
	public void setCurrency(String currency) {
		_currency = currency;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, currency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedInspectionId",
						long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					confirmedInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordId",
						long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					inspectionRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDraftCertificateId() {
		return _draftCertificateId;
	}

	@Override
	public void setDraftCertificateId(long draftCertificateId) {
		_draftCertificateId = draftCertificateId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setDraftCertificateId",
						long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					draftCertificateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					certificateRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMarkUpStatus() {
		return _markUpStatus;
	}

	@Override
	public void setMarkUpStatus(long markUpStatus) {
		_markUpStatus = markUpStatus;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkUpStatus", long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, markUpStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSafeTestRequirementId() {
		return _safeTestRequirementId;
	}

	@Override
	public void setSafeTestRequirementId(long safeTestRequirementId) {
		_safeTestRequirementId = safeTestRequirementId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setSafeTestRequirementId",
						long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					safeTestRequirementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmissionTestRequirementId() {
		return _emissionTestRequirementId;
	}

	@Override
	public void setEmissionTestRequirementId(long emissionTestRequirementId) {
		_emissionTestRequirementId = emissionTestRequirementId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissionTestRequirementId",
						long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					emissionTestRequirementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getControlRequirementId() {
		return _controlRequirementId;
	}

	@Override
	public void setControlRequirementId(long controlRequirementId) {
		_controlRequirementId = controlRequirementId;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setControlRequirementId",
						long.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					controlRequirementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkAsSample() {
		return _markAsSample;
	}

	@Override
	public void setMarkAsSample(int markAsSample) {
		_markAsSample = markAsSample;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkAsSample", int.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, markAsSample);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	@Override
	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredNumber",
						String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel,
					registeredNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactName() {
		return _contactName;
	}

	@Override
	public void setContactName(String contactName) {
		_contactName = contactName;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setContactName", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, contactName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactPhone() {
		return _contactPhone;
	}

	@Override
	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPhone", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, contactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDate() {
		return _inspectionDate;
	}

	@Override
	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDate", Date.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, inspectionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterName() {
		return _importerName;
	}

	@Override
	public void setImporterName(String importerName) {
		_importerName = importerName;

		if (_viewTrungSoKhungDongCoRemoteModel != null) {
			try {
				Class<?> clazz = _viewTrungSoKhungDongCoRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterName", String.class);

				method.invoke(_viewTrungSoKhungDongCoRemoteModel, importerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getViewTrungSoKhungDongCoRemoteModel() {
		return _viewTrungSoKhungDongCoRemoteModel;
	}

	public void setViewTrungSoKhungDongCoRemoteModel(
		BaseModel<?> viewTrungSoKhungDongCoRemoteModel) {
		_viewTrungSoKhungDongCoRemoteModel = viewTrungSoKhungDongCoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _viewTrungSoKhungDongCoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_viewTrungSoKhungDongCoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ViewTrungSoKhungDongCoLocalServiceUtil.addViewTrungSoKhungDongCo(this);
		}
		else {
			ViewTrungSoKhungDongCoLocalServiceUtil.updateViewTrungSoKhungDongCo(this);
		}
	}

	@Override
	public ViewTrungSoKhungDongCo toEscapedModel() {
		return (ViewTrungSoKhungDongCo)ProxyUtil.newProxyInstance(ViewTrungSoKhungDongCo.class.getClassLoader(),
			new Class[] { ViewTrungSoKhungDongCo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ViewTrungSoKhungDongCoClp clone = new ViewTrungSoKhungDongCoClp();

		clone.setId(getId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setDebitNoteId(getDebitNoteId());
		clone.setSequenceNo(getSequenceNo());
		clone.setCodeNumber(getCodeNumber());
		clone.setChassisNumber(getChassisNumber());
		clone.setEngineNumber(getEngineNumber());
		clone.setProductionYear(getProductionYear());
		clone.setVehicleEngineStatus(getVehicleEngineStatus());
		clone.setVehicleColor(getVehicleColor());
		clone.setUnitPrice(getUnitPrice());
		clone.setCurrency(getCurrency());
		clone.setRemarks(getRemarks());
		clone.setConfirmedInspectionId(getConfirmedInspectionId());
		clone.setInspectionRecordId(getInspectionRecordId());
		clone.setDraftCertificateId(getDraftCertificateId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setMarkUpStatus(getMarkUpStatus());
		clone.setSafeTestRequirementId(getSafeTestRequirementId());
		clone.setEmissionTestRequirementId(getEmissionTestRequirementId());
		clone.setControlRequirementId(getControlRequirementId());
		clone.setMarkAsSample(getMarkAsSample());
		clone.setRegisteredNumber(getRegisteredNumber());
		clone.setContactName(getContactName());
		clone.setContactPhone(getContactPhone());
		clone.setInspectionDate(getInspectionDate());
		clone.setImporterName(getImporterName());

		return clone;
	}

	@Override
	public int compareTo(ViewTrungSoKhungDongCo viewTrungSoKhungDongCo) {
		int value = 0;

		if (getId() < viewTrungSoKhungDongCo.getId()) {
			value = -1;
		}
		else if (getId() > viewTrungSoKhungDongCo.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ViewTrungSoKhungDongCoClp)) {
			return false;
		}

		ViewTrungSoKhungDongCoClp viewTrungSoKhungDongCo = (ViewTrungSoKhungDongCoClp)obj;

		long primaryKey = viewTrungSoKhungDongCo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", debitNoteId=");
		sb.append(getDebitNoteId());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", codeNumber=");
		sb.append(getCodeNumber());
		sb.append(", chassisNumber=");
		sb.append(getChassisNumber());
		sb.append(", engineNumber=");
		sb.append(getEngineNumber());
		sb.append(", productionYear=");
		sb.append(getProductionYear());
		sb.append(", vehicleEngineStatus=");
		sb.append(getVehicleEngineStatus());
		sb.append(", vehicleColor=");
		sb.append(getVehicleColor());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", inspectionRecordId=");
		sb.append(getInspectionRecordId());
		sb.append(", draftCertificateId=");
		sb.append(getDraftCertificateId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", markUpStatus=");
		sb.append(getMarkUpStatus());
		sb.append(", safeTestRequirementId=");
		sb.append(getSafeTestRequirementId());
		sb.append(", emissionTestRequirementId=");
		sb.append(getEmissionTestRequirementId());
		sb.append(", controlRequirementId=");
		sb.append(getControlRequirementId());
		sb.append(", markAsSample=");
		sb.append(getMarkAsSample());
		sb.append(", registeredNumber=");
		sb.append(getRegisteredNumber());
		sb.append(", contactName=");
		sb.append(getContactName());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", inspectionDate=");
		sb.append(getInspectionDate());
		sb.append(", importerName=");
		sb.append(getImporterName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>debitNoteId</column-name><column-value><![CDATA[");
		sb.append(getDebitNoteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codeNumber</column-name><column-value><![CDATA[");
		sb.append(getCodeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chassisNumber</column-name><column-value><![CDATA[");
		sb.append(getChassisNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineNumber</column-name><column-value><![CDATA[");
		sb.append(getEngineNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionYear</column-name><column-value><![CDATA[");
		sb.append(getProductionYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleEngineStatus</column-name><column-value><![CDATA[");
		sb.append(getVehicleEngineStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleColor</column-name><column-value><![CDATA[");
		sb.append(getVehicleColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedInspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordId</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>draftCertificateId</column-name><column-value><![CDATA[");
		sb.append(getDraftCertificateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markUpStatus</column-name><column-value><![CDATA[");
		sb.append(getMarkUpStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safeTestRequirementId</column-name><column-value><![CDATA[");
		sb.append(getSafeTestRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionTestRequirementId</column-name><column-value><![CDATA[");
		sb.append(getEmissionTestRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlRequirementId</column-name><column-value><![CDATA[");
		sb.append(getControlRequirementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAsSample</column-name><column-value><![CDATA[");
		sb.append(getMarkAsSample());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredNumber</column-name><column-value><![CDATA[");
		sb.append(getRegisteredNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactName</column-name><column-value><![CDATA[");
		sb.append(getContactName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhone</column-name><column-value><![CDATA[");
		sb.append(getContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDate</column-name><column-value><![CDATA[");
		sb.append(getInspectionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerName</column-name><column-value><![CDATA[");
		sb.append(getImporterName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _vehicleGroupId;
	private long _debitNoteId;
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
	private int _markAsSample;
	private String _registeredNumber;
	private String _contactName;
	private String _contactPhone;
	private Date _inspectionDate;
	private String _importerName;
	private BaseModel<?> _viewTrungSoKhungDongCoRemoteModel;
}