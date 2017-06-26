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
 * @author huymq
 */
public class CorporationInspectorFinderUtil {
	public static java.util.List<java.lang.Long> findUserLiferayNotHaveCorporationInspector(
		java.lang.String schemaLifeay) {
		return getFinder()
				   .findUserLiferayNotHaveCorporationInspector(schemaLifeay);
	}

	public static boolean deleteDangKiemVien(long corporationInspectorId) {
		return getFinder().deleteDangKiemVien(corporationInspectorId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findDanhSachDangKiemVien(
		int start, int end) {
		return getFinder().findDanhSachDangKiemVien(start, end);
	}

	public static int countDanhSachDangKiemVien()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDanhSachDangKiemVien();
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findDanhSachDangKiemVienByTeam(
		long userId) {
		return getFinder().findDanhSachDangKiemVienByTeam(userId);
	}

	public static CorporationInspectorFinder getFinder() {
		if (_finder == null) {
			_finder = (CorporationInspectorFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CorporationInspectorFinder.class.getName());

			ReferenceRegistry.registerReference(CorporationInspectorFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CorporationInspectorFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CorporationInspectorFinderUtil.class,
			"_finder");
	}

	private static CorporationInspectorFinder _finder;
}