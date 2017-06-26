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
 * This class is a wrapper for {@link VehicleSpecification}.
 * </p>
 *
 * @author win_64
 * @see VehicleSpecification
 * @generated
 */
public class VehicleSpecificationWrapper implements VehicleSpecification,
	ModelWrapper<VehicleSpecification> {
	public VehicleSpecificationWrapper(
		VehicleSpecification vehicleSpecification) {
		_vehicleSpecification = vehicleSpecification;
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleSpecification.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleSpecification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("specificationVersion", getSpecificationVersion());
		attributes.put("specificationSourceCode", getSpecificationSourceCode());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());
		attributes.put("safetyTestReportId", getSafetyTestReportId());
		attributes.put("inspectionRecordId", getInspectionRecordId());
		attributes.put("specificResult", getSpecificResult());

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

		Long specificationVersion = (Long)attributes.get("specificationVersion");

		if (specificationVersion != null) {
			setSpecificationVersion(specificationVersion);
		}

		String specificationSourceCode = (String)attributes.get(
				"specificationSourceCode");

		if (specificationSourceCode != null) {
			setSpecificationSourceCode(specificationSourceCode);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specificationValue = (String)attributes.get("specificationValue");

		if (specificationValue != null) {
			setSpecificationValue(specificationValue);
		}

		Long safetyTestReportId = (Long)attributes.get("safetyTestReportId");

		if (safetyTestReportId != null) {
			setSafetyTestReportId(safetyTestReportId);
		}

		Long inspectionRecordId = (Long)attributes.get("inspectionRecordId");

		if (inspectionRecordId != null) {
			setInspectionRecordId(inspectionRecordId);
		}

		Long specificResult = (Long)attributes.get("specificResult");

		if (specificResult != null) {
			setSpecificResult(specificResult);
		}
	}

	/**
	* Returns the primary key of this vehicle specification.
	*
	* @return the primary key of this vehicle specification
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicleSpecification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle specification.
	*
	* @param primaryKey the primary key of this vehicle specification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicleSpecification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehicle specification.
	*
	* @return the ID of this vehicle specification
	*/
	@Override
	public long getId() {
		return _vehicleSpecification.getId();
	}

	/**
	* Sets the ID of this vehicle specification.
	*
	* @param id the ID of this vehicle specification
	*/
	@Override
	public void setId(long id) {
		_vehicleSpecification.setId(id);
	}

	/**
	* Returns the vehicle group ID of this vehicle specification.
	*
	* @return the vehicle group ID of this vehicle specification
	*/
	@Override
	public long getVehicleGroupId() {
		return _vehicleSpecification.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this vehicle specification.
	*
	* @param vehicleGroupId the vehicle group ID of this vehicle specification
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleSpecification.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the specification version of this vehicle specification.
	*
	* @return the specification version of this vehicle specification
	*/
	@Override
	public long getSpecificationVersion() {
		return _vehicleSpecification.getSpecificationVersion();
	}

	/**
	* Sets the specification version of this vehicle specification.
	*
	* @param specificationVersion the specification version of this vehicle specification
	*/
	@Override
	public void setSpecificationVersion(long specificationVersion) {
		_vehicleSpecification.setSpecificationVersion(specificationVersion);
	}

	/**
	* Returns the specification source code of this vehicle specification.
	*
	* @return the specification source code of this vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationSourceCode() {
		return _vehicleSpecification.getSpecificationSourceCode();
	}

	/**
	* Sets the specification source code of this vehicle specification.
	*
	* @param specificationSourceCode the specification source code of this vehicle specification
	*/
	@Override
	public void setSpecificationSourceCode(
		java.lang.String specificationSourceCode) {
		_vehicleSpecification.setSpecificationSourceCode(specificationSourceCode);
	}

	/**
	* Returns the specification code of this vehicle specification.
	*
	* @return the specification code of this vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _vehicleSpecification.getSpecificationCode();
	}

	/**
	* Sets the specification code of this vehicle specification.
	*
	* @param specificationCode the specification code of this vehicle specification
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_vehicleSpecification.setSpecificationCode(specificationCode);
	}

	/**
	* Returns the specification name of this vehicle specification.
	*
	* @return the specification name of this vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _vehicleSpecification.getSpecificationName();
	}

	/**
	* Sets the specification name of this vehicle specification.
	*
	* @param specificationName the specification name of this vehicle specification
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_vehicleSpecification.setSpecificationName(specificationName);
	}

	/**
	* Returns the specification value of this vehicle specification.
	*
	* @return the specification value of this vehicle specification
	*/
	@Override
	public java.lang.String getSpecificationValue() {
		return _vehicleSpecification.getSpecificationValue();
	}

	/**
	* Sets the specification value of this vehicle specification.
	*
	* @param specificationValue the specification value of this vehicle specification
	*/
	@Override
	public void setSpecificationValue(java.lang.String specificationValue) {
		_vehicleSpecification.setSpecificationValue(specificationValue);
	}

	/**
	* Returns the safety test report ID of this vehicle specification.
	*
	* @return the safety test report ID of this vehicle specification
	*/
	@Override
	public long getSafetyTestReportId() {
		return _vehicleSpecification.getSafetyTestReportId();
	}

	/**
	* Sets the safety test report ID of this vehicle specification.
	*
	* @param safetyTestReportId the safety test report ID of this vehicle specification
	*/
	@Override
	public void setSafetyTestReportId(long safetyTestReportId) {
		_vehicleSpecification.setSafetyTestReportId(safetyTestReportId);
	}

	/**
	* Returns the inspection record ID of this vehicle specification.
	*
	* @return the inspection record ID of this vehicle specification
	*/
	@Override
	public long getInspectionRecordId() {
		return _vehicleSpecification.getInspectionRecordId();
	}

	/**
	* Sets the inspection record ID of this vehicle specification.
	*
	* @param inspectionRecordId the inspection record ID of this vehicle specification
	*/
	@Override
	public void setInspectionRecordId(long inspectionRecordId) {
		_vehicleSpecification.setInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the specific result of this vehicle specification.
	*
	* @return the specific result of this vehicle specification
	*/
	@Override
	public long getSpecificResult() {
		return _vehicleSpecification.getSpecificResult();
	}

	/**
	* Sets the specific result of this vehicle specification.
	*
	* @param specificResult the specific result of this vehicle specification
	*/
	@Override
	public void setSpecificResult(long specificResult) {
		_vehicleSpecification.setSpecificResult(specificResult);
	}

	@Override
	public boolean isNew() {
		return _vehicleSpecification.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicleSpecification.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicleSpecification.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicleSpecification.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicleSpecification.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicleSpecification.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicleSpecification.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicleSpecification.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicleSpecification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicleSpecification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicleSpecification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleSpecificationWrapper((VehicleSpecification)_vehicleSpecification.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification vehicleSpecification) {
		return _vehicleSpecification.compareTo(vehicleSpecification);
	}

	@Override
	public int hashCode() {
		return _vehicleSpecification.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> toCacheModel() {
		return _vehicleSpecification.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification toEscapedModel() {
		return new VehicleSpecificationWrapper(_vehicleSpecification.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification toUnescapedModel() {
		return new VehicleSpecificationWrapper(_vehicleSpecification.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicleSpecification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicleSpecification.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicleSpecification.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleSpecificationWrapper)) {
			return false;
		}

		VehicleSpecificationWrapper vehicleSpecificationWrapper = (VehicleSpecificationWrapper)obj;

		if (Validator.equals(_vehicleSpecification,
					vehicleSpecificationWrapper._vehicleSpecification)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehicleSpecification getWrappedVehicleSpecification() {
		return _vehicleSpecification;
	}

	@Override
	public VehicleSpecification getWrappedModel() {
		return _vehicleSpecification;
	}

	@Override
	public void resetOriginalValues() {
		_vehicleSpecification.resetOriginalValues();
	}

	private VehicleSpecification _vehicleSpecification;
}