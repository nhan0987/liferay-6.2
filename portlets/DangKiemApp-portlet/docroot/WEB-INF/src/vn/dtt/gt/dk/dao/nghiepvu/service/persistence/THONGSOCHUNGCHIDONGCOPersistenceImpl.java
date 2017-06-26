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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h o n g s o c h u n g c h i d o n g c o service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIDONGCOPersistence
 * @see THONGSOCHUNGCHIDONGCOUtil
 * @generated
 */
public class THONGSOCHUNGCHIDONGCOPersistenceImpl extends BasePersistenceImpl<THONGSOCHUNGCHIDONGCO>
	implements THONGSOCHUNGCHIDONGCOPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGSOCHUNGCHIDONGCOUtil} to access the t h o n g s o c h u n g c h i d o n g c o persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGSOCHUNGCHIDONGCOImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIDONGCOModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i d o n g c os where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i d o n g c os where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i d o n g c os where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<THONGSOCHUNGCHIDONGCO> list = (List<THONGSOCHUNGCHIDONGCO>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : list) {
				if ((hoSoThuTucId != thongsochungchidongco.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIDONGCO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIDONGCOModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIDONGCO>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i d o n g c o in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchidongco != null) {
			return thongsochungchidongco;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIDONGCOException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i d o n g c o in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<THONGSOCHUNGCHIDONGCO> list = findByHoSoThuTucId(hoSoThuTucId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i d o n g c o in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchidongco != null) {
			return thongsochungchidongco;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIDONGCOException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i d o n g c o in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIDONGCO> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c os before and after the current t h o n g s o c h u n g c h i d o n g c o in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i d o n g c o
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIDONGCO[] array = new THONGSOCHUNGCHIDONGCOImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchidongco, hoSoThuTucId, orderByComparator, true);

			array[1] = thongsochungchidongco;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchidongco, hoSoThuTucId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected THONGSOCHUNGCHIDONGCO getByHoSoThuTucId_PrevAndNext(
		Session session, THONGSOCHUNGCHIDONGCO thongsochungchidongco,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIDONGCO_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

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
			query.append(THONGSOCHUNGCHIDONGCOModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchidongco);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIDONGCO> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i d o n g c os where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchidongco);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i d o n g c os where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGSOCHUNGCHIDONGCO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "thongsochungchidongco.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			THONGSOCHUNGCHIDONGCOModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i d o n g c os where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i d o n g c os where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i d o n g c os where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID;
			finderArgs = new Object[] { certificateRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID;
			finderArgs = new Object[] {
					certificateRecordId,
					
					start, end, orderByComparator
				};
		}

		List<THONGSOCHUNGCHIDONGCO> list = (List<THONGSOCHUNGCHIDONGCO>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : list) {
				if ((certificateRecordId != thongsochungchidongco.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIDONGCO_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIDONGCOModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIDONGCO>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i d o n g c o in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (thongsochungchidongco != null) {
			return thongsochungchidongco;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIDONGCOException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i d o n g c o in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIDONGCO> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i d o n g c o in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (thongsochungchidongco != null) {
			return thongsochungchidongco;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIDONGCOException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i d o n g c o in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIDONGCO> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c os before and after the current t h o n g s o c h u n g c h i d o n g c o in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i d o n g c o
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIDONGCO[] array = new THONGSOCHUNGCHIDONGCOImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchidongco, certificateRecordId,
					orderByComparator, true);

			array[1] = thongsochungchidongco;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchidongco, certificateRecordId,
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

	protected THONGSOCHUNGCHIDONGCO getByCertificateRecordId_PrevAndNext(
		Session session, THONGSOCHUNGCHIDONGCO thongsochungchidongco,
		long certificateRecordId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIDONGCO_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

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
			query.append(THONGSOCHUNGCHIDONGCOModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchidongco);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIDONGCO> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i d o n g c os where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchidongco);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i d o n g c os where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATERECORDID;

		Object[] finderArgs = new Object[] { certificateRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGSOCHUNGCHIDONGCO_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

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

	private static final String _FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2 =
		"thongsochungchidongco.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIDONGCOModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i d o n g c os where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i d o n g c os where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i d o n g c os where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID;
			finderArgs = new Object[] { vehicleGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID;
			finderArgs = new Object[] {
					vehicleGroupId,
					
					start, end, orderByComparator
				};
		}

		List<THONGSOCHUNGCHIDONGCO> list = (List<THONGSOCHUNGCHIDONGCO>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : list) {
				if ((vehicleGroupId != thongsochungchidongco.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIDONGCO_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIDONGCOModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIDONGCO>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i d o n g c o in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (thongsochungchidongco != null) {
			return thongsochungchidongco;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIDONGCOException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i d o n g c o in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIDONGCO> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i d o n g c o in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (thongsochungchidongco != null) {
			return thongsochungchidongco;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIDONGCOException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i d o n g c o in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a matching t h o n g s o c h u n g c h i d o n g c o could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIDONGCO> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c os before and after the current t h o n g s o c h u n g c h i d o n g c o in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i d o n g c o
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO[] findByVehicleGroupId_PrevAndNext(long id,
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIDONGCO[] array = new THONGSOCHUNGCHIDONGCOImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchidongco, vehicleGroupId, orderByComparator,
					true);

			array[1] = thongsochungchidongco;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchidongco, vehicleGroupId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected THONGSOCHUNGCHIDONGCO getByVehicleGroupId_PrevAndNext(
		Session session, THONGSOCHUNGCHIDONGCO thongsochungchidongco,
		long vehicleGroupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIDONGCO_WHERE);

		query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

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
			query.append(THONGSOCHUNGCHIDONGCOModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchidongco);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIDONGCO> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i d o n g c os where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchidongco);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i d o n g c os where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLEGROUPID;

		Object[] finderArgs = new Object[] { vehicleGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGSOCHUNGCHIDONGCO_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "thongsochungchidongco.vehicleGroupId = ?";

	public THONGSOCHUNGCHIDONGCOPersistenceImpl() {
		setModelClass(THONGSOCHUNGCHIDONGCO.class);
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i d o n g c o in the entity cache if it is enabled.
	 *
	 * @param thongsochungchidongco the t h o n g s o c h u n g c h i d o n g c o
	 */
	@Override
	public void cacheResult(THONGSOCHUNGCHIDONGCO thongsochungchidongco) {
		EntityCacheUtil.putResult(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			thongsochungchidongco.getPrimaryKey(), thongsochungchidongco);

		thongsochungchidongco.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i d o n g c os in the entity cache if it is enabled.
	 *
	 * @param thongsochungchidongcos the t h o n g s o c h u n g c h i d o n g c os
	 */
	@Override
	public void cacheResult(List<THONGSOCHUNGCHIDONGCO> thongsochungchidongcos) {
		for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : thongsochungchidongcos) {
			if (EntityCacheUtil.getResult(
						THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIDONGCOImpl.class,
						thongsochungchidongco.getPrimaryKey()) == null) {
				cacheResult(thongsochungchidongco);
			}
			else {
				thongsochungchidongco.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g s o c h u n g c h i d o n g c os.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGSOCHUNGCHIDONGCOImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGSOCHUNGCHIDONGCOImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g s o c h u n g c h i d o n g c o.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(THONGSOCHUNGCHIDONGCO thongsochungchidongco) {
		EntityCacheUtil.removeResult(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			thongsochungchidongco.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<THONGSOCHUNGCHIDONGCO> thongsochungchidongcos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : thongsochungchidongcos) {
			EntityCacheUtil.removeResult(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIDONGCOImpl.class,
				thongsochungchidongco.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g s o c h u n g c h i d o n g c o with the primary key. Does not add the t h o n g s o c h u n g c h i d o n g c o to the database.
	 *
	 * @param id the primary key for the new t h o n g s o c h u n g c h i d o n g c o
	 * @return the new t h o n g s o c h u n g c h i d o n g c o
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO create(long id) {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = new THONGSOCHUNGCHIDONGCOImpl();

		thongsochungchidongco.setNew(true);
		thongsochungchidongco.setPrimaryKey(id);

		return thongsochungchidongco;
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i d o n g c o with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i d o n g c o
	 * @return the t h o n g s o c h u n g c h i d o n g c o that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO remove(long id)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i d o n g c o with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i d o n g c o
	 * @return the t h o n g s o c h u n g c h i d o n g c o that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO remove(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIDONGCO thongsochungchidongco = (THONGSOCHUNGCHIDONGCO)session.get(THONGSOCHUNGCHIDONGCOImpl.class,
					primaryKey);

			if (thongsochungchidongco == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGSOCHUNGCHIDONGCOException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongsochungchidongco);
		}
		catch (NoSuchTHONGSOCHUNGCHIDONGCOException nsee) {
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
	protected THONGSOCHUNGCHIDONGCO removeImpl(
		THONGSOCHUNGCHIDONGCO thongsochungchidongco) throws SystemException {
		thongsochungchidongco = toUnwrappedModel(thongsochungchidongco);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongsochungchidongco)) {
				thongsochungchidongco = (THONGSOCHUNGCHIDONGCO)session.get(THONGSOCHUNGCHIDONGCOImpl.class,
						thongsochungchidongco.getPrimaryKeyObj());
			}

			if (thongsochungchidongco != null) {
				session.delete(thongsochungchidongco);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongsochungchidongco != null) {
			clearCache(thongsochungchidongco);
		}

		return thongsochungchidongco;
	}

	@Override
	public THONGSOCHUNGCHIDONGCO updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO thongsochungchidongco)
		throws SystemException {
		thongsochungchidongco = toUnwrappedModel(thongsochungchidongco);

		boolean isNew = thongsochungchidongco.isNew();

		THONGSOCHUNGCHIDONGCOModelImpl thongsochungchidongcoModelImpl = (THONGSOCHUNGCHIDONGCOModelImpl)thongsochungchidongco;

		Session session = null;

		try {
			session = openSession();

			if (thongsochungchidongco.isNew()) {
				session.save(thongsochungchidongco);

				thongsochungchidongco.setNew(false);
			}
			else {
				session.merge(thongsochungchidongco);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !THONGSOCHUNGCHIDONGCOModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongsochungchidongcoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchidongcoModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						thongsochungchidongcoModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((thongsochungchidongcoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchidongcoModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						thongsochungchidongcoModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((thongsochungchidongcoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchidongcoModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						thongsochungchidongcoModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIDONGCOImpl.class,
			thongsochungchidongco.getPrimaryKey(), thongsochungchidongco);

		return thongsochungchidongco;
	}

	protected THONGSOCHUNGCHIDONGCO toUnwrappedModel(
		THONGSOCHUNGCHIDONGCO thongsochungchidongco) {
		if (thongsochungchidongco instanceof THONGSOCHUNGCHIDONGCOImpl) {
			return thongsochungchidongco;
		}

		THONGSOCHUNGCHIDONGCOImpl thongsochungchidongcoImpl = new THONGSOCHUNGCHIDONGCOImpl();

		thongsochungchidongcoImpl.setNew(thongsochungchidongco.isNew());
		thongsochungchidongcoImpl.setPrimaryKey(thongsochungchidongco.getPrimaryKey());

		thongsochungchidongcoImpl.setId(thongsochungchidongco.getId());
		thongsochungchidongcoImpl.setHoSoThuTucId(thongsochungchidongco.getHoSoThuTucId());
		thongsochungchidongcoImpl.setCertificateRecordId(thongsochungchidongco.getCertificateRecordId());
		thongsochungchidongcoImpl.setVehicleGroupId(thongsochungchidongco.getVehicleGroupId());
		thongsochungchidongcoImpl.setSynchDate(thongsochungchidongco.getSynchDate());
		thongsochungchidongcoImpl.setDCX0007(thongsochungchidongco.getDCX0007());
		thongsochungchidongcoImpl.setDCX0008(thongsochungchidongco.getDCX0008());
		thongsochungchidongcoImpl.setDCX0010(thongsochungchidongco.getDCX0010());
		thongsochungchidongcoImpl.setDCX0011(thongsochungchidongco.getDCX0011());
		thongsochungchidongcoImpl.setDCX0012(thongsochungchidongco.getDCX0012());
		thongsochungchidongcoImpl.setDCX1012(thongsochungchidongco.getDCX1012());
		thongsochungchidongcoImpl.setDCX0013(thongsochungchidongco.getDCX0013());
		thongsochungchidongcoImpl.setDCX1013(thongsochungchidongco.getDCX1013());
		thongsochungchidongcoImpl.setDCX0014(thongsochungchidongco.getDCX0014());
		thongsochungchidongcoImpl.setDCX0015(thongsochungchidongco.getDCX0015());
		thongsochungchidongcoImpl.setDCX0016(thongsochungchidongco.getDCX0016());
		thongsochungchidongcoImpl.setDCX0017(thongsochungchidongco.getDCX0017());
		thongsochungchidongcoImpl.setDCX0018(thongsochungchidongco.getDCX0018());
		thongsochungchidongcoImpl.setDCX0019(thongsochungchidongco.getDCX0019());
		thongsochungchidongcoImpl.setDCX0021(thongsochungchidongco.getDCX0021());
		thongsochungchidongcoImpl.setDCX0022(thongsochungchidongco.getDCX0022());
		thongsochungchidongcoImpl.setDCX0023(thongsochungchidongco.getDCX0023());
		thongsochungchidongcoImpl.setDCX0024(thongsochungchidongco.getDCX0024());
		thongsochungchidongcoImpl.setDCX0006(thongsochungchidongco.getDCX0006());
		thongsochungchidongcoImpl.setDCX0025(thongsochungchidongco.getDCX0025());
		thongsochungchidongcoImpl.setDCX0026(thongsochungchidongco.getDCX0026());
		thongsochungchidongcoImpl.setDCX0027(thongsochungchidongco.getDCX0027());
		thongsochungchidongcoImpl.setDCX0028(thongsochungchidongco.getDCX0028());
		thongsochungchidongcoImpl.setDCX0029(thongsochungchidongco.getDCX0029());
		thongsochungchidongcoImpl.setDCX0030(thongsochungchidongco.getDCX0030());
		thongsochungchidongcoImpl.setDCX0031(thongsochungchidongco.getDCX0031());

		return thongsochungchidongcoImpl;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c o with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i d o n g c o
	 * @return the t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = fetchByPrimaryKey(primaryKey);

		if (thongsochungchidongco == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGSOCHUNGCHIDONGCOException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongsochungchidongco;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c o with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i d o n g c o
	 * @return the t h o n g s o c h u n g c h i d o n g c o
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO findByPrimaryKey(long id)
		throws NoSuchTHONGSOCHUNGCHIDONGCOException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c o with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i d o n g c o
	 * @return the t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		THONGSOCHUNGCHIDONGCO thongsochungchidongco = (THONGSOCHUNGCHIDONGCO)EntityCacheUtil.getResult(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIDONGCOImpl.class, primaryKey);

		if (thongsochungchidongco == _nullTHONGSOCHUNGCHIDONGCO) {
			return null;
		}

		if (thongsochungchidongco == null) {
			Session session = null;

			try {
				session = openSession();

				thongsochungchidongco = (THONGSOCHUNGCHIDONGCO)session.get(THONGSOCHUNGCHIDONGCOImpl.class,
						primaryKey);

				if (thongsochungchidongco != null) {
					cacheResult(thongsochungchidongco);
				}
				else {
					EntityCacheUtil.putResult(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIDONGCOImpl.class, primaryKey,
						_nullTHONGSOCHUNGCHIDONGCO);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGSOCHUNGCHIDONGCOModelImpl.ENTITY_CACHE_ENABLED,
					THONGSOCHUNGCHIDONGCOImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongsochungchidongco;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c o with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i d o n g c o
	 * @return the t h o n g s o c h u n g c h i d o n g c o, or <code>null</code> if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIDONGCO fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g s o c h u n g c h i d o n g c os.
	 *
	 * @return the t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i d o n g c os.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @return the range of t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i d o n g c os.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g s o c h u n g c h i d o n g c os
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIDONGCO> findAll(int start, int end,
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

		List<THONGSOCHUNGCHIDONGCO> list = (List<THONGSOCHUNGCHIDONGCO>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGSOCHUNGCHIDONGCO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGSOCHUNGCHIDONGCO;

				if (pagination) {
					sql = sql.concat(THONGSOCHUNGCHIDONGCOModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIDONGCO>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIDONGCO>)QueryUtil.list(q,
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
	 * Removes all the t h o n g s o c h u n g c h i d o n g c os from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGSOCHUNGCHIDONGCO thongsochungchidongco : findAll()) {
			remove(thongsochungchidongco);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i d o n g c os.
	 *
	 * @return the number of t h o n g s o c h u n g c h i d o n g c os
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

				Query q = session.createQuery(_SQL_COUNT_THONGSOCHUNGCHIDONGCO);

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

	/**
	 * Initializes the t h o n g s o c h u n g c h i d o n g c o persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGSOCHUNGCHIDONGCO>> listenersList = new ArrayList<ModelListener<THONGSOCHUNGCHIDONGCO>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGSOCHUNGCHIDONGCO>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGSOCHUNGCHIDONGCOImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGSOCHUNGCHIDONGCO = "SELECT thongsochungchidongco FROM THONGSOCHUNGCHIDONGCO thongsochungchidongco";
	private static final String _SQL_SELECT_THONGSOCHUNGCHIDONGCO_WHERE = "SELECT thongsochungchidongco FROM THONGSOCHUNGCHIDONGCO thongsochungchidongco WHERE ";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIDONGCO = "SELECT COUNT(thongsochungchidongco) FROM THONGSOCHUNGCHIDONGCO thongsochungchidongco";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIDONGCO_WHERE = "SELECT COUNT(thongsochungchidongco) FROM THONGSOCHUNGCHIDONGCO thongsochungchidongco WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongsochungchidongco.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGSOCHUNGCHIDONGCO exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGSOCHUNGCHIDONGCO exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIDONGCOPersistenceImpl.class);
	private static THONGSOCHUNGCHIDONGCO _nullTHONGSOCHUNGCHIDONGCO = new THONGSOCHUNGCHIDONGCOImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGSOCHUNGCHIDONGCO> toCacheModel() {
				return _nullTHONGSOCHUNGCHIDONGCOCacheModel;
			}
		};

	private static CacheModel<THONGSOCHUNGCHIDONGCO> _nullTHONGSOCHUNGCHIDONGCOCacheModel =
		new CacheModel<THONGSOCHUNGCHIDONGCO>() {
			@Override
			public THONGSOCHUNGCHIDONGCO toEntityModel() {
				return _nullTHONGSOCHUNGCHIDONGCO;
			}
		};
}