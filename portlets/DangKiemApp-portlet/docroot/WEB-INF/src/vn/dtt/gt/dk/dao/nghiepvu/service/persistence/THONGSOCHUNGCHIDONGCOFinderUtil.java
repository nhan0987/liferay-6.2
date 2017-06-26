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
public class THONGSOCHUNGCHIDONGCOFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> findByCertificateRecordAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByCertificateRecordAndHosothutucId(hosothutucid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByVehicleGroupInitialAndHosothutucId(hosothutucid);
	}

	public static boolean deleteDCXVehicleCertificateSpecWithHosothutucId(
		long hosothutucId) {
		return getFinder()
				   .deleteDCXVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	public static THONGSOCHUNGCHIDONGCOFinder getFinder() {
		if (_finder == null) {
			_finder = (THONGSOCHUNGCHIDONGCOFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					THONGSOCHUNGCHIDONGCOFinder.class.getName());

			ReferenceRegistry.registerReference(THONGSOCHUNGCHIDONGCOFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(THONGSOCHUNGCHIDONGCOFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(THONGSOCHUNGCHIDONGCOFinderUtil.class,
			"_finder");
	}

	private static THONGSOCHUNGCHIDONGCOFinder _finder;
}