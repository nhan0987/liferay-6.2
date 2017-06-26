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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vehicle record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehicleRecordPersistence
 * @see VehicleRecordUtil
 * @generated
 */
public class VehicleRecordPersistenceImpl extends BasePersistenceImpl<VehicleRecord>
	implements VehicleRecordPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleRecordUtil} to access the vehicle record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleRecordImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			VehicleRecordModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID;
			finderArgs = new Object[] { certificateRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID;
			finderArgs = new Object[] {
					certificateRecordId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((certificateRecordId != vehicleRecord.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleRecord> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByCertificateRecordId_PrevAndNext(long id,
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					vehicleRecord, certificateRecordId, orderByComparator, true);

			array[1] = vehicleRecord;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					vehicleRecord, certificateRecordId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VehicleRecord getByCertificateRecordId_PrevAndNext(
		Session session, VehicleRecord vehicleRecord, long certificateRecordId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (VehicleRecord vehicleRecord : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATERECORDID;

		Object[] finderArgs = new Object[] { certificateRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

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

	private static final String _FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2 =
		"vehicleRecord.certificateRecordId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CODENUMBER = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCodeNumber", new String[] { Long.class.getName() },
			VehicleRecordModelImpl.CODENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODENUMBER = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCodeNumber",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vehicle record where codeNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException} if it could not be found.
	 *
	 * @param codeNumber the code number
	 * @return the matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByCodeNumber(long codeNumber)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByCodeNumber(codeNumber);

		if (vehicleRecord == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("codeNumber=");
			msg.append(codeNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVehicleRecordException(msg.toString());
		}

		return vehicleRecord;
	}

	/**
	 * Returns the vehicle record where codeNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param codeNumber the code number
	 * @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByCodeNumber(long codeNumber)
		throws SystemException {
		return fetchByCodeNumber(codeNumber, true);
	}

	/**
	 * Returns the vehicle record where codeNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param codeNumber the code number
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByCodeNumber(long codeNumber,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { codeNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODENUMBER,
					finderArgs, this);
		}

		if (result instanceof VehicleRecord) {
			VehicleRecord vehicleRecord = (VehicleRecord)result;

			if ((codeNumber != vehicleRecord.getCodeNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CODENUMBER_CODENUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(codeNumber);

				List<VehicleRecord> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"VehicleRecordPersistenceImpl.fetchByCodeNumber(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					VehicleRecord vehicleRecord = list.get(0);

					result = vehicleRecord;

					cacheResult(vehicleRecord);

					if ((vehicleRecord.getCodeNumber() != codeNumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
							finderArgs, vehicleRecord);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODENUMBER,
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
			return (VehicleRecord)result;
		}
	}

	/**
	 * Removes the vehicle record where codeNumber = &#63; from the database.
	 *
	 * @param codeNumber the code number
	 * @return the vehicle record that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord removeByCodeNumber(long codeNumber)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByCodeNumber(codeNumber);

		return remove(vehicleRecord);
	}

	/**
	 * Returns the number of vehicle records where codeNumber = &#63;.
	 *
	 * @param codeNumber the code number
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodeNumber(long codeNumber) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODENUMBER;

		Object[] finderArgs = new Object[] { codeNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CODENUMBER_CODENUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(codeNumber);

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

	private static final String _FINDER_COLUMN_CODENUMBER_CODENUMBER_2 = "vehicleRecord.codeNumber = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTEID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDebitNoteId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDebitNoteId", new String[] { Long.class.getName() },
			VehicleRecordModelImpl.DEBITNOTEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEBITNOTEID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDebitNoteId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByDebitNoteId(long debitNoteId)
		throws SystemException {
		return findByDebitNoteId(debitNoteId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where debitNoteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitNoteId the debit note ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByDebitNoteId(long debitNoteId, int start,
		int end) throws SystemException {
		return findByDebitNoteId(debitNoteId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where debitNoteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitNoteId the debit note ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByDebitNoteId(long debitNoteId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID;
			finderArgs = new Object[] { debitNoteId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTEID;
			finderArgs = new Object[] { debitNoteId, start, end, orderByComparator };
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((debitNoteId != vehicleRecord.getDebitNoteId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(debitNoteId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByDebitNoteId_First(long debitNoteId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByDebitNoteId_First(debitNoteId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitNoteId=");
		msg.append(debitNoteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByDebitNoteId_First(long debitNoteId,
		OrderByComparator orderByComparator) throws SystemException {
		List<VehicleRecord> list = findByDebitNoteId(debitNoteId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByDebitNoteId_Last(long debitNoteId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByDebitNoteId_Last(debitNoteId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitNoteId=");
		msg.append(debitNoteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByDebitNoteId_Last(long debitNoteId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDebitNoteId(debitNoteId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByDebitNoteId(debitNoteId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where debitNoteId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByDebitNoteId_PrevAndNext(long id,
		long debitNoteId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByDebitNoteId_PrevAndNext(session, vehicleRecord,
					debitNoteId, orderByComparator, true);

			array[1] = vehicleRecord;

			array[2] = getByDebitNoteId_PrevAndNext(session, vehicleRecord,
					debitNoteId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VehicleRecord getByDebitNoteId_PrevAndNext(Session session,
		VehicleRecord vehicleRecord, long debitNoteId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(debitNoteId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where debitNoteId = &#63; from the database.
	 *
	 * @param debitNoteId the debit note ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDebitNoteId(long debitNoteId) throws SystemException {
		for (VehicleRecord vehicleRecord : findByDebitNoteId(debitNoteId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDebitNoteId(long debitNoteId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEBITNOTEID;

		Object[] finderArgs = new Object[] { debitNoteId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(debitNoteId);

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

	private static final String _FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2 = "vehicleRecord.debitNoteId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SAFETESTREQUIREMENTID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySafeTestRequirementId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETESTREQUIREMENTID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySafeTestRequirementId",
			new String[] { Long.class.getName() },
			VehicleRecordModelImpl.SAFETESTREQUIREMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySafeTestRequirementId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where safeTestRequirementId = &#63;.
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId) throws SystemException {
		return findBySafeTestRequirementId(safeTestRequirementId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where safeTestRequirementId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId, int start, int end)
		throws SystemException {
		return findBySafeTestRequirementId(safeTestRequirementId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where safeTestRequirementId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETESTREQUIREMENTID;
			finderArgs = new Object[] { safeTestRequirementId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SAFETESTREQUIREMENTID;
			finderArgs = new Object[] {
					safeTestRequirementId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((safeTestRequirementId != vehicleRecord.getSafeTestRequirementId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_SAFETESTREQUIREMENTID_SAFETESTREQUIREMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(safeTestRequirementId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where safeTestRequirementId = &#63;.
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findBySafeTestRequirementId_First(
		long safeTestRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchBySafeTestRequirementId_First(safeTestRequirementId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("safeTestRequirementId=");
		msg.append(safeTestRequirementId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where safeTestRequirementId = &#63;.
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchBySafeTestRequirementId_First(
		long safeTestRequirementId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleRecord> list = findBySafeTestRequirementId(safeTestRequirementId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where safeTestRequirementId = &#63;.
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findBySafeTestRequirementId_Last(
		long safeTestRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchBySafeTestRequirementId_Last(safeTestRequirementId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("safeTestRequirementId=");
		msg.append(safeTestRequirementId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where safeTestRequirementId = &#63;.
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchBySafeTestRequirementId_Last(
		long safeTestRequirementId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySafeTestRequirementId(safeTestRequirementId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findBySafeTestRequirementId(safeTestRequirementId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where safeTestRequirementId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param safeTestRequirementId the safe test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findBySafeTestRequirementId_PrevAndNext(long id,
		long safeTestRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getBySafeTestRequirementId_PrevAndNext(session,
					vehicleRecord, safeTestRequirementId, orderByComparator,
					true);

			array[1] = vehicleRecord;

			array[2] = getBySafeTestRequirementId_PrevAndNext(session,
					vehicleRecord, safeTestRequirementId, orderByComparator,
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

	protected VehicleRecord getBySafeTestRequirementId_PrevAndNext(
		Session session, VehicleRecord vehicleRecord,
		long safeTestRequirementId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_SAFETESTREQUIREMENTID_SAFETESTREQUIREMENTID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(safeTestRequirementId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where safeTestRequirementId = &#63; from the database.
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySafeTestRequirementId(long safeTestRequirementId)
		throws SystemException {
		for (VehicleRecord vehicleRecord : findBySafeTestRequirementId(
				safeTestRequirementId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where safeTestRequirementId = &#63;.
	 *
	 * @param safeTestRequirementId the safe test requirement ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySafeTestRequirementId(long safeTestRequirementId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID;

		Object[] finderArgs = new Object[] { safeTestRequirementId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_SAFETESTREQUIREMENTID_SAFETESTREQUIREMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(safeTestRequirementId);

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

	private static final String _FINDER_COLUMN_SAFETESTREQUIREMENTID_SAFETESTREQUIREMENTID_2 =
		"vehicleRecord.safeTestRequirementId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMISSIONTESTREQUIREMENTID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEmissionTestRequirementId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREQUIREMENTID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEmissionTestRequirementId",
			new String[] { Long.class.getName() },
			VehicleRecordModelImpl.EMISSIONTESTREQUIREMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEmissionTestRequirementId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where emissionTestRequirementId = &#63;.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId) throws SystemException {
		return findByEmissionTestRequirementId(emissionTestRequirementId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where emissionTestRequirementId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId, int start, int end)
		throws SystemException {
		return findByEmissionTestRequirementId(emissionTestRequirementId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where emissionTestRequirementId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREQUIREMENTID;
			finderArgs = new Object[] { emissionTestRequirementId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMISSIONTESTREQUIREMENTID;
			finderArgs = new Object[] {
					emissionTestRequirementId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((emissionTestRequirementId != vehicleRecord.getEmissionTestRequirementId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_EMISSIONTESTREQUIREMENTID_EMISSIONTESTREQUIREMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(emissionTestRequirementId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByEmissionTestRequirementId_First(
		long emissionTestRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByEmissionTestRequirementId_First(emissionTestRequirementId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emissionTestRequirementId=");
		msg.append(emissionTestRequirementId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByEmissionTestRequirementId_First(
		long emissionTestRequirementId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleRecord> list = findByEmissionTestRequirementId(emissionTestRequirementId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByEmissionTestRequirementId_Last(
		long emissionTestRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByEmissionTestRequirementId_Last(emissionTestRequirementId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emissionTestRequirementId=");
		msg.append(emissionTestRequirementId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByEmissionTestRequirementId_Last(
		long emissionTestRequirementId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByEmissionTestRequirementId(emissionTestRequirementId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByEmissionTestRequirementId(emissionTestRequirementId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByEmissionTestRequirementId_PrevAndNext(
		long id, long emissionTestRequirementId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByEmissionTestRequirementId_PrevAndNext(session,
					vehicleRecord, emissionTestRequirementId,
					orderByComparator, true);

			array[1] = vehicleRecord;

			array[2] = getByEmissionTestRequirementId_PrevAndNext(session,
					vehicleRecord, emissionTestRequirementId,
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

	protected VehicleRecord getByEmissionTestRequirementId_PrevAndNext(
		Session session, VehicleRecord vehicleRecord,
		long emissionTestRequirementId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_EMISSIONTESTREQUIREMENTID_EMISSIONTESTREQUIREMENTID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(emissionTestRequirementId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where emissionTestRequirementId = &#63; from the database.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmissionTestRequirementId(
		long emissionTestRequirementId) throws SystemException {
		for (VehicleRecord vehicleRecord : findByEmissionTestRequirementId(
				emissionTestRequirementId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where emissionTestRequirementId = &#63;.
	 *
	 * @param emissionTestRequirementId the emission test requirement ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmissionTestRequirementId(long emissionTestRequirementId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID;

		Object[] finderArgs = new Object[] { emissionTestRequirementId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_EMISSIONTESTREQUIREMENTID_EMISSIONTESTREQUIREMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(emissionTestRequirementId);

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

	private static final String _FINDER_COLUMN_EMISSIONTESTREQUIREMENTID_EMISSIONTESTREQUIREMENTID_2 =
		"vehicleRecord.emissionTestRequirementId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTROLREQUIREMENTID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByControlRequirementId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTROLREQUIREMENTID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByControlRequirementId",
			new String[] { Long.class.getName() },
			VehicleRecordModelImpl.CONTROLREQUIREMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTROLREQUIREMENTID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByControlRequirementId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where controlRequirementId = &#63;.
	 *
	 * @param controlRequirementId the control requirement ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByControlRequirementId(
		long controlRequirementId) throws SystemException {
		return findByControlRequirementId(controlRequirementId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where controlRequirementId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param controlRequirementId the control requirement ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByControlRequirementId(
		long controlRequirementId, int start, int end)
		throws SystemException {
		return findByControlRequirementId(controlRequirementId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where controlRequirementId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param controlRequirementId the control requirement ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByControlRequirementId(
		long controlRequirementId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTROLREQUIREMENTID;
			finderArgs = new Object[] { controlRequirementId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTROLREQUIREMENTID;
			finderArgs = new Object[] {
					controlRequirementId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((controlRequirementId != vehicleRecord.getControlRequirementId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CONTROLREQUIREMENTID_CONTROLREQUIREMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(controlRequirementId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where controlRequirementId = &#63;.
	 *
	 * @param controlRequirementId the control requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByControlRequirementId_First(
		long controlRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByControlRequirementId_First(controlRequirementId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("controlRequirementId=");
		msg.append(controlRequirementId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where controlRequirementId = &#63;.
	 *
	 * @param controlRequirementId the control requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByControlRequirementId_First(
		long controlRequirementId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleRecord> list = findByControlRequirementId(controlRequirementId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where controlRequirementId = &#63;.
	 *
	 * @param controlRequirementId the control requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByControlRequirementId_Last(
		long controlRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByControlRequirementId_Last(controlRequirementId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("controlRequirementId=");
		msg.append(controlRequirementId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where controlRequirementId = &#63;.
	 *
	 * @param controlRequirementId the control requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByControlRequirementId_Last(
		long controlRequirementId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByControlRequirementId(controlRequirementId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByControlRequirementId(controlRequirementId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where controlRequirementId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param controlRequirementId the control requirement ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByControlRequirementId_PrevAndNext(long id,
		long controlRequirementId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByControlRequirementId_PrevAndNext(session,
					vehicleRecord, controlRequirementId, orderByComparator, true);

			array[1] = vehicleRecord;

			array[2] = getByControlRequirementId_PrevAndNext(session,
					vehicleRecord, controlRequirementId, orderByComparator,
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

	protected VehicleRecord getByControlRequirementId_PrevAndNext(
		Session session, VehicleRecord vehicleRecord,
		long controlRequirementId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_CONTROLREQUIREMENTID_CONTROLREQUIREMENTID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(controlRequirementId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where controlRequirementId = &#63; from the database.
	 *
	 * @param controlRequirementId the control requirement ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByControlRequirementId(long controlRequirementId)
		throws SystemException {
		for (VehicleRecord vehicleRecord : findByControlRequirementId(
				controlRequirementId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where controlRequirementId = &#63;.
	 *
	 * @param controlRequirementId the control requirement ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByControlRequirementId(long controlRequirementId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTROLREQUIREMENTID;

		Object[] finderArgs = new Object[] { controlRequirementId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CONTROLREQUIREMENTID_CONTROLREQUIREMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(controlRequirementId);

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

	private static final String _FINDER_COLUMN_CONTROLREQUIREMENTID_CONTROLREQUIREMENTID_2 =
		"vehicleRecord.controlRequirementId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByConfirmedInspectionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConfirmedInspectionId",
			new String[] { Long.class.getName() },
			VehicleRecordModelImpl.CONFIRMEDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConfirmedInspectionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId) throws SystemException {
		return findByConfirmedInspectionId(confirmedInspectionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where confirmedInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end)
		throws SystemException {
		return findByConfirmedInspectionId(confirmedInspectionId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where confirmedInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID;
			finderArgs = new Object[] { confirmedInspectionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID;
			finderArgs = new Object[] {
					confirmedInspectionId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((confirmedInspectionId != vehicleRecord.getConfirmedInspectionId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CONFIRMEDINSPECTIONID_CONFIRMEDINSPECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(confirmedInspectionId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByConfirmedInspectionId_First(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByConfirmedInspectionId_First(confirmedInspectionId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("confirmedInspectionId=");
		msg.append(confirmedInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByConfirmedInspectionId_First(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleRecord> list = findByConfirmedInspectionId(confirmedInspectionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByConfirmedInspectionId_Last(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByConfirmedInspectionId_Last(confirmedInspectionId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("confirmedInspectionId=");
		msg.append(confirmedInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByConfirmedInspectionId_Last(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByConfirmedInspectionId(confirmedInspectionId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByConfirmedInspectionId(confirmedInspectionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByConfirmedInspectionId_PrevAndNext(long id,
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByConfirmedInspectionId_PrevAndNext(session,
					vehicleRecord, confirmedInspectionId, orderByComparator,
					true);

			array[1] = vehicleRecord;

			array[2] = getByConfirmedInspectionId_PrevAndNext(session,
					vehicleRecord, confirmedInspectionId, orderByComparator,
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

	protected VehicleRecord getByConfirmedInspectionId_PrevAndNext(
		Session session, VehicleRecord vehicleRecord,
		long confirmedInspectionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_CONFIRMEDINSPECTIONID_CONFIRMEDINSPECTIONID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(confirmedInspectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where confirmedInspectionId = &#63; from the database.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByConfirmedInspectionId(long confirmedInspectionId)
		throws SystemException {
		for (VehicleRecord vehicleRecord : findByConfirmedInspectionId(
				confirmedInspectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByConfirmedInspectionId(long confirmedInspectionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID;

		Object[] finderArgs = new Object[] { confirmedInspectionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_CONFIRMEDINSPECTIONID_CONFIRMEDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(confirmedInspectionId);

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

	private static final String _FINDER_COLUMN_CONFIRMEDINSPECTIONID_CONFIRMEDINSPECTIONID_2 =
		"vehicleRecord.confirmedInspectionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectionRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectionRecordId", new String[] { Long.class.getName() },
			VehicleRecordModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByInspectionRecordId(long inspectionRecordId)
		throws SystemException {
		return findByInspectionRecordId(inspectionRecordId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId, int start, int end) throws SystemException {
		return findByInspectionRecordId(inspectionRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID;
			finderArgs = new Object[] { inspectionRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDID;
			finderArgs = new Object[] {
					inspectionRecordId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((inspectionRecordId != vehicleRecord.getInspectionRecordId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByInspectionRecordId_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByInspectionRecordId_First(inspectionRecordId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByInspectionRecordId_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleRecord> list = findByInspectionRecordId(inspectionRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByInspectionRecordId_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByInspectionRecordId_Last(inspectionRecordId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByInspectionRecordId_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInspectionRecordId(inspectionRecordId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByInspectionRecordId(inspectionRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByInspectionRecordId_PrevAndNext(long id,
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByInspectionRecordId_PrevAndNext(session,
					vehicleRecord, inspectionRecordId, orderByComparator, true);

			array[1] = vehicleRecord;

			array[2] = getByInspectionRecordId_PrevAndNext(session,
					vehicleRecord, inspectionRecordId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VehicleRecord getByInspectionRecordId_PrevAndNext(
		Session session, VehicleRecord vehicleRecord, long inspectionRecordId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectionRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where inspectionRecordId = &#63; from the database.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectionRecordId(long inspectionRecordId)
		throws SystemException {
		for (VehicleRecord vehicleRecord : findByInspectionRecordId(
				inspectionRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionRecordId(long inspectionRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDID;

		Object[] finderArgs = new Object[] { inspectionRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2 =
		"vehicleRecord.inspectionRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByVehicleGroupId", new String[] { Long.class.getName() },
			VehicleRecordModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByVehicleGroupId(long vehicleGroupId,
		int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByVehicleGroupId(long vehicleGroupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID;
			finderArgs = new Object[] { vehicleGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID;
			finderArgs = new Object[] {
					vehicleGroupId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((vehicleGroupId != vehicleRecord.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByVehicleGroupId_First(long vehicleGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByVehicleGroupId_First(long vehicleGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<VehicleRecord> list = findByVehicleGroupId(vehicleGroupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByVehicleGroupId_Last(long vehicleGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByVehicleGroupId_Last(long vehicleGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByVehicleGroupId_PrevAndNext(long id,
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session, vehicleRecord,
					vehicleGroupId, orderByComparator, true);

			array[1] = vehicleRecord;

			array[2] = getByVehicleGroupId_PrevAndNext(session, vehicleRecord,
					vehicleGroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VehicleRecord getByVehicleGroupId_PrevAndNext(Session session,
		VehicleRecord vehicleRecord, long vehicleGroupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (VehicleRecord vehicleRecord : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLEGROUPID;

		Object[] finderArgs = new Object[] { vehicleGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "vehicleRecord.vehicleGroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTCERTIFICATEID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDraftCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID =
		new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED,
			VehicleRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDraftCertificateId", new String[] { Long.class.getName() },
			VehicleRecordModelImpl.DRAFTCERTIFICATEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID = new FinderPath(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDraftCertificateId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle records where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @return the matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByDraftCertificateId(long draftCertificateId)
		throws SystemException {
		return findByDraftCertificateId(draftCertificateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records where draftCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByDraftCertificateId(
		long draftCertificateId, int start, int end) throws SystemException {
		return findByDraftCertificateId(draftCertificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records where draftCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findByDraftCertificateId(
		long draftCertificateId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID;
			finderArgs = new Object[] { draftCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTCERTIFICATEID;
			finderArgs = new Object[] {
					draftCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleRecord vehicleRecord : list) {
				if ((draftCertificateId != vehicleRecord.getDraftCertificateId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(draftCertificateId);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first vehicle record in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByDraftCertificateId_First(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByDraftCertificateId_First(draftCertificateId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("draftCertificateId=");
		msg.append(draftCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the first vehicle record in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByDraftCertificateId_First(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleRecord> list = findByDraftCertificateId(draftCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle record in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByDraftCertificateId_Last(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByDraftCertificateId_Last(draftCertificateId,
				orderByComparator);

		if (vehicleRecord != null) {
			return vehicleRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("draftCertificateId=");
		msg.append(draftCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleRecordException(msg.toString());
	}

	/**
	 * Returns the last vehicle record in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByDraftCertificateId_Last(
		long draftCertificateId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDraftCertificateId(draftCertificateId);

		if (count == 0) {
			return null;
		}

		List<VehicleRecord> list = findByDraftCertificateId(draftCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle records before and after the current vehicle record in the ordered set where draftCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vehicle record
	 * @param draftCertificateId the draft certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord[] findByDraftCertificateId_PrevAndNext(long id,
		long draftCertificateId, OrderByComparator orderByComparator)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleRecord[] array = new VehicleRecordImpl[3];

			array[0] = getByDraftCertificateId_PrevAndNext(session,
					vehicleRecord, draftCertificateId, orderByComparator, true);

			array[1] = vehicleRecord;

			array[2] = getByDraftCertificateId_PrevAndNext(session,
					vehicleRecord, draftCertificateId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VehicleRecord getByDraftCertificateId_PrevAndNext(
		Session session, VehicleRecord vehicleRecord, long draftCertificateId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORD_WHERE);

		query.append(_FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2);

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
			query.append(VehicleRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(draftCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle records where draftCertificateId = &#63; from the database.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDraftCertificateId(long draftCertificateId)
		throws SystemException {
		for (VehicleRecord vehicleRecord : findByDraftCertificateId(
				draftCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records where draftCertificateId = &#63;.
	 *
	 * @param draftCertificateId the draft certificate ID
	 * @return the number of matching vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDraftCertificateId(long draftCertificateId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID;

		Object[] finderArgs = new Object[] { draftCertificateId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORD_WHERE);

			query.append(_FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(draftCertificateId);

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

	private static final String _FINDER_COLUMN_DRAFTCERTIFICATEID_DRAFTCERTIFICATEID_2 =
		"vehicleRecord.draftCertificateId = ?";

	public VehicleRecordPersistenceImpl() {
		setModelClass(VehicleRecord.class);
	}

	/**
	 * Caches the vehicle record in the entity cache if it is enabled.
	 *
	 * @param vehicleRecord the vehicle record
	 */
	@Override
	public void cacheResult(VehicleRecord vehicleRecord) {
		EntityCacheUtil.putResult(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordImpl.class, vehicleRecord.getPrimaryKey(),
			vehicleRecord);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
			new Object[] { vehicleRecord.getCodeNumber() }, vehicleRecord);

		vehicleRecord.resetOriginalValues();
	}

	/**
	 * Caches the vehicle records in the entity cache if it is enabled.
	 *
	 * @param vehicleRecords the vehicle records
	 */
	@Override
	public void cacheResult(List<VehicleRecord> vehicleRecords) {
		for (VehicleRecord vehicleRecord : vehicleRecords) {
			if (EntityCacheUtil.getResult(
						VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
						VehicleRecordImpl.class, vehicleRecord.getPrimaryKey()) == null) {
				cacheResult(vehicleRecord);
			}
			else {
				vehicleRecord.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle records.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleRecordImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleRecordImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle record.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehicleRecord vehicleRecord) {
		EntityCacheUtil.removeResult(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordImpl.class, vehicleRecord.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(vehicleRecord);
	}

	@Override
	public void clearCache(List<VehicleRecord> vehicleRecords) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehicleRecord vehicleRecord : vehicleRecords) {
			EntityCacheUtil.removeResult(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
				VehicleRecordImpl.class, vehicleRecord.getPrimaryKey());

			clearUniqueFindersCache(vehicleRecord);
		}
	}

	protected void cacheUniqueFindersCache(VehicleRecord vehicleRecord) {
		if (vehicleRecord.isNew()) {
			Object[] args = new Object[] { vehicleRecord.getCodeNumber() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODENUMBER, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER, args,
				vehicleRecord);
		}
		else {
			VehicleRecordModelImpl vehicleRecordModelImpl = (VehicleRecordModelImpl)vehicleRecord;

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { vehicleRecord.getCodeNumber() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODENUMBER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
					args, vehicleRecord);
			}
		}
	}

	protected void clearUniqueFindersCache(VehicleRecord vehicleRecord) {
		VehicleRecordModelImpl vehicleRecordModelImpl = (VehicleRecordModelImpl)vehicleRecord;

		Object[] args = new Object[] { vehicleRecord.getCodeNumber() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODENUMBER, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODENUMBER, args);

		if ((vehicleRecordModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODENUMBER.getColumnBitmask()) != 0) {
			args = new Object[] { vehicleRecordModelImpl.getOriginalCodeNumber() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODENUMBER, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODENUMBER, args);
		}
	}

	/**
	 * Creates a new vehicle record with the primary key. Does not add the vehicle record to the database.
	 *
	 * @param id the primary key for the new vehicle record
	 * @return the new vehicle record
	 */
	@Override
	public VehicleRecord create(long id) {
		VehicleRecord vehicleRecord = new VehicleRecordImpl();

		vehicleRecord.setNew(true);
		vehicleRecord.setPrimaryKey(id);

		return vehicleRecord;
	}

	/**
	 * Removes the vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehicle record
	 * @return the vehicle record that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord remove(long id)
		throws NoSuchVehicleRecordException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle record
	 * @return the vehicle record that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord remove(Serializable primaryKey)
		throws NoSuchVehicleRecordException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehicleRecord vehicleRecord = (VehicleRecord)session.get(VehicleRecordImpl.class,
					primaryKey);

			if (vehicleRecord == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicleRecord);
		}
		catch (NoSuchVehicleRecordException nsee) {
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
	protected VehicleRecord removeImpl(VehicleRecord vehicleRecord)
		throws SystemException {
		vehicleRecord = toUnwrappedModel(vehicleRecord);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicleRecord)) {
				vehicleRecord = (VehicleRecord)session.get(VehicleRecordImpl.class,
						vehicleRecord.getPrimaryKeyObj());
			}

			if (vehicleRecord != null) {
				session.delete(vehicleRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicleRecord != null) {
			clearCache(vehicleRecord);
		}

		return vehicleRecord;
	}

	@Override
	public VehicleRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws SystemException {
		vehicleRecord = toUnwrappedModel(vehicleRecord);

		boolean isNew = vehicleRecord.isNew();

		VehicleRecordModelImpl vehicleRecordModelImpl = (VehicleRecordModelImpl)vehicleRecord;

		Session session = null;

		try {
			session = openSession();

			if (vehicleRecord.isNew()) {
				session.save(vehicleRecord);

				vehicleRecord.setNew(false);
			}
			else {
				session.merge(vehicleRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VehicleRecordModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						vehicleRecordModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalDebitNoteId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID,
					args);

				args = new Object[] { vehicleRecordModelImpl.getDebitNoteId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETESTREQUIREMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalSafeTestRequirementId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETESTREQUIREMENTID,
					args);

				args = new Object[] {
						vehicleRecordModelImpl.getSafeTestRequirementId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETESTREQUIREMENTID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREQUIREMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalEmissionTestRequirementId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREQUIREMENTID,
					args);

				args = new Object[] {
						vehicleRecordModelImpl.getEmissionTestRequirementId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREQUIREMENTID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTROLREQUIREMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalControlRequirementId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTROLREQUIREMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTROLREQUIREMENTID,
					args);

				args = new Object[] {
						vehicleRecordModelImpl.getControlRequirementId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTROLREQUIREMENTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTROLREQUIREMENTID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalConfirmedInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID,
					args);

				args = new Object[] {
						vehicleRecordModelImpl.getConfirmedInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);

				args = new Object[] {
						vehicleRecordModelImpl.getInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] { vehicleRecordModelImpl.getVehicleGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}

			if ((vehicleRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleRecordModelImpl.getOriginalDraftCertificateId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID,
					args);

				args = new Object[] {
						vehicleRecordModelImpl.getDraftCertificateId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DRAFTCERTIFICATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTCERTIFICATEID,
					args);
			}
		}

		EntityCacheUtil.putResult(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
			VehicleRecordImpl.class, vehicleRecord.getPrimaryKey(),
			vehicleRecord);

		clearUniqueFindersCache(vehicleRecord);
		cacheUniqueFindersCache(vehicleRecord);

		return vehicleRecord;
	}

	protected VehicleRecord toUnwrappedModel(VehicleRecord vehicleRecord) {
		if (vehicleRecord instanceof VehicleRecordImpl) {
			return vehicleRecord;
		}

		VehicleRecordImpl vehicleRecordImpl = new VehicleRecordImpl();

		vehicleRecordImpl.setNew(vehicleRecord.isNew());
		vehicleRecordImpl.setPrimaryKey(vehicleRecord.getPrimaryKey());

		vehicleRecordImpl.setId(vehicleRecord.getId());
		vehicleRecordImpl.setVehicleGroupId(vehicleRecord.getVehicleGroupId());
		vehicleRecordImpl.setDebitNoteId(vehicleRecord.getDebitNoteId());
		vehicleRecordImpl.setSequenceNo(vehicleRecord.getSequenceNo());
		vehicleRecordImpl.setCodeNumber(vehicleRecord.getCodeNumber());
		vehicleRecordImpl.setChassisNumber(vehicleRecord.getChassisNumber());
		vehicleRecordImpl.setEngineNumber(vehicleRecord.getEngineNumber());
		vehicleRecordImpl.setProductionYear(vehicleRecord.getProductionYear());
		vehicleRecordImpl.setVehicleEngineStatus(vehicleRecord.getVehicleEngineStatus());
		vehicleRecordImpl.setVehicleColor(vehicleRecord.getVehicleColor());
		vehicleRecordImpl.setUnitPrice(vehicleRecord.getUnitPrice());
		vehicleRecordImpl.setCurrency(vehicleRecord.getCurrency());
		vehicleRecordImpl.setRemarks(vehicleRecord.getRemarks());
		vehicleRecordImpl.setConfirmedInspectionId(vehicleRecord.getConfirmedInspectionId());
		vehicleRecordImpl.setInspectionRecordId(vehicleRecord.getInspectionRecordId());
		vehicleRecordImpl.setDraftCertificateId(vehicleRecord.getDraftCertificateId());
		vehicleRecordImpl.setCertificateRecordId(vehicleRecord.getCertificateRecordId());
		vehicleRecordImpl.setMarkUpStatus(vehicleRecord.getMarkUpStatus());
		vehicleRecordImpl.setSafeTestRequirementId(vehicleRecord.getSafeTestRequirementId());
		vehicleRecordImpl.setEmissionTestRequirementId(vehicleRecord.getEmissionTestRequirementId());
		vehicleRecordImpl.setControlRequirementId(vehicleRecord.getControlRequirementId());
		vehicleRecordImpl.setMarkAsSample(vehicleRecord.getMarkAsSample());

		return vehicleRecordImpl;
	}

	/**
	 * Returns the vehicle record with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle record
	 * @return the vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleRecordException, SystemException {
		VehicleRecord vehicleRecord = fetchByPrimaryKey(primaryKey);

		if (vehicleRecord == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicleRecord;
	}

	/**
	 * Returns the vehicle record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException} if it could not be found.
	 *
	 * @param id the primary key of the vehicle record
	 * @return the vehicle record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord findByPrimaryKey(long id)
		throws NoSuchVehicleRecordException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehicle record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle record
	 * @return the vehicle record, or <code>null</code> if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehicleRecord vehicleRecord = (VehicleRecord)EntityCacheUtil.getResult(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
				VehicleRecordImpl.class, primaryKey);

		if (vehicleRecord == _nullVehicleRecord) {
			return null;
		}

		if (vehicleRecord == null) {
			Session session = null;

			try {
				session = openSession();

				vehicleRecord = (VehicleRecord)session.get(VehicleRecordImpl.class,
						primaryKey);

				if (vehicleRecord != null) {
					cacheResult(vehicleRecord);
				}
				else {
					EntityCacheUtil.putResult(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
						VehicleRecordImpl.class, primaryKey, _nullVehicleRecord);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleRecordModelImpl.ENTITY_CACHE_ENABLED,
					VehicleRecordImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicleRecord;
	}

	/**
	 * Returns the vehicle record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehicle record
	 * @return the vehicle record, or <code>null</code> if a vehicle record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleRecord fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehicle records.
	 *
	 * @return the vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @return the range of vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle records
	 * @param end the upper bound of the range of vehicle records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicle records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleRecord> findAll(int start, int end,
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

		List<VehicleRecord> list = (List<VehicleRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLERECORD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLERECORD;

				if (pagination) {
					sql = sql.concat(VehicleRecordModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleRecord>(list);
				}
				else {
					list = (List<VehicleRecord>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the vehicle records from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehicleRecord vehicleRecord : findAll()) {
			remove(vehicleRecord);
		}
	}

	/**
	 * Returns the number of vehicle records.
	 *
	 * @return the number of vehicle records
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLERECORD);

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
	 * Initializes the vehicle record persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehicleRecord>> listenersList = new ArrayList<ModelListener<VehicleRecord>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehicleRecord>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehicleRecordImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLERECORD = "SELECT vehicleRecord FROM VehicleRecord vehicleRecord";
	private static final String _SQL_SELECT_VEHICLERECORD_WHERE = "SELECT vehicleRecord FROM VehicleRecord vehicleRecord WHERE ";
	private static final String _SQL_COUNT_VEHICLERECORD = "SELECT COUNT(vehicleRecord) FROM VehicleRecord vehicleRecord";
	private static final String _SQL_COUNT_VEHICLERECORD_WHERE = "SELECT COUNT(vehicleRecord) FROM VehicleRecord vehicleRecord WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicleRecord.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehicleRecord exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VehicleRecord exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehicleRecordPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleGroupId", "debitNoteId", "sequenceNo", "codeNumber",
				"chassisNumber", "engineNumber", "productionYear",
				"vehicleEngineStatus", "vehicleColor", "unitPrice",
				"confirmedInspectionId", "inspectionRecordId",
				"draftCertificateId", "certificateRecordId", "markUpStatus",
				"safeTestRequirementId", "emissionTestRequirementId",
				"controlRequirementId", "markAsSample"
			});
	private static VehicleRecord _nullVehicleRecord = new VehicleRecordImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehicleRecord> toCacheModel() {
				return _nullVehicleRecordCacheModel;
			}
		};

	private static CacheModel<VehicleRecord> _nullVehicleRecordCacheModel = new CacheModel<VehicleRecord>() {
			@Override
			public VehicleRecord toEntityModel() {
				return _nullVehicleRecord;
			}
		};
}