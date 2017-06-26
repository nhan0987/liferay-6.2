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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the draft certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DraftCertificatePersistence
 * @see DraftCertificateUtil
 * @generated
 */
public class DraftCertificatePersistenceImpl extends BasePersistenceImpl<DraftCertificate>
	implements DraftCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DraftCertificateUtil} to access the draft certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DraftCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateModelImpl.FINDER_CACHE_ENABLED,
			DraftCertificateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateModelImpl.FINDER_CACHE_ENABLED,
			DraftCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTIONREPORTID = new FinderPath(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateModelImpl.FINDER_CACHE_ENABLED,
			DraftCertificateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectionReportId", new String[] { Long.class.getName() },
			DraftCertificateModelImpl.INSPECTIONREPORTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONREPORTID = new FinderPath(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionReportId", new String[] { Long.class.getName() });

	/**
	 * Returns the draft certificate where inspectionReportId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException} if it could not be found.
	 *
	 * @param inspectionReportId the inspection report ID
	 * @return the matching draft certificate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a matching draft certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate findByInspectionReportId(long inspectionReportId)
		throws NoSuchDraftCertificateException, SystemException {
		DraftCertificate draftCertificate = fetchByInspectionReportId(inspectionReportId);

		if (draftCertificate == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectionReportId=");
			msg.append(inspectionReportId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDraftCertificateException(msg.toString());
		}

		return draftCertificate;
	}

	/**
	 * Returns the draft certificate where inspectionReportId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectionReportId the inspection report ID
	 * @return the matching draft certificate, or <code>null</code> if a matching draft certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate fetchByInspectionReportId(long inspectionReportId)
		throws SystemException {
		return fetchByInspectionReportId(inspectionReportId, true);
	}

	/**
	 * Returns the draft certificate where inspectionReportId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectionReportId the inspection report ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching draft certificate, or <code>null</code> if a matching draft certificate could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate fetchByInspectionReportId(long inspectionReportId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { inspectionReportId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
					finderArgs, this);
		}

		if (result instanceof DraftCertificate) {
			DraftCertificate draftCertificate = (DraftCertificate)result;

			if ((inspectionReportId != draftCertificate.getInspectionReportId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DRAFTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONREPORTID_INSPECTIONREPORTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionReportId);

				List<DraftCertificate> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DraftCertificatePersistenceImpl.fetchByInspectionReportId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DraftCertificate draftCertificate = list.get(0);

					result = draftCertificate;

					cacheResult(draftCertificate);

					if ((draftCertificate.getInspectionReportId() != inspectionReportId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
							finderArgs, draftCertificate);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
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
			return (DraftCertificate)result;
		}
	}

	/**
	 * Removes the draft certificate where inspectionReportId = &#63; from the database.
	 *
	 * @param inspectionReportId the inspection report ID
	 * @return the draft certificate that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate removeByInspectionReportId(long inspectionReportId)
		throws NoSuchDraftCertificateException, SystemException {
		DraftCertificate draftCertificate = findByInspectionReportId(inspectionReportId);

		return remove(draftCertificate);
	}

	/**
	 * Returns the number of draft certificates where inspectionReportId = &#63;.
	 *
	 * @param inspectionReportId the inspection report ID
	 * @return the number of matching draft certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionReportId(long inspectionReportId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONREPORTID;

		Object[] finderArgs = new Object[] { inspectionReportId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DRAFTCERTIFICATE_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONREPORTID_INSPECTIONREPORTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionReportId);

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

	private static final String _FINDER_COLUMN_INSPECTIONREPORTID_INSPECTIONREPORTID_2 =
		"draftCertificate.inspectionReportId = ?";

	public DraftCertificatePersistenceImpl() {
		setModelClass(DraftCertificate.class);
	}

	/**
	 * Caches the draft certificate in the entity cache if it is enabled.
	 *
	 * @param draftCertificate the draft certificate
	 */
	@Override
	public void cacheResult(DraftCertificate draftCertificate) {
		EntityCacheUtil.putResult(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateImpl.class, draftCertificate.getPrimaryKey(),
			draftCertificate);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
			new Object[] { draftCertificate.getInspectionReportId() },
			draftCertificate);

		draftCertificate.resetOriginalValues();
	}

	/**
	 * Caches the draft certificates in the entity cache if it is enabled.
	 *
	 * @param draftCertificates the draft certificates
	 */
	@Override
	public void cacheResult(List<DraftCertificate> draftCertificates) {
		for (DraftCertificate draftCertificate : draftCertificates) {
			if (EntityCacheUtil.getResult(
						DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
						DraftCertificateImpl.class,
						draftCertificate.getPrimaryKey()) == null) {
				cacheResult(draftCertificate);
			}
			else {
				draftCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all draft certificates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DraftCertificateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DraftCertificateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the draft certificate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DraftCertificate draftCertificate) {
		EntityCacheUtil.removeResult(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateImpl.class, draftCertificate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(draftCertificate);
	}

	@Override
	public void clearCache(List<DraftCertificate> draftCertificates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DraftCertificate draftCertificate : draftCertificates) {
			EntityCacheUtil.removeResult(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
				DraftCertificateImpl.class, draftCertificate.getPrimaryKey());

			clearUniqueFindersCache(draftCertificate);
		}
	}

	protected void cacheUniqueFindersCache(DraftCertificate draftCertificate) {
		if (draftCertificate.isNew()) {
			Object[] args = new Object[] {
					draftCertificate.getInspectionReportId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONREPORTID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
				args, draftCertificate);
		}
		else {
			DraftCertificateModelImpl draftCertificateModelImpl = (DraftCertificateModelImpl)draftCertificate;

			if ((draftCertificateModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTIONREPORTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						draftCertificate.getInspectionReportId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONREPORTID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
					args, draftCertificate);
			}
		}
	}

	protected void clearUniqueFindersCache(DraftCertificate draftCertificate) {
		DraftCertificateModelImpl draftCertificateModelImpl = (DraftCertificateModelImpl)draftCertificate;

		Object[] args = new Object[] { draftCertificate.getInspectionReportId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONREPORTID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
			args);

		if ((draftCertificateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTIONREPORTID.getColumnBitmask()) != 0) {
			args = new Object[] {
					draftCertificateModelImpl.getOriginalInspectionReportId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONREPORTID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONREPORTID,
				args);
		}
	}

	/**
	 * Creates a new draft certificate with the primary key. Does not add the draft certificate to the database.
	 *
	 * @param id the primary key for the new draft certificate
	 * @return the new draft certificate
	 */
	@Override
	public DraftCertificate create(long id) {
		DraftCertificate draftCertificate = new DraftCertificateImpl();

		draftCertificate.setNew(true);
		draftCertificate.setPrimaryKey(id);

		return draftCertificate;
	}

	/**
	 * Removes the draft certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the draft certificate
	 * @return the draft certificate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate remove(long id)
		throws NoSuchDraftCertificateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the draft certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the draft certificate
	 * @return the draft certificate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate remove(Serializable primaryKey)
		throws NoSuchDraftCertificateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DraftCertificate draftCertificate = (DraftCertificate)session.get(DraftCertificateImpl.class,
					primaryKey);

			if (draftCertificate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDraftCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(draftCertificate);
		}
		catch (NoSuchDraftCertificateException nsee) {
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
	protected DraftCertificate removeImpl(DraftCertificate draftCertificate)
		throws SystemException {
		draftCertificate = toUnwrappedModel(draftCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(draftCertificate)) {
				draftCertificate = (DraftCertificate)session.get(DraftCertificateImpl.class,
						draftCertificate.getPrimaryKeyObj());
			}

			if (draftCertificate != null) {
				session.delete(draftCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (draftCertificate != null) {
			clearCache(draftCertificate);
		}

		return draftCertificate;
	}

	@Override
	public DraftCertificate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate)
		throws SystemException {
		draftCertificate = toUnwrappedModel(draftCertificate);

		boolean isNew = draftCertificate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (draftCertificate.isNew()) {
				session.save(draftCertificate);

				draftCertificate.setNew(false);
			}
			else {
				session.merge(draftCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DraftCertificateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
			DraftCertificateImpl.class, draftCertificate.getPrimaryKey(),
			draftCertificate);

		clearUniqueFindersCache(draftCertificate);
		cacheUniqueFindersCache(draftCertificate);

		return draftCertificate;
	}

	protected DraftCertificate toUnwrappedModel(
		DraftCertificate draftCertificate) {
		if (draftCertificate instanceof DraftCertificateImpl) {
			return draftCertificate;
		}

		DraftCertificateImpl draftCertificateImpl = new DraftCertificateImpl();

		draftCertificateImpl.setNew(draftCertificate.isNew());
		draftCertificateImpl.setPrimaryKey(draftCertificate.getPrimaryKey());

		draftCertificateImpl.setId(draftCertificate.getId());
		draftCertificateImpl.setAttachedFile(draftCertificate.getAttachedFile());
		draftCertificateImpl.setCertificateType(draftCertificate.getCertificateType());
		draftCertificateImpl.setInspectionReportId(draftCertificate.getInspectionReportId());
		draftCertificateImpl.setSafetytestReportId(draftCertificate.getSafetytestReportId());
		draftCertificateImpl.setEmissionTestReportId(draftCertificate.getEmissionTestReportId());
		draftCertificateImpl.setCopReportId(draftCertificate.getCopReportId());
		draftCertificateImpl.setReason(draftCertificate.getReason());
		draftCertificateImpl.setRemarks(draftCertificate.getRemarks());
		draftCertificateImpl.setCreatedDate(draftCertificate.getCreatedDate());

		return draftCertificateImpl;
	}

	/**
	 * Returns the draft certificate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the draft certificate
	 * @return the draft certificate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDraftCertificateException, SystemException {
		DraftCertificate draftCertificate = fetchByPrimaryKey(primaryKey);

		if (draftCertificate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDraftCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return draftCertificate;
	}

	/**
	 * Returns the draft certificate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the draft certificate
	 * @return the draft certificate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate findByPrimaryKey(long id)
		throws NoSuchDraftCertificateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the draft certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the draft certificate
	 * @return the draft certificate, or <code>null</code> if a draft certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DraftCertificate draftCertificate = (DraftCertificate)EntityCacheUtil.getResult(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
				DraftCertificateImpl.class, primaryKey);

		if (draftCertificate == _nullDraftCertificate) {
			return null;
		}

		if (draftCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				draftCertificate = (DraftCertificate)session.get(DraftCertificateImpl.class,
						primaryKey);

				if (draftCertificate != null) {
					cacheResult(draftCertificate);
				}
				else {
					EntityCacheUtil.putResult(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
						DraftCertificateImpl.class, primaryKey,
						_nullDraftCertificate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DraftCertificateModelImpl.ENTITY_CACHE_ENABLED,
					DraftCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return draftCertificate;
	}

	/**
	 * Returns the draft certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the draft certificate
	 * @return the draft certificate, or <code>null</code> if a draft certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DraftCertificate fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the draft certificates.
	 *
	 * @return the draft certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the draft certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft certificates
	 * @param end the upper bound of the range of draft certificates (not inclusive)
	 * @return the range of draft certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the draft certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft certificates
	 * @param end the upper bound of the range of draft certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of draft certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DraftCertificate> findAll(int start, int end,
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

		List<DraftCertificate> list = (List<DraftCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DRAFTCERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DRAFTCERTIFICATE;

				if (pagination) {
					sql = sql.concat(DraftCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DraftCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DraftCertificate>(list);
				}
				else {
					list = (List<DraftCertificate>)QueryUtil.list(q,
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
	 * Removes all the draft certificates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DraftCertificate draftCertificate : findAll()) {
			remove(draftCertificate);
		}
	}

	/**
	 * Returns the number of draft certificates.
	 *
	 * @return the number of draft certificates
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

				Query q = session.createQuery(_SQL_COUNT_DRAFTCERTIFICATE);

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
	 * Initializes the draft certificate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DraftCertificate>> listenersList = new ArrayList<ModelListener<DraftCertificate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DraftCertificate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DraftCertificateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DRAFTCERTIFICATE = "SELECT draftCertificate FROM DraftCertificate draftCertificate";
	private static final String _SQL_SELECT_DRAFTCERTIFICATE_WHERE = "SELECT draftCertificate FROM DraftCertificate draftCertificate WHERE ";
	private static final String _SQL_COUNT_DRAFTCERTIFICATE = "SELECT COUNT(draftCertificate) FROM DraftCertificate draftCertificate";
	private static final String _SQL_COUNT_DRAFTCERTIFICATE_WHERE = "SELECT COUNT(draftCertificate) FROM DraftCertificate draftCertificate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "draftCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DraftCertificate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DraftCertificate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DraftCertificatePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"attachedFile", "certificateType", "inspectionReportId",
				"safetytestReportId", "emissionTestReportId", "copReportId",
				"createdDate"
			});
	private static DraftCertificate _nullDraftCertificate = new DraftCertificateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DraftCertificate> toCacheModel() {
				return _nullDraftCertificateCacheModel;
			}
		};

	private static CacheModel<DraftCertificate> _nullDraftCertificateCacheModel = new CacheModel<DraftCertificate>() {
			@Override
			public DraftCertificate toEntityModel() {
				return _nullDraftCertificate;
			}
		};
}