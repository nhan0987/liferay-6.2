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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h o n g s o c h u n g c h i x e d a p d i e n service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEDAPDIENPersistence
 * @see THONGSOCHUNGCHIXEDAPDIENUtil
 * @generated
 */
public class THONGSOCHUNGCHIXEDAPDIENPersistenceImpl extends BasePersistenceImpl<THONGSOCHUNGCHIXEDAPDIEN>
	implements THONGSOCHUNGCHIXEDAPDIENPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGSOCHUNGCHIXEDAPDIENUtil} to access the t h o n g s o c h u n g c h i x e d a p d i e n persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGSOCHUNGCHIXEDAPDIENImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEDAPDIENModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e d a p d i e ns where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e d a p d i e ns where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e d a p d i e ns where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByHoSoThuTucId(
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

		List<THONGSOCHUNGCHIXEDAPDIEN> list = (List<THONGSOCHUNGCHIXEDAPDIEN>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : list) {
				if ((hoSoThuTucId != thongsochungchixedapdien.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEDAPDIENModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEDAPDIEN>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixedapdien != null) {
			return thongsochungchixedapdien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEDAPDIEN> list = findByHoSoThuTucId(hoSoThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixedapdien != null) {
			return thongsochungchixedapdien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByHoSoThuTucId_Last(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEDAPDIEN> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e ns before and after the current t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e d a p d i e n
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEDAPDIEN[] array = new THONGSOCHUNGCHIXEDAPDIENImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixedapdien, hoSoThuTucId, orderByComparator,
					true);

			array[1] = thongsochungchixedapdien;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixedapdien, hoSoThuTucId, orderByComparator,
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

	protected THONGSOCHUNGCHIXEDAPDIEN getByHoSoThuTucId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

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
			query.append(THONGSOCHUNGCHIXEDAPDIENModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixedapdien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEDAPDIEN> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e d a p d i e ns where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixedapdien);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e d a p d i e ns where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e d a p d i e ns
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "thongsochungchixedapdien.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEDAPDIENModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e d a p d i e ns where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e d a p d i e ns where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e d a p d i e ns where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByCertificateRecordId(
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

		List<THONGSOCHUNGCHIXEDAPDIEN> list = (List<THONGSOCHUNGCHIXEDAPDIEN>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : list) {
				if ((certificateRecordId != thongsochungchixedapdien.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEDAPDIENModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEDAPDIEN>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (thongsochungchixedapdien != null) {
			return thongsochungchixedapdien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEDAPDIEN> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (thongsochungchixedapdien != null) {
			return thongsochungchixedapdien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEDAPDIEN> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e ns before and after the current t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e d a p d i e n
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEDAPDIEN[] array = new THONGSOCHUNGCHIXEDAPDIENImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixedapdien, certificateRecordId,
					orderByComparator, true);

			array[1] = thongsochungchixedapdien;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixedapdien, certificateRecordId,
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

	protected THONGSOCHUNGCHIXEDAPDIEN getByCertificateRecordId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

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
			query.append(THONGSOCHUNGCHIXEDAPDIENModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixedapdien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEDAPDIEN> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e d a p d i e ns where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixedapdien);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e d a p d i e ns where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e d a p d i e ns
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

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
		"thongsochungchixedapdien.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXEDAPDIENModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e d a p d i e ns where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByVehicleGroupId(
		long vehicleGroupId) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e d a p d i e ns where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e d a p d i e ns where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByVehicleGroupId(
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

		List<THONGSOCHUNGCHIXEDAPDIEN> list = (List<THONGSOCHUNGCHIXEDAPDIEN>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : list) {
				if ((vehicleGroupId != thongsochungchixedapdien.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXEDAPDIENModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEDAPDIEN>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixedapdien != null) {
			return thongsochungchixedapdien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXEDAPDIEN> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixedapdien != null) {
			return thongsochungchixedapdien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e d a p d i e n could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXEDAPDIEN> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e ns before and after the current t h o n g s o c h u n g c h i x e d a p d i e n in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e d a p d i e n
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEDAPDIEN[] array = new THONGSOCHUNGCHIXEDAPDIENImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixedapdien, vehicleGroupId,
					orderByComparator, true);

			array[1] = thongsochungchixedapdien;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixedapdien, vehicleGroupId,
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

	protected THONGSOCHUNGCHIXEDAPDIEN getByVehicleGroupId_PrevAndNext(
		Session session, THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

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
			query.append(THONGSOCHUNGCHIXEDAPDIENModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixedapdien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXEDAPDIEN> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e d a p d i e ns where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixedapdien);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e d a p d i e ns where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e d a p d i e ns
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXEDAPDIEN_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "thongsochungchixedapdien.vehicleGroupId = ?";

	public THONGSOCHUNGCHIXEDAPDIENPersistenceImpl() {
		setModelClass(THONGSOCHUNGCHIXEDAPDIEN.class);
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e d a p d i e n in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixedapdien the t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@Override
	public void cacheResult(THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien) {
		EntityCacheUtil.putResult(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			thongsochungchixedapdien.getPrimaryKey(), thongsochungchixedapdien);

		thongsochungchixedapdien.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e d a p d i e ns in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixedapdiens the t h o n g s o c h u n g c h i x e d a p d i e ns
	 */
	@Override
	public void cacheResult(
		List<THONGSOCHUNGCHIXEDAPDIEN> thongsochungchixedapdiens) {
		for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : thongsochungchixedapdiens) {
			if (EntityCacheUtil.getResult(
						THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXEDAPDIENImpl.class,
						thongsochungchixedapdien.getPrimaryKey()) == null) {
				cacheResult(thongsochungchixedapdien);
			}
			else {
				thongsochungchixedapdien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g s o c h u n g c h i x e d a p d i e ns.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGSOCHUNGCHIXEDAPDIENImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGSOCHUNGCHIXEDAPDIENImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien) {
		EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			thongsochungchixedapdien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<THONGSOCHUNGCHIXEDAPDIEN> thongsochungchixedapdiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : thongsochungchixedapdiens) {
			EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXEDAPDIENImpl.class,
				thongsochungchixedapdien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g s o c h u n g c h i x e d a p d i e n with the primary key. Does not add the t h o n g s o c h u n g c h i x e d a p d i e n to the database.
	 *
	 * @param id the primary key for the new t h o n g s o c h u n g c h i x e d a p d i e n
	 * @return the new t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN create(long id) {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = new THONGSOCHUNGCHIXEDAPDIENImpl();

		thongsochungchixedapdien.setNew(true);
		thongsochungchixedapdien.setPrimaryKey(id);

		return thongsochungchixedapdien;
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e d a p d i e n with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN remove(long id)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e d a p d i e n with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN remove(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = (THONGSOCHUNGCHIXEDAPDIEN)session.get(THONGSOCHUNGCHIXEDAPDIENImpl.class,
					primaryKey);

			if (thongsochungchixedapdien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongsochungchixedapdien);
		}
		catch (NoSuchTHONGSOCHUNGCHIXEDAPDIENException nsee) {
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
	protected THONGSOCHUNGCHIXEDAPDIEN removeImpl(
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien)
		throws SystemException {
		thongsochungchixedapdien = toUnwrappedModel(thongsochungchixedapdien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongsochungchixedapdien)) {
				thongsochungchixedapdien = (THONGSOCHUNGCHIXEDAPDIEN)session.get(THONGSOCHUNGCHIXEDAPDIENImpl.class,
						thongsochungchixedapdien.getPrimaryKeyObj());
			}

			if (thongsochungchixedapdien != null) {
				session.delete(thongsochungchixedapdien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongsochungchixedapdien != null) {
			clearCache(thongsochungchixedapdien);
		}

		return thongsochungchixedapdien;
	}

	@Override
	public THONGSOCHUNGCHIXEDAPDIEN updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien)
		throws SystemException {
		thongsochungchixedapdien = toUnwrappedModel(thongsochungchixedapdien);

		boolean isNew = thongsochungchixedapdien.isNew();

		THONGSOCHUNGCHIXEDAPDIENModelImpl thongsochungchixedapdienModelImpl = (THONGSOCHUNGCHIXEDAPDIENModelImpl)thongsochungchixedapdien;

		Session session = null;

		try {
			session = openSession();

			if (thongsochungchixedapdien.isNew()) {
				session.save(thongsochungchixedapdien);

				thongsochungchixedapdien.setNew(false);
			}
			else {
				session.merge(thongsochungchixedapdien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !THONGSOCHUNGCHIXEDAPDIENModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongsochungchixedapdienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixedapdienModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						thongsochungchixedapdienModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((thongsochungchixedapdienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixedapdienModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						thongsochungchixedapdienModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((thongsochungchixedapdienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixedapdienModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						thongsochungchixedapdienModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXEDAPDIENImpl.class,
			thongsochungchixedapdien.getPrimaryKey(), thongsochungchixedapdien);

		return thongsochungchixedapdien;
	}

	protected THONGSOCHUNGCHIXEDAPDIEN toUnwrappedModel(
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien) {
		if (thongsochungchixedapdien instanceof THONGSOCHUNGCHIXEDAPDIENImpl) {
			return thongsochungchixedapdien;
		}

		THONGSOCHUNGCHIXEDAPDIENImpl thongsochungchixedapdienImpl = new THONGSOCHUNGCHIXEDAPDIENImpl();

		thongsochungchixedapdienImpl.setNew(thongsochungchixedapdien.isNew());
		thongsochungchixedapdienImpl.setPrimaryKey(thongsochungchixedapdien.getPrimaryKey());

		thongsochungchixedapdienImpl.setId(thongsochungchixedapdien.getId());
		thongsochungchixedapdienImpl.setHoSoThuTucId(thongsochungchixedapdien.getHoSoThuTucId());
		thongsochungchixedapdienImpl.setCertificateRecordId(thongsochungchixedapdien.getCertificateRecordId());
		thongsochungchixedapdienImpl.setVehicleGroupId(thongsochungchixedapdien.getVehicleGroupId());
		thongsochungchixedapdienImpl.setSynchDate(thongsochungchixedapdien.getSynchDate());
		thongsochungchixedapdienImpl.setXDD0008(thongsochungchixedapdien.getXDD0008());
		thongsochungchixedapdienImpl.setXDD0009(thongsochungchixedapdien.getXDD0009());
		thongsochungchixedapdienImpl.setXDD0010(thongsochungchixedapdien.getXDD0010());
		thongsochungchixedapdienImpl.setXDD0011(thongsochungchixedapdien.getXDD0011());
		thongsochungchixedapdienImpl.setXDD0012(thongsochungchixedapdien.getXDD0012());
		thongsochungchixedapdienImpl.setXDD0013(thongsochungchixedapdien.getXDD0013());
		thongsochungchixedapdienImpl.setXDD0014(thongsochungchixedapdien.getXDD0014());
		thongsochungchixedapdienImpl.setXDD0015(thongsochungchixedapdien.getXDD0015());
		thongsochungchixedapdienImpl.setXDD0016(thongsochungchixedapdien.getXDD0016());
		thongsochungchixedapdienImpl.setXDD0017(thongsochungchixedapdien.getXDD0017());
		thongsochungchixedapdienImpl.setXDD0018(thongsochungchixedapdien.getXDD0018());
		thongsochungchixedapdienImpl.setXDD0019(thongsochungchixedapdien.getXDD0019());
		thongsochungchixedapdienImpl.setXDD0020(thongsochungchixedapdien.getXDD0020());
		thongsochungchixedapdienImpl.setXDD0021(thongsochungchixedapdien.getXDD0021());
		thongsochungchixedapdienImpl.setXDD0022(thongsochungchixedapdien.getXDD0022());
		thongsochungchixedapdienImpl.setXDD0023(thongsochungchixedapdien.getXDD0023());
		thongsochungchixedapdienImpl.setXDD0024(thongsochungchixedapdien.getXDD0024());
		thongsochungchixedapdienImpl.setXDD0025(thongsochungchixedapdien.getXDD0025());
		thongsochungchixedapdienImpl.setXDD0026(thongsochungchixedapdien.getXDD0026());
		thongsochungchixedapdienImpl.setXDD0027(thongsochungchixedapdien.getXDD0027());
		thongsochungchixedapdienImpl.setXDD1027(thongsochungchixedapdien.getXDD1027());
		thongsochungchixedapdienImpl.setXDD0028(thongsochungchixedapdien.getXDD0028());
		thongsochungchixedapdienImpl.setXDD1028(thongsochungchixedapdien.getXDD1028());
		thongsochungchixedapdienImpl.setXDD1128(thongsochungchixedapdien.getXDD1128());
		thongsochungchixedapdienImpl.setXDD0029(thongsochungchixedapdien.getXDD0029());
		thongsochungchixedapdienImpl.setXDD1029(thongsochungchixedapdien.getXDD1029());
		thongsochungchixedapdienImpl.setXDD1129(thongsochungchixedapdien.getXDD1129());
		thongsochungchixedapdienImpl.setXDD0030(thongsochungchixedapdien.getXDD0030());
		thongsochungchixedapdienImpl.setXDD0031(thongsochungchixedapdien.getXDD0031());
		thongsochungchixedapdienImpl.setXDD0032(thongsochungchixedapdien.getXDD0032());
		thongsochungchixedapdienImpl.setXDD0033(thongsochungchixedapdien.getXDD0033());
		thongsochungchixedapdienImpl.setXDD0034(thongsochungchixedapdien.getXDD0034());
		thongsochungchixedapdienImpl.setXDD1034(thongsochungchixedapdien.getXDD1034());
		thongsochungchixedapdienImpl.setXDD0035(thongsochungchixedapdien.getXDD0035());
		thongsochungchixedapdienImpl.setXDD1035(thongsochungchixedapdien.getXDD1035());
		thongsochungchixedapdienImpl.setXDD0036(thongsochungchixedapdien.getXDD0036());
		thongsochungchixedapdienImpl.setXDD0037(thongsochungchixedapdien.getXDD0037());
		thongsochungchixedapdienImpl.setXDD0038(thongsochungchixedapdien.getXDD0038());

		return thongsochungchixedapdienImpl;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = fetchByPrimaryKey(primaryKey);

		if (thongsochungchixedapdien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGSOCHUNGCHIXEDAPDIENException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongsochungchixedapdien;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN findByPrimaryKey(long id)
		throws NoSuchTHONGSOCHUNGCHIXEDAPDIENException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien = (THONGSOCHUNGCHIXEDAPDIEN)EntityCacheUtil.getResult(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXEDAPDIENImpl.class, primaryKey);

		if (thongsochungchixedapdien == _nullTHONGSOCHUNGCHIXEDAPDIEN) {
			return null;
		}

		if (thongsochungchixedapdien == null) {
			Session session = null;

			try {
				session = openSession();

				thongsochungchixedapdien = (THONGSOCHUNGCHIXEDAPDIEN)session.get(THONGSOCHUNGCHIXEDAPDIENImpl.class,
						primaryKey);

				if (thongsochungchixedapdien != null) {
					cacheResult(thongsochungchixedapdien);
				}
				else {
					EntityCacheUtil.putResult(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXEDAPDIENImpl.class, primaryKey,
						_nullTHONGSOCHUNGCHIXEDAPDIEN);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGSOCHUNGCHIXEDAPDIENModelImpl.ENTITY_CACHE_ENABLED,
					THONGSOCHUNGCHIXEDAPDIENImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongsochungchixedapdien;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e d a p d i e n
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n, or <code>null</code> if a t h o n g s o c h u n g c h i x e d a p d i e n with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXEDAPDIEN fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e d a p d i e ns.
	 *
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e d a p d i e ns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @return the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e d a p d i e ns.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e d a p d i e ns (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g s o c h u n g c h i x e d a p d i e ns
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXEDAPDIEN> findAll(int start, int end,
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

		List<THONGSOCHUNGCHIXEDAPDIEN> list = (List<THONGSOCHUNGCHIXEDAPDIEN>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN;

				if (pagination) {
					sql = sql.concat(THONGSOCHUNGCHIXEDAPDIENModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXEDAPDIEN>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXEDAPDIEN>)QueryUtil.list(q,
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
	 * Removes all the t h o n g s o c h u n g c h i x e d a p d i e ns from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien : findAll()) {
			remove(thongsochungchixedapdien);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e d a p d i e ns.
	 *
	 * @return the number of t h o n g s o c h u n g c h i x e d a p d i e ns
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

				Query q = session.createQuery(_SQL_COUNT_THONGSOCHUNGCHIXEDAPDIEN);

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
	 * Initializes the t h o n g s o c h u n g c h i x e d a p d i e n persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGSOCHUNGCHIXEDAPDIEN>> listenersList = new ArrayList<ModelListener<THONGSOCHUNGCHIXEDAPDIEN>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGSOCHUNGCHIXEDAPDIEN>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGSOCHUNGCHIXEDAPDIENImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN = "SELECT thongsochungchixedapdien FROM THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien";
	private static final String _SQL_SELECT_THONGSOCHUNGCHIXEDAPDIEN_WHERE = "SELECT thongsochungchixedapdien FROM THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien WHERE ";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXEDAPDIEN = "SELECT COUNT(thongsochungchixedapdien) FROM THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXEDAPDIEN_WHERE = "SELECT COUNT(thongsochungchixedapdien) FROM THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongsochungchixedapdien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGSOCHUNGCHIXEDAPDIEN exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGSOCHUNGCHIXEDAPDIEN exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXEDAPDIENPersistenceImpl.class);
	private static THONGSOCHUNGCHIXEDAPDIEN _nullTHONGSOCHUNGCHIXEDAPDIEN = new THONGSOCHUNGCHIXEDAPDIENImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGSOCHUNGCHIXEDAPDIEN> toCacheModel() {
				return _nullTHONGSOCHUNGCHIXEDAPDIENCacheModel;
			}
		};

	private static CacheModel<THONGSOCHUNGCHIXEDAPDIEN> _nullTHONGSOCHUNGCHIXEDAPDIENCacheModel =
		new CacheModel<THONGSOCHUNGCHIXEDAPDIEN>() {
			@Override
			public THONGSOCHUNGCHIXEDAPDIEN toEntityModel() {
				return _nullTHONGSOCHUNGCHIXEDAPDIEN;
			}
		};
}