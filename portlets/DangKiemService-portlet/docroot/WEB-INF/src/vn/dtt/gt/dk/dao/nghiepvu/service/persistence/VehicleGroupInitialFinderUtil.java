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
public class VehicleGroupInitialFinderUtil {
	public static boolean deleteVehicleGroupInitialWithRegisteredInspectionId(
		long registeredInspectionId) {
		return getFinder()
				   .deleteVehicleGroupInitialWithRegisteredInspectionId(registeredInspectionId);
	}

	public static VehicleGroupInitialFinder getFinder() {
		if (_finder == null) {
			_finder = (VehicleGroupInitialFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleGroupInitialFinder.class.getName());

			ReferenceRegistry.registerReference(VehicleGroupInitialFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VehicleGroupInitialFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VehicleGroupInitialFinderUtil.class,
			"_finder");
	}

	private static VehicleGroupInitialFinder _finder;
}