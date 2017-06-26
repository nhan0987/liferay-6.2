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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vehicle group initial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehicleGroupInitialPersistence
 * @see VehicleGroupInitialUtil
 * @generated
 */
public class VehicleGroupInitialPersistenceImpl extends BasePersistenceImpl<VehicleGroupInitial>
	implements VehicleGroupInitialPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleGroupInitialUtil} to access the vehicle group initial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleGroupInitialImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupInitialModelImpl.FINDER_CACHE_ENABLED,
			VehicleGroupInitialImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupInitialModelImpl.FINDER_CACHE_ENABLED,
			VehicleGroupInitialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupInitialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VehicleGroupInitialPersistenceImpl() {
		setModelClass(VehicleGroupInitial.class);
	}

	/**
	 * Caches the vehicle group initial in the entity cache if it is enabled.
	 *
	 * @param vehicleGroupInitial the vehicle group initial
	 */
	@Override
	public void cacheResult(VehicleGroupInitial vehicleGroupInitial) {
		EntityCacheUtil.putResult(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupInitialImpl.class, vehicleGroupInitial.getPrimaryKey(),
			vehicleGroupInitial);

		vehicleGroupInitial.resetOriginalValues();
	}

	/**
	 * Caches the vehicle group initials in the entity cache if it is enabled.
	 *
	 * @param vehicleGroupInitials the vehicle group initials
	 */
	@Override
	public void cacheResult(List<VehicleGroupInitial> vehicleGroupInitials) {
		for (VehicleGroupInitial vehicleGroupInitial : vehicleGroupInitials) {
			if (EntityCacheUtil.getResult(
						VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
						VehicleGroupInitialImpl.class,
						vehicleGroupInitial.getPrimaryKey()) == null) {
				cacheResult(vehicleGroupInitial);
			}
			else {
				vehicleGroupInitial.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle group initials.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleGroupInitialImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleGroupInitialImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle group initial.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehicleGroupInitial vehicleGroupInitial) {
		EntityCacheUtil.removeResult(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupInitialImpl.class, vehicleGroupInitial.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VehicleGroupInitial> vehicleGroupInitials) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehicleGroupInitial vehicleGroupInitial : vehicleGroupInitials) {
			EntityCacheUtil.removeResult(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
				VehicleGroupInitialImpl.class,
				vehicleGroupInitial.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vehicle group initial with the primary key. Does not add the vehicle group initial to the database.
	 *
	 * @param id the primary key for the new vehicle group initial
	 * @return the new vehicle group initial
	 */
	@Override
	public VehicleGroupInitial create(long id) {
		VehicleGroupInitial vehicleGroupInitial = new VehicleGroupInitialImpl();

		vehicleGroupInitial.setNew(true);
		vehicleGroupInitial.setPrimaryKey(id);

		return vehicleGroupInitial;
	}

	/**
	 * Removes the vehicle group initial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehicle group initial
	 * @return the vehicle group initial that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException if a vehicle group initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupInitial remove(long id)
		throws NoSuchVehicleGroupInitialException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehicle group initial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle group initial
	 * @return the vehicle group initial that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException if a vehicle group initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupInitial remove(Serializable primaryKey)
		throws NoSuchVehicleGroupInitialException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehicleGroupInitial vehicleGroupInitial = (VehicleGroupInitial)session.get(VehicleGroupInitialImpl.class,
					primaryKey);

			if (vehicleGroupInitial == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleGroupInitialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicleGroupInitial);
		}
		catch (NoSuchVehicleGroupInitialException nsee) {
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
	protected VehicleGroupInitial removeImpl(
		VehicleGroupInitial vehicleGroupInitial) throws SystemException {
		vehicleGroupInitial = toUnwrappedModel(vehicleGroupInitial);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicleGroupInitial)) {
				vehicleGroupInitial = (VehicleGroupInitial)session.get(VehicleGroupInitialImpl.class,
						vehicleGroupInitial.getPrimaryKeyObj());
			}

			if (vehicleGroupInitial != null) {
				session.delete(vehicleGroupInitial);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicleGroupInitial != null) {
			clearCache(vehicleGroupInitial);
		}

		return vehicleGroupInitial;
	}

	@Override
	public VehicleGroupInitial updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial vehicleGroupInitial)
		throws SystemException {
		vehicleGroupInitial = toUnwrappedModel(vehicleGroupInitial);

		boolean isNew = vehicleGroupInitial.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vehicleGroupInitial.isNew()) {
				session.save(vehicleGroupInitial);

				vehicleGroupInitial.setNew(false);
			}
			else {
				session.merge(vehicleGroupInitial);
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

		EntityCacheUtil.putResult(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupInitialImpl.class, vehicleGroupInitial.getPrimaryKey(),
			vehicleGroupInitial);

		return vehicleGroupInitial;
	}

	protected VehicleGroupInitial toUnwrappedModel(
		VehicleGroupInitial vehicleGroupInitial) {
		if (vehicleGroupInitial instanceof VehicleGroupInitialImpl) {
			return vehicleGroupInitial;
		}

		VehicleGroupInitialImpl vehicleGroupInitialImpl = new VehicleGroupInitialImpl();

		vehicleGroupInitialImpl.setNew(vehicleGroupInitial.isNew());
		vehicleGroupInitialImpl.setPrimaryKey(vehicleGroupInitial.getPrimaryKey());

		vehicleGroupInitialImpl.setId(vehicleGroupInitial.getId());
		vehicleGroupInitialImpl.setVehicleClass(vehicleGroupInitial.getVehicleClass());
		vehicleGroupInitialImpl.setRegisteredInspectionId(vehicleGroupInitial.getRegisteredInspectionId());
		vehicleGroupInitialImpl.setTechnicalSpecCode(vehicleGroupInitial.getTechnicalSpecCode());
		vehicleGroupInitialImpl.setReferenceCertificateNo(vehicleGroupInitial.getReferenceCertificateNo());
		vehicleGroupInitialImpl.setSafetytestreportNo(vehicleGroupInitial.getSafetytestreportNo());
		vehicleGroupInitialImpl.setEmissiontestreportNo(vehicleGroupInitial.getEmissiontestreportNo());
		vehicleGroupInitialImpl.setCopreportNo(vehicleGroupInitial.getCopreportNo());
		vehicleGroupInitialImpl.setVehicleType(vehicleGroupInitial.getVehicleType());
		vehicleGroupInitialImpl.setEngineType(vehicleGroupInitial.getEngineType());
		vehicleGroupInitialImpl.setTradeMark(vehicleGroupInitial.getTradeMark());
		vehicleGroupInitialImpl.setMarkAsVehicle(vehicleGroupInitial.getMarkAsVehicle());
		vehicleGroupInitialImpl.setCommercialName(vehicleGroupInitial.getCommercialName());
		vehicleGroupInitialImpl.setModelCode(vehicleGroupInitial.getModelCode());
		vehicleGroupInitialImpl.setProductionPlant(vehicleGroupInitial.getProductionPlant());
		vehicleGroupInitialImpl.setAddressOfProductionPlant(vehicleGroupInitial.getAddressOfProductionPlant());
		vehicleGroupInitialImpl.setEmissionStandard(vehicleGroupInitial.getEmissionStandard());
		vehicleGroupInitialImpl.setSafetyTestReportId(vehicleGroupInitial.getSafetyTestReportId());
		vehicleGroupInitialImpl.setEmissionTestReportId(vehicleGroupInitial.getEmissionTestReportId());
		vehicleGroupInitialImpl.setCopReportId(vehicleGroupInitial.getCopReportId());
		vehicleGroupInitialImpl.setSpecificationVersion(vehicleGroupInitial.getSpecificationVersion());
		vehicleGroupInitialImpl.setRemarks(vehicleGroupInitial.getRemarks());
		vehicleGroupInitialImpl.setAttachedFile(vehicleGroupInitial.getAttachedFile());

		return vehicleGroupInitialImpl;
	}

	/**
	 * Returns the vehicle group initial with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle group initial
	 * @return the vehicle group initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException if a vehicle group initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupInitial findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleGroupInitialException, SystemException {
		VehicleGroupInitial vehicleGroupInitial = fetchByPrimaryKey(primaryKey);

		if (vehicleGroupInitial == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleGroupInitialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicleGroupInitial;
	}

	/**
	 * Returns the vehicle group initial with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException} if it could not be found.
	 *
	 * @param id the primary key of the vehicle group initial
	 * @return the vehicle group initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException if a vehicle group initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupInitial findByPrimaryKey(long id)
		throws NoSuchVehicleGroupInitialException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehicle group initial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle group initial
	 * @return the vehicle group initial, or <code>null</code> if a vehicle group initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupInitial fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehicleGroupInitial vehicleGroupInitial = (VehicleGroupInitial)EntityCacheUtil.getResult(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
				VehicleGroupInitialImpl.class, primaryKey);

		if (vehicleGroupInitial == _nullVehicleGroupInitial) {
			return null;
		}

		if (vehicleGroupInitial == null) {
			Session session = null;

			try {
				session = openSession();

				vehicleGroupInitial = (VehicleGroupInitial)session.get(VehicleGroupInitialImpl.class,
						primaryKey);

				if (vehicleGroupInitial != null) {
					cacheResult(vehicleGroupInitial);
				}
				else {
					EntityCacheUtil.putResult(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
						VehicleGroupInitialImpl.class, primaryKey,
						_nullVehicleGroupInitial);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleGroupInitialModelImpl.ENTITY_CACHE_ENABLED,
					VehicleGroupInitialImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicleGroupInitial;
	}

	/**
	 * Returns the vehicle group initial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehicle group initial
	 * @return the vehicle group initial, or <code>null</code> if a vehicle group initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroupInitial fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehicle group initials.
	 *
	 * @return the vehicle group initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroupInitial> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle group initials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle group initials
	 * @param end the upper bound of the range of vehicle group initials (not inclusive)
	 * @return the range of vehicle group initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroupInitial> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle group initials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle group initials
	 * @param end the upper bound of the range of vehicle group initials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicle group initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroupInitial> findAll(int start, int end,
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

		List<VehicleGroupInitial> list = (List<VehicleGroupInitial>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLEGROUPINITIAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLEGROUPINITIAL;

				if (pagination) {
					sql = sql.concat(VehicleGroupInitialModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehicleGroupInitial>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleGroupInitial>(list);
				}
				else {
					list = (List<VehicleGroupInitial>)QueryUtil.list(q,
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
	 * Removes all the vehicle group initials from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehicleGroupInitial vehicleGroupInitial : findAll()) {
			remove(vehicleGroupInitial);
		}
	}

	/**
	 * Returns the number of vehicle group initials.
	 *
	 * @return the number of vehicle group initials
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLEGROUPINITIAL);

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
	 * Initializes the vehicle group initial persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehicleGroupInitial>> listenersList = new ArrayList<ModelListener<VehicleGroupInitial>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehicleGroupInitial>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehicleGroupInitialImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLEGROUPINITIAL = "SELECT vehicleGroupInitial FROM VehicleGroupInitial vehicleGroupInitial";
	private static final String _SQL_COUNT_VEHICLEGROUPINITIAL = "SELECT COUNT(vehicleGroupInitial) FROM VehicleGroupInitial vehicleGroupInitial";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicleGroupInitial.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehicleGroupInitial exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehicleGroupInitialPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleClass", "registeredInspectionId", "technicalSpecCode",
				"referenceCertificateNo", "safetytestreportNo",
				"emissiontestreportNo", "copreportNo", "vehicleType",
				"engineType", "tradeMark", "markAsVehicle", "commercialName",
				"modelCode", "productionPlant", "addressOfProductionPlant",
				"emissionStandard", "safetyTestReportId", "emissionTestReportId",
				"copReportId", "specificationVersion", "attachedFile"
			});
	private static VehicleGroupInitial _nullVehicleGroupInitial = new VehicleGroupInitialImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehicleGroupInitial> toCacheModel() {
				return _nullVehicleGroupInitialCacheModel;
			}
		};

	private static CacheModel<VehicleGroupInitial> _nullVehicleGroupInitialCacheModel =
		new CacheModel<VehicleGroupInitial>() {
			@Override
			public VehicleGroupInitial toEntityModel() {
				return _nullVehicleGroupInitial;
			}
		};
}