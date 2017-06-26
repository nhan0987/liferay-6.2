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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VehicleStatistics}.
 * </p>
 *
 * @author win_64
 * @see VehicleStatistics
 * @generated
 */
public class VehicleStatisticsWrapper implements VehicleStatistics,
	ModelWrapper<VehicleStatistics> {
	public VehicleStatisticsWrapper(VehicleStatistics vehicleStatistics) {
		_vehicleStatistics = vehicleStatistics;
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
	}

	/**
	* Returns the primary key of this vehicle statistics.
	*
	* @return the primary key of this vehicle statistics
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicleStatistics.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle statistics.
	*
	* @param primaryKey the primary key of this vehicle statistics
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicleStatistics.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehicle statistics.
	*
	* @return the ID of this vehicle statistics
	*/
	@Override
	public long getId() {
		return _vehicleStatistics.getId();
	}

	/**
	* Sets the ID of this vehicle statistics.
	*
	* @param id the ID of this vehicle statistics
	*/
	@Override
	public void setId(long id) {
		_vehicleStatistics.setId(id);
	}

	/**
	* Returns the registered inspection ID of this vehicle statistics.
	*
	* @return the registered inspection ID of this vehicle statistics
	*/
	@Override
	public long getRegisteredInspectionId() {
		return _vehicleStatistics.getRegisteredInspectionId();
	}

	/**
	* Sets the registered inspection ID of this vehicle statistics.
	*
	* @param registeredInspectionId the registered inspection ID of this vehicle statistics
	*/
	@Override
	public void setRegisteredInspectionId(long registeredInspectionId) {
		_vehicleStatistics.setRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the total registered vehicle of this vehicle statistics.
	*
	* @return the total registered vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalRegisteredVehicle() {
		return _vehicleStatistics.getTotalRegisteredVehicle();
	}

	/**
	* Sets the total registered vehicle of this vehicle statistics.
	*
	* @param totalRegisteredVehicle the total registered vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalRegisteredVehicle(long totalRegisteredVehicle) {
		_vehicleStatistics.setTotalRegisteredVehicle(totalRegisteredVehicle);
	}

	/**
	* Returns the total requested vehicle of this vehicle statistics.
	*
	* @return the total requested vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalRequestedVehicle() {
		return _vehicleStatistics.getTotalRequestedVehicle();
	}

	/**
	* Sets the total requested vehicle of this vehicle statistics.
	*
	* @param totalRequestedVehicle the total requested vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalRequestedVehicle(long totalRequestedVehicle) {
		_vehicleStatistics.setTotalRequestedVehicle(totalRequestedVehicle);
	}

	/**
	* Returns the total not yet requested vehicle of this vehicle statistics.
	*
	* @return the total not yet requested vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalNotYetRequestedVehicle() {
		return _vehicleStatistics.getTotalNotYetRequestedVehicle();
	}

	/**
	* Sets the total not yet requested vehicle of this vehicle statistics.
	*
	* @param totalNotYetRequestedVehicle the total not yet requested vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalNotYetRequestedVehicle(long totalNotYetRequestedVehicle) {
		_vehicleStatistics.setTotalNotYetRequestedVehicle(totalNotYetRequestedVehicle);
	}

	/**
	* Returns the total cancelled vehicle of this vehicle statistics.
	*
	* @return the total cancelled vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalCancelledVehicle() {
		return _vehicleStatistics.getTotalCancelledVehicle();
	}

	/**
	* Sets the total cancelled vehicle of this vehicle statistics.
	*
	* @param totalCancelledVehicle the total cancelled vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalCancelledVehicle(long totalCancelledVehicle) {
		_vehicleStatistics.setTotalCancelledVehicle(totalCancelledVehicle);
	}

	/**
	* Returns the total inspected vehicle of this vehicle statistics.
	*
	* @return the total inspected vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalInspectedVehicle() {
		return _vehicleStatistics.getTotalInspectedVehicle();
	}

	/**
	* Sets the total inspected vehicle of this vehicle statistics.
	*
	* @param totalInspectedVehicle the total inspected vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalInspectedVehicle(long totalInspectedVehicle) {
		_vehicleStatistics.setTotalInspectedVehicle(totalInspectedVehicle);
	}

	/**
	* Returns the total resolved vehicle of this vehicle statistics.
	*
	* @return the total resolved vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalResolvedVehicle() {
		return _vehicleStatistics.getTotalResolvedVehicle();
	}

	/**
	* Sets the total resolved vehicle of this vehicle statistics.
	*
	* @param totalResolvedVehicle the total resolved vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalResolvedVehicle(long totalResolvedVehicle) {
		_vehicleStatistics.setTotalResolvedVehicle(totalResolvedVehicle);
	}

	/**
	* Returns the total reexported vehicle of this vehicle statistics.
	*
	* @return the total reexported vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalReexportedVehicle() {
		return _vehicleStatistics.getTotalReexportedVehicle();
	}

	/**
	* Sets the total reexported vehicle of this vehicle statistics.
	*
	* @param totalReexportedVehicle the total reexported vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalReexportedVehicle(long totalReexportedVehicle) {
		_vehicleStatistics.setTotalReexportedVehicle(totalReexportedVehicle);
	}

	/**
	* Returns the total wrong status vehicle of this vehicle statistics.
	*
	* @return the total wrong status vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalWrongStatusVehicle() {
		return _vehicleStatistics.getTotalWrongStatusVehicle();
	}

	/**
	* Sets the total wrong status vehicle of this vehicle statistics.
	*
	* @param totalWrongStatusVehicle the total wrong status vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalWrongStatusVehicle(long totalWrongStatusVehicle) {
		_vehicleStatistics.setTotalWrongStatusVehicle(totalWrongStatusVehicle);
	}

	/**
	* Returns the total safe test sample of this vehicle statistics.
	*
	* @return the total safe test sample of this vehicle statistics
	*/
	@Override
	public long getTotalSafeTestSample() {
		return _vehicleStatistics.getTotalSafeTestSample();
	}

	/**
	* Sets the total safe test sample of this vehicle statistics.
	*
	* @param totalSafeTestSample the total safe test sample of this vehicle statistics
	*/
	@Override
	public void setTotalSafeTestSample(long totalSafeTestSample) {
		_vehicleStatistics.setTotalSafeTestSample(totalSafeTestSample);
	}

	/**
	* Returns the total emission test sample of this vehicle statistics.
	*
	* @return the total emission test sample of this vehicle statistics
	*/
	@Override
	public long getTotalEmissionTestSample() {
		return _vehicleStatistics.getTotalEmissionTestSample();
	}

	/**
	* Sets the total emission test sample of this vehicle statistics.
	*
	* @param totalEmissionTestSample the total emission test sample of this vehicle statistics
	*/
	@Override
	public void setTotalEmissionTestSample(long totalEmissionTestSample) {
		_vehicleStatistics.setTotalEmissionTestSample(totalEmissionTestSample);
	}

	/**
	* Returns the total control required vehicle of this vehicle statistics.
	*
	* @return the total control required vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalControlRequiredVehicle() {
		return _vehicleStatistics.getTotalControlRequiredVehicle();
	}

	/**
	* Sets the total control required vehicle of this vehicle statistics.
	*
	* @param totalControlRequiredVehicle the total control required vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalControlRequiredVehicle(long totalControlRequiredVehicle) {
		_vehicleStatistics.setTotalControlRequiredVehicle(totalControlRequiredVehicle);
	}

	/**
	* Returns the total certificate of this vehicle statistics.
	*
	* @return the total certificate of this vehicle statistics
	*/
	@Override
	public long getTotalCertificate() {
		return _vehicleStatistics.getTotalCertificate();
	}

	/**
	* Sets the total certificate of this vehicle statistics.
	*
	* @param totalCertificate the total certificate of this vehicle statistics
	*/
	@Override
	public void setTotalCertificate(long totalCertificate) {
		_vehicleStatistics.setTotalCertificate(totalCertificate);
	}

	/**
	* Returns the total violated vehicle of this vehicle statistics.
	*
	* @return the total violated vehicle of this vehicle statistics
	*/
	@Override
	public long getTotalViolatedVehicle() {
		return _vehicleStatistics.getTotalViolatedVehicle();
	}

	/**
	* Sets the total violated vehicle of this vehicle statistics.
	*
	* @param totalViolatedVehicle the total violated vehicle of this vehicle statistics
	*/
	@Override
	public void setTotalViolatedVehicle(long totalViolatedVehicle) {
		_vehicleStatistics.setTotalViolatedVehicle(totalViolatedVehicle);
	}

	/**
	* Returns the total technical spec of this vehicle statistics.
	*
	* @return the total technical spec of this vehicle statistics
	*/
	@Override
	public long getTotalTechnicalSpec() {
		return _vehicleStatistics.getTotalTechnicalSpec();
	}

	/**
	* Sets the total technical spec of this vehicle statistics.
	*
	* @param totalTechnicalSpec the total technical spec of this vehicle statistics
	*/
	@Override
	public void setTotalTechnicalSpec(long totalTechnicalSpec) {
		_vehicleStatistics.setTotalTechnicalSpec(totalTechnicalSpec);
	}

	/**
	* Returns the processing state of this vehicle statistics.
	*
	* @return the processing state of this vehicle statistics
	*/
	@Override
	public long getProcessingState() {
		return _vehicleStatistics.getProcessingState();
	}

	/**
	* Sets the processing state of this vehicle statistics.
	*
	* @param processingState the processing state of this vehicle statistics
	*/
	@Override
	public void setProcessingState(long processingState) {
		_vehicleStatistics.setProcessingState(processingState);
	}

	/**
	* Returns the processing timing of this vehicle statistics.
	*
	* @return the processing timing of this vehicle statistics
	*/
	@Override
	public long getProcessingTiming() {
		return _vehicleStatistics.getProcessingTiming();
	}

	/**
	* Sets the processing timing of this vehicle statistics.
	*
	* @param processingTiming the processing timing of this vehicle statistics
	*/
	@Override
	public void setProcessingTiming(long processingTiming) {
		_vehicleStatistics.setProcessingTiming(processingTiming);
	}

	/**
	* Returns the days upto deadline of this vehicle statistics.
	*
	* @return the days upto deadline of this vehicle statistics
	*/
	@Override
	public long getDaysUptoDeadline() {
		return _vehicleStatistics.getDaysUptoDeadline();
	}

	/**
	* Sets the days upto deadline of this vehicle statistics.
	*
	* @param daysUptoDeadline the days upto deadline of this vehicle statistics
	*/
	@Override
	public void setDaysUptoDeadline(long daysUptoDeadline) {
		_vehicleStatistics.setDaysUptoDeadline(daysUptoDeadline);
	}

	@Override
	public boolean isNew() {
		return _vehicleStatistics.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicleStatistics.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicleStatistics.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicleStatistics.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicleStatistics.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicleStatistics.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicleStatistics.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicleStatistics.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicleStatistics.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicleStatistics.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicleStatistics.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleStatisticsWrapper((VehicleStatistics)_vehicleStatistics.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics vehicleStatistics) {
		return _vehicleStatistics.compareTo(vehicleStatistics);
	}

	@Override
	public int hashCode() {
		return _vehicleStatistics.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics> toCacheModel() {
		return _vehicleStatistics.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics toEscapedModel() {
		return new VehicleStatisticsWrapper(_vehicleStatistics.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics toUnescapedModel() {
		return new VehicleStatisticsWrapper(_vehicleStatistics.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicleStatistics.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicleStatistics.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicleStatistics.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleStatisticsWrapper)) {
			return false;
		}

		VehicleStatisticsWrapper vehicleStatisticsWrapper = (VehicleStatisticsWrapper)obj;

		if (Validator.equals(_vehicleStatistics,
					vehicleStatisticsWrapper._vehicleStatistics)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehicleStatistics getWrappedVehicleStatistics() {
		return _vehicleStatistics;
	}

	@Override
	public VehicleStatistics getWrappedModel() {
		return _vehicleStatistics;
	}

	@Override
	public void resetOriginalValues() {
		_vehicleStatistics.resetOriginalValues();
	}

	private VehicleStatistics _vehicleStatistics;
}