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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the exchange rate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ExchangeRatePersistence
 * @see ExchangeRateUtil
 * @generated
 */
public class ExchangeRatePersistenceImpl extends BasePersistenceImpl<ExchangeRate>
	implements ExchangeRatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExchangeRateUtil} to access the exchange rate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExchangeRateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateModelImpl.FINDER_CACHE_ENABLED, ExchangeRateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateModelImpl.FINDER_CACHE_ENABLED, ExchangeRateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY =
		new FinderPath(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateModelImpl.FINDER_CACHE_ENABLED, ExchangeRateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOriginalCurrencyBasicCurrency",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY =
		new FinderPath(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateModelImpl.FINDER_CACHE_ENABLED, ExchangeRateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOriginalCurrencyBasicCurrency",
			new String[] { String.class.getName(), String.class.getName() },
			ExchangeRateModelImpl.ORIGINALCURRENCY_COLUMN_BITMASK |
			ExchangeRateModelImpl.BASICCURRENCY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORIGINALCURRENCYBASICCURRENCY =
		new FinderPath(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOriginalCurrencyBasicCurrency",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @return the matching exchange rates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ExchangeRate> findByOriginalCurrencyBasicCurrency(
		String originalCurrency, String basicCurrency)
		throws SystemException {
		return findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ExchangeRate> findByOriginalCurrencyBasicCurrency(
		String originalCurrency, String basicCurrency, int start, int end)
		throws SystemException {
		return findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency, start, end, null);
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
	@Override
	public List<ExchangeRate> findByOriginalCurrencyBasicCurrency(
		String originalCurrency, String basicCurrency, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY;
			finderArgs = new Object[] { originalCurrency, basicCurrency };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY;
			finderArgs = new Object[] {
					originalCurrency, basicCurrency,
					
					start, end, orderByComparator
				};
		}

		List<ExchangeRate> list = (List<ExchangeRate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ExchangeRate exchangeRate : list) {
				if (!Validator.equals(originalCurrency,
							exchangeRate.getOriginalCurrency()) ||
						!Validator.equals(basicCurrency,
							exchangeRate.getBasicCurrency())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_EXCHANGERATE_WHERE);

			boolean bindOriginalCurrency = false;

			if (originalCurrency == null) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_1);
			}
			else if (originalCurrency.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_3);
			}
			else {
				bindOriginalCurrency = true;

				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_2);
			}

			boolean bindBasicCurrency = false;

			if (basicCurrency == null) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_1);
			}
			else if (basicCurrency.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_3);
			}
			else {
				bindBasicCurrency = true;

				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ExchangeRateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOriginalCurrency) {
					qPos.add(originalCurrency);
				}

				if (bindBasicCurrency) {
					qPos.add(basicCurrency);
				}

				if (!pagination) {
					list = (List<ExchangeRate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ExchangeRate>(list);
				}
				else {
					list = (List<ExchangeRate>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public ExchangeRate findByOriginalCurrencyBasicCurrency_First(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator)
		throws NoSuchExchangeRateException, SystemException {
		ExchangeRate exchangeRate = fetchByOriginalCurrencyBasicCurrency_First(originalCurrency,
				basicCurrency, orderByComparator);

		if (exchangeRate != null) {
			return exchangeRate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("originalCurrency=");
		msg.append(originalCurrency);

		msg.append(", basicCurrency=");
		msg.append(basicCurrency);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchExchangeRateException(msg.toString());
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
	@Override
	public ExchangeRate fetchByOriginalCurrencyBasicCurrency_First(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator) throws SystemException {
		List<ExchangeRate> list = findByOriginalCurrencyBasicCurrency(originalCurrency,
				basicCurrency, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ExchangeRate findByOriginalCurrencyBasicCurrency_Last(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator)
		throws NoSuchExchangeRateException, SystemException {
		ExchangeRate exchangeRate = fetchByOriginalCurrencyBasicCurrency_Last(originalCurrency,
				basicCurrency, orderByComparator);

		if (exchangeRate != null) {
			return exchangeRate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("originalCurrency=");
		msg.append(originalCurrency);

		msg.append(", basicCurrency=");
		msg.append(basicCurrency);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchExchangeRateException(msg.toString());
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
	@Override
	public ExchangeRate fetchByOriginalCurrencyBasicCurrency_Last(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByOriginalCurrencyBasicCurrency(originalCurrency,
				basicCurrency);

		if (count == 0) {
			return null;
		}

		List<ExchangeRate> list = findByOriginalCurrencyBasicCurrency(originalCurrency,
				basicCurrency, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ExchangeRate[] findByOriginalCurrencyBasicCurrency_PrevAndNext(
		long id, String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator)
		throws NoSuchExchangeRateException, SystemException {
		ExchangeRate exchangeRate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ExchangeRate[] array = new ExchangeRateImpl[3];

			array[0] = getByOriginalCurrencyBasicCurrency_PrevAndNext(session,
					exchangeRate, originalCurrency, basicCurrency,
					orderByComparator, true);

			array[1] = exchangeRate;

			array[2] = getByOriginalCurrencyBasicCurrency_PrevAndNext(session,
					exchangeRate, originalCurrency, basicCurrency,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ExchangeRate getByOriginalCurrencyBasicCurrency_PrevAndNext(
		Session session, ExchangeRate exchangeRate, String originalCurrency,
		String basicCurrency, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EXCHANGERATE_WHERE);

		boolean bindOriginalCurrency = false;

		if (originalCurrency == null) {
			query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_1);
		}
		else if (originalCurrency.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_3);
		}
		else {
			bindOriginalCurrency = true;

			query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_2);
		}

		boolean bindBasicCurrency = false;

		if (basicCurrency == null) {
			query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_1);
		}
		else if (basicCurrency.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_3);
		}
		else {
			bindBasicCurrency = true;

			query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ExchangeRateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOriginalCurrency) {
			qPos.add(originalCurrency);
		}

		if (bindBasicCurrency) {
			qPos.add(basicCurrency);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(exchangeRate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ExchangeRate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the exchange rates where originalCurrency = &#63; and basicCurrency = &#63; from the database.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOriginalCurrencyBasicCurrency(String originalCurrency,
		String basicCurrency) throws SystemException {
		for (ExchangeRate exchangeRate : findByOriginalCurrencyBasicCurrency(
				originalCurrency, basicCurrency, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(exchangeRate);
		}
	}

	/**
	 * Returns the number of exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @return the number of matching exchange rates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOriginalCurrencyBasicCurrency(String originalCurrency,
		String basicCurrency) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORIGINALCURRENCYBASICCURRENCY;

		Object[] finderArgs = new Object[] { originalCurrency, basicCurrency };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EXCHANGERATE_WHERE);

			boolean bindOriginalCurrency = false;

			if (originalCurrency == null) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_1);
			}
			else if (originalCurrency.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_3);
			}
			else {
				bindOriginalCurrency = true;

				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_2);
			}

			boolean bindBasicCurrency = false;

			if (basicCurrency == null) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_1);
			}
			else if (basicCurrency.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_3);
			}
			else {
				bindBasicCurrency = true;

				query.append(_FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOriginalCurrency) {
					qPos.add(originalCurrency);
				}

				if (bindBasicCurrency) {
					qPos.add(basicCurrency);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_1 =
		"exchangeRate.originalCurrency IS NULL AND ";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_2 =
		"exchangeRate.originalCurrency = ? AND ";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_3 =
		"(exchangeRate.originalCurrency IS NULL OR exchangeRate.originalCurrency = '') AND ";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_1 =
		"exchangeRate.basicCurrency IS NULL";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_2 =
		"exchangeRate.basicCurrency = ?";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_3 =
		"(exchangeRate.basicCurrency IS NULL OR exchangeRate.basicCurrency = '')";

	public ExchangeRatePersistenceImpl() {
		setModelClass(ExchangeRate.class);
	}

	/**
	 * Caches the exchange rate in the entity cache if it is enabled.
	 *
	 * @param exchangeRate the exchange rate
	 */
	@Override
	public void cacheResult(ExchangeRate exchangeRate) {
		EntityCacheUtil.putResult(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateImpl.class, exchangeRate.getPrimaryKey(), exchangeRate);

		exchangeRate.resetOriginalValues();
	}

	/**
	 * Caches the exchange rates in the entity cache if it is enabled.
	 *
	 * @param exchangeRates the exchange rates
	 */
	@Override
	public void cacheResult(List<ExchangeRate> exchangeRates) {
		for (ExchangeRate exchangeRate : exchangeRates) {
			if (EntityCacheUtil.getResult(
						ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
						ExchangeRateImpl.class, exchangeRate.getPrimaryKey()) == null) {
				cacheResult(exchangeRate);
			}
			else {
				exchangeRate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all exchange rates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ExchangeRateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ExchangeRateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the exchange rate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExchangeRate exchangeRate) {
		EntityCacheUtil.removeResult(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateImpl.class, exchangeRate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ExchangeRate> exchangeRates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ExchangeRate exchangeRate : exchangeRates) {
			EntityCacheUtil.removeResult(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
				ExchangeRateImpl.class, exchangeRate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new exchange rate with the primary key. Does not add the exchange rate to the database.
	 *
	 * @param id the primary key for the new exchange rate
	 * @return the new exchange rate
	 */
	@Override
	public ExchangeRate create(long id) {
		ExchangeRate exchangeRate = new ExchangeRateImpl();

		exchangeRate.setNew(true);
		exchangeRate.setPrimaryKey(id);

		return exchangeRate;
	}

	/**
	 * Removes the exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the exchange rate
	 * @return the exchange rate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExchangeRate remove(long id)
		throws NoSuchExchangeRateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the exchange rate
	 * @return the exchange rate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExchangeRate remove(Serializable primaryKey)
		throws NoSuchExchangeRateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ExchangeRate exchangeRate = (ExchangeRate)session.get(ExchangeRateImpl.class,
					primaryKey);

			if (exchangeRate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExchangeRateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(exchangeRate);
		}
		catch (NoSuchExchangeRateException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ExchangeRate removeImpl(ExchangeRate exchangeRate)
		throws SystemException {
		exchangeRate = toUnwrappedModel(exchangeRate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(exchangeRate)) {
				exchangeRate = (ExchangeRate)session.get(ExchangeRateImpl.class,
						exchangeRate.getPrimaryKeyObj());
			}

			if (exchangeRate != null) {
				session.delete(exchangeRate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (exchangeRate != null) {
			clearCache(exchangeRate);
		}

		return exchangeRate;
	}

	@Override
	public ExchangeRate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate exchangeRate)
		throws SystemException {
		exchangeRate = toUnwrappedModel(exchangeRate);

		boolean isNew = exchangeRate.isNew();

		ExchangeRateModelImpl exchangeRateModelImpl = (ExchangeRateModelImpl)exchangeRate;

		Session session = null;

		try {
			session = openSession();

			if (exchangeRate.isNew()) {
				session.save(exchangeRate);

				exchangeRate.setNew(false);
			}
			else {
				session.merge(exchangeRate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ExchangeRateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((exchangeRateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						exchangeRateModelImpl.getOriginalOriginalCurrency(),
						exchangeRateModelImpl.getOriginalBasicCurrency()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);

				args = new Object[] {
						exchangeRateModelImpl.getOriginalCurrency(),
						exchangeRateModelImpl.getBasicCurrency()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);
			}
		}

		EntityCacheUtil.putResult(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			ExchangeRateImpl.class, exchangeRate.getPrimaryKey(), exchangeRate);

		return exchangeRate;
	}

	protected ExchangeRate toUnwrappedModel(ExchangeRate exchangeRate) {
		if (exchangeRate instanceof ExchangeRateImpl) {
			return exchangeRate;
		}

		ExchangeRateImpl exchangeRateImpl = new ExchangeRateImpl();

		exchangeRateImpl.setNew(exchangeRate.isNew());
		exchangeRateImpl.setPrimaryKey(exchangeRate.getPrimaryKey());

		exchangeRateImpl.setId(exchangeRate.getId());
		exchangeRateImpl.setOriginalCurrency(exchangeRate.getOriginalCurrency());
		exchangeRateImpl.setBasicCurrency(exchangeRate.getBasicCurrency());
		exchangeRateImpl.setExchangeRate(exchangeRate.getExchangeRate());
		exchangeRateImpl.setPublishDate(exchangeRate.getPublishDate());
		exchangeRateImpl.setValidFrom(exchangeRate.getValidFrom());
		exchangeRateImpl.setValidUntil(exchangeRate.getValidUntil());

		return exchangeRateImpl;
	}

	/**
	 * Returns the exchange rate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the exchange rate
	 * @return the exchange rate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExchangeRate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExchangeRateException, SystemException {
		ExchangeRate exchangeRate = fetchByPrimaryKey(primaryKey);

		if (exchangeRate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExchangeRateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return exchangeRate;
	}

	/**
	 * Returns the exchange rate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException} if it could not be found.
	 *
	 * @param id the primary key of the exchange rate
	 * @return the exchange rate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException if a exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExchangeRate findByPrimaryKey(long id)
		throws NoSuchExchangeRateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the exchange rate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the exchange rate
	 * @return the exchange rate, or <code>null</code> if a exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExchangeRate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ExchangeRate exchangeRate = (ExchangeRate)EntityCacheUtil.getResult(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
				ExchangeRateImpl.class, primaryKey);

		if (exchangeRate == _nullExchangeRate) {
			return null;
		}

		if (exchangeRate == null) {
			Session session = null;

			try {
				session = openSession();

				exchangeRate = (ExchangeRate)session.get(ExchangeRateImpl.class,
						primaryKey);

				if (exchangeRate != null) {
					cacheResult(exchangeRate);
				}
				else {
					EntityCacheUtil.putResult(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
						ExchangeRateImpl.class, primaryKey, _nullExchangeRate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
					ExchangeRateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return exchangeRate;
	}

	/**
	 * Returns the exchange rate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the exchange rate
	 * @return the exchange rate, or <code>null</code> if a exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ExchangeRate fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the exchange rates.
	 *
	 * @return the exchange rates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ExchangeRate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ExchangeRate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<ExchangeRate> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ExchangeRate> list = (List<ExchangeRate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EXCHANGERATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXCHANGERATE;

				if (pagination) {
					sql = sql.concat(ExchangeRateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ExchangeRate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ExchangeRate>(list);
				}
				else {
					list = (List<ExchangeRate>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the exchange rates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ExchangeRate exchangeRate : findAll()) {
			remove(exchangeRate);
		}
	}

	/**
	 * Returns the number of exchange rates.
	 *
	 * @return the number of exchange rates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXCHANGERATE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the exchange rate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ExchangeRate>> listenersList = new ArrayList<ModelListener<ExchangeRate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ExchangeRate>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ExchangeRateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EXCHANGERATE = "SELECT exchangeRate FROM ExchangeRate exchangeRate";
	private static final String _SQL_SELECT_EXCHANGERATE_WHERE = "SELECT exchangeRate FROM ExchangeRate exchangeRate WHERE ";
	private static final String _SQL_COUNT_EXCHANGERATE = "SELECT COUNT(exchangeRate) FROM ExchangeRate exchangeRate";
	private static final String _SQL_COUNT_EXCHANGERATE_WHERE = "SELECT COUNT(exchangeRate) FROM ExchangeRate exchangeRate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "exchangeRate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ExchangeRate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ExchangeRate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ExchangeRatePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"originalCurrency", "basicCurrency", "exchangeRate",
				"publishDate", "validFrom", "validUntil"
			});
	private static ExchangeRate _nullExchangeRate = new ExchangeRateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ExchangeRate> toCacheModel() {
				return _nullExchangeRateCacheModel;
			}
		};

	private static CacheModel<ExchangeRate> _nullExchangeRateCacheModel = new CacheModel<ExchangeRate>() {
			@Override
			public ExchangeRate toEntityModel() {
				return _nullExchangeRate;
			}
		};
}