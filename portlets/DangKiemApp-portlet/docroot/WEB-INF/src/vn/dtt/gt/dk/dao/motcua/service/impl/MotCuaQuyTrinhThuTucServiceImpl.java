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

package vn.dtt.gt.dk.dao.motcua.service.impl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.service.base.MotCuaQuyTrinhThuTucServiceBaseImpl;

/**
 * The implementation of the mot cua quy trinh thu tuc remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaQuyTrinhThuTucServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucServiceUtil
 */
public class MotCuaQuyTrinhThuTucServiceImpl
	extends MotCuaQuyTrinhThuTucServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucServiceUtil} to access the mot cua quy trinh thu tuc remote service.
	 */
	
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
			long thuTucHanhChinhId, long toChucXuLy){
		try{
			return motCuaQuyTrinhThuTucPersistence.findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,toChucXuLy);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaQuyTrinhThuTucServiceImpl.class);
	

}