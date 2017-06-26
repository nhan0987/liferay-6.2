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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

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

import vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException;
import vn.dtt.gt.dk.dao.motcua.model.DaKiemTra;
import vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the da kiem tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DaKiemTraPersistence
 * @see DaKiemTraUtil
 * @generated
 */
public class DaKiemTraPersistenceImpl extends BasePersistenceImpl<DaKiemTra>
	implements DaKiemTraPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DaKiemTraUtil} to access the da kiem tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DaKiemTraImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			DaKiemTraModelImpl.FINDER_CACHE_ENABLED, DaKiemTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			DaKiemTraModelImpl.FINDER_CACHE_ENABLED, DaKiemTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			DaKiemTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DaKiemTraPersistenceImpl() {
		setModelClass(DaKiemTra.class);
	}

	/**
	 * Caches the da kiem tra in the entity cache if it is enabled.
	 *
	 * @param daKiemTra the da kiem tra
	 */
	@Override
	public void cacheResult(DaKiemTra daKiemTra) {
		EntityCacheUtil.putResult(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			DaKiemTraImpl.class, daKiemTra.getPrimaryKey(), daKiemTra);

		daKiemTra.resetOriginalValues();
	}

	/**
	 * Caches the da kiem tras in the entity cache if it is enabled.
	 *
	 * @param daKiemTras the da kiem tras
	 */
	@Override
	public void cacheResult(List<DaKiemTra> daKiemTras) {
		for (DaKiemTra daKiemTra : daKiemTras) {
			if (EntityCacheUtil.getResult(
						DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
						DaKiemTraImpl.class, daKiemTra.getPrimaryKey()) == null) {
				cacheResult(daKiemTra);
			}
			else {
				daKiemTra.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all da kiem tras.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DaKiemTraImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DaKiemTraImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the da kiem tra.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DaKiemTra daKiemTra) {
		EntityCacheUtil.removeResult(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			DaKiemTraImpl.class, daKiemTra.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DaKiemTra> daKiemTras) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DaKiemTra daKiemTra : daKiemTras) {
			EntityCacheUtil.removeResult(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
				DaKiemTraImpl.class, daKiemTra.getPrimaryKey());
		}
	}

	/**
	 * Creates a new da kiem tra with the primary key. Does not add the da kiem tra to the database.
	 *
	 * @param id the primary key for the new da kiem tra
	 * @return the new da kiem tra
	 */
	@Override
	public DaKiemTra create(long id) {
		DaKiemTra daKiemTra = new DaKiemTraImpl();

		daKiemTra.setNew(true);
		daKiemTra.setPrimaryKey(id);

		return daKiemTra;
	}

	/**
	 * Removes the da kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the da kiem tra
	 * @return the da kiem tra that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException if a da kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DaKiemTra remove(long id)
		throws NoSuchDaKiemTraException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the da kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the da kiem tra
	 * @return the da kiem tra that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException if a da kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DaKiemTra remove(Serializable primaryKey)
		throws NoSuchDaKiemTraException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DaKiemTra daKiemTra = (DaKiemTra)session.get(DaKiemTraImpl.class,
					primaryKey);

			if (daKiemTra == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDaKiemTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(daKiemTra);
		}
		catch (NoSuchDaKiemTraException nsee) {
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
	protected DaKiemTra removeImpl(DaKiemTra daKiemTra)
		throws SystemException {
		daKiemTra = toUnwrappedModel(daKiemTra);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(daKiemTra)) {
				daKiemTra = (DaKiemTra)session.get(DaKiemTraImpl.class,
						daKiemTra.getPrimaryKeyObj());
			}

			if (daKiemTra != null) {
				session.delete(daKiemTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (daKiemTra != null) {
			clearCache(daKiemTra);
		}

		return daKiemTra;
	}

	@Override
	public DaKiemTra updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.DaKiemTra daKiemTra)
		throws SystemException {
		daKiemTra = toUnwrappedModel(daKiemTra);

		boolean isNew = daKiemTra.isNew();

		Session session = null;

		try {
			session = openSession();

			if (daKiemTra.isNew()) {
				session.save(daKiemTra);

				daKiemTra.setNew(false);
			}
			else {
				session.merge(daKiemTra);
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

		EntityCacheUtil.putResult(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			DaKiemTraImpl.class, daKiemTra.getPrimaryKey(), daKiemTra);

		return daKiemTra;
	}

	protected DaKiemTra toUnwrappedModel(DaKiemTra daKiemTra) {
		if (daKiemTra instanceof DaKiemTraImpl) {
			return daKiemTra;
		}

		DaKiemTraImpl daKiemTraImpl = new DaKiemTraImpl();

		daKiemTraImpl.setNew(daKiemTra.isNew());
		daKiemTraImpl.setPrimaryKey(daKiemTra.getPrimaryKey());

		daKiemTraImpl.setId(daKiemTra.getId());
		daKiemTraImpl.setPhieuXuLyChinhId(daKiemTra.getPhieuXuLyChinhId());
		daKiemTraImpl.setTrichYeuNoiDung(daKiemTra.getTrichYeuNoiDung());
		daKiemTraImpl.setGhiChu(daKiemTra.getGhiChu());
		daKiemTraImpl.setTrangThaiHienTaiId(daKiemTra.getTrangThaiHienTaiId());
		daKiemTraImpl.setNoiDungHoSoId(daKiemTra.getNoiDungHoSoId());
		daKiemTraImpl.setChiemQuyenXuLy(daKiemTra.getChiemQuyenXuLy());
		daKiemTraImpl.setNgayTaoPhieu(daKiemTra.getNgayTaoPhieu());
		daKiemTraImpl.setNguoiTaoPhieu(daKiemTra.getNguoiTaoPhieu());
		daKiemTraImpl.setNhomPhieuXuLy(daKiemTra.getNhomPhieuXuLy());
		daKiemTraImpl.setPhanNhomHoSoId(daKiemTra.getPhanNhomHoSoId());
		daKiemTraImpl.setMaSoHoSo(daKiemTra.getMaSoHoSo());
		daKiemTraImpl.setMaBienNhan(daKiemTra.getMaBienNhan());
		daKiemTraImpl.setThuTucHanhChinhId(daKiemTra.getThuTucHanhChinhId());
		daKiemTraImpl.setTenChuHoSo(daKiemTra.getTenChuHoSo());
		daKiemTraImpl.setNgayGuiHoSo(daKiemTra.getNgayGuiHoSo());
		daKiemTraImpl.setTenDonViTiepNhan(daKiemTra.getTenDonViTiepNhan());

		return daKiemTraImpl;
	}

	/**
	 * Returns the da kiem tra with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the da kiem tra
	 * @return the da kiem tra
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException if a da kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DaKiemTra findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDaKiemTraException, SystemException {
		DaKiemTra daKiemTra = fetchByPrimaryKey(primaryKey);

		if (daKiemTra == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDaKiemTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return daKiemTra;
	}

	/**
	 * Returns the da kiem tra with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException} if it could not be found.
	 *
	 * @param id the primary key of the da kiem tra
	 * @return the da kiem tra
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException if a da kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DaKiemTra findByPrimaryKey(long id)
		throws NoSuchDaKiemTraException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the da kiem tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the da kiem tra
	 * @return the da kiem tra, or <code>null</code> if a da kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DaKiemTra fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DaKiemTra daKiemTra = (DaKiemTra)EntityCacheUtil.getResult(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
				DaKiemTraImpl.class, primaryKey);

		if (daKiemTra == _nullDaKiemTra) {
			return null;
		}

		if (daKiemTra == null) {
			Session session = null;

			try {
				session = openSession();

				daKiemTra = (DaKiemTra)session.get(DaKiemTraImpl.class,
						primaryKey);

				if (daKiemTra != null) {
					cacheResult(daKiemTra);
				}
				else {
					EntityCacheUtil.putResult(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
						DaKiemTraImpl.class, primaryKey, _nullDaKiemTra);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DaKiemTraModelImpl.ENTITY_CACHE_ENABLED,
					DaKiemTraImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return daKiemTra;
	}

	/**
	 * Returns the da kiem tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the da kiem tra
	 * @return the da kiem tra, or <code>null</code> if a da kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DaKiemTra fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the da kiem tras.
	 *
	 * @return the da kiem tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DaKiemTra> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the da kiem tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of da kiem tras
	 * @param end the upper bound of the range of da kiem tras (not inclusive)
	 * @return the range of da kiem tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DaKiemTra> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the da kiem tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of da kiem tras
	 * @param end the upper bound of the range of da kiem tras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of da kiem tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DaKiemTra> findAll(int start, int end,
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

		List<DaKiemTra> list = (List<DaKiemTra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DAKIEMTRA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DAKIEMTRA;

				if (pagination) {
					sql = sql.concat(DaKiemTraModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DaKiemTra>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DaKiemTra>(list);
				}
				else {
					list = (List<DaKiemTra>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the da kiem tras from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DaKiemTra daKiemTra : findAll()) {
			remove(daKiemTra);
		}
	}

	/**
	 * Returns the number of da kiem tras.
	 *
	 * @return the number of da kiem tras
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

				Query q = session.createQuery(_SQL_COUNT_DAKIEMTRA);

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
	 * Initializes the da kiem tra persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.DaKiemTra")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DaKiemTra>> listenersList = new ArrayList<ModelListener<DaKiemTra>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DaKiemTra>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DaKiemTraImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DAKIEMTRA = "SELECT daKiemTra FROM DaKiemTra daKiemTra";
	private static final String _SQL_COUNT_DAKIEMTRA = "SELECT COUNT(daKiemTra) FROM DaKiemTra daKiemTra";
	private static final String _ORDER_BY_ENTITY_ALIAS = "daKiemTra.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DaKiemTra exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DaKiemTraPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"phieuXuLyChinhId", "trichYeuNoiDung", "ghiChu",
				"trangThaiHienTaiId", "noiDungHoSoId", "chiemQuyenXuLy",
				"ngayTaoPhieu", "nguoiTaoPhieu", "nhomPhieuXuLy",
				"phanNhomHoSoId", "maSoHoSo", "maBienNhan", "thuTucHanhChinhId",
				"tenChuHoSo", "ngayGuiHoSo", "tenDonViTiepNhan"
			});
	private static DaKiemTra _nullDaKiemTra = new DaKiemTraImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DaKiemTra> toCacheModel() {
				return _nullDaKiemTraCacheModel;
			}
		};

	private static CacheModel<DaKiemTra> _nullDaKiemTraCacheModel = new CacheModel<DaKiemTra>() {
			@Override
			public DaKiemTra toEntityModel() {
				return _nullDaKiemTra;
			}
		};
}