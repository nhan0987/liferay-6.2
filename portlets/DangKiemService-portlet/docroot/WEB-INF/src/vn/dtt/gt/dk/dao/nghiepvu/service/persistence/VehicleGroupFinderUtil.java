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
public class VehicleGroupFinderUtil {
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo getThtcNoiDungHoSoByVehicleGroupId(
		long vehicleGroupId) {
		return getFinder().getThtcNoiDungHoSoByVehicleGroupId(vehicleGroupId);
	}

	public static boolean deleteVehicleGroupWithRegisteredInspectionId(
		long registeredInspectionId) {
		return getFinder()
				   .deleteVehicleGroupWithRegisteredInspectionId(registeredInspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByIdHoSoThuTuc(
		long idHoSoThuTuc) {
		return getFinder().findByIdHoSoThuTuc(idHoSoThuTuc);
	}

	public static VehicleGroupFinder getFinder() {
		if (_finder == null) {
			_finder = (VehicleGroupFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleGroupFinder.class.getName());

			ReferenceRegistry.registerReference(VehicleGroupFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VehicleGroupFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VehicleGroupFinderUtil.class,
			"_finder");
	}

	private static VehicleGroupFinder _finder;
}