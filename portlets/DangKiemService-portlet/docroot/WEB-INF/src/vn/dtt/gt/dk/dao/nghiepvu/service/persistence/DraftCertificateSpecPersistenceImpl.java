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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the draft certificate spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DraftCertificateSpecPersistence
 * @see DraftCertificateSpecUtil
 * @generated
 */
public class DraftCertificateSpecPersistenceImpl extends BasePersistenceImpl<DraftCertificateSpec>
	implements DraftCertificateSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DraftCertificateSpecUtil} to access the draft certificate spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DraftCertificateSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecModelImpl.FINDER_CACHE_ENABLED,
			DraftCertificateSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecModelImpl.FINDER_CACHE_ENABLED,
			DraftCertificateSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTCERTIFICATEID =
		new FinderPath(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecModelImpl.FINDER_CACHE_ENABLED,
			DraftCertificateSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDraftCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID =
		new FinderPath(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecModelImpl.FINDER_CACHE_ENABLED,
			DraftCertificateSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDraftCertificateId", new String[] { Long.class.getName() },
			DraftCertificateSpecModelImpl.DRAFTCERTIFICATEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID = new FinderPath(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDraftCertificateId", new String[] { Long.class.getName() });

	/**
	 * Returns all the draft certificate specs where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @return the matching draft certificate specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId) throws SystemException {
		return findByDraftCertificateId(draftCertificateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the draft certificate specs where draftCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param start the lower bound of the range of draft certificate specs
	 * @param end the upper bound of the range of draft certificate specs (not inclusive)
	 * @return the range of matching draft certificate specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId, int start, int end) throws SystemException {
		return findByDraftCertificateId(draftCertificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the draft certificate specs where draftCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param start the lower bound of the range of draft certificate specs
	 * @param end the upper bound of the range of draft certificate specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching draft certificate specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID;
			finderArgs = new Object[] { draftCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTCERTIFICATEID;
			finderArgs = new Object[] {
					draftCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<DraftCertificateSpec> list = (List<DraftCertificateSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DraftCertificateSpec draftCertificateSpec : list) {
				if ((draftCertificateId != draftCertificateSpec.getDraftCertificateId())) {
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

			query.append(_SQL_SELECT_DRAFTCERTIFICATESPEC_WHERE);

			query.append(_FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DraftCertificateSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(draftCertificateId);

				if (!pagination) {
					list = (List<DraftCertificateSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DraftCertificateSpec>(list);
				}
				else {
					list = (List<DraftCertificateSpec>)QueryUtil.list(q,
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
	 * Returns the first draft certificate spec in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft certificate spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a matching draft certificate spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec findByDraftCertificateId_First(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws NoSuchDraftCertificateSpecException, SystemException {
		DraftCertificateSpec draftCertificateSpec = fetchByDraftCertificateId_First(draftCertificateId,
				orderByComparator);

		if (draftCertificateSpec != null) {
			return draftCertificateSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("draftCertificateId=");
		msg.append(draftCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDraftCertificateSpecException(msg.toString());
	}

	/**
	 * Returns the first draft certificate spec in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft certificate spec, or <code>null</code> if a matching draft certificate spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec fetchByDraftCertificateId_First(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DraftCertificateSpec> list = findByDraftCertificateId(draftCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last draft certificate spec in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft certificate spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a matching draft certificate spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec findByDraftCertificateId_Last(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws NoSuchDraftCertificateSpecException, SystemException {
		DraftCertificateSpec draftCertificateSpec = fetchByDraftCertificateId_Last(draftCertificateId,
				orderByComparator);

		if (draftCertificateSpec != null) {
			return draftCertificateSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("draftCertificateId=");
		msg.append(draftCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDraftCertificateSpecException(msg.toString());
	}

	/**
	 * Returns the last draft certificate spec in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft certificate spec, or <code>null</code> if a matching draft certificate spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec fetchByDraftCertificateId_Last(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDraftCertificateId(draftCertificateId);

		if (count == 0) {
			return null;
		}

		List<DraftCertificateSpec> list = findByDraftCertificateId(draftCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the draft certificate specs before and after the current draft certificate spec in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param id the primary key of the current draft certificate spec
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft certificate spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec[] findByDraftCertificateId_PrevAndNext(
		long id, long draftCertificateId, OrderByComparator orderByComparator)
		throws NoSuchDraftCertificateSpecException, SystemException {
		DraftCertificateSpec draftCertificateSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DraftCertificateSpec[] array = new DraftCertificateSpecImpl[3];

			array[0] = getByDraftCertificateId_PrevAndNext(session,
					draftCertificateSpec, draftCertificateId,
					orderByComparator, true);

			array[1] = draftCertificateSpec;

			array[2] = getByDraftCertificateId_PrevAndNext(session,
					draftCertificateSpec, draftCertificateId,
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

	protected DraftCertificateSpec getByDraftCertificateId_PrevAndNext(
		Session session, DraftCertificateSpec draftCertificateSpec,
		long draftCertificateId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DRAFTCERTIFICATESPEC_WHERE);

		query.append(_FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2);

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
			query.append(DraftCertificateSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(draftCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(draftCertificateSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DraftCertificateSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the draft certificate specs where draftCertificateId = &#63; from the database.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDraftCertificateId(long draftCertificateId)
		throws SystemException {
		for (DraftCertificateSpec draftCertificateSpec : findByDraftCertificateId(
				draftCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(draftCertificateSpec);
		}
	}

	/**
	 * Returns the number of draft certificate specs where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @return the number of matching draft certificate specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDraftCertificateId(long draftCertificateId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID;

		Object[] finderArgs = new Object[] { draftCertificateId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DRAFTCERTIFICATESPEC_WHERE);

			query.append(_FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(draftCertificateId);

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

	private static final String _FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2 =
		"draftCertificateSpec.draftCertificateId = ?";

	public DraftCertificateSpecPersistenceImpl() {
		setModelClass(DraftCertificateSpec.class);
	}

	/**
	 * Caches the draft certificate spec in the entity cache if it is enabled.
	 *
	 * @param draftCertificateSpec the draft certificate spec
	 */
	@Override
	public void cacheResult(DraftCertificateSpec draftCertificateSpec) {
		EntityCacheUtil.putResult(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecImpl.class,
			draftCertificateSpec.getPrimaryKey(), draftCertificateSpec);

		draftCertificateSpec.resetOriginalValues();
	}

	/**
	 * Caches the draft certificate specs in the entity cache if it is enabled.
	 *
	 * @param draftCertificateSpecs the draft certificate specs
	 */
	@Override
	public void cacheResult(List<DraftCertificateSpec> draftCertificateSpecs) {
		for (DraftCertificateSpec draftCertificateSpec : draftCertificateSpecs) {
			if (EntityCacheUtil.getResult(
						DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
						DraftCertificateSpecImpl.class,
						draftCertificateSpec.getPrimaryKey()) == null) {
				cacheResult(draftCertificateSpec);
			}
			else {
				draftCertificateSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all draft certificate specs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DraftCertificateSpecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DraftCertificateSpecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the draft certificate spec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DraftCertificateSpec draftCertificateSpec) {
		EntityCacheUtil.removeResult(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecImpl.class, draftCertificateSpec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DraftCertificateSpec> draftCertificateSpecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DraftCertificateSpec draftCertificateSpec : draftCertificateSpecs) {
			EntityCacheUtil.removeResult(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
				DraftCertificateSpecImpl.class,
				draftCertificateSpec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new draft certificate spec with the primary key. Does not add the draft certificate spec to the database.
	 *
	 * @param id the primary key for the new draft certificate spec
	 * @return the new draft certificate spec
	 */
	@Override
	public DraftCertificateSpec create(long id) {
		DraftCertificateSpec draftCertificateSpec = new DraftCertificateSpecImpl();

		draftCertificateSpec.setNew(true);
		draftCertificateSpec.setPrimaryKey(id);

		return draftCertificateSpec;
	}

	/**
	 * Removes the draft certificate spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the draft certificate spec
	 * @return the draft certificate spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec remove(long id)
		throws NoSuchDraftCertificateSpecException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the draft certificate spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the draft certificate spec
	 * @return the draft certificate spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec remove(Serializable primaryKey)
		throws NoSuchDraftCertificateSpecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DraftCertificateSpec draftCertificateSpec = (DraftCertificateSpec)session.get(DraftCertificateSpecImpl.class,
					primaryKey);

			if (draftCertificateSpec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDraftCertificateSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(draftCertificateSpec);
		}
		catch (NoSuchDraftCertificateSpecException nsee) {
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
	protected DraftCertificateSpec removeImpl(
		DraftCertificateSpec draftCertificateSpec) throws SystemException {
		draftCertificateSpec = toUnwrappedModel(draftCertificateSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(draftCertificateSpec)) {
				draftCertificateSpec = (DraftCertificateSpec)session.get(DraftCertificateSpecImpl.class,
						draftCertificateSpec.getPrimaryKeyObj());
			}

			if (draftCertificateSpec != null) {
				session.delete(draftCertificateSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (draftCertificateSpec != null) {
			clearCache(draftCertificateSpec);
		}

		return draftCertificateSpec;
	}

	@Override
	public DraftCertificateSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec draftCertificateSpec)
		throws SystemException {
		draftCertificateSpec = toUnwrappedModel(draftCertificateSpec);

		boolean isNew = draftCertificateSpec.isNew();

		DraftCertificateSpecModelImpl draftCertificateSpecModelImpl = (DraftCertificateSpecModelImpl)draftCertificateSpec;

		Session session = null;

		try {
			session = openSession();

			if (draftCertificateSpec.isNew()) {
				session.save(draftCertificateSpec);

				draftCertificateSpec.setNew(false);
			}
			else {
				session.merge(draftCertificateSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DraftCertificateSpecModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((draftCertificateSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						draftCertificateSpecModelImpl.getOriginalDraftCertificateId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID,
					args);

				args = new Object[] {
						draftCertificateSpecModelImpl.getDraftCertificateId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID,
					args);
			}
		}

		EntityCacheUtil.putResult(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateSpecImpl.class,
			draftCertificateSpec.getPrimaryKey(), draftCertificateSpec);

		return draftCertificateSpec;
	}

	protected DraftCertificateSpec toUnwrappedModel(
		DraftCertificateSpec draftCertificateSpec) {
		if (draftCertificateSpec instanceof DraftCertificateSpecImpl) {
			return draftCertificateSpec;
		}

		DraftCertificateSpecImpl draftCertificateSpecImpl = new DraftCertificateSpecImpl();

		draftCertificateSpecImpl.setNew(draftCertificateSpec.isNew());
		draftCertificateSpecImpl.setPrimaryKey(draftCertificateSpec.getPrimaryKey());

		draftCertificateSpecImpl.setId(draftCertificateSpec.getId());
		draftCertificateSpecImpl.setDraftCertificateId(draftCertificateSpec.getDraftCertificateId());
		draftCertificateSpecImpl.setSpecificationCode(draftCertificateSpec.getSpecificationCode());
		draftCertificateSpecImpl.setSpecificationName(draftCertificateSpec.getSpecificationName());
		draftCertificateSpecImpl.setSpecificationValue(draftCertificateSpec.getSpecificationValue());

		return draftCertificateSpecImpl;
	}

	/**
	 * Returns the draft certificate spec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the draft certificate spec
	 * @return the draft certificate spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDraftCertificateSpecException, SystemException {
		DraftCertificateSpec draftCertificateSpec = fetchByPrimaryKey(primaryKey);

		if (draftCertificateSpec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDraftCertificateSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return draftCertificateSpec;
	}

	/**
	 * Returns the draft certificate spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException} if it could not be found.
	 *
	 * @param id the primary key of the draft certificate spec
	 * @return the draft certificate spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec findByPrimaryKey(long id)
		throws NoSuchDraftCertificateSpecException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the draft certificate spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the draft certificate spec
	 * @return the draft certificate spec, or <code>null</code> if a draft certificate spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DraftCertificateSpec draftCertificateSpec = (DraftCertificateSpec)EntityCacheUtil.getResult(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
				DraftCertificateSpecImpl.class, primaryKey);

		if (draftCertificateSpec == _nullDraftCertificateSpec) {
			return null;
		}

		if (draftCertificateSpec == null) {
			Session session = null;

			try {
				session = openSession();

				draftCertificateSpec = (DraftCertificateSpec)session.get(DraftCertificateSpecImpl.class,
						primaryKey);

				if (draftCertificateSpec != null) {
					cacheResult(draftCertificateSpec);
				}
				else {
					EntityCacheUtil.putResult(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
						DraftCertificateSpecImpl.class, primaryKey,
						_nullDraftCertificateSpec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DraftCertificateSpecModelImpl.ENTITY_CACHE_ENABLED,
					DraftCertificateSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return draftCertificateSpec;
	}

	/**
	 * Returns the draft certificate spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the draft certificate spec
	 * @return the draft certificate spec, or <code>null</code> if a draft certificate spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificateSpec fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the draft certificate specs.
	 *
	 * @return the draft certificate specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificateSpec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the draft certificate specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft certificate specs
	 * @param end the upper bound of the range of draft certificate specs (not inclusive)
	 * @return the range of draft certificate specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificateSpec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the draft certificate specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft certificate specs
	 * @param end the upper bound of the range of draft certificate specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of draft certificate specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificateSpec> findAll(int start, int end,
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

		List<DraftCertificateSpec> list = (List<DraftCertificateSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DRAFTCERTIFICATESPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DRAFTCERTIFICATESPEC;

				if (pagination) {
					sql = sql.concat(DraftCertificateSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DraftCertificateSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DraftCertificateSpec>(list);
				}
				else {
					list = (List<DraftCertificateSpec>)QueryUtil.list(q,
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
	 * Removes all the draft certificate specs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DraftCertificateSpec draftCertificateSpec : findAll()) {
			remove(draftCertificateSpec);
		}
	}

	/**
	 * Returns the number of draft certificate specs.
	 *
	 * @return the number of draft certificate specs
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

				Query q = session.createQuery(_SQL_COUNT_DRAFTCERTIFICATESPEC);

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
	 * Initializes the draft certificate spec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DraftCertificateSpec>> listenersList = new ArrayList<ModelListener<DraftCertificateSpec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DraftCertificateSpec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DraftCertificateSpecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DRAFTCERTIFICATESPEC = "SELECT draftCertificateSpec FROM DraftCertificateSpec draftCertificateSpec";
	private static final String _SQL_SELECT_DRAFTCERTIFICATESPEC_WHERE = "SELECT draftCertificateSpec FROM DraftCertificateSpec draftCertificateSpec WHERE ";
	private static final String _SQL_COUNT_DRAFTCERTIFICATESPEC = "SELECT COUNT(draftCertificateSpec) FROM DraftCertificateSpec draftCertificateSpec";
	private static final String _SQL_COUNT_DRAFTCERTIFICATESPEC_WHERE = "SELECT COUNT(draftCertificateSpec) FROM DraftCertificateSpec draftCertificateSpec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "draftCertificateSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DraftCertificateSpec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DraftCertificateSpec exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DraftCertificateSpecPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"draftCertificateId", "specificationCode", "specificationName",
				"specificationValue"
			});
	private static DraftCertificateSpec _nullDraftCertificateSpec = new DraftCertificateSpecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DraftCertificateSpec> toCacheModel() {
				return _nullDraftCertificateSpecCacheModel;
			}
		};

	private static CacheModel<DraftCertificateSpec> _nullDraftCertificateSpecCacheModel =
		new CacheModel<DraftCertificateSpec>() {
			@Override
			public DraftCertificateSpec toEntityModel() {
				return _nullDraftCertificateSpec;
			}
		};
}