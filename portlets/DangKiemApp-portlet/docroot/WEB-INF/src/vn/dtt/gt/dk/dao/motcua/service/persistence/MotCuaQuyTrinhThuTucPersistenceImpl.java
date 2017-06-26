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

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua quy trinh thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucPersistence
 * @see MotCuaQuyTrinhThuTucUtil
 * @generated
 */
public class MotCuaQuyTrinhThuTucPersistenceImpl extends BasePersistenceImpl<MotCuaQuyTrinhThuTuc>
	implements MotCuaQuyTrinhThuTucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaQuyTrinhThuTucUtil} to access the mot cua quy trinh thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaQuyTrinhThuTucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHIDANDTOCHUCXULY =
		new FinderPath(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByThuTucHanhChinhIdAndToChucXuLy",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHIDANDTOCHUCXULY =
		new FinderPath(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucModelImpl.FINDER_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByThuTucHanhChinhIdAndToChucXuLy",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaQuyTrinhThuTucModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK |
			MotCuaQuyTrinhThuTucModelImpl.TOCHUCXULY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY =
		new FinderPath(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhIdAndToChucXuLy",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @return the matching mot cua quy trinh thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy) throws SystemException {
		return findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @param start the lower bound of the range of mot cua quy trinh thu tucs
	 * @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	 * @return the range of matching mot cua quy trinh thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy, int start, int end)
		throws SystemException {
		return findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @param start the lower bound of the range of mot cua quy trinh thu tucs
	 * @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua quy trinh thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHIDANDTOCHUCXULY;
			finderArgs = new Object[] { thuTucHanhChinhId, toChucXuLy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHIDANDTOCHUCXULY;
			finderArgs = new Object[] {
					thuTucHanhChinhId, toChucXuLy,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaQuyTrinhThuTuc> list = (List<MotCuaQuyTrinhThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc : list) {
				if ((thuTucHanhChinhId != motCuaQuyTrinhThuTuc.getThuTucHanhChinhId()) ||
						(toChucXuLy != motCuaQuyTrinhThuTuc.getToChucXuLy())) {
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

			query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_THUTUCHANHCHINHID_2);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_TOCHUCXULY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaQuyTrinhThuTucModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				qPos.add(toChucXuLy);

				if (!pagination) {
					list = (List<MotCuaQuyTrinhThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaQuyTrinhThuTuc>(list);
				}
				else {
					list = (List<MotCuaQuyTrinhThuTuc>)QueryUtil.list(q,
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
	 * Returns the first mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua quy trinh thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a matching mot cua quy trinh thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc findByThuTucHanhChinhIdAndToChucXuLy_First(
		long thuTucHanhChinhId, long toChucXuLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucException, SystemException {
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc = fetchByThuTucHanhChinhIdAndToChucXuLy_First(thuTucHanhChinhId,
				toChucXuLy, orderByComparator);

		if (motCuaQuyTrinhThuTuc != null) {
			return motCuaQuyTrinhThuTuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(", toChucXuLy=");
		msg.append(toChucXuLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaQuyTrinhThuTucException(msg.toString());
	}

	/**
	 * Returns the first mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua quy trinh thu tuc, or <code>null</code> if a matching mot cua quy trinh thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc fetchByThuTucHanhChinhIdAndToChucXuLy_First(
		long thuTucHanhChinhId, long toChucXuLy,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaQuyTrinhThuTuc> list = findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
				toChucXuLy, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua quy trinh thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a matching mot cua quy trinh thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc findByThuTucHanhChinhIdAndToChucXuLy_Last(
		long thuTucHanhChinhId, long toChucXuLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucException, SystemException {
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc = fetchByThuTucHanhChinhIdAndToChucXuLy_Last(thuTucHanhChinhId,
				toChucXuLy, orderByComparator);

		if (motCuaQuyTrinhThuTuc != null) {
			return motCuaQuyTrinhThuTuc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(", toChucXuLy=");
		msg.append(toChucXuLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaQuyTrinhThuTucException(msg.toString());
	}

	/**
	 * Returns the last mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua quy trinh thu tuc, or <code>null</code> if a matching mot cua quy trinh thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc fetchByThuTucHanhChinhIdAndToChucXuLy_Last(
		long thuTucHanhChinhId, long toChucXuLy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
				toChucXuLy);

		if (count == 0) {
			return null;
		}

		List<MotCuaQuyTrinhThuTuc> list = findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
				toChucXuLy, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua quy trinh thu tucs before and after the current mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * @param id the primary key of the current mot cua quy trinh thu tuc
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua quy trinh thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc[] findByThuTucHanhChinhIdAndToChucXuLy_PrevAndNext(
		long id, long thuTucHanhChinhId, long toChucXuLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaQuyTrinhThuTucException, SystemException {
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaQuyTrinhThuTuc[] array = new MotCuaQuyTrinhThuTucImpl[3];

			array[0] = getByThuTucHanhChinhIdAndToChucXuLy_PrevAndNext(session,
					motCuaQuyTrinhThuTuc, thuTucHanhChinhId, toChucXuLy,
					orderByComparator, true);

			array[1] = motCuaQuyTrinhThuTuc;

			array[2] = getByThuTucHanhChinhIdAndToChucXuLy_PrevAndNext(session,
					motCuaQuyTrinhThuTuc, thuTucHanhChinhId, toChucXuLy,
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

	protected MotCuaQuyTrinhThuTuc getByThuTucHanhChinhIdAndToChucXuLy_PrevAndNext(
		Session session, MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc,
		long thuTucHanhChinhId, long toChucXuLy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUC_WHERE);

		query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_THUTUCHANHCHINHID_2);

		query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_TOCHUCXULY_2);

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
			query.append(MotCuaQuyTrinhThuTucModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(thuTucHanhChinhId);

		qPos.add(toChucXuLy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaQuyTrinhThuTuc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaQuyTrinhThuTuc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByThuTucHanhChinhIdAndToChucXuLy(long thuTucHanhChinhId,
		long toChucXuLy) throws SystemException {
		for (MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc : findByThuTucHanhChinhIdAndToChucXuLy(
				thuTucHanhChinhId, toChucXuLy, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaQuyTrinhThuTuc);
		}
	}

	/**
	 * Returns the number of mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param toChucXuLy the to chuc xu ly
	 * @return the number of matching mot cua quy trinh thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhIdAndToChucXuLy(long thuTucHanhChinhId,
		long toChucXuLy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY;

		Object[] finderArgs = new Object[] { thuTucHanhChinhId, toChucXuLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAQUYTRINHTHUTUC_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_THUTUCHANHCHINHID_2);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_TOCHUCXULY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				qPos.add(toChucXuLy);

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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_THUTUCHANHCHINHID_2 =
		"motCuaQuyTrinhThuTuc.thuTucHanhChinhId = ? AND ";
	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDTOCHUCXULY_TOCHUCXULY_2 =
		"motCuaQuyTrinhThuTuc.toChucXuLy = ?";

	public MotCuaQuyTrinhThuTucPersistenceImpl() {
		setModelClass(MotCuaQuyTrinhThuTuc.class);
	}

	/**
	 * Caches the mot cua quy trinh thu tuc in the entity cache if it is enabled.
	 *
	 * @param motCuaQuyTrinhThuTuc the mot cua quy trinh thu tuc
	 */
	@Override
	public void cacheResult(MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		EntityCacheUtil.putResult(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucImpl.class,
			motCuaQuyTrinhThuTuc.getPrimaryKey(), motCuaQuyTrinhThuTuc);

		motCuaQuyTrinhThuTuc.resetOriginalValues();
	}

	/**
	 * Caches the mot cua quy trinh thu tucs in the entity cache if it is enabled.
	 *
	 * @param motCuaQuyTrinhThuTucs the mot cua quy trinh thu tucs
	 */
	@Override
	public void cacheResult(List<MotCuaQuyTrinhThuTuc> motCuaQuyTrinhThuTucs) {
		for (MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc : motCuaQuyTrinhThuTucs) {
			if (EntityCacheUtil.getResult(
						MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaQuyTrinhThuTucImpl.class,
						motCuaQuyTrinhThuTuc.getPrimaryKey()) == null) {
				cacheResult(motCuaQuyTrinhThuTuc);
			}
			else {
				motCuaQuyTrinhThuTuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua quy trinh thu tucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaQuyTrinhThuTucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaQuyTrinhThuTucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua quy trinh thu tuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		EntityCacheUtil.removeResult(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucImpl.class, motCuaQuyTrinhThuTuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MotCuaQuyTrinhThuTuc> motCuaQuyTrinhThuTucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc : motCuaQuyTrinhThuTucs) {
			EntityCacheUtil.removeResult(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaQuyTrinhThuTucImpl.class,
				motCuaQuyTrinhThuTuc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mot cua quy trinh thu tuc with the primary key. Does not add the mot cua quy trinh thu tuc to the database.
	 *
	 * @param id the primary key for the new mot cua quy trinh thu tuc
	 * @return the new mot cua quy trinh thu tuc
	 */
	@Override
	public MotCuaQuyTrinhThuTuc create(long id) {
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc = new MotCuaQuyTrinhThuTucImpl();

		motCuaQuyTrinhThuTuc.setNew(true);
		motCuaQuyTrinhThuTuc.setPrimaryKey(id);

		return motCuaQuyTrinhThuTuc;
	}

	/**
	 * Removes the mot cua quy trinh thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua quy trinh thu tuc
	 * @return the mot cua quy trinh thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc remove(long id)
		throws NoSuchMotCuaQuyTrinhThuTucException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua quy trinh thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua quy trinh thu tuc
	 * @return the mot cua quy trinh thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc remove(Serializable primaryKey)
		throws NoSuchMotCuaQuyTrinhThuTucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc = (MotCuaQuyTrinhThuTuc)session.get(MotCuaQuyTrinhThuTucImpl.class,
					primaryKey);

			if (motCuaQuyTrinhThuTuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaQuyTrinhThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaQuyTrinhThuTuc);
		}
		catch (NoSuchMotCuaQuyTrinhThuTucException nsee) {
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
	protected MotCuaQuyTrinhThuTuc removeImpl(
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) throws SystemException {
		motCuaQuyTrinhThuTuc = toUnwrappedModel(motCuaQuyTrinhThuTuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaQuyTrinhThuTuc)) {
				motCuaQuyTrinhThuTuc = (MotCuaQuyTrinhThuTuc)session.get(MotCuaQuyTrinhThuTucImpl.class,
						motCuaQuyTrinhThuTuc.getPrimaryKeyObj());
			}

			if (motCuaQuyTrinhThuTuc != null) {
				session.delete(motCuaQuyTrinhThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaQuyTrinhThuTuc != null) {
			clearCache(motCuaQuyTrinhThuTuc);
		}

		return motCuaQuyTrinhThuTuc;
	}

	@Override
	public MotCuaQuyTrinhThuTuc updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc)
		throws SystemException {
		motCuaQuyTrinhThuTuc = toUnwrappedModel(motCuaQuyTrinhThuTuc);

		boolean isNew = motCuaQuyTrinhThuTuc.isNew();

		MotCuaQuyTrinhThuTucModelImpl motCuaQuyTrinhThuTucModelImpl = (MotCuaQuyTrinhThuTucModelImpl)motCuaQuyTrinhThuTuc;

		Session session = null;

		try {
			session = openSession();

			if (motCuaQuyTrinhThuTuc.isNew()) {
				session.save(motCuaQuyTrinhThuTuc);

				motCuaQuyTrinhThuTuc.setNew(false);
			}
			else {
				session.merge(motCuaQuyTrinhThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaQuyTrinhThuTucModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaQuyTrinhThuTucModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHIDANDTOCHUCXULY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaQuyTrinhThuTucModelImpl.getOriginalThuTucHanhChinhId(),
						motCuaQuyTrinhThuTucModelImpl.getOriginalToChucXuLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
					args);

				args = new Object[] {
						motCuaQuyTrinhThuTucModelImpl.getThuTucHanhChinhId(),
						motCuaQuyTrinhThuTucModelImpl.getToChucXuLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHIDANDTOCHUCXULY,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaQuyTrinhThuTucImpl.class,
			motCuaQuyTrinhThuTuc.getPrimaryKey(), motCuaQuyTrinhThuTuc);

		return motCuaQuyTrinhThuTuc;
	}

	protected MotCuaQuyTrinhThuTuc toUnwrappedModel(
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		if (motCuaQuyTrinhThuTuc instanceof MotCuaQuyTrinhThuTucImpl) {
			return motCuaQuyTrinhThuTuc;
		}

		MotCuaQuyTrinhThuTucImpl motCuaQuyTrinhThuTucImpl = new MotCuaQuyTrinhThuTucImpl();

		motCuaQuyTrinhThuTucImpl.setNew(motCuaQuyTrinhThuTuc.isNew());
		motCuaQuyTrinhThuTucImpl.setPrimaryKey(motCuaQuyTrinhThuTuc.getPrimaryKey());

		motCuaQuyTrinhThuTucImpl.setId(motCuaQuyTrinhThuTuc.getId());
		motCuaQuyTrinhThuTucImpl.setThuTucHanhChinhId(motCuaQuyTrinhThuTuc.getThuTucHanhChinhId());
		motCuaQuyTrinhThuTucImpl.setMaQuyTrinh(motCuaQuyTrinhThuTuc.getMaQuyTrinh());
		motCuaQuyTrinhThuTucImpl.setToChucXuLy(motCuaQuyTrinhThuTuc.getToChucXuLy());
		motCuaQuyTrinhThuTucImpl.setSoNgayXuLy(motCuaQuyTrinhThuTuc.getSoNgayXuLy());

		return motCuaQuyTrinhThuTucImpl;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua quy trinh thu tuc
	 * @return the mot cua quy trinh thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaQuyTrinhThuTucException, SystemException {
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc = fetchByPrimaryKey(primaryKey);

		if (motCuaQuyTrinhThuTuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaQuyTrinhThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaQuyTrinhThuTuc;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua quy trinh thu tuc
	 * @return the mot cua quy trinh thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc findByPrimaryKey(long id)
		throws NoSuchMotCuaQuyTrinhThuTucException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua quy trinh thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua quy trinh thu tuc
	 * @return the mot cua quy trinh thu tuc, or <code>null</code> if a mot cua quy trinh thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc = (MotCuaQuyTrinhThuTuc)EntityCacheUtil.getResult(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaQuyTrinhThuTucImpl.class, primaryKey);

		if (motCuaQuyTrinhThuTuc == _nullMotCuaQuyTrinhThuTuc) {
			return null;
		}

		if (motCuaQuyTrinhThuTuc == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaQuyTrinhThuTuc = (MotCuaQuyTrinhThuTuc)session.get(MotCuaQuyTrinhThuTucImpl.class,
						primaryKey);

				if (motCuaQuyTrinhThuTuc != null) {
					cacheResult(motCuaQuyTrinhThuTuc);
				}
				else {
					EntityCacheUtil.putResult(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaQuyTrinhThuTucImpl.class, primaryKey,
						_nullMotCuaQuyTrinhThuTuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaQuyTrinhThuTucModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaQuyTrinhThuTucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaQuyTrinhThuTuc;
	}

	/**
	 * Returns the mot cua quy trinh thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua quy trinh thu tuc
	 * @return the mot cua quy trinh thu tuc, or <code>null</code> if a mot cua quy trinh thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaQuyTrinhThuTuc fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua quy trinh thu tucs.
	 *
	 * @return the mot cua quy trinh thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua quy trinh thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua quy trinh thu tucs
	 * @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	 * @return the range of mot cua quy trinh thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTuc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua quy trinh thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua quy trinh thu tucs
	 * @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua quy trinh thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaQuyTrinhThuTuc> findAll(int start, int end,
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

		List<MotCuaQuyTrinhThuTuc> list = (List<MotCuaQuyTrinhThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAQUYTRINHTHUTUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAQUYTRINHTHUTUC;

				if (pagination) {
					sql = sql.concat(MotCuaQuyTrinhThuTucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaQuyTrinhThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaQuyTrinhThuTuc>(list);
				}
				else {
					list = (List<MotCuaQuyTrinhThuTuc>)QueryUtil.list(q,
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
	 * Removes all the mot cua quy trinh thu tucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc : findAll()) {
			remove(motCuaQuyTrinhThuTuc);
		}
	}

	/**
	 * Returns the number of mot cua quy trinh thu tucs.
	 *
	 * @return the number of mot cua quy trinh thu tucs
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAQUYTRINHTHUTUC);

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
	 * Initializes the mot cua quy trinh thu tuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaQuyTrinhThuTuc>> listenersList = new ArrayList<ModelListener<MotCuaQuyTrinhThuTuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaQuyTrinhThuTuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaQuyTrinhThuTucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAQUYTRINHTHUTUC = "SELECT motCuaQuyTrinhThuTuc FROM MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc";
	private static final String _SQL_SELECT_MOTCUAQUYTRINHTHUTUC_WHERE = "SELECT motCuaQuyTrinhThuTuc FROM MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc WHERE ";
	private static final String _SQL_COUNT_MOTCUAQUYTRINHTHUTUC = "SELECT COUNT(motCuaQuyTrinhThuTuc) FROM MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc";
	private static final String _SQL_COUNT_MOTCUAQUYTRINHTHUTUC_WHERE = "SELECT COUNT(motCuaQuyTrinhThuTuc) FROM MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaQuyTrinhThuTuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaQuyTrinhThuTuc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaQuyTrinhThuTuc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaQuyTrinhThuTucPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thuTucHanhChinhId", "maQuyTrinh", "toChucXuLy", "soNgayXuLy"
			});
	private static MotCuaQuyTrinhThuTuc _nullMotCuaQuyTrinhThuTuc = new MotCuaQuyTrinhThuTucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaQuyTrinhThuTuc> toCacheModel() {
				return _nullMotCuaQuyTrinhThuTucCacheModel;
			}
		};

	private static CacheModel<MotCuaQuyTrinhThuTuc> _nullMotCuaQuyTrinhThuTucCacheModel =
		new CacheModel<MotCuaQuyTrinhThuTuc>() {
			@Override
			public MotCuaQuyTrinhThuTuc toEntityModel() {
				return _nullMotCuaQuyTrinhThuTuc;
			}
		};
}