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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the safety test report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see SafetyTestReportPersistence
 * @see SafetyTestReportUtil
 * @generated
 */
public class SafetyTestReportPersistenceImpl extends BasePersistenceImpl<SafetyTestReport>
	implements SafetyTestReportPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SafetyTestReportUtil} to access the safety test report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SafetyTestReportImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportModelImpl.FINDER_CACHE_ENABLED,
			SafetyTestReportImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportModelImpl.FINDER_CACHE_ENABLED,
			SafetyTestReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID = new FinderPath(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportModelImpl.FINDER_CACHE_ENABLED,
			SafetyTestReportImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySafetestRequirementId",
			new String[] { Long.class.getName() },
			SafetyTestReportModelImpl.SAFETESTREQUIREMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID = new FinderPath(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySafetestRequirementId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the safety test report where safetestRequirementId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException} if it could not be found.
	 *
	 * @param safetestRequirementId the safetest requirement ID
	 * @return the matching safety test report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a matching safety test report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport findBySafetestRequirementId(
		long safetestRequirementId)
		throws NoSuchSafetyTestReportException, SystemException {
		SafetyTestReport safetyTestReport = fetchBySafetestRequirementId(safetestRequirementId);

		if (safetyTestReport == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("safetestRequirementId=");
			msg.append(safetestRequirementId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSafetyTestReportException(msg.toString());
		}

		return safetyTestReport;
	}

	/**
	 * Returns the safety test report where safetestRequirementId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param safetestRequirementId the safetest requirement ID
	 * @return the matching safety test report, or <code>null</code> if a matching safety test report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport fetchBySafetestRequirementId(
		long safetestRequirementId) throws SystemException {
		return fetchBySafetestRequirementId(safetestRequirementId, true);
	}

	/**
	 * Returns the safety test report where safetestRequirementId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param safetestRequirementId the safetest requirement ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching safety test report, or <code>null</code> if a matching safety test report could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport fetchBySafetestRequirementId(
		long safetestRequirementId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { safetestRequirementId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
					finderArgs, this);
		}

		if (result instanceof SafetyTestReport) {
			SafetyTestReport safetyTestReport = (SafetyTestReport)result;

			if ((safetestRequirementId != safetyTestReport.getSafetestRequirementId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SAFETYTESTREPORT_WHERE);

			query.append(_FINDER_COLUMN_SAFETESTREQUIREMENTID_SAFETESTREQUIREMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(safetestRequirementId);

				List<SafetyTestReport> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"SafetyTestReportPersistenceImpl.fetchBySafetestRequirementId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					SafetyTestReport safetyTestReport = list.get(0);

					result = safetyTestReport;

					cacheResult(safetyTestReport);

					if ((safetyTestReport.getSafetestRequirementId() != safetestRequirementId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
							finderArgs, safetyTestReport);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
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
			return (SafetyTestReport)result;
		}
	}

	/**
	 * Removes the safety test report where safetestRequirementId = &#63; from the database.
	 *
	 * @param safetestRequirementId the safetest requirement ID
	 * @return the safety test report that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport removeBySafetestRequirementId(
		long safetestRequirementId)
		throws NoSuchSafetyTestReportException, SystemException {
		SafetyTestReport safetyTestReport = findBySafetestRequirementId(safetestRequirementId);

		return remove(safetyTestReport);
	}

	/**
	 * Returns the number of safety test reports where safetestRequirementId = &#63;.
	 *
	 * @param safetestRequirementId the safetest requirement ID
	 * @return the number of matching safety test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySafetestRequirementId(long safetestRequirementId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID;

		Object[] finderArgs = new Object[] { safetestRequirementId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SAFETYTESTREPORT_WHERE);

			query.append(_FINDER_COLUMN_SAFETESTREQUIREMENTID_SAFETESTREQUIREMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(safetestRequirementId);

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

	private static final String _FINDER_COLUMN_SAFETESTREQUIREMENTID_SAFETESTREQUIREMENTID_2 =
		"safetyTestReport.safetestRequirementId = ?";

	public SafetyTestReportPersistenceImpl() {
		setModelClass(SafetyTestReport.class);
	}

	/**
	 * Caches the safety test report in the entity cache if it is enabled.
	 *
	 * @param safetyTestReport the safety test report
	 */
	@Override
	public void cacheResult(SafetyTestReport safetyTestReport) {
		EntityCacheUtil.putResult(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportImpl.class, safetyTestReport.getPrimaryKey(),
			safetyTestReport);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
			new Object[] { safetyTestReport.getSafetestRequirementId() },
			safetyTestReport);

		safetyTestReport.resetOriginalValues();
	}

	/**
	 * Caches the safety test reports in the entity cache if it is enabled.
	 *
	 * @param safetyTestReports the safety test reports
	 */
	@Override
	public void cacheResult(List<SafetyTestReport> safetyTestReports) {
		for (SafetyTestReport safetyTestReport : safetyTestReports) {
			if (EntityCacheUtil.getResult(
						SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
						SafetyTestReportImpl.class,
						safetyTestReport.getPrimaryKey()) == null) {
				cacheResult(safetyTestReport);
			}
			else {
				safetyTestReport.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all safety test reports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SafetyTestReportImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SafetyTestReportImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the safety test report.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SafetyTestReport safetyTestReport) {
		EntityCacheUtil.removeResult(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportImpl.class, safetyTestReport.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(safetyTestReport);
	}

	@Override
	public void clearCache(List<SafetyTestReport> safetyTestReports) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SafetyTestReport safetyTestReport : safetyTestReports) {
			EntityCacheUtil.removeResult(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
				SafetyTestReportImpl.class, safetyTestReport.getPrimaryKey());

			clearUniqueFindersCache(safetyTestReport);
		}
	}

	protected void cacheUniqueFindersCache(SafetyTestReport safetyTestReport) {
		if (safetyTestReport.isNew()) {
			Object[] args = new Object[] {
					safetyTestReport.getSafetestRequirementId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
				args, safetyTestReport);
		}
		else {
			SafetyTestReportModelImpl safetyTestReportModelImpl = (SafetyTestReportModelImpl)safetyTestReport;

			if ((safetyTestReportModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						safetyTestReport.getSafetestRequirementId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
					args, safetyTestReport);
			}
		}
	}

	protected void clearUniqueFindersCache(SafetyTestReport safetyTestReport) {
		SafetyTestReportModelImpl safetyTestReportModelImpl = (SafetyTestReportModelImpl)safetyTestReport;

		Object[] args = new Object[] { safetyTestReport.getSafetestRequirementId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
			args);

		if ((safetyTestReportModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					safetyTestReportModelImpl.getOriginalSafetestRequirementId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFETESTREQUIREMENTID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SAFETESTREQUIREMENTID,
				args);
		}
	}

	/**
	 * Creates a new safety test report with the primary key. Does not add the safety test report to the database.
	 *
	 * @param id the primary key for the new safety test report
	 * @return the new safety test report
	 */
	@Override
	public SafetyTestReport create(long id) {
		SafetyTestReport safetyTestReport = new SafetyTestReportImpl();

		safetyTestReport.setNew(true);
		safetyTestReport.setPrimaryKey(id);

		return safetyTestReport;
	}

	/**
	 * Removes the safety test report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the safety test report
	 * @return the safety test report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a safety test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport remove(long id)
		throws NoSuchSafetyTestReportException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the safety test report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the safety test report
	 * @return the safety test report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a safety test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport remove(Serializable primaryKey)
		throws NoSuchSafetyTestReportException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SafetyTestReport safetyTestReport = (SafetyTestReport)session.get(SafetyTestReportImpl.class,
					primaryKey);

			if (safetyTestReport == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSafetyTestReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(safetyTestReport);
		}
		catch (NoSuchSafetyTestReportException nsee) {
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
	protected SafetyTestReport removeImpl(SafetyTestReport safetyTestReport)
		throws SystemException {
		safetyTestReport = toUnwrappedModel(safetyTestReport);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(safetyTestReport)) {
				safetyTestReport = (SafetyTestReport)session.get(SafetyTestReportImpl.class,
						safetyTestReport.getPrimaryKeyObj());
			}

			if (safetyTestReport != null) {
				session.delete(safetyTestReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (safetyTestReport != null) {
			clearCache(safetyTestReport);
		}

		return safetyTestReport;
	}

	@Override
	public SafetyTestReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport safetyTestReport)
		throws SystemException {
		safetyTestReport = toUnwrappedModel(safetyTestReport);

		boolean isNew = safetyTestReport.isNew();

		Session session = null;

		try {
			session = openSession();

			if (safetyTestReport.isNew()) {
				session.save(safetyTestReport);

				safetyTestReport.setNew(false);
			}
			else {
				session.merge(safetyTestReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SafetyTestReportModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestReportImpl.class, safetyTestReport.getPrimaryKey(),
			safetyTestReport);

		clearUniqueFindersCache(safetyTestReport);
		cacheUniqueFindersCache(safetyTestReport);

		return safetyTestReport;
	}

	protected SafetyTestReport toUnwrappedModel(
		SafetyTestReport safetyTestReport) {
		if (safetyTestReport instanceof SafetyTestReportImpl) {
			return safetyTestReport;
		}

		SafetyTestReportImpl safetyTestReportImpl = new SafetyTestReportImpl();

		safetyTestReportImpl.setNew(safetyTestReport.isNew());
		safetyTestReportImpl.setPrimaryKey(safetyTestReport.getPrimaryKey());

		safetyTestReportImpl.setId(safetyTestReport.getId());
		safetyTestReportImpl.setSafetestRequirementId(safetyTestReport.getSafetestRequirementId());
		safetyTestReportImpl.setReportNumber(safetyTestReport.getReportNumber());
		safetyTestReportImpl.setDescription(safetyTestReport.getDescription());
		safetyTestReportImpl.setAttachedFile(safetyTestReport.getAttachedFile());
		safetyTestReportImpl.setConfirmedResult(safetyTestReport.getConfirmedResult());
		safetyTestReportImpl.setSignName(safetyTestReport.getSignName());
		safetyTestReportImpl.setSignTitle(safetyTestReport.getSignTitle());
		safetyTestReportImpl.setSignPlace(safetyTestReport.getSignPlace());
		safetyTestReportImpl.setSignDate(safetyTestReport.getSignDate());

		return safetyTestReportImpl;
	}

	/**
	 * Returns the safety test report with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the safety test report
	 * @return the safety test report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a safety test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSafetyTestReportException, SystemException {
		SafetyTestReport safetyTestReport = fetchByPrimaryKey(primaryKey);

		if (safetyTestReport == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSafetyTestReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return safetyTestReport;
	}

	/**
	 * Returns the safety test report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException} if it could not be found.
	 *
	 * @param id the primary key of the safety test report
	 * @return the safety test report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a safety test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport findByPrimaryKey(long id)
		throws NoSuchSafetyTestReportException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the safety test report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the safety test report
	 * @return the safety test report, or <code>null</code> if a safety test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SafetyTestReport safetyTestReport = (SafetyTestReport)EntityCacheUtil.getResult(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
				SafetyTestReportImpl.class, primaryKey);

		if (safetyTestReport == _nullSafetyTestReport) {
			return null;
		}

		if (safetyTestReport == null) {
			Session session = null;

			try {
				session = openSession();

				safetyTestReport = (SafetyTestReport)session.get(SafetyTestReportImpl.class,
						primaryKey);

				if (safetyTestReport != null) {
					cacheResult(safetyTestReport);
				}
				else {
					EntityCacheUtil.putResult(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
						SafetyTestReportImpl.class, primaryKey,
						_nullSafetyTestReport);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SafetyTestReportModelImpl.ENTITY_CACHE_ENABLED,
					SafetyTestReportImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return safetyTestReport;
	}

	/**
	 * Returns the safety test report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the safety test report
	 * @return the safety test report, or <code>null</code> if a safety test report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestReport fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the safety test reports.
	 *
	 * @return the safety test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetyTestReport> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the safety test reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of safety test reports
	 * @param end the upper bound of the range of safety test reports (not inclusive)
	 * @return the range of safety test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetyTestReport> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the safety test reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of safety test reports
	 * @param end the upper bound of the range of safety test reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of safety test reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetyTestReport> findAll(int start, int end,
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

		List<SafetyTestReport> list = (List<SafetyTestReport>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAFETYTESTREPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAFETYTESTREPORT;

				if (pagination) {
					sql = sql.concat(SafetyTestReportModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SafetyTestReport>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SafetyTestReport>(list);
				}
				else {
					list = (List<SafetyTestReport>)QueryUtil.list(q,
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
	 * Removes all the safety test reports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SafetyTestReport safetyTestReport : findAll()) {
			remove(safetyTestReport);
		}
	}

	/**
	 * Returns the number of safety test reports.
	 *
	 * @return the number of safety test reports
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

				Query q = session.createQuery(_SQL_COUNT_SAFETYTESTREPORT);

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
	 * Initializes the safety test report persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SafetyTestReport>> listenersList = new ArrayList<ModelListener<SafetyTestReport>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SafetyTestReport>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SafetyTestReportImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SAFETYTESTREPORT = "SELECT safetyTestReport FROM SafetyTestReport safetyTestReport";
	private static final String _SQL_SELECT_SAFETYTESTREPORT_WHERE = "SELECT safetyTestReport FROM SafetyTestReport safetyTestReport WHERE ";
	private static final String _SQL_COUNT_SAFETYTESTREPORT = "SELECT COUNT(safetyTestReport) FROM SafetyTestReport safetyTestReport";
	private static final String _SQL_COUNT_SAFETYTESTREPORT_WHERE = "SELECT COUNT(safetyTestReport) FROM SafetyTestReport safetyTestReport WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "safetyTestReport.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SafetyTestReport exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SafetyTestReport exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SafetyTestReportPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"safetestRequirementId", "reportNumber", "attachedFile",
				"confirmedResult", "signName", "signTitle", "signPlace",
				"signDate"
			});
	private static SafetyTestReport _nullSafetyTestReport = new SafetyTestReportImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SafetyTestReport> toCacheModel() {
				return _nullSafetyTestReportCacheModel;
			}
		};

	private static CacheModel<SafetyTestReport> _nullSafetyTestReportCacheModel = new CacheModel<SafetyTestReport>() {
			@Override
			public SafetyTestReport toEntityModel() {
				return _nullSafetyTestReport;
			}
		};
}