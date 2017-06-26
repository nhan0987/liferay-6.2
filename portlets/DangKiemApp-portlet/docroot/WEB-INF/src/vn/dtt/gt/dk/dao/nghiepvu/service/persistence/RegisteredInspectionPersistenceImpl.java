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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the registered inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see RegisteredInspectionPersistence
 * @see RegisteredInspectionUtil
 * @generated
 */
public class RegisteredInspectionPersistenceImpl extends BasePersistenceImpl<RegisteredInspection>
	implements RegisteredInspectionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RegisteredInspectionUtil} to access the registered inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RegisteredInspectionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED,
			RegisteredInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED,
			RegisteredInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED,
			RegisteredInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED,
			RegisteredInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName() },
			RegisteredInspectionModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the registered inspections where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisteredInspection> findByDossierId(long dossierId)
		throws SystemException {
		return findByDossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the registered inspections where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of registered inspections
	 * @param end the upper bound of the range of registered inspections (not inclusive)
	 * @return the range of matching registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisteredInspection> findByDossierId(long dossierId,
		int start, int end) throws SystemException {
		return findByDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registered inspections where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of registered inspections
	 * @param end the upper bound of the range of registered inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisteredInspection> findByDossierId(long dossierId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<RegisteredInspection> list = (List<RegisteredInspection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RegisteredInspection registeredInspection : list) {
				if ((dossierId != registeredInspection.getDossierId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_REGISTEREDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegisteredInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<RegisteredInspection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RegisteredInspection>(list);
				}
				else {
					list = (List<RegisteredInspection>)QueryUtil.list(q,
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
	 * Returns the first registered inspection in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registered inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection findByDossierId_First(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchRegisteredInspectionException, SystemException {
		RegisteredInspection registeredInspection = fetchByDossierId_First(dossierId,
				orderByComparator);

		if (registeredInspection != null) {
			return registeredInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegisteredInspectionException(msg.toString());
	}

	/**
	 * Returns the first registered inspection in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection fetchByDossierId_First(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RegisteredInspection> list = findByDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registered inspection in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registered inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection findByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchRegisteredInspectionException, SystemException {
		RegisteredInspection registeredInspection = fetchByDossierId_Last(dossierId,
				orderByComparator);

		if (registeredInspection != null) {
			return registeredInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegisteredInspectionException(msg.toString());
	}

	/**
	 * Returns the last registered inspection in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection fetchByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<RegisteredInspection> list = findByDossierId(dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registered inspections before and after the current registered inspection in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current registered inspection
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registered inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection[] findByDossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator orderByComparator)
		throws NoSuchRegisteredInspectionException, SystemException {
		RegisteredInspection registeredInspection = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegisteredInspection[] array = new RegisteredInspectionImpl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					registeredInspection, dossierId, orderByComparator, true);

			array[1] = registeredInspection;

			array[2] = getByDossierId_PrevAndNext(session,
					registeredInspection, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RegisteredInspection getByDossierId_PrevAndNext(Session session,
		RegisteredInspection registeredInspection, long dossierId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REGISTEREDINSPECTION_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

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
			query.append(RegisteredInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registeredInspection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegisteredInspection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registered inspections where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDossierId(long dossierId) throws SystemException {
		for (RegisteredInspection registeredInspection : findByDossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registeredInspection);
		}
	}

	/**
	 * Returns the number of registered inspections where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierId(long dossierId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTEREDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "registeredInspection.dossierId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_REGISTEREDNUMBER = new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED,
			RegisteredInspectionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRegisteredNumber", new String[] { String.class.getName() },
			RegisteredInspectionModelImpl.REGISTEREDNUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDNUMBER = new FinderPath(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredNumber", new String[] { String.class.getName() });

	/**
	 * Returns the registered inspection where registeredNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException} if it could not be found.
	 *
	 * @param registeredNumber the registered number
	 * @return the matching registered inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection findByRegisteredNumber(String registeredNumber)
		throws NoSuchRegisteredInspectionException, SystemException {
		RegisteredInspection registeredInspection = fetchByRegisteredNumber(registeredNumber);

		if (registeredInspection == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("registeredNumber=");
			msg.append(registeredNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchRegisteredInspectionException(msg.toString());
		}

		return registeredInspection;
	}

	/**
	 * Returns the registered inspection where registeredNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registeredNumber the registered number
	 * @return the matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection fetchByRegisteredNumber(String registeredNumber)
		throws SystemException {
		return fetchByRegisteredNumber(registeredNumber, true);
	}

	/**
	 * Returns the registered inspection where registeredNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registeredNumber the registered number
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection fetchByRegisteredNumber(
		String registeredNumber, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { registeredNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
					finderArgs, this);
		}

		if (result instanceof RegisteredInspection) {
			RegisteredInspection registeredInspection = (RegisteredInspection)result;

			if (!Validator.equals(registeredNumber,
						registeredInspection.getRegisteredNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_REGISTEREDINSPECTION_WHERE);

			boolean bindRegisteredNumber = false;

			if (registeredNumber == null) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
			}
			else if (registeredNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisteredNumber = true;

				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisteredNumber) {
					qPos.add(registeredNumber);
				}

				List<RegisteredInspection> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"RegisteredInspectionPersistenceImpl.fetchByRegisteredNumber(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					RegisteredInspection registeredInspection = list.get(0);

					result = registeredInspection;

					cacheResult(registeredInspection);

					if ((registeredInspection.getRegisteredNumber() == null) ||
							!registeredInspection.getRegisteredNumber()
													 .equals(registeredNumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
							finderArgs, registeredInspection);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (RegisteredInspection)result;
		}
	}

	/**
	 * Removes the registered inspection where registeredNumber = &#63; from the database.
	 *
	 * @param registeredNumber the registered number
	 * @return the registered inspection that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection removeByRegisteredNumber(
		String registeredNumber)
		throws NoSuchRegisteredInspectionException, SystemException {
		RegisteredInspection registeredInspection = findByRegisteredNumber(registeredNumber);

		return remove(registeredInspection);
	}

	/**
	 * Returns the number of registered inspections where registeredNumber = &#63;.
	 *
	 * @param registeredNumber the registered number
	 * @return the number of matching registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegisteredNumber(String registeredNumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTEREDNUMBER;

		Object[] finderArgs = new Object[] { registeredNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTEREDINSPECTION_WHERE);

			boolean bindRegisteredNumber = false;

			if (registeredNumber == null) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
			}
			else if (registeredNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisteredNumber = true;

				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisteredNumber) {
					qPos.add(registeredNumber);
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

	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1 =
		"registeredInspection.registeredNumber IS NULL";
	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2 =
		"registeredInspection.registeredNumber = ?";
	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3 =
		"(registeredInspection.registeredNumber IS NULL OR registeredInspection.registeredNumber = '')";

	public RegisteredInspectionPersistenceImpl() {
		setModelClass(RegisteredInspection.class);
	}

	/**
	 * Caches the registered inspection in the entity cache if it is enabled.
	 *
	 * @param registeredInspection the registered inspection
	 */
	@Override
	public void cacheResult(RegisteredInspection registeredInspection) {
		EntityCacheUtil.putResult(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionImpl.class,
			registeredInspection.getPrimaryKey(), registeredInspection);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
			new Object[] { registeredInspection.getRegisteredNumber() },
			registeredInspection);

		registeredInspection.resetOriginalValues();
	}

	/**
	 * Caches the registered inspections in the entity cache if it is enabled.
	 *
	 * @param registeredInspections the registered inspections
	 */
	@Override
	public void cacheResult(List<RegisteredInspection> registeredInspections) {
		for (RegisteredInspection registeredInspection : registeredInspections) {
			if (EntityCacheUtil.getResult(
						RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
						RegisteredInspectionImpl.class,
						registeredInspection.getPrimaryKey()) == null) {
				cacheResult(registeredInspection);
			}
			else {
				registeredInspection.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all registered inspections.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RegisteredInspectionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RegisteredInspectionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the registered inspection.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RegisteredInspection registeredInspection) {
		EntityCacheUtil.removeResult(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionImpl.class, registeredInspection.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(registeredInspection);
	}

	@Override
	public void clearCache(List<RegisteredInspection> registeredInspections) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RegisteredInspection registeredInspection : registeredInspections) {
			EntityCacheUtil.removeResult(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
				RegisteredInspectionImpl.class,
				registeredInspection.getPrimaryKey());

			clearUniqueFindersCache(registeredInspection);
		}
	}

	protected void cacheUniqueFindersCache(
		RegisteredInspection registeredInspection) {
		if (registeredInspection.isNew()) {
			Object[] args = new Object[] {
					registeredInspection.getRegisteredNumber()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
				args, registeredInspection);
		}
		else {
			RegisteredInspectionModelImpl registeredInspectionModelImpl = (RegisteredInspectionModelImpl)registeredInspection;

			if ((registeredInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REGISTEREDNUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registeredInspection.getRegisteredNumber()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
					args, registeredInspection);
			}
		}
	}

	protected void clearUniqueFindersCache(
		RegisteredInspection registeredInspection) {
		RegisteredInspectionModelImpl registeredInspectionModelImpl = (RegisteredInspectionModelImpl)registeredInspection;

		Object[] args = new Object[] { registeredInspection.getRegisteredNumber() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER, args);

		if ((registeredInspectionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REGISTEREDNUMBER.getColumnBitmask()) != 0) {
			args = new Object[] {
					registeredInspectionModelImpl.getOriginalRegisteredNumber()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTEREDNUMBER,
				args);
		}
	}

	/**
	 * Creates a new registered inspection with the primary key. Does not add the registered inspection to the database.
	 *
	 * @param id the primary key for the new registered inspection
	 * @return the new registered inspection
	 */
	@Override
	public RegisteredInspection create(long id) {
		RegisteredInspection registeredInspection = new RegisteredInspectionImpl();

		registeredInspection.setNew(true);
		registeredInspection.setPrimaryKey(id);

		return registeredInspection;
	}

	/**
	 * Removes the registered inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the registered inspection
	 * @return the registered inspection that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection remove(long id)
		throws NoSuchRegisteredInspectionException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the registered inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the registered inspection
	 * @return the registered inspection that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection remove(Serializable primaryKey)
		throws NoSuchRegisteredInspectionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RegisteredInspection registeredInspection = (RegisteredInspection)session.get(RegisteredInspectionImpl.class,
					primaryKey);

			if (registeredInspection == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegisteredInspectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(registeredInspection);
		}
		catch (NoSuchRegisteredInspectionException nsee) {
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
	protected RegisteredInspection removeImpl(
		RegisteredInspection registeredInspection) throws SystemException {
		registeredInspection = toUnwrappedModel(registeredInspection);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(registeredInspection)) {
				registeredInspection = (RegisteredInspection)session.get(RegisteredInspectionImpl.class,
						registeredInspection.getPrimaryKeyObj());
			}

			if (registeredInspection != null) {
				session.delete(registeredInspection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (registeredInspection != null) {
			clearCache(registeredInspection);
		}

		return registeredInspection;
	}

	@Override
	public RegisteredInspection updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection)
		throws SystemException {
		registeredInspection = toUnwrappedModel(registeredInspection);

		boolean isNew = registeredInspection.isNew();

		RegisteredInspectionModelImpl registeredInspectionModelImpl = (RegisteredInspectionModelImpl)registeredInspection;

		Session session = null;

		try {
			session = openSession();

			if (registeredInspection.isNew()) {
				session.save(registeredInspection);

				registeredInspection.setNew(false);
			}
			else {
				session.merge(registeredInspection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RegisteredInspectionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((registeredInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registeredInspectionModelImpl.getOriginalDossierId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] { registeredInspectionModelImpl.getDossierId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}
		}

		EntityCacheUtil.putResult(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
			RegisteredInspectionImpl.class,
			registeredInspection.getPrimaryKey(), registeredInspection);

		clearUniqueFindersCache(registeredInspection);
		cacheUniqueFindersCache(registeredInspection);

		return registeredInspection;
	}

	protected RegisteredInspection toUnwrappedModel(
		RegisteredInspection registeredInspection) {
		if (registeredInspection instanceof RegisteredInspectionImpl) {
			return registeredInspection;
		}

		RegisteredInspectionImpl registeredInspectionImpl = new RegisteredInspectionImpl();

		registeredInspectionImpl.setNew(registeredInspection.isNew());
		registeredInspectionImpl.setPrimaryKey(registeredInspection.getPrimaryKey());

		registeredInspectionImpl.setId(registeredInspection.getId());
		registeredInspectionImpl.setRegisteredNumber(registeredInspection.getRegisteredNumber());
		registeredInspectionImpl.setDossierId(registeredInspection.getDossierId());
		registeredInspectionImpl.setAttachedFile(registeredInspection.getAttachedFile());
		registeredInspectionImpl.setImporterCode(registeredInspection.getImporterCode());
		registeredInspectionImpl.setImporterName(registeredInspection.getImporterName());
		registeredInspectionImpl.setImporterAddress(registeredInspection.getImporterAddress());
		registeredInspectionImpl.setRepresentative(registeredInspection.getRepresentative());
		registeredInspectionImpl.setPhone(registeredInspection.getPhone());
		registeredInspectionImpl.setFax(registeredInspection.getFax());
		registeredInspectionImpl.setEmail(registeredInspection.getEmail());
		registeredInspectionImpl.setInspectionDate(registeredInspection.getInspectionDate());
		registeredInspectionImpl.setInspectionSite(registeredInspection.getInspectionSite());
		registeredInspectionImpl.setInspectionDistrictCode(registeredInspection.getInspectionDistrictCode());
		registeredInspectionImpl.setInspectionProvinceCode(registeredInspection.getInspectionProvinceCode());
		registeredInspectionImpl.setContactName(registeredInspection.getContactName());
		registeredInspectionImpl.setContactPhone(registeredInspection.getContactPhone());
		registeredInspectionImpl.setContactEmail(registeredInspection.getContactEmail());
		registeredInspectionImpl.setImporterSignName(registeredInspection.getImporterSignName());
		registeredInspectionImpl.setImporterSignTitle(registeredInspection.getImporterSignTitle());
		registeredInspectionImpl.setImporterSignPlace(registeredInspection.getImporterSignPlace());
		registeredInspectionImpl.setImporterSignDate(registeredInspection.getImporterSignDate());
		registeredInspectionImpl.setInspectorOrganization(registeredInspection.getInspectorOrganization());
		registeredInspectionImpl.setInspectorDivision(registeredInspection.getInspectorDivision());
		registeredInspectionImpl.setInspectorSigNname(registeredInspection.getInspectorSigNname());
		registeredInspectionImpl.setInspectorSignTitle(registeredInspection.getInspectorSignTitle());
		registeredInspectionImpl.setInspectorSignPlace(registeredInspection.getInspectorSignPlace());
		registeredInspectionImpl.setInspectorSignDate(registeredInspection.getInspectorSignDate());
		registeredInspectionImpl.setSynchDate(registeredInspection.getSynchDate());

		return registeredInspectionImpl;
	}

	/**
	 * Returns the registered inspection with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the registered inspection
	 * @return the registered inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRegisteredInspectionException, SystemException {
		RegisteredInspection registeredInspection = fetchByPrimaryKey(primaryKey);

		if (registeredInspection == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRegisteredInspectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return registeredInspection;
	}

	/**
	 * Returns the registered inspection with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException} if it could not be found.
	 *
	 * @param id the primary key of the registered inspection
	 * @return the registered inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection findByPrimaryKey(long id)
		throws NoSuchRegisteredInspectionException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the registered inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the registered inspection
	 * @return the registered inspection, or <code>null</code> if a registered inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RegisteredInspection registeredInspection = (RegisteredInspection)EntityCacheUtil.getResult(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
				RegisteredInspectionImpl.class, primaryKey);

		if (registeredInspection == _nullRegisteredInspection) {
			return null;
		}

		if (registeredInspection == null) {
			Session session = null;

			try {
				session = openSession();

				registeredInspection = (RegisteredInspection)session.get(RegisteredInspectionImpl.class,
						primaryKey);

				if (registeredInspection != null) {
					cacheResult(registeredInspection);
				}
				else {
					EntityCacheUtil.putResult(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
						RegisteredInspectionImpl.class, primaryKey,
						_nullRegisteredInspection);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RegisteredInspectionModelImpl.ENTITY_CACHE_ENABLED,
					RegisteredInspectionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return registeredInspection;
	}

	/**
	 * Returns the registered inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the registered inspection
	 * @return the registered inspection, or <code>null</code> if a registered inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegisteredInspection fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the registered inspections.
	 *
	 * @return the registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisteredInspection> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registered inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registered inspections
	 * @param end the upper bound of the range of registered inspections (not inclusive)
	 * @return the range of registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisteredInspection> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the registered inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registered inspections
	 * @param end the upper bound of the range of registered inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of registered inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegisteredInspection> findAll(int start, int end,
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

		List<RegisteredInspection> list = (List<RegisteredInspection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REGISTEREDINSPECTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGISTEREDINSPECTION;

				if (pagination) {
					sql = sql.concat(RegisteredInspectionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RegisteredInspection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RegisteredInspection>(list);
				}
				else {
					list = (List<RegisteredInspection>)QueryUtil.list(q,
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
	 * Removes all the registered inspections from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RegisteredInspection registeredInspection : findAll()) {
			remove(registeredInspection);
		}
	}

	/**
	 * Returns the number of registered inspections.
	 *
	 * @return the number of registered inspections
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

				Query q = session.createQuery(_SQL_COUNT_REGISTEREDINSPECTION);

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
	 * Initializes the registered inspection persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RegisteredInspection>> listenersList = new ArrayList<ModelListener<RegisteredInspection>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RegisteredInspection>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RegisteredInspectionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REGISTEREDINSPECTION = "SELECT registeredInspection FROM RegisteredInspection registeredInspection";
	private static final String _SQL_SELECT_REGISTEREDINSPECTION_WHERE = "SELECT registeredInspection FROM RegisteredInspection registeredInspection WHERE ";
	private static final String _SQL_COUNT_REGISTEREDINSPECTION = "SELECT COUNT(registeredInspection) FROM RegisteredInspection registeredInspection";
	private static final String _SQL_COUNT_REGISTEREDINSPECTION_WHERE = "SELECT COUNT(registeredInspection) FROM RegisteredInspection registeredInspection WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "registeredInspection.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RegisteredInspection exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RegisteredInspection exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RegisteredInspectionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredNumber", "dossierId", "attachedFile", "importerCode",
				"importerName", "importerAddress", "inspectionDate",
				"inspectionSite", "inspectionDistrictCode",
				"inspectionProvinceCode", "contactName", "contactPhone",
				"contactEmail", "importerSignName", "importerSignTitle",
				"importerSignPlace", "importerSignDate", "inspectorOrganization",
				"inspectorDivision", "inspectorSigNname", "inspectorSignTitle",
				"inspectorSignPlace", "inspectorSignDate", "SynchDate"
			});
	private static RegisteredInspection _nullRegisteredInspection = new RegisteredInspectionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RegisteredInspection> toCacheModel() {
				return _nullRegisteredInspectionCacheModel;
			}
		};

	private static CacheModel<RegisteredInspection> _nullRegisteredInspectionCacheModel =
		new CacheModel<RegisteredInspection>() {
			@Override
			public RegisteredInspection toEntityModel() {
				return _nullRegisteredInspection;
			}
		};
}