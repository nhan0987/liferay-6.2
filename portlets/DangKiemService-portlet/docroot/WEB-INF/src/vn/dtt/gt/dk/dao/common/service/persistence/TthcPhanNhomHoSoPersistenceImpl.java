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

import vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException;
import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc phan nhom ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see TthcPhanNhomHoSoPersistence
 * @see TthcPhanNhomHoSoUtil
 * @generated
 */
public class TthcPhanNhomHoSoPersistenceImpl extends BasePersistenceImpl<TthcPhanNhomHoSo>
	implements TthcPhanNhomHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcPhanNhomHoSoUtil} to access the tthc phan nhom ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcPhanNhomHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcPhanNhomHoSoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcPhanNhomHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TthcPhanNhomHoSoPersistenceImpl() {
		setModelClass(TthcPhanNhomHoSo.class);
	}

	/**
	 * Caches the tthc phan nhom ho so in the entity cache if it is enabled.
	 *
	 * @param tthcPhanNhomHoSo the tthc phan nhom ho so
	 */
	@Override
	public void cacheResult(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		EntityCacheUtil.putResult(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoImpl.class, tthcPhanNhomHoSo.getPrimaryKey(),
			tthcPhanNhomHoSo);

		tthcPhanNhomHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tthc phan nhom ho sos in the entity cache if it is enabled.
	 *
	 * @param tthcPhanNhomHoSos the tthc phan nhom ho sos
	 */
	@Override
	public void cacheResult(List<TthcPhanNhomHoSo> tthcPhanNhomHoSos) {
		for (TthcPhanNhomHoSo tthcPhanNhomHoSo : tthcPhanNhomHoSos) {
			if (EntityCacheUtil.getResult(
						TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcPhanNhomHoSoImpl.class,
						tthcPhanNhomHoSo.getPrimaryKey()) == null) {
				cacheResult(tthcPhanNhomHoSo);
			}
			else {
				tthcPhanNhomHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc phan nhom ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcPhanNhomHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcPhanNhomHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc phan nhom ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		EntityCacheUtil.removeResult(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoImpl.class, tthcPhanNhomHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TthcPhanNhomHoSo> tthcPhanNhomHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcPhanNhomHoSo tthcPhanNhomHoSo : tthcPhanNhomHoSos) {
			EntityCacheUtil.removeResult(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcPhanNhomHoSoImpl.class, tthcPhanNhomHoSo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tthc phan nhom ho so with the primary key. Does not add the tthc phan nhom ho so to the database.
	 *
	 * @param Id the primary key for the new tthc phan nhom ho so
	 * @return the new tthc phan nhom ho so
	 */
	@Override
	public TthcPhanNhomHoSo create(long Id) {
		TthcPhanNhomHoSo tthcPhanNhomHoSo = new TthcPhanNhomHoSoImpl();

		tthcPhanNhomHoSo.setNew(true);
		tthcPhanNhomHoSo.setPrimaryKey(Id);

		return tthcPhanNhomHoSo;
	}

	/**
	 * Removes the tthc phan nhom ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tthc phan nhom ho so
	 * @return the tthc phan nhom ho so that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException if a tthc phan nhom ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSo remove(long Id)
		throws NoSuchTthcPhanNhomHoSoException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tthc phan nhom ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc phan nhom ho so
	 * @return the tthc phan nhom ho so that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException if a tthc phan nhom ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSo remove(Serializable primaryKey)
		throws NoSuchTthcPhanNhomHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcPhanNhomHoSo tthcPhanNhomHoSo = (TthcPhanNhomHoSo)session.get(TthcPhanNhomHoSoImpl.class,
					primaryKey);

			if (tthcPhanNhomHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcPhanNhomHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcPhanNhomHoSo);
		}
		catch (NoSuchTthcPhanNhomHoSoException nsee) {
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
	protected TthcPhanNhomHoSo removeImpl(TthcPhanNhomHoSo tthcPhanNhomHoSo)
		throws SystemException {
		tthcPhanNhomHoSo = toUnwrappedModel(tthcPhanNhomHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcPhanNhomHoSo)) {
				tthcPhanNhomHoSo = (TthcPhanNhomHoSo)session.get(TthcPhanNhomHoSoImpl.class,
						tthcPhanNhomHoSo.getPrimaryKeyObj());
			}

			if (tthcPhanNhomHoSo != null) {
				session.delete(tthcPhanNhomHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcPhanNhomHoSo != null) {
			clearCache(tthcPhanNhomHoSo);
		}

		return tthcPhanNhomHoSo;
	}

	@Override
	public TthcPhanNhomHoSo updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo)
		throws SystemException {
		tthcPhanNhomHoSo = toUnwrappedModel(tthcPhanNhomHoSo);

		boolean isNew = tthcPhanNhomHoSo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tthcPhanNhomHoSo.isNew()) {
				session.save(tthcPhanNhomHoSo);

				tthcPhanNhomHoSo.setNew(false);
			}
			else {
				session.merge(tthcPhanNhomHoSo);
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

		EntityCacheUtil.putResult(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcPhanNhomHoSoImpl.class, tthcPhanNhomHoSo.getPrimaryKey(),
			tthcPhanNhomHoSo);

		return tthcPhanNhomHoSo;
	}

	protected TthcPhanNhomHoSo toUnwrappedModel(
		TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		if (tthcPhanNhomHoSo instanceof TthcPhanNhomHoSoImpl) {
			return tthcPhanNhomHoSo;
		}

		TthcPhanNhomHoSoImpl tthcPhanNhomHoSoImpl = new TthcPhanNhomHoSoImpl();

		tthcPhanNhomHoSoImpl.setNew(tthcPhanNhomHoSo.isNew());
		tthcPhanNhomHoSoImpl.setPrimaryKey(tthcPhanNhomHoSo.getPrimaryKey());

		tthcPhanNhomHoSoImpl.setId(tthcPhanNhomHoSo.getId());
		tthcPhanNhomHoSoImpl.setMaPhanNhom(tthcPhanNhomHoSo.getMaPhanNhom());
		tthcPhanNhomHoSoImpl.setTenPhanNhom(tthcPhanNhomHoSo.getTenPhanNhom());
		tthcPhanNhomHoSoImpl.setTenTiengAnh(tthcPhanNhomHoSo.getTenTiengAnh());
		tthcPhanNhomHoSoImpl.setLoaiPhieuXuLy(tthcPhanNhomHoSo.getLoaiPhieuXuLy());
		tthcPhanNhomHoSoImpl.setSoThuTu(tthcPhanNhomHoSo.getSoThuTu());
		tthcPhanNhomHoSoImpl.setSynchdate(tthcPhanNhomHoSo.getSynchdate());

		return tthcPhanNhomHoSoImpl;
	}

	/**
	 * Returns the tthc phan nhom ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc phan nhom ho so
	 * @return the tthc phan nhom ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException if a tthc phan nhom ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcPhanNhomHoSoException, SystemException {
		TthcPhanNhomHoSo tthcPhanNhomHoSo = fetchByPrimaryKey(primaryKey);

		if (tthcPhanNhomHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcPhanNhomHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcPhanNhomHoSo;
	}

	/**
	 * Returns the tthc phan nhom ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException} if it could not be found.
	 *
	 * @param Id the primary key of the tthc phan nhom ho so
	 * @return the tthc phan nhom ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException if a tthc phan nhom ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSo findByPrimaryKey(long Id)
		throws NoSuchTthcPhanNhomHoSoException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tthc phan nhom ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc phan nhom ho so
	 * @return the tthc phan nhom ho so, or <code>null</code> if a tthc phan nhom ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcPhanNhomHoSo tthcPhanNhomHoSo = (TthcPhanNhomHoSo)EntityCacheUtil.getResult(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcPhanNhomHoSoImpl.class, primaryKey);

		if (tthcPhanNhomHoSo == _nullTthcPhanNhomHoSo) {
			return null;
		}

		if (tthcPhanNhomHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				tthcPhanNhomHoSo = (TthcPhanNhomHoSo)session.get(TthcPhanNhomHoSoImpl.class,
						primaryKey);

				if (tthcPhanNhomHoSo != null) {
					cacheResult(tthcPhanNhomHoSo);
				}
				else {
					EntityCacheUtil.putResult(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcPhanNhomHoSoImpl.class, primaryKey,
						_nullTthcPhanNhomHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcPhanNhomHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TthcPhanNhomHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcPhanNhomHoSo;
	}

	/**
	 * Returns the tthc phan nhom ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tthc phan nhom ho so
	 * @return the tthc phan nhom ho so, or <code>null</code> if a tthc phan nhom ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcPhanNhomHoSo fetchByPrimaryKey(long Id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tthc phan nhom ho sos.
	 *
	 * @return the tthc phan nhom ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc phan nhom ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc phan nhom ho sos
	 * @param end the upper bound of the range of tthc phan nhom ho sos (not inclusive)
	 * @return the range of tthc phan nhom ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc phan nhom ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc phan nhom ho sos
	 * @param end the upper bound of the range of tthc phan nhom ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc phan nhom ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcPhanNhomHoSo> findAll(int start, int end,
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

		List<TthcPhanNhomHoSo> list = (List<TthcPhanNhomHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCPHANNHOMHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCPHANNHOMHOSO;

				if (pagination) {
					sql = sql.concat(TthcPhanNhomHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcPhanNhomHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcPhanNhomHoSo>(list);
				}
				else {
					list = (List<TthcPhanNhomHoSo>)QueryUtil.list(q,
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
	 * Removes all the tthc phan nhom ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcPhanNhomHoSo tthcPhanNhomHoSo : findAll()) {
			remove(tthcPhanNhomHoSo);
		}
	}

	/**
	 * Returns the number of tthc phan nhom ho sos.
	 *
	 * @return the number of tthc phan nhom ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TTHCPHANNHOMHOSO);

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
	 * Initializes the tthc phan nhom ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcPhanNhomHoSo>> listenersList = new ArrayList<ModelListener<TthcPhanNhomHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcPhanNhomHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcPhanNhomHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCPHANNHOMHOSO = "SELECT tthcPhanNhomHoSo FROM TthcPhanNhomHoSo tthcPhanNhomHoSo";
	private static final String _SQL_COUNT_TTHCPHANNHOMHOSO = "SELECT COUNT(tthcPhanNhomHoSo) FROM TthcPhanNhomHoSo tthcPhanNhomHoSo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcPhanNhomHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcPhanNhomHoSo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcPhanNhomHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "MaPhanNhom", "TenPhanNhom", "TenTiengAnh",
				"loaiPhieuXuLy", "SoThuTu"
			});
	private static TthcPhanNhomHoSo _nullTthcPhanNhomHoSo = new TthcPhanNhomHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcPhanNhomHoSo> toCacheModel() {
				return _nullTthcPhanNhomHoSoCacheModel;
			}
		};

	private static CacheModel<TthcPhanNhomHoSo> _nullTthcPhanNhomHoSoCacheModel = new CacheModel<TthcPhanNhomHoSo>() {
			@Override
			public TthcPhanNhomHoSo toEntityModel() {
				return _nullTthcPhanNhomHoSo;
			}
		};
}