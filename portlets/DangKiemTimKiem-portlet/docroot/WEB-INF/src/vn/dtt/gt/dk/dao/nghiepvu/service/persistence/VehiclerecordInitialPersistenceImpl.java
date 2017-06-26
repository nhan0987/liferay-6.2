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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vehiclerecord initial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehiclerecordInitialPersistence
 * @see VehiclerecordInitialUtil
 * @generated
 */
public class VehiclerecordInitialPersistenceImpl extends BasePersistenceImpl<VehiclerecordInitial>
	implements VehiclerecordInitialPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehiclerecordInitialUtil} to access the vehiclerecord initial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehiclerecordInitialImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED,
			VehiclerecordInitialImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED,
			VehiclerecordInitialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED,
			VehiclerecordInitialImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED,
			VehiclerecordInitialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			VehiclerecordInitialModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehiclerecord initials where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehiclerecordInitial> findByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehiclerecord initials where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of vehiclerecord initials
	 * @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	 * @return the range of matching vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehiclerecord initials where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of vehiclerecord initials
	 * @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID;
			finderArgs = new Object[] { vehicleGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID;
			finderArgs = new Object[] {
					vehicleGroupId,
					
					start, end, orderByComparator
				};
		}

		List<VehiclerecordInitial> list = (List<VehiclerecordInitial>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehiclerecordInitial vehiclerecordInitial : list) {
				if ((vehicleGroupId != vehiclerecordInitial.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_VEHICLERECORDINITIAL_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehiclerecordInitialModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<VehiclerecordInitial>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehiclerecordInitial>(list);
				}
				else {
					list = (List<VehiclerecordInitial>)QueryUtil.list(q,
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
	 * Returns the first vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehiclerecord initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchVehiclerecordInitialException, SystemException {
		VehiclerecordInitial vehiclerecordInitial = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (vehiclerecordInitial != null) {
			return vehiclerecordInitial;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehiclerecordInitialException(msg.toString());
	}

	/**
	 * Returns the first vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehiclerecordInitial> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehiclerecord initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial findByVehicleGroupId_Last(long vehicleGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchVehiclerecordInitialException, SystemException {
		VehiclerecordInitial vehiclerecordInitial = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (vehiclerecordInitial != null) {
			return vehiclerecordInitial;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehiclerecordInitialException(msg.toString());
	}

	/**
	 * Returns the last vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<VehiclerecordInitial> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehiclerecord initials before and after the current vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current vehiclerecord initial
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehiclerecord initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial[] findByVehicleGroupId_PrevAndNext(long id,
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchVehiclerecordInitialException, SystemException {
		VehiclerecordInitial vehiclerecordInitial = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehiclerecordInitial[] array = new VehiclerecordInitialImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					vehiclerecordInitial, vehicleGroupId, orderByComparator,
					true);

			array[1] = vehiclerecordInitial;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					vehiclerecordInitial, vehicleGroupId, orderByComparator,
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

	protected VehiclerecordInitial getByVehicleGroupId_PrevAndNext(
		Session session, VehiclerecordInitial vehiclerecordInitial,
		long vehicleGroupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLERECORDINITIAL_WHERE);

		query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

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
			query.append(VehiclerecordInitialModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehiclerecordInitial);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehiclerecordInitial> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehiclerecord initials where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (VehiclerecordInitial vehiclerecordInitial : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehiclerecordInitial);
		}
	}

	/**
	 * Returns the number of vehiclerecord initials where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLEGROUPID;

		Object[] finderArgs = new Object[] { vehicleGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORDINITIAL_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "vehiclerecordInitial.vehicleGroupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CODENUMBER = new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED,
			VehiclerecordInitialImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCodeNumber", new String[] { Long.class.getName() },
			VehiclerecordInitialModelImpl.CODENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODENUMBER = new FinderPath(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCodeNumber",
			new String[] { Long.class.getName() });

	/**
	 * Returns the vehiclerecord initial where codeNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException} if it could not be found.
	 *
	 * @param codeNumber the code number
	 * @return the matching vehiclerecord initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial findByCodeNumber(long codeNumber)
		throws NoSuchVehiclerecordInitialException, SystemException {
		VehiclerecordInitial vehiclerecordInitial = fetchByCodeNumber(codeNumber);

		if (vehiclerecordInitial == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("codeNumber=");
			msg.append(codeNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVehiclerecordInitialException(msg.toString());
		}

		return vehiclerecordInitial;
	}

	/**
	 * Returns the vehiclerecord initial where codeNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param codeNumber the code number
	 * @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial fetchByCodeNumber(long codeNumber)
		throws SystemException {
		return fetchByCodeNumber(codeNumber, true);
	}

	/**
	 * Returns the vehiclerecord initial where codeNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param codeNumber the code number
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial fetchByCodeNumber(long codeNumber,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { codeNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODENUMBER,
					finderArgs, this);
		}

		if (result instanceof VehiclerecordInitial) {
			VehiclerecordInitial vehiclerecordInitial = (VehiclerecordInitial)result;

			if ((codeNumber != vehiclerecordInitial.getCodeNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VEHICLERECORDINITIAL_WHERE);

			query.append(_FINDER_COLUMN_CODENUMBER_CODENUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(codeNumber);

				List<VehiclerecordInitial> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"VehiclerecordInitialPersistenceImpl.fetchByCodeNumber(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					VehiclerecordInitial vehiclerecordInitial = list.get(0);

					result = vehiclerecordInitial;

					cacheResult(vehiclerecordInitial);

					if ((vehiclerecordInitial.getCodeNumber() != codeNumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
							finderArgs, vehiclerecordInitial);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODENUMBER,
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
			return (VehiclerecordInitial)result;
		}
	}

	/**
	 * Removes the vehiclerecord initial where codeNumber = &#63; from the database.
	 *
	 * @param codeNumber the code number
	 * @return the vehiclerecord initial that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial removeByCodeNumber(long codeNumber)
		throws NoSuchVehiclerecordInitialException, SystemException {
		VehiclerecordInitial vehiclerecordInitial = findByCodeNumber(codeNumber);

		return remove(vehiclerecordInitial);
	}

	/**
	 * Returns the number of vehiclerecord initials where codeNumber = &#63;.
	 *
	 * @param codeNumber the code number
	 * @return the number of matching vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodeNumber(long codeNumber) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODENUMBER;

		Object[] finderArgs = new Object[] { codeNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLERECORDINITIAL_WHERE);

			query.append(_FINDER_COLUMN_CODENUMBER_CODENUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(codeNumber);

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

	private static final String _FINDER_COLUMN_CODENUMBER_CODENUMBER_2 = "vehiclerecordInitial.codeNumber = ?";

	public VehiclerecordInitialPersistenceImpl() {
		setModelClass(VehiclerecordInitial.class);
	}

	/**
	 * Caches the vehiclerecord initial in the entity cache if it is enabled.
	 *
	 * @param vehiclerecordInitial the vehiclerecord initial
	 */
	@Override
	public void cacheResult(VehiclerecordInitial vehiclerecordInitial) {
		EntityCacheUtil.putResult(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialImpl.class,
			vehiclerecordInitial.getPrimaryKey(), vehiclerecordInitial);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
			new Object[] { vehiclerecordInitial.getCodeNumber() },
			vehiclerecordInitial);

		vehiclerecordInitial.resetOriginalValues();
	}

	/**
	 * Caches the vehiclerecord initials in the entity cache if it is enabled.
	 *
	 * @param vehiclerecordInitials the vehiclerecord initials
	 */
	@Override
	public void cacheResult(List<VehiclerecordInitial> vehiclerecordInitials) {
		for (VehiclerecordInitial vehiclerecordInitial : vehiclerecordInitials) {
			if (EntityCacheUtil.getResult(
						VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
						VehiclerecordInitialImpl.class,
						vehiclerecordInitial.getPrimaryKey()) == null) {
				cacheResult(vehiclerecordInitial);
			}
			else {
				vehiclerecordInitial.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehiclerecord initials.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehiclerecordInitialImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehiclerecordInitialImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehiclerecord initial.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehiclerecordInitial vehiclerecordInitial) {
		EntityCacheUtil.removeResult(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialImpl.class, vehiclerecordInitial.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(vehiclerecordInitial);
	}

	@Override
	public void clearCache(List<VehiclerecordInitial> vehiclerecordInitials) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehiclerecordInitial vehiclerecordInitial : vehiclerecordInitials) {
			EntityCacheUtil.removeResult(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
				VehiclerecordInitialImpl.class,
				vehiclerecordInitial.getPrimaryKey());

			clearUniqueFindersCache(vehiclerecordInitial);
		}
	}

	protected void cacheUniqueFindersCache(
		VehiclerecordInitial vehiclerecordInitial) {
		if (vehiclerecordInitial.isNew()) {
			Object[] args = new Object[] { vehiclerecordInitial.getCodeNumber() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODENUMBER, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER, args,
				vehiclerecordInitial);
		}
		else {
			VehiclerecordInitialModelImpl vehiclerecordInitialModelImpl = (VehiclerecordInitialModelImpl)vehiclerecordInitial;

			if ((vehiclerecordInitialModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehiclerecordInitial.getCodeNumber()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODENUMBER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODENUMBER,
					args, vehiclerecordInitial);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VehiclerecordInitial vehiclerecordInitial) {
		VehiclerecordInitialModelImpl vehiclerecordInitialModelImpl = (VehiclerecordInitialModelImpl)vehiclerecordInitial;

		Object[] args = new Object[] { vehiclerecordInitial.getCodeNumber() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODENUMBER, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODENUMBER, args);

		if ((vehiclerecordInitialModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODENUMBER.getColumnBitmask()) != 0) {
			args = new Object[] {
					vehiclerecordInitialModelImpl.getOriginalCodeNumber()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODENUMBER, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODENUMBER, args);
		}
	}

	/**
	 * Creates a new vehiclerecord initial with the primary key. Does not add the vehiclerecord initial to the database.
	 *
	 * @param id the primary key for the new vehiclerecord initial
	 * @return the new vehiclerecord initial
	 */
	@Override
	public VehiclerecordInitial create(long id) {
		VehiclerecordInitial vehiclerecordInitial = new VehiclerecordInitialImpl();

		vehiclerecordInitial.setNew(true);
		vehiclerecordInitial.setPrimaryKey(id);

		return vehiclerecordInitial;
	}

	/**
	 * Removes the vehiclerecord initial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial remove(long id)
		throws NoSuchVehiclerecordInitialException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehiclerecord initial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial remove(Serializable primaryKey)
		throws NoSuchVehiclerecordInitialException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehiclerecordInitial vehiclerecordInitial = (VehiclerecordInitial)session.get(VehiclerecordInitialImpl.class,
					primaryKey);

			if (vehiclerecordInitial == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehiclerecordInitialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehiclerecordInitial);
		}
		catch (NoSuchVehiclerecordInitialException nsee) {
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
	protected VehiclerecordInitial removeImpl(
		VehiclerecordInitial vehiclerecordInitial) throws SystemException {
		vehiclerecordInitial = toUnwrappedModel(vehiclerecordInitial);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehiclerecordInitial)) {
				vehiclerecordInitial = (VehiclerecordInitial)session.get(VehiclerecordInitialImpl.class,
						vehiclerecordInitial.getPrimaryKeyObj());
			}

			if (vehiclerecordInitial != null) {
				session.delete(vehiclerecordInitial);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehiclerecordInitial != null) {
			clearCache(vehiclerecordInitial);
		}

		return vehiclerecordInitial;
	}

	@Override
	public VehiclerecordInitial updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial)
		throws SystemException {
		vehiclerecordInitial = toUnwrappedModel(vehiclerecordInitial);

		boolean isNew = vehiclerecordInitial.isNew();

		VehiclerecordInitialModelImpl vehiclerecordInitialModelImpl = (VehiclerecordInitialModelImpl)vehiclerecordInitial;

		Session session = null;

		try {
			session = openSession();

			if (vehiclerecordInitial.isNew()) {
				session.save(vehiclerecordInitial);

				vehiclerecordInitial.setNew(false);
			}
			else {
				session.merge(vehiclerecordInitial);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VehiclerecordInitialModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vehiclerecordInitialModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehiclerecordInitialModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						vehiclerecordInitialModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
			VehiclerecordInitialImpl.class,
			vehiclerecordInitial.getPrimaryKey(), vehiclerecordInitial);

		clearUniqueFindersCache(vehiclerecordInitial);
		cacheUniqueFindersCache(vehiclerecordInitial);

		return vehiclerecordInitial;
	}

	protected VehiclerecordInitial toUnwrappedModel(
		VehiclerecordInitial vehiclerecordInitial) {
		if (vehiclerecordInitial instanceof VehiclerecordInitialImpl) {
			return vehiclerecordInitial;
		}

		VehiclerecordInitialImpl vehiclerecordInitialImpl = new VehiclerecordInitialImpl();

		vehiclerecordInitialImpl.setNew(vehiclerecordInitial.isNew());
		vehiclerecordInitialImpl.setPrimaryKey(vehiclerecordInitial.getPrimaryKey());

		vehiclerecordInitialImpl.setId(vehiclerecordInitial.getId());
		vehiclerecordInitialImpl.setVehicleGroupId(vehiclerecordInitial.getVehicleGroupId());
		vehiclerecordInitialImpl.setSequenceNo(vehiclerecordInitial.getSequenceNo());
		vehiclerecordInitialImpl.setCodeNumber(vehiclerecordInitial.getCodeNumber());
		vehiclerecordInitialImpl.setChassisNumber(vehiclerecordInitial.getChassisNumber());
		vehiclerecordInitialImpl.setEngineNumber(vehiclerecordInitial.getEngineNumber());
		vehiclerecordInitialImpl.setProductionYear(vehiclerecordInitial.getProductionYear());
		vehiclerecordInitialImpl.setVehicleEngineStatus(vehiclerecordInitial.getVehicleEngineStatus());
		vehiclerecordInitialImpl.setVehicleColor(vehiclerecordInitial.getVehicleColor());
		vehiclerecordInitialImpl.setUnitPrice(vehiclerecordInitial.getUnitPrice());
		vehiclerecordInitialImpl.setCurrency(vehiclerecordInitial.getCurrency());
		vehiclerecordInitialImpl.setRemarks(vehiclerecordInitial.getRemarks());
		vehiclerecordInitialImpl.setConfirmedInspectionId(vehiclerecordInitial.getConfirmedInspectionId());
		vehiclerecordInitialImpl.setInspectionRecordId(vehiclerecordInitial.getInspectionRecordId());
		vehiclerecordInitialImpl.setDraftCertificateId(vehiclerecordInitial.getDraftCertificateId());
		vehiclerecordInitialImpl.setCertificateRecordId(vehiclerecordInitial.getCertificateRecordId());
		vehiclerecordInitialImpl.setMarkUpStatus(vehiclerecordInitial.getMarkUpStatus());
		vehiclerecordInitialImpl.setSafeTestRequirementId(vehiclerecordInitial.getSafeTestRequirementId());
		vehiclerecordInitialImpl.setEmissionTestRequirementId(vehiclerecordInitial.getEmissionTestRequirementId());
		vehiclerecordInitialImpl.setControlRequirementId(vehiclerecordInitial.getControlRequirementId());

		return vehiclerecordInitialImpl;
	}

	/**
	 * Returns the vehiclerecord initial with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehiclerecordInitialException, SystemException {
		VehiclerecordInitial vehiclerecordInitial = fetchByPrimaryKey(primaryKey);

		if (vehiclerecordInitial == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehiclerecordInitialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehiclerecordInitial;
	}

	/**
	 * Returns the vehiclerecord initial with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException} if it could not be found.
	 *
	 * @param id the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial findByPrimaryKey(long id)
		throws NoSuchVehiclerecordInitialException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehiclerecord initial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial, or <code>null</code> if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehiclerecordInitial vehiclerecordInitial = (VehiclerecordInitial)EntityCacheUtil.getResult(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
				VehiclerecordInitialImpl.class, primaryKey);

		if (vehiclerecordInitial == _nullVehiclerecordInitial) {
			return null;
		}

		if (vehiclerecordInitial == null) {
			Session session = null;

			try {
				session = openSession();

				vehiclerecordInitial = (VehiclerecordInitial)session.get(VehiclerecordInitialImpl.class,
						primaryKey);

				if (vehiclerecordInitial != null) {
					cacheResult(vehiclerecordInitial);
				}
				else {
					EntityCacheUtil.putResult(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
						VehiclerecordInitialImpl.class, primaryKey,
						_nullVehiclerecordInitial);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehiclerecordInitialModelImpl.ENTITY_CACHE_ENABLED,
					VehiclerecordInitialImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehiclerecordInitial;
	}

	/**
	 * Returns the vehiclerecord initial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial, or <code>null</code> if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehiclerecord initials.
	 *
	 * @return the vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehiclerecordInitial> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehiclerecord initials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehiclerecord initials
	 * @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	 * @return the range of vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehiclerecordInitial> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehiclerecord initials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehiclerecord initials
	 * @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehiclerecordInitial> findAll(int start, int end,
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

		List<VehiclerecordInitial> list = (List<VehiclerecordInitial>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLERECORDINITIAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLERECORDINITIAL;

				if (pagination) {
					sql = sql.concat(VehiclerecordInitialModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehiclerecordInitial>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehiclerecordInitial>(list);
				}
				else {
					list = (List<VehiclerecordInitial>)QueryUtil.list(q,
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
	 * Removes all the vehiclerecord initials from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehiclerecordInitial vehiclerecordInitial : findAll()) {
			remove(vehiclerecordInitial);
		}
	}

	/**
	 * Returns the number of vehiclerecord initials.
	 *
	 * @return the number of vehiclerecord initials
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLERECORDINITIAL);

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
	 * Initializes the vehiclerecord initial persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehiclerecordInitial>> listenersList = new ArrayList<ModelListener<VehiclerecordInitial>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehiclerecordInitial>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehiclerecordInitialImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLERECORDINITIAL = "SELECT vehiclerecordInitial FROM VehiclerecordInitial vehiclerecordInitial";
	private static final String _SQL_SELECT_VEHICLERECORDINITIAL_WHERE = "SELECT vehiclerecordInitial FROM VehiclerecordInitial vehiclerecordInitial WHERE ";
	private static final String _SQL_COUNT_VEHICLERECORDINITIAL = "SELECT COUNT(vehiclerecordInitial) FROM VehiclerecordInitial vehiclerecordInitial";
	private static final String _SQL_COUNT_VEHICLERECORDINITIAL_WHERE = "SELECT COUNT(vehiclerecordInitial) FROM VehiclerecordInitial vehiclerecordInitial WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehiclerecordInitial.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehiclerecordInitial exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VehiclerecordInitial exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehiclerecordInitialPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleGroupId", "sequenceNo", "codeNumber", "chassisNumber",
				"engineNumber", "productionYear", "vehicleEngineStatus",
				"vehicleColor", "unitPrice", "confirmedInspectionId",
				"inspectionRecordId", "draftCertificateId",
				"certificateRecordId", "markUpStatus", "safeTestRequirementId",
				"emissionTestRequirementId", "controlRequirementId"
			});
	private static VehiclerecordInitial _nullVehiclerecordInitial = new VehiclerecordInitialImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehiclerecordInitial> toCacheModel() {
				return _nullVehiclerecordInitialCacheModel;
			}
		};

	private static CacheModel<VehiclerecordInitial> _nullVehiclerecordInitialCacheModel =
		new CacheModel<VehiclerecordInitial>() {
			@Override
			public VehiclerecordInitial toEntityModel() {
				return _nullVehiclerecordInitial;
			}
		};
}