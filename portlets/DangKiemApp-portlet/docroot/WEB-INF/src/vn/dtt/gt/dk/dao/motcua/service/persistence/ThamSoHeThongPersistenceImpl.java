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

import vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException;
import vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong;
import vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tham so he thong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ThamSoHeThongPersistence
 * @see ThamSoHeThongUtil
 * @generated
 */
public class ThamSoHeThongPersistenceImpl extends BasePersistenceImpl<ThamSoHeThong>
	implements ThamSoHeThongPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ThamSoHeThongUtil} to access the tham so he thong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ThamSoHeThongImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED,
			ThamSoHeThongImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED,
			ThamSoHeThongImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_KEYDATA = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED,
			ThamSoHeThongImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByKeyData", new String[] { String.class.getName() },
			ThamSoHeThongModelImpl.KEYDATA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEYDATA = new FinderPath(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKeyData",
			new String[] { String.class.getName() });

	/**
	 * Returns the tham so he thong where keyData = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException} if it could not be found.
	 *
	 * @param keyData the key data
	 * @return the matching tham so he thong
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong findByKeyData(String keyData)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = fetchByKeyData(keyData);

		if (thamSoHeThong == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("keyData=");
			msg.append(keyData);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchThamSoHeThongException(msg.toString());
		}

		return thamSoHeThong;
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param keyData the key data
	 * @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong fetchByKeyData(String keyData)
		throws SystemException {
		return fetchByKeyData(keyData, true);
	}

	/**
	 * Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param keyData the key data
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong fetchByKeyData(String keyData,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { keyData };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_KEYDATA,
					finderArgs, this);
		}

		if (result instanceof ThamSoHeThong) {
			ThamSoHeThong thamSoHeThong = (ThamSoHeThong)result;

			if (!Validator.equals(keyData, thamSoHeThong.getKeyData())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_THAMSOHETHONG_WHERE);

			boolean bindKeyData = false;

			if (keyData == null) {
				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_1);
			}
			else if (keyData.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_3);
			}
			else {
				bindKeyData = true;

				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKeyData) {
					qPos.add(keyData);
				}

				List<ThamSoHeThong> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ThamSoHeThongPersistenceImpl.fetchByKeyData(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ThamSoHeThong thamSoHeThong = list.get(0);

					result = thamSoHeThong;

					cacheResult(thamSoHeThong);

					if ((thamSoHeThong.getKeyData() == null) ||
							!thamSoHeThong.getKeyData().equals(keyData)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
							finderArgs, thamSoHeThong);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATA,
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
			return (ThamSoHeThong)result;
		}
	}

	/**
	 * Removes the tham so he thong where keyData = &#63; from the database.
	 *
	 * @param keyData the key data
	 * @return the tham so he thong that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong removeByKeyData(String keyData)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = findByKeyData(keyData);

		return remove(thamSoHeThong);
	}

	/**
	 * Returns the number of tham so he thongs where keyData = &#63;.
	 *
	 * @param keyData the key data
	 * @return the number of matching tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByKeyData(String keyData) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KEYDATA;

		Object[] finderArgs = new Object[] { keyData };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THAMSOHETHONG_WHERE);

			boolean bindKeyData = false;

			if (keyData == null) {
				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_1);
			}
			else if (keyData.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_3);
			}
			else {
				bindKeyData = true;

				query.append(_FINDER_COLUMN_KEYDATA_KEYDATA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKeyData) {
					qPos.add(keyData);
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

	private static final String _FINDER_COLUMN_KEYDATA_KEYDATA_1 = "thamSoHeThong.keyData IS NULL";
	private static final String _FINDER_COLUMN_KEYDATA_KEYDATA_2 = "thamSoHeThong.keyData = ?";
	private static final String _FINDER_COLUMN_KEYDATA_KEYDATA_3 = "(thamSoHeThong.keyData IS NULL OR thamSoHeThong.keyData = '')";

	public ThamSoHeThongPersistenceImpl() {
		setModelClass(ThamSoHeThong.class);
	}

	/**
	 * Caches the tham so he thong in the entity cache if it is enabled.
	 *
	 * @param thamSoHeThong the tham so he thong
	 */
	@Override
	public void cacheResult(ThamSoHeThong thamSoHeThong) {
		EntityCacheUtil.putResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey(),
			thamSoHeThong);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA,
			new Object[] { thamSoHeThong.getKeyData() }, thamSoHeThong);

		thamSoHeThong.resetOriginalValues();
	}

	/**
	 * Caches the tham so he thongs in the entity cache if it is enabled.
	 *
	 * @param thamSoHeThongs the tham so he thongs
	 */
	@Override
	public void cacheResult(List<ThamSoHeThong> thamSoHeThongs) {
		for (ThamSoHeThong thamSoHeThong : thamSoHeThongs) {
			if (EntityCacheUtil.getResult(
						ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
						ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey()) == null) {
				cacheResult(thamSoHeThong);
			}
			else {
				thamSoHeThong.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tham so he thongs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ThamSoHeThongImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ThamSoHeThongImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tham so he thong.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThamSoHeThong thamSoHeThong) {
		EntityCacheUtil.removeResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(thamSoHeThong);
	}

	@Override
	public void clearCache(List<ThamSoHeThong> thamSoHeThongs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ThamSoHeThong thamSoHeThong : thamSoHeThongs) {
			EntityCacheUtil.removeResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
				ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey());

			clearUniqueFindersCache(thamSoHeThong);
		}
	}

	protected void cacheUniqueFindersCache(ThamSoHeThong thamSoHeThong) {
		if (thamSoHeThong.isNew()) {
			Object[] args = new Object[] { thamSoHeThong.getKeyData() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KEYDATA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA, args,
				thamSoHeThong);
		}
		else {
			ThamSoHeThongModelImpl thamSoHeThongModelImpl = (ThamSoHeThongModelImpl)thamSoHeThong;

			if ((thamSoHeThongModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_KEYDATA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { thamSoHeThong.getKeyData() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_KEYDATA, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_KEYDATA, args,
					thamSoHeThong);
			}
		}
	}

	protected void clearUniqueFindersCache(ThamSoHeThong thamSoHeThong) {
		ThamSoHeThongModelImpl thamSoHeThongModelImpl = (ThamSoHeThongModelImpl)thamSoHeThong;

		Object[] args = new Object[] { thamSoHeThong.getKeyData() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYDATA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATA, args);

		if ((thamSoHeThongModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_KEYDATA.getColumnBitmask()) != 0) {
			args = new Object[] { thamSoHeThongModelImpl.getOriginalKeyData() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KEYDATA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_KEYDATA, args);
		}
	}

	/**
	 * Creates a new tham so he thong with the primary key. Does not add the tham so he thong to the database.
	 *
	 * @param id the primary key for the new tham so he thong
	 * @return the new tham so he thong
	 */
	@Override
	public ThamSoHeThong create(long id) {
		ThamSoHeThong thamSoHeThong = new ThamSoHeThongImpl();

		thamSoHeThong.setNew(true);
		thamSoHeThong.setPrimaryKey(id);

		return thamSoHeThong;
	}

	/**
	 * Removes the tham so he thong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tham so he thong
	 * @return the tham so he thong that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong remove(long id)
		throws NoSuchThamSoHeThongException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tham so he thong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tham so he thong
	 * @return the tham so he thong that was removed
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong remove(Serializable primaryKey)
		throws NoSuchThamSoHeThongException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ThamSoHeThong thamSoHeThong = (ThamSoHeThong)session.get(ThamSoHeThongImpl.class,
					primaryKey);

			if (thamSoHeThong == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThamSoHeThongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thamSoHeThong);
		}
		catch (NoSuchThamSoHeThongException nsee) {
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
	protected ThamSoHeThong removeImpl(ThamSoHeThong thamSoHeThong)
		throws SystemException {
		thamSoHeThong = toUnwrappedModel(thamSoHeThong);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thamSoHeThong)) {
				thamSoHeThong = (ThamSoHeThong)session.get(ThamSoHeThongImpl.class,
						thamSoHeThong.getPrimaryKeyObj());
			}

			if (thamSoHeThong != null) {
				session.delete(thamSoHeThong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thamSoHeThong != null) {
			clearCache(thamSoHeThong);
		}

		return thamSoHeThong;
	}

	@Override
	public ThamSoHeThong updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong thamSoHeThong)
		throws SystemException {
		thamSoHeThong = toUnwrappedModel(thamSoHeThong);

		boolean isNew = thamSoHeThong.isNew();

		Session session = null;

		try {
			session = openSession();

			if (thamSoHeThong.isNew()) {
				session.save(thamSoHeThong);

				thamSoHeThong.setNew(false);
			}
			else {
				session.merge(thamSoHeThong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ThamSoHeThongModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
			ThamSoHeThongImpl.class, thamSoHeThong.getPrimaryKey(),
			thamSoHeThong);

		clearUniqueFindersCache(thamSoHeThong);
		cacheUniqueFindersCache(thamSoHeThong);

		return thamSoHeThong;
	}

	protected ThamSoHeThong toUnwrappedModel(ThamSoHeThong thamSoHeThong) {
		if (thamSoHeThong instanceof ThamSoHeThongImpl) {
			return thamSoHeThong;
		}

		ThamSoHeThongImpl thamSoHeThongImpl = new ThamSoHeThongImpl();

		thamSoHeThongImpl.setNew(thamSoHeThong.isNew());
		thamSoHeThongImpl.setPrimaryKey(thamSoHeThong.getPrimaryKey());

		thamSoHeThongImpl.setId(thamSoHeThong.getId());
		thamSoHeThongImpl.setValueData(thamSoHeThong.getValueData());
		thamSoHeThongImpl.setKeyData(thamSoHeThong.getKeyData());
		thamSoHeThongImpl.setDescription(thamSoHeThong.getDescription());

		return thamSoHeThongImpl;
	}

	/**
	 * Returns the tham so he thong with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tham so he thong
	 * @return the tham so he thong
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong findByPrimaryKey(Serializable primaryKey)
		throws NoSuchThamSoHeThongException, SystemException {
		ThamSoHeThong thamSoHeThong = fetchByPrimaryKey(primaryKey);

		if (thamSoHeThong == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchThamSoHeThongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thamSoHeThong;
	}

	/**
	 * Returns the tham so he thong with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException} if it could not be found.
	 *
	 * @param id the primary key of the tham so he thong
	 * @return the tham so he thong
	 * @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong findByPrimaryKey(long id)
		throws NoSuchThamSoHeThongException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tham so he thong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tham so he thong
	 * @return the tham so he thong, or <code>null</code> if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ThamSoHeThong thamSoHeThong = (ThamSoHeThong)EntityCacheUtil.getResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
				ThamSoHeThongImpl.class, primaryKey);

		if (thamSoHeThong == _nullThamSoHeThong) {
			return null;
		}

		if (thamSoHeThong == null) {
			Session session = null;

			try {
				session = openSession();

				thamSoHeThong = (ThamSoHeThong)session.get(ThamSoHeThongImpl.class,
						primaryKey);

				if (thamSoHeThong != null) {
					cacheResult(thamSoHeThong);
				}
				else {
					EntityCacheUtil.putResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
						ThamSoHeThongImpl.class, primaryKey, _nullThamSoHeThong);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ThamSoHeThongModelImpl.ENTITY_CACHE_ENABLED,
					ThamSoHeThongImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thamSoHeThong;
	}

	/**
	 * Returns the tham so he thong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tham so he thong
	 * @return the tham so he thong, or <code>null</code> if a tham so he thong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThamSoHeThong fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tham so he thongs.
	 *
	 * @return the tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThamSoHeThong> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tham so he thongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tham so he thongs
	 * @param end the upper bound of the range of tham so he thongs (not inclusive)
	 * @return the range of tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThamSoHeThong> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tham so he thongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tham so he thongs
	 * @param end the upper bound of the range of tham so he thongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tham so he thongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThamSoHeThong> findAll(int start, int end,
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

		List<ThamSoHeThong> list = (List<ThamSoHeThong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THAMSOHETHONG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THAMSOHETHONG;

				if (pagination) {
					sql = sql.concat(ThamSoHeThongModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ThamSoHeThong>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThamSoHeThong>(list);
				}
				else {
					list = (List<ThamSoHeThong>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tham so he thongs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ThamSoHeThong thamSoHeThong : findAll()) {
			remove(thamSoHeThong);
		}
	}

	/**
	 * Returns the number of tham so he thongs.
	 *
	 * @return the number of tham so he thongs
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

				Query q = session.createQuery(_SQL_COUNT_THAMSOHETHONG);

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
	 * Initializes the tham so he thong persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ThamSoHeThong>> listenersList = new ArrayList<ModelListener<ThamSoHeThong>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ThamSoHeThong>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ThamSoHeThongImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THAMSOHETHONG = "SELECT thamSoHeThong FROM ThamSoHeThong thamSoHeThong";
	private static final String _SQL_SELECT_THAMSOHETHONG_WHERE = "SELECT thamSoHeThong FROM ThamSoHeThong thamSoHeThong WHERE ";
	private static final String _SQL_COUNT_THAMSOHETHONG = "SELECT COUNT(thamSoHeThong) FROM ThamSoHeThong thamSoHeThong";
	private static final String _SQL_COUNT_THAMSOHETHONG_WHERE = "SELECT COUNT(thamSoHeThong) FROM ThamSoHeThong thamSoHeThong WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thamSoHeThong.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ThamSoHeThong exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ThamSoHeThong exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ThamSoHeThongPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"valueData", "keyData"
			});
	private static ThamSoHeThong _nullThamSoHeThong = new ThamSoHeThongImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ThamSoHeThong> toCacheModel() {
				return _nullThamSoHeThongCacheModel;
			}
		};

	private static CacheModel<ThamSoHeThong> _nullThamSoHeThongCacheModel = new CacheModel<ThamSoHeThong>() {
			@Override
			public ThamSoHeThong toEntityModel() {
				return _nullThamSoHeThong;
			}
		};
}