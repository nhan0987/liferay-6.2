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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author huymq
 */
public class MotCuaChuyenDichTrangThaiFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findChuyenDichTrangThai(
		java.lang.String dieuKienDichchuyen, int start, int end) {
		return getFinder()
				   .findChuyenDichTrangThai(dieuKienDichchuyen, start, end);
	}

	public static int countChuyenDichTrangThai(
		java.lang.String dieuKienDichchuyen) {
		return getFinder().countChuyenDichTrangThai(dieuKienDichchuyen);
	}

	public static MotCuaChuyenDichTrangThaiFinder getFinder() {
		if (_finder == null) {
			_finder = (MotCuaChuyenDichTrangThaiFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaChuyenDichTrangThaiFinder.class.getName());

			ReferenceRegistry.registerReference(MotCuaChuyenDichTrangThaiFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MotCuaChuyenDichTrangThaiFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MotCuaChuyenDichTrangThaiFinderUtil.class,
			"_finder");
	}

	private static MotCuaChuyenDichTrangThaiFinder _finder;
}