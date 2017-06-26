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
public class TthcPhanNhomHoSoVaiTroFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(
		long phanNhomHoSoId, java.lang.String vaitroxuly) {
		return getFinder()
				   .findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(phanNhomHoSoId,
			vaitroxuly);
	}

	public static TthcPhanNhomHoSoVaiTroFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcPhanNhomHoSoVaiTroFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcPhanNhomHoSoVaiTroFinder.class.getName());

			ReferenceRegistry.registerReference(TthcPhanNhomHoSoVaiTroFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcPhanNhomHoSoVaiTroFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcPhanNhomHoSoVaiTroFinderUtil.class,
			"_finder");
	}

	private static TthcPhanNhomHoSoVaiTroFinder _finder;
}