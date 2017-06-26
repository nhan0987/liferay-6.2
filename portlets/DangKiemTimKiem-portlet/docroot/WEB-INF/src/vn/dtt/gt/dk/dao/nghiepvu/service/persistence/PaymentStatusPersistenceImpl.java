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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;
import vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see PaymentStatusPersistence
 * @see PaymentStatusUtil
 * @generated
 */
public class PaymentStatusPersistenceImpl extends BasePersistenceImpl<PaymentStatus>
	implements PaymentStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentStatusUtil} to access the payment status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED,
			PaymentStatusImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED,
			PaymentStatusImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_VEHICLERECORDID = new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED,
			PaymentStatusImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVehicleRecordId", new String[] { Long.class.getName() },
			PaymentStatusModelImpl.VEHICLERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLERECORDID = new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the payment status where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException} if it could not be found.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching payment status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus findByVehicleRecordId(long vehicleRecordId)
		throws NoSuchPaymentStatusException, SystemException {
		PaymentStatus paymentStatus = fetchByVehicleRecordId(vehicleRecordId);

		if (paymentStatus == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleRecordId=");
			msg.append(vehicleRecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentStatusException(msg.toString());
		}

		return paymentStatus;
	}

	/**
	 * Returns the payment status where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the matching payment status, or <code>null</code> if a matching payment status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus fetchByVehicleRecordId(long vehicleRecordId)
		throws SystemException {
		return fetchByVehicleRecordId(vehicleRecordId, true);
	}

	/**
	 * Returns the payment status where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching payment status, or <code>null</code> if a matching payment status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus fetchByVehicleRecordId(long vehicleRecordId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { vehicleRecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					finderArgs, this);
		}

		if (result instanceof PaymentStatus) {
			PaymentStatus paymentStatus = (PaymentStatus)result;

			if ((vehicleRecordId != paymentStatus.getVehicleRecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PAYMENTSTATUS_WHERE);

			query.append(_FINDER_COLUMN_VEHICLERECORDID_VEHICLERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleRecordId);

				List<PaymentStatus> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PaymentStatusPersistenceImpl.fetchByVehicleRecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PaymentStatus paymentStatus = list.get(0);

					result = paymentStatus;

					cacheResult(paymentStatus);

					if ((paymentStatus.getVehicleRecordId() != vehicleRecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
							finderArgs, paymentStatus);
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
			return (PaymentStatus)result;
		}
	}

	/**
	 * Removes the payment status where vehicleRecordId = &#63; from the database.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the payment status that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus removeByVehicleRecordId(long vehicleRecordId)
		throws NoSuchPaymentStatusException, SystemException {
		PaymentStatus paymentStatus = findByVehicleRecordId(vehicleRecordId);

		return remove(paymentStatus);
	}

	/**
	 * Returns the number of payment statuses where vehicleRecordId = &#63;.
	 *
	 * @param vehicleRecordId the vehicle record ID
	 * @return the number of matching payment statuses
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

			query.append(_SQL_COUNT_PAYMENTSTATUS_WHERE);

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
		"paymentStatus.vehicleRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTENUMBER =
		new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED,
			PaymentStatusImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDebitNoteNumber",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER =
		new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED,
			PaymentStatusImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDebitNoteNumber", new String[] { String.class.getName() },
			PaymentStatusModelImpl.DEBITNOTENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEBITNOTENUMBER = new FinderPath(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDebitNoteNumber", new String[] { String.class.getName() });

	/**
	 * Returns all the payment statuses where debitNoteNumber = &#63;.
	 *
	 * @param debitNoteNumber the debit note number
	 * @return the matching payment statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentStatus> findByDebitNoteNumber(String debitNoteNumber)
		throws SystemException {
		return findByDebitNoteNumber(debitNoteNumber, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment statuses where debitNoteNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitNoteNumber the debit note number
	 * @param start the lower bound of the range of payment statuses
	 * @param end the upper bound of the range of payment statuses (not inclusive)
	 * @return the range of matching payment statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentStatus> findByDebitNoteNumber(String debitNoteNumber,
		int start, int end) throws SystemException {
		return findByDebitNoteNumber(debitNoteNumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment statuses where debitNoteNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param debitNoteNumber the debit note number
	 * @param start the lower bound of the range of payment statuses
	 * @param end the upper bound of the range of payment statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching payment statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentStatus> findByDebitNoteNumber(String debitNoteNumber,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER;
			finderArgs = new Object[] { debitNoteNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTENUMBER;
			finderArgs = new Object[] {
					debitNoteNumber,
					
					start, end, orderByComparator
				};
		}

		List<PaymentStatus> list = (List<PaymentStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentStatus paymentStatus : list) {
				if (!Validator.equals(debitNoteNumber,
							paymentStatus.getDebitNoteNumber())) {
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

			query.append(_SQL_SELECT_PAYMENTSTATUS_WHERE);

			boolean bindDebitNoteNumber = false;

			if (debitNoteNumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
			}
			else if (debitNoteNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
			}
			else {
				bindDebitNoteNumber = true;

				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDebitNoteNumber) {
					qPos.add(debitNoteNumber);
				}

				if (!pagination) {
					list = (List<PaymentStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentStatus>(list);
				}
				else {
					list = (List<PaymentStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first payment status in the ordered set where debitNoteNumber = &#63;.
	 *
	 * @param debitNoteNumber the debit note number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching payment status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus findByDebitNoteNumber_First(String debitNoteNumber,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentStatusException, SystemException {
		PaymentStatus paymentStatus = fetchByDebitNoteNumber_First(debitNoteNumber,
				orderByComparator);

		if (paymentStatus != null) {
			return paymentStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitNoteNumber=");
		msg.append(debitNoteNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentStatusException(msg.toString());
	}

	/**
	 * Returns the first payment status in the ordered set where debitNoteNumber = &#63;.
	 *
	 * @param debitNoteNumber the debit note number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching payment status, or <code>null</code> if a matching payment status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus fetchByDebitNoteNumber_First(String debitNoteNumber,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentStatus> list = findByDebitNoteNumber(debitNoteNumber, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last payment status in the ordered set where debitNoteNumber = &#63;.
	 *
	 * @param debitNoteNumber the debit note number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching payment status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus findByDebitNoteNumber_Last(String debitNoteNumber,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentStatusException, SystemException {
		PaymentStatus paymentStatus = fetchByDebitNoteNumber_Last(debitNoteNumber,
				orderByComparator);

		if (paymentStatus != null) {
			return paymentStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("debitNoteNumber=");
		msg.append(debitNoteNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentStatusException(msg.toString());
	}

	/**
	 * Returns the last payment status in the ordered set where debitNoteNumber = &#63;.
	 *
	 * @param debitNoteNumber the debit note number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching payment status, or <code>null</code> if a matching payment status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus fetchByDebitNoteNumber_Last(String debitNoteNumber,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDebitNoteNumber(debitNoteNumber);

		if (count == 0) {
			return null;
		}

		List<PaymentStatus> list = findByDebitNoteNumber(debitNoteNumber,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the payment statuses before and after the current payment status in the ordered set where debitNoteNumber = &#63;.
	 *
	 * @param id the primary key of the current payment status
	 * @param debitNoteNumber the debit note number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next payment status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus[] findByDebitNoteNumber_PrevAndNext(long id,
		String debitNoteNumber, OrderByComparator orderByComparator)
		throws NoSuchPaymentStatusException, SystemException {
		PaymentStatus paymentStatus = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PaymentStatus[] array = new PaymentStatusImpl[3];

			array[0] = getByDebitNoteNumber_PrevAndNext(session, paymentStatus,
					debitNoteNumber, orderByComparator, true);

			array[1] = paymentStatus;

			array[2] = getByDebitNoteNumber_PrevAndNext(session, paymentStatus,
					debitNoteNumber, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PaymentStatus getByDebitNoteNumber_PrevAndNext(Session session,
		PaymentStatus paymentStatus, String debitNoteNumber,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTSTATUS_WHERE);

		boolean bindDebitNoteNumber = false;

		if (debitNoteNumber == null) {
			query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
		}
		else if (debitNoteNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
		}
		else {
			bindDebitNoteNumber = true;

			query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
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
			query.append(PaymentStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDebitNoteNumber) {
			qPos.add(debitNoteNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the payment statuses where debitNoteNumber = &#63; from the database.
	 *
	 * @param debitNoteNumber the debit note number
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDebitNoteNumber(String debitNoteNumber)
		throws SystemException {
		for (PaymentStatus paymentStatus : findByDebitNoteNumber(
				debitNoteNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(paymentStatus);
		}
	}

	/**
	 * Returns the number of payment statuses where debitNoteNumber = &#63;.
	 *
	 * @param debitNoteNumber the debit note number
	 * @return the number of matching payment statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDebitNoteNumber(String debitNoteNumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEBITNOTENUMBER;

		Object[] finderArgs = new Object[] { debitNoteNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTSTATUS_WHERE);

			boolean bindDebitNoteNumber = false;

			if (debitNoteNumber == null) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1);
			}
			else if (debitNoteNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3);
			}
			else {
				bindDebitNoteNumber = true;

				query.append(_FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDebitNoteNumber) {
					qPos.add(debitNoteNumber);
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

	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_1 =
		"paymentStatus.debitNoteNumber IS NULL";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2 =
		"paymentStatus.debitNoteNumber = ?";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3 =
		"(paymentStatus.debitNoteNumber IS NULL OR paymentStatus.debitNoteNumber = '')";

	public PaymentStatusPersistenceImpl() {
		setModelClass(PaymentStatus.class);
	}

	/**
	 * Caches the payment status in the entity cache if it is enabled.
	 *
	 * @param paymentStatus the payment status
	 */
	@Override
	public void cacheResult(PaymentStatus paymentStatus) {
		EntityCacheUtil.putResult(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusImpl.class, paymentStatus.getPrimaryKey(),
			paymentStatus);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
			new Object[] { paymentStatus.getVehicleRecordId() }, paymentStatus);

		paymentStatus.resetOriginalValues();
	}

	/**
	 * Caches the payment statuses in the entity cache if it is enabled.
	 *
	 * @param paymentStatuses the payment statuses
	 */
	@Override
	public void cacheResult(List<PaymentStatus> paymentStatuses) {
		for (PaymentStatus paymentStatus : paymentStatuses) {
			if (EntityCacheUtil.getResult(
						PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
						PaymentStatusImpl.class, paymentStatus.getPrimaryKey()) == null) {
				cacheResult(paymentStatus);
			}
			else {
				paymentStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all payment statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the payment status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentStatus paymentStatus) {
		EntityCacheUtil.removeResult(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusImpl.class, paymentStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(paymentStatus);
	}

	@Override
	public void clearCache(List<PaymentStatus> paymentStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentStatus paymentStatus : paymentStatuses) {
			EntityCacheUtil.removeResult(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
				PaymentStatusImpl.class, paymentStatus.getPrimaryKey());

			clearUniqueFindersCache(paymentStatus);
		}
	}

	protected void cacheUniqueFindersCache(PaymentStatus paymentStatus) {
		if (paymentStatus.isNew()) {
			Object[] args = new Object[] { paymentStatus.getVehicleRecordId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args, paymentStatus);
		}
		else {
			PaymentStatusModelImpl paymentStatusModelImpl = (PaymentStatusModelImpl)paymentStatus;

			if ((paymentStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { paymentStatus.getVehicleRecordId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
					args, paymentStatus);
			}
		}
	}

	protected void clearUniqueFindersCache(PaymentStatus paymentStatus) {
		PaymentStatusModelImpl paymentStatusModelImpl = (PaymentStatusModelImpl)paymentStatus;

		Object[] args = new Object[] { paymentStatus.getVehicleRecordId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID, args);

		if ((paymentStatusModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VEHICLERECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					paymentStatusModelImpl.getOriginalVehicleRecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLERECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLERECORDID,
				args);
		}
	}

	/**
	 * Creates a new payment status with the primary key. Does not add the payment status to the database.
	 *
	 * @param id the primary key for the new payment status
	 * @return the new payment status
	 */
	@Override
	public PaymentStatus create(long id) {
		PaymentStatus paymentStatus = new PaymentStatusImpl();

		paymentStatus.setNew(true);
		paymentStatus.setPrimaryKey(id);

		return paymentStatus;
	}

	/**
	 * Removes the payment status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the payment status
	 * @return the payment status that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus remove(long id)
		throws NoSuchPaymentStatusException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the payment status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the payment status
	 * @return the payment status that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus remove(Serializable primaryKey)
		throws NoSuchPaymentStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentStatus paymentStatus = (PaymentStatus)session.get(PaymentStatusImpl.class,
					primaryKey);

			if (paymentStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentStatus);
		}
		catch (NoSuchPaymentStatusException nsee) {
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
	protected PaymentStatus removeImpl(PaymentStatus paymentStatus)
		throws SystemException {
		paymentStatus = toUnwrappedModel(paymentStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentStatus)) {
				paymentStatus = (PaymentStatus)session.get(PaymentStatusImpl.class,
						paymentStatus.getPrimaryKeyObj());
			}

			if (paymentStatus != null) {
				session.delete(paymentStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentStatus != null) {
			clearCache(paymentStatus);
		}

		return paymentStatus;
	}

	@Override
	public PaymentStatus updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus)
		throws SystemException {
		paymentStatus = toUnwrappedModel(paymentStatus);

		boolean isNew = paymentStatus.isNew();

		PaymentStatusModelImpl paymentStatusModelImpl = (PaymentStatusModelImpl)paymentStatus;

		Session session = null;

		try {
			session = openSession();

			if (paymentStatus.isNew()) {
				session.save(paymentStatus);

				paymentStatus.setNew(false);
			}
			else {
				session.merge(paymentStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PaymentStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((paymentStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentStatusModelImpl.getOriginalDebitNoteNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER,
					args);

				args = new Object[] { paymentStatusModelImpl.getDebitNoteNumber() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTENUMBER,
					args);
			}
		}

		EntityCacheUtil.putResult(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
			PaymentStatusImpl.class, paymentStatus.getPrimaryKey(),
			paymentStatus);

		clearUniqueFindersCache(paymentStatus);
		cacheUniqueFindersCache(paymentStatus);

		return paymentStatus;
	}

	protected PaymentStatus toUnwrappedModel(PaymentStatus paymentStatus) {
		if (paymentStatus instanceof PaymentStatusImpl) {
			return paymentStatus;
		}

		PaymentStatusImpl paymentStatusImpl = new PaymentStatusImpl();

		paymentStatusImpl.setNew(paymentStatus.isNew());
		paymentStatusImpl.setPrimaryKey(paymentStatus.getPrimaryKey());

		paymentStatusImpl.setId(paymentStatus.getId());
		paymentStatusImpl.setVehicleRecordId(paymentStatus.getVehicleRecordId());
		paymentStatusImpl.setAttachedFile(paymentStatus.getAttachedFile());
		paymentStatusImpl.setUnitPrice(paymentStatus.getUnitPrice());
		paymentStatusImpl.setCurrency(paymentStatus.getCurrency());
		paymentStatusImpl.setBasicCurrency(paymentStatus.getBasicCurrency());
		paymentStatusImpl.setExchangeRate(paymentStatus.getExchangeRate());
		paymentStatusImpl.setInspectionFee(paymentStatus.getInspectionFee());
		paymentStatusImpl.setOtherCosts(paymentStatus.getOtherCosts());
		paymentStatusImpl.setTotalCostsAndFee(paymentStatus.getTotalCostsAndFee());
		paymentStatusImpl.setTax(paymentStatus.getTax());
		paymentStatusImpl.setCharges(paymentStatus.getCharges());
		paymentStatusImpl.setTotalRealDebit(paymentStatus.getTotalRealDebit());
		paymentStatusImpl.setTotalDebit(paymentStatus.getTotalDebit());
		paymentStatusImpl.setTotalCredit(paymentStatus.getTotalCredit());
		paymentStatusImpl.setCurrentStatus(paymentStatus.getCurrentStatus());
		paymentStatusImpl.setDebitNoteNumber(paymentStatus.getDebitNoteNumber());

		return paymentStatusImpl;
	}

	/**
	 * Returns the payment status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment status
	 * @return the payment status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentStatusException, SystemException {
		PaymentStatus paymentStatus = fetchByPrimaryKey(primaryKey);

		if (paymentStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentStatus;
	}

	/**
	 * Returns the payment status with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException} if it could not be found.
	 *
	 * @param id the primary key of the payment status
	 * @return the payment status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus findByPrimaryKey(long id)
		throws NoSuchPaymentStatusException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the payment status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the payment status
	 * @return the payment status, or <code>null</code> if a payment status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentStatus paymentStatus = (PaymentStatus)EntityCacheUtil.getResult(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
				PaymentStatusImpl.class, primaryKey);

		if (paymentStatus == _nullPaymentStatus) {
			return null;
		}

		if (paymentStatus == null) {
			Session session = null;

			try {
				session = openSession();

				paymentStatus = (PaymentStatus)session.get(PaymentStatusImpl.class,
						primaryKey);

				if (paymentStatus != null) {
					cacheResult(paymentStatus);
				}
				else {
					EntityCacheUtil.putResult(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
						PaymentStatusImpl.class, primaryKey, _nullPaymentStatus);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentStatusModelImpl.ENTITY_CACHE_ENABLED,
					PaymentStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentStatus;
	}

	/**
	 * Returns the payment status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the payment status
	 * @return the payment status, or <code>null</code> if a payment status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentStatus fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the payment statuses.
	 *
	 * @return the payment statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the payment statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment statuses
	 * @param end the upper bound of the range of payment statuses (not inclusive)
	 * @return the range of payment statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the payment statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payment statuses
	 * @param end the upper bound of the range of payment statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of payment statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentStatus> findAll(int start, int end,
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

		List<PaymentStatus> list = (List<PaymentStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTSTATUS;

				if (pagination) {
					sql = sql.concat(PaymentStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentStatus>(list);
				}
				else {
					list = (List<PaymentStatus>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the payment statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentStatus paymentStatus : findAll()) {
			remove(paymentStatus);
		}
	}

	/**
	 * Returns the number of payment statuses.
	 *
	 * @return the number of payment statuses
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTSTATUS);

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
	 * Initializes the payment status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentStatus>> listenersList = new ArrayList<ModelListener<PaymentStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentStatus>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentStatusImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTSTATUS = "SELECT paymentStatus FROM PaymentStatus paymentStatus";
	private static final String _SQL_SELECT_PAYMENTSTATUS_WHERE = "SELECT paymentStatus FROM PaymentStatus paymentStatus WHERE ";
	private static final String _SQL_COUNT_PAYMENTSTATUS = "SELECT COUNT(paymentStatus) FROM PaymentStatus paymentStatus";
	private static final String _SQL_COUNT_PAYMENTSTATUS_WHERE = "SELECT COUNT(paymentStatus) FROM PaymentStatus paymentStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentStatus exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentStatusPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleRecordId", "attachedFile", "unitPrice", "basicCurrency",
				"exchangeRate", "inspectionFee", "otherCosts",
				"totalCostsAndFee", "totalRealDebit", "totalDebit",
				"totalCredit", "currentStatus", "debitNoteNumber"
			});
	private static PaymentStatus _nullPaymentStatus = new PaymentStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentStatus> toCacheModel() {
				return _nullPaymentStatusCacheModel;
			}
		};

	private static CacheModel<PaymentStatus> _nullPaymentStatusCacheModel = new CacheModel<PaymentStatus>() {
			@Override
			public PaymentStatus toEntityModel() {
				return _nullPaymentStatus;
			}
		};
}