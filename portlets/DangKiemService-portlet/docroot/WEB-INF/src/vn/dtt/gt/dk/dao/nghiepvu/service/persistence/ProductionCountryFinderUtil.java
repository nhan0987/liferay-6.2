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
public class ProductionCountryFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByArrayCountryCode(
		java.lang.String arrayCountryCode) {
		return getFinder().findByArrayCountryCode(arrayCountryCode);
	}

	public static boolean deleteProductionCountry(long vehicleGroupId) {
		return getFinder().deleteProductionCountry(vehicleGroupId);
	}

	public static ProductionCountryFinder getFinder() {
		if (_finder == null) {
			_finder = (ProductionCountryFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ProductionCountryFinder.class.getName());

			ReferenceRegistry.registerReference(ProductionCountryFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ProductionCountryFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ProductionCountryFinderUtil.class,
			"_finder");
	}

	private static ProductionCountryFinder _finder;
}