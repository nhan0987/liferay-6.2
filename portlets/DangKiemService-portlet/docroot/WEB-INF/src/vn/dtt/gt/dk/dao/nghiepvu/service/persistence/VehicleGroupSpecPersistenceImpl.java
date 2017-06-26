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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vehicle group spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehicleGroupSpecPersistence
 * @see VehicleGroupSpecUtil
 * @generated
 */
public class VehicleGroupSpecPersistenceImpl extends BasePersistenceImpl<VehicleGroupSpec>
	implements VehicleGroupSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleGroupSpecUtil} to access the vehicle group spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleGroupSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupSpecModelImpl.FINDER_CACHE_ENABLED,
			VehicleGroupSpecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupSpecModelImpl.FINDER_CACHE_ENABLED,
			VehicleGroupSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VehicleGroupSpecPersistenceImpl() {
		setModelClass(VehicleGroupSpec.class);
	}

	/**
	 * Caches the vehicle group spec in the entity cache if it is enabled.
	 *
	 * @param vehicleGroupSpec the vehicle group spec
	 */
	@Override
	public void cacheResult(VehicleGroupSpec vehicleGroupSpec) {
		EntityCacheUtil.putResult(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupSpecImpl.class, vehicleGroupSpec.getPrimaryKey(),
			vehicleGroupSpec);

		vehicleGroupSpec.resetOriginalValues();
	}

	/**
	 * Caches the vehicle group specs in the entity cache if it is enabled.
	 *
	 * @param vehicleGroupSpecs the vehicle group specs
	 */
	@Override
	public void cacheResult(List<VehicleGroupSpec> vehicleGroupSpecs) {
		for (VehicleGroupSpec vehicleGroupSpec : vehicleGroupSpecs) {
			if (EntityCacheUtil.getResult(
						VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
						VehicleGroupSpecImpl.class,
						vehicleGroupSpec.getPrimaryKey()) == null) {
				cacheResult(vehicleGroupSpec);
			}
			else {
				vehicleGroupSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle group specs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleGroupSpecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleGroupSpecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle group spec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehicleGroupSpec vehicleGroupSpec) {
		EntityCacheUtil.removeResult(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupSpecImpl.class, vehicleGroupSpec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VehicleGroupSpec> vehicleGroupSpecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehicleGroupSpec vehicleGroupSpec : vehicleGroupSpecs) {
			EntityCacheUtil.removeResult(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
				VehicleGroupSpecImpl.class, vehicleGroupSpec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vehicle group spec with the primary key. Does not add the vehicle group spec to the database.
	 *
	 * @param id the primary key for the new vehicle group spec
	 * @return the new vehicle group spec
	 */
	@Override
	public VehicleGroupSpec create(long id) {
		VehicleGroupSpec vehicleGroupSpec = new VehicleGroupSpecImpl();

		vehicleGroupSpec.setNew(true);
		vehicleGroupSpec.setPrimaryKey(id);

		return vehicleGroupSpec;
	}

	/**
	 * Removes the vehicle group spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehicle group spec
	 * @return the vehicle group spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException if a vehicle group spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupSpec remove(long id)
		throws NoSuchVehicleGroupSpecException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehicle group spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle group spec
	 * @return the vehicle group spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException if a vehicle group spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupSpec remove(Serializable primaryKey)
		throws NoSuchVehicleGroupSpecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehicleGroupSpec vehicleGroupSpec = (VehicleGroupSpec)session.get(VehicleGroupSpecImpl.class,
					primaryKey);

			if (vehicleGroupSpec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleGroupSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicleGroupSpec);
		}
		catch (NoSuchVehicleGroupSpecException nsee) {
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
	protected VehicleGroupSpec removeImpl(VehicleGroupSpec vehicleGroupSpec)
		throws SystemException {
		vehicleGroupSpec = toUnwrappedModel(vehicleGroupSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicleGroupSpec)) {
				vehicleGroupSpec = (VehicleGroupSpec)session.get(VehicleGroupSpecImpl.class,
						vehicleGroupSpec.getPrimaryKeyObj());
			}

			if (vehicleGroupSpec != null) {
				session.delete(vehicleGroupSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicleGroupSpec != null) {
			clearCache(vehicleGroupSpec);
		}

		return vehicleGroupSpec;
	}

	@Override
	public VehicleGroupSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec vehicleGroupSpec)
		throws SystemException {
		vehicleGroupSpec = toUnwrappedModel(vehicleGroupSpec);

		boolean isNew = vehicleGroupSpec.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vehicleGroupSpec.isNew()) {
				session.save(vehicleGroupSpec);

				vehicleGroupSpec.setNew(false);
			}
			else {
				session.merge(vehicleGroupSpec);
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

		EntityCacheUtil.putResult(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupSpecImpl.class, vehicleGroupSpec.getPrimaryKey(),
			vehicleGroupSpec);

		return vehicleGroupSpec;
	}

	protected VehicleGroupSpec toUnwrappedModel(
		VehicleGroupSpec vehicleGroupSpec) {
		if (vehicleGroupSpec instanceof VehicleGroupSpecImpl) {
			return vehicleGroupSpec;
		}

		VehicleGroupSpecImpl vehicleGroupSpecImpl = new VehicleGroupSpecImpl();

		vehicleGroupSpecImpl.setNew(vehicleGroupSpec.isNew());
		vehicleGroupSpecImpl.setPrimaryKey(vehicleGroupSpec.getPrimaryKey());

		vehicleGroupSpecImpl.setId(vehicleGroupSpec.getId());
		vehicleGroupSpecImpl.setVehicleGroupId(vehicleGroupSpec.getVehicleGroupId());
		vehicleGroupSpecImpl.setSpecificationCode(vehicleGroupSpec.getSpecificationCode());
		vehicleGroupSpecImpl.setSpecificationName(vehicleGroupSpec.getSpecificationName());
		vehicleGroupSpecImpl.setSpecificationValue(vehicleGroupSpec.getSpecificationValue());

		return vehicleGroupSpecImpl;
	}

	/**
	 * Returns the vehicle group spec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle group spec
	 * @return the vehicle group spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException if a vehicle group spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleGroupSpecException, SystemException {
		VehicleGroupSpec vehicleGroupSpec = fetchByPrimaryKey(primaryKey);

		if (vehicleGroupSpec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleGroupSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicleGroupSpec;
	}

	/**
	 * Returns the vehicle group spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException} if it could not be found.
	 *
	 * @param id the primary key of the vehicle group spec
	 * @return the vehicle group spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException if a vehicle group spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupSpec findByPrimaryKey(long id)
		throws NoSuchVehicleGroupSpecException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehicle group spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle group spec
	 * @return the vehicle group spec, or <code>null</code> if a vehicle group spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupSpec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehicleGroupSpec vehicleGroupSpec = (VehicleGroupSpec)EntityCacheUtil.getResult(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
				VehicleGroupSpecImpl.class, primaryKey);

		if (vehicleGroupSpec == _nullVehicleGroupSpec) {
			return null;
		}

		if (vehicleGroupSpec == null) {
			Session session = null;

			try {
				session = openSession();

				vehicleGroupSpec = (VehicleGroupSpec)session.get(VehicleGroupSpecImpl.class,
						primaryKey);

				if (vehicleGroupSpec != null) {
					cacheResult(vehicleGroupSpec);
				}
				else {
					EntityCacheUtil.putResult(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
						VehicleGroupSpecImpl.class, primaryKey,
						_nullVehicleGroupSpec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleGroupSpecModelImpl.ENTITY_CACHE_ENABLED,
					VehicleGroupSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicleGroupSpec;
	}

	/**
	 * Returns the vehicle group spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehicle group spec
	 * @return the vehicle group spec, or <code>null</code> if a vehicle group spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupSpec fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehicle group specs.
	 *
	 * @return the vehicle group specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroupSpec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle group specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle group specs
	 * @param end the upper bound of the range of vehicle group specs (not inclusive)
	 * @return the range of vehicle group specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroupSpec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle group specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle group specs
	 * @param end the upper bound of the range of vehicle group specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicle group specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroupSpec> findAll(int start, int end,
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

		List<VehicleGroupSpec> list = (List<VehicleGroupSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLEGROUPSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLEGROUPSPEC;

				if (pagination) {
					sql = sql.concat(VehicleGroupSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehicleGroupSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleGroupSpec>(list);
				}
				else {
					list = (List<VehicleGroupSpec>)QueryUtil.list(q,
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
	 * Removes all the vehicle group specs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehicleGroupSpec vehicleGroupSpec : findAll()) {
			remove(vehicleGroupSpec);
		}
	}

	/**
	 * Returns the number of vehicle group specs.
	 *
	 * @return the number of vehicle group specs
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLEGROUPSPEC);

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
	 * Initializes the vehicle group spec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehicleGroupSpec>> listenersList = new ArrayList<ModelListener<VehicleGroupSpec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehicleGroupSpec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehicleGroupSpecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLEGROUPSPEC = "SELECT vehicleGroupSpec FROM VehicleGroupSpec vehicleGroupSpec";
	private static final String _SQL_COUNT_VEHICLEGROUPSPEC = "SELECT COUNT(vehicleGroupSpec) FROM VehicleGroupSpec vehicleGroupSpec";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicleGroupSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehicleGroupSpec exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehicleGroupSpecPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleGroupId", "specificationCode", "specificationName",
				"specificationValue"
			});
	private static VehicleGroupSpec _nullVehicleGroupSpec = new VehicleGroupSpecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehicleGroupSpec> toCacheModel() {
				return _nullVehicleGroupSpecCacheModel;
			}
		};

	private static CacheModel<VehicleGroupSpec> _nullVehicleGroupSpecCacheModel = new CacheModel<VehicleGroupSpec>() {
			@Override
			public VehicleGroupSpec toEntityModel() {
				return _nullVehicleGroupSpec;
			}
		};
}