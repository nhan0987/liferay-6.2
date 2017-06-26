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

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua phieu xu ly phu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPhuPersistence
 * @see MotCuaPhieuXuLyPhuUtil
 * @generated
 */
public class MotCuaPhieuXuLyPhuPersistenceImpl extends BasePersistenceImpl<MotCuaPhieuXuLyPhu>
	implements MotCuaPhieuXuLyPhuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaPhieuXuLyPhuUtil} to access the mot cua phieu xu ly phu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaPhieuXuLyPhuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPhieuXuLyChinhIdAndNoiDungHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaPhieuXuLyPhuModelImpl.PHIEUXULYCHINHID_COLUMN_BITMASK |
			MotCuaPhieuXuLyPhuModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyChinhIdAndNoiDungHoSoId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException} if it could not be found.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
				noiDungHoSoId);

		if (motCuaPhieuXuLyPhu == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("phieuXuLyChinhId=");
			msg.append(phieuXuLyChinhId);

			msg.append(", noiDungHoSoId=");
			msg.append(noiDungHoSoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
		}

		return motCuaPhieuXuLyPhu;
	}

	/**
	 * Returns the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId) throws SystemException {
		return fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId, true);
	}

	/**
	 * Returns the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { phieuXuLyChinhId, noiDungHoSoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
					finderArgs, this);
		}

		if (result instanceof MotCuaPhieuXuLyPhu) {
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = (MotCuaPhieuXuLyPhu)result;

			if ((phieuXuLyChinhId != motCuaPhieuXuLyPhu.getPhieuXuLyChinhId()) ||
					(noiDungHoSoId != motCuaPhieuXuLyPhu.getNoiDungHoSoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNOIDUNGHOSOID_PHIEUXULYCHINHID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNOIDUNGHOSOID_NOIDUNGHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				qPos.add(noiDungHoSoId);

				List<MotCuaPhieuXuLyPhu> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaPhieuXuLyPhuPersistenceImpl.fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = list.get(0);

					result = motCuaPhieuXuLyPhu;

					cacheResult(motCuaPhieuXuLyPhu);

					if ((motCuaPhieuXuLyPhu.getPhieuXuLyChinhId() != phieuXuLyChinhId) ||
							(motCuaPhieuXuLyPhu.getNoiDungHoSoId() != noiDungHoSoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
							finderArgs, motCuaPhieuXuLyPhu);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
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
			return (MotCuaPhieuXuLyPhu)result;
		}
	}

	/**
	 * Removes the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; from the database.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the mot cua phieu xu ly phu that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu removeByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = findByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
				noiDungHoSoId);

		return remove(motCuaPhieuXuLyPhu);
	}

	/**
	 * Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param noiDungHoSoId the noi dung ho so ID
	 * @return the number of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyChinhIdAndNoiDungHoSoId(long phieuXuLyChinhId,
		long noiDungHoSoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID;

		Object[] finderArgs = new Object[] { phieuXuLyChinhId, noiDungHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNOIDUNGHOSOID_PHIEUXULYCHINHID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNOIDUNGHOSOID_NOIDUNGHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYCHINHIDANDNOIDUNGHOSOID_PHIEUXULYCHINHID_2 =
		"motCuaPhieuXuLyPhu.phieuXuLyChinhId = ? AND ";
	private static final String _FINDER_COLUMN_PHIEUXULYCHINHIDANDNOIDUNGHOSOID_NOIDUNGHOSOID_2 =
		"motCuaPhieuXuLyPhu.noiDungHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuXuLyChinhId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPhieuXuLyChinhId", new String[] { Long.class.getName() },
			MotCuaPhieuXuLyPhuModelImpl.PHIEUXULYCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID = new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId) throws SystemException {
		return findByPhieuXuLyChinhId(phieuXuLyChinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @return the range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end) throws SystemException {
		return findByPhieuXuLyChinhId(phieuXuLyChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
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

		List<MotCuaPhieuXuLyPhu> list = (List<MotCuaPhieuXuLyPhu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : list) {
				if ((phieuXuLyChinhId != motCuaPhieuXuLyPhu.getPhieuXuLyChinhId())) {
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

			query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHID_PHIEUXULYCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLyPhu>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
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
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhieuXuLyChinhId_First(phieuXuLyChinhId,
				orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaPhieuXuLyPhu> list = findByPhieuXuLyChinhId(phieuXuLyChinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhieuXuLyChinhId_Last(phieuXuLyChinhId,
				orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPhieuXuLyChinhId(phieuXuLyChinhId);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhieuXuLyPhu> list = findByPhieuXuLyChinhId(phieuXuLyChinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	 *
	 * @param id the primary key of the current mot cua phieu xu ly phu
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu[] findByPhieuXuLyChinhId_PrevAndNext(long id,
		long phieuXuLyChinhId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLyPhu[] array = new MotCuaPhieuXuLyPhuImpl[3];

			array[0] = getByPhieuXuLyChinhId_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phieuXuLyChinhId, orderByComparator,
					true);

			array[1] = motCuaPhieuXuLyPhu;

			array[2] = getByPhieuXuLyChinhId_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phieuXuLyChinhId, orderByComparator,
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

	protected MotCuaPhieuXuLyPhu getByPhieuXuLyChinhId_PrevAndNext(
		Session session, MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu,
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

		query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

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
			query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhieuXuLyPhu);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhieuXuLyPhu> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; from the database.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws SystemException {
		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : findByPhieuXuLyChinhId(
				phieuXuLyChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaPhieuXuLyPhu);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @return the number of matching mot cua phieu xu ly phus
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

			query.append(_SQL_COUNT_MOTCUAPHIEUXULYPHU_WHERE);

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
		"motCuaPhieuXuLyPhu.phieuXuLyChinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPhieuXuLyChinhIdAndNhomPhieuXuLy",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPhieuXuLyChinhIdAndNhomPhieuXuLy",
			new String[] { Long.class.getName(), String.class.getName() },
			MotCuaPhieuXuLyPhuModelImpl.PHIEUXULYCHINHID_COLUMN_BITMASK |
			MotCuaPhieuXuLyPhuModelImpl.NHOMPHIEUXULY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyChinhIdAndNhomPhieuXuLy",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @return the matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, String nhomPhieuXuLy) throws SystemException {
		return findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @return the range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, String nhomPhieuXuLy, int start, int end)
		throws SystemException {
		return findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, String nhomPhieuXuLy, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY;
			finderArgs = new Object[] { phieuXuLyChinhId, nhomPhieuXuLy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY;
			finderArgs = new Object[] {
					phieuXuLyChinhId, nhomPhieuXuLy,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaPhieuXuLyPhu> list = (List<MotCuaPhieuXuLyPhu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : list) {
				if ((phieuXuLyChinhId != motCuaPhieuXuLyPhu.getPhieuXuLyChinhId()) ||
						!Validator.equals(nhomPhieuXuLy,
							motCuaPhieuXuLyPhu.getNhomPhieuXuLy())) {
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

			query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_PHIEUXULYCHINHID_2);

			boolean bindNhomPhieuXuLy = false;

			if (nhomPhieuXuLy == null) {
				query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_1);
			}
			else if (nhomPhieuXuLy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_3);
			}
			else {
				bindNhomPhieuXuLy = true;

				query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				if (bindNhomPhieuXuLy) {
					qPos.add(nhomPhieuXuLy);
				}

				if (!pagination) {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLyPhu>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
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
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNhomPhieuXuLy_First(
		long phieuXuLyChinhId, String nhomPhieuXuLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_First(phieuXuLyChinhId,
				nhomPhieuXuLy, orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(", nhomPhieuXuLy=");
		msg.append(nhomPhieuXuLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_First(
		long phieuXuLyChinhId, String nhomPhieuXuLy,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaPhieuXuLyPhu> list = findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
				nhomPhieuXuLy, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNhomPhieuXuLy_Last(
		long phieuXuLyChinhId, String nhomPhieuXuLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_Last(phieuXuLyChinhId,
				nhomPhieuXuLy, orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(", nhomPhieuXuLy=");
		msg.append(nhomPhieuXuLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_Last(
		long phieuXuLyChinhId, String nhomPhieuXuLy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
				nhomPhieuXuLy);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhieuXuLyPhu> list = findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
				nhomPhieuXuLy, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * @param id the primary key of the current mot cua phieu xu ly phu
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu[] findByPhieuXuLyChinhIdAndNhomPhieuXuLy_PrevAndNext(
		long id, long phieuXuLyChinhId, String nhomPhieuXuLy,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLyPhu[] array = new MotCuaPhieuXuLyPhuImpl[3];

			array[0] = getByPhieuXuLyChinhIdAndNhomPhieuXuLy_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phieuXuLyChinhId, nhomPhieuXuLy,
					orderByComparator, true);

			array[1] = motCuaPhieuXuLyPhu;

			array[2] = getByPhieuXuLyChinhIdAndNhomPhieuXuLy_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phieuXuLyChinhId, nhomPhieuXuLy,
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

	protected MotCuaPhieuXuLyPhu getByPhieuXuLyChinhIdAndNhomPhieuXuLy_PrevAndNext(
		Session session, MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu,
		long phieuXuLyChinhId, String nhomPhieuXuLy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_PHIEUXULYCHINHID_2);

		boolean bindNhomPhieuXuLy = false;

		if (nhomPhieuXuLy == null) {
			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_1);
		}
		else if (nhomPhieuXuLy.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_3);
		}
		else {
			bindNhomPhieuXuLy = true;

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_2);
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
			query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyChinhId);

		if (bindNhomPhieuXuLy) {
			qPos.add(nhomPhieuXuLy);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhieuXuLyPhu);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhieuXuLyPhu> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63; from the database.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, String nhomPhieuXuLy) throws SystemException {
		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
				phieuXuLyChinhId, nhomPhieuXuLy, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaPhieuXuLyPhu);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param nhomPhieuXuLy the nhom phieu xu ly
	 * @return the number of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyChinhIdAndNhomPhieuXuLy(long phieuXuLyChinhId,
		String nhomPhieuXuLy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY;

		Object[] finderArgs = new Object[] { phieuXuLyChinhId, nhomPhieuXuLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_PHIEUXULYCHINHID_2);

			boolean bindNhomPhieuXuLy = false;

			if (nhomPhieuXuLy == null) {
				query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_1);
			}
			else if (nhomPhieuXuLy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_3);
			}
			else {
				bindNhomPhieuXuLy = true;

				query.append(_FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				if (bindNhomPhieuXuLy) {
					qPos.add(nhomPhieuXuLy);
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

	private static final String _FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_PHIEUXULYCHINHID_2 =
		"motCuaPhieuXuLyPhu.phieuXuLyChinhId = ? AND ";
	private static final String _FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_1 =
		"motCuaPhieuXuLyPhu.nhomPhieuXuLy IS NULL";
	private static final String _FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_2 =
		"motCuaPhieuXuLyPhu.nhomPhieuXuLy = ?";
	private static final String _FINDER_COLUMN_PHIEUXULYCHINHIDANDNHOMPHIEUXULY_NHOMPHIEUXULY_3 =
		"(motCuaPhieuXuLyPhu.nhomPhieuXuLy IS NULL OR motCuaPhieuXuLyPhu.nhomPhieuXuLy = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPhieuXuLyChinhAndTrangThaiHienTai",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPhieuXuLyChinhAndTrangThaiHienTai",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaPhieuXuLyPhuModelImpl.PHIEUXULYCHINHID_COLUMN_BITMASK |
			MotCuaPhieuXuLyPhuModelImpl.TRANGTHAIHIENTAIID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyChinhAndTrangThaiHienTai",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @return the matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId)
		throws SystemException {
		return findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @return the range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId, int start, int end)
		throws SystemException {
		return findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI;
			finderArgs = new Object[] { phieuXuLyChinhId, trangThaiHienTaiId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI;
			finderArgs = new Object[] {
					phieuXuLyChinhId, trangThaiHienTaiId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaPhieuXuLyPhu> list = (List<MotCuaPhieuXuLyPhu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : list) {
				if ((phieuXuLyChinhId != motCuaPhieuXuLyPhu.getPhieuXuLyChinhId()) ||
						(trangThaiHienTaiId != motCuaPhieuXuLyPhu.getTrangThaiHienTaiId())) {
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

			query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_PHIEUXULYCHINHID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_TRANGTHAIHIENTAIID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				qPos.add(trangThaiHienTaiId);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLyPhu>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
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
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhAndTrangThaiHienTai_First(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhieuXuLyChinhAndTrangThaiHienTai_First(phieuXuLyChinhId,
				trangThaiHienTaiId, orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(", trangThaiHienTaiId=");
		msg.append(trangThaiHienTaiId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhAndTrangThaiHienTai_First(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaPhieuXuLyPhu> list = findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
				trangThaiHienTaiId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhAndTrangThaiHienTai_Last(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhieuXuLyChinhAndTrangThaiHienTai_Last(phieuXuLyChinhId,
				trangThaiHienTaiId, orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyChinhId=");
		msg.append(phieuXuLyChinhId);

		msg.append(", trangThaiHienTaiId=");
		msg.append(trangThaiHienTaiId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhAndTrangThaiHienTai_Last(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
				trangThaiHienTaiId);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhieuXuLyPhu> list = findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
				trangThaiHienTaiId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * @param id the primary key of the current mot cua phieu xu ly phu
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu[] findByPhieuXuLyChinhAndTrangThaiHienTai_PrevAndNext(
		long id, long phieuXuLyChinhId, long trangThaiHienTaiId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLyPhu[] array = new MotCuaPhieuXuLyPhuImpl[3];

			array[0] = getByPhieuXuLyChinhAndTrangThaiHienTai_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phieuXuLyChinhId, trangThaiHienTaiId,
					orderByComparator, true);

			array[1] = motCuaPhieuXuLyPhu;

			array[2] = getByPhieuXuLyChinhAndTrangThaiHienTai_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phieuXuLyChinhId, trangThaiHienTaiId,
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

	protected MotCuaPhieuXuLyPhu getByPhieuXuLyChinhAndTrangThaiHienTai_PrevAndNext(
		Session session, MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu,
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_PHIEUXULYCHINHID_2);

		query.append(_FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_TRANGTHAIHIENTAIID_2);

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
			query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyChinhId);

		qPos.add(trangThaiHienTaiId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhieuXuLyPhu);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhieuXuLyPhu> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63; from the database.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId)
		throws SystemException {
		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : findByPhieuXuLyChinhAndTrangThaiHienTai(
				phieuXuLyChinhId, trangThaiHienTaiId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaPhieuXuLyPhu);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	 *
	 * @param phieuXuLyChinhId the phieu xu ly chinh ID
	 * @param trangThaiHienTaiId the trang thai hien tai ID
	 * @return the number of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyChinhAndTrangThaiHienTai(long phieuXuLyChinhId,
		long trangThaiHienTaiId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI;

		Object[] finderArgs = new Object[] { phieuXuLyChinhId, trangThaiHienTaiId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_PHIEUXULYCHINHID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_TRANGTHAIHIENTAIID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyChinhId);

				qPos.add(trangThaiHienTaiId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_PHIEUXULYCHINHID_2 =
		"motCuaPhieuXuLyPhu.phieuXuLyChinhId = ? AND ";
	private static final String _FINDER_COLUMN_PHIEUXULYCHINHANDTRANGTHAIHIENTAI_TRANGTHAIHIENTAIID_2 =
		"motCuaPhieuXuLyPhu.trangThaiHienTaiId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHANNHOMHOSOID =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhanNhomHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID =
		new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhanNhomHoSoId",
			new String[] { Long.class.getName() },
			MotCuaPhieuXuLyPhuModelImpl.PHANNHOMHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHANNHOMHOSOID = new FinderPath(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhanNhomHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @return the matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(long phanNhomHoSoId)
		throws SystemException {
		return findByPhanNhomHoSoId(phanNhomHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @return the range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(long phanNhomHoSoId,
		int start, int end) throws SystemException {
		return findByPhanNhomHoSoId(phanNhomHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(long phanNhomHoSoId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID;
			finderArgs = new Object[] { phanNhomHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHANNHOMHOSOID;
			finderArgs = new Object[] {
					phanNhomHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaPhieuXuLyPhu> list = (List<MotCuaPhieuXuLyPhu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : list) {
				if ((phanNhomHoSoId != motCuaPhieuXuLyPhu.getPhanNhomHoSoId())) {
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

			query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phanNhomHoSoId);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLyPhu>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
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
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhanNhomHoSoId_First(long phanNhomHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhanNhomHoSoId_First(phanNhomHoSoId,
				orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phanNhomHoSoId=");
		msg.append(phanNhomHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the first mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhanNhomHoSoId_First(long phanNhomHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaPhieuXuLyPhu> list = findByPhanNhomHoSoId(phanNhomHoSoId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPhanNhomHoSoId_Last(long phanNhomHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPhanNhomHoSoId_Last(phanNhomHoSoId,
				orderByComparator);

		if (motCuaPhieuXuLyPhu != null) {
			return motCuaPhieuXuLyPhu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phanNhomHoSoId=");
		msg.append(phanNhomHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaPhieuXuLyPhuException(msg.toString());
	}

	/**
	 * Returns the last mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPhanNhomHoSoId_Last(long phanNhomHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPhanNhomHoSoId(phanNhomHoSoId);

		if (count == 0) {
			return null;
		}

		List<MotCuaPhieuXuLyPhu> list = findByPhanNhomHoSoId(phanNhomHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	 *
	 * @param id the primary key of the current mot cua phieu xu ly phu
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu[] findByPhanNhomHoSoId_PrevAndNext(long id,
		long phanNhomHoSoId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLyPhu[] array = new MotCuaPhieuXuLyPhuImpl[3];

			array[0] = getByPhanNhomHoSoId_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phanNhomHoSoId, orderByComparator, true);

			array[1] = motCuaPhieuXuLyPhu;

			array[2] = getByPhanNhomHoSoId_PrevAndNext(session,
					motCuaPhieuXuLyPhu, phanNhomHoSoId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaPhieuXuLyPhu getByPhanNhomHoSoId_PrevAndNext(
		Session session, MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu,
		long phanNhomHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE);

		query.append(_FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2);

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
			query.append(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phanNhomHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaPhieuXuLyPhu);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaPhieuXuLyPhu> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63; from the database.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhanNhomHoSoId(long phanNhomHoSoId)
		throws SystemException {
		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : findByPhanNhomHoSoId(
				phanNhomHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaPhieuXuLyPhu);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	 *
	 * @param phanNhomHoSoId the phan nhom ho so ID
	 * @return the number of matching mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhanNhomHoSoId(long phanNhomHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHANNHOMHOSOID;

		Object[] finderArgs = new Object[] { phanNhomHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULYPHU_WHERE);

			query.append(_FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phanNhomHoSoId);

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

	private static final String _FINDER_COLUMN_PHANNHOMHOSOID_PHANNHOMHOSOID_2 = "motCuaPhieuXuLyPhu.phanNhomHoSoId = ?";

	public MotCuaPhieuXuLyPhuPersistenceImpl() {
		setModelClass(MotCuaPhieuXuLyPhu.class);
	}

	/**
	 * Caches the mot cua phieu xu ly phu in the entity cache if it is enabled.
	 *
	 * @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	 */
	@Override
	public void cacheResult(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		EntityCacheUtil.putResult(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class, motCuaPhieuXuLyPhu.getPrimaryKey(),
			motCuaPhieuXuLyPhu);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
			new Object[] {
				motCuaPhieuXuLyPhu.getPhieuXuLyChinhId(),
				motCuaPhieuXuLyPhu.getNoiDungHoSoId()
			}, motCuaPhieuXuLyPhu);

		motCuaPhieuXuLyPhu.resetOriginalValues();
	}

	/**
	 * Caches the mot cua phieu xu ly phus in the entity cache if it is enabled.
	 *
	 * @param motCuaPhieuXuLyPhus the mot cua phieu xu ly phus
	 */
	@Override
	public void cacheResult(List<MotCuaPhieuXuLyPhu> motCuaPhieuXuLyPhus) {
		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : motCuaPhieuXuLyPhus) {
			if (EntityCacheUtil.getResult(
						MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhieuXuLyPhuImpl.class,
						motCuaPhieuXuLyPhu.getPrimaryKey()) == null) {
				cacheResult(motCuaPhieuXuLyPhu);
			}
			else {
				motCuaPhieuXuLyPhu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua phieu xu ly phus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaPhieuXuLyPhuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaPhieuXuLyPhuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua phieu xu ly phu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		EntityCacheUtil.removeResult(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class, motCuaPhieuXuLyPhu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaPhieuXuLyPhu);
	}

	@Override
	public void clearCache(List<MotCuaPhieuXuLyPhu> motCuaPhieuXuLyPhus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : motCuaPhieuXuLyPhus) {
			EntityCacheUtil.removeResult(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhieuXuLyPhuImpl.class, motCuaPhieuXuLyPhu.getPrimaryKey());

			clearUniqueFindersCache(motCuaPhieuXuLyPhu);
		}
	}

	protected void cacheUniqueFindersCache(
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		if (motCuaPhieuXuLyPhu.isNew()) {
			Object[] args = new Object[] {
					motCuaPhieuXuLyPhu.getPhieuXuLyChinhId(),
					motCuaPhieuXuLyPhu.getNoiDungHoSoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
				args, motCuaPhieuXuLyPhu);
		}
		else {
			MotCuaPhieuXuLyPhuModelImpl motCuaPhieuXuLyPhuModelImpl = (MotCuaPhieuXuLyPhuModelImpl)motCuaPhieuXuLyPhu;

			if ((motCuaPhieuXuLyPhuModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyPhu.getPhieuXuLyChinhId(),
						motCuaPhieuXuLyPhu.getNoiDungHoSoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
					args, motCuaPhieuXuLyPhu);
			}
		}
	}

	protected void clearUniqueFindersCache(
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		MotCuaPhieuXuLyPhuModelImpl motCuaPhieuXuLyPhuModelImpl = (MotCuaPhieuXuLyPhuModelImpl)motCuaPhieuXuLyPhu;

		Object[] args = new Object[] {
				motCuaPhieuXuLyPhu.getPhieuXuLyChinhId(),
				motCuaPhieuXuLyPhu.getNoiDungHoSoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
			args);

		if ((motCuaPhieuXuLyPhuModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaPhieuXuLyPhuModelImpl.getOriginalPhieuXuLyChinhId(),
					motCuaPhieuXuLyPhuModelImpl.getOriginalNoiDungHoSoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYCHINHIDANDNOIDUNGHOSOID,
				args);
		}
	}

	/**
	 * Creates a new mot cua phieu xu ly phu with the primary key. Does not add the mot cua phieu xu ly phu to the database.
	 *
	 * @param id the primary key for the new mot cua phieu xu ly phu
	 * @return the new mot cua phieu xu ly phu
	 */
	@Override
	public MotCuaPhieuXuLyPhu create(long id) {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl();

		motCuaPhieuXuLyPhu.setNew(true);
		motCuaPhieuXuLyPhu.setPrimaryKey(id);

		return motCuaPhieuXuLyPhu;
	}

	/**
	 * Removes the mot cua phieu xu ly phu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua phieu xu ly phu
	 * @return the mot cua phieu xu ly phu that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu remove(long id)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua phieu xu ly phu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly phu
	 * @return the mot cua phieu xu ly phu that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu remove(Serializable primaryKey)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = (MotCuaPhieuXuLyPhu)session.get(MotCuaPhieuXuLyPhuImpl.class,
					primaryKey);

			if (motCuaPhieuXuLyPhu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaPhieuXuLyPhuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaPhieuXuLyPhu);
		}
		catch (NoSuchMotCuaPhieuXuLyPhuException nsee) {
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
	protected MotCuaPhieuXuLyPhu removeImpl(
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) throws SystemException {
		motCuaPhieuXuLyPhu = toUnwrappedModel(motCuaPhieuXuLyPhu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaPhieuXuLyPhu)) {
				motCuaPhieuXuLyPhu = (MotCuaPhieuXuLyPhu)session.get(MotCuaPhieuXuLyPhuImpl.class,
						motCuaPhieuXuLyPhu.getPrimaryKeyObj());
			}

			if (motCuaPhieuXuLyPhu != null) {
				session.delete(motCuaPhieuXuLyPhu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaPhieuXuLyPhu != null) {
			clearCache(motCuaPhieuXuLyPhu);
		}

		return motCuaPhieuXuLyPhu;
	}

	@Override
	public MotCuaPhieuXuLyPhu updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws SystemException {
		motCuaPhieuXuLyPhu = toUnwrappedModel(motCuaPhieuXuLyPhu);

		boolean isNew = motCuaPhieuXuLyPhu.isNew();

		MotCuaPhieuXuLyPhuModelImpl motCuaPhieuXuLyPhuModelImpl = (MotCuaPhieuXuLyPhuModelImpl)motCuaPhieuXuLyPhu;

		Session session = null;

		try {
			session = openSession();

			if (motCuaPhieuXuLyPhu.isNew()) {
				session.save(motCuaPhieuXuLyPhu);

				motCuaPhieuXuLyPhu.setNew(false);
			}
			else {
				session.merge(motCuaPhieuXuLyPhu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaPhieuXuLyPhuModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaPhieuXuLyPhuModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getOriginalPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);

				args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getPhieuXuLyChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHID,
					args);
			}

			if ((motCuaPhieuXuLyPhuModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getOriginalPhieuXuLyChinhId(),
						motCuaPhieuXuLyPhuModelImpl.getOriginalNhomPhieuXuLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY,
					args);

				args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getPhieuXuLyChinhId(),
						motCuaPhieuXuLyPhuModelImpl.getNhomPhieuXuLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHIDANDNHOMPHIEUXULY,
					args);
			}

			if ((motCuaPhieuXuLyPhuModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getOriginalPhieuXuLyChinhId(),
						motCuaPhieuXuLyPhuModelImpl.getOriginalTrangThaiHienTaiId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI,
					args);

				args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getPhieuXuLyChinhId(),
						motCuaPhieuXuLyPhuModelImpl.getTrangThaiHienTaiId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYCHINHANDTRANGTHAIHIENTAI,
					args);
			}

			if ((motCuaPhieuXuLyPhuModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getOriginalPhanNhomHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID,
					args);

				args = new Object[] {
						motCuaPhieuXuLyPhuModelImpl.getPhanNhomHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHANNHOMHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHANNHOMHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyPhuImpl.class, motCuaPhieuXuLyPhu.getPrimaryKey(),
			motCuaPhieuXuLyPhu);

		clearUniqueFindersCache(motCuaPhieuXuLyPhu);
		cacheUniqueFindersCache(motCuaPhieuXuLyPhu);

		return motCuaPhieuXuLyPhu;
	}

	protected MotCuaPhieuXuLyPhu toUnwrappedModel(
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		if (motCuaPhieuXuLyPhu instanceof MotCuaPhieuXuLyPhuImpl) {
			return motCuaPhieuXuLyPhu;
		}

		MotCuaPhieuXuLyPhuImpl motCuaPhieuXuLyPhuImpl = new MotCuaPhieuXuLyPhuImpl();

		motCuaPhieuXuLyPhuImpl.setNew(motCuaPhieuXuLyPhu.isNew());
		motCuaPhieuXuLyPhuImpl.setPrimaryKey(motCuaPhieuXuLyPhu.getPrimaryKey());

		motCuaPhieuXuLyPhuImpl.setId(motCuaPhieuXuLyPhu.getId());
		motCuaPhieuXuLyPhuImpl.setPhieuXuLyChinhId(motCuaPhieuXuLyPhu.getPhieuXuLyChinhId());
		motCuaPhieuXuLyPhuImpl.setTrichYeuNoiDung(motCuaPhieuXuLyPhu.getTrichYeuNoiDung());
		motCuaPhieuXuLyPhuImpl.setGhiChu(motCuaPhieuXuLyPhu.getGhiChu());
		motCuaPhieuXuLyPhuImpl.setTrangThaiHienTaiId(motCuaPhieuXuLyPhu.getTrangThaiHienTaiId());
		motCuaPhieuXuLyPhuImpl.setNoiDungHoSoId(motCuaPhieuXuLyPhu.getNoiDungHoSoId());
		motCuaPhieuXuLyPhuImpl.setChiemQuyenXuLy(motCuaPhieuXuLyPhu.getChiemQuyenXuLy());
		motCuaPhieuXuLyPhuImpl.setNgayTaoPhieu(motCuaPhieuXuLyPhu.getNgayTaoPhieu());
		motCuaPhieuXuLyPhuImpl.setNguoiTaoPhieu(motCuaPhieuXuLyPhu.getNguoiTaoPhieu());
		motCuaPhieuXuLyPhuImpl.setNhomPhieuXuLy(motCuaPhieuXuLyPhu.getNhomPhieuXuLy());
		motCuaPhieuXuLyPhuImpl.setPhanNhomHoSoId(motCuaPhieuXuLyPhu.getPhanNhomHoSoId());

		return motCuaPhieuXuLyPhuImpl;
	}

	/**
	 * Returns the mot cua phieu xu ly phu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly phu
	 * @return the mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = fetchByPrimaryKey(primaryKey);

		if (motCuaPhieuXuLyPhu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaPhieuXuLyPhuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaPhieuXuLyPhu;
	}

	/**
	 * Returns the mot cua phieu xu ly phu with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua phieu xu ly phu
	 * @return the mot cua phieu xu ly phu
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu findByPrimaryKey(long id)
		throws NoSuchMotCuaPhieuXuLyPhuException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua phieu xu ly phu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly phu
	 * @return the mot cua phieu xu ly phu, or <code>null</code> if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = (MotCuaPhieuXuLyPhu)EntityCacheUtil.getResult(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhieuXuLyPhuImpl.class, primaryKey);

		if (motCuaPhieuXuLyPhu == _nullMotCuaPhieuXuLyPhu) {
			return null;
		}

		if (motCuaPhieuXuLyPhu == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaPhieuXuLyPhu = (MotCuaPhieuXuLyPhu)session.get(MotCuaPhieuXuLyPhuImpl.class,
						primaryKey);

				if (motCuaPhieuXuLyPhu != null) {
					cacheResult(motCuaPhieuXuLyPhu);
				}
				else {
					EntityCacheUtil.putResult(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhieuXuLyPhuImpl.class, primaryKey,
						_nullMotCuaPhieuXuLyPhu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaPhieuXuLyPhuModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaPhieuXuLyPhuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaPhieuXuLyPhu;
	}

	/**
	 * Returns the mot cua phieu xu ly phu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua phieu xu ly phu
	 * @return the mot cua phieu xu ly phu, or <code>null</code> if a mot cua phieu xu ly phu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyPhu fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua phieu xu ly phus.
	 *
	 * @return the mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu ly phus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @return the range of mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu ly phus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phieu xu ly phus
	 * @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua phieu xu ly phus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyPhu> findAll(int start, int end,
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

		List<MotCuaPhieuXuLyPhu> list = (List<MotCuaPhieuXuLyPhu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAPHIEUXULYPHU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAPHIEUXULYPHU;

				if (pagination) {
					sql = sql.concat(MotCuaPhieuXuLyPhuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLyPhu>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLyPhu>)QueryUtil.list(q,
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
	 * Removes all the mot cua phieu xu ly phus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : findAll()) {
			remove(motCuaPhieuXuLyPhu);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu ly phus.
	 *
	 * @return the number of mot cua phieu xu ly phus
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAPHIEUXULYPHU);

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
	 * Initializes the mot cua phieu xu ly phu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaPhieuXuLyPhu>> listenersList = new ArrayList<ModelListener<MotCuaPhieuXuLyPhu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaPhieuXuLyPhu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaPhieuXuLyPhuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAPHIEUXULYPHU = "SELECT motCuaPhieuXuLyPhu FROM MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu";
	private static final String _SQL_SELECT_MOTCUAPHIEUXULYPHU_WHERE = "SELECT motCuaPhieuXuLyPhu FROM MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu WHERE ";
	private static final String _SQL_COUNT_MOTCUAPHIEUXULYPHU = "SELECT COUNT(motCuaPhieuXuLyPhu) FROM MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu";
	private static final String _SQL_COUNT_MOTCUAPHIEUXULYPHU_WHERE = "SELECT COUNT(motCuaPhieuXuLyPhu) FROM MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaPhieuXuLyPhu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaPhieuXuLyPhu exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaPhieuXuLyPhu exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaPhieuXuLyPhuPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"phieuXuLyChinhId", "trichYeuNoiDung", "ghiChu",
				"trangThaiHienTaiId", "noiDungHoSoId", "chiemQuyenXuLy",
				"ngayTaoPhieu", "nguoiTaoPhieu", "nhomPhieuXuLy",
				"phanNhomHoSoId"
			});
	private static MotCuaPhieuXuLyPhu _nullMotCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaPhieuXuLyPhu> toCacheModel() {
				return _nullMotCuaPhieuXuLyPhuCacheModel;
			}
		};

	private static CacheModel<MotCuaPhieuXuLyPhu> _nullMotCuaPhieuXuLyPhuCacheModel =
		new CacheModel<MotCuaPhieuXuLyPhu>() {
			@Override
			public MotCuaPhieuXuLyPhu toEntityModel() {
				return _nullMotCuaPhieuXuLyPhu;
			}
		};
}