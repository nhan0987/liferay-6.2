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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

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

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua phan cong xu ly service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaPhanCongXuLyPersistence
 * @see MotCuaPhanCongXuLyUtil
 * @generated
 */
public class MotCuaPhanCongXuLyPersistenceImpl extends BasePersistenceImpl<MotCuaPhanCongXuLy>
	implements MotCuaPhanCongXuLyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaPhanCongXuLyUtil} to access the mot cua phan cong xu ly persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaPhanCongXuLyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhanCongXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhanCongXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhanCongXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuXuLyChinhId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhanCongXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPhieuXuLyChinhId", new String[] { Long.class.getName() },
			MotCuaPhanCongXuLyModelImpl.PHIEUXULYCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID = new FinderPath(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the matching mot cua phan cong xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhanCongXuLy> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId) throws SystemException {
		return findByPhieuXuLyChinhId(phieuXuLyChinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of mot cua phan cong xu lies
	 * @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	 * @return the range of matching mot cua phan cong xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhanCongXuLy> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end) throws SystemException {
		return findByPhieuXuLyChinhId(phieuXuLyChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of mot cua phan cong xu lies
	 * @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phan cong xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhanCongXuLy> findByPhieuXuLyChinhId(
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

		List<MotCuaPhanCongXuLy> list = (List<MotCuaPhanCongXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhanCongXuLy motCuaPhanCongXuLy : list) {
				if ((phieuXuLyChinhId != motCuaPhanCongXuLy.getPhieuXuLyChinhId())) {
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

			query.append(_SQL_SELECT_MOTCUAPHANCONGXULY_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHID_PHIEUXULYCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhanCongXuLyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				if (!pagination) {
					list = (List<MotCuaPhanCongXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhanCongXuLy>(list);
				}
				else {
					list = (List<MotCuaPhanCongXuLy>)QueryUtil.list(q,
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
	 * Returns the first mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phan cong xu ly
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a matching mot cua phan cong xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhanCongXuLyException, SystemException {
		MotCuaPhanCongXuLy motCuaPhanCongXuLy = fetchByPhieuXuLyChinhId_First(phieuXuLyChinhId,
				orderByComparator);

		if (motCuaPhanCongXuLy != null) {
			return motCuaPhanCongXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhanCongXuLyException(msg.toString());
	}

	/**
	 * Returns the first mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaPhanCongXuLy> list = findByPhieuXuLyChinhId(phieuXuLyChinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phan cong xu ly
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a matching mot cua phan cong xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhanCongXuLyException, SystemException {
		MotCuaPhanCongXuLy motCuaPhanCongXuLy = fetchByPhieuXuLyChinhId_Last(phieuXuLyChinhId,
				orderByComparator);

		if (motCuaPhanCongXuLy != null) {
			return motCuaPhanCongXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhanCongXuLyException(msg.toString());
	}

	/**
	 * Returns the last mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPhieuXuLyChinhId(phieuXuLyChinhId);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhanCongXuLy> list = findByPhieuXuLyChinhId(phieuXuLyChinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phan cong xu lies before and after the current mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param id the primary key of the current mot cua phan cong xu ly
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phan cong xu ly
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy[] findByPhieuXuLyChinhId_PrevAndNext(long id,
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhanCongXuLyException, SystemException {
		MotCuaPhanCongXuLy motCuaPhanCongXuLy = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhanCongXuLy[] array = new MotCuaPhanCongXuLyImpl[3];

			array[0] = getByPhieuXuLyChinhId_PrevAndNext(session,
					motCuaPhanCongXuLy, phieuXuLyChinhId, orderByComparator,
					true);

			array[1] = motCuaPhanCongXuLy;

			array[2] = getByPhieuXuLyChinhId_PrevAndNext(session,
					motCuaPhanCongXuLy, phieuXuLyChinhId, orderByComparator,
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

	protected MotCuaPhanCongXuLy getByPhieuXuLyChinhId_PrevAndNext(
		Session session, MotCuaPhanCongXuLy motCuaPhanCongXuLy,
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

		query.append(_SQL_SELECT_MOTCUAPHANCONGXULY_WHERE);

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
			query.append(MotCuaPhanCongXuLyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhanCongXuLy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhanCongXuLy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63; from the database.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws SystemException {
		for (MotCuaPhanCongXuLy motCuaPhanCongXuLy : findByPhieuXuLyChinhId(
				phieuXuLyChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaPhanCongXuLy);
		}
	}

	/**
	 * Returns the number of mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the number of matching mot cua phan cong xu lies
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

			query.append(_SQL_COUNT_MOTCUAPHANCONGXULY_WHERE);

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
		"motCuaPhanCongXuLy.phieuXuLyChinhId = ?";

	public MotCuaPhanCongXuLyPersistenceImpl() {
		setModelClass(MotCuaPhanCongXuLy.class);
	}

	/**
	 * Caches the mot cua phan cong xu ly in the entity cache if it is enabled.
	 *
	 * @param motCuaPhanCongXuLy the mot cua phan cong xu ly
	 */
	@Override
	public void cacheResult(MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		EntityCacheUtil.putResult(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyImpl.class, motCuaPhanCongXuLy.getPrimaryKey(),
			motCuaPhanCongXuLy);

		motCuaPhanCongXuLy.resetOriginalValues();
	}

	/**
	 * Caches the mot cua phan cong xu lies in the entity cache if it is enabled.
	 *
	 * @param motCuaPhanCongXuLies the mot cua phan cong xu lies
	 */
	@Override
	public void cacheResult(List<MotCuaPhanCongXuLy> motCuaPhanCongXuLies) {
		for (MotCuaPhanCongXuLy motCuaPhanCongXuLy : motCuaPhanCongXuLies) {
			if (EntityCacheUtil.getResult(
						MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhanCongXuLyImpl.class,
						motCuaPhanCongXuLy.getPrimaryKey()) == null) {
				cacheResult(motCuaPhanCongXuLy);
			}
			else {
				motCuaPhanCongXuLy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua phan cong xu lies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaPhanCongXuLyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaPhanCongXuLyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua phan cong xu ly.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		EntityCacheUtil.removeResult(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyImpl.class, motCuaPhanCongXuLy.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MotCuaPhanCongXuLy> motCuaPhanCongXuLies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaPhanCongXuLy motCuaPhanCongXuLy : motCuaPhanCongXuLies) {
			EntityCacheUtil.removeResult(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhanCongXuLyImpl.class, motCuaPhanCongXuLy.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mot cua phan cong xu ly with the primary key. Does not add the mot cua phan cong xu ly to the database.
	 *
	 * @param id the primary key for the new mot cua phan cong xu ly
	 * @return the new mot cua phan cong xu ly
	 */
	@Override
	public MotCuaPhanCongXuLy create(long id) {
		MotCuaPhanCongXuLy motCuaPhanCongXuLy = new MotCuaPhanCongXuLyImpl();

		motCuaPhanCongXuLy.setNew(true);
		motCuaPhanCongXuLy.setPrimaryKey(id);

		return motCuaPhanCongXuLy;
	}

	/**
	 * Removes the mot cua phan cong xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua phan cong xu ly
	 * @return the mot cua phan cong xu ly that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy remove(long id)
		throws NoSuchMotCuaPhanCongXuLyException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua phan cong xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua phan cong xu ly
	 * @return the mot cua phan cong xu ly that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy remove(Serializable primaryKey)
		throws NoSuchMotCuaPhanCongXuLyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaPhanCongXuLy motCuaPhanCongXuLy = (MotCuaPhanCongXuLy)session.get(MotCuaPhanCongXuLyImpl.class,
					primaryKey);

			if (motCuaPhanCongXuLy == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaPhanCongXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaPhanCongXuLy);
		}
		catch (NoSuchMotCuaPhanCongXuLyException nsee) {
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
	protected MotCuaPhanCongXuLy removeImpl(
		MotCuaPhanCongXuLy motCuaPhanCongXuLy) throws SystemException {
		motCuaPhanCongXuLy = toUnwrappedModel(motCuaPhanCongXuLy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaPhanCongXuLy)) {
				motCuaPhanCongXuLy = (MotCuaPhanCongXuLy)session.get(MotCuaPhanCongXuLyImpl.class,
						motCuaPhanCongXuLy.getPrimaryKeyObj());
			}

			if (motCuaPhanCongXuLy != null) {
				session.delete(motCuaPhanCongXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaPhanCongXuLy != null) {
			clearCache(motCuaPhanCongXuLy);
		}

		return motCuaPhanCongXuLy;
	}

	@Override
	public MotCuaPhanCongXuLy updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy motCuaPhanCongXuLy)
		throws SystemException {
		motCuaPhanCongXuLy = toUnwrappedModel(motCuaPhanCongXuLy);

		boolean isNew = motCuaPhanCongXuLy.isNew();

		MotCuaPhanCongXuLyModelImpl motCuaPhanCongXuLyModelImpl = (MotCuaPhanCongXuLyModelImpl)motCuaPhanCongXuLy;

		Session session = null;

		try {
			session = openSession();

			if (motCuaPhanCongXuLy.isNew()) {
				session.save(motCuaPhanCongXuLy);

				motCuaPhanCongXuLy.setNew(false);
			}
			else {
				session.merge(motCuaPhanCongXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaPhanCongXuLyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaPhanCongXuLyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhanCongXuLyModelImpl.getOriginalPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);

				args = new Object[] {
						motCuaPhanCongXuLyModelImpl.getPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhanCongXuLyImpl.class, motCuaPhanCongXuLy.getPrimaryKey(),
			motCuaPhanCongXuLy);

		return motCuaPhanCongXuLy;
	}

	protected MotCuaPhanCongXuLy toUnwrappedModel(
		MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		if (motCuaPhanCongXuLy instanceof MotCuaPhanCongXuLyImpl) {
			return motCuaPhanCongXuLy;
		}

		MotCuaPhanCongXuLyImpl motCuaPhanCongXuLyImpl = new MotCuaPhanCongXuLyImpl();

		motCuaPhanCongXuLyImpl.setNew(motCuaPhanCongXuLy.isNew());
		motCuaPhanCongXuLyImpl.setPrimaryKey(motCuaPhanCongXuLy.getPrimaryKey());

		motCuaPhanCongXuLyImpl.setId(motCuaPhanCongXuLy.getId());
		motCuaPhanCongXuLyImpl.setPhieuXuLyChinhId(motCuaPhanCongXuLy.getPhieuXuLyChinhId());
		motCuaPhanCongXuLyImpl.setPhieuXuLyPhuId(motCuaPhanCongXuLy.getPhieuXuLyPhuId());
		motCuaPhanCongXuLyImpl.setTrangThaiHoSoId(motCuaPhanCongXuLy.getTrangThaiHoSoId());
		motCuaPhanCongXuLyImpl.setNguoiXuLy(motCuaPhanCongXuLy.getNguoiXuLy());
		motCuaPhanCongXuLyImpl.setNhomXuLy(motCuaPhanCongXuLy.getNhomXuLy());
		motCuaPhanCongXuLyImpl.setNgayPhanCong(motCuaPhanCongXuLy.getNgayPhanCong());
		motCuaPhanCongXuLyImpl.setNguoiPhanCong(motCuaPhanCongXuLy.getNguoiPhanCong());

		return motCuaPhanCongXuLyImpl;
	}

	/**
	 * Returns the mot cua phan cong xu ly with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phan cong xu ly
	 * @return the mot cua phan cong xu ly
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaPhanCongXuLyException, SystemException {
		MotCuaPhanCongXuLy motCuaPhanCongXuLy = fetchByPrimaryKey(primaryKey);

		if (motCuaPhanCongXuLy == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaPhanCongXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaPhanCongXuLy;
	}

	/**
	 * Returns the mot cua phan cong xu ly with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua phan cong xu ly
	 * @return the mot cua phan cong xu ly
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy findByPrimaryKey(long id)
		throws NoSuchMotCuaPhanCongXuLyException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua phan cong xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phan cong xu ly
	 * @return the mot cua phan cong xu ly, or <code>null</code> if a mot cua phan cong xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaPhanCongXuLy motCuaPhanCongXuLy = (MotCuaPhanCongXuLy)EntityCacheUtil.getResult(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhanCongXuLyImpl.class, primaryKey);

		if (motCuaPhanCongXuLy == _nullMotCuaPhanCongXuLy) {
			return null;
		}

		if (motCuaPhanCongXuLy == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaPhanCongXuLy = (MotCuaPhanCongXuLy)session.get(MotCuaPhanCongXuLyImpl.class,
						primaryKey);

				if (motCuaPhanCongXuLy != null) {
					cacheResult(motCuaPhanCongXuLy);
				}
				else {
					EntityCacheUtil.putResult(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhanCongXuLyImpl.class, primaryKey,
						_nullMotCuaPhanCongXuLy);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaPhanCongXuLyModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaPhanCongXuLyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaPhanCongXuLy;
	}

	/**
	 * Returns the mot cua phan cong xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua phan cong xu ly
	 * @return the mot cua phan cong xu ly, or <code>null</code> if a mot cua phan cong xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhanCongXuLy fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua phan cong xu lies.
	 *
	 * @return the mot cua phan cong xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhanCongXuLy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phan cong xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phan cong xu lies
	 * @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	 * @return the range of mot cua phan cong xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhanCongXuLy> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phan cong xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phan cong xu lies
	 * @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua phan cong xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhanCongXuLy> findAll(int start, int end,
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

		List<MotCuaPhanCongXuLy> list = (List<MotCuaPhanCongXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAPHANCONGXULY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAPHANCONGXULY;

				if (pagination) {
					sql = sql.concat(MotCuaPhanCongXuLyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaPhanCongXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhanCongXuLy>(list);
				}
				else {
					list = (List<MotCuaPhanCongXuLy>)QueryUtil.list(q,
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
	 * Removes all the mot cua phan cong xu lies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaPhanCongXuLy motCuaPhanCongXuLy : findAll()) {
			remove(motCuaPhanCongXuLy);
		}
	}

	/**
	 * Returns the number of mot cua phan cong xu lies.
	 *
	 * @return the number of mot cua phan cong xu lies
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAPHANCONGXULY);

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
	 * Initializes the mot cua phan cong xu ly persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaPhanCongXuLy>> listenersList = new ArrayList<ModelListener<MotCuaPhanCongXuLy>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaPhanCongXuLy>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaPhanCongXuLyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAPHANCONGXULY = "SELECT motCuaPhanCongXuLy FROM MotCuaPhanCongXuLy motCuaPhanCongXuLy";
	private static final String _SQL_SELECT_MOTCUAPHANCONGXULY_WHERE = "SELECT motCuaPhanCongXuLy FROM MotCuaPhanCongXuLy motCuaPhanCongXuLy WHERE ";
	private static final String _SQL_COUNT_MOTCUAPHANCONGXULY = "SELECT COUNT(motCuaPhanCongXuLy) FROM MotCuaPhanCongXuLy motCuaPhanCongXuLy";
	private static final String _SQL_COUNT_MOTCUAPHANCONGXULY_WHERE = "SELECT COUNT(motCuaPhanCongXuLy) FROM MotCuaPhanCongXuLy motCuaPhanCongXuLy WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaPhanCongXuLy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaPhanCongXuLy exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaPhanCongXuLy exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaPhanCongXuLyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"phieuXuLyChinhId", "phieuXuLyPhuId", "trangThaiHoSoId",
				"nguoiXuLy", "nhomXuLy", "ngayPhanCong", "nguoiPhanCong"
			});
	private static MotCuaPhanCongXuLy _nullMotCuaPhanCongXuLy = new MotCuaPhanCongXuLyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaPhanCongXuLy> toCacheModel() {
				return _nullMotCuaPhanCongXuLyCacheModel;
			}
		};

	private static CacheModel<MotCuaPhanCongXuLy> _nullMotCuaPhanCongXuLyCacheModel =
		new CacheModel<MotCuaPhanCongXuLy>() {
			@Override
			public MotCuaPhanCongXuLy toEntityModel() {
				return _nullMotCuaPhanCongXuLy;
			}
		};
}