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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentPeriodLocalServiceBaseImpl;

/**
 * The implementation of the assessment period local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentPeriodLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil
 */
public class AssessmentPeriodLocalServiceImpl
	extends AssessmentPeriodLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil} to access the assessment period local service.
	 */
	private static Log _log = LogFactoryUtil.getLog(AssessmentPeriodLocalServiceImpl.class);
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyear(String assessmentid, String assessmentyear) {
		try {
			return assessmentPeriodPersistence.findByAssessmentidAndAssessmentyear(assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentPeriod>();
	}
	
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(String assessmentid, String assessmentyear, int importerchecked) {
		try {
			return assessmentPeriodPersistence.findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid, assessmentyear, importerchecked);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentPeriod>();
	}
	
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(String assessmentid, String assessmentyear, int inspectorchecked) {
		try {
			return assessmentPeriodPersistence.findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid, assessmentyear, inspectorchecked);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentPeriod>();
	}
	
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(String assessmentid, String assessmentyear, int productionchecked) {
		try {
			return assessmentPeriodPersistence.findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid, assessmentyear, productionchecked);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentPeriod>();
	}
	
	public List<AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(String previousassessmentid, String previousassessmentyear) {
		try {
			return assessmentPeriodPersistence.findByPreviousAssessmentidAndAssessmentyear(previousassessmentid, previousassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentPeriod>();
	}
	
	public AssessmentPeriod getLatestAssessmentPeriod() {
		try {
			return assessmentPeriodFinder.findLatestAssessmentPeriod();
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public List<AssessmentPeriod> findDanhSachKehoachdanhgiaruiro(String assessmentyear, String evaluationperiod, int start, int end) {
		try {
			return assessmentPeriodFinder.findDanhSachKehoachdanhgiaruiro(assessmentyear, evaluationperiod, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public int countDanhSachKehoachdanhgiaruiro(String assessmentyear, String evaluationperiod) {
		try {
			return assessmentPeriodFinder.countDanhSachKehoachdanhgiaruiro(assessmentyear, evaluationperiod);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}
}