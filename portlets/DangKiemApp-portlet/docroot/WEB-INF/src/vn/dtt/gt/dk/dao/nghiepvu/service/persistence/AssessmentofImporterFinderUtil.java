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
public class AssessmentofImporterFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findDanhSachDanhGiaDoanhNghiep(
		java.lang.String importercode, java.lang.String importername,
		int start, int end) {
		return getFinder()
				   .findDanhSachDanhGiaDoanhNghiep(importercode, importername,
			start, end);
	}

	public static int countDanhSachDanhGiaDoanhNghiep(
		java.lang.String importercode, java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachDanhGiaDoanhNghiep(importercode, importername);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByIC_IN_AI_AY(
		java.lang.String importercode, java.lang.String importername,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByIC_IN_AI_AY(importercode, importername, assessmentid,
			assessmentyear, start, end);
	}

	public static int countByIC_IN_AI_AY(java.lang.String importercode,
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByIC_IN_AI_AY(importercode, importername,
			assessmentid, assessmentyear);
	}

	public static AssessmentofImporterFinder getFinder() {
		if (_finder == null) {
			_finder = (AssessmentofImporterFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofImporterFinder.class.getName());

			ReferenceRegistry.registerReference(AssessmentofImporterFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AssessmentofImporterFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AssessmentofImporterFinderUtil.class,
			"_finder");
	}

	private static AssessmentofImporterFinder _finder;
}