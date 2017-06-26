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
public class AssessmentofImporterControlFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findDanhSachKiemSoatDoanhNghiep(
		java.lang.String importercode, java.lang.String importername,
		int start, int end) {
		return getFinder()
				   .findDanhSachKiemSoatDoanhNghiep(importercode, importername,
			start, end);
	}

	public static int countDanhSachKiemSoatDoanhNghiep(
		java.lang.String importercode, java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachKiemSoatDoanhNghiep(importercode, importername);
	}

	public static AssessmentofImporterControlFinder getFinder() {
		if (_finder == null) {
			_finder = (AssessmentofImporterControlFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofImporterControlFinder.class.getName());

			ReferenceRegistry.registerReference(AssessmentofImporterControlFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AssessmentofImporterControlFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AssessmentofImporterControlFinderUtil.class,
			"_finder");
	}

	private static AssessmentofImporterControlFinder _finder;
}