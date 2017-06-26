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

import vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc noidung ho so read service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see TthcNoidungHoSoReadPersistence
 * @see TthcNoidungHoSoReadUtil
 * @generated
 */
public class TthcNoidungHoSoReadPersistenceImpl extends BasePersistenceImpl<TthcNoidungHoSoRead>
	implements TthcNoidungHoSoReadPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcNoidungHoSoReadUtil} to access the tthc noidung ho so read persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcNoidungHoSoReadImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_VEHICLERECORDID = new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVehicleRecordId", new String[] { Long.class.getName() },
			TthcNoidungHoSoReadModelImpl.VEHICLERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLERECORDID = new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the tthc noidung ho so read where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException} if it could not be found.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead findByVehicleRecordId(long vehicleRecordId)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = fetchByVehicleRecordId(vehicleRecordId);

		if (tthcNoidungHoSoRead == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleRecordId=");
			msg.append(vehicleRecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcNoidungHoSoReadException(msg.toString());
		}

		return tthcNoidungHoSoRead;
	}

	/**
	 * Returns the tthc noidung ho so read where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching tthc noidung ho so read, or <code>null</code> if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByVehicleRecordId(long vehicleRecordId)
		throws SystemException {
		return fetchByVehicleRecordId(vehicleRecordId, true);
	}

	/**
	 * Returns the tthc noidung ho so read where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc noidung ho so read, or <code>null</code> if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByVehicleRecordId(long vehicleRecordId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { vehicleRecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					finderArgs, this);
		}

		if (result instanceof TthcNoidungHoSoRead) {
			TthcNoidungHoSoRead tthcNoidungHoSoRead = (TthcNoidungHoSoRead)result;

			if ((vehicleRecordId != tthcNoidungHoSoRead.getVehicleRecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOREAD_WHERE);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleRecordId);

				List<TthcNoidungHoSoRead> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcNoidungHoSoReadPersistenceImpl.fetchByVehicleRecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcNoidungHoSoRead tthcNoidungHoSoRead = list.get(0);

					result = tthcNoidungHoSoRead;

					cacheResult(tthcNoidungHoSoRead);

					if ((tthcNoidungHoSoRead.getVehicleRecordId() != vehicleRecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
							finderArgs, tthcNoidungHoSoRead);
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
			return (TthcNoidungHoSoRead)result;
		}
	}

	/**
	 * Removes the tthc noidung ho so read where vehicleRecordId = &#63; from the database.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the tthc noidung ho so read that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead removeByVehicleRecordId(long vehicleRecordId)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = findByVehicleRecordId(vehicleRecordId);

		return remove(tthcNoidungHoSoRead);
	}

	/**
	 * Returns the number of tthc noidung ho so reads where vehicleRecordId = &#63;.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the number of matching tthc noidung ho so reads
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOREAD_WHERE);

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
		"tthcNoidungHoSoRead.vehicleRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcNoidungHoSoReadModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoReadModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID =
		new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @return the matching tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId) throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId, BieuMauHoSoId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param start the lower bound of the range of tthc noidung ho so reads
	 * @param end the upper bound of the range of tthc noidung ho so reads (not inclusive)
	 * @return the range of matching tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId, int start, int end)
		throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId, BieuMauHoSoId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param start the lower bound of the range of tthc noidung ho so reads
	 * @param end the upper bound of the range of tthc noidung ho so reads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findByBieuMauHoSoIdAndHoSoThuTucId(
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

		List<TthcNoidungHoSoRead> list = (List<TthcNoidungHoSoRead>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSoRead tthcNoidungHoSoRead : list) {
				if ((HoSoThuTucId != tthcNoidungHoSoRead.getHoSoThuTucId()) ||
						(BieuMauHoSoId != tthcNoidungHoSoRead.getBieuMauHoSoId())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOREAD_WHERE);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_BIEUMAUHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcNoidungHoSoReadModelImpl.ORDER_BY_JPQL);
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
					list = (List<TthcNoidungHoSoRead>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSoRead>(list);
				}
				else {
					list = (List<TthcNoidungHoSoRead>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead findByBieuMauHoSoIdAndHoSoThuTucId_First(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = fetchByBieuMauHoSoIdAndHoSoThuTucId_First(HoSoThuTucId,
				BieuMauHoSoId, orderByComparator);

		if (tthcNoidungHoSoRead != null) {
			return tthcNoidungHoSoRead;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("HoSoThuTucId=");
		msg.append(HoSoThuTucId);

		msg.append(", BieuMauHoSoId=");
		msg.append(BieuMauHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoReadException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so read, or <code>null</code> if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByBieuMauHoSoIdAndHoSoThuTucId_First(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSoRead> list = findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
				BieuMauHoSoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead findByBieuMauHoSoIdAndHoSoThuTucId_Last(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = fetchByBieuMauHoSoIdAndHoSoThuTucId_Last(HoSoThuTucId,
				BieuMauHoSoId, orderByComparator);

		if (tthcNoidungHoSoRead != null) {
			return tthcNoidungHoSoRead;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("HoSoThuTucId=");
		msg.append(HoSoThuTucId);

		msg.append(", BieuMauHoSoId=");
		msg.append(BieuMauHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcNoidungHoSoReadException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so read, or <code>null</code> if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByBieuMauHoSoIdAndHoSoThuTucId_Last(
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
				BieuMauHoSoId);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSoRead> list = findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
				BieuMauHoSoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho so reads before and after the current tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param Id the primary key of the current tthc noidung ho so read
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead[] findByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(
		long Id, long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSoRead[] array = new TthcNoidungHoSoReadImpl[3];

			array[0] = getByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(session,
					tthcNoidungHoSoRead, HoSoThuTucId, BieuMauHoSoId,
					orderByComparator, true);

			array[1] = tthcNoidungHoSoRead;

			array[2] = getByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(session,
					tthcNoidungHoSoRead, HoSoThuTucId, BieuMauHoSoId,
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

	protected TthcNoidungHoSoRead getByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(
		Session session, TthcNoidungHoSoRead tthcNoidungHoSoRead,
		long HoSoThuTucId, long BieuMauHoSoId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSOREAD_WHERE);

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
			query.append(TthcNoidungHoSoReadModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(HoSoThuTucId);

		qPos.add(BieuMauHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSoRead);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSoRead> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; from the database.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByBieuMauHoSoIdAndHoSoThuTucId(long HoSoThuTucId,
		long BieuMauHoSoId) throws SystemException {
		for (TthcNoidungHoSoRead tthcNoidungHoSoRead : findByBieuMauHoSoIdAndHoSoThuTucId(
				HoSoThuTucId, BieuMauHoSoId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSoRead);
		}
	}

	/**
	 * Returns the number of tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @return the number of matching tthc noidung ho so reads
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOREAD_WHERE);

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
		"tthcNoidungHoSoRead.HoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCID_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSoRead.BieuMauHoSoId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			TthcNoidungHoSoReadModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			TthcNoidungHoSoReadModelImpl.BIEUMAUHOSOID_COLUMN_BITMASK |
			TthcNoidungHoSoReadModelImpl.MATUSINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH =
		new FinderPath(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @return the matching tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh)
		throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho so reads
	 * @param end the upper bound of the range of tthc noidung ho so reads (not inclusive)
	 * @return the range of matching tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh, int start,
		int end) throws SystemException {
		return findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param start the lower bound of the range of tthc noidung ho so reads
	 * @param end the upper bound of the range of tthc noidung ho so reads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
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

		List<TthcNoidungHoSoRead> list = (List<TthcNoidungHoSoRead>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcNoidungHoSoRead tthcNoidungHoSoRead : list) {
				if ((HoSoThuTucId != tthcNoidungHoSoRead.getHoSoThuTucId()) ||
						(BieuMauHoSoId != tthcNoidungHoSoRead.getBieuMauHoSoId()) ||
						!Validator.equals(MaTuSinh,
							tthcNoidungHoSoRead.getMaTuSinh())) {
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

			query.append(_SQL_SELECT_TTHCNOIDUNGHOSOREAD_WHERE);

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
				query.append(TthcNoidungHoSoReadModelImpl.ORDER_BY_JPQL);
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
					list = (List<TthcNoidungHoSoRead>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSoRead>(list);
				}
				else {
					list = (List<TthcNoidungHoSoRead>)QueryUtil.list(q,
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
	 * Returns the first tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, orderByComparator);

		if (tthcNoidungHoSoRead != null) {
			return tthcNoidungHoSoRead;
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

		throw new NoSuchTthcNoidungHoSoReadException(msg.toString());
	}

	/**
	 * Returns the first tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc noidung ho so read, or <code>null</code> if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcNoidungHoSoRead> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, orderByComparator);

		if (tthcNoidungHoSoRead != null) {
			return tthcNoidungHoSoRead;
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

		throw new NoSuchTthcNoidungHoSoReadException(msg.toString());
	}

	/**
	 * Returns the last tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc noidung ho so read, or <code>null</code> if a matching tthc noidung ho so read could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh);

		if (count == 0) {
			return null;
		}

		List<TthcNoidungHoSoRead> list = findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
				BieuMauHoSoId, MaTuSinh, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc noidung ho so reads before and after the current tthc noidung ho so read in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param Id the primary key of the current tthc noidung ho so read
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long Id, long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSoRead[] array = new TthcNoidungHoSoReadImpl[3];

			array[0] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSoRead, HoSoThuTucId, BieuMauHoSoId, MaTuSinh,
					orderByComparator, true);

			array[1] = tthcNoidungHoSoRead;

			array[2] = getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(session,
					tthcNoidungHoSoRead, HoSoThuTucId, BieuMauHoSoId, MaTuSinh,
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

	protected TthcNoidungHoSoRead getByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		Session session, TthcNoidungHoSoRead tthcNoidungHoSoRead,
		long HoSoThuTucId, long BieuMauHoSoId, String MaTuSinh,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCNOIDUNGHOSOREAD_WHERE);

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
			query.append(TthcNoidungHoSoReadModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tthcNoidungHoSoRead);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcNoidungHoSoRead> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63; from the database.
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
		for (TthcNoidungHoSoRead tthcNoidungHoSoRead : findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
				HoSoThuTucId, BieuMauHoSoId, MaTuSinh, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcNoidungHoSoRead);
		}
	}

	/**
	 * Returns the number of tthc noidung ho so reads where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	 *
	 * @param HoSoThuTucId the ho so thu tuc ID
	 * @param BieuMauHoSoId the bieu mau ho so ID
	 * @param MaTuSinh the ma tu sinh
	 * @return the number of matching tthc noidung ho so reads
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

			query.append(_SQL_COUNT_TTHCNOIDUNGHOSOREAD_WHERE);

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
		"tthcNoidungHoSoRead.HoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_BIEUMAUHOSOID_2 =
		"tthcNoidungHoSoRead.BieuMauHoSoId = ? AND ";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_1 =
		"tthcNoidungHoSoRead.MaTuSinh IS NULL";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_2 =
		"tthcNoidungHoSoRead.MaTuSinh = ?";
	private static final String _FINDER_COLUMN_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH_MATUSINH_3 =
		"(tthcNoidungHoSoRead.MaTuSinh IS NULL OR tthcNoidungHoSoRead.MaTuSinh = '')";

	public TthcNoidungHoSoReadPersistenceImpl() {
		setModelClass(TthcNoidungHoSoRead.class);
	}

	/**
	 * Caches the tthc noidung ho so read in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSoRead the tthc noidung ho so read
	 */
	@Override
	public void cacheResult(TthcNoidungHoSoRead tthcNoidungHoSoRead) {
		EntityCacheUtil.putResult(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class, tthcNoidungHoSoRead.getPrimaryKey(),
			tthcNoidungHoSoRead);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
			new Object[] { tthcNoidungHoSoRead.getVehicleRecordId() },
			tthcNoidungHoSoRead);

		tthcNoidungHoSoRead.resetOriginalValues();
	}

	/**
	 * Caches the tthc noidung ho so reads in the entity cache if it is enabled.
	 *
	 * @param tthcNoidungHoSoReads the tthc noidung ho so reads
	 */
	@Override
	public void cacheResult(List<TthcNoidungHoSoRead> tthcNoidungHoSoReads) {
		for (TthcNoidungHoSoRead tthcNoidungHoSoRead : tthcNoidungHoSoReads) {
			if (EntityCacheUtil.getResult(
						TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoReadImpl.class,
						tthcNoidungHoSoRead.getPrimaryKey()) == null) {
				cacheResult(tthcNoidungHoSoRead);
			}
			else {
				tthcNoidungHoSoRead.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc noidung ho so reads.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcNoidungHoSoReadImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcNoidungHoSoReadImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc noidung ho so read.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcNoidungHoSoRead tthcNoidungHoSoRead) {
		EntityCacheUtil.removeResult(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class, tthcNoidungHoSoRead.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcNoidungHoSoRead);
	}

	@Override
	public void clearCache(List<TthcNoidungHoSoRead> tthcNoidungHoSoReads) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcNoidungHoSoRead tthcNoidungHoSoRead : tthcNoidungHoSoReads) {
			EntityCacheUtil.removeResult(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoReadImpl.class,
				tthcNoidungHoSoRead.getPrimaryKey());

			clearUniqueFindersCache(tthcNoidungHoSoRead);
		}
	}

	protected void cacheUniqueFindersCache(
		TthcNoidungHoSoRead tthcNoidungHoSoRead) {
		if (tthcNoidungHoSoRead.isNew()) {
			Object[] args = new Object[] {
					tthcNoidungHoSoRead.getVehicleRecordId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args, tthcNoidungHoSoRead);
		}
		else {
			TthcNoidungHoSoReadModelImpl tthcNoidungHoSoReadModelImpl = (TthcNoidungHoSoReadModelImpl)tthcNoidungHoSoRead;

			if ((tthcNoidungHoSoReadModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoRead.getVehicleRecordId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					args, tthcNoidungHoSoRead);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TthcNoidungHoSoRead tthcNoidungHoSoRead) {
		TthcNoidungHoSoReadModelImpl tthcNoidungHoSoReadModelImpl = (TthcNoidungHoSoReadModelImpl)tthcNoidungHoSoRead;

		Object[] args = new Object[] { tthcNoidungHoSoRead.getVehicleRecordId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID, args);

		if ((tthcNoidungHoSoReadModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcNoidungHoSoReadModelImpl.getOriginalVehicleRecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args);
		}
	}

	/**
	 * Creates a new tthc noidung ho so read with the primary key. Does not add the tthc noidung ho so read to the database.
	 *
	 * @param Id the primary key for the new tthc noidung ho so read
	 * @return the new tthc noidung ho so read
	 */
	@Override
	public TthcNoidungHoSoRead create(long Id) {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = new TthcNoidungHoSoReadImpl();

		tthcNoidungHoSoRead.setNew(true);
		tthcNoidungHoSoRead.setPrimaryKey(Id);

		return tthcNoidungHoSoRead;
	}

	/**
	 * Removes the tthc noidung ho so read with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tthc noidung ho so read
	 * @return the tthc noidung ho so read that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead remove(long Id)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tthc noidung ho so read with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so read
	 * @return the tthc noidung ho so read that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead remove(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcNoidungHoSoRead tthcNoidungHoSoRead = (TthcNoidungHoSoRead)session.get(TthcNoidungHoSoReadImpl.class,
					primaryKey);

			if (tthcNoidungHoSoRead == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcNoidungHoSoReadException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcNoidungHoSoRead);
		}
		catch (NoSuchTthcNoidungHoSoReadException nsee) {
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
	protected TthcNoidungHoSoRead removeImpl(
		TthcNoidungHoSoRead tthcNoidungHoSoRead) throws SystemException {
		tthcNoidungHoSoRead = toUnwrappedModel(tthcNoidungHoSoRead);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcNoidungHoSoRead)) {
				tthcNoidungHoSoRead = (TthcNoidungHoSoRead)session.get(TthcNoidungHoSoReadImpl.class,
						tthcNoidungHoSoRead.getPrimaryKeyObj());
			}

			if (tthcNoidungHoSoRead != null) {
				session.delete(tthcNoidungHoSoRead);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcNoidungHoSoRead != null) {
			clearCache(tthcNoidungHoSoRead);
		}

		return tthcNoidungHoSoRead;
	}

	@Override
	public TthcNoidungHoSoRead updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead tthcNoidungHoSoRead)
		throws SystemException {
		tthcNoidungHoSoRead = toUnwrappedModel(tthcNoidungHoSoRead);

		boolean isNew = tthcNoidungHoSoRead.isNew();

		TthcNoidungHoSoReadModelImpl tthcNoidungHoSoReadModelImpl = (TthcNoidungHoSoReadModelImpl)tthcNoidungHoSoRead;

		Session session = null;

		try {
			session = openSession();

			if (tthcNoidungHoSoRead.isNew()) {
				session.save(tthcNoidungHoSoRead);

				tthcNoidungHoSoRead.setNew(false);
			}
			else {
				session.merge(tthcNoidungHoSoRead);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcNoidungHoSoReadModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcNoidungHoSoReadModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoReadModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoReadModelImpl.getOriginalBieuMauHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);

				args = new Object[] {
						tthcNoidungHoSoReadModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoReadModelImpl.getBieuMauHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCID,
					args);
			}

			if ((tthcNoidungHoSoReadModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcNoidungHoSoReadModelImpl.getOriginalHoSoThuTucId(),
						tthcNoidungHoSoReadModelImpl.getOriginalBieuMauHoSoId(),
						tthcNoidungHoSoReadModelImpl.getOriginalMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);

				args = new Object[] {
						tthcNoidungHoSoReadModelImpl.getHoSoThuTucId(),
						tthcNoidungHoSoReadModelImpl.getBieuMauHoSoId(),
						tthcNoidungHoSoReadModelImpl.getMaTuSinh()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BIEUMAUHOSOIDANDHOSOTHUTUCIDANDMATUSINH,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
			TthcNoidungHoSoReadImpl.class, tthcNoidungHoSoRead.getPrimaryKey(),
			tthcNoidungHoSoRead);

		clearUniqueFindersCache(tthcNoidungHoSoRead);
		cacheUniqueFindersCache(tthcNoidungHoSoRead);

		return tthcNoidungHoSoRead;
	}

	protected TthcNoidungHoSoRead toUnwrappedModel(
		TthcNoidungHoSoRead tthcNoidungHoSoRead) {
		if (tthcNoidungHoSoRead instanceof TthcNoidungHoSoReadImpl) {
			return tthcNoidungHoSoRead;
		}

		TthcNoidungHoSoReadImpl tthcNoidungHoSoReadImpl = new TthcNoidungHoSoReadImpl();

		tthcNoidungHoSoReadImpl.setNew(tthcNoidungHoSoRead.isNew());
		tthcNoidungHoSoReadImpl.setPrimaryKey(tthcNoidungHoSoRead.getPrimaryKey());

		tthcNoidungHoSoReadImpl.setId(tthcNoidungHoSoRead.getId());
		tthcNoidungHoSoReadImpl.setMaTuSinh(tthcNoidungHoSoRead.getMaTuSinh());
		tthcNoidungHoSoReadImpl.setHoSoThuTucId(tthcNoidungHoSoRead.getHoSoThuTucId());
		tthcNoidungHoSoReadImpl.setTenTaiLieu(tthcNoidungHoSoRead.getTenTaiLieu());
		tthcNoidungHoSoReadImpl.setTaiLieuDinhKem(tthcNoidungHoSoRead.getTaiLieuDinhKem());
		tthcNoidungHoSoReadImpl.setNoiDungFile(tthcNoidungHoSoRead.getNoiDungFile());
		tthcNoidungHoSoReadImpl.setBieuMauHoSoId(tthcNoidungHoSoRead.getBieuMauHoSoId());
		tthcNoidungHoSoReadImpl.setNgayGuiNhan(tthcNoidungHoSoRead.getNgayGuiNhan());
		tthcNoidungHoSoReadImpl.setLoaiTaiLieu(tthcNoidungHoSoRead.getLoaiTaiLieu());
		tthcNoidungHoSoReadImpl.setNgayTao(tthcNoidungHoSoRead.getNgayTao());
		tthcNoidungHoSoReadImpl.setNguoiTao(tthcNoidungHoSoRead.getNguoiTao());
		tthcNoidungHoSoReadImpl.setDaCapNhat(tthcNoidungHoSoRead.getDaCapNhat());
		tthcNoidungHoSoReadImpl.setLanGuiCuoi(tthcNoidungHoSoRead.getLanGuiCuoi());
		tthcNoidungHoSoReadImpl.setVehicleRecordId(tthcNoidungHoSoRead.getVehicleRecordId());

		return tthcNoidungHoSoReadImpl;
	}

	/**
	 * Returns the tthc noidung ho so read with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so read
	 * @return the tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = fetchByPrimaryKey(primaryKey);

		if (tthcNoidungHoSoRead == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcNoidungHoSoReadException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcNoidungHoSoRead;
	}

	/**
	 * Returns the tthc noidung ho so read with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException} if it could not be found.
	 *
	 * @param Id the primary key of the tthc noidung ho so read
	 * @return the tthc noidung ho so read
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoReadException if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead findByPrimaryKey(long Id)
		throws NoSuchTthcNoidungHoSoReadException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tthc noidung ho so read with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc noidung ho so read
	 * @return the tthc noidung ho so read, or <code>null</code> if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcNoidungHoSoRead tthcNoidungHoSoRead = (TthcNoidungHoSoRead)EntityCacheUtil.getResult(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
				TthcNoidungHoSoReadImpl.class, primaryKey);

		if (tthcNoidungHoSoRead == _nullTthcNoidungHoSoRead) {
			return null;
		}

		if (tthcNoidungHoSoRead == null) {
			Session session = null;

			try {
				session = openSession();

				tthcNoidungHoSoRead = (TthcNoidungHoSoRead)session.get(TthcNoidungHoSoReadImpl.class,
						primaryKey);

				if (tthcNoidungHoSoRead != null) {
					cacheResult(tthcNoidungHoSoRead);
				}
				else {
					EntityCacheUtil.putResult(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
						TthcNoidungHoSoReadImpl.class, primaryKey,
						_nullTthcNoidungHoSoRead);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcNoidungHoSoReadModelImpl.ENTITY_CACHE_ENABLED,
					TthcNoidungHoSoReadImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcNoidungHoSoRead;
	}

	/**
	 * Returns the tthc noidung ho so read with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tthc noidung ho so read
	 * @return the tthc noidung ho so read, or <code>null</code> if a tthc noidung ho so read with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcNoidungHoSoRead fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tthc noidung ho so reads.
	 *
	 * @return the tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc noidung ho so reads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho so reads
	 * @param end the upper bound of the range of tthc noidung ho so reads (not inclusive)
	 * @return the range of tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc noidung ho so reads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc noidung ho so reads
	 * @param end the upper bound of the range of tthc noidung ho so reads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc noidung ho so reads
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcNoidungHoSoRead> findAll(int start, int end,
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

		List<TthcNoidungHoSoRead> list = (List<TthcNoidungHoSoRead>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCNOIDUNGHOSOREAD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCNOIDUNGHOSOREAD;

				if (pagination) {
					sql = sql.concat(TthcNoidungHoSoReadModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcNoidungHoSoRead>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcNoidungHoSoRead>(list);
				}
				else {
					list = (List<TthcNoidungHoSoRead>)QueryUtil.list(q,
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
	 * Removes all the tthc noidung ho so reads from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcNoidungHoSoRead tthcNoidungHoSoRead : findAll()) {
			remove(tthcNoidungHoSoRead);
		}
	}

	/**
	 * Returns the number of tthc noidung ho so reads.
	 *
	 * @return the number of tthc noidung ho so reads
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

				Query q = session.createQuery(_SQL_COUNT_TTHCNOIDUNGHOSOREAD);

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
	 * Initializes the tthc noidung ho so read persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcNoidungHoSoRead>> listenersList = new ArrayList<ModelListener<TthcNoidungHoSoRead>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcNoidungHoSoRead>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcNoidungHoSoReadImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCNOIDUNGHOSOREAD = "SELECT tthcNoidungHoSoRead FROM TthcNoidungHoSoRead tthcNoidungHoSoRead";
	private static final String _SQL_SELECT_TTHCNOIDUNGHOSOREAD_WHERE = "SELECT tthcNoidungHoSoRead FROM TthcNoidungHoSoRead tthcNoidungHoSoRead WHERE ";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSOREAD = "SELECT COUNT(tthcNoidungHoSoRead) FROM TthcNoidungHoSoRead tthcNoidungHoSoRead";
	private static final String _SQL_COUNT_TTHCNOIDUNGHOSOREAD_WHERE = "SELECT COUNT(tthcNoidungHoSoRead) FROM TthcNoidungHoSoRead tthcNoidungHoSoRead WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcNoidungHoSoRead.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcNoidungHoSoRead exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcNoidungHoSoRead exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoReadPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "MaTuSinh", "HoSoThuTucId", "TenTaiLieu", "TaiLieuDinhKem",
				"noiDungFile", "BieuMauHoSoId", "NgayGuiNhan", "LoaiTaiLieu",
				"NgayTao", "NguoiTao", "daCapNhat", "lanGuiCuoi",
				"vehicleRecordId"
			});
	private static TthcNoidungHoSoRead _nullTthcNoidungHoSoRead = new TthcNoidungHoSoReadImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcNoidungHoSoRead> toCacheModel() {
				return _nullTthcNoidungHoSoReadCacheModel;
			}
		};

	private static CacheModel<TthcNoidungHoSoRead> _nullTthcNoidungHoSoReadCacheModel =
		new CacheModel<TthcNoidungHoSoRead>() {
			@Override
			public TthcNoidungHoSoRead toEntityModel() {
				return _nullTthcNoidungHoSoRead;
			}
		};
}