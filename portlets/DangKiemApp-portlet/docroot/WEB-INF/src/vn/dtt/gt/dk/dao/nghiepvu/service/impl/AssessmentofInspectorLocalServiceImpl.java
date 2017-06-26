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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofInspectorLocalServiceBaseImpl;

/**
 * The implementation of the assessmentof inspector local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofInspectorLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalServiceUtil
 */
public class AssessmentofInspectorLocalServiceImpl
	extends AssessmentofInspectorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalServiceUtil} to access the assessmentof inspector local service.
	 */
private static Log _log = LogFactoryUtil.getLog(AssessmentofInspectorLocalServiceImpl.class);
	
	public List<AssessmentofInspector> findByInspectorContactCode(String inspectorcontactcode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofInspectorPersistence.findByInspectorContactCode(inspectorcontactcode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofInspector>();
	}
	
	public List<AssessmentofInspector> findByInspectorName(String inspectorname, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofInspectorPersistence.findByInspectorName(inspectorname, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofInspector>();
	}
	
	public List<AssessmentofInspector> findByNextPeriodByInspectorContactCode(String inspectorcontactcode, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofInspectorPersistence.findByNextPeriodByInspectorContactCode(inspectorcontactcode, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofInspector>();
	}
	
	public List<AssessmentofInspector> findByNextPeriodByInspectorName(String inspectorname, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofInspectorPersistence.findByNextPeriodByInspectorName(inspectorname, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofInspector>();
	}
	
	public List<AssessmentofInspector> findDanhSachDanhGiaDangKiemVien(String inspectorcontactcode, String inspectorname, int start, int end) {
		
		try {
			return assessmentofInspectorFinder.findDanhSachDanhGiaDangKiemVien(inspectorcontactcode, inspectorname, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofInspector>();
	}
	
	public int countDanhSachDanhGiaDangKiemVien(String inspectorcontactcode, String inspectorname) {
		try {
			return assessmentofInspectorFinder.countDanhSachDanhGiaDangKiemVien(inspectorcontactcode, inspectorname);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}
	
}