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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the satety test report spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see SatetyTestReportSpecPersistence
 * @see SatetyTestReportSpecUtil
 * @generated
 */
public class SatetyTestReportSpecPersistenceImpl extends BasePersistenceImpl<SatetyTestReportSpec>
	implements SatetyTestReportSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SatetyTestReportSpecUtil} to access the satety test report spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SatetyTestReportSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecModelImpl.FINDER_CACHE_ENABLED,
			SatetyTestReportSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecModelImpl.FINDER_CACHE_ENABLED,
			SatetyTestReportSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SAFTYTESTREPORTID =
		new FinderPath(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecModelImpl.FINDER_CACHE_ENABLED,
			SatetyTestReportSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySaftyTestReportId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFTYTESTREPORTID =
		new FinderPath(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecModelImpl.FINDER_CACHE_ENABLED,
			SatetyTestReportSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySaftyTestReportId", new String[] { Long.class.getName() },
			SatetyTestReportSpecModelImpl.SAFTYTESTREPORTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SAFTYTESTREPORTID = new FinderPath(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySaftyTestReportId", new String[] { Long.class.getName() });

	/**
	 * Returns all the satety test report specs where saftyTestReportId = &#63;.
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @return the matching satety test report specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId) throws SystemException {
		return findBySaftyTestReportId(saftyTestReportId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the satety test report specs where saftyTestReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @param start the lower bound of the range of satety test report specs
	 * @param end the upper bound of the range of satety test report specs (not inclusive)
	 * @return the range of matching satety test report specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId, int start, int end) throws SystemException {
		return findBySaftyTestReportId(saftyTestReportId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the satety test report specs where saftyTestReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @param start the lower bound of the range of satety test report specs
	 * @param end the upper bound of the range of satety test report specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching satety test report specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFTYTESTREPORTID;
			finderArgs = new Object[] { saftyTestReportId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SAFTYTESTREPORTID;
			finderArgs = new Object[] {
					saftyTestReportId,
					
					start, end, orderByComparator
				};
		}

		List<SatetyTestReportSpec> list = (List<SatetyTestReportSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SatetyTestReportSpec satetyTestReportSpec : list) {
				if ((saftyTestReportId != satetyTestReportSpec.getSaftyTestReportId())) {
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

			query.append(_SQL_SELECT_SATETYTESTREPORTSPEC_WHERE);

			query.append(_FINDER_COLUMN_SAFTYTESTREPORTID_SAFTYTESTREPORTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SatetyTestReportSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(saftyTestReportId);

				if (!pagination) {
					list = (List<SatetyTestReportSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SatetyTestReportSpec>(list);
				}
				else {
					list = (List<SatetyTestReportSpec>)QueryUtil.list(q,
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
	 * Returns the first satety test report spec in the ordered set where saftyTestReportId = &#63;.
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching satety test report spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a matching satety test report spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec findBySaftyTestReportId_First(
		long saftyTestReportId, OrderByComparator orderByComparator)
		throws NoSuchSatetyTestReportSpecException, SystemException {
		SatetyTestReportSpec satetyTestReportSpec = fetchBySaftyTestReportId_First(saftyTestReportId,
				orderByComparator);

		if (satetyTestReportSpec != null) {
			return satetyTestReportSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("saftyTestReportId=");
		msg.append(saftyTestReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSatetyTestReportSpecException(msg.toString());
	}

	/**
	 * Returns the first satety test report spec in the ordered set where saftyTestReportId = &#63;.
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching satety test report spec, or <code>null</code> if a matching satety test report spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec fetchBySaftyTestReportId_First(
		long saftyTestReportId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SatetyTestReportSpec> list = findBySaftyTestReportId(saftyTestReportId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last satety test report spec in the ordered set where saftyTestReportId = &#63;.
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching satety test report spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a matching satety test report spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec findBySaftyTestReportId_Last(
		long saftyTestReportId, OrderByComparator orderByComparator)
		throws NoSuchSatetyTestReportSpecException, SystemException {
		SatetyTestReportSpec satetyTestReportSpec = fetchBySaftyTestReportId_Last(saftyTestReportId,
				orderByComparator);

		if (satetyTestReportSpec != null) {
			return satetyTestReportSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("saftyTestReportId=");
		msg.append(saftyTestReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSatetyTestReportSpecException(msg.toString());
	}

	/**
	 * Returns the last satety test report spec in the ordered set where saftyTestReportId = &#63;.
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching satety test report spec, or <code>null</code> if a matching satety test report spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec fetchBySaftyTestReportId_Last(
		long saftyTestReportId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySaftyTestReportId(saftyTestReportId);

		if (count == 0) {
			return null;
		}

		List<SatetyTestReportSpec> list = findBySaftyTestReportId(saftyTestReportId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the satety test report specs before and after the current satety test report spec in the ordered set where saftyTestReportId = &#63;.
	 *
	 * @param id the primary key of the current satety test report spec
	 * @param saftyTestReportId the safty test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next satety test report spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec[] findBySaftyTestReportId_PrevAndNext(long id,
		long saftyTestReportId, OrderByComparator orderByComparator)
		throws NoSuchSatetyTestReportSpecException, SystemException {
		SatetyTestReportSpec satetyTestReportSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SatetyTestReportSpec[] array = new SatetyTestReportSpecImpl[3];

			array[0] = getBySaftyTestReportId_PrevAndNext(session,
					satetyTestReportSpec, saftyTestReportId, orderByComparator,
					true);

			array[1] = satetyTestReportSpec;

			array[2] = getBySaftyTestReportId_PrevAndNext(session,
					satetyTestReportSpec, saftyTestReportId, orderByComparator,
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

	protected SatetyTestReportSpec getBySaftyTestReportId_PrevAndNext(
		Session session, SatetyTestReportSpec satetyTestReportSpec,
		long saftyTestReportId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SATETYTESTREPORTSPEC_WHERE);

		query.append(_FINDER_COLUMN_SAFTYTESTREPORTID_SAFTYTESTREPORTID_2);

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
			query.append(SatetyTestReportSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(saftyTestReportId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(satetyTestReportSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SatetyTestReportSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the satety test report specs where saftyTestReportId = &#63; from the database.
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySaftyTestReportId(long saftyTestReportId)
		throws SystemException {
		for (SatetyTestReportSpec satetyTestReportSpec : findBySaftyTestReportId(
				saftyTestReportId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(satetyTestReportSpec);
		}
	}

	/**
	 * Returns the number of satety test report specs where saftyTestReportId = &#63;.
	 *
	 * @param saftyTestReportId the safty test report ID
	 * @return the number of matching satety test report specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySaftyTestReportId(long saftyTestReportId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SAFTYTESTREPORTID;

		Object[] finderArgs = new Object[] { saftyTestReportId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SATETYTESTREPORTSPEC_WHERE);

			query.append(_FINDER_COLUMN_SAFTYTESTREPORTID_SAFTYTESTREPORTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(saftyTestReportId);

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

	private static final String _FINDER_COLUMN_SAFTYTESTREPORTID_SAFTYTESTREPORTID_2 =
		"satetyTestReportSpec.saftyTestReportId = ?";

	public SatetyTestReportSpecPersistenceImpl() {
		setModelClass(SatetyTestReportSpec.class);
	}

	/**
	 * Caches the satety test report spec in the entity cache if it is enabled.
	 *
	 * @param satetyTestReportSpec the satety test report spec
	 */
	@Override
	public void cacheResult(SatetyTestReportSpec satetyTestReportSpec) {
		EntityCacheUtil.putResult(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecImpl.class,
			satetyTestReportSpec.getPrimaryKey(), satetyTestReportSpec);

		satetyTestReportSpec.resetOriginalValues();
	}

	/**
	 * Caches the satety test report specs in the entity cache if it is enabled.
	 *
	 * @param satetyTestReportSpecs the satety test report specs
	 */
	@Override
	public void cacheResult(List<SatetyTestReportSpec> satetyTestReportSpecs) {
		for (SatetyTestReportSpec satetyTestReportSpec : satetyTestReportSpecs) {
			if (EntityCacheUtil.getResult(
						SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
						SatetyTestReportSpecImpl.class,
						satetyTestReportSpec.getPrimaryKey()) == null) {
				cacheResult(satetyTestReportSpec);
			}
			else {
				satetyTestReportSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all satety test report specs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SatetyTestReportSpecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SatetyTestReportSpecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the satety test report spec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SatetyTestReportSpec satetyTestReportSpec) {
		EntityCacheUtil.removeResult(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecImpl.class, satetyTestReportSpec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SatetyTestReportSpec> satetyTestReportSpecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SatetyTestReportSpec satetyTestReportSpec : satetyTestReportSpecs) {
			EntityCacheUtil.removeResult(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
				SatetyTestReportSpecImpl.class,
				satetyTestReportSpec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new satety test report spec with the primary key. Does not add the satety test report spec to the database.
	 *
	 * @param id the primary key for the new satety test report spec
	 * @return the new satety test report spec
	 */
	@Override
	public SatetyTestReportSpec create(long id) {
		SatetyTestReportSpec satetyTestReportSpec = new SatetyTestReportSpecImpl();

		satetyTestReportSpec.setNew(true);
		satetyTestReportSpec.setPrimaryKey(id);

		return satetyTestReportSpec;
	}

	/**
	 * Removes the satety test report spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the satety test report spec
	 * @return the satety test report spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec remove(long id)
		throws NoSuchSatetyTestReportSpecException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the satety test report spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the satety test report spec
	 * @return the satety test report spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec remove(Serializable primaryKey)
		throws NoSuchSatetyTestReportSpecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SatetyTestReportSpec satetyTestReportSpec = (SatetyTestReportSpec)session.get(SatetyTestReportSpecImpl.class,
					primaryKey);

			if (satetyTestReportSpec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSatetyTestReportSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(satetyTestReportSpec);
		}
		catch (NoSuchSatetyTestReportSpecException nsee) {
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
	protected SatetyTestReportSpec removeImpl(
		SatetyTestReportSpec satetyTestReportSpec) throws SystemException {
		satetyTestReportSpec = toUnwrappedModel(satetyTestReportSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(satetyTestReportSpec)) {
				satetyTestReportSpec = (SatetyTestReportSpec)session.get(SatetyTestReportSpecImpl.class,
						satetyTestReportSpec.getPrimaryKeyObj());
			}

			if (satetyTestReportSpec != null) {
				session.delete(satetyTestReportSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (satetyTestReportSpec != null) {
			clearCache(satetyTestReportSpec);
		}

		return satetyTestReportSpec;
	}

	@Override
	public SatetyTestReportSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec satetyTestReportSpec)
		throws SystemException {
		satetyTestReportSpec = toUnwrappedModel(satetyTestReportSpec);

		boolean isNew = satetyTestReportSpec.isNew();

		SatetyTestReportSpecModelImpl satetyTestReportSpecModelImpl = (SatetyTestReportSpecModelImpl)satetyTestReportSpec;

		Session session = null;

		try {
			session = openSession();

			if (satetyTestReportSpec.isNew()) {
				session.save(satetyTestReportSpec);

				satetyTestReportSpec.setNew(false);
			}
			else {
				session.merge(satetyTestReportSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SatetyTestReportSpecModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((satetyTestReportSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFTYTESTREPORTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						satetyTestReportSpecModelImpl.getOriginalSaftyTestReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFTYTESTREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFTYTESTREPORTID,
					args);

				args = new Object[] {
						satetyTestReportSpecModelImpl.getSaftyTestReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFTYTESTREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFTYTESTREPORTID,
					args);
			}
		}

		EntityCacheUtil.putResult(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
			SatetyTestReportSpecImpl.class,
			satetyTestReportSpec.getPrimaryKey(), satetyTestReportSpec);

		return satetyTestReportSpec;
	}

	protected SatetyTestReportSpec toUnwrappedModel(
		SatetyTestReportSpec satetyTestReportSpec) {
		if (satetyTestReportSpec instanceof SatetyTestReportSpecImpl) {
			return satetyTestReportSpec;
		}

		SatetyTestReportSpecImpl satetyTestReportSpecImpl = new SatetyTestReportSpecImpl();

		satetyTestReportSpecImpl.setNew(satetyTestReportSpec.isNew());
		satetyTestReportSpecImpl.setPrimaryKey(satetyTestReportSpec.getPrimaryKey());

		satetyTestReportSpecImpl.setId(satetyTestReportSpec.getId());
		satetyTestReportSpecImpl.setSaftyTestReportId(satetyTestReportSpec.getSaftyTestReportId());
		satetyTestReportSpecImpl.setSpecificationCode(satetyTestReportSpec.getSpecificationCode());
		satetyTestReportSpecImpl.setSpecificationName(satetyTestReportSpec.getSpecificationName());
		satetyTestReportSpecImpl.setSpecificationValue(satetyTestReportSpec.getSpecificationValue());
		satetyTestReportSpecImpl.setEvaluationResult(satetyTestReportSpec.getEvaluationResult());

		return satetyTestReportSpecImpl;
	}

	/**
	 * Returns the satety test report spec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the satety test report spec
	 * @return the satety test report spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSatetyTestReportSpecException, SystemException {
		SatetyTestReportSpec satetyTestReportSpec = fetchByPrimaryKey(primaryKey);

		if (satetyTestReportSpec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSatetyTestReportSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return satetyTestReportSpec;
	}

	/**
	 * Returns the satety test report spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException} if it could not be found.
	 *
	 * @param id the primary key of the satety test report spec
	 * @return the satety test report spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec findByPrimaryKey(long id)
		throws NoSuchSatetyTestReportSpecException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the satety test report spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the satety test report spec
	 * @return the satety test report spec, or <code>null</code> if a satety test report spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SatetyTestReportSpec satetyTestReportSpec = (SatetyTestReportSpec)EntityCacheUtil.getResult(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
				SatetyTestReportSpecImpl.class, primaryKey);

		if (satetyTestReportSpec == _nullSatetyTestReportSpec) {
			return null;
		}

		if (satetyTestReportSpec == null) {
			Session session = null;

			try {
				session = openSession();

				satetyTestReportSpec = (SatetyTestReportSpec)session.get(SatetyTestReportSpecImpl.class,
						primaryKey);

				if (satetyTestReportSpec != null) {
					cacheResult(satetyTestReportSpec);
				}
				else {
					EntityCacheUtil.putResult(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
						SatetyTestReportSpecImpl.class, primaryKey,
						_nullSatetyTestReportSpec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SatetyTestReportSpecModelImpl.ENTITY_CACHE_ENABLED,
					SatetyTestReportSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return satetyTestReportSpec;
	}

	/**
	 * Returns the satety test report spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the satety test report spec
	 * @return the satety test report spec, or <code>null</code> if a satety test report spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SatetyTestReportSpec fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the satety test report specs.
	 *
	 * @return the satety test report specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SatetyTestReportSpec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the satety test report specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of satety test report specs
	 * @param end the upper bound of the range of satety test report specs (not inclusive)
	 * @return the range of satety test report specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SatetyTestReportSpec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the satety test report specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of satety test report specs
	 * @param end the upper bound of the range of satety test report specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of satety test report specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SatetyTestReportSpec> findAll(int start, int end,
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

		List<SatetyTestReportSpec> list = (List<SatetyTestReportSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SATETYTESTREPORTSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SATETYTESTREPORTSPEC;

				if (pagination) {
					sql = sql.concat(SatetyTestReportSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SatetyTestReportSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SatetyTestReportSpec>(list);
				}
				else {
					list = (List<SatetyTestReportSpec>)QueryUtil.list(q,
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
	 * Removes all the satety test report specs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SatetyTestReportSpec satetyTestReportSpec : findAll()) {
			remove(satetyTestReportSpec);
		}
	}

	/**
	 * Returns the number of satety test report specs.
	 *
	 * @return the number of satety test report specs
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

				Query q = session.createQuery(_SQL_COUNT_SATETYTESTREPORTSPEC);

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
	 * Initializes the satety test report spec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SatetyTestReportSpec>> listenersList = new ArrayList<ModelListener<SatetyTestReportSpec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SatetyTestReportSpec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SatetyTestReportSpecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SATETYTESTREPORTSPEC = "SELECT satetyTestReportSpec FROM SatetyTestReportSpec satetyTestReportSpec";
	private static final String _SQL_SELECT_SATETYTESTREPORTSPEC_WHERE = "SELECT satetyTestReportSpec FROM SatetyTestReportSpec satetyTestReportSpec WHERE ";
	private static final String _SQL_COUNT_SATETYTESTREPORTSPEC = "SELECT COUNT(satetyTestReportSpec) FROM SatetyTestReportSpec satetyTestReportSpec";
	private static final String _SQL_COUNT_SATETYTESTREPORTSPEC_WHERE = "SELECT COUNT(satetyTestReportSpec) FROM SatetyTestReportSpec satetyTestReportSpec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "satetyTestReportSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SatetyTestReportSpec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SatetyTestReportSpec exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SatetyTestReportSpecPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"saftyTestReportId", "specificationCode", "specificationName",
				"specificationValue", "evaluationResult"
			});
	private static SatetyTestReportSpec _nullSatetyTestReportSpec = new SatetyTestReportSpecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SatetyTestReportSpec> toCacheModel() {
				return _nullSatetyTestReportSpecCacheModel;
			}
		};

	private static CacheModel<SatetyTestReportSpec> _nullSatetyTestReportSpecCacheModel =
		new CacheModel<SatetyTestReportSpec>() {
			@Override
			public SatetyTestReportSpec toEntityModel() {
				return _nullSatetyTestReportSpec;
			}
		};
}