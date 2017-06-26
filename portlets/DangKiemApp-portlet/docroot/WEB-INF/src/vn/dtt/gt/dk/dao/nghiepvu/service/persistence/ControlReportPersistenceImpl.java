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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlReportImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlReportModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the control report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ControlReportPersistence
 * @see ControlReportUtil
 * @generated
 */
public class ControlReportPersistenceImpl extends BasePersistenceImpl<ControlReport>
	implements ControlReportPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ControlReportUtil} to access the control report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ControlReportImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportModelImpl.FINDER_CACHE_ENABLED,
			ControlReportImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportModelImpl.FINDER_CACHE_ENABLED,
			ControlReportImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTIONRECORDID = new FinderPath(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportModelImpl.FINDER_CACHE_ENABLED,
			ControlReportImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectionrecordId", new String[] { Long.class.getName() },
			ControlReportModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionrecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the control report where inspectionrecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException} if it could not be found.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the matching control report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a matching control report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport findByInspectionrecordId(long inspectionrecordId)
		throws NoSuchControlReportException, SystemException {
		ControlReport controlReport = fetchByInspectionrecordId(inspectionrecordId);

		if (controlReport == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectionrecordId=");
			msg.append(inspectionrecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchControlReportException(msg.toString());
		}

		return controlReport;
	}

	/**
	 * Returns the control report where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the matching control report, or <code>null</code> if a matching control report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport fetchByInspectionrecordId(long inspectionrecordId)
		throws SystemException {
		return fetchByInspectionrecordId(inspectionrecordId, true);
	}

	/**
	 * Returns the control report where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching control report, or <code>null</code> if a matching control report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport fetchByInspectionrecordId(long inspectionrecordId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { inspectionrecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					finderArgs, this);
		}

		if (result instanceof ControlReport) {
			ControlReport controlReport = (ControlReport)result;

			if ((inspectionrecordId != controlReport.getInspectionrecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONTROLREPORT_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionrecordId);

				List<ControlReport> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ControlReportPersistenceImpl.fetchByInspectionrecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ControlReport controlReport = list.get(0);

					result = controlReport;

					cacheResult(controlReport);

					if ((controlReport.getInspectionrecordId() != inspectionrecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
							finderArgs, controlReport);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
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
			return (ControlReport)result;
		}
	}

	/**
	 * Removes the control report where inspectionrecordId = &#63; from the database.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the control report that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport removeByInspectionrecordId(long inspectionrecordId)
		throws NoSuchControlReportException, SystemException {
		ControlReport controlReport = findByInspectionrecordId(inspectionrecordId);

		return remove(controlReport);
	}

	/**
	 * Returns the number of control reports where inspectionrecordId = &#63;.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the number of matching control reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionrecordId(long inspectionrecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDID;

		Object[] finderArgs = new Object[] { inspectionrecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTROLREPORT_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionrecordId);

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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2 =
		"controlReport.inspectionrecordId = ?";

	public ControlReportPersistenceImpl() {
		setModelClass(ControlReport.class);
	}

	/**
	 * Caches the control report in the entity cache if it is enabled.
	 *
	 * @param controlReport the control report
	 */
	@Override
	public void cacheResult(ControlReport controlReport) {
		EntityCacheUtil.putResult(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportImpl.class, controlReport.getPrimaryKey(),
			controlReport);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			new Object[] { controlReport.getInspectionrecordId() },
			controlReport);

		controlReport.resetOriginalValues();
	}

	/**
	 * Caches the control reports in the entity cache if it is enabled.
	 *
	 * @param controlReports the control reports
	 */
	@Override
	public void cacheResult(List<ControlReport> controlReports) {
		for (ControlReport controlReport : controlReports) {
			if (EntityCacheUtil.getResult(
						ControlReportModelImpl.ENTITY_CACHE_ENABLED,
						ControlReportImpl.class, controlReport.getPrimaryKey()) == null) {
				cacheResult(controlReport);
			}
			else {
				controlReport.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all control reports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ControlReportImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ControlReportImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the control report.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ControlReport controlReport) {
		EntityCacheUtil.removeResult(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportImpl.class, controlReport.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(controlReport);
	}

	@Override
	public void clearCache(List<ControlReport> controlReports) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ControlReport controlReport : controlReports) {
			EntityCacheUtil.removeResult(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
				ControlReportImpl.class, controlReport.getPrimaryKey());

			clearUniqueFindersCache(controlReport);
		}
	}

	protected void cacheUniqueFindersCache(ControlReport controlReport) {
		if (controlReport.isNew()) {
			Object[] args = new Object[] { controlReport.getInspectionrecordId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args, controlReport);
		}
		else {
			ControlReportModelImpl controlReportModelImpl = (ControlReportModelImpl)controlReport;

			if ((controlReportModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						controlReport.getInspectionrecordId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					args, controlReport);
			}
		}
	}

	protected void clearUniqueFindersCache(ControlReport controlReport) {
		ControlReportModelImpl controlReportModelImpl = (ControlReportModelImpl)controlReport;

		Object[] args = new Object[] { controlReport.getInspectionrecordId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			args);

		if ((controlReportModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					controlReportModelImpl.getOriginalInspectionrecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args);
		}
	}

	/**
	 * Creates a new control report with the primary key. Does not add the control report to the database.
	 *
	 * @param id the primary key for the new control report
	 * @return the new control report
	 */
	@Override
	public ControlReport create(long id) {
		ControlReport controlReport = new ControlReportImpl();

		controlReport.setNew(true);
		controlReport.setPrimaryKey(id);

		return controlReport;
	}

	/**
	 * Removes the control report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the control report
	 * @return the control report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport remove(long id)
		throws NoSuchControlReportException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the control report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the control report
	 * @return the control report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport remove(Serializable primaryKey)
		throws NoSuchControlReportException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ControlReport controlReport = (ControlReport)session.get(ControlReportImpl.class,
					primaryKey);

			if (controlReport == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchControlReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(controlReport);
		}
		catch (NoSuchControlReportException nsee) {
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
	protected ControlReport removeImpl(ControlReport controlReport)
		throws SystemException {
		controlReport = toUnwrappedModel(controlReport);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(controlReport)) {
				controlReport = (ControlReport)session.get(ControlReportImpl.class,
						controlReport.getPrimaryKeyObj());
			}

			if (controlReport != null) {
				session.delete(controlReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (controlReport != null) {
			clearCache(controlReport);
		}

		return controlReport;
	}

	@Override
	public ControlReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport controlReport)
		throws SystemException {
		controlReport = toUnwrappedModel(controlReport);

		boolean isNew = controlReport.isNew();

		Session session = null;

		try {
			session = openSession();

			if (controlReport.isNew()) {
				session.save(controlReport);

				controlReport.setNew(false);
			}
			else {
				session.merge(controlReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ControlReportModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
			ControlReportImpl.class, controlReport.getPrimaryKey(),
			controlReport);

		clearUniqueFindersCache(controlReport);
		cacheUniqueFindersCache(controlReport);

		return controlReport;
	}

	protected ControlReport toUnwrappedModel(ControlReport controlReport) {
		if (controlReport instanceof ControlReportImpl) {
			return controlReport;
		}

		ControlReportImpl controlReportImpl = new ControlReportImpl();

		controlReportImpl.setNew(controlReport.isNew());
		controlReportImpl.setPrimaryKey(controlReport.getPrimaryKey());

		controlReportImpl.setId(controlReport.getId());
		controlReportImpl.setRegisteredInspectionId(controlReport.getRegisteredInspectionId());
		controlReportImpl.setInspectionrecordId(controlReport.getInspectionrecordId());
		controlReportImpl.setHosothutucId(controlReport.getHosothutucId());
		controlReportImpl.setControlRequirementId(controlReport.getControlRequirementId());
		controlReportImpl.setRequirementNumber(controlReport.getRequirementNumber());
		controlReportImpl.setReportNumber(controlReport.getReportNumber());
		controlReportImpl.setReportDate(controlReport.getReportDate());
		controlReportImpl.setDescription(controlReport.getDescription());
		controlReportImpl.setAttachedFile(controlReport.getAttachedFile());
		controlReportImpl.setPhieuxulyphuId(controlReport.getPhieuxulyphuId());
		controlReportImpl.setSignName(controlReport.getSignName());
		controlReportImpl.setSignTitle(controlReport.getSignTitle());
		controlReportImpl.setSignPlace(controlReport.getSignPlace());
		controlReportImpl.setSignDate(controlReport.getSignDate());

		return controlReportImpl;
	}

	/**
	 * Returns the control report with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the control report
	 * @return the control report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchControlReportException, SystemException {
		ControlReport controlReport = fetchByPrimaryKey(primaryKey);

		if (controlReport == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchControlReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return controlReport;
	}

	/**
	 * Returns the control report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException} if it could not be found.
	 *
	 * @param id the primary key of the control report
	 * @return the control report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport findByPrimaryKey(long id)
		throws NoSuchControlReportException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the control report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the control report
	 * @return the control report, or <code>null</code> if a control report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ControlReport controlReport = (ControlReport)EntityCacheUtil.getResult(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
				ControlReportImpl.class, primaryKey);

		if (controlReport == _nullControlReport) {
			return null;
		}

		if (controlReport == null) {
			Session session = null;

			try {
				session = openSession();

				controlReport = (ControlReport)session.get(ControlReportImpl.class,
						primaryKey);

				if (controlReport != null) {
					cacheResult(controlReport);
				}
				else {
					EntityCacheUtil.putResult(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
						ControlReportImpl.class, primaryKey, _nullControlReport);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ControlReportModelImpl.ENTITY_CACHE_ENABLED,
					ControlReportImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return controlReport;
	}

	/**
	 * Returns the control report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the control report
	 * @return the control report, or <code>null</code> if a control report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlReport fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the control reports.
	 *
	 * @return the control reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlReport> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the control reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of control reports
	 * @param end the upper bound of the range of control reports (not inclusive)
	 * @return the range of control reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlReport> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the control reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of control reports
	 * @param end the upper bound of the range of control reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of control reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlReport> findAll(int start, int end,
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

		List<ControlReport> list = (List<ControlReport>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONTROLREPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTROLREPORT;

				if (pagination) {
					sql = sql.concat(ControlReportModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ControlReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ControlReport>(list);
				}
				else {
					list = (List<ControlReport>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the control reports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ControlReport controlReport : findAll()) {
			remove(controlReport);
		}
	}

	/**
	 * Returns the number of control reports.
	 *
	 * @return the number of control reports
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

				Query q = session.createQuery(_SQL_COUNT_CONTROLREPORT);

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
	 * Initializes the control report persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ControlReport>> listenersList = new ArrayList<ModelListener<ControlReport>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ControlReport>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ControlReportImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONTROLREPORT = "SELECT controlReport FROM ControlReport controlReport";
	private static final String _SQL_SELECT_CONTROLREPORT_WHERE = "SELECT controlReport FROM ControlReport controlReport WHERE ";
	private static final String _SQL_COUNT_CONTROLREPORT = "SELECT COUNT(controlReport) FROM ControlReport controlReport";
	private static final String _SQL_COUNT_CONTROLREPORT_WHERE = "SELECT COUNT(controlReport) FROM ControlReport controlReport WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "controlReport.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ControlReport exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ControlReport exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ControlReportPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "inspectionrecordId", "hosothutucId",
				"controlRequirementId", "requirementNumber", "reportNumber",
				"reportDate", "attachedFile", "phieuxulyphuId", "signName",
				"signTitle", "signPlace", "signDate"
			});
	private static ControlReport _nullControlReport = new ControlReportImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ControlReport> toCacheModel() {
				return _nullControlReportCacheModel;
			}
		};

	private static CacheModel<ControlReport> _nullControlReportCacheModel = new CacheModel<ControlReport>() {
			@Override
			public ControlReport toEntityModel() {
				return _nullControlReport;
			}
		};
}