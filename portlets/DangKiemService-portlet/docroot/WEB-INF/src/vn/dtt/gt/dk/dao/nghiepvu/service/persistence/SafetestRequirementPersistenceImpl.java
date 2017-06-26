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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the safetest requirement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see SafetestRequirementPersistence
 * @see SafetestRequirementUtil
 * @generated
 */
public class SafetestRequirementPersistenceImpl extends BasePersistenceImpl<SafetestRequirement>
	implements SafetestRequirementPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SafetestRequirementUtil} to access the safetest requirement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SafetestRequirementImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED,
			SafetestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED,
			SafetestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTIONRECORDID = new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED,
			SafetestRequirementImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectionRecordId", new String[] { Long.class.getName() },
			SafetestRequirementModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the safetest requirement where inspectionRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException} if it could not be found.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching safetest requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a matching safetest requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement findByInspectionRecordId(long inspectionRecordId)
		throws NoSuchSafetestRequirementException, SystemException {
		SafetestRequirement safetestRequirement = fetchByInspectionRecordId(inspectionRecordId);

		if (safetestRequirement == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectionRecordId=");
			msg.append(inspectionRecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSafetestRequirementException(msg.toString());
		}

		return safetestRequirement;
	}

	/**
	 * Returns the safetest requirement where inspectionRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching safetest requirement, or <code>null</code> if a matching safetest requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement fetchByInspectionRecordId(
		long inspectionRecordId) throws SystemException {
		return fetchByInspectionRecordId(inspectionRecordId, true);
	}

	/**
	 * Returns the safetest requirement where inspectionRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching safetest requirement, or <code>null</code> if a matching safetest requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement fetchByInspectionRecordId(
		long inspectionRecordId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { inspectionRecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					finderArgs, this);
		}

		if (result instanceof SafetestRequirement) {
			SafetestRequirement safetestRequirement = (SafetestRequirement)result;

			if ((inspectionRecordId != safetestRequirement.getInspectionRecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SAFETESTREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

				List<SafetestRequirement> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"SafetestRequirementPersistenceImpl.fetchByInspectionRecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					SafetestRequirement safetestRequirement = list.get(0);

					result = safetestRequirement;

					cacheResult(safetestRequirement);

					if ((safetestRequirement.getInspectionRecordId() != inspectionRecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
							finderArgs, safetestRequirement);
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
			return (SafetestRequirement)result;
		}
	}

	/**
	 * Removes the safetest requirement where inspectionRecordId = &#63; from the database.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the safetest requirement that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement removeByInspectionRecordId(
		long inspectionRecordId)
		throws NoSuchSafetestRequirementException, SystemException {
		SafetestRequirement safetestRequirement = findByInspectionRecordId(inspectionRecordId);

		return remove(safetestRequirement);
	}

	/**
	 * Returns the number of safetest requirements where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching safetest requirements
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

			query.append(_SQL_COUNT_SAFETESTREQUIREMENT_WHERE);

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
		"safetestRequirement.inspectionRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED,
			SafetestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED,
			SafetestRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhieuXuLyPhuId",
			new String[] { Long.class.getName() },
			SafetestRequirementModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYPHUID = new FinderPath(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhieuXuLyPhuId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the safetest requirements where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching safetest requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetestRequirement> findByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the safetest requirements where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of safetest requirements
	 * @param end the upper bound of the range of safetest requirements (not inclusive)
	 * @return the range of matching safetest requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetestRequirement> findByPhieuXuLyPhuId(long phieuXuLyPhuId,
		int start, int end) throws SystemException {
		return findByPhieuXuLyPhuId(phieuXuLyPhuId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the safetest requirements where phieuXuLyPhuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param start the lower bound of the range of safetest requirements
	 * @param end the upper bound of the range of safetest requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching safetest requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetestRequirement> findByPhieuXuLyPhuId(long phieuXuLyPhuId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<SafetestRequirement> list = (List<SafetestRequirement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SafetestRequirement safetestRequirement : list) {
				if ((phieuXuLyPhuId != safetestRequirement.getPhieuXuLyPhuId())) {
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

			query.append(_SQL_SELECT_SAFETESTREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SafetestRequirementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				if (!pagination) {
					list = (List<SafetestRequirement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SafetestRequirement>(list);
				}
				else {
					list = (List<SafetestRequirement>)QueryUtil.list(q,
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
	 * Returns the first safetest requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching safetest requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a matching safetest requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement findByPhieuXuLyPhuId_First(long phieuXuLyPhuId,
		OrderByComparator orderByComparator)
		throws NoSuchSafetestRequirementException, SystemException {
		SafetestRequirement safetestRequirement = fetchByPhieuXuLyPhuId_First(phieuXuLyPhuId,
				orderByComparator);

		if (safetestRequirement != null) {
			return safetestRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSafetestRequirementException(msg.toString());
	}

	/**
	 * Returns the first safetest requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching safetest requirement, or <code>null</code> if a matching safetest requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws SystemException {
		List<SafetestRequirement> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last safetest requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching safetest requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a matching safetest requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement findByPhieuXuLyPhuId_Last(long phieuXuLyPhuId,
		OrderByComparator orderByComparator)
		throws NoSuchSafetestRequirementException, SystemException {
		SafetestRequirement safetestRequirement = fetchByPhieuXuLyPhuId_Last(phieuXuLyPhuId,
				orderByComparator);

		if (safetestRequirement != null) {
			return safetestRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyPhuId=");
		msg.append(phieuXuLyPhuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSafetestRequirementException(msg.toString());
	}

	/**
	 * Returns the last safetest requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching safetest requirement, or <code>null</code> if a matching safetest requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement fetchByPhieuXuLyPhuId_Last(long phieuXuLyPhuId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPhieuXuLyPhuId(phieuXuLyPhuId);

		if (count == 0) {
			return null;
		}

		List<SafetestRequirement> list = findByPhieuXuLyPhuId(phieuXuLyPhuId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the safetest requirements before and after the current safetest requirement in the ordered set where phieuXuLyPhuId = &#63;.
	 *
	 * @param id the primary key of the current safetest requirement
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next safetest requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a safetest requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement[] findByPhieuXuLyPhuId_PrevAndNext(long id,
		long phieuXuLyPhuId, OrderByComparator orderByComparator)
		throws NoSuchSafetestRequirementException, SystemException {
		SafetestRequirement safetestRequirement = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SafetestRequirement[] array = new SafetestRequirementImpl[3];

			array[0] = getByPhieuXuLyPhuId_PrevAndNext(session,
					safetestRequirement, phieuXuLyPhuId, orderByComparator, true);

			array[1] = safetestRequirement;

			array[2] = getByPhieuXuLyPhuId_PrevAndNext(session,
					safetestRequirement, phieuXuLyPhuId, orderByComparator,
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

	protected SafetestRequirement getByPhieuXuLyPhuId_PrevAndNext(
		Session session, SafetestRequirement safetestRequirement,
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

		query.append(_SQL_SELECT_SAFETESTREQUIREMENT_WHERE);

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
			query.append(SafetestRequirementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyPhuId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(safetestRequirement);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SafetestRequirement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the safetest requirements where phieuXuLyPhuId = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		for (SafetestRequirement safetestRequirement : findByPhieuXuLyPhuId(
				phieuXuLyPhuId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(safetestRequirement);
		}
	}

	/**
	 * Returns the number of safetest requirements where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the number of matching safetest requirements
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

			query.append(_SQL_COUNT_SAFETESTREQUIREMENT_WHERE);

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

	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2 = "safetestRequirement.phieuXuLyPhuId = ?";

	public SafetestRequirementPersistenceImpl() {
		setModelClass(SafetestRequirement.class);
	}

	/**
	 * Caches the safetest requirement in the entity cache if it is enabled.
	 *
	 * @param safetestRequirement the safetest requirement
	 */
	@Override
	public void cacheResult(SafetestRequirement safetestRequirement) {
		EntityCacheUtil.putResult(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementImpl.class, safetestRequirement.getPrimaryKey(),
			safetestRequirement);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			new Object[] { safetestRequirement.getInspectionRecordId() },
			safetestRequirement);

		safetestRequirement.resetOriginalValues();
	}

	/**
	 * Caches the safetest requirements in the entity cache if it is enabled.
	 *
	 * @param safetestRequirements the safetest requirements
	 */
	@Override
	public void cacheResult(List<SafetestRequirement> safetestRequirements) {
		for (SafetestRequirement safetestRequirement : safetestRequirements) {
			if (EntityCacheUtil.getResult(
						SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
						SafetestRequirementImpl.class,
						safetestRequirement.getPrimaryKey()) == null) {
				cacheResult(safetestRequirement);
			}
			else {
				safetestRequirement.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all safetest requirements.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SafetestRequirementImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SafetestRequirementImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the safetest requirement.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SafetestRequirement safetestRequirement) {
		EntityCacheUtil.removeResult(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementImpl.class, safetestRequirement.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(safetestRequirement);
	}

	@Override
	public void clearCache(List<SafetestRequirement> safetestRequirements) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SafetestRequirement safetestRequirement : safetestRequirements) {
			EntityCacheUtil.removeResult(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
				SafetestRequirementImpl.class,
				safetestRequirement.getPrimaryKey());

			clearUniqueFindersCache(safetestRequirement);
		}
	}

	protected void cacheUniqueFindersCache(
		SafetestRequirement safetestRequirement) {
		if (safetestRequirement.isNew()) {
			Object[] args = new Object[] {
					safetestRequirement.getInspectionRecordId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args, safetestRequirement);
		}
		else {
			SafetestRequirementModelImpl safetestRequirementModelImpl = (SafetestRequirementModelImpl)safetestRequirement;

			if ((safetestRequirementModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						safetestRequirement.getInspectionRecordId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					args, safetestRequirement);
			}
		}
	}

	protected void clearUniqueFindersCache(
		SafetestRequirement safetestRequirement) {
		SafetestRequirementModelImpl safetestRequirementModelImpl = (SafetestRequirementModelImpl)safetestRequirement;

		Object[] args = new Object[] { safetestRequirement.getInspectionRecordId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			args);

		if ((safetestRequirementModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					safetestRequirementModelImpl.getOriginalInspectionRecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args);
		}
	}

	/**
	 * Creates a new safetest requirement with the primary key. Does not add the safetest requirement to the database.
	 *
	 * @param id the primary key for the new safetest requirement
	 * @return the new safetest requirement
	 */
	@Override
	public SafetestRequirement create(long id) {
		SafetestRequirement safetestRequirement = new SafetestRequirementImpl();

		safetestRequirement.setNew(true);
		safetestRequirement.setPrimaryKey(id);

		return safetestRequirement;
	}

	/**
	 * Removes the safetest requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the safetest requirement
	 * @return the safetest requirement that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a safetest requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement remove(long id)
		throws NoSuchSafetestRequirementException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the safetest requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the safetest requirement
	 * @return the safetest requirement that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a safetest requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement remove(Serializable primaryKey)
		throws NoSuchSafetestRequirementException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SafetestRequirement safetestRequirement = (SafetestRequirement)session.get(SafetestRequirementImpl.class,
					primaryKey);

			if (safetestRequirement == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSafetestRequirementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(safetestRequirement);
		}
		catch (NoSuchSafetestRequirementException nsee) {
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
	protected SafetestRequirement removeImpl(
		SafetestRequirement safetestRequirement) throws SystemException {
		safetestRequirement = toUnwrappedModel(safetestRequirement);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(safetestRequirement)) {
				safetestRequirement = (SafetestRequirement)session.get(SafetestRequirementImpl.class,
						safetestRequirement.getPrimaryKeyObj());
			}

			if (safetestRequirement != null) {
				session.delete(safetestRequirement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (safetestRequirement != null) {
			clearCache(safetestRequirement);
		}

		return safetestRequirement;
	}

	@Override
	public SafetestRequirement updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement safetestRequirement)
		throws SystemException {
		safetestRequirement = toUnwrappedModel(safetestRequirement);

		boolean isNew = safetestRequirement.isNew();

		SafetestRequirementModelImpl safetestRequirementModelImpl = (SafetestRequirementModelImpl)safetestRequirement;

		Session session = null;

		try {
			session = openSession();

			if (safetestRequirement.isNew()) {
				session.save(safetestRequirement);

				safetestRequirement.setNew(false);
			}
			else {
				session.merge(safetestRequirement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SafetestRequirementModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((safetestRequirementModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						safetestRequirementModelImpl.getOriginalPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);

				args = new Object[] {
						safetestRequirementModelImpl.getPhieuXuLyPhuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);
			}
		}

		EntityCacheUtil.putResult(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
			SafetestRequirementImpl.class, safetestRequirement.getPrimaryKey(),
			safetestRequirement);

		clearUniqueFindersCache(safetestRequirement);
		cacheUniqueFindersCache(safetestRequirement);

		return safetestRequirement;
	}

	protected SafetestRequirement toUnwrappedModel(
		SafetestRequirement safetestRequirement) {
		if (safetestRequirement instanceof SafetestRequirementImpl) {
			return safetestRequirement;
		}

		SafetestRequirementImpl safetestRequirementImpl = new SafetestRequirementImpl();

		safetestRequirementImpl.setNew(safetestRequirement.isNew());
		safetestRequirementImpl.setPrimaryKey(safetestRequirement.getPrimaryKey());

		safetestRequirementImpl.setId(safetestRequirement.getId());
		safetestRequirementImpl.setRegisteredInspectionId(safetestRequirement.getRegisteredInspectionId());
		safetestRequirementImpl.setInspectionRecordId(safetestRequirement.getInspectionRecordId());
		safetestRequirementImpl.setRequirementNumber(safetestRequirement.getRequirementNumber());
		safetestRequirementImpl.setContentOfRequest(safetestRequirement.getContentOfRequest());
		safetestRequirementImpl.setTestingRegisteredPlace(safetestRequirement.getTestingRegisteredPlace());
		safetestRequirementImpl.setTestingRegistration(safetestRequirement.getTestingRegistration());
		safetestRequirementImpl.setTestingPaymentCondition(safetestRequirement.getTestingPaymentCondition());
		safetestRequirementImpl.setRemarks(safetestRequirement.getRemarks());
		safetestRequirementImpl.setCorporationId(safetestRequirement.getCorporationId());
		safetestRequirementImpl.setAttachedFile(safetestRequirement.getAttachedFile());
		safetestRequirementImpl.setSignName(safetestRequirement.getSignName());
		safetestRequirementImpl.setSignTitle(safetestRequirement.getSignTitle());
		safetestRequirementImpl.setSignPlace(safetestRequirement.getSignPlace());
		safetestRequirementImpl.setSignDate(safetestRequirement.getSignDate());
		safetestRequirementImpl.setPhieuXuLyPhuId(safetestRequirement.getPhieuXuLyPhuId());
		safetestRequirementImpl.setSynchdate(safetestRequirement.getSynchdate());

		return safetestRequirementImpl;
	}

	/**
	 * Returns the safetest requirement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the safetest requirement
	 * @return the safetest requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a safetest requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSafetestRequirementException, SystemException {
		SafetestRequirement safetestRequirement = fetchByPrimaryKey(primaryKey);

		if (safetestRequirement == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSafetestRequirementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return safetestRequirement;
	}

	/**
	 * Returns the safetest requirement with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException} if it could not be found.
	 *
	 * @param id the primary key of the safetest requirement
	 * @return the safetest requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException if a safetest requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement findByPrimaryKey(long id)
		throws NoSuchSafetestRequirementException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the safetest requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the safetest requirement
	 * @return the safetest requirement, or <code>null</code> if a safetest requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SafetestRequirement safetestRequirement = (SafetestRequirement)EntityCacheUtil.getResult(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
				SafetestRequirementImpl.class, primaryKey);

		if (safetestRequirement == _nullSafetestRequirement) {
			return null;
		}

		if (safetestRequirement == null) {
			Session session = null;

			try {
				session = openSession();

				safetestRequirement = (SafetestRequirement)session.get(SafetestRequirementImpl.class,
						primaryKey);

				if (safetestRequirement != null) {
					cacheResult(safetestRequirement);
				}
				else {
					EntityCacheUtil.putResult(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
						SafetestRequirementImpl.class, primaryKey,
						_nullSafetestRequirement);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SafetestRequirementModelImpl.ENTITY_CACHE_ENABLED,
					SafetestRequirementImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return safetestRequirement;
	}

	/**
	 * Returns the safetest requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the safetest requirement
	 * @return the safetest requirement, or <code>null</code> if a safetest requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SafetestRequirement fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the safetest requirements.
	 *
	 * @return the safetest requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetestRequirement> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the safetest requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of safetest requirements
	 * @param end the upper bound of the range of safetest requirements (not inclusive)
	 * @return the range of safetest requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetestRequirement> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the safetest requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of safetest requirements
	 * @param end the upper bound of the range of safetest requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of safetest requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SafetestRequirement> findAll(int start, int end,
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

		List<SafetestRequirement> list = (List<SafetestRequirement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SAFETESTREQUIREMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SAFETESTREQUIREMENT;

				if (pagination) {
					sql = sql.concat(SafetestRequirementModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SafetestRequirement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SafetestRequirement>(list);
				}
				else {
					list = (List<SafetestRequirement>)QueryUtil.list(q,
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
	 * Removes all the safetest requirements from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SafetestRequirement safetestRequirement : findAll()) {
			remove(safetestRequirement);
		}
	}

	/**
	 * Returns the number of safetest requirements.
	 *
	 * @return the number of safetest requirements
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

				Query q = session.createQuery(_SQL_COUNT_SAFETESTREQUIREMENT);

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
	 * Initializes the safetest requirement persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SafetestRequirement>> listenersList = new ArrayList<ModelListener<SafetestRequirement>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SafetestRequirement>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SafetestRequirementImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SAFETESTREQUIREMENT = "SELECT safetestRequirement FROM SafetestRequirement safetestRequirement";
	private static final String _SQL_SELECT_SAFETESTREQUIREMENT_WHERE = "SELECT safetestRequirement FROM SafetestRequirement safetestRequirement WHERE ";
	private static final String _SQL_COUNT_SAFETESTREQUIREMENT = "SELECT COUNT(safetestRequirement) FROM SafetestRequirement safetestRequirement";
	private static final String _SQL_COUNT_SAFETESTREQUIREMENT_WHERE = "SELECT COUNT(safetestRequirement) FROM SafetestRequirement safetestRequirement WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "safetestRequirement.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SafetestRequirement exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SafetestRequirement exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SafetestRequirementPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "inspectionRecordId",
				"requirementNumber", "contentOfRequest",
				"testingRegisteredPlace", "testingRegistration",
				"testingPaymentCondition", "corporationId", "attachedFile",
				"signName", "signTitle", "signPlace", "signDate",
				"phieuXuLyPhuId"
			});
	private static SafetestRequirement _nullSafetestRequirement = new SafetestRequirementImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SafetestRequirement> toCacheModel() {
				return _nullSafetestRequirementCacheModel;
			}
		};

	private static CacheModel<SafetestRequirement> _nullSafetestRequirementCacheModel =
		new CacheModel<SafetestRequirement>() {
			@Override
			public SafetestRequirement toEntityModel() {
				return _nullSafetestRequirement;
			}
		};
}