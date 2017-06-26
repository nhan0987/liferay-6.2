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

import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.ExchangeRateLocalServiceBaseImpl;

/**
 * The implementation of the exchange rate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.ExchangeRateLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalServiceUtil
 */
public class ExchangeRateLocalServiceImpl
	extends ExchangeRateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalServiceUtil} to access the exchange rate local service.
	 */
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findByOriginalCurrencyBasicCurrency(
			java.lang.String originalCurrency, java.lang.String basicCurrency){
		try {
			return exchangeRatePersistence.findByOriginalCurrencyBasicCurrency(originalCurrency, basicCurrency);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public List<ExchangeRate> findLastByOriginalCurrencyAndBasicCurrency(String originalCurrency, String basicCurrency,
			Date currentDate){
		try{
			return exchangeRateFinder.findLastByOriginalCurrencyAndBasicCurrency(originalCurrency, basicCurrency, currentDate);
			 
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}