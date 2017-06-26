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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException;
import vn.dtt.gt.dk.dao.common.model.DmDataGroup;
import vn.dtt.gt.dk.dao.common.service.base.DmDataGroupLocalServiceBaseImpl;

/**
 * The implementation of the dm data group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.DmDataGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataGroupLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.DmDataGroupLocalServiceUtil
 */
public class DmDataGroupLocalServiceImpl extends DmDataGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.common.service.DmDataGroupLocalServiceUtil} to access the dm data group local service.
	 */
	public DmDataGroup getByCode(String code) throws NoSuchDmDataGroupException {
		DmDataGroup result = null;
		try {
			return dmDataGroupPersistence.findByCode(code);
		} catch (SystemException e) {
			_log.error(e);
		}
		return result;
	}
	
	public List<DmDataGroup> findDmDataGroupByTenDanhMucTenAnhXa(String tenDanhMuc, String tenAnhXa, int start, int end){
		return dmDataGroupFinder.findDmDataGroupByTenDanhMucTenAnhXa(tenDanhMuc, tenAnhXa, start, end);
	}
	
	public int countDmDataGroupByTenDanhMucTenAnhXa(String tenDanhMuc, String tenAnhXa){
		return dmDataGroupFinder.countDmDataGroupByTenDanhMucTenAnhXa(tenDanhMuc, tenAnhXa);
	}
	
	private static Log _log = LogFactoryUtil.getLog(DmDataGroupLocalServiceImpl.class);
}