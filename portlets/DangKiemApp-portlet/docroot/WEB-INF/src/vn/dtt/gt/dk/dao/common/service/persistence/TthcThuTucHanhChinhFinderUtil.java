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
 * @author win_64
 */
public class TthcThuTucHanhChinhFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> searchThuTucHanhChinh(
		java.lang.String mathutuc, java.lang.String tenthutuc,
		int coquanqlttid, int linhvucthutucid, int start, int end) {
		return getFinder()
				   .searchThuTucHanhChinh(mathutuc, tenthutuc, coquanqlttid,
			linhvucthutucid, start, end);
	}

	public static int countThuTucHanhChinh(java.lang.String mathutuc,
		java.lang.String tenthutuc, int coquanqlttid, int linhvucthutucid) {
		return getFinder()
				   .countThuTucHanhChinh(mathutuc, tenthutuc, coquanqlttid,
			linhvucthutucid);
	}

	public static TthcThuTucHanhChinhFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcThuTucHanhChinhFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcThuTucHanhChinhFinder.class.getName());

			ReferenceRegistry.registerReference(TthcThuTucHanhChinhFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcThuTucHanhChinhFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcThuTucHanhChinhFinderUtil.class,
			"_finder");
	}

	private static TthcThuTucHanhChinhFinder _finder;
}