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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleStatisticsServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.VehicleStatisticsServiceSoap
 * @generated
 */
public class VehicleStatisticsSoap implements Serializable {
	public static VehicleStatisticsSoap toSoapModel(VehicleStatistics model) {
		VehicleStatisticsSoap soapModel = new VehicleStatisticsSoap();

		soapModel.setId(model.getId());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setTotalRegisteredVehicle(model.getTotalRegisteredVehicle());
		soapModel.setTotalRequestedVehicle(model.getTotalRequestedVehicle());
		soapModel.setTotalNotYetRequestedVehicle(model.getTotalNotYetRequestedVehicle());
		soapModel.setTotalCancelledVehicle(model.getTotalCancelledVehicle());
		soapModel.setTotalInspectedVehicle(model.getTotalInspectedVehicle());
		soapModel.setTotalResolvedVehicle(model.getTotalResolvedVehicle());
		soapModel.setTotalReexportedVehicle(model.getTotalReexportedVehicle());
		soapModel.setTotalWrongStatusVehicle(model.getTotalWrongStatusVehicle());
		soapModel.setTotalSafeTestSample(model.getTotalSafeTestSample());
		soapModel.setTotalEmissionTestSample(model.getTotalEmissionTestSample());
		soapModel.setTotalControlRequiredVehicle(model.getTotalControlRequiredVehicle());
		soapModel.setTotalCertificate(model.getTotalCertificate());
		soapModel.setTotalViolatedVehicle(model.getTotalViolatedVehicle());
		soapModel.setTotalTechnicalSpec(model.getTotalTechnicalSpec());
		soapModel.setProcessingState(model.getProcessingState());
		soapModel.setProcessingTiming(model.getProcessingTiming());
		soapModel.setDaysUptoDeadline(model.getDaysUptoDeadline());

		return soapModel;
	}

	public static VehicleStatisticsSoap[] toSoapModels(
		VehicleStatistics[] models) {
		VehicleStatisticsSoap[] soapModels = new VehicleStatisticsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VehicleStatisticsSoap[][] toSoapModels(
		VehicleStatistics[][] models) {
		VehicleStatisticsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VehicleStatisticsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VehicleStatisticsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VehicleStatisticsSoap[] toSoapModels(
		List<VehicleStatistics> models) {
		List<VehicleStatisticsSoap> soapModels = new ArrayList<VehicleStatisticsSoap>(models.size());

		for (VehicleStatistics model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VehicleStatisticsSoap[soapModels.size()]);
	}

	public VehicleStatisticsSoap() {
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

	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;
	}

	public long getTotalRegisteredVehicle() {
		return _totalRegisteredVehicle;
	}

	public void setTotalRegisteredVehicle(long totalRegisteredVehicle) {
		_totalRegisteredVehicle = totalRegisteredVehicle;
	}

	public long getTotalRequestedVehicle() {
		return _totalRequestedVehicle;
	}

	public void setTotalRequestedVehicle(long totalRequestedVehicle) {
		_totalRequestedVehicle = totalRequestedVehicle;
	}

	public long getTotalNotYetRequestedVehicle() {
		return _totalNotYetRequestedVehicle;
	}

	public void setTotalNotYetRequestedVehicle(long totalNotYetRequestedVehicle) {
		_totalNotYetRequestedVehicle = totalNotYetRequestedVehicle;
	}

	public long getTotalCancelledVehicle() {
		return _totalCancelledVehicle;
	}

	public void setTotalCancelledVehicle(long totalCancelledVehicle) {
		_totalCancelledVehicle = totalCancelledVehicle;
	}

	public long getTotalInspectedVehicle() {
		return _totalInspectedVehicle;
	}

	public void setTotalInspectedVehicle(long totalInspectedVehicle) {
		_totalInspectedVehicle = totalInspectedVehicle;
	}

	public long getTotalResolvedVehicle() {
		return _totalResolvedVehicle;
	}

	public void setTotalResolvedVehicle(long totalResolvedVehicle) {
		_totalResolvedVehicle = totalResolvedVehicle;
	}

	public long getTotalReexportedVehicle() {
		return _totalReexportedVehicle;
	}

	public void setTotalReexportedVehicle(long totalReexportedVehicle) {
		_totalReexportedVehicle = totalReexportedVehicle;
	}

	public long getTotalWrongStatusVehicle() {
		return _totalWrongStatusVehicle;
	}

	public void setTotalWrongStatusVehicle(long totalWrongStatusVehicle) {
		_totalWrongStatusVehicle = totalWrongStatusVehicle;
	}

	public long getTotalSafeTestSample() {
		return _totalSafeTestSample;
	}

	public void setTotalSafeTestSample(long totalSafeTestSample) {
		_totalSafeTestSample = totalSafeTestSample;
	}

	public long getTotalEmissionTestSample() {
		return _totalEmissionTestSample;
	}

	public void setTotalEmissionTestSample(long totalEmissionTestSample) {
		_totalEmissionTestSample = totalEmissionTestSample;
	}

	public long getTotalControlRequiredVehicle() {
		return _totalControlRequiredVehicle;
	}

	public void setTotalControlRequiredVehicle(long totalControlRequiredVehicle) {
		_totalControlRequiredVehicle = totalControlRequiredVehicle;
	}

	public long getTotalCertificate() {
		return _totalCertificate;
	}

	public void setTotalCertificate(long totalCertificate) {
		_totalCertificate = totalCertificate;
	}

	public long getTotalViolatedVehicle() {
		return _totalViolatedVehicle;
	}

	public void setTotalViolatedVehicle(long totalViolatedVehicle) {
		_totalViolatedVehicle = totalViolatedVehicle;
	}

	public long getTotalTechnicalSpec() {
		return _totalTechnicalSpec;
	}

	public void setTotalTechnicalSpec(long totalTechnicalSpec) {
		_totalTechnicalSpec = totalTechnicalSpec;
	}

	public long getProcessingState() {
		return _processingState;
	}

	public void setProcessingState(long processingState) {
		_processingState = processingState;
	}

	public long getProcessingTiming() {
		return _processingTiming;
	}

	public void setProcessingTiming(long processingTiming) {
		_processingTiming = processingTiming;
	}

	public long getDaysUptoDeadline() {
		return _daysUptoDeadline;
	}

	public void setDaysUptoDeadline(long daysUptoDeadline) {
		_daysUptoDeadline = daysUptoDeadline;
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
}