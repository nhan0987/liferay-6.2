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

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;

import vn.dtt.gt.dk.dao.common.model.DmDataGroup;
import vn.dtt.gt.dk.dao.common.service.base.DmDataGroupServiceBaseImpl;

/**
 * The implementation of the dm data group remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.DmDataGroupService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataGroupServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.DmDataGroupServiceUtil
 */
public class DmDataGroupServiceImpl extends DmDataGroupServiceBaseImpl {
	
	@JSONWebService(value = "count_dm_datagroup", method = "GET")
	public int countDmDataGroup() 
		throws SystemException {
		
		return dmDataGroupPersistence.countAll();
	}
	
	@JSONWebService(value = "fetch_dm_datagroup", method = "GET")
	public DmDataGroup getByCode(String code) 
		throws SystemException, PortalException {
		
		return dmDataGroupPersistence.findByCode(code);
	}
	
	@JSONWebService(value = "get_dm_datagroup", method = "GET")
	public List<DmDataGroup> getDmDataGroups(int start, int end) 
		throws SystemException {
		
		return dmDataGroupPersistence.findAll(start, end);
	}
}