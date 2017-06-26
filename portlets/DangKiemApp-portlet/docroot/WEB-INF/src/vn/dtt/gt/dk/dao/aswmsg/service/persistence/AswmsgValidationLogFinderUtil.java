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

package vn.dtt.gt.dk.dao.aswmsg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class AswmsgValidationLogFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> findByMaSoHoSo(
		java.lang.String maSoHoSo) {
		return getFinder().findByMaSoHoSo(maSoHoSo);
	}

	public static AswmsgValidationLogFinder getFinder() {
		if (_finder == null) {
			_finder = (AswmsgValidationLogFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer.getServletContextName(),
					AswmsgValidationLogFinder.class.getName());

			ReferenceRegistry.registerReference(AswmsgValidationLogFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AswmsgValidationLogFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AswmsgValidationLogFinderUtil.class,
			"_finder");
	}

	private static AswmsgValidationLogFinder _finder;
}