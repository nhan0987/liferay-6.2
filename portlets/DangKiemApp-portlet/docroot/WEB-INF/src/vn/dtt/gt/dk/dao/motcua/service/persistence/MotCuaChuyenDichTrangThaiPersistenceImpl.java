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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua chuyen dich trang thai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaChuyenDichTrangThaiPersistence
 * @see MotCuaChuyenDichTrangThaiUtil
 * @generated
 */
public class MotCuaChuyenDichTrangThaiPersistenceImpl
	extends BasePersistenceImpl<MotCuaChuyenDichTrangThai>
	implements MotCuaChuyenDichTrangThaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaChuyenDichTrangThaiUtil} to access the mot cua chuyen dich trang thai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaChuyenDichTrangThaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDieuKienChuyenDich",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDieuKienChuyenDich",
			new String[] { String.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.DIEUKIENCHUYENDICH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDieuKienChuyenDich", new String[] { String.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		String dieuKienChuyenDich) throws SystemException {
		return findByDieuKienChuyenDich(dieuKienChuyenDich, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		String dieuKienChuyenDich, int start, int end)
		throws SystemException {
		return findByDieuKienChuyenDich(dieuKienChuyenDich, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		String dieuKienChuyenDich, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH;
			finderArgs = new Object[] { dieuKienChuyenDich };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH;
			finderArgs = new Object[] {
					dieuKienChuyenDich,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if (!Validator.equals(dieuKienChuyenDich,
							motCuaChuyenDichTrangThai.getDieuKienChuyenDich())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_First(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDich_First(dieuKienChuyenDich,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_First(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDich(dieuKienChuyenDich,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_Last(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDich_Last(dieuKienChuyenDich,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_Last(
		String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDieuKienChuyenDich(dieuKienChuyenDich);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDich(dieuKienChuyenDich,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDich_PrevAndNext(
		long id, String dieuKienChuyenDich, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByDieuKienChuyenDich_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByDieuKienChuyenDich_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
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

	protected MotCuaChuyenDichTrangThai getByDieuKienChuyenDich_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		String dieuKienChuyenDich, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		boolean bindDieuKienChuyenDich = false;

		if (dieuKienChuyenDich == null) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
		}
		else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
		}
		else {
			bindDieuKienChuyenDich = true;

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDieuKienChuyenDich) {
			qPos.add(dieuKienChuyenDich);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; from the database.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDieuKienChuyenDich(String dieuKienChuyenDich)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByDieuKienChuyenDich(
				dieuKienChuyenDich, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDieuKienChuyenDich(String dieuKienChuyenDich)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH;

		Object[] finderArgs = new Object[] { dieuKienChuyenDich };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
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

	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_1 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_2 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich = ?";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICH_DIEUKIENCHUYENDICH_3 =
		"(motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL OR motCuaChuyenDichTrangThai.dieuKienChuyenDich = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDieuKienChuyenDichAndTrangThaiNguonId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDieuKienChuyenDichAndTrangThaiNguonId",
			new String[] { String.class.getName(), Long.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.DIEUKIENCHUYENDICH_COLUMN_BITMASK |
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAINGUONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDieuKienChuyenDichAndTrangThaiNguonId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		String dieuKienChuyenDich, long trangThaiNguonId)
		throws SystemException {
		return findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		String dieuKienChuyenDich, long trangThaiNguonId, int start, int end)
		throws SystemException {
		return findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		String dieuKienChuyenDich, long trangThaiNguonId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID;
			finderArgs = new Object[] { dieuKienChuyenDich, trangThaiNguonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID;
			finderArgs = new Object[] {
					dieuKienChuyenDich, trangThaiNguonId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if (!Validator.equals(dieuKienChuyenDich,
							motCuaChuyenDichTrangThai.getDieuKienChuyenDich()) ||
						(trangThaiNguonId != motCuaChuyenDichTrangThai.getTrangThaiNguonId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_TRANGTHAINGUONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(trangThaiNguonId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonId_First(
		String dieuKienChuyenDich, long trangThaiNguonId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDichAndTrangThaiNguonId_First(dieuKienChuyenDich,
				trangThaiNguonId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(", trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonId_First(
		String dieuKienChuyenDich, long trangThaiNguonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
				trangThaiNguonId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonId_Last(
		String dieuKienChuyenDich, long trangThaiNguonId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByDieuKienChuyenDichAndTrangThaiNguonId_Last(dieuKienChuyenDich,
				trangThaiNguonId, orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dieuKienChuyenDich=");
		msg.append(dieuKienChuyenDich);

		msg.append(", trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonId_Last(
		String dieuKienChuyenDich, long trangThaiNguonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
				trangThaiNguonId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
				trangThaiNguonId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDichAndTrangThaiNguonId_PrevAndNext(
		long id, String dieuKienChuyenDich, long trangThaiNguonId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByDieuKienChuyenDichAndTrangThaiNguonId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					trangThaiNguonId, orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByDieuKienChuyenDichAndTrangThaiNguonId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, dieuKienChuyenDich,
					trangThaiNguonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaChuyenDichTrangThai getByDieuKienChuyenDichAndTrangThaiNguonId_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		String dieuKienChuyenDich, long trangThaiNguonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		boolean bindDieuKienChuyenDich = false;

		if (dieuKienChuyenDich == null) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_1);
		}
		else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_3);
		}
		else {
			bindDieuKienChuyenDich = true;

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_2);
		}

		query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_TRANGTHAINGUONID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDieuKienChuyenDich) {
			qPos.add(dieuKienChuyenDich);
		}

		qPos.add(trangThaiNguonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; from the database.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDieuKienChuyenDichAndTrangThaiNguonId(
		String dieuKienChuyenDich, long trangThaiNguonId)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByDieuKienChuyenDichAndTrangThaiNguonId(
				dieuKienChuyenDich, trangThaiNguonId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	 *
	 * @param dieuKienChuyenDich the dieu kien chuyen dich
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDieuKienChuyenDichAndTrangThaiNguonId(
		String dieuKienChuyenDich, long trangThaiNguonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID;

		Object[] finderArgs = new Object[] { dieuKienChuyenDich, trangThaiNguonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			boolean bindDieuKienChuyenDich = false;

			if (dieuKienChuyenDich == null) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_1);
			}
			else if (dieuKienChuyenDich.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_3);
			}
			else {
				bindDieuKienChuyenDich = true;

				query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_2);
			}

			query.append(_FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_TRANGTHAINGUONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDieuKienChuyenDich) {
					qPos.add(dieuKienChuyenDich);
				}

				qPos.add(trangThaiNguonId);

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

	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_1 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL AND ";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_2 =
		"motCuaChuyenDichTrangThai.dieuKienChuyenDich = ? AND ";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_DIEUKIENCHUYENDICH_3 =
		"(motCuaChuyenDichTrangThai.dieuKienChuyenDich IS NULL OR motCuaChuyenDichTrangThai.dieuKienChuyenDich = '') AND ";
	private static final String _FINDER_COLUMN_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID_TRANGTHAINGUONID_2 =
		"motCuaChuyenDichTrangThai.trangThaiNguonId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAIDICHID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrangThaiDichId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTrangThaiDichId",
			new String[] { Long.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAIDICHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAIDICHID = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTrangThaiDichId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId) throws SystemException {
		return findByTrangThaiDichId(trangThaiDichId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end) throws SystemException {
		return findByTrangThaiDichId(trangThaiDichId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID;
			finderArgs = new Object[] { trangThaiDichId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAIDICHID;
			finderArgs = new Object[] {
					trangThaiDichId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if ((trangThaiDichId != motCuaChuyenDichTrangThai.getTrangThaiDichId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiDichId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiDichId_First(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiDichId_First(trangThaiDichId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiDichId=");
		msg.append(trangThaiDichId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_First(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiDichId(trangThaiDichId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiDichId_Last(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiDichId_Last(trangThaiDichId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiDichId=");
		msg.append(trangThaiDichId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_Last(
		long trangThaiDichId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTrangThaiDichId(trangThaiDichId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiDichId(trangThaiDichId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param trangThaiDichId the trang thai dich ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByTrangThaiDichId_PrevAndNext(
		long id, long trangThaiDichId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByTrangThaiDichId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiDichId,
					orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByTrangThaiDichId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiDichId,
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

	protected MotCuaChuyenDichTrangThai getByTrangThaiDichId_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		long trangThaiDichId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThaiDichId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where trangThaiDichId = &#63; from the database.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTrangThaiDichId(long trangThaiDichId)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByTrangThaiDichId(
				trangThaiDichId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	 *
	 * @param trangThaiDichId the trang thai dich ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThaiDichId(long trangThaiDichId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAIDICHID;

		Object[] finderArgs = new Object[] { trangThaiDichId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiDichId);

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

	private static final String _FINDER_COLUMN_TRANGTHAIDICHID_TRANGTHAIDICHID_2 =
		"motCuaChuyenDichTrangThai.trangThaiDichId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAINGUONID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrangThaiNguonId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID =
		new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTrangThaiNguonId", new String[] { Long.class.getName() },
			MotCuaChuyenDichTrangThaiModelImpl.TRANGTHAINGUONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAINGUONID = new FinderPath(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTrangThaiNguonId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId) throws SystemException {
		return findByTrangThaiNguonId(trangThaiNguonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end) throws SystemException {
		return findByTrangThaiNguonId(trangThaiNguonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID;
			finderArgs = new Object[] { trangThaiNguonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAINGUONID;
			finderArgs = new Object[] {
					trangThaiNguonId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : list) {
				if ((trangThaiNguonId != motCuaChuyenDichTrangThai.getTrangThaiNguonId())) {
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

			query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiNguonId);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiNguonId_First(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiNguonId_First(trangThaiNguonId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_First(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiNguonId(trangThaiNguonId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByTrangThaiNguonId_Last(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByTrangThaiNguonId_Last(trangThaiNguonId,
				orderByComparator);

		if (motCuaChuyenDichTrangThai != null) {
			return motCuaChuyenDichTrangThai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiNguonId=");
		msg.append(trangThaiNguonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaChuyenDichTrangThaiException(msg.toString());
	}

	/**
	 * Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_Last(
		long trangThaiNguonId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTrangThaiNguonId(trangThaiNguonId);

		if (count == 0) {
			return null;
		}

		List<MotCuaChuyenDichTrangThai> list = findByTrangThaiNguonId(trangThaiNguonId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	 *
	 * @param id the primary key of the current mot cua chuyen dich trang thai
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai[] findByTrangThaiNguonId_PrevAndNext(
		long id, long trangThaiNguonId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai[] array = new MotCuaChuyenDichTrangThaiImpl[3];

			array[0] = getByTrangThaiNguonId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiNguonId,
					orderByComparator, true);

			array[1] = motCuaChuyenDichTrangThai;

			array[2] = getByTrangThaiNguonId_PrevAndNext(session,
					motCuaChuyenDichTrangThai, trangThaiNguonId,
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

	protected MotCuaChuyenDichTrangThai getByTrangThaiNguonId_PrevAndNext(
		Session session, MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		long trangThaiNguonId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2);

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
			query.append(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThaiNguonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaChuyenDichTrangThai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaChuyenDichTrangThai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63; from the database.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTrangThaiNguonId(long trangThaiNguonId)
		throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findByTrangThaiNguonId(
				trangThaiNguonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	 *
	 * @param trangThaiNguonId the trang thai nguon ID
	 * @return the number of matching mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThaiNguonId(long trangThaiNguonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAINGUONID;

		Object[] finderArgs = new Object[] { trangThaiNguonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiNguonId);

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

	private static final String _FINDER_COLUMN_TRANGTHAINGUONID_TRANGTHAINGUONID_2 =
		"motCuaChuyenDichTrangThai.trangThaiNguonId = ?";

	public MotCuaChuyenDichTrangThaiPersistenceImpl() {
		setModelClass(MotCuaChuyenDichTrangThai.class);
	}

	/**
	 * Caches the mot cua chuyen dich trang thai in the entity cache if it is enabled.
	 *
	 * @param motCuaChuyenDichTrangThai the mot cua chuyen dich trang thai
	 */
	@Override
	public void cacheResult(MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		EntityCacheUtil.putResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			motCuaChuyenDichTrangThai.getPrimaryKey(), motCuaChuyenDichTrangThai);

		motCuaChuyenDichTrangThai.resetOriginalValues();
	}

	/**
	 * Caches the mot cua chuyen dich trang thais in the entity cache if it is enabled.
	 *
	 * @param motCuaChuyenDichTrangThais the mot cua chuyen dich trang thais
	 */
	@Override
	public void cacheResult(
		List<MotCuaChuyenDichTrangThai> motCuaChuyenDichTrangThais) {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : motCuaChuyenDichTrangThais) {
			if (EntityCacheUtil.getResult(
						MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaChuyenDichTrangThaiImpl.class,
						motCuaChuyenDichTrangThai.getPrimaryKey()) == null) {
				cacheResult(motCuaChuyenDichTrangThai);
			}
			else {
				motCuaChuyenDichTrangThai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua chuyen dich trang thais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaChuyenDichTrangThaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaChuyenDichTrangThaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua chuyen dich trang thai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		EntityCacheUtil.removeResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			motCuaChuyenDichTrangThai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<MotCuaChuyenDichTrangThai> motCuaChuyenDichTrangThais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : motCuaChuyenDichTrangThais) {
			EntityCacheUtil.removeResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaChuyenDichTrangThaiImpl.class,
				motCuaChuyenDichTrangThai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mot cua chuyen dich trang thai with the primary key. Does not add the mot cua chuyen dich trang thai to the database.
	 *
	 * @param id the primary key for the new mot cua chuyen dich trang thai
	 * @return the new mot cua chuyen dich trang thai
	 */
	@Override
	public MotCuaChuyenDichTrangThai create(long id) {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = new MotCuaChuyenDichTrangThaiImpl();

		motCuaChuyenDichTrangThai.setNew(true);
		motCuaChuyenDichTrangThai.setPrimaryKey(id);

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Removes the mot cua chuyen dich trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai remove(long id)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua chuyen dich trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai remove(Serializable primaryKey)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)session.get(MotCuaChuyenDichTrangThaiImpl.class,
					primaryKey);

			if (motCuaChuyenDichTrangThai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaChuyenDichTrangThaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaChuyenDichTrangThai);
		}
		catch (NoSuchMotCuaChuyenDichTrangThaiException nsee) {
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
	protected MotCuaChuyenDichTrangThai removeImpl(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws SystemException {
		motCuaChuyenDichTrangThai = toUnwrappedModel(motCuaChuyenDichTrangThai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaChuyenDichTrangThai)) {
				motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)session.get(MotCuaChuyenDichTrangThaiImpl.class,
						motCuaChuyenDichTrangThai.getPrimaryKeyObj());
			}

			if (motCuaChuyenDichTrangThai != null) {
				session.delete(motCuaChuyenDichTrangThai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaChuyenDichTrangThai != null) {
			clearCache(motCuaChuyenDichTrangThai);
		}

		return motCuaChuyenDichTrangThai;
	}

	@Override
	public MotCuaChuyenDichTrangThai updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws SystemException {
		motCuaChuyenDichTrangThai = toUnwrappedModel(motCuaChuyenDichTrangThai);

		boolean isNew = motCuaChuyenDichTrangThai.isNew();

		MotCuaChuyenDichTrangThaiModelImpl motCuaChuyenDichTrangThaiModelImpl = (MotCuaChuyenDichTrangThaiModelImpl)motCuaChuyenDichTrangThai;

		Session session = null;

		try {
			session = openSession();

			if (motCuaChuyenDichTrangThai.isNew()) {
				session.save(motCuaChuyenDichTrangThai);

				motCuaChuyenDichTrangThai.setNew(false);
			}
			else {
				session.merge(motCuaChuyenDichTrangThai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!MotCuaChuyenDichTrangThaiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalDieuKienChuyenDich()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getDieuKienChuyenDich()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICH,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalDieuKienChuyenDich(),
						motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getDieuKienChuyenDich(),
						motCuaChuyenDichTrangThaiModelImpl.getTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DIEUKIENCHUYENDICHANDTRANGTHAINGUONID,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiDichId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAIDICHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getTrangThaiDichId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAIDICHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAIDICHID,
					args);
			}

			if ((motCuaChuyenDichTrangThaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getOriginalTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID,
					args);

				args = new Object[] {
						motCuaChuyenDichTrangThaiModelImpl.getTrangThaiNguonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAINGUONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAINGUONID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaChuyenDichTrangThaiImpl.class,
			motCuaChuyenDichTrangThai.getPrimaryKey(), motCuaChuyenDichTrangThai);

		return motCuaChuyenDichTrangThai;
	}

	protected MotCuaChuyenDichTrangThai toUnwrappedModel(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		if (motCuaChuyenDichTrangThai instanceof MotCuaChuyenDichTrangThaiImpl) {
			return motCuaChuyenDichTrangThai;
		}

		MotCuaChuyenDichTrangThaiImpl motCuaChuyenDichTrangThaiImpl = new MotCuaChuyenDichTrangThaiImpl();

		motCuaChuyenDichTrangThaiImpl.setNew(motCuaChuyenDichTrangThai.isNew());
		motCuaChuyenDichTrangThaiImpl.setPrimaryKey(motCuaChuyenDichTrangThai.getPrimaryKey());

		motCuaChuyenDichTrangThaiImpl.setId(motCuaChuyenDichTrangThai.getId());
		motCuaChuyenDichTrangThaiImpl.setTrangThaiNguonId(motCuaChuyenDichTrangThai.getTrangThaiNguonId());
		motCuaChuyenDichTrangThaiImpl.setTrangThaiDichId(motCuaChuyenDichTrangThai.getTrangThaiDichId());
		motCuaChuyenDichTrangThaiImpl.setDieuKienChuyenDich(motCuaChuyenDichTrangThai.getDieuKienChuyenDich());
		motCuaChuyenDichTrangThaiImpl.setHanhDongXuLy(motCuaChuyenDichTrangThai.getHanhDongXuLy());
		motCuaChuyenDichTrangThaiImpl.setSoNgayXuLy(motCuaChuyenDichTrangThai.getSoNgayXuLy());
		motCuaChuyenDichTrangThaiImpl.setPhanNhomHoSoId(motCuaChuyenDichTrangThai.getPhanNhomHoSoId());

		return motCuaChuyenDichTrangThaiImpl;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = fetchByPrimaryKey(primaryKey);

		if (motCuaChuyenDichTrangThai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaChuyenDichTrangThaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai findByPrimaryKey(long id)
		throws NoSuchMotCuaChuyenDichTrangThaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai, or <code>null</code> if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)EntityCacheUtil.getResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaChuyenDichTrangThaiImpl.class, primaryKey);

		if (motCuaChuyenDichTrangThai == _nullMotCuaChuyenDichTrangThai) {
			return null;
		}

		if (motCuaChuyenDichTrangThai == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaChuyenDichTrangThai = (MotCuaChuyenDichTrangThai)session.get(MotCuaChuyenDichTrangThaiImpl.class,
						primaryKey);

				if (motCuaChuyenDichTrangThai != null) {
					cacheResult(motCuaChuyenDichTrangThai);
				}
				else {
					EntityCacheUtil.putResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaChuyenDichTrangThaiImpl.class, primaryKey,
						_nullMotCuaChuyenDichTrangThai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaChuyenDichTrangThaiModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaChuyenDichTrangThaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaChuyenDichTrangThai;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua chuyen dich trang thai
	 * @return the mot cua chuyen dich trang thai, or <code>null</code> if a mot cua chuyen dich trang thai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaChuyenDichTrangThai fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua chuyen dich trang thais.
	 *
	 * @return the mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua chuyen dich trang thais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @return the range of mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua chuyen dich trang thais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua chuyen dich trang thais
	 * @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua chuyen dich trang thais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaChuyenDichTrangThai> findAll(int start, int end,
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

		List<MotCuaChuyenDichTrangThai> list = (List<MotCuaChuyenDichTrangThai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI;

				if (pagination) {
					sql = sql.concat(MotCuaChuyenDichTrangThaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaChuyenDichTrangThai>(list);
				}
				else {
					list = (List<MotCuaChuyenDichTrangThai>)QueryUtil.list(q,
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
	 * Removes all the mot cua chuyen dich trang thais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : findAll()) {
			remove(motCuaChuyenDichTrangThai);
		}
	}

	/**
	 * Returns the number of mot cua chuyen dich trang thais.
	 *
	 * @return the number of mot cua chuyen dich trang thais
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI);

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
	 * Initializes the mot cua chuyen dich trang thai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaChuyenDichTrangThai>> listenersList = new ArrayList<ModelListener<MotCuaChuyenDichTrangThai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaChuyenDichTrangThai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaChuyenDichTrangThaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI = "SELECT motCuaChuyenDichTrangThai FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai";
	private static final String _SQL_SELECT_MOTCUACHUYENDICHTRANGTHAI_WHERE = "SELECT motCuaChuyenDichTrangThai FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai WHERE ";
	private static final String _SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI = "SELECT COUNT(motCuaChuyenDichTrangThai) FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai";
	private static final String _SQL_COUNT_MOTCUACHUYENDICHTRANGTHAI_WHERE = "SELECT COUNT(motCuaChuyenDichTrangThai) FROM MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaChuyenDichTrangThai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaChuyenDichTrangThai exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaChuyenDichTrangThai exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaChuyenDichTrangThaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"trangThaiNguonId", "trangThaiDichId", "dieuKienChuyenDich",
				"hanhDongXuLy", "soNgayXuLy", "phanNhomHoSoId"
			});
	private static MotCuaChuyenDichTrangThai _nullMotCuaChuyenDichTrangThai = new MotCuaChuyenDichTrangThaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaChuyenDichTrangThai> toCacheModel() {
				return _nullMotCuaChuyenDichTrangThaiCacheModel;
			}
		};

	private static CacheModel<MotCuaChuyenDichTrangThai> _nullMotCuaChuyenDichTrangThaiCacheModel =
		new CacheModel<MotCuaChuyenDichTrangThai>() {
			@Override
			public MotCuaChuyenDichTrangThai toEntityModel() {
				return _nullMotCuaChuyenDichTrangThai;
			}
		};
}