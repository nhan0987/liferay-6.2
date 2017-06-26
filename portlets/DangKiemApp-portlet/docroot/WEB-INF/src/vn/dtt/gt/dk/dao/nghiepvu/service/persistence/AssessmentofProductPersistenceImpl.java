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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessmentof product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofProductPersistence
 * @see AssessmentofProductUtil
 * @generated
 */
public class AssessmentofProductPersistenceImpl extends BasePersistenceImpl<AssessmentofProduct>
	implements AssessmentofProductPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentofProductUtil} to access the assessmentof product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentofProductImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProductCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProductCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTCODE_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTCODE = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductCode(String productcode,
		String assessmentid, String assessmentyear) throws SystemException {
		return findByProductCode(productcode, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductCode(String productcode,
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByProductCode(productcode, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductCode(String productcode,
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE;
			finderArgs = new Object[] { productcode, assessmentid, assessmentyear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODE;
			finderArgs = new Object[] {
					productcode, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productcode,
							assessmentofProduct.getProductcode()) ||
						!Validator.equals(assessmentid,
							assessmentofProduct.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofProduct.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcode = false;

			if (productcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_1);
			}
			else if (productcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_3);
			}
			else {
				bindProductcode = true;

				query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcode) {
					qPos.add(productcode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductCode_First(String productcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductCode_First(productcode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcode=");
		msg.append(productcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductCode_First(String productcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofProduct> list = findByProductCode(productcode,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductCode_Last(String productcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductCode_Last(productcode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcode=");
		msg.append(productcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductCode_Last(String productcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductCode(productcode, assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByProductCode(productcode,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByProductCode_PrevAndNext(long id,
		String productcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByProductCode_PrevAndNext(session,
					assessmentofProduct, productcode, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByProductCode_PrevAndNext(session,
					assessmentofProduct, productcode, assessmentid,
					assessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByProductCode_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductcode = false;

		if (productcode == null) {
			query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_1);
		}
		else if (productcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_3);
		}
		else {
			bindProductcode = true;

			query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductcode) {
			qPos.add(productcode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductCode(String productcode, String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByProductCode(
				productcode, assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductCode(String productcode, String assessmentid,
		String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTCODE;

		Object[] finderArgs = new Object[] {
				productcode, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcode = false;

			if (productcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_1);
			}
			else if (productcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_3);
			}
			else {
				bindProductcode = true;

				query.append(_FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcode) {
					qPos.add(productcode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
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

	private static final String _FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_1 = "assessmentofProduct.productcode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_2 = "assessmentofProduct.productcode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_3 = "(assessmentofProduct.productcode IS NULL OR assessmentofProduct.productcode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_1 = "assessmentofProduct.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_2 = "assessmentofProduct.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_3 = "(assessmentofProduct.assessmentid IS NULL OR assessmentofProduct.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_1 = "assessmentofProduct.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_2 = "assessmentofProduct.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_3 = "(assessmentofProduct.assessmentyear IS NULL OR assessmentofProduct.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTNAME =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProductName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProductName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTNAME_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTNAME = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductName(String productname,
		String assessmentid, String assessmentyear) throws SystemException {
		return findByProductName(productname, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductName(String productname,
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByProductName(productname, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductName(String productname,
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME;
			finderArgs = new Object[] { productname, assessmentid, assessmentyear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTNAME;
			finderArgs = new Object[] {
					productname, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productname,
							assessmentofProduct.getProductname()) ||
						!Validator.equals(assessmentid,
							assessmentofProduct.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofProduct.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductname = false;

			if (productname == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1);
			}
			else if (productname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3);
			}
			else {
				bindProductname = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductname) {
					qPos.add(productname);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductName_First(String productname,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductName_First(productname,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productname=");
		msg.append(productname);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductName_First(String productname,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofProduct> list = findByProductName(productname,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductName_Last(String productname,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductName_Last(productname,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productname=");
		msg.append(productname);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductName_Last(String productname,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductName(productname, assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByProductName(productname,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByProductName_PrevAndNext(long id,
		String productname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByProductName_PrevAndNext(session,
					assessmentofProduct, productname, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByProductName_PrevAndNext(session,
					assessmentofProduct, productname, assessmentid,
					assessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByProductName_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductname = false;

		if (productname == null) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1);
		}
		else if (productname.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3);
		}
		else {
			bindProductname = true;

			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductname) {
			qPos.add(productname);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductName(String productname, String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByProductName(
				productname, assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductName(String productname, String assessmentid,
		String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTNAME;

		Object[] finderArgs = new Object[] {
				productname, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductname = false;

			if (productname == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1);
			}
			else if (productname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3);
			}
			else {
				bindProductname = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductname) {
					qPos.add(productname);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
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

	private static final String _FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_1 = "assessmentofProduct.productname IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_2 = "assessmentofProduct.productname = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAME_PRODUCTNAME_3 = "(assessmentofProduct.productname IS NULL OR assessmentofProduct.productname = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_1 = "assessmentofProduct.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_2 = "assessmentofProduct.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAME_ASSESSMENTID_3 = "(assessmentofProduct.assessmentid IS NULL OR assessmentofProduct.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_1 = "assessmentofProduct.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_2 = "assessmentofProduct.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTNAME_ASSESSMENTYEAR_3 = "(assessmentofProduct.assessmentyear IS NULL OR assessmentofProduct.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProductCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProductCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTCODEREFERENCE_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTCODEREFERENCE = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProductCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductCodeReference(
		String productcodereference, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByProductCodeReference(productcodereference, assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductCodeReference(
		String productcodereference, String assessmentid,
		String assessmentyear, int start, int end) throws SystemException {
		return findByProductCodeReference(productcodereference, assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductCodeReference(
		String productcodereference, String assessmentid,
		String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODEREFERENCE;
			finderArgs = new Object[] {
					productcodereference, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODEREFERENCE;
			finderArgs = new Object[] {
					productcodereference, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productcodereference,
							assessmentofProduct.getProductcodereference()) ||
						!Validator.equals(assessmentid,
							assessmentofProduct.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofProduct.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcodereference = false;

			if (productcodereference == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1);
			}
			else if (productcodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3);
			}
			else {
				bindProductcodereference = true;

				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcodereference) {
					qPos.add(productcodereference);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductCodeReference_First(
		String productcodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductCodeReference_First(productcodereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcodereference=");
		msg.append(productcodereference);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductCodeReference_First(
		String productcodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofProduct> list = findByProductCodeReference(productcodereference,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductCodeReference_Last(
		String productcodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductCodeReference_Last(productcodereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcodereference=");
		msg.append(productcodereference);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductCodeReference_Last(
		String productcodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByProductCodeReference(productcodereference,
				assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByProductCodeReference(productcodereference,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByProductCodeReference_PrevAndNext(
		long id, String productcodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByProductCodeReference_PrevAndNext(session,
					assessmentofProduct, productcodereference, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByProductCodeReference_PrevAndNext(session,
					assessmentofProduct, productcodereference, assessmentid,
					assessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByProductCodeReference_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productcodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductcodereference = false;

		if (productcodereference == null) {
			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1);
		}
		else if (productcodereference.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3);
		}
		else {
			bindProductcodereference = true;

			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductcodereference) {
			qPos.add(productcodereference);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductCodeReference(String productcodereference,
		String assessmentid, String assessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByProductCodeReference(
				productcodereference, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductCodeReference(String productcodereference,
		String assessmentid, String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTCODEREFERENCE;

		Object[] finderArgs = new Object[] {
				productcodereference, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcodereference = false;

			if (productcodereference == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1);
			}
			else if (productcodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3);
			}
			else {
				bindProductcodereference = true;

				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcodereference) {
					qPos.add(productcodereference);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
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

	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1 =
		"assessmentofProduct.productcodereference IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2 =
		"assessmentofProduct.productcodereference = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3 =
		"(assessmentofProduct.productcodereference IS NULL OR assessmentofProduct.productcodereference = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_1 =
		"assessmentofProduct.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_2 =
		"assessmentofProduct.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTID_3 =
		"(assessmentofProduct.assessmentid IS NULL OR assessmentofProduct.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_1 =
		"assessmentofProduct.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_2 =
		"assessmentofProduct.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTCODEREFERENCE_ASSESSMENTYEAR_3 =
		"(assessmentofProduct.assessmentyear IS NULL OR assessmentofProduct.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTNAMEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProductNameReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAMEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProductNameReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTNAMEREFERENCE_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTNAMEREFERENCE = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProductNameReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductNameReference(
		String productnamereference, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByProductNameReference(productnamereference, assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductNameReference(
		String productnamereference, String assessmentid,
		String assessmentyear, int start, int end) throws SystemException {
		return findByProductNameReference(productnamereference, assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductNameReference(
		String productnamereference, String assessmentid,
		String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAMEREFERENCE;
			finderArgs = new Object[] {
					productnamereference, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTNAMEREFERENCE;
			finderArgs = new Object[] {
					productnamereference, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productnamereference,
							assessmentofProduct.getProductnamereference()) ||
						!Validator.equals(assessmentid,
							assessmentofProduct.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofProduct.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductnamereference = false;

			if (productnamereference == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1);
			}
			else if (productnamereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3);
			}
			else {
				bindProductnamereference = true;

				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductnamereference) {
					qPos.add(productnamereference);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductNameReference_First(
		String productnamereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductNameReference_First(productnamereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productnamereference=");
		msg.append(productnamereference);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductNameReference_First(
		String productnamereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofProduct> list = findByProductNameReference(productnamereference,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductNameReference_Last(
		String productnamereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductNameReference_Last(productnamereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productnamereference=");
		msg.append(productnamereference);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductNameReference_Last(
		String productnamereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByProductNameReference(productnamereference,
				assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByProductNameReference(productnamereference,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByProductNameReference_PrevAndNext(
		long id, String productnamereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByProductNameReference_PrevAndNext(session,
					assessmentofProduct, productnamereference, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByProductNameReference_PrevAndNext(session,
					assessmentofProduct, productnamereference, assessmentid,
					assessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByProductNameReference_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productnamereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductnamereference = false;

		if (productnamereference == null) {
			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1);
		}
		else if (productnamereference.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3);
		}
		else {
			bindProductnamereference = true;

			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductnamereference) {
			qPos.add(productnamereference);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductNameReference(String productnamereference,
		String assessmentid, String assessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByProductNameReference(
				productnamereference, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductNameReference(String productnamereference,
		String assessmentid, String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTNAMEREFERENCE;

		Object[] finderArgs = new Object[] {
				productnamereference, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductnamereference = false;

			if (productnamereference == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1);
			}
			else if (productnamereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3);
			}
			else {
				bindProductnamereference = true;

				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductnamereference) {
					qPos.add(productnamereference);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
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

	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1 =
		"assessmentofProduct.productnamereference IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2 =
		"assessmentofProduct.productnamereference = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3 =
		"(assessmentofProduct.productnamereference IS NULL OR assessmentofProduct.productnamereference = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_1 =
		"assessmentofProduct.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_2 =
		"assessmentofProduct.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTID_3 =
		"(assessmentofProduct.assessmentid IS NULL OR assessmentofProduct.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_1 =
		"assessmentofProduct.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_2 =
		"assessmentofProduct.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTNAMEREFERENCE_ASSESSMENTYEAR_3 =
		"(assessmentofProduct.assessmentyear IS NULL OR assessmentofProduct.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTDESCRIPTION =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProductDescription",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTDESCRIPTION =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProductDescription",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTDESCRIPTION_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTDESCRIPTION = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProductDescription",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductDescription(
		String productdescription, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByProductDescription(productdescription, assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductDescription(
		String productdescription, String assessmentid, String assessmentyear,
		int start, int end) throws SystemException {
		return findByProductDescription(productdescription, assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByProductDescription(
		String productdescription, String assessmentid, String assessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTDESCRIPTION;
			finderArgs = new Object[] {
					productdescription, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTDESCRIPTION;
			finderArgs = new Object[] {
					productdescription, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productdescription,
							assessmentofProduct.getProductdescription()) ||
						!Validator.equals(assessmentid,
							assessmentofProduct.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofProduct.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductdescription = false;

			if (productdescription == null) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1);
			}
			else if (productdescription.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3);
			}
			else {
				bindProductdescription = true;

				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductdescription) {
					qPos.add(productdescription);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductDescription_First(
		String productdescription, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductDescription_First(productdescription,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productdescription=");
		msg.append(productdescription);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductDescription_First(
		String productdescription, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofProduct> list = findByProductDescription(productdescription,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByProductDescription_Last(
		String productdescription, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByProductDescription_Last(productdescription,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productdescription=");
		msg.append(productdescription);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByProductDescription_Last(
		String productdescription, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductDescription(productdescription, assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByProductDescription(productdescription,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByProductDescription_PrevAndNext(long id,
		String productdescription, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByProductDescription_PrevAndNext(session,
					assessmentofProduct, productdescription, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByProductDescription_PrevAndNext(session,
					assessmentofProduct, productdescription, assessmentid,
					assessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByProductDescription_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productdescription, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductdescription = false;

		if (productdescription == null) {
			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1);
		}
		else if (productdescription.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3);
		}
		else {
			bindProductdescription = true;

			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductdescription) {
			qPos.add(productdescription);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductDescription(String productdescription,
		String assessmentid, String assessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByProductDescription(
				productdescription, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductDescription(String productdescription,
		String assessmentid, String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTDESCRIPTION;

		Object[] finderArgs = new Object[] {
				productdescription, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductdescription = false;

			if (productdescription == null) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1);
			}
			else if (productdescription.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3);
			}
			else {
				bindProductdescription = true;

				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductdescription) {
					qPos.add(productdescription);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
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

	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1 =
		"assessmentofProduct.productdescription IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2 =
		"assessmentofProduct.productdescription = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3 =
		"(assessmentofProduct.productdescription IS NULL OR assessmentofProduct.productdescription = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_1 =
		"assessmentofProduct.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_2 =
		"assessmentofProduct.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTID_3 =
		"(assessmentofProduct.assessmentid IS NULL OR assessmentofProduct.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_1 =
		"assessmentofProduct.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_2 =
		"assessmentofProduct.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTDESCRIPTION_ASSESSMENTYEAR_3 =
		"(assessmentofProduct.assessmentyear IS NULL OR assessmentofProduct.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByProductCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByProductCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTCODE_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODE = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByProductCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductCode(
		String productcode, String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		return findByNextPeriodByProductCode(productcode, nextassessmentid,
			nextassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductCode(
		String productcode, String nextassessmentid, String nextassessmentyear,
		int start, int end) throws SystemException {
		return findByNextPeriodByProductCode(productcode, nextassessmentid,
			nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductCode(
		String productcode, String nextassessmentid, String nextassessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODE;
			finderArgs = new Object[] {
					productcode, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODE;
			finderArgs = new Object[] {
					productcode, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productcode,
							assessmentofProduct.getProductcode()) ||
						!Validator.equals(nextassessmentid,
							assessmentofProduct.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofProduct.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcode = false;

			if (productcode == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_1);
			}
			else if (productcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_3);
			}
			else {
				bindProductcode = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcode) {
					qPos.add(productcode);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductCode_First(
		String productcode, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductCode_First(productcode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcode=");
		msg.append(productcode);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductCode_First(
		String productcode, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofProduct> list = findByNextPeriodByProductCode(productcode,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductCode_Last(
		String productcode, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductCode_Last(productcode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcode=");
		msg.append(productcode);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductCode_Last(
		String productcode, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNextPeriodByProductCode(productcode,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByNextPeriodByProductCode(productcode,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByNextPeriodByProductCode_PrevAndNext(
		long id, String productcode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByNextPeriodByProductCode_PrevAndNext(session,
					assessmentofProduct, productcode, nextassessmentid,
					nextassessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByNextPeriodByProductCode_PrevAndNext(session,
					assessmentofProduct, productcode, nextassessmentid,
					nextassessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByNextPeriodByProductCode_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productcode, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductcode = false;

		if (productcode == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_1);
		}
		else if (productcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_3);
		}
		else {
			bindProductcode = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductcode) {
			qPos.add(productcode);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByProductCode(String productcode,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByNextPeriodByProductCode(
				productcode, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcode the productcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByProductCode(String productcode,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODE;

		Object[] finderArgs = new Object[] {
				productcode, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcode = false;

			if (productcode == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_1);
			}
			else if (productcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_3);
			}
			else {
				bindProductcode = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcode) {
					qPos.add(productcode);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_1 =
		"assessmentofProduct.productcode IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_2 =
		"assessmentofProduct.productcode = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_PRODUCTCODE_3 =
		"(assessmentofProduct.productcode IS NULL OR assessmentofProduct.productcode = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_1 =
		"assessmentofProduct.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_2 =
		"assessmentofProduct.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTID_3 =
		"(assessmentofProduct.nextassessmentid IS NULL OR assessmentofProduct.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_1 =
		"assessmentofProduct.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_2 =
		"assessmentofProduct.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofProduct.nextassessmentyear IS NULL OR assessmentofProduct.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAME =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByProductName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAME =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByProductName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTNAME_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAME = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByProductName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductName(
		String productname, String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		return findByNextPeriodByProductName(productname, nextassessmentid,
			nextassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductName(
		String productname, String nextassessmentid, String nextassessmentyear,
		int start, int end) throws SystemException {
		return findByNextPeriodByProductName(productname, nextassessmentid,
			nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductName(
		String productname, String nextassessmentid, String nextassessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAME;
			finderArgs = new Object[] {
					productname, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAME;
			finderArgs = new Object[] {
					productname, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productname,
							assessmentofProduct.getProductname()) ||
						!Validator.equals(nextassessmentid,
							assessmentofProduct.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofProduct.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductname = false;

			if (productname == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_1);
			}
			else if (productname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_3);
			}
			else {
				bindProductname = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductname) {
					qPos.add(productname);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductName_First(
		String productname, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductName_First(productname,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productname=");
		msg.append(productname);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductName_First(
		String productname, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofProduct> list = findByNextPeriodByProductName(productname,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductName_Last(
		String productname, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductName_Last(productname,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productname=");
		msg.append(productname);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductName_Last(
		String productname, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNextPeriodByProductName(productname,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByNextPeriodByProductName(productname,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByNextPeriodByProductName_PrevAndNext(
		long id, String productname, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByNextPeriodByProductName_PrevAndNext(session,
					assessmentofProduct, productname, nextassessmentid,
					nextassessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByNextPeriodByProductName_PrevAndNext(session,
					assessmentofProduct, productname, nextassessmentid,
					nextassessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByNextPeriodByProductName_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productname, String nextassessmentid, String nextassessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductname = false;

		if (productname == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_1);
		}
		else if (productname.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_3);
		}
		else {
			bindProductname = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductname) {
			qPos.add(productname);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByProductName(String productname,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByNextPeriodByProductName(
				productname, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productname the productname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByProductName(String productname,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAME;

		Object[] finderArgs = new Object[] {
				productname, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductname = false;

			if (productname == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_1);
			}
			else if (productname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_3);
			}
			else {
				bindProductname = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductname) {
					qPos.add(productname);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_1 =
		"assessmentofProduct.productname IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_2 =
		"assessmentofProduct.productname = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_PRODUCTNAME_3 =
		"(assessmentofProduct.productname IS NULL OR assessmentofProduct.productname = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_1 =
		"assessmentofProduct.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_2 =
		"assessmentofProduct.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTID_3 =
		"(assessmentofProduct.nextassessmentid IS NULL OR assessmentofProduct.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_1 =
		"assessmentofProduct.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_2 =
		"assessmentofProduct.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAME_NEXTASSESSMENTYEAR_3 =
		"(assessmentofProduct.nextassessmentyear IS NULL OR assessmentofProduct.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByProductCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByProductCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTCODEREFERENCE_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByProductCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductCodeReference(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		return findByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductCodeReference(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductCodeReference(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODEREFERENCE;
			finderArgs = new Object[] {
					productcodereference, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODEREFERENCE;
			finderArgs = new Object[] {
					productcodereference, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productcodereference,
							assessmentofProduct.getProductcodereference()) ||
						!Validator.equals(nextassessmentid,
							assessmentofProduct.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofProduct.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcodereference = false;

			if (productcodereference == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1);
			}
			else if (productcodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3);
			}
			else {
				bindProductcodereference = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcodereference) {
					qPos.add(productcodereference);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductCodeReference_First(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductCodeReference_First(productcodereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcodereference=");
		msg.append(productcodereference);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductCodeReference_First(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofProduct> list = findByNextPeriodByProductCodeReference(productcodereference,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductCodeReference_Last(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductCodeReference_Last(productcodereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcodereference=");
		msg.append(productcodereference);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductCodeReference_Last(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByProductCodeReference(productcodereference,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByNextPeriodByProductCodeReference(productcodereference,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByNextPeriodByProductCodeReference_PrevAndNext(
		long id, String productcodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByNextPeriodByProductCodeReference_PrevAndNext(session,
					assessmentofProduct, productcodereference,
					nextassessmentid, nextassessmentyear, orderByComparator,
					true);

			array[1] = assessmentofProduct;

			array[2] = getByNextPeriodByProductCodeReference_PrevAndNext(session,
					assessmentofProduct, productcodereference,
					nextassessmentid, nextassessmentyear, orderByComparator,
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

	protected AssessmentofProduct getByNextPeriodByProductCodeReference_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productcodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductcodereference = false;

		if (productcodereference == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1);
		}
		else if (productcodereference.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3);
		}
		else {
			bindProductcodereference = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductcodereference) {
			qPos.add(productcodereference);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByProductCodeReference(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByNextPeriodByProductCodeReference(
				productcodereference, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productcodereference the productcodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByProductCodeReference(
		String productcodereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODEREFERENCE;

		Object[] finderArgs = new Object[] {
				productcodereference, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductcodereference = false;

			if (productcodereference == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1);
			}
			else if (productcodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3);
			}
			else {
				bindProductcodereference = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcodereference) {
					qPos.add(productcodereference);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_1 =
		"assessmentofProduct.productcodereference IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_2 =
		"assessmentofProduct.productcodereference = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_PRODUCTCODEREFERENCE_3 =
		"(assessmentofProduct.productcodereference IS NULL OR assessmentofProduct.productcodereference = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_1 =
		"assessmentofProduct.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_2 =
		"assessmentofProduct.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTID_3 =
		"(assessmentofProduct.nextassessmentid IS NULL OR assessmentofProduct.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_1 =
		"assessmentofProduct.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_2 =
		"assessmentofProduct.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTCODEREFERENCE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofProduct.nextassessmentyear IS NULL OR assessmentofProduct.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByProductNameReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByProductNameReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTNAMEREFERENCE_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByProductNameReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductNameReference(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		return findByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductNameReference(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductNameReference(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE;
			finderArgs = new Object[] {
					productnamereference, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE;
			finderArgs = new Object[] {
					productnamereference, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productnamereference,
							assessmentofProduct.getProductnamereference()) ||
						!Validator.equals(nextassessmentid,
							assessmentofProduct.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofProduct.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductnamereference = false;

			if (productnamereference == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1);
			}
			else if (productnamereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3);
			}
			else {
				bindProductnamereference = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductnamereference) {
					qPos.add(productnamereference);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductNameReference_First(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductNameReference_First(productnamereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productnamereference=");
		msg.append(productnamereference);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductNameReference_First(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofProduct> list = findByNextPeriodByProductNameReference(productnamereference,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductNameReference_Last(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductNameReference_Last(productnamereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productnamereference=");
		msg.append(productnamereference);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductNameReference_Last(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByProductNameReference(productnamereference,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByNextPeriodByProductNameReference(productnamereference,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByNextPeriodByProductNameReference_PrevAndNext(
		long id, String productnamereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByNextPeriodByProductNameReference_PrevAndNext(session,
					assessmentofProduct, productnamereference,
					nextassessmentid, nextassessmentyear, orderByComparator,
					true);

			array[1] = assessmentofProduct;

			array[2] = getByNextPeriodByProductNameReference_PrevAndNext(session,
					assessmentofProduct, productnamereference,
					nextassessmentid, nextassessmentyear, orderByComparator,
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

	protected AssessmentofProduct getByNextPeriodByProductNameReference_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productnamereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductnamereference = false;

		if (productnamereference == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1);
		}
		else if (productnamereference.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3);
		}
		else {
			bindProductnamereference = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductnamereference) {
			qPos.add(productnamereference);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByProductNameReference(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByNextPeriodByProductNameReference(
				productnamereference, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productnamereference the productnamereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByProductNameReference(
		String productnamereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE;

		Object[] finderArgs = new Object[] {
				productnamereference, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductnamereference = false;

			if (productnamereference == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1);
			}
			else if (productnamereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3);
			}
			else {
				bindProductnamereference = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductnamereference) {
					qPos.add(productnamereference);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_1 =
		"assessmentofProduct.productnamereference IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_2 =
		"assessmentofProduct.productnamereference = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_PRODUCTNAMEREFERENCE_3 =
		"(assessmentofProduct.productnamereference IS NULL OR assessmentofProduct.productnamereference = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_1 =
		"assessmentofProduct.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_2 =
		"assessmentofProduct.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTID_3 =
		"(assessmentofProduct.nextassessmentid IS NULL OR assessmentofProduct.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_1 =
		"assessmentofProduct.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_2 =
		"assessmentofProduct.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTNAMEREFERENCE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofProduct.nextassessmentyear IS NULL OR assessmentofProduct.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTDESCRIPTION =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByProductDescription",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTDESCRIPTION =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByProductDescription",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofProductModelImpl.PRODUCTDESCRIPTION_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTDESCRIPTION =
		new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByProductDescription",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductDescription(
		String productdescription, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		return findByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductDescription(
		String productdescription, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByNextPeriodByProductDescription(
		String productdescription, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTDESCRIPTION;
			finderArgs = new Object[] {
					productdescription, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTDESCRIPTION;
			finderArgs = new Object[] {
					productdescription, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(productdescription,
							assessmentofProduct.getProductdescription()) ||
						!Validator.equals(nextassessmentid,
							assessmentofProduct.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofProduct.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductdescription = false;

			if (productdescription == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1);
			}
			else if (productdescription.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3);
			}
			else {
				bindProductdescription = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductdescription) {
					qPos.add(productdescription);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductDescription_First(
		String productdescription, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductDescription_First(productdescription,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productdescription=");
		msg.append(productdescription);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductDescription_First(
		String productdescription, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofProduct> list = findByNextPeriodByProductDescription(productdescription,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByNextPeriodByProductDescription_Last(
		String productdescription, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByNextPeriodByProductDescription_Last(productdescription,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productdescription=");
		msg.append(productdescription);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByNextPeriodByProductDescription_Last(
		String productdescription, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByProductDescription(productdescription,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByNextPeriodByProductDescription(productdescription,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByNextPeriodByProductDescription_PrevAndNext(
		long id, String productdescription, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByNextPeriodByProductDescription_PrevAndNext(session,
					assessmentofProduct, productdescription, nextassessmentid,
					nextassessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByNextPeriodByProductDescription_PrevAndNext(session,
					assessmentofProduct, productdescription, nextassessmentid,
					nextassessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByNextPeriodByProductDescription_PrevAndNext(
		Session session, AssessmentofProduct assessmentofProduct,
		String productdescription, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindProductdescription = false;

		if (productdescription == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1);
		}
		else if (productdescription.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3);
		}
		else {
			bindProductdescription = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductdescription) {
			qPos.add(productdescription);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByProductDescription(
		String productdescription, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByNextPeriodByProductDescription(
				productdescription, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param productdescription the productdescription
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByProductDescription(
		String productdescription, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTDESCRIPTION;

		Object[] finderArgs = new Object[] {
				productdescription, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindProductdescription = false;

			if (productdescription == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1);
			}
			else if (productdescription.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3);
			}
			else {
				bindProductdescription = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductdescription) {
					qPos.add(productdescription);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_1 =
		"assessmentofProduct.productdescription IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_2 =
		"assessmentofProduct.productdescription = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_PRODUCTDESCRIPTION_3 =
		"(assessmentofProduct.productdescription IS NULL OR assessmentofProduct.productdescription = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_1 =
		"assessmentofProduct.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_2 =
		"assessmentofProduct.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTID_3 =
		"(assessmentofProduct.nextassessmentid IS NULL OR assessmentofProduct.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_1 =
		"assessmentofProduct.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_2 =
		"assessmentofProduct.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYPRODUCTDESCRIPTION_NEXTASSESSMENTYEAR_3 =
		"(assessmentofProduct.nextassessmentyear IS NULL OR assessmentofProduct.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AI_AY = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAI_AY",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AI_AY = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofProductImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAI_AY",
			new String[] { String.class.getName(), String.class.getName() },
			AssessmentofProductModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofProductModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AI_AY = new FinderPath(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAI_AY",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByAI_AY(String assessmentid,
		String assessmentyear) throws SystemException {
		return findByAI_AY(assessmentid, assessmentyear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByAI_AY(String assessmentid,
		String assessmentyear, int start, int end) throws SystemException {
		return findByAI_AY(assessmentid, assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findByAI_AY(String assessmentid,
		String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AI_AY;
			finderArgs = new Object[] { assessmentid, assessmentyear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AI_AY;
			finderArgs = new Object[] {
					assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofProduct assessmentofProduct : list) {
				if (!Validator.equals(assessmentid,
							assessmentofProduct.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofProduct.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Returns the first assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByAI_AY_First(String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByAI_AY_First(assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the first assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByAI_AY_First(String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofProduct> list = findByAI_AY(assessmentid,
				assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByAI_AY_Last(String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByAI_AY_Last(assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentofProduct != null) {
			return assessmentofProduct;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofProductException(msg.toString());
	}

	/**
	 * Returns the last assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByAI_AY_Last(String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAI_AY(assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofProduct> list = findByAI_AY(assessmentid,
				assessmentyear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof products before and after the current assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof product
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct[] findByAI_AY_PrevAndNext(long id,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct[] array = new AssessmentofProductImpl[3];

			array[0] = getByAI_AY_PrevAndNext(session, assessmentofProduct,
					assessmentid, assessmentyear, orderByComparator, true);

			array[1] = assessmentofProduct;

			array[2] = getByAI_AY_PrevAndNext(session, assessmentofProduct,
					assessmentid, assessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentofProduct getByAI_AY_PrevAndNext(Session session,
		AssessmentofProduct assessmentofProduct, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE);

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofProductModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofProduct);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofProduct> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAI_AY(String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findByAI_AY(
				assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAI_AY(String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AI_AY;

		Object[] finderArgs = new Object[] { assessmentid, assessmentyear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
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

	private static final String _FINDER_COLUMN_AI_AY_ASSESSMENTID_1 = "assessmentofProduct.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_AI_AY_ASSESSMENTID_2 = "assessmentofProduct.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_AI_AY_ASSESSMENTID_3 = "(assessmentofProduct.assessmentid IS NULL OR assessmentofProduct.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_1 = "assessmentofProduct.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_2 = "assessmentofProduct.assessmentyear = ?";
	private static final String _FINDER_COLUMN_AI_AY_ASSESSMENTYEAR_3 = "(assessmentofProduct.assessmentyear IS NULL OR assessmentofProduct.assessmentyear = '')";

	public AssessmentofProductPersistenceImpl() {
		setModelClass(AssessmentofProduct.class);
	}

	/**
	 * Caches the assessmentof product in the entity cache if it is enabled.
	 *
	 * @param assessmentofProduct the assessmentof product
	 */
	@Override
	public void cacheResult(AssessmentofProduct assessmentofProduct) {
		EntityCacheUtil.putResult(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductImpl.class, assessmentofProduct.getPrimaryKey(),
			assessmentofProduct);

		assessmentofProduct.resetOriginalValues();
	}

	/**
	 * Caches the assessmentof products in the entity cache if it is enabled.
	 *
	 * @param assessmentofProducts the assessmentof products
	 */
	@Override
	public void cacheResult(List<AssessmentofProduct> assessmentofProducts) {
		for (AssessmentofProduct assessmentofProduct : assessmentofProducts) {
			if (EntityCacheUtil.getResult(
						AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofProductImpl.class,
						assessmentofProduct.getPrimaryKey()) == null) {
				cacheResult(assessmentofProduct);
			}
			else {
				assessmentofProduct.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessmentof products.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentofProductImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentofProductImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessmentof product.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssessmentofProduct assessmentofProduct) {
		EntityCacheUtil.removeResult(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductImpl.class, assessmentofProduct.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssessmentofProduct> assessmentofProducts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentofProduct assessmentofProduct : assessmentofProducts) {
			EntityCacheUtil.removeResult(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofProductImpl.class,
				assessmentofProduct.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessmentof product with the primary key. Does not add the assessmentof product to the database.
	 *
	 * @param id the primary key for the new assessmentof product
	 * @return the new assessmentof product
	 */
	@Override
	public AssessmentofProduct create(long id) {
		AssessmentofProduct assessmentofProduct = new AssessmentofProductImpl();

		assessmentofProduct.setNew(true);
		assessmentofProduct.setPrimaryKey(id);

		return assessmentofProduct;
	}

	/**
	 * Removes the assessmentof product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessmentof product
	 * @return the assessmentof product that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct remove(long id)
		throws NoSuchAssessmentofProductException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessmentof product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessmentof product
	 * @return the assessmentof product that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct remove(Serializable primaryKey)
		throws NoSuchAssessmentofProductException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentofProduct assessmentofProduct = (AssessmentofProduct)session.get(AssessmentofProductImpl.class,
					primaryKey);

			if (assessmentofProduct == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentofProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentofProduct);
		}
		catch (NoSuchAssessmentofProductException nsee) {
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
	protected AssessmentofProduct removeImpl(
		AssessmentofProduct assessmentofProduct) throws SystemException {
		assessmentofProduct = toUnwrappedModel(assessmentofProduct);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentofProduct)) {
				assessmentofProduct = (AssessmentofProduct)session.get(AssessmentofProductImpl.class,
						assessmentofProduct.getPrimaryKeyObj());
			}

			if (assessmentofProduct != null) {
				session.delete(assessmentofProduct);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentofProduct != null) {
			clearCache(assessmentofProduct);
		}

		return assessmentofProduct;
	}

	@Override
	public AssessmentofProduct updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws SystemException {
		assessmentofProduct = toUnwrappedModel(assessmentofProduct);

		boolean isNew = assessmentofProduct.isNew();

		AssessmentofProductModelImpl assessmentofProductModelImpl = (AssessmentofProductModelImpl)assessmentofProduct;

		Session session = null;

		try {
			session = openSession();

			if (assessmentofProduct.isNew()) {
				session.save(assessmentofProduct);

				assessmentofProduct.setNew(false);
			}
			else {
				session.merge(assessmentofProduct);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssessmentofProductModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductcode(),
						assessmentofProductModelImpl.getOriginalAssessmentid(),
						assessmentofProductModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductcode(),
						assessmentofProductModelImpl.getAssessmentid(),
						assessmentofProductModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductname(),
						assessmentofProductModelImpl.getOriginalAssessmentid(),
						assessmentofProductModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductname(),
						assessmentofProductModelImpl.getAssessmentid(),
						assessmentofProductModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAME,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductcodereference(),
						assessmentofProductModelImpl.getOriginalAssessmentid(),
						assessmentofProductModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODEREFERENCE,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductcodereference(),
						assessmentofProductModelImpl.getAssessmentid(),
						assessmentofProductModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODEREFERENCE,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAMEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductnamereference(),
						assessmentofProductModelImpl.getOriginalAssessmentid(),
						assessmentofProductModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAMEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAMEREFERENCE,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductnamereference(),
						assessmentofProductModelImpl.getAssessmentid(),
						assessmentofProductModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAMEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTNAMEREFERENCE,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTDESCRIPTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductdescription(),
						assessmentofProductModelImpl.getOriginalAssessmentid(),
						assessmentofProductModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTDESCRIPTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTDESCRIPTION,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductdescription(),
						assessmentofProductModelImpl.getAssessmentid(),
						assessmentofProductModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTDESCRIPTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTDESCRIPTION,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductcode(),
						assessmentofProductModelImpl.getOriginalNextassessmentid(),
						assessmentofProductModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODE,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductcode(),
						assessmentofProductModelImpl.getNextassessmentid(),
						assessmentofProductModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODE,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductname(),
						assessmentofProductModelImpl.getOriginalNextassessmentid(),
						assessmentofProductModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAME,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductname(),
						assessmentofProductModelImpl.getNextassessmentid(),
						assessmentofProductModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAME,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductcodereference(),
						assessmentofProductModelImpl.getOriginalNextassessmentid(),
						assessmentofProductModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODEREFERENCE,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductcodereference(),
						assessmentofProductModelImpl.getNextassessmentid(),
						assessmentofProductModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTCODEREFERENCE,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductnamereference(),
						assessmentofProductModelImpl.getOriginalNextassessmentid(),
						assessmentofProductModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductnamereference(),
						assessmentofProductModelImpl.getNextassessmentid(),
						assessmentofProductModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTNAMEREFERENCE,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTDESCRIPTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalProductdescription(),
						assessmentofProductModelImpl.getOriginalNextassessmentid(),
						assessmentofProductModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTDESCRIPTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTDESCRIPTION,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getProductdescription(),
						assessmentofProductModelImpl.getNextassessmentid(),
						assessmentofProductModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYPRODUCTDESCRIPTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYPRODUCTDESCRIPTION,
					args);
			}

			if ((assessmentofProductModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AI_AY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofProductModelImpl.getOriginalAssessmentid(),
						assessmentofProductModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AI_AY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AI_AY,
					args);

				args = new Object[] {
						assessmentofProductModelImpl.getAssessmentid(),
						assessmentofProductModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AI_AY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AI_AY,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofProductImpl.class, assessmentofProduct.getPrimaryKey(),
			assessmentofProduct);

		return assessmentofProduct;
	}

	protected AssessmentofProduct toUnwrappedModel(
		AssessmentofProduct assessmentofProduct) {
		if (assessmentofProduct instanceof AssessmentofProductImpl) {
			return assessmentofProduct;
		}

		AssessmentofProductImpl assessmentofProductImpl = new AssessmentofProductImpl();

		assessmentofProductImpl.setNew(assessmentofProduct.isNew());
		assessmentofProductImpl.setPrimaryKey(assessmentofProduct.getPrimaryKey());

		assessmentofProductImpl.setId(assessmentofProduct.getId());
		assessmentofProductImpl.setProductcode(assessmentofProduct.getProductcode());
		assessmentofProductImpl.setProductname(assessmentofProduct.getProductname());
		assessmentofProductImpl.setProductsequenceno(assessmentofProduct.getProductsequenceno());
		assessmentofProductImpl.setProductdescription(assessmentofProduct.getProductdescription());
		assessmentofProductImpl.setProductcodereference(assessmentofProduct.getProductcodereference());
		assessmentofProductImpl.setProductnamereference(assessmentofProduct.getProductnamereference());
		assessmentofProductImpl.setF1Code(assessmentofProduct.getF1Code());
		assessmentofProductImpl.setF1Name(assessmentofProduct.getF1Name());
		assessmentofProductImpl.setF1Value(assessmentofProduct.getF1Value());
		assessmentofProductImpl.setF1Mark(assessmentofProduct.getF1Mark());
		assessmentofProductImpl.setF2Code(assessmentofProduct.getF2Code());
		assessmentofProductImpl.setF2Name(assessmentofProduct.getF2Name());
		assessmentofProductImpl.setF2Value(assessmentofProduct.getF2Value());
		assessmentofProductImpl.setF2Mark(assessmentofProduct.getF2Mark());
		assessmentofProductImpl.setF3Code(assessmentofProduct.getF3Code());
		assessmentofProductImpl.setF3Name(assessmentofProduct.getF3Name());
		assessmentofProductImpl.setF3Value(assessmentofProduct.getF3Value());
		assessmentofProductImpl.setF3Mark(assessmentofProduct.getF3Mark());
		assessmentofProductImpl.setF4Code(assessmentofProduct.getF4Code());
		assessmentofProductImpl.setF4Name(assessmentofProduct.getF4Name());
		assessmentofProductImpl.setF4Value(assessmentofProduct.getF4Value());
		assessmentofProductImpl.setF4Mark(assessmentofProduct.getF4Mark());
		assessmentofProductImpl.setF5Code(assessmentofProduct.getF5Code());
		assessmentofProductImpl.setF5Name(assessmentofProduct.getF5Name());
		assessmentofProductImpl.setF5Value(assessmentofProduct.getF5Value());
		assessmentofProductImpl.setF5Mark(assessmentofProduct.getF5Mark());
		assessmentofProductImpl.setF6Code(assessmentofProduct.getF6Code());
		assessmentofProductImpl.setF6Name(assessmentofProduct.getF6Name());
		assessmentofProductImpl.setF6Value(assessmentofProduct.getF6Value());
		assessmentofProductImpl.setF6Mark(assessmentofProduct.getF6Mark());
		assessmentofProductImpl.setF7Code(assessmentofProduct.getF7Code());
		assessmentofProductImpl.setF7Name(assessmentofProduct.getF7Name());
		assessmentofProductImpl.setF7Value(assessmentofProduct.getF7Value());
		assessmentofProductImpl.setF7Mark(assessmentofProduct.getF7Mark());
		assessmentofProductImpl.setF8Code(assessmentofProduct.getF8Code());
		assessmentofProductImpl.setF8Name(assessmentofProduct.getF8Name());
		assessmentofProductImpl.setF8Value(assessmentofProduct.getF8Value());
		assessmentofProductImpl.setF8Mark(assessmentofProduct.getF8Mark());
		assessmentofProductImpl.setF9Code(assessmentofProduct.getF9Code());
		assessmentofProductImpl.setF9Name(assessmentofProduct.getF9Name());
		assessmentofProductImpl.setF9Value(assessmentofProduct.getF9Value());
		assessmentofProductImpl.setF9Mark(assessmentofProduct.getF9Mark());
		assessmentofProductImpl.setF10Code(assessmentofProduct.getF10Code());
		assessmentofProductImpl.setF10Name(assessmentofProduct.getF10Name());
		assessmentofProductImpl.setF10Value(assessmentofProduct.getF10Value());
		assessmentofProductImpl.setF10Mark(assessmentofProduct.getF10Mark());
		assessmentofProductImpl.setF11Code(assessmentofProduct.getF11Code());
		assessmentofProductImpl.setF11Name(assessmentofProduct.getF11Name());
		assessmentofProductImpl.setF11Value(assessmentofProduct.getF11Value());
		assessmentofProductImpl.setF11Mark(assessmentofProduct.getF11Mark());
		assessmentofProductImpl.setF12Code(assessmentofProduct.getF12Code());
		assessmentofProductImpl.setF12Name(assessmentofProduct.getF12Name());
		assessmentofProductImpl.setF12Value(assessmentofProduct.getF12Value());
		assessmentofProductImpl.setF12Mark(assessmentofProduct.getF12Mark());
		assessmentofProductImpl.setF13Code(assessmentofProduct.getF13Code());
		assessmentofProductImpl.setF13Name(assessmentofProduct.getF13Name());
		assessmentofProductImpl.setF13Value(assessmentofProduct.getF13Value());
		assessmentofProductImpl.setF13Mark(assessmentofProduct.getF13Mark());
		assessmentofProductImpl.setF14Code(assessmentofProduct.getF14Code());
		assessmentofProductImpl.setF14Name(assessmentofProduct.getF14Name());
		assessmentofProductImpl.setF14Value(assessmentofProduct.getF14Value());
		assessmentofProductImpl.setF14Mark(assessmentofProduct.getF14Mark());
		assessmentofProductImpl.setF15Code(assessmentofProduct.getF15Code());
		assessmentofProductImpl.setF15Name(assessmentofProduct.getF15Name());
		assessmentofProductImpl.setF15Value(assessmentofProduct.getF15Value());
		assessmentofProductImpl.setF15Mark(assessmentofProduct.getF15Mark());
		assessmentofProductImpl.setF16Code(assessmentofProduct.getF16Code());
		assessmentofProductImpl.setF16Name(assessmentofProduct.getF16Name());
		assessmentofProductImpl.setF16Value(assessmentofProduct.getF16Value());
		assessmentofProductImpl.setF16Mark(assessmentofProduct.getF16Mark());
		assessmentofProductImpl.setF17Code(assessmentofProduct.getF17Code());
		assessmentofProductImpl.setF17Name(assessmentofProduct.getF17Name());
		assessmentofProductImpl.setF17Value(assessmentofProduct.getF17Value());
		assessmentofProductImpl.setF17Mark(assessmentofProduct.getF17Mark());
		assessmentofProductImpl.setF18Code(assessmentofProduct.getF18Code());
		assessmentofProductImpl.setF18Name(assessmentofProduct.getF18Name());
		assessmentofProductImpl.setF18Value(assessmentofProduct.getF18Value());
		assessmentofProductImpl.setF18Mark(assessmentofProduct.getF18Mark());
		assessmentofProductImpl.setF19Name(assessmentofProduct.getF19Name());
		assessmentofProductImpl.setF19Code(assessmentofProduct.getF19Code());
		assessmentofProductImpl.setF19Value(assessmentofProduct.getF19Value());
		assessmentofProductImpl.setF19Mark(assessmentofProduct.getF19Mark());
		assessmentofProductImpl.setF20Code(assessmentofProduct.getF20Code());
		assessmentofProductImpl.setF20Name(assessmentofProduct.getF20Name());
		assessmentofProductImpl.setF20Value(assessmentofProduct.getF20Value());
		assessmentofProductImpl.setF20Mark(assessmentofProduct.getF20Mark());
		assessmentofProductImpl.setF21Code(assessmentofProduct.getF21Code());
		assessmentofProductImpl.setF21Name(assessmentofProduct.getF21Name());
		assessmentofProductImpl.setF21Value(assessmentofProduct.getF21Value());
		assessmentofProductImpl.setF21Mark(assessmentofProduct.getF21Mark());
		assessmentofProductImpl.setF22Code(assessmentofProduct.getF22Code());
		assessmentofProductImpl.setF22Name(assessmentofProduct.getF22Name());
		assessmentofProductImpl.setF22Value(assessmentofProduct.getF22Value());
		assessmentofProductImpl.setF22Mark(assessmentofProduct.getF22Mark());
		assessmentofProductImpl.setF23Code(assessmentofProduct.getF23Code());
		assessmentofProductImpl.setF23Name(assessmentofProduct.getF23Name());
		assessmentofProductImpl.setF23Value(assessmentofProduct.getF23Value());
		assessmentofProductImpl.setF23Mark(assessmentofProduct.getF23Mark());
		assessmentofProductImpl.setSumMark(assessmentofProduct.getSumMark());
		assessmentofProductImpl.setMaker(assessmentofProduct.getMaker());
		assessmentofProductImpl.setChecker(assessmentofProduct.getChecker());
		assessmentofProductImpl.setApprover(assessmentofProduct.getApprover());
		assessmentofProductImpl.setMakermodified(assessmentofProduct.getMakermodified());
		assessmentofProductImpl.setCheckermodified(assessmentofProduct.getCheckermodified());
		assessmentofProductImpl.setApprovermodified(assessmentofProduct.getApprovermodified());
		assessmentofProductImpl.setAssessmentid(assessmentofProduct.getAssessmentid());
		assessmentofProductImpl.setAssessmentyear(assessmentofProduct.getAssessmentyear());
		assessmentofProductImpl.setEvaluationperiod(assessmentofProduct.getEvaluationperiod());
		assessmentofProductImpl.setLatestassessment(assessmentofProduct.getLatestassessment());
		assessmentofProductImpl.setSynchdate(assessmentofProduct.getSynchdate());
		assessmentofProductImpl.setNextassessmentid(assessmentofProduct.getNextassessmentid());
		assessmentofProductImpl.setNextassessmentyear(assessmentofProduct.getNextassessmentyear());

		return assessmentofProductImpl;
	}

	/**
	 * Returns the assessmentof product with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof product
	 * @return the assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssessmentofProductException, SystemException {
		AssessmentofProduct assessmentofProduct = fetchByPrimaryKey(primaryKey);

		if (assessmentofProduct == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentofProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentofProduct;
	}

	/**
	 * Returns the assessmentof product with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException} if it could not be found.
	 *
	 * @param id the primary key of the assessmentof product
	 * @return the assessmentof product
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct findByPrimaryKey(long id)
		throws NoSuchAssessmentofProductException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessmentof product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof product
	 * @return the assessmentof product, or <code>null</code> if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssessmentofProduct assessmentofProduct = (AssessmentofProduct)EntityCacheUtil.getResult(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofProductImpl.class, primaryKey);

		if (assessmentofProduct == _nullAssessmentofProduct) {
			return null;
		}

		if (assessmentofProduct == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentofProduct = (AssessmentofProduct)session.get(AssessmentofProductImpl.class,
						primaryKey);

				if (assessmentofProduct != null) {
					cacheResult(assessmentofProduct);
				}
				else {
					EntityCacheUtil.putResult(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofProductImpl.class, primaryKey,
						_nullAssessmentofProduct);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentofProductModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentofProductImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentofProduct;
	}

	/**
	 * Returns the assessmentof product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessmentof product
	 * @return the assessmentof product, or <code>null</code> if a assessmentof product with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofProduct fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessmentof products.
	 *
	 * @return the assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @return the range of assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof products
	 * @param end the upper bound of the range of assessmentof products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessmentof products
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofProduct> findAll(int start, int end,
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

		List<AssessmentofProduct> list = (List<AssessmentofProduct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTOFPRODUCT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTOFPRODUCT;

				if (pagination) {
					sql = sql.concat(AssessmentofProductModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofProduct>(list);
				}
				else {
					list = (List<AssessmentofProduct>)QueryUtil.list(q,
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
	 * Removes all the assessmentof products from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentofProduct assessmentofProduct : findAll()) {
			remove(assessmentofProduct);
		}
	}

	/**
	 * Returns the number of assessmentof products.
	 *
	 * @return the number of assessmentof products
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTOFPRODUCT);

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

	/**
	 * Initializes the assessmentof product persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentofProduct>> listenersList = new ArrayList<ModelListener<AssessmentofProduct>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentofProduct>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentofProductImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTOFPRODUCT = "SELECT assessmentofProduct FROM AssessmentofProduct assessmentofProduct";
	private static final String _SQL_SELECT_ASSESSMENTOFPRODUCT_WHERE = "SELECT assessmentofProduct FROM AssessmentofProduct assessmentofProduct WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTOFPRODUCT = "SELECT COUNT(assessmentofProduct) FROM AssessmentofProduct assessmentofProduct";
	private static final String _SQL_COUNT_ASSESSMENTOFPRODUCT_WHERE = "SELECT COUNT(assessmentofProduct) FROM AssessmentofProduct assessmentofProduct WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentofProduct.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentofProduct exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentofProduct exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentofProductPersistenceImpl.class);
	private static AssessmentofProduct _nullAssessmentofProduct = new AssessmentofProductImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentofProduct> toCacheModel() {
				return _nullAssessmentofProductCacheModel;
			}
		};

	private static CacheModel<AssessmentofProduct> _nullAssessmentofProductCacheModel =
		new CacheModel<AssessmentofProduct>() {
			@Override
			public AssessmentofProduct toEntityModel() {
				return _nullAssessmentofProduct;
			}
		};
}