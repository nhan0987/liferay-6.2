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
public class AssessmentPeriodFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findDanhSachKehoachdanhgiaruiro(
		java.lang.String assessmentyear, java.lang.String evaluationperiod,
		int start, int end) {
		return getFinder()
				   .findDanhSachKehoachdanhgiaruiro(assessmentyear,
			evaluationperiod, start, end);
	}

	public static int countDanhSachKehoachdanhgiaruiro(
		java.lang.String assessmentyear, java.lang.String evaluationperiod)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachKehoachdanhgiaruiro(assessmentyear,
			evaluationperiod);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findLatestAssessmentPeriod()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findLatestAssessmentPeriod();
	}

	public static AssessmentPeriodFinder getFinder() {
		if (_finder == null) {
			_finder = (AssessmentPeriodFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentPeriodFinder.class.getName());

			ReferenceRegistry.registerReference(AssessmentPeriodFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AssessmentPeriodFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AssessmentPeriodFinderUtil.class,
			"_finder");
	}

	private static AssessmentPeriodFinder _finder;
}