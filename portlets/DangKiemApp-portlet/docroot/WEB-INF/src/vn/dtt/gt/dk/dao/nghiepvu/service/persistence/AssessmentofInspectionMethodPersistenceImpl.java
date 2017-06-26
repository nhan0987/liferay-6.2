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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessmentof inspection method service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofInspectionMethodPersistence
 * @see AssessmentofInspectionMethodUtil
 * @generated
 */
public class AssessmentofInspectionMethodPersistenceImpl
	extends BasePersistenceImpl<AssessmentofInspectionMethod>
	implements AssessmentofInspectionMethodPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentofInspectionMethodUtil} to access the assessmentof inspection method persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentofInspectionMethodImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectionMethodImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectionMethodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODE =
		new FinderPath(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectionMethodImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProductCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE =
		new FinderPath(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectionMethodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProductCode",
			new String[] { String.class.getName(), String.class.getName() },
			AssessmentofInspectionMethodModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofInspectionMethodModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTCODE = new FinderPath(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProductCode",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof inspection methods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspectionMethod> findByProductCode(
		String assessmentid, String assessmentyear) throws SystemException {
		return findByProductCode(assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof inspection methods
	 * @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	 * @return the range of matching assessmentof inspection methods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspectionMethod> findByProductCode(
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByProductCode(assessmentid, assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof inspection methods
	 * @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof inspection methods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspectionMethod> findByProductCode(
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE;
			finderArgs = new Object[] { assessmentid, assessmentyear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODE;
			finderArgs = new Object[] {
					assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofInspectionMethod> list = (List<AssessmentofInspectionMethod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofInspectionMethod assessmentofInspectionMethod : list) {
				if (!Validator.equals(assessmentid,
							assessmentofInspectionMethod.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofInspectionMethod.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFINSPECTIONMETHOD_WHERE);

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
				query.append(AssessmentofInspectionMethodModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentofInspectionMethod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofInspectionMethod>(list);
				}
				else {
					list = (List<AssessmentofInspectionMethod>)QueryUtil.list(q,
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
	 * Returns the first assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspection method
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a matching assessmentof inspection method could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod findByProductCode_First(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectionMethodException, SystemException {
		AssessmentofInspectionMethod assessmentofInspectionMethod = fetchByProductCode_First(assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentofInspectionMethod != null) {
			return assessmentofInspectionMethod;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectionMethodException(msg.toString());
	}

	/**
	 * Returns the first assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspection method, or <code>null</code> if a matching assessmentof inspection method could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod fetchByProductCode_First(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofInspectionMethod> list = findByProductCode(assessmentid,
				assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspection method
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a matching assessmentof inspection method could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod findByProductCode_Last(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectionMethodException, SystemException {
		AssessmentofInspectionMethod assessmentofInspectionMethod = fetchByProductCode_Last(assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentofInspectionMethod != null) {
			return assessmentofInspectionMethod;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectionMethodException(msg.toString());
	}

	/**
	 * Returns the last assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspection method, or <code>null</code> if a matching assessmentof inspection method could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod fetchByProductCode_Last(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductCode(assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofInspectionMethod> list = findByProductCode(assessmentid,
				assessmentyear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof inspection methods before and after the current assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof inspection method
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof inspection method
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod[] findByProductCode_PrevAndNext(
		long id, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectionMethodException, SystemException {
		AssessmentofInspectionMethod assessmentofInspectionMethod = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofInspectionMethod[] array = new AssessmentofInspectionMethodImpl[3];

			array[0] = getByProductCode_PrevAndNext(session,
					assessmentofInspectionMethod, assessmentid, assessmentyear,
					orderByComparator, true);

			array[1] = assessmentofInspectionMethod;

			array[2] = getByProductCode_PrevAndNext(session,
					assessmentofInspectionMethod, assessmentid, assessmentyear,
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

	protected AssessmentofInspectionMethod getByProductCode_PrevAndNext(
		Session session,
		AssessmentofInspectionMethod assessmentofInspectionMethod,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFINSPECTIONMETHOD_WHERE);

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
			query.append(AssessmentofInspectionMethodModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofInspectionMethod);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofInspectionMethod> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductCode(String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentofInspectionMethod assessmentofInspectionMethod : findByProductCode(
				assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofInspectionMethod);
		}
	}

	/**
	 * Returns the number of assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof inspection methods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductCode(String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTCODE;

		Object[] finderArgs = new Object[] { assessmentid, assessmentyear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSESSMENTOFINSPECTIONMETHOD_WHERE);

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

	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_1 = "assessmentofInspectionMethod.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_2 = "assessmentofInspectionMethod.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTID_3 = "(assessmentofInspectionMethod.assessmentid IS NULL OR assessmentofInspectionMethod.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_1 = "assessmentofInspectionMethod.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_2 = "assessmentofInspectionMethod.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTCODE_ASSESSMENTYEAR_3 = "(assessmentofInspectionMethod.assessmentyear IS NULL OR assessmentofInspectionMethod.assessmentyear = '')";

	public AssessmentofInspectionMethodPersistenceImpl() {
		setModelClass(AssessmentofInspectionMethod.class);
	}

	/**
	 * Caches the assessmentof inspection method in the entity cache if it is enabled.
	 *
	 * @param assessmentofInspectionMethod the assessmentof inspection method
	 */
	@Override
	public void cacheResult(
		AssessmentofInspectionMethod assessmentofInspectionMethod) {
		EntityCacheUtil.putResult(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodImpl.class,
			assessmentofInspectionMethod.getPrimaryKey(),
			assessmentofInspectionMethod);

		assessmentofInspectionMethod.resetOriginalValues();
	}

	/**
	 * Caches the assessmentof inspection methods in the entity cache if it is enabled.
	 *
	 * @param assessmentofInspectionMethods the assessmentof inspection methods
	 */
	@Override
	public void cacheResult(
		List<AssessmentofInspectionMethod> assessmentofInspectionMethods) {
		for (AssessmentofInspectionMethod assessmentofInspectionMethod : assessmentofInspectionMethods) {
			if (EntityCacheUtil.getResult(
						AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofInspectionMethodImpl.class,
						assessmentofInspectionMethod.getPrimaryKey()) == null) {
				cacheResult(assessmentofInspectionMethod);
			}
			else {
				assessmentofInspectionMethod.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessmentof inspection methods.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentofInspectionMethodImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentofInspectionMethodImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessmentof inspection method.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AssessmentofInspectionMethod assessmentofInspectionMethod) {
		EntityCacheUtil.removeResult(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodImpl.class,
			assessmentofInspectionMethod.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AssessmentofInspectionMethod> assessmentofInspectionMethods) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentofInspectionMethod assessmentofInspectionMethod : assessmentofInspectionMethods) {
			EntityCacheUtil.removeResult(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofInspectionMethodImpl.class,
				assessmentofInspectionMethod.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessmentof inspection method with the primary key. Does not add the assessmentof inspection method to the database.
	 *
	 * @param id the primary key for the new assessmentof inspection method
	 * @return the new assessmentof inspection method
	 */
	@Override
	public AssessmentofInspectionMethod create(long id) {
		AssessmentofInspectionMethod assessmentofInspectionMethod = new AssessmentofInspectionMethodImpl();

		assessmentofInspectionMethod.setNew(true);
		assessmentofInspectionMethod.setPrimaryKey(id);

		return assessmentofInspectionMethod;
	}

	/**
	 * Removes the assessmentof inspection method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessmentof inspection method
	 * @return the assessmentof inspection method that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod remove(long id)
		throws NoSuchAssessmentofInspectionMethodException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessmentof inspection method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessmentof inspection method
	 * @return the assessmentof inspection method that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod remove(Serializable primaryKey)
		throws NoSuchAssessmentofInspectionMethodException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentofInspectionMethod assessmentofInspectionMethod = (AssessmentofInspectionMethod)session.get(AssessmentofInspectionMethodImpl.class,
					primaryKey);

			if (assessmentofInspectionMethod == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentofInspectionMethodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentofInspectionMethod);
		}
		catch (NoSuchAssessmentofInspectionMethodException nsee) {
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
	protected AssessmentofInspectionMethod removeImpl(
		AssessmentofInspectionMethod assessmentofInspectionMethod)
		throws SystemException {
		assessmentofInspectionMethod = toUnwrappedModel(assessmentofInspectionMethod);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentofInspectionMethod)) {
				assessmentofInspectionMethod = (AssessmentofInspectionMethod)session.get(AssessmentofInspectionMethodImpl.class,
						assessmentofInspectionMethod.getPrimaryKeyObj());
			}

			if (assessmentofInspectionMethod != null) {
				session.delete(assessmentofInspectionMethod);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentofInspectionMethod != null) {
			clearCache(assessmentofInspectionMethod);
		}

		return assessmentofInspectionMethod;
	}

	@Override
	public AssessmentofInspectionMethod updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod assessmentofInspectionMethod)
		throws SystemException {
		assessmentofInspectionMethod = toUnwrappedModel(assessmentofInspectionMethod);

		boolean isNew = assessmentofInspectionMethod.isNew();

		AssessmentofInspectionMethodModelImpl assessmentofInspectionMethodModelImpl =
			(AssessmentofInspectionMethodModelImpl)assessmentofInspectionMethod;

		Session session = null;

		try {
			session = openSession();

			if (assessmentofInspectionMethod.isNew()) {
				session.save(assessmentofInspectionMethod);

				assessmentofInspectionMethod.setNew(false);
			}
			else {
				session.merge(assessmentofInspectionMethod);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!AssessmentofInspectionMethodModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentofInspectionMethodModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofInspectionMethodModelImpl.getOriginalAssessmentid(),
						assessmentofInspectionMethodModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE,
					args);

				args = new Object[] {
						assessmentofInspectionMethodModelImpl.getAssessmentid(),
						assessmentofInspectionMethodModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectionMethodImpl.class,
			assessmentofInspectionMethod.getPrimaryKey(),
			assessmentofInspectionMethod);

		return assessmentofInspectionMethod;
	}

	protected AssessmentofInspectionMethod toUnwrappedModel(
		AssessmentofInspectionMethod assessmentofInspectionMethod) {
		if (assessmentofInspectionMethod instanceof AssessmentofInspectionMethodImpl) {
			return assessmentofInspectionMethod;
		}

		AssessmentofInspectionMethodImpl assessmentofInspectionMethodImpl = new AssessmentofInspectionMethodImpl();

		assessmentofInspectionMethodImpl.setNew(assessmentofInspectionMethod.isNew());
		assessmentofInspectionMethodImpl.setPrimaryKey(assessmentofInspectionMethod.getPrimaryKey());

		assessmentofInspectionMethodImpl.setId(assessmentofInspectionMethod.getId());
		assessmentofInspectionMethodImpl.setMethodcode(assessmentofInspectionMethod.getMethodcode());
		assessmentofInspectionMethodImpl.setMethodname(assessmentofInspectionMethod.getMethodname());
		assessmentofInspectionMethodImpl.setMethodsequenceno(assessmentofInspectionMethod.getMethodsequenceno());
		assessmentofInspectionMethodImpl.setMethoddescription(assessmentofInspectionMethod.getMethoddescription());
		assessmentofInspectionMethodImpl.setMethodcodereference(assessmentofInspectionMethod.getMethodcodereference());
		assessmentofInspectionMethodImpl.setMethodnamereference(assessmentofInspectionMethod.getMethodnamereference());
		assessmentofInspectionMethodImpl.setImporterRiskDescription(assessmentofInspectionMethod.getImporterRiskDescription());
		assessmentofInspectionMethodImpl.setA1MarkFloor(assessmentofInspectionMethod.getA1MarkFloor());
		assessmentofInspectionMethodImpl.setA1MarkCeil(assessmentofInspectionMethod.getA1MarkCeil());
		assessmentofInspectionMethodImpl.setProductRiskDescription(assessmentofInspectionMethod.getProductRiskDescription());
		assessmentofInspectionMethodImpl.setA301MarkFloor(assessmentofInspectionMethod.getA301MarkFloor());
		assessmentofInspectionMethodImpl.setA301MarkCeil(assessmentofInspectionMethod.getA301MarkCeil());
		assessmentofInspectionMethodImpl.setPurposeRiskDescription(assessmentofInspectionMethod.getPurposeRiskDescription());
		assessmentofInspectionMethodImpl.setA302Mark(assessmentofInspectionMethod.getA302Mark());
		assessmentofInspectionMethodImpl.setCertifiedRiskDescription(assessmentofInspectionMethod.getCertifiedRiskDescription());
		assessmentofInspectionMethodImpl.setA304Mark(assessmentofInspectionMethod.getA304Mark());
		assessmentofInspectionMethodImpl.setUsageRiskDescription(assessmentofInspectionMethod.getUsageRiskDescription());
		assessmentofInspectionMethodImpl.setA303Mark(assessmentofInspectionMethod.getA303Mark());
		assessmentofInspectionMethodImpl.setTransportRiskDescription(assessmentofInspectionMethod.getTransportRiskDescription());
		assessmentofInspectionMethodImpl.setA305Mark(assessmentofInspectionMethod.getA305Mark());
		assessmentofInspectionMethodImpl.setMaker(assessmentofInspectionMethod.getMaker());
		assessmentofInspectionMethodImpl.setChecker(assessmentofInspectionMethod.getChecker());
		assessmentofInspectionMethodImpl.setApprover(assessmentofInspectionMethod.getApprover());
		assessmentofInspectionMethodImpl.setMakermodified(assessmentofInspectionMethod.getMakermodified());
		assessmentofInspectionMethodImpl.setCheckermodified(assessmentofInspectionMethod.getCheckermodified());
		assessmentofInspectionMethodImpl.setApprovermodified(assessmentofInspectionMethod.getApprovermodified());
		assessmentofInspectionMethodImpl.setAssessmentid(assessmentofInspectionMethod.getAssessmentid());
		assessmentofInspectionMethodImpl.setAssessmentyear(assessmentofInspectionMethod.getAssessmentyear());
		assessmentofInspectionMethodImpl.setEvaluationperiod(assessmentofInspectionMethod.getEvaluationperiod());
		assessmentofInspectionMethodImpl.setLatestassessment(assessmentofInspectionMethod.getLatestassessment());
		assessmentofInspectionMethodImpl.setSynchdate(assessmentofInspectionMethod.getSynchdate());
		assessmentofInspectionMethodImpl.setNextassessmentid(assessmentofInspectionMethod.getNextassessmentid());
		assessmentofInspectionMethodImpl.setNextassessmentyear(assessmentofInspectionMethod.getNextassessmentyear());

		return assessmentofInspectionMethodImpl;
	}

	/**
	 * Returns the assessmentof inspection method with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof inspection method
	 * @return the assessmentof inspection method
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchAssessmentofInspectionMethodException, SystemException {
		AssessmentofInspectionMethod assessmentofInspectionMethod = fetchByPrimaryKey(primaryKey);

		if (assessmentofInspectionMethod == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentofInspectionMethodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentofInspectionMethod;
	}

	/**
	 * Returns the assessmentof inspection method with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException} if it could not be found.
	 *
	 * @param id the primary key of the assessmentof inspection method
	 * @return the assessmentof inspection method
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod findByPrimaryKey(long id)
		throws NoSuchAssessmentofInspectionMethodException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessmentof inspection method with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof inspection method
	 * @return the assessmentof inspection method, or <code>null</code> if a assessmentof inspection method with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		AssessmentofInspectionMethod assessmentofInspectionMethod = (AssessmentofInspectionMethod)EntityCacheUtil.getResult(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofInspectionMethodImpl.class, primaryKey);

		if (assessmentofInspectionMethod == _nullAssessmentofInspectionMethod) {
			return null;
		}

		if (assessmentofInspectionMethod == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentofInspectionMethod = (AssessmentofInspectionMethod)session.get(AssessmentofInspectionMethodImpl.class,
						primaryKey);

				if (assessmentofInspectionMethod != null) {
					cacheResult(assessmentofInspectionMethod);
				}
				else {
					EntityCacheUtil.putResult(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofInspectionMethodImpl.class, primaryKey,
						_nullAssessmentofInspectionMethod);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentofInspectionMethodModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentofInspectionMethodImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentofInspectionMethod;
	}

	/**
	 * Returns the assessmentof inspection method with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessmentof inspection method
	 * @return the assessmentof inspection method, or <code>null</code> if a assessmentof inspection method with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspectionMethod fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessmentof inspection methods.
	 *
	 * @return the assessmentof inspection methods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspectionMethod> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof inspection methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof inspection methods
	 * @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	 * @return the range of assessmentof inspection methods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspectionMethod> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof inspection methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof inspection methods
	 * @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessmentof inspection methods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspectionMethod> findAll(int start, int end,
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

		List<AssessmentofInspectionMethod> list = (List<AssessmentofInspectionMethod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTOFINSPECTIONMETHOD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTOFINSPECTIONMETHOD;

				if (pagination) {
					sql = sql.concat(AssessmentofInspectionMethodModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentofInspectionMethod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofInspectionMethod>(list);
				}
				else {
					list = (List<AssessmentofInspectionMethod>)QueryUtil.list(q,
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
	 * Removes all the assessmentof inspection methods from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentofInspectionMethod assessmentofInspectionMethod : findAll()) {
			remove(assessmentofInspectionMethod);
		}
	}

	/**
	 * Returns the number of assessmentof inspection methods.
	 *
	 * @return the number of assessmentof inspection methods
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTOFINSPECTIONMETHOD);

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
	 * Initializes the assessmentof inspection method persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentofInspectionMethod>> listenersList = new ArrayList<ModelListener<AssessmentofInspectionMethod>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentofInspectionMethod>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentofInspectionMethodImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTOFINSPECTIONMETHOD = "SELECT assessmentofInspectionMethod FROM AssessmentofInspectionMethod assessmentofInspectionMethod";
	private static final String _SQL_SELECT_ASSESSMENTOFINSPECTIONMETHOD_WHERE = "SELECT assessmentofInspectionMethod FROM AssessmentofInspectionMethod assessmentofInspectionMethod WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTOFINSPECTIONMETHOD = "SELECT COUNT(assessmentofInspectionMethod) FROM AssessmentofInspectionMethod assessmentofInspectionMethod";
	private static final String _SQL_COUNT_ASSESSMENTOFINSPECTIONMETHOD_WHERE = "SELECT COUNT(assessmentofInspectionMethod) FROM AssessmentofInspectionMethod assessmentofInspectionMethod WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentofInspectionMethod.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentofInspectionMethod exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentofInspectionMethod exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentofInspectionMethodPersistenceImpl.class);
	private static AssessmentofInspectionMethod _nullAssessmentofInspectionMethod =
		new AssessmentofInspectionMethodImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentofInspectionMethod> toCacheModel() {
				return _nullAssessmentofInspectionMethodCacheModel;
			}
		};

	private static CacheModel<AssessmentofInspectionMethod> _nullAssessmentofInspectionMethodCacheModel =
		new CacheModel<AssessmentofInspectionMethod>() {
			@Override
			public AssessmentofInspectionMethod toEntityModel() {
				return _nullAssessmentofInspectionMethod;
			}
		};
}