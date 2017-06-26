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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException;
import vn.dtt.gt.dk.dao.common.model.DmDataGroup;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupImpl;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm data group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DmDataGroupPersistence
 * @see DmDataGroupUtil
 * @generated
 */
public class DmDataGroupPersistenceImpl extends BasePersistenceImpl<DmDataGroup>
	implements DmDataGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmDataGroupUtil} to access the dm data group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmDataGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupModelImpl.FINDER_CACHE_ENABLED, DmDataGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupModelImpl.FINDER_CACHE_ENABLED, DmDataGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE = new FinderPath(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupModelImpl.FINDER_CACHE_ENABLED, DmDataGroupImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCode",
			new String[] { String.class.getName() },
			DmDataGroupModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm data group where Code = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException} if it could not be found.
	 *
	 * @param Code the code
	 * @return the matching dm data group
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a matching dm data group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup findByCode(String Code)
		throws NoSuchDmDataGroupException, SystemException {
		DmDataGroup dmDataGroup = fetchByCode(Code);

		if (dmDataGroup == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("Code=");
			msg.append(Code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmDataGroupException(msg.toString());
		}

		return dmDataGroup;
	}

	/**
	 * Returns the dm data group where Code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param Code the code
	 * @return the matching dm data group, or <code>null</code> if a matching dm data group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup fetchByCode(String Code) throws SystemException {
		return fetchByCode(Code, true);
	}

	/**
	 * Returns the dm data group where Code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param Code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm data group, or <code>null</code> if a matching dm data group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup fetchByCode(String Code, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { Code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs, this);
		}

		if (result instanceof DmDataGroup) {
			DmDataGroup dmDataGroup = (DmDataGroup)result;

			if (!Validator.equals(Code, dmDataGroup.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMDATAGROUP_WHERE);

			boolean bindCode = false;

			if (Code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (Code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(Code);
				}

				List<DmDataGroup> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmDataGroupPersistenceImpl.fetchByCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmDataGroup dmDataGroup = list.get(0);

					result = dmDataGroup;

					cacheResult(dmDataGroup);

					if ((dmDataGroup.getCode() == null) ||
							!dmDataGroup.getCode().equals(Code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
							finderArgs, dmDataGroup);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
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
			return (DmDataGroup)result;
		}
	}

	/**
	 * Removes the dm data group where Code = &#63; from the database.
	 *
	 * @param Code the code
	 * @return the dm data group that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup removeByCode(String Code)
		throws NoSuchDmDataGroupException, SystemException {
		DmDataGroup dmDataGroup = findByCode(Code);

		return remove(dmDataGroup);
	}

	/**
	 * Returns the number of dm data groups where Code = &#63;.
	 *
	 * @param Code the code
	 * @return the number of matching dm data groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCode(String Code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE;

		Object[] finderArgs = new Object[] { Code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMDATAGROUP_WHERE);

			boolean bindCode = false;

			if (Code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (Code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(Code);
				}

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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "dmDataGroup.Code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "dmDataGroup.Code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(dmDataGroup.Code IS NULL OR dmDataGroup.Code = '')";

	public DmDataGroupPersistenceImpl() {
		setModelClass(DmDataGroup.class);
	}

	/**
	 * Caches the dm data group in the entity cache if it is enabled.
	 *
	 * @param dmDataGroup the dm data group
	 */
	@Override
	public void cacheResult(DmDataGroup dmDataGroup) {
		EntityCacheUtil.putResult(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupImpl.class, dmDataGroup.getPrimaryKey(), dmDataGroup);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] { dmDataGroup.getCode() }, dmDataGroup);

		dmDataGroup.resetOriginalValues();
	}

	/**
	 * Caches the dm data groups in the entity cache if it is enabled.
	 *
	 * @param dmDataGroups the dm data groups
	 */
	@Override
	public void cacheResult(List<DmDataGroup> dmDataGroups) {
		for (DmDataGroup dmDataGroup : dmDataGroups) {
			if (EntityCacheUtil.getResult(
						DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
						DmDataGroupImpl.class, dmDataGroup.getPrimaryKey()) == null) {
				cacheResult(dmDataGroup);
			}
			else {
				dmDataGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm data groups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmDataGroupImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmDataGroupImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm data group.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmDataGroup dmDataGroup) {
		EntityCacheUtil.removeResult(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupImpl.class, dmDataGroup.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmDataGroup);
	}

	@Override
	public void clearCache(List<DmDataGroup> dmDataGroups) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmDataGroup dmDataGroup : dmDataGroups) {
			EntityCacheUtil.removeResult(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
				DmDataGroupImpl.class, dmDataGroup.getPrimaryKey());

			clearUniqueFindersCache(dmDataGroup);
		}
	}

	protected void cacheUniqueFindersCache(DmDataGroup dmDataGroup) {
		if (dmDataGroup.isNew()) {
			Object[] args = new Object[] { dmDataGroup.getCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
				dmDataGroup);
		}
		else {
			DmDataGroupModelImpl dmDataGroupModelImpl = (DmDataGroupModelImpl)dmDataGroup;

			if ((dmDataGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmDataGroup.getCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
					dmDataGroup);
			}
		}
	}

	protected void clearUniqueFindersCache(DmDataGroup dmDataGroup) {
		DmDataGroupModelImpl dmDataGroupModelImpl = (DmDataGroupModelImpl)dmDataGroup;

		Object[] args = new Object[] { dmDataGroup.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);

		if ((dmDataGroupModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
			args = new Object[] { dmDataGroupModelImpl.getOriginalCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);
		}
	}

	/**
	 * Creates a new dm data group with the primary key. Does not add the dm data group to the database.
	 *
	 * @param Id the primary key for the new dm data group
	 * @return the new dm data group
	 */
	@Override
	public DmDataGroup create(long Id) {
		DmDataGroup dmDataGroup = new DmDataGroupImpl();

		dmDataGroup.setNew(true);
		dmDataGroup.setPrimaryKey(Id);

		return dmDataGroup;
	}

	/**
	 * Removes the dm data group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the dm data group
	 * @return the dm data group that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup remove(long Id)
		throws NoSuchDmDataGroupException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the dm data group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm data group
	 * @return the dm data group that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup remove(Serializable primaryKey)
		throws NoSuchDmDataGroupException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmDataGroup dmDataGroup = (DmDataGroup)session.get(DmDataGroupImpl.class,
					primaryKey);

			if (dmDataGroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmDataGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmDataGroup);
		}
		catch (NoSuchDmDataGroupException nsee) {
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
	protected DmDataGroup removeImpl(DmDataGroup dmDataGroup)
		throws SystemException {
		dmDataGroup = toUnwrappedModel(dmDataGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmDataGroup)) {
				dmDataGroup = (DmDataGroup)session.get(DmDataGroupImpl.class,
						dmDataGroup.getPrimaryKeyObj());
			}

			if (dmDataGroup != null) {
				session.delete(dmDataGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmDataGroup != null) {
			clearCache(dmDataGroup);
		}

		return dmDataGroup;
	}

	@Override
	public DmDataGroup updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataGroup dmDataGroup)
		throws SystemException {
		dmDataGroup = toUnwrappedModel(dmDataGroup);

		boolean isNew = dmDataGroup.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmDataGroup.isNew()) {
				session.save(dmDataGroup);

				dmDataGroup.setNew(false);
			}
			else {
				session.merge(dmDataGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmDataGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
			DmDataGroupImpl.class, dmDataGroup.getPrimaryKey(), dmDataGroup);

		clearUniqueFindersCache(dmDataGroup);
		cacheUniqueFindersCache(dmDataGroup);

		return dmDataGroup;
	}

	protected DmDataGroup toUnwrappedModel(DmDataGroup dmDataGroup) {
		if (dmDataGroup instanceof DmDataGroupImpl) {
			return dmDataGroup;
		}

		DmDataGroupImpl dmDataGroupImpl = new DmDataGroupImpl();

		dmDataGroupImpl.setNew(dmDataGroup.isNew());
		dmDataGroupImpl.setPrimaryKey(dmDataGroup.getPrimaryKey());

		dmDataGroupImpl.setId(dmDataGroup.getId());
		dmDataGroupImpl.setCode(dmDataGroup.getCode());
		dmDataGroupImpl.setName(dmDataGroup.getName());
		dmDataGroupImpl.setDescription(dmDataGroup.getDescription());
		dmDataGroupImpl.setSynchdate(dmDataGroup.getSynchdate());

		return dmDataGroupImpl;
	}

	/**
	 * Returns the dm data group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data group
	 * @return the dm data group
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmDataGroupException, SystemException {
		DmDataGroup dmDataGroup = fetchByPrimaryKey(primaryKey);

		if (dmDataGroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmDataGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmDataGroup;
	}

	/**
	 * Returns the dm data group with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException} if it could not be found.
	 *
	 * @param Id the primary key of the dm data group
	 * @return the dm data group
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup findByPrimaryKey(long Id)
		throws NoSuchDmDataGroupException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the dm data group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data group
	 * @return the dm data group, or <code>null</code> if a dm data group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmDataGroup dmDataGroup = (DmDataGroup)EntityCacheUtil.getResult(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
				DmDataGroupImpl.class, primaryKey);

		if (dmDataGroup == _nullDmDataGroup) {
			return null;
		}

		if (dmDataGroup == null) {
			Session session = null;

			try {
				session = openSession();

				dmDataGroup = (DmDataGroup)session.get(DmDataGroupImpl.class,
						primaryKey);

				if (dmDataGroup != null) {
					cacheResult(dmDataGroup);
				}
				else {
					EntityCacheUtil.putResult(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
						DmDataGroupImpl.class, primaryKey, _nullDmDataGroup);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmDataGroupModelImpl.ENTITY_CACHE_ENABLED,
					DmDataGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmDataGroup;
	}

	/**
	 * Returns the dm data group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the dm data group
	 * @return the dm data group, or <code>null</code> if a dm data group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataGroup fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the dm data groups.
	 *
	 * @return the dm data groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataGroup> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data groups
	 * @param end the upper bound of the range of dm data groups (not inclusive)
	 * @return the range of dm data groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataGroup> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data groups
	 * @param end the upper bound of the range of dm data groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm data groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataGroup> findAll(int start, int end,
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

		List<DmDataGroup> list = (List<DmDataGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMDATAGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMDATAGROUP;

				if (pagination) {
					sql = sql.concat(DmDataGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmDataGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataGroup>(list);
				}
				else {
					list = (List<DmDataGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm data groups from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmDataGroup dmDataGroup : findAll()) {
			remove(dmDataGroup);
		}
	}

	/**
	 * Returns the number of dm data groups.
	 *
	 * @return the number of dm data groups
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

				Query q = session.createQuery(_SQL_COUNT_DMDATAGROUP);

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
	 * Initializes the dm data group persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.DmDataGroup")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmDataGroup>> listenersList = new ArrayList<ModelListener<DmDataGroup>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmDataGroup>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmDataGroupImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMDATAGROUP = "SELECT dmDataGroup FROM DmDataGroup dmDataGroup";
	private static final String _SQL_SELECT_DMDATAGROUP_WHERE = "SELECT dmDataGroup FROM DmDataGroup dmDataGroup WHERE ";
	private static final String _SQL_COUNT_DMDATAGROUP = "SELECT COUNT(dmDataGroup) FROM DmDataGroup dmDataGroup";
	private static final String _SQL_COUNT_DMDATAGROUP_WHERE = "SELECT COUNT(dmDataGroup) FROM DmDataGroup dmDataGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmDataGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmDataGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmDataGroup exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmDataGroupPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "Code", "Name", "Description"
			});
	private static DmDataGroup _nullDmDataGroup = new DmDataGroupImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmDataGroup> toCacheModel() {
				return _nullDmDataGroupCacheModel;
			}
		};

	private static CacheModel<DmDataGroup> _nullDmDataGroupCacheModel = new CacheModel<DmDataGroup>() {
			@Override
			public DmDataGroup toEntityModel() {
				return _nullDmDataGroup;
			}
		};
}