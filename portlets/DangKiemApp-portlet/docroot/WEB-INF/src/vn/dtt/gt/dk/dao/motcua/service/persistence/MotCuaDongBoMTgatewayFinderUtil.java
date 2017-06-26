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
public class MotCuaDongBoMTgatewayFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findHoSoByPhieuXuLyChinh(
		long phieuXuLyChinhId, int start, int end) {
		return getFinder().findHoSoByPhieuXuLyChinh(phieuXuLyChinhId, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByTrangthaiDongbo(
		java.lang.String trangthai, int start, int end) {
		return getFinder().findByTrangthaiDongbo(trangthai, start, end);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway findLatestHosoDongboByHosothutucId(
		long phieuXuLyChinhId) {
		return getFinder().findLatestHosoDongboByHosothutucId(phieuXuLyChinhId);
	}

	public static int countByPhieuXuLyChinh(long phieuXuLyChinhId) {
		return getFinder().countByPhieuXuLyChinh(phieuXuLyChinhId);
	}

	public static int countByDienbienHosoIdandPhieuXuLyChinhId(
		long dienBienHoSoId, long phieuXuLyChinhId) {
		return getFinder()
				   .countByDienbienHosoIdandPhieuXuLyChinhId(dienBienHoSoId,
			phieuXuLyChinhId);
	}

	public static MotCuaDongBoMTgatewayFinder getFinder() {
		if (_finder == null) {
			_finder = (MotCuaDongBoMTgatewayFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaDongBoMTgatewayFinder.class.getName());

			ReferenceRegistry.registerReference(MotCuaDongBoMTgatewayFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MotCuaDongBoMTgatewayFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MotCuaDongBoMTgatewayFinderUtil.class,
			"_finder");
	}

	private static MotCuaDongBoMTgatewayFinder _finder;
}