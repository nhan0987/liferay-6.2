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

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionRecordAttachServiceBaseImpl;

/**
 * The implementation of the inspection record attach remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionRecordAttachServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachServiceUtil
 */
public class InspectionRecordAttachServiceImpl
	extends InspectionRecordAttachServiceBaseImpl {
	
	@JSONWebService(value = "get_by_hosothutucid", method = "GET")
	public List<InspectionRecordAttach> getByHoSoThuTucIds(long[] hosothutucids) 
		throws SystemException, PortalException {
		
		ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
		
		List<InspectionRecordAttach> list = new ArrayList<InspectionRecordAttach>();
		
		if(hosothutucids != null && hosothutucids.length > 0) {
			List<InspectionRecordAttach> results = inspectionRecordAttachFinder.findByHoSoThuTucIds(
				hosothutucids, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			for(InspectionRecordAttach inspectionRecordAttach : results) {
				long entryId = GetterUtil.getLong(inspectionRecordAttach.getEnTryId());
				if(entryId > 0) {
					inspectionRecordAttach.setEnTryId(ApiUtils.getFileFullURL(getUser().getCompanyId(), 
							entryId, serviceContext));
				}
				
				list.add(inspectionRecordAttach);
			}
		}
		
		return list;
	}
}