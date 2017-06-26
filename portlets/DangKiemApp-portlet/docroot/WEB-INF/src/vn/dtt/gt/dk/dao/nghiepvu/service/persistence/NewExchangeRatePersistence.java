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

import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate;

/**
 * The persistence interface for the new exchange rate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see NewExchangeRatePersistenceImpl
 * @see NewExchangeRateUtil
 * @generated
 */
public interface NewExchangeRatePersistence extends BasePersistence<NewExchangeRate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewExchangeRateUtil} to access the new exchange rate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the new exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @return the matching new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the new exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param start the lower bound of the range of new exchange rates
	* @param end the upper bound of the range of new exchange rates (not inclusive)
	* @return the range of matching new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the new exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param start the lower bound of the range of new exchange rates
	* @param end the upper bound of the range of new exchange rates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching new exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a matching new exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate findByOriginalCurrencyBasicCurrency_First(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException;

	/**
	* Returns the first new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching new exchange rate, or <code>null</code> if a matching new exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate fetchByOriginalCurrencyBasicCurrency_First(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching new exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a matching new exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate findByOriginalCurrencyBasicCurrency_Last(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException;

	/**
	* Returns the last new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching new exchange rate, or <code>null</code> if a matching new exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate fetchByOriginalCurrencyBasicCurrency_Last(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the new exchange rates before and after the current new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param id the primary key of the current new exchange rate
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next new exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a new exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate[] findByOriginalCurrencyBasicCurrency_PrevAndNext(
		long id, java.lang.String originalCurrency,
		java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException;

	/**
	* Removes all the new exchange rates where originalCurrency = &#63; and basicCurrency = &#63; from the database.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of new exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @return the number of matching new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public int countByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the new exchange rate in the entity cache if it is enabled.
	*
	* @param newExchangeRate the new exchange rate
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate newExchangeRate);

	/**
	* Caches the new exchange rates in the entity cache if it is enabled.
	*
	* @param newExchangeRates the new exchange rates
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> newExchangeRates);

	/**
	* Creates a new new exchange rate with the primary key. Does not add the new exchange rate to the database.
	*
	* @param id the primary key for the new new exchange rate
	* @return the new new exchange rate
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate create(long id);

	/**
	* Removes the new exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the new exchange rate
	* @return the new exchange rate that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a new exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate newExchangeRate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the new exchange rate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException} if it could not be found.
	*
	* @param id the primary key of the new exchange rate
	* @return the new exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a new exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException;

	/**
	* Returns the new exchange rate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the new exchange rate
	* @return the new exchange rate, or <code>null</code> if a new exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the new exchange rates.
	*
	* @return the new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the new exchange rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of new exchange rates
	* @param end the upper bound of the range of new exchange rates (not inclusive)
	* @return the range of new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the new exchange rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of new exchange rates
	* @param end the upper bound of the range of new exchange rates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the new exchange rates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of new exchange rates.
	*
	* @return the number of new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}