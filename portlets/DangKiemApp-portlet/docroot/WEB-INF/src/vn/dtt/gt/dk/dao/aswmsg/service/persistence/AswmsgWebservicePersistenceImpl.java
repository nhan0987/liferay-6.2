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

import vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceImpl;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the aswmsg webservice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgWebservicePersistence
 * @see AswmsgWebserviceUtil
 * @generated
 */
public class AswmsgWebservicePersistenceImpl extends BasePersistenceImpl<AswmsgWebservice>
	implements AswmsgWebservicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AswmsgWebserviceUtil} to access the aswmsg webservice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AswmsgWebserviceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgWebserviceModelImpl.FINDER_CACHE_ENABLED,
			AswmsgWebserviceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgWebserviceModelImpl.FINDER_CACHE_ENABLED,
			AswmsgWebserviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgWebserviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AswmsgWebservicePersistenceImpl() {
		setModelClass(AswmsgWebservice.class);
	}

	/**
	 * Caches the aswmsg webservice in the entity cache if it is enabled.
	 *
	 * @param aswmsgWebservice the aswmsg webservice
	 */
	@Override
	public void cacheResult(AswmsgWebservice aswmsgWebservice) {
		EntityCacheUtil.putResult(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgWebserviceImpl.class, aswmsgWebservice.getPrimaryKey(),
			aswmsgWebservice);

		aswmsgWebservice.resetOriginalValues();
	}

	/**
	 * Caches the aswmsg webservices in the entity cache if it is enabled.
	 *
	 * @param aswmsgWebservices the aswmsg webservices
	 */
	@Override
	public void cacheResult(List<AswmsgWebservice> aswmsgWebservices) {
		for (AswmsgWebservice aswmsgWebservice : aswmsgWebservices) {
			if (EntityCacheUtil.getResult(
						AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgWebserviceImpl.class,
						aswmsgWebservice.getPrimaryKey()) == null) {
				cacheResult(aswmsgWebservice);
			}
			else {
				aswmsgWebservice.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all aswmsg webservices.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AswmsgWebserviceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AswmsgWebserviceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the aswmsg webservice.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AswmsgWebservice aswmsgWebservice) {
		EntityCacheUtil.removeResult(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgWebserviceImpl.class, aswmsgWebservice.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AswmsgWebservice> aswmsgWebservices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AswmsgWebservice aswmsgWebservice : aswmsgWebservices) {
			EntityCacheUtil.removeResult(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgWebserviceImpl.class, aswmsgWebservice.getPrimaryKey());
		}
	}

	/**
	 * Creates a new aswmsg webservice with the primary key. Does not add the aswmsg webservice to the database.
	 *
	 * @param Id the primary key for the new aswmsg webservice
	 * @return the new aswmsg webservice
	 */
	@Override
	public AswmsgWebservice create(long Id) {
		AswmsgWebservice aswmsgWebservice = new AswmsgWebserviceImpl();

		aswmsgWebservice.setNew(true);
		aswmsgWebservice.setPrimaryKey(Id);

		return aswmsgWebservice;
	}

	/**
	 * Removes the aswmsg webservice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the aswmsg webservice
	 * @return the aswmsg webservice that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgWebservice remove(long Id)
		throws NoSuchAswmsgWebserviceException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the aswmsg webservice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the aswmsg webservice
	 * @return the aswmsg webservice that was removed
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgWebservice remove(Serializable primaryKey)
		throws NoSuchAswmsgWebserviceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AswmsgWebservice aswmsgWebservice = (AswmsgWebservice)session.get(AswmsgWebserviceImpl.class,
					primaryKey);

			if (aswmsgWebservice == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAswmsgWebserviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(aswmsgWebservice);
		}
		catch (NoSuchAswmsgWebserviceException nsee) {
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
	protected AswmsgWebservice removeImpl(AswmsgWebservice aswmsgWebservice)
		throws SystemException {
		aswmsgWebservice = toUnwrappedModel(aswmsgWebservice);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(aswmsgWebservice)) {
				aswmsgWebservice = (AswmsgWebservice)session.get(AswmsgWebserviceImpl.class,
						aswmsgWebservice.getPrimaryKeyObj());
			}

			if (aswmsgWebservice != null) {
				session.delete(aswmsgWebservice);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (aswmsgWebservice != null) {
			clearCache(aswmsgWebservice);
		}

		return aswmsgWebservice;
	}

	@Override
	public AswmsgWebservice updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice aswmsgWebservice)
		throws SystemException {
		aswmsgWebservice = toUnwrappedModel(aswmsgWebservice);

		boolean isNew = aswmsgWebservice.isNew();

		Session session = null;

		try {
			session = openSession();

			if (aswmsgWebservice.isNew()) {
				session.save(aswmsgWebservice);

				aswmsgWebservice.setNew(false);
			}
			else {
				session.merge(aswmsgWebservice);
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

		EntityCacheUtil.putResult(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
			AswmsgWebserviceImpl.class, aswmsgWebservice.getPrimaryKey(),
			aswmsgWebservice);

		return aswmsgWebservice;
	}

	protected AswmsgWebservice toUnwrappedModel(
		AswmsgWebservice aswmsgWebservice) {
		if (aswmsgWebservice instanceof AswmsgWebserviceImpl) {
			return aswmsgWebservice;
		}

		AswmsgWebserviceImpl aswmsgWebserviceImpl = new AswmsgWebserviceImpl();

		aswmsgWebserviceImpl.setNew(aswmsgWebservice.isNew());
		aswmsgWebserviceImpl.setPrimaryKey(aswmsgWebservice.getPrimaryKey());

		aswmsgWebserviceImpl.setId(aswmsgWebservice.getId());
		aswmsgWebserviceImpl.setServiceCode(aswmsgWebservice.getServiceCode());
		aswmsgWebserviceImpl.setServiceName(aswmsgWebservice.getServiceName());
		aswmsgWebserviceImpl.setServiceURL(aswmsgWebservice.getServiceURL());
		aswmsgWebserviceImpl.setUserName(aswmsgWebservice.getUserName());
		aswmsgWebserviceImpl.setPassword(aswmsgWebservice.getPassword());
		aswmsgWebserviceImpl.setDomain(aswmsgWebservice.getDomain());

		return aswmsgWebserviceImpl;
	}

	/**
	 * Returns the aswmsg webservice with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg webservice
	 * @return the aswmsg webservice
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgWebservice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAswmsgWebserviceException, SystemException {
		AswmsgWebservice aswmsgWebservice = fetchByPrimaryKey(primaryKey);

		if (aswmsgWebservice == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAswmsgWebserviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return aswmsgWebservice;
	}

	/**
	 * Returns the aswmsg webservice with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException} if it could not be found.
	 *
	 * @param Id the primary key of the aswmsg webservice
	 * @return the aswmsg webservice
	 * @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgWebservice findByPrimaryKey(long Id)
		throws NoSuchAswmsgWebserviceException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the aswmsg webservice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the aswmsg webservice
	 * @return the aswmsg webservice, or <code>null</code> if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgWebservice fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AswmsgWebservice aswmsgWebservice = (AswmsgWebservice)EntityCacheUtil.getResult(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
				AswmsgWebserviceImpl.class, primaryKey);

		if (aswmsgWebservice == _nullAswmsgWebservice) {
			return null;
		}

		if (aswmsgWebservice == null) {
			Session session = null;

			try {
				session = openSession();

				aswmsgWebservice = (AswmsgWebservice)session.get(AswmsgWebserviceImpl.class,
						primaryKey);

				if (aswmsgWebservice != null) {
					cacheResult(aswmsgWebservice);
				}
				else {
					EntityCacheUtil.putResult(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
						AswmsgWebserviceImpl.class, primaryKey,
						_nullAswmsgWebservice);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AswmsgWebserviceModelImpl.ENTITY_CACHE_ENABLED,
					AswmsgWebserviceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return aswmsgWebservice;
	}

	/**
	 * Returns the aswmsg webservice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the aswmsg webservice
	 * @return the aswmsg webservice, or <code>null</code> if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgWebservice fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the aswmsg webservices.
	 *
	 * @return the aswmsg webservices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgWebservice> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the aswmsg webservices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg webservices
	 * @param end the upper bound of the range of aswmsg webservices (not inclusive)
	 * @return the range of aswmsg webservices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgWebservice> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the aswmsg webservices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg webservices
	 * @param end the upper bound of the range of aswmsg webservices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of aswmsg webservices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgWebservice> findAll(int start, int end,
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

		List<AswmsgWebservice> list = (List<AswmsgWebservice>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASWMSGWEBSERVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASWMSGWEBSERVICE;

				if (pagination) {
					sql = sql.concat(AswmsgWebserviceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AswmsgWebservice>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AswmsgWebservice>(list);
				}
				else {
					list = (List<AswmsgWebservice>)QueryUtil.list(q,
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
	 * Removes all the aswmsg webservices from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AswmsgWebservice aswmsgWebservice : findAll()) {
			remove(aswmsgWebservice);
		}
	}

	/**
	 * Returns the number of aswmsg webservices.
	 *
	 * @return the number of aswmsg webservices
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

				Query q = session.createQuery(_SQL_COUNT_ASWMSGWEBSERVICE);

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
	 * Initializes the aswmsg webservice persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AswmsgWebservice>> listenersList = new ArrayList<ModelListener<AswmsgWebservice>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AswmsgWebservice>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AswmsgWebserviceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASWMSGWEBSERVICE = "SELECT aswmsgWebservice FROM AswmsgWebservice aswmsgWebservice";
	private static final String _SQL_COUNT_ASWMSGWEBSERVICE = "SELECT COUNT(aswmsgWebservice) FROM AswmsgWebservice aswmsgWebservice";
	private static final String _ORDER_BY_ENTITY_ALIAS = "aswmsgWebservice.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AswmsgWebservice exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AswmsgWebservicePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "ServiceCode", "ServiceName", "ServiceURL", "UserName",
				"Password", "Domain"
			});
	private static AswmsgWebservice _nullAswmsgWebservice = new AswmsgWebserviceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AswmsgWebservice> toCacheModel() {
				return _nullAswmsgWebserviceCacheModel;
			}
		};

	private static CacheModel<AswmsgWebservice> _nullAswmsgWebserviceCacheModel = new CacheModel<AswmsgWebservice>() {
			@Override
			public AswmsgWebservice toEntityModel() {
				return _nullAswmsgWebservice;
			}
		};
}