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
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class VehicleGroupInitialClp extends BaseModelImpl<VehicleGroupInitial>
	implements VehicleGroupInitial {
	public VehicleGroupInitialClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleGroupInitial.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleGroupInitial.class.getName();
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
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("technicalSpecCode", getTechnicalSpecCode());
		attributes.put("referenceCertificateNo", getReferenceCertificateNo());
		attributes.put("safetytestreportNo", getSafetytestreportNo());
		attributes.put("emissiontestreportNo", getEmissiontestreportNo());
		attributes.put("copreportNo", getCopreportNo());
		attributes.put("controlreportNo", getControlreportNo());
		attributes.put("vehicleType", getVehicleType());
		attributes.put("engineType", getEngineType());
		attributes.put("tradeMark", getTradeMark());
		attributes.put("markAsVehicle", getMarkAsVehicle());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("productionPlant", getProductionPlant());
		attributes.put("addressOfProductionPlant", getAddressOfProductionPlant());
		attributes.put("emissionStandard", getEmissionStandard());
		attributes.put("safetyTestReportId", getSafetyTestReportId());
		attributes.put("emissionTestReportId", getEmissionTestReportId());
		attributes.put("copReportId", getCopReportId());
		attributes.put("controlreportId", getControlreportId());
		attributes.put("specificationVersion", getSpecificationVersion());
		attributes.put("remarks", getRemarks());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		String technicalSpecCode = (String)attributes.get("technicalSpecCode");

		if (technicalSpecCode != null) {
			setTechnicalSpecCode(technicalSpecCode);
		}

		String referenceCertificateNo = (String)attributes.get(
				"referenceCertificateNo");

		if (referenceCertificateNo != null) {
			setReferenceCertificateNo(referenceCertificateNo);
		}

		String safetytestreportNo = (String)attributes.get("safetytestreportNo");

		if (safetytestreportNo != null) {
			setSafetytestreportNo(safetytestreportNo);
		}

		String emissiontestreportNo = (String)attributes.get(
				"emissiontestreportNo");

		if (emissiontestreportNo != null) {
			setEmissiontestreportNo(emissiontestreportNo);
		}

		String copreportNo = (String)attributes.get("copreportNo");

		if (copreportNo != null) {
			setCopreportNo(copreportNo);
		}

		String controlreportNo = (String)attributes.get("controlreportNo");

		if (controlreportNo != null) {
			setControlreportNo(controlreportNo);
		}

		String vehicleType = (String)attributes.get("vehicleType");

		if (vehicleType != null) {
			setVehicleType(vehicleType);
		}

		String engineType = (String)attributes.get("engineType");

		if (engineType != null) {
			setEngineType(engineType);
		}

		String tradeMark = (String)attributes.get("tradeMark");

		if (tradeMark != null) {
			setTradeMark(tradeMark);
		}

		Integer markAsVehicle = (Integer)attributes.get("markAsVehicle");

		if (markAsVehicle != null) {
			setMarkAsVehicle(markAsVehicle);
		}

		String commercialName = (String)attributes.get("commercialName");

		if (commercialName != null) {
			setCommercialName(commercialName);
		}

		String modelCode = (String)attributes.get("modelCode");

		if (modelCode != null) {
			setModelCode(modelCode);
		}

		String productionPlant = (String)attributes.get("productionPlant");

		if (productionPlant != null) {
			setProductionPlant(productionPlant);
		}

		String addressOfProductionPlant = (String)attributes.get(
				"addressOfProductionPlant");

		if (addressOfProductionPlant != null) {
			setAddressOfProductionPlant(addressOfProductionPlant);
		}

		String emissionStandard = (String)attributes.get("emissionStandard");

		if (emissionStandard != null) {
			setEmissionStandard(emissionStandard);
		}

		Long safetyTestReportId = (Long)attributes.get("safetyTestReportId");

		if (safetyTestReportId != null) {
			setSafetyTestReportId(safetyTestReportId);
		}

		Long emissionTestReportId = (Long)attributes.get("emissionTestReportId");

		if (emissionTestReportId != null) {
			setEmissionTestReportId(emissionTestReportId);
		}

		Long copReportId = (Long)attributes.get("copReportId");

		if (copReportId != null) {
			setCopReportId(copReportId);
		}

		Long controlreportId = (Long)attributes.get("controlreportId");

		if (controlreportId != null) {
			setControlreportId(controlreportId);
		}

		Long specificationVersion = (Long)attributes.get("specificationVersion");

		if (specificationVersion != null) {
			setSpecificationVersion(specificationVersion);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_vehicleGroupInitialRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleClass() {
		return _vehicleClass;
	}

	@Override
	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleClass", String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, vehicleClass);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					registeredInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTechnicalSpecCode() {
		return _technicalSpecCode;
	}

	@Override
	public void setTechnicalSpecCode(String technicalSpecCode) {
		_technicalSpecCode = technicalSpecCode;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setTechnicalSpecCode",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, technicalSpecCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReferenceCertificateNo() {
		return _referenceCertificateNo;
	}

	@Override
	public void setReferenceCertificateNo(String referenceCertificateNo) {
		_referenceCertificateNo = referenceCertificateNo;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setReferenceCertificateNo",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					referenceCertificateNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSafetytestreportNo() {
		return _safetytestreportNo;
	}

	@Override
	public void setSafetytestreportNo(String safetytestreportNo) {
		_safetytestreportNo = safetytestreportNo;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setSafetytestreportNo",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					safetytestreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmissiontestreportNo() {
		return _emissiontestreportNo;
	}

	@Override
	public void setEmissiontestreportNo(String emissiontestreportNo) {
		_emissiontestreportNo = emissiontestreportNo;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissiontestreportNo",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					emissiontestreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCopreportNo() {
		return _copreportNo;
	}

	@Override
	public void setCopreportNo(String copreportNo) {
		_copreportNo = copreportNo;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setCopreportNo", String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, copreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getControlreportNo() {
		return _controlreportNo;
	}

	@Override
	public void setControlreportNo(String controlreportNo) {
		_controlreportNo = controlreportNo;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setControlreportNo",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, controlreportNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleType() {
		return _vehicleType;
	}

	@Override
	public void setVehicleType(String vehicleType) {
		_vehicleType = vehicleType;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleType", String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, vehicleType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEngineType() {
		return _engineType;
	}

	@Override
	public void setEngineType(String engineType) {
		_engineType = engineType;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setEngineType", String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, engineType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTradeMark() {
		return _tradeMark;
	}

	@Override
	public void setTradeMark(String tradeMark) {
		_tradeMark = tradeMark;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setTradeMark", String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, tradeMark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkAsVehicle() {
		return _markAsVehicle;
	}

	@Override
	public void setMarkAsVehicle(int markAsVehicle) {
		_markAsVehicle = markAsVehicle;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkAsVehicle", int.class);

				method.invoke(_vehicleGroupInitialRemoteModel, markAsVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommercialName() {
		return _commercialName;
	}

	@Override
	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setCommercialName",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, commercialName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getModelCode() {
		return _modelCode;
	}

	@Override
	public void setModelCode(String modelCode) {
		_modelCode = modelCode;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setModelCode", String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, modelCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductionPlant() {
		return _productionPlant;
	}

	@Override
	public void setProductionPlant(String productionPlant) {
		_productionPlant = productionPlant;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setProductionPlant",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, productionPlant);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressOfProductionPlant() {
		return _addressOfProductionPlant;
	}

	@Override
	public void setAddressOfProductionPlant(String addressOfProductionPlant) {
		_addressOfProductionPlant = addressOfProductionPlant;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressOfProductionPlant",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					addressOfProductionPlant);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmissionStandard() {
		return _emissionStandard;
	}

	@Override
	public void setEmissionStandard(String emissionStandard) {
		_emissionStandard = emissionStandard;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissionStandard",
						String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, emissionStandard);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSafetyTestReportId() {
		return _safetyTestReportId;
	}

	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_safetyTestReportId = safetyTestReportId;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setSafetyTestReportId",
						long.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					safetyTestReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEmissionTestReportId() {
		return _emissionTestReportId;
	}

	@Override
	public void setEmissionTestReportId(long emissionTestReportId) {
		_emissionTestReportId = emissionTestReportId;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setEmissionTestReportId",
						long.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					emissionTestReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCopReportId() {
		return _copReportId;
	}

	@Override
	public void setCopReportId(long copReportId) {
		_copReportId = copReportId;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setCopReportId", long.class);

				method.invoke(_vehicleGroupInitialRemoteModel, copReportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getControlreportId() {
		return _controlreportId;
	}

	@Override
	public void setControlreportId(long controlreportId) {
		_controlreportId = controlreportId;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setControlreportId", long.class);

				method.invoke(_vehicleGroupInitialRemoteModel, controlreportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSpecificationVersion() {
		return _specificationVersion;
	}

	@Override
	public void setSpecificationVersion(long specificationVersion) {
		_specificationVersion = specificationVersion;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setSpecificationVersion",
						long.class);

				method.invoke(_vehicleGroupInitialRemoteModel,
					specificationVersion);
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

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_vehicleGroupInitialRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_vehicleGroupInitialRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_vehicleGroupInitialRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleGroupInitialRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_vehicleGroupInitialRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVehicleGroupInitialRemoteModel() {
		return _vehicleGroupInitialRemoteModel;
	}

	public void setVehicleGroupInitialRemoteModel(
		BaseModel<?> vehicleGroupInitialRemoteModel) {
		_vehicleGroupInitialRemoteModel = vehicleGroupInitialRemoteModel;
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

		Class<?> remoteModelClass = _vehicleGroupInitialRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vehicleGroupInitialRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VehicleGroupInitialLocalServiceUtil.addVehicleGroupInitial(this);
		}
		else {
			VehicleGroupInitialLocalServiceUtil.updateVehicleGroupInitial(this);
		}
	}

	@Override
	public VehicleGroupInitial toEscapedModel() {
		return (VehicleGroupInitial)ProxyUtil.newProxyInstance(VehicleGroupInitial.class.getClassLoader(),
			new Class[] { VehicleGroupInitial.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VehicleGroupInitialClp clone = new VehicleGroupInitialClp();

		clone.setId(getId());
		clone.setVehicleClass(getVehicleClass());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setTechnicalSpecCode(getTechnicalSpecCode());
		clone.setReferenceCertificateNo(getReferenceCertificateNo());
		clone.setSafetytestreportNo(getSafetytestreportNo());
		clone.setEmissiontestreportNo(getEmissiontestreportNo());
		clone.setCopreportNo(getCopreportNo());
		clone.setControlreportNo(getControlreportNo());
		clone.setVehicleType(getVehicleType());
		clone.setEngineType(getEngineType());
		clone.setTradeMark(getTradeMark());
		clone.setMarkAsVehicle(getMarkAsVehicle());
		clone.setCommercialName(getCommercialName());
		clone.setModelCode(getModelCode());
		clone.setProductionPlant(getProductionPlant());
		clone.setAddressOfProductionPlant(getAddressOfProductionPlant());
		clone.setEmissionStandard(getEmissionStandard());
		clone.setSafetyTestReportId(getSafetyTestReportId());
		clone.setEmissionTestReportId(getEmissionTestReportId());
		clone.setCopReportId(getCopReportId());
		clone.setControlreportId(getControlreportId());
		clone.setSpecificationVersion(getSpecificationVersion());
		clone.setRemarks(getRemarks());
		clone.setAttachedFile(getAttachedFile());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(VehicleGroupInitial vehicleGroupInitial) {
		int value = 0;

		if (getId() < vehicleGroupInitial.getId()) {
			value = -1;
		}
		else if (getId() > vehicleGroupInitial.getId()) {
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

		if (!(obj instanceof VehicleGroupInitialClp)) {
			return false;
		}

		VehicleGroupInitialClp vehicleGroupInitial = (VehicleGroupInitialClp)obj;

		long primaryKey = vehicleGroupInitial.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", vehicleClass=");
		sb.append(getVehicleClass());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", technicalSpecCode=");
		sb.append(getTechnicalSpecCode());
		sb.append(", referenceCertificateNo=");
		sb.append(getReferenceCertificateNo());
		sb.append(", safetytestreportNo=");
		sb.append(getSafetytestreportNo());
		sb.append(", emissiontestreportNo=");
		sb.append(getEmissiontestreportNo());
		sb.append(", copreportNo=");
		sb.append(getCopreportNo());
		sb.append(", controlreportNo=");
		sb.append(getControlreportNo());
		sb.append(", vehicleType=");
		sb.append(getVehicleType());
		sb.append(", engineType=");
		sb.append(getEngineType());
		sb.append(", tradeMark=");
		sb.append(getTradeMark());
		sb.append(", markAsVehicle=");
		sb.append(getMarkAsVehicle());
		sb.append(", commercialName=");
		sb.append(getCommercialName());
		sb.append(", modelCode=");
		sb.append(getModelCode());
		sb.append(", productionPlant=");
		sb.append(getProductionPlant());
		sb.append(", addressOfProductionPlant=");
		sb.append(getAddressOfProductionPlant());
		sb.append(", emissionStandard=");
		sb.append(getEmissionStandard());
		sb.append(", safetyTestReportId=");
		sb.append(getSafetyTestReportId());
		sb.append(", emissionTestReportId=");
		sb.append(getEmissionTestReportId());
		sb.append(", copReportId=");
		sb.append(getCopReportId());
		sb.append(", controlreportId=");
		sb.append(getControlreportId());
		sb.append(", specificationVersion=");
		sb.append(getSpecificationVersion());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleClass</column-name><column-value><![CDATA[");
		sb.append(getVehicleClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>technicalSpecCode</column-name><column-value><![CDATA[");
		sb.append(getTechnicalSpecCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>referenceCertificateNo</column-name><column-value><![CDATA[");
		sb.append(getReferenceCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetytestreportNo</column-name><column-value><![CDATA[");
		sb.append(getSafetytestreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissiontestreportNo</column-name><column-value><![CDATA[");
		sb.append(getEmissiontestreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copreportNo</column-name><column-value><![CDATA[");
		sb.append(getCopreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlreportNo</column-name><column-value><![CDATA[");
		sb.append(getControlreportNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleType</column-name><column-value><![CDATA[");
		sb.append(getVehicleType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineType</column-name><column-value><![CDATA[");
		sb.append(getEngineType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tradeMark</column-name><column-value><![CDATA[");
		sb.append(getTradeMark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markAsVehicle</column-name><column-value><![CDATA[");
		sb.append(getMarkAsVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commercialName</column-name><column-value><![CDATA[");
		sb.append(getCommercialName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modelCode</column-name><column-value><![CDATA[");
		sb.append(getModelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlant</column-name><column-value><![CDATA[");
		sb.append(getProductionPlant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressOfProductionPlant</column-name><column-value><![CDATA[");
		sb.append(getAddressOfProductionPlant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionStandard</column-name><column-value><![CDATA[");
		sb.append(getEmissionStandard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>safetyTestReportId</column-name><column-value><![CDATA[");
		sb.append(getSafetyTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emissionTestReportId</column-name><column-value><![CDATA[");
		sb.append(getEmissionTestReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copReportId</column-name><column-value><![CDATA[");
		sb.append(getCopReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlreportId</column-name><column-value><![CDATA[");
		sb.append(getControlreportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specificationVersion</column-name><column-value><![CDATA[");
		sb.append(getSpecificationVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _vehicleClass;
	private long _registeredInspectionId;
	private String _technicalSpecCode;
	private String _referenceCertificateNo;
	private String _safetytestreportNo;
	private String _emissiontestreportNo;
	private String _copreportNo;
	private String _controlreportNo;
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
	private long _controlreportId;
	private long _specificationVersion;
	private String _remarks;
	private long _attachedFile;
	private Date _SynchDate;
	private BaseModel<?> _vehicleGroupInitialRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}