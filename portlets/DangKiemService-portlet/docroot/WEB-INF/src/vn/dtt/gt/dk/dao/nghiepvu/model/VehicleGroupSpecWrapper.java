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
 * This class is a wrapper for {@link VehicleGroupSpec}.
 * </p>
 *
 * @author huymq
 * @see VehicleGroupSpec
 * @generated
 */
public class VehicleGroupSpecWrapper implements VehicleGroupSpec,
	ModelWrapper<VehicleGroupSpec> {
	public VehicleGroupSpecWrapper(VehicleGroupSpec vehicleGroupSpec) {
		_vehicleGroupSpec = vehicleGroupSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return VehicleGroupSpec.class;
	}

	@Override
	public String getModelClassName() {
		return VehicleGroupSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specificationValue", getSpecificationValue());

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
	}

	/**
	* Returns the primary key of this vehicle group spec.
	*
	* @return the primary key of this vehicle group spec
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicleGroupSpec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle group spec.
	*
	* @param primaryKey the primary key of this vehicle group spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicleGroupSpec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this vehicle group spec.
	*
	* @return the ID of this vehicle group spec
	*/
	@Override
	public long getId() {
		return _vehicleGroupSpec.getId();
	}

	/**
	* Sets the ID of this vehicle group spec.
	*
	* @param id the ID of this vehicle group spec
	*/
	@Override
	public void setId(long id) {
		_vehicleGroupSpec.setId(id);
	}

	/**
	* Returns the vehicle group ID of this vehicle group spec.
	*
	* @return the vehicle group ID of this vehicle group spec
	*/
	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupSpec.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this vehicle group spec.
	*
	* @param vehicleGroupId the vehicle group ID of this vehicle group spec
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupSpec.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the specification code of this vehicle group spec.
	*
	* @return the specification code of this vehicle group spec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _vehicleGroupSpec.getSpecificationCode();
	}

	/**
	* Sets the specification code of this vehicle group spec.
	*
	* @param specificationCode the specification code of this vehicle group spec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_vehicleGroupSpec.setSpecificationCode(specificationCode);
	}

	/**
	* Returns the specification name of this vehicle group spec.
	*
	* @return the specification name of this vehicle group spec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _vehicleGroupSpec.getSpecificationName();
	}

	/**
	* Sets the specification name of this vehicle group spec.
	*
	* @param specificationName the specification name of this vehicle group spec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_vehicleGroupSpec.setSpecificationName(specificationName);
	}

	/**
	* Returns the specification value of this vehicle group spec.
	*
	* @return the specification value of this vehicle group spec
	*/
	@Override
	public java.lang.String getSpecificationValue() {
		return _vehicleGroupSpec.getSpecificationValue();
	}

	/**
	* Sets the specification value of this vehicle group spec.
	*
	* @param specificationValue the specification value of this vehicle group spec
	*/
	@Override
	public void setSpecificationValue(java.lang.String specificationValue) {
		_vehicleGroupSpec.setSpecificationValue(specificationValue);
	}

	@Override
	public boolean isNew() {
		return _vehicleGroupSpec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicleGroupSpec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicleGroupSpec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicleGroupSpec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicleGroupSpec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicleGroupSpec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicleGroupSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicleGroupSpec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicleGroupSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicleGroupSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicleGroupSpec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleGroupSpecWrapper((VehicleGroupSpec)_vehicleGroupSpec.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec vehicleGroupSpec) {
		return _vehicleGroupSpec.compareTo(vehicleGroupSpec);
	}

	@Override
	public int hashCode() {
		return _vehicleGroupSpec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec> toCacheModel() {
		return _vehicleGroupSpec.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec toEscapedModel() {
		return new VehicleGroupSpecWrapper(_vehicleGroupSpec.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec toUnescapedModel() {
		return new VehicleGroupSpecWrapper(_vehicleGroupSpec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicleGroupSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicleGroupSpec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicleGroupSpec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleGroupSpecWrapper)) {
			return false;
		}

		VehicleGroupSpecWrapper vehicleGroupSpecWrapper = (VehicleGroupSpecWrapper)obj;

		if (Validator.equals(_vehicleGroupSpec,
					vehicleGroupSpecWrapper._vehicleGroupSpec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VehicleGroupSpec getWrappedVehicleGroupSpec() {
		return _vehicleGroupSpec;
	}

	@Override
	public VehicleGroupSpec getWrappedModel() {
		return _vehicleGroupSpec;
	}

	@Override
	public void resetOriginalValues() {
		_vehicleGroupSpec.resetOriginalValues();
	}

	private VehicleGroupSpec _vehicleGroupSpec;
}