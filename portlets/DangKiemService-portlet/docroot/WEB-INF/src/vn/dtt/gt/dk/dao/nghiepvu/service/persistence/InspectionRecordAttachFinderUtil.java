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
public class InspectionRecordAttachFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findByHoSoThuTucIds(
		long[] hoSoThuTucIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByHoSoThuTucIds(hoSoThuTucIds, start, end);
	}

	public static InspectionRecordAttachFinder getFinder() {
		if (_finder == null) {
			_finder = (InspectionRecordAttachFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					InspectionRecordAttachFinder.class.getName());

			ReferenceRegistry.registerReference(InspectionRecordAttachFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(InspectionRecordAttachFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(InspectionRecordAttachFinderUtil.class,
			"_finder");
	}

	private static InspectionRecordAttachFinder _finder;
}