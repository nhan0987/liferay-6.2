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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h o n g s o c h u n g c h i x e c h u y e n d u n g service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECHUYENDUNGPersistence
 * @see THONGSOCHUNGCHIXECHUYENDUNGUtil
 * @generated
 */
public class THONGSOCHUNGCHIXECHUYENDUNGPersistenceImpl
	extends BasePersistenceImpl<THONGSOCHUNGCHIXECHUYENDUNG>
	implements THONGSOCHUNGCHIXECHUYENDUNGPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THONGSOCHUNGCHIXECHUYENDUNGUtil} to access the t h o n g s o c h u n g c h i x e c h u y e n d u n g persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THONGSOCHUNGCHIXECHUYENDUNGImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
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

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : list) {
				if ((hoSoThuTucId != thongsochungchixechuyendung.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECHUYENDUNG>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByHoSoThuTucId_First(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByHoSoThuTucId(hoSoThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByHoSoThuTucId_Last(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByHoSoThuTucId_Last(
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECHUYENDUNG[] array = new THONGSOCHUNGCHIXECHUYENDUNGImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixechuyendung, hoSoThuTucId,
					orderByComparator, true);

			array[1] = thongsochungchixechuyendung;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					thongsochungchixechuyendung, hoSoThuTucId,
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

	protected THONGSOCHUNGCHIXECHUYENDUNG getByHoSoThuTucId_PrevAndNext(
		Session session,
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

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
			query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixechuyendung);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixechuyendung);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "thongsochungchixechuyendung.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
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

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : list) {
				if ((certificateRecordId != thongsochungchixechuyendung.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECHUYENDUNG>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECHUYENDUNG[] array = new THONGSOCHUNGCHIXECHUYENDUNGImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixechuyendung, certificateRecordId,
					orderByComparator, true);

			array[1] = thongsochungchixechuyendung;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					thongsochungchixechuyendung, certificateRecordId,
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

	protected THONGSOCHUNGCHIXECHUYENDUNG getByCertificateRecordId_PrevAndNext(
		Session session,
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

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
			query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixechuyendung);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixechuyendung);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

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
		"thongsochungchixechuyendung.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleGroupId", new String[] { Long.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
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

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : list) {
				if ((vehicleGroupId != thongsochungchixechuyendung.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECHUYENDUNG>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECHUYENDUNG[] array = new THONGSOCHUNGCHIXECHUYENDUNGImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixechuyendung, vehicleGroupId,
					orderByComparator, true);

			array[1] = thongsochungchixechuyendung;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					thongsochungchixechuyendung, vehicleGroupId,
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

	protected THONGSOCHUNGCHIXECHUYENDUNG getByVehicleGroupId_PrevAndNext(
		Session session,
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung,
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

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

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
			query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixechuyendung);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixechuyendung);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
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

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "thongsochungchixechuyendung.vehicleGroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_XCD0009 = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByXCD0009",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XCD0009 =
		new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByXCD0009",
			new String[] { String.class.getName() },
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.XCD0009_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_XCD0009 = new FinderPath(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByXCD0009", new String[] { String.class.getName() });

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	 *
	 * @param XCD0009 the x c d0009
	 * @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(String XCD0009)
		throws SystemException {
		return findByXCD0009(XCD0009, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param XCD0009 the x c d0009
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(String XCD0009,
		int start, int end) throws SystemException {
		return findByXCD0009(XCD0009, start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param XCD0009 the x c d0009
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(String XCD0009,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XCD0009;
			finderArgs = new Object[] { XCD0009 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_XCD0009;
			finderArgs = new Object[] { XCD0009, start, end, orderByComparator };
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : list) {
				if (!Validator.equals(XCD0009,
							thongsochungchixechuyendung.getXCD0009())) {
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

			query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

			boolean bindXCD0009 = false;

			if (XCD0009 == null) {
				query.append(_FINDER_COLUMN_XCD0009_XCD0009_1);
			}
			else if (XCD0009.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_XCD0009_XCD0009_3);
			}
			else {
				bindXCD0009 = true;

				query.append(_FINDER_COLUMN_XCD0009_XCD0009_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindXCD0009) {
					qPos.add(XCD0009);
				}

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECHUYENDUNG>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
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
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	 *
	 * @param XCD0009 the x c d0009
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByXCD0009_First(String XCD0009,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByXCD0009_First(XCD0009,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("XCD0009=");
		msg.append(XCD0009);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	 *
	 * @param XCD0009 the x c d0009
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByXCD0009_First(String XCD0009,
		OrderByComparator orderByComparator) throws SystemException {
		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByXCD0009(XCD0009, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	 *
	 * @param XCD0009 the x c d0009
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByXCD0009_Last(String XCD0009,
		OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByXCD0009_Last(XCD0009,
				orderByComparator);

		if (thongsochungchixechuyendung != null) {
			return thongsochungchixechuyendung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("XCD0009=");
		msg.append(XCD0009);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(msg.toString());
	}

	/**
	 * Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	 *
	 * @param XCD0009 the x c d0009
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByXCD0009_Last(String XCD0009,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByXCD0009(XCD0009);

		if (count == 0) {
			return null;
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = findByXCD0009(XCD0009,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	 *
	 * @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @param XCD0009 the x c d0009
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG[] findByXCD0009_PrevAndNext(long id,
		String XCD0009, OrderByComparator orderByComparator)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECHUYENDUNG[] array = new THONGSOCHUNGCHIXECHUYENDUNGImpl[3];

			array[0] = getByXCD0009_PrevAndNext(session,
					thongsochungchixechuyendung, XCD0009, orderByComparator,
					true);

			array[1] = thongsochungchixechuyendung;

			array[2] = getByXCD0009_PrevAndNext(session,
					thongsochungchixechuyendung, XCD0009, orderByComparator,
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

	protected THONGSOCHUNGCHIXECHUYENDUNG getByXCD0009_PrevAndNext(
		Session session,
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung,
		String XCD0009, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

		boolean bindXCD0009 = false;

		if (XCD0009 == null) {
			query.append(_FINDER_COLUMN_XCD0009_XCD0009_1);
		}
		else if (XCD0009.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_XCD0009_XCD0009_3);
		}
		else {
			bindXCD0009 = true;

			query.append(_FINDER_COLUMN_XCD0009_XCD0009_2);
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
			query.append(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindXCD0009) {
			qPos.add(XCD0009);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thongsochungchixechuyendung);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63; from the database.
	 *
	 * @param XCD0009 the x c d0009
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByXCD0009(String XCD0009) throws SystemException {
		for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : findByXCD0009(
				XCD0009, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(thongsochungchixechuyendung);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	 *
	 * @param XCD0009 the x c d0009
	 * @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByXCD0009(String XCD0009) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_XCD0009;

		Object[] finderArgs = new Object[] { XCD0009 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE);

			boolean bindXCD0009 = false;

			if (XCD0009 == null) {
				query.append(_FINDER_COLUMN_XCD0009_XCD0009_1);
			}
			else if (XCD0009.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_XCD0009_XCD0009_3);
			}
			else {
				bindXCD0009 = true;

				query.append(_FINDER_COLUMN_XCD0009_XCD0009_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindXCD0009) {
					qPos.add(XCD0009);
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

	private static final String _FINDER_COLUMN_XCD0009_XCD0009_1 = "thongsochungchixechuyendung.XCD0009 IS NULL";
	private static final String _FINDER_COLUMN_XCD0009_XCD0009_2 = "thongsochungchixechuyendung.XCD0009 = ?";
	private static final String _FINDER_COLUMN_XCD0009_XCD0009_3 = "(thongsochungchixechuyendung.XCD0009 IS NULL OR thongsochungchixechuyendung.XCD0009 = '')";

	public THONGSOCHUNGCHIXECHUYENDUNGPersistenceImpl() {
		setModelClass(THONGSOCHUNGCHIXECHUYENDUNG.class);
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e c h u y e n d u n g in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixechuyendung the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@Override
	public void cacheResult(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		EntityCacheUtil.putResult(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			thongsochungchixechuyendung.getPrimaryKey(),
			thongsochungchixechuyendung);

		thongsochungchixechuyendung.resetOriginalValues();
	}

	/**
	 * Caches the t h o n g s o c h u n g c h i x e c h u y e n d u n gs in the entity cache if it is enabled.
	 *
	 * @param thongsochungchixechuyendungs the t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 */
	@Override
	public void cacheResult(
		List<THONGSOCHUNGCHIXECHUYENDUNG> thongsochungchixechuyendungs) {
		for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : thongsochungchixechuyendungs) {
			if (EntityCacheUtil.getResult(
						THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
						thongsochungchixechuyendung.getPrimaryKey()) == null) {
				cacheResult(thongsochungchixechuyendung);
			}
			else {
				thongsochungchixechuyendung.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THONGSOCHUNGCHIXECHUYENDUNGImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THONGSOCHUNGCHIXECHUYENDUNGImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			thongsochungchixechuyendung.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<THONGSOCHUNGCHIXECHUYENDUNG> thongsochungchixechuyendungs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : thongsochungchixechuyendungs) {
			EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
				thongsochungchixechuyendung.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key. Does not add the t h o n g s o c h u n g c h i x e c h u y e n d u n g to the database.
	 *
	 * @param id the primary key for the new t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @return the new t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG create(long id) {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = new THONGSOCHUNGCHIXECHUYENDUNGImpl();

		thongsochungchixechuyendung.setNew(true);
		thongsochungchixechuyendung.setPrimaryKey(id);

		return thongsochungchixechuyendung;
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG remove(long id)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG remove(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = (THONGSOCHUNGCHIXECHUYENDUNG)session.get(THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
					primaryKey);

			if (thongsochungchixechuyendung == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thongsochungchixechuyendung);
		}
		catch (NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException nsee) {
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
	protected THONGSOCHUNGCHIXECHUYENDUNG removeImpl(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung)
		throws SystemException {
		thongsochungchixechuyendung = toUnwrappedModel(thongsochungchixechuyendung);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongsochungchixechuyendung)) {
				thongsochungchixechuyendung = (THONGSOCHUNGCHIXECHUYENDUNG)session.get(THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
						thongsochungchixechuyendung.getPrimaryKeyObj());
			}

			if (thongsochungchixechuyendung != null) {
				session.delete(thongsochungchixechuyendung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thongsochungchixechuyendung != null) {
			clearCache(thongsochungchixechuyendung);
		}

		return thongsochungchixechuyendung;
	}

	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung)
		throws SystemException {
		thongsochungchixechuyendung = toUnwrappedModel(thongsochungchixechuyendung);

		boolean isNew = thongsochungchixechuyendung.isNew();

		THONGSOCHUNGCHIXECHUYENDUNGModelImpl thongsochungchixechuyendungModelImpl =
			(THONGSOCHUNGCHIXECHUYENDUNGModelImpl)thongsochungchixechuyendung;

		Session session = null;

		try {
			session = openSession();

			if (thongsochungchixechuyendung.isNew()) {
				session.save(thongsochungchixechuyendung);

				thongsochungchixechuyendung.setNew(false);
			}
			else {
				session.merge(thongsochungchixechuyendung);
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
				!THONGSOCHUNGCHIXECHUYENDUNGModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thongsochungchixechuyendungModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixechuyendungModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						thongsochungchixechuyendungModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((thongsochungchixechuyendungModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixechuyendungModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						thongsochungchixechuyendungModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((thongsochungchixechuyendungModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixechuyendungModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						thongsochungchixechuyendungModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}

			if ((thongsochungchixechuyendungModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XCD0009.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thongsochungchixechuyendungModelImpl.getOriginalXCD0009()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_XCD0009, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XCD0009,
					args);

				args = new Object[] {
						thongsochungchixechuyendungModelImpl.getXCD0009()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_XCD0009, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XCD0009,
					args);
			}
		}

		EntityCacheUtil.putResult(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
			THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
			thongsochungchixechuyendung.getPrimaryKey(),
			thongsochungchixechuyendung);

		return thongsochungchixechuyendung;
	}

	protected THONGSOCHUNGCHIXECHUYENDUNG toUnwrappedModel(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		if (thongsochungchixechuyendung instanceof THONGSOCHUNGCHIXECHUYENDUNGImpl) {
			return thongsochungchixechuyendung;
		}

		THONGSOCHUNGCHIXECHUYENDUNGImpl thongsochungchixechuyendungImpl = new THONGSOCHUNGCHIXECHUYENDUNGImpl();

		thongsochungchixechuyendungImpl.setNew(thongsochungchixechuyendung.isNew());
		thongsochungchixechuyendungImpl.setPrimaryKey(thongsochungchixechuyendung.getPrimaryKey());

		thongsochungchixechuyendungImpl.setId(thongsochungchixechuyendung.getId());
		thongsochungchixechuyendungImpl.setHoSoThuTucId(thongsochungchixechuyendung.getHoSoThuTucId());
		thongsochungchixechuyendungImpl.setCertificateRecordId(thongsochungchixechuyendung.getCertificateRecordId());
		thongsochungchixechuyendungImpl.setVehicleGroupId(thongsochungchixechuyendung.getVehicleGroupId());
		thongsochungchixechuyendungImpl.setSynchDate(thongsochungchixechuyendung.getSynchDate());
		thongsochungchixechuyendungImpl.setXCD0009(thongsochungchixechuyendung.getXCD0009());
		thongsochungchixechuyendungImpl.setXCD0010(thongsochungchixechuyendung.getXCD0010());
		thongsochungchixechuyendungImpl.setXCD0011(thongsochungchixechuyendung.getXCD0011());
		thongsochungchixechuyendungImpl.setXCD0012(thongsochungchixechuyendung.getXCD0012());
		thongsochungchixechuyendungImpl.setXCD0013(thongsochungchixechuyendung.getXCD0013());
		thongsochungchixechuyendungImpl.setXCD0014(thongsochungchixechuyendung.getXCD0014());
		thongsochungchixechuyendungImpl.setXCD0015(thongsochungchixechuyendung.getXCD0015());
		thongsochungchixechuyendungImpl.setXCD0016(thongsochungchixechuyendung.getXCD0016());
		thongsochungchixechuyendungImpl.setXCD0017(thongsochungchixechuyendung.getXCD0017());
		thongsochungchixechuyendungImpl.setXCD1017(thongsochungchixechuyendung.getXCD1017());
		thongsochungchixechuyendungImpl.setXCD0018(thongsochungchixechuyendung.getXCD0018());
		thongsochungchixechuyendungImpl.setXCD0019(thongsochungchixechuyendung.getXCD0019());
		thongsochungchixechuyendungImpl.setXCD0020(thongsochungchixechuyendung.getXCD0020());
		thongsochungchixechuyendungImpl.setXCD0021(thongsochungchixechuyendung.getXCD0021());
		thongsochungchixechuyendungImpl.setXCD0022(thongsochungchixechuyendung.getXCD0022());
		thongsochungchixechuyendungImpl.setXCD0023(thongsochungchixechuyendung.getXCD0023());
		thongsochungchixechuyendungImpl.setXCD1023(thongsochungchixechuyendung.getXCD1023());
		thongsochungchixechuyendungImpl.setXCD0024(thongsochungchixechuyendung.getXCD0024());
		thongsochungchixechuyendungImpl.setXCDCODE001(thongsochungchixechuyendung.getXCDCODE001());
		thongsochungchixechuyendungImpl.setXCDNAME001(thongsochungchixechuyendung.getXCDNAME001());
		thongsochungchixechuyendungImpl.setXCDVALU001(thongsochungchixechuyendung.getXCDVALU001());
		thongsochungchixechuyendungImpl.setXCDCODE002(thongsochungchixechuyendung.getXCDCODE002());
		thongsochungchixechuyendungImpl.setXCDNAME002(thongsochungchixechuyendung.getXCDNAME002());
		thongsochungchixechuyendungImpl.setXCDVALU002(thongsochungchixechuyendung.getXCDVALU002());
		thongsochungchixechuyendungImpl.setXCDCODE003(thongsochungchixechuyendung.getXCDCODE003());
		thongsochungchixechuyendungImpl.setXCDNAME003(thongsochungchixechuyendung.getXCDNAME003());
		thongsochungchixechuyendungImpl.setXCDVALU003(thongsochungchixechuyendung.getXCDVALU003());
		thongsochungchixechuyendungImpl.setXCDCODE004(thongsochungchixechuyendung.getXCDCODE004());
		thongsochungchixechuyendungImpl.setXCDNAME004(thongsochungchixechuyendung.getXCDNAME004());
		thongsochungchixechuyendungImpl.setXCDVALU004(thongsochungchixechuyendung.getXCDVALU004());
		thongsochungchixechuyendungImpl.setXCDCODE005(thongsochungchixechuyendung.getXCDCODE005());
		thongsochungchixechuyendungImpl.setXCDNAME005(thongsochungchixechuyendung.getXCDNAME005());
		thongsochungchixechuyendungImpl.setXCDVALU005(thongsochungchixechuyendung.getXCDVALU005());
		thongsochungchixechuyendungImpl.setXCDCODE006(thongsochungchixechuyendung.getXCDCODE006());
		thongsochungchixechuyendungImpl.setXCDNAME006(thongsochungchixechuyendung.getXCDNAME006());
		thongsochungchixechuyendungImpl.setXCDVALU006(thongsochungchixechuyendung.getXCDVALU006());
		thongsochungchixechuyendungImpl.setXCDCODE007(thongsochungchixechuyendung.getXCDCODE007());
		thongsochungchixechuyendungImpl.setXCDNAME007(thongsochungchixechuyendung.getXCDNAME007());
		thongsochungchixechuyendungImpl.setXCDVALU007(thongsochungchixechuyendung.getXCDVALU007());
		thongsochungchixechuyendungImpl.setXCDCODE008(thongsochungchixechuyendung.getXCDCODE008());
		thongsochungchixechuyendungImpl.setXCDNAME008(thongsochungchixechuyendung.getXCDNAME008());
		thongsochungchixechuyendungImpl.setXCDVALU008(thongsochungchixechuyendung.getXCDVALU008());
		thongsochungchixechuyendungImpl.setXCDCODE009(thongsochungchixechuyendung.getXCDCODE009());
		thongsochungchixechuyendungImpl.setXCDNAME009(thongsochungchixechuyendung.getXCDNAME009());
		thongsochungchixechuyendungImpl.setXCDVALU009(thongsochungchixechuyendung.getXCDVALU009());
		thongsochungchixechuyendungImpl.setXCDCODE010(thongsochungchixechuyendung.getXCDCODE010());
		thongsochungchixechuyendungImpl.setXCDNAME010(thongsochungchixechuyendung.getXCDNAME010());
		thongsochungchixechuyendungImpl.setXCDVALU010(thongsochungchixechuyendung.getXCDVALU010());
		thongsochungchixechuyendungImpl.setXCDCODE011(thongsochungchixechuyendung.getXCDCODE011());
		thongsochungchixechuyendungImpl.setXCDNAME011(thongsochungchixechuyendung.getXCDNAME011());
		thongsochungchixechuyendungImpl.setXCDVALU011(thongsochungchixechuyendung.getXCDVALU011());
		thongsochungchixechuyendungImpl.setXCDCODE012(thongsochungchixechuyendung.getXCDCODE012());
		thongsochungchixechuyendungImpl.setXCDNAME012(thongsochungchixechuyendung.getXCDNAME012());
		thongsochungchixechuyendungImpl.setXCDVALU012(thongsochungchixechuyendung.getXCDVALU012());

		return thongsochungchixechuyendungImpl;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = fetchByPrimaryKey(primaryKey);

		if (thongsochungchixechuyendung == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thongsochungchixechuyendung;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException} if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG findByPrimaryKey(long id)
		throws NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung = (THONGSOCHUNGCHIXECHUYENDUNG)EntityCacheUtil.getResult(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
				THONGSOCHUNGCHIXECHUYENDUNGImpl.class, primaryKey);

		if (thongsochungchixechuyendung == _nullTHONGSOCHUNGCHIXECHUYENDUNG) {
			return null;
		}

		if (thongsochungchixechuyendung == null) {
			Session session = null;

			try {
				session = openSession();

				thongsochungchixechuyendung = (THONGSOCHUNGCHIXECHUYENDUNG)session.get(THONGSOCHUNGCHIXECHUYENDUNGImpl.class,
						primaryKey);

				if (thongsochungchixechuyendung != null) {
					cacheResult(thongsochungchixechuyendung);
				}
				else {
					EntityCacheUtil.putResult(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
						THONGSOCHUNGCHIXECHUYENDUNGImpl.class, primaryKey,
						_nullTHONGSOCHUNGCHIXECHUYENDUNG);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ENTITY_CACHE_ENABLED,
					THONGSOCHUNGCHIXECHUYENDUNGImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thongsochungchixechuyendung;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @return the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findAll(int start, int end,
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

		List<THONGSOCHUNGCHIXECHUYENDUNG> list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG;

				if (pagination) {
					sql = sql.concat(THONGSOCHUNGCHIXECHUYENDUNGModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<THONGSOCHUNGCHIXECHUYENDUNG>(list);
				}
				else {
					list = (List<THONGSOCHUNGCHIXECHUYENDUNG>)QueryUtil.list(q,
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
	 * Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung : findAll()) {
			remove(thongsochungchixechuyendung);
		}
	}

	/**
	 * Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	 *
	 * @return the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
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

				Query q = session.createQuery(_SQL_COUNT_THONGSOCHUNGCHIXECHUYENDUNG);

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
	 * Initializes the t h o n g s o c h u n g c h i x e c h u y e n d u n g persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THONGSOCHUNGCHIXECHUYENDUNG>> listenersList = new ArrayList<ModelListener<THONGSOCHUNGCHIXECHUYENDUNG>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THONGSOCHUNGCHIXECHUYENDUNG>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(THONGSOCHUNGCHIXECHUYENDUNGImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG = "SELECT thongsochungchixechuyendung FROM THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung";
	private static final String _SQL_SELECT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE = "SELECT thongsochungchixechuyendung FROM THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung WHERE ";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXECHUYENDUNG = "SELECT COUNT(thongsochungchixechuyendung) FROM THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung";
	private static final String _SQL_COUNT_THONGSOCHUNGCHIXECHUYENDUNG_WHERE = "SELECT COUNT(thongsochungchixechuyendung) FROM THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thongsochungchixechuyendung.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THONGSOCHUNGCHIXECHUYENDUNG exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No THONGSOCHUNGCHIXECHUYENDUNG exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXECHUYENDUNGPersistenceImpl.class);
	private static THONGSOCHUNGCHIXECHUYENDUNG _nullTHONGSOCHUNGCHIXECHUYENDUNG = new THONGSOCHUNGCHIXECHUYENDUNGImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THONGSOCHUNGCHIXECHUYENDUNG> toCacheModel() {
				return _nullTHONGSOCHUNGCHIXECHUYENDUNGCacheModel;
			}
		};

	private static CacheModel<THONGSOCHUNGCHIXECHUYENDUNG> _nullTHONGSOCHUNGCHIXECHUYENDUNGCacheModel =
		new CacheModel<THONGSOCHUNGCHIXECHUYENDUNG>() {
			@Override
			public THONGSOCHUNGCHIXECHUYENDUNG toEntityModel() {
				return _nullTHONGSOCHUNGCHIXECHUYENDUNG;
			}
		};
}