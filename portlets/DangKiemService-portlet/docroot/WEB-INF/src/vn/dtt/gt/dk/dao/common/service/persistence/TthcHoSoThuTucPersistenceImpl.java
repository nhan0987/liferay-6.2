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

import vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc ho so thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see TthcHoSoThuTucPersistence
 * @see TthcHoSoThuTucUtil
 * @generated
 */
public class TthcHoSoThuTucPersistenceImpl extends BasePersistenceImpl<TthcHoSoThuTuc>
	implements TthcHoSoThuTucPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcHoSoThuTucUtil} to access the tthc ho so thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcHoSoThuTucImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_MASOHOSO = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaSoHoSo", new String[] { String.class.getName() },
			TthcHoSoThuTucModelImpl.MASOHOSO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MASOHOSO = new FinderPath(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaSoHoSo",
			new String[] { String.class.getName() });

	/**
	 * Returns the tthc ho so thu tuc where MaSoHoSo = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	 *
	 * @param MaSoHoSo the ma so ho so
	 * @return the matching tthc ho so thu tuc
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByMaSoHoSo(String MaSoHoSo)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByMaSoHoSo(MaSoHoSo);

		if (tthcHoSoThuTuc == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("MaSoHoSo=");
			msg.append(MaSoHoSo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcHoSoThuTucException(msg.toString());
		}

		return tthcHoSoThuTuc;
	}

	/**
	 * Returns the tthc ho so thu tuc where MaSoHoSo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param MaSoHoSo the ma so ho so
	 * @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByMaSoHoSo(String MaSoHoSo)
		throws SystemException {
		return fetchByMaSoHoSo(MaSoHoSo, true);
	}

	/**
	 * Returns the tthc ho so thu tuc where MaSoHoSo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param MaSoHoSo the ma so ho so
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByMaSoHoSo(String MaSoHoSo,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { MaSoHoSo };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MASOHOSO,
					finderArgs, this);
		}

		if (result instanceof TthcHoSoThuTuc) {
			TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)result;

			if (!Validator.equals(MaSoHoSo, tthcHoSoThuTuc.getMaSoHoSo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCHOSOTHUTUC_WHERE);

			boolean bindMaSoHoSo = false;

			if (MaSoHoSo == null) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_1);
			}
			else if (MaSoHoSo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_3);
			}
			else {
				bindMaSoHoSo = true;

				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaSoHoSo) {
					qPos.add(MaSoHoSo);
				}

				List<TthcHoSoThuTuc> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcHoSoThuTucPersistenceImpl.fetchByMaSoHoSo(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcHoSoThuTuc tthcHoSoThuTuc = list.get(0);

					result = tthcHoSoThuTuc;

					cacheResult(tthcHoSoThuTuc);

					if ((tthcHoSoThuTuc.getMaSoHoSo() == null) ||
							!tthcHoSoThuTuc.getMaSoHoSo().equals(MaSoHoSo)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
							finderArgs, tthcHoSoThuTuc);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO,
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
			return (TthcHoSoThuTuc)result;
		}
	}

	/**
	 * Removes the tthc ho so thu tuc where MaSoHoSo = &#63; from the database.
	 *
	 * @param MaSoHoSo the ma so ho so
	 * @return the tthc ho so thu tuc that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc removeByMaSoHoSo(String MaSoHoSo)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = findByMaSoHoSo(MaSoHoSo);

		return remove(tthcHoSoThuTuc);
	}

	/**
	 * Returns the number of tthc ho so thu tucs where MaSoHoSo = &#63;.
	 *
	 * @param MaSoHoSo the ma so ho so
	 * @return the number of matching tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaSoHoSo(String MaSoHoSo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MASOHOSO;

		Object[] finderArgs = new Object[] { MaSoHoSo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCHOSOTHUTUC_WHERE);

			boolean bindMaSoHoSo = false;

			if (MaSoHoSo == null) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_1);
			}
			else if (MaSoHoSo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_3);
			}
			else {
				bindMaSoHoSo = true;

				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaSoHoSo) {
					qPos.add(MaSoHoSo);
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

	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_1 = "tthcHoSoThuTuc.MaSoHoSo IS NULL";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_2 = "tthcHoSoThuTuc.MaSoHoSo = ?";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_3 = "(tthcHoSoThuTuc.MaSoHoSo IS NULL OR tthcHoSoThuTuc.MaSoHoSo = '')";

	public TthcHoSoThuTucPersistenceImpl() {
		setModelClass(TthcHoSoThuTuc.class);
	}

	/**
	 * Caches the tthc ho so thu tuc in the entity cache if it is enabled.
	 *
	 * @param tthcHoSoThuTuc the tthc ho so thu tuc
	 */
	@Override
	public void cacheResult(TthcHoSoThuTuc tthcHoSoThuTuc) {
		EntityCacheUtil.putResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey(),
			tthcHoSoThuTuc);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO,
			new Object[] { tthcHoSoThuTuc.getMaSoHoSo() }, tthcHoSoThuTuc);

		tthcHoSoThuTuc.resetOriginalValues();
	}

	/**
	 * Caches the tthc ho so thu tucs in the entity cache if it is enabled.
	 *
	 * @param tthcHoSoThuTucs the tthc ho so thu tucs
	 */
	@Override
	public void cacheResult(List<TthcHoSoThuTuc> tthcHoSoThuTucs) {
		for (TthcHoSoThuTuc tthcHoSoThuTuc : tthcHoSoThuTucs) {
			if (EntityCacheUtil.getResult(
						TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey()) == null) {
				cacheResult(tthcHoSoThuTuc);
			}
			else {
				tthcHoSoThuTuc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc ho so thu tucs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcHoSoThuTucImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcHoSoThuTucImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc ho so thu tuc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcHoSoThuTuc tthcHoSoThuTuc) {
		EntityCacheUtil.removeResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcHoSoThuTuc);
	}

	@Override
	public void clearCache(List<TthcHoSoThuTuc> tthcHoSoThuTucs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcHoSoThuTuc tthcHoSoThuTuc : tthcHoSoThuTucs) {
			EntityCacheUtil.removeResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey());

			clearUniqueFindersCache(tthcHoSoThuTuc);
		}
	}

	protected void cacheUniqueFindersCache(TthcHoSoThuTuc tthcHoSoThuTuc) {
		if (tthcHoSoThuTuc.isNew()) {
			Object[] args = new Object[] { tthcHoSoThuTuc.getMaSoHoSo() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASOHOSO, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO, args,
				tthcHoSoThuTuc);
		}
		else {
			TthcHoSoThuTucModelImpl tthcHoSoThuTucModelImpl = (TthcHoSoThuTucModelImpl)tthcHoSoThuTuc;

			if ((tthcHoSoThuTucModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MASOHOSO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tthcHoSoThuTuc.getMaSoHoSo() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MASOHOSO, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MASOHOSO, args,
					tthcHoSoThuTuc);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcHoSoThuTuc tthcHoSoThuTuc) {
		TthcHoSoThuTucModelImpl tthcHoSoThuTucModelImpl = (TthcHoSoThuTucModelImpl)tthcHoSoThuTuc;

		Object[] args = new Object[] { tthcHoSoThuTuc.getMaSoHoSo() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO, args);

		if ((tthcHoSoThuTucModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MASOHOSO.getColumnBitmask()) != 0) {
			args = new Object[] { tthcHoSoThuTucModelImpl.getOriginalMaSoHoSo() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MASOHOSO, args);
		}
	}

	/**
	 * Creates a new tthc ho so thu tuc with the primary key. Does not add the tthc ho so thu tuc to the database.
	 *
	 * @param Id the primary key for the new tthc ho so thu tuc
	 * @return the new tthc ho so thu tuc
	 */
	@Override
	public TthcHoSoThuTuc create(long Id) {
		TthcHoSoThuTuc tthcHoSoThuTuc = new TthcHoSoThuTucImpl();

		tthcHoSoThuTuc.setNew(true);
		tthcHoSoThuTuc.setPrimaryKey(Id);

		return tthcHoSoThuTuc;
	}

	/**
	 * Removes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc remove(long Id)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc remove(Serializable primaryKey)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)session.get(TthcHoSoThuTucImpl.class,
					primaryKey);

			if (tthcHoSoThuTuc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcHoSoThuTuc);
		}
		catch (NoSuchTthcHoSoThuTucException nsee) {
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
	protected TthcHoSoThuTuc removeImpl(TthcHoSoThuTuc tthcHoSoThuTuc)
		throws SystemException {
		tthcHoSoThuTuc = toUnwrappedModel(tthcHoSoThuTuc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcHoSoThuTuc)) {
				tthcHoSoThuTuc = (TthcHoSoThuTuc)session.get(TthcHoSoThuTucImpl.class,
						tthcHoSoThuTuc.getPrimaryKeyObj());
			}

			if (tthcHoSoThuTuc != null) {
				session.delete(tthcHoSoThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcHoSoThuTuc != null) {
			clearCache(tthcHoSoThuTuc);
		}

		return tthcHoSoThuTuc;
	}

	@Override
	public TthcHoSoThuTuc updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws SystemException {
		tthcHoSoThuTuc = toUnwrappedModel(tthcHoSoThuTuc);

		boolean isNew = tthcHoSoThuTuc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tthcHoSoThuTuc.isNew()) {
				session.save(tthcHoSoThuTuc);

				tthcHoSoThuTuc.setNew(false);
			}
			else {
				session.merge(tthcHoSoThuTuc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcHoSoThuTucModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
			TthcHoSoThuTucImpl.class, tthcHoSoThuTuc.getPrimaryKey(),
			tthcHoSoThuTuc);

		clearUniqueFindersCache(tthcHoSoThuTuc);
		cacheUniqueFindersCache(tthcHoSoThuTuc);

		return tthcHoSoThuTuc;
	}

	protected TthcHoSoThuTuc toUnwrappedModel(TthcHoSoThuTuc tthcHoSoThuTuc) {
		if (tthcHoSoThuTuc instanceof TthcHoSoThuTucImpl) {
			return tthcHoSoThuTuc;
		}

		TthcHoSoThuTucImpl tthcHoSoThuTucImpl = new TthcHoSoThuTucImpl();

		tthcHoSoThuTucImpl.setNew(tthcHoSoThuTuc.isNew());
		tthcHoSoThuTucImpl.setPrimaryKey(tthcHoSoThuTuc.getPrimaryKey());

		tthcHoSoThuTucImpl.setId(tthcHoSoThuTuc.getId());
		tthcHoSoThuTucImpl.setMaSoHoSo(tthcHoSoThuTuc.getMaSoHoSo());
		tthcHoSoThuTucImpl.setMaBienNhan(tthcHoSoThuTuc.getMaBienNhan());
		tthcHoSoThuTucImpl.setThuTucHanhChinhId(tthcHoSoThuTuc.getThuTucHanhChinhId());
		tthcHoSoThuTucImpl.setLoaiChuHoSo(tthcHoSoThuTuc.getLoaiChuHoSo());
		tthcHoSoThuTucImpl.setMaSoChuHoSo(tthcHoSoThuTuc.getMaSoChuHoSo());
		tthcHoSoThuTucImpl.setTenChuHoSo(tthcHoSoThuTuc.getTenChuHoSo());
		tthcHoSoThuTucImpl.setDiaChiChuHoSo(tthcHoSoThuTuc.getDiaChiChuHoSo());
		tthcHoSoThuTucImpl.setTrichYeuNoiDung(tthcHoSoThuTuc.getTrichYeuNoiDung());
		tthcHoSoThuTucImpl.setNgayGuiHoSo(tthcHoSoThuTuc.getNgayGuiHoSo());
		tthcHoSoThuTucImpl.setNgayTiepNhan(tthcHoSoThuTuc.getNgayTiepNhan());
		tthcHoSoThuTucImpl.setNgayBoSung(tthcHoSoThuTuc.getNgayBoSung());
		tthcHoSoThuTucImpl.setNgayHenTra(tthcHoSoThuTuc.getNgayHenTra());
		tthcHoSoThuTucImpl.setNgayTraKetQua(tthcHoSoThuTuc.getNgayTraKetQua());
		tthcHoSoThuTucImpl.setNgayDongHoSo(tthcHoSoThuTuc.getNgayDongHoSo());
		tthcHoSoThuTucImpl.setTrangThaiHoSo(tthcHoSoThuTuc.getTrangThaiHoSo());
		tthcHoSoThuTucImpl.setPhanNhomHoSoId(tthcHoSoThuTuc.getPhanNhomHoSoId());
		tthcHoSoThuTucImpl.setMaDonViTiepNhan(tthcHoSoThuTuc.getMaDonViTiepNhan());
		tthcHoSoThuTucImpl.setTenDonViTiepNhan(tthcHoSoThuTuc.getTenDonViTiepNhan());
		tthcHoSoThuTucImpl.setToChucQuanLy(tthcHoSoThuTuc.getToChucQuanLy());
		tthcHoSoThuTucImpl.setNgayTao(tthcHoSoThuTuc.getNgayTao());
		tthcHoSoThuTucImpl.setNguoiTao(tthcHoSoThuTuc.getNguoiTao());
		tthcHoSoThuTucImpl.setGhiChu(tthcHoSoThuTuc.getGhiChu());
		tthcHoSoThuTucImpl.setLanGuiCuoi(tthcHoSoThuTuc.getLanGuiCuoi());
		tthcHoSoThuTucImpl.setSynchdate(tthcHoSoThuTuc.getSynchdate());

		return tthcHoSoThuTucImpl;
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = fetchByPrimaryKey(primaryKey);

		if (tthcHoSoThuTuc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcHoSoThuTucException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcHoSoThuTuc;
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	 *
	 * @param Id the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc findByPrimaryKey(long Id)
		throws NoSuchTthcHoSoThuTucException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc, or <code>null</code> if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = (TthcHoSoThuTuc)EntityCacheUtil.getResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
				TthcHoSoThuTucImpl.class, primaryKey);

		if (tthcHoSoThuTuc == _nullTthcHoSoThuTuc) {
			return null;
		}

		if (tthcHoSoThuTuc == null) {
			Session session = null;

			try {
				session = openSession();

				tthcHoSoThuTuc = (TthcHoSoThuTuc)session.get(TthcHoSoThuTucImpl.class,
						primaryKey);

				if (tthcHoSoThuTuc != null) {
					cacheResult(tthcHoSoThuTuc);
				}
				else {
					EntityCacheUtil.putResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
						TthcHoSoThuTucImpl.class, primaryKey,
						_nullTthcHoSoThuTuc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcHoSoThuTucModelImpl.ENTITY_CACHE_ENABLED,
					TthcHoSoThuTucImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcHoSoThuTuc;
	}

	/**
	 * Returns the tthc ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the tthc ho so thu tuc
	 * @return the tthc ho so thu tuc, or <code>null</code> if a tthc ho so thu tuc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcHoSoThuTuc fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the tthc ho so thu tucs.
	 *
	 * @return the tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @return the range of tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc ho so thu tucs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc ho so thu tucs
	 * @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc ho so thu tucs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcHoSoThuTuc> findAll(int start, int end,
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

		List<TthcHoSoThuTuc> list = (List<TthcHoSoThuTuc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCHOSOTHUTUC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCHOSOTHUTUC;

				if (pagination) {
					sql = sql.concat(TthcHoSoThuTucModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcHoSoThuTuc>(list);
				}
				else {
					list = (List<TthcHoSoThuTuc>)QueryUtil.list(q,
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
	 * Removes all the tthc ho so thu tucs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcHoSoThuTuc tthcHoSoThuTuc : findAll()) {
			remove(tthcHoSoThuTuc);
		}
	}

	/**
	 * Returns the number of tthc ho so thu tucs.
	 *
	 * @return the number of tthc ho so thu tucs
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

				Query q = session.createQuery(_SQL_COUNT_TTHCHOSOTHUTUC);

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
	 * Initializes the tthc ho so thu tuc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcHoSoThuTuc>> listenersList = new ArrayList<ModelListener<TthcHoSoThuTuc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcHoSoThuTuc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcHoSoThuTucImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCHOSOTHUTUC = "SELECT tthcHoSoThuTuc FROM TthcHoSoThuTuc tthcHoSoThuTuc";
	private static final String _SQL_SELECT_TTHCHOSOTHUTUC_WHERE = "SELECT tthcHoSoThuTuc FROM TthcHoSoThuTuc tthcHoSoThuTuc WHERE ";
	private static final String _SQL_COUNT_TTHCHOSOTHUTUC = "SELECT COUNT(tthcHoSoThuTuc) FROM TthcHoSoThuTuc tthcHoSoThuTuc";
	private static final String _SQL_COUNT_TTHCHOSOTHUTUC_WHERE = "SELECT COUNT(tthcHoSoThuTuc) FROM TthcHoSoThuTuc tthcHoSoThuTuc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcHoSoThuTuc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcHoSoThuTuc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcHoSoThuTuc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcHoSoThuTucPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "MaSoHoSo", "MaBienNhan", "ThuTucHanhChinhId",
				"LoaiChuHoSo", "MaSoChuHoSo", "TenChuHoSo", "DiaChiChuHoSo",
				"TrichYeuNoiDung", "NgayGuiHoSo", "NgayTiepNhan", "NgayBoSung",
				"NgayHenTra", "NgayTraKetQua", "NgayDongHoSo", "TrangThaiHoSo",
				"PhanNhomHoSoId", "MaDonViTiepNhan", "TenDonViTiepNhan",
				"ToChucQuanLy", "NgayTao", "NguoiTao", "ghiChu", "lanGuiCuoi"
			});
	private static TthcHoSoThuTuc _nullTthcHoSoThuTuc = new TthcHoSoThuTucImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcHoSoThuTuc> toCacheModel() {
				return _nullTthcHoSoThuTucCacheModel;
			}
		};

	private static CacheModel<TthcHoSoThuTuc> _nullTthcHoSoThuTucCacheModel = new CacheModel<TthcHoSoThuTuc>() {
			@Override
			public TthcHoSoThuTuc toEntityModel() {
				return _nullTthcHoSoThuTuc;
			}
		};
}