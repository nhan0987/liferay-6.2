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

import vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException;
import vn.dtt.gt.dk.dao.common.model.TimKiemHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tim kiem ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TimKiemHoSoPersistence
 * @see TimKiemHoSoUtil
 * @generated
 */
public class TimKiemHoSoPersistenceImpl extends BasePersistenceImpl<TimKiemHoSo>
	implements TimKiemHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TimKiemHoSoUtil} to access the tim kiem ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TimKiemHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TimKiemHoSoModelImpl.FINDER_CACHE_ENABLED, TimKiemHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TimKiemHoSoModelImpl.FINDER_CACHE_ENABLED, TimKiemHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TimKiemHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TimKiemHoSoPersistenceImpl() {
		setModelClass(TimKiemHoSo.class);
	}

	/**
	 * Caches the tim kiem ho so in the entity cache if it is enabled.
	 *
	 * @param timKiemHoSo the tim kiem ho so
	 */
	@Override
	public void cacheResult(TimKiemHoSo timKiemHoSo) {
		EntityCacheUtil.putResult(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TimKiemHoSoImpl.class, timKiemHoSo.getPrimaryKey(), timKiemHoSo);

		timKiemHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tim kiem ho sos in the entity cache if it is enabled.
	 *
	 * @param timKiemHoSos the tim kiem ho sos
	 */
	@Override
	public void cacheResult(List<TimKiemHoSo> timKiemHoSos) {
		for (TimKiemHoSo timKiemHoSo : timKiemHoSos) {
			if (EntityCacheUtil.getResult(
						TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TimKiemHoSoImpl.class, timKiemHoSo.getPrimaryKey()) == null) {
				cacheResult(timKiemHoSo);
			}
			else {
				timKiemHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tim kiem ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TimKiemHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TimKiemHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tim kiem ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TimKiemHoSo timKiemHoSo) {
		EntityCacheUtil.removeResult(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TimKiemHoSoImpl.class, timKiemHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TimKiemHoSo> timKiemHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TimKiemHoSo timKiemHoSo : timKiemHoSos) {
			EntityCacheUtil.removeResult(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TimKiemHoSoImpl.class, timKiemHoSo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tim kiem ho so with the primary key. Does not add the tim kiem ho so to the database.
	 *
	 * @param id the primary key for the new tim kiem ho so
	 * @return the new tim kiem ho so
	 */
	@Override
	public TimKiemHoSo create(long id) {
		TimKiemHoSo timKiemHoSo = new TimKiemHoSoImpl();

		timKiemHoSo.setNew(true);
		timKiemHoSo.setPrimaryKey(id);

		return timKiemHoSo;
	}

	/**
	 * Removes the tim kiem ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tim kiem ho so
	 * @return the tim kiem ho so that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException if a tim kiem ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimKiemHoSo remove(long id)
		throws NoSuchTimKiemHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tim kiem ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tim kiem ho so
	 * @return the tim kiem ho so that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException if a tim kiem ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimKiemHoSo remove(Serializable primaryKey)
		throws NoSuchTimKiemHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TimKiemHoSo timKiemHoSo = (TimKiemHoSo)session.get(TimKiemHoSoImpl.class,
					primaryKey);

			if (timKiemHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTimKiemHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(timKiemHoSo);
		}
		catch (NoSuchTimKiemHoSoException nsee) {
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
	protected TimKiemHoSo removeImpl(TimKiemHoSo timKiemHoSo)
		throws SystemException {
		timKiemHoSo = toUnwrappedModel(timKiemHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(timKiemHoSo)) {
				timKiemHoSo = (TimKiemHoSo)session.get(TimKiemHoSoImpl.class,
						timKiemHoSo.getPrimaryKeyObj());
			}

			if (timKiemHoSo != null) {
				session.delete(timKiemHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (timKiemHoSo != null) {
			clearCache(timKiemHoSo);
		}

		return timKiemHoSo;
	}

	@Override
	public TimKiemHoSo updateImpl(
		vn.dtt.gt.dk.dao.common.model.TimKiemHoSo timKiemHoSo)
		throws SystemException {
		timKiemHoSo = toUnwrappedModel(timKiemHoSo);

		boolean isNew = timKiemHoSo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (timKiemHoSo.isNew()) {
				session.save(timKiemHoSo);

				timKiemHoSo.setNew(false);
			}
			else {
				session.merge(timKiemHoSo);
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

		EntityCacheUtil.putResult(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TimKiemHoSoImpl.class, timKiemHoSo.getPrimaryKey(), timKiemHoSo);

		return timKiemHoSo;
	}

	protected TimKiemHoSo toUnwrappedModel(TimKiemHoSo timKiemHoSo) {
		if (timKiemHoSo instanceof TimKiemHoSoImpl) {
			return timKiemHoSo;
		}

		TimKiemHoSoImpl timKiemHoSoImpl = new TimKiemHoSoImpl();

		timKiemHoSoImpl.setNew(timKiemHoSo.isNew());
		timKiemHoSoImpl.setPrimaryKey(timKiemHoSo.getPrimaryKey());

		timKiemHoSoImpl.setId(timKiemHoSo.getId());
		timKiemHoSoImpl.setMaSoHoSo(timKiemHoSo.getMaSoHoSo());
		timKiemHoSoImpl.setMaBienNhan(timKiemHoSo.getMaBienNhan());
		timKiemHoSoImpl.setThuTucHanhChinhId(timKiemHoSo.getThuTucHanhChinhId());
		timKiemHoSoImpl.setLoaiChuHoSo(timKiemHoSo.getLoaiChuHoSo());
		timKiemHoSoImpl.setMaSoChuHoSo(timKiemHoSo.getMaSoChuHoSo());
		timKiemHoSoImpl.setTenChuHoSo(timKiemHoSo.getTenChuHoSo());
		timKiemHoSoImpl.setDiaChiChuHoSo(timKiemHoSo.getDiaChiChuHoSo());
		timKiemHoSoImpl.setTrichYeuNoiDung(timKiemHoSo.getTrichYeuNoiDung());
		timKiemHoSoImpl.setNgayGuiHoSo(timKiemHoSo.getNgayGuiHoSo());
		timKiemHoSoImpl.setNgayTiepNhan(timKiemHoSo.getNgayTiepNhan());
		timKiemHoSoImpl.setNgayBoSung(timKiemHoSo.getNgayBoSung());
		timKiemHoSoImpl.setNgayHenTra(timKiemHoSo.getNgayHenTra());
		timKiemHoSoImpl.setNgayTraKetQua(timKiemHoSo.getNgayTraKetQua());
		timKiemHoSoImpl.setNgayDongHoSo(timKiemHoSo.getNgayDongHoSo());
		timKiemHoSoImpl.setTrangThaiHoSo(timKiemHoSo.getTrangThaiHoSo());
		timKiemHoSoImpl.setPhanNhomHoSoId(timKiemHoSo.getPhanNhomHoSoId());
		timKiemHoSoImpl.setMaDonViTiepNhan(timKiemHoSo.getMaDonViTiepNhan());
		timKiemHoSoImpl.setTenDonViTiepNhan(timKiemHoSo.getTenDonViTiepNhan());
		timKiemHoSoImpl.setToChucQuanLy(timKiemHoSo.getToChucQuanLy());
		timKiemHoSoImpl.setNgayTao(timKiemHoSo.getNgayTao());
		timKiemHoSoImpl.setNguoiTao(timKiemHoSo.getNguoiTao());
		timKiemHoSoImpl.setGhiChu(timKiemHoSo.getGhiChu());
		timKiemHoSoImpl.setLanGuiCuoi(timKiemHoSo.getLanGuiCuoi());

		return timKiemHoSoImpl;
	}

	/**
	 * Returns the tim kiem ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tim kiem ho so
	 * @return the tim kiem ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException if a tim kiem ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimKiemHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTimKiemHoSoException, SystemException {
		TimKiemHoSo timKiemHoSo = fetchByPrimaryKey(primaryKey);

		if (timKiemHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTimKiemHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return timKiemHoSo;
	}

	/**
	 * Returns the tim kiem ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the tim kiem ho so
	 * @return the tim kiem ho so
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException if a tim kiem ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimKiemHoSo findByPrimaryKey(long id)
		throws NoSuchTimKiemHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tim kiem ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tim kiem ho so
	 * @return the tim kiem ho so, or <code>null</code> if a tim kiem ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimKiemHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TimKiemHoSo timKiemHoSo = (TimKiemHoSo)EntityCacheUtil.getResult(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TimKiemHoSoImpl.class, primaryKey);

		if (timKiemHoSo == _nullTimKiemHoSo) {
			return null;
		}

		if (timKiemHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				timKiemHoSo = (TimKiemHoSo)session.get(TimKiemHoSoImpl.class,
						primaryKey);

				if (timKiemHoSo != null) {
					cacheResult(timKiemHoSo);
				}
				else {
					EntityCacheUtil.putResult(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TimKiemHoSoImpl.class, primaryKey, _nullTimKiemHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TimKiemHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TimKiemHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return timKiemHoSo;
	}

	/**
	 * Returns the tim kiem ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tim kiem ho so
	 * @return the tim kiem ho so, or <code>null</code> if a tim kiem ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimKiemHoSo fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tim kiem ho sos.
	 *
	 * @return the tim kiem ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TimKiemHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tim kiem ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tim kiem ho sos
	 * @param end the upper bound of the range of tim kiem ho sos (not inclusive)
	 * @return the range of tim kiem ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TimKiemHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tim kiem ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tim kiem ho sos
	 * @param end the upper bound of the range of tim kiem ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tim kiem ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TimKiemHoSo> findAll(int start, int end,
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

		List<TimKiemHoSo> list = (List<TimKiemHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TIMKIEMHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIMKIEMHOSO;

				if (pagination) {
					sql = sql.concat(TimKiemHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TimKiemHoSo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TimKiemHoSo>(list);
				}
				else {
					list = (List<TimKiemHoSo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tim kiem ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TimKiemHoSo timKiemHoSo : findAll()) {
			remove(timKiemHoSo);
		}
	}

	/**
	 * Returns the number of tim kiem ho sos.
	 *
	 * @return the number of tim kiem ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TIMKIEMHOSO);

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
	 * Initializes the tim kiem ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TimKiemHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TimKiemHoSo>> listenersList = new ArrayList<ModelListener<TimKiemHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TimKiemHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TimKiemHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TIMKIEMHOSO = "SELECT timKiemHoSo FROM TimKiemHoSo timKiemHoSo";
	private static final String _SQL_COUNT_TIMKIEMHOSO = "SELECT COUNT(timKiemHoSo) FROM TimKiemHoSo timKiemHoSo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "timKiemHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TimKiemHoSo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TimKiemHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maSoHoSo", "maBienNhan", "thuTucHanhChinhId", "loaiChuHoSo",
				"maSoChuHoSo", "tenChuHoSo", "diaChiChuHoSo", "trichYeuNoiDung",
				"ngayGuiHoSo", "ngayTiepNhan", "ngayBoSung", "ngayHenTra",
				"ngayTraKetQua", "ngayDongHoSo", "trangThaiHoSo",
				"phanNhomHoSoId", "maDonViTiepNhan", "tenDonViTiepNhan",
				"toChucQuanLy", "ngayTao", "nguoiTao", "ghiChu", "lanGuiCuoi"
			});
	private static TimKiemHoSo _nullTimKiemHoSo = new TimKiemHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TimKiemHoSo> toCacheModel() {
				return _nullTimKiemHoSoCacheModel;
			}
		};

	private static CacheModel<TimKiemHoSo> _nullTimKiemHoSoCacheModel = new CacheModel<TimKiemHoSo>() {
			@Override
			public TimKiemHoSo toEntityModel() {
				return _nullTimKiemHoSo;
			}
		};
}