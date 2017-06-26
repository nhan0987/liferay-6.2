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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the inspection record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see InspectionRecordPersistence
 * @see InspectionRecordUtil
 * @generated
 */
public class InspectionRecordPersistenceImpl extends BasePersistenceImpl<InspectionRecord>
	implements InspectionRecordPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InspectionRecordUtil} to access the inspection record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InspectionRecordImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] { Long.class.getName() },
			InspectionRecordModelImpl.REGISTEREDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredInspectionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the inspection records where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByRegisteredInspectionId(
		long registeredInspectionId) throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection records where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @return the range of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the inspection records where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID;
			finderArgs = new Object[] { registeredInspectionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID;
			finderArgs = new Object[] {
					registeredInspectionId,
					
					start, end, orderByComparator
				};
		}

		List<InspectionRecord> list = (List<InspectionRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionRecord inspectionRecord : list) {
				if ((registeredInspectionId != inspectionRecord.getRegisteredInspectionId())) {
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

			query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

				if (!pagination) {
					list = (List<InspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecord>(list);
				}
				else {
					list = (List<InspectionRecord>)QueryUtil.list(q,
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
	 * Returns the first inspection record in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByRegisteredInspectionId_First(registeredInspectionId,
				orderByComparator);

		if (inspectionRecord != null) {
			return inspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the first inspection record in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<InspectionRecord> list = findByRegisteredInspectionId(registeredInspectionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection record in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByRegisteredInspectionId_Last(registeredInspectionId,
				orderByComparator);

		if (inspectionRecord != null) {
			return inspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the last inspection record in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRegisteredInspectionId(registeredInspectionId);

		if (count == 0) {
			return null;
		}

		List<InspectionRecord> list = findByRegisteredInspectionId(registeredInspectionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection records before and after the current inspection record in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param id the primary key of the current inspection record
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionRecord[] array = new InspectionRecordImpl[3];

			array[0] = getByRegisteredInspectionId_PrevAndNext(session,
					inspectionRecord, registeredInspectionId,
					orderByComparator, true);

			array[1] = inspectionRecord;

			array[2] = getByRegisteredInspectionId_PrevAndNext(session,
					inspectionRecord, registeredInspectionId,
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

	protected InspectionRecord getByRegisteredInspectionId_PrevAndNext(
		Session session, InspectionRecord inspectionRecord,
		long registeredInspectionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

		query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

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
			query.append(InspectionRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(registeredInspectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection records where registeredInspectionId = &#63; from the database.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		for (InspectionRecord inspectionRecord : findByRegisteredInspectionId(
				registeredInspectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(inspectionRecord);
		}
	}

	/**
	 * Returns the number of inspection records where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the number of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID;

		Object[] finderArgs = new Object[] { registeredInspectionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

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

	private static final String _FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2 =
		"inspectionRecord.registeredInspectionId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_PHIEUXULYPHUID = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPhieuXuLyPhuId", new String[] { Long.class.getName() },
			InspectionRecordModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYPHUID = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhieuXuLyPhuId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the inspection record where phieuXuLyPhuId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByPhieuXuLyPhuId(phieuXuLyPhuId);

		if (inspectionRecord == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("phieuXuLyPhuId=");
			msg.append(phieuXuLyPhuId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInspectionRecordException(msg.toString());
		}

		return inspectionRecord;
	}

	/**
	 * Returns the inspection record where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		return fetchByPhieuXuLyPhuId(phieuXuLyPhuId, true);
	}

	/**
	 * Returns the inspection record where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByPhieuXuLyPhuId(long phieuXuLyPhuId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { phieuXuLyPhuId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
					finderArgs, this);
		}

		if (result instanceof InspectionRecord) {
			InspectionRecord inspectionRecord = (InspectionRecord)result;

			if ((phieuXuLyPhuId != inspectionRecord.getPhieuXuLyPhuId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				List<InspectionRecord> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"InspectionRecordPersistenceImpl.fetchByPhieuXuLyPhuId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					InspectionRecord inspectionRecord = list.get(0);

					result = inspectionRecord;

					cacheResult(inspectionRecord);

					if ((inspectionRecord.getPhieuXuLyPhuId() != phieuXuLyPhuId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
							finderArgs, inspectionRecord);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
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
			return (InspectionRecord)result;
		}
	}

	/**
	 * Removes the inspection record where phieuXuLyPhuId = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the inspection record that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = findByPhieuXuLyPhuId(phieuXuLyPhuId);

		return remove(inspectionRecord);
	}

	/**
	 * Returns the number of inspection records where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the number of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYPHUID;

		Object[] finderArgs = new Object[] { phieuXuLyPhuId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2 = "inspectionRecord.phieuXuLyPhuId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID =
		new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByConfirmedinspectionid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID =
		new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConfirmedinspectionid",
			new String[] { Long.class.getName() },
			InspectionRecordModelImpl.CONFIRMEDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConfirmedinspectionid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the inspection records where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @return the matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByConfirmedinspectionid(
		long confirmedInspectionId) throws SystemException {
		return findByConfirmedinspectionid(confirmedInspectionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection records where confirmedInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @return the range of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByConfirmedinspectionid(
		long confirmedInspectionId, int start, int end)
		throws SystemException {
		return findByConfirmedinspectionid(confirmedInspectionId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the inspection records where confirmedInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByConfirmedinspectionid(
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

		List<InspectionRecord> list = (List<InspectionRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionRecord inspectionRecord : list) {
				if ((confirmedInspectionId != inspectionRecord.getConfirmedInspectionId())) {
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

			query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_CONFIRMEDINSPECTIONID_CONFIRMEDINSPECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(confirmedInspectionId);

				if (!pagination) {
					list = (List<InspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecord>(list);
				}
				else {
					list = (List<InspectionRecord>)QueryUtil.list(q,
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
	 * Returns the first inspection record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByConfirmedinspectionid_First(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByConfirmedinspectionid_First(confirmedInspectionId,
				orderByComparator);

		if (inspectionRecord != null) {
			return inspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("confirmedInspectionId=");
		msg.append(confirmedInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the first inspection record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByConfirmedinspectionid_First(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<InspectionRecord> list = findByConfirmedinspectionid(confirmedInspectionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByConfirmedinspectionid_Last(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByConfirmedinspectionid_Last(confirmedInspectionId,
				orderByComparator);

		if (inspectionRecord != null) {
			return inspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("confirmedInspectionId=");
		msg.append(confirmedInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the last inspection record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByConfirmedinspectionid_Last(
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByConfirmedinspectionid(confirmedInspectionId);

		if (count == 0) {
			return null;
		}

		List<InspectionRecord> list = findByConfirmedinspectionid(confirmedInspectionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection records before and after the current inspection record in the ordered set where confirmedInspectionId = &#63;.
	 *
	 * @param id the primary key of the current inspection record
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord[] findByConfirmedinspectionid_PrevAndNext(long id,
		long confirmedInspectionId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionRecord[] array = new InspectionRecordImpl[3];

			array[0] = getByConfirmedinspectionid_PrevAndNext(session,
					inspectionRecord, confirmedInspectionId, orderByComparator,
					true);

			array[1] = inspectionRecord;

			array[2] = getByConfirmedinspectionid_PrevAndNext(session,
					inspectionRecord, confirmedInspectionId, orderByComparator,
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

	protected InspectionRecord getByConfirmedinspectionid_PrevAndNext(
		Session session, InspectionRecord inspectionRecord,
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

		query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

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
			query.append(InspectionRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(confirmedInspectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection records where confirmedInspectionId = &#63; from the database.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByConfirmedinspectionid(long confirmedInspectionId)
		throws SystemException {
		for (InspectionRecord inspectionRecord : findByConfirmedinspectionid(
				confirmedInspectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(inspectionRecord);
		}
	}

	/**
	 * Returns the number of inspection records where confirmedInspectionId = &#63;.
	 *
	 * @param confirmedInspectionId the confirmed inspection ID
	 * @return the number of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByConfirmedinspectionid(long confirmedInspectionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID;

		Object[] finderArgs = new Object[] { confirmedInspectionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSPECTIONRECORD_WHERE);

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
		"inspectionRecord.confirmedInspectionId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectionRecordNo",
			new String[] { String.class.getName() },
			InspectionRecordModelImpl.INSPECTIONRECORDNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordNo", new String[] { String.class.getName() });

	/**
	 * Returns the inspection record where inspectionRecordNo = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @return the matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByInspectionRecordNo(String inspectionRecordNo)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByInspectionRecordNo(inspectionRecordNo);

		if (inspectionRecord == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectionRecordNo=");
			msg.append(inspectionRecordNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInspectionRecordException(msg.toString());
		}

		return inspectionRecord;
	}

	/**
	 * Returns the inspection record where inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByInspectionRecordNo(String inspectionRecordNo)
		throws SystemException {
		return fetchByInspectionRecordNo(inspectionRecordNo, true);
	}

	/**
	 * Returns the inspection record where inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByInspectionRecordNo(
		String inspectionRecordNo, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { inspectionRecordNo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
					finderArgs, this);
		}

		if (result instanceof InspectionRecord) {
			InspectionRecord inspectionRecord = (InspectionRecord)result;

			if (!Validator.equals(inspectionRecordNo,
						inspectionRecord.getInspectionRecordNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

			boolean bindInspectionRecordNo = false;

			if (inspectionRecordNo == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
			}
			else if (inspectionRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionRecordNo = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectionRecordNo) {
					qPos.add(inspectionRecordNo);
				}

				List<InspectionRecord> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"InspectionRecordPersistenceImpl.fetchByInspectionRecordNo(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					InspectionRecord inspectionRecord = list.get(0);

					result = inspectionRecord;

					cacheResult(inspectionRecord);

					if ((inspectionRecord.getInspectionRecordNo() == null) ||
							!inspectionRecord.getInspectionRecordNo()
												 .equals(inspectionRecordNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
							finderArgs, inspectionRecord);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
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
			return (InspectionRecord)result;
		}
	}

	/**
	 * Removes the inspection record where inspectionRecordNo = &#63; from the database.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @return the inspection record that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord removeByInspectionRecordNo(
		String inspectionRecordNo)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = findByInspectionRecordNo(inspectionRecordNo);

		return remove(inspectionRecord);
	}

	/**
	 * Returns the number of inspection records where inspectionRecordNo = &#63;.
	 *
	 * @param inspectionRecordNo the inspection record no
	 * @return the number of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionRecordNo(String inspectionRecordNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO;

		Object[] finderArgs = new Object[] { inspectionRecordNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSPECTIONRECORD_WHERE);

			boolean bindInspectionRecordNo = false;

			if (inspectionRecordNo == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
			}
			else if (inspectionRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionRecordNo = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectionRecordNo) {
					qPos.add(inspectionRecordNo);
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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1 =
		"inspectionRecord.inspectionRecordNo IS NULL";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2 =
		"inspectionRecord.inspectionRecordNo = ?";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3 =
		"(inspectionRecord.inspectionRecordNo IS NULL OR inspectionRecord.inspectionRecordNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_R_I = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByR_I",
			new String[] { Long.class.getName(), String.class.getName() },
			InspectionRecordModelImpl.REGISTEREDINSPECTIONID_COLUMN_BITMASK |
			InspectionRecordModelImpl.INSPECTIONRECORDNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_R_I = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByR_I",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param inspectionRecordNo the inspection record no
	 * @return the matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByR_I(long registeredInspectionId,
		String inspectionRecordNo)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByR_I(registeredInspectionId,
				inspectionRecordNo);

		if (inspectionRecord == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("registeredInspectionId=");
			msg.append(registeredInspectionId);

			msg.append(", inspectionRecordNo=");
			msg.append(inspectionRecordNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInspectionRecordException(msg.toString());
		}

		return inspectionRecord;
	}

	/**
	 * Returns the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param inspectionRecordNo the inspection record no
	 * @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByR_I(long registeredInspectionId,
		String inspectionRecordNo) throws SystemException {
		return fetchByR_I(registeredInspectionId, inspectionRecordNo, true);
	}

	/**
	 * Returns the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param inspectionRecordNo the inspection record no
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByR_I(long registeredInspectionId,
		String inspectionRecordNo, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				registeredInspectionId, inspectionRecordNo
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_R_I,
					finderArgs, this);
		}

		if (result instanceof InspectionRecord) {
			InspectionRecord inspectionRecord = (InspectionRecord)result;

			if ((registeredInspectionId != inspectionRecord.getRegisteredInspectionId()) ||
					!Validator.equals(inspectionRecordNo,
						inspectionRecord.getInspectionRecordNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_R_I_REGISTEREDINSPECTIONID_2);

			boolean bindInspectionRecordNo = false;

			if (inspectionRecordNo == null) {
				query.append(_FINDER_COLUMN_R_I_INSPECTIONRECORDNO_1);
			}
			else if (inspectionRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_R_I_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionRecordNo = true;

				query.append(_FINDER_COLUMN_R_I_INSPECTIONRECORDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

				if (bindInspectionRecordNo) {
					qPos.add(inspectionRecordNo);
				}

				List<InspectionRecord> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_I,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"InspectionRecordPersistenceImpl.fetchByR_I(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					InspectionRecord inspectionRecord = list.get(0);

					result = inspectionRecord;

					cacheResult(inspectionRecord);

					if ((inspectionRecord.getRegisteredInspectionId() != registeredInspectionId) ||
							(inspectionRecord.getInspectionRecordNo() == null) ||
							!inspectionRecord.getInspectionRecordNo()
												 .equals(inspectionRecordNo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_I,
							finderArgs, inspectionRecord);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_I,
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
			return (InspectionRecord)result;
		}
	}

	/**
	 * Removes the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; from the database.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param inspectionRecordNo the inspection record no
	 * @return the inspection record that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord removeByR_I(long registeredInspectionId,
		String inspectionRecordNo)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = findByR_I(registeredInspectionId,
				inspectionRecordNo);

		return remove(inspectionRecord);
	}

	/**
	 * Returns the number of inspection records where registeredInspectionId = &#63; and inspectionRecordNo = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param inspectionRecordNo the inspection record no
	 * @return the number of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByR_I(long registeredInspectionId, String inspectionRecordNo)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_R_I;

		Object[] finderArgs = new Object[] {
				registeredInspectionId, inspectionRecordNo
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_R_I_REGISTEREDINSPECTIONID_2);

			boolean bindInspectionRecordNo = false;

			if (inspectionRecordNo == null) {
				query.append(_FINDER_COLUMN_R_I_INSPECTIONRECORDNO_1);
			}
			else if (inspectionRecordNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_R_I_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionRecordNo = true;

				query.append(_FINDER_COLUMN_R_I_INSPECTIONRECORDNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

				if (bindInspectionRecordNo) {
					qPos.add(inspectionRecordNo);
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

	private static final String _FINDER_COLUMN_R_I_REGISTEREDINSPECTIONID_2 = "inspectionRecord.registeredInspectionId = ? AND ";
	private static final String _FINDER_COLUMN_R_I_INSPECTIONRECORDNO_1 = "inspectionRecord.inspectionRecordNo IS NULL";
	private static final String _FINDER_COLUMN_R_I_INSPECTIONRECORDNO_2 = "inspectionRecord.inspectionRecordNo = ?";
	private static final String _FINDER_COLUMN_R_I_INSPECTIONRECORDNO_3 = "(inspectionRecord.inspectionRecordNo IS NULL OR inspectionRecord.inspectionRecordNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED,
			InspectionRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			InspectionRecordModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the inspection records where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection records where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @return the range of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection records where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<InspectionRecord> list = (List<InspectionRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionRecord inspectionRecord : list) {
				if ((hoSoThuTucId != inspectionRecord.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<InspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecord>(list);
				}
				else {
					list = (List<InspectionRecord>)QueryUtil.list(q,
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
	 * Returns the first inspection record in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (inspectionRecord != null) {
			return inspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the first inspection record in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<InspectionRecord> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection record in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (inspectionRecord != null) {
			return inspectionRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionRecordException(msg.toString());
	}

	/**
	 * Returns the last inspection record in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection record, or <code>null</code> if a matching inspection record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<InspectionRecord> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection records before and after the current inspection record in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current inspection record
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionRecord[] array = new InspectionRecordImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session, inspectionRecord,
					hoSoThuTucId, orderByComparator, true);

			array[1] = inspectionRecord;

			array[2] = getByHoSoThuTucId_PrevAndNext(session, inspectionRecord,
					hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InspectionRecord getByHoSoThuTucId_PrevAndNext(Session session,
		InspectionRecord inspectionRecord, long hoSoThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSPECTIONRECORD_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

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
			query.append(InspectionRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection records where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (InspectionRecord inspectionRecord : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(inspectionRecord);
		}
	}

	/**
	 * Returns the number of inspection records where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching inspection records
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

			query.append(_SQL_COUNT_INSPECTIONRECORD_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "inspectionRecord.hoSoThuTucId = ?";

	public InspectionRecordPersistenceImpl() {
		setModelClass(InspectionRecord.class);
	}

	/**
	 * Caches the inspection record in the entity cache if it is enabled.
	 *
	 * @param inspectionRecord the inspection record
	 */
	@Override
	public void cacheResult(InspectionRecord inspectionRecord) {
		EntityCacheUtil.putResult(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordImpl.class, inspectionRecord.getPrimaryKey(),
			inspectionRecord);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
			new Object[] { inspectionRecord.getPhieuXuLyPhuId() },
			inspectionRecord);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
			new Object[] { inspectionRecord.getInspectionRecordNo() },
			inspectionRecord);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_I,
			new Object[] {
				inspectionRecord.getRegisteredInspectionId(),
				inspectionRecord.getInspectionRecordNo()
			}, inspectionRecord);

		inspectionRecord.resetOriginalValues();
	}

	/**
	 * Caches the inspection records in the entity cache if it is enabled.
	 *
	 * @param inspectionRecords the inspection records
	 */
	@Override
	public void cacheResult(List<InspectionRecord> inspectionRecords) {
		for (InspectionRecord inspectionRecord : inspectionRecords) {
			if (EntityCacheUtil.getResult(
						InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
						InspectionRecordImpl.class,
						inspectionRecord.getPrimaryKey()) == null) {
				cacheResult(inspectionRecord);
			}
			else {
				inspectionRecord.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all inspection records.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InspectionRecordImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InspectionRecordImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the inspection record.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InspectionRecord inspectionRecord) {
		EntityCacheUtil.removeResult(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordImpl.class, inspectionRecord.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(inspectionRecord);
	}

	@Override
	public void clearCache(List<InspectionRecord> inspectionRecords) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InspectionRecord inspectionRecord : inspectionRecords) {
			EntityCacheUtil.removeResult(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
				InspectionRecordImpl.class, inspectionRecord.getPrimaryKey());

			clearUniqueFindersCache(inspectionRecord);
		}
	}

	protected void cacheUniqueFindersCache(InspectionRecord inspectionRecord) {
		if (inspectionRecord.isNew()) {
			Object[] args = new Object[] { inspectionRecord.getPhieuXuLyPhuId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
				args, inspectionRecord);

			args = new Object[] { inspectionRecord.getInspectionRecordNo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
				args, inspectionRecord);

			args = new Object[] {
					inspectionRecord.getRegisteredInspectionId(),
					inspectionRecord.getInspectionRecordNo()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_R_I, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_I, args,
				inspectionRecord);
		}
		else {
			InspectionRecordModelImpl inspectionRecordModelImpl = (InspectionRecordModelImpl)inspectionRecord;

			if ((inspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecord.getPhieuXuLyPhuId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
					args, inspectionRecord);
			}

			if ((inspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecord.getInspectionRecordNo()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
					args, inspectionRecord);
			}

			if ((inspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_R_I.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecord.getRegisteredInspectionId(),
						inspectionRecord.getInspectionRecordNo()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_R_I, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_R_I, args,
					inspectionRecord);
			}
		}
	}

	protected void clearUniqueFindersCache(InspectionRecord inspectionRecord) {
		InspectionRecordModelImpl inspectionRecordModelImpl = (InspectionRecordModelImpl)inspectionRecord;

		Object[] args = new Object[] { inspectionRecord.getPhieuXuLyPhuId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID, args);

		if ((inspectionRecordModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
			args = new Object[] {
					inspectionRecordModelImpl.getOriginalPhieuXuLyPhuId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
				args);
		}

		args = new Object[] { inspectionRecord.getInspectionRecordNo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
			args);

		if ((inspectionRecordModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO.getColumnBitmask()) != 0) {
			args = new Object[] {
					inspectionRecordModelImpl.getOriginalInspectionRecordNo()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDNO,
				args);
		}

		args = new Object[] {
				inspectionRecord.getRegisteredInspectionId(),
				inspectionRecord.getInspectionRecordNo()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_I, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_I, args);

		if ((inspectionRecordModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_R_I.getColumnBitmask()) != 0) {
			args = new Object[] {
					inspectionRecordModelImpl.getOriginalRegisteredInspectionId(),
					inspectionRecordModelImpl.getOriginalInspectionRecordNo()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_R_I, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_R_I, args);
		}
	}

	/**
	 * Creates a new inspection record with the primary key. Does not add the inspection record to the database.
	 *
	 * @param id the primary key for the new inspection record
	 * @return the new inspection record
	 */
	@Override
	public InspectionRecord create(long id) {
		InspectionRecord inspectionRecord = new InspectionRecordImpl();

		inspectionRecord.setNew(true);
		inspectionRecord.setPrimaryKey(id);

		return inspectionRecord;
	}

	/**
	 * Removes the inspection record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the inspection record
	 * @return the inspection record that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord remove(long id)
		throws NoSuchInspectionRecordException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the inspection record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the inspection record
	 * @return the inspection record that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord remove(Serializable primaryKey)
		throws NoSuchInspectionRecordException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InspectionRecord inspectionRecord = (InspectionRecord)session.get(InspectionRecordImpl.class,
					primaryKey);

			if (inspectionRecord == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInspectionRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(inspectionRecord);
		}
		catch (NoSuchInspectionRecordException nsee) {
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
	protected InspectionRecord removeImpl(InspectionRecord inspectionRecord)
		throws SystemException {
		inspectionRecord = toUnwrappedModel(inspectionRecord);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(inspectionRecord)) {
				inspectionRecord = (InspectionRecord)session.get(InspectionRecordImpl.class,
						inspectionRecord.getPrimaryKeyObj());
			}

			if (inspectionRecord != null) {
				session.delete(inspectionRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (inspectionRecord != null) {
			clearCache(inspectionRecord);
		}

		return inspectionRecord;
	}

	@Override
	public InspectionRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord inspectionRecord)
		throws SystemException {
		inspectionRecord = toUnwrappedModel(inspectionRecord);

		boolean isNew = inspectionRecord.isNew();

		InspectionRecordModelImpl inspectionRecordModelImpl = (InspectionRecordModelImpl)inspectionRecord;

		Session session = null;

		try {
			session = openSession();

			if (inspectionRecord.isNew()) {
				session.save(inspectionRecord);

				inspectionRecord.setNew(false);
			}
			else {
				session.merge(inspectionRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InspectionRecordModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((inspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecordModelImpl.getOriginalRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);

				args = new Object[] {
						inspectionRecordModelImpl.getRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);
			}

			if ((inspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecordModelImpl.getOriginalConfirmedInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID,
					args);

				args = new Object[] {
						inspectionRecordModelImpl.getConfirmedInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONFIRMEDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONFIRMEDINSPECTIONID,
					args);
			}

			if ((inspectionRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionRecordModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] { inspectionRecordModelImpl.getHoSoThuTucId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}
		}

		EntityCacheUtil.putResult(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
			InspectionRecordImpl.class, inspectionRecord.getPrimaryKey(),
			inspectionRecord);

		clearUniqueFindersCache(inspectionRecord);
		cacheUniqueFindersCache(inspectionRecord);

		return inspectionRecord;
	}

	protected InspectionRecord toUnwrappedModel(
		InspectionRecord inspectionRecord) {
		if (inspectionRecord instanceof InspectionRecordImpl) {
			return inspectionRecord;
		}

		InspectionRecordImpl inspectionRecordImpl = new InspectionRecordImpl();

		inspectionRecordImpl.setNew(inspectionRecord.isNew());
		inspectionRecordImpl.setPrimaryKey(inspectionRecord.getPrimaryKey());

		inspectionRecordImpl.setId(inspectionRecord.getId());
		inspectionRecordImpl.setInspectionRecordNo(inspectionRecord.getInspectionRecordNo());
		inspectionRecordImpl.setInspectionRecordDate(inspectionRecord.getInspectionRecordDate());
		inspectionRecordImpl.setCorporationId(inspectionRecord.getCorporationId());
		inspectionRecordImpl.setInspectorId(inspectionRecord.getInspectorId());
		inspectionRecordImpl.setConfirmedInspectionId(inspectionRecord.getConfirmedInspectionId());
		inspectionRecordImpl.setCustomsDeclarationid(inspectionRecord.getCustomsDeclarationid());
		inspectionRecordImpl.setInspectionSite(inspectionRecord.getInspectionSite());
		inspectionRecordImpl.setInspectionDateFrom(inspectionRecord.getInspectionDateFrom());
		inspectionRecordImpl.setInspectionDateTo(inspectionRecord.getInspectionDateTo());
		inspectionRecordImpl.setInspectionMode(inspectionRecord.getInspectionMode());
		inspectionRecordImpl.setDescription(inspectionRecord.getDescription());
		inspectionRecordImpl.setAttachedFile(inspectionRecord.getAttachedFile());
		inspectionRecordImpl.setConfirmedResult(inspectionRecord.getConfirmedResult());
		inspectionRecordImpl.setSignName(inspectionRecord.getSignName());
		inspectionRecordImpl.setSignTitle(inspectionRecord.getSignTitle());
		inspectionRecordImpl.setSignPlace(inspectionRecord.getSignPlace());
		inspectionRecordImpl.setSignDate(inspectionRecord.getSignDate());
		inspectionRecordImpl.setPhieuXuLyPhuId(inspectionRecord.getPhieuXuLyPhuId());
		inspectionRecordImpl.setMarkupSafeTest(inspectionRecord.getMarkupSafeTest());
		inspectionRecordImpl.setMarkupEmissionTest(inspectionRecord.getMarkupEmissionTest());
		inspectionRecordImpl.setMarkupControl(inspectionRecord.getMarkupControl());
		inspectionRecordImpl.setRegisteredInspectionId(inspectionRecord.getRegisteredInspectionId());
		inspectionRecordImpl.setRemarks(inspectionRecord.getRemarks());
		inspectionRecordImpl.setHoSoThuTucId(inspectionRecord.getHoSoThuTucId());
		inspectionRecordImpl.setOtherCosts(inspectionRecord.getOtherCosts());
		inspectionRecordImpl.setMarkupPaid(inspectionRecord.getMarkupPaid());
		inspectionRecordImpl.setSynchdate(inspectionRecord.getSynchdate());

		return inspectionRecordImpl;
	}

	/**
	 * Returns the inspection record with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection record
	 * @return the inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInspectionRecordException, SystemException {
		InspectionRecord inspectionRecord = fetchByPrimaryKey(primaryKey);

		if (inspectionRecord == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInspectionRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return inspectionRecord;
	}

	/**
	 * Returns the inspection record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	 *
	 * @param id the primary key of the inspection record
	 * @return the inspection record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord findByPrimaryKey(long id)
		throws NoSuchInspectionRecordException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the inspection record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection record
	 * @return the inspection record, or <code>null</code> if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InspectionRecord inspectionRecord = (InspectionRecord)EntityCacheUtil.getResult(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
				InspectionRecordImpl.class, primaryKey);

		if (inspectionRecord == _nullInspectionRecord) {
			return null;
		}

		if (inspectionRecord == null) {
			Session session = null;

			try {
				session = openSession();

				inspectionRecord = (InspectionRecord)session.get(InspectionRecordImpl.class,
						primaryKey);

				if (inspectionRecord != null) {
					cacheResult(inspectionRecord);
				}
				else {
					EntityCacheUtil.putResult(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
						InspectionRecordImpl.class, primaryKey,
						_nullInspectionRecord);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InspectionRecordModelImpl.ENTITY_CACHE_ENABLED,
					InspectionRecordImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return inspectionRecord;
	}

	/**
	 * Returns the inspection record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the inspection record
	 * @return the inspection record, or <code>null</code> if a inspection record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionRecord fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the inspection records.
	 *
	 * @return the inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @return the range of inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection records
	 * @param end the upper bound of the range of inspection records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inspection records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionRecord> findAll(int start, int end,
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

		List<InspectionRecord> list = (List<InspectionRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSPECTIONRECORD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSPECTIONRECORD;

				if (pagination) {
					sql = sql.concat(InspectionRecordModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InspectionRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionRecord>(list);
				}
				else {
					list = (List<InspectionRecord>)QueryUtil.list(q,
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
	 * Removes all the inspection records from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InspectionRecord inspectionRecord : findAll()) {
			remove(inspectionRecord);
		}
	}

	/**
	 * Returns the number of inspection records.
	 *
	 * @return the number of inspection records
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

				Query q = session.createQuery(_SQL_COUNT_INSPECTIONRECORD);

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
	 * Initializes the inspection record persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InspectionRecord>> listenersList = new ArrayList<ModelListener<InspectionRecord>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InspectionRecord>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InspectionRecordImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSPECTIONRECORD = "SELECT inspectionRecord FROM InspectionRecord inspectionRecord";
	private static final String _SQL_SELECT_INSPECTIONRECORD_WHERE = "SELECT inspectionRecord FROM InspectionRecord inspectionRecord WHERE ";
	private static final String _SQL_COUNT_INSPECTIONRECORD = "SELECT COUNT(inspectionRecord) FROM InspectionRecord inspectionRecord";
	private static final String _SQL_COUNT_INSPECTIONRECORD_WHERE = "SELECT COUNT(inspectionRecord) FROM InspectionRecord inspectionRecord WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "inspectionRecord.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InspectionRecord exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InspectionRecord exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InspectionRecordPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"inspectionRecordNo", "inspectionRecordDate", "corporationId",
				"inspectorId", "confirmedInspectionId", "customsDeclarationid",
				"inspectionSite", "inspectionDateFrom", "inspectionDateTo",
				"inspectionMode", "attachedFile", "confirmedResult", "signName",
				"signTitle", "signPlace", "signDate", "phieuXuLyPhuId",
				"markupSafeTest", "markupEmissionTest", "markupControl",
				"registeredInspectionId", "hoSoThuTucId", "otherCosts",
				"markupPaid"
			});
	private static InspectionRecord _nullInspectionRecord = new InspectionRecordImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InspectionRecord> toCacheModel() {
				return _nullInspectionRecordCacheModel;
			}
		};

	private static CacheModel<InspectionRecord> _nullInspectionRecordCacheModel = new CacheModel<InspectionRecord>() {
			@Override
			public InspectionRecord toEntityModel() {
				return _nullInspectionRecord;
			}
		};
}