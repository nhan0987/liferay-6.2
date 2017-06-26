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
public class RegisteredInspectionFinderUtil {
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findDanhSachHoSo(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findDanhSachHoSo(phieuXuLyPhuId);
	}

	public static int countSoHoSoDangKyKiemTra(long idRegisteredInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countSoHoSoDangKyKiemTra(idRegisteredInspection);
	}

	public static RegisteredInspectionFinder getFinder() {
		if (_finder == null) {
			_finder = (RegisteredInspectionFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					RegisteredInspectionFinder.class.getName());

			ReferenceRegistry.registerReference(RegisteredInspectionFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(RegisteredInspectionFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(RegisteredInspectionFinderUtil.class,
			"_finder");
	}

	private static RegisteredInspectionFinder _finder;
}