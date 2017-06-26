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
public class TthcThanhPhanHoSoFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> searchTthcThanhPhanHoSo(
		long thutuchanhchinhid, long bieumauhosoid, int thutuhienthi,
		int loaithanhphan, java.lang.String mautructuyen,
		long sotailieudinhkem, int start, int end) {
		return getFinder()
				   .searchTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid,
			thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem, start,
			end);
	}

	public static int countTthcThanhPhanHoSo(long thutuchanhchinhid,
		long bieumauhosoid, int thutuhienthi, int loaithanhphan,
		java.lang.String mautructuyen, long sotailieudinhkem) {
		return getFinder()
				   .countTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid,
			thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem);
	}

	public static TthcThanhPhanHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcThanhPhanHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcThanhPhanHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(TthcThanhPhanHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcThanhPhanHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcThanhPhanHoSoFinderUtil.class,
			"_finder");
	}

	private static TthcThanhPhanHoSoFinder _finder;
}