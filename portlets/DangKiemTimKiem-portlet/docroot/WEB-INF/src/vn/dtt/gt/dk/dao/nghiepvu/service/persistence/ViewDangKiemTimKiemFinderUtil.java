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
public class ViewDangKiemTimKiemFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem> searchDangKiemTimKiem(
		java.lang.String soChungChi, java.lang.String soKhung,
		java.lang.String soDongCo, long guestId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .searchDangKiemTimKiem(soChungChi, soKhung, soDongCo,
			guestId, start, end);
	}

	public static long countDangKiemTimKiem(java.lang.String soChungChi,
		java.lang.String soKhung, java.lang.String soDongCo, long guestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDangKiemTimKiem(soChungChi, soKhung, soDongCo, guestId);
	}

	public static ViewDangKiemTimKiemFinder getFinder() {
		if (_finder == null) {
			_finder = (ViewDangKiemTimKiemFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ViewDangKiemTimKiemFinder.class.getName());

			ReferenceRegistry.registerReference(ViewDangKiemTimKiemFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ViewDangKiemTimKiemFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ViewDangKiemTimKiemFinderUtil.class,
			"_finder");
	}

	private static ViewDangKiemTimKiemFinder _finder;
}