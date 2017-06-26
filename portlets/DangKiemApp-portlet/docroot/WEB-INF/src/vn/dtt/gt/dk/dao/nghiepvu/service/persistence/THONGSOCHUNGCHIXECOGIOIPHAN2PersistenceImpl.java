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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2Impl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOIPHAN2Persistence
 * @see THONGSOCHUNGCHIXECOGIOIPHAN2Util
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2PersistenceImpl
	extends BasePersistenceImpl<THONGSOCHUNGCHIXECOGIOIPHAN2>
	implements THONGSOCHUNGCHIXECOGIOIPHAN2Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGSOCHUNGCHIXECOGIOIPHAN2Util} to access the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByHoSoThuTucId(
		long hoSoThuTucId) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : list) {
				if ((hoSoThuTucId != thongsochungchixecogioiphan2.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOIPHAN2>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixecogioiphan2 != null) {
			return thongsochungchixecogioiphan2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = findByHoSoThuTucId(hoSoThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByHoSoThuTucId_Last(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixecogioiphan2 != null) {
			return thongsochungchixecogioiphan2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByHoSoThuTucId_Last(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s before and after the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOIPHAN2[] array = new THONGSOCHUNGCHIXECOGIOIPHAN2Impl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixecogioiphan2, hoSoThuTucId,
					orderByComparator, true);

			array[1] = thongsochungchixecogioiphan2;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixecogioiphan2, hoSoThuTucId,
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

	protected THONGSOCHUNGCHIXECOGIOIPHAN2 getByHoSoThuTucId_PrevAndNext(
		Session session,
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

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
			query.append(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixecogioiphan2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixecogioiphan2);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "thongsochungchixecogioiphan2.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByCertificateRecordId(
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

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : list) {
				if ((certificateRecordId != thongsochungchixecogioiphan2.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOIPHAN2>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (thongsochungchixecogioiphan2 != null) {
			return thongsochungchixecogioiphan2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (thongsochungchixecogioiphan2 != null) {
			return thongsochungchixecogioiphan2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s before and after the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOIPHAN2[] array = new THONGSOCHUNGCHIXECOGIOIPHAN2Impl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixecogioiphan2, certificateRecordId,
					orderByComparator, true);

			array[1] = thongsochungchixecogioiphan2;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixecogioiphan2, certificateRecordId,
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

	protected THONGSOCHUNGCHIXECOGIOIPHAN2 getByCertificateRecordId_PrevAndNext(
		Session session,
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

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
			query.append(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixecogioiphan2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixecogioiphan2);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

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
		"thongsochungchixecogioiphan2.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleGroupId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByVehicleGroupId(
		long vehicleGroupId) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findByVehicleGroupId(
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

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : list) {
				if ((vehicleGroupId != thongsochungchixecogioiphan2.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOIPHAN2>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixecogioiphan2 != null) {
			return thongsochungchixecogioiphan2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixecogioiphan2 != null) {
			return thongsochungchixecogioiphan2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s before and after the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOIPHAN2[] array = new THONGSOCHUNGCHIXECOGIOIPHAN2Impl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixecogioiphan2, vehicleGroupId,
					orderByComparator, true);

			array[1] = thongsochungchixecogioiphan2;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixecogioiphan2, vehicleGroupId,
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

	protected THONGSOCHUNGCHIXECOGIOIPHAN2 getByVehicleGroupId_PrevAndNext(
		Session session,
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

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
			query.append(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixecogioiphan2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixecogioiphan2);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "thongsochungchixecogioiphan2.vehicleGroupId = ?";

	public THONGSOCHUNGCHIXECOGIOIPHAN2PersistenceImpl() {
		setModelClass(THONGSOCHUNGCHIXECOGIOIPHAN2.class);
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixecogioiphan2 the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 */
	@Override
	public void cacheResult(
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2) {
		EntityCacheUtil.putResult(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			thongsochungchixecogioiphan2.getPrimaryKey(),
			thongsochungchixecogioiphan2);

		thongsochungchixecogioiphan2.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixecogioiphan2s the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 */
	@Override
	public void cacheResult(
		List<THONGSOCHUNGCHIXECOGIOIPHAN2> thongsochungchixecogioiphan2s) {
		for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : thongsochungchixecogioiphan2s) {
			if (EntityCacheUtil.getResult(
						THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
						thongsochungchixecogioiphan2.getPrimaryKey()) == null) {
				cacheResult(thongsochungchixecogioiphan2);
			}
			else {
				thongsochungchixecogioiphan2.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g s o c h u n g c h i x e c o g i o i p h a n2.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2) {
		EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			thongsochungchixecogioiphan2.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<THONGSOCHUNGCHIXECOGIOIPHAN2> thongsochungchixecogioiphan2s) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : thongsochungchixecogioiphan2s) {
			EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
				thongsochungchixecogioiphan2.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key. Does not add the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 to the database.
	 *
	 * @param id the primary key for the new t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @return the new t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 create(long id) {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = new THONGSOCHUNGCHIXECOGIOIPHAN2Impl();

		thongsochungchixecogioiphan2.setNew(true);
		thongsochungchixecogioiphan2.setPrimaryKey(id);

		return thongsochungchixecogioiphan2;
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 remove(long id)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 remove(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = (THONGSOCHUNGCHIXECOGIOIPHAN2)session.get(THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
					primaryKey);

			if (thongsochungchixecogioiphan2 == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongsochungchixecogioiphan2);
		}
		catch (NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception nsee) {
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
	protected THONGSOCHUNGCHIXECOGIOIPHAN2 removeImpl(
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2)
		throws SystemException {
		thongsochungchixecogioiphan2 = toUnwrappedModel(thongsochungchixecogioiphan2);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongsochungchixecogioiphan2)) {
				thongsochungchixecogioiphan2 = (THONGSOCHUNGCHIXECOGIOIPHAN2)session.get(THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
						thongsochungchixecogioiphan2.getPrimaryKeyObj());
			}

			if (thongsochungchixecogioiphan2 != null) {
				session.delete(thongsochungchixecogioiphan2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongsochungchixecogioiphan2 != null) {
			clearCache(thongsochungchixecogioiphan2);
		}

		return thongsochungchixecogioiphan2;
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2)
		throws SystemException {
		thongsochungchixecogioiphan2 = toUnwrappedModel(thongsochungchixecogioiphan2);

		boolean isNew = thongsochungchixecogioiphan2.isNew();

		THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl thongsochungchixecogioiphan2ModelImpl =
			(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl)thongsochungchixecogioiphan2;

		Session session = null;

		try {
			session = openSession();

			if (thongsochungchixecogioiphan2.isNew()) {
				session.save(thongsochungchixecogioiphan2);

				thongsochungchixecogioiphan2.setNew(false);
			}
			else {
				session.merge(thongsochungchixecogioiphan2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongsochungchixecogioiphan2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixecogioiphan2ModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						thongsochungchixecogioiphan2ModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((thongsochungchixecogioiphan2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixecogioiphan2ModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						thongsochungchixecogioiphan2ModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((thongsochungchixecogioiphan2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixecogioiphan2ModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						thongsochungchixecogioiphan2ModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
			thongsochungchixecogioiphan2.getPrimaryKey(),
			thongsochungchixecogioiphan2);

		return thongsochungchixecogioiphan2;
	}

	protected THONGSOCHUNGCHIXECOGIOIPHAN2 toUnwrappedModel(
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2) {
		if (thongsochungchixecogioiphan2 instanceof THONGSOCHUNGCHIXECOGIOIPHAN2Impl) {
			return thongsochungchixecogioiphan2;
		}

		THONGSOCHUNGCHIXECOGIOIPHAN2Impl thongsochungchixecogioiphan2Impl = new THONGSOCHUNGCHIXECOGIOIPHAN2Impl();

		thongsochungchixecogioiphan2Impl.setNew(thongsochungchixecogioiphan2.isNew());
		thongsochungchixecogioiphan2Impl.setPrimaryKey(thongsochungchixecogioiphan2.getPrimaryKey());

		thongsochungchixecogioiphan2Impl.setId(thongsochungchixecogioiphan2.getId());
		thongsochungchixecogioiphan2Impl.setHoSoThuTucId(thongsochungchixecogioiphan2.getHoSoThuTucId());
		thongsochungchixecogioiphan2Impl.setCertificateRecordId(thongsochungchixecogioiphan2.getCertificateRecordId());
		thongsochungchixecogioiphan2Impl.setVehicleGroupId(thongsochungchixecogioiphan2.getVehicleGroupId());
		thongsochungchixecogioiphan2Impl.setSynchDate(thongsochungchixecogioiphan2.getSynchDate());
		thongsochungchixecogioiphan2Impl.setXCG0129(thongsochungchixecogioiphan2.getXCG0129());
		thongsochungchixecogioiphan2Impl.setXCG0130(thongsochungchixecogioiphan2.getXCG0130());
		thongsochungchixecogioiphan2Impl.setXCG0131(thongsochungchixecogioiphan2.getXCG0131());
		thongsochungchixecogioiphan2Impl.setXCG0132(thongsochungchixecogioiphan2.getXCG0132());
		thongsochungchixecogioiphan2Impl.setXCG0133(thongsochungchixecogioiphan2.getXCG0133());
		thongsochungchixecogioiphan2Impl.setXCG0134(thongsochungchixecogioiphan2.getXCG0134());
		thongsochungchixecogioiphan2Impl.setXCG0135(thongsochungchixecogioiphan2.getXCG0135());
		thongsochungchixecogioiphan2Impl.setXCG2135(thongsochungchixecogioiphan2.getXCG2135());
		thongsochungchixecogioiphan2Impl.setXCG0136(thongsochungchixecogioiphan2.getXCG0136());
		thongsochungchixecogioiphan2Impl.setXCG2136(thongsochungchixecogioiphan2.getXCG2136());
		thongsochungchixecogioiphan2Impl.setXCG0137(thongsochungchixecogioiphan2.getXCG0137());
		thongsochungchixecogioiphan2Impl.setXCG2137(thongsochungchixecogioiphan2.getXCG2137());
		thongsochungchixecogioiphan2Impl.setXCG0138(thongsochungchixecogioiphan2.getXCG0138());
		thongsochungchixecogioiphan2Impl.setXCG2138(thongsochungchixecogioiphan2.getXCG2138());
		thongsochungchixecogioiphan2Impl.setXCG0139(thongsochungchixecogioiphan2.getXCG0139());
		thongsochungchixecogioiphan2Impl.setXCG2139(thongsochungchixecogioiphan2.getXCG2139());
		thongsochungchixecogioiphan2Impl.setXCG0140(thongsochungchixecogioiphan2.getXCG0140());
		thongsochungchixecogioiphan2Impl.setXCG2140(thongsochungchixecogioiphan2.getXCG2140());
		thongsochungchixecogioiphan2Impl.setXCG0141(thongsochungchixecogioiphan2.getXCG0141());
		thongsochungchixecogioiphan2Impl.setXCG2141(thongsochungchixecogioiphan2.getXCG2141());
		thongsochungchixecogioiphan2Impl.setXCG0142(thongsochungchixecogioiphan2.getXCG0142());
		thongsochungchixecogioiphan2Impl.setXCG2142(thongsochungchixecogioiphan2.getXCG2142());
		thongsochungchixecogioiphan2Impl.setXCG0143(thongsochungchixecogioiphan2.getXCG0143());
		thongsochungchixecogioiphan2Impl.setXCG2143(thongsochungchixecogioiphan2.getXCG2143());
		thongsochungchixecogioiphan2Impl.setXCG0144(thongsochungchixecogioiphan2.getXCG0144());
		thongsochungchixecogioiphan2Impl.setXCG2144(thongsochungchixecogioiphan2.getXCG2144());
		thongsochungchixecogioiphan2Impl.setXCG0145(thongsochungchixecogioiphan2.getXCG0145());
		thongsochungchixecogioiphan2Impl.setXCG2145(thongsochungchixecogioiphan2.getXCG2145());
		thongsochungchixecogioiphan2Impl.setXCG2245(thongsochungchixecogioiphan2.getXCG2245());
		thongsochungchixecogioiphan2Impl.setXCG0146(thongsochungchixecogioiphan2.getXCG0146());
		thongsochungchixecogioiphan2Impl.setXCG2146(thongsochungchixecogioiphan2.getXCG2146());
		thongsochungchixecogioiphan2Impl.setXCG2246(thongsochungchixecogioiphan2.getXCG2246());
		thongsochungchixecogioiphan2Impl.setXCG0147(thongsochungchixecogioiphan2.getXCG0147());
		thongsochungchixecogioiphan2Impl.setXCG2147(thongsochungchixecogioiphan2.getXCG2147());
		thongsochungchixecogioiphan2Impl.setXCG2247(thongsochungchixecogioiphan2.getXCG2247());
		thongsochungchixecogioiphan2Impl.setXCG0148(thongsochungchixecogioiphan2.getXCG0148());
		thongsochungchixecogioiphan2Impl.setXCG2148(thongsochungchixecogioiphan2.getXCG2148());
		thongsochungchixecogioiphan2Impl.setXCG2248(thongsochungchixecogioiphan2.getXCG2248());
		thongsochungchixecogioiphan2Impl.setXCG0149(thongsochungchixecogioiphan2.getXCG0149());
		thongsochungchixecogioiphan2Impl.setXCG2149(thongsochungchixecogioiphan2.getXCG2149());
		thongsochungchixecogioiphan2Impl.setXCG2249(thongsochungchixecogioiphan2.getXCG2249());
		thongsochungchixecogioiphan2Impl.setXCG0150(thongsochungchixecogioiphan2.getXCG0150());
		thongsochungchixecogioiphan2Impl.setXCG2150(thongsochungchixecogioiphan2.getXCG2150());
		thongsochungchixecogioiphan2Impl.setXCG2250(thongsochungchixecogioiphan2.getXCG2250());
		thongsochungchixecogioiphan2Impl.setXCG0151(thongsochungchixecogioiphan2.getXCG0151());
		thongsochungchixecogioiphan2Impl.setXCG2151(thongsochungchixecogioiphan2.getXCG2151());
		thongsochungchixecogioiphan2Impl.setXCG2251(thongsochungchixecogioiphan2.getXCG2251());
		thongsochungchixecogioiphan2Impl.setXCG0152(thongsochungchixecogioiphan2.getXCG0152());
		thongsochungchixecogioiphan2Impl.setXCG2152(thongsochungchixecogioiphan2.getXCG2152());
		thongsochungchixecogioiphan2Impl.setXCG2252(thongsochungchixecogioiphan2.getXCG2252());
		thongsochungchixecogioiphan2Impl.setXCG0153(thongsochungchixecogioiphan2.getXCG0153());
		thongsochungchixecogioiphan2Impl.setXCG2153(thongsochungchixecogioiphan2.getXCG2153());
		thongsochungchixecogioiphan2Impl.setXCG2253(thongsochungchixecogioiphan2.getXCG2253());
		thongsochungchixecogioiphan2Impl.setXCG0154(thongsochungchixecogioiphan2.getXCG0154());
		thongsochungchixecogioiphan2Impl.setXCG2154(thongsochungchixecogioiphan2.getXCG2154());
		thongsochungchixecogioiphan2Impl.setXCG2254(thongsochungchixecogioiphan2.getXCG2254());
		thongsochungchixecogioiphan2Impl.setXCG0155(thongsochungchixecogioiphan2.getXCG0155());
		thongsochungchixecogioiphan2Impl.setXCG0156(thongsochungchixecogioiphan2.getXCG0156());
		thongsochungchixecogioiphan2Impl.setXCG0242(thongsochungchixecogioiphan2.getXCG0242());
		thongsochungchixecogioiphan2Impl.setXCG0157(thongsochungchixecogioiphan2.getXCG0157());
		thongsochungchixecogioiphan2Impl.setXCG0158(thongsochungchixecogioiphan2.getXCG0158());
		thongsochungchixecogioiphan2Impl.setXCG0159(thongsochungchixecogioiphan2.getXCG0159());
		thongsochungchixecogioiphan2Impl.setXCG0160(thongsochungchixecogioiphan2.getXCG0160());
		thongsochungchixecogioiphan2Impl.setXCG0243(thongsochungchixecogioiphan2.getXCG0243());
		thongsochungchixecogioiphan2Impl.setXCG0161(thongsochungchixecogioiphan2.getXCG0161());
		thongsochungchixecogioiphan2Impl.setXCG0162(thongsochungchixecogioiphan2.getXCG0162());
		thongsochungchixecogioiphan2Impl.setXCG0163(thongsochungchixecogioiphan2.getXCG0163());
		thongsochungchixecogioiphan2Impl.setXCG0164(thongsochungchixecogioiphan2.getXCG0164());
		thongsochungchixecogioiphan2Impl.setXCG0244(thongsochungchixecogioiphan2.getXCG0244());
		thongsochungchixecogioiphan2Impl.setXCG0165(thongsochungchixecogioiphan2.getXCG0165());
		thongsochungchixecogioiphan2Impl.setXCG0166(thongsochungchixecogioiphan2.getXCG0166());
		thongsochungchixecogioiphan2Impl.setXCG0167(thongsochungchixecogioiphan2.getXCG0167());
		thongsochungchixecogioiphan2Impl.setXCG0168(thongsochungchixecogioiphan2.getXCG0168());
		thongsochungchixecogioiphan2Impl.setXCG0245(thongsochungchixecogioiphan2.getXCG0245());
		thongsochungchixecogioiphan2Impl.setXCG0169(thongsochungchixecogioiphan2.getXCG0169());
		thongsochungchixecogioiphan2Impl.setXCG0170(thongsochungchixecogioiphan2.getXCG0170());
		thongsochungchixecogioiphan2Impl.setXCG0171(thongsochungchixecogioiphan2.getXCG0171());
		thongsochungchixecogioiphan2Impl.setXCG0172(thongsochungchixecogioiphan2.getXCG0172());
		thongsochungchixecogioiphan2Impl.setXCG0246(thongsochungchixecogioiphan2.getXCG0246());
		thongsochungchixecogioiphan2Impl.setXCG0173(thongsochungchixecogioiphan2.getXCG0173());
		thongsochungchixecogioiphan2Impl.setXCG0174(thongsochungchixecogioiphan2.getXCG0174());
		thongsochungchixecogioiphan2Impl.setXCG0175(thongsochungchixecogioiphan2.getXCG0175());
		thongsochungchixecogioiphan2Impl.setXCG0176(thongsochungchixecogioiphan2.getXCG0176());
		thongsochungchixecogioiphan2Impl.setXCG0247(thongsochungchixecogioiphan2.getXCG0247());
		thongsochungchixecogioiphan2Impl.setXCG0177(thongsochungchixecogioiphan2.getXCG0177());
		thongsochungchixecogioiphan2Impl.setXCG0178(thongsochungchixecogioiphan2.getXCG0178());
		thongsochungchixecogioiphan2Impl.setXCG0179(thongsochungchixecogioiphan2.getXCG0179());
		thongsochungchixecogioiphan2Impl.setXCG0180(thongsochungchixecogioiphan2.getXCG0180());
		thongsochungchixecogioiphan2Impl.setXCG0248(thongsochungchixecogioiphan2.getXCG0248());
		thongsochungchixecogioiphan2Impl.setXCG0181(thongsochungchixecogioiphan2.getXCG0181());
		thongsochungchixecogioiphan2Impl.setXCG0182(thongsochungchixecogioiphan2.getXCG0182());
		thongsochungchixecogioiphan2Impl.setXCG0183(thongsochungchixecogioiphan2.getXCG0183());
		thongsochungchixecogioiphan2Impl.setXCG0184(thongsochungchixecogioiphan2.getXCG0184());
		thongsochungchixecogioiphan2Impl.setXCG0249(thongsochungchixecogioiphan2.getXCG0249());
		thongsochungchixecogioiphan2Impl.setXCG0185(thongsochungchixecogioiphan2.getXCG0185());
		thongsochungchixecogioiphan2Impl.setXCG0186(thongsochungchixecogioiphan2.getXCG0186());
		thongsochungchixecogioiphan2Impl.setXCG0187(thongsochungchixecogioiphan2.getXCG0187());
		thongsochungchixecogioiphan2Impl.setXCG0188(thongsochungchixecogioiphan2.getXCG0188());
		thongsochungchixecogioiphan2Impl.setXCG0250(thongsochungchixecogioiphan2.getXCG0250());
		thongsochungchixecogioiphan2Impl.setXCG0189(thongsochungchixecogioiphan2.getXCG0189());
		thongsochungchixecogioiphan2Impl.setXCG0190(thongsochungchixecogioiphan2.getXCG0190());
		thongsochungchixecogioiphan2Impl.setXCG0191(thongsochungchixecogioiphan2.getXCG0191());
		thongsochungchixecogioiphan2Impl.setXCG0192(thongsochungchixecogioiphan2.getXCG0192());
		thongsochungchixecogioiphan2Impl.setXCG0251(thongsochungchixecogioiphan2.getXCG0251());
		thongsochungchixecogioiphan2Impl.setXCG0193(thongsochungchixecogioiphan2.getXCG0193());
		thongsochungchixecogioiphan2Impl.setXCG0194(thongsochungchixecogioiphan2.getXCG0194());
		thongsochungchixecogioiphan2Impl.setXCG0195(thongsochungchixecogioiphan2.getXCG0195());
		thongsochungchixecogioiphan2Impl.setXCG0196(thongsochungchixecogioiphan2.getXCG0196());
		thongsochungchixecogioiphan2Impl.setXCG0197(thongsochungchixecogioiphan2.getXCG0197());
		thongsochungchixecogioiphan2Impl.setXCG0198(thongsochungchixecogioiphan2.getXCG0198());
		thongsochungchixecogioiphan2Impl.setXCG0199(thongsochungchixecogioiphan2.getXCG0199());
		thongsochungchixecogioiphan2Impl.setXCG0200(thongsochungchixecogioiphan2.getXCG0200());
		thongsochungchixecogioiphan2Impl.setXCG0201(thongsochungchixecogioiphan2.getXCG0201());
		thongsochungchixecogioiphan2Impl.setXCG0202(thongsochungchixecogioiphan2.getXCG0202());
		thongsochungchixecogioiphan2Impl.setXCG0203(thongsochungchixecogioiphan2.getXCG0203());
		thongsochungchixecogioiphan2Impl.setXCG0204(thongsochungchixecogioiphan2.getXCG0204());
		thongsochungchixecogioiphan2Impl.setXCG0205(thongsochungchixecogioiphan2.getXCG0205());
		thongsochungchixecogioiphan2Impl.setXCG0206(thongsochungchixecogioiphan2.getXCG0206());
		thongsochungchixecogioiphan2Impl.setXCG0207(thongsochungchixecogioiphan2.getXCG0207());
		thongsochungchixecogioiphan2Impl.setXCG0208(thongsochungchixecogioiphan2.getXCG0208());
		thongsochungchixecogioiphan2Impl.setXCG0209(thongsochungchixecogioiphan2.getXCG0209());
		thongsochungchixecogioiphan2Impl.setXCG0210(thongsochungchixecogioiphan2.getXCG0210());
		thongsochungchixecogioiphan2Impl.setXCG0211(thongsochungchixecogioiphan2.getXCG0211());
		thongsochungchixecogioiphan2Impl.setXCG0212(thongsochungchixecogioiphan2.getXCG0212());
		thongsochungchixecogioiphan2Impl.setXCG0213(thongsochungchixecogioiphan2.getXCG0213());
		thongsochungchixecogioiphan2Impl.setXCG0214(thongsochungchixecogioiphan2.getXCG0214());
		thongsochungchixecogioiphan2Impl.setXCG0215(thongsochungchixecogioiphan2.getXCG0215());
		thongsochungchixecogioiphan2Impl.setXCG0216(thongsochungchixecogioiphan2.getXCG0216());
		thongsochungchixecogioiphan2Impl.setXCG0217(thongsochungchixecogioiphan2.getXCG0217());
		thongsochungchixecogioiphan2Impl.setXCG0218(thongsochungchixecogioiphan2.getXCG0218());
		thongsochungchixecogioiphan2Impl.setXCG0219(thongsochungchixecogioiphan2.getXCG0219());
		thongsochungchixecogioiphan2Impl.setXCG2218(thongsochungchixecogioiphan2.getXCG2218());
		thongsochungchixecogioiphan2Impl.setXCG2219(thongsochungchixecogioiphan2.getXCG2219());
		thongsochungchixecogioiphan2Impl.setXCG0220(thongsochungchixecogioiphan2.getXCG0220());
		thongsochungchixecogioiphan2Impl.setXCG2220(thongsochungchixecogioiphan2.getXCG2220());
		thongsochungchixecogioiphan2Impl.setXCG0221(thongsochungchixecogioiphan2.getXCG0221());
		thongsochungchixecogioiphan2Impl.setXCG2221(thongsochungchixecogioiphan2.getXCG2221());
		thongsochungchixecogioiphan2Impl.setXCG0222(thongsochungchixecogioiphan2.getXCG0222());
		thongsochungchixecogioiphan2Impl.setXCG2222(thongsochungchixecogioiphan2.getXCG2222());
		thongsochungchixecogioiphan2Impl.setXCG0223(thongsochungchixecogioiphan2.getXCG0223());
		thongsochungchixecogioiphan2Impl.setXCG2223(thongsochungchixecogioiphan2.getXCG2223());
		thongsochungchixecogioiphan2Impl.setXCG0224(thongsochungchixecogioiphan2.getXCG0224());
		thongsochungchixecogioiphan2Impl.setXCG2224(thongsochungchixecogioiphan2.getXCG2224());
		thongsochungchixecogioiphan2Impl.setXCG0225(thongsochungchixecogioiphan2.getXCG0225());
		thongsochungchixecogioiphan2Impl.setXCG2225(thongsochungchixecogioiphan2.getXCG2225());
		thongsochungchixecogioiphan2Impl.setXCG0226(thongsochungchixecogioiphan2.getXCG0226());
		thongsochungchixecogioiphan2Impl.setXCG2226(thongsochungchixecogioiphan2.getXCG2226());
		thongsochungchixecogioiphan2Impl.setXCG0227(thongsochungchixecogioiphan2.getXCG0227());
		thongsochungchixecogioiphan2Impl.setXCG2227(thongsochungchixecogioiphan2.getXCG2227());
		thongsochungchixecogioiphan2Impl.setXCG0228(thongsochungchixecogioiphan2.getXCG0228());
		thongsochungchixecogioiphan2Impl.setXCG2228(thongsochungchixecogioiphan2.getXCG2228());
		thongsochungchixecogioiphan2Impl.setXCG0229(thongsochungchixecogioiphan2.getXCG0229());
		thongsochungchixecogioiphan2Impl.setXCG2229(thongsochungchixecogioiphan2.getXCG2229());
		thongsochungchixecogioiphan2Impl.setXCG0230(thongsochungchixecogioiphan2.getXCG0230());
		thongsochungchixecogioiphan2Impl.setXCG2230(thongsochungchixecogioiphan2.getXCG2230());
		thongsochungchixecogioiphan2Impl.setXCG0231(thongsochungchixecogioiphan2.getXCG0231());
		thongsochungchixecogioiphan2Impl.setXCG2231(thongsochungchixecogioiphan2.getXCG2231());
		thongsochungchixecogioiphan2Impl.setXCG0232(thongsochungchixecogioiphan2.getXCG0232());
		thongsochungchixecogioiphan2Impl.setXCG2232(thongsochungchixecogioiphan2.getXCG2232());
		thongsochungchixecogioiphan2Impl.setXCG0233(thongsochungchixecogioiphan2.getXCG0233());
		thongsochungchixecogioiphan2Impl.setXCG2233(thongsochungchixecogioiphan2.getXCG2233());
		thongsochungchixecogioiphan2Impl.setXCG0234(thongsochungchixecogioiphan2.getXCG0234());
		thongsochungchixecogioiphan2Impl.setXCG0235(thongsochungchixecogioiphan2.getXCG0235());
		thongsochungchixecogioiphan2Impl.setXCG2235(thongsochungchixecogioiphan2.getXCG2235());
		thongsochungchixecogioiphan2Impl.setXCG0236(thongsochungchixecogioiphan2.getXCG0236());
		thongsochungchixecogioiphan2Impl.setXCG0237(thongsochungchixecogioiphan2.getXCG0237());

		return thongsochungchixecogioiphan2Impl;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = fetchByPrimaryKey(primaryKey);

		if (thongsochungchixecogioiphan2 == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongsochungchixecogioiphan2;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 findByPrimaryKey(long id)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 = (THONGSOCHUNGCHIXECOGIOIPHAN2)EntityCacheUtil.getResult(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class, primaryKey);

		if (thongsochungchixecogioiphan2 == _nullTHONGSOCHUNGCHIXECOGIOIPHAN2) {
			return null;
		}

		if (thongsochungchixecogioiphan2 == null) {
			Session session = null;

			try {
				session = openSession();

				thongsochungchixecogioiphan2 = (THONGSOCHUNGCHIXECOGIOIPHAN2)session.get(THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class,
						primaryKey);

				if (thongsochungchixecogioiphan2 != null) {
					cacheResult(thongsochungchixecogioiphan2);
				}
				else {
					EntityCacheUtil.putResult(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class, primaryKey,
						_nullTHONGSOCHUNGCHIXECOGIOIPHAN2);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ENTITY_CACHE_ENABLED,
					THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongsochungchixecogioiphan2;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @return the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findAll(int start, int end,
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

		List<THONGSOCHUNGCHIXECOGIOIPHAN2> list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2;

				if (pagination) {
					sql = sql.concat(THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOIPHAN2>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOIPHAN2>)QueryUtil.list(q,
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
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 : findAll()) {
			remove(thongsochungchixecogioiphan2);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	 *
	 * @return the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
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

				Query q = session.createQuery(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOIPHAN2);

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
	 * Initializes the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGSOCHUNGCHIXECOGIOIPHAN2>> listenersList = new ArrayList<ModelListener<THONGSOCHUNGCHIXECOGIOIPHAN2>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGSOCHUNGCHIXECOGIOIPHAN2>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGSOCHUNGCHIXECOGIOIPHAN2Impl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2 = "SELECT thongsochungchixecogioiphan2 FROM THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2";
	private static final String _SQL_SELECT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE = "SELECT thongsochungchixecogioiphan2 FROM THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 WHERE ";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXECOGIOIPHAN2 = "SELECT COUNT(thongsochungchixecogioiphan2) FROM THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXECOGIOIPHAN2_WHERE = "SELECT COUNT(thongsochungchixecogioiphan2) FROM THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongsochungchixecogioiphan2.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGSOCHUNGCHIXECOGIOIPHAN2 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGSOCHUNGCHIXECOGIOIPHAN2 exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXECOGIOIPHAN2PersistenceImpl.class);
	private static THONGSOCHUNGCHIXECOGIOIPHAN2 _nullTHONGSOCHUNGCHIXECOGIOIPHAN2 =
		new THONGSOCHUNGCHIXECOGIOIPHAN2Impl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGSOCHUNGCHIXECOGIOIPHAN2> toCacheModel() {
				return _nullTHONGSOCHUNGCHIXECOGIOIPHAN2CacheModel;
			}
		};

	private static CacheModel<THONGSOCHUNGCHIXECOGIOIPHAN2> _nullTHONGSOCHUNGCHIXECOGIOIPHAN2CacheModel =
		new CacheModel<THONGSOCHUNGCHIXECOGIOIPHAN2>() {
			@Override
			public THONGSOCHUNGCHIXECOGIOIPHAN2 toEntityModel() {
				return _nullTHONGSOCHUNGCHIXECOGIOIPHAN2;
			}
		};
}