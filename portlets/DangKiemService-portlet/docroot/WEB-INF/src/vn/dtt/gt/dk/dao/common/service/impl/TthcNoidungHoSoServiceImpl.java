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

package vn.dtt.gt.dk.dao.common.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead;
import vn.dtt.gt.dk.dao.common.service.base.TthcNoidungHoSoServiceBaseImpl;

/**
 * The implementation of the tthc noidung ho so remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcNoidungHoSoServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoServiceUtil
 */
public class TthcNoidungHoSoServiceImpl extends TthcNoidungHoSoServiceBaseImpl {
	
	@JSONWebService(value = "get_by_hosothutucid", method = "GET")
	public List<TthcNoidungHoSoRead> getByHoSoThuTucIds(long[] hosothutucids) 
		throws SystemException, PortalException {
		
		if(_log.isDebugEnabled()) {
			_log.debug("===get_by_hosothutucid===BEGIN");
			_log.debug(hosothutucids);
		}
		
		ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
		
		List<TthcNoidungHoSoRead> list = new ArrayList<TthcNoidungHoSoRead>();
		
		if(hosothutucids != null && hosothutucids.length > 0) {
			List<TthcNoidungHoSoRead> results = tthcNoidungHoSoFinder.findByHoSoThuTucIds(
				hosothutucids, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			for(TthcNoidungHoSoRead noiDungHoSo : results) {
				if(noiDungHoSo.getTaiLieuDinhKem() > 0) {
					noiDungHoSo.setNoiDungFile(ApiUtils.getFileFullURL(getUser().getCompanyId(), 
						noiDungHoSo.getTaiLieuDinhKem(), serviceContext));
				}
				
				list.add(noiDungHoSo);
			}
		}
		
		if(_log.isDebugEnabled()) {
			_log.debug("===get_by_hosothutucid===END");
		}
		
		return list;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoServiceImpl.class);
}