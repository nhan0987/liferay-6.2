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

package vn.dtt.gt.dk.dao.api.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.api.model.Api;
import vn.dtt.gt.dk.dao.api.service.base.ApiLocalServiceBaseImpl;

/**
 * The implementation of the api local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.api.service.ApiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.api.service.base.ApiLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.api.service.ApiLocalServiceUtil
 */
public class ApiLocalServiceImpl extends ApiLocalServiceBaseImpl {
	
	public Api addApiLog(String code, String request, ServiceContext serviceContext) {
		
		Api apiLog = null;
				
		try {
			long id = counterLocalService.increment(Api.class.getName());
			
			apiLog = apiPersistence.create(id);
			
			Date now = new Date();
			
			apiLog.setCreateDate(now);
			apiLog.setModifiedDate(now);
			apiLog.setCode(code);
			apiLog.setRequest(request);
			apiLog.setUserAgent(serviceContext.getUserAgent());
			apiLog.setIp(serviceContext.getRemoteAddr());
			
			apiLog = apiPersistence.update(apiLog);
		} catch(Exception e) {
			_log.error(e);
		}
		
		return apiLog;
	}
	
	public Api updateApiLog(Api apiLog, String response) {
		
		return updateApiLog(apiLog, "", response);
	}
	
	public Api updateApiLog(Api apiLog, String registeredNumber, String response) {
		
		if(apiLog != null) {
			try {
				Date now = new Date();
				
				apiLog.setModifiedDate(now);
				apiLog.setRegisteredNumber(registeredNumber);
				apiLog.setResponse(response);
				
				apiLog = apiPersistence.update(apiLog);
			} catch(Exception e) {
				_log.error(e);
			}
		}
		
		return apiLog;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(ApiLocalServiceImpl.class);
}