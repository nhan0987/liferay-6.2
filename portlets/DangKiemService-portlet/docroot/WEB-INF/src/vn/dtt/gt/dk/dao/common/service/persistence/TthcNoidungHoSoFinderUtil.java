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

package vn.dtt.gt.dk.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author huymq
 */
public class TthcNoidungHoSoFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead> findByHoSoThuTucIds(
		long[] hoSoThuTucIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByHoSoThuTucIds(hoSoThuTucIds, start, end);
	}

	public static TthcNoidungHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcNoidungHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcNoidungHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(TthcNoidungHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcNoidungHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcNoidungHoSoFinderUtil.class,
			"_finder");
	}

	private static TthcNoidungHoSoFinder _finder;
}