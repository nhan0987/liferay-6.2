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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the debit note details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DebitNoteDetailsPersistence
 * @see DebitNoteDetailsUtil
 * @generated
 */
public class DebitNoteDetailsPersistenceImpl extends BasePersistenceImpl<DebitNoteDetails>
	implements DebitNoteDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DebitNoteDetailsUtil} to access the debit note details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DebitNoteDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			DebitNoteDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			DebitNoteDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_VEHICLERECORDID = new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			DebitNoteDetailsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVehicleRecordId", new String[] { Long.class.getName() },
			DebitNoteDetailsModelImpl.VEHICLERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLERECORDID = new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the debit note details where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException} if it could not be found.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching debit note details
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a matching debit note details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails findByVehicleRecordId(long vehicleRecordId)
		throws NoSuchDebitNoteDetailsException, SystemException {
		DebitNoteDetails debitNoteDetails = fetchByVehicleRecordId(vehicleRecordId);

		if (debitNoteDetails == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleRecordId=");
			msg.append(vehicleRecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDebitNoteDetailsException(msg.toString());
		}

		return debitNoteDetails;
	}

	/**
	 * Returns the debit note details where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching debit note details, or <code>null</code> if a matching debit note details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails fetchByVehicleRecordId(long vehicleRecordId)
		throws SystemException {
		return fetchByVehicleRecordId(vehicleRecordId, true);
	}

	/**
	 * Returns the debit note details where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching debit note details, or <code>null</code> if a matching debit note details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails fetchByVehicleRecordId(long vehicleRecordId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { vehicleRecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					finderArgs, this);
		}

		if (result instanceof DebitNoteDetails) {
			DebitNoteDetails debitNoteDetails = (DebitNoteDetails)result;

			if ((vehicleRecordId != debitNoteDetails.getVehicleRecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DEBITNOTEDETAILS_WHERE);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleRecordId);

				List<DebitNoteDetails> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DebitNoteDetailsPersistenceImpl.fetchByVehicleRecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DebitNoteDetails debitNoteDetails = list.get(0);

					result = debitNoteDetails;

					cacheResult(debitNoteDetails);

					if ((debitNoteDetails.getVehicleRecordId() != vehicleRecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
							finderArgs, debitNoteDetails);
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
			return (DebitNoteDetails)result;
		}
	}

	/**
	 * Removes the debit note details where vehicleRecordId = &#63; from the database.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the debit note details that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails removeByVehicleRecordId(long vehicleRecordId)
		throws NoSuchDebitNoteDetailsException, SystemException {
		DebitNoteDetails debitNoteDetails = findByVehicleRecordId(vehicleRecordId);

		return remove(debitNoteDetails);
	}

	/**
	 * Returns the number of debit note detailses where vehicleRecordId = &#63;.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the number of matching debit note detailses
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

			query.append(_SQL_COUNT_DEBITNOTEDETAILS_WHERE);

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
		"debitNoteDetails.vehicleRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTEID =
		new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			DebitNoteDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDebitNoteId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID =
		new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED,
			DebitNoteDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDebitNoteId",
			new String[] { Long.class.getName() },
			DebitNoteDetailsModelImpl.DEBITNOTEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEBITNOTEID = new FinderPath(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDebitNoteId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the debit note detailses where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @return the matching debit note detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNoteDetails> findByDebitNoteId(long debitNoteId)
		throws SystemException {
		return findByDebitNoteId(debitNoteId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the debit note detailses where debitNoteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitNoteId the debit note ID
	 * @param start the lower bound of the range of debit note detailses
	 * @param end the upper bound of the range of debit note detailses (not inclusive)
	 * @return the range of matching debit note detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNoteDetails> findByDebitNoteId(long debitNoteId,
		int start, int end) throws SystemException {
		return findByDebitNoteId(debitNoteId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the debit note detailses where debitNoteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitNoteId the debit note ID
	 * @param start the lower bound of the range of debit note detailses
	 * @param end the upper bound of the range of debit note detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching debit note detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNoteDetails> findByDebitNoteId(long debitNoteId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<DebitNoteDetails> list = (List<DebitNoteDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DebitNoteDetails debitNoteDetails : list) {
				if ((debitNoteId != debitNoteDetails.getDebitNoteId())) {
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

			query.append(_SQL_SELECT_DEBITNOTEDETAILS_WHERE);

			query.append(_FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DebitNoteDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(debitNoteId);

				if (!pagination) {
					list = (List<DebitNoteDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DebitNoteDetails>(list);
				}
				else {
					list = (List<DebitNoteDetails>)QueryUtil.list(q,
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
	 * Returns the first debit note details in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching debit note details
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a matching debit note details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails findByDebitNoteId_First(long debitNoteId,
		OrderByComparator orderByComparator)
		throws NoSuchDebitNoteDetailsException, SystemException {
		DebitNoteDetails debitNoteDetails = fetchByDebitNoteId_First(debitNoteId,
				orderByComparator);

		if (debitNoteDetails != null) {
			return debitNoteDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitNoteId=");
		msg.append(debitNoteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDebitNoteDetailsException(msg.toString());
	}

	/**
	 * Returns the first debit note details in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching debit note details, or <code>null</code> if a matching debit note details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails fetchByDebitNoteId_First(long debitNoteId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DebitNoteDetails> list = findByDebitNoteId(debitNoteId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last debit note details in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching debit note details
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a matching debit note details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails findByDebitNoteId_Last(long debitNoteId,
		OrderByComparator orderByComparator)
		throws NoSuchDebitNoteDetailsException, SystemException {
		DebitNoteDetails debitNoteDetails = fetchByDebitNoteId_Last(debitNoteId,
				orderByComparator);

		if (debitNoteDetails != null) {
			return debitNoteDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitNoteId=");
		msg.append(debitNoteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDebitNoteDetailsException(msg.toString());
	}

	/**
	 * Returns the last debit note details in the ordered set where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching debit note details, or <code>null</code> if a matching debit note details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails fetchByDebitNoteId_Last(long debitNoteId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDebitNoteId(debitNoteId);

		if (count == 0) {
			return null;
		}

		List<DebitNoteDetails> list = findByDebitNoteId(debitNoteId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the debit note detailses before and after the current debit note details in the ordered set where debitNoteId = &#63;.
	 *
	 * @param id the primary key of the current debit note details
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next debit note details
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails[] findByDebitNoteId_PrevAndNext(long id,
		long debitNoteId, OrderByComparator orderByComparator)
		throws NoSuchDebitNoteDetailsException, SystemException {
		DebitNoteDetails debitNoteDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DebitNoteDetails[] array = new DebitNoteDetailsImpl[3];

			array[0] = getByDebitNoteId_PrevAndNext(session, debitNoteDetails,
					debitNoteId, orderByComparator, true);

			array[1] = debitNoteDetails;

			array[2] = getByDebitNoteId_PrevAndNext(session, debitNoteDetails,
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

	protected DebitNoteDetails getByDebitNoteId_PrevAndNext(Session session,
		DebitNoteDetails debitNoteDetails, long debitNoteId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DEBITNOTEDETAILS_WHERE);

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
			query.append(DebitNoteDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(debitNoteId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(debitNoteDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DebitNoteDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the debit note detailses where debitNoteId = &#63; from the database.
	 *
	 * @param debitNoteId the debit note ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDebitNoteId(long debitNoteId) throws SystemException {
		for (DebitNoteDetails debitNoteDetails : findByDebitNoteId(
				debitNoteId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(debitNoteDetails);
		}
	}

	/**
	 * Returns the number of debit note detailses where debitNoteId = &#63;.
	 *
	 * @param debitNoteId the debit note ID
	 * @return the number of matching debit note detailses
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

			query.append(_SQL_COUNT_DEBITNOTEDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2 = "debitNoteDetails.debitNoteId = ?";

	public DebitNoteDetailsPersistenceImpl() {
		setModelClass(DebitNoteDetails.class);
	}

	/**
	 * Caches the debit note details in the entity cache if it is enabled.
	 *
	 * @param debitNoteDetails the debit note details
	 */
	@Override
	public void cacheResult(DebitNoteDetails debitNoteDetails) {
		EntityCacheUtil.putResult(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsImpl.class, debitNoteDetails.getPrimaryKey(),
			debitNoteDetails);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
			new Object[] { debitNoteDetails.getVehicleRecordId() },
			debitNoteDetails);

		debitNoteDetails.resetOriginalValues();
	}

	/**
	 * Caches the debit note detailses in the entity cache if it is enabled.
	 *
	 * @param debitNoteDetailses the debit note detailses
	 */
	@Override
	public void cacheResult(List<DebitNoteDetails> debitNoteDetailses) {
		for (DebitNoteDetails debitNoteDetails : debitNoteDetailses) {
			if (EntityCacheUtil.getResult(
						DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
						DebitNoteDetailsImpl.class,
						debitNoteDetails.getPrimaryKey()) == null) {
				cacheResult(debitNoteDetails);
			}
			else {
				debitNoteDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all debit note detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DebitNoteDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DebitNoteDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the debit note details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DebitNoteDetails debitNoteDetails) {
		EntityCacheUtil.removeResult(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsImpl.class, debitNoteDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(debitNoteDetails);
	}

	@Override
	public void clearCache(List<DebitNoteDetails> debitNoteDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DebitNoteDetails debitNoteDetails : debitNoteDetailses) {
			EntityCacheUtil.removeResult(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
				DebitNoteDetailsImpl.class, debitNoteDetails.getPrimaryKey());

			clearUniqueFindersCache(debitNoteDetails);
		}
	}

	protected void cacheUniqueFindersCache(DebitNoteDetails debitNoteDetails) {
		if (debitNoteDetails.isNew()) {
			Object[] args = new Object[] { debitNoteDetails.getVehicleRecordId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args, debitNoteDetails);
		}
		else {
			DebitNoteDetailsModelImpl debitNoteDetailsModelImpl = (DebitNoteDetailsModelImpl)debitNoteDetails;

			if ((debitNoteDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						debitNoteDetails.getVehicleRecordId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					args, debitNoteDetails);
			}
		}
	}

	protected void clearUniqueFindersCache(DebitNoteDetails debitNoteDetails) {
		DebitNoteDetailsModelImpl debitNoteDetailsModelImpl = (DebitNoteDetailsModelImpl)debitNoteDetails;

		Object[] args = new Object[] { debitNoteDetails.getVehicleRecordId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID, args);

		if ((debitNoteDetailsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					debitNoteDetailsModelImpl.getOriginalVehicleRecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args);
		}
	}

	/**
	 * Creates a new debit note details with the primary key. Does not add the debit note details to the database.
	 *
	 * @param id the primary key for the new debit note details
	 * @return the new debit note details
	 */
	@Override
	public DebitNoteDetails create(long id) {
		DebitNoteDetails debitNoteDetails = new DebitNoteDetailsImpl();

		debitNoteDetails.setNew(true);
		debitNoteDetails.setPrimaryKey(id);

		return debitNoteDetails;
	}

	/**
	 * Removes the debit note details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the debit note details
	 * @return the debit note details that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails remove(long id)
		throws NoSuchDebitNoteDetailsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the debit note details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the debit note details
	 * @return the debit note details that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails remove(Serializable primaryKey)
		throws NoSuchDebitNoteDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DebitNoteDetails debitNoteDetails = (DebitNoteDetails)session.get(DebitNoteDetailsImpl.class,
					primaryKey);

			if (debitNoteDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDebitNoteDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(debitNoteDetails);
		}
		catch (NoSuchDebitNoteDetailsException nsee) {
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
	protected DebitNoteDetails removeImpl(DebitNoteDetails debitNoteDetails)
		throws SystemException {
		debitNoteDetails = toUnwrappedModel(debitNoteDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(debitNoteDetails)) {
				debitNoteDetails = (DebitNoteDetails)session.get(DebitNoteDetailsImpl.class,
						debitNoteDetails.getPrimaryKeyObj());
			}

			if (debitNoteDetails != null) {
				session.delete(debitNoteDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (debitNoteDetails != null) {
			clearCache(debitNoteDetails);
		}

		return debitNoteDetails;
	}

	@Override
	public DebitNoteDetails updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails debitNoteDetails)
		throws SystemException {
		debitNoteDetails = toUnwrappedModel(debitNoteDetails);

		boolean isNew = debitNoteDetails.isNew();

		DebitNoteDetailsModelImpl debitNoteDetailsModelImpl = (DebitNoteDetailsModelImpl)debitNoteDetails;

		Session session = null;

		try {
			session = openSession();

			if (debitNoteDetails.isNew()) {
				session.save(debitNoteDetails);

				debitNoteDetails.setNew(false);
			}
			else {
				session.merge(debitNoteDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DebitNoteDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((debitNoteDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						debitNoteDetailsModelImpl.getOriginalDebitNoteId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID,
					args);

				args = new Object[] { debitNoteDetailsModelImpl.getDebitNoteId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID,
					args);
			}
		}

		EntityCacheUtil.putResult(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteDetailsImpl.class, debitNoteDetails.getPrimaryKey(),
			debitNoteDetails);

		clearUniqueFindersCache(debitNoteDetails);
		cacheUniqueFindersCache(debitNoteDetails);

		return debitNoteDetails;
	}

	protected DebitNoteDetails toUnwrappedModel(
		DebitNoteDetails debitNoteDetails) {
		if (debitNoteDetails instanceof DebitNoteDetailsImpl) {
			return debitNoteDetails;
		}

		DebitNoteDetailsImpl debitNoteDetailsImpl = new DebitNoteDetailsImpl();

		debitNoteDetailsImpl.setNew(debitNoteDetails.isNew());
		debitNoteDetailsImpl.setPrimaryKey(debitNoteDetails.getPrimaryKey());

		debitNoteDetailsImpl.setId(debitNoteDetails.getId());
		debitNoteDetailsImpl.setVehicleRecordId(debitNoteDetails.getVehicleRecordId());
		debitNoteDetailsImpl.setDebitNoteId(debitNoteDetails.getDebitNoteId());
		debitNoteDetailsImpl.setInspectionRecordId(debitNoteDetails.getInspectionRecordId());
		debitNoteDetailsImpl.setUnitPrice(debitNoteDetails.getUnitPrice());
		debitNoteDetailsImpl.setCurrency(debitNoteDetails.getCurrency());
		debitNoteDetailsImpl.setBasicCurrency(debitNoteDetails.getBasicCurrency());
		debitNoteDetailsImpl.setExchangeRate(debitNoteDetails.getExchangeRate());
		debitNoteDetailsImpl.setInspectionFee(debitNoteDetails.getInspectionFee());
		debitNoteDetailsImpl.setOtherCosts(debitNoteDetails.getOtherCosts());
		debitNoteDetailsImpl.setTotalCostsAndFee(debitNoteDetails.getTotalCostsAndFee());
		debitNoteDetailsImpl.setTax(debitNoteDetails.getTax());
		debitNoteDetailsImpl.setCharges(debitNoteDetails.getCharges());
		debitNoteDetailsImpl.setTotalRealDebit(debitNoteDetails.getTotalRealDebit());
		debitNoteDetailsImpl.setTotalDebit(debitNoteDetails.getTotalDebit());

		return debitNoteDetailsImpl;
	}

	/**
	 * Returns the debit note details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the debit note details
	 * @return the debit note details
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDebitNoteDetailsException, SystemException {
		DebitNoteDetails debitNoteDetails = fetchByPrimaryKey(primaryKey);

		if (debitNoteDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDebitNoteDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return debitNoteDetails;
	}

	/**
	 * Returns the debit note details with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the debit note details
	 * @return the debit note details
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails findByPrimaryKey(long id)
		throws NoSuchDebitNoteDetailsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the debit note details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the debit note details
	 * @return the debit note details, or <code>null</code> if a debit note details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DebitNoteDetails debitNoteDetails = (DebitNoteDetails)EntityCacheUtil.getResult(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
				DebitNoteDetailsImpl.class, primaryKey);

		if (debitNoteDetails == _nullDebitNoteDetails) {
			return null;
		}

		if (debitNoteDetails == null) {
			Session session = null;

			try {
				session = openSession();

				debitNoteDetails = (DebitNoteDetails)session.get(DebitNoteDetailsImpl.class,
						primaryKey);

				if (debitNoteDetails != null) {
					cacheResult(debitNoteDetails);
				}
				else {
					EntityCacheUtil.putResult(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
						DebitNoteDetailsImpl.class, primaryKey,
						_nullDebitNoteDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DebitNoteDetailsModelImpl.ENTITY_CACHE_ENABLED,
					DebitNoteDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return debitNoteDetails;
	}

	/**
	 * Returns the debit note details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the debit note details
	 * @return the debit note details, or <code>null</code> if a debit note details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNoteDetails fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the debit note detailses.
	 *
	 * @return the debit note detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNoteDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the debit note detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of debit note detailses
	 * @param end the upper bound of the range of debit note detailses (not inclusive)
	 * @return the range of debit note detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNoteDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the debit note detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of debit note detailses
	 * @param end the upper bound of the range of debit note detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of debit note detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNoteDetails> findAll(int start, int end,
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

		List<DebitNoteDetails> list = (List<DebitNoteDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DEBITNOTEDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DEBITNOTEDETAILS;

				if (pagination) {
					sql = sql.concat(DebitNoteDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DebitNoteDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DebitNoteDetails>(list);
				}
				else {
					list = (List<DebitNoteDetails>)QueryUtil.list(q,
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
	 * Removes all the debit note detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DebitNoteDetails debitNoteDetails : findAll()) {
			remove(debitNoteDetails);
		}
	}

	/**
	 * Returns the number of debit note detailses.
	 *
	 * @return the number of debit note detailses
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

				Query q = session.createQuery(_SQL_COUNT_DEBITNOTEDETAILS);

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
	 * Initializes the debit note details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DebitNoteDetails>> listenersList = new ArrayList<ModelListener<DebitNoteDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DebitNoteDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DebitNoteDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DEBITNOTEDETAILS = "SELECT debitNoteDetails FROM DebitNoteDetails debitNoteDetails";
	private static final String _SQL_SELECT_DEBITNOTEDETAILS_WHERE = "SELECT debitNoteDetails FROM DebitNoteDetails debitNoteDetails WHERE ";
	private static final String _SQL_COUNT_DEBITNOTEDETAILS = "SELECT COUNT(debitNoteDetails) FROM DebitNoteDetails debitNoteDetails";
	private static final String _SQL_COUNT_DEBITNOTEDETAILS_WHERE = "SELECT COUNT(debitNoteDetails) FROM DebitNoteDetails debitNoteDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "debitNoteDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DebitNoteDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DebitNoteDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DebitNoteDetailsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleRecordId", "debitNoteId", "inspectionRecordId",
				"unitPrice", "basicCurrency", "exchangeRate", "inspectionFee",
				"otherCosts", "totalCostsAndFee", "totalRealDebit", "totalDebit"
			});
	private static DebitNoteDetails _nullDebitNoteDetails = new DebitNoteDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DebitNoteDetails> toCacheModel() {
				return _nullDebitNoteDetailsCacheModel;
			}
		};

	private static CacheModel<DebitNoteDetails> _nullDebitNoteDetailsCacheModel = new CacheModel<DebitNoteDetails>() {
			@Override
			public DebitNoteDetails toEntityModel() {
				return _nullDebitNoteDetails;
			}
		};
}