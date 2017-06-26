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
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class VehiclerecordInitialClp extends BaseModelImpl<VehiclerecordInitial>
	implements VehiclerecordInitial {
	public VehiclerecordInitialClp() {
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
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_vehiclerecordInitialRemoteModel, id);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_vehiclerecordInitialRemoteModel, vehicleGroupId);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setSequenceNo", long.class);

				method.invoke(_vehiclerecordInitialRemoteModel, sequenceNo);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setCodeNumber", long.class);

				method.invoke(_vehiclerecordInitialRemoteModel, codeNumber);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setChassisNumber", String.class);

				method.invoke(_vehiclerecordInitialRemoteModel, chassisNumber);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setEngineNumber", String.class);

				method.invoke(_vehiclerecordInitialRemoteModel, engineNumber);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setProductionYear", long.class);

				method.invoke(_vehiclerecordInitialRemoteModel, productionYear);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleEngineStatus",
						String.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleColor", String.class);

				method.invoke(_vehiclerecordInitialRemoteModel, vehicleColor);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", double.class);

				method.invoke(_vehiclerecordInitialRemoteModel, unitPrice);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", String.class);

				method.invoke(_vehiclerecordInitialRemoteModel, currency);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_vehiclerecordInitialRemoteModel, remarks);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmedInspectionId",
						long.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordId",
						long.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setDraftCertificateId",
						long.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkUpStatus", long.class);

				method.invoke(_vehiclerecordInitialRemoteModel, markUpStatus);
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setSafeTestRequirementId",
						long.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissionTestRequirementId",
						long.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
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

		if (_vehiclerecordInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehiclerecordInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setControlRequirementId",
						long.class);

				method.invoke(_vehiclerecordInitialRemoteModel,
					controlRequirementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVehiclerecordInitialRemoteModel() {
		return _vehiclerecordInitialRemoteModel;
	}

	public void setVehiclerecordInitialRemoteModel(
		BaseModel<?> vehiclerecordInitialRemoteModel) {
		_vehiclerecordInitialRemoteModel = vehiclerecordInitialRemoteModel;
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

		Class<?> remoteModelClass = _vehiclerecordInitialRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vehiclerecordInitialRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VehiclerecordInitialLocalServiceUtil.addVehiclerecordInitial(this);
		}
		else {
			VehiclerecordInitialLocalServiceUtil.updateVehiclerecordInitial(this);
		}
	}

	@Override
	public VehiclerecordInitial toEscapedModel() {
		return (VehiclerecordInitial)ProxyUtil.newProxyInstance(VehiclerecordInitial.class.getClassLoader(),
			new Class[] { VehiclerecordInitial.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VehiclerecordInitialClp clone = new VehiclerecordInitialClp();

		clone.setId(getId());
		clone.setVehicleGroupId(getVehicleGroupId());
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

		return clone;
	}

	@Override
	public int compareTo(VehiclerecordInitial vehiclerecordInitial) {
		int value = 0;

		if (getId() < vehiclerecordInitial.getId()) {
			value = -1;
		}
		else if (getId() > vehiclerecordInitial.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		if (!(obj instanceof VehiclerecordInitialClp)) {
			return false;
		}

		VehiclerecordInitialClp vehiclerecordInitial = (VehiclerecordInitialClp)obj;

		long primaryKey = vehiclerecordInitial.getPrimaryKey();

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
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial");
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

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _vehiclerecordInitialRemoteModel;
}