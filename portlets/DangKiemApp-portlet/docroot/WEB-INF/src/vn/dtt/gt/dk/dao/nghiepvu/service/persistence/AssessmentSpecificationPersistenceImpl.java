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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessment specification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationPersistence
 * @see AssessmentSpecificationUtil
 * @generated
 */
public class AssessmentSpecificationPersistenceImpl extends BasePersistenceImpl<AssessmentSpecification>
	implements AssessmentSpecificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentSpecificationUtil} to access the assessment specification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentSpecificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			AssessmentSpecificationModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.IMPORTERCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERCODE = new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByImporterCode(
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear) throws SystemException {
		return findByImporterCode(specificationgroupcode, importercode,
			assessmentid, assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @return the range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByImporterCode(
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByImporterCode(specificationgroupcode, importercode,
			assessmentid, assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByImporterCode(
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE;
			finderArgs = new Object[] {
					specificationgroupcode, importercode, assessmentid,
					assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODE;
			finderArgs = new Object[] {
					specificationgroupcode, importercode, assessmentid,
					assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecification> list = (List<AssessmentSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecification assessmentSpecification : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecification.getSpecificationgroupcode()) ||
						!Validator.equals(importercode,
							assessmentSpecification.getImportercode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecification.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecification.getAssessmentyear())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_2);
			}

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
				query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

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
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecification>(list);
				}
				else {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
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
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByImporterCode_First(
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByImporterCode_First(specificationgroupcode,
				importercode, assessmentid, assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", importercode=");
		msg.append(importercode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByImporterCode_First(
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentSpecification> list = findByImporterCode(specificationgroupcode,
				importercode, assessmentid, assessmentyear, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByImporterCode_Last(
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByImporterCode_Last(specificationgroupcode,
				importercode, assessmentid, assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", importercode=");
		msg.append(importercode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByImporterCode_Last(
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterCode(specificationgroupcode, importercode,
				assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecification> list = findByImporterCode(specificationgroupcode,
				importercode, assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment specification
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification[] findByImporterCode_PrevAndNext(long id,
		String specificationgroupcode, String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecification[] array = new AssessmentSpecificationImpl[3];

			array[0] = getByImporterCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					importercode, assessmentid, assessmentyear,
					orderByComparator, true);

			array[1] = assessmentSpecification;

			array[2] = getByImporterCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					importercode, assessmentid, assessmentyear,
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

	protected AssessmentSpecification getByImporterCode_PrevAndNext(
		Session session, AssessmentSpecification assessmentSpecification,
		String specificationgroupcode, String importercode,
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

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_2);
		}

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
			query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterCode(String specificationgroupcode,
		String importercode, String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentSpecification assessmentSpecification : findByImporterCode(
				specificationgroupcode, importercode, assessmentid,
				assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecification);
		}
	}

	/**
	 * Returns the number of assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByImporterCode(String specificationgroupcode,
		String importercode, String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IMPORTERCODE;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, importercode, assessmentid,
				assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_2);
			}

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

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

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

	private static final String _FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecification.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecification.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecification.specificationgroupcode IS NULL OR assessmentSpecification.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_1 = "assessmentSpecification.importercode IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_2 = "assessmentSpecification.importercode = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_3 = "(assessmentSpecification.importercode IS NULL OR assessmentSpecification.importercode = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_1 = "assessmentSpecification.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_2 = "assessmentSpecification.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_3 = "(assessmentSpecification.assessmentid IS NULL OR assessmentSpecification.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_1 = "assessmentSpecification.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_2 = "assessmentSpecification.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_3 = "(assessmentSpecification.assessmentyear IS NULL OR assessmentSpecification.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCONTACTCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectorContactcode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectorContactcode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			AssessmentSpecificationModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.INSPECTORCONTACTCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE = new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorContactcode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByInspectorContactcode(
		String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear) throws SystemException {
		return findByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @return the range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByInspectorContactcode(
		String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByInspectorContactcode(
		String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE;
			finderArgs = new Object[] {
					specificationgroupcode, inspectorcontactcode, assessmentid,
					assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCONTACTCODE;
			finderArgs = new Object[] {
					specificationgroupcode, inspectorcontactcode, assessmentid,
					assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecification> list = (List<AssessmentSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecification assessmentSpecification : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecification.getSpecificationgroupcode()) ||
						!Validator.equals(inspectorcontactcode,
							assessmentSpecification.getInspectorcontactcode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecification.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecification.getAssessmentyear())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_2);
			}

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
				query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

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
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecification>(list);
				}
				else {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
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
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByInspectorContactcode_First(
		String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByInspectorContactcode_First(specificationgroupcode,
				inspectorcontactcode, assessmentid, assessmentyear,
				orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByInspectorContactcode_First(
		String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentSpecification> list = findByInspectorContactcode(specificationgroupcode,
				inspectorcontactcode, assessmentid, assessmentyear, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByInspectorContactcode_Last(
		String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByInspectorContactcode_Last(specificationgroupcode,
				inspectorcontactcode, assessmentid, assessmentyear,
				orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByInspectorContactcode_Last(
		String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInspectorContactcode(specificationgroupcode,
				inspectorcontactcode, assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecification> list = findByInspectorContactcode(specificationgroupcode,
				inspectorcontactcode, assessmentid, assessmentyear, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment specification
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification[] findByInspectorContactcode_PrevAndNext(
		long id, String specificationgroupcode, String inspectorcontactcode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecification[] array = new AssessmentSpecificationImpl[3];

			array[0] = getByInspectorContactcode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					inspectorcontactcode, assessmentid, assessmentyear,
					orderByComparator, true);

			array[1] = assessmentSpecification;

			array[2] = getByInspectorContactcode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					inspectorcontactcode, assessmentid, assessmentyear,
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

	protected AssessmentSpecification getByInspectorContactcode_PrevAndNext(
		Session session, AssessmentSpecification assessmentSpecification,
		String specificationgroupcode, String inspectorcontactcode,
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

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_2);
		}

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
			query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectorContactcode(String specificationgroupcode,
		String inspectorcontactcode, String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentSpecification assessmentSpecification : findByInspectorContactcode(
				specificationgroupcode, inspectorcontactcode, assessmentid,
				assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecification);
		}
	}

	/**
	 * Returns the number of assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorContactcode(String specificationgroupcode,
		String inspectorcontactcode, String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, inspectorcontactcode, assessmentid,
				assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_2);
			}

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

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

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

	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecification.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecification.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecification.specificationgroupcode IS NULL OR assessmentSpecification.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_1 =
		"assessmentSpecification.inspectorcontactcode IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_2 =
		"assessmentSpecification.inspectorcontactcode = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_INSPECTORCONTACTCODE_3 =
		"(assessmentSpecification.inspectorcontactcode IS NULL OR assessmentSpecification.inspectorcontactcode = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_1 =
		"assessmentSpecification.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_2 =
		"assessmentSpecification.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTID_3 =
		"(assessmentSpecification.assessmentid IS NULL OR assessmentSpecification.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_1 =
		"assessmentSpecification.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_2 =
		"assessmentSpecification.assessmentyear = ?";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODE_ASSESSMENTYEAR_3 =
		"(assessmentSpecification.assessmentyear IS NULL OR assessmentSpecification.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProductionCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProductionCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			AssessmentSpecificationModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.PRODUCTIONCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONCODE = new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductionCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByProductionCode(
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear) throws SystemException {
		return findByProductionCode(specificationgroupcode, productioncode,
			assessmentid, assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @return the range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByProductionCode(
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByProductionCode(specificationgroupcode, productioncode,
			assessmentid, assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByProductionCode(
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, productioncode, assessmentid,
					assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, productioncode, assessmentid,
					assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecification> list = (List<AssessmentSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecification assessmentSpecification : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecification.getSpecificationgroupcode()) ||
						!Validator.equals(productioncode,
							assessmentSpecification.getProductioncode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecification.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecification.getAssessmentyear())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindProductioncode = false;

			if (productioncode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_1);
			}
			else if (productioncode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_3);
			}
			else {
				bindProductioncode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindProductioncode) {
					qPos.add(productioncode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecification>(list);
				}
				else {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
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
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByProductionCode_First(
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByProductionCode_First(specificationgroupcode,
				productioncode, assessmentid, assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", productioncode=");
		msg.append(productioncode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByProductionCode_First(
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentSpecification> list = findByProductionCode(specificationgroupcode,
				productioncode, assessmentid, assessmentyear, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByProductionCode_Last(
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByProductionCode_Last(specificationgroupcode,
				productioncode, assessmentid, assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", productioncode=");
		msg.append(productioncode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByProductionCode_Last(
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductionCode(specificationgroupcode,
				productioncode, assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecification> list = findByProductionCode(specificationgroupcode,
				productioncode, assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment specification
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification[] findByProductionCode_PrevAndNext(long id,
		String specificationgroupcode, String productioncode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecification[] array = new AssessmentSpecificationImpl[3];

			array[0] = getByProductionCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					productioncode, assessmentid, assessmentyear,
					orderByComparator, true);

			array[1] = assessmentSpecification;

			array[2] = getByProductionCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					productioncode, assessmentid, assessmentyear,
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

	protected AssessmentSpecification getByProductionCode_PrevAndNext(
		Session session, AssessmentSpecification assessmentSpecification,
		String specificationgroupcode, String productioncode,
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

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_2);
		}

		boolean bindProductioncode = false;

		if (productioncode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_1);
		}
		else if (productioncode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_3);
		}
		else {
			bindProductioncode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

		if (bindProductioncode) {
			qPos.add(productioncode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductionCode(String specificationgroupcode,
		String productioncode, String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentSpecification assessmentSpecification : findByProductionCode(
				specificationgroupcode, productioncode, assessmentid,
				assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecification);
		}
	}

	/**
	 * Returns the number of assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductionCode(String specificationgroupcode,
		String productioncode, String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONCODE;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, productioncode, assessmentid,
				assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindProductioncode = false;

			if (productioncode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_1);
			}
			else if (productioncode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_3);
			}
			else {
				bindProductioncode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindProductioncode) {
					qPos.add(productioncode);
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

	private static final String _FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecification.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecification.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecification.specificationgroupcode IS NULL OR assessmentSpecification.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_1 = "assessmentSpecification.productioncode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_2 = "assessmentSpecification.productioncode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_PRODUCTIONCODE_3 = "(assessmentSpecification.productioncode IS NULL OR assessmentSpecification.productioncode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_1 = "assessmentSpecification.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_2 = "assessmentSpecification.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTID_3 = "(assessmentSpecification.assessmentid IS NULL OR assessmentSpecification.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_1 = "assessmentSpecification.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_2 = "assessmentSpecification.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONCODE_ASSESSMENTYEAR_3 = "(assessmentSpecification.assessmentyear IS NULL OR assessmentSpecification.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectorContactcodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectorContactcodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentSpecificationModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.INSPECTORCONTACTCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectorContactcodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @return the range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		int start, int end) throws SystemException {
		return findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, inspectorcontactcode,
					specificationcode, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, inspectorcontactcode,
					specificationcode, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecification> list = (List<AssessmentSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecification assessmentSpecification : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecification.getSpecificationgroupcode()) ||
						!Validator.equals(inspectorcontactcode,
							assessmentSpecification.getInspectorcontactcode()) ||
						!Validator.equals(specificationcode,
							assessmentSpecification.getSpecificationcode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecification.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecification.getAssessmentyear())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindInspectorcontactcode = false;

			if (inspectorcontactcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_1);
			}
			else if (inspectorcontactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_3);
			}
			else {
				bindInspectorcontactcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindInspectorcontactcode) {
					qPos.add(inspectorcontactcode);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecification>(list);
				}
				else {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
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
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByInspectorContactcodeAndSpecificationCode_First(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByInspectorContactcodeAndSpecificationCode_First(specificationgroupcode,
				inspectorcontactcode, specificationcode, assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByInspectorContactcodeAndSpecificationCode_First(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentSpecification> list = findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
				inspectorcontactcode, specificationcode, assessmentid,
				assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByInspectorContactcodeAndSpecificationCode_Last(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByInspectorContactcodeAndSpecificationCode_Last(specificationgroupcode,
				inspectorcontactcode, specificationcode, assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", inspectorcontactcode=");
		msg.append(inspectorcontactcode);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByInspectorContactcodeAndSpecificationCode_Last(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
				inspectorcontactcode, specificationcode, assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecification> list = findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
				inspectorcontactcode, specificationcode, assessmentid,
				assessmentyear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment specification
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification[] findByInspectorContactcodeAndSpecificationCode_PrevAndNext(
		long id, String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecification[] array = new AssessmentSpecificationImpl[3];

			array[0] = getByInspectorContactcodeAndSpecificationCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					inspectorcontactcode, specificationcode, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentSpecification;

			array[2] = getByInspectorContactcodeAndSpecificationCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					inspectorcontactcode, specificationcode, assessmentid,
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

	protected AssessmentSpecification getByInspectorContactcodeAndSpecificationCode_PrevAndNext(
		Session session, AssessmentSpecification assessmentSpecification,
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
		}

		boolean bindInspectorcontactcode = false;

		if (inspectorcontactcode == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_1);
		}
		else if (inspectorcontactcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_3);
		}
		else {
			bindInspectorcontactcode = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_2);
		}

		boolean bindSpecificationcode = false;

		if (specificationcode == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
		}
		else if (specificationcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
		}
		else {
			bindSpecificationcode = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

		if (bindInspectorcontactcode) {
			qPos.add(inspectorcontactcode);
		}

		if (bindSpecificationcode) {
			qPos.add(specificationcode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectorContactcodeAndSpecificationCode(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentSpecification assessmentSpecification : findByInspectorContactcodeAndSpecificationCode(
				specificationgroupcode, inspectorcontactcode,
				specificationcode, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecification);
		}
	}

	/**
	 * Returns the number of assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param inspectorcontactcode the inspectorcontactcode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorContactcodeAndSpecificationCode(
		String specificationgroupcode, String inspectorcontactcode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, inspectorcontactcode, specificationcode,
				assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindInspectorcontactcode = false;

			if (inspectorcontactcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_1);
			}
			else if (inspectorcontactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_3);
			}
			else {
				bindInspectorcontactcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindInspectorcontactcode) {
					qPos.add(inspectorcontactcode);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
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

	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecification.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecification.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecification.specificationgroupcode IS NULL OR assessmentSpecification.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_1 =
		"assessmentSpecification.inspectorcontactcode IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_2 =
		"assessmentSpecification.inspectorcontactcode = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_INSPECTORCONTACTCODE_3 =
		"(assessmentSpecification.inspectorcontactcode IS NULL OR assessmentSpecification.inspectorcontactcode = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1 =
		"assessmentSpecification.specificationcode IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"assessmentSpecification.specificationcode = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(assessmentSpecification.specificationcode IS NULL OR assessmentSpecification.specificationcode = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_1 =
		"assessmentSpecification.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_2 =
		"assessmentSpecification.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTID_3 =
		"(assessmentSpecification.assessmentid IS NULL OR assessmentSpecification.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1 =
		"assessmentSpecification.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2 =
		"assessmentSpecification.assessmentyear = ?";
	private static final String _FINDER_COLUMN_INSPECTORCONTACTCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3 =
		"(assessmentSpecification.assessmentyear IS NULL OR assessmentSpecification.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByImporterCodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByImporterCodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentSpecificationModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.IMPORTERCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByImporterCodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @return the range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		int start, int end) throws SystemException {
		return findByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEANDSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, importercode, specificationcode,
					assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODEANDSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, importercode, specificationcode,
					assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecification> list = (List<AssessmentSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecification assessmentSpecification : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecification.getSpecificationgroupcode()) ||
						!Validator.equals(importercode,
							assessmentSpecification.getImportercode()) ||
						!Validator.equals(specificationcode,
							assessmentSpecification.getSpecificationcode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecification.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecification.getAssessmentyear())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindImportercode = false;

			if (importercode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_1);
			}
			else if (importercode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_3);
			}
			else {
				bindImportercode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindImportercode) {
					qPos.add(importercode);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecification>(list);
				}
				else {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
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
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByImporterCodeAndSpecificationCode_First(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByImporterCodeAndSpecificationCode_First(specificationgroupcode,
				importercode, specificationcode, assessmentid, assessmentyear,
				orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", importercode=");
		msg.append(importercode);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByImporterCodeAndSpecificationCode_First(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentSpecification> list = findByImporterCodeAndSpecificationCode(specificationgroupcode,
				importercode, specificationcode, assessmentid, assessmentyear,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByImporterCodeAndSpecificationCode_Last(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByImporterCodeAndSpecificationCode_Last(specificationgroupcode,
				importercode, specificationcode, assessmentid, assessmentyear,
				orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", importercode=");
		msg.append(importercode);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByImporterCodeAndSpecificationCode_Last(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterCodeAndSpecificationCode(specificationgroupcode,
				importercode, specificationcode, assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecification> list = findByImporterCodeAndSpecificationCode(specificationgroupcode,
				importercode, specificationcode, assessmentid, assessmentyear,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment specification
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification[] findByImporterCodeAndSpecificationCode_PrevAndNext(
		long id, String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecification[] array = new AssessmentSpecificationImpl[3];

			array[0] = getByImporterCodeAndSpecificationCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					importercode, specificationcode, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentSpecification;

			array[2] = getByImporterCodeAndSpecificationCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					importercode, specificationcode, assessmentid,
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

	protected AssessmentSpecification getByImporterCodeAndSpecificationCode_PrevAndNext(
		Session session, AssessmentSpecification assessmentSpecification,
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
		}

		boolean bindImportercode = false;

		if (importercode == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_1);
		}
		else if (importercode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_3);
		}
		else {
			bindImportercode = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_2);
		}

		boolean bindSpecificationcode = false;

		if (specificationcode == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
		}
		else if (specificationcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
		}
		else {
			bindSpecificationcode = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

		if (bindImportercode) {
			qPos.add(importercode);
		}

		if (bindSpecificationcode) {
			qPos.add(specificationcode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterCodeAndSpecificationCode(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentSpecification assessmentSpecification : findByImporterCodeAndSpecificationCode(
				specificationgroupcode, importercode, specificationcode,
				assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecification);
		}
	}

	/**
	 * Returns the number of assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param importercode the importercode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByImporterCodeAndSpecificationCode(
		String specificationgroupcode, String importercode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IMPORTERCODEANDSPECIFICATIONCODE;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, importercode, specificationcode,
				assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindImportercode = false;

			if (importercode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_1);
			}
			else if (importercode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_3);
			}
			else {
				bindImportercode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindImportercode) {
					qPos.add(importercode);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
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

	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecification.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecification.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecification.specificationgroupcode IS NULL OR assessmentSpecification.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_1 =
		"assessmentSpecification.importercode IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_2 =
		"assessmentSpecification.importercode = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_IMPORTERCODE_3 =
		"(assessmentSpecification.importercode IS NULL OR assessmentSpecification.importercode = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1 =
		"assessmentSpecification.specificationcode IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"assessmentSpecification.specificationcode = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(assessmentSpecification.specificationcode IS NULL OR assessmentSpecification.specificationcode = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_1 =
		"assessmentSpecification.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_2 =
		"assessmentSpecification.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTID_3 =
		"(assessmentSpecification.assessmentid IS NULL OR assessmentSpecification.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1 =
		"assessmentSpecification.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2 =
		"assessmentSpecification.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3 =
		"(assessmentSpecification.assessmentyear IS NULL OR assessmentSpecification.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProductionCodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProductionCodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentSpecificationModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.PRODUCTIONCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONCODEANDSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProductionCodeAndSpecificationCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @return the range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		int start, int end) throws SystemException {
		return findByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODEANDSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, productioncode, specificationcode,
					assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONCODEANDSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, productioncode, specificationcode,
					assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecification> list = (List<AssessmentSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecification assessmentSpecification : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecification.getSpecificationgroupcode()) ||
						!Validator.equals(productioncode,
							assessmentSpecification.getProductioncode()) ||
						!Validator.equals(specificationcode,
							assessmentSpecification.getSpecificationcode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecification.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecification.getAssessmentyear())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindProductioncode = false;

			if (productioncode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_1);
			}
			else if (productioncode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_3);
			}
			else {
				bindProductioncode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindProductioncode) {
					qPos.add(productioncode);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
				}

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecification>(list);
				}
				else {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
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
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByProductionCodeAndSpecificationCode_First(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByProductionCodeAndSpecificationCode_First(specificationgroupcode,
				productioncode, specificationcode, assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", productioncode=");
		msg.append(productioncode);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByProductionCodeAndSpecificationCode_First(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentSpecification> list = findByProductionCodeAndSpecificationCode(specificationgroupcode,
				productioncode, specificationcode, assessmentid,
				assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByProductionCodeAndSpecificationCode_Last(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByProductionCodeAndSpecificationCode_Last(specificationgroupcode,
				productioncode, specificationcode, assessmentid,
				assessmentyear, orderByComparator);

		if (assessmentSpecification != null) {
			return assessmentSpecification;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", productioncode=");
		msg.append(productioncode);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationException(msg.toString());
	}

	/**
	 * Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByProductionCodeAndSpecificationCode_Last(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductionCodeAndSpecificationCode(specificationgroupcode,
				productioncode, specificationcode, assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecification> list = findByProductionCodeAndSpecificationCode(specificationgroupcode,
				productioncode, specificationcode, assessmentid,
				assessmentyear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment specification
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification[] findByProductionCodeAndSpecificationCode_PrevAndNext(
		long id, String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecification[] array = new AssessmentSpecificationImpl[3];

			array[0] = getByProductionCodeAndSpecificationCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					productioncode, specificationcode, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentSpecification;

			array[2] = getByProductionCodeAndSpecificationCode_PrevAndNext(session,
					assessmentSpecification, specificationgroupcode,
					productioncode, specificationcode, assessmentid,
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

	protected AssessmentSpecification getByProductionCodeAndSpecificationCode_PrevAndNext(
		Session session, AssessmentSpecification assessmentSpecification,
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
		}

		boolean bindProductioncode = false;

		if (productioncode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_1);
		}
		else if (productioncode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_3);
		}
		else {
			bindProductioncode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_2);
		}

		boolean bindSpecificationcode = false;

		if (specificationcode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
		}
		else if (specificationcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
		}
		else {
			bindSpecificationcode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
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
			query.append(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

		if (bindProductioncode) {
			qPos.add(productioncode);
		}

		if (bindSpecificationcode) {
			qPos.add(specificationcode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductionCodeAndSpecificationCode(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		for (AssessmentSpecification assessmentSpecification : findByProductionCodeAndSpecificationCode(
				specificationgroupcode, productioncode, specificationcode,
				assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecification);
		}
	}

	/**
	 * Returns the number of assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param productioncode the productioncode
	 * @param specificationcode the specificationcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductionCodeAndSpecificationCode(
		String specificationgroupcode, String productioncode,
		String specificationcode, String assessmentid, String assessmentyear)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONCODEANDSPECIFICATIONCODE;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, productioncode, specificationcode,
				assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATION_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindProductioncode = false;

			if (productioncode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_1);
			}
			else if (productioncode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_3);
			}
			else {
				bindProductioncode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
				}

				if (bindProductioncode) {
					qPos.add(productioncode);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
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

	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecification.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecification.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecification.specificationgroupcode IS NULL OR assessmentSpecification.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_1 =
		"assessmentSpecification.productioncode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_2 =
		"assessmentSpecification.productioncode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_PRODUCTIONCODE_3 =
		"(assessmentSpecification.productioncode IS NULL OR assessmentSpecification.productioncode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_1 =
		"assessmentSpecification.specificationcode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"assessmentSpecification.specificationcode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(assessmentSpecification.specificationcode IS NULL OR assessmentSpecification.specificationcode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_1 =
		"assessmentSpecification.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_2 =
		"assessmentSpecification.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTID_3 =
		"(assessmentSpecification.assessmentid IS NULL OR assessmentSpecification.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_1 =
		"assessmentSpecification.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_2 =
		"assessmentSpecification.assessmentyear = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONCODEANDSPECIFICATIONCODE_ASSESSMENTYEAR_3 =
		"(assessmentSpecification.assessmentyear IS NULL OR assessmentSpecification.assessmentyear = '')";

	public AssessmentSpecificationPersistenceImpl() {
		setModelClass(AssessmentSpecification.class);
	}

	/**
	 * Caches the assessment specification in the entity cache if it is enabled.
	 *
	 * @param assessmentSpecification the assessment specification
	 */
	@Override
	public void cacheResult(AssessmentSpecification assessmentSpecification) {
		EntityCacheUtil.putResult(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			assessmentSpecification.getPrimaryKey(), assessmentSpecification);

		assessmentSpecification.resetOriginalValues();
	}

	/**
	 * Caches the assessment specifications in the entity cache if it is enabled.
	 *
	 * @param assessmentSpecifications the assessment specifications
	 */
	@Override
	public void cacheResult(
		List<AssessmentSpecification> assessmentSpecifications) {
		for (AssessmentSpecification assessmentSpecification : assessmentSpecifications) {
			if (EntityCacheUtil.getResult(
						AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentSpecificationImpl.class,
						assessmentSpecification.getPrimaryKey()) == null) {
				cacheResult(assessmentSpecification);
			}
			else {
				assessmentSpecification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessment specifications.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentSpecificationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentSpecificationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessment specification.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssessmentSpecification assessmentSpecification) {
		EntityCacheUtil.removeResult(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			assessmentSpecification.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AssessmentSpecification> assessmentSpecifications) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentSpecification assessmentSpecification : assessmentSpecifications) {
			EntityCacheUtil.removeResult(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentSpecificationImpl.class,
				assessmentSpecification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessment specification with the primary key. Does not add the assessment specification to the database.
	 *
	 * @param id the primary key for the new assessment specification
	 * @return the new assessment specification
	 */
	@Override
	public AssessmentSpecification create(long id) {
		AssessmentSpecification assessmentSpecification = new AssessmentSpecificationImpl();

		assessmentSpecification.setNew(true);
		assessmentSpecification.setPrimaryKey(id);

		return assessmentSpecification;
	}

	/**
	 * Removes the assessment specification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessment specification
	 * @return the assessment specification that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification remove(long id)
		throws NoSuchAssessmentSpecificationException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessment specification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessment specification
	 * @return the assessment specification that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification remove(Serializable primaryKey)
		throws NoSuchAssessmentSpecificationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentSpecification assessmentSpecification = (AssessmentSpecification)session.get(AssessmentSpecificationImpl.class,
					primaryKey);

			if (assessmentSpecification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentSpecificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentSpecification);
		}
		catch (NoSuchAssessmentSpecificationException nsee) {
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
	protected AssessmentSpecification removeImpl(
		AssessmentSpecification assessmentSpecification)
		throws SystemException {
		assessmentSpecification = toUnwrappedModel(assessmentSpecification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentSpecification)) {
				assessmentSpecification = (AssessmentSpecification)session.get(AssessmentSpecificationImpl.class,
						assessmentSpecification.getPrimaryKeyObj());
			}

			if (assessmentSpecification != null) {
				session.delete(assessmentSpecification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentSpecification != null) {
			clearCache(assessmentSpecification);
		}

		return assessmentSpecification;
	}

	@Override
	public AssessmentSpecification updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification)
		throws SystemException {
		assessmentSpecification = toUnwrappedModel(assessmentSpecification);

		boolean isNew = assessmentSpecification.isNew();

		AssessmentSpecificationModelImpl assessmentSpecificationModelImpl = (AssessmentSpecificationModelImpl)assessmentSpecification;

		Session session = null;

		try {
			session = openSession();

			if (assessmentSpecification.isNew()) {
				session.save(assessmentSpecification);

				assessmentSpecification.setNew(false);
			}
			else {
				session.merge(assessmentSpecification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssessmentSpecificationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getOriginalImportercode(),
						assessmentSpecificationModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);

				args = new Object[] {
						assessmentSpecificationModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getImportercode(),
						assessmentSpecificationModelImpl.getAssessmentid(),
						assessmentSpecificationModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);
			}

			if ((assessmentSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getOriginalInspectorcontactcode(),
						assessmentSpecificationModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE,
					args);

				args = new Object[] {
						assessmentSpecificationModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getInspectorcontactcode(),
						assessmentSpecificationModelImpl.getAssessmentid(),
						assessmentSpecificationModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODE,
					args);
			}

			if ((assessmentSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getOriginalProductioncode(),
						assessmentSpecificationModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODE,
					args);

				args = new Object[] {
						assessmentSpecificationModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getProductioncode(),
						assessmentSpecificationModelImpl.getAssessmentid(),
						assessmentSpecificationModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODE,
					args);
			}

			if ((assessmentSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getOriginalInspectorcontactcode(),
						assessmentSpecificationModelImpl.getOriginalSpecificationcode(),
						assessmentSpecificationModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE,
					args);

				args = new Object[] {
						assessmentSpecificationModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getInspectorcontactcode(),
						assessmentSpecificationModelImpl.getSpecificationcode(),
						assessmentSpecificationModelImpl.getAssessmentid(),
						assessmentSpecificationModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCONTACTCODEANDSPECIFICATIONCODE,
					args);
			}

			if ((assessmentSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEANDSPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getOriginalImportercode(),
						assessmentSpecificationModelImpl.getOriginalSpecificationcode(),
						assessmentSpecificationModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODEANDSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEANDSPECIFICATIONCODE,
					args);

				args = new Object[] {
						assessmentSpecificationModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getImportercode(),
						assessmentSpecificationModelImpl.getSpecificationcode(),
						assessmentSpecificationModelImpl.getAssessmentid(),
						assessmentSpecificationModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODEANDSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEANDSPECIFICATIONCODE,
					args);
			}

			if ((assessmentSpecificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODEANDSPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getOriginalProductioncode(),
						assessmentSpecificationModelImpl.getOriginalSpecificationcode(),
						assessmentSpecificationModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONCODEANDSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODEANDSPECIFICATIONCODE,
					args);

				args = new Object[] {
						assessmentSpecificationModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationModelImpl.getProductioncode(),
						assessmentSpecificationModelImpl.getSpecificationcode(),
						assessmentSpecificationModelImpl.getAssessmentid(),
						assessmentSpecificationModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONCODEANDSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONCODEANDSPECIFICATIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationImpl.class,
			assessmentSpecification.getPrimaryKey(), assessmentSpecification);

		return assessmentSpecification;
	}

	protected AssessmentSpecification toUnwrappedModel(
		AssessmentSpecification assessmentSpecification) {
		if (assessmentSpecification instanceof AssessmentSpecificationImpl) {
			return assessmentSpecification;
		}

		AssessmentSpecificationImpl assessmentSpecificationImpl = new AssessmentSpecificationImpl();

		assessmentSpecificationImpl.setNew(assessmentSpecification.isNew());
		assessmentSpecificationImpl.setPrimaryKey(assessmentSpecification.getPrimaryKey());

		assessmentSpecificationImpl.setId(assessmentSpecification.getId());
		assessmentSpecificationImpl.setAssessmenttype(assessmentSpecification.getAssessmenttype());
		assessmentSpecificationImpl.setImportercode(assessmentSpecification.getImportercode());
		assessmentSpecificationImpl.setInspectorcontactcode(assessmentSpecification.getInspectorcontactcode());
		assessmentSpecificationImpl.setProductioncode(assessmentSpecification.getProductioncode());
		assessmentSpecificationImpl.setSpecificationcategory(assessmentSpecification.getSpecificationcategory());
		assessmentSpecificationImpl.setSpecificationgroupcode(assessmentSpecification.getSpecificationgroupcode());
		assessmentSpecificationImpl.setSpecificationsequence(assessmentSpecification.getSpecificationsequence());
		assessmentSpecificationImpl.setSpecificationcode(assessmentSpecification.getSpecificationcode());
		assessmentSpecificationImpl.setSpecificationname(assessmentSpecification.getSpecificationname());
		assessmentSpecificationImpl.setSpecificationvalue(assessmentSpecification.getSpecificationvalue());
		assessmentSpecificationImpl.setSpecificationdescription(assessmentSpecification.getSpecificationdescription());
		assessmentSpecificationImpl.setAssessmentcoefficient(assessmentSpecification.getAssessmentcoefficient());
		assessmentSpecificationImpl.setAssessmentindex(assessmentSpecification.getAssessmentindex());
		assessmentSpecificationImpl.setAssessmentmark(assessmentSpecification.getAssessmentmark());
		assessmentSpecificationImpl.setAssessmentid(assessmentSpecification.getAssessmentid());
		assessmentSpecificationImpl.setAssessmentyear(assessmentSpecification.getAssessmentyear());
		assessmentSpecificationImpl.setEvaluationperiod(assessmentSpecification.getEvaluationperiod());
		assessmentSpecificationImpl.setLatestassessment(assessmentSpecification.getLatestassessment());
		assessmentSpecificationImpl.setSynchdate(assessmentSpecification.getSynchdate());

		return assessmentSpecificationImpl;
	}

	/**
	 * Returns the assessment specification with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment specification
	 * @return the assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssessmentSpecificationException, SystemException {
		AssessmentSpecification assessmentSpecification = fetchByPrimaryKey(primaryKey);

		if (assessmentSpecification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentSpecificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentSpecification;
	}

	/**
	 * Returns the assessment specification with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException} if it could not be found.
	 *
	 * @param id the primary key of the assessment specification
	 * @return the assessment specification
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification findByPrimaryKey(long id)
		throws NoSuchAssessmentSpecificationException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessment specification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment specification
	 * @return the assessment specification, or <code>null</code> if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssessmentSpecification assessmentSpecification = (AssessmentSpecification)EntityCacheUtil.getResult(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentSpecificationImpl.class, primaryKey);

		if (assessmentSpecification == _nullAssessmentSpecification) {
			return null;
		}

		if (assessmentSpecification == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentSpecification = (AssessmentSpecification)session.get(AssessmentSpecificationImpl.class,
						primaryKey);

				if (assessmentSpecification != null) {
					cacheResult(assessmentSpecification);
				}
				else {
					EntityCacheUtil.putResult(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentSpecificationImpl.class, primaryKey,
						_nullAssessmentSpecification);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentSpecificationModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentSpecificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentSpecification;
	}

	/**
	 * Returns the assessment specification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessment specification
	 * @return the assessment specification, or <code>null</code> if a assessment specification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecification fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessment specifications.
	 *
	 * @return the assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment specifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @return the range of assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment specifications
	 * @param end the upper bound of the range of assessment specifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment specifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecification> findAll(int start, int end,
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

		List<AssessmentSpecification> list = (List<AssessmentSpecification>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTSPECIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTSPECIFICATION;

				if (pagination) {
					sql = sql.concat(AssessmentSpecificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecification>(list);
				}
				else {
					list = (List<AssessmentSpecification>)QueryUtil.list(q,
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
	 * Removes all the assessment specifications from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentSpecification assessmentSpecification : findAll()) {
			remove(assessmentSpecification);
		}
	}

	/**
	 * Returns the number of assessment specifications.
	 *
	 * @return the number of assessment specifications
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTSPECIFICATION);

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
	 * Initializes the assessment specification persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentSpecification>> listenersList = new ArrayList<ModelListener<AssessmentSpecification>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentSpecification>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentSpecificationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTSPECIFICATION = "SELECT assessmentSpecification FROM AssessmentSpecification assessmentSpecification";
	private static final String _SQL_SELECT_ASSESSMENTSPECIFICATION_WHERE = "SELECT assessmentSpecification FROM AssessmentSpecification assessmentSpecification WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTSPECIFICATION = "SELECT COUNT(assessmentSpecification) FROM AssessmentSpecification assessmentSpecification";
	private static final String _SQL_COUNT_ASSESSMENTSPECIFICATION_WHERE = "SELECT COUNT(assessmentSpecification) FROM AssessmentSpecification assessmentSpecification WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentSpecification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentSpecification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentSpecification exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentSpecificationPersistenceImpl.class);
	private static AssessmentSpecification _nullAssessmentSpecification = new AssessmentSpecificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentSpecification> toCacheModel() {
				return _nullAssessmentSpecificationCacheModel;
			}
		};

	private static CacheModel<AssessmentSpecification> _nullAssessmentSpecificationCacheModel =
		new CacheModel<AssessmentSpecification>() {
			@Override
			public AssessmentSpecification toEntityModel() {
				return _nullAssessmentSpecification;
			}
		};
}