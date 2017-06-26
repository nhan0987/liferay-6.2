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

import vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException;
import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueImpl;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the monitor message queue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MonitorMessageQueuePersistence
 * @see MonitorMessageQueueUtil
 * @generated
 */
public class MonitorMessageQueuePersistenceImpl extends BasePersistenceImpl<MonitorMessageQueue>
	implements MonitorMessageQueuePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MonitorMessageQueueUtil} to access the monitor message queue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MonitorMessageQueueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMessageId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMessageId",
			new String[] { String.class.getName() },
			MonitorMessageQueueModelImpl.MESSAGEID_COLUMN_BITMASK |
			MonitorMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MESSAGEID = new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMessageId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the monitor message queues where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByMessageId(String messageId)
		throws SystemException {
		return findByMessageId(messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the monitor message queues where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @return the range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByMessageId(String messageId,
		int start, int end) throws SystemException {
		return findByMessageId(messageId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the monitor message queues where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByMessageId(String messageId,
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

		List<MonitorMessageQueue> list = (List<MonitorMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MonitorMessageQueue monitorMessageQueue : list) {
				if (!Validator.equals(messageId,
							monitorMessageQueue.getMessageId())) {
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

			query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

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
				query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
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
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MonitorMessageQueue>(list);
				}
				else {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first monitor message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByMessageId_First(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByMessageId_First(messageId,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first monitor message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByMessageId_First(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MonitorMessageQueue> list = findByMessageId(messageId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last monitor message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByMessageId_Last(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByMessageId_Last(messageId,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last monitor message queue in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByMessageId_Last(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMessageId(messageId);

		if (count == 0) {
			return null;
		}

		List<MonitorMessageQueue> list = findByMessageId(messageId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the monitor message queues before and after the current monitor message queue in the ordered set where messageId = &#63;.
	 *
	 * @param id the primary key of the current monitor message queue
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue[] findByMessageId_PrevAndNext(long id,
		String messageId, OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MonitorMessageQueue[] array = new MonitorMessageQueueImpl[3];

			array[0] = getByMessageId_PrevAndNext(session, monitorMessageQueue,
					messageId, orderByComparator, true);

			array[1] = monitorMessageQueue;

			array[2] = getByMessageId_PrevAndNext(session, monitorMessageQueue,
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

	protected MonitorMessageQueue getByMessageId_PrevAndNext(Session session,
		MonitorMessageQueue monitorMessageQueue, String messageId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

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
			query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(monitorMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MonitorMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the monitor message queues where messageId = &#63; from the database.
	 *
	 * @param messageId the message ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMessageId(String messageId) throws SystemException {
		for (MonitorMessageQueue monitorMessageQueue : findByMessageId(
				messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(monitorMessageQueue);
		}
	}

	/**
	 * Returns the number of monitor message queues where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the number of matching monitor message queues
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

			query.append(_SQL_COUNT_MONITORMESSAGEQUEUE_WHERE);

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

	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_1 = "monitorMessageQueue.messageId IS NULL";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_2 = "monitorMessageQueue.messageId = ?";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_3 = "(monitorMessageQueue.messageId IS NULL OR monitorMessageQueue.messageId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			MonitorMessageQueueModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			MonitorMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the monitor message queues where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the monitor message queues where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @return the range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the monitor message queues where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByHoSoThuTucId(long hoSoThuTucId,
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

		List<MonitorMessageQueue> list = (List<MonitorMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MonitorMessageQueue monitorMessageQueue : list) {
				if ((hoSoThuTucId != monitorMessageQueue.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MonitorMessageQueue>(list);
				}
				else {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MonitorMessageQueue> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<MonitorMessageQueue> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the monitor message queues before and after the current monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current monitor message queue
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MonitorMessageQueue[] array = new MonitorMessageQueueImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					monitorMessageQueue, hoSoThuTucId, orderByComparator, true);

			array[1] = monitorMessageQueue;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					monitorMessageQueue, hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MonitorMessageQueue getByHoSoThuTucId_PrevAndNext(
		Session session, MonitorMessageQueue monitorMessageQueue,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

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
			query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(monitorMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MonitorMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the monitor message queues where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (MonitorMessageQueue monitorMessageQueue : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(monitorMessageQueue);
		}
	}

	/**
	 * Returns the number of monitor message queues where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching monitor message queues
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

			query.append(_SQL_COUNT_MONITORMESSAGEQUEUE_WHERE);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "monitorMessageQueue.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLayPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLayPhieuXuLyPhuId", new String[] { Long.class.getName() },
			MonitorMessageQueueModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK |
			MonitorMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LAYPHIEUXULYPHUID = new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLayPhieuXuLyPhuId", new String[] { Long.class.getName() });

	/**
	 * Returns all the monitor message queues where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId) throws SystemException {
		return findByLayPhieuXuLyPhuId(phieuXuLyPhuId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the monitor message queues where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @return the range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end) throws SystemException {
		return findByLayPhieuXuLyPhuId(phieuXuLyPhuId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the monitor message queues where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByLayPhieuXuLyPhuId(
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

		List<MonitorMessageQueue> list = (List<MonitorMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MonitorMessageQueue monitorMessageQueue : list) {
				if ((phieuXuLyPhuId != monitorMessageQueue.getPhieuXuLyPhuId())) {
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

			query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

			query.append(_FINDER_COLUMN_LAYPHIEUXULYPHUID_PHIEUXULYPHUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				if (!pagination) {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MonitorMessageQueue>(list);
				}
				else {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByLayPhieuXuLyPhuId_First(phieuXuLyPhuId,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MonitorMessageQueue> list = findByLayPhieuXuLyPhuId(phieuXuLyPhuId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByLayPhieuXuLyPhuId_Last(phieuXuLyPhuId,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByLayPhieuXuLyPhuId(phieuXuLyPhuId);

		if (count == 0) {
			return null;
		}

		List<MonitorMessageQueue> list = findByLayPhieuXuLyPhuId(phieuXuLyPhuId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the monitor message queues before and after the current monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param id the primary key of the current monitor message queue
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue[] findByLayPhieuXuLyPhuId_PrevAndNext(long id,
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MonitorMessageQueue[] array = new MonitorMessageQueueImpl[3];

			array[0] = getByLayPhieuXuLyPhuId_PrevAndNext(session,
					monitorMessageQueue, phieuXuLyPhuId, orderByComparator, true);

			array[1] = monitorMessageQueue;

			array[2] = getByLayPhieuXuLyPhuId_PrevAndNext(session,
					monitorMessageQueue, phieuXuLyPhuId, orderByComparator,
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

	protected MonitorMessageQueue getByLayPhieuXuLyPhuId_PrevAndNext(
		Session session, MonitorMessageQueue monitorMessageQueue,
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

		query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

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
			query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyPhuId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(monitorMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MonitorMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the monitor message queues where phieuXuLyPhuId = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		for (MonitorMessageQueue monitorMessageQueue : findByLayPhieuXuLyPhuId(
				phieuXuLyPhuId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(monitorMessageQueue);
		}
	}

	/**
	 * Returns the number of monitor message queues where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the number of matching monitor message queues
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

			query.append(_SQL_COUNT_MONITORMESSAGEQUEUE_WHERE);

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
		"monitorMessageQueue.phieuXuLyPhuId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LAYMESSAGEID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLayMessageId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYMESSAGEID =
		new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED,
			MonitorMessageQueueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLayMessageId",
			new String[] { String.class.getName() },
			MonitorMessageQueueModelImpl.DOCUMENTTYPE_COLUMN_BITMASK |
			MonitorMessageQueueModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LAYMESSAGEID = new FinderPath(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLayMessageId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the monitor message queues where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByLayMessageId(String documentType)
		throws SystemException {
		return findByLayMessageId(documentType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the monitor message queues where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @return the range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByLayMessageId(String documentType,
		int start, int end) throws SystemException {
		return findByLayMessageId(documentType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the monitor message queues where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findByLayMessageId(String documentType,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYMESSAGEID;
			finderArgs = new Object[] { documentType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LAYMESSAGEID;
			finderArgs = new Object[] {
					documentType,
					
					start, end, orderByComparator
				};
		}

		List<MonitorMessageQueue> list = (List<MonitorMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MonitorMessageQueue monitorMessageQueue : list) {
				if (!Validator.equals(documentType,
							monitorMessageQueue.getDocumentType())) {
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

			query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
				}

				if (!pagination) {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MonitorMessageQueue>(list);
				}
				else {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
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
	 * Returns the first monitor message queue in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByLayMessageId_First(String documentType,
		OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByLayMessageId_First(documentType,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentType=");
		msg.append(documentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the first monitor message queue in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByLayMessageId_First(String documentType,
		OrderByComparator orderByComparator) throws SystemException {
		List<MonitorMessageQueue> list = findByLayMessageId(documentType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last monitor message queue in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByLayMessageId_Last(String documentType,
		OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByLayMessageId_Last(documentType,
				orderByComparator);

		if (monitorMessageQueue != null) {
			return monitorMessageQueue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentType=");
		msg.append(documentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMonitorMessageQueueException(msg.toString());
	}

	/**
	 * Returns the last monitor message queue in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monitor message queue, or <code>null</code> if a matching monitor message queue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByLayMessageId_Last(String documentType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLayMessageId(documentType);

		if (count == 0) {
			return null;
		}

		List<MonitorMessageQueue> list = findByLayMessageId(documentType,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the monitor message queues before and after the current monitor message queue in the ordered set where documentType = &#63;.
	 *
	 * @param id the primary key of the current monitor message queue
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue[] findByLayMessageId_PrevAndNext(long id,
		String documentType, OrderByComparator orderByComparator)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MonitorMessageQueue[] array = new MonitorMessageQueueImpl[3];

			array[0] = getByLayMessageId_PrevAndNext(session,
					monitorMessageQueue, documentType, orderByComparator, true);

			array[1] = monitorMessageQueue;

			array[2] = getByLayMessageId_PrevAndNext(session,
					monitorMessageQueue, documentType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MonitorMessageQueue getByLayMessageId_PrevAndNext(
		Session session, MonitorMessageQueue monitorMessageQueue,
		String documentType, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MONITORMESSAGEQUEUE_WHERE);

		boolean bindDocumentType = false;

		if (documentType == null) {
			query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_1);
		}
		else if (documentType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_3);
		}
		else {
			bindDocumentType = true;

			query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_2);
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
			query.append(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDocumentType) {
			qPos.add(documentType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(monitorMessageQueue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MonitorMessageQueue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the monitor message queues where documentType = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLayMessageId(String documentType)
		throws SystemException {
		for (MonitorMessageQueue monitorMessageQueue : findByLayMessageId(
				documentType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(monitorMessageQueue);
		}
	}

	/**
	 * Returns the number of monitor message queues where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the number of matching monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLayMessageId(String documentType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LAYMESSAGEID;

		Object[] finderArgs = new Object[] { documentType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MONITORMESSAGEQUEUE_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
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

	private static final String _FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_1 = "monitorMessageQueue.documentType IS NULL";
	private static final String _FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_2 = "monitorMessageQueue.documentType = ?";
	private static final String _FINDER_COLUMN_LAYMESSAGEID_DOCUMENTTYPE_3 = "(monitorMessageQueue.documentType IS NULL OR monitorMessageQueue.documentType = '')";

	public MonitorMessageQueuePersistenceImpl() {
		setModelClass(MonitorMessageQueue.class);
	}

	/**
	 * Caches the monitor message queue in the entity cache if it is enabled.
	 *
	 * @param monitorMessageQueue the monitor message queue
	 */
	@Override
	public void cacheResult(MonitorMessageQueue monitorMessageQueue) {
		EntityCacheUtil.putResult(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueImpl.class, monitorMessageQueue.getPrimaryKey(),
			monitorMessageQueue);

		monitorMessageQueue.resetOriginalValues();
	}

	/**
	 * Caches the monitor message queues in the entity cache if it is enabled.
	 *
	 * @param monitorMessageQueues the monitor message queues
	 */
	@Override
	public void cacheResult(List<MonitorMessageQueue> monitorMessageQueues) {
		for (MonitorMessageQueue monitorMessageQueue : monitorMessageQueues) {
			if (EntityCacheUtil.getResult(
						MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
						MonitorMessageQueueImpl.class,
						monitorMessageQueue.getPrimaryKey()) == null) {
				cacheResult(monitorMessageQueue);
			}
			else {
				monitorMessageQueue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all monitor message queues.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MonitorMessageQueueImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MonitorMessageQueueImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the monitor message queue.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MonitorMessageQueue monitorMessageQueue) {
		EntityCacheUtil.removeResult(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueImpl.class, monitorMessageQueue.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MonitorMessageQueue> monitorMessageQueues) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MonitorMessageQueue monitorMessageQueue : monitorMessageQueues) {
			EntityCacheUtil.removeResult(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
				MonitorMessageQueueImpl.class,
				monitorMessageQueue.getPrimaryKey());
		}
	}

	/**
	 * Creates a new monitor message queue with the primary key. Does not add the monitor message queue to the database.
	 *
	 * @param id the primary key for the new monitor message queue
	 * @return the new monitor message queue
	 */
	@Override
	public MonitorMessageQueue create(long id) {
		MonitorMessageQueue monitorMessageQueue = new MonitorMessageQueueImpl();

		monitorMessageQueue.setNew(true);
		monitorMessageQueue.setPrimaryKey(id);

		return monitorMessageQueue;
	}

	/**
	 * Removes the monitor message queue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the monitor message queue
	 * @return the monitor message queue that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue remove(long id)
		throws NoSuchMonitorMessageQueueException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the monitor message queue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the monitor message queue
	 * @return the monitor message queue that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue remove(Serializable primaryKey)
		throws NoSuchMonitorMessageQueueException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MonitorMessageQueue monitorMessageQueue = (MonitorMessageQueue)session.get(MonitorMessageQueueImpl.class,
					primaryKey);

			if (monitorMessageQueue == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMonitorMessageQueueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(monitorMessageQueue);
		}
		catch (NoSuchMonitorMessageQueueException nsee) {
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
	protected MonitorMessageQueue removeImpl(
		MonitorMessageQueue monitorMessageQueue) throws SystemException {
		monitorMessageQueue = toUnwrappedModel(monitorMessageQueue);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(monitorMessageQueue)) {
				monitorMessageQueue = (MonitorMessageQueue)session.get(MonitorMessageQueueImpl.class,
						monitorMessageQueue.getPrimaryKeyObj());
			}

			if (monitorMessageQueue != null) {
				session.delete(monitorMessageQueue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (monitorMessageQueue != null) {
			clearCache(monitorMessageQueue);
		}

		return monitorMessageQueue;
	}

	@Override
	public MonitorMessageQueue updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue monitorMessageQueue)
		throws SystemException {
		monitorMessageQueue = toUnwrappedModel(monitorMessageQueue);

		boolean isNew = monitorMessageQueue.isNew();

		MonitorMessageQueueModelImpl monitorMessageQueueModelImpl = (MonitorMessageQueueModelImpl)monitorMessageQueue;

		Session session = null;

		try {
			session = openSession();

			if (monitorMessageQueue.isNew()) {
				session.save(monitorMessageQueue);

				monitorMessageQueue.setNew(false);
			}
			else {
				session.merge(monitorMessageQueue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MonitorMessageQueueModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((monitorMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						monitorMessageQueueModelImpl.getOriginalMessageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);

				args = new Object[] { monitorMessageQueueModelImpl.getMessageId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);
			}

			if ((monitorMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						monitorMessageQueueModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						monitorMessageQueueModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((monitorMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						monitorMessageQueueModelImpl.getOriginalPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYPHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID,
					args);

				args = new Object[] {
						monitorMessageQueueModelImpl.getPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYPHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYPHIEUXULYPHUID,
					args);
			}

			if ((monitorMessageQueueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYMESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						monitorMessageQueueModelImpl.getOriginalDocumentType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYMESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYMESSAGEID,
					args);

				args = new Object[] {
						monitorMessageQueueModelImpl.getDocumentType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LAYMESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LAYMESSAGEID,
					args);
			}
		}

		EntityCacheUtil.putResult(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
			MonitorMessageQueueImpl.class, monitorMessageQueue.getPrimaryKey(),
			monitorMessageQueue);

		return monitorMessageQueue;
	}

	protected MonitorMessageQueue toUnwrappedModel(
		MonitorMessageQueue monitorMessageQueue) {
		if (monitorMessageQueue instanceof MonitorMessageQueueImpl) {
			return monitorMessageQueue;
		}

		MonitorMessageQueueImpl monitorMessageQueueImpl = new MonitorMessageQueueImpl();

		monitorMessageQueueImpl.setNew(monitorMessageQueue.isNew());
		monitorMessageQueueImpl.setPrimaryKey(monitorMessageQueue.getPrimaryKey());

		monitorMessageQueueImpl.setId(monitorMessageQueue.getId());
		monitorMessageQueueImpl.setVersion(monitorMessageQueue.getVersion());
		monitorMessageQueueImpl.setMessageId(monitorMessageQueue.getMessageId());
		monitorMessageQueueImpl.setSenderName(monitorMessageQueue.getSenderName());
		monitorMessageQueueImpl.setSenderIdentity(monitorMessageQueue.getSenderIdentity());
		monitorMessageQueueImpl.setSenderCountryCode(monitorMessageQueue.getSenderCountryCode());
		monitorMessageQueueImpl.setSenderMinistryCode(monitorMessageQueue.getSenderMinistryCode());
		monitorMessageQueueImpl.setSenderOrganizationCode(monitorMessageQueue.getSenderOrganizationCode());
		monitorMessageQueueImpl.setSenderUnitCode(monitorMessageQueue.getSenderUnitCode());
		monitorMessageQueueImpl.setReceiverName(monitorMessageQueue.getReceiverName());
		monitorMessageQueueImpl.setReceiverIdentity(monitorMessageQueue.getReceiverIdentity());
		monitorMessageQueueImpl.setReceiverCountryCode(monitorMessageQueue.getReceiverCountryCode());
		monitorMessageQueueImpl.setReceiverMinistryCode(monitorMessageQueue.getReceiverMinistryCode());
		monitorMessageQueueImpl.setReceiverOrganizationCode(monitorMessageQueue.getReceiverOrganizationCode());
		monitorMessageQueueImpl.setReceiverUnitCode(monitorMessageQueue.getReceiverUnitCode());
		monitorMessageQueueImpl.setDocumentType(monitorMessageQueue.getDocumentType());
		monitorMessageQueueImpl.setType(monitorMessageQueue.getType());
		monitorMessageQueueImpl.setFunction(monitorMessageQueue.getFunction());
		monitorMessageQueueImpl.setReference(monitorMessageQueue.getReference());
		monitorMessageQueueImpl.setPreReference(monitorMessageQueue.getPreReference());
		monitorMessageQueueImpl.setDocumentYear(monitorMessageQueue.getDocumentYear());
		monitorMessageQueueImpl.setSendDate(monitorMessageQueue.getSendDate());
		monitorMessageQueueImpl.setCreatedTime(monitorMessageQueue.getCreatedTime());
		monitorMessageQueueImpl.setWebservice(monitorMessageQueue.getWebservice());
		monitorMessageQueueImpl.setValidated(monitorMessageQueue.getValidated());
		monitorMessageQueueImpl.setPriority(monitorMessageQueue.getPriority());
		monitorMessageQueueImpl.setDescription(monitorMessageQueue.getDescription());
		monitorMessageQueueImpl.setValidationCode(monitorMessageQueue.getValidationCode());
		monitorMessageQueueImpl.setSoLanGui(monitorMessageQueue.getSoLanGui());
		monitorMessageQueueImpl.setHoSoThuTucId(monitorMessageQueue.getHoSoThuTucId());
		monitorMessageQueueImpl.setPhieuXuLyPhuId(monitorMessageQueue.getPhieuXuLyPhuId());

		return monitorMessageQueueImpl;
	}

	/**
	 * Returns the monitor message queue with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the monitor message queue
	 * @return the monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMonitorMessageQueueException, SystemException {
		MonitorMessageQueue monitorMessageQueue = fetchByPrimaryKey(primaryKey);

		if (monitorMessageQueue == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMonitorMessageQueueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return monitorMessageQueue;
	}

	/**
	 * Returns the monitor message queue with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException} if it could not be found.
	 *
	 * @param id the primary key of the monitor message queue
	 * @return the monitor message queue
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue findByPrimaryKey(long id)
		throws NoSuchMonitorMessageQueueException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the monitor message queue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the monitor message queue
	 * @return the monitor message queue, or <code>null</code> if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MonitorMessageQueue monitorMessageQueue = (MonitorMessageQueue)EntityCacheUtil.getResult(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
				MonitorMessageQueueImpl.class, primaryKey);

		if (monitorMessageQueue == _nullMonitorMessageQueue) {
			return null;
		}

		if (monitorMessageQueue == null) {
			Session session = null;

			try {
				session = openSession();

				monitorMessageQueue = (MonitorMessageQueue)session.get(MonitorMessageQueueImpl.class,
						primaryKey);

				if (monitorMessageQueue != null) {
					cacheResult(monitorMessageQueue);
				}
				else {
					EntityCacheUtil.putResult(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
						MonitorMessageQueueImpl.class, primaryKey,
						_nullMonitorMessageQueue);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MonitorMessageQueueModelImpl.ENTITY_CACHE_ENABLED,
					MonitorMessageQueueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return monitorMessageQueue;
	}

	/**
	 * Returns the monitor message queue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the monitor message queue
	 * @return the monitor message queue, or <code>null</code> if a monitor message queue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MonitorMessageQueue fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the monitor message queues.
	 *
	 * @return the monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the monitor message queues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @return the range of monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the monitor message queues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of monitor message queues
	 * @param end the upper bound of the range of monitor message queues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of monitor message queues
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MonitorMessageQueue> findAll(int start, int end,
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

		List<MonitorMessageQueue> list = (List<MonitorMessageQueue>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MONITORMESSAGEQUEUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MONITORMESSAGEQUEUE;

				if (pagination) {
					sql = sql.concat(MonitorMessageQueueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MonitorMessageQueue>(list);
				}
				else {
					list = (List<MonitorMessageQueue>)QueryUtil.list(q,
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
	 * Removes all the monitor message queues from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MonitorMessageQueue monitorMessageQueue : findAll()) {
			remove(monitorMessageQueue);
		}
	}

	/**
	 * Returns the number of monitor message queues.
	 *
	 * @return the number of monitor message queues
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

				Query q = session.createQuery(_SQL_COUNT_MONITORMESSAGEQUEUE);

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
	 * Initializes the monitor message queue persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MonitorMessageQueue>> listenersList = new ArrayList<ModelListener<MonitorMessageQueue>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MonitorMessageQueue>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MonitorMessageQueueImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MONITORMESSAGEQUEUE = "SELECT monitorMessageQueue FROM MonitorMessageQueue monitorMessageQueue";
	private static final String _SQL_SELECT_MONITORMESSAGEQUEUE_WHERE = "SELECT monitorMessageQueue FROM MonitorMessageQueue monitorMessageQueue WHERE ";
	private static final String _SQL_COUNT_MONITORMESSAGEQUEUE = "SELECT COUNT(monitorMessageQueue) FROM MonitorMessageQueue monitorMessageQueue";
	private static final String _SQL_COUNT_MONITORMESSAGEQUEUE_WHERE = "SELECT COUNT(monitorMessageQueue) FROM MonitorMessageQueue monitorMessageQueue WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "monitorMessageQueue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MonitorMessageQueue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MonitorMessageQueue exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MonitorMessageQueuePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"senderName", "senderIdentity", "senderCountryCode",
				"senderMinistryCode", "senderOrganizationCode", "senderUnitCode",
				"receiverName", "receiverIdentity", "receiverCountryCode",
				"receiverMinistryCode", "receiverOrganizationCode",
				"receiverUnitCode", "documentType", "preReference",
				"documentYear", "sendDate", "createdTime", "validationCode",
				"soLanGui"
			});
	private static MonitorMessageQueue _nullMonitorMessageQueue = new MonitorMessageQueueImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MonitorMessageQueue> toCacheModel() {
				return _nullMonitorMessageQueueCacheModel;
			}
		};

	private static CacheModel<MonitorMessageQueue> _nullMonitorMessageQueueCacheModel =
		new CacheModel<MonitorMessageQueue>() {
			@Override
			public MonitorMessageQueue toEntityModel() {
				return _nullMonitorMessageQueue;
			}
		};
}