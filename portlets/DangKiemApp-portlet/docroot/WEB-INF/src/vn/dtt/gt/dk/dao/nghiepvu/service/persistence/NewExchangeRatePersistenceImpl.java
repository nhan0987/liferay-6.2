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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException;
import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the new exchange rate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see NewExchangeRatePersistence
 * @see NewExchangeRateUtil
 * @generated
 */
public class NewExchangeRatePersistenceImpl extends BasePersistenceImpl<NewExchangeRate>
	implements NewExchangeRatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NewExchangeRateUtil} to access the new exchange rate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NewExchangeRateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateModelImpl.FINDER_CACHE_ENABLED,
			NewExchangeRateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateModelImpl.FINDER_CACHE_ENABLED,
			NewExchangeRateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY =
		new FinderPath(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateModelImpl.FINDER_CACHE_ENABLED,
			NewExchangeRateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOriginalCurrencyBasicCurrency",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY =
		new FinderPath(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateModelImpl.FINDER_CACHE_ENABLED,
			NewExchangeRateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOriginalCurrencyBasicCurrency",
			new String[] { String.class.getName(), String.class.getName() },
			NewExchangeRateModelImpl.ORIGINALCURRENCY_COLUMN_BITMASK |
			NewExchangeRateModelImpl.BASICCURRENCY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORIGINALCURRENCYBASICCURRENCY =
		new FinderPath(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOriginalCurrencyBasicCurrency",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the new exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @return the matching new exchange rates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewExchangeRate> findByOriginalCurrencyBasicCurrency(
		String originalCurrency, String basicCurrency)
		throws SystemException {
		return findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<NewExchangeRate> findByOriginalCurrencyBasicCurrency(
		String originalCurrency, String basicCurrency, int start, int end)
		throws SystemException {
		return findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency, start, end, null);
	}

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
	@Override
	public List<NewExchangeRate> findByOriginalCurrencyBasicCurrency(
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

		List<NewExchangeRate> list = (List<NewExchangeRate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NewExchangeRate newExchangeRate : list) {
				if (!Validator.equals(originalCurrency,
							newExchangeRate.getOriginalCurrency()) ||
						!Validator.equals(basicCurrency,
							newExchangeRate.getBasicCurrency())) {
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

			query.append(_SQL_SELECT_NEWEXCHANGERATE_WHERE);

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
				query.append(NewExchangeRateModelImpl.ORDER_BY_JPQL);
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
					list = (List<NewExchangeRate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NewExchangeRate>(list);
				}
				else {
					list = (List<NewExchangeRate>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching new exchange rate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a matching new exchange rate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate findByOriginalCurrencyBasicCurrency_First(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator)
		throws NoSuchNewExchangeRateException, SystemException {
		NewExchangeRate newExchangeRate = fetchByOriginalCurrencyBasicCurrency_First(originalCurrency,
				basicCurrency, orderByComparator);

		if (newExchangeRate != null) {
			return newExchangeRate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("originalCurrency=");
		msg.append(originalCurrency);

		msg.append(", basicCurrency=");
		msg.append(basicCurrency);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNewExchangeRateException(msg.toString());
	}

	/**
	 * Returns the first new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching new exchange rate, or <code>null</code> if a matching new exchange rate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate fetchByOriginalCurrencyBasicCurrency_First(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator) throws SystemException {
		List<NewExchangeRate> list = findByOriginalCurrencyBasicCurrency(originalCurrency,
				basicCurrency, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public NewExchangeRate findByOriginalCurrencyBasicCurrency_Last(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator)
		throws NoSuchNewExchangeRateException, SystemException {
		NewExchangeRate newExchangeRate = fetchByOriginalCurrencyBasicCurrency_Last(originalCurrency,
				basicCurrency, orderByComparator);

		if (newExchangeRate != null) {
			return newExchangeRate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("originalCurrency=");
		msg.append(originalCurrency);

		msg.append(", basicCurrency=");
		msg.append(basicCurrency);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNewExchangeRateException(msg.toString());
	}

	/**
	 * Returns the last new exchange rate in the ordered set where originalCurrency = &#63; and basicCurrency = &#63;.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching new exchange rate, or <code>null</code> if a matching new exchange rate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate fetchByOriginalCurrencyBasicCurrency_Last(
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByOriginalCurrencyBasicCurrency(originalCurrency,
				basicCurrency);

		if (count == 0) {
			return null;
		}

		List<NewExchangeRate> list = findByOriginalCurrencyBasicCurrency(originalCurrency,
				basicCurrency, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public NewExchangeRate[] findByOriginalCurrencyBasicCurrency_PrevAndNext(
		long id, String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator)
		throws NoSuchNewExchangeRateException, SystemException {
		NewExchangeRate newExchangeRate = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			NewExchangeRate[] array = new NewExchangeRateImpl[3];

			array[0] = getByOriginalCurrencyBasicCurrency_PrevAndNext(session,
					newExchangeRate, originalCurrency, basicCurrency,
					orderByComparator, true);

			array[1] = newExchangeRate;

			array[2] = getByOriginalCurrencyBasicCurrency_PrevAndNext(session,
					newExchangeRate, originalCurrency, basicCurrency,
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

	protected NewExchangeRate getByOriginalCurrencyBasicCurrency_PrevAndNext(
		Session session, NewExchangeRate newExchangeRate,
		String originalCurrency, String basicCurrency,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NEWEXCHANGERATE_WHERE);

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
			query.append(NewExchangeRateModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(newExchangeRate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NewExchangeRate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the new exchange rates where originalCurrency = &#63; and basicCurrency = &#63; from the database.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOriginalCurrencyBasicCurrency(String originalCurrency,
		String basicCurrency) throws SystemException {
		for (NewExchangeRate newExchangeRate : findByOriginalCurrencyBasicCurrency(
				originalCurrency, basicCurrency, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(newExchangeRate);
		}
	}

	/**
	 * Returns the number of new exchange rates where originalCurrency = &#63; and basicCurrency = &#63;.
	 *
	 * @param originalCurrency the original currency
	 * @param basicCurrency the basic currency
	 * @return the number of matching new exchange rates
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

			query.append(_SQL_COUNT_NEWEXCHANGERATE_WHERE);

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
		"newExchangeRate.originalCurrency IS NULL AND ";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_2 =
		"newExchangeRate.originalCurrency = ? AND ";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_ORIGINALCURRENCY_3 =
		"(newExchangeRate.originalCurrency IS NULL OR newExchangeRate.originalCurrency = '') AND ";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_1 =
		"newExchangeRate.basicCurrency IS NULL";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_2 =
		"newExchangeRate.basicCurrency = ?";
	private static final String _FINDER_COLUMN_ORIGINALCURRENCYBASICCURRENCY_BASICCURRENCY_3 =
		"(newExchangeRate.basicCurrency IS NULL OR newExchangeRate.basicCurrency = '')";

	public NewExchangeRatePersistenceImpl() {
		setModelClass(NewExchangeRate.class);
	}

	/**
	 * Caches the new exchange rate in the entity cache if it is enabled.
	 *
	 * @param newExchangeRate the new exchange rate
	 */
	@Override
	public void cacheResult(NewExchangeRate newExchangeRate) {
		EntityCacheUtil.putResult(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateImpl.class, newExchangeRate.getPrimaryKey(),
			newExchangeRate);

		newExchangeRate.resetOriginalValues();
	}

	/**
	 * Caches the new exchange rates in the entity cache if it is enabled.
	 *
	 * @param newExchangeRates the new exchange rates
	 */
	@Override
	public void cacheResult(List<NewExchangeRate> newExchangeRates) {
		for (NewExchangeRate newExchangeRate : newExchangeRates) {
			if (EntityCacheUtil.getResult(
						NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
						NewExchangeRateImpl.class,
						newExchangeRate.getPrimaryKey()) == null) {
				cacheResult(newExchangeRate);
			}
			else {
				newExchangeRate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all new exchange rates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NewExchangeRateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NewExchangeRateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the new exchange rate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NewExchangeRate newExchangeRate) {
		EntityCacheUtil.removeResult(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateImpl.class, newExchangeRate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NewExchangeRate> newExchangeRates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NewExchangeRate newExchangeRate : newExchangeRates) {
			EntityCacheUtil.removeResult(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
				NewExchangeRateImpl.class, newExchangeRate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new new exchange rate with the primary key. Does not add the new exchange rate to the database.
	 *
	 * @param id the primary key for the new new exchange rate
	 * @return the new new exchange rate
	 */
	@Override
	public NewExchangeRate create(long id) {
		NewExchangeRate newExchangeRate = new NewExchangeRateImpl();

		newExchangeRate.setNew(true);
		newExchangeRate.setPrimaryKey(id);

		return newExchangeRate;
	}

	/**
	 * Removes the new exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the new exchange rate
	 * @return the new exchange rate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a new exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate remove(long id)
		throws NoSuchNewExchangeRateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the new exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the new exchange rate
	 * @return the new exchange rate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a new exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate remove(Serializable primaryKey)
		throws NoSuchNewExchangeRateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NewExchangeRate newExchangeRate = (NewExchangeRate)session.get(NewExchangeRateImpl.class,
					primaryKey);

			if (newExchangeRate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewExchangeRateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(newExchangeRate);
		}
		catch (NoSuchNewExchangeRateException nsee) {
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
	protected NewExchangeRate removeImpl(NewExchangeRate newExchangeRate)
		throws SystemException {
		newExchangeRate = toUnwrappedModel(newExchangeRate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newExchangeRate)) {
				newExchangeRate = (NewExchangeRate)session.get(NewExchangeRateImpl.class,
						newExchangeRate.getPrimaryKeyObj());
			}

			if (newExchangeRate != null) {
				session.delete(newExchangeRate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (newExchangeRate != null) {
			clearCache(newExchangeRate);
		}

		return newExchangeRate;
	}

	@Override
	public NewExchangeRate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate newExchangeRate)
		throws SystemException {
		newExchangeRate = toUnwrappedModel(newExchangeRate);

		boolean isNew = newExchangeRate.isNew();

		NewExchangeRateModelImpl newExchangeRateModelImpl = (NewExchangeRateModelImpl)newExchangeRate;

		Session session = null;

		try {
			session = openSession();

			if (newExchangeRate.isNew()) {
				session.save(newExchangeRate);

				newExchangeRate.setNew(false);
			}
			else {
				session.merge(newExchangeRate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NewExchangeRateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((newExchangeRateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						newExchangeRateModelImpl.getOriginalOriginalCurrency(),
						newExchangeRateModelImpl.getOriginalBasicCurrency()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);

				args = new Object[] {
						newExchangeRateModelImpl.getOriginalCurrency(),
						newExchangeRateModelImpl.getBasicCurrency()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALCURRENCYBASICCURRENCY,
					args);
			}
		}

		EntityCacheUtil.putResult(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
			NewExchangeRateImpl.class, newExchangeRate.getPrimaryKey(),
			newExchangeRate);

		return newExchangeRate;
	}

	protected NewExchangeRate toUnwrappedModel(NewExchangeRate newExchangeRate) {
		if (newExchangeRate instanceof NewExchangeRateImpl) {
			return newExchangeRate;
		}

		NewExchangeRateImpl newExchangeRateImpl = new NewExchangeRateImpl();

		newExchangeRateImpl.setNew(newExchangeRate.isNew());
		newExchangeRateImpl.setPrimaryKey(newExchangeRate.getPrimaryKey());

		newExchangeRateImpl.setId(newExchangeRate.getId());
		newExchangeRateImpl.setOriginalCurrency(newExchangeRate.getOriginalCurrency());
		newExchangeRateImpl.setBasicCurrency(newExchangeRate.getBasicCurrency());
		newExchangeRateImpl.setExchangeRate(newExchangeRate.getExchangeRate());
		newExchangeRateImpl.setPublishDate(newExchangeRate.getPublishDate());
		newExchangeRateImpl.setValidFrom(newExchangeRate.getValidFrom());
		newExchangeRateImpl.setValidUntil(newExchangeRate.getValidUntil());

		return newExchangeRateImpl;
	}

	/**
	 * Returns the new exchange rate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the new exchange rate
	 * @return the new exchange rate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a new exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewExchangeRateException, SystemException {
		NewExchangeRate newExchangeRate = fetchByPrimaryKey(primaryKey);

		if (newExchangeRate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewExchangeRateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return newExchangeRate;
	}

	/**
	 * Returns the new exchange rate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException} if it could not be found.
	 *
	 * @param id the primary key of the new exchange rate
	 * @return the new exchange rate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException if a new exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate findByPrimaryKey(long id)
		throws NoSuchNewExchangeRateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the new exchange rate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the new exchange rate
	 * @return the new exchange rate, or <code>null</code> if a new exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NewExchangeRate newExchangeRate = (NewExchangeRate)EntityCacheUtil.getResult(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
				NewExchangeRateImpl.class, primaryKey);

		if (newExchangeRate == _nullNewExchangeRate) {
			return null;
		}

		if (newExchangeRate == null) {
			Session session = null;

			try {
				session = openSession();

				newExchangeRate = (NewExchangeRate)session.get(NewExchangeRateImpl.class,
						primaryKey);

				if (newExchangeRate != null) {
					cacheResult(newExchangeRate);
				}
				else {
					EntityCacheUtil.putResult(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
						NewExchangeRateImpl.class, primaryKey,
						_nullNewExchangeRate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NewExchangeRateModelImpl.ENTITY_CACHE_ENABLED,
					NewExchangeRateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return newExchangeRate;
	}

	/**
	 * Returns the new exchange rate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the new exchange rate
	 * @return the new exchange rate, or <code>null</code> if a new exchange rate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NewExchangeRate fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the new exchange rates.
	 *
	 * @return the new exchange rates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NewExchangeRate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<NewExchangeRate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<NewExchangeRate> findAll(int start, int end,
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

		List<NewExchangeRate> list = (List<NewExchangeRate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NEWEXCHANGERATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NEWEXCHANGERATE;

				if (pagination) {
					sql = sql.concat(NewExchangeRateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NewExchangeRate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NewExchangeRate>(list);
				}
				else {
					list = (List<NewExchangeRate>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the new exchange rates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NewExchangeRate newExchangeRate : findAll()) {
			remove(newExchangeRate);
		}
	}

	/**
	 * Returns the number of new exchange rates.
	 *
	 * @return the number of new exchange rates
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

				Query q = session.createQuery(_SQL_COUNT_NEWEXCHANGERATE);

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
	 * Initializes the new exchange rate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NewExchangeRate>> listenersList = new ArrayList<ModelListener<NewExchangeRate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NewExchangeRate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NewExchangeRateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NEWEXCHANGERATE = "SELECT newExchangeRate FROM NewExchangeRate newExchangeRate";
	private static final String _SQL_SELECT_NEWEXCHANGERATE_WHERE = "SELECT newExchangeRate FROM NewExchangeRate newExchangeRate WHERE ";
	private static final String _SQL_COUNT_NEWEXCHANGERATE = "SELECT COUNT(newExchangeRate) FROM NewExchangeRate newExchangeRate";
	private static final String _SQL_COUNT_NEWEXCHANGERATE_WHERE = "SELECT COUNT(newExchangeRate) FROM NewExchangeRate newExchangeRate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "newExchangeRate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NewExchangeRate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NewExchangeRate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NewExchangeRatePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"originalCurrency", "basicCurrency", "exchangeRate",
				"publishDate", "validFrom", "validUntil"
			});
	private static NewExchangeRate _nullNewExchangeRate = new NewExchangeRateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NewExchangeRate> toCacheModel() {
				return _nullNewExchangeRateCacheModel;
			}
		};

	private static CacheModel<NewExchangeRate> _nullNewExchangeRateCacheModel = new CacheModel<NewExchangeRate>() {
			@Override
			public NewExchangeRate toEntityModel() {
				return _nullNewExchangeRate;
			}
		};
}