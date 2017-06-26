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
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofImporterControlLocalServiceBaseImpl;

/**
 * The implementation of the assessmentof importer control local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofImporterControlLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalServiceUtil
 */
public class AssessmentofImporterControlLocalServiceImpl
	extends AssessmentofImporterControlLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalServiceUtil} to access the assessmentof importer control local service.
	 */
	private static Log _log = LogFactoryUtil.getLog(AssessmentofImporterControlLocalServiceImpl.class);
	
	public List<AssessmentofImporterControl> findByImporterCode(String importercode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofImporterControlPersistence.findByImporterCode(importercode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
	public List<AssessmentofImporterControl> findByImporterCodeReference(String importercodereference, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofImporterControlPersistence.findByImporterCodeReference(importercodereference, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
	public List<AssessmentofImporterControl> findByImporterName(String importername, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofImporterControlPersistence.findByImporterName(importername, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
	
	
	
public List<AssessmentofImporterControl> findByNextPeriodByImporterCode(String importercode, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofImporterControlPersistence.findByNextPeriodByImporterCode(importercode, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
	public List<AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(String importercodereference, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofImporterControlPersistence.findByNextPeriodByImporterCodeReference(importercodereference, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
	public List<AssessmentofImporterControl> findByNextPeriodByImporterName(String importername, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofImporterControlPersistence.findByNextPeriodByImporterName(importername, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
	
	public List<AssessmentofImporterControl> findDanhSachKiemSoatDoanhNghiep(String importercode, String importername, int start, int end) {
		
		try {
			return assessmentofImporterControlFinder.findDanhSachKiemSoatDoanhNghiep(importercode, importername, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
	
	public int countDanhSachKiemSoatDoanhNghiep(String importercode, String importername) {
		try {
			return assessmentofImporterControlFinder.countDanhSachKiemSoatDoanhNghiep(importercode, importername);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}
}