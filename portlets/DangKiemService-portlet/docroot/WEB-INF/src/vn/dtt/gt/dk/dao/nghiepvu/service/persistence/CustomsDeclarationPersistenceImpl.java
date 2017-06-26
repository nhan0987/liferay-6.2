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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the customs declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CustomsDeclarationPersistence
 * @see CustomsDeclarationUtil
 * @generated
 */
public class CustomsDeclarationPersistenceImpl extends BasePersistenceImpl<CustomsDeclaration>
	implements CustomsDeclarationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomsDeclarationUtil} to access the customs declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomsDeclarationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			CustomsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			CustomsDeclarationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCID = new FinderPath(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationModelImpl.FINDER_CACHE_ENABLED,
			CustomsDeclarationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucId", new String[] { Long.class.getName() },
			CustomsDeclarationModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the customs declaration where hosothutucId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException} if it could not be found.
	 *
	 * @param hosothutucId the hosothutuc ID
	 * @return the matching customs declaration
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a matching customs declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration findByHoSoThuTucId(long hosothutucId)
		throws NoSuchCustomsDeclarationException, SystemException {
		CustomsDeclaration customsDeclaration = fetchByHoSoThuTucId(hosothutucId);

		if (customsDeclaration == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hosothutucId=");
			msg.append(hosothutucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCustomsDeclarationException(msg.toString());
		}

		return customsDeclaration;
	}

	/**
	 * Returns the customs declaration where hosothutucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hosothutucId the hosothutuc ID
	 * @return the matching customs declaration, or <code>null</code> if a matching customs declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration fetchByHoSoThuTucId(long hosothutucId)
		throws SystemException {
		return fetchByHoSoThuTucId(hosothutucId, true);
	}

	/**
	 * Returns the customs declaration where hosothutucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hosothutucId the hosothutuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching customs declaration, or <code>null</code> if a matching customs declaration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration fetchByHoSoThuTucId(long hosothutucId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { hosothutucId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof CustomsDeclaration) {
			CustomsDeclaration customsDeclaration = (CustomsDeclaration)result;

			if ((hosothutucId != customsDeclaration.getHosothutucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CUSTOMSDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hosothutucId);

				List<CustomsDeclaration> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CustomsDeclarationPersistenceImpl.fetchByHoSoThuTucId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CustomsDeclaration customsDeclaration = list.get(0);

					result = customsDeclaration;

					cacheResult(customsDeclaration);

					if ((customsDeclaration.getHosothutucId() != hosothutucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
							finderArgs, customsDeclaration);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CustomsDeclaration)result;
		}
	}

	/**
	 * Removes the customs declaration where hosothutucId = &#63; from the database.
	 *
	 * @param hosothutucId the hosothutuc ID
	 * @return the customs declaration that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration removeByHoSoThuTucId(long hosothutucId)
		throws NoSuchCustomsDeclarationException, SystemException {
		CustomsDeclaration customsDeclaration = findByHoSoThuTucId(hosothutucId);

		return remove(customsDeclaration);
	}

	/**
	 * Returns the number of customs declarations where hosothutucId = &#63;.
	 *
	 * @param hosothutucId the hosothutuc ID
	 * @return the number of matching customs declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hosothutucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hosothutucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CUSTOMSDECLARATION_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hosothutucId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "customsDeclaration.hosothutucId = ?";

	public CustomsDeclarationPersistenceImpl() {
		setModelClass(CustomsDeclaration.class);
	}

	/**
	 * Caches the customs declaration in the entity cache if it is enabled.
	 *
	 * @param customsDeclaration the customs declaration
	 */
	@Override
	public void cacheResult(CustomsDeclaration customsDeclaration) {
		EntityCacheUtil.putResult(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationImpl.class, customsDeclaration.getPrimaryKey(),
			customsDeclaration);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
			new Object[] { customsDeclaration.getHosothutucId() },
			customsDeclaration);

		customsDeclaration.resetOriginalValues();
	}

	/**
	 * Caches the customs declarations in the entity cache if it is enabled.
	 *
	 * @param customsDeclarations the customs declarations
	 */
	@Override
	public void cacheResult(List<CustomsDeclaration> customsDeclarations) {
		for (CustomsDeclaration customsDeclaration : customsDeclarations) {
			if (EntityCacheUtil.getResult(
						CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						CustomsDeclarationImpl.class,
						customsDeclaration.getPrimaryKey()) == null) {
				cacheResult(customsDeclaration);
			}
			else {
				customsDeclaration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customs declarations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomsDeclarationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomsDeclarationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customs declaration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomsDeclaration customsDeclaration) {
		EntityCacheUtil.removeResult(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationImpl.class, customsDeclaration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(customsDeclaration);
	}

	@Override
	public void clearCache(List<CustomsDeclaration> customsDeclarations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomsDeclaration customsDeclaration : customsDeclarations) {
			EntityCacheUtil.removeResult(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				CustomsDeclarationImpl.class, customsDeclaration.getPrimaryKey());

			clearUniqueFindersCache(customsDeclaration);
		}
	}

	protected void cacheUniqueFindersCache(
		CustomsDeclaration customsDeclaration) {
		if (customsDeclaration.isNew()) {
			Object[] args = new Object[] { customsDeclaration.getHosothutucId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args,
				customsDeclaration);
		}
		else {
			CustomsDeclarationModelImpl customsDeclarationModelImpl = (CustomsDeclarationModelImpl)customsDeclaration;

			if ((customsDeclarationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						customsDeclaration.getHosothutucId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
					args, customsDeclaration);
			}
		}
	}

	protected void clearUniqueFindersCache(
		CustomsDeclaration customsDeclaration) {
		CustomsDeclarationModelImpl customsDeclarationModelImpl = (CustomsDeclarationModelImpl)customsDeclaration;

		Object[] args = new Object[] { customsDeclaration.getHosothutucId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args);

		if ((customsDeclarationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					customsDeclarationModelImpl.getOriginalHosothutucId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args);
		}
	}

	/**
	 * Creates a new customs declaration with the primary key. Does not add the customs declaration to the database.
	 *
	 * @param id the primary key for the new customs declaration
	 * @return the new customs declaration
	 */
	@Override
	public CustomsDeclaration create(long id) {
		CustomsDeclaration customsDeclaration = new CustomsDeclarationImpl();

		customsDeclaration.setNew(true);
		customsDeclaration.setPrimaryKey(id);

		return customsDeclaration;
	}

	/**
	 * Removes the customs declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the customs declaration
	 * @return the customs declaration that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration remove(long id)
		throws NoSuchCustomsDeclarationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the customs declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customs declaration
	 * @return the customs declaration that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration remove(Serializable primaryKey)
		throws NoSuchCustomsDeclarationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CustomsDeclaration customsDeclaration = (CustomsDeclaration)session.get(CustomsDeclarationImpl.class,
					primaryKey);

			if (customsDeclaration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomsDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customsDeclaration);
		}
		catch (NoSuchCustomsDeclarationException nsee) {
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
	protected CustomsDeclaration removeImpl(
		CustomsDeclaration customsDeclaration) throws SystemException {
		customsDeclaration = toUnwrappedModel(customsDeclaration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customsDeclaration)) {
				customsDeclaration = (CustomsDeclaration)session.get(CustomsDeclarationImpl.class,
						customsDeclaration.getPrimaryKeyObj());
			}

			if (customsDeclaration != null) {
				session.delete(customsDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customsDeclaration != null) {
			clearCache(customsDeclaration);
		}

		return customsDeclaration;
	}

	@Override
	public CustomsDeclaration updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration customsDeclaration)
		throws SystemException {
		customsDeclaration = toUnwrappedModel(customsDeclaration);

		boolean isNew = customsDeclaration.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customsDeclaration.isNew()) {
				session.save(customsDeclaration);

				customsDeclaration.setNew(false);
			}
			else {
				session.merge(customsDeclaration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CustomsDeclarationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
			CustomsDeclarationImpl.class, customsDeclaration.getPrimaryKey(),
			customsDeclaration);

		clearUniqueFindersCache(customsDeclaration);
		cacheUniqueFindersCache(customsDeclaration);

		return customsDeclaration;
	}

	protected CustomsDeclaration toUnwrappedModel(
		CustomsDeclaration customsDeclaration) {
		if (customsDeclaration instanceof CustomsDeclarationImpl) {
			return customsDeclaration;
		}

		CustomsDeclarationImpl customsDeclarationImpl = new CustomsDeclarationImpl();

		customsDeclarationImpl.setNew(customsDeclaration.isNew());
		customsDeclarationImpl.setPrimaryKey(customsDeclaration.getPrimaryKey());

		customsDeclarationImpl.setId(customsDeclaration.getId());
		customsDeclarationImpl.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
		customsDeclarationImpl.setImportCustomDeclareDate(customsDeclaration.getImportCustomDeclareDate());
		customsDeclarationImpl.setCustomsResult(customsDeclaration.getCustomsResult());
		customsDeclarationImpl.setProductCheck(customsDeclaration.getProductCheck());
		customsDeclarationImpl.setReleaseDate(customsDeclaration.getReleaseDate());
		customsDeclarationImpl.setHosothutucId(customsDeclaration.getHosothutucId());
		customsDeclarationImpl.setSynchdate(customsDeclaration.getSynchdate());

		return customsDeclarationImpl;
	}

	/**
	 * Returns the customs declaration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customs declaration
	 * @return the customs declaration
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomsDeclarationException, SystemException {
		CustomsDeclaration customsDeclaration = fetchByPrimaryKey(primaryKey);

		if (customsDeclaration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomsDeclarationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customsDeclaration;
	}

	/**
	 * Returns the customs declaration with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException} if it could not be found.
	 *
	 * @param id the primary key of the customs declaration
	 * @return the customs declaration
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration findByPrimaryKey(long id)
		throws NoSuchCustomsDeclarationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the customs declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customs declaration
	 * @return the customs declaration, or <code>null</code> if a customs declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CustomsDeclaration customsDeclaration = (CustomsDeclaration)EntityCacheUtil.getResult(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
				CustomsDeclarationImpl.class, primaryKey);

		if (customsDeclaration == _nullCustomsDeclaration) {
			return null;
		}

		if (customsDeclaration == null) {
			Session session = null;

			try {
				session = openSession();

				customsDeclaration = (CustomsDeclaration)session.get(CustomsDeclarationImpl.class,
						primaryKey);

				if (customsDeclaration != null) {
					cacheResult(customsDeclaration);
				}
				else {
					EntityCacheUtil.putResult(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
						CustomsDeclarationImpl.class, primaryKey,
						_nullCustomsDeclaration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomsDeclarationModelImpl.ENTITY_CACHE_ENABLED,
					CustomsDeclarationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customsDeclaration;
	}

	/**
	 * Returns the customs declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the customs declaration
	 * @return the customs declaration, or <code>null</code> if a customs declaration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomsDeclaration fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the customs declarations.
	 *
	 * @return the customs declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomsDeclaration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customs declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customs declarations
	 * @param end the upper bound of the range of customs declarations (not inclusive)
	 * @return the range of customs declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomsDeclaration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customs declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customs declarations
	 * @param end the upper bound of the range of customs declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customs declarations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomsDeclaration> findAll(int start, int end,
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

		List<CustomsDeclaration> list = (List<CustomsDeclaration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMSDECLARATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMSDECLARATION;

				if (pagination) {
					sql = sql.concat(CustomsDeclarationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomsDeclaration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CustomsDeclaration>(list);
				}
				else {
					list = (List<CustomsDeclaration>)QueryUtil.list(q,
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
	 * Removes all the customs declarations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CustomsDeclaration customsDeclaration : findAll()) {
			remove(customsDeclaration);
		}
	}

	/**
	 * Returns the number of customs declarations.
	 *
	 * @return the number of customs declarations
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMSDECLARATION);

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
	 * Initializes the customs declaration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CustomsDeclaration>> listenersList = new ArrayList<ModelListener<CustomsDeclaration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CustomsDeclaration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomsDeclarationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMSDECLARATION = "SELECT customsDeclaration FROM CustomsDeclaration customsDeclaration";
	private static final String _SQL_SELECT_CUSTOMSDECLARATION_WHERE = "SELECT customsDeclaration FROM CustomsDeclaration customsDeclaration WHERE ";
	private static final String _SQL_COUNT_CUSTOMSDECLARATION = "SELECT COUNT(customsDeclaration) FROM CustomsDeclaration customsDeclaration";
	private static final String _SQL_COUNT_CUSTOMSDECLARATION_WHERE = "SELECT COUNT(customsDeclaration) FROM CustomsDeclaration customsDeclaration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customsDeclaration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomsDeclaration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CustomsDeclaration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomsDeclarationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"importCustomDeclareNo", "importCustomDeclareDate",
				"customsResult", "productCheck", "releaseDate", "hosothutucId"
			});
	private static CustomsDeclaration _nullCustomsDeclaration = new CustomsDeclarationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CustomsDeclaration> toCacheModel() {
				return _nullCustomsDeclarationCacheModel;
			}
		};

	private static CacheModel<CustomsDeclaration> _nullCustomsDeclarationCacheModel =
		new CacheModel<CustomsDeclaration>() {
			@Override
			public CustomsDeclaration toEntityModel() {
				return _nullCustomsDeclaration;
			}
		};
}