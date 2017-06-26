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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the emission test requirement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see EmissionTestRequirementPersistence
 * @see EmissionTestRequirementUtil
 * @generated
 */
public class EmissionTestRequirementPersistenceImpl extends BasePersistenceImpl<EmissionTestRequirement>
	implements EmissionTestRequirementPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmissionTestRequirementUtil} to access the emission test requirement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmissionTestRequirementImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTIONRECORDID = new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestRequirementImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectionRecordId", new String[] { Long.class.getName() },
			EmissionTestRequirementModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the emission test requirement where inspectionRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException} if it could not be found.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching emission test requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a matching emission test requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement findByInspectionRecordId(
		long inspectionRecordId)
		throws NoSuchEmissionTestRequirementException, SystemException {
		EmissionTestRequirement emissionTestRequirement = fetchByInspectionRecordId(inspectionRecordId);

		if (emissionTestRequirement == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectionRecordId=");
			msg.append(inspectionRecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEmissionTestRequirementException(msg.toString());
		}

		return emissionTestRequirement;
	}

	/**
	 * Returns the emission test requirement where inspectionRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement fetchByInspectionRecordId(
		long inspectionRecordId) throws SystemException {
		return fetchByInspectionRecordId(inspectionRecordId, true);
	}

	/**
	 * Returns the emission test requirement where inspectionRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement fetchByInspectionRecordId(
		long inspectionRecordId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { inspectionRecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					finderArgs, this);
		}

		if (result instanceof EmissionTestRequirement) {
			EmissionTestRequirement emissionTestRequirement = (EmissionTestRequirement)result;

			if ((inspectionRecordId != emissionTestRequirement.getInspectionRecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_EMISSIONTESTREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

				List<EmissionTestRequirement> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EmissionTestRequirementPersistenceImpl.fetchByInspectionRecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EmissionTestRequirement emissionTestRequirement = list.get(0);

					result = emissionTestRequirement;

					cacheResult(emissionTestRequirement);

					if ((emissionTestRequirement.getInspectionRecordId() != inspectionRecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
							finderArgs, emissionTestRequirement);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
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
			return (EmissionTestRequirement)result;
		}
	}

	/**
	 * Removes the emission test requirement where inspectionRecordId = &#63; from the database.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the emission test requirement that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement removeByInspectionRecordId(
		long inspectionRecordId)
		throws NoSuchEmissionTestRequirementException, SystemException {
		EmissionTestRequirement emissionTestRequirement = findByInspectionRecordId(inspectionRecordId);

		return remove(emissionTestRequirement);
	}

	/**
	 * Returns the number of emission test requirements where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionRecordId(long inspectionRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDID;

		Object[] finderArgs = new Object[] { inspectionRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMISSIONTESTREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2 =
		"emissionTestRequirement.inspectionRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED,
			EmissionTestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] { Long.class.getName() },
			EmissionTestRequirementModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYPHUID = new FinderPath(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhieuXuLyPhuId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the emission test requirements where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emission test requirements where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of emission test requirements
	 * @param end the upper bound of the range of emission test requirements (not inclusive)
	 * @return the range of matching emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end) throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the emission test requirements where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of emission test requirements
	 * @param end the upper bound of the range of emission test requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] { phieuXuLyPhuId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] {
					phieuXuLyPhuId,
					
					start, end, orderByComparator
				};
		}

		List<EmissionTestRequirement> list = (List<EmissionTestRequirement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EmissionTestRequirement emissionTestRequirement : list) {
				if ((phieuXuLyPhuId != emissionTestRequirement.getPhieuXuLyPhuId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_EMISSIONTESTREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmissionTestRequirementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				if (!pagination) {
					list = (List<EmissionTestRequirement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmissionTestRequirement>(list);
				}
				else {
					list = (List<EmissionTestRequirement>)QueryUtil.list(q,
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
	 * Returns the first emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emission test requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a matching emission test requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchEmissionTestRequirementException, SystemException {
		EmissionTestRequirement emissionTestRequirement = fetchByPhieuXuLyPhuId_First(phieuXuLyPhuId,
				orderByComparator);

		if (emissionTestRequirement != null) {
			return emissionTestRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmissionTestRequirementException(msg.toString());
	}

	/**
	 * Returns the first emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		List<EmissionTestRequirement> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emission test requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a matching emission test requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchEmissionTestRequirementException, SystemException {
		EmissionTestRequirement emissionTestRequirement = fetchByPhieuXuLyPhuId_Last(phieuXuLyPhuId,
				orderByComparator);

		if (emissionTestRequirement != null) {
			return emissionTestRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmissionTestRequirementException(msg.toString());
	}

	/**
	 * Returns the last emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPhieuXuLyPhuId(phieuXuLyPhuId);

		if (count == 0) {
			return null;
		}

		List<EmissionTestRequirement> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the emission test requirements before and after the current emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param id the primary key of the current emission test requirement
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emission test requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement[] findByPhieuXuLyPhuId_PrevAndNext(long id,
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchEmissionTestRequirementException, SystemException {
		EmissionTestRequirement emissionTestRequirement = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EmissionTestRequirement[] array = new EmissionTestRequirementImpl[3];

			array[0] = getByPhieuXuLyPhuId_PrevAndNext(session,
					emissionTestRequirement, phieuXuLyPhuId, orderByComparator,
					true);

			array[1] = emissionTestRequirement;

			array[2] = getByPhieuXuLyPhuId_PrevAndNext(session,
					emissionTestRequirement, phieuXuLyPhuId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EmissionTestRequirement getByPhieuXuLyPhuId_PrevAndNext(
		Session session, EmissionTestRequirement emissionTestRequirement,
		long phieuXuLyPhuId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMISSIONTESTREQUIREMENT_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(EmissionTestRequirementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyPhuId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(emissionTestRequirement);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmissionTestRequirement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the emission test requirements where phieuXuLyPhuId = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		for (EmissionTestRequirement emissionTestRequirement : findByPhieuXuLyPhuId(
				phieuXuLyPhuId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(emissionTestRequirement);
		}
	}

	/**
	 * Returns the number of emission test requirements where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the number of matching emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYPHUID;

		Object[] finderArgs = new Object[] { phieuXuLyPhuId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMISSIONTESTREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2 = "emissionTestRequirement.phieuXuLyPhuId = ?";

	public EmissionTestRequirementPersistenceImpl() {
		setModelClass(EmissionTestRequirement.class);
	}

	/**
	 * Caches the emission test requirement in the entity cache if it is enabled.
	 *
	 * @param emissionTestRequirement the emission test requirement
	 */
	@Override
	public void cacheResult(EmissionTestRequirement emissionTestRequirement) {
		EntityCacheUtil.putResult(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementImpl.class,
			emissionTestRequirement.getPrimaryKey(), emissionTestRequirement);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			new Object[] { emissionTestRequirement.getInspectionRecordId() },
			emissionTestRequirement);

		emissionTestRequirement.resetOriginalValues();
	}

	/**
	 * Caches the emission test requirements in the entity cache if it is enabled.
	 *
	 * @param emissionTestRequirements the emission test requirements
	 */
	@Override
	public void cacheResult(
		List<EmissionTestRequirement> emissionTestRequirements) {
		for (EmissionTestRequirement emissionTestRequirement : emissionTestRequirements) {
			if (EntityCacheUtil.getResult(
						EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
						EmissionTestRequirementImpl.class,
						emissionTestRequirement.getPrimaryKey()) == null) {
				cacheResult(emissionTestRequirement);
			}
			else {
				emissionTestRequirement.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emission test requirements.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmissionTestRequirementImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmissionTestRequirementImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emission test requirement.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmissionTestRequirement emissionTestRequirement) {
		EntityCacheUtil.removeResult(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementImpl.class,
			emissionTestRequirement.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(emissionTestRequirement);
	}

	@Override
	public void clearCache(
		List<EmissionTestRequirement> emissionTestRequirements) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmissionTestRequirement emissionTestRequirement : emissionTestRequirements) {
			EntityCacheUtil.removeResult(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
				EmissionTestRequirementImpl.class,
				emissionTestRequirement.getPrimaryKey());

			clearUniqueFindersCache(emissionTestRequirement);
		}
	}

	protected void cacheUniqueFindersCache(
		EmissionTestRequirement emissionTestRequirement) {
		if (emissionTestRequirement.isNew()) {
			Object[] args = new Object[] {
					emissionTestRequirement.getInspectionRecordId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args, emissionTestRequirement);
		}
		else {
			EmissionTestRequirementModelImpl emissionTestRequirementModelImpl = (EmissionTestRequirementModelImpl)emissionTestRequirement;

			if ((emissionTestRequirementModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						emissionTestRequirement.getInspectionRecordId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					args, emissionTestRequirement);
			}
		}
	}

	protected void clearUniqueFindersCache(
		EmissionTestRequirement emissionTestRequirement) {
		EmissionTestRequirementModelImpl emissionTestRequirementModelImpl = (EmissionTestRequirementModelImpl)emissionTestRequirement;

		Object[] args = new Object[] {
				emissionTestRequirement.getInspectionRecordId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			args);

		if ((emissionTestRequirementModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					emissionTestRequirementModelImpl.getOriginalInspectionRecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args);
		}
	}

	/**
	 * Creates a new emission test requirement with the primary key. Does not add the emission test requirement to the database.
	 *
	 * @param id the primary key for the new emission test requirement
	 * @return the new emission test requirement
	 */
	@Override
	public EmissionTestRequirement create(long id) {
		EmissionTestRequirement emissionTestRequirement = new EmissionTestRequirementImpl();

		emissionTestRequirement.setNew(true);
		emissionTestRequirement.setPrimaryKey(id);

		return emissionTestRequirement;
	}

	/**
	 * Removes the emission test requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the emission test requirement
	 * @return the emission test requirement that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement remove(long id)
		throws NoSuchEmissionTestRequirementException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the emission test requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emission test requirement
	 * @return the emission test requirement that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement remove(Serializable primaryKey)
		throws NoSuchEmissionTestRequirementException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EmissionTestRequirement emissionTestRequirement = (EmissionTestRequirement)session.get(EmissionTestRequirementImpl.class,
					primaryKey);

			if (emissionTestRequirement == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmissionTestRequirementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(emissionTestRequirement);
		}
		catch (NoSuchEmissionTestRequirementException nsee) {
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
	protected EmissionTestRequirement removeImpl(
		EmissionTestRequirement emissionTestRequirement)
		throws SystemException {
		emissionTestRequirement = toUnwrappedModel(emissionTestRequirement);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(emissionTestRequirement)) {
				emissionTestRequirement = (EmissionTestRequirement)session.get(EmissionTestRequirementImpl.class,
						emissionTestRequirement.getPrimaryKeyObj());
			}

			if (emissionTestRequirement != null) {
				session.delete(emissionTestRequirement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (emissionTestRequirement != null) {
			clearCache(emissionTestRequirement);
		}

		return emissionTestRequirement;
	}

	@Override
	public EmissionTestRequirement updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement emissionTestRequirement)
		throws SystemException {
		emissionTestRequirement = toUnwrappedModel(emissionTestRequirement);

		boolean isNew = emissionTestRequirement.isNew();

		EmissionTestRequirementModelImpl emissionTestRequirementModelImpl = (EmissionTestRequirementModelImpl)emissionTestRequirement;

		Session session = null;

		try {
			session = openSession();

			if (emissionTestRequirement.isNew()) {
				session.save(emissionTestRequirement);

				emissionTestRequirement.setNew(false);
			}
			else {
				session.merge(emissionTestRequirement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmissionTestRequirementModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((emissionTestRequirementModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						emissionTestRequirementModelImpl.getOriginalPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);

				args = new Object[] {
						emissionTestRequirementModelImpl.getPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);
			}
		}

		EntityCacheUtil.putResult(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			EmissionTestRequirementImpl.class,
			emissionTestRequirement.getPrimaryKey(), emissionTestRequirement);

		clearUniqueFindersCache(emissionTestRequirement);
		cacheUniqueFindersCache(emissionTestRequirement);

		return emissionTestRequirement;
	}

	protected EmissionTestRequirement toUnwrappedModel(
		EmissionTestRequirement emissionTestRequirement) {
		if (emissionTestRequirement instanceof EmissionTestRequirementImpl) {
			return emissionTestRequirement;
		}

		EmissionTestRequirementImpl emissionTestRequirementImpl = new EmissionTestRequirementImpl();

		emissionTestRequirementImpl.setNew(emissionTestRequirement.isNew());
		emissionTestRequirementImpl.setPrimaryKey(emissionTestRequirement.getPrimaryKey());

		emissionTestRequirementImpl.setId(emissionTestRequirement.getId());
		emissionTestRequirementImpl.setRegisteredInspectionId(emissionTestRequirement.getRegisteredInspectionId());
		emissionTestRequirementImpl.setInspectionRecordId(emissionTestRequirement.getInspectionRecordId());
		emissionTestRequirementImpl.setRequirementNumber(emissionTestRequirement.getRequirementNumber());
		emissionTestRequirementImpl.setContentOfRequest(emissionTestRequirement.getContentOfRequest());
		emissionTestRequirementImpl.setTestingRegisteredPlace(emissionTestRequirement.getTestingRegisteredPlace());
		emissionTestRequirementImpl.setTestingRegistration(emissionTestRequirement.getTestingRegistration());
		emissionTestRequirementImpl.setTestingPaymentCondition(emissionTestRequirement.getTestingPaymentCondition());
		emissionTestRequirementImpl.setRemarks(emissionTestRequirement.getRemarks());
		emissionTestRequirementImpl.setCorporationId(emissionTestRequirement.getCorporationId());
		emissionTestRequirementImpl.setSignName(emissionTestRequirement.getSignName());
		emissionTestRequirementImpl.setSignTitle(emissionTestRequirement.getSignTitle());
		emissionTestRequirementImpl.setSignPlace(emissionTestRequirement.getSignPlace());
		emissionTestRequirementImpl.setSignDate(emissionTestRequirement.getSignDate());
		emissionTestRequirementImpl.setPhieuXuLyPhuId(emissionTestRequirement.getPhieuXuLyPhuId());
		emissionTestRequirementImpl.setAttachedFile(emissionTestRequirement.getAttachedFile());

		return emissionTestRequirementImpl;
	}

	/**
	 * Returns the emission test requirement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emission test requirement
	 * @return the emission test requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmissionTestRequirementException, SystemException {
		EmissionTestRequirement emissionTestRequirement = fetchByPrimaryKey(primaryKey);

		if (emissionTestRequirement == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmissionTestRequirementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return emissionTestRequirement;
	}

	/**
	 * Returns the emission test requirement with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException} if it could not be found.
	 *
	 * @param id the primary key of the emission test requirement
	 * @return the emission test requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement findByPrimaryKey(long id)
		throws NoSuchEmissionTestRequirementException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the emission test requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emission test requirement
	 * @return the emission test requirement, or <code>null</code> if a emission test requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EmissionTestRequirement emissionTestRequirement = (EmissionTestRequirement)EntityCacheUtil.getResult(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
				EmissionTestRequirementImpl.class, primaryKey);

		if (emissionTestRequirement == _nullEmissionTestRequirement) {
			return null;
		}

		if (emissionTestRequirement == null) {
			Session session = null;

			try {
				session = openSession();

				emissionTestRequirement = (EmissionTestRequirement)session.get(EmissionTestRequirementImpl.class,
						primaryKey);

				if (emissionTestRequirement != null) {
					cacheResult(emissionTestRequirement);
				}
				else {
					EntityCacheUtil.putResult(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
						EmissionTestRequirementImpl.class, primaryKey,
						_nullEmissionTestRequirement);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmissionTestRequirementModelImpl.ENTITY_CACHE_ENABLED,
					EmissionTestRequirementImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return emissionTestRequirement;
	}

	/**
	 * Returns the emission test requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the emission test requirement
	 * @return the emission test requirement, or <code>null</code> if a emission test requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EmissionTestRequirement fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the emission test requirements.
	 *
	 * @return the emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequirement> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emission test requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emission test requirements
	 * @param end the upper bound of the range of emission test requirements (not inclusive)
	 * @return the range of emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequirement> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emission test requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emission test requirements
	 * @param end the upper bound of the range of emission test requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emission test requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EmissionTestRequirement> findAll(int start, int end,
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

		List<EmissionTestRequirement> list = (List<EmissionTestRequirement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMISSIONTESTREQUIREMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMISSIONTESTREQUIREMENT;

				if (pagination) {
					sql = sql.concat(EmissionTestRequirementModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmissionTestRequirement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EmissionTestRequirement>(list);
				}
				else {
					list = (List<EmissionTestRequirement>)QueryUtil.list(q,
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
	 * Removes all the emission test requirements from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EmissionTestRequirement emissionTestRequirement : findAll()) {
			remove(emissionTestRequirement);
		}
	}

	/**
	 * Returns the number of emission test requirements.
	 *
	 * @return the number of emission test requirements
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

				Query q = session.createQuery(_SQL_COUNT_EMISSIONTESTREQUIREMENT);

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
	 * Initializes the emission test requirement persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EmissionTestRequirement>> listenersList = new ArrayList<ModelListener<EmissionTestRequirement>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EmissionTestRequirement>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EmissionTestRequirementImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EMISSIONTESTREQUIREMENT = "SELECT emissionTestRequirement FROM EmissionTestRequirement emissionTestRequirement";
	private static final String _SQL_SELECT_EMISSIONTESTREQUIREMENT_WHERE = "SELECT emissionTestRequirement FROM EmissionTestRequirement emissionTestRequirement WHERE ";
	private static final String _SQL_COUNT_EMISSIONTESTREQUIREMENT = "SELECT COUNT(emissionTestRequirement) FROM EmissionTestRequirement emissionTestRequirement";
	private static final String _SQL_COUNT_EMISSIONTESTREQUIREMENT_WHERE = "SELECT COUNT(emissionTestRequirement) FROM EmissionTestRequirement emissionTestRequirement WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "emissionTestRequirement.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmissionTestRequirement exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmissionTestRequirement exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmissionTestRequirementPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "inspectionRecordId",
				"requirementNumber", "contentOfRequest",
				"testingRegisteredPlace", "testingRegistration",
				"testingPaymentCondition", "corporationId", "signName",
				"signTitle", "signPlace", "signDate", "phieuXuLyPhuId",
				"attachedFile"
			});
	private static EmissionTestRequirement _nullEmissionTestRequirement = new EmissionTestRequirementImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmissionTestRequirement> toCacheModel() {
				return _nullEmissionTestRequirementCacheModel;
			}
		};

	private static CacheModel<EmissionTestRequirement> _nullEmissionTestRequirementCacheModel =
		new CacheModel<EmissionTestRequirement>() {
			@Override
			public EmissionTestRequirement toEntityModel() {
				return _nullEmissionTestRequirement;
			}
		};
}