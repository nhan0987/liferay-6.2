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

package vn.dtt.gt.dk.dao.common.service.persistence;

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

import vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException;
import vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc;
import vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc linh vuc thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcLinhVucThuTucPersistence
 * @see TthcLinhVucThuTucUtil
 * @generated
 */
public class TthcLinhVucThuTucPersistenceImpl extends BasePersistenceImpl<TthcLinhVucThuTuc>
	implements TthcLinhVucThuTucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcLinhVucThuTucUtil} to access the tthc linh vuc thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcLinhVucThuTucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcLinhVucThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcLinhVucThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcLinhVucThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcLinhVucThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcLinhVucThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TthcLinhVucThuTucPersistenceImpl() {
		setModelClass(TthcLinhVucThuTuc.class);
	}

	/**
	 * Caches the tthc linh vuc thu tuc in the entity cache if it is enabled.
	 *
	 * @param tthcLinhVucThuTuc the tthc linh vuc thu tuc
	 */
	@Override
	public void cacheResult(TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		EntityCacheUtil.putResult(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcLinhVucThuTucImpl.class, tthcLinhVucThuTuc.getPrimaryKey(),
			tthcLinhVucThuTuc);

		tthcLinhVucThuTuc.resetOriginalValues();
	}

	/**
	 * Caches the tthc linh vuc thu tucs in the entity cache if it is enabled.
	 *
	 * @param tthcLinhVucThuTucs the tthc linh vuc thu tucs
	 */
	@Override
	public void cacheResult(List<TthcLinhVucThuTuc> tthcLinhVucThuTucs) {
		for (TthcLinhVucThuTuc tthcLinhVucThuTuc : tthcLinhVucThuTucs) {
			if (EntityCacheUtil.getResult(
						TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
						TthcLinhVucThuTucImpl.class,
						tthcLinhVucThuTuc.getPrimaryKey()) == null) {
				cacheResult(tthcLinhVucThuTuc);
			}
			else {
				tthcLinhVucThuTuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc linh vuc thu tucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcLinhVucThuTucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcLinhVucThuTucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc linh vuc thu tuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		EntityCacheUtil.removeResult(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcLinhVucThuTucImpl.class, tthcLinhVucThuTuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TthcLinhVucThuTuc> tthcLinhVucThuTucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcLinhVucThuTuc tthcLinhVucThuTuc : tthcLinhVucThuTucs) {
			EntityCacheUtil.removeResult(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
				TthcLinhVucThuTucImpl.class, tthcLinhVucThuTuc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tthc linh vuc thu tuc with the primary key. Does not add the tthc linh vuc thu tuc to the database.
	 *
	 * @param Id the primary key for the new tthc linh vuc thu tuc
	 * @return the new tthc linh vuc thu tuc
	 */
	@Override
	public TthcLinhVucThuTuc create(long Id) {
		TthcLinhVucThuTuc tthcLinhVucThuTuc = new TthcLinhVucThuTucImpl();

		tthcLinhVucThuTuc.setNew(true);
		tthcLinhVucThuTuc.setPrimaryKey(Id);

		return tthcLinhVucThuTuc;
	}

	/**
	 * Removes the tthc linh vuc thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tthc linh vuc thu tuc
	 * @return the tthc linh vuc thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcLinhVucThuTuc remove(long Id)
		throws NoSuchTthcLinhVucThuTucException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tthc linh vuc thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc linh vuc thu tuc
	 * @return the tthc linh vuc thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcLinhVucThuTuc remove(Serializable primaryKey)
		throws NoSuchTthcLinhVucThuTucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcLinhVucThuTuc tthcLinhVucThuTuc = (TthcLinhVucThuTuc)session.get(TthcLinhVucThuTucImpl.class,
					primaryKey);

			if (tthcLinhVucThuTuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcLinhVucThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcLinhVucThuTuc);
		}
		catch (NoSuchTthcLinhVucThuTucException nsee) {
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
	protected TthcLinhVucThuTuc removeImpl(TthcLinhVucThuTuc tthcLinhVucThuTuc)
		throws SystemException {
		tthcLinhVucThuTuc = toUnwrappedModel(tthcLinhVucThuTuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcLinhVucThuTuc)) {
				tthcLinhVucThuTuc = (TthcLinhVucThuTuc)session.get(TthcLinhVucThuTucImpl.class,
						tthcLinhVucThuTuc.getPrimaryKeyObj());
			}

			if (tthcLinhVucThuTuc != null) {
				session.delete(tthcLinhVucThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcLinhVucThuTuc != null) {
			clearCache(tthcLinhVucThuTuc);
		}

		return tthcLinhVucThuTuc;
	}

	@Override
	public TthcLinhVucThuTuc updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc tthcLinhVucThuTuc)
		throws SystemException {
		tthcLinhVucThuTuc = toUnwrappedModel(tthcLinhVucThuTuc);

		boolean isNew = tthcLinhVucThuTuc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tthcLinhVucThuTuc.isNew()) {
				session.save(tthcLinhVucThuTuc);

				tthcLinhVucThuTuc.setNew(false);
			}
			else {
				session.merge(tthcLinhVucThuTuc);
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

		EntityCacheUtil.putResult(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcLinhVucThuTucImpl.class, tthcLinhVucThuTuc.getPrimaryKey(),
			tthcLinhVucThuTuc);

		return tthcLinhVucThuTuc;
	}

	protected TthcLinhVucThuTuc toUnwrappedModel(
		TthcLinhVucThuTuc tthcLinhVucThuTuc) {
		if (tthcLinhVucThuTuc instanceof TthcLinhVucThuTucImpl) {
			return tthcLinhVucThuTuc;
		}

		TthcLinhVucThuTucImpl tthcLinhVucThuTucImpl = new TthcLinhVucThuTucImpl();

		tthcLinhVucThuTucImpl.setNew(tthcLinhVucThuTuc.isNew());
		tthcLinhVucThuTucImpl.setPrimaryKey(tthcLinhVucThuTuc.getPrimaryKey());

		tthcLinhVucThuTucImpl.setId(tthcLinhVucThuTuc.getId());
		tthcLinhVucThuTucImpl.setTenLinhVuc(tthcLinhVucThuTuc.getTenLinhVuc());
		tthcLinhVucThuTucImpl.setTenTiengAnh(tthcLinhVucThuTuc.getTenTiengAnh());
		tthcLinhVucThuTucImpl.setIdCha(tthcLinhVucThuTuc.getIdCha());

		return tthcLinhVucThuTucImpl;
	}

	/**
	 * Returns the tthc linh vuc thu tuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc linh vuc thu tuc
	 * @return the tthc linh vuc thu tuc
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcLinhVucThuTuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcLinhVucThuTucException, SystemException {
		TthcLinhVucThuTuc tthcLinhVucThuTuc = fetchByPrimaryKey(primaryKey);

		if (tthcLinhVucThuTuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcLinhVucThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcLinhVucThuTuc;
	}

	/**
	 * Returns the tthc linh vuc thu tuc with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException} if it could not be found.
	 *
	 * @param Id the primary key of the tthc linh vuc thu tuc
	 * @return the tthc linh vuc thu tuc
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException if a tthc linh vuc thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcLinhVucThuTuc findByPrimaryKey(long Id)
		throws NoSuchTthcLinhVucThuTucException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tthc linh vuc thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc linh vuc thu tuc
	 * @return the tthc linh vuc thu tuc, or <code>null</code> if a tthc linh vuc thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcLinhVucThuTuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcLinhVucThuTuc tthcLinhVucThuTuc = (TthcLinhVucThuTuc)EntityCacheUtil.getResult(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
				TthcLinhVucThuTucImpl.class, primaryKey);

		if (tthcLinhVucThuTuc == _nullTthcLinhVucThuTuc) {
			return null;
		}

		if (tthcLinhVucThuTuc == null) {
			Session session = null;

			try {
				session = openSession();

				tthcLinhVucThuTuc = (TthcLinhVucThuTuc)session.get(TthcLinhVucThuTucImpl.class,
						primaryKey);

				if (tthcLinhVucThuTuc != null) {
					cacheResult(tthcLinhVucThuTuc);
				}
				else {
					EntityCacheUtil.putResult(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
						TthcLinhVucThuTucImpl.class, primaryKey,
						_nullTthcLinhVucThuTuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcLinhVucThuTucModelImpl.ENTITY_CACHE_ENABLED,
					TthcLinhVucThuTucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcLinhVucThuTuc;
	}

	/**
	 * Returns the tthc linh vuc thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tthc linh vuc thu tuc
	 * @return the tthc linh vuc thu tuc, or <code>null</code> if a tthc linh vuc thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcLinhVucThuTuc fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tthc linh vuc thu tucs.
	 *
	 * @return the tthc linh vuc thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcLinhVucThuTuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc linh vuc thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc linh vuc thu tucs
	 * @param end the upper bound of the range of tthc linh vuc thu tucs (not inclusive)
	 * @return the range of tthc linh vuc thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcLinhVucThuTuc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc linh vuc thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc linh vuc thu tucs
	 * @param end the upper bound of the range of tthc linh vuc thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc linh vuc thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcLinhVucThuTuc> findAll(int start, int end,
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

		List<TthcLinhVucThuTuc> list = (List<TthcLinhVucThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCLINHVUCTHUTUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCLINHVUCTHUTUC;

				if (pagination) {
					sql = sql.concat(TthcLinhVucThuTucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcLinhVucThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcLinhVucThuTuc>(list);
				}
				else {
					list = (List<TthcLinhVucThuTuc>)QueryUtil.list(q,
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
	 * Removes all the tthc linh vuc thu tucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcLinhVucThuTuc tthcLinhVucThuTuc : findAll()) {
			remove(tthcLinhVucThuTuc);
		}
	}

	/**
	 * Returns the number of tthc linh vuc thu tucs.
	 *
	 * @return the number of tthc linh vuc thu tucs
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

				Query q = session.createQuery(_SQL_COUNT_TTHCLINHVUCTHUTUC);

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
	 * Initializes the tthc linh vuc thu tuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcLinhVucThuTuc>> listenersList = new ArrayList<ModelListener<TthcLinhVucThuTuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcLinhVucThuTuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcLinhVucThuTucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCLINHVUCTHUTUC = "SELECT tthcLinhVucThuTuc FROM TthcLinhVucThuTuc tthcLinhVucThuTuc";
	private static final String _SQL_COUNT_TTHCLINHVUCTHUTUC = "SELECT COUNT(tthcLinhVucThuTuc) FROM TthcLinhVucThuTuc tthcLinhVucThuTuc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcLinhVucThuTuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcLinhVucThuTuc exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcLinhVucThuTucPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "TenLinhVuc", "TenTiengAnh", "IdCha"
			});
	private static TthcLinhVucThuTuc _nullTthcLinhVucThuTuc = new TthcLinhVucThuTucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcLinhVucThuTuc> toCacheModel() {
				return _nullTthcLinhVucThuTucCacheModel;
			}
		};

	private static CacheModel<TthcLinhVucThuTuc> _nullTthcLinhVucThuTucCacheModel =
		new CacheModel<TthcLinhVucThuTuc>() {
			@Override
			public TthcLinhVucThuTuc toEntityModel() {
				return _nullTthcLinhVucThuTuc;
			}
		};
}