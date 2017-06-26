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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.SatetyTestReportSpecLocalServiceBaseImpl;

/**
 * The implementation of the satety test report spec local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.SatetyTestReportSpecLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalServiceUtil
 */
public class SatetyTestReportSpecLocalServiceImpl
	extends SatetyTestReportSpecLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalServiceUtil} to access the satety test report spec local service.
	 */
	public List<SatetyTestReportSpec> findBySaftyTestReportId(long saftyTestReportId){
		List<SatetyTestReportSpec> result = new ArrayList<SatetyTestReportSpec>();
		
		try {
			result = satetyTestReportSpecPersistence.findBySaftyTestReportId(saftyTestReportId);
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	
	private static Log _log = LogFactoryUtil.getLog(SatetyTestReportSpecLocalServiceImpl.class);
}