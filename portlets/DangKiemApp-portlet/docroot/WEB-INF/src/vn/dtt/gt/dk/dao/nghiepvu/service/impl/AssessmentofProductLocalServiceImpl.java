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
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofProductLocalServiceBaseImpl;

/**
 * The implementation of the assessmentof product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofProductLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalServiceUtil
 */
public class AssessmentofProductLocalServiceImpl
	extends AssessmentofProductLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalServiceUtil} to access the assessmentof product local service.
	 */
private static Log _log = LogFactoryUtil.getLog(AssessmentofProductLocalServiceImpl.class);

	public List<AssessmentofProduct> findByProductCode(String productcode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByProductCode(productcode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByProductName(String productname, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByProductName(productname, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByProductCodeReference(String productcodereference, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByProductCodeReference(productcodereference, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByProductNameReference(String productnamereference, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByProductNameReference(productnamereference, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByProductDescription(String productdescription, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByProductDescription(productdescription, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	
	
	
	
	
	public List<AssessmentofProduct> findByNextPeriodByProductCode(String productcode, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByNextPeriodByProductCode(productcode, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByNextPeriodByProductName(String productname, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByNextPeriodByProductName(productname, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByNextPeriodByProductCodeReference(String productcodereference, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByNextPeriodByProductCodeReference(productcodereference, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByNextPeriodByProductNameReference(String productnamereference, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByNextPeriodByProductNameReference(productnamereference, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public List<AssessmentofProduct> findByNextPeriodByProductDescription(String productdescription, String nextassessmentid, String nextassessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByNextPeriodByProductDescription(productdescription, nextassessmentid, nextassessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	
	public List<AssessmentofProduct> findDanhSachDanhGiaSanPham(String productcode, String productname, int start, int end) {
		
		try {
			return assessmentofProductFinder.findDanhSachDanhGiaSanPham(productcode, productname, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	
	public int countDanhSachDanhGiaSanPham(String productcode, String productname) {
		try {
			return assessmentofProductFinder.countDanhSachDanhGiaSanPham(productcode, productname);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}
	
	public List<AssessmentofProduct> findByAssessmentId_AssessmentYear(String assessmentid, String assessmentyear) {
		
		try {
			return assessmentofProductPersistence.findByAI_AY(assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
}