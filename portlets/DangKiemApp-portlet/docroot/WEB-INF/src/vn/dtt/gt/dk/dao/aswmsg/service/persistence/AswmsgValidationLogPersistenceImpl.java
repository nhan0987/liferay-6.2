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

package vn.dtt.gt.dk.dao.aswmsg.service.persistence;

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

import vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the aswmsg validation log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgValidationLogPersistence
 * @see AswmsgValidationLogUtil
 * @generated
 */
public class AswmsgValidationLogPersistenceImpl extends BasePersistenceImpl<AswmsgValidationLog>
	implements AswmsgValidationLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AswmsgValidationLogUtil} to access the aswmsg validation log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AswmsgValidationLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogModelImpl.FINDER_CACHE_ENABLED,
			AswmsgValidationLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogModelImpl.FINDER_CACHE_ENABLED,
			AswmsgValidationLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGELOGID =
		new FinderPath(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogModelImpl.FINDER_CACHE_ENABLED,
			AswmsgValidationLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMessageLogId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGELOGID =
		new FinderPath(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogModelImpl.FINDER_CACHE_ENABLED,
			AswmsgValidationLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMessageLogId",
			new String[] { Long.class.getName() },
			AswmsgValidationLogModelImpl.MESSAGELOGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MESSAGELOGID = new FinderPath(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMessageLogId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the aswmsg validation logs where MessageLogId = &#63;.
	 *
	 * @param MessageLogId the message log ID
	 * @return the matching aswmsg validation logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgValidationLog> findByMessageLogId(long MessageLogId)
		throws SystemException {
		return findByMessageLogId(MessageLogId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg validation logs where MessageLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param MessageLogId the message log ID
	 * @param start the lower bound of the range of aswmsg validation logs
	 * @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	 * @return the range of matching aswmsg validation logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgValidationLog> findByMessageLogId(long MessageLogId,
		int start, int end) throws SystemException {
		return findByMessageLogId(MessageLogId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg validation logs where MessageLogId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param MessageLogId the message log ID
	 * @param start the lower bound of the range of aswmsg validation logs
	 * @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching aswmsg validation logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgValidationLog> findByMessageLogId(long MessageLogId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGELOGID;
			finderArgs = new Object[] { MessageLogId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGELOGID;
			finderArgs = new Object[] {
					MessageLogId,
					
					start, end, orderByComparator
				};
		}

		List<AswmsgValidationLog> list = (List<AswmsgValidationLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AswmsgValidationLog aswmsgValidationLog : list) {
				if ((MessageLogId != aswmsgValidationLog.getMessageLogId())) {
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

			query.append(_SQL_SELECT_ASWMSGVALIDATIONLOG_WHERE);

			query.append(_FINDER_COLUMN_MESSAGELOGID_MESSAGELOGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AswmsgValidationLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(MessageLogId);

				if (!pagination) {
					list = (List<AswmsgValidationLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgValidationLog>(list);
				}
				else {
					list = (List<AswmsgValidationLog>)QueryUtil.list(q,
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
	 * Returns the first aswmsg validation log in the ordered set where MessageLogId = &#63;.
	 *
	 * @param MessageLogId the message log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg validation log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a matching aswmsg validation log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog findByMessageLogId_First(long MessageLogId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgValidationLogException, SystemException {
		AswmsgValidationLog aswmsgValidationLog = fetchByMessageLogId_First(MessageLogId,
				orderByComparator);

		if (aswmsgValidationLog != null) {
			return aswmsgValidationLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("MessageLogId=");
		msg.append(MessageLogId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgValidationLogException(msg.toString());
	}

	/**
	 * Returns the first aswmsg validation log in the ordered set where MessageLogId = &#63;.
	 *
	 * @param MessageLogId the message log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg validation log, or <code>null</code> if a matching aswmsg validation log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog fetchByMessageLogId_First(long MessageLogId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AswmsgValidationLog> list = findByMessageLogId(MessageLogId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last aswmsg validation log in the ordered set where MessageLogId = &#63;.
	 *
	 * @param MessageLogId the message log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg validation log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a matching aswmsg validation log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog findByMessageLogId_Last(long MessageLogId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgValidationLogException, SystemException {
		AswmsgValidationLog aswmsgValidationLog = fetchByMessageLogId_Last(MessageLogId,
				orderByComparator);

		if (aswmsgValidationLog != null) {
			return aswmsgValidationLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("MessageLogId=");
		msg.append(MessageLogId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgValidationLogException(msg.toString());
	}

	/**
	 * Returns the last aswmsg validation log in the ordered set where MessageLogId = &#63;.
	 *
	 * @param MessageLogId the message log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg validation log, or <code>null</code> if a matching aswmsg validation log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog fetchByMessageLogId_Last(long MessageLogId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMessageLogId(MessageLogId);

		if (count == 0) {
			return null;
		}

		List<AswmsgValidationLog> list = findByMessageLogId(MessageLogId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the aswmsg validation logs before and after the current aswmsg validation log in the ordered set where MessageLogId = &#63;.
	 *
	 * @param Id the primary key of the current aswmsg validation log
	 * @param MessageLogId the message log ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next aswmsg validation log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog[] findByMessageLogId_PrevAndNext(long Id,
		long MessageLogId, OrderByComparator orderByComparator)
		throws NoSuchAswmsgValidationLogException, SystemException {
		AswmsgValidationLog aswmsgValidationLog = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			AswmsgValidationLog[] array = new AswmsgValidationLogImpl[3];

			array[0] = getByMessageLogId_PrevAndNext(session,
					aswmsgValidationLog, MessageLogId, orderByComparator, true);

			array[1] = aswmsgValidationLog;

			array[2] = getByMessageLogId_PrevAndNext(session,
					aswmsgValidationLog, MessageLogId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AswmsgValidationLog getByMessageLogId_PrevAndNext(
		Session session, AswmsgValidationLog aswmsgValidationLog,
		long MessageLogId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASWMSGVALIDATIONLOG_WHERE);

		query.append(_FINDER_COLUMN_MESSAGELOGID_MESSAGELOGID_2);

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
			query.append(AswmsgValidationLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(MessageLogId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(aswmsgValidationLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AswmsgValidationLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the aswmsg validation logs where MessageLogId = &#63; from the database.
	 *
	 * @param MessageLogId the message log ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMessageLogId(long MessageLogId)
		throws SystemException {
		for (AswmsgValidationLog aswmsgValidationLog : findByMessageLogId(
				MessageLogId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(aswmsgValidationLog);
		}
	}

	/**
	 * Returns the number of aswmsg validation logs where MessageLogId = &#63;.
	 *
	 * @param MessageLogId the message log ID
	 * @return the number of matching aswmsg validation logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMessageLogId(long MessageLogId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MESSAGELOGID;

		Object[] finderArgs = new Object[] { MessageLogId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASWMSGVALIDATIONLOG_WHERE);

			query.append(_FINDER_COLUMN_MESSAGELOGID_MESSAGELOGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(MessageLogId);

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

	private static final String _FINDER_COLUMN_MESSAGELOGID_MESSAGELOGID_2 = "aswmsgValidationLog.MessageLogId = ?";

	public AswmsgValidationLogPersistenceImpl() {
		setModelClass(AswmsgValidationLog.class);
	}

	/**
	 * Caches the aswmsg validation log in the entity cache if it is enabled.
	 *
	 * @param aswmsgValidationLog the aswmsg validation log
	 */
	@Override
	public void cacheResult(AswmsgValidationLog aswmsgValidationLog) {
		EntityCacheUtil.putResult(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogImpl.class, aswmsgValidationLog.getPrimaryKey(),
			aswmsgValidationLog);

		aswmsgValidationLog.resetOriginalValues();
	}

	/**
	 * Caches the aswmsg validation logs in the entity cache if it is enabled.
	 *
	 * @param aswmsgValidationLogs the aswmsg validation logs
	 */
	@Override
	public void cacheResult(List<AswmsgValidationLog> aswmsgValidationLogs) {
		for (AswmsgValidationLog aswmsgValidationLog : aswmsgValidationLogs) {
			if (EntityCacheUtil.getResult(
						AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgValidationLogImpl.class,
						aswmsgValidationLog.getPrimaryKey()) == null) {
				cacheResult(aswmsgValidationLog);
			}
			else {
				aswmsgValidationLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all aswmsg validation logs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AswmsgValidationLogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AswmsgValidationLogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the aswmsg validation log.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AswmsgValidationLog aswmsgValidationLog) {
		EntityCacheUtil.removeResult(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogImpl.class, aswmsgValidationLog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AswmsgValidationLog> aswmsgValidationLogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AswmsgValidationLog aswmsgValidationLog : aswmsgValidationLogs) {
			EntityCacheUtil.removeResult(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgValidationLogImpl.class,
				aswmsgValidationLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new aswmsg validation log with the primary key. Does not add the aswmsg validation log to the database.
	 *
	 * @param Id the primary key for the new aswmsg validation log
	 * @return the new aswmsg validation log
	 */
	@Override
	public AswmsgValidationLog create(long Id) {
		AswmsgValidationLog aswmsgValidationLog = new AswmsgValidationLogImpl();

		aswmsgValidationLog.setNew(true);
		aswmsgValidationLog.setPrimaryKey(Id);

		return aswmsgValidationLog;
	}

	/**
	 * Removes the aswmsg validation log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the aswmsg validation log
	 * @return the aswmsg validation log that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog remove(long Id)
		throws NoSuchAswmsgValidationLogException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the aswmsg validation log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the aswmsg validation log
	 * @return the aswmsg validation log that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog remove(Serializable primaryKey)
		throws NoSuchAswmsgValidationLogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AswmsgValidationLog aswmsgValidationLog = (AswmsgValidationLog)session.get(AswmsgValidationLogImpl.class,
					primaryKey);

			if (aswmsgValidationLog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAswmsgValidationLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(aswmsgValidationLog);
		}
		catch (NoSuchAswmsgValidationLogException nsee) {
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
	protected AswmsgValidationLog removeImpl(
		AswmsgValidationLog aswmsgValidationLog) throws SystemException {
		aswmsgValidationLog = toUnwrappedModel(aswmsgValidationLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(aswmsgValidationLog)) {
				aswmsgValidationLog = (AswmsgValidationLog)session.get(AswmsgValidationLogImpl.class,
						aswmsgValidationLog.getPrimaryKeyObj());
			}

			if (aswmsgValidationLog != null) {
				session.delete(aswmsgValidationLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (aswmsgValidationLog != null) {
			clearCache(aswmsgValidationLog);
		}

		return aswmsgValidationLog;
	}

	@Override
	public AswmsgValidationLog updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog aswmsgValidationLog)
		throws SystemException {
		aswmsgValidationLog = toUnwrappedModel(aswmsgValidationLog);

		boolean isNew = aswmsgValidationLog.isNew();

		AswmsgValidationLogModelImpl aswmsgValidationLogModelImpl = (AswmsgValidationLogModelImpl)aswmsgValidationLog;

		Session session = null;

		try {
			session = openSession();

			if (aswmsgValidationLog.isNew()) {
				session.save(aswmsgValidationLog);

				aswmsgValidationLog.setNew(false);
			}
			else {
				session.merge(aswmsgValidationLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AswmsgValidationLogModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((aswmsgValidationLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGELOGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgValidationLogModelImpl.getOriginalMessageLogId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGELOGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGELOGID,
					args);

				args = new Object[] {
						aswmsgValidationLogModelImpl.getMessageLogId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGELOGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGELOGID,
					args);
			}
		}

		EntityCacheUtil.putResult(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgValidationLogImpl.class, aswmsgValidationLog.getPrimaryKey(),
			aswmsgValidationLog);

		return aswmsgValidationLog;
	}

	protected AswmsgValidationLog toUnwrappedModel(
		AswmsgValidationLog aswmsgValidationLog) {
		if (aswmsgValidationLog instanceof AswmsgValidationLogImpl) {
			return aswmsgValidationLog;
		}

		AswmsgValidationLogImpl aswmsgValidationLogImpl = new AswmsgValidationLogImpl();

		aswmsgValidationLogImpl.setNew(aswmsgValidationLog.isNew());
		aswmsgValidationLogImpl.setPrimaryKey(aswmsgValidationLog.getPrimaryKey());

		aswmsgValidationLogImpl.setId(aswmsgValidationLog.getId());
		aswmsgValidationLogImpl.setMessageLogId(aswmsgValidationLog.getMessageLogId());
		aswmsgValidationLogImpl.setTagName(aswmsgValidationLog.getTagName());
		aswmsgValidationLogImpl.setValidationCode(aswmsgValidationLog.getValidationCode());
		aswmsgValidationLogImpl.setDescription(aswmsgValidationLog.getDescription());

		return aswmsgValidationLogImpl;
	}

	/**
	 * Returns the aswmsg validation log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg validation log
	 * @return the aswmsg validation log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAswmsgValidationLogException, SystemException {
		AswmsgValidationLog aswmsgValidationLog = fetchByPrimaryKey(primaryKey);

		if (aswmsgValidationLog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAswmsgValidationLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return aswmsgValidationLog;
	}

	/**
	 * Returns the aswmsg validation log with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException} if it could not be found.
	 *
	 * @param Id the primary key of the aswmsg validation log
	 * @return the aswmsg validation log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog findByPrimaryKey(long Id)
		throws NoSuchAswmsgValidationLogException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the aswmsg validation log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg validation log
	 * @return the aswmsg validation log, or <code>null</code> if a aswmsg validation log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AswmsgValidationLog aswmsgValidationLog = (AswmsgValidationLog)EntityCacheUtil.getResult(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgValidationLogImpl.class, primaryKey);

		if (aswmsgValidationLog == _nullAswmsgValidationLog) {
			return null;
		}

		if (aswmsgValidationLog == null) {
			Session session = null;

			try {
				session = openSession();

				aswmsgValidationLog = (AswmsgValidationLog)session.get(AswmsgValidationLogImpl.class,
						primaryKey);

				if (aswmsgValidationLog != null) {
					cacheResult(aswmsgValidationLog);
				}
				else {
					EntityCacheUtil.putResult(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgValidationLogImpl.class, primaryKey,
						_nullAswmsgValidationLog);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AswmsgValidationLogModelImpl.ENTITY_CACHE_ENABLED,
					AswmsgValidationLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return aswmsgValidationLog;
	}

	/**
	 * Returns the aswmsg validation log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the aswmsg validation log
	 * @return the aswmsg validation log, or <code>null</code> if a aswmsg validation log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgValidationLog fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the aswmsg validation logs.
	 *
	 * @return the aswmsg validation logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgValidationLog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg validation logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg validation logs
	 * @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	 * @return the range of aswmsg validation logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgValidationLog> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg validation logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg validation logs
	 * @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of aswmsg validation logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgValidationLog> findAll(int start, int end,
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

		List<AswmsgValidationLog> list = (List<AswmsgValidationLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASWMSGVALIDATIONLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASWMSGVALIDATIONLOG;

				if (pagination) {
					sql = sql.concat(AswmsgValidationLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AswmsgValidationLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgValidationLog>(list);
				}
				else {
					list = (List<AswmsgValidationLog>)QueryUtil.list(q,
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
	 * Removes all the aswmsg validation logs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AswmsgValidationLog aswmsgValidationLog : findAll()) {
			remove(aswmsgValidationLog);
		}
	}

	/**
	 * Returns the number of aswmsg validation logs.
	 *
	 * @return the number of aswmsg validation logs
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

				Query q = session.createQuery(_SQL_COUNT_ASWMSGVALIDATIONLOG);

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
	 * Initializes the aswmsg validation log persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AswmsgValidationLog>> listenersList = new ArrayList<ModelListener<AswmsgValidationLog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AswmsgValidationLog>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AswmsgValidationLogImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASWMSGVALIDATIONLOG = "SELECT aswmsgValidationLog FROM AswmsgValidationLog aswmsgValidationLog";
	private static final String _SQL_SELECT_ASWMSGVALIDATIONLOG_WHERE = "SELECT aswmsgValidationLog FROM AswmsgValidationLog aswmsgValidationLog WHERE ";
	private static final String _SQL_COUNT_ASWMSGVALIDATIONLOG = "SELECT COUNT(aswmsgValidationLog) FROM AswmsgValidationLog aswmsgValidationLog";
	private static final String _SQL_COUNT_ASWMSGVALIDATIONLOG_WHERE = "SELECT COUNT(aswmsgValidationLog) FROM AswmsgValidationLog aswmsgValidationLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "aswmsgValidationLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AswmsgValidationLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AswmsgValidationLog exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AswmsgValidationLogPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "MessageLogId", "TagName", "ValidationCode", "Description"
			});
	private static AswmsgValidationLog _nullAswmsgValidationLog = new AswmsgValidationLogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AswmsgValidationLog> toCacheModel() {
				return _nullAswmsgValidationLogCacheModel;
			}
		};

	private static CacheModel<AswmsgValidationLog> _nullAswmsgValidationLogCacheModel =
		new CacheModel<AswmsgValidationLog>() {
			@Override
			public AswmsgValidationLog toEntityModel() {
				return _nullAswmsgValidationLog;
			}
		};
}