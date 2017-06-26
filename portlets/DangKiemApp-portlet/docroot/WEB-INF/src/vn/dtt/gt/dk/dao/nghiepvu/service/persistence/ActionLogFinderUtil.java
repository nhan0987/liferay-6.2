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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class ActionLogFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findActionLogByDate(
		java.lang.String maSoHoSo, java.lang.String soBBKT,
		java.lang.String motaNoiDungThaoTac, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String tenDangKiemVien, java.lang.String tenManHinhDaiDien,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findActionLogByDate(maSoHoSo, soBBKT, motaNoiDungThaoTac,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, tenDangKiemVien,
			tenManHinhDaiDien, start, end);
	}

	public static int countActionLogListByDate(java.lang.String maSoHoSo,
		java.lang.String soBBKT, java.lang.String motaNoiDungThaoTac,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, java.lang.String tenDangKiemVien,
		java.lang.String tenManHinhDaiDien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countActionLogListByDate(maSoHoSo, soBBKT,
			motaNoiDungThaoTac, ngayNopFrom, ngayNopTo, tenDoanhNghiep,
			tenDangKiemVien, tenManHinhDaiDien);
	}

	public static ActionLogFinder getFinder() {
		if (_finder == null) {
			_finder = (ActionLogFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ActionLogFinder.class.getName());

			ReferenceRegistry.registerReference(ActionLogFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ActionLogFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ActionLogFinderUtil.class, "_finder");
	}

	private static ActionLogFinder _finder;
}