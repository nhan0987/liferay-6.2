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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the control requirement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ControlRequirementPersistence
 * @see ControlRequirementUtil
 * @generated
 */
public class ControlRequirementPersistenceImpl extends BasePersistenceImpl<ControlRequirement>
	implements ControlRequirementPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ControlRequirementUtil} to access the control requirement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ControlRequirementImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED,
			ControlRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED,
			ControlRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED,
			ControlRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED,
			ControlRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] { Long.class.getName() },
			ControlRequirementModelImpl.REGISTEREDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID = new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredInspectionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the control requirements where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId) throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the control requirements where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of control requirements
	 * @param end the upper bound of the range of control requirements (not inclusive)
	 * @return the range of matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the control requirements where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of control requirements
	 * @param end the upper bound of the range of control requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID;
			finderArgs = new Object[] { registeredInspectionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID;
			finderArgs = new Object[] {
					registeredInspectionId,
					
					start, end, orderByComparator
				};
		}

		List<ControlRequirement> list = (List<ControlRequirement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ControlRequirement controlRequirement : list) {
				if ((registeredInspectionId != controlRequirement.getRegisteredInspectionId())) {
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

			query.append(_SQL_SELECT_CONTROLREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ControlRequirementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

				if (!pagination) {
					list = (List<ControlRequirement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ControlRequirement>(list);
				}
				else {
					list = (List<ControlRequirement>)QueryUtil.list(q,
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
	 * Returns the first control requirement in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement findByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = fetchByRegisteredInspectionId_First(registeredInspectionId,
				orderByComparator);

		if (controlRequirement != null) {
			return controlRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchControlRequirementException(msg.toString());
	}

	/**
	 * Returns the first control requirement in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching control requirement, or <code>null</code> if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ControlRequirement> list = findByRegisteredInspectionId(registeredInspectionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last control requirement in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement findByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = fetchByRegisteredInspectionId_Last(registeredInspectionId,
				orderByComparator);

		if (controlRequirement != null) {
			return controlRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchControlRequirementException(msg.toString());
	}

	/**
	 * Returns the last control requirement in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching control requirement, or <code>null</code> if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRegisteredInspectionId(registeredInspectionId);

		if (count == 0) {
			return null;
		}

		List<ControlRequirement> list = findByRegisteredInspectionId(registeredInspectionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the control requirements before and after the current control requirement in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param id the primary key of the current control requirement
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		OrderByComparator orderByComparator)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ControlRequirement[] array = new ControlRequirementImpl[3];

			array[0] = getByRegisteredInspectionId_PrevAndNext(session,
					controlRequirement, registeredInspectionId,
					orderByComparator, true);

			array[1] = controlRequirement;

			array[2] = getByRegisteredInspectionId_PrevAndNext(session,
					controlRequirement, registeredInspectionId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ControlRequirement getByRegisteredInspectionId_PrevAndNext(
		Session session, ControlRequirement controlRequirement,
		long registeredInspectionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTROLREQUIREMENT_WHERE);

		query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

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
			query.append(ControlRequirementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(registeredInspectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(controlRequirement);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ControlRequirement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the control requirements where registeredInspectionId = &#63; from the database.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		for (ControlRequirement controlRequirement : findByRegisteredInspectionId(
				registeredInspectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(controlRequirement);
		}
	}

	/**
	 * Returns the number of control requirements where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the number of matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID;

		Object[] finderArgs = new Object[] { registeredInspectionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTROLREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

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

	private static final String _FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2 =
		"controlRequirement.registeredInspectionId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTIONRECORDID = new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED,
			ControlRequirementImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectionrecordId", new String[] { Long.class.getName() },
			ControlRequirementModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionrecordId", new String[] { Long.class.getName() });

	/**
	 * Returns the control requirement where inspectionrecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException} if it could not be found.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the matching control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement findByInspectionrecordId(long inspectionrecordId)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = fetchByInspectionrecordId(inspectionrecordId);

		if (controlRequirement == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectionrecordId=");
			msg.append(inspectionrecordId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchControlRequirementException(msg.toString());
		}

		return controlRequirement;
	}

	/**
	 * Returns the control requirement where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the matching control requirement, or <code>null</code> if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByInspectionrecordId(long inspectionrecordId)
		throws SystemException {
		return fetchByInspectionrecordId(inspectionrecordId, true);
	}

	/**
	 * Returns the control requirement where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching control requirement, or <code>null</code> if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByInspectionrecordId(
		long inspectionrecordId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { inspectionrecordId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					finderArgs, this);
		}

		if (result instanceof ControlRequirement) {
			ControlRequirement controlRequirement = (ControlRequirement)result;

			if ((inspectionrecordId != controlRequirement.getInspectionrecordId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONTROLREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionrecordId);

				List<ControlRequirement> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ControlRequirementPersistenceImpl.fetchByInspectionrecordId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ControlRequirement controlRequirement = list.get(0);

					result = controlRequirement;

					cacheResult(controlRequirement);

					if ((controlRequirement.getInspectionrecordId() != inspectionrecordId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
							finderArgs, controlRequirement);
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
			return (ControlRequirement)result;
		}
	}

	/**
	 * Removes the control requirement where inspectionrecordId = &#63; from the database.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the control requirement that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement removeByInspectionrecordId(
		long inspectionrecordId)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = findByInspectionrecordId(inspectionrecordId);

		return remove(controlRequirement);
	}

	/**
	 * Returns the number of control requirements where inspectionrecordId = &#63;.
	 *
	 * @param inspectionrecordId the inspectionrecord ID
	 * @return the number of matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionrecordId(long inspectionrecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDID;

		Object[] finderArgs = new Object[] { inspectionrecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTROLREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionrecordId);

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
		"controlRequirement.inspectionrecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED,
			ControlRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhieuxulyphuId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID =
		new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED,
			ControlRequirementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhieuxulyphuId",
			new String[] { Long.class.getName() },
			ControlRequirementModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYPHUID = new FinderPath(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhieuxulyphuId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the control requirements where phieuxulyphuId = &#63;.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @return the matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findByPhieuxulyphuId(long phieuxulyphuId)
		throws SystemException {
		return findByPhieuxulyphuId(phieuxulyphuId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the control requirements where phieuxulyphuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @param start the lower bound of the range of control requirements
	 * @param end the upper bound of the range of control requirements (not inclusive)
	 * @return the range of matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findByPhieuxulyphuId(long phieuxulyphuId,
		int start, int end) throws SystemException {
		return findByPhieuxulyphuId(phieuxulyphuId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the control requirements where phieuxulyphuId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @param start the lower bound of the range of control requirements
	 * @param end the upper bound of the range of control requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findByPhieuxulyphuId(long phieuxulyphuId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] { phieuxulyphuId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYPHUID;
			finderArgs = new Object[] {
					phieuxulyphuId,
					
					start, end, orderByComparator
				};
		}

		List<ControlRequirement> list = (List<ControlRequirement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ControlRequirement controlRequirement : list) {
				if ((phieuxulyphuId != controlRequirement.getPhieuxulyphuId())) {
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

			query.append(_SQL_SELECT_CONTROLREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ControlRequirementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuxulyphuId);

				if (!pagination) {
					list = (List<ControlRequirement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ControlRequirement>(list);
				}
				else {
					list = (List<ControlRequirement>)QueryUtil.list(q,
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
	 * Returns the first control requirement in the ordered set where phieuxulyphuId = &#63;.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement findByPhieuxulyphuId_First(long phieuxulyphuId,
		OrderByComparator orderByComparator)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = fetchByPhieuxulyphuId_First(phieuxulyphuId,
				orderByComparator);

		if (controlRequirement != null) {
			return controlRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuxulyphuId=");
		msg.append(phieuxulyphuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchControlRequirementException(msg.toString());
	}

	/**
	 * Returns the first control requirement in the ordered set where phieuxulyphuId = &#63;.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching control requirement, or <code>null</code> if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByPhieuxulyphuId_First(long phieuxulyphuId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ControlRequirement> list = findByPhieuxulyphuId(phieuxulyphuId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last control requirement in the ordered set where phieuxulyphuId = &#63;.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement findByPhieuxulyphuId_Last(long phieuxulyphuId,
		OrderByComparator orderByComparator)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = fetchByPhieuxulyphuId_Last(phieuxulyphuId,
				orderByComparator);

		if (controlRequirement != null) {
			return controlRequirement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuxulyphuId=");
		msg.append(phieuxulyphuId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchControlRequirementException(msg.toString());
	}

	/**
	 * Returns the last control requirement in the ordered set where phieuxulyphuId = &#63;.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching control requirement, or <code>null</code> if a matching control requirement could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByPhieuxulyphuId_Last(long phieuxulyphuId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPhieuxulyphuId(phieuxulyphuId);

		if (count == 0) {
			return null;
		}

		List<ControlRequirement> list = findByPhieuxulyphuId(phieuxulyphuId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the control requirements before and after the current control requirement in the ordered set where phieuxulyphuId = &#63;.
	 *
	 * @param id the primary key of the current control requirement
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement[] findByPhieuxulyphuId_PrevAndNext(long id,
		long phieuxulyphuId, OrderByComparator orderByComparator)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ControlRequirement[] array = new ControlRequirementImpl[3];

			array[0] = getByPhieuxulyphuId_PrevAndNext(session,
					controlRequirement, phieuxulyphuId, orderByComparator, true);

			array[1] = controlRequirement;

			array[2] = getByPhieuxulyphuId_PrevAndNext(session,
					controlRequirement, phieuxulyphuId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ControlRequirement getByPhieuxulyphuId_PrevAndNext(
		Session session, ControlRequirement controlRequirement,
		long phieuxulyphuId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTROLREQUIREMENT_WHERE);

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
			query.append(ControlRequirementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuxulyphuId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(controlRequirement);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ControlRequirement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the control requirements where phieuxulyphuId = &#63; from the database.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuxulyphuId(long phieuxulyphuId)
		throws SystemException {
		for (ControlRequirement controlRequirement : findByPhieuxulyphuId(
				phieuxulyphuId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(controlRequirement);
		}
	}

	/**
	 * Returns the number of control requirements where phieuxulyphuId = &#63;.
	 *
	 * @param phieuxulyphuId the phieuxulyphu ID
	 * @return the number of matching control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuxulyphuId(long phieuxulyphuId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYPHUID;

		Object[] finderArgs = new Object[] { phieuxulyphuId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTROLREQUIREMENT_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuxulyphuId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2 = "controlRequirement.phieuxulyphuId = ?";

	public ControlRequirementPersistenceImpl() {
		setModelClass(ControlRequirement.class);
	}

	/**
	 * Caches the control requirement in the entity cache if it is enabled.
	 *
	 * @param controlRequirement the control requirement
	 */
	@Override
	public void cacheResult(ControlRequirement controlRequirement) {
		EntityCacheUtil.putResult(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementImpl.class, controlRequirement.getPrimaryKey(),
			controlRequirement);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			new Object[] { controlRequirement.getInspectionrecordId() },
			controlRequirement);

		controlRequirement.resetOriginalValues();
	}

	/**
	 * Caches the control requirements in the entity cache if it is enabled.
	 *
	 * @param controlRequirements the control requirements
	 */
	@Override
	public void cacheResult(List<ControlRequirement> controlRequirements) {
		for (ControlRequirement controlRequirement : controlRequirements) {
			if (EntityCacheUtil.getResult(
						ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
						ControlRequirementImpl.class,
						controlRequirement.getPrimaryKey()) == null) {
				cacheResult(controlRequirement);
			}
			else {
				controlRequirement.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all control requirements.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ControlRequirementImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ControlRequirementImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the control requirement.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ControlRequirement controlRequirement) {
		EntityCacheUtil.removeResult(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementImpl.class, controlRequirement.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(controlRequirement);
	}

	@Override
	public void clearCache(List<ControlRequirement> controlRequirements) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ControlRequirement controlRequirement : controlRequirements) {
			EntityCacheUtil.removeResult(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
				ControlRequirementImpl.class, controlRequirement.getPrimaryKey());

			clearUniqueFindersCache(controlRequirement);
		}
	}

	protected void cacheUniqueFindersCache(
		ControlRequirement controlRequirement) {
		if (controlRequirement.isNew()) {
			Object[] args = new Object[] {
					controlRequirement.getInspectionrecordId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args, controlRequirement);
		}
		else {
			ControlRequirementModelImpl controlRequirementModelImpl = (ControlRequirementModelImpl)controlRequirement;

			if ((controlRequirementModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						controlRequirement.getInspectionrecordId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
					args, controlRequirement);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ControlRequirement controlRequirement) {
		ControlRequirementModelImpl controlRequirementModelImpl = (ControlRequirementModelImpl)controlRequirement;

		Object[] args = new Object[] { controlRequirement.getInspectionrecordId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
			args);

		if ((controlRequirementModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
			args = new Object[] {
					controlRequirementModelImpl.getOriginalInspectionrecordId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTIONRECORDID,
				args);
		}
	}

	/**
	 * Creates a new control requirement with the primary key. Does not add the control requirement to the database.
	 *
	 * @param id the primary key for the new control requirement
	 * @return the new control requirement
	 */
	@Override
	public ControlRequirement create(long id) {
		ControlRequirement controlRequirement = new ControlRequirementImpl();

		controlRequirement.setNew(true);
		controlRequirement.setPrimaryKey(id);

		return controlRequirement;
	}

	/**
	 * Removes the control requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the control requirement
	 * @return the control requirement that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement remove(long id)
		throws NoSuchControlRequirementException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the control requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the control requirement
	 * @return the control requirement that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement remove(Serializable primaryKey)
		throws NoSuchControlRequirementException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ControlRequirement controlRequirement = (ControlRequirement)session.get(ControlRequirementImpl.class,
					primaryKey);

			if (controlRequirement == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchControlRequirementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(controlRequirement);
		}
		catch (NoSuchControlRequirementException nsee) {
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
	protected ControlRequirement removeImpl(
		ControlRequirement controlRequirement) throws SystemException {
		controlRequirement = toUnwrappedModel(controlRequirement);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(controlRequirement)) {
				controlRequirement = (ControlRequirement)session.get(ControlRequirementImpl.class,
						controlRequirement.getPrimaryKeyObj());
			}

			if (controlRequirement != null) {
				session.delete(controlRequirement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (controlRequirement != null) {
			clearCache(controlRequirement);
		}

		return controlRequirement;
	}

	@Override
	public ControlRequirement updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws SystemException {
		controlRequirement = toUnwrappedModel(controlRequirement);

		boolean isNew = controlRequirement.isNew();

		ControlRequirementModelImpl controlRequirementModelImpl = (ControlRequirementModelImpl)controlRequirement;

		Session session = null;

		try {
			session = openSession();

			if (controlRequirement.isNew()) {
				session.save(controlRequirement);

				controlRequirement.setNew(false);
			}
			else {
				session.merge(controlRequirement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ControlRequirementModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((controlRequirementModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						controlRequirementModelImpl.getOriginalRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);

				args = new Object[] {
						controlRequirementModelImpl.getRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);
			}

			if ((controlRequirementModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						controlRequirementModelImpl.getOriginalPhieuxulyphuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);

				args = new Object[] {
						controlRequirementModelImpl.getPhieuxulyphuId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYPHUID,
					args);
			}
		}

		EntityCacheUtil.putResult(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
			ControlRequirementImpl.class, controlRequirement.getPrimaryKey(),
			controlRequirement);

		clearUniqueFindersCache(controlRequirement);
		cacheUniqueFindersCache(controlRequirement);

		return controlRequirement;
	}

	protected ControlRequirement toUnwrappedModel(
		ControlRequirement controlRequirement) {
		if (controlRequirement instanceof ControlRequirementImpl) {
			return controlRequirement;
		}

		ControlRequirementImpl controlRequirementImpl = new ControlRequirementImpl();

		controlRequirementImpl.setNew(controlRequirement.isNew());
		controlRequirementImpl.setPrimaryKey(controlRequirement.getPrimaryKey());

		controlRequirementImpl.setId(controlRequirement.getId());
		controlRequirementImpl.setRegisteredInspectionId(controlRequirement.getRegisteredInspectionId());
		controlRequirementImpl.setRequirementNumber(controlRequirement.getRequirementNumber());
		controlRequirementImpl.setRequirementDate(controlRequirement.getRequirementDate());
		controlRequirementImpl.setCorporationId(controlRequirement.getCorporationId());
		controlRequirementImpl.setControlContent(controlRequirement.getControlContent());
		controlRequirementImpl.setControlDeadline(controlRequirement.getControlDeadline());
		controlRequirementImpl.setAttachedFile(controlRequirement.getAttachedFile());
		controlRequirementImpl.setRequirementContent(controlRequirement.getRequirementContent());
		controlRequirementImpl.setControlReportDeadline(controlRequirement.getControlReportDeadline());
		controlRequirementImpl.setRemarks(controlRequirement.getRemarks());
		controlRequirementImpl.setSignName(controlRequirement.getSignName());
		controlRequirementImpl.setSignTitle(controlRequirement.getSignTitle());
		controlRequirementImpl.setSignPlace(controlRequirement.getSignPlace());
		controlRequirementImpl.setSignDate(controlRequirement.getSignDate());
		controlRequirementImpl.setInspectionrecordId(controlRequirement.getInspectionrecordId());
		controlRequirementImpl.setPhieuxulyphuId(controlRequirement.getPhieuxulyphuId());
		controlRequirementImpl.setSynchdate(controlRequirement.getSynchdate());

		return controlRequirementImpl;
	}

	/**
	 * Returns the control requirement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the control requirement
	 * @return the control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchControlRequirementException, SystemException {
		ControlRequirement controlRequirement = fetchByPrimaryKey(primaryKey);

		if (controlRequirement == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchControlRequirementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return controlRequirement;
	}

	/**
	 * Returns the control requirement with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException} if it could not be found.
	 *
	 * @param id the primary key of the control requirement
	 * @return the control requirement
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement findByPrimaryKey(long id)
		throws NoSuchControlRequirementException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the control requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the control requirement
	 * @return the control requirement, or <code>null</code> if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ControlRequirement controlRequirement = (ControlRequirement)EntityCacheUtil.getResult(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
				ControlRequirementImpl.class, primaryKey);

		if (controlRequirement == _nullControlRequirement) {
			return null;
		}

		if (controlRequirement == null) {
			Session session = null;

			try {
				session = openSession();

				controlRequirement = (ControlRequirement)session.get(ControlRequirementImpl.class,
						primaryKey);

				if (controlRequirement != null) {
					cacheResult(controlRequirement);
				}
				else {
					EntityCacheUtil.putResult(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
						ControlRequirementImpl.class, primaryKey,
						_nullControlRequirement);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ControlRequirementModelImpl.ENTITY_CACHE_ENABLED,
					ControlRequirementImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return controlRequirement;
	}

	/**
	 * Returns the control requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the control requirement
	 * @return the control requirement, or <code>null</code> if a control requirement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ControlRequirement fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the control requirements.
	 *
	 * @return the control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the control requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of control requirements
	 * @param end the upper bound of the range of control requirements (not inclusive)
	 * @return the range of control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the control requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of control requirements
	 * @param end the upper bound of the range of control requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of control requirements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ControlRequirement> findAll(int start, int end,
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

		List<ControlRequirement> list = (List<ControlRequirement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONTROLREQUIREMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTROLREQUIREMENT;

				if (pagination) {
					sql = sql.concat(ControlRequirementModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ControlRequirement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ControlRequirement>(list);
				}
				else {
					list = (List<ControlRequirement>)QueryUtil.list(q,
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
	 * Removes all the control requirements from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ControlRequirement controlRequirement : findAll()) {
			remove(controlRequirement);
		}
	}

	/**
	 * Returns the number of control requirements.
	 *
	 * @return the number of control requirements
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

				Query q = session.createQuery(_SQL_COUNT_CONTROLREQUIREMENT);

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
	 * Initializes the control requirement persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ControlRequirement>> listenersList = new ArrayList<ModelListener<ControlRequirement>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ControlRequirement>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ControlRequirementImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONTROLREQUIREMENT = "SELECT controlRequirement FROM ControlRequirement controlRequirement";
	private static final String _SQL_SELECT_CONTROLREQUIREMENT_WHERE = "SELECT controlRequirement FROM ControlRequirement controlRequirement WHERE ";
	private static final String _SQL_COUNT_CONTROLREQUIREMENT = "SELECT COUNT(controlRequirement) FROM ControlRequirement controlRequirement";
	private static final String _SQL_COUNT_CONTROLREQUIREMENT_WHERE = "SELECT COUNT(controlRequirement) FROM ControlRequirement controlRequirement WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "controlRequirement.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ControlRequirement exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ControlRequirement exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ControlRequirementPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "requirementNumber", "requirementDate",
				"corporationId", "controlContent", "controlDeadline",
				"attachedFile", "requirementContent", "controlReportDeadline",
				"signName", "signTitle", "signPlace", "signDate",
				"inspectionrecordId", "phieuxulyphuId"
			});
	private static ControlRequirement _nullControlRequirement = new ControlRequirementImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ControlRequirement> toCacheModel() {
				return _nullControlRequirementCacheModel;
			}
		};

	private static CacheModel<ControlRequirement> _nullControlRequirementCacheModel =
		new CacheModel<ControlRequirement>() {
			@Override
			public ControlRequirement toEntityModel() {
				return _nullControlRequirement;
			}
		};
}