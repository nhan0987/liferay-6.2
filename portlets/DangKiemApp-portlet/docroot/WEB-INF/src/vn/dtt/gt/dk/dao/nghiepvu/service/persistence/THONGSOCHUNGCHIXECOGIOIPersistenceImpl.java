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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h o n g s o c h u n g c h i x e c o g i o i service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOIPersistence
 * @see THONGSOCHUNGCHIXECOGIOIUtil
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIPersistenceImpl extends BasePersistenceImpl<THONGSOCHUNGCHIXECOGIOI>
	implements THONGSOCHUNGCHIXECOGIOIPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGSOCHUNGCHIXECOGIOIUtil} to access the t h o n g s o c h u n g c h i x e c o g i o i persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGSOCHUNGCHIXECOGIOIImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECOGIOIModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o is where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o is where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o is where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByHoSoThuTucId(long hoSoThuTucId,
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

		List<THONGSOCHUNGCHIXECOGIOI> list = (List<THONGSOCHUNGCHIXECOGIOI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : list) {
				if ((hoSoThuTucId != thongsochungchixecogioi.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOI_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECOGIOIModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOI>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixecogioi != null) {
			return thongsochungchixecogioi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECOGIOI> list = findByHoSoThuTucId(hoSoThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixecogioi != null) {
			return thongsochungchixecogioi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECOGIOI> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o is before and after the current t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOI[] array = new THONGSOCHUNGCHIXECOGIOIImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixecogioi, hoSoThuTucId, orderByComparator,
					true);

			array[1] = thongsochungchixecogioi;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixecogioi, hoSoThuTucId, orderByComparator,
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

	protected THONGSOCHUNGCHIXECOGIOI getByHoSoThuTucId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOI_WHERE);

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
			query.append(THONGSOCHUNGCHIXECOGIOIModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixecogioi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECOGIOI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o is where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixecogioi);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o is where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c o g i o is
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOI_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "thongsochungchixecogioi.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECOGIOIModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o is where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o is where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o is where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordId(
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

		List<THONGSOCHUNGCHIXECOGIOI> list = (List<THONGSOCHUNGCHIXECOGIOI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : list) {
				if ((certificateRecordId != thongsochungchixecogioi.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOI_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECOGIOIModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOI>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (thongsochungchixecogioi != null) {
			return thongsochungchixecogioi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECOGIOI> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (thongsochungchixecogioi != null) {
			return thongsochungchixecogioi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECOGIOI> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o is before and after the current t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOI[] array = new THONGSOCHUNGCHIXECOGIOIImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixecogioi, certificateRecordId,
					orderByComparator, true);

			array[1] = thongsochungchixecogioi;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixecogioi, certificateRecordId,
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

	protected THONGSOCHUNGCHIXECOGIOI getByCertificateRecordId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOI_WHERE);

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
			query.append(THONGSOCHUNGCHIXECOGIOIModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixecogioi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECOGIOI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o is where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixecogioi);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o is where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c o g i o is
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOI_WHERE);

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
		"thongsochungchixecogioi.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECOGIOIModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o is where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupId(
		long vehicleGroupId) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o is where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o is where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupId(
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

		List<THONGSOCHUNGCHIXECOGIOI> list = (List<THONGSOCHUNGCHIXECOGIOI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : list) {
				if ((vehicleGroupId != thongsochungchixecogioi.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOI_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECOGIOIModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOI>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixecogioi != null) {
			return thongsochungchixecogioi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECOGIOI> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixecogioi != null) {
			return thongsochungchixecogioi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECOGIOI> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o is before and after the current t h o n g s o c h u n g c h i x e c o g i o i in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI[] findByVehicleGroupId_PrevAndNext(long id,
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOI[] array = new THONGSOCHUNGCHIXECOGIOIImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixecogioi, vehicleGroupId, orderByComparator,
					true);

			array[1] = thongsochungchixecogioi;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixecogioi, vehicleGroupId, orderByComparator,
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

	protected THONGSOCHUNGCHIXECOGIOI getByVehicleGroupId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOI_WHERE);

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
			query.append(THONGSOCHUNGCHIXECOGIOIModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixecogioi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECOGIOI> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o is where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixecogioi);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o is where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c o g i o is
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOI_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "thongsochungchixecogioi.vehicleGroupId = ?";

	public THONGSOCHUNGCHIXECOGIOIPersistenceImpl() {
		setModelClass(THONGSOCHUNGCHIXECOGIOI.class);
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e c o g i o i in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixecogioi the t h o n g s o c h u n g c h i x e c o g i o i
	 */
	@Override
	public void cacheResult(THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi) {
		EntityCacheUtil.putResult(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			thongsochungchixecogioi.getPrimaryKey(), thongsochungchixecogioi);

		thongsochungchixecogioi.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e c o g i o is in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixecogiois the t h o n g s o c h u n g c h i x e c o g i o is
	 */
	@Override
	public void cacheResult(
		List<THONGSOCHUNGCHIXECOGIOI> thongsochungchixecogiois) {
		for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : thongsochungchixecogiois) {
			if (EntityCacheUtil.getResult(
						THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXECOGIOIImpl.class,
						thongsochungchixecogioi.getPrimaryKey()) == null) {
				cacheResult(thongsochungchixecogioi);
			}
			else {
				thongsochungchixecogioi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g s o c h u n g c h i x e c o g i o is.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGSOCHUNGCHIXECOGIOIImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGSOCHUNGCHIXECOGIOIImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g s o c h u n g c h i x e c o g i o i.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi) {
		EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			thongsochungchixecogioi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<THONGSOCHUNGCHIXECOGIOI> thongsochungchixecogiois) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : thongsochungchixecogiois) {
			EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXECOGIOIImpl.class,
				thongsochungchixecogioi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g s o c h u n g c h i x e c o g i o i with the primary key. Does not add the t h o n g s o c h u n g c h i x e c o g i o i to the database.
	 *
	 * @param id the primary key for the new t h o n g s o c h u n g c h i x e c o g i o i
	 * @return the new t h o n g s o c h u n g c h i x e c o g i o i
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI create(long id) {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = new THONGSOCHUNGCHIXECOGIOIImpl();

		thongsochungchixecogioi.setNew(true);
		thongsochungchixecogioi.setPrimaryKey(id);

		return thongsochungchixecogioi;
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e c o g i o i with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI remove(long id)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e c o g i o i with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI remove(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = (THONGSOCHUNGCHIXECOGIOI)session.get(THONGSOCHUNGCHIXECOGIOIImpl.class,
					primaryKey);

			if (thongsochungchixecogioi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongsochungchixecogioi);
		}
		catch (NoSuchTHONGSOCHUNGCHIXECOGIOIException nsee) {
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
	protected THONGSOCHUNGCHIXECOGIOI removeImpl(
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi)
		throws SystemException {
		thongsochungchixecogioi = toUnwrappedModel(thongsochungchixecogioi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongsochungchixecogioi)) {
				thongsochungchixecogioi = (THONGSOCHUNGCHIXECOGIOI)session.get(THONGSOCHUNGCHIXECOGIOIImpl.class,
						thongsochungchixecogioi.getPrimaryKeyObj());
			}

			if (thongsochungchixecogioi != null) {
				session.delete(thongsochungchixecogioi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongsochungchixecogioi != null) {
			clearCache(thongsochungchixecogioi);
		}

		return thongsochungchixecogioi;
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOI updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi)
		throws SystemException {
		thongsochungchixecogioi = toUnwrappedModel(thongsochungchixecogioi);

		boolean isNew = thongsochungchixecogioi.isNew();

		THONGSOCHUNGCHIXECOGIOIModelImpl thongsochungchixecogioiModelImpl = (THONGSOCHUNGCHIXECOGIOIModelImpl)thongsochungchixecogioi;

		Session session = null;

		try {
			session = openSession();

			if (thongsochungchixecogioi.isNew()) {
				session.save(thongsochungchixecogioi);

				thongsochungchixecogioi.setNew(false);
			}
			else {
				session.merge(thongsochungchixecogioi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !THONGSOCHUNGCHIXECOGIOIModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongsochungchixecogioiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixecogioiModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						thongsochungchixecogioiModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((thongsochungchixecogioiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixecogioiModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						thongsochungchixecogioiModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((thongsochungchixecogioiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixecogioiModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						thongsochungchixecogioiModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECOGIOIImpl.class,
			thongsochungchixecogioi.getPrimaryKey(), thongsochungchixecogioi);

		return thongsochungchixecogioi;
	}

	protected THONGSOCHUNGCHIXECOGIOI toUnwrappedModel(
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi) {
		if (thongsochungchixecogioi instanceof THONGSOCHUNGCHIXECOGIOIImpl) {
			return thongsochungchixecogioi;
		}

		THONGSOCHUNGCHIXECOGIOIImpl thongsochungchixecogioiImpl = new THONGSOCHUNGCHIXECOGIOIImpl();

		thongsochungchixecogioiImpl.setNew(thongsochungchixecogioi.isNew());
		thongsochungchixecogioiImpl.setPrimaryKey(thongsochungchixecogioi.getPrimaryKey());

		thongsochungchixecogioiImpl.setId(thongsochungchixecogioi.getId());
		thongsochungchixecogioiImpl.setHoSoThuTucId(thongsochungchixecogioi.getHoSoThuTucId());
		thongsochungchixecogioiImpl.setCertificateRecordId(thongsochungchixecogioi.getCertificateRecordId());
		thongsochungchixecogioiImpl.setVehicleGroupId(thongsochungchixecogioi.getVehicleGroupId());
		thongsochungchixecogioiImpl.setSynchDate(thongsochungchixecogioi.getSynchDate());
		thongsochungchixecogioiImpl.setXCG0009(thongsochungchixecogioi.getXCG0009());
		thongsochungchixecogioiImpl.setXCG0010(thongsochungchixecogioi.getXCG0010());
		thongsochungchixecogioiImpl.setXCG0011(thongsochungchixecogioi.getXCG0011());
		thongsochungchixecogioiImpl.setXCG0012(thongsochungchixecogioi.getXCG0012());
		thongsochungchixecogioiImpl.setXCG0013(thongsochungchixecogioi.getXCG0013());
		thongsochungchixecogioiImpl.setXCG0014(thongsochungchixecogioi.getXCG0014());
		thongsochungchixecogioiImpl.setXCG0015(thongsochungchixecogioi.getXCG0015());
		thongsochungchixecogioiImpl.setXCG0016(thongsochungchixecogioi.getXCG0016());
		thongsochungchixecogioiImpl.setXCG0017(thongsochungchixecogioi.getXCG0017());
		thongsochungchixecogioiImpl.setXCG0018(thongsochungchixecogioi.getXCG0018());
		thongsochungchixecogioiImpl.setXCG0019(thongsochungchixecogioi.getXCG0019());
		thongsochungchixecogioiImpl.setXCG0020(thongsochungchixecogioi.getXCG0020());
		thongsochungchixecogioiImpl.setXCG0021(thongsochungchixecogioi.getXCG0021());
		thongsochungchixecogioiImpl.setXCG1021(thongsochungchixecogioi.getXCG1021());
		thongsochungchixecogioiImpl.setXCG1121(thongsochungchixecogioi.getXCG1121());
		thongsochungchixecogioiImpl.setXCG0022(thongsochungchixecogioi.getXCG0022());
		thongsochungchixecogioiImpl.setXCG1022(thongsochungchixecogioi.getXCG1022());
		thongsochungchixecogioiImpl.setXCG1122(thongsochungchixecogioi.getXCG1122());
		thongsochungchixecogioiImpl.setXCG0023(thongsochungchixecogioi.getXCG0023());
		thongsochungchixecogioiImpl.setXCG1023(thongsochungchixecogioi.getXCG1023());
		thongsochungchixecogioiImpl.setXCG1123(thongsochungchixecogioi.getXCG1123());
		thongsochungchixecogioiImpl.setXCG0024(thongsochungchixecogioi.getXCG0024());
		thongsochungchixecogioiImpl.setXCG1024(thongsochungchixecogioi.getXCG1024());
		thongsochungchixecogioiImpl.setXCG1124(thongsochungchixecogioi.getXCG1124());
		thongsochungchixecogioiImpl.setXCG0025(thongsochungchixecogioi.getXCG0025());
		thongsochungchixecogioiImpl.setXCG1025(thongsochungchixecogioi.getXCG1025());
		thongsochungchixecogioiImpl.setXCG1125(thongsochungchixecogioi.getXCG1125());
		thongsochungchixecogioiImpl.setXCG0026(thongsochungchixecogioi.getXCG0026());
		thongsochungchixecogioiImpl.setXCG1026(thongsochungchixecogioi.getXCG1026());
		thongsochungchixecogioiImpl.setXCG1126(thongsochungchixecogioi.getXCG1126());
		thongsochungchixecogioiImpl.setXCG0027(thongsochungchixecogioi.getXCG0027());
		thongsochungchixecogioiImpl.setXCG1027(thongsochungchixecogioi.getXCG1027());
		thongsochungchixecogioiImpl.setXCG1127(thongsochungchixecogioi.getXCG1127());
		thongsochungchixecogioiImpl.setXCG0028(thongsochungchixecogioi.getXCG0028());
		thongsochungchixecogioiImpl.setXCG1028(thongsochungchixecogioi.getXCG1028());
		thongsochungchixecogioiImpl.setXCG1128(thongsochungchixecogioi.getXCG1128());
		thongsochungchixecogioiImpl.setXCG0029(thongsochungchixecogioi.getXCG0029());
		thongsochungchixecogioiImpl.setXCG1029(thongsochungchixecogioi.getXCG1029());
		thongsochungchixecogioiImpl.setXCG1129(thongsochungchixecogioi.getXCG1129());
		thongsochungchixecogioiImpl.setXCG0030(thongsochungchixecogioi.getXCG0030());
		thongsochungchixecogioiImpl.setXCG1030(thongsochungchixecogioi.getXCG1030());
		thongsochungchixecogioiImpl.setXCG1130(thongsochungchixecogioi.getXCG1130());
		thongsochungchixecogioiImpl.setXCG0031(thongsochungchixecogioi.getXCG0031());
		thongsochungchixecogioiImpl.setXCG1031(thongsochungchixecogioi.getXCG1031());
		thongsochungchixecogioiImpl.setXCG1131(thongsochungchixecogioi.getXCG1131());
		thongsochungchixecogioiImpl.setXCG0032(thongsochungchixecogioi.getXCG0032());
		thongsochungchixecogioiImpl.setXCG1032(thongsochungchixecogioi.getXCG1032());
		thongsochungchixecogioiImpl.setXCG1132(thongsochungchixecogioi.getXCG1132());
		thongsochungchixecogioiImpl.setXCG0033(thongsochungchixecogioi.getXCG0033());
		thongsochungchixecogioiImpl.setXCG1033(thongsochungchixecogioi.getXCG1033());
		thongsochungchixecogioiImpl.setXCG1133(thongsochungchixecogioi.getXCG1133());
		thongsochungchixecogioiImpl.setXCG0034(thongsochungchixecogioi.getXCG0034());
		thongsochungchixecogioiImpl.setXCG1034(thongsochungchixecogioi.getXCG1034());
		thongsochungchixecogioiImpl.setXCG1134(thongsochungchixecogioi.getXCG1134());
		thongsochungchixecogioiImpl.setXCG0035(thongsochungchixecogioi.getXCG0035());
		thongsochungchixecogioiImpl.setXCG1035(thongsochungchixecogioi.getXCG1035());
		thongsochungchixecogioiImpl.setXCG1135(thongsochungchixecogioi.getXCG1135());
		thongsochungchixecogioiImpl.setXCG0036(thongsochungchixecogioi.getXCG0036());
		thongsochungchixecogioiImpl.setXCG1036(thongsochungchixecogioi.getXCG1036());
		thongsochungchixecogioiImpl.setXCG1136(thongsochungchixecogioi.getXCG1136());
		thongsochungchixecogioiImpl.setXCG0037(thongsochungchixecogioi.getXCG0037());
		thongsochungchixecogioiImpl.setXCG1037(thongsochungchixecogioi.getXCG1037());
		thongsochungchixecogioiImpl.setXCG1137(thongsochungchixecogioi.getXCG1137());
		thongsochungchixecogioiImpl.setXCG0038(thongsochungchixecogioi.getXCG0038());
		thongsochungchixecogioiImpl.setXCG1038(thongsochungchixecogioi.getXCG1038());
		thongsochungchixecogioiImpl.setXCG1138(thongsochungchixecogioi.getXCG1138());
		thongsochungchixecogioiImpl.setXCG0039(thongsochungchixecogioi.getXCG0039());
		thongsochungchixecogioiImpl.setXCG1039(thongsochungchixecogioi.getXCG1039());
		thongsochungchixecogioiImpl.setXCG1139(thongsochungchixecogioi.getXCG1139());
		thongsochungchixecogioiImpl.setXCG0040(thongsochungchixecogioi.getXCG0040());
		thongsochungchixecogioiImpl.setXCG1040(thongsochungchixecogioi.getXCG1040());
		thongsochungchixecogioiImpl.setXCG1140(thongsochungchixecogioi.getXCG1140());
		thongsochungchixecogioiImpl.setXCG0041(thongsochungchixecogioi.getXCG0041());
		thongsochungchixecogioiImpl.setXCG1041(thongsochungchixecogioi.getXCG1041());
		thongsochungchixecogioiImpl.setXCG1141(thongsochungchixecogioi.getXCG1141());
		thongsochungchixecogioiImpl.setXCG0042(thongsochungchixecogioi.getXCG0042());
		thongsochungchixecogioiImpl.setXCG1042(thongsochungchixecogioi.getXCG1042());
		thongsochungchixecogioiImpl.setXCG1142(thongsochungchixecogioi.getXCG1142());
		thongsochungchixecogioiImpl.setXCG0043(thongsochungchixecogioi.getXCG0043());
		thongsochungchixecogioiImpl.setXCG1043(thongsochungchixecogioi.getXCG1043());
		thongsochungchixecogioiImpl.setXCG1143(thongsochungchixecogioi.getXCG1143());
		thongsochungchixecogioiImpl.setXCG0044(thongsochungchixecogioi.getXCG0044());
		thongsochungchixecogioiImpl.setXCG1044(thongsochungchixecogioi.getXCG1044());
		thongsochungchixecogioiImpl.setXCG1144(thongsochungchixecogioi.getXCG1144());
		thongsochungchixecogioiImpl.setXCG0045(thongsochungchixecogioi.getXCG0045());
		thongsochungchixecogioiImpl.setXCG0046(thongsochungchixecogioi.getXCG0046());
		thongsochungchixecogioiImpl.setXCG1047(thongsochungchixecogioi.getXCG1047());
		thongsochungchixecogioiImpl.setXCG0047(thongsochungchixecogioi.getXCG0047());
		thongsochungchixecogioiImpl.setXCG0048(thongsochungchixecogioi.getXCG0048());
		thongsochungchixecogioiImpl.setXCG0049(thongsochungchixecogioi.getXCG0049());
		thongsochungchixecogioiImpl.setXCG0050(thongsochungchixecogioi.getXCG0050());
		thongsochungchixecogioiImpl.setXCG0051(thongsochungchixecogioi.getXCG0051());
		thongsochungchixecogioiImpl.setXCG0052(thongsochungchixecogioi.getXCG0052());
		thongsochungchixecogioiImpl.setXCG0053(thongsochungchixecogioi.getXCG0053());
		thongsochungchixecogioiImpl.setXCG0054(thongsochungchixecogioi.getXCG0054());
		thongsochungchixecogioiImpl.setXCG1054(thongsochungchixecogioi.getXCG1054());
		thongsochungchixecogioiImpl.setXCG1154(thongsochungchixecogioi.getXCG1154());
		thongsochungchixecogioiImpl.setXCG1254(thongsochungchixecogioi.getXCG1254());
		thongsochungchixecogioiImpl.setXCG1354(thongsochungchixecogioi.getXCG1354());
		thongsochungchixecogioiImpl.setXCG1454(thongsochungchixecogioi.getXCG1454());
		thongsochungchixecogioiImpl.setXCG1554(thongsochungchixecogioi.getXCG1554());
		thongsochungchixecogioiImpl.setXCG1654(thongsochungchixecogioi.getXCG1654());
		thongsochungchixecogioiImpl.setXCG1754(thongsochungchixecogioi.getXCG1754());
		thongsochungchixecogioiImpl.setXCG0055(thongsochungchixecogioi.getXCG0055());
		thongsochungchixecogioiImpl.setXCG0056(thongsochungchixecogioi.getXCG0056());
		thongsochungchixecogioiImpl.setXCG0057(thongsochungchixecogioi.getXCG0057());
		thongsochungchixecogioiImpl.setXCG0058(thongsochungchixecogioi.getXCG0058());
		thongsochungchixecogioiImpl.setXCG0059(thongsochungchixecogioi.getXCG0059());
		thongsochungchixecogioiImpl.setXCG1059(thongsochungchixecogioi.getXCG1059());
		thongsochungchixecogioiImpl.setXCG0060(thongsochungchixecogioi.getXCG0060());
		thongsochungchixecogioiImpl.setXCG0061(thongsochungchixecogioi.getXCG0061());
		thongsochungchixecogioiImpl.setXCG0062(thongsochungchixecogioi.getXCG0062());
		thongsochungchixecogioiImpl.setXCG0063(thongsochungchixecogioi.getXCG0063());
		thongsochungchixecogioiImpl.setXCG0064(thongsochungchixecogioi.getXCG0064());
		thongsochungchixecogioiImpl.setXCG0065(thongsochungchixecogioi.getXCG0065());
		thongsochungchixecogioiImpl.setXCG0066(thongsochungchixecogioi.getXCG0066());
		thongsochungchixecogioiImpl.setXCG1066(thongsochungchixecogioi.getXCG1066());
		thongsochungchixecogioiImpl.setXCG0067(thongsochungchixecogioi.getXCG0067());
		thongsochungchixecogioiImpl.setXCG0068(thongsochungchixecogioi.getXCG0068());
		thongsochungchixecogioiImpl.setXCG0069(thongsochungchixecogioi.getXCG0069());
		thongsochungchixecogioiImpl.setXCG0070(thongsochungchixecogioi.getXCG0070());
		thongsochungchixecogioiImpl.setXCG0071(thongsochungchixecogioi.getXCG0071());
		thongsochungchixecogioiImpl.setXCG0072(thongsochungchixecogioi.getXCG0072());
		thongsochungchixecogioiImpl.setXCG1072(thongsochungchixecogioi.getXCG1072());
		thongsochungchixecogioiImpl.setXCG0073(thongsochungchixecogioi.getXCG0073());
		thongsochungchixecogioiImpl.setXCG0074(thongsochungchixecogioi.getXCG0074());
		thongsochungchixecogioiImpl.setXCG0075(thongsochungchixecogioi.getXCG0075());
		thongsochungchixecogioiImpl.setXCG0076(thongsochungchixecogioi.getXCG0076());
		thongsochungchixecogioiImpl.setXCG0077(thongsochungchixecogioi.getXCG0077());
		thongsochungchixecogioiImpl.setXCG1077(thongsochungchixecogioi.getXCG1077());
		thongsochungchixecogioiImpl.setXCG0078(thongsochungchixecogioi.getXCG0078());
		thongsochungchixecogioiImpl.setXCG1078(thongsochungchixecogioi.getXCG1078());
		thongsochungchixecogioiImpl.setXCG0079(thongsochungchixecogioi.getXCG0079());
		thongsochungchixecogioiImpl.setXCG0080(thongsochungchixecogioi.getXCG0080());
		thongsochungchixecogioiImpl.setXCG1080(thongsochungchixecogioi.getXCG1080());
		thongsochungchixecogioiImpl.setXCG0081(thongsochungchixecogioi.getXCG0081());
		thongsochungchixecogioiImpl.setXCG0082(thongsochungchixecogioi.getXCG0082());
		thongsochungchixecogioiImpl.setXCG0083(thongsochungchixecogioi.getXCG0083());
		thongsochungchixecogioiImpl.setXCG0084(thongsochungchixecogioi.getXCG0084());
		thongsochungchixecogioiImpl.setXCG0085(thongsochungchixecogioi.getXCG0085());
		thongsochungchixecogioiImpl.setXCG1085(thongsochungchixecogioi.getXCG1085());
		thongsochungchixecogioiImpl.setXCG0086(thongsochungchixecogioi.getXCG0086());
		thongsochungchixecogioiImpl.setXCG1086(thongsochungchixecogioi.getXCG1086());
		thongsochungchixecogioiImpl.setXCG0087(thongsochungchixecogioi.getXCG0087());
		thongsochungchixecogioiImpl.setXCG0088(thongsochungchixecogioi.getXCG0088());
		thongsochungchixecogioiImpl.setXCG1088(thongsochungchixecogioi.getXCG1088());
		thongsochungchixecogioiImpl.setXCG0089(thongsochungchixecogioi.getXCG0089());
		thongsochungchixecogioiImpl.setXCG0090(thongsochungchixecogioi.getXCG0090());
		thongsochungchixecogioiImpl.setXCG0091(thongsochungchixecogioi.getXCG0091());
		thongsochungchixecogioiImpl.setXCG0092(thongsochungchixecogioi.getXCG0092());
		thongsochungchixecogioiImpl.setXCG0093(thongsochungchixecogioi.getXCG0093());
		thongsochungchixecogioiImpl.setXCG0094(thongsochungchixecogioi.getXCG0094());
		thongsochungchixecogioiImpl.setXCG0095(thongsochungchixecogioi.getXCG0095());
		thongsochungchixecogioiImpl.setXCG0096(thongsochungchixecogioi.getXCG0096());
		thongsochungchixecogioiImpl.setXCG0097(thongsochungchixecogioi.getXCG0097());
		thongsochungchixecogioiImpl.setXCG1097(thongsochungchixecogioi.getXCG1097());
		thongsochungchixecogioiImpl.setXCG0098(thongsochungchixecogioi.getXCG0098());
		thongsochungchixecogioiImpl.setXCG0099(thongsochungchixecogioi.getXCG0099());
		thongsochungchixecogioiImpl.setXCG0100(thongsochungchixecogioi.getXCG0100());
		thongsochungchixecogioiImpl.setXCG0101(thongsochungchixecogioi.getXCG0101());
		thongsochungchixecogioiImpl.setXCG0102(thongsochungchixecogioi.getXCG0102());
		thongsochungchixecogioiImpl.setXCG0103(thongsochungchixecogioi.getXCG0103());
		thongsochungchixecogioiImpl.setXCG0104(thongsochungchixecogioi.getXCG0104());
		thongsochungchixecogioiImpl.setXCG0105(thongsochungchixecogioi.getXCG0105());
		thongsochungchixecogioiImpl.setXCG0106(thongsochungchixecogioi.getXCG0106());
		thongsochungchixecogioiImpl.setXCG0107(thongsochungchixecogioi.getXCG0107());
		thongsochungchixecogioiImpl.setXCG0108(thongsochungchixecogioi.getXCG0108());
		thongsochungchixecogioiImpl.setXCG0109(thongsochungchixecogioi.getXCG0109());
		thongsochungchixecogioiImpl.setXCG0110(thongsochungchixecogioi.getXCG0110());
		thongsochungchixecogioiImpl.setXCG0111(thongsochungchixecogioi.getXCG0111());
		thongsochungchixecogioiImpl.setXCG0112(thongsochungchixecogioi.getXCG0112());
		thongsochungchixecogioiImpl.setXCG0113(thongsochungchixecogioi.getXCG0113());
		thongsochungchixecogioiImpl.setXCG0114(thongsochungchixecogioi.getXCG0114());
		thongsochungchixecogioiImpl.setXCG0115(thongsochungchixecogioi.getXCG0115());
		thongsochungchixecogioiImpl.setXCG0116(thongsochungchixecogioi.getXCG0116());
		thongsochungchixecogioiImpl.setXCG0117(thongsochungchixecogioi.getXCG0117());
		thongsochungchixecogioiImpl.setXCG0118(thongsochungchixecogioi.getXCG0118());
		thongsochungchixecogioiImpl.setXCG0119(thongsochungchixecogioi.getXCG0119());
		thongsochungchixecogioiImpl.setXCG0120(thongsochungchixecogioi.getXCG0120());
		thongsochungchixecogioiImpl.setXCG0121(thongsochungchixecogioi.getXCG0121());
		thongsochungchixecogioiImpl.setXCG0122(thongsochungchixecogioi.getXCG0122());
		thongsochungchixecogioiImpl.setXCG0123(thongsochungchixecogioi.getXCG0123());
		thongsochungchixecogioiImpl.setXCG0124(thongsochungchixecogioi.getXCG0124());
		thongsochungchixecogioiImpl.setXCG0125(thongsochungchixecogioi.getXCG0125());
		thongsochungchixecogioiImpl.setXCG0126(thongsochungchixecogioi.getXCG0126());
		thongsochungchixecogioiImpl.setXCG0127(thongsochungchixecogioi.getXCG0127());
		thongsochungchixecogioiImpl.setXCG0128(thongsochungchixecogioi.getXCG0128());
		thongsochungchixecogioiImpl.setXCG0238(thongsochungchixecogioi.getXCG0238());
		thongsochungchixecogioiImpl.setXCG0239(thongsochungchixecogioi.getXCG0239());
		thongsochungchixecogioiImpl.setXCG0240(thongsochungchixecogioi.getXCG0240());
		thongsochungchixecogioiImpl.setXCG0241(thongsochungchixecogioi.getXCG0241());

		return thongsochungchixecogioiImpl;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = fetchByPrimaryKey(primaryKey);

		if (thongsochungchixecogioi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGSOCHUNGCHIXECOGIOIException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongsochungchixecogioi;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI findByPrimaryKey(long id)
		throws NoSuchTHONGSOCHUNGCHIXECOGIOIException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi = (THONGSOCHUNGCHIXECOGIOI)EntityCacheUtil.getResult(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXECOGIOIImpl.class, primaryKey);

		if (thongsochungchixecogioi == _nullTHONGSOCHUNGCHIXECOGIOI) {
			return null;
		}

		if (thongsochungchixecogioi == null) {
			Session session = null;

			try {
				session = openSession();

				thongsochungchixecogioi = (THONGSOCHUNGCHIXECOGIOI)session.get(THONGSOCHUNGCHIXECOGIOIImpl.class,
						primaryKey);

				if (thongsochungchixecogioi != null) {
					cacheResult(thongsochungchixecogioi);
				}
				else {
					EntityCacheUtil.putResult(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXECOGIOIImpl.class, primaryKey,
						_nullTHONGSOCHUNGCHIXECOGIOI);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECOGIOIModelImpl.ENTITY_CACHE_ENABLED,
					THONGSOCHUNGCHIXECOGIOIImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongsochungchixecogioi;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i, or <code>null</code> if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECOGIOI fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c o g i o is.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o is.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @return the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o is.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g s o c h u n g c h i x e c o g i o is
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECOGIOI> findAll(int start, int end,
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

		List<THONGSOCHUNGCHIXECOGIOI> list = (List<THONGSOCHUNGCHIXECOGIOI>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGSOCHUNGCHIXECOGIOI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGSOCHUNGCHIXECOGIOI;

				if (pagination) {
					sql = sql.concat(THONGSOCHUNGCHIXECOGIOIModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECOGIOI>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECOGIOI>)QueryUtil.list(q,
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
	 * Removes all the t h o n g s o c h u n g c h i x e c o g i o is from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi : findAll()) {
			remove(thongsochungchixecogioi);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c o g i o is.
	 *
	 * @return the number of t h o n g s o c h u n g c h i x e c o g i o is
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

				Query q = session.createQuery(_SQL_COUNT_THONGSOCHUNGCHIXECOGIOI);

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
	 * Initializes the t h o n g s o c h u n g c h i x e c o g i o i persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGSOCHUNGCHIXECOGIOI>> listenersList = new ArrayList<ModelListener<THONGSOCHUNGCHIXECOGIOI>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGSOCHUNGCHIXECOGIOI>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGSOCHUNGCHIXECOGIOIImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGSOCHUNGCHIXECOGIOI = "SELECT thongsochungchixecogioi FROM THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi";
	private static final String _SQL_SELECT_THONGSOCHUNGCHIXECOGIOI_WHERE = "SELECT thongsochungchixecogioi FROM THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi WHERE ";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXECOGIOI = "SELECT COUNT(thongsochungchixecogioi) FROM THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXECOGIOI_WHERE = "SELECT COUNT(thongsochungchixecogioi) FROM THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongsochungchixecogioi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGSOCHUNGCHIXECOGIOI exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGSOCHUNGCHIXECOGIOI exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXECOGIOIPersistenceImpl.class);
	private static THONGSOCHUNGCHIXECOGIOI _nullTHONGSOCHUNGCHIXECOGIOI = new THONGSOCHUNGCHIXECOGIOIImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGSOCHUNGCHIXECOGIOI> toCacheModel() {
				return _nullTHONGSOCHUNGCHIXECOGIOICacheModel;
			}
		};

	private static CacheModel<THONGSOCHUNGCHIXECOGIOI> _nullTHONGSOCHUNGCHIXECOGIOICacheModel =
		new CacheModel<THONGSOCHUNGCHIXECOGIOI>() {
			@Override
			public THONGSOCHUNGCHIXECOGIOI toEntityModel() {
				return _nullTHONGSOCHUNGCHIXECOGIOI;
			}
		};
}