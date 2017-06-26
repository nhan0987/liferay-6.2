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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the debit note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DebitNotePersistence
 * @see DebitNoteUtil
 * @generated
 */
public class DebitNotePersistenceImpl extends BasePersistenceImpl<DebitNote>
	implements DebitNotePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DebitNoteUtil} to access the debit note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DebitNoteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, DebitNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, DebitNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TRANSACTIONID = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, DebitNoteImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTransactionId",
			new String[] { String.class.getName() },
			DebitNoteModelImpl.TRANSACTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANSACTIONID = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTransactionId",
			new String[] { String.class.getName() });

	/**
	 * Returns the debit note where transactionId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	 *
	 * @param transactionId the transaction ID
	 * @return the matching debit note
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote findByTransactionId(String transactionId)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = fetchByTransactionId(transactionId);

		if (debitNote == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("transactionId=");
			msg.append(transactionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDebitNoteException(msg.toString());
		}

		return debitNote;
	}

	/**
	 * Returns the debit note where transactionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param transactionId the transaction ID
	 * @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByTransactionId(String transactionId)
		throws SystemException {
		return fetchByTransactionId(transactionId, true);
	}

	/**
	 * Returns the debit note where transactionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param transactionId the transaction ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByTransactionId(String transactionId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { transactionId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
					finderArgs, this);
		}

		if (result instanceof DebitNote) {
			DebitNote debitNote = (DebitNote)result;

			if (!Validator.equals(transactionId, debitNote.getTransactionId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DEBITNOTE_WHERE);

			boolean bindTransactionId = false;

			if (transactionId == null) {
				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_1);
			}
			else if (transactionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_3);
			}
			else {
				bindTransactionId = true;

				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTransactionId) {
					qPos.add(transactionId);
				}

				List<DebitNote> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DebitNotePersistenceImpl.fetchByTransactionId(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DebitNote debitNote = list.get(0);

					result = debitNote;

					cacheResult(debitNote);

					if ((debitNote.getTransactionId() == null) ||
							!debitNote.getTransactionId().equals(transactionId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
							finderArgs, debitNote);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
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
			return (DebitNote)result;
		}
	}

	/**
	 * Removes the debit note where transactionId = &#63; from the database.
	 *
	 * @param transactionId the transaction ID
	 * @return the debit note that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote removeByTransactionId(String transactionId)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = findByTransactionId(transactionId);

		return remove(debitNote);
	}

	/**
	 * Returns the number of debit notes where transactionId = &#63;.
	 *
	 * @param transactionId the transaction ID
	 * @return the number of matching debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTransactionId(String transactionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANSACTIONID;

		Object[] finderArgs = new Object[] { transactionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DEBITNOTE_WHERE);

			boolean bindTransactionId = false;

			if (transactionId == null) {
				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_1);
			}
			else if (transactionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_3);
			}
			else {
				bindTransactionId = true;

				query.append(_FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTransactionId) {
					qPos.add(transactionId);
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

	private static final String _FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_1 = "debitNote.transactionId IS NULL";
	private static final String _FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_2 = "debitNote.transactionId = ?";
	private static final String _FINDER_COLUMN_TRANSACTIONID_TRANSACTIONID_3 = "(debitNote.transactionId IS NULL OR debitNote.transactionId = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_DEBITNOTENUMBER = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, DebitNoteImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDebitNoteNumber",
			new String[] { String.class.getName() },
			DebitNoteModelImpl.DEBITNOTENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEBITNOTENUMBER = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDebitNoteNumber", new String[] { String.class.getName() });

	/**
	 * Returns the debit note where debitNoteNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	 *
	 * @param debitNoteNumber the debit note number
	 * @return the matching debit note
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote findByDebitNoteNumber(String debitNoteNumber)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = fetchByDebitNoteNumber(debitNoteNumber);

		if (debitNote == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("debitNoteNumber=");
			msg.append(debitNoteNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDebitNoteException(msg.toString());
		}

		return debitNote;
	}

	/**
	 * Returns the debit note where debitNoteNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param debitNoteNumber the debit note number
	 * @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByDebitNoteNumber(String debitNoteNumber)
		throws SystemException {
		return fetchByDebitNoteNumber(debitNoteNumber, true);
	}

	/**
	 * Returns the debit note where debitNoteNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param debitNoteNumber the debit note number
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByDebitNoteNumber(String debitNoteNumber,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { debitNoteNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
					finderArgs, this);
		}

		if (result instanceof DebitNote) {
			DebitNote debitNote = (DebitNote)result;

			if (!Validator.equals(debitNoteNumber,
						debitNote.getDebitNoteNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DEBITNOTE_WHERE);

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

				List<DebitNote> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DebitNotePersistenceImpl.fetchByDebitNoteNumber(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DebitNote debitNote = list.get(0);

					result = debitNote;

					cacheResult(debitNote);

					if ((debitNote.getDebitNoteNumber() == null) ||
							!debitNote.getDebitNoteNumber()
										  .equals(debitNoteNumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
							finderArgs, debitNote);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
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
			return (DebitNote)result;
		}
	}

	/**
	 * Removes the debit note where debitNoteNumber = &#63; from the database.
	 *
	 * @param debitNoteNumber the debit note number
	 * @return the debit note that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote removeByDebitNoteNumber(String debitNoteNumber)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = findByDebitNoteNumber(debitNoteNumber);

		return remove(debitNote);
	}

	/**
	 * Returns the number of debit notes where debitNoteNumber = &#63;.
	 *
	 * @param debitNoteNumber the debit note number
	 * @return the number of matching debit notes
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

			query.append(_SQL_COUNT_DEBITNOTE_WHERE);

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
		"debitNote.debitNoteNumber IS NULL";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_2 =
		"debitNote.debitNoteNumber = ?";
	private static final String _FINDER_COLUMN_DEBITNOTENUMBER_DEBITNOTENUMBER_3 =
		"(debitNote.debitNoteNumber IS NULL OR debitNote.debitNoteNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MARKASDELETED =
		new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, DebitNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMarkAsDeleted",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED =
		new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, DebitNoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMarkAsDeleted",
			new String[] { Integer.class.getName() },
			DebitNoteModelImpl.MARKASDELETED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MARKASDELETED = new FinderPath(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMarkAsDeleted",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the debit notes where markAsDeleted = &#63;.
	 *
	 * @param markAsDeleted the mark as deleted
	 * @return the matching debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNote> findByMarkAsDeleted(int markAsDeleted)
		throws SystemException {
		return findByMarkAsDeleted(markAsDeleted, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the debit notes where markAsDeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param markAsDeleted the mark as deleted
	 * @param start the lower bound of the range of debit notes
	 * @param end the upper bound of the range of debit notes (not inclusive)
	 * @return the range of matching debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNote> findByMarkAsDeleted(int markAsDeleted, int start,
		int end) throws SystemException {
		return findByMarkAsDeleted(markAsDeleted, start, end, null);
	}

	/**
	 * Returns an ordered range of all the debit notes where markAsDeleted = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param markAsDeleted the mark as deleted
	 * @param start the lower bound of the range of debit notes
	 * @param end the upper bound of the range of debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNote> findByMarkAsDeleted(int markAsDeleted, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED;
			finderArgs = new Object[] { markAsDeleted };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MARKASDELETED;
			finderArgs = new Object[] {
					markAsDeleted,
					
					start, end, orderByComparator
				};
		}

		List<DebitNote> list = (List<DebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DebitNote debitNote : list) {
				if ((markAsDeleted != debitNote.getMarkAsDeleted())) {
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

			query.append(_SQL_SELECT_DEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DebitNoteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markAsDeleted);

				if (!pagination) {
					list = (List<DebitNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DebitNote>(list);
				}
				else {
					list = (List<DebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first debit note in the ordered set where markAsDeleted = &#63;.
	 *
	 * @param markAsDeleted the mark as deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching debit note
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote findByMarkAsDeleted_First(int markAsDeleted,
		OrderByComparator orderByComparator)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = fetchByMarkAsDeleted_First(markAsDeleted,
				orderByComparator);

		if (debitNote != null) {
			return debitNote;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("markAsDeleted=");
		msg.append(markAsDeleted);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDebitNoteException(msg.toString());
	}

	/**
	 * Returns the first debit note in the ordered set where markAsDeleted = &#63;.
	 *
	 * @param markAsDeleted the mark as deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching debit note, or <code>null</code> if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByMarkAsDeleted_First(int markAsDeleted,
		OrderByComparator orderByComparator) throws SystemException {
		List<DebitNote> list = findByMarkAsDeleted(markAsDeleted, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last debit note in the ordered set where markAsDeleted = &#63;.
	 *
	 * @param markAsDeleted the mark as deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching debit note
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote findByMarkAsDeleted_Last(int markAsDeleted,
		OrderByComparator orderByComparator)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = fetchByMarkAsDeleted_Last(markAsDeleted,
				orderByComparator);

		if (debitNote != null) {
			return debitNote;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("markAsDeleted=");
		msg.append(markAsDeleted);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDebitNoteException(msg.toString());
	}

	/**
	 * Returns the last debit note in the ordered set where markAsDeleted = &#63;.
	 *
	 * @param markAsDeleted the mark as deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching debit note, or <code>null</code> if a matching debit note could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByMarkAsDeleted_Last(int markAsDeleted,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMarkAsDeleted(markAsDeleted);

		if (count == 0) {
			return null;
		}

		List<DebitNote> list = findByMarkAsDeleted(markAsDeleted, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the debit notes before and after the current debit note in the ordered set where markAsDeleted = &#63;.
	 *
	 * @param id the primary key of the current debit note
	 * @param markAsDeleted the mark as deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next debit note
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote[] findByMarkAsDeleted_PrevAndNext(long id,
		int markAsDeleted, OrderByComparator orderByComparator)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DebitNote[] array = new DebitNoteImpl[3];

			array[0] = getByMarkAsDeleted_PrevAndNext(session, debitNote,
					markAsDeleted, orderByComparator, true);

			array[1] = debitNote;

			array[2] = getByMarkAsDeleted_PrevAndNext(session, debitNote,
					markAsDeleted, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DebitNote getByMarkAsDeleted_PrevAndNext(Session session,
		DebitNote debitNote, int markAsDeleted,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DEBITNOTE_WHERE);

		query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2);

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
			query.append(DebitNoteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(markAsDeleted);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(debitNote);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DebitNote> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the debit notes where markAsDeleted = &#63; from the database.
	 *
	 * @param markAsDeleted the mark as deleted
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMarkAsDeleted(int markAsDeleted)
		throws SystemException {
		for (DebitNote debitNote : findByMarkAsDeleted(markAsDeleted,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(debitNote);
		}
	}

	/**
	 * Returns the number of debit notes where markAsDeleted = &#63;.
	 *
	 * @param markAsDeleted the mark as deleted
	 * @return the number of matching debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMarkAsDeleted(int markAsDeleted)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MARKASDELETED;

		Object[] finderArgs = new Object[] { markAsDeleted };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DEBITNOTE_WHERE);

			query.append(_FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(markAsDeleted);

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

	private static final String _FINDER_COLUMN_MARKASDELETED_MARKASDELETED_2 = "debitNote.markAsDeleted = ?";

	public DebitNotePersistenceImpl() {
		setModelClass(DebitNote.class);
	}

	/**
	 * Caches the debit note in the entity cache if it is enabled.
	 *
	 * @param debitNote the debit note
	 */
	@Override
	public void cacheResult(DebitNote debitNote) {
		EntityCacheUtil.putResult(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteImpl.class, debitNote.getPrimaryKey(), debitNote);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
			new Object[] { debitNote.getTransactionId() }, debitNote);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
			new Object[] { debitNote.getDebitNoteNumber() }, debitNote);

		debitNote.resetOriginalValues();
	}

	/**
	 * Caches the debit notes in the entity cache if it is enabled.
	 *
	 * @param debitNotes the debit notes
	 */
	@Override
	public void cacheResult(List<DebitNote> debitNotes) {
		for (DebitNote debitNote : debitNotes) {
			if (EntityCacheUtil.getResult(
						DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
						DebitNoteImpl.class, debitNote.getPrimaryKey()) == null) {
				cacheResult(debitNote);
			}
			else {
				debitNote.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all debit notes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DebitNoteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DebitNoteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the debit note.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DebitNote debitNote) {
		EntityCacheUtil.removeResult(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteImpl.class, debitNote.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(debitNote);
	}

	@Override
	public void clearCache(List<DebitNote> debitNotes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DebitNote debitNote : debitNotes) {
			EntityCacheUtil.removeResult(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
				DebitNoteImpl.class, debitNote.getPrimaryKey());

			clearUniqueFindersCache(debitNote);
		}
	}

	protected void cacheUniqueFindersCache(DebitNote debitNote) {
		if (debitNote.isNew()) {
			Object[] args = new Object[] { debitNote.getTransactionId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TRANSACTIONID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID, args,
				debitNote);

			args = new Object[] { debitNote.getDebitNoteNumber() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
				args, debitNote);
		}
		else {
			DebitNoteModelImpl debitNoteModelImpl = (DebitNoteModelImpl)debitNote;

			if ((debitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TRANSACTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { debitNote.getTransactionId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TRANSACTIONID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
					args, debitNote);
			}

			if ((debitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DEBITNOTENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { debitNote.getDebitNoteNumber() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
					args, debitNote);
			}
		}
	}

	protected void clearUniqueFindersCache(DebitNote debitNote) {
		DebitNoteModelImpl debitNoteModelImpl = (DebitNoteModelImpl)debitNote;

		Object[] args = new Object[] { debitNote.getTransactionId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANSACTIONID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANSACTIONID, args);

		if ((debitNoteModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TRANSACTIONID.getColumnBitmask()) != 0) {
			args = new Object[] { debitNoteModelImpl.getOriginalTransactionId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANSACTIONID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TRANSACTIONID,
				args);
		}

		args = new Object[] { debitNote.getDebitNoteNumber() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER, args);

		if ((debitNoteModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DEBITNOTENUMBER.getColumnBitmask()) != 0) {
			args = new Object[] { debitNoteModelImpl.getOriginalDebitNoteNumber() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTENUMBER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEBITNOTENUMBER,
				args);
		}
	}

	/**
	 * Creates a new debit note with the primary key. Does not add the debit note to the database.
	 *
	 * @param id the primary key for the new debit note
	 * @return the new debit note
	 */
	@Override
	public DebitNote create(long id) {
		DebitNote debitNote = new DebitNoteImpl();

		debitNote.setNew(true);
		debitNote.setPrimaryKey(id);

		return debitNote;
	}

	/**
	 * Removes the debit note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the debit note
	 * @return the debit note that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote remove(long id)
		throws NoSuchDebitNoteException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the debit note with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the debit note
	 * @return the debit note that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote remove(Serializable primaryKey)
		throws NoSuchDebitNoteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DebitNote debitNote = (DebitNote)session.get(DebitNoteImpl.class,
					primaryKey);

			if (debitNote == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDebitNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(debitNote);
		}
		catch (NoSuchDebitNoteException nsee) {
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
	protected DebitNote removeImpl(DebitNote debitNote)
		throws SystemException {
		debitNote = toUnwrappedModel(debitNote);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(debitNote)) {
				debitNote = (DebitNote)session.get(DebitNoteImpl.class,
						debitNote.getPrimaryKeyObj());
			}

			if (debitNote != null) {
				session.delete(debitNote);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (debitNote != null) {
			clearCache(debitNote);
		}

		return debitNote;
	}

	@Override
	public DebitNote updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote)
		throws SystemException {
		debitNote = toUnwrappedModel(debitNote);

		boolean isNew = debitNote.isNew();

		DebitNoteModelImpl debitNoteModelImpl = (DebitNoteModelImpl)debitNote;

		Session session = null;

		try {
			session = openSession();

			if (debitNote.isNew()) {
				session.save(debitNote);

				debitNote.setNew(false);
			}
			else {
				session.merge(debitNote);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DebitNoteModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((debitNoteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						debitNoteModelImpl.getOriginalMarkAsDeleted()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED,
					args);

				args = new Object[] { debitNoteModelImpl.getMarkAsDeleted() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MARKASDELETED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MARKASDELETED,
					args);
			}
		}

		EntityCacheUtil.putResult(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
			DebitNoteImpl.class, debitNote.getPrimaryKey(), debitNote);

		clearUniqueFindersCache(debitNote);
		cacheUniqueFindersCache(debitNote);

		return debitNote;
	}

	protected DebitNote toUnwrappedModel(DebitNote debitNote) {
		if (debitNote instanceof DebitNoteImpl) {
			return debitNote;
		}

		DebitNoteImpl debitNoteImpl = new DebitNoteImpl();

		debitNoteImpl.setNew(debitNote.isNew());
		debitNoteImpl.setPrimaryKey(debitNote.getPrimaryKey());

		debitNoteImpl.setId(debitNote.getId());
		debitNoteImpl.setDebitNoteNumber(debitNote.getDebitNoteNumber());
		debitNoteImpl.setTransactionId(debitNote.getTransactionId());
		debitNoteImpl.setOrganization(debitNote.getOrganization());
		debitNoteImpl.setDivision(debitNote.getDivision());
		debitNoteImpl.setReportBy(debitNote.getReportBy());
		debitNoteImpl.setReportDate(debitNote.getReportDate());
		debitNoteImpl.setFromDate(debitNote.getFromDate());
		debitNoteImpl.setToDate(debitNote.getToDate());
		debitNoteImpl.setAttachedFile(debitNote.getAttachedFile());
		debitNoteImpl.setTotalPayment(debitNote.getTotalPayment());
		debitNoteImpl.setPaymentType(debitNote.getPaymentType());
		debitNoteImpl.setMarkAsDeleted(debitNote.getMarkAsDeleted());

		return debitNoteImpl;
	}

	/**
	 * Returns the debit note with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the debit note
	 * @return the debit note
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDebitNoteException, SystemException {
		DebitNote debitNote = fetchByPrimaryKey(primaryKey);

		if (debitNote == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDebitNoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return debitNote;
	}

	/**
	 * Returns the debit note with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	 *
	 * @param id the primary key of the debit note
	 * @return the debit note
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote findByPrimaryKey(long id)
		throws NoSuchDebitNoteException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the debit note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the debit note
	 * @return the debit note, or <code>null</code> if a debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DebitNote debitNote = (DebitNote)EntityCacheUtil.getResult(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
				DebitNoteImpl.class, primaryKey);

		if (debitNote == _nullDebitNote) {
			return null;
		}

		if (debitNote == null) {
			Session session = null;

			try {
				session = openSession();

				debitNote = (DebitNote)session.get(DebitNoteImpl.class,
						primaryKey);

				if (debitNote != null) {
					cacheResult(debitNote);
				}
				else {
					EntityCacheUtil.putResult(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
						DebitNoteImpl.class, primaryKey, _nullDebitNote);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DebitNoteModelImpl.ENTITY_CACHE_ENABLED,
					DebitNoteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return debitNote;
	}

	/**
	 * Returns the debit note with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the debit note
	 * @return the debit note, or <code>null</code> if a debit note with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DebitNote fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the debit notes.
	 *
	 * @return the debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNote> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the debit notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of debit notes
	 * @param end the upper bound of the range of debit notes (not inclusive)
	 * @return the range of debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNote> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the debit notes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of debit notes
	 * @param end the upper bound of the range of debit notes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of debit notes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DebitNote> findAll(int start, int end,
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

		List<DebitNote> list = (List<DebitNote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DEBITNOTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DEBITNOTE;

				if (pagination) {
					sql = sql.concat(DebitNoteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DebitNote>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DebitNote>(list);
				}
				else {
					list = (List<DebitNote>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the debit notes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DebitNote debitNote : findAll()) {
			remove(debitNote);
		}
	}

	/**
	 * Returns the number of debit notes.
	 *
	 * @return the number of debit notes
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

				Query q = session.createQuery(_SQL_COUNT_DEBITNOTE);

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
	 * Initializes the debit note persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DebitNote>> listenersList = new ArrayList<ModelListener<DebitNote>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DebitNote>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DebitNoteImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DEBITNOTE = "SELECT debitNote FROM DebitNote debitNote";
	private static final String _SQL_SELECT_DEBITNOTE_WHERE = "SELECT debitNote FROM DebitNote debitNote WHERE ";
	private static final String _SQL_COUNT_DEBITNOTE = "SELECT COUNT(debitNote) FROM DebitNote debitNote";
	private static final String _SQL_COUNT_DEBITNOTE_WHERE = "SELECT COUNT(debitNote) FROM DebitNote debitNote WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "debitNote.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DebitNote exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DebitNote exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DebitNotePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"debitNoteNumber", "transactionId", "reportBy", "reportDate",
				"fromDate", "toDate", "attachedFile", "totalPayment",
				"paymentType", "markAsDeleted"
			});
	private static DebitNote _nullDebitNote = new DebitNoteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DebitNote> toCacheModel() {
				return _nullDebitNoteCacheModel;
			}
		};

	private static CacheModel<DebitNote> _nullDebitNoteCacheModel = new CacheModel<DebitNote>() {
			@Override
			public DebitNote toEntityModel() {
				return _nullDebitNote;
			}
		};
}