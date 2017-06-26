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

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua phieu xu ly chinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyChinhPersistence
 * @see MotCuaPhieuXuLyChinhUtil
 * @generated
 */
public class MotCuaPhieuXuLyChinhPersistenceImpl extends BasePersistenceImpl<MotCuaPhieuXuLyChinh>
	implements MotCuaPhieuXuLyChinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaPhieuXuLyChinhUtil} to access the mot cua phieu xu ly chinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaPhieuXuLyChinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucIdAndQuyTrinhThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaPhieuXuLyChinhModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			MotCuaPhieuXuLyChinhModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID =
		new FinderPath(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByHoSoThuTucIdAndQuyTrinhThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua phieu xu ly chinh
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a matching mot cua phieu xu ly chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
				quyTrinhThuTucId);

		if (motCuaPhieuXuLyChinh == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", quyTrinhThuTucId=");
			msg.append(quyTrinhThuTucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaPhieuXuLyChinhException(msg.toString());
		}

		return motCuaPhieuXuLyChinh;
	}

	/**
	 * Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId) throws SystemException {
		return fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId, true);
	}

	/**
	 * Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId, quyTrinhThuTucId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof MotCuaPhieuXuLyChinh) {
			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = (MotCuaPhieuXuLyChinh)result;

			if ((hoSoThuTucId != motCuaPhieuXuLyChinh.getHoSoThuTucId()) ||
					(quyTrinhThuTucId != motCuaPhieuXuLyChinh.getQuyTrinhThuTucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MOTCUAPHIEUXULYCHINH_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(quyTrinhThuTucId);

				List<MotCuaPhieuXuLyChinh> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaPhieuXuLyChinhPersistenceImpl.fetchByHoSoThuTucIdAndQuyTrinhThuTucId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = list.get(0);

					result = motCuaPhieuXuLyChinh;

					cacheResult(motCuaPhieuXuLyChinh);

					if ((motCuaPhieuXuLyChinh.getHoSoThuTucId() != hoSoThuTucId) ||
							(motCuaPhieuXuLyChinh.getQuyTrinhThuTucId() != quyTrinhThuTucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
							finderArgs, motCuaPhieuXuLyChinh);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
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
			return (MotCuaPhieuXuLyChinh)result;
		}
	}

	/**
	 * Removes the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the mot cua phieu xu ly chinh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh removeByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
				quyTrinhThuTucId);

		return remove(motCuaPhieuXuLyChinh);
	}

	/**
	 * Returns the number of mot cua phieu xu ly chinhs where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching mot cua phieu xu ly chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucIdAndQuyTrinhThuTucId(long hoSoThuTucId,
		long quyTrinhThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId, quyTrinhThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULYCHINH_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(quyTrinhThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_HOSOTHUTUCID_2 =
		"motCuaPhieuXuLyChinh.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDQUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2 =
		"motCuaPhieuXuLyChinh.quyTrinhThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCID = new FinderPath(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhModelImpl.FINDER_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucId", new String[] { Long.class.getName() },
			MotCuaPhieuXuLyChinhModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching mot cua phieu xu ly chinh
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a matching mot cua phieu xu ly chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh findByHoSoThuTucId(long hoSoThuTucId)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = fetchByHoSoThuTucId(hoSoThuTucId);

		if (motCuaPhieuXuLyChinh == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaPhieuXuLyChinhException(msg.toString());
		}

		return motCuaPhieuXuLyChinh;
	}

	/**
	 * Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh fetchByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return fetchByHoSoThuTucId(hoSoThuTucId, true);
	}

	/**
	 * Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh fetchByHoSoThuTucId(long hoSoThuTucId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof MotCuaPhieuXuLyChinh) {
			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = (MotCuaPhieuXuLyChinh)result;

			if ((hoSoThuTucId != motCuaPhieuXuLyChinh.getHoSoThuTucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_MOTCUAPHIEUXULYCHINH_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				List<MotCuaPhieuXuLyChinh> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaPhieuXuLyChinhPersistenceImpl.fetchByHoSoThuTucId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = list.get(0);

					result = motCuaPhieuXuLyChinh;

					cacheResult(motCuaPhieuXuLyChinh);

					if ((motCuaPhieuXuLyChinh.getHoSoThuTucId() != hoSoThuTucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
							finderArgs, motCuaPhieuXuLyChinh);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
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
			return (MotCuaPhieuXuLyChinh)result;
		}
	}

	/**
	 * Removes the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the mot cua phieu xu ly chinh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh removeByHoSoThuTucId(long hoSoThuTucId)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = findByHoSoThuTucId(hoSoThuTucId);

		return remove(motCuaPhieuXuLyChinh);
	}

	/**
	 * Returns the number of mot cua phieu xu ly chinhs where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching mot cua phieu xu ly chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUAPHIEUXULYCHINH_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "motCuaPhieuXuLyChinh.hoSoThuTucId = ?";

	public MotCuaPhieuXuLyChinhPersistenceImpl() {
		setModelClass(MotCuaPhieuXuLyChinh.class);
	}

	/**
	 * Caches the mot cua phieu xu ly chinh in the entity cache if it is enabled.
	 *
	 * @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	 */
	@Override
	public void cacheResult(MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		EntityCacheUtil.putResult(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhImpl.class,
			motCuaPhieuXuLyChinh.getPrimaryKey(), motCuaPhieuXuLyChinh);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
			new Object[] {
				motCuaPhieuXuLyChinh.getHoSoThuTucId(),
				motCuaPhieuXuLyChinh.getQuyTrinhThuTucId()
			}, motCuaPhieuXuLyChinh);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
			new Object[] { motCuaPhieuXuLyChinh.getHoSoThuTucId() },
			motCuaPhieuXuLyChinh);

		motCuaPhieuXuLyChinh.resetOriginalValues();
	}

	/**
	 * Caches the mot cua phieu xu ly chinhs in the entity cache if it is enabled.
	 *
	 * @param motCuaPhieuXuLyChinhs the mot cua phieu xu ly chinhs
	 */
	@Override
	public void cacheResult(List<MotCuaPhieuXuLyChinh> motCuaPhieuXuLyChinhs) {
		for (MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh : motCuaPhieuXuLyChinhs) {
			if (EntityCacheUtil.getResult(
						MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhieuXuLyChinhImpl.class,
						motCuaPhieuXuLyChinh.getPrimaryKey()) == null) {
				cacheResult(motCuaPhieuXuLyChinh);
			}
			else {
				motCuaPhieuXuLyChinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua phieu xu ly chinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaPhieuXuLyChinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaPhieuXuLyChinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua phieu xu ly chinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		EntityCacheUtil.removeResult(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhImpl.class, motCuaPhieuXuLyChinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaPhieuXuLyChinh);
	}

	@Override
	public void clearCache(List<MotCuaPhieuXuLyChinh> motCuaPhieuXuLyChinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh : motCuaPhieuXuLyChinhs) {
			EntityCacheUtil.removeResult(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhieuXuLyChinhImpl.class,
				motCuaPhieuXuLyChinh.getPrimaryKey());

			clearUniqueFindersCache(motCuaPhieuXuLyChinh);
		}
	}

	protected void cacheUniqueFindersCache(
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		if (motCuaPhieuXuLyChinh.isNew()) {
			Object[] args = new Object[] {
					motCuaPhieuXuLyChinh.getHoSoThuTucId(),
					motCuaPhieuXuLyChinh.getQuyTrinhThuTucId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args, motCuaPhieuXuLyChinh);

			args = new Object[] { motCuaPhieuXuLyChinh.getHoSoThuTucId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args,
				motCuaPhieuXuLyChinh);
		}
		else {
			MotCuaPhieuXuLyChinhModelImpl motCuaPhieuXuLyChinhModelImpl = (MotCuaPhieuXuLyChinhModelImpl)motCuaPhieuXuLyChinh;

			if ((motCuaPhieuXuLyChinhModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyChinh.getHoSoThuTucId(),
						motCuaPhieuXuLyChinh.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
					args, motCuaPhieuXuLyChinh);
			}

			if ((motCuaPhieuXuLyChinhModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaPhieuXuLyChinh.getHoSoThuTucId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
					args, motCuaPhieuXuLyChinh);
			}
		}
	}

	protected void clearUniqueFindersCache(
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		MotCuaPhieuXuLyChinhModelImpl motCuaPhieuXuLyChinhModelImpl = (MotCuaPhieuXuLyChinhModelImpl)motCuaPhieuXuLyChinh;

		Object[] args = new Object[] {
				motCuaPhieuXuLyChinh.getHoSoThuTucId(),
				motCuaPhieuXuLyChinh.getQuyTrinhThuTucId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
			args);

		if ((motCuaPhieuXuLyChinhModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaPhieuXuLyChinhModelImpl.getOriginalHoSoThuTucId(),
					motCuaPhieuXuLyChinhModelImpl.getOriginalQuyTrinhThuTucId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDQUYTRINHTHUTUCID,
				args);
		}

		args = new Object[] { motCuaPhieuXuLyChinh.getHoSoThuTucId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args);

		if ((motCuaPhieuXuLyChinhModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaPhieuXuLyChinhModelImpl.getOriginalHoSoThuTucId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args);
		}
	}

	/**
	 * Creates a new mot cua phieu xu ly chinh with the primary key. Does not add the mot cua phieu xu ly chinh to the database.
	 *
	 * @param id the primary key for the new mot cua phieu xu ly chinh
	 * @return the new mot cua phieu xu ly chinh
	 */
	@Override
	public MotCuaPhieuXuLyChinh create(long id) {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = new MotCuaPhieuXuLyChinhImpl();

		motCuaPhieuXuLyChinh.setNew(true);
		motCuaPhieuXuLyChinh.setPrimaryKey(id);

		return motCuaPhieuXuLyChinh;
	}

	/**
	 * Removes the mot cua phieu xu ly chinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua phieu xu ly chinh
	 * @return the mot cua phieu xu ly chinh that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a mot cua phieu xu ly chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh remove(long id)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua phieu xu ly chinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly chinh
	 * @return the mot cua phieu xu ly chinh that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a mot cua phieu xu ly chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh remove(Serializable primaryKey)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = (MotCuaPhieuXuLyChinh)session.get(MotCuaPhieuXuLyChinhImpl.class,
					primaryKey);

			if (motCuaPhieuXuLyChinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaPhieuXuLyChinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaPhieuXuLyChinh);
		}
		catch (NoSuchMotCuaPhieuXuLyChinhException nsee) {
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
	protected MotCuaPhieuXuLyChinh removeImpl(
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) throws SystemException {
		motCuaPhieuXuLyChinh = toUnwrappedModel(motCuaPhieuXuLyChinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaPhieuXuLyChinh)) {
				motCuaPhieuXuLyChinh = (MotCuaPhieuXuLyChinh)session.get(MotCuaPhieuXuLyChinhImpl.class,
						motCuaPhieuXuLyChinh.getPrimaryKeyObj());
			}

			if (motCuaPhieuXuLyChinh != null) {
				session.delete(motCuaPhieuXuLyChinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaPhieuXuLyChinh != null) {
			clearCache(motCuaPhieuXuLyChinh);
		}

		return motCuaPhieuXuLyChinh;
	}

	@Override
	public MotCuaPhieuXuLyChinh updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws SystemException {
		motCuaPhieuXuLyChinh = toUnwrappedModel(motCuaPhieuXuLyChinh);

		boolean isNew = motCuaPhieuXuLyChinh.isNew();

		Session session = null;

		try {
			session = openSession();

			if (motCuaPhieuXuLyChinh.isNew()) {
				session.save(motCuaPhieuXuLyChinh);

				motCuaPhieuXuLyChinh.setNew(false);
			}
			else {
				session.merge(motCuaPhieuXuLyChinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaPhieuXuLyChinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaPhieuXuLyChinhImpl.class,
			motCuaPhieuXuLyChinh.getPrimaryKey(), motCuaPhieuXuLyChinh);

		clearUniqueFindersCache(motCuaPhieuXuLyChinh);
		cacheUniqueFindersCache(motCuaPhieuXuLyChinh);

		return motCuaPhieuXuLyChinh;
	}

	protected MotCuaPhieuXuLyChinh toUnwrappedModel(
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		if (motCuaPhieuXuLyChinh instanceof MotCuaPhieuXuLyChinhImpl) {
			return motCuaPhieuXuLyChinh;
		}

		MotCuaPhieuXuLyChinhImpl motCuaPhieuXuLyChinhImpl = new MotCuaPhieuXuLyChinhImpl();

		motCuaPhieuXuLyChinhImpl.setNew(motCuaPhieuXuLyChinh.isNew());
		motCuaPhieuXuLyChinhImpl.setPrimaryKey(motCuaPhieuXuLyChinh.getPrimaryKey());

		motCuaPhieuXuLyChinhImpl.setId(motCuaPhieuXuLyChinh.getId());
		motCuaPhieuXuLyChinhImpl.setHoSoThuTucId(motCuaPhieuXuLyChinh.getHoSoThuTucId());
		motCuaPhieuXuLyChinhImpl.setQuyTrinhThuTucId(motCuaPhieuXuLyChinh.getQuyTrinhThuTucId());
		motCuaPhieuXuLyChinhImpl.setTenNguoiNop(motCuaPhieuXuLyChinh.getTenNguoiNop());
		motCuaPhieuXuLyChinhImpl.setCmndNguoiNop(motCuaPhieuXuLyChinh.getCmndNguoiNop());
		motCuaPhieuXuLyChinhImpl.setDiaChiNguoiNop(motCuaPhieuXuLyChinh.getDiaChiNguoiNop());
		motCuaPhieuXuLyChinhImpl.setSoDtddNguoiNop(motCuaPhieuXuLyChinh.getSoDtddNguoiNop());
		motCuaPhieuXuLyChinhImpl.setEmailNguoiNop(motCuaPhieuXuLyChinh.getEmailNguoiNop());
		motCuaPhieuXuLyChinhImpl.setGhiChu(motCuaPhieuXuLyChinh.getGhiChu());
		motCuaPhieuXuLyChinhImpl.setTrangThaiHienTaiId(motCuaPhieuXuLyChinh.getTrangThaiHienTaiId());
		motCuaPhieuXuLyChinhImpl.setHetHoSoCon(motCuaPhieuXuLyChinh.getHetHoSoCon());
		motCuaPhieuXuLyChinhImpl.setChiemQuyenXuLy(motCuaPhieuXuLyChinh.getChiemQuyenXuLy());
		motCuaPhieuXuLyChinhImpl.setNgayTaoPhieu(motCuaPhieuXuLyChinh.getNgayTaoPhieu());
		motCuaPhieuXuLyChinhImpl.setNguoiTaoPhieu(motCuaPhieuXuLyChinh.getNguoiTaoPhieu());
		motCuaPhieuXuLyChinhImpl.setSoDtcdNguoiNop(motCuaPhieuXuLyChinh.getSoDtcdNguoiNop());

		return motCuaPhieuXuLyChinhImpl;
	}

	/**
	 * Returns the mot cua phieu xu ly chinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly chinh
	 * @return the mot cua phieu xu ly chinh
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a mot cua phieu xu ly chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = fetchByPrimaryKey(primaryKey);

		if (motCuaPhieuXuLyChinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaPhieuXuLyChinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaPhieuXuLyChinh;
	}

	/**
	 * Returns the mot cua phieu xu ly chinh with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua phieu xu ly chinh
	 * @return the mot cua phieu xu ly chinh
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a mot cua phieu xu ly chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh findByPrimaryKey(long id)
		throws NoSuchMotCuaPhieuXuLyChinhException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua phieu xu ly chinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua phieu xu ly chinh
	 * @return the mot cua phieu xu ly chinh, or <code>null</code> if a mot cua phieu xu ly chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = (MotCuaPhieuXuLyChinh)EntityCacheUtil.getResult(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaPhieuXuLyChinhImpl.class, primaryKey);

		if (motCuaPhieuXuLyChinh == _nullMotCuaPhieuXuLyChinh) {
			return null;
		}

		if (motCuaPhieuXuLyChinh == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaPhieuXuLyChinh = (MotCuaPhieuXuLyChinh)session.get(MotCuaPhieuXuLyChinhImpl.class,
						primaryKey);

				if (motCuaPhieuXuLyChinh != null) {
					cacheResult(motCuaPhieuXuLyChinh);
				}
				else {
					EntityCacheUtil.putResult(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaPhieuXuLyChinhImpl.class, primaryKey,
						_nullMotCuaPhieuXuLyChinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaPhieuXuLyChinhModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaPhieuXuLyChinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaPhieuXuLyChinh;
	}

	/**
	 * Returns the mot cua phieu xu ly chinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua phieu xu ly chinh
	 * @return the mot cua phieu xu ly chinh, or <code>null</code> if a mot cua phieu xu ly chinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaPhieuXuLyChinh fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua phieu xu ly chinhs.
	 *
	 * @return the mot cua phieu xu ly chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyChinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua phieu xu ly chinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phieu xu ly chinhs
	 * @param end the upper bound of the range of mot cua phieu xu ly chinhs (not inclusive)
	 * @return the range of mot cua phieu xu ly chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyChinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua phieu xu ly chinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua phieu xu ly chinhs
	 * @param end the upper bound of the range of mot cua phieu xu ly chinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua phieu xu ly chinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaPhieuXuLyChinh> findAll(int start, int end,
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

		List<MotCuaPhieuXuLyChinh> list = (List<MotCuaPhieuXuLyChinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUAPHIEUXULYCHINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUAPHIEUXULYCHINH;

				if (pagination) {
					sql = sql.concat(MotCuaPhieuXuLyChinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaPhieuXuLyChinh>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaPhieuXuLyChinh>(list);
				}
				else {
					list = (List<MotCuaPhieuXuLyChinh>)QueryUtil.list(q,
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
	 * Removes all the mot cua phieu xu ly chinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh : findAll()) {
			remove(motCuaPhieuXuLyChinh);
		}
	}

	/**
	 * Returns the number of mot cua phieu xu ly chinhs.
	 *
	 * @return the number of mot cua phieu xu ly chinhs
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUAPHIEUXULYCHINH);

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
	 * Initializes the mot cua phieu xu ly chinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaPhieuXuLyChinh>> listenersList = new ArrayList<ModelListener<MotCuaPhieuXuLyChinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaPhieuXuLyChinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaPhieuXuLyChinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUAPHIEUXULYCHINH = "SELECT motCuaPhieuXuLyChinh FROM MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh";
	private static final String _SQL_SELECT_MOTCUAPHIEUXULYCHINH_WHERE = "SELECT motCuaPhieuXuLyChinh FROM MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh WHERE ";
	private static final String _SQL_COUNT_MOTCUAPHIEUXULYCHINH = "SELECT COUNT(motCuaPhieuXuLyChinh) FROM MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh";
	private static final String _SQL_COUNT_MOTCUAPHIEUXULYCHINH_WHERE = "SELECT COUNT(motCuaPhieuXuLyChinh) FROM MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaPhieuXuLyChinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaPhieuXuLyChinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaPhieuXuLyChinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaPhieuXuLyChinhPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"hoSoThuTucId", "quyTrinhThuTucId", "tenNguoiNop",
				"cmndNguoiNop", "diaChiNguoiNop", "soDtddNguoiNop",
				"emailNguoiNop", "ghiChu", "trangThaiHienTaiId", "hetHoSoCon",
				"chiemQuyenXuLy", "ngayTaoPhieu", "nguoiTaoPhieu",
				"soDtcdNguoiNop"
			});
	private static MotCuaPhieuXuLyChinh _nullMotCuaPhieuXuLyChinh = new MotCuaPhieuXuLyChinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaPhieuXuLyChinh> toCacheModel() {
				return _nullMotCuaPhieuXuLyChinhCacheModel;
			}
		};

	private static CacheModel<MotCuaPhieuXuLyChinh> _nullMotCuaPhieuXuLyChinhCacheModel =
		new CacheModel<MotCuaPhieuXuLyChinh>() {
			@Override
			public MotCuaPhieuXuLyChinh toEntityModel() {
				return _nullMotCuaPhieuXuLyChinh;
			}
		};
}