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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the inspection common status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see InspectionCommonStatusPersistence
 * @see InspectionCommonStatusUtil
 * @generated
 */
public class InspectionCommonStatusPersistenceImpl extends BasePersistenceImpl<InspectionCommonStatus>
	implements InspectionCommonStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InspectionCommonStatusUtil} to access the inspection common status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InspectionCommonStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectionRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectionRecordId", new String[] { Long.class.getName() },
			InspectionCommonStatusModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the inspection common statuses where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByInspectionRecordId(
		long inspectionRecordId) throws SystemException {
		return findByInspectionRecordId(inspectionRecordId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection common statuses where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @return the range of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByInspectionRecordId(
		long inspectionRecordId, int start, int end) throws SystemException {
		return findByInspectionRecordId(inspectionRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection common statuses where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByInspectionRecordId(
		long inspectionRecordId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID;
			finderArgs = new Object[] { inspectionRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDID;
			finderArgs = new Object[] {
					inspectionRecordId,
					
					start, end, orderByComparator
				};
		}

		List<InspectionCommonStatus> list = (List<InspectionCommonStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionCommonStatus inspectionCommonStatus : list) {
				if ((inspectionRecordId != inspectionCommonStatus.getInspectionRecordId())) {
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

			query.append(_SQL_SELECT_INSPECTIONCOMMONSTATUS_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionCommonStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

				if (!pagination) {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionCommonStatus>(list);
				}
				else {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
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
	 * Returns the first inspection common status in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByInspectionRecordId_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = fetchByInspectionRecordId_First(inspectionRecordId,
				orderByComparator);

		if (inspectionCommonStatus != null) {
			return inspectionCommonStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionCommonStatusException(msg.toString());
	}

	/**
	 * Returns the first inspection common status in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByInspectionRecordId_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<InspectionCommonStatus> list = findByInspectionRecordId(inspectionRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection common status in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByInspectionRecordId_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = fetchByInspectionRecordId_Last(inspectionRecordId,
				orderByComparator);

		if (inspectionCommonStatus != null) {
			return inspectionCommonStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionCommonStatusException(msg.toString());
	}

	/**
	 * Returns the last inspection common status in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByInspectionRecordId_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInspectionRecordId(inspectionRecordId);

		if (count == 0) {
			return null;
		}

		List<InspectionCommonStatus> list = findByInspectionRecordId(inspectionRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection common statuses before and after the current inspection common status in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param id the primary key of the current inspection common status
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionCommonStatus[] array = new InspectionCommonStatusImpl[3];

			array[0] = getByInspectionRecordId_PrevAndNext(session,
					inspectionCommonStatus, inspectionRecordId,
					orderByComparator, true);

			array[1] = inspectionCommonStatus;

			array[2] = getByInspectionRecordId_PrevAndNext(session,
					inspectionCommonStatus, inspectionRecordId,
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

	protected InspectionCommonStatus getByInspectionRecordId_PrevAndNext(
		Session session, InspectionCommonStatus inspectionCommonStatus,
		long inspectionRecordId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSPECTIONCOMMONSTATUS_WHERE);

		query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

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
			query.append(InspectionCommonStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectionRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionCommonStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionCommonStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection common statuses where inspectionRecordId = &#63; from the database.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectionRecordId(long inspectionRecordId)
		throws SystemException {
		for (InspectionCommonStatus inspectionCommonStatus : findByInspectionRecordId(
				inspectionRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(inspectionCommonStatus);
		}
	}

	/**
	 * Returns the number of inspection common statuses where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching inspection common statuses
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

			query.append(_SQL_COUNT_INSPECTIONCOMMONSTATUS_WHERE);

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
		"inspectionCommonStatus.inspectionRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVehicleClassAndTypeAndInspectionRecordId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByVehicleClassAndTypeAndInspectionRecordId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			InspectionCommonStatusModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			InspectionCommonStatusModelImpl.TYPE_COLUMN_BITMASK |
			InspectionCommonStatusModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleClassAndTypeAndInspectionRecordId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(
		String vehicleClass, long type, long inspectionRecordId)
		throws SystemException {
		return findByVehicleClassAndTypeAndInspectionRecordId(vehicleClass,
			type, inspectionRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @return the range of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(
		String vehicleClass, long type, long inspectionRecordId, int start,
		int end) throws SystemException {
		return findByVehicleClassAndTypeAndInspectionRecordId(vehicleClass,
			type, inspectionRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(
		String vehicleClass, long type, long inspectionRecordId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID;
			finderArgs = new Object[] { vehicleClass, type, inspectionRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID;
			finderArgs = new Object[] {
					vehicleClass, type, inspectionRecordId,
					
					start, end, orderByComparator
				};
		}

		List<InspectionCommonStatus> list = (List<InspectionCommonStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionCommonStatus inspectionCommonStatus : list) {
				if (!Validator.equals(vehicleClass,
							inspectionCommonStatus.getVehicleClass()) ||
						(type != inspectionCommonStatus.getType()) ||
						(inspectionRecordId != inspectionCommonStatus.getInspectionRecordId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_INSPECTIONCOMMONSTATUS_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_TYPE_2);

			query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_INSPECTIONRECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionCommonStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				qPos.add(type);

				qPos.add(inspectionRecordId);

				if (!pagination) {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionCommonStatus>(list);
				}
				else {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
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
	 * Returns the first inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByVehicleClassAndTypeAndInspectionRecordId_First(
		String vehicleClass, long type, long inspectionRecordId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = fetchByVehicleClassAndTypeAndInspectionRecordId_First(vehicleClass,
				type, inspectionRecordId, orderByComparator);

		if (inspectionCommonStatus != null) {
			return inspectionCommonStatus;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", type=");
		msg.append(type);

		msg.append(", inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionCommonStatusException(msg.toString());
	}

	/**
	 * Returns the first inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByVehicleClassAndTypeAndInspectionRecordId_First(
		String vehicleClass, long type, long inspectionRecordId,
		OrderByComparator orderByComparator) throws SystemException {
		List<InspectionCommonStatus> list = findByVehicleClassAndTypeAndInspectionRecordId(vehicleClass,
				type, inspectionRecordId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByVehicleClassAndTypeAndInspectionRecordId_Last(
		String vehicleClass, long type, long inspectionRecordId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = fetchByVehicleClassAndTypeAndInspectionRecordId_Last(vehicleClass,
				type, inspectionRecordId, orderByComparator);

		if (inspectionCommonStatus != null) {
			return inspectionCommonStatus;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", type=");
		msg.append(type);

		msg.append(", inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionCommonStatusException(msg.toString());
	}

	/**
	 * Returns the last inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByVehicleClassAndTypeAndInspectionRecordId_Last(
		String vehicleClass, long type, long inspectionRecordId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByVehicleClassAndTypeAndInspectionRecordId(vehicleClass,
				type, inspectionRecordId);

		if (count == 0) {
			return null;
		}

		List<InspectionCommonStatus> list = findByVehicleClassAndTypeAndInspectionRecordId(vehicleClass,
				type, inspectionRecordId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection common statuses before and after the current inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param id the primary key of the current inspection common status
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus[] findByVehicleClassAndTypeAndInspectionRecordId_PrevAndNext(
		long id, String vehicleClass, long type, long inspectionRecordId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionCommonStatus[] array = new InspectionCommonStatusImpl[3];

			array[0] = getByVehicleClassAndTypeAndInspectionRecordId_PrevAndNext(session,
					inspectionCommonStatus, vehicleClass, type,
					inspectionRecordId, orderByComparator, true);

			array[1] = inspectionCommonStatus;

			array[2] = getByVehicleClassAndTypeAndInspectionRecordId_PrevAndNext(session,
					inspectionCommonStatus, vehicleClass, type,
					inspectionRecordId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InspectionCommonStatus getByVehicleClassAndTypeAndInspectionRecordId_PrevAndNext(
		Session session, InspectionCommonStatus inspectionCommonStatus,
		String vehicleClass, long type, long inspectionRecordId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSPECTIONCOMMONSTATUS_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_2);
		}

		query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_TYPE_2);

		query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_INSPECTIONRECORDID_2);

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
			query.append(InspectionCommonStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		qPos.add(type);

		qPos.add(inspectionRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionCommonStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionCommonStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleClassAndTypeAndInspectionRecordId(
		String vehicleClass, long type, long inspectionRecordId)
		throws SystemException {
		for (InspectionCommonStatus inspectionCommonStatus : findByVehicleClassAndTypeAndInspectionRecordId(
				vehicleClass, type, inspectionRecordId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(inspectionCommonStatus);
		}
	}

	/**
	 * Returns the number of inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param type the type
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleClassAndTypeAndInspectionRecordId(
		String vehicleClass, long type, long inspectionRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID;

		Object[] finderArgs = new Object[] {
				vehicleClass, type, inspectionRecordId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_INSPECTIONCOMMONSTATUS_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_TYPE_2);

			query.append(_FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_1 =
		"inspectionCommonStatus.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_2 =
		"inspectionCommonStatus.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_VEHICLECLASS_3 =
		"(inspectionCommonStatus.vehicleClass IS NULL OR inspectionCommonStatus.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_TYPE_2 =
		"inspectionCommonStatus.type = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID_INSPECTIONRECORDID_2 =
		"inspectionCommonStatus.inspectionRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECLASSANDINSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVehicleClassAndInspectionRecordId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDINSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByVehicleClassAndInspectionRecordId",
			new String[] { String.class.getName(), Long.class.getName() },
			InspectionCommonStatusModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			InspectionCommonStatusModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLECLASSANDINSPECTIONRECORDID =
		new FinderPath(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleClassAndInspectionRecordId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(
		String vehicleClass, long inspectionRecordId) throws SystemException {
		return findByVehicleClassAndInspectionRecordId(vehicleClass,
			inspectionRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @return the range of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(
		String vehicleClass, long inspectionRecordId, int start, int end)
		throws SystemException {
		return findByVehicleClassAndInspectionRecordId(vehicleClass,
			inspectionRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(
		String vehicleClass, long inspectionRecordId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDINSPECTIONRECORDID;
			finderArgs = new Object[] { vehicleClass, inspectionRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLECLASSANDINSPECTIONRECORDID;
			finderArgs = new Object[] {
					vehicleClass, inspectionRecordId,
					
					start, end, orderByComparator
				};
		}

		List<InspectionCommonStatus> list = (List<InspectionCommonStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InspectionCommonStatus inspectionCommonStatus : list) {
				if (!Validator.equals(vehicleClass,
							inspectionCommonStatus.getVehicleClass()) ||
						(inspectionRecordId != inspectionCommonStatus.getInspectionRecordId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_INSPECTIONCOMMONSTATUS_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_INSPECTIONRECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InspectionCommonStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				qPos.add(inspectionRecordId);

				if (!pagination) {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionCommonStatus>(list);
				}
				else {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
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
	 * Returns the first inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByVehicleClassAndInspectionRecordId_First(
		String vehicleClass, long inspectionRecordId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = fetchByVehicleClassAndInspectionRecordId_First(vehicleClass,
				inspectionRecordId, orderByComparator);

		if (inspectionCommonStatus != null) {
			return inspectionCommonStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionCommonStatusException(msg.toString());
	}

	/**
	 * Returns the first inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByVehicleClassAndInspectionRecordId_First(
		String vehicleClass, long inspectionRecordId,
		OrderByComparator orderByComparator) throws SystemException {
		List<InspectionCommonStatus> list = findByVehicleClassAndInspectionRecordId(vehicleClass,
				inspectionRecordId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByVehicleClassAndInspectionRecordId_Last(
		String vehicleClass, long inspectionRecordId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = fetchByVehicleClassAndInspectionRecordId_Last(vehicleClass,
				inspectionRecordId, orderByComparator);

		if (inspectionCommonStatus != null) {
			return inspectionCommonStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleClass=");
		msg.append(vehicleClass);

		msg.append(", inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInspectionCommonStatusException(msg.toString());
	}

	/**
	 * Returns the last inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByVehicleClassAndInspectionRecordId_Last(
		String vehicleClass, long inspectionRecordId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByVehicleClassAndInspectionRecordId(vehicleClass,
				inspectionRecordId);

		if (count == 0) {
			return null;
		}

		List<InspectionCommonStatus> list = findByVehicleClassAndInspectionRecordId(vehicleClass,
				inspectionRecordId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inspection common statuses before and after the current inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param id the primary key of the current inspection common status
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus[] findByVehicleClassAndInspectionRecordId_PrevAndNext(
		long id, String vehicleClass, long inspectionRecordId,
		OrderByComparator orderByComparator)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			InspectionCommonStatus[] array = new InspectionCommonStatusImpl[3];

			array[0] = getByVehicleClassAndInspectionRecordId_PrevAndNext(session,
					inspectionCommonStatus, vehicleClass, inspectionRecordId,
					orderByComparator, true);

			array[1] = inspectionCommonStatus;

			array[2] = getByVehicleClassAndInspectionRecordId_PrevAndNext(session,
					inspectionCommonStatus, vehicleClass, inspectionRecordId,
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

	protected InspectionCommonStatus getByVehicleClassAndInspectionRecordId_PrevAndNext(
		Session session, InspectionCommonStatus inspectionCommonStatus,
		String vehicleClass, long inspectionRecordId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSPECTIONCOMMONSTATUS_WHERE);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_2);
		}

		query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_INSPECTIONRECORDID_2);

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
			query.append(InspectionCommonStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		qPos.add(inspectionRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(inspectionCommonStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InspectionCommonStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63; from the database.
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleClassAndInspectionRecordId(String vehicleClass,
		long inspectionRecordId) throws SystemException {
		for (InspectionCommonStatus inspectionCommonStatus : findByVehicleClassAndInspectionRecordId(
				vehicleClass, inspectionRecordId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(inspectionCommonStatus);
		}
	}

	/**
	 * Returns the number of inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	 *
	 * @param vehicleClass the vehicle class
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleClassAndInspectionRecordId(String vehicleClass,
		long inspectionRecordId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLECLASSANDINSPECTIONRECORDID;

		Object[] finderArgs = new Object[] { vehicleClass, inspectionRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_INSPECTIONCOMMONSTATUS_WHERE);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_2);
			}

			query.append(_FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_INSPECTIONRECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

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

	private static final String _FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_1 =
		"inspectionCommonStatus.vehicleClass IS NULL AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_2 =
		"inspectionCommonStatus.vehicleClass = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_VEHICLECLASS_3 =
		"(inspectionCommonStatus.vehicleClass IS NULL OR inspectionCommonStatus.vehicleClass = '') AND ";
	private static final String _FINDER_COLUMN_VEHICLECLASSANDINSPECTIONRECORDID_INSPECTIONRECORDID_2 =
		"inspectionCommonStatus.inspectionRecordId = ?";

	public InspectionCommonStatusPersistenceImpl() {
		setModelClass(InspectionCommonStatus.class);
	}

	/**
	 * Caches the inspection common status in the entity cache if it is enabled.
	 *
	 * @param inspectionCommonStatus the inspection common status
	 */
	@Override
	public void cacheResult(InspectionCommonStatus inspectionCommonStatus) {
		EntityCacheUtil.putResult(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			inspectionCommonStatus.getPrimaryKey(), inspectionCommonStatus);

		inspectionCommonStatus.resetOriginalValues();
	}

	/**
	 * Caches the inspection common statuses in the entity cache if it is enabled.
	 *
	 * @param inspectionCommonStatuses the inspection common statuses
	 */
	@Override
	public void cacheResult(
		List<InspectionCommonStatus> inspectionCommonStatuses) {
		for (InspectionCommonStatus inspectionCommonStatus : inspectionCommonStatuses) {
			if (EntityCacheUtil.getResult(
						InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
						InspectionCommonStatusImpl.class,
						inspectionCommonStatus.getPrimaryKey()) == null) {
				cacheResult(inspectionCommonStatus);
			}
			else {
				inspectionCommonStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all inspection common statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InspectionCommonStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InspectionCommonStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the inspection common status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InspectionCommonStatus inspectionCommonStatus) {
		EntityCacheUtil.removeResult(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			inspectionCommonStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<InspectionCommonStatus> inspectionCommonStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InspectionCommonStatus inspectionCommonStatus : inspectionCommonStatuses) {
			EntityCacheUtil.removeResult(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
				InspectionCommonStatusImpl.class,
				inspectionCommonStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new inspection common status with the primary key. Does not add the inspection common status to the database.
	 *
	 * @param id the primary key for the new inspection common status
	 * @return the new inspection common status
	 */
	@Override
	public InspectionCommonStatus create(long id) {
		InspectionCommonStatus inspectionCommonStatus = new InspectionCommonStatusImpl();

		inspectionCommonStatus.setNew(true);
		inspectionCommonStatus.setPrimaryKey(id);

		return inspectionCommonStatus;
	}

	/**
	 * Removes the inspection common status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the inspection common status
	 * @return the inspection common status that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus remove(long id)
		throws NoSuchInspectionCommonStatusException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the inspection common status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the inspection common status
	 * @return the inspection common status that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus remove(Serializable primaryKey)
		throws NoSuchInspectionCommonStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InspectionCommonStatus inspectionCommonStatus = (InspectionCommonStatus)session.get(InspectionCommonStatusImpl.class,
					primaryKey);

			if (inspectionCommonStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInspectionCommonStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(inspectionCommonStatus);
		}
		catch (NoSuchInspectionCommonStatusException nsee) {
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
	protected InspectionCommonStatus removeImpl(
		InspectionCommonStatus inspectionCommonStatus)
		throws SystemException {
		inspectionCommonStatus = toUnwrappedModel(inspectionCommonStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(inspectionCommonStatus)) {
				inspectionCommonStatus = (InspectionCommonStatus)session.get(InspectionCommonStatusImpl.class,
						inspectionCommonStatus.getPrimaryKeyObj());
			}

			if (inspectionCommonStatus != null) {
				session.delete(inspectionCommonStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (inspectionCommonStatus != null) {
			clearCache(inspectionCommonStatus);
		}

		return inspectionCommonStatus;
	}

	@Override
	public InspectionCommonStatus updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus inspectionCommonStatus)
		throws SystemException {
		inspectionCommonStatus = toUnwrappedModel(inspectionCommonStatus);

		boolean isNew = inspectionCommonStatus.isNew();

		InspectionCommonStatusModelImpl inspectionCommonStatusModelImpl = (InspectionCommonStatusModelImpl)inspectionCommonStatus;

		Session session = null;

		try {
			session = openSession();

			if (inspectionCommonStatus.isNew()) {
				session.save(inspectionCommonStatus);

				inspectionCommonStatus.setNew(false);
			}
			else {
				session.merge(inspectionCommonStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InspectionCommonStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((inspectionCommonStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionCommonStatusModelImpl.getOriginalInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);

				args = new Object[] {
						inspectionCommonStatusModelImpl.getInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);
			}

			if ((inspectionCommonStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionCommonStatusModelImpl.getOriginalVehicleClass(),
						inspectionCommonStatusModelImpl.getOriginalType(),
						inspectionCommonStatusModelImpl.getOriginalInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID,
					args);

				args = new Object[] {
						inspectionCommonStatusModelImpl.getVehicleClass(),
						inspectionCommonStatusModelImpl.getType(),
						inspectionCommonStatusModelImpl.getInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDTYPEANDINSPECTIONRECORDID,
					args);
			}

			if ((inspectionCommonStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDINSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						inspectionCommonStatusModelImpl.getOriginalVehicleClass(),
						inspectionCommonStatusModelImpl.getOriginalInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLECLASSANDINSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDINSPECTIONRECORDID,
					args);

				args = new Object[] {
						inspectionCommonStatusModelImpl.getVehicleClass(),
						inspectionCommonStatusModelImpl.getInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLECLASSANDINSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLECLASSANDINSPECTIONRECORDID,
					args);
			}
		}

		EntityCacheUtil.putResult(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
			InspectionCommonStatusImpl.class,
			inspectionCommonStatus.getPrimaryKey(), inspectionCommonStatus);

		return inspectionCommonStatus;
	}

	protected InspectionCommonStatus toUnwrappedModel(
		InspectionCommonStatus inspectionCommonStatus) {
		if (inspectionCommonStatus instanceof InspectionCommonStatusImpl) {
			return inspectionCommonStatus;
		}

		InspectionCommonStatusImpl inspectionCommonStatusImpl = new InspectionCommonStatusImpl();

		inspectionCommonStatusImpl.setNew(inspectionCommonStatus.isNew());
		inspectionCommonStatusImpl.setPrimaryKey(inspectionCommonStatus.getPrimaryKey());

		inspectionCommonStatusImpl.setId(inspectionCommonStatus.getId());
		inspectionCommonStatusImpl.setVehicleClass(inspectionCommonStatus.getVehicleClass());
		inspectionCommonStatusImpl.setSequenceNo(inspectionCommonStatus.getSequenceNo());
		inspectionCommonStatusImpl.setType(inspectionCommonStatus.getType());
		inspectionCommonStatusImpl.setGroupName(inspectionCommonStatus.getGroupName());
		inspectionCommonStatusImpl.setItemName(inspectionCommonStatus.getItemName());
		inspectionCommonStatusImpl.setCommonStatus(inspectionCommonStatus.getCommonStatus());
		inspectionCommonStatusImpl.setInspectionRecordId(inspectionCommonStatus.getInspectionRecordId());
		inspectionCommonStatusImpl.setCommonCode(inspectionCommonStatus.getCommonCode());
		inspectionCommonStatusImpl.setAllowEdit(inspectionCommonStatus.getAllowEdit());

		return inspectionCommonStatusImpl;
	}

	/**
	 * Returns the inspection common status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection common status
	 * @return the inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInspectionCommonStatusException, SystemException {
		InspectionCommonStatus inspectionCommonStatus = fetchByPrimaryKey(primaryKey);

		if (inspectionCommonStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInspectionCommonStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return inspectionCommonStatus;
	}

	/**
	 * Returns the inspection common status with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException} if it could not be found.
	 *
	 * @param id the primary key of the inspection common status
	 * @return the inspection common status
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus findByPrimaryKey(long id)
		throws NoSuchInspectionCommonStatusException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the inspection common status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the inspection common status
	 * @return the inspection common status, or <code>null</code> if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InspectionCommonStatus inspectionCommonStatus = (InspectionCommonStatus)EntityCacheUtil.getResult(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
				InspectionCommonStatusImpl.class, primaryKey);

		if (inspectionCommonStatus == _nullInspectionCommonStatus) {
			return null;
		}

		if (inspectionCommonStatus == null) {
			Session session = null;

			try {
				session = openSession();

				inspectionCommonStatus = (InspectionCommonStatus)session.get(InspectionCommonStatusImpl.class,
						primaryKey);

				if (inspectionCommonStatus != null) {
					cacheResult(inspectionCommonStatus);
				}
				else {
					EntityCacheUtil.putResult(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
						InspectionCommonStatusImpl.class, primaryKey,
						_nullInspectionCommonStatus);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InspectionCommonStatusModelImpl.ENTITY_CACHE_ENABLED,
					InspectionCommonStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return inspectionCommonStatus;
	}

	/**
	 * Returns the inspection common status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the inspection common status
	 * @return the inspection common status, or <code>null</code> if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the inspection common statuses.
	 *
	 * @return the inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inspection common statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @return the range of inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the inspection common statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> findAll(int start, int end,
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

		List<InspectionCommonStatus> list = (List<InspectionCommonStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSPECTIONCOMMONSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSPECTIONCOMMONSTATUS;

				if (pagination) {
					sql = sql.concat(InspectionCommonStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InspectionCommonStatus>(list);
				}
				else {
					list = (List<InspectionCommonStatus>)QueryUtil.list(q,
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
	 * Removes all the inspection common statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InspectionCommonStatus inspectionCommonStatus : findAll()) {
			remove(inspectionCommonStatus);
		}
	}

	/**
	 * Returns the number of inspection common statuses.
	 *
	 * @return the number of inspection common statuses
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

				Query q = session.createQuery(_SQL_COUNT_INSPECTIONCOMMONSTATUS);

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
	 * Initializes the inspection common status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InspectionCommonStatus>> listenersList = new ArrayList<ModelListener<InspectionCommonStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InspectionCommonStatus>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InspectionCommonStatusImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSPECTIONCOMMONSTATUS = "SELECT inspectionCommonStatus FROM InspectionCommonStatus inspectionCommonStatus";
	private static final String _SQL_SELECT_INSPECTIONCOMMONSTATUS_WHERE = "SELECT inspectionCommonStatus FROM InspectionCommonStatus inspectionCommonStatus WHERE ";
	private static final String _SQL_COUNT_INSPECTIONCOMMONSTATUS = "SELECT COUNT(inspectionCommonStatus) FROM InspectionCommonStatus inspectionCommonStatus";
	private static final String _SQL_COUNT_INSPECTIONCOMMONSTATUS_WHERE = "SELECT COUNT(inspectionCommonStatus) FROM InspectionCommonStatus inspectionCommonStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "inspectionCommonStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InspectionCommonStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InspectionCommonStatus exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InspectionCommonStatusPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"commonCode", "allowEdit"
			});
	private static InspectionCommonStatus _nullInspectionCommonStatus = new InspectionCommonStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InspectionCommonStatus> toCacheModel() {
				return _nullInspectionCommonStatusCacheModel;
			}
		};

	private static CacheModel<InspectionCommonStatus> _nullInspectionCommonStatusCacheModel =
		new CacheModel<InspectionCommonStatus>() {
			@Override
			public InspectionCommonStatus toEntityModel() {
				return _nullInspectionCommonStatus;
			}
		};
}