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

package vn.dtt.gt.dk.dao.common.service.persistence;

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

import vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException;
import vn.dtt.gt.dk.dao.common.model.DmDataVersion;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionImpl;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm data version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataVersionPersistence
 * @see DmDataVersionUtil
 * @generated
 */
public class DmDataVersionPersistenceImpl extends BasePersistenceImpl<DmDataVersion>
	implements DmDataVersionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmDataVersionUtil} to access the dm data version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmDataVersionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmDataVersionModelImpl.FINDER_CACHE_ENABLED,
			DmDataVersionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmDataVersionModelImpl.FINDER_CACHE_ENABLED,
			DmDataVersionImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmDataVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DmDataVersionPersistenceImpl() {
		setModelClass(DmDataVersion.class);
	}

	/**
	 * Caches the dm data version in the entity cache if it is enabled.
	 *
	 * @param dmDataVersion the dm data version
	 */
	@Override
	public void cacheResult(DmDataVersion dmDataVersion) {
		EntityCacheUtil.putResult(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmDataVersionImpl.class, dmDataVersion.getPrimaryKey(),
			dmDataVersion);

		dmDataVersion.resetOriginalValues();
	}

	/**
	 * Caches the dm data versions in the entity cache if it is enabled.
	 *
	 * @param dmDataVersions the dm data versions
	 */
	@Override
	public void cacheResult(List<DmDataVersion> dmDataVersions) {
		for (DmDataVersion dmDataVersion : dmDataVersions) {
			if (EntityCacheUtil.getResult(
						DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
						DmDataVersionImpl.class, dmDataVersion.getPrimaryKey()) == null) {
				cacheResult(dmDataVersion);
			}
			else {
				dmDataVersion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm data versions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmDataVersionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmDataVersionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm data version.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmDataVersion dmDataVersion) {
		EntityCacheUtil.removeResult(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmDataVersionImpl.class, dmDataVersion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmDataVersion> dmDataVersions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmDataVersion dmDataVersion : dmDataVersions) {
			EntityCacheUtil.removeResult(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
				DmDataVersionImpl.class, dmDataVersion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm data version with the primary key. Does not add the dm data version to the database.
	 *
	 * @param Id the primary key for the new dm data version
	 * @return the new dm data version
	 */
	@Override
	public DmDataVersion create(long Id) {
		DmDataVersion dmDataVersion = new DmDataVersionImpl();

		dmDataVersion.setNew(true);
		dmDataVersion.setPrimaryKey(Id);

		return dmDataVersion;
	}

	/**
	 * Removes the dm data version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the dm data version
	 * @return the dm data version that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataVersion remove(long Id)
		throws NoSuchDmDataVersionException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the dm data version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm data version
	 * @return the dm data version that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataVersion remove(Serializable primaryKey)
		throws NoSuchDmDataVersionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmDataVersion dmDataVersion = (DmDataVersion)session.get(DmDataVersionImpl.class,
					primaryKey);

			if (dmDataVersion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmDataVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmDataVersion);
		}
		catch (NoSuchDmDataVersionException nsee) {
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
	protected DmDataVersion removeImpl(DmDataVersion dmDataVersion)
		throws SystemException {
		dmDataVersion = toUnwrappedModel(dmDataVersion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmDataVersion)) {
				dmDataVersion = (DmDataVersion)session.get(DmDataVersionImpl.class,
						dmDataVersion.getPrimaryKeyObj());
			}

			if (dmDataVersion != null) {
				session.delete(dmDataVersion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmDataVersion != null) {
			clearCache(dmDataVersion);
		}

		return dmDataVersion;
	}

	@Override
	public DmDataVersion updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataVersion dmDataVersion)
		throws SystemException {
		dmDataVersion = toUnwrappedModel(dmDataVersion);

		boolean isNew = dmDataVersion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmDataVersion.isNew()) {
				session.save(dmDataVersion);

				dmDataVersion.setNew(false);
			}
			else {
				session.merge(dmDataVersion);
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

		EntityCacheUtil.putResult(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
			DmDataVersionImpl.class, dmDataVersion.getPrimaryKey(),
			dmDataVersion);

		return dmDataVersion;
	}

	protected DmDataVersion toUnwrappedModel(DmDataVersion dmDataVersion) {
		if (dmDataVersion instanceof DmDataVersionImpl) {
			return dmDataVersion;
		}

		DmDataVersionImpl dmDataVersionImpl = new DmDataVersionImpl();

		dmDataVersionImpl.setNew(dmDataVersion.isNew());
		dmDataVersionImpl.setPrimaryKey(dmDataVersion.getPrimaryKey());

		dmDataVersionImpl.setId(dmDataVersion.getId());
		dmDataVersionImpl.setDataGroupId(dmDataVersion.getDataGroupId());
		dmDataVersionImpl.setVersion(dmDataVersion.getVersion());
		dmDataVersionImpl.setIssuedTime(dmDataVersion.getIssuedTime());
		dmDataVersionImpl.setValidateDFrom(dmDataVersion.getValidateDFrom());
		dmDataVersionImpl.setValidatedTo(dmDataVersion.getValidatedTo());

		return dmDataVersionImpl;
	}

	/**
	 * Returns the dm data version with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data version
	 * @return the dm data version
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataVersion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmDataVersionException, SystemException {
		DmDataVersion dmDataVersion = fetchByPrimaryKey(primaryKey);

		if (dmDataVersion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmDataVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmDataVersion;
	}

	/**
	 * Returns the dm data version with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException} if it could not be found.
	 *
	 * @param Id the primary key of the dm data version
	 * @return the dm data version
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataVersion findByPrimaryKey(long Id)
		throws NoSuchDmDataVersionException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the dm data version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data version
	 * @return the dm data version, or <code>null</code> if a dm data version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataVersion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmDataVersion dmDataVersion = (DmDataVersion)EntityCacheUtil.getResult(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
				DmDataVersionImpl.class, primaryKey);

		if (dmDataVersion == _nullDmDataVersion) {
			return null;
		}

		if (dmDataVersion == null) {
			Session session = null;

			try {
				session = openSession();

				dmDataVersion = (DmDataVersion)session.get(DmDataVersionImpl.class,
						primaryKey);

				if (dmDataVersion != null) {
					cacheResult(dmDataVersion);
				}
				else {
					EntityCacheUtil.putResult(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
						DmDataVersionImpl.class, primaryKey, _nullDmDataVersion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmDataVersionModelImpl.ENTITY_CACHE_ENABLED,
					DmDataVersionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmDataVersion;
	}

	/**
	 * Returns the dm data version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the dm data version
	 * @return the dm data version, or <code>null</code> if a dm data version with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataVersion fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the dm data versions.
	 *
	 * @return the dm data versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataVersion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data versions
	 * @param end the upper bound of the range of dm data versions (not inclusive)
	 * @return the range of dm data versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataVersion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data versions
	 * @param end the upper bound of the range of dm data versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm data versions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataVersion> findAll(int start, int end,
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

		List<DmDataVersion> list = (List<DmDataVersion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMDATAVERSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMDATAVERSION;

				if (pagination) {
					sql = sql.concat(DmDataVersionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmDataVersion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataVersion>(list);
				}
				else {
					list = (List<DmDataVersion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm data versions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmDataVersion dmDataVersion : findAll()) {
			remove(dmDataVersion);
		}
	}

	/**
	 * Returns the number of dm data versions.
	 *
	 * @return the number of dm data versions
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

				Query q = session.createQuery(_SQL_COUNT_DMDATAVERSION);

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
	 * Initializes the dm data version persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.DmDataVersion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmDataVersion>> listenersList = new ArrayList<ModelListener<DmDataVersion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmDataVersion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmDataVersionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMDATAVERSION = "SELECT dmDataVersion FROM DmDataVersion dmDataVersion";
	private static final String _SQL_COUNT_DMDATAVERSION = "SELECT COUNT(dmDataVersion) FROM DmDataVersion dmDataVersion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmDataVersion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmDataVersion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmDataVersionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "DataGroupId", "Version", "IssuedTime", "ValidateDFrom",
				"ValidatedTo"
			});
	private static DmDataVersion _nullDmDataVersion = new DmDataVersionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmDataVersion> toCacheModel() {
				return _nullDmDataVersionCacheModel;
			}
		};

	private static CacheModel<DmDataVersion> _nullDmDataVersionCacheModel = new CacheModel<DmDataVersion>() {
			@Override
			public DmDataVersion toEntityModel() {
				return _nullDmDataVersion;
			}
		};
}