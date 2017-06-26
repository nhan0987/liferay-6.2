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

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua ket qua dien bien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaKetQuaDienBienPersistence
 * @see MotCuaKetQuaDienBienUtil
 * @generated
 */
public class MotCuaKetQuaDienBienPersistenceImpl extends BasePersistenceImpl<MotCuaKetQuaDienBien>
	implements MotCuaKetQuaDienBienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaKetQuaDienBienUtil} to access the mot cua ket qua dien bien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaKetQuaDienBienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DIENBIENHOSOID =
		new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDienBienHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID =
		new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDienBienHoSoId",
			new String[] { Long.class.getName() },
			MotCuaKetQuaDienBienModelImpl.DIENBIENHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DIENBIENHOSOID = new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDienBienHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @return the matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findByDienBienHoSoId(long dienBienHoSoId)
		throws SystemException {
		return findByDienBienHoSoId(dienBienHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param start the lower bound of the range of mot cua ket qua dien biens
	 * @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	 * @return the range of matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findByDienBienHoSoId(
		long dienBienHoSoId, int start, int end) throws SystemException {
		return findByDienBienHoSoId(dienBienHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param start the lower bound of the range of mot cua ket qua dien biens
	 * @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findByDienBienHoSoId(
		long dienBienHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID;
			finderArgs = new Object[] { dienBienHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DIENBIENHOSOID;
			finderArgs = new Object[] {
					dienBienHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaKetQuaDienBien> list = (List<MotCuaKetQuaDienBien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaKetQuaDienBien motCuaKetQuaDienBien : list) {
				if ((dienBienHoSoId != motCuaKetQuaDienBien.getDienBienHoSoId())) {
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

			query.append(_SQL_SELECT_MOTCUAKETQUADIENBIEN_WHERE);

			query.append(_FINDER_COLUMN_DIENBIENHOSOID_DIENBIENHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaKetQuaDienBienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dienBienHoSoId);

				if (!pagination) {
					list = (List<MotCuaKetQuaDienBien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaKetQuaDienBien>(list);
				}
				else {
					list = (List<MotCuaKetQuaDienBien>)QueryUtil.list(q,
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
	 * Returns the first mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien findByDienBienHoSoId_First(
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = fetchByDienBienHoSoId_First(dienBienHoSoId,
				orderByComparator);

		if (motCuaKetQuaDienBien != null) {
			return motCuaKetQuaDienBien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dienBienHoSoId=");
		msg.append(dienBienHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaKetQuaDienBienException(msg.toString());
	}

	/**
	 * Returns the first mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien fetchByDienBienHoSoId_First(
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaKetQuaDienBien> list = findByDienBienHoSoId(dienBienHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien findByDienBienHoSoId_Last(long dienBienHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = fetchByDienBienHoSoId_Last(dienBienHoSoId,
				orderByComparator);

		if (motCuaKetQuaDienBien != null) {
			return motCuaKetQuaDienBien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dienBienHoSoId=");
		msg.append(dienBienHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaKetQuaDienBienException(msg.toString());
	}

	/**
	 * Returns the last mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien fetchByDienBienHoSoId_Last(
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDienBienHoSoId(dienBienHoSoId);

		if (count == 0) {
			return null;
		}

		List<MotCuaKetQuaDienBien> list = findByDienBienHoSoId(dienBienHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua ket qua dien biens before and after the current mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param id the primary key of the current mot cua ket qua dien bien
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien[] findByDienBienHoSoId_PrevAndNext(long id,
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaKetQuaDienBien[] array = new MotCuaKetQuaDienBienImpl[3];

			array[0] = getByDienBienHoSoId_PrevAndNext(session,
					motCuaKetQuaDienBien, dienBienHoSoId, orderByComparator,
					true);

			array[1] = motCuaKetQuaDienBien;

			array[2] = getByDienBienHoSoId_PrevAndNext(session,
					motCuaKetQuaDienBien, dienBienHoSoId, orderByComparator,
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

	protected MotCuaKetQuaDienBien getByDienBienHoSoId_PrevAndNext(
		Session session, MotCuaKetQuaDienBien motCuaKetQuaDienBien,
		long dienBienHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAKETQUADIENBIEN_WHERE);

		query.append(_FINDER_COLUMN_DIENBIENHOSOID_DIENBIENHOSOID_2);

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
			query.append(MotCuaKetQuaDienBienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dienBienHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaKetQuaDienBien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaKetQuaDienBien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua ket qua dien biens where dienBienHoSoId = &#63; from the database.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDienBienHoSoId(long dienBienHoSoId)
		throws SystemException {
		for (MotCuaKetQuaDienBien motCuaKetQuaDienBien : findByDienBienHoSoId(
				dienBienHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaKetQuaDienBien);
		}
	}

	/**
	 * Returns the number of mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @return the number of matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDienBienHoSoId(long dienBienHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DIENBIENHOSOID;

		Object[] finderArgs = new Object[] { dienBienHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAKETQUADIENBIEN_WHERE);

			query.append(_FINDER_COLUMN_DIENBIENHOSOID_DIENBIENHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dienBienHoSoId);

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

	private static final String _FINDER_COLUMN_DIENBIENHOSOID_DIENBIENHOSOID_2 = "motCuaKetQuaDienBien.dienBienHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoiDungHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoiDungHoSoId",
			new String[] { Long.class.getName() },
			MotCuaKetQuaDienBienModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOIDUNGHOSOID = new FinderPath(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNoiDungHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findByNoiDungHoSoId(long noiDungHoSoId)
		throws SystemException {
		return findByNoiDungHoSoId(noiDungHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of mot cua ket qua dien biens
	 * @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	 * @return the range of matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findByNoiDungHoSoId(long noiDungHoSoId,
		int start, int end) throws SystemException {
		return findByNoiDungHoSoId(noiDungHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of mot cua ket qua dien biens
	 * @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findByNoiDungHoSoId(long noiDungHoSoId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID;
			finderArgs = new Object[] { noiDungHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID;
			finderArgs = new Object[] {
					noiDungHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaKetQuaDienBien> list = (List<MotCuaKetQuaDienBien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaKetQuaDienBien motCuaKetQuaDienBien : list) {
				if ((noiDungHoSoId != motCuaKetQuaDienBien.getNoiDungHoSoId())) {
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

			query.append(_SQL_SELECT_MOTCUAKETQUADIENBIEN_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaKetQuaDienBienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(noiDungHoSoId);

				if (!pagination) {
					list = (List<MotCuaKetQuaDienBien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaKetQuaDienBien>(list);
				}
				else {
					list = (List<MotCuaKetQuaDienBien>)QueryUtil.list(q,
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
	 * Returns the first mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien findByNoiDungHoSoId_First(long noiDungHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = fetchByNoiDungHoSoId_First(noiDungHoSoId,
				orderByComparator);

		if (motCuaKetQuaDienBien != null) {
			return motCuaKetQuaDienBien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("noiDungHoSoId=");
		msg.append(noiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaKetQuaDienBienException(msg.toString());
	}

	/**
	 * Returns the first mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien fetchByNoiDungHoSoId_First(long noiDungHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaKetQuaDienBien> list = findByNoiDungHoSoId(noiDungHoSoId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien findByNoiDungHoSoId_Last(long noiDungHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = fetchByNoiDungHoSoId_Last(noiDungHoSoId,
				orderByComparator);

		if (motCuaKetQuaDienBien != null) {
			return motCuaKetQuaDienBien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("noiDungHoSoId=");
		msg.append(noiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaKetQuaDienBienException(msg.toString());
	}

	/**
	 * Returns the last mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien fetchByNoiDungHoSoId_Last(long noiDungHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNoiDungHoSoId(noiDungHoSoId);

		if (count == 0) {
			return null;
		}

		List<MotCuaKetQuaDienBien> list = findByNoiDungHoSoId(noiDungHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua ket qua dien biens before and after the current mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	 *
	 * @param id the primary key of the current mot cua ket qua dien bien
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien[] findByNoiDungHoSoId_PrevAndNext(long id,
		long noiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaKetQuaDienBien[] array = new MotCuaKetQuaDienBienImpl[3];

			array[0] = getByNoiDungHoSoId_PrevAndNext(session,
					motCuaKetQuaDienBien, noiDungHoSoId, orderByComparator, true);

			array[1] = motCuaKetQuaDienBien;

			array[2] = getByNoiDungHoSoId_PrevAndNext(session,
					motCuaKetQuaDienBien, noiDungHoSoId, orderByComparator,
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

	protected MotCuaKetQuaDienBien getByNoiDungHoSoId_PrevAndNext(
		Session session, MotCuaKetQuaDienBien motCuaKetQuaDienBien,
		long noiDungHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAKETQUADIENBIEN_WHERE);

		query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

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
			query.append(MotCuaKetQuaDienBienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(noiDungHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaKetQuaDienBien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaKetQuaDienBien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua ket qua dien biens where noiDungHoSoId = &#63; from the database.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNoiDungHoSoId(long noiDungHoSoId)
		throws SystemException {
		for (MotCuaKetQuaDienBien motCuaKetQuaDienBien : findByNoiDungHoSoId(
				noiDungHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaKetQuaDienBien);
		}
	}

	/**
	 * Returns the number of mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	 *
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the number of matching mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNoiDungHoSoId(long noiDungHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NOIDUNGHOSOID;

		Object[] finderArgs = new Object[] { noiDungHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAKETQUADIENBIEN_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(noiDungHoSoId);

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

	private static final String _FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2 = "motCuaKetQuaDienBien.noiDungHoSoId = ?";

	public MotCuaKetQuaDienBienPersistenceImpl() {
		setModelClass(MotCuaKetQuaDienBien.class);
	}

	/**
	 * Caches the mot cua ket qua dien bien in the entity cache if it is enabled.
	 *
	 * @param motCuaKetQuaDienBien the mot cua ket qua dien bien
	 */
	@Override
	public void cacheResult(MotCuaKetQuaDienBien motCuaKetQuaDienBien) {
		EntityCacheUtil.putResult(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			motCuaKetQuaDienBien.getPrimaryKey(), motCuaKetQuaDienBien);

		motCuaKetQuaDienBien.resetOriginalValues();
	}

	/**
	 * Caches the mot cua ket qua dien biens in the entity cache if it is enabled.
	 *
	 * @param motCuaKetQuaDienBiens the mot cua ket qua dien biens
	 */
	@Override
	public void cacheResult(List<MotCuaKetQuaDienBien> motCuaKetQuaDienBiens) {
		for (MotCuaKetQuaDienBien motCuaKetQuaDienBien : motCuaKetQuaDienBiens) {
			if (EntityCacheUtil.getResult(
						MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaKetQuaDienBienImpl.class,
						motCuaKetQuaDienBien.getPrimaryKey()) == null) {
				cacheResult(motCuaKetQuaDienBien);
			}
			else {
				motCuaKetQuaDienBien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua ket qua dien biens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaKetQuaDienBienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaKetQuaDienBienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua ket qua dien bien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaKetQuaDienBien motCuaKetQuaDienBien) {
		EntityCacheUtil.removeResult(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class, motCuaKetQuaDienBien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MotCuaKetQuaDienBien> motCuaKetQuaDienBiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaKetQuaDienBien motCuaKetQuaDienBien : motCuaKetQuaDienBiens) {
			EntityCacheUtil.removeResult(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaKetQuaDienBienImpl.class,
				motCuaKetQuaDienBien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mot cua ket qua dien bien with the primary key. Does not add the mot cua ket qua dien bien to the database.
	 *
	 * @param id the primary key for the new mot cua ket qua dien bien
	 * @return the new mot cua ket qua dien bien
	 */
	@Override
	public MotCuaKetQuaDienBien create(long id) {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = new MotCuaKetQuaDienBienImpl();

		motCuaKetQuaDienBien.setNew(true);
		motCuaKetQuaDienBien.setPrimaryKey(id);

		return motCuaKetQuaDienBien;
	}

	/**
	 * Removes the mot cua ket qua dien bien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua ket qua dien bien
	 * @return the mot cua ket qua dien bien that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien remove(long id)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua ket qua dien bien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua ket qua dien bien
	 * @return the mot cua ket qua dien bien that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien remove(Serializable primaryKey)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaKetQuaDienBien motCuaKetQuaDienBien = (MotCuaKetQuaDienBien)session.get(MotCuaKetQuaDienBienImpl.class,
					primaryKey);

			if (motCuaKetQuaDienBien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaKetQuaDienBienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaKetQuaDienBien);
		}
		catch (NoSuchMotCuaKetQuaDienBienException nsee) {
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
	protected MotCuaKetQuaDienBien removeImpl(
		MotCuaKetQuaDienBien motCuaKetQuaDienBien) throws SystemException {
		motCuaKetQuaDienBien = toUnwrappedModel(motCuaKetQuaDienBien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaKetQuaDienBien)) {
				motCuaKetQuaDienBien = (MotCuaKetQuaDienBien)session.get(MotCuaKetQuaDienBienImpl.class,
						motCuaKetQuaDienBien.getPrimaryKeyObj());
			}

			if (motCuaKetQuaDienBien != null) {
				session.delete(motCuaKetQuaDienBien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaKetQuaDienBien != null) {
			clearCache(motCuaKetQuaDienBien);
		}

		return motCuaKetQuaDienBien;
	}

	@Override
	public MotCuaKetQuaDienBien updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien motCuaKetQuaDienBien)
		throws SystemException {
		motCuaKetQuaDienBien = toUnwrappedModel(motCuaKetQuaDienBien);

		boolean isNew = motCuaKetQuaDienBien.isNew();

		MotCuaKetQuaDienBienModelImpl motCuaKetQuaDienBienModelImpl = (MotCuaKetQuaDienBienModelImpl)motCuaKetQuaDienBien;

		Session session = null;

		try {
			session = openSession();

			if (motCuaKetQuaDienBien.isNew()) {
				session.save(motCuaKetQuaDienBien);

				motCuaKetQuaDienBien.setNew(false);
			}
			else {
				session.merge(motCuaKetQuaDienBien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaKetQuaDienBienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaKetQuaDienBienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaKetQuaDienBienModelImpl.getOriginalDienBienHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIENBIENHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID,
					args);

				args = new Object[] {
						motCuaKetQuaDienBienModelImpl.getDienBienHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIENBIENHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID,
					args);
			}

			if ((motCuaKetQuaDienBienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaKetQuaDienBienModelImpl.getOriginalNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);

				args = new Object[] {
						motCuaKetQuaDienBienModelImpl.getNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaKetQuaDienBienImpl.class,
			motCuaKetQuaDienBien.getPrimaryKey(), motCuaKetQuaDienBien);

		return motCuaKetQuaDienBien;
	}

	protected MotCuaKetQuaDienBien toUnwrappedModel(
		MotCuaKetQuaDienBien motCuaKetQuaDienBien) {
		if (motCuaKetQuaDienBien instanceof MotCuaKetQuaDienBienImpl) {
			return motCuaKetQuaDienBien;
		}

		MotCuaKetQuaDienBienImpl motCuaKetQuaDienBienImpl = new MotCuaKetQuaDienBienImpl();

		motCuaKetQuaDienBienImpl.setNew(motCuaKetQuaDienBien.isNew());
		motCuaKetQuaDienBienImpl.setPrimaryKey(motCuaKetQuaDienBien.getPrimaryKey());

		motCuaKetQuaDienBienImpl.setId(motCuaKetQuaDienBien.getId());
		motCuaKetQuaDienBienImpl.setDienBienHoSoId(motCuaKetQuaDienBien.getDienBienHoSoId());
		motCuaKetQuaDienBienImpl.setNoiDungHoSoId(motCuaKetQuaDienBien.getNoiDungHoSoId());

		return motCuaKetQuaDienBienImpl;
	}

	/**
	 * Returns the mot cua ket qua dien bien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua ket qua dien bien
	 * @return the mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = fetchByPrimaryKey(primaryKey);

		if (motCuaKetQuaDienBien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaKetQuaDienBienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaKetQuaDienBien;
	}

	/**
	 * Returns the mot cua ket qua dien bien with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua ket qua dien bien
	 * @return the mot cua ket qua dien bien
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien findByPrimaryKey(long id)
		throws NoSuchMotCuaKetQuaDienBienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua ket qua dien bien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua ket qua dien bien
	 * @return the mot cua ket qua dien bien, or <code>null</code> if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaKetQuaDienBien motCuaKetQuaDienBien = (MotCuaKetQuaDienBien)EntityCacheUtil.getResult(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaKetQuaDienBienImpl.class, primaryKey);

		if (motCuaKetQuaDienBien == _nullMotCuaKetQuaDienBien) {
			return null;
		}

		if (motCuaKetQuaDienBien == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaKetQuaDienBien = (MotCuaKetQuaDienBien)session.get(MotCuaKetQuaDienBienImpl.class,
						primaryKey);

				if (motCuaKetQuaDienBien != null) {
					cacheResult(motCuaKetQuaDienBien);
				}
				else {
					EntityCacheUtil.putResult(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaKetQuaDienBienImpl.class, primaryKey,
						_nullMotCuaKetQuaDienBien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaKetQuaDienBienModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaKetQuaDienBienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaKetQuaDienBien;
	}

	/**
	 * Returns the mot cua ket qua dien bien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua ket qua dien bien
	 * @return the mot cua ket qua dien bien, or <code>null</code> if a mot cua ket qua dien bien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaKetQuaDienBien fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua ket qua dien biens.
	 *
	 * @return the mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua ket qua dien biens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua ket qua dien biens
	 * @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	 * @return the range of mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua ket qua dien biens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua ket qua dien biens
	 * @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua ket qua dien biens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaKetQuaDienBien> findAll(int start, int end,
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

		List<MotCuaKetQuaDienBien> list = (List<MotCuaKetQuaDienBien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAKETQUADIENBIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAKETQUADIENBIEN;

				if (pagination) {
					sql = sql.concat(MotCuaKetQuaDienBienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaKetQuaDienBien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaKetQuaDienBien>(list);
				}
				else {
					list = (List<MotCuaKetQuaDienBien>)QueryUtil.list(q,
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
	 * Removes all the mot cua ket qua dien biens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaKetQuaDienBien motCuaKetQuaDienBien : findAll()) {
			remove(motCuaKetQuaDienBien);
		}
	}

	/**
	 * Returns the number of mot cua ket qua dien biens.
	 *
	 * @return the number of mot cua ket qua dien biens
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAKETQUADIENBIEN);

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
	 * Initializes the mot cua ket qua dien bien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaKetQuaDienBien>> listenersList = new ArrayList<ModelListener<MotCuaKetQuaDienBien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaKetQuaDienBien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaKetQuaDienBienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAKETQUADIENBIEN = "SELECT motCuaKetQuaDienBien FROM MotCuaKetQuaDienBien motCuaKetQuaDienBien";
	private static final String _SQL_SELECT_MOTCUAKETQUADIENBIEN_WHERE = "SELECT motCuaKetQuaDienBien FROM MotCuaKetQuaDienBien motCuaKetQuaDienBien WHERE ";
	private static final String _SQL_COUNT_MOTCUAKETQUADIENBIEN = "SELECT COUNT(motCuaKetQuaDienBien) FROM MotCuaKetQuaDienBien motCuaKetQuaDienBien";
	private static final String _SQL_COUNT_MOTCUAKETQUADIENBIEN_WHERE = "SELECT COUNT(motCuaKetQuaDienBien) FROM MotCuaKetQuaDienBien motCuaKetQuaDienBien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaKetQuaDienBien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaKetQuaDienBien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaKetQuaDienBien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaKetQuaDienBienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dienBienHoSoId", "noiDungHoSoId"
			});
	private static MotCuaKetQuaDienBien _nullMotCuaKetQuaDienBien = new MotCuaKetQuaDienBienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaKetQuaDienBien> toCacheModel() {
				return _nullMotCuaKetQuaDienBienCacheModel;
			}
		};

	private static CacheModel<MotCuaKetQuaDienBien> _nullMotCuaKetQuaDienBienCacheModel =
		new CacheModel<MotCuaKetQuaDienBien>() {
			@Override
			public MotCuaKetQuaDienBien toEntityModel() {
				return _nullMotCuaKetQuaDienBien;
			}
		};
}