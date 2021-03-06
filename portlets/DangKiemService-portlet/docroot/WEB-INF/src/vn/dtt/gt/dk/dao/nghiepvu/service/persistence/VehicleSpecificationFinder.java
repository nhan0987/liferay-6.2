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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

/**
 * @author huymq
 */
public interface VehicleSpecificationFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> finderVehicleSpecificationWithVehicleGroupId(
		long vehiclegroupid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(
		long vehiclegroupid, java.lang.String vehicleClass,
		java.lang.String vehicleType);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(
		long vehicleGroupId, java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String vehicleTypeCode,
		java.lang.String specCategory, long congThucBanhXeId);

	public boolean deleteVehicleSpecificationInitialWithVehicleGroupId(
		long vehicleGroupId);
}