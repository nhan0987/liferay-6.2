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

import vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc noidung ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see TthcNoidungHoSoPersistence
 * @see TthcNoidungHoSoUtil
 * @generated
 */
public class TthcNoidungHoSoPersistenceImpl extends BasePersistenceImpl<TthcNoidungHoSo>
	implements TthcNoidungHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcNoidungHoSoUtil} to access the tthc noidung ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcNoidungHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_VEHICLERECORDID = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVehicleRecordId", new String[] { Long.class.getName() },
			TthcNoidungHoSoModelImpl.VEHICLERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLERECORDID = new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByVehicleRecordId(long vehicleRecordId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByVehicleRecordId(vehicleRecordId);

		if (tthcNoidungHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleRecordId=");
			msg.append(vehicleRecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoException(msg.toString());
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByVehicleRecordId(long vehicleRecordId)
		throws SystemException {
		return fetchByVehicleRecordId(vehicleRecordId, true);
	}

	/**
	 * Returns the tthc noidung ho so where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByVehicleRecordId(long vehicleRecordId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { vehicleRecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSo) {
			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)result;

			if ((vehicleRecordId != tthcNoidungHoSo.getVehicleRecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleRecordId);

				List<TthcNoidungHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoPersistenceImpl.fetchByVehicleRecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSo tthcNoidungHoSo = list.get(0);

					result = tthcNoidungHoSo;

					cacheResult(tthcNoidungHoSo);

					if ((tthcNoidungHoSo.getVehicleRecordId() != vehicleRecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
							finderArgs, tthcNoidungHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
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
			return (TthcNoidungHoSo)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so where vehicleRecordId = &#63; from the database.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the tthc noidung ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo removeByVehicleRecordId(long vehicleRecordId)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByVehicleRecordId(vehicleRecordId);

		return remove(tthcNoidungHoSo);
	}

	/**
	 * Returns the number of tthc noidung ho sos where vehicleRecordId = &#63;.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleRecordId(long vehicleRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLERECORDID;

		Object[] finderArgs = new Object[] { vehicleRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleRecordId);

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

	private static final String _FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2 =
		"tthcNoidungHoSo.vehicleRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @return the matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId) throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId, BieuMauHoSoId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId, int start, int end)
		throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId, BieuMauHoSoId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID;
			finderArgs = new Object[] { HoSoThuTucId, BieuMauHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID;
			finderArgs = new Object[] {
					HoSoThuTucId, BieuMauHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSo tthcNoidungHoSo : list) {
				if ((HoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
						(BieuMauHoSoId != tthcNoidungHoSo.getBieuMauHoSoId())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_BIEUMAUHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(HoSoThuTucId);

				qPos.add(BieuMauHoSoId);

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucId_First(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByBieuMauHoSoIdAndHoSoThuTucId_First(HoSoThuTucId,
				BieuMauHoSoId, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("HoSoThuTucId=");
		msg.append(HoSoThuTucId);

		msg.append(", BieuMauHoSoId=");
		msg.append(BieuMauHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucId_First(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSo> list = findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
				BieuMauHoSoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucId_Last(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByBieuMauHoSoIdAndHoSoThuTucId_Last(HoSoThuTucId,
				BieuMauHoSoId, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("HoSoThuTucId=");
		msg.append(HoSoThuTucId);

		msg.append(", BieuMauHoSoId=");
		msg.append(BieuMauHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucId_Last(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
				BieuMauHoSoId);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSo> list = findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
				BieuMauHoSoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param Id the primary key of the current tthc noidung ho so
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo[] findByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(
		long Id, long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo[] array = new TthcNoidungHoSoImpl[3];

			array[0] = getByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(session,
					tthcNoidungHoSo, HoSoThuTucId, BieuMauHoSoId,
					orderByComparator, true);

			array[1] = tthcNoidungHoSo;

			array[2] = getByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(session,
					tthcNoidungHoSo, HoSoThuTucId, BieuMauHoSoId,
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

	protected TthcNoidungHoSo getByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(
		Session session, TthcNoidungHoSo tthcNoidungHoSo, long HoSoThuTucId,
		long BieuMauHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

		query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_HOSOTHUTUCID_2);

		query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_BIEUMAUHOSOID_2);

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
			query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(HoSoThuTucId);

		qPos.add(BieuMauHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; from the database.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByBieuMauHoSoIdAndHoSoThuTucId(long HoSoThuTucId,
		long BieuMauHoSoId) throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findByBieuMauHoSoIdAndHoSoThuTucId(
				HoSoThuTucId, BieuMauHoSoId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBieuMauHoSoIdAndHoSoThuTucId(long HoSoThuTucId,
		long BieuMauHoSoId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID;

		Object[] finderArgs = new Object[] { HoSoThuTucId, BieuMauHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_BIEUMAUHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(HoSoThuTucId);

				qPos.add(BieuMauHoSoId);

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

	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.HoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSo.BieuMauHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			TthcNoidungHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoModelImpl.MATUSINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @return the matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh)
		throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh, int start,
		int end) throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH;
			finderArgs = new Object[] { HoSoThuTucId, BieuMauHoSoId, MaTuSinh };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH;
			finderArgs = new Object[] {
					HoSoThuTucId, BieuMauHoSoId, MaTuSinh,
					
					start, end, orderByComparator
				};
		}

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSo tthcNoidungHoSo : list) {
				if ((HoSoThuTucId != tthcNoidungHoSo.getHoSoThuTucId()) ||
						(BieuMauHoSoId != tthcNoidungHoSo.getBieuMauHoSoId()) ||
						!Validator.equals(MaTuSinh,
							tthcNoidungHoSo.getMaTuSinh())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2);

			boolean bindMaTuSinh = false;

			if (MaTuSinh == null) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1);
			}
			else if (MaTuSinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3);
			}
			else {
				bindMaTuSinh = true;

				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(HoSoThuTucId);

				qPos.add(BieuMauHoSoId);

				if (bindMaTuSinh) {
					qPos.add(MaTuSinh);
				}

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("HoSoThuTucId=");
		msg.append(HoSoThuTucId);

		msg.append(", BieuMauHoSoId=");
		msg.append(BieuMauHoSoId);

		msg.append(", MaTuSinh=");
		msg.append(MaTuSinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSo> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, orderByComparator);

		if (tthcNoidungHoSo != null) {
			return tthcNoidungHoSo;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("HoSoThuTucId=");
		msg.append(HoSoThuTucId);

		msg.append(", BieuMauHoSoId=");
		msg.append(BieuMauHoSoId);

		msg.append(", MaTuSinh=");
		msg.append(MaTuSinh);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSo> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param Id the primary key of the current tthc noidung ho so
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long Id, long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo[] array = new TthcNoidungHoSoImpl[3];

			array[0] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSo, HoSoThuTucId, BieuMauHoSoId, MaTuSinh,
					orderByComparator, true);

			array[1] = tthcNoidungHoSo;

			array[2] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSo, HoSoThuTucId, BieuMauHoSoId, MaTuSinh,
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

	protected TthcNoidungHoSo getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		Session session, TthcNoidungHoSo tthcNoidungHoSo, long HoSoThuTucId,
		long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSO_WHERE);

		query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2);

		query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2);

		boolean bindMaTuSinh = false;

		if (MaTuSinh == null) {
			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1);
		}
		else if (MaTuSinh.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3);
		}
		else {
			bindMaTuSinh = true;

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2);
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
			query.append(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(HoSoThuTucId);

		qPos.add(BieuMauHoSoId);

		if (bindMaTuSinh) {
			qPos.add(MaTuSinh);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63; from the database.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh)
		throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
				HoSoThuTucId, BieuMauHoSoId, MaTuSinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @return the number of matching tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH;

		Object[] finderArgs = new Object[] { HoSoThuTucId, BieuMauHoSoId, MaTuSinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSO_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2);

			boolean bindMaTuSinh = false;

			if (MaTuSinh == null) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1);
			}
			else if (MaTuSinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3);
			}
			else {
				bindMaTuSinh = true;

				query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(HoSoThuTucId);

				qPos.add(BieuMauHoSoId);

				if (bindMaTuSinh) {
					qPos.add(MaTuSinh);
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

	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_HOSOTHUTUCID_2 =
		"tthcNoidungHoSo.HoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSo.BieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1 =
		"tthcNoidungHoSo.MaTuSinh IS NULL";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2 =
		"tthcNoidungHoSo.MaTuSinh = ?";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3 =
		"(tthcNoidungHoSo.MaTuSinh IS NULL OR tthcNoidungHoSo.MaTuSinh = '')";

	public TthcNoidungHoSoPersistenceImpl() {
		setModelClass(TthcNoidungHoSo.class);
	}

	/**
	 * Caches the tthc noidung ho so in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSo the tthc noidung ho so
	 */
	@Override
	public void cacheResult(TthcNoidungHoSo tthcNoidungHoSo) {
		EntityCacheUtil.putResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey(),
			tthcNoidungHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
			new Object[] { tthcNoidungHoSo.getVehicleRecordId() },
			tthcNoidungHoSo);

		tthcNoidungHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tthc noidung ho sos in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSos the tthc noidung ho sos
	 */
	@Override
	public void cacheResult(List<TthcNoidungHoSo> tthcNoidungHoSos) {
		for (TthcNoidungHoSo tthcNoidungHoSo : tthcNoidungHoSos) {
			if (EntityCacheUtil.getResult(
						TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoImpl.class,
						tthcNoidungHoSo.getPrimaryKey()) == null) {
				cacheResult(tthcNoidungHoSo);
			}
			else {
				tthcNoidungHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc noidung ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcNoidungHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcNoidungHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc noidung ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcNoidungHoSo tthcNoidungHoSo) {
		EntityCacheUtil.removeResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcNoidungHoSo);
	}

	@Override
	public void clearCache(List<TthcNoidungHoSo> tthcNoidungHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcNoidungHoSo tthcNoidungHoSo : tthcNoidungHoSos) {
			EntityCacheUtil.removeResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey());

			clearUniqueFindersCache(tthcNoidungHoSo);
		}
	}

	protected void cacheUniqueFindersCache(TthcNoidungHoSo tthcNoidungHoSo) {
		if (tthcNoidungHoSo.isNew()) {
			Object[] args = new Object[] { tthcNoidungHoSo.getVehicleRecordId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args, tthcNoidungHoSo);
		}
		else {
			TthcNoidungHoSoModelImpl tthcNoidungHoSoModelImpl = (TthcNoidungHoSoModelImpl)tthcNoidungHoSo;

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSo.getVehicleRecordId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					args, tthcNoidungHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcNoidungHoSo tthcNoidungHoSo) {
		TthcNoidungHoSoModelImpl tthcNoidungHoSoModelImpl = (TthcNoidungHoSoModelImpl)tthcNoidungHoSo;

		Object[] args = new Object[] { tthcNoidungHoSo.getVehicleRecordId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID, args);

		if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoModelImpl.getOriginalVehicleRecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args);
		}
	}

	/**
	 * Creates a new tthc noidung ho so with the primary key. Does not add the tthc noidung ho so to the database.
	 *
	 * @param Id the primary key for the new tthc noidung ho so
	 * @return the new tthc noidung ho so
	 */
	@Override
	public TthcNoidungHoSo create(long Id) {
		TthcNoidungHoSo tthcNoidungHoSo = new TthcNoidungHoSoImpl();

		tthcNoidungHoSo.setNew(true);
		tthcNoidungHoSo.setPrimaryKey(Id);

		return tthcNoidungHoSo;
	}

	/**
	 * Removes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo remove(long Id)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo remove(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)session.get(TthcNoidungHoSoImpl.class,
					primaryKey);

			if (tthcNoidungHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcNoidungHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcNoidungHoSo);
		}
		catch (NoSuchTthcNoidungHoSoException nsee) {
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
	protected TthcNoidungHoSo removeImpl(TthcNoidungHoSo tthcNoidungHoSo)
		throws SystemException {
		tthcNoidungHoSo = toUnwrappedModel(tthcNoidungHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcNoidungHoSo)) {
				tthcNoidungHoSo = (TthcNoidungHoSo)session.get(TthcNoidungHoSoImpl.class,
						tthcNoidungHoSo.getPrimaryKeyObj());
			}

			if (tthcNoidungHoSo != null) {
				session.delete(tthcNoidungHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcNoidungHoSo != null) {
			clearCache(tthcNoidungHoSo);
		}

		return tthcNoidungHoSo;
	}

	@Override
	public TthcNoidungHoSo updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws SystemException {
		tthcNoidungHoSo = toUnwrappedModel(tthcNoidungHoSo);

		boolean isNew = tthcNoidungHoSo.isNew();

		TthcNoidungHoSoModelImpl tthcNoidungHoSoModelImpl = (TthcNoidungHoSoModelImpl)tthcNoidungHoSo;

		Session session = null;

		try {
			session = openSession();

			if (tthcNoidungHoSo.isNew()) {
				session.save(tthcNoidungHoSo);

				tthcNoidungHoSo.setNew(false);
			}
			else {
				session.merge(tthcNoidungHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcNoidungHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getOriginalBieuMauHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);

				args = new Object[] {
						tthcNoidungHoSoModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getBieuMauHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);
			}

			if ((tthcNoidungHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getOriginalBieuMauHoSoId(),
						tthcNoidungHoSoModelImpl.getOriginalMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);

				args = new Object[] {
						tthcNoidungHoSoModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoModelImpl.getBieuMauHoSoId(),
						tthcNoidungHoSoModelImpl.getMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoImpl.class, tthcNoidungHoSo.getPrimaryKey(),
			tthcNoidungHoSo);

		clearUniqueFindersCache(tthcNoidungHoSo);
		cacheUniqueFindersCache(tthcNoidungHoSo);

		return tthcNoidungHoSo;
	}

	protected TthcNoidungHoSo toUnwrappedModel(TthcNoidungHoSo tthcNoidungHoSo) {
		if (tthcNoidungHoSo instanceof TthcNoidungHoSoImpl) {
			return tthcNoidungHoSo;
		}

		TthcNoidungHoSoImpl tthcNoidungHoSoImpl = new TthcNoidungHoSoImpl();

		tthcNoidungHoSoImpl.setNew(tthcNoidungHoSo.isNew());
		tthcNoidungHoSoImpl.setPrimaryKey(tthcNoidungHoSo.getPrimaryKey());

		tthcNoidungHoSoImpl.setId(tthcNoidungHoSo.getId());
		tthcNoidungHoSoImpl.setMaTuSinh(tthcNoidungHoSo.getMaTuSinh());
		tthcNoidungHoSoImpl.setHoSoThuTucId(tthcNoidungHoSo.getHoSoThuTucId());
		tthcNoidungHoSoImpl.setTenTaiLieu(tthcNoidungHoSo.getTenTaiLieu());
		tthcNoidungHoSoImpl.setTaiLieuDinhKem(tthcNoidungHoSo.getTaiLieuDinhKem());
		tthcNoidungHoSoImpl.setNoiDungXml(tthcNoidungHoSo.getNoiDungXml());
		tthcNoidungHoSoImpl.setNoiDungFile(tthcNoidungHoSo.getNoiDungFile());
		tthcNoidungHoSoImpl.setBieuMauHoSoId(tthcNoidungHoSo.getBieuMauHoSoId());
		tthcNoidungHoSoImpl.setNgayGuiNhan(tthcNoidungHoSo.getNgayGuiNhan());
		tthcNoidungHoSoImpl.setLoaiTaiLieu(tthcNoidungHoSo.getLoaiTaiLieu());
		tthcNoidungHoSoImpl.setNgayTao(tthcNoidungHoSo.getNgayTao());
		tthcNoidungHoSoImpl.setNguoiTao(tthcNoidungHoSo.getNguoiTao());
		tthcNoidungHoSoImpl.setDaCapNhat(tthcNoidungHoSo.getDaCapNhat());
		tthcNoidungHoSoImpl.setLanGuiCuoi(tthcNoidungHoSo.getLanGuiCuoi());
		tthcNoidungHoSoImpl.setVehicleRecordId(tthcNoidungHoSo.getVehicleRecordId());

		return tthcNoidungHoSoImpl;
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = fetchByPrimaryKey(primaryKey);

		if (tthcNoidungHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcNoidungHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	 *
	 * @param Id the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo findByPrimaryKey(long Id)
		throws NoSuchTthcNoidungHoSoException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so, or <code>null</code> if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcNoidungHoSo tthcNoidungHoSo = (TthcNoidungHoSo)EntityCacheUtil.getResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoImpl.class, primaryKey);

		if (tthcNoidungHoSo == _nullTthcNoidungHoSo) {
			return null;
		}

		if (tthcNoidungHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				tthcNoidungHoSo = (TthcNoidungHoSo)session.get(TthcNoidungHoSoImpl.class,
						primaryKey);

				if (tthcNoidungHoSo != null) {
					cacheResult(tthcNoidungHoSo);
				}
				else {
					EntityCacheUtil.putResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoImpl.class, primaryKey,
						_nullTthcNoidungHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcNoidungHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TthcNoidungHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcNoidungHoSo;
	}

	/**
	 * Returns the tthc noidung ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tthc noidung ho so
	 * @return the tthc noidung ho so, or <code>null</code> if a tthc noidung ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSo fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tthc noidung ho sos.
	 *
	 * @return the tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @return the range of tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho sos
	 * @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc noidung ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSo> findAll(int start, int end,
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

		List<TthcNoidungHoSo> list = (List<TthcNoidungHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCNOIDUNGHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCNOIDUNGHOSO;

				if (pagination) {
					sql = sql.concat(TthcNoidungHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSo>(list);
				}
				else {
					list = (List<TthcNoidungHoSo>)QueryUtil.list(q,
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
	 * Removes all the tthc noidung ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcNoidungHoSo tthcNoidungHoSo : findAll()) {
			remove(tthcNoidungHoSo);
		}
	}

	/**
	 * Returns the number of tthc noidung ho sos.
	 *
	 * @return the number of tthc noidung ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TTHCNOIDUNGHOSO);

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
	 * Initializes the tthc noidung ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcNoidungHoSo>> listenersList = new ArrayList<ModelListener<TthcNoidungHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcNoidungHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcNoidungHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCNOIDUNGHOSO = "SELECT tthcNoidungHoSo FROM TthcNoidungHoSo tthcNoidungHoSo";
	private static final String _SQL_SELECT_TTHCNOIDUNGHOSO_WHERE = "SELECT tthcNoidungHoSo FROM TthcNoidungHoSo tthcNoidungHoSo WHERE ";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSO = "SELECT COUNT(tthcNoidungHoSo) FROM TthcNoidungHoSo tthcNoidungHoSo";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSO_WHERE = "SELECT COUNT(tthcNoidungHoSo) FROM TthcNoidungHoSo tthcNoidungHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcNoidungHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcNoidungHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcNoidungHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "MaTuSinh", "HoSoThuTucId", "TenTaiLieu", "TaiLieuDinhKem",
				"NoiDungXml", "noiDungFile", "BieuMauHoSoId", "NgayGuiNhan",
				"LoaiTaiLieu", "NgayTao", "NguoiTao", "daCapNhat", "lanGuiCuoi",
				"vehicleRecordId"
			});
	private static TthcNoidungHoSo _nullTthcNoidungHoSo = new TthcNoidungHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcNoidungHoSo> toCacheModel() {
				return _nullTthcNoidungHoSoCacheModel;
			}
		};

	private static CacheModel<TthcNoidungHoSo> _nullTthcNoidungHoSoCacheModel = new CacheModel<TthcNoidungHoSo>() {
			@Override
			public TthcNoidungHoSo toEntityModel() {
				return _nullTthcNoidungHoSo;
			}
		};
}