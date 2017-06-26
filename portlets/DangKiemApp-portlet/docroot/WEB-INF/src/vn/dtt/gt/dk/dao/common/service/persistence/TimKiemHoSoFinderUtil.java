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

package vn.dtt.gt.dk.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class TimKiemHoSoFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TimKiemHoSo> searchTraCuuThongTinHoSo(
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().searchTraCuuThongTinHoSo(thongTinTimKiemHoSo);
	}

	public static long countTraCuuThongTinHoSo(
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countTraCuuThongTinHoSo(thongTinTimKiemHoSo);
	}

	public static TimKiemHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (TimKiemHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TimKiemHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(TimKiemHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TimKiemHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TimKiemHoSoFinderUtil.class,
			"_finder");
	}

	private static TimKiemHoSoFinder _finder;
}