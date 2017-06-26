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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the inspection record attach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see InspectionRecordAttachPersistence
 * @see InspectionRecordAttachUtil
 * @generated
 */
public class InspectionRecordAttachPersistenceImpl extends BasePersistenceImpl<InspectionRecordAttach>
	implements InspectionRecordAttachPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InspectionRecordAttachUtil} to access the inspection record attach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InspectionRecordAttachImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDATTACH =
		new FinderPath(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectionRecordAttach",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDATTACH =
		new FinderPath(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectionRecordAttach",
			new String[] { Long.class.getName() },
			InspectionRecordAttachModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDATTACH = new FinderPath(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordAttach",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the inspection record attachs where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching inspection record attachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordAttach> findByInspectionRecordAttach(
		long inspectionRecordId) throws SystemException {
		return findByInspectionRecordAttach(inspectionRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection record attachs where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection record attachs
	 * @param end the upper bound of the range of inspection record attachs (not inclusive)
	 * @return the range of matching inspection record attachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordAttach> findByInspectionRecordAttach(
		long inspectionRecordId, int start, int end) throws SystemException {
		return findByInspectionRecordAttach(inspectionRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection record attachs where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection record attachs
	 * @param end the upper bound of the range of inspection record attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection record attachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordAttach> findByInspectionRecordAttach(
		long inspectionRecordId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDATTACH;
			finderArgs = new Object[] { inspectionRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDATTACH;
			finderArgs = new Object[] {
					inspectionRecordId,
					
					start, end, orderByComparator
				};
		}

		List<InspectionRecordAttach> list = (List<InspectionRecordAttach>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionRecordAttach inspectionRecordAttach : list) {
				if ((inspectionRecordId != inspectionRecordAttach.getInspectionRecordId())) {
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

			query.append(_SQL_SELECT_INSPECTIONRECORDATTACH_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDATTACH_INSPECTIONRECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionRecordAttachModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

				if (!pagination) {
					list = (List<InspectionRecordAttach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecordAttach>(list);
				}
				else {
					list = (List<InspectionRecordAttach>)QueryUtil.list(q,
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
	 * Returns the first inspection record attach in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record attach
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a matching inspection record attach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach findByInspectionRecordAttach_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordAttachException, SystemException {
		InspectionRecordAttach inspectionRecordAttach = fetchByInspectionRecordAttach_First(inspectionRecordId,
				orderByComparator);

		if (inspectionRecordAttach != null) {
			return inspectionRecordAttach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordAttachException(msg.toString());
	}

	/**
	 * Returns the first inspection record attach in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record attach, or <code>null</code> if a matching inspection record attach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach fetchByInspectionRecordAttach_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<InspectionRecordAttach> list = findByInspectionRecordAttach(inspectionRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection record attach in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record attach
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a matching inspection record attach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach findByInspectionRecordAttach_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordAttachException, SystemException {
		InspectionRecordAttach inspectionRecordAttach = fetchByInspectionRecordAttach_Last(inspectionRecordId,
				orderByComparator);

		if (inspectionRecordAttach != null) {
			return inspectionRecordAttach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordAttachException(msg.toString());
	}

	/**
	 * Returns the last inspection record attach in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record attach, or <code>null</code> if a matching inspection record attach could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach fetchByInspectionRecordAttach_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInspectionRecordAttach(inspectionRecordId);

		if (count == 0) {
			return null;
		}

		List<InspectionRecordAttach> list = findByInspectionRecordAttach(inspectionRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection record attachs before and after the current inspection record attach in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param id the primary key of the current inspection record attach
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection record attach
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach[] findByInspectionRecordAttach_PrevAndNext(
		long id, long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordAttachException, SystemException {
		InspectionRecordAttach inspectionRecordAttach = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionRecordAttach[] array = new InspectionRecordAttachImpl[3];

			array[0] = getByInspectionRecordAttach_PrevAndNext(session,
					inspectionRecordAttach, inspectionRecordId,
					orderByComparator, true);

			array[1] = inspectionRecordAttach;

			array[2] = getByInspectionRecordAttach_PrevAndNext(session,
					inspectionRecordAttach, inspectionRecordId,
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

	protected InspectionRecordAttach getByInspectionRecordAttach_PrevAndNext(
		Session session, InspectionRecordAttach inspectionRecordAttach,
		long inspectionRecordId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSPECTIONRECORDATTACH_WHERE);

		query.append(_FINDER_COLUMN_INSPECTIONRECORDATTACH_INSPECTIONRECORDID_2);

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
			query.append(InspectionRecordAttachModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectionRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionRecordAttach);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionRecordAttach> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection record attachs where inspectionRecordId = &#63; from the database.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectionRecordAttach(long inspectionRecordId)
		throws SystemException {
		for (InspectionRecordAttach inspectionRecordAttach : findByInspectionRecordAttach(
				inspectionRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(inspectionRecordAttach);
		}
	}

	/**
	 * Returns the number of inspection record attachs where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching inspection record attachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionRecordAttach(long inspectionRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDATTACH;

		Object[] finderArgs = new Object[] { inspectionRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSPECTIONRECORDATTACH_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDATTACH_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDATTACH_INSPECTIONRECORDID_2 =
		"inspectionRecordAttach.inspectionRecordId = ?";

	public InspectionRecordAttachPersistenceImpl() {
		setModelClass(InspectionRecordAttach.class);
	}

	/**
	 * Caches the inspection record attach in the entity cache if it is enabled.
	 *
	 * @param inspectionRecordAttach the inspection record attach
	 */
	@Override
	public void cacheResult(InspectionRecordAttach inspectionRecordAttach) {
		EntityCacheUtil.putResult(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachImpl.class,
			inspectionRecordAttach.getPrimaryKey(), inspectionRecordAttach);

		inspectionRecordAttach.resetOriginalValues();
	}

	/**
	 * Caches the inspection record attachs in the entity cache if it is enabled.
	 *
	 * @param inspectionRecordAttachs the inspection record attachs
	 */
	@Override
	public void cacheResult(
		List<InspectionRecordAttach> inspectionRecordAttachs) {
		for (InspectionRecordAttach inspectionRecordAttach : inspectionRecordAttachs) {
			if (EntityCacheUtil.getResult(
						InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
						InspectionRecordAttachImpl.class,
						inspectionRecordAttach.getPrimaryKey()) == null) {
				cacheResult(inspectionRecordAttach);
			}
			else {
				inspectionRecordAttach.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all inspection record attachs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InspectionRecordAttachImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InspectionRecordAttachImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the inspection record attach.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InspectionRecordAttach inspectionRecordAttach) {
		EntityCacheUtil.removeResult(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachImpl.class,
			inspectionRecordAttach.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<InspectionRecordAttach> inspectionRecordAttachs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InspectionRecordAttach inspectionRecordAttach : inspectionRecordAttachs) {
			EntityCacheUtil.removeResult(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
				InspectionRecordAttachImpl.class,
				inspectionRecordAttach.getPrimaryKey());
		}
	}

	/**
	 * Creates a new inspection record attach with the primary key. Does not add the inspection record attach to the database.
	 *
	 * @param id the primary key for the new inspection record attach
	 * @return the new inspection record attach
	 */
	@Override
	public InspectionRecordAttach create(long id) {
		InspectionRecordAttach inspectionRecordAttach = new InspectionRecordAttachImpl();

		inspectionRecordAttach.setNew(true);
		inspectionRecordAttach.setPrimaryKey(id);

		return inspectionRecordAttach;
	}

	/**
	 * Removes the inspection record attach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the inspection record attach
	 * @return the inspection record attach that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach remove(long id)
		throws NoSuchInspectionRecordAttachException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the inspection record attach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the inspection record attach
	 * @return the inspection record attach that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach remove(Serializable primaryKey)
		throws NoSuchInspectionRecordAttachException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InspectionRecordAttach inspectionRecordAttach = (InspectionRecordAttach)session.get(InspectionRecordAttachImpl.class,
					primaryKey);

			if (inspectionRecordAttach == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInspectionRecordAttachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(inspectionRecordAttach);
		}
		catch (NoSuchInspectionRecordAttachException nsee) {
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
	protected InspectionRecordAttach removeImpl(
		InspectionRecordAttach inspectionRecordAttach)
		throws SystemException {
		inspectionRecordAttach = toUnwrappedModel(inspectionRecordAttach);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(inspectionRecordAttach)) {
				inspectionRecordAttach = (InspectionRecordAttach)session.get(InspectionRecordAttachImpl.class,
						inspectionRecordAttach.getPrimaryKeyObj());
			}

			if (inspectionRecordAttach != null) {
				session.delete(inspectionRecordAttach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (inspectionRecordAttach != null) {
			clearCache(inspectionRecordAttach);
		}

		return inspectionRecordAttach;
	}

	@Override
	public InspectionRecordAttach updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach inspectionRecordAttach)
		throws SystemException {
		inspectionRecordAttach = toUnwrappedModel(inspectionRecordAttach);

		boolean isNew = inspectionRecordAttach.isNew();

		InspectionRecordAttachModelImpl inspectionRecordAttachModelImpl = (InspectionRecordAttachModelImpl)inspectionRecordAttach;

		Session session = null;

		try {
			session = openSession();

			if (inspectionRecordAttach.isNew()) {
				session.save(inspectionRecordAttach);

				inspectionRecordAttach.setNew(false);
			}
			else {
				session.merge(inspectionRecordAttach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InspectionRecordAttachModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((inspectionRecordAttachModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDATTACH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecordAttachModelImpl.getOriginalInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDATTACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDATTACH,
					args);

				args = new Object[] {
						inspectionRecordAttachModelImpl.getInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDATTACH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDATTACH,
					args);
			}
		}

		EntityCacheUtil.putResult(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordAttachImpl.class,
			inspectionRecordAttach.getPrimaryKey(), inspectionRecordAttach);

		return inspectionRecordAttach;
	}

	protected InspectionRecordAttach toUnwrappedModel(
		InspectionRecordAttach inspectionRecordAttach) {
		if (inspectionRecordAttach instanceof InspectionRecordAttachImpl) {
			return inspectionRecordAttach;
		}

		InspectionRecordAttachImpl inspectionRecordAttachImpl = new InspectionRecordAttachImpl();

		inspectionRecordAttachImpl.setNew(inspectionRecordAttach.isNew());
		inspectionRecordAttachImpl.setPrimaryKey(inspectionRecordAttach.getPrimaryKey());

		inspectionRecordAttachImpl.setId(inspectionRecordAttach.getId());
		inspectionRecordAttachImpl.setInspectionRecordId(inspectionRecordAttach.getInspectionRecordId());
		inspectionRecordAttachImpl.setHoSoThuTucId(inspectionRecordAttach.getHoSoThuTucId());
		inspectionRecordAttachImpl.setEnTryId(inspectionRecordAttach.getEnTryId());
		inspectionRecordAttachImpl.setEnTryName(inspectionRecordAttach.getEnTryName());
		inspectionRecordAttachImpl.setInspectorId(inspectionRecordAttach.getInspectorId());
		inspectionRecordAttachImpl.setUploadTime(inspectionRecordAttach.getUploadTime());
		inspectionRecordAttachImpl.setMarkUpDelte(inspectionRecordAttach.getMarkUpDelte());
		inspectionRecordAttachImpl.setSynchdate(inspectionRecordAttach.getSynchdate());

		return inspectionRecordAttachImpl;
	}

	/**
	 * Returns the inspection record attach with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection record attach
	 * @return the inspection record attach
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInspectionRecordAttachException, SystemException {
		InspectionRecordAttach inspectionRecordAttach = fetchByPrimaryKey(primaryKey);

		if (inspectionRecordAttach == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInspectionRecordAttachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return inspectionRecordAttach;
	}

	/**
	 * Returns the inspection record attach with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException} if it could not be found.
	 *
	 * @param id the primary key of the inspection record attach
	 * @return the inspection record attach
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach findByPrimaryKey(long id)
		throws NoSuchInspectionRecordAttachException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the inspection record attach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection record attach
	 * @return the inspection record attach, or <code>null</code> if a inspection record attach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InspectionRecordAttach inspectionRecordAttach = (InspectionRecordAttach)EntityCacheUtil.getResult(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
				InspectionRecordAttachImpl.class, primaryKey);

		if (inspectionRecordAttach == _nullInspectionRecordAttach) {
			return null;
		}

		if (inspectionRecordAttach == null) {
			Session session = null;

			try {
				session = openSession();

				inspectionRecordAttach = (InspectionRecordAttach)session.get(InspectionRecordAttachImpl.class,
						primaryKey);

				if (inspectionRecordAttach != null) {
					cacheResult(inspectionRecordAttach);
				}
				else {
					EntityCacheUtil.putResult(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
						InspectionRecordAttachImpl.class, primaryKey,
						_nullInspectionRecordAttach);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InspectionRecordAttachModelImpl.ENTITY_CACHE_ENABLED,
					InspectionRecordAttachImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return inspectionRecordAttach;
	}

	/**
	 * Returns the inspection record attach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the inspection record attach
	 * @return the inspection record attach, or <code>null</code> if a inspection record attach with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordAttach fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the inspection record attachs.
	 *
	 * @return the inspection record attachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordAttach> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection record attachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection record attachs
	 * @param end the upper bound of the range of inspection record attachs (not inclusive)
	 * @return the range of inspection record attachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordAttach> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection record attachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection record attachs
	 * @param end the upper bound of the range of inspection record attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inspection record attachs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordAttach> findAll(int start, int end,
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

		List<InspectionRecordAttach> list = (List<InspectionRecordAttach>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSPECTIONRECORDATTACH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSPECTIONRECORDATTACH;

				if (pagination) {
					sql = sql.concat(InspectionRecordAttachModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InspectionRecordAttach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecordAttach>(list);
				}
				else {
					list = (List<InspectionRecordAttach>)QueryUtil.list(q,
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
	 * Removes all the inspection record attachs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InspectionRecordAttach inspectionRecordAttach : findAll()) {
			remove(inspectionRecordAttach);
		}
	}

	/**
	 * Returns the number of inspection record attachs.
	 *
	 * @return the number of inspection record attachs
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

				Query q = session.createQuery(_SQL_COUNT_INSPECTIONRECORDATTACH);

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
	 * Initializes the inspection record attach persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InspectionRecordAttach>> listenersList = new ArrayList<ModelListener<InspectionRecordAttach>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InspectionRecordAttach>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InspectionRecordAttachImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSPECTIONRECORDATTACH = "SELECT inspectionRecordAttach FROM InspectionRecordAttach inspectionRecordAttach";
	private static final String _SQL_SELECT_INSPECTIONRECORDATTACH_WHERE = "SELECT inspectionRecordAttach FROM InspectionRecordAttach inspectionRecordAttach WHERE ";
	private static final String _SQL_COUNT_INSPECTIONRECORDATTACH = "SELECT COUNT(inspectionRecordAttach) FROM InspectionRecordAttach inspectionRecordAttach";
	private static final String _SQL_COUNT_INSPECTIONRECORDATTACH_WHERE = "SELECT COUNT(inspectionRecordAttach) FROM InspectionRecordAttach inspectionRecordAttach WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "inspectionRecordAttach.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InspectionRecordAttach exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InspectionRecordAttach exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InspectionRecordAttachPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"inspectionRecordId", "hoSoThuTucId", "enTryId", "enTryName",
				"inspectorId", "uploadTime", "markUpDelte"
			});
	private static InspectionRecordAttach _nullInspectionRecordAttach = new InspectionRecordAttachImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InspectionRecordAttach> toCacheModel() {
				return _nullInspectionRecordAttachCacheModel;
			}
		};

	private static CacheModel<InspectionRecordAttach> _nullInspectionRecordAttachCacheModel =
		new CacheModel<InspectionRecordAttach>() {
			@Override
			public InspectionRecordAttach toEntityModel() {
				return _nullInspectionRecordAttach;
			}
		};
}