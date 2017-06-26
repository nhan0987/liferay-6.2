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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vehicle group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehicleGroupPersistence
 * @see VehicleGroupUtil
 * @generated
 */
public class VehicleGroupPersistenceImpl extends BasePersistenceImpl<VehicleGroup>
	implements VehicleGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleGroupUtil} to access the vehicle group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] { Long.class.getName() },
			VehicleGroupModelImpl.REGISTEREDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID = new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredInspectionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle groups where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByRegisteredInspectionId(
		long registeredInspectionId) throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle groups where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @return the range of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vehicle groups where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByRegisteredInspectionId(
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

		List<VehicleGroup> list = (List<VehicleGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleGroup vehicleGroup : list) {
				if ((registeredInspectionId != vehicleGroup.getRegisteredInspectionId())) {
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

			query.append(_SQL_SELECT_VEHICLEGROUP_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

				if (!pagination) {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleGroup>(list);
				}
				else {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vehicle group in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByRegisteredInspectionId_First(registeredInspectionId,
				orderByComparator);

		if (vehicleGroup != null) {
			return vehicleGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleGroupException(msg.toString());
	}

	/**
	 * Returns the first vehicle group in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleGroup> list = findByRegisteredInspectionId(registeredInspectionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle group in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByRegisteredInspectionId_Last(registeredInspectionId,
				orderByComparator);

		if (vehicleGroup != null) {
			return vehicleGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleGroupException(msg.toString());
	}

	/**
	 * Returns the last vehicle group in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRegisteredInspectionId(registeredInspectionId);

		if (count == 0) {
			return null;
		}

		List<VehicleGroup> list = findByRegisteredInspectionId(registeredInspectionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle groups before and after the current vehicle group in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param id the primary key of the current vehicle group
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup[] findByRegisteredInspectionId_PrevAndNext(long id,
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleGroup[] array = new VehicleGroupImpl[3];

			array[0] = getByRegisteredInspectionId_PrevAndNext(session,
					vehicleGroup, registeredInspectionId, orderByComparator,
					true);

			array[1] = vehicleGroup;

			array[2] = getByRegisteredInspectionId_PrevAndNext(session,
					vehicleGroup, registeredInspectionId, orderByComparator,
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

	protected VehicleGroup getByRegisteredInspectionId_PrevAndNext(
		Session session, VehicleGroup vehicleGroup,
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

		query.append(_SQL_SELECT_VEHICLEGROUP_WHERE);

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
			query.append(VehicleGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(registeredInspectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle groups where registeredInspectionId = &#63; from the database.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		for (VehicleGroup vehicleGroup : findByRegisteredInspectionId(
				registeredInspectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vehicleGroup);
		}
	}

	/**
	 * Returns the number of vehicle groups where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the number of matching vehicle groups
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

			query.append(_SQL_COUNT_VEHICLEGROUP_WHERE);

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
		"vehicleGroup.registeredInspectionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			VehicleGroupModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle groups where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle groups where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @return the range of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByHoSoThuTucId(long hoSoThuTucId, int start,
		int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle groups where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByHoSoThuTucId(long hoSoThuTucId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<VehicleGroup> list = (List<VehicleGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleGroup vehicleGroup : list) {
				if ((hoSoThuTucId != vehicleGroup.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_VEHICLEGROUP_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleGroup>(list);
				}
				else {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vehicle group in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (vehicleGroup != null) {
			return vehicleGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleGroupException(msg.toString());
	}

	/**
	 * Returns the first vehicle group in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<VehicleGroup> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle group in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (vehicleGroup != null) {
			return vehicleGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleGroupException(msg.toString());
	}

	/**
	 * Returns the last vehicle group in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<VehicleGroup> list = findByHoSoThuTucId(hoSoThuTucId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle groups before and after the current vehicle group in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current vehicle group
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleGroup[] array = new VehicleGroupImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session, vehicleGroup,
					hoSoThuTucId, orderByComparator, true);

			array[1] = vehicleGroup;

			array[2] = getByHoSoThuTucId_PrevAndNext(session, vehicleGroup,
					hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VehicleGroup getByHoSoThuTucId_PrevAndNext(Session session,
		VehicleGroup vehicleGroup, long hoSoThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLEGROUP_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

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
			query.append(VehicleGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle groups where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (VehicleGroup vehicleGroup : findByHoSoThuTucId(hoSoThuTucId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleGroup);
		}
	}

	/**
	 * Returns the number of vehicle groups where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLEGROUP_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "vehicleGroup.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TECHNICALSPECCODE =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTechnicalSpecCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TECHNICALSPECCODE =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTechnicalSpecCode", new String[] { String.class.getName() },
			VehicleGroupModelImpl.TECHNICALSPECCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TECHNICALSPECCODE = new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTechnicalSpecCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vehicle groups where technicalSpecCode = &#63;.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @return the matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByTechnicalSpecCode(String technicalSpecCode)
		throws SystemException {
		return findByTechnicalSpecCode(technicalSpecCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle groups where technicalSpecCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @return the range of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByTechnicalSpecCode(
		String technicalSpecCode, int start, int end) throws SystemException {
		return findByTechnicalSpecCode(technicalSpecCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle groups where technicalSpecCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findByTechnicalSpecCode(
		String technicalSpecCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TECHNICALSPECCODE;
			finderArgs = new Object[] { technicalSpecCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TECHNICALSPECCODE;
			finderArgs = new Object[] {
					technicalSpecCode,
					
					start, end, orderByComparator
				};
		}

		List<VehicleGroup> list = (List<VehicleGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleGroup vehicleGroup : list) {
				if (!Validator.equals(technicalSpecCode,
							vehicleGroup.getTechnicalSpecCode())) {
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

			query.append(_SQL_SELECT_VEHICLEGROUP_WHERE);

			boolean bindTechnicalSpecCode = false;

			if (technicalSpecCode == null) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_1);
			}
			else if (technicalSpecCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_3);
			}
			else {
				bindTechnicalSpecCode = true;

				query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTechnicalSpecCode) {
					qPos.add(technicalSpecCode);
				}

				if (!pagination) {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleGroup>(list);
				}
				else {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vehicle group in the ordered set where technicalSpecCode = &#63;.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByTechnicalSpecCode_First(
		String technicalSpecCode, OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByTechnicalSpecCode_First(technicalSpecCode,
				orderByComparator);

		if (vehicleGroup != null) {
			return vehicleGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("technicalSpecCode=");
		msg.append(technicalSpecCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleGroupException(msg.toString());
	}

	/**
	 * Returns the first vehicle group in the ordered set where technicalSpecCode = &#63;.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByTechnicalSpecCode_First(
		String technicalSpecCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleGroup> list = findByTechnicalSpecCode(technicalSpecCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle group in the ordered set where technicalSpecCode = &#63;.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByTechnicalSpecCode_Last(String technicalSpecCode,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByTechnicalSpecCode_Last(technicalSpecCode,
				orderByComparator);

		if (vehicleGroup != null) {
			return vehicleGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("technicalSpecCode=");
		msg.append(technicalSpecCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleGroupException(msg.toString());
	}

	/**
	 * Returns the last vehicle group in the ordered set where technicalSpecCode = &#63;.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByTechnicalSpecCode_Last(
		String technicalSpecCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTechnicalSpecCode(technicalSpecCode);

		if (count == 0) {
			return null;
		}

		List<VehicleGroup> list = findByTechnicalSpecCode(technicalSpecCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle groups before and after the current vehicle group in the ordered set where technicalSpecCode = &#63;.
	 *
	 * @param id the primary key of the current vehicle group
	 * @param technicalSpecCode the technical spec code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup[] findByTechnicalSpecCode_PrevAndNext(long id,
		String technicalSpecCode, OrderByComparator orderByComparator)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleGroup[] array = new VehicleGroupImpl[3];

			array[0] = getByTechnicalSpecCode_PrevAndNext(session,
					vehicleGroup, technicalSpecCode, orderByComparator, true);

			array[1] = vehicleGroup;

			array[2] = getByTechnicalSpecCode_PrevAndNext(session,
					vehicleGroup, technicalSpecCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VehicleGroup getByTechnicalSpecCode_PrevAndNext(Session session,
		VehicleGroup vehicleGroup, String technicalSpecCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLEGROUP_WHERE);

		boolean bindTechnicalSpecCode = false;

		if (technicalSpecCode == null) {
			query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_1);
		}
		else if (technicalSpecCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_3);
		}
		else {
			bindTechnicalSpecCode = true;

			query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_2);
		}

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
			query.append(VehicleGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTechnicalSpecCode) {
			qPos.add(technicalSpecCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle groups where technicalSpecCode = &#63; from the database.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTechnicalSpecCode(String technicalSpecCode)
		throws SystemException {
		for (VehicleGroup vehicleGroup : findByTechnicalSpecCode(
				technicalSpecCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleGroup);
		}
	}

	/**
	 * Returns the number of vehicle groups where technicalSpecCode = &#63;.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @return the number of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTechnicalSpecCode(String technicalSpecCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TECHNICALSPECCODE;

		Object[] finderArgs = new Object[] { technicalSpecCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLEGROUP_WHERE);

			boolean bindTechnicalSpecCode = false;

			if (technicalSpecCode == null) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_1);
			}
			else if (technicalSpecCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_3);
			}
			else {
				bindTechnicalSpecCode = true;

				query.append(_FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTechnicalSpecCode) {
					qPos.add(technicalSpecCode);
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

	private static final String _FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_1 =
		"vehicleGroup.technicalSpecCode IS NULL";
	private static final String _FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_2 =
		"vehicleGroup.technicalSpecCode = ?";
	private static final String _FINDER_COLUMN_TECHNICALSPECCODE_TECHNICALSPECCODE_3 =
		"(vehicleGroup.technicalSpecCode IS NULL OR vehicleGroup.technicalSpecCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, VehicleGroupImpl.class,
			FINDER_CLASS_NAME_ENTITY,
			"fetchByTechnicalSpecCodeAndRegisteredInspectionId",
			new String[] { String.class.getName(), Long.class.getName() },
			VehicleGroupModelImpl.TECHNICALSPECCODE_COLUMN_BITMASK |
			VehicleGroupModelImpl.REGISTEREDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID =
		new FinderPath(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTechnicalSpecCodeAndRegisteredInspectionId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException} if it could not be found.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByTechnicalSpecCodeAndRegisteredInspectionId(
		String technicalSpecCode, long registeredInspectionId)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
				registeredInspectionId);

		if (vehicleGroup == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("technicalSpecCode=");
			msg.append(technicalSpecCode);

			msg.append(", registeredInspectionId=");
			msg.append(registeredInspectionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVehicleGroupException(msg.toString());
		}

		return vehicleGroup;
	}

	/**
	 * Returns the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByTechnicalSpecCodeAndRegisteredInspectionId(
		String technicalSpecCode, long registeredInspectionId)
		throws SystemException {
		return fetchByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
			registeredInspectionId, true);
	}

	/**
	 * Returns the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param registeredInspectionId the registered inspection ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByTechnicalSpecCodeAndRegisteredInspectionId(
		String technicalSpecCode, long registeredInspectionId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				technicalSpecCode, registeredInspectionId
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
					finderArgs, this);
		}

		if (result instanceof VehicleGroup) {
			VehicleGroup vehicleGroup = (VehicleGroup)result;

			if (!Validator.equals(technicalSpecCode,
						vehicleGroup.getTechnicalSpecCode()) ||
					(registeredInspectionId != vehicleGroup.getRegisteredInspectionId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VEHICLEGROUP_WHERE);

			boolean bindTechnicalSpecCode = false;

			if (technicalSpecCode == null) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_1);
			}
			else if (technicalSpecCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_3);
			}
			else {
				bindTechnicalSpecCode = true;

				query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_2);
			}

			query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTechnicalSpecCode) {
					qPos.add(technicalSpecCode);
				}

				qPos.add(registeredInspectionId);

				List<VehicleGroup> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"VehicleGroupPersistenceImpl.fetchByTechnicalSpecCodeAndRegisteredInspectionId(String, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					VehicleGroup vehicleGroup = list.get(0);

					result = vehicleGroup;

					cacheResult(vehicleGroup);

					if ((vehicleGroup.getTechnicalSpecCode() == null) ||
							!vehicleGroup.getTechnicalSpecCode()
											 .equals(technicalSpecCode) ||
							(vehicleGroup.getRegisteredInspectionId() != registeredInspectionId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
							finderArgs, vehicleGroup);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
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
			return (VehicleGroup)result;
		}
	}

	/**
	 * Removes the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; from the database.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param registeredInspectionId the registered inspection ID
	 * @return the vehicle group that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup removeByTechnicalSpecCodeAndRegisteredInspectionId(
		String technicalSpecCode, long registeredInspectionId)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = findByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
				registeredInspectionId);

		return remove(vehicleGroup);
	}

	/**
	 * Returns the number of vehicle groups where technicalSpecCode = &#63; and registeredInspectionId = &#63;.
	 *
	 * @param technicalSpecCode the technical spec code
	 * @param registeredInspectionId the registered inspection ID
	 * @return the number of matching vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTechnicalSpecCodeAndRegisteredInspectionId(
		String technicalSpecCode, long registeredInspectionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID;

		Object[] finderArgs = new Object[] {
				technicalSpecCode, registeredInspectionId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VEHICLEGROUP_WHERE);

			boolean bindTechnicalSpecCode = false;

			if (technicalSpecCode == null) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_1);
			}
			else if (technicalSpecCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_3);
			}
			else {
				bindTechnicalSpecCode = true;

				query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_2);
			}

			query.append(_FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTechnicalSpecCode) {
					qPos.add(technicalSpecCode);
				}

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

	private static final String _FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_1 =
		"vehicleGroup.technicalSpecCode IS NULL AND ";
	private static final String _FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_2 =
		"vehicleGroup.technicalSpecCode = ? AND ";
	private static final String _FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_TECHNICALSPECCODE_3 =
		"(vehicleGroup.technicalSpecCode IS NULL OR vehicleGroup.technicalSpecCode = '') AND ";
	private static final String _FINDER_COLUMN_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2 =
		"vehicleGroup.registeredInspectionId = ?";

	public VehicleGroupPersistenceImpl() {
		setModelClass(VehicleGroup.class);
	}

	/**
	 * Caches the vehicle group in the entity cache if it is enabled.
	 *
	 * @param vehicleGroup the vehicle group
	 */
	@Override
	public void cacheResult(VehicleGroup vehicleGroup) {
		EntityCacheUtil.putResult(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupImpl.class, vehicleGroup.getPrimaryKey(), vehicleGroup);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
			new Object[] {
				vehicleGroup.getTechnicalSpecCode(),
				vehicleGroup.getRegisteredInspectionId()
			}, vehicleGroup);

		vehicleGroup.resetOriginalValues();
	}

	/**
	 * Caches the vehicle groups in the entity cache if it is enabled.
	 *
	 * @param vehicleGroups the vehicle groups
	 */
	@Override
	public void cacheResult(List<VehicleGroup> vehicleGroups) {
		for (VehicleGroup vehicleGroup : vehicleGroups) {
			if (EntityCacheUtil.getResult(
						VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
						VehicleGroupImpl.class, vehicleGroup.getPrimaryKey()) == null) {
				cacheResult(vehicleGroup);
			}
			else {
				vehicleGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle groups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleGroupImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleGroupImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle group.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehicleGroup vehicleGroup) {
		EntityCacheUtil.removeResult(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupImpl.class, vehicleGroup.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(vehicleGroup);
	}

	@Override
	public void clearCache(List<VehicleGroup> vehicleGroups) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehicleGroup vehicleGroup : vehicleGroups) {
			EntityCacheUtil.removeResult(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
				VehicleGroupImpl.class, vehicleGroup.getPrimaryKey());

			clearUniqueFindersCache(vehicleGroup);
		}
	}

	protected void cacheUniqueFindersCache(VehicleGroup vehicleGroup) {
		if (vehicleGroup.isNew()) {
			Object[] args = new Object[] {
					vehicleGroup.getTechnicalSpecCode(),
					vehicleGroup.getRegisteredInspectionId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
				args, vehicleGroup);
		}
		else {
			VehicleGroupModelImpl vehicleGroupModelImpl = (VehicleGroupModelImpl)vehicleGroup;

			if ((vehicleGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleGroup.getTechnicalSpecCode(),
						vehicleGroup.getRegisteredInspectionId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
					args, vehicleGroup);
			}
		}
	}

	protected void clearUniqueFindersCache(VehicleGroup vehicleGroup) {
		VehicleGroupModelImpl vehicleGroupModelImpl = (VehicleGroupModelImpl)vehicleGroup;

		Object[] args = new Object[] {
				vehicleGroup.getTechnicalSpecCode(),
				vehicleGroup.getRegisteredInspectionId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
			args);

		if ((vehicleGroupModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
			args = new Object[] {
					vehicleGroupModelImpl.getOriginalTechnicalSpecCode(),
					vehicleGroupModelImpl.getOriginalRegisteredInspectionId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TECHNICALSPECCODEANDREGISTEREDINSPECTIONID,
				args);
		}
	}

	/**
	 * Creates a new vehicle group with the primary key. Does not add the vehicle group to the database.
	 *
	 * @param id the primary key for the new vehicle group
	 * @return the new vehicle group
	 */
	@Override
	public VehicleGroup create(long id) {
		VehicleGroup vehicleGroup = new VehicleGroupImpl();

		vehicleGroup.setNew(true);
		vehicleGroup.setPrimaryKey(id);

		return vehicleGroup;
	}

	/**
	 * Removes the vehicle group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehicle group
	 * @return the vehicle group that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup remove(long id)
		throws NoSuchVehicleGroupException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehicle group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle group
	 * @return the vehicle group that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup remove(Serializable primaryKey)
		throws NoSuchVehicleGroupException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehicleGroup vehicleGroup = (VehicleGroup)session.get(VehicleGroupImpl.class,
					primaryKey);

			if (vehicleGroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicleGroup);
		}
		catch (NoSuchVehicleGroupException nsee) {
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
	protected VehicleGroup removeImpl(VehicleGroup vehicleGroup)
		throws SystemException {
		vehicleGroup = toUnwrappedModel(vehicleGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicleGroup)) {
				vehicleGroup = (VehicleGroup)session.get(VehicleGroupImpl.class,
						vehicleGroup.getPrimaryKeyObj());
			}

			if (vehicleGroup != null) {
				session.delete(vehicleGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicleGroup != null) {
			clearCache(vehicleGroup);
		}

		return vehicleGroup;
	}

	@Override
	public VehicleGroup updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup vehicleGroup)
		throws SystemException {
		vehicleGroup = toUnwrappedModel(vehicleGroup);

		boolean isNew = vehicleGroup.isNew();

		VehicleGroupModelImpl vehicleGroupModelImpl = (VehicleGroupModelImpl)vehicleGroup;

		Session session = null;

		try {
			session = openSession();

			if (vehicleGroup.isNew()) {
				session.save(vehicleGroup);

				vehicleGroup.setNew(false);
			}
			else {
				session.merge(vehicleGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VehicleGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vehicleGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleGroupModelImpl.getOriginalRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);

				args = new Object[] {
						vehicleGroupModelImpl.getRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);
			}

			if ((vehicleGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleGroupModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] { vehicleGroupModelImpl.getHoSoThuTucId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((vehicleGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TECHNICALSPECCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleGroupModelImpl.getOriginalTechnicalSpecCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TECHNICALSPECCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TECHNICALSPECCODE,
					args);

				args = new Object[] { vehicleGroupModelImpl.getTechnicalSpecCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TECHNICALSPECCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TECHNICALSPECCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
			VehicleGroupImpl.class, vehicleGroup.getPrimaryKey(), vehicleGroup);

		clearUniqueFindersCache(vehicleGroup);
		cacheUniqueFindersCache(vehicleGroup);

		return vehicleGroup;
	}

	protected VehicleGroup toUnwrappedModel(VehicleGroup vehicleGroup) {
		if (vehicleGroup instanceof VehicleGroupImpl) {
			return vehicleGroup;
		}

		VehicleGroupImpl vehicleGroupImpl = new VehicleGroupImpl();

		vehicleGroupImpl.setNew(vehicleGroup.isNew());
		vehicleGroupImpl.setPrimaryKey(vehicleGroup.getPrimaryKey());

		vehicleGroupImpl.setId(vehicleGroup.getId());
		vehicleGroupImpl.setVehicleClass(vehicleGroup.getVehicleClass());
		vehicleGroupImpl.setRegisteredInspectionId(vehicleGroup.getRegisteredInspectionId());
		vehicleGroupImpl.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
		vehicleGroupImpl.setReferenceCertificateNo(vehicleGroup.getReferenceCertificateNo());
		vehicleGroupImpl.setSafetytestreportNo(vehicleGroup.getSafetytestreportNo());
		vehicleGroupImpl.setEmissiontestreportNo(vehicleGroup.getEmissiontestreportNo());
		vehicleGroupImpl.setCopreportNo(vehicleGroup.getCopreportNo());
		vehicleGroupImpl.setVehicleType(vehicleGroup.getVehicleType());
		vehicleGroupImpl.setEngineType(vehicleGroup.getEngineType());
		vehicleGroupImpl.setTradeMark(vehicleGroup.getTradeMark());
		vehicleGroupImpl.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
		vehicleGroupImpl.setCommercialName(vehicleGroup.getCommercialName());
		vehicleGroupImpl.setModelCode(vehicleGroup.getModelCode());
		vehicleGroupImpl.setProductionPlant(vehicleGroup.getProductionPlant());
		vehicleGroupImpl.setAddressOfProductionPlant(vehicleGroup.getAddressOfProductionPlant());
		vehicleGroupImpl.setEmissionStandard(vehicleGroup.getEmissionStandard());
		vehicleGroupImpl.setSafetyTestReportId(vehicleGroup.getSafetyTestReportId());
		vehicleGroupImpl.setEmissionTestReportId(vehicleGroup.getEmissionTestReportId());
		vehicleGroupImpl.setCopReportId(vehicleGroup.getCopReportId());
		vehicleGroupImpl.setSpecificationVersion(vehicleGroup.getSpecificationVersion());
		vehicleGroupImpl.setHoSoThuTucId(vehicleGroup.getHoSoThuTucId());
		vehicleGroupImpl.setRemarks(vehicleGroup.getRemarks());
		vehicleGroupImpl.setAttachedFile(vehicleGroup.getAttachedFile());
		vehicleGroupImpl.setSynchdate(vehicleGroup.getSynchdate());

		return vehicleGroupImpl;
	}

	/**
	 * Returns the vehicle group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle group
	 * @return the vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleGroupException, SystemException {
		VehicleGroup vehicleGroup = fetchByPrimaryKey(primaryKey);

		if (vehicleGroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicleGroup;
	}

	/**
	 * Returns the vehicle group with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException} if it could not be found.
	 *
	 * @param id the primary key of the vehicle group
	 * @return the vehicle group
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup findByPrimaryKey(long id)
		throws NoSuchVehicleGroupException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehicle group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle group
	 * @return the vehicle group, or <code>null</code> if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehicleGroup vehicleGroup = (VehicleGroup)EntityCacheUtil.getResult(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
				VehicleGroupImpl.class, primaryKey);

		if (vehicleGroup == _nullVehicleGroup) {
			return null;
		}

		if (vehicleGroup == null) {
			Session session = null;

			try {
				session = openSession();

				vehicleGroup = (VehicleGroup)session.get(VehicleGroupImpl.class,
						primaryKey);

				if (vehicleGroup != null) {
					cacheResult(vehicleGroup);
				}
				else {
					EntityCacheUtil.putResult(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
						VehicleGroupImpl.class, primaryKey, _nullVehicleGroup);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleGroupModelImpl.ENTITY_CACHE_ENABLED,
					VehicleGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicleGroup;
	}

	/**
	 * Returns the vehicle group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehicle group
	 * @return the vehicle group, or <code>null</code> if a vehicle group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleGroup fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehicle groups.
	 *
	 * @return the vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @return the range of vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle groups
	 * @param end the upper bound of the range of vehicle groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicle groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleGroup> findAll(int start, int end,
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

		List<VehicleGroup> list = (List<VehicleGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLEGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLEGROUP;

				if (pagination) {
					sql = sql.concat(VehicleGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleGroup>(list);
				}
				else {
					list = (List<VehicleGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vehicle groups from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehicleGroup vehicleGroup : findAll()) {
			remove(vehicleGroup);
		}
	}

	/**
	 * Returns the number of vehicle groups.
	 *
	 * @return the number of vehicle groups
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLEGROUP);

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
	 * Initializes the vehicle group persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehicleGroup>> listenersList = new ArrayList<ModelListener<VehicleGroup>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehicleGroup>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehicleGroupImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLEGROUP = "SELECT vehicleGroup FROM VehicleGroup vehicleGroup";
	private static final String _SQL_SELECT_VEHICLEGROUP_WHERE = "SELECT vehicleGroup FROM VehicleGroup vehicleGroup WHERE ";
	private static final String _SQL_COUNT_VEHICLEGROUP = "SELECT COUNT(vehicleGroup) FROM VehicleGroup vehicleGroup";
	private static final String _SQL_COUNT_VEHICLEGROUP_WHERE = "SELECT COUNT(vehicleGroup) FROM VehicleGroup vehicleGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicleGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehicleGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VehicleGroup exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehicleGroupPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleClass", "registeredInspectionId", "technicalSpecCode",
				"referenceCertificateNo", "safetytestreportNo",
				"emissiontestreportNo", "copreportNo", "vehicleType",
				"engineType", "tradeMark", "markAsVehicle", "commercialName",
				"modelCode", "productionPlant", "addressOfProductionPlant",
				"emissionStandard", "safetyTestReportId", "emissionTestReportId",
				"copReportId", "specificationVersion", "hoSoThuTucId",
				"attachedFile"
			});
	private static VehicleGroup _nullVehicleGroup = new VehicleGroupImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehicleGroup> toCacheModel() {
				return _nullVehicleGroupCacheModel;
			}
		};

	private static CacheModel<VehicleGroup> _nullVehicleGroupCacheModel = new CacheModel<VehicleGroup>() {
			@Override
			public VehicleGroup toEntityModel() {
				return _nullVehicleGroup;
			}
		};
}