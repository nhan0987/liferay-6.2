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

import vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException;
import vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien;
import vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc don vi thuc hien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHienPersistence
 * @see TthcDonViThucHienUtil
 * @generated
 */
public class TthcDonViThucHienPersistenceImpl extends BasePersistenceImpl<TthcDonViThucHien>
	implements TthcDonViThucHienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcDonViThucHienUtil} to access the tthc don vi thuc hien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcDonViThucHienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDonViThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDonViThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TthcDonViThucHienPersistenceImpl() {
		setModelClass(TthcDonViThucHien.class);
	}

	/**
	 * Caches the tthc don vi thuc hien in the entity cache if it is enabled.
	 *
	 * @param tthcDonViThucHien the tthc don vi thuc hien
	 */
	@Override
	public void cacheResult(TthcDonViThucHien tthcDonViThucHien) {
		EntityCacheUtil.putResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey(),
			tthcDonViThucHien);

		tthcDonViThucHien.resetOriginalValues();
	}

	/**
	 * Caches the tthc don vi thuc hiens in the entity cache if it is enabled.
	 *
	 * @param tthcDonViThucHiens the tthc don vi thuc hiens
	 */
	@Override
	public void cacheResult(List<TthcDonViThucHien> tthcDonViThucHiens) {
		for (TthcDonViThucHien tthcDonViThucHien : tthcDonViThucHiens) {
			if (EntityCacheUtil.getResult(
						TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
						TthcDonViThucHienImpl.class,
						tthcDonViThucHien.getPrimaryKey()) == null) {
				cacheResult(tthcDonViThucHien);
			}
			else {
				tthcDonViThucHien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc don vi thuc hiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcDonViThucHienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcDonViThucHienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc don vi thuc hien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcDonViThucHien tthcDonViThucHien) {
		EntityCacheUtil.removeResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TthcDonViThucHien> tthcDonViThucHiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcDonViThucHien tthcDonViThucHien : tthcDonViThucHiens) {
			EntityCacheUtil.removeResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
				TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tthc don vi thuc hien with the primary key. Does not add the tthc don vi thuc hien to the database.
	 *
	 * @param Id the primary key for the new tthc don vi thuc hien
	 * @return the new tthc don vi thuc hien
	 */
	@Override
	public TthcDonViThucHien create(long Id) {
		TthcDonViThucHien tthcDonViThucHien = new TthcDonViThucHienImpl();

		tthcDonViThucHien.setNew(true);
		tthcDonViThucHien.setPrimaryKey(Id);

		return tthcDonViThucHien;
	}

	/**
	 * Removes the tthc don vi thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien remove(long Id)
		throws NoSuchTthcDonViThucHienException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tthc don vi thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien remove(Serializable primaryKey)
		throws NoSuchTthcDonViThucHienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcDonViThucHien tthcDonViThucHien = (TthcDonViThucHien)session.get(TthcDonViThucHienImpl.class,
					primaryKey);

			if (tthcDonViThucHien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcDonViThucHienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcDonViThucHien);
		}
		catch (NoSuchTthcDonViThucHienException nsee) {
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
	protected TthcDonViThucHien removeImpl(TthcDonViThucHien tthcDonViThucHien)
		throws SystemException {
		tthcDonViThucHien = toUnwrappedModel(tthcDonViThucHien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcDonViThucHien)) {
				tthcDonViThucHien = (TthcDonViThucHien)session.get(TthcDonViThucHienImpl.class,
						tthcDonViThucHien.getPrimaryKeyObj());
			}

			if (tthcDonViThucHien != null) {
				session.delete(tthcDonViThucHien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcDonViThucHien != null) {
			clearCache(tthcDonViThucHien);
		}

		return tthcDonViThucHien;
	}

	@Override
	public TthcDonViThucHien updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien tthcDonViThucHien)
		throws SystemException {
		tthcDonViThucHien = toUnwrappedModel(tthcDonViThucHien);

		boolean isNew = tthcDonViThucHien.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tthcDonViThucHien.isNew()) {
				session.save(tthcDonViThucHien);

				tthcDonViThucHien.setNew(false);
			}
			else {
				session.merge(tthcDonViThucHien);
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

		EntityCacheUtil.putResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey(),
			tthcDonViThucHien);

		return tthcDonViThucHien;
	}

	protected TthcDonViThucHien toUnwrappedModel(
		TthcDonViThucHien tthcDonViThucHien) {
		if (tthcDonViThucHien instanceof TthcDonViThucHienImpl) {
			return tthcDonViThucHien;
		}

		TthcDonViThucHienImpl tthcDonViThucHienImpl = new TthcDonViThucHienImpl();

		tthcDonViThucHienImpl.setNew(tthcDonViThucHien.isNew());
		tthcDonViThucHienImpl.setPrimaryKey(tthcDonViThucHien.getPrimaryKey());

		tthcDonViThucHienImpl.setId(tthcDonViThucHien.getId());
		tthcDonViThucHienImpl.setThuTucHanhChinhId(tthcDonViThucHien.getThuTucHanhChinhId());
		tthcDonViThucHienImpl.setMaDvth(tthcDonViThucHien.getMaDvth());
		tthcDonViThucHienImpl.setTenDvth(tthcDonViThucHien.getTenDvth());
		tthcDonViThucHienImpl.setTenTiengAnh(tthcDonViThucHien.getTenTiengAnh());
		tthcDonViThucHienImpl.setToChuc(tthcDonViThucHien.getToChuc());

		return tthcDonViThucHienImpl;
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcDonViThucHienException, SystemException {
		TthcDonViThucHien tthcDonViThucHien = fetchByPrimaryKey(primaryKey);

		if (tthcDonViThucHien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcDonViThucHienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcDonViThucHien;
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException} if it could not be found.
	 *
	 * @param Id the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien findByPrimaryKey(long Id)
		throws NoSuchTthcDonViThucHienException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien, or <code>null</code> if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcDonViThucHien tthcDonViThucHien = (TthcDonViThucHien)EntityCacheUtil.getResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
				TthcDonViThucHienImpl.class, primaryKey);

		if (tthcDonViThucHien == _nullTthcDonViThucHien) {
			return null;
		}

		if (tthcDonViThucHien == null) {
			Session session = null;

			try {
				session = openSession();

				tthcDonViThucHien = (TthcDonViThucHien)session.get(TthcDonViThucHienImpl.class,
						primaryKey);

				if (tthcDonViThucHien != null) {
					cacheResult(tthcDonViThucHien);
				}
				else {
					EntityCacheUtil.putResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
						TthcDonViThucHienImpl.class, primaryKey,
						_nullTthcDonViThucHien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
					TthcDonViThucHienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcDonViThucHien;
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien, or <code>null</code> if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tthc don vi thuc hiens.
	 *
	 * @return the tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc don vi thuc hiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc don vi thuc hiens
	 * @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	 * @return the range of tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc don vi thuc hiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc don vi thuc hiens
	 * @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findAll(int start, int end,
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

		List<TthcDonViThucHien> list = (List<TthcDonViThucHien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCDONVITHUCHIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCDONVITHUCHIEN;

				if (pagination) {
					sql = sql.concat(TthcDonViThucHienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcDonViThucHien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcDonViThucHien>(list);
				}
				else {
					list = (List<TthcDonViThucHien>)QueryUtil.list(q,
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
	 * Removes all the tthc don vi thuc hiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcDonViThucHien tthcDonViThucHien : findAll()) {
			remove(tthcDonViThucHien);
		}
	}

	/**
	 * Returns the number of tthc don vi thuc hiens.
	 *
	 * @return the number of tthc don vi thuc hiens
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

				Query q = session.createQuery(_SQL_COUNT_TTHCDONVITHUCHIEN);

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
	 * Initializes the tthc don vi thuc hien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcDonViThucHien>> listenersList = new ArrayList<ModelListener<TthcDonViThucHien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcDonViThucHien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcDonViThucHienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCDONVITHUCHIEN = "SELECT tthcDonViThucHien FROM TthcDonViThucHien tthcDonViThucHien";
	private static final String _SQL_COUNT_TTHCDONVITHUCHIEN = "SELECT COUNT(tthcDonViThucHien) FROM TthcDonViThucHien tthcDonViThucHien";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcDonViThucHien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcDonViThucHien exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcDonViThucHienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "ThuTucHanhChinhId", "MaDvth", "TenDvth", "TenTiengAnh",
				"ToChuc"
			});
	private static TthcDonViThucHien _nullTthcDonViThucHien = new TthcDonViThucHienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcDonViThucHien> toCacheModel() {
				return _nullTthcDonViThucHienCacheModel;
			}
		};

	private static CacheModel<TthcDonViThucHien> _nullTthcDonViThucHienCacheModel =
		new CacheModel<TthcDonViThucHien>() {
			@Override
			public TthcDonViThucHien toEntityModel() {
				return _nullTthcDonViThucHien;
			}
		};
}