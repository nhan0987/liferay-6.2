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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessmentof inspector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofInspectorPersistence
 * @see AssessmentofInspectorUtil
 * @generated
 */
public class AssessmentofInspectorPersistenceImpl extends BasePersistenceImpl<AssessmentofInspector>
	implements AssessmentofInspectorPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentofInspectorUtil} to access the assessmentof inspector persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentofInspectorImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCONTACTCODE =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectorContactCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectorContactCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofInspectorModelImpl.INSPECTORCONTACTCODE_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE = new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorContactCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByInspectorContactCode(
		String inspectorcontactcode, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByInspectorContactCode(inspectorcontactcode, assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @return the range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByInspectorContactCode(
		String inspectorcontactcode, String assessmentid,
		String assessmentyear, int start, int end) throws SystemException {
		return findByInspectorContactCode(inspectorcontactcode, assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByInspectorContactCode(
		String inspectorcontactcode, String assessmentid,
		String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE;
			finderArgs = new Object[] {
					inspectorcontactcode, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCONTACTCODE;
			finderArgs = new Object[] {
					inspectorcontactcode, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofInspector> list = (List<AssessmentofInspector>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofInspector assessmentofInspector : list) {
				if (!Validator.equals(inspectorcontactcode,
							assessmentofInspector.getInspectorcontactcode()) ||
						!Validator.equals(assessmentid,
							assessmentofInspector.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofInspector.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorcontactcode = false;

			if (inspectorcontactcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1);
			}
			else if (inspectorcontactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3);
			}
			else {
				bindInspectorcontactcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorcontactcode) {
					qPos.add(inspectorcontactcode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofInspector>(list);
				}
				else {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
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
	 * Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByInspectorContactCode_First(
		String inspectorcontactcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByInspectorContactCode_First(inspectorcontactcode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByInspectorContactCode_First(
		String inspectorcontactcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofInspector> list = findByInspectorContactCode(inspectorcontactcode,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByInspectorContactCode_Last(
		String inspectorcontactcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByInspectorContactCode_Last(inspectorcontactcode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByInspectorContactCode_Last(
		String inspectorcontactcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInspectorContactCode(inspectorcontactcode,
				assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofInspector> list = findByInspectorContactCode(inspectorcontactcode,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof inspector
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector[] findByInspectorContactCode_PrevAndNext(
		long id, String inspectorcontactcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofInspector[] array = new AssessmentofInspectorImpl[3];

			array[0] = getByInspectorContactCode_PrevAndNext(session,
					assessmentofInspector, inspectorcontactcode, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofInspector;

			array[2] = getByInspectorContactCode_PrevAndNext(session,
					assessmentofInspector, inspectorcontactcode, assessmentid,
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

	protected AssessmentofInspector getByInspectorContactCode_PrevAndNext(
		Session session, AssessmentofInspector assessmentofInspector,
		String inspectorcontactcode, String assessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

		boolean bindInspectorcontactcode = false;

		if (inspectorcontactcode == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1);
		}
		else if (inspectorcontactcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3);
		}
		else {
			bindInspectorcontactcode = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInspectorcontactcode) {
			qPos.add(inspectorcontactcode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofInspector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofInspector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectorContactCode(String inspectorcontactcode,
		String assessmentid, String assessmentyear) throws SystemException {
		for (AssessmentofInspector assessmentofInspector : findByInspectorContactCode(
				inspectorcontactcode, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofInspector);
		}
	}

	/**
	 * Returns the number of assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorContactCode(String inspectorcontactcode,
		String assessmentid, String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE;

		Object[] finderArgs = new Object[] {
				inspectorcontactcode, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorcontactcode = false;

			if (inspectorcontactcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1);
			}
			else if (inspectorcontactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3);
			}
			else {
				bindInspectorcontactcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorcontactcode) {
					qPos.add(inspectorcontactcode);
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

	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1 =
		"assessmentofInspector.inspectorcontactcode IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2 =
		"assessmentofInspector.inspectorcontactcode = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3 =
		"(assessmentofInspector.inspectorcontactcode IS NULL OR assessmentofInspector.inspectorcontactcode = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_1 =
		"assessmentofInspector.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_2 =
		"assessmentofInspector.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_3 =
		"(assessmentofInspector.assessmentid IS NULL OR assessmentofInspector.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_1 =
		"assessmentofInspector.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_2 =
		"assessmentofInspector.assessmentyear = ?";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_3 =
		"(assessmentofInspector.assessmentyear IS NULL OR assessmentofInspector.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORNAME =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectorName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORNAME =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInspectorName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofInspectorModelImpl.INSPECTORNAME_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORNAME = new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByInspectorName(
		String inspectorname, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByInspectorName(inspectorname, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @return the range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByInspectorName(
		String inspectorname, String assessmentid, String assessmentyear,
		int start, int end) throws SystemException {
		return findByInspectorName(inspectorname, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByInspectorName(
		String inspectorname, String assessmentid, String assessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORNAME;
			finderArgs = new Object[] {
					inspectorname, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORNAME;
			finderArgs = new Object[] {
					inspectorname, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofInspector> list = (List<AssessmentofInspector>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofInspector assessmentofInspector : list) {
				if (!Validator.equals(inspectorname,
							assessmentofInspector.getInspectorname()) ||
						!Validator.equals(assessmentid,
							assessmentofInspector.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofInspector.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorname = false;

			if (inspectorname == null) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_1);
			}
			else if (inspectorname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_3);
			}
			else {
				bindInspectorname = true;

				query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorname) {
					qPos.add(inspectorname);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofInspector>(list);
				}
				else {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
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
	 * Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByInspectorName_First(
		String inspectorname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByInspectorName_First(inspectorname,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorname=");
		msg.append(inspectorname);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByInspectorName_First(
		String inspectorname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofInspector> list = findByInspectorName(inspectorname,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByInspectorName_Last(
		String inspectorname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByInspectorName_Last(inspectorname,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorname=");
		msg.append(inspectorname);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByInspectorName_Last(
		String inspectorname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInspectorName(inspectorname, assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofInspector> list = findByInspectorName(inspectorname,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof inspector
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector[] findByInspectorName_PrevAndNext(long id,
		String inspectorname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofInspector[] array = new AssessmentofInspectorImpl[3];

			array[0] = getByInspectorName_PrevAndNext(session,
					assessmentofInspector, inspectorname, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofInspector;

			array[2] = getByInspectorName_PrevAndNext(session,
					assessmentofInspector, inspectorname, assessmentid,
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

	protected AssessmentofInspector getByInspectorName_PrevAndNext(
		Session session, AssessmentofInspector assessmentofInspector,
		String inspectorname, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

		boolean bindInspectorname = false;

		if (inspectorname == null) {
			query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_1);
		}
		else if (inspectorname.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_3);
		}
		else {
			bindInspectorname = true;

			query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_2);
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
			query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInspectorname) {
			qPos.add(inspectorname);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofInspector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofInspector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectorName(String inspectorname,
		String assessmentid, String assessmentyear) throws SystemException {
		for (AssessmentofInspector assessmentofInspector : findByInspectorName(
				inspectorname, assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofInspector);
		}
	}

	/**
	 * Returns the number of assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorName(String inspectorname, String assessmentid,
		String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORNAME;

		Object[] finderArgs = new Object[] {
				inspectorname, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorname = false;

			if (inspectorname == null) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_1);
			}
			else if (inspectorname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_3);
			}
			else {
				bindInspectorname = true;

				query.append(_FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorname) {
					qPos.add(inspectorname);
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

	private static final String _FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_1 = "assessmentofInspector.inspectorname IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_2 = "assessmentofInspector.inspectorname = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORNAME_INSPECTORNAME_3 = "(assessmentofInspector.inspectorname IS NULL OR assessmentofInspector.inspectorname = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_1 = "assessmentofInspector.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_2 = "assessmentofInspector.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORNAME_ASSESSMENTID_3 = "(assessmentofInspector.assessmentid IS NULL OR assessmentofInspector.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_1 = "assessmentofInspector.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_2 = "assessmentofInspector.assessmentyear = ?";
	private static final String _FINDER_COLUMN_INSPECTORNAME_ASSESSMENTYEAR_3 = "(assessmentofInspector.assessmentyear IS NULL OR assessmentofInspector.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORCONTACTCODE =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByInspectorContactCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORCONTACTCODE =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByInspectorContactCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofInspectorModelImpl.INSPECTORCONTACTCODE_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORCONTACTCODE =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByInspectorContactCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByNextPeriodByInspectorContactCode(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		return findByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @return the range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByNextPeriodByInspectorContactCode(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByNextPeriodByInspectorContactCode(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORCONTACTCODE;
			finderArgs = new Object[] {
					inspectorcontactcode, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORCONTACTCODE;
			finderArgs = new Object[] {
					inspectorcontactcode, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofInspector> list = (List<AssessmentofInspector>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofInspector assessmentofInspector : list) {
				if (!Validator.equals(inspectorcontactcode,
							assessmentofInspector.getInspectorcontactcode()) ||
						!Validator.equals(nextassessmentid,
							assessmentofInspector.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofInspector.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorcontactcode = false;

			if (inspectorcontactcode == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1);
			}
			else if (inspectorcontactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3);
			}
			else {
				bindInspectorcontactcode = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorcontactcode) {
					qPos.add(inspectorcontactcode);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofInspector>(list);
				}
				else {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
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
	 * Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByNextPeriodByInspectorContactCode_First(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByNextPeriodByInspectorContactCode_First(inspectorcontactcode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByNextPeriodByInspectorContactCode_First(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofInspector> list = findByNextPeriodByInspectorContactCode(inspectorcontactcode,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByNextPeriodByInspectorContactCode_Last(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByNextPeriodByInspectorContactCode_Last(inspectorcontactcode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByNextPeriodByInspectorContactCode_Last(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByInspectorContactCode(inspectorcontactcode,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofInspector> list = findByNextPeriodByInspectorContactCode(inspectorcontactcode,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof inspector
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector[] findByNextPeriodByInspectorContactCode_PrevAndNext(
		long id, String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofInspector[] array = new AssessmentofInspectorImpl[3];

			array[0] = getByNextPeriodByInspectorContactCode_PrevAndNext(session,
					assessmentofInspector, inspectorcontactcode,
					nextassessmentid, nextassessmentyear, orderByComparator,
					true);

			array[1] = assessmentofInspector;

			array[2] = getByNextPeriodByInspectorContactCode_PrevAndNext(session,
					assessmentofInspector, inspectorcontactcode,
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

	protected AssessmentofInspector getByNextPeriodByInspectorContactCode_PrevAndNext(
		Session session, AssessmentofInspector assessmentofInspector,
		String inspectorcontactcode, String nextassessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

		boolean bindInspectorcontactcode = false;

		if (inspectorcontactcode == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1);
		}
		else if (inspectorcontactcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3);
		}
		else {
			bindInspectorcontactcode = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInspectorcontactcode) {
			qPos.add(inspectorcontactcode);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofInspector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofInspector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByInspectorContactCode(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		for (AssessmentofInspector assessmentofInspector : findByNextPeriodByInspectorContactCode(
				inspectorcontactcode, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofInspector);
		}
	}

	/**
	 * Returns the number of assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByInspectorContactCode(
		String inspectorcontactcode, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORCONTACTCODE;

		Object[] finderArgs = new Object[] {
				inspectorcontactcode, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorcontactcode = false;

			if (inspectorcontactcode == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1);
			}
			else if (inspectorcontactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3);
			}
			else {
				bindInspectorcontactcode = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorcontactcode) {
					qPos.add(inspectorcontactcode);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1 =
		"assessmentofInspector.inspectorcontactcode IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2 =
		"assessmentofInspector.inspectorcontactcode = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3 =
		"(assessmentofInspector.inspectorcontactcode IS NULL OR assessmentofInspector.inspectorcontactcode = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_1 =
		"assessmentofInspector.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_2 =
		"assessmentofInspector.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTID_3 =
		"(assessmentofInspector.nextassessmentid IS NULL OR assessmentofInspector.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_1 =
		"assessmentofInspector.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_2 =
		"assessmentofInspector.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORCONTACTCODE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofInspector.nextassessmentyear IS NULL OR assessmentofInspector.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORNAME =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByInspectorName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORNAME =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByInspectorName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofInspectorModelImpl.INSPECTORNAME_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofInspectorModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORNAME =
		new FinderPath(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByInspectorName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByNextPeriodByInspectorName(
		String inspectorname, String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		return findByNextPeriodByInspectorName(inspectorname, nextassessmentid,
			nextassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @return the range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByNextPeriodByInspectorName(
		String inspectorname, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByInspectorName(inspectorname, nextassessmentid,
			nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findByNextPeriodByInspectorName(
		String inspectorname, String nextassessmentid,
		String nextassessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORNAME;
			finderArgs = new Object[] {
					inspectorname, nextassessmentid, nextassessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORNAME;
			finderArgs = new Object[] {
					inspectorname, nextassessmentid, nextassessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentofInspector> list = (List<AssessmentofInspector>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofInspector assessmentofInspector : list) {
				if (!Validator.equals(inspectorname,
							assessmentofInspector.getInspectorname()) ||
						!Validator.equals(nextassessmentid,
							assessmentofInspector.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofInspector.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorname = false;

			if (inspectorname == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_1);
			}
			else if (inspectorname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_3);
			}
			else {
				bindInspectorname = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorname) {
					qPos.add(inspectorname);
				}

				if (bindNextassessmentid) {
					qPos.add(nextassessmentid);
				}

				if (bindNextassessmentyear) {
					qPos.add(nextassessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofInspector>(list);
				}
				else {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
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
	 * Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByNextPeriodByInspectorName_First(
		String inspectorname, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByNextPeriodByInspectorName_First(inspectorname,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorname=");
		msg.append(inspectorname);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByNextPeriodByInspectorName_First(
		String inspectorname, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofInspector> list = findByNextPeriodByInspectorName(inspectorname,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByNextPeriodByInspectorName_Last(
		String inspectorname, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByNextPeriodByInspectorName_Last(inspectorname,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofInspector != null) {
			return assessmentofInspector;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorname=");
		msg.append(inspectorname);

		msg.append(", nextassessmentid=");
		msg.append(nextassessmentid);

		msg.append(", nextassessmentyear=");
		msg.append(nextassessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentofInspectorException(msg.toString());
	}

	/**
	 * Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByNextPeriodByInspectorName_Last(
		String inspectorname, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByInspectorName(inspectorname,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofInspector> list = findByNextPeriodByInspectorName(inspectorname,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof inspector
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector[] findByNextPeriodByInspectorName_PrevAndNext(
		long id, String inspectorname, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofInspector[] array = new AssessmentofInspectorImpl[3];

			array[0] = getByNextPeriodByInspectorName_PrevAndNext(session,
					assessmentofInspector, inspectorname, nextassessmentid,
					nextassessmentyear, orderByComparator, true);

			array[1] = assessmentofInspector;

			array[2] = getByNextPeriodByInspectorName_PrevAndNext(session,
					assessmentofInspector, inspectorname, nextassessmentid,
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

	protected AssessmentofInspector getByNextPeriodByInspectorName_PrevAndNext(
		Session session, AssessmentofInspector assessmentofInspector,
		String inspectorname, String nextassessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE);

		boolean bindInspectorname = false;

		if (inspectorname == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_1);
		}
		else if (inspectorname.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_3);
		}
		else {
			bindInspectorname = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_2);
		}

		boolean bindNextassessmentid = false;

		if (nextassessmentid == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_1);
		}
		else if (nextassessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_3);
		}
		else {
			bindNextassessmentid = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_2);
		}

		boolean bindNextassessmentyear = false;

		if (nextassessmentyear == null) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_1);
		}
		else if (nextassessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_3);
		}
		else {
			bindNextassessmentyear = true;

			query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_2);
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
			query.append(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInspectorname) {
			qPos.add(inspectorname);
		}

		if (bindNextassessmentid) {
			qPos.add(nextassessmentid);
		}

		if (bindNextassessmentyear) {
			qPos.add(nextassessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofInspector);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofInspector> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNextPeriodByInspectorName(String inspectorname,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		for (AssessmentofInspector assessmentofInspector : findByNextPeriodByInspectorName(
				inspectorname, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofInspector);
		}
	}

	/**
	 * Returns the number of assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param inspectorname the inspectorname
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNextPeriodByInspectorName(String inspectorname,
		String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORNAME;

		Object[] finderArgs = new Object[] {
				inspectorname, nextassessmentid, nextassessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTOFINSPECTOR_WHERE);

			boolean bindInspectorname = false;

			if (inspectorname == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_1);
			}
			else if (inspectorname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_3);
			}
			else {
				bindInspectorname = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_2);
			}

			boolean bindNextassessmentid = false;

			if (nextassessmentid == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_1);
			}
			else if (nextassessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_3);
			}
			else {
				bindNextassessmentid = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_2);
			}

			boolean bindNextassessmentyear = false;

			if (nextassessmentyear == null) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_1);
			}
			else if (nextassessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_3);
			}
			else {
				bindNextassessmentyear = true;

				query.append(_FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorname) {
					qPos.add(inspectorname);
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

	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_1 =
		"assessmentofInspector.inspectorname IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_2 =
		"assessmentofInspector.inspectorname = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_INSPECTORNAME_3 =
		"(assessmentofInspector.inspectorname IS NULL OR assessmentofInspector.inspectorname = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_1 =
		"assessmentofInspector.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_2 =
		"assessmentofInspector.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTID_3 =
		"(assessmentofInspector.nextassessmentid IS NULL OR assessmentofInspector.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_1 =
		"assessmentofInspector.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_2 =
		"assessmentofInspector.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYINSPECTORNAME_NEXTASSESSMENTYEAR_3 =
		"(assessmentofInspector.nextassessmentyear IS NULL OR assessmentofInspector.nextassessmentyear = '')";

	public AssessmentofInspectorPersistenceImpl() {
		setModelClass(AssessmentofInspector.class);
	}

	/**
	 * Caches the assessmentof inspector in the entity cache if it is enabled.
	 *
	 * @param assessmentofInspector the assessmentof inspector
	 */
	@Override
	public void cacheResult(AssessmentofInspector assessmentofInspector) {
		EntityCacheUtil.putResult(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			assessmentofInspector.getPrimaryKey(), assessmentofInspector);

		assessmentofInspector.resetOriginalValues();
	}

	/**
	 * Caches the assessmentof inspectors in the entity cache if it is enabled.
	 *
	 * @param assessmentofInspectors the assessmentof inspectors
	 */
	@Override
	public void cacheResult(List<AssessmentofInspector> assessmentofInspectors) {
		for (AssessmentofInspector assessmentofInspector : assessmentofInspectors) {
			if (EntityCacheUtil.getResult(
						AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofInspectorImpl.class,
						assessmentofInspector.getPrimaryKey()) == null) {
				cacheResult(assessmentofInspector);
			}
			else {
				assessmentofInspector.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessmentof inspectors.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentofInspectorImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentofInspectorImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessmentof inspector.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssessmentofInspector assessmentofInspector) {
		EntityCacheUtil.removeResult(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			assessmentofInspector.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssessmentofInspector> assessmentofInspectors) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentofInspector assessmentofInspector : assessmentofInspectors) {
			EntityCacheUtil.removeResult(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofInspectorImpl.class,
				assessmentofInspector.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessmentof inspector with the primary key. Does not add the assessmentof inspector to the database.
	 *
	 * @param id the primary key for the new assessmentof inspector
	 * @return the new assessmentof inspector
	 */
	@Override
	public AssessmentofInspector create(long id) {
		AssessmentofInspector assessmentofInspector = new AssessmentofInspectorImpl();

		assessmentofInspector.setNew(true);
		assessmentofInspector.setPrimaryKey(id);

		return assessmentofInspector;
	}

	/**
	 * Removes the assessmentof inspector with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessmentof inspector
	 * @return the assessmentof inspector that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector remove(long id)
		throws NoSuchAssessmentofInspectorException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessmentof inspector with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessmentof inspector
	 * @return the assessmentof inspector that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector remove(Serializable primaryKey)
		throws NoSuchAssessmentofInspectorException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentofInspector assessmentofInspector = (AssessmentofInspector)session.get(AssessmentofInspectorImpl.class,
					primaryKey);

			if (assessmentofInspector == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentofInspectorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentofInspector);
		}
		catch (NoSuchAssessmentofInspectorException nsee) {
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
	protected AssessmentofInspector removeImpl(
		AssessmentofInspector assessmentofInspector) throws SystemException {
		assessmentofInspector = toUnwrappedModel(assessmentofInspector);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentofInspector)) {
				assessmentofInspector = (AssessmentofInspector)session.get(AssessmentofInspectorImpl.class,
						assessmentofInspector.getPrimaryKeyObj());
			}

			if (assessmentofInspector != null) {
				session.delete(assessmentofInspector);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentofInspector != null) {
			clearCache(assessmentofInspector);
		}

		return assessmentofInspector;
	}

	@Override
	public AssessmentofInspector updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector assessmentofInspector)
		throws SystemException {
		assessmentofInspector = toUnwrappedModel(assessmentofInspector);

		boolean isNew = assessmentofInspector.isNew();

		AssessmentofInspectorModelImpl assessmentofInspectorModelImpl = (AssessmentofInspectorModelImpl)assessmentofInspector;

		Session session = null;

		try {
			session = openSession();

			if (assessmentofInspector.isNew()) {
				session.save(assessmentofInspector);

				assessmentofInspector.setNew(false);
			}
			else {
				session.merge(assessmentofInspector);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssessmentofInspectorModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentofInspectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofInspectorModelImpl.getOriginalInspectorcontactcode(),
						assessmentofInspectorModelImpl.getOriginalAssessmentid(),
						assessmentofInspectorModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE,
					args);

				args = new Object[] {
						assessmentofInspectorModelImpl.getInspectorcontactcode(),
						assessmentofInspectorModelImpl.getAssessmentid(),
						assessmentofInspectorModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE,
					args);
			}

			if ((assessmentofInspectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofInspectorModelImpl.getOriginalInspectorname(),
						assessmentofInspectorModelImpl.getOriginalAssessmentid(),
						assessmentofInspectorModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORNAME,
					args);

				args = new Object[] {
						assessmentofInspectorModelImpl.getInspectorname(),
						assessmentofInspectorModelImpl.getAssessmentid(),
						assessmentofInspectorModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORNAME,
					args);
			}

			if ((assessmentofInspectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORCONTACTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofInspectorModelImpl.getOriginalInspectorcontactcode(),
						assessmentofInspectorModelImpl.getOriginalNextassessmentid(),
						assessmentofInspectorModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORCONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORCONTACTCODE,
					args);

				args = new Object[] {
						assessmentofInspectorModelImpl.getInspectorcontactcode(),
						assessmentofInspectorModelImpl.getNextassessmentid(),
						assessmentofInspectorModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORCONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORCONTACTCODE,
					args);
			}

			if ((assessmentofInspectorModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofInspectorModelImpl.getOriginalInspectorname(),
						assessmentofInspectorModelImpl.getOriginalNextassessmentid(),
						assessmentofInspectorModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORNAME,
					args);

				args = new Object[] {
						assessmentofInspectorModelImpl.getInspectorname(),
						assessmentofInspectorModelImpl.getNextassessmentid(),
						assessmentofInspectorModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYINSPECTORNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYINSPECTORNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofInspectorImpl.class,
			assessmentofInspector.getPrimaryKey(), assessmentofInspector);

		return assessmentofInspector;
	}

	protected AssessmentofInspector toUnwrappedModel(
		AssessmentofInspector assessmentofInspector) {
		if (assessmentofInspector instanceof AssessmentofInspectorImpl) {
			return assessmentofInspector;
		}

		AssessmentofInspectorImpl assessmentofInspectorImpl = new AssessmentofInspectorImpl();

		assessmentofInspectorImpl.setNew(assessmentofInspector.isNew());
		assessmentofInspectorImpl.setPrimaryKey(assessmentofInspector.getPrimaryKey());

		assessmentofInspectorImpl.setId(assessmentofInspector.getId());
		assessmentofInspectorImpl.setInspectorcontactcode(assessmentofInspector.getInspectorcontactcode());
		assessmentofInspectorImpl.setInspectorname(assessmentofInspector.getInspectorname());
		assessmentofInspectorImpl.setInspectorposition(assessmentofInspector.getInspectorposition());
		assessmentofInspectorImpl.setF1Code(assessmentofInspector.getF1Code());
		assessmentofInspectorImpl.setF1Name(assessmentofInspector.getF1Name());
		assessmentofInspectorImpl.setF1Value(assessmentofInspector.getF1Value());
		assessmentofInspectorImpl.setF1Mark(assessmentofInspector.getF1Mark());
		assessmentofInspectorImpl.setF2Code(assessmentofInspector.getF2Code());
		assessmentofInspectorImpl.setF2Name(assessmentofInspector.getF2Name());
		assessmentofInspectorImpl.setF2Value(assessmentofInspector.getF2Value());
		assessmentofInspectorImpl.setF2Mark(assessmentofInspector.getF2Mark());
		assessmentofInspectorImpl.setF3Code(assessmentofInspector.getF3Code());
		assessmentofInspectorImpl.setF3Name(assessmentofInspector.getF3Name());
		assessmentofInspectorImpl.setF3Value(assessmentofInspector.getF3Value());
		assessmentofInspectorImpl.setF3Mark(assessmentofInspector.getF3Mark());
		assessmentofInspectorImpl.setF4Code(assessmentofInspector.getF4Code());
		assessmentofInspectorImpl.setF4Name(assessmentofInspector.getF4Name());
		assessmentofInspectorImpl.setF4Value(assessmentofInspector.getF4Value());
		assessmentofInspectorImpl.setF4Mark(assessmentofInspector.getF4Mark());
		assessmentofInspectorImpl.setF5Code(assessmentofInspector.getF5Code());
		assessmentofInspectorImpl.setF5Name(assessmentofInspector.getF5Name());
		assessmentofInspectorImpl.setF5Value(assessmentofInspector.getF5Value());
		assessmentofInspectorImpl.setF5Mark(assessmentofInspector.getF5Mark());
		assessmentofInspectorImpl.setF6Code(assessmentofInspector.getF6Code());
		assessmentofInspectorImpl.setF6Name(assessmentofInspector.getF6Name());
		assessmentofInspectorImpl.setF6Value(assessmentofInspector.getF6Value());
		assessmentofInspectorImpl.setF6Mark(assessmentofInspector.getF6Mark());
		assessmentofInspectorImpl.setF7Code(assessmentofInspector.getF7Code());
		assessmentofInspectorImpl.setF7Name(assessmentofInspector.getF7Name());
		assessmentofInspectorImpl.setF7Value(assessmentofInspector.getF7Value());
		assessmentofInspectorImpl.setF7Mark(assessmentofInspector.getF7Mark());
		assessmentofInspectorImpl.setF8Code(assessmentofInspector.getF8Code());
		assessmentofInspectorImpl.setF8Name(assessmentofInspector.getF8Name());
		assessmentofInspectorImpl.setF8Value(assessmentofInspector.getF8Value());
		assessmentofInspectorImpl.setF8Mark(assessmentofInspector.getF8Mark());
		assessmentofInspectorImpl.setF9Code(assessmentofInspector.getF9Code());
		assessmentofInspectorImpl.setF9Name(assessmentofInspector.getF9Name());
		assessmentofInspectorImpl.setF9Value(assessmentofInspector.getF9Value());
		assessmentofInspectorImpl.setF9Mark(assessmentofInspector.getF9Mark());
		assessmentofInspectorImpl.setF10Code(assessmentofInspector.getF10Code());
		assessmentofInspectorImpl.setF10Name(assessmentofInspector.getF10Name());
		assessmentofInspectorImpl.setF10Value(assessmentofInspector.getF10Value());
		assessmentofInspectorImpl.setF10Mark(assessmentofInspector.getF10Mark());
		assessmentofInspectorImpl.setF11Code(assessmentofInspector.getF11Code());
		assessmentofInspectorImpl.setF11Name(assessmentofInspector.getF11Name());
		assessmentofInspectorImpl.setF11Value(assessmentofInspector.getF11Value());
		assessmentofInspectorImpl.setF11Mark(assessmentofInspector.getF11Mark());
		assessmentofInspectorImpl.setF12Code(assessmentofInspector.getF12Code());
		assessmentofInspectorImpl.setF12Name(assessmentofInspector.getF12Name());
		assessmentofInspectorImpl.setF12Value(assessmentofInspector.getF12Value());
		assessmentofInspectorImpl.setF12Mark(assessmentofInspector.getF12Mark());
		assessmentofInspectorImpl.setF13Code(assessmentofInspector.getF13Code());
		assessmentofInspectorImpl.setF13Name(assessmentofInspector.getF13Name());
		assessmentofInspectorImpl.setF13Value(assessmentofInspector.getF13Value());
		assessmentofInspectorImpl.setF13Mark(assessmentofInspector.getF13Mark());
		assessmentofInspectorImpl.setF14Code(assessmentofInspector.getF14Code());
		assessmentofInspectorImpl.setF14Name(assessmentofInspector.getF14Name());
		assessmentofInspectorImpl.setF14Value(assessmentofInspector.getF14Value());
		assessmentofInspectorImpl.setF14Mark(assessmentofInspector.getF14Mark());
		assessmentofInspectorImpl.setF15Code(assessmentofInspector.getF15Code());
		assessmentofInspectorImpl.setF15Name(assessmentofInspector.getF15Name());
		assessmentofInspectorImpl.setF15Value(assessmentofInspector.getF15Value());
		assessmentofInspectorImpl.setF15Mark(assessmentofInspector.getF15Mark());
		assessmentofInspectorImpl.setF16Code(assessmentofInspector.getF16Code());
		assessmentofInspectorImpl.setF16Name(assessmentofInspector.getF16Name());
		assessmentofInspectorImpl.setF16Value(assessmentofInspector.getF16Value());
		assessmentofInspectorImpl.setF16Mark(assessmentofInspector.getF16Mark());
		assessmentofInspectorImpl.setF17Code(assessmentofInspector.getF17Code());
		assessmentofInspectorImpl.setF17Name(assessmentofInspector.getF17Name());
		assessmentofInspectorImpl.setF17Value(assessmentofInspector.getF17Value());
		assessmentofInspectorImpl.setF17Mark(assessmentofInspector.getF17Mark());
		assessmentofInspectorImpl.setF18Code(assessmentofInspector.getF18Code());
		assessmentofInspectorImpl.setF18Name(assessmentofInspector.getF18Name());
		assessmentofInspectorImpl.setF18Value(assessmentofInspector.getF18Value());
		assessmentofInspectorImpl.setF18Mark(assessmentofInspector.getF18Mark());
		assessmentofInspectorImpl.setF19Name(assessmentofInspector.getF19Name());
		assessmentofInspectorImpl.setF19Code(assessmentofInspector.getF19Code());
		assessmentofInspectorImpl.setF19Value(assessmentofInspector.getF19Value());
		assessmentofInspectorImpl.setF19Mark(assessmentofInspector.getF19Mark());
		assessmentofInspectorImpl.setF20Code(assessmentofInspector.getF20Code());
		assessmentofInspectorImpl.setF20Name(assessmentofInspector.getF20Name());
		assessmentofInspectorImpl.setF20Value(assessmentofInspector.getF20Value());
		assessmentofInspectorImpl.setF20Mark(assessmentofInspector.getF20Mark());
		assessmentofInspectorImpl.setF21Code(assessmentofInspector.getF21Code());
		assessmentofInspectorImpl.setF21Name(assessmentofInspector.getF21Name());
		assessmentofInspectorImpl.setF21Value(assessmentofInspector.getF21Value());
		assessmentofInspectorImpl.setF21Mark(assessmentofInspector.getF21Mark());
		assessmentofInspectorImpl.setF22Code(assessmentofInspector.getF22Code());
		assessmentofInspectorImpl.setF22Name(assessmentofInspector.getF22Name());
		assessmentofInspectorImpl.setF22Value(assessmentofInspector.getF22Value());
		assessmentofInspectorImpl.setF22Mark(assessmentofInspector.getF22Mark());
		assessmentofInspectorImpl.setF23Code(assessmentofInspector.getF23Code());
		assessmentofInspectorImpl.setF23Name(assessmentofInspector.getF23Name());
		assessmentofInspectorImpl.setF23Value(assessmentofInspector.getF23Value());
		assessmentofInspectorImpl.setF23Mark(assessmentofInspector.getF23Mark());
		assessmentofInspectorImpl.setSumMark(assessmentofInspector.getSumMark());
		assessmentofInspectorImpl.setMaker(assessmentofInspector.getMaker());
		assessmentofInspectorImpl.setChecker(assessmentofInspector.getChecker());
		assessmentofInspectorImpl.setApprover(assessmentofInspector.getApprover());
		assessmentofInspectorImpl.setMakermodified(assessmentofInspector.getMakermodified());
		assessmentofInspectorImpl.setCheckermodified(assessmentofInspector.getCheckermodified());
		assessmentofInspectorImpl.setApprovermodified(assessmentofInspector.getApprovermodified());
		assessmentofInspectorImpl.setAssessmentid(assessmentofInspector.getAssessmentid());
		assessmentofInspectorImpl.setAssessmentyear(assessmentofInspector.getAssessmentyear());
		assessmentofInspectorImpl.setEvaluationperiod(assessmentofInspector.getEvaluationperiod());
		assessmentofInspectorImpl.setLatestassessment(assessmentofInspector.getLatestassessment());
		assessmentofInspectorImpl.setSynchdate(assessmentofInspector.getSynchdate());
		assessmentofInspectorImpl.setNextassessmentid(assessmentofInspector.getNextassessmentid());
		assessmentofInspectorImpl.setNextassessmentyear(assessmentofInspector.getNextassessmentyear());

		return assessmentofInspectorImpl;
	}

	/**
	 * Returns the assessmentof inspector with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof inspector
	 * @return the assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssessmentofInspectorException, SystemException {
		AssessmentofInspector assessmentofInspector = fetchByPrimaryKey(primaryKey);

		if (assessmentofInspector == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentofInspectorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentofInspector;
	}

	/**
	 * Returns the assessmentof inspector with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException} if it could not be found.
	 *
	 * @param id the primary key of the assessmentof inspector
	 * @return the assessmentof inspector
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector findByPrimaryKey(long id)
		throws NoSuchAssessmentofInspectorException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessmentof inspector with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof inspector
	 * @return the assessmentof inspector, or <code>null</code> if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssessmentofInspector assessmentofInspector = (AssessmentofInspector)EntityCacheUtil.getResult(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofInspectorImpl.class, primaryKey);

		if (assessmentofInspector == _nullAssessmentofInspector) {
			return null;
		}

		if (assessmentofInspector == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentofInspector = (AssessmentofInspector)session.get(AssessmentofInspectorImpl.class,
						primaryKey);

				if (assessmentofInspector != null) {
					cacheResult(assessmentofInspector);
				}
				else {
					EntityCacheUtil.putResult(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofInspectorImpl.class, primaryKey,
						_nullAssessmentofInspector);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentofInspectorModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentofInspectorImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentofInspector;
	}

	/**
	 * Returns the assessmentof inspector with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessmentof inspector
	 * @return the assessmentof inspector, or <code>null</code> if a assessmentof inspector with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofInspector fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessmentof inspectors.
	 *
	 * @return the assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof inspectors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @return the range of assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof inspectors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof inspectors
	 * @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessmentof inspectors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofInspector> findAll(int start, int end,
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

		List<AssessmentofInspector> list = (List<AssessmentofInspector>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTOFINSPECTOR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTOFINSPECTOR;

				if (pagination) {
					sql = sql.concat(AssessmentofInspectorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofInspector>(list);
				}
				else {
					list = (List<AssessmentofInspector>)QueryUtil.list(q,
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
	 * Removes all the assessmentof inspectors from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentofInspector assessmentofInspector : findAll()) {
			remove(assessmentofInspector);
		}
	}

	/**
	 * Returns the number of assessmentof inspectors.
	 *
	 * @return the number of assessmentof inspectors
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTOFINSPECTOR);

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
	 * Initializes the assessmentof inspector persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentofInspector>> listenersList = new ArrayList<ModelListener<AssessmentofInspector>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentofInspector>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentofInspectorImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTOFINSPECTOR = "SELECT assessmentofInspector FROM AssessmentofInspector assessmentofInspector";
	private static final String _SQL_SELECT_ASSESSMENTOFINSPECTOR_WHERE = "SELECT assessmentofInspector FROM AssessmentofInspector assessmentofInspector WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTOFINSPECTOR = "SELECT COUNT(assessmentofInspector) FROM AssessmentofInspector assessmentofInspector";
	private static final String _SQL_COUNT_ASSESSMENTOFINSPECTOR_WHERE = "SELECT COUNT(assessmentofInspector) FROM AssessmentofInspector assessmentofInspector WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentofInspector.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentofInspector exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentofInspector exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentofInspectorPersistenceImpl.class);
	private static AssessmentofInspector _nullAssessmentofInspector = new AssessmentofInspectorImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentofInspector> toCacheModel() {
				return _nullAssessmentofInspectorCacheModel;
			}
		};

	private static CacheModel<AssessmentofInspector> _nullAssessmentofInspectorCacheModel =
		new CacheModel<AssessmentofInspector>() {
			@Override
			public AssessmentofInspector toEntityModel() {
				return _nullAssessmentofInspector;
			}
		};
}