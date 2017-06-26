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

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua dong bo m tgateway service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaDongBoMTgatewayPersistence
 * @see MotCuaDongBoMTgatewayUtil
 * @generated
 */
public class MotCuaDongBoMTgatewayPersistenceImpl extends BasePersistenceImpl<MotCuaDongBoMTgateway>
	implements MotCuaDongBoMTgatewayPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaDongBoMTgatewayUtil} to access the mot cua dong bo m tgateway persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaDongBoMTgatewayImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DIENBIENHOSOID =
		new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDienBienHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID =
		new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDienBienHoSoId",
			new String[] { Long.class.getName() },
			MotCuaDongBoMTgatewayModelImpl.DIENBIENHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DIENBIENHOSOID = new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDienBienHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @return the matching mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findByDienBienHoSoId(long dienBienHoSoId)
		throws SystemException {
		return findByDienBienHoSoId(dienBienHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param start the lower bound of the range of mot cua dong bo m tgatewaies
	 * @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	 * @return the range of matching mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findByDienBienHoSoId(
		long dienBienHoSoId, int start, int end) throws SystemException {
		return findByDienBienHoSoId(dienBienHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param start the lower bound of the range of mot cua dong bo m tgatewaies
	 * @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findByDienBienHoSoId(
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

		List<MotCuaDongBoMTgateway> list = (List<MotCuaDongBoMTgateway>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaDongBoMTgateway motCuaDongBoMTgateway : list) {
				if ((dienBienHoSoId != motCuaDongBoMTgateway.getDienBienHoSoId())) {
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

			query.append(_SQL_SELECT_MOTCUADONGBOMTGATEWAY_WHERE);

			query.append(_FINDER_COLUMN_DIENBIENHOSOID_DIENBIENHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaDongBoMTgatewayModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dienBienHoSoId);

				if (!pagination) {
					list = (List<MotCuaDongBoMTgateway>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDongBoMTgateway>(list);
				}
				else {
					list = (List<MotCuaDongBoMTgateway>)QueryUtil.list(q,
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
	 * Returns the first mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway findByDienBienHoSoId_First(
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = fetchByDienBienHoSoId_First(dienBienHoSoId,
				orderByComparator);

		if (motCuaDongBoMTgateway != null) {
			return motCuaDongBoMTgateway;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dienBienHoSoId=");
		msg.append(dienBienHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDongBoMTgatewayException(msg.toString());
	}

	/**
	 * Returns the first mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway fetchByDienBienHoSoId_First(
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaDongBoMTgateway> list = findByDienBienHoSoId(dienBienHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway findByDienBienHoSoId_Last(
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = fetchByDienBienHoSoId_Last(dienBienHoSoId,
				orderByComparator);

		if (motCuaDongBoMTgateway != null) {
			return motCuaDongBoMTgateway;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dienBienHoSoId=");
		msg.append(dienBienHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDongBoMTgatewayException(msg.toString());
	}

	/**
	 * Returns the last mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway fetchByDienBienHoSoId_Last(
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDienBienHoSoId(dienBienHoSoId);

		if (count == 0) {
			return null;
		}

		List<MotCuaDongBoMTgateway> list = findByDienBienHoSoId(dienBienHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua dong bo m tgatewaies before and after the current mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	 *
	 * @param id the primary key of the current mot cua dong bo m tgateway
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway[] findByDienBienHoSoId_PrevAndNext(long id,
		long dienBienHoSoId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaDongBoMTgateway[] array = new MotCuaDongBoMTgatewayImpl[3];

			array[0] = getByDienBienHoSoId_PrevAndNext(session,
					motCuaDongBoMTgateway, dienBienHoSoId, orderByComparator,
					true);

			array[1] = motCuaDongBoMTgateway;

			array[2] = getByDienBienHoSoId_PrevAndNext(session,
					motCuaDongBoMTgateway, dienBienHoSoId, orderByComparator,
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

	protected MotCuaDongBoMTgateway getByDienBienHoSoId_PrevAndNext(
		Session session, MotCuaDongBoMTgateway motCuaDongBoMTgateway,
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

		query.append(_SQL_SELECT_MOTCUADONGBOMTGATEWAY_WHERE);

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
			query.append(MotCuaDongBoMTgatewayModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dienBienHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaDongBoMTgateway);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaDongBoMTgateway> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63; from the database.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDienBienHoSoId(long dienBienHoSoId)
		throws SystemException {
		for (MotCuaDongBoMTgateway motCuaDongBoMTgateway : findByDienBienHoSoId(
				dienBienHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaDongBoMTgateway);
		}
	}

	/**
	 * Returns the number of mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	 *
	 * @param dienBienHoSoId the dien bien ho so ID
	 * @return the number of matching mot cua dong bo m tgatewaies
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

			query.append(_SQL_COUNT_MOTCUADONGBOMTGATEWAY_WHERE);

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

	private static final String _FINDER_COLUMN_DIENBIENHOSOID_DIENBIENHOSOID_2 = "motCuaDongBoMTgateway.dienBienHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByphieuXuLyChinhId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByphieuXuLyChinhId", new String[] { Long.class.getName() },
			MotCuaDongBoMTgatewayModelImpl.PHIEUXULYCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID = new FinderPath(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByphieuXuLyChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the matching mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findByphieuXuLyChinhId(
		long phieuXuLyChinhId) throws SystemException {
		return findByphieuXuLyChinhId(phieuXuLyChinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of mot cua dong bo m tgatewaies
	 * @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	 * @return the range of matching mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findByphieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end) throws SystemException {
		return findByphieuXuLyChinhId(phieuXuLyChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of mot cua dong bo m tgatewaies
	 * @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findByphieuXuLyChinhId(
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

		List<MotCuaDongBoMTgateway> list = (List<MotCuaDongBoMTgateway>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaDongBoMTgateway motCuaDongBoMTgateway : list) {
				if ((phieuXuLyChinhId != motCuaDongBoMTgateway.getPhieuXuLyChinhId())) {
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

			query.append(_SQL_SELECT_MOTCUADONGBOMTGATEWAY_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHID_PHIEUXULYCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaDongBoMTgatewayModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				if (!pagination) {
					list = (List<MotCuaDongBoMTgateway>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDongBoMTgateway>(list);
				}
				else {
					list = (List<MotCuaDongBoMTgateway>)QueryUtil.list(q,
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
	 * Returns the first mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway findByphieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = fetchByphieuXuLyChinhId_First(phieuXuLyChinhId,
				orderByComparator);

		if (motCuaDongBoMTgateway != null) {
			return motCuaDongBoMTgateway;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDongBoMTgatewayException(msg.toString());
	}

	/**
	 * Returns the first mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway fetchByphieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaDongBoMTgateway> list = findByphieuXuLyChinhId(phieuXuLyChinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway findByphieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = fetchByphieuXuLyChinhId_Last(phieuXuLyChinhId,
				orderByComparator);

		if (motCuaDongBoMTgateway != null) {
			return motCuaDongBoMTgateway;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDongBoMTgatewayException(msg.toString());
	}

	/**
	 * Returns the last mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway fetchByphieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByphieuXuLyChinhId(phieuXuLyChinhId);

		if (count == 0) {
			return null;
		}

		List<MotCuaDongBoMTgateway> list = findByphieuXuLyChinhId(phieuXuLyChinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua dong bo m tgatewaies before and after the current mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param id the primary key of the current mot cua dong bo m tgateway
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway[] findByphieuXuLyChinhId_PrevAndNext(long id,
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaDongBoMTgateway[] array = new MotCuaDongBoMTgatewayImpl[3];

			array[0] = getByphieuXuLyChinhId_PrevAndNext(session,
					motCuaDongBoMTgateway, phieuXuLyChinhId, orderByComparator,
					true);

			array[1] = motCuaDongBoMTgateway;

			array[2] = getByphieuXuLyChinhId_PrevAndNext(session,
					motCuaDongBoMTgateway, phieuXuLyChinhId, orderByComparator,
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

	protected MotCuaDongBoMTgateway getByphieuXuLyChinhId_PrevAndNext(
		Session session, MotCuaDongBoMTgateway motCuaDongBoMTgateway,
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

		query.append(_SQL_SELECT_MOTCUADONGBOMTGATEWAY_WHERE);

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
			query.append(MotCuaDongBoMTgatewayModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaDongBoMTgateway);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaDongBoMTgateway> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63; from the database.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByphieuXuLyChinhId(long phieuXuLyChinhId)
		throws SystemException {
		for (MotCuaDongBoMTgateway motCuaDongBoMTgateway : findByphieuXuLyChinhId(
				phieuXuLyChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaDongBoMTgateway);
		}
	}

	/**
	 * Returns the number of mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the number of matching mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByphieuXuLyChinhId(long phieuXuLyChinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID;

		Object[] finderArgs = new Object[] { phieuXuLyChinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUADONGBOMTGATEWAY_WHERE);

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
		"motCuaDongBoMTgateway.phieuXuLyChinhId = ?";

	public MotCuaDongBoMTgatewayPersistenceImpl() {
		setModelClass(MotCuaDongBoMTgateway.class);
	}

	/**
	 * Caches the mot cua dong bo m tgateway in the entity cache if it is enabled.
	 *
	 * @param motCuaDongBoMTgateway the mot cua dong bo m tgateway
	 */
	@Override
	public void cacheResult(MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		EntityCacheUtil.putResult(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			motCuaDongBoMTgateway.getPrimaryKey(), motCuaDongBoMTgateway);

		motCuaDongBoMTgateway.resetOriginalValues();
	}

	/**
	 * Caches the mot cua dong bo m tgatewaies in the entity cache if it is enabled.
	 *
	 * @param motCuaDongBoMTgatewaies the mot cua dong bo m tgatewaies
	 */
	@Override
	public void cacheResult(List<MotCuaDongBoMTgateway> motCuaDongBoMTgatewaies) {
		for (MotCuaDongBoMTgateway motCuaDongBoMTgateway : motCuaDongBoMTgatewaies) {
			if (EntityCacheUtil.getResult(
						MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaDongBoMTgatewayImpl.class,
						motCuaDongBoMTgateway.getPrimaryKey()) == null) {
				cacheResult(motCuaDongBoMTgateway);
			}
			else {
				motCuaDongBoMTgateway.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua dong bo m tgatewaies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaDongBoMTgatewayImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaDongBoMTgatewayImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua dong bo m tgateway.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		EntityCacheUtil.removeResult(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			motCuaDongBoMTgateway.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MotCuaDongBoMTgateway> motCuaDongBoMTgatewaies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaDongBoMTgateway motCuaDongBoMTgateway : motCuaDongBoMTgatewaies) {
			EntityCacheUtil.removeResult(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaDongBoMTgatewayImpl.class,
				motCuaDongBoMTgateway.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mot cua dong bo m tgateway with the primary key. Does not add the mot cua dong bo m tgateway to the database.
	 *
	 * @param id the primary key for the new mot cua dong bo m tgateway
	 * @return the new mot cua dong bo m tgateway
	 */
	@Override
	public MotCuaDongBoMTgateway create(long id) {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = new MotCuaDongBoMTgatewayImpl();

		motCuaDongBoMTgateway.setNew(true);
		motCuaDongBoMTgateway.setPrimaryKey(id);

		return motCuaDongBoMTgateway;
	}

	/**
	 * Removes the mot cua dong bo m tgateway with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua dong bo m tgateway
	 * @return the mot cua dong bo m tgateway that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway remove(long id)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua dong bo m tgateway with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua dong bo m tgateway
	 * @return the mot cua dong bo m tgateway that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway remove(Serializable primaryKey)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaDongBoMTgateway motCuaDongBoMTgateway = (MotCuaDongBoMTgateway)session.get(MotCuaDongBoMTgatewayImpl.class,
					primaryKey);

			if (motCuaDongBoMTgateway == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaDongBoMTgatewayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaDongBoMTgateway);
		}
		catch (NoSuchMotCuaDongBoMTgatewayException nsee) {
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
	protected MotCuaDongBoMTgateway removeImpl(
		MotCuaDongBoMTgateway motCuaDongBoMTgateway) throws SystemException {
		motCuaDongBoMTgateway = toUnwrappedModel(motCuaDongBoMTgateway);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaDongBoMTgateway)) {
				motCuaDongBoMTgateway = (MotCuaDongBoMTgateway)session.get(MotCuaDongBoMTgatewayImpl.class,
						motCuaDongBoMTgateway.getPrimaryKeyObj());
			}

			if (motCuaDongBoMTgateway != null) {
				session.delete(motCuaDongBoMTgateway);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaDongBoMTgateway != null) {
			clearCache(motCuaDongBoMTgateway);
		}

		return motCuaDongBoMTgateway;
	}

	@Override
	public MotCuaDongBoMTgateway updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway motCuaDongBoMTgateway)
		throws SystemException {
		motCuaDongBoMTgateway = toUnwrappedModel(motCuaDongBoMTgateway);

		boolean isNew = motCuaDongBoMTgateway.isNew();

		MotCuaDongBoMTgatewayModelImpl motCuaDongBoMTgatewayModelImpl = (MotCuaDongBoMTgatewayModelImpl)motCuaDongBoMTgateway;

		Session session = null;

		try {
			session = openSession();

			if (motCuaDongBoMTgateway.isNew()) {
				session.save(motCuaDongBoMTgateway);

				motCuaDongBoMTgateway.setNew(false);
			}
			else {
				session.merge(motCuaDongBoMTgateway);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaDongBoMTgatewayModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaDongBoMTgatewayModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDongBoMTgatewayModelImpl.getOriginalDienBienHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIENBIENHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID,
					args);

				args = new Object[] {
						motCuaDongBoMTgatewayModelImpl.getDienBienHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIENBIENHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIENBIENHOSOID,
					args);
			}

			if ((motCuaDongBoMTgatewayModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDongBoMTgatewayModelImpl.getOriginalPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);

				args = new Object[] {
						motCuaDongBoMTgatewayModelImpl.getPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDongBoMTgatewayImpl.class,
			motCuaDongBoMTgateway.getPrimaryKey(), motCuaDongBoMTgateway);

		return motCuaDongBoMTgateway;
	}

	protected MotCuaDongBoMTgateway toUnwrappedModel(
		MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		if (motCuaDongBoMTgateway instanceof MotCuaDongBoMTgatewayImpl) {
			return motCuaDongBoMTgateway;
		}

		MotCuaDongBoMTgatewayImpl motCuaDongBoMTgatewayImpl = new MotCuaDongBoMTgatewayImpl();

		motCuaDongBoMTgatewayImpl.setNew(motCuaDongBoMTgateway.isNew());
		motCuaDongBoMTgatewayImpl.setPrimaryKey(motCuaDongBoMTgateway.getPrimaryKey());

		motCuaDongBoMTgatewayImpl.setId(motCuaDongBoMTgateway.getId());
		motCuaDongBoMTgatewayImpl.setDienBienHoSoId(motCuaDongBoMTgateway.getDienBienHoSoId());
		motCuaDongBoMTgatewayImpl.setPhieuXuLyChinhId(motCuaDongBoMTgateway.getPhieuXuLyChinhId());
		motCuaDongBoMTgatewayImpl.setModifyDate(motCuaDongBoMTgateway.getModifyDate());
		motCuaDongBoMTgatewayImpl.setTrangThai(motCuaDongBoMTgateway.getTrangThai());

		return motCuaDongBoMTgatewayImpl;
	}

	/**
	 * Returns the mot cua dong bo m tgateway with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua dong bo m tgateway
	 * @return the mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = fetchByPrimaryKey(primaryKey);

		if (motCuaDongBoMTgateway == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaDongBoMTgatewayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaDongBoMTgateway;
	}

	/**
	 * Returns the mot cua dong bo m tgateway with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua dong bo m tgateway
	 * @return the mot cua dong bo m tgateway
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway findByPrimaryKey(long id)
		throws NoSuchMotCuaDongBoMTgatewayException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua dong bo m tgateway with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua dong bo m tgateway
	 * @return the mot cua dong bo m tgateway, or <code>null</code> if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaDongBoMTgateway motCuaDongBoMTgateway = (MotCuaDongBoMTgateway)EntityCacheUtil.getResult(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaDongBoMTgatewayImpl.class, primaryKey);

		if (motCuaDongBoMTgateway == _nullMotCuaDongBoMTgateway) {
			return null;
		}

		if (motCuaDongBoMTgateway == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaDongBoMTgateway = (MotCuaDongBoMTgateway)session.get(MotCuaDongBoMTgatewayImpl.class,
						primaryKey);

				if (motCuaDongBoMTgateway != null) {
					cacheResult(motCuaDongBoMTgateway);
				}
				else {
					EntityCacheUtil.putResult(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaDongBoMTgatewayImpl.class, primaryKey,
						_nullMotCuaDongBoMTgateway);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaDongBoMTgatewayModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaDongBoMTgatewayImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaDongBoMTgateway;
	}

	/**
	 * Returns the mot cua dong bo m tgateway with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua dong bo m tgateway
	 * @return the mot cua dong bo m tgateway, or <code>null</code> if a mot cua dong bo m tgateway with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDongBoMTgateway fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua dong bo m tgatewaies.
	 *
	 * @return the mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dong bo m tgatewaies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua dong bo m tgatewaies
	 * @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	 * @return the range of mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dong bo m tgatewaies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua dong bo m tgatewaies
	 * @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua dong bo m tgatewaies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDongBoMTgateway> findAll(int start, int end,
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

		List<MotCuaDongBoMTgateway> list = (List<MotCuaDongBoMTgateway>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUADONGBOMTGATEWAY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUADONGBOMTGATEWAY;

				if (pagination) {
					sql = sql.concat(MotCuaDongBoMTgatewayModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaDongBoMTgateway>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDongBoMTgateway>(list);
				}
				else {
					list = (List<MotCuaDongBoMTgateway>)QueryUtil.list(q,
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
	 * Removes all the mot cua dong bo m tgatewaies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaDongBoMTgateway motCuaDongBoMTgateway : findAll()) {
			remove(motCuaDongBoMTgateway);
		}
	}

	/**
	 * Returns the number of mot cua dong bo m tgatewaies.
	 *
	 * @return the number of mot cua dong bo m tgatewaies
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUADONGBOMTGATEWAY);

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
	 * Initializes the mot cua dong bo m tgateway persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaDongBoMTgateway>> listenersList = new ArrayList<ModelListener<MotCuaDongBoMTgateway>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaDongBoMTgateway>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaDongBoMTgatewayImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUADONGBOMTGATEWAY = "SELECT motCuaDongBoMTgateway FROM MotCuaDongBoMTgateway motCuaDongBoMTgateway";
	private static final String _SQL_SELECT_MOTCUADONGBOMTGATEWAY_WHERE = "SELECT motCuaDongBoMTgateway FROM MotCuaDongBoMTgateway motCuaDongBoMTgateway WHERE ";
	private static final String _SQL_COUNT_MOTCUADONGBOMTGATEWAY = "SELECT COUNT(motCuaDongBoMTgateway) FROM MotCuaDongBoMTgateway motCuaDongBoMTgateway";
	private static final String _SQL_COUNT_MOTCUADONGBOMTGATEWAY_WHERE = "SELECT COUNT(motCuaDongBoMTgateway) FROM MotCuaDongBoMTgateway motCuaDongBoMTgateway WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaDongBoMTgateway.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaDongBoMTgateway exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaDongBoMTgateway exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaDongBoMTgatewayPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dienBienHoSoId", "phieuXuLyChinhId", "modifyDate", "trangThai"
			});
	private static MotCuaDongBoMTgateway _nullMotCuaDongBoMTgateway = new MotCuaDongBoMTgatewayImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaDongBoMTgateway> toCacheModel() {
				return _nullMotCuaDongBoMTgatewayCacheModel;
			}
		};

	private static CacheModel<MotCuaDongBoMTgateway> _nullMotCuaDongBoMTgatewayCacheModel =
		new CacheModel<MotCuaDongBoMTgateway>() {
			@Override
			public MotCuaDongBoMTgateway toEntityModel() {
				return _nullMotCuaDongBoMTgateway;
			}
		};
}