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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class MotCuaDienBienHoSoFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findMotCuaDienBienHoSoByPhieuXuLyChinh(
		long phieuXuLyChinhId, int start, int end) {
		return getFinder()
				   .findMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId,
			start, end);
	}

	public static int countMotCuaDienBienHoSoByPhieuXuLyChinh(
		long phieuXuLyChinhId) {
		return getFinder()
				   .countMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findMotCuaDienBienHoSoByLatest10day(
		int start, int end) {
		return getFinder().findMotCuaDienBienHoSoByLatest10day(start, end);
	}

	public static MotCuaDienBienHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (MotCuaDienBienHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaDienBienHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(MotCuaDienBienHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MotCuaDienBienHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MotCuaDienBienHoSoFinderUtil.class,
			"_finder");
	}

	private static MotCuaDienBienHoSoFinder _finder;
}