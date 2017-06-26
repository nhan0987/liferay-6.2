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

import vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc ke hoach chuyen dich service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcKeHoachChuyenDichPersistence
 * @see TthcKeHoachChuyenDichUtil
 * @generated
 */
public class TthcKeHoachChuyenDichPersistenceImpl extends BasePersistenceImpl<TthcKeHoachChuyenDich>
	implements TthcKeHoachChuyenDichPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcKeHoachChuyenDichUtil} to access the tthc ke hoach chuyen dich persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcKeHoachChuyenDichImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuXuLyChinhId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPhieuXuLyChinhId", new String[] { Long.class.getName() },
			TthcKeHoachChuyenDichModelImpl.PHIEUXULYCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId) throws SystemException {
		return findByPhieuXuLyChinhId(phieuXuLyChinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @return the range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end) throws SystemException {
		return findByPhieuXuLyChinhId(phieuXuLyChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID;
			finderArgs = new Object[] { phieuXuLyChinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHID;
			finderArgs = new Object[] {
					phieuXuLyChinhId,
					
					start, end, orderByComparator
				};
		}

		List<TthcKeHoachChuyenDich> list = (List<TthcKeHoachChuyenDich>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : list) {
				if ((phieuXuLyChinhId != tthcKeHoachChuyenDich.getPhieuXuLyChinhId())) {
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

			query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHID_PHIEUXULYCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				if (!pagination) {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcKeHoachChuyenDich>(list);
				}
				else {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
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
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByPhieuXuLyChinhId_First(phieuXuLyChinhId,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcKeHoachChuyenDich> list = findByPhieuXuLyChinhId(phieuXuLyChinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByPhieuXuLyChinhId_Last(phieuXuLyChinhId,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPhieuXuLyChinhId(phieuXuLyChinhId);

		if (count == 0) {
			return null;
		}

		List<TthcKeHoachChuyenDich> list = findByPhieuXuLyChinhId(phieuXuLyChinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param id the primary key of the current tthc ke hoach chuyen dich
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich[] findByPhieuXuLyChinhId_PrevAndNext(long id,
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcKeHoachChuyenDich[] array = new TthcKeHoachChuyenDichImpl[3];

			array[0] = getByPhieuXuLyChinhId_PrevAndNext(session,
					tthcKeHoachChuyenDich, phieuXuLyChinhId, orderByComparator,
					true);

			array[1] = tthcKeHoachChuyenDich;

			array[2] = getByPhieuXuLyChinhId_PrevAndNext(session,
					tthcKeHoachChuyenDich, phieuXuLyChinhId, orderByComparator,
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

	protected TthcKeHoachChuyenDich getByPhieuXuLyChinhId_PrevAndNext(
		Session session, TthcKeHoachChuyenDich tthcKeHoachChuyenDich,
		long phieuXuLyChinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYCHINHID_PHIEUXULYCHINHID_2);

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
			query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcKeHoachChuyenDich);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcKeHoachChuyenDich> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63; from the database.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws SystemException {
		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : findByPhieuXuLyChinhId(
				phieuXuLyChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcKeHoachChuyenDich);
		}
	}

	/**
	 * Returns the number of tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the number of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID;

		Object[] finderArgs = new Object[] { phieuXuLyChinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCKEHOACHCHUYENDICH_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHID_PHIEUXULYCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYCHINHID_PHIEUXULYCHINHID_2 =
		"tthcKeHoachChuyenDich.phieuXuLyChinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] { Long.class.getName() },
			TthcKeHoachChuyenDichModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYPHUID = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhieuXuLyPhuId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @return the range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end) throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] { phieuXuLyPhuId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] {
					phieuXuLyPhuId,
					
					start, end, orderByComparator
				};
		}

		List<TthcKeHoachChuyenDich> list = (List<TthcKeHoachChuyenDich>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : list) {
				if ((phieuXuLyPhuId != tthcKeHoachChuyenDich.getPhieuXuLyPhuId())) {
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

			query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				if (!pagination) {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcKeHoachChuyenDich>(list);
				}
				else {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
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
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByPhieuXuLyPhuId_First(phieuXuLyPhuId,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcKeHoachChuyenDich> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByPhieuXuLyPhuId_Last(phieuXuLyPhuId,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPhieuXuLyPhuId(phieuXuLyPhuId);

		if (count == 0) {
			return null;
		}

		List<TthcKeHoachChuyenDich> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param id the primary key of the current tthc ke hoach chuyen dich
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich[] findByPhieuXuLyPhuId_PrevAndNext(long id,
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcKeHoachChuyenDich[] array = new TthcKeHoachChuyenDichImpl[3];

			array[0] = getByPhieuXuLyPhuId_PrevAndNext(session,
					tthcKeHoachChuyenDich, phieuXuLyPhuId, orderByComparator,
					true);

			array[1] = tthcKeHoachChuyenDich;

			array[2] = getByPhieuXuLyPhuId_PrevAndNext(session,
					tthcKeHoachChuyenDich, phieuXuLyPhuId, orderByComparator,
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

	protected TthcKeHoachChuyenDich getByPhieuXuLyPhuId_PrevAndNext(
		Session session, TthcKeHoachChuyenDich tthcKeHoachChuyenDich,
		long phieuXuLyPhuId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

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
			query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyPhuId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcKeHoachChuyenDich);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcKeHoachChuyenDich> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : findByPhieuXuLyPhuId(
				phieuXuLyPhuId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcKeHoachChuyenDich);
		}
	}

	/**
	 * Returns the number of tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the number of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYPHUID;

		Object[] finderArgs = new Object[] { phieuXuLyPhuId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCKEHOACHCHUYENDICH_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2 = "tthcKeHoachChuyenDich.phieuXuLyPhuId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMessageId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMessageId",
			new String[] { String.class.getName() },
			TthcKeHoachChuyenDichModelImpl.MESSAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MESSAGEID = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMessageId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tthc ke hoach chuyen dichs where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByMessageId(String messageId)
		throws SystemException {
		return findByMessageId(messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the tthc ke hoach chuyen dichs where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @return the range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByMessageId(String messageId,
		int start, int end) throws SystemException {
		return findByMessageId(messageId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ke hoach chuyen dichs where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByMessageId(String messageId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID;
			finderArgs = new Object[] { messageId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGEID;
			finderArgs = new Object[] { messageId, start, end, orderByComparator };
		}

		List<TthcKeHoachChuyenDich> list = (List<TthcKeHoachChuyenDich>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : list) {
				if (!Validator.equals(messageId,
							tthcKeHoachChuyenDich.getMessageId())) {
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

			query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

			boolean bindMessageId = false;

			if (messageId == null) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_1);
			}
			else if (messageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_3);
			}
			else {
				bindMessageId = true;

				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMessageId) {
					qPos.add(messageId);
				}

				if (!pagination) {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcKeHoachChuyenDich>(list);
				}
				else {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
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
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByMessageId_First(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByMessageId_First(messageId,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByMessageId_First(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcKeHoachChuyenDich> list = findByMessageId(messageId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByMessageId_Last(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByMessageId_Last(messageId,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByMessageId_Last(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMessageId(messageId);

		if (count == 0) {
			return null;
		}

		List<TthcKeHoachChuyenDich> list = findByMessageId(messageId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	 *
	 * @param id the primary key of the current tthc ke hoach chuyen dich
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich[] findByMessageId_PrevAndNext(long id,
		String messageId, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcKeHoachChuyenDich[] array = new TthcKeHoachChuyenDichImpl[3];

			array[0] = getByMessageId_PrevAndNext(session,
					tthcKeHoachChuyenDich, messageId, orderByComparator, true);

			array[1] = tthcKeHoachChuyenDich;

			array[2] = getByMessageId_PrevAndNext(session,
					tthcKeHoachChuyenDich, messageId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TthcKeHoachChuyenDich getByMessageId_PrevAndNext(
		Session session, TthcKeHoachChuyenDich tthcKeHoachChuyenDich,
		String messageId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

		boolean bindMessageId = false;

		if (messageId == null) {
			query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_1);
		}
		else if (messageId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_3);
		}
		else {
			bindMessageId = true;

			query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_2);
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
			query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMessageId) {
			qPos.add(messageId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcKeHoachChuyenDich);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcKeHoachChuyenDich> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ke hoach chuyen dichs where messageId = &#63; from the database.
	 *
	 * @param messageId the message ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMessageId(String messageId) throws SystemException {
		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : findByMessageId(
				messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcKeHoachChuyenDich);
		}
	}

	/**
	 * Returns the number of tthc ke hoach chuyen dichs where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the number of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMessageId(String messageId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MESSAGEID;

		Object[] finderArgs = new Object[] { messageId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCKEHOACHCHUYENDICH_WHERE);

			boolean bindMessageId = false;

			if (messageId == null) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_1);
			}
			else if (messageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_3);
			}
			else {
				bindMessageId = true;

				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMessageId) {
					qPos.add(messageId);
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

	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_1 = "tthcKeHoachChuyenDich.messageId IS NULL";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_2 = "tthcKeHoachChuyenDich.messageId = ?";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_3 = "(tthcKeHoachChuyenDich.messageId IS NULL OR tthcKeHoachChuyenDich.messageId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTENUMBER =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDebitnoteNumber",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDebitnoteNumber",
			new String[] { String.class.getName() },
			TthcKeHoachChuyenDichModelImpl.DEBITNOTENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEBITNOTENUMBER = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDebitnoteNumber", new String[] { String.class.getName() });

	/**
	 * Returns all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	 *
	 * @param debitnoteNumber the debitnote number
	 * @return the matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByDebitnoteNumber(
		String debitnoteNumber) throws SystemException {
		return findByDebitnoteNumber(debitnoteNumber, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitnoteNumber the debitnote number
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @return the range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByDebitnoteNumber(
		String debitnoteNumber, int start, int end) throws SystemException {
		return findByDebitnoteNumber(debitnoteNumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitnoteNumber the debitnote number
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByDebitnoteNumber(
		String debitnoteNumber, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER;
			finderArgs = new Object[] { debitnoteNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTENUMBER;
			finderArgs = new Object[] {
					debitnoteNumber,
					
					start, end, orderByComparator
				};
		}

		List<TthcKeHoachChuyenDich> list = (List<TthcKeHoachChuyenDich>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : list) {
				if (!Validator.equals(debitnoteNumber,
							tthcKeHoachChuyenDich.getDebitnoteNumber())) {
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

			query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

			boolean bindDebitnoteNumber = false;

			if (debitnoteNumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
			}
			else if (debitnoteNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
			}
			else {
				bindDebitnoteNumber = true;

				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDebitnoteNumber) {
					qPos.add(debitnoteNumber);
				}

				if (!pagination) {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcKeHoachChuyenDich>(list);
				}
				else {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
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
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	 *
	 * @param debitnoteNumber the debitnote number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByDebitnoteNumber_First(
		String debitnoteNumber, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByDebitnoteNumber_First(debitnoteNumber,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitnoteNumber=");
		msg.append(debitnoteNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	 *
	 * @param debitnoteNumber the debitnote number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByDebitnoteNumber_First(
		String debitnoteNumber, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcKeHoachChuyenDich> list = findByDebitnoteNumber(debitnoteNumber,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	 *
	 * @param debitnoteNumber the debitnote number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByDebitnoteNumber_Last(
		String debitnoteNumber, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByDebitnoteNumber_Last(debitnoteNumber,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitnoteNumber=");
		msg.append(debitnoteNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	 *
	 * @param debitnoteNumber the debitnote number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByDebitnoteNumber_Last(
		String debitnoteNumber, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDebitnoteNumber(debitnoteNumber);

		if (count == 0) {
			return null;
		}

		List<TthcKeHoachChuyenDich> list = findByDebitnoteNumber(debitnoteNumber,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	 *
	 * @param id the primary key of the current tthc ke hoach chuyen dich
	 * @param debitnoteNumber the debitnote number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich[] findByDebitnoteNumber_PrevAndNext(long id,
		String debitnoteNumber, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcKeHoachChuyenDich[] array = new TthcKeHoachChuyenDichImpl[3];

			array[0] = getByDebitnoteNumber_PrevAndNext(session,
					tthcKeHoachChuyenDich, debitnoteNumber, orderByComparator,
					true);

			array[1] = tthcKeHoachChuyenDich;

			array[2] = getByDebitnoteNumber_PrevAndNext(session,
					tthcKeHoachChuyenDich, debitnoteNumber, orderByComparator,
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

	protected TthcKeHoachChuyenDich getByDebitnoteNumber_PrevAndNext(
		Session session, TthcKeHoachChuyenDich tthcKeHoachChuyenDich,
		String debitnoteNumber, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

		boolean bindDebitnoteNumber = false;

		if (debitnoteNumber == null) {
			query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
		}
		else if (debitnoteNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
		}
		else {
			bindDebitnoteNumber = true;

			query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
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
			query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDebitnoteNumber) {
			qPos.add(debitnoteNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcKeHoachChuyenDich);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcKeHoachChuyenDich> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63; from the database.
	 *
	 * @param debitnoteNumber the debitnote number
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDebitnoteNumber(String debitnoteNumber)
		throws SystemException {
		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : findByDebitnoteNumber(
				debitnoteNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcKeHoachChuyenDich);
		}
	}

	/**
	 * Returns the number of tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	 *
	 * @param debitnoteNumber the debitnote number
	 * @return the number of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDebitnoteNumber(String debitnoteNumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEBITNOTENUMBER;

		Object[] finderArgs = new Object[] { debitnoteNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCKEHOACHCHUYENDICH_WHERE);

			boolean bindDebitnoteNumber = false;

			if (debitnoteNumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
			}
			else if (debitnoteNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
			}
			else {
				bindDebitnoteNumber = true;

				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDebitnoteNumber) {
					qPos.add(debitnoteNumber);
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

	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1 =
		"tthcKeHoachChuyenDich.debitnoteNumber IS NULL";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2 =
		"tthcKeHoachChuyenDich.debitnoteNumber = ?";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3 =
		"(tthcKeHoachChuyenDich.debitnoteNumber IS NULL OR tthcKeHoachChuyenDich.debitnoteNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCertificateId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCertificateId",
			new String[] { String.class.getName() },
			TthcKeHoachChuyenDichModelImpl.GHICHU_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATEID = new FinderPath(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCertificateId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tthc ke hoach chuyen dichs where ghiChu = &#63;.
	 *
	 * @param ghiChu the ghi chu
	 * @return the matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByCertificateId(String ghiChu)
		throws SystemException {
		return findByCertificateId(ghiChu, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ke hoach chuyen dichs where ghiChu = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ghiChu the ghi chu
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @return the range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByCertificateId(String ghiChu,
		int start, int end) throws SystemException {
		return findByCertificateId(ghiChu, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ke hoach chuyen dichs where ghiChu = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ghiChu the ghi chu
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findByCertificateId(String ghiChu,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] { ghiChu };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] { ghiChu, start, end, orderByComparator };
		}

		List<TthcKeHoachChuyenDich> list = (List<TthcKeHoachChuyenDich>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : list) {
				if (!Validator.equals(ghiChu, tthcKeHoachChuyenDich.getGhiChu())) {
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

			query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

			boolean bindGhiChu = false;

			if (ghiChu == null) {
				query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_1);
			}
			else if (ghiChu.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_3);
			}
			else {
				bindGhiChu = true;

				query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGhiChu) {
					qPos.add(ghiChu);
				}

				if (!pagination) {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcKeHoachChuyenDich>(list);
				}
				else {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
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
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	 *
	 * @param ghiChu the ghi chu
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByCertificateId_First(String ghiChu,
		OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByCertificateId_First(ghiChu,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ghiChu=");
		msg.append(ghiChu);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the first tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	 *
	 * @param ghiChu the ghi chu
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByCertificateId_First(String ghiChu,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcKeHoachChuyenDich> list = findByCertificateId(ghiChu, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	 *
	 * @param ghiChu the ghi chu
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByCertificateId_Last(String ghiChu,
		OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByCertificateId_Last(ghiChu,
				orderByComparator);

		if (tthcKeHoachChuyenDich != null) {
			return tthcKeHoachChuyenDich;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ghiChu=");
		msg.append(ghiChu);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcKeHoachChuyenDichException(msg.toString());
	}

	/**
	 * Returns the last tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	 *
	 * @param ghiChu the ghi chu
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByCertificateId_Last(String ghiChu,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCertificateId(ghiChu);

		if (count == 0) {
			return null;
		}

		List<TthcKeHoachChuyenDich> list = findByCertificateId(ghiChu,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	 *
	 * @param id the primary key of the current tthc ke hoach chuyen dich
	 * @param ghiChu the ghi chu
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich[] findByCertificateId_PrevAndNext(long id,
		String ghiChu, OrderByComparator orderByComparator)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcKeHoachChuyenDich[] array = new TthcKeHoachChuyenDichImpl[3];

			array[0] = getByCertificateId_PrevAndNext(session,
					tthcKeHoachChuyenDich, ghiChu, orderByComparator, true);

			array[1] = tthcKeHoachChuyenDich;

			array[2] = getByCertificateId_PrevAndNext(session,
					tthcKeHoachChuyenDich, ghiChu, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TthcKeHoachChuyenDich getByCertificateId_PrevAndNext(
		Session session, TthcKeHoachChuyenDich tthcKeHoachChuyenDich,
		String ghiChu, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE);

		boolean bindGhiChu = false;

		if (ghiChu == null) {
			query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_1);
		}
		else if (ghiChu.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_3);
		}
		else {
			bindGhiChu = true;

			query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_2);
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
			query.append(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindGhiChu) {
			qPos.add(ghiChu);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcKeHoachChuyenDich);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcKeHoachChuyenDich> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc ke hoach chuyen dichs where ghiChu = &#63; from the database.
	 *
	 * @param ghiChu the ghi chu
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateId(String ghiChu) throws SystemException {
		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : findByCertificateId(
				ghiChu, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcKeHoachChuyenDich);
		}
	}

	/**
	 * Returns the number of tthc ke hoach chuyen dichs where ghiChu = &#63;.
	 *
	 * @param ghiChu the ghi chu
	 * @return the number of matching tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCertificateId(String ghiChu) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATEID;

		Object[] finderArgs = new Object[] { ghiChu };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCKEHOACHCHUYENDICH_WHERE);

			boolean bindGhiChu = false;

			if (ghiChu == null) {
				query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_1);
			}
			else if (ghiChu.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_3);
			}
			else {
				bindGhiChu = true;

				query.append(_FINDER_COLUMN_CERTIFICATEID_GHICHU_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGhiChu) {
					qPos.add(ghiChu);
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

	private static final String _FINDER_COLUMN_CERTIFICATEID_GHICHU_1 = "tthcKeHoachChuyenDich.ghiChu IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATEID_GHICHU_2 = "tthcKeHoachChuyenDich.ghiChu = ?";
	private static final String _FINDER_COLUMN_CERTIFICATEID_GHICHU_3 = "(tthcKeHoachChuyenDich.ghiChu IS NULL OR tthcKeHoachChuyenDich.ghiChu = '')";

	public TthcKeHoachChuyenDichPersistenceImpl() {
		setModelClass(TthcKeHoachChuyenDich.class);
	}

	/**
	 * Caches the tthc ke hoach chuyen dich in the entity cache if it is enabled.
	 *
	 * @param tthcKeHoachChuyenDich the tthc ke hoach chuyen dich
	 */
	@Override
	public void cacheResult(TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		EntityCacheUtil.putResult(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			tthcKeHoachChuyenDich.getPrimaryKey(), tthcKeHoachChuyenDich);

		tthcKeHoachChuyenDich.resetOriginalValues();
	}

	/**
	 * Caches the tthc ke hoach chuyen dichs in the entity cache if it is enabled.
	 *
	 * @param tthcKeHoachChuyenDichs the tthc ke hoach chuyen dichs
	 */
	@Override
	public void cacheResult(List<TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs) {
		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : tthcKeHoachChuyenDichs) {
			if (EntityCacheUtil.getResult(
						TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
						TthcKeHoachChuyenDichImpl.class,
						tthcKeHoachChuyenDich.getPrimaryKey()) == null) {
				cacheResult(tthcKeHoachChuyenDich);
			}
			else {
				tthcKeHoachChuyenDich.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc ke hoach chuyen dichs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcKeHoachChuyenDichImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcKeHoachChuyenDichImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc ke hoach chuyen dich.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		EntityCacheUtil.removeResult(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			tthcKeHoachChuyenDich.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : tthcKeHoachChuyenDichs) {
			EntityCacheUtil.removeResult(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
				TthcKeHoachChuyenDichImpl.class,
				tthcKeHoachChuyenDich.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tthc ke hoach chuyen dich with the primary key. Does not add the tthc ke hoach chuyen dich to the database.
	 *
	 * @param id the primary key for the new tthc ke hoach chuyen dich
	 * @return the new tthc ke hoach chuyen dich
	 */
	@Override
	public TthcKeHoachChuyenDich create(long id) {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = new TthcKeHoachChuyenDichImpl();

		tthcKeHoachChuyenDich.setNew(true);
		tthcKeHoachChuyenDich.setPrimaryKey(id);

		return tthcKeHoachChuyenDich;
	}

	/**
	 * Removes the tthc ke hoach chuyen dich with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc ke hoach chuyen dich
	 * @return the tthc ke hoach chuyen dich that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich remove(long id)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc ke hoach chuyen dich with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc ke hoach chuyen dich
	 * @return the tthc ke hoach chuyen dich that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich remove(Serializable primaryKey)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcKeHoachChuyenDich tthcKeHoachChuyenDich = (TthcKeHoachChuyenDich)session.get(TthcKeHoachChuyenDichImpl.class,
					primaryKey);

			if (tthcKeHoachChuyenDich == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcKeHoachChuyenDichException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcKeHoachChuyenDich);
		}
		catch (NoSuchTthcKeHoachChuyenDichException nsee) {
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
	protected TthcKeHoachChuyenDich removeImpl(
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich) throws SystemException {
		tthcKeHoachChuyenDich = toUnwrappedModel(tthcKeHoachChuyenDich);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcKeHoachChuyenDich)) {
				tthcKeHoachChuyenDich = (TthcKeHoachChuyenDich)session.get(TthcKeHoachChuyenDichImpl.class,
						tthcKeHoachChuyenDich.getPrimaryKeyObj());
			}

			if (tthcKeHoachChuyenDich != null) {
				session.delete(tthcKeHoachChuyenDich);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcKeHoachChuyenDich != null) {
			clearCache(tthcKeHoachChuyenDich);
		}

		return tthcKeHoachChuyenDich;
	}

	@Override
	public TthcKeHoachChuyenDich updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich)
		throws SystemException {
		tthcKeHoachChuyenDich = toUnwrappedModel(tthcKeHoachChuyenDich);

		boolean isNew = tthcKeHoachChuyenDich.isNew();

		TthcKeHoachChuyenDichModelImpl tthcKeHoachChuyenDichModelImpl = (TthcKeHoachChuyenDichModelImpl)tthcKeHoachChuyenDich;

		Session session = null;

		try {
			session = openSession();

			if (tthcKeHoachChuyenDich.isNew()) {
				session.save(tthcKeHoachChuyenDich);

				tthcKeHoachChuyenDich.setNew(false);
			}
			else {
				session.merge(tthcKeHoachChuyenDich);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcKeHoachChuyenDichModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcKeHoachChuyenDichModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getOriginalPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);

				args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);
			}

			if ((tthcKeHoachChuyenDichModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getOriginalPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);

				args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);
			}

			if ((tthcKeHoachChuyenDichModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getOriginalMessageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);

				args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getMessageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);
			}

			if ((tthcKeHoachChuyenDichModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getOriginalDebitnoteNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER,
					args);

				args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getDebitnoteNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER,
					args);
			}

			if ((tthcKeHoachChuyenDichModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcKeHoachChuyenDichModelImpl.getOriginalGhiChu()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);

				args = new Object[] { tthcKeHoachChuyenDichModelImpl.getGhiChu() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
			TthcKeHoachChuyenDichImpl.class,
			tthcKeHoachChuyenDich.getPrimaryKey(), tthcKeHoachChuyenDich);

		return tthcKeHoachChuyenDich;
	}

	protected TthcKeHoachChuyenDich toUnwrappedModel(
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		if (tthcKeHoachChuyenDich instanceof TthcKeHoachChuyenDichImpl) {
			return tthcKeHoachChuyenDich;
		}

		TthcKeHoachChuyenDichImpl tthcKeHoachChuyenDichImpl = new TthcKeHoachChuyenDichImpl();

		tthcKeHoachChuyenDichImpl.setNew(tthcKeHoachChuyenDich.isNew());
		tthcKeHoachChuyenDichImpl.setPrimaryKey(tthcKeHoachChuyenDich.getPrimaryKey());

		tthcKeHoachChuyenDichImpl.setId(tthcKeHoachChuyenDich.getId());
		tthcKeHoachChuyenDichImpl.setPhieuXuLyChinhId(tthcKeHoachChuyenDich.getPhieuXuLyChinhId());
		tthcKeHoachChuyenDichImpl.setPhieuXuLyPhuId(tthcKeHoachChuyenDich.getPhieuXuLyPhuId());
		tthcKeHoachChuyenDichImpl.setMessageId(tthcKeHoachChuyenDich.getMessageId());
		tthcKeHoachChuyenDichImpl.setMessageStatus(tthcKeHoachChuyenDich.getMessageStatus());
		tthcKeHoachChuyenDichImpl.setTrangThaiNguonId(tthcKeHoachChuyenDich.getTrangThaiNguonId());
		tthcKeHoachChuyenDichImpl.setDieuKienChuyenDich(tthcKeHoachChuyenDich.getDieuKienChuyenDich());
		tthcKeHoachChuyenDichImpl.setTrangThaiDichId(tthcKeHoachChuyenDich.getTrangThaiDichId());
		tthcKeHoachChuyenDichImpl.setPhanNhomHoSoId(tthcKeHoachChuyenDich.getPhanNhomHoSoId());
		tthcKeHoachChuyenDichImpl.setNhomPhieuXuLy(tthcKeHoachChuyenDich.getNhomPhieuXuLy());
		tthcKeHoachChuyenDichImpl.setHoanTat(tthcKeHoachChuyenDich.getHoanTat());
		tthcKeHoachChuyenDichImpl.setGhiChu(tthcKeHoachChuyenDich.getGhiChu());
		tthcKeHoachChuyenDichImpl.setDebitnoteNumber(tthcKeHoachChuyenDich.getDebitnoteNumber());
		tthcKeHoachChuyenDichImpl.setMessageFunction(tthcKeHoachChuyenDich.getMessageFunction());
		tthcKeHoachChuyenDichImpl.setMessageType(tthcKeHoachChuyenDich.getMessageType());
		tthcKeHoachChuyenDichImpl.setThoiDiemCapNhat(tthcKeHoachChuyenDich.getThoiDiemCapNhat());

		return tthcKeHoachChuyenDichImpl;
	}

	/**
	 * Returns the tthc ke hoach chuyen dich with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc ke hoach chuyen dich
	 * @return the tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = fetchByPrimaryKey(primaryKey);

		if (tthcKeHoachChuyenDich == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcKeHoachChuyenDichException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcKeHoachChuyenDich;
	}

	/**
	 * Returns the tthc ke hoach chuyen dich with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException} if it could not be found.
	 *
	 * @param id the primary key of the tthc ke hoach chuyen dich
	 * @return the tthc ke hoach chuyen dich
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich findByPrimaryKey(long id)
		throws NoSuchTthcKeHoachChuyenDichException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc ke hoach chuyen dich with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc ke hoach chuyen dich
	 * @return the tthc ke hoach chuyen dich, or <code>null</code> if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich = (TthcKeHoachChuyenDich)EntityCacheUtil.getResult(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
				TthcKeHoachChuyenDichImpl.class, primaryKey);

		if (tthcKeHoachChuyenDich == _nullTthcKeHoachChuyenDich) {
			return null;
		}

		if (tthcKeHoachChuyenDich == null) {
			Session session = null;

			try {
				session = openSession();

				tthcKeHoachChuyenDich = (TthcKeHoachChuyenDich)session.get(TthcKeHoachChuyenDichImpl.class,
						primaryKey);

				if (tthcKeHoachChuyenDich != null) {
					cacheResult(tthcKeHoachChuyenDich);
				}
				else {
					EntityCacheUtil.putResult(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
						TthcKeHoachChuyenDichImpl.class, primaryKey,
						_nullTthcKeHoachChuyenDich);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcKeHoachChuyenDichModelImpl.ENTITY_CACHE_ENABLED,
					TthcKeHoachChuyenDichImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcKeHoachChuyenDich;
	}

	/**
	 * Returns the tthc ke hoach chuyen dich with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc ke hoach chuyen dich
	 * @return the tthc ke hoach chuyen dich, or <code>null</code> if a tthc ke hoach chuyen dich with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcKeHoachChuyenDich fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc ke hoach chuyen dichs.
	 *
	 * @return the tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ke hoach chuyen dichs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @return the range of tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ke hoach chuyen dichs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc ke hoach chuyen dichs
	 * @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc ke hoach chuyen dichs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcKeHoachChuyenDich> findAll(int start, int end,
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

		List<TthcKeHoachChuyenDich> list = (List<TthcKeHoachChuyenDich>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCKEHOACHCHUYENDICH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCKEHOACHCHUYENDICH;

				if (pagination) {
					sql = sql.concat(TthcKeHoachChuyenDichModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcKeHoachChuyenDich>(list);
				}
				else {
					list = (List<TthcKeHoachChuyenDich>)QueryUtil.list(q,
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
	 * Removes all the tthc ke hoach chuyen dichs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcKeHoachChuyenDich tthcKeHoachChuyenDich : findAll()) {
			remove(tthcKeHoachChuyenDich);
		}
	}

	/**
	 * Returns the number of tthc ke hoach chuyen dichs.
	 *
	 * @return the number of tthc ke hoach chuyen dichs
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

				Query q = session.createQuery(_SQL_COUNT_TTHCKEHOACHCHUYENDICH);

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
	 * Initializes the tthc ke hoach chuyen dich persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcKeHoachChuyenDich>> listenersList = new ArrayList<ModelListener<TthcKeHoachChuyenDich>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcKeHoachChuyenDich>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcKeHoachChuyenDichImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCKEHOACHCHUYENDICH = "SELECT tthcKeHoachChuyenDich FROM TthcKeHoachChuyenDich tthcKeHoachChuyenDich";
	private static final String _SQL_SELECT_TTHCKEHOACHCHUYENDICH_WHERE = "SELECT tthcKeHoachChuyenDich FROM TthcKeHoachChuyenDich tthcKeHoachChuyenDich WHERE ";
	private static final String _SQL_COUNT_TTHCKEHOACHCHUYENDICH = "SELECT COUNT(tthcKeHoachChuyenDich) FROM TthcKeHoachChuyenDich tthcKeHoachChuyenDich";
	private static final String _SQL_COUNT_TTHCKEHOACHCHUYENDICH_WHERE = "SELECT COUNT(tthcKeHoachChuyenDich) FROM TthcKeHoachChuyenDich tthcKeHoachChuyenDich WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcKeHoachChuyenDich.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcKeHoachChuyenDich exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcKeHoachChuyenDich exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcKeHoachChuyenDichPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"phieuXuLyChinhId", "phieuXuLyPhuId", "messageId",
				"messageStatus", "trangThaiNguonId", "dieuKienChuyenDich",
				"trangThaiDichId", "phanNhomHoSoId", "nhomPhieuXuLy", "hoanTat",
				"ghiChu", "debitnoteNumber", "messageFunction", "messageType",
				"thoiDiemCapNhat"
			});
	private static TthcKeHoachChuyenDich _nullTthcKeHoachChuyenDich = new TthcKeHoachChuyenDichImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcKeHoachChuyenDich> toCacheModel() {
				return _nullTthcKeHoachChuyenDichCacheModel;
			}
		};

	private static CacheModel<TthcKeHoachChuyenDich> _nullTthcKeHoachChuyenDichCacheModel =
		new CacheModel<TthcKeHoachChuyenDich>() {
			@Override
			public TthcKeHoachChuyenDich toEntityModel() {
				return _nullTthcKeHoachChuyenDich;
			}
		};
}