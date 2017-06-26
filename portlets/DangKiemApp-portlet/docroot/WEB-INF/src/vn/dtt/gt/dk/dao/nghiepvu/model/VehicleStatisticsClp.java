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
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class VehicleStatisticsClp extends BaseModelImpl<VehicleStatistics>
	implements VehicleStatistics {
	public VehicleStatisticsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleStatistics.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleStatistics.class.getName();
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
		attributes.put("registeredInspectionId", getRegisteredInspectionId());
		attributes.put("totalRegisteredVehicle", getTotalRegisteredVehicle());
		attributes.put("totalRequestedVehicle", getTotalRequestedVehicle());
		attributes.put("totalNotYetRequestedVehicle",
			getTotalNotYetRequestedVehicle());
		attributes.put("totalCancelledVehicle", getTotalCancelledVehicle());
		attributes.put("totalInspectedVehicle", getTotalInspectedVehicle());
		attributes.put("totalResolvedVehicle", getTotalResolvedVehicle());
		attributes.put("totalReexportedVehicle", getTotalReexportedVehicle());
		attributes.put("totalWrongStatusVehicle", getTotalWrongStatusVehicle());
		attributes.put("totalSafeTestSample", getTotalSafeTestSample());
		attributes.put("totalEmissionTestSample", getTotalEmissionTestSample());
		attributes.put("totalControlRequiredVehicle",
			getTotalControlRequiredVehicle());
		attributes.put("totalCertificate", getTotalCertificate());
		attributes.put("totalViolatedVehicle", getTotalViolatedVehicle());
		attributes.put("totalTechnicalSpec", getTotalTechnicalSpec());
		attributes.put("processingState", getProcessingState());
		attributes.put("processingTiming", getProcessingTiming());
		attributes.put("daysUptoDeadline", getDaysUptoDeadline());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long registeredInspectionId = (Long)attributes.get(
				"registeredInspectionId");

		if (registeredInspectionId != null) {
			setRegisteredInspectionId(registeredInspectionId);
		}

		Long totalRegisteredVehicle = (Long)attributes.get(
				"totalRegisteredVehicle");

		if (totalRegisteredVehicle != null) {
			setTotalRegisteredVehicle(totalRegisteredVehicle);
		}

		Long totalRequestedVehicle = (Long)attributes.get(
				"totalRequestedVehicle");

		if (totalRequestedVehicle != null) {
			setTotalRequestedVehicle(totalRequestedVehicle);
		}

		Long totalNotYetRequestedVehicle = (Long)attributes.get(
				"totalNotYetRequestedVehicle");

		if (totalNotYetRequestedVehicle != null) {
			setTotalNotYetRequestedVehicle(totalNotYetRequestedVehicle);
		}

		Long totalCancelledVehicle = (Long)attributes.get(
				"totalCancelledVehicle");

		if (totalCancelledVehicle != null) {
			setTotalCancelledVehicle(totalCancelledVehicle);
		}

		Long totalInspectedVehicle = (Long)attributes.get(
				"totalInspectedVehicle");

		if (totalInspectedVehicle != null) {
			setTotalInspectedVehicle(totalInspectedVehicle);
		}

		Long totalResolvedVehicle = (Long)attributes.get("totalResolvedVehicle");

		if (totalResolvedVehicle != null) {
			setTotalResolvedVehicle(totalResolvedVehicle);
		}

		Long totalReexportedVehicle = (Long)attributes.get(
				"totalReexportedVehicle");

		if (totalReexportedVehicle != null) {
			setTotalReexportedVehicle(totalReexportedVehicle);
		}

		Long totalWrongStatusVehicle = (Long)attributes.get(
				"totalWrongStatusVehicle");

		if (totalWrongStatusVehicle != null) {
			setTotalWrongStatusVehicle(totalWrongStatusVehicle);
		}

		Long totalSafeTestSample = (Long)attributes.get("totalSafeTestSample");

		if (totalSafeTestSample != null) {
			setTotalSafeTestSample(totalSafeTestSample);
		}

		Long totalEmissionTestSample = (Long)attributes.get(
				"totalEmissionTestSample");

		if (totalEmissionTestSample != null) {
			setTotalEmissionTestSample(totalEmissionTestSample);
		}

		Long totalControlRequiredVehicle = (Long)attributes.get(
				"totalControlRequiredVehicle");

		if (totalControlRequiredVehicle != null) {
			setTotalControlRequiredVehicle(totalControlRequiredVehicle);
		}

		Long totalCertificate = (Long)attributes.get("totalCertificate");

		if (totalCertificate != null) {
			setTotalCertificate(totalCertificate);
		}

		Long totalViolatedVehicle = (Long)attributes.get("totalViolatedVehicle");

		if (totalViolatedVehicle != null) {
			setTotalViolatedVehicle(totalViolatedVehicle);
		}

		Long totalTechnicalSpec = (Long)attributes.get("totalTechnicalSpec");

		if (totalTechnicalSpec != null) {
			setTotalTechnicalSpec(totalTechnicalSpec);
		}

		Long processingState = (Long)attributes.get("processingState");

		if (processingState != null) {
			setProcessingState(processingState);
		}

		Long processingTiming = (Long)attributes.get("processingTiming");

		if (processingTiming != null) {
			setProcessingTiming(processingTiming);
		}

		Long daysUptoDeadline = (Long)attributes.get("daysUptoDeadline");

		if (daysUptoDeadline != null) {
			setDaysUptoDeadline(daysUptoDeadline);
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

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_vehicleStatisticsRemoteModel, id);
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

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredInspectionId",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					registeredInspectionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalRegisteredVehicle() {
		return _totalRegisteredVehicle;
	}

	@Override
	public void setTotalRegisteredVehicle(long totalRegisteredVehicle) {
		_totalRegisteredVehicle = totalRegisteredVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalRegisteredVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalRegisteredVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalRequestedVehicle() {
		return _totalRequestedVehicle;
	}

	@Override
	public void setTotalRequestedVehicle(long totalRequestedVehicle) {
		_totalRequestedVehicle = totalRequestedVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalRequestedVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalRequestedVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalNotYetRequestedVehicle() {
		return _totalNotYetRequestedVehicle;
	}

	@Override
	public void setTotalNotYetRequestedVehicle(long totalNotYetRequestedVehicle) {
		_totalNotYetRequestedVehicle = totalNotYetRequestedVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalNotYetRequestedVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalNotYetRequestedVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalCancelledVehicle() {
		return _totalCancelledVehicle;
	}

	@Override
	public void setTotalCancelledVehicle(long totalCancelledVehicle) {
		_totalCancelledVehicle = totalCancelledVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalCancelledVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalCancelledVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalInspectedVehicle() {
		return _totalInspectedVehicle;
	}

	@Override
	public void setTotalInspectedVehicle(long totalInspectedVehicle) {
		_totalInspectedVehicle = totalInspectedVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalInspectedVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalInspectedVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalResolvedVehicle() {
		return _totalResolvedVehicle;
	}

	@Override
	public void setTotalResolvedVehicle(long totalResolvedVehicle) {
		_totalResolvedVehicle = totalResolvedVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalResolvedVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalResolvedVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalReexportedVehicle() {
		return _totalReexportedVehicle;
	}

	@Override
	public void setTotalReexportedVehicle(long totalReexportedVehicle) {
		_totalReexportedVehicle = totalReexportedVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalReexportedVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalReexportedVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalWrongStatusVehicle() {
		return _totalWrongStatusVehicle;
	}

	@Override
	public void setTotalWrongStatusVehicle(long totalWrongStatusVehicle) {
		_totalWrongStatusVehicle = totalWrongStatusVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalWrongStatusVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalWrongStatusVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalSafeTestSample() {
		return _totalSafeTestSample;
	}

	@Override
	public void setTotalSafeTestSample(long totalSafeTestSample) {
		_totalSafeTestSample = totalSafeTestSample;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalSafeTestSample",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel, totalSafeTestSample);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalEmissionTestSample() {
		return _totalEmissionTestSample;
	}

	@Override
	public void setTotalEmissionTestSample(long totalEmissionTestSample) {
		_totalEmissionTestSample = totalEmissionTestSample;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalEmissionTestSample",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalEmissionTestSample);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalControlRequiredVehicle() {
		return _totalControlRequiredVehicle;
	}

	@Override
	public void setTotalControlRequiredVehicle(long totalControlRequiredVehicle) {
		_totalControlRequiredVehicle = totalControlRequiredVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalControlRequiredVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalControlRequiredVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalCertificate() {
		return _totalCertificate;
	}

	@Override
	public void setTotalCertificate(long totalCertificate) {
		_totalCertificate = totalCertificate;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalCertificate",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel, totalCertificate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalViolatedVehicle() {
		return _totalViolatedVehicle;
	}

	@Override
	public void setTotalViolatedVehicle(long totalViolatedVehicle) {
		_totalViolatedVehicle = totalViolatedVehicle;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalViolatedVehicle",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel,
					totalViolatedVehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalTechnicalSpec() {
		return _totalTechnicalSpec;
	}

	@Override
	public void setTotalTechnicalSpec(long totalTechnicalSpec) {
		_totalTechnicalSpec = totalTechnicalSpec;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalTechnicalSpec",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel, totalTechnicalSpec);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProcessingState() {
		return _processingState;
	}

	@Override
	public void setProcessingState(long processingState) {
		_processingState = processingState;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessingState", long.class);

				method.invoke(_vehicleStatisticsRemoteModel, processingState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProcessingTiming() {
		return _processingTiming;
	}

	@Override
	public void setProcessingTiming(long processingTiming) {
		_processingTiming = processingTiming;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessingTiming",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel, processingTiming);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDaysUptoDeadline() {
		return _daysUptoDeadline;
	}

	@Override
	public void setDaysUptoDeadline(long daysUptoDeadline) {
		_daysUptoDeadline = daysUptoDeadline;

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setDaysUptoDeadline",
						long.class);

				method.invoke(_vehicleStatisticsRemoteModel, daysUptoDeadline);
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

		if (_vehicleStatisticsRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleStatisticsRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_vehicleStatisticsRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVehicleStatisticsRemoteModel() {
		return _vehicleStatisticsRemoteModel;
	}

	public void setVehicleStatisticsRemoteModel(
		BaseModel<?> vehicleStatisticsRemoteModel) {
		_vehicleStatisticsRemoteModel = vehicleStatisticsRemoteModel;
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

		Class<?> remoteModelClass = _vehicleStatisticsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vehicleStatisticsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VehicleStatisticsLocalServiceUtil.addVehicleStatistics(this);
		}
		else {
			VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(this);
		}
	}

	@Override
	public VehicleStatistics toEscapedModel() {
		return (VehicleStatistics)ProxyUtil.newProxyInstance(VehicleStatistics.class.getClassLoader(),
			new Class[] { VehicleStatistics.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VehicleStatisticsClp clone = new VehicleStatisticsClp();

		clone.setId(getId());
		clone.setRegisteredInspectionId(getRegisteredInspectionId());
		clone.setTotalRegisteredVehicle(getTotalRegisteredVehicle());
		clone.setTotalRequestedVehicle(getTotalRequestedVehicle());
		clone.setTotalNotYetRequestedVehicle(getTotalNotYetRequestedVehicle());
		clone.setTotalCancelledVehicle(getTotalCancelledVehicle());
		clone.setTotalInspectedVehicle(getTotalInspectedVehicle());
		clone.setTotalResolvedVehicle(getTotalResolvedVehicle());
		clone.setTotalReexportedVehicle(getTotalReexportedVehicle());
		clone.setTotalWrongStatusVehicle(getTotalWrongStatusVehicle());
		clone.setTotalSafeTestSample(getTotalSafeTestSample());
		clone.setTotalEmissionTestSample(getTotalEmissionTestSample());
		clone.setTotalControlRequiredVehicle(getTotalControlRequiredVehicle());
		clone.setTotalCertificate(getTotalCertificate());
		clone.setTotalViolatedVehicle(getTotalViolatedVehicle());
		clone.setTotalTechnicalSpec(getTotalTechnicalSpec());
		clone.setProcessingState(getProcessingState());
		clone.setProcessingTiming(getProcessingTiming());
		clone.setDaysUptoDeadline(getDaysUptoDeadline());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(VehicleStatistics vehicleStatistics) {
		int value = 0;

		if (getId() < vehicleStatistics.getId()) {
			value = -1;
		}
		else if (getId() > vehicleStatistics.getId()) {
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

		if (!(obj instanceof VehicleStatisticsClp)) {
			return false;
		}

		VehicleStatisticsClp vehicleStatistics = (VehicleStatisticsClp)obj;

		long primaryKey = vehicleStatistics.getPrimaryKey();

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
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredInspectionId=");
		sb.append(getRegisteredInspectionId());
		sb.append(", totalRegisteredVehicle=");
		sb.append(getTotalRegisteredVehicle());
		sb.append(", totalRequestedVehicle=");
		sb.append(getTotalRequestedVehicle());
		sb.append(", totalNotYetRequestedVehicle=");
		sb.append(getTotalNotYetRequestedVehicle());
		sb.append(", totalCancelledVehicle=");
		sb.append(getTotalCancelledVehicle());
		sb.append(", totalInspectedVehicle=");
		sb.append(getTotalInspectedVehicle());
		sb.append(", totalResolvedVehicle=");
		sb.append(getTotalResolvedVehicle());
		sb.append(", totalReexportedVehicle=");
		sb.append(getTotalReexportedVehicle());
		sb.append(", totalWrongStatusVehicle=");
		sb.append(getTotalWrongStatusVehicle());
		sb.append(", totalSafeTestSample=");
		sb.append(getTotalSafeTestSample());
		sb.append(", totalEmissionTestSample=");
		sb.append(getTotalEmissionTestSample());
		sb.append(", totalControlRequiredVehicle=");
		sb.append(getTotalControlRequiredVehicle());
		sb.append(", totalCertificate=");
		sb.append(getTotalCertificate());
		sb.append(", totalViolatedVehicle=");
		sb.append(getTotalViolatedVehicle());
		sb.append(", totalTechnicalSpec=");
		sb.append(getTotalTechnicalSpec());
		sb.append(", processingState=");
		sb.append(getProcessingState());
		sb.append(", processingTiming=");
		sb.append(getProcessingTiming());
		sb.append(", daysUptoDeadline=");
		sb.append(getDaysUptoDeadline());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredInspectionId</column-name><column-value><![CDATA[");
		sb.append(getRegisteredInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalRegisteredVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalRegisteredVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalRequestedVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalRequestedVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalNotYetRequestedVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalNotYetRequestedVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalCancelledVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalCancelledVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalInspectedVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalInspectedVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalResolvedVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalResolvedVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalReexportedVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalReexportedVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalWrongStatusVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalWrongStatusVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalSafeTestSample</column-name><column-value><![CDATA[");
		sb.append(getTotalSafeTestSample());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalEmissionTestSample</column-name><column-value><![CDATA[");
		sb.append(getTotalEmissionTestSample());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalControlRequiredVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalControlRequiredVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalCertificate</column-name><column-value><![CDATA[");
		sb.append(getTotalCertificate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalViolatedVehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalViolatedVehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalTechnicalSpec</column-name><column-value><![CDATA[");
		sb.append(getTotalTechnicalSpec());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processingState</column-name><column-value><![CDATA[");
		sb.append(getProcessingState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processingTiming</column-name><column-value><![CDATA[");
		sb.append(getProcessingTiming());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysUptoDeadline</column-name><column-value><![CDATA[");
		sb.append(getDaysUptoDeadline());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _registeredInspectionId;
	private long _totalRegisteredVehicle;
	private long _totalRequestedVehicle;
	private long _totalNotYetRequestedVehicle;
	private long _totalCancelledVehicle;
	private long _totalInspectedVehicle;
	private long _totalResolvedVehicle;
	private long _totalReexportedVehicle;
	private long _totalWrongStatusVehicle;
	private long _totalSafeTestSample;
	private long _totalEmissionTestSample;
	private long _totalControlRequiredVehicle;
	private long _totalCertificate;
	private long _totalViolatedVehicle;
	private long _totalTechnicalSpec;
	private long _processingState;
	private long _processingTiming;
	private long _daysUptoDeadline;
	private Date _SynchDate;
	private BaseModel<?> _vehicleStatisticsRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}