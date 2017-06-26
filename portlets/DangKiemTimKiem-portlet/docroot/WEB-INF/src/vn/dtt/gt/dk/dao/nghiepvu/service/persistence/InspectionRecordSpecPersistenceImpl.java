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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the inspection record spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see InspectionRecordSpecPersistence
 * @see InspectionRecordSpecUtil
 * @generated
 */
public class InspectionRecordSpecPersistenceImpl extends BasePersistenceImpl<InspectionRecordSpec>
	implements InspectionRecordSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InspectionRecordSpecUtil} to access the inspection record spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InspectionRecordSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectionRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectionRecordId", new String[] { Long.class.getName() },
			InspectionRecordSpecModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the inspection record specs where inspectionRecordid = &#63;.
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @return the matching inspection record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordSpec> findByInspectionRecordId(
		long inspectionRecordid) throws SystemException {
		return findByInspectionRecordId(inspectionRecordid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection record specs where inspectionRecordid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @param start the lower bound of the range of inspection record specs
	 * @param end the upper bound of the range of inspection record specs (not inclusive)
	 * @return the range of matching inspection record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordSpec> findByInspectionRecordId(
		long inspectionRecordid, int start, int end) throws SystemException {
		return findByInspectionRecordId(inspectionRecordid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection record specs where inspectionRecordid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @param start the lower bound of the range of inspection record specs
	 * @param end the upper bound of the range of inspection record specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordSpec> findByInspectionRecordId(
		long inspectionRecordid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID;
			finderArgs = new Object[] { inspectionRecordid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDID;
			finderArgs = new Object[] {
					inspectionRecordid,
					
					start, end, orderByComparator
				};
		}

		List<InspectionRecordSpec> list = (List<InspectionRecordSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionRecordSpec inspectionRecordSpec : list) {
				if ((inspectionRecordid != inspectionRecordSpec.getInspectionRecordid())) {
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

			query.append(_SQL_SELECT_INSPECTIONRECORDSPEC_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionRecordSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordid);

				if (!pagination) {
					list = (List<InspectionRecordSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecordSpec>(list);
				}
				else {
					list = (List<InspectionRecordSpec>)QueryUtil.list(q,
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
	 * Returns the first inspection record spec in the ordered set where inspectionRecordid = &#63;.
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a matching inspection record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec findByInspectionRecordId_First(
		long inspectionRecordid, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordSpecException, SystemException {
		InspectionRecordSpec inspectionRecordSpec = fetchByInspectionRecordId_First(inspectionRecordid,
				orderByComparator);

		if (inspectionRecordSpec != null) {
			return inspectionRecordSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordid=");
		msg.append(inspectionRecordid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordSpecException(msg.toString());
	}

	/**
	 * Returns the first inspection record spec in the ordered set where inspectionRecordid = &#63;.
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record spec, or <code>null</code> if a matching inspection record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec fetchByInspectionRecordId_First(
		long inspectionRecordid, OrderByComparator orderByComparator)
		throws SystemException {
		List<InspectionRecordSpec> list = findByInspectionRecordId(inspectionRecordid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection record spec in the ordered set where inspectionRecordid = &#63;.
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a matching inspection record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec findByInspectionRecordId_Last(
		long inspectionRecordid, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordSpecException, SystemException {
		InspectionRecordSpec inspectionRecordSpec = fetchByInspectionRecordId_Last(inspectionRecordid,
				orderByComparator);

		if (inspectionRecordSpec != null) {
			return inspectionRecordSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordid=");
		msg.append(inspectionRecordid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordSpecException(msg.toString());
	}

	/**
	 * Returns the last inspection record spec in the ordered set where inspectionRecordid = &#63;.
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record spec, or <code>null</code> if a matching inspection record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec fetchByInspectionRecordId_Last(
		long inspectionRecordid, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInspectionRecordId(inspectionRecordid);

		if (count == 0) {
			return null;
		}

		List<InspectionRecordSpec> list = findByInspectionRecordId(inspectionRecordid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection record specs before and after the current inspection record spec in the ordered set where inspectionRecordid = &#63;.
	 *
	 * @param id the primary key of the current inspection record spec
	 * @param inspectionRecordid the inspection recordid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordid, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordSpecException, SystemException {
		InspectionRecordSpec inspectionRecordSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionRecordSpec[] array = new InspectionRecordSpecImpl[3];

			array[0] = getByInspectionRecordId_PrevAndNext(session,
					inspectionRecordSpec, inspectionRecordid,
					orderByComparator, true);

			array[1] = inspectionRecordSpec;

			array[2] = getByInspectionRecordId_PrevAndNext(session,
					inspectionRecordSpec, inspectionRecordid,
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

	protected InspectionRecordSpec getByInspectionRecordId_PrevAndNext(
		Session session, InspectionRecordSpec inspectionRecordSpec,
		long inspectionRecordid, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSPECTIONRECORDSPEC_WHERE);

		query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

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
			query.append(InspectionRecordSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectionRecordid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionRecordSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionRecordSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection record specs where inspectionRecordid = &#63; from the database.
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectionRecordId(long inspectionRecordid)
		throws SystemException {
		for (InspectionRecordSpec inspectionRecordSpec : findByInspectionRecordId(
				inspectionRecordid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(inspectionRecordSpec);
		}
	}

	/**
	 * Returns the number of inspection record specs where inspectionRecordid = &#63;.
	 *
	 * @param inspectionRecordid the inspection recordid
	 * @return the number of matching inspection record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionRecordId(long inspectionRecordid)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDID;

		Object[] finderArgs = new Object[] { inspectionRecordid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSPECTIONRECORDSPEC_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordid);

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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2 =
		"inspectionRecordSpec.inspectionRecordid = ?";

	public InspectionRecordSpecPersistenceImpl() {
		setModelClass(InspectionRecordSpec.class);
	}

	/**
	 * Caches the inspection record spec in the entity cache if it is enabled.
	 *
	 * @param inspectionRecordSpec the inspection record spec
	 */
	@Override
	public void cacheResult(InspectionRecordSpec inspectionRecordSpec) {
		EntityCacheUtil.putResult(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecImpl.class,
			inspectionRecordSpec.getPrimaryKey(), inspectionRecordSpec);

		inspectionRecordSpec.resetOriginalValues();
	}

	/**
	 * Caches the inspection record specs in the entity cache if it is enabled.
	 *
	 * @param inspectionRecordSpecs the inspection record specs
	 */
	@Override
	public void cacheResult(List<InspectionRecordSpec> inspectionRecordSpecs) {
		for (InspectionRecordSpec inspectionRecordSpec : inspectionRecordSpecs) {
			if (EntityCacheUtil.getResult(
						InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
						InspectionRecordSpecImpl.class,
						inspectionRecordSpec.getPrimaryKey()) == null) {
				cacheResult(inspectionRecordSpec);
			}
			else {
				inspectionRecordSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all inspection record specs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InspectionRecordSpecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InspectionRecordSpecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the inspection record spec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InspectionRecordSpec inspectionRecordSpec) {
		EntityCacheUtil.removeResult(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecImpl.class, inspectionRecordSpec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<InspectionRecordSpec> inspectionRecordSpecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InspectionRecordSpec inspectionRecordSpec : inspectionRecordSpecs) {
			EntityCacheUtil.removeResult(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
				InspectionRecordSpecImpl.class,
				inspectionRecordSpec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new inspection record spec with the primary key. Does not add the inspection record spec to the database.
	 *
	 * @param id the primary key for the new inspection record spec
	 * @return the new inspection record spec
	 */
	@Override
	public InspectionRecordSpec create(long id) {
		InspectionRecordSpec inspectionRecordSpec = new InspectionRecordSpecImpl();

		inspectionRecordSpec.setNew(true);
		inspectionRecordSpec.setPrimaryKey(id);

		return inspectionRecordSpec;
	}

	/**
	 * Removes the inspection record spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the inspection record spec
	 * @return the inspection record spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec remove(long id)
		throws NoSuchInspectionRecordSpecException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the inspection record spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the inspection record spec
	 * @return the inspection record spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec remove(Serializable primaryKey)
		throws NoSuchInspectionRecordSpecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InspectionRecordSpec inspectionRecordSpec = (InspectionRecordSpec)session.get(InspectionRecordSpecImpl.class,
					primaryKey);

			if (inspectionRecordSpec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInspectionRecordSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(inspectionRecordSpec);
		}
		catch (NoSuchInspectionRecordSpecException nsee) {
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
	protected InspectionRecordSpec removeImpl(
		InspectionRecordSpec inspectionRecordSpec) throws SystemException {
		inspectionRecordSpec = toUnwrappedModel(inspectionRecordSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(inspectionRecordSpec)) {
				inspectionRecordSpec = (InspectionRecordSpec)session.get(InspectionRecordSpecImpl.class,
						inspectionRecordSpec.getPrimaryKeyObj());
			}

			if (inspectionRecordSpec != null) {
				session.delete(inspectionRecordSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (inspectionRecordSpec != null) {
			clearCache(inspectionRecordSpec);
		}

		return inspectionRecordSpec;
	}

	@Override
	public InspectionRecordSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec)
		throws SystemException {
		inspectionRecordSpec = toUnwrappedModel(inspectionRecordSpec);

		boolean isNew = inspectionRecordSpec.isNew();

		InspectionRecordSpecModelImpl inspectionRecordSpecModelImpl = (InspectionRecordSpecModelImpl)inspectionRecordSpec;

		Session session = null;

		try {
			session = openSession();

			if (inspectionRecordSpec.isNew()) {
				session.save(inspectionRecordSpec);

				inspectionRecordSpec.setNew(false);
			}
			else {
				session.merge(inspectionRecordSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InspectionRecordSpecModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((inspectionRecordSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecordSpecModelImpl.getOriginalInspectionRecordid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);

				args = new Object[] {
						inspectionRecordSpecModelImpl.getInspectionRecordid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);
			}
		}

		EntityCacheUtil.putResult(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordSpecImpl.class,
			inspectionRecordSpec.getPrimaryKey(), inspectionRecordSpec);

		return inspectionRecordSpec;
	}

	protected InspectionRecordSpec toUnwrappedModel(
		InspectionRecordSpec inspectionRecordSpec) {
		if (inspectionRecordSpec instanceof InspectionRecordSpecImpl) {
			return inspectionRecordSpec;
		}

		InspectionRecordSpecImpl inspectionRecordSpecImpl = new InspectionRecordSpecImpl();

		inspectionRecordSpecImpl.setNew(inspectionRecordSpec.isNew());
		inspectionRecordSpecImpl.setPrimaryKey(inspectionRecordSpec.getPrimaryKey());

		inspectionRecordSpecImpl.setId(inspectionRecordSpec.getId());
		inspectionRecordSpecImpl.setInspectionRecordid(inspectionRecordSpec.getInspectionRecordid());
		inspectionRecordSpecImpl.setSpecificationCode(inspectionRecordSpec.getSpecificationCode());
		inspectionRecordSpecImpl.setSpecificationName(inspectionRecordSpec.getSpecificationName());
		inspectionRecordSpecImpl.setSpecificationValue(inspectionRecordSpec.getSpecificationValue());
		inspectionRecordSpecImpl.setEvaluationResult(inspectionRecordSpec.getEvaluationResult());

		return inspectionRecordSpecImpl;
	}

	/**
	 * Returns the inspection record spec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection record spec
	 * @return the inspection record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInspectionRecordSpecException, SystemException {
		InspectionRecordSpec inspectionRecordSpec = fetchByPrimaryKey(primaryKey);

		if (inspectionRecordSpec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInspectionRecordSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return inspectionRecordSpec;
	}

	/**
	 * Returns the inspection record spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException} if it could not be found.
	 *
	 * @param id the primary key of the inspection record spec
	 * @return the inspection record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec findByPrimaryKey(long id)
		throws NoSuchInspectionRecordSpecException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the inspection record spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection record spec
	 * @return the inspection record spec, or <code>null</code> if a inspection record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InspectionRecordSpec inspectionRecordSpec = (InspectionRecordSpec)EntityCacheUtil.getResult(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
				InspectionRecordSpecImpl.class, primaryKey);

		if (inspectionRecordSpec == _nullInspectionRecordSpec) {
			return null;
		}

		if (inspectionRecordSpec == null) {
			Session session = null;

			try {
				session = openSession();

				inspectionRecordSpec = (InspectionRecordSpec)session.get(InspectionRecordSpecImpl.class,
						primaryKey);

				if (inspectionRecordSpec != null) {
					cacheResult(inspectionRecordSpec);
				}
				else {
					EntityCacheUtil.putResult(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
						InspectionRecordSpecImpl.class, primaryKey,
						_nullInspectionRecordSpec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InspectionRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
					InspectionRecordSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return inspectionRecordSpec;
	}

	/**
	 * Returns the inspection record spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the inspection record spec
	 * @return the inspection record spec, or <code>null</code> if a inspection record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecordSpec fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the inspection record specs.
	 *
	 * @return the inspection record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordSpec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection record specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection record specs
	 * @param end the upper bound of the range of inspection record specs (not inclusive)
	 * @return the range of inspection record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordSpec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection record specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection record specs
	 * @param end the upper bound of the range of inspection record specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inspection record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecordSpec> findAll(int start, int end,
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

		List<InspectionRecordSpec> list = (List<InspectionRecordSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSPECTIONRECORDSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSPECTIONRECORDSPEC;

				if (pagination) {
					sql = sql.concat(InspectionRecordSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InspectionRecordSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecordSpec>(list);
				}
				else {
					list = (List<InspectionRecordSpec>)QueryUtil.list(q,
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
	 * Removes all the inspection record specs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InspectionRecordSpec inspectionRecordSpec : findAll()) {
			remove(inspectionRecordSpec);
		}
	}

	/**
	 * Returns the number of inspection record specs.
	 *
	 * @return the number of inspection record specs
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

				Query q = session.createQuery(_SQL_COUNT_INSPECTIONRECORDSPEC);

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
	 * Initializes the inspection record spec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InspectionRecordSpec>> listenersList = new ArrayList<ModelListener<InspectionRecordSpec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InspectionRecordSpec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InspectionRecordSpecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSPECTIONRECORDSPEC = "SELECT inspectionRecordSpec FROM InspectionRecordSpec inspectionRecordSpec";
	private static final String _SQL_SELECT_INSPECTIONRECORDSPEC_WHERE = "SELECT inspectionRecordSpec FROM InspectionRecordSpec inspectionRecordSpec WHERE ";
	private static final String _SQL_COUNT_INSPECTIONRECORDSPEC = "SELECT COUNT(inspectionRecordSpec) FROM InspectionRecordSpec inspectionRecordSpec";
	private static final String _SQL_COUNT_INSPECTIONRECORDSPEC_WHERE = "SELECT COUNT(inspectionRecordSpec) FROM InspectionRecordSpec inspectionRecordSpec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "inspectionRecordSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InspectionRecordSpec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InspectionRecordSpec exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InspectionRecordSpecPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"inspectionRecordid", "specificationCode", "specificationName",
				"specificationValue", "evaluationResult"
			});
	private static InspectionRecordSpec _nullInspectionRecordSpec = new InspectionRecordSpecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InspectionRecordSpec> toCacheModel() {
				return _nullInspectionRecordSpecCacheModel;
			}
		};

	private static CacheModel<InspectionRecordSpec> _nullInspectionRecordSpecCacheModel =
		new CacheModel<InspectionRecordSpec>() {
			@Override
			public InspectionRecordSpec toEntityModel() {
				return _nullInspectionRecordSpec;
			}
		};
}