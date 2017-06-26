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
public class THONGSOCHUNGCHIXEBONBANHFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH> findByCertificateRecordAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByCertificateRecordAndHosothutucId(hosothutucid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByVehicleGroupInitialAndHosothutucId(hosothutucid);
	}

	public static boolean deleteXBBVehicleCertificateSpecWithHosothutucId(
		long hosothutucId) {
		return getFinder()
				   .deleteXBBVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	public static THONGSOCHUNGCHIXEBONBANHFinder getFinder() {
		if (_finder == null) {
			_finder = (THONGSOCHUNGCHIXEBONBANHFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					THONGSOCHUNGCHIXEBONBANHFinder.class.getName());

			ReferenceRegistry.registerReference(THONGSOCHUNGCHIXEBONBANHFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(THONGSOCHUNGCHIXEBONBANHFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(THONGSOCHUNGCHIXEBONBANHFinderUtil.class,
			"_finder");
	}

	private static THONGSOCHUNGCHIXEBONBANHFinder _finder;
}