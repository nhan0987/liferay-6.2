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

import vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryImpl;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the aswmsg syndatahistory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgSyndatahistoryPersistence
 * @see AswmsgSyndatahistoryUtil
 * @generated
 */
public class AswmsgSyndatahistoryPersistenceImpl extends BasePersistenceImpl<AswmsgSyndatahistory>
	implements AswmsgSyndatahistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AswmsgSyndatahistoryUtil} to access the aswmsg syndatahistory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AswmsgSyndatahistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID = new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVersionAndMessageId",
			new String[] { String.class.getName(), String.class.getName() },
			AswmsgSyndatahistoryModelImpl.VERSION_COLUMN_BITMASK |
			AswmsgSyndatahistoryModelImpl.MESSAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID = new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVersionAndMessageId",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException} if it could not be found.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the matching aswmsg syndatahistory
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory findByVersionAndMessageId(String version,
		String messageId)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		AswmsgSyndatahistory aswmsgSyndatahistory = fetchByVersionAndMessageId(version,
				messageId);

		if (aswmsgSyndatahistory == null) {
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

			throw new NoSuchAswmsgSyndatahistoryException(msg.toString());
		}

		return aswmsgSyndatahistory;
	}

	/**
	 * Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory fetchByVersionAndMessageId(String version,
		String messageId) throws SystemException {
		return fetchByVersionAndMessageId(version, messageId, true);
	}

	/**
	 * Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory fetchByVersionAndMessageId(String version,
		String messageId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { version, messageId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
					finderArgs, this);
		}

		if (result instanceof AswmsgSyndatahistory) {
			AswmsgSyndatahistory aswmsgSyndatahistory = (AswmsgSyndatahistory)result;

			if (!Validator.equals(version, aswmsgSyndatahistory.getVersion()) ||
					!Validator.equals(messageId,
						aswmsgSyndatahistory.getMessageId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ASWMSGSYNDATAHISTORY_WHERE);

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

				List<AswmsgSyndatahistory> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AswmsgSyndatahistoryPersistenceImpl.fetchByVersionAndMessageId(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					AswmsgSyndatahistory aswmsgSyndatahistory = list.get(0);

					result = aswmsgSyndatahistory;

					cacheResult(aswmsgSyndatahistory);

					if ((aswmsgSyndatahistory.getVersion() == null) ||
							!aswmsgSyndatahistory.getVersion().equals(version) ||
							(aswmsgSyndatahistory.getMessageId() == null) ||
							!aswmsgSyndatahistory.getMessageId()
													 .equals(messageId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
							finderArgs, aswmsgSyndatahistory);
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
			return (AswmsgSyndatahistory)result;
		}
	}

	/**
	 * Removes the aswmsg syndatahistory where version = &#63; and messageId = &#63; from the database.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the aswmsg syndatahistory that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory removeByVersionAndMessageId(String version,
		String messageId)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		AswmsgSyndatahistory aswmsgSyndatahistory = findByVersionAndMessageId(version,
				messageId);

		return remove(aswmsgSyndatahistory);
	}

	/**
	 * Returns the number of aswmsg syndatahistories where version = &#63; and messageId = &#63;.
	 *
	 * @param version the version
	 * @param messageId the message ID
	 * @return the number of matching aswmsg syndatahistories
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

			query.append(_SQL_COUNT_ASWMSGSYNDATAHISTORY_WHERE);

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

	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_1 = "aswmsgSyndatahistory.version IS NULL AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_2 = "aswmsgSyndatahistory.version = ? AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_3 = "(aswmsgSyndatahistory.version IS NULL OR aswmsgSyndatahistory.version = '') AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_1 = "aswmsgSyndatahistory.messageId IS NULL";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_2 = "aswmsgSyndatahistory.messageId = ?";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_3 = "(aswmsgSyndatahistory.messageId IS NULL OR aswmsgSyndatahistory.messageId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMessageId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID =
		new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMessageId",
			new String[] { String.class.getName() },
			AswmsgSyndatahistoryModelImpl.MESSAGEID_COLUMN_BITMASK |
			AswmsgSyndatahistoryModelImpl.PRIORITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MESSAGEID = new FinderPath(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMessageId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the aswmsg syndatahistories where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the matching aswmsg syndatahistories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgSyndatahistory> findByMessageId(String messageId)
		throws SystemException {
		return findByMessageId(messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the aswmsg syndatahistories where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of aswmsg syndatahistories
	 * @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	 * @return the range of matching aswmsg syndatahistories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgSyndatahistory> findByMessageId(String messageId,
		int start, int end) throws SystemException {
		return findByMessageId(messageId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg syndatahistories where messageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param messageId the message ID
	 * @param start the lower bound of the range of aswmsg syndatahistories
	 * @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching aswmsg syndatahistories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgSyndatahistory> findByMessageId(String messageId,
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

		List<AswmsgSyndatahistory> list = (List<AswmsgSyndatahistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AswmsgSyndatahistory aswmsgSyndatahistory : list) {
				if (!Validator.equals(messageId,
							aswmsgSyndatahistory.getMessageId())) {
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

			query.append(_SQL_SELECT_ASWMSGSYNDATAHISTORY_WHERE);

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
				query.append(AswmsgSyndatahistoryModelImpl.ORDER_BY_JPQL);
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
					list = (List<AswmsgSyndatahistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgSyndatahistory>(list);
				}
				else {
					list = (List<AswmsgSyndatahistory>)QueryUtil.list(q,
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
	 * Returns the first aswmsg syndatahistory in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg syndatahistory
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory findByMessageId_First(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		AswmsgSyndatahistory aswmsgSyndatahistory = fetchByMessageId_First(messageId,
				orderByComparator);

		if (aswmsgSyndatahistory != null) {
			return aswmsgSyndatahistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgSyndatahistoryException(msg.toString());
	}

	/**
	 * Returns the first aswmsg syndatahistory in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory fetchByMessageId_First(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AswmsgSyndatahistory> list = findByMessageId(messageId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last aswmsg syndatahistory in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg syndatahistory
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory findByMessageId_Last(String messageId,
		OrderByComparator orderByComparator)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		AswmsgSyndatahistory aswmsgSyndatahistory = fetchByMessageId_Last(messageId,
				orderByComparator);

		if (aswmsgSyndatahistory != null) {
			return aswmsgSyndatahistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("messageId=");
		msg.append(messageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAswmsgSyndatahistoryException(msg.toString());
	}

	/**
	 * Returns the last aswmsg syndatahistory in the ordered set where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory fetchByMessageId_Last(String messageId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMessageId(messageId);

		if (count == 0) {
			return null;
		}

		List<AswmsgSyndatahistory> list = findByMessageId(messageId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the aswmsg syndatahistories before and after the current aswmsg syndatahistory in the ordered set where messageId = &#63;.
	 *
	 * @param id the primary key of the current aswmsg syndatahistory
	 * @param messageId the message ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next aswmsg syndatahistory
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory[] findByMessageId_PrevAndNext(long id,
		String messageId, OrderByComparator orderByComparator)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		AswmsgSyndatahistory aswmsgSyndatahistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AswmsgSyndatahistory[] array = new AswmsgSyndatahistoryImpl[3];

			array[0] = getByMessageId_PrevAndNext(session,
					aswmsgSyndatahistory, messageId, orderByComparator, true);

			array[1] = aswmsgSyndatahistory;

			array[2] = getByMessageId_PrevAndNext(session,
					aswmsgSyndatahistory, messageId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AswmsgSyndatahistory getByMessageId_PrevAndNext(Session session,
		AswmsgSyndatahistory aswmsgSyndatahistory, String messageId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASWMSGSYNDATAHISTORY_WHERE);

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
			query.append(AswmsgSyndatahistoryModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(aswmsgSyndatahistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AswmsgSyndatahistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the aswmsg syndatahistories where messageId = &#63; from the database.
	 *
	 * @param messageId the message ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMessageId(String messageId) throws SystemException {
		for (AswmsgSyndatahistory aswmsgSyndatahistory : findByMessageId(
				messageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(aswmsgSyndatahistory);
		}
	}

	/**
	 * Returns the number of aswmsg syndatahistories where messageId = &#63;.
	 *
	 * @param messageId the message ID
	 * @return the number of matching aswmsg syndatahistories
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

			query.append(_SQL_COUNT_ASWMSGSYNDATAHISTORY_WHERE);

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

	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_1 = "aswmsgSyndatahistory.messageId IS NULL";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_2 = "aswmsgSyndatahistory.messageId = ?";
	private static final String _FINDER_COLUMN_MESSAGEID_MESSAGEID_3 = "(aswmsgSyndatahistory.messageId IS NULL OR aswmsgSyndatahistory.messageId = '')";

	public AswmsgSyndatahistoryPersistenceImpl() {
		setModelClass(AswmsgSyndatahistory.class);
	}

	/**
	 * Caches the aswmsg syndatahistory in the entity cache if it is enabled.
	 *
	 * @param aswmsgSyndatahistory the aswmsg syndatahistory
	 */
	@Override
	public void cacheResult(AswmsgSyndatahistory aswmsgSyndatahistory) {
		EntityCacheUtil.putResult(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class,
			aswmsgSyndatahistory.getPrimaryKey(), aswmsgSyndatahistory);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
			new Object[] {
				aswmsgSyndatahistory.getVersion(),
				aswmsgSyndatahistory.getMessageId()
			}, aswmsgSyndatahistory);

		aswmsgSyndatahistory.resetOriginalValues();
	}

	/**
	 * Caches the aswmsg syndatahistories in the entity cache if it is enabled.
	 *
	 * @param aswmsgSyndatahistories the aswmsg syndatahistories
	 */
	@Override
	public void cacheResult(List<AswmsgSyndatahistory> aswmsgSyndatahistories) {
		for (AswmsgSyndatahistory aswmsgSyndatahistory : aswmsgSyndatahistories) {
			if (EntityCacheUtil.getResult(
						AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgSyndatahistoryImpl.class,
						aswmsgSyndatahistory.getPrimaryKey()) == null) {
				cacheResult(aswmsgSyndatahistory);
			}
			else {
				aswmsgSyndatahistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all aswmsg syndatahistories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AswmsgSyndatahistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AswmsgSyndatahistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the aswmsg syndatahistory.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AswmsgSyndatahistory aswmsgSyndatahistory) {
		EntityCacheUtil.removeResult(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class, aswmsgSyndatahistory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(aswmsgSyndatahistory);
	}

	@Override
	public void clearCache(List<AswmsgSyndatahistory> aswmsgSyndatahistories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AswmsgSyndatahistory aswmsgSyndatahistory : aswmsgSyndatahistories) {
			EntityCacheUtil.removeResult(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgSyndatahistoryImpl.class,
				aswmsgSyndatahistory.getPrimaryKey());

			clearUniqueFindersCache(aswmsgSyndatahistory);
		}
	}

	protected void cacheUniqueFindersCache(
		AswmsgSyndatahistory aswmsgSyndatahistory) {
		if (aswmsgSyndatahistory.isNew()) {
			Object[] args = new Object[] {
					aswmsgSyndatahistory.getVersion(),
					aswmsgSyndatahistory.getMessageId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
				args, aswmsgSyndatahistory);
		}
		else {
			AswmsgSyndatahistoryModelImpl aswmsgSyndatahistoryModelImpl = (AswmsgSyndatahistoryModelImpl)aswmsgSyndatahistory;

			if ((aswmsgSyndatahistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgSyndatahistory.getVersion(),
						aswmsgSyndatahistory.getMessageId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
					args, aswmsgSyndatahistory);
			}
		}
	}

	protected void clearUniqueFindersCache(
		AswmsgSyndatahistory aswmsgSyndatahistory) {
		AswmsgSyndatahistoryModelImpl aswmsgSyndatahistoryModelImpl = (AswmsgSyndatahistoryModelImpl)aswmsgSyndatahistory;

		Object[] args = new Object[] {
				aswmsgSyndatahistory.getVersion(),
				aswmsgSyndatahistory.getMessageId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
			args);

		if ((aswmsgSyndatahistoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					aswmsgSyndatahistoryModelImpl.getOriginalVersion(),
					aswmsgSyndatahistoryModelImpl.getOriginalMessageId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
				args);
		}
	}

	/**
	 * Creates a new aswmsg syndatahistory with the primary key. Does not add the aswmsg syndatahistory to the database.
	 *
	 * @param id the primary key for the new aswmsg syndatahistory
	 * @return the new aswmsg syndatahistory
	 */
	@Override
	public AswmsgSyndatahistory create(long id) {
		AswmsgSyndatahistory aswmsgSyndatahistory = new AswmsgSyndatahistoryImpl();

		aswmsgSyndatahistory.setNew(true);
		aswmsgSyndatahistory.setPrimaryKey(id);

		return aswmsgSyndatahistory;
	}

	/**
	 * Removes the aswmsg syndatahistory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the aswmsg syndatahistory
	 * @return the aswmsg syndatahistory that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory remove(long id)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the aswmsg syndatahistory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the aswmsg syndatahistory
	 * @return the aswmsg syndatahistory that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory remove(Serializable primaryKey)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AswmsgSyndatahistory aswmsgSyndatahistory = (AswmsgSyndatahistory)session.get(AswmsgSyndatahistoryImpl.class,
					primaryKey);

			if (aswmsgSyndatahistory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAswmsgSyndatahistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(aswmsgSyndatahistory);
		}
		catch (NoSuchAswmsgSyndatahistoryException nsee) {
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
	protected AswmsgSyndatahistory removeImpl(
		AswmsgSyndatahistory aswmsgSyndatahistory) throws SystemException {
		aswmsgSyndatahistory = toUnwrappedModel(aswmsgSyndatahistory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(aswmsgSyndatahistory)) {
				aswmsgSyndatahistory = (AswmsgSyndatahistory)session.get(AswmsgSyndatahistoryImpl.class,
						aswmsgSyndatahistory.getPrimaryKeyObj());
			}

			if (aswmsgSyndatahistory != null) {
				session.delete(aswmsgSyndatahistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (aswmsgSyndatahistory != null) {
			clearCache(aswmsgSyndatahistory);
		}

		return aswmsgSyndatahistory;
	}

	@Override
	public AswmsgSyndatahistory updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory)
		throws SystemException {
		aswmsgSyndatahistory = toUnwrappedModel(aswmsgSyndatahistory);

		boolean isNew = aswmsgSyndatahistory.isNew();

		AswmsgSyndatahistoryModelImpl aswmsgSyndatahistoryModelImpl = (AswmsgSyndatahistoryModelImpl)aswmsgSyndatahistory;

		Session session = null;

		try {
			session = openSession();

			if (aswmsgSyndatahistory.isNew()) {
				session.save(aswmsgSyndatahistory);

				aswmsgSyndatahistory.setNew(false);
			}
			else {
				session.merge(aswmsgSyndatahistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AswmsgSyndatahistoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((aswmsgSyndatahistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgSyndatahistoryModelImpl.getOriginalMessageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);

				args = new Object[] { aswmsgSyndatahistoryModelImpl.getMessageId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MESSAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MESSAGEID,
					args);
			}
		}

		EntityCacheUtil.putResult(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgSyndatahistoryImpl.class,
			aswmsgSyndatahistory.getPrimaryKey(), aswmsgSyndatahistory);

		clearUniqueFindersCache(aswmsgSyndatahistory);
		cacheUniqueFindersCache(aswmsgSyndatahistory);

		return aswmsgSyndatahistory;
	}

	protected AswmsgSyndatahistory toUnwrappedModel(
		AswmsgSyndatahistory aswmsgSyndatahistory) {
		if (aswmsgSyndatahistory instanceof AswmsgSyndatahistoryImpl) {
			return aswmsgSyndatahistory;
		}

		AswmsgSyndatahistoryImpl aswmsgSyndatahistoryImpl = new AswmsgSyndatahistoryImpl();

		aswmsgSyndatahistoryImpl.setNew(aswmsgSyndatahistory.isNew());
		aswmsgSyndatahistoryImpl.setPrimaryKey(aswmsgSyndatahistory.getPrimaryKey());

		aswmsgSyndatahistoryImpl.setId(aswmsgSyndatahistory.getId());
		aswmsgSyndatahistoryImpl.setVersion(aswmsgSyndatahistory.getVersion());
		aswmsgSyndatahistoryImpl.setMessageId(aswmsgSyndatahistory.getMessageId());
		aswmsgSyndatahistoryImpl.setSenderName(aswmsgSyndatahistory.getSenderName());
		aswmsgSyndatahistoryImpl.setSenderIdentity(aswmsgSyndatahistory.getSenderIdentity());
		aswmsgSyndatahistoryImpl.setSenderCountryCode(aswmsgSyndatahistory.getSenderCountryCode());
		aswmsgSyndatahistoryImpl.setSenderMinistryCode(aswmsgSyndatahistory.getSenderMinistryCode());
		aswmsgSyndatahistoryImpl.setSenderOrganizationCode(aswmsgSyndatahistory.getSenderOrganizationCode());
		aswmsgSyndatahistoryImpl.setSenderUnitCode(aswmsgSyndatahistory.getSenderUnitCode());
		aswmsgSyndatahistoryImpl.setReceiverName(aswmsgSyndatahistory.getReceiverName());
		aswmsgSyndatahistoryImpl.setReceiverIdentity(aswmsgSyndatahistory.getReceiverIdentity());
		aswmsgSyndatahistoryImpl.setReceiverCountryCode(aswmsgSyndatahistory.getReceiverCountryCode());
		aswmsgSyndatahistoryImpl.setReceiverMinistryCode(aswmsgSyndatahistory.getReceiverMinistryCode());
		aswmsgSyndatahistoryImpl.setReceiverOrganizationCode(aswmsgSyndatahistory.getReceiverOrganizationCode());
		aswmsgSyndatahistoryImpl.setReceiverUnitCode(aswmsgSyndatahistory.getReceiverUnitCode());
		aswmsgSyndatahistoryImpl.setDocumentType(aswmsgSyndatahistory.getDocumentType());
		aswmsgSyndatahistoryImpl.setType(aswmsgSyndatahistory.getType());
		aswmsgSyndatahistoryImpl.setFunction(aswmsgSyndatahistory.getFunction());
		aswmsgSyndatahistoryImpl.setReference(aswmsgSyndatahistory.getReference());
		aswmsgSyndatahistoryImpl.setPreReference(aswmsgSyndatahistory.getPreReference());
		aswmsgSyndatahistoryImpl.setDocumentYear(aswmsgSyndatahistory.getDocumentYear());
		aswmsgSyndatahistoryImpl.setSendDate(aswmsgSyndatahistory.getSendDate());
		aswmsgSyndatahistoryImpl.setSignature(aswmsgSyndatahistory.getSignature());
		aswmsgSyndatahistoryImpl.setSystemSignature(aswmsgSyndatahistory.getSystemSignature());
		aswmsgSyndatahistoryImpl.setAllContent(aswmsgSyndatahistory.getAllContent());
		aswmsgSyndatahistoryImpl.setCreatedTime(aswmsgSyndatahistory.getCreatedTime());
		aswmsgSyndatahistoryImpl.setWebservice(aswmsgSyndatahistory.getWebservice());
		aswmsgSyndatahistoryImpl.setValidated(aswmsgSyndatahistory.getValidated());
		aswmsgSyndatahistoryImpl.setPriority(aswmsgSyndatahistory.getPriority());
		aswmsgSyndatahistoryImpl.setDescription(aswmsgSyndatahistory.getDescription());
		aswmsgSyndatahistoryImpl.setValidationCode(aswmsgSyndatahistory.getValidationCode());
		aswmsgSyndatahistoryImpl.setSoLanGui(aswmsgSyndatahistory.getSoLanGui());

		return aswmsgSyndatahistoryImpl;
	}

	/**
	 * Returns the aswmsg syndatahistory with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg syndatahistory
	 * @return the aswmsg syndatahistory
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		AswmsgSyndatahistory aswmsgSyndatahistory = fetchByPrimaryKey(primaryKey);

		if (aswmsgSyndatahistory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAswmsgSyndatahistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return aswmsgSyndatahistory;
	}

	/**
	 * Returns the aswmsg syndatahistory with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException} if it could not be found.
	 *
	 * @param id the primary key of the aswmsg syndatahistory
	 * @return the aswmsg syndatahistory
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory findByPrimaryKey(long id)
		throws NoSuchAswmsgSyndatahistoryException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the aswmsg syndatahistory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg syndatahistory
	 * @return the aswmsg syndatahistory, or <code>null</code> if a aswmsg syndatahistory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AswmsgSyndatahistory aswmsgSyndatahistory = (AswmsgSyndatahistory)EntityCacheUtil.getResult(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgSyndatahistoryImpl.class, primaryKey);

		if (aswmsgSyndatahistory == _nullAswmsgSyndatahistory) {
			return null;
		}

		if (aswmsgSyndatahistory == null) {
			Session session = null;

			try {
				session = openSession();

				aswmsgSyndatahistory = (AswmsgSyndatahistory)session.get(AswmsgSyndatahistoryImpl.class,
						primaryKey);

				if (aswmsgSyndatahistory != null) {
					cacheResult(aswmsgSyndatahistory);
				}
				else {
					EntityCacheUtil.putResult(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgSyndatahistoryImpl.class, primaryKey,
						_nullAswmsgSyndatahistory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AswmsgSyndatahistoryModelImpl.ENTITY_CACHE_ENABLED,
					AswmsgSyndatahistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return aswmsgSyndatahistory;
	}

	/**
	 * Returns the aswmsg syndatahistory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the aswmsg syndatahistory
	 * @return the aswmsg syndatahistory, or <code>null</code> if a aswmsg syndatahistory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgSyndatahistory fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the aswmsg syndatahistories.
	 *
	 * @return the aswmsg syndatahistories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgSyndatahistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg syndatahistories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg syndatahistories
	 * @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	 * @return the range of aswmsg syndatahistories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgSyndatahistory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg syndatahistories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg syndatahistories
	 * @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of aswmsg syndatahistories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgSyndatahistory> findAll(int start, int end,
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

		List<AswmsgSyndatahistory> list = (List<AswmsgSyndatahistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASWMSGSYNDATAHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASWMSGSYNDATAHISTORY;

				if (pagination) {
					sql = sql.concat(AswmsgSyndatahistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AswmsgSyndatahistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgSyndatahistory>(list);
				}
				else {
					list = (List<AswmsgSyndatahistory>)QueryUtil.list(q,
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
	 * Removes all the aswmsg syndatahistories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AswmsgSyndatahistory aswmsgSyndatahistory : findAll()) {
			remove(aswmsgSyndatahistory);
		}
	}

	/**
	 * Returns the number of aswmsg syndatahistories.
	 *
	 * @return the number of aswmsg syndatahistories
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

				Query q = session.createQuery(_SQL_COUNT_ASWMSGSYNDATAHISTORY);

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
	 * Initializes the aswmsg syndatahistory persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AswmsgSyndatahistory>> listenersList = new ArrayList<ModelListener<AswmsgSyndatahistory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AswmsgSyndatahistory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AswmsgSyndatahistoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASWMSGSYNDATAHISTORY = "SELECT aswmsgSyndatahistory FROM AswmsgSyndatahistory aswmsgSyndatahistory";
	private static final String _SQL_SELECT_ASWMSGSYNDATAHISTORY_WHERE = "SELECT aswmsgSyndatahistory FROM AswmsgSyndatahistory aswmsgSyndatahistory WHERE ";
	private static final String _SQL_COUNT_ASWMSGSYNDATAHISTORY = "SELECT COUNT(aswmsgSyndatahistory) FROM AswmsgSyndatahistory aswmsgSyndatahistory";
	private static final String _SQL_COUNT_ASWMSGSYNDATAHISTORY_WHERE = "SELECT COUNT(aswmsgSyndatahistory) FROM AswmsgSyndatahistory aswmsgSyndatahistory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "aswmsgSyndatahistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AswmsgSyndatahistory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AswmsgSyndatahistory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AswmsgSyndatahistoryPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"senderName", "senderIdentity", "senderCountryCode",
				"senderMinistryCode", "senderOrganizationCode", "senderUnitCode",
				"receiverName", "receiverIdentity", "receiverCountryCode",
				"receiverMinistryCode", "receiverOrganizationCode",
				"receiverUnitCode", "documentType", "preReference",
				"documentYear", "sendDate", "systemSignature", "allContent",
				"createdTime", "validationCode", "soLanGui"
			});
	private static AswmsgSyndatahistory _nullAswmsgSyndatahistory = new AswmsgSyndatahistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AswmsgSyndatahistory> toCacheModel() {
				return _nullAswmsgSyndatahistoryCacheModel;
			}
		};

	private static CacheModel<AswmsgSyndatahistory> _nullAswmsgSyndatahistoryCacheModel =
		new CacheModel<AswmsgSyndatahistory>() {
			@Override
			public AswmsgSyndatahistory toEntityModel() {
				return _nullAswmsgSyndatahistory;
			}
		};
}