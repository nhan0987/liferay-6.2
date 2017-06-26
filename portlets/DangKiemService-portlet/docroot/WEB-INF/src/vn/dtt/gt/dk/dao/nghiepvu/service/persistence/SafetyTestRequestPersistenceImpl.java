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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestRequestImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the safety test request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see SafetyTestRequestPersistence
 * @see SafetyTestRequestUtil
 * @generated
 */
public class SafetyTestRequestPersistenceImpl extends BasePersistenceImpl<SafetyTestRequest>
	implements SafetyTestRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SafetyTestRequestUtil} to access the safety test request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SafetyTestRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestRequestModelImpl.FINDER_CACHE_ENABLED,
			SafetyTestRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestRequestModelImpl.FINDER_CACHE_ENABLED,
			SafetyTestRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SafetyTestRequestPersistenceImpl() {
		setModelClass(SafetyTestRequest.class);
	}

	/**
	 * Caches the safety test request in the entity cache if it is enabled.
	 *
	 * @param safetyTestRequest the safety test request
	 */
	@Override
	public void cacheResult(SafetyTestRequest safetyTestRequest) {
		EntityCacheUtil.putResult(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestRequestImpl.class, safetyTestRequest.getPrimaryKey(),
			safetyTestRequest);

		safetyTestRequest.resetOriginalValues();
	}

	/**
	 * Caches the safety test requests in the entity cache if it is enabled.
	 *
	 * @param safetyTestRequests the safety test requests
	 */
	@Override
	public void cacheResult(List<SafetyTestRequest> safetyTestRequests) {
		for (SafetyTestRequest safetyTestRequest : safetyTestRequests) {
			if (EntityCacheUtil.getResult(
						SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
						SafetyTestRequestImpl.class,
						safetyTestRequest.getPrimaryKey()) == null) {
				cacheResult(safetyTestRequest);
			}
			else {
				safetyTestRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all safety test requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SafetyTestRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SafetyTestRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the safety test request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SafetyTestRequest safetyTestRequest) {
		EntityCacheUtil.removeResult(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestRequestImpl.class, safetyTestRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SafetyTestRequest> safetyTestRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SafetyTestRequest safetyTestRequest : safetyTestRequests) {
			EntityCacheUtil.removeResult(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
				SafetyTestRequestImpl.class, safetyTestRequest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new safety test request with the primary key. Does not add the safety test request to the database.
	 *
	 * @param id the primary key for the new safety test request
	 * @return the new safety test request
	 */
	@Override
	public SafetyTestRequest create(long id) {
		SafetyTestRequest safetyTestRequest = new SafetyTestRequestImpl();

		safetyTestRequest.setNew(true);
		safetyTestRequest.setPrimaryKey(id);

		return safetyTestRequest;
	}

	/**
	 * Removes the safety test request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the safety test request
	 * @return the safety test request that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException if a safety test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestRequest remove(long id)
		throws NoSuchSafetyTestRequestException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the safety test request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the safety test request
	 * @return the safety test request that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException if a safety test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestRequest remove(Serializable primaryKey)
		throws NoSuchSafetyTestRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SafetyTestRequest safetyTestRequest = (SafetyTestRequest)session.get(SafetyTestRequestImpl.class,
					primaryKey);

			if (safetyTestRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSafetyTestRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(safetyTestRequest);
		}
		catch (NoSuchSafetyTestRequestException nsee) {
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
	protected SafetyTestRequest removeImpl(SafetyTestRequest safetyTestRequest)
		throws SystemException {
		safetyTestRequest = toUnwrappedModel(safetyTestRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(safetyTestRequest)) {
				safetyTestRequest = (SafetyTestRequest)session.get(SafetyTestRequestImpl.class,
						safetyTestRequest.getPrimaryKeyObj());
			}

			if (safetyTestRequest != null) {
				session.delete(safetyTestRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (safetyTestRequest != null) {
			clearCache(safetyTestRequest);
		}

		return safetyTestRequest;
	}

	@Override
	public SafetyTestRequest updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest safetyTestRequest)
		throws SystemException {
		safetyTestRequest = toUnwrappedModel(safetyTestRequest);

		boolean isNew = safetyTestRequest.isNew();

		Session session = null;

		try {
			session = openSession();

			if (safetyTestRequest.isNew()) {
				session.save(safetyTestRequest);

				safetyTestRequest.setNew(false);
			}
			else {
				session.merge(safetyTestRequest);
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

		EntityCacheUtil.putResult(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			SafetyTestRequestImpl.class, safetyTestRequest.getPrimaryKey(),
			safetyTestRequest);

		return safetyTestRequest;
	}

	protected SafetyTestRequest toUnwrappedModel(
		SafetyTestRequest safetyTestRequest) {
		if (safetyTestRequest instanceof SafetyTestRequestImpl) {
			return safetyTestRequest;
		}

		SafetyTestRequestImpl safetyTestRequestImpl = new SafetyTestRequestImpl();

		safetyTestRequestImpl.setNew(safetyTestRequest.isNew());
		safetyTestRequestImpl.setPrimaryKey(safetyTestRequest.getPrimaryKey());

		safetyTestRequestImpl.setId(safetyTestRequest.getId());
		safetyTestRequestImpl.setConfirmedInspectionId(safetyTestRequest.getConfirmedInspectionId());
		safetyTestRequestImpl.setRequestNumber(safetyTestRequest.getRequestNumber());
		safetyTestRequestImpl.setTestContent(safetyTestRequest.getTestContent());
		safetyTestRequestImpl.setTestTimeAndPlace(safetyTestRequest.getTestTimeAndPlace());
		safetyTestRequestImpl.setTestPayment(safetyTestRequest.getTestPayment());
		safetyTestRequestImpl.setRemarks(safetyTestRequest.getRemarks());
		safetyTestRequestImpl.setCorporationName(safetyTestRequest.getCorporationName());
		safetyTestRequestImpl.setAttachedFile(safetyTestRequest.getAttachedFile());
		safetyTestRequestImpl.setSignName(safetyTestRequest.getSignName());
		safetyTestRequestImpl.setSignTitle(safetyTestRequest.getSignTitle());
		safetyTestRequestImpl.setSignPlace(safetyTestRequest.getSignPlace());
		safetyTestRequestImpl.setSignDate(safetyTestRequest.getSignDate());

		return safetyTestRequestImpl;
	}

	/**
	 * Returns the safety test request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the safety test request
	 * @return the safety test request
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException if a safety test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSafetyTestRequestException, SystemException {
		SafetyTestRequest safetyTestRequest = fetchByPrimaryKey(primaryKey);

		if (safetyTestRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSafetyTestRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return safetyTestRequest;
	}

	/**
	 * Returns the safety test request with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException} if it could not be found.
	 *
	 * @param id the primary key of the safety test request
	 * @return the safety test request
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException if a safety test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestRequest findByPrimaryKey(long id)
		throws NoSuchSafetyTestRequestException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the safety test request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the safety test request
	 * @return the safety test request, or <code>null</code> if a safety test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SafetyTestRequest safetyTestRequest = (SafetyTestRequest)EntityCacheUtil.getResult(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
				SafetyTestRequestImpl.class, primaryKey);

		if (safetyTestRequest == _nullSafetyTestRequest) {
			return null;
		}

		if (safetyTestRequest == null) {
			Session session = null;

			try {
				session = openSession();

				safetyTestRequest = (SafetyTestRequest)session.get(SafetyTestRequestImpl.class,
						primaryKey);

				if (safetyTestRequest != null) {
					cacheResult(safetyTestRequest);
				}
				else {
					EntityCacheUtil.putResult(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
						SafetyTestRequestImpl.class, primaryKey,
						_nullSafetyTestRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SafetyTestRequestModelImpl.ENTITY_CACHE_ENABLED,
					SafetyTestRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return safetyTestRequest;
	}

	/**
	 * Returns the safety test request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the safety test request
	 * @return the safety test request, or <code>null</code> if a safety test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetyTestRequest fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the safety test requests.
	 *
	 * @return the safety test requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetyTestRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the safety test requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of safety test requests
	 * @param end the upper bound of the range of safety test requests (not inclusive)
	 * @return the range of safety test requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetyTestRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the safety test requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of safety test requests
	 * @param end the upper bound of the range of safety test requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of safety test requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetyTestRequest> findAll(int start, int end,
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

		List<SafetyTestRequest> list = (List<SafetyTestRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAFETYTESTREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAFETYTESTREQUEST;

				if (pagination) {
					sql = sql.concat(SafetyTestRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SafetyTestRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SafetyTestRequest>(list);
				}
				else {
					list = (List<SafetyTestRequest>)QueryUtil.list(q,
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
	 * Removes all the safety test requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SafetyTestRequest safetyTestRequest : findAll()) {
			remove(safetyTestRequest);
		}
	}

	/**
	 * Returns the number of safety test requests.
	 *
	 * @return the number of safety test requests
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

				Query q = session.createQuery(_SQL_COUNT_SAFETYTESTREQUEST);

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
	 * Initializes the safety test request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SafetyTestRequest>> listenersList = new ArrayList<ModelListener<SafetyTestRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SafetyTestRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SafetyTestRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SAFETYTESTREQUEST = "SELECT safetyTestRequest FROM SafetyTestRequest safetyTestRequest";
	private static final String _SQL_COUNT_SAFETYTESTREQUEST = "SELECT COUNT(safetyTestRequest) FROM SafetyTestRequest safetyTestRequest";
	private static final String _ORDER_BY_ENTITY_ALIAS = "safetyTestRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SafetyTestRequest exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SafetyTestRequestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"confirmedInspectionId", "requestNumber", "testContent",
				"testTimeAndPlace", "testPayment", "corporationName",
				"attachedFile", "signName", "signTitle", "signPlace", "signDate"
			});
	private static SafetyTestRequest _nullSafetyTestRequest = new SafetyTestRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SafetyTestRequest> toCacheModel() {
				return _nullSafetyTestRequestCacheModel;
			}
		};

	private static CacheModel<SafetyTestRequest> _nullSafetyTestRequestCacheModel =
		new CacheModel<SafetyTestRequest>() {
			@Override
			public SafetyTestRequest toEntityModel() {
				return _nullSafetyTestRequest;
			}
		};
}