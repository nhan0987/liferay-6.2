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

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.api.bean.CertificateXCG;
import vn.dtt.gt.dk.api.bean.CertificateXMY;
import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CertificateRecordServiceBaseImpl;

/**
 * The implementation of the certificate record remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CertificateRecordServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordServiceUtil
 */
public class CertificateRecordServiceImpl
	extends CertificateRecordServiceBaseImpl {
	
	@JSONWebService(value = "get_certificaterecord", method = "GET")
	public Object getCertificateRecord(String certificatenumber, String vehicleclass) {
		
		if(_log.isInfoEnabled()) {
			_log.info("===getCertificateRecord===" + certificatenumber + "_" + vehicleclass);
		}
		
		Object object = null;
		
		try {
			ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
			
			if("xmy".equalsIgnoreCase(vehicleclass)) {
				object = certificateRecordFinder.
					findCertificateXMY(serviceContext.getCompanyId(), certificatenumber, serviceContext);
				
			} else if("xcg".equalsIgnoreCase(vehicleclass)) {
				object = certificateRecordFinder.
					findCertificateXCG(serviceContext.getCompanyId(), certificatenumber, serviceContext);
			}
		} catch(Exception e) {
			_log.error(e);
		}
		
		return object;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(CertificateRecordServiceImpl.class);
}