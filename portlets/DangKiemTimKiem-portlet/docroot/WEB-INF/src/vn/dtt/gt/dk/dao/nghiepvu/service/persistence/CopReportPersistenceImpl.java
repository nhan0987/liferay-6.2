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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CopReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CopReportImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CopReportModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the cop report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CopReportPersistence
 * @see CopReportUtil
 * @generated
 */
public class CopReportPersistenceImpl extends BasePersistenceImpl<CopReport>
	implements CopReportPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CopReportUtil} to access the cop report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CopReportImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CopReportModelImpl.ENTITY_CACHE_ENABLED,
			CopReportModelImpl.FINDER_CACHE_ENABLED, CopReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CopReportModelImpl.ENTITY_CACHE_ENABLED,
			CopReportModelImpl.FINDER_CACHE_ENABLED, CopReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CopReportModelImpl.ENTITY_CACHE_ENABLED,
			CopReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CopReportPersistenceImpl() {
		setModelClass(CopReport.class);
	}

	/**
	 * Caches the cop report in the entity cache if it is enabled.
	 *
	 * @param copReport the cop report
	 */
	@Override
	public void cacheResult(CopReport copReport) {
		EntityCacheUtil.putResult(CopReportModelImpl.ENTITY_CACHE_ENABLED,
			CopReportImpl.class, copReport.getPrimaryKey(), copReport);

		copReport.resetOriginalValues();
	}

	/**
	 * Caches the cop reports in the entity cache if it is enabled.
	 *
	 * @param copReports the cop reports
	 */
	@Override
	public void cacheResult(List<CopReport> copReports) {
		for (CopReport copReport : copReports) {
			if (EntityCacheUtil.getResult(
						CopReportModelImpl.ENTITY_CACHE_ENABLED,
						CopReportImpl.class, copReport.getPrimaryKey()) == null) {
				cacheResult(copReport);
			}
			else {
				copReport.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cop reports.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CopReportImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CopReportImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cop report.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CopReport copReport) {
		EntityCacheUtil.removeResult(CopReportModelImpl.ENTITY_CACHE_ENABLED,
			CopReportImpl.class, copReport.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CopReport> copReports) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CopReport copReport : copReports) {
			EntityCacheUtil.removeResult(CopReportModelImpl.ENTITY_CACHE_ENABLED,
				CopReportImpl.class, copReport.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cop report with the primary key. Does not add the cop report to the database.
	 *
	 * @param id the primary key for the new cop report
	 * @return the new cop report
	 */
	@Override
	public CopReport create(long id) {
		CopReport copReport = new CopReportImpl();

		copReport.setNew(true);
		copReport.setPrimaryKey(id);

		return copReport;
	}

	/**
	 * Removes the cop report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cop report
	 * @return the cop report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException if a cop report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CopReport remove(long id)
		throws NoSuchCopReportException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the cop report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cop report
	 * @return the cop report that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException if a cop report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CopReport remove(Serializable primaryKey)
		throws NoSuchCopReportException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CopReport copReport = (CopReport)session.get(CopReportImpl.class,
					primaryKey);

			if (copReport == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCopReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(copReport);
		}
		catch (NoSuchCopReportException nsee) {
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
	protected CopReport removeImpl(CopReport copReport)
		throws SystemException {
		copReport = toUnwrappedModel(copReport);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(copReport)) {
				copReport = (CopReport)session.get(CopReportImpl.class,
						copReport.getPrimaryKeyObj());
			}

			if (copReport != null) {
				session.delete(copReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (copReport != null) {
			clearCache(copReport);
		}

		return copReport;
	}

	@Override
	public CopReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CopReport copReport)
		throws SystemException {
		copReport = toUnwrappedModel(copReport);

		boolean isNew = copReport.isNew();

		Session session = null;

		try {
			session = openSession();

			if (copReport.isNew()) {
				session.save(copReport);

				copReport.setNew(false);
			}
			else {
				session.merge(copReport);
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

		EntityCacheUtil.putResult(CopReportModelImpl.ENTITY_CACHE_ENABLED,
			CopReportImpl.class, copReport.getPrimaryKey(), copReport);

		return copReport;
	}

	protected CopReport toUnwrappedModel(CopReport copReport) {
		if (copReport instanceof CopReportImpl) {
			return copReport;
		}

		CopReportImpl copReportImpl = new CopReportImpl();

		copReportImpl.setNew(copReport.isNew());
		copReportImpl.setPrimaryKey(copReport.getPrimaryKey());

		copReportImpl.setId(copReport.getId());
		copReportImpl.setRegisteredInspectionId(copReport.getRegisteredInspectionId());
		copReportImpl.setReportNumber(copReport.getReportNumber());
		copReportImpl.setCorporationId(copReport.getCorporationId());
		copReportImpl.setSignName(copReport.getSignName());
		copReportImpl.setSignTitle(copReport.getSignTitle());
		copReportImpl.setSignPlace(copReport.getSignPlace());
		copReportImpl.setSignDate(copReport.getSignDate());

		return copReportImpl;
	}

	/**
	 * Returns the cop report with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cop report
	 * @return the cop report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException if a cop report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CopReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCopReportException, SystemException {
		CopReport copReport = fetchByPrimaryKey(primaryKey);

		if (copReport == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCopReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return copReport;
	}

	/**
	 * Returns the cop report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException} if it could not be found.
	 *
	 * @param id the primary key of the cop report
	 * @return the cop report
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException if a cop report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CopReport findByPrimaryKey(long id)
		throws NoSuchCopReportException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the cop report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cop report
	 * @return the cop report, or <code>null</code> if a cop report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CopReport fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CopReport copReport = (CopReport)EntityCacheUtil.getResult(CopReportModelImpl.ENTITY_CACHE_ENABLED,
				CopReportImpl.class, primaryKey);

		if (copReport == _nullCopReport) {
			return null;
		}

		if (copReport == null) {
			Session session = null;

			try {
				session = openSession();

				copReport = (CopReport)session.get(CopReportImpl.class,
						primaryKey);

				if (copReport != null) {
					cacheResult(copReport);
				}
				else {
					EntityCacheUtil.putResult(CopReportModelImpl.ENTITY_CACHE_ENABLED,
						CopReportImpl.class, primaryKey, _nullCopReport);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CopReportModelImpl.ENTITY_CACHE_ENABLED,
					CopReportImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return copReport;
	}

	/**
	 * Returns the cop report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cop report
	 * @return the cop report, or <code>null</code> if a cop report with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CopReport fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the cop reports.
	 *
	 * @return the cop reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CopReport> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cop reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CopReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cop reports
	 * @param end the upper bound of the range of cop reports (not inclusive)
	 * @return the range of cop reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CopReport> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cop reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CopReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cop reports
	 * @param end the upper bound of the range of cop reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cop reports
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CopReport> findAll(int start, int end,
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

		List<CopReport> list = (List<CopReport>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COPREPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COPREPORT;

				if (pagination) {
					sql = sql.concat(CopReportModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CopReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CopReport>(list);
				}
				else {
					list = (List<CopReport>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cop reports from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CopReport copReport : findAll()) {
			remove(copReport);
		}
	}

	/**
	 * Returns the number of cop reports.
	 *
	 * @return the number of cop reports
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

				Query q = session.createQuery(_SQL_COUNT_COPREPORT);

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
	 * Initializes the cop report persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CopReport")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CopReport>> listenersList = new ArrayList<ModelListener<CopReport>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CopReport>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CopReportImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COPREPORT = "SELECT copReport FROM CopReport copReport";
	private static final String _SQL_COUNT_COPREPORT = "SELECT COUNT(copReport) FROM CopReport copReport";
	private static final String _ORDER_BY_ENTITY_ALIAS = "copReport.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CopReport exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CopReportPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "reportNumber", "corporationId",
				"signName", "signTitle", "signPlace", "signDate"
			});
	private static CopReport _nullCopReport = new CopReportImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CopReport> toCacheModel() {
				return _nullCopReportCacheModel;
			}
		};

	private static CacheModel<CopReport> _nullCopReportCacheModel = new CacheModel<CopReport>() {
			@Override
			public CopReport toEntityModel() {
				return _nullCopReport;
			}
		};
}