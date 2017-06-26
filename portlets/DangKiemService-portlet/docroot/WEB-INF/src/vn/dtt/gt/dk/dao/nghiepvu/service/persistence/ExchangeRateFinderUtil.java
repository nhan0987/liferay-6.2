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
public class ExchangeRateFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findLastByOriginalCurrencyAndBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		java.util.Date currentDate) {
		return getFinder()
				   .findLastByOriginalCurrencyAndBasicCurrency(originalCurrency,
			basicCurrency, currentDate);
	}

	public static ExchangeRateFinder getFinder() {
		if (_finder == null) {
			_finder = (ExchangeRateFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ExchangeRateFinder.class.getName());

			ReferenceRegistry.registerReference(ExchangeRateFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ExchangeRateFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ExchangeRateFinderUtil.class,
			"_finder");
	}

	private static ExchangeRateFinder _finder;
}