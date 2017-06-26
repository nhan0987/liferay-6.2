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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate;

/**
 * The persistence interface for the exchange rate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ExchangeRatePersistenceImpl
 * @see ExchangeRateUtil
 * @generated
 */
public interface ExchangeRatePersistence extends BasePersistence<ExchangeRate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExchangeRateUtil} to access the exchange rate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @return the matching exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param start the lower bound of the range of exchange rates
	* @param end the upper bound of the range of exchange rates (not inclusive)
	* @return the range of matching exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param start the lower bound of the range of exchange rates
	* @param end the upper bound of the range of exchange rates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a matching exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate findByOriginalCurrencyBasicCurrency_First(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException;

	/**
	* Returns the first exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching exchange rate, or <code>null</code> if a matching exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate fetchByOriginalCurrencyBasicCurrency_First(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a matching exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate findByOriginalCurrencyBasicCurrency_Last(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException;

	/**
	* Returns the last exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching exchange rate, or <code>null</code> if a matching exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate fetchByOriginalCurrencyBasicCurrency_Last(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the exchange rates before and after the current exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param id the primary key of the current exchange rate
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate[] findByOriginalCurrencyBasicCurrency_PrevAndNext(
		long id, java.lang.String originalCurrency,
		java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException;

	/**
	* Removes all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63; from the database.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @return the number of matching exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public int countByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the exchange rate in the entity cache if it is enabled.
	*
	* @param exchangeRate the exchange rate
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate exchangeRate);

	/**
	* Caches the exchange rates in the entity cache if it is enabled.
	*
	* @param exchangeRates the exchange rates
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> exchangeRates);

	/**
	* Creates a new exchange rate with the primary key. Does not add the exchange rate to the database.
	*
	* @param id the primary key for the new exchange rate
	* @return the new exchange rate
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate create(long id);

	/**
	* Removes the exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the exchange rate
	* @return the exchange rate that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate exchangeRate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the exchange rate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException} if it could not be found.
	*
	* @param id the primary key of the exchange rate
	* @return the exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException;

	/**
	* Returns the exchange rate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the exchange rate
	* @return the exchange rate, or <code>null</code> if a exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the exchange rates.
	*
	* @return the exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the exchange rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of exchange rates
	* @param end the upper bound of the range of exchange rates (not inclusive)
	* @return the range of exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the exchange rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of exchange rates
	* @param end the upper bound of the range of exchange rates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the exchange rates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of exchange rates.
	*
	* @return the number of exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}