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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessmentof importer control service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofImporterControlPersistence
 * @see AssessmentofImporterControlUtil
 * @generated
 */
public class AssessmentofImporterControlPersistenceImpl
	extends BasePersistenceImpl<AssessmentofImporterControl>
	implements AssessmentofImporterControlPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentofImporterControlUtil} to access the assessmentof importer control persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentofImporterControlImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterControlModelImpl.IMPORTERCODE_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERCODE = new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterCode(
		String importercode, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByImporterCode(importercode, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @return the range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterCode(
		String importercode, String assessmentid, String assessmentyear,
		int start, int end) throws SystemException {
		return findByImporterCode(importercode, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterCode(
		String importercode, String assessmentid, String assessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE;
			finderArgs = new Object[] { importercode, assessmentid, assessmentyear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODE;
			finderArgs = new Object[] {
					importercode, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofImporterControl> list = (List<AssessmentofImporterControl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporterControl assessmentofImporterControl : list) {
				if (!Validator.equals(importercode,
							assessmentofImporterControl.getImportercode()) ||
						!Validator.equals(assessmentid,
							assessmentofImporterControl.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofImporterControl.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercode = false;

			if (importercode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_1);
			}
			else if (importercode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_3);
			}
			else {
				bindImportercode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercode) {
					qPos.add(importercode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporterControl>(list);
				}
				else {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByImporterCode_First(
		String importercode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByImporterCode_First(importercode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercode=");
		msg.append(importercode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByImporterCode_First(
		String importercode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofImporterControl> list = findByImporterCode(importercode,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByImporterCode_Last(
		String importercode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByImporterCode_Last(importercode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercode=");
		msg.append(importercode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByImporterCode_Last(
		String importercode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterCode(importercode, assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporterControl> list = findByImporterCode(importercode,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer control
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl[] findByImporterCode_PrevAndNext(
		long id, String importercode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporterControl[] array = new AssessmentofImporterControlImpl[3];

			array[0] = getByImporterCode_PrevAndNext(session,
					assessmentofImporterControl, importercode, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofImporterControl;

			array[2] = getByImporterCode_PrevAndNext(session,
					assessmentofImporterControl, importercode, assessmentid,
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

	protected AssessmentofImporterControl getByImporterCode_PrevAndNext(
		Session session,
		AssessmentofImporterControl assessmentofImporterControl,
		String importercode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

		boolean bindImportercode = false;

		if (importercode == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_1);
		}
		else if (importercode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_3);
		}
		else {
			bindImportercode = true;

			query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportercode) {
			qPos.add(importercode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporterControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporterControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterCode(String importercode, String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentofImporterControl assessmentofImporterControl : findByImporterCode(
				importercode, assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporterControl);
		}
	}

	/**
	 * Returns the number of assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByImporterCode(String importercode, String assessmentid,
		String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IMPORTERCODE;

		Object[] finderArgs = new Object[] {
				importercode, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercode = false;

			if (importercode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_1);
			}
			else if (importercode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_3);
			}
			else {
				bindImportercode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercode) {
					qPos.add(importercode);
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

	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_1 = "assessmentofImporterControl.importercode IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_2 = "assessmentofImporterControl.importercode = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_3 = "(assessmentofImporterControl.importercode IS NULL OR assessmentofImporterControl.importercode = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_1 = "assessmentofImporterControl.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_2 = "assessmentofImporterControl.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_3 = "(assessmentofImporterControl.assessmentid IS NULL OR assessmentofImporterControl.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_1 = "assessmentofImporterControl.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_2 = "assessmentofImporterControl.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_3 = "(assessmentofImporterControl.assessmentyear IS NULL OR assessmentofImporterControl.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterControlModelImpl.IMPORTERCODEREFERENCE_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERCODEREFERENCE = new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterCodeReference(
		String importercodereference, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByImporterCodeReference(importercodereference, assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @return the range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterCodeReference(
		String importercodereference, String assessmentid,
		String assessmentyear, int start, int end) throws SystemException {
		return findByImporterCodeReference(importercodereference, assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterCodeReference(
		String importercodereference, String assessmentid,
		String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE;
			finderArgs = new Object[] {
					importercodereference, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE;
			finderArgs = new Object[] {
					importercodereference, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofImporterControl> list = (List<AssessmentofImporterControl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporterControl assessmentofImporterControl : list) {
				if (!Validator.equals(importercodereference,
							assessmentofImporterControl.getImportercodereference()) ||
						!Validator.equals(assessmentid,
							assessmentofImporterControl.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofImporterControl.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercodereference = false;

			if (importercodereference == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1);
			}
			else if (importercodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3);
			}
			else {
				bindImportercodereference = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercodereference) {
					qPos.add(importercodereference);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporterControl>(list);
				}
				else {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByImporterCodeReference_First(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByImporterCodeReference_First(importercodereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercodereference=");
		msg.append(importercodereference);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByImporterCodeReference_First(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporterControl> list = findByImporterCodeReference(importercodereference,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByImporterCodeReference_Last(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByImporterCodeReference_Last(importercodereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercodereference=");
		msg.append(importercodereference);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByImporterCodeReference_Last(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByImporterCodeReference(importercodereference,
				assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporterControl> list = findByImporterCodeReference(importercodereference,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer control
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl[] findByImporterCodeReference_PrevAndNext(
		long id, String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporterControl[] array = new AssessmentofImporterControlImpl[3];

			array[0] = getByImporterCodeReference_PrevAndNext(session,
					assessmentofImporterControl, importercodereference,
					assessmentid, assessmentyear, orderByComparator, true);

			array[1] = assessmentofImporterControl;

			array[2] = getByImporterCodeReference_PrevAndNext(session,
					assessmentofImporterControl, importercodereference,
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

	protected AssessmentofImporterControl getByImporterCodeReference_PrevAndNext(
		Session session,
		AssessmentofImporterControl assessmentofImporterControl,
		String importercodereference, String assessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

		boolean bindImportercodereference = false;

		if (importercodereference == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1);
		}
		else if (importercodereference.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3);
		}
		else {
			bindImportercodereference = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportercodereference) {
			qPos.add(importercodereference);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporterControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporterControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterCodeReference(String importercodereference,
		String assessmentid, String assessmentyear) throws SystemException {
		for (AssessmentofImporterControl assessmentofImporterControl : findByImporterCodeReference(
				importercodereference, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporterControl);
		}
	}

	/**
	 * Returns the number of assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByImporterCodeReference(String importercodereference,
		String assessmentid, String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IMPORTERCODEREFERENCE;

		Object[] finderArgs = new Object[] {
				importercodereference, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercodereference = false;

			if (importercodereference == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1);
			}
			else if (importercodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3);
			}
			else {
				bindImportercodereference = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercodereference) {
					qPos.add(importercodereference);
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

	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1 =
		"assessmentofImporterControl.importercodereference IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2 =
		"assessmentofImporterControl.importercodereference = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3 =
		"(assessmentofImporterControl.importercodereference IS NULL OR assessmentofImporterControl.importercodereference = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_1 =
		"assessmentofImporterControl.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_2 =
		"assessmentofImporterControl.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_3 =
		"(assessmentofImporterControl.assessmentid IS NULL OR assessmentofImporterControl.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_1 =
		"assessmentofImporterControl.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_2 =
		"assessmentofImporterControl.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_3 =
		"(assessmentofImporterControl.assessmentyear IS NULL OR assessmentofImporterControl.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterControlModelImpl.IMPORTERNAME_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERNAME = new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterName(
		String importername, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByImporterName(importername, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @return the range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterName(
		String importername, String assessmentid, String assessmentyear,
		int start, int end) throws SystemException {
		return findByImporterName(importername, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByImporterName(
		String importername, String assessmentid, String assessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME;
			finderArgs = new Object[] { importername, assessmentid, assessmentyear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERNAME;
			finderArgs = new Object[] {
					importername, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofImporterControl> list = (List<AssessmentofImporterControl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporterControl assessmentofImporterControl : list) {
				if (!Validator.equals(importername,
							assessmentofImporterControl.getImportername()) ||
						!Validator.equals(assessmentid,
							assessmentofImporterControl.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofImporterControl.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportername = false;

			if (importername == null) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_1);
			}
			else if (importername.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_3);
			}
			else {
				bindImportername = true;

				query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportername) {
					qPos.add(importername);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporterControl>(list);
				}
				else {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByImporterName_First(
		String importername, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByImporterName_First(importername,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByImporterName_First(
		String importername, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofImporterControl> list = findByImporterName(importername,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByImporterName_Last(
		String importername, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByImporterName_Last(importername,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByImporterName_Last(
		String importername, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterName(importername, assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporterControl> list = findByImporterName(importername,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer control
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl[] findByImporterName_PrevAndNext(
		long id, String importername, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporterControl[] array = new AssessmentofImporterControlImpl[3];

			array[0] = getByImporterName_PrevAndNext(session,
					assessmentofImporterControl, importername, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofImporterControl;

			array[2] = getByImporterName_PrevAndNext(session,
					assessmentofImporterControl, importername, assessmentid,
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

	protected AssessmentofImporterControl getByImporterName_PrevAndNext(
		Session session,
		AssessmentofImporterControl assessmentofImporterControl,
		String importername, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

		boolean bindImportername = false;

		if (importername == null) {
			query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_1);
		}
		else if (importername.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_3);
		}
		else {
			bindImportername = true;

			query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportername) {
			qPos.add(importername);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporterControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporterControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterName(String importername, String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentofImporterControl assessmentofImporterControl : findByImporterName(
				importername, assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporterControl);
		}
	}

	/**
	 * Returns the number of assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByImporterName(String importername, String assessmentid,
		String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IMPORTERNAME;

		Object[] finderArgs = new Object[] {
				importername, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportername = false;

			if (importername == null) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_1);
			}
			else if (importername.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_3);
			}
			else {
				bindImportername = true;

				query.append(_FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportername) {
					qPos.add(importername);
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

	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_1 = "assessmentofImporterControl.importername IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_2 = "assessmentofImporterControl.importername = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_3 = "(assessmentofImporterControl.importername IS NULL OR assessmentofImporterControl.importername = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_1 = "assessmentofImporterControl.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_2 = "assessmentofImporterControl.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_3 = "(assessmentofImporterControl.assessmentid IS NULL OR assessmentofImporterControl.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_1 = "assessmentofImporterControl.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_2 = "assessmentofImporterControl.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_3 = "(assessmentofImporterControl.assessmentyear IS NULL OR assessmentofImporterControl.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterControlModelImpl.IMPORTERCODE_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterCode(
		String importercode, String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		return findByNextPeriodByImporterCode(importercode, nextassessmentid,
			nextassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @return the range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterCode(
		String importercode, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByImporterCode(importercode, nextassessmentid,
			nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterCode(
		String importercode, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE;
			finderArgs = new Object[] {
					importercode, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE;
			finderArgs = new Object[] {
					importercode, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofImporterControl> list = (List<AssessmentofImporterControl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporterControl assessmentofImporterControl : list) {
				if (!Validator.equals(importercode,
							assessmentofImporterControl.getImportercode()) ||
						!Validator.equals(nextassessmentid,
							assessmentofImporterControl.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofImporterControl.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercode = false;

			if (importercode == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_1);
			}
			else if (importercode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_3);
			}
			else {
				bindImportercode = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercode) {
					qPos.add(importercode);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporterControl>(list);
				}
				else {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByNextPeriodByImporterCode_First(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByNextPeriodByImporterCode_First(importercode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercode=");
		msg.append(importercode);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByNextPeriodByImporterCode_First(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporterControl> list = findByNextPeriodByImporterCode(importercode,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByNextPeriodByImporterCode_Last(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByNextPeriodByImporterCode_Last(importercode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercode=");
		msg.append(importercode);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByNextPeriodByImporterCode_Last(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByImporterCode(importercode,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporterControl> list = findByNextPeriodByImporterCode(importercode,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer control
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl[] findByNextPeriodByImporterCode_PrevAndNext(
		long id, String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporterControl[] array = new AssessmentofImporterControlImpl[3];

			array[0] = getByNextPeriodByImporterCode_PrevAndNext(session,
					assessmentofImporterControl, importercode,
					nextassessmentid, nextassessmentyear, orderByComparator,
					true);

			array[1] = assessmentofImporterControl;

			array[2] = getByNextPeriodByImporterCode_PrevAndNext(session,
					assessmentofImporterControl, importercode,
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

	protected AssessmentofImporterControl getByNextPeriodByImporterCode_PrevAndNext(
		Session session,
		AssessmentofImporterControl assessmentofImporterControl,
		String importercode, String nextassessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

		boolean bindImportercode = false;

		if (importercode == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_1);
		}
		else if (importercode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_3);
		}
		else {
			bindImportercode = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportercode) {
			qPos.add(importercode);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporterControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporterControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByImporterCode(String importercode,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		for (AssessmentofImporterControl assessmentofImporterControl : findByNextPeriodByImporterCode(
				importercode, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporterControl);
		}
	}

	/**
	 * Returns the number of assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByImporterCode(String importercode,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODE;

		Object[] finderArgs = new Object[] {
				importercode, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercode = false;

			if (importercode == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_1);
			}
			else if (importercode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_3);
			}
			else {
				bindImportercode = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercode) {
					qPos.add(importercode);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_1 =
		"assessmentofImporterControl.importercode IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_2 =
		"assessmentofImporterControl.importercode = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_3 =
		"(assessmentofImporterControl.importercode IS NULL OR assessmentofImporterControl.importercode = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_1 =
		"assessmentofImporterControl.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_2 =
		"assessmentofImporterControl.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_3 =
		"(assessmentofImporterControl.nextassessmentid IS NULL OR assessmentofImporterControl.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_1 =
		"assessmentofImporterControl.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_2 =
		"assessmentofImporterControl.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofImporterControl.nextassessmentyear IS NULL OR assessmentofImporterControl.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterControlModelImpl.IMPORTERCODEREFERENCE_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		return findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @return the range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE;
			finderArgs = new Object[] {
					importercodereference, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE;
			finderArgs = new Object[] {
					importercodereference, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofImporterControl> list = (List<AssessmentofImporterControl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporterControl assessmentofImporterControl : list) {
				if (!Validator.equals(importercodereference,
							assessmentofImporterControl.getImportercodereference()) ||
						!Validator.equals(nextassessmentid,
							assessmentofImporterControl.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofImporterControl.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercodereference = false;

			if (importercodereference == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1);
			}
			else if (importercodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3);
			}
			else {
				bindImportercodereference = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercodereference) {
					qPos.add(importercodereference);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporterControl>(list);
				}
				else {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByNextPeriodByImporterCodeReference_First(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByNextPeriodByImporterCodeReference_First(importercodereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercodereference=");
		msg.append(importercodereference);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByNextPeriodByImporterCodeReference_First(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporterControl> list = findByNextPeriodByImporterCodeReference(importercodereference,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByNextPeriodByImporterCodeReference_Last(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByNextPeriodByImporterCodeReference_Last(importercodereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercodereference=");
		msg.append(importercodereference);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByNextPeriodByImporterCodeReference_Last(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByImporterCodeReference(importercodereference,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporterControl> list = findByNextPeriodByImporterCodeReference(importercodereference,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer control
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl[] findByNextPeriodByImporterCodeReference_PrevAndNext(
		long id, String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporterControl[] array = new AssessmentofImporterControlImpl[3];

			array[0] = getByNextPeriodByImporterCodeReference_PrevAndNext(session,
					assessmentofImporterControl, importercodereference,
					nextassessmentid, nextassessmentyear, orderByComparator,
					true);

			array[1] = assessmentofImporterControl;

			array[2] = getByNextPeriodByImporterCodeReference_PrevAndNext(session,
					assessmentofImporterControl, importercodereference,
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

	protected AssessmentofImporterControl getByNextPeriodByImporterCodeReference_PrevAndNext(
		Session session,
		AssessmentofImporterControl assessmentofImporterControl,
		String importercodereference, String nextassessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

		boolean bindImportercodereference = false;

		if (importercodereference == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1);
		}
		else if (importercodereference.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3);
		}
		else {
			bindImportercodereference = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportercodereference) {
			qPos.add(importercodereference);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporterControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporterControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByImporterCodeReference(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		for (AssessmentofImporterControl assessmentofImporterControl : findByNextPeriodByImporterCodeReference(
				importercodereference, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporterControl);
		}
	}

	/**
	 * Returns the number of assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByImporterCodeReference(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODEREFERENCE;

		Object[] finderArgs = new Object[] {
				importercodereference, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportercodereference = false;

			if (importercodereference == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1);
			}
			else if (importercodereference.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3);
			}
			else {
				bindImportercodereference = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercodereference) {
					qPos.add(importercodereference);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_1 =
		"assessmentofImporterControl.importercodereference IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2 =
		"assessmentofImporterControl.importercodereference = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3 =
		"(assessmentofImporterControl.importercodereference IS NULL OR assessmentofImporterControl.importercodereference = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_1 =
		"assessmentofImporterControl.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_2 =
		"assessmentofImporterControl.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_3 =
		"(assessmentofImporterControl.nextassessmentid IS NULL OR assessmentofImporterControl.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_1 =
		"assessmentofImporterControl.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_2 =
		"assessmentofImporterControl.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofImporterControl.nextassessmentyear IS NULL OR assessmentofImporterControl.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterControlModelImpl.IMPORTERNAME_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterControlModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERNAME =
		new FinderPath(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterName(
		String importername, String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		return findByNextPeriodByImporterName(importername, nextassessmentid,
			nextassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @return the range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterName(
		String importername, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByImporterName(importername, nextassessmentid,
			nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findByNextPeriodByImporterName(
		String importername, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME;
			finderArgs = new Object[] {
					importername, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME;
			finderArgs = new Object[] {
					importername, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofImporterControl> list = (List<AssessmentofImporterControl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporterControl assessmentofImporterControl : list) {
				if (!Validator.equals(importername,
							assessmentofImporterControl.getImportername()) ||
						!Validator.equals(nextassessmentid,
							assessmentofImporterControl.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofImporterControl.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportername = false;

			if (importername == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_1);
			}
			else if (importername.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_3);
			}
			else {
				bindImportername = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportername) {
					qPos.add(importername);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporterControl>(list);
				}
				else {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByNextPeriodByImporterName_First(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByNextPeriodByImporterName_First(importername,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByNextPeriodByImporterName_First(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporterControl> list = findByNextPeriodByImporterName(importername,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByNextPeriodByImporterName_Last(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByNextPeriodByImporterName_Last(importername,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporterControl != null) {
			return assessmentofImporterControl;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofImporterControlException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByNextPeriodByImporterName_Last(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByImporterName(importername,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporterControl> list = findByNextPeriodByImporterName(importername,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer control
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl[] findByNextPeriodByImporterName_PrevAndNext(
		long id, String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporterControl[] array = new AssessmentofImporterControlImpl[3];

			array[0] = getByNextPeriodByImporterName_PrevAndNext(session,
					assessmentofImporterControl, importername,
					nextassessmentid, nextassessmentyear, orderByComparator,
					true);

			array[1] = assessmentofImporterControl;

			array[2] = getByNextPeriodByImporterName_PrevAndNext(session,
					assessmentofImporterControl, importername,
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

	protected AssessmentofImporterControl getByNextPeriodByImporterName_PrevAndNext(
		Session session,
		AssessmentofImporterControl assessmentofImporterControl,
		String importername, String nextassessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

		boolean bindImportername = false;

		if (importername == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_1);
		}
		else if (importername.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_3);
		}
		else {
			bindImportername = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportername) {
			qPos.add(importername);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporterControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporterControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByImporterName(String importername,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		for (AssessmentofImporterControl assessmentofImporterControl : findByNextPeriodByImporterName(
				importername, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporterControl);
		}
	}

	/**
	 * Returns the number of assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByImporterName(String importername,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERNAME;

		Object[] finderArgs = new Object[] {
				importername, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL_WHERE);

			boolean bindImportername = false;

			if (importername == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_1);
			}
			else if (importername.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_3);
			}
			else {
				bindImportername = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportername) {
					qPos.add(importername);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_1 =
		"assessmentofImporterControl.importername IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_2 =
		"assessmentofImporterControl.importername = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_3 =
		"(assessmentofImporterControl.importername IS NULL OR assessmentofImporterControl.importername = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_1 =
		"assessmentofImporterControl.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_2 =
		"assessmentofImporterControl.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_3 =
		"(assessmentofImporterControl.nextassessmentid IS NULL OR assessmentofImporterControl.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_1 =
		"assessmentofImporterControl.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_2 =
		"assessmentofImporterControl.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_3 =
		"(assessmentofImporterControl.nextassessmentyear IS NULL OR assessmentofImporterControl.nextassessmentyear = '')";

	public AssessmentofImporterControlPersistenceImpl() {
		setModelClass(AssessmentofImporterControl.class);
	}

	/**
	 * Caches the assessmentof importer control in the entity cache if it is enabled.
	 *
	 * @param assessmentofImporterControl the assessmentof importer control
	 */
	@Override
	public void cacheResult(
		AssessmentofImporterControl assessmentofImporterControl) {
		EntityCacheUtil.putResult(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			assessmentofImporterControl.getPrimaryKey(),
			assessmentofImporterControl);

		assessmentofImporterControl.resetOriginalValues();
	}

	/**
	 * Caches the assessmentof importer controls in the entity cache if it is enabled.
	 *
	 * @param assessmentofImporterControls the assessmentof importer controls
	 */
	@Override
	public void cacheResult(
		List<AssessmentofImporterControl> assessmentofImporterControls) {
		for (AssessmentofImporterControl assessmentofImporterControl : assessmentofImporterControls) {
			if (EntityCacheUtil.getResult(
						AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofImporterControlImpl.class,
						assessmentofImporterControl.getPrimaryKey()) == null) {
				cacheResult(assessmentofImporterControl);
			}
			else {
				assessmentofImporterControl.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessmentof importer controls.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentofImporterControlImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentofImporterControlImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessmentof importer control.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AssessmentofImporterControl assessmentofImporterControl) {
		EntityCacheUtil.removeResult(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			assessmentofImporterControl.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AssessmentofImporterControl> assessmentofImporterControls) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentofImporterControl assessmentofImporterControl : assessmentofImporterControls) {
			EntityCacheUtil.removeResult(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofImporterControlImpl.class,
				assessmentofImporterControl.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessmentof importer control with the primary key. Does not add the assessmentof importer control to the database.
	 *
	 * @param id the primary key for the new assessmentof importer control
	 * @return the new assessmentof importer control
	 */
	@Override
	public AssessmentofImporterControl create(long id) {
		AssessmentofImporterControl assessmentofImporterControl = new AssessmentofImporterControlImpl();

		assessmentofImporterControl.setNew(true);
		assessmentofImporterControl.setPrimaryKey(id);

		return assessmentofImporterControl;
	}

	/**
	 * Removes the assessmentof importer control with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessmentof importer control
	 * @return the assessmentof importer control that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl remove(long id)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessmentof importer control with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessmentof importer control
	 * @return the assessmentof importer control that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl remove(Serializable primaryKey)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentofImporterControl assessmentofImporterControl = (AssessmentofImporterControl)session.get(AssessmentofImporterControlImpl.class,
					primaryKey);

			if (assessmentofImporterControl == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentofImporterControlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentofImporterControl);
		}
		catch (NoSuchAssessmentofImporterControlException nsee) {
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
	protected AssessmentofImporterControl removeImpl(
		AssessmentofImporterControl assessmentofImporterControl)
		throws SystemException {
		assessmentofImporterControl = toUnwrappedModel(assessmentofImporterControl);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentofImporterControl)) {
				assessmentofImporterControl = (AssessmentofImporterControl)session.get(AssessmentofImporterControlImpl.class,
						assessmentofImporterControl.getPrimaryKeyObj());
			}

			if (assessmentofImporterControl != null) {
				session.delete(assessmentofImporterControl);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentofImporterControl != null) {
			clearCache(assessmentofImporterControl);
		}

		return assessmentofImporterControl;
	}

	@Override
	public AssessmentofImporterControl updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl assessmentofImporterControl)
		throws SystemException {
		assessmentofImporterControl = toUnwrappedModel(assessmentofImporterControl);

		boolean isNew = assessmentofImporterControl.isNew();

		AssessmentofImporterControlModelImpl assessmentofImporterControlModelImpl =
			(AssessmentofImporterControlModelImpl)assessmentofImporterControl;

		Session session = null;

		try {
			session = openSession();

			if (assessmentofImporterControl.isNew()) {
				session.save(assessmentofImporterControl);

				assessmentofImporterControl.setNew(false);
			}
			else {
				session.merge(assessmentofImporterControl);
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
				!AssessmentofImporterControlModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentofImporterControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterControlModelImpl.getOriginalImportercode(),
						assessmentofImporterControlModelImpl.getOriginalAssessmentid(),
						assessmentofImporterControlModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);

				args = new Object[] {
						assessmentofImporterControlModelImpl.getImportercode(),
						assessmentofImporterControlModelImpl.getAssessmentid(),
						assessmentofImporterControlModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);
			}

			if ((assessmentofImporterControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterControlModelImpl.getOriginalImportercodereference(),
						assessmentofImporterControlModelImpl.getOriginalAssessmentid(),
						assessmentofImporterControlModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE,
					args);

				args = new Object[] {
						assessmentofImporterControlModelImpl.getImportercodereference(),
						assessmentofImporterControlModelImpl.getAssessmentid(),
						assessmentofImporterControlModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE,
					args);
			}

			if ((assessmentofImporterControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterControlModelImpl.getOriginalImportername(),
						assessmentofImporterControlModelImpl.getOriginalAssessmentid(),
						assessmentofImporterControlModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);

				args = new Object[] {
						assessmentofImporterControlModelImpl.getImportername(),
						assessmentofImporterControlModelImpl.getAssessmentid(),
						assessmentofImporterControlModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);
			}

			if ((assessmentofImporterControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterControlModelImpl.getOriginalImportercode(),
						assessmentofImporterControlModelImpl.getOriginalNextassessmentid(),
						assessmentofImporterControlModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE,
					args);

				args = new Object[] {
						assessmentofImporterControlModelImpl.getImportercode(),
						assessmentofImporterControlModelImpl.getNextassessmentid(),
						assessmentofImporterControlModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE,
					args);
			}

			if ((assessmentofImporterControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterControlModelImpl.getOriginalImportercodereference(),
						assessmentofImporterControlModelImpl.getOriginalNextassessmentid(),
						assessmentofImporterControlModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);

				args = new Object[] {
						assessmentofImporterControlModelImpl.getImportercodereference(),
						assessmentofImporterControlModelImpl.getNextassessmentid(),
						assessmentofImporterControlModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);
			}

			if ((assessmentofImporterControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterControlModelImpl.getOriginalImportername(),
						assessmentofImporterControlModelImpl.getOriginalNextassessmentid(),
						assessmentofImporterControlModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME,
					args);

				args = new Object[] {
						assessmentofImporterControlModelImpl.getImportername(),
						assessmentofImporterControlModelImpl.getNextassessmentid(),
						assessmentofImporterControlModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterControlImpl.class,
			assessmentofImporterControl.getPrimaryKey(),
			assessmentofImporterControl);

		return assessmentofImporterControl;
	}

	protected AssessmentofImporterControl toUnwrappedModel(
		AssessmentofImporterControl assessmentofImporterControl) {
		if (assessmentofImporterControl instanceof AssessmentofImporterControlImpl) {
			return assessmentofImporterControl;
		}

		AssessmentofImporterControlImpl assessmentofImporterControlImpl = new AssessmentofImporterControlImpl();

		assessmentofImporterControlImpl.setNew(assessmentofImporterControl.isNew());
		assessmentofImporterControlImpl.setPrimaryKey(assessmentofImporterControl.getPrimaryKey());

		assessmentofImporterControlImpl.setId(assessmentofImporterControl.getId());
		assessmentofImporterControlImpl.setImportercode(assessmentofImporterControl.getImportercode());
		assessmentofImporterControlImpl.setImportername(assessmentofImporterControl.getImportername());
		assessmentofImporterControlImpl.setImporteraddress(assessmentofImporterControl.getImporteraddress());
		assessmentofImporterControlImpl.setRepresentative(assessmentofImporterControl.getRepresentative());
		assessmentofImporterControlImpl.setEmail(assessmentofImporterControl.getEmail());
		assessmentofImporterControlImpl.setPhone(assessmentofImporterControl.getPhone());
		assessmentofImporterControlImpl.setFax(assessmentofImporterControl.getFax());
		assessmentofImporterControlImpl.setImportercodereference(assessmentofImporterControl.getImportercodereference());
		assessmentofImporterControlImpl.setF1Code(assessmentofImporterControl.getF1Code());
		assessmentofImporterControlImpl.setF1Name(assessmentofImporterControl.getF1Name());
		assessmentofImporterControlImpl.setF1Value(assessmentofImporterControl.getF1Value());
		assessmentofImporterControlImpl.setF1Mark(assessmentofImporterControl.getF1Mark());
		assessmentofImporterControlImpl.setF2Code(assessmentofImporterControl.getF2Code());
		assessmentofImporterControlImpl.setF2Name(assessmentofImporterControl.getF2Name());
		assessmentofImporterControlImpl.setF2Value(assessmentofImporterControl.getF2Value());
		assessmentofImporterControlImpl.setF2Mark(assessmentofImporterControl.getF2Mark());
		assessmentofImporterControlImpl.setF3Code(assessmentofImporterControl.getF3Code());
		assessmentofImporterControlImpl.setF3Name(assessmentofImporterControl.getF3Name());
		assessmentofImporterControlImpl.setF3Value(assessmentofImporterControl.getF3Value());
		assessmentofImporterControlImpl.setF3Mark(assessmentofImporterControl.getF3Mark());
		assessmentofImporterControlImpl.setF4Code(assessmentofImporterControl.getF4Code());
		assessmentofImporterControlImpl.setF4Name(assessmentofImporterControl.getF4Name());
		assessmentofImporterControlImpl.setF4Value(assessmentofImporterControl.getF4Value());
		assessmentofImporterControlImpl.setF4Mark(assessmentofImporterControl.getF4Mark());
		assessmentofImporterControlImpl.setF5Code(assessmentofImporterControl.getF5Code());
		assessmentofImporterControlImpl.setF5Name(assessmentofImporterControl.getF5Name());
		assessmentofImporterControlImpl.setF5Value(assessmentofImporterControl.getF5Value());
		assessmentofImporterControlImpl.setF5Mark(assessmentofImporterControl.getF5Mark());
		assessmentofImporterControlImpl.setF6Code(assessmentofImporterControl.getF6Code());
		assessmentofImporterControlImpl.setF6Name(assessmentofImporterControl.getF6Name());
		assessmentofImporterControlImpl.setF6Value(assessmentofImporterControl.getF6Value());
		assessmentofImporterControlImpl.setF6Mark(assessmentofImporterControl.getF6Mark());
		assessmentofImporterControlImpl.setF7Code(assessmentofImporterControl.getF7Code());
		assessmentofImporterControlImpl.setF7Name(assessmentofImporterControl.getF7Name());
		assessmentofImporterControlImpl.setF7Value(assessmentofImporterControl.getF7Value());
		assessmentofImporterControlImpl.setF7Mark(assessmentofImporterControl.getF7Mark());
		assessmentofImporterControlImpl.setF8Code(assessmentofImporterControl.getF8Code());
		assessmentofImporterControlImpl.setF8Name(assessmentofImporterControl.getF8Name());
		assessmentofImporterControlImpl.setF8Value(assessmentofImporterControl.getF8Value());
		assessmentofImporterControlImpl.setF8Mark(assessmentofImporterControl.getF8Mark());
		assessmentofImporterControlImpl.setF9Code(assessmentofImporterControl.getF9Code());
		assessmentofImporterControlImpl.setF9Name(assessmentofImporterControl.getF9Name());
		assessmentofImporterControlImpl.setF9Value(assessmentofImporterControl.getF9Value());
		assessmentofImporterControlImpl.setF9Mark(assessmentofImporterControl.getF9Mark());
		assessmentofImporterControlImpl.setF10Code(assessmentofImporterControl.getF10Code());
		assessmentofImporterControlImpl.setF10Name(assessmentofImporterControl.getF10Name());
		assessmentofImporterControlImpl.setF10Value(assessmentofImporterControl.getF10Value());
		assessmentofImporterControlImpl.setF10Mark(assessmentofImporterControl.getF10Mark());
		assessmentofImporterControlImpl.setF11Code(assessmentofImporterControl.getF11Code());
		assessmentofImporterControlImpl.setF11Name(assessmentofImporterControl.getF11Name());
		assessmentofImporterControlImpl.setF11Value(assessmentofImporterControl.getF11Value());
		assessmentofImporterControlImpl.setF11Mark(assessmentofImporterControl.getF11Mark());
		assessmentofImporterControlImpl.setF12Code(assessmentofImporterControl.getF12Code());
		assessmentofImporterControlImpl.setF12Name(assessmentofImporterControl.getF12Name());
		assessmentofImporterControlImpl.setF12Value(assessmentofImporterControl.getF12Value());
		assessmentofImporterControlImpl.setF12Mark(assessmentofImporterControl.getF12Mark());
		assessmentofImporterControlImpl.setF13Code(assessmentofImporterControl.getF13Code());
		assessmentofImporterControlImpl.setF13Name(assessmentofImporterControl.getF13Name());
		assessmentofImporterControlImpl.setF13Value(assessmentofImporterControl.getF13Value());
		assessmentofImporterControlImpl.setF13Mark(assessmentofImporterControl.getF13Mark());
		assessmentofImporterControlImpl.setF14Code(assessmentofImporterControl.getF14Code());
		assessmentofImporterControlImpl.setF14Name(assessmentofImporterControl.getF14Name());
		assessmentofImporterControlImpl.setF14Value(assessmentofImporterControl.getF14Value());
		assessmentofImporterControlImpl.setF14Mark(assessmentofImporterControl.getF14Mark());
		assessmentofImporterControlImpl.setF15Code(assessmentofImporterControl.getF15Code());
		assessmentofImporterControlImpl.setF15Name(assessmentofImporterControl.getF15Name());
		assessmentofImporterControlImpl.setF15Value(assessmentofImporterControl.getF15Value());
		assessmentofImporterControlImpl.setF15Mark(assessmentofImporterControl.getF15Mark());
		assessmentofImporterControlImpl.setF16Code(assessmentofImporterControl.getF16Code());
		assessmentofImporterControlImpl.setF16Name(assessmentofImporterControl.getF16Name());
		assessmentofImporterControlImpl.setF16Value(assessmentofImporterControl.getF16Value());
		assessmentofImporterControlImpl.setF16Mark(assessmentofImporterControl.getF16Mark());
		assessmentofImporterControlImpl.setF17Code(assessmentofImporterControl.getF17Code());
		assessmentofImporterControlImpl.setF17Name(assessmentofImporterControl.getF17Name());
		assessmentofImporterControlImpl.setF17Value(assessmentofImporterControl.getF17Value());
		assessmentofImporterControlImpl.setF17Mark(assessmentofImporterControl.getF17Mark());
		assessmentofImporterControlImpl.setF18Code(assessmentofImporterControl.getF18Code());
		assessmentofImporterControlImpl.setF18Name(assessmentofImporterControl.getF18Name());
		assessmentofImporterControlImpl.setF18Value(assessmentofImporterControl.getF18Value());
		assessmentofImporterControlImpl.setF18Mark(assessmentofImporterControl.getF18Mark());
		assessmentofImporterControlImpl.setF19Name(assessmentofImporterControl.getF19Name());
		assessmentofImporterControlImpl.setF19Code(assessmentofImporterControl.getF19Code());
		assessmentofImporterControlImpl.setF19Value(assessmentofImporterControl.getF19Value());
		assessmentofImporterControlImpl.setF19Mark(assessmentofImporterControl.getF19Mark());
		assessmentofImporterControlImpl.setF20Code(assessmentofImporterControl.getF20Code());
		assessmentofImporterControlImpl.setF20Name(assessmentofImporterControl.getF20Name());
		assessmentofImporterControlImpl.setF20Value(assessmentofImporterControl.getF20Value());
		assessmentofImporterControlImpl.setF20Mark(assessmentofImporterControl.getF20Mark());
		assessmentofImporterControlImpl.setF21Code(assessmentofImporterControl.getF21Code());
		assessmentofImporterControlImpl.setF21Name(assessmentofImporterControl.getF21Name());
		assessmentofImporterControlImpl.setF21Value(assessmentofImporterControl.getF21Value());
		assessmentofImporterControlImpl.setF21Mark(assessmentofImporterControl.getF21Mark());
		assessmentofImporterControlImpl.setF22Code(assessmentofImporterControl.getF22Code());
		assessmentofImporterControlImpl.setF22Name(assessmentofImporterControl.getF22Name());
		assessmentofImporterControlImpl.setF22Value(assessmentofImporterControl.getF22Value());
		assessmentofImporterControlImpl.setF22Mark(assessmentofImporterControl.getF22Mark());
		assessmentofImporterControlImpl.setF23Code(assessmentofImporterControl.getF23Code());
		assessmentofImporterControlImpl.setF23Name(assessmentofImporterControl.getF23Name());
		assessmentofImporterControlImpl.setF23Value(assessmentofImporterControl.getF23Value());
		assessmentofImporterControlImpl.setF23Mark(assessmentofImporterControl.getF23Mark());
		assessmentofImporterControlImpl.setSumMark(assessmentofImporterControl.getSumMark());
		assessmentofImporterControlImpl.setMaker(assessmentofImporterControl.getMaker());
		assessmentofImporterControlImpl.setChecker(assessmentofImporterControl.getChecker());
		assessmentofImporterControlImpl.setApprover(assessmentofImporterControl.getApprover());
		assessmentofImporterControlImpl.setMakermodified(assessmentofImporterControl.getMakermodified());
		assessmentofImporterControlImpl.setCheckermodified(assessmentofImporterControl.getCheckermodified());
		assessmentofImporterControlImpl.setApprovermodified(assessmentofImporterControl.getApprovermodified());
		assessmentofImporterControlImpl.setAssessmentid(assessmentofImporterControl.getAssessmentid());
		assessmentofImporterControlImpl.setAssessmentyear(assessmentofImporterControl.getAssessmentyear());
		assessmentofImporterControlImpl.setEvaluationperiod(assessmentofImporterControl.getEvaluationperiod());
		assessmentofImporterControlImpl.setLatestassessment(assessmentofImporterControl.getLatestassessment());
		assessmentofImporterControlImpl.setSynchdate(assessmentofImporterControl.getSynchdate());
		assessmentofImporterControlImpl.setNextassessmentid(assessmentofImporterControl.getNextassessmentid());
		assessmentofImporterControlImpl.setNextassessmentyear(assessmentofImporterControl.getNextassessmentyear());

		return assessmentofImporterControlImpl;
	}

	/**
	 * Returns the assessmentof importer control with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof importer control
	 * @return the assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		AssessmentofImporterControl assessmentofImporterControl = fetchByPrimaryKey(primaryKey);

		if (assessmentofImporterControl == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentofImporterControlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentofImporterControl;
	}

	/**
	 * Returns the assessmentof importer control with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException} if it could not be found.
	 *
	 * @param id the primary key of the assessmentof importer control
	 * @return the assessmentof importer control
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl findByPrimaryKey(long id)
		throws NoSuchAssessmentofImporterControlException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessmentof importer control with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof importer control
	 * @return the assessmentof importer control, or <code>null</code> if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		AssessmentofImporterControl assessmentofImporterControl = (AssessmentofImporterControl)EntityCacheUtil.getResult(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofImporterControlImpl.class, primaryKey);

		if (assessmentofImporterControl == _nullAssessmentofImporterControl) {
			return null;
		}

		if (assessmentofImporterControl == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentofImporterControl = (AssessmentofImporterControl)session.get(AssessmentofImporterControlImpl.class,
						primaryKey);

				if (assessmentofImporterControl != null) {
					cacheResult(assessmentofImporterControl);
				}
				else {
					EntityCacheUtil.putResult(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofImporterControlImpl.class, primaryKey,
						_nullAssessmentofImporterControl);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentofImporterControlModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentofImporterControlImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentofImporterControl;
	}

	/**
	 * Returns the assessmentof importer control with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessmentof importer control
	 * @return the assessmentof importer control, or <code>null</code> if a assessmentof importer control with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporterControl fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessmentof importer controls.
	 *
	 * @return the assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importer controls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @return the range of assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importer controls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof importer controls
	 * @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessmentof importer controls
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporterControl> findAll(int start, int end,
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

		List<AssessmentofImporterControl> list = (List<AssessmentofImporterControl>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL;

				if (pagination) {
					sql = sql.concat(AssessmentofImporterControlModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporterControl>(list);
				}
				else {
					list = (List<AssessmentofImporterControl>)QueryUtil.list(q,
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
	 * Removes all the assessmentof importer controls from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentofImporterControl assessmentofImporterControl : findAll()) {
			remove(assessmentofImporterControl);
		}
	}

	/**
	 * Returns the number of assessmentof importer controls.
	 *
	 * @return the number of assessmentof importer controls
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL);

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
	 * Initializes the assessmentof importer control persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentofImporterControl>> listenersList = new ArrayList<ModelListener<AssessmentofImporterControl>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentofImporterControl>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentofImporterControlImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL = "SELECT assessmentofImporterControl FROM AssessmentofImporterControl assessmentofImporterControl";
	private static final String _SQL_SELECT_ASSESSMENTOFIMPORTERCONTROL_WHERE = "SELECT assessmentofImporterControl FROM AssessmentofImporterControl assessmentofImporterControl WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL = "SELECT COUNT(assessmentofImporterControl) FROM AssessmentofImporterControl assessmentofImporterControl";
	private static final String _SQL_COUNT_ASSESSMENTOFIMPORTERCONTROL_WHERE = "SELECT COUNT(assessmentofImporterControl) FROM AssessmentofImporterControl assessmentofImporterControl WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentofImporterControl.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentofImporterControl exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentofImporterControl exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentofImporterControlPersistenceImpl.class);
	private static AssessmentofImporterControl _nullAssessmentofImporterControl = new AssessmentofImporterControlImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentofImporterControl> toCacheModel() {
				return _nullAssessmentofImporterControlCacheModel;
			}
		};

	private static CacheModel<AssessmentofImporterControl> _nullAssessmentofImporterControlCacheModel =
		new CacheModel<AssessmentofImporterControl>() {
			@Override
			public AssessmentofImporterControl toEntityModel() {
				return _nullAssessmentofImporterControl;
			}
		};
}