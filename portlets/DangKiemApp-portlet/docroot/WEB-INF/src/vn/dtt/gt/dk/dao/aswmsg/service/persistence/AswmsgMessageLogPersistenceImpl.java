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

import vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogImpl;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the aswmsg message log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageLogPersistence
 * @see AswmsgMessageLogUtil
 * @generated
 */
public class AswmsgMessageLogPersistenceImpl extends BasePersistenceImpl<AswmsgMessageLog>
	implements AswmsgMessageLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AswmsgMessageLogUtil} to access the aswmsg message log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AswmsgMessageLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID = new FinderPath(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogModelImpl.FINDER_CACHE_ENABLED,
			AswmsgMessageLogImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVersionAndMessageId",
			new String[] { String.class.getName(), String.class.getName() },
			AswmsgMessageLogModelImpl.VERSION_COLUMN_BITMASK |
			AswmsgMessageLogModelImpl.MESSAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID = new FinderPath(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVersionAndMessageId",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException} if it could not be found.
	 *
	 * @param Version the version
	 * @param MessageId the message ID
	 * @return the matching aswmsg message log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a matching aswmsg message log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog findByVersionAndMessageId(String Version,
		String MessageId)
		throws NoSuchAswmsgMessageLogException, SystemException {
		AswmsgMessageLog aswmsgMessageLog = fetchByVersionAndMessageId(Version,
				MessageId);

		if (aswmsgMessageLog == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("Version=");
			msg.append(Version);

			msg.append(", MessageId=");
			msg.append(MessageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAswmsgMessageLogException(msg.toString());
		}

		return aswmsgMessageLog;
	}

	/**
	 * Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param Version the version
	 * @param MessageId the message ID
	 * @return the matching aswmsg message log, or <code>null</code> if a matching aswmsg message log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog fetchByVersionAndMessageId(String Version,
		String MessageId) throws SystemException {
		return fetchByVersionAndMessageId(Version, MessageId, true);
	}

	/**
	 * Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param Version the version
	 * @param MessageId the message ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching aswmsg message log, or <code>null</code> if a matching aswmsg message log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog fetchByVersionAndMessageId(String Version,
		String MessageId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { Version, MessageId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
					finderArgs, this);
		}

		if (result instanceof AswmsgMessageLog) {
			AswmsgMessageLog aswmsgMessageLog = (AswmsgMessageLog)result;

			if (!Validator.equals(Version, aswmsgMessageLog.getVersion()) ||
					!Validator.equals(MessageId, aswmsgMessageLog.getMessageId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ASWMSGMESSAGELOG_WHERE);

			boolean bindVersion = false;

			if (Version == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_1);
			}
			else if (Version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_2);
			}

			boolean bindMessageId = false;

			if (MessageId == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_1);
			}
			else if (MessageId.equals(StringPool.BLANK)) {
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
					qPos.add(Version);
				}

				if (bindMessageId) {
					qPos.add(MessageId);
				}

				List<AswmsgMessageLog> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AswmsgMessageLogPersistenceImpl.fetchByVersionAndMessageId(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					AswmsgMessageLog aswmsgMessageLog = list.get(0);

					result = aswmsgMessageLog;

					cacheResult(aswmsgMessageLog);

					if ((aswmsgMessageLog.getVersion() == null) ||
							!aswmsgMessageLog.getVersion().equals(Version) ||
							(aswmsgMessageLog.getMessageId() == null) ||
							!aswmsgMessageLog.getMessageId().equals(MessageId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
							finderArgs, aswmsgMessageLog);
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
			return (AswmsgMessageLog)result;
		}
	}

	/**
	 * Removes the aswmsg message log where Version = &#63; and MessageId = &#63; from the database.
	 *
	 * @param Version the version
	 * @param MessageId the message ID
	 * @return the aswmsg message log that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog removeByVersionAndMessageId(String Version,
		String MessageId)
		throws NoSuchAswmsgMessageLogException, SystemException {
		AswmsgMessageLog aswmsgMessageLog = findByVersionAndMessageId(Version,
				MessageId);

		return remove(aswmsgMessageLog);
	}

	/**
	 * Returns the number of aswmsg message logs where Version = &#63; and MessageId = &#63;.
	 *
	 * @param Version the version
	 * @param MessageId the message ID
	 * @return the number of matching aswmsg message logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVersionAndMessageId(String Version, String MessageId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID;

		Object[] finderArgs = new Object[] { Version, MessageId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASWMSGMESSAGELOG_WHERE);

			boolean bindVersion = false;

			if (Version == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_1);
			}
			else if (Version.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_3);
			}
			else {
				bindVersion = true;

				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_2);
			}

			boolean bindMessageId = false;

			if (MessageId == null) {
				query.append(_FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_1);
			}
			else if (MessageId.equals(StringPool.BLANK)) {
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
					qPos.add(Version);
				}

				if (bindMessageId) {
					qPos.add(MessageId);
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

	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_1 = "aswmsgMessageLog.Version IS NULL AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_2 = "aswmsgMessageLog.Version = ? AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_VERSION_3 = "(aswmsgMessageLog.Version IS NULL OR aswmsgMessageLog.Version = '') AND ";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_1 = "aswmsgMessageLog.MessageId IS NULL";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_2 = "aswmsgMessageLog.MessageId = ?";
	private static final String _FINDER_COLUMN_VERSIONANDMESSAGEID_MESSAGEID_3 = "(aswmsgMessageLog.MessageId IS NULL OR aswmsgMessageLog.MessageId = '')";

	public AswmsgMessageLogPersistenceImpl() {
		setModelClass(AswmsgMessageLog.class);
	}

	/**
	 * Caches the aswmsg message log in the entity cache if it is enabled.
	 *
	 * @param aswmsgMessageLog the aswmsg message log
	 */
	@Override
	public void cacheResult(AswmsgMessageLog aswmsgMessageLog) {
		EntityCacheUtil.putResult(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogImpl.class, aswmsgMessageLog.getPrimaryKey(),
			aswmsgMessageLog);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
			new Object[] {
				aswmsgMessageLog.getVersion(), aswmsgMessageLog.getMessageId()
			}, aswmsgMessageLog);

		aswmsgMessageLog.resetOriginalValues();
	}

	/**
	 * Caches the aswmsg message logs in the entity cache if it is enabled.
	 *
	 * @param aswmsgMessageLogs the aswmsg message logs
	 */
	@Override
	public void cacheResult(List<AswmsgMessageLog> aswmsgMessageLogs) {
		for (AswmsgMessageLog aswmsgMessageLog : aswmsgMessageLogs) {
			if (EntityCacheUtil.getResult(
						AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgMessageLogImpl.class,
						aswmsgMessageLog.getPrimaryKey()) == null) {
				cacheResult(aswmsgMessageLog);
			}
			else {
				aswmsgMessageLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all aswmsg message logs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AswmsgMessageLogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AswmsgMessageLogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the aswmsg message log.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AswmsgMessageLog aswmsgMessageLog) {
		EntityCacheUtil.removeResult(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogImpl.class, aswmsgMessageLog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(aswmsgMessageLog);
	}

	@Override
	public void clearCache(List<AswmsgMessageLog> aswmsgMessageLogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AswmsgMessageLog aswmsgMessageLog : aswmsgMessageLogs) {
			EntityCacheUtil.removeResult(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgMessageLogImpl.class, aswmsgMessageLog.getPrimaryKey());

			clearUniqueFindersCache(aswmsgMessageLog);
		}
	}

	protected void cacheUniqueFindersCache(AswmsgMessageLog aswmsgMessageLog) {
		if (aswmsgMessageLog.isNew()) {
			Object[] args = new Object[] {
					aswmsgMessageLog.getVersion(),
					aswmsgMessageLog.getMessageId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
				args, aswmsgMessageLog);
		}
		else {
			AswmsgMessageLogModelImpl aswmsgMessageLogModelImpl = (AswmsgMessageLogModelImpl)aswmsgMessageLog;

			if ((aswmsgMessageLogModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						aswmsgMessageLog.getVersion(),
						aswmsgMessageLog.getMessageId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
					args, aswmsgMessageLog);
			}
		}
	}

	protected void clearUniqueFindersCache(AswmsgMessageLog aswmsgMessageLog) {
		AswmsgMessageLogModelImpl aswmsgMessageLogModelImpl = (AswmsgMessageLogModelImpl)aswmsgMessageLog;

		Object[] args = new Object[] {
				aswmsgMessageLog.getVersion(), aswmsgMessageLog.getMessageId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
			args);

		if ((aswmsgMessageLogModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					aswmsgMessageLogModelImpl.getOriginalVersion(),
					aswmsgMessageLogModelImpl.getOriginalMessageId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VERSIONANDMESSAGEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VERSIONANDMESSAGEID,
				args);
		}
	}

	/**
	 * Creates a new aswmsg message log with the primary key. Does not add the aswmsg message log to the database.
	 *
	 * @param Id the primary key for the new aswmsg message log
	 * @return the new aswmsg message log
	 */
	@Override
	public AswmsgMessageLog create(long Id) {
		AswmsgMessageLog aswmsgMessageLog = new AswmsgMessageLogImpl();

		aswmsgMessageLog.setNew(true);
		aswmsgMessageLog.setPrimaryKey(Id);

		return aswmsgMessageLog;
	}

	/**
	 * Removes the aswmsg message log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the aswmsg message log
	 * @return the aswmsg message log that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog remove(long Id)
		throws NoSuchAswmsgMessageLogException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the aswmsg message log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the aswmsg message log
	 * @return the aswmsg message log that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog remove(Serializable primaryKey)
		throws NoSuchAswmsgMessageLogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AswmsgMessageLog aswmsgMessageLog = (AswmsgMessageLog)session.get(AswmsgMessageLogImpl.class,
					primaryKey);

			if (aswmsgMessageLog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAswmsgMessageLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(aswmsgMessageLog);
		}
		catch (NoSuchAswmsgMessageLogException nsee) {
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
	protected AswmsgMessageLog removeImpl(AswmsgMessageLog aswmsgMessageLog)
		throws SystemException {
		aswmsgMessageLog = toUnwrappedModel(aswmsgMessageLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(aswmsgMessageLog)) {
				aswmsgMessageLog = (AswmsgMessageLog)session.get(AswmsgMessageLogImpl.class,
						aswmsgMessageLog.getPrimaryKeyObj());
			}

			if (aswmsgMessageLog != null) {
				session.delete(aswmsgMessageLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (aswmsgMessageLog != null) {
			clearCache(aswmsgMessageLog);
		}

		return aswmsgMessageLog;
	}

	@Override
	public AswmsgMessageLog updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog aswmsgMessageLog)
		throws SystemException {
		aswmsgMessageLog = toUnwrappedModel(aswmsgMessageLog);

		boolean isNew = aswmsgMessageLog.isNew();

		Session session = null;

		try {
			session = openSession();

			if (aswmsgMessageLog.isNew()) {
				session.save(aswmsgMessageLog);

				aswmsgMessageLog.setNew(false);
			}
			else {
				session.merge(aswmsgMessageLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AswmsgMessageLogModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgMessageLogImpl.class, aswmsgMessageLog.getPrimaryKey(),
			aswmsgMessageLog);

		clearUniqueFindersCache(aswmsgMessageLog);
		cacheUniqueFindersCache(aswmsgMessageLog);

		return aswmsgMessageLog;
	}

	protected AswmsgMessageLog toUnwrappedModel(
		AswmsgMessageLog aswmsgMessageLog) {
		if (aswmsgMessageLog instanceof AswmsgMessageLogImpl) {
			return aswmsgMessageLog;
		}

		AswmsgMessageLogImpl aswmsgMessageLogImpl = new AswmsgMessageLogImpl();

		aswmsgMessageLogImpl.setNew(aswmsgMessageLog.isNew());
		aswmsgMessageLogImpl.setPrimaryKey(aswmsgMessageLog.getPrimaryKey());

		aswmsgMessageLogImpl.setId(aswmsgMessageLog.getId());
		aswmsgMessageLogImpl.setVersion(aswmsgMessageLog.getVersion());
		aswmsgMessageLogImpl.setMessageId(aswmsgMessageLog.getMessageId());
		aswmsgMessageLogImpl.setSenderName(aswmsgMessageLog.getSenderName());
		aswmsgMessageLogImpl.setSenderIdentity(aswmsgMessageLog.getSenderIdentity());
		aswmsgMessageLogImpl.setSenderCountryCode(aswmsgMessageLog.getSenderCountryCode());
		aswmsgMessageLogImpl.setSenderMinistryCode(aswmsgMessageLog.getSenderMinistryCode());
		aswmsgMessageLogImpl.setSenderOrganizationCode(aswmsgMessageLog.getSenderOrganizationCode());
		aswmsgMessageLogImpl.setSenderUnitCode(aswmsgMessageLog.getSenderUnitCode());
		aswmsgMessageLogImpl.setReceiverName(aswmsgMessageLog.getReceiverName());
		aswmsgMessageLogImpl.setReceiverIdentity(aswmsgMessageLog.getReceiverIdentity());
		aswmsgMessageLogImpl.setReceiverCountryCode(aswmsgMessageLog.getReceiverCountryCode());
		aswmsgMessageLogImpl.setReceiverMinistryCode(aswmsgMessageLog.getReceiverMinistryCode());
		aswmsgMessageLogImpl.setReceiverOrganizationCode(aswmsgMessageLog.getReceiverOrganizationCode());
		aswmsgMessageLogImpl.setReceiverUnitCode(aswmsgMessageLog.getReceiverUnitCode());
		aswmsgMessageLogImpl.setDocumentType(aswmsgMessageLog.getDocumentType());
		aswmsgMessageLogImpl.setType(aswmsgMessageLog.getType());
		aswmsgMessageLogImpl.setFunction(aswmsgMessageLog.getFunction());
		aswmsgMessageLogImpl.setReference(aswmsgMessageLog.getReference());
		aswmsgMessageLogImpl.setPreReference(aswmsgMessageLog.getPreReference());
		aswmsgMessageLogImpl.setDocumentYear(aswmsgMessageLog.getDocumentYear());
		aswmsgMessageLogImpl.setSendDate(aswmsgMessageLog.getSendDate());
		aswmsgMessageLogImpl.setSignature(aswmsgMessageLog.getSignature());
		aswmsgMessageLogImpl.setSystemSignature(aswmsgMessageLog.getSystemSignature());
		aswmsgMessageLogImpl.setAllContent(aswmsgMessageLog.getAllContent());
		aswmsgMessageLogImpl.setCreatedTime(aswmsgMessageLog.getCreatedTime());
		aswmsgMessageLogImpl.setWebservice(aswmsgMessageLog.getWebservice());
		aswmsgMessageLogImpl.setValidated(aswmsgMessageLog.getValidated());
		aswmsgMessageLogImpl.setDescription(aswmsgMessageLog.getDescription());
		aswmsgMessageLogImpl.setValidationCode(aswmsgMessageLog.getValidationCode());
		aswmsgMessageLogImpl.setSoLanGui(aswmsgMessageLog.getSoLanGui());
		aswmsgMessageLogImpl.setFileLogId(aswmsgMessageLog.getFileLogId());

		return aswmsgMessageLogImpl;
	}

	/**
	 * Returns the aswmsg message log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg message log
	 * @return the aswmsg message log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAswmsgMessageLogException, SystemException {
		AswmsgMessageLog aswmsgMessageLog = fetchByPrimaryKey(primaryKey);

		if (aswmsgMessageLog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAswmsgMessageLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return aswmsgMessageLog;
	}

	/**
	 * Returns the aswmsg message log with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException} if it could not be found.
	 *
	 * @param Id the primary key of the aswmsg message log
	 * @return the aswmsg message log
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog findByPrimaryKey(long Id)
		throws NoSuchAswmsgMessageLogException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the aswmsg message log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg message log
	 * @return the aswmsg message log, or <code>null</code> if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AswmsgMessageLog aswmsgMessageLog = (AswmsgMessageLog)EntityCacheUtil.getResult(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgMessageLogImpl.class, primaryKey);

		if (aswmsgMessageLog == _nullAswmsgMessageLog) {
			return null;
		}

		if (aswmsgMessageLog == null) {
			Session session = null;

			try {
				session = openSession();

				aswmsgMessageLog = (AswmsgMessageLog)session.get(AswmsgMessageLogImpl.class,
						primaryKey);

				if (aswmsgMessageLog != null) {
					cacheResult(aswmsgMessageLog);
				}
				else {
					EntityCacheUtil.putResult(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgMessageLogImpl.class, primaryKey,
						_nullAswmsgMessageLog);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AswmsgMessageLogModelImpl.ENTITY_CACHE_ENABLED,
					AswmsgMessageLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return aswmsgMessageLog;
	}

	/**
	 * Returns the aswmsg message log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the aswmsg message log
	 * @return the aswmsg message log, or <code>null</code> if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the aswmsg message logs.
	 *
	 * @return the aswmsg message logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageLog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg message logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg message logs
	 * @param end the upper bound of the range of aswmsg message logs (not inclusive)
	 * @return the range of aswmsg message logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageLog> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg message logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg message logs
	 * @param end the upper bound of the range of aswmsg message logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of aswmsg message logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageLog> findAll(int start, int end,
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

		List<AswmsgMessageLog> list = (List<AswmsgMessageLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASWMSGMESSAGELOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASWMSGMESSAGELOG;

				if (pagination) {
					sql = sql.concat(AswmsgMessageLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AswmsgMessageLog>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgMessageLog>(list);
				}
				else {
					list = (List<AswmsgMessageLog>)QueryUtil.list(q,
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
	 * Removes all the aswmsg message logs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AswmsgMessageLog aswmsgMessageLog : findAll()) {
			remove(aswmsgMessageLog);
		}
	}

	/**
	 * Returns the number of aswmsg message logs.
	 *
	 * @return the number of aswmsg message logs
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

				Query q = session.createQuery(_SQL_COUNT_ASWMSGMESSAGELOG);

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
	 * Initializes the aswmsg message log persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AswmsgMessageLog>> listenersList = new ArrayList<ModelListener<AswmsgMessageLog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AswmsgMessageLog>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AswmsgMessageLogImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASWMSGMESSAGELOG = "SELECT aswmsgMessageLog FROM AswmsgMessageLog aswmsgMessageLog";
	private static final String _SQL_SELECT_ASWMSGMESSAGELOG_WHERE = "SELECT aswmsgMessageLog FROM AswmsgMessageLog aswmsgMessageLog WHERE ";
	private static final String _SQL_COUNT_ASWMSGMESSAGELOG = "SELECT COUNT(aswmsgMessageLog) FROM AswmsgMessageLog aswmsgMessageLog";
	private static final String _SQL_COUNT_ASWMSGMESSAGELOG_WHERE = "SELECT COUNT(aswmsgMessageLog) FROM AswmsgMessageLog aswmsgMessageLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "aswmsgMessageLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AswmsgMessageLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AswmsgMessageLog exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AswmsgMessageLogPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Version", "MessageId", "SenderName", "SenderIdentity",
				"SenderCountryCode", "SenderMinistryCode",
				"SenderOrganizationCode", "SenderUnitCode", "ReceiverName",
				"ReceiverIdentity", "ReceiverCountryCode",
				"ReceiverMinistryCode", "ReceiverOrganizationCode",
				"ReceiverUnitCode", "DocumentType", "Type", "Function",
				"Reference", "PreReference", "DocumentYear", "SendDate",
				"Signature", "SystemSignature", "AllContent", "CreatedTime",
				"Webservice", "Validated", "Description", "ValidationCode",
				"soLanGui", "fileLogId"
			});
	private static AswmsgMessageLog _nullAswmsgMessageLog = new AswmsgMessageLogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AswmsgMessageLog> toCacheModel() {
				return _nullAswmsgMessageLogCacheModel;
			}
		};

	private static CacheModel<AswmsgMessageLog> _nullAswmsgMessageLogCacheModel = new CacheModel<AswmsgMessageLog>() {
			@Override
			public AswmsgMessageLog toEntityModel() {
				return _nullAswmsgMessageLog;
			}
		};
}