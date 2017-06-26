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

package vn.dtt.gt.dk.dao.nghiepvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofInspectionMethodLocalServiceBaseImpl;

/**
 * The implementation of the assessmentof inspection method local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofInspectionMethodLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil
 */
public class AssessmentofInspectionMethodLocalServiceImpl
	extends AssessmentofInspectionMethodLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil} to access the assessmentof inspection method local service.
	 */
	
	public List<AssessmentofInspectionMethod> findByAssessmentYear_EvaluationPeriod(String assessmentyear, String evaluationperiod, int start, int end) {
		try {
			return assessmentofInspectionMethodFinder.findByAssessmentYear_EvaluationPeriod(assessmentyear, evaluationperiod, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofInspectionMethod>();
	}
	
	public int countByAssessmentYear_EvaluationPeriod(String assessmentyear, String evaluationperiod) {
		try {
			return assessmentofInspectionMethodFinder.countByAssessmentYear_EvaluationPeriod(assessmentyear, evaluationperiod);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}
	
	public List<AssessmentofInspectionMethod> findByA1Mark_A301Mark(
			double A1Mark, double A301Mark, String assessmentid,
			String assessmentyear, int start, int end) {
		try {
			return assessmentofInspectionMethodFinder.findByA1Mark_A301Mark(
						A1Mark, A301Mark, assessmentid, assessmentyear, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofInspectionMethod>();
	}
	
	public int countByA1Mark_A301Mark(
			double A1Mark, double A301Mark, String assessmentid,
			String assessmentyear) {
		try {
			return assessmentofInspectionMethodFinder.countByA1Mark_A301Mark(
					A1Mark, A301Mark, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}
	
	private static Log _log = LogFactoryUtil.getLog(AssessmentofInspectionMethodLocalServiceImpl.class);
}