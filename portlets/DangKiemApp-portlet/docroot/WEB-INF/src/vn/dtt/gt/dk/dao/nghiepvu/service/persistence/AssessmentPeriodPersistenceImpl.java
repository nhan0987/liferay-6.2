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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessment period service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentPeriodPersistence
 * @see AssessmentPeriodUtil
 * @generated
 */
public class AssessmentPeriodPersistenceImpl extends BasePersistenceImpl<AssessmentPeriod>
	implements AssessmentPeriodPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentPeriodUtil} to access the assessment period persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentPeriodImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAssessmentidAndAssessmentyear",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAssessmentidAndAssessmentyear",
			new String[] { String.class.getName(), String.class.getName() },
			AssessmentPeriodModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssessmentidAndAssessmentyear",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		String assessmentid, String assessmentyear) throws SystemException {
		return findByAssessmentidAndAssessmentyear(assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @return the range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByAssessmentidAndAssessmentyear(assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR;
			finderArgs = new Object[] { assessmentid, assessmentyear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR;
			finderArgs = new Object[] {
					assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentPeriod> list = (List<AssessmentPeriod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentPeriod assessmentPeriod : list) {
				if (!Validator.equals(assessmentid,
							assessmentPeriod.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentPeriod.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentPeriod>(list);
				}
				else {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
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
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyear_First(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyear_First(assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyear_First(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyear(assessmentid,
				assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyear_Last(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyear_Last(assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyear_Last(
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssessmentidAndAssessmentyear(assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyear(assessmentid,
				assessmentyear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment period
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod[] findByAssessmentidAndAssessmentyear_PrevAndNext(
		long id, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentPeriod[] array = new AssessmentPeriodImpl[3];

			array[0] = getByAssessmentidAndAssessmentyear_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
					orderByComparator, true);

			array[1] = assessmentPeriod;

			array[2] = getByAssessmentidAndAssessmentyear_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
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

	protected AssessmentPeriod getByAssessmentidAndAssessmentyear_PrevAndNext(
		Session session, AssessmentPeriod assessmentPeriod,
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

		query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_2);
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
			query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentPeriod);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentPeriod> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssessmentidAndAssessmentyear(String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentPeriod assessmentPeriod : findByAssessmentidAndAssessmentyear(
				assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentPeriod);
		}
	}

	/**
	 * Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssessmentidAndAssessmentyear(String assessmentid,
		String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR;

		Object[] finderArgs = new Object[] { assessmentid, assessmentyear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_2);
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

	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_1 =
		"assessmentPeriod.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_2 =
		"assessmentPeriod.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_3 =
		"(assessmentPeriod.assessmentid IS NULL OR assessmentPeriod.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_1 =
		"assessmentPeriod.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_2 =
		"assessmentPeriod.assessmentyear = ?";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_3 =
		"(assessmentPeriod.assessmentyear IS NULL OR assessmentPeriod.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithimporterchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithimporterchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			AssessmentPeriodModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.IMPORTERCHECKED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssessmentidAndAssessmentyearWithimporterchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @return the matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		String assessmentid, String assessmentyear, int importerchecked)
		throws SystemException {
		return findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @return the range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		String assessmentid, String assessmentyear, int importerchecked,
		int start, int end) throws SystemException {
		return findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		String assessmentid, String assessmentyear, int importerchecked,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED;
			finderArgs = new Object[] {
					assessmentid, assessmentyear, importerchecked
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED;
			finderArgs = new Object[] {
					assessmentid, assessmentyear, importerchecked,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentPeriod> list = (List<AssessmentPeriod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentPeriod assessmentPeriod : list) {
				if (!Validator.equals(assessmentid,
							assessmentPeriod.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentPeriod.getAssessmentyear()) ||
						(importerchecked != assessmentPeriod.getImporterchecked())) {
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

			query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_2);
			}

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_IMPORTERCHECKED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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

				qPos.add(importerchecked);

				if (!pagination) {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentPeriod>(list);
				}
				else {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
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
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyearWithimporterchecked_First(
		String assessmentid, String assessmentyear, int importerchecked,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyearWithimporterchecked_First(assessmentid,
				assessmentyear, importerchecked, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", importerchecked=");
		msg.append(importerchecked);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithimporterchecked_First(
		String assessmentid, String assessmentyear, int importerchecked,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
				assessmentyear, importerchecked, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyearWithimporterchecked_Last(
		String assessmentid, String assessmentyear, int importerchecked,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyearWithimporterchecked_Last(assessmentid,
				assessmentyear, importerchecked, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", importerchecked=");
		msg.append(importerchecked);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithimporterchecked_Last(
		String assessmentid, String assessmentyear, int importerchecked,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
				assessmentyear, importerchecked);

		if (count == 0) {
			return null;
		}

		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
				assessmentyear, importerchecked, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * @param id the primary key of the current assessment period
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithimporterchecked_PrevAndNext(
		long id, String assessmentid, String assessmentyear,
		int importerchecked, OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentPeriod[] array = new AssessmentPeriodImpl[3];

			array[0] = getByAssessmentidAndAssessmentyearWithimporterchecked_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
					importerchecked, orderByComparator, true);

			array[1] = assessmentPeriod;

			array[2] = getByAssessmentidAndAssessmentyearWithimporterchecked_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
					importerchecked, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentPeriod getByAssessmentidAndAssessmentyearWithimporterchecked_PrevAndNext(
		Session session, AssessmentPeriod assessmentPeriod,
		String assessmentid, String assessmentyear, int importerchecked,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_2);
		}

		query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_IMPORTERCHECKED_2);

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
			query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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

		qPos.add(importerchecked);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentPeriod);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentPeriod> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssessmentidAndAssessmentyearWithimporterchecked(
		String assessmentid, String assessmentyear, int importerchecked)
		throws SystemException {
		for (AssessmentPeriod assessmentPeriod : findByAssessmentidAndAssessmentyearWithimporterchecked(
				assessmentid, assessmentyear, importerchecked,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentPeriod);
		}
	}

	/**
	 * Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param importerchecked the importerchecked
	 * @return the number of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssessmentidAndAssessmentyearWithimporterchecked(
		String assessmentid, String assessmentyear, int importerchecked)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED;

		Object[] finderArgs = new Object[] {
				assessmentid, assessmentyear, importerchecked
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_2);
			}

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_IMPORTERCHECKED_2);

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

				qPos.add(importerchecked);

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

	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_1 =
		"assessmentPeriod.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_2 =
		"assessmentPeriod.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTID_3 =
		"(assessmentPeriod.assessmentid IS NULL OR assessmentPeriod.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_1 =
		"assessmentPeriod.assessmentyear IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_2 =
		"assessmentPeriod.assessmentyear = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_ASSESSMENTYEAR_3 =
		"(assessmentPeriod.assessmentyear IS NULL OR assessmentPeriod.assessmentyear = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED_IMPORTERCHECKED_2 =
		"assessmentPeriod.importerchecked = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithinspectorchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithinspectorchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			AssessmentPeriodModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.INSPECTORCHECKED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssessmentidAndAssessmentyearWithinspectorchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @return the matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		String assessmentid, String assessmentyear, int inspectorchecked)
		throws SystemException {
		return findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @return the range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		String assessmentid, String assessmentyear, int inspectorchecked,
		int start, int end) throws SystemException {
		return findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		String assessmentid, String assessmentyear, int inspectorchecked,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED;
			finderArgs = new Object[] {
					assessmentid, assessmentyear, inspectorchecked
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED;
			finderArgs = new Object[] {
					assessmentid, assessmentyear, inspectorchecked,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentPeriod> list = (List<AssessmentPeriod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentPeriod assessmentPeriod : list) {
				if (!Validator.equals(assessmentid,
							assessmentPeriod.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentPeriod.getAssessmentyear()) ||
						(inspectorchecked != assessmentPeriod.getInspectorchecked())) {
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

			query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_2);
			}

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_INSPECTORCHECKED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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

				qPos.add(inspectorchecked);

				if (!pagination) {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentPeriod>(list);
				}
				else {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
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
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyearWithinspectorchecked_First(
		String assessmentid, String assessmentyear, int inspectorchecked,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyearWithinspectorchecked_First(assessmentid,
				assessmentyear, inspectorchecked, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", inspectorchecked=");
		msg.append(inspectorchecked);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithinspectorchecked_First(
		String assessmentid, String assessmentyear, int inspectorchecked,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
				assessmentyear, inspectorchecked, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyearWithinspectorchecked_Last(
		String assessmentid, String assessmentyear, int inspectorchecked,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyearWithinspectorchecked_Last(assessmentid,
				assessmentyear, inspectorchecked, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", inspectorchecked=");
		msg.append(inspectorchecked);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithinspectorchecked_Last(
		String assessmentid, String assessmentyear, int inspectorchecked,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
				assessmentyear, inspectorchecked);

		if (count == 0) {
			return null;
		}

		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
				assessmentyear, inspectorchecked, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * @param id the primary key of the current assessment period
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithinspectorchecked_PrevAndNext(
		long id, String assessmentid, String assessmentyear,
		int inspectorchecked, OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentPeriod[] array = new AssessmentPeriodImpl[3];

			array[0] = getByAssessmentidAndAssessmentyearWithinspectorchecked_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
					inspectorchecked, orderByComparator, true);

			array[1] = assessmentPeriod;

			array[2] = getByAssessmentidAndAssessmentyearWithinspectorchecked_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
					inspectorchecked, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentPeriod getByAssessmentidAndAssessmentyearWithinspectorchecked_PrevAndNext(
		Session session, AssessmentPeriod assessmentPeriod,
		String assessmentid, String assessmentyear, int inspectorchecked,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_2);
		}

		query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_INSPECTORCHECKED_2);

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
			query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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

		qPos.add(inspectorchecked);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentPeriod);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentPeriod> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssessmentidAndAssessmentyearWithinspectorchecked(
		String assessmentid, String assessmentyear, int inspectorchecked)
		throws SystemException {
		for (AssessmentPeriod assessmentPeriod : findByAssessmentidAndAssessmentyearWithinspectorchecked(
				assessmentid, assessmentyear, inspectorchecked,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentPeriod);
		}
	}

	/**
	 * Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param inspectorchecked the inspectorchecked
	 * @return the number of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssessmentidAndAssessmentyearWithinspectorchecked(
		String assessmentid, String assessmentyear, int inspectorchecked)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED;

		Object[] finderArgs = new Object[] {
				assessmentid, assessmentyear, inspectorchecked
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_2);
			}

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_INSPECTORCHECKED_2);

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

				qPos.add(inspectorchecked);

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

	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_1 =
		"assessmentPeriod.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_2 =
		"assessmentPeriod.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTID_3 =
		"(assessmentPeriod.assessmentid IS NULL OR assessmentPeriod.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_1 =
		"assessmentPeriod.assessmentyear IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_2 =
		"assessmentPeriod.assessmentyear = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_ASSESSMENTYEAR_3 =
		"(assessmentPeriod.assessmentyear IS NULL OR assessmentPeriod.assessmentyear = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED_INSPECTORCHECKED_2 =
		"assessmentPeriod.inspectorchecked = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithproductionchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithproductionchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			AssessmentPeriodModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.PRODUCTIONCHECKED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssessmentidAndAssessmentyearWithproductionchecked",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @return the matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		String assessmentid, String assessmentyear, int productionchecked)
		throws SystemException {
		return findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @return the range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		String assessmentid, String assessmentyear, int productionchecked,
		int start, int end) throws SystemException {
		return findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		String assessmentid, String assessmentyear, int productionchecked,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED;
			finderArgs = new Object[] {
					assessmentid, assessmentyear, productionchecked
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED;
			finderArgs = new Object[] {
					assessmentid, assessmentyear, productionchecked,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentPeriod> list = (List<AssessmentPeriod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentPeriod assessmentPeriod : list) {
				if (!Validator.equals(assessmentid,
							assessmentPeriod.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentPeriod.getAssessmentyear()) ||
						(productionchecked != assessmentPeriod.getProductionchecked())) {
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

			query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_2);
			}

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_PRODUCTIONCHECKED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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

				qPos.add(productionchecked);

				if (!pagination) {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentPeriod>(list);
				}
				else {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
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
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyearWithproductionchecked_First(
		String assessmentid, String assessmentyear, int productionchecked,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyearWithproductionchecked_First(assessmentid,
				assessmentyear, productionchecked, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", productionchecked=");
		msg.append(productionchecked);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithproductionchecked_First(
		String assessmentid, String assessmentyear, int productionchecked,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
				assessmentyear, productionchecked, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByAssessmentidAndAssessmentyearWithproductionchecked_Last(
		String assessmentid, String assessmentyear, int productionchecked,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByAssessmentidAndAssessmentyearWithproductionchecked_Last(assessmentid,
				assessmentyear, productionchecked, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", productionchecked=");
		msg.append(productionchecked);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithproductionchecked_Last(
		String assessmentid, String assessmentyear, int productionchecked,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
				assessmentyear, productionchecked);

		if (count == 0) {
			return null;
		}

		List<AssessmentPeriod> list = findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
				assessmentyear, productionchecked, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * @param id the primary key of the current assessment period
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithproductionchecked_PrevAndNext(
		long id, String assessmentid, String assessmentyear,
		int productionchecked, OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentPeriod[] array = new AssessmentPeriodImpl[3];

			array[0] = getByAssessmentidAndAssessmentyearWithproductionchecked_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
					productionchecked, orderByComparator, true);

			array[1] = assessmentPeriod;

			array[2] = getByAssessmentidAndAssessmentyearWithproductionchecked_PrevAndNext(session,
					assessmentPeriod, assessmentid, assessmentyear,
					productionchecked, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentPeriod getByAssessmentidAndAssessmentyearWithproductionchecked_PrevAndNext(
		Session session, AssessmentPeriod assessmentPeriod,
		String assessmentid, String assessmentyear, int productionchecked,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_2);
		}

		query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_PRODUCTIONCHECKED_2);

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
			query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
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

		qPos.add(productionchecked);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentPeriod);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentPeriod> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63; from the database.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssessmentidAndAssessmentyearWithproductionchecked(
		String assessmentid, String assessmentyear, int productionchecked)
		throws SystemException {
		for (AssessmentPeriod assessmentPeriod : findByAssessmentidAndAssessmentyearWithproductionchecked(
				assessmentid, assessmentyear, productionchecked,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentPeriod);
		}
	}

	/**
	 * Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	 *
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param productionchecked the productionchecked
	 * @return the number of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssessmentidAndAssessmentyearWithproductionchecked(
		String assessmentid, String assessmentyear, int productionchecked)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED;

		Object[] finderArgs = new Object[] {
				assessmentid, assessmentyear, productionchecked
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTPERIOD_WHERE);

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_2);
			}

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_PRODUCTIONCHECKED_2);

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

				qPos.add(productionchecked);

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

	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_1 =
		"assessmentPeriod.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_2 =
		"assessmentPeriod.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTID_3 =
		"(assessmentPeriod.assessmentid IS NULL OR assessmentPeriod.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_1 =
		"assessmentPeriod.assessmentyear IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_2 =
		"assessmentPeriod.assessmentyear = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_ASSESSMENTYEAR_3 =
		"(assessmentPeriod.assessmentyear IS NULL OR assessmentPeriod.assessmentyear = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED_PRODUCTIONCHECKED_2 =
		"assessmentPeriod.productionchecked = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPreviousAssessmentidAndAssessmentyear",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED,
			AssessmentPeriodImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPreviousAssessmentidAndAssessmentyear",
			new String[] { String.class.getName(), String.class.getName() },
			AssessmentPeriodModelImpl.PREVIOUSASSESSMENTID_COLUMN_BITMASK |
			AssessmentPeriodModelImpl.PREVIOUSASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPreviousAssessmentidAndAssessmentyear",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @return the matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		String previousassessmentid, String previousassessmentyear)
		throws SystemException {
		return findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @return the range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		String previousassessmentid, String previousassessmentyear, int start,
		int end) throws SystemException {
		return findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		String previousassessmentid, String previousassessmentyear, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR;
			finderArgs = new Object[] {
					previousassessmentid, previousassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR;
			finderArgs = new Object[] {
					previousassessmentid, previousassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentPeriod> list = (List<AssessmentPeriod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentPeriod assessmentPeriod : list) {
				if (!Validator.equals(previousassessmentid,
							assessmentPeriod.getPreviousassessmentid()) ||
						!Validator.equals(previousassessmentyear,
							assessmentPeriod.getPreviousassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

			boolean bindPreviousassessmentid = false;

			if (previousassessmentid == null) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_1);
			}
			else if (previousassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_3);
			}
			else {
				bindPreviousassessmentid = true;

				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_2);
			}

			boolean bindPreviousassessmentyear = false;

			if (previousassessmentyear == null) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_1);
			}
			else if (previousassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_3);
			}
			else {
				bindPreviousassessmentyear = true;

				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPreviousassessmentid) {
					qPos.add(previousassessmentid);
				}

				if (bindPreviousassessmentyear) {
					qPos.add(previousassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentPeriod>(list);
				}
				else {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
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
	 * Returns the first assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByPreviousAssessmentidAndAssessmentyear_First(
		String previousassessmentid, String previousassessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByPreviousAssessmentidAndAssessmentyear_First(previousassessmentid,
				previousassessmentyear, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("previousassessmentid=");
		msg.append(previousassessmentid);

		msg.append(", previousassessmentyear=");
		msg.append(previousassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the first assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByPreviousAssessmentidAndAssessmentyear_First(
		String previousassessmentid, String previousassessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentPeriod> list = findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
				previousassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByPreviousAssessmentidAndAssessmentyear_Last(
		String previousassessmentid, String previousassessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByPreviousAssessmentidAndAssessmentyear_Last(previousassessmentid,
				previousassessmentyear, orderByComparator);

		if (assessmentPeriod != null) {
			return assessmentPeriod;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("previousassessmentid=");
		msg.append(previousassessmentid);

		msg.append(", previousassessmentyear=");
		msg.append(previousassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentPeriodException(msg.toString());
	}

	/**
	 * Returns the last assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByPreviousAssessmentidAndAssessmentyear_Last(
		String previousassessmentid, String previousassessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
				previousassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentPeriod> list = findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
				previousassessmentyear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment periods before and after the current assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment period
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod[] findByPreviousAssessmentidAndAssessmentyear_PrevAndNext(
		long id, String previousassessmentid, String previousassessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentPeriod[] array = new AssessmentPeriodImpl[3];

			array[0] = getByPreviousAssessmentidAndAssessmentyear_PrevAndNext(session,
					assessmentPeriod, previousassessmentid,
					previousassessmentyear, orderByComparator, true);

			array[1] = assessmentPeriod;

			array[2] = getByPreviousAssessmentidAndAssessmentyear_PrevAndNext(session,
					assessmentPeriod, previousassessmentid,
					previousassessmentyear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssessmentPeriod getByPreviousAssessmentidAndAssessmentyear_PrevAndNext(
		Session session, AssessmentPeriod assessmentPeriod,
		String previousassessmentid, String previousassessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTPERIOD_WHERE);

		boolean bindPreviousassessmentid = false;

		if (previousassessmentid == null) {
			query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_1);
		}
		else if (previousassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_3);
		}
		else {
			bindPreviousassessmentid = true;

			query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_2);
		}

		boolean bindPreviousassessmentyear = false;

		if (previousassessmentyear == null) {
			query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_1);
		}
		else if (previousassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_3);
		}
		else {
			bindPreviousassessmentyear = true;

			query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_2);
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
			query.append(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPreviousassessmentid) {
			qPos.add(previousassessmentid);
		}

		if (bindPreviousassessmentyear) {
			qPos.add(previousassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentPeriod);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentPeriod> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63; from the database.
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPreviousAssessmentidAndAssessmentyear(
		String previousassessmentid, String previousassessmentyear)
		throws SystemException {
		for (AssessmentPeriod assessmentPeriod : findByPreviousAssessmentidAndAssessmentyear(
				previousassessmentid, previousassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentPeriod);
		}
	}

	/**
	 * Returns the number of assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	 *
	 * @param previousassessmentid the previousassessmentid
	 * @param previousassessmentyear the previousassessmentyear
	 * @return the number of matching assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPreviousAssessmentidAndAssessmentyear(
		String previousassessmentid, String previousassessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR;

		Object[] finderArgs = new Object[] {
				previousassessmentid, previousassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSESSMENTPERIOD_WHERE);

			boolean bindPreviousassessmentid = false;

			if (previousassessmentid == null) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_1);
			}
			else if (previousassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_3);
			}
			else {
				bindPreviousassessmentid = true;

				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_2);
			}

			boolean bindPreviousassessmentyear = false;

			if (previousassessmentyear == null) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_1);
			}
			else if (previousassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_3);
			}
			else {
				bindPreviousassessmentyear = true;

				query.append(_FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPreviousassessmentid) {
					qPos.add(previousassessmentid);
				}

				if (bindPreviousassessmentyear) {
					qPos.add(previousassessmentyear);
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

	private static final String _FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_1 =
		"assessmentPeriod.previousassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_2 =
		"assessmentPeriod.previousassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTID_3 =
		"(assessmentPeriod.previousassessmentid IS NULL OR assessmentPeriod.previousassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_1 =
		"assessmentPeriod.previousassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_2 =
		"assessmentPeriod.previousassessmentyear = ?";
	private static final String _FINDER_COLUMN_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR_PREVIOUSASSESSMENTYEAR_3 =
		"(assessmentPeriod.previousassessmentyear IS NULL OR assessmentPeriod.previousassessmentyear = '')";

	public AssessmentPeriodPersistenceImpl() {
		setModelClass(AssessmentPeriod.class);
	}

	/**
	 * Caches the assessment period in the entity cache if it is enabled.
	 *
	 * @param assessmentPeriod the assessment period
	 */
	@Override
	public void cacheResult(AssessmentPeriod assessmentPeriod) {
		EntityCacheUtil.putResult(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodImpl.class, assessmentPeriod.getPrimaryKey(),
			assessmentPeriod);

		assessmentPeriod.resetOriginalValues();
	}

	/**
	 * Caches the assessment periods in the entity cache if it is enabled.
	 *
	 * @param assessmentPeriods the assessment periods
	 */
	@Override
	public void cacheResult(List<AssessmentPeriod> assessmentPeriods) {
		for (AssessmentPeriod assessmentPeriod : assessmentPeriods) {
			if (EntityCacheUtil.getResult(
						AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentPeriodImpl.class,
						assessmentPeriod.getPrimaryKey()) == null) {
				cacheResult(assessmentPeriod);
			}
			else {
				assessmentPeriod.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessment periods.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentPeriodImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentPeriodImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessment period.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssessmentPeriod assessmentPeriod) {
		EntityCacheUtil.removeResult(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodImpl.class, assessmentPeriod.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssessmentPeriod> assessmentPeriods) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentPeriod assessmentPeriod : assessmentPeriods) {
			EntityCacheUtil.removeResult(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentPeriodImpl.class, assessmentPeriod.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessment period with the primary key. Does not add the assessment period to the database.
	 *
	 * @param id the primary key for the new assessment period
	 * @return the new assessment period
	 */
	@Override
	public AssessmentPeriod create(long id) {
		AssessmentPeriod assessmentPeriod = new AssessmentPeriodImpl();

		assessmentPeriod.setNew(true);
		assessmentPeriod.setPrimaryKey(id);

		return assessmentPeriod;
	}

	/**
	 * Removes the assessment period with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessment period
	 * @return the assessment period that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod remove(long id)
		throws NoSuchAssessmentPeriodException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessment period with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessment period
	 * @return the assessment period that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod remove(Serializable primaryKey)
		throws NoSuchAssessmentPeriodException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentPeriod assessmentPeriod = (AssessmentPeriod)session.get(AssessmentPeriodImpl.class,
					primaryKey);

			if (assessmentPeriod == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentPeriodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentPeriod);
		}
		catch (NoSuchAssessmentPeriodException nsee) {
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
	protected AssessmentPeriod removeImpl(AssessmentPeriod assessmentPeriod)
		throws SystemException {
		assessmentPeriod = toUnwrappedModel(assessmentPeriod);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentPeriod)) {
				assessmentPeriod = (AssessmentPeriod)session.get(AssessmentPeriodImpl.class,
						assessmentPeriod.getPrimaryKeyObj());
			}

			if (assessmentPeriod != null) {
				session.delete(assessmentPeriod);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentPeriod != null) {
			clearCache(assessmentPeriod);
		}

		return assessmentPeriod;
	}

	@Override
	public AssessmentPeriod updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod)
		throws SystemException {
		assessmentPeriod = toUnwrappedModel(assessmentPeriod);

		boolean isNew = assessmentPeriod.isNew();

		AssessmentPeriodModelImpl assessmentPeriodModelImpl = (AssessmentPeriodModelImpl)assessmentPeriod;

		Session session = null;

		try {
			session = openSession();

			if (assessmentPeriod.isNew()) {
				session.save(assessmentPeriod);

				assessmentPeriod.setNew(false);
			}
			else {
				session.merge(assessmentPeriod);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssessmentPeriodModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentPeriodModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentPeriodModelImpl.getOriginalAssessmentid(),
						assessmentPeriodModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);

				args = new Object[] {
						assessmentPeriodModelImpl.getAssessmentid(),
						assessmentPeriodModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);
			}

			if ((assessmentPeriodModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentPeriodModelImpl.getOriginalAssessmentid(),
						assessmentPeriodModelImpl.getOriginalAssessmentyear(),
						assessmentPeriodModelImpl.getOriginalImporterchecked()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED,
					args);

				args = new Object[] {
						assessmentPeriodModelImpl.getAssessmentid(),
						assessmentPeriodModelImpl.getAssessmentyear(),
						assessmentPeriodModelImpl.getImporterchecked()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHIMPORTERCHECKED,
					args);
			}

			if ((assessmentPeriodModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentPeriodModelImpl.getOriginalAssessmentid(),
						assessmentPeriodModelImpl.getOriginalAssessmentyear(),
						assessmentPeriodModelImpl.getOriginalInspectorchecked()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED,
					args);

				args = new Object[] {
						assessmentPeriodModelImpl.getAssessmentid(),
						assessmentPeriodModelImpl.getAssessmentyear(),
						assessmentPeriodModelImpl.getInspectorchecked()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHINSPECTORCHECKED,
					args);
			}

			if ((assessmentPeriodModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentPeriodModelImpl.getOriginalAssessmentid(),
						assessmentPeriodModelImpl.getOriginalAssessmentyear(),
						assessmentPeriodModelImpl.getOriginalProductionchecked()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED,
					args);

				args = new Object[] {
						assessmentPeriodModelImpl.getAssessmentid(),
						assessmentPeriodModelImpl.getAssessmentyear(),
						assessmentPeriodModelImpl.getProductionchecked()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHPRODUCTIONCHECKED,
					args);
			}

			if ((assessmentPeriodModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentPeriodModelImpl.getOriginalPreviousassessmentid(),
						assessmentPeriodModelImpl.getOriginalPreviousassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR,
					args);

				args = new Object[] {
						assessmentPeriodModelImpl.getPreviousassessmentid(),
						assessmentPeriodModelImpl.getPreviousassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSASSESSMENTIDANDASSESSMENTYEAR,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentPeriodImpl.class, assessmentPeriod.getPrimaryKey(),
			assessmentPeriod);

		return assessmentPeriod;
	}

	protected AssessmentPeriod toUnwrappedModel(
		AssessmentPeriod assessmentPeriod) {
		if (assessmentPeriod instanceof AssessmentPeriodImpl) {
			return assessmentPeriod;
		}

		AssessmentPeriodImpl assessmentPeriodImpl = new AssessmentPeriodImpl();

		assessmentPeriodImpl.setNew(assessmentPeriod.isNew());
		assessmentPeriodImpl.setPrimaryKey(assessmentPeriod.getPrimaryKey());

		assessmentPeriodImpl.setId(assessmentPeriod.getId());
		assessmentPeriodImpl.setAssessmentid(assessmentPeriod.getAssessmentid());
		assessmentPeriodImpl.setAssessmentyear(assessmentPeriod.getAssessmentyear());
		assessmentPeriodImpl.setEvaluationperiod(assessmentPeriod.getEvaluationperiod());
		assessmentPeriodImpl.setImporterchecked(assessmentPeriod.getImporterchecked());
		assessmentPeriodImpl.setInspectorchecked(assessmentPeriod.getInspectorchecked());
		assessmentPeriodImpl.setProductionchecked(assessmentPeriod.getProductionchecked());
		assessmentPeriodImpl.setSynchdate(assessmentPeriod.getSynchdate());
		assessmentPeriodImpl.setPreviousassessmentid(assessmentPeriod.getPreviousassessmentid());
		assessmentPeriodImpl.setPreviousassessmentyear(assessmentPeriod.getPreviousassessmentyear());

		return assessmentPeriodImpl;
	}

	/**
	 * Returns the assessment period with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment period
	 * @return the assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssessmentPeriodException, SystemException {
		AssessmentPeriod assessmentPeriod = fetchByPrimaryKey(primaryKey);

		if (assessmentPeriod == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentPeriodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentPeriod;
	}

	/**
	 * Returns the assessment period with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException} if it could not be found.
	 *
	 * @param id the primary key of the assessment period
	 * @return the assessment period
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod findByPrimaryKey(long id)
		throws NoSuchAssessmentPeriodException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessment period with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment period
	 * @return the assessment period, or <code>null</code> if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssessmentPeriod assessmentPeriod = (AssessmentPeriod)EntityCacheUtil.getResult(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentPeriodImpl.class, primaryKey);

		if (assessmentPeriod == _nullAssessmentPeriod) {
			return null;
		}

		if (assessmentPeriod == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentPeriod = (AssessmentPeriod)session.get(AssessmentPeriodImpl.class,
						primaryKey);

				if (assessmentPeriod != null) {
					cacheResult(assessmentPeriod);
				}
				else {
					EntityCacheUtil.putResult(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentPeriodImpl.class, primaryKey,
						_nullAssessmentPeriod);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentPeriodModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentPeriodImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentPeriod;
	}

	/**
	 * Returns the assessment period with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessment period
	 * @return the assessment period, or <code>null</code> if a assessment period with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentPeriod fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessment periods.
	 *
	 * @return the assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment periods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @return the range of assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment periods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment periods
	 * @param end the upper bound of the range of assessment periods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment periods
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentPeriod> findAll(int start, int end,
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

		List<AssessmentPeriod> list = (List<AssessmentPeriod>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTPERIOD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTPERIOD;

				if (pagination) {
					sql = sql.concat(AssessmentPeriodModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentPeriod>(list);
				}
				else {
					list = (List<AssessmentPeriod>)QueryUtil.list(q,
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
	 * Removes all the assessment periods from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentPeriod assessmentPeriod : findAll()) {
			remove(assessmentPeriod);
		}
	}

	/**
	 * Returns the number of assessment periods.
	 *
	 * @return the number of assessment periods
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTPERIOD);

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
	 * Initializes the assessment period persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentPeriod>> listenersList = new ArrayList<ModelListener<AssessmentPeriod>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentPeriod>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentPeriodImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTPERIOD = "SELECT assessmentPeriod FROM AssessmentPeriod assessmentPeriod";
	private static final String _SQL_SELECT_ASSESSMENTPERIOD_WHERE = "SELECT assessmentPeriod FROM AssessmentPeriod assessmentPeriod WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTPERIOD = "SELECT COUNT(assessmentPeriod) FROM AssessmentPeriod assessmentPeriod";
	private static final String _SQL_COUNT_ASSESSMENTPERIOD_WHERE = "SELECT COUNT(assessmentPeriod) FROM AssessmentPeriod assessmentPeriod WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentPeriod.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentPeriod exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentPeriod exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentPeriodPersistenceImpl.class);
	private static AssessmentPeriod _nullAssessmentPeriod = new AssessmentPeriodImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentPeriod> toCacheModel() {
				return _nullAssessmentPeriodCacheModel;
			}
		};

	private static CacheModel<AssessmentPeriod> _nullAssessmentPeriodCacheModel = new CacheModel<AssessmentPeriod>() {
			@Override
			public AssessmentPeriod toEntityModel() {
				return _nullAssessmentPeriod;
			}
		};
}