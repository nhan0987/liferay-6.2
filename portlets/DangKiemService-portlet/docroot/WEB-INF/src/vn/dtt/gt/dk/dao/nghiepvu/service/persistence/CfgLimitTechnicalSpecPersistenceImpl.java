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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cfg limit technical spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CfgLimitTechnicalSpecPersistence
 * @see CfgLimitTechnicalSpecUtil
 * @generated
 */
public class CfgLimitTechnicalSpecPersistenceImpl extends BasePersistenceImpl<CfgLimitTechnicalSpec>
	implements CfgLimitTechnicalSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CfgLimitTechnicalSpecUtil} to access the cfg limit technical spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CfgLimitTechnicalSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecModelImpl.FINDER_CACHE_ENABLED,
			CfgLimitTechnicalSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecModelImpl.FINDER_CACHE_ENABLED,
			CfgLimitTechnicalSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_SPECIFICATIONCODE = new FinderPath(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecModelImpl.FINDER_CACHE_ENABLED,
			CfgLimitTechnicalSpecImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySpecificationCode",
			new String[] { String.class.getName() },
			CfgLimitTechnicalSpecModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPECIFICATIONCODE = new FinderPath(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySpecificationCode", new String[] { String.class.getName() });

	/**
	 * Returns the cfg limit technical spec where specificationcode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException} if it could not be found.
	 *
	 * @param specificationcode the specificationcode
	 * @return the matching cfg limit technical spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a matching cfg limit technical spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec findBySpecificationCode(
		String specificationcode)
		throws NoSuchCfgLimitTechnicalSpecException, SystemException {
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec = fetchBySpecificationCode(specificationcode);

		if (cfgLimitTechnicalSpec == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("specificationcode=");
			msg.append(specificationcode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCfgLimitTechnicalSpecException(msg.toString());
		}

		return cfgLimitTechnicalSpec;
	}

	/**
	 * Returns the cfg limit technical spec where specificationcode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param specificationcode the specificationcode
	 * @return the matching cfg limit technical spec, or <code>null</code> if a matching cfg limit technical spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec fetchBySpecificationCode(
		String specificationcode) throws SystemException {
		return fetchBySpecificationCode(specificationcode, true);
	}

	/**
	 * Returns the cfg limit technical spec where specificationcode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param specificationcode the specificationcode
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching cfg limit technical spec, or <code>null</code> if a matching cfg limit technical spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec fetchBySpecificationCode(
		String specificationcode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { specificationcode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
					finderArgs, this);
		}

		if (result instanceof CfgLimitTechnicalSpec) {
			CfgLimitTechnicalSpec cfgLimitTechnicalSpec = (CfgLimitTechnicalSpec)result;

			if (!Validator.equals(specificationcode,
						cfgLimitTechnicalSpec.getSpecificationcode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CFGLIMITTECHNICALSPEC_WHERE);

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
				}

				List<CfgLimitTechnicalSpec> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CfgLimitTechnicalSpecPersistenceImpl.fetchBySpecificationCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CfgLimitTechnicalSpec cfgLimitTechnicalSpec = list.get(0);

					result = cfgLimitTechnicalSpec;

					cacheResult(cfgLimitTechnicalSpec);

					if ((cfgLimitTechnicalSpec.getSpecificationcode() == null) ||
							!cfgLimitTechnicalSpec.getSpecificationcode()
													  .equals(specificationcode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
							finderArgs, cfgLimitTechnicalSpec);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
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
			return (CfgLimitTechnicalSpec)result;
		}
	}

	/**
	 * Removes the cfg limit technical spec where specificationcode = &#63; from the database.
	 *
	 * @param specificationcode the specificationcode
	 * @return the cfg limit technical spec that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec removeBySpecificationCode(
		String specificationcode)
		throws NoSuchCfgLimitTechnicalSpecException, SystemException {
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec = findBySpecificationCode(specificationcode);

		return remove(cfgLimitTechnicalSpec);
	}

	/**
	 * Returns the number of cfg limit technical specs where specificationcode = &#63;.
	 *
	 * @param specificationcode the specificationcode
	 * @return the number of matching cfg limit technical specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySpecificationCode(String specificationcode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPECIFICATIONCODE;

		Object[] finderArgs = new Object[] { specificationcode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CFGLIMITTECHNICALSPEC_WHERE);

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
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

	private static final String _FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_1 =
		"cfgLimitTechnicalSpec.specificationcode IS NULL";
	private static final String _FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"cfgLimitTechnicalSpec.specificationcode = ?";
	private static final String _FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(cfgLimitTechnicalSpec.specificationcode IS NULL OR cfgLimitTechnicalSpec.specificationcode = '')";

	public CfgLimitTechnicalSpecPersistenceImpl() {
		setModelClass(CfgLimitTechnicalSpec.class);
	}

	/**
	 * Caches the cfg limit technical spec in the entity cache if it is enabled.
	 *
	 * @param cfgLimitTechnicalSpec the cfg limit technical spec
	 */
	@Override
	public void cacheResult(CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		EntityCacheUtil.putResult(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecImpl.class,
			cfgLimitTechnicalSpec.getPrimaryKey(), cfgLimitTechnicalSpec);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
			new Object[] { cfgLimitTechnicalSpec.getSpecificationcode() },
			cfgLimitTechnicalSpec);

		cfgLimitTechnicalSpec.resetOriginalValues();
	}

	/**
	 * Caches the cfg limit technical specs in the entity cache if it is enabled.
	 *
	 * @param cfgLimitTechnicalSpecs the cfg limit technical specs
	 */
	@Override
	public void cacheResult(List<CfgLimitTechnicalSpec> cfgLimitTechnicalSpecs) {
		for (CfgLimitTechnicalSpec cfgLimitTechnicalSpec : cfgLimitTechnicalSpecs) {
			if (EntityCacheUtil.getResult(
						CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
						CfgLimitTechnicalSpecImpl.class,
						cfgLimitTechnicalSpec.getPrimaryKey()) == null) {
				cacheResult(cfgLimitTechnicalSpec);
			}
			else {
				cfgLimitTechnicalSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cfg limit technical specs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CfgLimitTechnicalSpecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CfgLimitTechnicalSpecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cfg limit technical spec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		EntityCacheUtil.removeResult(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecImpl.class,
			cfgLimitTechnicalSpec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(cfgLimitTechnicalSpec);
	}

	@Override
	public void clearCache(List<CfgLimitTechnicalSpec> cfgLimitTechnicalSpecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CfgLimitTechnicalSpec cfgLimitTechnicalSpec : cfgLimitTechnicalSpecs) {
			EntityCacheUtil.removeResult(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
				CfgLimitTechnicalSpecImpl.class,
				cfgLimitTechnicalSpec.getPrimaryKey());

			clearUniqueFindersCache(cfgLimitTechnicalSpec);
		}
	}

	protected void cacheUniqueFindersCache(
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		if (cfgLimitTechnicalSpec.isNew()) {
			Object[] args = new Object[] {
					cfgLimitTechnicalSpec.getSpecificationcode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
				args, cfgLimitTechnicalSpec);
		}
		else {
			CfgLimitTechnicalSpecModelImpl cfgLimitTechnicalSpecModelImpl = (CfgLimitTechnicalSpecModelImpl)cfgLimitTechnicalSpec;

			if ((cfgLimitTechnicalSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cfgLimitTechnicalSpec.getSpecificationcode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
					args, cfgLimitTechnicalSpec);
			}
		}
	}

	protected void clearUniqueFindersCache(
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		CfgLimitTechnicalSpecModelImpl cfgLimitTechnicalSpecModelImpl = (CfgLimitTechnicalSpecModelImpl)cfgLimitTechnicalSpec;

		Object[] args = new Object[] {
				cfgLimitTechnicalSpec.getSpecificationcode()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
			args);

		if ((cfgLimitTechnicalSpecModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SPECIFICATIONCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					cfgLimitTechnicalSpecModelImpl.getOriginalSpecificationcode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
				args);
		}
	}

	/**
	 * Creates a new cfg limit technical spec with the primary key. Does not add the cfg limit technical spec to the database.
	 *
	 * @param id the primary key for the new cfg limit technical spec
	 * @return the new cfg limit technical spec
	 */
	@Override
	public CfgLimitTechnicalSpec create(long id) {
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec = new CfgLimitTechnicalSpecImpl();

		cfgLimitTechnicalSpec.setNew(true);
		cfgLimitTechnicalSpec.setPrimaryKey(id);

		return cfgLimitTechnicalSpec;
	}

	/**
	 * Removes the cfg limit technical spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cfg limit technical spec
	 * @return the cfg limit technical spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a cfg limit technical spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec remove(long id)
		throws NoSuchCfgLimitTechnicalSpecException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the cfg limit technical spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cfg limit technical spec
	 * @return the cfg limit technical spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a cfg limit technical spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec remove(Serializable primaryKey)
		throws NoSuchCfgLimitTechnicalSpecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CfgLimitTechnicalSpec cfgLimitTechnicalSpec = (CfgLimitTechnicalSpec)session.get(CfgLimitTechnicalSpecImpl.class,
					primaryKey);

			if (cfgLimitTechnicalSpec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCfgLimitTechnicalSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cfgLimitTechnicalSpec);
		}
		catch (NoSuchCfgLimitTechnicalSpecException nsee) {
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
	protected CfgLimitTechnicalSpec removeImpl(
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec) throws SystemException {
		cfgLimitTechnicalSpec = toUnwrappedModel(cfgLimitTechnicalSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cfgLimitTechnicalSpec)) {
				cfgLimitTechnicalSpec = (CfgLimitTechnicalSpec)session.get(CfgLimitTechnicalSpecImpl.class,
						cfgLimitTechnicalSpec.getPrimaryKeyObj());
			}

			if (cfgLimitTechnicalSpec != null) {
				session.delete(cfgLimitTechnicalSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cfgLimitTechnicalSpec != null) {
			clearCache(cfgLimitTechnicalSpec);
		}

		return cfgLimitTechnicalSpec;
	}

	@Override
	public CfgLimitTechnicalSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec cfgLimitTechnicalSpec)
		throws SystemException {
		cfgLimitTechnicalSpec = toUnwrappedModel(cfgLimitTechnicalSpec);

		boolean isNew = cfgLimitTechnicalSpec.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cfgLimitTechnicalSpec.isNew()) {
				session.save(cfgLimitTechnicalSpec);

				cfgLimitTechnicalSpec.setNew(false);
			}
			else {
				session.merge(cfgLimitTechnicalSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CfgLimitTechnicalSpecModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
			CfgLimitTechnicalSpecImpl.class,
			cfgLimitTechnicalSpec.getPrimaryKey(), cfgLimitTechnicalSpec);

		clearUniqueFindersCache(cfgLimitTechnicalSpec);
		cacheUniqueFindersCache(cfgLimitTechnicalSpec);

		return cfgLimitTechnicalSpec;
	}

	protected CfgLimitTechnicalSpec toUnwrappedModel(
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		if (cfgLimitTechnicalSpec instanceof CfgLimitTechnicalSpecImpl) {
			return cfgLimitTechnicalSpec;
		}

		CfgLimitTechnicalSpecImpl cfgLimitTechnicalSpecImpl = new CfgLimitTechnicalSpecImpl();

		cfgLimitTechnicalSpecImpl.setNew(cfgLimitTechnicalSpec.isNew());
		cfgLimitTechnicalSpecImpl.setPrimaryKey(cfgLimitTechnicalSpec.getPrimaryKey());

		cfgLimitTechnicalSpecImpl.setId(cfgLimitTechnicalSpec.getId());
		cfgLimitTechnicalSpecImpl.setVehicletypecode(cfgLimitTechnicalSpec.getVehicletypecode());
		cfgLimitTechnicalSpecImpl.setVehicletypename(cfgLimitTechnicalSpec.getVehicletypename());
		cfgLimitTechnicalSpecImpl.setReference_code_3(cfgLimitTechnicalSpec.getReference_code_3());
		cfgLimitTechnicalSpecImpl.setReference_name(cfgLimitTechnicalSpec.getReference_name());
		cfgLimitTechnicalSpecImpl.setSearching_drive_config(cfgLimitTechnicalSpec.getSearching_drive_config());
		cfgLimitTechnicalSpecImpl.setAltername(cfgLimitTechnicalSpec.getAltername());
		cfgLimitTechnicalSpecImpl.setSequenceno(cfgLimitTechnicalSpec.getSequenceno());
		cfgLimitTechnicalSpecImpl.setSpecificationcode(cfgLimitTechnicalSpec.getSpecificationcode());
		cfgLimitTechnicalSpecImpl.setSpecificationname(cfgLimitTechnicalSpec.getSpecificationname());
		cfgLimitTechnicalSpecImpl.setSpec_description(cfgLimitTechnicalSpec.getSpec_description());
		cfgLimitTechnicalSpecImpl.setSpec_category(cfgLimitTechnicalSpec.getSpec_category());
		cfgLimitTechnicalSpecImpl.setDatagroupid(cfgLimitTechnicalSpec.getDatagroupid());
		cfgLimitTechnicalSpecImpl.setSynchdate(cfgLimitTechnicalSpec.getSynchdate());

		return cfgLimitTechnicalSpecImpl;
	}

	/**
	 * Returns the cfg limit technical spec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfg limit technical spec
	 * @return the cfg limit technical spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a cfg limit technical spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCfgLimitTechnicalSpecException, SystemException {
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec = fetchByPrimaryKey(primaryKey);

		if (cfgLimitTechnicalSpec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCfgLimitTechnicalSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cfgLimitTechnicalSpec;
	}

	/**
	 * Returns the cfg limit technical spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException} if it could not be found.
	 *
	 * @param id the primary key of the cfg limit technical spec
	 * @return the cfg limit technical spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a cfg limit technical spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec findByPrimaryKey(long id)
		throws NoSuchCfgLimitTechnicalSpecException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the cfg limit technical spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfg limit technical spec
	 * @return the cfg limit technical spec, or <code>null</code> if a cfg limit technical spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec = (CfgLimitTechnicalSpec)EntityCacheUtil.getResult(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
				CfgLimitTechnicalSpecImpl.class, primaryKey);

		if (cfgLimitTechnicalSpec == _nullCfgLimitTechnicalSpec) {
			return null;
		}

		if (cfgLimitTechnicalSpec == null) {
			Session session = null;

			try {
				session = openSession();

				cfgLimitTechnicalSpec = (CfgLimitTechnicalSpec)session.get(CfgLimitTechnicalSpecImpl.class,
						primaryKey);

				if (cfgLimitTechnicalSpec != null) {
					cacheResult(cfgLimitTechnicalSpec);
				}
				else {
					EntityCacheUtil.putResult(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
						CfgLimitTechnicalSpecImpl.class, primaryKey,
						_nullCfgLimitTechnicalSpec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CfgLimitTechnicalSpecModelImpl.ENTITY_CACHE_ENABLED,
					CfgLimitTechnicalSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cfgLimitTechnicalSpec;
	}

	/**
	 * Returns the cfg limit technical spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cfg limit technical spec
	 * @return the cfg limit technical spec, or <code>null</code> if a cfg limit technical spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgLimitTechnicalSpec fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the cfg limit technical specs.
	 *
	 * @return the cfg limit technical specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgLimitTechnicalSpec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cfg limit technical specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfg limit technical specs
	 * @param end the upper bound of the range of cfg limit technical specs (not inclusive)
	 * @return the range of cfg limit technical specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgLimitTechnicalSpec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cfg limit technical specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfg limit technical specs
	 * @param end the upper bound of the range of cfg limit technical specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cfg limit technical specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgLimitTechnicalSpec> findAll(int start, int end,
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

		List<CfgLimitTechnicalSpec> list = (List<CfgLimitTechnicalSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CFGLIMITTECHNICALSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CFGLIMITTECHNICALSPEC;

				if (pagination) {
					sql = sql.concat(CfgLimitTechnicalSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CfgLimitTechnicalSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CfgLimitTechnicalSpec>(list);
				}
				else {
					list = (List<CfgLimitTechnicalSpec>)QueryUtil.list(q,
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
	 * Removes all the cfg limit technical specs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CfgLimitTechnicalSpec cfgLimitTechnicalSpec : findAll()) {
			remove(cfgLimitTechnicalSpec);
		}
	}

	/**
	 * Returns the number of cfg limit technical specs.
	 *
	 * @return the number of cfg limit technical specs
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

				Query q = session.createQuery(_SQL_COUNT_CFGLIMITTECHNICALSPEC);

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

	/**
	 * Initializes the cfg limit technical spec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CfgLimitTechnicalSpec>> listenersList = new ArrayList<ModelListener<CfgLimitTechnicalSpec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CfgLimitTechnicalSpec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CfgLimitTechnicalSpecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CFGLIMITTECHNICALSPEC = "SELECT cfgLimitTechnicalSpec FROM CfgLimitTechnicalSpec cfgLimitTechnicalSpec";
	private static final String _SQL_SELECT_CFGLIMITTECHNICALSPEC_WHERE = "SELECT cfgLimitTechnicalSpec FROM CfgLimitTechnicalSpec cfgLimitTechnicalSpec WHERE ";
	private static final String _SQL_COUNT_CFGLIMITTECHNICALSPEC = "SELECT COUNT(cfgLimitTechnicalSpec) FROM CfgLimitTechnicalSpec cfgLimitTechnicalSpec";
	private static final String _SQL_COUNT_CFGLIMITTECHNICALSPEC_WHERE = "SELECT COUNT(cfgLimitTechnicalSpec) FROM CfgLimitTechnicalSpec cfgLimitTechnicalSpec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cfgLimitTechnicalSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CfgLimitTechnicalSpec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CfgLimitTechnicalSpec exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CfgLimitTechnicalSpecPersistenceImpl.class);
	private static CfgLimitTechnicalSpec _nullCfgLimitTechnicalSpec = new CfgLimitTechnicalSpecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CfgLimitTechnicalSpec> toCacheModel() {
				return _nullCfgLimitTechnicalSpecCacheModel;
			}
		};

	private static CacheModel<CfgLimitTechnicalSpec> _nullCfgLimitTechnicalSpecCacheModel =
		new CacheModel<CfgLimitTechnicalSpec>() {
			@Override
			public CfgLimitTechnicalSpec toEntityModel() {
				return _nullCfgLimitTechnicalSpec;
			}
		};
}