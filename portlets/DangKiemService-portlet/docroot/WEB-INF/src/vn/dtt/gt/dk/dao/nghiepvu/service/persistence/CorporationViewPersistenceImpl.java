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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the corporation view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CorporationViewPersistence
 * @see CorporationViewUtil
 * @generated
 */
public class CorporationViewPersistenceImpl extends BasePersistenceImpl<CorporationView>
	implements CorporationViewPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CorporationViewUtil} to access the corporation view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CorporationViewImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectorId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInspectorId",
			new String[] { Long.class.getName() },
			CorporationViewModelImpl.INSPECTORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORID = new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the corporation views where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @return the matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByInspectorId(long inspectorId)
		throws SystemException {
		return findByInspectorId(inspectorId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporation views where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @return the range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByInspectorId(long inspectorId, int start,
		int end) throws SystemException {
		return findByInspectorId(inspectorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation views where inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByInspectorId(long inspectorId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID;
			finderArgs = new Object[] { inspectorId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORID;
			finderArgs = new Object[] { inspectorId, start, end, orderByComparator };
		}

		List<CorporationView> list = (List<CorporationView>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CorporationView corporationView : list) {
				if ((inspectorId != corporationView.getInspectorId())) {
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

			query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				if (!pagination) {
					list = (List<CorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationView>(list);
				}
				else {
					list = (List<CorporationView>)QueryUtil.list(q,
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
	 * Returns the first corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByInspectorId_First(long inspectorId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByInspectorId_First(inspectorId,
				orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByInspectorId_First(long inspectorId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CorporationView> list = findByInspectorId(inspectorId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByInspectorId_Last(long inspectorId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByInspectorId_Last(inspectorId,
				orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByInspectorId_Last(long inspectorId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInspectorId(inspectorId);

		if (count == 0) {
			return null;
		}

		List<CorporationView> list = findByInspectorId(inspectorId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporation views before and after the current corporation view in the ordered set where inspectorId = &#63;.
	 *
	 * @param id the primary key of the current corporation view
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView[] findByInspectorId_PrevAndNext(long id,
		long inspectorId, OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CorporationView[] array = new CorporationViewImpl[3];

			array[0] = getByInspectorId_PrevAndNext(session, corporationView,
					inspectorId, orderByComparator, true);

			array[1] = corporationView;

			array[2] = getByInspectorId_PrevAndNext(session, corporationView,
					inspectorId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CorporationView getByInspectorId_PrevAndNext(Session session,
		CorporationView corporationView, long inspectorId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

		query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

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
			query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporation views where inspectorId = &#63; from the database.
	 *
	 * @param inspectorId the inspector ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectorId(long inspectorId) throws SystemException {
		for (CorporationView corporationView : findByInspectorId(inspectorId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(corporationView);
		}
	}

	/**
	 * Returns the number of corporation views where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @return the number of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorId(long inspectorId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORID;

		Object[] finderArgs = new Object[] { inspectorId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

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

	private static final String _FINDER_COLUMN_INSPECTORID_INSPECTORID_2 = "corporationView.inspectorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCorporationId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationId",
			new String[] { String.class.getName() },
			CorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the corporation views where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByCorporationId(String corporationId)
		throws SystemException {
		return findByCorporationId(corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporation views where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @return the range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByCorporationId(String corporationId,
		int start, int end) throws SystemException {
		return findByCorporationId(corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation views where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByCorporationId(String corporationId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] { corporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] {
					corporationId,
					
					start, end, orderByComparator
				};
		}

		List<CorporationView> list = (List<CorporationView>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CorporationView corporationView : list) {
				if (!Validator.equals(corporationId,
							corporationView.getCorporationId())) {
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

			query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				if (!pagination) {
					list = (List<CorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationView>(list);
				}
				else {
					list = (List<CorporationView>)QueryUtil.list(q,
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
	 * Returns the first corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByCorporationId_First(String corporationId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByCorporationId_First(corporationId,
				orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByCorporationId_First(String corporationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CorporationView> list = findByCorporationId(corporationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByCorporationId_Last(String corporationId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByCorporationId_Last(corporationId,
				orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByCorporationId_Last(String corporationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCorporationId(corporationId);

		if (count == 0) {
			return null;
		}

		List<CorporationView> list = findByCorporationId(corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporation views before and after the current corporation view in the ordered set where corporationId = &#63;.
	 *
	 * @param id the primary key of the current corporation view
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView[] findByCorporationId_PrevAndNext(long id,
		String corporationId, OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CorporationView[] array = new CorporationViewImpl[3];

			array[0] = getByCorporationId_PrevAndNext(session, corporationView,
					corporationId, orderByComparator, true);

			array[1] = corporationView;

			array[2] = getByCorporationId_PrevAndNext(session, corporationView,
					corporationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CorporationView getByCorporationId_PrevAndNext(Session session,
		CorporationView corporationView, String corporationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

		boolean bindCorporationId = false;

		if (corporationId == null) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
		}
		else if (corporationId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
		}
		else {
			bindCorporationId = true;

			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
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
			query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporation views where corporationId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCorporationId(String corporationId)
		throws SystemException {
		for (CorporationView corporationView : findByCorporationId(
				corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(corporationView);
		}
	}

	/**
	 * Returns the number of corporation views where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the number of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCorporationId(String corporationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "corporationView.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "corporationView.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(corporationView.corporationId IS NULL OR corporationView.corporationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectorIdCorporationId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectorIdCorporationId",
			new String[] { String.class.getName(), Long.class.getName() },
			CorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK |
			CorporationViewModelImpl.INSPECTORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorIdCorporationId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @return the matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByInspectorIdCorporationId(
		String corporationId, long inspectorId) throws SystemException {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @return the range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end)
		throws SystemException {
		return findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByInspectorIdCorporationId(
		String corporationId, long inspectorId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID;
			finderArgs = new Object[] { corporationId, inspectorId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID;
			finderArgs = new Object[] {
					corporationId, inspectorId,
					
					start, end, orderByComparator
				};
		}

		List<CorporationView> list = (List<CorporationView>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CorporationView corporationView : list) {
				if (!Validator.equals(corporationId,
							corporationView.getCorporationId()) ||
						(inspectorId != corporationView.getInspectorId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(inspectorId);

				if (!pagination) {
					list = (List<CorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationView>(list);
				}
				else {
					list = (List<CorporationView>)QueryUtil.list(q,
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
	 * Returns the first corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByInspectorIdCorporationId_First(
		String corporationId, long inspectorId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByInspectorIdCorporationId_First(corporationId,
				inspectorId, orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByInspectorIdCorporationId_First(
		String corporationId, long inspectorId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CorporationView> list = findByInspectorIdCorporationId(corporationId,
				inspectorId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByInspectorIdCorporationId_Last(
		String corporationId, long inspectorId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByInspectorIdCorporationId_Last(corporationId,
				inspectorId, orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", inspectorId=");
		msg.append(inspectorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByInspectorIdCorporationId_Last(
		String corporationId, long inspectorId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInspectorIdCorporationId(corporationId, inspectorId);

		if (count == 0) {
			return null;
		}

		List<CorporationView> list = findByInspectorIdCorporationId(corporationId,
				inspectorId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporation views before and after the current corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param id the primary key of the current corporation view
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView[] findByInspectorIdCorporationId_PrevAndNext(
		long id, String corporationId, long inspectorId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CorporationView[] array = new CorporationViewImpl[3];

			array[0] = getByInspectorIdCorporationId_PrevAndNext(session,
					corporationView, corporationId, inspectorId,
					orderByComparator, true);

			array[1] = corporationView;

			array[2] = getByInspectorIdCorporationId_PrevAndNext(session,
					corporationView, corporationId, inspectorId,
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

	protected CorporationView getByInspectorIdCorporationId_PrevAndNext(
		Session session, CorporationView corporationView, String corporationId,
		long inspectorId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

		boolean bindCorporationId = false;

		if (corporationId == null) {
			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1);
		}
		else if (corporationId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3);
		}
		else {
			bindCorporationId = true;

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2);
		}

		query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2);

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
			query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		qPos.add(inspectorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporation views where corporationId = &#63; and inspectorId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectorIdCorporationId(String corporationId,
		long inspectorId) throws SystemException {
		for (CorporationView corporationView : findByInspectorIdCorporationId(
				corporationId, inspectorId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(corporationView);
		}
	}

	/**
	 * Returns the number of corporation views where corporationId = &#63; and inspectorId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param inspectorId the inspector ID
	 * @return the number of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorIdCorporationId(String corporationId,
		long inspectorId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId, inspectorId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(inspectorId);

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

	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_1 =
		"corporationView.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_2 =
		"corporationView.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_CORPORATIONID_3 =
		"(corporationView.corporationId IS NULL OR corporationView.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONID_INSPECTORID_2 =
		"corporationView.inspectorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISLEADER = new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIsLeader",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIsLeader",
			new String[] { Integer.class.getName() },
			CorporationViewModelImpl.ISLEADER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISLEADER = new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIsLeader",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the corporation views where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @return the matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByIsLeader(int isLeader)
		throws SystemException {
		return findByIsLeader(isLeader, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the corporation views where isLeader = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isLeader the is leader
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @return the range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByIsLeader(int isLeader, int start, int end)
		throws SystemException {
		return findByIsLeader(isLeader, start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation views where isLeader = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isLeader the is leader
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findByIsLeader(int isLeader, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER;
			finderArgs = new Object[] { isLeader };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISLEADER;
			finderArgs = new Object[] { isLeader, start, end, orderByComparator };
		}

		List<CorporationView> list = (List<CorporationView>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CorporationView corporationView : list) {
				if ((isLeader != corporationView.getIsLeader())) {
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

			query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_ISLEADER_ISLEADER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isLeader);

				if (!pagination) {
					list = (List<CorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationView>(list);
				}
				else {
					list = (List<CorporationView>)QueryUtil.list(q,
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
	 * Returns the first corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByIsLeader_First(int isLeader,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByIsLeader_First(isLeader,
				orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isLeader=");
		msg.append(isLeader);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the first corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByIsLeader_First(int isLeader,
		OrderByComparator orderByComparator) throws SystemException {
		List<CorporationView> list = findByIsLeader(isLeader, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByIsLeader_Last(int isLeader,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByIsLeader_Last(isLeader,
				orderByComparator);

		if (corporationView != null) {
			return corporationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isLeader=");
		msg.append(isLeader);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationViewException(msg.toString());
	}

	/**
	 * Returns the last corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByIsLeader_Last(int isLeader,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByIsLeader(isLeader);

		if (count == 0) {
			return null;
		}

		List<CorporationView> list = findByIsLeader(isLeader, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporation views before and after the current corporation view in the ordered set where isLeader = &#63;.
	 *
	 * @param id the primary key of the current corporation view
	 * @param isLeader the is leader
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView[] findByIsLeader_PrevAndNext(long id, int isLeader,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CorporationView[] array = new CorporationViewImpl[3];

			array[0] = getByIsLeader_PrevAndNext(session, corporationView,
					isLeader, orderByComparator, true);

			array[1] = corporationView;

			array[2] = getByIsLeader_PrevAndNext(session, corporationView,
					isLeader, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CorporationView getByIsLeader_PrevAndNext(Session session,
		CorporationView corporationView, int isLeader,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

		query.append(_FINDER_COLUMN_ISLEADER_ISLEADER_2);

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
			query.append(CorporationViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isLeader);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporationView);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CorporationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporation views where isLeader = &#63; from the database.
	 *
	 * @param isLeader the is leader
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByIsLeader(int isLeader) throws SystemException {
		for (CorporationView corporationView : findByIsLeader(isLeader,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(corporationView);
		}
	}

	/**
	 * Returns the number of corporation views where isLeader = &#63;.
	 *
	 * @param isLeader the is leader
	 * @return the number of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIsLeader(int isLeader) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISLEADER;

		Object[] finderArgs = new Object[] { isLeader };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_ISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isLeader);

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

	private static final String _FINDER_COLUMN_ISLEADER_ISLEADER_2 = "corporationView.isLeader = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectorIdCorporationIdIsLeader",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			CorporationViewModelImpl.INSPECTORID_COLUMN_BITMASK |
			CorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK |
			CorporationViewModelImpl.ISLEADER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorIdCorporationIdIsLeader",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException} if it could not be found.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByInspectorIdCorporationIdIsLeader(inspectorId,
				corporationId, isLeader);

		if (corporationView == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectorId=");
			msg.append(inspectorId);

			msg.append(", corporationId=");
			msg.append(corporationId);

			msg.append(", isLeader=");
			msg.append(isLeader);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCorporationViewException(msg.toString());
		}

		return corporationView;
	}

	/**
	 * Returns the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader)
		throws SystemException {
		return fetchByInspectorIdCorporationIdIsLeader(inspectorId,
			corporationId, isLeader, true);
	}

	/**
	 * Returns the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { inspectorId, corporationId, isLeader };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
					finderArgs, this);
		}

		if (result instanceof CorporationView) {
			CorporationView corporationView = (CorporationView)result;

			if ((inspectorId != corporationView.getInspectorId()) ||
					!Validator.equals(corporationId,
						corporationView.getCorporationId()) ||
					(isLeader != corporationView.getIsLeader())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_INSPECTORID_2);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

				List<CorporationView> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CorporationViewPersistenceImpl.fetchByInspectorIdCorporationIdIsLeader(long, String, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CorporationView corporationView = list.get(0);

					result = corporationView;

					cacheResult(corporationView);

					if ((corporationView.getInspectorId() != inspectorId) ||
							(corporationView.getCorporationId() == null) ||
							!corporationView.getCorporationId()
												.equals(corporationId) ||
							(corporationView.getIsLeader() != isLeader)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
							finderArgs, corporationView);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CorporationView)result;
		}
	}

	/**
	 * Removes the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; from the database.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the corporation view that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView removeByInspectorIdCorporationIdIsLeader(
		long inspectorId, String corporationId, int isLeader)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = findByInspectorIdCorporationIdIsLeader(inspectorId,
				corporationId, isLeader);

		return remove(corporationView);
	}

	/**
	 * Returns the number of corporation views where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the number of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorIdCorporationIdIsLeader(long inspectorId,
		String corporationId, int isLeader) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER;

		Object[] finderArgs = new Object[] { inspectorId, corporationId, isLeader };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CORPORATIONVIEW_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_INSPECTORID_2);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

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

	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_INSPECTORID_2 =
		"corporationView.inspectorId = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_1 =
		"corporationView.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_2 =
		"corporationView.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_CORPORATIONID_3 =
		"(corporationView.corporationId IS NULL OR corporationView.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORIDCORPORATIONIDISLEADER_ISLEADER_2 =
		"corporationView.isLeader = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED,
			CorporationViewImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCorporationIdAndIsLeader",
			new String[] { String.class.getName(), Integer.class.getName() },
			CorporationViewModelImpl.CORPORATIONID_COLUMN_BITMASK |
			CorporationViewModelImpl.ISLEADER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER =
		new FinderPath(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCorporationIdAndIsLeader",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns the corporation view where corporationId = &#63; and isLeader = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException} if it could not be found.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByCorporationIdAndIsLeader(
		String corporationId, int isLeader)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByCorporationIdAndIsLeader(corporationId,
				isLeader);

		if (corporationView == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("corporationId=");
			msg.append(corporationId);

			msg.append(", isLeader=");
			msg.append(isLeader);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCorporationViewException(msg.toString());
		}

		return corporationView;
	}

	/**
	 * Returns the corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByCorporationIdAndIsLeader(
		String corporationId, int isLeader) throws SystemException {
		return fetchByCorporationIdAndIsLeader(corporationId, isLeader, true);
	}

	/**
	 * Returns the corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByCorporationIdAndIsLeader(
		String corporationId, int isLeader, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { corporationId, isLeader };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
					finderArgs, this);
		}

		if (result instanceof CorporationView) {
			CorporationView corporationView = (CorporationView)result;

			if (!Validator.equals(corporationId,
						corporationView.getCorporationId()) ||
					(isLeader != corporationView.getIsLeader())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

				List<CorporationView> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CorporationViewPersistenceImpl.fetchByCorporationIdAndIsLeader(String, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CorporationView corporationView = list.get(0);

					result = corporationView;

					cacheResult(corporationView);

					if ((corporationView.getCorporationId() == null) ||
							!corporationView.getCorporationId()
												.equals(corporationId) ||
							(corporationView.getIsLeader() != isLeader)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
							finderArgs, corporationView);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CorporationView)result;
		}
	}

	/**
	 * Removes the corporation view where corporationId = &#63; and isLeader = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the corporation view that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView removeByCorporationIdAndIsLeader(
		String corporationId, int isLeader)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = findByCorporationIdAndIsLeader(corporationId,
				isLeader);

		return remove(corporationView);
	}

	/**
	 * Returns the number of corporation views where corporationId = &#63; and isLeader = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param isLeader the is leader
	 * @return the number of matching corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCorporationIdAndIsLeader(String corporationId,
		int isLeader) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER;

		Object[] finderArgs = new Object[] { corporationId, isLeader };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CORPORATIONVIEW_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_CORPORATIONIDANDISLEADER_ISLEADER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(isLeader);

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

	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_1 =
		"corporationView.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_2 =
		"corporationView.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_CORPORATIONID_3 =
		"(corporationView.corporationId IS NULL OR corporationView.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDISLEADER_ISLEADER_2 =
		"corporationView.isLeader = ?";

	public CorporationViewPersistenceImpl() {
		setModelClass(CorporationView.class);
	}

	/**
	 * Caches the corporation view in the entity cache if it is enabled.
	 *
	 * @param corporationView the corporation view
	 */
	@Override
	public void cacheResult(CorporationView corporationView) {
		EntityCacheUtil.putResult(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewImpl.class, corporationView.getPrimaryKey(),
			corporationView);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
			new Object[] {
				corporationView.getInspectorId(),
				corporationView.getCorporationId(),
				corporationView.getIsLeader()
			}, corporationView);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
			new Object[] {
				corporationView.getCorporationId(),
				corporationView.getIsLeader()
			}, corporationView);

		corporationView.resetOriginalValues();
	}

	/**
	 * Caches the corporation views in the entity cache if it is enabled.
	 *
	 * @param corporationViews the corporation views
	 */
	@Override
	public void cacheResult(List<CorporationView> corporationViews) {
		for (CorporationView corporationView : corporationViews) {
			if (EntityCacheUtil.getResult(
						CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
						CorporationViewImpl.class,
						corporationView.getPrimaryKey()) == null) {
				cacheResult(corporationView);
			}
			else {
				corporationView.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all corporation views.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CorporationViewImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CorporationViewImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the corporation view.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CorporationView corporationView) {
		EntityCacheUtil.removeResult(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewImpl.class, corporationView.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(corporationView);
	}

	@Override
	public void clearCache(List<CorporationView> corporationViews) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CorporationView corporationView : corporationViews) {
			EntityCacheUtil.removeResult(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
				CorporationViewImpl.class, corporationView.getPrimaryKey());

			clearUniqueFindersCache(corporationView);
		}
	}

	protected void cacheUniqueFindersCache(CorporationView corporationView) {
		if (corporationView.isNew()) {
			Object[] args = new Object[] {
					corporationView.getInspectorId(),
					corporationView.getCorporationId(),
					corporationView.getIsLeader()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args, corporationView);

			args = new Object[] {
					corporationView.getCorporationId(),
					corporationView.getIsLeader()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
				args, corporationView);
		}
		else {
			CorporationViewModelImpl corporationViewModelImpl = (CorporationViewModelImpl)corporationView;

			if ((corporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationView.getInspectorId(),
						corporationView.getCorporationId(),
						corporationView.getIsLeader()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
					args, corporationView);
			}

			if ((corporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationView.getCorporationId(),
						corporationView.getIsLeader()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
					args, corporationView);
			}
		}
	}

	protected void clearUniqueFindersCache(CorporationView corporationView) {
		CorporationViewModelImpl corporationViewModelImpl = (CorporationViewModelImpl)corporationView;

		Object[] args = new Object[] {
				corporationView.getInspectorId(),
				corporationView.getCorporationId(),
				corporationView.getIsLeader()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
			args);

		if ((corporationViewModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER.getColumnBitmask()) != 0) {
			args = new Object[] {
					corporationViewModelImpl.getOriginalInspectorId(),
					corporationViewModelImpl.getOriginalCorporationId(),
					corporationViewModelImpl.getOriginalIsLeader()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTORIDCORPORATIONIDISLEADER,
				args);
		}

		args = new Object[] {
				corporationView.getCorporationId(),
				corporationView.getIsLeader()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
			args);

		if ((corporationViewModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER.getColumnBitmask()) != 0) {
			args = new Object[] {
					corporationViewModelImpl.getOriginalCorporationId(),
					corporationViewModelImpl.getOriginalIsLeader()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDISLEADER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONIDANDISLEADER,
				args);
		}
	}

	/**
	 * Creates a new corporation view with the primary key. Does not add the corporation view to the database.
	 *
	 * @param id the primary key for the new corporation view
	 * @return the new corporation view
	 */
	@Override
	public CorporationView create(long id) {
		CorporationView corporationView = new CorporationViewImpl();

		corporationView.setNew(true);
		corporationView.setPrimaryKey(id);

		return corporationView;
	}

	/**
	 * Removes the corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the corporation view
	 * @return the corporation view that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView remove(long id)
		throws NoSuchCorporationViewException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the corporation view
	 * @return the corporation view that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView remove(Serializable primaryKey)
		throws NoSuchCorporationViewException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CorporationView corporationView = (CorporationView)session.get(CorporationViewImpl.class,
					primaryKey);

			if (corporationView == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCorporationViewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(corporationView);
		}
		catch (NoSuchCorporationViewException nsee) {
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
	protected CorporationView removeImpl(CorporationView corporationView)
		throws SystemException {
		corporationView = toUnwrappedModel(corporationView);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(corporationView)) {
				corporationView = (CorporationView)session.get(CorporationViewImpl.class,
						corporationView.getPrimaryKeyObj());
			}

			if (corporationView != null) {
				session.delete(corporationView);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (corporationView != null) {
			clearCache(corporationView);
		}

		return corporationView;
	}

	@Override
	public CorporationView updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView corporationView)
		throws SystemException {
		corporationView = toUnwrappedModel(corporationView);

		boolean isNew = corporationView.isNew();

		CorporationViewModelImpl corporationViewModelImpl = (CorporationViewModelImpl)corporationView;

		Session session = null;

		try {
			session = openSession();

			if (corporationView.isNew()) {
				session.save(corporationView);

				corporationView.setNew(false);
			}
			else {
				session.merge(corporationView);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CorporationViewModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((corporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationViewModelImpl.getOriginalInspectorId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);

				args = new Object[] { corporationViewModelImpl.getInspectorId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);
			}

			if ((corporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationViewModelImpl.getOriginalCorporationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] { corporationViewModelImpl.getCorporationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((corporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationViewModelImpl.getOriginalCorporationId(),
						corporationViewModelImpl.getOriginalInspectorId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID,
					args);

				args = new Object[] {
						corporationViewModelImpl.getCorporationId(),
						corporationViewModelImpl.getInspectorId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORIDCORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORIDCORPORATIONID,
					args);
			}

			if ((corporationViewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationViewModelImpl.getOriginalIsLeader()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISLEADER, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER,
					args);

				args = new Object[] { corporationViewModelImpl.getIsLeader() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISLEADER, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISLEADER,
					args);
			}
		}

		EntityCacheUtil.putResult(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
			CorporationViewImpl.class, corporationView.getPrimaryKey(),
			corporationView);

		clearUniqueFindersCache(corporationView);
		cacheUniqueFindersCache(corporationView);

		return corporationView;
	}

	protected CorporationView toUnwrappedModel(CorporationView corporationView) {
		if (corporationView instanceof CorporationViewImpl) {
			return corporationView;
		}

		CorporationViewImpl corporationViewImpl = new CorporationViewImpl();

		corporationViewImpl.setNew(corporationView.isNew());
		corporationViewImpl.setPrimaryKey(corporationView.getPrimaryKey());

		corporationViewImpl.setId(corporationView.getId());
		corporationViewImpl.setCorporationId(corporationView.getCorporationId());
		corporationViewImpl.setCorporationName(corporationView.getCorporationName());
		corporationViewImpl.setInspectorId(corporationView.getInspectorId());
		corporationViewImpl.setIsLeader(corporationView.getIsLeader());
		corporationViewImpl.setSynchdate(corporationView.getSynchdate());

		return corporationViewImpl;
	}

	/**
	 * Returns the corporation view with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporation view
	 * @return the corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCorporationViewException, SystemException {
		CorporationView corporationView = fetchByPrimaryKey(primaryKey);

		if (corporationView == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCorporationViewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return corporationView;
	}

	/**
	 * Returns the corporation view with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException} if it could not be found.
	 *
	 * @param id the primary key of the corporation view
	 * @return the corporation view
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView findByPrimaryKey(long id)
		throws NoSuchCorporationViewException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the corporation view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporation view
	 * @return the corporation view, or <code>null</code> if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CorporationView corporationView = (CorporationView)EntityCacheUtil.getResult(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
				CorporationViewImpl.class, primaryKey);

		if (corporationView == _nullCorporationView) {
			return null;
		}

		if (corporationView == null) {
			Session session = null;

			try {
				session = openSession();

				corporationView = (CorporationView)session.get(CorporationViewImpl.class,
						primaryKey);

				if (corporationView != null) {
					cacheResult(corporationView);
				}
				else {
					EntityCacheUtil.putResult(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
						CorporationViewImpl.class, primaryKey,
						_nullCorporationView);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CorporationViewModelImpl.ENTITY_CACHE_ENABLED,
					CorporationViewImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return corporationView;
	}

	/**
	 * Returns the corporation view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the corporation view
	 * @return the corporation view, or <code>null</code> if a corporation view with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationView fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the corporation views.
	 *
	 * @return the corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @return the range of corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporation views
	 * @param end the upper bound of the range of corporation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of corporation views
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationView> findAll(int start, int end,
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

		List<CorporationView> list = (List<CorporationView>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CORPORATIONVIEW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CORPORATIONVIEW;

				if (pagination) {
					sql = sql.concat(CorporationViewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CorporationView>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationView>(list);
				}
				else {
					list = (List<CorporationView>)QueryUtil.list(q,
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
	 * Removes all the corporation views from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CorporationView corporationView : findAll()) {
			remove(corporationView);
		}
	}

	/**
	 * Returns the number of corporation views.
	 *
	 * @return the number of corporation views
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

				Query q = session.createQuery(_SQL_COUNT_CORPORATIONVIEW);

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
	 * Initializes the corporation view persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CorporationView>> listenersList = new ArrayList<ModelListener<CorporationView>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CorporationView>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CorporationViewImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CORPORATIONVIEW = "SELECT corporationView FROM CorporationView corporationView";
	private static final String _SQL_SELECT_CORPORATIONVIEW_WHERE = "SELECT corporationView FROM CorporationView corporationView WHERE ";
	private static final String _SQL_COUNT_CORPORATIONVIEW = "SELECT COUNT(corporationView) FROM CorporationView corporationView";
	private static final String _SQL_COUNT_CORPORATIONVIEW_WHERE = "SELECT COUNT(corporationView) FROM CorporationView corporationView WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "corporationView.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CorporationView exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CorporationView exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CorporationViewPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"corporationId", "corporationName", "inspectorId", "isLeader"
			});
	private static CorporationView _nullCorporationView = new CorporationViewImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CorporationView> toCacheModel() {
				return _nullCorporationViewCacheModel;
			}
		};

	private static CacheModel<CorporationView> _nullCorporationViewCacheModel = new CacheModel<CorporationView>() {
			@Override
			public CorporationView toEntityModel() {
				return _nullCorporationView;
			}
		};
}