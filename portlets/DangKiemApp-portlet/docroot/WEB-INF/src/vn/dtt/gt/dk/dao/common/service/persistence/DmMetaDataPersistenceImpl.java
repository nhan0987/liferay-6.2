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

import vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException;
import vn.dtt.gt.dk.dao.common.model.DmMetaData;
import vn.dtt.gt.dk.dao.common.model.impl.DmMetaDataImpl;
import vn.dtt.gt.dk.dao.common.model.impl.DmMetaDataModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm meta data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmMetaDataPersistence
 * @see DmMetaDataUtil
 * @generated
 */
public class DmMetaDataPersistenceImpl extends BasePersistenceImpl<DmMetaData>
	implements DmMetaDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmMetaDataUtil} to access the dm meta data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmMetaDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DmMetaDataModelImpl.FINDER_CACHE_ENABLED, DmMetaDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DmMetaDataModelImpl.FINDER_CACHE_ENABLED, DmMetaDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DmMetaDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DmMetaDataPersistenceImpl() {
		setModelClass(DmMetaData.class);
	}

	/**
	 * Caches the dm meta data in the entity cache if it is enabled.
	 *
	 * @param dmMetaData the dm meta data
	 */
	@Override
	public void cacheResult(DmMetaData dmMetaData) {
		EntityCacheUtil.putResult(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DmMetaDataImpl.class, dmMetaData.getPrimaryKey(), dmMetaData);

		dmMetaData.resetOriginalValues();
	}

	/**
	 * Caches the dm meta datas in the entity cache if it is enabled.
	 *
	 * @param dmMetaDatas the dm meta datas
	 */
	@Override
	public void cacheResult(List<DmMetaData> dmMetaDatas) {
		for (DmMetaData dmMetaData : dmMetaDatas) {
			if (EntityCacheUtil.getResult(
						DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
						DmMetaDataImpl.class, dmMetaData.getPrimaryKey()) == null) {
				cacheResult(dmMetaData);
			}
			else {
				dmMetaData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm meta datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmMetaDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmMetaDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm meta data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmMetaData dmMetaData) {
		EntityCacheUtil.removeResult(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DmMetaDataImpl.class, dmMetaData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmMetaData> dmMetaDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmMetaData dmMetaData : dmMetaDatas) {
			EntityCacheUtil.removeResult(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
				DmMetaDataImpl.class, dmMetaData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm meta data with the primary key. Does not add the dm meta data to the database.
	 *
	 * @param Id the primary key for the new dm meta data
	 * @return the new dm meta data
	 */
	@Override
	public DmMetaData create(long Id) {
		DmMetaData dmMetaData = new DmMetaDataImpl();

		dmMetaData.setNew(true);
		dmMetaData.setPrimaryKey(Id);

		return dmMetaData;
	}

	/**
	 * Removes the dm meta data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the dm meta data
	 * @return the dm meta data that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException if a dm meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMetaData remove(long Id)
		throws NoSuchDmMetaDataException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the dm meta data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm meta data
	 * @return the dm meta data that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException if a dm meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMetaData remove(Serializable primaryKey)
		throws NoSuchDmMetaDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmMetaData dmMetaData = (DmMetaData)session.get(DmMetaDataImpl.class,
					primaryKey);

			if (dmMetaData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmMetaDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmMetaData);
		}
		catch (NoSuchDmMetaDataException nsee) {
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
	protected DmMetaData removeImpl(DmMetaData dmMetaData)
		throws SystemException {
		dmMetaData = toUnwrappedModel(dmMetaData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmMetaData)) {
				dmMetaData = (DmMetaData)session.get(DmMetaDataImpl.class,
						dmMetaData.getPrimaryKeyObj());
			}

			if (dmMetaData != null) {
				session.delete(dmMetaData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmMetaData != null) {
			clearCache(dmMetaData);
		}

		return dmMetaData;
	}

	@Override
	public DmMetaData updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmMetaData dmMetaData)
		throws SystemException {
		dmMetaData = toUnwrappedModel(dmMetaData);

		boolean isNew = dmMetaData.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmMetaData.isNew()) {
				session.save(dmMetaData);

				dmMetaData.setNew(false);
			}
			else {
				session.merge(dmMetaData);
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

		EntityCacheUtil.putResult(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
			DmMetaDataImpl.class, dmMetaData.getPrimaryKey(), dmMetaData);

		return dmMetaData;
	}

	protected DmMetaData toUnwrappedModel(DmMetaData dmMetaData) {
		if (dmMetaData instanceof DmMetaDataImpl) {
			return dmMetaData;
		}

		DmMetaDataImpl dmMetaDataImpl = new DmMetaDataImpl();

		dmMetaDataImpl.setNew(dmMetaData.isNew());
		dmMetaDataImpl.setPrimaryKey(dmMetaData.getPrimaryKey());

		dmMetaDataImpl.setId(dmMetaData.getId());
		dmMetaDataImpl.setEntity(dmMetaData.getEntity());
		dmMetaDataImpl.setFieldCode(dmMetaData.getFieldCode());
		dmMetaDataImpl.setFieldName(dmMetaData.getFieldName());
		dmMetaDataImpl.setFieldAlterName(dmMetaData.getFieldAlterName());
		dmMetaDataImpl.setFieldDescription(dmMetaData.getFieldDescription());
		dmMetaDataImpl.setFieldDataSet(dmMetaData.getFieldDataSet());

		return dmMetaDataImpl;
	}

	/**
	 * Returns the dm meta data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm meta data
	 * @return the dm meta data
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException if a dm meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMetaData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmMetaDataException, SystemException {
		DmMetaData dmMetaData = fetchByPrimaryKey(primaryKey);

		if (dmMetaData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmMetaDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmMetaData;
	}

	/**
	 * Returns the dm meta data with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException} if it could not be found.
	 *
	 * @param Id the primary key of the dm meta data
	 * @return the dm meta data
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException if a dm meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMetaData findByPrimaryKey(long Id)
		throws NoSuchDmMetaDataException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the dm meta data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm meta data
	 * @return the dm meta data, or <code>null</code> if a dm meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMetaData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmMetaData dmMetaData = (DmMetaData)EntityCacheUtil.getResult(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
				DmMetaDataImpl.class, primaryKey);

		if (dmMetaData == _nullDmMetaData) {
			return null;
		}

		if (dmMetaData == null) {
			Session session = null;

			try {
				session = openSession();

				dmMetaData = (DmMetaData)session.get(DmMetaDataImpl.class,
						primaryKey);

				if (dmMetaData != null) {
					cacheResult(dmMetaData);
				}
				else {
					EntityCacheUtil.putResult(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
						DmMetaDataImpl.class, primaryKey, _nullDmMetaData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmMetaDataModelImpl.ENTITY_CACHE_ENABLED,
					DmMetaDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmMetaData;
	}

	/**
	 * Returns the dm meta data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the dm meta data
	 * @return the dm meta data, or <code>null</code> if a dm meta data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmMetaData fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the dm meta datas.
	 *
	 * @return the dm meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMetaData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm meta datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm meta datas
	 * @param end the upper bound of the range of dm meta datas (not inclusive)
	 * @return the range of dm meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMetaData> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm meta datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm meta datas
	 * @param end the upper bound of the range of dm meta datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm meta datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmMetaData> findAll(int start, int end,
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

		List<DmMetaData> list = (List<DmMetaData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMMETADATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMMETADATA;

				if (pagination) {
					sql = sql.concat(DmMetaDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmMetaData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmMetaData>(list);
				}
				else {
					list = (List<DmMetaData>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm meta datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmMetaData dmMetaData : findAll()) {
			remove(dmMetaData);
		}
	}

	/**
	 * Returns the number of dm meta datas.
	 *
	 * @return the number of dm meta datas
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

				Query q = session.createQuery(_SQL_COUNT_DMMETADATA);

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
	 * Initializes the dm meta data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.DmMetaData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmMetaData>> listenersList = new ArrayList<ModelListener<DmMetaData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmMetaData>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmMetaDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMMETADATA = "SELECT dmMetaData FROM DmMetaData dmMetaData";
	private static final String _SQL_COUNT_DMMETADATA = "SELECT COUNT(dmMetaData) FROM DmMetaData dmMetaData";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmMetaData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmMetaData exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmMetaDataPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Entity", "FieldCode", "FieldName", "FieldAlterName",
				"FieldDescription", "FieldDataSet"
			});
	private static DmMetaData _nullDmMetaData = new DmMetaDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmMetaData> toCacheModel() {
				return _nullDmMetaDataCacheModel;
			}
		};

	private static CacheModel<DmMetaData> _nullDmMetaDataCacheModel = new CacheModel<DmMetaData>() {
			@Override
			public DmMetaData toEntityModel() {
				return _nullDmMetaData;
			}
		};
}