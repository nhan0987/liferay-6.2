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
public class CorporationViewFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findCorporationView(
		long inspectorid, int isleader) {
		return getFinder().findCorporationView(inspectorid, isleader);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findCorporationView(
		long inspectorid) {
		return getFinder().findCorporationView(inspectorid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByDanhSachDangKiemVienTheoDoi(
		java.lang.String corporationId) {
		return getFinder().findByDanhSachDangKiemVienTheoDoi(corporationId);
	}

	public static CorporationViewFinder getFinder() {
		if (_finder == null) {
			_finder = (CorporationViewFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CorporationViewFinder.class.getName());

			ReferenceRegistry.registerReference(CorporationViewFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CorporationViewFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CorporationViewFinderUtil.class,
			"_finder");
	}

	private static CorporationViewFinder _finder;
}