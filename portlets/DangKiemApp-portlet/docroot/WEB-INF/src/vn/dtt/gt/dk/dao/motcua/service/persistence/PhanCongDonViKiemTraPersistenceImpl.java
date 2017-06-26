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

import vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException;
import vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra;
import vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the phan cong don vi kiem tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see PhanCongDonViKiemTraPersistence
 * @see PhanCongDonViKiemTraUtil
 * @generated
 */
public class PhanCongDonViKiemTraPersistenceImpl extends BasePersistenceImpl<PhanCongDonViKiemTra>
	implements PhanCongDonViKiemTraPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PhanCongDonViKiemTraUtil} to access the phan cong don vi kiem tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PhanCongDonViKiemTraImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			PhanCongDonViKiemTraModelImpl.FINDER_CACHE_ENABLED,
			PhanCongDonViKiemTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			PhanCongDonViKiemTraModelImpl.FINDER_CACHE_ENABLED,
			PhanCongDonViKiemTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			PhanCongDonViKiemTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PhanCongDonViKiemTraPersistenceImpl() {
		setModelClass(PhanCongDonViKiemTra.class);
	}

	/**
	 * Caches the phan cong don vi kiem tra in the entity cache if it is enabled.
	 *
	 * @param phanCongDonViKiemTra the phan cong don vi kiem tra
	 */
	@Override
	public void cacheResult(PhanCongDonViKiemTra phanCongDonViKiemTra) {
		EntityCacheUtil.putResult(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			PhanCongDonViKiemTraImpl.class,
			phanCongDonViKiemTra.getPrimaryKey(), phanCongDonViKiemTra);

		phanCongDonViKiemTra.resetOriginalValues();
	}

	/**
	 * Caches the phan cong don vi kiem tras in the entity cache if it is enabled.
	 *
	 * @param phanCongDonViKiemTras the phan cong don vi kiem tras
	 */
	@Override
	public void cacheResult(List<PhanCongDonViKiemTra> phanCongDonViKiemTras) {
		for (PhanCongDonViKiemTra phanCongDonViKiemTra : phanCongDonViKiemTras) {
			if (EntityCacheUtil.getResult(
						PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
						PhanCongDonViKiemTraImpl.class,
						phanCongDonViKiemTra.getPrimaryKey()) == null) {
				cacheResult(phanCongDonViKiemTra);
			}
			else {
				phanCongDonViKiemTra.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phan cong don vi kiem tras.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PhanCongDonViKiemTraImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PhanCongDonViKiemTraImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phan cong don vi kiem tra.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PhanCongDonViKiemTra phanCongDonViKiemTra) {
		EntityCacheUtil.removeResult(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			PhanCongDonViKiemTraImpl.class, phanCongDonViKiemTra.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PhanCongDonViKiemTra> phanCongDonViKiemTras) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PhanCongDonViKiemTra phanCongDonViKiemTra : phanCongDonViKiemTras) {
			EntityCacheUtil.removeResult(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
				PhanCongDonViKiemTraImpl.class,
				phanCongDonViKiemTra.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phan cong don vi kiem tra with the primary key. Does not add the phan cong don vi kiem tra to the database.
	 *
	 * @param id the primary key for the new phan cong don vi kiem tra
	 * @return the new phan cong don vi kiem tra
	 */
	@Override
	public PhanCongDonViKiemTra create(long id) {
		PhanCongDonViKiemTra phanCongDonViKiemTra = new PhanCongDonViKiemTraImpl();

		phanCongDonViKiemTra.setNew(true);
		phanCongDonViKiemTra.setPrimaryKey(id);

		return phanCongDonViKiemTra;
	}

	/**
	 * Removes the phan cong don vi kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the phan cong don vi kiem tra
	 * @return the phan cong don vi kiem tra that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException if a phan cong don vi kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhanCongDonViKiemTra remove(long id)
		throws NoSuchPhanCongDonViKiemTraException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the phan cong don vi kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phan cong don vi kiem tra
	 * @return the phan cong don vi kiem tra that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException if a phan cong don vi kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhanCongDonViKiemTra remove(Serializable primaryKey)
		throws NoSuchPhanCongDonViKiemTraException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PhanCongDonViKiemTra phanCongDonViKiemTra = (PhanCongDonViKiemTra)session.get(PhanCongDonViKiemTraImpl.class,
					primaryKey);

			if (phanCongDonViKiemTra == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPhanCongDonViKiemTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phanCongDonViKiemTra);
		}
		catch (NoSuchPhanCongDonViKiemTraException nsee) {
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
	protected PhanCongDonViKiemTra removeImpl(
		PhanCongDonViKiemTra phanCongDonViKiemTra) throws SystemException {
		phanCongDonViKiemTra = toUnwrappedModel(phanCongDonViKiemTra);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phanCongDonViKiemTra)) {
				phanCongDonViKiemTra = (PhanCongDonViKiemTra)session.get(PhanCongDonViKiemTraImpl.class,
						phanCongDonViKiemTra.getPrimaryKeyObj());
			}

			if (phanCongDonViKiemTra != null) {
				session.delete(phanCongDonViKiemTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phanCongDonViKiemTra != null) {
			clearCache(phanCongDonViKiemTra);
		}

		return phanCongDonViKiemTra;
	}

	@Override
	public PhanCongDonViKiemTra updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws SystemException {
		phanCongDonViKiemTra = toUnwrappedModel(phanCongDonViKiemTra);

		boolean isNew = phanCongDonViKiemTra.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phanCongDonViKiemTra.isNew()) {
				session.save(phanCongDonViKiemTra);

				phanCongDonViKiemTra.setNew(false);
			}
			else {
				session.merge(phanCongDonViKiemTra);
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

		EntityCacheUtil.putResult(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
			PhanCongDonViKiemTraImpl.class,
			phanCongDonViKiemTra.getPrimaryKey(), phanCongDonViKiemTra);

		return phanCongDonViKiemTra;
	}

	protected PhanCongDonViKiemTra toUnwrappedModel(
		PhanCongDonViKiemTra phanCongDonViKiemTra) {
		if (phanCongDonViKiemTra instanceof PhanCongDonViKiemTraImpl) {
			return phanCongDonViKiemTra;
		}

		PhanCongDonViKiemTraImpl phanCongDonViKiemTraImpl = new PhanCongDonViKiemTraImpl();

		phanCongDonViKiemTraImpl.setNew(phanCongDonViKiemTra.isNew());
		phanCongDonViKiemTraImpl.setPrimaryKey(phanCongDonViKiemTra.getPrimaryKey());

		phanCongDonViKiemTraImpl.setId(phanCongDonViKiemTra.getId());
		phanCongDonViKiemTraImpl.setPhieuXuLyChinhId(phanCongDonViKiemTra.getPhieuXuLyChinhId());
		phanCongDonViKiemTraImpl.setTrichYeuNoiDung(phanCongDonViKiemTra.getTrichYeuNoiDung());
		phanCongDonViKiemTraImpl.setGhiChu(phanCongDonViKiemTra.getGhiChu());
		phanCongDonViKiemTraImpl.setTrangThaiHienTaiId(phanCongDonViKiemTra.getTrangThaiHienTaiId());
		phanCongDonViKiemTraImpl.setNoiDungHoSoId(phanCongDonViKiemTra.getNoiDungHoSoId());
		phanCongDonViKiemTraImpl.setChiemQuyenXuLy(phanCongDonViKiemTra.getChiemQuyenXuLy());
		phanCongDonViKiemTraImpl.setNgayTaoPhieu(phanCongDonViKiemTra.getNgayTaoPhieu());
		phanCongDonViKiemTraImpl.setNguoiTaoPhieu(phanCongDonViKiemTra.getNguoiTaoPhieu());
		phanCongDonViKiemTraImpl.setNhomPhieuXuLy(phanCongDonViKiemTra.getNhomPhieuXuLy());
		phanCongDonViKiemTraImpl.setPhanNhomHoSoId(phanCongDonViKiemTra.getPhanNhomHoSoId());
		phanCongDonViKiemTraImpl.setConfirmedinspectionId(phanCongDonViKiemTra.getConfirmedinspectionId());
		phanCongDonViKiemTraImpl.setMaSoHoSo(phanCongDonViKiemTra.getMaSoHoSo());
		phanCongDonViKiemTraImpl.setMaBienNhan(phanCongDonViKiemTra.getMaBienNhan());
		phanCongDonViKiemTraImpl.setThuTucHanhChinhId(phanCongDonViKiemTra.getThuTucHanhChinhId());
		phanCongDonViKiemTraImpl.setTenChuHoSo(phanCongDonViKiemTra.getTenChuHoSo());
		phanCongDonViKiemTraImpl.setNgayGuiHoSo(phanCongDonViKiemTra.getNgayGuiHoSo());
		phanCongDonViKiemTraImpl.setTenDonViTiepNhan(phanCongDonViKiemTra.getTenDonViTiepNhan());
		phanCongDonViKiemTraImpl.setAttachedFile(phanCongDonViKiemTra.getAttachedFile());
		phanCongDonViKiemTraImpl.setInspectionDistrictCode(phanCongDonViKiemTra.getInspectionDistrictCode());
		phanCongDonViKiemTraImpl.setInspectionProvincecode(phanCongDonViKiemTra.getInspectionProvincecode());

		return phanCongDonViKiemTraImpl;
	}

	/**
	 * Returns the phan cong don vi kiem tra with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phan cong don vi kiem tra
	 * @return the phan cong don vi kiem tra
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException if a phan cong don vi kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhanCongDonViKiemTra findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPhanCongDonViKiemTraException, SystemException {
		PhanCongDonViKiemTra phanCongDonViKiemTra = fetchByPrimaryKey(primaryKey);

		if (phanCongDonViKiemTra == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPhanCongDonViKiemTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phanCongDonViKiemTra;
	}

	/**
	 * Returns the phan cong don vi kiem tra with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException} if it could not be found.
	 *
	 * @param id the primary key of the phan cong don vi kiem tra
	 * @return the phan cong don vi kiem tra
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException if a phan cong don vi kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhanCongDonViKiemTra findByPrimaryKey(long id)
		throws NoSuchPhanCongDonViKiemTraException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the phan cong don vi kiem tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phan cong don vi kiem tra
	 * @return the phan cong don vi kiem tra, or <code>null</code> if a phan cong don vi kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhanCongDonViKiemTra fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PhanCongDonViKiemTra phanCongDonViKiemTra = (PhanCongDonViKiemTra)EntityCacheUtil.getResult(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
				PhanCongDonViKiemTraImpl.class, primaryKey);

		if (phanCongDonViKiemTra == _nullPhanCongDonViKiemTra) {
			return null;
		}

		if (phanCongDonViKiemTra == null) {
			Session session = null;

			try {
				session = openSession();

				phanCongDonViKiemTra = (PhanCongDonViKiemTra)session.get(PhanCongDonViKiemTraImpl.class,
						primaryKey);

				if (phanCongDonViKiemTra != null) {
					cacheResult(phanCongDonViKiemTra);
				}
				else {
					EntityCacheUtil.putResult(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
						PhanCongDonViKiemTraImpl.class, primaryKey,
						_nullPhanCongDonViKiemTra);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PhanCongDonViKiemTraModelImpl.ENTITY_CACHE_ENABLED,
					PhanCongDonViKiemTraImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phanCongDonViKiemTra;
	}

	/**
	 * Returns the phan cong don vi kiem tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the phan cong don vi kiem tra
	 * @return the phan cong don vi kiem tra, or <code>null</code> if a phan cong don vi kiem tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhanCongDonViKiemTra fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the phan cong don vi kiem tras.
	 *
	 * @return the phan cong don vi kiem tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhanCongDonViKiemTra> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phan cong don vi kiem tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phan cong don vi kiem tras
	 * @param end the upper bound of the range of phan cong don vi kiem tras (not inclusive)
	 * @return the range of phan cong don vi kiem tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhanCongDonViKiemTra> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the phan cong don vi kiem tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phan cong don vi kiem tras
	 * @param end the upper bound of the range of phan cong don vi kiem tras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of phan cong don vi kiem tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhanCongDonViKiemTra> findAll(int start, int end,
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

		List<PhanCongDonViKiemTra> list = (List<PhanCongDonViKiemTra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHANCONGDONVIKIEMTRA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHANCONGDONVIKIEMTRA;

				if (pagination) {
					sql = sql.concat(PhanCongDonViKiemTraModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PhanCongDonViKiemTra>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PhanCongDonViKiemTra>(list);
				}
				else {
					list = (List<PhanCongDonViKiemTra>)QueryUtil.list(q,
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
	 * Removes all the phan cong don vi kiem tras from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PhanCongDonViKiemTra phanCongDonViKiemTra : findAll()) {
			remove(phanCongDonViKiemTra);
		}
	}

	/**
	 * Returns the number of phan cong don vi kiem tras.
	 *
	 * @return the number of phan cong don vi kiem tras
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

				Query q = session.createQuery(_SQL_COUNT_PHANCONGDONVIKIEMTRA);

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
	 * Initializes the phan cong don vi kiem tra persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PhanCongDonViKiemTra>> listenersList = new ArrayList<ModelListener<PhanCongDonViKiemTra>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PhanCongDonViKiemTra>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PhanCongDonViKiemTraImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHANCONGDONVIKIEMTRA = "SELECT phanCongDonViKiemTra FROM PhanCongDonViKiemTra phanCongDonViKiemTra";
	private static final String _SQL_COUNT_PHANCONGDONVIKIEMTRA = "SELECT COUNT(phanCongDonViKiemTra) FROM PhanCongDonViKiemTra phanCongDonViKiemTra";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phanCongDonViKiemTra.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PhanCongDonViKiemTra exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PhanCongDonViKiemTraPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"phieuXuLyChinhId", "trichYeuNoiDung", "ghiChu",
				"trangThaiHienTaiId", "noiDungHoSoId", "chiemQuyenXuLy",
				"ngayTaoPhieu", "nguoiTaoPhieu", "nhomPhieuXuLy",
				"phanNhomHoSoId", "maSoHoSo", "maBienNhan", "thuTucHanhChinhId",
				"tenChuHoSo", "ngayGuiHoSo", "tenDonViTiepNhan", "attachedFile",
				"inspectionDistrictCode", "inspectionProvincecode"
			});
	private static PhanCongDonViKiemTra _nullPhanCongDonViKiemTra = new PhanCongDonViKiemTraImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PhanCongDonViKiemTra> toCacheModel() {
				return _nullPhanCongDonViKiemTraCacheModel;
			}
		};

	private static CacheModel<PhanCongDonViKiemTra> _nullPhanCongDonViKiemTraCacheModel =
		new CacheModel<PhanCongDonViKiemTra>() {
			@Override
			public PhanCongDonViKiemTra toEntityModel() {
				return _nullPhanCongDonViKiemTra;
			}
		};
}