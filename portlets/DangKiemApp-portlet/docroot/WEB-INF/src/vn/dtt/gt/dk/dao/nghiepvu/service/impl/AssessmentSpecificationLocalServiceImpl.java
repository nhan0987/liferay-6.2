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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentSpecificationLocalServiceBaseImpl;

/**
 * The implementation of the assessment specification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentSpecificationLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalServiceUtil
 */
public class AssessmentSpecificationLocalServiceImpl
	extends AssessmentSpecificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalServiceUtil} to access the assessment specification local service.
	 */
	private static Log _log = LogFactoryUtil.getLog(AssessmentSpecificationLocalServiceImpl.class);
	
	public List<AssessmentSpecification> findByImporterCode(String specificationgroupcode, String importercode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentSpecificationPersistence.findByImporterCode(specificationgroupcode, importercode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentSpecification>();
	}
	public List<AssessmentSpecification> findByInspectorContactcode(String specificationgroupcode, String inspectorcontactcode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentSpecificationPersistence.findByInspectorContactcode(specificationgroupcode, inspectorcontactcode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentSpecification>();
	}
	public List<AssessmentSpecification> findByProductionCode(String specificationgroupcode, String productioncode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentSpecificationPersistence.findByProductionCode(specificationgroupcode, productioncode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentSpecification>();
	}
	public List<AssessmentSpecification> findByImporterCodeAndSpecificationCode(String specificationgroupcode, String importercode, String specificationcode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentSpecificationPersistence.findByImporterCodeAndSpecificationCode(specificationgroupcode, importercode, specificationcode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentSpecification>();
	}
	public List<AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(String specificationgroupcode, String inspectorcontactcode, String specificationcode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentSpecificationPersistence.findByInspectorContactcodeAndSpecificationCode(specificationgroupcode, inspectorcontactcode, specificationcode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentSpecification>();
	}
	public List<AssessmentSpecification> findByProductionCodeAndSpecificationCode(String specificationgroupcode, String productioncode, String specificationcode, String assessmentid, String assessmentyear) {
		
		try {
			return assessmentSpecificationPersistence.findByProductionCodeAndSpecificationCode(specificationgroupcode, productioncode, specificationcode, assessmentid, assessmentyear);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<AssessmentSpecification>();
	}
}