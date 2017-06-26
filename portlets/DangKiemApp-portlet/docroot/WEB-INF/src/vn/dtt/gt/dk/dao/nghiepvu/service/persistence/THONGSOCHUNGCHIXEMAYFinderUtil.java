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
public class THONGSOCHUNGCHIXEMAYFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByCertificateRecordAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByCertificateRecordAndHosothutucId(hosothutucid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByVehicleGroupInitialAndHosothutucId(hosothutucid);
	}

	public static boolean deleteXMYVehicleCertificateSpecWithHosothutucId(
		long hosothutucId) {
		return getFinder()
				   .deleteXMYVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	public static THONGSOCHUNGCHIXEMAYFinder getFinder() {
		if (_finder == null) {
			_finder = (THONGSOCHUNGCHIXEMAYFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					THONGSOCHUNGCHIXEMAYFinder.class.getName());

			ReferenceRegistry.registerReference(THONGSOCHUNGCHIXEMAYFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(THONGSOCHUNGCHIXEMAYFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(THONGSOCHUNGCHIXEMAYFinderUtil.class,
			"_finder");
	}

	private static THONGSOCHUNGCHIXEMAYFinder _finder;
}