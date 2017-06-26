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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author huymq
 */
public class VehicleSpecificationFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> finderVehicleSpecificationWithVehicleGroupId(
		long vehiclegroupid) {
		return getFinder()
				   .finderVehicleSpecificationWithVehicleGroupId(vehiclegroupid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(
		long vehiclegroupid, java.lang.String vehicleClass,
		java.lang.String vehicleType) {
		return getFinder()
				   .findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehiclegroupid,
			vehicleClass, vehicleType);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(
		long vehicleGroupId, java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String vehicleTypeCode,
		java.lang.String specCategory, long congThucBanhXeId) {
		return getFinder()
				   .findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupId,
			vehicleClass, vehicleType, vehicleTypeCode, specCategory,
			congThucBanhXeId);
	}

	public static boolean deleteVehicleSpecificationInitialWithVehicleGroupId(
		long vehicleGroupId) {
		return getFinder()
				   .deleteVehicleSpecificationInitialWithVehicleGroupId(vehicleGroupId);
	}

	public static VehicleSpecificationFinder getFinder() {
		if (_finder == null) {
			_finder = (VehicleSpecificationFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleSpecificationFinder.class.getName());

			ReferenceRegistry.registerReference(VehicleSpecificationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VehicleSpecificationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VehicleSpecificationFinderUtil.class,
			"_finder");
	}

	private static VehicleSpecificationFinder _finder;
}