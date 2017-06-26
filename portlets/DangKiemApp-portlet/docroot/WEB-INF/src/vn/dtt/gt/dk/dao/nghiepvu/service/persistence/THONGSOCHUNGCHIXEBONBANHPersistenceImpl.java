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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h o n g s o c h u n g c h i x e b o n b a n h service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEBONBANHPersistence
 * @see THONGSOCHUNGCHIXEBONBANHUtil
 * @generated
 */
public class THONGSOCHUNGCHIXEBONBANHPersistenceImpl extends BasePersistenceImpl<THONGSOCHUNGCHIXEBONBANH>
	implements THONGSOCHUNGCHIXEBONBANHPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGSOCHUNGCHIXEBONBANHUtil} to access the t h o n g s o c h u n g c h i x e b o n b a n h persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGSOCHUNGCHIXEBONBANHImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEBONBANHModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e b o n b a n hs where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e b o n b a n hs where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e b o n b a n hs where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByHoSoThuTucId(
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

		List<THONGSOCHUNGCHIXEBONBANH> list = (List<THONGSOCHUNGCHIXEBONBANH>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : list) {
				if ((hoSoThuTucId != thongsochungchixebonbanh.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEBONBANH_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEBONBANHModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEBONBANH>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixebonbanh != null) {
			return thongsochungchixebonbanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEBONBANH> list = findByHoSoThuTucId(hoSoThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixebonbanh != null) {
			return thongsochungchixebonbanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByHoSoThuTucId_Last(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEBONBANH> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n hs before and after the current t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e b o n b a n h
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEBONBANH[] array = new THONGSOCHUNGCHIXEBONBANHImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixebonbanh, hoSoThuTucId, orderByComparator,
					true);

			array[1] = thongsochungchixebonbanh;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixebonbanh, hoSoThuTucId, orderByComparator,
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

	protected THONGSOCHUNGCHIXEBONBANH getByHoSoThuTucId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEBONBANH_WHERE);

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
			query.append(THONGSOCHUNGCHIXEBONBANHModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixebonbanh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEBONBANH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e b o n b a n hs where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixebonbanh);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e b o n b a n hs where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e b o n b a n hs
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEBONBANH_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "thongsochungchixebonbanh.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEBONBANHModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e b o n b a n hs where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e b o n b a n hs where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e b o n b a n hs where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByCertificateRecordId(
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

		List<THONGSOCHUNGCHIXEBONBANH> list = (List<THONGSOCHUNGCHIXEBONBANH>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : list) {
				if ((certificateRecordId != thongsochungchixebonbanh.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEBONBANH_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEBONBANHModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEBONBANH>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (thongsochungchixebonbanh != null) {
			return thongsochungchixebonbanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEBONBANH> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (thongsochungchixebonbanh != null) {
			return thongsochungchixebonbanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEBONBANH> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n hs before and after the current t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e b o n b a n h
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEBONBANH[] array = new THONGSOCHUNGCHIXEBONBANHImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixebonbanh, certificateRecordId,
					orderByComparator, true);

			array[1] = thongsochungchixebonbanh;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixebonbanh, certificateRecordId,
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

	protected THONGSOCHUNGCHIXEBONBANH getByCertificateRecordId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEBONBANH_WHERE);

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
			query.append(THONGSOCHUNGCHIXEBONBANHModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixebonbanh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEBONBANH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e b o n b a n hs where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixebonbanh);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e b o n b a n hs where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e b o n b a n hs
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEBONBANH_WHERE);

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
		"thongsochungchixebonbanh.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEBONBANHModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e b o n b a n hs where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByVehicleGroupId(
		long vehicleGroupId) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e b o n b a n hs where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e b o n b a n hs where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findByVehicleGroupId(
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

		List<THONGSOCHUNGCHIXEBONBANH> list = (List<THONGSOCHUNGCHIXEBONBANH>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : list) {
				if ((vehicleGroupId != thongsochungchixebonbanh.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEBONBANH_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEBONBANHModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEBONBANH>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixebonbanh != null) {
			return thongsochungchixebonbanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEBONBANH> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixebonbanh != null) {
			return thongsochungchixebonbanh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e b o n b a n h could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEBONBANH> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n hs before and after the current t h o n g s o c h u n g c h i x e b o n b a n h in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e b o n b a n h
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEBONBANH[] array = new THONGSOCHUNGCHIXEBONBANHImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixebonbanh, vehicleGroupId,
					orderByComparator, true);

			array[1] = thongsochungchixebonbanh;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixebonbanh, vehicleGroupId,
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

	protected THONGSOCHUNGCHIXEBONBANH getByVehicleGroupId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEBONBANH_WHERE);

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
			query.append(THONGSOCHUNGCHIXEBONBANHModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixebonbanh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEBONBANH> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e b o n b a n hs where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixebonbanh);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e b o n b a n hs where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e b o n b a n hs
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEBONBANH_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "thongsochungchixebonbanh.vehicleGroupId = ?";

	public THONGSOCHUNGCHIXEBONBANHPersistenceImpl() {
		setModelClass(THONGSOCHUNGCHIXEBONBANH.class);
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e b o n b a n h in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixebonbanh the t h o n g s o c h u n g c h i x e b o n b a n h
	 */
	@Override
	public void cacheResult(THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh) {
		EntityCacheUtil.putResult(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			thongsochungchixebonbanh.getPrimaryKey(), thongsochungchixebonbanh);

		thongsochungchixebonbanh.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e b o n b a n hs in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixebonbanhs the t h o n g s o c h u n g c h i x e b o n b a n hs
	 */
	@Override
	public void cacheResult(
		List<THONGSOCHUNGCHIXEBONBANH> thongsochungchixebonbanhs) {
		for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : thongsochungchixebonbanhs) {
			if (EntityCacheUtil.getResult(
						THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXEBONBANHImpl.class,
						thongsochungchixebonbanh.getPrimaryKey()) == null) {
				cacheResult(thongsochungchixebonbanh);
			}
			else {
				thongsochungchixebonbanh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g s o c h u n g c h i x e b o n b a n hs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGSOCHUNGCHIXEBONBANHImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGSOCHUNGCHIXEBONBANHImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g s o c h u n g c h i x e b o n b a n h.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh) {
		EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			thongsochungchixebonbanh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<THONGSOCHUNGCHIXEBONBANH> thongsochungchixebonbanhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : thongsochungchixebonbanhs) {
			EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXEBONBANHImpl.class,
				thongsochungchixebonbanh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g s o c h u n g c h i x e b o n b a n h with the primary key. Does not add the t h o n g s o c h u n g c h i x e b o n b a n h to the database.
	 *
	 * @param id the primary key for the new t h o n g s o c h u n g c h i x e b o n b a n h
	 * @return the new t h o n g s o c h u n g c h i x e b o n b a n h
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH create(long id) {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = new THONGSOCHUNGCHIXEBONBANHImpl();

		thongsochungchixebonbanh.setNew(true);
		thongsochungchixebonbanh.setPrimaryKey(id);

		return thongsochungchixebonbanh;
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e b o n b a n h with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH remove(long id)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e b o n b a n h with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH remove(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = (THONGSOCHUNGCHIXEBONBANH)session.get(THONGSOCHUNGCHIXEBONBANHImpl.class,
					primaryKey);

			if (thongsochungchixebonbanh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongsochungchixebonbanh);
		}
		catch (NoSuchTHONGSOCHUNGCHIXEBONBANHException nsee) {
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
	protected THONGSOCHUNGCHIXEBONBANH removeImpl(
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh)
		throws SystemException {
		thongsochungchixebonbanh = toUnwrappedModel(thongsochungchixebonbanh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongsochungchixebonbanh)) {
				thongsochungchixebonbanh = (THONGSOCHUNGCHIXEBONBANH)session.get(THONGSOCHUNGCHIXEBONBANHImpl.class,
						thongsochungchixebonbanh.getPrimaryKeyObj());
			}

			if (thongsochungchixebonbanh != null) {
				session.delete(thongsochungchixebonbanh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongsochungchixebonbanh != null) {
			clearCache(thongsochungchixebonbanh);
		}

		return thongsochungchixebonbanh;
	}

	@Override
	public THONGSOCHUNGCHIXEBONBANH updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh)
		throws SystemException {
		thongsochungchixebonbanh = toUnwrappedModel(thongsochungchixebonbanh);

		boolean isNew = thongsochungchixebonbanh.isNew();

		THONGSOCHUNGCHIXEBONBANHModelImpl thongsochungchixebonbanhModelImpl = (THONGSOCHUNGCHIXEBONBANHModelImpl)thongsochungchixebonbanh;

		Session session = null;

		try {
			session = openSession();

			if (thongsochungchixebonbanh.isNew()) {
				session.save(thongsochungchixebonbanh);

				thongsochungchixebonbanh.setNew(false);
			}
			else {
				session.merge(thongsochungchixebonbanh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !THONGSOCHUNGCHIXEBONBANHModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongsochungchixebonbanhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixebonbanhModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						thongsochungchixebonbanhModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((thongsochungchixebonbanhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixebonbanhModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						thongsochungchixebonbanhModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((thongsochungchixebonbanhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixebonbanhModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						thongsochungchixebonbanhModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEBONBANHImpl.class,
			thongsochungchixebonbanh.getPrimaryKey(), thongsochungchixebonbanh);

		return thongsochungchixebonbanh;
	}

	protected THONGSOCHUNGCHIXEBONBANH toUnwrappedModel(
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh) {
		if (thongsochungchixebonbanh instanceof THONGSOCHUNGCHIXEBONBANHImpl) {
			return thongsochungchixebonbanh;
		}

		THONGSOCHUNGCHIXEBONBANHImpl thongsochungchixebonbanhImpl = new THONGSOCHUNGCHIXEBONBANHImpl();

		thongsochungchixebonbanhImpl.setNew(thongsochungchixebonbanh.isNew());
		thongsochungchixebonbanhImpl.setPrimaryKey(thongsochungchixebonbanh.getPrimaryKey());

		thongsochungchixebonbanhImpl.setId(thongsochungchixebonbanh.getId());
		thongsochungchixebonbanhImpl.setHoSoThuTucId(thongsochungchixebonbanh.getHoSoThuTucId());
		thongsochungchixebonbanhImpl.setCertificateRecordId(thongsochungchixebonbanh.getCertificateRecordId());
		thongsochungchixebonbanhImpl.setVehicleGroupId(thongsochungchixebonbanh.getVehicleGroupId());
		thongsochungchixebonbanhImpl.setSynchDate(thongsochungchixebonbanh.getSynchDate());
		thongsochungchixebonbanhImpl.setXBB0009(thongsochungchixebonbanh.getXBB0009());
		thongsochungchixebonbanhImpl.setXBB0010(thongsochungchixebonbanh.getXBB0010());
		thongsochungchixebonbanhImpl.setXBB0011(thongsochungchixebonbanh.getXBB0011());
		thongsochungchixebonbanhImpl.setXBB0012(thongsochungchixebonbanh.getXBB0012());
		thongsochungchixebonbanhImpl.setXBB0013(thongsochungchixebonbanh.getXBB0013());
		thongsochungchixebonbanhImpl.setXBB0014(thongsochungchixebonbanh.getXBB0014());
		thongsochungchixebonbanhImpl.setXBB1014(thongsochungchixebonbanh.getXBB1014());
		thongsochungchixebonbanhImpl.setXBB1114(thongsochungchixebonbanh.getXBB1114());
		thongsochungchixebonbanhImpl.setXBB0015(thongsochungchixebonbanh.getXBB0015());
		thongsochungchixebonbanhImpl.setXBB1015(thongsochungchixebonbanh.getXBB1015());
		thongsochungchixebonbanhImpl.setXBB1115(thongsochungchixebonbanh.getXBB1115());
		thongsochungchixebonbanhImpl.setXBB0016(thongsochungchixebonbanh.getXBB0016());
		thongsochungchixebonbanhImpl.setXBB1016(thongsochungchixebonbanh.getXBB1016());
		thongsochungchixebonbanhImpl.setXBB1116(thongsochungchixebonbanh.getXBB1116());
		thongsochungchixebonbanhImpl.setXBB0017(thongsochungchixebonbanh.getXBB0017());
		thongsochungchixebonbanhImpl.setXBB1017(thongsochungchixebonbanh.getXBB1017());
		thongsochungchixebonbanhImpl.setXBB1117(thongsochungchixebonbanh.getXBB1117());
		thongsochungchixebonbanhImpl.setXBB0018(thongsochungchixebonbanh.getXBB0018());
		thongsochungchixebonbanhImpl.setXBB0019(thongsochungchixebonbanh.getXBB0019());
		thongsochungchixebonbanhImpl.setXBB0020(thongsochungchixebonbanh.getXBB0020());
		thongsochungchixebonbanhImpl.setXBB0021(thongsochungchixebonbanh.getXBB0021());
		thongsochungchixebonbanhImpl.setXBB0022(thongsochungchixebonbanh.getXBB0022());
		thongsochungchixebonbanhImpl.setXBB1022(thongsochungchixebonbanh.getXBB1022());
		thongsochungchixebonbanhImpl.setXBB0023(thongsochungchixebonbanh.getXBB0023());
		thongsochungchixebonbanhImpl.setXBB0024(thongsochungchixebonbanh.getXBB0024());
		thongsochungchixebonbanhImpl.setXBB0025(thongsochungchixebonbanh.getXBB0025());
		thongsochungchixebonbanhImpl.setXBB0026(thongsochungchixebonbanh.getXBB0026());
		thongsochungchixebonbanhImpl.setXBB1026(thongsochungchixebonbanh.getXBB1026());
		thongsochungchixebonbanhImpl.setXBB0027(thongsochungchixebonbanh.getXBB0027());
		thongsochungchixebonbanhImpl.setXBB1027(thongsochungchixebonbanh.getXBB1027());
		thongsochungchixebonbanhImpl.setXBB0028(thongsochungchixebonbanh.getXBB0028());
		thongsochungchixebonbanhImpl.setXBB0029(thongsochungchixebonbanh.getXBB0029());
		thongsochungchixebonbanhImpl.setXBB1029(thongsochungchixebonbanh.getXBB1029());
		thongsochungchixebonbanhImpl.setXBB0030(thongsochungchixebonbanh.getXBB0030());
		thongsochungchixebonbanhImpl.setXBB0031(thongsochungchixebonbanh.getXBB0031());
		thongsochungchixebonbanhImpl.setXBB0032(thongsochungchixebonbanh.getXBB0032());
		thongsochungchixebonbanhImpl.setXBB0033(thongsochungchixebonbanh.getXBB0033());
		thongsochungchixebonbanhImpl.setXBB1033(thongsochungchixebonbanh.getXBB1033());
		thongsochungchixebonbanhImpl.setXBB0034(thongsochungchixebonbanh.getXBB0034());
		thongsochungchixebonbanhImpl.setXBB1034(thongsochungchixebonbanh.getXBB1034());
		thongsochungchixebonbanhImpl.setXBB0035(thongsochungchixebonbanh.getXBB0035());
		thongsochungchixebonbanhImpl.setXBB0036(thongsochungchixebonbanh.getXBB0036());
		thongsochungchixebonbanhImpl.setXBB1036(thongsochungchixebonbanh.getXBB1036());
		thongsochungchixebonbanhImpl.setXBB0037(thongsochungchixebonbanh.getXBB0037());
		thongsochungchixebonbanhImpl.setXBB0038(thongsochungchixebonbanh.getXBB0038());
		thongsochungchixebonbanhImpl.setXBB0039(thongsochungchixebonbanh.getXBB0039());
		thongsochungchixebonbanhImpl.setXBB0040(thongsochungchixebonbanh.getXBB0040());
		thongsochungchixebonbanhImpl.setXBB0041(thongsochungchixebonbanh.getXBB0041());
		thongsochungchixebonbanhImpl.setXBB0042(thongsochungchixebonbanh.getXBB0042());
		thongsochungchixebonbanhImpl.setXBB0043(thongsochungchixebonbanh.getXBB0043());
		thongsochungchixebonbanhImpl.setXBB0044(thongsochungchixebonbanh.getXBB0044());
		thongsochungchixebonbanhImpl.setXBB1044(thongsochungchixebonbanh.getXBB1044());
		thongsochungchixebonbanhImpl.setXBB0045(thongsochungchixebonbanh.getXBB0045());
		thongsochungchixebonbanhImpl.setXBB0046(thongsochungchixebonbanh.getXBB0046());
		thongsochungchixebonbanhImpl.setXBB0047(thongsochungchixebonbanh.getXBB0047());
		thongsochungchixebonbanhImpl.setXBB0048(thongsochungchixebonbanh.getXBB0048());
		thongsochungchixebonbanhImpl.setXBB0049(thongsochungchixebonbanh.getXBB0049());
		thongsochungchixebonbanhImpl.setXBB0050(thongsochungchixebonbanh.getXBB0050());
		thongsochungchixebonbanhImpl.setXBB0051(thongsochungchixebonbanh.getXBB0051());
		thongsochungchixebonbanhImpl.setXBB0052(thongsochungchixebonbanh.getXBB0052());
		thongsochungchixebonbanhImpl.setXBB0053(thongsochungchixebonbanh.getXBB0053());
		thongsochungchixebonbanhImpl.setXBB0054(thongsochungchixebonbanh.getXBB0054());
		thongsochungchixebonbanhImpl.setXBB0055(thongsochungchixebonbanh.getXBB0055());
		thongsochungchixebonbanhImpl.setXBB0056(thongsochungchixebonbanh.getXBB0056());
		thongsochungchixebonbanhImpl.setXBB0057(thongsochungchixebonbanh.getXBB0057());
		thongsochungchixebonbanhImpl.setXBB0058(thongsochungchixebonbanh.getXBB0058());
		thongsochungchixebonbanhImpl.setXBB0059(thongsochungchixebonbanh.getXBB0059());
		thongsochungchixebonbanhImpl.setXBB0060(thongsochungchixebonbanh.getXBB0060());
		thongsochungchixebonbanhImpl.setXBB0061(thongsochungchixebonbanh.getXBB0061());
		thongsochungchixebonbanhImpl.setXBB0062(thongsochungchixebonbanh.getXBB0062());
		thongsochungchixebonbanhImpl.setXBB0063(thongsochungchixebonbanh.getXBB0063());
		thongsochungchixebonbanhImpl.setXBB0076(thongsochungchixebonbanh.getXBB0076());
		thongsochungchixebonbanhImpl.setXBB0077(thongsochungchixebonbanh.getXBB0077());
		thongsochungchixebonbanhImpl.setXBB0078(thongsochungchixebonbanh.getXBB0078());
		thongsochungchixebonbanhImpl.setXBB0079(thongsochungchixebonbanh.getXBB0079());
		thongsochungchixebonbanhImpl.setXBB0080(thongsochungchixebonbanh.getXBB0080());
		thongsochungchixebonbanhImpl.setXBB1080(thongsochungchixebonbanh.getXBB1080());
		thongsochungchixebonbanhImpl.setXBB0081(thongsochungchixebonbanh.getXBB0081());
		thongsochungchixebonbanhImpl.setXBB1081(thongsochungchixebonbanh.getXBB1081());
		thongsochungchixebonbanhImpl.setXBB1181(thongsochungchixebonbanh.getXBB1181());
		thongsochungchixebonbanhImpl.setXBB0082(thongsochungchixebonbanh.getXBB0082());
		thongsochungchixebonbanhImpl.setXBB1082(thongsochungchixebonbanh.getXBB1082());
		thongsochungchixebonbanhImpl.setXBB1182(thongsochungchixebonbanh.getXBB1182());
		thongsochungchixebonbanhImpl.setXBB0083(thongsochungchixebonbanh.getXBB0083());
		thongsochungchixebonbanhImpl.setXBB1083(thongsochungchixebonbanh.getXBB1083());
		thongsochungchixebonbanhImpl.setXBB1183(thongsochungchixebonbanh.getXBB1183());
		thongsochungchixebonbanhImpl.setXBB0084(thongsochungchixebonbanh.getXBB0084());
		thongsochungchixebonbanhImpl.setXBB0085(thongsochungchixebonbanh.getXBB0085());
		thongsochungchixebonbanhImpl.setXBB0086(thongsochungchixebonbanh.getXBB0086());
		thongsochungchixebonbanhImpl.setXBB0087(thongsochungchixebonbanh.getXBB0087());
		thongsochungchixebonbanhImpl.setXBB0088(thongsochungchixebonbanh.getXBB0088());
		thongsochungchixebonbanhImpl.setXBB0089(thongsochungchixebonbanh.getXBB0089());
		thongsochungchixebonbanhImpl.setXBB0090(thongsochungchixebonbanh.getXBB0090());
		thongsochungchixebonbanhImpl.setXBB0091(thongsochungchixebonbanh.getXBB0091());
		thongsochungchixebonbanhImpl.setXBB0092(thongsochungchixebonbanh.getXBB0092());
		thongsochungchixebonbanhImpl.setXBB0093(thongsochungchixebonbanh.getXBB0093());
		thongsochungchixebonbanhImpl.setXBB0094(thongsochungchixebonbanh.getXBB0094());
		thongsochungchixebonbanhImpl.setXBB0095(thongsochungchixebonbanh.getXBB0095());
		thongsochungchixebonbanhImpl.setXBB0096(thongsochungchixebonbanh.getXBB0096());
		thongsochungchixebonbanhImpl.setXBB0097(thongsochungchixebonbanh.getXBB0097());
		thongsochungchixebonbanhImpl.setXBB0098(thongsochungchixebonbanh.getXBB0098());
		thongsochungchixebonbanhImpl.setXBB0099(thongsochungchixebonbanh.getXBB0099());
		thongsochungchixebonbanhImpl.setXBB0100(thongsochungchixebonbanh.getXBB0100());
		thongsochungchixebonbanhImpl.setXBB0101(thongsochungchixebonbanh.getXBB0101());
		thongsochungchixebonbanhImpl.setXBB0102(thongsochungchixebonbanh.getXBB0102());
		thongsochungchixebonbanhImpl.setXBB0103(thongsochungchixebonbanh.getXBB0103());
		thongsochungchixebonbanhImpl.setXBB0104(thongsochungchixebonbanh.getXBB0104());
		thongsochungchixebonbanhImpl.setXBB2104(thongsochungchixebonbanh.getXBB2104());
		thongsochungchixebonbanhImpl.setXBB0105(thongsochungchixebonbanh.getXBB0105());
		thongsochungchixebonbanhImpl.setXBB2105(thongsochungchixebonbanh.getXBB2105());
		thongsochungchixebonbanhImpl.setXBB0106(thongsochungchixebonbanh.getXBB0106());
		thongsochungchixebonbanhImpl.setXBB2106(thongsochungchixebonbanh.getXBB2106());
		thongsochungchixebonbanhImpl.setXBB0107(thongsochungchixebonbanh.getXBB0107());
		thongsochungchixebonbanhImpl.setXBB2107(thongsochungchixebonbanh.getXBB2107());
		thongsochungchixebonbanhImpl.setXBB0108(thongsochungchixebonbanh.getXBB0108());
		thongsochungchixebonbanhImpl.setXBB2108(thongsochungchixebonbanh.getXBB2108());
		thongsochungchixebonbanhImpl.setXBB0109(thongsochungchixebonbanh.getXBB0109());
		thongsochungchixebonbanhImpl.setXBB2109(thongsochungchixebonbanh.getXBB2109());
		thongsochungchixebonbanhImpl.setXBB0110(thongsochungchixebonbanh.getXBB0110());
		thongsochungchixebonbanhImpl.setXBB2110(thongsochungchixebonbanh.getXBB2110());
		thongsochungchixebonbanhImpl.setXBB0111(thongsochungchixebonbanh.getXBB0111());
		thongsochungchixebonbanhImpl.setXBB2111(thongsochungchixebonbanh.getXBB2111());
		thongsochungchixebonbanhImpl.setXBB0112(thongsochungchixebonbanh.getXBB0112());
		thongsochungchixebonbanhImpl.setXBB2112(thongsochungchixebonbanh.getXBB2112());
		thongsochungchixebonbanhImpl.setXBB0113(thongsochungchixebonbanh.getXBB0113());
		thongsochungchixebonbanhImpl.setXBB2113(thongsochungchixebonbanh.getXBB2113());
		thongsochungchixebonbanhImpl.setXBB0114(thongsochungchixebonbanh.getXBB0114());
		thongsochungchixebonbanhImpl.setXBB2114(thongsochungchixebonbanh.getXBB2114());
		thongsochungchixebonbanhImpl.setXBB0115(thongsochungchixebonbanh.getXBB0115());
		thongsochungchixebonbanhImpl.setXBB2115(thongsochungchixebonbanh.getXBB2115());
		thongsochungchixebonbanhImpl.setXBB0116(thongsochungchixebonbanh.getXBB0116());
		thongsochungchixebonbanhImpl.setXBB2116(thongsochungchixebonbanh.getXBB2116());
		thongsochungchixebonbanhImpl.setXBB0117(thongsochungchixebonbanh.getXBB0117());
		thongsochungchixebonbanhImpl.setXBB2117(thongsochungchixebonbanh.getXBB2117());
		thongsochungchixebonbanhImpl.setXBB0118(thongsochungchixebonbanh.getXBB0118());
		thongsochungchixebonbanhImpl.setXBB0119(thongsochungchixebonbanh.getXBB0119());
		thongsochungchixebonbanhImpl.setXBB2119(thongsochungchixebonbanh.getXBB2119());
		thongsochungchixebonbanhImpl.setXBB0120(thongsochungchixebonbanh.getXBB0120());
		thongsochungchixebonbanhImpl.setXBB0121(thongsochungchixebonbanh.getXBB0121());
		thongsochungchixebonbanhImpl.setXBB0122(thongsochungchixebonbanh.getXBB0122());
		thongsochungchixebonbanhImpl.setXBB0123(thongsochungchixebonbanh.getXBB0123());
		thongsochungchixebonbanhImpl.setXBB0124(thongsochungchixebonbanh.getXBB0124());
		thongsochungchixebonbanhImpl.setXBB0125(thongsochungchixebonbanh.getXBB0125());
		thongsochungchixebonbanhImpl.setXBB0126(thongsochungchixebonbanh.getXBB0126());
		thongsochungchixebonbanhImpl.setXBB1084(thongsochungchixebonbanh.getXBB1084());
		thongsochungchixebonbanhImpl.setXBB1086(thongsochungchixebonbanh.getXBB1086());

		return thongsochungchixebonbanhImpl;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = fetchByPrimaryKey(primaryKey);

		if (thongsochungchixebonbanh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGSOCHUNGCHIXEBONBANHException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongsochungchixebonbanh;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH findByPrimaryKey(long id)
		throws NoSuchTHONGSOCHUNGCHIXEBONBANHException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh = (THONGSOCHUNGCHIXEBONBANH)EntityCacheUtil.getResult(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXEBONBANHImpl.class, primaryKey);

		if (thongsochungchixebonbanh == _nullTHONGSOCHUNGCHIXEBONBANH) {
			return null;
		}

		if (thongsochungchixebonbanh == null) {
			Session session = null;

			try {
				session = openSession();

				thongsochungchixebonbanh = (THONGSOCHUNGCHIXEBONBANH)session.get(THONGSOCHUNGCHIXEBONBANHImpl.class,
						primaryKey);

				if (thongsochungchixebonbanh != null) {
					cacheResult(thongsochungchixebonbanh);
				}
				else {
					EntityCacheUtil.putResult(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXEBONBANHImpl.class, primaryKey,
						_nullTHONGSOCHUNGCHIXEBONBANH);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEBONBANHModelImpl.ENTITY_CACHE_ENABLED,
					THONGSOCHUNGCHIXEBONBANHImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongsochungchixebonbanh;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e b o n b a n h
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h, or <code>null</code> if a t h o n g s o c h u n g c h i x e b o n b a n h with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEBONBANH fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e b o n b a n hs.
	 *
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e b o n b a n hs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @return the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e b o n b a n hs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e b o n b a n hs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g s o c h u n g c h i x e b o n b a n hs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEBONBANH> findAll(int start, int end,
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

		List<THONGSOCHUNGCHIXEBONBANH> list = (List<THONGSOCHUNGCHIXEBONBANH>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGSOCHUNGCHIXEBONBANH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGSOCHUNGCHIXEBONBANH;

				if (pagination) {
					sql = sql.concat(THONGSOCHUNGCHIXEBONBANHModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEBONBANH>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEBONBANH>)QueryUtil.list(q,
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
	 * Removes all the t h o n g s o c h u n g c h i x e b o n b a n hs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh : findAll()) {
			remove(thongsochungchixebonbanh);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e b o n b a n hs.
	 *
	 * @return the number of t h o n g s o c h u n g c h i x e b o n b a n hs
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

				Query q = session.createQuery(_SQL_COUNT_THONGSOCHUNGCHIXEBONBANH);

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
	 * Initializes the t h o n g s o c h u n g c h i x e b o n b a n h persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGSOCHUNGCHIXEBONBANH>> listenersList = new ArrayList<ModelListener<THONGSOCHUNGCHIXEBONBANH>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGSOCHUNGCHIXEBONBANH>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGSOCHUNGCHIXEBONBANHImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGSOCHUNGCHIXEBONBANH = "SELECT thongsochungchixebonbanh FROM THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh";
	private static final String _SQL_SELECT_THONGSOCHUNGCHIXEBONBANH_WHERE = "SELECT thongsochungchixebonbanh FROM THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh WHERE ";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXEBONBANH = "SELECT COUNT(thongsochungchixebonbanh) FROM THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXEBONBANH_WHERE = "SELECT COUNT(thongsochungchixebonbanh) FROM THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongsochungchixebonbanh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGSOCHUNGCHIXEBONBANH exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGSOCHUNGCHIXEBONBANH exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXEBONBANHPersistenceImpl.class);
	private static THONGSOCHUNGCHIXEBONBANH _nullTHONGSOCHUNGCHIXEBONBANH = new THONGSOCHUNGCHIXEBONBANHImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGSOCHUNGCHIXEBONBANH> toCacheModel() {
				return _nullTHONGSOCHUNGCHIXEBONBANHCacheModel;
			}
		};

	private static CacheModel<THONGSOCHUNGCHIXEBONBANH> _nullTHONGSOCHUNGCHIXEBONBANHCacheModel =
		new CacheModel<THONGSOCHUNGCHIXEBONBANH>() {
			@Override
			public THONGSOCHUNGCHIXEBONBANH toEntityModel() {
				return _nullTHONGSOCHUNGCHIXEBONBANH;
			}
		};
}