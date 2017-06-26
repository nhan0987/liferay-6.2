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

import vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException;
import vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc;
import vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the phieu xu ly phu ho so thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see PhieuXuLyPhuHoSoThuTucPersistence
 * @see PhieuXuLyPhuHoSoThuTucUtil
 * @generated
 */
public class PhieuXuLyPhuHoSoThuTucPersistenceImpl extends BasePersistenceImpl<PhieuXuLyPhuHoSoThuTuc>
	implements PhieuXuLyPhuHoSoThuTucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PhieuXuLyPhuHoSoThuTucUtil} to access the phieu xu ly phu ho so thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PhieuXuLyPhuHoSoThuTucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PhieuXuLyPhuHoSoThuTucPersistenceImpl() {
		setModelClass(PhieuXuLyPhuHoSoThuTuc.class);
	}

	/**
	 * Caches the phieu xu ly phu ho so thu tuc in the entity cache if it is enabled.
	 *
	 * @param phieuXuLyPhuHoSoThuTuc the phieu xu ly phu ho so thu tuc
	 */
	@Override
	public void cacheResult(PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc) {
		EntityCacheUtil.putResult(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucImpl.class,
			phieuXuLyPhuHoSoThuTuc.getPrimaryKey(), phieuXuLyPhuHoSoThuTuc);

		phieuXuLyPhuHoSoThuTuc.resetOriginalValues();
	}

	/**
	 * Caches the phieu xu ly phu ho so thu tucs in the entity cache if it is enabled.
	 *
	 * @param phieuXuLyPhuHoSoThuTucs the phieu xu ly phu ho so thu tucs
	 */
	@Override
	public void cacheResult(
		List<PhieuXuLyPhuHoSoThuTuc> phieuXuLyPhuHoSoThuTucs) {
		for (PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc : phieuXuLyPhuHoSoThuTucs) {
			if (EntityCacheUtil.getResult(
						PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						PhieuXuLyPhuHoSoThuTucImpl.class,
						phieuXuLyPhuHoSoThuTuc.getPrimaryKey()) == null) {
				cacheResult(phieuXuLyPhuHoSoThuTuc);
			}
			else {
				phieuXuLyPhuHoSoThuTuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phieu xu ly phu ho so thu tucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PhieuXuLyPhuHoSoThuTucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PhieuXuLyPhuHoSoThuTucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phieu xu ly phu ho so thu tuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc) {
		EntityCacheUtil.removeResult(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucImpl.class,
			phieuXuLyPhuHoSoThuTuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PhieuXuLyPhuHoSoThuTuc> phieuXuLyPhuHoSoThuTucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc : phieuXuLyPhuHoSoThuTucs) {
			EntityCacheUtil.removeResult(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				PhieuXuLyPhuHoSoThuTucImpl.class,
				phieuXuLyPhuHoSoThuTuc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phieu xu ly phu ho so thu tuc with the primary key. Does not add the phieu xu ly phu ho so thu tuc to the database.
	 *
	 * @param id the primary key for the new phieu xu ly phu ho so thu tuc
	 * @return the new phieu xu ly phu ho so thu tuc
	 */
	@Override
	public PhieuXuLyPhuHoSoThuTuc create(long id) {
		PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc = new PhieuXuLyPhuHoSoThuTucImpl();

		phieuXuLyPhuHoSoThuTuc.setNew(true);
		phieuXuLyPhuHoSoThuTuc.setPrimaryKey(id);

		return phieuXuLyPhuHoSoThuTuc;
	}

	/**
	 * Removes the phieu xu ly phu ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the phieu xu ly phu ho so thu tuc
	 * @return the phieu xu ly phu ho so thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyPhuHoSoThuTuc remove(long id)
		throws NoSuchPhieuXuLyPhuHoSoThuTucException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the phieu xu ly phu ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phieu xu ly phu ho so thu tuc
	 * @return the phieu xu ly phu ho so thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyPhuHoSoThuTuc remove(Serializable primaryKey)
		throws NoSuchPhieuXuLyPhuHoSoThuTucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc = (PhieuXuLyPhuHoSoThuTuc)session.get(PhieuXuLyPhuHoSoThuTucImpl.class,
					primaryKey);

			if (phieuXuLyPhuHoSoThuTuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPhieuXuLyPhuHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phieuXuLyPhuHoSoThuTuc);
		}
		catch (NoSuchPhieuXuLyPhuHoSoThuTucException nsee) {
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
	protected PhieuXuLyPhuHoSoThuTuc removeImpl(
		PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc)
		throws SystemException {
		phieuXuLyPhuHoSoThuTuc = toUnwrappedModel(phieuXuLyPhuHoSoThuTuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phieuXuLyPhuHoSoThuTuc)) {
				phieuXuLyPhuHoSoThuTuc = (PhieuXuLyPhuHoSoThuTuc)session.get(PhieuXuLyPhuHoSoThuTucImpl.class,
						phieuXuLyPhuHoSoThuTuc.getPrimaryKeyObj());
			}

			if (phieuXuLyPhuHoSoThuTuc != null) {
				session.delete(phieuXuLyPhuHoSoThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phieuXuLyPhuHoSoThuTuc != null) {
			clearCache(phieuXuLyPhuHoSoThuTuc);
		}

		return phieuXuLyPhuHoSoThuTuc;
	}

	@Override
	public PhieuXuLyPhuHoSoThuTuc updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc)
		throws SystemException {
		phieuXuLyPhuHoSoThuTuc = toUnwrappedModel(phieuXuLyPhuHoSoThuTuc);

		boolean isNew = phieuXuLyPhuHoSoThuTuc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phieuXuLyPhuHoSoThuTuc.isNew()) {
				session.save(phieuXuLyPhuHoSoThuTuc);

				phieuXuLyPhuHoSoThuTuc.setNew(false);
			}
			else {
				session.merge(phieuXuLyPhuHoSoThuTuc);
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

		EntityCacheUtil.putResult(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyPhuHoSoThuTucImpl.class,
			phieuXuLyPhuHoSoThuTuc.getPrimaryKey(), phieuXuLyPhuHoSoThuTuc);

		return phieuXuLyPhuHoSoThuTuc;
	}

	protected PhieuXuLyPhuHoSoThuTuc toUnwrappedModel(
		PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc) {
		if (phieuXuLyPhuHoSoThuTuc instanceof PhieuXuLyPhuHoSoThuTucImpl) {
			return phieuXuLyPhuHoSoThuTuc;
		}

		PhieuXuLyPhuHoSoThuTucImpl phieuXuLyPhuHoSoThuTucImpl = new PhieuXuLyPhuHoSoThuTucImpl();

		phieuXuLyPhuHoSoThuTucImpl.setNew(phieuXuLyPhuHoSoThuTuc.isNew());
		phieuXuLyPhuHoSoThuTucImpl.setPrimaryKey(phieuXuLyPhuHoSoThuTuc.getPrimaryKey());

		phieuXuLyPhuHoSoThuTucImpl.setId(phieuXuLyPhuHoSoThuTuc.getId());
		phieuXuLyPhuHoSoThuTucImpl.setPhieuXuLyChinhId(phieuXuLyPhuHoSoThuTuc.getPhieuXuLyChinhId());
		phieuXuLyPhuHoSoThuTucImpl.setTrichYeuNoiDung(phieuXuLyPhuHoSoThuTuc.getTrichYeuNoiDung());
		phieuXuLyPhuHoSoThuTucImpl.setGhiChu(phieuXuLyPhuHoSoThuTuc.getGhiChu());
		phieuXuLyPhuHoSoThuTucImpl.setTrangThaiHienTaiId(phieuXuLyPhuHoSoThuTuc.getTrangThaiHienTaiId());
		phieuXuLyPhuHoSoThuTucImpl.setNoiDungHoSoId(phieuXuLyPhuHoSoThuTuc.getNoiDungHoSoId());
		phieuXuLyPhuHoSoThuTucImpl.setChiemQuyenXuLy(phieuXuLyPhuHoSoThuTuc.getChiemQuyenXuLy());
		phieuXuLyPhuHoSoThuTucImpl.setNgayTaoPhieu(phieuXuLyPhuHoSoThuTuc.getNgayTaoPhieu());
		phieuXuLyPhuHoSoThuTucImpl.setNguoiTaoPhieu(phieuXuLyPhuHoSoThuTuc.getNguoiTaoPhieu());
		phieuXuLyPhuHoSoThuTucImpl.setNhomPhieuXuLy(phieuXuLyPhuHoSoThuTuc.getNhomPhieuXuLy());
		phieuXuLyPhuHoSoThuTucImpl.setPhanNhomHoSoId(phieuXuLyPhuHoSoThuTuc.getPhanNhomHoSoId());
		phieuXuLyPhuHoSoThuTucImpl.setMaSoHoSo(phieuXuLyPhuHoSoThuTuc.getMaSoHoSo());
		phieuXuLyPhuHoSoThuTucImpl.setMaBienNhan(phieuXuLyPhuHoSoThuTuc.getMaBienNhan());
		phieuXuLyPhuHoSoThuTucImpl.setThuTucHanhChinhId(phieuXuLyPhuHoSoThuTuc.getThuTucHanhChinhId());
		phieuXuLyPhuHoSoThuTucImpl.setTenChuHoSo(phieuXuLyPhuHoSoThuTuc.getTenChuHoSo());
		phieuXuLyPhuHoSoThuTucImpl.setNgayGuiHoSo(phieuXuLyPhuHoSoThuTuc.getNgayGuiHoSo());
		phieuXuLyPhuHoSoThuTucImpl.setTenDonViTiepNhan(phieuXuLyPhuHoSoThuTuc.getTenDonViTiepNhan());

		return phieuXuLyPhuHoSoThuTucImpl;
	}

	/**
	 * Returns the phieu xu ly phu ho so thu tuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieu xu ly phu ho so thu tuc
	 * @return the phieu xu ly phu ho so thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyPhuHoSoThuTuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPhieuXuLyPhuHoSoThuTucException, SystemException {
		PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc = fetchByPrimaryKey(primaryKey);

		if (phieuXuLyPhuHoSoThuTuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPhieuXuLyPhuHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phieuXuLyPhuHoSoThuTuc;
	}

	/**
	 * Returns the phieu xu ly phu ho so thu tuc with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException} if it could not be found.
	 *
	 * @param id the primary key of the phieu xu ly phu ho so thu tuc
	 * @return the phieu xu ly phu ho so thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyPhuHoSoThuTuc findByPrimaryKey(long id)
		throws NoSuchPhieuXuLyPhuHoSoThuTucException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the phieu xu ly phu ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieu xu ly phu ho so thu tuc
	 * @return the phieu xu ly phu ho so thu tuc, or <code>null</code> if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyPhuHoSoThuTuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc = (PhieuXuLyPhuHoSoThuTuc)EntityCacheUtil.getResult(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				PhieuXuLyPhuHoSoThuTucImpl.class, primaryKey);

		if (phieuXuLyPhuHoSoThuTuc == _nullPhieuXuLyPhuHoSoThuTuc) {
			return null;
		}

		if (phieuXuLyPhuHoSoThuTuc == null) {
			Session session = null;

			try {
				session = openSession();

				phieuXuLyPhuHoSoThuTuc = (PhieuXuLyPhuHoSoThuTuc)session.get(PhieuXuLyPhuHoSoThuTucImpl.class,
						primaryKey);

				if (phieuXuLyPhuHoSoThuTuc != null) {
					cacheResult(phieuXuLyPhuHoSoThuTuc);
				}
				else {
					EntityCacheUtil.putResult(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						PhieuXuLyPhuHoSoThuTucImpl.class, primaryKey,
						_nullPhieuXuLyPhuHoSoThuTuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PhieuXuLyPhuHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
					PhieuXuLyPhuHoSoThuTucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phieuXuLyPhuHoSoThuTuc;
	}

	/**
	 * Returns the phieu xu ly phu ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the phieu xu ly phu ho so thu tuc
	 * @return the phieu xu ly phu ho so thu tuc, or <code>null</code> if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyPhuHoSoThuTuc fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the phieu xu ly phu ho so thu tucs.
	 *
	 * @return the phieu xu ly phu ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuXuLyPhuHoSoThuTuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phieu xu ly phu ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phieu xu ly phu ho so thu tucs
	 * @param end the upper bound of the range of phieu xu ly phu ho so thu tucs (not inclusive)
	 * @return the range of phieu xu ly phu ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuXuLyPhuHoSoThuTuc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the phieu xu ly phu ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phieu xu ly phu ho so thu tucs
	 * @param end the upper bound of the range of phieu xu ly phu ho so thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of phieu xu ly phu ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuXuLyPhuHoSoThuTuc> findAll(int start, int end,
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

		List<PhieuXuLyPhuHoSoThuTuc> list = (List<PhieuXuLyPhuHoSoThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHIEUXULYPHUHOSOTHUTUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHIEUXULYPHUHOSOTHUTUC;

				if (pagination) {
					sql = sql.concat(PhieuXuLyPhuHoSoThuTucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PhieuXuLyPhuHoSoThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PhieuXuLyPhuHoSoThuTuc>(list);
				}
				else {
					list = (List<PhieuXuLyPhuHoSoThuTuc>)QueryUtil.list(q,
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
	 * Removes all the phieu xu ly phu ho so thu tucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc : findAll()) {
			remove(phieuXuLyPhuHoSoThuTuc);
		}
	}

	/**
	 * Returns the number of phieu xu ly phu ho so thu tucs.
	 *
	 * @return the number of phieu xu ly phu ho so thu tucs
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

				Query q = session.createQuery(_SQL_COUNT_PHIEUXULYPHUHOSOTHUTUC);

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
	 * Initializes the phieu xu ly phu ho so thu tuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PhieuXuLyPhuHoSoThuTuc>> listenersList = new ArrayList<ModelListener<PhieuXuLyPhuHoSoThuTuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PhieuXuLyPhuHoSoThuTuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PhieuXuLyPhuHoSoThuTucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHIEUXULYPHUHOSOTHUTUC = "SELECT phieuXuLyPhuHoSoThuTuc FROM PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc";
	private static final String _SQL_COUNT_PHIEUXULYPHUHOSOTHUTUC = "SELECT COUNT(phieuXuLyPhuHoSoThuTuc) FROM PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phieuXuLyPhuHoSoThuTuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PhieuXuLyPhuHoSoThuTuc exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PhieuXuLyPhuHoSoThuTucPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"phieuXuLyChinhId", "trichYeuNoiDung", "ghiChu",
				"trangThaiHienTaiId", "noiDungHoSoId", "chiemQuyenXuLy",
				"ngayTaoPhieu", "nguoiTaoPhieu", "nhomPhieuXuLy",
				"phanNhomHoSoId", "maSoHoSo", "maBienNhan", "thuTucHanhChinhId",
				"tenChuHoSo", "ngayGuiHoSo", "tenDonViTiepNhan"
			});
	private static PhieuXuLyPhuHoSoThuTuc _nullPhieuXuLyPhuHoSoThuTuc = new PhieuXuLyPhuHoSoThuTucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PhieuXuLyPhuHoSoThuTuc> toCacheModel() {
				return _nullPhieuXuLyPhuHoSoThuTucCacheModel;
			}
		};

	private static CacheModel<PhieuXuLyPhuHoSoThuTuc> _nullPhieuXuLyPhuHoSoThuTucCacheModel =
		new CacheModel<PhieuXuLyPhuHoSoThuTuc>() {
			@Override
			public PhieuXuLyPhuHoSoThuTuc toEntityModel() {
				return _nullPhieuXuLyPhuHoSoThuTuc;
			}
		};
}