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
public class AssessmentofProductFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findDanhSachDanhGiaSanPham(
		java.lang.String productcode, java.lang.String productname, int start,
		int end) {
		return getFinder()
				   .findDanhSachDanhGiaSanPham(productcode, productname, start,
			end);
	}

	public static int countDanhSachDanhGiaSanPham(
		java.lang.String productcode, java.lang.String productname)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDanhSachDanhGiaSanPham(productcode, productname);
	}

	public static AssessmentofProductFinder getFinder() {
		if (_finder == null) {
			_finder = (AssessmentofProductFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofProductFinder.class.getName());

			ReferenceRegistry.registerReference(AssessmentofProductFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AssessmentofProductFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AssessmentofProductFinderUtil.class,
			"_finder");
	}

	private static AssessmentofProductFinder _finder;
}