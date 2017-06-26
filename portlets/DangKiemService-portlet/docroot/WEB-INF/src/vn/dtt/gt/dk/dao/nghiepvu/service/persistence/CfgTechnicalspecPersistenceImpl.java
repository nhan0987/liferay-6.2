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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the cfg technicalspec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CfgTechnicalspecPersistence
 * @see CfgTechnicalspecUtil
 * @generated
 */
public class CfgTechnicalspecPersistenceImpl extends BasePersistenceImpl<CfgTechnicalspec>
	implements CfgTechnicalspecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CfgTechnicalspecUtil} to access the cfg technicalspec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CfgTechnicalspecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED,
			CfgTechnicalspecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED,
			CfgTechnicalspecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECODE =
		new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED,
			CfgTechnicalspecImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVehicleTypeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECODE =
		new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED,
			CfgTechnicalspecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleTypeCode",
			new String[] { String.class.getName() },
			CfgTechnicalspecModelImpl.VEHICLETYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECODE = new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleTypeCode", new String[] { String.class.getName() });

	/**
	 * Returns all the cfg technicalspecs where vehicleTypeCode = &#63;.
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @return the matching cfg technicalspecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgTechnicalspec> findByVehicleTypeCode(String vehicleTypeCode)
		throws SystemException {
		return findByVehicleTypeCode(vehicleTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cfg technicalspecs where vehicleTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @param start the lower bound of the range of cfg technicalspecs
	 * @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	 * @return the range of matching cfg technicalspecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgTechnicalspec> findByVehicleTypeCode(
		String vehicleTypeCode, int start, int end) throws SystemException {
		return findByVehicleTypeCode(vehicleTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cfg technicalspecs where vehicleTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @param start the lower bound of the range of cfg technicalspecs
	 * @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cfg technicalspecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgTechnicalspec> findByVehicleTypeCode(
		String vehicleTypeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECODE;
			finderArgs = new Object[] { vehicleTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECODE;
			finderArgs = new Object[] {
					vehicleTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<CfgTechnicalspec> list = (List<CfgTechnicalspec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CfgTechnicalspec cfgTechnicalspec : list) {
				if (!Validator.equals(vehicleTypeCode,
							cfgTechnicalspec.getVehicleTypeCode())) {
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

			query.append(_SQL_SELECT_CFGTECHNICALSPEC_WHERE);

			boolean bindVehicleTypeCode = false;

			if (vehicleTypeCode == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_1);
			}
			else if (vehicleTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_3);
			}
			else {
				bindVehicleTypeCode = true;

				query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CfgTechnicalspecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleTypeCode) {
					qPos.add(vehicleTypeCode);
				}

				if (!pagination) {
					list = (List<CfgTechnicalspec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CfgTechnicalspec>(list);
				}
				else {
					list = (List<CfgTechnicalspec>)QueryUtil.list(q,
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
	 * Returns the first cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cfg technicalspec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a matching cfg technicalspec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec findByVehicleTypeCode_First(
		String vehicleTypeCode, OrderByComparator orderByComparator)
		throws NoSuchCfgTechnicalspecException, SystemException {
		CfgTechnicalspec cfgTechnicalspec = fetchByVehicleTypeCode_First(vehicleTypeCode,
				orderByComparator);

		if (cfgTechnicalspec != null) {
			return cfgTechnicalspec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCode=");
		msg.append(vehicleTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCfgTechnicalspecException(msg.toString());
	}

	/**
	 * Returns the first cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec fetchByVehicleTypeCode_First(
		String vehicleTypeCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<CfgTechnicalspec> list = findByVehicleTypeCode(vehicleTypeCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cfg technicalspec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a matching cfg technicalspec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec findByVehicleTypeCode_Last(String vehicleTypeCode,
		OrderByComparator orderByComparator)
		throws NoSuchCfgTechnicalspecException, SystemException {
		CfgTechnicalspec cfgTechnicalspec = fetchByVehicleTypeCode_Last(vehicleTypeCode,
				orderByComparator);

		if (cfgTechnicalspec != null) {
			return cfgTechnicalspec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCode=");
		msg.append(vehicleTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCfgTechnicalspecException(msg.toString());
	}

	/**
	 * Returns the last cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec fetchByVehicleTypeCode_Last(
		String vehicleTypeCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByVehicleTypeCode(vehicleTypeCode);

		if (count == 0) {
			return null;
		}

		List<CfgTechnicalspec> list = findByVehicleTypeCode(vehicleTypeCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cfg technicalspecs before and after the current cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	 *
	 * @param id the primary key of the current cfg technicalspec
	 * @param vehicleTypeCode the vehicle type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cfg technicalspec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec[] findByVehicleTypeCode_PrevAndNext(long id,
		String vehicleTypeCode, OrderByComparator orderByComparator)
		throws NoSuchCfgTechnicalspecException, SystemException {
		CfgTechnicalspec cfgTechnicalspec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CfgTechnicalspec[] array = new CfgTechnicalspecImpl[3];

			array[0] = getByVehicleTypeCode_PrevAndNext(session,
					cfgTechnicalspec, vehicleTypeCode, orderByComparator, true);

			array[1] = cfgTechnicalspec;

			array[2] = getByVehicleTypeCode_PrevAndNext(session,
					cfgTechnicalspec, vehicleTypeCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CfgTechnicalspec getByVehicleTypeCode_PrevAndNext(
		Session session, CfgTechnicalspec cfgTechnicalspec,
		String vehicleTypeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CFGTECHNICALSPEC_WHERE);

		boolean bindVehicleTypeCode = false;

		if (vehicleTypeCode == null) {
			query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_1);
		}
		else if (vehicleTypeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_3);
		}
		else {
			bindVehicleTypeCode = true;

			query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_2);
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
			query.append(CfgTechnicalspecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindVehicleTypeCode) {
			qPos.add(vehicleTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cfgTechnicalspec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CfgTechnicalspec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cfg technicalspecs where vehicleTypeCode = &#63; from the database.
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleTypeCode(String vehicleTypeCode)
		throws SystemException {
		for (CfgTechnicalspec cfgTechnicalspec : findByVehicleTypeCode(
				vehicleTypeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cfgTechnicalspec);
		}
	}

	/**
	 * Returns the number of cfg technicalspecs where vehicleTypeCode = &#63;.
	 *
	 * @param vehicleTypeCode the vehicle type code
	 * @return the number of matching cfg technicalspecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleTypeCode(String vehicleTypeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECODE;

		Object[] finderArgs = new Object[] { vehicleTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CFGTECHNICALSPEC_WHERE);

			boolean bindVehicleTypeCode = false;

			if (vehicleTypeCode == null) {
				query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_1);
			}
			else if (vehicleTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_3);
			}
			else {
				bindVehicleTypeCode = true;

				query.append(_FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVehicleTypeCode) {
					qPos.add(vehicleTypeCode);
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

	private static final String _FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_1 =
		"cfgTechnicalspec.vehicleTypeCode IS NULL";
	private static final String _FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_2 =
		"cfgTechnicalspec.vehicleTypeCode = ?";
	private static final String _FINDER_COLUMN_VEHICLETYPECODE_VEHICLETYPECODE_3 =
		"(cfgTechnicalspec.vehicleTypeCode IS NULL OR cfgTechnicalspec.vehicleTypeCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_SPECIFICATIONCODE = new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED,
			CfgTechnicalspecImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySpecificationCode",
			new String[] { String.class.getName() },
			CfgTechnicalspecModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPECIFICATIONCODE = new FinderPath(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySpecificationCode", new String[] { String.class.getName() });

	/**
	 * Returns the cfg technicalspec where specificationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException} if it could not be found.
	 *
	 * @param specificationCode the specification code
	 * @return the matching cfg technicalspec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a matching cfg technicalspec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec findBySpecificationCode(String specificationCode)
		throws NoSuchCfgTechnicalspecException, SystemException {
		CfgTechnicalspec cfgTechnicalspec = fetchBySpecificationCode(specificationCode);

		if (cfgTechnicalspec == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("specificationCode=");
			msg.append(specificationCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCfgTechnicalspecException(msg.toString());
		}

		return cfgTechnicalspec;
	}

	/**
	 * Returns the cfg technicalspec where specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param specificationCode the specification code
	 * @return the matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec fetchBySpecificationCode(String specificationCode)
		throws SystemException {
		return fetchBySpecificationCode(specificationCode, true);
	}

	/**
	 * Returns the cfg technicalspec where specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param specificationCode the specification code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec fetchBySpecificationCode(String specificationCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { specificationCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
					finderArgs, this);
		}

		if (result instanceof CfgTechnicalspec) {
			CfgTechnicalspec cfgTechnicalspec = (CfgTechnicalspec)result;

			if (!Validator.equals(specificationCode,
						cfgTechnicalspec.getSpecificationCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CFGTECHNICALSPEC_WHERE);

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

				List<CfgTechnicalspec> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CfgTechnicalspecPersistenceImpl.fetchBySpecificationCode(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CfgTechnicalspec cfgTechnicalspec = list.get(0);

					result = cfgTechnicalspec;

					cacheResult(cfgTechnicalspec);

					if ((cfgTechnicalspec.getSpecificationCode() == null) ||
							!cfgTechnicalspec.getSpecificationCode()
												 .equals(specificationCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
							finderArgs, cfgTechnicalspec);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
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
			return (CfgTechnicalspec)result;
		}
	}

	/**
	 * Removes the cfg technicalspec where specificationCode = &#63; from the database.
	 *
	 * @param specificationCode the specification code
	 * @return the cfg technicalspec that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec removeBySpecificationCode(String specificationCode)
		throws NoSuchCfgTechnicalspecException, SystemException {
		CfgTechnicalspec cfgTechnicalspec = findBySpecificationCode(specificationCode);

		return remove(cfgTechnicalspec);
	}

	/**
	 * Returns the number of cfg technicalspecs where specificationCode = &#63;.
	 *
	 * @param specificationCode the specification code
	 * @return the number of matching cfg technicalspecs
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

			query.append(_SQL_COUNT_CFGTECHNICALSPEC_WHERE);

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
		"cfgTechnicalspec.specificationCode IS NULL";
	private static final String _FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"cfgTechnicalspec.specificationCode = ?";
	private static final String _FINDER_COLUMN_SPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(cfgTechnicalspec.specificationCode IS NULL OR cfgTechnicalspec.specificationCode = '')";

	public CfgTechnicalspecPersistenceImpl() {
		setModelClass(CfgTechnicalspec.class);
	}

	/**
	 * Caches the cfg technicalspec in the entity cache if it is enabled.
	 *
	 * @param cfgTechnicalspec the cfg technicalspec
	 */
	@Override
	public void cacheResult(CfgTechnicalspec cfgTechnicalspec) {
		EntityCacheUtil.putResult(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecImpl.class, cfgTechnicalspec.getPrimaryKey(),
			cfgTechnicalspec);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
			new Object[] { cfgTechnicalspec.getSpecificationCode() },
			cfgTechnicalspec);

		cfgTechnicalspec.resetOriginalValues();
	}

	/**
	 * Caches the cfg technicalspecs in the entity cache if it is enabled.
	 *
	 * @param cfgTechnicalspecs the cfg technicalspecs
	 */
	@Override
	public void cacheResult(List<CfgTechnicalspec> cfgTechnicalspecs) {
		for (CfgTechnicalspec cfgTechnicalspec : cfgTechnicalspecs) {
			if (EntityCacheUtil.getResult(
						CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
						CfgTechnicalspecImpl.class,
						cfgTechnicalspec.getPrimaryKey()) == null) {
				cacheResult(cfgTechnicalspec);
			}
			else {
				cfgTechnicalspec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cfg technicalspecs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CfgTechnicalspecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CfgTechnicalspecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cfg technicalspec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CfgTechnicalspec cfgTechnicalspec) {
		EntityCacheUtil.removeResult(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecImpl.class, cfgTechnicalspec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(cfgTechnicalspec);
	}

	@Override
	public void clearCache(List<CfgTechnicalspec> cfgTechnicalspecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CfgTechnicalspec cfgTechnicalspec : cfgTechnicalspecs) {
			EntityCacheUtil.removeResult(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
				CfgTechnicalspecImpl.class, cfgTechnicalspec.getPrimaryKey());

			clearUniqueFindersCache(cfgTechnicalspec);
		}
	}

	protected void cacheUniqueFindersCache(CfgTechnicalspec cfgTechnicalspec) {
		if (cfgTechnicalspec.isNew()) {
			Object[] args = new Object[] { cfgTechnicalspec.getSpecificationCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
				args, cfgTechnicalspec);
		}
		else {
			CfgTechnicalspecModelImpl cfgTechnicalspecModelImpl = (CfgTechnicalspecModelImpl)cfgTechnicalspec;

			if ((cfgTechnicalspecModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cfgTechnicalspec.getSpecificationCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
					args, cfgTechnicalspec);
			}
		}
	}

	protected void clearUniqueFindersCache(CfgTechnicalspec cfgTechnicalspec) {
		CfgTechnicalspecModelImpl cfgTechnicalspecModelImpl = (CfgTechnicalspecModelImpl)cfgTechnicalspec;

		Object[] args = new Object[] { cfgTechnicalspec.getSpecificationCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
			args);

		if ((cfgTechnicalspecModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SPECIFICATIONCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					cfgTechnicalspecModelImpl.getOriginalSpecificationCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SPECIFICATIONCODE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SPECIFICATIONCODE,
				args);
		}
	}

	/**
	 * Creates a new cfg technicalspec with the primary key. Does not add the cfg technicalspec to the database.
	 *
	 * @param id the primary key for the new cfg technicalspec
	 * @return the new cfg technicalspec
	 */
	@Override
	public CfgTechnicalspec create(long id) {
		CfgTechnicalspec cfgTechnicalspec = new CfgTechnicalspecImpl();

		cfgTechnicalspec.setNew(true);
		cfgTechnicalspec.setPrimaryKey(id);

		return cfgTechnicalspec;
	}

	/**
	 * Removes the cfg technicalspec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cfg technicalspec
	 * @return the cfg technicalspec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec remove(long id)
		throws NoSuchCfgTechnicalspecException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the cfg technicalspec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cfg technicalspec
	 * @return the cfg technicalspec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec remove(Serializable primaryKey)
		throws NoSuchCfgTechnicalspecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CfgTechnicalspec cfgTechnicalspec = (CfgTechnicalspec)session.get(CfgTechnicalspecImpl.class,
					primaryKey);

			if (cfgTechnicalspec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCfgTechnicalspecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cfgTechnicalspec);
		}
		catch (NoSuchCfgTechnicalspecException nsee) {
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
	protected CfgTechnicalspec removeImpl(CfgTechnicalspec cfgTechnicalspec)
		throws SystemException {
		cfgTechnicalspec = toUnwrappedModel(cfgTechnicalspec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cfgTechnicalspec)) {
				cfgTechnicalspec = (CfgTechnicalspec)session.get(CfgTechnicalspecImpl.class,
						cfgTechnicalspec.getPrimaryKeyObj());
			}

			if (cfgTechnicalspec != null) {
				session.delete(cfgTechnicalspec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cfgTechnicalspec != null) {
			clearCache(cfgTechnicalspec);
		}

		return cfgTechnicalspec;
	}

	@Override
	public CfgTechnicalspec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec)
		throws SystemException {
		cfgTechnicalspec = toUnwrappedModel(cfgTechnicalspec);

		boolean isNew = cfgTechnicalspec.isNew();

		CfgTechnicalspecModelImpl cfgTechnicalspecModelImpl = (CfgTechnicalspecModelImpl)cfgTechnicalspec;

		Session session = null;

		try {
			session = openSession();

			if (cfgTechnicalspec.isNew()) {
				session.save(cfgTechnicalspec);

				cfgTechnicalspec.setNew(false);
			}
			else {
				session.merge(cfgTechnicalspec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CfgTechnicalspecModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cfgTechnicalspecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cfgTechnicalspecModelImpl.getOriginalVehicleTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECODE,
					args);

				args = new Object[] {
						cfgTechnicalspecModelImpl.getVehicleTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
			CfgTechnicalspecImpl.class, cfgTechnicalspec.getPrimaryKey(),
			cfgTechnicalspec);

		clearUniqueFindersCache(cfgTechnicalspec);
		cacheUniqueFindersCache(cfgTechnicalspec);

		return cfgTechnicalspec;
	}

	protected CfgTechnicalspec toUnwrappedModel(
		CfgTechnicalspec cfgTechnicalspec) {
		if (cfgTechnicalspec instanceof CfgTechnicalspecImpl) {
			return cfgTechnicalspec;
		}

		CfgTechnicalspecImpl cfgTechnicalspecImpl = new CfgTechnicalspecImpl();

		cfgTechnicalspecImpl.setNew(cfgTechnicalspec.isNew());
		cfgTechnicalspecImpl.setPrimaryKey(cfgTechnicalspec.getPrimaryKey());

		cfgTechnicalspecImpl.setId(cfgTechnicalspec.getId());
		cfgTechnicalspecImpl.setVehicleTypeCode(cfgTechnicalspec.getVehicleTypeCode());
		cfgTechnicalspecImpl.setVehicleTypeName(cfgTechnicalspec.getVehicleTypeName());
		cfgTechnicalspecImpl.setSequenceno(cfgTechnicalspec.getSequenceno());
		cfgTechnicalspecImpl.setSpecificationCode(cfgTechnicalspec.getSpecificationCode());
		cfgTechnicalspecImpl.setSpecificationName(cfgTechnicalspec.getSpecificationName());
		cfgTechnicalspecImpl.setSpecDescription(cfgTechnicalspec.getSpecDescription());
		cfgTechnicalspecImpl.setSpecCategory(cfgTechnicalspec.getSpecCategory());
		cfgTechnicalspecImpl.setSpecificationGroup(cfgTechnicalspec.getSpecificationGroup());
		cfgTechnicalspecImpl.setSearchingIncluded(cfgTechnicalspec.getSearchingIncluded());
		cfgTechnicalspecImpl.setReferenceIncluded(cfgTechnicalspec.getReferenceIncluded());
		cfgTechnicalspecImpl.setCertificateIncluded(cfgTechnicalspec.getCertificateIncluded());
		cfgTechnicalspecImpl.setDatagroupid(cfgTechnicalspec.getDatagroupid());
		cfgTechnicalspecImpl.setSynchdate(cfgTechnicalspec.getSynchdate());

		return cfgTechnicalspecImpl;
	}

	/**
	 * Returns the cfg technicalspec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfg technicalspec
	 * @return the cfg technicalspec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCfgTechnicalspecException, SystemException {
		CfgTechnicalspec cfgTechnicalspec = fetchByPrimaryKey(primaryKey);

		if (cfgTechnicalspec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCfgTechnicalspecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cfgTechnicalspec;
	}

	/**
	 * Returns the cfg technicalspec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException} if it could not be found.
	 *
	 * @param id the primary key of the cfg technicalspec
	 * @return the cfg technicalspec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec findByPrimaryKey(long id)
		throws NoSuchCfgTechnicalspecException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the cfg technicalspec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cfg technicalspec
	 * @return the cfg technicalspec, or <code>null</code> if a cfg technicalspec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CfgTechnicalspec cfgTechnicalspec = (CfgTechnicalspec)EntityCacheUtil.getResult(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
				CfgTechnicalspecImpl.class, primaryKey);

		if (cfgTechnicalspec == _nullCfgTechnicalspec) {
			return null;
		}

		if (cfgTechnicalspec == null) {
			Session session = null;

			try {
				session = openSession();

				cfgTechnicalspec = (CfgTechnicalspec)session.get(CfgTechnicalspecImpl.class,
						primaryKey);

				if (cfgTechnicalspec != null) {
					cacheResult(cfgTechnicalspec);
				}
				else {
					EntityCacheUtil.putResult(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
						CfgTechnicalspecImpl.class, primaryKey,
						_nullCfgTechnicalspec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CfgTechnicalspecModelImpl.ENTITY_CACHE_ENABLED,
					CfgTechnicalspecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cfgTechnicalspec;
	}

	/**
	 * Returns the cfg technicalspec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cfg technicalspec
	 * @return the cfg technicalspec, or <code>null</code> if a cfg technicalspec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CfgTechnicalspec fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the cfg technicalspecs.
	 *
	 * @return the cfg technicalspecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgTechnicalspec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cfg technicalspecs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfg technicalspecs
	 * @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	 * @return the range of cfg technicalspecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgTechnicalspec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cfg technicalspecs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cfg technicalspecs
	 * @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cfg technicalspecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CfgTechnicalspec> findAll(int start, int end,
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

		List<CfgTechnicalspec> list = (List<CfgTechnicalspec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CFGTECHNICALSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CFGTECHNICALSPEC;

				if (pagination) {
					sql = sql.concat(CfgTechnicalspecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CfgTechnicalspec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CfgTechnicalspec>(list);
				}
				else {
					list = (List<CfgTechnicalspec>)QueryUtil.list(q,
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
	 * Removes all the cfg technicalspecs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CfgTechnicalspec cfgTechnicalspec : findAll()) {
			remove(cfgTechnicalspec);
		}
	}

	/**
	 * Returns the number of cfg technicalspecs.
	 *
	 * @return the number of cfg technicalspecs
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

				Query q = session.createQuery(_SQL_COUNT_CFGTECHNICALSPEC);

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
	 * Initializes the cfg technicalspec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CfgTechnicalspec>> listenersList = new ArrayList<ModelListener<CfgTechnicalspec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CfgTechnicalspec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CfgTechnicalspecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CFGTECHNICALSPEC = "SELECT cfgTechnicalspec FROM CfgTechnicalspec cfgTechnicalspec";
	private static final String _SQL_SELECT_CFGTECHNICALSPEC_WHERE = "SELECT cfgTechnicalspec FROM CfgTechnicalspec cfgTechnicalspec WHERE ";
	private static final String _SQL_COUNT_CFGTECHNICALSPEC = "SELECT COUNT(cfgTechnicalspec) FROM CfgTechnicalspec cfgTechnicalspec";
	private static final String _SQL_COUNT_CFGTECHNICALSPEC_WHERE = "SELECT COUNT(cfgTechnicalspec) FROM CfgTechnicalspec cfgTechnicalspec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cfgTechnicalspec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CfgTechnicalspec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CfgTechnicalspec exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CfgTechnicalspecPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleTypeCode", "vehicleTypeName", "specificationCode",
				"specificationName", "specDescription", "specCategory",
				"specificationGroup", "searchingIncluded", "referenceIncluded",
				"certificateIncluded"
			});
	private static CfgTechnicalspec _nullCfgTechnicalspec = new CfgTechnicalspecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CfgTechnicalspec> toCacheModel() {
				return _nullCfgTechnicalspecCacheModel;
			}
		};

	private static CacheModel<CfgTechnicalspec> _nullCfgTechnicalspecCacheModel = new CacheModel<CfgTechnicalspec>() {
			@Override
			public CfgTechnicalspec toEntityModel() {
				return _nullCfgTechnicalspec;
			}
		};
}