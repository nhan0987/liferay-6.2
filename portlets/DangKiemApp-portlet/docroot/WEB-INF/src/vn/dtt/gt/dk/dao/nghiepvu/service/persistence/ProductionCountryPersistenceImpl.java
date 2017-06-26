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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the production country service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ProductionCountryPersistence
 * @see ProductionCountryUtil
 * @generated
 */
public class ProductionCountryPersistenceImpl extends BasePersistenceImpl<ProductionCountry>
	implements ProductionCountryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProductionCountryUtil} to access the production country persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProductionCountryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED,
			ProductionCountryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED,
			ProductionCountryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED,
			ProductionCountryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVehicleGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID =
		new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED,
			ProductionCountryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVehicleGroupId",
			new String[] { Long.class.getName() },
			ProductionCountryModelImpl.VEHICLEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPID = new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVehicleGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the production countries where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the matching production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the production countries where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of production countries
	 * @param end the upper bound of the range of production countries (not inclusive)
	 * @return the range of matching production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findByVehicleGroupId(long vehicleGroupId,
		int start, int end) throws SystemException {
		return findByVehicleGroupId(vehicleGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the production countries where vehicleGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param start the lower bound of the range of production countries
	 * @param end the upper bound of the range of production countries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findByVehicleGroupId(long vehicleGroupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<ProductionCountry> list = (List<ProductionCountry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductionCountry productionCountry : list) {
				if ((vehicleGroupId != productionCountry.getVehicleGroupId())) {
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

			query.append(_SQL_SELECT_PRODUCTIONCOUNTRY_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductionCountryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (!pagination) {
					list = (List<ProductionCountry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductionCountry>(list);
				}
				else {
					list = (List<ProductionCountry>)QueryUtil.list(q,
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
	 * Returns the first production country in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry findByVehicleGroupId_First(long vehicleGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchProductionCountryException, SystemException {
		ProductionCountry productionCountry = fetchByVehicleGroupId_First(vehicleGroupId,
				orderByComparator);

		if (productionCountry != null) {
			return productionCountry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductionCountryException(msg.toString());
	}

	/**
	 * Returns the first production country in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production country, or <code>null</code> if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry fetchByVehicleGroupId_First(long vehicleGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProductionCountry> list = findByVehicleGroupId(vehicleGroupId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last production country in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry findByVehicleGroupId_Last(long vehicleGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchProductionCountryException, SystemException {
		ProductionCountry productionCountry = fetchByVehicleGroupId_Last(vehicleGroupId,
				orderByComparator);

		if (productionCountry != null) {
			return productionCountry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductionCountryException(msg.toString());
	}

	/**
	 * Returns the last production country in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production country, or <code>null</code> if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry fetchByVehicleGroupId_Last(long vehicleGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByVehicleGroupId(vehicleGroupId);

		if (count == 0) {
			return null;
		}

		List<ProductionCountry> list = findByVehicleGroupId(vehicleGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the production countries before and after the current production country in the ordered set where vehicleGroupId = &#63;.
	 *
	 * @param id the primary key of the current production country
	 * @param vehicleGroupId the vehicle group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry[] findByVehicleGroupId_PrevAndNext(long id,
		long vehicleGroupId, OrderByComparator orderByComparator)
		throws NoSuchProductionCountryException, SystemException {
		ProductionCountry productionCountry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ProductionCountry[] array = new ProductionCountryImpl[3];

			array[0] = getByVehicleGroupId_PrevAndNext(session,
					productionCountry, vehicleGroupId, orderByComparator, true);

			array[1] = productionCountry;

			array[2] = getByVehicleGroupId_PrevAndNext(session,
					productionCountry, vehicleGroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductionCountry getByVehicleGroupId_PrevAndNext(
		Session session, ProductionCountry productionCountry,
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

		query.append(_SQL_SELECT_PRODUCTIONCOUNTRY_WHERE);

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
			query.append(ProductionCountryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productionCountry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductionCountry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the production countries where vehicleGroupId = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws SystemException {
		for (ProductionCountry productionCountry : findByVehicleGroupId(
				vehicleGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(productionCountry);
		}
	}

	/**
	 * Returns the number of production countries where vehicleGroupId = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @return the number of matching production countries
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

			query.append(_SQL_COUNT_PRODUCTIONCOUNTRY_WHERE);

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

	private static final String _FINDER_COLUMN_VEHICLEGROUPID_VEHICLEGROUPID_2 = "productionCountry.vehicleGroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPIDCOUNTRYCODE =
		new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED,
			ProductionCountryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByVehicleGroupIdCountryCode",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPIDCOUNTRYCODE =
		new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED,
			ProductionCountryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByVehicleGroupIdCountryCode",
			new String[] { Long.class.getName(), String.class.getName() },
			ProductionCountryModelImpl.VEHICLEGROUPID_COLUMN_BITMASK |
			ProductionCountryModelImpl.COUNTRYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLEGROUPIDCOUNTRYCODE =
		new FinderPath(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByVehicleGroupIdCountryCode",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @return the matching production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, String countryCode) throws SystemException {
		return findByVehicleGroupIdCountryCode(vehicleGroupId, countryCode,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @param start the lower bound of the range of production countries
	 * @param end the upper bound of the range of production countries (not inclusive)
	 * @return the range of matching production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, String countryCode, int start, int end)
		throws SystemException {
		return findByVehicleGroupIdCountryCode(vehicleGroupId, countryCode,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @param start the lower bound of the range of production countries
	 * @param end the upper bound of the range of production countries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, String countryCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPIDCOUNTRYCODE;
			finderArgs = new Object[] { vehicleGroupId, countryCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLEGROUPIDCOUNTRYCODE;
			finderArgs = new Object[] {
					vehicleGroupId, countryCode,
					
					start, end, orderByComparator
				};
		}

		List<ProductionCountry> list = (List<ProductionCountry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductionCountry productionCountry : list) {
				if ((vehicleGroupId != productionCountry.getVehicleGroupId()) ||
						!Validator.equals(countryCode,
							productionCountry.getCountryCode())) {
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

			query.append(_SQL_SELECT_PRODUCTIONCOUNTRY_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_VEHICLEGROUPID_2);

			boolean bindCountryCode = false;

			if (countryCode == null) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_1);
			}
			else if (countryCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_3);
			}
			else {
				bindCountryCode = true;

				query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductionCountryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (bindCountryCode) {
					qPos.add(countryCode);
				}

				if (!pagination) {
					list = (List<ProductionCountry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductionCountry>(list);
				}
				else {
					list = (List<ProductionCountry>)QueryUtil.list(q,
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
	 * Returns the first production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry findByVehicleGroupIdCountryCode_First(
		long vehicleGroupId, String countryCode,
		OrderByComparator orderByComparator)
		throws NoSuchProductionCountryException, SystemException {
		ProductionCountry productionCountry = fetchByVehicleGroupIdCountryCode_First(vehicleGroupId,
				countryCode, orderByComparator);

		if (productionCountry != null) {
			return productionCountry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(", countryCode=");
		msg.append(countryCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductionCountryException(msg.toString());
	}

	/**
	 * Returns the first production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production country, or <code>null</code> if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry fetchByVehicleGroupIdCountryCode_First(
		long vehicleGroupId, String countryCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProductionCountry> list = findByVehicleGroupIdCountryCode(vehicleGroupId,
				countryCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry findByVehicleGroupIdCountryCode_Last(
		long vehicleGroupId, String countryCode,
		OrderByComparator orderByComparator)
		throws NoSuchProductionCountryException, SystemException {
		ProductionCountry productionCountry = fetchByVehicleGroupIdCountryCode_Last(vehicleGroupId,
				countryCode, orderByComparator);

		if (productionCountry != null) {
			return productionCountry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleGroupId=");
		msg.append(vehicleGroupId);

		msg.append(", countryCode=");
		msg.append(countryCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductionCountryException(msg.toString());
	}

	/**
	 * Returns the last production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production country, or <code>null</code> if a matching production country could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry fetchByVehicleGroupIdCountryCode_Last(
		long vehicleGroupId, String countryCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByVehicleGroupIdCountryCode(vehicleGroupId, countryCode);

		if (count == 0) {
			return null;
		}

		List<ProductionCountry> list = findByVehicleGroupIdCountryCode(vehicleGroupId,
				countryCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the production countries before and after the current production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * @param id the primary key of the current production country
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry[] findByVehicleGroupIdCountryCode_PrevAndNext(
		long id, long vehicleGroupId, String countryCode,
		OrderByComparator orderByComparator)
		throws NoSuchProductionCountryException, SystemException {
		ProductionCountry productionCountry = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ProductionCountry[] array = new ProductionCountryImpl[3];

			array[0] = getByVehicleGroupIdCountryCode_PrevAndNext(session,
					productionCountry, vehicleGroupId, countryCode,
					orderByComparator, true);

			array[1] = productionCountry;

			array[2] = getByVehicleGroupIdCountryCode_PrevAndNext(session,
					productionCountry, vehicleGroupId, countryCode,
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

	protected ProductionCountry getByVehicleGroupIdCountryCode_PrevAndNext(
		Session session, ProductionCountry productionCountry,
		long vehicleGroupId, String countryCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRODUCTIONCOUNTRY_WHERE);

		query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_VEHICLEGROUPID_2);

		boolean bindCountryCode = false;

		if (countryCode == null) {
			query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_1);
		}
		else if (countryCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_3);
		}
		else {
			bindCountryCode = true;

			query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_2);
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
			query.append(ProductionCountryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleGroupId);

		if (bindCountryCode) {
			qPos.add(countryCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productionCountry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductionCountry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the production countries where vehicleGroupId = &#63; and countryCode = &#63; from the database.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByVehicleGroupIdCountryCode(long vehicleGroupId,
		String countryCode) throws SystemException {
		for (ProductionCountry productionCountry : findByVehicleGroupIdCountryCode(
				vehicleGroupId, countryCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(productionCountry);
		}
	}

	/**
	 * Returns the number of production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	 *
	 * @param vehicleGroupId the vehicle group ID
	 * @param countryCode the country code
	 * @return the number of matching production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByVehicleGroupIdCountryCode(long vehicleGroupId,
		String countryCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLEGROUPIDCOUNTRYCODE;

		Object[] finderArgs = new Object[] { vehicleGroupId, countryCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRODUCTIONCOUNTRY_WHERE);

			query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_VEHICLEGROUPID_2);

			boolean bindCountryCode = false;

			if (countryCode == null) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_1);
			}
			else if (countryCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_3);
			}
			else {
				bindCountryCode = true;

				query.append(_FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleGroupId);

				if (bindCountryCode) {
					qPos.add(countryCode);
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

	private static final String _FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_VEHICLEGROUPID_2 =
		"productionCountry.vehicleGroupId = ? AND ";
	private static final String _FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_1 =
		"productionCountry.countryCode IS NULL";
	private static final String _FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_2 =
		"productionCountry.countryCode = ?";
	private static final String _FINDER_COLUMN_VEHICLEGROUPIDCOUNTRYCODE_COUNTRYCODE_3 =
		"(productionCountry.countryCode IS NULL OR productionCountry.countryCode = '')";

	public ProductionCountryPersistenceImpl() {
		setModelClass(ProductionCountry.class);
	}

	/**
	 * Caches the production country in the entity cache if it is enabled.
	 *
	 * @param productionCountry the production country
	 */
	@Override
	public void cacheResult(ProductionCountry productionCountry) {
		EntityCacheUtil.putResult(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryImpl.class, productionCountry.getPrimaryKey(),
			productionCountry);

		productionCountry.resetOriginalValues();
	}

	/**
	 * Caches the production countries in the entity cache if it is enabled.
	 *
	 * @param productionCountries the production countries
	 */
	@Override
	public void cacheResult(List<ProductionCountry> productionCountries) {
		for (ProductionCountry productionCountry : productionCountries) {
			if (EntityCacheUtil.getResult(
						ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
						ProductionCountryImpl.class,
						productionCountry.getPrimaryKey()) == null) {
				cacheResult(productionCountry);
			}
			else {
				productionCountry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all production countries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProductionCountryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProductionCountryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the production country.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProductionCountry productionCountry) {
		EntityCacheUtil.removeResult(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryImpl.class, productionCountry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ProductionCountry> productionCountries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProductionCountry productionCountry : productionCountries) {
			EntityCacheUtil.removeResult(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
				ProductionCountryImpl.class, productionCountry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new production country with the primary key. Does not add the production country to the database.
	 *
	 * @param id the primary key for the new production country
	 * @return the new production country
	 */
	@Override
	public ProductionCountry create(long id) {
		ProductionCountry productionCountry = new ProductionCountryImpl();

		productionCountry.setNew(true);
		productionCountry.setPrimaryKey(id);

		return productionCountry;
	}

	/**
	 * Removes the production country with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the production country
	 * @return the production country that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry remove(long id)
		throws NoSuchProductionCountryException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the production country with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the production country
	 * @return the production country that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry remove(Serializable primaryKey)
		throws NoSuchProductionCountryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProductionCountry productionCountry = (ProductionCountry)session.get(ProductionCountryImpl.class,
					primaryKey);

			if (productionCountry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProductionCountryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(productionCountry);
		}
		catch (NoSuchProductionCountryException nsee) {
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
	protected ProductionCountry removeImpl(ProductionCountry productionCountry)
		throws SystemException {
		productionCountry = toUnwrappedModel(productionCountry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(productionCountry)) {
				productionCountry = (ProductionCountry)session.get(ProductionCountryImpl.class,
						productionCountry.getPrimaryKeyObj());
			}

			if (productionCountry != null) {
				session.delete(productionCountry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (productionCountry != null) {
			clearCache(productionCountry);
		}

		return productionCountry;
	}

	@Override
	public ProductionCountry updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry productionCountry)
		throws SystemException {
		productionCountry = toUnwrappedModel(productionCountry);

		boolean isNew = productionCountry.isNew();

		ProductionCountryModelImpl productionCountryModelImpl = (ProductionCountryModelImpl)productionCountry;

		Session session = null;

		try {
			session = openSession();

			if (productionCountry.isNew()) {
				session.save(productionCountry);

				productionCountry.setNew(false);
			}
			else {
				session.merge(productionCountry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProductionCountryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((productionCountryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productionCountryModelImpl.getOriginalVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);

				args = new Object[] {
						productionCountryModelImpl.getVehicleGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPID,
					args);
			}

			if ((productionCountryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPIDCOUNTRYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productionCountryModelImpl.getOriginalVehicleGroupId(),
						productionCountryModelImpl.getOriginalCountryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPIDCOUNTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPIDCOUNTRYCODE,
					args);

				args = new Object[] {
						productionCountryModelImpl.getVehicleGroupId(),
						productionCountryModelImpl.getCountryCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLEGROUPIDCOUNTRYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLEGROUPIDCOUNTRYCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
			ProductionCountryImpl.class, productionCountry.getPrimaryKey(),
			productionCountry);

		return productionCountry;
	}

	protected ProductionCountry toUnwrappedModel(
		ProductionCountry productionCountry) {
		if (productionCountry instanceof ProductionCountryImpl) {
			return productionCountry;
		}

		ProductionCountryImpl productionCountryImpl = new ProductionCountryImpl();

		productionCountryImpl.setNew(productionCountry.isNew());
		productionCountryImpl.setPrimaryKey(productionCountry.getPrimaryKey());

		productionCountryImpl.setId(productionCountry.getId());
		productionCountryImpl.setVehicleGroupId(productionCountry.getVehicleGroupId());
		productionCountryImpl.setCountryCode(productionCountry.getCountryCode());
		productionCountryImpl.setSynchDate(productionCountry.getSynchDate());

		return productionCountryImpl;
	}

	/**
	 * Returns the production country with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the production country
	 * @return the production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProductionCountryException, SystemException {
		ProductionCountry productionCountry = fetchByPrimaryKey(primaryKey);

		if (productionCountry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProductionCountryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return productionCountry;
	}

	/**
	 * Returns the production country with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException} if it could not be found.
	 *
	 * @param id the primary key of the production country
	 * @return the production country
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry findByPrimaryKey(long id)
		throws NoSuchProductionCountryException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the production country with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the production country
	 * @return the production country, or <code>null</code> if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProductionCountry productionCountry = (ProductionCountry)EntityCacheUtil.getResult(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
				ProductionCountryImpl.class, primaryKey);

		if (productionCountry == _nullProductionCountry) {
			return null;
		}

		if (productionCountry == null) {
			Session session = null;

			try {
				session = openSession();

				productionCountry = (ProductionCountry)session.get(ProductionCountryImpl.class,
						primaryKey);

				if (productionCountry != null) {
					cacheResult(productionCountry);
				}
				else {
					EntityCacheUtil.putResult(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
						ProductionCountryImpl.class, primaryKey,
						_nullProductionCountry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProductionCountryModelImpl.ENTITY_CACHE_ENABLED,
					ProductionCountryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return productionCountry;
	}

	/**
	 * Returns the production country with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the production country
	 * @return the production country, or <code>null</code> if a production country with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductionCountry fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the production countries.
	 *
	 * @return the production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the production countries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of production countries
	 * @param end the upper bound of the range of production countries (not inclusive)
	 * @return the range of production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the production countries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of production countries
	 * @param end the upper bound of the range of production countries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of production countries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductionCountry> findAll(int start, int end,
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

		List<ProductionCountry> list = (List<ProductionCountry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRODUCTIONCOUNTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCTIONCOUNTRY;

				if (pagination) {
					sql = sql.concat(ProductionCountryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProductionCountry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductionCountry>(list);
				}
				else {
					list = (List<ProductionCountry>)QueryUtil.list(q,
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
	 * Removes all the production countries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProductionCountry productionCountry : findAll()) {
			remove(productionCountry);
		}
	}

	/**
	 * Returns the number of production countries.
	 *
	 * @return the number of production countries
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

				Query q = session.createQuery(_SQL_COUNT_PRODUCTIONCOUNTRY);

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
	 * Initializes the production country persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProductionCountry>> listenersList = new ArrayList<ModelListener<ProductionCountry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProductionCountry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProductionCountryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRODUCTIONCOUNTRY = "SELECT productionCountry FROM ProductionCountry productionCountry";
	private static final String _SQL_SELECT_PRODUCTIONCOUNTRY_WHERE = "SELECT productionCountry FROM ProductionCountry productionCountry WHERE ";
	private static final String _SQL_COUNT_PRODUCTIONCOUNTRY = "SELECT COUNT(productionCountry) FROM ProductionCountry productionCountry";
	private static final String _SQL_COUNT_PRODUCTIONCOUNTRY_WHERE = "SELECT COUNT(productionCountry) FROM ProductionCountry productionCountry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "productionCountry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProductionCountry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProductionCountry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProductionCountryPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"vehicleGroupId", "countryCode", "SynchDate"
			});
	private static ProductionCountry _nullProductionCountry = new ProductionCountryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProductionCountry> toCacheModel() {
				return _nullProductionCountryCacheModel;
			}
		};

	private static CacheModel<ProductionCountry> _nullProductionCountryCacheModel =
		new CacheModel<ProductionCountry>() {
			@Override
			public ProductionCountry toEntityModel() {
				return _nullProductionCountry;
			}
		};
}