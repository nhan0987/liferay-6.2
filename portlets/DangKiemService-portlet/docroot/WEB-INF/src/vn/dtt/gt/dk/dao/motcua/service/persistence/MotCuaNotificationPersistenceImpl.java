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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua notification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaNotificationPersistence
 * @see MotCuaNotificationUtil
 * @generated
 */
public class MotCuaNotificationPersistenceImpl extends BasePersistenceImpl<MotCuaNotification>
	implements MotCuaNotificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaNotificationUtil} to access the mot cua notification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaNotificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNotificationModelImpl.FINDER_CACHE_ENABLED,
			MotCuaNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNotificationModelImpl.FINDER_CACHE_ENABLED,
			MotCuaNotificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNotificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MotCuaNotificationPersistenceImpl() {
		setModelClass(MotCuaNotification.class);
	}

	/**
	 * Caches the mot cua notification in the entity cache if it is enabled.
	 *
	 * @param motCuaNotification the mot cua notification
	 */
	@Override
	public void cacheResult(MotCuaNotification motCuaNotification) {
		EntityCacheUtil.putResult(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNotificationImpl.class, motCuaNotification.getPrimaryKey(),
			motCuaNotification);

		motCuaNotification.resetOriginalValues();
	}

	/**
	 * Caches the mot cua notifications in the entity cache if it is enabled.
	 *
	 * @param motCuaNotifications the mot cua notifications
	 */
	@Override
	public void cacheResult(List<MotCuaNotification> motCuaNotifications) {
		for (MotCuaNotification motCuaNotification : motCuaNotifications) {
			if (EntityCacheUtil.getResult(
						MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaNotificationImpl.class,
						motCuaNotification.getPrimaryKey()) == null) {
				cacheResult(motCuaNotification);
			}
			else {
				motCuaNotification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua notifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaNotificationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaNotificationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua notification.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaNotification motCuaNotification) {
		EntityCacheUtil.removeResult(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNotificationImpl.class, motCuaNotification.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MotCuaNotification> motCuaNotifications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaNotification motCuaNotification : motCuaNotifications) {
			EntityCacheUtil.removeResult(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaNotificationImpl.class, motCuaNotification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mot cua notification with the primary key. Does not add the mot cua notification to the database.
	 *
	 * @param id the primary key for the new mot cua notification
	 * @return the new mot cua notification
	 */
	@Override
	public MotCuaNotification create(long id) {
		MotCuaNotification motCuaNotification = new MotCuaNotificationImpl();

		motCuaNotification.setNew(true);
		motCuaNotification.setPrimaryKey(id);

		return motCuaNotification;
	}

	/**
	 * Removes the mot cua notification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua notification
	 * @return the mot cua notification that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException if a mot cua notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNotification remove(long id)
		throws NoSuchMotCuaNotificationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua notification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua notification
	 * @return the mot cua notification that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException if a mot cua notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNotification remove(Serializable primaryKey)
		throws NoSuchMotCuaNotificationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaNotification motCuaNotification = (MotCuaNotification)session.get(MotCuaNotificationImpl.class,
					primaryKey);

			if (motCuaNotification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaNotificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaNotification);
		}
		catch (NoSuchMotCuaNotificationException nsee) {
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
	protected MotCuaNotification removeImpl(
		MotCuaNotification motCuaNotification) throws SystemException {
		motCuaNotification = toUnwrappedModel(motCuaNotification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaNotification)) {
				motCuaNotification = (MotCuaNotification)session.get(MotCuaNotificationImpl.class,
						motCuaNotification.getPrimaryKeyObj());
			}

			if (motCuaNotification != null) {
				session.delete(motCuaNotification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaNotification != null) {
			clearCache(motCuaNotification);
		}

		return motCuaNotification;
	}

	@Override
	public MotCuaNotification updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification motCuaNotification)
		throws SystemException {
		motCuaNotification = toUnwrappedModel(motCuaNotification);

		boolean isNew = motCuaNotification.isNew();

		Session session = null;

		try {
			session = openSession();

			if (motCuaNotification.isNew()) {
				session.save(motCuaNotification);

				motCuaNotification.setNew(false);
			}
			else {
				session.merge(motCuaNotification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaNotificationImpl.class, motCuaNotification.getPrimaryKey(),
			motCuaNotification);

		return motCuaNotification;
	}

	protected MotCuaNotification toUnwrappedModel(
		MotCuaNotification motCuaNotification) {
		if (motCuaNotification instanceof MotCuaNotificationImpl) {
			return motCuaNotification;
		}

		MotCuaNotificationImpl motCuaNotificationImpl = new MotCuaNotificationImpl();

		motCuaNotificationImpl.setNew(motCuaNotification.isNew());
		motCuaNotificationImpl.setPrimaryKey(motCuaNotification.getPrimaryKey());

		motCuaNotificationImpl.setId(motCuaNotification.getId());
		motCuaNotificationImpl.setDossierid(motCuaNotification.getDossierid());
		motCuaNotificationImpl.setOrganization(motCuaNotification.getOrganization());
		motCuaNotificationImpl.setDivision(motCuaNotification.getDivision());
		motCuaNotificationImpl.setOfficerName(motCuaNotification.getOfficerName());
		motCuaNotificationImpl.setMessageID(motCuaNotification.getMessageID());
		motCuaNotificationImpl.setMessageType(motCuaNotification.getMessageType());
		motCuaNotificationImpl.setPhieuxulyphuId(motCuaNotification.getPhieuxulyphuId());
		motCuaNotificationImpl.setResponse(motCuaNotification.getResponse());
		motCuaNotificationImpl.setResponseTime(motCuaNotification.getResponseTime());
		motCuaNotificationImpl.setRequestContent(motCuaNotification.getRequestContent());
		motCuaNotificationImpl.setRequestTime(motCuaNotification.getRequestTime());
		motCuaNotificationImpl.setRequestSender(motCuaNotification.getRequestSender());
		motCuaNotificationImpl.setIsReply(motCuaNotification.getIsReply());

		return motCuaNotificationImpl;
	}

	/**
	 * Returns the mot cua notification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua notification
	 * @return the mot cua notification
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException if a mot cua notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNotification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaNotificationException, SystemException {
		MotCuaNotification motCuaNotification = fetchByPrimaryKey(primaryKey);

		if (motCuaNotification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaNotificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaNotification;
	}

	/**
	 * Returns the mot cua notification with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua notification
	 * @return the mot cua notification
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException if a mot cua notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNotification findByPrimaryKey(long id)
		throws NoSuchMotCuaNotificationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua notification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua notification
	 * @return the mot cua notification, or <code>null</code> if a mot cua notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNotification fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaNotification motCuaNotification = (MotCuaNotification)EntityCacheUtil.getResult(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaNotificationImpl.class, primaryKey);

		if (motCuaNotification == _nullMotCuaNotification) {
			return null;
		}

		if (motCuaNotification == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaNotification = (MotCuaNotification)session.get(MotCuaNotificationImpl.class,
						primaryKey);

				if (motCuaNotification != null) {
					cacheResult(motCuaNotification);
				}
				else {
					EntityCacheUtil.putResult(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaNotificationImpl.class, primaryKey,
						_nullMotCuaNotification);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaNotificationModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaNotificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaNotification;
	}

	/**
	 * Returns the mot cua notification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua notification
	 * @return the mot cua notification, or <code>null</code> if a mot cua notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaNotification fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua notifications.
	 *
	 * @return the mot cua notifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaNotification> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua notifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua notifications
	 * @param end the upper bound of the range of mot cua notifications (not inclusive)
	 * @return the range of mot cua notifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaNotification> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua notifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua notifications
	 * @param end the upper bound of the range of mot cua notifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua notifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaNotification> findAll(int start, int end,
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

		List<MotCuaNotification> list = (List<MotCuaNotification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUANOTIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUANOTIFICATION;

				if (pagination) {
					sql = sql.concat(MotCuaNotificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaNotification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaNotification>(list);
				}
				else {
					list = (List<MotCuaNotification>)QueryUtil.list(q,
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
	 * Removes all the mot cua notifications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaNotification motCuaNotification : findAll()) {
			remove(motCuaNotification);
		}
	}

	/**
	 * Returns the number of mot cua notifications.
	 *
	 * @return the number of mot cua notifications
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUANOTIFICATION);

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
	 * Initializes the mot cua notification persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaNotification>> listenersList = new ArrayList<ModelListener<MotCuaNotification>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaNotification>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaNotificationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUANOTIFICATION = "SELECT motCuaNotification FROM MotCuaNotification motCuaNotification";
	private static final String _SQL_COUNT_MOTCUANOTIFICATION = "SELECT COUNT(motCuaNotification) FROM MotCuaNotification motCuaNotification";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaNotification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaNotification exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaNotificationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dossierid", "officerName", "messageID", "messageType",
				"phieuxulyphuId", "responseTime", "requestContent",
				"requestTime", "requestSender", "isReply"
			});
	private static MotCuaNotification _nullMotCuaNotification = new MotCuaNotificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaNotification> toCacheModel() {
				return _nullMotCuaNotificationCacheModel;
			}
		};

	private static CacheModel<MotCuaNotification> _nullMotCuaNotificationCacheModel =
		new CacheModel<MotCuaNotification>() {
			@Override
			public MotCuaNotification toEntityModel() {
				return _nullMotCuaNotification;
			}
		};
}