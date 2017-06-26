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
public class CfgLimitTechnicalSpecFinderUtil {
	public static int countBySynchDate(java.lang.String synchDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countBySynchDate(synchDate);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> findBySynchDate(
		java.lang.String synchDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findBySynchDate(synchDate, start, end);
	}

	public static CfgLimitTechnicalSpecFinder getFinder() {
		if (_finder == null) {
			_finder = (CfgLimitTechnicalSpecFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CfgLimitTechnicalSpecFinder.class.getName());

			ReferenceRegistry.registerReference(CfgLimitTechnicalSpecFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CfgLimitTechnicalSpecFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CfgLimitTechnicalSpecFinderUtil.class,
			"_finder");
	}

	private static CfgLimitTechnicalSpecFinder _finder;
}