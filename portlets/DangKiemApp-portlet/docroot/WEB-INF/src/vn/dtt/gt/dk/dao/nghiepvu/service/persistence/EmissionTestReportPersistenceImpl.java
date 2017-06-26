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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the emission test report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see EmissionTestReportPersistence
 * @see EmissionTestReportUtil
 * @generated
 */
public class EmissionTestReportPersistenceImpl extends BasePersistenceImpl<EmissionTestReport>
	implements EmissionTestReportPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmissionTestReportUtil} to access the emission test report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmissionTestReportImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID =
		new FinderPath(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestReportImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByEmissiontestRequirementId",
			new String[] { Long.class.getName() },
			EmissionTestReportModelImpl.EMISSIONTESTREQUIREMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID =
		new FinderPath(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEmissiontestRequirementId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the emission test report where emissiontestRequirementId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException} if it could not be found.
	 *
	 * @param emissiontestRequirementId the emissiontest requirement ID
	 * @return the matching emission test report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a matching emission test report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport findByEmissiontestRequirementId(
		long emissiontestRequirementId)
		throws NoSuchEmissionTestReportException, SystemException {
		EmissionTestReport emissionTestReport = fetchByEmissiontestRequirementId(emissiontestRequirementId);

		if (emissionTestReport == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("emissiontestRequirementId=");
			msg.append(emissiontestRequirementId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmissionTestReportException(msg.toString());
		}

		return emissionTestReport;
	}

	/**
	 * Returns the emission test report where emissiontestRequirementId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param emissiontestRequirementId the emissiontest requirement ID
	 * @return the matching emission test report, or <code>null</code> if a matching emission test report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport fetchByEmissiontestRequirementId(
		long emissiontestRequirementId) throws SystemException {
		return fetchByEmissiontestRequirementId(emissiontestRequirementId, true);
	}

	/**
	 * Returns the emission test report where emissiontestRequirementId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param emissiontestRequirementId the emissiontest requirement ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching emission test report, or <code>null</code> if a matching emission test report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport fetchByEmissiontestRequirementId(
		long emissiontestRequirementId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { emissiontestRequirementId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
					finderArgs, this);
		}

		if (result instanceof EmissionTestReport) {
			EmissionTestReport emissionTestReport = (EmissionTestReport)result;

			if ((emissiontestRequirementId != emissionTestReport.getEmissiontestRequirementId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_EMISSIONTESTREPORT_WHERE);

			query.append(_FINDER_COLUMN_EMISSIONTESTREQUIREMENTID_EMISSIONTESTREQUIREMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(emissiontestRequirementId);

				List<EmissionTestReport> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EmissionTestReportPersistenceImpl.fetchByEmissiontestRequirementId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EmissionTestReport emissionTestReport = list.get(0);

					result = emissionTestReport;

					cacheResult(emissionTestReport);

					if ((emissionTestReport.getEmissiontestRequirementId() != emissiontestRequirementId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
							finderArgs, emissionTestReport);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
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
			return (EmissionTestReport)result;
		}
	}

	/**
	 * Removes the emission test report where emissiontestRequirementId = &#63; from the database.
	 *
	 * @param emissiontestRequirementId the emissiontest requirement ID
	 * @return the emission test report that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport removeByEmissiontestRequirementId(
		long emissiontestRequirementId)
		throws NoSuchEmissionTestReportException, SystemException {
		EmissionTestReport emissionTestReport = findByEmissiontestRequirementId(emissiontestRequirementId);

		return remove(emissionTestReport);
	}

	/**
	 * Returns the number of emission test reports where emissiontestRequirementId = &#63;.
	 *
	 * @param emissiontestRequirementId the emissiontest requirement ID
	 * @return the number of matching emission test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmissiontestRequirementId(long emissiontestRequirementId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID;

		Object[] finderArgs = new Object[] { emissiontestRequirementId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMISSIONTESTREPORT_WHERE);

			query.append(_FINDER_COLUMN_EMISSIONTESTREQUIREMENTID_EMISSIONTESTREQUIREMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(emissiontestRequirementId);

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

	private static final String _FINDER_COLUMN_EMISSIONTESTREQUIREMENTID_EMISSIONTESTREQUIREMENTID_2 =
		"emissionTestReport.emissiontestRequirementId = ?";

	public EmissionTestReportPersistenceImpl() {
		setModelClass(EmissionTestReport.class);
	}

	/**
	 * Caches the emission test report in the entity cache if it is enabled.
	 *
	 * @param emissionTestReport the emission test report
	 */
	@Override
	public void cacheResult(EmissionTestReport emissionTestReport) {
		EntityCacheUtil.putResult(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportImpl.class, emissionTestReport.getPrimaryKey(),
			emissionTestReport);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
			new Object[] { emissionTestReport.getEmissiontestRequirementId() },
			emissionTestReport);

		emissionTestReport.resetOriginalValues();
	}

	/**
	 * Caches the emission test reports in the entity cache if it is enabled.
	 *
	 * @param emissionTestReports the emission test reports
	 */
	@Override
	public void cacheResult(List<EmissionTestReport> emissionTestReports) {
		for (EmissionTestReport emissionTestReport : emissionTestReports) {
			if (EntityCacheUtil.getResult(
						EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
						EmissionTestReportImpl.class,
						emissionTestReport.getPrimaryKey()) == null) {
				cacheResult(emissionTestReport);
			}
			else {
				emissionTestReport.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emission test reports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmissionTestReportImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmissionTestReportImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emission test report.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmissionTestReport emissionTestReport) {
		EntityCacheUtil.removeResult(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportImpl.class, emissionTestReport.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(emissionTestReport);
	}

	@Override
	public void clearCache(List<EmissionTestReport> emissionTestReports) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmissionTestReport emissionTestReport : emissionTestReports) {
			EntityCacheUtil.removeResult(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
				EmissionTestReportImpl.class, emissionTestReport.getPrimaryKey());

			clearUniqueFindersCache(emissionTestReport);
		}
	}

	protected void cacheUniqueFindersCache(
		EmissionTestReport emissionTestReport) {
		if (emissionTestReport.isNew()) {
			Object[] args = new Object[] {
					emissionTestReport.getEmissiontestRequirementId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
				args, emissionTestReport);
		}
		else {
			EmissionTestReportModelImpl emissionTestReportModelImpl = (EmissionTestReportModelImpl)emissionTestReport;

			if ((emissionTestReportModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						emissionTestReport.getEmissiontestRequirementId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
					args, emissionTestReport);
			}
		}
	}

	protected void clearUniqueFindersCache(
		EmissionTestReport emissionTestReport) {
		EmissionTestReportModelImpl emissionTestReportModelImpl = (EmissionTestReportModelImpl)emissionTestReport;

		Object[] args = new Object[] {
				emissionTestReport.getEmissiontestRequirementId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
			args);

		if ((emissionTestReportModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					emissionTestReportModelImpl.getOriginalEmissiontestRequirementId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREQUIREMENTID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_EMISSIONTESTREQUIREMENTID,
				args);
		}
	}

	/**
	 * Creates a new emission test report with the primary key. Does not add the emission test report to the database.
	 *
	 * @param id the primary key for the new emission test report
	 * @return the new emission test report
	 */
	@Override
	public EmissionTestReport create(long id) {
		EmissionTestReport emissionTestReport = new EmissionTestReportImpl();

		emissionTestReport.setNew(true);
		emissionTestReport.setPrimaryKey(id);

		return emissionTestReport;
	}

	/**
	 * Removes the emission test report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the emission test report
	 * @return the emission test report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a emission test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport remove(long id)
		throws NoSuchEmissionTestReportException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the emission test report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emission test report
	 * @return the emission test report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a emission test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport remove(Serializable primaryKey)
		throws NoSuchEmissionTestReportException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmissionTestReport emissionTestReport = (EmissionTestReport)session.get(EmissionTestReportImpl.class,
					primaryKey);

			if (emissionTestReport == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmissionTestReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(emissionTestReport);
		}
		catch (NoSuchEmissionTestReportException nsee) {
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
	protected EmissionTestReport removeImpl(
		EmissionTestReport emissionTestReport) throws SystemException {
		emissionTestReport = toUnwrappedModel(emissionTestReport);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(emissionTestReport)) {
				emissionTestReport = (EmissionTestReport)session.get(EmissionTestReportImpl.class,
						emissionTestReport.getPrimaryKeyObj());
			}

			if (emissionTestReport != null) {
				session.delete(emissionTestReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (emissionTestReport != null) {
			clearCache(emissionTestReport);
		}

		return emissionTestReport;
	}

	@Override
	public EmissionTestReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport)
		throws SystemException {
		emissionTestReport = toUnwrappedModel(emissionTestReport);

		boolean isNew = emissionTestReport.isNew();

		Session session = null;

		try {
			session = openSession();

			if (emissionTestReport.isNew()) {
				session.save(emissionTestReport);

				emissionTestReport.setNew(false);
			}
			else {
				session.merge(emissionTestReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmissionTestReportModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestReportImpl.class, emissionTestReport.getPrimaryKey(),
			emissionTestReport);

		clearUniqueFindersCache(emissionTestReport);
		cacheUniqueFindersCache(emissionTestReport);

		return emissionTestReport;
	}

	protected EmissionTestReport toUnwrappedModel(
		EmissionTestReport emissionTestReport) {
		if (emissionTestReport instanceof EmissionTestReportImpl) {
			return emissionTestReport;
		}

		EmissionTestReportImpl emissionTestReportImpl = new EmissionTestReportImpl();

		emissionTestReportImpl.setNew(emissionTestReport.isNew());
		emissionTestReportImpl.setPrimaryKey(emissionTestReport.getPrimaryKey());

		emissionTestReportImpl.setId(emissionTestReport.getId());
		emissionTestReportImpl.setRegisteredInspectionId(emissionTestReport.getRegisteredInspectionId());
		emissionTestReportImpl.setInspectionrecordId(emissionTestReport.getInspectionrecordId());
		emissionTestReportImpl.setHosothutucId(emissionTestReport.getHosothutucId());
		emissionTestReportImpl.setEmissiontestRequirementId(emissionTestReport.getEmissiontestRequirementId());
		emissionTestReportImpl.setRequirementNumber(emissionTestReport.getRequirementNumber());
		emissionTestReportImpl.setReportNumber(emissionTestReport.getReportNumber());
		emissionTestReportImpl.setDescription(emissionTestReport.getDescription());
		emissionTestReportImpl.setAttachedFile(emissionTestReport.getAttachedFile());
		emissionTestReportImpl.setPhieuxulyphuId(emissionTestReport.getPhieuxulyphuId());
		emissionTestReportImpl.setConfirmedResult(emissionTestReport.getConfirmedResult());
		emissionTestReportImpl.setSignName(emissionTestReport.getSignName());
		emissionTestReportImpl.setSignTitle(emissionTestReport.getSignTitle());
		emissionTestReportImpl.setSignPlace(emissionTestReport.getSignPlace());
		emissionTestReportImpl.setSignDate(emissionTestReport.getSignDate());

		return emissionTestReportImpl;
	}

	/**
	 * Returns the emission test report with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emission test report
	 * @return the emission test report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a emission test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmissionTestReportException, SystemException {
		EmissionTestReport emissionTestReport = fetchByPrimaryKey(primaryKey);

		if (emissionTestReport == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmissionTestReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return emissionTestReport;
	}

	/**
	 * Returns the emission test report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException} if it could not be found.
	 *
	 * @param id the primary key of the emission test report
	 * @return the emission test report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a emission test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport findByPrimaryKey(long id)
		throws NoSuchEmissionTestReportException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the emission test report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emission test report
	 * @return the emission test report, or <code>null</code> if a emission test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmissionTestReport emissionTestReport = (EmissionTestReport)EntityCacheUtil.getResult(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
				EmissionTestReportImpl.class, primaryKey);

		if (emissionTestReport == _nullEmissionTestReport) {
			return null;
		}

		if (emissionTestReport == null) {
			Session session = null;

			try {
				session = openSession();

				emissionTestReport = (EmissionTestReport)session.get(EmissionTestReportImpl.class,
						primaryKey);

				if (emissionTestReport != null) {
					cacheResult(emissionTestReport);
				}
				else {
					EntityCacheUtil.putResult(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
						EmissionTestReportImpl.class, primaryKey,
						_nullEmissionTestReport);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmissionTestReportModelImpl.ENTITY_CACHE_ENABLED,
					EmissionTestReportImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return emissionTestReport;
	}

	/**
	 * Returns the emission test report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the emission test report
	 * @return the emission test report, or <code>null</code> if a emission test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestReport fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the emission test reports.
	 *
	 * @return the emission test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestReport> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emission test reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emission test reports
	 * @param end the upper bound of the range of emission test reports (not inclusive)
	 * @return the range of emission test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestReport> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emission test reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emission test reports
	 * @param end the upper bound of the range of emission test reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emission test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestReport> findAll(int start, int end,
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

		List<EmissionTestReport> list = (List<EmissionTestReport>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMISSIONTESTREPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMISSIONTESTREPORT;

				if (pagination) {
					sql = sql.concat(EmissionTestReportModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmissionTestReport>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmissionTestReport>(list);
				}
				else {
					list = (List<EmissionTestReport>)QueryUtil.list(q,
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
	 * Removes all the emission test reports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmissionTestReport emissionTestReport : findAll()) {
			remove(emissionTestReport);
		}
	}

	/**
	 * Returns the number of emission test reports.
	 *
	 * @return the number of emission test reports
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

				Query q = session.createQuery(_SQL_COUNT_EMISSIONTESTREPORT);

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
	 * Initializes the emission test report persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmissionTestReport>> listenersList = new ArrayList<ModelListener<EmissionTestReport>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmissionTestReport>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmissionTestReportImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMISSIONTESTREPORT = "SELECT emissionTestReport FROM EmissionTestReport emissionTestReport";
	private static final String _SQL_SELECT_EMISSIONTESTREPORT_WHERE = "SELECT emissionTestReport FROM EmissionTestReport emissionTestReport WHERE ";
	private static final String _SQL_COUNT_EMISSIONTESTREPORT = "SELECT COUNT(emissionTestReport) FROM EmissionTestReport emissionTestReport";
	private static final String _SQL_COUNT_EMISSIONTESTREPORT_WHERE = "SELECT COUNT(emissionTestReport) FROM EmissionTestReport emissionTestReport WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "emissionTestReport.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmissionTestReport exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmissionTestReport exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmissionTestReportPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "inspectionrecordId", "hosothutucId",
				"emissiontestRequirementId", "requirementNumber", "reportNumber",
				"attachedFile", "phieuxulyphuId", "confirmedResult", "signName",
				"signTitle", "signPlace", "signDate"
			});
	private static EmissionTestReport _nullEmissionTestReport = new EmissionTestReportImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmissionTestReport> toCacheModel() {
				return _nullEmissionTestReportCacheModel;
			}
		};

	private static CacheModel<EmissionTestReport> _nullEmissionTestReportCacheModel =
		new CacheModel<EmissionTestReport>() {
			@Override
			public EmissionTestReport toEntityModel() {
				return _nullEmissionTestReport;
			}
		};
}