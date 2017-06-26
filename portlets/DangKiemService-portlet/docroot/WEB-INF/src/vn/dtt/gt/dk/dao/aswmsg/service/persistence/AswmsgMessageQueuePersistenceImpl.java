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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueImpl;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the aswmsg message queue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageQueuePersistence
 * @see AswmsgMessageQueueUtil
 * @generated
 */
public class AswmsgMessageQueuePersistenceImpl extends BasePersistenceImpl<AswmsgMessageQueue>
	implements AswmsgMessageQueuePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AswmsgMessageQueueUtil} to access the aswmsg message queue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AswmsgMessageQueueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVersionAndMessageId",
			new String[] { String.class.getName(), String.class.getName() },
			AswmsgMessageQueueModelImpl.VERSION_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.MESSAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVersionAndMessageId",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the aswmsg message queue where version = &#63; and messageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException} if it could not be found.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByVersionAndMessageId(String version,
		String messageId)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByVersionAndMessageId(version,
				messageId);

		if (aswmsgMessageQueue == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("version=");
			msg.append(version);

			msg.append(", messageId=");
			msg.append(messageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAswmsgMessageQueueException(msg.toString());
		}

		return aswmsgMessageQueue;
	}

	/**
	 * Returns the aswmsg message queue where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByVersionAndMessageId(String version,
		String messageId) throws SystemException {
		return fetchByVersionAndMessageId(version, messageId, true);
	}

	/**
	 * Returns the aswmsg message queue where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByVersionAndMessageId(String version,
		String messageId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { version, messageId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
					finderArgs, this);
		}

		if (result instanceof AswmsgMessageQueue) {
			AswmsgMessageQueue aswmsgMessageQueue = (AswmsgMessageQueue)result;

			if (!Validator.equals(version, aswmsgMessageQueue.getVersion()) ||
					!Validator.equals(messageId,
						aswmsgMessageQueue.getMessageId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_2);
			}

			boolean bindMessageId = false;

			if (messageId == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_1);
			}
			else if (messageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_3);
			}
			else {
				bindMessageId = true;

				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVersion) {
					qPos.add(version);
				}

				if (bindMessageId) {
					qPos.add(messageId);
				}

				List<AswmsgMessageQueue> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AswmsgMessageQueuePersistenceImpl.fetchByVersionAndMessageId(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					AswmsgMessageQueue aswmsgMessageQueue = list.get(0);

					result = aswmsgMessageQueue;

					cacheResult(aswmsgMessageQueue);

					if ((aswmsgMessageQueue.getVersion() == null) ||
							!aswmsgMessageQueue.getVersion().equals(version) ||
							(aswmsgMessageQueue.getMessageId() == null) ||
							!aswmsgMessageQueue.getMessageId().equals(messageId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
							finderArgs, aswmsgMessageQueue);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
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
			return (AswmsgMessageQueue)result;
		}
	}

	/**
	 * Removes the aswmsg message queue where version = &#63; and messageId = &#63; from the database.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the aswmsg message queue that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue removeByVersionAndMessageId(String version,
		String messageId)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = findByVersionAndMessageId(version,
				messageId);

		return remove(aswmsgMessageQueue);
	}

	/**
	 * Returns the number of aswmsg message queues where version = &#63; and messageId = &#63;.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the number of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVersionAndMessageId(String version, String messageId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID;

		Object[] finderArgs = new Object[] { version, messageId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASWMSGMESSAGEQUEUE_WHERE);

			boolean bindVersion = false;

			if (version == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_1);
			}
			else if (version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_2);
			}

			boolean bindMessageId = false;

			if (messageId == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_1);
			}
			else if (messageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_3);
			}
			else {
				bindMessageId = true;

				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVersion) {
					qPos.add(version);
				}

				if (bindMessageId) {
					qPos.add(messageId);
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

	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_1 = "aswmsgMessageQueue.version IS NULL AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_2 = "aswmsgMessageQueue.version = ? AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_3 = "(aswmsgMessageQueue.version IS NULL OR aswmsgMessageQueue.version = '') AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_1 = "aswmsgMessageQueue.messageId IS NULL";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_2 = "aswmsgMessageQueue.messageId = ?";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_3 = "(aswmsgMessageQueue.messageId IS NULL OR aswmsgMessageQueue.messageId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMessageId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMessageId",
			new String[] { String.class.getName() },
			AswmsgMessageQueueModelImpl.MESSAGEID_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MESSAGEID = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMessageId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the aswmsg message queues where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByMessageId(String messageId)
		throws SystemException {
		return findByMessageId(messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the aswmsg message queues where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @return the range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByMessageId(String messageId,
		int start, int end) throws SystemException {
		return findByMessageId(messageId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg message queues where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByMessageId(String messageId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID;
			finderArgs = new Object[] { messageId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGEID;
			finderArgs = new Object[] { messageId, start, end, orderByComparator };
		}

		List<AswmsgMessageQueue> list = (List<AswmsgMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AswmsgMessageQueue aswmsgMessageQueue : list) {
				if (!Validator.equals(messageId,
							aswmsgMessageQueue.getMessageId())) {
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

			query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

			boolean bindMessageId = false;

			if (messageId == null) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_1);
			}
			else if (messageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_3);
			}
			else {
				bindMessageId = true;

				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMessageId) {
					qPos.add(messageId);
				}

				if (!pagination) {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgMessageQueue>(list);
				}
				else {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first aswmsg message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByMessageId_First(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByMessageId_First(messageId,
				orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first aswmsg message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByMessageId_First(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AswmsgMessageQueue> list = findByMessageId(messageId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByMessageId_Last(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByMessageId_Last(messageId,
				orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByMessageId_Last(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMessageId(messageId);

		if (count == 0) {
			return null;
		}

		List<AswmsgMessageQueue> list = findByMessageId(messageId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where messageId = &#63;.
	 *
	 * @param id the primary key of the current aswmsg message queue
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue[] findByMessageId_PrevAndNext(long id,
		String messageId, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AswmsgMessageQueue[] array = new AswmsgMessageQueueImpl[3];

			array[0] = getByMessageId_PrevAndNext(session, aswmsgMessageQueue,
					messageId, orderByComparator, true);

			array[1] = aswmsgMessageQueue;

			array[2] = getByMessageId_PrevAndNext(session, aswmsgMessageQueue,
					messageId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AswmsgMessageQueue getByMessageId_PrevAndNext(Session session,
		AswmsgMessageQueue aswmsgMessageQueue, String messageId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

		boolean bindMessageId = false;

		if (messageId == null) {
			query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_1);
		}
		else if (messageId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_3);
		}
		else {
			bindMessageId = true;

			query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_2);
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
			query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMessageId) {
			qPos.add(messageId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(aswmsgMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AswmsgMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the aswmsg message queues where messageId = &#63; from the database.
	 *
	 * @param messageId the message ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMessageId(String messageId) throws SystemException {
		for (AswmsgMessageQueue aswmsgMessageQueue : findByMessageId(
				messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(aswmsgMessageQueue);
		}
	}

	/**
	 * Returns the number of aswmsg message queues where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the number of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMessageId(String messageId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MESSAGEID;

		Object[] finderArgs = new Object[] { messageId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASWMSGMESSAGEQUEUE_WHERE);

			boolean bindMessageId = false;

			if (messageId == null) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_1);
			}
			else if (messageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_3);
			}
			else {
				bindMessageId = true;

				query.append(_FINDER_COLUMN_MESSAGEID_MESSAGEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMessageId) {
					qPos.add(messageId);
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

	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_1 = "aswmsgMessageQueue.messageId IS NULL";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_2 = "aswmsgMessageQueue.messageId = ?";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_3 = "(aswmsgMessageQueue.messageId IS NULL OR aswmsgMessageQueue.messageId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			AswmsgMessageQueueModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.TYPE_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.FUNCTION_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @return the matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByHoSoThuTucId(long hoSoThuTucId,
		int type, String function) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, type, function,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @return the range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByHoSoThuTucId(long hoSoThuTucId,
		int type, String function, int start, int end)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, type, function, start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByHoSoThuTucId(long hoSoThuTucId,
		int type, String function, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId, type, function };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId, type, function,
					
					start, end, orderByComparator
				};
		}

		List<AswmsgMessageQueue> list = (List<AswmsgMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AswmsgMessageQueue aswmsgMessageQueue : list) {
				if ((hoSoThuTucId != aswmsgMessageQueue.getHoSoThuTucId()) ||
						(type != aswmsgMessageQueue.getType()) ||
						!Validator.equals(function,
							aswmsgMessageQueue.getFunction())) {
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

			query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_TYPE_2);

			boolean bindFunction = false;

			if (function == null) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_1);
			}
			else if (function.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_3);
			}
			else {
				bindFunction = true;

				query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(type);

				if (bindFunction) {
					qPos.add(function);
				}

				if (!pagination) {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgMessageQueue>(list);
				}
				else {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByHoSoThuTucId_First(long hoSoThuTucId,
		int type, String function, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByHoSoThuTucId_First(hoSoThuTucId,
				type, function, orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", function=");
		msg.append(function);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByHoSoThuTucId_First(long hoSoThuTucId,
		int type, String function, OrderByComparator orderByComparator)
		throws SystemException {
		List<AswmsgMessageQueue> list = findByHoSoThuTucId(hoSoThuTucId, type,
				function, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByHoSoThuTucId_Last(long hoSoThuTucId,
		int type, String function, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				type, function, orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", function=");
		msg.append(function);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		int type, String function, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId, type, function);

		if (count == 0) {
			return null;
		}

		List<AswmsgMessageQueue> list = findByHoSoThuTucId(hoSoThuTucId, type,
				function, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param id the primary key of the current aswmsg message queue
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, int type, String function,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AswmsgMessageQueue[] array = new AswmsgMessageQueueImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					aswmsgMessageQueue, hoSoThuTucId, type, function,
					orderByComparator, true);

			array[1] = aswmsgMessageQueue;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					aswmsgMessageQueue, hoSoThuTucId, type, function,
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

	protected AswmsgMessageQueue getByHoSoThuTucId_PrevAndNext(
		Session session, AswmsgMessageQueue aswmsgMessageQueue,
		long hoSoThuTucId, int type, String function,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_TYPE_2);

		boolean bindFunction = false;

		if (function == null) {
			query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_1);
		}
		else if (function.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_3);
		}
		else {
			bindFunction = true;

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_2);
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
			query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		qPos.add(type);

		if (bindFunction) {
			qPos.add(function);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(aswmsgMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AswmsgMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId, int type,
		String function) throws SystemException {
		for (AswmsgMessageQueue aswmsgMessageQueue : findByHoSoThuTucId(
				hoSoThuTucId, type, function, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(aswmsgMessageQueue);
		}
	}

	/**
	 * Returns the number of aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param type the type
	 * @param function the function
	 * @return the number of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId, int type, String function)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId, type, function };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_TYPE_2);

			boolean bindFunction = false;

			if (function == null) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_1);
			}
			else if (function.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_3);
			}
			else {
				bindFunction = true;

				query.append(_FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(type);

				if (bindFunction) {
					qPos.add(function);
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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "aswmsgMessageQueue.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCID_TYPE_2 = "aswmsgMessageQueue.type = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_1 = "aswmsgMessageQueue.function IS NULL";
	private static final String _FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_2 = "aswmsgMessageQueue.function = ?";
	private static final String _FINDER_COLUMN_HOSOTHUTUCID_FUNCTION_3 = "(aswmsgMessageQueue.function IS NULL OR aswmsgMessageQueue.function = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			AswmsgMessageQueueModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.TYPE_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.FUNCTION_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYPHUID = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @return the matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByPhieuXuLyPhuId(long phieuXuLyPhuId,
		int type, String function) throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, type, function,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @return the range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByPhieuXuLyPhuId(long phieuXuLyPhuId,
		int type, String function, int start, int end)
		throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, type, function, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByPhieuXuLyPhuId(long phieuXuLyPhuId,
		int type, String function, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] { phieuXuLyPhuId, type, function };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] {
					phieuXuLyPhuId, type, function,
					
					start, end, orderByComparator
				};
		}

		List<AswmsgMessageQueue> list = (List<AswmsgMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AswmsgMessageQueue aswmsgMessageQueue : list) {
				if ((phieuXuLyPhuId != aswmsgMessageQueue.getPhieuXuLyPhuId()) ||
						(type != aswmsgMessageQueue.getType()) ||
						!Validator.equals(function,
							aswmsgMessageQueue.getFunction())) {
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

			query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_TYPE_2);

			boolean bindFunction = false;

			if (function == null) {
				query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_1);
			}
			else if (function.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_3);
			}
			else {
				bindFunction = true;

				query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				qPos.add(type);

				if (bindFunction) {
					qPos.add(function);
				}

				if (!pagination) {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgMessageQueue>(list);
				}
				else {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByPhieuXuLyPhuId_First(long phieuXuLyPhuId,
		int type, String function, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByPhieuXuLyPhuId_First(phieuXuLyPhuId,
				type, function, orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", function=");
		msg.append(function);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByPhieuXuLyPhuId_First(long phieuXuLyPhuId,
		int type, String function, OrderByComparator orderByComparator)
		throws SystemException {
		List<AswmsgMessageQueue> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				type, function, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByPhieuXuLyPhuId_Last(long phieuXuLyPhuId,
		int type, String function, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByPhieuXuLyPhuId_Last(phieuXuLyPhuId,
				type, function, orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", function=");
		msg.append(function);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByPhieuXuLyPhuId_Last(long phieuXuLyPhuId,
		int type, String function, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPhieuXuLyPhuId(phieuXuLyPhuId, type, function);

		if (count == 0) {
			return null;
		}

		List<AswmsgMessageQueue> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				type, function, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param id the primary key of the current aswmsg message queue
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue[] findByPhieuXuLyPhuId_PrevAndNext(long id,
		long phieuXuLyPhuId, int type, String function,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AswmsgMessageQueue[] array = new AswmsgMessageQueueImpl[3];

			array[0] = getByPhieuXuLyPhuId_PrevAndNext(session,
					aswmsgMessageQueue, phieuXuLyPhuId, type, function,
					orderByComparator, true);

			array[1] = aswmsgMessageQueue;

			array[2] = getByPhieuXuLyPhuId_PrevAndNext(session,
					aswmsgMessageQueue, phieuXuLyPhuId, type, function,
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

	protected AswmsgMessageQueue getByPhieuXuLyPhuId_PrevAndNext(
		Session session, AswmsgMessageQueue aswmsgMessageQueue,
		long phieuXuLyPhuId, int type, String function,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

		query.append(_FINDER_COLUMN_PHIEUXULYPHUID_TYPE_2);

		boolean bindFunction = false;

		if (function == null) {
			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_1);
		}
		else if (function.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_3);
		}
		else {
			bindFunction = true;

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_2);
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
			query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyPhuId);

		qPos.add(type);

		if (bindFunction) {
			qPos.add(function);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(aswmsgMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AswmsgMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId, int type,
		String function) throws SystemException {
		for (AswmsgMessageQueue aswmsgMessageQueue : findByPhieuXuLyPhuId(
				phieuXuLyPhuId, type, function, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(aswmsgMessageQueue);
		}
	}

	/**
	 * Returns the number of aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param type the type
	 * @param function the function
	 * @return the number of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId, int type,
		String function) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYPHUID;

		Object[] finderArgs = new Object[] { phieuXuLyPhuId, type, function };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_TYPE_2);

			boolean bindFunction = false;

			if (function == null) {
				query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_1);
			}
			else if (function.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_3);
			}
			else {
				bindFunction = true;

				query.append(_FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				qPos.add(type);

				if (bindFunction) {
					qPos.add(function);
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

	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2 = "aswmsgMessageQueue.phieuXuLyPhuId = ? AND ";
	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_TYPE_2 = "aswmsgMessageQueue.type = ? AND ";
	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_1 = "aswmsgMessageQueue.function IS NULL";
	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_2 = "aswmsgMessageQueue.function = ?";
	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_FUNCTION_3 = "(aswmsgMessageQueue.function IS NULL OR aswmsgMessageQueue.function = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLayPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLayPhieuXuLyPhuId", new String[] { Long.class.getName() },
			AswmsgMessageQueueModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LAYPHIEUXULYPHUID = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLayPhieuXuLyPhuId", new String[] { Long.class.getName() });

	/**
	 * Returns all the aswmsg message queues where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		return findByLayPhieuXuLyPhuId(phieuXuLyPhuId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg message queues where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @return the range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end) throws SystemException {
		return findByLayPhieuXuLyPhuId(phieuXuLyPhuId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg message queues where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID;
			finderArgs = new Object[] { phieuXuLyPhuId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID;
			finderArgs = new Object[] {
					phieuXuLyPhuId,
					
					start, end, orderByComparator
				};
		}

		List<AswmsgMessageQueue> list = (List<AswmsgMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AswmsgMessageQueue aswmsgMessageQueue : list) {
				if ((phieuXuLyPhuId != aswmsgMessageQueue.getPhieuXuLyPhuId())) {
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

			query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_LAYPHIEUXULYPHUID_PHIEUXULYPHUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				if (!pagination) {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgMessageQueue>(list);
				}
				else {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByLayPhieuXuLyPhuId_First(phieuXuLyPhuId,
				orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		List<AswmsgMessageQueue> list = findByLayPhieuXuLyPhuId(phieuXuLyPhuId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByLayPhieuXuLyPhuId_Last(phieuXuLyPhuId,
				orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByLayPhieuXuLyPhuId(phieuXuLyPhuId);

		if (count == 0) {
			return null;
		}

		List<AswmsgMessageQueue> list = findByLayPhieuXuLyPhuId(phieuXuLyPhuId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param id the primary key of the current aswmsg message queue
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue[] findByLayPhieuXuLyPhuId_PrevAndNext(long id,
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AswmsgMessageQueue[] array = new AswmsgMessageQueueImpl[3];

			array[0] = getByLayPhieuXuLyPhuId_PrevAndNext(session,
					aswmsgMessageQueue, phieuXuLyPhuId, orderByComparator, true);

			array[1] = aswmsgMessageQueue;

			array[2] = getByLayPhieuXuLyPhuId_PrevAndNext(session,
					aswmsgMessageQueue, phieuXuLyPhuId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AswmsgMessageQueue getByLayPhieuXuLyPhuId_PrevAndNext(
		Session session, AswmsgMessageQueue aswmsgMessageQueue,
		long phieuXuLyPhuId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

		query.append(_FINDER_COLUMN_LAYPHIEUXULYPHUID_PHIEUXULYPHUID_2);

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
			query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyPhuId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(aswmsgMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AswmsgMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the aswmsg message queues where phieuXuLyPhuId = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		for (AswmsgMessageQueue aswmsgMessageQueue : findByLayPhieuXuLyPhuId(
				phieuXuLyPhuId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(aswmsgMessageQueue);
		}
	}

	/**
	 * Returns the number of aswmsg message queues where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the number of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LAYPHIEUXULYPHUID;

		Object[] finderArgs = new Object[] { phieuXuLyPhuId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_LAYPHIEUXULYPHUID_PHIEUXULYPHUID_2);

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

	private static final String _FINDER_COLUMN_LAYPHIEUXULYPHUID_PHIEUXULYPHUID_2 =
		"aswmsgMessageQueue.phieuXuLyPhuId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LAYHOSOTHUTUCID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLayHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYHOSOTHUTUCID =
		new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLayHoSoThuTucId",
			new String[] { Long.class.getName() },
			AswmsgMessageQueueModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			AswmsgMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LAYHOSOTHUTUCID = new FinderPath(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLayHoSoThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the aswmsg message queues where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByLayHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByLayHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg message queues where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @return the range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByLayHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByLayHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg message queues where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findByLayHoSoThuTucId(long hoSoThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYHOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LAYHOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<AswmsgMessageQueue> list = (List<AswmsgMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AswmsgMessageQueue aswmsgMessageQueue : list) {
				if ((hoSoThuTucId != aswmsgMessageQueue.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_LAYHOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgMessageQueue>(list);
				}
				else {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByLayHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByLayHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByLayHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AswmsgMessageQueue> list = findByLayHoSoThuTucId(hoSoThuTucId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByLayHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByLayHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (aswmsgMessageQueue != null) {
			return aswmsgMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByLayHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLayHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<AswmsgMessageQueue> list = findByLayHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current aswmsg message queue
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue[] findByLayHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AswmsgMessageQueue[] array = new AswmsgMessageQueueImpl[3];

			array[0] = getByLayHoSoThuTucId_PrevAndNext(session,
					aswmsgMessageQueue, hoSoThuTucId, orderByComparator, true);

			array[1] = aswmsgMessageQueue;

			array[2] = getByLayHoSoThuTucId_PrevAndNext(session,
					aswmsgMessageQueue, hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AswmsgMessageQueue getByLayHoSoThuTucId_PrevAndNext(
		Session session, AswmsgMessageQueue aswmsgMessageQueue,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE);

		query.append(_FINDER_COLUMN_LAYHOSOTHUTUCID_HOSOTHUTUCID_2);

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
			query.append(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(aswmsgMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AswmsgMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the aswmsg message queues where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLayHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (AswmsgMessageQueue aswmsgMessageQueue : findByLayHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(aswmsgMessageQueue);
		}
	}

	/**
	 * Returns the number of aswmsg message queues where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLayHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LAYHOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASWMSGMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_LAYHOSOTHUTUCID_HOSOTHUTUCID_2);

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

	private static final String _FINDER_COLUMN_LAYHOSOTHUTUCID_HOSOTHUTUCID_2 = "aswmsgMessageQueue.hoSoThuTucId = ?";

	public AswmsgMessageQueuePersistenceImpl() {
		setModelClass(AswmsgMessageQueue.class);
	}

	/**
	 * Caches the aswmsg message queue in the entity cache if it is enabled.
	 *
	 * @param aswmsgMessageQueue the aswmsg message queue
	 */
	@Override
	public void cacheResult(AswmsgMessageQueue aswmsgMessageQueue) {
		EntityCacheUtil.putResult(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class, aswmsgMessageQueue.getPrimaryKey(),
			aswmsgMessageQueue);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
			new Object[] {
				aswmsgMessageQueue.getVersion(),
				aswmsgMessageQueue.getMessageId()
			}, aswmsgMessageQueue);

		aswmsgMessageQueue.resetOriginalValues();
	}

	/**
	 * Caches the aswmsg message queues in the entity cache if it is enabled.
	 *
	 * @param aswmsgMessageQueues the aswmsg message queues
	 */
	@Override
	public void cacheResult(List<AswmsgMessageQueue> aswmsgMessageQueues) {
		for (AswmsgMessageQueue aswmsgMessageQueue : aswmsgMessageQueues) {
			if (EntityCacheUtil.getResult(
						AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgMessageQueueImpl.class,
						aswmsgMessageQueue.getPrimaryKey()) == null) {
				cacheResult(aswmsgMessageQueue);
			}
			else {
				aswmsgMessageQueue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all aswmsg message queues.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AswmsgMessageQueueImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AswmsgMessageQueueImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the aswmsg message queue.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AswmsgMessageQueue aswmsgMessageQueue) {
		EntityCacheUtil.removeResult(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class, aswmsgMessageQueue.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(aswmsgMessageQueue);
	}

	@Override
	public void clearCache(List<AswmsgMessageQueue> aswmsgMessageQueues) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AswmsgMessageQueue aswmsgMessageQueue : aswmsgMessageQueues) {
			EntityCacheUtil.removeResult(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgMessageQueueImpl.class, aswmsgMessageQueue.getPrimaryKey());

			clearUniqueFindersCache(aswmsgMessageQueue);
		}
	}

	protected void cacheUniqueFindersCache(
		AswmsgMessageQueue aswmsgMessageQueue) {
		if (aswmsgMessageQueue.isNew()) {
			Object[] args = new Object[] {
					aswmsgMessageQueue.getVersion(),
					aswmsgMessageQueue.getMessageId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
				args, aswmsgMessageQueue);
		}
		else {
			AswmsgMessageQueueModelImpl aswmsgMessageQueueModelImpl = (AswmsgMessageQueueModelImpl)aswmsgMessageQueue;

			if ((aswmsgMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgMessageQueue.getVersion(),
						aswmsgMessageQueue.getMessageId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
					args, aswmsgMessageQueue);
			}
		}
	}

	protected void clearUniqueFindersCache(
		AswmsgMessageQueue aswmsgMessageQueue) {
		AswmsgMessageQueueModelImpl aswmsgMessageQueueModelImpl = (AswmsgMessageQueueModelImpl)aswmsgMessageQueue;

		Object[] args = new Object[] {
				aswmsgMessageQueue.getVersion(),
				aswmsgMessageQueue.getMessageId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
			args);

		if ((aswmsgMessageQueueModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					aswmsgMessageQueueModelImpl.getOriginalVersion(),
					aswmsgMessageQueueModelImpl.getOriginalMessageId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
				args);
		}
	}

	/**
	 * Creates a new aswmsg message queue with the primary key. Does not add the aswmsg message queue to the database.
	 *
	 * @param id the primary key for the new aswmsg message queue
	 * @return the new aswmsg message queue
	 */
	@Override
	public AswmsgMessageQueue create(long id) {
		AswmsgMessageQueue aswmsgMessageQueue = new AswmsgMessageQueueImpl();

		aswmsgMessageQueue.setNew(true);
		aswmsgMessageQueue.setPrimaryKey(id);

		return aswmsgMessageQueue;
	}

	/**
	 * Removes the aswmsg message queue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the aswmsg message queue
	 * @return the aswmsg message queue that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue remove(long id)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the aswmsg message queue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the aswmsg message queue
	 * @return the aswmsg message queue that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue remove(Serializable primaryKey)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AswmsgMessageQueue aswmsgMessageQueue = (AswmsgMessageQueue)session.get(AswmsgMessageQueueImpl.class,
					primaryKey);

			if (aswmsgMessageQueue == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAswmsgMessageQueueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(aswmsgMessageQueue);
		}
		catch (NoSuchAswmsgMessageQueueException nsee) {
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
	protected AswmsgMessageQueue removeImpl(
		AswmsgMessageQueue aswmsgMessageQueue) throws SystemException {
		aswmsgMessageQueue = toUnwrappedModel(aswmsgMessageQueue);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(aswmsgMessageQueue)) {
				aswmsgMessageQueue = (AswmsgMessageQueue)session.get(AswmsgMessageQueueImpl.class,
						aswmsgMessageQueue.getPrimaryKeyObj());
			}

			if (aswmsgMessageQueue != null) {
				session.delete(aswmsgMessageQueue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (aswmsgMessageQueue != null) {
			clearCache(aswmsgMessageQueue);
		}

		return aswmsgMessageQueue;
	}

	@Override
	public AswmsgMessageQueue updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue)
		throws SystemException {
		aswmsgMessageQueue = toUnwrappedModel(aswmsgMessageQueue);

		boolean isNew = aswmsgMessageQueue.isNew();

		AswmsgMessageQueueModelImpl aswmsgMessageQueueModelImpl = (AswmsgMessageQueueModelImpl)aswmsgMessageQueue;

		Session session = null;

		try {
			session = openSession();

			if (aswmsgMessageQueue.isNew()) {
				session.save(aswmsgMessageQueue);

				aswmsgMessageQueue.setNew(false);
			}
			else {
				session.merge(aswmsgMessageQueue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AswmsgMessageQueueModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((aswmsgMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgMessageQueueModelImpl.getOriginalMessageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);

				args = new Object[] { aswmsgMessageQueueModelImpl.getMessageId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);
			}

			if ((aswmsgMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgMessageQueueModelImpl.getOriginalHoSoThuTucId(),
						aswmsgMessageQueueModelImpl.getOriginalType(),
						aswmsgMessageQueueModelImpl.getOriginalFunction()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						aswmsgMessageQueueModelImpl.getHoSoThuTucId(),
						aswmsgMessageQueueModelImpl.getType(),
						aswmsgMessageQueueModelImpl.getFunction()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((aswmsgMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgMessageQueueModelImpl.getOriginalPhieuXuLyPhuId(),
						aswmsgMessageQueueModelImpl.getOriginalType(),
						aswmsgMessageQueueModelImpl.getOriginalFunction()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);

				args = new Object[] {
						aswmsgMessageQueueModelImpl.getPhieuXuLyPhuId(),
						aswmsgMessageQueueModelImpl.getType(),
						aswmsgMessageQueueModelImpl.getFunction()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);
			}

			if ((aswmsgMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgMessageQueueModelImpl.getOriginalPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYPHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID,
					args);

				args = new Object[] {
						aswmsgMessageQueueModelImpl.getPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYPHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID,
					args);
			}

			if ((aswmsgMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYHOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgMessageQueueModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYHOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYHOSOTHUTUCID,
					args);

				args = new Object[] {
						aswmsgMessageQueueModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYHOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYHOSOTHUTUCID,
					args);
			}
		}

		EntityCacheUtil.putResult(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageQueueImpl.class, aswmsgMessageQueue.getPrimaryKey(),
			aswmsgMessageQueue);

		clearUniqueFindersCache(aswmsgMessageQueue);
		cacheUniqueFindersCache(aswmsgMessageQueue);

		return aswmsgMessageQueue;
	}

	protected AswmsgMessageQueue toUnwrappedModel(
		AswmsgMessageQueue aswmsgMessageQueue) {
		if (aswmsgMessageQueue instanceof AswmsgMessageQueueImpl) {
			return aswmsgMessageQueue;
		}

		AswmsgMessageQueueImpl aswmsgMessageQueueImpl = new AswmsgMessageQueueImpl();

		aswmsgMessageQueueImpl.setNew(aswmsgMessageQueue.isNew());
		aswmsgMessageQueueImpl.setPrimaryKey(aswmsgMessageQueue.getPrimaryKey());

		aswmsgMessageQueueImpl.setId(aswmsgMessageQueue.getId());
		aswmsgMessageQueueImpl.setVersion(aswmsgMessageQueue.getVersion());
		aswmsgMessageQueueImpl.setMessageId(aswmsgMessageQueue.getMessageId());
		aswmsgMessageQueueImpl.setSenderName(aswmsgMessageQueue.getSenderName());
		aswmsgMessageQueueImpl.setSenderIdentity(aswmsgMessageQueue.getSenderIdentity());
		aswmsgMessageQueueImpl.setSenderCountryCode(aswmsgMessageQueue.getSenderCountryCode());
		aswmsgMessageQueueImpl.setSenderMinistryCode(aswmsgMessageQueue.getSenderMinistryCode());
		aswmsgMessageQueueImpl.setSenderOrganizationCode(aswmsgMessageQueue.getSenderOrganizationCode());
		aswmsgMessageQueueImpl.setSenderUnitCode(aswmsgMessageQueue.getSenderUnitCode());
		aswmsgMessageQueueImpl.setReceiverName(aswmsgMessageQueue.getReceiverName());
		aswmsgMessageQueueImpl.setReceiverIdentity(aswmsgMessageQueue.getReceiverIdentity());
		aswmsgMessageQueueImpl.setReceiverCountryCode(aswmsgMessageQueue.getReceiverCountryCode());
		aswmsgMessageQueueImpl.setReceiverMinistryCode(aswmsgMessageQueue.getReceiverMinistryCode());
		aswmsgMessageQueueImpl.setReceiverOrganizationCode(aswmsgMessageQueue.getReceiverOrganizationCode());
		aswmsgMessageQueueImpl.setReceiverUnitCode(aswmsgMessageQueue.getReceiverUnitCode());
		aswmsgMessageQueueImpl.setDocumentType(aswmsgMessageQueue.getDocumentType());
		aswmsgMessageQueueImpl.setType(aswmsgMessageQueue.getType());
		aswmsgMessageQueueImpl.setFunction(aswmsgMessageQueue.getFunction());
		aswmsgMessageQueueImpl.setReference(aswmsgMessageQueue.getReference());
		aswmsgMessageQueueImpl.setPreReference(aswmsgMessageQueue.getPreReference());
		aswmsgMessageQueueImpl.setDocumentYear(aswmsgMessageQueue.getDocumentYear());
		aswmsgMessageQueueImpl.setSendDate(aswmsgMessageQueue.getSendDate());
		aswmsgMessageQueueImpl.setSignature(aswmsgMessageQueue.getSignature());
		aswmsgMessageQueueImpl.setSystemSignature(aswmsgMessageQueue.getSystemSignature());
		aswmsgMessageQueueImpl.setAllContent(aswmsgMessageQueue.getAllContent());
		aswmsgMessageQueueImpl.setCreatedTime(aswmsgMessageQueue.getCreatedTime());
		aswmsgMessageQueueImpl.setWebservice(aswmsgMessageQueue.getWebservice());
		aswmsgMessageQueueImpl.setValidated(aswmsgMessageQueue.getValidated());
		aswmsgMessageQueueImpl.setPriority(aswmsgMessageQueue.getPriority());
		aswmsgMessageQueueImpl.setDescription(aswmsgMessageQueue.getDescription());
		aswmsgMessageQueueImpl.setValidationCode(aswmsgMessageQueue.getValidationCode());
		aswmsgMessageQueueImpl.setSoLanGui(aswmsgMessageQueue.getSoLanGui());
		aswmsgMessageQueueImpl.setHoSoThuTucId(aswmsgMessageQueue.getHoSoThuTucId());
		aswmsgMessageQueueImpl.setPhieuXuLyPhuId(aswmsgMessageQueue.getPhieuXuLyPhuId());

		return aswmsgMessageQueueImpl;
	}

	/**
	 * Returns the aswmsg message queue with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg message queue
	 * @return the aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = fetchByPrimaryKey(primaryKey);

		if (aswmsgMessageQueue == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAswmsgMessageQueueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return aswmsgMessageQueue;
	}

	/**
	 * Returns the aswmsg message queue with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException} if it could not be found.
	 *
	 * @param id the primary key of the aswmsg message queue
	 * @return the aswmsg message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue findByPrimaryKey(long id)
		throws NoSuchAswmsgMessageQueueException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the aswmsg message queue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg message queue
	 * @return the aswmsg message queue, or <code>null</code> if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AswmsgMessageQueue aswmsgMessageQueue = (AswmsgMessageQueue)EntityCacheUtil.getResult(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgMessageQueueImpl.class, primaryKey);

		if (aswmsgMessageQueue == _nullAswmsgMessageQueue) {
			return null;
		}

		if (aswmsgMessageQueue == null) {
			Session session = null;

			try {
				session = openSession();

				aswmsgMessageQueue = (AswmsgMessageQueue)session.get(AswmsgMessageQueueImpl.class,
						primaryKey);

				if (aswmsgMessageQueue != null) {
					cacheResult(aswmsgMessageQueue);
				}
				else {
					EntityCacheUtil.putResult(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgMessageQueueImpl.class, primaryKey,
						_nullAswmsgMessageQueue);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AswmsgMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
					AswmsgMessageQueueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return aswmsgMessageQueue;
	}

	/**
	 * Returns the aswmsg message queue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the aswmsg message queue
	 * @return the aswmsg message queue, or <code>null</code> if a aswmsg message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageQueue fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the aswmsg message queues.
	 *
	 * @return the aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg message queues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @return the range of aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg message queues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg message queues
	 * @param end the upper bound of the range of aswmsg message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of aswmsg message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageQueue> findAll(int start, int end,
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

		List<AswmsgMessageQueue> list = (List<AswmsgMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASWMSGMESSAGEQUEUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASWMSGMESSAGEQUEUE;

				if (pagination) {
					sql = sql.concat(AswmsgMessageQueueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgMessageQueue>(list);
				}
				else {
					list = (List<AswmsgMessageQueue>)QueryUtil.list(q,
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
	 * Removes all the aswmsg message queues from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AswmsgMessageQueue aswmsgMessageQueue : findAll()) {
			remove(aswmsgMessageQueue);
		}
	}

	/**
	 * Returns the number of aswmsg message queues.
	 *
	 * @return the number of aswmsg message queues
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

				Query q = session.createQuery(_SQL_COUNT_ASWMSGMESSAGEQUEUE);

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
	 * Initializes the aswmsg message queue persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AswmsgMessageQueue>> listenersList = new ArrayList<ModelListener<AswmsgMessageQueue>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AswmsgMessageQueue>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AswmsgMessageQueueImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASWMSGMESSAGEQUEUE = "SELECT aswmsgMessageQueue FROM AswmsgMessageQueue aswmsgMessageQueue";
	private static final String _SQL_SELECT_ASWMSGMESSAGEQUEUE_WHERE = "SELECT aswmsgMessageQueue FROM AswmsgMessageQueue aswmsgMessageQueue WHERE ";
	private static final String _SQL_COUNT_ASWMSGMESSAGEQUEUE = "SELECT COUNT(aswmsgMessageQueue) FROM AswmsgMessageQueue aswmsgMessageQueue";
	private static final String _SQL_COUNT_ASWMSGMESSAGEQUEUE_WHERE = "SELECT COUNT(aswmsgMessageQueue) FROM AswmsgMessageQueue aswmsgMessageQueue WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "aswmsgMessageQueue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AswmsgMessageQueue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AswmsgMessageQueue exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AswmsgMessageQueuePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"senderName", "senderIdentity", "senderCountryCode",
				"senderMinistryCode", "senderOrganizationCode", "senderUnitCode",
				"receiverName", "receiverIdentity", "receiverCountryCode",
				"receiverMinistryCode", "receiverOrganizationCode",
				"receiverUnitCode", "documentType", "preReference",
				"documentYear", "sendDate", "systemSignature", "allContent",
				"createdTime", "validationCode", "soLanGui"
			});
	private static AswmsgMessageQueue _nullAswmsgMessageQueue = new AswmsgMessageQueueImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AswmsgMessageQueue> toCacheModel() {
				return _nullAswmsgMessageQueueCacheModel;
			}
		};

	private static CacheModel<AswmsgMessageQueue> _nullAswmsgMessageQueueCacheModel =
		new CacheModel<AswmsgMessageQueue>() {
			@Override
			public AswmsgMessageQueue toEntityModel() {
				return _nullAswmsgMessageQueue;
			}
		};
}