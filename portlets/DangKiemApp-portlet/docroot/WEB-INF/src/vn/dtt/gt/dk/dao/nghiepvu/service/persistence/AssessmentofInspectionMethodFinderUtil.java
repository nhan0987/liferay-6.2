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
public class AssessmentofInspectionMethodFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findByAssessmentYear_EvaluationPeriod(
		java.lang.String assessmentyear, java.lang.String evaluationperiod,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByAssessmentYear_EvaluationPeriod(assessmentyear,
			evaluationperiod, start, end);
	}

	public static int countByAssessmentYear_EvaluationPeriod(
		java.lang.String assessmentyear, java.lang.String evaluationperiod)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByAssessmentYear_EvaluationPeriod(assessmentyear,
			evaluationperiod);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findByA1Mark_A301Mark(
		double A1Mark, double A301Mark, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByA1Mark_A301Mark(A1Mark, A301Mark, assessmentid,
			assessmentyear, start, end);
	}

	public static int countByA1Mark_A301Mark(double A1Mark, double A301Mark,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByA1Mark_A301Mark(A1Mark, A301Mark, assessmentid,
			assessmentyear);
	}

	public static AssessmentofInspectionMethodFinder getFinder() {
		if (_finder == null) {
			_finder = (AssessmentofInspectionMethodFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofInspectionMethodFinder.class.getName());

			ReferenceRegistry.registerReference(AssessmentofInspectionMethodFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AssessmentofInspectionMethodFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AssessmentofInspectionMethodFinderUtil.class,
			"_finder");
	}

	private static AssessmentofInspectionMethodFinder _finder;
}