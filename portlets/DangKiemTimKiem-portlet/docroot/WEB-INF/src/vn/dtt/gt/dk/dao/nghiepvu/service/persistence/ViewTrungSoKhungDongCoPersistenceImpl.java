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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the view trung so khung dong co service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ViewTrungSoKhungDongCoPersistence
 * @see ViewTrungSoKhungDongCoUtil
 * @generated
 */
public class ViewTrungSoKhungDongCoPersistenceImpl extends BasePersistenceImpl<ViewTrungSoKhungDongCo>
	implements ViewTrungSoKhungDongCoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ViewTrungSoKhungDongCoUtil} to access the view trung so khung dong co persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ViewTrungSoKhungDongCoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
			ViewTrungSoKhungDongCoModelImpl.FINDER_CACHE_ENABLED,
			ViewTrungSoKhungDongCoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
			ViewTrungSoKhungDongCoModelImpl.FINDER_CACHE_ENABLED,
			ViewTrungSoKhungDongCoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
			ViewTrungSoKhungDongCoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ViewTrungSoKhungDongCoPersistenceImpl() {
		setModelClass(ViewTrungSoKhungDongCo.class);
	}

	/**
	 * Caches the view trung so khung dong co in the entity cache if it is enabled.
	 *
	 * @param viewTrungSoKhungDongCo the view trung so khung dong co
	 */
	@Override
	public void cacheResult(ViewTrungSoKhungDongCo viewTrungSoKhungDongCo) {
		EntityCacheUtil.putResult(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
			ViewTrungSoKhungDongCoImpl.class,
			viewTrungSoKhungDongCo.getPrimaryKey(), viewTrungSoKhungDongCo);

		viewTrungSoKhungDongCo.resetOriginalValues();
	}

	/**
	 * Caches the view trung so khung dong cos in the entity cache if it is enabled.
	 *
	 * @param viewTrungSoKhungDongCos the view trung so khung dong cos
	 */
	@Override
	public void cacheResult(
		List<ViewTrungSoKhungDongCo> viewTrungSoKhungDongCos) {
		for (ViewTrungSoKhungDongCo viewTrungSoKhungDongCo : viewTrungSoKhungDongCos) {
			if (EntityCacheUtil.getResult(
						ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
						ViewTrungSoKhungDongCoImpl.class,
						viewTrungSoKhungDongCo.getPrimaryKey()) == null) {
				cacheResult(viewTrungSoKhungDongCo);
			}
			else {
				viewTrungSoKhungDongCo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all view trung so khung dong cos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ViewTrungSoKhungDongCoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ViewTrungSoKhungDongCoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the view trung so khung dong co.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ViewTrungSoKhungDongCo viewTrungSoKhungDongCo) {
		EntityCacheUtil.removeResult(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
			ViewTrungSoKhungDongCoImpl.class,
			viewTrungSoKhungDongCo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ViewTrungSoKhungDongCo> viewTrungSoKhungDongCos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ViewTrungSoKhungDongCo viewTrungSoKhungDongCo : viewTrungSoKhungDongCos) {
			EntityCacheUtil.removeResult(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
				ViewTrungSoKhungDongCoImpl.class,
				viewTrungSoKhungDongCo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new view trung so khung dong co with the primary key. Does not add the view trung so khung dong co to the database.
	 *
	 * @param id the primary key for the new view trung so khung dong co
	 * @return the new view trung so khung dong co
	 */
	@Override
	public ViewTrungSoKhungDongCo create(long id) {
		ViewTrungSoKhungDongCo viewTrungSoKhungDongCo = new ViewTrungSoKhungDongCoImpl();

		viewTrungSoKhungDongCo.setNew(true);
		viewTrungSoKhungDongCo.setPrimaryKey(id);

		return viewTrungSoKhungDongCo;
	}

	/**
	 * Removes the view trung so khung dong co with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the view trung so khung dong co
	 * @return the view trung so khung dong co that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException if a view trung so khung dong co with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewTrungSoKhungDongCo remove(long id)
		throws NoSuchViewTrungSoKhungDongCoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the view trung so khung dong co with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the view trung so khung dong co
	 * @return the view trung so khung dong co that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException if a view trung so khung dong co with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewTrungSoKhungDongCo remove(Serializable primaryKey)
		throws NoSuchViewTrungSoKhungDongCoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ViewTrungSoKhungDongCo viewTrungSoKhungDongCo = (ViewTrungSoKhungDongCo)session.get(ViewTrungSoKhungDongCoImpl.class,
					primaryKey);

			if (viewTrungSoKhungDongCo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchViewTrungSoKhungDongCoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(viewTrungSoKhungDongCo);
		}
		catch (NoSuchViewTrungSoKhungDongCoException nsee) {
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
	protected ViewTrungSoKhungDongCo removeImpl(
		ViewTrungSoKhungDongCo viewTrungSoKhungDongCo)
		throws SystemException {
		viewTrungSoKhungDongCo = toUnwrappedModel(viewTrungSoKhungDongCo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(viewTrungSoKhungDongCo)) {
				viewTrungSoKhungDongCo = (ViewTrungSoKhungDongCo)session.get(ViewTrungSoKhungDongCoImpl.class,
						viewTrungSoKhungDongCo.getPrimaryKeyObj());
			}

			if (viewTrungSoKhungDongCo != null) {
				session.delete(viewTrungSoKhungDongCo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (viewTrungSoKhungDongCo != null) {
			clearCache(viewTrungSoKhungDongCo);
		}

		return viewTrungSoKhungDongCo;
	}

	@Override
	public ViewTrungSoKhungDongCo updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo viewTrungSoKhungDongCo)
		throws SystemException {
		viewTrungSoKhungDongCo = toUnwrappedModel(viewTrungSoKhungDongCo);

		boolean isNew = viewTrungSoKhungDongCo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (viewTrungSoKhungDongCo.isNew()) {
				session.save(viewTrungSoKhungDongCo);

				viewTrungSoKhungDongCo.setNew(false);
			}
			else {
				session.merge(viewTrungSoKhungDongCo);
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

		EntityCacheUtil.putResult(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
			ViewTrungSoKhungDongCoImpl.class,
			viewTrungSoKhungDongCo.getPrimaryKey(), viewTrungSoKhungDongCo);

		return viewTrungSoKhungDongCo;
	}

	protected ViewTrungSoKhungDongCo toUnwrappedModel(
		ViewTrungSoKhungDongCo viewTrungSoKhungDongCo) {
		if (viewTrungSoKhungDongCo instanceof ViewTrungSoKhungDongCoImpl) {
			return viewTrungSoKhungDongCo;
		}

		ViewTrungSoKhungDongCoImpl viewTrungSoKhungDongCoImpl = new ViewTrungSoKhungDongCoImpl();

		viewTrungSoKhungDongCoImpl.setNew(viewTrungSoKhungDongCo.isNew());
		viewTrungSoKhungDongCoImpl.setPrimaryKey(viewTrungSoKhungDongCo.getPrimaryKey());

		viewTrungSoKhungDongCoImpl.setId(viewTrungSoKhungDongCo.getId());
		viewTrungSoKhungDongCoImpl.setVehicleGroupId(viewTrungSoKhungDongCo.getVehicleGroupId());
		viewTrungSoKhungDongCoImpl.setDebitNoteId(viewTrungSoKhungDongCo.getDebitNoteId());
		viewTrungSoKhungDongCoImpl.setSequenceNo(viewTrungSoKhungDongCo.getSequenceNo());
		viewTrungSoKhungDongCoImpl.setCodeNumber(viewTrungSoKhungDongCo.getCodeNumber());
		viewTrungSoKhungDongCoImpl.setChassisNumber(viewTrungSoKhungDongCo.getChassisNumber());
		viewTrungSoKhungDongCoImpl.setEngineNumber(viewTrungSoKhungDongCo.getEngineNumber());
		viewTrungSoKhungDongCoImpl.setProductionYear(viewTrungSoKhungDongCo.getProductionYear());
		viewTrungSoKhungDongCoImpl.setVehicleEngineStatus(viewTrungSoKhungDongCo.getVehicleEngineStatus());
		viewTrungSoKhungDongCoImpl.setVehicleColor(viewTrungSoKhungDongCo.getVehicleColor());
		viewTrungSoKhungDongCoImpl.setUnitPrice(viewTrungSoKhungDongCo.getUnitPrice());
		viewTrungSoKhungDongCoImpl.setCurrency(viewTrungSoKhungDongCo.getCurrency());
		viewTrungSoKhungDongCoImpl.setRemarks(viewTrungSoKhungDongCo.getRemarks());
		viewTrungSoKhungDongCoImpl.setConfirmedInspectionId(viewTrungSoKhungDongCo.getConfirmedInspectionId());
		viewTrungSoKhungDongCoImpl.setInspectionRecordId(viewTrungSoKhungDongCo.getInspectionRecordId());
		viewTrungSoKhungDongCoImpl.setDraftCertificateId(viewTrungSoKhungDongCo.getDraftCertificateId());
		viewTrungSoKhungDongCoImpl.setCertificateRecordId(viewTrungSoKhungDongCo.getCertificateRecordId());
		viewTrungSoKhungDongCoImpl.setMarkUpStatus(viewTrungSoKhungDongCo.getMarkUpStatus());
		viewTrungSoKhungDongCoImpl.setSafeTestRequirementId(viewTrungSoKhungDongCo.getSafeTestRequirementId());
		viewTrungSoKhungDongCoImpl.setEmissionTestRequirementId(viewTrungSoKhungDongCo.getEmissionTestRequirementId());
		viewTrungSoKhungDongCoImpl.setControlRequirementId(viewTrungSoKhungDongCo.getControlRequirementId());
		viewTrungSoKhungDongCoImpl.setMarkAsSample(viewTrungSoKhungDongCo.getMarkAsSample());
		viewTrungSoKhungDongCoImpl.setRegisteredNumber(viewTrungSoKhungDongCo.getRegisteredNumber());
		viewTrungSoKhungDongCoImpl.setContactName(viewTrungSoKhungDongCo.getContactName());
		viewTrungSoKhungDongCoImpl.setContactPhone(viewTrungSoKhungDongCo.getContactPhone());
		viewTrungSoKhungDongCoImpl.setInspectionDate(viewTrungSoKhungDongCo.getInspectionDate());
		viewTrungSoKhungDongCoImpl.setImporterName(viewTrungSoKhungDongCo.getImporterName());

		return viewTrungSoKhungDongCoImpl;
	}

	/**
	 * Returns the view trung so khung dong co with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the view trung so khung dong co
	 * @return the view trung so khung dong co
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException if a view trung so khung dong co with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewTrungSoKhungDongCo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchViewTrungSoKhungDongCoException, SystemException {
		ViewTrungSoKhungDongCo viewTrungSoKhungDongCo = fetchByPrimaryKey(primaryKey);

		if (viewTrungSoKhungDongCo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchViewTrungSoKhungDongCoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return viewTrungSoKhungDongCo;
	}

	/**
	 * Returns the view trung so khung dong co with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException} if it could not be found.
	 *
	 * @param id the primary key of the view trung so khung dong co
	 * @return the view trung so khung dong co
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException if a view trung so khung dong co with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewTrungSoKhungDongCo findByPrimaryKey(long id)
		throws NoSuchViewTrungSoKhungDongCoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the view trung so khung dong co with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the view trung so khung dong co
	 * @return the view trung so khung dong co, or <code>null</code> if a view trung so khung dong co with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewTrungSoKhungDongCo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ViewTrungSoKhungDongCo viewTrungSoKhungDongCo = (ViewTrungSoKhungDongCo)EntityCacheUtil.getResult(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
				ViewTrungSoKhungDongCoImpl.class, primaryKey);

		if (viewTrungSoKhungDongCo == _nullViewTrungSoKhungDongCo) {
			return null;
		}

		if (viewTrungSoKhungDongCo == null) {
			Session session = null;

			try {
				session = openSession();

				viewTrungSoKhungDongCo = (ViewTrungSoKhungDongCo)session.get(ViewTrungSoKhungDongCoImpl.class,
						primaryKey);

				if (viewTrungSoKhungDongCo != null) {
					cacheResult(viewTrungSoKhungDongCo);
				}
				else {
					EntityCacheUtil.putResult(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
						ViewTrungSoKhungDongCoImpl.class, primaryKey,
						_nullViewTrungSoKhungDongCo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ViewTrungSoKhungDongCoModelImpl.ENTITY_CACHE_ENABLED,
					ViewTrungSoKhungDongCoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return viewTrungSoKhungDongCo;
	}

	/**
	 * Returns the view trung so khung dong co with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the view trung so khung dong co
	 * @return the view trung so khung dong co, or <code>null</code> if a view trung so khung dong co with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ViewTrungSoKhungDongCo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the view trung so khung dong cos.
	 *
	 * @return the view trung so khung dong cos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ViewTrungSoKhungDongCo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the view trung so khung dong cos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of view trung so khung dong cos
	 * @param end the upper bound of the range of view trung so khung dong cos (not inclusive)
	 * @return the range of view trung so khung dong cos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ViewTrungSoKhungDongCo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the view trung so khung dong cos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of view trung so khung dong cos
	 * @param end the upper bound of the range of view trung so khung dong cos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of view trung so khung dong cos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ViewTrungSoKhungDongCo> findAll(int start, int end,
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

		List<ViewTrungSoKhungDongCo> list = (List<ViewTrungSoKhungDongCo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VIEWTRUNGSOKHUNGDONGCO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VIEWTRUNGSOKHUNGDONGCO;

				if (pagination) {
					sql = sql.concat(ViewTrungSoKhungDongCoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ViewTrungSoKhungDongCo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ViewTrungSoKhungDongCo>(list);
				}
				else {
					list = (List<ViewTrungSoKhungDongCo>)QueryUtil.list(q,
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
	 * Removes all the view trung so khung dong cos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ViewTrungSoKhungDongCo viewTrungSoKhungDongCo : findAll()) {
			remove(viewTrungSoKhungDongCo);
		}
	}

	/**
	 * Returns the number of view trung so khung dong cos.
	 *
	 * @return the number of view trung so khung dong cos
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

				Query q = session.createQuery(_SQL_COUNT_VIEWTRUNGSOKHUNGDONGCO);

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
	 * Initializes the view trung so khung dong co persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ViewTrungSoKhungDongCo>> listenersList = new ArrayList<ModelListener<ViewTrungSoKhungDongCo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ViewTrungSoKhungDongCo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ViewTrungSoKhungDongCoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VIEWTRUNGSOKHUNGDONGCO = "SELECT viewTrungSoKhungDongCo FROM ViewTrungSoKhungDongCo viewTrungSoKhungDongCo";
	private static final String _SQL_COUNT_VIEWTRUNGSOKHUNGDONGCO = "SELECT COUNT(viewTrungSoKhungDongCo) FROM ViewTrungSoKhungDongCo viewTrungSoKhungDongCo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "viewTrungSoKhungDongCo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ViewTrungSoKhungDongCo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ViewTrungSoKhungDongCoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleGroupId", "debitNoteId", "sequenceNo", "codeNumber",
				"chassisNumber", "engineNumber", "productionYear",
				"vehicleEngineStatus", "vehicleColor", "unitPrice",
				"confirmedInspectionId", "inspectionRecordId",
				"draftCertificateId", "certificateRecordId", "markUpStatus",
				"safeTestRequirementId", "emissionTestRequirementId",
				"controlRequirementId", "markAsSample", "registeredNumber",
				"contactName", "contactPhone", "inspectionDate", "importerName"
			});
	private static ViewTrungSoKhungDongCo _nullViewTrungSoKhungDongCo = new ViewTrungSoKhungDongCoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ViewTrungSoKhungDongCo> toCacheModel() {
				return _nullViewTrungSoKhungDongCoCacheModel;
			}
		};

	private static CacheModel<ViewTrungSoKhungDongCo> _nullViewTrungSoKhungDongCoCacheModel =
		new CacheModel<ViewTrungSoKhungDongCo>() {
			@Override
			public ViewTrungSoKhungDongCo toEntityModel() {
				return _nullViewTrungSoKhungDongCo;
			}
		};
}