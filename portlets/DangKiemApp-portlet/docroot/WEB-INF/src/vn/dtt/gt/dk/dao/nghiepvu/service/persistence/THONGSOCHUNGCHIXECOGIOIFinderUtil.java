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
public class THONGSOCHUNGCHIXECOGIOIFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByCertificateRecordAndHosothutucId(hosothutucid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByVehicleGroupInitialAndHosothutucId(hosothutucid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByCertificateRecordAndHosothutucId(
		long hosothutucid) {
		return getFinder()
				   .findPart2ByCertificateRecordAndHosothutucId(hosothutucid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByVehicleGroupInitialAndHosothutucId(
		long hosothutucid) {
		return getFinder()
				   .findPart2ByVehicleGroupInitialAndHosothutucId(hosothutucid);
	}

	public static boolean deleteXCGVehicleCertificateSpecWithHosothutucId(
		long hosothutucId) {
		return getFinder()
				   .deleteXCGVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	public static THONGSOCHUNGCHIXECOGIOIFinder getFinder() {
		if (_finder == null) {
			_finder = (THONGSOCHUNGCHIXECOGIOIFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					THONGSOCHUNGCHIXECOGIOIFinder.class.getName());

			ReferenceRegistry.registerReference(THONGSOCHUNGCHIXECOGIOIFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(THONGSOCHUNGCHIXECOGIOIFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(THONGSOCHUNGCHIXECOGIOIFinderUtil.class,
			"_finder");
	}

	private static THONGSOCHUNGCHIXECOGIOIFinder _finder;
}