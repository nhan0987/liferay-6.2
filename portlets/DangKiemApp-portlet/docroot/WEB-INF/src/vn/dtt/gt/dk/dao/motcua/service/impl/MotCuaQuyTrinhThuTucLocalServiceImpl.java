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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc;
import vn.dtt.gt.dk.dao.motcua.service.base.MotCuaQuyTrinhThuTucLocalServiceBaseImpl;

/**
 * The implementation of the mot cua quy trinh thu tuc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaQuyTrinhThuTucLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil
 */
public class MotCuaQuyTrinhThuTucLocalServiceImpl
	extends MotCuaQuyTrinhThuTucLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil} to access the mot cua quy trinh thu tuc local service.
	 */
	public List<MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(long ThuTucHanhChinhId, long ToChucXuLy) {
		try {
			return motCuaQuyTrinhThuTucPersistence.findByThuTucHanhChinhIdAndToChucXuLy(ThuTucHanhChinhId, ToChucXuLy);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<MotCuaQuyTrinhThuTuc>();
	}
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaQuyTrinhThuTucLocalServiceImpl.class);
}