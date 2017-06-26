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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.ActionLogLocalServiceBaseImpl;

/**
 * The implementation of the action log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.ActionLogLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalServiceUtil
 */
public class ActionLogLocalServiceImpl extends ActionLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalServiceUtil} to access the action log local service.
	 */
	private static Log _log = LogFactoryUtil.getLog(ActionLogLocalServiceImpl.class);
	public List<ActionLog> findActionLogByDate(String maSoHoSo, String soBBKT, String motaNoiDungThaoTac, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenDangKiemVien, String tenManHinhDaiDien, int start, int end) {			
			try {
				return actionLogFinder.findActionLogByDate(maSoHoSo, soBBKT, motaNoiDungThaoTac, ngayNopFrom, ngayNopTo, tenDoanhNghiep, tenDangKiemVien, tenManHinhDaiDien, start, end);
			} catch (SystemException e) {
				_log.error(e);
			}
			
			return null;
		}
		
		public int countActionLogListByDate(String maSoHoSo, String soBBKT, String motaNoiDungThaoTac, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenDangKiemVien, String tenManHinhDaiDien) throws SystemException {
		
			return actionLogFinder.countActionLogListByDate(maSoHoSo, soBBKT, motaNoiDungThaoTac, ngayNopFrom, ngayNopTo, tenDoanhNghiep, tenDangKiemVien, tenManHinhDaiDien);
		}
}