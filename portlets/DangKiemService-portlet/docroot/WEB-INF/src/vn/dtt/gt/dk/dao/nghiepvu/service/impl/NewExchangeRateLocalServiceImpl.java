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

package vn.dtt.gt.dk.dao.nghiepvu.service.impl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.service.base.NewExchangeRateLocalServiceBaseImpl;

/**
 * The implementation of the new exchange rate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.NewExchangeRateLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil
 */
public class NewExchangeRateLocalServiceImpl
	extends NewExchangeRateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil} to access the new exchange rate local service.
	 */
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findByOriginalCurrencyBasicCurrency(
			java.lang.String originalCurrency, java.lang.String basicCurrency){
		try{
			return newExchangeRatePersistence.findByOriginalCurrencyBasicCurrency(originalCurrency, basicCurrency);
			
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(NewExchangeRateLocalServiceImpl.class);

}