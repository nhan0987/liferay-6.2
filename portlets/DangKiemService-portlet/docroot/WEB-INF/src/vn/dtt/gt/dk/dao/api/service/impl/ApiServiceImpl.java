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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.api.business.APIMessageBusiness;
import vn.dtt.gt.dk.api.util.APIConstants;
import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.api.model.Api;
import vn.dtt.gt.dk.dao.api.service.base.ApiServiceBaseImpl;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;

/**
 * The implementation of the api remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.api.service.ApiService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.api.service.base.ApiServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.api.service.ApiServiceUtil
 */
public class ApiServiceImpl extends ApiServiceBaseImpl {
	@JSONWebService(value = "user_authenticate", method = "POST")
	public JSONObject userAuthenticate(String username, String password) 
		throws PortalException, SystemException {
		
		ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		int code = APIConstants.API_CODE_ERROR;
		String message = StringPool.BLANK;

		try {
			long userAuthenticateId = userLocalService.authenticateForBasic(
					serviceContext.getCompanyId(), "emailAddress", username, password);

			if(userAuthenticateId > 0) {
				code = APIConstants.API_CODE_SUCCESS;
			} else {
				code = APIConstants.API_CODE_AUTHENTICATE_FAILED;
			}
		} catch (Exception e) {
			_log.error(e);
			message = e.getClass().getName();
		}

		result.put("code", code);
		result.put("message", message);

		return result;
	}
	
	@JSONWebService(value = "processapicode", method = "POST")
	public JSONObject processData(String apicode, String data) 
			throws SystemException, PortalException {
		
		ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
		
		// add request log
		Api apiLog = apiLocalService.addApiLog(apicode, data, serviceContext);

		JSONObject result = JSONFactoryUtil.createJSONObject();
		int code = APIConstants.API_CODE_ERROR;
		String message = StringPool.BLANK;
		String registeredNumber = StringPool.BLANK;

		try {
			int apiRequestCode = GetterUtil.getInteger(apicode);
			
			data = ApiUtils.quoteJSON(data);
			JSONObject jsonData = JSONFactoryUtil.createJSONObject(data);
			
			registeredNumber = GetterUtil.getString(jsonData.getString("RegisteredNumber"));
			
			RegisteredInspection registeredInspection = registeredInspectionPersistence.
					findByRegisteredNumber(registeredNumber);
			
			TthcHoSoThuTuc hoSoThuTuc = tthcHoSoThuTucPersistence.findByPrimaryKey(
				registeredInspection.getDossierId());
			
			if(apiRequestCode == APIConstants.API_REQUEST_CODE_104) {
				APIMessageBusiness.message104(getUserId(),
					registeredInspection, hoSoThuTuc, data);
			} else if(apiRequestCode == APIConstants.API_REQUEST_CODE_20) {
				message = APIMessageBusiness.message20(getUserId(), hoSoThuTuc, data);
			} else if(apiRequestCode == APIConstants.API_REQUEST_CODE_401) {
				APIMessageBusiness.message401(getUserId(),
						registeredInspection.getId(), hoSoThuTuc, data);
			} else if(apiRequestCode == APIConstants.API_REQUEST_CODE_203) {
				APIMessageBusiness.message203(getUserId(),
						registeredInspection.getId(), hoSoThuTuc, data);
			} else if(apiRequestCode == APIConstants.API_REQUEST_CODE_202) {
				APIMessageBusiness.message202(getUserId(),
						registeredInspection.getId(), hoSoThuTuc, data);
			} else if(apiRequestCode == APIConstants.API_REQUEST_CODE_204) {
				APIMessageBusiness.message204(getUserId(),
						registeredInspection.getId(), hoSoThuTuc, data);
			}

			code = APIConstants.API_CODE_SUCCESS;
		} catch (Exception e) {
			_log.error(e);
			message = e.getClass().getName();

			if (e instanceof JSONException) {
				code = APIConstants.API_CODE_INVALID_JSON;
			}
		}

		result.put("code", code);
		result.put("message", message);
		
		// add response log
		if(apiLog != null) {
			apiLocalService.updateApiLog(apiLog, registeredNumber, result.toString());
		}
		

		return result;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(ApiServiceImpl.class);
}