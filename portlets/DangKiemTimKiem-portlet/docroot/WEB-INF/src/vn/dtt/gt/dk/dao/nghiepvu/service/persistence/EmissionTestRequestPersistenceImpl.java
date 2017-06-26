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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the emission test request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see EmissionTestRequestPersistence
 * @see EmissionTestRequestUtil
 * @generated
 */
public class EmissionTestRequestPersistenceImpl extends BasePersistenceImpl<EmissionTestRequest>
	implements EmissionTestRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmissionTestRequestUtil} to access the emission test request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmissionTestRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequestModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequestModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmissionTestRequestPersistenceImpl() {
		setModelClass(EmissionTestRequest.class);
	}

	/**
	 * Caches the emission test request in the entity cache if it is enabled.
	 *
	 * @param emissionTestRequest the emission test request
	 */
	@Override
	public void cacheResult(EmissionTestRequest emissionTestRequest) {
		EntityCacheUtil.putResult(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequestImpl.class, emissionTestRequest.getPrimaryKey(),
			emissionTestRequest);

		emissionTestRequest.resetOriginalValues();
	}

	/**
	 * Caches the emission test requests in the entity cache if it is enabled.
	 *
	 * @param emissionTestRequests the emission test requests
	 */
	@Override
	public void cacheResult(List<EmissionTestRequest> emissionTestRequests) {
		for (EmissionTestRequest emissionTestRequest : emissionTestRequests) {
			if (EntityCacheUtil.getResult(
						EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
						EmissionTestRequestImpl.class,
						emissionTestRequest.getPrimaryKey()) == null) {
				cacheResult(emissionTestRequest);
			}
			else {
				emissionTestRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emission test requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmissionTestRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmissionTestRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emission test request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmissionTestRequest emissionTestRequest) {
		EntityCacheUtil.removeResult(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequestImpl.class, emissionTestRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmissionTestRequest> emissionTestRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmissionTestRequest emissionTestRequest : emissionTestRequests) {
			EntityCacheUtil.removeResult(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
				EmissionTestRequestImpl.class,
				emissionTestRequest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new emission test request with the primary key. Does not add the emission test request to the database.
	 *
	 * @param id the primary key for the new emission test request
	 * @return the new emission test request
	 */
	@Override
	public EmissionTestRequest create(long id) {
		EmissionTestRequest emissionTestRequest = new EmissionTestRequestImpl();

		emissionTestRequest.setNew(true);
		emissionTestRequest.setPrimaryKey(id);

		return emissionTestRequest;
	}

	/**
	 * Removes the emission test request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the emission test request
	 * @return the emission test request that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException if a emission test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequest remove(long id)
		throws NoSuchEmissionTestRequestException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the emission test request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emission test request
	 * @return the emission test request that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException if a emission test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequest remove(Serializable primaryKey)
		throws NoSuchEmissionTestRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmissionTestRequest emissionTestRequest = (EmissionTestRequest)session.get(EmissionTestRequestImpl.class,
					primaryKey);

			if (emissionTestRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmissionTestRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(emissionTestRequest);
		}
		catch (NoSuchEmissionTestRequestException nsee) {
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
	protected EmissionTestRequest removeImpl(
		EmissionTestRequest emissionTestRequest) throws SystemException {
		emissionTestRequest = toUnwrappedModel(emissionTestRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(emissionTestRequest)) {
				emissionTestRequest = (EmissionTestRequest)session.get(EmissionTestRequestImpl.class,
						emissionTestRequest.getPrimaryKeyObj());
			}

			if (emissionTestRequest != null) {
				session.delete(emissionTestRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (emissionTestRequest != null) {
			clearCache(emissionTestRequest);
		}

		return emissionTestRequest;
	}

	@Override
	public EmissionTestRequest updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest emissionTestRequest)
		throws SystemException {
		emissionTestRequest = toUnwrappedModel(emissionTestRequest);

		boolean isNew = emissionTestRequest.isNew();

		Session session = null;

		try {
			session = openSession();

			if (emissionTestRequest.isNew()) {
				session.save(emissionTestRequest);

				emissionTestRequest.setNew(false);
			}
			else {
				session.merge(emissionTestRequest);
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

		EntityCacheUtil.putResult(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequestImpl.class, emissionTestRequest.getPrimaryKey(),
			emissionTestRequest);

		return emissionTestRequest;
	}

	protected EmissionTestRequest toUnwrappedModel(
		EmissionTestRequest emissionTestRequest) {
		if (emissionTestRequest instanceof EmissionTestRequestImpl) {
			return emissionTestRequest;
		}

		EmissionTestRequestImpl emissionTestRequestImpl = new EmissionTestRequestImpl();

		emissionTestRequestImpl.setNew(emissionTestRequest.isNew());
		emissionTestRequestImpl.setPrimaryKey(emissionTestRequest.getPrimaryKey());

		emissionTestRequestImpl.setId(emissionTestRequest.getId());
		emissionTestRequestImpl.setConfirmedInspectionId(emissionTestRequest.getConfirmedInspectionId());
		emissionTestRequestImpl.setRequestNumber(emissionTestRequest.getRequestNumber());
		emissionTestRequestImpl.setTestTimeAndPlace(emissionTestRequest.getTestTimeAndPlace());
		emissionTestRequestImpl.setTestPayment(emissionTestRequest.getTestPayment());
		emissionTestRequestImpl.setRemarks(emissionTestRequest.getRemarks());
		emissionTestRequestImpl.setCorporationName(emissionTestRequest.getCorporationName());
		emissionTestRequestImpl.setAttachedFile(emissionTestRequest.getAttachedFile());
		emissionTestRequestImpl.setSignName(emissionTestRequest.getSignName());
		emissionTestRequestImpl.setSignTitle(emissionTestRequest.getSignTitle());
		emissionTestRequestImpl.setSignPlace(emissionTestRequest.getSignPlace());
		emissionTestRequestImpl.setSignDate(emissionTestRequest.getSignDate());

		return emissionTestRequestImpl;
	}

	/**
	 * Returns the emission test request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emission test request
	 * @return the emission test request
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException if a emission test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmissionTestRequestException, SystemException {
		EmissionTestRequest emissionTestRequest = fetchByPrimaryKey(primaryKey);

		if (emissionTestRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmissionTestRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return emissionTestRequest;
	}

	/**
	 * Returns the emission test request with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException} if it could not be found.
	 *
	 * @param id the primary key of the emission test request
	 * @return the emission test request
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException if a emission test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequest findByPrimaryKey(long id)
		throws NoSuchEmissionTestRequestException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the emission test request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emission test request
	 * @return the emission test request, or <code>null</code> if a emission test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmissionTestRequest emissionTestRequest = (EmissionTestRequest)EntityCacheUtil.getResult(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
				EmissionTestRequestImpl.class, primaryKey);

		if (emissionTestRequest == _nullEmissionTestRequest) {
			return null;
		}

		if (emissionTestRequest == null) {
			Session session = null;

			try {
				session = openSession();

				emissionTestRequest = (EmissionTestRequest)session.get(EmissionTestRequestImpl.class,
						primaryKey);

				if (emissionTestRequest != null) {
					cacheResult(emissionTestRequest);
				}
				else {
					EntityCacheUtil.putResult(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
						EmissionTestRequestImpl.class, primaryKey,
						_nullEmissionTestRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmissionTestRequestModelImpl.ENTITY_CACHE_ENABLED,
					EmissionTestRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return emissionTestRequest;
	}

	/**
	 * Returns the emission test request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the emission test request
	 * @return the emission test request, or <code>null</code> if a emission test request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequest fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the emission test requests.
	 *
	 * @return the emission test requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emission test requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emission test requests
	 * @param end the upper bound of the range of emission test requests (not inclusive)
	 * @return the range of emission test requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emission test requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emission test requests
	 * @param end the upper bound of the range of emission test requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emission test requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequest> findAll(int start, int end,
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

		List<EmissionTestRequest> list = (List<EmissionTestRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMISSIONTESTREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMISSIONTESTREQUEST;

				if (pagination) {
					sql = sql.concat(EmissionTestRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmissionTestRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmissionTestRequest>(list);
				}
				else {
					list = (List<EmissionTestRequest>)QueryUtil.list(q,
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
	 * Removes all the emission test requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmissionTestRequest emissionTestRequest : findAll()) {
			remove(emissionTestRequest);
		}
	}

	/**
	 * Returns the number of emission test requests.
	 *
	 * @return the number of emission test requests
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

				Query q = session.createQuery(_SQL_COUNT_EMISSIONTESTREQUEST);

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
	 * Initializes the emission test request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmissionTestRequest>> listenersList = new ArrayList<ModelListener<EmissionTestRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmissionTestRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmissionTestRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMISSIONTESTREQUEST = "SELECT emissionTestRequest FROM EmissionTestRequest emissionTestRequest";
	private static final String _SQL_COUNT_EMISSIONTESTREQUEST = "SELECT COUNT(emissionTestRequest) FROM EmissionTestRequest emissionTestRequest";
	private static final String _ORDER_BY_ENTITY_ALIAS = "emissionTestRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmissionTestRequest exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmissionTestRequestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"confirmedInspectionId", "requestNumber", "testTimeAndPlace",
				"testPayment", "corporationName", "attachedFile", "signName",
				"signTitle", "signPlace", "signDate"
			});
	private static EmissionTestRequest _nullEmissionTestRequest = new EmissionTestRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmissionTestRequest> toCacheModel() {
				return _nullEmissionTestRequestCacheModel;
			}
		};

	private static CacheModel<EmissionTestRequest> _nullEmissionTestRequestCacheModel =
		new CacheModel<EmissionTestRequest>() {
			@Override
			public EmissionTestRequest toEntityModel() {
				return _nullEmissionTestRequest;
			}
		};
}