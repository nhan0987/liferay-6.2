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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vehicle statistics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehicleStatisticsPersistence
 * @see VehicleStatisticsUtil
 * @generated
 */
public class VehicleStatisticsPersistenceImpl extends BasePersistenceImpl<VehicleStatistics>
	implements VehicleStatisticsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleStatisticsUtil} to access the vehicle statistics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleStatisticsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VehicleStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VehicleStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID = new FinderPath(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VehicleStatisticsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRegisteredInspectionId",
			new String[] { Long.class.getName() },
			VehicleStatisticsModelImpl.REGISTEREDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID = new FinderPath(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredInspectionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vehicle statistics where registeredInspectionId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException} if it could not be found.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching vehicle statistics
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a matching vehicle statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics findByRegisteredInspectionId(
		long registeredInspectionId)
		throws NoSuchVehicleStatisticsException, SystemException {
		VehicleStatistics vehicleStatistics = fetchByRegisteredInspectionId(registeredInspectionId);

		if (vehicleStatistics == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("registeredInspectionId=");
			msg.append(registeredInspectionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVehicleStatisticsException(msg.toString());
		}

		return vehicleStatistics;
	}

	/**
	 * Returns the vehicle statistics where registeredInspectionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching vehicle statistics, or <code>null</code> if a matching vehicle statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics fetchByRegisteredInspectionId(
		long registeredInspectionId) throws SystemException {
		return fetchByRegisteredInspectionId(registeredInspectionId, true);
	}

	/**
	 * Returns the vehicle statistics where registeredInspectionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching vehicle statistics, or <code>null</code> if a matching vehicle statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics fetchByRegisteredInspectionId(
		long registeredInspectionId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { registeredInspectionId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
					finderArgs, this);
		}

		if (result instanceof VehicleStatistics) {
			VehicleStatistics vehicleStatistics = (VehicleStatistics)result;

			if ((registeredInspectionId != vehicleStatistics.getRegisteredInspectionId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VEHICLESTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

				List<VehicleStatistics> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"VehicleStatisticsPersistenceImpl.fetchByRegisteredInspectionId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					VehicleStatistics vehicleStatistics = list.get(0);

					result = vehicleStatistics;

					cacheResult(vehicleStatistics);

					if ((vehicleStatistics.getRegisteredInspectionId() != registeredInspectionId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
							finderArgs, vehicleStatistics);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
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
			return (VehicleStatistics)result;
		}
	}

	/**
	 * Removes the vehicle statistics where registeredInspectionId = &#63; from the database.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the vehicle statistics that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics removeByRegisteredInspectionId(
		long registeredInspectionId)
		throws NoSuchVehicleStatisticsException, SystemException {
		VehicleStatistics vehicleStatistics = findByRegisteredInspectionId(registeredInspectionId);

		return remove(vehicleStatistics);
	}

	/**
	 * Returns the number of vehicle statisticses where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the number of matching vehicle statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID;

		Object[] finderArgs = new Object[] { registeredInspectionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLESTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

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

	private static final String _FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2 =
		"vehicleStatistics.registeredInspectionId = ?";

	public VehicleStatisticsPersistenceImpl() {
		setModelClass(VehicleStatistics.class);
	}

	/**
	 * Caches the vehicle statistics in the entity cache if it is enabled.
	 *
	 * @param vehicleStatistics the vehicle statistics
	 */
	@Override
	public void cacheResult(VehicleStatistics vehicleStatistics) {
		EntityCacheUtil.putResult(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsImpl.class, vehicleStatistics.getPrimaryKey(),
			vehicleStatistics);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
			new Object[] { vehicleStatistics.getRegisteredInspectionId() },
			vehicleStatistics);

		vehicleStatistics.resetOriginalValues();
	}

	/**
	 * Caches the vehicle statisticses in the entity cache if it is enabled.
	 *
	 * @param vehicleStatisticses the vehicle statisticses
	 */
	@Override
	public void cacheResult(List<VehicleStatistics> vehicleStatisticses) {
		for (VehicleStatistics vehicleStatistics : vehicleStatisticses) {
			if (EntityCacheUtil.getResult(
						VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
						VehicleStatisticsImpl.class,
						vehicleStatistics.getPrimaryKey()) == null) {
				cacheResult(vehicleStatistics);
			}
			else {
				vehicleStatistics.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle statisticses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleStatisticsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleStatisticsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle statistics.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehicleStatistics vehicleStatistics) {
		EntityCacheUtil.removeResult(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsImpl.class, vehicleStatistics.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(vehicleStatistics);
	}

	@Override
	public void clearCache(List<VehicleStatistics> vehicleStatisticses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehicleStatistics vehicleStatistics : vehicleStatisticses) {
			EntityCacheUtil.removeResult(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
				VehicleStatisticsImpl.class, vehicleStatistics.getPrimaryKey());

			clearUniqueFindersCache(vehicleStatistics);
		}
	}

	protected void cacheUniqueFindersCache(VehicleStatistics vehicleStatistics) {
		if (vehicleStatistics.isNew()) {
			Object[] args = new Object[] {
					vehicleStatistics.getRegisteredInspectionId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
				args, vehicleStatistics);
		}
		else {
			VehicleStatisticsModelImpl vehicleStatisticsModelImpl = (VehicleStatisticsModelImpl)vehicleStatistics;

			if ((vehicleStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleStatistics.getRegisteredInspectionId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
					args, vehicleStatistics);
			}
		}
	}

	protected void clearUniqueFindersCache(VehicleStatistics vehicleStatistics) {
		VehicleStatisticsModelImpl vehicleStatisticsModelImpl = (VehicleStatisticsModelImpl)vehicleStatistics;

		Object[] args = new Object[] {
				vehicleStatistics.getRegisteredInspectionId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
			args);

		if ((vehicleStatisticsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
			args = new Object[] {
					vehicleStatisticsModelImpl.getOriginalRegisteredInspectionId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REGISTEREDINSPECTIONID,
				args);
		}
	}

	/**
	 * Creates a new vehicle statistics with the primary key. Does not add the vehicle statistics to the database.
	 *
	 * @param id the primary key for the new vehicle statistics
	 * @return the new vehicle statistics
	 */
	@Override
	public VehicleStatistics create(long id) {
		VehicleStatistics vehicleStatistics = new VehicleStatisticsImpl();

		vehicleStatistics.setNew(true);
		vehicleStatistics.setPrimaryKey(id);

		return vehicleStatistics;
	}

	/**
	 * Removes the vehicle statistics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehicle statistics
	 * @return the vehicle statistics that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a vehicle statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics remove(long id)
		throws NoSuchVehicleStatisticsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehicle statistics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle statistics
	 * @return the vehicle statistics that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a vehicle statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics remove(Serializable primaryKey)
		throws NoSuchVehicleStatisticsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehicleStatistics vehicleStatistics = (VehicleStatistics)session.get(VehicleStatisticsImpl.class,
					primaryKey);

			if (vehicleStatistics == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleStatisticsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicleStatistics);
		}
		catch (NoSuchVehicleStatisticsException nsee) {
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
	protected VehicleStatistics removeImpl(VehicleStatistics vehicleStatistics)
		throws SystemException {
		vehicleStatistics = toUnwrappedModel(vehicleStatistics);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicleStatistics)) {
				vehicleStatistics = (VehicleStatistics)session.get(VehicleStatisticsImpl.class,
						vehicleStatistics.getPrimaryKeyObj());
			}

			if (vehicleStatistics != null) {
				session.delete(vehicleStatistics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicleStatistics != null) {
			clearCache(vehicleStatistics);
		}

		return vehicleStatistics;
	}

	@Override
	public VehicleStatistics updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics vehicleStatistics)
		throws SystemException {
		vehicleStatistics = toUnwrappedModel(vehicleStatistics);

		boolean isNew = vehicleStatistics.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vehicleStatistics.isNew()) {
				session.save(vehicleStatistics);

				vehicleStatistics.setNew(false);
			}
			else {
				session.merge(vehicleStatistics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VehicleStatisticsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VehicleStatisticsImpl.class, vehicleStatistics.getPrimaryKey(),
			vehicleStatistics);

		clearUniqueFindersCache(vehicleStatistics);
		cacheUniqueFindersCache(vehicleStatistics);

		return vehicleStatistics;
	}

	protected VehicleStatistics toUnwrappedModel(
		VehicleStatistics vehicleStatistics) {
		if (vehicleStatistics instanceof VehicleStatisticsImpl) {
			return vehicleStatistics;
		}

		VehicleStatisticsImpl vehicleStatisticsImpl = new VehicleStatisticsImpl();

		vehicleStatisticsImpl.setNew(vehicleStatistics.isNew());
		vehicleStatisticsImpl.setPrimaryKey(vehicleStatistics.getPrimaryKey());

		vehicleStatisticsImpl.setId(vehicleStatistics.getId());
		vehicleStatisticsImpl.setRegisteredInspectionId(vehicleStatistics.getRegisteredInspectionId());
		vehicleStatisticsImpl.setTotalRegisteredVehicle(vehicleStatistics.getTotalRegisteredVehicle());
		vehicleStatisticsImpl.setTotalRequestedVehicle(vehicleStatistics.getTotalRequestedVehicle());
		vehicleStatisticsImpl.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle());
		vehicleStatisticsImpl.setTotalCancelledVehicle(vehicleStatistics.getTotalCancelledVehicle());
		vehicleStatisticsImpl.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle());
		vehicleStatisticsImpl.setTotalResolvedVehicle(vehicleStatistics.getTotalResolvedVehicle());
		vehicleStatisticsImpl.setTotalReexportedVehicle(vehicleStatistics.getTotalReexportedVehicle());
		vehicleStatisticsImpl.setTotalWrongStatusVehicle(vehicleStatistics.getTotalWrongStatusVehicle());
		vehicleStatisticsImpl.setTotalSafeTestSample(vehicleStatistics.getTotalSafeTestSample());
		vehicleStatisticsImpl.setTotalEmissionTestSample(vehicleStatistics.getTotalEmissionTestSample());
		vehicleStatisticsImpl.setTotalControlRequiredVehicle(vehicleStatistics.getTotalControlRequiredVehicle());
		vehicleStatisticsImpl.setTotalCertificate(vehicleStatistics.getTotalCertificate());
		vehicleStatisticsImpl.setTotalViolatedVehicle(vehicleStatistics.getTotalViolatedVehicle());
		vehicleStatisticsImpl.setTotalTechnicalSpec(vehicleStatistics.getTotalTechnicalSpec());
		vehicleStatisticsImpl.setProcessingState(vehicleStatistics.getProcessingState());
		vehicleStatisticsImpl.setProcessingTiming(vehicleStatistics.getProcessingTiming());
		vehicleStatisticsImpl.setDaysUptoDeadline(vehicleStatistics.getDaysUptoDeadline());
		vehicleStatisticsImpl.setSynchdate(vehicleStatistics.getSynchdate());

		return vehicleStatisticsImpl;
	}

	/**
	 * Returns the vehicle statistics with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle statistics
	 * @return the vehicle statistics
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a vehicle statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleStatisticsException, SystemException {
		VehicleStatistics vehicleStatistics = fetchByPrimaryKey(primaryKey);

		if (vehicleStatistics == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleStatisticsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicleStatistics;
	}

	/**
	 * Returns the vehicle statistics with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException} if it could not be found.
	 *
	 * @param id the primary key of the vehicle statistics
	 * @return the vehicle statistics
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a vehicle statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics findByPrimaryKey(long id)
		throws NoSuchVehicleStatisticsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehicle statistics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle statistics
	 * @return the vehicle statistics, or <code>null</code> if a vehicle statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehicleStatistics vehicleStatistics = (VehicleStatistics)EntityCacheUtil.getResult(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
				VehicleStatisticsImpl.class, primaryKey);

		if (vehicleStatistics == _nullVehicleStatistics) {
			return null;
		}

		if (vehicleStatistics == null) {
			Session session = null;

			try {
				session = openSession();

				vehicleStatistics = (VehicleStatistics)session.get(VehicleStatisticsImpl.class,
						primaryKey);

				if (vehicleStatistics != null) {
					cacheResult(vehicleStatistics);
				}
				else {
					EntityCacheUtil.putResult(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
						VehicleStatisticsImpl.class, primaryKey,
						_nullVehicleStatistics);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleStatisticsModelImpl.ENTITY_CACHE_ENABLED,
					VehicleStatisticsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicleStatistics;
	}

	/**
	 * Returns the vehicle statistics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehicle statistics
	 * @return the vehicle statistics, or <code>null</code> if a vehicle statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleStatistics fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehicle statisticses.
	 *
	 * @return the vehicle statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleStatistics> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle statisticses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle statisticses
	 * @param end the upper bound of the range of vehicle statisticses (not inclusive)
	 * @return the range of vehicle statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleStatistics> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle statisticses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle statisticses
	 * @param end the upper bound of the range of vehicle statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicle statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleStatistics> findAll(int start, int end,
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

		List<VehicleStatistics> list = (List<VehicleStatistics>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLESTATISTICS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLESTATISTICS;

				if (pagination) {
					sql = sql.concat(VehicleStatisticsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehicleStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleStatistics>(list);
				}
				else {
					list = (List<VehicleStatistics>)QueryUtil.list(q,
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
	 * Removes all the vehicle statisticses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehicleStatistics vehicleStatistics : findAll()) {
			remove(vehicleStatistics);
		}
	}

	/**
	 * Returns the number of vehicle statisticses.
	 *
	 * @return the number of vehicle statisticses
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLESTATISTICS);

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
	 * Initializes the vehicle statistics persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehicleStatistics>> listenersList = new ArrayList<ModelListener<VehicleStatistics>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehicleStatistics>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehicleStatisticsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLESTATISTICS = "SELECT vehicleStatistics FROM VehicleStatistics vehicleStatistics";
	private static final String _SQL_SELECT_VEHICLESTATISTICS_WHERE = "SELECT vehicleStatistics FROM VehicleStatistics vehicleStatistics WHERE ";
	private static final String _SQL_COUNT_VEHICLESTATISTICS = "SELECT COUNT(vehicleStatistics) FROM VehicleStatistics vehicleStatistics";
	private static final String _SQL_COUNT_VEHICLESTATISTICS_WHERE = "SELECT COUNT(vehicleStatistics) FROM VehicleStatistics vehicleStatistics WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicleStatistics.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehicleStatistics exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VehicleStatistics exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehicleStatisticsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "totalRegisteredVehicle",
				"totalRequestedVehicle", "totalNotYetRequestedVehicle",
				"totalCancelledVehicle", "totalInspectedVehicle",
				"totalResolvedVehicle", "totalReexportedVehicle",
				"totalWrongStatusVehicle", "totalSafeTestSample",
				"totalEmissionTestSample", "totalControlRequiredVehicle",
				"totalCertificate", "totalViolatedVehicle", "totalTechnicalSpec",
				"processingState", "processingTiming", "daysUptoDeadline"
			});
	private static VehicleStatistics _nullVehicleStatistics = new VehicleStatisticsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehicleStatistics> toCacheModel() {
				return _nullVehicleStatisticsCacheModel;
			}
		};

	private static CacheModel<VehicleStatistics> _nullVehicleStatisticsCacheModel =
		new CacheModel<VehicleStatistics>() {
			@Override
			public VehicleStatistics toEntityModel() {
				return _nullVehicleStatistics;
			}
		};
}