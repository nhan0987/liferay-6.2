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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessmentof importer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofImporterPersistence
 * @see AssessmentofImporterUtil
 * @generated
 */
public class AssessmentofImporterPersistenceImpl extends BasePersistenceImpl<AssessmentofImporter>
	implements AssessmentofImporterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentofImporterUtil} to access the assessmentof importer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentofImporterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterModelImpl.IMPORTERCODE_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERCODE = new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterCode(String importercode,
		String assessmentid, String assessmentyear) throws SystemException {
		return findByImporterCode(importercode, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @return the range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterCode(String importercode,
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByImporterCode(importercode, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterCode(String importercode,
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<AssessmentofImporter> list = (List<AssessmentofImporter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporter assessmentofImporter : list) {
				if (!Validator.equals(importercode,
							assessmentofImporter.getImportercode()) ||
						!Validator.equals(assessmentid,
							assessmentofImporter.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofImporter.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
				query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporter>(list);
				}
				else {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByImporterCode_First(String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByImporterCode_First(importercode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByImporterCode_First(String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofImporter> list = findByImporterCode(importercode,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByImporterCode_Last(String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByImporterCode_Last(importercode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByImporterCode_Last(String importercode,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterCode(importercode, assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporter> list = findByImporterCode(importercode,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter[] findByImporterCode_PrevAndNext(long id,
		String importercode, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporter[] array = new AssessmentofImporterImpl[3];

			array[0] = getByImporterCode_PrevAndNext(session,
					assessmentofImporter, importercode, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofImporter;

			array[2] = getByImporterCode_PrevAndNext(session,
					assessmentofImporter, importercode, assessmentid,
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

	protected AssessmentofImporter getByImporterCode_PrevAndNext(
		Session session, AssessmentofImporter assessmentofImporter,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
			query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterCode(String importercode, String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentofImporter assessmentofImporter : findByImporterCode(
				importercode, assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporter);
		}
	}

	/**
	 * Returns the number of assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof importers
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

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTER_WHERE);

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

	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_1 = "assessmentofImporter.importercode IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_2 = "assessmentofImporter.importercode = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_3 = "(assessmentofImporter.importercode IS NULL OR assessmentofImporter.importercode = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_1 = "assessmentofImporter.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_2 = "assessmentofImporter.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTID_3 = "(assessmentofImporter.assessmentid IS NULL OR assessmentofImporter.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_1 = "assessmentofImporter.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_2 = "assessmentofImporter.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERCODE_ASSESSMENTYEAR_3 = "(assessmentofImporter.assessmentyear IS NULL OR assessmentofImporter.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterModelImpl.IMPORTERCODEREFERENCE_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERCODEREFERENCE = new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterCodeReference(
		String importercodereference, String assessmentid, String assessmentyear)
		throws SystemException {
		return findByImporterCodeReference(importercodereference, assessmentid,
			assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @return the range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterCodeReference(
		String importercodereference, String assessmentid,
		String assessmentyear, int start, int end) throws SystemException {
		return findByImporterCodeReference(importercodereference, assessmentid,
			assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterCodeReference(
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

		List<AssessmentofImporter> list = (List<AssessmentofImporter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporter assessmentofImporter : list) {
				if (!Validator.equals(importercodereference,
							assessmentofImporter.getImportercodereference()) ||
						!Validator.equals(assessmentid,
							assessmentofImporter.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofImporter.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
				query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporter>(list);
				}
				else {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByImporterCodeReference_First(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByImporterCodeReference_First(importercodereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByImporterCodeReference_First(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporter> list = findByImporterCodeReference(importercodereference,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByImporterCodeReference_Last(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByImporterCodeReference_Last(importercodereference,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByImporterCodeReference_Last(
		String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByImporterCodeReference(importercodereference,
				assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporter> list = findByImporterCodeReference(importercodereference,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter[] findByImporterCodeReference_PrevAndNext(
		long id, String importercodereference, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporter[] array = new AssessmentofImporterImpl[3];

			array[0] = getByImporterCodeReference_PrevAndNext(session,
					assessmentofImporter, importercodereference, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofImporter;

			array[2] = getByImporterCodeReference_PrevAndNext(session,
					assessmentofImporter, importercodereference, assessmentid,
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

	protected AssessmentofImporter getByImporterCodeReference_PrevAndNext(
		Session session, AssessmentofImporter assessmentofImporter,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
			query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterCodeReference(String importercodereference,
		String assessmentid, String assessmentyear) throws SystemException {
		for (AssessmentofImporter assessmentofImporter : findByImporterCodeReference(
				importercodereference, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporter);
		}
	}

	/**
	 * Returns the number of assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof importers
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

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTER_WHERE);

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
		"assessmentofImporter.importercodereference IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2 =
		"assessmentofImporter.importercodereference = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3 =
		"(assessmentofImporter.importercodereference IS NULL OR assessmentofImporter.importercodereference = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_1 =
		"assessmentofImporter.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_2 =
		"assessmentofImporter.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTID_3 =
		"(assessmentofImporter.assessmentid IS NULL OR assessmentofImporter.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_1 =
		"assessmentofImporter.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_2 =
		"assessmentofImporter.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERCODEREFERENCE_ASSESSMENTYEAR_3 =
		"(assessmentofImporter.assessmentyear IS NULL OR assessmentofImporter.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterModelImpl.IMPORTERNAME_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERNAME = new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterName(String importername,
		String assessmentid, String assessmentyear) throws SystemException {
		return findByImporterName(importername, assessmentid, assessmentyear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @return the range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterName(String importername,
		String assessmentid, String assessmentyear, int start, int end)
		throws SystemException {
		return findByImporterName(importername, assessmentid, assessmentyear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByImporterName(String importername,
		String assessmentid, String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<AssessmentofImporter> list = (List<AssessmentofImporter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporter assessmentofImporter : list) {
				if (!Validator.equals(importername,
							assessmentofImporter.getImportername()) ||
						!Validator.equals(assessmentid,
							assessmentofImporter.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentofImporter.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
				query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporter>(list);
				}
				else {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByImporterName_First(String importername,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByImporterName_First(importername,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByImporterName_First(String importername,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentofImporter> list = findByImporterName(importername,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByImporterName_Last(String importername,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByImporterName_Last(importername,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByImporterName_Last(String importername,
		String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterName(importername, assessmentid,
				assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporter> list = findByImporterName(importername,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter[] findByImporterName_PrevAndNext(long id,
		String importername, String assessmentid, String assessmentyear,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporter[] array = new AssessmentofImporterImpl[3];

			array[0] = getByImporterName_PrevAndNext(session,
					assessmentofImporter, importername, assessmentid,
					assessmentyear, orderByComparator, true);

			array[1] = assessmentofImporter;

			array[2] = getByImporterName_PrevAndNext(session,
					assessmentofImporter, importername, assessmentid,
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

	protected AssessmentofImporter getByImporterName_PrevAndNext(
		Session session, AssessmentofImporter assessmentofImporter,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
			query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterName(String importername, String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentofImporter assessmentofImporter : findByImporterName(
				importername, assessmentid, assessmentyear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporter);
		}
	}

	/**
	 * Returns the number of assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessmentof importers
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

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTER_WHERE);

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

	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_1 = "assessmentofImporter.importername IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_2 = "assessmentofImporter.importername = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_3 = "(assessmentofImporter.importername IS NULL OR assessmentofImporter.importername = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_1 = "assessmentofImporter.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_2 = "assessmentofImporter.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTID_3 = "(assessmentofImporter.assessmentid IS NULL OR assessmentofImporter.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_1 = "assessmentofImporter.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_2 = "assessmentofImporter.assessmentyear = ?";
	private static final String _FINDER_COLUMN_IMPORTERNAME_ASSESSMENTYEAR_3 = "(assessmentofImporter.assessmentyear IS NULL OR assessmentofImporter.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterModelImpl.IMPORTERCODE_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByImporterCode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterCode(
		String importercode, String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		return findByNextPeriodByImporterCode(importercode, nextassessmentid,
			nextassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @return the range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterCode(
		String importercode, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByImporterCode(importercode, nextassessmentid,
			nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterCode(
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

		List<AssessmentofImporter> list = (List<AssessmentofImporter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporter assessmentofImporter : list) {
				if (!Validator.equals(importercode,
							assessmentofImporter.getImportercode()) ||
						!Validator.equals(nextassessmentid,
							assessmentofImporter.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofImporter.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
				query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporter>(list);
				}
				else {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByNextPeriodByImporterCode_First(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByNextPeriodByImporterCode_First(importercode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByNextPeriodByImporterCode_First(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporter> list = findByNextPeriodByImporterCode(importercode,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByNextPeriodByImporterCode_Last(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByNextPeriodByImporterCode_Last(importercode,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByNextPeriodByImporterCode_Last(
		String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByImporterCode(importercode,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporter> list = findByNextPeriodByImporterCode(importercode,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter[] findByNextPeriodByImporterCode_PrevAndNext(
		long id, String importercode, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporter[] array = new AssessmentofImporterImpl[3];

			array[0] = getByNextPeriodByImporterCode_PrevAndNext(session,
					assessmentofImporter, importercode, nextassessmentid,
					nextassessmentyear, orderByComparator, true);

			array[1] = assessmentofImporter;

			array[2] = getByNextPeriodByImporterCode_PrevAndNext(session,
					assessmentofImporter, importercode, nextassessmentid,
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

	protected AssessmentofImporter getByNextPeriodByImporterCode_PrevAndNext(
		Session session, AssessmentofImporter assessmentofImporter,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
			query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
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
		for (AssessmentofImporter assessmentofImporter : findByNextPeriodByImporterCode(
				importercode, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporter);
		}
	}

	/**
	 * Returns the number of assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercode the importercode
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof importers
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

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTER_WHERE);

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
		"assessmentofImporter.importercode IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_2 =
		"assessmentofImporter.importercode = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_IMPORTERCODE_3 =
		"(assessmentofImporter.importercode IS NULL OR assessmentofImporter.importercode = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_1 =
		"assessmentofImporter.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_2 =
		"assessmentofImporter.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTID_3 =
		"(assessmentofImporter.nextassessmentid IS NULL OR assessmentofImporter.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_1 =
		"assessmentofImporter.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_2 =
		"assessmentofImporter.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofImporter.nextassessmentyear IS NULL OR assessmentofImporter.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterModelImpl.IMPORTERCODEREFERENCE_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODEREFERENCE =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByImporterCodeReference",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear) throws SystemException {
		return findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @return the range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterCodeReference(
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

		List<AssessmentofImporter> list = (List<AssessmentofImporter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporter assessmentofImporter : list) {
				if (!Validator.equals(importercodereference,
							assessmentofImporter.getImportercodereference()) ||
						!Validator.equals(nextassessmentid,
							assessmentofImporter.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofImporter.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
				query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporter>(list);
				}
				else {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByNextPeriodByImporterCodeReference_First(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByNextPeriodByImporterCodeReference_First(importercodereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByNextPeriodByImporterCodeReference_First(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporter> list = findByNextPeriodByImporterCodeReference(importercodereference,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByNextPeriodByImporterCodeReference_Last(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByNextPeriodByImporterCodeReference_Last(importercodereference,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByNextPeriodByImporterCodeReference_Last(
		String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByImporterCodeReference(importercodereference,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporter> list = findByNextPeriodByImporterCodeReference(importercodereference,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter[] findByNextPeriodByImporterCodeReference_PrevAndNext(
		long id, String importercodereference, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporter[] array = new AssessmentofImporterImpl[3];

			array[0] = getByNextPeriodByImporterCodeReference_PrevAndNext(session,
					assessmentofImporter, importercodereference,
					nextassessmentid, nextassessmentyear, orderByComparator,
					true);

			array[1] = assessmentofImporter;

			array[2] = getByNextPeriodByImporterCodeReference_PrevAndNext(session,
					assessmentofImporter, importercodereference,
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

	protected AssessmentofImporter getByNextPeriodByImporterCodeReference_PrevAndNext(
		Session session, AssessmentofImporter assessmentofImporter,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
			query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
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
		for (AssessmentofImporter assessmentofImporter : findByNextPeriodByImporterCodeReference(
				importercodereference, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporter);
		}
	}

	/**
	 * Returns the number of assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importercodereference the importercodereference
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof importers
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

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTER_WHERE);

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
		"assessmentofImporter.importercodereference IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_2 =
		"assessmentofImporter.importercodereference = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_IMPORTERCODEREFERENCE_3 =
		"(assessmentofImporter.importercodereference IS NULL OR assessmentofImporter.importercodereference = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_1 =
		"assessmentofImporter.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_2 =
		"assessmentofImporter.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTID_3 =
		"(assessmentofImporter.nextassessmentid IS NULL OR assessmentofImporter.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_1 =
		"assessmentofImporter.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_2 =
		"assessmentofImporter.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERCODEREFERENCE_NEXTASSESSMENTYEAR_3 =
		"(assessmentofImporter.nextassessmentyear IS NULL OR assessmentofImporter.nextassessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNextPeriodByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNextPeriodByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentofImporterModelImpl.IMPORTERNAME_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.NEXTASSESSMENTID_COLUMN_BITMASK |
			AssessmentofImporterModelImpl.NEXTASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERNAME =
		new FinderPath(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNextPeriodByImporterName",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterName(
		String importername, String nextassessmentid, String nextassessmentyear)
		throws SystemException {
		return findByNextPeriodByImporterName(importername, nextassessmentid,
			nextassessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @return the range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterName(
		String importername, String nextassessmentid,
		String nextassessmentyear, int start, int end)
		throws SystemException {
		return findByNextPeriodByImporterName(importername, nextassessmentid,
			nextassessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findByNextPeriodByImporterName(
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

		List<AssessmentofImporter> list = (List<AssessmentofImporter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentofImporter assessmentofImporter : list) {
				if (!Validator.equals(importername,
							assessmentofImporter.getImportername()) ||
						!Validator.equals(nextassessmentid,
							assessmentofImporter.getNextassessmentid()) ||
						!Validator.equals(nextassessmentyear,
							assessmentofImporter.getNextassessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
				query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporter>(list);
				}
				else {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
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
	 * Returns the first assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByNextPeriodByImporterName_First(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByNextPeriodByImporterName_First(importername,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the first assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByNextPeriodByImporterName_First(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentofImporter> list = findByNextPeriodByImporterName(importername,
				nextassessmentid, nextassessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByNextPeriodByImporterName_Last(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByNextPeriodByImporterName_Last(importername,
				nextassessmentid, nextassessmentyear, orderByComparator);

		if (assessmentofImporter != null) {
			return assessmentofImporter;
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

		throw new NoSuchAssessmentofImporterException(msg.toString());
	}

	/**
	 * Returns the last assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByNextPeriodByImporterName_Last(
		String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNextPeriodByImporterName(importername,
				nextassessmentid, nextassessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentofImporter> list = findByNextPeriodByImporterName(importername,
				nextassessmentid, nextassessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessmentof importer
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter[] findByNextPeriodByImporterName_PrevAndNext(
		long id, String importername, String nextassessmentid,
		String nextassessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentofImporter[] array = new AssessmentofImporterImpl[3];

			array[0] = getByNextPeriodByImporterName_PrevAndNext(session,
					assessmentofImporter, importername, nextassessmentid,
					nextassessmentyear, orderByComparator, true);

			array[1] = assessmentofImporter;

			array[2] = getByNextPeriodByImporterName_PrevAndNext(session,
					assessmentofImporter, importername, nextassessmentid,
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

	protected AssessmentofImporter getByNextPeriodByImporterName_PrevAndNext(
		Session session, AssessmentofImporter assessmentofImporter,
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

		query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE);

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
			query.append(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentofImporter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentofImporter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
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
		for (AssessmentofImporter assessmentofImporter : findByNextPeriodByImporterName(
				importername, nextassessmentid, nextassessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentofImporter);
		}
	}

	/**
	 * Returns the number of assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	 *
	 * @param importername the importername
	 * @param nextassessmentid the nextassessmentid
	 * @param nextassessmentyear the nextassessmentyear
	 * @return the number of matching assessmentof importers
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

			query.append(_SQL_COUNT_ASSESSMENTOFIMPORTER_WHERE);

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
		"assessmentofImporter.importername IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_2 =
		"assessmentofImporter.importername = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_IMPORTERNAME_3 =
		"(assessmentofImporter.importername IS NULL OR assessmentofImporter.importername = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_1 =
		"assessmentofImporter.nextassessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_2 =
		"assessmentofImporter.nextassessmentid = ? AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTID_3 =
		"(assessmentofImporter.nextassessmentid IS NULL OR assessmentofImporter.nextassessmentid = '') AND ";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_1 =
		"assessmentofImporter.nextassessmentyear IS NULL";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_2 =
		"assessmentofImporter.nextassessmentyear = ?";
	private static final String _FINDER_COLUMN_NEXTPERIODBYIMPORTERNAME_NEXTASSESSMENTYEAR_3 =
		"(assessmentofImporter.nextassessmentyear IS NULL OR assessmentofImporter.nextassessmentyear = '')";

	public AssessmentofImporterPersistenceImpl() {
		setModelClass(AssessmentofImporter.class);
	}

	/**
	 * Caches the assessmentof importer in the entity cache if it is enabled.
	 *
	 * @param assessmentofImporter the assessmentof importer
	 */
	@Override
	public void cacheResult(AssessmentofImporter assessmentofImporter) {
		EntityCacheUtil.putResult(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			assessmentofImporter.getPrimaryKey(), assessmentofImporter);

		assessmentofImporter.resetOriginalValues();
	}

	/**
	 * Caches the assessmentof importers in the entity cache if it is enabled.
	 *
	 * @param assessmentofImporters the assessmentof importers
	 */
	@Override
	public void cacheResult(List<AssessmentofImporter> assessmentofImporters) {
		for (AssessmentofImporter assessmentofImporter : assessmentofImporters) {
			if (EntityCacheUtil.getResult(
						AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofImporterImpl.class,
						assessmentofImporter.getPrimaryKey()) == null) {
				cacheResult(assessmentofImporter);
			}
			else {
				assessmentofImporter.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessmentof importers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentofImporterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentofImporterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessmentof importer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssessmentofImporter assessmentofImporter) {
		EntityCacheUtil.removeResult(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterImpl.class, assessmentofImporter.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssessmentofImporter> assessmentofImporters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentofImporter assessmentofImporter : assessmentofImporters) {
			EntityCacheUtil.removeResult(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofImporterImpl.class,
				assessmentofImporter.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessmentof importer with the primary key. Does not add the assessmentof importer to the database.
	 *
	 * @param id the primary key for the new assessmentof importer
	 * @return the new assessmentof importer
	 */
	@Override
	public AssessmentofImporter create(long id) {
		AssessmentofImporter assessmentofImporter = new AssessmentofImporterImpl();

		assessmentofImporter.setNew(true);
		assessmentofImporter.setPrimaryKey(id);

		return assessmentofImporter;
	}

	/**
	 * Removes the assessmentof importer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessmentof importer
	 * @return the assessmentof importer that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter remove(long id)
		throws NoSuchAssessmentofImporterException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessmentof importer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessmentof importer
	 * @return the assessmentof importer that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter remove(Serializable primaryKey)
		throws NoSuchAssessmentofImporterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentofImporter assessmentofImporter = (AssessmentofImporter)session.get(AssessmentofImporterImpl.class,
					primaryKey);

			if (assessmentofImporter == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentofImporterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentofImporter);
		}
		catch (NoSuchAssessmentofImporterException nsee) {
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
	protected AssessmentofImporter removeImpl(
		AssessmentofImporter assessmentofImporter) throws SystemException {
		assessmentofImporter = toUnwrappedModel(assessmentofImporter);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentofImporter)) {
				assessmentofImporter = (AssessmentofImporter)session.get(AssessmentofImporterImpl.class,
						assessmentofImporter.getPrimaryKeyObj());
			}

			if (assessmentofImporter != null) {
				session.delete(assessmentofImporter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentofImporter != null) {
			clearCache(assessmentofImporter);
		}

		return assessmentofImporter;
	}

	@Override
	public AssessmentofImporter updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws SystemException {
		assessmentofImporter = toUnwrappedModel(assessmentofImporter);

		boolean isNew = assessmentofImporter.isNew();

		AssessmentofImporterModelImpl assessmentofImporterModelImpl = (AssessmentofImporterModelImpl)assessmentofImporter;

		Session session = null;

		try {
			session = openSession();

			if (assessmentofImporter.isNew()) {
				session.save(assessmentofImporter);

				assessmentofImporter.setNew(false);
			}
			else {
				session.merge(assessmentofImporter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssessmentofImporterModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentofImporterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterModelImpl.getOriginalImportercode(),
						assessmentofImporterModelImpl.getOriginalAssessmentid(),
						assessmentofImporterModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);

				args = new Object[] {
						assessmentofImporterModelImpl.getImportercode(),
						assessmentofImporterModelImpl.getAssessmentid(),
						assessmentofImporterModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);
			}

			if ((assessmentofImporterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterModelImpl.getOriginalImportercodereference(),
						assessmentofImporterModelImpl.getOriginalAssessmentid(),
						assessmentofImporterModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE,
					args);

				args = new Object[] {
						assessmentofImporterModelImpl.getImportercodereference(),
						assessmentofImporterModelImpl.getAssessmentid(),
						assessmentofImporterModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODEREFERENCE,
					args);
			}

			if ((assessmentofImporterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterModelImpl.getOriginalImportername(),
						assessmentofImporterModelImpl.getOriginalAssessmentid(),
						assessmentofImporterModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);

				args = new Object[] {
						assessmentofImporterModelImpl.getImportername(),
						assessmentofImporterModelImpl.getAssessmentid(),
						assessmentofImporterModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);
			}

			if ((assessmentofImporterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterModelImpl.getOriginalImportercode(),
						assessmentofImporterModelImpl.getOriginalNextassessmentid(),
						assessmentofImporterModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE,
					args);

				args = new Object[] {
						assessmentofImporterModelImpl.getImportercode(),
						assessmentofImporterModelImpl.getNextassessmentid(),
						assessmentofImporterModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODE,
					args);
			}

			if ((assessmentofImporterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterModelImpl.getOriginalImportercodereference(),
						assessmentofImporterModelImpl.getOriginalNextassessmentid(),
						assessmentofImporterModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);

				args = new Object[] {
						assessmentofImporterModelImpl.getImportercodereference(),
						assessmentofImporterModelImpl.getNextassessmentid(),
						assessmentofImporterModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERCODEREFERENCE,
					args);
			}

			if ((assessmentofImporterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentofImporterModelImpl.getOriginalImportername(),
						assessmentofImporterModelImpl.getOriginalNextassessmentid(),
						assessmentofImporterModelImpl.getOriginalNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME,
					args);

				args = new Object[] {
						assessmentofImporterModelImpl.getImportername(),
						assessmentofImporterModelImpl.getNextassessmentid(),
						assessmentofImporterModelImpl.getNextassessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NEXTPERIODBYIMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEXTPERIODBYIMPORTERNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentofImporterImpl.class,
			assessmentofImporter.getPrimaryKey(), assessmentofImporter);

		return assessmentofImporter;
	}

	protected AssessmentofImporter toUnwrappedModel(
		AssessmentofImporter assessmentofImporter) {
		if (assessmentofImporter instanceof AssessmentofImporterImpl) {
			return assessmentofImporter;
		}

		AssessmentofImporterImpl assessmentofImporterImpl = new AssessmentofImporterImpl();

		assessmentofImporterImpl.setNew(assessmentofImporter.isNew());
		assessmentofImporterImpl.setPrimaryKey(assessmentofImporter.getPrimaryKey());

		assessmentofImporterImpl.setId(assessmentofImporter.getId());
		assessmentofImporterImpl.setImportercode(assessmentofImporter.getImportercode());
		assessmentofImporterImpl.setImportername(assessmentofImporter.getImportername());
		assessmentofImporterImpl.setImporteraddress(assessmentofImporter.getImporteraddress());
		assessmentofImporterImpl.setRepresentative(assessmentofImporter.getRepresentative());
		assessmentofImporterImpl.setEmail(assessmentofImporter.getEmail());
		assessmentofImporterImpl.setPhone(assessmentofImporter.getPhone());
		assessmentofImporterImpl.setFax(assessmentofImporter.getFax());
		assessmentofImporterImpl.setImportercodereference(assessmentofImporter.getImportercodereference());
		assessmentofImporterImpl.setF1Code(assessmentofImporter.getF1Code());
		assessmentofImporterImpl.setF1Name(assessmentofImporter.getF1Name());
		assessmentofImporterImpl.setF1Value(assessmentofImporter.getF1Value());
		assessmentofImporterImpl.setF1Mark(assessmentofImporter.getF1Mark());
		assessmentofImporterImpl.setF2Code(assessmentofImporter.getF2Code());
		assessmentofImporterImpl.setF2Name(assessmentofImporter.getF2Name());
		assessmentofImporterImpl.setF2Value(assessmentofImporter.getF2Value());
		assessmentofImporterImpl.setF2Mark(assessmentofImporter.getF2Mark());
		assessmentofImporterImpl.setF3Code(assessmentofImporter.getF3Code());
		assessmentofImporterImpl.setF3Name(assessmentofImporter.getF3Name());
		assessmentofImporterImpl.setF3Value(assessmentofImporter.getF3Value());
		assessmentofImporterImpl.setF3Mark(assessmentofImporter.getF3Mark());
		assessmentofImporterImpl.setF4Code(assessmentofImporter.getF4Code());
		assessmentofImporterImpl.setF4Name(assessmentofImporter.getF4Name());
		assessmentofImporterImpl.setF4Value(assessmentofImporter.getF4Value());
		assessmentofImporterImpl.setF4Mark(assessmentofImporter.getF4Mark());
		assessmentofImporterImpl.setF5Code(assessmentofImporter.getF5Code());
		assessmentofImporterImpl.setF5Name(assessmentofImporter.getF5Name());
		assessmentofImporterImpl.setF5Value(assessmentofImporter.getF5Value());
		assessmentofImporterImpl.setF5Mark(assessmentofImporter.getF5Mark());
		assessmentofImporterImpl.setF6Code(assessmentofImporter.getF6Code());
		assessmentofImporterImpl.setF6Name(assessmentofImporter.getF6Name());
		assessmentofImporterImpl.setF6Value(assessmentofImporter.getF6Value());
		assessmentofImporterImpl.setF6Mark(assessmentofImporter.getF6Mark());
		assessmentofImporterImpl.setF7Code(assessmentofImporter.getF7Code());
		assessmentofImporterImpl.setF7Name(assessmentofImporter.getF7Name());
		assessmentofImporterImpl.setF7Value(assessmentofImporter.getF7Value());
		assessmentofImporterImpl.setF7Mark(assessmentofImporter.getF7Mark());
		assessmentofImporterImpl.setF8Code(assessmentofImporter.getF8Code());
		assessmentofImporterImpl.setF8Name(assessmentofImporter.getF8Name());
		assessmentofImporterImpl.setF8Value(assessmentofImporter.getF8Value());
		assessmentofImporterImpl.setF8Mark(assessmentofImporter.getF8Mark());
		assessmentofImporterImpl.setF9Code(assessmentofImporter.getF9Code());
		assessmentofImporterImpl.setF9Name(assessmentofImporter.getF9Name());
		assessmentofImporterImpl.setF9Value(assessmentofImporter.getF9Value());
		assessmentofImporterImpl.setF9Mark(assessmentofImporter.getF9Mark());
		assessmentofImporterImpl.setF10Code(assessmentofImporter.getF10Code());
		assessmentofImporterImpl.setF10Name(assessmentofImporter.getF10Name());
		assessmentofImporterImpl.setF10Value(assessmentofImporter.getF10Value());
		assessmentofImporterImpl.setF10Mark(assessmentofImporter.getF10Mark());
		assessmentofImporterImpl.setF11Code(assessmentofImporter.getF11Code());
		assessmentofImporterImpl.setF11Name(assessmentofImporter.getF11Name());
		assessmentofImporterImpl.setF11Value(assessmentofImporter.getF11Value());
		assessmentofImporterImpl.setF11Mark(assessmentofImporter.getF11Mark());
		assessmentofImporterImpl.setF12Code(assessmentofImporter.getF12Code());
		assessmentofImporterImpl.setF12Name(assessmentofImporter.getF12Name());
		assessmentofImporterImpl.setF12Value(assessmentofImporter.getF12Value());
		assessmentofImporterImpl.setF12Mark(assessmentofImporter.getF12Mark());
		assessmentofImporterImpl.setF13Code(assessmentofImporter.getF13Code());
		assessmentofImporterImpl.setF13Name(assessmentofImporter.getF13Name());
		assessmentofImporterImpl.setF13Value(assessmentofImporter.getF13Value());
		assessmentofImporterImpl.setF13Mark(assessmentofImporter.getF13Mark());
		assessmentofImporterImpl.setF14Code(assessmentofImporter.getF14Code());
		assessmentofImporterImpl.setF14Name(assessmentofImporter.getF14Name());
		assessmentofImporterImpl.setF14Value(assessmentofImporter.getF14Value());
		assessmentofImporterImpl.setF14Mark(assessmentofImporter.getF14Mark());
		assessmentofImporterImpl.setF15Code(assessmentofImporter.getF15Code());
		assessmentofImporterImpl.setF15Name(assessmentofImporter.getF15Name());
		assessmentofImporterImpl.setF15Value(assessmentofImporter.getF15Value());
		assessmentofImporterImpl.setF15Mark(assessmentofImporter.getF15Mark());
		assessmentofImporterImpl.setF16Code(assessmentofImporter.getF16Code());
		assessmentofImporterImpl.setF16Name(assessmentofImporter.getF16Name());
		assessmentofImporterImpl.setF16Value(assessmentofImporter.getF16Value());
		assessmentofImporterImpl.setF16Mark(assessmentofImporter.getF16Mark());
		assessmentofImporterImpl.setF17Code(assessmentofImporter.getF17Code());
		assessmentofImporterImpl.setF17Name(assessmentofImporter.getF17Name());
		assessmentofImporterImpl.setF17Value(assessmentofImporter.getF17Value());
		assessmentofImporterImpl.setF17Mark(assessmentofImporter.getF17Mark());
		assessmentofImporterImpl.setF18Code(assessmentofImporter.getF18Code());
		assessmentofImporterImpl.setF18Name(assessmentofImporter.getF18Name());
		assessmentofImporterImpl.setF18Value(assessmentofImporter.getF18Value());
		assessmentofImporterImpl.setF18Mark(assessmentofImporter.getF18Mark());
		assessmentofImporterImpl.setF19Name(assessmentofImporter.getF19Name());
		assessmentofImporterImpl.setF19Code(assessmentofImporter.getF19Code());
		assessmentofImporterImpl.setF19Value(assessmentofImporter.getF19Value());
		assessmentofImporterImpl.setF19Mark(assessmentofImporter.getF19Mark());
		assessmentofImporterImpl.setF20Code(assessmentofImporter.getF20Code());
		assessmentofImporterImpl.setF20Name(assessmentofImporter.getF20Name());
		assessmentofImporterImpl.setF20Value(assessmentofImporter.getF20Value());
		assessmentofImporterImpl.setF20Mark(assessmentofImporter.getF20Mark());
		assessmentofImporterImpl.setF21Code(assessmentofImporter.getF21Code());
		assessmentofImporterImpl.setF21Name(assessmentofImporter.getF21Name());
		assessmentofImporterImpl.setF21Value(assessmentofImporter.getF21Value());
		assessmentofImporterImpl.setF21Mark(assessmentofImporter.getF21Mark());
		assessmentofImporterImpl.setF22Code(assessmentofImporter.getF22Code());
		assessmentofImporterImpl.setF22Name(assessmentofImporter.getF22Name());
		assessmentofImporterImpl.setF22Value(assessmentofImporter.getF22Value());
		assessmentofImporterImpl.setF22Mark(assessmentofImporter.getF22Mark());
		assessmentofImporterImpl.setF23Code(assessmentofImporter.getF23Code());
		assessmentofImporterImpl.setF23Name(assessmentofImporter.getF23Name());
		assessmentofImporterImpl.setF23Value(assessmentofImporter.getF23Value());
		assessmentofImporterImpl.setF23Mark(assessmentofImporter.getF23Mark());
		assessmentofImporterImpl.setSumMark(assessmentofImporter.getSumMark());
		assessmentofImporterImpl.setMaker(assessmentofImporter.getMaker());
		assessmentofImporterImpl.setChecker(assessmentofImporter.getChecker());
		assessmentofImporterImpl.setApprover(assessmentofImporter.getApprover());
		assessmentofImporterImpl.setMakermodified(assessmentofImporter.getMakermodified());
		assessmentofImporterImpl.setCheckermodified(assessmentofImporter.getCheckermodified());
		assessmentofImporterImpl.setApprovermodified(assessmentofImporter.getApprovermodified());
		assessmentofImporterImpl.setAssessmentid(assessmentofImporter.getAssessmentid());
		assessmentofImporterImpl.setAssessmentyear(assessmentofImporter.getAssessmentyear());
		assessmentofImporterImpl.setEvaluationperiod(assessmentofImporter.getEvaluationperiod());
		assessmentofImporterImpl.setLatestassessment(assessmentofImporter.getLatestassessment());
		assessmentofImporterImpl.setSynchdate(assessmentofImporter.getSynchdate());
		assessmentofImporterImpl.setNextassessmentid(assessmentofImporter.getNextassessmentid());
		assessmentofImporterImpl.setNextassessmentyear(assessmentofImporter.getNextassessmentyear());

		return assessmentofImporterImpl;
	}

	/**
	 * Returns the assessmentof importer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof importer
	 * @return the assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssessmentofImporterException, SystemException {
		AssessmentofImporter assessmentofImporter = fetchByPrimaryKey(primaryKey);

		if (assessmentofImporter == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentofImporterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentofImporter;
	}

	/**
	 * Returns the assessmentof importer with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException} if it could not be found.
	 *
	 * @param id the primary key of the assessmentof importer
	 * @return the assessmentof importer
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter findByPrimaryKey(long id)
		throws NoSuchAssessmentofImporterException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessmentof importer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessmentof importer
	 * @return the assessmentof importer, or <code>null</code> if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssessmentofImporter assessmentofImporter = (AssessmentofImporter)EntityCacheUtil.getResult(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentofImporterImpl.class, primaryKey);

		if (assessmentofImporter == _nullAssessmentofImporter) {
			return null;
		}

		if (assessmentofImporter == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentofImporter = (AssessmentofImporter)session.get(AssessmentofImporterImpl.class,
						primaryKey);

				if (assessmentofImporter != null) {
					cacheResult(assessmentofImporter);
				}
				else {
					EntityCacheUtil.putResult(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentofImporterImpl.class, primaryKey,
						_nullAssessmentofImporter);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentofImporterModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentofImporterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentofImporter;
	}

	/**
	 * Returns the assessmentof importer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessmentof importer
	 * @return the assessmentof importer, or <code>null</code> if a assessmentof importer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentofImporter fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessmentof importers.
	 *
	 * @return the assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessmentof importers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @return the range of assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessmentof importers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessmentof importers
	 * @param end the upper bound of the range of assessmentof importers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessmentof importers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentofImporter> findAll(int start, int end,
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

		List<AssessmentofImporter> list = (List<AssessmentofImporter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTOFIMPORTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTOFIMPORTER;

				if (pagination) {
					sql = sql.concat(AssessmentofImporterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentofImporter>(list);
				}
				else {
					list = (List<AssessmentofImporter>)QueryUtil.list(q,
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
	 * Removes all the assessmentof importers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentofImporter assessmentofImporter : findAll()) {
			remove(assessmentofImporter);
		}
	}

	/**
	 * Returns the number of assessmentof importers.
	 *
	 * @return the number of assessmentof importers
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTOFIMPORTER);

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
	 * Initializes the assessmentof importer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentofImporter>> listenersList = new ArrayList<ModelListener<AssessmentofImporter>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentofImporter>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentofImporterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTOFIMPORTER = "SELECT assessmentofImporter FROM AssessmentofImporter assessmentofImporter";
	private static final String _SQL_SELECT_ASSESSMENTOFIMPORTER_WHERE = "SELECT assessmentofImporter FROM AssessmentofImporter assessmentofImporter WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTOFIMPORTER = "SELECT COUNT(assessmentofImporter) FROM AssessmentofImporter assessmentofImporter";
	private static final String _SQL_COUNT_ASSESSMENTOFIMPORTER_WHERE = "SELECT COUNT(assessmentofImporter) FROM AssessmentofImporter assessmentofImporter WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentofImporter.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentofImporter exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentofImporter exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentofImporterPersistenceImpl.class);
	private static AssessmentofImporter _nullAssessmentofImporter = new AssessmentofImporterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentofImporter> toCacheModel() {
				return _nullAssessmentofImporterCacheModel;
			}
		};

	private static CacheModel<AssessmentofImporter> _nullAssessmentofImporterCacheModel =
		new CacheModel<AssessmentofImporter>() {
			@Override
			public AssessmentofImporter toEntityModel() {
				return _nullAssessmentofImporter;
			}
		};
}