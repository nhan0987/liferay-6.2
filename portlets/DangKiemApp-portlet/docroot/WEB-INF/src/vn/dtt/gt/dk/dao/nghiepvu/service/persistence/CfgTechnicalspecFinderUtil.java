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
 * @author win_64
 */
public class CfgTechnicalspecFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByLikeVehicleTypeCode(
		java.lang.String likeVehicleTypeCode, int start, int end) {
		return getFinder()
				   .findByLikeVehicleTypeCode(likeVehicleTypeCode, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByVehicleTypeCode(
		java.lang.String vehicleTypeCode) {
		return getFinder().findByVehicleTypeCode(vehicleTypeCode);
	}

	public static java.util.List<java.lang.String> getSpecCategoryByVehicleTypeCode(
		java.lang.String vehicleTypeCode) {
		return getFinder().getSpecCategoryByVehicleTypeCode(vehicleTypeCode);
	}

	public static java.util.List<java.lang.String> getSpecificationCodeBySpecCategory(
		java.lang.String[] specCategorys) {
		return getFinder().getSpecificationCodeBySpecCategory(specCategorys);
	}

	public static CfgTechnicalspecFinder getFinder() {
		if (_finder == null) {
			_finder = (CfgTechnicalspecFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CfgTechnicalspecFinder.class.getName());

			ReferenceRegistry.registerReference(CfgTechnicalspecFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CfgTechnicalspecFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CfgTechnicalspecFinderUtil.class,
			"_finder");
	}

	private static CfgTechnicalspecFinder _finder;
}