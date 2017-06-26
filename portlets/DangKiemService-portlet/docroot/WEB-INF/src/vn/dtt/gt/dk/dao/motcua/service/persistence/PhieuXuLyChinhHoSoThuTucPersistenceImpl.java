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

import vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException;
import vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc;
import vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyChinhHoSoThuTucImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyChinhHoSoThuTucModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the phieu xu ly chinh ho so thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see PhieuXuLyChinhHoSoThuTucPersistence
 * @see PhieuXuLyChinhHoSoThuTucUtil
 * @generated
 */
public class PhieuXuLyChinhHoSoThuTucPersistenceImpl extends BasePersistenceImpl<PhieuXuLyChinhHoSoThuTuc>
	implements PhieuXuLyChinhHoSoThuTucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PhieuXuLyChinhHoSoThuTucUtil} to access the phieu xu ly chinh ho so thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PhieuXuLyChinhHoSoThuTucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PhieuXuLyChinhHoSoThuTucPersistenceImpl() {
		setModelClass(PhieuXuLyChinhHoSoThuTuc.class);
	}

	/**
	 * Caches the phieu xu ly chinh ho so thu tuc in the entity cache if it is enabled.
	 *
	 * @param phieuXuLyChinhHoSoThuTuc the phieu xu ly chinh ho so thu tuc
	 */
	@Override
	public void cacheResult(PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc) {
		EntityCacheUtil.putResult(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucImpl.class,
			phieuXuLyChinhHoSoThuTuc.getPrimaryKey(), phieuXuLyChinhHoSoThuTuc);

		phieuXuLyChinhHoSoThuTuc.resetOriginalValues();
	}

	/**
	 * Caches the phieu xu ly chinh ho so thu tucs in the entity cache if it is enabled.
	 *
	 * @param phieuXuLyChinhHoSoThuTucs the phieu xu ly chinh ho so thu tucs
	 */
	@Override
	public void cacheResult(
		List<PhieuXuLyChinhHoSoThuTuc> phieuXuLyChinhHoSoThuTucs) {
		for (PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc : phieuXuLyChinhHoSoThuTucs) {
			if (EntityCacheUtil.getResult(
						PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						PhieuXuLyChinhHoSoThuTucImpl.class,
						phieuXuLyChinhHoSoThuTuc.getPrimaryKey()) == null) {
				cacheResult(phieuXuLyChinhHoSoThuTuc);
			}
			else {
				phieuXuLyChinhHoSoThuTuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phieu xu ly chinh ho so thu tucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PhieuXuLyChinhHoSoThuTucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PhieuXuLyChinhHoSoThuTucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phieu xu ly chinh ho so thu tuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc) {
		EntityCacheUtil.removeResult(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucImpl.class,
			phieuXuLyChinhHoSoThuTuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<PhieuXuLyChinhHoSoThuTuc> phieuXuLyChinhHoSoThuTucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc : phieuXuLyChinhHoSoThuTucs) {
			EntityCacheUtil.removeResult(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				PhieuXuLyChinhHoSoThuTucImpl.class,
				phieuXuLyChinhHoSoThuTuc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phieu xu ly chinh ho so thu tuc with the primary key. Does not add the phieu xu ly chinh ho so thu tuc to the database.
	 *
	 * @param id the primary key for the new phieu xu ly chinh ho so thu tuc
	 * @return the new phieu xu ly chinh ho so thu tuc
	 */
	@Override
	public PhieuXuLyChinhHoSoThuTuc create(long id) {
		PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc = new PhieuXuLyChinhHoSoThuTucImpl();

		phieuXuLyChinhHoSoThuTuc.setNew(true);
		phieuXuLyChinhHoSoThuTuc.setPrimaryKey(id);

		return phieuXuLyChinhHoSoThuTuc;
	}

	/**
	 * Removes the phieu xu ly chinh ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the phieu xu ly chinh ho so thu tuc
	 * @return the phieu xu ly chinh ho so thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException if a phieu xu ly chinh ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyChinhHoSoThuTuc remove(long id)
		throws NoSuchPhieuXuLyChinhHoSoThuTucException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the phieu xu ly chinh ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phieu xu ly chinh ho so thu tuc
	 * @return the phieu xu ly chinh ho so thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException if a phieu xu ly chinh ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyChinhHoSoThuTuc remove(Serializable primaryKey)
		throws NoSuchPhieuXuLyChinhHoSoThuTucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc = (PhieuXuLyChinhHoSoThuTuc)session.get(PhieuXuLyChinhHoSoThuTucImpl.class,
					primaryKey);

			if (phieuXuLyChinhHoSoThuTuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPhieuXuLyChinhHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phieuXuLyChinhHoSoThuTuc);
		}
		catch (NoSuchPhieuXuLyChinhHoSoThuTucException nsee) {
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
	protected PhieuXuLyChinhHoSoThuTuc removeImpl(
		PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc)
		throws SystemException {
		phieuXuLyChinhHoSoThuTuc = toUnwrappedModel(phieuXuLyChinhHoSoThuTuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phieuXuLyChinhHoSoThuTuc)) {
				phieuXuLyChinhHoSoThuTuc = (PhieuXuLyChinhHoSoThuTuc)session.get(PhieuXuLyChinhHoSoThuTucImpl.class,
						phieuXuLyChinhHoSoThuTuc.getPrimaryKeyObj());
			}

			if (phieuXuLyChinhHoSoThuTuc != null) {
				session.delete(phieuXuLyChinhHoSoThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phieuXuLyChinhHoSoThuTuc != null) {
			clearCache(phieuXuLyChinhHoSoThuTuc);
		}

		return phieuXuLyChinhHoSoThuTuc;
	}

	@Override
	public PhieuXuLyChinhHoSoThuTuc updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc)
		throws SystemException {
		phieuXuLyChinhHoSoThuTuc = toUnwrappedModel(phieuXuLyChinhHoSoThuTuc);

		boolean isNew = phieuXuLyChinhHoSoThuTuc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phieuXuLyChinhHoSoThuTuc.isNew()) {
				session.save(phieuXuLyChinhHoSoThuTuc);

				phieuXuLyChinhHoSoThuTuc.setNew(false);
			}
			else {
				session.merge(phieuXuLyChinhHoSoThuTuc);
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

		EntityCacheUtil.putResult(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			PhieuXuLyChinhHoSoThuTucImpl.class,
			phieuXuLyChinhHoSoThuTuc.getPrimaryKey(), phieuXuLyChinhHoSoThuTuc);

		return phieuXuLyChinhHoSoThuTuc;
	}

	protected PhieuXuLyChinhHoSoThuTuc toUnwrappedModel(
		PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc) {
		if (phieuXuLyChinhHoSoThuTuc instanceof PhieuXuLyChinhHoSoThuTucImpl) {
			return phieuXuLyChinhHoSoThuTuc;
		}

		PhieuXuLyChinhHoSoThuTucImpl phieuXuLyChinhHoSoThuTucImpl = new PhieuXuLyChinhHoSoThuTucImpl();

		phieuXuLyChinhHoSoThuTucImpl.setNew(phieuXuLyChinhHoSoThuTuc.isNew());
		phieuXuLyChinhHoSoThuTucImpl.setPrimaryKey(phieuXuLyChinhHoSoThuTuc.getPrimaryKey());

		phieuXuLyChinhHoSoThuTucImpl.setId(phieuXuLyChinhHoSoThuTuc.getId());
		phieuXuLyChinhHoSoThuTucImpl.setHoSoThuTucId(phieuXuLyChinhHoSoThuTuc.getHoSoThuTucId());
		phieuXuLyChinhHoSoThuTucImpl.setQuyTrinhThuTucId(phieuXuLyChinhHoSoThuTuc.getQuyTrinhThuTucId());
		phieuXuLyChinhHoSoThuTucImpl.setTenNguoiNop(phieuXuLyChinhHoSoThuTuc.getTenNguoiNop());
		phieuXuLyChinhHoSoThuTucImpl.setCmndNguoiNop(phieuXuLyChinhHoSoThuTuc.getCmndNguoiNop());
		phieuXuLyChinhHoSoThuTucImpl.setDiaChiNguoiNop(phieuXuLyChinhHoSoThuTuc.getDiaChiNguoiNop());
		phieuXuLyChinhHoSoThuTucImpl.setSoDtddNguoiNop(phieuXuLyChinhHoSoThuTuc.getSoDtddNguoiNop());
		phieuXuLyChinhHoSoThuTucImpl.setEmailNguoiNop(phieuXuLyChinhHoSoThuTuc.getEmailNguoiNop());
		phieuXuLyChinhHoSoThuTucImpl.setGhiChu(phieuXuLyChinhHoSoThuTuc.getGhiChu());
		phieuXuLyChinhHoSoThuTucImpl.setTrangThaiHienTaiId(phieuXuLyChinhHoSoThuTuc.getTrangThaiHienTaiId());
		phieuXuLyChinhHoSoThuTucImpl.setHetHoSoCon(phieuXuLyChinhHoSoThuTuc.getHetHoSoCon());
		phieuXuLyChinhHoSoThuTucImpl.setChiemQuyenXuLy(phieuXuLyChinhHoSoThuTuc.getChiemQuyenXuLy());
		phieuXuLyChinhHoSoThuTucImpl.setNgayTaoPhieu(phieuXuLyChinhHoSoThuTuc.getNgayTaoPhieu());
		phieuXuLyChinhHoSoThuTucImpl.setNguoiTaoPhieu(phieuXuLyChinhHoSoThuTuc.getNguoiTaoPhieu());
		phieuXuLyChinhHoSoThuTucImpl.setSoDtcdNguoiNop(phieuXuLyChinhHoSoThuTuc.getSoDtcdNguoiNop());
		phieuXuLyChinhHoSoThuTucImpl.setMaSoHoSo(phieuXuLyChinhHoSoThuTuc.getMaSoHoSo());
		phieuXuLyChinhHoSoThuTucImpl.setMaBienNhan(phieuXuLyChinhHoSoThuTuc.getMaBienNhan());
		phieuXuLyChinhHoSoThuTucImpl.setThuTucHanhChinhId(phieuXuLyChinhHoSoThuTuc.getThuTucHanhChinhId());
		phieuXuLyChinhHoSoThuTucImpl.setTenChuHoSo(phieuXuLyChinhHoSoThuTuc.getTenChuHoSo());
		phieuXuLyChinhHoSoThuTucImpl.setNgayGuiHoSo(phieuXuLyChinhHoSoThuTuc.getNgayGuiHoSo());
		phieuXuLyChinhHoSoThuTucImpl.setTenDonViTiepNhan(phieuXuLyChinhHoSoThuTuc.getTenDonViTiepNhan());

		return phieuXuLyChinhHoSoThuTucImpl;
	}

	/**
	 * Returns the phieu xu ly chinh ho so thu tuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieu xu ly chinh ho so thu tuc
	 * @return the phieu xu ly chinh ho so thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException if a phieu xu ly chinh ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyChinhHoSoThuTuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPhieuXuLyChinhHoSoThuTucException, SystemException {
		PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc = fetchByPrimaryKey(primaryKey);

		if (phieuXuLyChinhHoSoThuTuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPhieuXuLyChinhHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phieuXuLyChinhHoSoThuTuc;
	}

	/**
	 * Returns the phieu xu ly chinh ho so thu tuc with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException} if it could not be found.
	 *
	 * @param id the primary key of the phieu xu ly chinh ho so thu tuc
	 * @return the phieu xu ly chinh ho so thu tuc
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException if a phieu xu ly chinh ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyChinhHoSoThuTuc findByPrimaryKey(long id)
		throws NoSuchPhieuXuLyChinhHoSoThuTucException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the phieu xu ly chinh ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieu xu ly chinh ho so thu tuc
	 * @return the phieu xu ly chinh ho so thu tuc, or <code>null</code> if a phieu xu ly chinh ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyChinhHoSoThuTuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc = (PhieuXuLyChinhHoSoThuTuc)EntityCacheUtil.getResult(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				PhieuXuLyChinhHoSoThuTucImpl.class, primaryKey);

		if (phieuXuLyChinhHoSoThuTuc == _nullPhieuXuLyChinhHoSoThuTuc) {
			return null;
		}

		if (phieuXuLyChinhHoSoThuTuc == null) {
			Session session = null;

			try {
				session = openSession();

				phieuXuLyChinhHoSoThuTuc = (PhieuXuLyChinhHoSoThuTuc)session.get(PhieuXuLyChinhHoSoThuTucImpl.class,
						primaryKey);

				if (phieuXuLyChinhHoSoThuTuc != null) {
					cacheResult(phieuXuLyChinhHoSoThuTuc);
				}
				else {
					EntityCacheUtil.putResult(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						PhieuXuLyChinhHoSoThuTucImpl.class, primaryKey,
						_nullPhieuXuLyChinhHoSoThuTuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PhieuXuLyChinhHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
					PhieuXuLyChinhHoSoThuTucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phieuXuLyChinhHoSoThuTuc;
	}

	/**
	 * Returns the phieu xu ly chinh ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the phieu xu ly chinh ho so thu tuc
	 * @return the phieu xu ly chinh ho so thu tuc, or <code>null</code> if a phieu xu ly chinh ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhieuXuLyChinhHoSoThuTuc fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the phieu xu ly chinh ho so thu tucs.
	 *
	 * @return the phieu xu ly chinh ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuXuLyChinhHoSoThuTuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phieu xu ly chinh ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyChinhHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phieu xu ly chinh ho so thu tucs
	 * @param end the upper bound of the range of phieu xu ly chinh ho so thu tucs (not inclusive)
	 * @return the range of phieu xu ly chinh ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuXuLyChinhHoSoThuTuc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the phieu xu ly chinh ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyChinhHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phieu xu ly chinh ho so thu tucs
	 * @param end the upper bound of the range of phieu xu ly chinh ho so thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of phieu xu ly chinh ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhieuXuLyChinhHoSoThuTuc> findAll(int start, int end,
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

		List<PhieuXuLyChinhHoSoThuTuc> list = (List<PhieuXuLyChinhHoSoThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHIEUXULYCHINHHOSOTHUTUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHIEUXULYCHINHHOSOTHUTUC;

				if (pagination) {
					sql = sql.concat(PhieuXuLyChinhHoSoThuTucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PhieuXuLyChinhHoSoThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PhieuXuLyChinhHoSoThuTuc>(list);
				}
				else {
					list = (List<PhieuXuLyChinhHoSoThuTuc>)QueryUtil.list(q,
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
	 * Removes all the phieu xu ly chinh ho so thu tucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc : findAll()) {
			remove(phieuXuLyChinhHoSoThuTuc);
		}
	}

	/**
	 * Returns the number of phieu xu ly chinh ho so thu tucs.
	 *
	 * @return the number of phieu xu ly chinh ho so thu tucs
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

				Query q = session.createQuery(_SQL_COUNT_PHIEUXULYCHINHHOSOTHUTUC);

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
	 * Initializes the phieu xu ly chinh ho so thu tuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PhieuXuLyChinhHoSoThuTuc>> listenersList = new ArrayList<ModelListener<PhieuXuLyChinhHoSoThuTuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PhieuXuLyChinhHoSoThuTuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PhieuXuLyChinhHoSoThuTucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHIEUXULYCHINHHOSOTHUTUC = "SELECT phieuXuLyChinhHoSoThuTuc FROM PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc";
	private static final String _SQL_COUNT_PHIEUXULYCHINHHOSOTHUTUC = "SELECT COUNT(phieuXuLyChinhHoSoThuTuc) FROM PhieuXuLyChinhHoSoThuTuc phieuXuLyChinhHoSoThuTuc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phieuXuLyChinhHoSoThuTuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PhieuXuLyChinhHoSoThuTuc exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PhieuXuLyChinhHoSoThuTucPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"hoSoThuTucId", "quyTrinhThuTucId", "tenNguoiNop",
				"cmndNguoiNop", "diaChiNguoiNop", "soDtddNguoiNop",
				"emailNguoiNop", "ghiChu", "trangThaiHienTaiId", "hetHoSoCon",
				"chiemQuyenXuLy", "ngayTaoPhieu", "nguoiTaoPhieu",
				"soDtcdNguoiNop", "maSoHoSo", "maBienNhan", "thuTucHanhChinhId",
				"tenChuHoSo", "ngayGuiHoSo", "tenDonViTiepNhan"
			});
	private static PhieuXuLyChinhHoSoThuTuc _nullPhieuXuLyChinhHoSoThuTuc = new PhieuXuLyChinhHoSoThuTucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PhieuXuLyChinhHoSoThuTuc> toCacheModel() {
				return _nullPhieuXuLyChinhHoSoThuTucCacheModel;
			}
		};

	private static CacheModel<PhieuXuLyChinhHoSoThuTuc> _nullPhieuXuLyChinhHoSoThuTucCacheModel =
		new CacheModel<PhieuXuLyChinhHoSoThuTuc>() {
			@Override
			public PhieuXuLyChinhHoSoThuTuc toEntityModel() {
				return _nullPhieuXuLyChinhHoSoThuTuc;
			}
		};
}