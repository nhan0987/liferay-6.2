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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewDangKiemTimKiemException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the view dang kiem tim kiem service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ViewDangKiemTimKiemPersistence
 * @see ViewDangKiemTimKiemUtil
 * @generated
 */
public class ViewDangKiemTimKiemPersistenceImpl extends BasePersistenceImpl<ViewDangKiemTimKiem>
	implements ViewDangKiemTimKiemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ViewDangKiemTimKiemUtil} to access the view dang kiem tim kiem persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ViewDangKiemTimKiemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
			ViewDangKiemTimKiemModelImpl.FINDER_CACHE_ENABLED,
			ViewDangKiemTimKiemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
			ViewDangKiemTimKiemModelImpl.FINDER_CACHE_ENABLED,
			ViewDangKiemTimKiemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
			ViewDangKiemTimKiemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ViewDangKiemTimKiemPersistenceImpl() {
		setModelClass(ViewDangKiemTimKiem.class);
	}

	/**
	 * Caches the view dang kiem tim kiem in the entity cache if it is enabled.
	 *
	 * @param viewDangKiemTimKiem the view dang kiem tim kiem
	 */
	@Override
	public void cacheResult(ViewDangKiemTimKiem viewDangKiemTimKiem) {
		EntityCacheUtil.putResult(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
			ViewDangKiemTimKiemImpl.class, viewDangKiemTimKiem.getPrimaryKey(),
			viewDangKiemTimKiem);

		viewDangKiemTimKiem.resetOriginalValues();
	}

	/**
	 * Caches the view dang kiem tim kiems in the entity cache if it is enabled.
	 *
	 * @param viewDangKiemTimKiems the view dang kiem tim kiems
	 */
	@Override
	public void cacheResult(List<ViewDangKiemTimKiem> viewDangKiemTimKiems) {
		for (ViewDangKiemTimKiem viewDangKiemTimKiem : viewDangKiemTimKiems) {
			if (EntityCacheUtil.getResult(
						ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
						ViewDangKiemTimKiemImpl.class,
						viewDangKiemTimKiem.getPrimaryKey()) == null) {
				cacheResult(viewDangKiemTimKiem);
			}
			else {
				viewDangKiemTimKiem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all view dang kiem tim kiems.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ViewDangKiemTimKiemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ViewDangKiemTimKiemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the view dang kiem tim kiem.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ViewDangKiemTimKiem viewDangKiemTimKiem) {
		EntityCacheUtil.removeResult(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
			ViewDangKiemTimKiemImpl.class, viewDangKiemTimKiem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ViewDangKiemTimKiem> viewDangKiemTimKiems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ViewDangKiemTimKiem viewDangKiemTimKiem : viewDangKiemTimKiems) {
			EntityCacheUtil.removeResult(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
				ViewDangKiemTimKiemImpl.class,
				viewDangKiemTimKiem.getPrimaryKey());
		}
	}

	/**
	 * Creates a new view dang kiem tim kiem with the primary key. Does not add the view dang kiem tim kiem to the database.
	 *
	 * @param id the primary key for the new view dang kiem tim kiem
	 * @return the new view dang kiem tim kiem
	 */
	@Override
	public ViewDangKiemTimKiem create(long id) {
		ViewDangKiemTimKiem viewDangKiemTimKiem = new ViewDangKiemTimKiemImpl();

		viewDangKiemTimKiem.setNew(true);
		viewDangKiemTimKiem.setPrimaryKey(id);

		return viewDangKiemTimKiem;
	}

	/**
	 * Removes the view dang kiem tim kiem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the view dang kiem tim kiem
	 * @return the view dang kiem tim kiem that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewDangKiemTimKiemException if a view dang kiem tim kiem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewDangKiemTimKiem remove(long id)
		throws NoSuchViewDangKiemTimKiemException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the view dang kiem tim kiem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the view dang kiem tim kiem
	 * @return the view dang kiem tim kiem that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewDangKiemTimKiemException if a view dang kiem tim kiem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewDangKiemTimKiem remove(Serializable primaryKey)
		throws NoSuchViewDangKiemTimKiemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ViewDangKiemTimKiem viewDangKiemTimKiem = (ViewDangKiemTimKiem)session.get(ViewDangKiemTimKiemImpl.class,
					primaryKey);

			if (viewDangKiemTimKiem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchViewDangKiemTimKiemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(viewDangKiemTimKiem);
		}
		catch (NoSuchViewDangKiemTimKiemException nsee) {
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
	protected ViewDangKiemTimKiem removeImpl(
		ViewDangKiemTimKiem viewDangKiemTimKiem) throws SystemException {
		viewDangKiemTimKiem = toUnwrappedModel(viewDangKiemTimKiem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(viewDangKiemTimKiem)) {
				viewDangKiemTimKiem = (ViewDangKiemTimKiem)session.get(ViewDangKiemTimKiemImpl.class,
						viewDangKiemTimKiem.getPrimaryKeyObj());
			}

			if (viewDangKiemTimKiem != null) {
				session.delete(viewDangKiemTimKiem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (viewDangKiemTimKiem != null) {
			clearCache(viewDangKiemTimKiem);
		}

		return viewDangKiemTimKiem;
	}

	@Override
	public ViewDangKiemTimKiem updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem viewDangKiemTimKiem)
		throws SystemException {
		viewDangKiemTimKiem = toUnwrappedModel(viewDangKiemTimKiem);

		boolean isNew = viewDangKiemTimKiem.isNew();

		Session session = null;

		try {
			session = openSession();

			if (viewDangKiemTimKiem.isNew()) {
				session.save(viewDangKiemTimKiem);

				viewDangKiemTimKiem.setNew(false);
			}
			else {
				session.merge(viewDangKiemTimKiem);
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

		EntityCacheUtil.putResult(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
			ViewDangKiemTimKiemImpl.class, viewDangKiemTimKiem.getPrimaryKey(),
			viewDangKiemTimKiem);

		return viewDangKiemTimKiem;
	}

	protected ViewDangKiemTimKiem toUnwrappedModel(
		ViewDangKiemTimKiem viewDangKiemTimKiem) {
		if (viewDangKiemTimKiem instanceof ViewDangKiemTimKiemImpl) {
			return viewDangKiemTimKiem;
		}

		ViewDangKiemTimKiemImpl viewDangKiemTimKiemImpl = new ViewDangKiemTimKiemImpl();

		viewDangKiemTimKiemImpl.setNew(viewDangKiemTimKiem.isNew());
		viewDangKiemTimKiemImpl.setPrimaryKey(viewDangKiemTimKiem.getPrimaryKey());

		viewDangKiemTimKiemImpl.setId(viewDangKiemTimKiem.getId());
		viewDangKiemTimKiemImpl.setVehicleGroupId(viewDangKiemTimKiem.getVehicleGroupId());
		viewDangKiemTimKiemImpl.setDebitNoteId(viewDangKiemTimKiem.getDebitNoteId());
		viewDangKiemTimKiemImpl.setSequenceNo(viewDangKiemTimKiem.getSequenceNo());
		viewDangKiemTimKiemImpl.setCodeNumber(viewDangKiemTimKiem.getCodeNumber());
		viewDangKiemTimKiemImpl.setChassisNumber(viewDangKiemTimKiem.getChassisNumber());
		viewDangKiemTimKiemImpl.setEngineNumber(viewDangKiemTimKiem.getEngineNumber());
		viewDangKiemTimKiemImpl.setProductionYear(viewDangKiemTimKiem.getProductionYear());
		viewDangKiemTimKiemImpl.setVehicleEngineStatus(viewDangKiemTimKiem.getVehicleEngineStatus());
		viewDangKiemTimKiemImpl.setVehicleColor(viewDangKiemTimKiem.getVehicleColor());
		viewDangKiemTimKiemImpl.setUnitPrice(viewDangKiemTimKiem.getUnitPrice());
		viewDangKiemTimKiemImpl.setCurrency(viewDangKiemTimKiem.getCurrency());
		viewDangKiemTimKiemImpl.setRemarks(viewDangKiemTimKiem.getRemarks());
		viewDangKiemTimKiemImpl.setConfirmedInspectionId(viewDangKiemTimKiem.getConfirmedInspectionId());
		viewDangKiemTimKiemImpl.setInspectionRecordId(viewDangKiemTimKiem.getInspectionRecordId());
		viewDangKiemTimKiemImpl.setDraftCertificateId(viewDangKiemTimKiem.getDraftCertificateId());
		viewDangKiemTimKiemImpl.setCertificateRecordId(viewDangKiemTimKiem.getCertificateRecordId());
		viewDangKiemTimKiemImpl.setMarkUpStatus(viewDangKiemTimKiem.getMarkUpStatus());
		viewDangKiemTimKiemImpl.setSafeTestRequirementId(viewDangKiemTimKiem.getSafeTestRequirementId());
		viewDangKiemTimKiemImpl.setEmissionTestRequirementId(viewDangKiemTimKiem.getEmissionTestRequirementId());
		viewDangKiemTimKiemImpl.setControlRequirementId(viewDangKiemTimKiem.getControlRequirementId());
		viewDangKiemTimKiemImpl.setMarkAsSample(viewDangKiemTimKiem.getMarkAsSample());
		viewDangKiemTimKiemImpl.setInspectionrecordno(viewDangKiemTimKiem.getInspectionrecordno());
		viewDangKiemTimKiemImpl.setInspectionRecordDate(viewDangKiemTimKiem.getInspectionRecordDate());
		viewDangKiemTimKiemImpl.setAttachedFileBbkt(viewDangKiemTimKiem.getAttachedFileBbkt());
		viewDangKiemTimKiemImpl.setCertificateNumber(viewDangKiemTimKiem.getCertificateNumber());
		viewDangKiemTimKiemImpl.setSignDate(viewDangKiemTimKiem.getSignDate());
		viewDangKiemTimKiemImpl.setAttachedFile(viewDangKiemTimKiem.getAttachedFile());
		viewDangKiemTimKiemImpl.setRegisteredNumber(viewDangKiemTimKiem.getRegisteredNumber());
		viewDangKiemTimKiemImpl.setInspectorSignDate(viewDangKiemTimKiem.getInspectorSignDate());
		viewDangKiemTimKiemImpl.setVehicleClass(viewDangKiemTimKiem.getVehicleClass());

		return viewDangKiemTimKiemImpl;
	}

	/**
	 * Returns the view dang kiem tim kiem with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the view dang kiem tim kiem
	 * @return the view dang kiem tim kiem
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewDangKiemTimKiemException if a view dang kiem tim kiem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewDangKiemTimKiem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchViewDangKiemTimKiemException, SystemException {
		ViewDangKiemTimKiem viewDangKiemTimKiem = fetchByPrimaryKey(primaryKey);

		if (viewDangKiemTimKiem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchViewDangKiemTimKiemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return viewDangKiemTimKiem;
	}

	/**
	 * Returns the view dang kiem tim kiem with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewDangKiemTimKiemException} if it could not be found.
	 *
	 * @param id the primary key of the view dang kiem tim kiem
	 * @return the view dang kiem tim kiem
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewDangKiemTimKiemException if a view dang kiem tim kiem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewDangKiemTimKiem findByPrimaryKey(long id)
		throws NoSuchViewDangKiemTimKiemException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the view dang kiem tim kiem with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the view dang kiem tim kiem
	 * @return the view dang kiem tim kiem, or <code>null</code> if a view dang kiem tim kiem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewDangKiemTimKiem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ViewDangKiemTimKiem viewDangKiemTimKiem = (ViewDangKiemTimKiem)EntityCacheUtil.getResult(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
				ViewDangKiemTimKiemImpl.class, primaryKey);

		if (viewDangKiemTimKiem == _nullViewDangKiemTimKiem) {
			return null;
		}

		if (viewDangKiemTimKiem == null) {
			Session session = null;

			try {
				session = openSession();

				viewDangKiemTimKiem = (ViewDangKiemTimKiem)session.get(ViewDangKiemTimKiemImpl.class,
						primaryKey);

				if (viewDangKiemTimKiem != null) {
					cacheResult(viewDangKiemTimKiem);
				}
				else {
					EntityCacheUtil.putResult(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
						ViewDangKiemTimKiemImpl.class, primaryKey,
						_nullViewDangKiemTimKiem);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ViewDangKiemTimKiemModelImpl.ENTITY_CACHE_ENABLED,
					ViewDangKiemTimKiemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return viewDangKiemTimKiem;
	}

	/**
	 * Returns the view dang kiem tim kiem with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the view dang kiem tim kiem
	 * @return the view dang kiem tim kiem, or <code>null</code> if a view dang kiem tim kiem with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewDangKiemTimKiem fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the view dang kiem tim kiems.
	 *
	 * @return the view dang kiem tim kiems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ViewDangKiemTimKiem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the view dang kiem tim kiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of view dang kiem tim kiems
	 * @param end the upper bound of the range of view dang kiem tim kiems (not inclusive)
	 * @return the range of view dang kiem tim kiems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ViewDangKiemTimKiem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the view dang kiem tim kiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of view dang kiem tim kiems
	 * @param end the upper bound of the range of view dang kiem tim kiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of view dang kiem tim kiems
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ViewDangKiemTimKiem> findAll(int start, int end,
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

		List<ViewDangKiemTimKiem> list = (List<ViewDangKiemTimKiem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VIEWDANGKIEMTIMKIEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VIEWDANGKIEMTIMKIEM;

				if (pagination) {
					sql = sql.concat(ViewDangKiemTimKiemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ViewDangKiemTimKiem>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ViewDangKiemTimKiem>(list);
				}
				else {
					list = (List<ViewDangKiemTimKiem>)QueryUtil.list(q,
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
	 * Removes all the view dang kiem tim kiems from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ViewDangKiemTimKiem viewDangKiemTimKiem : findAll()) {
			remove(viewDangKiemTimKiem);
		}
	}

	/**
	 * Returns the number of view dang kiem tim kiems.
	 *
	 * @return the number of view dang kiem tim kiems
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

				Query q = session.createQuery(_SQL_COUNT_VIEWDANGKIEMTIMKIEM);

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
	 * Initializes the view dang kiem tim kiem persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ViewDangKiemTimKiem>> listenersList = new ArrayList<ModelListener<ViewDangKiemTimKiem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ViewDangKiemTimKiem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ViewDangKiemTimKiemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VIEWDANGKIEMTIMKIEM = "SELECT viewDangKiemTimKiem FROM ViewDangKiemTimKiem viewDangKiemTimKiem";
	private static final String _SQL_COUNT_VIEWDANGKIEMTIMKIEM = "SELECT COUNT(viewDangKiemTimKiem) FROM ViewDangKiemTimKiem viewDangKiemTimKiem";
	private static final String _ORDER_BY_ENTITY_ALIAS = "viewDangKiemTimKiem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ViewDangKiemTimKiem exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ViewDangKiemTimKiemPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleGroupId", "debitNoteId", "sequenceNo", "codeNumber",
				"chassisNumber", "engineNumber", "productionYear",
				"vehicleEngineStatus", "vehicleColor", "unitPrice",
				"confirmedInspectionId", "inspectionRecordId",
				"draftCertificateId", "certificateRecordId", "markUpStatus",
				"safeTestRequirementId", "emissionTestRequirementId",
				"controlRequirementId", "markAsSample", "inspectionRecordDate",
				"attachedFileBbkt", "certificateNumber", "signDate",
				"attachedFile", "registeredNumber", "inspectorSignDate",
				"vehicleClass"
			});
	private static ViewDangKiemTimKiem _nullViewDangKiemTimKiem = new ViewDangKiemTimKiemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ViewDangKiemTimKiem> toCacheModel() {
				return _nullViewDangKiemTimKiemCacheModel;
			}
		};

	private static CacheModel<ViewDangKiemTimKiem> _nullViewDangKiemTimKiemCacheModel =
		new CacheModel<ViewDangKiemTimKiem>() {
			@Override
			public ViewDangKiemTimKiem toEntityModel() {
				return _nullViewDangKiemTimKiem;
			}
		};
}