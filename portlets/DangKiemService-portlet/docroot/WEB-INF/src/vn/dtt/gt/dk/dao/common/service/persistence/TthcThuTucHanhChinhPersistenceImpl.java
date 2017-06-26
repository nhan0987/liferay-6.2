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

package vn.dtt.gt.dk.dao.common.service.persistence;

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

import vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc thu tuc hanh chinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see TthcThuTucHanhChinhPersistence
 * @see TthcThuTucHanhChinhUtil
 * @generated
 */
public class TthcThuTucHanhChinhPersistenceImpl extends BasePersistenceImpl<TthcThuTucHanhChinh>
	implements TthcThuTucHanhChinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcThuTucHanhChinhUtil} to access the tthc thu tuc hanh chinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcThuTucHanhChinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LINHVUCTHUTUCID =
		new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLinhVucThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCTHUTUCID =
		new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLinhVucThuTucId",
			new String[] { Long.class.getName() },
			TthcThuTucHanhChinhModelImpl.LINHVUCTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LINHVUCTHUTUCID = new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLinhVucThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @return the matching tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThuTucHanhChinh> findByLinhVucThuTucId(long linhVucThuTucId)
		throws SystemException {
		return findByLinhVucThuTucId(linhVucThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @param start the lower bound of the range of tthc thu tuc hanh chinhs
	 * @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	 * @return the range of matching tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThuTucHanhChinh> findByLinhVucThuTucId(
		long linhVucThuTucId, int start, int end) throws SystemException {
		return findByLinhVucThuTucId(linhVucThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @param start the lower bound of the range of tthc thu tuc hanh chinhs
	 * @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThuTucHanhChinh> findByLinhVucThuTucId(
		long linhVucThuTucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCTHUTUCID;
			finderArgs = new Object[] { linhVucThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LINHVUCTHUTUCID;
			finderArgs = new Object[] {
					linhVucThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<TthcThuTucHanhChinh> list = (List<TthcThuTucHanhChinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcThuTucHanhChinh tthcThuTucHanhChinh : list) {
				if ((linhVucThuTucId != tthcThuTucHanhChinh.getLinhVucThuTucId())) {
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

			query.append(_SQL_SELECT_TTHCTHUTUCHANHCHINH_WHERE);

			query.append(_FINDER_COLUMN_LINHVUCTHUTUCID_LINHVUCTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcThuTucHanhChinhModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(linhVucThuTucId);

				if (!pagination) {
					list = (List<TthcThuTucHanhChinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcThuTucHanhChinh>(list);
				}
				else {
					list = (List<TthcThuTucHanhChinh>)QueryUtil.list(q,
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
	 * Returns the first tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc thu tuc hanh chinh
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a matching tthc thu tuc hanh chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh findByLinhVucThuTucId_First(
		long linhVucThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = fetchByLinhVucThuTucId_First(linhVucThuTucId,
				orderByComparator);

		if (tthcThuTucHanhChinh != null) {
			return tthcThuTucHanhChinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linhVucThuTucId=");
		msg.append(linhVucThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcThuTucHanhChinhException(msg.toString());
	}

	/**
	 * Returns the first tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh fetchByLinhVucThuTucId_First(
		long linhVucThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcThuTucHanhChinh> list = findByLinhVucThuTucId(linhVucThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc thu tuc hanh chinh
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a matching tthc thu tuc hanh chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh findByLinhVucThuTucId_Last(
		long linhVucThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = fetchByLinhVucThuTucId_Last(linhVucThuTucId,
				orderByComparator);

		if (tthcThuTucHanhChinh != null) {
			return tthcThuTucHanhChinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linhVucThuTucId=");
		msg.append(linhVucThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcThuTucHanhChinhException(msg.toString());
	}

	/**
	 * Returns the last tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh fetchByLinhVucThuTucId_Last(
		long linhVucThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByLinhVucThuTucId(linhVucThuTucId);

		if (count == 0) {
			return null;
		}

		List<TthcThuTucHanhChinh> list = findByLinhVucThuTucId(linhVucThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc thu tuc hanh chinhs before and after the current tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	 *
	 * @param Id the primary key of the current tthc thu tuc hanh chinh
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc thu tuc hanh chinh
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh[] findByLinhVucThuTucId_PrevAndNext(long Id,
		long linhVucThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			TthcThuTucHanhChinh[] array = new TthcThuTucHanhChinhImpl[3];

			array[0] = getByLinhVucThuTucId_PrevAndNext(session,
					tthcThuTucHanhChinh, linhVucThuTucId, orderByComparator,
					true);

			array[1] = tthcThuTucHanhChinh;

			array[2] = getByLinhVucThuTucId_PrevAndNext(session,
					tthcThuTucHanhChinh, linhVucThuTucId, orderByComparator,
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

	protected TthcThuTucHanhChinh getByLinhVucThuTucId_PrevAndNext(
		Session session, TthcThuTucHanhChinh tthcThuTucHanhChinh,
		long linhVucThuTucId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCTHUTUCHANHCHINH_WHERE);

		query.append(_FINDER_COLUMN_LINHVUCTHUTUCID_LINHVUCTHUTUCID_2);

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
			query.append(TthcThuTucHanhChinhModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(linhVucThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcThuTucHanhChinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcThuTucHanhChinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63; from the database.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLinhVucThuTucId(long linhVucThuTucId)
		throws SystemException {
		for (TthcThuTucHanhChinh tthcThuTucHanhChinh : findByLinhVucThuTucId(
				linhVucThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcThuTucHanhChinh);
		}
	}

	/**
	 * Returns the number of tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	 *
	 * @param linhVucThuTucId the linh vuc thu tuc ID
	 * @return the number of matching tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLinhVucThuTucId(long linhVucThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LINHVUCTHUTUCID;

		Object[] finderArgs = new Object[] { linhVucThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCTHUTUCHANHCHINH_WHERE);

			query.append(_FINDER_COLUMN_LINHVUCTHUTUCID_LINHVUCTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(linhVucThuTucId);

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

	private static final String _FINDER_COLUMN_LINHVUCTHUTUCID_LINHVUCTHUTUCID_2 =
		"tthcThuTucHanhChinh.linhVucThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MATHUTUC = new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaThuTuc", new String[] { String.class.getName() },
			TthcThuTucHanhChinhModelImpl.MATHUTUC_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATHUTUC = new FinderPath(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaThuTuc",
			new String[] { String.class.getName() });

	/**
	 * Returns the tthc thu tuc hanh chinh where maThuTuc = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException} if it could not be found.
	 *
	 * @param maThuTuc the ma thu tuc
	 * @return the matching tthc thu tuc hanh chinh
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a matching tthc thu tuc hanh chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh findByMaThuTuc(String maThuTuc)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = fetchByMaThuTuc(maThuTuc);

		if (tthcThuTucHanhChinh == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maThuTuc=");
			msg.append(maThuTuc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcThuTucHanhChinhException(msg.toString());
		}

		return tthcThuTucHanhChinh;
	}

	/**
	 * Returns the tthc thu tuc hanh chinh where maThuTuc = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maThuTuc the ma thu tuc
	 * @return the matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh fetchByMaThuTuc(String maThuTuc)
		throws SystemException {
		return fetchByMaThuTuc(maThuTuc, true);
	}

	/**
	 * Returns the tthc thu tuc hanh chinh where maThuTuc = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maThuTuc the ma thu tuc
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh fetchByMaThuTuc(String maThuTuc,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maThuTuc };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATHUTUC,
					finderArgs, this);
		}

		if (result instanceof TthcThuTucHanhChinh) {
			TthcThuTucHanhChinh tthcThuTucHanhChinh = (TthcThuTucHanhChinh)result;

			if (!Validator.equals(maThuTuc, tthcThuTucHanhChinh.getMaThuTuc())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCTHUTUCHANHCHINH_WHERE);

			boolean bindMaThuTuc = false;

			if (maThuTuc == null) {
				query.append(_FINDER_COLUMN_MATHUTUC_MATHUTUC_1);
			}
			else if (maThuTuc.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATHUTUC_MATHUTUC_3);
			}
			else {
				bindMaThuTuc = true;

				query.append(_FINDER_COLUMN_MATHUTUC_MATHUTUC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaThuTuc) {
					qPos.add(maThuTuc);
				}

				List<TthcThuTucHanhChinh> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATHUTUC,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcThuTucHanhChinhPersistenceImpl.fetchByMaThuTuc(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcThuTucHanhChinh tthcThuTucHanhChinh = list.get(0);

					result = tthcThuTucHanhChinh;

					cacheResult(tthcThuTucHanhChinh);

					if ((tthcThuTucHanhChinh.getMaThuTuc() == null) ||
							!tthcThuTucHanhChinh.getMaThuTuc().equals(maThuTuc)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATHUTUC,
							finderArgs, tthcThuTucHanhChinh);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATHUTUC,
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
			return (TthcThuTucHanhChinh)result;
		}
	}

	/**
	 * Removes the tthc thu tuc hanh chinh where maThuTuc = &#63; from the database.
	 *
	 * @param maThuTuc the ma thu tuc
	 * @return the tthc thu tuc hanh chinh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh removeByMaThuTuc(String maThuTuc)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = findByMaThuTuc(maThuTuc);

		return remove(tthcThuTucHanhChinh);
	}

	/**
	 * Returns the number of tthc thu tuc hanh chinhs where maThuTuc = &#63;.
	 *
	 * @param maThuTuc the ma thu tuc
	 * @return the number of matching tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaThuTuc(String maThuTuc) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATHUTUC;

		Object[] finderArgs = new Object[] { maThuTuc };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCTHUTUCHANHCHINH_WHERE);

			boolean bindMaThuTuc = false;

			if (maThuTuc == null) {
				query.append(_FINDER_COLUMN_MATHUTUC_MATHUTUC_1);
			}
			else if (maThuTuc.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATHUTUC_MATHUTUC_3);
			}
			else {
				bindMaThuTuc = true;

				query.append(_FINDER_COLUMN_MATHUTUC_MATHUTUC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaThuTuc) {
					qPos.add(maThuTuc);
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

	private static final String _FINDER_COLUMN_MATHUTUC_MATHUTUC_1 = "tthcThuTucHanhChinh.maThuTuc IS NULL";
	private static final String _FINDER_COLUMN_MATHUTUC_MATHUTUC_2 = "tthcThuTucHanhChinh.maThuTuc = ?";
	private static final String _FINDER_COLUMN_MATHUTUC_MATHUTUC_3 = "(tthcThuTucHanhChinh.maThuTuc IS NULL OR tthcThuTucHanhChinh.maThuTuc = '')";

	public TthcThuTucHanhChinhPersistenceImpl() {
		setModelClass(TthcThuTucHanhChinh.class);
	}

	/**
	 * Caches the tthc thu tuc hanh chinh in the entity cache if it is enabled.
	 *
	 * @param tthcThuTucHanhChinh the tthc thu tuc hanh chinh
	 */
	@Override
	public void cacheResult(TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		EntityCacheUtil.putResult(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class, tthcThuTucHanhChinh.getPrimaryKey(),
			tthcThuTucHanhChinh);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATHUTUC,
			new Object[] { tthcThuTucHanhChinh.getMaThuTuc() },
			tthcThuTucHanhChinh);

		tthcThuTucHanhChinh.resetOriginalValues();
	}

	/**
	 * Caches the tthc thu tuc hanh chinhs in the entity cache if it is enabled.
	 *
	 * @param tthcThuTucHanhChinhs the tthc thu tuc hanh chinhs
	 */
	@Override
	public void cacheResult(List<TthcThuTucHanhChinh> tthcThuTucHanhChinhs) {
		for (TthcThuTucHanhChinh tthcThuTucHanhChinh : tthcThuTucHanhChinhs) {
			if (EntityCacheUtil.getResult(
						TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
						TthcThuTucHanhChinhImpl.class,
						tthcThuTucHanhChinh.getPrimaryKey()) == null) {
				cacheResult(tthcThuTucHanhChinh);
			}
			else {
				tthcThuTucHanhChinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc thu tuc hanh chinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcThuTucHanhChinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcThuTucHanhChinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc thu tuc hanh chinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		EntityCacheUtil.removeResult(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class, tthcThuTucHanhChinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcThuTucHanhChinh);
	}

	@Override
	public void clearCache(List<TthcThuTucHanhChinh> tthcThuTucHanhChinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcThuTucHanhChinh tthcThuTucHanhChinh : tthcThuTucHanhChinhs) {
			EntityCacheUtil.removeResult(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
				TthcThuTucHanhChinhImpl.class,
				tthcThuTucHanhChinh.getPrimaryKey());

			clearUniqueFindersCache(tthcThuTucHanhChinh);
		}
	}

	protected void cacheUniqueFindersCache(
		TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		if (tthcThuTucHanhChinh.isNew()) {
			Object[] args = new Object[] { tthcThuTucHanhChinh.getMaThuTuc() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATHUTUC, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATHUTUC, args,
				tthcThuTucHanhChinh);
		}
		else {
			TthcThuTucHanhChinhModelImpl tthcThuTucHanhChinhModelImpl = (TthcThuTucHanhChinhModelImpl)tthcThuTucHanhChinh;

			if ((tthcThuTucHanhChinhModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATHUTUC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tthcThuTucHanhChinh.getMaThuTuc() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATHUTUC, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATHUTUC, args,
					tthcThuTucHanhChinh);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		TthcThuTucHanhChinhModelImpl tthcThuTucHanhChinhModelImpl = (TthcThuTucHanhChinhModelImpl)tthcThuTucHanhChinh;

		Object[] args = new Object[] { tthcThuTucHanhChinh.getMaThuTuc() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATHUTUC, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATHUTUC, args);

		if ((tthcThuTucHanhChinhModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATHUTUC.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcThuTucHanhChinhModelImpl.getOriginalMaThuTuc()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATHUTUC, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATHUTUC, args);
		}
	}

	/**
	 * Creates a new tthc thu tuc hanh chinh with the primary key. Does not add the tthc thu tuc hanh chinh to the database.
	 *
	 * @param Id the primary key for the new tthc thu tuc hanh chinh
	 * @return the new tthc thu tuc hanh chinh
	 */
	@Override
	public TthcThuTucHanhChinh create(long Id) {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = new TthcThuTucHanhChinhImpl();

		tthcThuTucHanhChinh.setNew(true);
		tthcThuTucHanhChinh.setPrimaryKey(Id);

		return tthcThuTucHanhChinh;
	}

	/**
	 * Removes the tthc thu tuc hanh chinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tthc thu tuc hanh chinh
	 * @return the tthc thu tuc hanh chinh that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh remove(long Id)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tthc thu tuc hanh chinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc thu tuc hanh chinh
	 * @return the tthc thu tuc hanh chinh that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh remove(Serializable primaryKey)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcThuTucHanhChinh tthcThuTucHanhChinh = (TthcThuTucHanhChinh)session.get(TthcThuTucHanhChinhImpl.class,
					primaryKey);

			if (tthcThuTucHanhChinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcThuTucHanhChinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcThuTucHanhChinh);
		}
		catch (NoSuchTthcThuTucHanhChinhException nsee) {
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
	protected TthcThuTucHanhChinh removeImpl(
		TthcThuTucHanhChinh tthcThuTucHanhChinh) throws SystemException {
		tthcThuTucHanhChinh = toUnwrappedModel(tthcThuTucHanhChinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcThuTucHanhChinh)) {
				tthcThuTucHanhChinh = (TthcThuTucHanhChinh)session.get(TthcThuTucHanhChinhImpl.class,
						tthcThuTucHanhChinh.getPrimaryKeyObj());
			}

			if (tthcThuTucHanhChinh != null) {
				session.delete(tthcThuTucHanhChinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcThuTucHanhChinh != null) {
			clearCache(tthcThuTucHanhChinh);
		}

		return tthcThuTucHanhChinh;
	}

	@Override
	public TthcThuTucHanhChinh updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh tthcThuTucHanhChinh)
		throws SystemException {
		tthcThuTucHanhChinh = toUnwrappedModel(tthcThuTucHanhChinh);

		boolean isNew = tthcThuTucHanhChinh.isNew();

		TthcThuTucHanhChinhModelImpl tthcThuTucHanhChinhModelImpl = (TthcThuTucHanhChinhModelImpl)tthcThuTucHanhChinh;

		Session session = null;

		try {
			session = openSession();

			if (tthcThuTucHanhChinh.isNew()) {
				session.save(tthcThuTucHanhChinh);

				tthcThuTucHanhChinh.setNew(false);
			}
			else {
				session.merge(tthcThuTucHanhChinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcThuTucHanhChinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcThuTucHanhChinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcThuTucHanhChinhModelImpl.getOriginalLinhVucThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LINHVUCTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCTHUTUCID,
					args);

				args = new Object[] {
						tthcThuTucHanhChinhModelImpl.getLinhVucThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LINHVUCTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINHVUCTHUTUCID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
			TthcThuTucHanhChinhImpl.class, tthcThuTucHanhChinh.getPrimaryKey(),
			tthcThuTucHanhChinh);

		clearUniqueFindersCache(tthcThuTucHanhChinh);
		cacheUniqueFindersCache(tthcThuTucHanhChinh);

		return tthcThuTucHanhChinh;
	}

	protected TthcThuTucHanhChinh toUnwrappedModel(
		TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		if (tthcThuTucHanhChinh instanceof TthcThuTucHanhChinhImpl) {
			return tthcThuTucHanhChinh;
		}

		TthcThuTucHanhChinhImpl tthcThuTucHanhChinhImpl = new TthcThuTucHanhChinhImpl();

		tthcThuTucHanhChinhImpl.setNew(tthcThuTucHanhChinh.isNew());
		tthcThuTucHanhChinhImpl.setPrimaryKey(tthcThuTucHanhChinh.getPrimaryKey());

		tthcThuTucHanhChinhImpl.setId(tthcThuTucHanhChinh.getId());
		tthcThuTucHanhChinhImpl.setMaThuTuc(tthcThuTucHanhChinh.getMaThuTuc());
		tthcThuTucHanhChinhImpl.setTenThuTuc(tthcThuTucHanhChinh.getTenThuTuc());
		tthcThuTucHanhChinhImpl.setTrinhTuThucHien(tthcThuTucHanhChinh.getTrinhTuThucHien());
		tthcThuTucHanhChinhImpl.setCachThucThucHien(tthcThuTucHanhChinh.getCachThucThucHien());
		tthcThuTucHanhChinhImpl.setThanhPhanHoSo(tthcThuTucHanhChinh.getThanhPhanHoSo());
		tthcThuTucHanhChinhImpl.setDieuKienThucHien(tthcThuTucHanhChinh.getDieuKienThucHien());
		tthcThuTucHanhChinhImpl.setThoiHanGiaiQuyet(tthcThuTucHanhChinh.getThoiHanGiaiQuyet());
		tthcThuTucHanhChinhImpl.setDoiTuongThucHien(tthcThuTucHanhChinh.getDoiTuongThucHien());
		tthcThuTucHanhChinhImpl.setKetQuaXuLy(tthcThuTucHanhChinh.getKetQuaXuLy());
		tthcThuTucHanhChinhImpl.setCanCuPhapLy(tthcThuTucHanhChinh.getCanCuPhapLy());
		tthcThuTucHanhChinhImpl.setLePhi(tthcThuTucHanhChinh.getLePhi());
		tthcThuTucHanhChinhImpl.setCoQuanQlttId(tthcThuTucHanhChinh.getCoQuanQlttId());
		tthcThuTucHanhChinhImpl.setLinhVucThuTucId(tthcThuTucHanhChinh.getLinhVucThuTucId());
		tthcThuTucHanhChinhImpl.setNgayCoHieuLuc(tthcThuTucHanhChinh.getNgayCoHieuLuc());
		tthcThuTucHanhChinhImpl.setNgayHetHieuLuc(tthcThuTucHanhChinh.getNgayHetHieuLuc());
		tthcThuTucHanhChinhImpl.setHuongDanThucHien(tthcThuTucHanhChinh.getHuongDanThucHien());

		return tthcThuTucHanhChinhImpl;
	}

	/**
	 * Returns the tthc thu tuc hanh chinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc thu tuc hanh chinh
	 * @return the tthc thu tuc hanh chinh
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = fetchByPrimaryKey(primaryKey);

		if (tthcThuTucHanhChinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcThuTucHanhChinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcThuTucHanhChinh;
	}

	/**
	 * Returns the tthc thu tuc hanh chinh with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException} if it could not be found.
	 *
	 * @param Id the primary key of the tthc thu tuc hanh chinh
	 * @return the tthc thu tuc hanh chinh
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh findByPrimaryKey(long Id)
		throws NoSuchTthcThuTucHanhChinhException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tthc thu tuc hanh chinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc thu tuc hanh chinh
	 * @return the tthc thu tuc hanh chinh, or <code>null</code> if a tthc thu tuc hanh chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcThuTucHanhChinh tthcThuTucHanhChinh = (TthcThuTucHanhChinh)EntityCacheUtil.getResult(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
				TthcThuTucHanhChinhImpl.class, primaryKey);

		if (tthcThuTucHanhChinh == _nullTthcThuTucHanhChinh) {
			return null;
		}

		if (tthcThuTucHanhChinh == null) {
			Session session = null;

			try {
				session = openSession();

				tthcThuTucHanhChinh = (TthcThuTucHanhChinh)session.get(TthcThuTucHanhChinhImpl.class,
						primaryKey);

				if (tthcThuTucHanhChinh != null) {
					cacheResult(tthcThuTucHanhChinh);
				}
				else {
					EntityCacheUtil.putResult(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
						TthcThuTucHanhChinhImpl.class, primaryKey,
						_nullTthcThuTucHanhChinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcThuTucHanhChinhModelImpl.ENTITY_CACHE_ENABLED,
					TthcThuTucHanhChinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcThuTucHanhChinh;
	}

	/**
	 * Returns the tthc thu tuc hanh chinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tthc thu tuc hanh chinh
	 * @return the tthc thu tuc hanh chinh, or <code>null</code> if a tthc thu tuc hanh chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThuTucHanhChinh fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tthc thu tuc hanh chinhs.
	 *
	 * @return the tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThuTucHanhChinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc thu tuc hanh chinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc thu tuc hanh chinhs
	 * @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	 * @return the range of tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThuTucHanhChinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc thu tuc hanh chinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc thu tuc hanh chinhs
	 * @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc thu tuc hanh chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThuTucHanhChinh> findAll(int start, int end,
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

		List<TthcThuTucHanhChinh> list = (List<TthcThuTucHanhChinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCTHUTUCHANHCHINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCTHUTUCHANHCHINH;

				if (pagination) {
					sql = sql.concat(TthcThuTucHanhChinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcThuTucHanhChinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcThuTucHanhChinh>(list);
				}
				else {
					list = (List<TthcThuTucHanhChinh>)QueryUtil.list(q,
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
	 * Removes all the tthc thu tuc hanh chinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcThuTucHanhChinh tthcThuTucHanhChinh : findAll()) {
			remove(tthcThuTucHanhChinh);
		}
	}

	/**
	 * Returns the number of tthc thu tuc hanh chinhs.
	 *
	 * @return the number of tthc thu tuc hanh chinhs
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

				Query q = session.createQuery(_SQL_COUNT_TTHCTHUTUCHANHCHINH);

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
	 * Initializes the tthc thu tuc hanh chinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcThuTucHanhChinh>> listenersList = new ArrayList<ModelListener<TthcThuTucHanhChinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcThuTucHanhChinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcThuTucHanhChinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCTHUTUCHANHCHINH = "SELECT tthcThuTucHanhChinh FROM TthcThuTucHanhChinh tthcThuTucHanhChinh";
	private static final String _SQL_SELECT_TTHCTHUTUCHANHCHINH_WHERE = "SELECT tthcThuTucHanhChinh FROM TthcThuTucHanhChinh tthcThuTucHanhChinh WHERE ";
	private static final String _SQL_COUNT_TTHCTHUTUCHANHCHINH = "SELECT COUNT(tthcThuTucHanhChinh) FROM TthcThuTucHanhChinh tthcThuTucHanhChinh";
	private static final String _SQL_COUNT_TTHCTHUTUCHANHCHINH_WHERE = "SELECT COUNT(tthcThuTucHanhChinh) FROM TthcThuTucHanhChinh tthcThuTucHanhChinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcThuTucHanhChinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcThuTucHanhChinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcThuTucHanhChinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcThuTucHanhChinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "maThuTuc", "tenThuTuc", "trinhTuThucHien",
				"cachThucThucHien", "thanhPhanHoSo", "dieuKienThucHien",
				"thoiHanGiaiQuyet", "doiTuongThucHien", "ketQuaXuLy",
				"canCuPhapLy", "lePhi", "coQuanQlttId", "linhVucThuTucId",
				"ngayCoHieuLuc", "ngayHetHieuLuc", "huongDanThucHien"
			});
	private static TthcThuTucHanhChinh _nullTthcThuTucHanhChinh = new TthcThuTucHanhChinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcThuTucHanhChinh> toCacheModel() {
				return _nullTthcThuTucHanhChinhCacheModel;
			}
		};

	private static CacheModel<TthcThuTucHanhChinh> _nullTthcThuTucHanhChinhCacheModel =
		new CacheModel<TthcThuTucHanhChinh>() {
			@Override
			public TthcThuTucHanhChinh toEntityModel() {
				return _nullTthcThuTucHanhChinh;
			}
		};
}