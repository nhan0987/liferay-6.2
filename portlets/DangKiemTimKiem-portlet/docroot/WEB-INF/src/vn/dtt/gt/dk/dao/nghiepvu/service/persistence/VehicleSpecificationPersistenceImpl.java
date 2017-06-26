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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vehicle specification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehicleSpecificationPersistence
 * @see VehicleSpecificationUtil
 * @generated
 */
public class VehicleSpecificationPersistenceImpl extends BasePersistenceImpl<VehicleSpecification>
	implements VehicleSpecificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleSpecificationUtil} to access the vehicle specification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleSpecificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPECIFICATIONCODE =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySpecificationCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIFICATIONCODE =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySpecificationCode", new String[] { String.class.getName() },
			VehicleSpecificationModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPECIFICATIONCODE = new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySpecificationCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vehicle specifications where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @return the matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findBySpecificationCode(
		String specificationCode) throws SystemException {
		return findBySpecificationCode(specificationCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle specifications where specificationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationCode the specification code
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @return the range of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findBySpecificationCode(
		String specificationCode, int start, int end) throws SystemException {
		return findBySpecificationCode(specificationCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle specifications where specificationCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationCode the specification code
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findBySpecificationCode(
		String specificationCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIFICATIONCODE;
			finderArgs = new Object[] { specificationCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationCode,
					
					start, end, orderByComparator
				};
		}

		List<VehicleSpecification> list = (List<VehicleSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleSpecification vehicleSpecification : list) {
				if (!Validator.equals(specificationCode,
							vehicleSpecification.getSpecificationCode())) {
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

			query.append(_SQL_SELECT_VEHICLESPECIFICATION_WHERE);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
				}

				if (!pagination) {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleSpecification>(list);
				}
				else {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
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
	 * Returns the first vehicle specification in the ordered set where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findBySpecificationCode_First(
		String specificationCode, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchBySpecificationCode_First(specificationCode,
				orderByComparator);

		if (vehicleSpecification != null) {
			return vehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationCode=");
		msg.append(specificationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the first vehicle specification in the ordered set where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchBySpecificationCode_First(
		String specificationCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleSpecification> list = findBySpecificationCode(specificationCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle specification in the ordered set where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findBySpecificationCode_Last(
		String specificationCode, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchBySpecificationCode_Last(specificationCode,
				orderByComparator);

		if (vehicleSpecification != null) {
			return vehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationCode=");
		msg.append(specificationCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the last vehicle specification in the ordered set where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchBySpecificationCode_Last(
		String specificationCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySpecificationCode(specificationCode);

		if (count == 0) {
			return null;
		}

		List<VehicleSpecification> list = findBySpecificationCode(specificationCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle specifications before and after the current vehicle specification in the ordered set where specificationCode = &#63;.
	 *
	 * @param id the primary key of the current vehicle specification
	 * @param specificationCode the specification code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification[] findBySpecificationCode_PrevAndNext(long id,
		String specificationCode, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleSpecification[] array = new VehicleSpecificationImpl[3];

			array[0] = getBySpecificationCode_PrevAndNext(session,
					vehicleSpecification, specificationCode, orderByComparator,
					true);

			array[1] = vehicleSpecification;

			array[2] = getBySpecificationCode_PrevAndNext(session,
					vehicleSpecification, specificationCode, orderByComparator,
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

	protected VehicleSpecification getBySpecificationCode_PrevAndNext(
		Session session, VehicleSpecification vehicleSpecification,
		String specificationCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLESPECIFICATION_WHERE);

		boolean bindSpecificationCode = false;

		if (specificationCode == null) {
			query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_1);
		}
		else if (specificationCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3);
		}
		else {
			bindSpecificationCode = true;

			query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2);
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
			query.append(VehicleSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationCode) {
			qPos.add(specificationCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle specifications where specificationCode = &#63; from the database.
	 *
	 * @param specificationCode the specification code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySpecificationCode(String specificationCode)
		throws SystemException {
		for (VehicleSpecification vehicleSpecification : findBySpecificationCode(
				specificationCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleSpecification);
		}
	}

	/**
	 * Returns the number of vehicle specifications where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @return the number of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySpecificationCode(String specificationCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPECIFICATIONCODE;

		Object[] finderArgs = new Object[] { specificationCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLESPECIFICATION_WHERE);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
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
		"vehicleSpecification.specificationCode IS NULL";
	private static final String _FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"vehicleSpecification.specificationCode = ?";
	private static final String _FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(vehicleSpecification.specificationCode IS NULL OR vehicleSpecification.specificationCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectionRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectionRecordId", new String[] { Long.class.getName() },
			VehicleSpecificationModelImpl.INSPECTIONRECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDID = new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle specifications where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findByInspectionRecordId(
		long inspectionRecordId) throws SystemException {
		return findByInspectionRecordId(inspectionRecordId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle specifications where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @return the range of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findByInspectionRecordId(
		long inspectionRecordId, int start, int end) throws SystemException {
		return findByInspectionRecordId(inspectionRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle specifications where inspectionRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findByInspectionRecordId(
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

		List<VehicleSpecification> list = (List<VehicleSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleSpecification vehicleSpecification : list) {
				if ((inspectionRecordId != vehicleSpecification.getInspectionRecordId())) {
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

			query.append(_SQL_SELECT_VEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_INSPECTIONRECORDID_INSPECTIONRECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectionRecordId);

				if (!pagination) {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleSpecification>(list);
				}
				else {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
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
	 * Returns the first vehicle specification in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findByInspectionRecordId_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchByInspectionRecordId_First(inspectionRecordId,
				orderByComparator);

		if (vehicleSpecification != null) {
			return vehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the first vehicle specification in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByInspectionRecordId_First(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleSpecification> list = findByInspectionRecordId(inspectionRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle specification in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findByInspectionRecordId_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchByInspectionRecordId_Last(inspectionRecordId,
				orderByComparator);

		if (vehicleSpecification != null) {
			return vehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionRecordId=");
		msg.append(inspectionRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the last vehicle specification in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByInspectionRecordId_Last(
		long inspectionRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInspectionRecordId(inspectionRecordId);

		if (count == 0) {
			return null;
		}

		List<VehicleSpecification> list = findByInspectionRecordId(inspectionRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle specifications before and after the current vehicle specification in the ordered set where inspectionRecordId = &#63;.
	 *
	 * @param id the primary key of the current vehicle specification
	 * @param inspectionRecordId the inspection record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordId, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleSpecification[] array = new VehicleSpecificationImpl[3];

			array[0] = getByInspectionRecordId_PrevAndNext(session,
					vehicleSpecification, inspectionRecordId,
					orderByComparator, true);

			array[1] = vehicleSpecification;

			array[2] = getByInspectionRecordId_PrevAndNext(session,
					vehicleSpecification, inspectionRecordId,
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

	protected VehicleSpecification getByInspectionRecordId_PrevAndNext(
		Session session, VehicleSpecification vehicleSpecification,
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

		query.append(_SQL_SELECT_VEHICLESPECIFICATION_WHERE);

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
			query.append(VehicleSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectionRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle specifications where inspectionRecordId = &#63; from the database.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectionRecordId(long inspectionRecordId)
		throws SystemException {
		for (VehicleSpecification vehicleSpecification : findByInspectionRecordId(
				inspectionRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleSpecification);
		}
	}

	/**
	 * Returns the number of vehicle specifications where inspectionRecordId = &#63;.
	 *
	 * @param inspectionRecordId the inspection record ID
	 * @return the number of matching vehicle specifications
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

			query.append(_SQL_COUNT_VEHICLESPECIFICATION_WHERE);

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
		"vehicleSpecification.inspectionRecordId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			VehicleSpecificationModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicle specifications where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle specifications where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @return the range of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findByVehicleGroupId(
		long vehicleGroupId, int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle specifications where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findByVehicleGroupId(
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

		List<VehicleSpecification> list = (List<VehicleSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (VehicleSpecification vehicleSpecification : list) {
				if ((vehicleGroupId != vehicleSpecification.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_VEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleSpecification>(list);
				}
				else {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
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
	 * Returns the first vehicle specification in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (vehicleSpecification != null) {
			return vehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the first vehicle specification in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByVehicleGroupId_First(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<VehicleSpecification> list = findByVehicleGroupId(vehicleGroupId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle specification in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findByVehicleGroupId_Last(long vehicleGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (vehicleSpecification != null) {
			return vehicleSpecification;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleSpecificationException(msg.toString());
	}

	/**
	 * Returns the last vehicle specification in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByVehicleGroupId_Last(
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<VehicleSpecification> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicle specifications before and after the current vehicle specification in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current vehicle specification
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification[] findByVehicleGroupId_PrevAndNext(long id,
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VehicleSpecification[] array = new VehicleSpecificationImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					vehicleSpecification, vehicleGroupId, orderByComparator,
					true);

			array[1] = vehicleSpecification;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					vehicleSpecification, vehicleGroupId, orderByComparator,
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

	protected VehicleSpecification getByVehicleGroupId_PrevAndNext(
		Session session, VehicleSpecification vehicleSpecification,
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

		query.append(_SQL_SELECT_VEHICLESPECIFICATION_WHERE);

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
			query.append(VehicleSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicleSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VehicleSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle specifications where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (VehicleSpecification vehicleSpecification : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicleSpecification);
		}
	}

	/**
	 * Returns the number of vehicle specifications where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching vehicle specifications
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

			query.append(_SQL_COUNT_VEHICLESPECIFICATION_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "vehicleSpecification.vehicleGroupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED,
			VehicleSpecificationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByVehicleGroupIdSpecificationCode",
			new String[] { Long.class.getName(), String.class.getName() },
			VehicleSpecificationModelImpl.VEHICLEGROUPID_COLUMN_BITMASK |
			VehicleSpecificationModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPIDSPECIFICATIONCODE =
		new FinderPath(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleGroupIdSpecificationCode",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException} if it could not be found.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param specificationCode the specification code
	 * @return the matching vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, String specificationCode)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchByVehicleGroupIdSpecificationCode(vehicleGroupId,
				specificationCode);

		if (vehicleSpecification == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleGroupId=");
			msg.append(vehicleGroupId);

			msg.append(", specificationCode=");
			msg.append(specificationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVehicleSpecificationException(msg.toString());
		}

		return vehicleSpecification;
	}

	/**
	 * Returns the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param specificationCode the specification code
	 * @return the matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, String specificationCode)
		throws SystemException {
		return fetchByVehicleGroupIdSpecificationCode(vehicleGroupId,
			specificationCode, true);
	}

	/**
	 * Returns the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param specificationCode the specification code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, String specificationCode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { vehicleGroupId, specificationCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
					finderArgs, this);
		}

		if (result instanceof VehicleSpecification) {
			VehicleSpecification vehicleSpecification = (VehicleSpecification)result;

			if ((vehicleGroupId != vehicleSpecification.getVehicleGroupId()) ||
					!Validator.equals(specificationCode,
						vehicleSpecification.getSpecificationCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_VEHICLEGROUPID_2);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
				}

				List<VehicleSpecification> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"VehicleSpecificationPersistenceImpl.fetchByVehicleGroupIdSpecificationCode(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					VehicleSpecification vehicleSpecification = list.get(0);

					result = vehicleSpecification;

					cacheResult(vehicleSpecification);

					if ((vehicleSpecification.getVehicleGroupId() != vehicleGroupId) ||
							(vehicleSpecification.getSpecificationCode() == null) ||
							!vehicleSpecification.getSpecificationCode()
													 .equals(specificationCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
							finderArgs, vehicleSpecification);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
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
			return (VehicleSpecification)result;
		}
	}

	/**
	 * Removes the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param specificationCode the specification code
	 * @return the vehicle specification that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification removeByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, String specificationCode)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = findByVehicleGroupIdSpecificationCode(vehicleGroupId,
				specificationCode);

		return remove(vehicleSpecification);
	}

	/**
	 * Returns the number of vehicle specifications where vehicleGroupId = &#63; and specificationCode = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param specificationCode the specification code
	 * @return the number of matching vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleGroupIdSpecificationCode(long vehicleGroupId,
		String specificationCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLEGROUPIDSPECIFICATIONCODE;

		Object[] finderArgs = new Object[] { vehicleGroupId, specificationCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VEHICLESPECIFICATION_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_VEHICLEGROUPID_2);

			boolean bindSpecificationCode = false;

			if (specificationCode == null) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationCode = true;

				query.append(_FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (bindSpecificationCode) {
					qPos.add(specificationCode);
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

	private static final String _FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_VEHICLEGROUPID_2 =
		"vehicleSpecification.vehicleGroupId = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_1 =
		"vehicleSpecification.specificationCode IS NULL";
	private static final String _FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"vehicleSpecification.specificationCode = ?";
	private static final String _FINDER_COLUMN_VEHICLEGROUPIDSPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(vehicleSpecification.specificationCode IS NULL OR vehicleSpecification.specificationCode = '')";

	public VehicleSpecificationPersistenceImpl() {
		setModelClass(VehicleSpecification.class);
	}

	/**
	 * Caches the vehicle specification in the entity cache if it is enabled.
	 *
	 * @param vehicleSpecification the vehicle specification
	 */
	@Override
	public void cacheResult(VehicleSpecification vehicleSpecification) {
		EntityCacheUtil.putResult(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			vehicleSpecification.getPrimaryKey(), vehicleSpecification);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
			new Object[] {
				vehicleSpecification.getVehicleGroupId(),
				vehicleSpecification.getSpecificationCode()
			}, vehicleSpecification);

		vehicleSpecification.resetOriginalValues();
	}

	/**
	 * Caches the vehicle specifications in the entity cache if it is enabled.
	 *
	 * @param vehicleSpecifications the vehicle specifications
	 */
	@Override
	public void cacheResult(List<VehicleSpecification> vehicleSpecifications) {
		for (VehicleSpecification vehicleSpecification : vehicleSpecifications) {
			if (EntityCacheUtil.getResult(
						VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
						VehicleSpecificationImpl.class,
						vehicleSpecification.getPrimaryKey()) == null) {
				cacheResult(vehicleSpecification);
			}
			else {
				vehicleSpecification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle specifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleSpecificationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleSpecificationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle specification.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehicleSpecification vehicleSpecification) {
		EntityCacheUtil.removeResult(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationImpl.class, vehicleSpecification.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(vehicleSpecification);
	}

	@Override
	public void clearCache(List<VehicleSpecification> vehicleSpecifications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehicleSpecification vehicleSpecification : vehicleSpecifications) {
			EntityCacheUtil.removeResult(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
				VehicleSpecificationImpl.class,
				vehicleSpecification.getPrimaryKey());

			clearUniqueFindersCache(vehicleSpecification);
		}
	}

	protected void cacheUniqueFindersCache(
		VehicleSpecification vehicleSpecification) {
		if (vehicleSpecification.isNew()) {
			Object[] args = new Object[] {
					vehicleSpecification.getVehicleGroupId(),
					vehicleSpecification.getSpecificationCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
				args, vehicleSpecification);
		}
		else {
			VehicleSpecificationModelImpl vehicleSpecificationModelImpl = (VehicleSpecificationModelImpl)vehicleSpecification;

			if ((vehicleSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleSpecification.getVehicleGroupId(),
						vehicleSpecification.getSpecificationCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
					args, vehicleSpecification);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VehicleSpecification vehicleSpecification) {
		VehicleSpecificationModelImpl vehicleSpecificationModelImpl = (VehicleSpecificationModelImpl)vehicleSpecification;

		Object[] args = new Object[] {
				vehicleSpecification.getVehicleGroupId(),
				vehicleSpecification.getSpecificationCode()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
			args);

		if ((vehicleSpecificationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					vehicleSpecificationModelImpl.getOriginalVehicleGroupId(),
					vehicleSpecificationModelImpl.getOriginalSpecificationCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLEGROUPIDSPECIFICATIONCODE,
				args);
		}
	}

	/**
	 * Creates a new vehicle specification with the primary key. Does not add the vehicle specification to the database.
	 *
	 * @param id the primary key for the new vehicle specification
	 * @return the new vehicle specification
	 */
	@Override
	public VehicleSpecification create(long id) {
		VehicleSpecification vehicleSpecification = new VehicleSpecificationImpl();

		vehicleSpecification.setNew(true);
		vehicleSpecification.setPrimaryKey(id);

		return vehicleSpecification;
	}

	/**
	 * Removes the vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehicle specification
	 * @return the vehicle specification that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification remove(long id)
		throws NoSuchVehicleSpecificationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle specification
	 * @return the vehicle specification that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification remove(Serializable primaryKey)
		throws NoSuchVehicleSpecificationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehicleSpecification vehicleSpecification = (VehicleSpecification)session.get(VehicleSpecificationImpl.class,
					primaryKey);

			if (vehicleSpecification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleSpecificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicleSpecification);
		}
		catch (NoSuchVehicleSpecificationException nsee) {
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
	protected VehicleSpecification removeImpl(
		VehicleSpecification vehicleSpecification) throws SystemException {
		vehicleSpecification = toUnwrappedModel(vehicleSpecification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicleSpecification)) {
				vehicleSpecification = (VehicleSpecification)session.get(VehicleSpecificationImpl.class,
						vehicleSpecification.getPrimaryKeyObj());
			}

			if (vehicleSpecification != null) {
				session.delete(vehicleSpecification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicleSpecification != null) {
			clearCache(vehicleSpecification);
		}

		return vehicleSpecification;
	}

	@Override
	public VehicleSpecification updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification vehicleSpecification)
		throws SystemException {
		vehicleSpecification = toUnwrappedModel(vehicleSpecification);

		boolean isNew = vehicleSpecification.isNew();

		VehicleSpecificationModelImpl vehicleSpecificationModelImpl = (VehicleSpecificationModelImpl)vehicleSpecification;

		Session session = null;

		try {
			session = openSession();

			if (vehicleSpecification.isNew()) {
				session.save(vehicleSpecification);

				vehicleSpecification.setNew(false);
			}
			else {
				session.merge(vehicleSpecification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VehicleSpecificationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vehicleSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleSpecificationModelImpl.getOriginalSpecificationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIFICATIONCODE,
					args);

				args = new Object[] {
						vehicleSpecificationModelImpl.getSpecificationCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIFICATIONCODE,
					args);
			}

			if ((vehicleSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleSpecificationModelImpl.getOriginalInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);

				args = new Object[] {
						vehicleSpecificationModelImpl.getInspectionRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDID,
					args);
			}

			if ((vehicleSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleSpecificationModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						vehicleSpecificationModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			VehicleSpecificationImpl.class,
			vehicleSpecification.getPrimaryKey(), vehicleSpecification);

		clearUniqueFindersCache(vehicleSpecification);
		cacheUniqueFindersCache(vehicleSpecification);

		return vehicleSpecification;
	}

	protected VehicleSpecification toUnwrappedModel(
		VehicleSpecification vehicleSpecification) {
		if (vehicleSpecification instanceof VehicleSpecificationImpl) {
			return vehicleSpecification;
		}

		VehicleSpecificationImpl vehicleSpecificationImpl = new VehicleSpecificationImpl();

		vehicleSpecificationImpl.setNew(vehicleSpecification.isNew());
		vehicleSpecificationImpl.setPrimaryKey(vehicleSpecification.getPrimaryKey());

		vehicleSpecificationImpl.setId(vehicleSpecification.getId());
		vehicleSpecificationImpl.setVehicleGroupId(vehicleSpecification.getVehicleGroupId());
		vehicleSpecificationImpl.setSpecificationVersion(vehicleSpecification.getSpecificationVersion());
		vehicleSpecificationImpl.setSpecificationSourceCode(vehicleSpecification.getSpecificationSourceCode());
		vehicleSpecificationImpl.setSpecificationCode(vehicleSpecification.getSpecificationCode());
		vehicleSpecificationImpl.setSpecificationName(vehicleSpecification.getSpecificationName());
		vehicleSpecificationImpl.setSpecificationValue(vehicleSpecification.getSpecificationValue());
		vehicleSpecificationImpl.setSafetyTestReportId(vehicleSpecification.getSafetyTestReportId());
		vehicleSpecificationImpl.setInspectionRecordId(vehicleSpecification.getInspectionRecordId());
		vehicleSpecificationImpl.setSpecificResult(vehicleSpecification.getSpecificResult());

		return vehicleSpecificationImpl;
	}

	/**
	 * Returns the vehicle specification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle specification
	 * @return the vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleSpecificationException, SystemException {
		VehicleSpecification vehicleSpecification = fetchByPrimaryKey(primaryKey);

		if (vehicleSpecification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleSpecificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicleSpecification;
	}

	/**
	 * Returns the vehicle specification with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException} if it could not be found.
	 *
	 * @param id the primary key of the vehicle specification
	 * @return the vehicle specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification findByPrimaryKey(long id)
		throws NoSuchVehicleSpecificationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle specification
	 * @return the vehicle specification, or <code>null</code> if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehicleSpecification vehicleSpecification = (VehicleSpecification)EntityCacheUtil.getResult(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
				VehicleSpecificationImpl.class, primaryKey);

		if (vehicleSpecification == _nullVehicleSpecification) {
			return null;
		}

		if (vehicleSpecification == null) {
			Session session = null;

			try {
				session = openSession();

				vehicleSpecification = (VehicleSpecification)session.get(VehicleSpecificationImpl.class,
						primaryKey);

				if (vehicleSpecification != null) {
					cacheResult(vehicleSpecification);
				}
				else {
					EntityCacheUtil.putResult(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
						VehicleSpecificationImpl.class, primaryKey,
						_nullVehicleSpecification);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleSpecificationModelImpl.ENTITY_CACHE_ENABLED,
					VehicleSpecificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicleSpecification;
	}

	/**
	 * Returns the vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehicle specification
	 * @return the vehicle specification, or <code>null</code> if a vehicle specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleSpecification fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehicle specifications.
	 *
	 * @return the vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle specifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @return the range of vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle specifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle specifications
	 * @param end the upper bound of the range of vehicle specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicle specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleSpecification> findAll(int start, int end,
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

		List<VehicleSpecification> list = (List<VehicleSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLESPECIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLESPECIFICATION;

				if (pagination) {
					sql = sql.concat(VehicleSpecificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleSpecification>(list);
				}
				else {
					list = (List<VehicleSpecification>)QueryUtil.list(q,
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
	 * Removes all the vehicle specifications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehicleSpecification vehicleSpecification : findAll()) {
			remove(vehicleSpecification);
		}
	}

	/**
	 * Returns the number of vehicle specifications.
	 *
	 * @return the number of vehicle specifications
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLESPECIFICATION);

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
	 * Initializes the vehicle specification persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehicleSpecification>> listenersList = new ArrayList<ModelListener<VehicleSpecification>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehicleSpecification>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehicleSpecificationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLESPECIFICATION = "SELECT vehicleSpecification FROM VehicleSpecification vehicleSpecification";
	private static final String _SQL_SELECT_VEHICLESPECIFICATION_WHERE = "SELECT vehicleSpecification FROM VehicleSpecification vehicleSpecification WHERE ";
	private static final String _SQL_COUNT_VEHICLESPECIFICATION = "SELECT COUNT(vehicleSpecification) FROM VehicleSpecification vehicleSpecification";
	private static final String _SQL_COUNT_VEHICLESPECIFICATION_WHERE = "SELECT COUNT(vehicleSpecification) FROM VehicleSpecification vehicleSpecification WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicleSpecification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehicleSpecification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VehicleSpecification exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehicleSpecificationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleGroupId", "specificationVersion",
				"specificationSourceCode", "specificationCode",
				"specificationName", "specificationValue", "safetyTestReportId",
				"inspectionRecordId", "specificResult"
			});
	private static VehicleSpecification _nullVehicleSpecification = new VehicleSpecificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehicleSpecification> toCacheModel() {
				return _nullVehicleSpecificationCacheModel;
			}
		};

	private static CacheModel<VehicleSpecification> _nullVehicleSpecificationCacheModel =
		new CacheModel<VehicleSpecification>() {
			@Override
			public VehicleSpecification toEntityModel() {
				return _nullVehicleSpecification;
			}
		};
}