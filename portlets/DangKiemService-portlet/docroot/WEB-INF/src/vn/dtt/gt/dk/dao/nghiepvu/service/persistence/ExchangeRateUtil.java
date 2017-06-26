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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate;

import java.util.List;

/**
 * The persistence utility for the exchange rate service. This utility wraps {@link ExchangeRatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ExchangeRatePersistence
 * @see ExchangeRatePersistenceImpl
 * @generated
 */
public class ExchangeRateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ExchangeRate exchangeRate) {
		getPersistence().clearCache(exchangeRate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExchangeRate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExchangeRate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExchangeRate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ExchangeRate update(ExchangeRate exchangeRate)
		throws SystemException {
		return getPersistence().update(exchangeRate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ExchangeRate update(ExchangeRate exchangeRate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(exchangeRate, serviceContext);
	}

	/**
	* Returns all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @return the matching exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate findByOriginalCurrencyBasicCurrency_First(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException {
		return getPersistence()
				   .findByOriginalCurrencyBasicCurrency_First(originalCurrency,
			basicCurrency, orderByComparator);
	}

	/**
	* Returns the first exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching exchange rate, or <code>null</code> if a matching exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate fetchByOriginalCurrencyBasicCurrency_First(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOriginalCurrencyBasicCurrency_First(originalCurrency,
			basicCurrency, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate findByOriginalCurrencyBasicCurrency_Last(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException {
		return getPersistence()
				   .findByOriginalCurrencyBasicCurrency_Last(originalCurrency,
			basicCurrency, orderByComparator);
	}

	/**
	* Returns the last exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching exchange rate, or <code>null</code> if a matching exchange rate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate fetchByOriginalCurrencyBasicCurrency_Last(
		java.lang.String originalCurrency, java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOriginalCurrencyBasicCurrency_Last(originalCurrency,
			basicCurrency, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate[] findByOriginalCurrencyBasicCurrency_PrevAndNext(
		long id, java.lang.String originalCurrency,
		java.lang.String basicCurrency,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException {
		return getPersistence()
				   .findByOriginalCurrencyBasicCurrency_PrevAndNext(id,
			originalCurrency, basicCurrency, orderByComparator);
	}

	/**
	* Removes all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63; from the database.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency);
	}

	/**
	* Returns the number of exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	*
	* @param originalCurrency the original currency
	* @param basicCurrency the basic currency
	* @return the number of matching exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency);
	}

	/**
	* Caches the exchange rate in the entity cache if it is enabled.
	*
	* @param exchangeRate the exchange rate
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate exchangeRate) {
		getPersistence().cacheResult(exchangeRate);
	}

	/**
	* Caches the exchange rates in the entity cache if it is enabled.
	*
	* @param exchangeRates the exchange rates
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> exchangeRates) {
		getPersistence().cacheResult(exchangeRates);
	}

	/**
	* Creates a new exchange rate with the primary key. Does not add the exchange rate to the database.
	*
	* @param id the primary key for the new exchange rate
	* @return the new exchange rate
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the exchange rate
	* @return the exchange rate that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate exchangeRate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(exchangeRate);
	}

	/**
	* Returns the exchange rate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException} if it could not be found.
	*
	* @param id the primary key of the exchange rate
	* @return the exchange rate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the exchange rate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the exchange rate
	* @return the exchange rate, or <code>null</code> if a exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the exchange rates.
	*
	* @return the exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the exchange rates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of exchange rates.
	*
	* @return the number of exchange rates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ExchangeRatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ExchangeRatePersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ExchangeRatePersistence.class.getName());

			ReferenceRegistry.registerReference(ExchangeRateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ExchangeRatePersistence persistence) {
	}

	private static ExchangeRatePersistence _persistence;
}