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
public class THONGSOCHUNGCHIXECHUYENDUNGFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByCertificateRecordAndHosothutucId(hosothutucid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucid) {
		return getFinder().findByVehicleGroupInitialAndHosothutucId(hosothutucid);
	}

	public static boolean deleteXCDVehicleCertificateSpecWithHosothutucId(
		long hosothutucId) {
		return getFinder()
				   .deleteXCDVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	public static boolean deleteXCDVehicleCertificateSpecWithXCD0009(
		java.lang.String XCD0009) {
		return getFinder().deleteXCDVehicleCertificateSpecWithXCD0009(XCD0009);
	}

	public static THONGSOCHUNGCHIXECHUYENDUNGFinder getFinder() {
		if (_finder == null) {
			_finder = (THONGSOCHUNGCHIXECHUYENDUNGFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					THONGSOCHUNGCHIXECHUYENDUNGFinder.class.getName());

			ReferenceRegistry.registerReference(THONGSOCHUNGCHIXECHUYENDUNGFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(THONGSOCHUNGCHIXECHUYENDUNGFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(THONGSOCHUNGCHIXECHUYENDUNGFinderUtil.class,
			"_finder");
	}

	private static THONGSOCHUNGCHIXECHUYENDUNGFinder _finder;
}