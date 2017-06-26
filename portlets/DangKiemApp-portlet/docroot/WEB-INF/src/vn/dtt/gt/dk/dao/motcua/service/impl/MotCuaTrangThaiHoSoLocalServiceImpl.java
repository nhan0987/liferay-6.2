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

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.gt.dk.dao.motcua.service.base.MotCuaTrangThaiHoSoLocalServiceBaseImpl;

/**
 * The implementation of the mot cua trang thai ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaTrangThaiHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil
 */
public class MotCuaTrangThaiHoSoLocalServiceImpl extends MotCuaTrangThaiHoSoLocalServiceBaseImpl {
	
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(long quyTrinhThuTucId) {
		try {
			return motCuaTrangThaiHoSoPersistence.findByQuyTrinhThuTucId(quyTrinhThuTucId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<MotCuaTrangThaiHoSo> getAllTrangThaiHoSoByKieuTrangThai(int kieuTrangThai) {
		try {
			return motCuaTrangThaiHoSoFinder.getAllTrangThaiHoSoByKieuTrangThai(kieuTrangThai);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaTrangThaiHoSoLocalServiceImpl.class);
}
