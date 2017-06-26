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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VehicleStatistics in entity cache.
 *
 * @author win_64
 * @see VehicleStatistics
 * @generated
 */
public class VehicleStatisticsCacheModel implements CacheModel<VehicleStatistics>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registeredInspectionId=");
		sb.append(registeredInspectionId);
		sb.append(", totalRegisteredVehicle=");
		sb.append(totalRegisteredVehicle);
		sb.append(", totalRequestedVehicle=");
		sb.append(totalRequestedVehicle);
		sb.append(", totalNotYetRequestedVehicle=");
		sb.append(totalNotYetRequestedVehicle);
		sb.append(", totalCancelledVehicle=");
		sb.append(totalCancelledVehicle);
		sb.append(", totalInspectedVehicle=");
		sb.append(totalInspectedVehicle);
		sb.append(", totalResolvedVehicle=");
		sb.append(totalResolvedVehicle);
		sb.append(", totalReexportedVehicle=");
		sb.append(totalReexportedVehicle);
		sb.append(", totalWrongStatusVehicle=");
		sb.append(totalWrongStatusVehicle);
		sb.append(", totalSafeTestSample=");
		sb.append(totalSafeTestSample);
		sb.append(", totalEmissionTestSample=");
		sb.append(totalEmissionTestSample);
		sb.append(", totalControlRequiredVehicle=");
		sb.append(totalControlRequiredVehicle);
		sb.append(", totalCertificate=");
		sb.append(totalCertificate);
		sb.append(", totalViolatedVehicle=");
		sb.append(totalViolatedVehicle);
		sb.append(", totalTechnicalSpec=");
		sb.append(totalTechnicalSpec);
		sb.append(", processingState=");
		sb.append(processingState);
		sb.append(", processingTiming=");
		sb.append(processingTiming);
		sb.append(", daysUptoDeadline=");
		sb.append(daysUptoDeadline);
		sb.append(", SynchDate=");
		sb.append(SynchDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehicleStatistics toEntityModel() {
		VehicleStatisticsImpl vehicleStatisticsImpl = new VehicleStatisticsImpl();

		vehicleStatisticsImpl.setId(id);
		vehicleStatisticsImpl.setRegisteredInspectionId(registeredInspectionId);
		vehicleStatisticsImpl.setTotalRegisteredVehicle(totalRegisteredVehicle);
		vehicleStatisticsImpl.setTotalRequestedVehicle(totalRequestedVehicle);
		vehicleStatisticsImpl.setTotalNotYetRequestedVehicle(totalNotYetRequestedVehicle);
		vehicleStatisticsImpl.setTotalCancelledVehicle(totalCancelledVehicle);
		vehicleStatisticsImpl.setTotalInspectedVehicle(totalInspectedVehicle);
		vehicleStatisticsImpl.setTotalResolvedVehicle(totalResolvedVehicle);
		vehicleStatisticsImpl.setTotalReexportedVehicle(totalReexportedVehicle);
		vehicleStatisticsImpl.setTotalWrongStatusVehicle(totalWrongStatusVehicle);
		vehicleStatisticsImpl.setTotalSafeTestSample(totalSafeTestSample);
		vehicleStatisticsImpl.setTotalEmissionTestSample(totalEmissionTestSample);
		vehicleStatisticsImpl.setTotalControlRequiredVehicle(totalControlRequiredVehicle);
		vehicleStatisticsImpl.setTotalCertificate(totalCertificate);
		vehicleStatisticsImpl.setTotalViolatedVehicle(totalViolatedVehicle);
		vehicleStatisticsImpl.setTotalTechnicalSpec(totalTechnicalSpec);
		vehicleStatisticsImpl.setProcessingState(processingState);
		vehicleStatisticsImpl.setProcessingTiming(processingTiming);
		vehicleStatisticsImpl.setDaysUptoDeadline(daysUptoDeadline);

		if (SynchDate == Long.MIN_VALUE) {
			vehicleStatisticsImpl.setSynchDate(null);
		}
		else {
			vehicleStatisticsImpl.setSynchDate(new Date(SynchDate));
		}

		vehicleStatisticsImpl.resetOriginalValues();

		return vehicleStatisticsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registeredInspectionId = objectInput.readLong();
		totalRegisteredVehicle = objectInput.readLong();
		totalRequestedVehicle = objectInput.readLong();
		totalNotYetRequestedVehicle = objectInput.readLong();
		totalCancelledVehicle = objectInput.readLong();
		totalInspectedVehicle = objectInput.readLong();
		totalResolvedVehicle = objectInput.readLong();
		totalReexportedVehicle = objectInput.readLong();
		totalWrongStatusVehicle = objectInput.readLong();
		totalSafeTestSample = objectInput.readLong();
		totalEmissionTestSample = objectInput.readLong();
		totalControlRequiredVehicle = objectInput.readLong();
		totalCertificate = objectInput.readLong();
		totalViolatedVehicle = objectInput.readLong();
		totalTechnicalSpec = objectInput.readLong();
		processingState = objectInput.readLong();
		processingTiming = objectInput.readLong();
		daysUptoDeadline = objectInput.readLong();
		SynchDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(registeredInspectionId);
		objectOutput.writeLong(totalRegisteredVehicle);
		objectOutput.writeLong(totalRequestedVehicle);
		objectOutput.writeLong(totalNotYetRequestedVehicle);
		objectOutput.writeLong(totalCancelledVehicle);
		objectOutput.writeLong(totalInspectedVehicle);
		objectOutput.writeLong(totalResolvedVehicle);
		objectOutput.writeLong(totalReexportedVehicle);
		objectOutput.writeLong(totalWrongStatusVehicle);
		objectOutput.writeLong(totalSafeTestSample);
		objectOutput.writeLong(totalEmissionTestSample);
		objectOutput.writeLong(totalControlRequiredVehicle);
		objectOutput.writeLong(totalCertificate);
		objectOutput.writeLong(totalViolatedVehicle);
		objectOutput.writeLong(totalTechnicalSpec);
		objectOutput.writeLong(processingState);
		objectOutput.writeLong(processingTiming);
		objectOutput.writeLong(daysUptoDeadline);
		objectOutput.writeLong(SynchDate);
	}

	public long id;
	public long registeredInspectionId;
	public long totalRegisteredVehicle;
	public long totalRequestedVehicle;
	public long totalNotYetRequestedVehicle;
	public long totalCancelledVehicle;
	public long totalInspectedVehicle;
	public long totalResolvedVehicle;
	public long totalReexportedVehicle;
	public long totalWrongStatusVehicle;
	public long totalSafeTestSample;
	public long totalEmissionTestSample;
	public long totalControlRequiredVehicle;
	public long totalCertificate;
	public long totalViolatedVehicle;
	public long totalTechnicalSpec;
	public long processingState;
	public long processingTiming;
	public long daysUptoDeadline;
	public long SynchDate;
}