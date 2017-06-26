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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the control request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ControlRequestPersistence
 * @see ControlRequestUtil
 * @generated
 */
public class ControlRequestPersistenceImpl extends BasePersistenceImpl<ControlRequest>
	implements ControlRequestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ControlRequestUtil} to access the control request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ControlRequestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequestModelImpl.FINDER_CACHE_ENABLED,
			ControlRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequestModelImpl.FINDER_CACHE_ENABLED,
			ControlRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ControlRequestPersistenceImpl() {
		setModelClass(ControlRequest.class);
	}

	/**
	 * Caches the control request in the entity cache if it is enabled.
	 *
	 * @param controlRequest the control request
	 */
	@Override
	public void cacheResult(ControlRequest controlRequest) {
		EntityCacheUtil.putResult(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequestImpl.class, controlRequest.getPrimaryKey(),
			controlRequest);

		controlRequest.resetOriginalValues();
	}

	/**
	 * Caches the control requests in the entity cache if it is enabled.
	 *
	 * @param controlRequests the control requests
	 */
	@Override
	public void cacheResult(List<ControlRequest> controlRequests) {
		for (ControlRequest controlRequest : controlRequests) {
			if (EntityCacheUtil.getResult(
						ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
						ControlRequestImpl.class, controlRequest.getPrimaryKey()) == null) {
				cacheResult(controlRequest);
			}
			else {
				controlRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all control requests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ControlRequestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ControlRequestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the control request.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ControlRequest controlRequest) {
		EntityCacheUtil.removeResult(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequestImpl.class, controlRequest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ControlRequest> controlRequests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ControlRequest controlRequest : controlRequests) {
			EntityCacheUtil.removeResult(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
				ControlRequestImpl.class, controlRequest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new control request with the primary key. Does not add the control request to the database.
	 *
	 * @param id the primary key for the new control request
	 * @return the new control request
	 */
	@Override
	public ControlRequest create(long id) {
		ControlRequest controlRequest = new ControlRequestImpl();

		controlRequest.setNew(true);
		controlRequest.setPrimaryKey(id);

		return controlRequest;
	}

	/**
	 * Removes the control request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the control request
	 * @return the control request that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException if a control request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequest remove(long id)
		throws NoSuchControlRequestException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the control request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the control request
	 * @return the control request that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException if a control request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequest remove(Serializable primaryKey)
		throws NoSuchControlRequestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ControlRequest controlRequest = (ControlRequest)session.get(ControlRequestImpl.class,
					primaryKey);

			if (controlRequest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchControlRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(controlRequest);
		}
		catch (NoSuchControlRequestException nsee) {
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
	protected ControlRequest removeImpl(ControlRequest controlRequest)
		throws SystemException {
		controlRequest = toUnwrappedModel(controlRequest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(controlRequest)) {
				controlRequest = (ControlRequest)session.get(ControlRequestImpl.class,
						controlRequest.getPrimaryKeyObj());
			}

			if (controlRequest != null) {
				session.delete(controlRequest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (controlRequest != null) {
			clearCache(controlRequest);
		}

		return controlRequest;
	}

	@Override
	public ControlRequest updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest controlRequest)
		throws SystemException {
		controlRequest = toUnwrappedModel(controlRequest);

		boolean isNew = controlRequest.isNew();

		Session session = null;

		try {
			session = openSession();

			if (controlRequest.isNew()) {
				session.save(controlRequest);

				controlRequest.setNew(false);
			}
			else {
				session.merge(controlRequest);
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

		EntityCacheUtil.putResult(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequestImpl.class, controlRequest.getPrimaryKey(),
			controlRequest);

		return controlRequest;
	}

	protected ControlRequest toUnwrappedModel(ControlRequest controlRequest) {
		if (controlRequest instanceof ControlRequestImpl) {
			return controlRequest;
		}

		ControlRequestImpl controlRequestImpl = new ControlRequestImpl();

		controlRequestImpl.setNew(controlRequest.isNew());
		controlRequestImpl.setPrimaryKey(controlRequest.getPrimaryKey());

		controlRequestImpl.setId(controlRequest.getId());
		controlRequestImpl.setConfirmedInspectionId(controlRequest.getConfirmedInspectionId());
		controlRequestImpl.setRequestNumber(controlRequest.getRequestNumber());
		controlRequestImpl.setCorporationName(controlRequest.getCorporationName());
		controlRequestImpl.setControlContent(controlRequest.getControlContent());
		controlRequestImpl.setControlDeadLine(controlRequest.getControlDeadLine());
		controlRequestImpl.setRemarks(controlRequest.getRemarks());
		controlRequestImpl.setAttachedFile(controlRequest.getAttachedFile());
		controlRequestImpl.setSignName(controlRequest.getSignName());
		controlRequestImpl.setSignTitle(controlRequest.getSignTitle());
		controlRequestImpl.setSignPlace(controlRequest.getSignPlace());
		controlRequestImpl.setSignDate(controlRequest.getSignDate());

		return controlRequestImpl;
	}

	/**
	 * Returns the control request with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the control request
	 * @return the control request
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException if a control request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchControlRequestException, SystemException {
		ControlRequest controlRequest = fetchByPrimaryKey(primaryKey);

		if (controlRequest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchControlRequestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return controlRequest;
	}

	/**
	 * Returns the control request with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException} if it could not be found.
	 *
	 * @param id the primary key of the control request
	 * @return the control request
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException if a control request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequest findByPrimaryKey(long id)
		throws NoSuchControlRequestException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the control request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the control request
	 * @return the control request, or <code>null</code> if a control request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ControlRequest controlRequest = (ControlRequest)EntityCacheUtil.getResult(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
				ControlRequestImpl.class, primaryKey);

		if (controlRequest == _nullControlRequest) {
			return null;
		}

		if (controlRequest == null) {
			Session session = null;

			try {
				session = openSession();

				controlRequest = (ControlRequest)session.get(ControlRequestImpl.class,
						primaryKey);

				if (controlRequest != null) {
					cacheResult(controlRequest);
				}
				else {
					EntityCacheUtil.putResult(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
						ControlRequestImpl.class, primaryKey,
						_nullControlRequest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ControlRequestModelImpl.ENTITY_CACHE_ENABLED,
					ControlRequestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return controlRequest;
	}

	/**
	 * Returns the control request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the control request
	 * @return the control request, or <code>null</code> if a control request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequest fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the control requests.
	 *
	 * @return the control requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the control requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of control requests
	 * @param end the upper bound of the range of control requests (not inclusive)
	 * @return the range of control requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the control requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of control requests
	 * @param end the upper bound of the range of control requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of control requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequest> findAll(int start, int end,
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

		List<ControlRequest> list = (List<ControlRequest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONTROLREQUEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTROLREQUEST;

				if (pagination) {
					sql = sql.concat(ControlRequestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ControlRequest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ControlRequest>(list);
				}
				else {
					list = (List<ControlRequest>)QueryUtil.list(q,
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
	 * Removes all the control requests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ControlRequest controlRequest : findAll()) {
			remove(controlRequest);
		}
	}

	/**
	 * Returns the number of control requests.
	 *
	 * @return the number of control requests
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

				Query q = session.createQuery(_SQL_COUNT_CONTROLREQUEST);

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
	 * Initializes the control request persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ControlRequest>> listenersList = new ArrayList<ModelListener<ControlRequest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ControlRequest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ControlRequestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONTROLREQUEST = "SELECT controlRequest FROM ControlRequest controlRequest";
	private static final String _SQL_COUNT_CONTROLREQUEST = "SELECT COUNT(controlRequest) FROM ControlRequest controlRequest";
	private static final String _ORDER_BY_ENTITY_ALIAS = "controlRequest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ControlRequest exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ControlRequestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"confirmedInspectionId", "requestNumber", "corporationName",
				"controlContent", "controlDeadLine", "attachedFile", "signName",
				"signTitle", "signPlace", "signDate"
			});
	private static ControlRequest _nullControlRequest = new ControlRequestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ControlRequest> toCacheModel() {
				return _nullControlRequestCacheModel;
			}
		};

	private static CacheModel<ControlRequest> _nullControlRequestCacheModel = new CacheModel<ControlRequest>() {
			@Override
			public ControlRequest toEntityModel() {
				return _nullControlRequest;
			}
		};
}