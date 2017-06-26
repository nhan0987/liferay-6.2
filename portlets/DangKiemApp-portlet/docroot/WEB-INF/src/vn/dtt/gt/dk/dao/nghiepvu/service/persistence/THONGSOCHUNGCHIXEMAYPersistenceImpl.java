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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h o n g s o c h u n g c h i x e m a y service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEMAYPersistence
 * @see THONGSOCHUNGCHIXEMAYUtil
 * @generated
 */
public class THONGSOCHUNGCHIXEMAYPersistenceImpl extends BasePersistenceImpl<THONGSOCHUNGCHIXEMAY>
	implements THONGSOCHUNGCHIXEMAYPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGSOCHUNGCHIXEMAYUtil} to access the t h o n g s o c h u n g c h i x e m a y persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGSOCHUNGCHIXEMAYImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEMAYModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByHoSoThuTucId(long hoSoThuTucId,
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

		List<THONGSOCHUNGCHIXEMAY> list = (List<THONGSOCHUNGCHIXEMAY>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : list) {
				if ((hoSoThuTucId != thongsochungchixemay.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEMAY_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEMAYModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEMAY>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixemay != null) {
			return thongsochungchixemay;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEMAYException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<THONGSOCHUNGCHIXEMAY> list = findByHoSoThuTucId(hoSoThuTucId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixemay != null) {
			return thongsochungchixemay;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEMAYException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEMAY> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a ies before and after the current t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e m a y
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEMAY[] array = new THONGSOCHUNGCHIXEMAYImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixemay, hoSoThuTucId, orderByComparator, true);

			array[1] = thongsochungchixemay;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixemay, hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected THONGSOCHUNGCHIXEMAY getByHoSoThuTucId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEMAY thongsochungchixemay,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEMAY_WHERE);

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
			query.append(THONGSOCHUNGCHIXEMAYModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixemay);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEMAY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixemay);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e m a ies
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEMAY_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "thongsochungchixemay.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEMAYModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByCertificateRecordId(
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

		List<THONGSOCHUNGCHIXEMAY> list = (List<THONGSOCHUNGCHIXEMAY>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : list) {
				if ((certificateRecordId != thongsochungchixemay.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEMAY_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEMAYModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEMAY>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (thongsochungchixemay != null) {
			return thongsochungchixemay;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEMAYException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEMAY> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (thongsochungchixemay != null) {
			return thongsochungchixemay;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEMAYException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEMAY> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a ies before and after the current t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e m a y
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEMAY[] array = new THONGSOCHUNGCHIXEMAYImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixemay, certificateRecordId,
					orderByComparator, true);

			array[1] = thongsochungchixemay;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixemay, certificateRecordId,
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

	protected THONGSOCHUNGCHIXEMAY getByCertificateRecordId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEMAY thongsochungchixemay,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEMAY_WHERE);

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
			query.append(THONGSOCHUNGCHIXEMAYModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixemay);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEMAY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixemay);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e m a ies
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEMAY_WHERE);

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
		"thongsochungchixemay.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEMAYModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findByVehicleGroupId(
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

		List<THONGSOCHUNGCHIXEMAY> list = (List<THONGSOCHUNGCHIXEMAY>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : list) {
				if ((vehicleGroupId != thongsochungchixemay.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEMAY_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEMAYModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEMAY>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixemay != null) {
			return thongsochungchixemay;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEMAYException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEMAY> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByVehicleGroupId_Last(long vehicleGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixemay != null) {
			return thongsochungchixemay;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEMAYException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEMAY> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a ies before and after the current t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e m a y
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY[] findByVehicleGroupId_PrevAndNext(long id,
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEMAY[] array = new THONGSOCHUNGCHIXEMAYImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixemay, vehicleGroupId, orderByComparator,
					true);

			array[1] = thongsochungchixemay;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixemay, vehicleGroupId, orderByComparator,
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

	protected THONGSOCHUNGCHIXEMAY getByVehicleGroupId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEMAY thongsochungchixemay,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEMAY_WHERE);

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
			query.append(THONGSOCHUNGCHIXEMAYModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixemay);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEMAY> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixemay);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e m a ies
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEMAY_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "thongsochungchixemay.vehicleGroupId = ?";

	public THONGSOCHUNGCHIXEMAYPersistenceImpl() {
		setModelClass(THONGSOCHUNGCHIXEMAY.class);
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e m a y in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixemay the t h o n g s o c h u n g c h i x e m a y
	 */
	@Override
	public void cacheResult(THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		EntityCacheUtil.putResult(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			thongsochungchixemay.getPrimaryKey(), thongsochungchixemay);

		thongsochungchixemay.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e m a ies in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixemaies the t h o n g s o c h u n g c h i x e m a ies
	 */
	@Override
	public void cacheResult(List<THONGSOCHUNGCHIXEMAY> thongsochungchixemaies) {
		for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : thongsochungchixemaies) {
			if (EntityCacheUtil.getResult(
						THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXEMAYImpl.class,
						thongsochungchixemay.getPrimaryKey()) == null) {
				cacheResult(thongsochungchixemay);
			}
			else {
				thongsochungchixemay.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g s o c h u n g c h i x e m a ies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGSOCHUNGCHIXEMAYImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGSOCHUNGCHIXEMAYImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g s o c h u n g c h i x e m a y.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class, thongsochungchixemay.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<THONGSOCHUNGCHIXEMAY> thongsochungchixemaies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : thongsochungchixemaies) {
			EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXEMAYImpl.class,
				thongsochungchixemay.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g s o c h u n g c h i x e m a y with the primary key. Does not add the t h o n g s o c h u n g c h i x e m a y to the database.
	 *
	 * @param id the primary key for the new t h o n g s o c h u n g c h i x e m a y
	 * @return the new t h o n g s o c h u n g c h i x e m a y
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY create(long id) {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = new THONGSOCHUNGCHIXEMAYImpl();

		thongsochungchixemay.setNew(true);
		thongsochungchixemay.setPrimaryKey(id);

		return thongsochungchixemay;
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e m a y with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e m a y
	 * @return the t h o n g s o c h u n g c h i x e m a y that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY remove(long id)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e m a y with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e m a y
	 * @return the t h o n g s o c h u n g c h i x e m a y that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY remove(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEMAY thongsochungchixemay = (THONGSOCHUNGCHIXEMAY)session.get(THONGSOCHUNGCHIXEMAYImpl.class,
					primaryKey);

			if (thongsochungchixemay == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGSOCHUNGCHIXEMAYException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongsochungchixemay);
		}
		catch (NoSuchTHONGSOCHUNGCHIXEMAYException nsee) {
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
	protected THONGSOCHUNGCHIXEMAY removeImpl(
		THONGSOCHUNGCHIXEMAY thongsochungchixemay) throws SystemException {
		thongsochungchixemay = toUnwrappedModel(thongsochungchixemay);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongsochungchixemay)) {
				thongsochungchixemay = (THONGSOCHUNGCHIXEMAY)session.get(THONGSOCHUNGCHIXEMAYImpl.class,
						thongsochungchixemay.getPrimaryKeyObj());
			}

			if (thongsochungchixemay != null) {
				session.delete(thongsochungchixemay);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongsochungchixemay != null) {
			clearCache(thongsochungchixemay);
		}

		return thongsochungchixemay;
	}

	@Override
	public THONGSOCHUNGCHIXEMAY updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY thongsochungchixemay)
		throws SystemException {
		thongsochungchixemay = toUnwrappedModel(thongsochungchixemay);

		boolean isNew = thongsochungchixemay.isNew();

		THONGSOCHUNGCHIXEMAYModelImpl thongsochungchixemayModelImpl = (THONGSOCHUNGCHIXEMAYModelImpl)thongsochungchixemay;

		Session session = null;

		try {
			session = openSession();

			if (thongsochungchixemay.isNew()) {
				session.save(thongsochungchixemay);

				thongsochungchixemay.setNew(false);
			}
			else {
				session.merge(thongsochungchixemay);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !THONGSOCHUNGCHIXEMAYModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongsochungchixemayModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixemayModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						thongsochungchixemayModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((thongsochungchixemayModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixemayModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						thongsochungchixemayModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((thongsochungchixemayModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixemayModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						thongsochungchixemayModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEMAYImpl.class,
			thongsochungchixemay.getPrimaryKey(), thongsochungchixemay);

		return thongsochungchixemay;
	}

	protected THONGSOCHUNGCHIXEMAY toUnwrappedModel(
		THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		if (thongsochungchixemay instanceof THONGSOCHUNGCHIXEMAYImpl) {
			return thongsochungchixemay;
		}

		THONGSOCHUNGCHIXEMAYImpl thongsochungchixemayImpl = new THONGSOCHUNGCHIXEMAYImpl();

		thongsochungchixemayImpl.setNew(thongsochungchixemay.isNew());
		thongsochungchixemayImpl.setPrimaryKey(thongsochungchixemay.getPrimaryKey());

		thongsochungchixemayImpl.setId(thongsochungchixemay.getId());
		thongsochungchixemayImpl.setHoSoThuTucId(thongsochungchixemay.getHoSoThuTucId());
		thongsochungchixemayImpl.setCertificateRecordId(thongsochungchixemay.getCertificateRecordId());
		thongsochungchixemayImpl.setVehicleGroupId(thongsochungchixemay.getVehicleGroupId());
		thongsochungchixemayImpl.setSynchDate(thongsochungchixemay.getSynchDate());
		thongsochungchixemayImpl.setXMY0009(thongsochungchixemay.getXMY0009());
		thongsochungchixemayImpl.setXMY0010(thongsochungchixemay.getXMY0010());
		thongsochungchixemayImpl.setXMY0011(thongsochungchixemay.getXMY0011());
		thongsochungchixemayImpl.setXMY0012(thongsochungchixemay.getXMY0012());
		thongsochungchixemayImpl.setXMY0013(thongsochungchixemay.getXMY0013());
		thongsochungchixemayImpl.setXMY0014(thongsochungchixemay.getXMY0014());
		thongsochungchixemayImpl.setXMY0015(thongsochungchixemay.getXMY0015());
		thongsochungchixemayImpl.setXMY0016(thongsochungchixemay.getXMY0016());
		thongsochungchixemayImpl.setXMY0017(thongsochungchixemay.getXMY0017());
		thongsochungchixemayImpl.setXMY0018(thongsochungchixemay.getXMY0018());
		thongsochungchixemayImpl.setXMY0019(thongsochungchixemay.getXMY0019());
		thongsochungchixemayImpl.setXMY0020(thongsochungchixemay.getXMY0020());
		thongsochungchixemayImpl.setXMY0021(thongsochungchixemay.getXMY0021());
		thongsochungchixemayImpl.setXMY0022(thongsochungchixemay.getXMY0022());
		thongsochungchixemayImpl.setXMY1022(thongsochungchixemay.getXMY1022());
		thongsochungchixemayImpl.setXMY0023(thongsochungchixemay.getXMY0023());
		thongsochungchixemayImpl.setXMY0024(thongsochungchixemay.getXMY0024());
		thongsochungchixemayImpl.setXMY0025(thongsochungchixemay.getXMY0025());
		thongsochungchixemayImpl.setXMY0026(thongsochungchixemay.getXMY0026());
		thongsochungchixemayImpl.setXMY0027(thongsochungchixemay.getXMY0027());
		thongsochungchixemayImpl.setXMY0028(thongsochungchixemay.getXMY0028());
		thongsochungchixemayImpl.setXMY0029(thongsochungchixemay.getXMY0029());
		thongsochungchixemayImpl.setXMY0030(thongsochungchixemay.getXMY0030());
		thongsochungchixemayImpl.setXMY0031(thongsochungchixemay.getXMY0031());
		thongsochungchixemayImpl.setXMY0032(thongsochungchixemay.getXMY0032());
		thongsochungchixemayImpl.setXMY1032(thongsochungchixemay.getXMY1032());
		thongsochungchixemayImpl.setXMY0033(thongsochungchixemay.getXMY0033());
		thongsochungchixemayImpl.setXMY1033(thongsochungchixemay.getXMY1033());
		thongsochungchixemayImpl.setXMY0034(thongsochungchixemay.getXMY0034());
		thongsochungchixemayImpl.setXMY0035(thongsochungchixemay.getXMY0035());
		thongsochungchixemayImpl.setXMY1035(thongsochungchixemay.getXMY1035());
		thongsochungchixemayImpl.setXMY0036(thongsochungchixemay.getXMY0036());
		thongsochungchixemayImpl.setXMY0037(thongsochungchixemay.getXMY0037());
		thongsochungchixemayImpl.setXMY0038(thongsochungchixemay.getXMY0038());
		thongsochungchixemayImpl.setXMY0039(thongsochungchixemay.getXMY0039());
		thongsochungchixemayImpl.setXMY1039(thongsochungchixemay.getXMY1039());
		thongsochungchixemayImpl.setXMY0040(thongsochungchixemay.getXMY0040());
		thongsochungchixemayImpl.setXMY1040(thongsochungchixemay.getXMY1040());
		thongsochungchixemayImpl.setXMY0041(thongsochungchixemay.getXMY0041());
		thongsochungchixemayImpl.setXMY0042(thongsochungchixemay.getXMY0042());
		thongsochungchixemayImpl.setXMY1042(thongsochungchixemay.getXMY1042());
		thongsochungchixemayImpl.setXMY0043(thongsochungchixemay.getXMY0043());
		thongsochungchixemayImpl.setXMY0044(thongsochungchixemay.getXMY0044());
		thongsochungchixemayImpl.setXMY0045(thongsochungchixemay.getXMY0045());
		thongsochungchixemayImpl.setXMY0046(thongsochungchixemay.getXMY0046());
		thongsochungchixemayImpl.setXMY0047(thongsochungchixemay.getXMY0047());
		thongsochungchixemayImpl.setXMY0048(thongsochungchixemay.getXMY0048());
		thongsochungchixemayImpl.setXMY0049(thongsochungchixemay.getXMY0049());
		thongsochungchixemayImpl.setXMY0050(thongsochungchixemay.getXMY0050());
		thongsochungchixemayImpl.setXMY1050(thongsochungchixemay.getXMY1050());
		thongsochungchixemayImpl.setXMY0051(thongsochungchixemay.getXMY0051());
		thongsochungchixemayImpl.setXMY0052(thongsochungchixemay.getXMY0052());
		thongsochungchixemayImpl.setXMY0053(thongsochungchixemay.getXMY0053());
		thongsochungchixemayImpl.setXMY0054(thongsochungchixemay.getXMY0054());
		thongsochungchixemayImpl.setXMY0055(thongsochungchixemay.getXMY0055());
		thongsochungchixemayImpl.setXMY0056(thongsochungchixemay.getXMY0056());
		thongsochungchixemayImpl.setXMY0057(thongsochungchixemay.getXMY0057());
		thongsochungchixemayImpl.setXMY0058(thongsochungchixemay.getXMY0058());
		thongsochungchixemayImpl.setXMY0059(thongsochungchixemay.getXMY0059());
		thongsochungchixemayImpl.setXMY0060(thongsochungchixemay.getXMY0060());
		thongsochungchixemayImpl.setXMY0061(thongsochungchixemay.getXMY0061());
		thongsochungchixemayImpl.setXMY0062(thongsochungchixemay.getXMY0062());
		thongsochungchixemayImpl.setXMY0063(thongsochungchixemay.getXMY0063());
		thongsochungchixemayImpl.setXMY0064(thongsochungchixemay.getXMY0064());
		thongsochungchixemayImpl.setXMY0065(thongsochungchixemay.getXMY0065());
		thongsochungchixemayImpl.setXMY0066(thongsochungchixemay.getXMY0066());
		thongsochungchixemayImpl.setXMY0067(thongsochungchixemay.getXMY0067());
		thongsochungchixemayImpl.setXMY0068(thongsochungchixemay.getXMY0068());
		thongsochungchixemayImpl.setXMY0069(thongsochungchixemay.getXMY0069());
		thongsochungchixemayImpl.setXMY0082(thongsochungchixemay.getXMY0082());
		thongsochungchixemayImpl.setXMY0083(thongsochungchixemay.getXMY0083());
		thongsochungchixemayImpl.setXMY0084(thongsochungchixemay.getXMY0084());
		thongsochungchixemayImpl.setXMY0085(thongsochungchixemay.getXMY0085());
		thongsochungchixemayImpl.setXMY0086(thongsochungchixemay.getXMY0086());
		thongsochungchixemayImpl.setXMY1086(thongsochungchixemay.getXMY1086());
		thongsochungchixemayImpl.setXMY0087(thongsochungchixemay.getXMY0087());
		thongsochungchixemayImpl.setXMY1087(thongsochungchixemay.getXMY1087());
		thongsochungchixemayImpl.setXMY1187(thongsochungchixemay.getXMY1187());
		thongsochungchixemayImpl.setXMY0088(thongsochungchixemay.getXMY0088());
		thongsochungchixemayImpl.setXMY1088(thongsochungchixemay.getXMY1088());
		thongsochungchixemayImpl.setXMY1188(thongsochungchixemay.getXMY1188());
		thongsochungchixemayImpl.setXMY0089(thongsochungchixemay.getXMY0089());
		thongsochungchixemayImpl.setXMY1089(thongsochungchixemay.getXMY1089());
		thongsochungchixemayImpl.setXMY1189(thongsochungchixemay.getXMY1189());
		thongsochungchixemayImpl.setXMY0090(thongsochungchixemay.getXMY0090());
		thongsochungchixemayImpl.setXMY0091(thongsochungchixemay.getXMY0091());
		thongsochungchixemayImpl.setXMY0092(thongsochungchixemay.getXMY0092());
		thongsochungchixemayImpl.setXMY0093(thongsochungchixemay.getXMY0093());
		thongsochungchixemayImpl.setXMY0094(thongsochungchixemay.getXMY0094());
		thongsochungchixemayImpl.setXMY0095(thongsochungchixemay.getXMY0095());
		thongsochungchixemayImpl.setXMY0096(thongsochungchixemay.getXMY0096());
		thongsochungchixemayImpl.setXMY0097(thongsochungchixemay.getXMY0097());
		thongsochungchixemayImpl.setXMY0098(thongsochungchixemay.getXMY0098());
		thongsochungchixemayImpl.setXMY0099(thongsochungchixemay.getXMY0099());
		thongsochungchixemayImpl.setXMY0100(thongsochungchixemay.getXMY0100());
		thongsochungchixemayImpl.setXMY0101(thongsochungchixemay.getXMY0101());
		thongsochungchixemayImpl.setXMY0102(thongsochungchixemay.getXMY0102());
		thongsochungchixemayImpl.setXMY0103(thongsochungchixemay.getXMY0103());
		thongsochungchixemayImpl.setXMY0104(thongsochungchixemay.getXMY0104());
		thongsochungchixemayImpl.setXMY0105(thongsochungchixemay.getXMY0105());
		thongsochungchixemayImpl.setXMY0106(thongsochungchixemay.getXMY0106());
		thongsochungchixemayImpl.setXMY2106(thongsochungchixemay.getXMY2106());
		thongsochungchixemayImpl.setXMY0107(thongsochungchixemay.getXMY0107());
		thongsochungchixemayImpl.setXMY2107(thongsochungchixemay.getXMY2107());
		thongsochungchixemayImpl.setXMY0108(thongsochungchixemay.getXMY0108());
		thongsochungchixemayImpl.setXMY2108(thongsochungchixemay.getXMY2108());
		thongsochungchixemayImpl.setXMY0109(thongsochungchixemay.getXMY0109());
		thongsochungchixemayImpl.setXMY2109(thongsochungchixemay.getXMY2109());
		thongsochungchixemayImpl.setXMY0110(thongsochungchixemay.getXMY0110());
		thongsochungchixemayImpl.setXMY2110(thongsochungchixemay.getXMY2110());
		thongsochungchixemayImpl.setXMY0111(thongsochungchixemay.getXMY0111());
		thongsochungchixemayImpl.setXMY2111(thongsochungchixemay.getXMY2111());
		thongsochungchixemayImpl.setXMY0112(thongsochungchixemay.getXMY0112());
		thongsochungchixemayImpl.setXMY2112(thongsochungchixemay.getXMY2112());
		thongsochungchixemayImpl.setXMY0113(thongsochungchixemay.getXMY0113());
		thongsochungchixemayImpl.setXMY2113(thongsochungchixemay.getXMY2113());
		thongsochungchixemayImpl.setXMY0114(thongsochungchixemay.getXMY0114());
		thongsochungchixemayImpl.setXMY2114(thongsochungchixemay.getXMY2114());
		thongsochungchixemayImpl.setXMY0115(thongsochungchixemay.getXMY0115());
		thongsochungchixemayImpl.setXMY2115(thongsochungchixemay.getXMY2115());
		thongsochungchixemayImpl.setXMY0116(thongsochungchixemay.getXMY0116());
		thongsochungchixemayImpl.setXMY2116(thongsochungchixemay.getXMY2116());
		thongsochungchixemayImpl.setXMY0117(thongsochungchixemay.getXMY0117());
		thongsochungchixemayImpl.setXMY2117(thongsochungchixemay.getXMY2117());
		thongsochungchixemayImpl.setXMY0118(thongsochungchixemay.getXMY0118());
		thongsochungchixemayImpl.setXMY2118(thongsochungchixemay.getXMY2118());
		thongsochungchixemayImpl.setXMY0119(thongsochungchixemay.getXMY0119());
		thongsochungchixemayImpl.setXMY2119(thongsochungchixemay.getXMY2119());
		thongsochungchixemayImpl.setXMY0120(thongsochungchixemay.getXMY0120());
		thongsochungchixemayImpl.setXMY0121(thongsochungchixemay.getXMY0121());
		thongsochungchixemayImpl.setXMY2121(thongsochungchixemay.getXMY2121());
		thongsochungchixemayImpl.setXMY0122(thongsochungchixemay.getXMY0122());
		thongsochungchixemayImpl.setXMY0198(thongsochungchixemay.getXMY0198());
		thongsochungchixemayImpl.setXMY1098(thongsochungchixemay.getXMY1098());

		return thongsochungchixemayImpl;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e m a y
	 * @return the t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = fetchByPrimaryKey(primaryKey);

		if (thongsochungchixemay == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGSOCHUNGCHIXEMAYException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongsochungchixemay;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e m a y
	 * @return the t h o n g s o c h u n g c h i x e m a y
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY findByPrimaryKey(long id)
		throws NoSuchTHONGSOCHUNGCHIXEMAYException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e m a y
	 * @return the t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		THONGSOCHUNGCHIXEMAY thongsochungchixemay = (THONGSOCHUNGCHIXEMAY)EntityCacheUtil.getResult(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXEMAYImpl.class, primaryKey);

		if (thongsochungchixemay == _nullTHONGSOCHUNGCHIXEMAY) {
			return null;
		}

		if (thongsochungchixemay == null) {
			Session session = null;

			try {
				session = openSession();

				thongsochungchixemay = (THONGSOCHUNGCHIXEMAY)session.get(THONGSOCHUNGCHIXEMAYImpl.class,
						primaryKey);

				if (thongsochungchixemay != null) {
					cacheResult(thongsochungchixemay);
				}
				else {
					EntityCacheUtil.putResult(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXEMAYImpl.class, primaryKey,
						_nullTHONGSOCHUNGCHIXEMAY);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEMAYModelImpl.ENTITY_CACHE_ENABLED,
					THONGSOCHUNGCHIXEMAYImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongsochungchixemay;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e m a y
	 * @return the t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEMAY fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e m a ies.
	 *
	 * @return the t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e m a ies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @return the range of t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g s o c h u n g c h i x e m a ies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEMAY> findAll(int start, int end,
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

		List<THONGSOCHUNGCHIXEMAY> list = (List<THONGSOCHUNGCHIXEMAY>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGSOCHUNGCHIXEMAY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGSOCHUNGCHIXEMAY;

				if (pagination) {
					sql = sql.concat(THONGSOCHUNGCHIXEMAYModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEMAY>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEMAY>)QueryUtil.list(q,
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
	 * Removes all the t h o n g s o c h u n g c h i x e m a ies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGSOCHUNGCHIXEMAY thongsochungchixemay : findAll()) {
			remove(thongsochungchixemay);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e m a ies.
	 *
	 * @return the number of t h o n g s o c h u n g c h i x e m a ies
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

				Query q = session.createQuery(_SQL_COUNT_THONGSOCHUNGCHIXEMAY);

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
	 * Initializes the t h o n g s o c h u n g c h i x e m a y persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGSOCHUNGCHIXEMAY>> listenersList = new ArrayList<ModelListener<THONGSOCHUNGCHIXEMAY>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGSOCHUNGCHIXEMAY>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGSOCHUNGCHIXEMAYImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGSOCHUNGCHIXEMAY = "SELECT thongsochungchixemay FROM THONGSOCHUNGCHIXEMAY thongsochungchixemay";
	private static final String _SQL_SELECT_THONGSOCHUNGCHIXEMAY_WHERE = "SELECT thongsochungchixemay FROM THONGSOCHUNGCHIXEMAY thongsochungchixemay WHERE ";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXEMAY = "SELECT COUNT(thongsochungchixemay) FROM THONGSOCHUNGCHIXEMAY thongsochungchixemay";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXEMAY_WHERE = "SELECT COUNT(thongsochungchixemay) FROM THONGSOCHUNGCHIXEMAY thongsochungchixemay WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongsochungchixemay.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGSOCHUNGCHIXEMAY exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGSOCHUNGCHIXEMAY exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXEMAYPersistenceImpl.class);
	private static THONGSOCHUNGCHIXEMAY _nullTHONGSOCHUNGCHIXEMAY = new THONGSOCHUNGCHIXEMAYImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGSOCHUNGCHIXEMAY> toCacheModel() {
				return _nullTHONGSOCHUNGCHIXEMAYCacheModel;
			}
		};

	private static CacheModel<THONGSOCHUNGCHIXEMAY> _nullTHONGSOCHUNGCHIXEMAYCacheModel =
		new CacheModel<THONGSOCHUNGCHIXEMAY>() {
			@Override
			public THONGSOCHUNGCHIXEMAY toEntityModel() {
				return _nullTHONGSOCHUNGCHIXEMAY;
			}
		};
}